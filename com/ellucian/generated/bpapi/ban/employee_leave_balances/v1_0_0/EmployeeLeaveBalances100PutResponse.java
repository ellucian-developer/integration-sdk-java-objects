
package com.ellucian.generated.bpapi.ban.employee_leave_balances.v1_0_0;

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
    "leavCode",
    "activityDate",
    "changeReason",
    "dateAvail",
    "totalBalance",
    "leavDesc",
    "accrued",
    "taken",
    "hourInd",
    "userId",
    "hrsBanked",
    "beginBalance"
})
@Generated("jsonschema2pojo")
public class EmployeeLeaveBalances100PutResponse {

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("leavCode")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav")
    private String leavCode;
    /**
     * Lineage reference object : PERLEAV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Change Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("changeReason")
    private String changeReason;
    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("dateAvail")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_DATE_AVAIL")
    private Date dateAvail;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalBalance")
    private Double totalBalance;
    @JsonProperty("leavDesc")
    private String leavDesc;
    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("accrued")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_ACCRUED")
    private Double accrued;
    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("taken")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_TAKEN")
    private Double taken;
    /**
     * Day or Hour
     * <p>
     * 
     * 
     */
    @JsonProperty("hourInd")
    private String hourInd;
    /**
     * Lineage reference object : PERLEAV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_USER_ID")
    private String userId;
    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("hrsBanked")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_HRS_BANKED")
    private Double hrsBanked;
    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("beginBalance")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_BEGIN_BALANCE")
    private Double beginBalance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("leavCode")
    public String getLeavCode() {
        return leavCode;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public EmployeeLeaveBalances100PutResponse withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    /**
     * Lineage reference object : PERLEAV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PERLEAV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeLeaveBalances100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("changeReason")
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Change Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("changeReason")
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public EmployeeLeaveBalances100PutResponse withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("dateAvail")
    public Date getDateAvail() {
        return dateAvail;
    }

    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("dateAvail")
    public void setDateAvail(Date dateAvail) {
        this.dateAvail = dateAvail;
    }

    public EmployeeLeaveBalances100PutResponse withDateAvail(Date dateAvail) {
        this.dateAvail = dateAvail;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalBalance")
    public Double getTotalBalance() {
        return totalBalance;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("totalBalance")
    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public EmployeeLeaveBalances100PutResponse withTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }

    @JsonProperty("leavDesc")
    public String getLeavDesc() {
        return leavDesc;
    }

    @JsonProperty("leavDesc")
    public void setLeavDesc(String leavDesc) {
        this.leavDesc = leavDesc;
    }

    public EmployeeLeaveBalances100PutResponse withLeavDesc(String leavDesc) {
        this.leavDesc = leavDesc;
        return this;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("accrued")
    public Double getAccrued() {
        return accrued;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("accrued")
    public void setAccrued(Double accrued) {
        this.accrued = accrued;
    }

    public EmployeeLeaveBalances100PutResponse withAccrued(Double accrued) {
        this.accrued = accrued;
        return this;
    }

    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("taken")
    public Double getTaken() {
        return taken;
    }

    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("taken")
    public void setTaken(Double taken) {
        this.taken = taken;
    }

    public EmployeeLeaveBalances100PutResponse withTaken(Double taken) {
        this.taken = taken;
        return this;
    }

    /**
     * Day or Hour
     * <p>
     * 
     * 
     */
    @JsonProperty("hourInd")
    public String getHourInd() {
        return hourInd;
    }

    /**
     * Day or Hour
     * <p>
     * 
     * 
     */
    @JsonProperty("hourInd")
    public void setHourInd(String hourInd) {
        this.hourInd = hourInd;
    }

    public EmployeeLeaveBalances100PutResponse withHourInd(String hourInd) {
        this.hourInd = hourInd;
        return this;
    }

    /**
     * Lineage reference object : PERLEAV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PERLEAV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EmployeeLeaveBalances100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("hrsBanked")
    public Double getHrsBanked() {
        return hrsBanked;
    }

    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("hrsBanked")
    public void setHrsBanked(Double hrsBanked) {
        this.hrsBanked = hrsBanked;
    }

    public EmployeeLeaveBalances100PutResponse withHrsBanked(Double hrsBanked) {
        this.hrsBanked = hrsBanked;
        return this;
    }

    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("beginBalance")
    public Double getBeginBalance() {
        return beginBalance;
    }

    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("beginBalance")
    public void setBeginBalance(Double beginBalance) {
        this.beginBalance = beginBalance;
    }

    public EmployeeLeaveBalances100PutResponse withBeginBalance(Double beginBalance) {
        this.beginBalance = beginBalance;
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

    public EmployeeLeaveBalances100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeLeaveBalances100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
        sb.append(',');
        sb.append("dateAvail");
        sb.append('=');
        sb.append(((this.dateAvail == null)?"<null>":this.dateAvail));
        sb.append(',');
        sb.append("totalBalance");
        sb.append('=');
        sb.append(((this.totalBalance == null)?"<null>":this.totalBalance));
        sb.append(',');
        sb.append("leavDesc");
        sb.append('=');
        sb.append(((this.leavDesc == null)?"<null>":this.leavDesc));
        sb.append(',');
        sb.append("accrued");
        sb.append('=');
        sb.append(((this.accrued == null)?"<null>":this.accrued));
        sb.append(',');
        sb.append("taken");
        sb.append('=');
        sb.append(((this.taken == null)?"<null>":this.taken));
        sb.append(',');
        sb.append("hourInd");
        sb.append('=');
        sb.append(((this.hourInd == null)?"<null>":this.hourInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("hrsBanked");
        sb.append('=');
        sb.append(((this.hrsBanked == null)?"<null>":this.hrsBanked));
        sb.append(',');
        sb.append("beginBalance");
        sb.append('=');
        sb.append(((this.beginBalance == null)?"<null>":this.beginBalance));
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
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.dateAvail == null)? 0 :this.dateAvail.hashCode()));
        result = ((result* 31)+((this.totalBalance == null)? 0 :this.totalBalance.hashCode()));
        result = ((result* 31)+((this.leavDesc == null)? 0 :this.leavDesc.hashCode()));
        result = ((result* 31)+((this.hourInd == null)? 0 :this.hourInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.hrsBanked == null)? 0 :this.hrsBanked.hashCode()));
        result = ((result* 31)+((this.beginBalance == null)? 0 :this.beginBalance.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.accrued == null)? 0 :this.accrued.hashCode()));
        result = ((result* 31)+((this.taken == null)? 0 :this.taken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeLeaveBalances100PutResponse) == false) {
            return false;
        }
        EmployeeLeaveBalances100PutResponse rhs = ((EmployeeLeaveBalances100PutResponse) other);
        return ((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.dateAvail == rhs.dateAvail)||((this.dateAvail!= null)&&this.dateAvail.equals(rhs.dateAvail))))&&((this.totalBalance == rhs.totalBalance)||((this.totalBalance!= null)&&this.totalBalance.equals(rhs.totalBalance))))&&((this.leavDesc == rhs.leavDesc)||((this.leavDesc!= null)&&this.leavDesc.equals(rhs.leavDesc))))&&((this.hourInd == rhs.hourInd)||((this.hourInd!= null)&&this.hourInd.equals(rhs.hourInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.hrsBanked == rhs.hrsBanked)||((this.hrsBanked!= null)&&this.hrsBanked.equals(rhs.hrsBanked))))&&((this.beginBalance == rhs.beginBalance)||((this.beginBalance!= null)&&this.beginBalance.equals(rhs.beginBalance))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.accrued == rhs.accrued)||((this.accrued!= null)&&this.accrued.equals(rhs.accrued))))&&((this.taken == rhs.taken)||((this.taken!= null)&&this.taken.equals(rhs.taken))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
