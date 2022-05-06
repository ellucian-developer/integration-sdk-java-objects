
package com.ellucian.generated.bpapi.ban.position_definition_position.v1_0_0;

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
    "sgrpCode",
    "criteria.accrueSeniorityInd",
    "criteria.endDate",
    "accrueSeniorityInd",
    "pclsCode",
    "criteria.grade",
    "criteria.exemptInd",
    "criteria.probationUnits",
    "posnReports",
    "criteria.displayBeginDate",
    "criteria.typeDesc",
    "criteria.eclsCode",
    "criteria.annualSal",
    "criteria.salgrpDesc",
    "jblnCode",
    "criteria.jblnDesc",
    "eclsCode",
    "posn",
    "criteria.step",
    "criteria.pclsDesc",
    "criteria.title",
    "criteria.salaryLimit",
    "criteria.bargDesc",
    "criteria.sgrpCode",
    "grade",
    "criteria.rptToTitle",
    "criteria.wkshCode",
    "criteria.jblnCode",
    "criteria.jobpDesc",
    "budgetType",
    "exemptInd",
    "criteria.statusDesc",
    "criteria.table",
    "wkshCode",
    "title",
    "criteria.bargCode",
    "criteria.salaryMidpoint",
    "apptPct",
    "criteria.wkshCodeDesc",
    "criteria.pclsCode",
    "criteria.posnReports",
    "table",
    "criteria.salary",
    "jobpCode",
    "criteria.budgetType",
    "criteria.eclsDesc",
    "step",
    "criteria.jobpCode",
    "criteria.apptPct"
})
@Generated("jsonschema2pojo")
public class PositionDefinitionPosition100PutRequest {

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
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("criteria.accrueSeniorityInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND")
    private String criteriaAccrueSeniorityInd;
    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_END_DATE")
    private Date criteriaEndDate;
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
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grade")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_GRADE")
    private String criteriaGrade;
    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("criteria.exemptInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_EXEMPT_IND")
    private String criteriaExemptInd;
    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("criteria.probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PROBATION_UNITS")
    private Double criteriaProbationUnits;
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
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayBeginDate")
    private Date criteriaDisplayBeginDate;
    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeDesc")
    private String criteriaTypeDesc;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBBPOSN_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ECLS_CODE")
    private String criteriaEclsCode;
    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.annualSal")
    private Double criteriaAnnualSal;
    @JsonProperty("criteria.salgrpDesc")
    private String criteriaSalgrpDesc;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JBLN_CODE")
    private String jblnCode;
    @JsonProperty("criteria.jblnDesc")
    private String criteriaJblnDesc;
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
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("criteria.step")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_STEP")
    private Double criteriaStep;
    @JsonProperty("criteria.pclsDesc")
    private String criteriaPclsDesc;
    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TITLE")
    private String criteriaTitle;
    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryLimit")
    private Double criteriaSalaryLimit;
    @JsonProperty("criteria.bargDesc")
    private String criteriaBargDesc;
    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_SGRP_CODE")
    private String criteriaSgrpCode;
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
    @JsonProperty("criteria.rptToTitle")
    private String criteriaRptToTitle;
    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh")
    private String criteriaWkshCode;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("criteria.jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JBLN_CODE")
    private String criteriaJblnCode;
    @JsonProperty("criteria.jobpDesc")
    private String criteriaJobpDesc;
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
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statusDesc")
    private String criteriaStatusDesc;
    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.table")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TABLE")
    private String criteriaTable;
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
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("criteria.bargCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BARG_CODE")
    private String criteriaBargCode;
    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryMidpoint")
    private Double criteriaSalaryMidpoint;
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
    @JsonProperty("criteria.wkshCodeDesc")
    private String criteriaWkshCodeDesc;
    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pclsCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PCLS_CODE")
    private String criteriaPclsCode;
    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("criteria.posnReports")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_POSN_REPORTS")
    private String criteriaPosnReports;
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
    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salary")
    private Double criteriaSalary;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JOBP_CODE")
    private String jobpCode;
    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetType")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BUDGET_TYPE")
    private String criteriaBudgetType;
    @JsonProperty("criteria.eclsDesc")
    private String criteriaEclsDesc;
    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_STEP")
    private Double step;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("criteria.jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JOBP_CODE")
    private String criteriaJobpCode;
    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBBPOSN_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_APPT_PCT")
    private Double criteriaApptPct;
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

    public PositionDefinitionPosition100PutRequest withProbationUnits(Double probationUnits) {
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

    public PositionDefinitionPosition100PutRequest withBargCode(String bargCode) {
        this.bargCode = bargCode;
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

    public PositionDefinitionPosition100PutRequest withSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
        return this;
    }

    /**
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("criteria.accrueSeniorityInd")
    public String getCriteriaAccrueSeniorityInd() {
        return criteriaAccrueSeniorityInd;
    }

    /**
     * Accrue Seniority
     * <p>
     * Lineage reference object : NBBPOSN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("criteria.accrueSeniorityInd")
    public void setCriteriaAccrueSeniorityInd(String criteriaAccrueSeniorityInd) {
        this.criteriaAccrueSeniorityInd = criteriaAccrueSeniorityInd;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaAccrueSeniorityInd(String criteriaAccrueSeniorityInd) {
        this.criteriaAccrueSeniorityInd = criteriaAccrueSeniorityInd;
        return this;
    }

    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * Position End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
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

    public PositionDefinitionPosition100PutRequest withAccrueSeniorityInd(String accrueSeniorityInd) {
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

    public PositionDefinitionPosition100PutRequest withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grade")
    public String getCriteriaGrade() {
        return criteriaGrade;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grade")
    public void setCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
        return this;
    }

    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("criteria.exemptInd")
    public String getCriteriaExemptInd() {
        return criteriaExemptInd;
    }

    /**
     * Exempt Indicator
     * <p>
     * Lineage reference object : NBBPOSN_EXEMPT_IND
     * 
     */
    @JsonProperty("criteria.exemptInd")
    public void setCriteriaExemptInd(String criteriaExemptInd) {
        this.criteriaExemptInd = criteriaExemptInd;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaExemptInd(String criteriaExemptInd) {
        this.criteriaExemptInd = criteriaExemptInd;
        return this;
    }

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("criteria.probationUnits")
    public Double getCriteriaProbationUnits() {
        return criteriaProbationUnits;
    }

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBBPOSN_PROBATION_UNITS
     * 
     */
    @JsonProperty("criteria.probationUnits")
    public void setCriteriaProbationUnits(Double criteriaProbationUnits) {
        this.criteriaProbationUnits = criteriaProbationUnits;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaProbationUnits(Double criteriaProbationUnits) {
        this.criteriaProbationUnits = criteriaProbationUnits;
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

    public PositionDefinitionPosition100PutRequest withPosnReports(String posnReports) {
        this.posnReports = posnReports;
        return this;
    }

    /**
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayBeginDate")
    public Date getCriteriaDisplayBeginDate() {
        return criteriaDisplayBeginDate;
    }

    /**
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayBeginDate")
    public void setCriteriaDisplayBeginDate(Date criteriaDisplayBeginDate) {
        this.criteriaDisplayBeginDate = criteriaDisplayBeginDate;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaDisplayBeginDate(Date criteriaDisplayBeginDate) {
        this.criteriaDisplayBeginDate = criteriaDisplayBeginDate;
        return this;
    }

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeDesc")
    public String getCriteriaTypeDesc() {
        return criteriaTypeDesc;
    }

    /**
     * Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeDesc")
    public void setCriteriaTypeDesc(String criteriaTypeDesc) {
        this.criteriaTypeDesc = criteriaTypeDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaTypeDesc(String criteriaTypeDesc) {
        this.criteriaTypeDesc = criteriaTypeDesc;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBBPOSN_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    public String getCriteriaEclsCode() {
        return criteriaEclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBBPOSN_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    public void setCriteriaEclsCode(String criteriaEclsCode) {
        this.criteriaEclsCode = criteriaEclsCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaEclsCode(String criteriaEclsCode) {
        this.criteriaEclsCode = criteriaEclsCode;
        return this;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.annualSal")
    public Double getCriteriaAnnualSal() {
        return criteriaAnnualSal;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.annualSal")
    public void setCriteriaAnnualSal(Double criteriaAnnualSal) {
        this.criteriaAnnualSal = criteriaAnnualSal;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaAnnualSal(Double criteriaAnnualSal) {
        this.criteriaAnnualSal = criteriaAnnualSal;
        return this;
    }

    @JsonProperty("criteria.salgrpDesc")
    public String getCriteriaSalgrpDesc() {
        return criteriaSalgrpDesc;
    }

    @JsonProperty("criteria.salgrpDesc")
    public void setCriteriaSalgrpDesc(String criteriaSalgrpDesc) {
        this.criteriaSalgrpDesc = criteriaSalgrpDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaSalgrpDesc(String criteriaSalgrpDesc) {
        this.criteriaSalgrpDesc = criteriaSalgrpDesc;
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

    public PositionDefinitionPosition100PutRequest withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
        return this;
    }

    @JsonProperty("criteria.jblnDesc")
    public String getCriteriaJblnDesc() {
        return criteriaJblnDesc;
    }

    @JsonProperty("criteria.jblnDesc")
    public void setCriteriaJblnDesc(String criteriaJblnDesc) {
        this.criteriaJblnDesc = criteriaJblnDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaJblnDesc(String criteriaJblnDesc) {
        this.criteriaJblnDesc = criteriaJblnDesc;
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

    public PositionDefinitionPosition100PutRequest withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public PositionDefinitionPosition100PutRequest withPosn(Object posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("criteria.step")
    public Double getCriteriaStep() {
        return criteriaStep;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBBPOSN_STEP
     * 
     */
    @JsonProperty("criteria.step")
    public void setCriteriaStep(Double criteriaStep) {
        this.criteriaStep = criteriaStep;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaStep(Double criteriaStep) {
        this.criteriaStep = criteriaStep;
        return this;
    }

    @JsonProperty("criteria.pclsDesc")
    public String getCriteriaPclsDesc() {
        return criteriaPclsDesc;
    }

    @JsonProperty("criteria.pclsDesc")
    public void setCriteriaPclsDesc(String criteriaPclsDesc) {
        this.criteriaPclsDesc = criteriaPclsDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaPclsDesc(String criteriaPclsDesc) {
        this.criteriaPclsDesc = criteriaPclsDesc;
        return this;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBBPOSN_TITLE
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryLimit")
    public Double getCriteriaSalaryLimit() {
        return criteriaSalaryLimit;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryLimit")
    public void setCriteriaSalaryLimit(Double criteriaSalaryLimit) {
        this.criteriaSalaryLimit = criteriaSalaryLimit;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaSalaryLimit(Double criteriaSalaryLimit) {
        this.criteriaSalaryLimit = criteriaSalaryLimit;
        return this;
    }

    @JsonProperty("criteria.bargDesc")
    public String getCriteriaBargDesc() {
        return criteriaBargDesc;
    }

    @JsonProperty("criteria.bargDesc")
    public void setCriteriaBargDesc(String criteriaBargDesc) {
        this.criteriaBargDesc = criteriaBargDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaBargDesc(String criteriaBargDesc) {
        this.criteriaBargDesc = criteriaBargDesc;
        return this;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    public String getCriteriaSgrpCode() {
        return criteriaSgrpCode;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBBPOSN_SGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    public void setCriteriaSgrpCode(String criteriaSgrpCode) {
        this.criteriaSgrpCode = criteriaSgrpCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaSgrpCode(String criteriaSgrpCode) {
        this.criteriaSgrpCode = criteriaSgrpCode;
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

    public PositionDefinitionPosition100PutRequest withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    @JsonProperty("criteria.rptToTitle")
    public String getCriteriaRptToTitle() {
        return criteriaRptToTitle;
    }

    @JsonProperty("criteria.rptToTitle")
    public void setCriteriaRptToTitle(String criteriaRptToTitle) {
        this.criteriaRptToTitle = criteriaRptToTitle;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaRptToTitle(String criteriaRptToTitle) {
        this.criteriaRptToTitle = criteriaRptToTitle;
        return this;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    public String getCriteriaWkshCode() {
        return criteriaWkshCode;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : NBBPOSN_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    public void setCriteriaWkshCode(String criteriaWkshCode) {
        this.criteriaWkshCode = criteriaWkshCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaWkshCode(String criteriaWkshCode) {
        this.criteriaWkshCode = criteriaWkshCode;
        return this;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("criteria.jblnCode")
    public String getCriteriaJblnCode() {
        return criteriaJblnCode;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBBPOSN_JBLN_CODE
     * 
     */
    @JsonProperty("criteria.jblnCode")
    public void setCriteriaJblnCode(String criteriaJblnCode) {
        this.criteriaJblnCode = criteriaJblnCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaJblnCode(String criteriaJblnCode) {
        this.criteriaJblnCode = criteriaJblnCode;
        return this;
    }

    @JsonProperty("criteria.jobpDesc")
    public String getCriteriaJobpDesc() {
        return criteriaJobpDesc;
    }

    @JsonProperty("criteria.jobpDesc")
    public void setCriteriaJobpDesc(String criteriaJobpDesc) {
        this.criteriaJobpDesc = criteriaJobpDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaJobpDesc(String criteriaJobpDesc) {
        this.criteriaJobpDesc = criteriaJobpDesc;
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

    public PositionDefinitionPosition100PutRequest withBudgetType(String budgetType) {
        this.budgetType = budgetType;
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

    public PositionDefinitionPosition100PutRequest withExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
        return this;
    }

    /**
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statusDesc")
    public String getCriteriaStatusDesc() {
        return criteriaStatusDesc;
    }

    /**
     * Position Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statusDesc")
    public void setCriteriaStatusDesc(String criteriaStatusDesc) {
        this.criteriaStatusDesc = criteriaStatusDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaStatusDesc(String criteriaStatusDesc) {
        this.criteriaStatusDesc = criteriaStatusDesc;
        return this;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.table")
    public String getCriteriaTable() {
        return criteriaTable;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBBPOSN_TABLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.table")
    public void setCriteriaTable(String criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaTable(String criteriaTable) {
        this.criteriaTable = criteriaTable;
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

    public PositionDefinitionPosition100PutRequest withWkshCode(String wkshCode) {
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

    public PositionDefinitionPosition100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("criteria.bargCode")
    public String getCriteriaBargCode() {
        return criteriaBargCode;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBBPOSN_BARG_CODE
     * 
     */
    @JsonProperty("criteria.bargCode")
    public void setCriteriaBargCode(String criteriaBargCode) {
        this.criteriaBargCode = criteriaBargCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaBargCode(String criteriaBargCode) {
        this.criteriaBargCode = criteriaBargCode;
        return this;
    }

    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryMidpoint")
    public Double getCriteriaSalaryMidpoint() {
        return criteriaSalaryMidpoint;
    }

    /**
     * Range Midpoint
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salaryMidpoint")
    public void setCriteriaSalaryMidpoint(Double criteriaSalaryMidpoint) {
        this.criteriaSalaryMidpoint = criteriaSalaryMidpoint;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaSalaryMidpoint(Double criteriaSalaryMidpoint) {
        this.criteriaSalaryMidpoint = criteriaSalaryMidpoint;
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

    public PositionDefinitionPosition100PutRequest withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    @JsonProperty("criteria.wkshCodeDesc")
    public String getCriteriaWkshCodeDesc() {
        return criteriaWkshCodeDesc;
    }

    @JsonProperty("criteria.wkshCodeDesc")
    public void setCriteriaWkshCodeDesc(String criteriaWkshCodeDesc) {
        this.criteriaWkshCodeDesc = criteriaWkshCodeDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaWkshCodeDesc(String criteriaWkshCodeDesc) {
        this.criteriaWkshCodeDesc = criteriaWkshCodeDesc;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pclsCode")
    public String getCriteriaPclsCode() {
        return criteriaPclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBBPOSN_PCLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pclsCode")
    public void setCriteriaPclsCode(String criteriaPclsCode) {
        this.criteriaPclsCode = criteriaPclsCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaPclsCode(String criteriaPclsCode) {
        this.criteriaPclsCode = criteriaPclsCode;
        return this;
    }

    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("criteria.posnReports")
    public String getCriteriaPosnReports() {
        return criteriaPosnReports;
    }

    /**
     * Reports To
     * <p>
     * Lineage reference object : NBBPOSN_POSN_REPORTS
     * 
     */
    @JsonProperty("criteria.posnReports")
    public void setCriteriaPosnReports(String criteriaPosnReports) {
        this.criteriaPosnReports = criteriaPosnReports;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaPosnReports(String criteriaPosnReports) {
        this.criteriaPosnReports = criteriaPosnReports;
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

    public PositionDefinitionPosition100PutRequest withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salary")
    public Double getCriteriaSalary() {
        return criteriaSalary;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salary")
    public void setCriteriaSalary(Double criteriaSalary) {
        this.criteriaSalary = criteriaSalary;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaSalary(Double criteriaSalary) {
        this.criteriaSalary = criteriaSalary;
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

    public PositionDefinitionPosition100PutRequest withJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
        return this;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetType")
    public String getCriteriaBudgetType() {
        return criteriaBudgetType;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : NBBPOSN_BUDGET_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetType")
    public void setCriteriaBudgetType(String criteriaBudgetType) {
        this.criteriaBudgetType = criteriaBudgetType;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaBudgetType(String criteriaBudgetType) {
        this.criteriaBudgetType = criteriaBudgetType;
        return this;
    }

    @JsonProperty("criteria.eclsDesc")
    public String getCriteriaEclsDesc() {
        return criteriaEclsDesc;
    }

    @JsonProperty("criteria.eclsDesc")
    public void setCriteriaEclsDesc(String criteriaEclsDesc) {
        this.criteriaEclsDesc = criteriaEclsDesc;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaEclsDesc(String criteriaEclsDesc) {
        this.criteriaEclsDesc = criteriaEclsDesc;
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

    public PositionDefinitionPosition100PutRequest withStep(Double step) {
        this.step = step;
        return this;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("criteria.jobpCode")
    public String getCriteriaJobpCode() {
        return criteriaJobpCode;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("criteria.jobpCode")
    public void setCriteriaJobpCode(String criteriaJobpCode) {
        this.criteriaJobpCode = criteriaJobpCode;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaJobpCode(String criteriaJobpCode) {
        this.criteriaJobpCode = criteriaJobpCode;
        return this;
    }

    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBBPOSN_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    public Double getCriteriaApptPct() {
        return criteriaApptPct;
    }

    /**
     * Appointment Percent
     * <p>
     * Lineage reference object : NBBPOSN_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    public void setCriteriaApptPct(Double criteriaApptPct) {
        this.criteriaApptPct = criteriaApptPct;
    }

    public PositionDefinitionPosition100PutRequest withCriteriaApptPct(Double criteriaApptPct) {
        this.criteriaApptPct = criteriaApptPct;
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

    public PositionDefinitionPosition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionDefinitionPosition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("bargCode");
        sb.append('=');
        sb.append(((this.bargCode == null)?"<null>":this.bargCode));
        sb.append(',');
        sb.append("sgrpCode");
        sb.append('=');
        sb.append(((this.sgrpCode == null)?"<null>":this.sgrpCode));
        sb.append(',');
        sb.append("criteriaAccrueSeniorityInd");
        sb.append('=');
        sb.append(((this.criteriaAccrueSeniorityInd == null)?"<null>":this.criteriaAccrueSeniorityInd));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("accrueSeniorityInd");
        sb.append('=');
        sb.append(((this.accrueSeniorityInd == null)?"<null>":this.accrueSeniorityInd));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("criteriaGrade");
        sb.append('=');
        sb.append(((this.criteriaGrade == null)?"<null>":this.criteriaGrade));
        sb.append(',');
        sb.append("criteriaExemptInd");
        sb.append('=');
        sb.append(((this.criteriaExemptInd == null)?"<null>":this.criteriaExemptInd));
        sb.append(',');
        sb.append("criteriaProbationUnits");
        sb.append('=');
        sb.append(((this.criteriaProbationUnits == null)?"<null>":this.criteriaProbationUnits));
        sb.append(',');
        sb.append("posnReports");
        sb.append('=');
        sb.append(((this.posnReports == null)?"<null>":this.posnReports));
        sb.append(',');
        sb.append("criteriaDisplayBeginDate");
        sb.append('=');
        sb.append(((this.criteriaDisplayBeginDate == null)?"<null>":this.criteriaDisplayBeginDate));
        sb.append(',');
        sb.append("criteriaTypeDesc");
        sb.append('=');
        sb.append(((this.criteriaTypeDesc == null)?"<null>":this.criteriaTypeDesc));
        sb.append(',');
        sb.append("criteriaEclsCode");
        sb.append('=');
        sb.append(((this.criteriaEclsCode == null)?"<null>":this.criteriaEclsCode));
        sb.append(',');
        sb.append("criteriaAnnualSal");
        sb.append('=');
        sb.append(((this.criteriaAnnualSal == null)?"<null>":this.criteriaAnnualSal));
        sb.append(',');
        sb.append("criteriaSalgrpDesc");
        sb.append('=');
        sb.append(((this.criteriaSalgrpDesc == null)?"<null>":this.criteriaSalgrpDesc));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("criteriaJblnDesc");
        sb.append('=');
        sb.append(((this.criteriaJblnDesc == null)?"<null>":this.criteriaJblnDesc));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaStep");
        sb.append('=');
        sb.append(((this.criteriaStep == null)?"<null>":this.criteriaStep));
        sb.append(',');
        sb.append("criteriaPclsDesc");
        sb.append('=');
        sb.append(((this.criteriaPclsDesc == null)?"<null>":this.criteriaPclsDesc));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaSalaryLimit");
        sb.append('=');
        sb.append(((this.criteriaSalaryLimit == null)?"<null>":this.criteriaSalaryLimit));
        sb.append(',');
        sb.append("criteriaBargDesc");
        sb.append('=');
        sb.append(((this.criteriaBargDesc == null)?"<null>":this.criteriaBargDesc));
        sb.append(',');
        sb.append("criteriaSgrpCode");
        sb.append('=');
        sb.append(((this.criteriaSgrpCode == null)?"<null>":this.criteriaSgrpCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("criteriaRptToTitle");
        sb.append('=');
        sb.append(((this.criteriaRptToTitle == null)?"<null>":this.criteriaRptToTitle));
        sb.append(',');
        sb.append("criteriaWkshCode");
        sb.append('=');
        sb.append(((this.criteriaWkshCode == null)?"<null>":this.criteriaWkshCode));
        sb.append(',');
        sb.append("criteriaJblnCode");
        sb.append('=');
        sb.append(((this.criteriaJblnCode == null)?"<null>":this.criteriaJblnCode));
        sb.append(',');
        sb.append("criteriaJobpDesc");
        sb.append('=');
        sb.append(((this.criteriaJobpDesc == null)?"<null>":this.criteriaJobpDesc));
        sb.append(',');
        sb.append("budgetType");
        sb.append('=');
        sb.append(((this.budgetType == null)?"<null>":this.budgetType));
        sb.append(',');
        sb.append("exemptInd");
        sb.append('=');
        sb.append(((this.exemptInd == null)?"<null>":this.exemptInd));
        sb.append(',');
        sb.append("criteriaStatusDesc");
        sb.append('=');
        sb.append(((this.criteriaStatusDesc == null)?"<null>":this.criteriaStatusDesc));
        sb.append(',');
        sb.append("criteriaTable");
        sb.append('=');
        sb.append(((this.criteriaTable == null)?"<null>":this.criteriaTable));
        sb.append(',');
        sb.append("wkshCode");
        sb.append('=');
        sb.append(((this.wkshCode == null)?"<null>":this.wkshCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaBargCode");
        sb.append('=');
        sb.append(((this.criteriaBargCode == null)?"<null>":this.criteriaBargCode));
        sb.append(',');
        sb.append("criteriaSalaryMidpoint");
        sb.append('=');
        sb.append(((this.criteriaSalaryMidpoint == null)?"<null>":this.criteriaSalaryMidpoint));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("criteriaWkshCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaWkshCodeDesc == null)?"<null>":this.criteriaWkshCodeDesc));
        sb.append(',');
        sb.append("criteriaPclsCode");
        sb.append('=');
        sb.append(((this.criteriaPclsCode == null)?"<null>":this.criteriaPclsCode));
        sb.append(',');
        sb.append("criteriaPosnReports");
        sb.append('=');
        sb.append(((this.criteriaPosnReports == null)?"<null>":this.criteriaPosnReports));
        sb.append(',');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("criteriaSalary");
        sb.append('=');
        sb.append(((this.criteriaSalary == null)?"<null>":this.criteriaSalary));
        sb.append(',');
        sb.append("jobpCode");
        sb.append('=');
        sb.append(((this.jobpCode == null)?"<null>":this.jobpCode));
        sb.append(',');
        sb.append("criteriaBudgetType");
        sb.append('=');
        sb.append(((this.criteriaBudgetType == null)?"<null>":this.criteriaBudgetType));
        sb.append(',');
        sb.append("criteriaEclsDesc");
        sb.append('=');
        sb.append(((this.criteriaEclsDesc == null)?"<null>":this.criteriaEclsDesc));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
        sb.append(',');
        sb.append("criteriaJobpCode");
        sb.append('=');
        sb.append(((this.criteriaJobpCode == null)?"<null>":this.criteriaJobpCode));
        sb.append(',');
        sb.append("criteriaApptPct");
        sb.append('=');
        sb.append(((this.criteriaApptPct == null)?"<null>":this.criteriaApptPct));
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
        result = ((result* 31)+((this.criteriaBudgetType == null)? 0 :this.criteriaBudgetType.hashCode()));
        result = ((result* 31)+((this.bargCode == null)? 0 :this.bargCode.hashCode()));
        result = ((result* 31)+((this.criteriaSalaryMidpoint == null)? 0 :this.criteriaSalaryMidpoint.hashCode()));
        result = ((result* 31)+((this.sgrpCode == null)? 0 :this.sgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaAccrueSeniorityInd == null)? 0 :this.criteriaAccrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.accrueSeniorityInd == null)? 0 :this.accrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrade == null)? 0 :this.criteriaGrade.hashCode()));
        result = ((result* 31)+((this.posnReports == null)? 0 :this.posnReports.hashCode()));
        result = ((result* 31)+((this.criteriaTypeDesc == null)? 0 :this.criteriaTypeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaWkshCodeDesc == null)? 0 :this.criteriaWkshCodeDesc.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.criteriaPosnReports == null)? 0 :this.criteriaPosnReports.hashCode()));
        result = ((result* 31)+((this.criteriaStatusDesc == null)? 0 :this.criteriaStatusDesc.hashCode()));
        result = ((result* 31)+((this.criteriaProbationUnits == null)? 0 :this.criteriaProbationUnits.hashCode()));
        result = ((result* 31)+((this.criteriaExemptInd == null)? 0 :this.criteriaExemptInd.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaApptPct == null)? 0 :this.criteriaApptPct.hashCode()));
        result = ((result* 31)+((this.criteriaAnnualSal == null)? 0 :this.criteriaAnnualSal.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSalaryLimit == null)? 0 :this.criteriaSalaryLimit.hashCode()));
        result = ((result* 31)+((this.criteriaEclsDesc == null)? 0 :this.criteriaEclsDesc.hashCode()));
        result = ((result* 31)+((this.criteriaJobpCode == null)? 0 :this.criteriaJobpCode.hashCode()));
        result = ((result* 31)+((this.budgetType == null)? 0 :this.budgetType.hashCode()));
        result = ((result* 31)+((this.exemptInd == null)? 0 :this.exemptInd.hashCode()));
        result = ((result* 31)+((this.criteriaJblnDesc == null)? 0 :this.criteriaJblnDesc.hashCode()));
        result = ((result* 31)+((this.wkshCode == null)? 0 :this.wkshCode.hashCode()));
        result = ((result* 31)+((this.criteriaTable == null)? 0 :this.criteriaTable.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.criteriaBargCode == null)? 0 :this.criteriaBargCode.hashCode()));
        result = ((result* 31)+((this.criteriaPclsCode == null)? 0 :this.criteriaPclsCode.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaEclsCode == null)? 0 :this.criteriaEclsCode.hashCode()));
        result = ((result* 31)+((this.criteriaSalary == null)? 0 :this.criteriaSalary.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        result = ((result* 31)+((this.criteriaJobpDesc == null)? 0 :this.criteriaJobpDesc.hashCode()));
        result = ((result* 31)+((this.criteriaJblnCode == null)? 0 :this.criteriaJblnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSalgrpDesc == null)? 0 :this.criteriaSalgrpDesc.hashCode()));
        result = ((result* 31)+((this.criteriaBargDesc == null)? 0 :this.criteriaBargDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayBeginDate == null)? 0 :this.criteriaDisplayBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaRptToTitle == null)? 0 :this.criteriaRptToTitle.hashCode()));
        result = ((result* 31)+((this.jobpCode == null)? 0 :this.jobpCode.hashCode()));
        result = ((result* 31)+((this.criteriaSgrpCode == null)? 0 :this.criteriaSgrpCode.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.criteriaPclsDesc == null)? 0 :this.criteriaPclsDesc.hashCode()));
        result = ((result* 31)+((this.criteriaWkshCode == null)? 0 :this.criteriaWkshCode.hashCode()));
        result = ((result* 31)+((this.criteriaStep == null)? 0 :this.criteriaStep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionDefinitionPosition100PutRequest) == false) {
            return false;
        }
        PositionDefinitionPosition100PutRequest rhs = ((PositionDefinitionPosition100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.criteriaBudgetType == rhs.criteriaBudgetType)||((this.criteriaBudgetType!= null)&&this.criteriaBudgetType.equals(rhs.criteriaBudgetType))))&&((this.bargCode == rhs.bargCode)||((this.bargCode!= null)&&this.bargCode.equals(rhs.bargCode))))&&((this.criteriaSalaryMidpoint == rhs.criteriaSalaryMidpoint)||((this.criteriaSalaryMidpoint!= null)&&this.criteriaSalaryMidpoint.equals(rhs.criteriaSalaryMidpoint))))&&((this.sgrpCode == rhs.sgrpCode)||((this.sgrpCode!= null)&&this.sgrpCode.equals(rhs.sgrpCode))))&&((this.criteriaAccrueSeniorityInd == rhs.criteriaAccrueSeniorityInd)||((this.criteriaAccrueSeniorityInd!= null)&&this.criteriaAccrueSeniorityInd.equals(rhs.criteriaAccrueSeniorityInd))))&&((this.accrueSeniorityInd == rhs.accrueSeniorityInd)||((this.accrueSeniorityInd!= null)&&this.accrueSeniorityInd.equals(rhs.accrueSeniorityInd))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.criteriaGrade == rhs.criteriaGrade)||((this.criteriaGrade!= null)&&this.criteriaGrade.equals(rhs.criteriaGrade))))&&((this.posnReports == rhs.posnReports)||((this.posnReports!= null)&&this.posnReports.equals(rhs.posnReports))))&&((this.criteriaTypeDesc == rhs.criteriaTypeDesc)||((this.criteriaTypeDesc!= null)&&this.criteriaTypeDesc.equals(rhs.criteriaTypeDesc))))&&((this.criteriaWkshCodeDesc == rhs.criteriaWkshCodeDesc)||((this.criteriaWkshCodeDesc!= null)&&this.criteriaWkshCodeDesc.equals(rhs.criteriaWkshCodeDesc))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.criteriaPosnReports == rhs.criteriaPosnReports)||((this.criteriaPosnReports!= null)&&this.criteriaPosnReports.equals(rhs.criteriaPosnReports))))&&((this.criteriaStatusDesc == rhs.criteriaStatusDesc)||((this.criteriaStatusDesc!= null)&&this.criteriaStatusDesc.equals(rhs.criteriaStatusDesc))))&&((this.criteriaProbationUnits == rhs.criteriaProbationUnits)||((this.criteriaProbationUnits!= null)&&this.criteriaProbationUnits.equals(rhs.criteriaProbationUnits))))&&((this.criteriaExemptInd == rhs.criteriaExemptInd)||((this.criteriaExemptInd!= null)&&this.criteriaExemptInd.equals(rhs.criteriaExemptInd))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaApptPct == rhs.criteriaApptPct)||((this.criteriaApptPct!= null)&&this.criteriaApptPct.equals(rhs.criteriaApptPct))))&&((this.criteriaAnnualSal == rhs.criteriaAnnualSal)||((this.criteriaAnnualSal!= null)&&this.criteriaAnnualSal.equals(rhs.criteriaAnnualSal))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSalaryLimit == rhs.criteriaSalaryLimit)||((this.criteriaSalaryLimit!= null)&&this.criteriaSalaryLimit.equals(rhs.criteriaSalaryLimit))))&&((this.criteriaEclsDesc == rhs.criteriaEclsDesc)||((this.criteriaEclsDesc!= null)&&this.criteriaEclsDesc.equals(rhs.criteriaEclsDesc))))&&((this.criteriaJobpCode == rhs.criteriaJobpCode)||((this.criteriaJobpCode!= null)&&this.criteriaJobpCode.equals(rhs.criteriaJobpCode))))&&((this.budgetType == rhs.budgetType)||((this.budgetType!= null)&&this.budgetType.equals(rhs.budgetType))))&&((this.exemptInd == rhs.exemptInd)||((this.exemptInd!= null)&&this.exemptInd.equals(rhs.exemptInd))))&&((this.criteriaJblnDesc == rhs.criteriaJblnDesc)||((this.criteriaJblnDesc!= null)&&this.criteriaJblnDesc.equals(rhs.criteriaJblnDesc))))&&((this.wkshCode == rhs.wkshCode)||((this.wkshCode!= null)&&this.wkshCode.equals(rhs.wkshCode))))&&((this.criteriaTable == rhs.criteriaTable)||((this.criteriaTable!= null)&&this.criteriaTable.equals(rhs.criteriaTable))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.criteriaBargCode == rhs.criteriaBargCode)||((this.criteriaBargCode!= null)&&this.criteriaBargCode.equals(rhs.criteriaBargCode))))&&((this.criteriaPclsCode == rhs.criteriaPclsCode)||((this.criteriaPclsCode!= null)&&this.criteriaPclsCode.equals(rhs.criteriaPclsCode))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaEclsCode == rhs.criteriaEclsCode)||((this.criteriaEclsCode!= null)&&this.criteriaEclsCode.equals(rhs.criteriaEclsCode))))&&((this.criteriaSalary == rhs.criteriaSalary)||((this.criteriaSalary!= null)&&this.criteriaSalary.equals(rhs.criteriaSalary))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))))&&((this.criteriaJobpDesc == rhs.criteriaJobpDesc)||((this.criteriaJobpDesc!= null)&&this.criteriaJobpDesc.equals(rhs.criteriaJobpDesc))))&&((this.criteriaJblnCode == rhs.criteriaJblnCode)||((this.criteriaJblnCode!= null)&&this.criteriaJblnCode.equals(rhs.criteriaJblnCode))))&&((this.criteriaSalgrpDesc == rhs.criteriaSalgrpDesc)||((this.criteriaSalgrpDesc!= null)&&this.criteriaSalgrpDesc.equals(rhs.criteriaSalgrpDesc))))&&((this.criteriaBargDesc == rhs.criteriaBargDesc)||((this.criteriaBargDesc!= null)&&this.criteriaBargDesc.equals(rhs.criteriaBargDesc))))&&((this.criteriaDisplayBeginDate == rhs.criteriaDisplayBeginDate)||((this.criteriaDisplayBeginDate!= null)&&this.criteriaDisplayBeginDate.equals(rhs.criteriaDisplayBeginDate))))&&((this.criteriaRptToTitle == rhs.criteriaRptToTitle)||((this.criteriaRptToTitle!= null)&&this.criteriaRptToTitle.equals(rhs.criteriaRptToTitle))))&&((this.jobpCode == rhs.jobpCode)||((this.jobpCode!= null)&&this.jobpCode.equals(rhs.jobpCode))))&&((this.criteriaSgrpCode == rhs.criteriaSgrpCode)||((this.criteriaSgrpCode!= null)&&this.criteriaSgrpCode.equals(rhs.criteriaSgrpCode))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.criteriaPclsDesc == rhs.criteriaPclsDesc)||((this.criteriaPclsDesc!= null)&&this.criteriaPclsDesc.equals(rhs.criteriaPclsDesc))))&&((this.criteriaWkshCode == rhs.criteriaWkshCode)||((this.criteriaWkshCode!= null)&&this.criteriaWkshCode.equals(rhs.criteriaWkshCode))))&&((this.criteriaStep == rhs.criteriaStep)||((this.criteriaStep!= null)&&this.criteriaStep.equals(rhs.criteriaStep))));
    }

}
