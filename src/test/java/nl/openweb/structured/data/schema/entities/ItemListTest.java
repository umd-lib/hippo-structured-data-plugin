package nl.openweb.structured.data.schema.entities;

import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.utils.VerificationUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class ItemListTest extends AbstractEntityTest {

    private static final Logger LOG = LoggerFactory.getLogger(ItemListTest.class);

    @Test
    public void eventListTest() throws IOException {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(2016, Calendar.FEBRUARY, 10, 14, 43);


        List<EventBean> list = Arrays.asList(
                new EventBean("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null),
                new EventBean("Team building", "http://openweb.nl/team-building", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), startDate, null)
        );
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(list);

        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));


        ArrayNode itemListElement = (ArrayNode) jsonNode.get("itemListElement");

        for (int i = 0; i < list.size(); i++) {
            VerificationUtils.verifyEventFields(list.get(i), itemListElement.get(i), dateFormat);
        }

    }

}