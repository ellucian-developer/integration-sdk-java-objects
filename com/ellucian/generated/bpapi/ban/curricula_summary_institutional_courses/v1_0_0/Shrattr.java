
package com.ellucian.generated.bpapi.ban.curricula_summary_institutional_courses.v1_0_0;

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
    "attrCode",
    "stvattrDesc"
})
@Generated("jsonschema2pojo")
public class Shrattr {

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SHRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SHRATTR_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Person Section Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc")
    private String stvattrDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SHRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SHRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public Shrattr withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Person Section Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc")
    public String getStvattrDesc() {
        return stvattrDesc;
    }

    /**
     * Person Section Attributes
     * <p>
     * 
     * 
     */
    @JsonProperty("stvattrDesc")
    public void setStvattrDesc(String stvattrDesc) {
        this.stvattrDesc = stvattrDesc;
    }

    public Shrattr withStvattrDesc(String stvattrDesc) {
        this.stvattrDesc = stvattrDesc;
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

    public Shrattr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrattr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("stvattrDesc");
        sb.append('=');
        sb.append(((this.stvattrDesc == null)?"<null>":this.stvattrDesc));
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
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.stvattrDesc == null)? 0 :this.stvattrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrattr) == false) {
            return false;
        }
        Shrattr rhs = ((Shrattr) other);
        return ((((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode)))&&((this.stvattrDesc == rhs.stvattrDesc)||((this.stvattrDesc!= null)&&this.stvattrDesc.equals(rhs.stvattrDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
