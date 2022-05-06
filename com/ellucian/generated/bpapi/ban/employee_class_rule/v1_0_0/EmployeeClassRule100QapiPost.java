
package com.ellucian.generated.bpapi.ban.employee_class_rule.v1_0_0;

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
    "eclsCode",
    "desc",
    "budgetRollInd",
    "pictCode",
    "hoursPerDay",
    "wkshCode",
    "hoursPerPay",
    "contractInd",
    "paysPerYear",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRule100QapiPost {

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls")
    private String eclsCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_DESC")
    private String desc;
    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * 
     */
    @JsonProperty("budgetRollInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_BUDGET_ROLL_IND")
    private String budgetRollInd;
    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PICT_CODE")
    private String pictCode;
    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * 
     */
    @JsonProperty("hoursPerDay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_DAY")
    private Double hoursPerDay;
    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh")
    private String wkshCode;
    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * 
     */
    @JsonProperty("hoursPerPay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_PAY")
    private Double hoursPerPay;
    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * 
     */
    @JsonProperty("contractInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_CONTRACT_IND")
    private String contractInd;
    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * 
     */
    @JsonProperty("paysPerYear")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PAYS_PER_YEAR")
    private Double paysPerYear;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * 
     */
    @JsonProperty("eclsCode")
    public String getEclsCode() {
        return eclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public EmployeeClassRule100QapiPost withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeClassRule100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * 
     */
    @JsonProperty("budgetRollInd")
    public String getBudgetRollInd() {
        return budgetRollInd;
    }

    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * 
     */
    @JsonProperty("budgetRollInd")
    public void setBudgetRollInd(String budgetRollInd) {
        this.budgetRollInd = budgetRollInd;
    }

    public EmployeeClassRule100QapiPost withBudgetRollInd(String budgetRollInd) {
        this.budgetRollInd = budgetRollInd;
        return this;
    }

    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public EmployeeClassRule100QapiPost withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * 
     */
    @JsonProperty("hoursPerDay")
    public Double getHoursPerDay() {
        return hoursPerDay;
    }

    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * 
     */
    @JsonProperty("hoursPerDay")
    public void setHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public EmployeeClassRule100QapiPost withHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        return this;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    public String getWkshCode() {
        return wkshCode;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    public void setWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
    }

    public EmployeeClassRule100QapiPost withWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
        return this;
    }

    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * 
     */
    @JsonProperty("hoursPerPay")
    public Double getHoursPerPay() {
        return hoursPerPay;
    }

    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * 
     */
    @JsonProperty("hoursPerPay")
    public void setHoursPerPay(Double hoursPerPay) {
        this.hoursPerPay = hoursPerPay;
    }

    public EmployeeClassRule100QapiPost withHoursPerPay(Double hoursPerPay) {
        this.hoursPerPay = hoursPerPay;
        return this;
    }

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * 
     */
    @JsonProperty("contractInd")
    public String getContractInd() {
        return contractInd;
    }

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * 
     */
    @JsonProperty("contractInd")
    public void setContractInd(String contractInd) {
        this.contractInd = contractInd;
    }

    public EmployeeClassRule100QapiPost withContractInd(String contractInd) {
        this.contractInd = contractInd;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * 
     */
    @JsonProperty("paysPerYear")
    public Double getPaysPerYear() {
        return paysPerYear;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * 
     */
    @JsonProperty("paysPerYear")
    public void setPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
    }

    public EmployeeClassRule100QapiPost withPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeClassRule100QapiPost withActivityDate(Date activityDate) {
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

    public EmployeeClassRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("budgetRollInd");
        sb.append('=');
        sb.append(((this.budgetRollInd == null)?"<null>":this.budgetRollInd));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("hoursPerDay");
        sb.append('=');
        sb.append(((this.hoursPerDay == null)?"<null>":this.hoursPerDay));
        sb.append(',');
        sb.append("wkshCode");
        sb.append('=');
        sb.append(((this.wkshCode == null)?"<null>":this.wkshCode));
        sb.append(',');
        sb.append("hoursPerPay");
        sb.append('=');
        sb.append(((this.hoursPerPay == null)?"<null>":this.hoursPerPay));
        sb.append(',');
        sb.append("contractInd");
        sb.append('=');
        sb.append(((this.contractInd == null)?"<null>":this.contractInd));
        sb.append(',');
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
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
        result = ((result* 31)+((this.paysPerYear == null)? 0 :this.paysPerYear.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.contractInd == null)? 0 :this.contractInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.hoursPerPay == null)? 0 :this.hoursPerPay.hashCode()));
        result = ((result* 31)+((this.wkshCode == null)? 0 :this.wkshCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.budgetRollInd == null)? 0 :this.budgetRollInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.hoursPerDay == null)? 0 :this.hoursPerDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRule100QapiPost) == false) {
            return false;
        }
        EmployeeClassRule100QapiPost rhs = ((EmployeeClassRule100QapiPost) other);
        return ((((((((((((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear)))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.contractInd == rhs.contractInd)||((this.contractInd!= null)&&this.contractInd.equals(rhs.contractInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.hoursPerPay == rhs.hoursPerPay)||((this.hoursPerPay!= null)&&this.hoursPerPay.equals(rhs.hoursPerPay))))&&((this.wkshCode == rhs.wkshCode)||((this.wkshCode!= null)&&this.wkshCode.equals(rhs.wkshCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.budgetRollInd == rhs.budgetRollInd)||((this.budgetRollInd!= null)&&this.budgetRollInd.equals(rhs.budgetRollInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.hoursPerDay == rhs.hoursPerDay)||((this.hoursPerDay!= null)&&this.hoursPerDay.equals(rhs.hoursPerDay))));
    }

}
