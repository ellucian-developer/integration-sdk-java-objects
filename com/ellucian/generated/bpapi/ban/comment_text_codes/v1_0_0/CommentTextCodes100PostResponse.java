
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
    "activityDate",
    "code",
    "comment",
    "shortDesc",
    "userId"
})
@Generated("jsonschema2pojo")
public class CommentTextCodes100PostResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_CODE")
    private String code;
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
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_SHORT_DESC")
    private String shortDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CommentTextCodes100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CommentTextCodes100PostResponse withCode(String code) {
        this.code = code;
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

    public CommentTextCodes100PostResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public CommentTextCodes100PostResponse withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTVTEXT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CommentTextCodes100PostResponse withUserId(String userId) {
        this.userId = userId;
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

    public CommentTextCodes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentTextCodes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentTextCodes100PostResponse) == false) {
            return false;
        }
        CommentTextCodes100PostResponse rhs = ((CommentTextCodes100PostResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
