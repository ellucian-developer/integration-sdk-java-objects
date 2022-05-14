
package com.ellucian.generated.eedm.requisitions.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Requisitions
 * <p>
 * Requests to purchase goods or services that may reserve funds in financial ledgers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "requisitionNumber",
    "referenceNumber",
    "paymentSource",
    "requestedOn",
    "transactionDate",
    "status",
    "deliveredBy",
    "initiator",
    "buyer",
    "shipping",
    "overrideShippingDestination",
    "vendor",
    "paymentTerms",
    "submittedBy",
    "comments",
    "lineItems"
})
@Generated("jsonschema2pojo")
public class Requisitions {

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
     * The global identifier of the requisition.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the requisition.")
    private String id;
    /**
     * Requisition Number
     * <p>
     * The number associated with the requisition assigned by the finance system.
     * 
     */
    @JsonProperty("requisitionNumber")
    @JsonPropertyDescription("The number associated with the requisition assigned by the finance system.")
    private String requisitionNumber;
    /**
     * Reference Number
     * <p>
     * A reference number specified for the requisition by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("A reference number specified for the requisition by an external system.")
    private String referenceNumber;
    /**
     * Payment Source
     * <p>
     * The payment source associated with the requisition which is used while calculating taxes.
     * 
     */
    @JsonProperty("paymentSource")
    @JsonPropertyDescription("The payment source associated with the requisition which is used while calculating taxes.")
    private Object paymentSource;
    /**
     * Requested On
     * <p>
     * The date when the request was originated.
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    @JsonPropertyDescription("The date when the request was originated.")
    private String requestedOn;
    /**
     * Transaction Date
     * <p>
     * The transaction date for the requisition. This will be the date used when entering the transactions into the general ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    @JsonPropertyDescription("The transaction date for the requisition. This will be the date used when entering the transactions into the general ledger.")
    private String transactionDate;
    /**
     * Status
     * <p>
     * The status of the requisition.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the requisition.")
    private Object status;
    /**
     * Delivered By
     * <p>
     * The date by which the items are requested to be delivered.
     * 
     */
    @JsonProperty("deliveredBy")
    @JsonPropertyDescription("The date by which the items are requested to be delivered.")
    private Object deliveredBy;
    /**
     * Initiator
     * <p>
     * The initiator of the requisition.
     * (Required)
     * 
     */
    @JsonProperty("initiator")
    @JsonPropertyDescription("The initiator of the requisition.")
    private Initiator initiator;
    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the requisition.
     * 
     */
    @JsonProperty("buyer")
    @JsonPropertyDescription("The purchasing agent assigned to the requisition.")
    private Object buyer;
    /**
     * Shipping
     * <p>
     * The shipping information associated with the requisition.
     * 
     */
    @JsonProperty("shipping")
    @JsonPropertyDescription("The shipping information associated with the requisition.")
    private Shipping shipping;
    /**
     * Override Shipping Destination
     * <p>
     * Override of the shipping information specified in the ship to destination.
     * 
     */
    @JsonProperty("overrideShippingDestination")
    @JsonPropertyDescription("Override of the shipping information specified in the ship to destination.")
    private Object overrideShippingDestination;
    /**
     * Vendor
     * <p>
     * The vendor associated with the requisition.
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The vendor associated with the requisition.")
    private Vendor vendor;
    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to the requisition.
     * 
     */
    @JsonProperty("paymentTerms")
    @JsonPropertyDescription("The vendor payment terms and conditions that are applicable to the requisition.")
    private Object paymentTerms;
    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the requisition.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person who made the submit request for the requisition.")
    private Object submittedBy;
    /**
     * Comments
     * <p>
     * The comments associated with the requisition.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the requisition.")
    private List<Comment> comments = new ArrayList<Comment>();
    /**
     * Line Items
     * <p>
     * The individual line items associated with the requisition.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    @JsonPropertyDescription("The individual line items associated with the requisition.")
    private List<LineItem> lineItems = new ArrayList<LineItem>();

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

    public Requisitions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the requisition.
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
     * The global identifier of the requisition.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Requisitions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * The number associated with the requisition assigned by the finance system.
     * 
     */
    @JsonProperty("requisitionNumber")
    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    /**
     * Requisition Number
     * <p>
     * The number associated with the requisition assigned by the finance system.
     * 
     */
    @JsonProperty("requisitionNumber")
    public void setRequisitionNumber(String requisitionNumber) {
        this.requisitionNumber = requisitionNumber;
    }

    public Requisitions withRequisitionNumber(String requisitionNumber) {
        this.requisitionNumber = requisitionNumber;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * A reference number specified for the requisition by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * A reference number specified for the requisition by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Requisitions withReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Payment Source
     * <p>
     * The payment source associated with the requisition which is used while calculating taxes.
     * 
     */
    @JsonProperty("paymentSource")
    public Object getPaymentSource() {
        return paymentSource;
    }

    /**
     * Payment Source
     * <p>
     * The payment source associated with the requisition which is used while calculating taxes.
     * 
     */
    @JsonProperty("paymentSource")
    public void setPaymentSource(Object paymentSource) {
        this.paymentSource = paymentSource;
    }

    public Requisitions withPaymentSource(Object paymentSource) {
        this.paymentSource = paymentSource;
        return this;
    }

    /**
     * Requested On
     * <p>
     * The date when the request was originated.
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    public String getRequestedOn() {
        return requestedOn;
    }

    /**
     * Requested On
     * <p>
     * The date when the request was originated.
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    public void setRequestedOn(String requestedOn) {
        this.requestedOn = requestedOn;
    }

    public Requisitions withRequestedOn(String requestedOn) {
        this.requestedOn = requestedOn;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * The transaction date for the requisition. This will be the date used when entering the transactions into the general ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Transaction Date
     * <p>
     * The transaction date for the requisition. This will be the date used when entering the transactions into the general ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Requisitions withTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the requisition.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the requisition.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Requisitions withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Delivered By
     * <p>
     * The date by which the items are requested to be delivered.
     * 
     */
    @JsonProperty("deliveredBy")
    public Object getDeliveredBy() {
        return deliveredBy;
    }

    /**
     * Delivered By
     * <p>
     * The date by which the items are requested to be delivered.
     * 
     */
    @JsonProperty("deliveredBy")
    public void setDeliveredBy(Object deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public Requisitions withDeliveredBy(Object deliveredBy) {
        this.deliveredBy = deliveredBy;
        return this;
    }

    /**
     * Initiator
     * <p>
     * The initiator of the requisition.
     * (Required)
     * 
     */
    @JsonProperty("initiator")
    public Initiator getInitiator() {
        return initiator;
    }

    /**
     * Initiator
     * <p>
     * The initiator of the requisition.
     * (Required)
     * 
     */
    @JsonProperty("initiator")
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    public Requisitions withInitiator(Initiator initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the requisition.
     * 
     */
    @JsonProperty("buyer")
    public Object getBuyer() {
        return buyer;
    }

    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the requisition.
     * 
     */
    @JsonProperty("buyer")
    public void setBuyer(Object buyer) {
        this.buyer = buyer;
    }

    public Requisitions withBuyer(Object buyer) {
        this.buyer = buyer;
        return this;
    }

    /**
     * Shipping
     * <p>
     * The shipping information associated with the requisition.
     * 
     */
    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Shipping
     * <p>
     * The shipping information associated with the requisition.
     * 
     */
    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Requisitions withShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Override Shipping Destination
     * <p>
     * Override of the shipping information specified in the ship to destination.
     * 
     */
    @JsonProperty("overrideShippingDestination")
    public Object getOverrideShippingDestination() {
        return overrideShippingDestination;
    }

    /**
     * Override Shipping Destination
     * <p>
     * Override of the shipping information specified in the ship to destination.
     * 
     */
    @JsonProperty("overrideShippingDestination")
    public void setOverrideShippingDestination(Object overrideShippingDestination) {
        this.overrideShippingDestination = overrideShippingDestination;
    }

    public Requisitions withOverrideShippingDestination(Object overrideShippingDestination) {
        this.overrideShippingDestination = overrideShippingDestination;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the requisition.
     * 
     */
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the requisition.
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Requisitions withVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to the requisition.
     * 
     */
    @JsonProperty("paymentTerms")
    public Object getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to the requisition.
     * 
     */
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Requisitions withPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the requisition.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the requisition.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Requisitions withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the requisition.
     * 
     */
    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the requisition.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Requisitions withComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Line Items
     * <p>
     * The individual line items associated with the requisition.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Line Items
     * <p>
     * The individual line items associated with the requisition.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Requisitions withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Requisitions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requisitionNumber");
        sb.append('=');
        sb.append(((this.requisitionNumber == null)?"<null>":this.requisitionNumber));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("paymentSource");
        sb.append('=');
        sb.append(((this.paymentSource == null)?"<null>":this.paymentSource));
        sb.append(',');
        sb.append("requestedOn");
        sb.append('=');
        sb.append(((this.requestedOn == null)?"<null>":this.requestedOn));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("deliveredBy");
        sb.append('=');
        sb.append(((this.deliveredBy == null)?"<null>":this.deliveredBy));
        sb.append(',');
        sb.append("initiator");
        sb.append('=');
        sb.append(((this.initiator == null)?"<null>":this.initiator));
        sb.append(',');
        sb.append("buyer");
        sb.append('=');
        sb.append(((this.buyer == null)?"<null>":this.buyer));
        sb.append(',');
        sb.append("shipping");
        sb.append('=');
        sb.append(((this.shipping == null)?"<null>":this.shipping));
        sb.append(',');
        sb.append("overrideShippingDestination");
        sb.append('=');
        sb.append(((this.overrideShippingDestination == null)?"<null>":this.overrideShippingDestination));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.requisitionNumber == null)? 0 :this.requisitionNumber.hashCode()));
        result = ((result* 31)+((this.deliveredBy == null)? 0 :this.deliveredBy.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.initiator == null)? 0 :this.initiator.hashCode()));
        result = ((result* 31)+((this.paymentSource == null)? 0 :this.paymentSource.hashCode()));
        result = ((result* 31)+((this.transactionDate == null)? 0 :this.transactionDate.hashCode()));
        result = ((result* 31)+((this.buyer == null)? 0 :this.buyer.hashCode()));
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.overrideShippingDestination == null)? 0 :this.overrideShippingDestination.hashCode()));
        result = ((result* 31)+((this.shipping == null)? 0 :this.shipping.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.requestedOn == null)? 0 :this.requestedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Requisitions) == false) {
            return false;
        }
        Requisitions rhs = ((Requisitions) other);
        return (((((((((((((((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.requisitionNumber == rhs.requisitionNumber)||((this.requisitionNumber!= null)&&this.requisitionNumber.equals(rhs.requisitionNumber))))&&((this.deliveredBy == rhs.deliveredBy)||((this.deliveredBy!= null)&&this.deliveredBy.equals(rhs.deliveredBy))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.initiator == rhs.initiator)||((this.initiator!= null)&&this.initiator.equals(rhs.initiator))))&&((this.paymentSource == rhs.paymentSource)||((this.paymentSource!= null)&&this.paymentSource.equals(rhs.paymentSource))))&&((this.transactionDate == rhs.transactionDate)||((this.transactionDate!= null)&&this.transactionDate.equals(rhs.transactionDate))))&&((this.buyer == rhs.buyer)||((this.buyer!= null)&&this.buyer.equals(rhs.buyer))))&&((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems))))&&((this.overrideShippingDestination == rhs.overrideShippingDestination)||((this.overrideShippingDestination!= null)&&this.overrideShippingDestination.equals(rhs.overrideShippingDestination))))&&((this.shipping == rhs.shipping)||((this.shipping!= null)&&this.shipping.equals(rhs.shipping))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.requestedOn == rhs.requestedOn)||((this.requestedOn!= null)&&this.requestedOn.equals(rhs.requestedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
