
package com.ellucian.generated.bpapi.ban.curriculum_rules_minors.v1_0_0;

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
    "campCode",
    "studyPathInd",
    "program",
    "degcCode",
    "lockInd",
    "collCode",
    "currRule",
    "primRollInd",
    "levlCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesMinors100GetRequest {

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
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
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
    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private String termCode;
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

    public CurriculumRulesMinors100GetRequest withSecdRollInd(String secdRollInd) {
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

    public CurriculumRulesMinors100GetRequest withTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
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

    public CurriculumRulesMinors100GetRequest withCampCode(String campCode) {
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

    public CurriculumRulesMinors100GetRequest withStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
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

    public CurriculumRulesMinors100GetRequest withProgram(String program) {
        this.program = program;
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

    public CurriculumRulesMinors100GetRequest withDegcCode(String degcCode) {
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

    public CurriculumRulesMinors100GetRequest withLockInd(String lockInd) {
        this.lockInd = lockInd;
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

    public CurriculumRulesMinors100GetRequest withCollCode(String collCode) {
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

    public CurriculumRulesMinors100GetRequest withCurrRule(Double currRule) {
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

    public CurriculumRulesMinors100GetRequest withPrimRollInd(String primRollInd) {
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

    public CurriculumRulesMinors100GetRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CurriculumRulesMinors100GetRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public CurriculumRulesMinors100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesMinors100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("secdRollInd");
        sb.append('=');
        sb.append(((this.secdRollInd == null)?"<null>":this.secdRollInd));
        sb.append(',');
        sb.append("termCodeInit");
        sb.append('=');
        sb.append(((this.termCodeInit == null)?"<null>":this.termCodeInit));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("studyPathInd");
        sb.append('=');
        sb.append(((this.studyPathInd == null)?"<null>":this.studyPathInd));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
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
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.currRule == null)? 0 :this.currRule.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.primRollInd == null)? 0 :this.primRollInd.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesMinors100GetRequest) == false) {
            return false;
        }
        CurriculumRulesMinors100GetRequest rhs = ((CurriculumRulesMinors100GetRequest) other);
        return ((((((((((((((this.secdRollInd == rhs.secdRollInd)||((this.secdRollInd!= null)&&this.secdRollInd.equals(rhs.secdRollInd)))&&((this.termCodeInit == rhs.termCodeInit)||((this.termCodeInit!= null)&&this.termCodeInit.equals(rhs.termCodeInit))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.currRule == rhs.currRule)||((this.currRule!= null)&&this.currRule.equals(rhs.currRule))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.primRollInd == rhs.primRollInd)||((this.primRollInd!= null)&&this.primRollInd.equals(rhs.primRollInd))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
