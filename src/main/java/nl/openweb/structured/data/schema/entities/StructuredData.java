package nl.openweb.structured.data.schema.entities;

import org.codehaus.jackson.annotate.JsonProperty;

public interface StructuredData {

    @JsonProperty("@context")
    String getContext();

    @JsonProperty("@type")
    String getType();

}
