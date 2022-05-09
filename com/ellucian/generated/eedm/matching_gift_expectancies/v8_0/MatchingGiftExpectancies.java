
package com.ellucian.generated.eedm.matching_gift_expectancies.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Matching Gift Expectancies
 * <p>
 * Information about an expected gift from an organization in response to a contribution made by a constituent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "matchedContribution",
    "matchingGift",
    "organization",
    "expectedAmount",
    "receivedAmount",
    "thirdPartyFee",
    "formReceivedOn",
    "status",
    "statusDate",
    "donors",
    "allocations",
    "notes"
})
@Generated("jsonschema2pojo")
public class MatchingGiftExpectancies {

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
     * The global identifier of the matching gift expectancy.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the matching gift expectancy.")
    private String id;
    /**
     * Person
     * <p>
     * The person who made the original contribution.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who made the original contribution.")
    private Person person;
    /**
     * Matched Contribution
     * <p>
     * The contribution that is expected to be matched by the specified organization.
     * (Required)
     * 
     */
    @JsonProperty("matchedContribution")
    @JsonPropertyDescription("The contribution that is expected to be matched by the specified organization.")
    private MatchedContribution matchedContribution;
    /**
     * Matching Gift
     * <p>
     * The organization's contribution that fulfills the expected matching contribution.
     * 
     */
    @JsonProperty("matchingGift")
    @JsonPropertyDescription("The organization's contribution that fulfills the expected matching contribution.")
    private Object matchingGift;
    /**
     * Organization
     * <p>
     * An organization that is expected to match the person's contribution.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("An organization that is expected to match the person's contribution.")
    private Organization organization;
    /**
     * Expected Amount
     * <p>
     * The expected amount of the matching contribution.
     * (Required)
     * 
     */
    @JsonProperty("expectedAmount")
    @JsonPropertyDescription("The expected amount of the matching contribution.")
    private ExpectedAmount expectedAmount;
    /**
     * Received Amount
     * <p>
     * The actual amount received for the matching contribution.
     * 
     */
    @JsonProperty("receivedAmount")
    @JsonPropertyDescription("The actual amount received for the matching contribution.")
    private Object receivedAmount;
    /**
     * Third Party Fee
     * <p>
     * Fee paid to a third party associated with obtaining the matched contribution.
     * 
     */
    @JsonProperty("thirdPartyFee")
    @JsonPropertyDescription("Fee paid to a third party associated with obtaining the matched contribution.")
    private Object thirdPartyFee;
    /**
     * Form Received On
     * <p>
     * The date when the matching gift form was received.
     * 
     */
    @JsonProperty("formReceivedOn")
    @JsonPropertyDescription("The date when the matching gift form was received.")
    private Object formReceivedOn;
    /**
     * Status
     * <p>
     * The current status of the matching gift expectancy.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current status of the matching gift expectancy.")
    private Status status;
    /**
     * Status Date
     * <p>
     * The date when the current status was set.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("The date when the current status was set.")
    private Object statusDate;
    /**
     * Donors
     * <p>
     * Constituents who will receive match credit for the organization's matching contribution.
     * 
     */
    @JsonProperty("donors")
    @JsonPropertyDescription("Constituents who will receive match credit for the organization's matching contribution.")
    private List<Object> donors = new ArrayList<Object>();
    /**
     * Allocations
     * <p>
     * Expected designation and campaign distribution for the matching contribution.
     * 
     */
    @JsonProperty("allocations")
    @JsonPropertyDescription("Expected designation and campaign distribution for the matching contribution.")
    private List<Allocation> allocations = new ArrayList<Allocation>();
    /**
     * Notes
     * <p>
     * Any notes generated for the matching gift expectancy.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Any notes generated for the matching gift expectancy.")
    private List<Note> notes = new ArrayList<Note>();

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

    public MatchingGiftExpectancies withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the matching gift expectancy.
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
     * The global identifier of the matching gift expectancy.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MatchingGiftExpectancies withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who made the original contribution.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person who made the original contribution.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public MatchingGiftExpectancies withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Matched Contribution
     * <p>
     * The contribution that is expected to be matched by the specified organization.
     * (Required)
     * 
     */
    @JsonProperty("matchedContribution")
    public MatchedContribution getMatchedContribution() {
        return matchedContribution;
    }

    /**
     * Matched Contribution
     * <p>
     * The contribution that is expected to be matched by the specified organization.
     * (Required)
     * 
     */
    @JsonProperty("matchedContribution")
    public void setMatchedContribution(MatchedContribution matchedContribution) {
        this.matchedContribution = matchedContribution;
    }

    public MatchingGiftExpectancies withMatchedContribution(MatchedContribution matchedContribution) {
        this.matchedContribution = matchedContribution;
        return this;
    }

    /**
     * Matching Gift
     * <p>
     * The organization's contribution that fulfills the expected matching contribution.
     * 
     */
    @JsonProperty("matchingGift")
    public Object getMatchingGift() {
        return matchingGift;
    }

    /**
     * Matching Gift
     * <p>
     * The organization's contribution that fulfills the expected matching contribution.
     * 
     */
    @JsonProperty("matchingGift")
    public void setMatchingGift(Object matchingGift) {
        this.matchingGift = matchingGift;
    }

    public MatchingGiftExpectancies withMatchingGift(Object matchingGift) {
        this.matchingGift = matchingGift;
        return this;
    }

    /**
     * Organization
     * <p>
     * An organization that is expected to match the person's contribution.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Organization
     * <p>
     * An organization that is expected to match the person's contribution.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public MatchingGiftExpectancies withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Expected Amount
     * <p>
     * The expected amount of the matching contribution.
     * (Required)
     * 
     */
    @JsonProperty("expectedAmount")
    public ExpectedAmount getExpectedAmount() {
        return expectedAmount;
    }

    /**
     * Expected Amount
     * <p>
     * The expected amount of the matching contribution.
     * (Required)
     * 
     */
    @JsonProperty("expectedAmount")
    public void setExpectedAmount(ExpectedAmount expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public MatchingGiftExpectancies withExpectedAmount(ExpectedAmount expectedAmount) {
        this.expectedAmount = expectedAmount;
        return this;
    }

    /**
     * Received Amount
     * <p>
     * The actual amount received for the matching contribution.
     * 
     */
    @JsonProperty("receivedAmount")
    public Object getReceivedAmount() {
        return receivedAmount;
    }

    /**
     * Received Amount
     * <p>
     * The actual amount received for the matching contribution.
     * 
     */
    @JsonProperty("receivedAmount")
    public void setReceivedAmount(Object receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public MatchingGiftExpectancies withReceivedAmount(Object receivedAmount) {
        this.receivedAmount = receivedAmount;
        return this;
    }

    /**
     * Third Party Fee
     * <p>
     * Fee paid to a third party associated with obtaining the matched contribution.
     * 
     */
    @JsonProperty("thirdPartyFee")
    public Object getThirdPartyFee() {
        return thirdPartyFee;
    }

    /**
     * Third Party Fee
     * <p>
     * Fee paid to a third party associated with obtaining the matched contribution.
     * 
     */
    @JsonProperty("thirdPartyFee")
    public void setThirdPartyFee(Object thirdPartyFee) {
        this.thirdPartyFee = thirdPartyFee;
    }

    public MatchingGiftExpectancies withThirdPartyFee(Object thirdPartyFee) {
        this.thirdPartyFee = thirdPartyFee;
        return this;
    }

    /**
     * Form Received On
     * <p>
     * The date when the matching gift form was received.
     * 
     */
    @JsonProperty("formReceivedOn")
    public Object getFormReceivedOn() {
        return formReceivedOn;
    }

    /**
     * Form Received On
     * <p>
     * The date when the matching gift form was received.
     * 
     */
    @JsonProperty("formReceivedOn")
    public void setFormReceivedOn(Object formReceivedOn) {
        this.formReceivedOn = formReceivedOn;
    }

    public MatchingGiftExpectancies withFormReceivedOn(Object formReceivedOn) {
        this.formReceivedOn = formReceivedOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The current status of the matching gift expectancy.
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
     * The current status of the matching gift expectancy.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public MatchingGiftExpectancies withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Date
     * <p>
     * The date when the current status was set.
     * 
     */
    @JsonProperty("statusDate")
    public Object getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * The date when the current status was set.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Object statusDate) {
        this.statusDate = statusDate;
    }

    public MatchingGiftExpectancies withStatusDate(Object statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Donors
     * <p>
     * Constituents who will receive match credit for the organization's matching contribution.
     * 
     */
    @JsonProperty("donors")
    public List<Object> getDonors() {
        return donors;
    }

    /**
     * Donors
     * <p>
     * Constituents who will receive match credit for the organization's matching contribution.
     * 
     */
    @JsonProperty("donors")
    public void setDonors(List<Object> donors) {
        this.donors = donors;
    }

    public MatchingGiftExpectancies withDonors(List<Object> donors) {
        this.donors = donors;
        return this;
    }

    /**
     * Allocations
     * <p>
     * Expected designation and campaign distribution for the matching contribution.
     * 
     */
    @JsonProperty("allocations")
    public List<Allocation> getAllocations() {
        return allocations;
    }

    /**
     * Allocations
     * <p>
     * Expected designation and campaign distribution for the matching contribution.
     * 
     */
    @JsonProperty("allocations")
    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
    }

    public MatchingGiftExpectancies withAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
        return this;
    }

    /**
     * Notes
     * <p>
     * Any notes generated for the matching gift expectancy.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Any notes generated for the matching gift expectancy.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public MatchingGiftExpectancies withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MatchingGiftExpectancies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("matchedContribution");
        sb.append('=');
        sb.append(((this.matchedContribution == null)?"<null>":this.matchedContribution));
        sb.append(',');
        sb.append("matchingGift");
        sb.append('=');
        sb.append(((this.matchingGift == null)?"<null>":this.matchingGift));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("expectedAmount");
        sb.append('=');
        sb.append(((this.expectedAmount == null)?"<null>":this.expectedAmount));
        sb.append(',');
        sb.append("receivedAmount");
        sb.append('=');
        sb.append(((this.receivedAmount == null)?"<null>":this.receivedAmount));
        sb.append(',');
        sb.append("thirdPartyFee");
        sb.append('=');
        sb.append(((this.thirdPartyFee == null)?"<null>":this.thirdPartyFee));
        sb.append(',');
        sb.append("formReceivedOn");
        sb.append('=');
        sb.append(((this.formReceivedOn == null)?"<null>":this.formReceivedOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("donors");
        sb.append('=');
        sb.append(((this.donors == null)?"<null>":this.donors));
        sb.append(',');
        sb.append("allocations");
        sb.append('=');
        sb.append(((this.allocations == null)?"<null>":this.allocations));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
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
        result = ((result* 31)+((this.matchedContribution == null)? 0 :this.matchedContribution.hashCode()));
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.thirdPartyFee == null)? 0 :this.thirdPartyFee.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.receivedAmount == null)? 0 :this.receivedAmount.hashCode()));
        result = ((result* 31)+((this.formReceivedOn == null)? 0 :this.formReceivedOn.hashCode()));
        result = ((result* 31)+((this.allocations == null)? 0 :this.allocations.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.matchingGift == null)? 0 :this.matchingGift.hashCode()));
        result = ((result* 31)+((this.donors == null)? 0 :this.donors.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.expectedAmount == null)? 0 :this.expectedAmount.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchingGiftExpectancies) == false) {
            return false;
        }
        MatchingGiftExpectancies rhs = ((MatchingGiftExpectancies) other);
        return ((((((((((((((((this.matchedContribution == rhs.matchedContribution)||((this.matchedContribution!= null)&&this.matchedContribution.equals(rhs.matchedContribution)))&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.thirdPartyFee == rhs.thirdPartyFee)||((this.thirdPartyFee!= null)&&this.thirdPartyFee.equals(rhs.thirdPartyFee))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.receivedAmount == rhs.receivedAmount)||((this.receivedAmount!= null)&&this.receivedAmount.equals(rhs.receivedAmount))))&&((this.formReceivedOn == rhs.formReceivedOn)||((this.formReceivedOn!= null)&&this.formReceivedOn.equals(rhs.formReceivedOn))))&&((this.allocations == rhs.allocations)||((this.allocations!= null)&&this.allocations.equals(rhs.allocations))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.matchingGift == rhs.matchingGift)||((this.matchingGift!= null)&&this.matchingGift.equals(rhs.matchingGift))))&&((this.donors == rhs.donors)||((this.donors!= null)&&this.donors.equals(rhs.donors))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.expectedAmount == rhs.expectedAmount)||((this.expectedAmount!= null)&&this.expectedAmount.equals(rhs.expectedAmount))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
