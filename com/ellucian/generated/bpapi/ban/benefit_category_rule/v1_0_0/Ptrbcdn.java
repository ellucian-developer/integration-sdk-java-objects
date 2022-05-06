
package com.ellucian.generated.bpapi.ban.benefit_category_rule.v1_0_0;

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
    "newhireCutoffDay",
    "waitDayMonthInd",
    "defaultValuesInd",
    "dispOnStmtInd",
    "bdcaCode",
    "seqNo",
    "endDate",
    "enrlBeginDateMethod",
    "reqInd",
    "stmtSetupBdsgDesc",
    "beginDate",
    "setupInd",
    "beginDateInd",
    "acaStartPlanMonth",
    "bdcaDesc",
    "coverageEndDateInd",
    "newhireWaitingPeriod"
})
@Generated("jsonschema2pojo")
public class Ptrbcdn {

    /**
     * Cut-Off Day
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_CUTOFF_DAY
     * 
     */
    @JsonProperty("newhireCutoffDay")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_NEWHIRE_CUTOFF_DAY")
    private Double newhireCutoffDay;
    /**
     * Waiting Period Day or Month Indicator
     * <p>
     * Lineage reference object : PTRBCDN_WAIT_DAY_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("waitDayMonthInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_WAIT_DAY_MONTH_IND")
    private String waitDayMonthInd;
    @JsonProperty("defaultValuesInd")
    private String defaultValuesInd;
    /**
     * Lineage reference object : PTRBCDN_DISP_ON_STMT_IND
     * 
     */
    @JsonProperty("dispOnStmtInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_DISP_ON_STMT_IND")
    private String dispOnStmtInd;
    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_BDCA_CODE")
    private String bdcaCode;
    /**
     * Check Sequence Number
     * <p>
     * Lineage reference object : PTRBCDN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_SEQ_NO")
    private Double seqNo;
    /**
     * Benefit or Deduction End Date
     * <p>
     * Lineage reference object : PTRBCDN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_END_DATE")
    private Date endDate;
    /**
     * New Hire Enrollment Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_ENRL_BEGIN_DATE_METHOD")
    private String enrlBeginDateMethod;
    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_REQ_IND")
    private String reqInd;
    /**
     * Secondary Group
     * <p>
     * 
     * 
     */
    @JsonProperty("stmtSetupBdsgDesc")
    private String stmtSetupBdsgDesc;
    /**
     * Benefit or Deduction Begin Date
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_BEGIN_DATE")
    private Date beginDate;
    /**
     * Quick Setup
     * <p>
     * Lineage reference object : PTRBCDN_SETUP_IND
     * (Required)
     * 
     */
    @JsonProperty("setupInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_SETUP_IND")
    private String setupInd;
    /**
     * Payroll Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("beginDateInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_BEGIN_DATE_IND")
    private String beginDateInd;
    /**
     * ACA Plan Start Month
     * <p>
     * Lineage reference object : PTRBCDN_ACA_START_PLAN_MONTH
     * 
     */
    @JsonProperty("acaStartPlanMonth")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_ACA_START_PLAN_MONTH")
    private Double acaStartPlanMonth;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    /**
     * Coverage End Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_COVERAGE_END_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("coverageEndDateInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_COVERAGE_END_DATE_IND")
    private String coverageEndDateInd;
    /**
     * Waiting Period
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_WAITING_PERIOD
     * 
     */
    @JsonProperty("newhireWaitingPeriod")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_NEWHIRE_WAITING_PERIOD")
    private Double newhireWaitingPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cut-Off Day
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_CUTOFF_DAY
     * 
     */
    @JsonProperty("newhireCutoffDay")
    public Double getNewhireCutoffDay() {
        return newhireCutoffDay;
    }

    /**
     * Cut-Off Day
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_CUTOFF_DAY
     * 
     */
    @JsonProperty("newhireCutoffDay")
    public void setNewhireCutoffDay(Double newhireCutoffDay) {
        this.newhireCutoffDay = newhireCutoffDay;
    }

    public Ptrbcdn withNewhireCutoffDay(Double newhireCutoffDay) {
        this.newhireCutoffDay = newhireCutoffDay;
        return this;
    }

    /**
     * Waiting Period Day or Month Indicator
     * <p>
     * Lineage reference object : PTRBCDN_WAIT_DAY_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("waitDayMonthInd")
    public String getWaitDayMonthInd() {
        return waitDayMonthInd;
    }

    /**
     * Waiting Period Day or Month Indicator
     * <p>
     * Lineage reference object : PTRBCDN_WAIT_DAY_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("waitDayMonthInd")
    public void setWaitDayMonthInd(String waitDayMonthInd) {
        this.waitDayMonthInd = waitDayMonthInd;
    }

    public Ptrbcdn withWaitDayMonthInd(String waitDayMonthInd) {
        this.waitDayMonthInd = waitDayMonthInd;
        return this;
    }

    @JsonProperty("defaultValuesInd")
    public String getDefaultValuesInd() {
        return defaultValuesInd;
    }

    @JsonProperty("defaultValuesInd")
    public void setDefaultValuesInd(String defaultValuesInd) {
        this.defaultValuesInd = defaultValuesInd;
    }

    public Ptrbcdn withDefaultValuesInd(String defaultValuesInd) {
        this.defaultValuesInd = defaultValuesInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBCDN_DISP_ON_STMT_IND
     * 
     */
    @JsonProperty("dispOnStmtInd")
    public String getDispOnStmtInd() {
        return dispOnStmtInd;
    }

    /**
     * Lineage reference object : PTRBCDN_DISP_ON_STMT_IND
     * 
     */
    @JsonProperty("dispOnStmtInd")
    public void setDispOnStmtInd(String dispOnStmtInd) {
        this.dispOnStmtInd = dispOnStmtInd;
    }

    public Ptrbcdn withDispOnStmtInd(String dispOnStmtInd) {
        this.dispOnStmtInd = dispOnStmtInd;
        return this;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public Ptrbcdn withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Check Sequence Number
     * <p>
     * Lineage reference object : PTRBCDN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Check Sequence Number
     * <p>
     * Lineage reference object : PTRBCDN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public Ptrbcdn withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Benefit or Deduction End Date
     * <p>
     * Lineage reference object : PTRBCDN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Benefit or Deduction End Date
     * <p>
     * Lineage reference object : PTRBCDN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Ptrbcdn withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * New Hire Enrollment Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    public String getEnrlBeginDateMethod() {
        return enrlBeginDateMethod;
    }

    /**
     * New Hire Enrollment Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    public void setEnrlBeginDateMethod(String enrlBeginDateMethod) {
        this.enrlBeginDateMethod = enrlBeginDateMethod;
    }

    public Ptrbcdn withEnrlBeginDateMethod(String enrlBeginDateMethod) {
        this.enrlBeginDateMethod = enrlBeginDateMethod;
        return this;
    }

    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    public String getReqInd() {
        return reqInd;
    }

    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    public void setReqInd(String reqInd) {
        this.reqInd = reqInd;
    }

    public Ptrbcdn withReqInd(String reqInd) {
        this.reqInd = reqInd;
        return this;
    }

    /**
     * Secondary Group
     * <p>
     * 
     * 
     */
    @JsonProperty("stmtSetupBdsgDesc")
    public String getStmtSetupBdsgDesc() {
        return stmtSetupBdsgDesc;
    }

    /**
     * Secondary Group
     * <p>
     * 
     * 
     */
    @JsonProperty("stmtSetupBdsgDesc")
    public void setStmtSetupBdsgDesc(String stmtSetupBdsgDesc) {
        this.stmtSetupBdsgDesc = stmtSetupBdsgDesc;
    }

    public Ptrbcdn withStmtSetupBdsgDesc(String stmtSetupBdsgDesc) {
        this.stmtSetupBdsgDesc = stmtSetupBdsgDesc;
        return this;
    }

    /**
     * Benefit or Deduction Begin Date
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Benefit or Deduction Begin Date
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Ptrbcdn withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Quick Setup
     * <p>
     * Lineage reference object : PTRBCDN_SETUP_IND
     * (Required)
     * 
     */
    @JsonProperty("setupInd")
    public String getSetupInd() {
        return setupInd;
    }

    /**
     * Quick Setup
     * <p>
     * Lineage reference object : PTRBCDN_SETUP_IND
     * (Required)
     * 
     */
    @JsonProperty("setupInd")
    public void setSetupInd(String setupInd) {
        this.setupInd = setupInd;
    }

    public Ptrbcdn withSetupInd(String setupInd) {
        this.setupInd = setupInd;
        return this;
    }

    /**
     * Payroll Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("beginDateInd")
    public String getBeginDateInd() {
        return beginDateInd;
    }

    /**
     * Payroll Begin Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_BEGIN_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("beginDateInd")
    public void setBeginDateInd(String beginDateInd) {
        this.beginDateInd = beginDateInd;
    }

    public Ptrbcdn withBeginDateInd(String beginDateInd) {
        this.beginDateInd = beginDateInd;
        return this;
    }

    /**
     * ACA Plan Start Month
     * <p>
     * Lineage reference object : PTRBCDN_ACA_START_PLAN_MONTH
     * 
     */
    @JsonProperty("acaStartPlanMonth")
    public Double getAcaStartPlanMonth() {
        return acaStartPlanMonth;
    }

    /**
     * ACA Plan Start Month
     * <p>
     * Lineage reference object : PTRBCDN_ACA_START_PLAN_MONTH
     * 
     */
    @JsonProperty("acaStartPlanMonth")
    public void setAcaStartPlanMonth(Double acaStartPlanMonth) {
        this.acaStartPlanMonth = acaStartPlanMonth;
    }

    public Ptrbcdn withAcaStartPlanMonth(Double acaStartPlanMonth) {
        this.acaStartPlanMonth = acaStartPlanMonth;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    public String getBdcaDesc() {
        return bdcaDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    public void setBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
    }

    public Ptrbcdn withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    /**
     * Coverage End Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_COVERAGE_END_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("coverageEndDateInd")
    public String getCoverageEndDateInd() {
        return coverageEndDateInd;
    }

    /**
     * Coverage End Date Indicator
     * <p>
     * Lineage reference object : PTRBCDN_COVERAGE_END_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("coverageEndDateInd")
    public void setCoverageEndDateInd(String coverageEndDateInd) {
        this.coverageEndDateInd = coverageEndDateInd;
    }

    public Ptrbcdn withCoverageEndDateInd(String coverageEndDateInd) {
        this.coverageEndDateInd = coverageEndDateInd;
        return this;
    }

    /**
     * Waiting Period
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_WAITING_PERIOD
     * 
     */
    @JsonProperty("newhireWaitingPeriod")
    public Double getNewhireWaitingPeriod() {
        return newhireWaitingPeriod;
    }

    /**
     * Waiting Period
     * <p>
     * Lineage reference object : PTRBCDN_NEWHIRE_WAITING_PERIOD
     * 
     */
    @JsonProperty("newhireWaitingPeriod")
    public void setNewhireWaitingPeriod(Double newhireWaitingPeriod) {
        this.newhireWaitingPeriod = newhireWaitingPeriod;
    }

    public Ptrbcdn withNewhireWaitingPeriod(Double newhireWaitingPeriod) {
        this.newhireWaitingPeriod = newhireWaitingPeriod;
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

    public Ptrbcdn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrbcdn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("newhireCutoffDay");
        sb.append('=');
        sb.append(((this.newhireCutoffDay == null)?"<null>":this.newhireCutoffDay));
        sb.append(',');
        sb.append("waitDayMonthInd");
        sb.append('=');
        sb.append(((this.waitDayMonthInd == null)?"<null>":this.waitDayMonthInd));
        sb.append(',');
        sb.append("defaultValuesInd");
        sb.append('=');
        sb.append(((this.defaultValuesInd == null)?"<null>":this.defaultValuesInd));
        sb.append(',');
        sb.append("dispOnStmtInd");
        sb.append('=');
        sb.append(((this.dispOnStmtInd == null)?"<null>":this.dispOnStmtInd));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("enrlBeginDateMethod");
        sb.append('=');
        sb.append(((this.enrlBeginDateMethod == null)?"<null>":this.enrlBeginDateMethod));
        sb.append(',');
        sb.append("reqInd");
        sb.append('=');
        sb.append(((this.reqInd == null)?"<null>":this.reqInd));
        sb.append(',');
        sb.append("stmtSetupBdsgDesc");
        sb.append('=');
        sb.append(((this.stmtSetupBdsgDesc == null)?"<null>":this.stmtSetupBdsgDesc));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("setupInd");
        sb.append('=');
        sb.append(((this.setupInd == null)?"<null>":this.setupInd));
        sb.append(',');
        sb.append("beginDateInd");
        sb.append('=');
        sb.append(((this.beginDateInd == null)?"<null>":this.beginDateInd));
        sb.append(',');
        sb.append("acaStartPlanMonth");
        sb.append('=');
        sb.append(((this.acaStartPlanMonth == null)?"<null>":this.acaStartPlanMonth));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("coverageEndDateInd");
        sb.append('=');
        sb.append(((this.coverageEndDateInd == null)?"<null>":this.coverageEndDateInd));
        sb.append(',');
        sb.append("newhireWaitingPeriod");
        sb.append('=');
        sb.append(((this.newhireWaitingPeriod == null)?"<null>":this.newhireWaitingPeriod));
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
        result = ((result* 31)+((this.newhireCutoffDay == null)? 0 :this.newhireCutoffDay.hashCode()));
        result = ((result* 31)+((this.waitDayMonthInd == null)? 0 :this.waitDayMonthInd.hashCode()));
        result = ((result* 31)+((this.defaultValuesInd == null)? 0 :this.defaultValuesInd.hashCode()));
        result = ((result* 31)+((this.dispOnStmtInd == null)? 0 :this.dispOnStmtInd.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.enrlBeginDateMethod == null)? 0 :this.enrlBeginDateMethod.hashCode()));
        result = ((result* 31)+((this.reqInd == null)? 0 :this.reqInd.hashCode()));
        result = ((result* 31)+((this.stmtSetupBdsgDesc == null)? 0 :this.stmtSetupBdsgDesc.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.setupInd == null)? 0 :this.setupInd.hashCode()));
        result = ((result* 31)+((this.beginDateInd == null)? 0 :this.beginDateInd.hashCode()));
        result = ((result* 31)+((this.acaStartPlanMonth == null)? 0 :this.acaStartPlanMonth.hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.coverageEndDateInd == null)? 0 :this.coverageEndDateInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.newhireWaitingPeriod == null)? 0 :this.newhireWaitingPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrbcdn) == false) {
            return false;
        }
        Ptrbcdn rhs = ((Ptrbcdn) other);
        return (((((((((((((((((((this.newhireCutoffDay == rhs.newhireCutoffDay)||((this.newhireCutoffDay!= null)&&this.newhireCutoffDay.equals(rhs.newhireCutoffDay)))&&((this.waitDayMonthInd == rhs.waitDayMonthInd)||((this.waitDayMonthInd!= null)&&this.waitDayMonthInd.equals(rhs.waitDayMonthInd))))&&((this.defaultValuesInd == rhs.defaultValuesInd)||((this.defaultValuesInd!= null)&&this.defaultValuesInd.equals(rhs.defaultValuesInd))))&&((this.dispOnStmtInd == rhs.dispOnStmtInd)||((this.dispOnStmtInd!= null)&&this.dispOnStmtInd.equals(rhs.dispOnStmtInd))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.enrlBeginDateMethod == rhs.enrlBeginDateMethod)||((this.enrlBeginDateMethod!= null)&&this.enrlBeginDateMethod.equals(rhs.enrlBeginDateMethod))))&&((this.reqInd == rhs.reqInd)||((this.reqInd!= null)&&this.reqInd.equals(rhs.reqInd))))&&((this.stmtSetupBdsgDesc == rhs.stmtSetupBdsgDesc)||((this.stmtSetupBdsgDesc!= null)&&this.stmtSetupBdsgDesc.equals(rhs.stmtSetupBdsgDesc))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.setupInd == rhs.setupInd)||((this.setupInd!= null)&&this.setupInd.equals(rhs.setupInd))))&&((this.beginDateInd == rhs.beginDateInd)||((this.beginDateInd!= null)&&this.beginDateInd.equals(rhs.beginDateInd))))&&((this.acaStartPlanMonth == rhs.acaStartPlanMonth)||((this.acaStartPlanMonth!= null)&&this.acaStartPlanMonth.equals(rhs.acaStartPlanMonth))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.coverageEndDateInd == rhs.coverageEndDateInd)||((this.coverageEndDateInd!= null)&&this.coverageEndDateInd.equals(rhs.coverageEndDateInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.newhireWaitingPeriod == rhs.newhireWaitingPeriod)||((this.newhireWaitingPeriod!= null)&&this.newhireWaitingPeriod.equals(rhs.newhireWaitingPeriod))));
    }

}
