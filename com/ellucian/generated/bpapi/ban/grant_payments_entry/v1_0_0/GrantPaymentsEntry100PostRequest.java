
package com.ellucian.generated.bpapi.ban.grant_payments_entry.v1_0_0;

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
    "withholdingAmt",
    "fundCode",
    "keyblckAgencyCode",
    "grntCode",
    "chargeAmount",
    "keyblckGrntCode",
    "detailCode"
})
@Generated("jsonschema2pojo")
public class GrantPaymentsEntry100PostRequest {

    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_WITHHOLDING_AMT")
    private Double withholdingAmt;
    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_FUND_CODE")
    private String fundCode;
    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAgencyCode")
    private Object keyblckAgencyCode;
    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_GRNT_CODE")
    private String grntCode;
    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    private Double chargeAmount;
    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    @JsonPropertyDescription("Lineage reference object : keyblckGrntCode")
    private Object keyblckGrntCode;
    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_DETAIL_CODE")
    private String detailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public Double getWithholdingAmt() {
        return withholdingAmt;
    }

    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public void setWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
    }

    public GrantPaymentsEntry100PostRequest withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public GrantPaymentsEntry100PostRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public Object getKeyblckAgencyCode() {
        return keyblckAgencyCode;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public void setKeyblckAgencyCode(Object keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
    }

    public GrantPaymentsEntry100PostRequest withKeyblckAgencyCode(Object keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
        return this;
    }

    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public String getGrntCode() {
        return grntCode;
    }

    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public void setGrntCode(String grntCode) {
        this.grntCode = grntCode;
    }

    public GrantPaymentsEntry100PostRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    public Double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("chargeAmount")
    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public GrantPaymentsEntry100PostRequest withChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public Object getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public GrantPaymentsEntry100PostRequest withKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
        return this;
    }

    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public GrantPaymentsEntry100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public GrantPaymentsEntry100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantPaymentsEntry100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("keyblckAgencyCode");
        sb.append('=');
        sb.append(((this.keyblckAgencyCode == null)?"<null>":this.keyblckAgencyCode));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("chargeAmount");
        sb.append('=');
        sb.append(((this.chargeAmount == null)?"<null>":this.chargeAmount));
        sb.append(',');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.keyblckAgencyCode == null)? 0 :this.keyblckAgencyCode.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.chargeAmount == null)? 0 :this.chargeAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckGrntCode == null)? 0 :this.keyblckGrntCode.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantPaymentsEntry100PostRequest) == false) {
            return false;
        }
        GrantPaymentsEntry100PostRequest rhs = ((GrantPaymentsEntry100PostRequest) other);
        return (((((((((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt)))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.chargeAmount == rhs.chargeAmount)||((this.chargeAmount!= null)&&this.chargeAmount.equals(rhs.chargeAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))));
    }

}
