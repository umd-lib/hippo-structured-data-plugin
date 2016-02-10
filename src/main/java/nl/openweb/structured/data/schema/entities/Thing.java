package nl.openweb.structured.data.schema.entities;

public class Thing implements StructuredData {
    private String additionalType;
    private String alternateName;
    private String description;
    private String image;
    private String mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;

    Thing(Thing.Builder builder) {
        this.additionalType = builder.additionalType;
        this.alternateName = builder.alternateName;
        this.description = builder.description;
        this.image = builder.image;
        this.mainEntityOfPage = builder.mainEntityOfPage;
        this.name = builder.name;
        this.sameAs = builder.sameAs;
        this.url = builder.url;
    }

    @Override
    public String getContext() {
        return "http://schema.org";
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

    public String getAdditionalType() {
        return additionalType;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getMainEntityOfPage() {
        return mainEntityOfPage;
    }

    public String getName() {
        return name;
    }

    public String getSameAs() {
        return sameAs;
    }

    public String getUrl() {
        return url;
    }

    @SuppressWarnings("unchecked")
    public static class Builder {
        private String additionalType;
        private String alternateName;
        private String description;
        private String image;
        private String mainEntityOfPage;
        private String name;
        private String sameAs;
        private String url;

        public <T extends Builder> T setAdditionalType(String additionalType) {
            this.additionalType = additionalType;
            return (T) this;
        }

        public <T extends Builder> T setAlternateName(String alternateName) {
            this.alternateName = alternateName;
            return (T) this;
        }

        public <T extends Builder> T setDescription(String description) {
            this.description = description;
            return (T) this;
        }

        public <T extends Builder> T setImage(String image) {
            this.image = image;
            return (T) this;
        }

        public <T extends Builder> T setMainEntityOfPage(String mainEntityOfPage) {
            this.mainEntityOfPage = mainEntityOfPage;
            return (T) this;
        }

        public <T extends Builder> T setName(String name) {
            this.name = name;
            return (T) this;
        }

        public <T extends Builder> T setSameAs(String sameAs) {
            this.sameAs = sameAs;
            return (T) this;
        }

        public <T extends Builder> T setUrl(String url) {
            this.url = url;
            return (T) this;
        }

        public Thing build() {
            return new Thing(this);
        }
    }
}
