package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

import nl.openweb.structured.data.schema.mapping.beans.StructuredData;

public class PostalAddress implements StructuredData {
    private static final String TYPE = "PostalAddress";

    private String postalCode, streetAddress, addressCountry, locality;

    public PostalAddress(Builder builder) {
        this.postalCode = builder.postalCode;
        this.streetAddress = builder.streetAddress;
        this.addressCountry = builder.addressCountry;
        this.locality = builder.locality;
    }

    @JsonProperty("@context")
    public String getContext() {
        return CONTEXT;
    }

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("streetAddress")
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("addressCountry")
    public String getAddressCountry() {
        return addressCountry;
    }

    public static class Builder {
        private String postalCode, streetAddress, addressCountry, locality;

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder addressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        public Builder locality(String locality){
            this.locality = locality;
            return this;
        }

        public PostalAddress build() {
            return new PostalAddress(this);
        }
    }
}
