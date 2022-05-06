
package com.ellucian.generated.bpapi.ban.student_sport_competition.v1_0_0;

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
    "id",
    "userId",
    "criteria.term"
})
@Generated("jsonschema2pojo")
public class StudentSportCompetition100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ACTIVITY_DATE")
    private Date activityDate;
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
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_USER_ID")
    private String userId;
    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTerm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentSportCompetition100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public StudentSportCompetition100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentSportCompetition100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public String getCriteriaTerm() {
        return criteriaTerm;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public void setCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
    }

    public StudentSportCompetition100GetRequest withCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
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

    public StudentSportCompetition100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompetition100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("criteriaTerm");
        sb.append('=');
        sb.append(((this.criteriaTerm == null)?"<null>":this.criteriaTerm));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.criteriaTerm == null)? 0 :this.criteriaTerm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompetition100GetRequest) == false) {
            return false;
        }
        StudentSportCompetition100GetRequest rhs = ((StudentSportCompetition100GetRequest) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.criteriaTerm == rhs.criteriaTerm)||((this.criteriaTerm!= null)&&this.criteriaTerm.equals(rhs.criteriaTerm))));
    }

}
