
package com.ellucian.generated.bpapi.ban.student_billing_mass_data_entry_memos.v1_0_0;

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
    "keybloc3DetailCode",
    "keybloc3TermCode",
    "keybloc3BillingInd",
    "keybloc3ExpDate",
    "keybloc3Amount"
})
@Generated("jsonschema2pojo")
public class KeyBlock3 {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    @JsonPropertyDescription("Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc")
    private String keybloc3DetailCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keybloc3TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc3TermCode")
    @JsonPropertyDescription("Lineage reference object : keybloc3TermCode, Lookup lineage reference object : stvterm")
    private String keybloc3TermCode;
    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    @JsonPropertyDescription("Lineage reference object : keybloc3BillingInd")
    private String keybloc3BillingInd;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    @JsonPropertyDescription("Lineage reference object : keybloc3ExpDate")
    private Date keybloc3ExpDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    @JsonPropertyDescription("Lineage reference object : keybloc3Amount")
    private Double keybloc3Amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    public String getKeybloc3DetailCode() {
        return keybloc3DetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    public void setKeybloc3DetailCode(String keybloc3DetailCode) {
        this.keybloc3DetailCode = keybloc3DetailCode;
    }

    public KeyBlock3 withKeybloc3DetailCode(String keybloc3DetailCode) {
        this.keybloc3DetailCode = keybloc3DetailCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keybloc3TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc3TermCode")
    public String getKeybloc3TermCode() {
        return keybloc3TermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keybloc3TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc3TermCode")
    public void setKeybloc3TermCode(String keybloc3TermCode) {
        this.keybloc3TermCode = keybloc3TermCode;
    }

    public KeyBlock3 withKeybloc3TermCode(String keybloc3TermCode) {
        this.keybloc3TermCode = keybloc3TermCode;
        return this;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    public String getKeybloc3BillingInd() {
        return keybloc3BillingInd;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    public void setKeybloc3BillingInd(String keybloc3BillingInd) {
        this.keybloc3BillingInd = keybloc3BillingInd;
    }

    public KeyBlock3 withKeybloc3BillingInd(String keybloc3BillingInd) {
        this.keybloc3BillingInd = keybloc3BillingInd;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    public Date getKeybloc3ExpDate() {
        return keybloc3ExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    public void setKeybloc3ExpDate(Date keybloc3ExpDate) {
        this.keybloc3ExpDate = keybloc3ExpDate;
    }

    public KeyBlock3 withKeybloc3ExpDate(Date keybloc3ExpDate) {
        this.keybloc3ExpDate = keybloc3ExpDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    public Double getKeybloc3Amount() {
        return keybloc3Amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    public void setKeybloc3Amount(Double keybloc3Amount) {
        this.keybloc3Amount = keybloc3Amount;
    }

    public KeyBlock3 withKeybloc3Amount(Double keybloc3Amount) {
        this.keybloc3Amount = keybloc3Amount;
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

    public KeyBlock3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keybloc3DetailCode");
        sb.append('=');
        sb.append(((this.keybloc3DetailCode == null)?"<null>":this.keybloc3DetailCode));
        sb.append(',');
        sb.append("keybloc3TermCode");
        sb.append('=');
        sb.append(((this.keybloc3TermCode == null)?"<null>":this.keybloc3TermCode));
        sb.append(',');
        sb.append("keybloc3BillingInd");
        sb.append('=');
        sb.append(((this.keybloc3BillingInd == null)?"<null>":this.keybloc3BillingInd));
        sb.append(',');
        sb.append("keybloc3ExpDate");
        sb.append('=');
        sb.append(((this.keybloc3ExpDate == null)?"<null>":this.keybloc3ExpDate));
        sb.append(',');
        sb.append("keybloc3Amount");
        sb.append('=');
        sb.append(((this.keybloc3Amount == null)?"<null>":this.keybloc3Amount));
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
        result = ((result* 31)+((this.keybloc3DetailCode == null)? 0 :this.keybloc3DetailCode.hashCode()));
        result = ((result* 31)+((this.keybloc3TermCode == null)? 0 :this.keybloc3TermCode.hashCode()));
        result = ((result* 31)+((this.keybloc3BillingInd == null)? 0 :this.keybloc3BillingInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keybloc3ExpDate == null)? 0 :this.keybloc3ExpDate.hashCode()));
        result = ((result* 31)+((this.keybloc3Amount == null)? 0 :this.keybloc3Amount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock3) == false) {
            return false;
        }
        KeyBlock3 rhs = ((KeyBlock3) other);
        return (((((((this.keybloc3DetailCode == rhs.keybloc3DetailCode)||((this.keybloc3DetailCode!= null)&&this.keybloc3DetailCode.equals(rhs.keybloc3DetailCode)))&&((this.keybloc3TermCode == rhs.keybloc3TermCode)||((this.keybloc3TermCode!= null)&&this.keybloc3TermCode.equals(rhs.keybloc3TermCode))))&&((this.keybloc3BillingInd == rhs.keybloc3BillingInd)||((this.keybloc3BillingInd!= null)&&this.keybloc3BillingInd.equals(rhs.keybloc3BillingInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keybloc3ExpDate == rhs.keybloc3ExpDate)||((this.keybloc3ExpDate!= null)&&this.keybloc3ExpDate.equals(rhs.keybloc3ExpDate))))&&((this.keybloc3Amount == rhs.keybloc3Amount)||((this.keybloc3Amount!= null)&&this.keybloc3Amount.equals(rhs.keybloc3Amount))));
    }

}
