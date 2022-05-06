
package com.ellucian.generated.bpapi.ban.position_budget_fringe_benefit.v1_0_0;

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
    "budgetToPost",
    "activityDate",
    "bdcaCode",
    "expend",
    "bdcaDesc",
    "ftotRemaining",
    "userId",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetFringeBenefit100PutResponse {

    /**
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BUDGET_TO_POST")
    private Double budgetToPost;
    /**
     * Lineage reference object : NBRFTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_ACTIVITY_DATE")
    private Date activityDate;
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
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_EXPEND")
    private Double expend;
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ftotRemaining")
    private Double ftotRemaining;
    /**
     * Lineage reference object : NBRFTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_USER_ID")
    private String userId;
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
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public Double getBudgetToPost() {
        return budgetToPost;
    }

    /**
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public void setBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
    }

    public PositionBudgetFringeBenefit100PutResponse withBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
        return this;
    }

    /**
     * Lineage reference object : NBRFTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRFTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionBudgetFringeBenefit100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public PositionBudgetFringeBenefit100PutResponse withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public Double getExpend() {
        return expend;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRFTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public void setExpend(Double expend) {
        this.expend = expend;
    }

    public PositionBudgetFringeBenefit100PutResponse withExpend(Double expend) {
        this.expend = expend;
        return this;
    }

    @JsonProperty("bdcaDesc")
    public String getBdcaDesc() {
        return bdcaDesc;
    }

    @JsonProperty("bdcaDesc")
    public void setBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
    }

    public PositionBudgetFringeBenefit100PutResponse withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ftotRemaining")
    public Double getFtotRemaining() {
        return ftotRemaining;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("ftotRemaining")
    public void setFtotRemaining(Double ftotRemaining) {
        this.ftotRemaining = ftotRemaining;
    }

    public PositionBudgetFringeBenefit100PutResponse withFtotRemaining(Double ftotRemaining) {
        this.ftotRemaining = ftotRemaining;
        return this;
    }

    /**
     * Lineage reference object : NBRFTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBRFTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionBudgetFringeBenefit100PutResponse withUserId(String userId) {
        this.userId = userId;
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

    public PositionBudgetFringeBenefit100PutResponse withBudget(Double budget) {
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

    public PositionBudgetFringeBenefit100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetFringeBenefit100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("budgetToPost");
        sb.append('=');
        sb.append(((this.budgetToPost == null)?"<null>":this.budgetToPost));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("expend");
        sb.append('=');
        sb.append(((this.expend == null)?"<null>":this.expend));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("ftotRemaining");
        sb.append('=');
        sb.append(((this.ftotRemaining == null)?"<null>":this.ftotRemaining));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.budgetToPost == null)? 0 :this.budgetToPost.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.expend == null)? 0 :this.expend.hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftotRemaining == null)? 0 :this.ftotRemaining.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetFringeBenefit100PutResponse) == false) {
            return false;
        }
        PositionBudgetFringeBenefit100PutResponse rhs = ((PositionBudgetFringeBenefit100PutResponse) other);
        return ((((((((((this.budgetToPost == rhs.budgetToPost)||((this.budgetToPost!= null)&&this.budgetToPost.equals(rhs.budgetToPost)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.expend == rhs.expend)||((this.expend!= null)&&this.expend.equals(rhs.expend))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftotRemaining == rhs.ftotRemaining)||((this.ftotRemaining!= null)&&this.ftotRemaining.equals(rhs.ftotRemaining))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
