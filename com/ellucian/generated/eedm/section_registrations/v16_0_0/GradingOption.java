
package com.ellucian.generated.eedm.section_registrations.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grading Option
 * <p>
 * Details on how the student elected to have their grades recorded.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gradeScheme",
    "mode"
})
@Generated("jsonschema2pojo")
public class GradingOption {

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that will be used to record the student's grade for the section.
     * 
     */
    @JsonProperty("gradeScheme")
    @JsonPropertyDescription("The grading scheme that will be used to record the student's grade for the section.")
    private Object gradeScheme;
    /**
     * Mode
     * <p>
     * The manner in which a student's grade will be reported.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("The manner in which a student's grade will be reported.")
    private Object mode;

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that will be used to record the student's grade for the section.
     * 
     */
    @JsonProperty("gradeScheme")
    public Object getGradeScheme() {
        return gradeScheme;
    }

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that will be used to record the student's grade for the section.
     * 
     */
    @JsonProperty("gradeScheme")
    public void setGradeScheme(Object gradeScheme) {
        this.gradeScheme = gradeScheme;
    }

    public GradingOption withGradeScheme(Object gradeScheme) {
        this.gradeScheme = gradeScheme;
        return this;
    }

    /**
     * Mode
     * <p>
     * The manner in which a student's grade will be reported.
     * 
     */
    @JsonProperty("mode")
    public Object getMode() {
        return mode;
    }

    /**
     * Mode
     * <p>
     * The manner in which a student's grade will be reported.
     * 
     */
    @JsonProperty("mode")
    public void setMode(Object mode) {
        this.mode = mode;
    }

    public GradingOption withMode(Object mode) {
        this.mode = mode;
        return this;
    }

    @java.lang.Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradingOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gradeScheme");
        sb.append('=');
        sb.append(((this.gradeScheme == null)?"<null>":this.gradeScheme));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @java.lang.Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.gradeScheme == null)? 0 :this.gradeScheme.hashCode()));
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradingOption) == false) {
            return false;
        }
        GradingOption rhs = ((GradingOption) other);
        return (((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)))&&((this.gradeScheme == rhs.gradeScheme)||((this.gradeScheme!= null)&&this.gradeScheme.equals(rhs.gradeScheme))));
    }

}
