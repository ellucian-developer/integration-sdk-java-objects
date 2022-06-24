
package com.ellucian.generated.bpapi.ban.course_detail_information_course_text.v1_0_0;

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
    "scrtextTermCodeTo",
    "scrtextTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class TextCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrtextTermCodeTo
     * 
     */
    @JsonProperty("scrtextTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrtextTermCodeTo")
    private String scrtextTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrtextTermCodeFrom
     * 
     */
    @JsonProperty("scrtextTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrtextTermCodeFrom")
    private String scrtextTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrtextTermCodeTo
     * 
     */
    @JsonProperty("scrtextTermCodeTo")
    public String getScrtextTermCodeTo() {
        return scrtextTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrtextTermCodeTo
     * 
     */
    @JsonProperty("scrtextTermCodeTo")
    public void setScrtextTermCodeTo(String scrtextTermCodeTo) {
        this.scrtextTermCodeTo = scrtextTermCodeTo;
    }

    public TextCtrlBlock withScrtextTermCodeTo(String scrtextTermCodeTo) {
        this.scrtextTermCodeTo = scrtextTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrtextTermCodeFrom
     * 
     */
    @JsonProperty("scrtextTermCodeFrom")
    public String getScrtextTermCodeFrom() {
        return scrtextTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrtextTermCodeFrom
     * 
     */
    @JsonProperty("scrtextTermCodeFrom")
    public void setScrtextTermCodeFrom(String scrtextTermCodeFrom) {
        this.scrtextTermCodeFrom = scrtextTermCodeFrom;
    }

    public TextCtrlBlock withScrtextTermCodeFrom(String scrtextTermCodeFrom) {
        this.scrtextTermCodeFrom = scrtextTermCodeFrom;
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

    public TextCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrtextTermCodeTo");
        sb.append('=');
        sb.append(((this.scrtextTermCodeTo == null)?"<null>":this.scrtextTermCodeTo));
        sb.append(',');
        sb.append("scrtextTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrtextTermCodeFrom == null)?"<null>":this.scrtextTermCodeFrom));
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
        result = ((result* 31)+((this.scrtextTermCodeTo == null)? 0 :this.scrtextTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrtextTermCodeFrom == null)? 0 :this.scrtextTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextCtrlBlock) == false) {
            return false;
        }
        TextCtrlBlock rhs = ((TextCtrlBlock) other);
        return ((((this.scrtextTermCodeTo == rhs.scrtextTermCodeTo)||((this.scrtextTermCodeTo!= null)&&this.scrtextTermCodeTo.equals(rhs.scrtextTermCodeTo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrtextTermCodeFrom == rhs.scrtextTermCodeFrom)||((this.scrtextTermCodeFrom!= null)&&this.scrtextTermCodeFrom.equals(rhs.scrtextTermCodeFrom))));
    }

}
