package nl.openweb.structured.data.schema.entities;

public class Review extends CreativeWork {

    private Thing itemReviewed;
    private String reviewBody;
    private Rating reviewRating;

    protected Review(Builder builder) {
        super(builder);
        this.itemReviewed = builder.itemReviewed;
        this.reviewBody = builder.reviewBody;
        this.reviewRating = builder.reviewRating;
    }

    public Thing getItemReviewed() {
        return itemReviewed;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public Rating getReviewRating() {
        return reviewRating;
    }

    public static class Builder extends CreativeWork.Builder {
        private Thing itemReviewed;
        private String reviewBody;
        private Rating reviewRating;

        public Builder setItemReviewed(Thing itemReviewed) {
            this.itemReviewed = itemReviewed;
            return this;
        }

        public Builder setReviewBody(String reviewBody) {
            this.reviewBody = reviewBody;
            return this;
        }

        public Builder setReviewRating(Rating reviewRating) {
            this.reviewRating = reviewRating;
            return this;
        }

        @Override
        public Review build() {
            return new Review(this);
        }
    }
}
