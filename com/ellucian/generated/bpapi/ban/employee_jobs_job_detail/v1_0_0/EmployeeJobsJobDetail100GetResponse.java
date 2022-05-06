
package com.ellucian.generated.bpapi.ban.employee_jobs_job_detail.v1_0_0;

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
    "orgnCodeTs",
    "addlEffectiveDate",
    "pcatDesc",
    "supId",
    "dfprDesc",
    "dpPays",
    "sgrpCode",
    "assgnSalary",
    "shift",
    "lcatDesc",
    "timeEntryType",
    "timeInOutInd",
    "encumbranceHrs",
    "perPayDeferAmt",
    "assnDesc",
    "strsPayCode",
    "lgcdCode",
    "supName",
    "jblnCode",
    "jcreDesc",
    "dpEffectiveDate",
    "orgnDesc",
    "regRate",
    "dfprCode",
    "perPaySalary",
    "eclsCode",
    "pictDescLeavRept",
    "locnDesc",
    "jblnDesc",
    "persPayCode",
    "persChgDate",
    "emprDesc",
    "desc",
    "status",
    "pictDesc",
    "schlDesc",
    "hrsDay",
    "annSalary",
    "jcreCode",
    "leavReptMethod",
    "contractNo",
    "salStep",
    "locnCode",
    "hrsPay",
    "payrollEffectiveDate",
    "dpFactor",
    "pictCode",
    "wkcpDesc",
    "emprCode",
    "apptPct",
    "salGrade",
    "fte",
    "pictCodeLeavRpt",
    "schlCode",
    "factor",
    "timeEntryMethod",
    "eclsEncIndLit",
    "pcatCode",
    "lcatCode",
    "salTable",
    "wkcpCode",
    "eclsDesc",
    "supervisorPosn",
    "strsAssnCode",
    "supTitle",
    "coasCodeTs",
    "effectiveDate",
    "lgcdDesc",
    "pays",
    "supervisorSuff"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsJobDetail100GetResponse {

    /**
     * Timesheet Organization
     * <p>
     * Lineage reference object : NBRJOBS_ORGN_CODE_TS
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeTs")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_ORGN_CODE_TS")
    private String orgnCodeTs;
    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("addlEffectiveDate")
    private Date addlEffectiveDate;
    @JsonProperty("pcatDesc")
    private String pcatDesc;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("supId")
    private String supId;
    @JsonProperty("dfprDesc")
    private String dfprDesc;
    /**
     * Pays
     * <p>
     * 
     * 
     */
    @JsonProperty("dpPays")
    private Double dpPays;
    /**
     * Group
     * <p>
     * Lineage reference object : NBRJOBS_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SGRP_CODE")
    private String sgrpCode;
    /**
     * Assign Salary
     * <p>
     * Lineage reference object : NBRJOBS_ASSGN_SALARY
     * 
     */
    @JsonProperty("assgnSalary")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_ASSGN_SALARY")
    private Double assgnSalary;
    /**
     * Default Shift
     * <p>
     * Lineage reference object : NBRJOBS_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SHIFT")
    private String shift;
    @JsonProperty("lcatDesc")
    private String lcatDesc;
    /**
     * Time Entry Type
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_TYPE
     * (Required)
     * 
     */
    @JsonProperty("timeEntryType")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_TIME_ENTRY_TYPE")
    private String timeEntryType;
    /**
     * Time In and Out
     * <p>
     * Lineage reference object : NBRJOBS_TIME_IN_OUT_IND
     * 
     */
    @JsonProperty("timeInOutInd")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_TIME_IN_OUT_IND")
    private String timeInOutInd;
    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : NBRJOBS_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("encumbranceHrs")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_ENCUMBRANCE_HRS")
    private Double encumbranceHrs;
    /**
     * Deferred Amount
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_DEFER_AMT
     * 
     */
    @JsonProperty("perPayDeferAmt")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PER_PAY_DEFER_AMT")
    private Double perPayDeferAmt;
    @JsonProperty("assnDesc")
    private String assnDesc;
    /**
     * California STRS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_PAY_CODE
     * 
     */
    @JsonProperty("strsPayCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_STRS_PAY_CODE")
    private String strsPayCode;
    /**
     * Longevity
     * <p>
     * Lineage reference object : NBRJOBS_LGCD_CODE
     * 
     */
    @JsonProperty("lgcdCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_LGCD_CODE")
    private String lgcdCode;
    @JsonProperty("supName")
    private String supName;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRJOBS_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_JBLN_CODE")
    private String jblnCode;
    @JsonProperty("jcreDesc")
    private String jcreDesc;
    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dpEffectiveDate")
    private Date dpEffectiveDate;
    @JsonProperty("orgnDesc")
    private String orgnDesc;
    /**
     * Rate
     * <p>
     * Lineage reference object : NBRJOBS_REG_RATE
     * 
     */
    @JsonProperty("regRate")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_REG_RATE")
    private Double regRate;
    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : NBRJOBS_DFPR_CODE
     * 
     */
    @JsonProperty("dfprCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_DFPR_CODE")
    private String dfprCode;
    /**
     * Per Pay Salary
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_SALARY
     * 
     */
    @JsonProperty("perPaySalary")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PER_PAY_SALARY")
    private Double perPaySalary;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRJOBS_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_ECLS_CODE")
    private String eclsCode;
    @JsonProperty("pictDescLeavRept")
    private String pictDescLeavRept;
    @JsonProperty("locnDesc")
    private String locnDesc;
    @JsonProperty("jblnDesc")
    private String jblnDesc;
    /**
     * California PERS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_PERS_PAY_CODE
     * 
     */
    @JsonProperty("persPayCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PERS_PAY_CODE")
    private String persPayCode;
    /**
     * Personnel Date
     * <p>
     * Lineage reference object : NBRJOBS_PERS_CHG_DATE
     * 
     */
    @JsonProperty("persChgDate")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PERS_CHG_DATE")
    private Date persChgDate;
    @JsonProperty("emprDesc")
    private String emprDesc;
    /**
     * Title
     * <p>
     * Lineage reference object : NBRJOBS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_DESC")
    private String desc;
    /**
     * Status
     * <p>
     * Lineage reference object : NBRJOBS_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_STATUS")
    private String status;
    @JsonProperty("pictDesc")
    private String pictDesc;
    @JsonProperty("schlDesc")
    private String schlDesc;
    /**
     * Hours per Day
     * <p>
     * Lineage reference object : NBRJOBS_HRS_DAY
     * (Required)
     * 
     */
    @JsonProperty("hrsDay")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_HRS_DAY")
    private Double hrsDay;
    /**
     * Annual Salary
     * <p>
     * Lineage reference object : NBRJOBS_ANN_SALARY
     * (Required)
     * 
     */
    @JsonProperty("annSalary")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_ANN_SALARY")
    private Double annSalary;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : NBRJOBS_JCRE_CODE
     * 
     */
    @JsonProperty("jcreCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_JCRE_CODE")
    private String jcreCode;
    /**
     * Leave Report Method
     * <p>
     * Lineage reference object : NBRJOBS_LEAV_REPT_METHOD
     * (Required)
     * 
     */
    @JsonProperty("leavReptMethod")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_LEAV_REPT_METHOD")
    private String leavReptMethod;
    /**
     * Contract Number
     * <p>
     * Lineage reference object : NBRJOBS_CONTRACT_NO
     * 
     */
    @JsonProperty("contractNo")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_CONTRACT_NO")
    private String contractNo;
    /**
     * Step
     * <p>
     * Lineage reference object : NBRJOBS_SAL_STEP
     * (Required)
     * 
     */
    @JsonProperty("salStep")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SAL_STEP")
    private Double salStep;
    /**
     * EEO  Location
     * <p>
     * Lineage reference object : NBRJOBS_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_LOCN_CODE")
    private String locnCode;
    /**
     * Hours per Pay
     * <p>
     * Lineage reference object : NBRJOBS_HRS_PAY
     * (Required)
     * 
     */
    @JsonProperty("hrsPay")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_HRS_PAY")
    private Double hrsPay;
    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("payrollEffectiveDate")
    private Date payrollEffectiveDate;
    /**
     * Factor
     * <p>
     * 
     * 
     */
    @JsonProperty("dpFactor")
    private Double dpFactor;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : NBRJOBS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PICT_CODE")
    private String pictCode;
    @JsonProperty("wkcpDesc")
    private String wkcpDesc;
    /**
     * Employer Code
     * <p>
     * Lineage reference object : NBRJOBS_EMPR_CODE
     * 
     */
    @JsonProperty("emprCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_EMPR_CODE")
    private String emprCode;
    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBRJOBS_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_APPT_PCT")
    private Double apptPct;
    /**
     * Grade
     * <p>
     * Lineage reference object : NBRJOBS_SAL_GRADE
     * (Required)
     * 
     */
    @JsonProperty("salGrade")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SAL_GRADE")
    private String salGrade;
    /**
     * Job FTE
     * <p>
     * Lineage reference object : NBRJOBS_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_FTE")
    private Double fte;
    /**
     * Leave Report Payroll ID
     * <p>
     * Lineage reference object : NBRJOBS_PICT_CODE_LEAV_REPT
     * (Required)
     * 
     */
    @JsonProperty("pictCodeLeavRpt")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PICT_CODE_LEAV_REPT")
    private String pictCodeLeavRpt;
    /**
     * School
     * <p>
     * Lineage reference object : NBRJOBS_SCHL_CODE
     * 
     */
    @JsonProperty("schlCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SCHL_CODE")
    private String schlCode;
    /**
     * Factor
     * <p>
     * Lineage reference object : NBRJOBS_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_FACTOR")
    private Double factor;
    /**
     * Time Entry Method
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_METHOD
     * (Required)
     * 
     */
    @JsonProperty("timeEntryMethod")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_TIME_ENTRY_METHOD")
    private String timeEntryMethod;
    /**
     * Encumbrance Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("eclsEncIndLit")
    private String eclsEncIndLit;
    /**
     * Premium Pay
     * <p>
     * Lineage reference object : NBRJOBS_PCAT_CODE
     * 
     */
    @JsonProperty("pcatCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PCAT_CODE")
    private String pcatCode;
    /**
     * Leave Category
     * <p>
     * Lineage reference object : NBRJOBS_LCAT_CODE
     * 
     */
    @JsonProperty("lcatCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_LCAT_CODE")
    private String lcatCode;
    /**
     * Table
     * <p>
     * Lineage reference object : NBRJOBS_SAL_TABLE
     * (Required)
     * 
     */
    @JsonProperty("salTable")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SAL_TABLE")
    private String salTable;
    /**
     * Workers' Compensation
     * <p>
     * Lineage reference object : NBRJOBS_WKCP_CODE
     * 
     */
    @JsonProperty("wkcpCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_WKCP_CODE")
    private String wkcpCode;
    @JsonProperty("eclsDesc")
    private String eclsDesc;
    /**
     * Position
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_POSN
     * 
     */
    @JsonProperty("supervisorPosn")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SUPERVISOR_POSN")
    private String supervisorPosn;
    /**
     * STRS Assignment Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_ASSN_CODE, Lookup lineage reference object : dual
     * 
     */
    @JsonProperty("strsAssnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_STRS_ASSN_CODE, Lookup lineage reference object : dual")
    private String strsAssnCode;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("supTitle")
    private String supTitle;
    /**
     * Timesheet COA
     * <p>
     * Lineage reference object : NBRJOBS_COAS_CODE_TS
     * 
     */
    @JsonProperty("coasCodeTs")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_COAS_CODE_TS")
    private String coasCodeTs;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBRJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonProperty("lgcdDesc")
    private String lgcdDesc;
    /**
     * Pays
     * <p>
     * Lineage reference object : NBRJOBS_PAYS
     * (Required)
     * 
     */
    @JsonProperty("pays")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_PAYS")
    private Double pays;
    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_SUFF
     * 
     */
    @JsonProperty("supervisorSuff")
    @JsonPropertyDescription("Lineage reference object : NBRJOBS_SUPERVISOR_SUFF")
    private String supervisorSuff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Timesheet Organization
     * <p>
     * Lineage reference object : NBRJOBS_ORGN_CODE_TS
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeTs")
    public String getOrgnCodeTs() {
        return orgnCodeTs;
    }

    /**
     * Timesheet Organization
     * <p>
     * Lineage reference object : NBRJOBS_ORGN_CODE_TS
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeTs")
    public void setOrgnCodeTs(String orgnCodeTs) {
        this.orgnCodeTs = orgnCodeTs;
    }

    public EmployeeJobsJobDetail100GetResponse withOrgnCodeTs(String orgnCodeTs) {
        this.orgnCodeTs = orgnCodeTs;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("addlEffectiveDate")
    public Date getAddlEffectiveDate() {
        return addlEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("addlEffectiveDate")
    public void setAddlEffectiveDate(Date addlEffectiveDate) {
        this.addlEffectiveDate = addlEffectiveDate;
    }

    public EmployeeJobsJobDetail100GetResponse withAddlEffectiveDate(Date addlEffectiveDate) {
        this.addlEffectiveDate = addlEffectiveDate;
        return this;
    }

    @JsonProperty("pcatDesc")
    public String getPcatDesc() {
        return pcatDesc;
    }

    @JsonProperty("pcatDesc")
    public void setPcatDesc(String pcatDesc) {
        this.pcatDesc = pcatDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withPcatDesc(String pcatDesc) {
        this.pcatDesc = pcatDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("supId")
    public String getSupId() {
        return supId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("supId")
    public void setSupId(String supId) {
        this.supId = supId;
    }

    public EmployeeJobsJobDetail100GetResponse withSupId(String supId) {
        this.supId = supId;
        return this;
    }

    @JsonProperty("dfprDesc")
    public String getDfprDesc() {
        return dfprDesc;
    }

    @JsonProperty("dfprDesc")
    public void setDfprDesc(String dfprDesc) {
        this.dfprDesc = dfprDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withDfprDesc(String dfprDesc) {
        this.dfprDesc = dfprDesc;
        return this;
    }

    /**
     * Pays
     * <p>
     * 
     * 
     */
    @JsonProperty("dpPays")
    public Double getDpPays() {
        return dpPays;
    }

    /**
     * Pays
     * <p>
     * 
     * 
     */
    @JsonProperty("dpPays")
    public void setDpPays(Double dpPays) {
        this.dpPays = dpPays;
    }

    public EmployeeJobsJobDetail100GetResponse withDpPays(Double dpPays) {
        this.dpPays = dpPays;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : NBRJOBS_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    public String getSgrpCode() {
        return sgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : NBRJOBS_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    public void setSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
    }

    public EmployeeJobsJobDetail100GetResponse withSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
        return this;
    }

    /**
     * Assign Salary
     * <p>
     * Lineage reference object : NBRJOBS_ASSGN_SALARY
     * 
     */
    @JsonProperty("assgnSalary")
    public Double getAssgnSalary() {
        return assgnSalary;
    }

    /**
     * Assign Salary
     * <p>
     * Lineage reference object : NBRJOBS_ASSGN_SALARY
     * 
     */
    @JsonProperty("assgnSalary")
    public void setAssgnSalary(Double assgnSalary) {
        this.assgnSalary = assgnSalary;
    }

    public EmployeeJobsJobDetail100GetResponse withAssgnSalary(Double assgnSalary) {
        this.assgnSalary = assgnSalary;
        return this;
    }

    /**
     * Default Shift
     * <p>
     * Lineage reference object : NBRJOBS_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    public String getShift() {
        return shift;
    }

    /**
     * Default Shift
     * <p>
     * Lineage reference object : NBRJOBS_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    public void setShift(String shift) {
        this.shift = shift;
    }

    public EmployeeJobsJobDetail100GetResponse withShift(String shift) {
        this.shift = shift;
        return this;
    }

    @JsonProperty("lcatDesc")
    public String getLcatDesc() {
        return lcatDesc;
    }

    @JsonProperty("lcatDesc")
    public void setLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
        return this;
    }

    /**
     * Time Entry Type
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_TYPE
     * (Required)
     * 
     */
    @JsonProperty("timeEntryType")
    public String getTimeEntryType() {
        return timeEntryType;
    }

    /**
     * Time Entry Type
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_TYPE
     * (Required)
     * 
     */
    @JsonProperty("timeEntryType")
    public void setTimeEntryType(String timeEntryType) {
        this.timeEntryType = timeEntryType;
    }

    public EmployeeJobsJobDetail100GetResponse withTimeEntryType(String timeEntryType) {
        this.timeEntryType = timeEntryType;
        return this;
    }

    /**
     * Time In and Out
     * <p>
     * Lineage reference object : NBRJOBS_TIME_IN_OUT_IND
     * 
     */
    @JsonProperty("timeInOutInd")
    public String getTimeInOutInd() {
        return timeInOutInd;
    }

    /**
     * Time In and Out
     * <p>
     * Lineage reference object : NBRJOBS_TIME_IN_OUT_IND
     * 
     */
    @JsonProperty("timeInOutInd")
    public void setTimeInOutInd(String timeInOutInd) {
        this.timeInOutInd = timeInOutInd;
    }

    public EmployeeJobsJobDetail100GetResponse withTimeInOutInd(String timeInOutInd) {
        this.timeInOutInd = timeInOutInd;
        return this;
    }

    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : NBRJOBS_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("encumbranceHrs")
    public Double getEncumbranceHrs() {
        return encumbranceHrs;
    }

    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : NBRJOBS_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("encumbranceHrs")
    public void setEncumbranceHrs(Double encumbranceHrs) {
        this.encumbranceHrs = encumbranceHrs;
    }

    public EmployeeJobsJobDetail100GetResponse withEncumbranceHrs(Double encumbranceHrs) {
        this.encumbranceHrs = encumbranceHrs;
        return this;
    }

    /**
     * Deferred Amount
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_DEFER_AMT
     * 
     */
    @JsonProperty("perPayDeferAmt")
    public Double getPerPayDeferAmt() {
        return perPayDeferAmt;
    }

    /**
     * Deferred Amount
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_DEFER_AMT
     * 
     */
    @JsonProperty("perPayDeferAmt")
    public void setPerPayDeferAmt(Double perPayDeferAmt) {
        this.perPayDeferAmt = perPayDeferAmt;
    }

    public EmployeeJobsJobDetail100GetResponse withPerPayDeferAmt(Double perPayDeferAmt) {
        this.perPayDeferAmt = perPayDeferAmt;
        return this;
    }

    @JsonProperty("assnDesc")
    public String getAssnDesc() {
        return assnDesc;
    }

    @JsonProperty("assnDesc")
    public void setAssnDesc(String assnDesc) {
        this.assnDesc = assnDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withAssnDesc(String assnDesc) {
        this.assnDesc = assnDesc;
        return this;
    }

    /**
     * California STRS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_PAY_CODE
     * 
     */
    @JsonProperty("strsPayCode")
    public String getStrsPayCode() {
        return strsPayCode;
    }

    /**
     * California STRS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_PAY_CODE
     * 
     */
    @JsonProperty("strsPayCode")
    public void setStrsPayCode(String strsPayCode) {
        this.strsPayCode = strsPayCode;
    }

    public EmployeeJobsJobDetail100GetResponse withStrsPayCode(String strsPayCode) {
        this.strsPayCode = strsPayCode;
        return this;
    }

    /**
     * Longevity
     * <p>
     * Lineage reference object : NBRJOBS_LGCD_CODE
     * 
     */
    @JsonProperty("lgcdCode")
    public String getLgcdCode() {
        return lgcdCode;
    }

    /**
     * Longevity
     * <p>
     * Lineage reference object : NBRJOBS_LGCD_CODE
     * 
     */
    @JsonProperty("lgcdCode")
    public void setLgcdCode(String lgcdCode) {
        this.lgcdCode = lgcdCode;
    }

    public EmployeeJobsJobDetail100GetResponse withLgcdCode(String lgcdCode) {
        this.lgcdCode = lgcdCode;
        return this;
    }

    @JsonProperty("supName")
    public String getSupName() {
        return supName;
    }

    @JsonProperty("supName")
    public void setSupName(String supName) {
        this.supName = supName;
    }

    public EmployeeJobsJobDetail100GetResponse withSupName(String supName) {
        this.supName = supName;
        return this;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRJOBS_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public String getJblnCode() {
        return jblnCode;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRJOBS_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public void setJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
    }

    public EmployeeJobsJobDetail100GetResponse withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
        return this;
    }

    @JsonProperty("jcreDesc")
    public String getJcreDesc() {
        return jcreDesc;
    }

    @JsonProperty("jcreDesc")
    public void setJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dpEffectiveDate")
    public Date getDpEffectiveDate() {
        return dpEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dpEffectiveDate")
    public void setDpEffectiveDate(Date dpEffectiveDate) {
        this.dpEffectiveDate = dpEffectiveDate;
    }

    public EmployeeJobsJobDetail100GetResponse withDpEffectiveDate(Date dpEffectiveDate) {
        this.dpEffectiveDate = dpEffectiveDate;
        return this;
    }

    @JsonProperty("orgnDesc")
    public String getOrgnDesc() {
        return orgnDesc;
    }

    @JsonProperty("orgnDesc")
    public void setOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : NBRJOBS_REG_RATE
     * 
     */
    @JsonProperty("regRate")
    public Double getRegRate() {
        return regRate;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : NBRJOBS_REG_RATE
     * 
     */
    @JsonProperty("regRate")
    public void setRegRate(Double regRate) {
        this.regRate = regRate;
    }

    public EmployeeJobsJobDetail100GetResponse withRegRate(Double regRate) {
        this.regRate = regRate;
        return this;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : NBRJOBS_DFPR_CODE
     * 
     */
    @JsonProperty("dfprCode")
    public String getDfprCode() {
        return dfprCode;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : NBRJOBS_DFPR_CODE
     * 
     */
    @JsonProperty("dfprCode")
    public void setDfprCode(String dfprCode) {
        this.dfprCode = dfprCode;
    }

    public EmployeeJobsJobDetail100GetResponse withDfprCode(String dfprCode) {
        this.dfprCode = dfprCode;
        return this;
    }

    /**
     * Per Pay Salary
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_SALARY
     * 
     */
    @JsonProperty("perPaySalary")
    public Double getPerPaySalary() {
        return perPaySalary;
    }

    /**
     * Per Pay Salary
     * <p>
     * Lineage reference object : NBRJOBS_PER_PAY_SALARY
     * 
     */
    @JsonProperty("perPaySalary")
    public void setPerPaySalary(Double perPaySalary) {
        this.perPaySalary = perPaySalary;
    }

    public EmployeeJobsJobDetail100GetResponse withPerPaySalary(Double perPaySalary) {
        this.perPaySalary = perPaySalary;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRJOBS_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public String getEclsCode() {
        return eclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRJOBS_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public EmployeeJobsJobDetail100GetResponse withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    @JsonProperty("pictDescLeavRept")
    public String getPictDescLeavRept() {
        return pictDescLeavRept;
    }

    @JsonProperty("pictDescLeavRept")
    public void setPictDescLeavRept(String pictDescLeavRept) {
        this.pictDescLeavRept = pictDescLeavRept;
    }

    public EmployeeJobsJobDetail100GetResponse withPictDescLeavRept(String pictDescLeavRept) {
        this.pictDescLeavRept = pictDescLeavRept;
        return this;
    }

    @JsonProperty("locnDesc")
    public String getLocnDesc() {
        return locnDesc;
    }

    @JsonProperty("locnDesc")
    public void setLocnDesc(String locnDesc) {
        this.locnDesc = locnDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withLocnDesc(String locnDesc) {
        this.locnDesc = locnDesc;
        return this;
    }

    @JsonProperty("jblnDesc")
    public String getJblnDesc() {
        return jblnDesc;
    }

    @JsonProperty("jblnDesc")
    public void setJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
        return this;
    }

    /**
     * California PERS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_PERS_PAY_CODE
     * 
     */
    @JsonProperty("persPayCode")
    public String getPersPayCode() {
        return persPayCode;
    }

    /**
     * California PERS Pay Code
     * <p>
     * Lineage reference object : NBRJOBS_PERS_PAY_CODE
     * 
     */
    @JsonProperty("persPayCode")
    public void setPersPayCode(String persPayCode) {
        this.persPayCode = persPayCode;
    }

    public EmployeeJobsJobDetail100GetResponse withPersPayCode(String persPayCode) {
        this.persPayCode = persPayCode;
        return this;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : NBRJOBS_PERS_CHG_DATE
     * 
     */
    @JsonProperty("persChgDate")
    public Date getPersChgDate() {
        return persChgDate;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : NBRJOBS_PERS_CHG_DATE
     * 
     */
    @JsonProperty("persChgDate")
    public void setPersChgDate(Date persChgDate) {
        this.persChgDate = persChgDate;
    }

    public EmployeeJobsJobDetail100GetResponse withPersChgDate(Date persChgDate) {
        this.persChgDate = persChgDate;
        return this;
    }

    @JsonProperty("emprDesc")
    public String getEmprDesc() {
        return emprDesc;
    }

    @JsonProperty("emprDesc")
    public void setEmprDesc(String emprDesc) {
        this.emprDesc = emprDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withEmprDesc(String emprDesc) {
        this.emprDesc = emprDesc;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : NBRJOBS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : NBRJOBS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeJobsJobDetail100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBRJOBS_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBRJOBS_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeJobsJobDetail100GetResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("pictDesc")
    public String getPictDesc() {
        return pictDesc;
    }

    @JsonProperty("pictDesc")
    public void setPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
        return this;
    }

    @JsonProperty("schlDesc")
    public String getSchlDesc() {
        return schlDesc;
    }

    @JsonProperty("schlDesc")
    public void setSchlDesc(String schlDesc) {
        this.schlDesc = schlDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withSchlDesc(String schlDesc) {
        this.schlDesc = schlDesc;
        return this;
    }

    /**
     * Hours per Day
     * <p>
     * Lineage reference object : NBRJOBS_HRS_DAY
     * (Required)
     * 
     */
    @JsonProperty("hrsDay")
    public Double getHrsDay() {
        return hrsDay;
    }

    /**
     * Hours per Day
     * <p>
     * Lineage reference object : NBRJOBS_HRS_DAY
     * (Required)
     * 
     */
    @JsonProperty("hrsDay")
    public void setHrsDay(Double hrsDay) {
        this.hrsDay = hrsDay;
    }

    public EmployeeJobsJobDetail100GetResponse withHrsDay(Double hrsDay) {
        this.hrsDay = hrsDay;
        return this;
    }

    /**
     * Annual Salary
     * <p>
     * Lineage reference object : NBRJOBS_ANN_SALARY
     * (Required)
     * 
     */
    @JsonProperty("annSalary")
    public Double getAnnSalary() {
        return annSalary;
    }

    /**
     * Annual Salary
     * <p>
     * Lineage reference object : NBRJOBS_ANN_SALARY
     * (Required)
     * 
     */
    @JsonProperty("annSalary")
    public void setAnnSalary(Double annSalary) {
        this.annSalary = annSalary;
    }

    public EmployeeJobsJobDetail100GetResponse withAnnSalary(Double annSalary) {
        this.annSalary = annSalary;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : NBRJOBS_JCRE_CODE
     * 
     */
    @JsonProperty("jcreCode")
    public String getJcreCode() {
        return jcreCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : NBRJOBS_JCRE_CODE
     * 
     */
    @JsonProperty("jcreCode")
    public void setJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
    }

    public EmployeeJobsJobDetail100GetResponse withJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
        return this;
    }

    /**
     * Leave Report Method
     * <p>
     * Lineage reference object : NBRJOBS_LEAV_REPT_METHOD
     * (Required)
     * 
     */
    @JsonProperty("leavReptMethod")
    public String getLeavReptMethod() {
        return leavReptMethod;
    }

    /**
     * Leave Report Method
     * <p>
     * Lineage reference object : NBRJOBS_LEAV_REPT_METHOD
     * (Required)
     * 
     */
    @JsonProperty("leavReptMethod")
    public void setLeavReptMethod(String leavReptMethod) {
        this.leavReptMethod = leavReptMethod;
    }

    public EmployeeJobsJobDetail100GetResponse withLeavReptMethod(String leavReptMethod) {
        this.leavReptMethod = leavReptMethod;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : NBRJOBS_CONTRACT_NO
     * 
     */
    @JsonProperty("contractNo")
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : NBRJOBS_CONTRACT_NO
     * 
     */
    @JsonProperty("contractNo")
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public EmployeeJobsJobDetail100GetResponse withContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : NBRJOBS_SAL_STEP
     * (Required)
     * 
     */
    @JsonProperty("salStep")
    public Double getSalStep() {
        return salStep;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : NBRJOBS_SAL_STEP
     * (Required)
     * 
     */
    @JsonProperty("salStep")
    public void setSalStep(Double salStep) {
        this.salStep = salStep;
    }

    public EmployeeJobsJobDetail100GetResponse withSalStep(Double salStep) {
        this.salStep = salStep;
        return this;
    }

    /**
     * EEO  Location
     * <p>
     * Lineage reference object : NBRJOBS_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * EEO  Location
     * <p>
     * Lineage reference object : NBRJOBS_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public EmployeeJobsJobDetail100GetResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Hours per Pay
     * <p>
     * Lineage reference object : NBRJOBS_HRS_PAY
     * (Required)
     * 
     */
    @JsonProperty("hrsPay")
    public Double getHrsPay() {
        return hrsPay;
    }

    /**
     * Hours per Pay
     * <p>
     * Lineage reference object : NBRJOBS_HRS_PAY
     * (Required)
     * 
     */
    @JsonProperty("hrsPay")
    public void setHrsPay(Double hrsPay) {
        this.hrsPay = hrsPay;
    }

    public EmployeeJobsJobDetail100GetResponse withHrsPay(Double hrsPay) {
        this.hrsPay = hrsPay;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("payrollEffectiveDate")
    public Date getPayrollEffectiveDate() {
        return payrollEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("payrollEffectiveDate")
    public void setPayrollEffectiveDate(Date payrollEffectiveDate) {
        this.payrollEffectiveDate = payrollEffectiveDate;
    }

    public EmployeeJobsJobDetail100GetResponse withPayrollEffectiveDate(Date payrollEffectiveDate) {
        this.payrollEffectiveDate = payrollEffectiveDate;
        return this;
    }

    /**
     * Factor
     * <p>
     * 
     * 
     */
    @JsonProperty("dpFactor")
    public Double getDpFactor() {
        return dpFactor;
    }

    /**
     * Factor
     * <p>
     * 
     * 
     */
    @JsonProperty("dpFactor")
    public void setDpFactor(Double dpFactor) {
        this.dpFactor = dpFactor;
    }

    public EmployeeJobsJobDetail100GetResponse withDpFactor(Double dpFactor) {
        this.dpFactor = dpFactor;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : NBRJOBS_PICT_CODE
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
     * Lineage reference object : NBRJOBS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public EmployeeJobsJobDetail100GetResponse withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    @JsonProperty("wkcpDesc")
    public String getWkcpDesc() {
        return wkcpDesc;
    }

    @JsonProperty("wkcpDesc")
    public void setWkcpDesc(String wkcpDesc) {
        this.wkcpDesc = wkcpDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withWkcpDesc(String wkcpDesc) {
        this.wkcpDesc = wkcpDesc;
        return this;
    }

    /**
     * Employer Code
     * <p>
     * Lineage reference object : NBRJOBS_EMPR_CODE
     * 
     */
    @JsonProperty("emprCode")
    public String getEmprCode() {
        return emprCode;
    }

    /**
     * Employer Code
     * <p>
     * Lineage reference object : NBRJOBS_EMPR_CODE
     * 
     */
    @JsonProperty("emprCode")
    public void setEmprCode(String emprCode) {
        this.emprCode = emprCode;
    }

    public EmployeeJobsJobDetail100GetResponse withEmprCode(String emprCode) {
        this.emprCode = emprCode;
        return this;
    }

    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBRJOBS_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    public Double getApptPct() {
        return apptPct;
    }

    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBRJOBS_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    public void setApptPct(Double apptPct) {
        this.apptPct = apptPct;
    }

    public EmployeeJobsJobDetail100GetResponse withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : NBRJOBS_SAL_GRADE
     * (Required)
     * 
     */
    @JsonProperty("salGrade")
    public String getSalGrade() {
        return salGrade;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : NBRJOBS_SAL_GRADE
     * (Required)
     * 
     */
    @JsonProperty("salGrade")
    public void setSalGrade(String salGrade) {
        this.salGrade = salGrade;
    }

    public EmployeeJobsJobDetail100GetResponse withSalGrade(String salGrade) {
        this.salGrade = salGrade;
        return this;
    }

    /**
     * Job FTE
     * <p>
     * Lineage reference object : NBRJOBS_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    public Double getFte() {
        return fte;
    }

    /**
     * Job FTE
     * <p>
     * Lineage reference object : NBRJOBS_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    public void setFte(Double fte) {
        this.fte = fte;
    }

    public EmployeeJobsJobDetail100GetResponse withFte(Double fte) {
        this.fte = fte;
        return this;
    }

    /**
     * Leave Report Payroll ID
     * <p>
     * Lineage reference object : NBRJOBS_PICT_CODE_LEAV_REPT
     * (Required)
     * 
     */
    @JsonProperty("pictCodeLeavRpt")
    public String getPictCodeLeavRpt() {
        return pictCodeLeavRpt;
    }

    /**
     * Leave Report Payroll ID
     * <p>
     * Lineage reference object : NBRJOBS_PICT_CODE_LEAV_REPT
     * (Required)
     * 
     */
    @JsonProperty("pictCodeLeavRpt")
    public void setPictCodeLeavRpt(String pictCodeLeavRpt) {
        this.pictCodeLeavRpt = pictCodeLeavRpt;
    }

    public EmployeeJobsJobDetail100GetResponse withPictCodeLeavRpt(String pictCodeLeavRpt) {
        this.pictCodeLeavRpt = pictCodeLeavRpt;
        return this;
    }

    /**
     * School
     * <p>
     * Lineage reference object : NBRJOBS_SCHL_CODE
     * 
     */
    @JsonProperty("schlCode")
    public String getSchlCode() {
        return schlCode;
    }

    /**
     * School
     * <p>
     * Lineage reference object : NBRJOBS_SCHL_CODE
     * 
     */
    @JsonProperty("schlCode")
    public void setSchlCode(String schlCode) {
        this.schlCode = schlCode;
    }

    public EmployeeJobsJobDetail100GetResponse withSchlCode(String schlCode) {
        this.schlCode = schlCode;
        return this;
    }

    /**
     * Factor
     * <p>
     * Lineage reference object : NBRJOBS_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * Factor
     * <p>
     * Lineage reference object : NBRJOBS_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public EmployeeJobsJobDetail100GetResponse withFactor(Double factor) {
        this.factor = factor;
        return this;
    }

    /**
     * Time Entry Method
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_METHOD
     * (Required)
     * 
     */
    @JsonProperty("timeEntryMethod")
    public String getTimeEntryMethod() {
        return timeEntryMethod;
    }

    /**
     * Time Entry Method
     * <p>
     * Lineage reference object : NBRJOBS_TIME_ENTRY_METHOD
     * (Required)
     * 
     */
    @JsonProperty("timeEntryMethod")
    public void setTimeEntryMethod(String timeEntryMethod) {
        this.timeEntryMethod = timeEntryMethod;
    }

    public EmployeeJobsJobDetail100GetResponse withTimeEntryMethod(String timeEntryMethod) {
        this.timeEntryMethod = timeEntryMethod;
        return this;
    }

    /**
     * Encumbrance Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("eclsEncIndLit")
    public String getEclsEncIndLit() {
        return eclsEncIndLit;
    }

    /**
     * Encumbrance Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("eclsEncIndLit")
    public void setEclsEncIndLit(String eclsEncIndLit) {
        this.eclsEncIndLit = eclsEncIndLit;
    }

    public EmployeeJobsJobDetail100GetResponse withEclsEncIndLit(String eclsEncIndLit) {
        this.eclsEncIndLit = eclsEncIndLit;
        return this;
    }

    /**
     * Premium Pay
     * <p>
     * Lineage reference object : NBRJOBS_PCAT_CODE
     * 
     */
    @JsonProperty("pcatCode")
    public String getPcatCode() {
        return pcatCode;
    }

    /**
     * Premium Pay
     * <p>
     * Lineage reference object : NBRJOBS_PCAT_CODE
     * 
     */
    @JsonProperty("pcatCode")
    public void setPcatCode(String pcatCode) {
        this.pcatCode = pcatCode;
    }

    public EmployeeJobsJobDetail100GetResponse withPcatCode(String pcatCode) {
        this.pcatCode = pcatCode;
        return this;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : NBRJOBS_LCAT_CODE
     * 
     */
    @JsonProperty("lcatCode")
    public String getLcatCode() {
        return lcatCode;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : NBRJOBS_LCAT_CODE
     * 
     */
    @JsonProperty("lcatCode")
    public void setLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
    }

    public EmployeeJobsJobDetail100GetResponse withLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
        return this;
    }

    /**
     * Table
     * <p>
     * Lineage reference object : NBRJOBS_SAL_TABLE
     * (Required)
     * 
     */
    @JsonProperty("salTable")
    public String getSalTable() {
        return salTable;
    }

    /**
     * Table
     * <p>
     * Lineage reference object : NBRJOBS_SAL_TABLE
     * (Required)
     * 
     */
    @JsonProperty("salTable")
    public void setSalTable(String salTable) {
        this.salTable = salTable;
    }

    public EmployeeJobsJobDetail100GetResponse withSalTable(String salTable) {
        this.salTable = salTable;
        return this;
    }

    /**
     * Workers' Compensation
     * <p>
     * Lineage reference object : NBRJOBS_WKCP_CODE
     * 
     */
    @JsonProperty("wkcpCode")
    public String getWkcpCode() {
        return wkcpCode;
    }

    /**
     * Workers' Compensation
     * <p>
     * Lineage reference object : NBRJOBS_WKCP_CODE
     * 
     */
    @JsonProperty("wkcpCode")
    public void setWkcpCode(String wkcpCode) {
        this.wkcpCode = wkcpCode;
    }

    public EmployeeJobsJobDetail100GetResponse withWkcpCode(String wkcpCode) {
        this.wkcpCode = wkcpCode;
        return this;
    }

    @JsonProperty("eclsDesc")
    public String getEclsDesc() {
        return eclsDesc;
    }

    @JsonProperty("eclsDesc")
    public void setEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_POSN
     * 
     */
    @JsonProperty("supervisorPosn")
    public String getSupervisorPosn() {
        return supervisorPosn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_POSN
     * 
     */
    @JsonProperty("supervisorPosn")
    public void setSupervisorPosn(String supervisorPosn) {
        this.supervisorPosn = supervisorPosn;
    }

    public EmployeeJobsJobDetail100GetResponse withSupervisorPosn(String supervisorPosn) {
        this.supervisorPosn = supervisorPosn;
        return this;
    }

    /**
     * STRS Assignment Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_ASSN_CODE, Lookup lineage reference object : dual
     * 
     */
    @JsonProperty("strsAssnCode")
    public String getStrsAssnCode() {
        return strsAssnCode;
    }

    /**
     * STRS Assignment Code
     * <p>
     * Lineage reference object : NBRJOBS_STRS_ASSN_CODE, Lookup lineage reference object : dual
     * 
     */
    @JsonProperty("strsAssnCode")
    public void setStrsAssnCode(String strsAssnCode) {
        this.strsAssnCode = strsAssnCode;
    }

    public EmployeeJobsJobDetail100GetResponse withStrsAssnCode(String strsAssnCode) {
        this.strsAssnCode = strsAssnCode;
        return this;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("supTitle")
    public String getSupTitle() {
        return supTitle;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("supTitle")
    public void setSupTitle(String supTitle) {
        this.supTitle = supTitle;
    }

    public EmployeeJobsJobDetail100GetResponse withSupTitle(String supTitle) {
        this.supTitle = supTitle;
        return this;
    }

    /**
     * Timesheet COA
     * <p>
     * Lineage reference object : NBRJOBS_COAS_CODE_TS
     * 
     */
    @JsonProperty("coasCodeTs")
    public String getCoasCodeTs() {
        return coasCodeTs;
    }

    /**
     * Timesheet COA
     * <p>
     * Lineage reference object : NBRJOBS_COAS_CODE_TS
     * 
     */
    @JsonProperty("coasCodeTs")
    public void setCoasCodeTs(String coasCodeTs) {
        this.coasCodeTs = coasCodeTs;
    }

    public EmployeeJobsJobDetail100GetResponse withCoasCodeTs(String coasCodeTs) {
        this.coasCodeTs = coasCodeTs;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBRJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : NBRJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public EmployeeJobsJobDetail100GetResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    @JsonProperty("lgcdDesc")
    public String getLgcdDesc() {
        return lgcdDesc;
    }

    @JsonProperty("lgcdDesc")
    public void setLgcdDesc(String lgcdDesc) {
        this.lgcdDesc = lgcdDesc;
    }

    public EmployeeJobsJobDetail100GetResponse withLgcdDesc(String lgcdDesc) {
        this.lgcdDesc = lgcdDesc;
        return this;
    }

    /**
     * Pays
     * <p>
     * Lineage reference object : NBRJOBS_PAYS
     * (Required)
     * 
     */
    @JsonProperty("pays")
    public Double getPays() {
        return pays;
    }

    /**
     * Pays
     * <p>
     * Lineage reference object : NBRJOBS_PAYS
     * (Required)
     * 
     */
    @JsonProperty("pays")
    public void setPays(Double pays) {
        this.pays = pays;
    }

    public EmployeeJobsJobDetail100GetResponse withPays(Double pays) {
        this.pays = pays;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_SUFF
     * 
     */
    @JsonProperty("supervisorSuff")
    public String getSupervisorSuff() {
        return supervisorSuff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRJOBS_SUPERVISOR_SUFF
     * 
     */
    @JsonProperty("supervisorSuff")
    public void setSupervisorSuff(String supervisorSuff) {
        this.supervisorSuff = supervisorSuff;
    }

    public EmployeeJobsJobDetail100GetResponse withSupervisorSuff(String supervisorSuff) {
        this.supervisorSuff = supervisorSuff;
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

    public EmployeeJobsJobDetail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsJobDetail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orgnCodeTs");
        sb.append('=');
        sb.append(((this.orgnCodeTs == null)?"<null>":this.orgnCodeTs));
        sb.append(',');
        sb.append("addlEffectiveDate");
        sb.append('=');
        sb.append(((this.addlEffectiveDate == null)?"<null>":this.addlEffectiveDate));
        sb.append(',');
        sb.append("pcatDesc");
        sb.append('=');
        sb.append(((this.pcatDesc == null)?"<null>":this.pcatDesc));
        sb.append(',');
        sb.append("supId");
        sb.append('=');
        sb.append(((this.supId == null)?"<null>":this.supId));
        sb.append(',');
        sb.append("dfprDesc");
        sb.append('=');
        sb.append(((this.dfprDesc == null)?"<null>":this.dfprDesc));
        sb.append(',');
        sb.append("dpPays");
        sb.append('=');
        sb.append(((this.dpPays == null)?"<null>":this.dpPays));
        sb.append(',');
        sb.append("sgrpCode");
        sb.append('=');
        sb.append(((this.sgrpCode == null)?"<null>":this.sgrpCode));
        sb.append(',');
        sb.append("assgnSalary");
        sb.append('=');
        sb.append(((this.assgnSalary == null)?"<null>":this.assgnSalary));
        sb.append(',');
        sb.append("shift");
        sb.append('=');
        sb.append(((this.shift == null)?"<null>":this.shift));
        sb.append(',');
        sb.append("lcatDesc");
        sb.append('=');
        sb.append(((this.lcatDesc == null)?"<null>":this.lcatDesc));
        sb.append(',');
        sb.append("timeEntryType");
        sb.append('=');
        sb.append(((this.timeEntryType == null)?"<null>":this.timeEntryType));
        sb.append(',');
        sb.append("timeInOutInd");
        sb.append('=');
        sb.append(((this.timeInOutInd == null)?"<null>":this.timeInOutInd));
        sb.append(',');
        sb.append("encumbranceHrs");
        sb.append('=');
        sb.append(((this.encumbranceHrs == null)?"<null>":this.encumbranceHrs));
        sb.append(',');
        sb.append("perPayDeferAmt");
        sb.append('=');
        sb.append(((this.perPayDeferAmt == null)?"<null>":this.perPayDeferAmt));
        sb.append(',');
        sb.append("assnDesc");
        sb.append('=');
        sb.append(((this.assnDesc == null)?"<null>":this.assnDesc));
        sb.append(',');
        sb.append("strsPayCode");
        sb.append('=');
        sb.append(((this.strsPayCode == null)?"<null>":this.strsPayCode));
        sb.append(',');
        sb.append("lgcdCode");
        sb.append('=');
        sb.append(((this.lgcdCode == null)?"<null>":this.lgcdCode));
        sb.append(',');
        sb.append("supName");
        sb.append('=');
        sb.append(((this.supName == null)?"<null>":this.supName));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("jcreDesc");
        sb.append('=');
        sb.append(((this.jcreDesc == null)?"<null>":this.jcreDesc));
        sb.append(',');
        sb.append("dpEffectiveDate");
        sb.append('=');
        sb.append(((this.dpEffectiveDate == null)?"<null>":this.dpEffectiveDate));
        sb.append(',');
        sb.append("orgnDesc");
        sb.append('=');
        sb.append(((this.orgnDesc == null)?"<null>":this.orgnDesc));
        sb.append(',');
        sb.append("regRate");
        sb.append('=');
        sb.append(((this.regRate == null)?"<null>":this.regRate));
        sb.append(',');
        sb.append("dfprCode");
        sb.append('=');
        sb.append(((this.dfprCode == null)?"<null>":this.dfprCode));
        sb.append(',');
        sb.append("perPaySalary");
        sb.append('=');
        sb.append(((this.perPaySalary == null)?"<null>":this.perPaySalary));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("pictDescLeavRept");
        sb.append('=');
        sb.append(((this.pictDescLeavRept == null)?"<null>":this.pictDescLeavRept));
        sb.append(',');
        sb.append("locnDesc");
        sb.append('=');
        sb.append(((this.locnDesc == null)?"<null>":this.locnDesc));
        sb.append(',');
        sb.append("jblnDesc");
        sb.append('=');
        sb.append(((this.jblnDesc == null)?"<null>":this.jblnDesc));
        sb.append(',');
        sb.append("persPayCode");
        sb.append('=');
        sb.append(((this.persPayCode == null)?"<null>":this.persPayCode));
        sb.append(',');
        sb.append("persChgDate");
        sb.append('=');
        sb.append(((this.persChgDate == null)?"<null>":this.persChgDate));
        sb.append(',');
        sb.append("emprDesc");
        sb.append('=');
        sb.append(((this.emprDesc == null)?"<null>":this.emprDesc));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("pictDesc");
        sb.append('=');
        sb.append(((this.pictDesc == null)?"<null>":this.pictDesc));
        sb.append(',');
        sb.append("schlDesc");
        sb.append('=');
        sb.append(((this.schlDesc == null)?"<null>":this.schlDesc));
        sb.append(',');
        sb.append("hrsDay");
        sb.append('=');
        sb.append(((this.hrsDay == null)?"<null>":this.hrsDay));
        sb.append(',');
        sb.append("annSalary");
        sb.append('=');
        sb.append(((this.annSalary == null)?"<null>":this.annSalary));
        sb.append(',');
        sb.append("jcreCode");
        sb.append('=');
        sb.append(((this.jcreCode == null)?"<null>":this.jcreCode));
        sb.append(',');
        sb.append("leavReptMethod");
        sb.append('=');
        sb.append(((this.leavReptMethod == null)?"<null>":this.leavReptMethod));
        sb.append(',');
        sb.append("contractNo");
        sb.append('=');
        sb.append(((this.contractNo == null)?"<null>":this.contractNo));
        sb.append(',');
        sb.append("salStep");
        sb.append('=');
        sb.append(((this.salStep == null)?"<null>":this.salStep));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("hrsPay");
        sb.append('=');
        sb.append(((this.hrsPay == null)?"<null>":this.hrsPay));
        sb.append(',');
        sb.append("payrollEffectiveDate");
        sb.append('=');
        sb.append(((this.payrollEffectiveDate == null)?"<null>":this.payrollEffectiveDate));
        sb.append(',');
        sb.append("dpFactor");
        sb.append('=');
        sb.append(((this.dpFactor == null)?"<null>":this.dpFactor));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("wkcpDesc");
        sb.append('=');
        sb.append(((this.wkcpDesc == null)?"<null>":this.wkcpDesc));
        sb.append(',');
        sb.append("emprCode");
        sb.append('=');
        sb.append(((this.emprCode == null)?"<null>":this.emprCode));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("salGrade");
        sb.append('=');
        sb.append(((this.salGrade == null)?"<null>":this.salGrade));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("pictCodeLeavRpt");
        sb.append('=');
        sb.append(((this.pictCodeLeavRpt == null)?"<null>":this.pictCodeLeavRpt));
        sb.append(',');
        sb.append("schlCode");
        sb.append('=');
        sb.append(((this.schlCode == null)?"<null>":this.schlCode));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("timeEntryMethod");
        sb.append('=');
        sb.append(((this.timeEntryMethod == null)?"<null>":this.timeEntryMethod));
        sb.append(',');
        sb.append("eclsEncIndLit");
        sb.append('=');
        sb.append(((this.eclsEncIndLit == null)?"<null>":this.eclsEncIndLit));
        sb.append(',');
        sb.append("pcatCode");
        sb.append('=');
        sb.append(((this.pcatCode == null)?"<null>":this.pcatCode));
        sb.append(',');
        sb.append("lcatCode");
        sb.append('=');
        sb.append(((this.lcatCode == null)?"<null>":this.lcatCode));
        sb.append(',');
        sb.append("salTable");
        sb.append('=');
        sb.append(((this.salTable == null)?"<null>":this.salTable));
        sb.append(',');
        sb.append("wkcpCode");
        sb.append('=');
        sb.append(((this.wkcpCode == null)?"<null>":this.wkcpCode));
        sb.append(',');
        sb.append("eclsDesc");
        sb.append('=');
        sb.append(((this.eclsDesc == null)?"<null>":this.eclsDesc));
        sb.append(',');
        sb.append("supervisorPosn");
        sb.append('=');
        sb.append(((this.supervisorPosn == null)?"<null>":this.supervisorPosn));
        sb.append(',');
        sb.append("strsAssnCode");
        sb.append('=');
        sb.append(((this.strsAssnCode == null)?"<null>":this.strsAssnCode));
        sb.append(',');
        sb.append("supTitle");
        sb.append('=');
        sb.append(((this.supTitle == null)?"<null>":this.supTitle));
        sb.append(',');
        sb.append("coasCodeTs");
        sb.append('=');
        sb.append(((this.coasCodeTs == null)?"<null>":this.coasCodeTs));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("lgcdDesc");
        sb.append('=');
        sb.append(((this.lgcdDesc == null)?"<null>":this.lgcdDesc));
        sb.append(',');
        sb.append("pays");
        sb.append('=');
        sb.append(((this.pays == null)?"<null>":this.pays));
        sb.append(',');
        sb.append("supervisorSuff");
        sb.append('=');
        sb.append(((this.supervisorSuff == null)?"<null>":this.supervisorSuff));
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
        result = ((result* 31)+((this.orgnCodeTs == null)? 0 :this.orgnCodeTs.hashCode()));
        result = ((result* 31)+((this.addlEffectiveDate == null)? 0 :this.addlEffectiveDate.hashCode()));
        result = ((result* 31)+((this.pcatDesc == null)? 0 :this.pcatDesc.hashCode()));
        result = ((result* 31)+((this.supId == null)? 0 :this.supId.hashCode()));
        result = ((result* 31)+((this.dfprDesc == null)? 0 :this.dfprDesc.hashCode()));
        result = ((result* 31)+((this.dpPays == null)? 0 :this.dpPays.hashCode()));
        result = ((result* 31)+((this.sgrpCode == null)? 0 :this.sgrpCode.hashCode()));
        result = ((result* 31)+((this.assgnSalary == null)? 0 :this.assgnSalary.hashCode()));
        result = ((result* 31)+((this.shift == null)? 0 :this.shift.hashCode()));
        result = ((result* 31)+((this.lcatDesc == null)? 0 :this.lcatDesc.hashCode()));
        result = ((result* 31)+((this.timeEntryType == null)? 0 :this.timeEntryType.hashCode()));
        result = ((result* 31)+((this.timeInOutInd == null)? 0 :this.timeInOutInd.hashCode()));
        result = ((result* 31)+((this.encumbranceHrs == null)? 0 :this.encumbranceHrs.hashCode()));
        result = ((result* 31)+((this.perPayDeferAmt == null)? 0 :this.perPayDeferAmt.hashCode()));
        result = ((result* 31)+((this.assnDesc == null)? 0 :this.assnDesc.hashCode()));
        result = ((result* 31)+((this.strsPayCode == null)? 0 :this.strsPayCode.hashCode()));
        result = ((result* 31)+((this.lgcdCode == null)? 0 :this.lgcdCode.hashCode()));
        result = ((result* 31)+((this.supName == null)? 0 :this.supName.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.jcreDesc == null)? 0 :this.jcreDesc.hashCode()));
        result = ((result* 31)+((this.dpEffectiveDate == null)? 0 :this.dpEffectiveDate.hashCode()));
        result = ((result* 31)+((this.orgnDesc == null)? 0 :this.orgnDesc.hashCode()));
        result = ((result* 31)+((this.regRate == null)? 0 :this.regRate.hashCode()));
        result = ((result* 31)+((this.dfprCode == null)? 0 :this.dfprCode.hashCode()));
        result = ((result* 31)+((this.perPaySalary == null)? 0 :this.perPaySalary.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.pictDescLeavRept == null)? 0 :this.pictDescLeavRept.hashCode()));
        result = ((result* 31)+((this.locnDesc == null)? 0 :this.locnDesc.hashCode()));
        result = ((result* 31)+((this.jblnDesc == null)? 0 :this.jblnDesc.hashCode()));
        result = ((result* 31)+((this.persPayCode == null)? 0 :this.persPayCode.hashCode()));
        result = ((result* 31)+((this.persChgDate == null)? 0 :this.persChgDate.hashCode()));
        result = ((result* 31)+((this.emprDesc == null)? 0 :this.emprDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.pictDesc == null)? 0 :this.pictDesc.hashCode()));
        result = ((result* 31)+((this.schlDesc == null)? 0 :this.schlDesc.hashCode()));
        result = ((result* 31)+((this.hrsDay == null)? 0 :this.hrsDay.hashCode()));
        result = ((result* 31)+((this.annSalary == null)? 0 :this.annSalary.hashCode()));
        result = ((result* 31)+((this.jcreCode == null)? 0 :this.jcreCode.hashCode()));
        result = ((result* 31)+((this.leavReptMethod == null)? 0 :this.leavReptMethod.hashCode()));
        result = ((result* 31)+((this.contractNo == null)? 0 :this.contractNo.hashCode()));
        result = ((result* 31)+((this.salStep == null)? 0 :this.salStep.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.hrsPay == null)? 0 :this.hrsPay.hashCode()));
        result = ((result* 31)+((this.payrollEffectiveDate == null)? 0 :this.payrollEffectiveDate.hashCode()));
        result = ((result* 31)+((this.dpFactor == null)? 0 :this.dpFactor.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.wkcpDesc == null)? 0 :this.wkcpDesc.hashCode()));
        result = ((result* 31)+((this.emprCode == null)? 0 :this.emprCode.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.salGrade == null)? 0 :this.salGrade.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.pictCodeLeavRpt == null)? 0 :this.pictCodeLeavRpt.hashCode()));
        result = ((result* 31)+((this.schlCode == null)? 0 :this.schlCode.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this.timeEntryMethod == null)? 0 :this.timeEntryMethod.hashCode()));
        result = ((result* 31)+((this.eclsEncIndLit == null)? 0 :this.eclsEncIndLit.hashCode()));
        result = ((result* 31)+((this.pcatCode == null)? 0 :this.pcatCode.hashCode()));
        result = ((result* 31)+((this.lcatCode == null)? 0 :this.lcatCode.hashCode()));
        result = ((result* 31)+((this.salTable == null)? 0 :this.salTable.hashCode()));
        result = ((result* 31)+((this.wkcpCode == null)? 0 :this.wkcpCode.hashCode()));
        result = ((result* 31)+((this.eclsDesc == null)? 0 :this.eclsDesc.hashCode()));
        result = ((result* 31)+((this.supervisorPosn == null)? 0 :this.supervisorPosn.hashCode()));
        result = ((result* 31)+((this.strsAssnCode == null)? 0 :this.strsAssnCode.hashCode()));
        result = ((result* 31)+((this.supTitle == null)? 0 :this.supTitle.hashCode()));
        result = ((result* 31)+((this.coasCodeTs == null)? 0 :this.coasCodeTs.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.lgcdDesc == null)? 0 :this.lgcdDesc.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        result = ((result* 31)+((this.supervisorSuff == null)? 0 :this.supervisorSuff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsJobDetail100GetResponse) == false) {
            return false;
        }
        EmployeeJobsJobDetail100GetResponse rhs = ((EmployeeJobsJobDetail100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.orgnCodeTs == rhs.orgnCodeTs)||((this.orgnCodeTs!= null)&&this.orgnCodeTs.equals(rhs.orgnCodeTs)))&&((this.addlEffectiveDate == rhs.addlEffectiveDate)||((this.addlEffectiveDate!= null)&&this.addlEffectiveDate.equals(rhs.addlEffectiveDate))))&&((this.pcatDesc == rhs.pcatDesc)||((this.pcatDesc!= null)&&this.pcatDesc.equals(rhs.pcatDesc))))&&((this.supId == rhs.supId)||((this.supId!= null)&&this.supId.equals(rhs.supId))))&&((this.dfprDesc == rhs.dfprDesc)||((this.dfprDesc!= null)&&this.dfprDesc.equals(rhs.dfprDesc))))&&((this.dpPays == rhs.dpPays)||((this.dpPays!= null)&&this.dpPays.equals(rhs.dpPays))))&&((this.sgrpCode == rhs.sgrpCode)||((this.sgrpCode!= null)&&this.sgrpCode.equals(rhs.sgrpCode))))&&((this.assgnSalary == rhs.assgnSalary)||((this.assgnSalary!= null)&&this.assgnSalary.equals(rhs.assgnSalary))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.lcatDesc == rhs.lcatDesc)||((this.lcatDesc!= null)&&this.lcatDesc.equals(rhs.lcatDesc))))&&((this.timeEntryType == rhs.timeEntryType)||((this.timeEntryType!= null)&&this.timeEntryType.equals(rhs.timeEntryType))))&&((this.timeInOutInd == rhs.timeInOutInd)||((this.timeInOutInd!= null)&&this.timeInOutInd.equals(rhs.timeInOutInd))))&&((this.encumbranceHrs == rhs.encumbranceHrs)||((this.encumbranceHrs!= null)&&this.encumbranceHrs.equals(rhs.encumbranceHrs))))&&((this.perPayDeferAmt == rhs.perPayDeferAmt)||((this.perPayDeferAmt!= null)&&this.perPayDeferAmt.equals(rhs.perPayDeferAmt))))&&((this.assnDesc == rhs.assnDesc)||((this.assnDesc!= null)&&this.assnDesc.equals(rhs.assnDesc))))&&((this.strsPayCode == rhs.strsPayCode)||((this.strsPayCode!= null)&&this.strsPayCode.equals(rhs.strsPayCode))))&&((this.lgcdCode == rhs.lgcdCode)||((this.lgcdCode!= null)&&this.lgcdCode.equals(rhs.lgcdCode))))&&((this.supName == rhs.supName)||((this.supName!= null)&&this.supName.equals(rhs.supName))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.jcreDesc == rhs.jcreDesc)||((this.jcreDesc!= null)&&this.jcreDesc.equals(rhs.jcreDesc))))&&((this.dpEffectiveDate == rhs.dpEffectiveDate)||((this.dpEffectiveDate!= null)&&this.dpEffectiveDate.equals(rhs.dpEffectiveDate))))&&((this.orgnDesc == rhs.orgnDesc)||((this.orgnDesc!= null)&&this.orgnDesc.equals(rhs.orgnDesc))))&&((this.regRate == rhs.regRate)||((this.regRate!= null)&&this.regRate.equals(rhs.regRate))))&&((this.dfprCode == rhs.dfprCode)||((this.dfprCode!= null)&&this.dfprCode.equals(rhs.dfprCode))))&&((this.perPaySalary == rhs.perPaySalary)||((this.perPaySalary!= null)&&this.perPaySalary.equals(rhs.perPaySalary))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.pictDescLeavRept == rhs.pictDescLeavRept)||((this.pictDescLeavRept!= null)&&this.pictDescLeavRept.equals(rhs.pictDescLeavRept))))&&((this.locnDesc == rhs.locnDesc)||((this.locnDesc!= null)&&this.locnDesc.equals(rhs.locnDesc))))&&((this.jblnDesc == rhs.jblnDesc)||((this.jblnDesc!= null)&&this.jblnDesc.equals(rhs.jblnDesc))))&&((this.persPayCode == rhs.persPayCode)||((this.persPayCode!= null)&&this.persPayCode.equals(rhs.persPayCode))))&&((this.persChgDate == rhs.persChgDate)||((this.persChgDate!= null)&&this.persChgDate.equals(rhs.persChgDate))))&&((this.emprDesc == rhs.emprDesc)||((this.emprDesc!= null)&&this.emprDesc.equals(rhs.emprDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.pictDesc == rhs.pictDesc)||((this.pictDesc!= null)&&this.pictDesc.equals(rhs.pictDesc))))&&((this.schlDesc == rhs.schlDesc)||((this.schlDesc!= null)&&this.schlDesc.equals(rhs.schlDesc))))&&((this.hrsDay == rhs.hrsDay)||((this.hrsDay!= null)&&this.hrsDay.equals(rhs.hrsDay))))&&((this.annSalary == rhs.annSalary)||((this.annSalary!= null)&&this.annSalary.equals(rhs.annSalary))))&&((this.jcreCode == rhs.jcreCode)||((this.jcreCode!= null)&&this.jcreCode.equals(rhs.jcreCode))))&&((this.leavReptMethod == rhs.leavReptMethod)||((this.leavReptMethod!= null)&&this.leavReptMethod.equals(rhs.leavReptMethod))))&&((this.contractNo == rhs.contractNo)||((this.contractNo!= null)&&this.contractNo.equals(rhs.contractNo))))&&((this.salStep == rhs.salStep)||((this.salStep!= null)&&this.salStep.equals(rhs.salStep))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.hrsPay == rhs.hrsPay)||((this.hrsPay!= null)&&this.hrsPay.equals(rhs.hrsPay))))&&((this.payrollEffectiveDate == rhs.payrollEffectiveDate)||((this.payrollEffectiveDate!= null)&&this.payrollEffectiveDate.equals(rhs.payrollEffectiveDate))))&&((this.dpFactor == rhs.dpFactor)||((this.dpFactor!= null)&&this.dpFactor.equals(rhs.dpFactor))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.wkcpDesc == rhs.wkcpDesc)||((this.wkcpDesc!= null)&&this.wkcpDesc.equals(rhs.wkcpDesc))))&&((this.emprCode == rhs.emprCode)||((this.emprCode!= null)&&this.emprCode.equals(rhs.emprCode))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.salGrade == rhs.salGrade)||((this.salGrade!= null)&&this.salGrade.equals(rhs.salGrade))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.pictCodeLeavRpt == rhs.pictCodeLeavRpt)||((this.pictCodeLeavRpt!= null)&&this.pictCodeLeavRpt.equals(rhs.pictCodeLeavRpt))))&&((this.schlCode == rhs.schlCode)||((this.schlCode!= null)&&this.schlCode.equals(rhs.schlCode))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this.timeEntryMethod == rhs.timeEntryMethod)||((this.timeEntryMethod!= null)&&this.timeEntryMethod.equals(rhs.timeEntryMethod))))&&((this.eclsEncIndLit == rhs.eclsEncIndLit)||((this.eclsEncIndLit!= null)&&this.eclsEncIndLit.equals(rhs.eclsEncIndLit))))&&((this.pcatCode == rhs.pcatCode)||((this.pcatCode!= null)&&this.pcatCode.equals(rhs.pcatCode))))&&((this.lcatCode == rhs.lcatCode)||((this.lcatCode!= null)&&this.lcatCode.equals(rhs.lcatCode))))&&((this.salTable == rhs.salTable)||((this.salTable!= null)&&this.salTable.equals(rhs.salTable))))&&((this.wkcpCode == rhs.wkcpCode)||((this.wkcpCode!= null)&&this.wkcpCode.equals(rhs.wkcpCode))))&&((this.eclsDesc == rhs.eclsDesc)||((this.eclsDesc!= null)&&this.eclsDesc.equals(rhs.eclsDesc))))&&((this.supervisorPosn == rhs.supervisorPosn)||((this.supervisorPosn!= null)&&this.supervisorPosn.equals(rhs.supervisorPosn))))&&((this.strsAssnCode == rhs.strsAssnCode)||((this.strsAssnCode!= null)&&this.strsAssnCode.equals(rhs.strsAssnCode))))&&((this.supTitle == rhs.supTitle)||((this.supTitle!= null)&&this.supTitle.equals(rhs.supTitle))))&&((this.coasCodeTs == rhs.coasCodeTs)||((this.coasCodeTs!= null)&&this.coasCodeTs.equals(rhs.coasCodeTs))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.lgcdDesc == rhs.lgcdDesc)||((this.lgcdDesc!= null)&&this.lgcdDesc.equals(rhs.lgcdDesc))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))))&&((this.supervisorSuff == rhs.supervisorSuff)||((this.supervisorSuff!= null)&&this.supervisorSuff.equals(rhs.supervisorSuff))));
    }

}
