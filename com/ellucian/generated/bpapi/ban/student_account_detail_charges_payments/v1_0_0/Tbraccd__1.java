
package com.ellucian.generated.bpapi.ban.student_account_detail_charges_payments.v1_0_0;

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
    "crossrefDetailCode",
    "taxReptBoxSg",
    "additionalText",
    "taxMethod",
    "documentNumber",
    "dueDate",
    "statementDate",
    "taxFutureInd",
    "taxReptBox",
    "balance",
    "taxFutureIndPr",
    "merchantId",
    "paymentId",
    "crossrefDcatCode",
    "tranNumberPaid",
    "period",
    "stspKeySequence",
    "currCodeV",
    "entryDate",
    "cshrEndDate",
    "billDate",
    "crossrefSrceCode",
    "taxReptYear",
    "taxAmount",
    "cpdtInd",
    "desc",
    "srceCode",
    "taxReptBoxPr",
    "crossrefNumber",
    "acctFeedInd",
    "invoiceNumber",
    "transDate",
    "crn",
    "receiptNumber",
    "studypathName",
    "amount",
    "taxFutureIndSg",
    "aidyCode",
    "feedDate",
    "tranNumber",
    "invNumberPaid",
    "crossrefId",
    "detailCode",
    "createSource",
    "origChgInd",
    "feedDocCode",
    "sessionNumber",
    "user",
    "effectiveDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbraccd__1 {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE")
    private String crossrefDetailCode;
    /**
     * Scholarship or Grant
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_REPT_BOX_SG")
    private String taxReptBoxSg;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText")
    private String additionalText;
    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("taxMethod")
    private String taxMethod;
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
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DUE_DATE")
    private Date dueDate;
    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STATEMENT_DATE")
    private Date statementDate;
    /**
     * Future Term
     * <p>
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND
     * 
     */
    @JsonProperty("taxFutureInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_FUTURE_IND")
    private String taxFutureInd;
    /**
     * Lineage reference object : TBRACCD_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_REPT_BOX")
    private String taxReptBox;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BALANCE")
    private Double balance;
    /**
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_PR
     * 
     */
    @JsonProperty("taxFutureIndPr")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_FUTURE_IND_PR")
    private String taxFutureIndPr;
    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_MERCHANT_ID")
    private String merchantId;
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
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE")
    private String crossrefDcatCode;
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
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PERIOD")
    private String period;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCodeV")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCodeV;
    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ENTRY_DATE")
    private Date entryDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CSHR_END_DATE")
    private Date cshrEndDate;
    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BILL_DATE")
    private Date billDate;
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
     * Year
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_REPT_YEAR")
    private Double taxReptYear;
    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TBRACCD_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_AMOUNT")
    private Double taxAmount;
    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String cpdtInd;
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
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String srceCode;
    /**
     * Payment Received
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_PR
     * 
     */
    @JsonProperty("taxReptBoxPr")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_REPT_BOX_PR")
    private String taxReptBoxPr;
    /**
     * Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_NUMBER")
    private Double crossrefNumber;
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
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String invoiceNumber;
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
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CRN")
    private String crn;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RECEIPT_NUMBER")
    private Double receiptNumber;
    @JsonProperty("studypathName")
    private String studypathName;
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
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_SG
     * 
     */
    @JsonProperty("taxFutureIndSg")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TAX_FUTURE_IND_SG")
    private String taxFutureIndSg;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AIDY_CODE")
    private String aidyCode;
    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DATE")
    private Date feedDate;
    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER")
    private Double tranNumber;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefId")
    private String crossrefId;
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
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CREATE_SOURCE")
    private String createSource;
    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String origChgInd;
    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DOC_CODE")
    private String feedDocCode;
    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SESSION_NUMBER")
    private Double sessionNumber;
    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_USER")
    private String user;
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
    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    public String getCrossrefDetailCode() {
        return crossrefDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    public void setCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
    }

    public Tbraccd__1 withCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
        return this;
    }

    /**
     * Scholarship or Grant
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    public String getTaxReptBoxSg() {
        return taxReptBoxSg;
    }

    /**
     * Scholarship or Grant
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    public void setTaxReptBoxSg(String taxReptBoxSg) {
        this.taxReptBoxSg = taxReptBoxSg;
    }

    public Tbraccd__1 withTaxReptBoxSg(String taxReptBoxSg) {
        this.taxReptBoxSg = taxReptBoxSg;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText")
    public String getAdditionalText() {
        return additionalText;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText")
    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

    public Tbraccd__1 withAdditionalText(String additionalText) {
        this.additionalText = additionalText;
        return this;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("taxMethod")
    public String getTaxMethod() {
        return taxMethod;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("taxMethod")
    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public Tbraccd__1 withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
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

    public Tbraccd__1 withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Tbraccd__1 withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    public Date getStatementDate() {
        return statementDate;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    public void setStatementDate(Date statementDate) {
        this.statementDate = statementDate;
    }

    public Tbraccd__1 withStatementDate(Date statementDate) {
        this.statementDate = statementDate;
        return this;
    }

    /**
     * Future Term
     * <p>
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND
     * 
     */
    @JsonProperty("taxFutureInd")
    public String getTaxFutureInd() {
        return taxFutureInd;
    }

    /**
     * Future Term
     * <p>
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND
     * 
     */
    @JsonProperty("taxFutureInd")
    public void setTaxFutureInd(String taxFutureInd) {
        this.taxFutureInd = taxFutureInd;
    }

    public Tbraccd__1 withTaxFutureInd(String taxFutureInd) {
        this.taxFutureInd = taxFutureInd;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    public String getTaxReptBox() {
        return taxReptBox;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    public void setTaxReptBox(String taxReptBox) {
        this.taxReptBox = taxReptBox;
    }

    public Tbraccd__1 withTaxReptBox(String taxReptBox) {
        this.taxReptBox = taxReptBox;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Tbraccd__1 withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_PR
     * 
     */
    @JsonProperty("taxFutureIndPr")
    public String getTaxFutureIndPr() {
        return taxFutureIndPr;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_PR
     * 
     */
    @JsonProperty("taxFutureIndPr")
    public void setTaxFutureIndPr(String taxFutureIndPr) {
        this.taxFutureIndPr = taxFutureIndPr;
    }

    public Tbraccd__1 withTaxFutureIndPr(String taxFutureIndPr) {
        this.taxFutureIndPr = taxFutureIndPr;
        return this;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRACCD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Tbraccd__1 withMerchantId(String merchantId) {
        this.merchantId = merchantId;
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

    public Tbraccd__1 withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    public String getCrossrefDcatCode() {
        return crossrefDcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    public void setCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
    }

    public Tbraccd__1 withCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
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

    public Tbraccd__1 withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Tbraccd__1 withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Tbraccd__1 withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCodeV")
    public String getCurrCodeV() {
        return currCodeV;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCodeV")
    public void setCurrCodeV(String currCodeV) {
        this.currCodeV = currCodeV;
    }

    public Tbraccd__1 withCurrCodeV(String currCodeV) {
        this.currCodeV = currCodeV;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Tbraccd__1 withEntryDate(Date entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    public Date getCshrEndDate() {
        return cshrEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    public void setCshrEndDate(Date cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
    }

    public Tbraccd__1 withCshrEndDate(Date cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
        return this;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public Date getBillDate() {
        return billDate;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Tbraccd__1 withBillDate(Date billDate) {
        this.billDate = billDate;
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

    public Tbraccd__1 withCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    public Double getTaxReptYear() {
        return taxReptYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    public void setTaxReptYear(Double taxReptYear) {
        this.taxReptYear = taxReptYear;
    }

    public Tbraccd__1 withTaxReptYear(Double taxReptYear) {
        this.taxReptYear = taxReptYear;
        return this;
    }

    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TBRACCD_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TBRACCD_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Tbraccd__1 withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public String getCpdtInd() {
        return cpdtInd;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public void setCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
    }

    public Tbraccd__1 withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
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

    public Tbraccd__1 withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public Tbraccd__1 withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Payment Received
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_PR
     * 
     */
    @JsonProperty("taxReptBoxPr")
    public String getTaxReptBoxPr() {
        return taxReptBoxPr;
    }

    /**
     * Payment Received
     * <p>
     * Lineage reference object : TBRACCD_TAX_REPT_BOX_PR
     * 
     */
    @JsonProperty("taxReptBoxPr")
    public void setTaxReptBoxPr(String taxReptBoxPr) {
        this.taxReptBoxPr = taxReptBoxPr;
    }

    public Tbraccd__1 withTaxReptBoxPr(String taxReptBoxPr) {
        this.taxReptBoxPr = taxReptBoxPr;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public Double getCrossrefNumber() {
        return crossrefNumber;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public void setCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
    }

    public Tbraccd__1 withCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
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

    public Tbraccd__1 withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
        return this;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Tbraccd__1 withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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

    public Tbraccd__1 withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRACCD_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Tbraccd__1 withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public Double getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public void setReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Tbraccd__1 withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    @JsonProperty("studypathName")
    public String getStudypathName() {
        return studypathName;
    }

    @JsonProperty("studypathName")
    public void setStudypathName(String studypathName) {
        this.studypathName = studypathName;
    }

    public Tbraccd__1 withStudypathName(String studypathName) {
        this.studypathName = studypathName;
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

    public Tbraccd__1 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_SG
     * 
     */
    @JsonProperty("taxFutureIndSg")
    public String getTaxFutureIndSg() {
        return taxFutureIndSg;
    }

    /**
     * Lineage reference object : TBRACCD_TAX_FUTURE_IND_SG
     * 
     */
    @JsonProperty("taxFutureIndSg")
    public void setTaxFutureIndSg(String taxFutureIndSg) {
        this.taxFutureIndSg = taxFutureIndSg;
    }

    public Tbraccd__1 withTaxFutureIndSg(String taxFutureIndSg) {
        this.taxFutureIndSg = taxFutureIndSg;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public String getAidyCode() {
        return aidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public void setAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
    }

    public Tbraccd__1 withAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
        return this;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    public Date getFeedDate() {
        return feedDate;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBRACCD_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
    }

    public Tbraccd__1 withFeedDate(Date feedDate) {
        this.feedDate = feedDate;
        return this;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public Tbraccd__1 withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
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

    public Tbraccd__1 withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefId")
    public String getCrossrefId() {
        return crossrefId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefId")
    public void setCrossrefId(String crossrefId) {
        this.crossrefId = crossrefId;
    }

    public Tbraccd__1 withCrossrefId(String crossrefId) {
        this.crossrefId = crossrefId;
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

    public Tbraccd__1 withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public String getCreateSource() {
        return createSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRACCD_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public Tbraccd__1 withCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public String getOrigChgInd() {
        return origChgInd;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public void setOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
    }

    public Tbraccd__1 withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
        return this;
    }

    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public String getFeedDocCode() {
        return feedDocCode;
    }

    /**
     * Feed Doc Num
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public void setFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
    }

    public Tbraccd__1 withFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public Double getSessionNumber() {
        return sessionNumber;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public void setSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Tbraccd__1 withSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBRACCD_USER
     * (Required)
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Tbraccd__1 withUser(String user) {
        this.user = user;
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

    public Tbraccd__1 withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbraccd__1 withTermCode(String termCode) {
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

    public Tbraccd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbraccd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crossrefDetailCode");
        sb.append('=');
        sb.append(((this.crossrefDetailCode == null)?"<null>":this.crossrefDetailCode));
        sb.append(',');
        sb.append("taxReptBoxSg");
        sb.append('=');
        sb.append(((this.taxReptBoxSg == null)?"<null>":this.taxReptBoxSg));
        sb.append(',');
        sb.append("additionalText");
        sb.append('=');
        sb.append(((this.additionalText == null)?"<null>":this.additionalText));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("statementDate");
        sb.append('=');
        sb.append(((this.statementDate == null)?"<null>":this.statementDate));
        sb.append(',');
        sb.append("taxFutureInd");
        sb.append('=');
        sb.append(((this.taxFutureInd == null)?"<null>":this.taxFutureInd));
        sb.append(',');
        sb.append("taxReptBox");
        sb.append('=');
        sb.append(((this.taxReptBox == null)?"<null>":this.taxReptBox));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("taxFutureIndPr");
        sb.append('=');
        sb.append(((this.taxFutureIndPr == null)?"<null>":this.taxFutureIndPr));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("crossrefDcatCode");
        sb.append('=');
        sb.append(((this.crossrefDcatCode == null)?"<null>":this.crossrefDcatCode));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("currCodeV");
        sb.append('=');
        sb.append(((this.currCodeV == null)?"<null>":this.currCodeV));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("cshrEndDate");
        sb.append('=');
        sb.append(((this.cshrEndDate == null)?"<null>":this.cshrEndDate));
        sb.append(',');
        sb.append("billDate");
        sb.append('=');
        sb.append(((this.billDate == null)?"<null>":this.billDate));
        sb.append(',');
        sb.append("crossrefSrceCode");
        sb.append('=');
        sb.append(((this.crossrefSrceCode == null)?"<null>":this.crossrefSrceCode));
        sb.append(',');
        sb.append("taxReptYear");
        sb.append('=');
        sb.append(((this.taxReptYear == null)?"<null>":this.taxReptYear));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("taxReptBoxPr");
        sb.append('=');
        sb.append(((this.taxReptBoxPr == null)?"<null>":this.taxReptBoxPr));
        sb.append(',');
        sb.append("crossrefNumber");
        sb.append('=');
        sb.append(((this.crossrefNumber == null)?"<null>":this.crossrefNumber));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("studypathName");
        sb.append('=');
        sb.append(((this.studypathName == null)?"<null>":this.studypathName));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("taxFutureIndSg");
        sb.append('=');
        sb.append(((this.taxFutureIndSg == null)?"<null>":this.taxFutureIndSg));
        sb.append(',');
        sb.append("aidyCode");
        sb.append('=');
        sb.append(((this.aidyCode == null)?"<null>":this.aidyCode));
        sb.append(',');
        sb.append("feedDate");
        sb.append('=');
        sb.append(((this.feedDate == null)?"<null>":this.feedDate));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("crossrefId");
        sb.append('=');
        sb.append(((this.crossrefId == null)?"<null>":this.crossrefId));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("createSource");
        sb.append('=');
        sb.append(((this.createSource == null)?"<null>":this.createSource));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
        sb.append(',');
        sb.append("feedDocCode");
        sb.append('=');
        sb.append(((this.feedDocCode == null)?"<null>":this.feedDocCode));
        sb.append(',');
        sb.append("sessionNumber");
        sb.append('=');
        sb.append(((this.sessionNumber == null)?"<null>":this.sessionNumber));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.crossrefDetailCode == null)? 0 :this.crossrefDetailCode.hashCode()));
        result = ((result* 31)+((this.taxReptBoxSg == null)? 0 :this.taxReptBoxSg.hashCode()));
        result = ((result* 31)+((this.additionalText == null)? 0 :this.additionalText.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.statementDate == null)? 0 :this.statementDate.hashCode()));
        result = ((result* 31)+((this.taxFutureInd == null)? 0 :this.taxFutureInd.hashCode()));
        result = ((result* 31)+((this.taxReptBox == null)? 0 :this.taxReptBox.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.taxFutureIndPr == null)? 0 :this.taxFutureIndPr.hashCode()));
        result = ((result* 31)+((this.merchantId == null)? 0 :this.merchantId.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.crossrefDcatCode == null)? 0 :this.crossrefDcatCode.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.currCodeV == null)? 0 :this.currCodeV.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.cshrEndDate == null)? 0 :this.cshrEndDate.hashCode()));
        result = ((result* 31)+((this.billDate == null)? 0 :this.billDate.hashCode()));
        result = ((result* 31)+((this.crossrefSrceCode == null)? 0 :this.crossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.taxReptYear == null)? 0 :this.taxReptYear.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.taxReptBoxPr == null)? 0 :this.taxReptBoxPr.hashCode()));
        result = ((result* 31)+((this.crossrefNumber == null)? 0 :this.crossrefNumber.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.studypathName == null)? 0 :this.studypathName.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.taxFutureIndSg == null)? 0 :this.taxFutureIndSg.hashCode()));
        result = ((result* 31)+((this.aidyCode == null)? 0 :this.aidyCode.hashCode()));
        result = ((result* 31)+((this.feedDate == null)? 0 :this.feedDate.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.crossrefId == null)? 0 :this.crossrefId.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.createSource == null)? 0 :this.createSource.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.feedDocCode == null)? 0 :this.feedDocCode.hashCode()));
        result = ((result* 31)+((this.sessionNumber == null)? 0 :this.sessionNumber.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbraccd__1) == false) {
            return false;
        }
        Tbraccd__1 rhs = ((Tbraccd__1) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.crossrefDetailCode == rhs.crossrefDetailCode)||((this.crossrefDetailCode!= null)&&this.crossrefDetailCode.equals(rhs.crossrefDetailCode)))&&((this.taxReptBoxSg == rhs.taxReptBoxSg)||((this.taxReptBoxSg!= null)&&this.taxReptBoxSg.equals(rhs.taxReptBoxSg))))&&((this.additionalText == rhs.additionalText)||((this.additionalText!= null)&&this.additionalText.equals(rhs.additionalText))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.statementDate == rhs.statementDate)||((this.statementDate!= null)&&this.statementDate.equals(rhs.statementDate))))&&((this.taxFutureInd == rhs.taxFutureInd)||((this.taxFutureInd!= null)&&this.taxFutureInd.equals(rhs.taxFutureInd))))&&((this.taxReptBox == rhs.taxReptBox)||((this.taxReptBox!= null)&&this.taxReptBox.equals(rhs.taxReptBox))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.taxFutureIndPr == rhs.taxFutureIndPr)||((this.taxFutureIndPr!= null)&&this.taxFutureIndPr.equals(rhs.taxFutureIndPr))))&&((this.merchantId == rhs.merchantId)||((this.merchantId!= null)&&this.merchantId.equals(rhs.merchantId))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.crossrefDcatCode == rhs.crossrefDcatCode)||((this.crossrefDcatCode!= null)&&this.crossrefDcatCode.equals(rhs.crossrefDcatCode))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.currCodeV == rhs.currCodeV)||((this.currCodeV!= null)&&this.currCodeV.equals(rhs.currCodeV))))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.cshrEndDate == rhs.cshrEndDate)||((this.cshrEndDate!= null)&&this.cshrEndDate.equals(rhs.cshrEndDate))))&&((this.billDate == rhs.billDate)||((this.billDate!= null)&&this.billDate.equals(rhs.billDate))))&&((this.crossrefSrceCode == rhs.crossrefSrceCode)||((this.crossrefSrceCode!= null)&&this.crossrefSrceCode.equals(rhs.crossrefSrceCode))))&&((this.taxReptYear == rhs.taxReptYear)||((this.taxReptYear!= null)&&this.taxReptYear.equals(rhs.taxReptYear))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.taxReptBoxPr == rhs.taxReptBoxPr)||((this.taxReptBoxPr!= null)&&this.taxReptBoxPr.equals(rhs.taxReptBoxPr))))&&((this.crossrefNumber == rhs.crossrefNumber)||((this.crossrefNumber!= null)&&this.crossrefNumber.equals(rhs.crossrefNumber))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.studypathName == rhs.studypathName)||((this.studypathName!= null)&&this.studypathName.equals(rhs.studypathName))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.taxFutureIndSg == rhs.taxFutureIndSg)||((this.taxFutureIndSg!= null)&&this.taxFutureIndSg.equals(rhs.taxFutureIndSg))))&&((this.aidyCode == rhs.aidyCode)||((this.aidyCode!= null)&&this.aidyCode.equals(rhs.aidyCode))))&&((this.feedDate == rhs.feedDate)||((this.feedDate!= null)&&this.feedDate.equals(rhs.feedDate))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.crossrefId == rhs.crossrefId)||((this.crossrefId!= null)&&this.crossrefId.equals(rhs.crossrefId))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.createSource == rhs.createSource)||((this.createSource!= null)&&this.createSource.equals(rhs.createSource))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.feedDocCode == rhs.feedDocCode)||((this.feedDocCode!= null)&&this.feedDocCode.equals(rhs.feedDocCode))))&&((this.sessionNumber == rhs.sessionNumber)||((this.sessionNumber!= null)&&this.sessionNumber.equals(rhs.sessionNumber))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
