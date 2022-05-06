
package com.ellucian.generated.bpapi.ban.electronic_grade_book_configuration.v1_0_0;

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
    "scoreOpenDate",
    "activityDate",
    "reasScoreOpenDate",
    "reasScoreCtofDate",
    "userId",
    "scoreCutoffDate"
})
@Generated("jsonschema2pojo")
public class Ssbsect__1 {

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCORE_OPEN_DATE")
    private Date scoreOpenDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE")
    private Date reasScoreOpenDate;
    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE")
    private Date reasScoreCtofDate;
    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_USER_ID")
    private String userId;
    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE")
    private Date scoreCutoffDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public Date getScoreOpenDate() {
        return scoreOpenDate;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public void setScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
    }

    public Ssbsect__1 withScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssbsect__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public Date getReasScoreOpenDate() {
        return reasScoreOpenDate;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public void setReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
    }

    public Ssbsect__1 withReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
        return this;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    public Date getReasScoreCtofDate() {
        return reasScoreCtofDate;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    public void setReasScoreCtofDate(Date reasScoreCtofDate) {
        this.reasScoreCtofDate = reasScoreCtofDate;
    }

    public Ssbsect__1 withReasScoreCtofDate(Date reasScoreCtofDate) {
        this.reasScoreCtofDate = reasScoreCtofDate;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssbsect__1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    public Date getScoreCutoffDate() {
        return scoreCutoffDate;
    }

    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    public void setScoreCutoffDate(Date scoreCutoffDate) {
        this.scoreCutoffDate = scoreCutoffDate;
    }

    public Ssbsect__1 withScoreCutoffDate(Date scoreCutoffDate) {
        this.scoreCutoffDate = scoreCutoffDate;
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

    public Ssbsect__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbsect__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scoreOpenDate");
        sb.append('=');
        sb.append(((this.scoreOpenDate == null)?"<null>":this.scoreOpenDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("reasScoreOpenDate");
        sb.append('=');
        sb.append(((this.reasScoreOpenDate == null)?"<null>":this.reasScoreOpenDate));
        sb.append(',');
        sb.append("reasScoreCtofDate");
        sb.append('=');
        sb.append(((this.reasScoreCtofDate == null)?"<null>":this.reasScoreCtofDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("scoreCutoffDate");
        sb.append('=');
        sb.append(((this.scoreCutoffDate == null)?"<null>":this.scoreCutoffDate));
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
        result = ((result* 31)+((this.scoreOpenDate == null)? 0 :this.scoreOpenDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.reasScoreOpenDate == null)? 0 :this.reasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.reasScoreCtofDate == null)? 0 :this.reasScoreCtofDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.scoreCutoffDate == null)? 0 :this.scoreCutoffDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbsect__1) == false) {
            return false;
        }
        Ssbsect__1 rhs = ((Ssbsect__1) other);
        return ((((((((this.scoreOpenDate == rhs.scoreOpenDate)||((this.scoreOpenDate!= null)&&this.scoreOpenDate.equals(rhs.scoreOpenDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.reasScoreOpenDate == rhs.reasScoreOpenDate)||((this.reasScoreOpenDate!= null)&&this.reasScoreOpenDate.equals(rhs.reasScoreOpenDate))))&&((this.reasScoreCtofDate == rhs.reasScoreCtofDate)||((this.reasScoreCtofDate!= null)&&this.reasScoreCtofDate.equals(rhs.reasScoreCtofDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.scoreCutoffDate == rhs.scoreCutoffDate)||((this.scoreCutoffDate!= null)&&this.scoreCutoffDate.equals(rhs.scoreCutoffDate))));
    }

}
