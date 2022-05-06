
package com.ellucian.generated.bpapi.ban.contract_authorization_test_scores_and_course_requirements.v1_0_0;

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
    "crseNumb",
    "connector",
    "subjCode",
    "rparen",
    "testScore",
    "lparen",
    "crn",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationTestScoresAndCourseRequirements100GetResponse {

    /**
     * Test Code
     * <p>
     * Lineage reference object : TBRCREQ_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
    /**
     * Course
     * <p>
     * Lineage reference object : TBRCREQ_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_CRSE_NUMB")
    private String crseNumb;
    /**
     * And/Or
     * <p>
     * Lineage reference object : TBRCREQ_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_CONNECTOR")
    private String connector;
    /**
     * Subject
     * <p>
     * Lineage reference object : TBRCREQ_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * ')'
     * <p>
     * Lineage reference object : TBRCREQ_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_RPAREN")
    private String rparen;
    /**
     * Score
     * <p>
     * Lineage reference object : TBRCREQ_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_TEST_SCORE")
    private String testScore;
    /**
     * '('
     * <p>
     * Lineage reference object : TBRCREQ_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_LPAREN")
    private String lparen;
    /**
     * CRN
     * <p>
     * Lineage reference object : TBRCREQ_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_CRN")
    private String crn;
    /**
     * Level
     * <p>
     * Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Test Code
     * <p>
     * Lineage reference object : TBRCREQ_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : TBRCREQ_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : TBRCREQ_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : TBRCREQ_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : TBRCREQ_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public String getConnector() {
        return connector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : TBRCREQ_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public void setConnector(String connector) {
        this.connector = connector;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withConnector(String connector) {
        this.connector = connector;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : TBRCREQ_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : TBRCREQ_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : TBRCREQ_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public String getRparen() {
        return rparen;
    }

    /**
     * ')'
     * <p>
     * Lineage reference object : TBRCREQ_RPAREN
     * 
     */
    @JsonProperty("rparen")
    public void setRparen(String rparen) {
        this.rparen = rparen;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withRparen(String rparen) {
        this.rparen = rparen;
        return this;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : TBRCREQ_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : TBRCREQ_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : TBRCREQ_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public String getLparen() {
        return lparen;
    }

    /**
     * '('
     * <p>
     * Lineage reference object : TBRCREQ_LPAREN
     * 
     */
    @JsonProperty("lparen")
    public void setLparen(String lparen) {
        this.lparen = lparen;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withLparen(String lparen) {
        this.lparen = lparen;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRCREQ_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : TBRCREQ_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withLevlCode(String levlCode) {
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

    public ContractAuthorizationTestScoresAndCourseRequirements100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationTestScoresAndCourseRequirements100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("rparen");
        sb.append('=');
        sb.append(((this.rparen == null)?"<null>":this.rparen));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("lparen");
        sb.append('=');
        sb.append(((this.lparen == null)?"<null>":this.lparen));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lparen == null)? 0 :this.lparen.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationTestScoresAndCourseRequirements100GetResponse) == false) {
            return false;
        }
        ContractAuthorizationTestScoresAndCourseRequirements100GetResponse rhs = ((ContractAuthorizationTestScoresAndCourseRequirements100GetResponse) other);
        return (((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
