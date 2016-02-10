package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

import nl.openweb.structured.data.schema.mapping.beans.StructuredData;

public class Place implements StructuredData{
    private static final String TYPE = "Place";
    private PostalAddress address;
    private String name;

    private Place(Builder builder) {
        this.address = builder.address;
        this.name = builder.name;
    }

    @JsonProperty("address")
    public PostalAddress getAddress() {
        return address;
    }

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public static class Builder {
        private PostalAddress address;
        private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Builder address(PostalAddress address) {
            this.address = address;
            return this;
        }

        public Place build() {
            return new Place(this);
        }
    }
}
