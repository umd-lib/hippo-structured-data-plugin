package nl.openweb.processing;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.google.common.base.Optional;

import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.site.HstServices;

import nl.openweb.schema.mapping.StructuredDataMapper;
import nl.openweb.schema.mapping.beans.StructuredData;

public class StructuredDataProcessor {

    private Map<Class<? extends HippoBean>, Optional<StructuredDataMapper<? extends HippoBean>>> dataMapperMap;


    public void init() {
        dataMapperMap = new ConcurrentHashMap<>();
        Map<String, StructuredDataMapper> dataMappers = HstServices.getComponentManager().getComponentsOfType(StructuredDataMapper.class);
        for (StructuredDataMapper structuredDataMapper : dataMappers.values()) {
            dataMapperMap.put(structuredDataMapper.getType(), Optional.<StructuredDataMapper<? extends HippoBean>>fromNullable(structuredDataMapper));
        }
    }

    public <T extends HippoBean> String getStructuredDataAsJsonString(T bean){
        String result = StringUtils.EMPTY;
        Optional<StructuredDataMapper<? extends HippoBean>> optional = getOptionalMapperFor(bean);

        if(optional.isPresent()){
            StructuredDataMapper<HippoBean> mapper = optional.get();
            StructuredData data = mapper.transform(bean);
        }

        return result;
    }

    public Optional<StructuredDataMapper<? extends HippoBean>> getOptionalMapperFor(HippoBean bean) {
        Optional<StructuredDataMapper<? extends HippoBean>> mapper;
        Class<? extends HippoBean> beanClass = bean.getClass();
        if (dataMapperMap.containsKey(beanClass)) {
            mapper = dataMapperMap.get(beanClass);
        } else {
            mapper = findInheritedMapper(beanClass);
        }
        return mapper;
    }

    private Optional<StructuredDataMapper<? extends HippoBean>> findInheritedMapper(Class beanClass) {
        Optional<StructuredDataMapper<? extends HippoBean>> result = Optional.absent();
        for (Optional<StructuredDataMapper<? extends HippoBean>> structuredDataMapper : dataMapperMap.values()) {
            if (structuredDataMapper.isPresent() && structuredDataMapper.get().getType().isAssignableFrom(beanClass)) {
                result = structuredDataMapper;
                break;
            }
        }
        dataMapperMap.put(beanClass, result);
        return result;
    }
}
