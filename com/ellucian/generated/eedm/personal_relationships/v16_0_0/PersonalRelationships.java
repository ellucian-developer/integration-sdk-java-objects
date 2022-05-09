
package com.ellucian.generated.eedm.personal_relationships.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Personal Relationships
 * <p>
 * The relationships between two people.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "subjectPerson",
    "related",
    "directRelationshipType",
    "reciprocalRelationshipType",
    "status",
    "startOn",
    "endOn",
    "comment"
})
@Generated("jsonschema2pojo")
public class PersonalRelationships {

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
     * The global identifier of the personal relationship.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the personal relationship.")
    private String id;
    /**
     * Subject Person
     * <p>
     * The primary person for whom the relationship is described.
     * (Required)
     * 
     */
    @JsonProperty("subjectPerson")
    @JsonPropertyDescription("The primary person for whom the relationship is described.")
    private SubjectPerson subjectPerson;
    /**
     * Related
     * <p>
     * The person who has the relationship with the subject person.
     * (Required)
     * 
     */
    @JsonProperty("related")
    @JsonPropertyDescription("The person who has the relationship with the subject person.")
    private Object related;
    /**
     * Direct Relationship Type
     * <p>
     * The subject person's relationship type with the related person.
     * 
     */
    @JsonProperty("directRelationshipType")
    @JsonPropertyDescription("The subject person's relationship type with the related person.")
    private Object directRelationshipType;
    /**
     * Reciprocal Relationship Type
     * <p>
     * The related person's relationship type with the subject person.
     * 
     */
    @JsonProperty("reciprocalRelationshipType")
    @JsonPropertyDescription("The related person's relationship type with the subject person.")
    private Object reciprocalRelationshipType;
    /**
     * Status
     * <p>
     * The status of the personal relationship.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the personal relationship.")
    private Object status;
    /**
     * Start On
     * <p>
     * The date when the relationship started.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the relationship started.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when the relationship ended.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the relationship ended.")
    private Object endOn;
    /**
     * Comment
     * <p>
     * The comment on the relationship.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment on the relationship.")
    private String comment;

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

    public PersonalRelationships withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the personal relationship.
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
     * The global identifier of the personal relationship.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonalRelationships withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Subject Person
     * <p>
     * The primary person for whom the relationship is described.
     * (Required)
     * 
     */
    @JsonProperty("subjectPerson")
    public SubjectPerson getSubjectPerson() {
        return subjectPerson;
    }

    /**
     * Subject Person
     * <p>
     * The primary person for whom the relationship is described.
     * (Required)
     * 
     */
    @JsonProperty("subjectPerson")
    public void setSubjectPerson(SubjectPerson subjectPerson) {
        this.subjectPerson = subjectPerson;
    }

    public PersonalRelationships withSubjectPerson(SubjectPerson subjectPerson) {
        this.subjectPerson = subjectPerson;
        return this;
    }

    /**
     * Related
     * <p>
     * The person who has the relationship with the subject person.
     * (Required)
     * 
     */
    @JsonProperty("related")
    public Object getRelated() {
        return related;
    }

    /**
     * Related
     * <p>
     * The person who has the relationship with the subject person.
     * (Required)
     * 
     */
    @JsonProperty("related")
    public void setRelated(Object related) {
        this.related = related;
    }

    public PersonalRelationships withRelated(Object related) {
        this.related = related;
        return this;
    }

    /**
     * Direct Relationship Type
     * <p>
     * The subject person's relationship type with the related person.
     * 
     */
    @JsonProperty("directRelationshipType")
    public Object getDirectRelationshipType() {
        return directRelationshipType;
    }

    /**
     * Direct Relationship Type
     * <p>
     * The subject person's relationship type with the related person.
     * 
     */
    @JsonProperty("directRelationshipType")
    public void setDirectRelationshipType(Object directRelationshipType) {
        this.directRelationshipType = directRelationshipType;
    }

    public PersonalRelationships withDirectRelationshipType(Object directRelationshipType) {
        this.directRelationshipType = directRelationshipType;
        return this;
    }

    /**
     * Reciprocal Relationship Type
     * <p>
     * The related person's relationship type with the subject person.
     * 
     */
    @JsonProperty("reciprocalRelationshipType")
    public Object getReciprocalRelationshipType() {
        return reciprocalRelationshipType;
    }

    /**
     * Reciprocal Relationship Type
     * <p>
     * The related person's relationship type with the subject person.
     * 
     */
    @JsonProperty("reciprocalRelationshipType")
    public void setReciprocalRelationshipType(Object reciprocalRelationshipType) {
        this.reciprocalRelationshipType = reciprocalRelationshipType;
    }

    public PersonalRelationships withReciprocalRelationshipType(Object reciprocalRelationshipType) {
        this.reciprocalRelationshipType = reciprocalRelationshipType;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the personal relationship.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the personal relationship.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public PersonalRelationships withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the relationship started.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the relationship started.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public PersonalRelationships withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the relationship ended.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the relationship ended.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PersonalRelationships withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment on the relationship.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment on the relationship.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PersonalRelationships withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalRelationships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("subjectPerson");
        sb.append('=');
        sb.append(((this.subjectPerson == null)?"<null>":this.subjectPerson));
        sb.append(',');
        sb.append("related");
        sb.append('=');
        sb.append(((this.related == null)?"<null>":this.related));
        sb.append(',');
        sb.append("directRelationshipType");
        sb.append('=');
        sb.append(((this.directRelationshipType == null)?"<null>":this.directRelationshipType));
        sb.append(',');
        sb.append("reciprocalRelationshipType");
        sb.append('=');
        sb.append(((this.reciprocalRelationshipType == null)?"<null>":this.reciprocalRelationshipType));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.subjectPerson == null)? 0 :this.subjectPerson.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.directRelationshipType == null)? 0 :this.directRelationshipType.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reciprocalRelationshipType == null)? 0 :this.reciprocalRelationshipType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalRelationships) == false) {
            return false;
        }
        PersonalRelationships rhs = ((PersonalRelationships) other);
        return (((((((((((this.subjectPerson == rhs.subjectPerson)||((this.subjectPerson!= null)&&this.subjectPerson.equals(rhs.subjectPerson)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.directRelationshipType == rhs.directRelationshipType)||((this.directRelationshipType!= null)&&this.directRelationshipType.equals(rhs.directRelationshipType))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reciprocalRelationshipType == rhs.reciprocalRelationshipType)||((this.reciprocalRelationshipType!= null)&&this.reciprocalRelationshipType.equals(rhs.reciprocalRelationshipType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
