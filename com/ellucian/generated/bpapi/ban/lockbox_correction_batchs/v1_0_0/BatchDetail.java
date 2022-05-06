
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
    "tbrlboxBatchTransDate",
    "rwname",
    "tbrlboxAmount",
    "tbrlboxInvoiceNumberPaid",
    "tbrlboxIdNumber"
})
@Generated("jsonschema2pojo")
public class BatchDetail {

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
     * Transaction Date
     * <p>
     * Lineage reference object : TBRLBOX_BATCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbrlboxBatchTransDate")
    @JsonPropertyDescription("Lineage reference object : TBRLBOX_BATCH_TRANS_DATE")
    private Date tbrlboxBatchTransDate;
    @JsonProperty("rwname")
    private String rwname;
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

    public BatchDetail withTbrlboxErrorMessage(String tbrlboxErrorMessage) {
        this.tbrlboxErrorMessage = tbrlboxErrorMessage;
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

    public BatchDetail withTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
        this.tbrlboxBatchTransDate = tbrlboxBatchTransDate;
        return this;
    }

    @JsonProperty("rwname")
    public String getRwname() {
        return rwname;
    }

    @JsonProperty("rwname")
    public void setRwname(String rwname) {
        this.rwname = rwname;
    }

    public BatchDetail withRwname(String rwname) {
        this.rwname = rwname;
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

    public BatchDetail withTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
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

    public BatchDetail withTbrlboxInvoiceNumberPaid(String tbrlboxInvoiceNumberPaid) {
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

    public BatchDetail withTbrlboxIdNumber(String tbrlboxIdNumber) {
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

    public BatchDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BatchDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrlboxErrorMessage");
        sb.append('=');
        sb.append(((this.tbrlboxErrorMessage == null)?"<null>":this.tbrlboxErrorMessage));
        sb.append(',');
        sb.append("tbrlboxBatchTransDate");
        sb.append('=');
        sb.append(((this.tbrlboxBatchTransDate == null)?"<null>":this.tbrlboxBatchTransDate));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("tbrlboxAmount");
        sb.append('=');
        sb.append(((this.tbrlboxAmount == null)?"<null>":this.tbrlboxAmount));
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
        result = ((result* 31)+((this.tbrlboxBatchTransDate == null)? 0 :this.tbrlboxBatchTransDate.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.tbrlboxAmount == null)? 0 :this.tbrlboxAmount.hashCode()));
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
        if ((other instanceof BatchDetail) == false) {
            return false;
        }
        BatchDetail rhs = ((BatchDetail) other);
        return ((((((((this.tbrlboxErrorMessage == rhs.tbrlboxErrorMessage)||((this.tbrlboxErrorMessage!= null)&&this.tbrlboxErrorMessage.equals(rhs.tbrlboxErrorMessage)))&&((this.tbrlboxBatchTransDate == rhs.tbrlboxBatchTransDate)||((this.tbrlboxBatchTransDate!= null)&&this.tbrlboxBatchTransDate.equals(rhs.tbrlboxBatchTransDate))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.tbrlboxAmount == rhs.tbrlboxAmount)||((this.tbrlboxAmount!= null)&&this.tbrlboxAmount.equals(rhs.tbrlboxAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrlboxInvoiceNumberPaid == rhs.tbrlboxInvoiceNumberPaid)||((this.tbrlboxInvoiceNumberPaid!= null)&&this.tbrlboxInvoiceNumberPaid.equals(rhs.tbrlboxInvoiceNumberPaid))))&&((this.tbrlboxIdNumber == rhs.tbrlboxIdNumber)||((this.tbrlboxIdNumber!= null)&&this.tbrlboxIdNumber.equals(rhs.tbrlboxIdNumber))));
    }

}
