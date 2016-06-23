package nl.openweb.structured.data.schema.entities;


/**
 * A geographical region under the jurisdiction of a particular government.
 * <p>
 * Thing > Place > AdministrativeArea
 *
 * @author Texelz (by Onhate)
 */
public class AdministrativeArea extends Place {

    protected AdministrativeArea(Builder builder) {
        super(builder);
    }

    public static class Builder extends Place.Builder {

        @Override
        public Builder setAddress(PostalAddress address) {
            super.setAddress(address);
            return this;
        }

        @Override
        public Builder setAddress(String address) {
            super.setAddress(address);
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
        public Builder setImage(ImageObject image) {
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
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Thing.Builder setSameAs(String[] sameAs) {
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
        public AdministrativeArea build() {
            return new AdministrativeArea(this);
        }
    }

}