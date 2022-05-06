
package com.ellucian.generated.bpapi.ban.fiscal_year_maintenance.v1_0_0;

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
    "criteria.fsyrCode",
    "criteria.lastPeriod",
    "activityDate",
    "criteria.endDate",
    "criteria.coasCode",
    "criteria.eoyAccrStatusInd",
    "criteria.startDate"
})
@Generated("jsonschema2pojo")
public class FiscalYearMaintenance100GetRequest {

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("criteria.fsyrCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String criteriaFsyrCode;
    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_LAST_PERIOD")
    private String criteriaLastPeriod;
    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_END_DATE")
    private Date criteriaEndDate;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eoyAccrStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND")
    private String criteriaEoyAccrStatusInd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_START_DATE")
    private Date criteriaStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("criteria.fsyrCode")
    public String getCriteriaFsyrCode() {
        return criteriaFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("criteria.fsyrCode")
    public void setCriteriaFsyrCode(String criteriaFsyrCode) {
        this.criteriaFsyrCode = criteriaFsyrCode;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaFsyrCode(String criteriaFsyrCode) {
        this.criteriaFsyrCode = criteriaFsyrCode;
        return this;
    }

    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastPeriod")
    public String getCriteriaLastPeriod() {
        return criteriaLastPeriod;
    }

    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastPeriod")
    public void setCriteriaLastPeriod(String criteriaLastPeriod) {
        this.criteriaLastPeriod = criteriaLastPeriod;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaLastPeriod(String criteriaLastPeriod) {
        this.criteriaLastPeriod = criteriaLastPeriod;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FiscalYearMaintenance100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eoyAccrStatusInd")
    public String getCriteriaEoyAccrStatusInd() {
        return criteriaEoyAccrStatusInd;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eoyAccrStatusInd")
    public void setCriteriaEoyAccrStatusInd(String criteriaEoyAccrStatusInd) {
        this.criteriaEoyAccrStatusInd = criteriaEoyAccrStatusInd;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaEoyAccrStatusInd(String criteriaEoyAccrStatusInd) {
        this.criteriaEoyAccrStatusInd = criteriaEoyAccrStatusInd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public FiscalYearMaintenance100GetRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
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

    public FiscalYearMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYearMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFsyrCode");
        sb.append('=');
        sb.append(((this.criteriaFsyrCode == null)?"<null>":this.criteriaFsyrCode));
        sb.append(',');
        sb.append("criteriaLastPeriod");
        sb.append('=');
        sb.append(((this.criteriaLastPeriod == null)?"<null>":this.criteriaLastPeriod));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaEoyAccrStatusInd");
        sb.append('=');
        sb.append(((this.criteriaEoyAccrStatusInd == null)?"<null>":this.criteriaEoyAccrStatusInd));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaEoyAccrStatusInd == null)? 0 :this.criteriaEoyAccrStatusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFsyrCode == null)? 0 :this.criteriaFsyrCode.hashCode()));
        result = ((result* 31)+((this.criteriaLastPeriod == null)? 0 :this.criteriaLastPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiscalYearMaintenance100GetRequest) == false) {
            return false;
        }
        FiscalYearMaintenance100GetRequest rhs = ((FiscalYearMaintenance100GetRequest) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaEoyAccrStatusInd == rhs.criteriaEoyAccrStatusInd)||((this.criteriaEoyAccrStatusInd!= null)&&this.criteriaEoyAccrStatusInd.equals(rhs.criteriaEoyAccrStatusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFsyrCode == rhs.criteriaFsyrCode)||((this.criteriaFsyrCode!= null)&&this.criteriaFsyrCode.equals(rhs.criteriaFsyrCode))))&&((this.criteriaLastPeriod == rhs.criteriaLastPeriod)||((this.criteriaLastPeriod!= null)&&this.criteriaLastPeriod.equals(rhs.criteriaLastPeriod))));
    }

}
