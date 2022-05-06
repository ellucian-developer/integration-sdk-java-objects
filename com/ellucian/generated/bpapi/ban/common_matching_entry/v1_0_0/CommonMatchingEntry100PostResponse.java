
package com.ellucian.generated.bpapi.ban.common_matching_entry.v1_0_0;

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
    "keyblockSourceComment",
    "keyblockSourceCode",
    "id",
    "keyblockSourceDesc"
})
@Generated("jsonschema2pojo")
public class CommonMatchingEntry100PostResponse {

    /**
     * Lineage reference object : keyblockSourceComment
     * 
     */
    @JsonProperty("keyblockSourceComment")
    @JsonPropertyDescription("Lineage reference object : keyblockSourceComment")
    private Object keyblockSourceComment;
    /**
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    @JsonPropertyDescription("Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc")
    private Object keyblockSourceCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Lineage reference object : keyblockSourceDesc
     * 
     */
    @JsonProperty("keyblockSourceDesc")
    @JsonPropertyDescription("Lineage reference object : keyblockSourceDesc")
    private Object keyblockSourceDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : keyblockSourceComment
     * 
     */
    @JsonProperty("keyblockSourceComment")
    public Object getKeyblockSourceComment() {
        return keyblockSourceComment;
    }

    /**
     * Lineage reference object : keyblockSourceComment
     * 
     */
    @JsonProperty("keyblockSourceComment")
    public void setKeyblockSourceComment(Object keyblockSourceComment) {
        this.keyblockSourceComment = keyblockSourceComment;
    }

    public CommonMatchingEntry100PostResponse withKeyblockSourceComment(Object keyblockSourceComment) {
        this.keyblockSourceComment = keyblockSourceComment;
        return this;
    }

    /**
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    public Object getKeyblockSourceCode() {
        return keyblockSourceCode;
    }

    /**
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    public void setKeyblockSourceCode(Object keyblockSourceCode) {
        this.keyblockSourceCode = keyblockSourceCode;
    }

    public CommonMatchingEntry100PostResponse withKeyblockSourceCode(Object keyblockSourceCode) {
        this.keyblockSourceCode = keyblockSourceCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CommonMatchingEntry100PostResponse withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : keyblockSourceDesc
     * 
     */
    @JsonProperty("keyblockSourceDesc")
    public Object getKeyblockSourceDesc() {
        return keyblockSourceDesc;
    }

    /**
     * Lineage reference object : keyblockSourceDesc
     * 
     */
    @JsonProperty("keyblockSourceDesc")
    public void setKeyblockSourceDesc(Object keyblockSourceDesc) {
        this.keyblockSourceDesc = keyblockSourceDesc;
    }

    public CommonMatchingEntry100PostResponse withKeyblockSourceDesc(Object keyblockSourceDesc) {
        this.keyblockSourceDesc = keyblockSourceDesc;
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

    public CommonMatchingEntry100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonMatchingEntry100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblockSourceComment");
        sb.append('=');
        sb.append(((this.keyblockSourceComment == null)?"<null>":this.keyblockSourceComment));
        sb.append(',');
        sb.append("keyblockSourceCode");
        sb.append('=');
        sb.append(((this.keyblockSourceCode == null)?"<null>":this.keyblockSourceCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblockSourceDesc");
        sb.append('=');
        sb.append(((this.keyblockSourceDesc == null)?"<null>":this.keyblockSourceDesc));
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
        result = ((result* 31)+((this.keyblockSourceComment == null)? 0 :this.keyblockSourceComment.hashCode()));
        result = ((result* 31)+((this.keyblockSourceCode == null)? 0 :this.keyblockSourceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblockSourceDesc == null)? 0 :this.keyblockSourceDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonMatchingEntry100PostResponse) == false) {
            return false;
        }
        CommonMatchingEntry100PostResponse rhs = ((CommonMatchingEntry100PostResponse) other);
        return ((((((this.keyblockSourceComment == rhs.keyblockSourceComment)||((this.keyblockSourceComment!= null)&&this.keyblockSourceComment.equals(rhs.keyblockSourceComment)))&&((this.keyblockSourceCode == rhs.keyblockSourceCode)||((this.keyblockSourceCode!= null)&&this.keyblockSourceCode.equals(rhs.keyblockSourceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblockSourceDesc == rhs.keyblockSourceDesc)||((this.keyblockSourceDesc!= null)&&this.keyblockSourceDesc.equals(rhs.keyblockSourceDesc))));
    }

}
