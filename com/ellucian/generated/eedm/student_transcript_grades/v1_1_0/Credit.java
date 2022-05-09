
package com.ellucian.generated.eedm.student_transcript_grades.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Credit
 * <p>
 * The credits associated with the grade.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attemptedCredit",
    "earnedCredit",
    "qualityPoint",
    "repeatedSection"
})
@Generated("jsonschema2pojo")
public class Credit {

    /**
     * Attempted Credit
     * <p>
     * The attempted credits associated with the grade.
     * 
     */
    @JsonProperty("attemptedCredit")
    @JsonPropertyDescription("The attempted credits associated with the grade.")
    private Object attemptedCredit;
    /**
     * Earned Credit
     * <p>
     * The earned credits associated with the grade.
     * 
     */
    @JsonProperty("earnedCredit")
    @JsonPropertyDescription("The earned credits associated with the grade.")
    private Object earnedCredit;
    /**
     * Quality Point
     * <p>
     * The quality points used to compute the GPA.
     * 
     */
    @JsonProperty("qualityPoint")
    @JsonPropertyDescription("The quality points used to compute the GPA.")
    private QualityPoint qualityPoint;
    /**
     * Repeated Section
     * <p>
     * The indicator of how the grade should be used in the GPA calculation.
     * 
     */
    @JsonProperty("repeatedSection")
    @JsonPropertyDescription("The indicator of how the grade should be used in the GPA calculation.")
    private Object repeatedSection;

    /**
     * Attempted Credit
     * <p>
     * The attempted credits associated with the grade.
     * 
     */
    @JsonProperty("attemptedCredit")
    public Object getAttemptedCredit() {
        return attemptedCredit;
    }

    /**
     * Attempted Credit
     * <p>
     * The attempted credits associated with the grade.
     * 
     */
    @JsonProperty("attemptedCredit")
    public void setAttemptedCredit(Object attemptedCredit) {
        this.attemptedCredit = attemptedCredit;
    }

    public Credit withAttemptedCredit(Object attemptedCredit) {
        this.attemptedCredit = attemptedCredit;
        return this;
    }

    /**
     * Earned Credit
     * <p>
     * The earned credits associated with the grade.
     * 
     */
    @JsonProperty("earnedCredit")
    public Object getEarnedCredit() {
        return earnedCredit;
    }

    /**
     * Earned Credit
     * <p>
     * The earned credits associated with the grade.
     * 
     */
    @JsonProperty("earnedCredit")
    public void setEarnedCredit(Object earnedCredit) {
        this.earnedCredit = earnedCredit;
    }

    public Credit withEarnedCredit(Object earnedCredit) {
        this.earnedCredit = earnedCredit;
        return this;
    }

    /**
     * Quality Point
     * <p>
     * The quality points used to compute the GPA.
     * 
     */
    @JsonProperty("qualityPoint")
    public QualityPoint getQualityPoint() {
        return qualityPoint;
    }

    /**
     * Quality Point
     * <p>
     * The quality points used to compute the GPA.
     * 
     */
    @JsonProperty("qualityPoint")
    public void setQualityPoint(QualityPoint qualityPoint) {
        this.qualityPoint = qualityPoint;
    }

    public Credit withQualityPoint(QualityPoint qualityPoint) {
        this.qualityPoint = qualityPoint;
        return this;
    }

    /**
     * Repeated Section
     * <p>
     * The indicator of how the grade should be used in the GPA calculation.
     * 
     */
    @JsonProperty("repeatedSection")
    public Object getRepeatedSection() {
        return repeatedSection;
    }

    /**
     * Repeated Section
     * <p>
     * The indicator of how the grade should be used in the GPA calculation.
     * 
     */
    @JsonProperty("repeatedSection")
    public void setRepeatedSection(Object repeatedSection) {
        this.repeatedSection = repeatedSection;
    }

    public Credit withRepeatedSection(Object repeatedSection) {
        this.repeatedSection = repeatedSection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attemptedCredit");
        sb.append('=');
        sb.append(((this.attemptedCredit == null)?"<null>":this.attemptedCredit));
        sb.append(',');
        sb.append("earnedCredit");
        sb.append('=');
        sb.append(((this.earnedCredit == null)?"<null>":this.earnedCredit));
        sb.append(',');
        sb.append("qualityPoint");
        sb.append('=');
        sb.append(((this.qualityPoint == null)?"<null>":this.qualityPoint));
        sb.append(',');
        sb.append("repeatedSection");
        sb.append('=');
        sb.append(((this.repeatedSection == null)?"<null>":this.repeatedSection));
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
        result = ((result* 31)+((this.repeatedSection == null)? 0 :this.repeatedSection.hashCode()));
        result = ((result* 31)+((this.attemptedCredit == null)? 0 :this.attemptedCredit.hashCode()));
        result = ((result* 31)+((this.earnedCredit == null)? 0 :this.earnedCredit.hashCode()));
        result = ((result* 31)+((this.qualityPoint == null)? 0 :this.qualityPoint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return (((((this.repeatedSection == rhs.repeatedSection)||((this.repeatedSection!= null)&&this.repeatedSection.equals(rhs.repeatedSection)))&&((this.attemptedCredit == rhs.attemptedCredit)||((this.attemptedCredit!= null)&&this.attemptedCredit.equals(rhs.attemptedCredit))))&&((this.earnedCredit == rhs.earnedCredit)||((this.earnedCredit!= null)&&this.earnedCredit.equals(rhs.earnedCredit))))&&((this.qualityPoint == rhs.qualityPoint)||((this.qualityPoint!= null)&&this.qualityPoint.equals(rhs.qualityPoint))));
    }

}
