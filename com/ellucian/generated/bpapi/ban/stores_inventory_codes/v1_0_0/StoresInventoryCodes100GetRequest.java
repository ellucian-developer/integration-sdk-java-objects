
package com.ellucian.generated.bpapi.ban.stores_inventory_codes.v1_0_0;

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
    "commCode",
    "effDate",
    "displayFtvcommDesc",
    "termDate",
    "uomsCodeIssd"
})
@Generated("jsonschema2pojo")
public class StoresInventoryCodes100GetRequest {

    /**
     * Commodity  
     * Code
     * <p>
     * Lineage reference object : FTVINVM_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    @JsonPropertyDescription("Lineage reference object : FTVINVM_COMM_CODE")
    private String commCode;
    /**
     * Effective  
     * Date
     * <p>
     * Lineage reference object : FTVINVM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVINVM_EFF_DATE")
    private Date effDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFtvcommDesc")
    private String displayFtvcommDesc;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVINVM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVINVM_TERM_DATE")
    private Date termDate;
    /**
     * Lineage reference object : FTVINVM_UOMS_CODE_ISSD
     * 
     */
    @JsonProperty("uomsCodeIssd")
    @JsonPropertyDescription("Lineage reference object : FTVINVM_UOMS_CODE_ISSD")
    private String uomsCodeIssd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Commodity  
     * Code
     * <p>
     * Lineage reference object : FTVINVM_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public String getCommCode() {
        return commCode;
    }

    /**
     * Commodity  
     * Code
     * <p>
     * Lineage reference object : FTVINVM_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public StoresInventoryCodes100GetRequest withCommCode(String commCode) {
        this.commCode = commCode;
        return this;
    }

    /**
     * Effective  
     * Date
     * <p>
     * Lineage reference object : FTVINVM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective  
     * Date
     * <p>
     * Lineage reference object : FTVINVM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public StoresInventoryCodes100GetRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFtvcommDesc")
    public String getDisplayFtvcommDesc() {
        return displayFtvcommDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFtvcommDesc")
    public void setDisplayFtvcommDesc(String displayFtvcommDesc) {
        this.displayFtvcommDesc = displayFtvcommDesc;
    }

    public StoresInventoryCodes100GetRequest withDisplayFtvcommDesc(String displayFtvcommDesc) {
        this.displayFtvcommDesc = displayFtvcommDesc;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVINVM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVINVM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public StoresInventoryCodes100GetRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Lineage reference object : FTVINVM_UOMS_CODE_ISSD
     * 
     */
    @JsonProperty("uomsCodeIssd")
    public String getUomsCodeIssd() {
        return uomsCodeIssd;
    }

    /**
     * Lineage reference object : FTVINVM_UOMS_CODE_ISSD
     * 
     */
    @JsonProperty("uomsCodeIssd")
    public void setUomsCodeIssd(String uomsCodeIssd) {
        this.uomsCodeIssd = uomsCodeIssd;
    }

    public StoresInventoryCodes100GetRequest withUomsCodeIssd(String uomsCodeIssd) {
        this.uomsCodeIssd = uomsCodeIssd;
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

    public StoresInventoryCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StoresInventoryCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("displayFtvcommDesc");
        sb.append('=');
        sb.append(((this.displayFtvcommDesc == null)?"<null>":this.displayFtvcommDesc));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("uomsCodeIssd");
        sb.append('=');
        sb.append(((this.uomsCodeIssd == null)?"<null>":this.uomsCodeIssd));
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
        result = ((result* 31)+((this.commCode == null)? 0 :this.commCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayFtvcommDesc == null)? 0 :this.displayFtvcommDesc.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.uomsCodeIssd == null)? 0 :this.uomsCodeIssd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoresInventoryCodes100GetRequest) == false) {
            return false;
        }
        StoresInventoryCodes100GetRequest rhs = ((StoresInventoryCodes100GetRequest) other);
        return (((((((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayFtvcommDesc == rhs.displayFtvcommDesc)||((this.displayFtvcommDesc!= null)&&this.displayFtvcommDesc.equals(rhs.displayFtvcommDesc))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.uomsCodeIssd == rhs.uomsCodeIssd)||((this.uomsCodeIssd!= null)&&this.uomsCodeIssd.equals(rhs.uomsCodeIssd))));
    }

}
