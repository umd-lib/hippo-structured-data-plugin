package nl.openweb.structured.data.mapper;

import com.google.common.base.Optional;
import nl.openweb.structured.data.processing.StructuredDataProcessor;
import nl.openweb.structured.data.schema.entities.ItemList;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.entities.Thing;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import org.hippoecm.hst.site.HstServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ebrahim on 2/15/2016.
 */
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
