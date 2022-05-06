
package com.ellucian.generated.bpapi.ban.electronic_admissions_applicant_rules.v1_0_0;

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
    "keyblckEgrpCode",
    "egrpDesc"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    @JsonPropertyDescription("Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp")
    private Object keyblckEgrpCode;
    /**
     * Lineage reference object : egrpDesc
     * 
     */
    @JsonProperty("egrpDesc")
    @JsonPropertyDescription("Lineage reference object : egrpDesc")
    private Object egrpDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    public Object getKeyblckEgrpCode() {
        return keyblckEgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    public void setKeyblckEgrpCode(Object keyblckEgrpCode) {
        this.keyblckEgrpCode = keyblckEgrpCode;
    }

    public KeyBlock withKeyblckEgrpCode(Object keyblckEgrpCode) {
        this.keyblckEgrpCode = keyblckEgrpCode;
        return this;
    }

    /**
     * Lineage reference object : egrpDesc
     * 
     */
    @JsonProperty("egrpDesc")
    public Object getEgrpDesc() {
        return egrpDesc;
    }

    /**
     * Lineage reference object : egrpDesc
     * 
     */
    @JsonProperty("egrpDesc")
    public void setEgrpDesc(Object egrpDesc) {
        this.egrpDesc = egrpDesc;
    }

    public KeyBlock withEgrpDesc(Object egrpDesc) {
        this.egrpDesc = egrpDesc;
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

    public KeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckEgrpCode");
        sb.append('=');
        sb.append(((this.keyblckEgrpCode == null)?"<null>":this.keyblckEgrpCode));
        sb.append(',');
        sb.append("egrpDesc");
        sb.append('=');
        sb.append(((this.egrpDesc == null)?"<null>":this.egrpDesc));
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
        result = ((result* 31)+((this.keyblckEgrpCode == null)? 0 :this.keyblckEgrpCode.hashCode()));
        result = ((result* 31)+((this.egrpDesc == null)? 0 :this.egrpDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock) == false) {
            return false;
        }
        KeyBlock rhs = ((KeyBlock) other);
        return ((((this.keyblckEgrpCode == rhs.keyblckEgrpCode)||((this.keyblckEgrpCode!= null)&&this.keyblckEgrpCode.equals(rhs.keyblckEgrpCode)))&&((this.egrpDesc == rhs.egrpDesc)||((this.egrpDesc!= null)&&this.egrpDesc.equals(rhs.egrpDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
