
package com.ellucian.generated.eedm.accounting_string_formats.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Accounting String Formats
 * <p>
 * The details of accounting string formats.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "delimiter",
    "components"
})
@Generated("jsonschema2pojo")
public class AccountingStringFormats {

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
     * The global identifier of the accounting string format.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the accounting string format.")
    private String id;
    /**
     * Delimiter
     * <p>
     * The delimiter that separates the accounting components within an accounting string.
     * (Required)
     * 
     */
    @JsonProperty("delimiter")
    @JsonPropertyDescription("The delimiter that separates the accounting components within an accounting string.")
    private String delimiter;
    /**
     * Components
     * <p>
     * The accounting string components that make a valid accounting string along with their position within that string
     * (Required)
     * 
     */
    @JsonProperty("components")
    @JsonPropertyDescription("The accounting string components that make a valid accounting string along with their position within that string")
    private List<Component> components = new ArrayList<Component>();

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

    public AccountingStringFormats withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the accounting string format.
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
     * The global identifier of the accounting string format.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountingStringFormats withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Delimiter
     * <p>
     * The delimiter that separates the accounting components within an accounting string.
     * (Required)
     * 
     */
    @JsonProperty("delimiter")
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Delimiter
     * <p>
     * The delimiter that separates the accounting components within an accounting string.
     * (Required)
     * 
     */
    @JsonProperty("delimiter")
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public AccountingStringFormats withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Components
     * <p>
     * The accounting string components that make a valid accounting string along with their position within that string
     * (Required)
     * 
     */
    @JsonProperty("components")
    public List<Component> getComponents() {
        return components;
    }

    /**
     * Components
     * <p>
     * The accounting string components that make a valid accounting string along with their position within that string
     * (Required)
     * 
     */
    @JsonProperty("components")
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public AccountingStringFormats withComponents(List<Component> components) {
        this.components = components;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStringFormats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("delimiter");
        sb.append('=');
        sb.append(((this.delimiter == null)?"<null>":this.delimiter));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
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
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.delimiter == null)? 0 :this.delimiter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStringFormats) == false) {
            return false;
        }
        AccountingStringFormats rhs = ((AccountingStringFormats) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.delimiter == rhs.delimiter)||((this.delimiter!= null)&&this.delimiter.equals(rhs.delimiter))));
    }

}
