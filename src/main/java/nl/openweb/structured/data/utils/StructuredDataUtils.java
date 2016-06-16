package nl.openweb.structured.data.utils;

import com.google.common.base.Optional;

import nl.openweb.structured.data.processing.StructuredDataProcessor;
import nl.openweb.structured.data.schema.entities.StructuredData;
import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;

public class StructuredDataUtils {
    public static final <T, H extends StructuredData> Optional<H> getStructuredDataFor(T bean, Class<H> clazz){
        Optional<H> result = Optional.absent();
        Optional<? extends StructuredData> data = getStructuredDataFor(bean);
        if(data.isPresent() && clazz.isAssignableFrom(data.get().getClass())){
            result = (Optional<H>) data;
        }
        return result;
    }

    public static final <T> Optional<? extends StructuredData> getStructuredDataFor(T bean){
        Optional<StructuredData> result = Optional.absent();
        Optional<StructuredDataMapper> mapper = StructuredDataProcessor.get().getMapperFor(bean);
        if(mapper.isPresent()){
            result = Optional.of(mapper.get().transform(bean));
        }
        return result;
    }

    public static final <T, H extends StructuredData> Optional<H> getStructuredDataUsingMapperByNameFor(String name, T bean, Class<H> clazz){
        Optional<H> result = Optional.absent();
        Optional<? extends StructuredData> data = getStructuredDataUsingMapperByNameFor(name, bean);
        if(data.isPresent() && clazz.isAssignableFrom(data.get().getClass())){
            result = (Optional<H>) data;
        }
        return result;
    }

    public static final <T> Optional<? extends StructuredData> getStructuredDataUsingMapperByNameFor(String name, T bean){
        Optional<StructuredData> result = Optional.absent();
        Optional<StructuredDataMapper> mapper = StructuredDataProcessor.get().getMapperByName(name);
        if(mapper.isPresent()){
            result = Optional.of(mapper.get().transform(bean));
        }
        return result;
    }
}
