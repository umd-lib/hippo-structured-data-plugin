package nl.openweb.structured.data.schema.mapping.beans;

import nl.openweb.structured.data.schema.entities.Place;

import javax.xml.bind.annotation.*;
import java.util.Calendar;

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.NONE)
public class Event implements StructuredData {
    private final String context = "http://schema.org";
    private final String type = "Event";

    private Event(Event.Builder builder) {
        this.name = builder.name;
        this.url = builder.url;
        this.startDate = builder.startDate;
        this.location = builder.location;
    }

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

    @XmlElement(name = "startDate")
    public Calendar getStartDate() {
        return startDate;
    }

    @XmlElement(name = "location")
    public Place getLocation() {
        return location;
    }

    public static class Builder {
        private String name, url;
        private Calendar startDate;
        private Place location;

        public Builder(String name, String url) {
            this.name = name;
            this.url = url;
        }

        public Builder location(Place location) {
            this.location = location;
            return this;
        }

        public Builder startDate(Calendar startDate) {
            this.startDate = startDate;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }

}
