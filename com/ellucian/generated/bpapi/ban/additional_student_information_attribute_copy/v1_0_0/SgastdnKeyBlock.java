
package com.ellucian.generated.bpapi.ban.additional_student_information_attribute_copy.v1_0_0;

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
    "sgastdnId",
    "sgastdnTermCodeEff",
    "sgastdnName",
    "confidInfo",
    "deceasedInd"
})
@Generated("jsonschema2pojo")
public class SgastdnKeyBlock {

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    @JsonPropertyDescription("Lineage reference object : sgastdnId")
    private Object sgastdnId;
    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm")
    private Object sgastdnTermCodeEff;
    /**
     * Lineage reference object : sgastdnName
     * 
     */
    @JsonProperty("sgastdnName")
    @JsonPropertyDescription("Lineage reference object : sgastdnName")
    private Object sgastdnName;
    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    @JsonPropertyDescription("Lineage reference object : confidInfo")
    private Object confidInfo;
    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    @JsonPropertyDescription("Lineage reference object : deceasedInd")
    private Object deceasedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public Object getSgastdnId() {
        return sgastdnId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public void setSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
    }

    public SgastdnKeyBlock withSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public Object getSgastdnTermCodeEff() {
        return sgastdnTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public void setSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
    }

    public SgastdnKeyBlock withSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : sgastdnName
     * 
     */
    @JsonProperty("sgastdnName")
    public Object getSgastdnName() {
        return sgastdnName;
    }

    /**
     * Lineage reference object : sgastdnName
     * 
     */
    @JsonProperty("sgastdnName")
    public void setSgastdnName(Object sgastdnName) {
        this.sgastdnName = sgastdnName;
    }

    public SgastdnKeyBlock withSgastdnName(Object sgastdnName) {
        this.sgastdnName = sgastdnName;
        return this;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public Object getConfidInfo() {
        return confidInfo;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public void setConfidInfo(Object confidInfo) {
        this.confidInfo = confidInfo;
    }

    public SgastdnKeyBlock withConfidInfo(Object confidInfo) {
        this.confidInfo = confidInfo;
        return this;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public Object getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public void setDeceasedInd(Object deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    public SgastdnKeyBlock withDeceasedInd(Object deceasedInd) {
        this.deceasedInd = deceasedInd;
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

    public SgastdnKeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SgastdnKeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnId");
        sb.append('=');
        sb.append(((this.sgastdnId == null)?"<null>":this.sgastdnId));
        sb.append(',');
        sb.append("sgastdnTermCodeEff");
        sb.append('=');
        sb.append(((this.sgastdnTermCodeEff == null)?"<null>":this.sgastdnTermCodeEff));
        sb.append(',');
        sb.append("sgastdnName");
        sb.append('=');
        sb.append(((this.sgastdnName == null)?"<null>":this.sgastdnName));
        sb.append(',');
        sb.append("confidInfo");
        sb.append('=');
        sb.append(((this.confidInfo == null)?"<null>":this.confidInfo));
        sb.append(',');
        sb.append("deceasedInd");
        sb.append('=');
        sb.append(((this.deceasedInd == null)?"<null>":this.deceasedInd));
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
        result = ((result* 31)+((this.sgastdnId == null)? 0 :this.sgastdnId.hashCode()));
        result = ((result* 31)+((this.sgastdnTermCodeEff == null)? 0 :this.sgastdnTermCodeEff.hashCode()));
        result = ((result* 31)+((this.sgastdnName == null)? 0 :this.sgastdnName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.confidInfo == null)? 0 :this.confidInfo.hashCode()));
        result = ((result* 31)+((this.deceasedInd == null)? 0 :this.deceasedInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SgastdnKeyBlock) == false) {
            return false;
        }
        SgastdnKeyBlock rhs = ((SgastdnKeyBlock) other);
        return (((((((this.sgastdnId == rhs.sgastdnId)||((this.sgastdnId!= null)&&this.sgastdnId.equals(rhs.sgastdnId)))&&((this.sgastdnTermCodeEff == rhs.sgastdnTermCodeEff)||((this.sgastdnTermCodeEff!= null)&&this.sgastdnTermCodeEff.equals(rhs.sgastdnTermCodeEff))))&&((this.sgastdnName == rhs.sgastdnName)||((this.sgastdnName!= null)&&this.sgastdnName.equals(rhs.sgastdnName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confidInfo == rhs.confidInfo)||((this.confidInfo!= null)&&this.confidInfo.equals(rhs.confidInfo))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))));
    }

}
