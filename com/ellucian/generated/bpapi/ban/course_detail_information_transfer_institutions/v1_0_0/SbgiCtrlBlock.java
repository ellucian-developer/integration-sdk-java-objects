
package com.ellucian.generated.bpapi.ban.course_detail_information_transfer_institutions.v1_0_0;

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
    "scrsbgiTermCodeTo",
    "scrsbgiTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class SbgiCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeTo
     * 
     */
    @JsonProperty("scrsbgiTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrsbgiTermCodeTo")
    private String scrsbgiTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeFrom
     * 
     */
    @JsonProperty("scrsbgiTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrsbgiTermCodeFrom")
    private String scrsbgiTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeTo
     * 
     */
    @JsonProperty("scrsbgiTermCodeTo")
    public String getScrsbgiTermCodeTo() {
        return scrsbgiTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeTo
     * 
     */
    @JsonProperty("scrsbgiTermCodeTo")
    public void setScrsbgiTermCodeTo(String scrsbgiTermCodeTo) {
        this.scrsbgiTermCodeTo = scrsbgiTermCodeTo;
    }

    public SbgiCtrlBlock withScrsbgiTermCodeTo(String scrsbgiTermCodeTo) {
        this.scrsbgiTermCodeTo = scrsbgiTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeFrom
     * 
     */
    @JsonProperty("scrsbgiTermCodeFrom")
    public String getScrsbgiTermCodeFrom() {
        return scrsbgiTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrsbgiTermCodeFrom
     * 
     */
    @JsonProperty("scrsbgiTermCodeFrom")
    public void setScrsbgiTermCodeFrom(String scrsbgiTermCodeFrom) {
        this.scrsbgiTermCodeFrom = scrsbgiTermCodeFrom;
    }

    public SbgiCtrlBlock withScrsbgiTermCodeFrom(String scrsbgiTermCodeFrom) {
        this.scrsbgiTermCodeFrom = scrsbgiTermCodeFrom;
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

    public SbgiCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SbgiCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrsbgiTermCodeTo");
        sb.append('=');
        sb.append(((this.scrsbgiTermCodeTo == null)?"<null>":this.scrsbgiTermCodeTo));
        sb.append(',');
        sb.append("scrsbgiTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrsbgiTermCodeFrom == null)?"<null>":this.scrsbgiTermCodeFrom));
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
        result = ((result* 31)+((this.scrsbgiTermCodeFrom == null)? 0 :this.scrsbgiTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrsbgiTermCodeTo == null)? 0 :this.scrsbgiTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SbgiCtrlBlock) == false) {
            return false;
        }
        SbgiCtrlBlock rhs = ((SbgiCtrlBlock) other);
        return ((((this.scrsbgiTermCodeFrom == rhs.scrsbgiTermCodeFrom)||((this.scrsbgiTermCodeFrom!= null)&&this.scrsbgiTermCodeFrom.equals(rhs.scrsbgiTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrsbgiTermCodeTo == rhs.scrsbgiTermCodeTo)||((this.scrsbgiTermCodeTo!= null)&&this.scrsbgiTermCodeTo.equals(rhs.scrsbgiTermCodeTo))));
    }

}
