
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
    "id",
    "leavCode",
    "dateAvail",
    "beginBalance",
    "beginBalanceDay",
    "accrued",
    "accruedDay",
    "taken",
    "takenDay",
    "totalBalanceDay",
    "hrsBanked",
    "hrsBankedDay"
})
@Generated("jsonschema2pojo")
public class EmployeeLeaveBalances100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
     * 
     */
    @JsonProperty("leavCode")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav")
    private String leavCode;
    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
     * 
     */
    @JsonProperty("dateAvail")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_DATE_AVAIL")
    private Date dateAvail;
    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
     * 
     */
    @JsonProperty("beginBalance")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_BEGIN_BALANCE")
    private Double beginBalance;
    @JsonProperty("beginBalanceDay")
    private String beginBalanceDay;
    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * 
     */
    @JsonProperty("accrued")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_ACCRUED")
    private Double accrued;
    @JsonProperty("accruedDay")
    private String accruedDay;
    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
     * 
     */
    @JsonProperty("taken")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_TAKEN")
    private Double taken;
    @JsonProperty("takenDay")
    private String takenDay;
    @JsonProperty("totalBalanceDay")
    private String totalBalanceDay;
    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
     * 
     */
    @JsonProperty("hrsBanked")
    @JsonPropertyDescription("Lineage reference object : PERLEAV_HRS_BANKED")
    private Double hrsBanked;
    @JsonProperty("hrsBankedDay")
    private String hrsBankedDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeLeaveBalances100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PERLEAV_LEAV_CODE, Lookup lineage reference object : ptrlvas,ptrleav
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
     * 
     */
    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public EmployeeLeaveBalances100QapiPost withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    /**
     * Date Available
     * <p>
     * Lineage reference object : PERLEAV_DATE_AVAIL
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
     * 
     */
    @JsonProperty("dateAvail")
    public void setDateAvail(Date dateAvail) {
        this.dateAvail = dateAvail;
    }

    public EmployeeLeaveBalances100QapiPost withDateAvail(Date dateAvail) {
        this.dateAvail = dateAvail;
        return this;
    }

    /**
     * Begin Balance
     * <p>
     * Lineage reference object : PERLEAV_BEGIN_BALANCE
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
     * 
     */
    @JsonProperty("beginBalance")
    public void setBeginBalance(Double beginBalance) {
        this.beginBalance = beginBalance;
    }

    public EmployeeLeaveBalances100QapiPost withBeginBalance(Double beginBalance) {
        this.beginBalance = beginBalance;
        return this;
    }

    @JsonProperty("beginBalanceDay")
    public String getBeginBalanceDay() {
        return beginBalanceDay;
    }

    @JsonProperty("beginBalanceDay")
    public void setBeginBalanceDay(String beginBalanceDay) {
        this.beginBalanceDay = beginBalanceDay;
    }

    public EmployeeLeaveBalances100QapiPost withBeginBalanceDay(String beginBalanceDay) {
        this.beginBalanceDay = beginBalanceDay;
        return this;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * 
     */
    @JsonProperty("accrued")
    public Double getAccrued() {
        return accrued;
    }

    /**
     * Lineage reference object : PERLEAV_ACCRUED
     * 
     */
    @JsonProperty("accrued")
    public void setAccrued(Double accrued) {
        this.accrued = accrued;
    }

    public EmployeeLeaveBalances100QapiPost withAccrued(Double accrued) {
        this.accrued = accrued;
        return this;
    }

    @JsonProperty("accruedDay")
    public String getAccruedDay() {
        return accruedDay;
    }

    @JsonProperty("accruedDay")
    public void setAccruedDay(String accruedDay) {
        this.accruedDay = accruedDay;
    }

    public EmployeeLeaveBalances100QapiPost withAccruedDay(String accruedDay) {
        this.accruedDay = accruedDay;
        return this;
    }

    /**
     * Taken
     * <p>
     * Lineage reference object : PERLEAV_TAKEN
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
     * 
     */
    @JsonProperty("taken")
    public void setTaken(Double taken) {
        this.taken = taken;
    }

    public EmployeeLeaveBalances100QapiPost withTaken(Double taken) {
        this.taken = taken;
        return this;
    }

    @JsonProperty("takenDay")
    public String getTakenDay() {
        return takenDay;
    }

    @JsonProperty("takenDay")
    public void setTakenDay(String takenDay) {
        this.takenDay = takenDay;
    }

    public EmployeeLeaveBalances100QapiPost withTakenDay(String takenDay) {
        this.takenDay = takenDay;
        return this;
    }

    @JsonProperty("totalBalanceDay")
    public String getTotalBalanceDay() {
        return totalBalanceDay;
    }

    @JsonProperty("totalBalanceDay")
    public void setTotalBalanceDay(String totalBalanceDay) {
        this.totalBalanceDay = totalBalanceDay;
    }

    public EmployeeLeaveBalances100QapiPost withTotalBalanceDay(String totalBalanceDay) {
        this.totalBalanceDay = totalBalanceDay;
        return this;
    }

    /**
     * Banked
     * <p>
     * Lineage reference object : PERLEAV_HRS_BANKED
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
     * 
     */
    @JsonProperty("hrsBanked")
    public void setHrsBanked(Double hrsBanked) {
        this.hrsBanked = hrsBanked;
    }

    public EmployeeLeaveBalances100QapiPost withHrsBanked(Double hrsBanked) {
        this.hrsBanked = hrsBanked;
        return this;
    }

    @JsonProperty("hrsBankedDay")
    public String getHrsBankedDay() {
        return hrsBankedDay;
    }

    @JsonProperty("hrsBankedDay")
    public void setHrsBankedDay(String hrsBankedDay) {
        this.hrsBankedDay = hrsBankedDay;
    }

    public EmployeeLeaveBalances100QapiPost withHrsBankedDay(String hrsBankedDay) {
        this.hrsBankedDay = hrsBankedDay;
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

    public EmployeeLeaveBalances100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeLeaveBalances100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("dateAvail");
        sb.append('=');
        sb.append(((this.dateAvail == null)?"<null>":this.dateAvail));
        sb.append(',');
        sb.append("beginBalance");
        sb.append('=');
        sb.append(((this.beginBalance == null)?"<null>":this.beginBalance));
        sb.append(',');
        sb.append("beginBalanceDay");
        sb.append('=');
        sb.append(((this.beginBalanceDay == null)?"<null>":this.beginBalanceDay));
        sb.append(',');
        sb.append("accrued");
        sb.append('=');
        sb.append(((this.accrued == null)?"<null>":this.accrued));
        sb.append(',');
        sb.append("accruedDay");
        sb.append('=');
        sb.append(((this.accruedDay == null)?"<null>":this.accruedDay));
        sb.append(',');
        sb.append("taken");
        sb.append('=');
        sb.append(((this.taken == null)?"<null>":this.taken));
        sb.append(',');
        sb.append("takenDay");
        sb.append('=');
        sb.append(((this.takenDay == null)?"<null>":this.takenDay));
        sb.append(',');
        sb.append("totalBalanceDay");
        sb.append('=');
        sb.append(((this.totalBalanceDay == null)?"<null>":this.totalBalanceDay));
        sb.append(',');
        sb.append("hrsBanked");
        sb.append('=');
        sb.append(((this.hrsBanked == null)?"<null>":this.hrsBanked));
        sb.append(',');
        sb.append("hrsBankedDay");
        sb.append('=');
        sb.append(((this.hrsBankedDay == null)?"<null>":this.hrsBankedDay));
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
        result = ((result* 31)+((this.hrsBankedDay == null)? 0 :this.hrsBankedDay.hashCode()));
        result = ((result* 31)+((this.beginBalanceDay == null)? 0 :this.beginBalanceDay.hashCode()));
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.dateAvail == null)? 0 :this.dateAvail.hashCode()));
        result = ((result* 31)+((this.takenDay == null)? 0 :this.takenDay.hashCode()));
        result = ((result* 31)+((this.hrsBanked == null)? 0 :this.hrsBanked.hashCode()));
        result = ((result* 31)+((this.beginBalance == null)? 0 :this.beginBalance.hashCode()));
        result = ((result* 31)+((this.accruedDay == null)? 0 :this.accruedDay.hashCode()));
        result = ((result* 31)+((this.totalBalanceDay == null)? 0 :this.totalBalanceDay.hashCode()));
        result = ((result* 31)+((this.accrued == null)? 0 :this.accrued.hashCode()));
        result = ((result* 31)+((this.taken == null)? 0 :this.taken.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeLeaveBalances100QapiPost) == false) {
            return false;
        }
        EmployeeLeaveBalances100QapiPost rhs = ((EmployeeLeaveBalances100QapiPost) other);
        return ((((((((((((((this.hrsBankedDay == rhs.hrsBankedDay)||((this.hrsBankedDay!= null)&&this.hrsBankedDay.equals(rhs.hrsBankedDay)))&&((this.beginBalanceDay == rhs.beginBalanceDay)||((this.beginBalanceDay!= null)&&this.beginBalanceDay.equals(rhs.beginBalanceDay))))&&((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode))))&&((this.dateAvail == rhs.dateAvail)||((this.dateAvail!= null)&&this.dateAvail.equals(rhs.dateAvail))))&&((this.takenDay == rhs.takenDay)||((this.takenDay!= null)&&this.takenDay.equals(rhs.takenDay))))&&((this.hrsBanked == rhs.hrsBanked)||((this.hrsBanked!= null)&&this.hrsBanked.equals(rhs.hrsBanked))))&&((this.beginBalance == rhs.beginBalance)||((this.beginBalance!= null)&&this.beginBalance.equals(rhs.beginBalance))))&&((this.accruedDay == rhs.accruedDay)||((this.accruedDay!= null)&&this.accruedDay.equals(rhs.accruedDay))))&&((this.totalBalanceDay == rhs.totalBalanceDay)||((this.totalBalanceDay!= null)&&this.totalBalanceDay.equals(rhs.totalBalanceDay))))&&((this.accrued == rhs.accrued)||((this.accrued!= null)&&this.accrued.equals(rhs.accrued))))&&((this.taken == rhs.taken)||((this.taken!= null)&&this.taken.equals(rhs.taken))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
