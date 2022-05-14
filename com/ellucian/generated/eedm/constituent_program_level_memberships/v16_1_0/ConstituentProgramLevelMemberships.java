
package com.ellucian.generated.eedm.constituent_program_level_memberships.v16_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Program Level Memberships
 * <p>
 * The information associated with the membership for a program level.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "members",
    "level",
    "status",
    "startOn",
    "expireOn",
    "solicitors",
    "communicationPlans",
    "renewalMembership",
    "referenceNumber",
    "premiums",
    "premiumRelease",
    "membershipCards",
    "duesTotal",
    "duesDiscount",
    "duesInstallments",
    "appealCommunicationEffort",
    "campaign",
    "gift",
    "comments",
    "membershipNumber"
})
@Generated("jsonschema2pojo")
public class ConstituentProgramLevelMemberships {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the constituent program level membership.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent program level membership.")
    private String id;
    /**
     * Members
     * <p>
     * The constituents in the membership including their member type(s) and member dates.
     * (Required)
     * 
     */
    @JsonProperty("members")
    @JsonPropertyDescription("The constituents in the membership including their member type(s) and member dates.")
    private List<Member> members = new ArrayList<Member>();
    /**
     * Level
     * <p>
     * The membership program level associated with the membership.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The membership program level associated with the membership.")
    private Object level;
    /**
     * Status
     * <p>
     * The status of the membership.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the membership.")
    private Status status;
    /**
     * Start On
     * <p>
     * The date on which the membership starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which the membership starts.")
    private String startOn;
    /**
     * Expire On
     * <p>
     * The date on which the membership expires.
     * 
     */
    @JsonProperty("expireOn")
    @JsonPropertyDescription("The date on which the membership expires.")
    private Object expireOn;
    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the membership.
     * 
     */
    @JsonProperty("solicitors")
    @JsonPropertyDescription("The people, teams, or organizations responsible for generating the membership.")
    private List<Solicitor> solicitors = new ArrayList<Solicitor>();
    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the membership.
     * 
     */
    @JsonProperty("communicationPlans")
    @JsonPropertyDescription("The communication plans associated with the membership.")
    private List<CommunicationPlan> communicationPlans = new ArrayList<CommunicationPlan>();
    /**
     * Renewal Membership
     * <p>
     * A prior membership for which the membership is a renewal.
     * 
     */
    @JsonProperty("renewalMembership")
    @JsonPropertyDescription("A prior membership for which the membership is a renewal.")
    private Object renewalMembership;
    /**
     * Reference Number
     * <p>
     * A unique identifier for a membership that is maintained through all renewals.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("A unique identifier for a membership that is maintained through all renewals.")
    private Object referenceNumber;
    /**
     * Premiums
     * <p>
     * The goods or services offered as incentives for the membership.
     * 
     */
    @JsonProperty("premiums")
    @JsonPropertyDescription("The goods or services offered as incentives for the membership.")
    private List<Premium> premiums = new ArrayList<Premium>();
    /**
     * Premium Release
     * <p>
     * The total amount of dues that must be received before premiums can be distributed.
     * 
     */
    @JsonProperty("premiumRelease")
    @JsonPropertyDescription("The total amount of dues that must be received before premiums can be distributed.")
    private Object premiumRelease;
    /**
     * Membership Cards
     * <p>
     * The number of membership cards associated with the membership.
     * 
     */
    @JsonProperty("membershipCards")
    @JsonPropertyDescription("The number of membership cards associated with the membership.")
    private Object membershipCards;
    /**
     * Dues Total
     * <p>
     * The total amount of dues assessed for the membership.
     * 
     */
    @JsonProperty("duesTotal")
    @JsonPropertyDescription("The total amount of dues assessed for the membership.")
    private Object duesTotal;
    /**
     * Dues Discount
     * <p>
     * The discount applied to the dues for the membership.
     * 
     */
    @JsonProperty("duesDiscount")
    @JsonPropertyDescription("The discount applied to the dues for the membership.")
    private Object duesDiscount;
    /**
     * Dues Installments
     * <p>
     * The scheduled installments of the dues with the associated scheduled date, amount due and amount paid.
     * 
     */
    @JsonProperty("duesInstallments")
    @JsonPropertyDescription("The scheduled installments of the dues with the associated scheduled date, amount due and amount paid.")
    private List<DuesInstallment> duesInstallments = new ArrayList<DuesInstallment>();
    /**
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the membership.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    @JsonPropertyDescription("The appeal communication effort associated with the membership.")
    private Object appealCommunicationEffort;
    /**
     * Campaign
     * <p>
     * The campaign associated with the membership.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The campaign associated with the membership.")
    private Object campaign;
    /**
     * Gift
     * <p>
     * Information associated with a gift membership.
     * 
     */
    @JsonProperty("gift")
    @JsonPropertyDescription("Information associated with a gift membership.")
    private Gift gift;
    /**
     * Comments
     * <p>
     * The comments that may be associated with the membership.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments that may be associated with the membership.")
    private String comments;
    /**
     * Membership Number
     * <p>
     * The membership number that is assigned by the system and associated with the membership.
     * 
     */
    @JsonProperty("membershipNumber")
    @JsonPropertyDescription("The membership number that is assigned by the system and associated with the membership.")
    private String membershipNumber;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ConstituentProgramLevelMemberships withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent program level membership.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent program level membership.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentProgramLevelMemberships withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Members
     * <p>
     * The constituents in the membership including their member type(s) and member dates.
     * (Required)
     * 
     */
    @JsonProperty("members")
    public List<Member> getMembers() {
        return members;
    }

    /**
     * Members
     * <p>
     * The constituents in the membership including their member type(s) and member dates.
     * (Required)
     * 
     */
    @JsonProperty("members")
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public ConstituentProgramLevelMemberships withMembers(List<Member> members) {
        this.members = members;
        return this;
    }

    /**
     * Level
     * <p>
     * The membership program level associated with the membership.
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The membership program level associated with the membership.
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public ConstituentProgramLevelMemberships withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the membership.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the membership.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public ConstituentProgramLevelMemberships withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date on which the membership starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date on which the membership starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public ConstituentProgramLevelMemberships withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Expire On
     * <p>
     * The date on which the membership expires.
     * 
     */
    @JsonProperty("expireOn")
    public Object getExpireOn() {
        return expireOn;
    }

    /**
     * Expire On
     * <p>
     * The date on which the membership expires.
     * 
     */
    @JsonProperty("expireOn")
    public void setExpireOn(Object expireOn) {
        this.expireOn = expireOn;
    }

    public ConstituentProgramLevelMemberships withExpireOn(Object expireOn) {
        this.expireOn = expireOn;
        return this;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the membership.
     * 
     */
    @JsonProperty("solicitors")
    public List<Solicitor> getSolicitors() {
        return solicitors;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the membership.
     * 
     */
    @JsonProperty("solicitors")
    public void setSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
    }

    public ConstituentProgramLevelMemberships withSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
        return this;
    }

    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the membership.
     * 
     */
    @JsonProperty("communicationPlans")
    public List<CommunicationPlan> getCommunicationPlans() {
        return communicationPlans;
    }

    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the membership.
     * 
     */
    @JsonProperty("communicationPlans")
    public void setCommunicationPlans(List<CommunicationPlan> communicationPlans) {
        this.communicationPlans = communicationPlans;
    }

    public ConstituentProgramLevelMemberships withCommunicationPlans(List<CommunicationPlan> communicationPlans) {
        this.communicationPlans = communicationPlans;
        return this;
    }

    /**
     * Renewal Membership
     * <p>
     * A prior membership for which the membership is a renewal.
     * 
     */
    @JsonProperty("renewalMembership")
    public Object getRenewalMembership() {
        return renewalMembership;
    }

    /**
     * Renewal Membership
     * <p>
     * A prior membership for which the membership is a renewal.
     * 
     */
    @JsonProperty("renewalMembership")
    public void setRenewalMembership(Object renewalMembership) {
        this.renewalMembership = renewalMembership;
    }

    public ConstituentProgramLevelMemberships withRenewalMembership(Object renewalMembership) {
        this.renewalMembership = renewalMembership;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * A unique identifier for a membership that is maintained through all renewals.
     * 
     */
    @JsonProperty("referenceNumber")
    public Object getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * A unique identifier for a membership that is maintained through all renewals.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(Object referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public ConstituentProgramLevelMemberships withReferenceNumber(Object referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Premiums
     * <p>
     * The goods or services offered as incentives for the membership.
     * 
     */
    @JsonProperty("premiums")
    public List<Premium> getPremiums() {
        return premiums;
    }

    /**
     * Premiums
     * <p>
     * The goods or services offered as incentives for the membership.
     * 
     */
    @JsonProperty("premiums")
    public void setPremiums(List<Premium> premiums) {
        this.premiums = premiums;
    }

    public ConstituentProgramLevelMemberships withPremiums(List<Premium> premiums) {
        this.premiums = premiums;
        return this;
    }

    /**
     * Premium Release
     * <p>
     * The total amount of dues that must be received before premiums can be distributed.
     * 
     */
    @JsonProperty("premiumRelease")
    public Object getPremiumRelease() {
        return premiumRelease;
    }

    /**
     * Premium Release
     * <p>
     * The total amount of dues that must be received before premiums can be distributed.
     * 
     */
    @JsonProperty("premiumRelease")
    public void setPremiumRelease(Object premiumRelease) {
        this.premiumRelease = premiumRelease;
    }

    public ConstituentProgramLevelMemberships withPremiumRelease(Object premiumRelease) {
        this.premiumRelease = premiumRelease;
        return this;
    }

    /**
     * Membership Cards
     * <p>
     * The number of membership cards associated with the membership.
     * 
     */
    @JsonProperty("membershipCards")
    public Object getMembershipCards() {
        return membershipCards;
    }

    /**
     * Membership Cards
     * <p>
     * The number of membership cards associated with the membership.
     * 
     */
    @JsonProperty("membershipCards")
    public void setMembershipCards(Object membershipCards) {
        this.membershipCards = membershipCards;
    }

    public ConstituentProgramLevelMemberships withMembershipCards(Object membershipCards) {
        this.membershipCards = membershipCards;
        return this;
    }

    /**
     * Dues Total
     * <p>
     * The total amount of dues assessed for the membership.
     * 
     */
    @JsonProperty("duesTotal")
    public Object getDuesTotal() {
        return duesTotal;
    }

    /**
     * Dues Total
     * <p>
     * The total amount of dues assessed for the membership.
     * 
     */
    @JsonProperty("duesTotal")
    public void setDuesTotal(Object duesTotal) {
        this.duesTotal = duesTotal;
    }

    public ConstituentProgramLevelMemberships withDuesTotal(Object duesTotal) {
        this.duesTotal = duesTotal;
        return this;
    }

    /**
     * Dues Discount
     * <p>
     * The discount applied to the dues for the membership.
     * 
     */
    @JsonProperty("duesDiscount")
    public Object getDuesDiscount() {
        return duesDiscount;
    }

    /**
     * Dues Discount
     * <p>
     * The discount applied to the dues for the membership.
     * 
     */
    @JsonProperty("duesDiscount")
    public void setDuesDiscount(Object duesDiscount) {
        this.duesDiscount = duesDiscount;
    }

    public ConstituentProgramLevelMemberships withDuesDiscount(Object duesDiscount) {
        this.duesDiscount = duesDiscount;
        return this;
    }

    /**
     * Dues Installments
     * <p>
     * The scheduled installments of the dues with the associated scheduled date, amount due and amount paid.
     * 
     */
    @JsonProperty("duesInstallments")
    public List<DuesInstallment> getDuesInstallments() {
        return duesInstallments;
    }

    /**
     * Dues Installments
     * <p>
     * The scheduled installments of the dues with the associated scheduled date, amount due and amount paid.
     * 
     */
    @JsonProperty("duesInstallments")
    public void setDuesInstallments(List<DuesInstallment> duesInstallments) {
        this.duesInstallments = duesInstallments;
    }

    public ConstituentProgramLevelMemberships withDuesInstallments(List<DuesInstallment> duesInstallments) {
        this.duesInstallments = duesInstallments;
        return this;
    }

    /**
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the membership.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    public Object getAppealCommunicationEffort() {
        return appealCommunicationEffort;
    }

    /**
     * Appeal Communication Effort
     * <p>
     * The appeal communication effort associated with the membership.
     * 
     */
    @JsonProperty("appealCommunicationEffort")
    public void setAppealCommunicationEffort(Object appealCommunicationEffort) {
        this.appealCommunicationEffort = appealCommunicationEffort;
    }

    public ConstituentProgramLevelMemberships withAppealCommunicationEffort(Object appealCommunicationEffort) {
        this.appealCommunicationEffort = appealCommunicationEffort;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the membership.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the membership.
     * 
     */
    @JsonProperty("campaign")
    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public ConstituentProgramLevelMemberships withCampaign(Object campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Gift
     * <p>
     * Information associated with a gift membership.
     * 
     */
    @JsonProperty("gift")
    public Gift getGift() {
        return gift;
    }

    /**
     * Gift
     * <p>
     * Information associated with a gift membership.
     * 
     */
    @JsonProperty("gift")
    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public ConstituentProgramLevelMemberships withGift(Gift gift) {
        this.gift = gift;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments that may be associated with the membership.
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments that may be associated with the membership.
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public ConstituentProgramLevelMemberships withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Membership Number
     * <p>
     * The membership number that is assigned by the system and associated with the membership.
     * 
     */
    @JsonProperty("membershipNumber")
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Membership Number
     * <p>
     * The membership number that is assigned by the system and associated with the membership.
     * 
     */
    @JsonProperty("membershipNumber")
    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public ConstituentProgramLevelMemberships withMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentProgramLevelMemberships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("expireOn");
        sb.append('=');
        sb.append(((this.expireOn == null)?"<null>":this.expireOn));
        sb.append(',');
        sb.append("solicitors");
        sb.append('=');
        sb.append(((this.solicitors == null)?"<null>":this.solicitors));
        sb.append(',');
        sb.append("communicationPlans");
        sb.append('=');
        sb.append(((this.communicationPlans == null)?"<null>":this.communicationPlans));
        sb.append(',');
        sb.append("renewalMembership");
        sb.append('=');
        sb.append(((this.renewalMembership == null)?"<null>":this.renewalMembership));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("premiums");
        sb.append('=');
        sb.append(((this.premiums == null)?"<null>":this.premiums));
        sb.append(',');
        sb.append("premiumRelease");
        sb.append('=');
        sb.append(((this.premiumRelease == null)?"<null>":this.premiumRelease));
        sb.append(',');
        sb.append("membershipCards");
        sb.append('=');
        sb.append(((this.membershipCards == null)?"<null>":this.membershipCards));
        sb.append(',');
        sb.append("duesTotal");
        sb.append('=');
        sb.append(((this.duesTotal == null)?"<null>":this.duesTotal));
        sb.append(',');
        sb.append("duesDiscount");
        sb.append('=');
        sb.append(((this.duesDiscount == null)?"<null>":this.duesDiscount));
        sb.append(',');
        sb.append("duesInstallments");
        sb.append('=');
        sb.append(((this.duesInstallments == null)?"<null>":this.duesInstallments));
        sb.append(',');
        sb.append("appealCommunicationEffort");
        sb.append('=');
        sb.append(((this.appealCommunicationEffort == null)?"<null>":this.appealCommunicationEffort));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("gift");
        sb.append('=');
        sb.append(((this.gift == null)?"<null>":this.gift));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("membershipNumber");
        sb.append('=');
        sb.append(((this.membershipNumber == null)?"<null>":this.membershipNumber));
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
        result = ((result* 31)+((this.expireOn == null)? 0 :this.expireOn.hashCode()));
        result = ((result* 31)+((this.duesInstallments == null)? 0 :this.duesInstallments.hashCode()));
        result = ((result* 31)+((this.gift == null)? 0 :this.gift.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.membershipCards == null)? 0 :this.membershipCards.hashCode()));
        result = ((result* 31)+((this.duesDiscount == null)? 0 :this.duesDiscount.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.appealCommunicationEffort == null)? 0 :this.appealCommunicationEffort.hashCode()));
        result = ((result* 31)+((this.premiumRelease == null)? 0 :this.premiumRelease.hashCode()));
        result = ((result* 31)+((this.premiums == null)? 0 :this.premiums.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.duesTotal == null)? 0 :this.duesTotal.hashCode()));
        result = ((result* 31)+((this.membershipNumber == null)? 0 :this.membershipNumber.hashCode()));
        result = ((result* 31)+((this.communicationPlans == null)? 0 :this.communicationPlans.hashCode()));
        result = ((result* 31)+((this.renewalMembership == null)? 0 :this.renewalMembership.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.solicitors == null)? 0 :this.solicitors.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentProgramLevelMemberships) == false) {
            return false;
        }
        ConstituentProgramLevelMemberships rhs = ((ConstituentProgramLevelMemberships) other);
        return (((((((((((((((((((((((this.expireOn == rhs.expireOn)||((this.expireOn!= null)&&this.expireOn.equals(rhs.expireOn)))&&((this.duesInstallments == rhs.duesInstallments)||((this.duesInstallments!= null)&&this.duesInstallments.equals(rhs.duesInstallments))))&&((this.gift == rhs.gift)||((this.gift!= null)&&this.gift.equals(rhs.gift))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.membershipCards == rhs.membershipCards)||((this.membershipCards!= null)&&this.membershipCards.equals(rhs.membershipCards))))&&((this.duesDiscount == rhs.duesDiscount)||((this.duesDiscount!= null)&&this.duesDiscount.equals(rhs.duesDiscount))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.appealCommunicationEffort == rhs.appealCommunicationEffort)||((this.appealCommunicationEffort!= null)&&this.appealCommunicationEffort.equals(rhs.appealCommunicationEffort))))&&((this.premiumRelease == rhs.premiumRelease)||((this.premiumRelease!= null)&&this.premiumRelease.equals(rhs.premiumRelease))))&&((this.premiums == rhs.premiums)||((this.premiums!= null)&&this.premiums.equals(rhs.premiums))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.duesTotal == rhs.duesTotal)||((this.duesTotal!= null)&&this.duesTotal.equals(rhs.duesTotal))))&&((this.membershipNumber == rhs.membershipNumber)||((this.membershipNumber!= null)&&this.membershipNumber.equals(rhs.membershipNumber))))&&((this.communicationPlans == rhs.communicationPlans)||((this.communicationPlans!= null)&&this.communicationPlans.equals(rhs.communicationPlans))))&&((this.renewalMembership == rhs.renewalMembership)||((this.renewalMembership!= null)&&this.renewalMembership.equals(rhs.renewalMembership))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.solicitors == rhs.solicitors)||((this.solicitors!= null)&&this.solicitors.equals(rhs.solicitors))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
