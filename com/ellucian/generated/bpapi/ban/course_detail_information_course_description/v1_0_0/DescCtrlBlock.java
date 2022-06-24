
package com.ellucian.generated.bpapi.ban.course_detail_information_course_description.v1_0_0;

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
    "scbdescTermCodeTo",
    "scbdescTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class DescCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scbdescTermCodeTo
     * 
     */
    @JsonProperty("scbdescTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scbdescTermCodeTo")
    private String scbdescTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scbdescTermCodeFrom
     * 
     */
    @JsonProperty("scbdescTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scbdescTermCodeFrom")
    private String scbdescTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scbdescTermCodeTo
     * 
     */
    @JsonProperty("scbdescTermCodeTo")
    public String getScbdescTermCodeTo() {
        return scbdescTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scbdescTermCodeTo
     * 
     */
    @JsonProperty("scbdescTermCodeTo")
    public void setScbdescTermCodeTo(String scbdescTermCodeTo) {
        this.scbdescTermCodeTo = scbdescTermCodeTo;
    }

    public DescCtrlBlock withScbdescTermCodeTo(String scbdescTermCodeTo) {
        this.scbdescTermCodeTo = scbdescTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scbdescTermCodeFrom
     * 
     */
    @JsonProperty("scbdescTermCodeFrom")
    public String getScbdescTermCodeFrom() {
        return scbdescTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scbdescTermCodeFrom
     * 
     */
    @JsonProperty("scbdescTermCodeFrom")
    public void setScbdescTermCodeFrom(String scbdescTermCodeFrom) {
        this.scbdescTermCodeFrom = scbdescTermCodeFrom;
    }

    public DescCtrlBlock withScbdescTermCodeFrom(String scbdescTermCodeFrom) {
        this.scbdescTermCodeFrom = scbdescTermCodeFrom;
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

    public DescCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DescCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scbdescTermCodeTo");
        sb.append('=');
        sb.append(((this.scbdescTermCodeTo == null)?"<null>":this.scbdescTermCodeTo));
        sb.append(',');
        sb.append("scbdescTermCodeFrom");
        sb.append('=');
        sb.append(((this.scbdescTermCodeFrom == null)?"<null>":this.scbdescTermCodeFrom));
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
        result = ((result* 31)+((this.scbdescTermCodeTo == null)? 0 :this.scbdescTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scbdescTermCodeFrom == null)? 0 :this.scbdescTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DescCtrlBlock) == false) {
            return false;
        }
        DescCtrlBlock rhs = ((DescCtrlBlock) other);
        return ((((this.scbdescTermCodeTo == rhs.scbdescTermCodeTo)||((this.scbdescTermCodeTo!= null)&&this.scbdescTermCodeTo.equals(rhs.scbdescTermCodeTo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scbdescTermCodeFrom == rhs.scbdescTermCodeFrom)||((this.scbdescTermCodeFrom!= null)&&this.scbdescTermCodeFrom.equals(rhs.scbdescTermCodeFrom))));
    }

}
