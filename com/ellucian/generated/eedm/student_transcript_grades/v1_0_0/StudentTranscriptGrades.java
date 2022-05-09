
package com.ellucian.generated.eedm.student_transcript_grades.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Transcript Grades
 * <p>
 * The grades and the grade change details of grades eligible to be displayed on the student’s transcript.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "course",
    "unverifiedGrade",
    "grade",
    "incompleteGrade",
    "awardGradeScheme",
    "creditCategory",
    "credit",
    "changeReason",
    "recordedOn",
    "changeDetails"
})
@Generated("jsonschema2pojo")
public class StudentTranscriptGrades {

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
     * The global identifier of the student transcript grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student transcript grade.")
    private String id;
    /**
     * Student
     * <p>
     * The student associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student associated with the grade.")
    private Student student;
    /**
     * Course
     * <p>
     * The course associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("course")
    @JsonPropertyDescription("The course associated with the grade.")
    private Object course;
    /**
     * Unverified Grade
     * <p>
     * The associated instance of unverified grades.
     * 
     */
    @JsonProperty("unverifiedGrade")
    @JsonPropertyDescription("The associated instance of unverified grades.")
    private Object unverifiedGrade;
    /**
     * Grade
     * <p>
     * The grade entered.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade entered.")
    private Grade grade;
    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    @JsonPropertyDescription("The default incomplete final grade and the extension date associated with the student's grade.")
    private IncompleteGrade incompleteGrade;
    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    @JsonPropertyDescription("The award grade scheme assigned to the student.")
    private AwardGradeScheme awardGradeScheme;
    /**
     * Credit Category
     * <p>
     * The credit category associated with the grade.
     * 
     */
    @JsonProperty("creditCategory")
    @JsonPropertyDescription("The credit category associated with the grade.")
    private Object creditCategory;
    /**
     * Credit
     * <p>
     * The credits associated with the grade.
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("The credits associated with the grade.")
    private Credit credit;
    /**
     * Change Reason
     * <p>
     * The reason specified for a change to a previously entered grade.
     * 
     */
    @JsonProperty("changeReason")
    @JsonPropertyDescription("The reason specified for a change to a previously entered grade.")
    private Object changeReason;
    /**
     * Recorded On
     * <p>
     * The date the grade was recorded.
     * 
     */
    @JsonProperty("recordedOn")
    @JsonPropertyDescription("The date the grade was recorded.")
    private Object recordedOn;
    /**
     * Change Details
     * <p>
     * The grade change details of the grades eligible to be displayed on the transcript.
     * 
     */
    @JsonProperty("changeDetails")
    @JsonPropertyDescription("The grade change details of the grades eligible to be displayed on the transcript.")
    private List<ChangeDetail> changeDetails = new ArrayList<ChangeDetail>();

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

    public StudentTranscriptGrades withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student transcript grade.
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
     * The global identifier of the student transcript grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentTranscriptGrades withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student associated with the grade.
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
     * The student associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentTranscriptGrades withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Course
     * <p>
     * The course associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("course")
    public Object getCourse() {
        return course;
    }

    /**
     * Course
     * <p>
     * The course associated with the grade.
     * (Required)
     * 
     */
    @JsonProperty("course")
    public void setCourse(Object course) {
        this.course = course;
    }

    public StudentTranscriptGrades withCourse(Object course) {
        this.course = course;
        return this;
    }

    /**
     * Unverified Grade
     * <p>
     * The associated instance of unverified grades.
     * 
     */
    @JsonProperty("unverifiedGrade")
    public Object getUnverifiedGrade() {
        return unverifiedGrade;
    }

    /**
     * Unverified Grade
     * <p>
     * The associated instance of unverified grades.
     * 
     */
    @JsonProperty("unverifiedGrade")
    public void setUnverifiedGrade(Object unverifiedGrade) {
        this.unverifiedGrade = unverifiedGrade;
    }

    public StudentTranscriptGrades withUnverifiedGrade(Object unverifiedGrade) {
        this.unverifiedGrade = unverifiedGrade;
        return this;
    }

    /**
     * Grade
     * <p>
     * The grade entered.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public Grade getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade entered.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public StudentTranscriptGrades withGrade(Grade grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public IncompleteGrade getIncompleteGrade() {
        return incompleteGrade;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public void setIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
    }

    public StudentTranscriptGrades withIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
        return this;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    public AwardGradeScheme getAwardGradeScheme() {
        return awardGradeScheme;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    public void setAwardGradeScheme(AwardGradeScheme awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
    }

    public StudentTranscriptGrades withAwardGradeScheme(AwardGradeScheme awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
        return this;
    }

    /**
     * Credit Category
     * <p>
     * The credit category associated with the grade.
     * 
     */
    @JsonProperty("creditCategory")
    public Object getCreditCategory() {
        return creditCategory;
    }

    /**
     * Credit Category
     * <p>
     * The credit category associated with the grade.
     * 
     */
    @JsonProperty("creditCategory")
    public void setCreditCategory(Object creditCategory) {
        this.creditCategory = creditCategory;
    }

    public StudentTranscriptGrades withCreditCategory(Object creditCategory) {
        this.creditCategory = creditCategory;
        return this;
    }

    /**
     * Credit
     * <p>
     * The credits associated with the grade.
     * 
     */
    @JsonProperty("credit")
    public Credit getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * The credits associated with the grade.
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public StudentTranscriptGrades withCredit(Credit credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * The reason specified for a change to a previously entered grade.
     * 
     */
    @JsonProperty("changeReason")
    public Object getChangeReason() {
        return changeReason;
    }

    /**
     * Change Reason
     * <p>
     * The reason specified for a change to a previously entered grade.
     * 
     */
    @JsonProperty("changeReason")
    public void setChangeReason(Object changeReason) {
        this.changeReason = changeReason;
    }

    public StudentTranscriptGrades withChangeReason(Object changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * Recorded On
     * <p>
     * The date the grade was recorded.
     * 
     */
    @JsonProperty("recordedOn")
    public Object getRecordedOn() {
        return recordedOn;
    }

    /**
     * Recorded On
     * <p>
     * The date the grade was recorded.
     * 
     */
    @JsonProperty("recordedOn")
    public void setRecordedOn(Object recordedOn) {
        this.recordedOn = recordedOn;
    }

    public StudentTranscriptGrades withRecordedOn(Object recordedOn) {
        this.recordedOn = recordedOn;
        return this;
    }

    /**
     * Change Details
     * <p>
     * The grade change details of the grades eligible to be displayed on the transcript.
     * 
     */
    @JsonProperty("changeDetails")
    public List<ChangeDetail> getChangeDetails() {
        return changeDetails;
    }

    /**
     * Change Details
     * <p>
     * The grade change details of the grades eligible to be displayed on the transcript.
     * 
     */
    @JsonProperty("changeDetails")
    public void setChangeDetails(List<ChangeDetail> changeDetails) {
        this.changeDetails = changeDetails;
    }

    public StudentTranscriptGrades withChangeDetails(List<ChangeDetail> changeDetails) {
        this.changeDetails = changeDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTranscriptGrades.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        sb.append("unverifiedGrade");
        sb.append('=');
        sb.append(((this.unverifiedGrade == null)?"<null>":this.unverifiedGrade));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("incompleteGrade");
        sb.append('=');
        sb.append(((this.incompleteGrade == null)?"<null>":this.incompleteGrade));
        sb.append(',');
        sb.append("awardGradeScheme");
        sb.append('=');
        sb.append(((this.awardGradeScheme == null)?"<null>":this.awardGradeScheme));
        sb.append(',');
        sb.append("creditCategory");
        sb.append('=');
        sb.append(((this.creditCategory == null)?"<null>":this.creditCategory));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
        sb.append(',');
        sb.append("recordedOn");
        sb.append('=');
        sb.append(((this.recordedOn == null)?"<null>":this.recordedOn));
        sb.append(',');
        sb.append("changeDetails");
        sb.append('=');
        sb.append(((this.changeDetails == null)?"<null>":this.changeDetails));
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
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.incompleteGrade == null)? 0 :this.incompleteGrade.hashCode()));
        result = ((result* 31)+((this.unverifiedGrade == null)? 0 :this.unverifiedGrade.hashCode()));
        result = ((result* 31)+((this.changeDetails == null)? 0 :this.changeDetails.hashCode()));
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.recordedOn == null)? 0 :this.recordedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
        result = ((result* 31)+((this.creditCategory == null)? 0 :this.creditCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTranscriptGrades) == false) {
            return false;
        }
        StudentTranscriptGrades rhs = ((StudentTranscriptGrades) other);
        return ((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.incompleteGrade == rhs.incompleteGrade)||((this.incompleteGrade!= null)&&this.incompleteGrade.equals(rhs.incompleteGrade))))&&((this.unverifiedGrade == rhs.unverifiedGrade)||((this.unverifiedGrade!= null)&&this.unverifiedGrade.equals(rhs.unverifiedGrade))))&&((this.changeDetails == rhs.changeDetails)||((this.changeDetails!= null)&&this.changeDetails.equals(rhs.changeDetails))))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.recordedOn == rhs.recordedOn)||((this.recordedOn!= null)&&this.recordedOn.equals(rhs.recordedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))))&&((this.creditCategory == rhs.creditCategory)||((this.creditCategory!= null)&&this.creditCategory.equals(rhs.creditCategory))));
    }

}
