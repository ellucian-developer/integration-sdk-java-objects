
package com.ellucian.generated.eedm.purchasing_arrangements.v13_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Purchasing Arrangements
 * <p>
 * Agreements established with vendors for the purchasing of commodities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "arrangementNumber",
    "referenceNumber",
    "vendor",
    "startOn",
    "endOn",
    "status",
    "buyer",
    "paymentTerms",
    "additionalAmount",
    "taxes",
    "classification",
    "comments",
    "fulfillment",
    "shipTo",
    "freeOnBoard",
    "lineItems"
})
@Generated("jsonschema2pojo")
public class PurchasingArrangements {

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
     * The global identifier of the purchasing arrangement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the purchasing arrangement.")
    private String id;
    /**
     * Arrangement Number
     * <p>
     * The number associated with the purchasing arrangement assigned by the finance system.
     * 
     */
    @JsonProperty("arrangementNumber")
    @JsonPropertyDescription("The number associated with the purchasing arrangement assigned by the finance system.")
    private String arrangementNumber;
    /**
     * Reference Number
     * <p>
     * A reference number specified for the purchasing arrangement by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("A reference number specified for the purchasing arrangement by an external system.")
    private String referenceNumber;
    /**
     * Vendor
     * <p>
     * The vendor associated with the purchasing arrangement.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The vendor associated with the purchasing arrangement.")
    private Vendor vendor;
    /**
     * Start On
     * <p>
     * The first date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when the arrangement is available.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The last date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the arrangement is available.")
    private Date endOn;
    /**
     * Status
     * <p>
     * The status of the arrangement.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the arrangement.")
    private Object status;
    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the arrangement.
     * 
     */
    @JsonProperty("buyer")
    @JsonPropertyDescription("The purchasing agent assigned to the arrangement.")
    private Object buyer;
    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions applicable to the arrangement.
     * 
     */
    @JsonProperty("paymentTerms")
    @JsonPropertyDescription("The payment terms and conditions applicable to the arrangement.")
    private Object paymentTerms;
    /**
     * Additional Amount
     * <p>
     * Additional charges or discounts such as freight, etc.
     * 
     */
    @JsonProperty("additionalAmount")
    @JsonPropertyDescription("Additional charges or discounts such as freight, etc.")
    private Object additionalAmount;
    /**
     * Taxes
     * <p>
     * The tax codes applicable to the arrangement.
     * 
     */
    @JsonProperty("taxes")
    @JsonPropertyDescription("The tax codes applicable to the arrangement.")
    private List<Tax> taxes = new ArrayList<Tax>();
    /**
     * Classification
     * <p>
     * A user defined classification of the arrangement.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("A user defined classification of the arrangement.")
    private Object classification;
    /**
     * Comments
     * <p>
     * The comments associated with the arrangement.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the arrangement.")
    private List<Comment> comments = new ArrayList<Comment>();
    /**
     * Fulfillment
     * <p>
     * An indication if the merchandise will be supplied from inventory or will need to be purchased.
     * 
     */
    @JsonProperty("fulfillment")
    @JsonPropertyDescription("An indication if the merchandise will be supplied from inventory or will need to be purchased.")
    private Object fulfillment;
    /**
     * Ship To
     * <p>
     * The destination for the purchased item(s).
     * 
     */
    @JsonProperty("shipTo")
    @JsonPropertyDescription("The destination for the purchased item(s).")
    private Object shipTo;
    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the arrangement.
     * 
     */
    @JsonProperty("freeOnBoard")
    @JsonPropertyDescription("The free on board (FOB) type specified for the arrangement.")
    private Object freeOnBoard;
    /**
     * Line Items
     * <p>
     * The line items associated with purchasing arrangements.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    @JsonPropertyDescription("The line items associated with purchasing arrangements.")
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

    public PurchasingArrangements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the purchasing arrangement.
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
     * The global identifier of the purchasing arrangement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PurchasingArrangements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Arrangement Number
     * <p>
     * The number associated with the purchasing arrangement assigned by the finance system.
     * 
     */
    @JsonProperty("arrangementNumber")
    public String getArrangementNumber() {
        return arrangementNumber;
    }

    /**
     * Arrangement Number
     * <p>
     * The number associated with the purchasing arrangement assigned by the finance system.
     * 
     */
    @JsonProperty("arrangementNumber")
    public void setArrangementNumber(String arrangementNumber) {
        this.arrangementNumber = arrangementNumber;
    }

    public PurchasingArrangements withArrangementNumber(String arrangementNumber) {
        this.arrangementNumber = arrangementNumber;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * A reference number specified for the purchasing arrangement by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * A reference number specified for the purchasing arrangement by an external system.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PurchasingArrangements withReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the purchasing arrangement.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the purchasing arrangement.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public PurchasingArrangements withVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public PurchasingArrangements withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public Date getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the arrangement is available.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Date endOn) {
        this.endOn = endOn;
    }

    public PurchasingArrangements withEndOn(Date endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the arrangement.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the arrangement.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public PurchasingArrangements withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the arrangement.
     * 
     */
    @JsonProperty("buyer")
    public Object getBuyer() {
        return buyer;
    }

    /**
     * Buyer
     * <p>
     * The purchasing agent assigned to the arrangement.
     * 
     */
    @JsonProperty("buyer")
    public void setBuyer(Object buyer) {
        this.buyer = buyer;
    }

    public PurchasingArrangements withBuyer(Object buyer) {
        this.buyer = buyer;
        return this;
    }

    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions applicable to the arrangement.
     * 
     */
    @JsonProperty("paymentTerms")
    public Object getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions applicable to the arrangement.
     * 
     */
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public PurchasingArrangements withPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges or discounts such as freight, etc.
     * 
     */
    @JsonProperty("additionalAmount")
    public Object getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges or discounts such as freight, etc.
     * 
     */
    @JsonProperty("additionalAmount")
    public void setAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public PurchasingArrangements withAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
        return this;
    }

    /**
     * Taxes
     * <p>
     * The tax codes applicable to the arrangement.
     * 
     */
    @JsonProperty("taxes")
    public List<Tax> getTaxes() {
        return taxes;
    }

    /**
     * Taxes
     * <p>
     * The tax codes applicable to the arrangement.
     * 
     */
    @JsonProperty("taxes")
    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public PurchasingArrangements withTaxes(List<Tax> taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Classification
     * <p>
     * A user defined classification of the arrangement.
     * 
     */
    @JsonProperty("classification")
    public Object getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * A user defined classification of the arrangement.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Object classification) {
        this.classification = classification;
    }

    public PurchasingArrangements withClassification(Object classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the arrangement.
     * 
     */
    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the arrangement.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public PurchasingArrangements withComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Fulfillment
     * <p>
     * An indication if the merchandise will be supplied from inventory or will need to be purchased.
     * 
     */
    @JsonProperty("fulfillment")
    public Object getFulfillment() {
        return fulfillment;
    }

    /**
     * Fulfillment
     * <p>
     * An indication if the merchandise will be supplied from inventory or will need to be purchased.
     * 
     */
    @JsonProperty("fulfillment")
    public void setFulfillment(Object fulfillment) {
        this.fulfillment = fulfillment;
    }

    public PurchasingArrangements withFulfillment(Object fulfillment) {
        this.fulfillment = fulfillment;
        return this;
    }

    /**
     * Ship To
     * <p>
     * The destination for the purchased item(s).
     * 
     */
    @JsonProperty("shipTo")
    public Object getShipTo() {
        return shipTo;
    }

    /**
     * Ship To
     * <p>
     * The destination for the purchased item(s).
     * 
     */
    @JsonProperty("shipTo")
    public void setShipTo(Object shipTo) {
        this.shipTo = shipTo;
    }

    public PurchasingArrangements withShipTo(Object shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the arrangement.
     * 
     */
    @JsonProperty("freeOnBoard")
    public Object getFreeOnBoard() {
        return freeOnBoard;
    }

    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the arrangement.
     * 
     */
    @JsonProperty("freeOnBoard")
    public void setFreeOnBoard(Object freeOnBoard) {
        this.freeOnBoard = freeOnBoard;
    }

    public PurchasingArrangements withFreeOnBoard(Object freeOnBoard) {
        this.freeOnBoard = freeOnBoard;
        return this;
    }

    /**
     * Line Items
     * <p>
     * The line items associated with purchasing arrangements.
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
     * The line items associated with purchasing arrangements.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public PurchasingArrangements withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchasingArrangements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("arrangementNumber");
        sb.append('=');
        sb.append(((this.arrangementNumber == null)?"<null>":this.arrangementNumber));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("buyer");
        sb.append('=');
        sb.append(((this.buyer == null)?"<null>":this.buyer));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("additionalAmount");
        sb.append('=');
        sb.append(((this.additionalAmount == null)?"<null>":this.additionalAmount));
        sb.append(',');
        sb.append("taxes");
        sb.append('=');
        sb.append(((this.taxes == null)?"<null>":this.taxes));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("fulfillment");
        sb.append('=');
        sb.append(((this.fulfillment == null)?"<null>":this.fulfillment));
        sb.append(',');
        sb.append("shipTo");
        sb.append('=');
        sb.append(((this.shipTo == null)?"<null>":this.shipTo));
        sb.append(',');
        sb.append("freeOnBoard");
        sb.append('=');
        sb.append(((this.freeOnBoard == null)?"<null>":this.freeOnBoard));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.taxes == null)? 0 :this.taxes.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.buyer == null)? 0 :this.buyer.hashCode()));
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.freeOnBoard == null)? 0 :this.freeOnBoard.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.arrangementNumber == null)? 0 :this.arrangementNumber.hashCode()));
        result = ((result* 31)+((this.fulfillment == null)? 0 :this.fulfillment.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.shipTo == null)? 0 :this.shipTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchasingArrangements) == false) {
            return false;
        }
        PurchasingArrangements rhs = ((PurchasingArrangements) other);
        return (((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.taxes == rhs.taxes)||((this.taxes!= null)&&this.taxes.equals(rhs.taxes))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.buyer == rhs.buyer)||((this.buyer!= null)&&this.buyer.equals(rhs.buyer))))&&((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.freeOnBoard == rhs.freeOnBoard)||((this.freeOnBoard!= null)&&this.freeOnBoard.equals(rhs.freeOnBoard))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.arrangementNumber == rhs.arrangementNumber)||((this.arrangementNumber!= null)&&this.arrangementNumber.equals(rhs.arrangementNumber))))&&((this.fulfillment == rhs.fulfillment)||((this.fulfillment!= null)&&this.fulfillment.equals(rhs.fulfillment))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.shipTo == rhs.shipTo)||((this.shipTo!= null)&&this.shipTo.equals(rhs.shipTo))));
    }

}
