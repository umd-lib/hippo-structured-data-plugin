package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

public class Place extends Thing {
    private PostalAddress address;
    private String addressAsString;
    private String name;

    Place(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.name = builder.name;
        this.addressAsString = builder.addressAsString;
    }

    @JsonProperty("address")
    public Object getAddress() {
        Object result = this.address;
        if (result == null) {
            result = this.addressAsString;
        }
        return result;
    }


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public static class Builder extends Thing.Builder {
        private PostalAddress address;
        private String addressAsString;
        private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setAddress(PostalAddress address) {
            this.address = address;
            return this;
        }
        public Builder setAddress(String address) {
            this.addressAsString = address;
            return this;
        }

        public Place build() {
            return new Place(this);
        }
    }
}
