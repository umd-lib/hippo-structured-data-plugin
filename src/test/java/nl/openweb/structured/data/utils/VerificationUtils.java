package nl.openweb.structured.data.utils;

import nl.openweb.structured.data.domain.BreadcrumbItem;
import nl.openweb.structured.data.domain.EventBean;
import org.codehaus.jackson.JsonNode;
import org.junit.Assert;

import java.text.DateFormat;

public class VerificationUtils {

    private VerificationUtils() {
    }

    public static void verifyEventFields(EventBean bean, JsonNode jsonNode, DateFormat dateFormat) {
        Assert.assertEquals("http://schema.org", getProperty(jsonNode, "@context"));
        Assert.assertEquals("Event", getProperty(jsonNode, "@type"));
        Assert.assertEquals(bean.getName(), getProperty(jsonNode, "name"));
        Assert.assertEquals(bean.getUrl(), getProperty(jsonNode, "url"));
        Assert.assertEquals(dateFormat.format(bean.getStartDate().getTime()), getProperty(jsonNode, "startDate"));
        if (bean.getEndDate() != null) {
            Assert.assertEquals(dateFormat.format(bean.getEndDate().getTime()), getProperty(jsonNode, "endDate"));
        }

        JsonNode location = jsonNode.get("location");

        Assert.assertEquals("http://schema.org", getProperty(location, "@context"));
        Assert.assertEquals("Place", getProperty(location, "@type"));
        Assert.assertEquals(bean.getLocation().getName(), getProperty(location, "name"));
        Assert.assertEquals(bean.getLocation().getAddress(), getProperty(location, "address"));
    }

    public static void verifyBreadcrumbFields(BreadcrumbItem bean, JsonNode jsonNode, int position) {
        Assert.assertEquals("ListItem", getProperty(jsonNode, "@type"));
        Assert.assertEquals(position, jsonNode.get("position").asInt());
        JsonNode item = jsonNode.get("item");
        Assert.assertEquals(bean.getName(), getProperty(item, "name"));
        Assert.assertEquals(bean.getUrl(), getProperty(item, "@id"));
    }

    private static String getProperty(JsonNode jsonNode, String propertyName) {
        return jsonNode.get(propertyName) == null ? "NULL" : jsonNode.get(propertyName).asText();
    }
}
