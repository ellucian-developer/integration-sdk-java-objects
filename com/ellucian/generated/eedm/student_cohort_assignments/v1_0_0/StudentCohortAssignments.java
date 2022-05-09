
package com.ellucian.generated.eedm.student_cohort_assignments.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Cohort Assignments
 * <p>
 * The groupings of students for reporting/tracking purposes (cohorts) to which the student is assigned for a period of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "cohort",
    "academicLevel",
    "startOn",
    "endOn",
    "startAdministrativePeriod",
    "endAdministrativePeriod",
    "participationStatus"
})
@Generated("jsonschema2pojo")
public class StudentCohortAssignments {

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
     * The global identifier of the student cohort assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student cohort assignment.")
    private String id;
    /**
     * Person
     * <p>
     * The person who has been assigned to a cohort.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who has been assigned to a cohort.")
    private Person person;
    /**
     * Cohort
     * <p>
     * The grouping of students for reporting/tracking purposes (cohorts) to which the student is assigned for a period of time.
     * (Required)
     * 
     */
    @JsonProperty("cohort")
    @JsonPropertyDescription("The grouping of students for reporting/tracking purposes (cohorts) to which the student is assigned for a period of time.")
    private Cohort cohort;
    /**
     * Academic Level
     * <p>
     * The academic level associated with the student.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the student.")
    private Object academicLevel;
    /**
     * Start On
     * <p>
     * The effective start date of the cohort.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The effective start date of the cohort.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date of the cohort.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of the cohort.")
    private Object endOn;
    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the cohort.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    @JsonPropertyDescription("The starting administrative period for the cohort.")
    private Object startAdministrativePeriod;
    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the cohort.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    @JsonPropertyDescription("The ending administrative period for the cohort.")
    private Object endAdministrativePeriod;
    /**
     * Participation Status
     * <p>
     * An indicator if the student's participation in the cohort has been suspended due to military, peace corps, religious mission, death, disability, etc.
     * 
     */
    @JsonProperty("participationStatus")
    @JsonPropertyDescription("An indicator if the student's participation in the cohort has been suspended due to military, peace corps, religious mission, death, disability, etc.")
    private Object participationStatus;

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

    public StudentCohortAssignments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student cohort assignment.
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
     * The global identifier of the student cohort assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCohortAssignments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who has been assigned to a cohort.
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
     * The person who has been assigned to a cohort.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentCohortAssignments withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Cohort
     * <p>
     * The grouping of students for reporting/tracking purposes (cohorts) to which the student is assigned for a period of time.
     * (Required)
     * 
     */
    @JsonProperty("cohort")
    public Cohort getCohort() {
        return cohort;
    }

    /**
     * Cohort
     * <p>
     * The grouping of students for reporting/tracking purposes (cohorts) to which the student is assigned for a period of time.
     * (Required)
     * 
     */
    @JsonProperty("cohort")
    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public StudentCohortAssignments withCohort(Cohort cohort) {
        this.cohort = cohort;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the student.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the student.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public StudentCohortAssignments withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Start On
     * <p>
     * The effective start date of the cohort.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The effective start date of the cohort.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public StudentCohortAssignments withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of the cohort.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date of the cohort.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public StudentCohortAssignments withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the cohort.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    public Object getStartAdministrativePeriod() {
        return startAdministrativePeriod;
    }

    /**
     * Start Administrative Period
     * <p>
     * The starting administrative period for the cohort.
     * 
     */
    @JsonProperty("startAdministrativePeriod")
    public void setStartAdministrativePeriod(Object startAdministrativePeriod) {
        this.startAdministrativePeriod = startAdministrativePeriod;
    }

    public StudentCohortAssignments withStartAdministrativePeriod(Object startAdministrativePeriod) {
        this.startAdministrativePeriod = startAdministrativePeriod;
        return this;
    }

    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the cohort.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    public Object getEndAdministrativePeriod() {
        return endAdministrativePeriod;
    }

    /**
     * End Administrative Period
     * <p>
     * The ending administrative period for the cohort.
     * 
     */
    @JsonProperty("endAdministrativePeriod")
    public void setEndAdministrativePeriod(Object endAdministrativePeriod) {
        this.endAdministrativePeriod = endAdministrativePeriod;
    }

    public StudentCohortAssignments withEndAdministrativePeriod(Object endAdministrativePeriod) {
        this.endAdministrativePeriod = endAdministrativePeriod;
        return this;
    }

    /**
     * Participation Status
     * <p>
     * An indicator if the student's participation in the cohort has been suspended due to military, peace corps, religious mission, death, disability, etc.
     * 
     */
    @JsonProperty("participationStatus")
    public Object getParticipationStatus() {
        return participationStatus;
    }

    /**
     * Participation Status
     * <p>
     * An indicator if the student's participation in the cohort has been suspended due to military, peace corps, religious mission, death, disability, etc.
     * 
     */
    @JsonProperty("participationStatus")
    public void setParticipationStatus(Object participationStatus) {
        this.participationStatus = participationStatus;
    }

    public StudentCohortAssignments withParticipationStatus(Object participationStatus) {
        this.participationStatus = participationStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCohortAssignments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("cohort");
        sb.append('=');
        sb.append(((this.cohort == null)?"<null>":this.cohort));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
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
        sb.append("participationStatus");
        sb.append('=');
        sb.append(((this.participationStatus == null)?"<null>":this.participationStatus));
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
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.participationStatus == null)? 0 :this.participationStatus.hashCode()));
        result = ((result* 31)+((this.cohort == null)? 0 :this.cohort.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.endAdministrativePeriod == null)? 0 :this.endAdministrativePeriod.hashCode()));
        result = ((result* 31)+((this.startAdministrativePeriod == null)? 0 :this.startAdministrativePeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCohortAssignments) == false) {
            return false;
        }
        StudentCohortAssignments rhs = ((StudentCohortAssignments) other);
        return (((((((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.participationStatus == rhs.participationStatus)||((this.participationStatus!= null)&&this.participationStatus.equals(rhs.participationStatus))))&&((this.cohort == rhs.cohort)||((this.cohort!= null)&&this.cohort.equals(rhs.cohort))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.endAdministrativePeriod == rhs.endAdministrativePeriod)||((this.endAdministrativePeriod!= null)&&this.endAdministrativePeriod.equals(rhs.endAdministrativePeriod))))&&((this.startAdministrativePeriod == rhs.startAdministrativePeriod)||((this.startAdministrativePeriod!= null)&&this.startAdministrativePeriod.equals(rhs.startAdministrativePeriod))));
    }

}
