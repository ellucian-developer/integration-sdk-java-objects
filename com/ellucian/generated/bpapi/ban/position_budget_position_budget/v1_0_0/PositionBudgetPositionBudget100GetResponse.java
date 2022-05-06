
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
    "beginDate",
    "premiumRollInd",
    "activityDate",
    "endDate",
    "rollInd",
    "authNumber",
    "bproCode",
    "coasCode",
    "type",
    "userId",
    "bproDesc",
    "status"
})
@Generated("jsonschema2pojo")
public class PositionBudgetPositionBudget100GetResponse {

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
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_ACTIVITY_DATE")
    private Date activityDate;
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
     * Authorized By
     * <p>
     * Lineage reference object : NBBPOSN_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_AUTH_NUMBER")
    private String authNumber;
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
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_COAS_CODE")
    private String coasCode;
    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_TYPE")
    private String type;
    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBBPOSN_USER_ID")
    private String userId;
    @JsonProperty("bproDesc")
    private String bproDesc;
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

    public PositionBudgetPositionBudget100GetResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

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

    public PositionBudgetPositionBudget100GetResponse withPremiumRollInd(String premiumRollInd) {
        this.premiumRollInd = premiumRollInd;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBBPOSN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionBudgetPositionBudget100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public PositionBudgetPositionBudget100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public PositionBudgetPositionBudget100GetResponse withRollInd(String rollInd) {
        this.rollInd = rollInd;
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

    public PositionBudgetPositionBudget100GetResponse withAuthNumber(String authNumber) {
        this.authNumber = authNumber;
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

    public PositionBudgetPositionBudget100GetResponse withBproCode(String bproCode) {
        this.bproCode = bproCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBBPOSN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PositionBudgetPositionBudget100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Lineage reference object : NBBPOSN_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public PositionBudgetPositionBudget100GetResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBBPOSN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionBudgetPositionBudget100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("bproDesc")
    public String getBproDesc() {
        return bproDesc;
    }

    @JsonProperty("bproDesc")
    public void setBproDesc(String bproDesc) {
        this.bproDesc = bproDesc;
    }

    public PositionBudgetPositionBudget100GetResponse withBproDesc(String bproDesc) {
        this.bproDesc = bproDesc;
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

    public PositionBudgetPositionBudget100GetResponse withStatus(String status) {
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

    public PositionBudgetPositionBudget100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetPositionBudget100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("premiumRollInd");
        sb.append('=');
        sb.append(((this.premiumRollInd == null)?"<null>":this.premiumRollInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("authNumber");
        sb.append('=');
        sb.append(((this.authNumber == null)?"<null>":this.authNumber));
        sb.append(',');
        sb.append("bproCode");
        sb.append('=');
        sb.append(((this.bproCode == null)?"<null>":this.bproCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("bproDesc");
        sb.append('=');
        sb.append(((this.bproDesc == null)?"<null>":this.bproDesc));
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
        result = ((result* 31)+((this.bproCode == null)? 0 :this.bproCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.bproDesc == null)? 0 :this.bproDesc.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.authNumber == null)? 0 :this.authNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetPositionBudget100GetResponse) == false) {
            return false;
        }
        PositionBudgetPositionBudget100GetResponse rhs = ((PositionBudgetPositionBudget100GetResponse) other);
        return ((((((((((((((this.premiumRollInd == rhs.premiumRollInd)||((this.premiumRollInd!= null)&&this.premiumRollInd.equals(rhs.premiumRollInd)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.bproCode == rhs.bproCode)||((this.bproCode!= null)&&this.bproCode.equals(rhs.bproCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.bproDesc == rhs.bproDesc)||((this.bproDesc!= null)&&this.bproDesc.equals(rhs.bproDesc))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.authNumber == rhs.authNumber)||((this.authNumber!= null)&&this.authNumber.equals(rhs.authNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
