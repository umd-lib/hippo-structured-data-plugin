package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Calendar;
import java.util.Date;

public class Event extends Thing {
    private Calendar startDate;
    private Calendar endDate;
    private Place location;
    private PostalAddress locationAsPostalAddress;
    private String locationAsString;

    Event(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.location = builder.location;
        this.startDate = builder.startDate;
        this.locationAsPostalAddress = builder.locationAsPostalAddress;
        this.locationAsString = builder.locationAsString;
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
        private Calendar startDate;
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

        public Builder setStartDate(Calendar startDate) {
            this.startDate = startDate;
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

        @Override
        public Event build() {
            return new Event(this);
        }
    }
}