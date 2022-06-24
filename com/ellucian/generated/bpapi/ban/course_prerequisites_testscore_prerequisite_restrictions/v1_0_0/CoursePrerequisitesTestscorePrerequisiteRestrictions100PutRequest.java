
package com.ellucian.generated.bpapi.ban.course_prerequisites_testscore_prerequisite_restrictions.v1_0_0;

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
    "criteria.lparen",
    "termCodeEff",
    "crseNumbPreq",
    "criteria.minGrde",
    "subjCode",
    "criteria.testScore",
    "criteria.connector",
    "subjCodePreq",
    "criteria.levlCode",
    "criteria.rparen",
    "concurrencyInd",
    "criteria.subjCodePreq",
    "crseNumb",
    "criteria.tescCode",
    "criteria.crseNumbPreq",
    "connector",
    "testScore",
    "rparen",
    "minGrde",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest {

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONCURRENCY_IND")
    private String criteriaConcurrencyInd;
    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_LPAREN")
    private String criteriaLparen;
    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String termCodeEff;
    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumbPreq;
    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_MIN_GRDE")
    private String criteriaMinGrde;
    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TEST_SCORE")
    private String criteriaTestScore;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONNECTOR")
    private String criteriaConnector;
    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj")
    private String subjCodePreq;
    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_LEVL_CODE")
    private String criteriaLevlCode;
    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_RPAREN")
    private String criteriaRparen;
    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONCURRENCY_IND")
    private String concurrencyInd;
    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCodePreq;
    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumb;
    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String criteriaTescCode;
    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky")
    private String criteriaCrseNumbPreq;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONNECTOR")
    private String connector;
    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TEST_SCORE")
    private String testScore;
    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_RPAREN")
    private String rparen;
    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_MIN_GRDE")
    private String minGrde;
    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_LPAREN")
    private String lparen;
    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_LEVL_CODE")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    public String getCriteriaConcurrencyInd() {
        return criteriaConcurrencyInd;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("criteria.concurrencyInd")
    public void setCriteriaConcurrencyInd(String criteriaConcurrencyInd) {
        this.criteriaConcurrencyInd = criteriaConcurrencyInd;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaConcurrencyInd(String criteriaConcurrencyInd) {
        this.criteriaConcurrencyInd = criteriaConcurrencyInd;
        return this;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    public String getCriteriaLparen() {
        return criteriaLparen;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("criteria.lparen")
    public void setCriteriaLparen(String criteriaLparen) {
        this.criteriaLparen = criteriaLparen;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaLparen(String criteriaLparen) {
        this.criteriaLparen = criteriaLparen;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    public String getCrseNumbPreq() {
        return crseNumbPreq;
    }

    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    public void setCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
        return this;
    }

    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    public String getCriteriaMinGrde() {
        return criteriaMinGrde;
    }

    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("criteria.minGrde")
    public void setCriteriaMinGrde(String criteriaMinGrde) {
        this.criteriaMinGrde = criteriaMinGrde;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaMinGrde(String criteriaMinGrde) {
        this.criteriaMinGrde = criteriaMinGrde;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    public String getCriteriaTestScore() {
        return criteriaTestScore;
    }

    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("criteria.testScore")
    public void setCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    public String getCriteriaConnector() {
        return criteriaConnector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("criteria.connector")
    public void setCriteriaConnector(String criteriaConnector) {
        this.criteriaConnector = criteriaConnector;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaConnector(String criteriaConnector) {
        this.criteriaConnector = criteriaConnector;
        return this;
    }

    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public String getSubjCodePreq() {
        return subjCodePreq;
    }

    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public void setSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
        return this;
    }

    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    public String getCriteriaRparen() {
        return criteriaRparen;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("criteria.rparen")
    public void setCriteriaRparen(String criteriaRparen) {
        this.criteriaRparen = criteriaRparen;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaRparen(String criteriaRparen) {
        this.criteriaRparen = criteriaRparen;
        return this;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    public String getConcurrencyInd() {
        return concurrencyInd;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    public void setConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
        return this;
    }

    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    public String getCriteriaSubjCodePreq() {
        return criteriaSubjCodePreq;
    }

    /**
     * Prerequisite Subject
     * <p>
     * Lineage reference object : SCRRTST_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodePreq")
    public void setCriteriaSubjCodePreq(String criteriaSubjCodePreq) {
        this.criteriaSubjCodePreq = criteriaSubjCodePreq;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaSubjCodePreq(String criteriaSubjCodePreq) {
        this.criteriaSubjCodePreq = criteriaSubjCodePreq;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    public String getCriteriaTescCode() {
        return criteriaTescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("criteria.tescCode")
    public void setCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
        return this;
    }

    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    public String getCriteriaCrseNumbPreq() {
        return criteriaCrseNumbPreq;
    }

    /**
     * Prerequisite Course
     * <p>
     * Lineage reference object : SCRRTST_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumbPreq")
    public void setCriteriaCrseNumbPreq(String criteriaCrseNumbPreq) {
        this.criteriaCrseNumbPreq = criteriaCrseNumbPreq;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withCriteriaCrseNumbPreq(String criteriaCrseNumbPreq) {
        this.criteriaCrseNumbPreq = criteriaCrseNumbPreq;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public String getConnector() {
        return connector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public void setConnector(String connector) {
        this.connector = connector;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withConnector(String connector) {
        this.connector = connector;
        return this;
    }

    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public String getRparen() {
        return rparen;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withRparen(String rparen) {
        this.rparen = rparen;
        return this;
    }

    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public String getMinGrde() {
        return minGrde;
    }

    /**
     * Prerequisite Grade
     * <p>
     * Lineage reference object : SCRRTST_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public void setMinGrde(String minGrde) {
        this.minGrde = minGrde;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withMinGrde(String minGrde) {
        this.minGrde = minGrde;
        return this;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public String getLparen() {
        return lparen;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRRTST_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withLparen(String lparen) {
        this.lparen = lparen;
        return this;
    }

    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Prerequisite Level
     * <p>
     * Lineage reference object : SCRRTST_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withLevlCode(String levlCode) {
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

    public CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaConcurrencyInd");
        sb.append('=');
        sb.append(((this.criteriaConcurrencyInd == null)?"<null>":this.criteriaConcurrencyInd));
        sb.append(',');
        sb.append("criteriaLparen");
        sb.append('=');
        sb.append(((this.criteriaLparen == null)?"<null>":this.criteriaLparen));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("criteriaMinGrde");
        sb.append('=');
        sb.append(((this.criteriaMinGrde == null)?"<null>":this.criteriaMinGrde));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("criteriaTestScore");
        sb.append('=');
        sb.append(((this.criteriaTestScore == null)?"<null>":this.criteriaTestScore));
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
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("criteriaTescCode");
        sb.append('=');
        sb.append(((this.criteriaTescCode == null)?"<null>":this.criteriaTescCode));
        sb.append(',');
        sb.append("criteriaCrseNumbPreq");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbPreq == null)?"<null>":this.criteriaCrseNumbPreq));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
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
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.concurrencyInd == null)? 0 :this.concurrencyInd.hashCode()));
        result = ((result* 31)+((this.criteriaConcurrencyInd == null)? 0 :this.criteriaConcurrencyInd.hashCode()));
        result = ((result* 31)+((this.criteriaConnector == null)? 0 :this.criteriaConnector.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaLparen == null)? 0 :this.criteriaLparen.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodePreq == null)? 0 :this.criteriaSubjCodePreq.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.criteriaTescCode == null)? 0 :this.criteriaTescCode.hashCode()));
        result = ((result* 31)+((this.criteriaMinGrde == null)? 0 :this.criteriaMinGrde.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.minGrde == null)? 0 :this.minGrde.hashCode()));
        result = ((result* 31)+((this.criteriaRparen == null)? 0 :this.criteriaRparen.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbPreq == null)? 0 :this.criteriaCrseNumbPreq.hashCode()));
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
        if ((other instanceof CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest) == false) {
            return false;
        }
        CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest rhs = ((CoursePrerequisitesTestscorePrerequisiteRestrictions100PutRequest) other);
        return ((((((((((((((((((((((((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff)))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.concurrencyInd == rhs.concurrencyInd)||((this.concurrencyInd!= null)&&this.concurrencyInd.equals(rhs.concurrencyInd))))&&((this.criteriaConcurrencyInd == rhs.criteriaConcurrencyInd)||((this.criteriaConcurrencyInd!= null)&&this.criteriaConcurrencyInd.equals(rhs.criteriaConcurrencyInd))))&&((this.criteriaConnector == rhs.criteriaConnector)||((this.criteriaConnector!= null)&&this.criteriaConnector.equals(rhs.criteriaConnector))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.criteriaLparen == rhs.criteriaLparen)||((this.criteriaLparen!= null)&&this.criteriaLparen.equals(rhs.criteriaLparen))))&&((this.criteriaSubjCodePreq == rhs.criteriaSubjCodePreq)||((this.criteriaSubjCodePreq!= null)&&this.criteriaSubjCodePreq.equals(rhs.criteriaSubjCodePreq))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.criteriaTescCode == rhs.criteriaTescCode)||((this.criteriaTescCode!= null)&&this.criteriaTescCode.equals(rhs.criteriaTescCode))))&&((this.criteriaMinGrde == rhs.criteriaMinGrde)||((this.criteriaMinGrde!= null)&&this.criteriaMinGrde.equals(rhs.criteriaMinGrde))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.criteriaRparen == rhs.criteriaRparen)||((this.criteriaRparen!= null)&&this.criteriaRparen.equals(rhs.criteriaRparen))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaCrseNumbPreq == rhs.criteriaCrseNumbPreq)||((this.criteriaCrseNumbPreq!= null)&&this.criteriaCrseNumbPreq.equals(rhs.criteriaCrseNumbPreq))))&&((this.criteriaTestScore == rhs.criteriaTestScore)||((this.criteriaTestScore!= null)&&this.criteriaTestScore.equals(rhs.criteriaTestScore))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
