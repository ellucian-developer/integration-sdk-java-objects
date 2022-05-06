
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
    "compResitRule",
    "sobptrmScoreOpenDate",
    "ssbssecDetGrdePubDate",
    "criteria.userId",
    "criteria.activityDate",
    "ssasectCrn",
    "reasScoreCtofDate",
    "sobptrmReasScoreOpenDate",
    "detGrdePubDate",
    "criteria.desc",
    "scoreCutoffDate",
    "reasScoreCutoffDate",
    "reasDetGrdePubDate",
    "ssbsectScoreOpenDate",
    "subResitRule",
    "finScoreCutoff",
    "sobptrmReasGrdePubDate",
    "subLateRule",
    "ssbsectReasScoreOpenDate",
    "compLateRule",
    "scoreOpenDate",
    "reasGrdePubDate",
    "sobptrmDetGrdePubDate",
    "reasScoreOpenDate",
    "criteria.ptrmCode",
    "ssbssecReasGrdePubDate",
    "ssasectTermCode",
    "ssbsectReasScoreCtofDate",
    "ssbssecFinalGrdePubDate",
    "sobptrmFinalGrdePubDate",
    "finalGrdePubDate",
    "ssbssecReasDetGrdePubDate",
    "ssbsectScoreCutoffDate",
    "reasDetGrdPbDate"
})
@Generated("jsonschema2pojo")
public class ElectronicGradeBookConfiguration100PutRequest {

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
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_SCORE_OPEN_DATE")
    private Date sobptrmScoreOpenDate;
    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecDetGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE")
    private Date ssbssecDetGrdePubDate;
    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object ssasectCrn;
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
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmReasScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE")
    private Date sobptrmReasScoreOpenDate;
    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DET_GRDE_PUB_DATE")
    private Date detGrdePubDate;
    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM")
    private String criteriaDesc;
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
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("reasScoreCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_SCORE_CUTOFF_DATE")
    private Date reasScoreCutoffDate;
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
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCORE_OPEN_DATE")
    private Date ssbsectScoreOpenDate;
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
     * Final Score Cutoff date
     * <p>
     * Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF
     * 
     */
    @JsonProperty("finScoreCutoff")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_FIN_SCORE_CUTOFF")
    private Date finScoreCutoff;
    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmReasGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE")
    private Date sobptrmReasGrdePubDate;
    /**
     * Default Sub Component Late Rule
     * <p>
     * Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_SUB_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String subLateRule;
    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE")
    private Date ssbsectReasScoreOpenDate;
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
     * Score Open Date
     * <p>
     * Lineage reference object : SHBGCTL_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("scoreOpenDate")
    @JsonPropertyDescription("Lineage reference object : SHBGCTL_SCORE_OPEN_DATE")
    private Date scoreOpenDate;
    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REAS_GRDE_PUB_DATE")
    private Date reasGrdePubDate;
    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmDetGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE")
    private Date sobptrmDetGrdePubDate;
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
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM")
    private String criteriaPtrmCode;
    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE")
    private Date ssbssecReasGrdePubDate;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object ssasectTermCode;
    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreCtofDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE")
    private Date ssbsectReasScoreCtofDate;
    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecFinalGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE")
    private Date ssbssecFinalGrdePubDate;
    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmFinalGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE")
    private Date sobptrmFinalGrdePubDate;
    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FINAL_GRDE_PUB_DATE")
    private Date finalGrdePubDate;
    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasDetGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE")
    private Date ssbssecReasDetGrdePubDate;
    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("ssbsectScoreCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE")
    private Date ssbsectScoreCutoffDate;
    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_DET_GRD_PB_DATE
     * 
     */
    @JsonProperty("reasDetGrdPbDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REAS_DET_GRD_PB_DATE")
    private Date reasDetGrdPbDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ElectronicGradeBookConfiguration100PutRequest withCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
        return this;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmScoreOpenDate")
    public Date getSobptrmScoreOpenDate() {
        return sobptrmScoreOpenDate;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmScoreOpenDate")
    public void setSobptrmScoreOpenDate(Date sobptrmScoreOpenDate) {
        this.sobptrmScoreOpenDate = sobptrmScoreOpenDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSobptrmScoreOpenDate(Date sobptrmScoreOpenDate) {
        this.sobptrmScoreOpenDate = sobptrmScoreOpenDate;
        return this;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecDetGrdePubDate")
    public Date getSsbssecDetGrdePubDate() {
        return ssbssecDetGrdePubDate;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecDetGrdePubDate")
    public void setSsbssecDetGrdePubDate(Date ssbssecDetGrdePubDate) {
        this.ssbssecDetGrdePubDate = ssbssecDetGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbssecDetGrdePubDate(Date ssbssecDetGrdePubDate) {
        this.ssbssecDetGrdePubDate = ssbssecDetGrdePubDate;
        return this;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SOBPTRM_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public ElectronicGradeBookConfiguration100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public Object getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
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

    public ElectronicGradeBookConfiguration100PutRequest withReasScoreCtofDate(Date reasScoreCtofDate) {
        this.reasScoreCtofDate = reasScoreCtofDate;
        return this;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmReasScoreOpenDate")
    public Date getSobptrmReasScoreOpenDate() {
        return sobptrmReasScoreOpenDate;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("sobptrmReasScoreOpenDate")
    public void setSobptrmReasScoreOpenDate(Date sobptrmReasScoreOpenDate) {
        this.sobptrmReasScoreOpenDate = sobptrmReasScoreOpenDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSobptrmReasScoreOpenDate(Date sobptrmReasScoreOpenDate) {
        this.sobptrmReasScoreOpenDate = sobptrmReasScoreOpenDate;
        return this;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public Date getDetGrdePubDate() {
        return detGrdePubDate;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public void setDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC, Lookup lineage reference object : SOBPTRM
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public ElectronicGradeBookConfiguration100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
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

    public ElectronicGradeBookConfiguration100PutRequest withScoreCutoffDate(Date scoreCutoffDate) {
        this.scoreCutoffDate = scoreCutoffDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withReasScoreCutoffDate(Date reasScoreCutoffDate) {
        this.reasScoreCutoffDate = reasScoreCutoffDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withReasDetGrdePubDate(Date reasDetGrdePubDate) {
        this.reasDetGrdePubDate = reasDetGrdePubDate;
        return this;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectScoreOpenDate")
    public Date getSsbsectScoreOpenDate() {
        return ssbsectScoreOpenDate;
    }

    /**
     * Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectScoreOpenDate")
    public void setSsbsectScoreOpenDate(Date ssbsectScoreOpenDate) {
        this.ssbsectScoreOpenDate = ssbsectScoreOpenDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbsectScoreOpenDate(Date ssbsectScoreOpenDate) {
        this.ssbsectScoreOpenDate = ssbsectScoreOpenDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
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

    public ElectronicGradeBookConfiguration100PutRequest withFinScoreCutoff(Date finScoreCutoff) {
        this.finScoreCutoff = finScoreCutoff;
        return this;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmReasGrdePubDate")
    public Date getSobptrmReasGrdePubDate() {
        return sobptrmReasGrdePubDate;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmReasGrdePubDate")
    public void setSobptrmReasGrdePubDate(Date sobptrmReasGrdePubDate) {
        this.sobptrmReasGrdePubDate = sobptrmReasGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSobptrmReasGrdePubDate(Date sobptrmReasGrdePubDate) {
        this.sobptrmReasGrdePubDate = sobptrmReasGrdePubDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
        return this;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreOpenDate")
    public Date getSsbsectReasScoreOpenDate() {
        return ssbsectReasScoreOpenDate;
    }

    /**
     * Reassessment Score Open Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_OPEN_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreOpenDate")
    public void setSsbsectReasScoreOpenDate(Date ssbsectReasScoreOpenDate) {
        this.ssbsectReasScoreOpenDate = ssbsectReasScoreOpenDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbsectReasScoreOpenDate(Date ssbsectReasScoreOpenDate) {
        this.ssbsectReasScoreOpenDate = ssbsectReasScoreOpenDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
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

    public ElectronicGradeBookConfiguration100PutRequest withScoreOpenDate(Date scoreOpenDate) {
        this.scoreOpenDate = scoreOpenDate;
        return this;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public Date getReasGrdePubDate() {
        return reasGrdePubDate;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public void setReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
        return this;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmDetGrdePubDate")
    public Date getSobptrmDetGrdePubDate() {
        return sobptrmDetGrdePubDate;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmDetGrdePubDate")
    public void setSobptrmDetGrdePubDate(Date sobptrmDetGrdePubDate) {
        this.sobptrmDetGrdePubDate = sobptrmDetGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSobptrmDetGrdePubDate(Date sobptrmDetGrdePubDate) {
        this.sobptrmDetGrdePubDate = sobptrmDetGrdePubDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withReasScoreOpenDate(Date reasScoreOpenDate) {
        this.reasScoreOpenDate = reasScoreOpenDate;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public String getCriteriaPtrmCode() {
        return criteriaPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : SOBPTRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public void setCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
    }

    public ElectronicGradeBookConfiguration100PutRequest withCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
        return this;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasGrdePubDate")
    public Date getSsbssecReasGrdePubDate() {
        return ssbssecReasGrdePubDate;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasGrdePubDate")
    public void setSsbssecReasGrdePubDate(Date ssbssecReasGrdePubDate) {
        this.ssbssecReasGrdePubDate = ssbssecReasGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbssecReasGrdePubDate(Date ssbssecReasGrdePubDate) {
        this.ssbssecReasGrdePubDate = ssbssecReasGrdePubDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public Object getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreCtofDate")
    public Date getSsbsectReasScoreCtofDate() {
        return ssbsectReasScoreCtofDate;
    }

    /**
     * Reassessment Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_REAS_SCORE_CTOF_DATE
     * 
     */
    @JsonProperty("ssbsectReasScoreCtofDate")
    public void setSsbsectReasScoreCtofDate(Date ssbsectReasScoreCtofDate) {
        this.ssbsectReasScoreCtofDate = ssbsectReasScoreCtofDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbsectReasScoreCtofDate(Date ssbsectReasScoreCtofDate) {
        this.ssbsectReasScoreCtofDate = ssbsectReasScoreCtofDate;
        return this;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecFinalGrdePubDate")
    public Date getSsbssecFinalGrdePubDate() {
        return ssbssecFinalGrdePubDate;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecFinalGrdePubDate")
    public void setSsbssecFinalGrdePubDate(Date ssbssecFinalGrdePubDate) {
        this.ssbssecFinalGrdePubDate = ssbssecFinalGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbssecFinalGrdePubDate(Date ssbssecFinalGrdePubDate) {
        this.ssbssecFinalGrdePubDate = ssbssecFinalGrdePubDate;
        return this;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmFinalGrdePubDate")
    public Date getSobptrmFinalGrdePubDate() {
        return sobptrmFinalGrdePubDate;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBPTRM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("sobptrmFinalGrdePubDate")
    public void setSobptrmFinalGrdePubDate(Date sobptrmFinalGrdePubDate) {
        this.sobptrmFinalGrdePubDate = sobptrmFinalGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSobptrmFinalGrdePubDate(Date sobptrmFinalGrdePubDate) {
        this.sobptrmFinalGrdePubDate = sobptrmFinalGrdePubDate;
        return this;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public Date getFinalGrdePubDate() {
        return finalGrdePubDate;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public void setFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
        return this;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasDetGrdePubDate")
    public Date getSsbssecReasDetGrdePubDate() {
        return ssbssecReasDetGrdePubDate;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("ssbssecReasDetGrdePubDate")
    public void setSsbssecReasDetGrdePubDate(Date ssbssecReasDetGrdePubDate) {
        this.ssbssecReasDetGrdePubDate = ssbssecReasDetGrdePubDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbssecReasDetGrdePubDate(Date ssbssecReasDetGrdePubDate) {
        this.ssbssecReasDetGrdePubDate = ssbssecReasDetGrdePubDate;
        return this;
    }

    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("ssbsectScoreCutoffDate")
    public Date getSsbsectScoreCutoffDate() {
        return ssbsectScoreCutoffDate;
    }

    /**
     * Score Cutoff Date
     * <p>
     * Lineage reference object : SSBSECT_SCORE_CUTOFF_DATE
     * 
     */
    @JsonProperty("ssbsectScoreCutoffDate")
    public void setSsbsectScoreCutoffDate(Date ssbsectScoreCutoffDate) {
        this.ssbsectScoreCutoffDate = ssbsectScoreCutoffDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withSsbsectScoreCutoffDate(Date ssbsectScoreCutoffDate) {
        this.ssbsectScoreCutoffDate = ssbsectScoreCutoffDate;
        return this;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_DET_GRD_PB_DATE
     * 
     */
    @JsonProperty("reasDetGrdPbDate")
    public Date getReasDetGrdPbDate() {
        return reasDetGrdPbDate;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SOBTERM_REAS_DET_GRD_PB_DATE
     * 
     */
    @JsonProperty("reasDetGrdPbDate")
    public void setReasDetGrdPbDate(Date reasDetGrdPbDate) {
        this.reasDetGrdPbDate = reasDetGrdPbDate;
    }

    public ElectronicGradeBookConfiguration100PutRequest withReasDetGrdPbDate(Date reasDetGrdPbDate) {
        this.reasDetGrdPbDate = reasDetGrdPbDate;
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

    public ElectronicGradeBookConfiguration100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicGradeBookConfiguration100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("compResitRule");
        sb.append('=');
        sb.append(((this.compResitRule == null)?"<null>":this.compResitRule));
        sb.append(',');
        sb.append("sobptrmScoreOpenDate");
        sb.append('=');
        sb.append(((this.sobptrmScoreOpenDate == null)?"<null>":this.sobptrmScoreOpenDate));
        sb.append(',');
        sb.append("ssbssecDetGrdePubDate");
        sb.append('=');
        sb.append(((this.ssbssecDetGrdePubDate == null)?"<null>":this.ssbssecDetGrdePubDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("reasScoreCtofDate");
        sb.append('=');
        sb.append(((this.reasScoreCtofDate == null)?"<null>":this.reasScoreCtofDate));
        sb.append(',');
        sb.append("sobptrmReasScoreOpenDate");
        sb.append('=');
        sb.append(((this.sobptrmReasScoreOpenDate == null)?"<null>":this.sobptrmReasScoreOpenDate));
        sb.append(',');
        sb.append("detGrdePubDate");
        sb.append('=');
        sb.append(((this.detGrdePubDate == null)?"<null>":this.detGrdePubDate));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("scoreCutoffDate");
        sb.append('=');
        sb.append(((this.scoreCutoffDate == null)?"<null>":this.scoreCutoffDate));
        sb.append(',');
        sb.append("reasScoreCutoffDate");
        sb.append('=');
        sb.append(((this.reasScoreCutoffDate == null)?"<null>":this.reasScoreCutoffDate));
        sb.append(',');
        sb.append("reasDetGrdePubDate");
        sb.append('=');
        sb.append(((this.reasDetGrdePubDate == null)?"<null>":this.reasDetGrdePubDate));
        sb.append(',');
        sb.append("ssbsectScoreOpenDate");
        sb.append('=');
        sb.append(((this.ssbsectScoreOpenDate == null)?"<null>":this.ssbsectScoreOpenDate));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("finScoreCutoff");
        sb.append('=');
        sb.append(((this.finScoreCutoff == null)?"<null>":this.finScoreCutoff));
        sb.append(',');
        sb.append("sobptrmReasGrdePubDate");
        sb.append('=');
        sb.append(((this.sobptrmReasGrdePubDate == null)?"<null>":this.sobptrmReasGrdePubDate));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
        sb.append(',');
        sb.append("ssbsectReasScoreOpenDate");
        sb.append('=');
        sb.append(((this.ssbsectReasScoreOpenDate == null)?"<null>":this.ssbsectReasScoreOpenDate));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("scoreOpenDate");
        sb.append('=');
        sb.append(((this.scoreOpenDate == null)?"<null>":this.scoreOpenDate));
        sb.append(',');
        sb.append("reasGrdePubDate");
        sb.append('=');
        sb.append(((this.reasGrdePubDate == null)?"<null>":this.reasGrdePubDate));
        sb.append(',');
        sb.append("sobptrmDetGrdePubDate");
        sb.append('=');
        sb.append(((this.sobptrmDetGrdePubDate == null)?"<null>":this.sobptrmDetGrdePubDate));
        sb.append(',');
        sb.append("reasScoreOpenDate");
        sb.append('=');
        sb.append(((this.reasScoreOpenDate == null)?"<null>":this.reasScoreOpenDate));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("ssbssecReasGrdePubDate");
        sb.append('=');
        sb.append(((this.ssbssecReasGrdePubDate == null)?"<null>":this.ssbssecReasGrdePubDate));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("ssbsectReasScoreCtofDate");
        sb.append('=');
        sb.append(((this.ssbsectReasScoreCtofDate == null)?"<null>":this.ssbsectReasScoreCtofDate));
        sb.append(',');
        sb.append("ssbssecFinalGrdePubDate");
        sb.append('=');
        sb.append(((this.ssbssecFinalGrdePubDate == null)?"<null>":this.ssbssecFinalGrdePubDate));
        sb.append(',');
        sb.append("sobptrmFinalGrdePubDate");
        sb.append('=');
        sb.append(((this.sobptrmFinalGrdePubDate == null)?"<null>":this.sobptrmFinalGrdePubDate));
        sb.append(',');
        sb.append("finalGrdePubDate");
        sb.append('=');
        sb.append(((this.finalGrdePubDate == null)?"<null>":this.finalGrdePubDate));
        sb.append(',');
        sb.append("ssbssecReasDetGrdePubDate");
        sb.append('=');
        sb.append(((this.ssbssecReasDetGrdePubDate == null)?"<null>":this.ssbssecReasDetGrdePubDate));
        sb.append(',');
        sb.append("ssbsectScoreCutoffDate");
        sb.append('=');
        sb.append(((this.ssbsectScoreCutoffDate == null)?"<null>":this.ssbsectScoreCutoffDate));
        sb.append(',');
        sb.append("reasDetGrdPbDate");
        sb.append('=');
        sb.append(((this.reasDetGrdPbDate == null)?"<null>":this.reasDetGrdPbDate));
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
        result = ((result* 31)+((this.compResitRule == null)? 0 :this.compResitRule.hashCode()));
        result = ((result* 31)+((this.sobptrmScoreOpenDate == null)? 0 :this.sobptrmScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.ssbssecDetGrdePubDate == null)? 0 :this.ssbssecDetGrdePubDate.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmCode == null)? 0 :this.criteriaPtrmCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.reasScoreCtofDate == null)? 0 :this.reasScoreCtofDate.hashCode()));
        result = ((result* 31)+((this.sobptrmReasScoreOpenDate == null)? 0 :this.sobptrmReasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.detGrdePubDate == null)? 0 :this.detGrdePubDate.hashCode()));
        result = ((result* 31)+((this.scoreCutoffDate == null)? 0 :this.scoreCutoffDate.hashCode()));
        result = ((result* 31)+((this.reasScoreCutoffDate == null)? 0 :this.reasScoreCutoffDate.hashCode()));
        result = ((result* 31)+((this.reasDetGrdePubDate == null)? 0 :this.reasDetGrdePubDate.hashCode()));
        result = ((result* 31)+((this.ssbsectScoreOpenDate == null)? 0 :this.ssbsectScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.subResitRule == null)? 0 :this.subResitRule.hashCode()));
        result = ((result* 31)+((this.finScoreCutoff == null)? 0 :this.finScoreCutoff.hashCode()));
        result = ((result* 31)+((this.sobptrmReasGrdePubDate == null)? 0 :this.sobptrmReasGrdePubDate.hashCode()));
        result = ((result* 31)+((this.subLateRule == null)? 0 :this.subLateRule.hashCode()));
        result = ((result* 31)+((this.ssbsectReasScoreOpenDate == null)? 0 :this.ssbsectReasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.compLateRule == null)? 0 :this.compLateRule.hashCode()));
        result = ((result* 31)+((this.scoreOpenDate == null)? 0 :this.scoreOpenDate.hashCode()));
        result = ((result* 31)+((this.reasGrdePubDate == null)? 0 :this.reasGrdePubDate.hashCode()));
        result = ((result* 31)+((this.sobptrmDetGrdePubDate == null)? 0 :this.sobptrmDetGrdePubDate.hashCode()));
        result = ((result* 31)+((this.reasScoreOpenDate == null)? 0 :this.reasScoreOpenDate.hashCode()));
        result = ((result* 31)+((this.ssbssecReasGrdePubDate == null)? 0 :this.ssbssecReasGrdePubDate.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.ssbsectReasScoreCtofDate == null)? 0 :this.ssbsectReasScoreCtofDate.hashCode()));
        result = ((result* 31)+((this.ssbssecFinalGrdePubDate == null)? 0 :this.ssbssecFinalGrdePubDate.hashCode()));
        result = ((result* 31)+((this.sobptrmFinalGrdePubDate == null)? 0 :this.sobptrmFinalGrdePubDate.hashCode()));
        result = ((result* 31)+((this.finalGrdePubDate == null)? 0 :this.finalGrdePubDate.hashCode()));
        result = ((result* 31)+((this.ssbssecReasDetGrdePubDate == null)? 0 :this.ssbssecReasDetGrdePubDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectScoreCutoffDate == null)? 0 :this.ssbsectScoreCutoffDate.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.reasDetGrdPbDate == null)? 0 :this.reasDetGrdPbDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicGradeBookConfiguration100PutRequest) == false) {
            return false;
        }
        ElectronicGradeBookConfiguration100PutRequest rhs = ((ElectronicGradeBookConfiguration100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule)))&&((this.sobptrmScoreOpenDate == rhs.sobptrmScoreOpenDate)||((this.sobptrmScoreOpenDate!= null)&&this.sobptrmScoreOpenDate.equals(rhs.sobptrmScoreOpenDate))))&&((this.ssbssecDetGrdePubDate == rhs.ssbssecDetGrdePubDate)||((this.ssbssecDetGrdePubDate!= null)&&this.ssbssecDetGrdePubDate.equals(rhs.ssbssecDetGrdePubDate))))&&((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.reasScoreCtofDate == rhs.reasScoreCtofDate)||((this.reasScoreCtofDate!= null)&&this.reasScoreCtofDate.equals(rhs.reasScoreCtofDate))))&&((this.sobptrmReasScoreOpenDate == rhs.sobptrmReasScoreOpenDate)||((this.sobptrmReasScoreOpenDate!= null)&&this.sobptrmReasScoreOpenDate.equals(rhs.sobptrmReasScoreOpenDate))))&&((this.detGrdePubDate == rhs.detGrdePubDate)||((this.detGrdePubDate!= null)&&this.detGrdePubDate.equals(rhs.detGrdePubDate))))&&((this.scoreCutoffDate == rhs.scoreCutoffDate)||((this.scoreCutoffDate!= null)&&this.scoreCutoffDate.equals(rhs.scoreCutoffDate))))&&((this.reasScoreCutoffDate == rhs.reasScoreCutoffDate)||((this.reasScoreCutoffDate!= null)&&this.reasScoreCutoffDate.equals(rhs.reasScoreCutoffDate))))&&((this.reasDetGrdePubDate == rhs.reasDetGrdePubDate)||((this.reasDetGrdePubDate!= null)&&this.reasDetGrdePubDate.equals(rhs.reasDetGrdePubDate))))&&((this.ssbsectScoreOpenDate == rhs.ssbsectScoreOpenDate)||((this.ssbsectScoreOpenDate!= null)&&this.ssbsectScoreOpenDate.equals(rhs.ssbsectScoreOpenDate))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.finScoreCutoff == rhs.finScoreCutoff)||((this.finScoreCutoff!= null)&&this.finScoreCutoff.equals(rhs.finScoreCutoff))))&&((this.sobptrmReasGrdePubDate == rhs.sobptrmReasGrdePubDate)||((this.sobptrmReasGrdePubDate!= null)&&this.sobptrmReasGrdePubDate.equals(rhs.sobptrmReasGrdePubDate))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))))&&((this.ssbsectReasScoreOpenDate == rhs.ssbsectReasScoreOpenDate)||((this.ssbsectReasScoreOpenDate!= null)&&this.ssbsectReasScoreOpenDate.equals(rhs.ssbsectReasScoreOpenDate))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.scoreOpenDate == rhs.scoreOpenDate)||((this.scoreOpenDate!= null)&&this.scoreOpenDate.equals(rhs.scoreOpenDate))))&&((this.reasGrdePubDate == rhs.reasGrdePubDate)||((this.reasGrdePubDate!= null)&&this.reasGrdePubDate.equals(rhs.reasGrdePubDate))))&&((this.sobptrmDetGrdePubDate == rhs.sobptrmDetGrdePubDate)||((this.sobptrmDetGrdePubDate!= null)&&this.sobptrmDetGrdePubDate.equals(rhs.sobptrmDetGrdePubDate))))&&((this.reasScoreOpenDate == rhs.reasScoreOpenDate)||((this.reasScoreOpenDate!= null)&&this.reasScoreOpenDate.equals(rhs.reasScoreOpenDate))))&&((this.ssbssecReasGrdePubDate == rhs.ssbssecReasGrdePubDate)||((this.ssbssecReasGrdePubDate!= null)&&this.ssbssecReasGrdePubDate.equals(rhs.ssbssecReasGrdePubDate))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.ssbsectReasScoreCtofDate == rhs.ssbsectReasScoreCtofDate)||((this.ssbsectReasScoreCtofDate!= null)&&this.ssbsectReasScoreCtofDate.equals(rhs.ssbsectReasScoreCtofDate))))&&((this.ssbssecFinalGrdePubDate == rhs.ssbssecFinalGrdePubDate)||((this.ssbssecFinalGrdePubDate!= null)&&this.ssbssecFinalGrdePubDate.equals(rhs.ssbssecFinalGrdePubDate))))&&((this.sobptrmFinalGrdePubDate == rhs.sobptrmFinalGrdePubDate)||((this.sobptrmFinalGrdePubDate!= null)&&this.sobptrmFinalGrdePubDate.equals(rhs.sobptrmFinalGrdePubDate))))&&((this.finalGrdePubDate == rhs.finalGrdePubDate)||((this.finalGrdePubDate!= null)&&this.finalGrdePubDate.equals(rhs.finalGrdePubDate))))&&((this.ssbssecReasDetGrdePubDate == rhs.ssbssecReasDetGrdePubDate)||((this.ssbssecReasDetGrdePubDate!= null)&&this.ssbssecReasDetGrdePubDate.equals(rhs.ssbssecReasDetGrdePubDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectScoreCutoffDate == rhs.ssbsectScoreCutoffDate)||((this.ssbsectScoreCutoffDate!= null)&&this.ssbsectScoreCutoffDate.equals(rhs.ssbsectScoreCutoffDate))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.reasDetGrdPbDate == rhs.reasDetGrdPbDate)||((this.reasDetGrdPbDate!= null)&&this.reasDetGrdPbDate.equals(rhs.reasDetGrdPbDate))));
    }

}
