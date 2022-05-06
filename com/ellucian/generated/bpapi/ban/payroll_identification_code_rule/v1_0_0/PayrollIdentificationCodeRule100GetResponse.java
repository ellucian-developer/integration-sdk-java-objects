
package com.ellucian.generated.bpapi.ban.payroll_identification_code_rule.v1_0_0;

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
    "code",
    "pictBankName",
    "suppPayInd",
    "codeOrig",
    "tsAprCutoffTime",
    "activityDate",
    "tsCutoffTime",
    "uiWeeks",
    "tsPriorAfterInd",
    "roePeriodType",
    "uiMaxEarnings",
    "bankCode",
    "tsAprCutoffDays",
    "tsCutoffDays",
    "taxFactor",
    "uiMinEarnings",
    "tsLeaveRequests",
    "tsWebViewMonths",
    "tsAmPmInd",
    "paysPerYear",
    "checkIssuedDays",
    "tsAprAmPmInd",
    "tsAprPriorAfterInd",
    "checkIssuedInd",
    "uiMinHours",
    "desc"
})
@Generated("jsonschema2pojo")
public class PayrollIdentificationCodeRule100GetResponse {

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CODE")
    private String code;
    @JsonProperty("pictBankName")
    private String pictBankName;
    /**
     * Supplemental Pay
     * <p>
     * Lineage reference object : PTRPICT_SUPP_PAY_IND
     * 
     */
    @JsonProperty("suppPayInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_SUPP_PAY_IND")
    private String suppPayInd;
    /**
     * Original Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE_ORIG
     * 
     */
    @JsonProperty("codeOrig")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CODE_ORIG")
    private String codeOrig;
    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprCutoffTime")
    private String tsAprCutoffTime;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRPICT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Employee End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsCutoffTime")
    private String tsCutoffTime;
    /**
     * UI Weeks
     * <p>
     * Lineage reference object : PTRPICT_UI_WEEKS
     * 
     */
    @JsonProperty("uiWeeks")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_WEEKS")
    private Double uiWeeks;
    /**
     * Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsPriorAfterInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND")
    private String tsPriorAfterInd;
    /**
     * ROE Period Type
     * <p>
     * Lineage reference object : PTRPICT_ROE_PERIOD_TYPE
     * 
     */
    @JsonProperty("roePeriodType")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_ROE_PERIOD_TYPE")
    private String roePeriodType;
    /**
     * UI Maximum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MAX_EARNINGS
     * 
     */
    @JsonProperty("uiMaxEarnings")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_MAX_EARNINGS")
    private Double uiMaxEarnings;
    /**
     * Bank
     * <p>
     * Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsAprCutoffDays")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS")
    private Double tsAprCutoffDays;
    /**
     * Employee End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsCutoffDays")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_CUTOFF_DAYS")
    private Double tsCutoffDays;
    /**
     * Tax Factor
     * <p>
     * Lineage reference object : PTRPICT_TAX_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("taxFactor")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TAX_FACTOR")
    private Double taxFactor;
    /**
     * UI Minimum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_EARNINGS
     * 
     */
    @JsonProperty("uiMinEarnings")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_MIN_EARNINGS")
    private Double uiMinEarnings;
    /**
     * Can Request Leave in Advance
     * <p>
     * Lineage reference object : PTRPICT_TS_LEAVE_REQUESTS
     * 
     */
    @JsonProperty("tsLeaveRequests")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_LEAVE_REQUESTS")
    private Double tsLeaveRequests;
    /**
     * Access Pay Period Reports on Web for
     * <p>
     * Lineage reference object : PTRPICT_TS_WEB_VIEW_MONTHS
     * 
     */
    @JsonProperty("tsWebViewMonths")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_WEB_VIEW_MONTHS")
    private Double tsWebViewMonths;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAmPmInd")
    private String tsAmPmInd;
    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : PTRPICT_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("paysPerYear")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_PAYS_PER_YEAR")
    private Double paysPerYear;
    /**
     * Check Issued
     * <p>
     * Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedDays")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS")
    private Double checkIssuedDays;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAprAmPmInd")
    private String tsAprAmPmInd;
    /**
     * Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsAprPriorAfterInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND")
    private String tsAprPriorAfterInd;
    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CHECK_ISSUED_IND")
    private String checkIssuedInd;
    /**
     * UI Minimum Hours
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_HOURS
     * 
     */
    @JsonProperty("uiMinHours")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_MIN_HOURS")
    private Double uiMinHours;
    /**
     * Lineage reference object : PTRPICT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PayrollIdentificationCodeRule100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("pictBankName")
    public String getPictBankName() {
        return pictBankName;
    }

    @JsonProperty("pictBankName")
    public void setPictBankName(String pictBankName) {
        this.pictBankName = pictBankName;
    }

    public PayrollIdentificationCodeRule100GetResponse withPictBankName(String pictBankName) {
        this.pictBankName = pictBankName;
        return this;
    }

    /**
     * Supplemental Pay
     * <p>
     * Lineage reference object : PTRPICT_SUPP_PAY_IND
     * 
     */
    @JsonProperty("suppPayInd")
    public String getSuppPayInd() {
        return suppPayInd;
    }

    /**
     * Supplemental Pay
     * <p>
     * Lineage reference object : PTRPICT_SUPP_PAY_IND
     * 
     */
    @JsonProperty("suppPayInd")
    public void setSuppPayInd(String suppPayInd) {
        this.suppPayInd = suppPayInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withSuppPayInd(String suppPayInd) {
        this.suppPayInd = suppPayInd;
        return this;
    }

    /**
     * Original Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE_ORIG
     * 
     */
    @JsonProperty("codeOrig")
    public String getCodeOrig() {
        return codeOrig;
    }

    /**
     * Original Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE_ORIG
     * 
     */
    @JsonProperty("codeOrig")
    public void setCodeOrig(String codeOrig) {
        this.codeOrig = codeOrig;
    }

    public PayrollIdentificationCodeRule100GetResponse withCodeOrig(String codeOrig) {
        this.codeOrig = codeOrig;
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

    public PayrollIdentificationCodeRule100GetResponse withTsAprCutoffTime(String tsAprCutoffTime) {
        this.tsAprCutoffTime = tsAprCutoffTime;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRPICT_ACTIVITY_DATE
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
     * Lineage reference object : PTRPICT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PayrollIdentificationCodeRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Employee End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsCutoffTime")
    public String getTsCutoffTime() {
        return tsCutoffTime;
    }

    /**
     * Employee End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsCutoffTime")
    public void setTsCutoffTime(String tsCutoffTime) {
        this.tsCutoffTime = tsCutoffTime;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsCutoffTime(String tsCutoffTime) {
        this.tsCutoffTime = tsCutoffTime;
        return this;
    }

    /**
     * UI Weeks
     * <p>
     * Lineage reference object : PTRPICT_UI_WEEKS
     * 
     */
    @JsonProperty("uiWeeks")
    public Double getUiWeeks() {
        return uiWeeks;
    }

    /**
     * UI Weeks
     * <p>
     * Lineage reference object : PTRPICT_UI_WEEKS
     * 
     */
    @JsonProperty("uiWeeks")
    public void setUiWeeks(Double uiWeeks) {
        this.uiWeeks = uiWeeks;
    }

    public PayrollIdentificationCodeRule100GetResponse withUiWeeks(Double uiWeeks) {
        this.uiWeeks = uiWeeks;
        return this;
    }

    /**
     * Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsPriorAfterInd")
    public String getTsPriorAfterInd() {
        return tsPriorAfterInd;
    }

    /**
     * Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsPriorAfterInd")
    public void setTsPriorAfterInd(String tsPriorAfterInd) {
        this.tsPriorAfterInd = tsPriorAfterInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsPriorAfterInd(String tsPriorAfterInd) {
        this.tsPriorAfterInd = tsPriorAfterInd;
        return this;
    }

    /**
     * ROE Period Type
     * <p>
     * Lineage reference object : PTRPICT_ROE_PERIOD_TYPE
     * 
     */
    @JsonProperty("roePeriodType")
    public String getRoePeriodType() {
        return roePeriodType;
    }

    /**
     * ROE Period Type
     * <p>
     * Lineage reference object : PTRPICT_ROE_PERIOD_TYPE
     * 
     */
    @JsonProperty("roePeriodType")
    public void setRoePeriodType(String roePeriodType) {
        this.roePeriodType = roePeriodType;
    }

    public PayrollIdentificationCodeRule100GetResponse withRoePeriodType(String roePeriodType) {
        this.roePeriodType = roePeriodType;
        return this;
    }

    /**
     * UI Maximum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MAX_EARNINGS
     * 
     */
    @JsonProperty("uiMaxEarnings")
    public Double getUiMaxEarnings() {
        return uiMaxEarnings;
    }

    /**
     * UI Maximum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MAX_EARNINGS
     * 
     */
    @JsonProperty("uiMaxEarnings")
    public void setUiMaxEarnings(Double uiMaxEarnings) {
        this.uiMaxEarnings = uiMaxEarnings;
    }

    public PayrollIdentificationCodeRule100GetResponse withUiMaxEarnings(Double uiMaxEarnings) {
        this.uiMaxEarnings = uiMaxEarnings;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public PayrollIdentificationCodeRule100GetResponse withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsAprCutoffDays")
    public Double getTsAprCutoffDays() {
        return tsAprCutoffDays;
    }

    /**
     * Approver End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsAprCutoffDays")
    public void setTsAprCutoffDays(Double tsAprCutoffDays) {
        this.tsAprCutoffDays = tsAprCutoffDays;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsAprCutoffDays(Double tsAprCutoffDays) {
        this.tsAprCutoffDays = tsAprCutoffDays;
        return this;
    }

    /**
     * Employee End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsCutoffDays")
    public Double getTsCutoffDays() {
        return tsCutoffDays;
    }

    /**
     * Employee End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsCutoffDays")
    public void setTsCutoffDays(Double tsCutoffDays) {
        this.tsCutoffDays = tsCutoffDays;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsCutoffDays(Double tsCutoffDays) {
        this.tsCutoffDays = tsCutoffDays;
        return this;
    }

    /**
     * Tax Factor
     * <p>
     * Lineage reference object : PTRPICT_TAX_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("taxFactor")
    public Double getTaxFactor() {
        return taxFactor;
    }

    /**
     * Tax Factor
     * <p>
     * Lineage reference object : PTRPICT_TAX_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("taxFactor")
    public void setTaxFactor(Double taxFactor) {
        this.taxFactor = taxFactor;
    }

    public PayrollIdentificationCodeRule100GetResponse withTaxFactor(Double taxFactor) {
        this.taxFactor = taxFactor;
        return this;
    }

    /**
     * UI Minimum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_EARNINGS
     * 
     */
    @JsonProperty("uiMinEarnings")
    public Double getUiMinEarnings() {
        return uiMinEarnings;
    }

    /**
     * UI Minimum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_EARNINGS
     * 
     */
    @JsonProperty("uiMinEarnings")
    public void setUiMinEarnings(Double uiMinEarnings) {
        this.uiMinEarnings = uiMinEarnings;
    }

    public PayrollIdentificationCodeRule100GetResponse withUiMinEarnings(Double uiMinEarnings) {
        this.uiMinEarnings = uiMinEarnings;
        return this;
    }

    /**
     * Can Request Leave in Advance
     * <p>
     * Lineage reference object : PTRPICT_TS_LEAVE_REQUESTS
     * 
     */
    @JsonProperty("tsLeaveRequests")
    public Double getTsLeaveRequests() {
        return tsLeaveRequests;
    }

    /**
     * Can Request Leave in Advance
     * <p>
     * Lineage reference object : PTRPICT_TS_LEAVE_REQUESTS
     * 
     */
    @JsonProperty("tsLeaveRequests")
    public void setTsLeaveRequests(Double tsLeaveRequests) {
        this.tsLeaveRequests = tsLeaveRequests;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsLeaveRequests(Double tsLeaveRequests) {
        this.tsLeaveRequests = tsLeaveRequests;
        return this;
    }

    /**
     * Access Pay Period Reports on Web for
     * <p>
     * Lineage reference object : PTRPICT_TS_WEB_VIEW_MONTHS
     * 
     */
    @JsonProperty("tsWebViewMonths")
    public Double getTsWebViewMonths() {
        return tsWebViewMonths;
    }

    /**
     * Access Pay Period Reports on Web for
     * <p>
     * Lineage reference object : PTRPICT_TS_WEB_VIEW_MONTHS
     * 
     */
    @JsonProperty("tsWebViewMonths")
    public void setTsWebViewMonths(Double tsWebViewMonths) {
        this.tsWebViewMonths = tsWebViewMonths;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsWebViewMonths(Double tsWebViewMonths) {
        this.tsWebViewMonths = tsWebViewMonths;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAmPmInd")
    public String getTsAmPmInd() {
        return tsAmPmInd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAmPmInd")
    public void setTsAmPmInd(String tsAmPmInd) {
        this.tsAmPmInd = tsAmPmInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsAmPmInd(String tsAmPmInd) {
        this.tsAmPmInd = tsAmPmInd;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : PTRPICT_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("paysPerYear")
    public Double getPaysPerYear() {
        return paysPerYear;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : PTRPICT_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("paysPerYear")
    public void setPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
    }

    public PayrollIdentificationCodeRule100GetResponse withPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
        return this;
    }

    /**
     * Check Issued
     * <p>
     * Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedDays")
    public Double getCheckIssuedDays() {
        return checkIssuedDays;
    }

    /**
     * Check Issued
     * <p>
     * Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedDays")
    public void setCheckIssuedDays(Double checkIssuedDays) {
        this.checkIssuedDays = checkIssuedDays;
    }

    public PayrollIdentificationCodeRule100GetResponse withCheckIssuedDays(Double checkIssuedDays) {
        this.checkIssuedDays = checkIssuedDays;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAprAmPmInd")
    public String getTsAprAmPmInd() {
        return tsAprAmPmInd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tsAprAmPmInd")
    public void setTsAprAmPmInd(String tsAprAmPmInd) {
        this.tsAprAmPmInd = tsAprAmPmInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsAprAmPmInd(String tsAprAmPmInd) {
        this.tsAprAmPmInd = tsAprAmPmInd;
        return this;
    }

    /**
     * Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsAprPriorAfterInd")
    public String getTsAprPriorAfterInd() {
        return tsAprPriorAfterInd;
    }

    /**
     * Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsAprPriorAfterInd")
    public void setTsAprPriorAfterInd(String tsAprPriorAfterInd) {
        this.tsAprPriorAfterInd = tsAprPriorAfterInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withTsAprPriorAfterInd(String tsAprPriorAfterInd) {
        this.tsAprPriorAfterInd = tsAprPriorAfterInd;
        return this;
    }

    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedInd")
    public String getCheckIssuedInd() {
        return checkIssuedInd;
    }

    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * (Required)
     * 
     */
    @JsonProperty("checkIssuedInd")
    public void setCheckIssuedInd(String checkIssuedInd) {
        this.checkIssuedInd = checkIssuedInd;
    }

    public PayrollIdentificationCodeRule100GetResponse withCheckIssuedInd(String checkIssuedInd) {
        this.checkIssuedInd = checkIssuedInd;
        return this;
    }

    /**
     * UI Minimum Hours
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_HOURS
     * 
     */
    @JsonProperty("uiMinHours")
    public Double getUiMinHours() {
        return uiMinHours;
    }

    /**
     * UI Minimum Hours
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_HOURS
     * 
     */
    @JsonProperty("uiMinHours")
    public void setUiMinHours(Double uiMinHours) {
        this.uiMinHours = uiMinHours;
    }

    public PayrollIdentificationCodeRule100GetResponse withUiMinHours(Double uiMinHours) {
        this.uiMinHours = uiMinHours;
        return this;
    }

    /**
     * Lineage reference object : PTRPICT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Lineage reference object : PTRPICT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PayrollIdentificationCodeRule100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public PayrollIdentificationCodeRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollIdentificationCodeRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("pictBankName");
        sb.append('=');
        sb.append(((this.pictBankName == null)?"<null>":this.pictBankName));
        sb.append(',');
        sb.append("suppPayInd");
        sb.append('=');
        sb.append(((this.suppPayInd == null)?"<null>":this.suppPayInd));
        sb.append(',');
        sb.append("codeOrig");
        sb.append('=');
        sb.append(((this.codeOrig == null)?"<null>":this.codeOrig));
        sb.append(',');
        sb.append("tsAprCutoffTime");
        sb.append('=');
        sb.append(((this.tsAprCutoffTime == null)?"<null>":this.tsAprCutoffTime));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("tsCutoffTime");
        sb.append('=');
        sb.append(((this.tsCutoffTime == null)?"<null>":this.tsCutoffTime));
        sb.append(',');
        sb.append("uiWeeks");
        sb.append('=');
        sb.append(((this.uiWeeks == null)?"<null>":this.uiWeeks));
        sb.append(',');
        sb.append("tsPriorAfterInd");
        sb.append('=');
        sb.append(((this.tsPriorAfterInd == null)?"<null>":this.tsPriorAfterInd));
        sb.append(',');
        sb.append("roePeriodType");
        sb.append('=');
        sb.append(((this.roePeriodType == null)?"<null>":this.roePeriodType));
        sb.append(',');
        sb.append("uiMaxEarnings");
        sb.append('=');
        sb.append(((this.uiMaxEarnings == null)?"<null>":this.uiMaxEarnings));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("tsAprCutoffDays");
        sb.append('=');
        sb.append(((this.tsAprCutoffDays == null)?"<null>":this.tsAprCutoffDays));
        sb.append(',');
        sb.append("tsCutoffDays");
        sb.append('=');
        sb.append(((this.tsCutoffDays == null)?"<null>":this.tsCutoffDays));
        sb.append(',');
        sb.append("taxFactor");
        sb.append('=');
        sb.append(((this.taxFactor == null)?"<null>":this.taxFactor));
        sb.append(',');
        sb.append("uiMinEarnings");
        sb.append('=');
        sb.append(((this.uiMinEarnings == null)?"<null>":this.uiMinEarnings));
        sb.append(',');
        sb.append("tsLeaveRequests");
        sb.append('=');
        sb.append(((this.tsLeaveRequests == null)?"<null>":this.tsLeaveRequests));
        sb.append(',');
        sb.append("tsWebViewMonths");
        sb.append('=');
        sb.append(((this.tsWebViewMonths == null)?"<null>":this.tsWebViewMonths));
        sb.append(',');
        sb.append("tsAmPmInd");
        sb.append('=');
        sb.append(((this.tsAmPmInd == null)?"<null>":this.tsAmPmInd));
        sb.append(',');
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
        sb.append(',');
        sb.append("checkIssuedDays");
        sb.append('=');
        sb.append(((this.checkIssuedDays == null)?"<null>":this.checkIssuedDays));
        sb.append(',');
        sb.append("tsAprAmPmInd");
        sb.append('=');
        sb.append(((this.tsAprAmPmInd == null)?"<null>":this.tsAprAmPmInd));
        sb.append(',');
        sb.append("tsAprPriorAfterInd");
        sb.append('=');
        sb.append(((this.tsAprPriorAfterInd == null)?"<null>":this.tsAprPriorAfterInd));
        sb.append(',');
        sb.append("checkIssuedInd");
        sb.append('=');
        sb.append(((this.checkIssuedInd == null)?"<null>":this.checkIssuedInd));
        sb.append(',');
        sb.append("uiMinHours");
        sb.append('=');
        sb.append(((this.uiMinHours == null)?"<null>":this.uiMinHours));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.pictBankName == null)? 0 :this.pictBankName.hashCode()));
        result = ((result* 31)+((this.suppPayInd == null)? 0 :this.suppPayInd.hashCode()));
        result = ((result* 31)+((this.codeOrig == null)? 0 :this.codeOrig.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffTime == null)? 0 :this.tsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.tsCutoffTime == null)? 0 :this.tsCutoffTime.hashCode()));
        result = ((result* 31)+((this.uiWeeks == null)? 0 :this.uiWeeks.hashCode()));
        result = ((result* 31)+((this.tsPriorAfterInd == null)? 0 :this.tsPriorAfterInd.hashCode()));
        result = ((result* 31)+((this.roePeriodType == null)? 0 :this.roePeriodType.hashCode()));
        result = ((result* 31)+((this.uiMaxEarnings == null)? 0 :this.uiMaxEarnings.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffDays == null)? 0 :this.tsAprCutoffDays.hashCode()));
        result = ((result* 31)+((this.tsCutoffDays == null)? 0 :this.tsCutoffDays.hashCode()));
        result = ((result* 31)+((this.taxFactor == null)? 0 :this.taxFactor.hashCode()));
        result = ((result* 31)+((this.uiMinEarnings == null)? 0 :this.uiMinEarnings.hashCode()));
        result = ((result* 31)+((this.tsLeaveRequests == null)? 0 :this.tsLeaveRequests.hashCode()));
        result = ((result* 31)+((this.tsWebViewMonths == null)? 0 :this.tsWebViewMonths.hashCode()));
        result = ((result* 31)+((this.tsAmPmInd == null)? 0 :this.tsAmPmInd.hashCode()));
        result = ((result* 31)+((this.paysPerYear == null)? 0 :this.paysPerYear.hashCode()));
        result = ((result* 31)+((this.checkIssuedDays == null)? 0 :this.checkIssuedDays.hashCode()));
        result = ((result* 31)+((this.tsAprAmPmInd == null)? 0 :this.tsAprAmPmInd.hashCode()));
        result = ((result* 31)+((this.tsAprPriorAfterInd == null)? 0 :this.tsAprPriorAfterInd.hashCode()));
        result = ((result* 31)+((this.checkIssuedInd == null)? 0 :this.checkIssuedInd.hashCode()));
        result = ((result* 31)+((this.uiMinHours == null)? 0 :this.uiMinHours.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollIdentificationCodeRule100GetResponse) == false) {
            return false;
        }
        PayrollIdentificationCodeRule100GetResponse rhs = ((PayrollIdentificationCodeRule100GetResponse) other);
        return ((((((((((((((((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.pictBankName == rhs.pictBankName)||((this.pictBankName!= null)&&this.pictBankName.equals(rhs.pictBankName))))&&((this.suppPayInd == rhs.suppPayInd)||((this.suppPayInd!= null)&&this.suppPayInd.equals(rhs.suppPayInd))))&&((this.codeOrig == rhs.codeOrig)||((this.codeOrig!= null)&&this.codeOrig.equals(rhs.codeOrig))))&&((this.tsAprCutoffTime == rhs.tsAprCutoffTime)||((this.tsAprCutoffTime!= null)&&this.tsAprCutoffTime.equals(rhs.tsAprCutoffTime))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.tsCutoffTime == rhs.tsCutoffTime)||((this.tsCutoffTime!= null)&&this.tsCutoffTime.equals(rhs.tsCutoffTime))))&&((this.uiWeeks == rhs.uiWeeks)||((this.uiWeeks!= null)&&this.uiWeeks.equals(rhs.uiWeeks))))&&((this.tsPriorAfterInd == rhs.tsPriorAfterInd)||((this.tsPriorAfterInd!= null)&&this.tsPriorAfterInd.equals(rhs.tsPriorAfterInd))))&&((this.roePeriodType == rhs.roePeriodType)||((this.roePeriodType!= null)&&this.roePeriodType.equals(rhs.roePeriodType))))&&((this.uiMaxEarnings == rhs.uiMaxEarnings)||((this.uiMaxEarnings!= null)&&this.uiMaxEarnings.equals(rhs.uiMaxEarnings))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.tsAprCutoffDays == rhs.tsAprCutoffDays)||((this.tsAprCutoffDays!= null)&&this.tsAprCutoffDays.equals(rhs.tsAprCutoffDays))))&&((this.tsCutoffDays == rhs.tsCutoffDays)||((this.tsCutoffDays!= null)&&this.tsCutoffDays.equals(rhs.tsCutoffDays))))&&((this.taxFactor == rhs.taxFactor)||((this.taxFactor!= null)&&this.taxFactor.equals(rhs.taxFactor))))&&((this.uiMinEarnings == rhs.uiMinEarnings)||((this.uiMinEarnings!= null)&&this.uiMinEarnings.equals(rhs.uiMinEarnings))))&&((this.tsLeaveRequests == rhs.tsLeaveRequests)||((this.tsLeaveRequests!= null)&&this.tsLeaveRequests.equals(rhs.tsLeaveRequests))))&&((this.tsWebViewMonths == rhs.tsWebViewMonths)||((this.tsWebViewMonths!= null)&&this.tsWebViewMonths.equals(rhs.tsWebViewMonths))))&&((this.tsAmPmInd == rhs.tsAmPmInd)||((this.tsAmPmInd!= null)&&this.tsAmPmInd.equals(rhs.tsAmPmInd))))&&((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear))))&&((this.checkIssuedDays == rhs.checkIssuedDays)||((this.checkIssuedDays!= null)&&this.checkIssuedDays.equals(rhs.checkIssuedDays))))&&((this.tsAprAmPmInd == rhs.tsAprAmPmInd)||((this.tsAprAmPmInd!= null)&&this.tsAprAmPmInd.equals(rhs.tsAprAmPmInd))))&&((this.tsAprPriorAfterInd == rhs.tsAprPriorAfterInd)||((this.tsAprPriorAfterInd!= null)&&this.tsAprPriorAfterInd.equals(rhs.tsAprPriorAfterInd))))&&((this.checkIssuedInd == rhs.checkIssuedInd)||((this.checkIssuedInd!= null)&&this.checkIssuedInd.equals(rhs.checkIssuedInd))))&&((this.uiMinHours == rhs.uiMinHours)||((this.uiMinHours!= null)&&this.uiMinHours.equals(rhs.uiMinHours))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
