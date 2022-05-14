
package com.ellucian.generated.eedm.accounting_string_subcomponent_values.v13_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Accounting String Subcomponent Values
 * <p>
 * The details of an accounting string subcomponent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "subcomponent",
    "parentSubcomponent"
})
@Generated("jsonschema2pojo")
public class AccountingStringSubcomponentValues {

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
     * The global identifier of the accounting string subcomponent value.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the accounting string subcomponent value.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the accounting string subcomponent value.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the accounting string subcomponent value.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent value.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the accounting string subcomponent value.")
    private String description;
    /**
     * Code
     * <p>
     * The code used to identify the accounting string subcomponent value.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the accounting string subcomponent value.")
    private String code;
    /**
     * Subcomponent
     * <p>
     * The accounting string subcomponent used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("subcomponent")
    @JsonPropertyDescription("The accounting string subcomponent used in the accounting string.")
    private Subcomponent subcomponent;
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

    public AccountingStringSubcomponentValues withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the accounting string subcomponent value.
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
     * The global identifier of the accounting string subcomponent value.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountingStringSubcomponentValues withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the accounting string subcomponent value.
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
     * The full name of the accounting string subcomponent value.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountingStringSubcomponentValues withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent value.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string subcomponent value.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AccountingStringSubcomponentValues withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the accounting string subcomponent value.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the accounting string subcomponent value.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AccountingStringSubcomponentValues withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Subcomponent
     * <p>
     * The accounting string subcomponent used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("subcomponent")
    public Subcomponent getSubcomponent() {
        return subcomponent;
    }

    /**
     * Subcomponent
     * <p>
     * The accounting string subcomponent used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("subcomponent")
    public void setSubcomponent(Subcomponent subcomponent) {
        this.subcomponent = subcomponent;
    }

    public AccountingStringSubcomponentValues withSubcomponent(Subcomponent subcomponent) {
        this.subcomponent = subcomponent;
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

    public AccountingStringSubcomponentValues withParentSubcomponent(Object parentSubcomponent) {
        this.parentSubcomponent = parentSubcomponent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStringSubcomponentValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("subcomponent");
        sb.append('=');
        sb.append(((this.subcomponent == null)?"<null>":this.subcomponent));
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
        result = ((result* 31)+((this.subcomponent == null)? 0 :this.subcomponent.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.parentSubcomponent == null)? 0 :this.parentSubcomponent.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStringSubcomponentValues) == false) {
            return false;
        }
        AccountingStringSubcomponentValues rhs = ((AccountingStringSubcomponentValues) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.subcomponent == rhs.subcomponent)||((this.subcomponent!= null)&&this.subcomponent.equals(rhs.subcomponent))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.parentSubcomponent == rhs.parentSubcomponent)||((this.parentSubcomponent!= null)&&this.parentSubcomponent.equals(rhs.parentSubcomponent))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
