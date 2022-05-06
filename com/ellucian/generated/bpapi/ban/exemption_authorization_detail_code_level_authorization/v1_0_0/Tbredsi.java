
package com.ellucian.generated.bpapi.ban.exemption_authorization_detail_code_level_authorization.v1_0_0;

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
    "sourceCode"
})
@Generated("jsonschema2pojo")
public class Tbredsi {

    /**
     * Source
     * <p>
     * Lineage reference object : TBREDSI_SOURCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("sourceCode")
    @JsonPropertyDescription("Lineage reference object : TBREDSI_SOURCE_CODE, Lookup lineage reference object : ttvsrce")
    private String sourceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Source
     * <p>
     * Lineage reference object : TBREDSI_SOURCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("sourceCode")
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBREDSI_SOURCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("sourceCode")
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Tbredsi withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
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

    public Tbredsi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbredsi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceCode");
        sb.append('=');
        sb.append(((this.sourceCode == null)?"<null>":this.sourceCode));
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
        result = ((result* 31)+((this.sourceCode == null)? 0 :this.sourceCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbredsi) == false) {
            return false;
        }
        Tbredsi rhs = ((Tbredsi) other);
        return (((this.sourceCode == rhs.sourceCode)||((this.sourceCode!= null)&&this.sourceCode.equals(rhs.sourceCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
