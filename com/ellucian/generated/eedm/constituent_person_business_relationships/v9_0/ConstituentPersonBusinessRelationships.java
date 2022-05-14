
package com.ellucian.generated.eedm.constituent_person_business_relationships.v9_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Person Business Relationships
 * <p>
 * Information about business relationships between constituents, at least one of whom is a person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "relatedParty",
    "directRelationship",
    "reciprocalRelationship",
    "relationshipDetails",
    "status",
    "startOn",
    "endOn",
    "source",
    "comment"
})
@Generated("jsonschema2pojo")
public class ConstituentPersonBusinessRelationships {

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
     * The global identifier of the business relationship
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the business relationship")
    private String id;
    /**
     * Person
     * <p>
     * The subject person involved in the relationship
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The subject person involved in the relationship")
    private Person person;
    /**
     * Related Party
     * <p>
     * The other party of the relationship
     * (Required)
     * 
     */
    @JsonProperty("relatedParty")
    @JsonPropertyDescription("The other party of the relationship")
    private Object relatedParty;
    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject person and the other party, pointing from the former to the latter
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    @JsonPropertyDescription("The relationship between the subject person and the other party, pointing from the former to the latter")
    private DirectRelationship directRelationship;
    /**
     * Reciprocal Relationship
     * <p>
     * The relationship between the subject person and the other party, pointing from the latter to the former
     * 
     */
    @JsonProperty("reciprocalRelationship")
    @JsonPropertyDescription("The relationship between the subject person and the other party, pointing from the latter to the former")
    private Object reciprocalRelationship;
    /**
     * Relationship Details
     * <p>
     * Detailed information about the relationship depending on its type
     * 
     */
    @JsonProperty("relationshipDetails")
    @JsonPropertyDescription("Detailed information about the relationship depending on its type")
    private Object relationshipDetails;
    /**
     * Status
     * <p>
     * The status of the relationship
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the relationship")
    private Status status;
    /**
     * Start On
     * <p>
     * The start date of the relationship
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the relationship")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date of the relationship
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the relationship")
    private Object endOn;
    /**
     * Source
     * <p>
     * The source of information about the relationship
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of information about the relationship")
    private Object source;
    /**
     * Comment
     * <p>
     * The comment about the relationship
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment about the relationship")
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

    public ConstituentPersonBusinessRelationships withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the business relationship
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
     * The global identifier of the business relationship
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentPersonBusinessRelationships withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The subject person involved in the relationship
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The subject person involved in the relationship
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public ConstituentPersonBusinessRelationships withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Related Party
     * <p>
     * The other party of the relationship
     * (Required)
     * 
     */
    @JsonProperty("relatedParty")
    public Object getRelatedParty() {
        return relatedParty;
    }

    /**
     * Related Party
     * <p>
     * The other party of the relationship
     * (Required)
     * 
     */
    @JsonProperty("relatedParty")
    public void setRelatedParty(Object relatedParty) {
        this.relatedParty = relatedParty;
    }

    public ConstituentPersonBusinessRelationships withRelatedParty(Object relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject person and the other party, pointing from the former to the latter
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
     * The relationship between the subject person and the other party, pointing from the former to the latter
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    public void setDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
    }

    public ConstituentPersonBusinessRelationships withDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
        return this;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The relationship between the subject person and the other party, pointing from the latter to the former
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public Object getReciprocalRelationship() {
        return reciprocalRelationship;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The relationship between the subject person and the other party, pointing from the latter to the former
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public void setReciprocalRelationship(Object reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
    }

    public ConstituentPersonBusinessRelationships withReciprocalRelationship(Object reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
        return this;
    }

    /**
     * Relationship Details
     * <p>
     * Detailed information about the relationship depending on its type
     * 
     */
    @JsonProperty("relationshipDetails")
    public Object getRelationshipDetails() {
        return relationshipDetails;
    }

    /**
     * Relationship Details
     * <p>
     * Detailed information about the relationship depending on its type
     * 
     */
    @JsonProperty("relationshipDetails")
    public void setRelationshipDetails(Object relationshipDetails) {
        this.relationshipDetails = relationshipDetails;
    }

    public ConstituentPersonBusinessRelationships withRelationshipDetails(Object relationshipDetails) {
        this.relationshipDetails = relationshipDetails;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the relationship
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the relationship
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public ConstituentPersonBusinessRelationships withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the relationship
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the relationship
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public ConstituentPersonBusinessRelationships withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the relationship
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the relationship
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public ConstituentPersonBusinessRelationships withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of information about the relationship
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of information about the relationship
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentPersonBusinessRelationships withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment about the relationship
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment about the relationship
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ConstituentPersonBusinessRelationships withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentPersonBusinessRelationships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("relatedParty");
        sb.append('=');
        sb.append(((this.relatedParty == null)?"<null>":this.relatedParty));
        sb.append(',');
        sb.append("directRelationship");
        sb.append('=');
        sb.append(((this.directRelationship == null)?"<null>":this.directRelationship));
        sb.append(',');
        sb.append("reciprocalRelationship");
        sb.append('=');
        sb.append(((this.reciprocalRelationship == null)?"<null>":this.reciprocalRelationship));
        sb.append(',');
        sb.append("relationshipDetails");
        sb.append('=');
        sb.append(((this.relationshipDetails == null)?"<null>":this.relationshipDetails));
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.directRelationship == null)? 0 :this.directRelationship.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.relatedParty == null)? 0 :this.relatedParty.hashCode()));
        result = ((result* 31)+((this.relationshipDetails == null)? 0 :this.relationshipDetails.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reciprocalRelationship == null)? 0 :this.reciprocalRelationship.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentPersonBusinessRelationships) == false) {
            return false;
        }
        ConstituentPersonBusinessRelationships rhs = ((ConstituentPersonBusinessRelationships) other);
        return (((((((((((((this.directRelationship == rhs.directRelationship)||((this.directRelationship!= null)&&this.directRelationship.equals(rhs.directRelationship)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.relatedParty == rhs.relatedParty)||((this.relatedParty!= null)&&this.relatedParty.equals(rhs.relatedParty))))&&((this.relationshipDetails == rhs.relationshipDetails)||((this.relationshipDetails!= null)&&this.relationshipDetails.equals(rhs.relationshipDetails))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reciprocalRelationship == rhs.reciprocalRelationship)||((this.reciprocalRelationship!= null)&&this.reciprocalRelationship.equals(rhs.reciprocalRelationship))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
