
package com.ellucian.generated.eedm.student_tag_assignments.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Tag Assignments
 * <p>
 * The custom defined attributes or characteristics (tags) assigned to the student for a period of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "tag",
    "startOn",
    "endOn",
    "startAdministrativePeriod",
    "endAdministrativePeriod"
})
@Generated("jsonschema2pojo")
public class StudentTagAssignments {

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
     * The global identifier of the student tag assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student tag assignment.")
    private String id;
    /**
     * Person
     * <p>
     * The person who has been assigned a tag.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who has been assigned a tag.")
    private Person person;
    /**
     * Tag
     * <p>
     * The custom defined attribute or characteristic (tag) assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    @JsonPropertyDescription("The custom defined attribute or characteristic (tag) assigned to the student.")
    private Tag tag;
    /**
     * Start On
     * <p>
     * The start date for the tag.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date for the tag.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date for the tag.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date for the tag.")
    private Object endOn;
    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the tag.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    @JsonPropertyDescription("The starting administrative period for the tag.")
    private Object startAdministrativePeriod;
    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the tag.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    @JsonPropertyDescription("The ending administrative period for the tag.")
    private Object endAdministrativePeriod;

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

    public StudentTagAssignments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student tag assignment.
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
     * The global identifier of the student tag assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentTagAssignments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who has been assigned a tag.
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
     * The person who has been assigned a tag.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentTagAssignments withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Tag
     * <p>
     * The custom defined attribute or characteristic (tag) assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public Tag getTag() {
        return tag;
    }

    /**
     * Tag
     * <p>
     * The custom defined attribute or characteristic (tag) assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public StudentTagAssignments withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date for the tag.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date for the tag.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public StudentTagAssignments withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date for the tag.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date for the tag.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public StudentTagAssignments withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the tag.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    public Object getStartAdministrativePeriod() {
        return startAdministrativePeriod;
    }

    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the tag.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    public void setStartAdministrativePeriod(Object startAdministrativePeriod) {
        this.startAdministrativePeriod = startAdministrativePeriod;
    }

    public StudentTagAssignments withStartAdministrativePeriod(Object startAdministrativePeriod) {
        this.startAdministrativePeriod = startAdministrativePeriod;
        return this;
    }

    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the tag.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    public Object getEndAdministrativePeriod() {
        return endAdministrativePeriod;
    }

    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the tag.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    public void setEndAdministrativePeriod(Object endAdministrativePeriod) {
        this.endAdministrativePeriod = endAdministrativePeriod;
    }

    public StudentTagAssignments withEndAdministrativePeriod(Object endAdministrativePeriod) {
        this.endAdministrativePeriod = endAdministrativePeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTagAssignments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("startAdministrativePeriod");
        sb.append('=');
        sb.append(((this.startAdministrativePeriod == null)?"<null>":this.startAdministrativePeriod));
        sb.append(',');
        sb.append("endAdministrativePeriod");
        sb.append('=');
        sb.append(((this.endAdministrativePeriod == null)?"<null>":this.endAdministrativePeriod));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.endAdministrativePeriod == null)? 0 :this.endAdministrativePeriod.hashCode()));
        result = ((result* 31)+((this.startAdministrativePeriod == null)? 0 :this.startAdministrativePeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTagAssignments) == false) {
            return false;
        }
        StudentTagAssignments rhs = ((StudentTagAssignments) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.endAdministrativePeriod == rhs.endAdministrativePeriod)||((this.endAdministrativePeriod!= null)&&this.endAdministrativePeriod.equals(rhs.endAdministrativePeriod))))&&((this.startAdministrativePeriod == rhs.startAdministrativePeriod)||((this.startAdministrativePeriod!= null)&&this.startAdministrativePeriod.equals(rhs.startAdministrativePeriod))));
    }

}
