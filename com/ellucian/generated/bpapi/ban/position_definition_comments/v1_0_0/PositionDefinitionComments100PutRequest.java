
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
    "criteria.pgrpDesc",
    "criteria.accrueSeniorityInd",
    "criteria.cipcCode",
    "criteria.endDate",
    "criteria.grade",
    "criteria.ecipDesc",
    "criteria.exemptInd",
    "criteria.probationUnits",
    "criteria.displayBeginDate",
    "criteria.dottCode",
    "criteria.typeDesc",
    "criteria.eclsCode",
    "criteria.annualSal",
    "criteria.pfocCode",
    "criteria.salgrpDesc",
    "criteria.esocCode",
    "criteria.cipcDesc",
    "criteria.jblnDesc",
    "posn",
    "criteria.step",
    "criteria.pclsDesc",
    "criteria.title",
    "criteria.pfocDesc",
    "criteria.salaryLimit",
    "criteria.bargDesc",
    "criteria.ecipCode",
    "criteria.sgrpCode",
    "criteria.dottDesc",
    "criteria.rptToTitle",
    "criteria.wkshCode",
    "criteria.jblnCode",
    "criteria.jobpDesc",
    "criteria.pnocCode",
    "criteria.statusDesc",
    "criteria.table",
    "criteria.califType",
    "criteria.bargCode",
    "criteria.salaryMidpoint",
    "criteria.wkshCodeDesc",
    "criteria.pclsCode",
    "criteria.posnReports",
    "criteria.comment",
    "criteria.pgrpCode",
    "criteria.salary",
    "criteria.budgetType",
    "criteria.eclsDesc",
    "comment",
    "criteria.jobpCode",
    "criteria.esocDesc",
    "criteria.apptPct",
    "criteria.pnocDesc"
})
@Generated("jsonschema2pojo")
public class PositionDefinitionComments100PutRequest {

    @JsonProperty("criteria.pgrpDesc")
    private String criteriaPgrpDesc;
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
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("criteria.cipcCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc")
    private String criteriaCipcCode;
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
     * Salary Grade
     * <p>
     * Lineage reference object : NBBPOSN_GRADE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grade")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_GRADE")
    private String criteriaGrade;
    @JsonProperty("criteria.ecipDesc")
    private String criteriaEcipDesc;
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
     * Position Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayBeginDate")
    private Date criteriaDisplayBeginDate;
    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("criteria.dottCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott")
    private String criteriaDottCode;
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
    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("criteria.pfocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc")
    private String criteriaPfocCode;
    @JsonProperty("criteria.salgrpDesc")
    private String criteriaSalgrpDesc;
    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("criteria.esocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ESOC_CODE")
    private String criteriaEsocCode;
    @JsonProperty("criteria.cipcDesc")
    private String criteriaCipcDesc;
    @JsonProperty("criteria.jblnDesc")
    private String criteriaJblnDesc;
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
    @JsonProperty("criteria.pfocDesc")
    private String criteriaPfocDesc;
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
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("criteria.ecipCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ECIP_CODE")
    private String criteriaEcipCode;
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
    @JsonProperty("criteria.dottDesc")
    private String criteriaDottDesc;
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
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("criteria.pnocCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc")
    private String criteriaPnocCode;
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
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("criteria.califType")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_CALIF_TYPE")
    private String criteriaCalifType;
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
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_COMMENT")
    private String criteriaComment;
    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("criteria.pgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PGRP_CODE")
    private String criteriaPgrpCode;
    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.salary")
    private Double criteriaSalary;
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
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_COMMENT")
    private String comment;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBBPOSN_JOBP_CODE
     * 
     */
    @JsonProperty("criteria.jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_JOBP_CODE")
    private String criteriaJobpCode;
    @JsonProperty("criteria.esocDesc")
    private String criteriaEsocDesc;
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
    @JsonProperty("criteria.pnocDesc")
    private String criteriaPnocDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.pgrpDesc")
    public String getCriteriaPgrpDesc() {
        return criteriaPgrpDesc;
    }

    @JsonProperty("criteria.pgrpDesc")
    public void setCriteriaPgrpDesc(String criteriaPgrpDesc) {
        this.criteriaPgrpDesc = criteriaPgrpDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPgrpDesc(String criteriaPgrpDesc) {
        this.criteriaPgrpDesc = criteriaPgrpDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaAccrueSeniorityInd(String criteriaAccrueSeniorityInd) {
        this.criteriaAccrueSeniorityInd = criteriaAccrueSeniorityInd;
        return this;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("criteria.cipcCode")
    public String getCriteriaCipcCode() {
        return criteriaCipcCode;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : NBBPOSN_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("criteria.cipcCode")
    public void setCriteriaCipcCode(String criteriaCipcCode) {
        this.criteriaCipcCode = criteriaCipcCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaCipcCode(String criteriaCipcCode) {
        this.criteriaCipcCode = criteriaCipcCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
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

    public PositionDefinitionComments100PutRequest withCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
        return this;
    }

    @JsonProperty("criteria.ecipDesc")
    public String getCriteriaEcipDesc() {
        return criteriaEcipDesc;
    }

    @JsonProperty("criteria.ecipDesc")
    public void setCriteriaEcipDesc(String criteriaEcipDesc) {
        this.criteriaEcipDesc = criteriaEcipDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaEcipDesc(String criteriaEcipDesc) {
        this.criteriaEcipDesc = criteriaEcipDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaExemptInd(String criteriaExemptInd) {
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

    public PositionDefinitionComments100PutRequest withCriteriaProbationUnits(Double criteriaProbationUnits) {
        this.criteriaProbationUnits = criteriaProbationUnits;
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

    public PositionDefinitionComments100PutRequest withCriteriaDisplayBeginDate(Date criteriaDisplayBeginDate) {
        this.criteriaDisplayBeginDate = criteriaDisplayBeginDate;
        return this;
    }

    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("criteria.dottCode")
    public String getCriteriaDottCode() {
        return criteriaDottCode;
    }

    /**
     * Occupational Title Code
     * <p>
     * Lineage reference object : NBBPOSN_DOTT_CODE, Lookup lineage reference object : ntvdott
     * 
     */
    @JsonProperty("criteria.dottCode")
    public void setCriteriaDottCode(String criteriaDottCode) {
        this.criteriaDottCode = criteriaDottCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaDottCode(String criteriaDottCode) {
        this.criteriaDottCode = criteriaDottCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaTypeDesc(String criteriaTypeDesc) {
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

    public PositionDefinitionComments100PutRequest withCriteriaEclsCode(String criteriaEclsCode) {
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

    public PositionDefinitionComments100PutRequest withCriteriaAnnualSal(Double criteriaAnnualSal) {
        this.criteriaAnnualSal = criteriaAnnualSal;
        return this;
    }

    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("criteria.pfocCode")
    public String getCriteriaPfocCode() {
        return criteriaPfocCode;
    }

    /**
     * Federal Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PFOC_CODE, Lookup lineage reference object : ntvpfoc
     * 
     */
    @JsonProperty("criteria.pfocCode")
    public void setCriteriaPfocCode(String criteriaPfocCode) {
        this.criteriaPfocCode = criteriaPfocCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPfocCode(String criteriaPfocCode) {
        this.criteriaPfocCode = criteriaPfocCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaSalgrpDesc(String criteriaSalgrpDesc) {
        this.criteriaSalgrpDesc = criteriaSalgrpDesc;
        return this;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("criteria.esocCode")
    public String getCriteriaEsocCode() {
        return criteriaEsocCode;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBBPOSN_ESOC_CODE
     * 
     */
    @JsonProperty("criteria.esocCode")
    public void setCriteriaEsocCode(String criteriaEsocCode) {
        this.criteriaEsocCode = criteriaEsocCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaEsocCode(String criteriaEsocCode) {
        this.criteriaEsocCode = criteriaEsocCode;
        return this;
    }

    @JsonProperty("criteria.cipcDesc")
    public String getCriteriaCipcDesc() {
        return criteriaCipcDesc;
    }

    @JsonProperty("criteria.cipcDesc")
    public void setCriteriaCipcDesc(String criteriaCipcDesc) {
        this.criteriaCipcDesc = criteriaCipcDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaCipcDesc(String criteriaCipcDesc) {
        this.criteriaCipcDesc = criteriaCipcDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaJblnDesc(String criteriaJblnDesc) {
        this.criteriaJblnDesc = criteriaJblnDesc;
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

    public PositionDefinitionComments100PutRequest withPosn(Object posn) {
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

    public PositionDefinitionComments100PutRequest withCriteriaStep(Double criteriaStep) {
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

    public PositionDefinitionComments100PutRequest withCriteriaPclsDesc(String criteriaPclsDesc) {
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

    public PositionDefinitionComments100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    @JsonProperty("criteria.pfocDesc")
    public String getCriteriaPfocDesc() {
        return criteriaPfocDesc;
    }

    @JsonProperty("criteria.pfocDesc")
    public void setCriteriaPfocDesc(String criteriaPfocDesc) {
        this.criteriaPfocDesc = criteriaPfocDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPfocDesc(String criteriaPfocDesc) {
        this.criteriaPfocDesc = criteriaPfocDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaSalaryLimit(Double criteriaSalaryLimit) {
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

    public PositionDefinitionComments100PutRequest withCriteriaBargDesc(String criteriaBargDesc) {
        this.criteriaBargDesc = criteriaBargDesc;
        return this;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("criteria.ecipCode")
    public String getCriteriaEcipCode() {
        return criteriaEcipCode;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBBPOSN_ECIP_CODE
     * 
     */
    @JsonProperty("criteria.ecipCode")
    public void setCriteriaEcipCode(String criteriaEcipCode) {
        this.criteriaEcipCode = criteriaEcipCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaEcipCode(String criteriaEcipCode) {
        this.criteriaEcipCode = criteriaEcipCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaSgrpCode(String criteriaSgrpCode) {
        this.criteriaSgrpCode = criteriaSgrpCode;
        return this;
    }

    @JsonProperty("criteria.dottDesc")
    public String getCriteriaDottDesc() {
        return criteriaDottDesc;
    }

    @JsonProperty("criteria.dottDesc")
    public void setCriteriaDottDesc(String criteriaDottDesc) {
        this.criteriaDottDesc = criteriaDottDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaDottDesc(String criteriaDottDesc) {
        this.criteriaDottDesc = criteriaDottDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaRptToTitle(String criteriaRptToTitle) {
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

    public PositionDefinitionComments100PutRequest withCriteriaWkshCode(String criteriaWkshCode) {
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

    public PositionDefinitionComments100PutRequest withCriteriaJblnCode(String criteriaJblnCode) {
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

    public PositionDefinitionComments100PutRequest withCriteriaJobpDesc(String criteriaJobpDesc) {
        this.criteriaJobpDesc = criteriaJobpDesc;
        return this;
    }

    /**
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("criteria.pnocCode")
    public String getCriteriaPnocCode() {
        return criteriaPnocCode;
    }

    /**
     * National Occupation Code
     * <p>
     * Lineage reference object : NBBPOSN_PNOC_CODE, Lookup lineage reference object : ntvpnoc
     * 
     */
    @JsonProperty("criteria.pnocCode")
    public void setCriteriaPnocCode(String criteriaPnocCode) {
        this.criteriaPnocCode = criteriaPnocCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPnocCode(String criteriaPnocCode) {
        this.criteriaPnocCode = criteriaPnocCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaStatusDesc(String criteriaStatusDesc) {
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

    public PositionDefinitionComments100PutRequest withCriteriaTable(String criteriaTable) {
        this.criteriaTable = criteriaTable;
        return this;
    }

    /**
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("criteria.califType")
    public String getCriteriaCalifType() {
        return criteriaCalifType;
    }

    /**
     * California Pension Position Class Type
     * <p>
     * Lineage reference object : NBBPOSN_CALIF_TYPE
     * 
     */
    @JsonProperty("criteria.califType")
    public void setCriteriaCalifType(String criteriaCalifType) {
        this.criteriaCalifType = criteriaCalifType;
    }

    public PositionDefinitionComments100PutRequest withCriteriaCalifType(String criteriaCalifType) {
        this.criteriaCalifType = criteriaCalifType;
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

    public PositionDefinitionComments100PutRequest withCriteriaBargCode(String criteriaBargCode) {
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

    public PositionDefinitionComments100PutRequest withCriteriaSalaryMidpoint(Double criteriaSalaryMidpoint) {
        this.criteriaSalaryMidpoint = criteriaSalaryMidpoint;
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

    public PositionDefinitionComments100PutRequest withCriteriaWkshCodeDesc(String criteriaWkshCodeDesc) {
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

    public PositionDefinitionComments100PutRequest withCriteriaPclsCode(String criteriaPclsCode) {
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

    public PositionDefinitionComments100PutRequest withCriteriaPosnReports(String criteriaPosnReports) {
        this.criteriaPosnReports = criteriaPosnReports;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBBPOSN_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public PositionDefinitionComments100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
        return this;
    }

    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("criteria.pgrpCode")
    public String getCriteriaPgrpCode() {
        return criteriaPgrpCode;
    }

    /**
     * Position Group Code
     * <p>
     * Lineage reference object : NBBPOSN_PGRP_CODE
     * 
     */
    @JsonProperty("criteria.pgrpCode")
    public void setCriteriaPgrpCode(String criteriaPgrpCode) {
        this.criteriaPgrpCode = criteriaPgrpCode;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPgrpCode(String criteriaPgrpCode) {
        this.criteriaPgrpCode = criteriaPgrpCode;
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

    public PositionDefinitionComments100PutRequest withCriteriaSalary(Double criteriaSalary) {
        this.criteriaSalary = criteriaSalary;
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

    public PositionDefinitionComments100PutRequest withCriteriaBudgetType(String criteriaBudgetType) {
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

    public PositionDefinitionComments100PutRequest withCriteriaEclsDesc(String criteriaEclsDesc) {
        this.criteriaEclsDesc = criteriaEclsDesc;
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

    public PositionDefinitionComments100PutRequest withComment(String comment) {
        this.comment = comment;
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

    public PositionDefinitionComments100PutRequest withCriteriaJobpCode(String criteriaJobpCode) {
        this.criteriaJobpCode = criteriaJobpCode;
        return this;
    }

    @JsonProperty("criteria.esocDesc")
    public String getCriteriaEsocDesc() {
        return criteriaEsocDesc;
    }

    @JsonProperty("criteria.esocDesc")
    public void setCriteriaEsocDesc(String criteriaEsocDesc) {
        this.criteriaEsocDesc = criteriaEsocDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaEsocDesc(String criteriaEsocDesc) {
        this.criteriaEsocDesc = criteriaEsocDesc;
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

    public PositionDefinitionComments100PutRequest withCriteriaApptPct(Double criteriaApptPct) {
        this.criteriaApptPct = criteriaApptPct;
        return this;
    }

    @JsonProperty("criteria.pnocDesc")
    public String getCriteriaPnocDesc() {
        return criteriaPnocDesc;
    }

    @JsonProperty("criteria.pnocDesc")
    public void setCriteriaPnocDesc(String criteriaPnocDesc) {
        this.criteriaPnocDesc = criteriaPnocDesc;
    }

    public PositionDefinitionComments100PutRequest withCriteriaPnocDesc(String criteriaPnocDesc) {
        this.criteriaPnocDesc = criteriaPnocDesc;
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

    public PositionDefinitionComments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionDefinitionComments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaPgrpDesc");
        sb.append('=');
        sb.append(((this.criteriaPgrpDesc == null)?"<null>":this.criteriaPgrpDesc));
        sb.append(',');
        sb.append("criteriaAccrueSeniorityInd");
        sb.append('=');
        sb.append(((this.criteriaAccrueSeniorityInd == null)?"<null>":this.criteriaAccrueSeniorityInd));
        sb.append(',');
        sb.append("criteriaCipcCode");
        sb.append('=');
        sb.append(((this.criteriaCipcCode == null)?"<null>":this.criteriaCipcCode));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaGrade");
        sb.append('=');
        sb.append(((this.criteriaGrade == null)?"<null>":this.criteriaGrade));
        sb.append(',');
        sb.append("criteriaEcipDesc");
        sb.append('=');
        sb.append(((this.criteriaEcipDesc == null)?"<null>":this.criteriaEcipDesc));
        sb.append(',');
        sb.append("criteriaExemptInd");
        sb.append('=');
        sb.append(((this.criteriaExemptInd == null)?"<null>":this.criteriaExemptInd));
        sb.append(',');
        sb.append("criteriaProbationUnits");
        sb.append('=');
        sb.append(((this.criteriaProbationUnits == null)?"<null>":this.criteriaProbationUnits));
        sb.append(',');
        sb.append("criteriaDisplayBeginDate");
        sb.append('=');
        sb.append(((this.criteriaDisplayBeginDate == null)?"<null>":this.criteriaDisplayBeginDate));
        sb.append(',');
        sb.append("criteriaDottCode");
        sb.append('=');
        sb.append(((this.criteriaDottCode == null)?"<null>":this.criteriaDottCode));
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
        sb.append("criteriaPfocCode");
        sb.append('=');
        sb.append(((this.criteriaPfocCode == null)?"<null>":this.criteriaPfocCode));
        sb.append(',');
        sb.append("criteriaSalgrpDesc");
        sb.append('=');
        sb.append(((this.criteriaSalgrpDesc == null)?"<null>":this.criteriaSalgrpDesc));
        sb.append(',');
        sb.append("criteriaEsocCode");
        sb.append('=');
        sb.append(((this.criteriaEsocCode == null)?"<null>":this.criteriaEsocCode));
        sb.append(',');
        sb.append("criteriaCipcDesc");
        sb.append('=');
        sb.append(((this.criteriaCipcDesc == null)?"<null>":this.criteriaCipcDesc));
        sb.append(',');
        sb.append("criteriaJblnDesc");
        sb.append('=');
        sb.append(((this.criteriaJblnDesc == null)?"<null>":this.criteriaJblnDesc));
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
        sb.append("criteriaPfocDesc");
        sb.append('=');
        sb.append(((this.criteriaPfocDesc == null)?"<null>":this.criteriaPfocDesc));
        sb.append(',');
        sb.append("criteriaSalaryLimit");
        sb.append('=');
        sb.append(((this.criteriaSalaryLimit == null)?"<null>":this.criteriaSalaryLimit));
        sb.append(',');
        sb.append("criteriaBargDesc");
        sb.append('=');
        sb.append(((this.criteriaBargDesc == null)?"<null>":this.criteriaBargDesc));
        sb.append(',');
        sb.append("criteriaEcipCode");
        sb.append('=');
        sb.append(((this.criteriaEcipCode == null)?"<null>":this.criteriaEcipCode));
        sb.append(',');
        sb.append("criteriaSgrpCode");
        sb.append('=');
        sb.append(((this.criteriaSgrpCode == null)?"<null>":this.criteriaSgrpCode));
        sb.append(',');
        sb.append("criteriaDottDesc");
        sb.append('=');
        sb.append(((this.criteriaDottDesc == null)?"<null>":this.criteriaDottDesc));
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
        sb.append("criteriaPnocCode");
        sb.append('=');
        sb.append(((this.criteriaPnocCode == null)?"<null>":this.criteriaPnocCode));
        sb.append(',');
        sb.append("criteriaStatusDesc");
        sb.append('=');
        sb.append(((this.criteriaStatusDesc == null)?"<null>":this.criteriaStatusDesc));
        sb.append(',');
        sb.append("criteriaTable");
        sb.append('=');
        sb.append(((this.criteriaTable == null)?"<null>":this.criteriaTable));
        sb.append(',');
        sb.append("criteriaCalifType");
        sb.append('=');
        sb.append(((this.criteriaCalifType == null)?"<null>":this.criteriaCalifType));
        sb.append(',');
        sb.append("criteriaBargCode");
        sb.append('=');
        sb.append(((this.criteriaBargCode == null)?"<null>":this.criteriaBargCode));
        sb.append(',');
        sb.append("criteriaSalaryMidpoint");
        sb.append('=');
        sb.append(((this.criteriaSalaryMidpoint == null)?"<null>":this.criteriaSalaryMidpoint));
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
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("criteriaPgrpCode");
        sb.append('=');
        sb.append(((this.criteriaPgrpCode == null)?"<null>":this.criteriaPgrpCode));
        sb.append(',');
        sb.append("criteriaSalary");
        sb.append('=');
        sb.append(((this.criteriaSalary == null)?"<null>":this.criteriaSalary));
        sb.append(',');
        sb.append("criteriaBudgetType");
        sb.append('=');
        sb.append(((this.criteriaBudgetType == null)?"<null>":this.criteriaBudgetType));
        sb.append(',');
        sb.append("criteriaEclsDesc");
        sb.append('=');
        sb.append(((this.criteriaEclsDesc == null)?"<null>":this.criteriaEclsDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("criteriaJobpCode");
        sb.append('=');
        sb.append(((this.criteriaJobpCode == null)?"<null>":this.criteriaJobpCode));
        sb.append(',');
        sb.append("criteriaEsocDesc");
        sb.append('=');
        sb.append(((this.criteriaEsocDesc == null)?"<null>":this.criteriaEsocDesc));
        sb.append(',');
        sb.append("criteriaApptPct");
        sb.append('=');
        sb.append(((this.criteriaApptPct == null)?"<null>":this.criteriaApptPct));
        sb.append(',');
        sb.append("criteriaPnocDesc");
        sb.append('=');
        sb.append(((this.criteriaPnocDesc == null)?"<null>":this.criteriaPnocDesc));
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
        result = ((result* 31)+((this.criteriaBudgetType == null)? 0 :this.criteriaBudgetType.hashCode()));
        result = ((result* 31)+((this.criteriaSalaryMidpoint == null)? 0 :this.criteriaSalaryMidpoint.hashCode()));
        result = ((result* 31)+((this.criteriaEsocCode == null)? 0 :this.criteriaEsocCode.hashCode()));
        result = ((result* 31)+((this.criteriaAccrueSeniorityInd == null)? 0 :this.criteriaAccrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.criteriaGrade == null)? 0 :this.criteriaGrade.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.criteriaTypeDesc == null)? 0 :this.criteriaTypeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCipcCode == null)? 0 :this.criteriaCipcCode.hashCode()));
        result = ((result* 31)+((this.criteriaWkshCodeDesc == null)? 0 :this.criteriaWkshCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPosnReports == null)? 0 :this.criteriaPosnReports.hashCode()));
        result = ((result* 31)+((this.criteriaStatusDesc == null)? 0 :this.criteriaStatusDesc.hashCode()));
        result = ((result* 31)+((this.criteriaProbationUnits == null)? 0 :this.criteriaProbationUnits.hashCode()));
        result = ((result* 31)+((this.criteriaExemptInd == null)? 0 :this.criteriaExemptInd.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaApptPct == null)? 0 :this.criteriaApptPct.hashCode()));
        result = ((result* 31)+((this.criteriaAnnualSal == null)? 0 :this.criteriaAnnualSal.hashCode()));
        result = ((result* 31)+((this.criteriaEsocDesc == null)? 0 :this.criteriaEsocDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPnocDesc == null)? 0 :this.criteriaPnocDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSalaryLimit == null)? 0 :this.criteriaSalaryLimit.hashCode()));
        result = ((result* 31)+((this.criteriaEclsDesc == null)? 0 :this.criteriaEclsDesc.hashCode()));
        result = ((result* 31)+((this.criteriaJobpCode == null)? 0 :this.criteriaJobpCode.hashCode()));
        result = ((result* 31)+((this.criteriaPgrpCode == null)? 0 :this.criteriaPgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaCalifType == null)? 0 :this.criteriaCalifType.hashCode()));
        result = ((result* 31)+((this.criteriaJblnDesc == null)? 0 :this.criteriaJblnDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTable == null)? 0 :this.criteriaTable.hashCode()));
        result = ((result* 31)+((this.criteriaBargCode == null)? 0 :this.criteriaBargCode.hashCode()));
        result = ((result* 31)+((this.criteriaPfocCode == null)? 0 :this.criteriaPfocCode.hashCode()));
        result = ((result* 31)+((this.criteriaPclsCode == null)? 0 :this.criteriaPclsCode.hashCode()));
        result = ((result* 31)+((this.criteriaEcipDesc == null)? 0 :this.criteriaEcipDesc.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaEclsCode == null)? 0 :this.criteriaEclsCode.hashCode()));
        result = ((result* 31)+((this.criteriaSalary == null)? 0 :this.criteriaSalary.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaDottCode == null)? 0 :this.criteriaDottCode.hashCode()));
        result = ((result* 31)+((this.criteriaJobpDesc == null)? 0 :this.criteriaJobpDesc.hashCode()));
        result = ((result* 31)+((this.criteriaJblnCode == null)? 0 :this.criteriaJblnCode.hashCode()));
        result = ((result* 31)+((this.criteriaPgrpDesc == null)? 0 :this.criteriaPgrpDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPnocCode == null)? 0 :this.criteriaPnocCode.hashCode()));
        result = ((result* 31)+((this.criteriaSalgrpDesc == null)? 0 :this.criteriaSalgrpDesc.hashCode()));
        result = ((result* 31)+((this.criteriaBargDesc == null)? 0 :this.criteriaBargDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayBeginDate == null)? 0 :this.criteriaDisplayBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaEcipCode == null)? 0 :this.criteriaEcipCode.hashCode()));
        result = ((result* 31)+((this.criteriaDottDesc == null)? 0 :this.criteriaDottDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRptToTitle == null)? 0 :this.criteriaRptToTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCipcDesc == null)? 0 :this.criteriaCipcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSgrpCode == null)? 0 :this.criteriaSgrpCode.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.criteriaPclsDesc == null)? 0 :this.criteriaPclsDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPfocDesc == null)? 0 :this.criteriaPfocDesc.hashCode()));
        result = ((result* 31)+((this.criteriaWkshCode == null)? 0 :this.criteriaWkshCode.hashCode()));
        result = ((result* 31)+((this.criteriaStep == null)? 0 :this.criteriaStep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionDefinitionComments100PutRequest) == false) {
            return false;
        }
        PositionDefinitionComments100PutRequest rhs = ((PositionDefinitionComments100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaBudgetType == rhs.criteriaBudgetType)||((this.criteriaBudgetType!= null)&&this.criteriaBudgetType.equals(rhs.criteriaBudgetType)))&&((this.criteriaSalaryMidpoint == rhs.criteriaSalaryMidpoint)||((this.criteriaSalaryMidpoint!= null)&&this.criteriaSalaryMidpoint.equals(rhs.criteriaSalaryMidpoint))))&&((this.criteriaEsocCode == rhs.criteriaEsocCode)||((this.criteriaEsocCode!= null)&&this.criteriaEsocCode.equals(rhs.criteriaEsocCode))))&&((this.criteriaAccrueSeniorityInd == rhs.criteriaAccrueSeniorityInd)||((this.criteriaAccrueSeniorityInd!= null)&&this.criteriaAccrueSeniorityInd.equals(rhs.criteriaAccrueSeniorityInd))))&&((this.criteriaGrade == rhs.criteriaGrade)||((this.criteriaGrade!= null)&&this.criteriaGrade.equals(rhs.criteriaGrade))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.criteriaTypeDesc == rhs.criteriaTypeDesc)||((this.criteriaTypeDesc!= null)&&this.criteriaTypeDesc.equals(rhs.criteriaTypeDesc))))&&((this.criteriaCipcCode == rhs.criteriaCipcCode)||((this.criteriaCipcCode!= null)&&this.criteriaCipcCode.equals(rhs.criteriaCipcCode))))&&((this.criteriaWkshCodeDesc == rhs.criteriaWkshCodeDesc)||((this.criteriaWkshCodeDesc!= null)&&this.criteriaWkshCodeDesc.equals(rhs.criteriaWkshCodeDesc))))&&((this.criteriaPosnReports == rhs.criteriaPosnReports)||((this.criteriaPosnReports!= null)&&this.criteriaPosnReports.equals(rhs.criteriaPosnReports))))&&((this.criteriaStatusDesc == rhs.criteriaStatusDesc)||((this.criteriaStatusDesc!= null)&&this.criteriaStatusDesc.equals(rhs.criteriaStatusDesc))))&&((this.criteriaProbationUnits == rhs.criteriaProbationUnits)||((this.criteriaProbationUnits!= null)&&this.criteriaProbationUnits.equals(rhs.criteriaProbationUnits))))&&((this.criteriaExemptInd == rhs.criteriaExemptInd)||((this.criteriaExemptInd!= null)&&this.criteriaExemptInd.equals(rhs.criteriaExemptInd))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaApptPct == rhs.criteriaApptPct)||((this.criteriaApptPct!= null)&&this.criteriaApptPct.equals(rhs.criteriaApptPct))))&&((this.criteriaAnnualSal == rhs.criteriaAnnualSal)||((this.criteriaAnnualSal!= null)&&this.criteriaAnnualSal.equals(rhs.criteriaAnnualSal))))&&((this.criteriaEsocDesc == rhs.criteriaEsocDesc)||((this.criteriaEsocDesc!= null)&&this.criteriaEsocDesc.equals(rhs.criteriaEsocDesc))))&&((this.criteriaPnocDesc == rhs.criteriaPnocDesc)||((this.criteriaPnocDesc!= null)&&this.criteriaPnocDesc.equals(rhs.criteriaPnocDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSalaryLimit == rhs.criteriaSalaryLimit)||((this.criteriaSalaryLimit!= null)&&this.criteriaSalaryLimit.equals(rhs.criteriaSalaryLimit))))&&((this.criteriaEclsDesc == rhs.criteriaEclsDesc)||((this.criteriaEclsDesc!= null)&&this.criteriaEclsDesc.equals(rhs.criteriaEclsDesc))))&&((this.criteriaJobpCode == rhs.criteriaJobpCode)||((this.criteriaJobpCode!= null)&&this.criteriaJobpCode.equals(rhs.criteriaJobpCode))))&&((this.criteriaPgrpCode == rhs.criteriaPgrpCode)||((this.criteriaPgrpCode!= null)&&this.criteriaPgrpCode.equals(rhs.criteriaPgrpCode))))&&((this.criteriaCalifType == rhs.criteriaCalifType)||((this.criteriaCalifType!= null)&&this.criteriaCalifType.equals(rhs.criteriaCalifType))))&&((this.criteriaJblnDesc == rhs.criteriaJblnDesc)||((this.criteriaJblnDesc!= null)&&this.criteriaJblnDesc.equals(rhs.criteriaJblnDesc))))&&((this.criteriaTable == rhs.criteriaTable)||((this.criteriaTable!= null)&&this.criteriaTable.equals(rhs.criteriaTable))))&&((this.criteriaBargCode == rhs.criteriaBargCode)||((this.criteriaBargCode!= null)&&this.criteriaBargCode.equals(rhs.criteriaBargCode))))&&((this.criteriaPfocCode == rhs.criteriaPfocCode)||((this.criteriaPfocCode!= null)&&this.criteriaPfocCode.equals(rhs.criteriaPfocCode))))&&((this.criteriaPclsCode == rhs.criteriaPclsCode)||((this.criteriaPclsCode!= null)&&this.criteriaPclsCode.equals(rhs.criteriaPclsCode))))&&((this.criteriaEcipDesc == rhs.criteriaEcipDesc)||((this.criteriaEcipDesc!= null)&&this.criteriaEcipDesc.equals(rhs.criteriaEcipDesc))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaEclsCode == rhs.criteriaEclsCode)||((this.criteriaEclsCode!= null)&&this.criteriaEclsCode.equals(rhs.criteriaEclsCode))))&&((this.criteriaSalary == rhs.criteriaSalary)||((this.criteriaSalary!= null)&&this.criteriaSalary.equals(rhs.criteriaSalary))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaDottCode == rhs.criteriaDottCode)||((this.criteriaDottCode!= null)&&this.criteriaDottCode.equals(rhs.criteriaDottCode))))&&((this.criteriaJobpDesc == rhs.criteriaJobpDesc)||((this.criteriaJobpDesc!= null)&&this.criteriaJobpDesc.equals(rhs.criteriaJobpDesc))))&&((this.criteriaJblnCode == rhs.criteriaJblnCode)||((this.criteriaJblnCode!= null)&&this.criteriaJblnCode.equals(rhs.criteriaJblnCode))))&&((this.criteriaPgrpDesc == rhs.criteriaPgrpDesc)||((this.criteriaPgrpDesc!= null)&&this.criteriaPgrpDesc.equals(rhs.criteriaPgrpDesc))))&&((this.criteriaPnocCode == rhs.criteriaPnocCode)||((this.criteriaPnocCode!= null)&&this.criteriaPnocCode.equals(rhs.criteriaPnocCode))))&&((this.criteriaSalgrpDesc == rhs.criteriaSalgrpDesc)||((this.criteriaSalgrpDesc!= null)&&this.criteriaSalgrpDesc.equals(rhs.criteriaSalgrpDesc))))&&((this.criteriaBargDesc == rhs.criteriaBargDesc)||((this.criteriaBargDesc!= null)&&this.criteriaBargDesc.equals(rhs.criteriaBargDesc))))&&((this.criteriaDisplayBeginDate == rhs.criteriaDisplayBeginDate)||((this.criteriaDisplayBeginDate!= null)&&this.criteriaDisplayBeginDate.equals(rhs.criteriaDisplayBeginDate))))&&((this.criteriaEcipCode == rhs.criteriaEcipCode)||((this.criteriaEcipCode!= null)&&this.criteriaEcipCode.equals(rhs.criteriaEcipCode))))&&((this.criteriaDottDesc == rhs.criteriaDottDesc)||((this.criteriaDottDesc!= null)&&this.criteriaDottDesc.equals(rhs.criteriaDottDesc))))&&((this.criteriaRptToTitle == rhs.criteriaRptToTitle)||((this.criteriaRptToTitle!= null)&&this.criteriaRptToTitle.equals(rhs.criteriaRptToTitle))))&&((this.criteriaCipcDesc == rhs.criteriaCipcDesc)||((this.criteriaCipcDesc!= null)&&this.criteriaCipcDesc.equals(rhs.criteriaCipcDesc))))&&((this.criteriaSgrpCode == rhs.criteriaSgrpCode)||((this.criteriaSgrpCode!= null)&&this.criteriaSgrpCode.equals(rhs.criteriaSgrpCode))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.criteriaPclsDesc == rhs.criteriaPclsDesc)||((this.criteriaPclsDesc!= null)&&this.criteriaPclsDesc.equals(rhs.criteriaPclsDesc))))&&((this.criteriaPfocDesc == rhs.criteriaPfocDesc)||((this.criteriaPfocDesc!= null)&&this.criteriaPfocDesc.equals(rhs.criteriaPfocDesc))))&&((this.criteriaWkshCode == rhs.criteriaWkshCode)||((this.criteriaWkshCode!= null)&&this.criteriaWkshCode.equals(rhs.criteriaWkshCode))))&&((this.criteriaStep == rhs.criteriaStep)||((this.criteriaStep!= null)&&this.criteriaStep.equals(rhs.criteriaStep))));
    }

}
