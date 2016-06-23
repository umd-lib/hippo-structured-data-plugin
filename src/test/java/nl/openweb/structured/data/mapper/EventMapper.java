package nl.openweb.structured.data.mapper;

import org.hippoecm.hst.site.HstServices;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.schema.entities.Event;
import nl.openweb.structured.data.schema.entities.Place;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import nl.openweb.structured.data.utils.StructuredDataUtils;

public class EventMapper implements StructuredDataMapper<EventBean> {
    @Override
    public StructuredData transform(EventBean bean) {
        LocationMapper locationMapper = HstServices.getComponentManager().getComponent(LocationMapper.class);
        return new Event.Builder()
                .setName(bean.getName())
                .setLocation(StructuredDataUtils.getStructuredDataFor(bean.getLocation(), Place.class))
                .setStartDate(bean.getStartDate()).<Event.Builder>setUrl(bean.getUrl()).setEndDate(bean.getEndDate()).build();
    }

    @Override
    public Class<EventBean> getType() {
        return EventBean.class;
    }
}
