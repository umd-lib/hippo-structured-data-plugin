package nl.openweb.structured.data.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hippoecm.hst.site.HstServices;

import nl.openweb.structured.data.processing.StructuredDataProcessor;
import nl.openweb.structured.data.schema.entities.ItemList;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.entities.Thing;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

public class ItemListMapper implements StructuredDataMapper<List> {

    @Override
    public ItemList transform(List list) {
        List<Thing> itemListElement = new ArrayList<>();
        StructuredDataProcessor structuredDataProcessor = HstServices.getComponentManager().getComponent(StructuredDataProcessor.class);
        for (Object item : list) {
            Thing result = transformToThing(structuredDataProcessor, item);
            if (result != null) {
                itemListElement.add(result);
            }
        }
        return new ItemList.Builder().setItemListElementAsThing(itemListElement).build();
    }

    @SuppressWarnings("unchecked")
    private Thing transformToThing(StructuredDataProcessor structuredDataProcessor, Object item) {
        Optional<StructuredDataMapper> mapperFor = structuredDataProcessor.getMapperFor(item);
        Thing result = null;
        if (mapperFor.isPresent()) {
            StructuredData structuredData = mapperFor.get().transform(item);
            if (structuredData instanceof Thing) {
                result = (Thing) structuredData;
            }
        }
        return result;
    }

    @Override
    public Class<List> getType() {
        return List.class;
    }
}
