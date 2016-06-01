package nl.openweb.structured.data.schema.entities;

/**
 * Created by Pim Schrama on 5/30/2016.
 */
public abstract class AbstractEntity implements StructuredData{

    public abstract String getId();

    public String getContext() {
        return "http://schema.org";
    }

    public String getType() {
        return getClass().getSimpleName();
    }
}
