
package com.ellucian.generated.eedm.restricted_student_financial_aid_awards.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheduledOn",
    "disbursedOn",
    "amounts"
})
@Generated("jsonschema2pojo")
public class Disbursement {

    /**
     * Scheduled On
     * <p>
     * The date the disbursement is scheduled to occur
     * (Required)
     * 
     */
    @JsonProperty("scheduledOn")
    @JsonPropertyDescription("The date the disbursement is scheduled to occur")
    private String scheduledOn;
    /**
     * Disbursed On
     * <p>
     * The date the disbursement occurred
     * 
     */
    @JsonProperty("disbursedOn")
    @JsonPropertyDescription("The date the disbursement occurred")
    private Object disbursedOn;
    /**
     * Amounts
     * <p>
     * Details of amounts to be distributed.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    @JsonPropertyDescription("Details of amounts to be distributed.")
    private Amounts__1 amounts;

    /**
     * Scheduled On
     * <p>
     * The date the disbursement is scheduled to occur
     * (Required)
     * 
     */
    @JsonProperty("scheduledOn")
    public String getScheduledOn() {
        return scheduledOn;
    }

    /**
     * Scheduled On
     * <p>
     * The date the disbursement is scheduled to occur
     * (Required)
     * 
     */
    @JsonProperty("scheduledOn")
    public void setScheduledOn(String scheduledOn) {
        this.scheduledOn = scheduledOn;
    }

    public Disbursement withScheduledOn(String scheduledOn) {
        this.scheduledOn = scheduledOn;
        return this;
    }

    /**
     * Disbursed On
     * <p>
     * The date the disbursement occurred
     * 
     */
    @JsonProperty("disbursedOn")
    public Object getDisbursedOn() {
        return disbursedOn;
    }

    /**
     * Disbursed On
     * <p>
     * The date the disbursement occurred
     * 
     */
    @JsonProperty("disbursedOn")
    public void setDisbursedOn(Object disbursedOn) {
        this.disbursedOn = disbursedOn;
    }

    public Disbursement withDisbursedOn(Object disbursedOn) {
        this.disbursedOn = disbursedOn;
        return this;
    }

    /**
     * Amounts
     * <p>
     * Details of amounts to be distributed.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public Amounts__1 getAmounts() {
        return amounts;
    }

    /**
     * Amounts
     * <p>
     * Details of amounts to be distributed.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public void setAmounts(Amounts__1 amounts) {
        this.amounts = amounts;
    }

    public Disbursement withAmounts(Amounts__1 amounts) {
        this.amounts = amounts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Disbursement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scheduledOn");
        sb.append('=');
        sb.append(((this.scheduledOn == null)?"<null>":this.scheduledOn));
        sb.append(',');
        sb.append("disbursedOn");
        sb.append('=');
        sb.append(((this.disbursedOn == null)?"<null>":this.disbursedOn));
        sb.append(',');
        sb.append("amounts");
        sb.append('=');
        sb.append(((this.amounts == null)?"<null>":this.amounts));
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
        result = ((result* 31)+((this.scheduledOn == null)? 0 :this.scheduledOn.hashCode()));
        result = ((result* 31)+((this.disbursedOn == null)? 0 :this.disbursedOn.hashCode()));
        result = ((result* 31)+((this.amounts == null)? 0 :this.amounts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Disbursement) == false) {
            return false;
        }
        Disbursement rhs = ((Disbursement) other);
        return ((((this.scheduledOn == rhs.scheduledOn)||((this.scheduledOn!= null)&&this.scheduledOn.equals(rhs.scheduledOn)))&&((this.disbursedOn == rhs.disbursedOn)||((this.disbursedOn!= null)&&this.disbursedOn.equals(rhs.disbursedOn))))&&((this.amounts == rhs.amounts)||((this.amounts!= null)&&this.amounts.equals(rhs.amounts))));
    }

}
