
package com.ellucian.generated.eedm.default_settings_options.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Default Settings Options
 * <p>
 * The values available to be used as defaults for Ethos.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ethos",
    "sourceOptions"
})
@Generated("jsonschema2pojo")
public class DefaultSettingsOptions {

    /**
     * ID
     * <p>
     * The global identifier of the default setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the default setting.")
    private String id;
    /**
     * Ethos
     * <p>
     * The Ethos resource (and property) name(s) to which the default settings pertain.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    @JsonPropertyDescription("The Ethos resource (and property) name(s) to which the default settings pertain.")
    private List<Etho> ethos = new ArrayList<Etho>();
    /**
     * Source Options
     * <p>
     * The source values available to be used as a default.
     * 
     */
    @JsonProperty("sourceOptions")
    @JsonPropertyDescription("The source values available to be used as a default.")
    private List<SourceOption> sourceOptions = new ArrayList<SourceOption>();

    /**
     * ID
     * <p>
     * The global identifier of the default setting.
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
     * The global identifier of the default setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DefaultSettingsOptions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Ethos
     * <p>
     * The Ethos resource (and property) name(s) to which the default settings pertain.
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
     * The Ethos resource (and property) name(s) to which the default settings pertain.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public void setEthos(List<Etho> ethos) {
        this.ethos = ethos;
    }

    public DefaultSettingsOptions withEthos(List<Etho> ethos) {
        this.ethos = ethos;
        return this;
    }

    /**
     * Source Options
     * <p>
     * The source values available to be used as a default.
     * 
     */
    @JsonProperty("sourceOptions")
    public List<SourceOption> getSourceOptions() {
        return sourceOptions;
    }

    /**
     * Source Options
     * <p>
     * The source values available to be used as a default.
     * 
     */
    @JsonProperty("sourceOptions")
    public void setSourceOptions(List<SourceOption> sourceOptions) {
        this.sourceOptions = sourceOptions;
    }

    public DefaultSettingsOptions withSourceOptions(List<SourceOption> sourceOptions) {
        this.sourceOptions = sourceOptions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultSettingsOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultSettingsOptions) == false) {
            return false;
        }
        DefaultSettingsOptions rhs = ((DefaultSettingsOptions) other);
        return ((((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos)))&&((this.sourceOptions == rhs.sourceOptions)||((this.sourceOptions!= null)&&this.sourceOptions.equals(rhs.sourceOptions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
