
package com.ellucian.generated.eedm.section_registrations.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Submission
 * <p>
 * Properties related to the submission of the section grade.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "submittedBy",
    "submittedOn",
    "method",
    "reason"
})
@Generated("jsonschema2pojo")
public class Submission {

    /**
     * Submitted By
     * <p>
     * The person who submitted the section grade.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person who submitted the section grade.")
    private Object submittedBy;
    /**
     * Submitted On
     * <p>
     * The date the section grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    @JsonPropertyDescription("The date the section grade was submitted.")
    private Object submittedOn;
    /**
     * Method
     * <p>
     * The method by which the section grade was submitted.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The method by which the section grade was submitted.")
    private Object method;
    /**
     * Reason
     * <p>
     * The reason for the section grade submission.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The reason for the section grade submission.")
    private Object reason;

    /**
     * Submitted By
     * <p>
     * The person who submitted the section grade.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person who submitted the section grade.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Submission withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * The date the section grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public Object getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Submitted On
     * <p>
     * The date the section grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public Submission withSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
        return this;
    }

    /**
     * Method
     * <p>
     * The method by which the section grade was submitted.
     * 
     */
    @JsonProperty("method")
    public Object getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * The method by which the section grade was submitted.
     * 
     */
    @JsonProperty("method")
    public void setMethod(Object method) {
        this.method = method;
    }

    public Submission withMethod(Object method) {
        this.method = method;
        return this;
    }

    /**
     * Reason
     * <p>
     * The reason for the section grade submission.
     * 
     */
    @JsonProperty("reason")
    public Object getReason() {
        return reason;
    }

    /**
     * Reason
     * <p>
     * The reason for the section grade submission.
     * 
     */
    @JsonProperty("reason")
    public void setReason(Object reason) {
        this.reason = reason;
    }

    public Submission withReason(Object reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Submission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("submittedOn");
        sb.append('=');
        sb.append(((this.submittedOn == null)?"<null>":this.submittedOn));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.submittedOn == null)? 0 :this.submittedOn.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Submission) == false) {
            return false;
        }
        Submission rhs = ((Submission) other);
        return (((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.submittedOn == rhs.submittedOn)||((this.submittedOn!= null)&&this.submittedOn.equals(rhs.submittedOn))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))));
    }

}
