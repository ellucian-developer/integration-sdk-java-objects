
package com.ellucian.generated.bpapi.ban.fiscal_year_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "criteria.coasCode",
    "criteria.endDate",
    "criteria.fsyrCode",
    "criteria.lastPeriod",
    "criteria.startDate",
    "criteria.eoyAccrStatusInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class FiscalYearMaintenance100QapiPost {

    @JsonProperty("criteria.coasCode")
    private String criteriaCoasCode;
    @JsonProperty("criteria.endDate")
    private String criteriaEndDate;
    @JsonProperty("criteria.fsyrCode")
    private String criteriaFsyrCode;
    @JsonProperty("criteria.lastPeriod")
    private String criteriaLastPeriod;
    @JsonProperty("criteria.startDate")
    private String criteriaStartDate;
    @JsonProperty("criteria.eoyAccrStatusInd")
    private String criteriaEoyAccrStatusInd;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    @JsonProperty("criteria.endDate")
    public String getCriteriaEndDate() {
        return criteriaEndDate;
    }

    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(String criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaEndDate(String criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    @JsonProperty("criteria.fsyrCode")
    public String getCriteriaFsyrCode() {
        return criteriaFsyrCode;
    }

    @JsonProperty("criteria.fsyrCode")
    public void setCriteriaFsyrCode(String criteriaFsyrCode) {
        this.criteriaFsyrCode = criteriaFsyrCode;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaFsyrCode(String criteriaFsyrCode) {
        this.criteriaFsyrCode = criteriaFsyrCode;
        return this;
    }

    @JsonProperty("criteria.lastPeriod")
    public String getCriteriaLastPeriod() {
        return criteriaLastPeriod;
    }

    @JsonProperty("criteria.lastPeriod")
    public void setCriteriaLastPeriod(String criteriaLastPeriod) {
        this.criteriaLastPeriod = criteriaLastPeriod;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaLastPeriod(String criteriaLastPeriod) {
        this.criteriaLastPeriod = criteriaLastPeriod;
        return this;
    }

    @JsonProperty("criteria.startDate")
    public String getCriteriaStartDate() {
        return criteriaStartDate;
    }

    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(String criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaStartDate(String criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    @JsonProperty("criteria.eoyAccrStatusInd")
    public String getCriteriaEoyAccrStatusInd() {
        return criteriaEoyAccrStatusInd;
    }

    @JsonProperty("criteria.eoyAccrStatusInd")
    public void setCriteriaEoyAccrStatusInd(String criteriaEoyAccrStatusInd) {
        this.criteriaEoyAccrStatusInd = criteriaEoyAccrStatusInd;
    }

    public FiscalYearMaintenance100QapiPost withCriteriaEoyAccrStatusInd(String criteriaEoyAccrStatusInd) {
        this.criteriaEoyAccrStatusInd = criteriaEoyAccrStatusInd;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public FiscalYearMaintenance100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public FiscalYearMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYearMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaFsyrCode");
        sb.append('=');
        sb.append(((this.criteriaFsyrCode == null)?"<null>":this.criteriaFsyrCode));
        sb.append(',');
        sb.append("criteriaLastPeriod");
        sb.append('=');
        sb.append(((this.criteriaLastPeriod == null)?"<null>":this.criteriaLastPeriod));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("criteriaEoyAccrStatusInd");
        sb.append('=');
        sb.append(((this.criteriaEoyAccrStatusInd == null)?"<null>":this.criteriaEoyAccrStatusInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
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
        if ((other instanceof FiscalYearMaintenance100QapiPost) == false) {
            return false;
        }
        FiscalYearMaintenance100QapiPost rhs = ((FiscalYearMaintenance100QapiPost) other);
        return (((((((((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaEoyAccrStatusInd == rhs.criteriaEoyAccrStatusInd)||((this.criteriaEoyAccrStatusInd!= null)&&this.criteriaEoyAccrStatusInd.equals(rhs.criteriaEoyAccrStatusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFsyrCode == rhs.criteriaFsyrCode)||((this.criteriaFsyrCode!= null)&&this.criteriaFsyrCode.equals(rhs.criteriaFsyrCode))))&&((this.criteriaLastPeriod == rhs.criteriaLastPeriod)||((this.criteriaLastPeriod!= null)&&this.criteriaLastPeriod.equals(rhs.criteriaLastPeriod))));
    }

}
