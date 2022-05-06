
package com.ellucian.generated.bpapi.ban.life_insurance_calc_process_parameter_rule.v1_0_0;

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
    "ageDate",
    "activityDate",
    "bdcaCode",
    "bdplCode",
    "insSalaryDate"
})
@Generated("jsonschema2pojo")
public class LifeInsuranceCalcProcessParameterRule100GetResponse {

    /**
     * Age Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_AGE_DATE
     * (Required)
     * 
     */
    @JsonProperty("ageDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_AGE_DATE")
    private Date ageDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFE_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRLIFE_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_BDCA_CODE")
    private String bdcaCode;
    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFE_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_BDPL_CODE")
    private String bdplCode;
    /**
     * Insurance Salary Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_INS_SALARY_DATE
     * (Required)
     * 
     */
    @JsonProperty("insSalaryDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_INS_SALARY_DATE")
    private Date insSalaryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Age Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_AGE_DATE
     * (Required)
     * 
     */
    @JsonProperty("ageDate")
    public Date getAgeDate() {
        return ageDate;
    }

    /**
     * Age Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_AGE_DATE
     * (Required)
     * 
     */
    @JsonProperty("ageDate")
    public void setAgeDate(Date ageDate) {
        this.ageDate = ageDate;
    }

    public LifeInsuranceCalcProcessParameterRule100GetResponse withAgeDate(Date ageDate) {
        this.ageDate = ageDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFE_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFE_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LifeInsuranceCalcProcessParameterRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRLIFE_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRLIFE_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public LifeInsuranceCalcProcessParameterRule100GetResponse withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFE_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public String getBdplCode() {
        return bdplCode;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFE_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public void setBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
    }

    public LifeInsuranceCalcProcessParameterRule100GetResponse withBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
        return this;
    }

    /**
     * Insurance Salary Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_INS_SALARY_DATE
     * (Required)
     * 
     */
    @JsonProperty("insSalaryDate")
    public Date getInsSalaryDate() {
        return insSalaryDate;
    }

    /**
     * Insurance Salary Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_INS_SALARY_DATE
     * (Required)
     * 
     */
    @JsonProperty("insSalaryDate")
    public void setInsSalaryDate(Date insSalaryDate) {
        this.insSalaryDate = insSalaryDate;
    }

    public LifeInsuranceCalcProcessParameterRule100GetResponse withInsSalaryDate(Date insSalaryDate) {
        this.insSalaryDate = insSalaryDate;
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

    public LifeInsuranceCalcProcessParameterRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeInsuranceCalcProcessParameterRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ageDate");
        sb.append('=');
        sb.append(((this.ageDate == null)?"<null>":this.ageDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("bdplCode");
        sb.append('=');
        sb.append(((this.bdplCode == null)?"<null>":this.bdplCode));
        sb.append(',');
        sb.append("insSalaryDate");
        sb.append('=');
        sb.append(((this.insSalaryDate == null)?"<null>":this.insSalaryDate));
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
        result = ((result* 31)+((this.ageDate == null)? 0 :this.ageDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.bdplCode == null)? 0 :this.bdplCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.insSalaryDate == null)? 0 :this.insSalaryDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeInsuranceCalcProcessParameterRule100GetResponse) == false) {
            return false;
        }
        LifeInsuranceCalcProcessParameterRule100GetResponse rhs = ((LifeInsuranceCalcProcessParameterRule100GetResponse) other);
        return (((((((this.ageDate == rhs.ageDate)||((this.ageDate!= null)&&this.ageDate.equals(rhs.ageDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.bdplCode == rhs.bdplCode)||((this.bdplCode!= null)&&this.bdplCode.equals(rhs.bdplCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.insSalaryDate == rhs.insSalaryDate)||((this.insSalaryDate!= null)&&this.insSalaryDate.equals(rhs.insSalaryDate))));
    }

}
