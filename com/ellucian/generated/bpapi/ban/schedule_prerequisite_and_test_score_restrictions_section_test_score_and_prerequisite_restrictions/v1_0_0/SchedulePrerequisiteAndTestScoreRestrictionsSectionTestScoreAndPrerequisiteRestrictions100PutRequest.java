
package com.ellucian.generated.bpapi.ban.schedule_prerequisite_and_test_score_restrictions_section_test_score_and_prerequisite_restrictions.v1_0_0;

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
    "criteria.concurrencyInd",
    "tescCode",
    "area",
    "criteria.lparen",
    "criteria.areaDescription",
    "crseNumbPreq",
    "criteria.activityDate",
    "criteria.minGrde",
    "criteria.testScore",
    "ssasectCrn",
    "criteria.connector",
    "subjCodePreq",
    "criteria.levlCode",
    "criteria.rparen",
    "concurrencyInd",
    "criteria.subjCodePreq",
    "criteria.tescCode",
    "criteria.crseNumbPreq",
    "ssasectTermCode",
    "criteria.area",
    "rparen",
    "minGrde",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest {

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CONCURRENCY_IND")
    private String criteriaConcurrencyInd;
    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SSRRARE_AREA")
    private String area;
    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_LPAREN")
    private String criteriaLparen;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDescription")
    private String criteriaAreaDescription;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CRSE_NUMB_PREQ")
    private String crseNumbPreq;
    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRRARE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_MIN_GRDE")
    private String criteriaMinGrde;
    /**
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_TEST_SCORE")
    private String criteriaTestScore;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String ssasectCrn;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SSRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CONNECTOR")
    private String criteriaConnector;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj")
    private String subjCodePreq;
    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_LEVL_CODE")
    private String criteriaLevlCode;
    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_RPAREN")
    private String criteriaRparen;
    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CONCURRENCY_IND")
    private String concurrencyInd;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCodePreq;
    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String criteriaTescCode;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CRSE_NUMB_PREQ")
    private String criteriaCrseNumbPreq;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String ssasectTermCode;
    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SSRRARE_AREA")
    private String criteriaArea;
    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_RPAREN")
    private String rparen;
    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_MIN_GRDE")
    private String minGrde;
    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_LPAREN")
    private String lparen;
    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_LEVL_CODE")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    public String getCriteriaConcurrencyInd() {
        return criteriaConcurrencyInd;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    public void setCriteriaConcurrencyInd(String criteriaConcurrencyInd) {
        this.criteriaConcurrencyInd = criteriaConcurrencyInd;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaConcurrencyInd(String criteriaConcurrencyInd) {
        this.criteriaConcurrencyInd = criteriaConcurrencyInd;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    public String getCriteriaLparen() {
        return criteriaLparen;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    public void setCriteriaLparen(String criteriaLparen) {
        this.criteriaLparen = criteriaLparen;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaLparen(String criteriaLparen) {
        this.criteriaLparen = criteriaLparen;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDescription")
    public String getCriteriaAreaDescription() {
        return criteriaAreaDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDescription")
    public void setCriteriaAreaDescription(String criteriaAreaDescription) {
        this.criteriaAreaDescription = criteriaAreaDescription;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaAreaDescription(String criteriaAreaDescription) {
        this.criteriaAreaDescription = criteriaAreaDescription;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("crseNumbPreq")
    public String getCrseNumbPreq() {
        return crseNumbPreq;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("crseNumbPreq")
    public void setCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
        return this;
    }

    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    public String getCriteriaMinGrde() {
        return criteriaMinGrde;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    public void setCriteriaMinGrde(String criteriaMinGrde) {
        this.criteriaMinGrde = criteriaMinGrde;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaMinGrde(String criteriaMinGrde) {
        this.criteriaMinGrde = criteriaMinGrde;
        return this;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    public String getCriteriaTestScore() {
        return criteriaTestScore;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    public void setCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SSRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    public String getCriteriaConnector() {
        return criteriaConnector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SSRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    public void setCriteriaConnector(String criteriaConnector) {
        this.criteriaConnector = criteriaConnector;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaConnector(String criteriaConnector) {
        this.criteriaConnector = criteriaConnector;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public String getSubjCodePreq() {
        return subjCodePreq;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public void setSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    public String getCriteriaRparen() {
        return criteriaRparen;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    public void setCriteriaRparen(String criteriaRparen) {
        this.criteriaRparen = criteriaRparen;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaRparen(String criteriaRparen) {
        this.criteriaRparen = criteriaRparen;
        return this;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    public String getConcurrencyInd() {
        return concurrencyInd;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    public void setConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    public String getCriteriaSubjCodePreq() {
        return criteriaSubjCodePreq;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    public void setCriteriaSubjCodePreq(String criteriaSubjCodePreq) {
        this.criteriaSubjCodePreq = criteriaSubjCodePreq;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaSubjCodePreq(String criteriaSubjCodePreq) {
        this.criteriaSubjCodePreq = criteriaSubjCodePreq;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    public String getCriteriaTescCode() {
        return criteriaTescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SSRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    public void setCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    public String getCriteriaCrseNumbPreq() {
        return criteriaCrseNumbPreq;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    public void setCriteriaCrseNumbPreq(String criteriaCrseNumbPreq) {
        this.criteriaCrseNumbPreq = criteriaCrseNumbPreq;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaCrseNumbPreq(String criteriaCrseNumbPreq) {
        this.criteriaCrseNumbPreq = criteriaCrseNumbPreq;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    public String getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
        return this;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public String getRparen() {
        return rparen;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : SSRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withRparen(String rparen) {
        this.rparen = rparen;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public String getMinGrde() {
        return minGrde;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SSRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public void setMinGrde(String minGrde) {
        this.minGrde = minGrde;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withMinGrde(String minGrde) {
        this.minGrde = minGrde;
        return this;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public String getLparen() {
        return lparen;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : SSRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withLparen(String lparen) {
        this.lparen = lparen;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaConcurrencyInd");
        sb.append('=');
        sb.append(((this.criteriaConcurrencyInd == null)?"<null>":this.criteriaConcurrencyInd));
        sb.append(',');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("criteriaLparen");
        sb.append('=');
        sb.append(((this.criteriaLparen == null)?"<null>":this.criteriaLparen));
        sb.append(',');
        sb.append("criteriaAreaDescription");
        sb.append('=');
        sb.append(((this.criteriaAreaDescription == null)?"<null>":this.criteriaAreaDescription));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaMinGrde");
        sb.append('=');
        sb.append(((this.criteriaMinGrde == null)?"<null>":this.criteriaMinGrde));
        sb.append(',');
        sb.append("criteriaTestScore");
        sb.append('=');
        sb.append(((this.criteriaTestScore == null)?"<null>":this.criteriaTestScore));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("criteriaConnector");
        sb.append('=');
        sb.append(((this.criteriaConnector == null)?"<null>":this.criteriaConnector));
        sb.append(',');
        sb.append("subjCodePreq");
        sb.append('=');
        sb.append(((this.subjCodePreq == null)?"<null>":this.subjCodePreq));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaRparen");
        sb.append('=');
        sb.append(((this.criteriaRparen == null)?"<null>":this.criteriaRparen));
        sb.append(',');
        sb.append("concurrencyInd");
        sb.append('=');
        sb.append(((this.concurrencyInd == null)?"<null>":this.concurrencyInd));
        sb.append(',');
        sb.append("criteriaSubjCodePreq");
        sb.append('=');
        sb.append(((this.criteriaSubjCodePreq == null)?"<null>":this.criteriaSubjCodePreq));
        sb.append(',');
        sb.append("criteriaTescCode");
        sb.append('=');
        sb.append(((this.criteriaTescCode == null)?"<null>":this.criteriaTescCode));
        sb.append(',');
        sb.append("criteriaCrseNumbPreq");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbPreq == null)?"<null>":this.criteriaCrseNumbPreq));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("criteriaArea");
        sb.append('=');
        sb.append(((this.criteriaArea == null)?"<null>":this.criteriaArea));
        sb.append(',');
        sb.append("rparen");
        sb.append('=');
        sb.append(((this.rparen == null)?"<null>":this.rparen));
        sb.append(',');
        sb.append("minGrde");
        sb.append('=');
        sb.append(((this.minGrde == null)?"<null>":this.minGrde));
        sb.append(',');
        sb.append("lparen");
        sb.append('=');
        sb.append(((this.lparen == null)?"<null>":this.lparen));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.criteriaConnector == null)? 0 :this.criteriaConnector.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodePreq == null)? 0 :this.criteriaSubjCodePreq.hashCode()));
        result = ((result* 31)+((this.criteriaAreaDescription == null)? 0 :this.criteriaAreaDescription.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbPreq == null)? 0 :this.criteriaCrseNumbPreq.hashCode()));
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaArea == null)? 0 :this.criteriaArea.hashCode()));
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.concurrencyInd == null)? 0 :this.concurrencyInd.hashCode()));
        result = ((result* 31)+((this.criteriaConcurrencyInd == null)? 0 :this.criteriaConcurrencyInd.hashCode()));
        result = ((result* 31)+((this.criteriaLparen == null)? 0 :this.criteriaLparen.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTescCode == null)? 0 :this.criteriaTescCode.hashCode()));
        result = ((result* 31)+((this.criteriaMinGrde == null)? 0 :this.criteriaMinGrde.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.minGrde == null)? 0 :this.minGrde.hashCode()));
        result = ((result* 31)+((this.criteriaRparen == null)? 0 :this.criteriaRparen.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTestScore == null)? 0 :this.criteriaTestScore.hashCode()));
        result = ((result* 31)+((this.lparen == null)? 0 :this.lparen.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest) == false) {
            return false;
        }
        SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest rhs = ((SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutRequest) other);
        return ((((((((((((((((((((((((((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn)))&&((this.criteriaConnector == rhs.criteriaConnector)||((this.criteriaConnector!= null)&&this.criteriaConnector.equals(rhs.criteriaConnector))))&&((this.criteriaSubjCodePreq == rhs.criteriaSubjCodePreq)||((this.criteriaSubjCodePreq!= null)&&this.criteriaSubjCodePreq.equals(rhs.criteriaSubjCodePreq))))&&((this.criteriaAreaDescription == rhs.criteriaAreaDescription)||((this.criteriaAreaDescription!= null)&&this.criteriaAreaDescription.equals(rhs.criteriaAreaDescription))))&&((this.criteriaCrseNumbPreq == rhs.criteriaCrseNumbPreq)||((this.criteriaCrseNumbPreq!= null)&&this.criteriaCrseNumbPreq.equals(rhs.criteriaCrseNumbPreq))))&&((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.concurrencyInd == rhs.concurrencyInd)||((this.concurrencyInd!= null)&&this.concurrencyInd.equals(rhs.concurrencyInd))))&&((this.criteriaConcurrencyInd == rhs.criteriaConcurrencyInd)||((this.criteriaConcurrencyInd!= null)&&this.criteriaConcurrencyInd.equals(rhs.criteriaConcurrencyInd))))&&((this.criteriaLparen == rhs.criteriaLparen)||((this.criteriaLparen!= null)&&this.criteriaLparen.equals(rhs.criteriaLparen))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.criteriaTescCode == rhs.criteriaTescCode)||((this.criteriaTescCode!= null)&&this.criteriaTescCode.equals(rhs.criteriaTescCode))))&&((this.criteriaMinGrde == rhs.criteriaMinGrde)||((this.criteriaMinGrde!= null)&&this.criteriaMinGrde.equals(rhs.criteriaMinGrde))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.criteriaRparen == rhs.criteriaRparen)||((this.criteriaRparen!= null)&&this.criteriaRparen.equals(rhs.criteriaRparen))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTestScore == rhs.criteriaTestScore)||((this.criteriaTestScore!= null)&&this.criteriaTestScore.equals(rhs.criteriaTestScore))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
