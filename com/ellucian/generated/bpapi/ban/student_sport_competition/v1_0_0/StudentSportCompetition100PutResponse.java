
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
    "seasonsAvailable",
    "eligEndTermCode",
    "sareDesc",
    "eligBeginTermCo",
    "userId",
    "ctrlSeasonsRemaining",
    "seasonUsedInd",
    "eligBeginTermDesc",
    "activityDate",
    "sareCode",
    "currentIndDesc",
    "eligEndTermDesc",
    "ctrlSeasonsUsed"
})
@Generated("jsonschema2pojo")
public class StudentSportCompetition100PutResponse {

    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_SEASONS_AVAILABLE")
    private Double seasonsAvailable;
    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm")
    private String eligEndTermCode;
    @JsonProperty("sareDesc")
    private String sareDesc;
    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCo")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String eligBeginTermCo;
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
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsRemaining")
    private Double ctrlSeasonsRemaining;
    /**
     * Lineage reference object : SGRATHC_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_SEASON_USED_IND")
    private String seasonUsedInd;
    @JsonProperty("eligBeginTermDesc")
    private String eligBeginTermDesc;
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
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("sareCode")
    @JsonPropertyDescription("Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare")
    private String sareCode;
    /**
     * Record Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currentIndDesc")
    private String currentIndDesc;
    @JsonProperty("eligEndTermDesc")
    private String eligEndTermDesc;
    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsUsed")
    private Double ctrlSeasonsUsed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    public Double getSeasonsAvailable() {
        return seasonsAvailable;
    }

    /**
     * Seasons of Competition Available
     * <p>
     * Lineage reference object : SGRATHC_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    public void setSeasonsAvailable(Double seasonsAvailable) {
        this.seasonsAvailable = seasonsAvailable;
    }

    public StudentSportCompetition100PutResponse withSeasonsAvailable(Double seasonsAvailable) {
        this.seasonsAvailable = seasonsAvailable;
        return this;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    public String getEligEndTermCode() {
        return eligEndTermCode;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    public void setEligEndTermCode(String eligEndTermCode) {
        this.eligEndTermCode = eligEndTermCode;
    }

    public StudentSportCompetition100PutResponse withEligEndTermCode(String eligEndTermCode) {
        this.eligEndTermCode = eligEndTermCode;
        return this;
    }

    @JsonProperty("sareDesc")
    public String getSareDesc() {
        return sareDesc;
    }

    @JsonProperty("sareDesc")
    public void setSareDesc(String sareDesc) {
        this.sareDesc = sareDesc;
    }

    public StudentSportCompetition100PutResponse withSareDesc(String sareDesc) {
        this.sareDesc = sareDesc;
        return this;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCo")
    public String getEligBeginTermCo() {
        return eligBeginTermCo;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGRATHC_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCo")
    public void setEligBeginTermCo(String eligBeginTermCo) {
        this.eligBeginTermCo = eligBeginTermCo;
    }

    public StudentSportCompetition100PutResponse withEligBeginTermCo(String eligBeginTermCo) {
        this.eligBeginTermCo = eligBeginTermCo;
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

    public StudentSportCompetition100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsRemaining")
    public Double getCtrlSeasonsRemaining() {
        return ctrlSeasonsRemaining;
    }

    /**
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsRemaining")
    public void setCtrlSeasonsRemaining(Double ctrlSeasonsRemaining) {
        this.ctrlSeasonsRemaining = ctrlSeasonsRemaining;
    }

    public StudentSportCompetition100PutResponse withCtrlSeasonsRemaining(Double ctrlSeasonsRemaining) {
        this.ctrlSeasonsRemaining = ctrlSeasonsRemaining;
        return this;
    }

    /**
     * Lineage reference object : SGRATHC_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    public String getSeasonUsedInd() {
        return seasonUsedInd;
    }

    /**
     * Lineage reference object : SGRATHC_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    public void setSeasonUsedInd(String seasonUsedInd) {
        this.seasonUsedInd = seasonUsedInd;
    }

    public StudentSportCompetition100PutResponse withSeasonUsedInd(String seasonUsedInd) {
        this.seasonUsedInd = seasonUsedInd;
        return this;
    }

    @JsonProperty("eligBeginTermDesc")
    public String getEligBeginTermDesc() {
        return eligBeginTermDesc;
    }

    @JsonProperty("eligBeginTermDesc")
    public void setEligBeginTermDesc(String eligBeginTermDesc) {
        this.eligBeginTermDesc = eligBeginTermDesc;
    }

    public StudentSportCompetition100PutResponse withEligBeginTermDesc(String eligBeginTermDesc) {
        this.eligBeginTermDesc = eligBeginTermDesc;
        return this;
    }

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

    public StudentSportCompetition100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("sareCode")
    public String getSareCode() {
        return sareCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRATHC_SARE_CODE, Lookup lineage reference object : stvsare
     * 
     */
    @JsonProperty("sareCode")
    public void setSareCode(String sareCode) {
        this.sareCode = sareCode;
    }

    public StudentSportCompetition100PutResponse withSareCode(String sareCode) {
        this.sareCode = sareCode;
        return this;
    }

    /**
     * Record Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currentIndDesc")
    public String getCurrentIndDesc() {
        return currentIndDesc;
    }

    /**
     * Record Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currentIndDesc")
    public void setCurrentIndDesc(String currentIndDesc) {
        this.currentIndDesc = currentIndDesc;
    }

    public StudentSportCompetition100PutResponse withCurrentIndDesc(String currentIndDesc) {
        this.currentIndDesc = currentIndDesc;
        return this;
    }

    @JsonProperty("eligEndTermDesc")
    public String getEligEndTermDesc() {
        return eligEndTermDesc;
    }

    @JsonProperty("eligEndTermDesc")
    public void setEligEndTermDesc(String eligEndTermDesc) {
        this.eligEndTermDesc = eligEndTermDesc;
    }

    public StudentSportCompetition100PutResponse withEligEndTermDesc(String eligEndTermDesc) {
        this.eligEndTermDesc = eligEndTermDesc;
        return this;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsUsed")
    public Double getCtrlSeasonsUsed() {
        return ctrlSeasonsUsed;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("ctrlSeasonsUsed")
    public void setCtrlSeasonsUsed(Double ctrlSeasonsUsed) {
        this.ctrlSeasonsUsed = ctrlSeasonsUsed;
    }

    public StudentSportCompetition100PutResponse withCtrlSeasonsUsed(Double ctrlSeasonsUsed) {
        this.ctrlSeasonsUsed = ctrlSeasonsUsed;
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

    public StudentSportCompetition100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompetition100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seasonsAvailable");
        sb.append('=');
        sb.append(((this.seasonsAvailable == null)?"<null>":this.seasonsAvailable));
        sb.append(',');
        sb.append("eligEndTermCode");
        sb.append('=');
        sb.append(((this.eligEndTermCode == null)?"<null>":this.eligEndTermCode));
        sb.append(',');
        sb.append("sareDesc");
        sb.append('=');
        sb.append(((this.sareDesc == null)?"<null>":this.sareDesc));
        sb.append(',');
        sb.append("eligBeginTermCo");
        sb.append('=');
        sb.append(((this.eligBeginTermCo == null)?"<null>":this.eligBeginTermCo));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ctrlSeasonsRemaining");
        sb.append('=');
        sb.append(((this.ctrlSeasonsRemaining == null)?"<null>":this.ctrlSeasonsRemaining));
        sb.append(',');
        sb.append("seasonUsedInd");
        sb.append('=');
        sb.append(((this.seasonUsedInd == null)?"<null>":this.seasonUsedInd));
        sb.append(',');
        sb.append("eligBeginTermDesc");
        sb.append('=');
        sb.append(((this.eligBeginTermDesc == null)?"<null>":this.eligBeginTermDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("sareCode");
        sb.append('=');
        sb.append(((this.sareCode == null)?"<null>":this.sareCode));
        sb.append(',');
        sb.append("currentIndDesc");
        sb.append('=');
        sb.append(((this.currentIndDesc == null)?"<null>":this.currentIndDesc));
        sb.append(',');
        sb.append("eligEndTermDesc");
        sb.append('=');
        sb.append(((this.eligEndTermDesc == null)?"<null>":this.eligEndTermDesc));
        sb.append(',');
        sb.append("ctrlSeasonsUsed");
        sb.append('=');
        sb.append(((this.ctrlSeasonsUsed == null)?"<null>":this.ctrlSeasonsUsed));
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
        result = ((result* 31)+((this.seasonsAvailable == null)? 0 :this.seasonsAvailable.hashCode()));
        result = ((result* 31)+((this.eligEndTermCode == null)? 0 :this.eligEndTermCode.hashCode()));
        result = ((result* 31)+((this.sareDesc == null)? 0 :this.sareDesc.hashCode()));
        result = ((result* 31)+((this.eligBeginTermCo == null)? 0 :this.eligBeginTermCo.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ctrlSeasonsRemaining == null)? 0 :this.ctrlSeasonsRemaining.hashCode()));
        result = ((result* 31)+((this.seasonUsedInd == null)? 0 :this.seasonUsedInd.hashCode()));
        result = ((result* 31)+((this.eligBeginTermDesc == null)? 0 :this.eligBeginTermDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.sareCode == null)? 0 :this.sareCode.hashCode()));
        result = ((result* 31)+((this.currentIndDesc == null)? 0 :this.currentIndDesc.hashCode()));
        result = ((result* 31)+((this.eligEndTermDesc == null)? 0 :this.eligEndTermDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ctrlSeasonsUsed == null)? 0 :this.ctrlSeasonsUsed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompetition100PutResponse) == false) {
            return false;
        }
        StudentSportCompetition100PutResponse rhs = ((StudentSportCompetition100PutResponse) other);
        return (((((((((((((((this.seasonsAvailable == rhs.seasonsAvailable)||((this.seasonsAvailable!= null)&&this.seasonsAvailable.equals(rhs.seasonsAvailable)))&&((this.eligEndTermCode == rhs.eligEndTermCode)||((this.eligEndTermCode!= null)&&this.eligEndTermCode.equals(rhs.eligEndTermCode))))&&((this.sareDesc == rhs.sareDesc)||((this.sareDesc!= null)&&this.sareDesc.equals(rhs.sareDesc))))&&((this.eligBeginTermCo == rhs.eligBeginTermCo)||((this.eligBeginTermCo!= null)&&this.eligBeginTermCo.equals(rhs.eligBeginTermCo))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ctrlSeasonsRemaining == rhs.ctrlSeasonsRemaining)||((this.ctrlSeasonsRemaining!= null)&&this.ctrlSeasonsRemaining.equals(rhs.ctrlSeasonsRemaining))))&&((this.seasonUsedInd == rhs.seasonUsedInd)||((this.seasonUsedInd!= null)&&this.seasonUsedInd.equals(rhs.seasonUsedInd))))&&((this.eligBeginTermDesc == rhs.eligBeginTermDesc)||((this.eligBeginTermDesc!= null)&&this.eligBeginTermDesc.equals(rhs.eligBeginTermDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.sareCode == rhs.sareCode)||((this.sareCode!= null)&&this.sareCode.equals(rhs.sareCode))))&&((this.currentIndDesc == rhs.currentIndDesc)||((this.currentIndDesc!= null)&&this.currentIndDesc.equals(rhs.currentIndDesc))))&&((this.eligEndTermDesc == rhs.eligEndTermDesc)||((this.eligEndTermDesc!= null)&&this.eligEndTermDesc.equals(rhs.eligEndTermDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ctrlSeasonsUsed == rhs.ctrlSeasonsUsed)||((this.ctrlSeasonsUsed!= null)&&this.ctrlSeasonsUsed.equals(rhs.ctrlSeasonsUsed))));
    }

}
