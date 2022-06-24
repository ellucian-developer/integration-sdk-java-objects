
package com.ellucian.generated.bpapi.ban.grade_book_rule_definition.v0_1_0;

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
    "parmValue",
    "parm"
})
@Generated("jsonschema2pojo")
public class Shrgrul__1 {

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    @JsonPropertyDescription("Lineage reference object : SHRGRUL_PARM_VALUE")
    private String parmValue;
    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("parm")
    @JsonPropertyDescription("Lineage reference object : SHRGRUL_PARM")
    private String parm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    public String getParmValue() {
        return parmValue;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    public void setParmValue(String parmValue) {
        this.parmValue = parmValue;
    }

    public Shrgrul__1 withParmValue(String parmValue) {
        this.parmValue = parmValue;
        return this;
    }

    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("parm")
    public String getParm() {
        return parm;
    }

    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("parm")
    public void setParm(String parm) {
        this.parm = parm;
    }

    public Shrgrul__1 withParm(String parm) {
        this.parm = parm;
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

    public Shrgrul__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrgrul__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parmValue");
        sb.append('=');
        sb.append(((this.parmValue == null)?"<null>":this.parmValue));
        sb.append(',');
        sb.append("parm");
        sb.append('=');
        sb.append(((this.parm == null)?"<null>":this.parm));
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
        result = ((result* 31)+((this.parm == null)? 0 :this.parm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parmValue == null)? 0 :this.parmValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrgrul__1) == false) {
            return false;
        }
        Shrgrul__1 rhs = ((Shrgrul__1) other);
        return ((((this.parm == rhs.parm)||((this.parm!= null)&&this.parm.equals(rhs.parm)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parmValue == rhs.parmValue)||((this.parmValue!= null)&&this.parmValue.equals(rhs.parmValue))));
    }

}
