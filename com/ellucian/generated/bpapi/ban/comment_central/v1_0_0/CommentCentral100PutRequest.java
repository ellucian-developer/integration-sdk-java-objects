
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
    "criteria.origCode",
    "criteria.activityDate",
    "restrictUpdateInd",
    "purgeInd",
    "criteria.restrictUpdateInd",
    "criteria.user",
    "criteria.term",
    "origCode",
    "createdDate",
    "activityDate",
    "enddate",
    "criteria.createdDate",
    "criteria.commentCode",
    "commentCode",
    "createdBy",
    "criteria.createdBy",
    "criteria.enddate",
    "term",
    "comment",
    "id",
    "criteria.comment",
    "user",
    "criteria.purgeInd"
})
@Generated("jsonschema2pojo")
public class CommentCentral100PutRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND")
    private String criteriaRestrictUpdateInd;
    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.user")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig")
    private String criteriaUser;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm")
    private String criteriaTerm;
    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
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
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ACTIVITY_DATE")
    private Date activityDate;
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
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_CREATED_DATE")
    private Date criteriaCreatedDate;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("criteria.commentCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt")
    private String criteriaCommentCode;
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
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.createdBy")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig")
    private String criteriaCreatedBy;
    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("criteria.enddate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ENDDATE")
    private Date criteriaEnddate;
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
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT")
    private String criteriaComment;
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
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_PURGE_IND")
    private String criteriaPurgeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public CommentCentral100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : TBRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CommentCentral100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public CommentCentral100PutRequest withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
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

    public CommentCentral100PutRequest withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    public String getCriteriaRestrictUpdateInd() {
        return criteriaRestrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    public void setCriteriaRestrictUpdateInd(String criteriaRestrictUpdateInd) {
        this.criteriaRestrictUpdateInd = criteriaRestrictUpdateInd;
    }

    public CommentCentral100PutRequest withCriteriaRestrictUpdateInd(String criteriaRestrictUpdateInd) {
        this.criteriaRestrictUpdateInd = criteriaRestrictUpdateInd;
        return this;
    }

    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.user")
    public String getCriteriaUser() {
        return criteriaUser;
    }

    /**
     * Last Updated User
     * <p>
     * Lineage reference object : TBRCMNT_USER, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.user")
    public void setCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
    }

    public CommentCentral100PutRequest withCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public String getCriteriaTerm() {
        return criteriaTerm;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public void setCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
    }

    public CommentCentral100PutRequest withCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
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

    public CommentCentral100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public CommentCentral100PutRequest withCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

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

    public CommentCentral100PutRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public CommentCentral100PutRequest withEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    public Date getCriteriaCreatedDate() {
        return criteriaCreatedDate;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    public void setCriteriaCreatedDate(Date criteriaCreatedDate) {
        this.criteriaCreatedDate = criteriaCreatedDate;
    }

    public CommentCentral100PutRequest withCriteriaCreatedDate(Date criteriaCreatedDate) {
        this.criteriaCreatedDate = criteriaCreatedDate;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("criteria.commentCode")
    public String getCriteriaCommentCode() {
        return criteriaCommentCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("criteria.commentCode")
    public void setCriteriaCommentCode(String criteriaCommentCode) {
        this.criteriaCommentCode = criteriaCommentCode;
    }

    public CommentCentral100PutRequest withCriteriaCommentCode(String criteriaCommentCode) {
        this.criteriaCommentCode = criteriaCommentCode;
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

    public CommentCentral100PutRequest withCommentCode(String commentCode) {
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

    public CommentCentral100PutRequest withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.createdBy")
    public String getCriteriaCreatedBy() {
        return criteriaCreatedBy;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : TBRCMNT_CREATED_BY, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.createdBy")
    public void setCriteriaCreatedBy(String criteriaCreatedBy) {
        this.criteriaCreatedBy = criteriaCreatedBy;
    }

    public CommentCentral100PutRequest withCriteriaCreatedBy(String criteriaCreatedBy) {
        this.criteriaCreatedBy = criteriaCreatedBy;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("criteria.enddate")
    public Date getCriteriaEnddate() {
        return criteriaEnddate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("criteria.enddate")
    public void setCriteriaEnddate(Date criteriaEnddate) {
        this.criteriaEnddate = criteriaEnddate;
    }

    public CommentCentral100PutRequest withCriteriaEnddate(Date criteriaEnddate) {
        this.criteriaEnddate = criteriaEnddate;
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

    public CommentCentral100PutRequest withTerm(String term) {
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

    public CommentCentral100PutRequest withComment(String comment) {
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

    public CommentCentral100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public CommentCentral100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
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

    public CommentCentral100PutRequest withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    public String getCriteriaPurgeInd() {
        return criteriaPurgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    public void setCriteriaPurgeInd(String criteriaPurgeInd) {
        this.criteriaPurgeInd = criteriaPurgeInd;
    }

    public CommentCentral100PutRequest withCriteriaPurgeInd(String criteriaPurgeInd) {
        this.criteriaPurgeInd = criteriaPurgeInd;
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

    public CommentCentral100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentCentral100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("criteriaRestrictUpdateInd");
        sb.append('=');
        sb.append(((this.criteriaRestrictUpdateInd == null)?"<null>":this.criteriaRestrictUpdateInd));
        sb.append(',');
        sb.append("criteriaUser");
        sb.append('=');
        sb.append(((this.criteriaUser == null)?"<null>":this.criteriaUser));
        sb.append(',');
        sb.append("criteriaTerm");
        sb.append('=');
        sb.append(((this.criteriaTerm == null)?"<null>":this.criteriaTerm));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("enddate");
        sb.append('=');
        sb.append(((this.enddate == null)?"<null>":this.enddate));
        sb.append(',');
        sb.append("criteriaCreatedDate");
        sb.append('=');
        sb.append(((this.criteriaCreatedDate == null)?"<null>":this.criteriaCreatedDate));
        sb.append(',');
        sb.append("criteriaCommentCode");
        sb.append('=');
        sb.append(((this.criteriaCommentCode == null)?"<null>":this.criteriaCommentCode));
        sb.append(',');
        sb.append("commentCode");
        sb.append('=');
        sb.append(((this.commentCode == null)?"<null>":this.commentCode));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("criteriaCreatedBy");
        sb.append('=');
        sb.append(((this.criteriaCreatedBy == null)?"<null>":this.criteriaCreatedBy));
        sb.append(',');
        sb.append("criteriaEnddate");
        sb.append('=');
        sb.append(((this.criteriaEnddate == null)?"<null>":this.criteriaEnddate));
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
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("criteriaPurgeInd");
        sb.append('=');
        sb.append(((this.criteriaPurgeInd == null)?"<null>":this.criteriaPurgeInd));
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
        result = ((result* 31)+((this.criteriaRestrictUpdateInd == null)? 0 :this.criteriaRestrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.criteriaCommentCode == null)? 0 :this.criteriaCommentCode.hashCode()));
        result = ((result* 31)+((this.criteriaEnddate == null)? 0 :this.criteriaEnddate.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaPurgeInd == null)? 0 :this.criteriaPurgeInd.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaTerm == null)? 0 :this.criteriaTerm.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.criteriaCreatedBy == null)? 0 :this.criteriaCreatedBy.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.enddate == null)? 0 :this.enddate.hashCode()));
        result = ((result* 31)+((this.commentCode == null)? 0 :this.commentCode.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.criteriaCreatedDate == null)? 0 :this.criteriaCreatedDate.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.criteriaUser == null)? 0 :this.criteriaUser.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentCentral100PutRequest) == false) {
            return false;
        }
        CommentCentral100PutRequest rhs = ((CommentCentral100PutRequest) other);
        return (((((((((((((((((((((((((this.criteriaRestrictUpdateInd == rhs.criteriaRestrictUpdateInd)||((this.criteriaRestrictUpdateInd!= null)&&this.criteriaRestrictUpdateInd.equals(rhs.criteriaRestrictUpdateInd)))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.criteriaCommentCode == rhs.criteriaCommentCode)||((this.criteriaCommentCode!= null)&&this.criteriaCommentCode.equals(rhs.criteriaCommentCode))))&&((this.criteriaEnddate == rhs.criteriaEnddate)||((this.criteriaEnddate!= null)&&this.criteriaEnddate.equals(rhs.criteriaEnddate))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaPurgeInd == rhs.criteriaPurgeInd)||((this.criteriaPurgeInd!= null)&&this.criteriaPurgeInd.equals(rhs.criteriaPurgeInd))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaTerm == rhs.criteriaTerm)||((this.criteriaTerm!= null)&&this.criteriaTerm.equals(rhs.criteriaTerm))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.criteriaCreatedBy == rhs.criteriaCreatedBy)||((this.criteriaCreatedBy!= null)&&this.criteriaCreatedBy.equals(rhs.criteriaCreatedBy))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.enddate == rhs.enddate)||((this.enddate!= null)&&this.enddate.equals(rhs.enddate))))&&((this.commentCode == rhs.commentCode)||((this.commentCode!= null)&&this.commentCode.equals(rhs.commentCode))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.criteriaCreatedDate == rhs.criteriaCreatedDate)||((this.criteriaCreatedDate!= null)&&this.criteriaCreatedDate.equals(rhs.criteriaCreatedDate))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.criteriaUser == rhs.criteriaUser)||((this.criteriaUser!= null)&&this.criteriaUser.equals(rhs.criteriaUser))));
    }

}
