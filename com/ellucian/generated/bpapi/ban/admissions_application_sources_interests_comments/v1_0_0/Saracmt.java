
package com.ellucian.generated.bpapi.ban.admissions_application_sources_interests_comments.v1_0_0;

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
    "commentText",
    "origCode"
})
@Generated("jsonschema2pojo")
public class Saracmt {

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    @JsonPropertyDescription("Lineage reference object : SARACMT_COMMENT_TEXT")
    private String commentText;
    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    public String getCommentText() {
        return commentText;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Saracmt withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public Saracmt withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public Saracmt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Saracmt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commentText");
        sb.append('=');
        sb.append(((this.commentText == null)?"<null>":this.commentText));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.commentText == null)? 0 :this.commentText.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Saracmt) == false) {
            return false;
        }
        Saracmt rhs = ((Saracmt) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.commentText == rhs.commentText)||((this.commentText!= null)&&this.commentText.equals(rhs.commentText))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
