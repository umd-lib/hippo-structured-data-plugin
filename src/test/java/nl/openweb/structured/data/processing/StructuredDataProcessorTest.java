package nl.openweb.structured.data.processing;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.mock.MockComponentManager;
import org.hippoecm.hst.site.HstServices;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class StructuredDataProcessorTest {


    @Before
    public void init() {
        if (HstServices.getComponentManager() == null) {
            synchronized (HstServices.class) {
                if (HstServices.getComponentManager() == null) {
                    ClassPathXmlApplicationContext testContext = new ClassPathXmlApplicationContext("test-context.xml",
                            "\\META-INF\\hst-assembly\\addon\\structureddataaddon\\spring-config.xml");
                    HstServices.setComponentManager(new MockComponentManager(testContext));
                }
            }
        }
    }

    @Test
    public void test() {
        StructuredDataProcessor structuredDataProcessor = new StructuredDataProcessor();
        structuredDataProcessor.init();
        EventBean bean = new EventBean("name", "url", null, Calendar.getInstance());
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);
        System.out.println(jsonString);
    }

}