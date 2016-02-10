package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Calendar;
import java.util.Date;

public class Event extends Thing {
    private String type = "Event";
    private String name, url;
    private Calendar startDate;
    private Calendar endDate;
    private Place location;
    private PostalAddress locationAsPostalAddress;
    private String locationAsString;

    Event(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.location = builder.location;
        this.name = builder.name;
        this.startDate = builder.startDate;
        this.url = builder.url;
        this.locationAsPostalAddress = builder.locationAsPostalAddress;
        this.locationAsString = builder.locationAsString;
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

    @JsonProperty("endDate")
    public Calendar getEndDate() {
        return endDate;
    }

    @JsonProperty("location")
    public Object getLocation() {
        Object result = this.location;
        if (result == null) {
            result = locationAsPostalAddress;
        }
        if (result == null) {
            result = locationAsString;
        }
        return result;
    }

    public static class Builder extends Thing.Builder {
        private Calendar endDate;
        private Place location;
        private String name;
        private Calendar startDate;
        private String url;
        private PostalAddress locationAsPostalAddress;
        private String locationAsString;

        public Builder setEndDate(Calendar endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setLocation(Place location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStartDate(Calendar startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setLocation(PostalAddress locationAsPostalAddress) {
            this.locationAsPostalAddress = locationAsPostalAddress;
            return this;
        }

        public Builder setLocation(String locationAsString) {
            this.locationAsString = locationAsString;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }
}