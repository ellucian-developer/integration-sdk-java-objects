
package com.ellucian.generated.bpapi.ban.student_account_summaries.v1_0_0;

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
    "refNumber",
    "installmentPlan",
    "planAmount",
    "desc"
})
@Generated("jsonschema2pojo")
public class Tbristl {

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_REF_NUMBER")
    private Double refNumber;
    /**
     * Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INSTALLMENT_PLAN")
    private String installmentPlan;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PLAN_AMOUNT")
    private Double planAmount;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    public Double getRefNumber() {
        return refNumber;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    public void setRefNumber(Double refNumber) {
        this.refNumber = refNumber;
    }

    public Tbristl withRefNumber(Double refNumber) {
        this.refNumber = refNumber;
        return this;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public String getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public Tbristl withInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    public Double getPlanAmount() {
        return planAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    public void setPlanAmount(Double planAmount) {
        this.planAmount = planAmount;
    }

    public Tbristl withPlanAmount(Double planAmount) {
        this.planAmount = planAmount;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbristl withDesc(String desc) {
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

    public Tbristl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbristl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("refNumber");
        sb.append('=');
        sb.append(((this.refNumber == null)?"<null>":this.refNumber));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("planAmount");
        sb.append('=');
        sb.append(((this.planAmount == null)?"<null>":this.planAmount));
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
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.refNumber == null)? 0 :this.refNumber.hashCode()));
        result = ((result* 31)+((this.planAmount == null)? 0 :this.planAmount.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbristl) == false) {
            return false;
        }
        Tbristl rhs = ((Tbristl) other);
        return ((((((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.refNumber == rhs.refNumber)||((this.refNumber!= null)&&this.refNumber.equals(rhs.refNumber))))&&((this.planAmount == rhs.planAmount)||((this.planAmount!= null)&&this.planAmount.equals(rhs.planAmount))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
