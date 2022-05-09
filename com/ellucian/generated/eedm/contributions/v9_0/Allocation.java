
package com.ellucian.generated.eedm.contributions.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "donor",
    "constituentTypes",
    "designation",
    "designatedClassYear",
    "donorAssociationType",
    "credits",
    "campaign",
    "appeal"
})
@Generated("jsonschema2pojo")
public class Allocation {

    /**
     * Donor
     * <p>
     * A person or organization associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("donor")
    @JsonPropertyDescription("A person or organization associated with the contribution.")
    private Object donor;
    /**
     * Constituent Types
     * <p>
     * The types of constituent that the donor represents.
     * 
     */
    @JsonProperty("constituentTypes")
    @JsonPropertyDescription("The types of constituent that the donor represents.")
    private List<ConstituentType> constituentTypes = new ArrayList<ConstituentType>();
    /**
     * Designation
     * <p>
     * The designated use of the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designated use of the donor's allocation of the contribution.")
    private Object designation;
    /**
     * Designated Class Year
     * <p>
     * The class year associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designatedClassYear")
    @JsonPropertyDescription("The class year associated with the donor's allocation of the contribution.")
    private Object designatedClassYear;
    /**
     * Donor Association Type
     * <p>
     * The association between the donor and the contribution for the allocation. For example, a donor can be primary or 'in memory of' with regard to the contribution allocation.
     * (Required)
     * 
     */
    @JsonProperty("donorAssociationType")
    @JsonPropertyDescription("The association between the donor and the contribution for the allocation. For example, a donor can be primary or 'in memory of' with regard to the contribution allocation.")
    private DonorAssociationType donorAssociationType;
    /**
     * Credits
     * <p>
     * The types and amounts of credit given to the donor for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("The types and amounts of credit given to the donor for the allocation of the contribution.")
    private List<Credit> credits = new ArrayList<Credit>();
    /**
     * Campaign
     * <p>
     * The fund-raising campaign associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The fund-raising campaign associated with the donor's allocation of the contribution.")
    private Object campaign;
    /**
     * Appeal
     * <p>
     * The appeal associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("appeal")
    @JsonPropertyDescription("The appeal associated with the donor's allocation of the contribution.")
    private Object appeal;

    /**
     * Donor
     * <p>
     * A person or organization associated with the contribution.
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
     * A person or organization associated with the contribution.
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
     * Constituent Types
     * <p>
     * The types of constituent that the donor represents.
     * 
     */
    @JsonProperty("constituentTypes")
    public List<ConstituentType> getConstituentTypes() {
        return constituentTypes;
    }

    /**
     * Constituent Types
     * <p>
     * The types of constituent that the donor represents.
     * 
     */
    @JsonProperty("constituentTypes")
    public void setConstituentTypes(List<ConstituentType> constituentTypes) {
        this.constituentTypes = constituentTypes;
    }

    public Allocation withConstituentTypes(List<ConstituentType> constituentTypes) {
        this.constituentTypes = constituentTypes;
        return this;
    }

    /**
     * Designation
     * <p>
     * The designated use of the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designation")
    public Object getDesignation() {
        return designation;
    }

    /**
     * Designation
     * <p>
     * The designated use of the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public Allocation withDesignation(Object designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Designated Class Year
     * <p>
     * The class year associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designatedClassYear")
    public Object getDesignatedClassYear() {
        return designatedClassYear;
    }

    /**
     * Designated Class Year
     * <p>
     * The class year associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("designatedClassYear")
    public void setDesignatedClassYear(Object designatedClassYear) {
        this.designatedClassYear = designatedClassYear;
    }

    public Allocation withDesignatedClassYear(Object designatedClassYear) {
        this.designatedClassYear = designatedClassYear;
        return this;
    }

    /**
     * Donor Association Type
     * <p>
     * The association between the donor and the contribution for the allocation. For example, a donor can be primary or 'in memory of' with regard to the contribution allocation.
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
     * The association between the donor and the contribution for the allocation. For example, a donor can be primary or 'in memory of' with regard to the contribution allocation.
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
     * Credits
     * <p>
     * The types and amounts of credit given to the donor for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    /**
     * Credits
     * <p>
     * The types and amounts of credit given to the donor for the allocation of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public Allocation withCredits(List<Credit> credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The fund-raising campaign associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The fund-raising campaign associated with the donor's allocation of the contribution.
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
     * Appeal
     * <p>
     * The appeal associated with the donor's allocation of the contribution.
     * 
     */
    @JsonProperty("appeal")
    public Object getAppeal() {
        return appeal;
    }

    /**
     * Appeal
     * <p>
     * The appeal associated with the donor's allocation of the contribution.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Allocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("donor");
        sb.append('=');
        sb.append(((this.donor == null)?"<null>":this.donor));
        sb.append(',');
        sb.append("constituentTypes");
        sb.append('=');
        sb.append(((this.constituentTypes == null)?"<null>":this.constituentTypes));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("designatedClassYear");
        sb.append('=');
        sb.append(((this.designatedClassYear == null)?"<null>":this.designatedClassYear));
        sb.append(',');
        sb.append("donorAssociationType");
        sb.append('=');
        sb.append(((this.donorAssociationType == null)?"<null>":this.donorAssociationType));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("appeal");
        sb.append('=');
        sb.append(((this.appeal == null)?"<null>":this.appeal));
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
        result = ((result* 31)+((this.donor == null)? 0 :this.donor.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.designatedClassYear == null)? 0 :this.designatedClassYear.hashCode()));
        result = ((result* 31)+((this.donorAssociationType == null)? 0 :this.donorAssociationType.hashCode()));
        result = ((result* 31)+((this.constituentTypes == null)? 0 :this.constituentTypes.hashCode()));
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
        return (((((((((this.donor == rhs.donor)||((this.donor!= null)&&this.donor.equals(rhs.donor)))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.designatedClassYear == rhs.designatedClassYear)||((this.designatedClassYear!= null)&&this.designatedClassYear.equals(rhs.designatedClassYear))))&&((this.donorAssociationType == rhs.donorAssociationType)||((this.donorAssociationType!= null)&&this.donorAssociationType.equals(rhs.donorAssociationType))))&&((this.constituentTypes == rhs.constituentTypes)||((this.constituentTypes!= null)&&this.constituentTypes.equals(rhs.constituentTypes))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.appeal == rhs.appeal)||((this.appeal!= null)&&this.appeal.equals(rhs.appeal))));
    }

}
