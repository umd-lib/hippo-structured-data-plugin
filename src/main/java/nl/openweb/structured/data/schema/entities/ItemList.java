package nl.openweb.structured.data.schema.entities;

import java.util.Collections;
import java.util.List;

public class ItemList extends Intangible {

    private List<ListItem> itemListElement;
    private List<Thing> itemListElementAsThing;
    private List<String> itemListElementAsString;
    private String itemListOrder;
    private Integer numberOfItems;

    public ItemList(Builder builder) {
        super(builder);
        this.itemListElement = builder.itemListElement;
        this.itemListElementAsThing = builder.itemListElementAsThing;
        this.itemListElementAsString = builder.itemListElementAsString;
        this.itemListOrder = builder.itemListOrder;
        this.numberOfItems = builder.numberOfItems;
    }

    public List getItemListElement() {
        if (itemListElement != null) {
            return itemListElement;
        } else if (itemListElementAsThing != null) {
            return itemListElementAsThing;
        } else if (itemListElementAsString != null) {
            return itemListElementAsString;
        } else {
            return Collections.emptyList();
        }
    }

    public String getItemListOrder() {
        return itemListOrder;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public static class Builder extends Intangible.Builder {
        private List<ListItem> itemListElement;
        private List<Thing> itemListElementAsThing;
        private List<String> itemListElementAsString;
        private String itemListOrder;
        private Integer numberOfItems;

        public Builder setItemListElement(List<ListItem> itemListElement) {
            this.itemListElement = itemListElement;
            return this;
        }

        public Builder setItemListElementAsThing(List<Thing> itemListElement) {
            this.itemListElementAsThing = itemListElement;
            return this;
        }

        public Builder setItemListElementAsString(List<String> itemListElement) {
            this.itemListElementAsString = itemListElement;
            return this;
        }

        public Builder setItemListOrder(String itemListOrder) {
            this.itemListOrder = itemListOrder;
            return this;
        }

        public Builder setNumberOfItems(Integer numberOfItems) {
            this.numberOfItems = numberOfItems;
            return this;
        }

        @Override
        public ItemList build() {
            return new ItemList(this);
        }
    }
}
