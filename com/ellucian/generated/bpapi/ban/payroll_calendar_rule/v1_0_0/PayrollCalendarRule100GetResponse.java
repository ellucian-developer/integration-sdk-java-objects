
package com.ellucian.generated.bpapi.ban.payroll_calendar_rule.v1_0_0;

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
    "amPmIndicator",
    "payOfMonthInd",
    "timeEntryCutoffTime",
    "statsCanadaMonth",
    "endDate",
    "year",
    "checkDate",
    "tsAprCutoffTime",
    "statsCanadaYear",
    "payno",
    "activityDate",
    "pictCode",
    "aprWebvcutoffDate",
    "timeEntryEndDate",
    "fiscCode",
    "tsAprEndDate",
    "webViewCutoffDate",
    "tsAprAmPmIndicator",
    "startDate",
    "timeEntryStartDate"
})
@Generated("jsonschema2pojo")
public class PayrollCalendarRule100GetResponse {

    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator")
    private String amPmIndicator;
    /**
     * Pay of Month
     * <p>
     * Lineage reference object : PTRCALN_PAY_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("payOfMonthInd")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_PAY_OF_MONTH_IND")
    private Double payOfMonthInd;
    /**
     * Employee Time Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("timeEntryCutoffTime")
    private String timeEntryCutoffTime;
    /**
     * Canada Month
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_MONTH
     * 
     */
    @JsonProperty("statsCanadaMonth")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_STATS_CANADA_MONTH")
    private String statsCanadaMonth;
    /**
     * End Date
     * <p>
     * Lineage reference object : PTRCALN_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_END_DATE")
    private Date endDate;
    /**
     * Year
     * <p>
     * Lineage reference object : PTRCALN_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_YEAR")
    private String year;
    /**
     * Check Date
     * <p>
     * Lineage reference object : PTRCALN_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_CHECK_DATE")
    private Date checkDate;
    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprCutoffTime")
    private String tsAprCutoffTime;
    /**
     * Statistics Year
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_YEAR
     * 
     */
    @JsonProperty("statsCanadaYear")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_STATS_CANADA_YEAR")
    private Double statsCanadaYear;
    /**
     * Number
     * <p>
     * Lineage reference object : PTRCALN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("payno")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_PAYNO")
    private Double payno;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRCALN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRCALN_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_PICT_CODE")
    private String pictCode;
    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("aprWebvcutoffDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_APR_WEBVCUTOFF_DATE")
    private Date aprWebvcutoffDate;
    /**
     * Employee Time Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE
     * 
     */
    @JsonProperty("timeEntryEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE")
    private Date timeEntryEndDate;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : PTRCALN_FISC_CODE
     * 
     */
    @JsonProperty("fiscCode")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_FISC_CODE")
    private String fiscCode;
    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_END_DATE
     * 
     */
    @JsonProperty("tsAprEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TS_APR_END_DATE")
    private Date tsAprEndDate;
    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_WEB_VIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("webViewCutoffDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_WEB_VIEW_CUTOFF_DATE")
    private Date webViewCutoffDate;
    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprAmPmIndicator")
    private String tsAprAmPmIndicator;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PTRCALN_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_START_DATE")
    private Date startDate;
    /**
     * Employee Time Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE
     * 
     */
    @JsonProperty("timeEntryStartDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE")
    private Date timeEntryStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator")
    public String getAmPmIndicator() {
        return amPmIndicator;
    }

    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator")
    public void setAmPmIndicator(String amPmIndicator) {
        this.amPmIndicator = amPmIndicator;
    }

    public PayrollCalendarRule100GetResponse withAmPmIndicator(String amPmIndicator) {
        this.amPmIndicator = amPmIndicator;
        return this;
    }

    /**
     * Pay of Month
     * <p>
     * Lineage reference object : PTRCALN_PAY_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("payOfMonthInd")
    public Double getPayOfMonthInd() {
        return payOfMonthInd;
    }

    /**
     * Pay of Month
     * <p>
     * Lineage reference object : PTRCALN_PAY_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("payOfMonthInd")
    public void setPayOfMonthInd(Double payOfMonthInd) {
        this.payOfMonthInd = payOfMonthInd;
    }

    public PayrollCalendarRule100GetResponse withPayOfMonthInd(Double payOfMonthInd) {
        this.payOfMonthInd = payOfMonthInd;
        return this;
    }

    /**
     * Employee Time Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("timeEntryCutoffTime")
    public String getTimeEntryCutoffTime() {
        return timeEntryCutoffTime;
    }

    /**
     * Employee Time Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("timeEntryCutoffTime")
    public void setTimeEntryCutoffTime(String timeEntryCutoffTime) {
        this.timeEntryCutoffTime = timeEntryCutoffTime;
    }

    public PayrollCalendarRule100GetResponse withTimeEntryCutoffTime(String timeEntryCutoffTime) {
        this.timeEntryCutoffTime = timeEntryCutoffTime;
        return this;
    }

    /**
     * Canada Month
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_MONTH
     * 
     */
    @JsonProperty("statsCanadaMonth")
    public String getStatsCanadaMonth() {
        return statsCanadaMonth;
    }

    /**
     * Canada Month
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_MONTH
     * 
     */
    @JsonProperty("statsCanadaMonth")
    public void setStatsCanadaMonth(String statsCanadaMonth) {
        this.statsCanadaMonth = statsCanadaMonth;
    }

    public PayrollCalendarRule100GetResponse withStatsCanadaMonth(String statsCanadaMonth) {
        this.statsCanadaMonth = statsCanadaMonth;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PTRCALN_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PTRCALN_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PayrollCalendarRule100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : PTRCALN_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : PTRCALN_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public PayrollCalendarRule100GetResponse withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : PTRCALN_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : PTRCALN_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public PayrollCalendarRule100GetResponse withCheckDate(Date checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprCutoffTime")
    public String getTsAprCutoffTime() {
        return tsAprCutoffTime;
    }

    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprCutoffTime")
    public void setTsAprCutoffTime(String tsAprCutoffTime) {
        this.tsAprCutoffTime = tsAprCutoffTime;
    }

    public PayrollCalendarRule100GetResponse withTsAprCutoffTime(String tsAprCutoffTime) {
        this.tsAprCutoffTime = tsAprCutoffTime;
        return this;
    }

    /**
     * Statistics Year
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_YEAR
     * 
     */
    @JsonProperty("statsCanadaYear")
    public Double getStatsCanadaYear() {
        return statsCanadaYear;
    }

    /**
     * Statistics Year
     * <p>
     * Lineage reference object : PTRCALN_STATS_CANADA_YEAR
     * 
     */
    @JsonProperty("statsCanadaYear")
    public void setStatsCanadaYear(Double statsCanadaYear) {
        this.statsCanadaYear = statsCanadaYear;
    }

    public PayrollCalendarRule100GetResponse withStatsCanadaYear(Double statsCanadaYear) {
        this.statsCanadaYear = statsCanadaYear;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : PTRCALN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public Double getPayno() {
        return payno;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : PTRCALN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public void setPayno(Double payno) {
        this.payno = payno;
    }

    public PayrollCalendarRule100GetResponse withPayno(Double payno) {
        this.payno = payno;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRCALN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRCALN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PayrollCalendarRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRCALN_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRCALN_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public PayrollCalendarRule100GetResponse withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("aprWebvcutoffDate")
    public Date getAprWebvcutoffDate() {
        return aprWebvcutoffDate;
    }

    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("aprWebvcutoffDate")
    public void setAprWebvcutoffDate(Date aprWebvcutoffDate) {
        this.aprWebvcutoffDate = aprWebvcutoffDate;
    }

    public PayrollCalendarRule100GetResponse withAprWebvcutoffDate(Date aprWebvcutoffDate) {
        this.aprWebvcutoffDate = aprWebvcutoffDate;
        return this;
    }

    /**
     * Employee Time Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE
     * 
     */
    @JsonProperty("timeEntryEndDate")
    public Date getTimeEntryEndDate() {
        return timeEntryEndDate;
    }

    /**
     * Employee Time Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE
     * 
     */
    @JsonProperty("timeEntryEndDate")
    public void setTimeEntryEndDate(Date timeEntryEndDate) {
        this.timeEntryEndDate = timeEntryEndDate;
    }

    public PayrollCalendarRule100GetResponse withTimeEntryEndDate(Date timeEntryEndDate) {
        this.timeEntryEndDate = timeEntryEndDate;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : PTRCALN_FISC_CODE
     * 
     */
    @JsonProperty("fiscCode")
    public String getFiscCode() {
        return fiscCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : PTRCALN_FISC_CODE
     * 
     */
    @JsonProperty("fiscCode")
    public void setFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
    }

    public PayrollCalendarRule100GetResponse withFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
        return this;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_END_DATE
     * 
     */
    @JsonProperty("tsAprEndDate")
    public Date getTsAprEndDate() {
        return tsAprEndDate;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_END_DATE
     * 
     */
    @JsonProperty("tsAprEndDate")
    public void setTsAprEndDate(Date tsAprEndDate) {
        this.tsAprEndDate = tsAprEndDate;
    }

    public PayrollCalendarRule100GetResponse withTsAprEndDate(Date tsAprEndDate) {
        this.tsAprEndDate = tsAprEndDate;
        return this;
    }

    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_WEB_VIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("webViewCutoffDate")
    public Date getWebViewCutoffDate() {
        return webViewCutoffDate;
    }

    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_WEB_VIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("webViewCutoffDate")
    public void setWebViewCutoffDate(Date webViewCutoffDate) {
        this.webViewCutoffDate = webViewCutoffDate;
    }

    public PayrollCalendarRule100GetResponse withWebViewCutoffDate(Date webViewCutoffDate) {
        this.webViewCutoffDate = webViewCutoffDate;
        return this;
    }

    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprAmPmIndicator")
    public String getTsAprAmPmIndicator() {
        return tsAprAmPmIndicator;
    }

    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprAmPmIndicator")
    public void setTsAprAmPmIndicator(String tsAprAmPmIndicator) {
        this.tsAprAmPmIndicator = tsAprAmPmIndicator;
    }

    public PayrollCalendarRule100GetResponse withTsAprAmPmIndicator(String tsAprAmPmIndicator) {
        this.tsAprAmPmIndicator = tsAprAmPmIndicator;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PTRCALN_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PTRCALN_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public PayrollCalendarRule100GetResponse withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Employee Time Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE
     * 
     */
    @JsonProperty("timeEntryStartDate")
    public Date getTimeEntryStartDate() {
        return timeEntryStartDate;
    }

    /**
     * Employee Time Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE
     * 
     */
    @JsonProperty("timeEntryStartDate")
    public void setTimeEntryStartDate(Date timeEntryStartDate) {
        this.timeEntryStartDate = timeEntryStartDate;
    }

    public PayrollCalendarRule100GetResponse withTimeEntryStartDate(Date timeEntryStartDate) {
        this.timeEntryStartDate = timeEntryStartDate;
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

    public PayrollCalendarRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollCalendarRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amPmIndicator");
        sb.append('=');
        sb.append(((this.amPmIndicator == null)?"<null>":this.amPmIndicator));
        sb.append(',');
        sb.append("payOfMonthInd");
        sb.append('=');
        sb.append(((this.payOfMonthInd == null)?"<null>":this.payOfMonthInd));
        sb.append(',');
        sb.append("timeEntryCutoffTime");
        sb.append('=');
        sb.append(((this.timeEntryCutoffTime == null)?"<null>":this.timeEntryCutoffTime));
        sb.append(',');
        sb.append("statsCanadaMonth");
        sb.append('=');
        sb.append(((this.statsCanadaMonth == null)?"<null>":this.statsCanadaMonth));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
        sb.append(',');
        sb.append("tsAprCutoffTime");
        sb.append('=');
        sb.append(((this.tsAprCutoffTime == null)?"<null>":this.tsAprCutoffTime));
        sb.append(',');
        sb.append("statsCanadaYear");
        sb.append('=');
        sb.append(((this.statsCanadaYear == null)?"<null>":this.statsCanadaYear));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("aprWebvcutoffDate");
        sb.append('=');
        sb.append(((this.aprWebvcutoffDate == null)?"<null>":this.aprWebvcutoffDate));
        sb.append(',');
        sb.append("timeEntryEndDate");
        sb.append('=');
        sb.append(((this.timeEntryEndDate == null)?"<null>":this.timeEntryEndDate));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("tsAprEndDate");
        sb.append('=');
        sb.append(((this.tsAprEndDate == null)?"<null>":this.tsAprEndDate));
        sb.append(',');
        sb.append("webViewCutoffDate");
        sb.append('=');
        sb.append(((this.webViewCutoffDate == null)?"<null>":this.webViewCutoffDate));
        sb.append(',');
        sb.append("tsAprAmPmIndicator");
        sb.append('=');
        sb.append(((this.tsAprAmPmIndicator == null)?"<null>":this.tsAprAmPmIndicator));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("timeEntryStartDate");
        sb.append('=');
        sb.append(((this.timeEntryStartDate == null)?"<null>":this.timeEntryStartDate));
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
        result = ((result* 31)+((this.amPmIndicator == null)? 0 :this.amPmIndicator.hashCode()));
        result = ((result* 31)+((this.payOfMonthInd == null)? 0 :this.payOfMonthInd.hashCode()));
        result = ((result* 31)+((this.timeEntryCutoffTime == null)? 0 :this.timeEntryCutoffTime.hashCode()));
        result = ((result* 31)+((this.statsCanadaMonth == null)? 0 :this.statsCanadaMonth.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffTime == null)? 0 :this.tsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.statsCanadaYear == null)? 0 :this.statsCanadaYear.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.aprWebvcutoffDate == null)? 0 :this.aprWebvcutoffDate.hashCode()));
        result = ((result* 31)+((this.timeEntryEndDate == null)? 0 :this.timeEntryEndDate.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.tsAprEndDate == null)? 0 :this.tsAprEndDate.hashCode()));
        result = ((result* 31)+((this.webViewCutoffDate == null)? 0 :this.webViewCutoffDate.hashCode()));
        result = ((result* 31)+((this.tsAprAmPmIndicator == null)? 0 :this.tsAprAmPmIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.timeEntryStartDate == null)? 0 :this.timeEntryStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollCalendarRule100GetResponse) == false) {
            return false;
        }
        PayrollCalendarRule100GetResponse rhs = ((PayrollCalendarRule100GetResponse) other);
        return ((((((((((((((((((((((this.amPmIndicator == rhs.amPmIndicator)||((this.amPmIndicator!= null)&&this.amPmIndicator.equals(rhs.amPmIndicator)))&&((this.payOfMonthInd == rhs.payOfMonthInd)||((this.payOfMonthInd!= null)&&this.payOfMonthInd.equals(rhs.payOfMonthInd))))&&((this.timeEntryCutoffTime == rhs.timeEntryCutoffTime)||((this.timeEntryCutoffTime!= null)&&this.timeEntryCutoffTime.equals(rhs.timeEntryCutoffTime))))&&((this.statsCanadaMonth == rhs.statsCanadaMonth)||((this.statsCanadaMonth!= null)&&this.statsCanadaMonth.equals(rhs.statsCanadaMonth))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))))&&((this.tsAprCutoffTime == rhs.tsAprCutoffTime)||((this.tsAprCutoffTime!= null)&&this.tsAprCutoffTime.equals(rhs.tsAprCutoffTime))))&&((this.statsCanadaYear == rhs.statsCanadaYear)||((this.statsCanadaYear!= null)&&this.statsCanadaYear.equals(rhs.statsCanadaYear))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.aprWebvcutoffDate == rhs.aprWebvcutoffDate)||((this.aprWebvcutoffDate!= null)&&this.aprWebvcutoffDate.equals(rhs.aprWebvcutoffDate))))&&((this.timeEntryEndDate == rhs.timeEntryEndDate)||((this.timeEntryEndDate!= null)&&this.timeEntryEndDate.equals(rhs.timeEntryEndDate))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.tsAprEndDate == rhs.tsAprEndDate)||((this.tsAprEndDate!= null)&&this.tsAprEndDate.equals(rhs.tsAprEndDate))))&&((this.webViewCutoffDate == rhs.webViewCutoffDate)||((this.webViewCutoffDate!= null)&&this.webViewCutoffDate.equals(rhs.webViewCutoffDate))))&&((this.tsAprAmPmIndicator == rhs.tsAprAmPmIndicator)||((this.tsAprAmPmIndicator!= null)&&this.tsAprAmPmIndicator.equals(rhs.tsAprAmPmIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.timeEntryStartDate == rhs.timeEntryStartDate)||((this.timeEntryStartDate!= null)&&this.timeEntryStartDate.equals(rhs.timeEntryStartDate))));
    }

}
