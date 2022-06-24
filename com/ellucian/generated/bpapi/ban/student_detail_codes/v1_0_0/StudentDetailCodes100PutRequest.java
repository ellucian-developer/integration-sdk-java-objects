
package com.ellucian.generated.bpapi.ban.student_detail_codes.v1_0_0;

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
    "criteria.tbdcInd",
    "criteria.detailCode",
    "criteria.amount",
    "currCode",
    "detailCodeInd",
    "criteria.detcActiveInd",
    "taxMethod",
    "payhistInd",
    "criteria.glNosEnterable",
    "criteria.desc",
    "criteria.taxtCode",
    "tivInd",
    "tbdcInd",
    "criteria.tivInd",
    "criteria.paytCode",
    "glNosEnterable",
    "refundInd",
    "priority",
    "likeAidyInd",
    "receiptInd",
    "criteria.dirdInd",
    "criteria.receiptInd",
    "criteria.priority",
    "criteria.refundInd",
    "refundableInd",
    "criteria.typeInd",
    "nonAllowChgInd",
    "taxtCode",
    "desc",
    "criteria.prebillPrintInd",
    "criteria.detailCodeInd",
    "detcActiveInd",
    "criteria.likeAidyInd",
    "criteria.dcatCode",
    "criteria.termCode",
    "prebillPrintInd",
    "criteria.taxProfile",
    "criteria.likeTermInd",
    "likeTermInd",
    "criteria.taxMethod",
    "criteria.refundableInd",
    "criteria.abdcInd",
    "criteria.effectiveDate",
    "likeScpInd",
    "criteria.likePeriodInd",
    "amount",
    "typeInd",
    "paytCode",
    "criteria.likeScpInd",
    "criteria.instChgInd",
    "likePeriodInd",
    "detailCode",
    "criteria.payhistInd",
    "criteria.currCode",
    "criteria.nonAllowChgInd",
    "taxProfile",
    "dcatCode",
    "dirdInd",
    "abdcInd",
    "instChgInd",
    "effectiveDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentDetailCodes100PutRequest {

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("criteria.tbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TBDC_IND")
    private String criteriaTbdcInd;
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
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String payhistInd;
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
    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TIV_IND")
    private String tivInd;
    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TBDC_IND")
    private String tbdcInd;
    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("criteria.tivInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TIV_IND")
    private String criteriaTivInd;
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
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_AIDY_IND")
    private String likeAidyInd;
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
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("nonAllowChgInd")
    private String nonAllowChgInd;
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
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String desc;
    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.prebillPrintInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PREBILL_PRINT_IND")
    private String criteriaPrebillPrintInd;
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
    @JsonProperty("detcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETC_ACTIVE_IND")
    private String detcActiveInd;
    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("criteria.likeAidyInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_AIDY_IND")
    private String criteriaLikeAidyInd;
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
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PREBILL_PRINT_IND")
    private String prebillPrintInd;
    @JsonProperty("criteria.taxProfile")
    private String criteriaTaxProfile;
    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("criteria.likeTermInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_TERM_IND")
    private String criteriaLikeTermInd;
    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_TERM_IND")
    private String likeTermInd;
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
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
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("criteria.abdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_ABDC_IND")
    private String criteriaAbdcInd;
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
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    private String likeScpInd;
    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("criteria.likePeriodInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_PERIOD_IND")
    private String criteriaLikePeriodInd;
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
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.likeScpInd")
    private String criteriaLikeScpInd;
    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("criteria.instChgInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_INST_CHG_IND")
    private String criteriaInstChgInd;
    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_PERIOD_IND")
    private String likePeriodInd;
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
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nonAllowChgInd")
    private String criteriaNonAllowChgInd;
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
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_ABDC_IND")
    private String abdcInd;
    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_INST_CHG_IND")
    private String instChgInd;
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
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("criteria.tbdcInd")
    public String getCriteriaTbdcInd() {
        return criteriaTbdcInd;
    }

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("criteria.tbdcInd")
    public void setCriteriaTbdcInd(String criteriaTbdcInd) {
        this.criteriaTbdcInd = criteriaTbdcInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaTbdcInd(String criteriaTbdcInd) {
        this.criteriaTbdcInd = criteriaTbdcInd;
        return this;
    }

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

    public StudentDetailCodes100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
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

    public StudentDetailCodes100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public StudentDetailCodes100PutRequest withCurrCode(String currCode) {
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

    public StudentDetailCodes100PutRequest withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
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

    public StudentDetailCodes100PutRequest withCriteriaDetcActiveInd(String criteriaDetcActiveInd) {
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

    public StudentDetailCodes100PutRequest withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
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

    public StudentDetailCodes100PutRequest withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
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

    public StudentDetailCodes100PutRequest withCriteriaGlNosEnterable(String criteriaGlNosEnterable) {
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

    public StudentDetailCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
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

    public StudentDetailCodes100PutRequest withCriteriaTaxtCode(String criteriaTaxtCode) {
        this.criteriaTaxtCode = criteriaTaxtCode;
        return this;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    public String getTivInd() {
        return tivInd;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    public void setTivInd(String tivInd) {
        this.tivInd = tivInd;
    }

    public StudentDetailCodes100PutRequest withTivInd(String tivInd) {
        this.tivInd = tivInd;
        return this;
    }

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public String getTbdcInd() {
        return tbdcInd;
    }

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public void setTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
    }

    public StudentDetailCodes100PutRequest withTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
        return this;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("criteria.tivInd")
    public String getCriteriaTivInd() {
        return criteriaTivInd;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("criteria.tivInd")
    public void setCriteriaTivInd(String criteriaTivInd) {
        this.criteriaTivInd = criteriaTivInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaTivInd(String criteriaTivInd) {
        this.criteriaTivInd = criteriaTivInd;
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

    public StudentDetailCodes100PutRequest withCriteriaPaytCode(String criteriaPaytCode) {
        this.criteriaPaytCode = criteriaPaytCode;
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

    public StudentDetailCodes100PutRequest withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
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

    public StudentDetailCodes100PutRequest withRefundInd(String refundInd) {
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

    public StudentDetailCodes100PutRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    public String getLikeAidyInd() {
        return likeAidyInd;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    public void setLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
    }

    public StudentDetailCodes100PutRequest withLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
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

    public StudentDetailCodes100PutRequest withReceiptInd(String receiptInd) {
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

    public StudentDetailCodes100PutRequest withCriteriaDirdInd(String criteriaDirdInd) {
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

    public StudentDetailCodes100PutRequest withCriteriaReceiptInd(String criteriaReceiptInd) {
        this.criteriaReceiptInd = criteriaReceiptInd;
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

    public StudentDetailCodes100PutRequest withCriteriaPriority(String criteriaPriority) {
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

    public StudentDetailCodes100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
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

    public StudentDetailCodes100PutRequest withRefundableInd(String refundableInd) {
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

    public StudentDetailCodes100PutRequest withCriteriaTypeInd(String criteriaTypeInd) {
        this.criteriaTypeInd = criteriaTypeInd;
        return this;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("nonAllowChgInd")
    public String getNonAllowChgInd() {
        return nonAllowChgInd;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("nonAllowChgInd")
    public void setNonAllowChgInd(String nonAllowChgInd) {
        this.nonAllowChgInd = nonAllowChgInd;
    }

    public StudentDetailCodes100PutRequest withNonAllowChgInd(String nonAllowChgInd) {
        this.nonAllowChgInd = nonAllowChgInd;
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

    public StudentDetailCodes100PutRequest withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
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

    public StudentDetailCodes100PutRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.prebillPrintInd")
    public String getCriteriaPrebillPrintInd() {
        return criteriaPrebillPrintInd;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.prebillPrintInd")
    public void setCriteriaPrebillPrintInd(String criteriaPrebillPrintInd) {
        this.criteriaPrebillPrintInd = criteriaPrebillPrintInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaPrebillPrintInd(String criteriaPrebillPrintInd) {
        this.criteriaPrebillPrintInd = criteriaPrebillPrintInd;
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

    public StudentDetailCodes100PutRequest withCriteriaDetailCodeInd(String criteriaDetailCodeInd) {
        this.criteriaDetailCodeInd = criteriaDetailCodeInd;
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

    public StudentDetailCodes100PutRequest withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("criteria.likeAidyInd")
    public String getCriteriaLikeAidyInd() {
        return criteriaLikeAidyInd;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("criteria.likeAidyInd")
    public void setCriteriaLikeAidyInd(String criteriaLikeAidyInd) {
        this.criteriaLikeAidyInd = criteriaLikeAidyInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaLikeAidyInd(String criteriaLikeAidyInd) {
        this.criteriaLikeAidyInd = criteriaLikeAidyInd;
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

    public StudentDetailCodes100PutRequest withCriteriaDcatCode(String criteriaDcatCode) {
        this.criteriaDcatCode = criteriaDcatCode;
        return this;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentDetailCodes100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public String getPrebillPrintInd() {
        return prebillPrintInd;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public void setPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
    }

    public StudentDetailCodes100PutRequest withPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
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

    public StudentDetailCodes100PutRequest withCriteriaTaxProfile(String criteriaTaxProfile) {
        this.criteriaTaxProfile = criteriaTaxProfile;
        return this;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("criteria.likeTermInd")
    public String getCriteriaLikeTermInd() {
        return criteriaLikeTermInd;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("criteria.likeTermInd")
    public void setCriteriaLikeTermInd(String criteriaLikeTermInd) {
        this.criteriaLikeTermInd = criteriaLikeTermInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaLikeTermInd(String criteriaLikeTermInd) {
        this.criteriaLikeTermInd = criteriaLikeTermInd;
        return this;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public String getLikeTermInd() {
        return likeTermInd;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public void setLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
    }

    public StudentDetailCodes100PutRequest withLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
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

    public StudentDetailCodes100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
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

    public StudentDetailCodes100PutRequest withCriteriaRefundableInd(String criteriaRefundableInd) {
        this.criteriaRefundableInd = criteriaRefundableInd;
        return this;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("criteria.abdcInd")
    public String getCriteriaAbdcInd() {
        return criteriaAbdcInd;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("criteria.abdcInd")
    public void setCriteriaAbdcInd(String criteriaAbdcInd) {
        this.criteriaAbdcInd = criteriaAbdcInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaAbdcInd(String criteriaAbdcInd) {
        this.criteriaAbdcInd = criteriaAbdcInd;
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

    public StudentDetailCodes100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public String getLikeScpInd() {
        return likeScpInd;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public void setLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
    }

    public StudentDetailCodes100PutRequest withLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
        return this;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("criteria.likePeriodInd")
    public String getCriteriaLikePeriodInd() {
        return criteriaLikePeriodInd;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("criteria.likePeriodInd")
    public void setCriteriaLikePeriodInd(String criteriaLikePeriodInd) {
        this.criteriaLikePeriodInd = criteriaLikePeriodInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaLikePeriodInd(String criteriaLikePeriodInd) {
        this.criteriaLikePeriodInd = criteriaLikePeriodInd;
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

    public StudentDetailCodes100PutRequest withAmount(Double amount) {
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

    public StudentDetailCodes100PutRequest withTypeInd(String typeInd) {
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

    public StudentDetailCodes100PutRequest withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.likeScpInd")
    public String getCriteriaLikeScpInd() {
        return criteriaLikeScpInd;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.likeScpInd")
    public void setCriteriaLikeScpInd(String criteriaLikeScpInd) {
        this.criteriaLikeScpInd = criteriaLikeScpInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaLikeScpInd(String criteriaLikeScpInd) {
        this.criteriaLikeScpInd = criteriaLikeScpInd;
        return this;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("criteria.instChgInd")
    public String getCriteriaInstChgInd() {
        return criteriaInstChgInd;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("criteria.instChgInd")
    public void setCriteriaInstChgInd(String criteriaInstChgInd) {
        this.criteriaInstChgInd = criteriaInstChgInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaInstChgInd(String criteriaInstChgInd) {
        this.criteriaInstChgInd = criteriaInstChgInd;
        return this;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    public String getLikePeriodInd() {
        return likePeriodInd;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    public void setLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
    }

    public StudentDetailCodes100PutRequest withLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
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

    public StudentDetailCodes100PutRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public StudentDetailCodes100PutRequest withCriteriaPayhistInd(String criteriaPayhistInd) {
        this.criteriaPayhistInd = criteriaPayhistInd;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public StudentDetailCodes100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
        return this;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nonAllowChgInd")
    public String getCriteriaNonAllowChgInd() {
        return criteriaNonAllowChgInd;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nonAllowChgInd")
    public void setCriteriaNonAllowChgInd(String criteriaNonAllowChgInd) {
        this.criteriaNonAllowChgInd = criteriaNonAllowChgInd;
    }

    public StudentDetailCodes100PutRequest withCriteriaNonAllowChgInd(String criteriaNonAllowChgInd) {
        this.criteriaNonAllowChgInd = criteriaNonAllowChgInd;
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

    public StudentDetailCodes100PutRequest withTaxProfile(String taxProfile) {
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

    public StudentDetailCodes100PutRequest withDcatCode(String dcatCode) {
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

    public StudentDetailCodes100PutRequest withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
        return this;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public String getAbdcInd() {
        return abdcInd;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public void setAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
    }

    public StudentDetailCodes100PutRequest withAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
        return this;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    public String getInstChgInd() {
        return instChgInd;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    public void setInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
    }

    public StudentDetailCodes100PutRequest withInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
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

    public StudentDetailCodes100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentDetailCodes100PutRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public StudentDetailCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentDetailCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTbdcInd");
        sb.append('=');
        sb.append(((this.criteriaTbdcInd == null)?"<null>":this.criteriaTbdcInd));
        sb.append(',');
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
        sb.append("criteriaDetcActiveInd");
        sb.append('=');
        sb.append(((this.criteriaDetcActiveInd == null)?"<null>":this.criteriaDetcActiveInd));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
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
        sb.append("tivInd");
        sb.append('=');
        sb.append(((this.tivInd == null)?"<null>":this.tivInd));
        sb.append(',');
        sb.append("tbdcInd");
        sb.append('=');
        sb.append(((this.tbdcInd == null)?"<null>":this.tbdcInd));
        sb.append(',');
        sb.append("criteriaTivInd");
        sb.append('=');
        sb.append(((this.criteriaTivInd == null)?"<null>":this.criteriaTivInd));
        sb.append(',');
        sb.append("criteriaPaytCode");
        sb.append('=');
        sb.append(((this.criteriaPaytCode == null)?"<null>":this.criteriaPaytCode));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("likeAidyInd");
        sb.append('=');
        sb.append(((this.likeAidyInd == null)?"<null>":this.likeAidyInd));
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
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("criteriaRefundInd");
        sb.append('=');
        sb.append(((this.criteriaRefundInd == null)?"<null>":this.criteriaRefundInd));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("criteriaTypeInd");
        sb.append('=');
        sb.append(((this.criteriaTypeInd == null)?"<null>":this.criteriaTypeInd));
        sb.append(',');
        sb.append("nonAllowChgInd");
        sb.append('=');
        sb.append(((this.nonAllowChgInd == null)?"<null>":this.nonAllowChgInd));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("criteriaPrebillPrintInd");
        sb.append('=');
        sb.append(((this.criteriaPrebillPrintInd == null)?"<null>":this.criteriaPrebillPrintInd));
        sb.append(',');
        sb.append("criteriaDetailCodeInd");
        sb.append('=');
        sb.append(((this.criteriaDetailCodeInd == null)?"<null>":this.criteriaDetailCodeInd));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("criteriaLikeAidyInd");
        sb.append('=');
        sb.append(((this.criteriaLikeAidyInd == null)?"<null>":this.criteriaLikeAidyInd));
        sb.append(',');
        sb.append("criteriaDcatCode");
        sb.append('=');
        sb.append(((this.criteriaDcatCode == null)?"<null>":this.criteriaDcatCode));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("prebillPrintInd");
        sb.append('=');
        sb.append(((this.prebillPrintInd == null)?"<null>":this.prebillPrintInd));
        sb.append(',');
        sb.append("criteriaTaxProfile");
        sb.append('=');
        sb.append(((this.criteriaTaxProfile == null)?"<null>":this.criteriaTaxProfile));
        sb.append(',');
        sb.append("criteriaLikeTermInd");
        sb.append('=');
        sb.append(((this.criteriaLikeTermInd == null)?"<null>":this.criteriaLikeTermInd));
        sb.append(',');
        sb.append("likeTermInd");
        sb.append('=');
        sb.append(((this.likeTermInd == null)?"<null>":this.likeTermInd));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("criteriaRefundableInd");
        sb.append('=');
        sb.append(((this.criteriaRefundableInd == null)?"<null>":this.criteriaRefundableInd));
        sb.append(',');
        sb.append("criteriaAbdcInd");
        sb.append('=');
        sb.append(((this.criteriaAbdcInd == null)?"<null>":this.criteriaAbdcInd));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("likeScpInd");
        sb.append('=');
        sb.append(((this.likeScpInd == null)?"<null>":this.likeScpInd));
        sb.append(',');
        sb.append("criteriaLikePeriodInd");
        sb.append('=');
        sb.append(((this.criteriaLikePeriodInd == null)?"<null>":this.criteriaLikePeriodInd));
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
        sb.append("criteriaLikeScpInd");
        sb.append('=');
        sb.append(((this.criteriaLikeScpInd == null)?"<null>":this.criteriaLikeScpInd));
        sb.append(',');
        sb.append("criteriaInstChgInd");
        sb.append('=');
        sb.append(((this.criteriaInstChgInd == null)?"<null>":this.criteriaInstChgInd));
        sb.append(',');
        sb.append("likePeriodInd");
        sb.append('=');
        sb.append(((this.likePeriodInd == null)?"<null>":this.likePeriodInd));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("criteriaPayhistInd");
        sb.append('=');
        sb.append(((this.criteriaPayhistInd == null)?"<null>":this.criteriaPayhistInd));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("criteriaNonAllowChgInd");
        sb.append('=');
        sb.append(((this.criteriaNonAllowChgInd == null)?"<null>":this.criteriaNonAllowChgInd));
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
        sb.append("abdcInd");
        sb.append('=');
        sb.append(((this.abdcInd == null)?"<null>":this.abdcInd));
        sb.append(',');
        sb.append("instChgInd");
        sb.append('=');
        sb.append(((this.instChgInd == null)?"<null>":this.instChgInd));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.criteriaLikeTermInd == null)? 0 :this.criteriaLikeTermInd.hashCode()));
        result = ((result* 31)+((this.criteriaAbdcInd == null)? 0 :this.criteriaAbdcInd.hashCode()));
        result = ((result* 31)+((this.tivInd == null)? 0 :this.tivInd.hashCode()));
        result = ((result* 31)+((this.tbdcInd == null)? 0 :this.tbdcInd.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.criteriaLikeScpInd == null)? 0 :this.criteriaLikeScpInd.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.criteriaNonAllowChgInd == null)? 0 :this.criteriaNonAllowChgInd.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaLikePeriodInd == null)? 0 :this.criteriaLikePeriodInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.likeAidyInd == null)? 0 :this.likeAidyInd.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaPrebillPrintInd == null)? 0 :this.criteriaPrebillPrintInd.hashCode()));
        result = ((result* 31)+((this.criteriaDcatCode == null)? 0 :this.criteriaDcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaTaxProfile == null)? 0 :this.criteriaTaxProfile.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.nonAllowChgInd == null)? 0 :this.nonAllowChgInd.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaGlNosEnterable == null)? 0 :this.criteriaGlNosEnterable.hashCode()));
        result = ((result* 31)+((this.criteriaInstChgInd == null)? 0 :this.criteriaInstChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.criteriaLikeAidyInd == null)? 0 :this.criteriaLikeAidyInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.criteriaTivInd == null)? 0 :this.criteriaTivInd.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaPayhistInd == null)? 0 :this.criteriaPayhistInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetcActiveInd == null)? 0 :this.criteriaDetcActiveInd.hashCode()));
        result = ((result* 31)+((this.prebillPrintInd == null)? 0 :this.prebillPrintInd.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.likeTermInd == null)? 0 :this.likeTermInd.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.criteriaPaytCode == null)? 0 :this.criteriaPaytCode.hashCode()));
        result = ((result* 31)+((this.likeScpInd == null)? 0 :this.likeScpInd.hashCode()));
        result = ((result* 31)+((this.criteriaTaxtCode == null)? 0 :this.criteriaTaxtCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.criteriaRefundableInd == null)? 0 :this.criteriaRefundableInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.criteriaTypeInd == null)? 0 :this.criteriaTypeInd.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptInd == null)? 0 :this.criteriaReceiptInd.hashCode()));
        result = ((result* 31)+((this.likePeriodInd == null)? 0 :this.likePeriodInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.criteriaTbdcInd == null)? 0 :this.criteriaTbdcInd.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodeInd == null)? 0 :this.criteriaDetailCodeInd.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.abdcInd == null)? 0 :this.abdcInd.hashCode()));
        result = ((result* 31)+((this.instChgInd == null)? 0 :this.instChgInd.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaDirdInd == null)? 0 :this.criteriaDirdInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentDetailCodes100PutRequest) == false) {
            return false;
        }
        StudentDetailCodes100PutRequest rhs = ((StudentDetailCodes100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.criteriaLikeTermInd == rhs.criteriaLikeTermInd)||((this.criteriaLikeTermInd!= null)&&this.criteriaLikeTermInd.equals(rhs.criteriaLikeTermInd))))&&((this.criteriaAbdcInd == rhs.criteriaAbdcInd)||((this.criteriaAbdcInd!= null)&&this.criteriaAbdcInd.equals(rhs.criteriaAbdcInd))))&&((this.tivInd == rhs.tivInd)||((this.tivInd!= null)&&this.tivInd.equals(rhs.tivInd))))&&((this.tbdcInd == rhs.tbdcInd)||((this.tbdcInd!= null)&&this.tbdcInd.equals(rhs.tbdcInd))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.criteriaLikeScpInd == rhs.criteriaLikeScpInd)||((this.criteriaLikeScpInd!= null)&&this.criteriaLikeScpInd.equals(rhs.criteriaLikeScpInd))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.criteriaNonAllowChgInd == rhs.criteriaNonAllowChgInd)||((this.criteriaNonAllowChgInd!= null)&&this.criteriaNonAllowChgInd.equals(rhs.criteriaNonAllowChgInd))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.criteriaLikePeriodInd == rhs.criteriaLikePeriodInd)||((this.criteriaLikePeriodInd!= null)&&this.criteriaLikePeriodInd.equals(rhs.criteriaLikePeriodInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.likeAidyInd == rhs.likeAidyInd)||((this.likeAidyInd!= null)&&this.likeAidyInd.equals(rhs.likeAidyInd))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaPrebillPrintInd == rhs.criteriaPrebillPrintInd)||((this.criteriaPrebillPrintInd!= null)&&this.criteriaPrebillPrintInd.equals(rhs.criteriaPrebillPrintInd))))&&((this.criteriaDcatCode == rhs.criteriaDcatCode)||((this.criteriaDcatCode!= null)&&this.criteriaDcatCode.equals(rhs.criteriaDcatCode))))&&((this.criteriaTaxProfile == rhs.criteriaTaxProfile)||((this.criteriaTaxProfile!= null)&&this.criteriaTaxProfile.equals(rhs.criteriaTaxProfile))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.nonAllowChgInd == rhs.nonAllowChgInd)||((this.nonAllowChgInd!= null)&&this.nonAllowChgInd.equals(rhs.nonAllowChgInd))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaGlNosEnterable == rhs.criteriaGlNosEnterable)||((this.criteriaGlNosEnterable!= null)&&this.criteriaGlNosEnterable.equals(rhs.criteriaGlNosEnterable))))&&((this.criteriaInstChgInd == rhs.criteriaInstChgInd)||((this.criteriaInstChgInd!= null)&&this.criteriaInstChgInd.equals(rhs.criteriaInstChgInd))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.criteriaLikeAidyInd == rhs.criteriaLikeAidyInd)||((this.criteriaLikeAidyInd!= null)&&this.criteriaLikeAidyInd.equals(rhs.criteriaLikeAidyInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.criteriaTivInd == rhs.criteriaTivInd)||((this.criteriaTivInd!= null)&&this.criteriaTivInd.equals(rhs.criteriaTivInd))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.criteriaPayhistInd == rhs.criteriaPayhistInd)||((this.criteriaPayhistInd!= null)&&this.criteriaPayhistInd.equals(rhs.criteriaPayhistInd))))&&((this.criteriaDetcActiveInd == rhs.criteriaDetcActiveInd)||((this.criteriaDetcActiveInd!= null)&&this.criteriaDetcActiveInd.equals(rhs.criteriaDetcActiveInd))))&&((this.prebillPrintInd == rhs.prebillPrintInd)||((this.prebillPrintInd!= null)&&this.prebillPrintInd.equals(rhs.prebillPrintInd))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.likeTermInd == rhs.likeTermInd)||((this.likeTermInd!= null)&&this.likeTermInd.equals(rhs.likeTermInd))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.criteriaPaytCode == rhs.criteriaPaytCode)||((this.criteriaPaytCode!= null)&&this.criteriaPaytCode.equals(rhs.criteriaPaytCode))))&&((this.likeScpInd == rhs.likeScpInd)||((this.likeScpInd!= null)&&this.likeScpInd.equals(rhs.likeScpInd))))&&((this.criteriaTaxtCode == rhs.criteriaTaxtCode)||((this.criteriaTaxtCode!= null)&&this.criteriaTaxtCode.equals(rhs.criteriaTaxtCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.criteriaRefundableInd == rhs.criteriaRefundableInd)||((this.criteriaRefundableInd!= null)&&this.criteriaRefundableInd.equals(rhs.criteriaRefundableInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.criteriaTypeInd == rhs.criteriaTypeInd)||((this.criteriaTypeInd!= null)&&this.criteriaTypeInd.equals(rhs.criteriaTypeInd))))&&((this.criteriaReceiptInd == rhs.criteriaReceiptInd)||((this.criteriaReceiptInd!= null)&&this.criteriaReceiptInd.equals(rhs.criteriaReceiptInd))))&&((this.likePeriodInd == rhs.likePeriodInd)||((this.likePeriodInd!= null)&&this.likePeriodInd.equals(rhs.likePeriodInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.criteriaTbdcInd == rhs.criteriaTbdcInd)||((this.criteriaTbdcInd!= null)&&this.criteriaTbdcInd.equals(rhs.criteriaTbdcInd))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.criteriaDetailCodeInd == rhs.criteriaDetailCodeInd)||((this.criteriaDetailCodeInd!= null)&&this.criteriaDetailCodeInd.equals(rhs.criteriaDetailCodeInd))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.abdcInd == rhs.abdcInd)||((this.abdcInd!= null)&&this.abdcInd.equals(rhs.abdcInd))))&&((this.instChgInd == rhs.instChgInd)||((this.instChgInd!= null)&&this.instChgInd.equals(rhs.instChgInd))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.criteriaDirdInd == rhs.criteriaDirdInd)||((this.criteriaDirdInd!= null)&&this.criteriaDirdInd.equals(rhs.criteriaDirdInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
