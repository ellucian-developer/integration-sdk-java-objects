
package com.ellucian.generated.bpapi.ban.section_restriction_campus_and_college.v1_0_0;

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
    "ssrrcmpCampInd"
})
@Generated("jsonschema2pojo")
public class RcmpCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcmpCampInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcmpCampInd")
    @JsonPropertyDescription("Lineage reference object : ssrrcmpCampInd")
    private Object ssrrcmpCampInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcmpCampInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcmpCampInd")
    public Object getSsrrcmpCampInd() {
        return ssrrcmpCampInd;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcmpCampInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcmpCampInd")
    public void setSsrrcmpCampInd(Object ssrrcmpCampInd) {
        this.ssrrcmpCampInd = ssrrcmpCampInd;
    }

    public RcmpCtrlBlock withSsrrcmpCampInd(Object ssrrcmpCampInd) {
        this.ssrrcmpCampInd = ssrrcmpCampInd;
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

    public RcmpCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RcmpCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrcmpCampInd");
        sb.append('=');
        sb.append(((this.ssrrcmpCampInd == null)?"<null>":this.ssrrcmpCampInd));
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
        result = ((result* 31)+((this.ssrrcmpCampInd == null)? 0 :this.ssrrcmpCampInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RcmpCtrlBlock) == false) {
            return false;
        }
        RcmpCtrlBlock rhs = ((RcmpCtrlBlock) other);
        return (((this.ssrrcmpCampInd == rhs.ssrrcmpCampInd)||((this.ssrrcmpCampInd!= null)&&this.ssrrcmpCampInd.equals(rhs.ssrrcmpCampInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
