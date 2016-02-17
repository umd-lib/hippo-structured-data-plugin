package nl.openweb.structured.data.processing;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.domain.TrainingEventBean;
import nl.openweb.structured.data.domain.UnknownBean;
import nl.openweb.structured.data.schema.entities.AbstractEntityTest;
import nl.openweb.structured.data.utils.VerificationUtils;
import org.codehaus.jackson.JsonNode;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

public class StructuredDataProcessorTest extends AbstractEntityTest {

    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataProcessorTest.class);

    @Test
    public void smockTest() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 10, 14, 43);

        EventBean bean = new EventBean("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        VerificationUtils.verifyEventFields(bean, jsonNode, dateFormat);
    }

    @Test
    public void inheritanceTest() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 4, 18, 45);

        TrainingEventBean bean = new TrainingEventBean("Stream API", "http://openweb.nl/pizza-night/steaming-api", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        VerificationUtils.verifyEventFields(bean, jsonNode, dateFormat);
    }

    @Test
    public void unknownBeanTest() {
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(new UnknownBean());
        Assert.assertEquals("", jsonString);
    }


}