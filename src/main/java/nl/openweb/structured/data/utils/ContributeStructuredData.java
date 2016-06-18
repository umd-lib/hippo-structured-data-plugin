package nl.openweb.structured.data.utils;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

import org.hippoecm.hst.core.component.HstRequest;


import static nl.openweb.structured.data.tag.StructuredDataPlaceholderTag.STRUCTURED_DATA_AS_JSON;

public class ContributeStructuredData {

    private ContributeStructuredData() {
        // private constructor
    }

    public static void contributeBean(Object bean, HstRequest request) {
        contributeBean(bean, null, request);
    }

    public static void contributeBean(Object bean, String mapperId, ServletRequest request) {
        contributeJson(ConversionUtils.beanToJson(bean, mapperId), request);
    }

    public static void contributeJson(String json, ServletRequest servletRequest) {
        ServletRequest request = servletRequest instanceof HstRequest ? ((HstRequest) servletRequest).getRequestContext().getServletRequest() : servletRequest;
        Object attribute = request.getAttribute(STRUCTURED_DATA_AS_JSON);
        if (attribute instanceof List) {
            ((List) attribute).add(json);
        } else {
            List<String> list = new ArrayList<>();
            list.add(json);
            request.setAttribute(STRUCTURED_DATA_AS_JSON, list);
        }
    }


}
