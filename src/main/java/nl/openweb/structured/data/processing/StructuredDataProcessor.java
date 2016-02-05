package nl.openweb.structured.data.processing;

import com.google.common.base.Optional;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import nl.openweb.structured.data.schema.mapping.beans.StructuredData;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.hippoecm.hst.site.HstServices;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StructuredDataProcessor {

    private Map<Class, Optional<StructuredDataMapper>> dataMapperMap;
    private ObjectMapper objectMapper = new ObjectMapper();


    public void init() {
        dataMapperMap = new ConcurrentHashMap<>();
        Map<String, StructuredDataMapper> dataMappers = HstServices.getComponentManager().getComponentsOfType(StructuredDataMapper.class);
        for (StructuredDataMapper structuredDataMapper : dataMappers.values()) {
            dataMapperMap.put(structuredDataMapper.getType(), Optional.of(structuredDataMapper));
        }
    }

    public String getStructuredDataAsJsonString(Object bean) {
        String result = StringUtils.EMPTY;
        Optional<StructuredDataMapper> optional = getOptionalMapperFor(bean);
        if (optional.isPresent()) {
            result = generateJson(bean, optional.get());
        }
        return result;
    }

    private String generateJson(Object bean, StructuredDataMapper structuredDataMapper) {
        String result;
        try {
            try (StringWriter writer = new StringWriter()) {
                StructuredData data = structuredDataMapper.transform(bean);
                objectMapper.writeValue(writer, data);
                result = writer.toString();
            }
        } catch (IOException e) {
            // Never going to happen
            throw new RuntimeException(e.getMessage(), e);
        }
        return result;
    }

    public Optional<StructuredDataMapper> getOptionalMapperFor(Object bean) {
        Optional<StructuredDataMapper> mapper;
        Class beanClass = bean.getClass();
        if (dataMapperMap.containsKey(beanClass)) {
            mapper = dataMapperMap.get(beanClass);
        } else {
            mapper = findInheritedMapper(beanClass);
        }
        return mapper;
    }

    private Optional<StructuredDataMapper> findInheritedMapper(Class beanClass) {
        Optional<StructuredDataMapper> result = Optional.absent();
        for (Optional<StructuredDataMapper> structuredDataMapper : dataMapperMap.values()) {
            if (structuredDataMapper.isPresent() && structuredDataMapper.get().getType().isAssignableFrom(beanClass)) {
                result = structuredDataMapper;
                break;
            }
        }
        dataMapperMap.put(beanClass, result);
        return result;
    }
}
