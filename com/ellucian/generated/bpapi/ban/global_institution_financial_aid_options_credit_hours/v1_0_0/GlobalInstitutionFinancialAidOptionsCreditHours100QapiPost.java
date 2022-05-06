
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_credit_hours.v1_0_0;

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
    "keyblckAidyCode",
    "period",
    "levlCode",
    "fullTimeCrHrs",
    "3quarterCrHrs",
    "halfTimeCrHrs"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    /**
     * Period
     * <p>
     * Lineage reference object : RORCRHR_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_PERIOD, Lookup lineage reference object : robprds")
    private String period;
    /**
     * Level
     * <p>
     * Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Credit Hours - Full Time
     * <p>
     * Lineage reference object : RORCRHR_FULL_TIME_CR_HRS
     * 
     */
    @JsonProperty("fullTimeCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_FULL_TIME_CR_HRS")
    private Double fullTimeCrHrs;
    /**
     * Credit Hours - 3/4 Time
     * <p>
     * Lineage reference object : RORCRHR_3QUARTER_CR_HRS
     * 
     */
    @JsonProperty("3quarterCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_3QUARTER_CR_HRS")
    private Double _3quarterCrHrs;
    /**
     * Credit Hours  - 1/2 Time
     * <p>
     * Lineage reference object : RORCRHR_HALF_TIME_CR_HRS
     * 
     */
    @JsonProperty("halfTimeCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_HALF_TIME_CR_HRS")
    private Double halfTimeCrHrs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RORCRHR_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RORCRHR_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Credit Hours - Full Time
     * <p>
     * Lineage reference object : RORCRHR_FULL_TIME_CR_HRS
     * 
     */
    @JsonProperty("fullTimeCrHrs")
    public Double getFullTimeCrHrs() {
        return fullTimeCrHrs;
    }

    /**
     * Credit Hours - Full Time
     * <p>
     * Lineage reference object : RORCRHR_FULL_TIME_CR_HRS
     * 
     */
    @JsonProperty("fullTimeCrHrs")
    public void setFullTimeCrHrs(Double fullTimeCrHrs) {
        this.fullTimeCrHrs = fullTimeCrHrs;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withFullTimeCrHrs(Double fullTimeCrHrs) {
        this.fullTimeCrHrs = fullTimeCrHrs;
        return this;
    }

    /**
     * Credit Hours - 3/4 Time
     * <p>
     * Lineage reference object : RORCRHR_3QUARTER_CR_HRS
     * 
     */
    @JsonProperty("3quarterCrHrs")
    public Double get3quarterCrHrs() {
        return _3quarterCrHrs;
    }

    /**
     * Credit Hours - 3/4 Time
     * <p>
     * Lineage reference object : RORCRHR_3QUARTER_CR_HRS
     * 
     */
    @JsonProperty("3quarterCrHrs")
    public void set3quarterCrHrs(Double _3quarterCrHrs) {
        this._3quarterCrHrs = _3quarterCrHrs;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost with3quarterCrHrs(Double _3quarterCrHrs) {
        this._3quarterCrHrs = _3quarterCrHrs;
        return this;
    }

    /**
     * Credit Hours  - 1/2 Time
     * <p>
     * Lineage reference object : RORCRHR_HALF_TIME_CR_HRS
     * 
     */
    @JsonProperty("halfTimeCrHrs")
    public Double getHalfTimeCrHrs() {
        return halfTimeCrHrs;
    }

    /**
     * Credit Hours  - 1/2 Time
     * <p>
     * Lineage reference object : RORCRHR_HALF_TIME_CR_HRS
     * 
     */
    @JsonProperty("halfTimeCrHrs")
    public void setHalfTimeCrHrs(Double halfTimeCrHrs) {
        this.halfTimeCrHrs = halfTimeCrHrs;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withHalfTimeCrHrs(Double halfTimeCrHrs) {
        this.halfTimeCrHrs = halfTimeCrHrs;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("fullTimeCrHrs");
        sb.append('=');
        sb.append(((this.fullTimeCrHrs == null)?"<null>":this.fullTimeCrHrs));
        sb.append(',');
        sb.append("_3quarterCrHrs");
        sb.append('=');
        sb.append(((this._3quarterCrHrs == null)?"<null>":this._3quarterCrHrs));
        sb.append(',');
        sb.append("halfTimeCrHrs");
        sb.append('=');
        sb.append(((this.halfTimeCrHrs == null)?"<null>":this.halfTimeCrHrs));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._3quarterCrHrs == null)? 0 :this._3quarterCrHrs.hashCode()));
        result = ((result* 31)+((this.halfTimeCrHrs == null)? 0 :this.halfTimeCrHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.fullTimeCrHrs == null)? 0 :this.fullTimeCrHrs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost rhs = ((GlobalInstitutionFinancialAidOptionsCreditHours100QapiPost) other);
        return ((((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._3quarterCrHrs == rhs._3quarterCrHrs)||((this._3quarterCrHrs!= null)&&this._3quarterCrHrs.equals(rhs._3quarterCrHrs))))&&((this.halfTimeCrHrs == rhs.halfTimeCrHrs)||((this.halfTimeCrHrs!= null)&&this.halfTimeCrHrs.equals(rhs.halfTimeCrHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.fullTimeCrHrs == rhs.fullTimeCrHrs)||((this.fullTimeCrHrs!= null)&&this.fullTimeCrHrs.equals(rhs.fullTimeCrHrs))));
    }

}
