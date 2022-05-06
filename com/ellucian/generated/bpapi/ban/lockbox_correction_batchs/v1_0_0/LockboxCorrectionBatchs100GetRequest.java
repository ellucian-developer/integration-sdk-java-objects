
package com.ellucian.generated.bpapi.ban.lockbox_correction_batchs.v1_0_0;

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
    "tbrlboxErrorMessage",
    "amount",
    "calculatedTotal",
    "tbrlboxBatchTransDate",
    "tbrlboxAmount",
    "transDate",
    "tbrlboxBatchNumber",
    "tbrlboxBatchVerifyInd",
    "tbrlboxInvoiceNumberPaid",
    "tbrlboxIdNumber"
})
@Generated("jsonschema2pojo")
public class LockboxCorrectionBatchs100GetRequest {

    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("tbrlboxErrorMessage")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_ERROR_MESSAGE")
    private String tbrlboxErrorMessage;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_AMOUNT")
    private Double amount;
    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("calculatedTotal")
    private Double calculatedTotal;
    /**
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_TRANS_DATE")
    private Date tbrlboxBatchTransDate;
    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("tbrlboxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_AMOUNT")
    private Double tbrlboxAmount;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_TRANS_DATE")
    private Date transDate;
    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("tbrlboxBatchNumber")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_NUMBER")
    private Double tbrlboxBatchNumber;
    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("tbrlboxBatchVerifyInd")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_VERIFY_IND")
    private String tbrlboxBatchVerifyInd;
    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID
     * 
     */
    @JsonProperty("tbrlboxInvoiceNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID")
    private String tbrlboxInvoiceNumberPaid;
    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxIdNumber")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_ID_NUMBER")
    private String tbrlboxIdNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("tbrlboxErrorMessage")
    public String getTbrlboxErrorMessage() {
        return tbrlboxErrorMessage;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("tbrlboxErrorMessage")
    public void setTbrlboxErrorMessage(String tbrlboxErrorMessage) {
        this.tbrlboxErrorMessage = tbrlboxErrorMessage;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxErrorMessage(String tbrlboxErrorMessage) {
        this.tbrlboxErrorMessage = tbrlboxErrorMessage;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
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
     * Lineage reference object : TBRLBOX_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LockboxCorrectionBatchs100GetRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("calculatedTotal")
    public Double getCalculatedTotal() {
        return calculatedTotal;
    }

    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("calculatedTotal")
    public void setCalculatedTotal(Double calculatedTotal) {
        this.calculatedTotal = calculatedTotal;
    }

    public LockboxCorrectionBatchs100GetRequest withCalculatedTotal(Double calculatedTotal) {
        this.calculatedTotal = calculatedTotal;
        return this;
    }

    /**
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    public Date getTbrlboxBatchTransDate() {
        return tbrlboxBatchTransDate;
    }

    /**
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    public void setTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
        this.tbrlboxBatchTransDate = tbrlboxBatchTransDate;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
        this.tbrlboxBatchTransDate = tbrlboxBatchTransDate;
        return this;
    }

    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("tbrlboxAmount")
    public Double getTbrlboxAmount() {
        return tbrlboxAmount;
    }

    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("tbrlboxAmount")
    public void setTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public LockboxCorrectionBatchs100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("tbrlboxBatchNumber")
    public Double getTbrlboxBatchNumber() {
        return tbrlboxBatchNumber;
    }

    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("tbrlboxBatchNumber")
    public void setTbrlboxBatchNumber(Double tbrlboxBatchNumber) {
        this.tbrlboxBatchNumber = tbrlboxBatchNumber;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxBatchNumber(Double tbrlboxBatchNumber) {
        this.tbrlboxBatchNumber = tbrlboxBatchNumber;
        return this;
    }

    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("tbrlboxBatchVerifyInd")
    public String getTbrlboxBatchVerifyInd() {
        return tbrlboxBatchVerifyInd;
    }

    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("tbrlboxBatchVerifyInd")
    public void setTbrlboxBatchVerifyInd(String tbrlboxBatchVerifyInd) {
        this.tbrlboxBatchVerifyInd = tbrlboxBatchVerifyInd;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxBatchVerifyInd(String tbrlboxBatchVerifyInd) {
        this.tbrlboxBatchVerifyInd = tbrlboxBatchVerifyInd;
        return this;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID
     * 
     */
    @JsonProperty("tbrlboxInvoiceNumberPaid")
    public String getTbrlboxInvoiceNumberPaid() {
        return tbrlboxInvoiceNumberPaid;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID
     * 
     */
    @JsonProperty("tbrlboxInvoiceNumberPaid")
    public void setTbrlboxInvoiceNumberPaid(String tbrlboxInvoiceNumberPaid) {
        this.tbrlboxInvoiceNumberPaid = tbrlboxInvoiceNumberPaid;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxInvoiceNumberPaid(String tbrlboxInvoiceNumberPaid) {
        this.tbrlboxInvoiceNumberPaid = tbrlboxInvoiceNumberPaid;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxIdNumber")
    public String getTbrlboxIdNumber() {
        return tbrlboxIdNumber;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxIdNumber")
    public void setTbrlboxIdNumber(String tbrlboxIdNumber) {
        this.tbrlboxIdNumber = tbrlboxIdNumber;
    }

    public LockboxCorrectionBatchs100GetRequest withTbrlboxIdNumber(String tbrlboxIdNumber) {
        this.tbrlboxIdNumber = tbrlboxIdNumber;
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

    public LockboxCorrectionBatchs100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LockboxCorrectionBatchs100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrlboxErrorMessage");
        sb.append('=');
        sb.append(((this.tbrlboxErrorMessage == null)?"<null>":this.tbrlboxErrorMessage));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("calculatedTotal");
        sb.append('=');
        sb.append(((this.calculatedTotal == null)?"<null>":this.calculatedTotal));
        sb.append(',');
        sb.append("tbrlboxBatchTransDate");
        sb.append('=');
        sb.append(((this.tbrlboxBatchTransDate == null)?"<null>":this.tbrlboxBatchTransDate));
        sb.append(',');
        sb.append("tbrlboxAmount");
        sb.append('=');
        sb.append(((this.tbrlboxAmount == null)?"<null>":this.tbrlboxAmount));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("tbrlboxBatchNumber");
        sb.append('=');
        sb.append(((this.tbrlboxBatchNumber == null)?"<null>":this.tbrlboxBatchNumber));
        sb.append(',');
        sb.append("tbrlboxBatchVerifyInd");
        sb.append('=');
        sb.append(((this.tbrlboxBatchVerifyInd == null)?"<null>":this.tbrlboxBatchVerifyInd));
        sb.append(',');
        sb.append("tbrlboxInvoiceNumberPaid");
        sb.append('=');
        sb.append(((this.tbrlboxInvoiceNumberPaid == null)?"<null>":this.tbrlboxInvoiceNumberPaid));
        sb.append(',');
        sb.append("tbrlboxIdNumber");
        sb.append('=');
        sb.append(((this.tbrlboxIdNumber == null)?"<null>":this.tbrlboxIdNumber));
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
        result = ((result* 31)+((this.tbrlboxErrorMessage == null)? 0 :this.tbrlboxErrorMessage.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.calculatedTotal == null)? 0 :this.calculatedTotal.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchTransDate == null)? 0 :this.tbrlboxBatchTransDate.hashCode()));
        result = ((result* 31)+((this.tbrlboxAmount == null)? 0 :this.tbrlboxAmount.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchNumber == null)? 0 :this.tbrlboxBatchNumber.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchVerifyInd == null)? 0 :this.tbrlboxBatchVerifyInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbrlboxInvoiceNumberPaid == null)? 0 :this.tbrlboxInvoiceNumberPaid.hashCode()));
        result = ((result* 31)+((this.tbrlboxIdNumber == null)? 0 :this.tbrlboxIdNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LockboxCorrectionBatchs100GetRequest) == false) {
            return false;
        }
        LockboxCorrectionBatchs100GetRequest rhs = ((LockboxCorrectionBatchs100GetRequest) other);
        return ((((((((((((this.tbrlboxErrorMessage == rhs.tbrlboxErrorMessage)||((this.tbrlboxErrorMessage!= null)&&this.tbrlboxErrorMessage.equals(rhs.tbrlboxErrorMessage)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.calculatedTotal == rhs.calculatedTotal)||((this.calculatedTotal!= null)&&this.calculatedTotal.equals(rhs.calculatedTotal))))&&((this.tbrlboxBatchTransDate == rhs.tbrlboxBatchTransDate)||((this.tbrlboxBatchTransDate!= null)&&this.tbrlboxBatchTransDate.equals(rhs.tbrlboxBatchTransDate))))&&((this.tbrlboxAmount == rhs.tbrlboxAmount)||((this.tbrlboxAmount!= null)&&this.tbrlboxAmount.equals(rhs.tbrlboxAmount))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.tbrlboxBatchNumber == rhs.tbrlboxBatchNumber)||((this.tbrlboxBatchNumber!= null)&&this.tbrlboxBatchNumber.equals(rhs.tbrlboxBatchNumber))))&&((this.tbrlboxBatchVerifyInd == rhs.tbrlboxBatchVerifyInd)||((this.tbrlboxBatchVerifyInd!= null)&&this.tbrlboxBatchVerifyInd.equals(rhs.tbrlboxBatchVerifyInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrlboxInvoiceNumberPaid == rhs.tbrlboxInvoiceNumberPaid)||((this.tbrlboxInvoiceNumberPaid!= null)&&this.tbrlboxInvoiceNumberPaid.equals(rhs.tbrlboxInvoiceNumberPaid))))&&((this.tbrlboxIdNumber == rhs.tbrlboxIdNumber)||((this.tbrlboxIdNumber!= null)&&this.tbrlboxIdNumber.equals(rhs.tbrlboxIdNumber))));
    }

}
