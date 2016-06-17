package nl.openweb.structured.data.schema.entities;

/**
 * Created by Pim Schrama on 5/30/2016.
 */
public abstract class AbstractEntity implements StructuredData {

    @Override
    public abstract String getId();

    @Override
    public String getContext() {
        return "http://schema.org";
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
