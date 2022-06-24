
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
    "tescCode",
    "teprCode",
    "tsptCode",
    "applNo",
    "instrId",
    "tadmCode",
    "releaseInd",
    "tsrcCode",
    "admrCode",
    "percentileDate",
    "satEssayId",
    "percentile",
    "equivInd",
    "teacCode",
    "testScore",
    "tefrCode",
    "rcrvInd",
    "dispTestDate",
    "id",
    "teinCode",
    "termCodeEntry"
})
@Generated("jsonschema2pojo")
public class TestScoreInformation010PostRequest {

    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
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
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt")
    private String tsptCode;
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
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc")
    private String tsrcCode;
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
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE_DATE")
    private Date percentileDate;
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
     * Test Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dispTestDate")
    private Date dispTestDate;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * (Required)
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public TestScoreInformation010PostRequest withTescCode(String tescCode) {
        this.tescCode = tescCode;
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

    public TestScoreInformation010PostRequest withTeprCode(String teprCode) {
        this.teprCode = teprCode;
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

    public TestScoreInformation010PostRequest withTsptCode(String tsptCode) {
        this.tsptCode = tsptCode;
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

    public TestScoreInformation010PostRequest withApplNo(Double applNo) {
        this.applNo = applNo;
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

    public TestScoreInformation010PostRequest withInstrId(String instrId) {
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

    public TestScoreInformation010PostRequest withTadmCode(String tadmCode) {
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

    public TestScoreInformation010PostRequest withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
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

    public TestScoreInformation010PostRequest withTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
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

    public TestScoreInformation010PostRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public TestScoreInformation010PostRequest withPercentileDate(Date percentileDate) {
        this.percentileDate = percentileDate;
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

    public TestScoreInformation010PostRequest withSatEssayId(String satEssayId) {
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

    public TestScoreInformation010PostRequest withPercentile(String percentile) {
        this.percentile = percentile;
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

    public TestScoreInformation010PostRequest withEquivInd(String equivInd) {
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

    public TestScoreInformation010PostRequest withTeacCode(String teacCode) {
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

    public TestScoreInformation010PostRequest withTestScore(String testScore) {
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

    public TestScoreInformation010PostRequest withTefrCode(String tefrCode) {
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

    public TestScoreInformation010PostRequest withRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
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

    public TestScoreInformation010PostRequest withDispTestDate(Date dispTestDate) {
        this.dispTestDate = dispTestDate;
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

    public TestScoreInformation010PostRequest withId(String id) {
        this.id = id;
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

    public TestScoreInformation010PostRequest withTeinCode(String teinCode) {
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

    public TestScoreInformation010PostRequest withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
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

    public TestScoreInformation010PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreInformation010PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("teprCode");
        sb.append('=');
        sb.append(((this.teprCode == null)?"<null>":this.teprCode));
        sb.append(',');
        sb.append("tsptCode");
        sb.append('=');
        sb.append(((this.tsptCode == null)?"<null>":this.tsptCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
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
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("percentileDate");
        sb.append('=');
        sb.append(((this.percentileDate == null)?"<null>":this.percentileDate));
        sb.append(',');
        sb.append("satEssayId");
        sb.append('=');
        sb.append(((this.satEssayId == null)?"<null>":this.satEssayId));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
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
        sb.append("dispTestDate");
        sb.append('=');
        sb.append(((this.dispTestDate == null)?"<null>":this.dispTestDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("teinCode");
        sb.append('=');
        sb.append(((this.teinCode == null)?"<null>":this.teinCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
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
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.teprCode == null)? 0 :this.teprCode.hashCode()));
        result = ((result* 31)+((this.tsptCode == null)? 0 :this.tsptCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.instrId == null)? 0 :this.instrId.hashCode()));
        result = ((result* 31)+((this.tadmCode == null)? 0 :this.tadmCode.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.percentileDate == null)? 0 :this.percentileDate.hashCode()));
        result = ((result* 31)+((this.satEssayId == null)? 0 :this.satEssayId.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.equivInd == null)? 0 :this.equivInd.hashCode()));
        result = ((result* 31)+((this.teacCode == null)? 0 :this.teacCode.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.tefrCode == null)? 0 :this.tefrCode.hashCode()));
        result = ((result* 31)+((this.rcrvInd == null)? 0 :this.rcrvInd.hashCode()));
        result = ((result* 31)+((this.dispTestDate == null)? 0 :this.dispTestDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.teinCode == null)? 0 :this.teinCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreInformation010PostRequest) == false) {
            return false;
        }
        TestScoreInformation010PostRequest rhs = ((TestScoreInformation010PostRequest) other);
        return (((((((((((((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.teprCode == rhs.teprCode)||((this.teprCode!= null)&&this.teprCode.equals(rhs.teprCode))))&&((this.tsptCode == rhs.tsptCode)||((this.tsptCode!= null)&&this.tsptCode.equals(rhs.tsptCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.instrId == rhs.instrId)||((this.instrId!= null)&&this.instrId.equals(rhs.instrId))))&&((this.tadmCode == rhs.tadmCode)||((this.tadmCode!= null)&&this.tadmCode.equals(rhs.tadmCode))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.percentileDate == rhs.percentileDate)||((this.percentileDate!= null)&&this.percentileDate.equals(rhs.percentileDate))))&&((this.satEssayId == rhs.satEssayId)||((this.satEssayId!= null)&&this.satEssayId.equals(rhs.satEssayId))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.equivInd == rhs.equivInd)||((this.equivInd!= null)&&this.equivInd.equals(rhs.equivInd))))&&((this.teacCode == rhs.teacCode)||((this.teacCode!= null)&&this.teacCode.equals(rhs.teacCode))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.tefrCode == rhs.tefrCode)||((this.tefrCode!= null)&&this.tefrCode.equals(rhs.tefrCode))))&&((this.rcrvInd == rhs.rcrvInd)||((this.rcrvInd!= null)&&this.rcrvInd.equals(rhs.rcrvInd))))&&((this.dispTestDate == rhs.dispTestDate)||((this.dispTestDate!= null)&&this.dispTestDate.equals(rhs.dispTestDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.teinCode == rhs.teinCode)||((this.teinCode!= null)&&this.teinCode.equals(rhs.teinCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))));
    }

}
