
package com.ellucian.generated.bpapi.ban.student_sport_comments.v1_0_0;

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
    "commentText"
})
@Generated("jsonschema2pojo")
public class StudentSportComments100GetResponse {

    /**
     * Comments
     * <p>
     * Lineage reference object : SGRCMNT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    @JsonPropertyDescription("Lineage reference object : SGRCMNT_COMMENT_TEXT")
    private String commentText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Comments
     * <p>
     * Lineage reference object : SGRCMNT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    public String getCommentText() {
        return commentText;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SGRCMNT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("commentText")
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public StudentSportComments100GetResponse withCommentText(String commentText) {
        this.commentText = commentText;
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

    public StudentSportComments100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportComments100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commentText");
        sb.append('=');
        sb.append(((this.commentText == null)?"<null>":this.commentText));
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
        result = ((result* 31)+((this.commentText == null)? 0 :this.commentText.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportComments100GetResponse) == false) {
            return false;
        }
        StudentSportComments100GetResponse rhs = ((StudentSportComments100GetResponse) other);
        return (((this.commentText == rhs.commentText)||((this.commentText!= null)&&this.commentText.equals(rhs.commentText)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
