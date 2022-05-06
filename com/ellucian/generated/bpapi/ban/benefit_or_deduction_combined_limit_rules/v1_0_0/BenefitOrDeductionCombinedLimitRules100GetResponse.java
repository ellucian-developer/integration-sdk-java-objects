
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_combined_limit_rules.v1_0_0;

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
    "maxGross",
    "emplLimit",
    "activityDate",
    "code",
    "emprLimit",
    "emplEmprLimit",
    "desc"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionCombinedLimitRules100GetResponse {

    /**
     * Applicable Gross Limit
     * <p>
     * Lineage reference object : PTRBDCL_MAX_GROSS
     * 
     */
    @JsonProperty("maxGross")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_MAX_GROSS")
    private Double maxGross;
    /**
     * Employee Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_LIMIT
     * 
     */
    @JsonProperty("emplLimit")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_EMPL_LIMIT")
    private Double emplLimit;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_CODE")
    private String code;
    /**
     * Employer Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emprLimit")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_EMPR_LIMIT")
    private Double emprLimit;
    /**
     * Combined Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emplEmprLimit")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_EMPL_EMPR_LIMIT")
    private Double emplEmprLimit;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRBDCL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Applicable Gross Limit
     * <p>
     * Lineage reference object : PTRBDCL_MAX_GROSS
     * 
     */
    @JsonProperty("maxGross")
    public Double getMaxGross() {
        return maxGross;
    }

    /**
     * Applicable Gross Limit
     * <p>
     * Lineage reference object : PTRBDCL_MAX_GROSS
     * 
     */
    @JsonProperty("maxGross")
    public void setMaxGross(Double maxGross) {
        this.maxGross = maxGross;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withMaxGross(Double maxGross) {
        this.maxGross = maxGross;
        return this;
    }

    /**
     * Employee Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_LIMIT
     * 
     */
    @JsonProperty("emplLimit")
    public Double getEmplLimit() {
        return emplLimit;
    }

    /**
     * Employee Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_LIMIT
     * 
     */
    @JsonProperty("emplLimit")
    public void setEmplLimit(Double emplLimit) {
        this.emplLimit = emplLimit;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withEmplLimit(Double emplLimit) {
        this.emplLimit = emplLimit;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Employer Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emprLimit")
    public Double getEmprLimit() {
        return emprLimit;
    }

    /**
     * Employer Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emprLimit")
    public void setEmprLimit(Double emprLimit) {
        this.emprLimit = emprLimit;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withEmprLimit(Double emprLimit) {
        this.emprLimit = emprLimit;
        return this;
    }

    /**
     * Combined Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emplEmprLimit")
    public Double getEmplEmprLimit() {
        return emplEmprLimit;
    }

    /**
     * Combined Limit
     * <p>
     * Lineage reference object : PTRBDCL_EMPL_EMPR_LIMIT
     * 
     */
    @JsonProperty("emplEmprLimit")
    public void setEmplEmprLimit(Double emplEmprLimit) {
        this.emplEmprLimit = emplEmprLimit;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withEmplEmprLimit(Double emplEmprLimit) {
        this.emplEmprLimit = emplEmprLimit;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBDCL_DESC
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
     * Lineage reference object : PTRBDCL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BenefitOrDeductionCombinedLimitRules100GetResponse withDesc(String desc) {
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

    public BenefitOrDeductionCombinedLimitRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionCombinedLimitRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxGross");
        sb.append('=');
        sb.append(((this.maxGross == null)?"<null>":this.maxGross));
        sb.append(',');
        sb.append("emplLimit");
        sb.append('=');
        sb.append(((this.emplLimit == null)?"<null>":this.emplLimit));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("emprLimit");
        sb.append('=');
        sb.append(((this.emprLimit == null)?"<null>":this.emprLimit));
        sb.append(',');
        sb.append("emplEmprLimit");
        sb.append('=');
        sb.append(((this.emplEmprLimit == null)?"<null>":this.emplEmprLimit));
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
        result = ((result* 31)+((this.maxGross == null)? 0 :this.maxGross.hashCode()));
        result = ((result* 31)+((this.emplLimit == null)? 0 :this.emplLimit.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.emprLimit == null)? 0 :this.emprLimit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.emplEmprLimit == null)? 0 :this.emplEmprLimit.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionCombinedLimitRules100GetResponse) == false) {
            return false;
        }
        BenefitOrDeductionCombinedLimitRules100GetResponse rhs = ((BenefitOrDeductionCombinedLimitRules100GetResponse) other);
        return (((((((((this.maxGross == rhs.maxGross)||((this.maxGross!= null)&&this.maxGross.equals(rhs.maxGross)))&&((this.emplLimit == rhs.emplLimit)||((this.emplLimit!= null)&&this.emplLimit.equals(rhs.emplLimit))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.emprLimit == rhs.emprLimit)||((this.emprLimit!= null)&&this.emprLimit.equals(rhs.emprLimit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.emplEmprLimit == rhs.emplEmprLimit)||((this.emplEmprLimit!= null)&&this.emplEmprLimit.equals(rhs.emplEmprLimit))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
