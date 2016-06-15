package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;

public class Product extends Thing {
    //private PropertyValue additionalProperty;
    private AggregateRating aggregateRating;
    // Audience not yet implemented
    private Audience audience;
    private String award;
    //	private 	String  or Thing 	category 	;
    private String category;
    private String color;
    //	private 	Brand  or Organization 	brand 	;
    private Organization brand;
    //	private 	Distance  or QuantitativeValue 	depth 	;
    private String gtin12;
    private String gtin13;
    private String gtin14;
    private String gtin8;
    //	private 	Distance  or QuantitativeValue 	height 	;
    private Product isAccessoryOrSparePartFor;
    private Product isConsumableFor;
    //	private 	Product  or Service 	isRelatedTo 	;
    private Product isRelatedTo;
    //	private 	Product  or Service 	isSimilarTo 	;;
    private Product isSimilarTo;
    // OfferItemCondition not yet implemented
    // private 	OfferItemCondition 	itemCondition 	;
    //	private 	ImageObject  or URL 	logo 	;
    private ImageObject logo;
    private Organization manufacturer;
    //	private 	ProductModel  or String 	model 	;
    private String model;
    private String mpn;
    // Offer not yet implemented
    //private Offer offers;
    private String productID;

    private Calendar productionDate;
    private Calendar purchaseDate;
    private Calendar releaseDate;
    private Review review;
    private String sku;
    private QuantitativeValue weight;
    //private 	Distance  or QuantitativeValue 	width 	;


    protected Product(Builder builder) {
        super(builder);
        this.aggregateRating = builder.aggregateRating;
        this.audience = builder.audience;
        this.award = builder.award;
        this.category = builder.category;
        this.color = builder.color;
        this.brand = builder.brand;
        this.gtin12 = builder.gtin12;
        this.gtin13 = builder.gtin13;
        this.gtin14 = builder.gtin14;
        this.gtin8 = builder.gtin8;
        this.isAccessoryOrSparePartFor = builder.isAccessoryOrSparePartFor;
        this.isConsumableFor = builder.isConsumableFor;
        this.isRelatedTo = builder.isRelatedTo;
        this.isSimilarTo = builder.isSimilarTo;
        this.logo = builder.logo;
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.mpn = builder.mpn;
        this.productID = builder.productID;
        this.productionDate = builder.productionDate;
        this.purchaseDate = builder.purchaseDate;
        this.releaseDate = builder.releaseDate;
        this.review = builder.review;
        this.sku = builder.sku;
        this.weight = builder.weight;
    }


    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public Audience getAudience() {
        return audience;
    }

    public String getAward() {
        return award;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public Organization getBrand() {
        return brand;
    }

    public String getGtin12() {
        return gtin12;
    }

    public String getGtin13() {
        return gtin13;
    }

    public String getGtin14() {
        return gtin14;
    }

    public String getGtin8() {
        return gtin8;
    }

    public Product getIsAccessoryOrSparePartFor() {
        return isAccessoryOrSparePartFor;
    }

    public Product getIsConsumableFor() {
        return isConsumableFor;
    }

    public Product getIsRelatedTo() {
        return isRelatedTo;
    }

    public Product getIsSimilarTo() {
        return isSimilarTo;
    }

    public ImageObject getLogo() {
        return logo;
    }

    public Organization getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getMpn() {
        return mpn;
    }

    public String getProductID() {
        return productID;
    }

    public Calendar getProductionDate() {
        return productionDate;
    }

    public Calendar getPurchaseDate() {
        return purchaseDate;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public Review getReview() {
        return review;
    }

    public String getSku() {
        return sku;
    }

    public QuantitativeValue getWeight() {
        return weight;
    }

    public static class Builder extends Thing.Builder {
        private AggregateRating aggregateRating;
        private Audience audience;
        private String award;
        private String category;
        private String color;
        private Organization brand;
        private String gtin12;
        private String gtin13;
        private String gtin14;
        private String gtin8;
        private Product isAccessoryOrSparePartFor;
        private Product isConsumableFor;
        private Product isRelatedTo;
        private Product isSimilarTo;
        private ImageObject logo;
        private Organization manufacturer;
        private String model;
        private String mpn;
        private String productID;
        private Calendar productionDate;
        private Calendar purchaseDate;
        private Calendar releaseDate;
        private Review review;
        private String sku;
        private QuantitativeValue weight;

        public Builder setAggregateRating(AggregateRating aggregateRating) {
            this.aggregateRating = aggregateRating;
            return this;
        }

        public Builder setAudience(Audience audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAward(String award) {
            this.award = award;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setBrand(Organization brand) {
            this.brand = brand;
            return this;
        }

        public Builder setGtin12(String gtin12) {
            this.gtin12 = gtin12;
            return this;
        }

        public Builder setGtin13(String gtin13) {
            this.gtin13 = gtin13;
            return this;
        }

        public Builder setGtin14(String gtin14) {
            this.gtin14 = gtin14;
            return this;
        }

        public Builder setGtin8(String gtin8) {
            this.gtin8 = gtin8;
            return this;
        }

        public Builder setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor) {
            this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
            return this;
        }

        public Builder setIsConsumableFor(Product isConsumableFor) {
            this.isConsumableFor = isConsumableFor;
            return this;
        }

        public Builder setIsRelatedTo(Product isRelatedTo) {
            this.isRelatedTo = isRelatedTo;
            return this;
        }

        public Builder setIsSimilarTo(Product isSimilarTo) {
            this.isSimilarTo = isSimilarTo;
            return this;
        }

        public Builder setLogo(ImageObject logo) {
            this.logo = logo;
            return this;
        }

        public Builder setManufacturer(Organization manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMpn(String mpn) {
            this.mpn = mpn;
            return this;
        }

        public Builder setProductID(String productID) {
            this.productID = productID;
            return this;
        }

        public Builder setProductionDate(Calendar productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public Builder setPurchaseDate(Calendar purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }

        public Builder setReleaseDate(Calendar releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setReview(Review review) {
            this.review = review;
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setWeight(QuantitativeValue weight) {
            this.weight = weight;
            return this;
        }

        /*
        Following lines override the Parent Thing Builder
         */
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
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
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
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Product build() {
            return new Product(this);
        }
    }
}
