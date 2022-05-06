
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
    "criteria.contractInd",
    "criteria.activityDate",
    "contractInd",
    "criteria.pictCode",
    "wkshCode",
    "criteria.paysPerYear",
    "criteria.desc",
    "eclsCode",
    "budgetRollInd",
    "criteria.hoursPerDay",
    "hoursPerDay",
    "criteria.budgetRollInd",
    "paysPerYear",
    "pictCode",
    "hoursPerPay",
    "criteria.hoursPerPay",
    "criteria.eclsCode",
    "criteria.wkshCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRule100PutRequest {

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_CONTRACT_IND")
    private String criteriaContractInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * (Required)
     * 
     */
    @JsonProperty("contractInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_CONTRACT_IND")
    private String contractInd;
    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pictCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PICT_CODE")
    private String criteriaPictCode;
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
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.paysPerYear")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PAYS_PER_YEAR")
    private Double criteriaPaysPerYear;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_DESC")
    private String criteriaDesc;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls")
    private String eclsCode;
    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("budgetRollInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_BUDGET_ROLL_IND")
    private String budgetRollInd;
    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerDay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_DAY")
    private Double criteriaHoursPerDay;
    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * (Required)
     * 
     */
    @JsonProperty("hoursPerDay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_DAY")
    private Double hoursPerDay;
    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetRollInd")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_BUDGET_ROLL_IND")
    private String criteriaBudgetRollInd;
    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("paysPerYear")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PAYS_PER_YEAR")
    private Double paysPerYear;
    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_PICT_CODE")
    private String pictCode;
    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * (Required)
     * 
     */
    @JsonProperty("hoursPerPay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_PAY")
    private Double hoursPerPay;
    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerPay")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_HOURS_PER_PAY")
    private Double criteriaHoursPerPay;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls")
    private String criteriaEclsCode;
    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh")
    private String criteriaWkshCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractInd")
    public String getCriteriaContractInd() {
        return criteriaContractInd;
    }

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractInd")
    public void setCriteriaContractInd(String criteriaContractInd) {
        this.criteriaContractInd = criteriaContractInd;
    }

    public EmployeeClassRule100PutRequest withCriteriaContractInd(String criteriaContractInd) {
        this.criteriaContractInd = criteriaContractInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVECLS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public EmployeeClassRule100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Contract Indicator
     * <p>
     * Lineage reference object : FTVECLS_CONTRACT_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("contractInd")
    public void setContractInd(String contractInd) {
        this.contractInd = contractInd;
    }

    public EmployeeClassRule100PutRequest withContractInd(String contractInd) {
        this.contractInd = contractInd;
        return this;
    }

    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pictCode")
    public String getCriteriaPictCode() {
        return criteriaPictCode;
    }

    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.pictCode")
    public void setCriteriaPictCode(String criteriaPictCode) {
        this.criteriaPictCode = criteriaPictCode;
    }

    public EmployeeClassRule100PutRequest withCriteriaPictCode(String criteriaPictCode) {
        this.criteriaPictCode = criteriaPictCode;
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

    public EmployeeClassRule100PutRequest withWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.paysPerYear")
    public Double getCriteriaPaysPerYear() {
        return criteriaPaysPerYear;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.paysPerYear")
    public void setCriteriaPaysPerYear(Double criteriaPaysPerYear) {
        this.criteriaPaysPerYear = criteriaPaysPerYear;
    }

    public EmployeeClassRule100PutRequest withCriteriaPaysPerYear(Double criteriaPaysPerYear) {
        this.criteriaPaysPerYear = criteriaPaysPerYear;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public EmployeeClassRule100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public EmployeeClassRule100PutRequest withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("budgetRollInd")
    public void setBudgetRollInd(String budgetRollInd) {
        this.budgetRollInd = budgetRollInd;
    }

    public EmployeeClassRule100PutRequest withBudgetRollInd(String budgetRollInd) {
        this.budgetRollInd = budgetRollInd;
        return this;
    }

    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerDay")
    public Double getCriteriaHoursPerDay() {
        return criteriaHoursPerDay;
    }

    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerDay")
    public void setCriteriaHoursPerDay(Double criteriaHoursPerDay) {
        this.criteriaHoursPerDay = criteriaHoursPerDay;
    }

    public EmployeeClassRule100PutRequest withCriteriaHoursPerDay(Double criteriaHoursPerDay) {
        this.criteriaHoursPerDay = criteriaHoursPerDay;
        return this;
    }

    /**
     * Hours Per Day
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_DAY
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("hoursPerDay")
    public void setHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public EmployeeClassRule100PutRequest withHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        return this;
    }

    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetRollInd")
    public String getCriteriaBudgetRollInd() {
        return criteriaBudgetRollInd;
    }

    /**
     * Budget Roll Indicator
     * <p>
     * Lineage reference object : FTVECLS_BUDGET_ROLL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetRollInd")
    public void setCriteriaBudgetRollInd(String criteriaBudgetRollInd) {
        this.criteriaBudgetRollInd = criteriaBudgetRollInd;
    }

    public EmployeeClassRule100PutRequest withCriteriaBudgetRollInd(String criteriaBudgetRollInd) {
        this.criteriaBudgetRollInd = criteriaBudgetRollInd;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * Lineage reference object : FTVECLS_PAYS_PER_YEAR
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("paysPerYear")
    public void setPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
    }

    public EmployeeClassRule100PutRequest withPaysPerYear(Double paysPerYear) {
        this.paysPerYear = paysPerYear;
        return this;
    }

    /**
     * Pay ID Code
     * <p>
     * Lineage reference object : FTVECLS_PICT_CODE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public EmployeeClassRule100PutRequest withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("hoursPerPay")
    public void setHoursPerPay(Double hoursPerPay) {
        this.hoursPerPay = hoursPerPay;
    }

    public EmployeeClassRule100PutRequest withHoursPerPay(Double hoursPerPay) {
        this.hoursPerPay = hoursPerPay;
        return this;
    }

    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerPay")
    public Double getCriteriaHoursPerPay() {
        return criteriaHoursPerPay;
    }

    /**
     * Hours Per Pay
     * <p>
     * Lineage reference object : FTVECLS_HOURS_PER_PAY
     * (Required)
     * 
     */
    @JsonProperty("criteria.hoursPerPay")
    public void setCriteriaHoursPerPay(Double criteriaHoursPerPay) {
        this.criteriaHoursPerPay = criteriaHoursPerPay;
    }

    public EmployeeClassRule100PutRequest withCriteriaHoursPerPay(Double criteriaHoursPerPay) {
        this.criteriaHoursPerPay = criteriaHoursPerPay;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    public String getCriteriaEclsCode() {
        return criteriaEclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("criteria.eclsCode")
    public void setCriteriaEclsCode(String criteriaEclsCode) {
        this.criteriaEclsCode = criteriaEclsCode;
    }

    public EmployeeClassRule100PutRequest withCriteriaEclsCode(String criteriaEclsCode) {
        this.criteriaEclsCode = criteriaEclsCode;
        return this;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    public String getCriteriaWkshCode() {
        return criteriaWkshCode;
    }

    /**
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("criteria.wkshCode")
    public void setCriteriaWkshCode(String criteriaWkshCode) {
        this.criteriaWkshCode = criteriaWkshCode;
    }

    public EmployeeClassRule100PutRequest withCriteriaWkshCode(String criteriaWkshCode) {
        this.criteriaWkshCode = criteriaWkshCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeClassRule100PutRequest withDesc(String desc) {
        this.desc = desc;
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

    public EmployeeClassRule100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRule100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaContractInd");
        sb.append('=');
        sb.append(((this.criteriaContractInd == null)?"<null>":this.criteriaContractInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("contractInd");
        sb.append('=');
        sb.append(((this.contractInd == null)?"<null>":this.contractInd));
        sb.append(',');
        sb.append("criteriaPictCode");
        sb.append('=');
        sb.append(((this.criteriaPictCode == null)?"<null>":this.criteriaPictCode));
        sb.append(',');
        sb.append("wkshCode");
        sb.append('=');
        sb.append(((this.wkshCode == null)?"<null>":this.wkshCode));
        sb.append(',');
        sb.append("criteriaPaysPerYear");
        sb.append('=');
        sb.append(((this.criteriaPaysPerYear == null)?"<null>":this.criteriaPaysPerYear));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("budgetRollInd");
        sb.append('=');
        sb.append(((this.budgetRollInd == null)?"<null>":this.budgetRollInd));
        sb.append(',');
        sb.append("criteriaHoursPerDay");
        sb.append('=');
        sb.append(((this.criteriaHoursPerDay == null)?"<null>":this.criteriaHoursPerDay));
        sb.append(',');
        sb.append("hoursPerDay");
        sb.append('=');
        sb.append(((this.hoursPerDay == null)?"<null>":this.hoursPerDay));
        sb.append(',');
        sb.append("criteriaBudgetRollInd");
        sb.append('=');
        sb.append(((this.criteriaBudgetRollInd == null)?"<null>":this.criteriaBudgetRollInd));
        sb.append(',');
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("hoursPerPay");
        sb.append('=');
        sb.append(((this.hoursPerPay == null)?"<null>":this.hoursPerPay));
        sb.append(',');
        sb.append("criteriaHoursPerPay");
        sb.append('=');
        sb.append(((this.criteriaHoursPerPay == null)?"<null>":this.criteriaHoursPerPay));
        sb.append(',');
        sb.append("criteriaEclsCode");
        sb.append('=');
        sb.append(((this.criteriaEclsCode == null)?"<null>":this.criteriaEclsCode));
        sb.append(',');
        sb.append("criteriaWkshCode");
        sb.append('=');
        sb.append(((this.criteriaWkshCode == null)?"<null>":this.criteriaWkshCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.contractInd == null)? 0 :this.contractInd.hashCode()));
        result = ((result* 31)+((this.criteriaHoursPerDay == null)? 0 :this.criteriaHoursPerDay.hashCode()));
        result = ((result* 31)+((this.wkshCode == null)? 0 :this.wkshCode.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.budgetRollInd == null)? 0 :this.budgetRollInd.hashCode()));
        result = ((result* 31)+((this.hoursPerDay == null)? 0 :this.hoursPerDay.hashCode()));
        result = ((result* 31)+((this.paysPerYear == null)? 0 :this.paysPerYear.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.criteriaContractInd == null)? 0 :this.criteriaContractInd.hashCode()));
        result = ((result* 31)+((this.criteriaHoursPerPay == null)? 0 :this.criteriaHoursPerPay.hashCode()));
        result = ((result* 31)+((this.criteriaPictCode == null)? 0 :this.criteriaPictCode.hashCode()));
        result = ((result* 31)+((this.criteriaPaysPerYear == null)? 0 :this.criteriaPaysPerYear.hashCode()));
        result = ((result* 31)+((this.criteriaBudgetRollInd == null)? 0 :this.criteriaBudgetRollInd.hashCode()));
        result = ((result* 31)+((this.hoursPerPay == null)? 0 :this.hoursPerPay.hashCode()));
        result = ((result* 31)+((this.criteriaEclsCode == null)? 0 :this.criteriaEclsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.criteriaWkshCode == null)? 0 :this.criteriaWkshCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRule100PutRequest) == false) {
            return false;
        }
        EmployeeClassRule100PutRequest rhs = ((EmployeeClassRule100PutRequest) other);
        return (((((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.contractInd == rhs.contractInd)||((this.contractInd!= null)&&this.contractInd.equals(rhs.contractInd))))&&((this.criteriaHoursPerDay == rhs.criteriaHoursPerDay)||((this.criteriaHoursPerDay!= null)&&this.criteriaHoursPerDay.equals(rhs.criteriaHoursPerDay))))&&((this.wkshCode == rhs.wkshCode)||((this.wkshCode!= null)&&this.wkshCode.equals(rhs.wkshCode))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.budgetRollInd == rhs.budgetRollInd)||((this.budgetRollInd!= null)&&this.budgetRollInd.equals(rhs.budgetRollInd))))&&((this.hoursPerDay == rhs.hoursPerDay)||((this.hoursPerDay!= null)&&this.hoursPerDay.equals(rhs.hoursPerDay))))&&((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.criteriaContractInd == rhs.criteriaContractInd)||((this.criteriaContractInd!= null)&&this.criteriaContractInd.equals(rhs.criteriaContractInd))))&&((this.criteriaHoursPerPay == rhs.criteriaHoursPerPay)||((this.criteriaHoursPerPay!= null)&&this.criteriaHoursPerPay.equals(rhs.criteriaHoursPerPay))))&&((this.criteriaPictCode == rhs.criteriaPictCode)||((this.criteriaPictCode!= null)&&this.criteriaPictCode.equals(rhs.criteriaPictCode))))&&((this.criteriaPaysPerYear == rhs.criteriaPaysPerYear)||((this.criteriaPaysPerYear!= null)&&this.criteriaPaysPerYear.equals(rhs.criteriaPaysPerYear))))&&((this.criteriaBudgetRollInd == rhs.criteriaBudgetRollInd)||((this.criteriaBudgetRollInd!= null)&&this.criteriaBudgetRollInd.equals(rhs.criteriaBudgetRollInd))))&&((this.hoursPerPay == rhs.hoursPerPay)||((this.hoursPerPay!= null)&&this.hoursPerPay.equals(rhs.hoursPerPay))))&&((this.criteriaEclsCode == rhs.criteriaEclsCode)||((this.criteriaEclsCode!= null)&&this.criteriaEclsCode.equals(rhs.criteriaEclsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.criteriaWkshCode == rhs.criteriaWkshCode)||((this.criteriaWkshCode!= null)&&this.criteriaWkshCode.equals(rhs.criteriaWkshCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
