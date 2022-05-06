
package com.ellucian.generated.bpapi.ban.course_prerequisites.v1_0_0;

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
    "crseNumbPreq",
    "connector",
    "subjCodePreq",
    "rparen",
    "testScore",
    "endcopy",
    "minGrde",
    "concurrencyInd",
    "lparen",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class Scrrtst {

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
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
     * And/Or
     * <p>
     * Lineage reference object : SCRRTST_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONNECTOR")
    private String connector;
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
     * )
     * <p>
     * Lineage reference object : SCRRTST_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_RPAREN")
    private String rparen;
    /**
     * Prerequisite Test Score
     * <p>
     * Lineage reference object : SCRRTST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TEST_SCORE")
    private String testScore;
    @JsonProperty("endcopy")
    private String endcopy;
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
     * Concurrency
     * <p>
     * Lineage reference object : SCRRTST_CONCURRENCY_IND
     * 
     */
    @JsonProperty("concurrencyInd")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_CONCURRENCY_IND")
    private String concurrencyInd;
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
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public Scrrtst withTescCode(String tescCode) {
        this.tescCode = tescCode;
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

    public Scrrtst withCrseNumbPreq(String crseNumbPreq) {
        this.crseNumbPreq = crseNumbPreq;
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

    public Scrrtst withConnector(String connector) {
        this.connector = connector;
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

    public Scrrtst withSubjCodePreq(String subjCodePreq) {
        this.subjCodePreq = subjCodePreq;
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

    public Scrrtst withRparen(String rparen) {
        this.rparen = rparen;
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

    public Scrrtst withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public Scrrtst withEndcopy(String endcopy) {
        this.endcopy = endcopy;
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

    public Scrrtst withMinGrde(String minGrde) {
        this.minGrde = minGrde;
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

    public Scrrtst withConcurrencyInd(String concurrencyInd) {
        this.concurrencyInd = concurrencyInd;
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

    public Scrrtst withLparen(String lparen) {
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

    public Scrrtst withLevlCode(String levlCode) {
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

    public Scrrtst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrtst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("crseNumbPreq");
        sb.append('=');
        sb.append(((this.crseNumbPreq == null)?"<null>":this.crseNumbPreq));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
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
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
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
        result = ((result* 31)+((this.crseNumbPreq == null)? 0 :this.crseNumbPreq.hashCode()));
        result = ((result* 31)+((this.subjCodePreq == null)? 0 :this.subjCodePreq.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.concurrencyInd == null)? 0 :this.concurrencyInd.hashCode()));
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
        if ((other instanceof Scrrtst) == false) {
            return false;
        }
        Scrrtst rhs = ((Scrrtst) other);
        return (((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.crseNumbPreq == rhs.crseNumbPreq)||((this.crseNumbPreq!= null)&&this.crseNumbPreq.equals(rhs.crseNumbPreq))))&&((this.subjCodePreq == rhs.subjCodePreq)||((this.subjCodePreq!= null)&&this.subjCodePreq.equals(rhs.subjCodePreq))))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.concurrencyInd == rhs.concurrencyInd)||((this.concurrencyInd!= null)&&this.concurrencyInd.equals(rhs.concurrencyInd))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.minGrde == rhs.minGrde)||((this.minGrde!= null)&&this.minGrde.equals(rhs.minGrde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
