
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
    "rdegCtrlEndcopy",
    "scrrdegTermCodeTo",
    "scrrdegTermCodeFrom",
    "scrrdegDegcInd"
})
@Generated("jsonschema2pojo")
public class RdegCtrlBlock {

    /**
     * Lineage reference object : rdegCtrlEndcopy
     * 
     */
    @JsonProperty("rdegCtrlEndcopy")
    @JsonPropertyDescription("Lineage reference object : rdegCtrlEndcopy")
    private Object rdegCtrlEndcopy;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdegTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrdegTermCodeTo, Lookup lineage reference object : stvterm")
    private Object scrrdegTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdegTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrdegTermCodeFrom, Lookup lineage reference object : stvterm")
    private Object scrrdegTermCodeFrom;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("scrrdegDegcInd")
    @JsonPropertyDescription("Lineage reference object : scrrdegDegcInd")
    private Object scrrdegDegcInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : rdegCtrlEndcopy
     * 
     */
    @JsonProperty("rdegCtrlEndcopy")
    public Object getRdegCtrlEndcopy() {
        return rdegCtrlEndcopy;
    }

    /**
     * Lineage reference object : rdegCtrlEndcopy
     * 
     */
    @JsonProperty("rdegCtrlEndcopy")
    public void setRdegCtrlEndcopy(Object rdegCtrlEndcopy) {
        this.rdegCtrlEndcopy = rdegCtrlEndcopy;
    }

    public RdegCtrlBlock withRdegCtrlEndcopy(Object rdegCtrlEndcopy) {
        this.rdegCtrlEndcopy = rdegCtrlEndcopy;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdegTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeTo")
    public Object getScrrdegTermCodeTo() {
        return scrrdegTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdegTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeTo")
    public void setScrrdegTermCodeTo(Object scrrdegTermCodeTo) {
        this.scrrdegTermCodeTo = scrrdegTermCodeTo;
    }

    public RdegCtrlBlock withScrrdegTermCodeTo(Object scrrdegTermCodeTo) {
        this.scrrdegTermCodeTo = scrrdegTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdegTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeFrom")
    public Object getScrrdegTermCodeFrom() {
        return scrrdegTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdegTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdegTermCodeFrom")
    public void setScrrdegTermCodeFrom(Object scrrdegTermCodeFrom) {
        this.scrrdegTermCodeFrom = scrrdegTermCodeFrom;
    }

    public RdegCtrlBlock withScrrdegTermCodeFrom(Object scrrdegTermCodeFrom) {
        this.scrrdegTermCodeFrom = scrrdegTermCodeFrom;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("scrrdegDegcInd")
    public Object getScrrdegDegcInd() {
        return scrrdegDegcInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("scrrdegDegcInd")
    public void setScrrdegDegcInd(Object scrrdegDegcInd) {
        this.scrrdegDegcInd = scrrdegDegcInd;
    }

    public RdegCtrlBlock withScrrdegDegcInd(Object scrrdegDegcInd) {
        this.scrrdegDegcInd = scrrdegDegcInd;
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

    public RdegCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RdegCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rdegCtrlEndcopy");
        sb.append('=');
        sb.append(((this.rdegCtrlEndcopy == null)?"<null>":this.rdegCtrlEndcopy));
        sb.append(',');
        sb.append("scrrdegTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrdegTermCodeTo == null)?"<null>":this.scrrdegTermCodeTo));
        sb.append(',');
        sb.append("scrrdegTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrdegTermCodeFrom == null)?"<null>":this.scrrdegTermCodeFrom));
        sb.append(',');
        sb.append("scrrdegDegcInd");
        sb.append('=');
        sb.append(((this.scrrdegDegcInd == null)?"<null>":this.scrrdegDegcInd));
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
        result = ((result* 31)+((this.scrrdegDegcInd == null)? 0 :this.scrrdegDegcInd.hashCode()));
        result = ((result* 31)+((this.rdegCtrlEndcopy == null)? 0 :this.rdegCtrlEndcopy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrdegTermCodeTo == null)? 0 :this.scrrdegTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scrrdegTermCodeFrom == null)? 0 :this.scrrdegTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RdegCtrlBlock) == false) {
            return false;
        }
        RdegCtrlBlock rhs = ((RdegCtrlBlock) other);
        return ((((((this.scrrdegDegcInd == rhs.scrrdegDegcInd)||((this.scrrdegDegcInd!= null)&&this.scrrdegDegcInd.equals(rhs.scrrdegDegcInd)))&&((this.rdegCtrlEndcopy == rhs.rdegCtrlEndcopy)||((this.rdegCtrlEndcopy!= null)&&this.rdegCtrlEndcopy.equals(rhs.rdegCtrlEndcopy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrdegTermCodeTo == rhs.scrrdegTermCodeTo)||((this.scrrdegTermCodeTo!= null)&&this.scrrdegTermCodeTo.equals(rhs.scrrdegTermCodeTo))))&&((this.scrrdegTermCodeFrom == rhs.scrrdegTermCodeFrom)||((this.scrrdegTermCodeFrom!= null)&&this.scrrdegTermCodeFrom.equals(rhs.scrrdegTermCodeFrom))));
    }

}
