
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
    "coas",
    "criteria.fsyrCode",
    "criteria.lastPeriod",
    "criteria.activityDate",
    "criteria.endDate",
    "criteria.coasCode",
    "criteria.eoyAccrStatusInd",
    "criteria.startDate",
    "status"
})
@Generated("jsonschema2pojo")
public class FiscalYearMaintenance100PutRequest {

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coas;
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
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public FiscalYearMaintenance100PutRequest withCoas(String coas) {
        this.coas = coas;
        return this;
    }

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

    public FiscalYearMaintenance100PutRequest withCriteriaFsyrCode(String criteriaFsyrCode) {
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

    public FiscalYearMaintenance100PutRequest withCriteriaLastPeriod(String criteriaLastPeriod) {
        this.criteriaLastPeriod = criteriaLastPeriod;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public FiscalYearMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public FiscalYearMaintenance100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
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

    public FiscalYearMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
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

    public FiscalYearMaintenance100PutRequest withCriteriaEoyAccrStatusInd(String criteriaEoyAccrStatusInd) {
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

    public FiscalYearMaintenance100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public FiscalYearMaintenance100PutRequest withStatus(String status) {
        this.status = status;
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

    public FiscalYearMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYearMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("criteriaFsyrCode");
        sb.append('=');
        sb.append(((this.criteriaFsyrCode == null)?"<null>":this.criteriaFsyrCode));
        sb.append(',');
        sb.append("criteriaLastPeriod");
        sb.append('=');
        sb.append(((this.criteriaLastPeriod == null)?"<null>":this.criteriaLastPeriod));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaEoyAccrStatusInd == null)? 0 :this.criteriaEoyAccrStatusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFsyrCode == null)? 0 :this.criteriaFsyrCode.hashCode()));
        result = ((result* 31)+((this.criteriaLastPeriod == null)? 0 :this.criteriaLastPeriod.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiscalYearMaintenance100PutRequest) == false) {
            return false;
        }
        FiscalYearMaintenance100PutRequest rhs = ((FiscalYearMaintenance100PutRequest) other);
        return (((((((((((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaEoyAccrStatusInd == rhs.criteriaEoyAccrStatusInd)||((this.criteriaEoyAccrStatusInd!= null)&&this.criteriaEoyAccrStatusInd.equals(rhs.criteriaEoyAccrStatusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFsyrCode == rhs.criteriaFsyrCode)||((this.criteriaFsyrCode!= null)&&this.criteriaFsyrCode.equals(rhs.criteriaFsyrCode))))&&((this.criteriaLastPeriod == rhs.criteriaLastPeriod)||((this.criteriaLastPeriod!= null)&&this.criteriaLastPeriod.equals(rhs.criteriaLastPeriod))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
