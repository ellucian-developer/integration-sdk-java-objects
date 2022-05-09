
package com.ellucian.generated.eedm.accounting_string_subcomponents.v13_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Accounting String Subcomponents
 * <p>
 * The list of valid accounting string subcomponents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "parentSubcomponent"
})
@Generated("jsonschema2pojo")
public class AccountingStringSubcomponents {

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
     * The global identifier of the accounting string subcomponent.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the accounting string subcomponent.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the accounting string subcomponent.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the accounting string subcomponent.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the accounting string subcomponent.")
    private String description;
    /**
     * Type
     * <p>
     * The type of subcomponent.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of subcomponent.")
    private Object type;
    /**
     * Parent Subcomponent
     * <p>
     * The accounting string subcomponent that is one level higher in the subcomponent hierarchy.
     * 
     */
    @JsonProperty("parentSubcomponent")
    @JsonPropertyDescription("The accounting string subcomponent that is one level higher in the subcomponent hierarchy.")
    private Object parentSubcomponent;

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

    public AccountingStringSubcomponents withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the accounting string subcomponent.
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
     * The global identifier of the accounting string subcomponent.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountingStringSubcomponents withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the accounting string subcomponent.
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
     * The full name of the accounting string subcomponent.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountingStringSubcomponents withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AccountingStringSubcomponents withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of subcomponent.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of subcomponent.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public AccountingStringSubcomponents withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Parent Subcomponent
     * <p>
     * The accounting string subcomponent that is one level higher in the subcomponent hierarchy.
     * 
     */
    @JsonProperty("parentSubcomponent")
    public Object getParentSubcomponent() {
        return parentSubcomponent;
    }

    /**
     * Parent Subcomponent
     * <p>
     * The accounting string subcomponent that is one level higher in the subcomponent hierarchy.
     * 
     */
    @JsonProperty("parentSubcomponent")
    public void setParentSubcomponent(Object parentSubcomponent) {
        this.parentSubcomponent = parentSubcomponent;
    }

    public AccountingStringSubcomponents withParentSubcomponent(Object parentSubcomponent) {
        this.parentSubcomponent = parentSubcomponent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStringSubcomponents.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("parentSubcomponent");
        sb.append('=');
        sb.append(((this.parentSubcomponent == null)?"<null>":this.parentSubcomponent));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.parentSubcomponent == null)? 0 :this.parentSubcomponent.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStringSubcomponents) == false) {
            return false;
        }
        AccountingStringSubcomponents rhs = ((AccountingStringSubcomponents) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.parentSubcomponent == rhs.parentSubcomponent)||((this.parentSubcomponent!= null)&&this.parentSubcomponent.equals(rhs.parentSubcomponent))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
