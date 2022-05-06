
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
    "srceCode",
    "taxMethod",
    "documentNumber",
    "additionalText",
    "dueDate",
    "statementDate",
    "units",
    "balance",
    "holdPassword",
    "rate",
    "paymentId",
    "transDate",
    "invoiceNumber",
    "id",
    "tranNumberPaid",
    "atypSeqno",
    "receiptNumber",
    "amount",
    "currCodeV",
    "entryDate",
    "tranNumber",
    "billDate",
    "invNumberPaid",
    "detailCode",
    "taxAmount",
    "atypCode",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class AccountDetail100GetRequest {

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
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText")
    private String additionalText;
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
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("units")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_UNITS")
    private Double units;
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
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RATE")
    private Double rate;
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
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String invoiceNumber;
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
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RECEIPT_NUMBER")
    private Double receiptNumber;
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
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER")
    private Double tranNumber;
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
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String invNumberPaid;
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
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("taxAmount")
    private Double taxAmount;
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

    public AccountDetail100GetRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
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

    public AccountDetail100GetRequest withTaxMethod(String taxMethod) {
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

    public AccountDetail100GetRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public AccountDetail100GetRequest withAdditionalText(String additionalText) {
        this.additionalText = additionalText;
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

    public AccountDetail100GetRequest withDueDate(Date dueDate) {
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

    public AccountDetail100GetRequest withStatementDate(Date statementDate) {
        this.statementDate = statementDate;
        return this;
    }

    /**
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("units")
    public Double getUnits() {
        return units;
    }

    /**
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("units")
    public void setUnits(Double units) {
        this.units = units;
    }

    public AccountDetail100GetRequest withUnits(Double units) {
        this.units = units;
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

    public AccountDetail100GetRequest withBalance(Double balance) {
        this.balance = balance;
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

    public AccountDetail100GetRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public AccountDetail100GetRequest withRate(Double rate) {
        this.rate = rate;
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

    public AccountDetail100GetRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    public AccountDetail100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public AccountDetail100GetRequest withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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

    public AccountDetail100GetRequest withId(Object id) {
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

    public AccountDetail100GetRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
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

    public AccountDetail100GetRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
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

    public AccountDetail100GetRequest withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public AccountDetail100GetRequest withAmount(Double amount) {
        this.amount = amount;
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

    public AccountDetail100GetRequest withCurrCodeV(String currCodeV) {
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

    public AccountDetail100GetRequest withEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public AccountDetail100GetRequest withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
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

    public AccountDetail100GetRequest withBillDate(Date billDate) {
        this.billDate = billDate;
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

    public AccountDetail100GetRequest withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
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

    public AccountDetail100GetRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public AccountDetail100GetRequest withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
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

    public AccountDetail100GetRequest withAtypCode(String atypCode) {
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

    public AccountDetail100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public AccountDetail100GetRequest withDesc(String desc) {
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

    public AccountDetail100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetail100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("additionalText");
        sb.append('=');
        sb.append(((this.additionalText == null)?"<null>":this.additionalText));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("statementDate");
        sb.append('=');
        sb.append(((this.statementDate == null)?"<null>":this.statementDate));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currCodeV");
        sb.append('=');
        sb.append(((this.currCodeV == null)?"<null>":this.currCodeV));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
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
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
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
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.additionalText == null)? 0 :this.additionalText.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.statementDate == null)? 0 :this.statementDate.hashCode()));
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.currCodeV == null)? 0 :this.currCodeV.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.billDate == null)? 0 :this.billDate.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetail100GetRequest) == false) {
            return false;
        }
        AccountDetail100GetRequest rhs = ((AccountDetail100GetRequest) other);
        return ((((((((((((((((((((((((((((((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode)))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.additionalText == rhs.additionalText)||((this.additionalText!= null)&&this.additionalText.equals(rhs.additionalText))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.statementDate == rhs.statementDate)||((this.statementDate!= null)&&this.statementDate.equals(rhs.statementDate))))&&((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.currCodeV == rhs.currCodeV)||((this.currCodeV!= null)&&this.currCodeV.equals(rhs.currCodeV))))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.billDate == rhs.billDate)||((this.billDate!= null)&&this.billDate.equals(rhs.billDate))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
