
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
    "reasGrdePubDate",
    "scoreOpenDate",
    "activityDate",
    "ptrmCode",
    "reasScoreOpenDate",
    "detGrdePubDate",
    "finalGrdePubDate",
    "userId",
    "scoreCutoffDate",
    "desc",
    "reasDetGrdePubDate",
    "reasScoreCutoffDate"
})
@Generated("jsonschema2pojo")
public class Sobptrm {

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE")
    private Date reasGrdePubDate;
    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_SCORE_OPEN_DATE")
    private Date scoreOpenDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM")
    private String ptrmCode;
    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE")
    private Date reasScoreOpenDate;
    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE")
    private Date detGrdePubDate;
    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE")
    private Date finalGrdePubDate;
    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_USER_ID")
    private String userId;
    /**
     * Final Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_SCORE_CUTOFF_DATE")
    private Date scoreCutoffDate;
    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM")
    private String desc;
    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_DET_GRDE_PUB_DATE")
    private Date reasDetGrdePubDate;
    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("reasScoreCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE")
    private Date reasScoreCutoffDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public Date getReasGrdePubDate() {
        return reasGrdePubDate;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public void setReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
    }

    public Sobptrm withReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
        return this;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public Date getScoreOpenDate() {
        return scoreOpenDate;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public void setScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
    }

    public Sobptrm withScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobptrm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public Sobptrm withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public Date getReasScoreOpenDate() {
        return reasScoreOpenDate;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public void setReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
    }

    public Sobptrm withReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
        return this;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public Date getDetGrdePubDate() {
        return detGrdePubDate;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public void setDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
    }

    public Sobptrm withDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
        return this;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public Date getFinalGrdePubDate() {
        return finalGrdePubDate;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public void setFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
    }

    public Sobptrm withFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
        return this;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobptrm withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Final Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    public Date getScoreCutoffDate() {
        return scoreCutoffDate;
    }

    /**
     * Final Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("scoreCutoffDate")
    public void setScoreCutoffDate(Date scoreCutoffDate) {
        this.scoreCutoffDate = scoreCutoffDate;
    }

    public Sobptrm withScoreCutoffDate(Date scoreCutoffDate) {
        this.scoreCutoffDate = scoreCutoffDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Sobptrm withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    public Date getReasDetGrdePubDate() {
        return reasDetGrdePubDate;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    public void setReasDetGrdePubDate(Date reasDetGrdePubDate) {
        this.reasDetGrdePubDate = reasDetGrdePubDate;
    }

    public Sobptrm withReasDetGrdePubDate(Date reasDetGrdePubDate) {
        this.reasDetGrdePubDate = reasDetGrdePubDate;
        return this;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("reasScoreCutoffDate")
    public Date getReasScoreCutoffDate() {
        return reasScoreCutoffDate;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("reasScoreCutoffDate")
    public void setReasScoreCutoffDate(Date reasScoreCutoffDate) {
        this.reasScoreCutoffDate = reasScoreCutoffDate;
    }

    public Sobptrm withReasScoreCutoffDate(Date reasScoreCutoffDate) {
        this.reasScoreCutoffDate = reasScoreCutoffDate;
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

    public Sobptrm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobptrm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reasGrdePubDate");
        sb.append('=');
        sb.append(((this.reasGrdePubDate == null)?"<null>":this.reasGrdePubDate));
        sb.append(',');
        sb.append("scoreOpenDate");
        sb.append('=');
        sb.append(((this.scoreOpenDate == null)?"<null>":this.scoreOpenDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("reasScoreOpenDate");
        sb.append('=');
        sb.append(((this.reasScoreOpenDate == null)?"<null>":this.reasScoreOpenDate));
        sb.append(',');
        sb.append("detGrdePubDate");
        sb.append('=');
        sb.append(((this.detGrdePubDate == null)?"<null>":this.detGrdePubDate));
        sb.append(',');
        sb.append("finalGrdePubDate");
        sb.append('=');
        sb.append(((this.finalGrdePubDate == null)?"<null>":this.finalGrdePubDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("scoreCutoffDate");
        sb.append('=');
        sb.append(((this.scoreCutoffDate == null)?"<null>":this.scoreCutoffDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("reasDetGrdePubDate");
        sb.append('=');
        sb.append(((this.reasDetGrdePubDate == null)?"<null>":this.reasDetGrdePubDate));
        sb.append(',');
        sb.append("reasScoreCutoffDate");
        sb.append('=');
        sb.append(((this.reasScoreCutoffDate == null)?"<null>":this.reasScoreCutoffDate));
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
        result = ((result* 31)+((this.reasGrdePubDate == null)? 0 :this.reasGrdePubDate.hashCode()));
        result = ((result* 31)+((this.scoreOpenDate == null)? 0 :this.scoreOpenDate.hashCode()));
        result = ((result* 31)+((this.reasScoreOpenDate == null)? 0 :this.reasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.detGrdePubDate == null)? 0 :this.detGrdePubDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.scoreCutoffDate == null)? 0 :this.scoreCutoffDate.hashCode()));
        result = ((result* 31)+((this.reasDetGrdePubDate == null)? 0 :this.reasDetGrdePubDate.hashCode()));
        result = ((result* 31)+((this.reasScoreCutoffDate == null)? 0 :this.reasScoreCutoffDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.finalGrdePubDate == null)? 0 :this.finalGrdePubDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobptrm) == false) {
            return false;
        }
        Sobptrm rhs = ((Sobptrm) other);
        return ((((((((((((((this.reasGrdePubDate == rhs.reasGrdePubDate)||((this.reasGrdePubDate!= null)&&this.reasGrdePubDate.equals(rhs.reasGrdePubDate)))&&((this.scoreOpenDate == rhs.scoreOpenDate)||((this.scoreOpenDate!= null)&&this.scoreOpenDate.equals(rhs.scoreOpenDate))))&&((this.reasScoreOpenDate == rhs.reasScoreOpenDate)||((this.reasScoreOpenDate!= null)&&this.reasScoreOpenDate.equals(rhs.reasScoreOpenDate))))&&((this.detGrdePubDate == rhs.detGrdePubDate)||((this.detGrdePubDate!= null)&&this.detGrdePubDate.equals(rhs.detGrdePubDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.scoreCutoffDate == rhs.scoreCutoffDate)||((this.scoreCutoffDate!= null)&&this.scoreCutoffDate.equals(rhs.scoreCutoffDate))))&&((this.reasDetGrdePubDate == rhs.reasDetGrdePubDate)||((this.reasDetGrdePubDate!= null)&&this.reasDetGrdePubDate.equals(rhs.reasDetGrdePubDate))))&&((this.reasScoreCutoffDate == rhs.reasScoreCutoffDate)||((this.reasScoreCutoffDate!= null)&&this.reasScoreCutoffDate.equals(rhs.reasScoreCutoffDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.finalGrdePubDate == rhs.finalGrdePubDate)||((this.finalGrdePubDate!= null)&&this.finalGrdePubDate.equals(rhs.finalGrdePubDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
