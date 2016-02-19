package nl.openweb.structured.data.mapper;

import java.util.ArrayList;
import java.util.List;

import nl.openweb.structured.data.domain.BreadcrumbItem;
import nl.openweb.structured.data.schema.entities.BreadcrumbList;
import nl.openweb.structured.data.schema.entities.ListItem;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.entities.Thing;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

public class BreadCrumbListMapper implements StructuredDataMapper<List<BreadcrumbItem>> {
    @Override
    public StructuredData transform(List<BreadcrumbItem> bean) {
        List<ListItem> breadcrumbItems = new ArrayList<>();
        for (int i = 0; i < bean.size(); i++) {
            BreadcrumbItem breadcrumbItem = bean.get(i);
            String url = breadcrumbItem.getUrl();

            ListItem listItem = new ListItem.Builder()
                    .setPosition(i + 1)
                    .setItem(new Thing.Builder()
                            .setName(breadcrumbItem.getName())
                            .setId(url)
                            .build())
                    .build();

            breadcrumbItems.add(listItem);
        }
        BreadcrumbList breadcrumbList = new BreadcrumbList.Builder()
                .setItemListElement(breadcrumbItems).build();
        return breadcrumbList;
    }

    @Override
    public Class<List<BreadcrumbItem>> getType() {
        return null;
    }
}