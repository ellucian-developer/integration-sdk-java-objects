
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
    "amount",
    "srceCode",
    "stspKeySequence",
    "documentNumber",
    "invNumberPaid",
    "receiptGenInd",
    "detailCode",
    "origChgInd",
    "holdPassword",
    "paymentId",
    "acctFeedInd",
    "transDate",
    "id",
    "tranNumberPaid",
    "cpdtInd",
    "effectiveDate",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailChargesPayments100PostRequest {

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
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
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
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String origChgInd;
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
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String cpdtInd;
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

    public StudentAccountDetailChargesPayments100PostRequest withAmount(Double amount) {
        this.amount = amount;
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

    public StudentAccountDetailChargesPayments100PostRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
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

    public StudentAccountDetailChargesPayments100PostRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
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

    public StudentAccountDetailChargesPayments100PostRequest withDocumentNumber(String documentNumber) {
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

    public StudentAccountDetailChargesPayments100PostRequest withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
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

    public StudentAccountDetailChargesPayments100PostRequest withReceiptGenInd(Object receiptGenInd) {
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

    public StudentAccountDetailChargesPayments100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public StudentAccountDetailChargesPayments100PostRequest withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
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

    public StudentAccountDetailChargesPayments100PostRequest withHoldPassword(Object holdPassword) {
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

    public StudentAccountDetailChargesPayments100PostRequest withPaymentId(String paymentId) {
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

    public StudentAccountDetailChargesPayments100PostRequest withAcctFeedInd(String acctFeedInd) {
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

    public StudentAccountDetailChargesPayments100PostRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public StudentAccountDetailChargesPayments100PostRequest withId(Object id) {
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

    public StudentAccountDetailChargesPayments100PostRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
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

    public StudentAccountDetailChargesPayments100PostRequest withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
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

    public StudentAccountDetailChargesPayments100PostRequest withEffectiveDate(Date effectiveDate) {
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

    public StudentAccountDetailChargesPayments100PostRequest withDesc(String desc) {
        this.desc = desc;
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

    public StudentAccountDetailChargesPayments100PostRequest withTermCode(String termCode) {
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

    public StudentAccountDetailChargesPayments100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailChargesPayments100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("receiptGenInd");
        sb.append('=');
        sb.append(((this.receiptGenInd == null)?"<null>":this.receiptGenInd));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.receiptGenInd == null)? 0 :this.receiptGenInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailChargesPayments100PostRequest) == false) {
            return false;
        }
        StudentAccountDetailChargesPayments100PostRequest rhs = ((StudentAccountDetailChargesPayments100PostRequest) other);
        return ((((((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.receiptGenInd == rhs.receiptGenInd)||((this.receiptGenInd!= null)&&this.receiptGenInd.equals(rhs.receiptGenInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
