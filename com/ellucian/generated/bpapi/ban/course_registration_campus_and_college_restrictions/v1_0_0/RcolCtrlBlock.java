
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
    "scrrcolTermCodeTo",
    "scrrcolCollInd",
    "rcolCtrlEndcopy",
    "scrrcolTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class RcolCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcolTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrcolTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrcolTermCodeTo;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcolCollInd")
    @JsonPropertyDescription("Lineage reference object : scrrcolCollInd")
    private String scrrcolCollInd;
    /**
     * Lineage reference object : rcolCtrlEndcopy
     * 
     */
    @JsonProperty("rcolCtrlEndcopy")
    @JsonPropertyDescription("Lineage reference object : rcolCtrlEndcopy")
    private String rcolCtrlEndcopy;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcolTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrcolTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrcolTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcolTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeTo")
    public String getScrrcolTermCodeTo() {
        return scrrcolTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrcolTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeTo")
    public void setScrrcolTermCodeTo(String scrrcolTermCodeTo) {
        this.scrrcolTermCodeTo = scrrcolTermCodeTo;
    }

    public RcolCtrlBlock withScrrcolTermCodeTo(String scrrcolTermCodeTo) {
        this.scrrcolTermCodeTo = scrrcolTermCodeTo;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcolCollInd")
    public String getScrrcolCollInd() {
        return scrrcolCollInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("scrrcolCollInd")
    public void setScrrcolCollInd(String scrrcolCollInd) {
        this.scrrcolCollInd = scrrcolCollInd;
    }

    public RcolCtrlBlock withScrrcolCollInd(String scrrcolCollInd) {
        this.scrrcolCollInd = scrrcolCollInd;
        return this;
    }

    /**
     * Lineage reference object : rcolCtrlEndcopy
     * 
     */
    @JsonProperty("rcolCtrlEndcopy")
    public String getRcolCtrlEndcopy() {
        return rcolCtrlEndcopy;
    }

    /**
     * Lineage reference object : rcolCtrlEndcopy
     * 
     */
    @JsonProperty("rcolCtrlEndcopy")
    public void setRcolCtrlEndcopy(String rcolCtrlEndcopy) {
        this.rcolCtrlEndcopy = rcolCtrlEndcopy;
    }

    public RcolCtrlBlock withRcolCtrlEndcopy(String rcolCtrlEndcopy) {
        this.rcolCtrlEndcopy = rcolCtrlEndcopy;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcolTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeFrom")
    public String getScrrcolTermCodeFrom() {
        return scrrcolTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrcolTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrcolTermCodeFrom")
    public void setScrrcolTermCodeFrom(String scrrcolTermCodeFrom) {
        this.scrrcolTermCodeFrom = scrrcolTermCodeFrom;
    }

    public RcolCtrlBlock withScrrcolTermCodeFrom(String scrrcolTermCodeFrom) {
        this.scrrcolTermCodeFrom = scrrcolTermCodeFrom;
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

    public RcolCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RcolCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrcolTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrcolTermCodeTo == null)?"<null>":this.scrrcolTermCodeTo));
        sb.append(',');
        sb.append("scrrcolCollInd");
        sb.append('=');
        sb.append(((this.scrrcolCollInd == null)?"<null>":this.scrrcolCollInd));
        sb.append(',');
        sb.append("rcolCtrlEndcopy");
        sb.append('=');
        sb.append(((this.rcolCtrlEndcopy == null)?"<null>":this.rcolCtrlEndcopy));
        sb.append(',');
        sb.append("scrrcolTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrcolTermCodeFrom == null)?"<null>":this.scrrcolTermCodeFrom));
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
        result = ((result* 31)+((this.scrrcolTermCodeTo == null)? 0 :this.scrrcolTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scrrcolCollInd == null)? 0 :this.scrrcolCollInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rcolCtrlEndcopy == null)? 0 :this.rcolCtrlEndcopy.hashCode()));
        result = ((result* 31)+((this.scrrcolTermCodeFrom == null)? 0 :this.scrrcolTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RcolCtrlBlock) == false) {
            return false;
        }
        RcolCtrlBlock rhs = ((RcolCtrlBlock) other);
        return ((((((this.scrrcolTermCodeTo == rhs.scrrcolTermCodeTo)||((this.scrrcolTermCodeTo!= null)&&this.scrrcolTermCodeTo.equals(rhs.scrrcolTermCodeTo)))&&((this.scrrcolCollInd == rhs.scrrcolCollInd)||((this.scrrcolCollInd!= null)&&this.scrrcolCollInd.equals(rhs.scrrcolCollInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rcolCtrlEndcopy == rhs.rcolCtrlEndcopy)||((this.rcolCtrlEndcopy!= null)&&this.rcolCtrlEndcopy.equals(rhs.rcolCtrlEndcopy))))&&((this.scrrcolTermCodeFrom == rhs.scrrcolTermCodeFrom)||((this.scrrcolTermCodeFrom!= null)&&this.scrrcolTermCodeFrom.equals(rhs.scrrcolTermCodeFrom))));
    }

}
