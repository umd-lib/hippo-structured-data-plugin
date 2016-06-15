package nl.openweb.structured.data.schema.entities;

public class QuantitativeValue extends StructuredValue {
    private String additionalProperty;
    private int maxValue;
    private int minValue;
    private String unitCode;
    private String unitText;
    private Object value;

    protected QuantitativeValue(Builder builder) {
        super(builder);
        this.additionalProperty = builder.additionalProperty;
        this.maxValue = builder.maxValue;
        this.minValue = builder.minValue;
        this.unitCode = builder.unitCode;
        this.unitText = builder.unitText;
        this.value = builder.value;
    }

    public String getAdditionalProperty() {
        return additionalProperty;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public String getUnitText() {
        return unitText;
    }

    public Object getValue() {
        return value;
    }

    public static class Builder extends StructuredValue.Builder {
        private String additionalProperty;
        private int maxValue;
        private int minValue;
        private String unitCode;
        private String unitText;
        private Object value;

        public Builder setAdditionalProperty(String additionalProperty) {
            this.additionalProperty = additionalProperty;
            return this;
        }

        public Builder setMaxValue(int maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public Builder setMinValue(int minValue) {
            this.minValue = minValue;
            return this;
        }

        public Builder setUnitCode(String unitCode) {
            this.unitCode = unitCode;
            return this;
        }

        public Builder setUnitText(String unitText) {
            this.unitText = unitText;
            return this;
        }

        public Builder setValue(Object value) {
            this.value = value;
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
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        public QuantitativeValue build() {
            return new QuantitativeValue(this);
        }
    }
}
