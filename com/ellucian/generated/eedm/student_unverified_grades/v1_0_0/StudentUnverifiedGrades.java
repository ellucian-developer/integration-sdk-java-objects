
package com.ellucian.generated.eedm.student_unverified_grades.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Unverified Grades
 * <p>
 * The unverified grades for a student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "sectionRegistration",
    "awardGradeScheme",
    "incompleteGrade",
    "details"
})
@Generated("jsonschema2pojo")
public class StudentUnverifiedGrades {

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
     * Student
     * <p>
     * The student associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student associated with the unverified grade.")
    private Student student;
    /**
     * Section Registration
     * <p>
     * The section registration associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("sectionRegistration")
    @JsonPropertyDescription("The section registration associated with the grade.")
    private SectionRegistration sectionRegistration;
    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme associated with the student.
     * 
     */
    @JsonProperty("awardGradeScheme")
    @JsonPropertyDescription("The award grade scheme associated with the student.")
    private Object awardGradeScheme;
    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    @JsonPropertyDescription("The default incomplete final grade and the extension date associated with the student's grade.")
    private Object incompleteGrade;
    /**
     * Details
     * <p>
     * The grade and/or last attendance details.
     * (Required)
     * 
     */
    @JsonProperty("details")
    @JsonPropertyDescription("The grade and/or last attendance details.")
    private Details details;

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

    public StudentUnverifiedGrades withMetadata(Metadata metadata) {
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

    public StudentUnverifiedGrades withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * The student associated with the unverified grade.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentUnverifiedGrades withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Section Registration
     * <p>
     * The section registration associated with the grade.
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
     * The section registration associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("sectionRegistration")
    public void setSectionRegistration(SectionRegistration sectionRegistration) {
        this.sectionRegistration = sectionRegistration;
    }

    public StudentUnverifiedGrades withSectionRegistration(SectionRegistration sectionRegistration) {
        this.sectionRegistration = sectionRegistration;
        return this;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme associated with the student.
     * 
     */
    @JsonProperty("awardGradeScheme")
    public Object getAwardGradeScheme() {
        return awardGradeScheme;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme associated with the student.
     * 
     */
    @JsonProperty("awardGradeScheme")
    public void setAwardGradeScheme(Object awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
    }

    public StudentUnverifiedGrades withAwardGradeScheme(Object awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
        return this;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public Object getIncompleteGrade() {
        return incompleteGrade;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public void setIncompleteGrade(Object incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
    }

    public StudentUnverifiedGrades withIncompleteGrade(Object incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
        return this;
    }

    /**
     * Details
     * <p>
     * The grade and/or last attendance details.
     * (Required)
     * 
     */
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     * Details
     * <p>
     * The grade and/or last attendance details.
     * (Required)
     * 
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    public StudentUnverifiedGrades withDetails(Details details) {
        this.details = details;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentUnverifiedGrades.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("sectionRegistration");
        sb.append('=');
        sb.append(((this.sectionRegistration == null)?"<null>":this.sectionRegistration));
        sb.append(',');
        sb.append("awardGradeScheme");
        sb.append('=');
        sb.append(((this.awardGradeScheme == null)?"<null>":this.awardGradeScheme));
        sb.append(',');
        sb.append("incompleteGrade");
        sb.append('=');
        sb.append(((this.incompleteGrade == null)?"<null>":this.incompleteGrade));
        sb.append(',');
        sb.append("details");
        sb.append('=');
        sb.append(((this.details == null)?"<null>":this.details));
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
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.incompleteGrade == null)? 0 :this.incompleteGrade.hashCode()));
        result = ((result* 31)+((this.sectionRegistration == null)? 0 :this.sectionRegistration.hashCode()));
        result = ((result* 31)+((this.details == null)? 0 :this.details.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentUnverifiedGrades) == false) {
            return false;
        }
        StudentUnverifiedGrades rhs = ((StudentUnverifiedGrades) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.incompleteGrade == rhs.incompleteGrade)||((this.incompleteGrade!= null)&&this.incompleteGrade.equals(rhs.incompleteGrade))))&&((this.sectionRegistration == rhs.sectionRegistration)||((this.sectionRegistration!= null)&&this.sectionRegistration.equals(rhs.sectionRegistration))))&&((this.details == rhs.details)||((this.details!= null)&&this.details.equals(rhs.details))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
