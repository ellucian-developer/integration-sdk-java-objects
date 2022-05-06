
package com.ellucian.generated.bpapi.ban.section_restriction_student_attribute_and_cohort.v1_0_0;

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
    "ssrrchrChrtIeCde"
})
@Generated("jsonschema2pojo")
public class RchrCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrchrChrtIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrchrChrtIeCde")
    @JsonPropertyDescription("Lineage reference object : ssrrchrChrtIeCde")
    private Object ssrrchrChrtIeCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrchrChrtIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrchrChrtIeCde")
    public Object getSsrrchrChrtIeCde() {
        return ssrrchrChrtIeCde;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrchrChrtIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrchrChrtIeCde")
    public void setSsrrchrChrtIeCde(Object ssrrchrChrtIeCde) {
        this.ssrrchrChrtIeCde = ssrrchrChrtIeCde;
    }

    public RchrCtrlBlock withSsrrchrChrtIeCde(Object ssrrchrChrtIeCde) {
        this.ssrrchrChrtIeCde = ssrrchrChrtIeCde;
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

    public RchrCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RchrCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrchrChrtIeCde");
        sb.append('=');
        sb.append(((this.ssrrchrChrtIeCde == null)?"<null>":this.ssrrchrChrtIeCde));
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
        result = ((result* 31)+((this.ssrrchrChrtIeCde == null)? 0 :this.ssrrchrChrtIeCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RchrCtrlBlock) == false) {
            return false;
        }
        RchrCtrlBlock rhs = ((RchrCtrlBlock) other);
        return (((this.ssrrchrChrtIeCde == rhs.ssrrchrChrtIeCde)||((this.ssrrchrChrtIeCde!= null)&&this.ssrrchrChrtIeCde.equals(rhs.ssrrchrChrtIeCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
