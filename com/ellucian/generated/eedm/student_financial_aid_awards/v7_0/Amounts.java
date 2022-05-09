
package com.ellucian.generated.eedm.student_financial_aid_awards.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Amounts
 * <p>
 * Various amounts involved in a financial aid award.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "originalOffered",
    "offered",
    "accepted",
    "declined",
    "rejected"
})
@Generated("jsonschema2pojo")
public class Amounts {

    /**
     * Original Offered
     * <p>
     * Amount that was originally offered for the award period.
     * 
     */
    @JsonProperty("originalOffered")
    @JsonPropertyDescription("Amount that was originally offered for the award period.")
    private Object originalOffered;
    /**
     * Offered
     * <p>
     * Total amount offered for the award period.
     * 
     */
    @JsonProperty("offered")
    @JsonPropertyDescription("Total amount offered for the award period.")
    private Object offered;
    /**
     * Accepted
     * <p>
     * Total amount accepted for the award period.
     * 
     */
    @JsonProperty("accepted")
    @JsonPropertyDescription("Total amount accepted for the award period.")
    private Object accepted;
    /**
     * Declined
     * <p>
     * The amount declined for the award period
     * 
     */
    @JsonProperty("declined")
    @JsonPropertyDescription("The amount declined for the award period")
    private Object declined;
    /**
     * Rejected
     * <p>
     * The amount canceled or rejected for the award period
     * 
     */
    @JsonProperty("rejected")
    @JsonPropertyDescription("The amount canceled or rejected for the award period")
    private Object rejected;

    /**
     * Original Offered
     * <p>
     * Amount that was originally offered for the award period.
     * 
     */
    @JsonProperty("originalOffered")
    public Object getOriginalOffered() {
        return originalOffered;
    }

    /**
     * Original Offered
     * <p>
     * Amount that was originally offered for the award period.
     * 
     */
    @JsonProperty("originalOffered")
    public void setOriginalOffered(Object originalOffered) {
        this.originalOffered = originalOffered;
    }

    public Amounts withOriginalOffered(Object originalOffered) {
        this.originalOffered = originalOffered;
        return this;
    }

    /**
     * Offered
     * <p>
     * Total amount offered for the award period.
     * 
     */
    @JsonProperty("offered")
    public Object getOffered() {
        return offered;
    }

    /**
     * Offered
     * <p>
     * Total amount offered for the award period.
     * 
     */
    @JsonProperty("offered")
    public void setOffered(Object offered) {
        this.offered = offered;
    }

    public Amounts withOffered(Object offered) {
        this.offered = offered;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Total amount accepted for the award period.
     * 
     */
    @JsonProperty("accepted")
    public Object getAccepted() {
        return accepted;
    }

    /**
     * Accepted
     * <p>
     * Total amount accepted for the award period.
     * 
     */
    @JsonProperty("accepted")
    public void setAccepted(Object accepted) {
        this.accepted = accepted;
    }

    public Amounts withAccepted(Object accepted) {
        this.accepted = accepted;
        return this;
    }

    /**
     * Declined
     * <p>
     * The amount declined for the award period
     * 
     */
    @JsonProperty("declined")
    public Object getDeclined() {
        return declined;
    }

    /**
     * Declined
     * <p>
     * The amount declined for the award period
     * 
     */
    @JsonProperty("declined")
    public void setDeclined(Object declined) {
        this.declined = declined;
    }

    public Amounts withDeclined(Object declined) {
        this.declined = declined;
        return this;
    }

    /**
     * Rejected
     * <p>
     * The amount canceled or rejected for the award period
     * 
     */
    @JsonProperty("rejected")
    public Object getRejected() {
        return rejected;
    }

    /**
     * Rejected
     * <p>
     * The amount canceled or rejected for the award period
     * 
     */
    @JsonProperty("rejected")
    public void setRejected(Object rejected) {
        this.rejected = rejected;
    }

    public Amounts withRejected(Object rejected) {
        this.rejected = rejected;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amounts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originalOffered");
        sb.append('=');
        sb.append(((this.originalOffered == null)?"<null>":this.originalOffered));
        sb.append(',');
        sb.append("offered");
        sb.append('=');
        sb.append(((this.offered == null)?"<null>":this.offered));
        sb.append(',');
        sb.append("accepted");
        sb.append('=');
        sb.append(((this.accepted == null)?"<null>":this.accepted));
        sb.append(',');
        sb.append("declined");
        sb.append('=');
        sb.append(((this.declined == null)?"<null>":this.declined));
        sb.append(',');
        sb.append("rejected");
        sb.append('=');
        sb.append(((this.rejected == null)?"<null>":this.rejected));
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
        result = ((result* 31)+((this.accepted == null)? 0 :this.accepted.hashCode()));
        result = ((result* 31)+((this.declined == null)? 0 :this.declined.hashCode()));
        result = ((result* 31)+((this.originalOffered == null)? 0 :this.originalOffered.hashCode()));
        result = ((result* 31)+((this.offered == null)? 0 :this.offered.hashCode()));
        result = ((result* 31)+((this.rejected == null)? 0 :this.rejected.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amounts) == false) {
            return false;
        }
        Amounts rhs = ((Amounts) other);
        return ((((((this.accepted == rhs.accepted)||((this.accepted!= null)&&this.accepted.equals(rhs.accepted)))&&((this.declined == rhs.declined)||((this.declined!= null)&&this.declined.equals(rhs.declined))))&&((this.originalOffered == rhs.originalOffered)||((this.originalOffered!= null)&&this.originalOffered.equals(rhs.originalOffered))))&&((this.offered == rhs.offered)||((this.offered!= null)&&this.offered.equals(rhs.offered))))&&((this.rejected == rhs.rejected)||((this.rejected!= null)&&this.rejected.equals(rhs.rejected))));
    }

}
