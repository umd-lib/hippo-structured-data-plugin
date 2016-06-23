package nl.openweb.structured.data.schema.entities;

public class ImageObject extends MediaObject {
    private String caption;
    private ImageObject thumbnail;
    private String exifData;

    ImageObject(Builder builder) {
        super(builder);
        caption = builder.caption;
        thumbnail = builder.thumbnail;
        exifData = builder.exifData;
    }

    public String getCaption() {
        return caption;
    }

    public ImageObject getThumbnail() {
        return thumbnail;
    }

    public String getExifData() {
        return exifData;
    }

    public static class Builder extends MediaObject.Builder {
        String caption;
        ImageObject thumbnail;
        String exifData;

        public Builder setCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public Builder setThumbnail(ImageObject thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public Builder setExifData(String exifData) {
            this.exifData = exifData;
            return this;
        }

        @Override
        public Builder setHeight(QuantitativeValue height) {
            super.setHeight(height);
            return this;
        }

        @Override
        public Builder setWidth(QuantitativeValue width) {
            super.setWidth(width);
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
        public ImageObject build() {
            return new ImageObject(this);
        }
    }
}
