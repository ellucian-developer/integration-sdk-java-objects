
package com.ellucian.generated.bpapi.ban.curriculum_rules_base_curriculum_rules.v1_0_0;

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
    "secdRollInd",
    "termCodeInit",
    "currRecInd",
    "campCode",
    "studyPathInd",
    "degcCode",
    "lockInd",
    "program",
    "collCode",
    "currRule",
    "primRollInd",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesBaseCurriculumRules100PutResponse {

    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("secdRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_SECD_ROLL_IND")
    private String secdRollInd;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeInit")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm")
    private String termCodeInit;
    @JsonProperty("currRecInd")
    private String currRecInd;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_STUDY_PATH_IND")
    private String studyPathInd;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LOCK_IND")
    private String lockInd;
    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("currRule")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_CURR_RULE")
    private Double currRule;
    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("primRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PRIM_ROLL_IND")
    private String primRollInd;
    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("secdRollInd")
    public String getSecdRollInd() {
        return secdRollInd;
    }

    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("secdRollInd")
    public void setSecdRollInd(String secdRollInd) {
        this.secdRollInd = secdRollInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withSecdRollInd(String secdRollInd) {
        this.secdRollInd = secdRollInd;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeInit")
    public String getTermCodeInit() {
        return termCodeInit;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeInit")
    public void setTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
        return this;
    }

    @JsonProperty("currRecInd")
    public String getCurrRecInd() {
        return currRecInd;
    }

    @JsonProperty("currRecInd")
    public void setCurrRecInd(String currRecInd) {
        this.currRecInd = currRecInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withCurrRecInd(String currRecInd) {
        this.currRecInd = currRecInd;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    public String getStudyPathInd() {
        return studyPathInd;
    }

    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    public void setStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("currRule")
    public Double getCurrRule() {
        return currRule;
    }

    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("currRule")
    public void setCurrRule(Double currRule) {
        this.currRule = currRule;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withCurrRule(Double currRule) {
        this.currRule = currRule;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("primRollInd")
    public String getPrimRollInd() {
        return primRollInd;
    }

    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("primRollInd")
    public void setPrimRollInd(String primRollInd) {
        this.primRollInd = primRollInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withPrimRollInd(String primRollInd) {
        this.primRollInd = primRollInd;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutResponse withLevlCode(String levlCode) {
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

    public CurriculumRulesBaseCurriculumRules100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesBaseCurriculumRules100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("secdRollInd");
        sb.append('=');
        sb.append(((this.secdRollInd == null)?"<null>":this.secdRollInd));
        sb.append(',');
        sb.append("termCodeInit");
        sb.append('=');
        sb.append(((this.termCodeInit == null)?"<null>":this.termCodeInit));
        sb.append(',');
        sb.append("currRecInd");
        sb.append('=');
        sb.append(((this.currRecInd == null)?"<null>":this.currRecInd));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("studyPathInd");
        sb.append('=');
        sb.append(((this.studyPathInd == null)?"<null>":this.studyPathInd));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("currRule");
        sb.append('=');
        sb.append(((this.currRule == null)?"<null>":this.currRule));
        sb.append(',');
        sb.append("primRollInd");
        sb.append('=');
        sb.append(((this.primRollInd == null)?"<null>":this.primRollInd));
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
        result = ((result* 31)+((this.secdRollInd == null)? 0 :this.secdRollInd.hashCode()));
        result = ((result* 31)+((this.termCodeInit == null)? 0 :this.termCodeInit.hashCode()));
        result = ((result* 31)+((this.currRecInd == null)? 0 :this.currRecInd.hashCode()));
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.currRule == null)? 0 :this.currRule.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.primRollInd == null)? 0 :this.primRollInd.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesBaseCurriculumRules100PutResponse) == false) {
            return false;
        }
        CurriculumRulesBaseCurriculumRules100PutResponse rhs = ((CurriculumRulesBaseCurriculumRules100PutResponse) other);
        return ((((((((((((((this.secdRollInd == rhs.secdRollInd)||((this.secdRollInd!= null)&&this.secdRollInd.equals(rhs.secdRollInd)))&&((this.termCodeInit == rhs.termCodeInit)||((this.termCodeInit!= null)&&this.termCodeInit.equals(rhs.termCodeInit))))&&((this.currRecInd == rhs.currRecInd)||((this.currRecInd!= null)&&this.currRecInd.equals(rhs.currRecInd))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.currRule == rhs.currRule)||((this.currRule!= null)&&this.currRule.equals(rhs.currRule))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.primRollInd == rhs.primRollInd)||((this.primRollInd!= null)&&this.primRollInd.equals(rhs.primRollInd))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
