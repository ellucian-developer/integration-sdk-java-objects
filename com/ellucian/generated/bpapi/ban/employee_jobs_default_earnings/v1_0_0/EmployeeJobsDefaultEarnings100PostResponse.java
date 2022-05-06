
package com.ellucian.generated.bpapi.ban.employee_jobs_default_earnings.v1_0_0;

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
    "cancelDate",
    "earnDesc",
    "deemedHrs",
    "shift",
    "specialRate",
    "hrs",
    "earnCode",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsDefaultEarnings100PostResponse {

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("cancelDate")
    private Date cancelDate;
    @JsonProperty("earnDesc")
    private String earnDesc;
    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    @JsonPropertyDescription("Lineage reference object : NBREARN_DEEMED_HRS")
    private Double deemedHrs;
    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("shift")
    @JsonPropertyDescription("Lineage reference object : NBREARN_SHIFT")
    private String shift;
    /**
     * Special Rate
     * <p>
     * Lineage reference object : NBREARN_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    @JsonPropertyDescription("Lineage reference object : NBREARN_SPECIAL_RATE")
    private Double specialRate;
    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("hrs")
    @JsonPropertyDescription("Lineage reference object : NBREARN_HRS")
    private Double hrs;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EARN_CODE")
    private String earnCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("cancelDate")
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("cancelDate")
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
        return this;
    }

    @JsonProperty("earnDesc")
    public String getEarnDesc() {
        return earnDesc;
    }

    @JsonProperty("earnDesc")
    public void setEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
        return this;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    public Double getDeemedHrs() {
        return deemedHrs;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    public void setDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
        return this;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("shift")
    public String getShift() {
        return shift;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("shift")
    public void setShift(String shift) {
        this.shift = shift;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : NBREARN_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    public Double getSpecialRate() {
        return specialRate;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : NBREARN_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    public void setSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
        return this;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("hrs")
    public Double getHrs() {
        return hrs;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("hrs")
    public void setHrs(Double hrs) {
        this.hrs = hrs;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withHrs(Double hrs) {
        this.hrs = hrs;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public String getEarnCode() {
        return earnCode;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public EmployeeJobsDefaultEarnings100PostResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public EmployeeJobsDefaultEarnings100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsDefaultEarnings100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cancelDate");
        sb.append('=');
        sb.append(((this.cancelDate == null)?"<null>":this.cancelDate));
        sb.append(',');
        sb.append("earnDesc");
        sb.append('=');
        sb.append(((this.earnDesc == null)?"<null>":this.earnDesc));
        sb.append(',');
        sb.append("deemedHrs");
        sb.append('=');
        sb.append(((this.deemedHrs == null)?"<null>":this.deemedHrs));
        sb.append(',');
        sb.append("shift");
        sb.append('=');
        sb.append(((this.shift == null)?"<null>":this.shift));
        sb.append(',');
        sb.append("specialRate");
        sb.append('=');
        sb.append(((this.specialRate == null)?"<null>":this.specialRate));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.cancelDate == null)? 0 :this.cancelDate.hashCode()));
        result = ((result* 31)+((this.earnDesc == null)? 0 :this.earnDesc.hashCode()));
        result = ((result* 31)+((this.deemedHrs == null)? 0 :this.deemedHrs.hashCode()));
        result = ((result* 31)+((this.shift == null)? 0 :this.shift.hashCode()));
        result = ((result* 31)+((this.specialRate == null)? 0 :this.specialRate.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsDefaultEarnings100PostResponse) == false) {
            return false;
        }
        EmployeeJobsDefaultEarnings100PostResponse rhs = ((EmployeeJobsDefaultEarnings100PostResponse) other);
        return ((((((((((this.cancelDate == rhs.cancelDate)||((this.cancelDate!= null)&&this.cancelDate.equals(rhs.cancelDate)))&&((this.earnDesc == rhs.earnDesc)||((this.earnDesc!= null)&&this.earnDesc.equals(rhs.earnDesc))))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
