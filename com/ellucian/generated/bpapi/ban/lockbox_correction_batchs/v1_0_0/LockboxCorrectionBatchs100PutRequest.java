
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
    "criteria.tbrlboxBatchTransDate",
    "criteria.tbrlboxBatchNumber",
    "tbrlboxBatchTransDate",
    "tbrlboxAmount",
    "criteria.calculatedTotal",
    "tbrlboxBatchVerifyInd",
    "criteria.tbrlboxInvoiceNumberPaid",
    "criteria.tbrlboxBatchVerifyInd",
    "criteria.tbrlboxIdNumber",
    "criteria.tbrlboxAmount",
    "criteria.tbrlboxErrorMessage",
    "tbrlboxIdNumber"
})
@Generated("jsonschema2pojo")
public class LockboxCorrectionBatchs100PutRequest {

    /**
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchTransDate")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_TRANS_DATE")
    private Date criteriaTbrlboxBatchTransDate;
    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchNumber")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_NUMBER")
    private Double criteriaTbrlboxBatchNumber;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_TRANS_DATE")
    private Date tbrlboxBatchTransDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_AMOUNT")
    private Double tbrlboxAmount;
    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calculatedTotal")
    private Double criteriaCalculatedTotal;
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
    @JsonProperty("criteria.tbrlboxInvoiceNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID")
    private String criteriaTbrlboxInvoiceNumberPaid;
    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchVerifyInd")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_VERIFY_IND")
    private String criteriaTbrlboxBatchVerifyInd;
    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrlboxIdNumber")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_ID_NUMBER")
    private String criteriaTbrlboxIdNumber;
    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrlboxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_AMOUNT")
    private Double criteriaTbrlboxAmount;
    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("criteria.tbrlboxErrorMessage")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_ERROR_MESSAGE")
    private String criteriaTbrlboxErrorMessage;
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
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchTransDate")
    public Date getCriteriaTbrlboxBatchTransDate() {
        return criteriaTbrlboxBatchTransDate;
    }

    /**
     * Batch Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchTransDate")
    public void setCriteriaTbrlboxBatchTransDate(Date criteriaTbrlboxBatchTransDate) {
        this.criteriaTbrlboxBatchTransDate = criteriaTbrlboxBatchTransDate;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxBatchTransDate(Date criteriaTbrlboxBatchTransDate) {
        this.criteriaTbrlboxBatchTransDate = criteriaTbrlboxBatchTransDate;
        return this;
    }

    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchNumber")
    public Double getCriteriaTbrlboxBatchNumber() {
        return criteriaTbrlboxBatchNumber;
    }

    /**
     * Batch Number
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchNumber")
    public void setCriteriaTbrlboxBatchNumber(Double criteriaTbrlboxBatchNumber) {
        this.criteriaTbrlboxBatchNumber = criteriaTbrlboxBatchNumber;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxBatchNumber(Double criteriaTbrlboxBatchNumber) {
        this.criteriaTbrlboxBatchNumber = criteriaTbrlboxBatchNumber;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    public Date getTbrlboxBatchTransDate() {
        return tbrlboxBatchTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    public void setTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
        this.tbrlboxBatchTransDate = tbrlboxBatchTransDate;
    }

    public LockboxCorrectionBatchs100PutRequest withTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
        this.tbrlboxBatchTransDate = tbrlboxBatchTransDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxAmount")
    public Double getTbrlboxAmount() {
        return tbrlboxAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxAmount")
    public void setTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
    }

    public LockboxCorrectionBatchs100PutRequest withTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
        return this;
    }

    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calculatedTotal")
    public Double getCriteriaCalculatedTotal() {
        return criteriaCalculatedTotal;
    }

    /**
     * Calculated Total
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calculatedTotal")
    public void setCriteriaCalculatedTotal(Double criteriaCalculatedTotal) {
        this.criteriaCalculatedTotal = criteriaCalculatedTotal;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaCalculatedTotal(Double criteriaCalculatedTotal) {
        this.criteriaCalculatedTotal = criteriaCalculatedTotal;
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

    public LockboxCorrectionBatchs100PutRequest withTbrlboxBatchVerifyInd(String tbrlboxBatchVerifyInd) {
        this.tbrlboxBatchVerifyInd = tbrlboxBatchVerifyInd;
        return this;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tbrlboxInvoiceNumberPaid")
    public String getCriteriaTbrlboxInvoiceNumberPaid() {
        return criteriaTbrlboxInvoiceNumberPaid;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRLBOX_INVOICE_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tbrlboxInvoiceNumberPaid")
    public void setCriteriaTbrlboxInvoiceNumberPaid(String criteriaTbrlboxInvoiceNumberPaid) {
        this.criteriaTbrlboxInvoiceNumberPaid = criteriaTbrlboxInvoiceNumberPaid;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxInvoiceNumberPaid(String criteriaTbrlboxInvoiceNumberPaid) {
        this.criteriaTbrlboxInvoiceNumberPaid = criteriaTbrlboxInvoiceNumberPaid;
        return this;
    }

    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchVerifyInd")
    public String getCriteriaTbrlboxBatchVerifyInd() {
        return criteriaTbrlboxBatchVerifyInd;
    }

    /**
     * Lineage reference object : TBRLBOX_BATCH_VERIFY_IND
     * 
     */
    @JsonProperty("criteria.tbrlboxBatchVerifyInd")
    public void setCriteriaTbrlboxBatchVerifyInd(String criteriaTbrlboxBatchVerifyInd) {
        this.criteriaTbrlboxBatchVerifyInd = criteriaTbrlboxBatchVerifyInd;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxBatchVerifyInd(String criteriaTbrlboxBatchVerifyInd) {
        this.criteriaTbrlboxBatchVerifyInd = criteriaTbrlboxBatchVerifyInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrlboxIdNumber")
    public String getCriteriaTbrlboxIdNumber() {
        return criteriaTbrlboxIdNumber;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : TBRLBOX_ID_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrlboxIdNumber")
    public void setCriteriaTbrlboxIdNumber(String criteriaTbrlboxIdNumber) {
        this.criteriaTbrlboxIdNumber = criteriaTbrlboxIdNumber;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxIdNumber(String criteriaTbrlboxIdNumber) {
        this.criteriaTbrlboxIdNumber = criteriaTbrlboxIdNumber;
        return this;
    }

    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrlboxAmount")
    public Double getCriteriaTbrlboxAmount() {
        return criteriaTbrlboxAmount;
    }

    /**
     * Tape Total
     * <p>
     * Lineage reference object : TBRLBOX_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrlboxAmount")
    public void setCriteriaTbrlboxAmount(Double criteriaTbrlboxAmount) {
        this.criteriaTbrlboxAmount = criteriaTbrlboxAmount;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxAmount(Double criteriaTbrlboxAmount) {
        this.criteriaTbrlboxAmount = criteriaTbrlboxAmount;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("criteria.tbrlboxErrorMessage")
    public String getCriteriaTbrlboxErrorMessage() {
        return criteriaTbrlboxErrorMessage;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : TBRLBOX_ERROR_MESSAGE
     * 
     */
    @JsonProperty("criteria.tbrlboxErrorMessage")
    public void setCriteriaTbrlboxErrorMessage(String criteriaTbrlboxErrorMessage) {
        this.criteriaTbrlboxErrorMessage = criteriaTbrlboxErrorMessage;
    }

    public LockboxCorrectionBatchs100PutRequest withCriteriaTbrlboxErrorMessage(String criteriaTbrlboxErrorMessage) {
        this.criteriaTbrlboxErrorMessage = criteriaTbrlboxErrorMessage;
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

    public LockboxCorrectionBatchs100PutRequest withTbrlboxIdNumber(String tbrlboxIdNumber) {
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

    public LockboxCorrectionBatchs100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LockboxCorrectionBatchs100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTbrlboxBatchTransDate");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxBatchTransDate == null)?"<null>":this.criteriaTbrlboxBatchTransDate));
        sb.append(',');
        sb.append("criteriaTbrlboxBatchNumber");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxBatchNumber == null)?"<null>":this.criteriaTbrlboxBatchNumber));
        sb.append(',');
        sb.append("tbrlboxBatchTransDate");
        sb.append('=');
        sb.append(((this.tbrlboxBatchTransDate == null)?"<null>":this.tbrlboxBatchTransDate));
        sb.append(',');
        sb.append("tbrlboxAmount");
        sb.append('=');
        sb.append(((this.tbrlboxAmount == null)?"<null>":this.tbrlboxAmount));
        sb.append(',');
        sb.append("criteriaCalculatedTotal");
        sb.append('=');
        sb.append(((this.criteriaCalculatedTotal == null)?"<null>":this.criteriaCalculatedTotal));
        sb.append(',');
        sb.append("tbrlboxBatchVerifyInd");
        sb.append('=');
        sb.append(((this.tbrlboxBatchVerifyInd == null)?"<null>":this.tbrlboxBatchVerifyInd));
        sb.append(',');
        sb.append("criteriaTbrlboxInvoiceNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxInvoiceNumberPaid == null)?"<null>":this.criteriaTbrlboxInvoiceNumberPaid));
        sb.append(',');
        sb.append("criteriaTbrlboxBatchVerifyInd");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxBatchVerifyInd == null)?"<null>":this.criteriaTbrlboxBatchVerifyInd));
        sb.append(',');
        sb.append("criteriaTbrlboxIdNumber");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxIdNumber == null)?"<null>":this.criteriaTbrlboxIdNumber));
        sb.append(',');
        sb.append("criteriaTbrlboxAmount");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxAmount == null)?"<null>":this.criteriaTbrlboxAmount));
        sb.append(',');
        sb.append("criteriaTbrlboxErrorMessage");
        sb.append('=');
        sb.append(((this.criteriaTbrlboxErrorMessage == null)?"<null>":this.criteriaTbrlboxErrorMessage));
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
        result = ((result* 31)+((this.criteriaTbrlboxBatchTransDate == null)? 0 :this.criteriaTbrlboxBatchTransDate.hashCode()));
        result = ((result* 31)+((this.criteriaCalculatedTotal == null)? 0 :this.criteriaCalculatedTotal.hashCode()));
        result = ((result* 31)+((this.tbrlboxAmount == null)? 0 :this.tbrlboxAmount.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchVerifyInd == null)? 0 :this.tbrlboxBatchVerifyInd.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxBatchVerifyInd == null)? 0 :this.criteriaTbrlboxBatchVerifyInd.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxIdNumber == null)? 0 :this.criteriaTbrlboxIdNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxInvoiceNumberPaid == null)? 0 :this.criteriaTbrlboxInvoiceNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxAmount == null)? 0 :this.criteriaTbrlboxAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxBatchNumber == null)? 0 :this.criteriaTbrlboxBatchNumber.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchTransDate == null)? 0 :this.tbrlboxBatchTransDate.hashCode()));
        result = ((result* 31)+((this.criteriaTbrlboxErrorMessage == null)? 0 :this.criteriaTbrlboxErrorMessage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbrlboxIdNumber == null)? 0 :this.tbrlboxIdNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LockboxCorrectionBatchs100PutRequest) == false) {
            return false;
        }
        LockboxCorrectionBatchs100PutRequest rhs = ((LockboxCorrectionBatchs100PutRequest) other);
        return ((((((((((((((this.criteriaTbrlboxBatchTransDate == rhs.criteriaTbrlboxBatchTransDate)||((this.criteriaTbrlboxBatchTransDate!= null)&&this.criteriaTbrlboxBatchTransDate.equals(rhs.criteriaTbrlboxBatchTransDate)))&&((this.criteriaCalculatedTotal == rhs.criteriaCalculatedTotal)||((this.criteriaCalculatedTotal!= null)&&this.criteriaCalculatedTotal.equals(rhs.criteriaCalculatedTotal))))&&((this.tbrlboxAmount == rhs.tbrlboxAmount)||((this.tbrlboxAmount!= null)&&this.tbrlboxAmount.equals(rhs.tbrlboxAmount))))&&((this.tbrlboxBatchVerifyInd == rhs.tbrlboxBatchVerifyInd)||((this.tbrlboxBatchVerifyInd!= null)&&this.tbrlboxBatchVerifyInd.equals(rhs.tbrlboxBatchVerifyInd))))&&((this.criteriaTbrlboxBatchVerifyInd == rhs.criteriaTbrlboxBatchVerifyInd)||((this.criteriaTbrlboxBatchVerifyInd!= null)&&this.criteriaTbrlboxBatchVerifyInd.equals(rhs.criteriaTbrlboxBatchVerifyInd))))&&((this.criteriaTbrlboxIdNumber == rhs.criteriaTbrlboxIdNumber)||((this.criteriaTbrlboxIdNumber!= null)&&this.criteriaTbrlboxIdNumber.equals(rhs.criteriaTbrlboxIdNumber))))&&((this.criteriaTbrlboxInvoiceNumberPaid == rhs.criteriaTbrlboxInvoiceNumberPaid)||((this.criteriaTbrlboxInvoiceNumberPaid!= null)&&this.criteriaTbrlboxInvoiceNumberPaid.equals(rhs.criteriaTbrlboxInvoiceNumberPaid))))&&((this.criteriaTbrlboxAmount == rhs.criteriaTbrlboxAmount)||((this.criteriaTbrlboxAmount!= null)&&this.criteriaTbrlboxAmount.equals(rhs.criteriaTbrlboxAmount))))&&((this.criteriaTbrlboxBatchNumber == rhs.criteriaTbrlboxBatchNumber)||((this.criteriaTbrlboxBatchNumber!= null)&&this.criteriaTbrlboxBatchNumber.equals(rhs.criteriaTbrlboxBatchNumber))))&&((this.tbrlboxBatchTransDate == rhs.tbrlboxBatchTransDate)||((this.tbrlboxBatchTransDate!= null)&&this.tbrlboxBatchTransDate.equals(rhs.tbrlboxBatchTransDate))))&&((this.criteriaTbrlboxErrorMessage == rhs.criteriaTbrlboxErrorMessage)||((this.criteriaTbrlboxErrorMessage!= null)&&this.criteriaTbrlboxErrorMessage.equals(rhs.criteriaTbrlboxErrorMessage))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrlboxIdNumber == rhs.tbrlboxIdNumber)||((this.tbrlboxIdNumber!= null)&&this.tbrlboxIdNumber.equals(rhs.tbrlboxIdNumber))));
    }

}
