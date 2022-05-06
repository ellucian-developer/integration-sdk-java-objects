
package com.ellucian.generated.bpapi.ban.curriculum_rules_module_control.v1_0_0;

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
    "cmnrMultipleMsg",
    "minrFrtermDisp",
    "minrTotermDisp"
})
@Generated("jsonschema2pojo")
public class SorcmnrCtrl {

    /**
     * Lineage reference object : cmnrMultipleMsg
     * 
     */
    @JsonProperty("cmnrMultipleMsg")
    @JsonPropertyDescription("Lineage reference object : cmnrMultipleMsg")
    private Object cmnrMultipleMsg;
    /**
     * From Term
     * <p>
     * Lineage reference object : minrFrtermDisp, Lookup lineage reference object : sorcmnr,stvterm
     * 
     */
    @JsonProperty("minrFrtermDisp")
    @JsonPropertyDescription("Lineage reference object : minrFrtermDisp, Lookup lineage reference object : sorcmnr,stvterm")
    private Object minrFrtermDisp;
    /**
     * To Term
     * <p>
     * Lineage reference object : minrTotermDisp
     * 
     */
    @JsonProperty("minrTotermDisp")
    @JsonPropertyDescription("Lineage reference object : minrTotermDisp")
    private Object minrTotermDisp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : cmnrMultipleMsg
     * 
     */
    @JsonProperty("cmnrMultipleMsg")
    public Object getCmnrMultipleMsg() {
        return cmnrMultipleMsg;
    }

    /**
     * Lineage reference object : cmnrMultipleMsg
     * 
     */
    @JsonProperty("cmnrMultipleMsg")
    public void setCmnrMultipleMsg(Object cmnrMultipleMsg) {
        this.cmnrMultipleMsg = cmnrMultipleMsg;
    }

    public SorcmnrCtrl withCmnrMultipleMsg(Object cmnrMultipleMsg) {
        this.cmnrMultipleMsg = cmnrMultipleMsg;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : minrFrtermDisp, Lookup lineage reference object : sorcmnr,stvterm
     * 
     */
    @JsonProperty("minrFrtermDisp")
    public Object getMinrFrtermDisp() {
        return minrFrtermDisp;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : minrFrtermDisp, Lookup lineage reference object : sorcmnr,stvterm
     * 
     */
    @JsonProperty("minrFrtermDisp")
    public void setMinrFrtermDisp(Object minrFrtermDisp) {
        this.minrFrtermDisp = minrFrtermDisp;
    }

    public SorcmnrCtrl withMinrFrtermDisp(Object minrFrtermDisp) {
        this.minrFrtermDisp = minrFrtermDisp;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : minrTotermDisp
     * 
     */
    @JsonProperty("minrTotermDisp")
    public Object getMinrTotermDisp() {
        return minrTotermDisp;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : minrTotermDisp
     * 
     */
    @JsonProperty("minrTotermDisp")
    public void setMinrTotermDisp(Object minrTotermDisp) {
        this.minrTotermDisp = minrTotermDisp;
    }

    public SorcmnrCtrl withMinrTotermDisp(Object minrTotermDisp) {
        this.minrTotermDisp = minrTotermDisp;
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

    public SorcmnrCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SorcmnrCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cmnrMultipleMsg");
        sb.append('=');
        sb.append(((this.cmnrMultipleMsg == null)?"<null>":this.cmnrMultipleMsg));
        sb.append(',');
        sb.append("minrFrtermDisp");
        sb.append('=');
        sb.append(((this.minrFrtermDisp == null)?"<null>":this.minrFrtermDisp));
        sb.append(',');
        sb.append("minrTotermDisp");
        sb.append('=');
        sb.append(((this.minrTotermDisp == null)?"<null>":this.minrTotermDisp));
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
        result = ((result* 31)+((this.cmnrMultipleMsg == null)? 0 :this.cmnrMultipleMsg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minrFrtermDisp == null)? 0 :this.minrFrtermDisp.hashCode()));
        result = ((result* 31)+((this.minrTotermDisp == null)? 0 :this.minrTotermDisp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SorcmnrCtrl) == false) {
            return false;
        }
        SorcmnrCtrl rhs = ((SorcmnrCtrl) other);
        return (((((this.cmnrMultipleMsg == rhs.cmnrMultipleMsg)||((this.cmnrMultipleMsg!= null)&&this.cmnrMultipleMsg.equals(rhs.cmnrMultipleMsg)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minrFrtermDisp == rhs.minrFrtermDisp)||((this.minrFrtermDisp!= null)&&this.minrFrtermDisp.equals(rhs.minrFrtermDisp))))&&((this.minrTotermDisp == rhs.minrTotermDisp)||((this.minrTotermDisp!= null)&&this.minrTotermDisp.equals(rhs.minrTotermDisp))));
    }

}
