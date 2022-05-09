
package com.ellucian.generated.eedm.student_transcript_grades_adjustments.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Detail
 * <p>
 * The details of the adjustments to the student transcript.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "incompleteGrade",
    "changeReason"
})
@Generated("jsonschema2pojo")
public class Detail {

    /**
     * Grade
     * <p>
     * The grade supplied for the adjustment.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade supplied for the adjustment.")
    private Object grade;
    /**
     * Incomplete Grade
     * <p>
     * The adjustments to be applied to the default incomplete final grade and/or the extension date.
     * 
     */
    @JsonProperty("incompleteGrade")
    @JsonPropertyDescription("The adjustments to be applied to the default incomplete final grade and/or the extension date.")
    private IncompleteGrade incompleteGrade;
    /**
     * Change Reason
     * <p>
     * The reason specified for the adjustment.
     * 
     */
    @JsonProperty("changeReason")
    @JsonPropertyDescription("The reason specified for the adjustment.")
    private Object changeReason;

    /**
     * Grade
     * <p>
     * The grade supplied for the adjustment.
     * 
     */
    @JsonProperty("grade")
    public Object getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade supplied for the adjustment.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public Detail withGrade(Object grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Incomplete Grade
     * <p>
     * The adjustments to be applied to the default incomplete final grade and/or the extension date.
     * 
     */
    @JsonProperty("incompleteGrade")
    public IncompleteGrade getIncompleteGrade() {
        return incompleteGrade;
    }

    /**
     * Incomplete Grade
     * <p>
     * The adjustments to be applied to the default incomplete final grade and/or the extension date.
     * 
     */
    @JsonProperty("incompleteGrade")
    public void setIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
    }

    public Detail withIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * The reason specified for the adjustment.
     * 
     */
    @JsonProperty("changeReason")
    public Object getChangeReason() {
        return changeReason;
    }

    /**
     * Change Reason
     * <p>
     * The reason specified for the adjustment.
     * 
     */
    @JsonProperty("changeReason")
    public void setChangeReason(Object changeReason) {
        this.changeReason = changeReason;
    }

    public Detail withChangeReason(Object changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("incompleteGrade");
        sb.append('=');
        sb.append(((this.incompleteGrade == null)?"<null>":this.incompleteGrade));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
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
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.incompleteGrade == null)? 0 :this.incompleteGrade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detail) == false) {
            return false;
        }
        Detail rhs = ((Detail) other);
        return ((((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason)))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.incompleteGrade == rhs.incompleteGrade)||((this.incompleteGrade!= null)&&this.incompleteGrade.equals(rhs.incompleteGrade))));
    }

}
