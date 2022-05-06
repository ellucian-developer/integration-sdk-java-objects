
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
    "id",
    "posn",
    "suff",
    "queryDate",
    "effectiveDate",
    "earnCode",
    "hrs",
    "deemedHrs",
    "specialRate",
    "shift"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsDefaultEarnings100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("posn")
    private String posn;
    @JsonProperty("suff")
    private String suff;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    private String queryDate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EARN_CODE")
    private String earnCode;
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
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    @JsonPropertyDescription("Lineage reference object : NBREARN_DEEMED_HRS")
    private Double deemedHrs;
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
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("shift")
    @JsonPropertyDescription("Lineage reference object : NBREARN_SHIFT")
    private String shift;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
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
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
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
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public EmployeeJobsDefaultEarnings100QapiPost withEarnCode(String earnCode) {
        this.earnCode = earnCode;
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

    public EmployeeJobsDefaultEarnings100QapiPost withHrs(Double hrs) {
        this.hrs = hrs;
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

    public EmployeeJobsDefaultEarnings100QapiPost withDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
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

    public EmployeeJobsDefaultEarnings100QapiPost withSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
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

    public EmployeeJobsDefaultEarnings100QapiPost withShift(String shift) {
        this.shift = shift;
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

    public EmployeeJobsDefaultEarnings100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsDefaultEarnings100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("deemedHrs");
        sb.append('=');
        sb.append(((this.deemedHrs == null)?"<null>":this.deemedHrs));
        sb.append(',');
        sb.append("specialRate");
        sb.append('=');
        sb.append(((this.specialRate == null)?"<null>":this.specialRate));
        sb.append(',');
        sb.append("shift");
        sb.append('=');
        sb.append(((this.shift == null)?"<null>":this.shift));
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
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.deemedHrs == null)? 0 :this.deemedHrs.hashCode()));
        result = ((result* 31)+((this.specialRate == null)? 0 :this.specialRate.hashCode()));
        result = ((result* 31)+((this.shift == null)? 0 :this.shift.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsDefaultEarnings100QapiPost) == false) {
            return false;
        }
        EmployeeJobsDefaultEarnings100QapiPost rhs = ((EmployeeJobsDefaultEarnings100QapiPost) other);
        return ((((((((((((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate)))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
