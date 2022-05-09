
package com.ellucian.generated.eedm.relationship_types.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Relationship Types
 * <p>
 * The types of relationships between persons, organizations or institutions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "validReciprocalRelationships",
    "code",
    "restrictedUsage"
})
@Generated("jsonschema2pojo")
public class RelationshipTypes {

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
     * The global identifier of the relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the relationship type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the relationship type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the relationship type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the relationship type.")
    private String description;
    /**
     * Valid Reciprocal Relationships
     * <p>
     * The valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    @JsonPropertyDescription("The valid reciprocal relationships that a direct relationship of a person can have.")
    private List<ValidReciprocalRelationship> validReciprocalRelationships = new ArrayList<ValidReciprocalRelationship>();
    /**
     * Code
     * <p>
     * The code used to identify the relationship type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the relationship type.")
    private String code;
    /**
     * Restricted Usage
     * <p>
     * The restrictions on the relationship type.
     * 
     */
    @JsonProperty("restrictedUsage")
    @JsonPropertyDescription("The restrictions on the relationship type.")
    private Object restrictedUsage;

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

    public RelationshipTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the relationship type.
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
     * The global identifier of the relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RelationshipTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the relationship type.
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
     * The full name of the relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RelationshipTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the relationship type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the relationship type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RelationshipTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Valid Reciprocal Relationships
     * <p>
     * The valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    public List<ValidReciprocalRelationship> getValidReciprocalRelationships() {
        return validReciprocalRelationships;
    }

    /**
     * Valid Reciprocal Relationships
     * <p>
     * The valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    public void setValidReciprocalRelationships(List<ValidReciprocalRelationship> validReciprocalRelationships) {
        this.validReciprocalRelationships = validReciprocalRelationships;
    }

    public RelationshipTypes withValidReciprocalRelationships(List<ValidReciprocalRelationship> validReciprocalRelationships) {
        this.validReciprocalRelationships = validReciprocalRelationships;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the relationship type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the relationship type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RelationshipTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Restricted Usage
     * <p>
     * The restrictions on the relationship type.
     * 
     */
    @JsonProperty("restrictedUsage")
    public Object getRestrictedUsage() {
        return restrictedUsage;
    }

    /**
     * Restricted Usage
     * <p>
     * The restrictions on the relationship type.
     * 
     */
    @JsonProperty("restrictedUsage")
    public void setRestrictedUsage(Object restrictedUsage) {
        this.restrictedUsage = restrictedUsage;
    }

    public RelationshipTypes withRestrictedUsage(Object restrictedUsage) {
        this.restrictedUsage = restrictedUsage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelationshipTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("validReciprocalRelationships");
        sb.append('=');
        sb.append(((this.validReciprocalRelationships == null)?"<null>":this.validReciprocalRelationships));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("restrictedUsage");
        sb.append('=');
        sb.append(((this.restrictedUsage == null)?"<null>":this.restrictedUsage));
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
        result = ((result* 31)+((this.restrictedUsage == null)? 0 :this.restrictedUsage.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.validReciprocalRelationships == null)? 0 :this.validReciprocalRelationships.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelationshipTypes) == false) {
            return false;
        }
        RelationshipTypes rhs = ((RelationshipTypes) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.restrictedUsage == rhs.restrictedUsage)||((this.restrictedUsage!= null)&&this.restrictedUsage.equals(rhs.restrictedUsage))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.validReciprocalRelationships == rhs.validReciprocalRelationships)||((this.validReciprocalRelationships!= null)&&this.validReciprocalRelationships.equals(rhs.validReciprocalRelationships))));
    }

}
