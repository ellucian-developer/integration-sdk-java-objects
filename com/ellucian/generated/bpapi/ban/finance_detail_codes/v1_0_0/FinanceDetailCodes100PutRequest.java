
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
    "criteria.detailCode",
    "criteria.amount",
    "currCode",
    "detailCodeInd",
    "criteria.detailCodeInd",
    "criteria.detcActiveInd",
    "taxMethod",
    "detcActiveInd",
    "payhistInd",
    "criteria.dcatCode",
    "criteria.glNosEnterable",
    "criteria.desc",
    "criteria.taxtCode",
    "criteria.taxProfile",
    "criteria.paytCode",
    "criteria.taxMethod",
    "criteria.tbbdetcDetailCode",
    "glNosEnterable",
    "criteria.refundableInd",
    "criteria.effectiveDate",
    "amount",
    "typeInd",
    "paytCode",
    "refundInd",
    "priority",
    "detailCode",
    "receiptInd",
    "criteria.dirdInd",
    "criteria.receiptInd",
    "criteria.payhistInd",
    "criteria.currCode",
    "criteria.priority",
    "criteria.refundInd",
    "taxProfile",
    "dcatCode",
    "dirdInd",
    "refundableInd",
    "criteria.typeInd",
    "tbbdetcDetailCode",
    "taxtCode",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100PutRequest {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String criteriaDetailCode;
    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_AMOUNT")
    private Double criteriaAmount;
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
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("criteria.detailCodeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE_IND")
    private String criteriaDetailCodeInd;
    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.detcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETC_ACTIVE_IND")
    private String criteriaDetcActiveInd;
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
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String payhistInd;
    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("criteria.dcatCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String criteriaDcatCode;
    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("criteria.glNosEnterable")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_GL_NOS_ENTERABLE")
    private String criteriaGlNosEnterable;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String criteriaDesc;
    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("criteria.taxtCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt")
    private String criteriaTaxtCode;
    @JsonProperty("criteria.taxProfile")
    private String criteriaTaxProfile;
    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("criteria.paytCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt")
    private String criteriaPaytCode;
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbdetcDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String criteriaTbbdetcDetailCode;
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
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("criteria.refundableInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUNDABLE_IND")
    private String criteriaRefundableInd;
    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
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
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt")
    private String paytCode;
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
    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("criteria.dirdInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DIRD_IND")
    private String criteriaDirdInd;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("criteria.receiptInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_RECEIPT_IND")
    private String criteriaReceiptInd;
    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("criteria.payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String criteriaPayhistInd;
    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PRIORITY")
    private String criteriaPriority;
    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUND_IND")
    private String criteriaRefundInd;
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
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TYPE_IND")
    private String criteriaTypeInd;
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
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public String getCriteriaDetailCode() {
        return criteriaDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public FinanceDetailCodes100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
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

    public FinanceDetailCodes100PutRequest withCurrCode(String currCode) {
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

    public FinanceDetailCodes100PutRequest withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("criteria.detailCodeInd")
    public String getCriteriaDetailCodeInd() {
        return criteriaDetailCodeInd;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("criteria.detailCodeInd")
    public void setCriteriaDetailCodeInd(String criteriaDetailCodeInd) {
        this.criteriaDetailCodeInd = criteriaDetailCodeInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDetailCodeInd(String criteriaDetailCodeInd) {
        this.criteriaDetailCodeInd = criteriaDetailCodeInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.detcActiveInd")
    public String getCriteriaDetcActiveInd() {
        return criteriaDetcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.detcActiveInd")
    public void setCriteriaDetcActiveInd(String criteriaDetcActiveInd) {
        this.criteriaDetcActiveInd = criteriaDetcActiveInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDetcActiveInd(String criteriaDetcActiveInd) {
        this.criteriaDetcActiveInd = criteriaDetcActiveInd;
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

    public FinanceDetailCodes100PutRequest withTaxMethod(String taxMethod) {
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

    public FinanceDetailCodes100PutRequest withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
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

    public FinanceDetailCodes100PutRequest withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("criteria.dcatCode")
    public String getCriteriaDcatCode() {
        return criteriaDcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("criteria.dcatCode")
    public void setCriteriaDcatCode(String criteriaDcatCode) {
        this.criteriaDcatCode = criteriaDcatCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDcatCode(String criteriaDcatCode) {
        this.criteriaDcatCode = criteriaDcatCode;
        return this;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("criteria.glNosEnterable")
    public String getCriteriaGlNosEnterable() {
        return criteriaGlNosEnterable;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("criteria.glNosEnterable")
    public void setCriteriaGlNosEnterable(String criteriaGlNosEnterable) {
        this.criteriaGlNosEnterable = criteriaGlNosEnterable;
    }

    public FinanceDetailCodes100PutRequest withCriteriaGlNosEnterable(String criteriaGlNosEnterable) {
        this.criteriaGlNosEnterable = criteriaGlNosEnterable;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("criteria.taxtCode")
    public String getCriteriaTaxtCode() {
        return criteriaTaxtCode;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("criteria.taxtCode")
    public void setCriteriaTaxtCode(String criteriaTaxtCode) {
        this.criteriaTaxtCode = criteriaTaxtCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaTaxtCode(String criteriaTaxtCode) {
        this.criteriaTaxtCode = criteriaTaxtCode;
        return this;
    }

    @JsonProperty("criteria.taxProfile")
    public String getCriteriaTaxProfile() {
        return criteriaTaxProfile;
    }

    @JsonProperty("criteria.taxProfile")
    public void setCriteriaTaxProfile(String criteriaTaxProfile) {
        this.criteriaTaxProfile = criteriaTaxProfile;
    }

    public FinanceDetailCodes100PutRequest withCriteriaTaxProfile(String criteriaTaxProfile) {
        this.criteriaTaxProfile = criteriaTaxProfile;
        return this;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("criteria.paytCode")
    public String getCriteriaPaytCode() {
        return criteriaPaytCode;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("criteria.paytCode")
    public void setCriteriaPaytCode(String criteriaPaytCode) {
        this.criteriaPaytCode = criteriaPaytCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaPaytCode(String criteriaPaytCode) {
        this.criteriaPaytCode = criteriaPaytCode;
        return this;
    }

    @JsonProperty("criteria.taxMethod")
    public String getCriteriaTaxMethod() {
        return criteriaTaxMethod;
    }

    @JsonProperty("criteria.taxMethod")
    public void setCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
    }

    public FinanceDetailCodes100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbdetcDetailCode")
    public String getCriteriaTbbdetcDetailCode() {
        return criteriaTbbdetcDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbdetcDetailCode")
    public void setCriteriaTbbdetcDetailCode(String criteriaTbbdetcDetailCode) {
        this.criteriaTbbdetcDetailCode = criteriaTbbdetcDetailCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaTbbdetcDetailCode(String criteriaTbbdetcDetailCode) {
        this.criteriaTbbdetcDetailCode = criteriaTbbdetcDetailCode;
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

    public FinanceDetailCodes100PutRequest withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("criteria.refundableInd")
    public String getCriteriaRefundableInd() {
        return criteriaRefundableInd;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("criteria.refundableInd")
    public void setCriteriaRefundableInd(String criteriaRefundableInd) {
        this.criteriaRefundableInd = criteriaRefundableInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaRefundableInd(String criteriaRefundableInd) {
        this.criteriaRefundableInd = criteriaRefundableInd;
        return this;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public FinanceDetailCodes100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

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

    public FinanceDetailCodes100PutRequest withAmount(Double amount) {
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

    public FinanceDetailCodes100PutRequest withTypeInd(String typeInd) {
        this.typeInd = typeInd;
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

    public FinanceDetailCodes100PutRequest withPaytCode(String paytCode) {
        this.paytCode = paytCode;
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

    public FinanceDetailCodes100PutRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
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

    public FinanceDetailCodes100PutRequest withPriority(String priority) {
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

    public FinanceDetailCodes100PutRequest withDetailCode(String detailCode) {
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

    public FinanceDetailCodes100PutRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("criteria.dirdInd")
    public String getCriteriaDirdInd() {
        return criteriaDirdInd;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("criteria.dirdInd")
    public void setCriteriaDirdInd(String criteriaDirdInd) {
        this.criteriaDirdInd = criteriaDirdInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaDirdInd(String criteriaDirdInd) {
        this.criteriaDirdInd = criteriaDirdInd;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("criteria.receiptInd")
    public String getCriteriaReceiptInd() {
        return criteriaReceiptInd;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("criteria.receiptInd")
    public void setCriteriaReceiptInd(String criteriaReceiptInd) {
        this.criteriaReceiptInd = criteriaReceiptInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaReceiptInd(String criteriaReceiptInd) {
        this.criteriaReceiptInd = criteriaReceiptInd;
        return this;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("criteria.payhistInd")
    public String getCriteriaPayhistInd() {
        return criteriaPayhistInd;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("criteria.payhistInd")
    public void setCriteriaPayhistInd(String criteriaPayhistInd) {
        this.criteriaPayhistInd = criteriaPayhistInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaPayhistInd(String criteriaPayhistInd) {
        this.criteriaPayhistInd = criteriaPayhistInd;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public FinanceDetailCodes100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public String getCriteriaPriority() {
        return criteriaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public void setCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
    }

    public FinanceDetailCodes100PutRequest withCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
        return this;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public String getCriteriaRefundInd() {
        return criteriaRefundInd;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public void setCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
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

    public FinanceDetailCodes100PutRequest withTaxProfile(String taxProfile) {
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

    public FinanceDetailCodes100PutRequest withDcatCode(String dcatCode) {
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

    public FinanceDetailCodes100PutRequest withDirdInd(String dirdInd) {
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

    public FinanceDetailCodes100PutRequest withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    public String getCriteriaTypeInd() {
        return criteriaTypeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    public void setCriteriaTypeInd(String criteriaTypeInd) {
        this.criteriaTypeInd = criteriaTypeInd;
    }

    public FinanceDetailCodes100PutRequest withCriteriaTypeInd(String criteriaTypeInd) {
        this.criteriaTypeInd = criteriaTypeInd;
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

    public FinanceDetailCodes100PutRequest withTbbdetcDetailCode(String tbbdetcDetailCode) {
        this.tbbdetcDetailCode = tbbdetcDetailCode;
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

    public FinanceDetailCodes100PutRequest withTaxtCode(String taxtCode) {
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

    public FinanceDetailCodes100PutRequest withEffectiveDate(Date effectiveDate) {
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

    public FinanceDetailCodes100PutRequest withDesc(String desc) {
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

    public FinanceDetailCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("detailCodeInd");
        sb.append('=');
        sb.append(((this.detailCodeInd == null)?"<null>":this.detailCodeInd));
        sb.append(',');
        sb.append("criteriaDetailCodeInd");
        sb.append('=');
        sb.append(((this.criteriaDetailCodeInd == null)?"<null>":this.criteriaDetailCodeInd));
        sb.append(',');
        sb.append("criteriaDetcActiveInd");
        sb.append('=');
        sb.append(((this.criteriaDetcActiveInd == null)?"<null>":this.criteriaDetcActiveInd));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("criteriaDcatCode");
        sb.append('=');
        sb.append(((this.criteriaDcatCode == null)?"<null>":this.criteriaDcatCode));
        sb.append(',');
        sb.append("criteriaGlNosEnterable");
        sb.append('=');
        sb.append(((this.criteriaGlNosEnterable == null)?"<null>":this.criteriaGlNosEnterable));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaTaxtCode");
        sb.append('=');
        sb.append(((this.criteriaTaxtCode == null)?"<null>":this.criteriaTaxtCode));
        sb.append(',');
        sb.append("criteriaTaxProfile");
        sb.append('=');
        sb.append(((this.criteriaTaxProfile == null)?"<null>":this.criteriaTaxProfile));
        sb.append(',');
        sb.append("criteriaPaytCode");
        sb.append('=');
        sb.append(((this.criteriaPaytCode == null)?"<null>":this.criteriaPaytCode));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("criteriaTbbdetcDetailCode");
        sb.append('=');
        sb.append(((this.criteriaTbbdetcDetailCode == null)?"<null>":this.criteriaTbbdetcDetailCode));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("criteriaRefundableInd");
        sb.append('=');
        sb.append(((this.criteriaRefundableInd == null)?"<null>":this.criteriaRefundableInd));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
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
        sb.append("criteriaDirdInd");
        sb.append('=');
        sb.append(((this.criteriaDirdInd == null)?"<null>":this.criteriaDirdInd));
        sb.append(',');
        sb.append("criteriaReceiptInd");
        sb.append('=');
        sb.append(((this.criteriaReceiptInd == null)?"<null>":this.criteriaReceiptInd));
        sb.append(',');
        sb.append("criteriaPayhistInd");
        sb.append('=');
        sb.append(((this.criteriaPayhistInd == null)?"<null>":this.criteriaPayhistInd));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("criteriaRefundInd");
        sb.append('=');
        sb.append(((this.criteriaRefundInd == null)?"<null>":this.criteriaRefundInd));
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
        sb.append("criteriaTypeInd");
        sb.append('=');
        sb.append(((this.criteriaTypeInd == null)?"<null>":this.criteriaTypeInd));
        sb.append(',');
        sb.append("tbbdetcDetailCode");
        sb.append('=');
        sb.append(((this.tbbdetcDetailCode == null)?"<null>":this.tbbdetcDetailCode));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.criteriaPayhistInd == null)? 0 :this.criteriaPayhistInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetcActiveInd == null)? 0 :this.criteriaDetcActiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.criteriaPaytCode == null)? 0 :this.criteriaPaytCode.hashCode()));
        result = ((result* 31)+((this.criteriaTaxtCode == null)? 0 :this.criteriaTaxtCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.criteriaRefundableInd == null)? 0 :this.criteriaRefundableInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.criteriaTypeInd == null)? 0 :this.criteriaTypeInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptInd == null)? 0 :this.criteriaReceiptInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaDcatCode == null)? 0 :this.criteriaDcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.criteriaTaxProfile == null)? 0 :this.criteriaTaxProfile.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodeInd == null)? 0 :this.criteriaDetailCodeInd.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcDetailCode == null)? 0 :this.tbbdetcDetailCode.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaGlNosEnterable == null)? 0 :this.criteriaGlNosEnterable.hashCode()));
        result = ((result* 31)+((this.criteriaTbbdetcDetailCode == null)? 0 :this.criteriaTbbdetcDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaDirdInd == null)? 0 :this.criteriaDirdInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100PutRequest) == false) {
            return false;
        }
        FinanceDetailCodes100PutRequest rhs = ((FinanceDetailCodes100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.criteriaPayhistInd == rhs.criteriaPayhistInd)||((this.criteriaPayhistInd!= null)&&this.criteriaPayhistInd.equals(rhs.criteriaPayhistInd))))&&((this.criteriaDetcActiveInd == rhs.criteriaDetcActiveInd)||((this.criteriaDetcActiveInd!= null)&&this.criteriaDetcActiveInd.equals(rhs.criteriaDetcActiveInd))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.criteriaPaytCode == rhs.criteriaPaytCode)||((this.criteriaPaytCode!= null)&&this.criteriaPaytCode.equals(rhs.criteriaPaytCode))))&&((this.criteriaTaxtCode == rhs.criteriaTaxtCode)||((this.criteriaTaxtCode!= null)&&this.criteriaTaxtCode.equals(rhs.criteriaTaxtCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.criteriaRefundableInd == rhs.criteriaRefundableInd)||((this.criteriaRefundableInd!= null)&&this.criteriaRefundableInd.equals(rhs.criteriaRefundableInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.criteriaTypeInd == rhs.criteriaTypeInd)||((this.criteriaTypeInd!= null)&&this.criteriaTypeInd.equals(rhs.criteriaTypeInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.criteriaReceiptInd == rhs.criteriaReceiptInd)||((this.criteriaReceiptInd!= null)&&this.criteriaReceiptInd.equals(rhs.criteriaReceiptInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaDcatCode == rhs.criteriaDcatCode)||((this.criteriaDcatCode!= null)&&this.criteriaDcatCode.equals(rhs.criteriaDcatCode))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.criteriaTaxProfile == rhs.criteriaTaxProfile)||((this.criteriaTaxProfile!= null)&&this.criteriaTaxProfile.equals(rhs.criteriaTaxProfile))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.criteriaDetailCodeInd == rhs.criteriaDetailCodeInd)||((this.criteriaDetailCodeInd!= null)&&this.criteriaDetailCodeInd.equals(rhs.criteriaDetailCodeInd))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.tbbdetcDetailCode == rhs.tbbdetcDetailCode)||((this.tbbdetcDetailCode!= null)&&this.tbbdetcDetailCode.equals(rhs.tbbdetcDetailCode))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaGlNosEnterable == rhs.criteriaGlNosEnterable)||((this.criteriaGlNosEnterable!= null)&&this.criteriaGlNosEnterable.equals(rhs.criteriaGlNosEnterable))))&&((this.criteriaTbbdetcDetailCode == rhs.criteriaTbbdetcDetailCode)||((this.criteriaTbbdetcDetailCode!= null)&&this.criteriaTbbdetcDetailCode.equals(rhs.criteriaTbbdetcDetailCode))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.criteriaDirdInd == rhs.criteriaDirdInd)||((this.criteriaDirdInd!= null)&&this.criteriaDirdInd.equals(rhs.criteriaDirdInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
