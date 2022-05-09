
package com.ellucian.generated.eedm.personal_relationship_initiation_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Personal Relationship Initiation Process
 * <p>
 * The initiation of a recorded relationship between two people.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subjectPerson",
    "related",
    "relationshipType",
    "status",
    "startOn",
    "endOn",
    "comment"
})
@Generated("jsonschema2pojo")
public class PersonalRelationshipInitiationProcess {

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
     * Relationship Type
     * <p>
     * The relationship type of the related person to the subject person. For example, the related person is the father of the subject person.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    @JsonPropertyDescription("The relationship type of the related person to the subject person. For example, the related person is the father of the subject person.")
    private RelationshipType relationshipType;
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

    public PersonalRelationshipInitiationProcess withSubjectPerson(SubjectPerson subjectPerson) {
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

    public PersonalRelationshipInitiationProcess withRelated(Object related) {
        this.related = related;
        return this;
    }

    /**
     * Relationship Type
     * <p>
     * The relationship type of the related person to the subject person. For example, the related person is the father of the subject person.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Relationship Type
     * <p>
     * The relationship type of the related person to the subject person. For example, the related person is the father of the subject person.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public PersonalRelationshipInitiationProcess withRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
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

    public PersonalRelationshipInitiationProcess withStatus(Object status) {
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

    public PersonalRelationshipInitiationProcess withStartOn(Object startOn) {
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

    public PersonalRelationshipInitiationProcess withEndOn(Object endOn) {
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

    public PersonalRelationshipInitiationProcess withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalRelationshipInitiationProcess.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subjectPerson");
        sb.append('=');
        sb.append(((this.subjectPerson == null)?"<null>":this.subjectPerson));
        sb.append(',');
        sb.append("related");
        sb.append('=');
        sb.append(((this.related == null)?"<null>":this.related));
        sb.append(',');
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
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
        result = ((result* 31)+((this.related == null)? 0 :this.related.hashCode()));
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalRelationshipInitiationProcess) == false) {
            return false;
        }
        PersonalRelationshipInitiationProcess rhs = ((PersonalRelationshipInitiationProcess) other);
        return ((((((((this.subjectPerson == rhs.subjectPerson)||((this.subjectPerson!= null)&&this.subjectPerson.equals(rhs.subjectPerson)))&&((this.related == rhs.related)||((this.related!= null)&&this.related.equals(rhs.related))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
