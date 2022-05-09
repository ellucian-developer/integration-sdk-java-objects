
package com.ellucian.generated.eedm.student_transcript_grades_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Incomplete Grade
 * <p>
 * The default incomplete final grade and the extension date associated with the student's grade.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finalGrade",
    "extensionDate"
})
@Generated("jsonschema2pojo")
public class IncompleteGrade {

    /**
     * Final Grade
     * <p>
     * The default final grade.
     * 
     */
    @JsonProperty("finalGrade")
    @JsonPropertyDescription("The default final grade.")
    private Object finalGrade;
    /**
     * Extension Date
     * <p>
     * The date after which the default final grade may be applied.
     * 
     */
    @JsonProperty("extensionDate")
    @JsonPropertyDescription("The date after which the default final grade may be applied.")
    private Object extensionDate;

    /**
     * Final Grade
     * <p>
     * The default final grade.
     * 
     */
    @JsonProperty("finalGrade")
    public Object getFinalGrade() {
        return finalGrade;
    }

    /**
     * Final Grade
     * <p>
     * The default final grade.
     * 
     */
    @JsonProperty("finalGrade")
    public void setFinalGrade(Object finalGrade) {
        this.finalGrade = finalGrade;
    }

    public IncompleteGrade withFinalGrade(Object finalGrade) {
        this.finalGrade = finalGrade;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * The date after which the default final grade may be applied.
     * 
     */
    @JsonProperty("extensionDate")
    public Object getExtensionDate() {
        return extensionDate;
    }

    /**
     * Extension Date
     * <p>
     * The date after which the default final grade may be applied.
     * 
     */
    @JsonProperty("extensionDate")
    public void setExtensionDate(Object extensionDate) {
        this.extensionDate = extensionDate;
    }

    public IncompleteGrade withExtensionDate(Object extensionDate) {
        this.extensionDate = extensionDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IncompleteGrade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finalGrade");
        sb.append('=');
        sb.append(((this.finalGrade == null)?"<null>":this.finalGrade));
        sb.append(',');
        sb.append("extensionDate");
        sb.append('=');
        sb.append(((this.extensionDate == null)?"<null>":this.extensionDate));
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
        result = ((result* 31)+((this.finalGrade == null)? 0 :this.finalGrade.hashCode()));
        result = ((result* 31)+((this.extensionDate == null)? 0 :this.extensionDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncompleteGrade) == false) {
            return false;
        }
        IncompleteGrade rhs = ((IncompleteGrade) other);
        return (((this.finalGrade == rhs.finalGrade)||((this.finalGrade!= null)&&this.finalGrade.equals(rhs.finalGrade)))&&((this.extensionDate == rhs.extensionDate)||((this.extensionDate!= null)&&this.extensionDate.equals(rhs.extensionDate))));
    }

}
