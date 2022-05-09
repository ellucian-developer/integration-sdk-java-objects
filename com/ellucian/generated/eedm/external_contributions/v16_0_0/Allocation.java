
package com.ellucian.generated.eedm.external_contributions.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "donor",
    "preference",
    "amount",
    "designation",
    "appeal",
    "campaign"
})
@Generated("jsonschema2pojo")
public class Allocation {

    /**
     * Donor
     * <p>
     * An allocated donor of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("donor")
    @JsonPropertyDescription("An allocated donor of the contribution.")
    private Object donor;
    /**
     * Preference
     * <p>
     * An indication that the allocated donor is the primary donor of the contribution.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("An indication that the allocated donor is the primary donor of the contribution.")
    private Object preference;
    /**
     * Amount
     * <p>
     * The amount specified for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount specified for the allocation of the contribution.")
    private Amount__1 amount;
    /**
     * Designation
     * <p>
     * The designated use of the allocated portion of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designated use of the allocated portion of the contribution.")
    private Designation designation;
    /**
     * Appeal
     * <p>
     * The appeal associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appeal")
    @JsonPropertyDescription("The appeal associated with the allocation of the contribution.")
    private Object appeal;
    /**
     * Campaign
     * <p>
     * The campaign associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The campaign associated with the allocation of the contribution.")
    private Object campaign;

    /**
     * Donor
     * <p>
     * An allocated donor of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("donor")
    public Object getDonor() {
        return donor;
    }

    /**
     * Donor
     * <p>
     * An allocated donor of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("donor")
    public void setDonor(Object donor) {
        this.donor = donor;
    }

    public Allocation withDonor(Object donor) {
        this.donor = donor;
        return this;
    }

    /**
     * Preference
     * <p>
     * An indication that the allocated donor is the primary donor of the contribution.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * An indication that the allocated donor is the primary donor of the contribution.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Allocation withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount specified for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Amount__1 getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount specified for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount__1 amount) {
        this.amount = amount;
    }

    public Allocation withAmount(Amount__1 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Designation
     * <p>
     * The designated use of the allocated portion of the contribution.
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
     * The designated use of the allocated portion of the contribution.
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
     * Appeal
     * <p>
     * The appeal associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appeal")
    public Object getAppeal() {
        return appeal;
    }

    /**
     * Appeal
     * <p>
     * The appeal associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appeal")
    public void setAppeal(Object appeal) {
        this.appeal = appeal;
    }

    public Allocation withAppeal(Object appeal) {
        this.appeal = appeal;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the allocation of the contribution.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Allocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("donor");
        sb.append('=');
        sb.append(((this.donor == null)?"<null>":this.donor));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("appeal");
        sb.append('=');
        sb.append(((this.appeal == null)?"<null>":this.appeal));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.donor == null)? 0 :this.donor.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.appeal == null)? 0 :this.appeal.hashCode()));
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
        return (((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.donor == rhs.donor)||((this.donor!= null)&&this.donor.equals(rhs.donor))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.appeal == rhs.appeal)||((this.appeal!= null)&&this.appeal.equals(rhs.appeal))));
    }

}
