
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "crseNumb",
    "crseNumbPreq",
    "subjCode",
    "keyblckTermCode",
    "testScore",
    "rparen",
    "minGrde",
    "program",
    "lparen"
})
@Generated("jsonschema2pojo")
public class CatalogPrerequisiteAndTestScoreRestrictions100PostRequest {

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
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumb;
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
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCode;
    /**
     * Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
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
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : program")
    private String program;
    /**
     * (
     * <p>
     * Lineage reference object : SCRPRTS_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_LPAREN")
    private String lparen;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withTescCode(String tescCode) {
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withTestScore(String testScore) {
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withRparen(String rparen) {
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withMinGrde(String minGrde) {
        this.minGrde = minGrde;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withProgram(String program) {
        this.program = program;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withLparen(String lparen) {
        this.lparen = lparen;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogPrerequisiteAndTestScoreRestrictions100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
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
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("lparen");
        sb.append('=');
        sb.append(((this.lparen == null)?"<null>":this.lparen));
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
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.minGrde == null)? 0 :this.minGrde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lparen == null)? 0 :this.lparen.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogPrerequisiteAndTestScoreRestrictions100PostRequest) == false) {
            return false;
        }
        CatalogPrerequisiteAndTestScoreRestrictions100PostRequest rhs = ((CatalogPrerequisiteAndTestScoreRestrictions100PostRequest) other);
        return (((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))));
    }

}
