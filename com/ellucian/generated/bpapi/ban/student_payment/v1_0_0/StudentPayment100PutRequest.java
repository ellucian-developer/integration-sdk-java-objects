
package com.ellucian.generated.bpapi.ban.student_payment.v1_0_0;

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
    "criteria.crossrefDetailCode",
    "criteria.paymentId",
    "keyblocTermCode",
    "documentNumber",
    "criteria.origChgInd",
    "criteria.desc",
    "holdPassword",
    "paymentId",
    "criteria.taxMethod",
    "criteria.srceCode",
    "criteria.tranNumberPaid",
    "id",
    "tranNumberPaid",
    "criteria.effectiveDate",
    "amount",
    "stspKeySequence",
    "criteria.crossrefNumber",
    "invNumberPaid",
    "criteria.taxAmount",
    "criteria.invNumberPaid",
    "detailCode",
    "criteria.stspKeySequence",
    "criteria.documentNumber",
    "criteria.crossrefDcatCode",
    "origChgInd",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class StudentPayment100PutRequest {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AMOUNT")
    private Double criteriaAmount;
    /**
     * Cross Reference Detail
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE")
    private String criteriaCrossrefDetailCode;
    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String criteriaPaymentId;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String criteriaOrigChgInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String criteriaDesc;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String paymentId;
    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
    /**
     * Source Code
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String criteriaSrceCode;
    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER_PAID")
    private Double criteriaTranNumberPaid;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER_PAID")
    private Double tranNumberPaid;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AMOUNT")
    private Double amount;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD")
    private Double stspKeySequence;
    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("criteria.crossrefNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_NUMBER")
    private Double criteriaCrossrefNumber;
    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String invNumberPaid;
    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    private Double criteriaTaxAmount;
    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String criteriaInvNumberPaid;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD")
    private Double criteriaStspKeySequence;
    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String criteriaDocumentNumber;
    /**
     * Cross Reference Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE")
    private String criteriaCrossrefDcatCode;
    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String origChgInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
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
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public StudentPayment100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public StudentPayment100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Cross Reference Detail
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    public String getCriteriaCrossrefDetailCode() {
        return criteriaCrossrefDetailCode;
    }

    /**
     * Cross Reference Detail
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    public void setCriteriaCrossrefDetailCode(String criteriaCrossrefDetailCode) {
        this.criteriaCrossrefDetailCode = criteriaCrossrefDetailCode;
    }

    public StudentPayment100PutRequest withCriteriaCrossrefDetailCode(String criteriaCrossrefDetailCode) {
        this.criteriaCrossrefDetailCode = criteriaCrossrefDetailCode;
        return this;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public String getCriteriaPaymentId() {
        return criteriaPaymentId;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public void setCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
    }

    public StudentPayment100PutRequest withCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public StudentPayment100PutRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public StudentPayment100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    public String getCriteriaOrigChgInd() {
        return criteriaOrigChgInd;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    public void setCriteriaOrigChgInd(String criteriaOrigChgInd) {
        this.criteriaOrigChgInd = criteriaOrigChgInd;
    }

    public StudentPayment100PutRequest withCriteriaOrigChgInd(String criteriaOrigChgInd) {
        this.criteriaOrigChgInd = criteriaOrigChgInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public StudentPayment100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public Object getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentPayment100PutRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public StudentPayment100PutRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    public String getCriteriaTaxMethod() {
        return criteriaTaxMethod;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    public void setCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
    }

    public StudentPayment100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
        return this;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    public String getCriteriaSrceCode() {
        return criteriaSrceCode;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    public void setCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
    }

    public StudentPayment100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
        return this;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    public Double getCriteriaTranNumberPaid() {
        return criteriaTranNumberPaid;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    public void setCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
    }

    public StudentPayment100PutRequest withCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public StudentPayment100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public Double getTranNumberPaid() {
        return tranNumberPaid;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public void setTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
    }

    public StudentPayment100PutRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public StudentPayment100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public StudentPayment100PutRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public StudentPayment100PutRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("criteria.crossrefNumber")
    public Double getCriteriaCrossrefNumber() {
        return criteriaCrossrefNumber;
    }

    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("criteria.crossrefNumber")
    public void setCriteriaCrossrefNumber(Double criteriaCrossrefNumber) {
        this.criteriaCrossrefNumber = criteriaCrossrefNumber;
    }

    public StudentPayment100PutRequest withCriteriaCrossrefNumber(Double criteriaCrossrefNumber) {
        this.criteriaCrossrefNumber = criteriaCrossrefNumber;
        return this;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public String getInvNumberPaid() {
        return invNumberPaid;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public StudentPayment100PutRequest withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
        return this;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    public Double getCriteriaTaxAmount() {
        return criteriaTaxAmount;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    public void setCriteriaTaxAmount(Double criteriaTaxAmount) {
        this.criteriaTaxAmount = criteriaTaxAmount;
    }

    public StudentPayment100PutRequest withCriteriaTaxAmount(Double criteriaTaxAmount) {
        this.criteriaTaxAmount = criteriaTaxAmount;
        return this;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    public String getCriteriaInvNumberPaid() {
        return criteriaInvNumberPaid;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    public void setCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
        this.criteriaInvNumberPaid = criteriaInvNumberPaid;
    }

    public StudentPayment100PutRequest withCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
        this.criteriaInvNumberPaid = criteriaInvNumberPaid;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
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
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public StudentPayment100PutRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public Double getCriteriaStspKeySequence() {
        return criteriaStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public void setCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
    }

    public StudentPayment100PutRequest withCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public String getCriteriaDocumentNumber() {
        return criteriaDocumentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public void setCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
    }

    public StudentPayment100PutRequest withCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
        return this;
    }

    /**
     * Cross Reference Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    public String getCriteriaCrossrefDcatCode() {
        return criteriaCrossrefDcatCode;
    }

    /**
     * Cross Reference Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    public void setCriteriaCrossrefDcatCode(String criteriaCrossrefDcatCode) {
        this.criteriaCrossrefDcatCode = criteriaCrossrefDcatCode;
    }

    public StudentPayment100PutRequest withCriteriaCrossrefDcatCode(String criteriaCrossrefDcatCode) {
        this.criteriaCrossrefDcatCode = criteriaCrossrefDcatCode;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public String getOrigChgInd() {
        return origChgInd;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public void setOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
    }

    public StudentPayment100PutRequest withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public StudentPayment100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentPayment100PutRequest withDesc(String desc) {
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

    public StudentPayment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentPayment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("criteriaCrossrefDetailCode");
        sb.append('=');
        sb.append(((this.criteriaCrossrefDetailCode == null)?"<null>":this.criteriaCrossrefDetailCode));
        sb.append(',');
        sb.append("criteriaPaymentId");
        sb.append('=');
        sb.append(((this.criteriaPaymentId == null)?"<null>":this.criteriaPaymentId));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaOrigChgInd");
        sb.append('=');
        sb.append(((this.criteriaOrigChgInd == null)?"<null>":this.criteriaOrigChgInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("criteriaSrceCode");
        sb.append('=');
        sb.append(((this.criteriaSrceCode == null)?"<null>":this.criteriaSrceCode));
        sb.append(',');
        sb.append("criteriaTranNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaTranNumberPaid == null)?"<null>":this.criteriaTranNumberPaid));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("criteriaCrossrefNumber");
        sb.append('=');
        sb.append(((this.criteriaCrossrefNumber == null)?"<null>":this.criteriaCrossrefNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("criteriaTaxAmount");
        sb.append('=');
        sb.append(((this.criteriaTaxAmount == null)?"<null>":this.criteriaTaxAmount));
        sb.append(',');
        sb.append("criteriaInvNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaInvNumberPaid == null)?"<null>":this.criteriaInvNumberPaid));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaDocumentNumber == null)?"<null>":this.criteriaDocumentNumber));
        sb.append(',');
        sb.append("criteriaCrossrefDcatCode");
        sb.append('=');
        sb.append(((this.criteriaCrossrefDcatCode == null)?"<null>":this.criteriaCrossrefDcatCode));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
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
        result = ((result* 31)+((this.criteriaCrossrefDetailCode == null)? 0 :this.criteriaCrossrefDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefDcatCode == null)? 0 :this.criteriaCrossrefDcatCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumberPaid == null)? 0 :this.criteriaTranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaDocumentNumber == null)? 0 :this.criteriaDocumentNumber.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.criteriaInvNumberPaid == null)? 0 :this.criteriaInvNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaTaxAmount == null)? 0 :this.criteriaTaxAmount.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigChgInd == null)? 0 :this.criteriaOrigChgInd.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefNumber == null)? 0 :this.criteriaCrossrefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPaymentId == null)? 0 :this.criteriaPaymentId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentPayment100PutRequest) == false) {
            return false;
        }
        StudentPayment100PutRequest rhs = ((StudentPayment100PutRequest) other);
        return (((((((((((((((((((((((((((((((this.criteriaCrossrefDetailCode == rhs.criteriaCrossrefDetailCode)||((this.criteriaCrossrefDetailCode!= null)&&this.criteriaCrossrefDetailCode.equals(rhs.criteriaCrossrefDetailCode)))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.criteriaCrossrefDcatCode == rhs.criteriaCrossrefDcatCode)||((this.criteriaCrossrefDcatCode!= null)&&this.criteriaCrossrefDcatCode.equals(rhs.criteriaCrossrefDcatCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaTranNumberPaid == rhs.criteriaTranNumberPaid)||((this.criteriaTranNumberPaid!= null)&&this.criteriaTranNumberPaid.equals(rhs.criteriaTranNumberPaid))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.criteriaDocumentNumber == rhs.criteriaDocumentNumber)||((this.criteriaDocumentNumber!= null)&&this.criteriaDocumentNumber.equals(rhs.criteriaDocumentNumber))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.criteriaInvNumberPaid == rhs.criteriaInvNumberPaid)||((this.criteriaInvNumberPaid!= null)&&this.criteriaInvNumberPaid.equals(rhs.criteriaInvNumberPaid))))&&((this.criteriaTaxAmount == rhs.criteriaTaxAmount)||((this.criteriaTaxAmount!= null)&&this.criteriaTaxAmount.equals(rhs.criteriaTaxAmount))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaOrigChgInd == rhs.criteriaOrigChgInd)||((this.criteriaOrigChgInd!= null)&&this.criteriaOrigChgInd.equals(rhs.criteriaOrigChgInd))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaCrossrefNumber == rhs.criteriaCrossrefNumber)||((this.criteriaCrossrefNumber!= null)&&this.criteriaCrossrefNumber.equals(rhs.criteriaCrossrefNumber))))&&((this.criteriaPaymentId == rhs.criteriaPaymentId)||((this.criteriaPaymentId!= null)&&this.criteriaPaymentId.equals(rhs.criteriaPaymentId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
