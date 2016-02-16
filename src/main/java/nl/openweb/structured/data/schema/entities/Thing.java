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
    private String id;

    Thing(Thing.Builder builder) {
        this.additionalType = builder.additionalType;
        this.alternateName = builder.alternateName;
        this.description = builder.description;
        this.image = builder.image;
        this.mainEntityOfPage = builder.mainEntityOfPage;
        this.name = builder.name;
        this.sameAs = builder.sameAs;
        this.url = builder.url;
        this.id = builder.id;
    }

    @Override
    public String getContext() {
        return "http://schema.org";
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String getId() {
        return id;
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



    public static class Builder {
        private String additionalType;
        private String alternateName;
        private String description;
        private String image;
        private String mainEntityOfPage;
        private String name;
        private String sameAs;
        private String url;
        private String id;

        public Builder setAdditionalType(String additionalType) {
            this.additionalType = additionalType;
            return this;
        }

        public Builder setAlternateName(String alternateName) {
            this.alternateName = alternateName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            this.mainEntityOfPage = mainEntityOfPage;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSameAs(String sameAs) {
            this.sameAs = sameAs;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Thing build() {
            return new Thing(this);
        }
    }
}
