package nl.openweb.structured.data.schema.entities;

public class Enumeration extends Intangible {

    protected Enumeration(Builder builder) {
        super(builder);
    }

    public static class Builder extends Intangible.Builder {
        @Override
        public Intangible build() {
            return new Intangible(this);
        }

    }
}
