
package com.ellucian.generated.bpapi.ban.applicant_information_interview_log.v1_0_0;

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
    "amPmIndicator",
    "interviewTime12hrs",
    "activityDate",
    "interviewerLname",
    "interviewDate",
    "comment",
    "interviewerId",
    "userId"
})
@Generated("jsonschema2pojo")
public class ApplicantInformationInterviewLog100GetResponse {

    @JsonProperty("amPmIndicator")
    private String amPmIndicator;
    /**
     * Time
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("interviewTime12hrs")
    private String interviewTime12hrs;
    /**
     * Lineage reference object : PARAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PARAPIN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("interviewerLname")
    private String interviewerLname;
    /**
     * Date
     * <p>
     * Lineage reference object : PARAPIN_INTERVIEW_DATE
     * (Required)
     * 
     */
    @JsonProperty("interviewDate")
    @JsonPropertyDescription("Lineage reference object : PARAPIN_INTERVIEW_DATE")
    private Date interviewDate;
    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPIN_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : PARAPIN_COMMENT")
    private String comment;
    /**
     * Interviewer
     * <p>
     * 
     * 
     */
    @JsonProperty("interviewerId")
    private String interviewerId;
    /**
     * Lineage reference object : PARAPIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PARAPIN_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amPmIndicator")
    public String getAmPmIndicator() {
        return amPmIndicator;
    }

    @JsonProperty("amPmIndicator")
    public void setAmPmIndicator(String amPmIndicator) {
        this.amPmIndicator = amPmIndicator;
    }

    public ApplicantInformationInterviewLog100GetResponse withAmPmIndicator(String amPmIndicator) {
        this.amPmIndicator = amPmIndicator;
        return this;
    }

    /**
     * Time
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("interviewTime12hrs")
    public String getInterviewTime12hrs() {
        return interviewTime12hrs;
    }

    /**
     * Time
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("interviewTime12hrs")
    public void setInterviewTime12hrs(String interviewTime12hrs) {
        this.interviewTime12hrs = interviewTime12hrs;
    }

    public ApplicantInformationInterviewLog100GetResponse withInterviewTime12hrs(String interviewTime12hrs) {
        this.interviewTime12hrs = interviewTime12hrs;
        return this;
    }

    /**
     * Lineage reference object : PARAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PARAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApplicantInformationInterviewLog100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("interviewerLname")
    public String getInterviewerLname() {
        return interviewerLname;
    }

    @JsonProperty("interviewerLname")
    public void setInterviewerLname(String interviewerLname) {
        this.interviewerLname = interviewerLname;
    }

    public ApplicantInformationInterviewLog100GetResponse withInterviewerLname(String interviewerLname) {
        this.interviewerLname = interviewerLname;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PARAPIN_INTERVIEW_DATE
     * (Required)
     * 
     */
    @JsonProperty("interviewDate")
    public Date getInterviewDate() {
        return interviewDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PARAPIN_INTERVIEW_DATE
     * (Required)
     * 
     */
    @JsonProperty("interviewDate")
    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public ApplicantInformationInterviewLog100GetResponse withInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPIN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPIN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ApplicantInformationInterviewLog100GetResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Interviewer
     * <p>
     * 
     * 
     */
    @JsonProperty("interviewerId")
    public String getInterviewerId() {
        return interviewerId;
    }

    /**
     * Interviewer
     * <p>
     * 
     * 
     */
    @JsonProperty("interviewerId")
    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    public ApplicantInformationInterviewLog100GetResponse withInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
        return this;
    }

    /**
     * Lineage reference object : PARAPIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PARAPIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApplicantInformationInterviewLog100GetResponse withUserId(String userId) {
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

    public ApplicantInformationInterviewLog100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantInformationInterviewLog100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amPmIndicator");
        sb.append('=');
        sb.append(((this.amPmIndicator == null)?"<null>":this.amPmIndicator));
        sb.append(',');
        sb.append("interviewTime12hrs");
        sb.append('=');
        sb.append(((this.interviewTime12hrs == null)?"<null>":this.interviewTime12hrs));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("interviewerLname");
        sb.append('=');
        sb.append(((this.interviewerLname == null)?"<null>":this.interviewerLname));
        sb.append(',');
        sb.append("interviewDate");
        sb.append('=');
        sb.append(((this.interviewDate == null)?"<null>":this.interviewDate));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("interviewerId");
        sb.append('=');
        sb.append(((this.interviewerId == null)?"<null>":this.interviewerId));
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
        result = ((result* 31)+((this.amPmIndicator == null)? 0 :this.amPmIndicator.hashCode()));
        result = ((result* 31)+((this.interviewTime12hrs == null)? 0 :this.interviewTime12hrs.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.interviewerLname == null)? 0 :this.interviewerLname.hashCode()));
        result = ((result* 31)+((this.interviewDate == null)? 0 :this.interviewDate.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.interviewerId == null)? 0 :this.interviewerId.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantInformationInterviewLog100GetResponse) == false) {
            return false;
        }
        ApplicantInformationInterviewLog100GetResponse rhs = ((ApplicantInformationInterviewLog100GetResponse) other);
        return ((((((((((this.amPmIndicator == rhs.amPmIndicator)||((this.amPmIndicator!= null)&&this.amPmIndicator.equals(rhs.amPmIndicator)))&&((this.interviewTime12hrs == rhs.interviewTime12hrs)||((this.interviewTime12hrs!= null)&&this.interviewTime12hrs.equals(rhs.interviewTime12hrs))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.interviewerLname == rhs.interviewerLname)||((this.interviewerLname!= null)&&this.interviewerLname.equals(rhs.interviewerLname))))&&((this.interviewDate == rhs.interviewDate)||((this.interviewDate!= null)&&this.interviewDate.equals(rhs.interviewDate))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.interviewerId == rhs.interviewerId)||((this.interviewerId!= null)&&this.interviewerId.equals(rhs.interviewerId))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
