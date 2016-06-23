package nl.openweb.structured.data.utils;

import com.google.common.base.Optional;

import org.apache.commons.lang.StringUtils;

import nl.openweb.structured.data.processing.StructuredDataProcessor;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

public class StructuredDataUtils {

    private StructuredDataUtils() {
        // private constructor
    }


    public static <T, H extends StructuredData> H getStructuredDataFor(T bean, Class<H> clazz) {
        return getStructuredDataUsingMapperByNameFor(null, bean, clazz);
    }


    @SuppressWarnings("unchecked")
    public static <T, H extends StructuredData> H getStructuredDataUsingMapperByNameFor(String name, T bean, Class<H> clazz) {
        H result = null;
        Optional<StructuredDataMapper> mapper = StringUtils.isNotBlank(name) ? StructuredDataProcessor.get().getMapperByName(name)
                : StructuredDataProcessor.get().getMapperFor(bean);
        if (mapper.isPresent() && bean != null) {
            StructuredData structuredData = mapper.get().transform(bean);
            if (structuredData != null && structuredData.getClass().isAssignableFrom(clazz)) {
                result = (H) structuredData;
            }
        }
        return result;
    }


}
