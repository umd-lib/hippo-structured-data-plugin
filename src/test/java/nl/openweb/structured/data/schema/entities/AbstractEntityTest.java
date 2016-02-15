package nl.openweb.structured.data.schema.entities;


import nl.openweb.structured.data.mock.MockComponentManager;
import nl.openweb.structured.data.processing.StructuredDataProcessor;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.hippoecm.hst.site.HstServices;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class AbstractEntityTest {

    protected StructuredDataProcessor structuredDataProcessor = new StructuredDataProcessor();
    protected ObjectMapper objectMapper;
    protected DateFormat dateFormat;

    @Before
    public void init() {
        objectMapper = new ObjectMapper();

        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        objectMapper.setDateFormat(dateFormat);

        if (HstServices.getComponentManager() == null) {
            synchronized (HstServices.class) {
                if (HstServices.getComponentManager() == null) {
                    ClassPathXmlApplicationContext testContext = new ClassPathXmlApplicationContext("test-context.xml",
                            "\\META-INF\\hst-assembly\\addon\\structureddataaddon\\spring-config.xml");
                    HstServices.setComponentManager(new MockComponentManager(testContext));
                }
            }
        }
        structuredDataProcessor.init();
    }

    protected String prettyPrint(JsonNode jsonNode) throws IOException {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
    }

}
