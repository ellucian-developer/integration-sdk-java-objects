
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
    "ssrrattAttsIeCde"
})
@Generated("jsonschema2pojo")
public class RattCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrattAttsIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrattAttsIeCde")
    @JsonPropertyDescription("Lineage reference object : ssrrattAttsIeCde")
    private Object ssrrattAttsIeCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrattAttsIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrattAttsIeCde")
    public Object getSsrrattAttsIeCde() {
        return ssrrattAttsIeCde;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrattAttsIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrattAttsIeCde")
    public void setSsrrattAttsIeCde(Object ssrrattAttsIeCde) {
        this.ssrrattAttsIeCde = ssrrattAttsIeCde;
    }

    public RattCtrlBlock withSsrrattAttsIeCde(Object ssrrattAttsIeCde) {
        this.ssrrattAttsIeCde = ssrrattAttsIeCde;
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

    public RattCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RattCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrattAttsIeCde");
        sb.append('=');
        sb.append(((this.ssrrattAttsIeCde == null)?"<null>":this.ssrrattAttsIeCde));
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
        result = ((result* 31)+((this.ssrrattAttsIeCde == null)? 0 :this.ssrrattAttsIeCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RattCtrlBlock) == false) {
            return false;
        }
        RattCtrlBlock rhs = ((RattCtrlBlock) other);
        return (((this.ssrrattAttsIeCde == rhs.ssrrattAttsIeCde)||((this.ssrrattAttsIeCde!= null)&&this.ssrrattAttsIeCde.equals(rhs.ssrrattAttsIeCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
