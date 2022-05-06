
package com.ellucian.generated.bpapi.ban.position_budget_premium_earnings_totals.v1_0_0;

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
    "earnDesc",
    "activityDate",
    "expend",
    "earnCode",
    "userId",
    "remaining",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetPremiumEarningsTotals100PostResponse {

    /**
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRRTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_BUDGET_TO_POST")
    private Double budgetToPost;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("earnDesc")
    private String earnDesc;
    /**
     * Lineage reference object : NBRRTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRRTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_EXPEND")
    private Double expend;
    /**
     * Earnings
     * <p>
     * Lineage reference object : NBRRTOT_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_EARN_CODE")
    private String earnCode;
    /**
     * Lineage reference object : NBRRTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_USER_ID")
    private String userId;
    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("remaining")
    private Double remaining;
    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRRTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRRTOT_BUDGET")
    private Double budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRRTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public Double getBudgetToPost() {
        return budgetToPost;
    }

    /**
     * Budget To be Posted
     * <p>
     * Lineage reference object : NBRRTOT_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public void setBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("earnDesc")
    public String getEarnDesc() {
        return earnDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("earnDesc")
    public void setEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
        return this;
    }

    /**
     * Lineage reference object : NBRRTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRRTOT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRRTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public Double getExpend() {
        return expend;
    }

    /**
     * Expended Amount
     * <p>
     * Lineage reference object : NBRRTOT_EXPEND
     * 
     */
    @JsonProperty("expend")
    public void setExpend(Double expend) {
        this.expend = expend;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withExpend(Double expend) {
        this.expend = expend;
        return this;
    }

    /**
     * Earnings
     * <p>
     * Lineage reference object : NBRRTOT_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public String getEarnCode() {
        return earnCode;
    }

    /**
     * Earnings
     * <p>
     * Lineage reference object : NBRRTOT_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * Lineage reference object : NBRRTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBRRTOT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("remaining")
    public Double getRemaining() {
        return remaining;
    }

    /**
     * Remaining Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("remaining")
    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withRemaining(Double remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRRTOT_BUDGET
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
     * Lineage reference object : NBRRTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public PositionBudgetPremiumEarningsTotals100PostResponse withBudget(Double budget) {
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

    public PositionBudgetPremiumEarningsTotals100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetPremiumEarningsTotals100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("budgetToPost");
        sb.append('=');
        sb.append(((this.budgetToPost == null)?"<null>":this.budgetToPost));
        sb.append(',');
        sb.append("earnDesc");
        sb.append('=');
        sb.append(((this.earnDesc == null)?"<null>":this.earnDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("expend");
        sb.append('=');
        sb.append(((this.expend == null)?"<null>":this.expend));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("remaining");
        sb.append('=');
        sb.append(((this.remaining == null)?"<null>":this.remaining));
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
        result = ((result* 31)+((this.earnDesc == null)? 0 :this.earnDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.expend == null)? 0 :this.expend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.remaining == null)? 0 :this.remaining.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetPremiumEarningsTotals100PostResponse) == false) {
            return false;
        }
        PositionBudgetPremiumEarningsTotals100PostResponse rhs = ((PositionBudgetPremiumEarningsTotals100PostResponse) other);
        return ((((((((((this.budgetToPost == rhs.budgetToPost)||((this.budgetToPost!= null)&&this.budgetToPost.equals(rhs.budgetToPost)))&&((this.earnDesc == rhs.earnDesc)||((this.earnDesc!= null)&&this.earnDesc.equals(rhs.earnDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.expend == rhs.expend)||((this.expend!= null)&&this.expend.equals(rhs.expend))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.remaining == rhs.remaining)||((this.remaining!= null)&&this.remaining.equals(rhs.remaining))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
