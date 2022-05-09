
package com.ellucian.generated.eedm.external_contributions.v17_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "donor",
    "donorAssociationType",
    "amount",
    "designation",
    "appealCommunicationEffort",
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
     * Donor Association Type
     * <p>
     * The donor association type of the allocated donor.
     * (Required)
     * 
     */
    @JsonProperty("donorAssociationType")
    @JsonPropertyDescription("The donor association type of the allocated donor.")
    private DonorAssociationType donorAssociationType;
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
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    @JsonPropertyDescription("The appeal communication effort associated with the allocation of the contribution.")
    private Object appealCommunicationEffort;
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
     * Donor Association Type
     * <p>
     * The donor association type of the allocated donor.
     * (Required)
     * 
     */
    @JsonProperty("donorAssociationType")
    public DonorAssociationType getDonorAssociationType() {
        return donorAssociationType;
    }

    /**
     * Donor Association Type
     * <p>
     * The donor association type of the allocated donor.
     * (Required)
     * 
     */
    @JsonProperty("donorAssociationType")
    public void setDonorAssociationType(DonorAssociationType donorAssociationType) {
        this.donorAssociationType = donorAssociationType;
    }

    public Allocation withDonorAssociationType(DonorAssociationType donorAssociationType) {
        this.donorAssociationType = donorAssociationType;
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
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    public Object getAppealCommunicationEffort() {
        return appealCommunicationEffort;
    }

    /**
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the allocation of the contribution.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    public void setAppealCommunicationEffort(Object appealCommunicationEffort) {
        this.appealCommunicationEffort = appealCommunicationEffort;
    }

    public Allocation withAppealCommunicationEffort(Object appealCommunicationEffort) {
        this.appealCommunicationEffort = appealCommunicationEffort;
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
        sb.append("donorAssociationType");
        sb.append('=');
        sb.append(((this.donorAssociationType == null)?"<null>":this.donorAssociationType));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("appealCommunicationEffort");
        sb.append('=');
        sb.append(((this.appealCommunicationEffort == null)?"<null>":this.appealCommunicationEffort));
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
        result = ((result* 31)+((this.appealCommunicationEffort == null)? 0 :this.appealCommunicationEffort.hashCode()));
        result = ((result* 31)+((this.donorAssociationType == null)? 0 :this.donorAssociationType.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
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
        return (((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.donor == rhs.donor)||((this.donor!= null)&&this.donor.equals(rhs.donor))))&&((this.appealCommunicationEffort == rhs.appealCommunicationEffort)||((this.appealCommunicationEffort!= null)&&this.appealCommunicationEffort.equals(rhs.appealCommunicationEffort))))&&((this.donorAssociationType == rhs.donorAssociationType)||((this.donorAssociationType!= null)&&this.donorAssociationType.equals(rhs.donorAssociationType))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))));
    }

}
