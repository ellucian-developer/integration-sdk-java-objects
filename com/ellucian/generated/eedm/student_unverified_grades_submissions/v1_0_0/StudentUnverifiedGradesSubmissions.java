
package com.ellucian.generated.eedm.student_unverified_grades_submissions.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Unverified Grades Submissions
 * <p>
 * The submissions of unverified grades or grade changes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "sectionRegistration",
    "grade",
    "lastAttendance",
    "submittedBy"
})
@Generated("jsonschema2pojo")
public class StudentUnverifiedGradesSubmissions {

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
     * The global identifier of the student unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student unverified grade.")
    private String id;
    /**
     * Section Registration
     * <p>
     * The section registration associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("sectionRegistration")
    @JsonPropertyDescription("The section registration associated with the unverified grade.")
    private SectionRegistration sectionRegistration;
    /**
     * Grade
     * <p>
     * The grade submission details to be applied.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade submission details to be applied.")
    private Object grade;
    /**
     * Last Attendance
     * <p>
     * The last date or status of attendance associated with the unverified grade.
     * 
     */
    @JsonProperty("lastAttendance")
    @JsonPropertyDescription("The last date or status of attendance associated with the unverified grade.")
    private Object lastAttendance;
    /**
     * Submitted By
     * <p>
     * The instructor who submitted the grade.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The instructor who submitted the grade.")
    private Object submittedBy;

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

    public StudentUnverifiedGradesSubmissions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student unverified grade.
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
     * The global identifier of the student unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentUnverifiedGradesSubmissions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Section Registration
     * <p>
     * The section registration associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("sectionRegistration")
    public SectionRegistration getSectionRegistration() {
        return sectionRegistration;
    }

    /**
     * Section Registration
     * <p>
     * The section registration associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("sectionRegistration")
    public void setSectionRegistration(SectionRegistration sectionRegistration) {
        this.sectionRegistration = sectionRegistration;
    }

    public StudentUnverifiedGradesSubmissions withSectionRegistration(SectionRegistration sectionRegistration) {
        this.sectionRegistration = sectionRegistration;
        return this;
    }

    /**
     * Grade
     * <p>
     * The grade submission details to be applied.
     * 
     */
    @JsonProperty("grade")
    public Object getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade submission details to be applied.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public StudentUnverifiedGradesSubmissions withGrade(Object grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Last Attendance
     * <p>
     * The last date or status of attendance associated with the unverified grade.
     * 
     */
    @JsonProperty("lastAttendance")
    public Object getLastAttendance() {
        return lastAttendance;
    }

    /**
     * Last Attendance
     * <p>
     * The last date or status of attendance associated with the unverified grade.
     * 
     */
    @JsonProperty("lastAttendance")
    public void setLastAttendance(Object lastAttendance) {
        this.lastAttendance = lastAttendance;
    }

    public StudentUnverifiedGradesSubmissions withLastAttendance(Object lastAttendance) {
        this.lastAttendance = lastAttendance;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The instructor who submitted the grade.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The instructor who submitted the grade.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public StudentUnverifiedGradesSubmissions withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentUnverifiedGradesSubmissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sectionRegistration");
        sb.append('=');
        sb.append(((this.sectionRegistration == null)?"<null>":this.sectionRegistration));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("lastAttendance");
        sb.append('=');
        sb.append(((this.lastAttendance == null)?"<null>":this.lastAttendance));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.lastAttendance == null)? 0 :this.lastAttendance.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.sectionRegistration == null)? 0 :this.sectionRegistration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentUnverifiedGradesSubmissions) == false) {
            return false;
        }
        StudentUnverifiedGradesSubmissions rhs = ((StudentUnverifiedGradesSubmissions) other);
        return (((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.lastAttendance == rhs.lastAttendance)||((this.lastAttendance!= null)&&this.lastAttendance.equals(rhs.lastAttendance))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.sectionRegistration == rhs.sectionRegistration)||((this.sectionRegistration!= null)&&this.sectionRegistration.equals(rhs.sectionRegistration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
