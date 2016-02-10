package nl.openweb.structured.data.schema.mapping;

import nl.openweb.structured.data.schema.entities.StructuredData;

public interface StructuredDataMapper<T> {

    StructuredData transform(T bean);

    Class<T> getType();

}
