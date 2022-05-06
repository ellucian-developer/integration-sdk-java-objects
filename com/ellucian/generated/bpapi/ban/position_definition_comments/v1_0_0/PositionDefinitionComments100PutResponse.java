
package com.ellucian.generated.bpapi.ban.position_definition_comments.v1_0_0;

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
    "probationUnits",
    "bargCode",
    "ecipCode",
    "sgrpCode",
    "endDate",
    "accrueSeniorityInd",
    "pclsCode",
    "salary",
    "jobpDesc",
    "califType",
    "posnReports",
    "jblnCode",
    "ecipDesc",
    "bargDesc",
    "pclsDesc",
    "salgrpDesc",
    "salaryMidpoint",
    "eclsCode",
    "pnocCode",
    "annualSal",
    "jblnDesc",
    "salaryLimit",
    "rptToTitle",
    "grade",
    "cipcDesc",
    "changeDateTime",
    "budgetType",
    "dottDesc",
    "exemptInd",
    "typeDesc",
    "pfocDesc",
    "wkshCode",
    "title",
    "esocCode",
    "cipcCode",
    "activityDate",
    "apptPct",
    "table",
    "pgrpDesc",
    "displayBeginDate",
    "statusDesc",
    "dottCode",
    "pfocCode",
    "wkshCodeDesc",
    "userId",
    "pnocDesc",
    "esocDesc",
    "jobpCode",
    "eclsDesc",
    "comment",
    "pgrpCode",
    "step"
})
@Generated("jsonschema2pojo")
public class PositionDefinitionComments100PutResponse {

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PROBATION_UNITS")
    private Double probationUnits;
    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BARG_CODE")
    private String bargCode;
    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ECIP_CODE")
    private String ecipCode;
    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_SGRP_CODE")
    private String sgrpCode;
    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_END_DATE")
    private Date endDate;
    /**
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND")
    private String accrueSeniorityInd;
    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PCLS_CODE")
    private String pclsCode;
    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salary")
    private Double salary;
    @JsonProperty("jobpDesc")
    private String jobpDesc;
    /**
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("califType")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_CALIF_TYPE")
    private String califType;
    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_POSN_REPORTS")
    private String posnReports;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JBLN_CODE")
    private String jblnCode;
    @JsonProperty("ecipDesc")
    private String ecipDesc;
    @JsonProperty("bargDesc")
    private String bargDesc;
    @JsonProperty("pclsDesc")
    private String pclsDesc;
    @JsonProperty("salgrpDesc")
    private String salgrpDesc;
    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryMidpoint")
    private Double salaryMidpoint;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBBPOSN_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ECLS_CODE")
    private String eclsCode;
    /**
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("pnocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc")
    private String pnocCode;
    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("annualSal")
    private Double annualSal;
    @JsonProperty("jblnDesc")
    private String jblnDesc;
    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryLimit")
    private Double salaryLimit;
    @JsonProperty("rptToTitle")
    private String rptToTitle;
    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_GRADE")
    private String grade;
    @JsonProperty("cipcDesc")
    private String cipcDesc;
    /**
     * Compensation and Classification Change Date
     * <p>
     * Lineage reference object : NBBPOSN_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_CHANGE_DATE_TIME")
    private Date changeDateTime;
    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgetType")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BUDGET_TYPE")
    private String budgetType;
    @JsonProperty("dottDesc")
    private String dottDesc;
    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_EXEMPT_IND")
    private String exemptInd;
    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeDesc")
    private String typeDesc;
    @JsonProperty("pfocDesc")
    private String pfocDesc;
    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh")
    private String wkshCode;
    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TITLE")
    private String title;
    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ESOC_CODE")
    private String esocCode;
    /**
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc")
    private String cipcCode;
    /**
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBBPOSN_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_APPT_PCT")
    private Double apptPct;
    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("table")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TABLE")
    private String table;
    @JsonProperty("pgrpDesc")
    private String pgrpDesc;
    /**
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBeginDate")
    private Date displayBeginDate;
    /**
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    private String statusDesc;
    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("dottCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott")
    private String dottCode;
    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("pfocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc")
    private String pfocCode;
    @JsonProperty("wkshCodeDesc")
    private String wkshCodeDesc;
    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_USER_ID")
    private String userId;
    @JsonProperty("pnocDesc")
    private String pnocDesc;
    @JsonProperty("esocDesc")
    private String esocDesc;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JOBP_CODE")
    private String jobpCode;
    @JsonProperty("eclsDesc")
    private String eclsDesc;
    /**
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_COMMENT")
    private String comment;
    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PGRP_CODE")
    private String pgrpCode;
    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_STEP")
    private Double step;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public Double getProbationUnits() {
        return probationUnits;
    }

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public void setProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
    }

    public PositionDefinitionComments100PutResponse withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
        return this;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public String getBargCode() {
        return bargCode;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public void setBargCode(String bargCode) {
        this.bargCode = bargCode;
    }

    public PositionDefinitionComments100PutResponse withBargCode(String bargCode) {
        this.bargCode = bargCode;
        return this;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public String getEcipCode() {
        return ecipCode;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public void setEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
    }

    public PositionDefinitionComments100PutResponse withEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
        return this;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    public String getSgrpCode() {
        return sgrpCode;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("sgrpCode")
    public void setSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
    }

    public PositionDefinitionComments100PutResponse withSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
        return this;
    }

    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PositionDefinitionComments100PutResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public String getAccrueSeniorityInd() {
        return accrueSeniorityInd;
    }

    /**
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public void setAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
    }

    public PositionDefinitionComments100PutResponse withAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public PositionDefinitionComments100PutResponse withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salary")
    public Double getSalary() {
        return salary;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salary")
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public PositionDefinitionComments100PutResponse withSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    @JsonProperty("jobpDesc")
    public String getJobpDesc() {
        return jobpDesc;
    }

    @JsonProperty("jobpDesc")
    public void setJobpDesc(String jobpDesc) {
        this.jobpDesc = jobpDesc;
    }

    public PositionDefinitionComments100PutResponse withJobpDesc(String jobpDesc) {
        this.jobpDesc = jobpDesc;
        return this;
    }

    /**
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("califType")
    public String getCalifType() {
        return califType;
    }

    /**
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("califType")
    public void setCalifType(String califType) {
        this.califType = califType;
    }

    public PositionDefinitionComments100PutResponse withCalifType(String califType) {
        this.califType = califType;
        return this;
    }

    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public String getPosnReports() {
        return posnReports;
    }

    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public void setPosnReports(String posnReports) {
        this.posnReports = posnReports;
    }

    public PositionDefinitionComments100PutResponse withPosnReports(String posnReports) {
        this.posnReports = posnReports;
        return this;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public String getJblnCode() {
        return jblnCode;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public void setJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
    }

    public PositionDefinitionComments100PutResponse withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
        return this;
    }

    @JsonProperty("ecipDesc")
    public String getEcipDesc() {
        return ecipDesc;
    }

    @JsonProperty("ecipDesc")
    public void setEcipDesc(String ecipDesc) {
        this.ecipDesc = ecipDesc;
    }

    public PositionDefinitionComments100PutResponse withEcipDesc(String ecipDesc) {
        this.ecipDesc = ecipDesc;
        return this;
    }

    @JsonProperty("bargDesc")
    public String getBargDesc() {
        return bargDesc;
    }

    @JsonProperty("bargDesc")
    public void setBargDesc(String bargDesc) {
        this.bargDesc = bargDesc;
    }

    public PositionDefinitionComments100PutResponse withBargDesc(String bargDesc) {
        this.bargDesc = bargDesc;
        return this;
    }

    @JsonProperty("pclsDesc")
    public String getPclsDesc() {
        return pclsDesc;
    }

    @JsonProperty("pclsDesc")
    public void setPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
    }

    public PositionDefinitionComments100PutResponse withPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
        return this;
    }

    @JsonProperty("salgrpDesc")
    public String getSalgrpDesc() {
        return salgrpDesc;
    }

    @JsonProperty("salgrpDesc")
    public void setSalgrpDesc(String salgrpDesc) {
        this.salgrpDesc = salgrpDesc;
    }

    public PositionDefinitionComments100PutResponse withSalgrpDesc(String salgrpDesc) {
        this.salgrpDesc = salgrpDesc;
        return this;
    }

    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryMidpoint")
    public Double getSalaryMidpoint() {
        return salaryMidpoint;
    }

    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryMidpoint")
    public void setSalaryMidpoint(Double salaryMidpoint) {
        this.salaryMidpoint = salaryMidpoint;
    }

    public PositionDefinitionComments100PutResponse withSalaryMidpoint(Double salaryMidpoint) {
        this.salaryMidpoint = salaryMidpoint;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBBPOSN_ECLS_CODE
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
     * Lineage reference object : NBBPOSN_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public PositionDefinitionComments100PutResponse withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("pnocCode")
    public String getPnocCode() {
        return pnocCode;
    }

    /**
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("pnocCode")
    public void setPnocCode(String pnocCode) {
        this.pnocCode = pnocCode;
    }

    public PositionDefinitionComments100PutResponse withPnocCode(String pnocCode) {
        this.pnocCode = pnocCode;
        return this;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("annualSal")
    public Double getAnnualSal() {
        return annualSal;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("annualSal")
    public void setAnnualSal(Double annualSal) {
        this.annualSal = annualSal;
    }

    public PositionDefinitionComments100PutResponse withAnnualSal(Double annualSal) {
        this.annualSal = annualSal;
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

    public PositionDefinitionComments100PutResponse withJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
        return this;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryLimit")
    public Double getSalaryLimit() {
        return salaryLimit;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryLimit")
    public void setSalaryLimit(Double salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public PositionDefinitionComments100PutResponse withSalaryLimit(Double salaryLimit) {
        this.salaryLimit = salaryLimit;
        return this;
    }

    @JsonProperty("rptToTitle")
    public String getRptToTitle() {
        return rptToTitle;
    }

    @JsonProperty("rptToTitle")
    public void setRptToTitle(String rptToTitle) {
        this.rptToTitle = rptToTitle;
    }

    public PositionDefinitionComments100PutResponse withRptToTitle(String rptToTitle) {
        this.rptToTitle = rptToTitle;
        return this;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public PositionDefinitionComments100PutResponse withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    @JsonProperty("cipcDesc")
    public String getCipcDesc() {
        return cipcDesc;
    }

    @JsonProperty("cipcDesc")
    public void setCipcDesc(String cipcDesc) {
        this.cipcDesc = cipcDesc;
    }

    public PositionDefinitionComments100PutResponse withCipcDesc(String cipcDesc) {
        this.cipcDesc = cipcDesc;
        return this;
    }

    /**
     * Compensation and Classification Change Date
     * <p>
     * Lineage reference object : NBBPOSN_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    public Date getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Compensation and Classification Change Date
     * <p>
     * Lineage reference object : NBBPOSN_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    public void setChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
    }

    public PositionDefinitionComments100PutResponse withChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
        return this;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgetType")
    public String getBudgetType() {
        return budgetType;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgetType")
    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public PositionDefinitionComments100PutResponse withBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    @JsonProperty("dottDesc")
    public String getDottDesc() {
        return dottDesc;
    }

    @JsonProperty("dottDesc")
    public void setDottDesc(String dottDesc) {
        this.dottDesc = dottDesc;
    }

    public PositionDefinitionComments100PutResponse withDottDesc(String dottDesc) {
        this.dottDesc = dottDesc;
        return this;
    }

    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public String getExemptInd() {
        return exemptInd;
    }

    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public void setExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
    }

    public PositionDefinitionComments100PutResponse withExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
        return this;
    }

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeDesc")
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeDesc")
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public PositionDefinitionComments100PutResponse withTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }

    @JsonProperty("pfocDesc")
    public String getPfocDesc() {
        return pfocDesc;
    }

    @JsonProperty("pfocDesc")
    public void setPfocDesc(String pfocDesc) {
        this.pfocDesc = pfocDesc;
    }

    public PositionDefinitionComments100PutResponse withPfocDesc(String pfocDesc) {
        this.pfocDesc = pfocDesc;
        return this;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    public String getWkshCode() {
        return wkshCode;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    public void setWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
    }

    public PositionDefinitionComments100PutResponse withWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
        return this;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PositionDefinitionComments100PutResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public String getEsocCode() {
        return esocCode;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public void setEsocCode(String esocCode) {
        this.esocCode = esocCode;
    }

    public PositionDefinitionComments100PutResponse withEsocCode(String esocCode) {
        this.esocCode = esocCode;
        return this;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public String getCipcCode() {
        return cipcCode;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public void setCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
    }

    public PositionDefinitionComments100PutResponse withCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionDefinitionComments100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBBPOSN_APPT_PCT
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
     * Lineage reference object : NBBPOSN_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    public void setApptPct(Double apptPct) {
        this.apptPct = apptPct;
    }

    public PositionDefinitionComments100PutResponse withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public PositionDefinitionComments100PutResponse withTable(String table) {
        this.table = table;
        return this;
    }

    @JsonProperty("pgrpDesc")
    public String getPgrpDesc() {
        return pgrpDesc;
    }

    @JsonProperty("pgrpDesc")
    public void setPgrpDesc(String pgrpDesc) {
        this.pgrpDesc = pgrpDesc;
    }

    public PositionDefinitionComments100PutResponse withPgrpDesc(String pgrpDesc) {
        this.pgrpDesc = pgrpDesc;
        return this;
    }

    /**
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBeginDate")
    public Date getDisplayBeginDate() {
        return displayBeginDate;
    }

    /**
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBeginDate")
    public void setDisplayBeginDate(Date displayBeginDate) {
        this.displayBeginDate = displayBeginDate;
    }

    public PositionDefinitionComments100PutResponse withDisplayBeginDate(Date displayBeginDate) {
        this.displayBeginDate = displayBeginDate;
        return this;
    }

    /**
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public PositionDefinitionComments100PutResponse withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("dottCode")
    public String getDottCode() {
        return dottCode;
    }

    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("dottCode")
    public void setDottCode(String dottCode) {
        this.dottCode = dottCode;
    }

    public PositionDefinitionComments100PutResponse withDottCode(String dottCode) {
        this.dottCode = dottCode;
        return this;
    }

    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("pfocCode")
    public String getPfocCode() {
        return pfocCode;
    }

    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("pfocCode")
    public void setPfocCode(String pfocCode) {
        this.pfocCode = pfocCode;
    }

    public PositionDefinitionComments100PutResponse withPfocCode(String pfocCode) {
        this.pfocCode = pfocCode;
        return this;
    }

    @JsonProperty("wkshCodeDesc")
    public String getWkshCodeDesc() {
        return wkshCodeDesc;
    }

    @JsonProperty("wkshCodeDesc")
    public void setWkshCodeDesc(String wkshCodeDesc) {
        this.wkshCodeDesc = wkshCodeDesc;
    }

    public PositionDefinitionComments100PutResponse withWkshCodeDesc(String wkshCodeDesc) {
        this.wkshCodeDesc = wkshCodeDesc;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionDefinitionComments100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("pnocDesc")
    public String getPnocDesc() {
        return pnocDesc;
    }

    @JsonProperty("pnocDesc")
    public void setPnocDesc(String pnocDesc) {
        this.pnocDesc = pnocDesc;
    }

    public PositionDefinitionComments100PutResponse withPnocDesc(String pnocDesc) {
        this.pnocDesc = pnocDesc;
        return this;
    }

    @JsonProperty("esocDesc")
    public String getEsocDesc() {
        return esocDesc;
    }

    @JsonProperty("esocDesc")
    public void setEsocDesc(String esocDesc) {
        this.esocDesc = esocDesc;
    }

    public PositionDefinitionComments100PutResponse withEsocDesc(String esocDesc) {
        this.esocDesc = esocDesc;
        return this;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public String getJobpCode() {
        return jobpCode;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public void setJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
    }

    public PositionDefinitionComments100PutResponse withJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
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

    public PositionDefinitionComments100PutResponse withEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PositionDefinitionComments100PutResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public PositionDefinitionComments100PutResponse withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("step")
    public Double getStep() {
        return step;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("step")
    public void setStep(Double step) {
        this.step = step;
    }

    public PositionDefinitionComments100PutResponse withStep(Double step) {
        this.step = step;
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

    public PositionDefinitionComments100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionDefinitionComments100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("bargCode");
        sb.append('=');
        sb.append(((this.bargCode == null)?"<null>":this.bargCode));
        sb.append(',');
        sb.append("ecipCode");
        sb.append('=');
        sb.append(((this.ecipCode == null)?"<null>":this.ecipCode));
        sb.append(',');
        sb.append("sgrpCode");
        sb.append('=');
        sb.append(((this.sgrpCode == null)?"<null>":this.sgrpCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("accrueSeniorityInd");
        sb.append('=');
        sb.append(((this.accrueSeniorityInd == null)?"<null>":this.accrueSeniorityInd));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("jobpDesc");
        sb.append('=');
        sb.append(((this.jobpDesc == null)?"<null>":this.jobpDesc));
        sb.append(',');
        sb.append("califType");
        sb.append('=');
        sb.append(((this.califType == null)?"<null>":this.califType));
        sb.append(',');
        sb.append("posnReports");
        sb.append('=');
        sb.append(((this.posnReports == null)?"<null>":this.posnReports));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("ecipDesc");
        sb.append('=');
        sb.append(((this.ecipDesc == null)?"<null>":this.ecipDesc));
        sb.append(',');
        sb.append("bargDesc");
        sb.append('=');
        sb.append(((this.bargDesc == null)?"<null>":this.bargDesc));
        sb.append(',');
        sb.append("pclsDesc");
        sb.append('=');
        sb.append(((this.pclsDesc == null)?"<null>":this.pclsDesc));
        sb.append(',');
        sb.append("salgrpDesc");
        sb.append('=');
        sb.append(((this.salgrpDesc == null)?"<null>":this.salgrpDesc));
        sb.append(',');
        sb.append("salaryMidpoint");
        sb.append('=');
        sb.append(((this.salaryMidpoint == null)?"<null>":this.salaryMidpoint));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("pnocCode");
        sb.append('=');
        sb.append(((this.pnocCode == null)?"<null>":this.pnocCode));
        sb.append(',');
        sb.append("annualSal");
        sb.append('=');
        sb.append(((this.annualSal == null)?"<null>":this.annualSal));
        sb.append(',');
        sb.append("jblnDesc");
        sb.append('=');
        sb.append(((this.jblnDesc == null)?"<null>":this.jblnDesc));
        sb.append(',');
        sb.append("salaryLimit");
        sb.append('=');
        sb.append(((this.salaryLimit == null)?"<null>":this.salaryLimit));
        sb.append(',');
        sb.append("rptToTitle");
        sb.append('=');
        sb.append(((this.rptToTitle == null)?"<null>":this.rptToTitle));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("cipcDesc");
        sb.append('=');
        sb.append(((this.cipcDesc == null)?"<null>":this.cipcDesc));
        sb.append(',');
        sb.append("changeDateTime");
        sb.append('=');
        sb.append(((this.changeDateTime == null)?"<null>":this.changeDateTime));
        sb.append(',');
        sb.append("budgetType");
        sb.append('=');
        sb.append(((this.budgetType == null)?"<null>":this.budgetType));
        sb.append(',');
        sb.append("dottDesc");
        sb.append('=');
        sb.append(((this.dottDesc == null)?"<null>":this.dottDesc));
        sb.append(',');
        sb.append("exemptInd");
        sb.append('=');
        sb.append(((this.exemptInd == null)?"<null>":this.exemptInd));
        sb.append(',');
        sb.append("typeDesc");
        sb.append('=');
        sb.append(((this.typeDesc == null)?"<null>":this.typeDesc));
        sb.append(',');
        sb.append("pfocDesc");
        sb.append('=');
        sb.append(((this.pfocDesc == null)?"<null>":this.pfocDesc));
        sb.append(',');
        sb.append("wkshCode");
        sb.append('=');
        sb.append(((this.wkshCode == null)?"<null>":this.wkshCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("esocCode");
        sb.append('=');
        sb.append(((this.esocCode == null)?"<null>":this.esocCode));
        sb.append(',');
        sb.append("cipcCode");
        sb.append('=');
        sb.append(((this.cipcCode == null)?"<null>":this.cipcCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("pgrpDesc");
        sb.append('=');
        sb.append(((this.pgrpDesc == null)?"<null>":this.pgrpDesc));
        sb.append(',');
        sb.append("displayBeginDate");
        sb.append('=');
        sb.append(((this.displayBeginDate == null)?"<null>":this.displayBeginDate));
        sb.append(',');
        sb.append("statusDesc");
        sb.append('=');
        sb.append(((this.statusDesc == null)?"<null>":this.statusDesc));
        sb.append(',');
        sb.append("dottCode");
        sb.append('=');
        sb.append(((this.dottCode == null)?"<null>":this.dottCode));
        sb.append(',');
        sb.append("pfocCode");
        sb.append('=');
        sb.append(((this.pfocCode == null)?"<null>":this.pfocCode));
        sb.append(',');
        sb.append("wkshCodeDesc");
        sb.append('=');
        sb.append(((this.wkshCodeDesc == null)?"<null>":this.wkshCodeDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("pnocDesc");
        sb.append('=');
        sb.append(((this.pnocDesc == null)?"<null>":this.pnocDesc));
        sb.append(',');
        sb.append("esocDesc");
        sb.append('=');
        sb.append(((this.esocDesc == null)?"<null>":this.esocDesc));
        sb.append(',');
        sb.append("jobpCode");
        sb.append('=');
        sb.append(((this.jobpCode == null)?"<null>":this.jobpCode));
        sb.append(',');
        sb.append("eclsDesc");
        sb.append('=');
        sb.append(((this.eclsDesc == null)?"<null>":this.eclsDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
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
        result = ((result* 31)+((this.probationUnits == null)? 0 :this.probationUnits.hashCode()));
        result = ((result* 31)+((this.bargCode == null)? 0 :this.bargCode.hashCode()));
        result = ((result* 31)+((this.ecipCode == null)? 0 :this.ecipCode.hashCode()));
        result = ((result* 31)+((this.sgrpCode == null)? 0 :this.sgrpCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.accrueSeniorityInd == null)? 0 :this.accrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.salary == null)? 0 :this.salary.hashCode()));
        result = ((result* 31)+((this.jobpDesc == null)? 0 :this.jobpDesc.hashCode()));
        result = ((result* 31)+((this.califType == null)? 0 :this.califType.hashCode()));
        result = ((result* 31)+((this.posnReports == null)? 0 :this.posnReports.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.ecipDesc == null)? 0 :this.ecipDesc.hashCode()));
        result = ((result* 31)+((this.bargDesc == null)? 0 :this.bargDesc.hashCode()));
        result = ((result* 31)+((this.pclsDesc == null)? 0 :this.pclsDesc.hashCode()));
        result = ((result* 31)+((this.salgrpDesc == null)? 0 :this.salgrpDesc.hashCode()));
        result = ((result* 31)+((this.salaryMidpoint == null)? 0 :this.salaryMidpoint.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.pnocCode == null)? 0 :this.pnocCode.hashCode()));
        result = ((result* 31)+((this.annualSal == null)? 0 :this.annualSal.hashCode()));
        result = ((result* 31)+((this.jblnDesc == null)? 0 :this.jblnDesc.hashCode()));
        result = ((result* 31)+((this.salaryLimit == null)? 0 :this.salaryLimit.hashCode()));
        result = ((result* 31)+((this.rptToTitle == null)? 0 :this.rptToTitle.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cipcDesc == null)? 0 :this.cipcDesc.hashCode()));
        result = ((result* 31)+((this.changeDateTime == null)? 0 :this.changeDateTime.hashCode()));
        result = ((result* 31)+((this.budgetType == null)? 0 :this.budgetType.hashCode()));
        result = ((result* 31)+((this.dottDesc == null)? 0 :this.dottDesc.hashCode()));
        result = ((result* 31)+((this.exemptInd == null)? 0 :this.exemptInd.hashCode()));
        result = ((result* 31)+((this.typeDesc == null)? 0 :this.typeDesc.hashCode()));
        result = ((result* 31)+((this.pfocDesc == null)? 0 :this.pfocDesc.hashCode()));
        result = ((result* 31)+((this.wkshCode == null)? 0 :this.wkshCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.esocCode == null)? 0 :this.esocCode.hashCode()));
        result = ((result* 31)+((this.cipcCode == null)? 0 :this.cipcCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        result = ((result* 31)+((this.pgrpDesc == null)? 0 :this.pgrpDesc.hashCode()));
        result = ((result* 31)+((this.displayBeginDate == null)? 0 :this.displayBeginDate.hashCode()));
        result = ((result* 31)+((this.statusDesc == null)? 0 :this.statusDesc.hashCode()));
        result = ((result* 31)+((this.dottCode == null)? 0 :this.dottCode.hashCode()));
        result = ((result* 31)+((this.pfocCode == null)? 0 :this.pfocCode.hashCode()));
        result = ((result* 31)+((this.wkshCodeDesc == null)? 0 :this.wkshCodeDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.pnocDesc == null)? 0 :this.pnocDesc.hashCode()));
        result = ((result* 31)+((this.esocDesc == null)? 0 :this.esocDesc.hashCode()));
        result = ((result* 31)+((this.jobpCode == null)? 0 :this.jobpCode.hashCode()));
        result = ((result* 31)+((this.eclsDesc == null)? 0 :this.eclsDesc.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionDefinitionComments100PutResponse) == false) {
            return false;
        }
        PositionDefinitionComments100PutResponse rhs = ((PositionDefinitionComments100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.bargCode == rhs.bargCode)||((this.bargCode!= null)&&this.bargCode.equals(rhs.bargCode))))&&((this.ecipCode == rhs.ecipCode)||((this.ecipCode!= null)&&this.ecipCode.equals(rhs.ecipCode))))&&((this.sgrpCode == rhs.sgrpCode)||((this.sgrpCode!= null)&&this.sgrpCode.equals(rhs.sgrpCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.accrueSeniorityInd == rhs.accrueSeniorityInd)||((this.accrueSeniorityInd!= null)&&this.accrueSeniorityInd.equals(rhs.accrueSeniorityInd))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.salary == rhs.salary)||((this.salary!= null)&&this.salary.equals(rhs.salary))))&&((this.jobpDesc == rhs.jobpDesc)||((this.jobpDesc!= null)&&this.jobpDesc.equals(rhs.jobpDesc))))&&((this.califType == rhs.califType)||((this.califType!= null)&&this.califType.equals(rhs.califType))))&&((this.posnReports == rhs.posnReports)||((this.posnReports!= null)&&this.posnReports.equals(rhs.posnReports))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.ecipDesc == rhs.ecipDesc)||((this.ecipDesc!= null)&&this.ecipDesc.equals(rhs.ecipDesc))))&&((this.bargDesc == rhs.bargDesc)||((this.bargDesc!= null)&&this.bargDesc.equals(rhs.bargDesc))))&&((this.pclsDesc == rhs.pclsDesc)||((this.pclsDesc!= null)&&this.pclsDesc.equals(rhs.pclsDesc))))&&((this.salgrpDesc == rhs.salgrpDesc)||((this.salgrpDesc!= null)&&this.salgrpDesc.equals(rhs.salgrpDesc))))&&((this.salaryMidpoint == rhs.salaryMidpoint)||((this.salaryMidpoint!= null)&&this.salaryMidpoint.equals(rhs.salaryMidpoint))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.pnocCode == rhs.pnocCode)||((this.pnocCode!= null)&&this.pnocCode.equals(rhs.pnocCode))))&&((this.annualSal == rhs.annualSal)||((this.annualSal!= null)&&this.annualSal.equals(rhs.annualSal))))&&((this.jblnDesc == rhs.jblnDesc)||((this.jblnDesc!= null)&&this.jblnDesc.equals(rhs.jblnDesc))))&&((this.salaryLimit == rhs.salaryLimit)||((this.salaryLimit!= null)&&this.salaryLimit.equals(rhs.salaryLimit))))&&((this.rptToTitle == rhs.rptToTitle)||((this.rptToTitle!= null)&&this.rptToTitle.equals(rhs.rptToTitle))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cipcDesc == rhs.cipcDesc)||((this.cipcDesc!= null)&&this.cipcDesc.equals(rhs.cipcDesc))))&&((this.changeDateTime == rhs.changeDateTime)||((this.changeDateTime!= null)&&this.changeDateTime.equals(rhs.changeDateTime))))&&((this.budgetType == rhs.budgetType)||((this.budgetType!= null)&&this.budgetType.equals(rhs.budgetType))))&&((this.dottDesc == rhs.dottDesc)||((this.dottDesc!= null)&&this.dottDesc.equals(rhs.dottDesc))))&&((this.exemptInd == rhs.exemptInd)||((this.exemptInd!= null)&&this.exemptInd.equals(rhs.exemptInd))))&&((this.typeDesc == rhs.typeDesc)||((this.typeDesc!= null)&&this.typeDesc.equals(rhs.typeDesc))))&&((this.pfocDesc == rhs.pfocDesc)||((this.pfocDesc!= null)&&this.pfocDesc.equals(rhs.pfocDesc))))&&((this.wkshCode == rhs.wkshCode)||((this.wkshCode!= null)&&this.wkshCode.equals(rhs.wkshCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.esocCode == rhs.esocCode)||((this.esocCode!= null)&&this.esocCode.equals(rhs.esocCode))))&&((this.cipcCode == rhs.cipcCode)||((this.cipcCode!= null)&&this.cipcCode.equals(rhs.cipcCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))))&&((this.pgrpDesc == rhs.pgrpDesc)||((this.pgrpDesc!= null)&&this.pgrpDesc.equals(rhs.pgrpDesc))))&&((this.displayBeginDate == rhs.displayBeginDate)||((this.displayBeginDate!= null)&&this.displayBeginDate.equals(rhs.displayBeginDate))))&&((this.statusDesc == rhs.statusDesc)||((this.statusDesc!= null)&&this.statusDesc.equals(rhs.statusDesc))))&&((this.dottCode == rhs.dottCode)||((this.dottCode!= null)&&this.dottCode.equals(rhs.dottCode))))&&((this.pfocCode == rhs.pfocCode)||((this.pfocCode!= null)&&this.pfocCode.equals(rhs.pfocCode))))&&((this.wkshCodeDesc == rhs.wkshCodeDesc)||((this.wkshCodeDesc!= null)&&this.wkshCodeDesc.equals(rhs.wkshCodeDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.pnocDesc == rhs.pnocDesc)||((this.pnocDesc!= null)&&this.pnocDesc.equals(rhs.pnocDesc))))&&((this.esocDesc == rhs.esocDesc)||((this.esocDesc!= null)&&this.esocDesc.equals(rhs.esocDesc))))&&((this.jobpCode == rhs.jobpCode)||((this.jobpCode!= null)&&this.jobpCode.equals(rhs.jobpCode))))&&((this.eclsDesc == rhs.eclsDesc)||((this.eclsDesc!= null)&&this.eclsDesc.equals(rhs.eclsDesc))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))));
    }

}
