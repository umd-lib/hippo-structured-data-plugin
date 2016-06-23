package nl.openweb.structured.data.schema.entities;

public class Rating extends Intangible {

    private String bestRating;
    private Number bestRatingAsNumber;
    private String ratingValue;
    private String worstRating;
    private Number worstRatingAsNumber;

    protected Rating(Builder builder) {
        super(builder);
        bestRating = builder.bestRating;
        bestRatingAsNumber = builder.bestRatingAsNumber;
        ratingValue = builder.ratingValue;
        worstRating = builder.worstRating;
        worstRatingAsNumber = builder.worstRatingAsNumber;
    }

    public Object getWorstRating() {
        Object result = worstRating;
        if (result == null) {
            result = worstRatingAsNumber;
        }
        return result;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public Object getBestRating() {
        Object result = this.bestRating;
        if (result == null) {
            result = bestRatingAsNumber;
        }
        return result;
    }


    public static class Builder extends Intangible.Builder {
        private String bestRating;
        private Number bestRatingAsNumber;
        private String ratingValue;
        private String worstRating;
        private Number worstRatingAsNumber;

        public Builder setBestRating(String bestRating) {
            this.bestRating = bestRating;
            return this;
        }

        public Builder setBestRating(Number bestRatingAsNumber) {
            this.bestRatingAsNumber = bestRatingAsNumber;
            return this;
        }

        public Builder setRatingValue(String ratingValue) {
            this.ratingValue = ratingValue;
            return this;
        }

        public Builder setWorstRating(String worstRating) {
            this.worstRating = worstRating;
            return this;
        }

        public Builder setWorstRating(Number worstRatingAsNumber) {
            this.worstRatingAsNumber = worstRatingAsNumber;
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
        public Rating build() {
            return new Rating(this);
        }
    }

}
