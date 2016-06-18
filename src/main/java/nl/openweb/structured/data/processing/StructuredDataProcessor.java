package nl.openweb.structured.data.processing;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.site.HstServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

@SuppressWarnings("unchecked")
public class StructuredDataProcessor {

    private Map<Class, Optional<StructuredDataMapper>> dataMapperMap;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataProcessor.class);

    public void init() {
        // configuring objectMapper to ignore null properties
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        objectMapper.setDateFormat(df);

        dataMapperMap = new ConcurrentHashMap<>();
        Map<String, StructuredDataMapper> dataMappers = HstServices.getComponentManager().getComponentsOfType(StructuredDataMapper.class);

        for (StructuredDataMapper structuredDataMapper : dataMappers.values()) {
            Class type = structuredDataMapper.getType();
            if (type != null) {
                dataMapperMap.put(type, Optional.of(structuredDataMapper));
            }
        }
    }

    public <T> String getStructuredDataAsJsonString(T bean) {
        return getStructuredDataAsJsonString(bean, null);
    }

    public <T> String getStructuredDataAsJsonString(T bean, String mapperName) {
        String result = StringUtils.EMPTY;
        Optional<StructuredDataMapper> optional = mapperName == null ? getMapperFor(bean) : getMapperByName(mapperName);
        if (optional.isPresent()) {
            result = generateJson(bean, optional.get());
        }
        return result;
    }

    private <T> String generateJson(T bean, StructuredDataMapper structuredDataMapper) {
        String result = StringUtils.EMPTY;
        try {
            try (StringWriter writer = new StringWriter()) {
                StructuredData data = structuredDataMapper.transform(bean);
                if (data != null) {
                    objectMapper.writeValue(writer, data);
                    result = writer.toString();
                }
            }
        } catch (IOException e) {
            // Never going to happen
            throw new RuntimeException(e.getMessage(), e);
        }
        return result;
    }

    public Optional<StructuredDataMapper> getMapperFor(Object bean) {
        Optional<StructuredDataMapper> mapper;
        Class beanClass = bean.getClass();
        if (dataMapperMap.containsKey(beanClass)) {
            mapper = dataMapperMap.get(beanClass);
        } else {
            mapper = findInheritedMapper(beanClass);
        }
        return mapper;
    }

    public Optional<StructuredDataMapper> getMapperByName(String mapperName) {
        Optional<StructuredDataMapper> result;
        StructuredDataMapper mapper = HstServices.getComponentManager().getComponent(mapperName);
        if (mapper != null) {
            result = Optional.of(mapper);
        } else {
            LOG.error("Unknown name [{}] for mapper, check your configuration.", mapperName);
            result = Optional.empty();
        }
        return result;
    }

    private Optional<StructuredDataMapper> findInheritedMapper(Class beanClass) {
        Optional<StructuredDataMapper> result = dataMapperMap.values().stream()
                .filter(Optional::isPresent).map(Optional::get)
                .filter(mapper -> mapper.getType().isAssignableFrom(beanClass))
                .findFirst();

        dataMapperMap.put(beanClass, result);
        return result;
    }

    public static StructuredDataProcessor get() {
        return HstServices.getComponentManager().getComponent("structuredDataProcessor", "nl.openweb.structured.data");
    }
}
