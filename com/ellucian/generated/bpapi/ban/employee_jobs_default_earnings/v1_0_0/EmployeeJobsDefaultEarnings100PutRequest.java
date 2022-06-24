
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
    "deemedHrs",
    "criteria.specialRate",
    "specialRate",
    "hrs",
    "posn",
    "criteria.earnDesc",
    "queryDate",
    "criteria.earnCode",
    "criteria.cancelDate",
    "suff",
    "criteria.deemedHrs",
    "criteria.hrs",
    "criteria.shift",
    "id",
    "criteria.effectiveDate"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsDefaultEarnings100PutRequest {

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("cancelDate")
    private Date cancelDate;
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
    @JsonProperty("criteria.specialRate")
    @JsonPropertyDescription("Lineage reference object : NBREARN_SPECIAL_RATE")
    private Double criteriaSpecialRate;
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
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    @JsonProperty("criteria.earnDesc")
    private String criteriaEarnDesc;
    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Date queryDate;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EARN_CODE")
    private String criteriaEarnCode;
    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cancelDate")
    private Date criteriaCancelDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private String suff;
    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    @JsonPropertyDescription("Lineage reference object : NBREARN_DEEMED_HRS")
    private Double criteriaDeemedHrs;
    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("criteria.hrs")
    @JsonPropertyDescription("Lineage reference object : NBREARN_HRS")
    private Double criteriaHrs;
    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("criteria.shift")
    @JsonPropertyDescription("Lineage reference object : NBREARN_SHIFT")
    private String criteriaShift;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBREARN_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
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

    public EmployeeJobsDefaultEarnings100PutRequest withCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
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

    public EmployeeJobsDefaultEarnings100PutRequest withDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
        return this;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : NBREARN_SPECIAL_RATE
     * 
     */
    @JsonProperty("criteria.specialRate")
    public Double getCriteriaSpecialRate() {
        return criteriaSpecialRate;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : NBREARN_SPECIAL_RATE
     * 
     */
    @JsonProperty("criteria.specialRate")
    public void setCriteriaSpecialRate(Double criteriaSpecialRate) {
        this.criteriaSpecialRate = criteriaSpecialRate;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaSpecialRate(Double criteriaSpecialRate) {
        this.criteriaSpecialRate = criteriaSpecialRate;
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

    public EmployeeJobsDefaultEarnings100PutRequest withSpecialRate(Double specialRate) {
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

    public EmployeeJobsDefaultEarnings100PutRequest withHrs(Double hrs) {
        this.hrs = hrs;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("criteria.earnDesc")
    public String getCriteriaEarnDesc() {
        return criteriaEarnDesc;
    }

    @JsonProperty("criteria.earnDesc")
    public void setCriteriaEarnDesc(String criteriaEarnDesc) {
        this.criteriaEarnDesc = criteriaEarnDesc;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaEarnDesc(String criteriaEarnDesc) {
        this.criteriaEarnDesc = criteriaEarnDesc;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Date getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withQueryDate(Date queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    public String getCriteriaEarnCode() {
        return criteriaEarnCode;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : NBREARN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    public void setCriteriaEarnCode(String criteriaEarnCode) {
        this.criteriaEarnCode = criteriaEarnCode;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaEarnCode(String criteriaEarnCode) {
        this.criteriaEarnCode = criteriaEarnCode;
        return this;
    }

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cancelDate")
    public Date getCriteriaCancelDate() {
        return criteriaCancelDate;
    }

    /**
     * Ended as of Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cancelDate")
    public void setCriteriaCancelDate(Date criteriaCancelDate) {
        this.criteriaCancelDate = criteriaCancelDate;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaCancelDate(Date criteriaCancelDate) {
        this.criteriaCancelDate = criteriaCancelDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    public Double getCriteriaDeemedHrs() {
        return criteriaDeemedHrs;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : NBREARN_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    public void setCriteriaDeemedHrs(Double criteriaDeemedHrs) {
        this.criteriaDeemedHrs = criteriaDeemedHrs;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaDeemedHrs(Double criteriaDeemedHrs) {
        this.criteriaDeemedHrs = criteriaDeemedHrs;
        return this;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("criteria.hrs")
    public Double getCriteriaHrs() {
        return criteriaHrs;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : NBREARN_HRS
     * 
     */
    @JsonProperty("criteria.hrs")
    public void setCriteriaHrs(Double criteriaHrs) {
        this.criteriaHrs = criteriaHrs;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaHrs(Double criteriaHrs) {
        this.criteriaHrs = criteriaHrs;
        return this;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("criteria.shift")
    public String getCriteriaShift() {
        return criteriaShift;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : NBREARN_SHIFT
     * 
     */
    @JsonProperty("criteria.shift")
    public void setCriteriaShift(String criteriaShift) {
        this.criteriaShift = criteriaShift;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaShift(String criteriaShift) {
        this.criteriaShift = criteriaShift;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBREARN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public EmployeeJobsDefaultEarnings100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
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

    public EmployeeJobsDefaultEarnings100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsDefaultEarnings100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cancelDate");
        sb.append('=');
        sb.append(((this.cancelDate == null)?"<null>":this.cancelDate));
        sb.append(',');
        sb.append("deemedHrs");
        sb.append('=');
        sb.append(((this.deemedHrs == null)?"<null>":this.deemedHrs));
        sb.append(',');
        sb.append("criteriaSpecialRate");
        sb.append('=');
        sb.append(((this.criteriaSpecialRate == null)?"<null>":this.criteriaSpecialRate));
        sb.append(',');
        sb.append("specialRate");
        sb.append('=');
        sb.append(((this.specialRate == null)?"<null>":this.specialRate));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaEarnDesc");
        sb.append('=');
        sb.append(((this.criteriaEarnDesc == null)?"<null>":this.criteriaEarnDesc));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("criteriaEarnCode");
        sb.append('=');
        sb.append(((this.criteriaEarnCode == null)?"<null>":this.criteriaEarnCode));
        sb.append(',');
        sb.append("criteriaCancelDate");
        sb.append('=');
        sb.append(((this.criteriaCancelDate == null)?"<null>":this.criteriaCancelDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("criteriaDeemedHrs");
        sb.append('=');
        sb.append(((this.criteriaDeemedHrs == null)?"<null>":this.criteriaDeemedHrs));
        sb.append(',');
        sb.append("criteriaHrs");
        sb.append('=');
        sb.append(((this.criteriaHrs == null)?"<null>":this.criteriaHrs));
        sb.append(',');
        sb.append("criteriaShift");
        sb.append('=');
        sb.append(((this.criteriaShift == null)?"<null>":this.criteriaShift));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
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
        result = ((result* 31)+((this.deemedHrs == null)? 0 :this.deemedHrs.hashCode()));
        result = ((result* 31)+((this.specialRate == null)? 0 :this.specialRate.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.criteriaDeemedHrs == null)? 0 :this.criteriaDeemedHrs.hashCode()));
        result = ((result* 31)+((this.criteriaCancelDate == null)? 0 :this.criteriaCancelDate.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaEarnCode == null)? 0 :this.criteriaEarnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpecialRate == null)? 0 :this.criteriaSpecialRate.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaHrs == null)? 0 :this.criteriaHrs.hashCode()));
        result = ((result* 31)+((this.criteriaShift == null)? 0 :this.criteriaShift.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaEarnDesc == null)? 0 :this.criteriaEarnDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsDefaultEarnings100PutRequest) == false) {
            return false;
        }
        EmployeeJobsDefaultEarnings100PutRequest rhs = ((EmployeeJobsDefaultEarnings100PutRequest) other);
        return ((((((((((((((((((this.cancelDate == rhs.cancelDate)||((this.cancelDate!= null)&&this.cancelDate.equals(rhs.cancelDate)))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.criteriaDeemedHrs == rhs.criteriaDeemedHrs)||((this.criteriaDeemedHrs!= null)&&this.criteriaDeemedHrs.equals(rhs.criteriaDeemedHrs))))&&((this.criteriaCancelDate == rhs.criteriaCancelDate)||((this.criteriaCancelDate!= null)&&this.criteriaCancelDate.equals(rhs.criteriaCancelDate))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaEarnCode == rhs.criteriaEarnCode)||((this.criteriaEarnCode!= null)&&this.criteriaEarnCode.equals(rhs.criteriaEarnCode))))&&((this.criteriaSpecialRate == rhs.criteriaSpecialRate)||((this.criteriaSpecialRate!= null)&&this.criteriaSpecialRate.equals(rhs.criteriaSpecialRate))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaHrs == rhs.criteriaHrs)||((this.criteriaHrs!= null)&&this.criteriaHrs.equals(rhs.criteriaHrs))))&&((this.criteriaShift == rhs.criteriaShift)||((this.criteriaShift!= null)&&this.criteriaShift.equals(rhs.criteriaShift))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEarnDesc == rhs.criteriaEarnDesc)||((this.criteriaEarnDesc!= null)&&this.criteriaEarnDesc.equals(rhs.criteriaEarnDesc))));
    }

}
