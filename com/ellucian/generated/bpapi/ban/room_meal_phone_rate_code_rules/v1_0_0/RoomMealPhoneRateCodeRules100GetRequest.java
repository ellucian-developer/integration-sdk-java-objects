
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
    "slrlmfeMaxCharge",
    "slrlmfeMDT",
    "slrlmfeMinCharge",
    "keyblocTermCode",
    "slrlmfeBaseRate",
    "slrlmfeDetailCode",
    "slrlmfeRateCode",
    "slrlmfeActivityDate"
})
@Generated("jsonschema2pojo")
public class RoomMealPhoneRateCodeRules100GetRequest {

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
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
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
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("slrlmfeActivityDate")
    @JsonPropertyDescription("Lineage reference object : SLRLMFE_ACTIVITY_DATE")
    private Date slrlmfeActivityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeMaxCharge(Double slrlmfeMaxCharge) {
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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeMDT(String slrlmfeMDT) {
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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeMinCharge(Double slrlmfeMinCharge) {
        this.slrlmfeMinCharge = slrlmfeMinCharge;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public RoomMealPhoneRateCodeRules100GetRequest withKeyblocTermCode(String keyblocTermCode) {
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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeBaseRate(Double slrlmfeBaseRate) {
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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeDetailCode(String slrlmfeDetailCode) {
        this.slrlmfeDetailCode = slrlmfeDetailCode;
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

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeRateCode(String slrlmfeRateCode) {
        this.slrlmfeRateCode = slrlmfeRateCode;
        return this;
    }

    /**
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("slrlmfeActivityDate")
    public Date getSlrlmfeActivityDate() {
        return slrlmfeActivityDate;
    }

    /**
     * Lineage reference object : SLRLMFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("slrlmfeActivityDate")
    public void setSlrlmfeActivityDate(Date slrlmfeActivityDate) {
        this.slrlmfeActivityDate = slrlmfeActivityDate;
    }

    public RoomMealPhoneRateCodeRules100GetRequest withSlrlmfeActivityDate(Date slrlmfeActivityDate) {
        this.slrlmfeActivityDate = slrlmfeActivityDate;
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

    public RoomMealPhoneRateCodeRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomMealPhoneRateCodeRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("slrlmfeRateCode");
        sb.append('=');
        sb.append(((this.slrlmfeRateCode == null)?"<null>":this.slrlmfeRateCode));
        sb.append(',');
        sb.append("slrlmfeActivityDate");
        sb.append('=');
        sb.append(((this.slrlmfeActivityDate == null)?"<null>":this.slrlmfeActivityDate));
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
        result = ((result* 31)+((this.slrlmfeMaxCharge == null)? 0 :this.slrlmfeMaxCharge.hashCode()));
        result = ((result* 31)+((this.slrlmfeMDT == null)? 0 :this.slrlmfeMDT.hashCode()));
        result = ((result* 31)+((this.slrlmfeMinCharge == null)? 0 :this.slrlmfeMinCharge.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.slrlmfeBaseRate == null)? 0 :this.slrlmfeBaseRate.hashCode()));
        result = ((result* 31)+((this.slrlmfeDetailCode == null)? 0 :this.slrlmfeDetailCode.hashCode()));
        result = ((result* 31)+((this.slrlmfeRateCode == null)? 0 :this.slrlmfeRateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.slrlmfeActivityDate == null)? 0 :this.slrlmfeActivityDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomMealPhoneRateCodeRules100GetRequest) == false) {
            return false;
        }
        RoomMealPhoneRateCodeRules100GetRequest rhs = ((RoomMealPhoneRateCodeRules100GetRequest) other);
        return ((((((((((this.slrlmfeMaxCharge == rhs.slrlmfeMaxCharge)||((this.slrlmfeMaxCharge!= null)&&this.slrlmfeMaxCharge.equals(rhs.slrlmfeMaxCharge)))&&((this.slrlmfeMDT == rhs.slrlmfeMDT)||((this.slrlmfeMDT!= null)&&this.slrlmfeMDT.equals(rhs.slrlmfeMDT))))&&((this.slrlmfeMinCharge == rhs.slrlmfeMinCharge)||((this.slrlmfeMinCharge!= null)&&this.slrlmfeMinCharge.equals(rhs.slrlmfeMinCharge))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.slrlmfeBaseRate == rhs.slrlmfeBaseRate)||((this.slrlmfeBaseRate!= null)&&this.slrlmfeBaseRate.equals(rhs.slrlmfeBaseRate))))&&((this.slrlmfeDetailCode == rhs.slrlmfeDetailCode)||((this.slrlmfeDetailCode!= null)&&this.slrlmfeDetailCode.equals(rhs.slrlmfeDetailCode))))&&((this.slrlmfeRateCode == rhs.slrlmfeRateCode)||((this.slrlmfeRateCode!= null)&&this.slrlmfeRateCode.equals(rhs.slrlmfeRateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.slrlmfeActivityDate == rhs.slrlmfeActivityDate)||((this.slrlmfeActivityDate!= null)&&this.slrlmfeActivityDate.equals(rhs.slrlmfeActivityDate))));
    }

}
