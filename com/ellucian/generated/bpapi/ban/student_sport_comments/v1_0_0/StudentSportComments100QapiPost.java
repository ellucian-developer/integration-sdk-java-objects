
package com.ellucian.generated.bpapi.ban.student_sport_comments.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "criteria.comment"
})
@Generated("jsonschema2pojo")
public class StudentSportComments100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("criteria.comment")
    private String criteriaComment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentSportComments100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public StudentSportComments100QapiPost withCriteriaComment(String criteriaComment) {
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

    public StudentSportComments100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportComments100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportComments100QapiPost) == false) {
            return false;
        }
        StudentSportComments100QapiPost rhs = ((StudentSportComments100QapiPost) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
