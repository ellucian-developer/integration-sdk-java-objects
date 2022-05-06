
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
    "recruitInd",
    "activityDate",
    "initialEnrollDat",
    "attendFromDate",
    "totalTermsAttend",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sgrathe {

    /**
     * Lineage reference object : SGRATHE_RECRUIT_IND
     * 
     */
    @JsonProperty("recruitInd")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_RECRUIT_IND")
    private String recruitInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("initialEnrollDat")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE")
    private Date initialEnrollDat;
    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("attendFromDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_ATTEND_FROM_DATE")
    private Date attendFromDate;
    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("totalTermsAttend")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND")
    private Double totalTermsAttend;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRATHE_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SGRATHE_RECRUIT_IND
     * 
     */
    @JsonProperty("recruitInd")
    public String getRecruitInd() {
        return recruitInd;
    }

    /**
     * Lineage reference object : SGRATHE_RECRUIT_IND
     * 
     */
    @JsonProperty("recruitInd")
    public void setRecruitInd(String recruitInd) {
        this.recruitInd = recruitInd;
    }

    public Sgrathe withRecruitInd(String recruitInd) {
        this.recruitInd = recruitInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sgrathe withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("initialEnrollDat")
    public Date getInitialEnrollDat() {
        return initialEnrollDat;
    }

    /**
     * Initial Enrollment Date Current Institution
     * <p>
     * Lineage reference object : SGRATHE_INITIAL_ENROLL_DATE
     * 
     */
    @JsonProperty("initialEnrollDat")
    public void setInitialEnrollDat(Date initialEnrollDat) {
        this.initialEnrollDat = initialEnrollDat;
    }

    public Sgrathe withInitialEnrollDat(Date initialEnrollDat) {
        this.initialEnrollDat = initialEnrollDat;
        return this;
    }

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("attendFromDate")
    public Date getAttendFromDate() {
        return attendFromDate;
    }

    /**
     * First Date of Attendance Any Institution
     * <p>
     * Lineage reference object : SGRATHE_ATTEND_FROM_DATE
     * 
     */
    @JsonProperty("attendFromDate")
    public void setAttendFromDate(Date attendFromDate) {
        this.attendFromDate = attendFromDate;
    }

    public Sgrathe withAttendFromDate(Date attendFromDate) {
        this.attendFromDate = attendFromDate;
        return this;
    }

    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("totalTermsAttend")
    public Double getTotalTermsAttend() {
        return totalTermsAttend;
    }

    /**
     * Total Full-Time Terms Attended
     * <p>
     * Lineage reference object : SGRATHE_TOTAL_TERMS_ATTEND
     * 
     */
    @JsonProperty("totalTermsAttend")
    public void setTotalTermsAttend(Double totalTermsAttend) {
        this.totalTermsAttend = totalTermsAttend;
    }

    public Sgrathe withTotalTermsAttend(Double totalTermsAttend) {
        this.totalTermsAttend = totalTermsAttend;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sgrathe withUserId(String userId) {
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

    public Sgrathe withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgrathe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recruitInd");
        sb.append('=');
        sb.append(((this.recruitInd == null)?"<null>":this.recruitInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("initialEnrollDat");
        sb.append('=');
        sb.append(((this.initialEnrollDat == null)?"<null>":this.initialEnrollDat));
        sb.append(',');
        sb.append("attendFromDate");
        sb.append('=');
        sb.append(((this.attendFromDate == null)?"<null>":this.attendFromDate));
        sb.append(',');
        sb.append("totalTermsAttend");
        sb.append('=');
        sb.append(((this.totalTermsAttend == null)?"<null>":this.totalTermsAttend));
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
        result = ((result* 31)+((this.recruitInd == null)? 0 :this.recruitInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.initialEnrollDat == null)? 0 :this.initialEnrollDat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attendFromDate == null)? 0 :this.attendFromDate.hashCode()));
        result = ((result* 31)+((this.totalTermsAttend == null)? 0 :this.totalTermsAttend.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgrathe) == false) {
            return false;
        }
        Sgrathe rhs = ((Sgrathe) other);
        return ((((((((this.recruitInd == rhs.recruitInd)||((this.recruitInd!= null)&&this.recruitInd.equals(rhs.recruitInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.initialEnrollDat == rhs.initialEnrollDat)||((this.initialEnrollDat!= null)&&this.initialEnrollDat.equals(rhs.initialEnrollDat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attendFromDate == rhs.attendFromDate)||((this.attendFromDate!= null)&&this.attendFromDate.equals(rhs.attendFromDate))))&&((this.totalTermsAttend == rhs.totalTermsAttend)||((this.totalTermsAttend!= null)&&this.totalTermsAttend.equals(rhs.totalTermsAttend))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
