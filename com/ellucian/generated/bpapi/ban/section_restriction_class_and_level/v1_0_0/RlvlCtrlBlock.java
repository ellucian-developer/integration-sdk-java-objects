
package com.ellucian.generated.bpapi.ban.section_restriction_class_and_level.v1_0_0;

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
    "ssrrlvlLevlInd"
})
@Generated("jsonschema2pojo")
public class RlvlCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrlvlLevlInd")
    @JsonPropertyDescription("Lineage reference object : ssrrlvlLevlInd")
    private Object ssrrlvlLevlInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrlvlLevlInd")
    public Object getSsrrlvlLevlInd() {
        return ssrrlvlLevlInd;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrlvlLevlInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrlvlLevlInd")
    public void setSsrrlvlLevlInd(Object ssrrlvlLevlInd) {
        this.ssrrlvlLevlInd = ssrrlvlLevlInd;
    }

    public RlvlCtrlBlock withSsrrlvlLevlInd(Object ssrrlvlLevlInd) {
        this.ssrrlvlLevlInd = ssrrlvlLevlInd;
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
        sb.append("ssrrlvlLevlInd");
        sb.append('=');
        sb.append(((this.ssrrlvlLevlInd == null)?"<null>":this.ssrrlvlLevlInd));
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
        result = ((result* 31)+((this.ssrrlvlLevlInd == null)? 0 :this.ssrrlvlLevlInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        return (((this.ssrrlvlLevlInd == rhs.ssrrlvlLevlInd)||((this.ssrrlvlLevlInd!= null)&&this.ssrrlvlLevlInd.equals(rhs.ssrrlvlLevlInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
