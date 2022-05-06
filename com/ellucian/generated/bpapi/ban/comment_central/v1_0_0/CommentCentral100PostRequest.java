
package com.ellucian.generated.bpapi.ban.comment_central.v1_0_0;

import java.util.Date;
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
    "enddate",
    "commentCode",
    "restrictUpdateInd",
    "term",
    "comment",
    "id",
    "purgeInd",
    "origCode"
})
@Generated("jsonschema2pojo")
public class CommentCentral100PostRequest {

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ENDDATE")
    private Date enddate;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("commentCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt")
    private String commentCode;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND")
    private String restrictUpdateInd;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm")
    private String term;
    /**
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT")
    private String comment;
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
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    public Date getEnddate() {
        return enddate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public CommentCentral100PostRequest withEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("commentCode")
    public String getCommentCode() {
        return commentCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("commentCode")
    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode;
    }

    public CommentCentral100PostRequest withCommentCode(String commentCode) {
        this.commentCode = commentCode;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public String getRestrictUpdateInd() {
        return restrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public void setRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
    }

    public CommentCentral100PostRequest withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public CommentCentral100PostRequest withTerm(String term) {
        this.term = term;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentCentral100PostRequest withComment(String comment) {
        this.comment = comment;
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

    public CommentCentral100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public String getPurgeInd() {
        return purgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public void setPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
    }

    public CommentCentral100PostRequest withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CommentCentral100PostRequest withOrigCode(String origCode) {
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

    public CommentCentral100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentCentral100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enddate");
        sb.append('=');
        sb.append(((this.enddate == null)?"<null>":this.enddate));
        sb.append(',');
        sb.append("commentCode");
        sb.append('=');
        sb.append(((this.commentCode == null)?"<null>":this.commentCode));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
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
        result = ((result* 31)+((this.enddate == null)? 0 :this.enddate.hashCode()));
        result = ((result* 31)+((this.commentCode == null)? 0 :this.commentCode.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentCentral100PostRequest) == false) {
            return false;
        }
        CommentCentral100PostRequest rhs = ((CommentCentral100PostRequest) other);
        return ((((((((((this.enddate == rhs.enddate)||((this.enddate!= null)&&this.enddate.equals(rhs.enddate)))&&((this.commentCode == rhs.commentCode)||((this.commentCode!= null)&&this.commentCode.equals(rhs.commentCode))))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
