package nl.openweb.structured.data.mapper;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import nl.openweb.structured.data.schema.mapping.beans.Event;
import nl.openweb.structured.data.schema.mapping.beans.StructuredData;

public class EventMapper implements StructuredDataMapper<EventBean> {
    @Override
    public StructuredData transform(EventBean bean) {
        return new Event.Builder(bean.getName(), bean.getUrl()).startDate(bean.getStartDate()).location(bean.getLocation()).build();
    }

    @Override
    public Class<EventBean> getType() {
        return EventBean.class;
    }
}
