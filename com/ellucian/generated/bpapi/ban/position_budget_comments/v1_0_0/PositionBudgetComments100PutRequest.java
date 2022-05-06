
package com.ellucian.generated.bpapi.ban.position_budget_comments.v1_0_0;

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
    "fiscCode",
    "criteria.sgrpCode",
    "criteria.status",
    "comment",
    "criteria.fiscCode",
    "criteria.obphCode",
    "criteria.orgnCode",
    "criteria.apptPct",
    "criteria.effectiveDate"
})
@Generated("jsonschema2pojo")
public class PositionBudgetComments100PutRequest {

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
     * Comments
     * <p>
     * Lineage reference object : NBRPTOT_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_COMMENT")
    private String comment;
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
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
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

    public PositionBudgetComments100PutRequest withCriteriaBaseUnits(Double criteriaBaseUnits) {
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

    public PositionBudgetComments100PutRequest withCriteriaBudgBasis(Double criteriaBudgBasis) {
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

    public PositionBudgetComments100PutRequest withCriteriaFte(Double criteriaFte) {
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

    public PositionBudgetComments100PutRequest withPosn(Object posn) {
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

    public PositionBudgetComments100PutRequest withCriteriaAnnBasis(Double criteriaAnnBasis) {
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

    public PositionBudgetComments100PutRequest withCriteriaBudget(Double criteriaBudget) {
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

    public PositionBudgetComments100PutRequest withCriteriaObudCode(String criteriaObudCode) {
        this.criteriaObudCode = criteriaObudCode;
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

    public PositionBudgetComments100PutRequest withFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
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

    public PositionBudgetComments100PutRequest withCriteriaSgrpCode(String criteriaSgrpCode) {
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

    public PositionBudgetComments100PutRequest withCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBRPTOT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NBRPTOT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PositionBudgetComments100PutRequest withComment(String comment) {
        this.comment = comment;
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

    public PositionBudgetComments100PutRequest withCriteriaFiscCode(String criteriaFiscCode) {
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

    public PositionBudgetComments100PutRequest withCriteriaObphCode(String criteriaObphCode) {
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

    public PositionBudgetComments100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
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

    public PositionBudgetComments100PutRequest withCriteriaApptPct(Double criteriaApptPct) {
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

    public PositionBudgetComments100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
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

    public PositionBudgetComments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetComments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("criteriaSgrpCode");
        sb.append('=');
        sb.append(((this.criteriaSgrpCode == null)?"<null>":this.criteriaSgrpCode));
        sb.append(',');
        sb.append("criteriaStatus");
        sb.append('=');
        sb.append(((this.criteriaStatus == null)?"<null>":this.criteriaStatus));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
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
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaSgrpCode == null)? 0 :this.criteriaSgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaObudCode == null)? 0 :this.criteriaObudCode.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFiscCode == null)? 0 :this.criteriaFiscCode.hashCode()));
        result = ((result* 31)+((this.criteriaObphCode == null)? 0 :this.criteriaObphCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetComments100PutRequest) == false) {
            return false;
        }
        PositionBudgetComments100PutRequest rhs = ((PositionBudgetComments100PutRequest) other);
        return ((((((((((((((((((this.criteriaBudget == rhs.criteriaBudget)||((this.criteriaBudget!= null)&&this.criteriaBudget.equals(rhs.criteriaBudget)))&&((this.criteriaStatus == rhs.criteriaStatus)||((this.criteriaStatus!= null)&&this.criteriaStatus.equals(rhs.criteriaStatus))))&&((this.criteriaFte == rhs.criteriaFte)||((this.criteriaFte!= null)&&this.criteriaFte.equals(rhs.criteriaFte))))&&((this.criteriaBudgBasis == rhs.criteriaBudgBasis)||((this.criteriaBudgBasis!= null)&&this.criteriaBudgBasis.equals(rhs.criteriaBudgBasis))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaBaseUnits == rhs.criteriaBaseUnits)||((this.criteriaBaseUnits!= null)&&this.criteriaBaseUnits.equals(rhs.criteriaBaseUnits))))&&((this.criteriaApptPct == rhs.criteriaApptPct)||((this.criteriaApptPct!= null)&&this.criteriaApptPct.equals(rhs.criteriaApptPct))))&&((this.criteriaAnnBasis == rhs.criteriaAnnBasis)||((this.criteriaAnnBasis!= null)&&this.criteriaAnnBasis.equals(rhs.criteriaAnnBasis))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaSgrpCode == rhs.criteriaSgrpCode)||((this.criteriaSgrpCode!= null)&&this.criteriaSgrpCode.equals(rhs.criteriaSgrpCode))))&&((this.criteriaObudCode == rhs.criteriaObudCode)||((this.criteriaObudCode!= null)&&this.criteriaObudCode.equals(rhs.criteriaObudCode))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFiscCode == rhs.criteriaFiscCode)||((this.criteriaFiscCode!= null)&&this.criteriaFiscCode.equals(rhs.criteriaFiscCode))))&&((this.criteriaObphCode == rhs.criteriaObphCode)||((this.criteriaObphCode!= null)&&this.criteriaObphCode.equals(rhs.criteriaObphCode))));
    }

}
