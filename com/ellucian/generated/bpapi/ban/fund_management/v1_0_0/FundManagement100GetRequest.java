
package com.ellucian.generated.bpapi.ban.fund_management.v1_0_0;

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
    "fund",
    "yearCode"
})
@Generated("jsonschema2pojo")
public class FundManagement100GetRequest {

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("fund")
    @JsonPropertyDescription("Lineage reference object : keyblckFundCode")
    private String fund;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("yearCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String yearCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("fund")
    public String getFund() {
        return fund;
    }

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("fund")
    public void setFund(String fund) {
        this.fund = fund;
    }

    public FundManagement100GetRequest withFund(String fund) {
        this.fund = fund;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("yearCode")
    public String getYearCode() {
        return yearCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("yearCode")
    public void setYearCode(String yearCode) {
        this.yearCode = yearCode;
    }

    public FundManagement100GetRequest withYearCode(String yearCode) {
        this.yearCode = yearCode;
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

    public FundManagement100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundManagement100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fund");
        sb.append('=');
        sb.append(((this.fund == null)?"<null>":this.fund));
        sb.append(',');
        sb.append("yearCode");
        sb.append('=');
        sb.append(((this.yearCode == null)?"<null>":this.yearCode));
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
        result = ((result* 31)+((this.yearCode == null)? 0 :this.yearCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fund == null)? 0 :this.fund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundManagement100GetRequest) == false) {
            return false;
        }
        FundManagement100GetRequest rhs = ((FundManagement100GetRequest) other);
        return ((((this.yearCode == rhs.yearCode)||((this.yearCode!= null)&&this.yearCode.equals(rhs.yearCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fund == rhs.fund)||((this.fund!= null)&&this.fund.equals(rhs.fund))));
    }

}
