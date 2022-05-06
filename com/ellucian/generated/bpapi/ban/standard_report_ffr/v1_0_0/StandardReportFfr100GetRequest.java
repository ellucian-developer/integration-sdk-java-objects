
package com.ellucian.generated.bpapi.ban.standard_report_ffr.v1_0_0;

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
    "periodFromDate",
    "periodToDate",
    "displayGrantCode",
    "repType",
    "displayPmsCode",
    "finalInd",
    "dateSubmitted"
})
@Generated("jsonschema2pojo")
public class StandardReportFfr100GetRequest {

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PERIOD_FROM_DATE")
    private Date periodFromDate;
    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PERIOD_TO_DATE")
    private Date periodToDate;
    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    @JsonPropertyDescription("Lineage reference object : displayGrantCode")
    private Object displayGrantCode;
    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_REP_TYPE")
    private String repType;
    /**
     * PMS
     * <p>
     * Lineage reference object : displayPmsCode
     * 
     */
    @JsonProperty("displayPmsCode")
    @JsonPropertyDescription("Lineage reference object : displayPmsCode")
    private Object displayPmsCode;
    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_FINAL_IND")
    private String finalInd;
    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_DATE_SUBMITTED")
    private Date dateSubmitted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public Date getPeriodFromDate() {
        return periodFromDate;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public void setPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
    }

    public StandardReportFfr100GetRequest withPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
        return this;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public Date getPeriodToDate() {
        return periodToDate;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public void setPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
    }

    public StandardReportFfr100GetRequest withPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    public Object getDisplayGrantCode() {
        return displayGrantCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    public void setDisplayGrantCode(Object displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
    }

    public StandardReportFfr100GetRequest withDisplayGrantCode(Object displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
        return this;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    public String getRepType() {
        return repType;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    public void setRepType(String repType) {
        this.repType = repType;
    }

    public StandardReportFfr100GetRequest withRepType(String repType) {
        this.repType = repType;
        return this;
    }

    /**
     * PMS
     * <p>
     * Lineage reference object : displayPmsCode
     * 
     */
    @JsonProperty("displayPmsCode")
    public Object getDisplayPmsCode() {
        return displayPmsCode;
    }

    /**
     * PMS
     * <p>
     * Lineage reference object : displayPmsCode
     * 
     */
    @JsonProperty("displayPmsCode")
    public void setDisplayPmsCode(Object displayPmsCode) {
        this.displayPmsCode = displayPmsCode;
    }

    public StandardReportFfr100GetRequest withDisplayPmsCode(Object displayPmsCode) {
        this.displayPmsCode = displayPmsCode;
        return this;
    }

    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public StandardReportFfr100GetRequest withFinalInd(String finalInd) {
        this.finalInd = finalInd;
        return this;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public StandardReportFfr100GetRequest withDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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

    public StandardReportFfr100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardReportFfr100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("periodFromDate");
        sb.append('=');
        sb.append(((this.periodFromDate == null)?"<null>":this.periodFromDate));
        sb.append(',');
        sb.append("periodToDate");
        sb.append('=');
        sb.append(((this.periodToDate == null)?"<null>":this.periodToDate));
        sb.append(',');
        sb.append("displayGrantCode");
        sb.append('=');
        sb.append(((this.displayGrantCode == null)?"<null>":this.displayGrantCode));
        sb.append(',');
        sb.append("repType");
        sb.append('=');
        sb.append(((this.repType == null)?"<null>":this.repType));
        sb.append(',');
        sb.append("displayPmsCode");
        sb.append('=');
        sb.append(((this.displayPmsCode == null)?"<null>":this.displayPmsCode));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("dateSubmitted");
        sb.append('=');
        sb.append(((this.dateSubmitted == null)?"<null>":this.dateSubmitted));
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
        result = ((result* 31)+((this.periodFromDate == null)? 0 :this.periodFromDate.hashCode()));
        result = ((result* 31)+((this.periodToDate == null)? 0 :this.periodToDate.hashCode()));
        result = ((result* 31)+((this.displayGrantCode == null)? 0 :this.displayGrantCode.hashCode()));
        result = ((result* 31)+((this.repType == null)? 0 :this.repType.hashCode()));
        result = ((result* 31)+((this.displayPmsCode == null)? 0 :this.displayPmsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.dateSubmitted == null)? 0 :this.dateSubmitted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardReportFfr100GetRequest) == false) {
            return false;
        }
        StandardReportFfr100GetRequest rhs = ((StandardReportFfr100GetRequest) other);
        return (((((((((this.periodFromDate == rhs.periodFromDate)||((this.periodFromDate!= null)&&this.periodFromDate.equals(rhs.periodFromDate)))&&((this.periodToDate == rhs.periodToDate)||((this.periodToDate!= null)&&this.periodToDate.equals(rhs.periodToDate))))&&((this.displayGrantCode == rhs.displayGrantCode)||((this.displayGrantCode!= null)&&this.displayGrantCode.equals(rhs.displayGrantCode))))&&((this.repType == rhs.repType)||((this.repType!= null)&&this.repType.equals(rhs.repType))))&&((this.displayPmsCode == rhs.displayPmsCode)||((this.displayPmsCode!= null)&&this.displayPmsCode.equals(rhs.displayPmsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.dateSubmitted == rhs.dateSubmitted)||((this.dateSubmitted!= null)&&this.dateSubmitted.equals(rhs.dateSubmitted))));
    }

}
