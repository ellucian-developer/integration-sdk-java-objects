
package com.ellucian.generated.bpapi.ban.system_control_fiscal_years.v1_0_0;

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
    "earliestOpenPeriod",
    "activityDate",
    "eoyAccrStatusInd",
    "endDate",
    "fsyrCode",
    "coasCode",
    "currentPeriod",
    "startDate"
})
@Generated("jsonschema2pojo")
public class SystemControlFiscalYears100GetRequest {

    /**
     * First Open Period
     * <p>
     * 
     * 
     */
    @JsonProperty("earliestOpenPeriod")
    private String earliestOpenPeriod;
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
     * Accrual Period Status
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND")
    private String eoyAccrStatusInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_END_DATE")
    private Date endDate;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_FSYR_CODE")
    private String fsyrCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_COAS_CODE")
    private String coasCode;
    /**
     * Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("currentPeriod")
    private String currentPeriod;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Open Period
     * <p>
     * 
     * 
     */
    @JsonProperty("earliestOpenPeriod")
    public String getEarliestOpenPeriod() {
        return earliestOpenPeriod;
    }

    /**
     * First Open Period
     * <p>
     * 
     * 
     */
    @JsonProperty("earliestOpenPeriod")
    public void setEarliestOpenPeriod(String earliestOpenPeriod) {
        this.earliestOpenPeriod = earliestOpenPeriod;
    }

    public SystemControlFiscalYears100GetRequest withEarliestOpenPeriod(String earliestOpenPeriod) {
        this.earliestOpenPeriod = earliestOpenPeriod;
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

    public SystemControlFiscalYears100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Accrual Period Status
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    public String getEoyAccrStatusInd() {
        return eoyAccrStatusInd;
    }

    /**
     * Accrual Period Status
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    public void setEoyAccrStatusInd(String eoyAccrStatusInd) {
        this.eoyAccrStatusInd = eoyAccrStatusInd;
    }

    public SystemControlFiscalYears100GetRequest withEoyAccrStatusInd(String eoyAccrStatusInd) {
        this.eoyAccrStatusInd = eoyAccrStatusInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SystemControlFiscalYears100GetRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public SystemControlFiscalYears100GetRequest withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public SystemControlFiscalYears100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("currentPeriod")
    public String getCurrentPeriod() {
        return currentPeriod;
    }

    /**
     * Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("currentPeriod")
    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public SystemControlFiscalYears100GetRequest withCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public SystemControlFiscalYears100GetRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public SystemControlFiscalYears100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemControlFiscalYears100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("earliestOpenPeriod");
        sb.append('=');
        sb.append(((this.earliestOpenPeriod == null)?"<null>":this.earliestOpenPeriod));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("eoyAccrStatusInd");
        sb.append('=');
        sb.append(((this.eoyAccrStatusInd == null)?"<null>":this.eoyAccrStatusInd));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("currentPeriod");
        sb.append('=');
        sb.append(((this.currentPeriod == null)?"<null>":this.currentPeriod));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.earliestOpenPeriod == null)? 0 :this.earliestOpenPeriod.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.eoyAccrStatusInd == null)? 0 :this.eoyAccrStatusInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.currentPeriod == null)? 0 :this.currentPeriod.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemControlFiscalYears100GetRequest) == false) {
            return false;
        }
        SystemControlFiscalYears100GetRequest rhs = ((SystemControlFiscalYears100GetRequest) other);
        return ((((((((((this.earliestOpenPeriod == rhs.earliestOpenPeriod)||((this.earliestOpenPeriod!= null)&&this.earliestOpenPeriod.equals(rhs.earliestOpenPeriod)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.eoyAccrStatusInd == rhs.eoyAccrStatusInd)||((this.eoyAccrStatusInd!= null)&&this.eoyAccrStatusInd.equals(rhs.eoyAccrStatusInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.currentPeriod == rhs.currentPeriod)||((this.currentPeriod!= null)&&this.currentPeriod.equals(rhs.currentPeriod))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
