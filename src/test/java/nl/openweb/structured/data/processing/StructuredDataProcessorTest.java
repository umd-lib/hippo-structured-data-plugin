package nl.openweb.structured.data.processing;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.schema.entities.AbstractEntityTest;
import nl.openweb.structured.data.utils.VerificationUtils;
import org.codehaus.jackson.JsonNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

public class StructuredDataProcessorTest extends AbstractEntityTest {

    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataProcessorTest.class);

    @Test
    public void test() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 10, 14, 43);

        EventBean bean = new EventBean("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null);
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(bean);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        VerificationUtils.verifyEventFields(bean, jsonNode, dateFormat);
    }


}