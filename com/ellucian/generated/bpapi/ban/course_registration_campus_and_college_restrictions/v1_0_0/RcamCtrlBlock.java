
package com.ellucian.generated.bpapi.ban.course_registration_campus_and_college_restrictions.v1_0_0;

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
    "scrrcamTermCodeTo",
    "scrrcamTermCodeFrom",
    "scrrcamCampInd"
})
@Generated("jsonschema2pojo")
public class RcamCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcamTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrcamTermCodeTo, Lookup lineage reference object : stvterm")
    private Object scrrcamTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcamTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrcamTermCodeFrom, Lookup lineage reference object : stvterm")
    private Object scrrcamTermCodeFrom;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcamCampInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcamCampInd")
    @JsonPropertyDescription("Lineage reference object : scrrcamCampInd")
    private Object scrrcamCampInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcamTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeTo")
    public Object getScrrcamTermCodeTo() {
        return scrrcamTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcamTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeTo")
    public void setScrrcamTermCodeTo(Object scrrcamTermCodeTo) {
        this.scrrcamTermCodeTo = scrrcamTermCodeTo;
    }

    public RcamCtrlBlock withScrrcamTermCodeTo(Object scrrcamTermCodeTo) {
        this.scrrcamTermCodeTo = scrrcamTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcamTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeFrom")
    public Object getScrrcamTermCodeFrom() {
        return scrrcamTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcamTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcamTermCodeFrom")
    public void setScrrcamTermCodeFrom(Object scrrcamTermCodeFrom) {
        this.scrrcamTermCodeFrom = scrrcamTermCodeFrom;
    }

    public RcamCtrlBlock withScrrcamTermCodeFrom(Object scrrcamTermCodeFrom) {
        this.scrrcamTermCodeFrom = scrrcamTermCodeFrom;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcamCampInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcamCampInd")
    public Object getScrrcamCampInd() {
        return scrrcamCampInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcamCampInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcamCampInd")
    public void setScrrcamCampInd(Object scrrcamCampInd) {
        this.scrrcamCampInd = scrrcamCampInd;
    }

    public RcamCtrlBlock withScrrcamCampInd(Object scrrcamCampInd) {
        this.scrrcamCampInd = scrrcamCampInd;
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

    public RcamCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RcamCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrcamTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrcamTermCodeTo == null)?"<null>":this.scrrcamTermCodeTo));
        sb.append(',');
        sb.append("scrrcamTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrcamTermCodeFrom == null)?"<null>":this.scrrcamTermCodeFrom));
        sb.append(',');
        sb.append("scrrcamCampInd");
        sb.append('=');
        sb.append(((this.scrrcamCampInd == null)?"<null>":this.scrrcamCampInd));
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
        result = ((result* 31)+((this.scrrcamTermCodeTo == null)? 0 :this.scrrcamTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrcamTermCodeFrom == null)? 0 :this.scrrcamTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.scrrcamCampInd == null)? 0 :this.scrrcamCampInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RcamCtrlBlock) == false) {
            return false;
        }
        RcamCtrlBlock rhs = ((RcamCtrlBlock) other);
        return (((((this.scrrcamTermCodeTo == rhs.scrrcamTermCodeTo)||((this.scrrcamTermCodeTo!= null)&&this.scrrcamTermCodeTo.equals(rhs.scrrcamTermCodeTo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrcamTermCodeFrom == rhs.scrrcamTermCodeFrom)||((this.scrrcamTermCodeFrom!= null)&&this.scrrcamTermCodeFrom.equals(rhs.scrrcamTermCodeFrom))))&&((this.scrrcamCampInd == rhs.scrrcamCampInd)||((this.scrrcamCampInd!= null)&&this.scrrcamCampInd.equals(rhs.scrrcamCampInd))));
    }

}
