package nl.openweb.structured.data.schema.entities;

/**
 * Intended audience for an item, i.e. the group for whom the item was created.
 * <p>
 * Thing > Intangible > Audience
 *
 * @author Texelz (by Onhate)
 */
public class Audience extends Intangible {

    private String audienceType;
    private AdministrativeArea geographicArea;

    protected Audience(Builder builder) {
        super(builder);
        this.audienceType = builder.audienceType;
        this.geographicArea = builder.geographicArea;
    }

    /**
     * The target group associated with a given audience (e.g. veterans, car
     * owners, musicians, etc.) domain: Audience Range: Text
     */
    public String getAudienceType() {
        return this.audienceType;
    }

    /**
     * The geographic area associated with the audience.
     */
    public AdministrativeArea getGeographicArea() {
        return this.geographicArea;
    }

    public static class Builder extends Intangible.Builder {
        private String audienceType;
        private AdministrativeArea geographicArea;

        public Builder setAudienceType(String audienceType) {
            this.audienceType = audienceType;
            return this;
        }

        public Builder setBestRating(AdministrativeArea geographicArea) {
            this.geographicArea = geographicArea;
            return this;
        }

        /*
        Following lines override the Parent Thing Builder
         */
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
        public Audience build() {
            return new Audience(this);
        }
    }

}
