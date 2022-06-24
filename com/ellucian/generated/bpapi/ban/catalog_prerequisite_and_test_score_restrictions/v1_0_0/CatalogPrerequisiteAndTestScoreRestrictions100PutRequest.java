
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "tescCode",
    "area",
    "criteria.activityDate",
    "criteria.userId",
    "crseNumbPreq",
    "criteria.crseNumb",
    "subjCode",
    "subjCodePreq",
    "keyblckTermCode",
    "criteria.subjCode",
    "criteria.inProgram",
    "program",
    "criteria.title",
    "concurrencyCde",
    "prereqChkMethodCde",
    "connector",
    "testScore",
    "rparen",
    "minGrde",
    "criteria.subjDescription",
    "criteria.prereqChkMethodCde",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class CatalogPrerequisiteAndTestScoreRestrictions100PutRequest {

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRPRTS_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SCRPARE_AREA")
    private String area;
    /**
     * Lineage reference object : SCRCLPP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SCRCLPP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_USER_ID")
    private String criteriaUserId;
    /**
     * Course
     * <p>
     * Lineage reference object : SCRPRTS_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumbPreq;
    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky")
    private String criteriaCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRPRTS_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj")
    private String subjCodePreq;
    /**
     * Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.subjCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky")
    private String criteriaSubjCode;
    @JsonProperty("criteria.inProgram")
    private String criteriaInProgram;
    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : program")
    private String program;
    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.title")
    private String criteriaTitle;
    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRPRTS_CONCURRENCY_CDE
     * 
     */
    @JsonProperty("concurrencyCde")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_CONCURRENCY_CDE")
    private String concurrencyCde;
    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRPRTS_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_CONNECTOR")
    private String connector;
    /**
     * Test Score
     * <p>
     * Lineage reference object : SCRPRTS_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_TEST_SCORE")
    private String testScore;
    /**
     * )
     * <p>
     * Lineage reference object : SCRPRTS_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_RPAREN")
    private String rparen;
    /**
     * Grade
     * <p>
     * Lineage reference object : SCRPRTS_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_MIN_GRDE")
    private String minGrde;
    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjDescription")
    private String criteriaSubjDescription;
    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("criteria.prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE")
    private String criteriaPrereqChkMethodCde;
    /**
     * (
     * <p>
     * Lineage reference object : SCRPRTS_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_LPAREN")
    private String lparen;
    /**
     * Level
     * <p>
     * Lineage reference object : SCRPRTS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_LEVL_CODE")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRPRTS_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRPRTS_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Lineage reference object : SCRCLPP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SCRCLPP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : SCRCLPP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SCRCLPP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRPRTS_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    public String getCrseNumbPreq() {
        return crseNumbPreq;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRPRTS_CRSE_NUMB_PREQ, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbPreq")
    public void setCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRPRTS_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public String getSubjCodePreq() {
        return subjCodePreq;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRPRTS_SUBJ_CODE_PREQ, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodePreq")
    public void setSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
        return this;
    }

    /**
     * Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    @JsonProperty("criteria.inProgram")
    public String getCriteriaInProgram() {
        return criteriaInProgram;
    }

    @JsonProperty("criteria.inProgram")
    public void setCriteriaInProgram(String criteriaInProgram) {
        this.criteriaInProgram = criteriaInProgram;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaInProgram(String criteriaInProgram) {
        this.criteriaInProgram = criteriaInProgram;
        return this;
    }

    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRPRTS_CONCURRENCY_CDE
     * 
     */
    @JsonProperty("concurrencyCde")
    public String getConcurrencyCde() {
        return concurrencyCde;
    }

    /**
     * Concurrency
     * <p>
     * Lineage reference object : SCRPRTS_CONCURRENCY_CDE
     * 
     */
    @JsonProperty("concurrencyCde")
    public void setConcurrencyCde(String concurrencyCde) {
        this.concurrencyCde = concurrencyCde;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withConcurrencyCde(String concurrencyCde) {
        this.concurrencyCde = concurrencyCde;
        return this;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRPRTS_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public String getConnector() {
        return connector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SCRPRTS_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public void setConnector(String connector) {
        this.connector = connector;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withConnector(String connector) {
        this.connector = connector;
        return this;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SCRPRTS_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SCRPRTS_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRPRTS_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public String getRparen() {
        return rparen;
    }

    /**
     * )
     * <p>
     * Lineage reference object : SCRPRTS_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withRparen(String rparen) {
        this.rparen = rparen;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRPRTS_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public String getMinGrde() {
        return minGrde;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRPRTS_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    public void setMinGrde(String minGrde) {
        this.minGrde = minGrde;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withMinGrde(String minGrde) {
        this.minGrde = minGrde;
        return this;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjDescription")
    public String getCriteriaSubjDescription() {
        return criteriaSubjDescription;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjDescription")
    public void setCriteriaSubjDescription(String criteriaSubjDescription) {
        this.criteriaSubjDescription = criteriaSubjDescription;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaSubjDescription(String criteriaSubjDescription) {
        this.criteriaSubjDescription = criteriaSubjDescription;
        return this;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("criteria.prereqChkMethodCde")
    public String getCriteriaPrereqChkMethodCde() {
        return criteriaPrereqChkMethodCde;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("criteria.prereqChkMethodCde")
    public void setCriteriaPrereqChkMethodCde(String criteriaPrereqChkMethodCde) {
        this.criteriaPrereqChkMethodCde = criteriaPrereqChkMethodCde;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withCriteriaPrereqChkMethodCde(String criteriaPrereqChkMethodCde) {
        this.criteriaPrereqChkMethodCde = criteriaPrereqChkMethodCde;
        return this;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRPRTS_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public String getLparen() {
        return lparen;
    }

    /**
     * (
     * <p>
     * Lineage reference object : SCRPRTS_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withLparen(String lparen) {
        this.lparen = lparen;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRPRTS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRPRTS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withLevlCode(String levlCode) {
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogPrerequisiteAndTestScoreRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("criteriaCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaCrseNumb == null)?"<null>":this.criteriaCrseNumb));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("subjCodePreq");
        sb.append('=');
        sb.append(((this.subjCodePreq == null)?"<null>":this.subjCodePreq));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("criteriaInProgram");
        sb.append('=');
        sb.append(((this.criteriaInProgram == null)?"<null>":this.criteriaInProgram));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("concurrencyCde");
        sb.append('=');
        sb.append(((this.concurrencyCde == null)?"<null>":this.concurrencyCde));
        sb.append(',');
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
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
        sb.append("criteriaSubjDescription");
        sb.append('=');
        sb.append(((this.criteriaSubjDescription == null)?"<null>":this.criteriaSubjDescription));
        sb.append(',');
        sb.append("criteriaPrereqChkMethodCde");
        sb.append('=');
        sb.append(((this.criteriaPrereqChkMethodCde == null)?"<null>":this.criteriaPrereqChkMethodCde));
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
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.prereqChkMethodCde == null)? 0 :this.prereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.criteriaSubjDescription == null)? 0 :this.criteriaSubjDescription.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.criteriaInProgram == null)? 0 :this.criteriaInProgram.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaPrereqChkMethodCde == null)? 0 :this.criteriaPrereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.concurrencyCde == null)? 0 :this.concurrencyCde.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.minGrde == null)? 0 :this.minGrde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lparen == null)? 0 :this.lparen.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogPrerequisiteAndTestScoreRestrictions100PutRequest) == false) {
            return false;
        }
        CatalogPrerequisiteAndTestScoreRestrictions100PutRequest rhs = ((CatalogPrerequisiteAndTestScoreRestrictions100PutRequest) other);
        return (((((((((((((((((((((((((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program)))&&((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde))))&&((this.criteriaSubjDescription == rhs.criteriaSubjDescription)||((this.criteriaSubjDescription!= null)&&this.criteriaSubjDescription.equals(rhs.criteriaSubjDescription))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.criteriaInProgram == rhs.criteriaInProgram)||((this.criteriaInProgram!= null)&&this.criteriaInProgram.equals(rhs.criteriaInProgram))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaPrereqChkMethodCde == rhs.criteriaPrereqChkMethodCde)||((this.criteriaPrereqChkMethodCde!= null)&&this.criteriaPrereqChkMethodCde.equals(rhs.criteriaPrereqChkMethodCde))))&&((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.concurrencyCde == rhs.concurrencyCde)||((this.concurrencyCde!= null)&&this.concurrencyCde.equals(rhs.concurrencyCde))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
