
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
    "bdcaCode",
    "bdplCode",
    "insSalaryDate",
    "ageDate",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class LifeInsuranceCalcProcessParameterRule100QapiPost {

    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRLIFE_BDCA_CODE
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
     * 
     */
    @JsonProperty("insSalaryDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_INS_SALARY_DATE")
    private Date insSalaryDate;
    /**
     * Age Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_AGE_DATE
     * 
     */
    @JsonProperty("ageDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_AGE_DATE")
    private Date ageDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFE_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRLIFE_BDCA_CODE
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
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public LifeInsuranceCalcProcessParameterRule100QapiPost withBdcaCode(String bdcaCode) {
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

    public LifeInsuranceCalcProcessParameterRule100QapiPost withBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
        return this;
    }

    /**
     * Insurance Salary Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_INS_SALARY_DATE
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
     * 
     */
    @JsonProperty("insSalaryDate")
    public void setInsSalaryDate(Date insSalaryDate) {
        this.insSalaryDate = insSalaryDate;
    }

    public LifeInsuranceCalcProcessParameterRule100QapiPost withInsSalaryDate(Date insSalaryDate) {
        this.insSalaryDate = insSalaryDate;
        return this;
    }

    /**
     * Age Effective Date
     * <p>
     * Lineage reference object : PTRLIFE_AGE_DATE
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
     * 
     */
    @JsonProperty("ageDate")
    public void setAgeDate(Date ageDate) {
        this.ageDate = ageDate;
    }

    public LifeInsuranceCalcProcessParameterRule100QapiPost withAgeDate(Date ageDate) {
        this.ageDate = ageDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFE_ACTIVITY_DATE
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
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LifeInsuranceCalcProcessParameterRule100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public LifeInsuranceCalcProcessParameterRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeInsuranceCalcProcessParameterRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ageDate");
        sb.append('=');
        sb.append(((this.ageDate == null)?"<null>":this.ageDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        if ((other instanceof LifeInsuranceCalcProcessParameterRule100QapiPost) == false) {
            return false;
        }
        LifeInsuranceCalcProcessParameterRule100QapiPost rhs = ((LifeInsuranceCalcProcessParameterRule100QapiPost) other);
        return (((((((this.ageDate == rhs.ageDate)||((this.ageDate!= null)&&this.ageDate.equals(rhs.ageDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.bdplCode == rhs.bdplCode)||((this.bdplCode!= null)&&this.bdplCode.equals(rhs.bdplCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.insSalaryDate == rhs.insSalaryDate)||((this.insSalaryDate!= null)&&this.insSalaryDate.equals(rhs.insSalaryDate))));
    }

}
