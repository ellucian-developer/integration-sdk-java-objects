
package com.ellucian.generated.eedm.external_contributions.v11_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * External Contributions
 * <p>
 * Contributions made through a third party system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "contributionType",
    "amount",
    "contributedOn",
    "paymentFor",
    "allocations",
    "contributionRecurrence",
    "preauthorization",
    "payment",
    "commemoration",
    "comment",
    "source"
})
@Generated("jsonschema2pojo")
public class ExternalContributions {

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
     * The global identifier of the External Contribution.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the External Contribution.")
    private String id;
    /**
     * Contribution Type
     * <p>
     * The type of contribution (donation, pledge, pledge payment, or recurring donation).
     * (Required)
     * 
     */
    @JsonProperty("contributionType")
    @JsonPropertyDescription("The type of contribution (donation, pledge, pledge payment, or recurring donation).")
    private ExternalContributions.ContributionType contributionType;
    /**
     * Amount
     * <p>
     * The amount of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the contribution.")
    private Amount amount;
    /**
     * Contributed On
     * <p>
     * The date of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributedOn")
    @JsonPropertyDescription("The date of the contribution.")
    private Date contributedOn;
    /**
     * Payment For
     * <p>
     * The contribution for which this contribution is a payment.
     * 
     */
    @JsonProperty("paymentFor")
    @JsonPropertyDescription("The contribution for which this contribution is a payment.")
    private Object paymentFor;
    /**
     * Allocations
     * <p>
     * The allocation of the contribution to donors, designations, appeals and campaigns.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    @JsonPropertyDescription("The allocation of the contribution to donors, designations, appeals and campaigns.")
    private List<Allocation> allocations = new ArrayList<Allocation>();
    /**
     * Contribution Recurrence
     * <p>
     * The starting date, frequency and amount for a recurring contribution.
     * 
     */
    @JsonProperty("contributionRecurrence")
    @JsonPropertyDescription("The starting date, frequency and amount for a recurring contribution.")
    private Object contributionRecurrence;
    /**
     * Preauthorization
     * <p>
     * The payment preauthorization associated with the contribution.
     * 
     */
    @JsonProperty("preauthorization")
    @JsonPropertyDescription("The payment preauthorization associated with the contribution.")
    private Object preauthorization;
    /**
     * Payment
     * <p>
     * The payment attached to the contribution.
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("The payment attached to the contribution.")
    private Object payment;
    /**
     * Commemoration
     * <p>
     * The type and target of the contribution's commemoration.
     * 
     */
    @JsonProperty("commemoration")
    @JsonPropertyDescription("The type and target of the contribution's commemoration.")
    private Object commemoration;
    /**
     * Comment
     * <p>
     * The comments on the contribution.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comments on the contribution.")
    private String comment;
    /**
     * Source
     * <p>
     * The source of the contribution.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the contribution.")
    private Object source;

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

    public ExternalContributions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the External Contribution.
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
     * The global identifier of the External Contribution.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ExternalContributions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Contribution Type
     * <p>
     * The type of contribution (donation, pledge, pledge payment, or recurring donation).
     * (Required)
     * 
     */
    @JsonProperty("contributionType")
    public ExternalContributions.ContributionType getContributionType() {
        return contributionType;
    }

    /**
     * Contribution Type
     * <p>
     * The type of contribution (donation, pledge, pledge payment, or recurring donation).
     * (Required)
     * 
     */
    @JsonProperty("contributionType")
    public void setContributionType(ExternalContributions.ContributionType contributionType) {
        this.contributionType = contributionType;
    }

    public ExternalContributions withContributionType(ExternalContributions.ContributionType contributionType) {
        this.contributionType = contributionType;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of the contribution.
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
     * The amount of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public ExternalContributions withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Contributed On
     * <p>
     * The date of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributedOn")
    public Date getContributedOn() {
        return contributedOn;
    }

    /**
     * Contributed On
     * <p>
     * The date of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("contributedOn")
    public void setContributedOn(Date contributedOn) {
        this.contributedOn = contributedOn;
    }

    public ExternalContributions withContributedOn(Date contributedOn) {
        this.contributedOn = contributedOn;
        return this;
    }

    /**
     * Payment For
     * <p>
     * The contribution for which this contribution is a payment.
     * 
     */
    @JsonProperty("paymentFor")
    public Object getPaymentFor() {
        return paymentFor;
    }

    /**
     * Payment For
     * <p>
     * The contribution for which this contribution is a payment.
     * 
     */
    @JsonProperty("paymentFor")
    public void setPaymentFor(Object paymentFor) {
        this.paymentFor = paymentFor;
    }

    public ExternalContributions withPaymentFor(Object paymentFor) {
        this.paymentFor = paymentFor;
        return this;
    }

    /**
     * Allocations
     * <p>
     * The allocation of the contribution to donors, designations, appeals and campaigns.
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
     * The allocation of the contribution to donors, designations, appeals and campaigns.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
    }

    public ExternalContributions withAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
        return this;
    }

    /**
     * Contribution Recurrence
     * <p>
     * The starting date, frequency and amount for a recurring contribution.
     * 
     */
    @JsonProperty("contributionRecurrence")
    public Object getContributionRecurrence() {
        return contributionRecurrence;
    }

    /**
     * Contribution Recurrence
     * <p>
     * The starting date, frequency and amount for a recurring contribution.
     * 
     */
    @JsonProperty("contributionRecurrence")
    public void setContributionRecurrence(Object contributionRecurrence) {
        this.contributionRecurrence = contributionRecurrence;
    }

    public ExternalContributions withContributionRecurrence(Object contributionRecurrence) {
        this.contributionRecurrence = contributionRecurrence;
        return this;
    }

    /**
     * Preauthorization
     * <p>
     * The payment preauthorization associated with the contribution.
     * 
     */
    @JsonProperty("preauthorization")
    public Object getPreauthorization() {
        return preauthorization;
    }

    /**
     * Preauthorization
     * <p>
     * The payment preauthorization associated with the contribution.
     * 
     */
    @JsonProperty("preauthorization")
    public void setPreauthorization(Object preauthorization) {
        this.preauthorization = preauthorization;
    }

    public ExternalContributions withPreauthorization(Object preauthorization) {
        this.preauthorization = preauthorization;
        return this;
    }

    /**
     * Payment
     * <p>
     * The payment attached to the contribution.
     * 
     */
    @JsonProperty("payment")
    public Object getPayment() {
        return payment;
    }

    /**
     * Payment
     * <p>
     * The payment attached to the contribution.
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Object payment) {
        this.payment = payment;
    }

    public ExternalContributions withPayment(Object payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Commemoration
     * <p>
     * The type and target of the contribution's commemoration.
     * 
     */
    @JsonProperty("commemoration")
    public Object getCommemoration() {
        return commemoration;
    }

    /**
     * Commemoration
     * <p>
     * The type and target of the contribution's commemoration.
     * 
     */
    @JsonProperty("commemoration")
    public void setCommemoration(Object commemoration) {
        this.commemoration = commemoration;
    }

    public ExternalContributions withCommemoration(Object commemoration) {
        this.commemoration = commemoration;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comments on the contribution.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comments on the contribution.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ExternalContributions withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the contribution.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the contribution.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ExternalContributions withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalContributions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contributionType");
        sb.append('=');
        sb.append(((this.contributionType == null)?"<null>":this.contributionType));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("contributedOn");
        sb.append('=');
        sb.append(((this.contributedOn == null)?"<null>":this.contributedOn));
        sb.append(',');
        sb.append("paymentFor");
        sb.append('=');
        sb.append(((this.paymentFor == null)?"<null>":this.paymentFor));
        sb.append(',');
        sb.append("allocations");
        sb.append('=');
        sb.append(((this.allocations == null)?"<null>":this.allocations));
        sb.append(',');
        sb.append("contributionRecurrence");
        sb.append('=');
        sb.append(((this.contributionRecurrence == null)?"<null>":this.contributionRecurrence));
        sb.append(',');
        sb.append("preauthorization");
        sb.append('=');
        sb.append(((this.preauthorization == null)?"<null>":this.preauthorization));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("commemoration");
        sb.append('=');
        sb.append(((this.commemoration == null)?"<null>":this.commemoration));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.paymentFor == null)? 0 :this.paymentFor.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.contributionRecurrence == null)? 0 :this.contributionRecurrence.hashCode()));
        result = ((result* 31)+((this.preauthorization == null)? 0 :this.preauthorization.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.contributionType == null)? 0 :this.contributionType.hashCode()));
        result = ((result* 31)+((this.allocations == null)? 0 :this.allocations.hashCode()));
        result = ((result* 31)+((this.contributedOn == null)? 0 :this.contributedOn.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.commemoration == null)? 0 :this.commemoration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalContributions) == false) {
            return false;
        }
        ExternalContributions rhs = ((ExternalContributions) other);
        return ((((((((((((((this.paymentFor == rhs.paymentFor)||((this.paymentFor!= null)&&this.paymentFor.equals(rhs.paymentFor)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.contributionRecurrence == rhs.contributionRecurrence)||((this.contributionRecurrence!= null)&&this.contributionRecurrence.equals(rhs.contributionRecurrence))))&&((this.preauthorization == rhs.preauthorization)||((this.preauthorization!= null)&&this.preauthorization.equals(rhs.preauthorization))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.contributionType == rhs.contributionType)||((this.contributionType!= null)&&this.contributionType.equals(rhs.contributionType))))&&((this.allocations == rhs.allocations)||((this.allocations!= null)&&this.allocations.equals(rhs.allocations))))&&((this.contributedOn == rhs.contributedOn)||((this.contributedOn!= null)&&this.contributedOn.equals(rhs.contributedOn))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.commemoration == rhs.commemoration)||((this.commemoration!= null)&&this.commemoration.equals(rhs.commemoration))));
    }


    /**
     * Contribution Type
     * <p>
     * The type of contribution (donation, pledge, pledge payment, or recurring donation).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ContributionType {

        DONATION("donation"),
        PLEDGE("pledge"),
        PLEDGE_PAYMENT("pledgePayment"),
        RECURRING_DONATION("recurringDonation");
        private final String value;
        private final static Map<String, ExternalContributions.ContributionType> CONSTANTS = new HashMap<String, ExternalContributions.ContributionType>();

        static {
            for (ExternalContributions.ContributionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ContributionType(String value) {
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
        public static ExternalContributions.ContributionType fromValue(String value) {
            ExternalContributions.ContributionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
