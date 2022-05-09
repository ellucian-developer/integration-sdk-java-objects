
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_1_0;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "referenceDocument",
    "referenceDocumentLineItemNumber",
    "lineItemNumber",
    "description",
    "commodityCode",
    "quantity",
    "vendorBilledQuantity",
    "unitOfMeasure",
    "unitPrice",
    "vendorBilledUnitPrice",
    "additionalAmount",
    "taxes",
    "discount",
    "paymentStatus",
    "encumbranceStatus",
    "comment",
    "status",
    "accountDetails"
})
@Generated("jsonschema2pojo")
public class LineItem {

    /**
     * Reference Document
     * <p>
     * The originating document associated with the line item, which indicates what encumbrance needs to be relieved.
     * 
     */
    @JsonProperty("referenceDocument")
    @JsonPropertyDescription("The originating document associated with the line item, which indicates what encumbrance needs to be relieved.")
    private Object referenceDocument;
    /**
     * Reference Document Line Item Number
     * <p>
     * The reference document line item number associated with the invoice.
     * 
     */
    @JsonProperty("referenceDocumentLineItemNumber")
    @JsonPropertyDescription("The reference document line item number associated with the invoice.")
    private String referenceDocumentLineItemNumber;
    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("A system generated number to identify the line item.")
    private String lineItemNumber;
    /**
     * Description
     * <p>
     * The description of the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the line item.")
    private String description;
    /**
     * Commodity Code
     * <p>
     * The commodity specified by the line item.
     * 
     */
    @JsonProperty("commodityCode")
    @JsonPropertyDescription("The commodity specified by the line item.")
    private Object commodityCode;
    /**
     * Quantity
     * <p>
     * The number of units specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The number of units specified for the line item.")
    private Double quantity;
    /**
     * Vendor Billed Quantity
     * <p>
     * The number of units for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledQuantity")
    @JsonPropertyDescription("The number of units for the line item as specified by the vendor.")
    private Object vendorBilledQuantity;
    /**
     * Unit of Measure
     * <p>
     * The unit of measure used for the line item.
     * 
     */
    @JsonProperty("unitOfMeasure")
    @JsonPropertyDescription("The unit of measure used for the line item.")
    private Object unitOfMeasure;
    /**
     * Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("The price per unit for the commodity specified for the line item.")
    private UnitPrice unitPrice;
    /**
     * Vendor Billed Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledUnitPrice")
    @JsonPropertyDescription("The price per unit for the commodity specified for the line item as specified by the vendor.")
    private Object vendorBilledUnitPrice;
    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight)
     * 
     */
    @JsonProperty("additionalAmount")
    @JsonPropertyDescription("Additional charges/discounts applied to the line item (e.g. freight)")
    private Object additionalAmount;
    /**
     * Taxes
     * <p>
     * The taxes that are applicable to the line item if different from the invoice.
     * 
     */
    @JsonProperty("taxes")
    @JsonPropertyDescription("The taxes that are applicable to the line item if different from the invoice.")
    private List<Tax__1> taxes = new ArrayList<Tax__1>();
    /**
     * Discount
     * <p>
     * The discount applied to the line item (e.g. trade/volume discounts).
     * 
     */
    @JsonProperty("discount")
    @JsonPropertyDescription("The discount applied to the line item (e.g. trade/volume discounts).")
    private Discount discount;
    /**
     * Payment Status
     * <p>
     * An indication if payment for the the line item is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    @JsonPropertyDescription("An indication if payment for the the line item is on hold.")
    private LineItem.PaymentStatus paymentStatus;
    /**
     * Encumbrance Status
     * <p>
     * An indicator specifying if the encumbrance for the line item should be liquidated in full (final payment).
     * 
     */
    @JsonProperty("encumbranceStatus")
    @JsonPropertyDescription("An indicator specifying if the encumbrance for the line item should be liquidated in full (final payment).")
    private Object encumbranceStatus;
    /**
     * Comment
     * <p>
     * Additional comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Additional comment associated with the line item.")
    private String comment;
    /**
     * Status
     * <p>
     * The status of the line item (open, closed).
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the line item (open, closed).")
    private LineItem.Status status;
    /**
     * Account Details
     * <p>
     * The detail account information for the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    @JsonPropertyDescription("The detail account information for the line item.")
    private List<AccountDetail> accountDetails = new ArrayList<AccountDetail>();

    /**
     * Reference Document
     * <p>
     * The originating document associated with the line item, which indicates what encumbrance needs to be relieved.
     * 
     */
    @JsonProperty("referenceDocument")
    public Object getReferenceDocument() {
        return referenceDocument;
    }

    /**
     * Reference Document
     * <p>
     * The originating document associated with the line item, which indicates what encumbrance needs to be relieved.
     * 
     */
    @JsonProperty("referenceDocument")
    public void setReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    public LineItem withReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
        return this;
    }

    /**
     * Reference Document Line Item Number
     * <p>
     * The reference document line item number associated with the invoice.
     * 
     */
    @JsonProperty("referenceDocumentLineItemNumber")
    public String getReferenceDocumentLineItemNumber() {
        return referenceDocumentLineItemNumber;
    }

    /**
     * Reference Document Line Item Number
     * <p>
     * The reference document line item number associated with the invoice.
     * 
     */
    @JsonProperty("referenceDocumentLineItemNumber")
    public void setReferenceDocumentLineItemNumber(String referenceDocumentLineItemNumber) {
        this.referenceDocumentLineItemNumber = referenceDocumentLineItemNumber;
    }

    public LineItem withReferenceDocumentLineItemNumber(String referenceDocumentLineItemNumber) {
        this.referenceDocumentLineItemNumber = referenceDocumentLineItemNumber;
        return this;
    }

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item.
     * 
     */
    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item.
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public LineItem withLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public LineItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity specified by the line item.
     * 
     */
    @JsonProperty("commodityCode")
    public Object getCommodityCode() {
        return commodityCode;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity specified by the line item.
     * 
     */
    @JsonProperty("commodityCode")
    public void setCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
    }

    public LineItem withCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The number of units specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The number of units specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public LineItem withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Vendor Billed Quantity
     * <p>
     * The number of units for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledQuantity")
    public Object getVendorBilledQuantity() {
        return vendorBilledQuantity;
    }

    /**
     * Vendor Billed Quantity
     * <p>
     * The number of units for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledQuantity")
    public void setVendorBilledQuantity(Object vendorBilledQuantity) {
        this.vendorBilledQuantity = vendorBilledQuantity;
    }

    public LineItem withVendorBilledQuantity(Object vendorBilledQuantity) {
        this.vendorBilledQuantity = vendorBilledQuantity;
        return this;
    }

    /**
     * Unit of Measure
     * <p>
     * The unit of measure used for the line item.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public Object getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Unit of Measure
     * <p>
     * The unit of measure used for the line item.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(Object unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public LineItem withUnitOfMeasure(Object unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LineItem withUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Vendor Billed Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledUnitPrice")
    public Object getVendorBilledUnitPrice() {
        return vendorBilledUnitPrice;
    }

    /**
     * Vendor Billed Unit Price
     * <p>
     * The price per unit for the commodity specified for the line item as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledUnitPrice")
    public void setVendorBilledUnitPrice(Object vendorBilledUnitPrice) {
        this.vendorBilledUnitPrice = vendorBilledUnitPrice;
    }

    public LineItem withVendorBilledUnitPrice(Object vendorBilledUnitPrice) {
        this.vendorBilledUnitPrice = vendorBilledUnitPrice;
        return this;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight)
     * 
     */
    @JsonProperty("additionalAmount")
    public Object getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight)
     * 
     */
    @JsonProperty("additionalAmount")
    public void setAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public LineItem withAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
        return this;
    }

    /**
     * Taxes
     * <p>
     * The taxes that are applicable to the line item if different from the invoice.
     * 
     */
    @JsonProperty("taxes")
    public List<Tax__1> getTaxes() {
        return taxes;
    }

    /**
     * Taxes
     * <p>
     * The taxes that are applicable to the line item if different from the invoice.
     * 
     */
    @JsonProperty("taxes")
    public void setTaxes(List<Tax__1> taxes) {
        this.taxes = taxes;
    }

    public LineItem withTaxes(List<Tax__1> taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Discount
     * <p>
     * The discount applied to the line item (e.g. trade/volume discounts).
     * 
     */
    @JsonProperty("discount")
    public Discount getDiscount() {
        return discount;
    }

    /**
     * Discount
     * <p>
     * The discount applied to the line item (e.g. trade/volume discounts).
     * 
     */
    @JsonProperty("discount")
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public LineItem withDiscount(Discount discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Payment Status
     * <p>
     * An indication if payment for the the line item is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    public LineItem.PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Payment Status
     * <p>
     * An indication if payment for the the line item is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(LineItem.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LineItem withPaymentStatus(LineItem.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Encumbrance Status
     * <p>
     * An indicator specifying if the encumbrance for the line item should be liquidated in full (final payment).
     * 
     */
    @JsonProperty("encumbranceStatus")
    public Object getEncumbranceStatus() {
        return encumbranceStatus;
    }

    /**
     * Encumbrance Status
     * <p>
     * An indicator specifying if the encumbrance for the line item should be liquidated in full (final payment).
     * 
     */
    @JsonProperty("encumbranceStatus")
    public void setEncumbranceStatus(Object encumbranceStatus) {
        this.encumbranceStatus = encumbranceStatus;
    }

    public LineItem withEncumbranceStatus(Object encumbranceStatus) {
        this.encumbranceStatus = encumbranceStatus;
        return this;
    }

    /**
     * Comment
     * <p>
     * Additional comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Additional comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public LineItem withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the line item (open, closed).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public LineItem.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the line item (open, closed).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(LineItem.Status status) {
        this.status = status;
    }

    public LineItem withStatus(LineItem.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Account Details
     * <p>
     * The detail account information for the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    public List<AccountDetail> getAccountDetails() {
        return accountDetails;
    }

    /**
     * Account Details
     * <p>
     * The detail account information for the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    public void setAccountDetails(List<AccountDetail> accountDetails) {
        this.accountDetails = accountDetails;
    }

    public LineItem withAccountDetails(List<AccountDetail> accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("referenceDocument");
        sb.append('=');
        sb.append(((this.referenceDocument == null)?"<null>":this.referenceDocument));
        sb.append(',');
        sb.append("referenceDocumentLineItemNumber");
        sb.append('=');
        sb.append(((this.referenceDocumentLineItemNumber == null)?"<null>":this.referenceDocumentLineItemNumber));
        sb.append(',');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("commodityCode");
        sb.append('=');
        sb.append(((this.commodityCode == null)?"<null>":this.commodityCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("vendorBilledQuantity");
        sb.append('=');
        sb.append(((this.vendorBilledQuantity == null)?"<null>":this.vendorBilledQuantity));
        sb.append(',');
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("vendorBilledUnitPrice");
        sb.append('=');
        sb.append(((this.vendorBilledUnitPrice == null)?"<null>":this.vendorBilledUnitPrice));
        sb.append(',');
        sb.append("additionalAmount");
        sb.append('=');
        sb.append(((this.additionalAmount == null)?"<null>":this.additionalAmount));
        sb.append(',');
        sb.append("taxes");
        sb.append('=');
        sb.append(((this.taxes == null)?"<null>":this.taxes));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("paymentStatus");
        sb.append('=');
        sb.append(((this.paymentStatus == null)?"<null>":this.paymentStatus));
        sb.append(',');
        sb.append("encumbranceStatus");
        sb.append('=');
        sb.append(((this.encumbranceStatus == null)?"<null>":this.encumbranceStatus));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("accountDetails");
        sb.append('=');
        sb.append(((this.accountDetails == null)?"<null>":this.accountDetails));
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
        result = ((result* 31)+((this.referenceDocumentLineItemNumber == null)? 0 :this.referenceDocumentLineItemNumber.hashCode()));
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.encumbranceStatus == null)? 0 :this.encumbranceStatus.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.referenceDocument == null)? 0 :this.referenceDocument.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.taxes == null)? 0 :this.taxes.hashCode()));
        result = ((result* 31)+((this.discount == null)? 0 :this.discount.hashCode()));
        result = ((result* 31)+((this.accountDetails == null)? 0 :this.accountDetails.hashCode()));
        result = ((result* 31)+((this.commodityCode == null)? 0 :this.commodityCode.hashCode()));
        result = ((result* 31)+((this.vendorBilledQuantity == null)? 0 :this.vendorBilledQuantity.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.vendorBilledUnitPrice == null)? 0 :this.vendorBilledUnitPrice.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        result = ((result* 31)+((this.paymentStatus == null)? 0 :this.paymentStatus.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return (((((((((((((((((((this.referenceDocumentLineItemNumber == rhs.referenceDocumentLineItemNumber)||((this.referenceDocumentLineItemNumber!= null)&&this.referenceDocumentLineItemNumber.equals(rhs.referenceDocumentLineItemNumber)))&&((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice))))&&((this.encumbranceStatus == rhs.encumbranceStatus)||((this.encumbranceStatus!= null)&&this.encumbranceStatus.equals(rhs.encumbranceStatus))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.referenceDocument == rhs.referenceDocument)||((this.referenceDocument!= null)&&this.referenceDocument.equals(rhs.referenceDocument))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.taxes == rhs.taxes)||((this.taxes!= null)&&this.taxes.equals(rhs.taxes))))&&((this.discount == rhs.discount)||((this.discount!= null)&&this.discount.equals(rhs.discount))))&&((this.accountDetails == rhs.accountDetails)||((this.accountDetails!= null)&&this.accountDetails.equals(rhs.accountDetails))))&&((this.commodityCode == rhs.commodityCode)||((this.commodityCode!= null)&&this.commodityCode.equals(rhs.commodityCode))))&&((this.vendorBilledQuantity == rhs.vendorBilledQuantity)||((this.vendorBilledQuantity!= null)&&this.vendorBilledQuantity.equals(rhs.vendorBilledQuantity))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.vendorBilledUnitPrice == rhs.vendorBilledUnitPrice)||((this.vendorBilledUnitPrice!= null)&&this.vendorBilledUnitPrice.equals(rhs.vendorBilledUnitPrice))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.paymentStatus == rhs.paymentStatus)||((this.paymentStatus!= null)&&this.paymentStatus.equals(rhs.paymentStatus))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Payment Status
     * <p>
     * An indication if payment for the the line item is on hold.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PaymentStatus {

        HOLD("hold"),
        NO_HOLD("noHold");
        private final String value;
        private final static Map<String, LineItem.PaymentStatus> CONSTANTS = new HashMap<String, LineItem.PaymentStatus>();

        static {
            for (LineItem.PaymentStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PaymentStatus(String value) {
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
        public static LineItem.PaymentStatus fromValue(String value) {
            LineItem.PaymentStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Status
     * <p>
     * The status of the line item (open, closed).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        CLOSED("closed");
        private final String value;
        private final static Map<String, LineItem.Status> CONSTANTS = new HashMap<String, LineItem.Status>();

        static {
            for (LineItem.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static LineItem.Status fromValue(String value) {
            LineItem.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
