
package com.ellucian.generated.bpapi.ban.position_budget_fringe_benefit.v1_0_0;

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
    "fiscCode",
    "posn",
    "budget"
})
@Generated("jsonschema2pojo")
public class PositionBudgetFringeBenefit100PostRequest {

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BDCA_CODE")
    private String bdcaCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    @JsonPropertyDescription("Lineage reference object : fiscCode")
    private Object fiscCode;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : NBRFTOT_BUDGET")
    private Double budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : NBRFTOT_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public PositionBudgetFringeBenefit100PostRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public Object getFiscCode() {
        return fiscCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : fiscCode
     * (Required)
     * 
     */
    @JsonProperty("fiscCode")
    public void setFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
    }

    public PositionBudgetFringeBenefit100PostRequest withFiscCode(Object fiscCode) {
        this.fiscCode = fiscCode;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public PositionBudgetFringeBenefit100PostRequest withPosn(Object posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public Double getBudget() {
        return budget;
    }

    /**
     * Budgeted Amount
     * <p>
     * Lineage reference object : NBRFTOT_BUDGET
     * (Required)
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public PositionBudgetFringeBenefit100PostRequest withBudget(Double budget) {
        this.budget = budget;
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

    public PositionBudgetFringeBenefit100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionBudgetFringeBenefit100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("fiscCode");
        sb.append('=');
        sb.append(((this.fiscCode == null)?"<null>":this.fiscCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.fiscCode == null)? 0 :this.fiscCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionBudgetFringeBenefit100PostRequest) == false) {
            return false;
        }
        PositionBudgetFringeBenefit100PostRequest rhs = ((PositionBudgetFringeBenefit100PostRequest) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.fiscCode == rhs.fiscCode)||((this.fiscCode!= null)&&this.fiscCode.equals(rhs.fiscCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
