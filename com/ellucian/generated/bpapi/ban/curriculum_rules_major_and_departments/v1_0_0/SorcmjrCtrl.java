
package com.ellucian.generated.bpapi.ban.curriculum_rules_major_and_departments.v1_0_0;

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
    "majrTotermDisp",
    "majrFrtermDisp",
    "cmjrMultipleMsg"
})
@Generated("jsonschema2pojo")
public class SorcmjrCtrl {

    /**
     * To Term
     * <p>
     * Lineage reference object : majrTotermDisp
     * 
     */
    @JsonProperty("majrTotermDisp")
    @JsonPropertyDescription("Lineage reference object : majrTotermDisp")
    private String majrTotermDisp;
    /**
     * From Term
     * <p>
     * Lineage reference object : majrFrtermDisp, Lookup lineage reference object : sorcmjr,stvterm
     * 
     */
    @JsonProperty("majrFrtermDisp")
    @JsonPropertyDescription("Lineage reference object : majrFrtermDisp, Lookup lineage reference object : sorcmjr,stvterm")
    private String majrFrtermDisp;
    /**
     * Lineage reference object : cmjrMultipleMsg
     * 
     */
    @JsonProperty("cmjrMultipleMsg")
    @JsonPropertyDescription("Lineage reference object : cmjrMultipleMsg")
    private String cmjrMultipleMsg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : majrTotermDisp
     * 
     */
    @JsonProperty("majrTotermDisp")
    public String getMajrTotermDisp() {
        return majrTotermDisp;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : majrTotermDisp
     * 
     */
    @JsonProperty("majrTotermDisp")
    public void setMajrTotermDisp(String majrTotermDisp) {
        this.majrTotermDisp = majrTotermDisp;
    }

    public SorcmjrCtrl withMajrTotermDisp(String majrTotermDisp) {
        this.majrTotermDisp = majrTotermDisp;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : majrFrtermDisp, Lookup lineage reference object : sorcmjr,stvterm
     * 
     */
    @JsonProperty("majrFrtermDisp")
    public String getMajrFrtermDisp() {
        return majrFrtermDisp;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : majrFrtermDisp, Lookup lineage reference object : sorcmjr,stvterm
     * 
     */
    @JsonProperty("majrFrtermDisp")
    public void setMajrFrtermDisp(String majrFrtermDisp) {
        this.majrFrtermDisp = majrFrtermDisp;
    }

    public SorcmjrCtrl withMajrFrtermDisp(String majrFrtermDisp) {
        this.majrFrtermDisp = majrFrtermDisp;
        return this;
    }

    /**
     * Lineage reference object : cmjrMultipleMsg
     * 
     */
    @JsonProperty("cmjrMultipleMsg")
    public String getCmjrMultipleMsg() {
        return cmjrMultipleMsg;
    }

    /**
     * Lineage reference object : cmjrMultipleMsg
     * 
     */
    @JsonProperty("cmjrMultipleMsg")
    public void setCmjrMultipleMsg(String cmjrMultipleMsg) {
        this.cmjrMultipleMsg = cmjrMultipleMsg;
    }

    public SorcmjrCtrl withCmjrMultipleMsg(String cmjrMultipleMsg) {
        this.cmjrMultipleMsg = cmjrMultipleMsg;
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

    public SorcmjrCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SorcmjrCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majrTotermDisp");
        sb.append('=');
        sb.append(((this.majrTotermDisp == null)?"<null>":this.majrTotermDisp));
        sb.append(',');
        sb.append("majrFrtermDisp");
        sb.append('=');
        sb.append(((this.majrFrtermDisp == null)?"<null>":this.majrFrtermDisp));
        sb.append(',');
        sb.append("cmjrMultipleMsg");
        sb.append('=');
        sb.append(((this.cmjrMultipleMsg == null)?"<null>":this.cmjrMultipleMsg));
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
        result = ((result* 31)+((this.majrFrtermDisp == null)? 0 :this.majrFrtermDisp.hashCode()));
        result = ((result* 31)+((this.majrTotermDisp == null)? 0 :this.majrTotermDisp.hashCode()));
        result = ((result* 31)+((this.cmjrMultipleMsg == null)? 0 :this.cmjrMultipleMsg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SorcmjrCtrl) == false) {
            return false;
        }
        SorcmjrCtrl rhs = ((SorcmjrCtrl) other);
        return (((((this.majrFrtermDisp == rhs.majrFrtermDisp)||((this.majrFrtermDisp!= null)&&this.majrFrtermDisp.equals(rhs.majrFrtermDisp)))&&((this.majrTotermDisp == rhs.majrTotermDisp)||((this.majrTotermDisp!= null)&&this.majrTotermDisp.equals(rhs.majrTotermDisp))))&&((this.cmjrMultipleMsg == rhs.cmjrMultipleMsg)||((this.cmjrMultipleMsg!= null)&&this.cmjrMultipleMsg.equals(rhs.cmjrMultipleMsg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
