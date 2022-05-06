
package com.ellucian.generated.bpapi.ban.position_budget_salary_budgets.v1_0_0;

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
    "criteria.baseUnits",
    "criteria.budgBasis",
    "criteria.fte",
    "posn",
    "criteria.annBasis",
    "criteria.budget",
    "criteria.obudCode",
    "baseUnits",
    "apptPct",
    "fiscCode",
    "budgBasis",
    "fte",
    "criteria.sgrpCode",
    "criteria.status",
    "annBasis",
    "criteria.fiscCode",
    "criteria.obphCode",
    "criteria.orgnCode",
    "criteria.apptPct",
    "effectiveDate",
    "criteria.effectiveDate",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetSalaryBudgets100PutRequest {

    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("criteria.baseUnits")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BASE_UNITS")
    private Double criteriaBaseUnits;
    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgBasis")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BUDG_BASIS")
    private Double criteriaBudgBasis;
    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fte")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_FTE")
    private Double criteriaFte;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.annBasis")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ANN_BASIS")
    private Double criteriaAnnBasis;
    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("criteria.budget")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BUDGET")
    private Double criteriaBudget;
    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("criteria.obudCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_OBUD_CODE")
    private String criteriaObudCode;
    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("baseUnits")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BASE_UNITS")
    private Double baseUnits;
    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_APPT_PCT")
    private Double apptPct;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    @JsonPropertyDescription("Lineage reference object : fiscCode")
    private Object fiscCode;
    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("budgBasis")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BUDG_BASIS")
    private Double budgBasis;
    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_FTE")
    private Double fte;
    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_SGRP_CODE")
    private String criteriaSgrpCode;
    /**
     * Status
     * <p>
     * Lineage reference object : NBRPTOT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_STATUS")
    private String criteriaStatus;
    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("annBasis")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ANN_BASIS")
    private Double annBasis;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fiscCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_FISC_CODE")
    private String criteriaFiscCode;
    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("criteria.obphCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_OBPH_CODE")
    private String criteriaObphCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_APPT_PCT")
    private Double criteriaApptPct;
    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BUDGET")
    private Double budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("criteria.baseUnits")
    public Double getCriteriaBaseUnits() {
        return criteriaBaseUnits;
    }

    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("criteria.baseUnits")
    public void setCriteriaBaseUnits(Double criteriaBaseUnits) {
        this.criteriaBaseUnits = criteriaBaseUnits;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaBaseUnits(Double criteriaBaseUnits) {
        this.criteriaBaseUnits = criteriaBaseUnits;
        return this;
    }

    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgBasis")
    public Double getCriteriaBudgBasis() {
        return criteriaBudgBasis;
    }

    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgBasis")
    public void setCriteriaBudgBasis(Double criteriaBudgBasis) {
        this.criteriaBudgBasis = criteriaBudgBasis;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaBudgBasis(Double criteriaBudgBasis) {
        this.criteriaBudgBasis = criteriaBudgBasis;
        return this;
    }

    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fte")
    public Double getCriteriaFte() {
        return criteriaFte;
    }

    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fte")
    public void setCriteriaFte(Double criteriaFte) {
        this.criteriaFte = criteriaFte;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaFte(Double criteriaFte) {
        this.criteriaFte = criteriaFte;
        return this;
    }

    /**
     * Position
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
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public PositionBudgetSalaryBudgets100PutRequest withPosn(Object posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.annBasis")
    public Double getCriteriaAnnBasis() {
        return criteriaAnnBasis;
    }

    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("criteria.annBasis")
    public void setCriteriaAnnBasis(Double criteriaAnnBasis) {
        this.criteriaAnnBasis = criteriaAnnBasis;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaAnnBasis(Double criteriaAnnBasis) {
        this.criteriaAnnBasis = criteriaAnnBasis;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("criteria.budget")
    public Double getCriteriaBudget() {
        return criteriaBudget;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("criteria.budget")
    public void setCriteriaBudget(Double criteriaBudget) {
        this.criteriaBudget = criteriaBudget;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaBudget(Double criteriaBudget) {
        this.criteriaBudget = criteriaBudget;
        return this;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("criteria.obudCode")
    public String getCriteriaObudCode() {
        return criteriaObudCode;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("criteria.obudCode")
    public void setCriteriaObudCode(String criteriaObudCode) {
        this.criteriaObudCode = criteriaObudCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaObudCode(String criteriaObudCode) {
        this.criteriaObudCode = criteriaObudCode;
        return this;
    }

    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("baseUnits")
    public Double getBaseUnits() {
        return baseUnits;
    }

    /**
     * Base Units
     * <p>
     * Lineage reference object : NBRPTOT_BASE_UNITS
     * (Required)
     * 
     */
    @JsonProperty("baseUnits")
    public void setBaseUnits(Double baseUnits) {
        this.baseUnits = baseUnits;
    }

    public PositionBudgetSalaryBudgets100PutRequest withBaseUnits(Double baseUnits) {
        this.baseUnits = baseUnits;
        return this;
    }

    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    public Double getApptPct() {
        return apptPct;
    }

    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("apptPct")
    public void setApptPct(Double apptPct) {
        this.apptPct = apptPct;
    }

    public PositionBudgetSalaryBudgets100PutRequest withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public Object getFiscCode() {
        return fiscCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public void setFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
        return this;
    }

    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("budgBasis")
    public Double getBudgBasis() {
        return budgBasis;
    }

    /**
     * Position Budget Basis
     * <p>
     * Lineage reference object : NBRPTOT_BUDG_BASIS
     * (Required)
     * 
     */
    @JsonProperty("budgBasis")
    public void setBudgBasis(Double budgBasis) {
        this.budgBasis = budgBasis;
    }

    public PositionBudgetSalaryBudgets100PutRequest withBudgBasis(Double budgBasis) {
        this.budgBasis = budgBasis;
        return this;
    }

    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    public Double getFte() {
        return fte;
    }

    /**
     * Budget FTE
     * <p>
     * Lineage reference object : NBRPTOT_FTE
     * (Required)
     * 
     */
    @JsonProperty("fte")
    public void setFte(Double fte) {
        this.fte = fte;
    }

    public PositionBudgetSalaryBudgets100PutRequest withFte(Double fte) {
        this.fte = fte;
        return this;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    public String getCriteriaSgrpCode() {
        return criteriaSgrpCode;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("criteria.sgrpCode")
    public void setCriteriaSgrpCode(String criteriaSgrpCode) {
        this.criteriaSgrpCode = criteriaSgrpCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaSgrpCode(String criteriaSgrpCode) {
        this.criteriaSgrpCode = criteriaSgrpCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBRPTOT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    public String getCriteriaStatus() {
        return criteriaStatus;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBRPTOT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    public void setCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
        return this;
    }

    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("annBasis")
    public Double getAnnBasis() {
        return annBasis;
    }

    /**
     * Position Annual Basis
     * <p>
     * Lineage reference object : NBRPTOT_ANN_BASIS
     * (Required)
     * 
     */
    @JsonProperty("annBasis")
    public void setAnnBasis(Double annBasis) {
        this.annBasis = annBasis;
    }

    public PositionBudgetSalaryBudgets100PutRequest withAnnBasis(Double annBasis) {
        this.annBasis = annBasis;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fiscCode")
    public String getCriteriaFiscCode() {
        return criteriaFiscCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fiscCode")
    public void setCriteriaFiscCode(String criteriaFiscCode) {
        this.criteriaFiscCode = criteriaFiscCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaFiscCode(String criteriaFiscCode) {
        this.criteriaFiscCode = criteriaFiscCode;
        return this;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("criteria.obphCode")
    public String getCriteriaObphCode() {
        return criteriaObphCode;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("criteria.obphCode")
    public void setCriteriaObphCode(String criteriaObphCode) {
        this.criteriaObphCode = criteriaObphCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaObphCode(String criteriaObphCode) {
        this.criteriaObphCode = criteriaObphCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    public Double getCriteriaApptPct() {
        return criteriaApptPct;
    }

    /**
     * Budget Appointment Percent
     * <p>
     * Lineage reference object : NBRPTOT_APPT_PCT
     * (Required)
     * 
     */
    @JsonProperty("criteria.apptPct")
    public void setCriteriaApptPct(Double criteriaApptPct) {
        this.criteriaApptPct = criteriaApptPct;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaApptPct(Double criteriaApptPct) {
        this.criteriaApptPct = criteriaApptPct;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public PositionBudgetSalaryBudgets100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : NBRPTOT_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public PositionBudgetSalaryBudgets100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public Double getBudget() {
        return budget;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public PositionBudgetSalaryBudgets100PutRequest withBudget(Double budget) {
        this.budget = budget;
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

    public PositionBudgetSalaryBudgets100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetSalaryBudgets100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaBaseUnits");
        sb.append('=');
        sb.append(((this.criteriaBaseUnits == null)?"<null>":this.criteriaBaseUnits));
        sb.append(',');
        sb.append("criteriaBudgBasis");
        sb.append('=');
        sb.append(((this.criteriaBudgBasis == null)?"<null>":this.criteriaBudgBasis));
        sb.append(',');
        sb.append("criteriaFte");
        sb.append('=');
        sb.append(((this.criteriaFte == null)?"<null>":this.criteriaFte));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaAnnBasis");
        sb.append('=');
        sb.append(((this.criteriaAnnBasis == null)?"<null>":this.criteriaAnnBasis));
        sb.append(',');
        sb.append("criteriaBudget");
        sb.append('=');
        sb.append(((this.criteriaBudget == null)?"<null>":this.criteriaBudget));
        sb.append(',');
        sb.append("criteriaObudCode");
        sb.append('=');
        sb.append(((this.criteriaObudCode == null)?"<null>":this.criteriaObudCode));
        sb.append(',');
        sb.append("baseUnits");
        sb.append('=');
        sb.append(((this.baseUnits == null)?"<null>":this.baseUnits));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("budgBasis");
        sb.append('=');
        sb.append(((this.budgBasis == null)?"<null>":this.budgBasis));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("criteriaSgrpCode");
        sb.append('=');
        sb.append(((this.criteriaSgrpCode == null)?"<null>":this.criteriaSgrpCode));
        sb.append(',');
        sb.append("criteriaStatus");
        sb.append('=');
        sb.append(((this.criteriaStatus == null)?"<null>":this.criteriaStatus));
        sb.append(',');
        sb.append("annBasis");
        sb.append('=');
        sb.append(((this.annBasis == null)?"<null>":this.annBasis));
        sb.append(',');
        sb.append("criteriaFiscCode");
        sb.append('=');
        sb.append(((this.criteriaFiscCode == null)?"<null>":this.criteriaFiscCode));
        sb.append(',');
        sb.append("criteriaObphCode");
        sb.append('=');
        sb.append(((this.criteriaObphCode == null)?"<null>":this.criteriaObphCode));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("criteriaApptPct");
        sb.append('=');
        sb.append(((this.criteriaApptPct == null)?"<null>":this.criteriaApptPct));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
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
        result = ((result* 31)+((this.criteriaBudget == null)? 0 :this.criteriaBudget.hashCode()));
        result = ((result* 31)+((this.criteriaStatus == null)? 0 :this.criteriaStatus.hashCode()));
        result = ((result* 31)+((this.criteriaFte == null)? 0 :this.criteriaFte.hashCode()));
        result = ((result* 31)+((this.criteriaBudgBasis == null)? 0 :this.criteriaBudgBasis.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaBaseUnits == null)? 0 :this.criteriaBaseUnits.hashCode()));
        result = ((result* 31)+((this.criteriaApptPct == null)? 0 :this.criteriaApptPct.hashCode()));
        result = ((result* 31)+((this.criteriaAnnBasis == null)? 0 :this.criteriaAnnBasis.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.baseUnits == null)? 0 :this.baseUnits.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.budgBasis == null)? 0 :this.budgBasis.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaSgrpCode == null)? 0 :this.criteriaSgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaObudCode == null)? 0 :this.criteriaObudCode.hashCode()));
        result = ((result* 31)+((this.annBasis == null)? 0 :this.annBasis.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFiscCode == null)? 0 :this.criteriaFiscCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaObphCode == null)? 0 :this.criteriaObphCode.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetSalaryBudgets100PutRequest) == false) {
            return false;
        }
        PositionBudgetSalaryBudgets100PutRequest rhs = ((PositionBudgetSalaryBudgets100PutRequest) other);
        return ((((((((((((((((((((((((this.criteriaBudget == rhs.criteriaBudget)||((this.criteriaBudget!= null)&&this.criteriaBudget.equals(rhs.criteriaBudget)))&&((this.criteriaStatus == rhs.criteriaStatus)||((this.criteriaStatus!= null)&&this.criteriaStatus.equals(rhs.criteriaStatus))))&&((this.criteriaFte == rhs.criteriaFte)||((this.criteriaFte!= null)&&this.criteriaFte.equals(rhs.criteriaFte))))&&((this.criteriaBudgBasis == rhs.criteriaBudgBasis)||((this.criteriaBudgBasis!= null)&&this.criteriaBudgBasis.equals(rhs.criteriaBudgBasis))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaBaseUnits == rhs.criteriaBaseUnits)||((this.criteriaBaseUnits!= null)&&this.criteriaBaseUnits.equals(rhs.criteriaBaseUnits))))&&((this.criteriaApptPct == rhs.criteriaApptPct)||((this.criteriaApptPct!= null)&&this.criteriaApptPct.equals(rhs.criteriaApptPct))))&&((this.criteriaAnnBasis == rhs.criteriaAnnBasis)||((this.criteriaAnnBasis!= null)&&this.criteriaAnnBasis.equals(rhs.criteriaAnnBasis))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.baseUnits == rhs.baseUnits)||((this.baseUnits!= null)&&this.baseUnits.equals(rhs.baseUnits))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.budgBasis == rhs.budgBasis)||((this.budgBasis!= null)&&this.budgBasis.equals(rhs.budgBasis))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaSgrpCode == rhs.criteriaSgrpCode)||((this.criteriaSgrpCode!= null)&&this.criteriaSgrpCode.equals(rhs.criteriaSgrpCode))))&&((this.criteriaObudCode == rhs.criteriaObudCode)||((this.criteriaObudCode!= null)&&this.criteriaObudCode.equals(rhs.criteriaObudCode))))&&((this.annBasis == rhs.annBasis)||((this.annBasis!= null)&&this.annBasis.equals(rhs.annBasis))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFiscCode == rhs.criteriaFiscCode)||((this.criteriaFiscCode!= null)&&this.criteriaFiscCode.equals(rhs.criteriaFiscCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.criteriaObphCode == rhs.criteriaObphCode)||((this.criteriaObphCode!= null)&&this.criteriaObphCode.equals(rhs.criteriaObphCode))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
