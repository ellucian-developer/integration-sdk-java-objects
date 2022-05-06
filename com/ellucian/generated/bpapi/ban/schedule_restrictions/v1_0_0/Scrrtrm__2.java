
package com.ellucian.generated.bpapi.ban.schedule_restrictions.v1_0_0;

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
    "termDescription",
    "rtrmCode"
})
@Generated("jsonschema2pojo")
public class Scrrtrm__2 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("termDescription")
    private String termDescription;
    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm")
    private String rtrmCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("termDescription")
    public String getTermDescription() {
        return termDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("termDescription")
    public void setTermDescription(String termDescription) {
        this.termDescription = termDescription;
    }

    public Scrrtrm__2 withTermDescription(String termDescription) {
        this.termDescription = termDescription;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    public String getRtrmCode() {
        return rtrmCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    public void setRtrmCode(String rtrmCode) {
        this.rtrmCode = rtrmCode;
    }

    public Scrrtrm__2 withRtrmCode(String rtrmCode) {
        this.rtrmCode = rtrmCode;
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

    public Scrrtrm__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrtrm__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termDescription");
        sb.append('=');
        sb.append(((this.termDescription == null)?"<null>":this.termDescription));
        sb.append(',');
        sb.append("rtrmCode");
        sb.append('=');
        sb.append(((this.rtrmCode == null)?"<null>":this.rtrmCode));
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
        result = ((result* 31)+((this.termDescription == null)? 0 :this.termDescription.hashCode()));
        result = ((result* 31)+((this.rtrmCode == null)? 0 :this.rtrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrrtrm__2) == false) {
            return false;
        }
        Scrrtrm__2 rhs = ((Scrrtrm__2) other);
        return ((((this.termDescription == rhs.termDescription)||((this.termDescription!= null)&&this.termDescription.equals(rhs.termDescription)))&&((this.rtrmCode == rhs.rtrmCode)||((this.rtrmCode!= null)&&this.rtrmCode.equals(rhs.rtrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}