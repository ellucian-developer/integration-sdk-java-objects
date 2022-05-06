
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
    "concurrencyCde",
    "crseNumbPreq",
    "connector",
    "inProgram",
    "subjCodePreq",
    "rparen",
    "testScore",
    "minGrde",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class Scrprt__1 {

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
     * Concurrency
     * <p>
     * Lineage reference object : SCRPRTS_CONCURRENCY_CDE
     * 
     */
    @JsonProperty("concurrencyCde")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_CONCURRENCY_CDE")
    private String concurrencyCde;
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
     * And/Or
     * <p>
     * Lineage reference object : SCRPRTS_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_CONNECTOR")
    private String connector;
    @JsonProperty("inProgram")
    private String inProgram;
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
     * )
     * <p>
     * Lineage reference object : SCRPRTS_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_RPAREN")
    private String rparen;
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
     * Grade
     * <p>
     * Lineage reference object : SCRPRTS_MIN_GRDE
     * 
     */
    @JsonProperty("minGrde")
    @JsonPropertyDescription("Lineage reference object : SCRPRTS_MIN_GRDE")
    private String minGrde;
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

    public Scrprt__1 withTescCode(String tescCode) {
        this.tescCode = tescCode;
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

    public Scrprt__1 withConcurrencyCde(String concurrencyCde) {
        this.concurrencyCde = concurrencyCde;
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

    public Scrprt__1 withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
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

    public Scrprt__1 withConnector(String connector) {
        this.connector = connector;
        return this;
    }

    @JsonProperty("inProgram")
    public String getInProgram() {
        return inProgram;
    }

    @JsonProperty("inProgram")
    public void setInProgram(String inProgram) {
        this.inProgram = inProgram;
    }

    public Scrprt__1 withInProgram(String inProgram) {
        this.inProgram = inProgram;
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

    public Scrprt__1 withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
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

    public Scrprt__1 withRparen(String rparen) {
        this.rparen = rparen;
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

    public Scrprt__1 withTestScore(String testScore) {
        this.testScore = testScore;
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

    public Scrprt__1 withMinGrde(String minGrde) {
        this.minGrde = minGrde;
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

    public Scrprt__1 withLparen(String lparen) {
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

    public Scrprt__1 withLevlCode(String levlCode) {
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

    public Scrprt__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrprt__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("concurrencyCde");
        sb.append('=');
        sb.append(((this.concurrencyCde == null)?"<null>":this.concurrencyCde));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
        sb.append(',');
        sb.append("inProgram");
        sb.append('=');
        sb.append(((this.inProgram == null)?"<null>":this.inProgram));
        sb.append(',');
        sb.append("subjCodePreq");
        sb.append('=');
        sb.append(((this.subjCodePreq == null)?"<null>":this.subjCodePreq));
        sb.append(',');
        sb.append("rparen");
        sb.append('=');
        sb.append(((this.rparen == null)?"<null>":this.rparen));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
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
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.inProgram == null)? 0 :this.inProgram.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.concurrencyCde == null)? 0 :this.concurrencyCde.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
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
        if ((other instanceof Scrprt__1) == false) {
            return false;
        }
        Scrprt__1 rhs = ((Scrprt__1) other);
        return (((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.inProgram == rhs.inProgram)||((this.inProgram!= null)&&this.inProgram.equals(rhs.inProgram))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.concurrencyCde == rhs.concurrencyCde)||((this.concurrencyCde!= null)&&this.concurrencyCde.equals(rhs.concurrencyCde))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
