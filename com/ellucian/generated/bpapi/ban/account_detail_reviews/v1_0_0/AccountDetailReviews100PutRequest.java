
package com.ellucian.generated.bpapi.ban.account_detail_reviews.v1_0_0;

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
    "documentNumber",
    "criteria.sessionNumber",
    "criteria.origChgInd",
    "criteria.termCode",
    "criteria.desc",
    "criteria.paymentAmount",
    "criteria.tranNumber",
    "holdPassword",
    "criteria.taxMethod",
    "criteria.srceCode",
    "criteria.cpdtInd",
    "acctFeedInd",
    "criteria.tranNumberPaid",
    "criteria.acctFeedInd",
    "id",
    "criteria.currCodeV",
    "tranNumberPaid",
    "criteria.effectiveDate",
    "criteria.period",
    "criteria.chargeAmount",
    "criteria.balance",
    "criteria.transDate",
    "invNumberPaid",
    "criteria.taxAmount",
    "criteria.invNumberPaid",
    "criteria.stspKeySequence",
    "criteria.user",
    "criteria.documentNumber",
    "origChgInd",
    "criteria.entryDate",
    "criteria.cshrEndDate",
    "criteria.aidyCode",
    "criteria.feedDocCode",
    "criteria.invoiceNumber",
    "cpdtInd",
    "criteria.feedDate",
    "effectiveDate",
    "criteria.receiptNumber",
    "desc"
})
@Generated("jsonschema2pojo")
public class AccountDetailReviews100PutRequest {

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
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SESSION_NUMBER")
    private Double criteriaSessionNumber;
    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String criteriaOrigChgInd;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
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
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentAmount")
    private Double criteriaPaymentAmount;
    /**
     * Trans Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER")
    private Double criteriaTranNumber;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private String holdPassword;
    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String criteriaSrceCode;
    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String criteriaCpdtInd;
    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ACCT_FEED_IND")
    private String acctFeedInd;
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
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("criteria.acctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ACCT_FEED_IND")
    private String criteriaAcctFeedInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCodeV")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCodeV;
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PERIOD")
    private String criteriaPeriod;
    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.chargeAmount")
    private Double criteriaChargeAmount;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BALANCE")
    private Double criteriaBalance;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRANS_DATE")
    private Date criteriaTransDate;
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
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE, Lookup lineage reference object : TBRACCD")
    private Double criteriaStspKeySequence;
    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("criteria.user")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_USER")
    private String criteriaUser;
    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String criteriaDocumentNumber;
    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String origChgInd;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ENTRY_DATE")
    private Date criteriaEntryDate;
    /**
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CSHR_END_DATE")
    private Date criteriaCshrEndDate;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AIDY_CODE")
    private String criteriaAidyCode;
    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("criteria.feedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DOC_CODE")
    private String criteriaFeedDocCode;
    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String criteriaInvoiceNumber;
    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String cpdtInd;
    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("criteria.feedDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DATE")
    private Date criteriaFeedDate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RECEIPT_NUMBER")
    private Double criteriaReceiptNumber;
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

    public AccountDetailReviews100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public AccountDetailReviews100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    public Double getCriteriaSessionNumber() {
        return criteriaSessionNumber;
    }

    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    public void setCriteriaSessionNumber(Double criteriaSessionNumber) {
        this.criteriaSessionNumber = criteriaSessionNumber;
    }

    public AccountDetailReviews100PutRequest withCriteriaSessionNumber(Double criteriaSessionNumber) {
        this.criteriaSessionNumber = criteriaSessionNumber;
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

    public AccountDetailReviews100PutRequest withCriteriaOrigChgInd(String criteriaOrigChgInd) {
        this.criteriaOrigChgInd = criteriaOrigChgInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public AccountDetailReviews100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
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

    public AccountDetailReviews100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentAmount")
    public Double getCriteriaPaymentAmount() {
        return criteriaPaymentAmount;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentAmount")
    public void setCriteriaPaymentAmount(Double criteriaPaymentAmount) {
        this.criteriaPaymentAmount = criteriaPaymentAmount;
    }

    public AccountDetailReviews100PutRequest withCriteriaPaymentAmount(Double criteriaPaymentAmount) {
        this.criteriaPaymentAmount = criteriaPaymentAmount;
        return this;
    }

    /**
     * Trans Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public Double getCriteriaTranNumber() {
        return criteriaTranNumber;
    }

    /**
     * Trans Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public void setCriteriaTranNumber(Double criteriaTranNumber) {
        this.criteriaTranNumber = criteriaTranNumber;
    }

    public AccountDetailReviews100PutRequest withCriteriaTranNumber(Double criteriaTranNumber) {
        this.criteriaTranNumber = criteriaTranNumber;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public AccountDetailReviews100PutRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
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

    public AccountDetailReviews100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
        return this;
    }

    /**
     * Source
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
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    public void setCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
    }

    public AccountDetailReviews100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    public String getCriteriaCpdtInd() {
        return criteriaCpdtInd;
    }

    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    public void setCriteriaCpdtInd(String criteriaCpdtInd) {
        this.criteriaCpdtInd = criteriaCpdtInd;
    }

    public AccountDetailReviews100PutRequest withCriteriaCpdtInd(String criteriaCpdtInd) {
        this.criteriaCpdtInd = criteriaCpdtInd;
        return this;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public String getAcctFeedInd() {
        return acctFeedInd;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public AccountDetailReviews100PutRequest withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
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

    public AccountDetailReviews100PutRequest withCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
        return this;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("criteria.acctFeedInd")
    public String getCriteriaAcctFeedInd() {
        return criteriaAcctFeedInd;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("criteria.acctFeedInd")
    public void setCriteriaAcctFeedInd(String criteriaAcctFeedInd) {
        this.criteriaAcctFeedInd = criteriaAcctFeedInd;
    }

    public AccountDetailReviews100PutRequest withCriteriaAcctFeedInd(String criteriaAcctFeedInd) {
        this.criteriaAcctFeedInd = criteriaAcctFeedInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountDetailReviews100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCodeV")
    public String getCriteriaCurrCodeV() {
        return criteriaCurrCodeV;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCodeV")
    public void setCriteriaCurrCodeV(String criteriaCurrCodeV) {
        this.criteriaCurrCodeV = criteriaCurrCodeV;
    }

    public AccountDetailReviews100PutRequest withCriteriaCurrCodeV(String criteriaCurrCodeV) {
        this.criteriaCurrCodeV = criteriaCurrCodeV;
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

    public AccountDetailReviews100PutRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public AccountDetailReviews100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public String getCriteriaPeriod() {
        return criteriaPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public void setCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
    }

    public AccountDetailReviews100PutRequest withCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
        return this;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.chargeAmount")
    public Double getCriteriaChargeAmount() {
        return criteriaChargeAmount;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.chargeAmount")
    public void setCriteriaChargeAmount(Double criteriaChargeAmount) {
        this.criteriaChargeAmount = criteriaChargeAmount;
    }

    public AccountDetailReviews100PutRequest withCriteriaChargeAmount(Double criteriaChargeAmount) {
        this.criteriaChargeAmount = criteriaChargeAmount;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    public Double getCriteriaBalance() {
        return criteriaBalance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    public void setCriteriaBalance(Double criteriaBalance) {
        this.criteriaBalance = criteriaBalance;
    }

    public AccountDetailReviews100PutRequest withCriteriaBalance(Double criteriaBalance) {
        this.criteriaBalance = criteriaBalance;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public AccountDetailReviews100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
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

    public AccountDetailReviews100PutRequest withInvNumberPaid(String invNumberPaid) {
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

    public AccountDetailReviews100PutRequest withCriteriaTaxAmount(Double criteriaTaxAmount) {
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

    public AccountDetailReviews100PutRequest withCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
        this.criteriaInvNumberPaid = criteriaInvNumberPaid;
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

    public AccountDetailReviews100PutRequest withCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("criteria.user")
    public String getCriteriaUser() {
        return criteriaUser;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("criteria.user")
    public void setCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
    }

    public AccountDetailReviews100PutRequest withCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public String getCriteriaDocumentNumber() {
        return criteriaDocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public void setCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
    }

    public AccountDetailReviews100PutRequest withCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
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

    public AccountDetailReviews100PutRequest withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public Date getCriteriaEntryDate() {
        return criteriaEntryDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public void setCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
    }

    public AccountDetailReviews100PutRequest withCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
        return this;
    }

    /**
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    public Date getCriteriaCshrEndDate() {
        return criteriaCshrEndDate;
    }

    /**
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    public void setCriteriaCshrEndDate(Date criteriaCshrEndDate) {
        this.criteriaCshrEndDate = criteriaCshrEndDate;
    }

    public AccountDetailReviews100PutRequest withCriteriaCshrEndDate(Date criteriaCshrEndDate) {
        this.criteriaCshrEndDate = criteriaCshrEndDate;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public String getCriteriaAidyCode() {
        return criteriaAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public void setCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
    }

    public AccountDetailReviews100PutRequest withCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
        return this;
    }

    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("criteria.feedDocCode")
    public String getCriteriaFeedDocCode() {
        return criteriaFeedDocCode;
    }

    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("criteria.feedDocCode")
    public void setCriteriaFeedDocCode(String criteriaFeedDocCode) {
        this.criteriaFeedDocCode = criteriaFeedDocCode;
    }

    public AccountDetailReviews100PutRequest withCriteriaFeedDocCode(String criteriaFeedDocCode) {
        this.criteriaFeedDocCode = criteriaFeedDocCode;
        return this;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    public String getCriteriaInvoiceNumber() {
        return criteriaInvoiceNumber;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    public void setCriteriaInvoiceNumber(String criteriaInvoiceNumber) {
        this.criteriaInvoiceNumber = criteriaInvoiceNumber;
    }

    public AccountDetailReviews100PutRequest withCriteriaInvoiceNumber(String criteriaInvoiceNumber) {
        this.criteriaInvoiceNumber = criteriaInvoiceNumber;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public String getCpdtInd() {
        return cpdtInd;
    }

    /**
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public void setCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
    }

    public AccountDetailReviews100PutRequest withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
        return this;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("criteria.feedDate")
    public Date getCriteriaFeedDate() {
        return criteriaFeedDate;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("criteria.feedDate")
    public void setCriteriaFeedDate(Date criteriaFeedDate) {
        this.criteriaFeedDate = criteriaFeedDate;
    }

    public AccountDetailReviews100PutRequest withCriteriaFeedDate(Date criteriaFeedDate) {
        this.criteriaFeedDate = criteriaFeedDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public AccountDetailReviews100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public Double getCriteriaReceiptNumber() {
        return criteriaReceiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public void setCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
    }

    public AccountDetailReviews100PutRequest withCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
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

    public AccountDetailReviews100PutRequest withDesc(String desc) {
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

    public AccountDetailReviews100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailReviews100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaSessionNumber");
        sb.append('=');
        sb.append(((this.criteriaSessionNumber == null)?"<null>":this.criteriaSessionNumber));
        sb.append(',');
        sb.append("criteriaOrigChgInd");
        sb.append('=');
        sb.append(((this.criteriaOrigChgInd == null)?"<null>":this.criteriaOrigChgInd));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaPaymentAmount");
        sb.append('=');
        sb.append(((this.criteriaPaymentAmount == null)?"<null>":this.criteriaPaymentAmount));
        sb.append(',');
        sb.append("criteriaTranNumber");
        sb.append('=');
        sb.append(((this.criteriaTranNumber == null)?"<null>":this.criteriaTranNumber));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("criteriaSrceCode");
        sb.append('=');
        sb.append(((this.criteriaSrceCode == null)?"<null>":this.criteriaSrceCode));
        sb.append(',');
        sb.append("criteriaCpdtInd");
        sb.append('=');
        sb.append(((this.criteriaCpdtInd == null)?"<null>":this.criteriaCpdtInd));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("criteriaTranNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaTranNumberPaid == null)?"<null>":this.criteriaTranNumberPaid));
        sb.append(',');
        sb.append("criteriaAcctFeedInd");
        sb.append('=');
        sb.append(((this.criteriaAcctFeedInd == null)?"<null>":this.criteriaAcctFeedInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaCurrCodeV");
        sb.append('=');
        sb.append(((this.criteriaCurrCodeV == null)?"<null>":this.criteriaCurrCodeV));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("criteriaPeriod");
        sb.append('=');
        sb.append(((this.criteriaPeriod == null)?"<null>":this.criteriaPeriod));
        sb.append(',');
        sb.append("criteriaChargeAmount");
        sb.append('=');
        sb.append(((this.criteriaChargeAmount == null)?"<null>":this.criteriaChargeAmount));
        sb.append(',');
        sb.append("criteriaBalance");
        sb.append('=');
        sb.append(((this.criteriaBalance == null)?"<null>":this.criteriaBalance));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
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
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaUser");
        sb.append('=');
        sb.append(((this.criteriaUser == null)?"<null>":this.criteriaUser));
        sb.append(',');
        sb.append("criteriaDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaDocumentNumber == null)?"<null>":this.criteriaDocumentNumber));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
        sb.append(',');
        sb.append("criteriaEntryDate");
        sb.append('=');
        sb.append(((this.criteriaEntryDate == null)?"<null>":this.criteriaEntryDate));
        sb.append(',');
        sb.append("criteriaCshrEndDate");
        sb.append('=');
        sb.append(((this.criteriaCshrEndDate == null)?"<null>":this.criteriaCshrEndDate));
        sb.append(',');
        sb.append("criteriaAidyCode");
        sb.append('=');
        sb.append(((this.criteriaAidyCode == null)?"<null>":this.criteriaAidyCode));
        sb.append(',');
        sb.append("criteriaFeedDocCode");
        sb.append('=');
        sb.append(((this.criteriaFeedDocCode == null)?"<null>":this.criteriaFeedDocCode));
        sb.append(',');
        sb.append("criteriaInvoiceNumber");
        sb.append('=');
        sb.append(((this.criteriaInvoiceNumber == null)?"<null>":this.criteriaInvoiceNumber));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("criteriaFeedDate");
        sb.append('=');
        sb.append(((this.criteriaFeedDate == null)?"<null>":this.criteriaFeedDate));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("criteriaReceiptNumber");
        sb.append('=');
        sb.append(((this.criteriaReceiptNumber == null)?"<null>":this.criteriaReceiptNumber));
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
        result = ((result* 31)+((this.criteriaSessionNumber == null)? 0 :this.criteriaSessionNumber.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCpdtInd == null)? 0 :this.criteriaCpdtInd.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumberPaid == null)? 0 :this.criteriaTranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaEntryDate == null)? 0 :this.criteriaEntryDate.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCodeV == null)? 0 :this.criteriaCurrCodeV.hashCode()));
        result = ((result* 31)+((this.criteriaChargeAmount == null)? 0 :this.criteriaChargeAmount.hashCode()));
        result = ((result* 31)+((this.criteriaBalance == null)? 0 :this.criteriaBalance.hashCode()));
        result = ((result* 31)+((this.criteriaInvoiceNumber == null)? 0 :this.criteriaInvoiceNumber.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaPaymentAmount == null)? 0 :this.criteriaPaymentAmount.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptNumber == null)? 0 :this.criteriaReceiptNumber.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaDocumentNumber == null)? 0 :this.criteriaDocumentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCshrEndDate == null)? 0 :this.criteriaCshrEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.criteriaInvNumberPaid == null)? 0 :this.criteriaInvNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaTaxAmount == null)? 0 :this.criteriaTaxAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaAcctFeedInd == null)? 0 :this.criteriaAcctFeedInd.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumber == null)? 0 :this.criteriaTranNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPeriod == null)? 0 :this.criteriaPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigChgInd == null)? 0 :this.criteriaOrigChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaAidyCode == null)? 0 :this.criteriaAidyCode.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaFeedDocCode == null)? 0 :this.criteriaFeedDocCode.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaFeedDate == null)? 0 :this.criteriaFeedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaUser == null)? 0 :this.criteriaUser.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailReviews100PutRequest) == false) {
            return false;
        }
        AccountDetailReviews100PutRequest rhs = ((AccountDetailReviews100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.criteriaSessionNumber == rhs.criteriaSessionNumber)||((this.criteriaSessionNumber!= null)&&this.criteriaSessionNumber.equals(rhs.criteriaSessionNumber)))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaCpdtInd == rhs.criteriaCpdtInd)||((this.criteriaCpdtInd!= null)&&this.criteriaCpdtInd.equals(rhs.criteriaCpdtInd))))&&((this.criteriaTranNumberPaid == rhs.criteriaTranNumberPaid)||((this.criteriaTranNumberPaid!= null)&&this.criteriaTranNumberPaid.equals(rhs.criteriaTranNumberPaid))))&&((this.criteriaEntryDate == rhs.criteriaEntryDate)||((this.criteriaEntryDate!= null)&&this.criteriaEntryDate.equals(rhs.criteriaEntryDate))))&&((this.criteriaCurrCodeV == rhs.criteriaCurrCodeV)||((this.criteriaCurrCodeV!= null)&&this.criteriaCurrCodeV.equals(rhs.criteriaCurrCodeV))))&&((this.criteriaChargeAmount == rhs.criteriaChargeAmount)||((this.criteriaChargeAmount!= null)&&this.criteriaChargeAmount.equals(rhs.criteriaChargeAmount))))&&((this.criteriaBalance == rhs.criteriaBalance)||((this.criteriaBalance!= null)&&this.criteriaBalance.equals(rhs.criteriaBalance))))&&((this.criteriaInvoiceNumber == rhs.criteriaInvoiceNumber)||((this.criteriaInvoiceNumber!= null)&&this.criteriaInvoiceNumber.equals(rhs.criteriaInvoiceNumber))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaPaymentAmount == rhs.criteriaPaymentAmount)||((this.criteriaPaymentAmount!= null)&&this.criteriaPaymentAmount.equals(rhs.criteriaPaymentAmount))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.criteriaReceiptNumber == rhs.criteriaReceiptNumber)||((this.criteriaReceiptNumber!= null)&&this.criteriaReceiptNumber.equals(rhs.criteriaReceiptNumber))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.criteriaDocumentNumber == rhs.criteriaDocumentNumber)||((this.criteriaDocumentNumber!= null)&&this.criteriaDocumentNumber.equals(rhs.criteriaDocumentNumber))))&&((this.criteriaCshrEndDate == rhs.criteriaCshrEndDate)||((this.criteriaCshrEndDate!= null)&&this.criteriaCshrEndDate.equals(rhs.criteriaCshrEndDate))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.criteriaInvNumberPaid == rhs.criteriaInvNumberPaid)||((this.criteriaInvNumberPaid!= null)&&this.criteriaInvNumberPaid.equals(rhs.criteriaInvNumberPaid))))&&((this.criteriaTaxAmount == rhs.criteriaTaxAmount)||((this.criteriaTaxAmount!= null)&&this.criteriaTaxAmount.equals(rhs.criteriaTaxAmount))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.criteriaAcctFeedInd == rhs.criteriaAcctFeedInd)||((this.criteriaAcctFeedInd!= null)&&this.criteriaAcctFeedInd.equals(rhs.criteriaAcctFeedInd))))&&((this.criteriaTranNumber == rhs.criteriaTranNumber)||((this.criteriaTranNumber!= null)&&this.criteriaTranNumber.equals(rhs.criteriaTranNumber))))&&((this.criteriaPeriod == rhs.criteriaPeriod)||((this.criteriaPeriod!= null)&&this.criteriaPeriod.equals(rhs.criteriaPeriod))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaOrigChgInd == rhs.criteriaOrigChgInd)||((this.criteriaOrigChgInd!= null)&&this.criteriaOrigChgInd.equals(rhs.criteriaOrigChgInd))))&&((this.criteriaAidyCode == rhs.criteriaAidyCode)||((this.criteriaAidyCode!= null)&&this.criteriaAidyCode.equals(rhs.criteriaAidyCode))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.criteriaFeedDocCode == rhs.criteriaFeedDocCode)||((this.criteriaFeedDocCode!= null)&&this.criteriaFeedDocCode.equals(rhs.criteriaFeedDocCode))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaFeedDate == rhs.criteriaFeedDate)||((this.criteriaFeedDate!= null)&&this.criteriaFeedDate.equals(rhs.criteriaFeedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.criteriaUser == rhs.criteriaUser)||((this.criteriaUser!= null)&&this.criteriaUser.equals(rhs.criteriaUser))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
