
package com.ellucian.generated.bpapi.ban.deposit_crosswalk.v1_0_0;

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
    "baseCode",
    "paymentCode",
    "depositCode",
    "dtypCode"
})
@Generated("jsonschema2pojo")
public class DepositCrosswalk100PostRequest {

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_BASE_CODE")
    private String baseCode;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_PAYMENT_CODE")
    private String paymentCode;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc")
    private String depositCode;
    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp")
    private String dtypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    public String getBaseCode() {
        return baseCode;
    }

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public DepositCrosswalk100PostRequest withBaseCode(String baseCode) {
        this.baseCode = baseCode;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public DepositCrosswalk100PostRequest withPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    public String getDepositCode() {
        return depositCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    public void setDepositCode(String depositCode) {
        this.depositCode = depositCode;
    }

    public DepositCrosswalk100PostRequest withDepositCode(String depositCode) {
        this.depositCode = depositCode;
        return this;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public String getDtypCode() {
        return dtypCode;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public void setDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
    }

    public DepositCrosswalk100PostRequest withDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
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

    public DepositCrosswalk100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositCrosswalk100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseCode");
        sb.append('=');
        sb.append(((this.baseCode == null)?"<null>":this.baseCode));
        sb.append(',');
        sb.append("paymentCode");
        sb.append('=');
        sb.append(((this.paymentCode == null)?"<null>":this.paymentCode));
        sb.append(',');
        sb.append("depositCode");
        sb.append('=');
        sb.append(((this.depositCode == null)?"<null>":this.depositCode));
        sb.append(',');
        sb.append("dtypCode");
        sb.append('=');
        sb.append(((this.dtypCode == null)?"<null>":this.dtypCode));
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
        result = ((result* 31)+((this.dtypCode == null)? 0 :this.dtypCode.hashCode()));
        result = ((result* 31)+((this.baseCode == null)? 0 :this.baseCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentCode == null)? 0 :this.paymentCode.hashCode()));
        result = ((result* 31)+((this.depositCode == null)? 0 :this.depositCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositCrosswalk100PostRequest) == false) {
            return false;
        }
        DepositCrosswalk100PostRequest rhs = ((DepositCrosswalk100PostRequest) other);
        return ((((((this.dtypCode == rhs.dtypCode)||((this.dtypCode!= null)&&this.dtypCode.equals(rhs.dtypCode)))&&((this.baseCode == rhs.baseCode)||((this.baseCode!= null)&&this.baseCode.equals(rhs.baseCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentCode == rhs.paymentCode)||((this.paymentCode!= null)&&this.paymentCode.equals(rhs.paymentCode))))&&((this.depositCode == rhs.depositCode)||((this.depositCode!= null)&&this.depositCode.equals(rhs.depositCode))));
    }

}
