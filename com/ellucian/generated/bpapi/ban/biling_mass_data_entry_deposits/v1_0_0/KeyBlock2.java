
package com.ellucian.generated.bpapi.ban.biling_mass_data_entry_deposits.v1_0_0;

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
    "keybloc2DetailCode",
    "keybloc2Amount",
    "keybloc2DetailCodePay",
    "keybloc2ExpirationDate",
    "keybloc2ReleaseDate",
    "keybloc2MinAmount",
    "keybloc2EffDate",
    "keybloc2DocumentNumber"
})
@Generated("jsonschema2pojo")
public class KeyBlock2 {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCode")
    private Object keybloc2DetailCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    @JsonPropertyDescription("Lineage reference object : keybloc2Amount")
    private Object keybloc2Amount;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc")
    private Object keybloc2DetailCodePay;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ExpirationDate")
    private Object keybloc2ExpirationDate;
    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ReleaseDate")
    private Object keybloc2ReleaseDate;
    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    @JsonPropertyDescription("Lineage reference object : keybloc2MinAmount")
    private Object keybloc2MinAmount;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2EffDate")
    private Object keybloc2EffDate;
    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    @JsonPropertyDescription("Lineage reference object : keybloc2DocumentNumber")
    private Object keybloc2DocumentNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    public Object getKeybloc2DetailCode() {
        return keybloc2DetailCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    public void setKeybloc2DetailCode(Object keybloc2DetailCode) {
        this.keybloc2DetailCode = keybloc2DetailCode;
    }

    public KeyBlock2 withKeybloc2DetailCode(Object keybloc2DetailCode) {
        this.keybloc2DetailCode = keybloc2DetailCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public Object getKeybloc2Amount() {
        return keybloc2Amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public void setKeybloc2Amount(Object keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
    }

    public KeyBlock2 withKeybloc2Amount(Object keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public Object getKeybloc2DetailCodePay() {
        return keybloc2DetailCodePay;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public void setKeybloc2DetailCodePay(Object keybloc2DetailCodePay) {
        this.keybloc2DetailCodePay = keybloc2DetailCodePay;
    }

    public KeyBlock2 withKeybloc2DetailCodePay(Object keybloc2DetailCodePay) {
        this.keybloc2DetailCodePay = keybloc2DetailCodePay;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public Object getKeybloc2ExpirationDate() {
        return keybloc2ExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public void setKeybloc2ExpirationDate(Object keybloc2ExpirationDate) {
        this.keybloc2ExpirationDate = keybloc2ExpirationDate;
    }

    public KeyBlock2 withKeybloc2ExpirationDate(Object keybloc2ExpirationDate) {
        this.keybloc2ExpirationDate = keybloc2ExpirationDate;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    public Object getKeybloc2ReleaseDate() {
        return keybloc2ReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    public void setKeybloc2ReleaseDate(Object keybloc2ReleaseDate) {
        this.keybloc2ReleaseDate = keybloc2ReleaseDate;
    }

    public KeyBlock2 withKeybloc2ReleaseDate(Object keybloc2ReleaseDate) {
        this.keybloc2ReleaseDate = keybloc2ReleaseDate;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    public Object getKeybloc2MinAmount() {
        return keybloc2MinAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    public void setKeybloc2MinAmount(Object keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
    }

    public KeyBlock2 withKeybloc2MinAmount(Object keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    public Object getKeybloc2EffDate() {
        return keybloc2EffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    public void setKeybloc2EffDate(Object keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
    }

    public KeyBlock2 withKeybloc2EffDate(Object keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public Object getKeybloc2DocumentNumber() {
        return keybloc2DocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public void setKeybloc2DocumentNumber(Object keybloc2DocumentNumber) {
        this.keybloc2DocumentNumber = keybloc2DocumentNumber;
    }

    public KeyBlock2 withKeybloc2DocumentNumber(Object keybloc2DocumentNumber) {
        this.keybloc2DocumentNumber = keybloc2DocumentNumber;
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

    public KeyBlock2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keybloc2DetailCode");
        sb.append('=');
        sb.append(((this.keybloc2DetailCode == null)?"<null>":this.keybloc2DetailCode));
        sb.append(',');
        sb.append("keybloc2Amount");
        sb.append('=');
        sb.append(((this.keybloc2Amount == null)?"<null>":this.keybloc2Amount));
        sb.append(',');
        sb.append("keybloc2DetailCodePay");
        sb.append('=');
        sb.append(((this.keybloc2DetailCodePay == null)?"<null>":this.keybloc2DetailCodePay));
        sb.append(',');
        sb.append("keybloc2ExpirationDate");
        sb.append('=');
        sb.append(((this.keybloc2ExpirationDate == null)?"<null>":this.keybloc2ExpirationDate));
        sb.append(',');
        sb.append("keybloc2ReleaseDate");
        sb.append('=');
        sb.append(((this.keybloc2ReleaseDate == null)?"<null>":this.keybloc2ReleaseDate));
        sb.append(',');
        sb.append("keybloc2MinAmount");
        sb.append('=');
        sb.append(((this.keybloc2MinAmount == null)?"<null>":this.keybloc2MinAmount));
        sb.append(',');
        sb.append("keybloc2EffDate");
        sb.append('=');
        sb.append(((this.keybloc2EffDate == null)?"<null>":this.keybloc2EffDate));
        sb.append(',');
        sb.append("keybloc2DocumentNumber");
        sb.append('=');
        sb.append(((this.keybloc2DocumentNumber == null)?"<null>":this.keybloc2DocumentNumber));
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
        result = ((result* 31)+((this.keybloc2DetailCode == null)? 0 :this.keybloc2DetailCode.hashCode()));
        result = ((result* 31)+((this.keybloc2Amount == null)? 0 :this.keybloc2Amount.hashCode()));
        result = ((result* 31)+((this.keybloc2DetailCodePay == null)? 0 :this.keybloc2DetailCodePay.hashCode()));
        result = ((result* 31)+((this.keybloc2ExpirationDate == null)? 0 :this.keybloc2ExpirationDate.hashCode()));
        result = ((result* 31)+((this.keybloc2ReleaseDate == null)? 0 :this.keybloc2ReleaseDate.hashCode()));
        result = ((result* 31)+((this.keybloc2MinAmount == null)? 0 :this.keybloc2MinAmount.hashCode()));
        result = ((result* 31)+((this.keybloc2EffDate == null)? 0 :this.keybloc2EffDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keybloc2DocumentNumber == null)? 0 :this.keybloc2DocumentNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock2) == false) {
            return false;
        }
        KeyBlock2 rhs = ((KeyBlock2) other);
        return ((((((((((this.keybloc2DetailCode == rhs.keybloc2DetailCode)||((this.keybloc2DetailCode!= null)&&this.keybloc2DetailCode.equals(rhs.keybloc2DetailCode)))&&((this.keybloc2Amount == rhs.keybloc2Amount)||((this.keybloc2Amount!= null)&&this.keybloc2Amount.equals(rhs.keybloc2Amount))))&&((this.keybloc2DetailCodePay == rhs.keybloc2DetailCodePay)||((this.keybloc2DetailCodePay!= null)&&this.keybloc2DetailCodePay.equals(rhs.keybloc2DetailCodePay))))&&((this.keybloc2ExpirationDate == rhs.keybloc2ExpirationDate)||((this.keybloc2ExpirationDate!= null)&&this.keybloc2ExpirationDate.equals(rhs.keybloc2ExpirationDate))))&&((this.keybloc2ReleaseDate == rhs.keybloc2ReleaseDate)||((this.keybloc2ReleaseDate!= null)&&this.keybloc2ReleaseDate.equals(rhs.keybloc2ReleaseDate))))&&((this.keybloc2MinAmount == rhs.keybloc2MinAmount)||((this.keybloc2MinAmount!= null)&&this.keybloc2MinAmount.equals(rhs.keybloc2MinAmount))))&&((this.keybloc2EffDate == rhs.keybloc2EffDate)||((this.keybloc2EffDate!= null)&&this.keybloc2EffDate.equals(rhs.keybloc2EffDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keybloc2DocumentNumber == rhs.keybloc2DocumentNumber)||((this.keybloc2DocumentNumber!= null)&&this.keybloc2DocumentNumber.equals(rhs.keybloc2DocumentNumber))));
    }

}
