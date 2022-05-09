
package com.ellucian.generated.eedm.student_transcript_grades.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequenceNumber",
    "grade",
    "incompleteGrade",
    "awardGradeScheme",
    "changeReason",
    "recordedOn"
})
@Generated("jsonschema2pojo")
public class ChangeDetail {

    /**
     * Sequence Number
     * <p>
     * The sequence number of the grade change.
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("The sequence number of the grade change.")
    private Object sequenceNumber;
    /**
     * Grade
     * <p>
     * The grade entered.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade entered.")
    private Grade__1 grade;
    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    @JsonPropertyDescription("The default incomplete final grade and the extension date associated with the student's grade.")
    private IncompleteGrade__1 incompleteGrade;
    /**
     * Award Grade Scheme
     * <p>
     * The award grade scheme assigned to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    @JsonPropertyDescription("The award grade scheme assigned to the student.")
    private AwardGradeScheme__1 awardGradeScheme;
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
     * The date the grade change was recorded.
     * (Required)
     * 
     */
    @JsonProperty("recordedOn")
    @JsonPropertyDescription("The date the grade change was recorded.")
    private String recordedOn;

    /**
     * Sequence Number
     * <p>
     * The sequence number of the grade change.
     * 
     */
    @JsonProperty("sequenceNumber")
    public Object getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sequence Number
     * <p>
     * The sequence number of the grade change.
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public ChangeDetail withSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
    public Grade__1 getGrade() {
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
    public void setGrade(Grade__1 grade) {
        this.grade = grade;
    }

    public ChangeDetail withGrade(Grade__1 grade) {
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
    public IncompleteGrade__1 getIncompleteGrade() {
        return incompleteGrade;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public void setIncompleteGrade(IncompleteGrade__1 incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
    }

    public ChangeDetail withIncompleteGrade(IncompleteGrade__1 incompleteGrade) {
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
    public AwardGradeScheme__1 getAwardGradeScheme() {
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
    public void setAwardGradeScheme(AwardGradeScheme__1 awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
    }

    public ChangeDetail withAwardGradeScheme(AwardGradeScheme__1 awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
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

    public ChangeDetail withChangeReason(Object changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * Recorded On
     * <p>
     * The date the grade change was recorded.
     * (Required)
     * 
     */
    @JsonProperty("recordedOn")
    public String getRecordedOn() {
        return recordedOn;
    }

    /**
     * Recorded On
     * <p>
     * The date the grade change was recorded.
     * (Required)
     * 
     */
    @JsonProperty("recordedOn")
    public void setRecordedOn(String recordedOn) {
        this.recordedOn = recordedOn;
    }

    public ChangeDetail withRecordedOn(String recordedOn) {
        this.recordedOn = recordedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
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
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
        sb.append(',');
        sb.append("recordedOn");
        sb.append('=');
        sb.append(((this.recordedOn == null)?"<null>":this.recordedOn));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.incompleteGrade == null)? 0 :this.incompleteGrade.hashCode()));
        result = ((result* 31)+((this.recordedOn == null)? 0 :this.recordedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeDetail) == false) {
            return false;
        }
        ChangeDetail rhs = ((ChangeDetail) other);
        return (((((((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber)))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.incompleteGrade == rhs.incompleteGrade)||((this.incompleteGrade!= null)&&this.incompleteGrade.equals(rhs.incompleteGrade))))&&((this.recordedOn == rhs.recordedOn)||((this.recordedOn!= null)&&this.recordedOn.equals(rhs.recordedOn))));
    }

}
