package nl.openweb.structured.data.mapper;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.schema.entities.Event;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import org.hippoecm.hst.site.HstServices;

public class EventMapper implements StructuredDataMapper<EventBean> {
    @Override
    public StructuredData transform(EventBean bean) {
        LocationMapper locationMapper = HstServices.getComponentManager().getComponent(LocationMapper.class);
        return new Event.Builder().setName(bean.getName()).setLocation(locationMapper.transform(bean.getLocation()))
                .setStartDate(bean.getStartDate()).<Event.Builder>setUrl(bean.getUrl()).setEndDate(bean.getEndDate()).build();
    }

    @Override
    public Class<EventBean> getType() {
        return EventBean.class;
    }
}
