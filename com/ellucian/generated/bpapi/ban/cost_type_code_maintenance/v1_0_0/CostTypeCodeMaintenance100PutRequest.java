
package com.ellucian.generated.bpapi.ban.cost_type_code_maintenance.v1_0_0;

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
    "criteria.ftvctypShortDesc",
    "criteria.ftvctypCode",
    "code",
    "criteria.ftvctypLongDesc",
    "shortDesc",
    "longDesc"
})
@Generated("jsonschema2pojo")
public class CostTypeCodeMaintenance100PutRequest {

    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("criteria.ftvctypShortDesc")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_SHORT_DESC")
    private String criteriaFtvctypShortDesc;
    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypCode")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_CODE")
    private String criteriaFtvctypCode;
    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_CODE")
    private String code;
    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypLongDesc")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_LONG_DESC")
    private String criteriaFtvctypLongDesc;
    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_SHORT_DESC")
    private String shortDesc;
    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : FTVCTYP_LONG_DESC")
    private String longDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("criteria.ftvctypShortDesc")
    public String getCriteriaFtvctypShortDesc() {
        return criteriaFtvctypShortDesc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("criteria.ftvctypShortDesc")
    public void setCriteriaFtvctypShortDesc(String criteriaFtvctypShortDesc) {
        this.criteriaFtvctypShortDesc = criteriaFtvctypShortDesc;
    }

    public CostTypeCodeMaintenance100PutRequest withCriteriaFtvctypShortDesc(String criteriaFtvctypShortDesc) {
        this.criteriaFtvctypShortDesc = criteriaFtvctypShortDesc;
        return this;
    }

    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypCode")
    public String getCriteriaFtvctypCode() {
        return criteriaFtvctypCode;
    }

    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypCode")
    public void setCriteriaFtvctypCode(String criteriaFtvctypCode) {
        this.criteriaFtvctypCode = criteriaFtvctypCode;
    }

    public CostTypeCodeMaintenance100PutRequest withCriteriaFtvctypCode(String criteriaFtvctypCode) {
        this.criteriaFtvctypCode = criteriaFtvctypCode;
        return this;
    }

    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Cost Type Code
     * <p>
     * Lineage reference object : FTVCTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CostTypeCodeMaintenance100PutRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypLongDesc")
    public String getCriteriaFtvctypLongDesc() {
        return criteriaFtvctypLongDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvctypLongDesc")
    public void setCriteriaFtvctypLongDesc(String criteriaFtvctypLongDesc) {
        this.criteriaFtvctypLongDesc = criteriaFtvctypLongDesc;
    }

    public CostTypeCodeMaintenance100PutRequest withCriteriaFtvctypLongDesc(String criteriaFtvctypLongDesc) {
        this.criteriaFtvctypLongDesc = criteriaFtvctypLongDesc;
        return this;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : FTVCTYP_SHORT_DESC
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public CostTypeCodeMaintenance100PutRequest withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : FTVCTYP_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public CostTypeCodeMaintenance100PutRequest withLongDesc(String longDesc) {
        this.longDesc = longDesc;
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

    public CostTypeCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CostTypeCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFtvctypShortDesc");
        sb.append('=');
        sb.append(((this.criteriaFtvctypShortDesc == null)?"<null>":this.criteriaFtvctypShortDesc));
        sb.append(',');
        sb.append("criteriaFtvctypCode");
        sb.append('=');
        sb.append(((this.criteriaFtvctypCode == null)?"<null>":this.criteriaFtvctypCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("criteriaFtvctypLongDesc");
        sb.append('=');
        sb.append(((this.criteriaFtvctypLongDesc == null)?"<null>":this.criteriaFtvctypLongDesc));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
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
        result = ((result* 31)+((this.criteriaFtvctypShortDesc == null)? 0 :this.criteriaFtvctypShortDesc.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.criteriaFtvctypCode == null)? 0 :this.criteriaFtvctypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvctypLongDesc == null)? 0 :this.criteriaFtvctypLongDesc.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CostTypeCodeMaintenance100PutRequest) == false) {
            return false;
        }
        CostTypeCodeMaintenance100PutRequest rhs = ((CostTypeCodeMaintenance100PutRequest) other);
        return ((((((((this.criteriaFtvctypShortDesc == rhs.criteriaFtvctypShortDesc)||((this.criteriaFtvctypShortDesc!= null)&&this.criteriaFtvctypShortDesc.equals(rhs.criteriaFtvctypShortDesc)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.criteriaFtvctypCode == rhs.criteriaFtvctypCode)||((this.criteriaFtvctypCode!= null)&&this.criteriaFtvctypCode.equals(rhs.criteriaFtvctypCode))))&&((this.criteriaFtvctypLongDesc == rhs.criteriaFtvctypLongDesc)||((this.criteriaFtvctypLongDesc!= null)&&this.criteriaFtvctypLongDesc.equals(rhs.criteriaFtvctypLongDesc))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))));
    }

}
