
package com.ellucian.generated.bpapi.ban.position_budget_fringe_benefit.v1_0_0;

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
    "criteria.budget",
    "bdcaCode",
    "fiscCode",
    "criteria.expend",
    "criteria.bdcaCode",
    "posn",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetFringeBenefit100PutRequest {

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("criteria.budget")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BUDGET")
    private Double criteriaBudget;
    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BDCA_CODE")
    private String bdcaCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    @JsonPropertyDescription("Lineage reference object : fiscCode")
    private String fiscCode;
    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("criteria.expend")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_EXPEND")
    private Double criteriaExpend;
    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BDCA_CODE")
    private String criteriaBdcaCode;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BUDGET")
    private Double budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
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
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("criteria.budget")
    public void setCriteriaBudget(Double criteriaBudget) {
        this.criteriaBudget = criteriaBudget;
    }

    public PositionBudgetFringeBenefit100PutRequest withCriteriaBudget(Double criteriaBudget) {
        this.criteriaBudget = criteriaBudget;
        return this;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public PositionBudgetFringeBenefit100PutRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
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
    public String getFiscCode() {
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
    public void setFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
    }

    public PositionBudgetFringeBenefit100PutRequest withFiscCode(String fiscCode) {
        this.fiscCode = fiscCode;
        return this;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("criteria.expend")
    public Double getCriteriaExpend() {
        return criteriaExpend;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("criteria.expend")
    public void setCriteriaExpend(Double criteriaExpend) {
        this.criteriaExpend = criteriaExpend;
    }

    public PositionBudgetFringeBenefit100PutRequest withCriteriaExpend(Double criteriaExpend) {
        this.criteriaExpend = criteriaExpend;
        return this;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    public String getCriteriaBdcaCode() {
        return criteriaBdcaCode;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    public void setCriteriaBdcaCode(String criteriaBdcaCode) {
        this.criteriaBdcaCode = criteriaBdcaCode;
    }

    public PositionBudgetFringeBenefit100PutRequest withCriteriaBdcaCode(String criteriaBdcaCode) {
        this.criteriaBdcaCode = criteriaBdcaCode;
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
    public String getPosn() {
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
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PositionBudgetFringeBenefit100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
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
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public PositionBudgetFringeBenefit100PutRequest withBudget(Double budget) {
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

    public PositionBudgetFringeBenefit100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetFringeBenefit100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaBudget");
        sb.append('=');
        sb.append(((this.criteriaBudget == null)?"<null>":this.criteriaBudget));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("criteriaExpend");
        sb.append('=');
        sb.append(((this.criteriaExpend == null)?"<null>":this.criteriaExpend));
        sb.append(',');
        sb.append("criteriaBdcaCode");
        sb.append('=');
        sb.append(((this.criteriaBdcaCode == null)?"<null>":this.criteriaBdcaCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.criteriaExpend == null)? 0 :this.criteriaExpend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaBdcaCode == null)? 0 :this.criteriaBdcaCode.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetFringeBenefit100PutRequest) == false) {
            return false;
        }
        PositionBudgetFringeBenefit100PutRequest rhs = ((PositionBudgetFringeBenefit100PutRequest) other);
        return (((((((((this.criteriaBudget == rhs.criteriaBudget)||((this.criteriaBudget!= null)&&this.criteriaBudget.equals(rhs.criteriaBudget)))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.criteriaExpend == rhs.criteriaExpend)||((this.criteriaExpend!= null)&&this.criteriaExpend.equals(rhs.criteriaExpend))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaBdcaCode == rhs.criteriaBdcaCode)||((this.criteriaBdcaCode!= null)&&this.criteriaBdcaCode.equals(rhs.criteriaBdcaCode))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
