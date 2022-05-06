
package com.ellucian.generated.bpapi.ban.transfer_institution_catalog_entry.v1_0_0;

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
    "attrCde",
    "attrDesc"
})
@Generated("jsonschema2pojo")
public class Shrtcat {

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_CDE
     * (Required)
     * 
     */
    @JsonProperty("attrCde")
    @JsonPropertyDescription("Lineage reference object : SHRTCAT_ATTR_CDE")
    private String attrCde;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_DESC
     * (Required)
     * 
     */
    @JsonProperty("attrDesc")
    @JsonPropertyDescription("Lineage reference object : SHRTCAT_ATTR_DESC")
    private String attrDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_CDE
     * (Required)
     * 
     */
    @JsonProperty("attrCde")
    public String getAttrCde() {
        return attrCde;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_CDE
     * (Required)
     * 
     */
    @JsonProperty("attrCde")
    public void setAttrCde(String attrCde) {
        this.attrCde = attrCde;
    }

    public Shrtcat withAttrCde(String attrCde) {
        this.attrCde = attrCde;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_DESC
     * (Required)
     * 
     */
    @JsonProperty("attrDesc")
    public String getAttrDesc() {
        return attrDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRTCAT_ATTR_DESC
     * (Required)
     * 
     */
    @JsonProperty("attrDesc")
    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    public Shrtcat withAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
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

    public Shrtcat withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtcat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attrCde");
        sb.append('=');
        sb.append(((this.attrCde == null)?"<null>":this.attrCde));
        sb.append(',');
        sb.append("attrDesc");
        sb.append('=');
        sb.append(((this.attrDesc == null)?"<null>":this.attrDesc));
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
        result = ((result* 31)+((this.attrCde == null)? 0 :this.attrCde.hashCode()));
        result = ((result* 31)+((this.attrDesc == null)? 0 :this.attrDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtcat) == false) {
            return false;
        }
        Shrtcat rhs = ((Shrtcat) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.attrCde == rhs.attrCde)||((this.attrCde!= null)&&this.attrCde.equals(rhs.attrCde))))&&((this.attrDesc == rhs.attrDesc)||((this.attrDesc!= null)&&this.attrDesc.equals(rhs.attrDesc))));
    }

}
