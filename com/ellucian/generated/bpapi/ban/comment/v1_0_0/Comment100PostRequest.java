
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
    "cmtyCode",
    "id",
    "text"
})
@Generated("jsonschema2pojo")
public class Comment100PostRequest {

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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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

    public Comment100PostRequest withCmtyCode(String cmtyCode) {
        this.cmtyCode = cmtyCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Comment100PostRequest withId(String id) {
        this.id = id;
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

    public Comment100PostRequest withText(String text) {
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

    public Comment100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cmtyCode");
        sb.append('=');
        sb.append(((this.cmtyCode == null)?"<null>":this.cmtyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comment100PostRequest) == false) {
            return false;
        }
        Comment100PostRequest rhs = ((Comment100PostRequest) other);
        return (((((this.cmtyCode == rhs.cmtyCode)||((this.cmtyCode!= null)&&this.cmtyCode.equals(rhs.cmtyCode)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
