
package com.ellucian.generated.bpapi.ban.funds_management.v1_0_0;

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
    "yearCode",
    "sort",
    "fundCode"
})
@Generated("jsonschema2pojo")
public class FundsManagement100QapiPost {

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
    @JsonProperty("sort")
    private String sort;
    /**
     * Fund
     * <p>
     * Lineage reference object : RFRASPC_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_FUND_CODE")
    private String fundCode;
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

    public FundsManagement100QapiPost withYearCode(String yearCode) {
        this.yearCode = yearCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sort")
    public String getSort() {
        return sort;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    public FundsManagement100QapiPost withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RFRASPC_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RFRASPC_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public FundsManagement100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public FundsManagement100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundsManagement100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yearCode");
        sb.append('=');
        sb.append(((this.yearCode == null)?"<null>":this.yearCode));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
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
        result = ((result* 31)+((this.sort == null)? 0 :this.sort.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundsManagement100QapiPost) == false) {
            return false;
        }
        FundsManagement100QapiPost rhs = ((FundsManagement100QapiPost) other);
        return (((((this.yearCode == rhs.yearCode)||((this.yearCode!= null)&&this.yearCode.equals(rhs.yearCode)))&&((this.sort == rhs.sort)||((this.sort!= null)&&this.sort.equals(rhs.sort))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))));
    }

}
