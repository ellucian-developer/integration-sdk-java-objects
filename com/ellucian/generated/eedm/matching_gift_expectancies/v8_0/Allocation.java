
package com.ellucian.generated.eedm.matching_gift_expectancies.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "designation",
    "campaign",
    "amount"
})
@Generated("jsonschema2pojo")
public class Allocation {

    /**
     * Designation
     * <p>
     * The expected designation for the match contribution.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The expected designation for the match contribution.")
    private Designation designation;
    /**
     * Campaign
     * <p>
     * The expected campaign associated with the match contribution.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The expected campaign associated with the match contribution.")
    private Object campaign;
    /**
     * Amount
     * <p>
     * The amount expected to be allocated to the designation and campaign.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount expected to be allocated to the designation and campaign.")
    private Amount amount;

    /**
     * Designation
     * <p>
     * The expected designation for the match contribution.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    public Designation getDesignation() {
        return designation;
    }

    /**
     * Designation
     * <p>
     * The expected designation for the match contribution.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Allocation withDesignation(Designation designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The expected campaign associated with the match contribution.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The expected campaign associated with the match contribution.
     * 
     */
    @JsonProperty("campaign")
    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public Allocation withCampaign(Object campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount expected to be allocated to the designation and campaign.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount expected to be allocated to the designation and campaign.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Allocation withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Allocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Allocation) == false) {
            return false;
        }
        Allocation rhs = ((Allocation) other);
        return ((((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))));
    }

}
