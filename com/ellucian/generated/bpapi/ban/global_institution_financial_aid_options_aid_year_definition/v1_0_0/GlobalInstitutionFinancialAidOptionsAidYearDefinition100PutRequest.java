
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_aid_year_definition.v1_0_0;

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
    "aidyDesc",
    "keyblckAidyCode",
    "retentionExpiredInd",
    "aidyEndYear",
    "statusInd",
    "pivotDate",
    "aidyEndDate",
    "periodEnabled",
    "aidyStartYear",
    "aidyStartDate"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest {

    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_DESC")
    private String aidyDesc;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_RETENTION_EXPIRED_IND")
    private String retentionExpiredInd;
    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_END_YEAR")
    private Double aidyEndYear;
    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_STATUS_IND")
    private String statusInd;
    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PIVOT_DATE")
    private Date pivotDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_END_DATE")
    private Date aidyEndDate;
    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PERIOD_ENABLED")
    private String periodEnabled;
    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_START_YEAR")
    private Double aidyStartYear;
    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_START_DATE")
    private Date aidyStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    public String getAidyDesc() {
        return aidyDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    public void setAidyDesc(String aidyDesc) {
        this.aidyDesc = aidyDesc;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAidyDesc(String aidyDesc) {
        this.aidyDesc = aidyDesc;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    public String getRetentionExpiredInd() {
        return retentionExpiredInd;
    }

    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    public void setRetentionExpiredInd(String retentionExpiredInd) {
        this.retentionExpiredInd = retentionExpiredInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withRetentionExpiredInd(String retentionExpiredInd) {
        this.retentionExpiredInd = retentionExpiredInd;
        return this;
    }

    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    public Double getAidyEndYear() {
        return aidyEndYear;
    }

    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    public void setAidyEndYear(Double aidyEndYear) {
        this.aidyEndYear = aidyEndYear;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAidyEndYear(Double aidyEndYear) {
        this.aidyEndYear = aidyEndYear;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    public Date getPivotDate() {
        return pivotDate;
    }

    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    public void setPivotDate(Date pivotDate) {
        this.pivotDate = pivotDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withPivotDate(Date pivotDate) {
        this.pivotDate = pivotDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    public Date getAidyEndDate() {
        return aidyEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    public void setAidyEndDate(Date aidyEndDate) {
        this.aidyEndDate = aidyEndDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAidyEndDate(Date aidyEndDate) {
        this.aidyEndDate = aidyEndDate;
        return this;
    }

    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    public String getPeriodEnabled() {
        return periodEnabled;
    }

    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    public void setPeriodEnabled(String periodEnabled) {
        this.periodEnabled = periodEnabled;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withPeriodEnabled(String periodEnabled) {
        this.periodEnabled = periodEnabled;
        return this;
    }

    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    public Double getAidyStartYear() {
        return aidyStartYear;
    }

    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    public void setAidyStartYear(Double aidyStartYear) {
        this.aidyStartYear = aidyStartYear;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAidyStartYear(Double aidyStartYear) {
        this.aidyStartYear = aidyStartYear;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    public Date getAidyStartDate() {
        return aidyStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    public void setAidyStartDate(Date aidyStartDate) {
        this.aidyStartDate = aidyStartDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAidyStartDate(Date aidyStartDate) {
        this.aidyStartDate = aidyStartDate;
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

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aidyDesc");
        sb.append('=');
        sb.append(((this.aidyDesc == null)?"<null>":this.aidyDesc));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("retentionExpiredInd");
        sb.append('=');
        sb.append(((this.retentionExpiredInd == null)?"<null>":this.retentionExpiredInd));
        sb.append(',');
        sb.append("aidyEndYear");
        sb.append('=');
        sb.append(((this.aidyEndYear == null)?"<null>":this.aidyEndYear));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("pivotDate");
        sb.append('=');
        sb.append(((this.pivotDate == null)?"<null>":this.pivotDate));
        sb.append(',');
        sb.append("aidyEndDate");
        sb.append('=');
        sb.append(((this.aidyEndDate == null)?"<null>":this.aidyEndDate));
        sb.append(',');
        sb.append("periodEnabled");
        sb.append('=');
        sb.append(((this.periodEnabled == null)?"<null>":this.periodEnabled));
        sb.append(',');
        sb.append("aidyStartYear");
        sb.append('=');
        sb.append(((this.aidyStartYear == null)?"<null>":this.aidyStartYear));
        sb.append(',');
        sb.append("aidyStartDate");
        sb.append('=');
        sb.append(((this.aidyStartDate == null)?"<null>":this.aidyStartDate));
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
        result = ((result* 31)+((this.aidyDesc == null)? 0 :this.aidyDesc.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.retentionExpiredInd == null)? 0 :this.retentionExpiredInd.hashCode()));
        result = ((result* 31)+((this.aidyEndYear == null)? 0 :this.aidyEndYear.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.pivotDate == null)? 0 :this.pivotDate.hashCode()));
        result = ((result* 31)+((this.aidyEndDate == null)? 0 :this.aidyEndDate.hashCode()));
        result = ((result* 31)+((this.periodEnabled == null)? 0 :this.periodEnabled.hashCode()));
        result = ((result* 31)+((this.aidyStartYear == null)? 0 :this.aidyStartYear.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.aidyStartDate == null)? 0 :this.aidyStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest rhs = ((GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutRequest) other);
        return ((((((((((((this.aidyDesc == rhs.aidyDesc)||((this.aidyDesc!= null)&&this.aidyDesc.equals(rhs.aidyDesc)))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.retentionExpiredInd == rhs.retentionExpiredInd)||((this.retentionExpiredInd!= null)&&this.retentionExpiredInd.equals(rhs.retentionExpiredInd))))&&((this.aidyEndYear == rhs.aidyEndYear)||((this.aidyEndYear!= null)&&this.aidyEndYear.equals(rhs.aidyEndYear))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.pivotDate == rhs.pivotDate)||((this.pivotDate!= null)&&this.pivotDate.equals(rhs.pivotDate))))&&((this.aidyEndDate == rhs.aidyEndDate)||((this.aidyEndDate!= null)&&this.aidyEndDate.equals(rhs.aidyEndDate))))&&((this.periodEnabled == rhs.periodEnabled)||((this.periodEnabled!= null)&&this.periodEnabled.equals(rhs.periodEnabled))))&&((this.aidyStartYear == rhs.aidyStartYear)||((this.aidyStartYear!= null)&&this.aidyStartYear.equals(rhs.aidyStartYear))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.aidyStartDate == rhs.aidyStartDate)||((this.aidyStartDate!= null)&&this.aidyStartDate.equals(rhs.aidyStartDate))));
    }

}
