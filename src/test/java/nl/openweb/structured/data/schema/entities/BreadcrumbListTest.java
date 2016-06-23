package nl.openweb.structured.data.schema.entities;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.domain.BreadcrumbItem;
import nl.openweb.structured.data.utils.VerificationUtils;


import static org.junit.Assert.assertTrue;

public class BreadcrumbListTest extends AbstractStructuredDataTest {
    private static final String BREADCRUMBLIST_MAPPER_NAME = "breadcrumbList";
    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbListTest.class);

    @Test
    public void testBreadcrumbList() throws IOException{
        List<BreadcrumbItem> breadcrumbs = Arrays.asList(
            new BreadcrumbItem("Main", "http://website.address"),
                new BreadcrumbItem("News", "http://website.address/news"),
                new BreadcrumbItem("Local", "http://website.address/news/locally"),
                new BreadcrumbItem("NewsLacksHere", "http://website.address/news/locally/nonewshere")
        );

        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(breadcrumbs, BREADCRUMBLIST_MAPPER_NAME);
        JsonNode jsonNode = objectMapper.readValue(jsonString, JsonNode.class);
        LOG.debug("\n" + prettyPrint(jsonNode));

        ArrayNode itemListElement = (ArrayNode) jsonNode.get("itemListElement");


        for (int i = 0; i < breadcrumbs.size(); i++) {
            LOG.debug("checking {}", i);
            VerificationUtils.verifyBreadcrumbFields(breadcrumbs.get(i), itemListElement.get(i), i + 1);
        }

    }

    @Test
    public void testEmptyList(){
        List<BreadcrumbItem> breadcrumbs = ListUtils.EMPTY_LIST;
        String jsonString = structuredDataProcessor.getStructuredDataAsJsonString(breadcrumbs, BREADCRUMBLIST_MAPPER_NAME);
        assertTrue(jsonString.isEmpty());
    }
}
