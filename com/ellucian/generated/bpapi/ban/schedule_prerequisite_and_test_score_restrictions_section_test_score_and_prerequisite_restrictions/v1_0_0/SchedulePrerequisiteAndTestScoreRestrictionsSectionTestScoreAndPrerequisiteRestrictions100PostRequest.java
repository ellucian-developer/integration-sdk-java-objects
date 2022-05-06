
package com.ellucian.generated.bpapi.ban.schedule_prerequisite_and_test_score_restrictions_section_test_score_and_prerequisite_restrictions.v1_0_0;

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
    "crseNumbPreq",
    "ssasectTermCode",
    "ssasectCrn",
    "subjCodePreq",
    "testScore",
    "rparen",
    "minGrde",
    "concurrencyInd",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest {

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
     * Course Number
     * <p>
     * Lineage reference object : SSRRTST_CRSE_NUMB_PREQ
     * 
     */
    @JsonProperty("crseNumbPreq")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CRSE_NUMB_PREQ")
    private String crseNumbPreq;
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
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object ssasectCrn;
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
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_TEST_SCORE")
    private String testScore;
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
     * Concurrency
     * <p>
     * Lineage reference object : SSRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SSRRTST_CONCURRENCY_IND")
    private String concurrencyInd;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withTescCode(String tescCode) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withArea(String area) {
        this.area = area;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
        return this;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Test Score
     * <p>
     * Lineage reference object : SSRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withTestScore(String testScore) {
        this.testScore = testScore;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withRparen(String rparen) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withMinGrde(String minGrde) {
        this.minGrde = minGrde;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withLparen(String lparen) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withLevlCode(String levlCode) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("subjCodePreq");
        sb.append('=');
        sb.append(((this.subjCodePreq == null)?"<null>":this.subjCodePreq));
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
        sb.append("concurrencyInd");
        sb.append('=');
        sb.append(((this.concurrencyInd == null)?"<null>":this.concurrencyInd));
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
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.concurrencyInd == null)? 0 :this.concurrencyInd.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
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
        if ((other instanceof SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest) == false) {
            return false;
        }
        SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest rhs = ((SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostRequest) other);
        return ((((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.concurrencyInd == rhs.concurrencyInd)||((this.concurrencyInd!= null)&&this.concurrencyInd.equals(rhs.concurrencyInd))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
