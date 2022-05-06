
package com.ellucian.generated.bpapi.ban.student_sport_eligibility_and_general_comments.v1_0_0;

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
    "origDesc",
    "cmttCode",
    "cmttDesc",
    "commentText",
    "origCode"
})
@Generated("jsonschema2pojo")
public class Sgratct {

    @JsonProperty("origDesc")
    private String origDesc;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    @JsonPropertyDescription("Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt")
    private String cmttCode;
    @JsonProperty("cmttDesc")
    private String cmttDesc;
    /**
     * Comment
     * <p>
     * Lineage reference object : SGRATCT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    @JsonPropertyDescription("Lineage reference object : SGRATCT_COMMENT_TEXT")
    private String commentText;
    /**
     * Originator
     * <p>
     * Lineage reference object : SGRATCT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SGRATCT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("origDesc")
    public String getOrigDesc() {
        return origDesc;
    }

    @JsonProperty("origDesc")
    public void setOrigDesc(String origDesc) {
        this.origDesc = origDesc;
    }

    public Sgratct withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public String getCmttCode() {
        return cmttCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public void setCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
    }

    public Sgratct withCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
        return this;
    }

    @JsonProperty("cmttDesc")
    public String getCmttDesc() {
        return cmttDesc;
    }

    @JsonProperty("cmttDesc")
    public void setCmttDesc(String cmttDesc) {
        this.cmttDesc = cmttDesc;
    }

    public Sgratct withCmttDesc(String cmttDesc) {
        this.cmttDesc = cmttDesc;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SGRATCT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    public String getCommentText() {
        return commentText;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SGRATCT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Sgratct withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SGRATCT_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SGRATCT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public Sgratct withOrigCode(String origCode) {
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

    public Sgratct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgratct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origDesc");
        sb.append('=');
        sb.append(((this.origDesc == null)?"<null>":this.origDesc));
        sb.append(',');
        sb.append("cmttCode");
        sb.append('=');
        sb.append(((this.cmttCode == null)?"<null>":this.cmttCode));
        sb.append(',');
        sb.append("cmttDesc");
        sb.append('=');
        sb.append(((this.cmttDesc == null)?"<null>":this.cmttDesc));
        sb.append(',');
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
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.cmttCode == null)? 0 :this.cmttCode.hashCode()));
        result = ((result* 31)+((this.cmttDesc == null)? 0 :this.cmttDesc.hashCode()));
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
        if ((other instanceof Sgratct) == false) {
            return false;
        }
        Sgratct rhs = ((Sgratct) other);
        return (((((((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc)))&&((this.cmttCode == rhs.cmttCode)||((this.cmttCode!= null)&&this.cmttCode.equals(rhs.cmttCode))))&&((this.cmttDesc == rhs.cmttDesc)||((this.cmttDesc!= null)&&this.cmttDesc.equals(rhs.cmttDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.commentText == rhs.commentText)||((this.commentText!= null)&&this.commentText.equals(rhs.commentText))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
