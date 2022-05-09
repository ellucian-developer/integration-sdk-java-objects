
package com.ellucian.generated.eedm.blanket_purchase_orders.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orderDetailNumber",
    "description",
    "commodityCode",
    "amount",
    "additionalAmount",
    "taxCodes",
    "discountAmount",
    "comments",
    "referenceRequisitions",
    "accountDetails"
})
@Generated("jsonschema2pojo")
public class OrderDetail {

    /**
     * Order Detail Number
     * <p>
     * A system generated number to identify the order detail. User specified values will be overwritten.
     * 
     */
    @JsonProperty("orderDetailNumber")
    @JsonPropertyDescription("A system generated number to identify the order detail. User specified values will be overwritten.")
    private String orderDetailNumber;
    /**
     * Description
     * <p>
     * The description of the commodity specified in the order detail.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the commodity specified in the order detail.")
    private String description;
    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the item ordered.
     * 
     */
    @JsonProperty("commodityCode")
    @JsonPropertyDescription("The commodity code associated with the item ordered.")
    private Object commodityCode;
    /**
     * Amount
     * <p>
     * The amount associated with the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount associated with the item ordered.")
    private Amount amount;
    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the item ordered (e.g. freight).
     * 
     */
    @JsonProperty("additionalAmount")
    @JsonPropertyDescription("Additional charges/discounts applied to the item ordered (e.g. freight).")
    private Object additionalAmount;
    /**
     * Tax Codes
     * <p>
     * The tax codes applicable to the item ordered.
     * 
     */
    @JsonProperty("taxCodes")
    @JsonPropertyDescription("The tax codes applicable to the item ordered.")
    private List<TaxCode> taxCodes = new ArrayList<TaxCode>();
    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the item ordered, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    @JsonPropertyDescription("The discount amount applied to the item ordered, which may be calculated from the overall discount or overridden.")
    private Object discountAmount;
    /**
     * Comments
     * <p>
     * The comments associated with the item ordered.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the item ordered.")
    private List<Comment__1> comments = new ArrayList<Comment__1>();
    /**
     * Reference Requisitions
     * <p>
     * The requisitions referenced for the item ordered.
     * 
     */
    @JsonProperty("referenceRequisitions")
    @JsonPropertyDescription("The requisitions referenced for the item ordered.")
    private List<ReferenceRequisition> referenceRequisitions = new ArrayList<ReferenceRequisition>();
    /**
     * Account Details
     * <p>
     * The account details associated with the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    @JsonPropertyDescription("The account details associated with the item ordered.")
    private List<AccountDetail> accountDetails = new ArrayList<AccountDetail>();

    /**
     * Order Detail Number
     * <p>
     * A system generated number to identify the order detail. User specified values will be overwritten.
     * 
     */
    @JsonProperty("orderDetailNumber")
    public String getOrderDetailNumber() {
        return orderDetailNumber;
    }

    /**
     * Order Detail Number
     * <p>
     * A system generated number to identify the order detail. User specified values will be overwritten.
     * 
     */
    @JsonProperty("orderDetailNumber")
    public void setOrderDetailNumber(String orderDetailNumber) {
        this.orderDetailNumber = orderDetailNumber;
    }

    public OrderDetail withOrderDetailNumber(String orderDetailNumber) {
        this.orderDetailNumber = orderDetailNumber;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the commodity specified in the order detail.
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
     * The description of the commodity specified in the order detail.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public OrderDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the item ordered.
     * 
     */
    @JsonProperty("commodityCode")
    public Object getCommodityCode() {
        return commodityCode;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the item ordered.
     * 
     */
    @JsonProperty("commodityCode")
    public void setCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
    }

    public OrderDetail withCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the item ordered.
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
     * The amount associated with the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public OrderDetail withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the item ordered (e.g. freight).
     * 
     */
    @JsonProperty("additionalAmount")
    public Object getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges/discounts applied to the item ordered (e.g. freight).
     * 
     */
    @JsonProperty("additionalAmount")
    public void setAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public OrderDetail withAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
        return this;
    }

    /**
     * Tax Codes
     * <p>
     * The tax codes applicable to the item ordered.
     * 
     */
    @JsonProperty("taxCodes")
    public List<TaxCode> getTaxCodes() {
        return taxCodes;
    }

    /**
     * Tax Codes
     * <p>
     * The tax codes applicable to the item ordered.
     * 
     */
    @JsonProperty("taxCodes")
    public void setTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
    }

    public OrderDetail withTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
        return this;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the item ordered, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    public Object getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount applied to the item ordered, which may be calculated from the overall discount or overridden.
     * 
     */
    @JsonProperty("discountAmount")
    public void setDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OrderDetail withDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the item ordered.
     * 
     */
    @JsonProperty("comments")
    public List<Comment__1> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the item ordered.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment__1> comments) {
        this.comments = comments;
    }

    public OrderDetail withComments(List<Comment__1> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Reference Requisitions
     * <p>
     * The requisitions referenced for the item ordered.
     * 
     */
    @JsonProperty("referenceRequisitions")
    public List<ReferenceRequisition> getReferenceRequisitions() {
        return referenceRequisitions;
    }

    /**
     * Reference Requisitions
     * <p>
     * The requisitions referenced for the item ordered.
     * 
     */
    @JsonProperty("referenceRequisitions")
    public void setReferenceRequisitions(List<ReferenceRequisition> referenceRequisitions) {
        this.referenceRequisitions = referenceRequisitions;
    }

    public OrderDetail withReferenceRequisitions(List<ReferenceRequisition> referenceRequisitions) {
        this.referenceRequisitions = referenceRequisitions;
        return this;
    }

    /**
     * Account Details
     * <p>
     * The account details associated with the item ordered.
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
     * The account details associated with the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("accountDetails")
    public void setAccountDetails(List<AccountDetail> accountDetails) {
        this.accountDetails = accountDetails;
    }

    public OrderDetail withAccountDetails(List<AccountDetail> accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrderDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orderDetailNumber");
        sb.append('=');
        sb.append(((this.orderDetailNumber == null)?"<null>":this.orderDetailNumber));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("commodityCode");
        sb.append('=');
        sb.append(((this.commodityCode == null)?"<null>":this.commodityCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("referenceRequisitions");
        sb.append('=');
        sb.append(((this.referenceRequisitions == null)?"<null>":this.referenceRequisitions));
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
        result = ((result* 31)+((this.referenceRequisitions == null)? 0 :this.referenceRequisitions.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.taxCodes == null)? 0 :this.taxCodes.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.accountDetails == null)? 0 :this.accountDetails.hashCode()));
        result = ((result* 31)+((this.commodityCode == null)? 0 :this.commodityCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.discountAmount == null)? 0 :this.discountAmount.hashCode()));
        result = ((result* 31)+((this.orderDetailNumber == null)? 0 :this.orderDetailNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderDetail) == false) {
            return false;
        }
        OrderDetail rhs = ((OrderDetail) other);
        return (((((((((((this.referenceRequisitions == rhs.referenceRequisitions)||((this.referenceRequisitions!= null)&&this.referenceRequisitions.equals(rhs.referenceRequisitions)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.taxCodes == rhs.taxCodes)||((this.taxCodes!= null)&&this.taxCodes.equals(rhs.taxCodes))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.accountDetails == rhs.accountDetails)||((this.accountDetails!= null)&&this.accountDetails.equals(rhs.accountDetails))))&&((this.commodityCode == rhs.commodityCode)||((this.commodityCode!= null)&&this.commodityCode.equals(rhs.commodityCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.discountAmount == rhs.discountAmount)||((this.discountAmount!= null)&&this.discountAmount.equals(rhs.discountAmount))))&&((this.orderDetailNumber == rhs.orderDetailNumber)||((this.orderDetailNumber!= null)&&this.orderDetailNumber.equals(rhs.orderDetailNumber))));
    }

}
