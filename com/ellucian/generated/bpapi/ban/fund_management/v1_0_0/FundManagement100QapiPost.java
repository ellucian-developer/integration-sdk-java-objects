
package com.ellucian.generated.bpapi.ban.fund_management.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "yearCode",
    "fund"
})
@Generated("jsonschema2pojo")
public class FundManagement100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yearCode")
    private String yearCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fund")
    private String fund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yearCode")
    public String getYearCode() {
        return yearCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yearCode")
    public void setYearCode(String yearCode) {
        this.yearCode = yearCode;
    }

    public FundManagement100QapiPost withYearCode(String yearCode) {
        this.yearCode = yearCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fund")
    public String getFund() {
        return fund;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fund")
    public void setFund(String fund) {
        this.fund = fund;
    }

    public FundManagement100QapiPost withFund(String fund) {
        this.fund = fund;
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

    public FundManagement100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundManagement100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yearCode");
        sb.append('=');
        sb.append(((this.yearCode == null)?"<null>":this.yearCode));
        sb.append(',');
        sb.append("fund");
        sb.append('=');
        sb.append(((this.fund == null)?"<null>":this.fund));
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
        if ((other instanceof FundManagement100QapiPost) == false) {
            return false;
        }
        FundManagement100QapiPost rhs = ((FundManagement100QapiPost) other);
        return ((((this.yearCode == rhs.yearCode)||((this.yearCode!= null)&&this.yearCode.equals(rhs.yearCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fund == rhs.fund)||((this.fund!= null)&&this.fund.equals(rhs.fund))));
    }

}
