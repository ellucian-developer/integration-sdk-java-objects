
package com.ellucian.generated.eedm.courses.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "administrativeInstructionalMethod",
    "minimum",
    "maximum",
    "increment",
    "interval"
})
@Generated("jsonschema2pojo")
public class Hour {

    /**
     * Administrative Instructional Method
     * <p>
     * The method, style, or format for which hours are established for a course.
     * (Required)
     * 
     */
    @JsonProperty("administrativeInstructionalMethod")
    @JsonPropertyDescription("The method, style, or format for which hours are established for a course.")
    private AdministrativeInstructionalMethod administrativeInstructionalMethod;
    /**
     * Minimum
     * <p>
     * The minimum number of hours that may be established for an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    @JsonPropertyDescription("The minimum number of hours that may be established for an instructional method.")
    private Double minimum;
    /**
     * Maximum
     * <p>
     * The maximum number of hours that may be established for an instructional method.
     * 
     */
    @JsonProperty("maximum")
    @JsonPropertyDescription("The maximum number of hours that may be established for an instructional method.")
    private Object maximum;
    /**
     * Increment
     * <p>
     * The increment specified for the hours.
     * 
     */
    @JsonProperty("increment")
    @JsonPropertyDescription("The increment specified for the hours.")
    private Object increment;
    /**
     * Interval
     * <p>
     * The interval specified for the hours.
     * 
     */
    @JsonProperty("interval")
    @JsonPropertyDescription("The interval specified for the hours.")
    private Object interval;

    /**
     * Administrative Instructional Method
     * <p>
     * The method, style, or format for which hours are established for a course.
     * (Required)
     * 
     */
    @JsonProperty("administrativeInstructionalMethod")
    public AdministrativeInstructionalMethod getAdministrativeInstructionalMethod() {
        return administrativeInstructionalMethod;
    }

    /**
     * Administrative Instructional Method
     * <p>
     * The method, style, or format for which hours are established for a course.
     * (Required)
     * 
     */
    @JsonProperty("administrativeInstructionalMethod")
    public void setAdministrativeInstructionalMethod(AdministrativeInstructionalMethod administrativeInstructionalMethod) {
        this.administrativeInstructionalMethod = administrativeInstructionalMethod;
    }

    public Hour withAdministrativeInstructionalMethod(AdministrativeInstructionalMethod administrativeInstructionalMethod) {
        this.administrativeInstructionalMethod = administrativeInstructionalMethod;
        return this;
    }

    /**
     * Minimum
     * <p>
     * The minimum number of hours that may be established for an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Minimum
     * <p>
     * The minimum number of hours that may be established for an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Hour withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Maximum
     * <p>
     * The maximum number of hours that may be established for an instructional method.
     * 
     */
    @JsonProperty("maximum")
    public Object getMaximum() {
        return maximum;
    }

    /**
     * Maximum
     * <p>
     * The maximum number of hours that may be established for an instructional method.
     * 
     */
    @JsonProperty("maximum")
    public void setMaximum(Object maximum) {
        this.maximum = maximum;
    }

    public Hour withMaximum(Object maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Increment
     * <p>
     * The increment specified for the hours.
     * 
     */
    @JsonProperty("increment")
    public Object getIncrement() {
        return increment;
    }

    /**
     * Increment
     * <p>
     * The increment specified for the hours.
     * 
     */
    @JsonProperty("increment")
    public void setIncrement(Object increment) {
        this.increment = increment;
    }

    public Hour withIncrement(Object increment) {
        this.increment = increment;
        return this;
    }

    /**
     * Interval
     * <p>
     * The interval specified for the hours.
     * 
     */
    @JsonProperty("interval")
    public Object getInterval() {
        return interval;
    }

    /**
     * Interval
     * <p>
     * The interval specified for the hours.
     * 
     */
    @JsonProperty("interval")
    public void setInterval(Object interval) {
        this.interval = interval;
    }

    public Hour withInterval(Object interval) {
        this.interval = interval;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hour.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("administrativeInstructionalMethod");
        sb.append('=');
        sb.append(((this.administrativeInstructionalMethod == null)?"<null>":this.administrativeInstructionalMethod));
        sb.append(',');
        sb.append("minimum");
        sb.append('=');
        sb.append(((this.minimum == null)?"<null>":this.minimum));
        sb.append(',');
        sb.append("maximum");
        sb.append('=');
        sb.append(((this.maximum == null)?"<null>":this.maximum));
        sb.append(',');
        sb.append("increment");
        sb.append('=');
        sb.append(((this.increment == null)?"<null>":this.increment));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
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
        result = ((result* 31)+((this.maximum == null)? 0 :this.maximum.hashCode()));
        result = ((result* 31)+((this.increment == null)? 0 :this.increment.hashCode()));
        result = ((result* 31)+((this.administrativeInstructionalMethod == null)? 0 :this.administrativeInstructionalMethod.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.minimum == null)? 0 :this.minimum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hour) == false) {
            return false;
        }
        Hour rhs = ((Hour) other);
        return ((((((this.maximum == rhs.maximum)||((this.maximum!= null)&&this.maximum.equals(rhs.maximum)))&&((this.increment == rhs.increment)||((this.increment!= null)&&this.increment.equals(rhs.increment))))&&((this.administrativeInstructionalMethod == rhs.administrativeInstructionalMethod)||((this.administrativeInstructionalMethod!= null)&&this.administrativeInstructionalMethod.equals(rhs.administrativeInstructionalMethod))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.minimum == rhs.minimum)||((this.minimum!= null)&&this.minimum.equals(rhs.minimum))));
    }

}
