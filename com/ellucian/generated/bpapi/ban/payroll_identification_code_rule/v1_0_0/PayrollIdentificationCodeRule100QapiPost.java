
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
    "checkIssuedDays",
    "checkIssuedInd",
    "paysPerYear",
    "suppPayInd",
    "taxFactor",
    "codeOrig",
    "bankCode",
    "roePeriodType",
    "uiMaxEarnings",
    "uiMinHours",
    "uiWeeks",
    "uiMinEarnings",
    "tsCutoffDays",
    "tsPriorAfterInd",
    "ptrpictTsAprCutoffTime",
    "tsAprCutoffTime",
    "ptrpictTsCutoffTime",
    "tsCutoffTime",
    "tsWebViewMonths",
    "tsAprCutoffDays",
    "tsAprPriorAfterInd",
    "tsLeaveRequests",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class PayrollIdentificationCodeRule100QapiPost {

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CODE")
    private String code;
    /**
     * Check Issued
     * <p>
     * Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS
     * 
     */
    @JsonProperty("checkIssuedDays")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS")
    private Double checkIssuedDays;
    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * 
     */
    @JsonProperty("checkIssuedInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_CHECK_ISSUED_IND")
    private String checkIssuedInd;
    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : PTRPICT_PAYS_PER_YEAR
     * 
     */
    @JsonProperty("paysPerYear")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_PAYS_PER_YEAR")
    private Double paysPerYear;
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
     * Tax Factor
     * <p>
     * Lineage reference object : PTRPICT_TAX_FACTOR
     * 
     */
    @JsonProperty("taxFactor")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TAX_FACTOR")
    private Double taxFactor;
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
     * Bank
     * <p>
     * Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
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
     * UI Minimum Hours
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_HOURS
     * 
     */
    @JsonProperty("uiMinHours")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_MIN_HOURS")
    private Double uiMinHours;
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
     * UI Minimum Earnings
     * <p>
     * Lineage reference object : PTRPICT_UI_MIN_EARNINGS
     * 
     */
    @JsonProperty("uiMinEarnings")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_UI_MIN_EARNINGS")
    private Double uiMinEarnings;
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
     * Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsPriorAfterInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_PRIOR_AFTER_IND")
    private String tsPriorAfterInd;
    @JsonProperty("ptrpictTsAprCutoffTime")
    private String ptrpictTsAprCutoffTime;
    /**
     * Approver End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsAprCutoffTime")
    private String tsAprCutoffTime;
    @JsonProperty("ptrpictTsCutoffTime")
    private String ptrpictTsCutoffTime;
    /**
     * Employee End Time
     * <p>
     * 
     * 
     */
    @JsonProperty("tsCutoffTime")
    private String tsCutoffTime;
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
     * Approver End Date
     * <p>
     * Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS
     * 
     */
    @JsonProperty("tsAprCutoffDays")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_APR_CUTOFF_DAYS")
    private Double tsAprCutoffDays;
    /**
     * Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND
     * 
     */
    @JsonProperty("tsAprPriorAfterInd")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_TS_APR_PRIOR_AFTER_IND")
    private String tsAprPriorAfterInd;
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
     * Activity Date
     * <p>
     * Lineage reference object : PTRPICT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRPICT_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRPICT_CODE
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
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PayrollIdentificationCodeRule100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Check Issued
     * <p>
     * Lineage reference object : PTRPICT_CHECK_ISSUED_DAYS
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
     * 
     */
    @JsonProperty("checkIssuedDays")
    public void setCheckIssuedDays(Double checkIssuedDays) {
        this.checkIssuedDays = checkIssuedDays;
    }

    public PayrollIdentificationCodeRule100QapiPost withCheckIssuedDays(Double checkIssuedDays) {
        this.checkIssuedDays = checkIssuedDays;
        return this;
    }

    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * 
     */
    @JsonProperty("checkIssuedInd")
    public String getCheckIssuedInd() {
        return checkIssuedInd;
    }

    /**
     * Lineage reference object : PTRPICT_CHECK_ISSUED_IND
     * 
     */
    @JsonProperty("checkIssuedInd")
    public void setCheckIssuedInd(String checkIssuedInd) {
        this.checkIssuedInd = checkIssuedInd;
    }

    public PayrollIdentificationCodeRule100QapiPost withCheckIssuedInd(String checkIssuedInd) {
        this.checkIssuedInd = checkIssuedInd;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : PTRPICT_PAYS_PER_YEAR
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
     * 
     */
    @JsonProperty("paysPerYear")
    public void setPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
    }

    public PayrollIdentificationCodeRule100QapiPost withPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
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

    public PayrollIdentificationCodeRule100QapiPost withSuppPayInd(String suppPayInd) {
        this.suppPayInd = suppPayInd;
        return this;
    }

    /**
     * Tax Factor
     * <p>
     * Lineage reference object : PTRPICT_TAX_FACTOR
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
     * 
     */
    @JsonProperty("taxFactor")
    public void setTaxFactor(Double taxFactor) {
        this.taxFactor = taxFactor;
    }

    public PayrollIdentificationCodeRule100QapiPost withTaxFactor(Double taxFactor) {
        this.taxFactor = taxFactor;
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

    public PayrollIdentificationCodeRule100QapiPost withCodeOrig(String codeOrig) {
        this.codeOrig = codeOrig;
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

    public PayrollIdentificationCodeRule100QapiPost withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public PayrollIdentificationCodeRule100QapiPost withRoePeriodType(String roePeriodType) {
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

    public PayrollIdentificationCodeRule100QapiPost withUiMaxEarnings(Double uiMaxEarnings) {
        this.uiMaxEarnings = uiMaxEarnings;
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

    public PayrollIdentificationCodeRule100QapiPost withUiMinHours(Double uiMinHours) {
        this.uiMinHours = uiMinHours;
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

    public PayrollIdentificationCodeRule100QapiPost withUiWeeks(Double uiWeeks) {
        this.uiWeeks = uiWeeks;
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

    public PayrollIdentificationCodeRule100QapiPost withUiMinEarnings(Double uiMinEarnings) {
        this.uiMinEarnings = uiMinEarnings;
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

    public PayrollIdentificationCodeRule100QapiPost withTsCutoffDays(Double tsCutoffDays) {
        this.tsCutoffDays = tsCutoffDays;
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

    public PayrollIdentificationCodeRule100QapiPost withTsPriorAfterInd(String tsPriorAfterInd) {
        this.tsPriorAfterInd = tsPriorAfterInd;
        return this;
    }

    @JsonProperty("ptrpictTsAprCutoffTime")
    public String getPtrpictTsAprCutoffTime() {
        return ptrpictTsAprCutoffTime;
    }

    @JsonProperty("ptrpictTsAprCutoffTime")
    public void setPtrpictTsAprCutoffTime(String ptrpictTsAprCutoffTime) {
        this.ptrpictTsAprCutoffTime = ptrpictTsAprCutoffTime;
    }

    public PayrollIdentificationCodeRule100QapiPost withPtrpictTsAprCutoffTime(String ptrpictTsAprCutoffTime) {
        this.ptrpictTsAprCutoffTime = ptrpictTsAprCutoffTime;
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

    public PayrollIdentificationCodeRule100QapiPost withTsAprCutoffTime(String tsAprCutoffTime) {
        this.tsAprCutoffTime = tsAprCutoffTime;
        return this;
    }

    @JsonProperty("ptrpictTsCutoffTime")
    public String getPtrpictTsCutoffTime() {
        return ptrpictTsCutoffTime;
    }

    @JsonProperty("ptrpictTsCutoffTime")
    public void setPtrpictTsCutoffTime(String ptrpictTsCutoffTime) {
        this.ptrpictTsCutoffTime = ptrpictTsCutoffTime;
    }

    public PayrollIdentificationCodeRule100QapiPost withPtrpictTsCutoffTime(String ptrpictTsCutoffTime) {
        this.ptrpictTsCutoffTime = ptrpictTsCutoffTime;
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

    public PayrollIdentificationCodeRule100QapiPost withTsCutoffTime(String tsCutoffTime) {
        this.tsCutoffTime = tsCutoffTime;
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

    public PayrollIdentificationCodeRule100QapiPost withTsWebViewMonths(Double tsWebViewMonths) {
        this.tsWebViewMonths = tsWebViewMonths;
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

    public PayrollIdentificationCodeRule100QapiPost withTsAprCutoffDays(Double tsAprCutoffDays) {
        this.tsAprCutoffDays = tsAprCutoffDays;
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

    public PayrollIdentificationCodeRule100QapiPost withTsAprPriorAfterInd(String tsAprPriorAfterInd) {
        this.tsAprPriorAfterInd = tsAprPriorAfterInd;
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

    public PayrollIdentificationCodeRule100QapiPost withTsLeaveRequests(Double tsLeaveRequests) {
        this.tsLeaveRequests = tsLeaveRequests;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRPICT_ACTIVITY_DATE
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
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PayrollIdentificationCodeRule100QapiPost withActivityDate(Date activityDate) {
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

    public PayrollIdentificationCodeRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollIdentificationCodeRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("checkIssuedDays");
        sb.append('=');
        sb.append(((this.checkIssuedDays == null)?"<null>":this.checkIssuedDays));
        sb.append(',');
        sb.append("checkIssuedInd");
        sb.append('=');
        sb.append(((this.checkIssuedInd == null)?"<null>":this.checkIssuedInd));
        sb.append(',');
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
        sb.append(',');
        sb.append("suppPayInd");
        sb.append('=');
        sb.append(((this.suppPayInd == null)?"<null>":this.suppPayInd));
        sb.append(',');
        sb.append("taxFactor");
        sb.append('=');
        sb.append(((this.taxFactor == null)?"<null>":this.taxFactor));
        sb.append(',');
        sb.append("codeOrig");
        sb.append('=');
        sb.append(((this.codeOrig == null)?"<null>":this.codeOrig));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("roePeriodType");
        sb.append('=');
        sb.append(((this.roePeriodType == null)?"<null>":this.roePeriodType));
        sb.append(',');
        sb.append("uiMaxEarnings");
        sb.append('=');
        sb.append(((this.uiMaxEarnings == null)?"<null>":this.uiMaxEarnings));
        sb.append(',');
        sb.append("uiMinHours");
        sb.append('=');
        sb.append(((this.uiMinHours == null)?"<null>":this.uiMinHours));
        sb.append(',');
        sb.append("uiWeeks");
        sb.append('=');
        sb.append(((this.uiWeeks == null)?"<null>":this.uiWeeks));
        sb.append(',');
        sb.append("uiMinEarnings");
        sb.append('=');
        sb.append(((this.uiMinEarnings == null)?"<null>":this.uiMinEarnings));
        sb.append(',');
        sb.append("tsCutoffDays");
        sb.append('=');
        sb.append(((this.tsCutoffDays == null)?"<null>":this.tsCutoffDays));
        sb.append(',');
        sb.append("tsPriorAfterInd");
        sb.append('=');
        sb.append(((this.tsPriorAfterInd == null)?"<null>":this.tsPriorAfterInd));
        sb.append(',');
        sb.append("ptrpictTsAprCutoffTime");
        sb.append('=');
        sb.append(((this.ptrpictTsAprCutoffTime == null)?"<null>":this.ptrpictTsAprCutoffTime));
        sb.append(',');
        sb.append("tsAprCutoffTime");
        sb.append('=');
        sb.append(((this.tsAprCutoffTime == null)?"<null>":this.tsAprCutoffTime));
        sb.append(',');
        sb.append("ptrpictTsCutoffTime");
        sb.append('=');
        sb.append(((this.ptrpictTsCutoffTime == null)?"<null>":this.ptrpictTsCutoffTime));
        sb.append(',');
        sb.append("tsCutoffTime");
        sb.append('=');
        sb.append(((this.tsCutoffTime == null)?"<null>":this.tsCutoffTime));
        sb.append(',');
        sb.append("tsWebViewMonths");
        sb.append('=');
        sb.append(((this.tsWebViewMonths == null)?"<null>":this.tsWebViewMonths));
        sb.append(',');
        sb.append("tsAprCutoffDays");
        sb.append('=');
        sb.append(((this.tsAprCutoffDays == null)?"<null>":this.tsAprCutoffDays));
        sb.append(',');
        sb.append("tsAprPriorAfterInd");
        sb.append('=');
        sb.append(((this.tsAprPriorAfterInd == null)?"<null>":this.tsAprPriorAfterInd));
        sb.append(',');
        sb.append("tsLeaveRequests");
        sb.append('=');
        sb.append(((this.tsLeaveRequests == null)?"<null>":this.tsLeaveRequests));
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
        result = ((result* 31)+((this.ptrpictTsCutoffTime == null)? 0 :this.ptrpictTsCutoffTime.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.suppPayInd == null)? 0 :this.suppPayInd.hashCode()));
        result = ((result* 31)+((this.codeOrig == null)? 0 :this.codeOrig.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffTime == null)? 0 :this.tsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.tsCutoffTime == null)? 0 :this.tsCutoffTime.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.uiWeeks == null)? 0 :this.uiWeeks.hashCode()));
        result = ((result* 31)+((this.tsPriorAfterInd == null)? 0 :this.tsPriorAfterInd.hashCode()));
        result = ((result* 31)+((this.ptrpictTsAprCutoffTime == null)? 0 :this.ptrpictTsAprCutoffTime.hashCode()));
        result = ((result* 31)+((this.roePeriodType == null)? 0 :this.roePeriodType.hashCode()));
        result = ((result* 31)+((this.uiMaxEarnings == null)? 0 :this.uiMaxEarnings.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.tsCutoffDays == null)? 0 :this.tsCutoffDays.hashCode()));
        result = ((result* 31)+((this.tsAprCutoffDays == null)? 0 :this.tsAprCutoffDays.hashCode()));
        result = ((result* 31)+((this.taxFactor == null)? 0 :this.taxFactor.hashCode()));
        result = ((result* 31)+((this.uiMinEarnings == null)? 0 :this.uiMinEarnings.hashCode()));
        result = ((result* 31)+((this.tsLeaveRequests == null)? 0 :this.tsLeaveRequests.hashCode()));
        result = ((result* 31)+((this.tsWebViewMonths == null)? 0 :this.tsWebViewMonths.hashCode()));
        result = ((result* 31)+((this.paysPerYear == null)? 0 :this.paysPerYear.hashCode()));
        result = ((result* 31)+((this.checkIssuedDays == null)? 0 :this.checkIssuedDays.hashCode()));
        result = ((result* 31)+((this.tsAprPriorAfterInd == null)? 0 :this.tsAprPriorAfterInd.hashCode()));
        result = ((result* 31)+((this.checkIssuedInd == null)? 0 :this.checkIssuedInd.hashCode()));
        result = ((result* 31)+((this.uiMinHours == null)? 0 :this.uiMinHours.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollIdentificationCodeRule100QapiPost) == false) {
            return false;
        }
        PayrollIdentificationCodeRule100QapiPost rhs = ((PayrollIdentificationCodeRule100QapiPost) other);
        return ((((((((((((((((((((((((((this.ptrpictTsCutoffTime == rhs.ptrpictTsCutoffTime)||((this.ptrpictTsCutoffTime!= null)&&this.ptrpictTsCutoffTime.equals(rhs.ptrpictTsCutoffTime)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.suppPayInd == rhs.suppPayInd)||((this.suppPayInd!= null)&&this.suppPayInd.equals(rhs.suppPayInd))))&&((this.codeOrig == rhs.codeOrig)||((this.codeOrig!= null)&&this.codeOrig.equals(rhs.codeOrig))))&&((this.tsAprCutoffTime == rhs.tsAprCutoffTime)||((this.tsAprCutoffTime!= null)&&this.tsAprCutoffTime.equals(rhs.tsAprCutoffTime))))&&((this.tsCutoffTime == rhs.tsCutoffTime)||((this.tsCutoffTime!= null)&&this.tsCutoffTime.equals(rhs.tsCutoffTime))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.uiWeeks == rhs.uiWeeks)||((this.uiWeeks!= null)&&this.uiWeeks.equals(rhs.uiWeeks))))&&((this.tsPriorAfterInd == rhs.tsPriorAfterInd)||((this.tsPriorAfterInd!= null)&&this.tsPriorAfterInd.equals(rhs.tsPriorAfterInd))))&&((this.ptrpictTsAprCutoffTime == rhs.ptrpictTsAprCutoffTime)||((this.ptrpictTsAprCutoffTime!= null)&&this.ptrpictTsAprCutoffTime.equals(rhs.ptrpictTsAprCutoffTime))))&&((this.roePeriodType == rhs.roePeriodType)||((this.roePeriodType!= null)&&this.roePeriodType.equals(rhs.roePeriodType))))&&((this.uiMaxEarnings == rhs.uiMaxEarnings)||((this.uiMaxEarnings!= null)&&this.uiMaxEarnings.equals(rhs.uiMaxEarnings))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.tsCutoffDays == rhs.tsCutoffDays)||((this.tsCutoffDays!= null)&&this.tsCutoffDays.equals(rhs.tsCutoffDays))))&&((this.tsAprCutoffDays == rhs.tsAprCutoffDays)||((this.tsAprCutoffDays!= null)&&this.tsAprCutoffDays.equals(rhs.tsAprCutoffDays))))&&((this.taxFactor == rhs.taxFactor)||((this.taxFactor!= null)&&this.taxFactor.equals(rhs.taxFactor))))&&((this.uiMinEarnings == rhs.uiMinEarnings)||((this.uiMinEarnings!= null)&&this.uiMinEarnings.equals(rhs.uiMinEarnings))))&&((this.tsLeaveRequests == rhs.tsLeaveRequests)||((this.tsLeaveRequests!= null)&&this.tsLeaveRequests.equals(rhs.tsLeaveRequests))))&&((this.tsWebViewMonths == rhs.tsWebViewMonths)||((this.tsWebViewMonths!= null)&&this.tsWebViewMonths.equals(rhs.tsWebViewMonths))))&&((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear))))&&((this.checkIssuedDays == rhs.checkIssuedDays)||((this.checkIssuedDays!= null)&&this.checkIssuedDays.equals(rhs.checkIssuedDays))))&&((this.tsAprPriorAfterInd == rhs.tsAprPriorAfterInd)||((this.tsAprPriorAfterInd!= null)&&this.tsAprPriorAfterInd.equals(rhs.tsAprPriorAfterInd))))&&((this.checkIssuedInd == rhs.checkIssuedInd)||((this.checkIssuedInd!= null)&&this.checkIssuedInd.equals(rhs.checkIssuedInd))))&&((this.uiMinHours == rhs.uiMinHours)||((this.uiMinHours!= null)&&this.uiMinHours.equals(rhs.uiMinHours))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
