
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
    "CompResitRuleDesc",
    "compLateRule",
    "compResitRule",
    "scoreOpenDate",
    "reasScoreOpenDate",
    "subLateRuleDesc",
    "reasScoreCtofDate",
    "compLateRuleDesc",
    "userId",
    "subResitRuleDesc",
    "subResitRule",
    "activityDate",
    "finScoreCutoff",
    "midScoreCutoff",
    "subLateRule"
})
@Generated("jsonschema2pojo")
public class Shbgctl {

    /**
     * Default Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("CompResitRuleDesc")
    @JsonPropertyDescription("Lookup lineage reference object : shbgrul")
    private String compResitRuleDesc;
    /**
     * Default Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_COMP_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String compLateRule;
    /**
     * Default Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String compResitRule;
    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_SCORE_OPEN_DATE")
    private Date scoreOpenDate;
    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_REAS_SCORE_OPEN_DATE")
    private Date reasScoreOpenDate;
    /**
     * Default Sub Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRuleDesc")
    @JsonPropertyDescription("Lookup lineage reference object : shbgrul")
    private String subLateRuleDesc;
    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_REAS_SCORE_CTOF_DATE")
    private Date reasScoreCtofDate;
    /**
     * Default Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRuleDesc")
    @JsonPropertyDescription("Lookup lineage reference object : shbgrul")
    private String compLateRuleDesc;
    /**
     * Activity User
     * <p>
     * Lineage reference object : SHBGCTL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_USER_ID")
    private String userId;
    /**
     * Default Sub Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRuleDesc")
    @JsonPropertyDescription("Lookup lineage reference object : shbgrul")
    private String subResitRuleDesc;
    /**
     * Default Sub Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String subResitRule;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHBGCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Final Score Cutoff date
     * <p>
     * Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF
     * 
     */
    @JsonProperty("finScoreCutoff")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF")
    private Date finScoreCutoff;
    /**
     * Midterm Score Cut-off Date
     * <p>
     * Lineage reference object : SHBGCTL_MID_SCORE_CUTOFF
     * 
     */
    @JsonProperty("midScoreCutoff")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_MID_SCORE_CUTOFF")
    private Date midScoreCutoff;
    /**
     * Default Sub Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String subLateRule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Default Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("CompResitRuleDesc")
    public String getCompResitRuleDesc() {
        return compResitRuleDesc;
    }

    /**
     * Default Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("CompResitRuleDesc")
    public void setCompResitRuleDesc(String compResitRuleDesc) {
        this.compResitRuleDesc = compResitRuleDesc;
    }

    public Shbgctl withCompResitRuleDesc(String compResitRuleDesc) {
        this.compResitRuleDesc = compResitRuleDesc;
        return this;
    }

    /**
     * Default Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    public String getCompLateRule() {
        return compLateRule;
    }

    /**
     * Default Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    public void setCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
    }

    public Shbgctl withCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
        return this;
    }

    /**
     * Default Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    public String getCompResitRule() {
        return compResitRule;
    }

    /**
     * Default Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    public void setCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
    }

    public Shbgctl withCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
        return this;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public Date getScoreOpenDate() {
        return scoreOpenDate;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    public void setScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
    }

    public Shbgctl withScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
        return this;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public Date getReasScoreOpenDate() {
        return reasScoreOpenDate;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("reasScoreOpenDate")
    public void setReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
    }

    public Shbgctl withReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
        return this;
    }

    /**
     * Default Sub Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRuleDesc")
    public String getSubLateRuleDesc() {
        return subLateRuleDesc;
    }

    /**
     * Default Sub Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRuleDesc")
    public void setSubLateRuleDesc(String subLateRuleDesc) {
        this.subLateRuleDesc = subLateRuleDesc;
    }

    public Shbgctl withSubLateRuleDesc(String subLateRuleDesc) {
        this.subLateRuleDesc = subLateRuleDesc;
        return this;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    public Date getReasScoreCtofDate() {
        return reasScoreCtofDate;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SHBGCTL_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("reasScoreCtofDate")
    public void setReasScoreCtofDate(Date reasScoreCtofDate) {
        this.reasScoreCtofDate = reasScoreCtofDate;
    }

    public Shbgctl withReasScoreCtofDate(Date reasScoreCtofDate) {
        this.reasScoreCtofDate = reasScoreCtofDate;
        return this;
    }

    /**
     * Default Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRuleDesc")
    public String getCompLateRuleDesc() {
        return compLateRuleDesc;
    }

    /**
     * Default Component Late Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRuleDesc")
    public void setCompLateRuleDesc(String compLateRuleDesc) {
        this.compLateRuleDesc = compLateRuleDesc;
    }

    public Shbgctl withCompLateRuleDesc(String compLateRuleDesc) {
        this.compLateRuleDesc = compLateRuleDesc;
        return this;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SHBGCTL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SHBGCTL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Shbgctl withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Default Sub Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRuleDesc")
    public String getSubResitRuleDesc() {
        return subResitRuleDesc;
    }

    /**
     * Default Sub Component Resit Rule Description
     * <p>
     * Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRuleDesc")
    public void setSubResitRuleDesc(String subResitRuleDesc) {
        this.subResitRuleDesc = subResitRuleDesc;
    }

    public Shbgctl withSubResitRuleDesc(String subResitRuleDesc) {
        this.subResitRuleDesc = subResitRuleDesc;
        return this;
    }

    /**
     * Default Sub Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    public String getSubResitRule() {
        return subResitRule;
    }

    /**
     * Default Sub Component Resit Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    public void setSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
    }

    public Shbgctl withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHBGCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHBGCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Shbgctl withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Final Score Cutoff date
     * <p>
     * Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF
     * 
     */
    @JsonProperty("finScoreCutoff")
    public Date getFinScoreCutoff() {
        return finScoreCutoff;
    }

    /**
     * Final Score Cutoff date
     * <p>
     * Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF
     * 
     */
    @JsonProperty("finScoreCutoff")
    public void setFinScoreCutoff(Date finScoreCutoff) {
        this.finScoreCutoff = finScoreCutoff;
    }

    public Shbgctl withFinScoreCutoff(Date finScoreCutoff) {
        this.finScoreCutoff = finScoreCutoff;
        return this;
    }

    /**
     * Midterm Score Cut-off Date
     * <p>
     * Lineage reference object : SHBGCTL_MID_SCORE_CUTOFF
     * 
     */
    @JsonProperty("midScoreCutoff")
    public Date getMidScoreCutoff() {
        return midScoreCutoff;
    }

    /**
     * Midterm Score Cut-off Date
     * <p>
     * Lineage reference object : SHBGCTL_MID_SCORE_CUTOFF
     * 
     */
    @JsonProperty("midScoreCutoff")
    public void setMidScoreCutoff(Date midScoreCutoff) {
        this.midScoreCutoff = midScoreCutoff;
    }

    public Shbgctl withMidScoreCutoff(Date midScoreCutoff) {
        this.midScoreCutoff = midScoreCutoff;
        return this;
    }

    /**
     * Default Sub Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    public String getSubLateRule() {
        return subLateRule;
    }

    /**
     * Default Sub Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    public void setSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
    }

    public Shbgctl withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
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

    public Shbgctl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shbgctl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("compResitRuleDesc");
        sb.append('=');
        sb.append(((this.compResitRuleDesc == null)?"<null>":this.compResitRuleDesc));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("compResitRule");
        sb.append('=');
        sb.append(((this.compResitRule == null)?"<null>":this.compResitRule));
        sb.append(',');
        sb.append("scoreOpenDate");
        sb.append('=');
        sb.append(((this.scoreOpenDate == null)?"<null>":this.scoreOpenDate));
        sb.append(',');
        sb.append("reasScoreOpenDate");
        sb.append('=');
        sb.append(((this.reasScoreOpenDate == null)?"<null>":this.reasScoreOpenDate));
        sb.append(',');
        sb.append("subLateRuleDesc");
        sb.append('=');
        sb.append(((this.subLateRuleDesc == null)?"<null>":this.subLateRuleDesc));
        sb.append(',');
        sb.append("reasScoreCtofDate");
        sb.append('=');
        sb.append(((this.reasScoreCtofDate == null)?"<null>":this.reasScoreCtofDate));
        sb.append(',');
        sb.append("compLateRuleDesc");
        sb.append('=');
        sb.append(((this.compLateRuleDesc == null)?"<null>":this.compLateRuleDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("subResitRuleDesc");
        sb.append('=');
        sb.append(((this.subResitRuleDesc == null)?"<null>":this.subResitRuleDesc));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("finScoreCutoff");
        sb.append('=');
        sb.append(((this.finScoreCutoff == null)?"<null>":this.finScoreCutoff));
        sb.append(',');
        sb.append("midScoreCutoff");
        sb.append('=');
        sb.append(((this.midScoreCutoff == null)?"<null>":this.midScoreCutoff));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
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
        result = ((result* 31)+((this.compLateRule == null)? 0 :this.compLateRule.hashCode()));
        result = ((result* 31)+((this.compResitRule == null)? 0 :this.compResitRule.hashCode()));
        result = ((result* 31)+((this.scoreOpenDate == null)? 0 :this.scoreOpenDate.hashCode()));
        result = ((result* 31)+((this.reasScoreOpenDate == null)? 0 :this.reasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.subLateRuleDesc == null)? 0 :this.subLateRuleDesc.hashCode()));
        result = ((result* 31)+((this.reasScoreCtofDate == null)? 0 :this.reasScoreCtofDate.hashCode()));
        result = ((result* 31)+((this.compResitRuleDesc == null)? 0 :this.compResitRuleDesc.hashCode()));
        result = ((result* 31)+((this.compLateRuleDesc == null)? 0 :this.compLateRuleDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.subResitRuleDesc == null)? 0 :this.subResitRuleDesc.hashCode()));
        result = ((result* 31)+((this.subResitRule == null)? 0 :this.subResitRule.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.finScoreCutoff == null)? 0 :this.finScoreCutoff.hashCode()));
        result = ((result* 31)+((this.midScoreCutoff == null)? 0 :this.midScoreCutoff.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subLateRule == null)? 0 :this.subLateRule.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shbgctl) == false) {
            return false;
        }
        Shbgctl rhs = ((Shbgctl) other);
        return (((((((((((((((((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule)))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.scoreOpenDate == rhs.scoreOpenDate)||((this.scoreOpenDate!= null)&&this.scoreOpenDate.equals(rhs.scoreOpenDate))))&&((this.reasScoreOpenDate == rhs.reasScoreOpenDate)||((this.reasScoreOpenDate!= null)&&this.reasScoreOpenDate.equals(rhs.reasScoreOpenDate))))&&((this.subLateRuleDesc == rhs.subLateRuleDesc)||((this.subLateRuleDesc!= null)&&this.subLateRuleDesc.equals(rhs.subLateRuleDesc))))&&((this.reasScoreCtofDate == rhs.reasScoreCtofDate)||((this.reasScoreCtofDate!= null)&&this.reasScoreCtofDate.equals(rhs.reasScoreCtofDate))))&&((this.compResitRuleDesc == rhs.compResitRuleDesc)||((this.compResitRuleDesc!= null)&&this.compResitRuleDesc.equals(rhs.compResitRuleDesc))))&&((this.compLateRuleDesc == rhs.compLateRuleDesc)||((this.compLateRuleDesc!= null)&&this.compLateRuleDesc.equals(rhs.compLateRuleDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.subResitRuleDesc == rhs.subResitRuleDesc)||((this.subResitRuleDesc!= null)&&this.subResitRuleDesc.equals(rhs.subResitRuleDesc))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.finScoreCutoff == rhs.finScoreCutoff)||((this.finScoreCutoff!= null)&&this.finScoreCutoff.equals(rhs.finScoreCutoff))))&&((this.midScoreCutoff == rhs.midScoreCutoff)||((this.midScoreCutoff!= null)&&this.midScoreCutoff.equals(rhs.midScoreCutoff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))));
    }

}
