package nl.openweb.structured.data.schema.mapping;

import nl.openweb.structured.data.schema.mapping.beans.StructuredData;

public interface StructuredDataMapper {

    StructuredData transform(Object bean);

    Class<?> getType();

}
