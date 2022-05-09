
package com.ellucian.generated.eedm.contributions.v12_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Contributions
 * <p>
 * The contributions (gifts, pledges, pledge payments, etc.) made to the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "type",
    "activityDates",
    "fiscalYear",
    "contributionNumber",
    "proposal",
    "amounts",
    "anonymity",
    "paymentFor",
    "allocations",
    "givingClassifications",
    "solicitationMethod",
    "communicationPlans",
    "specialHandlingInstructions",
    "category",
    "premiumAssignments",
    "payments",
    "specifics",
    "solicitors",
    "comment"
})
@Generated("jsonschema2pojo")
public class Contributions {

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
     * The global identifier of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the contribution.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the contribution.")
    private String title;
    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the contribution (e.g. gift, pledge).")
    private Contributions.Type type;
    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    @JsonPropertyDescription("A list of event dates associated with the contribution.")
    private List<ActivityDate> activityDates = new ArrayList<ActivityDate>();
    /**
     * Fiscal Year
     * <p>
     * The fiscal year to which the contribution is applied.
     * 
     */
    @JsonProperty("fiscalYear")
    @JsonPropertyDescription("The fiscal year to which the contribution is applied.")
    private String fiscalYear;
    /**
     * Contribution Number
     * <p>
     * An assigned number to identify the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributionNumber")
    @JsonPropertyDescription("An assigned number to identify the contribution.")
    private Double contributionNumber;
    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    @JsonPropertyDescription("The proposal associated with the contribution.")
    private Object proposal;
    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    @JsonPropertyDescription("The monetary amounts associated with the contribution.")
    private Amounts amounts;
    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    @JsonPropertyDescription("The level of anonymity that should be applied to the contribution.")
    private Object anonymity;
    /**
     * Payment For
     * <p>
     * The contribution or membership for which the payment was made.
     * 
     */
    @JsonProperty("paymentFor")
    @JsonPropertyDescription("The contribution or membership for which the payment was made.")
    private Object paymentFor;
    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    @JsonPropertyDescription("Allocation of the contribution among donors to assign donation credit and to map to designations.")
    private List<Allocation> allocations = new ArrayList<Allocation>();
    /**
     * Giving Classifications
     * <p>
     * A categorization of the contribution for reporting and tracking purposes.
     * 
     */
    @JsonProperty("givingClassifications")
    @JsonPropertyDescription("A categorization of the contribution for reporting and tracking purposes.")
    private List<GivingClassification> givingClassifications = new ArrayList<GivingClassification>();
    /**
     * Solicitation Method
     * <p>
     * The solicitation method associated with the contribution, e.g. direct mail, in person, online event, and phonathon, etc.
     * 
     */
    @JsonProperty("solicitationMethod")
    @JsonPropertyDescription("The solicitation method associated with the contribution, e.g. direct mail, in person, online event, and phonathon, etc.")
    private Object solicitationMethod;
    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the contribution.
     * 
     */
    @JsonProperty("communicationPlans")
    @JsonPropertyDescription("The communication plans associated with the contribution.")
    private List<CommunicationPlan> communicationPlans = new ArrayList<CommunicationPlan>();
    /**
     * Special Handling Instructions
     * <p>
     * The list of special handling instructions applicable to the contribution, e.g. no reminders, notify comptroller, notify president's office, etc.
     * 
     */
    @JsonProperty("specialHandlingInstructions")
    @JsonPropertyDescription("The list of special handling instructions applicable to the contribution, e.g. no reminders, notify comptroller, notify president's office, etc.")
    private List<SpecialHandlingInstruction> specialHandlingInstructions = new ArrayList<SpecialHandlingInstruction>();
    /**
     * Category
     * <p>
     * A user defined category associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A user defined category associated with the contribution.")
    private Category category;
    /**
     * Premium Assignments
     * <p>
     * The premiums assigned as a result of the contribution.
     * 
     */
    @JsonProperty("premiumAssignments")
    @JsonPropertyDescription("The premiums assigned as a result of the contribution.")
    private List<PremiumAssignment> premiumAssignments = new ArrayList<PremiumAssignment>();
    /**
     * Payments
     * <p>
     * Details of the payments included with the contribution.
     * 
     */
    @JsonProperty("payments")
    @JsonPropertyDescription("Details of the payments included with the contribution.")
    private List<Payment> payments = new ArrayList<Payment>();
    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    @JsonPropertyDescription("Attributes that are specific to the type of contribution.")
    private Object specifics;
    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution.
     * 
     */
    @JsonProperty("solicitors")
    @JsonPropertyDescription("The people, teams, or organizations responsible for generating the contribution.")
    private List<Solicitor> solicitors = new ArrayList<Solicitor>();
    /**
     * Comment
     * <p>
     * The comment associated with the contribution.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the contribution.")
    private String comment;

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

    public Contributions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the contribution.
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
     * The global identifier of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Contributions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the contribution.
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
     * The full name of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Contributions withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Contributions.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Contributions.Type type) {
        this.type = type;
    }

    public Contributions withType(Contributions.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    public List<ActivityDate> getActivityDates() {
        return activityDates;
    }

    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    public void setActivityDates(List<ActivityDate> activityDates) {
        this.activityDates = activityDates;
    }

    public Contributions withActivityDates(List<ActivityDate> activityDates) {
        this.activityDates = activityDates;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * The fiscal year to which the contribution is applied.
     * 
     */
    @JsonProperty("fiscalYear")
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Fiscal Year
     * <p>
     * The fiscal year to which the contribution is applied.
     * 
     */
    @JsonProperty("fiscalYear")
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Contributions withFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    /**
     * Contribution Number
     * <p>
     * An assigned number to identify the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributionNumber")
    public Double getContributionNumber() {
        return contributionNumber;
    }

    /**
     * Contribution Number
     * <p>
     * An assigned number to identify the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributionNumber")
    public void setContributionNumber(Double contributionNumber) {
        this.contributionNumber = contributionNumber;
    }

    public Contributions withContributionNumber(Double contributionNumber) {
        this.contributionNumber = contributionNumber;
        return this;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    public Object getProposal() {
        return proposal;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    public void setProposal(Object proposal) {
        this.proposal = proposal;
    }

    public Contributions withProposal(Object proposal) {
        this.proposal = proposal;
        return this;
    }

    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public Amounts getAmounts() {
        return amounts;
    }

    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public Contributions withAmounts(Amounts amounts) {
        this.amounts = amounts;
        return this;
    }

    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    public Object getAnonymity() {
        return anonymity;
    }

    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    public void setAnonymity(Object anonymity) {
        this.anonymity = anonymity;
    }

    public Contributions withAnonymity(Object anonymity) {
        this.anonymity = anonymity;
        return this;
    }

    /**
     * Payment For
     * <p>
     * The contribution or membership for which the payment was made.
     * 
     */
    @JsonProperty("paymentFor")
    public Object getPaymentFor() {
        return paymentFor;
    }

    /**
     * Payment For
     * <p>
     * The contribution or membership for which the payment was made.
     * 
     */
    @JsonProperty("paymentFor")
    public void setPaymentFor(Object paymentFor) {
        this.paymentFor = paymentFor;
    }

    public Contributions withPaymentFor(Object paymentFor) {
        this.paymentFor = paymentFor;
        return this;
    }

    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    public List<Allocation> getAllocations() {
        return allocations;
    }

    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
    }

    public Contributions withAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
        return this;
    }

    /**
     * Giving Classifications
     * <p>
     * A categorization of the contribution for reporting and tracking purposes.
     * 
     */
    @JsonProperty("givingClassifications")
    public List<GivingClassification> getGivingClassifications() {
        return givingClassifications;
    }

    /**
     * Giving Classifications
     * <p>
     * A categorization of the contribution for reporting and tracking purposes.
     * 
     */
    @JsonProperty("givingClassifications")
    public void setGivingClassifications(List<GivingClassification> givingClassifications) {
        this.givingClassifications = givingClassifications;
    }

    public Contributions withGivingClassifications(List<GivingClassification> givingClassifications) {
        this.givingClassifications = givingClassifications;
        return this;
    }

    /**
     * Solicitation Method
     * <p>
     * The solicitation method associated with the contribution, e.g. direct mail, in person, online event, and phonathon, etc.
     * 
     */
    @JsonProperty("solicitationMethod")
    public Object getSolicitationMethod() {
        return solicitationMethod;
    }

    /**
     * Solicitation Method
     * <p>
     * The solicitation method associated with the contribution, e.g. direct mail, in person, online event, and phonathon, etc.
     * 
     */
    @JsonProperty("solicitationMethod")
    public void setSolicitationMethod(Object solicitationMethod) {
        this.solicitationMethod = solicitationMethod;
    }

    public Contributions withSolicitationMethod(Object solicitationMethod) {
        this.solicitationMethod = solicitationMethod;
        return this;
    }

    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the contribution.
     * 
     */
    @JsonProperty("communicationPlans")
    public List<CommunicationPlan> getCommunicationPlans() {
        return communicationPlans;
    }

    /**
     * Communication Plans
     * <p>
     * The communication plans associated with the contribution.
     * 
     */
    @JsonProperty("communicationPlans")
    public void setCommunicationPlans(List<CommunicationPlan> communicationPlans) {
        this.communicationPlans = communicationPlans;
    }

    public Contributions withCommunicationPlans(List<CommunicationPlan> communicationPlans) {
        this.communicationPlans = communicationPlans;
        return this;
    }

    /**
     * Special Handling Instructions
     * <p>
     * The list of special handling instructions applicable to the contribution, e.g. no reminders, notify comptroller, notify president's office, etc.
     * 
     */
    @JsonProperty("specialHandlingInstructions")
    public List<SpecialHandlingInstruction> getSpecialHandlingInstructions() {
        return specialHandlingInstructions;
    }

    /**
     * Special Handling Instructions
     * <p>
     * The list of special handling instructions applicable to the contribution, e.g. no reminders, notify comptroller, notify president's office, etc.
     * 
     */
    @JsonProperty("specialHandlingInstructions")
    public void setSpecialHandlingInstructions(List<SpecialHandlingInstruction> specialHandlingInstructions) {
        this.specialHandlingInstructions = specialHandlingInstructions;
    }

    public Contributions withSpecialHandlingInstructions(List<SpecialHandlingInstruction> specialHandlingInstructions) {
        this.specialHandlingInstructions = specialHandlingInstructions;
        return this;
    }

    /**
     * Category
     * <p>
     * A user defined category associated with the contribution.
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
     * A user defined category associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public Contributions withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Premium Assignments
     * <p>
     * The premiums assigned as a result of the contribution.
     * 
     */
    @JsonProperty("premiumAssignments")
    public List<PremiumAssignment> getPremiumAssignments() {
        return premiumAssignments;
    }

    /**
     * Premium Assignments
     * <p>
     * The premiums assigned as a result of the contribution.
     * 
     */
    @JsonProperty("premiumAssignments")
    public void setPremiumAssignments(List<PremiumAssignment> premiumAssignments) {
        this.premiumAssignments = premiumAssignments;
    }

    public Contributions withPremiumAssignments(List<PremiumAssignment> premiumAssignments) {
        this.premiumAssignments = premiumAssignments;
        return this;
    }

    /**
     * Payments
     * <p>
     * Details of the payments included with the contribution.
     * 
     */
    @JsonProperty("payments")
    public List<Payment> getPayments() {
        return payments;
    }

    /**
     * Payments
     * <p>
     * Details of the payments included with the contribution.
     * 
     */
    @JsonProperty("payments")
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Contributions withPayments(List<Payment> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    public Object getSpecifics() {
        return specifics;
    }

    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    public void setSpecifics(Object specifics) {
        this.specifics = specifics;
    }

    public Contributions withSpecifics(Object specifics) {
        this.specifics = specifics;
        return this;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution.
     * 
     */
    @JsonProperty("solicitors")
    public List<Solicitor> getSolicitors() {
        return solicitors;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution.
     * 
     */
    @JsonProperty("solicitors")
    public void setSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
    }

    public Contributions withSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the contribution.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the contribution.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Contributions withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contributions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("activityDates");
        sb.append('=');
        sb.append(((this.activityDates == null)?"<null>":this.activityDates));
        sb.append(',');
        sb.append("fiscalYear");
        sb.append('=');
        sb.append(((this.fiscalYear == null)?"<null>":this.fiscalYear));
        sb.append(',');
        sb.append("contributionNumber");
        sb.append('=');
        sb.append(((this.contributionNumber == null)?"<null>":this.contributionNumber));
        sb.append(',');
        sb.append("proposal");
        sb.append('=');
        sb.append(((this.proposal == null)?"<null>":this.proposal));
        sb.append(',');
        sb.append("amounts");
        sb.append('=');
        sb.append(((this.amounts == null)?"<null>":this.amounts));
        sb.append(',');
        sb.append("anonymity");
        sb.append('=');
        sb.append(((this.anonymity == null)?"<null>":this.anonymity));
        sb.append(',');
        sb.append("paymentFor");
        sb.append('=');
        sb.append(((this.paymentFor == null)?"<null>":this.paymentFor));
        sb.append(',');
        sb.append("allocations");
        sb.append('=');
        sb.append(((this.allocations == null)?"<null>":this.allocations));
        sb.append(',');
        sb.append("givingClassifications");
        sb.append('=');
        sb.append(((this.givingClassifications == null)?"<null>":this.givingClassifications));
        sb.append(',');
        sb.append("solicitationMethod");
        sb.append('=');
        sb.append(((this.solicitationMethod == null)?"<null>":this.solicitationMethod));
        sb.append(',');
        sb.append("communicationPlans");
        sb.append('=');
        sb.append(((this.communicationPlans == null)?"<null>":this.communicationPlans));
        sb.append(',');
        sb.append("specialHandlingInstructions");
        sb.append('=');
        sb.append(((this.specialHandlingInstructions == null)?"<null>":this.specialHandlingInstructions));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("premiumAssignments");
        sb.append('=');
        sb.append(((this.premiumAssignments == null)?"<null>":this.premiumAssignments));
        sb.append(',');
        sb.append("payments");
        sb.append('=');
        sb.append(((this.payments == null)?"<null>":this.payments));
        sb.append(',');
        sb.append("specifics");
        sb.append('=');
        sb.append(((this.specifics == null)?"<null>":this.specifics));
        sb.append(',');
        sb.append("solicitors");
        sb.append('=');
        sb.append(((this.solicitors == null)?"<null>":this.solicitors));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.paymentFor == null)? 0 :this.paymentFor.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.contributionNumber == null)? 0 :this.contributionNumber.hashCode()));
        result = ((result* 31)+((this.payments == null)? 0 :this.payments.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.activityDates == null)? 0 :this.activityDates.hashCode()));
        result = ((result* 31)+((this.specialHandlingInstructions == null)? 0 :this.specialHandlingInstructions.hashCode()));
        result = ((result* 31)+((this.communicationPlans == null)? 0 :this.communicationPlans.hashCode()));
        result = ((result* 31)+((this.premiumAssignments == null)? 0 :this.premiumAssignments.hashCode()));
        result = ((result* 31)+((this.amounts == null)? 0 :this.amounts.hashCode()));
        result = ((result* 31)+((this.allocations == null)? 0 :this.allocations.hashCode()));
        result = ((result* 31)+((this.solicitationMethod == null)? 0 :this.solicitationMethod.hashCode()));
        result = ((result* 31)+((this.givingClassifications == null)? 0 :this.givingClassifications.hashCode()));
        result = ((result* 31)+((this.anonymity == null)? 0 :this.anonymity.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.fiscalYear == null)? 0 :this.fiscalYear.hashCode()));
        result = ((result* 31)+((this.solicitors == null)? 0 :this.solicitors.hashCode()));
        result = ((result* 31)+((this.specifics == null)? 0 :this.specifics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contributions) == false) {
            return false;
        }
        Contributions rhs = ((Contributions) other);
        return (((((((((((((((((((((((this.proposal == rhs.proposal)||((this.proposal!= null)&&this.proposal.equals(rhs.proposal)))&&((this.paymentFor == rhs.paymentFor)||((this.paymentFor!= null)&&this.paymentFor.equals(rhs.paymentFor))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.contributionNumber == rhs.contributionNumber)||((this.contributionNumber!= null)&&this.contributionNumber.equals(rhs.contributionNumber))))&&((this.payments == rhs.payments)||((this.payments!= null)&&this.payments.equals(rhs.payments))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.activityDates == rhs.activityDates)||((this.activityDates!= null)&&this.activityDates.equals(rhs.activityDates))))&&((this.specialHandlingInstructions == rhs.specialHandlingInstructions)||((this.specialHandlingInstructions!= null)&&this.specialHandlingInstructions.equals(rhs.specialHandlingInstructions))))&&((this.communicationPlans == rhs.communicationPlans)||((this.communicationPlans!= null)&&this.communicationPlans.equals(rhs.communicationPlans))))&&((this.premiumAssignments == rhs.premiumAssignments)||((this.premiumAssignments!= null)&&this.premiumAssignments.equals(rhs.premiumAssignments))))&&((this.amounts == rhs.amounts)||((this.amounts!= null)&&this.amounts.equals(rhs.amounts))))&&((this.allocations == rhs.allocations)||((this.allocations!= null)&&this.allocations.equals(rhs.allocations))))&&((this.solicitationMethod == rhs.solicitationMethod)||((this.solicitationMethod!= null)&&this.solicitationMethod.equals(rhs.solicitationMethod))))&&((this.givingClassifications == rhs.givingClassifications)||((this.givingClassifications!= null)&&this.givingClassifications.equals(rhs.givingClassifications))))&&((this.anonymity == rhs.anonymity)||((this.anonymity!= null)&&this.anonymity.equals(rhs.anonymity))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.fiscalYear == rhs.fiscalYear)||((this.fiscalYear!= null)&&this.fiscalYear.equals(rhs.fiscalYear))))&&((this.solicitors == rhs.solicitors)||((this.solicitors!= null)&&this.solicitors.equals(rhs.solicitors))))&&((this.specifics == rhs.specifics)||((this.specifics!= null)&&this.specifics.equals(rhs.specifics))));
    }


    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        GIFT("gift"),
        PLEDGE("pledge"),
        PLEDGE_PAYMENT("pledgePayment"),
        RECURRING_CONTRIBUTION("recurringContribution"),
        MATCHING_GIFT("matchingGift"),
        BEQUEST_EXPECTANCY("bequestExpectancy"),
        BEQUEST_PAYMENT("bequestPayment"),
        MEMBERSHIP_DUES_PAYMENT("membershipDuesPayment");
        private final String value;
        private final static Map<String, Contributions.Type> CONSTANTS = new HashMap<String, Contributions.Type>();

        static {
            for (Contributions.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Contributions.Type fromValue(String value) {
            Contributions.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
