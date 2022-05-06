
package com.ellucian.generated.bpapi.ban.life_event_change_rules.v1_0_0;

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
    "bdocDesc",
    "bdocCode"
})
@Generated("jsonschema2pojo")
public class Ptrlfsd {

    @JsonProperty("bdocDesc")
    private String bdocDesc;
    /**
     * Supporting Document Code
     * <p>
     * Lineage reference object : PTRLFSD_BDOC_CODE, Lookup lineage reference object : PTVBDOC
     * (Required)
     * 
     */
    @JsonProperty("bdocCode")
    @JsonPropertyDescription("Lineage reference object : PTRLFSD_BDOC_CODE, Lookup lineage reference object : PTVBDOC")
    private String bdocCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bdocDesc")
    public String getBdocDesc() {
        return bdocDesc;
    }

    @JsonProperty("bdocDesc")
    public void setBdocDesc(String bdocDesc) {
        this.bdocDesc = bdocDesc;
    }

    public Ptrlfsd withBdocDesc(String bdocDesc) {
        this.bdocDesc = bdocDesc;
        return this;
    }

    /**
     * Supporting Document Code
     * <p>
     * Lineage reference object : PTRLFSD_BDOC_CODE, Lookup lineage reference object : PTVBDOC
     * (Required)
     * 
     */
    @JsonProperty("bdocCode")
    public String getBdocCode() {
        return bdocCode;
    }

    /**
     * Supporting Document Code
     * <p>
     * Lineage reference object : PTRLFSD_BDOC_CODE, Lookup lineage reference object : PTVBDOC
     * (Required)
     * 
     */
    @JsonProperty("bdocCode")
    public void setBdocCode(String bdocCode) {
        this.bdocCode = bdocCode;
    }

    public Ptrlfsd withBdocCode(String bdocCode) {
        this.bdocCode = bdocCode;
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

    public Ptrlfsd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrlfsd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdocDesc");
        sb.append('=');
        sb.append(((this.bdocDesc == null)?"<null>":this.bdocDesc));
        sb.append(',');
        sb.append("bdocCode");
        sb.append('=');
        sb.append(((this.bdocCode == null)?"<null>":this.bdocCode));
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
        result = ((result* 31)+((this.bdocDesc == null)? 0 :this.bdocDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdocCode == null)? 0 :this.bdocCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrlfsd) == false) {
            return false;
        }
        Ptrlfsd rhs = ((Ptrlfsd) other);
        return ((((this.bdocDesc == rhs.bdocDesc)||((this.bdocDesc!= null)&&this.bdocDesc.equals(rhs.bdocDesc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bdocCode == rhs.bdocCode)||((this.bdocCode!= null)&&this.bdocCode.equals(rhs.bdocCode))));
    }

}
