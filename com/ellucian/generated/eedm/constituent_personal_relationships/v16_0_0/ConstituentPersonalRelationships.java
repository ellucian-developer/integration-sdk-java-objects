
package com.ellucian.generated.eedm.constituent_personal_relationships.v16_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Personal Relationships
 * <p>
 * A kind of relationship between two people who are recorded as constituents.
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
    "relationshipOriginLocation",
    "startOn",
    "endOn",
    "comment",
    "source"
})
@Generated("jsonschema2pojo")
public class ConstituentPersonalRelationships {

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
    private Object relatedPerson;
    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject and related person, going from the latter to the former.
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    @JsonPropertyDescription("The relationship between the subject and related person, going from the latter to the former.")
    private DirectRelationship directRelationship;
    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons.
     * (Required)
     * 
     */
    @JsonProperty("reciprocalRelationship")
    @JsonPropertyDescription("The reverse relationship between the persons.")
    private ReciprocalRelationship reciprocalRelationship;
    /**
     * Relationship Origin Location
     * <p>
     * The place where the relationship started (e.g., the place of marriage)
     * 
     */
    @JsonProperty("relationshipOriginLocation")
    @JsonPropertyDescription("The place where the relationship started (e.g., the place of marriage)")
    private String relationshipOriginLocation;
    /**
     * Start Date
     * <p>
     * The date when the relationship started
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the relationship started")
    private StartOn startOn;
    /**
     * End Date
     * <p>
     * The date when the relationship ended
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the relationship ended")
    private EndOn endOn;
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
     * Source
     * <p>
     * The source of the relationship information
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the relationship information")
    private Object source;

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

    public ConstituentPersonalRelationships withMetadata(Metadata metadata) {
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

    public ConstituentPersonalRelationships withId(String id) {
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

    public ConstituentPersonalRelationships withSubjectPerson(SubjectPerson subjectPerson) {
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
    public Object getRelatedPerson() {
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
    public void setRelatedPerson(Object relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public ConstituentPersonalRelationships withRelatedPerson(Object relatedPerson) {
        this.relatedPerson = relatedPerson;
        return this;
    }

    /**
     * Direct Relationship
     * <p>
     * The relationship between the subject and related person, going from the latter to the former.
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
     * The relationship between the subject and related person, going from the latter to the former.
     * (Required)
     * 
     */
    @JsonProperty("directRelationship")
    public void setDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
    }

    public ConstituentPersonalRelationships withDirectRelationship(DirectRelationship directRelationship) {
        this.directRelationship = directRelationship;
        return this;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons.
     * (Required)
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public ReciprocalRelationship getReciprocalRelationship() {
        return reciprocalRelationship;
    }

    /**
     * Reciprocal Relationship
     * <p>
     * The reverse relationship between the persons.
     * (Required)
     * 
     */
    @JsonProperty("reciprocalRelationship")
    public void setReciprocalRelationship(ReciprocalRelationship reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
    }

    public ConstituentPersonalRelationships withReciprocalRelationship(ReciprocalRelationship reciprocalRelationship) {
        this.reciprocalRelationship = reciprocalRelationship;
        return this;
    }

    /**
     * Relationship Origin Location
     * <p>
     * The place where the relationship started (e.g., the place of marriage)
     * 
     */
    @JsonProperty("relationshipOriginLocation")
    public String getRelationshipOriginLocation() {
        return relationshipOriginLocation;
    }

    /**
     * Relationship Origin Location
     * <p>
     * The place where the relationship started (e.g., the place of marriage)
     * 
     */
    @JsonProperty("relationshipOriginLocation")
    public void setRelationshipOriginLocation(String relationshipOriginLocation) {
        this.relationshipOriginLocation = relationshipOriginLocation;
    }

    public ConstituentPersonalRelationships withRelationshipOriginLocation(String relationshipOriginLocation) {
        this.relationshipOriginLocation = relationshipOriginLocation;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date when the relationship started
     * 
     */
    @JsonProperty("startOn")
    public StartOn getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date when the relationship started
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(StartOn startOn) {
        this.startOn = startOn;
    }

    public ConstituentPersonalRelationships withStartOn(StartOn startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date when the relationship ended
     * 
     */
    @JsonProperty("endOn")
    public EndOn getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date when the relationship ended
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(EndOn endOn) {
        this.endOn = endOn;
    }

    public ConstituentPersonalRelationships withEndOn(EndOn endOn) {
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

    public ConstituentPersonalRelationships withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the relationship information
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the relationship information
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentPersonalRelationships withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentPersonalRelationships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("relationshipOriginLocation");
        sb.append('=');
        sb.append(((this.relationshipOriginLocation == null)?"<null>":this.relationshipOriginLocation));
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.relationshipOriginLocation == null)? 0 :this.relationshipOriginLocation.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.reciprocalRelationship == null)? 0 :this.reciprocalRelationship.hashCode()));
        result = ((result* 31)+((this.relatedPerson == null)? 0 :this.relatedPerson.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentPersonalRelationships) == false) {
            return false;
        }
        ConstituentPersonalRelationships rhs = ((ConstituentPersonalRelationships) other);
        return ((((((((((((this.subjectPerson == rhs.subjectPerson)||((this.subjectPerson!= null)&&this.subjectPerson.equals(rhs.subjectPerson)))&&((this.directRelationship == rhs.directRelationship)||((this.directRelationship!= null)&&this.directRelationship.equals(rhs.directRelationship))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.relationshipOriginLocation == rhs.relationshipOriginLocation)||((this.relationshipOriginLocation!= null)&&this.relationshipOriginLocation.equals(rhs.relationshipOriginLocation))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.reciprocalRelationship == rhs.reciprocalRelationship)||((this.reciprocalRelationship!= null)&&this.reciprocalRelationship.equals(rhs.reciprocalRelationship))))&&((this.relatedPerson == rhs.relatedPerson)||((this.relatedPerson!= null)&&this.relatedPerson.equals(rhs.relatedPerson))));
    }

}
