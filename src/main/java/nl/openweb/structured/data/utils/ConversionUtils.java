package nl.openweb.structured.data.utils;

import org.hippoecm.hst.site.HstServices;

import nl.openweb.structured.data.processing.StructuredDataProcessor;

public class ConversionUtils {

    private ConversionUtils() {
    }

    public static String beanToJson(Object bean, String mapperId) {
        StructuredDataProcessor processor = HstServices.getComponentManager().getComponent("structuredDataProcessor", "nl.openweb.structured.data");
        return processor.getStructuredDataAsJsonString(bean, mapperId);
    }


}

