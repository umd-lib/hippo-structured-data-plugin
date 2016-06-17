package nl.openweb.structured.data.utils;

import nl.openweb.structured.data.processing.StructuredDataProcessor;

public class ConversionUtils {

    private ConversionUtils() {
    }

    public static String beanToJson(Object bean, String mapperId) {
        StructuredDataProcessor processor = StructuredDataProcessor.get();
        return processor.getStructuredDataAsJsonString(bean, mapperId);
    }


}

