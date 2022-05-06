
package com.ellucian.generated.bpapi.ban.comment_text_codes.v1_0_0;

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
    "criteria.code",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.shortDesc",
    "comment",
    "criteria.comment"
})
@Generated("jsonschema2pojo")
public class CommentTextCodes100PutRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_CODE")
    private String criteriaCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_SHORT_DESC")
    private String criteriaShortDesc;
    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_COMMENT")
    private String comment;
    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_COMMENT")
    private String criteriaComment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public CommentTextCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public CommentTextCodes100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CommentTextCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    public String getCriteriaShortDesc() {
        return criteriaShortDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    public void setCriteriaShortDesc(String criteriaShortDesc) {
        this.criteriaShortDesc = criteriaShortDesc;
    }

    public CommentTextCodes100PutRequest withCriteriaShortDesc(String criteriaShortDesc) {
        this.criteriaShortDesc = criteriaShortDesc;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentTextCodes100PutRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public CommentTextCodes100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
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

    public CommentTextCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentTextCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaShortDesc");
        sb.append('=');
        sb.append(((this.criteriaShortDesc == null)?"<null>":this.criteriaShortDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaShortDesc == null)? 0 :this.criteriaShortDesc.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentTextCodes100PutRequest) == false) {
            return false;
        }
        CommentTextCodes100PutRequest rhs = ((CommentTextCodes100PutRequest) other);
        return ((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaShortDesc == rhs.criteriaShortDesc)||((this.criteriaShortDesc!= null)&&this.criteriaShortDesc.equals(rhs.criteriaShortDesc))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
