package nl.openweb.structured.data.schema.entities;

/**
 * The average rating based on multiple ratings or reviews.
 * <p>
 * Thing > Intangible > Rating > AggregateRating
 *
 * @author Texelz (by Onhate) , Pim Schrama
 */
public class AggregateRating extends Rating {

    private Thing itemReviewed;
    private Double ratingCount;
    private Double reviewCount;

    protected AggregateRating(Builder builder) {
        super(builder);
        itemReviewed = builder.itemReviewed;
        ratingCount = builder.ratingCount;
        reviewCount = builder.reviewCount;
    }

    /**
     * The item that is being reviewed/rated.
     */
    public Thing getItemReviewed() {
        return this.itemReviewed;
    }

    /**
     * The count of total number of ratings.
     */
    public Double getRatingCount() {
        return this.ratingCount;
    }

    /**
     * The count of total number of reviews.
     */
    public Double getReviewCount() {
        return this.reviewCount;
    }


    public static class Builder extends Rating.Builder {
        private Thing itemReviewed;
        private Double ratingCount;
        private Double reviewCount;

        /**
         * The item that is being reviewed/rated.
         */
        public Builder setItemReviewed(Thing itemReviewed) {
            this.itemReviewed = itemReviewed;
            return this;
        }

        /**
         * The count of total number of ratings.
         */
        public Builder setRatingCount(Double ratingCount) {
            this.ratingCount = ratingCount;
            return this;
        }

        /**
         * The count of total number of reviews.
         */
        public Builder setReviewCount(Double reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }

        /* Overriding Rating.Builder from here */
        @Override
        public Builder setBestRating(String bestRating) {
            super.setBestRating(bestRating);
            return this;
        }

        @Override
        public Builder setBestRating(Number bestRatingAsNumber) {
            super.setBestRating(bestRatingAsNumber);
            return this;
        }

        @Override
        public Builder setRatingValue(String ratingValue) {
            super.setRatingValue(ratingValue);
            return this;
        }

        @Override
        public Builder setWorstRating(String worstRating) {
            super.setWorstRating(worstRating);
            return this;
        }

        @Override
        public Builder setWorstRating(Number worstRatingAsNumber) {
            super.setWorstRating(worstRatingAsNumber);
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
        public AggregateRating build() {
            return new AggregateRating(this);
        }
    }

}
