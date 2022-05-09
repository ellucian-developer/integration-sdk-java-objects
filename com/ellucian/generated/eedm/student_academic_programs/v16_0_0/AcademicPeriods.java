
package com.ellucian.generated.eedm.student_academic_programs.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Academic Periods
 * <p>
 * Various academic periods related to a student's progression in a program.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starting",
    "expectedGraduation",
    "actualGraduation"
})
@Generated("jsonschema2pojo")
public class AcademicPeriods {

    /**
     * Starting
     * <p>
     * The starting academic period of student's enrollment in the program
     * 
     */
    @JsonProperty("starting")
    @JsonPropertyDescription("The starting academic period of student's enrollment in the program")
    private Object starting;
    /**
     * Expected Graduation
     * <p>
     * The academic period in which the student is expected to graduate.
     * 
     */
    @JsonProperty("expectedGraduation")
    @JsonPropertyDescription("The academic period in which the student is expected to graduate.")
    private Object expectedGraduation;
    /**
     * Actual Graduation
     * <p>
     * The academic period in which the student actually graduated.
     * 
     */
    @JsonProperty("actualGraduation")
    @JsonPropertyDescription("The academic period in which the student actually graduated.")
    private Object actualGraduation;

    /**
     * Starting
     * <p>
     * The starting academic period of student's enrollment in the program
     * 
     */
    @JsonProperty("starting")
    public Object getStarting() {
        return starting;
    }

    /**
     * Starting
     * <p>
     * The starting academic period of student's enrollment in the program
     * 
     */
    @JsonProperty("starting")
    public void setStarting(Object starting) {
        this.starting = starting;
    }

    public AcademicPeriods withStarting(Object starting) {
        this.starting = starting;
        return this;
    }

    /**
     * Expected Graduation
     * <p>
     * The academic period in which the student is expected to graduate.
     * 
     */
    @JsonProperty("expectedGraduation")
    public Object getExpectedGraduation() {
        return expectedGraduation;
    }

    /**
     * Expected Graduation
     * <p>
     * The academic period in which the student is expected to graduate.
     * 
     */
    @JsonProperty("expectedGraduation")
    public void setExpectedGraduation(Object expectedGraduation) {
        this.expectedGraduation = expectedGraduation;
    }

    public AcademicPeriods withExpectedGraduation(Object expectedGraduation) {
        this.expectedGraduation = expectedGraduation;
        return this;
    }

    /**
     * Actual Graduation
     * <p>
     * The academic period in which the student actually graduated.
     * 
     */
    @JsonProperty("actualGraduation")
    public Object getActualGraduation() {
        return actualGraduation;
    }

    /**
     * Actual Graduation
     * <p>
     * The academic period in which the student actually graduated.
     * 
     */
    @JsonProperty("actualGraduation")
    public void setActualGraduation(Object actualGraduation) {
        this.actualGraduation = actualGraduation;
    }

    public AcademicPeriods withActualGraduation(Object actualGraduation) {
        this.actualGraduation = actualGraduation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicPeriods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("starting");
        sb.append('=');
        sb.append(((this.starting == null)?"<null>":this.starting));
        sb.append(',');
        sb.append("expectedGraduation");
        sb.append('=');
        sb.append(((this.expectedGraduation == null)?"<null>":this.expectedGraduation));
        sb.append(',');
        sb.append("actualGraduation");
        sb.append('=');
        sb.append(((this.actualGraduation == null)?"<null>":this.actualGraduation));
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
        result = ((result* 31)+((this.expectedGraduation == null)? 0 :this.expectedGraduation.hashCode()));
        result = ((result* 31)+((this.starting == null)? 0 :this.starting.hashCode()));
        result = ((result* 31)+((this.actualGraduation == null)? 0 :this.actualGraduation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicPeriods) == false) {
            return false;
        }
        AcademicPeriods rhs = ((AcademicPeriods) other);
        return ((((this.expectedGraduation == rhs.expectedGraduation)||((this.expectedGraduation!= null)&&this.expectedGraduation.equals(rhs.expectedGraduation)))&&((this.starting == rhs.starting)||((this.starting!= null)&&this.starting.equals(rhs.starting))))&&((this.actualGraduation == rhs.actualGraduation)||((this.actualGraduation!= null)&&this.actualGraduation.equals(rhs.actualGraduation))));
    }

}
