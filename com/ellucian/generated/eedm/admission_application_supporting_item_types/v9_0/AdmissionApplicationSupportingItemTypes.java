
package com.ellucian.generated.eedm.admission_application_supporting_item_types.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Application Supporting Item Types
 * <p>
 * The list of valid types for admission application supporting items.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code"
})
@Generated("jsonschema2pojo")
public class AdmissionApplicationSupportingItemTypes {

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
     * The global identifier of the admission application supporting item type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission application supporting item type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the admission application supporting item type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the admission application supporting item type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the admission application supporting item type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the admission application supporting item type.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the admission application supporting item type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the admission application supporting item type.")
    private String code;

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

    public AdmissionApplicationSupportingItemTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission application supporting item type.
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
     * The global identifier of the admission application supporting item type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionApplicationSupportingItemTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the admission application supporting item type.
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
     * The full name of the admission application supporting item type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdmissionApplicationSupportingItemTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the admission application supporting item type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the admission application supporting item type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdmissionApplicationSupportingItemTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the admission application supporting item type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the admission application supporting item type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdmissionApplicationSupportingItemTypes withCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplicationSupportingItemTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionApplicationSupportingItemTypes) == false) {
            return false;
        }
        AdmissionApplicationSupportingItemTypes rhs = ((AdmissionApplicationSupportingItemTypes) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
