
package com.ellucian.generated.eedm.campus_involvements.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Campus Involvements
 * <p>
 * A person's involvement with a campus organization
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "campusOrganization",
    "startOn",
    "endOn",
    "academicPeriod",
    "role"
})
@Generated("jsonschema2pojo")
public class CampusInvolvements {

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
     * The global identifier of the Campus Involvements.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Campus Involvements.")
    private String id;
    /**
     * Person
     * <p>
     * The id of the student who is involved in the organization.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The id of the student who is involved in the organization.")
    private Person person;
    /**
     * Campus Organization
     * <p>
     * The organization in the campus the student is involved with.
     * (Required)
     * 
     */
    @JsonProperty("campusOrganization")
    @JsonPropertyDescription("The organization in the campus the student is involved with.")
    private CampusOrganization campusOrganization;
    /**
     * Start On
     * <p>
     * The involvement to the organization started on.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The involvement to the organization started on.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The involvement to the organization ended on.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The involvement to the organization ended on.")
    private Object endOn;
    /**
     * Academic Period
     * <p>
     * Academic period in which the student was involved in this organization.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("Academic period in which the student was involved in this organization.")
    private Object academicPeriod;
    /**
     * Role
     * <p>
     * Role of the student in the organization.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Role of the student in the organization.")
    private Object role;

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

    public CampusInvolvements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Campus Involvements.
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
     * The global identifier of the Campus Involvements.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CampusInvolvements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The id of the student who is involved in the organization.
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
     * The id of the student who is involved in the organization.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public CampusInvolvements withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Campus Organization
     * <p>
     * The organization in the campus the student is involved with.
     * (Required)
     * 
     */
    @JsonProperty("campusOrganization")
    public CampusOrganization getCampusOrganization() {
        return campusOrganization;
    }

    /**
     * Campus Organization
     * <p>
     * The organization in the campus the student is involved with.
     * (Required)
     * 
     */
    @JsonProperty("campusOrganization")
    public void setCampusOrganization(CampusOrganization campusOrganization) {
        this.campusOrganization = campusOrganization;
    }

    public CampusInvolvements withCampusOrganization(CampusOrganization campusOrganization) {
        this.campusOrganization = campusOrganization;
        return this;
    }

    /**
     * Start On
     * <p>
     * The involvement to the organization started on.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The involvement to the organization started on.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public CampusInvolvements withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The involvement to the organization ended on.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The involvement to the organization ended on.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public CampusInvolvements withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * Academic period in which the student was involved in this organization.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * Academic period in which the student was involved in this organization.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public CampusInvolvements withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Role
     * <p>
     * Role of the student in the organization.
     * 
     */
    @JsonProperty("role")
    public Object getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * Role of the student in the organization.
     * 
     */
    @JsonProperty("role")
    public void setRole(Object role) {
        this.role = role;
    }

    public CampusInvolvements withRole(Object role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CampusInvolvements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("campusOrganization");
        sb.append('=');
        sb.append(((this.campusOrganization == null)?"<null>":this.campusOrganization));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.campusOrganization == null)? 0 :this.campusOrganization.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampusInvolvements) == false) {
            return false;
        }
        CampusInvolvements rhs = ((CampusInvolvements) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.campusOrganization == rhs.campusOrganization)||((this.campusOrganization!= null)&&this.campusOrganization.equals(rhs.campusOrganization))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))));
    }

}
