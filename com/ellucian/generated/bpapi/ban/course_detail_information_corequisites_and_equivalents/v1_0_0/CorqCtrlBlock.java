
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "scrcorqTermCodeFrom",
    "scrcorqTermCodeTo"
})
@Generated("jsonschema2pojo")
public class CorqCtrlBlock {

    /**
     * From Term
     * <p>
     * Lineage reference object : scrcorqTermCodeFrom
     * 
     */
    @JsonProperty("scrcorqTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrcorqTermCodeFrom")
    private String scrcorqTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrcorqTermCodeTo
     * 
     */
    @JsonProperty("scrcorqTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrcorqTermCodeTo")
    private String scrcorqTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : scrcorqTermCodeFrom
     * 
     */
    @JsonProperty("scrcorqTermCodeFrom")
    public String getScrcorqTermCodeFrom() {
        return scrcorqTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrcorqTermCodeFrom
     * 
     */
    @JsonProperty("scrcorqTermCodeFrom")
    public void setScrcorqTermCodeFrom(String scrcorqTermCodeFrom) {
        this.scrcorqTermCodeFrom = scrcorqTermCodeFrom;
    }

    public CorqCtrlBlock withScrcorqTermCodeFrom(String scrcorqTermCodeFrom) {
        this.scrcorqTermCodeFrom = scrcorqTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrcorqTermCodeTo
     * 
     */
    @JsonProperty("scrcorqTermCodeTo")
    public String getScrcorqTermCodeTo() {
        return scrcorqTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrcorqTermCodeTo
     * 
     */
    @JsonProperty("scrcorqTermCodeTo")
    public void setScrcorqTermCodeTo(String scrcorqTermCodeTo) {
        this.scrcorqTermCodeTo = scrcorqTermCodeTo;
    }

    public CorqCtrlBlock withScrcorqTermCodeTo(String scrcorqTermCodeTo) {
        this.scrcorqTermCodeTo = scrcorqTermCodeTo;
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

    public CorqCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CorqCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrcorqTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrcorqTermCodeFrom == null)?"<null>":this.scrcorqTermCodeFrom));
        sb.append(',');
        sb.append("scrcorqTermCodeTo");
        sb.append('=');
        sb.append(((this.scrcorqTermCodeTo == null)?"<null>":this.scrcorqTermCodeTo));
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
        result = ((result* 31)+((this.scrcorqTermCodeFrom == null)? 0 :this.scrcorqTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrcorqTermCodeTo == null)? 0 :this.scrcorqTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CorqCtrlBlock) == false) {
            return false;
        }
        CorqCtrlBlock rhs = ((CorqCtrlBlock) other);
        return ((((this.scrcorqTermCodeFrom == rhs.scrcorqTermCodeFrom)||((this.scrcorqTermCodeFrom!= null)&&this.scrcorqTermCodeFrom.equals(rhs.scrcorqTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrcorqTermCodeTo == rhs.scrcorqTermCodeTo)||((this.scrcorqTermCodeTo!= null)&&this.scrcorqTermCodeTo.equals(rhs.scrcorqTermCodeTo))));
    }

}
