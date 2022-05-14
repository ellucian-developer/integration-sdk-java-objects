
package com.ellucian.generated.eedm.student_course_transfers.v13_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Course Transfers
 * <p>
 * Coursework completed at external institutions for which students have been awarded credit at the home institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "equivalentCourse",
    "transferredFrom",
    "academicLevel",
    "academicPrograms",
    "academicPeriod",
    "awardGradeScheme",
    "grade",
    "qualityPoints",
    "credit",
    "equivalencyAppliedOn",
    "status"
})
@Generated("jsonschema2pojo")
public class StudentCourseTransfers {

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
     * The global identifier of the student course transfer.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student course transfer.")
    private String id;
    /**
     * Student
     * <p>
     * The student who received credit for the transferred course from an external institution.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student who received credit for the transferred course from an external institution.")
    private Student student;
    /**
     * Equivalent Course
     * <p>
     * The home institution course equivalent to the course at the external institution.
     * (Required)
     * 
     */
    @JsonProperty("equivalentCourse")
    @JsonPropertyDescription("The home institution course equivalent to the course at the external institution.")
    private EquivalentCourse equivalentCourse;
    /**
     * Transferred From
     * <p>
     * The external institution where the course was originally completed.
     * (Required)
     * 
     */
    @JsonProperty("transferredFrom")
    @JsonPropertyDescription("The external institution where the course was originally completed.")
    private TransferredFrom transferredFrom;
    /**
     * Academic Level
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level (for example, 'Under Graduate' or 'Graduate') associated with the articulated/equivalent course.")
    private AcademicLevel academicLevel;
    /**
     * Academic Programs
     * <p>
     * The academic program(s) to which the articulated/equivalent course has been applied.
     * 
     */
    @JsonProperty("academicPrograms")
    @JsonPropertyDescription("The academic program(s) to which the articulated/equivalent course has been applied.")
    private List<AcademicProgram> academicPrograms = new ArrayList<AcademicProgram>();
    /**
     * Academic Period
     * <p>
     * The academic period assigned to the articulated/equivalent course.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period assigned to the articulated/equivalent course.")
    private Object academicPeriod;
    /**
     * Award Grade Scheme
     * <p>
     * The grade scheme that was used to award a grade to the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardGradeScheme")
    @JsonPropertyDescription("The grade scheme that was used to award a grade to the articulated/equivalent course.")
    private Object awardGradeScheme;
    /**
     * Grade
     * <p>
     * The grade that was awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade that was awarded to the articulated/equivalent course.")
    private Object grade;
    /**
     * Quality Points
     * <p>
     * A numeric value that represents the weight associated with the grade awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("A numeric value that represents the weight associated with the grade awarded to the articulated/equivalent course.")
    private Object qualityPoints;
    /**
     * Credit
     * <p>
     * The unit specification that was awarded to the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("The unit specification that was awarded to the articulated/equivalent course.")
    private Credit credit;
    /**
     * Equivalency Applied On
     * <p>
     * The date when the equivalency was officially applied to the student's record at the home institution.
     * 
     */
    @JsonProperty("equivalencyAppliedOn")
    @JsonPropertyDescription("The date when the equivalency was officially applied to the student's record at the home institution.")
    private Object equivalencyAppliedOn;
    /**
     * Status
     * <p>
     * The status of the transferred course.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the transferred course.")
    private Object status;

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

    public StudentCourseTransfers withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student course transfer.
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
     * The global identifier of the student course transfer.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCourseTransfers withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student who received credit for the transferred course from an external institution.
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
     * The student who received credit for the transferred course from an external institution.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentCourseTransfers withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Equivalent Course
     * <p>
     * The home institution course equivalent to the course at the external institution.
     * (Required)
     * 
     */
    @JsonProperty("equivalentCourse")
    public EquivalentCourse getEquivalentCourse() {
        return equivalentCourse;
    }

    /**
     * Equivalent Course
     * <p>
     * The home institution course equivalent to the course at the external institution.
     * (Required)
     * 
     */
    @JsonProperty("equivalentCourse")
    public void setEquivalentCourse(EquivalentCourse equivalentCourse) {
        this.equivalentCourse = equivalentCourse;
    }

    public StudentCourseTransfers withEquivalentCourse(EquivalentCourse equivalentCourse) {
        this.equivalentCourse = equivalentCourse;
        return this;
    }

    /**
     * Transferred From
     * <p>
     * The external institution where the course was originally completed.
     * (Required)
     * 
     */
    @JsonProperty("transferredFrom")
    public TransferredFrom getTransferredFrom() {
        return transferredFrom;
    }

    /**
     * Transferred From
     * <p>
     * The external institution where the course was originally completed.
     * (Required)
     * 
     */
    @JsonProperty("transferredFrom")
    public void setTransferredFrom(TransferredFrom transferredFrom) {
        this.transferredFrom = transferredFrom;
    }

    public StudentCourseTransfers withTransferredFrom(TransferredFrom transferredFrom) {
        this.transferredFrom = transferredFrom;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public StudentCourseTransfers withAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Academic Programs
     * <p>
     * The academic program(s) to which the articulated/equivalent course has been applied.
     * 
     */
    @JsonProperty("academicPrograms")
    public List<AcademicProgram> getAcademicPrograms() {
        return academicPrograms;
    }

    /**
     * Academic Programs
     * <p>
     * The academic program(s) to which the articulated/equivalent course has been applied.
     * 
     */
    @JsonProperty("academicPrograms")
    public void setAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
    }

    public StudentCourseTransfers withAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period assigned to the articulated/equivalent course.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period assigned to the articulated/equivalent course.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentCourseTransfers withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The grade scheme that was used to award a grade to the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardGradeScheme")
    public Object getAwardGradeScheme() {
        return awardGradeScheme;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The grade scheme that was used to award a grade to the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardGradeScheme")
    public void setAwardGradeScheme(Object awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
    }

    public StudentCourseTransfers withAwardGradeScheme(Object awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
        return this;
    }

    /**
     * Grade
     * <p>
     * The grade that was awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("grade")
    public Object getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade that was awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public StudentCourseTransfers withGrade(Object grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * A numeric value that represents the weight associated with the grade awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("qualityPoints")
    public Object getQualityPoints() {
        return qualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * A numeric value that represents the weight associated with the grade awarded to the articulated/equivalent course.
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Object qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public StudentCourseTransfers withQualityPoints(Object qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    /**
     * Credit
     * <p>
     * The unit specification that was awarded to the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("credit")
    public Credit getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * The unit specification that was awarded to the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public StudentCourseTransfers withCredit(Credit credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Equivalency Applied On
     * <p>
     * The date when the equivalency was officially applied to the student's record at the home institution.
     * 
     */
    @JsonProperty("equivalencyAppliedOn")
    public Object getEquivalencyAppliedOn() {
        return equivalencyAppliedOn;
    }

    /**
     * Equivalency Applied On
     * <p>
     * The date when the equivalency was officially applied to the student's record at the home institution.
     * 
     */
    @JsonProperty("equivalencyAppliedOn")
    public void setEquivalencyAppliedOn(Object equivalencyAppliedOn) {
        this.equivalencyAppliedOn = equivalencyAppliedOn;
    }

    public StudentCourseTransfers withEquivalencyAppliedOn(Object equivalencyAppliedOn) {
        this.equivalencyAppliedOn = equivalencyAppliedOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the transferred course.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the transferred course.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public StudentCourseTransfers withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseTransfers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("equivalentCourse");
        sb.append('=');
        sb.append(((this.equivalentCourse == null)?"<null>":this.equivalentCourse));
        sb.append(',');
        sb.append("transferredFrom");
        sb.append('=');
        sb.append(((this.transferredFrom == null)?"<null>":this.transferredFrom));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("academicPrograms");
        sb.append('=');
        sb.append(((this.academicPrograms == null)?"<null>":this.academicPrograms));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("awardGradeScheme");
        sb.append('=');
        sb.append(((this.awardGradeScheme == null)?"<null>":this.awardGradeScheme));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("qualityPoints");
        sb.append('=');
        sb.append(((this.qualityPoints == null)?"<null>":this.qualityPoints));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("equivalencyAppliedOn");
        sb.append('=');
        sb.append(((this.equivalencyAppliedOn == null)?"<null>":this.equivalencyAppliedOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.transferredFrom == null)? 0 :this.transferredFrom.hashCode()));
        result = ((result* 31)+((this.academicPrograms == null)? 0 :this.academicPrograms.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.equivalentCourse == null)? 0 :this.equivalentCourse.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.equivalencyAppliedOn == null)? 0 :this.equivalencyAppliedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseTransfers) == false) {
            return false;
        }
        StudentCourseTransfers rhs = ((StudentCourseTransfers) other);
        return (((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.transferredFrom == rhs.transferredFrom)||((this.transferredFrom!= null)&&this.transferredFrom.equals(rhs.transferredFrom))))&&((this.academicPrograms == rhs.academicPrograms)||((this.academicPrograms!= null)&&this.academicPrograms.equals(rhs.academicPrograms))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.equivalentCourse == rhs.equivalentCourse)||((this.equivalentCourse!= null)&&this.equivalentCourse.equals(rhs.equivalentCourse))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.equivalencyAppliedOn == rhs.equivalencyAppliedOn)||((this.equivalencyAppliedOn!= null)&&this.equivalencyAppliedOn.equals(rhs.equivalencyAppliedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
