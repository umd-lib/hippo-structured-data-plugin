package nl.openweb.structured.data.schema.entities;

public class ListItem extends Intangible {

    private Thing item;
    private ListItem nextItem;
    private Integer position;
    private ListItem previousItem;

    public ListItem(Builder builder) {
        super(builder);
        this.item = builder.item;
        this.nextItem = builder.nextItem;
        this.position = builder.position;
        this.previousItem = builder.previousItem;
    }

    public Thing getItem() {
        return item;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public Integer getPosition() {
        return position;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public static class Builder extends Intangible.Builder {
        private Thing item;
        private ListItem nextItem;
        private Integer position;
        private ListItem previousItem;

        public Builder setItem(Thing item) {
            this.item = item;
            return this;
        }

        public Builder setNextItem(ListItem nextItem) {
            this.nextItem = nextItem;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = position;
            return this;
        }

        public Builder setPreviousItem(ListItem previousItem) {
            this.previousItem = previousItem;
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
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public ListItem build() {
            return new ListItem(this);
        }
    }

}
