package nl.openweb.structured.data.mapper;

import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.schema.entities.Place;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

public class LocationMapper implements StructuredDataMapper<LocationBean> {

    @Override
    public Place transform(LocationBean bean) {
        return new Place.Builder().setName(bean.getName()).setAddress(bean.getAddress()).build();
    }

    @Override
    public Class<LocationBean> getType() {
        return LocationBean.class;
    }
}
