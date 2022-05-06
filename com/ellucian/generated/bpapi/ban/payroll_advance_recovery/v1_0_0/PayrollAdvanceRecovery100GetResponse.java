
package com.ellucian.generated.bpapi.ban.payroll_advance_recovery.v1_0_0;

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
    "activityDate",
    "suff",
    "advanceBalance",
    "advanceActiveInd",
    "advanceAmt",
    "userId",
    "posn"
})
@Generated("jsonschema2pojo")
public class PayrollAdvanceRecovery100GetResponse {

    /**
     * Lineage reference object : PERPADV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PERPADV_SUFF")
    private String suff;
    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_BALANCE")
    private Double advanceBalance;
    /**
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND")
    private String advanceActiveInd;
    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_AMT")
    private Double advanceAmt;
    /**
     * Lineage reference object : PERPADV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PERPADV_USER_ID")
    private String userId;
    /**
     * Position
     * <p>
     * Lineage reference object : PERPADV_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PERPADV_POSN")
    private String posn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PERPADV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PERPADV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PayrollAdvanceRecovery100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public PayrollAdvanceRecovery100GetResponse withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    public Double getAdvanceBalance() {
        return advanceBalance;
    }

    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    public void setAdvanceBalance(Double advanceBalance) {
        this.advanceBalance = advanceBalance;
    }

    public PayrollAdvanceRecovery100GetResponse withAdvanceBalance(Double advanceBalance) {
        this.advanceBalance = advanceBalance;
        return this;
    }

    /**
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    public String getAdvanceActiveInd() {
        return advanceActiveInd;
    }

    /**
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    public void setAdvanceActiveInd(String advanceActiveInd) {
        this.advanceActiveInd = advanceActiveInd;
    }

    public PayrollAdvanceRecovery100GetResponse withAdvanceActiveInd(String advanceActiveInd) {
        this.advanceActiveInd = advanceActiveInd;
        return this;
    }

    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    public Double getAdvanceAmt() {
        return advanceAmt;
    }

    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    public void setAdvanceAmt(Double advanceAmt) {
        this.advanceAmt = advanceAmt;
    }

    public PayrollAdvanceRecovery100GetResponse withAdvanceAmt(Double advanceAmt) {
        this.advanceAmt = advanceAmt;
        return this;
    }

    /**
     * Lineage reference object : PERPADV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PERPADV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PayrollAdvanceRecovery100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PERPADV_POSN
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
     * Lineage reference object : PERPADV_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PayrollAdvanceRecovery100GetResponse withPosn(String posn) {
        this.posn = posn;
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

    public PayrollAdvanceRecovery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollAdvanceRecovery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("advanceBalance");
        sb.append('=');
        sb.append(((this.advanceBalance == null)?"<null>":this.advanceBalance));
        sb.append(',');
        sb.append("advanceActiveInd");
        sb.append('=');
        sb.append(((this.advanceActiveInd == null)?"<null>":this.advanceActiveInd));
        sb.append(',');
        sb.append("advanceAmt");
        sb.append('=');
        sb.append(((this.advanceAmt == null)?"<null>":this.advanceAmt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.advanceBalance == null)? 0 :this.advanceBalance.hashCode()));
        result = ((result* 31)+((this.advanceActiveInd == null)? 0 :this.advanceActiveInd.hashCode()));
        result = ((result* 31)+((this.advanceAmt == null)? 0 :this.advanceAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollAdvanceRecovery100GetResponse) == false) {
            return false;
        }
        PayrollAdvanceRecovery100GetResponse rhs = ((PayrollAdvanceRecovery100GetResponse) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.advanceBalance == rhs.advanceBalance)||((this.advanceBalance!= null)&&this.advanceBalance.equals(rhs.advanceBalance))))&&((this.advanceActiveInd == rhs.advanceActiveInd)||((this.advanceActiveInd!= null)&&this.advanceActiveInd.equals(rhs.advanceActiveInd))))&&((this.advanceAmt == rhs.advanceAmt)||((this.advanceAmt!= null)&&this.advanceAmt.equals(rhs.advanceAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))));
    }

}
