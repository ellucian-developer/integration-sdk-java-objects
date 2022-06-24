
package com.ellucian.generated.bpapi.ban.billing_mass_data_entry_charges_payments.v1_0_0;

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
    "keyblocDocumentNumber",
    "keyblocDetailCode",
    "keyblocEffDate",
    "runningDepoTotal",
    "runningAccdTotal",
    "keyblocAmount",
    "runningMemoTotal"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    @JsonPropertyDescription("Lineage reference object : keyblocDocumentNumber")
    private String keyblocDocumentNumber;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    @JsonPropertyDescription("Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc")
    private String keyblocDetailCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    @JsonPropertyDescription("Lineage reference object : keyblocEffDate")
    private Date keyblocEffDate;
    /**
     * Deposit Total
     * <p>
     * Lineage reference object : runningDepoTotal
     * 
     */
    @JsonProperty("runningDepoTotal")
    @JsonPropertyDescription("Lineage reference object : runningDepoTotal")
    private Double runningDepoTotal;
    /**
     * Total
     * <p>
     * Lineage reference object : runningAccdTotal
     * 
     */
    @JsonProperty("runningAccdTotal")
    @JsonPropertyDescription("Lineage reference object : runningAccdTotal")
    private Double runningAccdTotal;
    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    @JsonPropertyDescription("Lineage reference object : keyblocAmount")
    private Double keyblocAmount;
    /**
     * Memo Total
     * <p>
     * Lineage reference object : runningMemoTotal
     * 
     */
    @JsonProperty("runningMemoTotal")
    @JsonPropertyDescription("Lineage reference object : runningMemoTotal")
    private Double runningMemoTotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    public String getKeyblocDocumentNumber() {
        return keyblocDocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    public void setKeyblocDocumentNumber(String keyblocDocumentNumber) {
        this.keyblocDocumentNumber = keyblocDocumentNumber;
    }

    public KeyBlock withKeyblocDocumentNumber(String keyblocDocumentNumber) {
        this.keyblocDocumentNumber = keyblocDocumentNumber;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    public String getKeyblocDetailCode() {
        return keyblocDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    public void setKeyblocDetailCode(String keyblocDetailCode) {
        this.keyblocDetailCode = keyblocDetailCode;
    }

    public KeyBlock withKeyblocDetailCode(String keyblocDetailCode) {
        this.keyblocDetailCode = keyblocDetailCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    public Date getKeyblocEffDate() {
        return keyblocEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    public void setKeyblocEffDate(Date keyblocEffDate) {
        this.keyblocEffDate = keyblocEffDate;
    }

    public KeyBlock withKeyblocEffDate(Date keyblocEffDate) {
        this.keyblocEffDate = keyblocEffDate;
        return this;
    }

    /**
     * Deposit Total
     * <p>
     * Lineage reference object : runningDepoTotal
     * 
     */
    @JsonProperty("runningDepoTotal")
    public Double getRunningDepoTotal() {
        return runningDepoTotal;
    }

    /**
     * Deposit Total
     * <p>
     * Lineage reference object : runningDepoTotal
     * 
     */
    @JsonProperty("runningDepoTotal")
    public void setRunningDepoTotal(Double runningDepoTotal) {
        this.runningDepoTotal = runningDepoTotal;
    }

    public KeyBlock withRunningDepoTotal(Double runningDepoTotal) {
        this.runningDepoTotal = runningDepoTotal;
        return this;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : runningAccdTotal
     * 
     */
    @JsonProperty("runningAccdTotal")
    public Double getRunningAccdTotal() {
        return runningAccdTotal;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : runningAccdTotal
     * 
     */
    @JsonProperty("runningAccdTotal")
    public void setRunningAccdTotal(Double runningAccdTotal) {
        this.runningAccdTotal = runningAccdTotal;
    }

    public KeyBlock withRunningAccdTotal(Double runningAccdTotal) {
        this.runningAccdTotal = runningAccdTotal;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    public Double getKeyblocAmount() {
        return keyblocAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    public void setKeyblocAmount(Double keyblocAmount) {
        this.keyblocAmount = keyblocAmount;
    }

    public KeyBlock withKeyblocAmount(Double keyblocAmount) {
        this.keyblocAmount = keyblocAmount;
        return this;
    }

    /**
     * Memo Total
     * <p>
     * Lineage reference object : runningMemoTotal
     * 
     */
    @JsonProperty("runningMemoTotal")
    public Double getRunningMemoTotal() {
        return runningMemoTotal;
    }

    /**
     * Memo Total
     * <p>
     * Lineage reference object : runningMemoTotal
     * 
     */
    @JsonProperty("runningMemoTotal")
    public void setRunningMemoTotal(Double runningMemoTotal) {
        this.runningMemoTotal = runningMemoTotal;
    }

    public KeyBlock withRunningMemoTotal(Double runningMemoTotal) {
        this.runningMemoTotal = runningMemoTotal;
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

    public KeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocDocumentNumber");
        sb.append('=');
        sb.append(((this.keyblocDocumentNumber == null)?"<null>":this.keyblocDocumentNumber));
        sb.append(',');
        sb.append("keyblocDetailCode");
        sb.append('=');
        sb.append(((this.keyblocDetailCode == null)?"<null>":this.keyblocDetailCode));
        sb.append(',');
        sb.append("keyblocEffDate");
        sb.append('=');
        sb.append(((this.keyblocEffDate == null)?"<null>":this.keyblocEffDate));
        sb.append(',');
        sb.append("runningDepoTotal");
        sb.append('=');
        sb.append(((this.runningDepoTotal == null)?"<null>":this.runningDepoTotal));
        sb.append(',');
        sb.append("runningAccdTotal");
        sb.append('=');
        sb.append(((this.runningAccdTotal == null)?"<null>":this.runningAccdTotal));
        sb.append(',');
        sb.append("keyblocAmount");
        sb.append('=');
        sb.append(((this.keyblocAmount == null)?"<null>":this.keyblocAmount));
        sb.append(',');
        sb.append("runningMemoTotal");
        sb.append('=');
        sb.append(((this.runningMemoTotal == null)?"<null>":this.runningMemoTotal));
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
        result = ((result* 31)+((this.keyblocDocumentNumber == null)? 0 :this.keyblocDocumentNumber.hashCode()));
        result = ((result* 31)+((this.keyblocDetailCode == null)? 0 :this.keyblocDetailCode.hashCode()));
        result = ((result* 31)+((this.keyblocEffDate == null)? 0 :this.keyblocEffDate.hashCode()));
        result = ((result* 31)+((this.runningDepoTotal == null)? 0 :this.runningDepoTotal.hashCode()));
        result = ((result* 31)+((this.runningAccdTotal == null)? 0 :this.runningAccdTotal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocAmount == null)? 0 :this.keyblocAmount.hashCode()));
        result = ((result* 31)+((this.runningMemoTotal == null)? 0 :this.runningMemoTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock) == false) {
            return false;
        }
        KeyBlock rhs = ((KeyBlock) other);
        return (((((((((this.keyblocDocumentNumber == rhs.keyblocDocumentNumber)||((this.keyblocDocumentNumber!= null)&&this.keyblocDocumentNumber.equals(rhs.keyblocDocumentNumber)))&&((this.keyblocDetailCode == rhs.keyblocDetailCode)||((this.keyblocDetailCode!= null)&&this.keyblocDetailCode.equals(rhs.keyblocDetailCode))))&&((this.keyblocEffDate == rhs.keyblocEffDate)||((this.keyblocEffDate!= null)&&this.keyblocEffDate.equals(rhs.keyblocEffDate))))&&((this.runningDepoTotal == rhs.runningDepoTotal)||((this.runningDepoTotal!= null)&&this.runningDepoTotal.equals(rhs.runningDepoTotal))))&&((this.runningAccdTotal == rhs.runningAccdTotal)||((this.runningAccdTotal!= null)&&this.runningAccdTotal.equals(rhs.runningAccdTotal))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocAmount == rhs.keyblocAmount)||((this.keyblocAmount!= null)&&this.keyblocAmount.equals(rhs.keyblocAmount))))&&((this.runningMemoTotal == rhs.runningMemoTotal)||((this.runningMemoTotal!= null)&&this.runningMemoTotal.equals(rhs.runningMemoTotal))));
    }

}
