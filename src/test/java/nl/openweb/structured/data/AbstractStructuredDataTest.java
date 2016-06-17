package nl.openweb.structured.data;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.hippoecm.hst.site.HstServices;
import org.junit.Before;
import org.mockito.Mockito;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nl.openweb.structured.data.mock.MockComponentManager;
import nl.openweb.structured.data.mock.MockRequest;
import nl.openweb.structured.data.processing.StructuredDataProcessor;

public abstract class AbstractStructuredDataTest {

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

    protected HstRequest createMockHstRequest() {
        HstRequest hstRequest = Mockito.mock(HstRequest.class);
        HstRequestContext requestContext = Mockito.mock(HstRequestContext.class);
        Mockito.when(hstRequest.getRequestContext()).thenReturn(requestContext);
        Mockito.when(requestContext.getServletRequest()).thenReturn(new MockRequest());
        return hstRequest;
    }

}
