
package com.ellucian.generated.bpapi.ban.comment.v1_0_0;

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
    "cmtyDesc",
    "cmtyCode",
    "text"
})
@Generated("jsonschema2pojo")
public class Pprccmt__1 {

    @JsonProperty("cmtyDesc")
    private String cmtyDesc;
    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty")
    private String cmtyCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cmtyDesc")
    public String getCmtyDesc() {
        return cmtyDesc;
    }

    @JsonProperty("cmtyDesc")
    public void setCmtyDesc(String cmtyDesc) {
        this.cmtyDesc = cmtyDesc;
    }

    public Pprccmt__1 withCmtyDesc(String cmtyDesc) {
        this.cmtyDesc = cmtyDesc;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    public String getCmtyCode() {
        return cmtyCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    public void setCmtyCode(String cmtyCode) {
        this.cmtyCode = cmtyCode;
    }

    public Pprccmt__1 withCmtyCode(String cmtyCode) {
        this.cmtyCode = cmtyCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Pprccmt__1 withText(String text) {
        this.text = text;
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

    public Pprccmt__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pprccmt__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cmtyDesc");
        sb.append('=');
        sb.append(((this.cmtyDesc == null)?"<null>":this.cmtyDesc));
        sb.append(',');
        sb.append("cmtyCode");
        sb.append('=');
        sb.append(((this.cmtyCode == null)?"<null>":this.cmtyCode));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.cmtyCode == null)? 0 :this.cmtyCode.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cmtyDesc == null)? 0 :this.cmtyDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pprccmt__1) == false) {
            return false;
        }
        Pprccmt__1 rhs = ((Pprccmt__1) other);
        return (((((this.cmtyCode == rhs.cmtyCode)||((this.cmtyCode!= null)&&this.cmtyCode.equals(rhs.cmtyCode)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cmtyDesc == rhs.cmtyDesc)||((this.cmtyDesc!= null)&&this.cmtyDesc.equals(rhs.cmtyDesc))));
    }

}
