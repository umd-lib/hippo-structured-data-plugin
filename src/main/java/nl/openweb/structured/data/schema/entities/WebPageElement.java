package nl.openweb.structured.data.schema.entities;

public class WebPageElement extends CreativeWork {
    protected WebPageElement(Builder builder) {
        super(builder);
    }

    public static class Builder extends CreativeWork.Builder {
        @Override
        public WebPageElement build() {
            return new WebPageElement(this);
        }

    }
}
