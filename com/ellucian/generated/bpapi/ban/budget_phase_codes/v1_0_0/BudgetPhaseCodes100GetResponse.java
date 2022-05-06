
package com.ellucian.generated.bpapi.ban.budget_phase_codes.v1_0_0;

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
    "obudCode",
    "budgPhaseShortTitle",
    "statusDesc",
    "obphCode",
    "obudCodeBase",
    "budgActivationDate",
    "budgMeasType",
    "budgPhaseStatus",
    "coasCode",
    "obphCodeBase"
})
@Generated("jsonschema2pojo")
public class BudgetPhaseCodes100GetResponse {

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_OBUD_CODE")
    private String obudCode;
    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_PHASE_SHORT_TITLE
     * 
     */
    @JsonProperty("budgPhaseShortTitle")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_BUDG_PHASE_SHORT_TITLE")
    private String budgPhaseShortTitle;
    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    private String statusDesc;
    /**
     * Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_OBPH_CODE")
    private String obphCode;
    /**
     * Base
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE_BASE
     * 
     */
    @JsonProperty("obudCodeBase")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_OBUD_CODE_BASE")
    private String obudCodeBase;
    /**
     * Activation Date
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_ACTIVATION_DATE
     * 
     */
    @JsonProperty("budgActivationDate")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_BUDG_ACTIVATION_DATE")
    private Date budgActivationDate;
    /**
     * Measurement
     * Type
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_MEAS_TYPE
     * 
     */
    @JsonProperty("budgMeasType")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_BUDG_MEAS_TYPE")
    private String budgMeasType;
    /**
     * Lineage reference object : FTVOBPH_BUDG_PHASE_STATUS
     * 
     */
    @JsonProperty("budgPhaseStatus")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_BUDG_PHASE_STATUS")
    private String budgPhaseStatus;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBPH_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_COAS_CODE")
    private String coasCode;
    /**
     * Base Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE_BASE
     * 
     */
    @JsonProperty("obphCodeBase")
    @JsonPropertyDescription("Lineage reference object : FTVOBPH_OBPH_CODE_BASE")
    private String obphCodeBase;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public String getObudCode() {
        return obudCode;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE
     * 
     */
    @JsonProperty("obudCode")
    public void setObudCode(String obudCode) {
        this.obudCode = obudCode;
    }

    public BudgetPhaseCodes100GetResponse withObudCode(String obudCode) {
        this.obudCode = obudCode;
        return this;
    }

    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_PHASE_SHORT_TITLE
     * 
     */
    @JsonProperty("budgPhaseShortTitle")
    public String getBudgPhaseShortTitle() {
        return budgPhaseShortTitle;
    }

    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_PHASE_SHORT_TITLE
     * 
     */
    @JsonProperty("budgPhaseShortTitle")
    public void setBudgPhaseShortTitle(String budgPhaseShortTitle) {
        this.budgPhaseShortTitle = budgPhaseShortTitle;
    }

    public BudgetPhaseCodes100GetResponse withBudgPhaseShortTitle(String budgPhaseShortTitle) {
        this.budgPhaseShortTitle = budgPhaseShortTitle;
        return this;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public BudgetPhaseCodes100GetResponse withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    public String getObphCode() {
        return obphCode;
    }

    /**
     * Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE
     * 
     */
    @JsonProperty("obphCode")
    public void setObphCode(String obphCode) {
        this.obphCode = obphCode;
    }

    public BudgetPhaseCodes100GetResponse withObphCode(String obphCode) {
        this.obphCode = obphCode;
        return this;
    }

    /**
     * Base
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE_BASE
     * 
     */
    @JsonProperty("obudCodeBase")
    public String getObudCodeBase() {
        return obudCodeBase;
    }

    /**
     * Base
     * Budget ID
     * <p>
     * Lineage reference object : FTVOBPH_OBUD_CODE_BASE
     * 
     */
    @JsonProperty("obudCodeBase")
    public void setObudCodeBase(String obudCodeBase) {
        this.obudCodeBase = obudCodeBase;
    }

    public BudgetPhaseCodes100GetResponse withObudCodeBase(String obudCodeBase) {
        this.obudCodeBase = obudCodeBase;
        return this;
    }

    /**
     * Activation Date
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_ACTIVATION_DATE
     * 
     */
    @JsonProperty("budgActivationDate")
    public Date getBudgActivationDate() {
        return budgActivationDate;
    }

    /**
     * Activation Date
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_ACTIVATION_DATE
     * 
     */
    @JsonProperty("budgActivationDate")
    public void setBudgActivationDate(Date budgActivationDate) {
        this.budgActivationDate = budgActivationDate;
    }

    public BudgetPhaseCodes100GetResponse withBudgActivationDate(Date budgActivationDate) {
        this.budgActivationDate = budgActivationDate;
        return this;
    }

    /**
     * Measurement
     * Type
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_MEAS_TYPE
     * 
     */
    @JsonProperty("budgMeasType")
    public String getBudgMeasType() {
        return budgMeasType;
    }

    /**
     * Measurement
     * Type
     * <p>
     * Lineage reference object : FTVOBPH_BUDG_MEAS_TYPE
     * 
     */
    @JsonProperty("budgMeasType")
    public void setBudgMeasType(String budgMeasType) {
        this.budgMeasType = budgMeasType;
    }

    public BudgetPhaseCodes100GetResponse withBudgMeasType(String budgMeasType) {
        this.budgMeasType = budgMeasType;
        return this;
    }

    /**
     * Lineage reference object : FTVOBPH_BUDG_PHASE_STATUS
     * 
     */
    @JsonProperty("budgPhaseStatus")
    public String getBudgPhaseStatus() {
        return budgPhaseStatus;
    }

    /**
     * Lineage reference object : FTVOBPH_BUDG_PHASE_STATUS
     * 
     */
    @JsonProperty("budgPhaseStatus")
    public void setBudgPhaseStatus(String budgPhaseStatus) {
        this.budgPhaseStatus = budgPhaseStatus;
    }

    public BudgetPhaseCodes100GetResponse withBudgPhaseStatus(String budgPhaseStatus) {
        this.budgPhaseStatus = budgPhaseStatus;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBPH_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVOBPH_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public BudgetPhaseCodes100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Base Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE_BASE
     * 
     */
    @JsonProperty("obphCodeBase")
    public String getObphCodeBase() {
        return obphCodeBase;
    }

    /**
     * Base Phase
     * <p>
     * Lineage reference object : FTVOBPH_OBPH_CODE_BASE
     * 
     */
    @JsonProperty("obphCodeBase")
    public void setObphCodeBase(String obphCodeBase) {
        this.obphCodeBase = obphCodeBase;
    }

    public BudgetPhaseCodes100GetResponse withObphCodeBase(String obphCodeBase) {
        this.obphCodeBase = obphCodeBase;
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

    public BudgetPhaseCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BudgetPhaseCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("obudCode");
        sb.append('=');
        sb.append(((this.obudCode == null)?"<null>":this.obudCode));
        sb.append(',');
        sb.append("budgPhaseShortTitle");
        sb.append('=');
        sb.append(((this.budgPhaseShortTitle == null)?"<null>":this.budgPhaseShortTitle));
        sb.append(',');
        sb.append("statusDesc");
        sb.append('=');
        sb.append(((this.statusDesc == null)?"<null>":this.statusDesc));
        sb.append(',');
        sb.append("obphCode");
        sb.append('=');
        sb.append(((this.obphCode == null)?"<null>":this.obphCode));
        sb.append(',');
        sb.append("obudCodeBase");
        sb.append('=');
        sb.append(((this.obudCodeBase == null)?"<null>":this.obudCodeBase));
        sb.append(',');
        sb.append("budgActivationDate");
        sb.append('=');
        sb.append(((this.budgActivationDate == null)?"<null>":this.budgActivationDate));
        sb.append(',');
        sb.append("budgMeasType");
        sb.append('=');
        sb.append(((this.budgMeasType == null)?"<null>":this.budgMeasType));
        sb.append(',');
        sb.append("budgPhaseStatus");
        sb.append('=');
        sb.append(((this.budgPhaseStatus == null)?"<null>":this.budgPhaseStatus));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("obphCodeBase");
        sb.append('=');
        sb.append(((this.obphCodeBase == null)?"<null>":this.obphCodeBase));
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
        result = ((result* 31)+((this.budgPhaseShortTitle == null)? 0 :this.budgPhaseShortTitle.hashCode()));
        result = ((result* 31)+((this.statusDesc == null)? 0 :this.statusDesc.hashCode()));
        result = ((result* 31)+((this.obphCode == null)? 0 :this.obphCode.hashCode()));
        result = ((result* 31)+((this.obudCodeBase == null)? 0 :this.obudCodeBase.hashCode()));
        result = ((result* 31)+((this.budgActivationDate == null)? 0 :this.budgActivationDate.hashCode()));
        result = ((result* 31)+((this.budgMeasType == null)? 0 :this.budgMeasType.hashCode()));
        result = ((result* 31)+((this.budgPhaseStatus == null)? 0 :this.budgPhaseStatus.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.obphCodeBase == null)? 0 :this.obphCodeBase.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetPhaseCodes100GetResponse) == false) {
            return false;
        }
        BudgetPhaseCodes100GetResponse rhs = ((BudgetPhaseCodes100GetResponse) other);
        return ((((((((((((this.obudCode == rhs.obudCode)||((this.obudCode!= null)&&this.obudCode.equals(rhs.obudCode)))&&((this.budgPhaseShortTitle == rhs.budgPhaseShortTitle)||((this.budgPhaseShortTitle!= null)&&this.budgPhaseShortTitle.equals(rhs.budgPhaseShortTitle))))&&((this.statusDesc == rhs.statusDesc)||((this.statusDesc!= null)&&this.statusDesc.equals(rhs.statusDesc))))&&((this.obphCode == rhs.obphCode)||((this.obphCode!= null)&&this.obphCode.equals(rhs.obphCode))))&&((this.obudCodeBase == rhs.obudCodeBase)||((this.obudCodeBase!= null)&&this.obudCodeBase.equals(rhs.obudCodeBase))))&&((this.budgActivationDate == rhs.budgActivationDate)||((this.budgActivationDate!= null)&&this.budgActivationDate.equals(rhs.budgActivationDate))))&&((this.budgMeasType == rhs.budgMeasType)||((this.budgMeasType!= null)&&this.budgMeasType.equals(rhs.budgMeasType))))&&((this.budgPhaseStatus == rhs.budgPhaseStatus)||((this.budgPhaseStatus!= null)&&this.budgPhaseStatus.equals(rhs.budgPhaseStatus))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.obphCodeBase == rhs.obphCodeBase)||((this.obphCodeBase!= null)&&this.obphCodeBase.equals(rhs.obphCodeBase))));
    }

}
