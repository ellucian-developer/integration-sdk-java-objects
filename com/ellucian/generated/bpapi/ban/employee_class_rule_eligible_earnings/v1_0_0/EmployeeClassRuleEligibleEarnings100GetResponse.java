
package com.ellucian.generated.bpapi.ban.employee_class_rule_eligible_earnings.v1_0_0;

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
    "earnDesc",
    "activityDate",
    "reduceRegPayInd",
    "clockInOutInd",
    "tsEntrySeq",
    "accrueSeniorityInd",
    "tsPrintSeq",
    "earnCode",
    "eaApproversInd",
    "atndInd"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRuleEligibleEarnings100GetResponse {

    @JsonProperty("earnDesc")
    private String earnDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREERN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREERN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : PTREERN_REDUCE_REG_PAY_IND
     * 
     */
    @JsonProperty("reduceRegPayInd")
    @JsonPropertyDescription("Lineage reference object : PTREERN_REDUCE_REG_PAY_IND")
    private String reduceRegPayInd;
    /**
     * Lineage reference object : PTREERN_CLOCK_IN_OUT_IND
     * 
     */
    @JsonProperty("clockInOutInd")
    @JsonPropertyDescription("Lineage reference object : PTREERN_CLOCK_IN_OUT_IND")
    private String clockInOutInd;
    /**
     * Time Entry Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_ENTRY_SEQ
     * 
     */
    @JsonProperty("tsEntrySeq")
    @JsonPropertyDescription("Lineage reference object : PTREERN_TS_ENTRY_SEQ")
    private Double tsEntrySeq;
    /**
     * Lineage reference object : PTREERN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    @JsonPropertyDescription("Lineage reference object : PTREERN_ACCRUE_SENIORITY_IND")
    private String accrueSeniorityInd;
    /**
     * Time Sheet Print Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_PRINT_SEQ
     * 
     */
    @JsonProperty("tsPrintSeq")
    @JsonPropertyDescription("Lineage reference object : PTREERN_TS_PRINT_SEQ")
    private Double tsPrintSeq;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PTREERN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : PTREERN_EARN_CODE")
    private String earnCode;
    /**
     * Lineage reference object : PTREERN_EA_APPROVERS_IND
     * 
     */
    @JsonProperty("eaApproversInd")
    @JsonPropertyDescription("Lineage reference object : PTREERN_EA_APPROVERS_IND")
    private String eaApproversInd;
    /**
     * Lineage reference object : PTREERN_ATND_IND
     * 
     */
    @JsonProperty("atndInd")
    @JsonPropertyDescription("Lineage reference object : PTREERN_ATND_IND")
    private String atndInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("earnDesc")
    public String getEarnDesc() {
        return earnDesc;
    }

    @JsonProperty("earnDesc")
    public void setEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withEarnDesc(String earnDesc) {
        this.earnDesc = earnDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREERN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREERN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : PTREERN_REDUCE_REG_PAY_IND
     * 
     */
    @JsonProperty("reduceRegPayInd")
    public String getReduceRegPayInd() {
        return reduceRegPayInd;
    }

    /**
     * Lineage reference object : PTREERN_REDUCE_REG_PAY_IND
     * 
     */
    @JsonProperty("reduceRegPayInd")
    public void setReduceRegPayInd(String reduceRegPayInd) {
        this.reduceRegPayInd = reduceRegPayInd;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withReduceRegPayInd(String reduceRegPayInd) {
        this.reduceRegPayInd = reduceRegPayInd;
        return this;
    }

    /**
     * Lineage reference object : PTREERN_CLOCK_IN_OUT_IND
     * 
     */
    @JsonProperty("clockInOutInd")
    public String getClockInOutInd() {
        return clockInOutInd;
    }

    /**
     * Lineage reference object : PTREERN_CLOCK_IN_OUT_IND
     * 
     */
    @JsonProperty("clockInOutInd")
    public void setClockInOutInd(String clockInOutInd) {
        this.clockInOutInd = clockInOutInd;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withClockInOutInd(String clockInOutInd) {
        this.clockInOutInd = clockInOutInd;
        return this;
    }

    /**
     * Time Entry Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_ENTRY_SEQ
     * 
     */
    @JsonProperty("tsEntrySeq")
    public Double getTsEntrySeq() {
        return tsEntrySeq;
    }

    /**
     * Time Entry Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_ENTRY_SEQ
     * 
     */
    @JsonProperty("tsEntrySeq")
    public void setTsEntrySeq(Double tsEntrySeq) {
        this.tsEntrySeq = tsEntrySeq;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withTsEntrySeq(Double tsEntrySeq) {
        this.tsEntrySeq = tsEntrySeq;
        return this;
    }

    /**
     * Lineage reference object : PTREERN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public String getAccrueSeniorityInd() {
        return accrueSeniorityInd;
    }

    /**
     * Lineage reference object : PTREERN_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public void setAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
        return this;
    }

    /**
     * Time Sheet Print Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_PRINT_SEQ
     * 
     */
    @JsonProperty("tsPrintSeq")
    public Double getTsPrintSeq() {
        return tsPrintSeq;
    }

    /**
     * Time Sheet Print Sequence
     * <p>
     * Lineage reference object : PTREERN_TS_PRINT_SEQ
     * 
     */
    @JsonProperty("tsPrintSeq")
    public void setTsPrintSeq(Double tsPrintSeq) {
        this.tsPrintSeq = tsPrintSeq;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withTsPrintSeq(Double tsPrintSeq) {
        this.tsPrintSeq = tsPrintSeq;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PTREERN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public String getEarnCode() {
        return earnCode;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PTREERN_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * Lineage reference object : PTREERN_EA_APPROVERS_IND
     * 
     */
    @JsonProperty("eaApproversInd")
    public String getEaApproversInd() {
        return eaApproversInd;
    }

    /**
     * Lineage reference object : PTREERN_EA_APPROVERS_IND
     * 
     */
    @JsonProperty("eaApproversInd")
    public void setEaApproversInd(String eaApproversInd) {
        this.eaApproversInd = eaApproversInd;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withEaApproversInd(String eaApproversInd) {
        this.eaApproversInd = eaApproversInd;
        return this;
    }

    /**
     * Lineage reference object : PTREERN_ATND_IND
     * 
     */
    @JsonProperty("atndInd")
    public String getAtndInd() {
        return atndInd;
    }

    /**
     * Lineage reference object : PTREERN_ATND_IND
     * 
     */
    @JsonProperty("atndInd")
    public void setAtndInd(String atndInd) {
        this.atndInd = atndInd;
    }

    public EmployeeClassRuleEligibleEarnings100GetResponse withAtndInd(String atndInd) {
        this.atndInd = atndInd;
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

    public EmployeeClassRuleEligibleEarnings100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRuleEligibleEarnings100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("earnDesc");
        sb.append('=');
        sb.append(((this.earnDesc == null)?"<null>":this.earnDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("reduceRegPayInd");
        sb.append('=');
        sb.append(((this.reduceRegPayInd == null)?"<null>":this.reduceRegPayInd));
        sb.append(',');
        sb.append("clockInOutInd");
        sb.append('=');
        sb.append(((this.clockInOutInd == null)?"<null>":this.clockInOutInd));
        sb.append(',');
        sb.append("tsEntrySeq");
        sb.append('=');
        sb.append(((this.tsEntrySeq == null)?"<null>":this.tsEntrySeq));
        sb.append(',');
        sb.append("accrueSeniorityInd");
        sb.append('=');
        sb.append(((this.accrueSeniorityInd == null)?"<null>":this.accrueSeniorityInd));
        sb.append(',');
        sb.append("tsPrintSeq");
        sb.append('=');
        sb.append(((this.tsPrintSeq == null)?"<null>":this.tsPrintSeq));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("eaApproversInd");
        sb.append('=');
        sb.append(((this.eaApproversInd == null)?"<null>":this.eaApproversInd));
        sb.append(',');
        sb.append("atndInd");
        sb.append('=');
        sb.append(((this.atndInd == null)?"<null>":this.atndInd));
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
        result = ((result* 31)+((this.earnDesc == null)? 0 :this.earnDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.reduceRegPayInd == null)? 0 :this.reduceRegPayInd.hashCode()));
        result = ((result* 31)+((this.clockInOutInd == null)? 0 :this.clockInOutInd.hashCode()));
        result = ((result* 31)+((this.tsEntrySeq == null)? 0 :this.tsEntrySeq.hashCode()));
        result = ((result* 31)+((this.accrueSeniorityInd == null)? 0 :this.accrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.tsPrintSeq == null)? 0 :this.tsPrintSeq.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.eaApproversInd == null)? 0 :this.eaApproversInd.hashCode()));
        result = ((result* 31)+((this.atndInd == null)? 0 :this.atndInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRuleEligibleEarnings100GetResponse) == false) {
            return false;
        }
        EmployeeClassRuleEligibleEarnings100GetResponse rhs = ((EmployeeClassRuleEligibleEarnings100GetResponse) other);
        return ((((((((((((this.earnDesc == rhs.earnDesc)||((this.earnDesc!= null)&&this.earnDesc.equals(rhs.earnDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.reduceRegPayInd == rhs.reduceRegPayInd)||((this.reduceRegPayInd!= null)&&this.reduceRegPayInd.equals(rhs.reduceRegPayInd))))&&((this.clockInOutInd == rhs.clockInOutInd)||((this.clockInOutInd!= null)&&this.clockInOutInd.equals(rhs.clockInOutInd))))&&((this.tsEntrySeq == rhs.tsEntrySeq)||((this.tsEntrySeq!= null)&&this.tsEntrySeq.equals(rhs.tsEntrySeq))))&&((this.accrueSeniorityInd == rhs.accrueSeniorityInd)||((this.accrueSeniorityInd!= null)&&this.accrueSeniorityInd.equals(rhs.accrueSeniorityInd))))&&((this.tsPrintSeq == rhs.tsPrintSeq)||((this.tsPrintSeq!= null)&&this.tsPrintSeq.equals(rhs.tsPrintSeq))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.eaApproversInd == rhs.eaApproversInd)||((this.eaApproversInd!= null)&&this.eaApproversInd.equals(rhs.eaApproversInd))))&&((this.atndInd == rhs.atndInd)||((this.atndInd!= null)&&this.atndInd.equals(rhs.atndInd))));
    }

}
