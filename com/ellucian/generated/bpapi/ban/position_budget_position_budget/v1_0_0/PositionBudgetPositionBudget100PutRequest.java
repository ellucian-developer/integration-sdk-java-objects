
package com.ellucian.generated.bpapi.ban.position_budget_position_budget.v1_0_0;

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
    "premiumRollInd",
    "criteria.authNumber",
    "endDate",
    "criteria.bproCode",
    "criteria.endDate",
    "criteria.rollInd",
    "bproCode",
    "posn",
    "criteria.beginDate",
    "beginDate",
    "fiscCode",
    "rollInd",
    "criteria.status",
    "authNumber",
    "criteria.coasCode",
    "criteria.type",
    "criteria.premiumRollInd",
    "status"
})
@Generated("jsonschema2pojo")
public class PositionBudgetPositionBudget100PutRequest {

    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("premiumRollInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND")
    private String premiumRollInd;
    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_AUTH_NUMBER")
    private String criteriaAuthNumber;
    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_END_DATE")
    private Date endDate;
    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("criteria.bproCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro")
    private String criteriaBproCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_END_DATE")
    private Date criteriaEndDate;
    /**
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.rollInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ROLL_IND")
    private String criteriaRollInd;
    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("bproCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro")
    private String bproCode;
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
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_BEGIN_DATE")
    private Date beginDate;
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
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ROLL_IND")
    private String rollInd;
    /**
     * Status
     * <p>
     * Lineage reference object : NBBPOSN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_STATUS")
    private String criteriaStatus;
    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_AUTH_NUMBER")
    private String authNumber;
    /**
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("criteria.type")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TYPE")
    private String criteriaType;
    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.premiumRollInd")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND")
    private String criteriaPremiumRollInd;
    /**
     * Status
     * <p>
     * Lineage reference object : NBBPOSN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("premiumRollInd")
    public String getPremiumRollInd() {
        return premiumRollInd;
    }

    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("premiumRollInd")
    public void setPremiumRollInd(String premiumRollInd) {
        this.premiumRollInd = premiumRollInd;
    }

    public PositionBudgetPositionBudget100PutRequest withPremiumRollInd(String premiumRollInd) {
        this.premiumRollInd = premiumRollInd;
        return this;
    }

    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    public String getCriteriaAuthNumber() {
        return criteriaAuthNumber;
    }

    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    public void setCriteriaAuthNumber(String criteriaAuthNumber) {
        this.criteriaAuthNumber = criteriaAuthNumber;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaAuthNumber(String criteriaAuthNumber) {
        this.criteriaAuthNumber = criteriaAuthNumber;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PositionBudgetPositionBudget100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("criteria.bproCode")
    public String getCriteriaBproCode() {
        return criteriaBproCode;
    }

    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("criteria.bproCode")
    public void setCriteriaBproCode(String criteriaBproCode) {
        this.criteriaBproCode = criteriaBproCode;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaBproCode(String criteriaBproCode) {
        this.criteriaBproCode = criteriaBproCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBBPOSN_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.rollInd")
    public String getCriteriaRollInd() {
        return criteriaRollInd;
    }

    /**
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.rollInd")
    public void setCriteriaRollInd(String criteriaRollInd) {
        this.criteriaRollInd = criteriaRollInd;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaRollInd(String criteriaRollInd) {
        this.criteriaRollInd = criteriaRollInd;
        return this;
    }

    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("bproCode")
    public String getBproCode() {
        return bproCode;
    }

    /**
     * Budget Profile
     * <p>
     * Lineage reference object : NBBPOSN_BPRO_CODE, Lookup lineage reference object : ntvbpro
     * 
     */
    @JsonProperty("bproCode")
    public void setBproCode(String bproCode) {
        this.bproCode = bproCode;
    }

    public PositionBudgetPositionBudget100PutRequest withBproCode(String bproCode) {
        this.bproCode = bproCode;
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

    public PositionBudgetPositionBudget100PutRequest withPosn(Object posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBBPOSN_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public PositionBudgetPositionBudget100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public PositionBudgetPositionBudget100PutRequest withFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
        return this;
    }

    /**
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("rollInd")
    public String getRollInd() {
        return rollInd;
    }

    /**
     * Salary
     * <p>
     * Lineage reference object : NBBPOSN_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("rollInd")
    public void setRollInd(String rollInd) {
        this.rollInd = rollInd;
    }

    public PositionBudgetPositionBudget100PutRequest withRollInd(String rollInd) {
        this.rollInd = rollInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBBPOSN_STATUS
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
     * Lineage reference object : NBBPOSN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    public void setCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
        return this;
    }

    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    public String getAuthNumber() {
        return authNumber;
    }

    /**
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public PositionBudgetPositionBudget100PutRequest withAuthNumber(String authNumber) {
        this.authNumber = authNumber;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("criteria.type")
    public String getCriteriaType() {
        return criteriaType;
    }

    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("criteria.type")
    public void setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }

    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.premiumRollInd")
    public String getCriteriaPremiumRollInd() {
        return criteriaPremiumRollInd;
    }

    /**
     * Premium Earnings
     * <p>
     * Lineage reference object : NBBPOSN_PREMIUM_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.premiumRollInd")
    public void setCriteriaPremiumRollInd(String criteriaPremiumRollInd) {
        this.criteriaPremiumRollInd = criteriaPremiumRollInd;
    }

    public PositionBudgetPositionBudget100PutRequest withCriteriaPremiumRollInd(String criteriaPremiumRollInd) {
        this.criteriaPremiumRollInd = criteriaPremiumRollInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : NBBPOSN_STATUS
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
     * Lineage reference object : NBBPOSN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public PositionBudgetPositionBudget100PutRequest withStatus(String status) {
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

    public PositionBudgetPositionBudget100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetPositionBudget100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("premiumRollInd");
        sb.append('=');
        sb.append(((this.premiumRollInd == null)?"<null>":this.premiumRollInd));
        sb.append(',');
        sb.append("criteriaAuthNumber");
        sb.append('=');
        sb.append(((this.criteriaAuthNumber == null)?"<null>":this.criteriaAuthNumber));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("criteriaBproCode");
        sb.append('=');
        sb.append(((this.criteriaBproCode == null)?"<null>":this.criteriaBproCode));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaRollInd");
        sb.append('=');
        sb.append(((this.criteriaRollInd == null)?"<null>":this.criteriaRollInd));
        sb.append(',');
        sb.append("bproCode");
        sb.append('=');
        sb.append(((this.bproCode == null)?"<null>":this.bproCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("criteriaStatus");
        sb.append('=');
        sb.append(((this.criteriaStatus == null)?"<null>":this.criteriaStatus));
        sb.append(',');
        sb.append("authNumber");
        sb.append('=');
        sb.append(((this.authNumber == null)?"<null>":this.authNumber));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaType");
        sb.append('=');
        sb.append(((this.criteriaType == null)?"<null>":this.criteriaType));
        sb.append(',');
        sb.append("criteriaPremiumRollInd");
        sb.append('=');
        sb.append(((this.criteriaPremiumRollInd == null)?"<null>":this.criteriaPremiumRollInd));
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
        result = ((result* 31)+((this.premiumRollInd == null)? 0 :this.premiumRollInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaStatus == null)? 0 :this.criteriaStatus.hashCode()));
        result = ((result* 31)+((this.bproCode == null)? 0 :this.bproCode.hashCode()));
        result = ((result* 31)+((this.criteriaBproCode == null)? 0 :this.criteriaBproCode.hashCode()));
        result = ((result* 31)+((this.criteriaType == null)? 0 :this.criteriaType.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaPremiumRollInd == null)? 0 :this.criteriaPremiumRollInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.criteriaAuthNumber == null)? 0 :this.criteriaAuthNumber.hashCode()));
        result = ((result* 31)+((this.authNumber == null)? 0 :this.authNumber.hashCode()));
        result = ((result* 31)+((this.criteriaRollInd == null)? 0 :this.criteriaRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetPositionBudget100PutRequest) == false) {
            return false;
        }
        PositionBudgetPositionBudget100PutRequest rhs = ((PositionBudgetPositionBudget100PutRequest) other);
        return ((((((((((((((((((((this.premiumRollInd == rhs.premiumRollInd)||((this.premiumRollInd!= null)&&this.premiumRollInd.equals(rhs.premiumRollInd)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaStatus == rhs.criteriaStatus)||((this.criteriaStatus!= null)&&this.criteriaStatus.equals(rhs.criteriaStatus))))&&((this.bproCode == rhs.bproCode)||((this.bproCode!= null)&&this.bproCode.equals(rhs.bproCode))))&&((this.criteriaBproCode == rhs.criteriaBproCode)||((this.criteriaBproCode!= null)&&this.criteriaBproCode.equals(rhs.criteriaBproCode))))&&((this.criteriaType == rhs.criteriaType)||((this.criteriaType!= null)&&this.criteriaType.equals(rhs.criteriaType))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaPremiumRollInd == rhs.criteriaPremiumRollInd)||((this.criteriaPremiumRollInd!= null)&&this.criteriaPremiumRollInd.equals(rhs.criteriaPremiumRollInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.criteriaAuthNumber == rhs.criteriaAuthNumber)||((this.criteriaAuthNumber!= null)&&this.criteriaAuthNumber.equals(rhs.criteriaAuthNumber))))&&((this.authNumber == rhs.authNumber)||((this.authNumber!= null)&&this.authNumber.equals(rhs.authNumber))))&&((this.criteriaRollInd == rhs.criteriaRollInd)||((this.criteriaRollInd!= null)&&this.criteriaRollInd.equals(rhs.criteriaRollInd))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
