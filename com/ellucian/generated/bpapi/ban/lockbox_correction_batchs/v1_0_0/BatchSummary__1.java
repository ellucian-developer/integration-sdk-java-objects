
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
    "calculatedTotal",
    "tbrlboxBatchTransDate",
    "tbrlboxAmount",
    "tbrlboxBatchNumber",
    "tbrlboxBatchVerifyInd"
})
@Generated("jsonschema2pojo")
public class BatchSummary__1 {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public BatchSummary__1 withCalculatedTotal(Double calculatedTotal) {
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

    public BatchSummary__1 withTbrlboxBatchTransDate(Date tbrlboxBatchTransDate) {
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

    public BatchSummary__1 withTbrlboxAmount(Double tbrlboxAmount) {
        this.tbrlboxAmount = tbrlboxAmount;
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

    public BatchSummary__1 withTbrlboxBatchNumber(Double tbrlboxBatchNumber) {
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

    public BatchSummary__1 withTbrlboxBatchVerifyInd(String tbrlboxBatchVerifyInd) {
        this.tbrlboxBatchVerifyInd = tbrlboxBatchVerifyInd;
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

    public BatchSummary__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BatchSummary__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tbrlboxBatchNumber");
        sb.append('=');
        sb.append(((this.tbrlboxBatchNumber == null)?"<null>":this.tbrlboxBatchNumber));
        sb.append(',');
        sb.append("tbrlboxBatchVerifyInd");
        sb.append('=');
        sb.append(((this.tbrlboxBatchVerifyInd == null)?"<null>":this.tbrlboxBatchVerifyInd));
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
        result = ((result* 31)+((this.calculatedTotal == null)? 0 :this.calculatedTotal.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchTransDate == null)? 0 :this.tbrlboxBatchTransDate.hashCode()));
        result = ((result* 31)+((this.tbrlboxAmount == null)? 0 :this.tbrlboxAmount.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchNumber == null)? 0 :this.tbrlboxBatchNumber.hashCode()));
        result = ((result* 31)+((this.tbrlboxBatchVerifyInd == null)? 0 :this.tbrlboxBatchVerifyInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BatchSummary__1) == false) {
            return false;
        }
        BatchSummary__1 rhs = ((BatchSummary__1) other);
        return (((((((this.calculatedTotal == rhs.calculatedTotal)||((this.calculatedTotal!= null)&&this.calculatedTotal.equals(rhs.calculatedTotal)))&&((this.tbrlboxBatchTransDate == rhs.tbrlboxBatchTransDate)||((this.tbrlboxBatchTransDate!= null)&&this.tbrlboxBatchTransDate.equals(rhs.tbrlboxBatchTransDate))))&&((this.tbrlboxAmount == rhs.tbrlboxAmount)||((this.tbrlboxAmount!= null)&&this.tbrlboxAmount.equals(rhs.tbrlboxAmount))))&&((this.tbrlboxBatchNumber == rhs.tbrlboxBatchNumber)||((this.tbrlboxBatchNumber!= null)&&this.tbrlboxBatchNumber.equals(rhs.tbrlboxBatchNumber))))&&((this.tbrlboxBatchVerifyInd == rhs.tbrlboxBatchVerifyInd)||((this.tbrlboxBatchVerifyInd!= null)&&this.tbrlboxBatchVerifyInd.equals(rhs.tbrlboxBatchVerifyInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
