
package com.ellucian.generated.bpapi.ban.schedule_labor_distribution.v1_0_0;

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
    "projCode",
    "fundCode",
    "acciCode",
    "progCode",
    "coasCode",
    "ctypCode",
    "locnCode",
    "acctCode",
    "actvCode",
    "orgnCode",
    "percent"
})
@Generated("jsonschema2pojo")
public class ScheduleLaborDistribution100PostResponse {

    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PROJ_CODE")
    private String projCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_FUND_CODE")
    private String fundCode;
    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCI_CODE")
    private String acciCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PROG_CODE")
    private String progCode;
    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_COAS_CODE")
    private String coasCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_CTYP_CODE")
    private String ctypCode;
    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_LOCN_CODE")
    private String locnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCT_CODE")
    private String acctCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACTV_CODE")
    private String actvCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ORGN_CODE")
    private String orgnCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PERCENT")
    private Double percent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public ScheduleLaborDistribution100PostResponse withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ScheduleLaborDistribution100PostResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public ScheduleLaborDistribution100PostResponse withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public ScheduleLaborDistribution100PostResponse withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ScheduleLaborDistribution100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public ScheduleLaborDistribution100PostResponse withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public ScheduleLaborDistribution100PostResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public ScheduleLaborDistribution100PostResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public ScheduleLaborDistribution100PostResponse withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public ScheduleLaborDistribution100PostResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ScheduleLaborDistribution100PostResponse withPercent(Double percent) {
        this.percent = percent;
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

    public ScheduleLaborDistribution100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleLaborDistribution100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
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
        result = ((result* 31)+((this.projCode == null)? 0 :this.projCode.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleLaborDistribution100PostResponse) == false) {
            return false;
        }
        ScheduleLaborDistribution100PostResponse rhs = ((ScheduleLaborDistribution100PostResponse) other);
        return (((((((((((((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode)))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))));
    }

}
