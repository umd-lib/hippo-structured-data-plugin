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
        public Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            super.setDescription(description);
            return this;
        }

        @Override
        public Builder setImage(String image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Event build() {
            return new Event(this);
        }
    }
}