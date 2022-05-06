
package com.ellucian.generated.bpapi.ban.meal_assignment.v1_0_0;

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
    "mrcdCode",
    "arInd",
    "mscdCode",
    "mscdDate",
    "onlOrBat",
    "assessNeeded",
    "workasgEndDate",
    "totalTerms",
    "totalDays",
    "totalMonths",
    "rollInd",
    "workasgBeginDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class MealAssignment100PutResponse {

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc")
    private String mrcdCode;
    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_AR_IND")
    private String arInd;
    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd")
    private String mscdCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MSCD_DATE")
    private Date mscdDate;
    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ONL_OR_BAT")
    private String onlOrBat;
    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ASSESS_NEEDED")
    private String assessNeeded;
    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    private Date workasgEndDate;
    /**
     * Terms
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_TERMS
     * (Required)
     * 
     */
    @JsonProperty("totalTerms")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TOTAL_TERMS")
    private Double totalTerms;
    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TOTAL_DAYS")
    private Double totalDays;
    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TOTAL_MONTHS")
    private Double totalMonths;
    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ROLL_IND")
    private String rollInd;
    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    private Date workasgBeginDate;
    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    public String getMrcdCode() {
        return mrcdCode;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    public void setMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
    }

    public MealAssignment100PutResponse withMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public String getArInd() {
        return arInd;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public void setArInd(String arInd) {
        this.arInd = arInd;
    }

    public MealAssignment100PutResponse withArInd(String arInd) {
        this.arInd = arInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    public String getMscdCode() {
        return mscdCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    public void setMscdCode(String mscdCode) {
        this.mscdCode = mscdCode;
    }

    public MealAssignment100PutResponse withMscdCode(String mscdCode) {
        this.mscdCode = mscdCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    public Date getMscdDate() {
        return mscdDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    public void setMscdDate(Date mscdDate) {
        this.mscdDate = mscdDate;
    }

    public MealAssignment100PutResponse withMscdDate(Date mscdDate) {
        this.mscdDate = mscdDate;
        return this;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    public String getOnlOrBat() {
        return onlOrBat;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    public void setOnlOrBat(String onlOrBat) {
        this.onlOrBat = onlOrBat;
    }

    public MealAssignment100PutResponse withOnlOrBat(String onlOrBat) {
        this.onlOrBat = onlOrBat;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    public String getAssessNeeded() {
        return assessNeeded;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    public void setAssessNeeded(String assessNeeded) {
        this.assessNeeded = assessNeeded;
    }

    public MealAssignment100PutResponse withAssessNeeded(String assessNeeded) {
        this.assessNeeded = assessNeeded;
        return this;
    }

    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    public Date getWorkasgEndDate() {
        return workasgEndDate;
    }

    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    public void setWorkasgEndDate(Date workasgEndDate) {
        this.workasgEndDate = workasgEndDate;
    }

    public MealAssignment100PutResponse withWorkasgEndDate(Date workasgEndDate) {
        this.workasgEndDate = workasgEndDate;
        return this;
    }

    /**
     * Terms
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_TERMS
     * (Required)
     * 
     */
    @JsonProperty("totalTerms")
    public Double getTotalTerms() {
        return totalTerms;
    }

    /**
     * Terms
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_TERMS
     * (Required)
     * 
     */
    @JsonProperty("totalTerms")
    public void setTotalTerms(Double totalTerms) {
        this.totalTerms = totalTerms;
    }

    public MealAssignment100PutResponse withTotalTerms(Double totalTerms) {
        this.totalTerms = totalTerms;
        return this;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    public Double getTotalDays() {
        return totalDays;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    public void setTotalDays(Double totalDays) {
        this.totalDays = totalDays;
    }

    public MealAssignment100PutResponse withTotalDays(Double totalDays) {
        this.totalDays = totalDays;
        return this;
    }

    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    public Double getTotalMonths() {
        return totalMonths;
    }

    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    public void setTotalMonths(Double totalMonths) {
        this.totalMonths = totalMonths;
    }

    public MealAssignment100PutResponse withTotalMonths(Double totalMonths) {
        this.totalMonths = totalMonths;
        return this;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public String getRollInd() {
        return rollInd;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public void setRollInd(String rollInd) {
        this.rollInd = rollInd;
    }

    public MealAssignment100PutResponse withRollInd(String rollInd) {
        this.rollInd = rollInd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    public Date getWorkasgBeginDate() {
        return workasgBeginDate;
    }

    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    public void setWorkasgBeginDate(Date workasgBeginDate) {
        this.workasgBeginDate = workasgBeginDate;
    }

    public MealAssignment100PutResponse withWorkasgBeginDate(Date workasgBeginDate) {
        this.workasgBeginDate = workasgBeginDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public MealAssignment100PutResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public MealAssignment100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealAssignment100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mrcdCode");
        sb.append('=');
        sb.append(((this.mrcdCode == null)?"<null>":this.mrcdCode));
        sb.append(',');
        sb.append("arInd");
        sb.append('=');
        sb.append(((this.arInd == null)?"<null>":this.arInd));
        sb.append(',');
        sb.append("mscdCode");
        sb.append('=');
        sb.append(((this.mscdCode == null)?"<null>":this.mscdCode));
        sb.append(',');
        sb.append("mscdDate");
        sb.append('=');
        sb.append(((this.mscdDate == null)?"<null>":this.mscdDate));
        sb.append(',');
        sb.append("onlOrBat");
        sb.append('=');
        sb.append(((this.onlOrBat == null)?"<null>":this.onlOrBat));
        sb.append(',');
        sb.append("assessNeeded");
        sb.append('=');
        sb.append(((this.assessNeeded == null)?"<null>":this.assessNeeded));
        sb.append(',');
        sb.append("workasgEndDate");
        sb.append('=');
        sb.append(((this.workasgEndDate == null)?"<null>":this.workasgEndDate));
        sb.append(',');
        sb.append("totalTerms");
        sb.append('=');
        sb.append(((this.totalTerms == null)?"<null>":this.totalTerms));
        sb.append(',');
        sb.append("totalDays");
        sb.append('=');
        sb.append(((this.totalDays == null)?"<null>":this.totalDays));
        sb.append(',');
        sb.append("totalMonths");
        sb.append('=');
        sb.append(((this.totalMonths == null)?"<null>":this.totalMonths));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("workasgBeginDate");
        sb.append('=');
        sb.append(((this.workasgBeginDate == null)?"<null>":this.workasgBeginDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.mrcdCode == null)? 0 :this.mrcdCode.hashCode()));
        result = ((result* 31)+((this.arInd == null)? 0 :this.arInd.hashCode()));
        result = ((result* 31)+((this.mscdCode == null)? 0 :this.mscdCode.hashCode()));
        result = ((result* 31)+((this.mscdDate == null)? 0 :this.mscdDate.hashCode()));
        result = ((result* 31)+((this.onlOrBat == null)? 0 :this.onlOrBat.hashCode()));
        result = ((result* 31)+((this.assessNeeded == null)? 0 :this.assessNeeded.hashCode()));
        result = ((result* 31)+((this.workasgEndDate == null)? 0 :this.workasgEndDate.hashCode()));
        result = ((result* 31)+((this.totalTerms == null)? 0 :this.totalTerms.hashCode()));
        result = ((result* 31)+((this.totalDays == null)? 0 :this.totalDays.hashCode()));
        result = ((result* 31)+((this.totalMonths == null)? 0 :this.totalMonths.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.workasgBeginDate == null)? 0 :this.workasgBeginDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealAssignment100PutResponse) == false) {
            return false;
        }
        MealAssignment100PutResponse rhs = ((MealAssignment100PutResponse) other);
        return (((((((((((((((this.mrcdCode == rhs.mrcdCode)||((this.mrcdCode!= null)&&this.mrcdCode.equals(rhs.mrcdCode)))&&((this.arInd == rhs.arInd)||((this.arInd!= null)&&this.arInd.equals(rhs.arInd))))&&((this.mscdCode == rhs.mscdCode)||((this.mscdCode!= null)&&this.mscdCode.equals(rhs.mscdCode))))&&((this.mscdDate == rhs.mscdDate)||((this.mscdDate!= null)&&this.mscdDate.equals(rhs.mscdDate))))&&((this.onlOrBat == rhs.onlOrBat)||((this.onlOrBat!= null)&&this.onlOrBat.equals(rhs.onlOrBat))))&&((this.assessNeeded == rhs.assessNeeded)||((this.assessNeeded!= null)&&this.assessNeeded.equals(rhs.assessNeeded))))&&((this.workasgEndDate == rhs.workasgEndDate)||((this.workasgEndDate!= null)&&this.workasgEndDate.equals(rhs.workasgEndDate))))&&((this.totalTerms == rhs.totalTerms)||((this.totalTerms!= null)&&this.totalTerms.equals(rhs.totalTerms))))&&((this.totalDays == rhs.totalDays)||((this.totalDays!= null)&&this.totalDays.equals(rhs.totalDays))))&&((this.totalMonths == rhs.totalMonths)||((this.totalMonths!= null)&&this.totalMonths.equals(rhs.totalMonths))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.workasgBeginDate == rhs.workasgBeginDate)||((this.workasgBeginDate!= null)&&this.workasgBeginDate.equals(rhs.workasgBeginDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
