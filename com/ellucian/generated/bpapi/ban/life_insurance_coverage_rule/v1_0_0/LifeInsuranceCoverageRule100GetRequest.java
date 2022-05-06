
package com.ellucian.generated.bpapi.ban.life_insurance_coverage_rule.v1_0_0;

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
    "toSalary",
    "activityDate",
    "bdcaCode",
    "fromSalary",
    "bdplCode",
    "covAmt"
})
@Generated("jsonschema2pojo")
public class LifeInsuranceCoverageRule100GetRequest {

    /**
     * Salary To
     * <p>
     * Lineage reference object : PTRCOVR_TO_SALARY
     * (Required)
     * 
     */
    @JsonProperty("toSalary")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_TO_SALARY")
    private Double toSalary;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRCOVR_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRCOVR_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_BDCA_CODE")
    private String bdcaCode;
    /**
     * Salary From
     * <p>
     * Lineage reference object : PTRCOVR_FROM_SALARY
     * (Required)
     * 
     */
    @JsonProperty("fromSalary")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_FROM_SALARY")
    private Double fromSalary;
    /**
     * Plan
     * <p>
     * Lineage reference object : PTRCOVR_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_BDPL_CODE")
    private String bdplCode;
    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRCOVR_COV_AMT
     * (Required)
     * 
     */
    @JsonProperty("covAmt")
    @JsonPropertyDescription("Lineage reference object : PTRCOVR_COV_AMT")
    private Double covAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Salary To
     * <p>
     * Lineage reference object : PTRCOVR_TO_SALARY
     * (Required)
     * 
     */
    @JsonProperty("toSalary")
    public Double getToSalary() {
        return toSalary;
    }

    /**
     * Salary To
     * <p>
     * Lineage reference object : PTRCOVR_TO_SALARY
     * (Required)
     * 
     */
    @JsonProperty("toSalary")
    public void setToSalary(Double toSalary) {
        this.toSalary = toSalary;
    }

    public LifeInsuranceCoverageRule100GetRequest withToSalary(Double toSalary) {
        this.toSalary = toSalary;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRCOVR_ACTIVITY_DATE
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
     * Lineage reference object : PTRCOVR_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LifeInsuranceCoverageRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Deduction
     * <p>
     * Lineage reference object : PTRCOVR_BDCA_CODE
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
     * Lineage reference object : PTRCOVR_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public LifeInsuranceCoverageRule100GetRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Salary From
     * <p>
     * Lineage reference object : PTRCOVR_FROM_SALARY
     * (Required)
     * 
     */
    @JsonProperty("fromSalary")
    public Double getFromSalary() {
        return fromSalary;
    }

    /**
     * Salary From
     * <p>
     * Lineage reference object : PTRCOVR_FROM_SALARY
     * (Required)
     * 
     */
    @JsonProperty("fromSalary")
    public void setFromSalary(Double fromSalary) {
        this.fromSalary = fromSalary;
    }

    public LifeInsuranceCoverageRule100GetRequest withFromSalary(Double fromSalary) {
        this.fromSalary = fromSalary;
        return this;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRCOVR_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public String getBdplCode() {
        return bdplCode;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRCOVR_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public void setBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
    }

    public LifeInsuranceCoverageRule100GetRequest withBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
        return this;
    }

    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRCOVR_COV_AMT
     * (Required)
     * 
     */
    @JsonProperty("covAmt")
    public Double getCovAmt() {
        return covAmt;
    }

    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRCOVR_COV_AMT
     * (Required)
     * 
     */
    @JsonProperty("covAmt")
    public void setCovAmt(Double covAmt) {
        this.covAmt = covAmt;
    }

    public LifeInsuranceCoverageRule100GetRequest withCovAmt(Double covAmt) {
        this.covAmt = covAmt;
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

    public LifeInsuranceCoverageRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeInsuranceCoverageRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("toSalary");
        sb.append('=');
        sb.append(((this.toSalary == null)?"<null>":this.toSalary));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("fromSalary");
        sb.append('=');
        sb.append(((this.fromSalary == null)?"<null>":this.fromSalary));
        sb.append(',');
        sb.append("bdplCode");
        sb.append('=');
        sb.append(((this.bdplCode == null)?"<null>":this.bdplCode));
        sb.append(',');
        sb.append("covAmt");
        sb.append('=');
        sb.append(((this.covAmt == null)?"<null>":this.covAmt));
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
        result = ((result* 31)+((this.toSalary == null)? 0 :this.toSalary.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.fromSalary == null)? 0 :this.fromSalary.hashCode()));
        result = ((result* 31)+((this.bdplCode == null)? 0 :this.bdplCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.covAmt == null)? 0 :this.covAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeInsuranceCoverageRule100GetRequest) == false) {
            return false;
        }
        LifeInsuranceCoverageRule100GetRequest rhs = ((LifeInsuranceCoverageRule100GetRequest) other);
        return ((((((((this.toSalary == rhs.toSalary)||((this.toSalary!= null)&&this.toSalary.equals(rhs.toSalary)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.fromSalary == rhs.fromSalary)||((this.fromSalary!= null)&&this.fromSalary.equals(rhs.fromSalary))))&&((this.bdplCode == rhs.bdplCode)||((this.bdplCode!= null)&&this.bdplCode.equals(rhs.bdplCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.covAmt == rhs.covAmt)||((this.covAmt!= null)&&this.covAmt.equals(rhs.covAmt))));
    }

}
