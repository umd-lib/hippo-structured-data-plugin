package nl.openweb.structured.data.processing;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.mock.MockComponentManager;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.hippoecm.hst.site.HstServices;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class StructuredDataProcessorTest {


    private ObjectMapper objectMapper;
    private DateFormat dateFormat;

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
    }

    @Test
    public void test() throws IOException {
        StructuredDataProcessor structuredDataProcessor = new StructuredDataProcessor();
        structuredDataProcessor.init();
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 10, 14, 43);

        EventBean bean = new EventBean("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);

        System.out.println(prettyPrint(jsonNode));

        verifyEventFeilds(bean, jsonNode);

        JsonNode location = jsonNode.get("location");

        Assert.assertEquals("http://schema.org", getStringProperty(location, "@context"));
        Assert.assertEquals("Place", getStringProperty(location, "@type"));
        Assert.assertEquals(bean.getLocation().getName(), getStringProperty(location, "name"));
        Assert.assertEquals(bean.getLocation().getAddress(), getStringProperty(location, "address"));

    }

    private void verifyEventFeilds(EventBean bean, JsonNode jsonNode) {
        Assert.assertEquals("http://schema.org", getStringProperty(jsonNode, "@context"));
        Assert.assertEquals("Event", getStringProperty(jsonNode, "@type"));
        Assert.assertEquals(bean.getName(), getStringProperty(jsonNode, "name"));
        Assert.assertEquals(bean.getUrl(), getStringProperty(jsonNode, "url"));
        Assert.assertEquals(dateFormat.format(bean.getStartDate().getTime()), getStringProperty(jsonNode, "startDate"));
        if (bean.getEndDate() != null) {
            Assert.assertEquals(dateFormat.format(bean.getEndDate().getTime()), getStringProperty(jsonNode, "endDate"));
        }
    }

    private String getStringProperty(JsonNode jsonNode, String propertyName) {
        return jsonNode.get(propertyName).asText();
    }

    private String prettyPrint(JsonNode jsonNode) throws IOException {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
    }

}