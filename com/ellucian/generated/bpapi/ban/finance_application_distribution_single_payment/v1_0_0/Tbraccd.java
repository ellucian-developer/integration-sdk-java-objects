
package com.ellucian.generated.bpapi.ban.finance_application_distribution_single_payment.v1_0_0;

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
    "srceCode",
    "documentNumber",
    "dueDate",
    "statementDate",
    "paymentAmount",
    "activityDate",
    "balance",
    "crossrefNumber",
    "acctFeedInd",
    "invoiceNumber",
    "transDate",
    "chargeAmount",
    "tranNumberPaid",
    "checkTpay",
    "receiptNumber",
    "feedDate",
    "cshrEndDate",
    "tranNumber",
    "billDate",
    "invNumberPaid",
    "crossrefId",
    "detailCode",
    "feedDocCode",
    "sessionNumber",
    "user",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class Tbraccd {

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
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Due Date
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DUE_DATE")
    private Date dueDate;
    /**
     * Statement Date
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STATEMENT_DATE")
    private Date statementDate;
    /**
     * Split Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentAmount")
    private Double paymentAmount;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ACTIVITY_DATE")
    private Date activityDate;
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
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CROSSREF_NUMBER")
    private Double crossrefNumber;
    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
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
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRANS_DATE")
    private Date transDate;
    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    private Double chargeAmount;
    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER_PAID")
    private Double tranNumberPaid;
    @JsonProperty("checkTpay")
    private String checkTpay;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RECEIPT_NUMBER")
    private Double receiptNumber;
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
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CSHR_END_DATE")
    private Date cshrEndDate;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BILL_DATE")
    private Date billDate;
    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String invNumberPaid;
    /**
     * Cross Reference ID
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
     * Feed Document
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_FEED_DOC_CODE")
    private String feedDocCode;
    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SESSION_NUMBER")
    private Double sessionNumber;
    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_USER")
    private String user;
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

    public Tbraccd withSrceCode(String srceCode) {
        this.srceCode = srceCode;
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

    public Tbraccd withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Tbraccd withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Statement Date
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    public Date getStatementDate() {
        return statementDate;
    }

    /**
     * Statement Date
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("statementDate")
    public void setStatementDate(Date statementDate) {
        this.statementDate = statementDate;
    }

    public Tbraccd withStatementDate(Date statementDate) {
        this.statementDate = statementDate;
        return this;
    }

    /**
     * Split Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentAmount")
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Split Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentAmount")
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Tbraccd withPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRACCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Tbraccd withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Tbraccd withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public Double getCrossrefNumber() {
        return crossrefNumber;
    }

    /**
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRACCD_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public void setCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
    }

    public Tbraccd withCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
        return this;
    }

    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public String getAcctFeedInd() {
        return acctFeedInd;
    }

    /**
     * Feed Indicator
     * <p>
     * Lineage reference object : TBRACCD_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public Tbraccd withAcctFeedInd(String acctFeedInd) {
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

    public Tbraccd withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Tbraccd withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    public Double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Tbraccd withChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public Double getTranNumberPaid() {
        return tranNumberPaid;
    }

    /**
     * Transaction Number Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public void setTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
    }

    public Tbraccd withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    @JsonProperty("checkTpay")
    public String getCheckTpay() {
        return checkTpay;
    }

    @JsonProperty("checkTpay")
    public void setCheckTpay(String checkTpay) {
        this.checkTpay = checkTpay;
    }

    public Tbraccd withCheckTpay(String checkTpay) {
        this.checkTpay = checkTpay;
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

    public Tbraccd withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public Tbraccd withFeedDate(Date feedDate) {
        this.feedDate = feedDate;
        return this;
    }

    /**
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    public Date getCshrEndDate() {
        return cshrEndDate;
    }

    /**
     * Session End Date
     * <p>
     * Lineage reference object : TBRACCD_CSHR_END_DATE
     * 
     */
    @JsonProperty("cshrEndDate")
    public void setCshrEndDate(Date cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
    }

    public Tbraccd withCshrEndDate(Date cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public Tbraccd withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public Date getBillDate() {
        return billDate;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Tbraccd withBillDate(Date billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public String getInvNumberPaid() {
        return invNumberPaid;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public Tbraccd withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
        return this;
    }

    /**
     * Cross Reference ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefId")
    public String getCrossrefId() {
        return crossrefId;
    }

    /**
     * Cross Reference ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefId")
    public void setCrossrefId(String crossrefId) {
        this.crossrefId = crossrefId;
    }

    public Tbraccd withCrossrefId(String crossrefId) {
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

    public Tbraccd withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public String getFeedDocCode() {
        return feedDocCode;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBRACCD_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public void setFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
    }

    public Tbraccd withFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
        return this;
    }

    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public Double getSessionNumber() {
        return sessionNumber;
    }

    /**
     * Session Number
     * <p>
     * Lineage reference object : TBRACCD_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public void setSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Tbraccd withSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TBRACCD_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Tbraccd withUser(String user) {
        this.user = user;
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

    public Tbraccd withEffectiveDate(Date effectiveDate) {
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

    public Tbraccd withDesc(String desc) {
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

    public Tbraccd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbraccd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
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
        sb.append("paymentAmount");
        sb.append('=');
        sb.append(((this.paymentAmount == null)?"<null>":this.paymentAmount));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
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
        sb.append("chargeAmount");
        sb.append('=');
        sb.append(((this.chargeAmount == null)?"<null>":this.chargeAmount));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("checkTpay");
        sb.append('=');
        sb.append(((this.checkTpay == null)?"<null>":this.checkTpay));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("feedDate");
        sb.append('=');
        sb.append(((this.feedDate == null)?"<null>":this.feedDate));
        sb.append(',');
        sb.append("cshrEndDate");
        sb.append('=');
        sb.append(((this.cshrEndDate == null)?"<null>":this.cshrEndDate));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("billDate");
        sb.append('=');
        sb.append(((this.billDate == null)?"<null>":this.billDate));
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
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.statementDate == null)? 0 :this.statementDate.hashCode()));
        result = ((result* 31)+((this.paymentAmount == null)? 0 :this.paymentAmount.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.crossrefNumber == null)? 0 :this.crossrefNumber.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.chargeAmount == null)? 0 :this.chargeAmount.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.checkTpay == null)? 0 :this.checkTpay.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.feedDate == null)? 0 :this.feedDate.hashCode()));
        result = ((result* 31)+((this.cshrEndDate == null)? 0 :this.cshrEndDate.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.billDate == null)? 0 :this.billDate.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.crossrefId == null)? 0 :this.crossrefId.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.feedDocCode == null)? 0 :this.feedDocCode.hashCode()));
        result = ((result* 31)+((this.sessionNumber == null)? 0 :this.sessionNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbraccd) == false) {
            return false;
        }
        Tbraccd rhs = ((Tbraccd) other);
        return (((((((((((((((((((((((((((((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode)))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.statementDate == rhs.statementDate)||((this.statementDate!= null)&&this.statementDate.equals(rhs.statementDate))))&&((this.paymentAmount == rhs.paymentAmount)||((this.paymentAmount!= null)&&this.paymentAmount.equals(rhs.paymentAmount))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.crossrefNumber == rhs.crossrefNumber)||((this.crossrefNumber!= null)&&this.crossrefNumber.equals(rhs.crossrefNumber))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.chargeAmount == rhs.chargeAmount)||((this.chargeAmount!= null)&&this.chargeAmount.equals(rhs.chargeAmount))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.checkTpay == rhs.checkTpay)||((this.checkTpay!= null)&&this.checkTpay.equals(rhs.checkTpay))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.feedDate == rhs.feedDate)||((this.feedDate!= null)&&this.feedDate.equals(rhs.feedDate))))&&((this.cshrEndDate == rhs.cshrEndDate)||((this.cshrEndDate!= null)&&this.cshrEndDate.equals(rhs.cshrEndDate))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.billDate == rhs.billDate)||((this.billDate!= null)&&this.billDate.equals(rhs.billDate))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.crossrefId == rhs.crossrefId)||((this.crossrefId!= null)&&this.crossrefId.equals(rhs.crossrefId))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.feedDocCode == rhs.feedDocCode)||((this.feedDocCode!= null)&&this.feedDocCode.equals(rhs.feedDocCode))))&&((this.sessionNumber == rhs.sessionNumber)||((this.sessionNumber!= null)&&this.sessionNumber.equals(rhs.sessionNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
