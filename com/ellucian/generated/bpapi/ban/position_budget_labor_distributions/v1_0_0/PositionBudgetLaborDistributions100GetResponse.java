
package com.ellucian.generated.bpapi.ban.position_budget_labor_distributions.v1_0_0;

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
    "projCode",
    "acciCode",
    "newPlbdInd",
    "locnCode",
    "acctCode",
    "orgnCode",
    "percent",
    "userId",
    "activityDate",
    "fundCode",
    "progCode",
    "ctypCode",
    "actvCode",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetLaborDistributions100GetResponse {

    /**
     * To Be Posted
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_BUDGET_TO_POST")
    private Double budgetToPost;
    /**
     * Project
     * <p>
     * Lineage reference object : NBRPLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_PROJ_CODE")
    private String projCode;
    /**
     * Index
     * <p>
     * Lineage reference object : NBRPLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_ACCI_CODE")
    private String acciCode;
    @JsonProperty("newPlbdInd")
    private String newPlbdInd;
    /**
     * Location
     * <p>
     * Lineage reference object : NBRPLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_LOCN_CODE")
    private String locnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : NBRPLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_ACCT_CODE")
    private String acctCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRPLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_ORGN_CODE")
    private String orgnCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : NBRPLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_PERCENT")
    private Double percent;
    /**
     * Lineage reference object : NBRPLBD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_USER_ID")
    private String userId;
    /**
     * Lineage reference object : NBRPLBD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : NBRPLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_FUND_CODE")
    private String fundCode;
    /**
     * Program
     * <p>
     * Lineage reference object : NBRPLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_PROG_CODE")
    private String progCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : NBRPLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_CTYP_CODE")
    private String ctypCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : NBRPLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_ACTV_CODE")
    private String actvCode;
    /**
     * Salary Budget
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRPLBD_BUDGET")
    private Double budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Be Posted
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public Double getBudgetToPost() {
        return budgetToPost;
    }

    /**
     * To Be Posted
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET_TO_POST
     * 
     */
    @JsonProperty("budgetToPost")
    public void setBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
    }

    public PositionBudgetLaborDistributions100GetResponse withBudgetToPost(Double budgetToPost) {
        this.budgetToPost = budgetToPost;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : NBRPLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : NBRPLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRPLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRPLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    @JsonProperty("newPlbdInd")
    public String getNewPlbdInd() {
        return newPlbdInd;
    }

    @JsonProperty("newPlbdInd")
    public void setNewPlbdInd(String newPlbdInd) {
        this.newPlbdInd = newPlbdInd;
    }

    public PositionBudgetLaborDistributions100GetResponse withNewPlbdInd(String newPlbdInd) {
        this.newPlbdInd = newPlbdInd;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRPLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRPLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRPLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRPLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRPLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRPLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRPLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRPLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public PositionBudgetLaborDistributions100GetResponse withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Lineage reference object : NBRPLBD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBRPLBD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionBudgetLaborDistributions100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : NBRPLBD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRPLBD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionBudgetLaborDistributions100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRPLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRPLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRPLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRPLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRPLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRPLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRPLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRPLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public PositionBudgetLaborDistributions100GetResponse withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Salary Budget
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public Double getBudget() {
        return budget;
    }

    /**
     * Salary Budget
     * <p>
     * Lineage reference object : NBRPLBD_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public PositionBudgetLaborDistributions100GetResponse withBudget(Double budget) {
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

    public PositionBudgetLaborDistributions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetLaborDistributions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("budgetToPost");
        sb.append('=');
        sb.append(((this.budgetToPost == null)?"<null>":this.budgetToPost));
        sb.append(',');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("newPlbdInd");
        sb.append('=');
        sb.append(((this.newPlbdInd == null)?"<null>":this.newPlbdInd));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
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
        result = ((result* 31)+((this.projCode == null)? 0 :this.projCode.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.newPlbdInd == null)? 0 :this.newPlbdInd.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetLaborDistributions100GetResponse) == false) {
            return false;
        }
        PositionBudgetLaborDistributions100GetResponse rhs = ((PositionBudgetLaborDistributions100GetResponse) other);
        return (((((((((((((((((this.budgetToPost == rhs.budgetToPost)||((this.budgetToPost!= null)&&this.budgetToPost.equals(rhs.budgetToPost)))&&((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.newPlbdInd == rhs.newPlbdInd)||((this.newPlbdInd!= null)&&this.newPlbdInd.equals(rhs.newPlbdInd))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
