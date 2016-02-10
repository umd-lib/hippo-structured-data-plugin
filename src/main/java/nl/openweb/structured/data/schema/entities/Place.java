package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

public class Place extends Thing {
    private PostalAddress address;
    private String addressAsString;

    Place(Builder builder) {
        super(builder);
        this.address = builder.address;
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

    public static class Builder extends Thing.Builder {
        private PostalAddress address;
        private String addressAsString;


        public Builder setAddress(PostalAddress address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(String address) {
            this.addressAsString = address;
            return this;
        }

        @Override
        public Place build() {
            return new Place(this);
        }
    }
}
