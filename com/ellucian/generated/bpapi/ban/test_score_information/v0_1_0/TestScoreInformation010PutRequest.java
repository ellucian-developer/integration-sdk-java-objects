
package com.ellucian.generated.bpapi.ban.test_score_information.v0_1_0;

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
    "criteria.admrCode",
    "criteria.equivInd",
    "criteria.tsrcCode",
    "criteria.rcrvInd",
    "criteria.teinCode",
    "criteria.testScore",
    "tsptCode",
    "criteria.tefrCode",
    "instrId",
    "tadmCode",
    "releaseInd",
    "criteria.dispTestDate",
    "criteria.applNo",
    "criteria.percentile",
    "criteria.tsptCode",
    "criteria.instrId",
    "criteria.queryTestDate",
    "criteria.percentileDate",
    "percentileDate",
    "criteria.tadmCode",
    "equivInd",
    "teacCode",
    "testScore",
    "tefrCode",
    "rcrvInd",
    "id",
    "criteria.teacCode",
    "teinCode",
    "termCodeEntry",
    "teprCode",
    "applNo",
    "criteria.releaseInd",
    "tsrcCode",
    "criteria.teprCode",
    "criteria.tescCode",
    "admrCode",
    "satEssayId",
    "percentile",
    "criteria.testDate",
    "criteria.satEssayId",
    "dispTestDate",
    "criteria.termCodeEntry"
})
@Generated("jsonschema2pojo")
public class TestScoreInformation010PutRequest {

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("criteria.equivInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_EQUIV_IND")
    private String criteriaEquivInd;
    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("criteria.tsrcCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc")
    private String criteriaTsrcCode;
    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("criteria.rcrvInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RCRV_IND")
    private String criteriaRcrvInd;
    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("criteria.teinCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein")
    private String criteriaTeinCode;
    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.testScore")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEST_SCORE")
    private String criteriaTestScore;
    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt")
    private String tsptCode;
    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("criteria.tefrCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr")
    private String criteriaTefrCode;
    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("instrId")
    @JsonPropertyDescription("Lineage reference object : SORTEST_INSTR_ID")
    private String instrId;
    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm")
    private String tadmCode;
    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RELEASE_IND")
    private String releaseInd;
    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.dispTestDate")
    private Date criteriaDispTestDate;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    @JsonPropertyDescription("Lineage reference object : SORTEST_APPL_NO")
    private Double criteriaApplNo;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE")
    private String criteriaPercentile;
    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("criteria.tsptCode")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt")
    private String criteriaTsptCode;
    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("criteria.instrId")
    @JsonPropertyDescription("Lineage reference object : SORTEST_INSTR_ID")
    private String criteriaInstrId;
    /**
     * Test Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryTestDate")
    private String criteriaQueryTestDate;
    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("criteria.percentileDate")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE_DATE")
    private Date criteriaPercentileDate;
    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE_DATE")
    private Date percentileDate;
    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("criteria.tadmCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm")
    private String criteriaTadmCode;
    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("equivInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_EQUIV_IND")
    private String equivInd;
    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("teacCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac")
    private String teacCode;
    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEST_SCORE")
    private String testScore;
    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("tefrCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr")
    private String tefrCode;
    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("rcrvInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RCRV_IND")
    private String rcrvInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("criteria.teacCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac")
    private String criteriaTeacCode;
    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("teinCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein")
    private String teinCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String termCodeEntry;
    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("teprCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr")
    private String teprCode;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SORTEST_APPL_NO")
    private Double applNo;
    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RELEASE_IND")
    private String criteriaReleaseInd;
    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc")
    private String tsrcCode;
    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("criteria.teprCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr")
    private String criteriaTeprCode;
    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tescCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String criteriaTescCode;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("satEssayId")
    @JsonPropertyDescription("Lineage reference object : SORTEST_SAT_ESSAY_ID")
    private String satEssayId;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE")
    private String percentile;
    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("criteria.testDate")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEST_DATE")
    private Date criteriaTestDate;
    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("criteria.satEssayId")
    @JsonPropertyDescription("Lineage reference object : SORTEST_SAT_ESSAY_ID")
    private String criteriaSatEssayId;
    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dispTestDate")
    private Date dispTestDate;
    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEntry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public TestScoreInformation010PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("criteria.equivInd")
    public String getCriteriaEquivInd() {
        return criteriaEquivInd;
    }

    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("criteria.equivInd")
    public void setCriteriaEquivInd(String criteriaEquivInd) {
        this.criteriaEquivInd = criteriaEquivInd;
    }

    public TestScoreInformation010PutRequest withCriteriaEquivInd(String criteriaEquivInd) {
        this.criteriaEquivInd = criteriaEquivInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("criteria.tsrcCode")
    public String getCriteriaTsrcCode() {
        return criteriaTsrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("criteria.tsrcCode")
    public void setCriteriaTsrcCode(String criteriaTsrcCode) {
        this.criteriaTsrcCode = criteriaTsrcCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTsrcCode(String criteriaTsrcCode) {
        this.criteriaTsrcCode = criteriaTsrcCode;
        return this;
    }

    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("criteria.rcrvInd")
    public String getCriteriaRcrvInd() {
        return criteriaRcrvInd;
    }

    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("criteria.rcrvInd")
    public void setCriteriaRcrvInd(String criteriaRcrvInd) {
        this.criteriaRcrvInd = criteriaRcrvInd;
    }

    public TestScoreInformation010PutRequest withCriteriaRcrvInd(String criteriaRcrvInd) {
        this.criteriaRcrvInd = criteriaRcrvInd;
        return this;
    }

    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("criteria.teinCode")
    public String getCriteriaTeinCode() {
        return criteriaTeinCode;
    }

    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("criteria.teinCode")
    public void setCriteriaTeinCode(String criteriaTeinCode) {
        this.criteriaTeinCode = criteriaTeinCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTeinCode(String criteriaTeinCode) {
        this.criteriaTeinCode = criteriaTeinCode;
        return this;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.testScore")
    public String getCriteriaTestScore() {
        return criteriaTestScore;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.testScore")
    public void setCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
    }

    public TestScoreInformation010PutRequest withCriteriaTestScore(String criteriaTestScore) {
        this.criteriaTestScore = criteriaTestScore;
        return this;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    public String getTsptCode() {
        return tsptCode;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    public void setTsptCode(String tsptCode) {
        this.tsptCode = tsptCode;
    }

    public TestScoreInformation010PutRequest withTsptCode(String tsptCode) {
        this.tsptCode = tsptCode;
        return this;
    }

    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("criteria.tefrCode")
    public String getCriteriaTefrCode() {
        return criteriaTefrCode;
    }

    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("criteria.tefrCode")
    public void setCriteriaTefrCode(String criteriaTefrCode) {
        this.criteriaTefrCode = criteriaTefrCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTefrCode(String criteriaTefrCode) {
        this.criteriaTefrCode = criteriaTefrCode;
        return this;
    }

    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("instrId")
    public String getInstrId() {
        return instrId;
    }

    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("instrId")
    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }

    public TestScoreInformation010PutRequest withInstrId(String instrId) {
        this.instrId = instrId;
        return this;
    }

    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    public String getTadmCode() {
        return tadmCode;
    }

    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    public void setTadmCode(String tadmCode) {
        this.tadmCode = tadmCode;
    }

    public TestScoreInformation010PutRequest withTadmCode(String tadmCode) {
        this.tadmCode = tadmCode;
        return this;
    }

    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    public String getReleaseInd() {
        return releaseInd;
    }

    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    public void setReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
    }

    public TestScoreInformation010PutRequest withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
        return this;
    }

    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.dispTestDate")
    public Date getCriteriaDispTestDate() {
        return criteriaDispTestDate;
    }

    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.dispTestDate")
    public void setCriteriaDispTestDate(Date criteriaDispTestDate) {
        this.criteriaDispTestDate = criteriaDispTestDate;
    }

    public TestScoreInformation010PutRequest withCriteriaDispTestDate(Date criteriaDispTestDate) {
        this.criteriaDispTestDate = criteriaDispTestDate;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    public Double getCriteriaApplNo() {
        return criteriaApplNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    public void setCriteriaApplNo(Double criteriaApplNo) {
        this.criteriaApplNo = criteriaApplNo;
    }

    public TestScoreInformation010PutRequest withCriteriaApplNo(Double criteriaApplNo) {
        this.criteriaApplNo = criteriaApplNo;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public String getCriteriaPercentile() {
        return criteriaPercentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public void setCriteriaPercentile(String criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
    }

    public TestScoreInformation010PutRequest withCriteriaPercentile(String criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
        return this;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("criteria.tsptCode")
    public String getCriteriaTsptCode() {
        return criteriaTsptCode;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("criteria.tsptCode")
    public void setCriteriaTsptCode(String criteriaTsptCode) {
        this.criteriaTsptCode = criteriaTsptCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTsptCode(String criteriaTsptCode) {
        this.criteriaTsptCode = criteriaTsptCode;
        return this;
    }

    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("criteria.instrId")
    public String getCriteriaInstrId() {
        return criteriaInstrId;
    }

    /**
     * Instrument ID
     * <p>
     * Lineage reference object : SORTEST_INSTR_ID
     * 
     */
    @JsonProperty("criteria.instrId")
    public void setCriteriaInstrId(String criteriaInstrId) {
        this.criteriaInstrId = criteriaInstrId;
    }

    public TestScoreInformation010PutRequest withCriteriaInstrId(String criteriaInstrId) {
        this.criteriaInstrId = criteriaInstrId;
        return this;
    }

    /**
     * Test Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryTestDate")
    public String getCriteriaQueryTestDate() {
        return criteriaQueryTestDate;
    }

    /**
     * Test Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryTestDate")
    public void setCriteriaQueryTestDate(String criteriaQueryTestDate) {
        this.criteriaQueryTestDate = criteriaQueryTestDate;
    }

    public TestScoreInformation010PutRequest withCriteriaQueryTestDate(String criteriaQueryTestDate) {
        this.criteriaQueryTestDate = criteriaQueryTestDate;
        return this;
    }

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("criteria.percentileDate")
    public Date getCriteriaPercentileDate() {
        return criteriaPercentileDate;
    }

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("criteria.percentileDate")
    public void setCriteriaPercentileDate(Date criteriaPercentileDate) {
        this.criteriaPercentileDate = criteriaPercentileDate;
    }

    public TestScoreInformation010PutRequest withCriteriaPercentileDate(Date criteriaPercentileDate) {
        this.criteriaPercentileDate = criteriaPercentileDate;
        return this;
    }

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    public Date getPercentileDate() {
        return percentileDate;
    }

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    public void setPercentileDate(Date percentileDate) {
        this.percentileDate = percentileDate;
    }

    public TestScoreInformation010PutRequest withPercentileDate(Date percentileDate) {
        this.percentileDate = percentileDate;
        return this;
    }

    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("criteria.tadmCode")
    public String getCriteriaTadmCode() {
        return criteriaTadmCode;
    }

    /**
     * Administration Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("criteria.tadmCode")
    public void setCriteriaTadmCode(String criteriaTadmCode) {
        this.criteriaTadmCode = criteriaTadmCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTadmCode(String criteriaTadmCode) {
        this.criteriaTadmCode = criteriaTadmCode;
        return this;
    }

    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("equivInd")
    public String getEquivInd() {
        return equivInd;
    }

    /**
     * Lineage reference object : SORTEST_EQUIV_IND
     * 
     */
    @JsonProperty("equivInd")
    public void setEquivInd(String equivInd) {
        this.equivInd = equivInd;
    }

    public TestScoreInformation010PutRequest withEquivInd(String equivInd) {
        this.equivInd = equivInd;
        return this;
    }

    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("teacCode")
    public String getTeacCode() {
        return teacCode;
    }

    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("teacCode")
    public void setTeacCode(String teacCode) {
        this.teacCode = teacCode;
    }

    public TestScoreInformation010PutRequest withTeacCode(String teacCode) {
        this.teacCode = teacCode;
        return this;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * (Required)
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public TestScoreInformation010PutRequest withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("tefrCode")
    public String getTefrCode() {
        return tefrCode;
    }

    /**
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("tefrCode")
    public void setTefrCode(String tefrCode) {
        this.tefrCode = tefrCode;
    }

    public TestScoreInformation010PutRequest withTefrCode(String tefrCode) {
        this.tefrCode = tefrCode;
        return this;
    }

    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("rcrvInd")
    public String getRcrvInd() {
        return rcrvInd;
    }

    /**
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("rcrvInd")
    public void setRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
    }

    public TestScoreInformation010PutRequest withRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TestScoreInformation010PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("criteria.teacCode")
    public String getCriteriaTeacCode() {
        return criteriaTeacCode;
    }

    /**
     * Accommodation
     * <p>
     * Lineage reference object : SORTEST_TEAC_CODE, Lookup lineage reference object : stvteac
     * 
     */
    @JsonProperty("criteria.teacCode")
    public void setCriteriaTeacCode(String criteriaTeacCode) {
        this.criteriaTeacCode = criteriaTeacCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTeacCode(String criteriaTeacCode) {
        this.criteriaTeacCode = criteriaTeacCode;
        return this;
    }

    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("teinCode")
    public String getTeinCode() {
        return teinCode;
    }

    /**
     * Instrument
     * <p>
     * Lineage reference object : SORTEST_TEIN_CODE, Lookup lineage reference object : stvtein
     * 
     */
    @JsonProperty("teinCode")
    public void setTeinCode(String teinCode) {
        this.teinCode = teinCode;
    }

    public TestScoreInformation010PutRequest withTeinCode(String teinCode) {
        this.teinCode = teinCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public TestScoreInformation010PutRequest withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("teprCode")
    public String getTeprCode() {
        return teprCode;
    }

    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("teprCode")
    public void setTeprCode(String teprCode) {
        this.teprCode = teprCode;
    }

    public TestScoreInformation010PutRequest withTeprCode(String teprCode) {
        this.teprCode = teprCode;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public Double getApplNo() {
        return applNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public TestScoreInformation010PutRequest withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    public String getCriteriaReleaseInd() {
        return criteriaReleaseInd;
    }

    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    public void setCriteriaReleaseInd(String criteriaReleaseInd) {
        this.criteriaReleaseInd = criteriaReleaseInd;
    }

    public TestScoreInformation010PutRequest withCriteriaReleaseInd(String criteriaReleaseInd) {
        this.criteriaReleaseInd = criteriaReleaseInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public String getTsrcCode() {
        return tsrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public void setTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
    }

    public TestScoreInformation010PutRequest withTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
        return this;
    }

    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("criteria.teprCode")
    public String getCriteriaTeprCode() {
        return criteriaTeprCode;
    }

    /**
     * Purpose
     * <p>
     * Lineage reference object : SORTEST_TEPR_CODE, Lookup lineage reference object : stvtepr
     * 
     */
    @JsonProperty("criteria.teprCode")
    public void setCriteriaTeprCode(String criteriaTeprCode) {
        this.criteriaTeprCode = criteriaTeprCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTeprCode(String criteriaTeprCode) {
        this.criteriaTeprCode = criteriaTeprCode;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tescCode")
    public String getCriteriaTescCode() {
        return criteriaTescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tescCode")
    public void setCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
    }

    public TestScoreInformation010PutRequest withCriteriaTescCode(String criteriaTescCode) {
        this.criteriaTescCode = criteriaTescCode;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SORTEST_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public TestScoreInformation010PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("satEssayId")
    public String getSatEssayId() {
        return satEssayId;
    }

    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("satEssayId")
    public void setSatEssayId(String satEssayId) {
        this.satEssayId = satEssayId;
    }

    public TestScoreInformation010PutRequest withSatEssayId(String satEssayId) {
        this.satEssayId = satEssayId;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    public TestScoreInformation010PutRequest withPercentile(String percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("criteria.testDate")
    public Date getCriteriaTestDate() {
        return criteriaTestDate;
    }

    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("criteria.testDate")
    public void setCriteriaTestDate(Date criteriaTestDate) {
        this.criteriaTestDate = criteriaTestDate;
    }

    public TestScoreInformation010PutRequest withCriteriaTestDate(Date criteriaTestDate) {
        this.criteriaTestDate = criteriaTestDate;
        return this;
    }

    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("criteria.satEssayId")
    public String getCriteriaSatEssayId() {
        return criteriaSatEssayId;
    }

    /**
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("criteria.satEssayId")
    public void setCriteriaSatEssayId(String criteriaSatEssayId) {
        this.criteriaSatEssayId = criteriaSatEssayId;
    }

    public TestScoreInformation010PutRequest withCriteriaSatEssayId(String criteriaSatEssayId) {
        this.criteriaSatEssayId = criteriaSatEssayId;
        return this;
    }

    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dispTestDate")
    public Date getDispTestDate() {
        return dispTestDate;
    }

    /**
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dispTestDate")
    public void setDispTestDate(Date dispTestDate) {
        this.dispTestDate = dispTestDate;
    }

    public TestScoreInformation010PutRequest withDispTestDate(Date dispTestDate) {
        this.dispTestDate = dispTestDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    public String getCriteriaTermCodeEntry() {
        return criteriaTermCodeEntry;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SORTEST_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    public void setCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
    }

    public TestScoreInformation010PutRequest withCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
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

    public TestScoreInformation010PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreInformation010PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaEquivInd");
        sb.append('=');
        sb.append(((this.criteriaEquivInd == null)?"<null>":this.criteriaEquivInd));
        sb.append(',');
        sb.append("criteriaTsrcCode");
        sb.append('=');
        sb.append(((this.criteriaTsrcCode == null)?"<null>":this.criteriaTsrcCode));
        sb.append(',');
        sb.append("criteriaRcrvInd");
        sb.append('=');
        sb.append(((this.criteriaRcrvInd == null)?"<null>":this.criteriaRcrvInd));
        sb.append(',');
        sb.append("criteriaTeinCode");
        sb.append('=');
        sb.append(((this.criteriaTeinCode == null)?"<null>":this.criteriaTeinCode));
        sb.append(',');
        sb.append("criteriaTestScore");
        sb.append('=');
        sb.append(((this.criteriaTestScore == null)?"<null>":this.criteriaTestScore));
        sb.append(',');
        sb.append("tsptCode");
        sb.append('=');
        sb.append(((this.tsptCode == null)?"<null>":this.tsptCode));
        sb.append(',');
        sb.append("criteriaTefrCode");
        sb.append('=');
        sb.append(((this.criteriaTefrCode == null)?"<null>":this.criteriaTefrCode));
        sb.append(',');
        sb.append("instrId");
        sb.append('=');
        sb.append(((this.instrId == null)?"<null>":this.instrId));
        sb.append(',');
        sb.append("tadmCode");
        sb.append('=');
        sb.append(((this.tadmCode == null)?"<null>":this.tadmCode));
        sb.append(',');
        sb.append("releaseInd");
        sb.append('=');
        sb.append(((this.releaseInd == null)?"<null>":this.releaseInd));
        sb.append(',');
        sb.append("criteriaDispTestDate");
        sb.append('=');
        sb.append(((this.criteriaDispTestDate == null)?"<null>":this.criteriaDispTestDate));
        sb.append(',');
        sb.append("criteriaApplNo");
        sb.append('=');
        sb.append(((this.criteriaApplNo == null)?"<null>":this.criteriaApplNo));
        sb.append(',');
        sb.append("criteriaPercentile");
        sb.append('=');
        sb.append(((this.criteriaPercentile == null)?"<null>":this.criteriaPercentile));
        sb.append(',');
        sb.append("criteriaTsptCode");
        sb.append('=');
        sb.append(((this.criteriaTsptCode == null)?"<null>":this.criteriaTsptCode));
        sb.append(',');
        sb.append("criteriaInstrId");
        sb.append('=');
        sb.append(((this.criteriaInstrId == null)?"<null>":this.criteriaInstrId));
        sb.append(',');
        sb.append("criteriaQueryTestDate");
        sb.append('=');
        sb.append(((this.criteriaQueryTestDate == null)?"<null>":this.criteriaQueryTestDate));
        sb.append(',');
        sb.append("criteriaPercentileDate");
        sb.append('=');
        sb.append(((this.criteriaPercentileDate == null)?"<null>":this.criteriaPercentileDate));
        sb.append(',');
        sb.append("percentileDate");
        sb.append('=');
        sb.append(((this.percentileDate == null)?"<null>":this.percentileDate));
        sb.append(',');
        sb.append("criteriaTadmCode");
        sb.append('=');
        sb.append(((this.criteriaTadmCode == null)?"<null>":this.criteriaTadmCode));
        sb.append(',');
        sb.append("equivInd");
        sb.append('=');
        sb.append(((this.equivInd == null)?"<null>":this.equivInd));
        sb.append(',');
        sb.append("teacCode");
        sb.append('=');
        sb.append(((this.teacCode == null)?"<null>":this.teacCode));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("tefrCode");
        sb.append('=');
        sb.append(((this.tefrCode == null)?"<null>":this.tefrCode));
        sb.append(',');
        sb.append("rcrvInd");
        sb.append('=');
        sb.append(((this.rcrvInd == null)?"<null>":this.rcrvInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaTeacCode");
        sb.append('=');
        sb.append(((this.criteriaTeacCode == null)?"<null>":this.criteriaTeacCode));
        sb.append(',');
        sb.append("teinCode");
        sb.append('=');
        sb.append(((this.teinCode == null)?"<null>":this.teinCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("teprCode");
        sb.append('=');
        sb.append(((this.teprCode == null)?"<null>":this.teprCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("criteriaReleaseInd");
        sb.append('=');
        sb.append(((this.criteriaReleaseInd == null)?"<null>":this.criteriaReleaseInd));
        sb.append(',');
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
        sb.append(',');
        sb.append("criteriaTeprCode");
        sb.append('=');
        sb.append(((this.criteriaTeprCode == null)?"<null>":this.criteriaTeprCode));
        sb.append(',');
        sb.append("criteriaTescCode");
        sb.append('=');
        sb.append(((this.criteriaTescCode == null)?"<null>":this.criteriaTescCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("satEssayId");
        sb.append('=');
        sb.append(((this.satEssayId == null)?"<null>":this.satEssayId));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("criteriaTestDate");
        sb.append('=');
        sb.append(((this.criteriaTestDate == null)?"<null>":this.criteriaTestDate));
        sb.append(',');
        sb.append("criteriaSatEssayId");
        sb.append('=');
        sb.append(((this.criteriaSatEssayId == null)?"<null>":this.criteriaSatEssayId));
        sb.append(',');
        sb.append("dispTestDate");
        sb.append('=');
        sb.append(((this.dispTestDate == null)?"<null>":this.dispTestDate));
        sb.append(',');
        sb.append("criteriaTermCodeEntry");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntry == null)?"<null>":this.criteriaTermCodeEntry));
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
        result = ((result* 31)+((this.tsptCode == null)? 0 :this.tsptCode.hashCode()));
        result = ((result* 31)+((this.criteriaReleaseInd == null)? 0 :this.criteriaReleaseInd.hashCode()));
        result = ((result* 31)+((this.instrId == null)? 0 :this.instrId.hashCode()));
        result = ((result* 31)+((this.tadmCode == null)? 0 :this.tadmCode.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.criteriaTadmCode == null)? 0 :this.criteriaTadmCode.hashCode()));
        result = ((result* 31)+((this.percentileDate == null)? 0 :this.percentileDate.hashCode()));
        result = ((result* 31)+((this.criteriaTeprCode == null)? 0 :this.criteriaTeprCode.hashCode()));
        result = ((result* 31)+((this.criteriaRcrvInd == null)? 0 :this.criteriaRcrvInd.hashCode()));
        result = ((result* 31)+((this.criteriaTefrCode == null)? 0 :this.criteriaTefrCode.hashCode()));
        result = ((result* 31)+((this.equivInd == null)? 0 :this.equivInd.hashCode()));
        result = ((result* 31)+((this.teacCode == null)? 0 :this.teacCode.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.tefrCode == null)? 0 :this.tefrCode.hashCode()));
        result = ((result* 31)+((this.rcrvInd == null)? 0 :this.rcrvInd.hashCode()));
        result = ((result* 31)+((this.criteriaInstrId == null)? 0 :this.criteriaInstrId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.teinCode == null)? 0 :this.teinCode.hashCode()));
        result = ((result* 31)+((this.criteriaTeacCode == null)? 0 :this.criteriaTeacCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.criteriaTeinCode == null)? 0 :this.criteriaTeinCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntry == null)? 0 :this.criteriaTermCodeEntry.hashCode()));
        result = ((result* 31)+((this.teprCode == null)? 0 :this.teprCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.criteriaTsrcCode == null)? 0 :this.criteriaTsrcCode.hashCode()));
        result = ((result* 31)+((this.criteriaDispTestDate == null)? 0 :this.criteriaDispTestDate.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.criteriaEquivInd == null)? 0 :this.criteriaEquivInd.hashCode()));
        result = ((result* 31)+((this.criteriaTsptCode == null)? 0 :this.criteriaTsptCode.hashCode()));
        result = ((result* 31)+((this.criteriaSatEssayId == null)? 0 :this.criteriaSatEssayId.hashCode()));
        result = ((result* 31)+((this.criteriaPercentile == null)? 0 :this.criteriaPercentile.hashCode()));
        result = ((result* 31)+((this.criteriaQueryTestDate == null)? 0 :this.criteriaQueryTestDate.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.satEssayId == null)? 0 :this.satEssayId.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.criteriaTescCode == null)? 0 :this.criteriaTescCode.hashCode()));
        result = ((result* 31)+((this.criteriaTestDate == null)? 0 :this.criteriaTestDate.hashCode()));
        result = ((result* 31)+((this.dispTestDate == null)? 0 :this.dispTestDate.hashCode()));
        result = ((result* 31)+((this.criteriaApplNo == null)? 0 :this.criteriaApplNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTestScore == null)? 0 :this.criteriaTestScore.hashCode()));
        result = ((result* 31)+((this.criteriaPercentileDate == null)? 0 :this.criteriaPercentileDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreInformation010PutRequest) == false) {
            return false;
        }
        TestScoreInformation010PutRequest rhs = ((TestScoreInformation010PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.tsptCode == rhs.tsptCode)||((this.tsptCode!= null)&&this.tsptCode.equals(rhs.tsptCode)))&&((this.criteriaReleaseInd == rhs.criteriaReleaseInd)||((this.criteriaReleaseInd!= null)&&this.criteriaReleaseInd.equals(rhs.criteriaReleaseInd))))&&((this.instrId == rhs.instrId)||((this.instrId!= null)&&this.instrId.equals(rhs.instrId))))&&((this.tadmCode == rhs.tadmCode)||((this.tadmCode!= null)&&this.tadmCode.equals(rhs.tadmCode))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.criteriaTadmCode == rhs.criteriaTadmCode)||((this.criteriaTadmCode!= null)&&this.criteriaTadmCode.equals(rhs.criteriaTadmCode))))&&((this.percentileDate == rhs.percentileDate)||((this.percentileDate!= null)&&this.percentileDate.equals(rhs.percentileDate))))&&((this.criteriaTeprCode == rhs.criteriaTeprCode)||((this.criteriaTeprCode!= null)&&this.criteriaTeprCode.equals(rhs.criteriaTeprCode))))&&((this.criteriaRcrvInd == rhs.criteriaRcrvInd)||((this.criteriaRcrvInd!= null)&&this.criteriaRcrvInd.equals(rhs.criteriaRcrvInd))))&&((this.criteriaTefrCode == rhs.criteriaTefrCode)||((this.criteriaTefrCode!= null)&&this.criteriaTefrCode.equals(rhs.criteriaTefrCode))))&&((this.equivInd == rhs.equivInd)||((this.equivInd!= null)&&this.equivInd.equals(rhs.equivInd))))&&((this.teacCode == rhs.teacCode)||((this.teacCode!= null)&&this.teacCode.equals(rhs.teacCode))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.tefrCode == rhs.tefrCode)||((this.tefrCode!= null)&&this.tefrCode.equals(rhs.tefrCode))))&&((this.rcrvInd == rhs.rcrvInd)||((this.rcrvInd!= null)&&this.rcrvInd.equals(rhs.rcrvInd))))&&((this.criteriaInstrId == rhs.criteriaInstrId)||((this.criteriaInstrId!= null)&&this.criteriaInstrId.equals(rhs.criteriaInstrId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.teinCode == rhs.teinCode)||((this.teinCode!= null)&&this.teinCode.equals(rhs.teinCode))))&&((this.criteriaTeacCode == rhs.criteriaTeacCode)||((this.criteriaTeacCode!= null)&&this.criteriaTeacCode.equals(rhs.criteriaTeacCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.criteriaTeinCode == rhs.criteriaTeinCode)||((this.criteriaTeinCode!= null)&&this.criteriaTeinCode.equals(rhs.criteriaTeinCode))))&&((this.criteriaTermCodeEntry == rhs.criteriaTermCodeEntry)||((this.criteriaTermCodeEntry!= null)&&this.criteriaTermCodeEntry.equals(rhs.criteriaTermCodeEntry))))&&((this.teprCode == rhs.teprCode)||((this.teprCode!= null)&&this.teprCode.equals(rhs.teprCode))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.criteriaTsrcCode == rhs.criteriaTsrcCode)||((this.criteriaTsrcCode!= null)&&this.criteriaTsrcCode.equals(rhs.criteriaTsrcCode))))&&((this.criteriaDispTestDate == rhs.criteriaDispTestDate)||((this.criteriaDispTestDate!= null)&&this.criteriaDispTestDate.equals(rhs.criteriaDispTestDate))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.criteriaEquivInd == rhs.criteriaEquivInd)||((this.criteriaEquivInd!= null)&&this.criteriaEquivInd.equals(rhs.criteriaEquivInd))))&&((this.criteriaTsptCode == rhs.criteriaTsptCode)||((this.criteriaTsptCode!= null)&&this.criteriaTsptCode.equals(rhs.criteriaTsptCode))))&&((this.criteriaSatEssayId == rhs.criteriaSatEssayId)||((this.criteriaSatEssayId!= null)&&this.criteriaSatEssayId.equals(rhs.criteriaSatEssayId))))&&((this.criteriaPercentile == rhs.criteriaPercentile)||((this.criteriaPercentile!= null)&&this.criteriaPercentile.equals(rhs.criteriaPercentile))))&&((this.criteriaQueryTestDate == rhs.criteriaQueryTestDate)||((this.criteriaQueryTestDate!= null)&&this.criteriaQueryTestDate.equals(rhs.criteriaQueryTestDate))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.satEssayId == rhs.satEssayId)||((this.satEssayId!= null)&&this.satEssayId.equals(rhs.satEssayId))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.criteriaTescCode == rhs.criteriaTescCode)||((this.criteriaTescCode!= null)&&this.criteriaTescCode.equals(rhs.criteriaTescCode))))&&((this.criteriaTestDate == rhs.criteriaTestDate)||((this.criteriaTestDate!= null)&&this.criteriaTestDate.equals(rhs.criteriaTestDate))))&&((this.dispTestDate == rhs.dispTestDate)||((this.dispTestDate!= null)&&this.dispTestDate.equals(rhs.dispTestDate))))&&((this.criteriaApplNo == rhs.criteriaApplNo)||((this.criteriaApplNo!= null)&&this.criteriaApplNo.equals(rhs.criteriaApplNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTestScore == rhs.criteriaTestScore)||((this.criteriaTestScore!= null)&&this.criteriaTestScore.equals(rhs.criteriaTestScore))))&&((this.criteriaPercentileDate == rhs.criteriaPercentileDate)||((this.criteriaPercentileDate!= null)&&this.criteriaPercentileDate.equals(rhs.criteriaPercentileDate))));
    }

}
