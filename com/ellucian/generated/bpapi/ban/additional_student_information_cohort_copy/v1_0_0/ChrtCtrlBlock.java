
package com.ellucian.generated.bpapi.ban.additional_student_information_cohort_copy.v1_0_0;

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
    "sgrchrtTermCodeFrom",
    "sgrchrtTermCodeTo"
})
@Generated("jsonschema2pojo")
public class ChrtCtrlBlock {

    /**
     * From Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : sgrchrtTermCodeFrom, Lookup lineage reference object : stvterm")
    private Object sgrchrtTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : sgrchrtTermCodeTo, Lookup lineage reference object : stvterm")
    private Object sgrchrtTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeFrom")
    public Object getSgrchrtTermCodeFrom() {
        return sgrchrtTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeFrom")
    public void setSgrchrtTermCodeFrom(Object sgrchrtTermCodeFrom) {
        this.sgrchrtTermCodeFrom = sgrchrtTermCodeFrom;
    }

    public ChrtCtrlBlock withSgrchrtTermCodeFrom(Object sgrchrtTermCodeFrom) {
        this.sgrchrtTermCodeFrom = sgrchrtTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeTo")
    public Object getSgrchrtTermCodeTo() {
        return sgrchrtTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : sgrchrtTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrchrtTermCodeTo")
    public void setSgrchrtTermCodeTo(Object sgrchrtTermCodeTo) {
        this.sgrchrtTermCodeTo = sgrchrtTermCodeTo;
    }

    public ChrtCtrlBlock withSgrchrtTermCodeTo(Object sgrchrtTermCodeTo) {
        this.sgrchrtTermCodeTo = sgrchrtTermCodeTo;
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

    public ChrtCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChrtCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrchrtTermCodeFrom");
        sb.append('=');
        sb.append(((this.sgrchrtTermCodeFrom == null)?"<null>":this.sgrchrtTermCodeFrom));
        sb.append(',');
        sb.append("sgrchrtTermCodeTo");
        sb.append('=');
        sb.append(((this.sgrchrtTermCodeTo == null)?"<null>":this.sgrchrtTermCodeTo));
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
        result = ((result* 31)+((this.sgrchrtTermCodeFrom == null)? 0 :this.sgrchrtTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgrchrtTermCodeTo == null)? 0 :this.sgrchrtTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChrtCtrlBlock) == false) {
            return false;
        }
        ChrtCtrlBlock rhs = ((ChrtCtrlBlock) other);
        return ((((this.sgrchrtTermCodeFrom == rhs.sgrchrtTermCodeFrom)||((this.sgrchrtTermCodeFrom!= null)&&this.sgrchrtTermCodeFrom.equals(rhs.sgrchrtTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgrchrtTermCodeTo == rhs.sgrchrtTermCodeTo)||((this.sgrchrtTermCodeTo!= null)&&this.sgrchrtTermCodeTo.equals(rhs.sgrchrtTermCodeTo))));
    }

}
