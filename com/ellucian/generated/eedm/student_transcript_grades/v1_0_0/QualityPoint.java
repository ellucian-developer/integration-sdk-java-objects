
package com.ellucian.generated.eedm.student_transcript_grades.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Quality Point
 * <p>
 * The quality points used to compute the GPA.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nonWeighted",
    "gpa"
})
@Generated("jsonschema2pojo")
public class QualityPoint {

    /**
     * Non Weighted
     * <p>
     * The base quality points used to compute the GPA.
     * 
     */
    @JsonProperty("nonWeighted")
    @JsonPropertyDescription("The base quality points used to compute the GPA.")
    private Object nonWeighted;
    /**
     * GPA
     * <p>
     * The weighted quality points used to compute the GPA.
     * 
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("The weighted quality points used to compute the GPA.")
    private Object gpa;

    /**
     * Non Weighted
     * <p>
     * The base quality points used to compute the GPA.
     * 
     */
    @JsonProperty("nonWeighted")
    public Object getNonWeighted() {
        return nonWeighted;
    }

    /**
     * Non Weighted
     * <p>
     * The base quality points used to compute the GPA.
     * 
     */
    @JsonProperty("nonWeighted")
    public void setNonWeighted(Object nonWeighted) {
        this.nonWeighted = nonWeighted;
    }

    public QualityPoint withNonWeighted(Object nonWeighted) {
        this.nonWeighted = nonWeighted;
        return this;
    }

    /**
     * GPA
     * <p>
     * The weighted quality points used to compute the GPA.
     * 
     */
    @JsonProperty("gpa")
    public Object getGpa() {
        return gpa;
    }

    /**
     * GPA
     * <p>
     * The weighted quality points used to compute the GPA.
     * 
     */
    @JsonProperty("gpa")
    public void setGpa(Object gpa) {
        this.gpa = gpa;
    }

    public QualityPoint withGpa(Object gpa) {
        this.gpa = gpa;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QualityPoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nonWeighted");
        sb.append('=');
        sb.append(((this.nonWeighted == null)?"<null>":this.nonWeighted));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
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
        result = ((result* 31)+((this.nonWeighted == null)? 0 :this.nonWeighted.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QualityPoint) == false) {
            return false;
        }
        QualityPoint rhs = ((QualityPoint) other);
        return (((this.nonWeighted == rhs.nonWeighted)||((this.nonWeighted!= null)&&this.nonWeighted.equals(rhs.nonWeighted)))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))));
    }

}
