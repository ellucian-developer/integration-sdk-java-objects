
package com.ellucian.generated.bpapi.ban.vendor_detail_history.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "favvic2PmtDueDate",
    "favvic2ApprInd",
    "favvic2InvhCode",
    "favvic2VendInvTotal",
    "favvic2CheckNum",
    "favvic2CancelInd",
    "favvic2CrMemoInd",
    "favvic2OpenPaidInd",
    "favvic2MultipleInvInd",
    "favvic2VendInvCode",
    "favvic2CheckDate",
    "favvic2PayType"
})
@Generated("jsonschema2pojo")
public class FabinvhBlock {

    /**
     * Due Date
     * <p>
     * Lineage reference object : FAVVIC2_PMT_DUE_DATE
     * 
     */
    @JsonProperty("favvic2PmtDueDate")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_PMT_DUE_DATE")
    private Date favvic2PmtDueDate;
    /**
     * Approval
     * <p>
     * Lineage reference object : FAVVIC2_APPR_IND
     * 
     */
    @JsonProperty("favvic2ApprInd")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_APPR_IND")
    private String favvic2ApprInd;
    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVVIC2_INVH_CODE
     * 
     */
    @JsonProperty("favvic2InvhCode")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_INVH_CODE")
    private String favvic2InvhCode;
    /**
     * Vendor Invoice Amount
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_TOTAL
     * 
     */
    @JsonProperty("favvic2VendInvTotal")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_VEND_INV_TOTAL")
    private Double favvic2VendInvTotal;
    /**
     * Check Number
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_NUM
     * 
     */
    @JsonProperty("favvic2CheckNum")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_CHECK_NUM")
    private String favvic2CheckNum;
    /**
     * Cancel
     * <p>
     * Lineage reference object : FAVVIC2_CANCEL_IND
     * 
     */
    @JsonProperty("favvic2CancelInd")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_CANCEL_IND")
    private String favvic2CancelInd;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVVIC2_CR_MEMO_IND
     * 
     */
    @JsonProperty("favvic2CrMemoInd")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_CR_MEMO_IND")
    private String favvic2CrMemoInd;
    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FAVVIC2_OPEN_PAID_IND
     * 
     */
    @JsonProperty("favvic2OpenPaidInd")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_OPEN_PAID_IND")
    private String favvic2OpenPaidInd;
    /**
     * Multiple
     * <p>
     * Lineage reference object : FAVVIC2_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("favvic2MultipleInvInd")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_MULTIPLE_INV_IND")
    private String favvic2MultipleInvInd;
    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_CODE
     * 
     */
    @JsonProperty("favvic2VendInvCode")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_VEND_INV_CODE")
    private String favvic2VendInvCode;
    /**
     * Check Date
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_DATE
     * 
     */
    @JsonProperty("favvic2CheckDate")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_CHECK_DATE")
    private Date favvic2CheckDate;
    /**
     * Pay Type
     * <p>
     * Lineage reference object : FAVVIC2_PAY_TYPE
     * 
     */
    @JsonProperty("favvic2PayType")
    @JsonPropertyDescription("Lineage reference object : FAVVIC2_PAY_TYPE")
    private String favvic2PayType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Due Date
     * <p>
     * Lineage reference object : FAVVIC2_PMT_DUE_DATE
     * 
     */
    @JsonProperty("favvic2PmtDueDate")
    public Date getFavvic2PmtDueDate() {
        return favvic2PmtDueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : FAVVIC2_PMT_DUE_DATE
     * 
     */
    @JsonProperty("favvic2PmtDueDate")
    public void setFavvic2PmtDueDate(Date favvic2PmtDueDate) {
        this.favvic2PmtDueDate = favvic2PmtDueDate;
    }

    public FabinvhBlock withFavvic2PmtDueDate(Date favvic2PmtDueDate) {
        this.favvic2PmtDueDate = favvic2PmtDueDate;
        return this;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : FAVVIC2_APPR_IND
     * 
     */
    @JsonProperty("favvic2ApprInd")
    public String getFavvic2ApprInd() {
        return favvic2ApprInd;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : FAVVIC2_APPR_IND
     * 
     */
    @JsonProperty("favvic2ApprInd")
    public void setFavvic2ApprInd(String favvic2ApprInd) {
        this.favvic2ApprInd = favvic2ApprInd;
    }

    public FabinvhBlock withFavvic2ApprInd(String favvic2ApprInd) {
        this.favvic2ApprInd = favvic2ApprInd;
        return this;
    }

    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVVIC2_INVH_CODE
     * 
     */
    @JsonProperty("favvic2InvhCode")
    public String getFavvic2InvhCode() {
        return favvic2InvhCode;
    }

    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVVIC2_INVH_CODE
     * 
     */
    @JsonProperty("favvic2InvhCode")
    public void setFavvic2InvhCode(String favvic2InvhCode) {
        this.favvic2InvhCode = favvic2InvhCode;
    }

    public FabinvhBlock withFavvic2InvhCode(String favvic2InvhCode) {
        this.favvic2InvhCode = favvic2InvhCode;
        return this;
    }

    /**
     * Vendor Invoice Amount
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_TOTAL
     * 
     */
    @JsonProperty("favvic2VendInvTotal")
    public Double getFavvic2VendInvTotal() {
        return favvic2VendInvTotal;
    }

    /**
     * Vendor Invoice Amount
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_TOTAL
     * 
     */
    @JsonProperty("favvic2VendInvTotal")
    public void setFavvic2VendInvTotal(Double favvic2VendInvTotal) {
        this.favvic2VendInvTotal = favvic2VendInvTotal;
    }

    public FabinvhBlock withFavvic2VendInvTotal(Double favvic2VendInvTotal) {
        this.favvic2VendInvTotal = favvic2VendInvTotal;
        return this;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_NUM
     * 
     */
    @JsonProperty("favvic2CheckNum")
    public String getFavvic2CheckNum() {
        return favvic2CheckNum;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_NUM
     * 
     */
    @JsonProperty("favvic2CheckNum")
    public void setFavvic2CheckNum(String favvic2CheckNum) {
        this.favvic2CheckNum = favvic2CheckNum;
    }

    public FabinvhBlock withFavvic2CheckNum(String favvic2CheckNum) {
        this.favvic2CheckNum = favvic2CheckNum;
        return this;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : FAVVIC2_CANCEL_IND
     * 
     */
    @JsonProperty("favvic2CancelInd")
    public String getFavvic2CancelInd() {
        return favvic2CancelInd;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : FAVVIC2_CANCEL_IND
     * 
     */
    @JsonProperty("favvic2CancelInd")
    public void setFavvic2CancelInd(String favvic2CancelInd) {
        this.favvic2CancelInd = favvic2CancelInd;
    }

    public FabinvhBlock withFavvic2CancelInd(String favvic2CancelInd) {
        this.favvic2CancelInd = favvic2CancelInd;
        return this;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVVIC2_CR_MEMO_IND
     * 
     */
    @JsonProperty("favvic2CrMemoInd")
    public String getFavvic2CrMemoInd() {
        return favvic2CrMemoInd;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVVIC2_CR_MEMO_IND
     * 
     */
    @JsonProperty("favvic2CrMemoInd")
    public void setFavvic2CrMemoInd(String favvic2CrMemoInd) {
        this.favvic2CrMemoInd = favvic2CrMemoInd;
    }

    public FabinvhBlock withFavvic2CrMemoInd(String favvic2CrMemoInd) {
        this.favvic2CrMemoInd = favvic2CrMemoInd;
        return this;
    }

    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FAVVIC2_OPEN_PAID_IND
     * 
     */
    @JsonProperty("favvic2OpenPaidInd")
    public String getFavvic2OpenPaidInd() {
        return favvic2OpenPaidInd;
    }

    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FAVVIC2_OPEN_PAID_IND
     * 
     */
    @JsonProperty("favvic2OpenPaidInd")
    public void setFavvic2OpenPaidInd(String favvic2OpenPaidInd) {
        this.favvic2OpenPaidInd = favvic2OpenPaidInd;
    }

    public FabinvhBlock withFavvic2OpenPaidInd(String favvic2OpenPaidInd) {
        this.favvic2OpenPaidInd = favvic2OpenPaidInd;
        return this;
    }

    /**
     * Multiple
     * <p>
     * Lineage reference object : FAVVIC2_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("favvic2MultipleInvInd")
    public String getFavvic2MultipleInvInd() {
        return favvic2MultipleInvInd;
    }

    /**
     * Multiple
     * <p>
     * Lineage reference object : FAVVIC2_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("favvic2MultipleInvInd")
    public void setFavvic2MultipleInvInd(String favvic2MultipleInvInd) {
        this.favvic2MultipleInvInd = favvic2MultipleInvInd;
    }

    public FabinvhBlock withFavvic2MultipleInvInd(String favvic2MultipleInvInd) {
        this.favvic2MultipleInvInd = favvic2MultipleInvInd;
        return this;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_CODE
     * 
     */
    @JsonProperty("favvic2VendInvCode")
    public String getFavvic2VendInvCode() {
        return favvic2VendInvCode;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FAVVIC2_VEND_INV_CODE
     * 
     */
    @JsonProperty("favvic2VendInvCode")
    public void setFavvic2VendInvCode(String favvic2VendInvCode) {
        this.favvic2VendInvCode = favvic2VendInvCode;
    }

    public FabinvhBlock withFavvic2VendInvCode(String favvic2VendInvCode) {
        this.favvic2VendInvCode = favvic2VendInvCode;
        return this;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_DATE
     * 
     */
    @JsonProperty("favvic2CheckDate")
    public Date getFavvic2CheckDate() {
        return favvic2CheckDate;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAVVIC2_CHECK_DATE
     * 
     */
    @JsonProperty("favvic2CheckDate")
    public void setFavvic2CheckDate(Date favvic2CheckDate) {
        this.favvic2CheckDate = favvic2CheckDate;
    }

    public FabinvhBlock withFavvic2CheckDate(Date favvic2CheckDate) {
        this.favvic2CheckDate = favvic2CheckDate;
        return this;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : FAVVIC2_PAY_TYPE
     * 
     */
    @JsonProperty("favvic2PayType")
    public String getFavvic2PayType() {
        return favvic2PayType;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : FAVVIC2_PAY_TYPE
     * 
     */
    @JsonProperty("favvic2PayType")
    public void setFavvic2PayType(String favvic2PayType) {
        this.favvic2PayType = favvic2PayType;
    }

    public FabinvhBlock withFavvic2PayType(String favvic2PayType) {
        this.favvic2PayType = favvic2PayType;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public FabinvhBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FabinvhBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("favvic2PmtDueDate");
        sb.append('=');
        sb.append(((this.favvic2PmtDueDate == null)?"<null>":this.favvic2PmtDueDate));
        sb.append(',');
        sb.append("favvic2ApprInd");
        sb.append('=');
        sb.append(((this.favvic2ApprInd == null)?"<null>":this.favvic2ApprInd));
        sb.append(',');
        sb.append("favvic2InvhCode");
        sb.append('=');
        sb.append(((this.favvic2InvhCode == null)?"<null>":this.favvic2InvhCode));
        sb.append(',');
        sb.append("favvic2VendInvTotal");
        sb.append('=');
        sb.append(((this.favvic2VendInvTotal == null)?"<null>":this.favvic2VendInvTotal));
        sb.append(',');
        sb.append("favvic2CheckNum");
        sb.append('=');
        sb.append(((this.favvic2CheckNum == null)?"<null>":this.favvic2CheckNum));
        sb.append(',');
        sb.append("favvic2CancelInd");
        sb.append('=');
        sb.append(((this.favvic2CancelInd == null)?"<null>":this.favvic2CancelInd));
        sb.append(',');
        sb.append("favvic2CrMemoInd");
        sb.append('=');
        sb.append(((this.favvic2CrMemoInd == null)?"<null>":this.favvic2CrMemoInd));
        sb.append(',');
        sb.append("favvic2OpenPaidInd");
        sb.append('=');
        sb.append(((this.favvic2OpenPaidInd == null)?"<null>":this.favvic2OpenPaidInd));
        sb.append(',');
        sb.append("favvic2MultipleInvInd");
        sb.append('=');
        sb.append(((this.favvic2MultipleInvInd == null)?"<null>":this.favvic2MultipleInvInd));
        sb.append(',');
        sb.append("favvic2VendInvCode");
        sb.append('=');
        sb.append(((this.favvic2VendInvCode == null)?"<null>":this.favvic2VendInvCode));
        sb.append(',');
        sb.append("favvic2CheckDate");
        sb.append('=');
        sb.append(((this.favvic2CheckDate == null)?"<null>":this.favvic2CheckDate));
        sb.append(',');
        sb.append("favvic2PayType");
        sb.append('=');
        sb.append(((this.favvic2PayType == null)?"<null>":this.favvic2PayType));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.favvic2PmtDueDate == null)? 0 :this.favvic2PmtDueDate.hashCode()));
        result = ((result* 31)+((this.favvic2ApprInd == null)? 0 :this.favvic2ApprInd.hashCode()));
        result = ((result* 31)+((this.favvic2InvhCode == null)? 0 :this.favvic2InvhCode.hashCode()));
        result = ((result* 31)+((this.favvic2VendInvTotal == null)? 0 :this.favvic2VendInvTotal.hashCode()));
        result = ((result* 31)+((this.favvic2CancelInd == null)? 0 :this.favvic2CancelInd.hashCode()));
        result = ((result* 31)+((this.favvic2VendInvCode == null)? 0 :this.favvic2VendInvCode.hashCode()));
        result = ((result* 31)+((this.favvic2CheckDate == null)? 0 :this.favvic2CheckDate.hashCode()));
        result = ((result* 31)+((this.favvic2PayType == null)? 0 :this.favvic2PayType.hashCode()));
        result = ((result* 31)+((this.favvic2CheckNum == null)? 0 :this.favvic2CheckNum.hashCode()));
        result = ((result* 31)+((this.favvic2CrMemoInd == null)? 0 :this.favvic2CrMemoInd.hashCode()));
        result = ((result* 31)+((this.favvic2OpenPaidInd == null)? 0 :this.favvic2OpenPaidInd.hashCode()));
        result = ((result* 31)+((this.favvic2MultipleInvInd == null)? 0 :this.favvic2MultipleInvInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FabinvhBlock) == false) {
            return false;
        }
        FabinvhBlock rhs = ((FabinvhBlock) other);
        return ((((((((((((((this.favvic2PmtDueDate == rhs.favvic2PmtDueDate)||((this.favvic2PmtDueDate!= null)&&this.favvic2PmtDueDate.equals(rhs.favvic2PmtDueDate)))&&((this.favvic2ApprInd == rhs.favvic2ApprInd)||((this.favvic2ApprInd!= null)&&this.favvic2ApprInd.equals(rhs.favvic2ApprInd))))&&((this.favvic2InvhCode == rhs.favvic2InvhCode)||((this.favvic2InvhCode!= null)&&this.favvic2InvhCode.equals(rhs.favvic2InvhCode))))&&((this.favvic2VendInvTotal == rhs.favvic2VendInvTotal)||((this.favvic2VendInvTotal!= null)&&this.favvic2VendInvTotal.equals(rhs.favvic2VendInvTotal))))&&((this.favvic2CancelInd == rhs.favvic2CancelInd)||((this.favvic2CancelInd!= null)&&this.favvic2CancelInd.equals(rhs.favvic2CancelInd))))&&((this.favvic2VendInvCode == rhs.favvic2VendInvCode)||((this.favvic2VendInvCode!= null)&&this.favvic2VendInvCode.equals(rhs.favvic2VendInvCode))))&&((this.favvic2CheckDate == rhs.favvic2CheckDate)||((this.favvic2CheckDate!= null)&&this.favvic2CheckDate.equals(rhs.favvic2CheckDate))))&&((this.favvic2PayType == rhs.favvic2PayType)||((this.favvic2PayType!= null)&&this.favvic2PayType.equals(rhs.favvic2PayType))))&&((this.favvic2CheckNum == rhs.favvic2CheckNum)||((this.favvic2CheckNum!= null)&&this.favvic2CheckNum.equals(rhs.favvic2CheckNum))))&&((this.favvic2CrMemoInd == rhs.favvic2CrMemoInd)||((this.favvic2CrMemoInd!= null)&&this.favvic2CrMemoInd.equals(rhs.favvic2CrMemoInd))))&&((this.favvic2OpenPaidInd == rhs.favvic2OpenPaidInd)||((this.favvic2OpenPaidInd!= null)&&this.favvic2OpenPaidInd.equals(rhs.favvic2OpenPaidInd))))&&((this.favvic2MultipleInvInd == rhs.favvic2MultipleInvInd)||((this.favvic2MultipleInvInd!= null)&&this.favvic2MultipleInvInd.equals(rhs.favvic2MultipleInvInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
