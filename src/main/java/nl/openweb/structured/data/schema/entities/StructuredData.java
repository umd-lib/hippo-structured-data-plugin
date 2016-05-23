package nl.openweb.structured.data.schema.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

public interface StructuredData {

    @JsonProperty("@context")
    String getContext();

    @JsonProperty("@type")
    String getType();

    @JsonProperty("@id")
    String getId();

}
