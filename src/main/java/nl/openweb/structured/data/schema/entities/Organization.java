package nl.openweb.structured.data.schema.entities;

public class Organization extends Thing {

    private String logo;

    Organization(Builder builder) {
        super(builder);
        this.logo = builder.logo;
    }

    public String getLogo() {
        return logo;
    }

    public static class Builder extends Thing.Builder {
        private String logo;

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
        public Organization build() {
            return new Organization(this);
        }

        public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
        }
    }

}
