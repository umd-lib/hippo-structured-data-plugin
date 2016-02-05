package nl.openweb.schema.mapping.beans;

import javax.xml.bind.annotation.*;
import java.util.Calendar;

import nl.openweb.schema.entities.Place;

@XmlRootElement(name="event")
@XmlAccessorType(XmlAccessType.NONE)
public class Event implements StructuredData {
    private final String context = "http://schema.org";
    private final String type = "Event";

    private String name, url;
    private Calendar startDate;
    private Place location;

    @XmlAttribute(name = "@context")
    public String getContext() {
        return context;
    }

    @XmlAttribute(name = "@type")
    public String getType() {
        return type;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "url")
    public String getUrl() {
        return url;
    }

    @XmlElement(name="startDate")
    public Calendar getStartDate() {
        return startDate;
    }

    @XmlElement(name="location")
    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }
}
