
package com.ellucian.generated.bpapi.ban.student_sport_eligibility_and_general_comments.v1_0_0;

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
    "criteria.date",
    "criteria.activityDate",
    "criteria.userId",
    "terms",
    "firstDate",
    "comment",
    "id",
    "criteria.commCode",
    "lastDate"
})
@Generated("jsonschema2pojo")
public class StudentSportEligibilityAndGeneralComments100PutRequest {

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_ATTEND_FROM_DATE")
    private Date criteriaDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_USER_ID")
    private String criteriaUserId;
    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("terms")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND")
    private Double terms;
    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("firstDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_ATTEND_FROM_DATE")
    private Date firstDate;
    /**
     * Comment
     * <p>
     * Lineage reference object : SGRATCT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SGRATCT_COMMENT_TEXT")
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
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.commCode")
    @JsonPropertyDescription("Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt")
    private String criteriaCommCode;
    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("lastDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE")
    private Date lastDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public Date getCriteriaDate() {
        return criteriaDate;
    }

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public void setCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("terms")
    public Double getTerms() {
        return terms;
    }

    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("terms")
    public void setTerms(Double terms) {
        this.terms = terms;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withTerms(Double terms) {
        this.terms = terms;
        return this;
    }

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("firstDate")
    public Date getFirstDate() {
        return firstDate;
    }

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("firstDate")
    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withFirstDate(Date firstDate) {
        this.firstDate = firstDate;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SGRATCT_COMMENT_TEXT
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
     * Lineage reference object : SGRATCT_COMMENT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withComment(String comment) {
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

    public StudentSportEligibilityAndGeneralComments100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.commCode")
    public String getCriteriaCommCode() {
        return criteriaCommCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SGRATCT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.commCode")
    public void setCriteriaCommCode(String criteriaCommCode) {
        this.criteriaCommCode = criteriaCommCode;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withCriteriaCommCode(String criteriaCommCode) {
        this.criteriaCommCode = criteriaCommCode;
        return this;
    }

    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("lastDate")
    public Date getLastDate() {
        return lastDate;
    }

    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("lastDate")
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public StudentSportEligibilityAndGeneralComments100PutRequest withLastDate(Date lastDate) {
        this.lastDate = lastDate;
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

    public StudentSportEligibilityAndGeneralComments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportEligibilityAndGeneralComments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDate");
        sb.append('=');
        sb.append(((this.criteriaDate == null)?"<null>":this.criteriaDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("terms");
        sb.append('=');
        sb.append(((this.terms == null)?"<null>":this.terms));
        sb.append(',');
        sb.append("firstDate");
        sb.append('=');
        sb.append(((this.firstDate == null)?"<null>":this.firstDate));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaCommCode");
        sb.append('=');
        sb.append(((this.criteriaCommCode == null)?"<null>":this.criteriaCommCode));
        sb.append(',');
        sb.append("lastDate");
        sb.append('=');
        sb.append(((this.lastDate == null)?"<null>":this.lastDate));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.terms == null)? 0 :this.terms.hashCode()));
        result = ((result* 31)+((this.firstDate == null)? 0 :this.firstDate.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.criteriaCommCode == null)? 0 :this.criteriaCommCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lastDate == null)? 0 :this.lastDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportEligibilityAndGeneralComments100PutRequest) == false) {
            return false;
        }
        StudentSportEligibilityAndGeneralComments100PutRequest rhs = ((StudentSportEligibilityAndGeneralComments100PutRequest) other);
        return (((((((((((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.terms == rhs.terms)||((this.terms!= null)&&this.terms.equals(rhs.terms))))&&((this.firstDate == rhs.firstDate)||((this.firstDate!= null)&&this.firstDate.equals(rhs.firstDate))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.criteriaCommCode == rhs.criteriaCommCode)||((this.criteriaCommCode!= null)&&this.criteriaCommCode.equals(rhs.criteriaCommCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lastDate == rhs.lastDate)||((this.lastDate!= null)&&this.lastDate.equals(rhs.lastDate))));
    }

}
