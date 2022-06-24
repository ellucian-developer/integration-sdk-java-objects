
package com.ellucian.generated.bpapi.ban.course_registration_degree_and_program_restrictions.v1_0_0;

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
    "scrrprgTermCodeTo",
    "scrrprgTermCodeFrom",
    "scrrprgProgramInd",
    "rprgCtrlEndcopy"
})
@Generated("jsonschema2pojo")
public class RprgCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrprgTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrprgTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrprgTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrprgTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrprgTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrprgTermCodeFrom;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("scrrprgProgramInd")
    @JsonPropertyDescription("Lineage reference object : scrrprgProgramInd")
    private String scrrprgProgramInd;
    /**
     * Lineage reference object : rprgCtrlEndcopy
     * 
     */
    @JsonProperty("rprgCtrlEndcopy")
    @JsonPropertyDescription("Lineage reference object : rprgCtrlEndcopy")
    private String rprgCtrlEndcopy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrprgTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeTo")
    public String getScrrprgTermCodeTo() {
        return scrrprgTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrprgTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeTo")
    public void setScrrprgTermCodeTo(String scrrprgTermCodeTo) {
        this.scrrprgTermCodeTo = scrrprgTermCodeTo;
    }

    public RprgCtrlBlock withScrrprgTermCodeTo(String scrrprgTermCodeTo) {
        this.scrrprgTermCodeTo = scrrprgTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrprgTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeFrom")
    public String getScrrprgTermCodeFrom() {
        return scrrprgTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrprgTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrprgTermCodeFrom")
    public void setScrrprgTermCodeFrom(String scrrprgTermCodeFrom) {
        this.scrrprgTermCodeFrom = scrrprgTermCodeFrom;
    }

    public RprgCtrlBlock withScrrprgTermCodeFrom(String scrrprgTermCodeFrom) {
        this.scrrprgTermCodeFrom = scrrprgTermCodeFrom;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("scrrprgProgramInd")
    public String getScrrprgProgramInd() {
        return scrrprgProgramInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("scrrprgProgramInd")
    public void setScrrprgProgramInd(String scrrprgProgramInd) {
        this.scrrprgProgramInd = scrrprgProgramInd;
    }

    public RprgCtrlBlock withScrrprgProgramInd(String scrrprgProgramInd) {
        this.scrrprgProgramInd = scrrprgProgramInd;
        return this;
    }

    /**
     * Lineage reference object : rprgCtrlEndcopy
     * 
     */
    @JsonProperty("rprgCtrlEndcopy")
    public String getRprgCtrlEndcopy() {
        return rprgCtrlEndcopy;
    }

    /**
     * Lineage reference object : rprgCtrlEndcopy
     * 
     */
    @JsonProperty("rprgCtrlEndcopy")
    public void setRprgCtrlEndcopy(String rprgCtrlEndcopy) {
        this.rprgCtrlEndcopy = rprgCtrlEndcopy;
    }

    public RprgCtrlBlock withRprgCtrlEndcopy(String rprgCtrlEndcopy) {
        this.rprgCtrlEndcopy = rprgCtrlEndcopy;
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

    public RprgCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RprgCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrprgTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrprgTermCodeTo == null)?"<null>":this.scrrprgTermCodeTo));
        sb.append(',');
        sb.append("scrrprgTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrprgTermCodeFrom == null)?"<null>":this.scrrprgTermCodeFrom));
        sb.append(',');
        sb.append("scrrprgProgramInd");
        sb.append('=');
        sb.append(((this.scrrprgProgramInd == null)?"<null>":this.scrrprgProgramInd));
        sb.append(',');
        sb.append("rprgCtrlEndcopy");
        sb.append('=');
        sb.append(((this.rprgCtrlEndcopy == null)?"<null>":this.rprgCtrlEndcopy));
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
        result = ((result* 31)+((this.scrrprgTermCodeTo == null)? 0 :this.scrrprgTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrprgTermCodeFrom == null)? 0 :this.scrrprgTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.scrrprgProgramInd == null)? 0 :this.scrrprgProgramInd.hashCode()));
        result = ((result* 31)+((this.rprgCtrlEndcopy == null)? 0 :this.rprgCtrlEndcopy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RprgCtrlBlock) == false) {
            return false;
        }
        RprgCtrlBlock rhs = ((RprgCtrlBlock) other);
        return ((((((this.scrrprgTermCodeTo == rhs.scrrprgTermCodeTo)||((this.scrrprgTermCodeTo!= null)&&this.scrrprgTermCodeTo.equals(rhs.scrrprgTermCodeTo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrprgTermCodeFrom == rhs.scrrprgTermCodeFrom)||((this.scrrprgTermCodeFrom!= null)&&this.scrrprgTermCodeFrom.equals(rhs.scrrprgTermCodeFrom))))&&((this.scrrprgProgramInd == rhs.scrrprgProgramInd)||((this.scrrprgProgramInd!= null)&&this.scrrprgProgramInd.equals(rhs.scrrprgProgramInd))))&&((this.rprgCtrlEndcopy == rhs.rprgCtrlEndcopy)||((this.rprgCtrlEndcopy!= null)&&this.rprgCtrlEndcopy.equals(rhs.rprgCtrlEndcopy))));
    }

}
