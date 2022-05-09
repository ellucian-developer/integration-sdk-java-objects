
package com.ellucian.generated.eedm.proposed_planned_gifts.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Proposed Planned Gifts
 * <p>
 * The planned gifts associated with proposals, e.g. bequest, charitable gift, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "proposal",
    "category",
    "status",
    "faceValue",
    "presentValue",
    "remainderValue",
    "payoutRate",
    "notifiedOn",
    "terminatedOn",
    "terminatedAmount",
    "revocability",
    "conditional",
    "referenceNumbers",
    "beneficiaries",
    "notes"
})
@Generated("jsonschema2pojo")
public class ProposedPlannedGifts {

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
     * The global identifier of the proposed planned gift.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the proposed planned gift.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the proposed planned gift.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the proposed planned gift.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the proposed planned gift.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the proposed planned gift.")
    private String description;
    /**
     * Proposal
     * <p>
     * The proposal associated with the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("proposal")
    @JsonPropertyDescription("The proposal associated with the planned gift.")
    private Proposal proposal;
    /**
     * Category
     * <p>
     * The contribution category of the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The contribution category of the planned gift.")
    private Category category;
    /**
     * Status
     * <p>
     * The status of the planned gift, e.g. open, in progress, paid, etc.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the planned gift, e.g. open, in progress, paid, etc.")
    private Status status;
    /**
     * Face Value
     * <p>
     * The face value of the proposed planned gift.
     * 
     */
    @JsonProperty("faceValue")
    @JsonPropertyDescription("The face value of the proposed planned gift.")
    private Object faceValue;
    /**
     * Present Value
     * <p>
     * The present value of the proposed planned gift.
     * 
     */
    @JsonProperty("presentValue")
    @JsonPropertyDescription("The present value of the proposed planned gift.")
    private Object presentValue;
    /**
     * Remainder Value
     * <p>
     * The remainder value of the proposed planned gift.
     * 
     */
    @JsonProperty("remainderValue")
    @JsonPropertyDescription("The remainder value of the proposed planned gift.")
    private Object remainderValue;
    /**
     * Payout Rate
     * <p>
     * The annual rate of payments for the proposed planned gift.
     * 
     */
    @JsonProperty("payoutRate")
    @JsonPropertyDescription("The annual rate of payments for the proposed planned gift.")
    private Object payoutRate;
    /**
     * Notified On
     * <p>
     * The date on which the institution was notified about the proposed planned gift.
     * 
     */
    @JsonProperty("notifiedOn")
    @JsonPropertyDescription("The date on which the institution was notified about the proposed planned gift.")
    private Object notifiedOn;
    /**
     * Terminated On
     * <p>
     * The date on which the proposed planned gift was terminated.
     * 
     */
    @JsonProperty("terminatedOn")
    @JsonPropertyDescription("The date on which the proposed planned gift was terminated.")
    private Object terminatedOn;
    /**
     * Terminated Amount
     * <p>
     * The amount of the proposed planned gift that will not be received due to termination of the planned gift.
     * 
     */
    @JsonProperty("terminatedAmount")
    @JsonPropertyDescription("The amount of the proposed planned gift that will not be received due to termination of the planned gift.")
    private Object terminatedAmount;
    /**
     * Revocability
     * <p>
     * An indicator that identifies if the proposed planned gift can be revoked.
     * 
     */
    @JsonProperty("revocability")
    @JsonPropertyDescription("An indicator that identifies if the proposed planned gift can be revoked.")
    private Object revocability;
    /**
     * Conditional
     * <p>
     * An indicator that identifies if the proposed planned gift has conditions.
     * 
     */
    @JsonProperty("conditional")
    @JsonPropertyDescription("An indicator that identifies if the proposed planned gift has conditions.")
    private Object conditional;
    /**
     * Reference Numbers
     * <p>
     * The reference numbers associated with the planned gift.
     * 
     */
    @JsonProperty("referenceNumbers")
    @JsonPropertyDescription("The reference numbers associated with the planned gift.")
    private List<String> referenceNumbers = new ArrayList<String>();
    /**
     * Beneficiaries
     * <p>
     * The beneficiaries associated with the proposed planned gift.
     * 
     */
    @JsonProperty("beneficiaries")
    @JsonPropertyDescription("The beneficiaries associated with the proposed planned gift.")
    private List<Beneficiary> beneficiaries = new ArrayList<Beneficiary>();
    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the proposed planned gifts.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("The notes that have been generated regarding the proposed planned gifts.")
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

    public ProposedPlannedGifts withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the proposed planned gift.
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
     * The global identifier of the proposed planned gift.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ProposedPlannedGifts withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the proposed planned gift.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the proposed planned gift.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ProposedPlannedGifts withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the proposed planned gift.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the proposed planned gift.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ProposedPlannedGifts withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("proposal")
    public Proposal getProposal() {
        return proposal;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("proposal")
    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    public ProposedPlannedGifts withProposal(Proposal proposal) {
        this.proposal = proposal;
        return this;
    }

    /**
     * Category
     * <p>
     * The contribution category of the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The contribution category of the planned gift.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public ProposedPlannedGifts withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the planned gift, e.g. open, in progress, paid, etc.
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
     * The status of the planned gift, e.g. open, in progress, paid, etc.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public ProposedPlannedGifts withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Face Value
     * <p>
     * The face value of the proposed planned gift.
     * 
     */
    @JsonProperty("faceValue")
    public Object getFaceValue() {
        return faceValue;
    }

    /**
     * Face Value
     * <p>
     * The face value of the proposed planned gift.
     * 
     */
    @JsonProperty("faceValue")
    public void setFaceValue(Object faceValue) {
        this.faceValue = faceValue;
    }

    public ProposedPlannedGifts withFaceValue(Object faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /**
     * Present Value
     * <p>
     * The present value of the proposed planned gift.
     * 
     */
    @JsonProperty("presentValue")
    public Object getPresentValue() {
        return presentValue;
    }

    /**
     * Present Value
     * <p>
     * The present value of the proposed planned gift.
     * 
     */
    @JsonProperty("presentValue")
    public void setPresentValue(Object presentValue) {
        this.presentValue = presentValue;
    }

    public ProposedPlannedGifts withPresentValue(Object presentValue) {
        this.presentValue = presentValue;
        return this;
    }

    /**
     * Remainder Value
     * <p>
     * The remainder value of the proposed planned gift.
     * 
     */
    @JsonProperty("remainderValue")
    public Object getRemainderValue() {
        return remainderValue;
    }

    /**
     * Remainder Value
     * <p>
     * The remainder value of the proposed planned gift.
     * 
     */
    @JsonProperty("remainderValue")
    public void setRemainderValue(Object remainderValue) {
        this.remainderValue = remainderValue;
    }

    public ProposedPlannedGifts withRemainderValue(Object remainderValue) {
        this.remainderValue = remainderValue;
        return this;
    }

    /**
     * Payout Rate
     * <p>
     * The annual rate of payments for the proposed planned gift.
     * 
     */
    @JsonProperty("payoutRate")
    public Object getPayoutRate() {
        return payoutRate;
    }

    /**
     * Payout Rate
     * <p>
     * The annual rate of payments for the proposed planned gift.
     * 
     */
    @JsonProperty("payoutRate")
    public void setPayoutRate(Object payoutRate) {
        this.payoutRate = payoutRate;
    }

    public ProposedPlannedGifts withPayoutRate(Object payoutRate) {
        this.payoutRate = payoutRate;
        return this;
    }

    /**
     * Notified On
     * <p>
     * The date on which the institution was notified about the proposed planned gift.
     * 
     */
    @JsonProperty("notifiedOn")
    public Object getNotifiedOn() {
        return notifiedOn;
    }

    /**
     * Notified On
     * <p>
     * The date on which the institution was notified about the proposed planned gift.
     * 
     */
    @JsonProperty("notifiedOn")
    public void setNotifiedOn(Object notifiedOn) {
        this.notifiedOn = notifiedOn;
    }

    public ProposedPlannedGifts withNotifiedOn(Object notifiedOn) {
        this.notifiedOn = notifiedOn;
        return this;
    }

    /**
     * Terminated On
     * <p>
     * The date on which the proposed planned gift was terminated.
     * 
     */
    @JsonProperty("terminatedOn")
    public Object getTerminatedOn() {
        return terminatedOn;
    }

    /**
     * Terminated On
     * <p>
     * The date on which the proposed planned gift was terminated.
     * 
     */
    @JsonProperty("terminatedOn")
    public void setTerminatedOn(Object terminatedOn) {
        this.terminatedOn = terminatedOn;
    }

    public ProposedPlannedGifts withTerminatedOn(Object terminatedOn) {
        this.terminatedOn = terminatedOn;
        return this;
    }

    /**
     * Terminated Amount
     * <p>
     * The amount of the proposed planned gift that will not be received due to termination of the planned gift.
     * 
     */
    @JsonProperty("terminatedAmount")
    public Object getTerminatedAmount() {
        return terminatedAmount;
    }

    /**
     * Terminated Amount
     * <p>
     * The amount of the proposed planned gift that will not be received due to termination of the planned gift.
     * 
     */
    @JsonProperty("terminatedAmount")
    public void setTerminatedAmount(Object terminatedAmount) {
        this.terminatedAmount = terminatedAmount;
    }

    public ProposedPlannedGifts withTerminatedAmount(Object terminatedAmount) {
        this.terminatedAmount = terminatedAmount;
        return this;
    }

    /**
     * Revocability
     * <p>
     * An indicator that identifies if the proposed planned gift can be revoked.
     * 
     */
    @JsonProperty("revocability")
    public Object getRevocability() {
        return revocability;
    }

    /**
     * Revocability
     * <p>
     * An indicator that identifies if the proposed planned gift can be revoked.
     * 
     */
    @JsonProperty("revocability")
    public void setRevocability(Object revocability) {
        this.revocability = revocability;
    }

    public ProposedPlannedGifts withRevocability(Object revocability) {
        this.revocability = revocability;
        return this;
    }

    /**
     * Conditional
     * <p>
     * An indicator that identifies if the proposed planned gift has conditions.
     * 
     */
    @JsonProperty("conditional")
    public Object getConditional() {
        return conditional;
    }

    /**
     * Conditional
     * <p>
     * An indicator that identifies if the proposed planned gift has conditions.
     * 
     */
    @JsonProperty("conditional")
    public void setConditional(Object conditional) {
        this.conditional = conditional;
    }

    public ProposedPlannedGifts withConditional(Object conditional) {
        this.conditional = conditional;
        return this;
    }

    /**
     * Reference Numbers
     * <p>
     * The reference numbers associated with the planned gift.
     * 
     */
    @JsonProperty("referenceNumbers")
    public List<String> getReferenceNumbers() {
        return referenceNumbers;
    }

    /**
     * Reference Numbers
     * <p>
     * The reference numbers associated with the planned gift.
     * 
     */
    @JsonProperty("referenceNumbers")
    public void setReferenceNumbers(List<String> referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
    }

    public ProposedPlannedGifts withReferenceNumbers(List<String> referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
        return this;
    }

    /**
     * Beneficiaries
     * <p>
     * The beneficiaries associated with the proposed planned gift.
     * 
     */
    @JsonProperty("beneficiaries")
    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    /**
     * Beneficiaries
     * <p>
     * The beneficiaries associated with the proposed planned gift.
     * 
     */
    @JsonProperty("beneficiaries")
    public void setBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public ProposedPlannedGifts withBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
        return this;
    }

    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the proposed planned gifts.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the proposed planned gifts.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public ProposedPlannedGifts withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProposedPlannedGifts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("proposal");
        sb.append('=');
        sb.append(((this.proposal == null)?"<null>":this.proposal));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("faceValue");
        sb.append('=');
        sb.append(((this.faceValue == null)?"<null>":this.faceValue));
        sb.append(',');
        sb.append("presentValue");
        sb.append('=');
        sb.append(((this.presentValue == null)?"<null>":this.presentValue));
        sb.append(',');
        sb.append("remainderValue");
        sb.append('=');
        sb.append(((this.remainderValue == null)?"<null>":this.remainderValue));
        sb.append(',');
        sb.append("payoutRate");
        sb.append('=');
        sb.append(((this.payoutRate == null)?"<null>":this.payoutRate));
        sb.append(',');
        sb.append("notifiedOn");
        sb.append('=');
        sb.append(((this.notifiedOn == null)?"<null>":this.notifiedOn));
        sb.append(',');
        sb.append("terminatedOn");
        sb.append('=');
        sb.append(((this.terminatedOn == null)?"<null>":this.terminatedOn));
        sb.append(',');
        sb.append("terminatedAmount");
        sb.append('=');
        sb.append(((this.terminatedAmount == null)?"<null>":this.terminatedAmount));
        sb.append(',');
        sb.append("revocability");
        sb.append('=');
        sb.append(((this.revocability == null)?"<null>":this.revocability));
        sb.append(',');
        sb.append("conditional");
        sb.append('=');
        sb.append(((this.conditional == null)?"<null>":this.conditional));
        sb.append(',');
        sb.append("referenceNumbers");
        sb.append('=');
        sb.append(((this.referenceNumbers == null)?"<null>":this.referenceNumbers));
        sb.append(',');
        sb.append("beneficiaries");
        sb.append('=');
        sb.append(((this.beneficiaries == null)?"<null>":this.beneficiaries));
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
        result = ((result* 31)+((this.proposal == null)? 0 :this.proposal.hashCode()));
        result = ((result* 31)+((this.notifiedOn == null)? 0 :this.notifiedOn.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.conditional == null)? 0 :this.conditional.hashCode()));
        result = ((result* 31)+((this.payoutRate == null)? 0 :this.payoutRate.hashCode()));
        result = ((result* 31)+((this.remainderValue == null)? 0 :this.remainderValue.hashCode()));
        result = ((result* 31)+((this.terminatedAmount == null)? 0 :this.terminatedAmount.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.terminatedOn == null)? 0 :this.terminatedOn.hashCode()));
        result = ((result* 31)+((this.presentValue == null)? 0 :this.presentValue.hashCode()));
        result = ((result* 31)+((this.revocability == null)? 0 :this.revocability.hashCode()));
        result = ((result* 31)+((this.faceValue == null)? 0 :this.faceValue.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.referenceNumbers == null)? 0 :this.referenceNumbers.hashCode()));
        result = ((result* 31)+((this.beneficiaries == null)? 0 :this.beneficiaries.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposedPlannedGifts) == false) {
            return false;
        }
        ProposedPlannedGifts rhs = ((ProposedPlannedGifts) other);
        return ((((((((((((((((((((this.proposal == rhs.proposal)||((this.proposal!= null)&&this.proposal.equals(rhs.proposal)))&&((this.notifiedOn == rhs.notifiedOn)||((this.notifiedOn!= null)&&this.notifiedOn.equals(rhs.notifiedOn))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.conditional == rhs.conditional)||((this.conditional!= null)&&this.conditional.equals(rhs.conditional))))&&((this.payoutRate == rhs.payoutRate)||((this.payoutRate!= null)&&this.payoutRate.equals(rhs.payoutRate))))&&((this.remainderValue == rhs.remainderValue)||((this.remainderValue!= null)&&this.remainderValue.equals(rhs.remainderValue))))&&((this.terminatedAmount == rhs.terminatedAmount)||((this.terminatedAmount!= null)&&this.terminatedAmount.equals(rhs.terminatedAmount))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.terminatedOn == rhs.terminatedOn)||((this.terminatedOn!= null)&&this.terminatedOn.equals(rhs.terminatedOn))))&&((this.presentValue == rhs.presentValue)||((this.presentValue!= null)&&this.presentValue.equals(rhs.presentValue))))&&((this.revocability == rhs.revocability)||((this.revocability!= null)&&this.revocability.equals(rhs.revocability))))&&((this.faceValue == rhs.faceValue)||((this.faceValue!= null)&&this.faceValue.equals(rhs.faceValue))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.referenceNumbers == rhs.referenceNumbers)||((this.referenceNumbers!= null)&&this.referenceNumbers.equals(rhs.referenceNumbers))))&&((this.beneficiaries == rhs.beneficiaries)||((this.beneficiaries!= null)&&this.beneficiaries.equals(rhs.beneficiaries))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
