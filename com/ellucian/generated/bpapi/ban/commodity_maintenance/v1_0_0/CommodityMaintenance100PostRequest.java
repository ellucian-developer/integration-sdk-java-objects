
package com.ellucian.generated.bpapi.ban.commodity_maintenance.v1_0_0;

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
    "displayCommCode",
    "coasCode",
    "acctCode"
})
@Generated("jsonschema2pojo")
public class CommodityMaintenance100PostRequest {

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    @JsonPropertyDescription("Lineage reference object : displayCommCode")
    private String displayCommCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_ACCT_CODE")
    private String acctCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public String getDisplayCommCode() {
        return displayCommCode;
    }

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public void setDisplayCommCode(String displayCommCode) {
        this.displayCommCode = displayCommCode;
    }

    public CommodityMaintenance100PostRequest withDisplayCommCode(String displayCommCode) {
        this.displayCommCode = displayCommCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public CommodityMaintenance100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public CommodityMaintenance100PostRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public CommodityMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayCommCode");
        sb.append('=');
        sb.append(((this.displayCommCode == null)?"<null>":this.displayCommCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
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
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.displayCommCode == null)? 0 :this.displayCommCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityMaintenance100PostRequest) == false) {
            return false;
        }
        CommodityMaintenance100PostRequest rhs = ((CommodityMaintenance100PostRequest) other);
        return (((((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.displayCommCode == rhs.displayCommCode)||((this.displayCommCode!= null)&&this.displayCommCode.equals(rhs.displayCommCode))));
    }

}
