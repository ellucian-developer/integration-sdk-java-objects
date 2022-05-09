
package com.ellucian.generated.eedm.collection_configuration_settings.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Collection Configuration Settings
 * <p>
 * The details for collection configuration values used for Ethos integration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "ethos",
    "sourceSettings"
})
@Generated("jsonschema2pojo")
public class CollectionConfigurationSettings {

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
     * The global identifier of the collection configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the collection configuration setting.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the collection configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the collection configuration setting.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the collection configuration setting.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the collection configuration setting.")
    private String description;
    /**
     * Ethos
     * <p>
     * The Ethos property and resource(s) to which the collection configuration applies.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    @JsonPropertyDescription("The Ethos property and resource(s) to which the collection configuration applies.")
    private List<Etho> ethos = new ArrayList<Etho>();
    /**
     * Source Settings
     * <p>
     * The source values for the configuration.
     * 
     */
    @JsonProperty("sourceSettings")
    @JsonPropertyDescription("The source values for the configuration.")
    private List<SourceSetting> sourceSettings = new ArrayList<SourceSetting>();

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

    public CollectionConfigurationSettings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the collection configuration setting.
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
     * The global identifier of the collection configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CollectionConfigurationSettings withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the collection configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the collection configuration setting.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CollectionConfigurationSettings withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the collection configuration setting.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the collection configuration setting.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CollectionConfigurationSettings withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Ethos
     * <p>
     * The Ethos property and resource(s) to which the collection configuration applies.
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
     * The Ethos property and resource(s) to which the collection configuration applies.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public void setEthos(List<Etho> ethos) {
        this.ethos = ethos;
    }

    public CollectionConfigurationSettings withEthos(List<Etho> ethos) {
        this.ethos = ethos;
        return this;
    }

    /**
     * Source Settings
     * <p>
     * The source values for the configuration.
     * 
     */
    @JsonProperty("sourceSettings")
    public List<SourceSetting> getSourceSettings() {
        return sourceSettings;
    }

    /**
     * Source Settings
     * <p>
     * The source values for the configuration.
     * 
     */
    @JsonProperty("sourceSettings")
    public void setSourceSettings(List<SourceSetting> sourceSettings) {
        this.sourceSettings = sourceSettings;
    }

    public CollectionConfigurationSettings withSourceSettings(List<SourceSetting> sourceSettings) {
        this.sourceSettings = sourceSettings;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionConfigurationSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("ethos");
        sb.append('=');
        sb.append(((this.ethos == null)?"<null>":this.ethos));
        sb.append(',');
        sb.append("sourceSettings");
        sb.append('=');
        sb.append(((this.sourceSettings == null)?"<null>":this.sourceSettings));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.sourceSettings == null)? 0 :this.sourceSettings.hashCode()));
        result = ((result* 31)+((this.ethos == null)? 0 :this.ethos.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectionConfigurationSettings) == false) {
            return false;
        }
        CollectionConfigurationSettings rhs = ((CollectionConfigurationSettings) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.sourceSettings == rhs.sourceSettings)||((this.sourceSettings!= null)&&this.sourceSettings.equals(rhs.sourceSettings))))&&((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
