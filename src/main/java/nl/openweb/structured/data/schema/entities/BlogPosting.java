package nl.openweb.structured.data.schema.entities;

public class BlogPosting extends Article {
    protected BlogPosting(Builder builder) {
        super(builder);
    }

    public static class Builder extends Article.Builder {
        @Override
        public BlogPosting build() {
            return new BlogPosting(this);
        }

    }
}
