
package com.ellucian.generated.bpapi.ban.flexible_benefits_period_rule.v1_0_0;

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
    "bdcaUndgDesc",
    "calcFactor",
    "activityDate",
    "bdcaOvgCode",
    "bdcaUndgCode",
    "bdcaOvgDesc",
    "newPeriod",
    "curPeriod"
})
@Generated("jsonschema2pojo")
public class FlexibleBenefitsPeriodRule100GetResponse {

    @JsonProperty("bdcaUndgDesc")
    private String bdcaUndgDesc;
    /**
     * Calculation Factor
     * <p>
     * Lineage reference object : PTRFLEX_CALC_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("calcFactor")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_CALC_FACTOR")
    private String calcFactor;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFLEX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Default Overage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_OVG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaOvgCode")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_BDCA_OVG_CODE")
    private String bdcaOvgCode;
    /**
     * Default Underage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_UNDG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaUndgCode")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_BDCA_UNDG_CODE")
    private String bdcaUndgCode;
    @JsonProperty("bdcaOvgDesc")
    private String bdcaOvgDesc;
    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_NEW_PERIOD")
    private Date newPeriod;
    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("curPeriod")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_CUR_PERIOD")
    private Date curPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bdcaUndgDesc")
    public String getBdcaUndgDesc() {
        return bdcaUndgDesc;
    }

    @JsonProperty("bdcaUndgDesc")
    public void setBdcaUndgDesc(String bdcaUndgDesc) {
        this.bdcaUndgDesc = bdcaUndgDesc;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withBdcaUndgDesc(String bdcaUndgDesc) {
        this.bdcaUndgDesc = bdcaUndgDesc;
        return this;
    }

    /**
     * Calculation Factor
     * <p>
     * Lineage reference object : PTRFLEX_CALC_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("calcFactor")
    public String getCalcFactor() {
        return calcFactor;
    }

    /**
     * Calculation Factor
     * <p>
     * Lineage reference object : PTRFLEX_CALC_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("calcFactor")
    public void setCalcFactor(String calcFactor) {
        this.calcFactor = calcFactor;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withCalcFactor(String calcFactor) {
        this.calcFactor = calcFactor;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFLEX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFLEX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Default Overage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_OVG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaOvgCode")
    public String getBdcaOvgCode() {
        return bdcaOvgCode;
    }

    /**
     * Default Overage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_OVG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaOvgCode")
    public void setBdcaOvgCode(String bdcaOvgCode) {
        this.bdcaOvgCode = bdcaOvgCode;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withBdcaOvgCode(String bdcaOvgCode) {
        this.bdcaOvgCode = bdcaOvgCode;
        return this;
    }

    /**
     * Default Underage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_UNDG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaUndgCode")
    public String getBdcaUndgCode() {
        return bdcaUndgCode;
    }

    /**
     * Default Underage
     * <p>
     * Lineage reference object : PTRFLEX_BDCA_UNDG_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaUndgCode")
    public void setBdcaUndgCode(String bdcaUndgCode) {
        this.bdcaUndgCode = bdcaUndgCode;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withBdcaUndgCode(String bdcaUndgCode) {
        this.bdcaUndgCode = bdcaUndgCode;
        return this;
    }

    @JsonProperty("bdcaOvgDesc")
    public String getBdcaOvgDesc() {
        return bdcaOvgDesc;
    }

    @JsonProperty("bdcaOvgDesc")
    public void setBdcaOvgDesc(String bdcaOvgDesc) {
        this.bdcaOvgDesc = bdcaOvgDesc;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withBdcaOvgDesc(String bdcaOvgDesc) {
        this.bdcaOvgDesc = bdcaOvgDesc;
        return this;
    }

    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    public Date getNewPeriod() {
        return newPeriod;
    }

    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    public void setNewPeriod(Date newPeriod) {
        this.newPeriod = newPeriod;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withNewPeriod(Date newPeriod) {
        this.newPeriod = newPeriod;
        return this;
    }

    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("curPeriod")
    public Date getCurPeriod() {
        return curPeriod;
    }

    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("curPeriod")
    public void setCurPeriod(Date curPeriod) {
        this.curPeriod = curPeriod;
    }

    public FlexibleBenefitsPeriodRule100GetResponse withCurPeriod(Date curPeriod) {
        this.curPeriod = curPeriod;
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

    public FlexibleBenefitsPeriodRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexibleBenefitsPeriodRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdcaUndgDesc");
        sb.append('=');
        sb.append(((this.bdcaUndgDesc == null)?"<null>":this.bdcaUndgDesc));
        sb.append(',');
        sb.append("calcFactor");
        sb.append('=');
        sb.append(((this.calcFactor == null)?"<null>":this.calcFactor));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaOvgCode");
        sb.append('=');
        sb.append(((this.bdcaOvgCode == null)?"<null>":this.bdcaOvgCode));
        sb.append(',');
        sb.append("bdcaUndgCode");
        sb.append('=');
        sb.append(((this.bdcaUndgCode == null)?"<null>":this.bdcaUndgCode));
        sb.append(',');
        sb.append("bdcaOvgDesc");
        sb.append('=');
        sb.append(((this.bdcaOvgDesc == null)?"<null>":this.bdcaOvgDesc));
        sb.append(',');
        sb.append("newPeriod");
        sb.append('=');
        sb.append(((this.newPeriod == null)?"<null>":this.newPeriod));
        sb.append(',');
        sb.append("curPeriod");
        sb.append('=');
        sb.append(((this.curPeriod == null)?"<null>":this.curPeriod));
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
        result = ((result* 31)+((this.bdcaUndgDesc == null)? 0 :this.bdcaUndgDesc.hashCode()));
        result = ((result* 31)+((this.calcFactor == null)? 0 :this.calcFactor.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaOvgCode == null)? 0 :this.bdcaOvgCode.hashCode()));
        result = ((result* 31)+((this.bdcaUndgCode == null)? 0 :this.bdcaUndgCode.hashCode()));
        result = ((result* 31)+((this.bdcaOvgDesc == null)? 0 :this.bdcaOvgDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.newPeriod == null)? 0 :this.newPeriod.hashCode()));
        result = ((result* 31)+((this.curPeriod == null)? 0 :this.curPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleBenefitsPeriodRule100GetResponse) == false) {
            return false;
        }
        FlexibleBenefitsPeriodRule100GetResponse rhs = ((FlexibleBenefitsPeriodRule100GetResponse) other);
        return ((((((((((this.bdcaUndgDesc == rhs.bdcaUndgDesc)||((this.bdcaUndgDesc!= null)&&this.bdcaUndgDesc.equals(rhs.bdcaUndgDesc)))&&((this.calcFactor == rhs.calcFactor)||((this.calcFactor!= null)&&this.calcFactor.equals(rhs.calcFactor))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaOvgCode == rhs.bdcaOvgCode)||((this.bdcaOvgCode!= null)&&this.bdcaOvgCode.equals(rhs.bdcaOvgCode))))&&((this.bdcaUndgCode == rhs.bdcaUndgCode)||((this.bdcaUndgCode!= null)&&this.bdcaUndgCode.equals(rhs.bdcaUndgCode))))&&((this.bdcaOvgDesc == rhs.bdcaOvgDesc)||((this.bdcaOvgDesc!= null)&&this.bdcaOvgDesc.equals(rhs.bdcaOvgDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.newPeriod == rhs.newPeriod)||((this.newPeriod!= null)&&this.newPeriod.equals(rhs.newPeriod))))&&((this.curPeriod == rhs.curPeriod)||((this.curPeriod!= null)&&this.curPeriod.equals(rhs.curPeriod))));
    }

}
