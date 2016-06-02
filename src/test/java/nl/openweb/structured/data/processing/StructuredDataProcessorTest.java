package nl.openweb.structured.data.processing;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.JsonNode;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.domain.TrainingEventBean;
import nl.openweb.structured.data.domain.UnknownBean;
import nl.openweb.structured.data.utils.VerificationUtils;

public class StructuredDataProcessorTest extends AbstractStructuredDataTest {

    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataProcessorTest.class);

    @Test
    public void smokeTest() throws IOException {
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

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void unknownMapperTest(){
        structuredDataProcessor.getMapperByName("unknown");
    }


}