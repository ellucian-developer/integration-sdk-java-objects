
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
    "ssrrcolCollInd"
})
@Generated("jsonschema2pojo")
public class RcolCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcolCollInd")
    @JsonPropertyDescription("Lineage reference object : ssrrcolCollInd")
    private String ssrrcolCollInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcolCollInd")
    public String getSsrrcolCollInd() {
        return ssrrcolCollInd;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrcolCollInd
     * (Required)
     * 
     */
    @JsonProperty("ssrrcolCollInd")
    public void setSsrrcolCollInd(String ssrrcolCollInd) {
        this.ssrrcolCollInd = ssrrcolCollInd;
    }

    public RcolCtrlBlock withSsrrcolCollInd(String ssrrcolCollInd) {
        this.ssrrcolCollInd = ssrrcolCollInd;
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

    public RcolCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RcolCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrcolCollInd");
        sb.append('=');
        sb.append(((this.ssrrcolCollInd == null)?"<null>":this.ssrrcolCollInd));
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
        result = ((result* 31)+((this.ssrrcolCollInd == null)? 0 :this.ssrrcolCollInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RcolCtrlBlock) == false) {
            return false;
        }
        RcolCtrlBlock rhs = ((RcolCtrlBlock) other);
        return (((this.ssrrcolCollInd == rhs.ssrrcolCollInd)||((this.ssrrcolCollInd!= null)&&this.ssrrcolCollInd.equals(rhs.ssrrcolCollInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
