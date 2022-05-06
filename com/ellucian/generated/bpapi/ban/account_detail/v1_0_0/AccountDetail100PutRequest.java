
package com.ellucian.generated.bpapi.ban.account_detail.v1_0_0;

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
    "criteria.atypCode",
    "criteria.amount",
    "criteria.crossrefDetailCode",
    "criteria.crossrefId",
    "documentNumber",
    "criteria.desc",
    "criteria.tranNumber",
    "holdPassword",
    "paymentId",
    "criteria.srceCode",
    "criteria.tranNumberPaid",
    "criteria.dueDate",
    "criteria.acctFeedInd",
    "id",
    "criteria.currCodeV",
    "tranNumberPaid",
    "criteria.crossrefSrceCode",
    "criteria.transDate",
    "criteria.taxAmount",
    "criteria.atypSeqno",
    "criteria.documentNumber",
    "criteria.additionalText",
    "criteria.user",
    "crossrefSrceCode",
    "criteria.entryDate",
    "criteria.cshrEndDate",
    "criteria.receiptNumber",
    "desc",
    "criteria.paymentId",
    "criteria.sessionNumber",
    "criteria.statementDate",
    "criteria.taxMethod",
    "acctFeedInd",
    "transDate",
    "criteria.billDate",
    "criteria.rate",
    "criteria.merchantId",
    "atypSeqno",
    "criteria.effectiveDate",
    "criteria.createSource",
    "criteria.balance",
    "criteria.units",
    "criteria.crossrefNumber",
    "invNumberPaid",
    "criteria.invNumberPaid",
    "detailCode",
    "criteria.crossrefDcatCode",
    "criteria.crn",
    "criteria.feedDocCode",
    "criteria.invoiceNumber",
    "criteria.feedDate",
    "atypCode",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class AccountDetail100PutRequest {

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
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_CODE")
    private String criteriaAtypCode;
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
     * Crossref Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE")
    private String criteriaCrossrefDetailCode;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crossrefId")
    private String criteriaCrossrefId;
    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String criteriaDesc;
    /**
     * Trans Num
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
    private Object holdPassword;
    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String paymentId;
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
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER_PAID")
    private Double criteriaTranNumberPaid;
    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DUE_DATE")
    private Date criteriaDueDate;
    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * (Required)
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
    private Object id;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
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
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("criteria.crossrefSrceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE")
    private String criteriaCrossrefSrceCode;
    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRANS_DATE")
    private Date criteriaTransDate;
    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    private Double criteriaTaxAmount;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_SEQNO")
    private Double criteriaAtypSeqno;
    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String criteriaDocumentNumber;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    private String criteriaAdditionalText;
    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("criteria.user")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_USER")
    private String criteriaUser;
    /**
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE")
    private String crossrefSrceCode;
    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ENTRY_DATE")
    private Date criteriaEntryDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CSHR_END_DATE")
    private Date criteriaCshrEndDate;
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
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String desc;
    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String criteriaPaymentId;
    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SESSION_NUMBER")
    private Double criteriaSessionNumber;
    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STATEMENT_DATE")
    private Date criteriaStatementDate;
    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * (Required)
     * 
     */
    @JsonProperty("acctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ACCT_FEED_IND")
    private String acctFeedInd;
    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRANS_DATE")
    private Date transDate;
    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BILL_DATE")
    private Date criteriaBillDate;
    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RATE")
    private Double criteriaRate;
    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("criteria.merchantId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_MERCHANT_ID")
    private String criteriaMerchantId;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_SEQNO")
    private Double atypSeqno;
    /**
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CREATE_SOURCE")
    private String criteriaCreateSource;
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
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("criteria.units")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_UNITS")
    private Double criteriaUnits;
    /**
     * Number
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
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE")
    private String criteriaCrossrefDcatCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CRN")
    private String criteriaCrn;
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
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("criteria.feedDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DATE")
    private Date criteriaFeedDate;
    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_CODE")
    private String atypCode;
    /**
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date effectiveDate;
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

    public AccountDetail100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public AccountDetail100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
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

    public AccountDetail100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Crossref Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    public String getCriteriaCrossrefDetailCode() {
        return criteriaCrossrefDetailCode;
    }

    /**
     * Crossref Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDetailCode")
    public void setCriteriaCrossrefDetailCode(String criteriaCrossrefDetailCode) {
        this.criteriaCrossrefDetailCode = criteriaCrossrefDetailCode;
    }

    public AccountDetail100PutRequest withCriteriaCrossrefDetailCode(String criteriaCrossrefDetailCode) {
        this.criteriaCrossrefDetailCode = criteriaCrossrefDetailCode;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crossrefId")
    public String getCriteriaCrossrefId() {
        return criteriaCrossrefId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crossrefId")
    public void setCriteriaCrossrefId(String criteriaCrossrefId) {
        this.criteriaCrossrefId = criteriaCrossrefId;
    }

    public AccountDetail100PutRequest withCriteriaCrossrefId(String criteriaCrossrefId) {
        this.criteriaCrossrefId = criteriaCrossrefId;
        return this;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public AccountDetail100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Detail Code Description
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
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public AccountDetail100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public Double getCriteriaTranNumber() {
        return criteriaTranNumber;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public void setCriteriaTranNumber(Double criteriaTranNumber) {
        this.criteriaTranNumber = criteriaTranNumber;
    }

    public AccountDetail100PutRequest withCriteriaTranNumber(Double criteriaTranNumber) {
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

    public AccountDetail100PutRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public AccountDetail100PutRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    public AccountDetail100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
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

    public AccountDetail100PutRequest withCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
        return this;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    public Date getCriteriaDueDate() {
        return criteriaDueDate;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    public void setCriteriaDueDate(Date criteriaDueDate) {
        this.criteriaDueDate = criteriaDueDate;
    }

    public AccountDetail100PutRequest withCriteriaDueDate(Date criteriaDueDate) {
        this.criteriaDueDate = criteriaDueDate;
        return this;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctFeedInd")
    public void setCriteriaAcctFeedInd(String criteriaAcctFeedInd) {
        this.criteriaAcctFeedInd = criteriaAcctFeedInd;
    }

    public AccountDetail100PutRequest withCriteriaAcctFeedInd(String criteriaAcctFeedInd) {
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

    public AccountDetail100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCodeV")
    public void setCriteriaCurrCodeV(String criteriaCurrCodeV) {
        this.criteriaCurrCodeV = criteriaCurrCodeV;
    }

    public AccountDetail100PutRequest withCriteriaCurrCodeV(String criteriaCurrCodeV) {
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

    public AccountDetail100PutRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    /**
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("criteria.crossrefSrceCode")
    public String getCriteriaCrossrefSrceCode() {
        return criteriaCrossrefSrceCode;
    }

    /**
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("criteria.crossrefSrceCode")
    public void setCriteriaCrossrefSrceCode(String criteriaCrossrefSrceCode) {
        this.criteriaCrossrefSrceCode = criteriaCrossrefSrceCode;
    }

    public AccountDetail100PutRequest withCriteriaCrossrefSrceCode(String criteriaCrossrefSrceCode) {
        this.criteriaCrossrefSrceCode = criteriaCrossrefSrceCode;
        return this;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public AccountDetail100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
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

    public AccountDetail100PutRequest withCriteriaTaxAmount(Double criteriaTaxAmount) {
        this.criteriaTaxAmount = criteriaTaxAmount;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    public Double getCriteriaAtypSeqno() {
        return criteriaAtypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    public void setCriteriaAtypSeqno(Double criteriaAtypSeqno) {
        this.criteriaAtypSeqno = criteriaAtypSeqno;
    }

    public AccountDetail100PutRequest withCriteriaAtypSeqno(Double criteriaAtypSeqno) {
        this.criteriaAtypSeqno = criteriaAtypSeqno;
        return this;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public String getCriteriaDocumentNumber() {
        return criteriaDocumentNumber;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public void setCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
    }

    public AccountDetail100PutRequest withCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    public String getCriteriaAdditionalText() {
        return criteriaAdditionalText;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    public void setCriteriaAdditionalText(String criteriaAdditionalText) {
        this.criteriaAdditionalText = criteriaAdditionalText;
    }

    public AccountDetail100PutRequest withCriteriaAdditionalText(String criteriaAdditionalText) {
        this.criteriaAdditionalText = criteriaAdditionalText;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("criteria.user")
    public String getCriteriaUser() {
        return criteriaUser;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("criteria.user")
    public void setCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
    }

    public AccountDetail100PutRequest withCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
        return this;
    }

    /**
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    public String getCrossrefSrceCode() {
        return crossrefSrceCode;
    }

    /**
     * Cross Ref Source
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    public void setCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
    }

    public AccountDetail100PutRequest withCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public Date getCriteriaEntryDate() {
        return criteriaEntryDate;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public void setCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
    }

    public AccountDetail100PutRequest withCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    public Date getCriteriaCshrEndDate() {
        return criteriaCshrEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("criteria.cshrEndDate")
    public void setCriteriaCshrEndDate(Date criteriaCshrEndDate) {
        this.criteriaCshrEndDate = criteriaCshrEndDate;
    }

    public AccountDetail100PutRequest withCriteriaCshrEndDate(Date criteriaCshrEndDate) {
        this.criteriaCshrEndDate = criteriaCshrEndDate;
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

    public AccountDetail100PutRequest withCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
        return this;
    }

    /**
     * Detail Code Description
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
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AccountDetail100PutRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public String getCriteriaPaymentId() {
        return criteriaPaymentId;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public void setCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
    }

    public AccountDetail100PutRequest withCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    public Double getCriteriaSessionNumber() {
        return criteriaSessionNumber;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("criteria.sessionNumber")
    public void setCriteriaSessionNumber(Double criteriaSessionNumber) {
        this.criteriaSessionNumber = criteriaSessionNumber;
    }

    public AccountDetail100PutRequest withCriteriaSessionNumber(Double criteriaSessionNumber) {
        this.criteriaSessionNumber = criteriaSessionNumber;
        return this;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    public Date getCriteriaStatementDate() {
        return criteriaStatementDate;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    public void setCriteriaStatementDate(Date criteriaStatementDate) {
        this.criteriaStatementDate = criteriaStatementDate;
    }

    public AccountDetail100PutRequest withCriteriaStatementDate(Date criteriaStatementDate) {
        this.criteriaStatementDate = criteriaStatementDate;
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

    public AccountDetail100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
        return this;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public AccountDetail100PutRequest withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
        return this;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public AccountDetail100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    public Date getCriteriaBillDate() {
        return criteriaBillDate;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    public void setCriteriaBillDate(Date criteriaBillDate) {
        this.criteriaBillDate = criteriaBillDate;
    }

    public AccountDetail100PutRequest withCriteriaBillDate(Date criteriaBillDate) {
        this.criteriaBillDate = criteriaBillDate;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    public Double getCriteriaRate() {
        return criteriaRate;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    public void setCriteriaRate(Double criteriaRate) {
        this.criteriaRate = criteriaRate;
    }

    public AccountDetail100PutRequest withCriteriaRate(Double criteriaRate) {
        this.criteriaRate = criteriaRate;
        return this;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("criteria.merchantId")
    public String getCriteriaMerchantId() {
        return criteriaMerchantId;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("criteria.merchantId")
    public void setCriteriaMerchantId(String criteriaMerchantId) {
        this.criteriaMerchantId = criteriaMerchantId;
    }

    public AccountDetail100PutRequest withCriteriaMerchantId(String criteriaMerchantId) {
        this.criteriaMerchantId = criteriaMerchantId;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public AccountDetail100PutRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    /**
     * Effective
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
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public AccountDetail100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    public String getCriteriaCreateSource() {
        return criteriaCreateSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    public void setCriteriaCreateSource(String criteriaCreateSource) {
        this.criteriaCreateSource = criteriaCreateSource;
    }

    public AccountDetail100PutRequest withCriteriaCreateSource(String criteriaCreateSource) {
        this.criteriaCreateSource = criteriaCreateSource;
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

    public AccountDetail100PutRequest withCriteriaBalance(Double criteriaBalance) {
        this.criteriaBalance = criteriaBalance;
        return this;
    }

    /**
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("criteria.units")
    public Double getCriteriaUnits() {
        return criteriaUnits;
    }

    /**
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("criteria.units")
    public void setCriteriaUnits(Double criteriaUnits) {
        this.criteriaUnits = criteriaUnits;
    }

    public AccountDetail100PutRequest withCriteriaUnits(Double criteriaUnits) {
        this.criteriaUnits = criteriaUnits;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("criteria.crossrefNumber")
    public Double getCriteriaCrossrefNumber() {
        return criteriaCrossrefNumber;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("criteria.crossrefNumber")
    public void setCriteriaCrossrefNumber(Double criteriaCrossrefNumber) {
        this.criteriaCrossrefNumber = criteriaCrossrefNumber;
    }

    public AccountDetail100PutRequest withCriteriaCrossrefNumber(Double criteriaCrossrefNumber) {
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

    public AccountDetail100PutRequest withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
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

    public AccountDetail100PutRequest withCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
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

    public AccountDetail100PutRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    public String getCriteriaCrossrefDcatCode() {
        return criteriaCrossrefDcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("criteria.crossrefDcatCode")
    public void setCriteriaCrossrefDcatCode(String criteriaCrossrefDcatCode) {
        this.criteriaCrossrefDcatCode = criteriaCrossrefDcatCode;
    }

    public AccountDetail100PutRequest withCriteriaCrossrefDcatCode(String criteriaCrossrefDcatCode) {
        this.criteriaCrossrefDcatCode = criteriaCrossrefDcatCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public String getCriteriaCrn() {
        return criteriaCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public void setCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
    }

    public AccountDetail100PutRequest withCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
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

    public AccountDetail100PutRequest withCriteriaFeedDocCode(String criteriaFeedDocCode) {
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

    public AccountDetail100PutRequest withCriteriaInvoiceNumber(String criteriaInvoiceNumber) {
        this.criteriaInvoiceNumber = criteriaInvoiceNumber;
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

    public AccountDetail100PutRequest withCriteriaFeedDate(Date criteriaFeedDate) {
        this.criteriaFeedDate = criteriaFeedDate;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountDetail100PutRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Effective
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
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public AccountDetail100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public AccountDetail100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetail100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("criteriaCrossrefDetailCode");
        sb.append('=');
        sb.append(((this.criteriaCrossrefDetailCode == null)?"<null>":this.criteriaCrossrefDetailCode));
        sb.append(',');
        sb.append("criteriaCrossrefId");
        sb.append('=');
        sb.append(((this.criteriaCrossrefId == null)?"<null>":this.criteriaCrossrefId));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaTranNumber");
        sb.append('=');
        sb.append(((this.criteriaTranNumber == null)?"<null>":this.criteriaTranNumber));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("criteriaSrceCode");
        sb.append('=');
        sb.append(((this.criteriaSrceCode == null)?"<null>":this.criteriaSrceCode));
        sb.append(',');
        sb.append("criteriaTranNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaTranNumberPaid == null)?"<null>":this.criteriaTranNumberPaid));
        sb.append(',');
        sb.append("criteriaDueDate");
        sb.append('=');
        sb.append(((this.criteriaDueDate == null)?"<null>":this.criteriaDueDate));
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
        sb.append("criteriaCrossrefSrceCode");
        sb.append('=');
        sb.append(((this.criteriaCrossrefSrceCode == null)?"<null>":this.criteriaCrossrefSrceCode));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
        sb.append(',');
        sb.append("criteriaTaxAmount");
        sb.append('=');
        sb.append(((this.criteriaTaxAmount == null)?"<null>":this.criteriaTaxAmount));
        sb.append(',');
        sb.append("criteriaAtypSeqno");
        sb.append('=');
        sb.append(((this.criteriaAtypSeqno == null)?"<null>":this.criteriaAtypSeqno));
        sb.append(',');
        sb.append("criteriaDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaDocumentNumber == null)?"<null>":this.criteriaDocumentNumber));
        sb.append(',');
        sb.append("criteriaAdditionalText");
        sb.append('=');
        sb.append(((this.criteriaAdditionalText == null)?"<null>":this.criteriaAdditionalText));
        sb.append(',');
        sb.append("criteriaUser");
        sb.append('=');
        sb.append(((this.criteriaUser == null)?"<null>":this.criteriaUser));
        sb.append(',');
        sb.append("crossrefSrceCode");
        sb.append('=');
        sb.append(((this.crossrefSrceCode == null)?"<null>":this.crossrefSrceCode));
        sb.append(',');
        sb.append("criteriaEntryDate");
        sb.append('=');
        sb.append(((this.criteriaEntryDate == null)?"<null>":this.criteriaEntryDate));
        sb.append(',');
        sb.append("criteriaCshrEndDate");
        sb.append('=');
        sb.append(((this.criteriaCshrEndDate == null)?"<null>":this.criteriaCshrEndDate));
        sb.append(',');
        sb.append("criteriaReceiptNumber");
        sb.append('=');
        sb.append(((this.criteriaReceiptNumber == null)?"<null>":this.criteriaReceiptNumber));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("criteriaPaymentId");
        sb.append('=');
        sb.append(((this.criteriaPaymentId == null)?"<null>":this.criteriaPaymentId));
        sb.append(',');
        sb.append("criteriaSessionNumber");
        sb.append('=');
        sb.append(((this.criteriaSessionNumber == null)?"<null>":this.criteriaSessionNumber));
        sb.append(',');
        sb.append("criteriaStatementDate");
        sb.append('=');
        sb.append(((this.criteriaStatementDate == null)?"<null>":this.criteriaStatementDate));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("criteriaBillDate");
        sb.append('=');
        sb.append(((this.criteriaBillDate == null)?"<null>":this.criteriaBillDate));
        sb.append(',');
        sb.append("criteriaRate");
        sb.append('=');
        sb.append(((this.criteriaRate == null)?"<null>":this.criteriaRate));
        sb.append(',');
        sb.append("criteriaMerchantId");
        sb.append('=');
        sb.append(((this.criteriaMerchantId == null)?"<null>":this.criteriaMerchantId));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("criteriaCreateSource");
        sb.append('=');
        sb.append(((this.criteriaCreateSource == null)?"<null>":this.criteriaCreateSource));
        sb.append(',');
        sb.append("criteriaBalance");
        sb.append('=');
        sb.append(((this.criteriaBalance == null)?"<null>":this.criteriaBalance));
        sb.append(',');
        sb.append("criteriaUnits");
        sb.append('=');
        sb.append(((this.criteriaUnits == null)?"<null>":this.criteriaUnits));
        sb.append(',');
        sb.append("criteriaCrossrefNumber");
        sb.append('=');
        sb.append(((this.criteriaCrossrefNumber == null)?"<null>":this.criteriaCrossrefNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("criteriaInvNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaInvNumberPaid == null)?"<null>":this.criteriaInvNumberPaid));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("criteriaCrossrefDcatCode");
        sb.append('=');
        sb.append(((this.criteriaCrossrefDcatCode == null)?"<null>":this.criteriaCrossrefDcatCode));
        sb.append(',');
        sb.append("criteriaCrn");
        sb.append('=');
        sb.append(((this.criteriaCrn == null)?"<null>":this.criteriaCrn));
        sb.append(',');
        sb.append("criteriaFeedDocCode");
        sb.append('=');
        sb.append(((this.criteriaFeedDocCode == null)?"<null>":this.criteriaFeedDocCode));
        sb.append(',');
        sb.append("criteriaInvoiceNumber");
        sb.append('=');
        sb.append(((this.criteriaInvoiceNumber == null)?"<null>":this.criteriaInvoiceNumber));
        sb.append(',');
        sb.append("criteriaFeedDate");
        sb.append('=');
        sb.append(((this.criteriaFeedDate == null)?"<null>":this.criteriaFeedDate));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.criteriaCrossrefDetailCode == null)? 0 :this.criteriaCrossrefDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefDcatCode == null)? 0 :this.criteriaCrossrefDcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaCreateSource == null)? 0 :this.criteriaCreateSource.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCodeV == null)? 0 :this.criteriaCurrCodeV.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.criteriaStatementDate == null)? 0 :this.criteriaStatementDate.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaBillDate == null)? 0 :this.criteriaBillDate.hashCode()));
        result = ((result* 31)+((this.criteriaDocumentNumber == null)? 0 :this.criteriaDocumentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCshrEndDate == null)? 0 :this.criteriaCshrEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.criteriaInvNumberPaid == null)? 0 :this.criteriaInvNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaTaxAmount == null)? 0 :this.criteriaTaxAmount.hashCode()));
        result = ((result* 31)+((this.criteriaUnits == null)? 0 :this.criteriaUnits.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefId == null)? 0 :this.criteriaCrossrefId.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumber == null)? 0 :this.criteriaTranNumber.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.crossrefSrceCode == null)? 0 :this.crossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefSrceCode == null)? 0 :this.criteriaCrossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrossrefNumber == null)? 0 :this.criteriaCrossrefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaFeedDate == null)? 0 :this.criteriaFeedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumberPaid == null)? 0 :this.criteriaTranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaDueDate == null)? 0 :this.criteriaDueDate.hashCode()));
        result = ((result* 31)+((this.criteriaEntryDate == null)? 0 :this.criteriaEntryDate.hashCode()));
        result = ((result* 31)+((this.criteriaBalance == null)? 0 :this.criteriaBalance.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.criteriaInvoiceNumber == null)? 0 :this.criteriaInvoiceNumber.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptNumber == null)? 0 :this.criteriaReceiptNumber.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.criteriaMerchantId == null)? 0 :this.criteriaMerchantId.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaAcctFeedInd == null)? 0 :this.criteriaAcctFeedInd.hashCode()));
        result = ((result* 31)+((this.criteriaRate == null)? 0 :this.criteriaRate.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.criteriaFeedDocCode == null)? 0 :this.criteriaFeedDocCode.hashCode()));
        result = ((result* 31)+((this.criteriaPaymentId == null)? 0 :this.criteriaPaymentId.hashCode()));
        result = ((result* 31)+((this.criteriaAtypSeqno == null)? 0 :this.criteriaAtypSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaAdditionalText == null)? 0 :this.criteriaAdditionalText.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaUser == null)? 0 :this.criteriaUser.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetail100PutRequest) == false) {
            return false;
        }
        AccountDetail100PutRequest rhs = ((AccountDetail100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaSessionNumber == rhs.criteriaSessionNumber)||((this.criteriaSessionNumber!= null)&&this.criteriaSessionNumber.equals(rhs.criteriaSessionNumber)))&&((this.criteriaCrossrefDetailCode == rhs.criteriaCrossrefDetailCode)||((this.criteriaCrossrefDetailCode!= null)&&this.criteriaCrossrefDetailCode.equals(rhs.criteriaCrossrefDetailCode))))&&((this.criteriaCrossrefDcatCode == rhs.criteriaCrossrefDcatCode)||((this.criteriaCrossrefDcatCode!= null)&&this.criteriaCrossrefDcatCode.equals(rhs.criteriaCrossrefDcatCode))))&&((this.criteriaCreateSource == rhs.criteriaCreateSource)||((this.criteriaCreateSource!= null)&&this.criteriaCreateSource.equals(rhs.criteriaCreateSource))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaCurrCodeV == rhs.criteriaCurrCodeV)||((this.criteriaCurrCodeV!= null)&&this.criteriaCurrCodeV.equals(rhs.criteriaCurrCodeV))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.criteriaStatementDate == rhs.criteriaStatementDate)||((this.criteriaStatementDate!= null)&&this.criteriaStatementDate.equals(rhs.criteriaStatementDate))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.criteriaBillDate == rhs.criteriaBillDate)||((this.criteriaBillDate!= null)&&this.criteriaBillDate.equals(rhs.criteriaBillDate))))&&((this.criteriaDocumentNumber == rhs.criteriaDocumentNumber)||((this.criteriaDocumentNumber!= null)&&this.criteriaDocumentNumber.equals(rhs.criteriaDocumentNumber))))&&((this.criteriaCshrEndDate == rhs.criteriaCshrEndDate)||((this.criteriaCshrEndDate!= null)&&this.criteriaCshrEndDate.equals(rhs.criteriaCshrEndDate))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.criteriaInvNumberPaid == rhs.criteriaInvNumberPaid)||((this.criteriaInvNumberPaid!= null)&&this.criteriaInvNumberPaid.equals(rhs.criteriaInvNumberPaid))))&&((this.criteriaTaxAmount == rhs.criteriaTaxAmount)||((this.criteriaTaxAmount!= null)&&this.criteriaTaxAmount.equals(rhs.criteriaTaxAmount))))&&((this.criteriaUnits == rhs.criteriaUnits)||((this.criteriaUnits!= null)&&this.criteriaUnits.equals(rhs.criteriaUnits))))&&((this.criteriaCrossrefId == rhs.criteriaCrossrefId)||((this.criteriaCrossrefId!= null)&&this.criteriaCrossrefId.equals(rhs.criteriaCrossrefId))))&&((this.criteriaTranNumber == rhs.criteriaTranNumber)||((this.criteriaTranNumber!= null)&&this.criteriaTranNumber.equals(rhs.criteriaTranNumber))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.crossrefSrceCode == rhs.crossrefSrceCode)||((this.crossrefSrceCode!= null)&&this.crossrefSrceCode.equals(rhs.crossrefSrceCode))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaCrossrefSrceCode == rhs.criteriaCrossrefSrceCode)||((this.criteriaCrossrefSrceCode!= null)&&this.criteriaCrossrefSrceCode.equals(rhs.criteriaCrossrefSrceCode))))&&((this.criteriaCrossrefNumber == rhs.criteriaCrossrefNumber)||((this.criteriaCrossrefNumber!= null)&&this.criteriaCrossrefNumber.equals(rhs.criteriaCrossrefNumber))))&&((this.criteriaFeedDate == rhs.criteriaFeedDate)||((this.criteriaFeedDate!= null)&&this.criteriaFeedDate.equals(rhs.criteriaFeedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.criteriaTranNumberPaid == rhs.criteriaTranNumberPaid)||((this.criteriaTranNumberPaid!= null)&&this.criteriaTranNumberPaid.equals(rhs.criteriaTranNumberPaid))))&&((this.criteriaDueDate == rhs.criteriaDueDate)||((this.criteriaDueDate!= null)&&this.criteriaDueDate.equals(rhs.criteriaDueDate))))&&((this.criteriaEntryDate == rhs.criteriaEntryDate)||((this.criteriaEntryDate!= null)&&this.criteriaEntryDate.equals(rhs.criteriaEntryDate))))&&((this.criteriaBalance == rhs.criteriaBalance)||((this.criteriaBalance!= null)&&this.criteriaBalance.equals(rhs.criteriaBalance))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.criteriaInvoiceNumber == rhs.criteriaInvoiceNumber)||((this.criteriaInvoiceNumber!= null)&&this.criteriaInvoiceNumber.equals(rhs.criteriaInvoiceNumber))))&&((this.criteriaReceiptNumber == rhs.criteriaReceiptNumber)||((this.criteriaReceiptNumber!= null)&&this.criteriaReceiptNumber.equals(rhs.criteriaReceiptNumber))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.criteriaMerchantId == rhs.criteriaMerchantId)||((this.criteriaMerchantId!= null)&&this.criteriaMerchantId.equals(rhs.criteriaMerchantId))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.criteriaAcctFeedInd == rhs.criteriaAcctFeedInd)||((this.criteriaAcctFeedInd!= null)&&this.criteriaAcctFeedInd.equals(rhs.criteriaAcctFeedInd))))&&((this.criteriaRate == rhs.criteriaRate)||((this.criteriaRate!= null)&&this.criteriaRate.equals(rhs.criteriaRate))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.criteriaFeedDocCode == rhs.criteriaFeedDocCode)||((this.criteriaFeedDocCode!= null)&&this.criteriaFeedDocCode.equals(rhs.criteriaFeedDocCode))))&&((this.criteriaPaymentId == rhs.criteriaPaymentId)||((this.criteriaPaymentId!= null)&&this.criteriaPaymentId.equals(rhs.criteriaPaymentId))))&&((this.criteriaAtypSeqno == rhs.criteriaAtypSeqno)||((this.criteriaAtypSeqno!= null)&&this.criteriaAtypSeqno.equals(rhs.criteriaAtypSeqno))))&&((this.criteriaAdditionalText == rhs.criteriaAdditionalText)||((this.criteriaAdditionalText!= null)&&this.criteriaAdditionalText.equals(rhs.criteriaAdditionalText))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.criteriaUser == rhs.criteriaUser)||((this.criteriaUser!= null)&&this.criteriaUser.equals(rhs.criteriaUser))));
    }

}
