
package com.ellucian.generated.bpapi.ban.section_restriction_department_and_field_of_study.v1_0_0;

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
    "ssrrdepDeptIeCde"
})
@Generated("jsonschema2pojo")
public class RdepCtrlBlock {

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    @JsonPropertyDescription("Lineage reference object : ssrrdepDeptIeCde")
    private String ssrrdepDeptIeCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    public String getSsrrdepDeptIeCde() {
        return ssrrdepDeptIeCde;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    public void setSsrrdepDeptIeCde(String ssrrdepDeptIeCde) {
        this.ssrrdepDeptIeCde = ssrrdepDeptIeCde;
    }

    public RdepCtrlBlock withSsrrdepDeptIeCde(String ssrrdepDeptIeCde) {
        this.ssrrdepDeptIeCde = ssrrdepDeptIeCde;
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

    public RdepCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RdepCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrdepDeptIeCde");
        sb.append('=');
        sb.append(((this.ssrrdepDeptIeCde == null)?"<null>":this.ssrrdepDeptIeCde));
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
        result = ((result* 31)+((this.ssrrdepDeptIeCde == null)? 0 :this.ssrrdepDeptIeCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RdepCtrlBlock) == false) {
            return false;
        }
        RdepCtrlBlock rhs = ((RdepCtrlBlock) other);
        return (((this.ssrrdepDeptIeCde == rhs.ssrrdepDeptIeCde)||((this.ssrrdepDeptIeCde!= null)&&this.ssrrdepDeptIeCde.equals(rhs.ssrrdepDeptIeCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
