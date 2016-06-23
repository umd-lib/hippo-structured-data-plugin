package nl.openweb.structured.data.schema.entities;

public class Specialty extends Enumeration {

    protected Specialty(Builder builder) {
        super(builder);
    }

    public static class Builder extends Enumeration.Builder {
        @Override
        public Specialty build() {
            return new Specialty(this);
        }

    }
}
