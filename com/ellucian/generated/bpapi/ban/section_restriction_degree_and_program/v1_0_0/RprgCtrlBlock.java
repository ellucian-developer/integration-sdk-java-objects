
package com.ellucian.generated.bpapi.ban.section_restriction_degree_and_program.v1_0_0;

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
    "ssrrprgProgramInd"
})
@Generated("jsonschema2pojo")
public class RprgCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrprgProgramInd")
    @JsonPropertyDescription("Lineage reference object : ssrrprgProgramInd")
    private Object ssrrprgProgramInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrprgProgramInd")
    public Object getSsrrprgProgramInd() {
        return ssrrprgProgramInd;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrprgProgramInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrprgProgramInd")
    public void setSsrrprgProgramInd(Object ssrrprgProgramInd) {
        this.ssrrprgProgramInd = ssrrprgProgramInd;
    }

    public RprgCtrlBlock withSsrrprgProgramInd(Object ssrrprgProgramInd) {
        this.ssrrprgProgramInd = ssrrprgProgramInd;
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

    public RprgCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RprgCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrprgProgramInd");
        sb.append('=');
        sb.append(((this.ssrrprgProgramInd == null)?"<null>":this.ssrrprgProgramInd));
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
        result = ((result* 31)+((this.ssrrprgProgramInd == null)? 0 :this.ssrrprgProgramInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RprgCtrlBlock) == false) {
            return false;
        }
        RprgCtrlBlock rhs = ((RprgCtrlBlock) other);
        return (((this.ssrrprgProgramInd == rhs.ssrrprgProgramInd)||((this.ssrrprgProgramInd!= null)&&this.ssrrprgProgramInd.equals(rhs.ssrrprgProgramInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
