
package com.ellucian.generated.bpapi.ban.grade_code_maintenance.v1_0_0;

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
    "gmodCode",
    "stvgmodDesc"
})
@Generated("jsonschema2pojo")
public class Shrgrdo {

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String gmodCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    private String stvgmodDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Shrgrdo withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    public String getStvgmodDesc() {
        return stvgmodDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    public void setStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
    }

    public Shrgrdo withStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
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

    public Shrgrdo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrgrdo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("stvgmodDesc");
        sb.append('=');
        sb.append(((this.stvgmodDesc == null)?"<null>":this.stvgmodDesc));
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
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.stvgmodDesc == null)? 0 :this.stvgmodDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrgrdo) == false) {
            return false;
        }
        Shrgrdo rhs = ((Shrgrdo) other);
        return ((((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode)))&&((this.stvgmodDesc == rhs.stvgmodDesc)||((this.stvgmodDesc!= null)&&this.stvgmodDesc.equals(rhs.stvgmodDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
