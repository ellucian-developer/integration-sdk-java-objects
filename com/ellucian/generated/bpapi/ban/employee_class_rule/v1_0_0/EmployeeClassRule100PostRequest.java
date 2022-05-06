
package com.ellucian.generated.bpapi.ban.employee_class_rule.v1_0_0;

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
    "paysPerYear",
    "pictCode",
    "contractInd",
    "hoursPerPay",
    "wkshCode",
    "budgetRollInd",
    "desc",
    "ftveclsDesc",
    "hoursPerDay"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRule100PostRequest {

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
     * Work Schedule
     * <p>
     * Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh
     * 
     */
    @JsonProperty("wkshCode")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_WKSH_CODE, Lookup lineage reference object : ntvwksh")
    private String wkshCode;
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
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls")
    private String desc;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("ftveclsDesc")
    @JsonPropertyDescription("Lineage reference object : FTVECLS_DESC")
    private String ftveclsDesc;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public EmployeeClassRule100PostRequest withPaysPerYear(Double paysPerYear) {
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

    public EmployeeClassRule100PostRequest withPictCode(String pictCode) {
        this.pictCode = pictCode;
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

    public EmployeeClassRule100PostRequest withContractInd(String contractInd) {
        this.contractInd = contractInd;
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

    public EmployeeClassRule100PostRequest withHoursPerPay(Double hoursPerPay) {
        this.hoursPerPay = hoursPerPay;
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

    public EmployeeClassRule100PostRequest withWkshCode(String wkshCode) {
        this.wkshCode = wkshCode;
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

    public EmployeeClassRule100PostRequest withBudgetRollInd(String budgetRollInd) {
        this.budgetRollInd = budgetRollInd;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : FTVECLS_ECLS_CODE, Lookup lineage reference object : ftvecls
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeClassRule100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("ftveclsDesc")
    public String getFtveclsDesc() {
        return ftveclsDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVECLS_DESC
     * (Required)
     * 
     */
    @JsonProperty("ftveclsDesc")
    public void setFtveclsDesc(String ftveclsDesc) {
        this.ftveclsDesc = ftveclsDesc;
    }

    public EmployeeClassRule100PostRequest withFtveclsDesc(String ftveclsDesc) {
        this.ftveclsDesc = ftveclsDesc;
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

    public EmployeeClassRule100PostRequest withHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
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

    public EmployeeClassRule100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRule100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("contractInd");
        sb.append('=');
        sb.append(((this.contractInd == null)?"<null>":this.contractInd));
        sb.append(',');
        sb.append("hoursPerPay");
        sb.append('=');
        sb.append(((this.hoursPerPay == null)?"<null>":this.hoursPerPay));
        sb.append(',');
        sb.append("wkshCode");
        sb.append('=');
        sb.append(((this.wkshCode == null)?"<null>":this.wkshCode));
        sb.append(',');
        sb.append("budgetRollInd");
        sb.append('=');
        sb.append(((this.budgetRollInd == null)?"<null>":this.budgetRollInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("ftveclsDesc");
        sb.append('=');
        sb.append(((this.ftveclsDesc == null)?"<null>":this.ftveclsDesc));
        sb.append(',');
        sb.append("hoursPerDay");
        sb.append('=');
        sb.append(((this.hoursPerDay == null)?"<null>":this.hoursPerDay));
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
        result = ((result* 31)+((this.hoursPerPay == null)? 0 :this.hoursPerPay.hashCode()));
        result = ((result* 31)+((this.wkshCode == null)? 0 :this.wkshCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.budgetRollInd == null)? 0 :this.budgetRollInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.ftveclsDesc == null)? 0 :this.ftveclsDesc.hashCode()));
        result = ((result* 31)+((this.hoursPerDay == null)? 0 :this.hoursPerDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRule100PostRequest) == false) {
            return false;
        }
        EmployeeClassRule100PostRequest rhs = ((EmployeeClassRule100PostRequest) other);
        return (((((((((((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear)))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.contractInd == rhs.contractInd)||((this.contractInd!= null)&&this.contractInd.equals(rhs.contractInd))))&&((this.hoursPerPay == rhs.hoursPerPay)||((this.hoursPerPay!= null)&&this.hoursPerPay.equals(rhs.hoursPerPay))))&&((this.wkshCode == rhs.wkshCode)||((this.wkshCode!= null)&&this.wkshCode.equals(rhs.wkshCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.budgetRollInd == rhs.budgetRollInd)||((this.budgetRollInd!= null)&&this.budgetRollInd.equals(rhs.budgetRollInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.ftveclsDesc == rhs.ftveclsDesc)||((this.ftveclsDesc!= null)&&this.ftveclsDesc.equals(rhs.ftveclsDesc))))&&((this.hoursPerDay == rhs.hoursPerDay)||((this.hoursPerDay!= null)&&this.hoursPerDay.equals(rhs.hoursPerDay))));
    }

}
