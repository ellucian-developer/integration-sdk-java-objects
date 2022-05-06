
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
    "ssrrdegDegcInd"
})
@Generated("jsonschema2pojo")
public class RdegCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrdegDegcInd")
    @JsonPropertyDescription("Lineage reference object : ssrrdegDegcInd")
    private Object ssrrdegDegcInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrdegDegcInd")
    public Object getSsrrdegDegcInd() {
        return ssrrdegDegcInd;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdegDegcInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrdegDegcInd")
    public void setSsrrdegDegcInd(Object ssrrdegDegcInd) {
        this.ssrrdegDegcInd = ssrrdegDegcInd;
    }

    public RdegCtrlBlock withSsrrdegDegcInd(Object ssrrdegDegcInd) {
        this.ssrrdegDegcInd = ssrrdegDegcInd;
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

    public RdegCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RdegCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrdegDegcInd");
        sb.append('=');
        sb.append(((this.ssrrdegDegcInd == null)?"<null>":this.ssrrdegDegcInd));
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
        result = ((result* 31)+((this.ssrrdegDegcInd == null)? 0 :this.ssrrdegDegcInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RdegCtrlBlock) == false) {
            return false;
        }
        RdegCtrlBlock rhs = ((RdegCtrlBlock) other);
        return (((this.ssrrdegDegcInd == rhs.ssrrdegDegcInd)||((this.ssrrdegDegcInd!= null)&&this.ssrrdegDegcInd.equals(rhs.ssrrdegDegcInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
