
package com.ellucian.generated.bpapi.ban.curriculum_rules_rule_based_concentrations.v1_0_0;

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
    "cconMultipleMsg",
    "concFrtermDisp",
    "concTotermDisp"
})
@Generated("jsonschema2pojo")
public class SorcconCtrl {

    /**
     * Lineage reference object : cconMultipleMsg
     * 
     */
    @JsonProperty("cconMultipleMsg")
    @JsonPropertyDescription("Lineage reference object : cconMultipleMsg")
    private Object cconMultipleMsg;
    /**
     * From Term
     * <p>
     * Lineage reference object : concFrtermDisp, Lookup lineage reference object : stvterm,sorccon
     * 
     */
    @JsonProperty("concFrtermDisp")
    @JsonPropertyDescription("Lineage reference object : concFrtermDisp, Lookup lineage reference object : stvterm,sorccon")
    private Object concFrtermDisp;
    /**
     * To Term
     * <p>
     * Lineage reference object : concTotermDisp
     * 
     */
    @JsonProperty("concTotermDisp")
    @JsonPropertyDescription("Lineage reference object : concTotermDisp")
    private Object concTotermDisp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : cconMultipleMsg
     * 
     */
    @JsonProperty("cconMultipleMsg")
    public Object getCconMultipleMsg() {
        return cconMultipleMsg;
    }

    /**
     * Lineage reference object : cconMultipleMsg
     * 
     */
    @JsonProperty("cconMultipleMsg")
    public void setCconMultipleMsg(Object cconMultipleMsg) {
        this.cconMultipleMsg = cconMultipleMsg;
    }

    public SorcconCtrl withCconMultipleMsg(Object cconMultipleMsg) {
        this.cconMultipleMsg = cconMultipleMsg;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : concFrtermDisp, Lookup lineage reference object : stvterm,sorccon
     * 
     */
    @JsonProperty("concFrtermDisp")
    public Object getConcFrtermDisp() {
        return concFrtermDisp;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : concFrtermDisp, Lookup lineage reference object : stvterm,sorccon
     * 
     */
    @JsonProperty("concFrtermDisp")
    public void setConcFrtermDisp(Object concFrtermDisp) {
        this.concFrtermDisp = concFrtermDisp;
    }

    public SorcconCtrl withConcFrtermDisp(Object concFrtermDisp) {
        this.concFrtermDisp = concFrtermDisp;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : concTotermDisp
     * 
     */
    @JsonProperty("concTotermDisp")
    public Object getConcTotermDisp() {
        return concTotermDisp;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : concTotermDisp
     * 
     */
    @JsonProperty("concTotermDisp")
    public void setConcTotermDisp(Object concTotermDisp) {
        this.concTotermDisp = concTotermDisp;
    }

    public SorcconCtrl withConcTotermDisp(Object concTotermDisp) {
        this.concTotermDisp = concTotermDisp;
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

    public SorcconCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SorcconCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cconMultipleMsg");
        sb.append('=');
        sb.append(((this.cconMultipleMsg == null)?"<null>":this.cconMultipleMsg));
        sb.append(',');
        sb.append("concFrtermDisp");
        sb.append('=');
        sb.append(((this.concFrtermDisp == null)?"<null>":this.concFrtermDisp));
        sb.append(',');
        sb.append("concTotermDisp");
        sb.append('=');
        sb.append(((this.concTotermDisp == null)?"<null>":this.concTotermDisp));
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
        result = ((result* 31)+((this.cconMultipleMsg == null)? 0 :this.cconMultipleMsg.hashCode()));
        result = ((result* 31)+((this.concFrtermDisp == null)? 0 :this.concFrtermDisp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.concTotermDisp == null)? 0 :this.concTotermDisp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SorcconCtrl) == false) {
            return false;
        }
        SorcconCtrl rhs = ((SorcconCtrl) other);
        return (((((this.cconMultipleMsg == rhs.cconMultipleMsg)||((this.cconMultipleMsg!= null)&&this.cconMultipleMsg.equals(rhs.cconMultipleMsg)))&&((this.concFrtermDisp == rhs.concFrtermDisp)||((this.concFrtermDisp!= null)&&this.concFrtermDisp.equals(rhs.concFrtermDisp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.concTotermDisp == rhs.concTotermDisp)||((this.concTotermDisp!= null)&&this.concTotermDisp.equals(rhs.concTotermDisp))));
    }

}
