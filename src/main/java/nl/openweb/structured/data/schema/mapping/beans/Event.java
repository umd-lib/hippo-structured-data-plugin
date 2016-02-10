package nl.openweb.structured.data.schema.mapping.beans;

import java.util.Calendar;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

import nl.openweb.structured.data.schema.entities.Place;

public class Event implements StructuredData {
    private final String TYPE = "Event";
    private String name, url;
    private Calendar startDate;
    private Place location;

    public Event(Event.Builder builder) {
        this.name = builder.name;
        this.url = builder.url;
        this.startDate = builder.startDate;
        this.location = builder.location;
    }

    @JsonProperty("@context")
    public String getContext() {
        return CONTEXT;
    }

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate.getTime();
    }

    @JsonProperty("location")
    public Place getLocation() {
        return location;
    }

    public static class Builder {
        private String name, url;
        private Calendar startDate;
        private Place location;

        public Builder(String name, Place location) {
            this.name = name;
            this.location = location;
        }

        public Builder url(String url) {
            this.url = url;
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
