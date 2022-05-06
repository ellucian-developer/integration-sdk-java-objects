
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
    "activityDate",
    "createdDate",
    "enddate",
    "commentCode",
    "createdBy",
    "restrictUpdateInd",
    "comment",
    "term",
    "purgeInd",
    "user",
    "origCode"
})
@Generated("jsonschema2pojo")
public class CommentCentral100PostResponse {

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_CREATED_DATE")
    private Date createdDate;
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
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("createdBy")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig")
    private String createdBy;
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
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT")
    private String comment;
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
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig")
    private String user;
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
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CommentCentral100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public CommentCentral100PostResponse withCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

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

    public CommentCentral100PostResponse withEnddate(Date enddate) {
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

    public CommentCentral100PostResponse withCommentCode(String commentCode) {
        this.commentCode = commentCode;
        return this;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public CommentCentral100PostResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public CommentCentral100PostResponse withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
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

    public CommentCentral100PostResponse withComment(String comment) {
        this.comment = comment;
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

    public CommentCentral100PostResponse withTerm(String term) {
        this.term = term;
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

    public CommentCentral100PostResponse withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public CommentCentral100PostResponse withUser(String user) {
        this.user = user;
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

    public CommentCentral100PostResponse withOrigCode(String origCode) {
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

    public CommentCentral100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentCentral100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("enddate");
        sb.append('=');
        sb.append(((this.enddate == null)?"<null>":this.enddate));
        sb.append(',');
        sb.append("commentCode");
        sb.append('=');
        sb.append(((this.commentCode == null)?"<null>":this.commentCode));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.enddate == null)? 0 :this.enddate.hashCode()));
        result = ((result* 31)+((this.commentCode == null)? 0 :this.commentCode.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentCentral100PostResponse) == false) {
            return false;
        }
        CommentCentral100PostResponse rhs = ((CommentCentral100PostResponse) other);
        return (((((((((((((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd)))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.enddate == rhs.enddate)||((this.enddate!= null)&&this.enddate.equals(rhs.enddate))))&&((this.commentCode == rhs.commentCode)||((this.commentCode!= null)&&this.commentCode.equals(rhs.commentCode))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
