
package com.ellucian.generated.eedm.personal_relationships.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Personal Relationships
 * <p>
 * A kind of relationship between two people.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "subjectPerson",
    "relatedPerson",
    "directRelationship",
    "reciprocalRelationship",
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
     * The global identifier of the relationship.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the relationship.")
    private String id;
    /**
     * Subject Person
     * <p>
     * A person, with regards to whom the relationship is considered.
     * (Required)
     * 
     */
    @JsonProperty("subjectPerson")
    @JsonPropertyDescription("A person, with regards to whom the relationship is considered.")
    private SubjectPerson subjectPerson;
    /**
     * Related Person
     * <p>
     * A person related to the subject.
     * (Required)
     * 
     */
    @JsonProperty("relatedPerson")
    @JsonPropertyDescription("A person related to the subject.")
    private RelatedPerson relatedPerson;
    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject and related person, going from the latter to the former
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    @JsonPropertyDescription("The relationship between the subject and related person, going from the latter to the former")
    private DirectRelationship directRelationship;
    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons
     * 
     */
    @JsonProperty("reciprocalRelationship")
    @JsonPropertyDescription("The reverse relationship between the persons")
    private Object reciprocalRelationship;
    /**
     * Status
     * <p>
     * The status of the relationship (where appropriate).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the relationship (where appropriate).")
    private Object status;
    /**
     * Start On
     * <p>
     * The date when the relationship started
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the relationship started")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when the relationship ended
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the relationship ended")
    private Object endOn;
    /**
     * Comment
     * <p>
     * Comment on the relationship.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Comment on the relationship.")
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
     * The global identifier of the relationship.
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
     * The global identifier of the relationship.
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
     * A person, with regards to whom the relationship is considered.
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
     * A person, with regards to whom the relationship is considered.
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
     * Related Person
     * <p>
     * A person related to the subject.
     * (Required)
     * 
     */
    @JsonProperty("relatedPerson")
    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    /**
     * Related Person
     * <p>
     * A person related to the subject.
     * (Required)
     * 
     */
    @JsonProperty("relatedPerson")
    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public PersonalRelationships withRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
        return this;
    }

    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject and related person, going from the latter to the former
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    public DirectRelationship getDirectRelationship() {
        return directRelationship;
    }

    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject and related person, going from the latter to the former
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    public void setDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
    }

    public PersonalRelationships withDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
        return this;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public Object getReciprocalRelationship() {
        return reciprocalRelationship;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public void setReciprocalRelationship(Object reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
    }

    public PersonalRelationships withReciprocalRelationship(Object reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the relationship (where appropriate).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the relationship (where appropriate).
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
     * The date when the relationship started
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the relationship started
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
     * The date when the relationship ended
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the relationship ended
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
     * Comment on the relationship.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Comment on the relationship.
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
        sb.append("relatedPerson");
        sb.append('=');
        sb.append(((this.relatedPerson == null)?"<null>":this.relatedPerson));
        sb.append(',');
        sb.append("directRelationship");
        sb.append('=');
        sb.append(((this.directRelationship == null)?"<null>":this.directRelationship));
        sb.append(',');
        sb.append("reciprocalRelationship");
        sb.append('=');
        sb.append(((this.reciprocalRelationship == null)?"<null>":this.reciprocalRelationship));
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
        result = ((result* 31)+((this.directRelationship == null)? 0 :this.directRelationship.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reciprocalRelationship == null)? 0 :this.reciprocalRelationship.hashCode()));
        result = ((result* 31)+((this.relatedPerson == null)? 0 :this.relatedPerson.hashCode()));
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
        return (((((((((((this.subjectPerson == rhs.subjectPerson)||((this.subjectPerson!= null)&&this.subjectPerson.equals(rhs.subjectPerson)))&&((this.directRelationship == rhs.directRelationship)||((this.directRelationship!= null)&&this.directRelationship.equals(rhs.directRelationship))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reciprocalRelationship == rhs.reciprocalRelationship)||((this.reciprocalRelationship!= null)&&this.reciprocalRelationship.equals(rhs.reciprocalRelationship))))&&((this.relatedPerson == rhs.relatedPerson)||((this.relatedPerson!= null)&&this.relatedPerson.equals(rhs.relatedPerson))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
