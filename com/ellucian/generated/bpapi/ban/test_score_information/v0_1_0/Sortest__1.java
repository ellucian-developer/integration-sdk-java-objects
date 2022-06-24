
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
    "stvtefrDesc",
    "stvtadmDesc",
    "asterisk",
    "stvtermDesc",
    "instrId",
    "stvtsrcDesc",
    "releaseInd",
    "tadmCode",
    "equivInd",
    "teacCode",
    "tefrCode",
    "testScore",
    "rcrvInd",
    "stvadmrDesc",
    "stvtescDesc",
    "teinCode",
    "termCodeEntry",
    "tescCode",
    "teprCode",
    "applNo",
    "stvteprDesc",
    "tsrcCode",
    "admrCode",
    "satEssayId",
    "dispTestDate",
    "stvteacDesc"
})
@Generated("jsonschema2pojo")
public class Sortest__1 {

    /**
     * Form Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtefrDesc")
    private String stvtefrDesc;
    @JsonProperty("stvtadmDesc")
    private String stvtadmDesc;
    @JsonProperty("asterisk")
    private String asterisk;
    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtermDesc")
    private String stvtermDesc;
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
     * Source Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsrcDesc")
    private String stvtsrcDesc;
    /**
     * Lineage reference object : SORTEST_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RELEASE_IND")
    private String releaseInd;
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
     * Form
     * <p>
     * Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr
     * 
     */
    @JsonProperty("tefrCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEFR_CODE, Lookup lineage reference object : stvtefr")
    private String tefrCode;
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
     * Revised or Recentered
     * <p>
     * Lineage reference object : SORTEST_RCRV_IND
     * 
     */
    @JsonProperty("rcrvInd")
    @JsonPropertyDescription("Lineage reference object : SORTEST_RCRV_IND")
    private String rcrvInd;
    /**
     * Admission Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    private String stvtescDesc;
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
     * Application Number
     * <p>
     * Lineage reference object : SORTEST_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SORTEST_APPL_NO")
    private Double applNo;
    @JsonProperty("stvteprDesc")
    private String stvteprDesc;
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
     * SAT Essay ID
     * <p>
     * Lineage reference object : SORTEST_SAT_ESSAY_ID
     * 
     */
    @JsonProperty("satEssayId")
    @JsonPropertyDescription("Lineage reference object : SORTEST_SAT_ESSAY_ID")
    private String satEssayId;
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
     * Accommodation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvteacDesc")
    private String stvteacDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Form Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtefrDesc")
    public String getStvtefrDesc() {
        return stvtefrDesc;
    }

    /**
     * Form Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtefrDesc")
    public void setStvtefrDesc(String stvtefrDesc) {
        this.stvtefrDesc = stvtefrDesc;
    }

    public Sortest__1 withStvtefrDesc(String stvtefrDesc) {
        this.stvtefrDesc = stvtefrDesc;
        return this;
    }

    @JsonProperty("stvtadmDesc")
    public String getStvtadmDesc() {
        return stvtadmDesc;
    }

    @JsonProperty("stvtadmDesc")
    public void setStvtadmDesc(String stvtadmDesc) {
        this.stvtadmDesc = stvtadmDesc;
    }

    public Sortest__1 withStvtadmDesc(String stvtadmDesc) {
        this.stvtadmDesc = stvtadmDesc;
        return this;
    }

    @JsonProperty("asterisk")
    public String getAsterisk() {
        return asterisk;
    }

    @JsonProperty("asterisk")
    public void setAsterisk(String asterisk) {
        this.asterisk = asterisk;
    }

    public Sortest__1 withAsterisk(String asterisk) {
        this.asterisk = asterisk;
        return this;
    }

    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtermDesc")
    public String getStvtermDesc() {
        return stvtermDesc;
    }

    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtermDesc")
    public void setStvtermDesc(String stvtermDesc) {
        this.stvtermDesc = stvtermDesc;
    }

    public Sortest__1 withStvtermDesc(String stvtermDesc) {
        this.stvtermDesc = stvtermDesc;
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

    public Sortest__1 withInstrId(String instrId) {
        this.instrId = instrId;
        return this;
    }

    /**
     * Source Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsrcDesc")
    public String getStvtsrcDesc() {
        return stvtsrcDesc;
    }

    /**
     * Source Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsrcDesc")
    public void setStvtsrcDesc(String stvtsrcDesc) {
        this.stvtsrcDesc = stvtsrcDesc;
    }

    public Sortest__1 withStvtsrcDesc(String stvtsrcDesc) {
        this.stvtsrcDesc = stvtsrcDesc;
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

    public Sortest__1 withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
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

    public Sortest__1 withTadmCode(String tadmCode) {
        this.tadmCode = tadmCode;
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

    public Sortest__1 withEquivInd(String equivInd) {
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

    public Sortest__1 withTeacCode(String teacCode) {
        this.teacCode = teacCode;
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

    public Sortest__1 withTefrCode(String tefrCode) {
        this.tefrCode = tefrCode;
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

    public Sortest__1 withTestScore(String testScore) {
        this.testScore = testScore;
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

    public Sortest__1 withRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
        return this;
    }

    /**
     * Admission Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public String getStvadmrDesc() {
        return stvadmrDesc;
    }

    /**
     * Admission Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public void setStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
    }

    public Sortest__1 withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    public String getStvtescDesc() {
        return stvtescDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    public void setStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
    }

    public Sortest__1 withStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
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

    public Sortest__1 withTeinCode(String teinCode) {
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

    public Sortest__1 withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

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

    public Sortest__1 withTescCode(String tescCode) {
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

    public Sortest__1 withTeprCode(String teprCode) {
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

    public Sortest__1 withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("stvteprDesc")
    public String getStvteprDesc() {
        return stvteprDesc;
    }

    @JsonProperty("stvteprDesc")
    public void setStvteprDesc(String stvteprDesc) {
        this.stvteprDesc = stvteprDesc;
    }

    public Sortest__1 withStvteprDesc(String stvteprDesc) {
        this.stvteprDesc = stvteprDesc;
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

    public Sortest__1 withTsrcCode(String tsrcCode) {
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

    public Sortest__1 withAdmrCode(String admrCode) {
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

    public Sortest__1 withSatEssayId(String satEssayId) {
        this.satEssayId = satEssayId;
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

    public Sortest__1 withDispTestDate(Date dispTestDate) {
        this.dispTestDate = dispTestDate;
        return this;
    }

    /**
     * Accommodation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvteacDesc")
    public String getStvteacDesc() {
        return stvteacDesc;
    }

    /**
     * Accommodation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvteacDesc")
    public void setStvteacDesc(String stvteacDesc) {
        this.stvteacDesc = stvteacDesc;
    }

    public Sortest__1 withStvteacDesc(String stvteacDesc) {
        this.stvteacDesc = stvteacDesc;
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

    public Sortest__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sortest__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvtefrDesc");
        sb.append('=');
        sb.append(((this.stvtefrDesc == null)?"<null>":this.stvtefrDesc));
        sb.append(',');
        sb.append("stvtadmDesc");
        sb.append('=');
        sb.append(((this.stvtadmDesc == null)?"<null>":this.stvtadmDesc));
        sb.append(',');
        sb.append("asterisk");
        sb.append('=');
        sb.append(((this.asterisk == null)?"<null>":this.asterisk));
        sb.append(',');
        sb.append("stvtermDesc");
        sb.append('=');
        sb.append(((this.stvtermDesc == null)?"<null>":this.stvtermDesc));
        sb.append(',');
        sb.append("instrId");
        sb.append('=');
        sb.append(((this.instrId == null)?"<null>":this.instrId));
        sb.append(',');
        sb.append("stvtsrcDesc");
        sb.append('=');
        sb.append(((this.stvtsrcDesc == null)?"<null>":this.stvtsrcDesc));
        sb.append(',');
        sb.append("releaseInd");
        sb.append('=');
        sb.append(((this.releaseInd == null)?"<null>":this.releaseInd));
        sb.append(',');
        sb.append("tadmCode");
        sb.append('=');
        sb.append(((this.tadmCode == null)?"<null>":this.tadmCode));
        sb.append(',');
        sb.append("equivInd");
        sb.append('=');
        sb.append(((this.equivInd == null)?"<null>":this.equivInd));
        sb.append(',');
        sb.append("teacCode");
        sb.append('=');
        sb.append(((this.teacCode == null)?"<null>":this.teacCode));
        sb.append(',');
        sb.append("tefrCode");
        sb.append('=');
        sb.append(((this.tefrCode == null)?"<null>":this.tefrCode));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("rcrvInd");
        sb.append('=');
        sb.append(((this.rcrvInd == null)?"<null>":this.rcrvInd));
        sb.append(',');
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
        sb.append(',');
        sb.append("stvtescDesc");
        sb.append('=');
        sb.append(((this.stvtescDesc == null)?"<null>":this.stvtescDesc));
        sb.append(',');
        sb.append("teinCode");
        sb.append('=');
        sb.append(((this.teinCode == null)?"<null>":this.teinCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("teprCode");
        sb.append('=');
        sb.append(((this.teprCode == null)?"<null>":this.teprCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("stvteprDesc");
        sb.append('=');
        sb.append(((this.stvteprDesc == null)?"<null>":this.stvteprDesc));
        sb.append(',');
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("satEssayId");
        sb.append('=');
        sb.append(((this.satEssayId == null)?"<null>":this.satEssayId));
        sb.append(',');
        sb.append("dispTestDate");
        sb.append('=');
        sb.append(((this.dispTestDate == null)?"<null>":this.dispTestDate));
        sb.append(',');
        sb.append("stvteacDesc");
        sb.append('=');
        sb.append(((this.stvteacDesc == null)?"<null>":this.stvteacDesc));
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
        result = ((result* 31)+((this.stvtefrDesc == null)? 0 :this.stvtefrDesc.hashCode()));
        result = ((result* 31)+((this.stvtadmDesc == null)? 0 :this.stvtadmDesc.hashCode()));
        result = ((result* 31)+((this.asterisk == null)? 0 :this.asterisk.hashCode()));
        result = ((result* 31)+((this.stvtermDesc == null)? 0 :this.stvtermDesc.hashCode()));
        result = ((result* 31)+((this.instrId == null)? 0 :this.instrId.hashCode()));
        result = ((result* 31)+((this.stvtsrcDesc == null)? 0 :this.stvtsrcDesc.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.tadmCode == null)? 0 :this.tadmCode.hashCode()));
        result = ((result* 31)+((this.equivInd == null)? 0 :this.equivInd.hashCode()));
        result = ((result* 31)+((this.teacCode == null)? 0 :this.teacCode.hashCode()));
        result = ((result* 31)+((this.tefrCode == null)? 0 :this.tefrCode.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.rcrvInd == null)? 0 :this.rcrvInd.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.stvtescDesc == null)? 0 :this.stvtescDesc.hashCode()));
        result = ((result* 31)+((this.teinCode == null)? 0 :this.teinCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.teprCode == null)? 0 :this.teprCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.stvteprDesc == null)? 0 :this.stvteprDesc.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.satEssayId == null)? 0 :this.satEssayId.hashCode()));
        result = ((result* 31)+((this.dispTestDate == null)? 0 :this.dispTestDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvteacDesc == null)? 0 :this.stvteacDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sortest__1) == false) {
            return false;
        }
        Sortest__1 rhs = ((Sortest__1) other);
        return ((((((((((((((((((((((((((((this.stvtefrDesc == rhs.stvtefrDesc)||((this.stvtefrDesc!= null)&&this.stvtefrDesc.equals(rhs.stvtefrDesc)))&&((this.stvtadmDesc == rhs.stvtadmDesc)||((this.stvtadmDesc!= null)&&this.stvtadmDesc.equals(rhs.stvtadmDesc))))&&((this.asterisk == rhs.asterisk)||((this.asterisk!= null)&&this.asterisk.equals(rhs.asterisk))))&&((this.stvtermDesc == rhs.stvtermDesc)||((this.stvtermDesc!= null)&&this.stvtermDesc.equals(rhs.stvtermDesc))))&&((this.instrId == rhs.instrId)||((this.instrId!= null)&&this.instrId.equals(rhs.instrId))))&&((this.stvtsrcDesc == rhs.stvtsrcDesc)||((this.stvtsrcDesc!= null)&&this.stvtsrcDesc.equals(rhs.stvtsrcDesc))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.tadmCode == rhs.tadmCode)||((this.tadmCode!= null)&&this.tadmCode.equals(rhs.tadmCode))))&&((this.equivInd == rhs.equivInd)||((this.equivInd!= null)&&this.equivInd.equals(rhs.equivInd))))&&((this.teacCode == rhs.teacCode)||((this.teacCode!= null)&&this.teacCode.equals(rhs.teacCode))))&&((this.tefrCode == rhs.tefrCode)||((this.tefrCode!= null)&&this.tefrCode.equals(rhs.tefrCode))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.rcrvInd == rhs.rcrvInd)||((this.rcrvInd!= null)&&this.rcrvInd.equals(rhs.rcrvInd))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.stvtescDesc == rhs.stvtescDesc)||((this.stvtescDesc!= null)&&this.stvtescDesc.equals(rhs.stvtescDesc))))&&((this.teinCode == rhs.teinCode)||((this.teinCode!= null)&&this.teinCode.equals(rhs.teinCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode))))&&((this.teprCode == rhs.teprCode)||((this.teprCode!= null)&&this.teprCode.equals(rhs.teprCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.stvteprDesc == rhs.stvteprDesc)||((this.stvteprDesc!= null)&&this.stvteprDesc.equals(rhs.stvteprDesc))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.satEssayId == rhs.satEssayId)||((this.satEssayId!= null)&&this.satEssayId.equals(rhs.satEssayId))))&&((this.dispTestDate == rhs.dispTestDate)||((this.dispTestDate!= null)&&this.dispTestDate.equals(rhs.dispTestDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvteacDesc == rhs.stvteacDesc)||((this.stvteacDesc!= null)&&this.stvteacDesc.equals(rhs.stvteacDesc))));
    }

}
