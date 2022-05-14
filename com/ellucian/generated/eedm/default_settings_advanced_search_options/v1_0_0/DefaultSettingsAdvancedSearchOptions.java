
package com.ellucian.generated.eedm.default_settings_advanced_search_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Default Settings Advanced Search Options
 * <p>
 * The advanced search results available to be used as options for a default setting based on the specified criteria.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "value",
    "origin",
    "metadata"
})
@Generated("jsonschema2pojo")
public class DefaultSettingsAdvancedSearchOptions {

    /**
     * Title
     * <p>
     * The full name of the default settings advanced search option.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the default settings advanced search option.")
    private String title;
    /**
     * Value
     * <p>
     * The value for the default settings advanced search option.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value for the default settings advanced search option.")
    private String value;
    /**
     * Origin
     * <p>
     * The origin of the default settings advanced search option.
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("The origin of the default settings advanced search option.")
    private String origin;
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
     * Title
     * <p>
     * The full name of the default settings advanced search option.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the default settings advanced search option.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public DefaultSettingsAdvancedSearchOptions withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Value
     * <p>
     * The value for the default settings advanced search option.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The value for the default settings advanced search option.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public DefaultSettingsAdvancedSearchOptions withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Origin
     * <p>
     * The origin of the default settings advanced search option.
     * 
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin
     * <p>
     * The origin of the default settings advanced search option.
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public DefaultSettingsAdvancedSearchOptions withOrigin(String origin) {
        this.origin = origin;
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

    public DefaultSettingsAdvancedSearchOptions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultSettingsAdvancedSearchOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultSettingsAdvancedSearchOptions) == false) {
            return false;
        }
        DefaultSettingsAdvancedSearchOptions rhs = ((DefaultSettingsAdvancedSearchOptions) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))));
    }

}
