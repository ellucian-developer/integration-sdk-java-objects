
package com.ellucian.generated.bpapi.ban.block_schedule_control.v1_0_0;

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
    "ssbsectCreditHrs",
    "keyblocTermCode",
    "ssbsectGmodCode",
    "ssbsectBillHrs",
    "keyblocBlckCode",
    "crn"
})
@Generated("jsonschema2pojo")
public class BlockScheduleControl100PostRequest {

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    private Double ssbsectCreditHrs;
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
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String ssbsectGmodCode;
    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    private Double ssbsectBillHrs;
    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    @JsonPropertyDescription("Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck")
    private Object keyblocBlckCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_CRN")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public Double getSsbsectCreditHrs() {
        return ssbsectCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public void setSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
    }

    public BlockScheduleControl100PostRequest withSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
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

    public BlockScheduleControl100PostRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public String getSsbsectGmodCode() {
        return ssbsectGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public void setSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
    }

    public BlockScheduleControl100PostRequest withSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
        return this;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public Double getSsbsectBillHrs() {
        return ssbsectBillHrs;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public void setSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
    }

    public BlockScheduleControl100PostRequest withSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public Object getKeyblocBlckCode() {
        return keyblocBlckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public void setKeyblocBlckCode(Object keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
    }

    public BlockScheduleControl100PostRequest withKeyblocBlckCode(Object keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public BlockScheduleControl100PostRequest withCrn(String crn) {
        this.crn = crn;
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

    public BlockScheduleControl100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleControl100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsectCreditHrs");
        sb.append('=');
        sb.append(((this.ssbsectCreditHrs == null)?"<null>":this.ssbsectCreditHrs));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("ssbsectGmodCode");
        sb.append('=');
        sb.append(((this.ssbsectGmodCode == null)?"<null>":this.ssbsectGmodCode));
        sb.append(',');
        sb.append("ssbsectBillHrs");
        sb.append('=');
        sb.append(((this.ssbsectBillHrs == null)?"<null>":this.ssbsectBillHrs));
        sb.append(',');
        sb.append("keyblocBlckCode");
        sb.append('=');
        sb.append(((this.keyblocBlckCode == null)?"<null>":this.keyblocBlckCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.ssbsectCreditHrs == null)? 0 :this.ssbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectGmodCode == null)? 0 :this.ssbsectGmodCode.hashCode()));
        result = ((result* 31)+((this.ssbsectBillHrs == null)? 0 :this.ssbsectBillHrs.hashCode()));
        result = ((result* 31)+((this.keyblocBlckCode == null)? 0 :this.keyblocBlckCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleControl100PostRequest) == false) {
            return false;
        }
        BlockScheduleControl100PostRequest rhs = ((BlockScheduleControl100PostRequest) other);
        return ((((((((this.ssbsectCreditHrs == rhs.ssbsectCreditHrs)||((this.ssbsectCreditHrs!= null)&&this.ssbsectCreditHrs.equals(rhs.ssbsectCreditHrs)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectGmodCode == rhs.ssbsectGmodCode)||((this.ssbsectGmodCode!= null)&&this.ssbsectGmodCode.equals(rhs.ssbsectGmodCode))))&&((this.ssbsectBillHrs == rhs.ssbsectBillHrs)||((this.ssbsectBillHrs!= null)&&this.ssbsectBillHrs.equals(rhs.ssbsectBillHrs))))&&((this.keyblocBlckCode == rhs.keyblocBlckCode)||((this.keyblocBlckCode!= null)&&this.keyblocBlckCode.equals(rhs.keyblocBlckCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
