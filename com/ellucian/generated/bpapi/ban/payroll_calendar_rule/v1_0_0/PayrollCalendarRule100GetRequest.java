
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
    "payOfMonthInd",
    "amPmIndicator",
    "timeEntryCutoffTime",
    "leavReptCutoffTime",
    "statsCanadaMonth",
    "year",
    "endDate",
    "ptrcalnLrAprCutoffTime",
    "lrWebviewCutoffDate",
    "tsAprCutoffTime",
    "statsCanadaYear",
    "pictCode",
    "leavReptStartDate",
    "activityDate",
    "leavReptEndDate",
    "ptrcalnTimeEntryCutoffTime",
    "aprWebvcutoffDate",
    "fiscCode",
    "tsAprEndDate",
    "tsAprAmPmIndicator",
    "amPmIndicator1",
    "timeEntryStartDate",
    "lrAprEndDate",
    "lrAprWebvcutoffDate",
    "lrAprAmPmIndicator",
    "checkDate",
    "lrAprCutoffTime",
    "payno",
    "timeEntryEndDate",
    "ptrcalnTsAprCutoffTime",
    "ptrcalnLeavReptCutoffTime",
    "webViewCutoffDate",
    "startDate"
})
@Generated("jsonschema2pojo")
public class PayrollCalendarRule100GetRequest {

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
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator")
    private String amPmIndicator;
    /**
     * Employee Time Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("timeEntryCutoffTime")
    private String timeEntryCutoffTime;
    /**
     * Employee Leave Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("leavReptCutoffTime")
    private String leavReptCutoffTime;
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
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLrAprCutoffTime")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LR_APR_CUTOFF_TIME")
    private String ptrcalnLrAprCutoffTime;
    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_WEBVIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("lrWebviewCutoffDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LR_WEBVIEW_CUTOFF_DATE")
    private Date lrWebviewCutoffDate;
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
     * Employee Leave Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_START_DATE
     * 
     */
    @JsonProperty("leavReptStartDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LEAV_REPT_START_DATE")
    private Date leavReptStartDate;
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
     * Employee Leave Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_END_DATE
     * 
     */
    @JsonProperty("leavReptEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LEAV_REPT_END_DATE")
    private Date leavReptEndDate;
    /**
     * Employee Time Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTimeEntryCutoffTime")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TIME_ENTRY_CUTOFF_TIME")
    private String ptrcalnTimeEntryCutoffTime;
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
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprAmPmIndicator")
    private String tsAprAmPmIndicator;
    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator1")
    private String amPmIndicator1;
    /**
     * Employee Time Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE
     * 
     */
    @JsonProperty("timeEntryStartDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TIME_ENTRY_START_DATE")
    private Date timeEntryStartDate;
    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_END_DATE
     * 
     */
    @JsonProperty("lrAprEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LR_APR_END_DATE")
    private Date lrAprEndDate;
    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("lrAprWebvcutoffDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LR_APR_WEBVCUTOFF_DATE")
    private Date lrAprWebvcutoffDate;
    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("lrAprAmPmIndicator")
    private String lrAprAmPmIndicator;
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
    @JsonProperty("lrAprCutoffTime")
    private String lrAprCutoffTime;
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
     * Employee Time Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE
     * 
     */
    @JsonProperty("timeEntryEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TIME_ENTRY_END_DATE")
    private Date timeEntryEndDate;
    /**
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTsAprCutoffTime")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_TS_APR_CUTOFF_TIME")
    private String ptrcalnTsAprCutoffTime;
    /**
     * Employee Leave Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLeavReptCutoffTime")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_LEAV_REPT_CUTOFF_TIME")
    private String ptrcalnLeavReptCutoffTime;
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
     * Start Date
     * <p>
     * Lineage reference object : PTRCALN_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : PTRCALN_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public PayrollCalendarRule100GetRequest withPayOfMonthInd(Double payOfMonthInd) {
        this.payOfMonthInd = payOfMonthInd;
        return this;
    }

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

    public PayrollCalendarRule100GetRequest withAmPmIndicator(String amPmIndicator) {
        this.amPmIndicator = amPmIndicator;
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

    public PayrollCalendarRule100GetRequest withTimeEntryCutoffTime(String timeEntryCutoffTime) {
        this.timeEntryCutoffTime = timeEntryCutoffTime;
        return this;
    }

    /**
     * Employee Leave Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("leavReptCutoffTime")
    public String getLeavReptCutoffTime() {
        return leavReptCutoffTime;
    }

    /**
     * Employee Leave Entry End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("leavReptCutoffTime")
    public void setLeavReptCutoffTime(String leavReptCutoffTime) {
        this.leavReptCutoffTime = leavReptCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withLeavReptCutoffTime(String leavReptCutoffTime) {
        this.leavReptCutoffTime = leavReptCutoffTime;
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

    public PayrollCalendarRule100GetRequest withStatsCanadaMonth(String statsCanadaMonth) {
        this.statsCanadaMonth = statsCanadaMonth;
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

    public PayrollCalendarRule100GetRequest withYear(String year) {
        this.year = year;
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

    public PayrollCalendarRule100GetRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLrAprCutoffTime")
    public String getPtrcalnLrAprCutoffTime() {
        return ptrcalnLrAprCutoffTime;
    }

    /**
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLrAprCutoffTime")
    public void setPtrcalnLrAprCutoffTime(String ptrcalnLrAprCutoffTime) {
        this.ptrcalnLrAprCutoffTime = ptrcalnLrAprCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withPtrcalnLrAprCutoffTime(String ptrcalnLrAprCutoffTime) {
        this.ptrcalnLrAprCutoffTime = ptrcalnLrAprCutoffTime;
        return this;
    }

    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_WEBVIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("lrWebviewCutoffDate")
    public Date getLrWebviewCutoffDate() {
        return lrWebviewCutoffDate;
    }

    /**
     * Employee Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_WEBVIEW_CUTOFF_DATE
     * 
     */
    @JsonProperty("lrWebviewCutoffDate")
    public void setLrWebviewCutoffDate(Date lrWebviewCutoffDate) {
        this.lrWebviewCutoffDate = lrWebviewCutoffDate;
    }

    public PayrollCalendarRule100GetRequest withLrWebviewCutoffDate(Date lrWebviewCutoffDate) {
        this.lrWebviewCutoffDate = lrWebviewCutoffDate;
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

    public PayrollCalendarRule100GetRequest withTsAprCutoffTime(String tsAprCutoffTime) {
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

    public PayrollCalendarRule100GetRequest withStatsCanadaYear(Double statsCanadaYear) {
        this.statsCanadaYear = statsCanadaYear;
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

    public PayrollCalendarRule100GetRequest withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Employee Leave Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_START_DATE
     * 
     */
    @JsonProperty("leavReptStartDate")
    public Date getLeavReptStartDate() {
        return leavReptStartDate;
    }

    /**
     * Employee Leave Entry Start Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_START_DATE
     * 
     */
    @JsonProperty("leavReptStartDate")
    public void setLeavReptStartDate(Date leavReptStartDate) {
        this.leavReptStartDate = leavReptStartDate;
    }

    public PayrollCalendarRule100GetRequest withLeavReptStartDate(Date leavReptStartDate) {
        this.leavReptStartDate = leavReptStartDate;
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

    public PayrollCalendarRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Employee Leave Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_END_DATE
     * 
     */
    @JsonProperty("leavReptEndDate")
    public Date getLeavReptEndDate() {
        return leavReptEndDate;
    }

    /**
     * Employee Leave Entry End Date
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_END_DATE
     * 
     */
    @JsonProperty("leavReptEndDate")
    public void setLeavReptEndDate(Date leavReptEndDate) {
        this.leavReptEndDate = leavReptEndDate;
    }

    public PayrollCalendarRule100GetRequest withLeavReptEndDate(Date leavReptEndDate) {
        this.leavReptEndDate = leavReptEndDate;
        return this;
    }

    /**
     * Employee Time Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTimeEntryCutoffTime")
    public String getPtrcalnTimeEntryCutoffTime() {
        return ptrcalnTimeEntryCutoffTime;
    }

    /**
     * Employee Time Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_TIME_ENTRY_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTimeEntryCutoffTime")
    public void setPtrcalnTimeEntryCutoffTime(String ptrcalnTimeEntryCutoffTime) {
        this.ptrcalnTimeEntryCutoffTime = ptrcalnTimeEntryCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withPtrcalnTimeEntryCutoffTime(String ptrcalnTimeEntryCutoffTime) {
        this.ptrcalnTimeEntryCutoffTime = ptrcalnTimeEntryCutoffTime;
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

    public PayrollCalendarRule100GetRequest withAprWebvcutoffDate(Date aprWebvcutoffDate) {
        this.aprWebvcutoffDate = aprWebvcutoffDate;
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

    public PayrollCalendarRule100GetRequest withFiscCode(String fiscCode) {
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

    public PayrollCalendarRule100GetRequest withTsAprEndDate(Date tsAprEndDate) {
        this.tsAprEndDate = tsAprEndDate;
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

    public PayrollCalendarRule100GetRequest withTsAprAmPmIndicator(String tsAprAmPmIndicator) {
        this.tsAprAmPmIndicator = tsAprAmPmIndicator;
        return this;
    }

    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator1")
    public String getAmPmIndicator1() {
        return amPmIndicator1;
    }

    /**
     * Employee AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("amPmIndicator1")
    public void setAmPmIndicator1(String amPmIndicator1) {
        this.amPmIndicator1 = amPmIndicator1;
    }

    public PayrollCalendarRule100GetRequest withAmPmIndicator1(String amPmIndicator1) {
        this.amPmIndicator1 = amPmIndicator1;
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

    public PayrollCalendarRule100GetRequest withTimeEntryStartDate(Date timeEntryStartDate) {
        this.timeEntryStartDate = timeEntryStartDate;
        return this;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_END_DATE
     * 
     */
    @JsonProperty("lrAprEndDate")
    public Date getLrAprEndDate() {
        return lrAprEndDate;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_END_DATE
     * 
     */
    @JsonProperty("lrAprEndDate")
    public void setLrAprEndDate(Date lrAprEndDate) {
        this.lrAprEndDate = lrAprEndDate;
    }

    public PayrollCalendarRule100GetRequest withLrAprEndDate(Date lrAprEndDate) {
        this.lrAprEndDate = lrAprEndDate;
        return this;
    }

    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("lrAprWebvcutoffDate")
    public Date getLrAprWebvcutoffDate() {
        return lrAprWebvcutoffDate;
    }

    /**
     * Approver Web Access Until
     * <p>
     * Lineage reference object : PTRCALN_LR_APR_WEBVCUTOFF_DATE
     * 
     */
    @JsonProperty("lrAprWebvcutoffDate")
    public void setLrAprWebvcutoffDate(Date lrAprWebvcutoffDate) {
        this.lrAprWebvcutoffDate = lrAprWebvcutoffDate;
    }

    public PayrollCalendarRule100GetRequest withLrAprWebvcutoffDate(Date lrAprWebvcutoffDate) {
        this.lrAprWebvcutoffDate = lrAprWebvcutoffDate;
        return this;
    }

    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("lrAprAmPmIndicator")
    public String getLrAprAmPmIndicator() {
        return lrAprAmPmIndicator;
    }

    /**
     * Approver AM/PM
     * <p>
     * 
     * 
     */
    @JsonProperty("lrAprAmPmIndicator")
    public void setLrAprAmPmIndicator(String lrAprAmPmIndicator) {
        this.lrAprAmPmIndicator = lrAprAmPmIndicator;
    }

    public PayrollCalendarRule100GetRequest withLrAprAmPmIndicator(String lrAprAmPmIndicator) {
        this.lrAprAmPmIndicator = lrAprAmPmIndicator;
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

    public PayrollCalendarRule100GetRequest withCheckDate(Date checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("lrAprCutoffTime")
    public String getLrAprCutoffTime() {
        return lrAprCutoffTime;
    }

    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("lrAprCutoffTime")
    public void setLrAprCutoffTime(String lrAprCutoffTime) {
        this.lrAprCutoffTime = lrAprCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withLrAprCutoffTime(String lrAprCutoffTime) {
        this.lrAprCutoffTime = lrAprCutoffTime;
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

    public PayrollCalendarRule100GetRequest withPayno(Double payno) {
        this.payno = payno;
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

    public PayrollCalendarRule100GetRequest withTimeEntryEndDate(Date timeEntryEndDate) {
        this.timeEntryEndDate = timeEntryEndDate;
        return this;
    }

    /**
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTsAprCutoffTime")
    public String getPtrcalnTsAprCutoffTime() {
        return ptrcalnTsAprCutoffTime;
    }

    /**
     * Approver End Time
     * <p>
     * Lineage reference object : PTRCALN_TS_APR_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnTsAprCutoffTime")
    public void setPtrcalnTsAprCutoffTime(String ptrcalnTsAprCutoffTime) {
        this.ptrcalnTsAprCutoffTime = ptrcalnTsAprCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withPtrcalnTsAprCutoffTime(String ptrcalnTsAprCutoffTime) {
        this.ptrcalnTsAprCutoffTime = ptrcalnTsAprCutoffTime;
        return this;
    }

    /**
     * Employee Leave Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLeavReptCutoffTime")
    public String getPtrcalnLeavReptCutoffTime() {
        return ptrcalnLeavReptCutoffTime;
    }

    /**
     * Employee Leave Entry End Time
     * <p>
     * Lineage reference object : PTRCALN_LEAV_REPT_CUTOFF_TIME
     * 
     */
    @JsonProperty("ptrcalnLeavReptCutoffTime")
    public void setPtrcalnLeavReptCutoffTime(String ptrcalnLeavReptCutoffTime) {
        this.ptrcalnLeavReptCutoffTime = ptrcalnLeavReptCutoffTime;
    }

    public PayrollCalendarRule100GetRequest withPtrcalnLeavReptCutoffTime(String ptrcalnLeavReptCutoffTime) {
        this.ptrcalnLeavReptCutoffTime = ptrcalnLeavReptCutoffTime;
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

    public PayrollCalendarRule100GetRequest withWebViewCutoffDate(Date webViewCutoffDate) {
        this.webViewCutoffDate = webViewCutoffDate;
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

    public PayrollCalendarRule100GetRequest withStartDate(Date startDate) {
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

    public PayrollCalendarRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollCalendarRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("payOfMonthInd");
        sb.append('=');
        sb.append(((this.payOfMonthInd == null)?"<null>":this.payOfMonthInd));
        sb.append(',');
        sb.append("amPmIndicator");
        sb.append('=');
        sb.append(((this.amPmIndicator == null)?"<null>":this.amPmIndicator));
        sb.append(',');
        sb.append("timeEntryCutoffTime");
        sb.append('=');
        sb.append(((this.timeEntryCutoffTime == null)?"<null>":this.timeEntryCutoffTime));
        sb.append(',');
        sb.append("leavReptCutoffTime");
        sb.append('=');
        sb.append(((this.leavReptCutoffTime == null)?"<null>":this.leavReptCutoffTime));
        sb.append(',');
        sb.append("statsCanadaMonth");
        sb.append('=');
        sb.append(((this.statsCanadaMonth == null)?"<null>":this.statsCanadaMonth));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ptrcalnLrAprCutoffTime");
        sb.append('=');
        sb.append(((this.ptrcalnLrAprCutoffTime == null)?"<null>":this.ptrcalnLrAprCutoffTime));
        sb.append(',');
        sb.append("lrWebviewCutoffDate");
        sb.append('=');
        sb.append(((this.lrWebviewCutoffDate == null)?"<null>":this.lrWebviewCutoffDate));
        sb.append(',');
        sb.append("tsAprCutoffTime");
        sb.append('=');
        sb.append(((this.tsAprCutoffTime == null)?"<null>":this.tsAprCutoffTime));
        sb.append(',');
        sb.append("statsCanadaYear");
        sb.append('=');
        sb.append(((this.statsCanadaYear == null)?"<null>":this.statsCanadaYear));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("leavReptStartDate");
        sb.append('=');
        sb.append(((this.leavReptStartDate == null)?"<null>":this.leavReptStartDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("leavReptEndDate");
        sb.append('=');
        sb.append(((this.leavReptEndDate == null)?"<null>":this.leavReptEndDate));
        sb.append(',');
        sb.append("ptrcalnTimeEntryCutoffTime");
        sb.append('=');
        sb.append(((this.ptrcalnTimeEntryCutoffTime == null)?"<null>":this.ptrcalnTimeEntryCutoffTime));
        sb.append(',');
        sb.append("aprWebvcutoffDate");
        sb.append('=');
        sb.append(((this.aprWebvcutoffDate == null)?"<null>":this.aprWebvcutoffDate));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("tsAprEndDate");
        sb.append('=');
        sb.append(((this.tsAprEndDate == null)?"<null>":this.tsAprEndDate));
        sb.append(',');
        sb.append("tsAprAmPmIndicator");
        sb.append('=');
        sb.append(((this.tsAprAmPmIndicator == null)?"<null>":this.tsAprAmPmIndicator));
        sb.append(',');
        sb.append("amPmIndicator1");
        sb.append('=');
        sb.append(((this.amPmIndicator1 == null)?"<null>":this.amPmIndicator1));
        sb.append(',');
        sb.append("timeEntryStartDate");
        sb.append('=');
        sb.append(((this.timeEntryStartDate == null)?"<null>":this.timeEntryStartDate));
        sb.append(',');
        sb.append("lrAprEndDate");
        sb.append('=');
        sb.append(((this.lrAprEndDate == null)?"<null>":this.lrAprEndDate));
        sb.append(',');
        sb.append("lrAprWebvcutoffDate");
        sb.append('=');
        sb.append(((this.lrAprWebvcutoffDate == null)?"<null>":this.lrAprWebvcutoffDate));
        sb.append(',');
        sb.append("lrAprAmPmIndicator");
        sb.append('=');
        sb.append(((this.lrAprAmPmIndicator == null)?"<null>":this.lrAprAmPmIndicator));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
        sb.append(',');
        sb.append("lrAprCutoffTime");
        sb.append('=');
        sb.append(((this.lrAprCutoffTime == null)?"<null>":this.lrAprCutoffTime));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("timeEntryEndDate");
        sb.append('=');
        sb.append(((this.timeEntryEndDate == null)?"<null>":this.timeEntryEndDate));
        sb.append(',');
        sb.append("ptrcalnTsAprCutoffTime");
        sb.append('=');
        sb.append(((this.ptrcalnTsAprCutoffTime == null)?"<null>":this.ptrcalnTsAprCutoffTime));
        sb.append(',');
        sb.append("ptrcalnLeavReptCutoffTime");
        sb.append('=');
        sb.append(((this.ptrcalnLeavReptCutoffTime == null)?"<null>":this.ptrcalnLeavReptCutoffTime));
        sb.append(',');
        sb.append("webViewCutoffDate");
        sb.append('=');
        sb.append(((this.webViewCutoffDate == null)?"<null>":this.webViewCutoffDate));
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
        result = ((result* 31)+((this.payOfMonthInd == null)? 0 :this.payOfMonthInd.hashCode()));
        result = ((result* 31)+((this.amPmIndicator == null)? 0 :this.amPmIndicator.hashCode()));
        result = ((result* 31)+((this.timeEntryCutoffTime == null)? 0 :this.timeEntryCutoffTime.hashCode()));
        result = ((result* 31)+((this.leavReptCutoffTime == null)? 0 :this.leavReptCutoffTime.hashCode()));
        result = ((result* 31)+((this.statsCanadaMonth == null)? 0 :this.statsCanadaMonth.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.ptrcalnLrAprCutoffTime == null)? 0 :this.ptrcalnLrAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.lrWebviewCutoffDate == null)? 0 :this.lrWebviewCutoffDate.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffTime == null)? 0 :this.tsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.statsCanadaYear == null)? 0 :this.statsCanadaYear.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.leavReptStartDate == null)? 0 :this.leavReptStartDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.leavReptEndDate == null)? 0 :this.leavReptEndDate.hashCode()));
        result = ((result* 31)+((this.ptrcalnTimeEntryCutoffTime == null)? 0 :this.ptrcalnTimeEntryCutoffTime.hashCode()));
        result = ((result* 31)+((this.aprWebvcutoffDate == null)? 0 :this.aprWebvcutoffDate.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.tsAprEndDate == null)? 0 :this.tsAprEndDate.hashCode()));
        result = ((result* 31)+((this.tsAprAmPmIndicator == null)? 0 :this.tsAprAmPmIndicator.hashCode()));
        result = ((result* 31)+((this.amPmIndicator1 == null)? 0 :this.amPmIndicator1 .hashCode()));
        result = ((result* 31)+((this.timeEntryStartDate == null)? 0 :this.timeEntryStartDate.hashCode()));
        result = ((result* 31)+((this.lrAprEndDate == null)? 0 :this.lrAprEndDate.hashCode()));
        result = ((result* 31)+((this.lrAprWebvcutoffDate == null)? 0 :this.lrAprWebvcutoffDate.hashCode()));
        result = ((result* 31)+((this.lrAprAmPmIndicator == null)? 0 :this.lrAprAmPmIndicator.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        result = ((result* 31)+((this.lrAprCutoffTime == null)? 0 :this.lrAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.timeEntryEndDate == null)? 0 :this.timeEntryEndDate.hashCode()));
        result = ((result* 31)+((this.ptrcalnTsAprCutoffTime == null)? 0 :this.ptrcalnTsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.ptrcalnLeavReptCutoffTime == null)? 0 :this.ptrcalnLeavReptCutoffTime.hashCode()));
        result = ((result* 31)+((this.webViewCutoffDate == null)? 0 :this.webViewCutoffDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollCalendarRule100GetRequest) == false) {
            return false;
        }
        PayrollCalendarRule100GetRequest rhs = ((PayrollCalendarRule100GetRequest) other);
        return (((((((((((((((((((((((((((((((((((this.payOfMonthInd == rhs.payOfMonthInd)||((this.payOfMonthInd!= null)&&this.payOfMonthInd.equals(rhs.payOfMonthInd)))&&((this.amPmIndicator == rhs.amPmIndicator)||((this.amPmIndicator!= null)&&this.amPmIndicator.equals(rhs.amPmIndicator))))&&((this.timeEntryCutoffTime == rhs.timeEntryCutoffTime)||((this.timeEntryCutoffTime!= null)&&this.timeEntryCutoffTime.equals(rhs.timeEntryCutoffTime))))&&((this.leavReptCutoffTime == rhs.leavReptCutoffTime)||((this.leavReptCutoffTime!= null)&&this.leavReptCutoffTime.equals(rhs.leavReptCutoffTime))))&&((this.statsCanadaMonth == rhs.statsCanadaMonth)||((this.statsCanadaMonth!= null)&&this.statsCanadaMonth.equals(rhs.statsCanadaMonth))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.ptrcalnLrAprCutoffTime == rhs.ptrcalnLrAprCutoffTime)||((this.ptrcalnLrAprCutoffTime!= null)&&this.ptrcalnLrAprCutoffTime.equals(rhs.ptrcalnLrAprCutoffTime))))&&((this.lrWebviewCutoffDate == rhs.lrWebviewCutoffDate)||((this.lrWebviewCutoffDate!= null)&&this.lrWebviewCutoffDate.equals(rhs.lrWebviewCutoffDate))))&&((this.tsAprCutoffTime == rhs.tsAprCutoffTime)||((this.tsAprCutoffTime!= null)&&this.tsAprCutoffTime.equals(rhs.tsAprCutoffTime))))&&((this.statsCanadaYear == rhs.statsCanadaYear)||((this.statsCanadaYear!= null)&&this.statsCanadaYear.equals(rhs.statsCanadaYear))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.leavReptStartDate == rhs.leavReptStartDate)||((this.leavReptStartDate!= null)&&this.leavReptStartDate.equals(rhs.leavReptStartDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.leavReptEndDate == rhs.leavReptEndDate)||((this.leavReptEndDate!= null)&&this.leavReptEndDate.equals(rhs.leavReptEndDate))))&&((this.ptrcalnTimeEntryCutoffTime == rhs.ptrcalnTimeEntryCutoffTime)||((this.ptrcalnTimeEntryCutoffTime!= null)&&this.ptrcalnTimeEntryCutoffTime.equals(rhs.ptrcalnTimeEntryCutoffTime))))&&((this.aprWebvcutoffDate == rhs.aprWebvcutoffDate)||((this.aprWebvcutoffDate!= null)&&this.aprWebvcutoffDate.equals(rhs.aprWebvcutoffDate))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.tsAprEndDate == rhs.tsAprEndDate)||((this.tsAprEndDate!= null)&&this.tsAprEndDate.equals(rhs.tsAprEndDate))))&&((this.tsAprAmPmIndicator == rhs.tsAprAmPmIndicator)||((this.tsAprAmPmIndicator!= null)&&this.tsAprAmPmIndicator.equals(rhs.tsAprAmPmIndicator))))&&((this.amPmIndicator1 == rhs.amPmIndicator1)||((this.amPmIndicator1 != null)&&this.amPmIndicator1 .equals(rhs.amPmIndicator1))))&&((this.timeEntryStartDate == rhs.timeEntryStartDate)||((this.timeEntryStartDate!= null)&&this.timeEntryStartDate.equals(rhs.timeEntryStartDate))))&&((this.lrAprEndDate == rhs.lrAprEndDate)||((this.lrAprEndDate!= null)&&this.lrAprEndDate.equals(rhs.lrAprEndDate))))&&((this.lrAprWebvcutoffDate == rhs.lrAprWebvcutoffDate)||((this.lrAprWebvcutoffDate!= null)&&this.lrAprWebvcutoffDate.equals(rhs.lrAprWebvcutoffDate))))&&((this.lrAprAmPmIndicator == rhs.lrAprAmPmIndicator)||((this.lrAprAmPmIndicator!= null)&&this.lrAprAmPmIndicator.equals(rhs.lrAprAmPmIndicator))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))))&&((this.lrAprCutoffTime == rhs.lrAprCutoffTime)||((this.lrAprCutoffTime!= null)&&this.lrAprCutoffTime.equals(rhs.lrAprCutoffTime))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.timeEntryEndDate == rhs.timeEntryEndDate)||((this.timeEntryEndDate!= null)&&this.timeEntryEndDate.equals(rhs.timeEntryEndDate))))&&((this.ptrcalnTsAprCutoffTime == rhs.ptrcalnTsAprCutoffTime)||((this.ptrcalnTsAprCutoffTime!= null)&&this.ptrcalnTsAprCutoffTime.equals(rhs.ptrcalnTsAprCutoffTime))))&&((this.ptrcalnLeavReptCutoffTime == rhs.ptrcalnLeavReptCutoffTime)||((this.ptrcalnLeavReptCutoffTime!= null)&&this.ptrcalnLeavReptCutoffTime.equals(rhs.ptrcalnLeavReptCutoffTime))))&&((this.webViewCutoffDate == rhs.webViewCutoffDate)||((this.webViewCutoffDate!= null)&&this.webViewCutoffDate.equals(rhs.webViewCutoffDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
