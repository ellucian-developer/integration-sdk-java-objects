
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
    "id",
    "contractNumber",
    "keyblocTermCode",
    "connector",
    "lparen",
    "tescCode",
    "testScore",
    "subjCode",
    "crseNumb",
    "levlCode",
    "crn",
    "rparen"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationTestScoresAndCourseRequirements100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
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
     * '('
     * <p>
     * Lineage reference object : TBRCREQ_LPAREN
     * 
     */
    @JsonProperty("lparen")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_LPAREN")
    private String lparen;
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
     * Score
     * <p>
     * Lineage reference object : TBRCREQ_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_TEST_SCORE")
    private String testScore;
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
     * Course
     * <p>
     * Lineage reference object : TBRCREQ_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_CRSE_NUMB")
    private String crseNumb;
    /**
     * Level
     * <p>
     * Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
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
     * ')'
     * <p>
     * Lineage reference object : TBRCREQ_RPAREN
     * 
     */
    @JsonProperty("rparen")
    @JsonPropertyDescription("Lineage reference object : TBRCREQ_RPAREN")
    private String rparen;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withConnector(String connector) {
        this.connector = connector;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withLparen(String lparen) {
        this.lparen = lparen;
        return this;
    }

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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withTescCode(String tescCode) {
        this.tescCode = tescCode;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withTestScore(String testScore) {
        this.testScore = testScore;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withCrn(String crn) {
        this.crn = crn;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withRparen(String rparen) {
        this.rparen = rparen;
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

    public ContractAuthorizationTestScoresAndCourseRequirements100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationTestScoresAndCourseRequirements100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
        sb.append(',');
        sb.append("lparen");
        sb.append('=');
        sb.append(((this.lparen == null)?"<null>":this.lparen));
        sb.append(',');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("rparen");
        sb.append('=');
        sb.append(((this.rparen == null)?"<null>":this.rparen));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.rparen == null)? 0 :this.rparen.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lparen == null)? 0 :this.lparen.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationTestScoresAndCourseRequirements100QapiPost) == false) {
            return false;
        }
        ContractAuthorizationTestScoresAndCourseRequirements100QapiPost rhs = ((ContractAuthorizationTestScoresAndCourseRequirements100QapiPost) other);
        return ((((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.rparen == rhs.rparen)||((this.rparen!= null)&&this.rparen.equals(rhs.rparen))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lparen == rhs.lparen)||((this.lparen!= null)&&this.lparen.equals(rhs.lparen))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
