
package com.ellucian.generated.bpapi.ban.student_sport_eligibility_and_general_comments.v1_0_0;

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
    "criteria.date",
    "activityDate",
    "userId",
    "criteria.commCode"
})
@Generated("jsonschema2pojo")
public class StudentSportEligibilityAndGeneralComments100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("criteria.date")
    private String criteriaDate;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("criteria.commCode")
    private String criteriaCommCode;
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

    public StudentSportEligibilityAndGeneralComments100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("criteria.date")
    public String getCriteriaDate() {
        return criteriaDate;
    }

    @JsonProperty("criteria.date")
    public void setCriteriaDate(String criteriaDate) {
        this.criteriaDate = criteriaDate;
    }

    public StudentSportEligibilityAndGeneralComments100QapiPost withCriteriaDate(String criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public StudentSportEligibilityAndGeneralComments100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentSportEligibilityAndGeneralComments100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("criteria.commCode")
    public String getCriteriaCommCode() {
        return criteriaCommCode;
    }

    @JsonProperty("criteria.commCode")
    public void setCriteriaCommCode(String criteriaCommCode) {
        this.criteriaCommCode = criteriaCommCode;
    }

    public StudentSportEligibilityAndGeneralComments100QapiPost withCriteriaCommCode(String criteriaCommCode) {
        this.criteriaCommCode = criteriaCommCode;
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

    public StudentSportEligibilityAndGeneralComments100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportEligibilityAndGeneralComments100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaDate");
        sb.append('=');
        sb.append(((this.criteriaDate == null)?"<null>":this.criteriaDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("criteriaCommCode");
        sb.append('=');
        sb.append(((this.criteriaCommCode == null)?"<null>":this.criteriaCommCode));
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
        result = ((result* 31)+((this.criteriaDate == null)? 0 :this.criteriaDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCommCode == null)? 0 :this.criteriaCommCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportEligibilityAndGeneralComments100QapiPost) == false) {
            return false;
        }
        StudentSportEligibilityAndGeneralComments100QapiPost rhs = ((StudentSportEligibilityAndGeneralComments100QapiPost) other);
        return (((((((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaCommCode == rhs.criteriaCommCode)||((this.criteriaCommCode!= null)&&this.criteriaCommCode.equals(rhs.criteriaCommCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
