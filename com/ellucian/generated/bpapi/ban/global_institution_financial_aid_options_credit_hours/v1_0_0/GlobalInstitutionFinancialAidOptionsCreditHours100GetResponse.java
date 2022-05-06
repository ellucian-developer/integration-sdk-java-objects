
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
    "period",
    "3quarterCrHrs",
    "stvlevlLevlDesc",
    "halfTimeCrHrs",
    "levlCode",
    "displayCrossoverInd",
    "fullTimeCrHrs"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse {

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
     * Credit Hours - 3/4 Time
     * <p>
     * Lineage reference object : RORCRHR_3QUARTER_CR_HRS
     * 
     */
    @JsonProperty("3quarterCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_3QUARTER_CR_HRS")
    private Double _3quarterCrHrs;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlLevlDesc")
    private String stvlevlLevlDesc;
    /**
     * Credit Hours  - 1/2 Time
     * <p>
     * Lineage reference object : RORCRHR_HALF_TIME_CR_HRS
     * 
     */
    @JsonProperty("halfTimeCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_HALF_TIME_CR_HRS")
    private Double halfTimeCrHrs;
    /**
     * Level
     * <p>
     * Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonProperty("displayCrossoverInd")
    private String displayCrossoverInd;
    /**
     * Credit Hours - Full Time
     * <p>
     * Lineage reference object : RORCRHR_FULL_TIME_CR_HRS
     * 
     */
    @JsonProperty("fullTimeCrHrs")
    @JsonPropertyDescription("Lineage reference object : RORCRHR_FULL_TIME_CR_HRS")
    private Double fullTimeCrHrs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withPeriod(String period) {
        this.period = period;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse with3quarterCrHrs(Double _3quarterCrHrs) {
        this._3quarterCrHrs = _3quarterCrHrs;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlLevlDesc")
    public String getStvlevlLevlDesc() {
        return stvlevlLevlDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlLevlDesc")
    public void setStvlevlLevlDesc(String stvlevlLevlDesc) {
        this.stvlevlLevlDesc = stvlevlLevlDesc;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withStvlevlLevlDesc(String stvlevlLevlDesc) {
        this.stvlevlLevlDesc = stvlevlLevlDesc;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withHalfTimeCrHrs(Double halfTimeCrHrs) {
        this.halfTimeCrHrs = halfTimeCrHrs;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("displayCrossoverInd")
    public String getDisplayCrossoverInd() {
        return displayCrossoverInd;
    }

    @JsonProperty("displayCrossoverInd")
    public void setDisplayCrossoverInd(String displayCrossoverInd) {
        this.displayCrossoverInd = displayCrossoverInd;
    }

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withDisplayCrossoverInd(String displayCrossoverInd) {
        this.displayCrossoverInd = displayCrossoverInd;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withFullTimeCrHrs(Double fullTimeCrHrs) {
        this.fullTimeCrHrs = fullTimeCrHrs;
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

    public GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("_3quarterCrHrs");
        sb.append('=');
        sb.append(((this._3quarterCrHrs == null)?"<null>":this._3quarterCrHrs));
        sb.append(',');
        sb.append("stvlevlLevlDesc");
        sb.append('=');
        sb.append(((this.stvlevlLevlDesc == null)?"<null>":this.stvlevlLevlDesc));
        sb.append(',');
        sb.append("halfTimeCrHrs");
        sb.append('=');
        sb.append(((this.halfTimeCrHrs == null)?"<null>":this.halfTimeCrHrs));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("displayCrossoverInd");
        sb.append('=');
        sb.append(((this.displayCrossoverInd == null)?"<null>":this.displayCrossoverInd));
        sb.append(',');
        sb.append("fullTimeCrHrs");
        sb.append('=');
        sb.append(((this.fullTimeCrHrs == null)?"<null>":this.fullTimeCrHrs));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._3quarterCrHrs == null)? 0 :this._3quarterCrHrs.hashCode()));
        result = ((result* 31)+((this.stvlevlLevlDesc == null)? 0 :this.stvlevlLevlDesc.hashCode()));
        result = ((result* 31)+((this.halfTimeCrHrs == null)? 0 :this.halfTimeCrHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.displayCrossoverInd == null)? 0 :this.displayCrossoverInd.hashCode()));
        result = ((result* 31)+((this.fullTimeCrHrs == null)? 0 :this.fullTimeCrHrs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse rhs = ((GlobalInstitutionFinancialAidOptionsCreditHours100GetResponse) other);
        return (((((((((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this._3quarterCrHrs == rhs._3quarterCrHrs)||((this._3quarterCrHrs!= null)&&this._3quarterCrHrs.equals(rhs._3quarterCrHrs))))&&((this.stvlevlLevlDesc == rhs.stvlevlLevlDesc)||((this.stvlevlLevlDesc!= null)&&this.stvlevlLevlDesc.equals(rhs.stvlevlLevlDesc))))&&((this.halfTimeCrHrs == rhs.halfTimeCrHrs)||((this.halfTimeCrHrs!= null)&&this.halfTimeCrHrs.equals(rhs.halfTimeCrHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.displayCrossoverInd == rhs.displayCrossoverInd)||((this.displayCrossoverInd!= null)&&this.displayCrossoverInd.equals(rhs.displayCrossoverInd))))&&((this.fullTimeCrHrs == rhs.fullTimeCrHrs)||((this.fullTimeCrHrs!= null)&&this.fullTimeCrHrs.equals(rhs.fullTimeCrHrs))));
    }

}
