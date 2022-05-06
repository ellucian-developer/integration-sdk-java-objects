
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
    "ssrrclsClassInd"
})
@Generated("jsonschema2pojo")
public class RclsCtrlBlock {

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : ssrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrclsClassInd")
    @JsonPropertyDescription("Lineage reference object : ssrrclsClassInd")
    private Object ssrrclsClassInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : ssrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrclsClassInd")
    public Object getSsrrclsClassInd() {
        return ssrrclsClassInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : ssrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrclsClassInd")
    public void setSsrrclsClassInd(Object ssrrclsClassInd) {
        this.ssrrclsClassInd = ssrrclsClassInd;
    }

    public RclsCtrlBlock withSsrrclsClassInd(Object ssrrclsClassInd) {
        this.ssrrclsClassInd = ssrrclsClassInd;
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

    public RclsCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RclsCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrclsClassInd");
        sb.append('=');
        sb.append(((this.ssrrclsClassInd == null)?"<null>":this.ssrrclsClassInd));
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
        result = ((result* 31)+((this.ssrrclsClassInd == null)? 0 :this.ssrrclsClassInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RclsCtrlBlock) == false) {
            return false;
        }
        RclsCtrlBlock rhs = ((RclsCtrlBlock) other);
        return (((this.ssrrclsClassInd == rhs.ssrrclsClassInd)||((this.ssrrclsClassInd!= null)&&this.ssrrclsClassInd.equals(rhs.ssrrclsClassInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
