
package com.ellucian.generated.bpapi.ban.course_registration_class_and_level_restrictions.v1_0_0;

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
    "scrrlvlTermCodeFrom",
    "scrrlvlLevlInd",
    "scrrlvlTermCodeTo"
})
@Generated("jsonschema2pojo")
public class RlvlCtrlBlock {

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrlvlTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrlvlTermCodeFrom;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("scrrlvlLevlInd")
    @JsonPropertyDescription("Lineage reference object : scrrlvlLevlInd")
    private String scrrlvlLevlInd;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrlvlTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrlvlTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeFrom")
    public String getScrrlvlTermCodeFrom() {
        return scrrlvlTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeFrom")
    public void setScrrlvlTermCodeFrom(String scrrlvlTermCodeFrom) {
        this.scrrlvlTermCodeFrom = scrrlvlTermCodeFrom;
    }

    public RlvlCtrlBlock withScrrlvlTermCodeFrom(String scrrlvlTermCodeFrom) {
        this.scrrlvlTermCodeFrom = scrrlvlTermCodeFrom;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("scrrlvlLevlInd")
    public String getScrrlvlLevlInd() {
        return scrrlvlLevlInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("scrrlvlLevlInd")
    public void setScrrlvlLevlInd(String scrrlvlLevlInd) {
        this.scrrlvlLevlInd = scrrlvlLevlInd;
    }

    public RlvlCtrlBlock withScrrlvlLevlInd(String scrrlvlLevlInd) {
        this.scrrlvlLevlInd = scrrlvlLevlInd;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeTo")
    public String getScrrlvlTermCodeTo() {
        return scrrlvlTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrlvlTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrlvlTermCodeTo")
    public void setScrrlvlTermCodeTo(String scrrlvlTermCodeTo) {
        this.scrrlvlTermCodeTo = scrrlvlTermCodeTo;
    }

    public RlvlCtrlBlock withScrrlvlTermCodeTo(String scrrlvlTermCodeTo) {
        this.scrrlvlTermCodeTo = scrrlvlTermCodeTo;
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

    public RlvlCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RlvlCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrlvlTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrlvlTermCodeFrom == null)?"<null>":this.scrrlvlTermCodeFrom));
        sb.append(',');
        sb.append("scrrlvlLevlInd");
        sb.append('=');
        sb.append(((this.scrrlvlLevlInd == null)?"<null>":this.scrrlvlLevlInd));
        sb.append(',');
        sb.append("scrrlvlTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrlvlTermCodeTo == null)?"<null>":this.scrrlvlTermCodeTo));
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
        result = ((result* 31)+((this.scrrlvlTermCodeFrom == null)? 0 :this.scrrlvlTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrlvlLevlInd == null)? 0 :this.scrrlvlLevlInd.hashCode()));
        result = ((result* 31)+((this.scrrlvlTermCodeTo == null)? 0 :this.scrrlvlTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RlvlCtrlBlock) == false) {
            return false;
        }
        RlvlCtrlBlock rhs = ((RlvlCtrlBlock) other);
        return (((((this.scrrlvlTermCodeFrom == rhs.scrrlvlTermCodeFrom)||((this.scrrlvlTermCodeFrom!= null)&&this.scrrlvlTermCodeFrom.equals(rhs.scrrlvlTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrlvlLevlInd == rhs.scrrlvlLevlInd)||((this.scrrlvlLevlInd!= null)&&this.scrrlvlLevlInd.equals(rhs.scrrlvlLevlInd))))&&((this.scrrlvlTermCodeTo == rhs.scrrlvlTermCodeTo)||((this.scrrlvlTermCodeTo!= null)&&this.scrrlvlTermCodeTo.equals(rhs.scrrlvlTermCodeTo))));
    }

}
