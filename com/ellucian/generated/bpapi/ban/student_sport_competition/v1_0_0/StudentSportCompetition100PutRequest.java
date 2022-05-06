
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
    "reason",
    "criteria.activityDate",
    "criteria.userId",
    "endTerm",
    "beginTerm",
    "season",
    "id",
    "criteria.term"
})
@Generated("jsonschema2pojo")
public class StudentSportCompetition100PutRequest {

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare")
    private String reason;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_USER_ID")
    private String criteriaUserId;
    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("endTerm")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm")
    private String endTerm;
    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("beginTerm")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String beginTerm;
    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("season")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_SEASONS_AVAILABLE")
    private Double season;
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
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public StudentSportCompetition100PutRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentSportCompetition100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHC_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public StudentSportCompetition100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("endTerm")
    public String getEndTerm() {
        return endTerm;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("endTerm")
    public void setEndTerm(String endTerm) {
        this.endTerm = endTerm;
    }

    public StudentSportCompetition100PutRequest withEndTerm(String endTerm) {
        this.endTerm = endTerm;
        return this;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("beginTerm")
    public String getBeginTerm() {
        return beginTerm;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("beginTerm")
    public void setBeginTerm(String beginTerm) {
        this.beginTerm = beginTerm;
    }

    public StudentSportCompetition100PutRequest withBeginTerm(String beginTerm) {
        this.beginTerm = beginTerm;
        return this;
    }

    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("season")
    public Double getSeason() {
        return season;
    }

    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("season")
    public void setSeason(Double season) {
        this.season = season;
    }

    public StudentSportCompetition100PutRequest withSeason(Double season) {
        this.season = season;
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

    public StudentSportCompetition100PutRequest withId(Object id) {
        this.id = id;
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

    public StudentSportCompetition100PutRequest withCriteriaTerm(String criteriaTerm) {
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

    public StudentSportCompetition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompetition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
        sb.append(',');
        sb.append("beginTerm");
        sb.append('=');
        sb.append(((this.beginTerm == null)?"<null>":this.beginTerm));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null)?"<null>":this.season));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.beginTerm == null)? 0 :this.beginTerm.hashCode()));
        result = ((result* 31)+((this.season == null)? 0 :this.season.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTerm == null)? 0 :this.criteriaTerm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompetition100PutRequest) == false) {
            return false;
        }
        StudentSportCompetition100PutRequest rhs = ((StudentSportCompetition100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm))))&&((this.beginTerm == rhs.beginTerm)||((this.beginTerm!= null)&&this.beginTerm.equals(rhs.beginTerm))))&&((this.season == rhs.season)||((this.season!= null)&&this.season.equals(rhs.season))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTerm == rhs.criteriaTerm)||((this.criteriaTerm!= null)&&this.criteriaTerm.equals(rhs.criteriaTerm))));
    }

}
