
package com.ellucian.generated.bpapi.ban.operating_budgets.v1_0_0;

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
    "obudCode",
    "budgPrdType",
    "coasCode",
    "budgTitle",
    "yrsBudgeted"
})
@Generated("jsonschema2pojo")
public class OperatingBudgets100GetRequest {

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBUD_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    @JsonPropertyDescription("Lineage reference object : FTVOBUD_OBUD_CODE")
    private String obudCode;
    /**
     * Period Type
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_PRD_TYPE
     * 
     */
    @JsonProperty("budgPrdType")
    @JsonPropertyDescription("Lineage reference object : FTVOBUD_BUDG_PRD_TYPE")
    private String budgPrdType;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBUD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVOBUD_COAS_CODE")
    private String coasCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_TITLE
     * 
     */
    @JsonProperty("budgTitle")
    @JsonPropertyDescription("Lineage reference object : FTVOBUD_BUDG_TITLE")
    private String budgTitle;
    /**
     * Years Budgeted
     * <p>
     * Lineage reference object : FTVOBUD_YRS_BUDGETED
     * 
     */
    @JsonProperty("yrsBudgeted")
    @JsonPropertyDescription("Lineage reference object : FTVOBUD_YRS_BUDGETED")
    private Double yrsBudgeted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBUD_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public String getObudCode() {
        return obudCode;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBUD_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public void setObudCode(String obudCode) {
        this.obudCode = obudCode;
    }

    public OperatingBudgets100GetRequest withObudCode(String obudCode) {
        this.obudCode = obudCode;
        return this;
    }

    /**
     * Period Type
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_PRD_TYPE
     * 
     */
    @JsonProperty("budgPrdType")
    public String getBudgPrdType() {
        return budgPrdType;
    }

    /**
     * Period Type
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_PRD_TYPE
     * 
     */
    @JsonProperty("budgPrdType")
    public void setBudgPrdType(String budgPrdType) {
        this.budgPrdType = budgPrdType;
    }

    public OperatingBudgets100GetRequest withBudgPrdType(String budgPrdType) {
        this.budgPrdType = budgPrdType;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBUD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBUD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public OperatingBudgets100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_TITLE
     * 
     */
    @JsonProperty("budgTitle")
    public String getBudgTitle() {
        return budgTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVOBUD_BUDG_TITLE
     * 
     */
    @JsonProperty("budgTitle")
    public void setBudgTitle(String budgTitle) {
        this.budgTitle = budgTitle;
    }

    public OperatingBudgets100GetRequest withBudgTitle(String budgTitle) {
        this.budgTitle = budgTitle;
        return this;
    }

    /**
     * Years Budgeted
     * <p>
     * Lineage reference object : FTVOBUD_YRS_BUDGETED
     * 
     */
    @JsonProperty("yrsBudgeted")
    public Double getYrsBudgeted() {
        return yrsBudgeted;
    }

    /**
     * Years Budgeted
     * <p>
     * Lineage reference object : FTVOBUD_YRS_BUDGETED
     * 
     */
    @JsonProperty("yrsBudgeted")
    public void setYrsBudgeted(Double yrsBudgeted) {
        this.yrsBudgeted = yrsBudgeted;
    }

    public OperatingBudgets100GetRequest withYrsBudgeted(Double yrsBudgeted) {
        this.yrsBudgeted = yrsBudgeted;
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

    public OperatingBudgets100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperatingBudgets100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("obudCode");
        sb.append('=');
        sb.append(((this.obudCode == null)?"<null>":this.obudCode));
        sb.append(',');
        sb.append("budgPrdType");
        sb.append('=');
        sb.append(((this.budgPrdType == null)?"<null>":this.budgPrdType));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("budgTitle");
        sb.append('=');
        sb.append(((this.budgTitle == null)?"<null>":this.budgTitle));
        sb.append(',');
        sb.append("yrsBudgeted");
        sb.append('=');
        sb.append(((this.yrsBudgeted == null)?"<null>":this.yrsBudgeted));
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
        result = ((result* 31)+((this.obudCode == null)? 0 :this.obudCode.hashCode()));
        result = ((result* 31)+((this.budgPrdType == null)? 0 :this.budgPrdType.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.budgTitle == null)? 0 :this.budgTitle.hashCode()));
        result = ((result* 31)+((this.yrsBudgeted == null)? 0 :this.yrsBudgeted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingBudgets100GetRequest) == false) {
            return false;
        }
        OperatingBudgets100GetRequest rhs = ((OperatingBudgets100GetRequest) other);
        return (((((((this.obudCode == rhs.obudCode)||((this.obudCode!= null)&&this.obudCode.equals(rhs.obudCode)))&&((this.budgPrdType == rhs.budgPrdType)||((this.budgPrdType!= null)&&this.budgPrdType.equals(rhs.budgPrdType))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.budgTitle == rhs.budgTitle)||((this.budgTitle!= null)&&this.budgTitle.equals(rhs.budgTitle))))&&((this.yrsBudgeted == rhs.yrsBudgeted)||((this.yrsBudgeted!= null)&&this.yrsBudgeted.equals(rhs.yrsBudgeted))));
    }

}
