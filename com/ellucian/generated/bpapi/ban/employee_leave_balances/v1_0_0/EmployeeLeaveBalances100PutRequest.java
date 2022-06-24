
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
    "changeReason",
    "dateAvail",
    "criteria.accruedDay",
    "criteria.taken",
    "hrsBanked",
    "criteria.accrued",
    "beginBalance",
    "perleavLeavCode",
    "criteria.dateAvail",
    "accrued",
    "taken",
    "criteria.beginBalanceDay",
    "id",
    "criteria.hrsBanked",
    "criteria.leavCode",
    "criteria.hrsBankedDay",
    "criteria.totalBalanceDay",
    "criteria.beginBalance",
    "criteria.takenDay"
})
@Generated("jsonschema2pojo")
public class EmployeeLeaveBalances100PutRequest {

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
    @JsonProperty("criteria.accruedDay")
    private Double criteriaAccruedDay;
    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("criteria.taken")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_TAKEN")
    private Double criteriaTaken;
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
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("criteria.accrued")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_ACCRUED")
    private Double criteriaAccrued;
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
    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("perleavLeavCode")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav")
    private String perleavLeavCode;
    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateAvail")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_DATE_AVAIL")
    private Date criteriaDateAvail;
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalanceDay")
    private Double criteriaBeginBalanceDay;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBanked")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_HRS_BANKED")
    private Double criteriaHrsBanked;
    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("criteria.leavCode")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav")
    private String criteriaLeavCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBankedDay")
    private Double criteriaHrsBankedDay;
    /**
     * Current Available Days
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalBalanceDay")
    private Double criteriaTotalBalanceDay;
    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalance")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_BEGIN_BALANCE")
    private Double criteriaBeginBalance;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.takenDay")
    private Double criteriaTakenDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public EmployeeLeaveBalances100PutRequest withChangeReason(String changeReason) {
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

    public EmployeeLeaveBalances100PutRequest withDateAvail(Date dateAvail) {
        this.dateAvail = dateAvail;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.accruedDay")
    public Double getCriteriaAccruedDay() {
        return criteriaAccruedDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.accruedDay")
    public void setCriteriaAccruedDay(Double criteriaAccruedDay) {
        this.criteriaAccruedDay = criteriaAccruedDay;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaAccruedDay(Double criteriaAccruedDay) {
        this.criteriaAccruedDay = criteriaAccruedDay;
        return this;
    }

    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("criteria.taken")
    public Double getCriteriaTaken() {
        return criteriaTaken;
    }

    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * (Required)
     * 
     */
    @JsonProperty("criteria.taken")
    public void setCriteriaTaken(Double criteriaTaken) {
        this.criteriaTaken = criteriaTaken;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaTaken(Double criteriaTaken) {
        this.criteriaTaken = criteriaTaken;
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

    public EmployeeLeaveBalances100PutRequest withHrsBanked(Double hrsBanked) {
        this.hrsBanked = hrsBanked;
        return this;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("criteria.accrued")
    public Double getCriteriaAccrued() {
        return criteriaAccrued;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * (Required)
     * 
     */
    @JsonProperty("criteria.accrued")
    public void setCriteriaAccrued(Double criteriaAccrued) {
        this.criteriaAccrued = criteriaAccrued;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaAccrued(Double criteriaAccrued) {
        this.criteriaAccrued = criteriaAccrued;
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

    public EmployeeLeaveBalances100PutRequest withBeginBalance(Double beginBalance) {
        this.beginBalance = beginBalance;
        return this;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("perleavLeavCode")
    public String getPerleavLeavCode() {
        return perleavLeavCode;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("perleavLeavCode")
    public void setPerleavLeavCode(String perleavLeavCode) {
        this.perleavLeavCode = perleavLeavCode;
    }

    public EmployeeLeaveBalances100PutRequest withPerleavLeavCode(String perleavLeavCode) {
        this.perleavLeavCode = perleavLeavCode;
        return this;
    }

    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateAvail")
    public Date getCriteriaDateAvail() {
        return criteriaDateAvail;
    }

    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateAvail")
    public void setCriteriaDateAvail(Date criteriaDateAvail) {
        this.criteriaDateAvail = criteriaDateAvail;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaDateAvail(Date criteriaDateAvail) {
        this.criteriaDateAvail = criteriaDateAvail;
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

    public EmployeeLeaveBalances100PutRequest withAccrued(Double accrued) {
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

    public EmployeeLeaveBalances100PutRequest withTaken(Double taken) {
        this.taken = taken;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalanceDay")
    public Double getCriteriaBeginBalanceDay() {
        return criteriaBeginBalanceDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalanceDay")
    public void setCriteriaBeginBalanceDay(Double criteriaBeginBalanceDay) {
        this.criteriaBeginBalanceDay = criteriaBeginBalanceDay;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaBeginBalanceDay(Double criteriaBeginBalanceDay) {
        this.criteriaBeginBalanceDay = criteriaBeginBalanceDay;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeLeaveBalances100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBanked")
    public Double getCriteriaHrsBanked() {
        return criteriaHrsBanked;
    }

    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBanked")
    public void setCriteriaHrsBanked(Double criteriaHrsBanked) {
        this.criteriaHrsBanked = criteriaHrsBanked;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaHrsBanked(Double criteriaHrsBanked) {
        this.criteriaHrsBanked = criteriaHrsBanked;
        return this;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("criteria.leavCode")
    public String getCriteriaLeavCode() {
        return criteriaLeavCode;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * (Required)
     * 
     */
    @JsonProperty("criteria.leavCode")
    public void setCriteriaLeavCode(String criteriaLeavCode) {
        this.criteriaLeavCode = criteriaLeavCode;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaLeavCode(String criteriaLeavCode) {
        this.criteriaLeavCode = criteriaLeavCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBankedDay")
    public Double getCriteriaHrsBankedDay() {
        return criteriaHrsBankedDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsBankedDay")
    public void setCriteriaHrsBankedDay(Double criteriaHrsBankedDay) {
        this.criteriaHrsBankedDay = criteriaHrsBankedDay;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaHrsBankedDay(Double criteriaHrsBankedDay) {
        this.criteriaHrsBankedDay = criteriaHrsBankedDay;
        return this;
    }

    /**
     * Current Available Days
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalBalanceDay")
    public Double getCriteriaTotalBalanceDay() {
        return criteriaTotalBalanceDay;
    }

    /**
     * Current Available Days
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalBalanceDay")
    public void setCriteriaTotalBalanceDay(Double criteriaTotalBalanceDay) {
        this.criteriaTotalBalanceDay = criteriaTotalBalanceDay;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaTotalBalanceDay(Double criteriaTotalBalanceDay) {
        this.criteriaTotalBalanceDay = criteriaTotalBalanceDay;
        return this;
    }

    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalance")
    public Double getCriteriaBeginBalance() {
        return criteriaBeginBalance;
    }

    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginBalance")
    public void setCriteriaBeginBalance(Double criteriaBeginBalance) {
        this.criteriaBeginBalance = criteriaBeginBalance;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaBeginBalance(Double criteriaBeginBalance) {
        this.criteriaBeginBalance = criteriaBeginBalance;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.takenDay")
    public Double getCriteriaTakenDay() {
        return criteriaTakenDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.takenDay")
    public void setCriteriaTakenDay(Double criteriaTakenDay) {
        this.criteriaTakenDay = criteriaTakenDay;
    }

    public EmployeeLeaveBalances100PutRequest withCriteriaTakenDay(Double criteriaTakenDay) {
        this.criteriaTakenDay = criteriaTakenDay;
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

    public EmployeeLeaveBalances100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeLeaveBalances100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
        sb.append(',');
        sb.append("dateAvail");
        sb.append('=');
        sb.append(((this.dateAvail == null)?"<null>":this.dateAvail));
        sb.append(',');
        sb.append("criteriaAccruedDay");
        sb.append('=');
        sb.append(((this.criteriaAccruedDay == null)?"<null>":this.criteriaAccruedDay));
        sb.append(',');
        sb.append("criteriaTaken");
        sb.append('=');
        sb.append(((this.criteriaTaken == null)?"<null>":this.criteriaTaken));
        sb.append(',');
        sb.append("hrsBanked");
        sb.append('=');
        sb.append(((this.hrsBanked == null)?"<null>":this.hrsBanked));
        sb.append(',');
        sb.append("criteriaAccrued");
        sb.append('=');
        sb.append(((this.criteriaAccrued == null)?"<null>":this.criteriaAccrued));
        sb.append(',');
        sb.append("beginBalance");
        sb.append('=');
        sb.append(((this.beginBalance == null)?"<null>":this.beginBalance));
        sb.append(',');
        sb.append("perleavLeavCode");
        sb.append('=');
        sb.append(((this.perleavLeavCode == null)?"<null>":this.perleavLeavCode));
        sb.append(',');
        sb.append("criteriaDateAvail");
        sb.append('=');
        sb.append(((this.criteriaDateAvail == null)?"<null>":this.criteriaDateAvail));
        sb.append(',');
        sb.append("accrued");
        sb.append('=');
        sb.append(((this.accrued == null)?"<null>":this.accrued));
        sb.append(',');
        sb.append("taken");
        sb.append('=');
        sb.append(((this.taken == null)?"<null>":this.taken));
        sb.append(',');
        sb.append("criteriaBeginBalanceDay");
        sb.append('=');
        sb.append(((this.criteriaBeginBalanceDay == null)?"<null>":this.criteriaBeginBalanceDay));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaHrsBanked");
        sb.append('=');
        sb.append(((this.criteriaHrsBanked == null)?"<null>":this.criteriaHrsBanked));
        sb.append(',');
        sb.append("criteriaLeavCode");
        sb.append('=');
        sb.append(((this.criteriaLeavCode == null)?"<null>":this.criteriaLeavCode));
        sb.append(',');
        sb.append("criteriaHrsBankedDay");
        sb.append('=');
        sb.append(((this.criteriaHrsBankedDay == null)?"<null>":this.criteriaHrsBankedDay));
        sb.append(',');
        sb.append("criteriaTotalBalanceDay");
        sb.append('=');
        sb.append(((this.criteriaTotalBalanceDay == null)?"<null>":this.criteriaTotalBalanceDay));
        sb.append(',');
        sb.append("criteriaBeginBalance");
        sb.append('=');
        sb.append(((this.criteriaBeginBalance == null)?"<null>":this.criteriaBeginBalance));
        sb.append(',');
        sb.append("criteriaTakenDay");
        sb.append('=');
        sb.append(((this.criteriaTakenDay == null)?"<null>":this.criteriaTakenDay));
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
        result = ((result* 31)+((this.criteriaBeginBalanceDay == null)? 0 :this.criteriaBeginBalanceDay.hashCode()));
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.dateAvail == null)? 0 :this.dateAvail.hashCode()));
        result = ((result* 31)+((this.criteriaDateAvail == null)? 0 :this.criteriaDateAvail.hashCode()));
        result = ((result* 31)+((this.criteriaTaken == null)? 0 :this.criteriaTaken.hashCode()));
        result = ((result* 31)+((this.criteriaHrsBanked == null)? 0 :this.criteriaHrsBanked.hashCode()));
        result = ((result* 31)+((this.hrsBanked == null)? 0 :this.hrsBanked.hashCode()));
        result = ((result* 31)+((this.beginBalance == null)? 0 :this.beginBalance.hashCode()));
        result = ((result* 31)+((this.perleavLeavCode == null)? 0 :this.perleavLeavCode.hashCode()));
        result = ((result* 31)+((this.criteriaHrsBankedDay == null)? 0 :this.criteriaHrsBankedDay.hashCode()));
        result = ((result* 31)+((this.criteriaAccruedDay == null)? 0 :this.criteriaAccruedDay.hashCode()));
        result = ((result* 31)+((this.criteriaTotalBalanceDay == null)? 0 :this.criteriaTotalBalanceDay.hashCode()));
        result = ((result* 31)+((this.accrued == null)? 0 :this.accrued.hashCode()));
        result = ((result* 31)+((this.taken == null)? 0 :this.taken.hashCode()));
        result = ((result* 31)+((this.criteriaBeginBalance == null)? 0 :this.criteriaBeginBalance.hashCode()));
        result = ((result* 31)+((this.criteriaLeavCode == null)? 0 :this.criteriaLeavCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTakenDay == null)? 0 :this.criteriaTakenDay.hashCode()));
        result = ((result* 31)+((this.criteriaAccrued == null)? 0 :this.criteriaAccrued.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeLeaveBalances100PutRequest) == false) {
            return false;
        }
        EmployeeLeaveBalances100PutRequest rhs = ((EmployeeLeaveBalances100PutRequest) other);
        return (((((((((((((((((((((this.criteriaBeginBalanceDay == rhs.criteriaBeginBalanceDay)||((this.criteriaBeginBalanceDay!= null)&&this.criteriaBeginBalanceDay.equals(rhs.criteriaBeginBalanceDay)))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.dateAvail == rhs.dateAvail)||((this.dateAvail!= null)&&this.dateAvail.equals(rhs.dateAvail))))&&((this.criteriaDateAvail == rhs.criteriaDateAvail)||((this.criteriaDateAvail!= null)&&this.criteriaDateAvail.equals(rhs.criteriaDateAvail))))&&((this.criteriaTaken == rhs.criteriaTaken)||((this.criteriaTaken!= null)&&this.criteriaTaken.equals(rhs.criteriaTaken))))&&((this.criteriaHrsBanked == rhs.criteriaHrsBanked)||((this.criteriaHrsBanked!= null)&&this.criteriaHrsBanked.equals(rhs.criteriaHrsBanked))))&&((this.hrsBanked == rhs.hrsBanked)||((this.hrsBanked!= null)&&this.hrsBanked.equals(rhs.hrsBanked))))&&((this.beginBalance == rhs.beginBalance)||((this.beginBalance!= null)&&this.beginBalance.equals(rhs.beginBalance))))&&((this.perleavLeavCode == rhs.perleavLeavCode)||((this.perleavLeavCode!= null)&&this.perleavLeavCode.equals(rhs.perleavLeavCode))))&&((this.criteriaHrsBankedDay == rhs.criteriaHrsBankedDay)||((this.criteriaHrsBankedDay!= null)&&this.criteriaHrsBankedDay.equals(rhs.criteriaHrsBankedDay))))&&((this.criteriaAccruedDay == rhs.criteriaAccruedDay)||((this.criteriaAccruedDay!= null)&&this.criteriaAccruedDay.equals(rhs.criteriaAccruedDay))))&&((this.criteriaTotalBalanceDay == rhs.criteriaTotalBalanceDay)||((this.criteriaTotalBalanceDay!= null)&&this.criteriaTotalBalanceDay.equals(rhs.criteriaTotalBalanceDay))))&&((this.accrued == rhs.accrued)||((this.accrued!= null)&&this.accrued.equals(rhs.accrued))))&&((this.taken == rhs.taken)||((this.taken!= null)&&this.taken.equals(rhs.taken))))&&((this.criteriaBeginBalance == rhs.criteriaBeginBalance)||((this.criteriaBeginBalance!= null)&&this.criteriaBeginBalance.equals(rhs.criteriaBeginBalance))))&&((this.criteriaLeavCode == rhs.criteriaLeavCode)||((this.criteriaLeavCode!= null)&&this.criteriaLeavCode.equals(rhs.criteriaLeavCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTakenDay == rhs.criteriaTakenDay)||((this.criteriaTakenDay!= null)&&this.criteriaTakenDay.equals(rhs.criteriaTakenDay))))&&((this.criteriaAccrued == rhs.criteriaAccrued)||((this.criteriaAccrued!= null)&&this.criteriaAccrued.equals(rhs.criteriaAccrued))));
    }

}
