
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
    "queryDate",
    "suff",
    "deemedHrs",
    "specialRate",
    "shift",
    "hrs",
    "id",
    "earnCode",
    "posn",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsDefaultEarnings100GetRequest {

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Object queryDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private Object suff;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
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
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Object getQueryDate() {
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
    public void setQueryDate(Object queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsDefaultEarnings100GetRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public Object getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public void setSuff(Object suff) {
        this.suff = suff;
    }

    public EmployeeJobsDefaultEarnings100GetRequest withSuff(Object suff) {
        this.suff = suff;
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

    public EmployeeJobsDefaultEarnings100GetRequest withDeemedHrs(Double deemedHrs) {
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

    public EmployeeJobsDefaultEarnings100GetRequest withSpecialRate(Double specialRate) {
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

    public EmployeeJobsDefaultEarnings100GetRequest withShift(String shift) {
        this.shift = shift;
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

    public EmployeeJobsDefaultEarnings100GetRequest withHrs(Double hrs) {
        this.hrs = hrs;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EmployeeJobsDefaultEarnings100GetRequest withId(Object id) {
        this.id = id;
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

    public EmployeeJobsDefaultEarnings100GetRequest withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public EmployeeJobsDefaultEarnings100GetRequest withPosn(Object posn) {
        this.posn = posn;
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

    public EmployeeJobsDefaultEarnings100GetRequest withEffectiveDate(Date effectiveDate) {
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

    public EmployeeJobsDefaultEarnings100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsDefaultEarnings100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
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
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        if ((other instanceof EmployeeJobsDefaultEarnings100GetRequest) == false) {
            return false;
        }
        EmployeeJobsDefaultEarnings100GetRequest rhs = ((EmployeeJobsDefaultEarnings100GetRequest) other);
        return ((((((((((((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate)))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
