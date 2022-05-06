
package com.ellucian.generated.bpapi.ban.benefit_payroll_frequency_rule.v1_0_0;

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
    "activityDate",
    "bdcaCode",
    "month",
    "numberOfPays"
})
@Generated("jsonschema2pojo")
public class BenefitPayrollFrequencyRule100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDFQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBDFQ_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRBDFQ_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDFQ_BDCA_CODE")
    private String bdcaCode;
    /**
     * Month
     * <p>
     * Lineage reference object : PTRBDFQ_MONTH
     * (Required)
     * 
     */
    @JsonProperty("month")
    @JsonPropertyDescription("Lineage reference object : PTRBDFQ_MONTH")
    private Double month;
    /**
     * Frequency
     * <p>
     * Lineage reference object : PTRBDFQ_NUMBER_OF_PAYS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPays")
    @JsonPropertyDescription("Lineage reference object : PTRBDFQ_NUMBER_OF_PAYS")
    private Double numberOfPays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDFQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDFQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BenefitPayrollFrequencyRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRBDFQ_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRBDFQ_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public BenefitPayrollFrequencyRule100GetRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Month
     * <p>
     * Lineage reference object : PTRBDFQ_MONTH
     * (Required)
     * 
     */
    @JsonProperty("month")
    public Double getMonth() {
        return month;
    }

    /**
     * Month
     * <p>
     * Lineage reference object : PTRBDFQ_MONTH
     * (Required)
     * 
     */
    @JsonProperty("month")
    public void setMonth(Double month) {
        this.month = month;
    }

    public BenefitPayrollFrequencyRule100GetRequest withMonth(Double month) {
        this.month = month;
        return this;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : PTRBDFQ_NUMBER_OF_PAYS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPays")
    public Double getNumberOfPays() {
        return numberOfPays;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : PTRBDFQ_NUMBER_OF_PAYS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPays")
    public void setNumberOfPays(Double numberOfPays) {
        this.numberOfPays = numberOfPays;
    }

    public BenefitPayrollFrequencyRule100GetRequest withNumberOfPays(Double numberOfPays) {
        this.numberOfPays = numberOfPays;
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

    public BenefitPayrollFrequencyRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitPayrollFrequencyRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("month");
        sb.append('=');
        sb.append(((this.month == null)?"<null>":this.month));
        sb.append(',');
        sb.append("numberOfPays");
        sb.append('=');
        sb.append(((this.numberOfPays == null)?"<null>":this.numberOfPays));
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
        result = ((result* 31)+((this.numberOfPays == null)? 0 :this.numberOfPays.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.month == null)? 0 :this.month.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitPayrollFrequencyRule100GetRequest) == false) {
            return false;
        }
        BenefitPayrollFrequencyRule100GetRequest rhs = ((BenefitPayrollFrequencyRule100GetRequest) other);
        return ((((((this.numberOfPays == rhs.numberOfPays)||((this.numberOfPays!= null)&&this.numberOfPays.equals(rhs.numberOfPays)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.month == rhs.month)||((this.month!= null)&&this.month.equals(rhs.month))));
    }

}
