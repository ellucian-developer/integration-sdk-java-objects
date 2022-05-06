
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
    "obudCode",
    "sgrpCode",
    "obphCode",
    "encumb",
    "coasCode",
    "createJfteInd",
    "orgnCode",
    "userId",
    "ptotAvail",
    "activityDate",
    "apptPct",
    "baseUnits",
    "budgBasis",
    "expend",
    "fiscCode",
    "fte",
    "annBasis",
    "comment",
    "effectiveDate",
    "budget",
    "status"
})
@Generated("jsonschema2pojo")
public class PositionBudgetComments100GetResponse {

    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_OBUD_CODE")
    private String obudCode;
    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("sgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_SGRP_CODE")
    private String sgrpCode;
    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_OBPH_CODE")
    private String obphCode;
    /**
     * Encumbered Amount
     * <p>
     * Lineage reference object : NBRPTOT_ENCUMB
     * 
     */
    @JsonProperty("encumb")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ENCUMB")
    private Double encumb;
    /**
     * COA
     * <p>
     * Lineage reference object : NBRPTOT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_COAS_CODE")
    private String coasCode;
    /**
     * Create FTE or Salary Records
     * <p>
     * Lineage reference object : NBRPTOT_CREATE_JFTE_IND
     * 
     */
    @JsonProperty("createJfteInd")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_CREATE_JFTE_IND")
    private String createJfteInd;
    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ORGN_CODE")
    private String orgnCode;
    /**
     * Lineage reference object : NBRPTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_USER_ID")
    private String userId;
    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ptotAvail")
    private Double ptotAvail;
    /**
     * Lineage reference object : NBRPTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_ACTIVITY_DATE")
    private Date activityDate;
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
     * Expended Amount
     * <p>
     * Lineage reference object : NBRPTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_EXPEND")
    private Double expend;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_FISC_CODE")
    private String fiscCode;
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
     * Comments
     * <p>
     * Lineage reference object : NBRPTOT_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_COMMENT")
    private String comment;
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
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRPTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_BUDGET")
    private Double budget;
    /**
     * Status
     * <p>
     * Lineage reference object : NBRPTOT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : NBRPTOT_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public String getObudCode() {
        return obudCode;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : NBRPTOT_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public void setObudCode(String obudCode) {
        this.obudCode = obudCode;
    }

    public PositionBudgetComments100GetResponse withObudCode(String obudCode) {
        this.obudCode = obudCode;
        return this;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("sgrpCode")
    public String getSgrpCode() {
        return sgrpCode;
    }

    /**
     * Salary Group
     * <p>
     * Lineage reference object : NBRPTOT_SGRP_CODE
     * 
     */
    @JsonProperty("sgrpCode")
    public void setSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
    }

    public PositionBudgetComments100GetResponse withSgrpCode(String sgrpCode) {
        this.sgrpCode = sgrpCode;
        return this;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    public String getObphCode() {
        return obphCode;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : NBRPTOT_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    public void setObphCode(String obphCode) {
        this.obphCode = obphCode;
    }

    public PositionBudgetComments100GetResponse withObphCode(String obphCode) {
        this.obphCode = obphCode;
        return this;
    }

    /**
     * Encumbered Amount
     * <p>
     * Lineage reference object : NBRPTOT_ENCUMB
     * 
     */
    @JsonProperty("encumb")
    public Double getEncumb() {
        return encumb;
    }

    /**
     * Encumbered Amount
     * <p>
     * Lineage reference object : NBRPTOT_ENCUMB
     * 
     */
    @JsonProperty("encumb")
    public void setEncumb(Double encumb) {
        this.encumb = encumb;
    }

    public PositionBudgetComments100GetResponse withEncumb(Double encumb) {
        this.encumb = encumb;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRPTOT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRPTOT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PositionBudgetComments100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Create FTE or Salary Records
     * <p>
     * Lineage reference object : NBRPTOT_CREATE_JFTE_IND
     * 
     */
    @JsonProperty("createJfteInd")
    public String getCreateJfteInd() {
        return createJfteInd;
    }

    /**
     * Create FTE or Salary Records
     * <p>
     * Lineage reference object : NBRPTOT_CREATE_JFTE_IND
     * 
     */
    @JsonProperty("createJfteInd")
    public void setCreateJfteInd(String createJfteInd) {
        this.createJfteInd = createJfteInd;
    }

    public PositionBudgetComments100GetResponse withCreateJfteInd(String createJfteInd) {
        this.createJfteInd = createJfteInd;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : NBRPTOT_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PositionBudgetComments100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Lineage reference object : NBRPTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBRPTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionBudgetComments100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ptotAvail")
    public Double getPtotAvail() {
        return ptotAvail;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ptotAvail")
    public void setPtotAvail(Double ptotAvail) {
        this.ptotAvail = ptotAvail;
    }

    public PositionBudgetComments100GetResponse withPtotAvail(Double ptotAvail) {
        this.ptotAvail = ptotAvail;
        return this;
    }

    /**
     * Lineage reference object : NBRPTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRPTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionBudgetComments100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public PositionBudgetComments100GetResponse withApptPct(Double apptPct) {
        this.apptPct = apptPct;
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

    public PositionBudgetComments100GetResponse withBaseUnits(Double baseUnits) {
        this.baseUnits = baseUnits;
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

    public PositionBudgetComments100GetResponse withBudgBasis(Double budgBasis) {
        this.budgBasis = budgBasis;
        return this;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRPTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public Double getExpend() {
        return expend;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRPTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public void setExpend(Double expend) {
        this.expend = expend;
    }

    public PositionBudgetComments100GetResponse withExpend(Double expend) {
        this.expend = expend;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public String getFiscCode() {
        return fiscCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : NBRPTOT_FISC_CODE
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public void setFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
    }

    public PositionBudgetComments100GetResponse withFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
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

    public PositionBudgetComments100GetResponse withFte(Double fte) {
        this.fte = fte;
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

    public PositionBudgetComments100GetResponse withAnnBasis(Double annBasis) {
        this.annBasis = annBasis;
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

    public PositionBudgetComments100GetResponse withComment(String comment) {
        this.comment = comment;
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

    public PositionBudgetComments100GetResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public PositionBudgetComments100GetResponse withBudget(Double budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBRPTOT_STATUS
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
     * Lineage reference object : NBRPTOT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public PositionBudgetComments100GetResponse withStatus(String status) {
        this.status = status;
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

    public PositionBudgetComments100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetComments100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("obudCode");
        sb.append('=');
        sb.append(((this.obudCode == null)?"<null>":this.obudCode));
        sb.append(',');
        sb.append("sgrpCode");
        sb.append('=');
        sb.append(((this.sgrpCode == null)?"<null>":this.sgrpCode));
        sb.append(',');
        sb.append("obphCode");
        sb.append('=');
        sb.append(((this.obphCode == null)?"<null>":this.obphCode));
        sb.append(',');
        sb.append("encumb");
        sb.append('=');
        sb.append(((this.encumb == null)?"<null>":this.encumb));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("createJfteInd");
        sb.append('=');
        sb.append(((this.createJfteInd == null)?"<null>":this.createJfteInd));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ptotAvail");
        sb.append('=');
        sb.append(((this.ptotAvail == null)?"<null>":this.ptotAvail));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("baseUnits");
        sb.append('=');
        sb.append(((this.baseUnits == null)?"<null>":this.baseUnits));
        sb.append(',');
        sb.append("budgBasis");
        sb.append('=');
        sb.append(((this.budgBasis == null)?"<null>":this.budgBasis));
        sb.append(',');
        sb.append("expend");
        sb.append('=');
        sb.append(((this.expend == null)?"<null>":this.expend));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("annBasis");
        sb.append('=');
        sb.append(((this.annBasis == null)?"<null>":this.annBasis));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.obudCode == null)? 0 :this.obudCode.hashCode()));
        result = ((result* 31)+((this.sgrpCode == null)? 0 :this.sgrpCode.hashCode()));
        result = ((result* 31)+((this.obphCode == null)? 0 :this.obphCode.hashCode()));
        result = ((result* 31)+((this.encumb == null)? 0 :this.encumb.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.createJfteInd == null)? 0 :this.createJfteInd.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ptotAvail == null)? 0 :this.ptotAvail.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.baseUnits == null)? 0 :this.baseUnits.hashCode()));
        result = ((result* 31)+((this.budgBasis == null)? 0 :this.budgBasis.hashCode()));
        result = ((result* 31)+((this.expend == null)? 0 :this.expend.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.annBasis == null)? 0 :this.annBasis.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetComments100GetResponse) == false) {
            return false;
        }
        PositionBudgetComments100GetResponse rhs = ((PositionBudgetComments100GetResponse) other);
        return (((((((((((((((((((((((this.obudCode == rhs.obudCode)||((this.obudCode!= null)&&this.obudCode.equals(rhs.obudCode)))&&((this.sgrpCode == rhs.sgrpCode)||((this.sgrpCode!= null)&&this.sgrpCode.equals(rhs.sgrpCode))))&&((this.obphCode == rhs.obphCode)||((this.obphCode!= null)&&this.obphCode.equals(rhs.obphCode))))&&((this.encumb == rhs.encumb)||((this.encumb!= null)&&this.encumb.equals(rhs.encumb))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.createJfteInd == rhs.createJfteInd)||((this.createJfteInd!= null)&&this.createJfteInd.equals(rhs.createJfteInd))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ptotAvail == rhs.ptotAvail)||((this.ptotAvail!= null)&&this.ptotAvail.equals(rhs.ptotAvail))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.baseUnits == rhs.baseUnits)||((this.baseUnits!= null)&&this.baseUnits.equals(rhs.baseUnits))))&&((this.budgBasis == rhs.budgBasis)||((this.budgBasis!= null)&&this.budgBasis.equals(rhs.budgBasis))))&&((this.expend == rhs.expend)||((this.expend!= null)&&this.expend.equals(rhs.expend))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.annBasis == rhs.annBasis)||((this.annBasis!= null)&&this.annBasis.equals(rhs.annBasis))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
