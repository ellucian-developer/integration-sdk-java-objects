
package com.ellucian.generated.eedm.section_registrations.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Credit
 * <p>
 * Unit specification that can be awarded for completing a section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "measure",
    "registrationCredit"
})
@Generated("jsonschema2pojo")
public class Credit {

    /**
     * Measure
     * <p>
     * A unit or standard of measurement.
     * 
     */
    @JsonProperty("measure")
    @JsonPropertyDescription("A unit or standard of measurement.")
    private Object measure;
    /**
     * Registration Credit
     * <p>
     * The credits that the student could potentially earn.
     * 
     */
    @JsonProperty("registrationCredit")
    @JsonPropertyDescription("The credits that the student could potentially earn.")
    private Object registrationCredit;

    /**
     * Measure
     * <p>
     * A unit or standard of measurement.
     * 
     */
    @JsonProperty("measure")
    public Object getMeasure() {
        return measure;
    }

    /**
     * Measure
     * <p>
     * A unit or standard of measurement.
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(Object measure) {
        this.measure = measure;
    }

    public Credit withMeasure(Object measure) {
        this.measure = measure;
        return this;
    }

    /**
     * Registration Credit
     * <p>
     * The credits that the student could potentially earn.
     * 
     */
    @JsonProperty("registrationCredit")
    public Object getRegistrationCredit() {
        return registrationCredit;
    }

    /**
     * Registration Credit
     * <p>
     * The credits that the student could potentially earn.
     * 
     */
    @JsonProperty("registrationCredit")
    public void setRegistrationCredit(Object registrationCredit) {
        this.registrationCredit = registrationCredit;
    }

    public Credit withRegistrationCredit(Object registrationCredit) {
        this.registrationCredit = registrationCredit;
        return this;
    }

    @java.lang.Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("registrationCredit");
        sb.append('=');
        sb.append(((this.registrationCredit == null)?"<null>":this.registrationCredit));
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
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.registrationCredit == null)? 0 :this.registrationCredit.hashCode()));
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return (((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure)))&&((this.registrationCredit == rhs.registrationCredit)||((this.registrationCredit!= null)&&this.registrationCredit.equals(rhs.registrationCredit))));
    }

}
