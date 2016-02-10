package nl.openweb.structured.data.schema.entities;

public class PostalAddress extends ContactPoint{

    private String addressCountry;
    private String addressLocality;
    private String addressRegion;
    private String postOfficeBoxNumber;
    private String postalCode;
    private String streetAddress;

    public PostalAddress(PostalAddress.Builder builder) {
        super(builder);
        this.addressCountry = builder.addressCountry;
        this.addressLocality = builder.addressLocality;
        this.addressRegion = builder.addressRegion;
        this.postalCode = builder.postalCode;
        this.postOfficeBoxNumber = builder.postOfficeBoxNumber;
        this.streetAddress = builder.streetAddress;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public static class Builder extends ContactPoint.Builder {
        private String addressCountry;
        private String addressLocality;
        private String addressRegion;
        private String postalCode;
        private String postOfficeBoxNumber;
        private String streetAddress;

        public Builder setAddressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        public Builder setAddressLocality(String addressLocality) {
            this.addressLocality = addressLocality;
            return this;
        }

        public Builder setAddressRegion(String addressRegion) {
            this.addressRegion = addressRegion;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setPostOfficeBoxNumber(String postOfficeBoxNumber) {
            this.postOfficeBoxNumber = postOfficeBoxNumber;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        @Override
        public PostalAddress build() {
            return new PostalAddress(this);
        }
    }
}
