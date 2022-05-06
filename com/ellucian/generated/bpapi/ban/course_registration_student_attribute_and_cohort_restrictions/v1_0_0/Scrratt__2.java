
package com.ellucian.generated.bpapi.ban.course_registration_student_attribute_and_cohort_restrictions.v1_0_0;

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
    "attsCode",
    "attsDesc"
})
@Generated("jsonschema2pojo")
public class Scrratt__2 {

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attsDesc")
    private String attsDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public Scrratt__2 withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attsDesc")
    public String getAttsDesc() {
        return attsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attsDesc")
    public void setAttsDesc(String attsDesc) {
        this.attsDesc = attsDesc;
    }

    public Scrratt__2 withAttsDesc(String attsDesc) {
        this.attsDesc = attsDesc;
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

    public Scrratt__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrratt__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("attsDesc");
        sb.append('=');
        sb.append(((this.attsDesc == null)?"<null>":this.attsDesc));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.attsDesc == null)? 0 :this.attsDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrratt__2) == false) {
            return false;
        }
        Scrratt__2 rhs = ((Scrratt__2) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.attsDesc == rhs.attsDesc)||((this.attsDesc!= null)&&this.attsDesc.equals(rhs.attsDesc))));
    }

}
