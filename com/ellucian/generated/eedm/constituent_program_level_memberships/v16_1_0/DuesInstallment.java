
package com.ellucian.generated.eedm.constituent_program_level_memberships.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheduledOn",
    "amountDue",
    "amountPaid"
})
@Generated("jsonschema2pojo")
public class DuesInstallment {

    /**
     * Scheduled On
     * <p>
     * The scheduled date for the installment.
     * (Required)
     * 
     */
    @JsonProperty("scheduledOn")
    @JsonPropertyDescription("The scheduled date for the installment.")
    private String scheduledOn;
    /**
     * Amount Due
     * <p>
     * The amount due for the installment.
     * (Required)
     * 
     */
    @JsonProperty("amountDue")
    @JsonPropertyDescription("The amount due for the installment.")
    private AmountDue amountDue;
    /**
     * Amount Paid
     * <p>
     * The amount paid for the installment.
     * 
     */
    @JsonProperty("amountPaid")
    @JsonPropertyDescription("The amount paid for the installment.")
    private Object amountPaid;

    /**
     * Scheduled On
     * <p>
     * The scheduled date for the installment.
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
     * The scheduled date for the installment.
     * (Required)
     * 
     */
    @JsonProperty("scheduledOn")
    public void setScheduledOn(String scheduledOn) {
        this.scheduledOn = scheduledOn;
    }

    public DuesInstallment withScheduledOn(String scheduledOn) {
        this.scheduledOn = scheduledOn;
        return this;
    }

    /**
     * Amount Due
     * <p>
     * The amount due for the installment.
     * (Required)
     * 
     */
    @JsonProperty("amountDue")
    public AmountDue getAmountDue() {
        return amountDue;
    }

    /**
     * Amount Due
     * <p>
     * The amount due for the installment.
     * (Required)
     * 
     */
    @JsonProperty("amountDue")
    public void setAmountDue(AmountDue amountDue) {
        this.amountDue = amountDue;
    }

    public DuesInstallment withAmountDue(AmountDue amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    /**
     * Amount Paid
     * <p>
     * The amount paid for the installment.
     * 
     */
    @JsonProperty("amountPaid")
    public Object getAmountPaid() {
        return amountPaid;
    }

    /**
     * Amount Paid
     * <p>
     * The amount paid for the installment.
     * 
     */
    @JsonProperty("amountPaid")
    public void setAmountPaid(Object amountPaid) {
        this.amountPaid = amountPaid;
    }

    public DuesInstallment withAmountPaid(Object amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DuesInstallment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scheduledOn");
        sb.append('=');
        sb.append(((this.scheduledOn == null)?"<null>":this.scheduledOn));
        sb.append(',');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        sb.append("amountPaid");
        sb.append('=');
        sb.append(((this.amountPaid == null)?"<null>":this.amountPaid));
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
        result = ((result* 31)+((this.amountDue == null)? 0 :this.amountDue.hashCode()));
        result = ((result* 31)+((this.scheduledOn == null)? 0 :this.scheduledOn.hashCode()));
        result = ((result* 31)+((this.amountPaid == null)? 0 :this.amountPaid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DuesInstallment) == false) {
            return false;
        }
        DuesInstallment rhs = ((DuesInstallment) other);
        return ((((this.amountDue == rhs.amountDue)||((this.amountDue!= null)&&this.amountDue.equals(rhs.amountDue)))&&((this.scheduledOn == rhs.scheduledOn)||((this.scheduledOn!= null)&&this.scheduledOn.equals(rhs.scheduledOn))))&&((this.amountPaid == rhs.amountPaid)||((this.amountPaid!= null)&&this.amountPaid.equals(rhs.amountPaid))));
    }

}
