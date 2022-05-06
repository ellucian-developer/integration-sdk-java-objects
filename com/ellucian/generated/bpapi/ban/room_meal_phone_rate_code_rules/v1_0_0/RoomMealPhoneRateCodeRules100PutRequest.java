
package com.ellucian.generated.bpapi.ban.room_meal_phone_rate_code_rules.v1_0_0;

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
    "criteria.slrlmfeActivityDate",
    "keyblocTermCode",
    "slrlmfeBaseRate",
    "slrlmfeDetailCode",
    "criteria.slrlmfeDetailCode",
    "slrlmfeRateCode",
    "slrlmfeMaxCharge",
    "slrlmfeMDT",
    "slrlmfeMinCharge",
    "criteria.slrlmfeMaxCharge",
    "criteria.slrlmfeMDT",
    "criteria.slrlmfeBaseRate",
    "criteria.slrlmfeMinCharge",
    "criteria.slrlmfeRateCode"
})
@Generated("jsonschema2pojo")
public class RoomMealPhoneRateCodeRules100PutRequest {

    /**
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.slrlmfeActivityDate")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_ACTIVITY_DATE")
    private Date criteriaSlrlmfeActivityDate;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeBaseRate")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_BASE_RATE")
    private Double slrlmfeBaseRate;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeDetailCode")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String slrlmfeDetailCode;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeDetailCode")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaSlrlmfeDetailCode;
    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeRateCode")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd")
    private String slrlmfeRateCode;
    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMaxCharge")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_MAX_CHARGE")
    private Double slrlmfeMaxCharge;
    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMDT")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_M_D_T")
    private String slrlmfeMDT;
    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMinCharge")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_MIN_CHARGE")
    private Double slrlmfeMinCharge;
    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMaxCharge")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_MAX_CHARGE")
    private Double criteriaSlrlmfeMaxCharge;
    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMDT")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_M_D_T")
    private String criteriaSlrlmfeMDT;
    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeBaseRate")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_BASE_RATE")
    private Double criteriaSlrlmfeBaseRate;
    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMinCharge")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_MIN_CHARGE")
    private Double criteriaSlrlmfeMinCharge;
    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeRateCode")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd")
    private String criteriaSlrlmfeRateCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.slrlmfeActivityDate")
    public Date getCriteriaSlrlmfeActivityDate() {
        return criteriaSlrlmfeActivityDate;
    }

    /**
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.slrlmfeActivityDate")
    public void setCriteriaSlrlmfeActivityDate(Date criteriaSlrlmfeActivityDate) {
        this.criteriaSlrlmfeActivityDate = criteriaSlrlmfeActivityDate;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeActivityDate(Date criteriaSlrlmfeActivityDate) {
        this.criteriaSlrlmfeActivityDate = criteriaSlrlmfeActivityDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeBaseRate")
    public Double getSlrlmfeBaseRate() {
        return slrlmfeBaseRate;
    }

    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeBaseRate")
    public void setSlrlmfeBaseRate(Double slrlmfeBaseRate) {
        this.slrlmfeBaseRate = slrlmfeBaseRate;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeBaseRate(Double slrlmfeBaseRate) {
        this.slrlmfeBaseRate = slrlmfeBaseRate;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeDetailCode")
    public String getSlrlmfeDetailCode() {
        return slrlmfeDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeDetailCode")
    public void setSlrlmfeDetailCode(String slrlmfeDetailCode) {
        this.slrlmfeDetailCode = slrlmfeDetailCode;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeDetailCode(String slrlmfeDetailCode) {
        this.slrlmfeDetailCode = slrlmfeDetailCode;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeDetailCode")
    public String getCriteriaSlrlmfeDetailCode() {
        return criteriaSlrlmfeDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SLRLMFE_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeDetailCode")
    public void setCriteriaSlrlmfeDetailCode(String criteriaSlrlmfeDetailCode) {
        this.criteriaSlrlmfeDetailCode = criteriaSlrlmfeDetailCode;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeDetailCode(String criteriaSlrlmfeDetailCode) {
        this.criteriaSlrlmfeDetailCode = criteriaSlrlmfeDetailCode;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeRateCode")
    public String getSlrlmfeRateCode() {
        return slrlmfeRateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeRateCode")
    public void setSlrlmfeRateCode(String slrlmfeRateCode) {
        this.slrlmfeRateCode = slrlmfeRateCode;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeRateCode(String slrlmfeRateCode) {
        this.slrlmfeRateCode = slrlmfeRateCode;
        return this;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMaxCharge")
    public Double getSlrlmfeMaxCharge() {
        return slrlmfeMaxCharge;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMaxCharge")
    public void setSlrlmfeMaxCharge(Double slrlmfeMaxCharge) {
        this.slrlmfeMaxCharge = slrlmfeMaxCharge;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeMaxCharge(Double slrlmfeMaxCharge) {
        this.slrlmfeMaxCharge = slrlmfeMaxCharge;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMDT")
    public String getSlrlmfeMDT() {
        return slrlmfeMDT;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMDT")
    public void setSlrlmfeMDT(String slrlmfeMDT) {
        this.slrlmfeMDT = slrlmfeMDT;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeMDT(String slrlmfeMDT) {
        this.slrlmfeMDT = slrlmfeMDT;
        return this;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMinCharge")
    public Double getSlrlmfeMinCharge() {
        return slrlmfeMinCharge;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("slrlmfeMinCharge")
    public void setSlrlmfeMinCharge(Double slrlmfeMinCharge) {
        this.slrlmfeMinCharge = slrlmfeMinCharge;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withSlrlmfeMinCharge(Double slrlmfeMinCharge) {
        this.slrlmfeMinCharge = slrlmfeMinCharge;
        return this;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMaxCharge")
    public Double getCriteriaSlrlmfeMaxCharge() {
        return criteriaSlrlmfeMaxCharge;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMaxCharge")
    public void setCriteriaSlrlmfeMaxCharge(Double criteriaSlrlmfeMaxCharge) {
        this.criteriaSlrlmfeMaxCharge = criteriaSlrlmfeMaxCharge;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeMaxCharge(Double criteriaSlrlmfeMaxCharge) {
        this.criteriaSlrlmfeMaxCharge = criteriaSlrlmfeMaxCharge;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMDT")
    public String getCriteriaSlrlmfeMDT() {
        return criteriaSlrlmfeMDT;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SLRLMFE_M_D_T
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMDT")
    public void setCriteriaSlrlmfeMDT(String criteriaSlrlmfeMDT) {
        this.criteriaSlrlmfeMDT = criteriaSlrlmfeMDT;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeMDT(String criteriaSlrlmfeMDT) {
        this.criteriaSlrlmfeMDT = criteriaSlrlmfeMDT;
        return this;
    }

    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeBaseRate")
    public Double getCriteriaSlrlmfeBaseRate() {
        return criteriaSlrlmfeBaseRate;
    }

    /**
     * Base Rate
     * <p>
     * Lineage reference object : SLRLMFE_BASE_RATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeBaseRate")
    public void setCriteriaSlrlmfeBaseRate(Double criteriaSlrlmfeBaseRate) {
        this.criteriaSlrlmfeBaseRate = criteriaSlrlmfeBaseRate;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeBaseRate(Double criteriaSlrlmfeBaseRate) {
        this.criteriaSlrlmfeBaseRate = criteriaSlrlmfeBaseRate;
        return this;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMinCharge")
    public Double getCriteriaSlrlmfeMinCharge() {
        return criteriaSlrlmfeMinCharge;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SLRLMFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeMinCharge")
    public void setCriteriaSlrlmfeMinCharge(Double criteriaSlrlmfeMinCharge) {
        this.criteriaSlrlmfeMinCharge = criteriaSlrlmfeMinCharge;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeMinCharge(Double criteriaSlrlmfeMinCharge) {
        this.criteriaSlrlmfeMinCharge = criteriaSlrlmfeMinCharge;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeRateCode")
    public String getCriteriaSlrlmfeRateCode() {
        return criteriaSlrlmfeRateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SLRLMFE_RATE_CODE, Lookup lineage reference object : stvrrcd
     * (Required)
     * 
     */
    @JsonProperty("criteria.slrlmfeRateCode")
    public void setCriteriaSlrlmfeRateCode(String criteriaSlrlmfeRateCode) {
        this.criteriaSlrlmfeRateCode = criteriaSlrlmfeRateCode;
    }

    public RoomMealPhoneRateCodeRules100PutRequest withCriteriaSlrlmfeRateCode(String criteriaSlrlmfeRateCode) {
        this.criteriaSlrlmfeRateCode = criteriaSlrlmfeRateCode;
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

    public RoomMealPhoneRateCodeRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomMealPhoneRateCodeRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSlrlmfeActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeActivityDate == null)?"<null>":this.criteriaSlrlmfeActivityDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("slrlmfeBaseRate");
        sb.append('=');
        sb.append(((this.slrlmfeBaseRate == null)?"<null>":this.slrlmfeBaseRate));
        sb.append(',');
        sb.append("slrlmfeDetailCode");
        sb.append('=');
        sb.append(((this.slrlmfeDetailCode == null)?"<null>":this.slrlmfeDetailCode));
        sb.append(',');
        sb.append("criteriaSlrlmfeDetailCode");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeDetailCode == null)?"<null>":this.criteriaSlrlmfeDetailCode));
        sb.append(',');
        sb.append("slrlmfeRateCode");
        sb.append('=');
        sb.append(((this.slrlmfeRateCode == null)?"<null>":this.slrlmfeRateCode));
        sb.append(',');
        sb.append("slrlmfeMaxCharge");
        sb.append('=');
        sb.append(((this.slrlmfeMaxCharge == null)?"<null>":this.slrlmfeMaxCharge));
        sb.append(',');
        sb.append("slrlmfeMDT");
        sb.append('=');
        sb.append(((this.slrlmfeMDT == null)?"<null>":this.slrlmfeMDT));
        sb.append(',');
        sb.append("slrlmfeMinCharge");
        sb.append('=');
        sb.append(((this.slrlmfeMinCharge == null)?"<null>":this.slrlmfeMinCharge));
        sb.append(',');
        sb.append("criteriaSlrlmfeMaxCharge");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeMaxCharge == null)?"<null>":this.criteriaSlrlmfeMaxCharge));
        sb.append(',');
        sb.append("criteriaSlrlmfeMDT");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeMDT == null)?"<null>":this.criteriaSlrlmfeMDT));
        sb.append(',');
        sb.append("criteriaSlrlmfeBaseRate");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeBaseRate == null)?"<null>":this.criteriaSlrlmfeBaseRate));
        sb.append(',');
        sb.append("criteriaSlrlmfeMinCharge");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeMinCharge == null)?"<null>":this.criteriaSlrlmfeMinCharge));
        sb.append(',');
        sb.append("criteriaSlrlmfeRateCode");
        sb.append('=');
        sb.append(((this.criteriaSlrlmfeRateCode == null)?"<null>":this.criteriaSlrlmfeRateCode));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.slrlmfeBaseRate == null)? 0 :this.slrlmfeBaseRate.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeBaseRate == null)? 0 :this.criteriaSlrlmfeBaseRate.hashCode()));
        result = ((result* 31)+((this.slrlmfeDetailCode == null)? 0 :this.slrlmfeDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeActivityDate == null)? 0 :this.criteriaSlrlmfeActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeMaxCharge == null)? 0 :this.criteriaSlrlmfeMaxCharge.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeRateCode == null)? 0 :this.criteriaSlrlmfeRateCode.hashCode()));
        result = ((result* 31)+((this.slrlmfeRateCode == null)? 0 :this.slrlmfeRateCode.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeMDT == null)? 0 :this.criteriaSlrlmfeMDT.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeMinCharge == null)? 0 :this.criteriaSlrlmfeMinCharge.hashCode()));
        result = ((result* 31)+((this.criteriaSlrlmfeDetailCode == null)? 0 :this.criteriaSlrlmfeDetailCode.hashCode()));
        result = ((result* 31)+((this.slrlmfeMaxCharge == null)? 0 :this.slrlmfeMaxCharge.hashCode()));
        result = ((result* 31)+((this.slrlmfeMDT == null)? 0 :this.slrlmfeMDT.hashCode()));
        result = ((result* 31)+((this.slrlmfeMinCharge == null)? 0 :this.slrlmfeMinCharge.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomMealPhoneRateCodeRules100PutRequest) == false) {
            return false;
        }
        RoomMealPhoneRateCodeRules100PutRequest rhs = ((RoomMealPhoneRateCodeRules100PutRequest) other);
        return ((((((((((((((((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode)))&&((this.slrlmfeBaseRate == rhs.slrlmfeBaseRate)||((this.slrlmfeBaseRate!= null)&&this.slrlmfeBaseRate.equals(rhs.slrlmfeBaseRate))))&&((this.criteriaSlrlmfeBaseRate == rhs.criteriaSlrlmfeBaseRate)||((this.criteriaSlrlmfeBaseRate!= null)&&this.criteriaSlrlmfeBaseRate.equals(rhs.criteriaSlrlmfeBaseRate))))&&((this.slrlmfeDetailCode == rhs.slrlmfeDetailCode)||((this.slrlmfeDetailCode!= null)&&this.slrlmfeDetailCode.equals(rhs.slrlmfeDetailCode))))&&((this.criteriaSlrlmfeActivityDate == rhs.criteriaSlrlmfeActivityDate)||((this.criteriaSlrlmfeActivityDate!= null)&&this.criteriaSlrlmfeActivityDate.equals(rhs.criteriaSlrlmfeActivityDate))))&&((this.criteriaSlrlmfeMaxCharge == rhs.criteriaSlrlmfeMaxCharge)||((this.criteriaSlrlmfeMaxCharge!= null)&&this.criteriaSlrlmfeMaxCharge.equals(rhs.criteriaSlrlmfeMaxCharge))))&&((this.criteriaSlrlmfeRateCode == rhs.criteriaSlrlmfeRateCode)||((this.criteriaSlrlmfeRateCode!= null)&&this.criteriaSlrlmfeRateCode.equals(rhs.criteriaSlrlmfeRateCode))))&&((this.slrlmfeRateCode == rhs.slrlmfeRateCode)||((this.slrlmfeRateCode!= null)&&this.slrlmfeRateCode.equals(rhs.slrlmfeRateCode))))&&((this.criteriaSlrlmfeMDT == rhs.criteriaSlrlmfeMDT)||((this.criteriaSlrlmfeMDT!= null)&&this.criteriaSlrlmfeMDT.equals(rhs.criteriaSlrlmfeMDT))))&&((this.criteriaSlrlmfeMinCharge == rhs.criteriaSlrlmfeMinCharge)||((this.criteriaSlrlmfeMinCharge!= null)&&this.criteriaSlrlmfeMinCharge.equals(rhs.criteriaSlrlmfeMinCharge))))&&((this.criteriaSlrlmfeDetailCode == rhs.criteriaSlrlmfeDetailCode)||((this.criteriaSlrlmfeDetailCode!= null)&&this.criteriaSlrlmfeDetailCode.equals(rhs.criteriaSlrlmfeDetailCode))))&&((this.slrlmfeMaxCharge == rhs.slrlmfeMaxCharge)||((this.slrlmfeMaxCharge!= null)&&this.slrlmfeMaxCharge.equals(rhs.slrlmfeMaxCharge))))&&((this.slrlmfeMDT == rhs.slrlmfeMDT)||((this.slrlmfeMDT!= null)&&this.slrlmfeMDT.equals(rhs.slrlmfeMDT))))&&((this.slrlmfeMinCharge == rhs.slrlmfeMinCharge)||((this.slrlmfeMinCharge!= null)&&this.slrlmfeMinCharge.equals(rhs.slrlmfeMinCharge))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
