package nl.openweb.structured.data.schema.entities;

public class ContactPoint extends Thing {

    private String areaServed;
    private Language availableLanguage;
    private String contactType;
    private String email;
    private String faxNumber;
    private String productSupported;
    private String telephone;

    protected ContactPoint(ContactPoint.Builder builder) {
        super(builder);
        this.areaServed = builder.areaServed;
        this.availableLanguage = builder.availableLanguage;
        this.contactType = builder.contactType;
        this.email = builder.email;
        this.faxNumber = builder.faxNumber;
        this.productSupported = builder.productSupported;
        this.telephone = builder.telephone;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public Language getAvailableLanguage() {
        return availableLanguage;
    }

    public String getContactType() {
        return contactType;
    }

    public String getEmail() {
        return email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getProductSupported() {
        return productSupported;
    }

    public String getTelephone() {
        return telephone;
    }

    public static class Builder extends Thing.Builder {
        private String areaServed;
        private Language availableLanguage;
        private String contactType;
        private String email;
        private String faxNumber;
        private String productSupported;
        private String telephone;

        public Builder setAreaServed(String areaServed) {
            this.areaServed = areaServed;
            return this;
        }

        public Builder setAvailableLanguage(Language availableLanguage) {
            this.availableLanguage = availableLanguage;
            return this;
        }

        public Builder setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setProductSupported(String productSupported) {
            this.productSupported = productSupported;
            return this;
        }

        public Builder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        @Override
        public ContactPoint build() {
            return new ContactPoint(this);
        }

        @Override
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

    }
}
