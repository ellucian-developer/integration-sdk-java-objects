
package com.ellucian.generated.bpapi.ban.flexible_spending_accounts_rule.v1_0_0;

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
    "bdcaCode",
    "planCode",
    "availInd",
    "dednFreq",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class FlexibleSpendingAccountsRule100QapiPost {

    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_BDCA_CODE")
    private String bdcaCode;
    /**
     * Plan
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_PLAN_CODE")
    private String planCode;
    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_AVAIL_IND")
    private String availInd;
    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * 
     */
    @JsonProperty("dednFreq")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_DEDN_FREQ")
    private Double dednFreq;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFBEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public FlexibleSpendingAccountsRule100QapiPost withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public FlexibleSpendingAccountsRule100QapiPost withPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    public String getAvailInd() {
        return availInd;
    }

    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    public void setAvailInd(String availInd) {
        this.availInd = availInd;
    }

    public FlexibleSpendingAccountsRule100QapiPost withAvailInd(String availInd) {
        this.availInd = availInd;
        return this;
    }

    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * 
     */
    @JsonProperty("dednFreq")
    public Double getDednFreq() {
        return dednFreq;
    }

    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * 
     */
    @JsonProperty("dednFreq")
    public void setDednFreq(Double dednFreq) {
        this.dednFreq = dednFreq;
    }

    public FlexibleSpendingAccountsRule100QapiPost withDednFreq(Double dednFreq) {
        this.dednFreq = dednFreq;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFBEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRFBEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FlexibleSpendingAccountsRule100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public FlexibleSpendingAccountsRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexibleSpendingAccountsRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("planCode");
        sb.append('=');
        sb.append(((this.planCode == null)?"<null>":this.planCode));
        sb.append(',');
        sb.append("availInd");
        sb.append('=');
        sb.append(((this.availInd == null)?"<null>":this.availInd));
        sb.append(',');
        sb.append("dednFreq");
        sb.append('=');
        sb.append(((this.dednFreq == null)?"<null>":this.dednFreq));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.availInd == null)? 0 :this.availInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dednFreq == null)? 0 :this.dednFreq.hashCode()));
        result = ((result* 31)+((this.planCode == null)? 0 :this.planCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleSpendingAccountsRule100QapiPost) == false) {
            return false;
        }
        FlexibleSpendingAccountsRule100QapiPost rhs = ((FlexibleSpendingAccountsRule100QapiPost) other);
        return (((((((this.availInd == rhs.availInd)||((this.availInd!= null)&&this.availInd.equals(rhs.availInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dednFreq == rhs.dednFreq)||((this.dednFreq!= null)&&this.dednFreq.equals(rhs.dednFreq))))&&((this.planCode == rhs.planCode)||((this.planCode!= null)&&this.planCode.equals(rhs.planCode))));
    }

}
