
package com.ellucian.generated.bpapi.ban.student_sport_competition.v1_0_0;

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
    "endTerm",
    "beginTerm",
    "season",
    "id"
})
@Generated("jsonschema2pojo")
public class StudentSportCompetition100PostRequest {

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

    public StudentSportCompetition100PostRequest withReason(String reason) {
        this.reason = reason;
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

    public StudentSportCompetition100PostRequest withEndTerm(String endTerm) {
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

    public StudentSportCompetition100PostRequest withBeginTerm(String beginTerm) {
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

    public StudentSportCompetition100PostRequest withSeason(Double season) {
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

    public StudentSportCompetition100PostRequest withId(Object id) {
        this.id = id;
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

    public StudentSportCompetition100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompetition100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.beginTerm == null)? 0 :this.beginTerm.hashCode()));
        result = ((result* 31)+((this.season == null)? 0 :this.season.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompetition100PostRequest) == false) {
            return false;
        }
        StudentSportCompetition100PostRequest rhs = ((StudentSportCompetition100PostRequest) other);
        return (((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm))))&&((this.beginTerm == rhs.beginTerm)||((this.beginTerm!= null)&&this.beginTerm.equals(rhs.beginTerm))))&&((this.season == rhs.season)||((this.season!= null)&&this.season.equals(rhs.season))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
