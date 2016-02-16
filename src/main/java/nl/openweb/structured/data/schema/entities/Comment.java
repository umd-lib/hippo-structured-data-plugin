package nl.openweb.structured.data.schema.entities;

public class Comment extends CreativeWork {

    private Integer downvoteCount;
    private Question parentItem;
    private Integer upvoteCount;

    protected Comment(Builder builder) {
        super(builder);
        this.downvoteCount = builder.downvoteCount;
        this.parentItem = builder.parentItem;
        this.upvoteCount = builder.upvoteCount;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public Question getParentItem() {
        return parentItem;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public static class Builder extends CreativeWork.Builder {
        private Integer downvoteCount;
        private Question parentItem;
        private Integer upvoteCount;

        public Builder setDownvoteCount(Integer downvoteCount) {
            this.downvoteCount = downvoteCount;
            return this;
        }

        public Builder setParentItem(Question parentItem) {
            this.parentItem = parentItem;
            return this;
        }

        public Builder setUpvoteCount(Integer upvoteCount) {
            this.upvoteCount = upvoteCount;
            return this;
        }



        @Override
        public Comment build() {
            return new Comment(this);
        }
    }


}
