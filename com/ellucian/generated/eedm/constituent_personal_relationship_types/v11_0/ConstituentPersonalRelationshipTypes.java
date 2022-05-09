
package com.ellucian.generated.eedm.constituent_personal_relationship_types.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Personal Relationship Types
 * <p>
 * A type of relationship between people who are recorded as constituents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "relationshipTypes",
    "status"
})
@Generated("jsonschema2pojo")
public class ConstituentPersonalRelationshipTypes {

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
     * The global identifier of the constituent personal relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent personal relationship type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the constituent personal relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the constituent personal relationship type.")
    private String title;
    /**
     * Description
     * <p>
     * The full description of the constituent personal relationship type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The full description of the constituent personal relationship type.")
    private String description;
    /**
     * Relationship Types
     * <p>
     * Types of relationship between two people.
     * 
     */
    @JsonProperty("relationshipTypes")
    @JsonPropertyDescription("Types of relationship between two people.")
    private List<RelationshipType> relationshipTypes = new ArrayList<RelationshipType>();
    /**
     * Status
     * <p>
     * The status of the relationship (e.g. current and past).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the relationship (e.g. current and past).")
    private Object status;

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

    public ConstituentPersonalRelationshipTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent personal relationship type.
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
     * The global identifier of the constituent personal relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentPersonalRelationshipTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the constituent personal relationship type.
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
     * The full name of the constituent personal relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ConstituentPersonalRelationshipTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent personal relationship type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent personal relationship type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentPersonalRelationshipTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Relationship Types
     * <p>
     * Types of relationship between two people.
     * 
     */
    @JsonProperty("relationshipTypes")
    public List<RelationshipType> getRelationshipTypes() {
        return relationshipTypes;
    }

    /**
     * Relationship Types
     * <p>
     * Types of relationship between two people.
     * 
     */
    @JsonProperty("relationshipTypes")
    public void setRelationshipTypes(List<RelationshipType> relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
    }

    public ConstituentPersonalRelationshipTypes withRelationshipTypes(List<RelationshipType> relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the relationship (e.g. current and past).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the relationship (e.g. current and past).
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ConstituentPersonalRelationshipTypes withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentPersonalRelationshipTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("relationshipTypes");
        sb.append('=');
        sb.append(((this.relationshipTypes == null)?"<null>":this.relationshipTypes));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.relationshipTypes == null)? 0 :this.relationshipTypes.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentPersonalRelationshipTypes) == false) {
            return false;
        }
        ConstituentPersonalRelationshipTypes rhs = ((ConstituentPersonalRelationshipTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.relationshipTypes == rhs.relationshipTypes)||((this.relationshipTypes!= null)&&this.relationshipTypes.equals(rhs.relationshipTypes))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
