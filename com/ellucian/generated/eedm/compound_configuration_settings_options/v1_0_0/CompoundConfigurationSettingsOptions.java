
package com.ellucian.generated.eedm.compound_configuration_settings_options.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Compound Configuration Settings Options
 * <p>
 * The compound configuration values available to be used for Ethos integration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ethos",
    "source",
    "metadata"
})
@Generated("jsonschema2pojo")
public class CompoundConfigurationSettingsOptions {

    /**
     * ID
     * <p>
     * The global identifier of the compound configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the compound configuration setting.")
    private String id;
    /**
     * Ethos
     * <p>
     * The Ethos resources to which the compound configuration setting applies.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    @JsonPropertyDescription("The Ethos resources to which the compound configuration setting applies.")
    private List<Etho> ethos = new ArrayList<Etho>();
    /**
     * Source
     * <p>
     * The source values for the compound configuration setting.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source values for the compound configuration setting.")
    private Object source;
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
     * The global identifier of the compound configuration setting.
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
     * The global identifier of the compound configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CompoundConfigurationSettingsOptions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Ethos
     * <p>
     * The Ethos resources to which the compound configuration setting applies.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public List<Etho> getEthos() {
        return ethos;
    }

    /**
     * Ethos
     * <p>
     * The Ethos resources to which the compound configuration setting applies.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public void setEthos(List<Etho> ethos) {
        this.ethos = ethos;
    }

    public CompoundConfigurationSettingsOptions withEthos(List<Etho> ethos) {
        this.ethos = ethos;
        return this;
    }

    /**
     * Source
     * <p>
     * The source values for the compound configuration setting.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source values for the compound configuration setting.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public CompoundConfigurationSettingsOptions withSource(Object source) {
        this.source = source;
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

    public CompoundConfigurationSettingsOptions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CompoundConfigurationSettingsOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ethos");
        sb.append('=');
        sb.append(((this.ethos == null)?"<null>":this.ethos));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompoundConfigurationSettingsOptions) == false) {
            return false;
        }
        CompoundConfigurationSettingsOptions rhs = ((CompoundConfigurationSettingsOptions) other);
        return (((((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
