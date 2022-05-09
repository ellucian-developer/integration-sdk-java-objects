
package com.ellucian.generated.eedm.purchase_orders.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineItemNumber",
    "description",
    "commodityCode",
    "partNumber",
    "desiredDate",
    "quantity",
    "unitOfMeasure",
    "unitPrice",
    "additionalAmount",
    "taxCodes",
    "discountAmount",
    "tradeDiscount",
    "comments",
    "reference",
    "accountDetails"
})
@Generated("jsonschema2pojo")
public class LineItem {

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("A system generated number to identify the line item. User specified values will be overwritten.")
    private String lineItemNumber;
    /**
     * Description
     * <p>
     * The description of the commodity specified by the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the commodity specified by the line item.")
    private String description;
    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the line item.
     * 
     */
    @JsonProperty("commodityCode")
    @JsonPropertyDescription("The commodity code associated with the line item.")
    private Object commodityCode;
    /**
     * Part Number
     * <p>
     * The vendor part number for the line item.
     * 
     */
    @JsonProperty("partNumber")
    @JsonPropertyDescription("The vendor part number for the line item.")
    private String partNumber;
    /**
     * Desired Date
     * <p>
     * The date when the item specified for the line item is needed.
     * 
     */
    @JsonProperty("desiredDate")
    @JsonPropertyDescription("The date when the item specified for the line item is needed.")
    private Object desiredDate;
    /**
     * Quantity
     * <p>
     * The quantity of the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of the line item.")
    private Double quantity;
    /**
     * Unit Of Measure
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
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight).
     * 
     */
    @JsonProperty("additionalAmount")
    @JsonPropertyDescription("Additional charges/discounts applied to the line item (e.g. freight).")
    private Object additionalAmount;
    /**
     * Tax Codes
     * <p>
     * The tax codes applicable to the line item.
     * 
     */
    @JsonProperty("taxCodes")
    @JsonPropertyDescription("The tax codes applicable to the line item.")
    private List<TaxCode> taxCodes = new ArrayList<TaxCode>();
    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the line item, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    @JsonPropertyDescription("The discount amount applied to the line item, which may be calculated from the overall discount or overridden.")
    private String discountAmount;
    /**
     * Trade Discount
     * <p>
     * A discount applied to the line item in addition to the overall vendor discount, e.g. discount based on quantity purchased.
     * 
     */
    @JsonProperty("tradeDiscount")
    @JsonPropertyDescription("A discount applied to the line item in addition to the overall vendor discount, e.g. discount based on quantity purchased.")
    private Object tradeDiscount;
    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the line item.")
    private List<Comment__1> comments = new ArrayList<Comment__1>();
    /**
     * Reference
     * <p>
     * The reference associated with the line item.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("The reference associated with the line item.")
    private Object reference;
    /**
     * Account Details
     * <p>
     * The account details associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    @JsonPropertyDescription("The account details associated with the line item.")
    private List<AccountDetail> accountDetails = new ArrayList<AccountDetail>();

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
     * 
     */
    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
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
     * The description of the commodity specified by the line item.
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
     * The description of the commodity specified by the line item.
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
     * The commodity code associated with the line item.
     * 
     */
    @JsonProperty("commodityCode")
    public Object getCommodityCode() {
        return commodityCode;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the line item.
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
     * Part Number
     * <p>
     * The vendor part number for the line item.
     * 
     */
    @JsonProperty("partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Part Number
     * <p>
     * The vendor part number for the line item.
     * 
     */
    @JsonProperty("partNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public LineItem withPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * Desired Date
     * <p>
     * The date when the item specified for the line item is needed.
     * 
     */
    @JsonProperty("desiredDate")
    public Object getDesiredDate() {
        return desiredDate;
    }

    /**
     * Desired Date
     * <p>
     * The date when the item specified for the line item is needed.
     * 
     */
    @JsonProperty("desiredDate")
    public void setDesiredDate(Object desiredDate) {
        this.desiredDate = desiredDate;
    }

    public LineItem withDesiredDate(Object desiredDate) {
        this.desiredDate = desiredDate;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the line item.
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
     * The quantity of the line item.
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
     * Unit Of Measure
     * <p>
     * The unit of measure used for the line item.
     * 
     */
    @JsonProperty("unitOfMeasure")
    public Object getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Unit Of Measure
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
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight).
     * 
     */
    @JsonProperty("additionalAmount")
    public Object getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the line item (e.g. freight).
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
     * Tax Codes
     * <p>
     * The tax codes applicable to the line item.
     * 
     */
    @JsonProperty("taxCodes")
    public List<TaxCode> getTaxCodes() {
        return taxCodes;
    }

    /**
     * Tax Codes
     * <p>
     * The tax codes applicable to the line item.
     * 
     */
    @JsonProperty("taxCodes")
    public void setTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
    }

    public LineItem withTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
        return this;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the line item, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the line item, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public LineItem withDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Trade Discount
     * <p>
     * A discount applied to the line item in addition to the overall vendor discount, e.g. discount based on quantity purchased.
     * 
     */
    @JsonProperty("tradeDiscount")
    public Object getTradeDiscount() {
        return tradeDiscount;
    }

    /**
     * Trade Discount
     * <p>
     * A discount applied to the line item in addition to the overall vendor discount, e.g. discount based on quantity purchased.
     * 
     */
    @JsonProperty("tradeDiscount")
    public void setTradeDiscount(Object tradeDiscount) {
        this.tradeDiscount = tradeDiscount;
    }

    public LineItem withTradeDiscount(Object tradeDiscount) {
        this.tradeDiscount = tradeDiscount;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    public List<Comment__1> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment__1> comments) {
        this.comments = comments;
    }

    public LineItem withComments(List<Comment__1> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Reference
     * <p>
     * The reference associated with the line item.
     * 
     */
    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * The reference associated with the line item.
     * 
     */
    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    public LineItem withReference(Object reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Account Details
     * <p>
     * The account details associated with the line item.
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
     * The account details associated with the line item.
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
        sb.append("partNumber");
        sb.append('=');
        sb.append(((this.partNumber == null)?"<null>":this.partNumber));
        sb.append(',');
        sb.append("desiredDate");
        sb.append('=');
        sb.append(((this.desiredDate == null)?"<null>":this.desiredDate));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("additionalAmount");
        sb.append('=');
        sb.append(((this.additionalAmount == null)?"<null>":this.additionalAmount));
        sb.append(',');
        sb.append("taxCodes");
        sb.append('=');
        sb.append(((this.taxCodes == null)?"<null>":this.taxCodes));
        sb.append(',');
        sb.append("discountAmount");
        sb.append('=');
        sb.append(((this.discountAmount == null)?"<null>":this.discountAmount));
        sb.append(',');
        sb.append("tradeDiscount");
        sb.append('=');
        sb.append(((this.tradeDiscount == null)?"<null>":this.tradeDiscount));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
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
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.desiredDate == null)? 0 :this.desiredDate.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.discountAmount == null)? 0 :this.discountAmount.hashCode()));
        result = ((result* 31)+((this.tradeDiscount == null)? 0 :this.tradeDiscount.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.taxCodes == null)? 0 :this.taxCodes.hashCode()));
        result = ((result* 31)+((this.accountDetails == null)? 0 :this.accountDetails.hashCode()));
        result = ((result* 31)+((this.commodityCode == null)? 0 :this.commodityCode.hashCode()));
        result = ((result* 31)+((this.partNumber == null)? 0 :this.partNumber.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
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
        return ((((((((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.desiredDate == rhs.desiredDate)||((this.desiredDate!= null)&&this.desiredDate.equals(rhs.desiredDate))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.discountAmount == rhs.discountAmount)||((this.discountAmount!= null)&&this.discountAmount.equals(rhs.discountAmount))))&&((this.tradeDiscount == rhs.tradeDiscount)||((this.tradeDiscount!= null)&&this.tradeDiscount.equals(rhs.tradeDiscount))))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.taxCodes == rhs.taxCodes)||((this.taxCodes!= null)&&this.taxCodes.equals(rhs.taxCodes))))&&((this.accountDetails == rhs.accountDetails)||((this.accountDetails!= null)&&this.accountDetails.equals(rhs.accountDetails))))&&((this.commodityCode == rhs.commodityCode)||((this.commodityCode!= null)&&this.commodityCode.equals(rhs.commodityCode))))&&((this.partNumber == rhs.partNumber)||((this.partNumber!= null)&&this.partNumber.equals(rhs.partNumber))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))));
    }

}
