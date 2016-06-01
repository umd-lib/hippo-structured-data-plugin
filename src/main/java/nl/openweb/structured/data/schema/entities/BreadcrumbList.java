package nl.openweb.structured.data.schema.entities;

import java.util.List;

public class BreadcrumbList extends ItemList {
    protected BreadcrumbList(Builder builder) {
        super(builder);
    }

    public static class Builder extends ItemList.Builder {

        @Override
        public Builder setItemListElement(List<ListItem> itemListElement) {
            super.setItemListElement(itemListElement);
            return this;
        }

        @Override
        public Builder setItemListElementAsThing(List<Thing> itemListElement) {
            super.setItemListElementAsThing(itemListElement);
            return this;
        }

        @Override
        public Builder setItemListElementAsString(List<String> itemListElement) {
            super.setItemListElementAsString(itemListElement);
            return this;
        }

        @Override
        public Builder setItemListOrder(String itemListOrder) {
            super.setItemListOrder(itemListOrder);
            return this;
        }

        @Override
        public Builder setNumberOfItems(Integer numberOfItems) {
            super.setNumberOfItems(numberOfItems);
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
        public Builder setId(String id) {
            super.setId(id);
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
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public BreadcrumbList build() {
            return new BreadcrumbList(this);
        }
    }
}
