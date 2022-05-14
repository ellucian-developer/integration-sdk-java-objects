
package com.ellucian.generated.eedm.procurement_receipts.v13_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Procurement Receipts
 * <p>
 * Information about receipts of goods or services received against approved purchase orders.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "purchaseOrder",
    "packingSlipNumber",
    "lineItems",
    "shippingMethod",
    "receivedOn",
    "receivedBy",
    "comment"
})
@Generated("jsonschema2pojo")
public class ProcurementReceipts {

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
     * The global identifier of the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the procurement receipt.")
    private String id;
    /**
     * Purchase Order
     * <p>
     * The originating purchase order associated with the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("purchaseOrder")
    @JsonPropertyDescription("The originating purchase order associated with the procurement receipt.")
    private PurchaseOrder purchaseOrder;
    /**
     * Packing Slip Number
     * <p>
     * The packing slip number or receiving reference document number associated with the procurement receipt.
     * 
     */
    @JsonProperty("packingSlipNumber")
    @JsonPropertyDescription("The packing slip number or receiving reference document number associated with the procurement receipt.")
    private String packingSlipNumber;
    /**
     * Line Items
     * <p>
     * The individual line items associated with the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    @JsonPropertyDescription("The individual line items associated with the procurement receipt.")
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    /**
     * Shipping Method
     * <p>
     * The shipping method used for the received goods and services (e.g. ground, air, UPS, Purolator).
     * 
     */
    @JsonProperty("shippingMethod")
    @JsonPropertyDescription("The shipping method used for the received goods and services (e.g. ground, air, UPS, Purolator).")
    private Object shippingMethod;
    /**
     * Received On
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("receivedOn")
    @JsonPropertyDescription("The date on which the goods or services were received.")
    private Object receivedOn;
    /**
     * Received By
     * <p>
     * The person who received the goods or services.
     * (Required)
     * 
     */
    @JsonProperty("receivedBy")
    @JsonPropertyDescription("The person who received the goods or services.")
    private ReceivedBy receivedBy;
    /**
     * Comment
     * <p>
     * The comment associated with the procurement receipt.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the procurement receipt.")
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

    public ProcurementReceipts withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the procurement receipt.
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
     * The global identifier of the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ProcurementReceipts withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * The originating purchase order associated with the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("purchaseOrder")
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Purchase Order
     * <p>
     * The originating purchase order associated with the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("purchaseOrder")
    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public ProcurementReceipts withPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
        return this;
    }

    /**
     * Packing Slip Number
     * <p>
     * The packing slip number or receiving reference document number associated with the procurement receipt.
     * 
     */
    @JsonProperty("packingSlipNumber")
    public String getPackingSlipNumber() {
        return packingSlipNumber;
    }

    /**
     * Packing Slip Number
     * <p>
     * The packing slip number or receiving reference document number associated with the procurement receipt.
     * 
     */
    @JsonProperty("packingSlipNumber")
    public void setPackingSlipNumber(String packingSlipNumber) {
        this.packingSlipNumber = packingSlipNumber;
    }

    public ProcurementReceipts withPackingSlipNumber(String packingSlipNumber) {
        this.packingSlipNumber = packingSlipNumber;
        return this;
    }

    /**
     * Line Items
     * <p>
     * The individual line items associated with the procurement receipt.
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
     * The individual line items associated with the procurement receipt.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public ProcurementReceipts withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     * Shipping Method
     * <p>
     * The shipping method used for the received goods and services (e.g. ground, air, UPS, Purolator).
     * 
     */
    @JsonProperty("shippingMethod")
    public Object getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Shipping Method
     * <p>
     * The shipping method used for the received goods and services (e.g. ground, air, UPS, Purolator).
     * 
     */
    @JsonProperty("shippingMethod")
    public void setShippingMethod(Object shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public ProcurementReceipts withShippingMethod(Object shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     * Received On
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("receivedOn")
    public Object getReceivedOn() {
        return receivedOn;
    }

    /**
     * Received On
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("receivedOn")
    public void setReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
    }

    public ProcurementReceipts withReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
        return this;
    }

    /**
     * Received By
     * <p>
     * The person who received the goods or services.
     * (Required)
     * 
     */
    @JsonProperty("receivedBy")
    public ReceivedBy getReceivedBy() {
        return receivedBy;
    }

    /**
     * Received By
     * <p>
     * The person who received the goods or services.
     * (Required)
     * 
     */
    @JsonProperty("receivedBy")
    public void setReceivedBy(ReceivedBy receivedBy) {
        this.receivedBy = receivedBy;
    }

    public ProcurementReceipts withReceivedBy(ReceivedBy receivedBy) {
        this.receivedBy = receivedBy;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the procurement receipt.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the procurement receipt.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ProcurementReceipts withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcurementReceipts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("purchaseOrder");
        sb.append('=');
        sb.append(((this.purchaseOrder == null)?"<null>":this.purchaseOrder));
        sb.append(',');
        sb.append("packingSlipNumber");
        sb.append('=');
        sb.append(((this.packingSlipNumber == null)?"<null>":this.packingSlipNumber));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
        sb.append(',');
        sb.append("shippingMethod");
        sb.append('=');
        sb.append(((this.shippingMethod == null)?"<null>":this.shippingMethod));
        sb.append(',');
        sb.append("receivedOn");
        sb.append('=');
        sb.append(((this.receivedOn == null)?"<null>":this.receivedOn));
        sb.append(',');
        sb.append("receivedBy");
        sb.append('=');
        sb.append(((this.receivedBy == null)?"<null>":this.receivedBy));
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
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.receivedBy == null)? 0 :this.receivedBy.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.shippingMethod == null)? 0 :this.shippingMethod.hashCode()));
        result = ((result* 31)+((this.purchaseOrder == null)? 0 :this.purchaseOrder.hashCode()));
        result = ((result* 31)+((this.receivedOn == null)? 0 :this.receivedOn.hashCode()));
        result = ((result* 31)+((this.packingSlipNumber == null)? 0 :this.packingSlipNumber.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcurementReceipts) == false) {
            return false;
        }
        ProcurementReceipts rhs = ((ProcurementReceipts) other);
        return ((((((((((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems)))&&((this.receivedBy == rhs.receivedBy)||((this.receivedBy!= null)&&this.receivedBy.equals(rhs.receivedBy))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.shippingMethod == rhs.shippingMethod)||((this.shippingMethod!= null)&&this.shippingMethod.equals(rhs.shippingMethod))))&&((this.purchaseOrder == rhs.purchaseOrder)||((this.purchaseOrder!= null)&&this.purchaseOrder.equals(rhs.purchaseOrder))))&&((this.receivedOn == rhs.receivedOn)||((this.receivedOn!= null)&&this.receivedOn.equals(rhs.receivedOn))))&&((this.packingSlipNumber == rhs.packingSlipNumber)||((this.packingSlipNumber!= null)&&this.packingSlipNumber.equals(rhs.packingSlipNumber))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
