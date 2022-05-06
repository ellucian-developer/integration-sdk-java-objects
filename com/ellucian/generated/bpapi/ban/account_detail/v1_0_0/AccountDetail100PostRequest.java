
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
    "documentNumber",
    "invNumberPaid",
    "units",
    "receiptGenInd",
    "detailCode",
    "holdPassword",
    "rate",
    "merchantId",
    "paymentId",
    "acctFeedInd",
    "transDate",
    "invoiceNumber",
    "id",
    "tranNumberPaid",
    "user",
    "atypCode",
    "atypSeqno",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class AccountDetail100PostRequest {

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
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
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
     * Units
     * <p>
     * Lineage reference object : TBRACCD_UNITS
     * 
     */
    @JsonProperty("units")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_UNITS")
    private Double units;
    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    @JsonPropertyDescription("Lineage reference object : receiptGenInd")
    private Object receiptGenInd;
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

    public AccountDetail100PostRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
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

    public AccountDetail100PostRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public AccountDetail100PostRequest withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
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

    public AccountDetail100PostRequest withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    public Object getReceiptGenInd() {
        return receiptGenInd;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    public void setReceiptGenInd(Object receiptGenInd) {
        this.receiptGenInd = receiptGenInd;
    }

    public AccountDetail100PostRequest withReceiptGenInd(Object receiptGenInd) {
        this.receiptGenInd = receiptGenInd;
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

    public AccountDetail100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public AccountDetail100PostRequest withHoldPassword(Object holdPassword) {
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

    public AccountDetail100PostRequest withRate(Double rate) {
        this.rate = rate;
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

    public AccountDetail100PostRequest withMerchantId(String merchantId) {
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

    public AccountDetail100PostRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    public AccountDetail100PostRequest withAcctFeedInd(String acctFeedInd) {
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

    public AccountDetail100PostRequest withTransDate(Date transDate) {
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

    public AccountDetail100PostRequest withInvoiceNumber(String invoiceNumber) {
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

    public AccountDetail100PostRequest withId(Object id) {
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

    public AccountDetail100PostRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
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

    public AccountDetail100PostRequest withUser(String user) {
        this.user = user;
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

    public AccountDetail100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public AccountDetail100PostRequest withAtypSeqno(Double atypSeqno) {
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

    public AccountDetail100PostRequest withEffectiveDate(Date effectiveDate) {
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

    public AccountDetail100PostRequest withDesc(String desc) {
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

    public AccountDetail100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetail100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
        sb.append(',');
        sb.append("receiptGenInd");
        sb.append('=');
        sb.append(((this.receiptGenInd == null)?"<null>":this.receiptGenInd));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
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
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
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
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        result = ((result* 31)+((this.receiptGenInd == null)? 0 :this.receiptGenInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.merchantId == null)? 0 :this.merchantId.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetail100PostRequest) == false) {
            return false;
        }
        AccountDetail100PostRequest rhs = ((AccountDetail100PostRequest) other);
        return ((((((((((((((((((((((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode)))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units))))&&((this.receiptGenInd == rhs.receiptGenInd)||((this.receiptGenInd!= null)&&this.receiptGenInd.equals(rhs.receiptGenInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.merchantId == rhs.merchantId)||((this.merchantId!= null)&&this.merchantId.equals(rhs.merchantId))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
