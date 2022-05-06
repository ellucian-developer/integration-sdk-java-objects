
package com.ellucian.generated.bpapi.ban.curricula_summary_transfer_courses.v1_0_0;

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
    "stvattrDesc1",
    "attrCode"
})
@Generated("jsonschema2pojo")
public class Shrtatt {

    /**
     * Transfer Course Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc1")
    private String stvattrDesc1;
    /**
     * Code
     * <p>
     * Lineage reference object : SHRTATT_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SHRTATT_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Transfer Course Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc1")
    public String getStvattrDesc1() {
        return stvattrDesc1;
    }

    /**
     * Transfer Course Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc1")
    public void setStvattrDesc1(String stvattrDesc1) {
        this.stvattrDesc1 = stvattrDesc1;
    }

    public Shrtatt withStvattrDesc1(String stvattrDesc1) {
        this.stvattrDesc1 = stvattrDesc1;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTATT_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTATT_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public Shrtatt withAttrCode(String attrCode) {
        this.attrCode = attrCode;
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

    public Shrtatt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtatt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvattrDesc1");
        sb.append('=');
        sb.append(((this.stvattrDesc1 == null)?"<null>":this.stvattrDesc1));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
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
        result = ((result* 31)+((this.stvattrDesc1 == null)? 0 :this.stvattrDesc1 .hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtatt) == false) {
            return false;
        }
        Shrtatt rhs = ((Shrtatt) other);
        return ((((this.stvattrDesc1 == rhs.stvattrDesc1)||((this.stvattrDesc1 != null)&&this.stvattrDesc1 .equals(rhs.stvattrDesc1)))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
