
package com.ellucian.generated.bpapi.ban.earnings_code_rule.v1_0_0;

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
    "1099Code",
    "rateInd",
    "desc1099",
    "leavCodeTakenDesc",
    "taxMethodInd",
    "fmlaEligibleHrsInd",
    "leavMinimumInd",
    "multFactor",
    "leavProrationInd",
    "ecldInd",
    "leavCodeTaken",
    "flsaAmtInd",
    "ergrDesc",
    "longevityInd",
    "fmlaUsageHrsInd",
    "unitInd",
    "notDeterminedInd",
    "activityDate",
    "exceptionInd",
    "rate",
    "oshaHrsInd",
    "ecRuclDesc",
    "fringeInd",
    "leavCodeEarnedDesc",
    "webDispInd",
    "ruclCodeFrng",
    "baseSalInd",
    "ergrCode",
    "typeInd",
    "dispWebPaystubInd",
    "leavCodeEarned",
    "expendedBudInd",
    "misAddlEarnInd",
    "stipendInd",
    "specialCompInd",
    "flsaHrsInd",
    "ruclCodeFrngDesc",
    "shftDiffInd",
    "ruclCode",
    "shortDesc",
    "pensionableHrsInd",
    "longDesc",
    "cashInd"
})
@Generated("jsonschema2pojo")
public class EarningsCodeRule100GetResponse {

    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTREARN_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    @JsonPropertyDescription("Lineage reference object : PTREARN_1099_CODE, Lookup lineage reference object : ptv1099")
    private String _1099Code;
    /**
     * Lineage reference object : PTREARN_RATE_IND
     * 
     */
    @JsonProperty("rateInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_RATE_IND")
    private String rateInd;
    @JsonProperty("desc1099")
    private String desc1099;
    @JsonProperty("leavCodeTakenDesc")
    private String leavCodeTakenDesc;
    /**
     * Tax Method
     * <p>
     * Lineage reference object : PTREARN_TAX_METHOD_IND
     * (Required)
     * 
     */
    @JsonProperty("taxMethodInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_TAX_METHOD_IND")
    private String taxMethodInd;
    /**
     * FMLA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_ELIGIBLE_HRS_IND
     * 
     */
    @JsonProperty("fmlaEligibleHrsInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_FMLA_ELIGIBLE_HRS_IND")
    private String fmlaEligibleHrsInd;
    /**
     * Applicable to Leave Minimum
     * <p>
     * Lineage reference object : PTREARN_LEAV_MINIMUM_IND
     * 
     */
    @JsonProperty("leavMinimumInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LEAV_MINIMUM_IND")
    private String leavMinimumInd;
    /**
     * Multiplication Factor
     * <p>
     * Lineage reference object : PTREARN_MULT_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("multFactor")
    @JsonPropertyDescription("Lineage reference object : PTREARN_MULT_FACTOR")
    private Double multFactor;
    /**
     * Applicable to Leave Proration
     * <p>
     * Lineage reference object : PTREARN_LEAV_PRORATION_IND
     * 
     */
    @JsonProperty("leavProrationInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LEAV_PRORATION_IND")
    private String leavProrationInd;
    /**
     * Allow Labor Distribution Overrides at Time Entry
     * <p>
     * Lineage reference object : PTREARN_ECLD_IND
     * 
     */
    @JsonProperty("ecldInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_ECLD_IND")
    private String ecldInd;
    /**
     * Leave Taken Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_TAKEN
     * 
     */
    @JsonProperty("leavCodeTaken")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LEAV_CODE_TAKEN")
    private String leavCodeTaken;
    /**
     * FLSA Eligible Dollars
     * <p>
     * Lineage reference object : PTREARN_FLSA_AMT_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaAmtInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_FLSA_AMT_IND")
    private String flsaAmtInd;
    @JsonProperty("ergrDesc")
    private String ergrDesc;
    /**
     * Longevity
     * <p>
     * Lineage reference object : PTREARN_LONGEVITY_IND
     * 
     */
    @JsonProperty("longevityInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LONGEVITY_IND")
    private String longevityInd;
    /**
     * FMLA Usage Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_USAGE_HRS_IND
     * 
     */
    @JsonProperty("fmlaUsageHrsInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_FMLA_USAGE_HRS_IND")
    private String fmlaUsageHrsInd;
    /**
     * Lineage reference object : PTREARN_UNIT_IND
     * 
     */
    @JsonProperty("unitInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_UNIT_IND")
    private String unitInd;
    /**
     * Taxable Amount not Determined from Earn Code
     * <p>
     * Lineage reference object : PTREARN_NOT_DETERMINED_IND
     * 
     */
    @JsonProperty("notDeterminedInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_NOT_DETERMINED_IND")
    private String notDeterminedInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREARN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREARN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Reduce Base Salary
     * <p>
     * Lineage reference object : PTREARN_EXCEPTION_IND
     * 
     */
    @JsonProperty("exceptionInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_EXCEPTION_IND")
    private String exceptionInd;
    /**
     * Lineage reference object : PTREARN_RATE
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("Lineage reference object : PTREARN_RATE")
    private Double rate;
    /**
     * OSHA Reportable Hours
     * <p>
     * Lineage reference object : PTREARN_OSHA_HRS_IND
     * 
     */
    @JsonProperty("oshaHrsInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_OSHA_HRS_IND")
    private String oshaHrsInd;
    @JsonProperty("ecRuclDesc")
    private String ecRuclDesc;
    /**
     * Applicable to Fringe Expense
     * <p>
     * Lineage reference object : PTREARN_FRINGE_IND
     * 
     */
    @JsonProperty("fringeInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_FRINGE_IND")
    private String fringeInd;
    @JsonProperty("leavCodeEarnedDesc")
    private String leavCodeEarnedDesc;
    /**
     * Display Earnings History on Web
     * <p>
     * Lineage reference object : PTREARN_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_WEB_DISP_IND")
    private String webDispInd;
    /**
     * Fringe Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE_FRNG
     * 
     */
    @JsonProperty("ruclCodeFrng")
    @JsonPropertyDescription("Lineage reference object : PTREARN_RUCL_CODE_FRNG")
    private String ruclCodeFrng;
    /**
     * Base Salary
     * <p>
     * Lineage reference object : PTREARN_BASE_SAL_IND
     * 
     */
    @JsonProperty("baseSalInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_BASE_SAL_IND")
    private String baseSalInd;
    /**
     * Earnings Group
     * <p>
     * Lineage reference object : PTREARN_ERGR_CODE, Lookup lineage reference object : ptvergr
     * 
     */
    @JsonProperty("ergrCode")
    @JsonPropertyDescription("Lineage reference object : PTREARN_ERGR_CODE, Lookup lineage reference object : ptvergr")
    private String ergrCode;
    /**
     * Type
     * <p>
     * Lineage reference object : PTREARN_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_TYPE_IND")
    private String typeInd;
    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTREARN_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_DISP_WEB_PAYSTUB_IND")
    private String dispWebPaystubInd;
    /**
     * Leave Earned Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_EARNED
     * 
     */
    @JsonProperty("leavCodeEarned")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LEAV_CODE_EARNED")
    private String leavCodeEarned;
    /**
     * Expend Budget with Earning Value
     * <p>
     * Lineage reference object : PTREARN_EXPENDED_BUD_IND
     * 
     */
    @JsonProperty("expendedBudInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_EXPENDED_BUD_IND")
    private String expendedBudInd;
    /**
     * California MIS EB12 Earnings
     * <p>
     * Lineage reference object : PTREARN_MIS_ADDL_EARN_IND
     * 
     */
    @JsonProperty("misAddlEarnInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_MIS_ADDL_EARN_IND")
    private String misAddlEarnInd;
    /**
     * Stipend
     * <p>
     * Lineage reference object : PTREARN_STIPEND_IND
     * 
     */
    @JsonProperty("stipendInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_STIPEND_IND")
    private String stipendInd;
    /**
     * California Special Compensation
     * <p>
     * Lineage reference object : PTREARN_SPECIAL_COMP_IND
     * 
     */
    @JsonProperty("specialCompInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_SPECIAL_COMP_IND")
    private String specialCompInd;
    /**
     * FLSA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FLSA_HRS_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaHrsInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_FLSA_HRS_IND")
    private String flsaHrsInd;
    @JsonProperty("ruclCodeFrngDesc")
    private String ruclCodeFrngDesc;
    /**
     * Shift Differential
     * <p>
     * Lineage reference object : PTREARN_SHFT_DIFF_IND
     * 
     */
    @JsonProperty("shftDiffInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_SHFT_DIFF_IND")
    private String shftDiffInd;
    /**
     * Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : PTREARN_RUCL_CODE")
    private String ruclCode;
    /**
     * Short Description
     * <p>
     * Lineage reference object : PTREARN_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : PTREARN_SHORT_DESC")
    private String shortDesc;
    /**
     * Pensionable Hours
     * <p>
     * Lineage reference object : PTREARN_PENSIONABLE_HRS_IND
     * 
     */
    @JsonProperty("pensionableHrsInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_PENSIONABLE_HRS_IND")
    private String pensionableHrsInd;
    /**
     * Long Description
     * <p>
     * Lineage reference object : PTREARN_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : PTREARN_LONG_DESC")
    private String longDesc;
    /**
     * Cash
     * <p>
     * Lineage reference object : PTREARN_CASH_IND
     * 
     */
    @JsonProperty("cashInd")
    @JsonPropertyDescription("Lineage reference object : PTREARN_CASH_IND")
    private String cashInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTREARN_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    public String get1099Code() {
        return _1099Code;
    }

    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTREARN_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    public void set1099Code(String _1099Code) {
        this._1099Code = _1099Code;
    }

    public EarningsCodeRule100GetResponse with1099Code(String _1099Code) {
        this._1099Code = _1099Code;
        return this;
    }

    /**
     * Lineage reference object : PTREARN_RATE_IND
     * 
     */
    @JsonProperty("rateInd")
    public String getRateInd() {
        return rateInd;
    }

    /**
     * Lineage reference object : PTREARN_RATE_IND
     * 
     */
    @JsonProperty("rateInd")
    public void setRateInd(String rateInd) {
        this.rateInd = rateInd;
    }

    public EarningsCodeRule100GetResponse withRateInd(String rateInd) {
        this.rateInd = rateInd;
        return this;
    }

    @JsonProperty("desc1099")
    public String getDesc1099() {
        return desc1099;
    }

    @JsonProperty("desc1099")
    public void setDesc1099(String desc1099) {
        this.desc1099 = desc1099;
    }

    public EarningsCodeRule100GetResponse withDesc1099(String desc1099) {
        this.desc1099 = desc1099;
        return this;
    }

    @JsonProperty("leavCodeTakenDesc")
    public String getLeavCodeTakenDesc() {
        return leavCodeTakenDesc;
    }

    @JsonProperty("leavCodeTakenDesc")
    public void setLeavCodeTakenDesc(String leavCodeTakenDesc) {
        this.leavCodeTakenDesc = leavCodeTakenDesc;
    }

    public EarningsCodeRule100GetResponse withLeavCodeTakenDesc(String leavCodeTakenDesc) {
        this.leavCodeTakenDesc = leavCodeTakenDesc;
        return this;
    }

    /**
     * Tax Method
     * <p>
     * Lineage reference object : PTREARN_TAX_METHOD_IND
     * (Required)
     * 
     */
    @JsonProperty("taxMethodInd")
    public String getTaxMethodInd() {
        return taxMethodInd;
    }

    /**
     * Tax Method
     * <p>
     * Lineage reference object : PTREARN_TAX_METHOD_IND
     * (Required)
     * 
     */
    @JsonProperty("taxMethodInd")
    public void setTaxMethodInd(String taxMethodInd) {
        this.taxMethodInd = taxMethodInd;
    }

    public EarningsCodeRule100GetResponse withTaxMethodInd(String taxMethodInd) {
        this.taxMethodInd = taxMethodInd;
        return this;
    }

    /**
     * FMLA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_ELIGIBLE_HRS_IND
     * 
     */
    @JsonProperty("fmlaEligibleHrsInd")
    public String getFmlaEligibleHrsInd() {
        return fmlaEligibleHrsInd;
    }

    /**
     * FMLA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_ELIGIBLE_HRS_IND
     * 
     */
    @JsonProperty("fmlaEligibleHrsInd")
    public void setFmlaEligibleHrsInd(String fmlaEligibleHrsInd) {
        this.fmlaEligibleHrsInd = fmlaEligibleHrsInd;
    }

    public EarningsCodeRule100GetResponse withFmlaEligibleHrsInd(String fmlaEligibleHrsInd) {
        this.fmlaEligibleHrsInd = fmlaEligibleHrsInd;
        return this;
    }

    /**
     * Applicable to Leave Minimum
     * <p>
     * Lineage reference object : PTREARN_LEAV_MINIMUM_IND
     * 
     */
    @JsonProperty("leavMinimumInd")
    public String getLeavMinimumInd() {
        return leavMinimumInd;
    }

    /**
     * Applicable to Leave Minimum
     * <p>
     * Lineage reference object : PTREARN_LEAV_MINIMUM_IND
     * 
     */
    @JsonProperty("leavMinimumInd")
    public void setLeavMinimumInd(String leavMinimumInd) {
        this.leavMinimumInd = leavMinimumInd;
    }

    public EarningsCodeRule100GetResponse withLeavMinimumInd(String leavMinimumInd) {
        this.leavMinimumInd = leavMinimumInd;
        return this;
    }

    /**
     * Multiplication Factor
     * <p>
     * Lineage reference object : PTREARN_MULT_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("multFactor")
    public Double getMultFactor() {
        return multFactor;
    }

    /**
     * Multiplication Factor
     * <p>
     * Lineage reference object : PTREARN_MULT_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("multFactor")
    public void setMultFactor(Double multFactor) {
        this.multFactor = multFactor;
    }

    public EarningsCodeRule100GetResponse withMultFactor(Double multFactor) {
        this.multFactor = multFactor;
        return this;
    }

    /**
     * Applicable to Leave Proration
     * <p>
     * Lineage reference object : PTREARN_LEAV_PRORATION_IND
     * 
     */
    @JsonProperty("leavProrationInd")
    public String getLeavProrationInd() {
        return leavProrationInd;
    }

    /**
     * Applicable to Leave Proration
     * <p>
     * Lineage reference object : PTREARN_LEAV_PRORATION_IND
     * 
     */
    @JsonProperty("leavProrationInd")
    public void setLeavProrationInd(String leavProrationInd) {
        this.leavProrationInd = leavProrationInd;
    }

    public EarningsCodeRule100GetResponse withLeavProrationInd(String leavProrationInd) {
        this.leavProrationInd = leavProrationInd;
        return this;
    }

    /**
     * Allow Labor Distribution Overrides at Time Entry
     * <p>
     * Lineage reference object : PTREARN_ECLD_IND
     * 
     */
    @JsonProperty("ecldInd")
    public String getEcldInd() {
        return ecldInd;
    }

    /**
     * Allow Labor Distribution Overrides at Time Entry
     * <p>
     * Lineage reference object : PTREARN_ECLD_IND
     * 
     */
    @JsonProperty("ecldInd")
    public void setEcldInd(String ecldInd) {
        this.ecldInd = ecldInd;
    }

    public EarningsCodeRule100GetResponse withEcldInd(String ecldInd) {
        this.ecldInd = ecldInd;
        return this;
    }

    /**
     * Leave Taken Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_TAKEN
     * 
     */
    @JsonProperty("leavCodeTaken")
    public String getLeavCodeTaken() {
        return leavCodeTaken;
    }

    /**
     * Leave Taken Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_TAKEN
     * 
     */
    @JsonProperty("leavCodeTaken")
    public void setLeavCodeTaken(String leavCodeTaken) {
        this.leavCodeTaken = leavCodeTaken;
    }

    public EarningsCodeRule100GetResponse withLeavCodeTaken(String leavCodeTaken) {
        this.leavCodeTaken = leavCodeTaken;
        return this;
    }

    /**
     * FLSA Eligible Dollars
     * <p>
     * Lineage reference object : PTREARN_FLSA_AMT_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaAmtInd")
    public String getFlsaAmtInd() {
        return flsaAmtInd;
    }

    /**
     * FLSA Eligible Dollars
     * <p>
     * Lineage reference object : PTREARN_FLSA_AMT_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaAmtInd")
    public void setFlsaAmtInd(String flsaAmtInd) {
        this.flsaAmtInd = flsaAmtInd;
    }

    public EarningsCodeRule100GetResponse withFlsaAmtInd(String flsaAmtInd) {
        this.flsaAmtInd = flsaAmtInd;
        return this;
    }

    @JsonProperty("ergrDesc")
    public String getErgrDesc() {
        return ergrDesc;
    }

    @JsonProperty("ergrDesc")
    public void setErgrDesc(String ergrDesc) {
        this.ergrDesc = ergrDesc;
    }

    public EarningsCodeRule100GetResponse withErgrDesc(String ergrDesc) {
        this.ergrDesc = ergrDesc;
        return this;
    }

    /**
     * Longevity
     * <p>
     * Lineage reference object : PTREARN_LONGEVITY_IND
     * 
     */
    @JsonProperty("longevityInd")
    public String getLongevityInd() {
        return longevityInd;
    }

    /**
     * Longevity
     * <p>
     * Lineage reference object : PTREARN_LONGEVITY_IND
     * 
     */
    @JsonProperty("longevityInd")
    public void setLongevityInd(String longevityInd) {
        this.longevityInd = longevityInd;
    }

    public EarningsCodeRule100GetResponse withLongevityInd(String longevityInd) {
        this.longevityInd = longevityInd;
        return this;
    }

    /**
     * FMLA Usage Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_USAGE_HRS_IND
     * 
     */
    @JsonProperty("fmlaUsageHrsInd")
    public String getFmlaUsageHrsInd() {
        return fmlaUsageHrsInd;
    }

    /**
     * FMLA Usage Hours
     * <p>
     * Lineage reference object : PTREARN_FMLA_USAGE_HRS_IND
     * 
     */
    @JsonProperty("fmlaUsageHrsInd")
    public void setFmlaUsageHrsInd(String fmlaUsageHrsInd) {
        this.fmlaUsageHrsInd = fmlaUsageHrsInd;
    }

    public EarningsCodeRule100GetResponse withFmlaUsageHrsInd(String fmlaUsageHrsInd) {
        this.fmlaUsageHrsInd = fmlaUsageHrsInd;
        return this;
    }

    /**
     * Lineage reference object : PTREARN_UNIT_IND
     * 
     */
    @JsonProperty("unitInd")
    public String getUnitInd() {
        return unitInd;
    }

    /**
     * Lineage reference object : PTREARN_UNIT_IND
     * 
     */
    @JsonProperty("unitInd")
    public void setUnitInd(String unitInd) {
        this.unitInd = unitInd;
    }

    public EarningsCodeRule100GetResponse withUnitInd(String unitInd) {
        this.unitInd = unitInd;
        return this;
    }

    /**
     * Taxable Amount not Determined from Earn Code
     * <p>
     * Lineage reference object : PTREARN_NOT_DETERMINED_IND
     * 
     */
    @JsonProperty("notDeterminedInd")
    public String getNotDeterminedInd() {
        return notDeterminedInd;
    }

    /**
     * Taxable Amount not Determined from Earn Code
     * <p>
     * Lineage reference object : PTREARN_NOT_DETERMINED_IND
     * 
     */
    @JsonProperty("notDeterminedInd")
    public void setNotDeterminedInd(String notDeterminedInd) {
        this.notDeterminedInd = notDeterminedInd;
    }

    public EarningsCodeRule100GetResponse withNotDeterminedInd(String notDeterminedInd) {
        this.notDeterminedInd = notDeterminedInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREARN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREARN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EarningsCodeRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Reduce Base Salary
     * <p>
     * Lineage reference object : PTREARN_EXCEPTION_IND
     * 
     */
    @JsonProperty("exceptionInd")
    public String getExceptionInd() {
        return exceptionInd;
    }

    /**
     * Reduce Base Salary
     * <p>
     * Lineage reference object : PTREARN_EXCEPTION_IND
     * 
     */
    @JsonProperty("exceptionInd")
    public void setExceptionInd(String exceptionInd) {
        this.exceptionInd = exceptionInd;
    }

    public EarningsCodeRule100GetResponse withExceptionInd(String exceptionInd) {
        this.exceptionInd = exceptionInd;
        return this;
    }

    /**
     * Lineage reference object : PTREARN_RATE
     * 
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * Lineage reference object : PTREARN_RATE
     * 
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public EarningsCodeRule100GetResponse withRate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * OSHA Reportable Hours
     * <p>
     * Lineage reference object : PTREARN_OSHA_HRS_IND
     * 
     */
    @JsonProperty("oshaHrsInd")
    public String getOshaHrsInd() {
        return oshaHrsInd;
    }

    /**
     * OSHA Reportable Hours
     * <p>
     * Lineage reference object : PTREARN_OSHA_HRS_IND
     * 
     */
    @JsonProperty("oshaHrsInd")
    public void setOshaHrsInd(String oshaHrsInd) {
        this.oshaHrsInd = oshaHrsInd;
    }

    public EarningsCodeRule100GetResponse withOshaHrsInd(String oshaHrsInd) {
        this.oshaHrsInd = oshaHrsInd;
        return this;
    }

    @JsonProperty("ecRuclDesc")
    public String getEcRuclDesc() {
        return ecRuclDesc;
    }

    @JsonProperty("ecRuclDesc")
    public void setEcRuclDesc(String ecRuclDesc) {
        this.ecRuclDesc = ecRuclDesc;
    }

    public EarningsCodeRule100GetResponse withEcRuclDesc(String ecRuclDesc) {
        this.ecRuclDesc = ecRuclDesc;
        return this;
    }

    /**
     * Applicable to Fringe Expense
     * <p>
     * Lineage reference object : PTREARN_FRINGE_IND
     * 
     */
    @JsonProperty("fringeInd")
    public String getFringeInd() {
        return fringeInd;
    }

    /**
     * Applicable to Fringe Expense
     * <p>
     * Lineage reference object : PTREARN_FRINGE_IND
     * 
     */
    @JsonProperty("fringeInd")
    public void setFringeInd(String fringeInd) {
        this.fringeInd = fringeInd;
    }

    public EarningsCodeRule100GetResponse withFringeInd(String fringeInd) {
        this.fringeInd = fringeInd;
        return this;
    }

    @JsonProperty("leavCodeEarnedDesc")
    public String getLeavCodeEarnedDesc() {
        return leavCodeEarnedDesc;
    }

    @JsonProperty("leavCodeEarnedDesc")
    public void setLeavCodeEarnedDesc(String leavCodeEarnedDesc) {
        this.leavCodeEarnedDesc = leavCodeEarnedDesc;
    }

    public EarningsCodeRule100GetResponse withLeavCodeEarnedDesc(String leavCodeEarnedDesc) {
        this.leavCodeEarnedDesc = leavCodeEarnedDesc;
        return this;
    }

    /**
     * Display Earnings History on Web
     * <p>
     * Lineage reference object : PTREARN_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    public String getWebDispInd() {
        return webDispInd;
    }

    /**
     * Display Earnings History on Web
     * <p>
     * Lineage reference object : PTREARN_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    public void setWebDispInd(String webDispInd) {
        this.webDispInd = webDispInd;
    }

    public EarningsCodeRule100GetResponse withWebDispInd(String webDispInd) {
        this.webDispInd = webDispInd;
        return this;
    }

    /**
     * Fringe Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE_FRNG
     * 
     */
    @JsonProperty("ruclCodeFrng")
    public String getRuclCodeFrng() {
        return ruclCodeFrng;
    }

    /**
     * Fringe Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE_FRNG
     * 
     */
    @JsonProperty("ruclCodeFrng")
    public void setRuclCodeFrng(String ruclCodeFrng) {
        this.ruclCodeFrng = ruclCodeFrng;
    }

    public EarningsCodeRule100GetResponse withRuclCodeFrng(String ruclCodeFrng) {
        this.ruclCodeFrng = ruclCodeFrng;
        return this;
    }

    /**
     * Base Salary
     * <p>
     * Lineage reference object : PTREARN_BASE_SAL_IND
     * 
     */
    @JsonProperty("baseSalInd")
    public String getBaseSalInd() {
        return baseSalInd;
    }

    /**
     * Base Salary
     * <p>
     * Lineage reference object : PTREARN_BASE_SAL_IND
     * 
     */
    @JsonProperty("baseSalInd")
    public void setBaseSalInd(String baseSalInd) {
        this.baseSalInd = baseSalInd;
    }

    public EarningsCodeRule100GetResponse withBaseSalInd(String baseSalInd) {
        this.baseSalInd = baseSalInd;
        return this;
    }

    /**
     * Earnings Group
     * <p>
     * Lineage reference object : PTREARN_ERGR_CODE, Lookup lineage reference object : ptvergr
     * 
     */
    @JsonProperty("ergrCode")
    public String getErgrCode() {
        return ergrCode;
    }

    /**
     * Earnings Group
     * <p>
     * Lineage reference object : PTREARN_ERGR_CODE, Lookup lineage reference object : ptvergr
     * 
     */
    @JsonProperty("ergrCode")
    public void setErgrCode(String ergrCode) {
        this.ergrCode = ergrCode;
    }

    public EarningsCodeRule100GetResponse withErgrCode(String ergrCode) {
        this.ergrCode = ergrCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PTREARN_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PTREARN_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public EarningsCodeRule100GetResponse withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTREARN_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    public String getDispWebPaystubInd() {
        return dispWebPaystubInd;
    }

    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTREARN_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    public void setDispWebPaystubInd(String dispWebPaystubInd) {
        this.dispWebPaystubInd = dispWebPaystubInd;
    }

    public EarningsCodeRule100GetResponse withDispWebPaystubInd(String dispWebPaystubInd) {
        this.dispWebPaystubInd = dispWebPaystubInd;
        return this;
    }

    /**
     * Leave Earned Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_EARNED
     * 
     */
    @JsonProperty("leavCodeEarned")
    public String getLeavCodeEarned() {
        return leavCodeEarned;
    }

    /**
     * Leave Earned Code
     * <p>
     * Lineage reference object : PTREARN_LEAV_CODE_EARNED
     * 
     */
    @JsonProperty("leavCodeEarned")
    public void setLeavCodeEarned(String leavCodeEarned) {
        this.leavCodeEarned = leavCodeEarned;
    }

    public EarningsCodeRule100GetResponse withLeavCodeEarned(String leavCodeEarned) {
        this.leavCodeEarned = leavCodeEarned;
        return this;
    }

    /**
     * Expend Budget with Earning Value
     * <p>
     * Lineage reference object : PTREARN_EXPENDED_BUD_IND
     * 
     */
    @JsonProperty("expendedBudInd")
    public String getExpendedBudInd() {
        return expendedBudInd;
    }

    /**
     * Expend Budget with Earning Value
     * <p>
     * Lineage reference object : PTREARN_EXPENDED_BUD_IND
     * 
     */
    @JsonProperty("expendedBudInd")
    public void setExpendedBudInd(String expendedBudInd) {
        this.expendedBudInd = expendedBudInd;
    }

    public EarningsCodeRule100GetResponse withExpendedBudInd(String expendedBudInd) {
        this.expendedBudInd = expendedBudInd;
        return this;
    }

    /**
     * California MIS EB12 Earnings
     * <p>
     * Lineage reference object : PTREARN_MIS_ADDL_EARN_IND
     * 
     */
    @JsonProperty("misAddlEarnInd")
    public String getMisAddlEarnInd() {
        return misAddlEarnInd;
    }

    /**
     * California MIS EB12 Earnings
     * <p>
     * Lineage reference object : PTREARN_MIS_ADDL_EARN_IND
     * 
     */
    @JsonProperty("misAddlEarnInd")
    public void setMisAddlEarnInd(String misAddlEarnInd) {
        this.misAddlEarnInd = misAddlEarnInd;
    }

    public EarningsCodeRule100GetResponse withMisAddlEarnInd(String misAddlEarnInd) {
        this.misAddlEarnInd = misAddlEarnInd;
        return this;
    }

    /**
     * Stipend
     * <p>
     * Lineage reference object : PTREARN_STIPEND_IND
     * 
     */
    @JsonProperty("stipendInd")
    public String getStipendInd() {
        return stipendInd;
    }

    /**
     * Stipend
     * <p>
     * Lineage reference object : PTREARN_STIPEND_IND
     * 
     */
    @JsonProperty("stipendInd")
    public void setStipendInd(String stipendInd) {
        this.stipendInd = stipendInd;
    }

    public EarningsCodeRule100GetResponse withStipendInd(String stipendInd) {
        this.stipendInd = stipendInd;
        return this;
    }

    /**
     * California Special Compensation
     * <p>
     * Lineage reference object : PTREARN_SPECIAL_COMP_IND
     * 
     */
    @JsonProperty("specialCompInd")
    public String getSpecialCompInd() {
        return specialCompInd;
    }

    /**
     * California Special Compensation
     * <p>
     * Lineage reference object : PTREARN_SPECIAL_COMP_IND
     * 
     */
    @JsonProperty("specialCompInd")
    public void setSpecialCompInd(String specialCompInd) {
        this.specialCompInd = specialCompInd;
    }

    public EarningsCodeRule100GetResponse withSpecialCompInd(String specialCompInd) {
        this.specialCompInd = specialCompInd;
        return this;
    }

    /**
     * FLSA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FLSA_HRS_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaHrsInd")
    public String getFlsaHrsInd() {
        return flsaHrsInd;
    }

    /**
     * FLSA Eligible Hours
     * <p>
     * Lineage reference object : PTREARN_FLSA_HRS_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaHrsInd")
    public void setFlsaHrsInd(String flsaHrsInd) {
        this.flsaHrsInd = flsaHrsInd;
    }

    public EarningsCodeRule100GetResponse withFlsaHrsInd(String flsaHrsInd) {
        this.flsaHrsInd = flsaHrsInd;
        return this;
    }

    @JsonProperty("ruclCodeFrngDesc")
    public String getRuclCodeFrngDesc() {
        return ruclCodeFrngDesc;
    }

    @JsonProperty("ruclCodeFrngDesc")
    public void setRuclCodeFrngDesc(String ruclCodeFrngDesc) {
        this.ruclCodeFrngDesc = ruclCodeFrngDesc;
    }

    public EarningsCodeRule100GetResponse withRuclCodeFrngDesc(String ruclCodeFrngDesc) {
        this.ruclCodeFrngDesc = ruclCodeFrngDesc;
        return this;
    }

    /**
     * Shift Differential
     * <p>
     * Lineage reference object : PTREARN_SHFT_DIFF_IND
     * 
     */
    @JsonProperty("shftDiffInd")
    public String getShftDiffInd() {
        return shftDiffInd;
    }

    /**
     * Shift Differential
     * <p>
     * Lineage reference object : PTREARN_SHFT_DIFF_IND
     * 
     */
    @JsonProperty("shftDiffInd")
    public void setShftDiffInd(String shftDiffInd) {
        this.shftDiffInd = shftDiffInd;
    }

    public EarningsCodeRule100GetResponse withShftDiffInd(String shftDiffInd) {
        this.shftDiffInd = shftDiffInd;
        return this;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : PTREARN_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public EarningsCodeRule100GetResponse withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : PTREARN_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : PTREARN_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public EarningsCodeRule100GetResponse withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Pensionable Hours
     * <p>
     * Lineage reference object : PTREARN_PENSIONABLE_HRS_IND
     * 
     */
    @JsonProperty("pensionableHrsInd")
    public String getPensionableHrsInd() {
        return pensionableHrsInd;
    }

    /**
     * Pensionable Hours
     * <p>
     * Lineage reference object : PTREARN_PENSIONABLE_HRS_IND
     * 
     */
    @JsonProperty("pensionableHrsInd")
    public void setPensionableHrsInd(String pensionableHrsInd) {
        this.pensionableHrsInd = pensionableHrsInd;
    }

    public EarningsCodeRule100GetResponse withPensionableHrsInd(String pensionableHrsInd) {
        this.pensionableHrsInd = pensionableHrsInd;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : PTREARN_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : PTREARN_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public EarningsCodeRule100GetResponse withLongDesc(String longDesc) {
        this.longDesc = longDesc;
        return this;
    }

    /**
     * Cash
     * <p>
     * Lineage reference object : PTREARN_CASH_IND
     * 
     */
    @JsonProperty("cashInd")
    public String getCashInd() {
        return cashInd;
    }

    /**
     * Cash
     * <p>
     * Lineage reference object : PTREARN_CASH_IND
     * 
     */
    @JsonProperty("cashInd")
    public void setCashInd(String cashInd) {
        this.cashInd = cashInd;
    }

    public EarningsCodeRule100GetResponse withCashInd(String cashInd) {
        this.cashInd = cashInd;
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

    public EarningsCodeRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EarningsCodeRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_1099Code");
        sb.append('=');
        sb.append(((this._1099Code == null)?"<null>":this._1099Code));
        sb.append(',');
        sb.append("rateInd");
        sb.append('=');
        sb.append(((this.rateInd == null)?"<null>":this.rateInd));
        sb.append(',');
        sb.append("desc1099");
        sb.append('=');
        sb.append(((this.desc1099 == null)?"<null>":this.desc1099));
        sb.append(',');
        sb.append("leavCodeTakenDesc");
        sb.append('=');
        sb.append(((this.leavCodeTakenDesc == null)?"<null>":this.leavCodeTakenDesc));
        sb.append(',');
        sb.append("taxMethodInd");
        sb.append('=');
        sb.append(((this.taxMethodInd == null)?"<null>":this.taxMethodInd));
        sb.append(',');
        sb.append("fmlaEligibleHrsInd");
        sb.append('=');
        sb.append(((this.fmlaEligibleHrsInd == null)?"<null>":this.fmlaEligibleHrsInd));
        sb.append(',');
        sb.append("leavMinimumInd");
        sb.append('=');
        sb.append(((this.leavMinimumInd == null)?"<null>":this.leavMinimumInd));
        sb.append(',');
        sb.append("multFactor");
        sb.append('=');
        sb.append(((this.multFactor == null)?"<null>":this.multFactor));
        sb.append(',');
        sb.append("leavProrationInd");
        sb.append('=');
        sb.append(((this.leavProrationInd == null)?"<null>":this.leavProrationInd));
        sb.append(',');
        sb.append("ecldInd");
        sb.append('=');
        sb.append(((this.ecldInd == null)?"<null>":this.ecldInd));
        sb.append(',');
        sb.append("leavCodeTaken");
        sb.append('=');
        sb.append(((this.leavCodeTaken == null)?"<null>":this.leavCodeTaken));
        sb.append(',');
        sb.append("flsaAmtInd");
        sb.append('=');
        sb.append(((this.flsaAmtInd == null)?"<null>":this.flsaAmtInd));
        sb.append(',');
        sb.append("ergrDesc");
        sb.append('=');
        sb.append(((this.ergrDesc == null)?"<null>":this.ergrDesc));
        sb.append(',');
        sb.append("longevityInd");
        sb.append('=');
        sb.append(((this.longevityInd == null)?"<null>":this.longevityInd));
        sb.append(',');
        sb.append("fmlaUsageHrsInd");
        sb.append('=');
        sb.append(((this.fmlaUsageHrsInd == null)?"<null>":this.fmlaUsageHrsInd));
        sb.append(',');
        sb.append("unitInd");
        sb.append('=');
        sb.append(((this.unitInd == null)?"<null>":this.unitInd));
        sb.append(',');
        sb.append("notDeterminedInd");
        sb.append('=');
        sb.append(((this.notDeterminedInd == null)?"<null>":this.notDeterminedInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("exceptionInd");
        sb.append('=');
        sb.append(((this.exceptionInd == null)?"<null>":this.exceptionInd));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("oshaHrsInd");
        sb.append('=');
        sb.append(((this.oshaHrsInd == null)?"<null>":this.oshaHrsInd));
        sb.append(',');
        sb.append("ecRuclDesc");
        sb.append('=');
        sb.append(((this.ecRuclDesc == null)?"<null>":this.ecRuclDesc));
        sb.append(',');
        sb.append("fringeInd");
        sb.append('=');
        sb.append(((this.fringeInd == null)?"<null>":this.fringeInd));
        sb.append(',');
        sb.append("leavCodeEarnedDesc");
        sb.append('=');
        sb.append(((this.leavCodeEarnedDesc == null)?"<null>":this.leavCodeEarnedDesc));
        sb.append(',');
        sb.append("webDispInd");
        sb.append('=');
        sb.append(((this.webDispInd == null)?"<null>":this.webDispInd));
        sb.append(',');
        sb.append("ruclCodeFrng");
        sb.append('=');
        sb.append(((this.ruclCodeFrng == null)?"<null>":this.ruclCodeFrng));
        sb.append(',');
        sb.append("baseSalInd");
        sb.append('=');
        sb.append(((this.baseSalInd == null)?"<null>":this.baseSalInd));
        sb.append(',');
        sb.append("ergrCode");
        sb.append('=');
        sb.append(((this.ergrCode == null)?"<null>":this.ergrCode));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("dispWebPaystubInd");
        sb.append('=');
        sb.append(((this.dispWebPaystubInd == null)?"<null>":this.dispWebPaystubInd));
        sb.append(',');
        sb.append("leavCodeEarned");
        sb.append('=');
        sb.append(((this.leavCodeEarned == null)?"<null>":this.leavCodeEarned));
        sb.append(',');
        sb.append("expendedBudInd");
        sb.append('=');
        sb.append(((this.expendedBudInd == null)?"<null>":this.expendedBudInd));
        sb.append(',');
        sb.append("misAddlEarnInd");
        sb.append('=');
        sb.append(((this.misAddlEarnInd == null)?"<null>":this.misAddlEarnInd));
        sb.append(',');
        sb.append("stipendInd");
        sb.append('=');
        sb.append(((this.stipendInd == null)?"<null>":this.stipendInd));
        sb.append(',');
        sb.append("specialCompInd");
        sb.append('=');
        sb.append(((this.specialCompInd == null)?"<null>":this.specialCompInd));
        sb.append(',');
        sb.append("flsaHrsInd");
        sb.append('=');
        sb.append(((this.flsaHrsInd == null)?"<null>":this.flsaHrsInd));
        sb.append(',');
        sb.append("ruclCodeFrngDesc");
        sb.append('=');
        sb.append(((this.ruclCodeFrngDesc == null)?"<null>":this.ruclCodeFrngDesc));
        sb.append(',');
        sb.append("shftDiffInd");
        sb.append('=');
        sb.append(((this.shftDiffInd == null)?"<null>":this.shftDiffInd));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("pensionableHrsInd");
        sb.append('=');
        sb.append(((this.pensionableHrsInd == null)?"<null>":this.pensionableHrsInd));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
        sb.append(',');
        sb.append("cashInd");
        sb.append('=');
        sb.append(((this.cashInd == null)?"<null>":this.cashInd));
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
        result = ((result* 31)+((this.rateInd == null)? 0 :this.rateInd.hashCode()));
        result = ((result* 31)+((this.desc1099 == null)? 0 :this.desc1099 .hashCode()));
        result = ((result* 31)+((this.leavCodeTakenDesc == null)? 0 :this.leavCodeTakenDesc.hashCode()));
        result = ((result* 31)+((this.taxMethodInd == null)? 0 :this.taxMethodInd.hashCode()));
        result = ((result* 31)+((this.fmlaEligibleHrsInd == null)? 0 :this.fmlaEligibleHrsInd.hashCode()));
        result = ((result* 31)+((this.leavMinimumInd == null)? 0 :this.leavMinimumInd.hashCode()));
        result = ((result* 31)+((this.multFactor == null)? 0 :this.multFactor.hashCode()));
        result = ((result* 31)+((this.leavProrationInd == null)? 0 :this.leavProrationInd.hashCode()));
        result = ((result* 31)+((this.ecldInd == null)? 0 :this.ecldInd.hashCode()));
        result = ((result* 31)+((this.leavCodeTaken == null)? 0 :this.leavCodeTaken.hashCode()));
        result = ((result* 31)+((this.flsaAmtInd == null)? 0 :this.flsaAmtInd.hashCode()));
        result = ((result* 31)+((this.ergrDesc == null)? 0 :this.ergrDesc.hashCode()));
        result = ((result* 31)+((this.longevityInd == null)? 0 :this.longevityInd.hashCode()));
        result = ((result* 31)+((this.fmlaUsageHrsInd == null)? 0 :this.fmlaUsageHrsInd.hashCode()));
        result = ((result* 31)+((this.unitInd == null)? 0 :this.unitInd.hashCode()));
        result = ((result* 31)+((this.notDeterminedInd == null)? 0 :this.notDeterminedInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.exceptionInd == null)? 0 :this.exceptionInd.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.oshaHrsInd == null)? 0 :this.oshaHrsInd.hashCode()));
        result = ((result* 31)+((this.ecRuclDesc == null)? 0 :this.ecRuclDesc.hashCode()));
        result = ((result* 31)+((this.fringeInd == null)? 0 :this.fringeInd.hashCode()));
        result = ((result* 31)+((this.leavCodeEarnedDesc == null)? 0 :this.leavCodeEarnedDesc.hashCode()));
        result = ((result* 31)+((this._1099Code == null)? 0 :this._1099Code.hashCode()));
        result = ((result* 31)+((this.webDispInd == null)? 0 :this.webDispInd.hashCode()));
        result = ((result* 31)+((this.ruclCodeFrng == null)? 0 :this.ruclCodeFrng.hashCode()));
        result = ((result* 31)+((this.baseSalInd == null)? 0 :this.baseSalInd.hashCode()));
        result = ((result* 31)+((this.ergrCode == null)? 0 :this.ergrCode.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.dispWebPaystubInd == null)? 0 :this.dispWebPaystubInd.hashCode()));
        result = ((result* 31)+((this.leavCodeEarned == null)? 0 :this.leavCodeEarned.hashCode()));
        result = ((result* 31)+((this.expendedBudInd == null)? 0 :this.expendedBudInd.hashCode()));
        result = ((result* 31)+((this.misAddlEarnInd == null)? 0 :this.misAddlEarnInd.hashCode()));
        result = ((result* 31)+((this.stipendInd == null)? 0 :this.stipendInd.hashCode()));
        result = ((result* 31)+((this.specialCompInd == null)? 0 :this.specialCompInd.hashCode()));
        result = ((result* 31)+((this.flsaHrsInd == null)? 0 :this.flsaHrsInd.hashCode()));
        result = ((result* 31)+((this.ruclCodeFrngDesc == null)? 0 :this.ruclCodeFrngDesc.hashCode()));
        result = ((result* 31)+((this.shftDiffInd == null)? 0 :this.shftDiffInd.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pensionableHrsInd == null)? 0 :this.pensionableHrsInd.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        result = ((result* 31)+((this.cashInd == null)? 0 :this.cashInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EarningsCodeRule100GetResponse) == false) {
            return false;
        }
        EarningsCodeRule100GetResponse rhs = ((EarningsCodeRule100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.rateInd == rhs.rateInd)||((this.rateInd!= null)&&this.rateInd.equals(rhs.rateInd)))&&((this.desc1099 == rhs.desc1099)||((this.desc1099 != null)&&this.desc1099 .equals(rhs.desc1099))))&&((this.leavCodeTakenDesc == rhs.leavCodeTakenDesc)||((this.leavCodeTakenDesc!= null)&&this.leavCodeTakenDesc.equals(rhs.leavCodeTakenDesc))))&&((this.taxMethodInd == rhs.taxMethodInd)||((this.taxMethodInd!= null)&&this.taxMethodInd.equals(rhs.taxMethodInd))))&&((this.fmlaEligibleHrsInd == rhs.fmlaEligibleHrsInd)||((this.fmlaEligibleHrsInd!= null)&&this.fmlaEligibleHrsInd.equals(rhs.fmlaEligibleHrsInd))))&&((this.leavMinimumInd == rhs.leavMinimumInd)||((this.leavMinimumInd!= null)&&this.leavMinimumInd.equals(rhs.leavMinimumInd))))&&((this.multFactor == rhs.multFactor)||((this.multFactor!= null)&&this.multFactor.equals(rhs.multFactor))))&&((this.leavProrationInd == rhs.leavProrationInd)||((this.leavProrationInd!= null)&&this.leavProrationInd.equals(rhs.leavProrationInd))))&&((this.ecldInd == rhs.ecldInd)||((this.ecldInd!= null)&&this.ecldInd.equals(rhs.ecldInd))))&&((this.leavCodeTaken == rhs.leavCodeTaken)||((this.leavCodeTaken!= null)&&this.leavCodeTaken.equals(rhs.leavCodeTaken))))&&((this.flsaAmtInd == rhs.flsaAmtInd)||((this.flsaAmtInd!= null)&&this.flsaAmtInd.equals(rhs.flsaAmtInd))))&&((this.ergrDesc == rhs.ergrDesc)||((this.ergrDesc!= null)&&this.ergrDesc.equals(rhs.ergrDesc))))&&((this.longevityInd == rhs.longevityInd)||((this.longevityInd!= null)&&this.longevityInd.equals(rhs.longevityInd))))&&((this.fmlaUsageHrsInd == rhs.fmlaUsageHrsInd)||((this.fmlaUsageHrsInd!= null)&&this.fmlaUsageHrsInd.equals(rhs.fmlaUsageHrsInd))))&&((this.unitInd == rhs.unitInd)||((this.unitInd!= null)&&this.unitInd.equals(rhs.unitInd))))&&((this.notDeterminedInd == rhs.notDeterminedInd)||((this.notDeterminedInd!= null)&&this.notDeterminedInd.equals(rhs.notDeterminedInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.exceptionInd == rhs.exceptionInd)||((this.exceptionInd!= null)&&this.exceptionInd.equals(rhs.exceptionInd))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.oshaHrsInd == rhs.oshaHrsInd)||((this.oshaHrsInd!= null)&&this.oshaHrsInd.equals(rhs.oshaHrsInd))))&&((this.ecRuclDesc == rhs.ecRuclDesc)||((this.ecRuclDesc!= null)&&this.ecRuclDesc.equals(rhs.ecRuclDesc))))&&((this.fringeInd == rhs.fringeInd)||((this.fringeInd!= null)&&this.fringeInd.equals(rhs.fringeInd))))&&((this.leavCodeEarnedDesc == rhs.leavCodeEarnedDesc)||((this.leavCodeEarnedDesc!= null)&&this.leavCodeEarnedDesc.equals(rhs.leavCodeEarnedDesc))))&&((this._1099Code == rhs._1099Code)||((this._1099Code!= null)&&this._1099Code.equals(rhs._1099Code))))&&((this.webDispInd == rhs.webDispInd)||((this.webDispInd!= null)&&this.webDispInd.equals(rhs.webDispInd))))&&((this.ruclCodeFrng == rhs.ruclCodeFrng)||((this.ruclCodeFrng!= null)&&this.ruclCodeFrng.equals(rhs.ruclCodeFrng))))&&((this.baseSalInd == rhs.baseSalInd)||((this.baseSalInd!= null)&&this.baseSalInd.equals(rhs.baseSalInd))))&&((this.ergrCode == rhs.ergrCode)||((this.ergrCode!= null)&&this.ergrCode.equals(rhs.ergrCode))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.dispWebPaystubInd == rhs.dispWebPaystubInd)||((this.dispWebPaystubInd!= null)&&this.dispWebPaystubInd.equals(rhs.dispWebPaystubInd))))&&((this.leavCodeEarned == rhs.leavCodeEarned)||((this.leavCodeEarned!= null)&&this.leavCodeEarned.equals(rhs.leavCodeEarned))))&&((this.expendedBudInd == rhs.expendedBudInd)||((this.expendedBudInd!= null)&&this.expendedBudInd.equals(rhs.expendedBudInd))))&&((this.misAddlEarnInd == rhs.misAddlEarnInd)||((this.misAddlEarnInd!= null)&&this.misAddlEarnInd.equals(rhs.misAddlEarnInd))))&&((this.stipendInd == rhs.stipendInd)||((this.stipendInd!= null)&&this.stipendInd.equals(rhs.stipendInd))))&&((this.specialCompInd == rhs.specialCompInd)||((this.specialCompInd!= null)&&this.specialCompInd.equals(rhs.specialCompInd))))&&((this.flsaHrsInd == rhs.flsaHrsInd)||((this.flsaHrsInd!= null)&&this.flsaHrsInd.equals(rhs.flsaHrsInd))))&&((this.ruclCodeFrngDesc == rhs.ruclCodeFrngDesc)||((this.ruclCodeFrngDesc!= null)&&this.ruclCodeFrngDesc.equals(rhs.ruclCodeFrngDesc))))&&((this.shftDiffInd == rhs.shftDiffInd)||((this.shftDiffInd!= null)&&this.shftDiffInd.equals(rhs.shftDiffInd))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pensionableHrsInd == rhs.pensionableHrsInd)||((this.pensionableHrsInd!= null)&&this.pensionableHrsInd.equals(rhs.pensionableHrsInd))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))))&&((this.cashInd == rhs.cashInd)||((this.cashInd!= null)&&this.cashInd.equals(rhs.cashInd))));
    }

}
