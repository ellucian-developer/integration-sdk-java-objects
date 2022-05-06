
package com.ellucian.generated.bpapi.ban.account_detail_query.v1_0_0;

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
    "tbvaccdTranNumber",
    "currCode",
    "tbvaccdCrn",
    "tbvaccdDesc",
    "tbvaccdCpdtInd",
    "tbvaccdUser",
    "tbvaccdName",
    "tbvaccdActivityDate",
    "tbvaccdPeriod",
    "tbvaccdFeedDocCode",
    "tbvaccdSessionNumber",
    "tbvaccdEffectiveDate",
    "tbvaccdAidyCode",
    "tbvaccdBalance",
    "tbvaccdStatementDate",
    "tbvaccdAcctFeedInd",
    "tbvaccdCrossrefId",
    "tbvaccdTermCode",
    "tbvaccdInvNumberPaid",
    "tbvaccdCshrEndDate",
    "tbvaccdFeedDate",
    "tbvaccdTranNumberPaid",
    "tbvaccdBillDate",
    "tbvaccdDueDate",
    "tbvaccdCrossrefSrceCode",
    "tbvaccdCrossrefNumber",
    "tbvaccdInvoiceNumber",
    "tbvaccdReceiptNumber",
    "tbvaccdId",
    "tbvaccdAmount",
    "tbvaccdSrceCode",
    "tbvaccdDetailCode"
})
@Generated("jsonschema2pojo")
public class AccountDetailQuery100GetResponse {

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tbvaccdTranNumber")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_TRAN_NUMBER")
    private Double tbvaccdTranNumber;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Course Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CRN
     * 
     */
    @JsonProperty("tbvaccdCrn")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CRN")
    private String tbvaccdCrn;
    /**
     * Description
     * <p>
     * Lineage reference object : TBVACCD_DESC
     * 
     */
    @JsonProperty("tbvaccdDesc")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_DESC")
    private String tbvaccdDesc;
    /**
     * Contract Payment
     * <p>
     * Lineage reference object : TBVACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbvaccdCpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CPDT_IND")
    private String tbvaccdCpdtInd;
    /**
     * Cashier User ID
     * <p>
     * Lineage reference object : TBVACCD_USER
     * 
     */
    @JsonProperty("tbvaccdUser")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_USER")
    private String tbvaccdUser;
    /**
     * Name
     * <p>
     * Lineage reference object : TBVACCD_NAME
     * 
     */
    @JsonProperty("tbvaccdName")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_NAME")
    private String tbvaccdName;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBVACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbvaccdActivityDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_ACTIVITY_DATE")
    private Date tbvaccdActivityDate;
    /**
     * Period
     * <p>
     * Lineage reference object : TBVACCD_PERIOD
     * 
     */
    @JsonProperty("tbvaccdPeriod")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_PERIOD")
    private String tbvaccdPeriod;
    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("tbvaccdFeedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_FEED_DOC_CODE")
    private String tbvaccdFeedDocCode;
    /**
     * Cashier Session
     * <p>
     * Lineage reference object : TBVACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("tbvaccdSessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_SESSION_NUMBER")
    private Double tbvaccdSessionNumber;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("tbvaccdEffectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_EFFECTIVE_DATE")
    private Date tbvaccdEffectiveDate;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVACCD_AIDY_CODE
     * 
     */
    @JsonProperty("tbvaccdAidyCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_AIDY_CODE")
    private String tbvaccdAidyCode;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBVACCD_BALANCE
     * 
     */
    @JsonProperty("tbvaccdBalance")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_BALANCE")
    private Double tbvaccdBalance;
    /**
     * Invoice Statement Date
     * <p>
     * Lineage reference object : TBVACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("tbvaccdStatementDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_STATEMENT_DATE")
    private Date tbvaccdStatementDate;
    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBVACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("tbvaccdAcctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_ACCT_FEED_IND")
    private String tbvaccdAcctFeedInd;
    /**
     * Cross Reference ID
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_ID
     * 
     */
    @JsonProperty("tbvaccdCrossrefId")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CROSSREF_ID")
    private String tbvaccdCrossrefId;
    /**
     * Term
     * <p>
     * Lineage reference object : TBVACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbvaccdTermCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_TERM_CODE, Lookup lineage reference object : stvterm")
    private String tbvaccdTermCode;
    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBVACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdInvNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_INV_NUMBER_PAID")
    private String tbvaccdInvNumberPaid;
    /**
     * Cashier End Date
     * <p>
     * Lineage reference object : TBVACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("tbvaccdCshrEndDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CSHR_END_DATE")
    private Date tbvaccdCshrEndDate;
    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVACCD_FEED_DATE
     * 
     */
    @JsonProperty("tbvaccdFeedDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_FEED_DATE")
    private Date tbvaccdFeedDate;
    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdTranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_TRAN_NUMBER_PAID")
    private Double tbvaccdTranNumberPaid;
    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVACCD_BILL_DATE
     * 
     */
    @JsonProperty("tbvaccdBillDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_BILL_DATE")
    private Date tbvaccdBillDate;
    /**
     * Due Date
     * <p>
     * Lineage reference object : TBVACCD_DUE_DATE
     * 
     */
    @JsonProperty("tbvaccdDueDate")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_DUE_DATE")
    private Date tbvaccdDueDate;
    /**
     * Cross Reference Source
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("tbvaccdCrossrefSrceCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CROSSREF_SRCE_CODE")
    private String tbvaccdCrossrefSrceCode;
    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("tbvaccdCrossrefNumber")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_CROSSREF_NUMBER")
    private Double tbvaccdCrossrefNumber;
    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBVACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("tbvaccdInvoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_INVOICE_NUMBER")
    private String tbvaccdInvoiceNumber;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBVACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("tbvaccdReceiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_RECEIPT_NUMBER")
    private Double tbvaccdReceiptNumber;
    /**
     * ID
     * <p>
     * Lineage reference object : TBVACCD_ID
     * 
     */
    @JsonProperty("tbvaccdId")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_ID")
    private String tbvaccdId;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBVACCD_AMOUNT
     * 
     */
    @JsonProperty("tbvaccdAmount")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_AMOUNT")
    private Double tbvaccdAmount;
    /**
     * Source Code
     * <p>
     * Lineage reference object : TBVACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("tbvaccdSrceCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String tbvaccdSrceCode;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVACCD_DETAIL_CODE
     * 
     */
    @JsonProperty("tbvaccdDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBVACCD_DETAIL_CODE")
    private String tbvaccdDetailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tbvaccdTranNumber")
    public Double getTbvaccdTranNumber() {
        return tbvaccdTranNumber;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tbvaccdTranNumber")
    public void setTbvaccdTranNumber(Double tbvaccdTranNumber) {
        this.tbvaccdTranNumber = tbvaccdTranNumber;
    }

    public AccountDetailQuery100GetResponse withTbvaccdTranNumber(Double tbvaccdTranNumber) {
        this.tbvaccdTranNumber = tbvaccdTranNumber;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public AccountDetailQuery100GetResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Course Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CRN
     * 
     */
    @JsonProperty("tbvaccdCrn")
    public String getTbvaccdCrn() {
        return tbvaccdCrn;
    }

    /**
     * Course Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CRN
     * 
     */
    @JsonProperty("tbvaccdCrn")
    public void setTbvaccdCrn(String tbvaccdCrn) {
        this.tbvaccdCrn = tbvaccdCrn;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCrn(String tbvaccdCrn) {
        this.tbvaccdCrn = tbvaccdCrn;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBVACCD_DESC
     * 
     */
    @JsonProperty("tbvaccdDesc")
    public String getTbvaccdDesc() {
        return tbvaccdDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBVACCD_DESC
     * 
     */
    @JsonProperty("tbvaccdDesc")
    public void setTbvaccdDesc(String tbvaccdDesc) {
        this.tbvaccdDesc = tbvaccdDesc;
    }

    public AccountDetailQuery100GetResponse withTbvaccdDesc(String tbvaccdDesc) {
        this.tbvaccdDesc = tbvaccdDesc;
        return this;
    }

    /**
     * Contract Payment
     * <p>
     * Lineage reference object : TBVACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbvaccdCpdtInd")
    public String getTbvaccdCpdtInd() {
        return tbvaccdCpdtInd;
    }

    /**
     * Contract Payment
     * <p>
     * Lineage reference object : TBVACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbvaccdCpdtInd")
    public void setTbvaccdCpdtInd(String tbvaccdCpdtInd) {
        this.tbvaccdCpdtInd = tbvaccdCpdtInd;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCpdtInd(String tbvaccdCpdtInd) {
        this.tbvaccdCpdtInd = tbvaccdCpdtInd;
        return this;
    }

    /**
     * Cashier User ID
     * <p>
     * Lineage reference object : TBVACCD_USER
     * 
     */
    @JsonProperty("tbvaccdUser")
    public String getTbvaccdUser() {
        return tbvaccdUser;
    }

    /**
     * Cashier User ID
     * <p>
     * Lineage reference object : TBVACCD_USER
     * 
     */
    @JsonProperty("tbvaccdUser")
    public void setTbvaccdUser(String tbvaccdUser) {
        this.tbvaccdUser = tbvaccdUser;
    }

    public AccountDetailQuery100GetResponse withTbvaccdUser(String tbvaccdUser) {
        this.tbvaccdUser = tbvaccdUser;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBVACCD_NAME
     * 
     */
    @JsonProperty("tbvaccdName")
    public String getTbvaccdName() {
        return tbvaccdName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBVACCD_NAME
     * 
     */
    @JsonProperty("tbvaccdName")
    public void setTbvaccdName(String tbvaccdName) {
        this.tbvaccdName = tbvaccdName;
    }

    public AccountDetailQuery100GetResponse withTbvaccdName(String tbvaccdName) {
        this.tbvaccdName = tbvaccdName;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBVACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbvaccdActivityDate")
    public Date getTbvaccdActivityDate() {
        return tbvaccdActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBVACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbvaccdActivityDate")
    public void setTbvaccdActivityDate(Date tbvaccdActivityDate) {
        this.tbvaccdActivityDate = tbvaccdActivityDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdActivityDate(Date tbvaccdActivityDate) {
        this.tbvaccdActivityDate = tbvaccdActivityDate;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBVACCD_PERIOD
     * 
     */
    @JsonProperty("tbvaccdPeriod")
    public String getTbvaccdPeriod() {
        return tbvaccdPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBVACCD_PERIOD
     * 
     */
    @JsonProperty("tbvaccdPeriod")
    public void setTbvaccdPeriod(String tbvaccdPeriod) {
        this.tbvaccdPeriod = tbvaccdPeriod;
    }

    public AccountDetailQuery100GetResponse withTbvaccdPeriod(String tbvaccdPeriod) {
        this.tbvaccdPeriod = tbvaccdPeriod;
        return this;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("tbvaccdFeedDocCode")
    public String getTbvaccdFeedDocCode() {
        return tbvaccdFeedDocCode;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("tbvaccdFeedDocCode")
    public void setTbvaccdFeedDocCode(String tbvaccdFeedDocCode) {
        this.tbvaccdFeedDocCode = tbvaccdFeedDocCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdFeedDocCode(String tbvaccdFeedDocCode) {
        this.tbvaccdFeedDocCode = tbvaccdFeedDocCode;
        return this;
    }

    /**
     * Cashier Session
     * <p>
     * Lineage reference object : TBVACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("tbvaccdSessionNumber")
    public Double getTbvaccdSessionNumber() {
        return tbvaccdSessionNumber;
    }

    /**
     * Cashier Session
     * <p>
     * Lineage reference object : TBVACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("tbvaccdSessionNumber")
    public void setTbvaccdSessionNumber(Double tbvaccdSessionNumber) {
        this.tbvaccdSessionNumber = tbvaccdSessionNumber;
    }

    public AccountDetailQuery100GetResponse withTbvaccdSessionNumber(Double tbvaccdSessionNumber) {
        this.tbvaccdSessionNumber = tbvaccdSessionNumber;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("tbvaccdEffectiveDate")
    public Date getTbvaccdEffectiveDate() {
        return tbvaccdEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVACCD_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("tbvaccdEffectiveDate")
    public void setTbvaccdEffectiveDate(Date tbvaccdEffectiveDate) {
        this.tbvaccdEffectiveDate = tbvaccdEffectiveDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdEffectiveDate(Date tbvaccdEffectiveDate) {
        this.tbvaccdEffectiveDate = tbvaccdEffectiveDate;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVACCD_AIDY_CODE
     * 
     */
    @JsonProperty("tbvaccdAidyCode")
    public String getTbvaccdAidyCode() {
        return tbvaccdAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVACCD_AIDY_CODE
     * 
     */
    @JsonProperty("tbvaccdAidyCode")
    public void setTbvaccdAidyCode(String tbvaccdAidyCode) {
        this.tbvaccdAidyCode = tbvaccdAidyCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdAidyCode(String tbvaccdAidyCode) {
        this.tbvaccdAidyCode = tbvaccdAidyCode;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVACCD_BALANCE
     * 
     */
    @JsonProperty("tbvaccdBalance")
    public Double getTbvaccdBalance() {
        return tbvaccdBalance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVACCD_BALANCE
     * 
     */
    @JsonProperty("tbvaccdBalance")
    public void setTbvaccdBalance(Double tbvaccdBalance) {
        this.tbvaccdBalance = tbvaccdBalance;
    }

    public AccountDetailQuery100GetResponse withTbvaccdBalance(Double tbvaccdBalance) {
        this.tbvaccdBalance = tbvaccdBalance;
        return this;
    }

    /**
     * Invoice Statement Date
     * <p>
     * Lineage reference object : TBVACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("tbvaccdStatementDate")
    public Date getTbvaccdStatementDate() {
        return tbvaccdStatementDate;
    }

    /**
     * Invoice Statement Date
     * <p>
     * Lineage reference object : TBVACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("tbvaccdStatementDate")
    public void setTbvaccdStatementDate(Date tbvaccdStatementDate) {
        this.tbvaccdStatementDate = tbvaccdStatementDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdStatementDate(Date tbvaccdStatementDate) {
        this.tbvaccdStatementDate = tbvaccdStatementDate;
        return this;
    }

    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBVACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("tbvaccdAcctFeedInd")
    public String getTbvaccdAcctFeedInd() {
        return tbvaccdAcctFeedInd;
    }

    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBVACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("tbvaccdAcctFeedInd")
    public void setTbvaccdAcctFeedInd(String tbvaccdAcctFeedInd) {
        this.tbvaccdAcctFeedInd = tbvaccdAcctFeedInd;
    }

    public AccountDetailQuery100GetResponse withTbvaccdAcctFeedInd(String tbvaccdAcctFeedInd) {
        this.tbvaccdAcctFeedInd = tbvaccdAcctFeedInd;
        return this;
    }

    /**
     * Cross Reference ID
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_ID
     * 
     */
    @JsonProperty("tbvaccdCrossrefId")
    public String getTbvaccdCrossrefId() {
        return tbvaccdCrossrefId;
    }

    /**
     * Cross Reference ID
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_ID
     * 
     */
    @JsonProperty("tbvaccdCrossrefId")
    public void setTbvaccdCrossrefId(String tbvaccdCrossrefId) {
        this.tbvaccdCrossrefId = tbvaccdCrossrefId;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCrossrefId(String tbvaccdCrossrefId) {
        this.tbvaccdCrossrefId = tbvaccdCrossrefId;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbvaccdTermCode")
    public String getTbvaccdTermCode() {
        return tbvaccdTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbvaccdTermCode")
    public void setTbvaccdTermCode(String tbvaccdTermCode) {
        this.tbvaccdTermCode = tbvaccdTermCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdTermCode(String tbvaccdTermCode) {
        this.tbvaccdTermCode = tbvaccdTermCode;
        return this;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBVACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdInvNumberPaid")
    public String getTbvaccdInvNumberPaid() {
        return tbvaccdInvNumberPaid;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBVACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdInvNumberPaid")
    public void setTbvaccdInvNumberPaid(String tbvaccdInvNumberPaid) {
        this.tbvaccdInvNumberPaid = tbvaccdInvNumberPaid;
    }

    public AccountDetailQuery100GetResponse withTbvaccdInvNumberPaid(String tbvaccdInvNumberPaid) {
        this.tbvaccdInvNumberPaid = tbvaccdInvNumberPaid;
        return this;
    }

    /**
     * Cashier End Date
     * <p>
     * Lineage reference object : TBVACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("tbvaccdCshrEndDate")
    public Date getTbvaccdCshrEndDate() {
        return tbvaccdCshrEndDate;
    }

    /**
     * Cashier End Date
     * <p>
     * Lineage reference object : TBVACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("tbvaccdCshrEndDate")
    public void setTbvaccdCshrEndDate(Date tbvaccdCshrEndDate) {
        this.tbvaccdCshrEndDate = tbvaccdCshrEndDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCshrEndDate(Date tbvaccdCshrEndDate) {
        this.tbvaccdCshrEndDate = tbvaccdCshrEndDate;
        return this;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVACCD_FEED_DATE
     * 
     */
    @JsonProperty("tbvaccdFeedDate")
    public Date getTbvaccdFeedDate() {
        return tbvaccdFeedDate;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVACCD_FEED_DATE
     * 
     */
    @JsonProperty("tbvaccdFeedDate")
    public void setTbvaccdFeedDate(Date tbvaccdFeedDate) {
        this.tbvaccdFeedDate = tbvaccdFeedDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdFeedDate(Date tbvaccdFeedDate) {
        this.tbvaccdFeedDate = tbvaccdFeedDate;
        return this;
    }

    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdTranNumberPaid")
    public Double getTbvaccdTranNumberPaid() {
        return tbvaccdTranNumberPaid;
    }

    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBVACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tbvaccdTranNumberPaid")
    public void setTbvaccdTranNumberPaid(Double tbvaccdTranNumberPaid) {
        this.tbvaccdTranNumberPaid = tbvaccdTranNumberPaid;
    }

    public AccountDetailQuery100GetResponse withTbvaccdTranNumberPaid(Double tbvaccdTranNumberPaid) {
        this.tbvaccdTranNumberPaid = tbvaccdTranNumberPaid;
        return this;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVACCD_BILL_DATE
     * 
     */
    @JsonProperty("tbvaccdBillDate")
    public Date getTbvaccdBillDate() {
        return tbvaccdBillDate;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVACCD_BILL_DATE
     * 
     */
    @JsonProperty("tbvaccdBillDate")
    public void setTbvaccdBillDate(Date tbvaccdBillDate) {
        this.tbvaccdBillDate = tbvaccdBillDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdBillDate(Date tbvaccdBillDate) {
        this.tbvaccdBillDate = tbvaccdBillDate;
        return this;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBVACCD_DUE_DATE
     * 
     */
    @JsonProperty("tbvaccdDueDate")
    public Date getTbvaccdDueDate() {
        return tbvaccdDueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBVACCD_DUE_DATE
     * 
     */
    @JsonProperty("tbvaccdDueDate")
    public void setTbvaccdDueDate(Date tbvaccdDueDate) {
        this.tbvaccdDueDate = tbvaccdDueDate;
    }

    public AccountDetailQuery100GetResponse withTbvaccdDueDate(Date tbvaccdDueDate) {
        this.tbvaccdDueDate = tbvaccdDueDate;
        return this;
    }

    /**
     * Cross Reference Source
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("tbvaccdCrossrefSrceCode")
    public String getTbvaccdCrossrefSrceCode() {
        return tbvaccdCrossrefSrceCode;
    }

    /**
     * Cross Reference Source
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("tbvaccdCrossrefSrceCode")
    public void setTbvaccdCrossrefSrceCode(String tbvaccdCrossrefSrceCode) {
        this.tbvaccdCrossrefSrceCode = tbvaccdCrossrefSrceCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCrossrefSrceCode(String tbvaccdCrossrefSrceCode) {
        this.tbvaccdCrossrefSrceCode = tbvaccdCrossrefSrceCode;
        return this;
    }

    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("tbvaccdCrossrefNumber")
    public Double getTbvaccdCrossrefNumber() {
        return tbvaccdCrossrefNumber;
    }

    /**
     * Cross Reference Number
     * <p>
     * Lineage reference object : TBVACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("tbvaccdCrossrefNumber")
    public void setTbvaccdCrossrefNumber(Double tbvaccdCrossrefNumber) {
        this.tbvaccdCrossrefNumber = tbvaccdCrossrefNumber;
    }

    public AccountDetailQuery100GetResponse withTbvaccdCrossrefNumber(Double tbvaccdCrossrefNumber) {
        this.tbvaccdCrossrefNumber = tbvaccdCrossrefNumber;
        return this;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBVACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("tbvaccdInvoiceNumber")
    public String getTbvaccdInvoiceNumber() {
        return tbvaccdInvoiceNumber;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBVACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("tbvaccdInvoiceNumber")
    public void setTbvaccdInvoiceNumber(String tbvaccdInvoiceNumber) {
        this.tbvaccdInvoiceNumber = tbvaccdInvoiceNumber;
    }

    public AccountDetailQuery100GetResponse withTbvaccdInvoiceNumber(String tbvaccdInvoiceNumber) {
        this.tbvaccdInvoiceNumber = tbvaccdInvoiceNumber;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBVACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("tbvaccdReceiptNumber")
    public Double getTbvaccdReceiptNumber() {
        return tbvaccdReceiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBVACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("tbvaccdReceiptNumber")
    public void setTbvaccdReceiptNumber(Double tbvaccdReceiptNumber) {
        this.tbvaccdReceiptNumber = tbvaccdReceiptNumber;
    }

    public AccountDetailQuery100GetResponse withTbvaccdReceiptNumber(Double tbvaccdReceiptNumber) {
        this.tbvaccdReceiptNumber = tbvaccdReceiptNumber;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBVACCD_ID
     * 
     */
    @JsonProperty("tbvaccdId")
    public String getTbvaccdId() {
        return tbvaccdId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBVACCD_ID
     * 
     */
    @JsonProperty("tbvaccdId")
    public void setTbvaccdId(String tbvaccdId) {
        this.tbvaccdId = tbvaccdId;
    }

    public AccountDetailQuery100GetResponse withTbvaccdId(String tbvaccdId) {
        this.tbvaccdId = tbvaccdId;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVACCD_AMOUNT
     * 
     */
    @JsonProperty("tbvaccdAmount")
    public Double getTbvaccdAmount() {
        return tbvaccdAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVACCD_AMOUNT
     * 
     */
    @JsonProperty("tbvaccdAmount")
    public void setTbvaccdAmount(Double tbvaccdAmount) {
        this.tbvaccdAmount = tbvaccdAmount;
    }

    public AccountDetailQuery100GetResponse withTbvaccdAmount(Double tbvaccdAmount) {
        this.tbvaccdAmount = tbvaccdAmount;
        return this;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : TBVACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("tbvaccdSrceCode")
    public String getTbvaccdSrceCode() {
        return tbvaccdSrceCode;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : TBVACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("tbvaccdSrceCode")
    public void setTbvaccdSrceCode(String tbvaccdSrceCode) {
        this.tbvaccdSrceCode = tbvaccdSrceCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdSrceCode(String tbvaccdSrceCode) {
        this.tbvaccdSrceCode = tbvaccdSrceCode;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVACCD_DETAIL_CODE
     * 
     */
    @JsonProperty("tbvaccdDetailCode")
    public String getTbvaccdDetailCode() {
        return tbvaccdDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVACCD_DETAIL_CODE
     * 
     */
    @JsonProperty("tbvaccdDetailCode")
    public void setTbvaccdDetailCode(String tbvaccdDetailCode) {
        this.tbvaccdDetailCode = tbvaccdDetailCode;
    }

    public AccountDetailQuery100GetResponse withTbvaccdDetailCode(String tbvaccdDetailCode) {
        this.tbvaccdDetailCode = tbvaccdDetailCode;
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

    public AccountDetailQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbvaccdTranNumber");
        sb.append('=');
        sb.append(((this.tbvaccdTranNumber == null)?"<null>":this.tbvaccdTranNumber));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("tbvaccdCrn");
        sb.append('=');
        sb.append(((this.tbvaccdCrn == null)?"<null>":this.tbvaccdCrn));
        sb.append(',');
        sb.append("tbvaccdDesc");
        sb.append('=');
        sb.append(((this.tbvaccdDesc == null)?"<null>":this.tbvaccdDesc));
        sb.append(',');
        sb.append("tbvaccdCpdtInd");
        sb.append('=');
        sb.append(((this.tbvaccdCpdtInd == null)?"<null>":this.tbvaccdCpdtInd));
        sb.append(',');
        sb.append("tbvaccdUser");
        sb.append('=');
        sb.append(((this.tbvaccdUser == null)?"<null>":this.tbvaccdUser));
        sb.append(',');
        sb.append("tbvaccdName");
        sb.append('=');
        sb.append(((this.tbvaccdName == null)?"<null>":this.tbvaccdName));
        sb.append(',');
        sb.append("tbvaccdActivityDate");
        sb.append('=');
        sb.append(((this.tbvaccdActivityDate == null)?"<null>":this.tbvaccdActivityDate));
        sb.append(',');
        sb.append("tbvaccdPeriod");
        sb.append('=');
        sb.append(((this.tbvaccdPeriod == null)?"<null>":this.tbvaccdPeriod));
        sb.append(',');
        sb.append("tbvaccdFeedDocCode");
        sb.append('=');
        sb.append(((this.tbvaccdFeedDocCode == null)?"<null>":this.tbvaccdFeedDocCode));
        sb.append(',');
        sb.append("tbvaccdSessionNumber");
        sb.append('=');
        sb.append(((this.tbvaccdSessionNumber == null)?"<null>":this.tbvaccdSessionNumber));
        sb.append(',');
        sb.append("tbvaccdEffectiveDate");
        sb.append('=');
        sb.append(((this.tbvaccdEffectiveDate == null)?"<null>":this.tbvaccdEffectiveDate));
        sb.append(',');
        sb.append("tbvaccdAidyCode");
        sb.append('=');
        sb.append(((this.tbvaccdAidyCode == null)?"<null>":this.tbvaccdAidyCode));
        sb.append(',');
        sb.append("tbvaccdBalance");
        sb.append('=');
        sb.append(((this.tbvaccdBalance == null)?"<null>":this.tbvaccdBalance));
        sb.append(',');
        sb.append("tbvaccdStatementDate");
        sb.append('=');
        sb.append(((this.tbvaccdStatementDate == null)?"<null>":this.tbvaccdStatementDate));
        sb.append(',');
        sb.append("tbvaccdAcctFeedInd");
        sb.append('=');
        sb.append(((this.tbvaccdAcctFeedInd == null)?"<null>":this.tbvaccdAcctFeedInd));
        sb.append(',');
        sb.append("tbvaccdCrossrefId");
        sb.append('=');
        sb.append(((this.tbvaccdCrossrefId == null)?"<null>":this.tbvaccdCrossrefId));
        sb.append(',');
        sb.append("tbvaccdTermCode");
        sb.append('=');
        sb.append(((this.tbvaccdTermCode == null)?"<null>":this.tbvaccdTermCode));
        sb.append(',');
        sb.append("tbvaccdInvNumberPaid");
        sb.append('=');
        sb.append(((this.tbvaccdInvNumberPaid == null)?"<null>":this.tbvaccdInvNumberPaid));
        sb.append(',');
        sb.append("tbvaccdCshrEndDate");
        sb.append('=');
        sb.append(((this.tbvaccdCshrEndDate == null)?"<null>":this.tbvaccdCshrEndDate));
        sb.append(',');
        sb.append("tbvaccdFeedDate");
        sb.append('=');
        sb.append(((this.tbvaccdFeedDate == null)?"<null>":this.tbvaccdFeedDate));
        sb.append(',');
        sb.append("tbvaccdTranNumberPaid");
        sb.append('=');
        sb.append(((this.tbvaccdTranNumberPaid == null)?"<null>":this.tbvaccdTranNumberPaid));
        sb.append(',');
        sb.append("tbvaccdBillDate");
        sb.append('=');
        sb.append(((this.tbvaccdBillDate == null)?"<null>":this.tbvaccdBillDate));
        sb.append(',');
        sb.append("tbvaccdDueDate");
        sb.append('=');
        sb.append(((this.tbvaccdDueDate == null)?"<null>":this.tbvaccdDueDate));
        sb.append(',');
        sb.append("tbvaccdCrossrefSrceCode");
        sb.append('=');
        sb.append(((this.tbvaccdCrossrefSrceCode == null)?"<null>":this.tbvaccdCrossrefSrceCode));
        sb.append(',');
        sb.append("tbvaccdCrossrefNumber");
        sb.append('=');
        sb.append(((this.tbvaccdCrossrefNumber == null)?"<null>":this.tbvaccdCrossrefNumber));
        sb.append(',');
        sb.append("tbvaccdInvoiceNumber");
        sb.append('=');
        sb.append(((this.tbvaccdInvoiceNumber == null)?"<null>":this.tbvaccdInvoiceNumber));
        sb.append(',');
        sb.append("tbvaccdReceiptNumber");
        sb.append('=');
        sb.append(((this.tbvaccdReceiptNumber == null)?"<null>":this.tbvaccdReceiptNumber));
        sb.append(',');
        sb.append("tbvaccdId");
        sb.append('=');
        sb.append(((this.tbvaccdId == null)?"<null>":this.tbvaccdId));
        sb.append(',');
        sb.append("tbvaccdAmount");
        sb.append('=');
        sb.append(((this.tbvaccdAmount == null)?"<null>":this.tbvaccdAmount));
        sb.append(',');
        sb.append("tbvaccdSrceCode");
        sb.append('=');
        sb.append(((this.tbvaccdSrceCode == null)?"<null>":this.tbvaccdSrceCode));
        sb.append(',');
        sb.append("tbvaccdDetailCode");
        sb.append('=');
        sb.append(((this.tbvaccdDetailCode == null)?"<null>":this.tbvaccdDetailCode));
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
        result = ((result* 31)+((this.tbvaccdTranNumber == null)? 0 :this.tbvaccdTranNumber.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.tbvaccdCrn == null)? 0 :this.tbvaccdCrn.hashCode()));
        result = ((result* 31)+((this.tbvaccdDesc == null)? 0 :this.tbvaccdDesc.hashCode()));
        result = ((result* 31)+((this.tbvaccdCpdtInd == null)? 0 :this.tbvaccdCpdtInd.hashCode()));
        result = ((result* 31)+((this.tbvaccdUser == null)? 0 :this.tbvaccdUser.hashCode()));
        result = ((result* 31)+((this.tbvaccdName == null)? 0 :this.tbvaccdName.hashCode()));
        result = ((result* 31)+((this.tbvaccdActivityDate == null)? 0 :this.tbvaccdActivityDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdPeriod == null)? 0 :this.tbvaccdPeriod.hashCode()));
        result = ((result* 31)+((this.tbvaccdFeedDocCode == null)? 0 :this.tbvaccdFeedDocCode.hashCode()));
        result = ((result* 31)+((this.tbvaccdSessionNumber == null)? 0 :this.tbvaccdSessionNumber.hashCode()));
        result = ((result* 31)+((this.tbvaccdEffectiveDate == null)? 0 :this.tbvaccdEffectiveDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdAidyCode == null)? 0 :this.tbvaccdAidyCode.hashCode()));
        result = ((result* 31)+((this.tbvaccdBalance == null)? 0 :this.tbvaccdBalance.hashCode()));
        result = ((result* 31)+((this.tbvaccdStatementDate == null)? 0 :this.tbvaccdStatementDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdAcctFeedInd == null)? 0 :this.tbvaccdAcctFeedInd.hashCode()));
        result = ((result* 31)+((this.tbvaccdCrossrefId == null)? 0 :this.tbvaccdCrossrefId.hashCode()));
        result = ((result* 31)+((this.tbvaccdTermCode == null)? 0 :this.tbvaccdTermCode.hashCode()));
        result = ((result* 31)+((this.tbvaccdInvNumberPaid == null)? 0 :this.tbvaccdInvNumberPaid.hashCode()));
        result = ((result* 31)+((this.tbvaccdCshrEndDate == null)? 0 :this.tbvaccdCshrEndDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdFeedDate == null)? 0 :this.tbvaccdFeedDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdTranNumberPaid == null)? 0 :this.tbvaccdTranNumberPaid.hashCode()));
        result = ((result* 31)+((this.tbvaccdBillDate == null)? 0 :this.tbvaccdBillDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdDueDate == null)? 0 :this.tbvaccdDueDate.hashCode()));
        result = ((result* 31)+((this.tbvaccdCrossrefSrceCode == null)? 0 :this.tbvaccdCrossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.tbvaccdCrossrefNumber == null)? 0 :this.tbvaccdCrossrefNumber.hashCode()));
        result = ((result* 31)+((this.tbvaccdInvoiceNumber == null)? 0 :this.tbvaccdInvoiceNumber.hashCode()));
        result = ((result* 31)+((this.tbvaccdReceiptNumber == null)? 0 :this.tbvaccdReceiptNumber.hashCode()));
        result = ((result* 31)+((this.tbvaccdId == null)? 0 :this.tbvaccdId.hashCode()));
        result = ((result* 31)+((this.tbvaccdAmount == null)? 0 :this.tbvaccdAmount.hashCode()));
        result = ((result* 31)+((this.tbvaccdSrceCode == null)? 0 :this.tbvaccdSrceCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbvaccdDetailCode == null)? 0 :this.tbvaccdDetailCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailQuery100GetResponse) == false) {
            return false;
        }
        AccountDetailQuery100GetResponse rhs = ((AccountDetailQuery100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((this.tbvaccdTranNumber == rhs.tbvaccdTranNumber)||((this.tbvaccdTranNumber!= null)&&this.tbvaccdTranNumber.equals(rhs.tbvaccdTranNumber)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.tbvaccdCrn == rhs.tbvaccdCrn)||((this.tbvaccdCrn!= null)&&this.tbvaccdCrn.equals(rhs.tbvaccdCrn))))&&((this.tbvaccdDesc == rhs.tbvaccdDesc)||((this.tbvaccdDesc!= null)&&this.tbvaccdDesc.equals(rhs.tbvaccdDesc))))&&((this.tbvaccdCpdtInd == rhs.tbvaccdCpdtInd)||((this.tbvaccdCpdtInd!= null)&&this.tbvaccdCpdtInd.equals(rhs.tbvaccdCpdtInd))))&&((this.tbvaccdUser == rhs.tbvaccdUser)||((this.tbvaccdUser!= null)&&this.tbvaccdUser.equals(rhs.tbvaccdUser))))&&((this.tbvaccdName == rhs.tbvaccdName)||((this.tbvaccdName!= null)&&this.tbvaccdName.equals(rhs.tbvaccdName))))&&((this.tbvaccdActivityDate == rhs.tbvaccdActivityDate)||((this.tbvaccdActivityDate!= null)&&this.tbvaccdActivityDate.equals(rhs.tbvaccdActivityDate))))&&((this.tbvaccdPeriod == rhs.tbvaccdPeriod)||((this.tbvaccdPeriod!= null)&&this.tbvaccdPeriod.equals(rhs.tbvaccdPeriod))))&&((this.tbvaccdFeedDocCode == rhs.tbvaccdFeedDocCode)||((this.tbvaccdFeedDocCode!= null)&&this.tbvaccdFeedDocCode.equals(rhs.tbvaccdFeedDocCode))))&&((this.tbvaccdSessionNumber == rhs.tbvaccdSessionNumber)||((this.tbvaccdSessionNumber!= null)&&this.tbvaccdSessionNumber.equals(rhs.tbvaccdSessionNumber))))&&((this.tbvaccdEffectiveDate == rhs.tbvaccdEffectiveDate)||((this.tbvaccdEffectiveDate!= null)&&this.tbvaccdEffectiveDate.equals(rhs.tbvaccdEffectiveDate))))&&((this.tbvaccdAidyCode == rhs.tbvaccdAidyCode)||((this.tbvaccdAidyCode!= null)&&this.tbvaccdAidyCode.equals(rhs.tbvaccdAidyCode))))&&((this.tbvaccdBalance == rhs.tbvaccdBalance)||((this.tbvaccdBalance!= null)&&this.tbvaccdBalance.equals(rhs.tbvaccdBalance))))&&((this.tbvaccdStatementDate == rhs.tbvaccdStatementDate)||((this.tbvaccdStatementDate!= null)&&this.tbvaccdStatementDate.equals(rhs.tbvaccdStatementDate))))&&((this.tbvaccdAcctFeedInd == rhs.tbvaccdAcctFeedInd)||((this.tbvaccdAcctFeedInd!= null)&&this.tbvaccdAcctFeedInd.equals(rhs.tbvaccdAcctFeedInd))))&&((this.tbvaccdCrossrefId == rhs.tbvaccdCrossrefId)||((this.tbvaccdCrossrefId!= null)&&this.tbvaccdCrossrefId.equals(rhs.tbvaccdCrossrefId))))&&((this.tbvaccdTermCode == rhs.tbvaccdTermCode)||((this.tbvaccdTermCode!= null)&&this.tbvaccdTermCode.equals(rhs.tbvaccdTermCode))))&&((this.tbvaccdInvNumberPaid == rhs.tbvaccdInvNumberPaid)||((this.tbvaccdInvNumberPaid!= null)&&this.tbvaccdInvNumberPaid.equals(rhs.tbvaccdInvNumberPaid))))&&((this.tbvaccdCshrEndDate == rhs.tbvaccdCshrEndDate)||((this.tbvaccdCshrEndDate!= null)&&this.tbvaccdCshrEndDate.equals(rhs.tbvaccdCshrEndDate))))&&((this.tbvaccdFeedDate == rhs.tbvaccdFeedDate)||((this.tbvaccdFeedDate!= null)&&this.tbvaccdFeedDate.equals(rhs.tbvaccdFeedDate))))&&((this.tbvaccdTranNumberPaid == rhs.tbvaccdTranNumberPaid)||((this.tbvaccdTranNumberPaid!= null)&&this.tbvaccdTranNumberPaid.equals(rhs.tbvaccdTranNumberPaid))))&&((this.tbvaccdBillDate == rhs.tbvaccdBillDate)||((this.tbvaccdBillDate!= null)&&this.tbvaccdBillDate.equals(rhs.tbvaccdBillDate))))&&((this.tbvaccdDueDate == rhs.tbvaccdDueDate)||((this.tbvaccdDueDate!= null)&&this.tbvaccdDueDate.equals(rhs.tbvaccdDueDate))))&&((this.tbvaccdCrossrefSrceCode == rhs.tbvaccdCrossrefSrceCode)||((this.tbvaccdCrossrefSrceCode!= null)&&this.tbvaccdCrossrefSrceCode.equals(rhs.tbvaccdCrossrefSrceCode))))&&((this.tbvaccdCrossrefNumber == rhs.tbvaccdCrossrefNumber)||((this.tbvaccdCrossrefNumber!= null)&&this.tbvaccdCrossrefNumber.equals(rhs.tbvaccdCrossrefNumber))))&&((this.tbvaccdInvoiceNumber == rhs.tbvaccdInvoiceNumber)||((this.tbvaccdInvoiceNumber!= null)&&this.tbvaccdInvoiceNumber.equals(rhs.tbvaccdInvoiceNumber))))&&((this.tbvaccdReceiptNumber == rhs.tbvaccdReceiptNumber)||((this.tbvaccdReceiptNumber!= null)&&this.tbvaccdReceiptNumber.equals(rhs.tbvaccdReceiptNumber))))&&((this.tbvaccdId == rhs.tbvaccdId)||((this.tbvaccdId!= null)&&this.tbvaccdId.equals(rhs.tbvaccdId))))&&((this.tbvaccdAmount == rhs.tbvaccdAmount)||((this.tbvaccdAmount!= null)&&this.tbvaccdAmount.equals(rhs.tbvaccdAmount))))&&((this.tbvaccdSrceCode == rhs.tbvaccdSrceCode)||((this.tbvaccdSrceCode!= null)&&this.tbvaccdSrceCode.equals(rhs.tbvaccdSrceCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbvaccdDetailCode == rhs.tbvaccdDetailCode)||((this.tbvaccdDetailCode!= null)&&this.tbvaccdDetailCode.equals(rhs.tbvaccdDetailCode))));
    }

}
