
package com.ellucian.generated.bpapi.ban.installment_payment_plan_amount.v1_0_0;

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
    "calcExisting",
    "amount",
    "effDate",
    "installmentPlan",
    "detailCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class Tbvinsp {

    /**
     * Existing or Calculated
     * <p>
     * Lineage reference object : TBVINSP_CALC_EXISTING
     * 
     */
    @JsonProperty("calcExisting")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_CALC_EXISTING")
    private String calcExisting;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBVINSP_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_AMOUNT")
    private Double amount;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVINSP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_EFF_DATE")
    private Date effDate;
    /**
     * Plan Code
     * <p>
     * Lineage reference object : TBVINSP_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_INSTALLMENT_PLAN")
    private String installmentPlan;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVINSP_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_DETAIL_CODE")
    private String detailCode;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBVINSP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBVINSP_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Existing or Calculated
     * <p>
     * Lineage reference object : TBVINSP_CALC_EXISTING
     * 
     */
    @JsonProperty("calcExisting")
    public String getCalcExisting() {
        return calcExisting;
    }

    /**
     * Existing or Calculated
     * <p>
     * Lineage reference object : TBVINSP_CALC_EXISTING
     * 
     */
    @JsonProperty("calcExisting")
    public void setCalcExisting(String calcExisting) {
        this.calcExisting = calcExisting;
    }

    public Tbvinsp withCalcExisting(String calcExisting) {
        this.calcExisting = calcExisting;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVINSP_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVINSP_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Tbvinsp withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVINSP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVINSP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Tbvinsp withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Plan Code
     * <p>
     * Lineage reference object : TBVINSP_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public String getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Plan Code
     * <p>
     * Lineage reference object : TBVINSP_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public Tbvinsp withInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVINSP_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVINSP_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbvinsp withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBVINSP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBVINSP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbvinsp withDesc(String desc) {
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

    public Tbvinsp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvinsp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("calcExisting");
        sb.append('=');
        sb.append(((this.calcExisting == null)?"<null>":this.calcExisting));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.calcExisting == null)? 0 :this.calcExisting.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvinsp) == false) {
            return false;
        }
        Tbvinsp rhs = ((Tbvinsp) other);
        return ((((((((this.calcExisting == rhs.calcExisting)||((this.calcExisting!= null)&&this.calcExisting.equals(rhs.calcExisting)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
