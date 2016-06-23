package nl.openweb.structured.data.schema.entities;

public class MediaObject extends CreativeWork {
    private QuantitativeValue height;
    private QuantitativeValue width;

    MediaObject(Builder builder) {
        super(builder);
        this.height = builder.height;
        this.width = builder.width;
    }

    public QuantitativeValue getHeight() {
        return height;
    }

    public QuantitativeValue getWidth() {
        return width;
    }

    public static class Builder extends CreativeWork.Builder {
        private QuantitativeValue height;
        private QuantitativeValue width;

        public Builder setHeight(QuantitativeValue height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(QuantitativeValue width) {
            this.width = width;
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
        public MediaObject build() {
            return new MediaObject(this);
        }
    }
}
