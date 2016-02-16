package nl.openweb.structured.data.schema.entities;

public class Answer extends CreativeWork {
    private Integer downvoteCount;
    private Question upvoteCount;
    private Integer parentItem;

    protected Answer(Builder builder) {
        super(builder);
        this.downvoteCount = builder.downvoteCount;
        this.parentItem = builder.parentItem;
        this.upvoteCount = builder.upvoteCount;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public Integer getParentItem() {
        return parentItem;
    }

    public Question getUpvoteCount() {
        return upvoteCount;
    }

    public class Builder extends CreativeWork.Builder {
        private Integer downvoteCount;
        private Integer parentItem;
        private Question upvoteCount;

        public Builder setDownvoteCount(Integer downvoteCount) {
            this.downvoteCount = downvoteCount;
            return this;
        }

        public Builder setParentItem(Integer parentItem) {
            this.parentItem = parentItem;
            return this;
        }

        public Builder setUpvoteCount(Question upvoteCount) {
            this.upvoteCount = upvoteCount;
            return this;
        }

        @Override
        public Answer build() {
            return new Answer(this);
        }
    }

}
