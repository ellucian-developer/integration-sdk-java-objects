
package com.ellucian.generated.bpapi.ban.course_detail_information_degree_attributes.v1_0_0;

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
    "scrattrTermCodeFrom",
    "scrattrTermCodeTo"
})
@Generated("jsonschema2pojo")
public class AttrCtrlBlock {

    /**
     * From Term
     * <p>
     * Lineage reference object : scrattrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrattrTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrattrTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrattrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrattrTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrattrTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : scrattrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeFrom")
    public String getScrattrTermCodeFrom() {
        return scrattrTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrattrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeFrom")
    public void setScrattrTermCodeFrom(String scrattrTermCodeFrom) {
        this.scrattrTermCodeFrom = scrattrTermCodeFrom;
    }

    public AttrCtrlBlock withScrattrTermCodeFrom(String scrattrTermCodeFrom) {
        this.scrattrTermCodeFrom = scrattrTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrattrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeTo")
    public String getScrattrTermCodeTo() {
        return scrattrTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrattrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrattrTermCodeTo")
    public void setScrattrTermCodeTo(String scrattrTermCodeTo) {
        this.scrattrTermCodeTo = scrattrTermCodeTo;
    }

    public AttrCtrlBlock withScrattrTermCodeTo(String scrattrTermCodeTo) {
        this.scrattrTermCodeTo = scrattrTermCodeTo;
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

    public AttrCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttrCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrattrTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrattrTermCodeFrom == null)?"<null>":this.scrattrTermCodeFrom));
        sb.append(',');
        sb.append("scrattrTermCodeTo");
        sb.append('=');
        sb.append(((this.scrattrTermCodeTo == null)?"<null>":this.scrattrTermCodeTo));
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
        result = ((result* 31)+((this.scrattrTermCodeFrom == null)? 0 :this.scrattrTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrattrTermCodeTo == null)? 0 :this.scrattrTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttrCtrlBlock) == false) {
            return false;
        }
        AttrCtrlBlock rhs = ((AttrCtrlBlock) other);
        return ((((this.scrattrTermCodeFrom == rhs.scrattrTermCodeFrom)||((this.scrattrTermCodeFrom!= null)&&this.scrattrTermCodeFrom.equals(rhs.scrattrTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrattrTermCodeTo == rhs.scrattrTermCodeTo)||((this.scrattrTermCodeTo!= null)&&this.scrattrTermCodeTo.equals(rhs.scrattrTermCodeTo))));
    }

}
