
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "amount",
    "typeInd",
    "currCode",
    "detailCodeInd",
    "paytCode",
    "taxMethod",
    "detcActiveInd",
    "refundInd",
    "payhistInd",
    "priority",
    "detailCode",
    "receiptInd",
    "taxProfile",
    "dcatCode",
    "dirdInd",
    "refundableInd",
    "tbbdetcDetailCode",
    "glNosEnterable",
    "taxtCode",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100GetRequest {

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_AMOUNT")
    private Double amount;
    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TYPE_IND")
    private String typeInd;
    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE_IND")
    private String detailCodeInd;
    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt")
    private String paytCode;
    @JsonProperty("taxMethod")
    private String taxMethod;
    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETC_ACTIVE_IND")
    private String detcActiveInd;
    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUND_IND")
    private String refundInd;
    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String payhistInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PRIORITY")
    private String priority;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String detailCode;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_RECEIPT_IND")
    private String receiptInd;
    @JsonProperty("taxProfile")
    private String taxProfile;
    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String dcatCode;
    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DIRD_IND")
    private String dirdInd;
    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUNDABLE_IND")
    private String refundableInd;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String tbbdetcDetailCode;
    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_GL_NOS_ENTERABLE")
    private String glNosEnterable;
    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt")
    private String taxtCode;
    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FinanceDetailCodes100GetRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public FinanceDetailCodes100GetRequest withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public FinanceDetailCodes100GetRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public String getDetailCodeInd() {
        return detailCodeInd;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public void setDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
    }

    public FinanceDetailCodes100GetRequest withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
        return this;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public String getPaytCode() {
        return paytCode;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public void setPaytCode(String paytCode) {
        this.paytCode = paytCode;
    }

    public FinanceDetailCodes100GetRequest withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    @JsonProperty("taxMethod")
    public String getTaxMethod() {
        return taxMethod;
    }

    @JsonProperty("taxMethod")
    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public FinanceDetailCodes100GetRequest withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public String getDetcActiveInd() {
        return detcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public void setDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
    }

    public FinanceDetailCodes100GetRequest withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public FinanceDetailCodes100GetRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public String getPayhistInd() {
        return payhistInd;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public void setPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
    }

    public FinanceDetailCodes100GetRequest withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public FinanceDetailCodes100GetRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public FinanceDetailCodes100GetRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public String getReceiptInd() {
        return receiptInd;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public void setReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
    }

    public FinanceDetailCodes100GetRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    @JsonProperty("taxProfile")
    public String getTaxProfile() {
        return taxProfile;
    }

    @JsonProperty("taxProfile")
    public void setTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
    }

    public FinanceDetailCodes100GetRequest withTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public FinanceDetailCodes100GetRequest withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public String getDirdInd() {
        return dirdInd;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public void setDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
    }

    public FinanceDetailCodes100GetRequest withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
        return this;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public String getRefundableInd() {
        return refundableInd;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public void setRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
    }

    public FinanceDetailCodes100GetRequest withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    public String getTbbdetcDetailCode() {
        return tbbdetcDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    public void setTbbdetcDetailCode(String tbbdetcDetailCode) {
        this.tbbdetcDetailCode = tbbdetcDetailCode;
    }

    public FinanceDetailCodes100GetRequest withTbbdetcDetailCode(String tbbdetcDetailCode) {
        this.tbbdetcDetailCode = tbbdetcDetailCode;
        return this;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public String getGlNosEnterable() {
        return glNosEnterable;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public void setGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
    }

    public FinanceDetailCodes100GetRequest withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public String getTaxtCode() {
        return taxtCode;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public void setTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
    }

    public FinanceDetailCodes100GetRequest withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public FinanceDetailCodes100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FinanceDetailCodes100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public FinanceDetailCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("detailCodeInd");
        sb.append('=');
        sb.append(((this.detailCodeInd == null)?"<null>":this.detailCodeInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("taxProfile");
        sb.append('=');
        sb.append(((this.taxProfile == null)?"<null>":this.taxProfile));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("dirdInd");
        sb.append('=');
        sb.append(((this.dirdInd == null)?"<null>":this.dirdInd));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("tbbdetcDetailCode");
        sb.append('=');
        sb.append(((this.tbbdetcDetailCode == null)?"<null>":this.tbbdetcDetailCode));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcDetailCode == null)? 0 :this.tbbdetcDetailCode.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100GetRequest) == false) {
            return false;
        }
        FinanceDetailCodes100GetRequest rhs = ((FinanceDetailCodes100GetRequest) other);
        return (((((((((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.tbbdetcDetailCode == rhs.tbbdetcDetailCode)||((this.tbbdetcDetailCode!= null)&&this.tbbdetcDetailCode.equals(rhs.tbbdetcDetailCode))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}