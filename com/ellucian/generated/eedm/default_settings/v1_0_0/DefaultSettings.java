
package com.ellucian.generated.eedm.default_settings.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Default Settings
 * <p>
 * The details for values to be used as defaults for Ethos.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "ethos",
    "source",
    "advancedSearch"
})
@Generated("jsonschema2pojo")
public class DefaultSettings {

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
     * The global identifier of the default setting.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the default setting.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the default setting.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the default setting.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the default setting.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the default setting.")
    private String description;
    /**
     * Ethos
     * <p>
     * The Ethos resource (and property) names to which the default settings pertain.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    @JsonPropertyDescription("The Ethos resource (and property) names to which the default settings pertain.")
    private List<Etho> ethos = new ArrayList<Etho>();
    /**
     * Source
     * <p>
     * The source values to be used as a default.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source values to be used as a default.")
    private Object source;
    /**
     * Advanced Search
     * <p>
     * The advanced search details for large datasets.
     * 
     */
    @JsonProperty("advancedSearch")
    @JsonPropertyDescription("The advanced search details for large datasets.")
    private Object advancedSearch;

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

    public DefaultSettings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

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

    public DefaultSettings withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the default setting.
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
     * The full name of the default setting.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public DefaultSettings withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the default setting.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the default setting.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public DefaultSettings withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Ethos
     * <p>
     * The Ethos resource (and property) names to which the default settings pertain.
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
     * The Ethos resource (and property) names to which the default settings pertain.
     * (Required)
     * 
     */
    @JsonProperty("ethos")
    public void setEthos(List<Etho> ethos) {
        this.ethos = ethos;
    }

    public DefaultSettings withEthos(List<Etho> ethos) {
        this.ethos = ethos;
        return this;
    }

    /**
     * Source
     * <p>
     * The source values to be used as a default.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source values to be used as a default.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public DefaultSettings withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Advanced Search
     * <p>
     * The advanced search details for large datasets.
     * 
     */
    @JsonProperty("advancedSearch")
    public Object getAdvancedSearch() {
        return advancedSearch;
    }

    /**
     * Advanced Search
     * <p>
     * The advanced search details for large datasets.
     * 
     */
    @JsonProperty("advancedSearch")
    public void setAdvancedSearch(Object advancedSearch) {
        this.advancedSearch = advancedSearch;
    }

    public DefaultSettings withAdvancedSearch(Object advancedSearch) {
        this.advancedSearch = advancedSearch;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("advancedSearch");
        sb.append('=');
        sb.append(((this.advancedSearch == null)?"<null>":this.advancedSearch));
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
        result = ((result* 31)+((this.advancedSearch == null)? 0 :this.advancedSearch.hashCode()));
        result = ((result* 31)+((this.ethos == null)? 0 :this.ethos.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultSettings) == false) {
            return false;
        }
        DefaultSettings rhs = ((DefaultSettings) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.advancedSearch == rhs.advancedSearch)||((this.advancedSearch!= null)&&this.advancedSearch.equals(rhs.advancedSearch))))&&((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
