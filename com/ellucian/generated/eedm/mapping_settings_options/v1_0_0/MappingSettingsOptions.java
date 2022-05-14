
package com.ellucian.generated.eedm.mapping_settings_options.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Mapping Settings Options
 * <p>
 * The set of options available for mappings between Ethos enumerated values and corresponding source values.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ethos",
    "sourceOptions",
    "metadata"
})
@Generated("jsonschema2pojo")
public class MappingSettingsOptions {

    /**
     * ID
     * <p>
     * The global identifier of the mapping setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the mapping setting.")
    private String id;
    /**
     * Ethos
     * <p>
     * The Ethos options for mapping.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    @JsonPropertyDescription("The Ethos options for mapping.")
    private Ethos ethos;
    /**
     * Source Options
     * <p>
     * The source values for mapping.
     * 
     */
    @JsonProperty("sourceOptions")
    @JsonPropertyDescription("The source values for mapping.")
    private List<SourceOption> sourceOptions = new ArrayList<SourceOption>();
    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;

    /**
     * ID
     * <p>
     * The global identifier of the mapping setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the mapping setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MappingSettingsOptions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Ethos
     * <p>
     * The Ethos options for mapping.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public Ethos getEthos() {
        return ethos;
    }

    /**
     * Ethos
     * <p>
     * The Ethos options for mapping.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public void setEthos(Ethos ethos) {
        this.ethos = ethos;
    }

    public MappingSettingsOptions withEthos(Ethos ethos) {
        this.ethos = ethos;
        return this;
    }

    /**
     * Source Options
     * <p>
     * The source values for mapping.
     * 
     */
    @JsonProperty("sourceOptions")
    public List<SourceOption> getSourceOptions() {
        return sourceOptions;
    }

    /**
     * Source Options
     * <p>
     * The source values for mapping.
     * 
     */
    @JsonProperty("sourceOptions")
    public void setSourceOptions(List<SourceOption> sourceOptions) {
        this.sourceOptions = sourceOptions;
    }

    public MappingSettingsOptions withSourceOptions(List<SourceOption> sourceOptions) {
        this.sourceOptions = sourceOptions;
        return this;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public MappingSettingsOptions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MappingSettingsOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ethos");
        sb.append('=');
        sb.append(((this.ethos == null)?"<null>":this.ethos));
        sb.append(',');
        sb.append("sourceOptions");
        sb.append('=');
        sb.append(((this.sourceOptions == null)?"<null>":this.sourceOptions));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.ethos == null)? 0 :this.ethos.hashCode()));
        result = ((result* 31)+((this.sourceOptions == null)? 0 :this.sourceOptions.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MappingSettingsOptions) == false) {
            return false;
        }
        MappingSettingsOptions rhs = ((MappingSettingsOptions) other);
        return (((((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos)))&&((this.sourceOptions == rhs.sourceOptions)||((this.sourceOptions!= null)&&this.sourceOptions.equals(rhs.sourceOptions))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
