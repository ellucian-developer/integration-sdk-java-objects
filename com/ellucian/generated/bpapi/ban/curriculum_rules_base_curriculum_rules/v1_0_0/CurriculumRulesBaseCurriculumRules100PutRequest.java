
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
    "criteria.program",
    "secdRollInd",
    "criteria.primRollInd",
    "termCodeInit",
    "criteria.campCode",
    "studyPathInd",
    "criteria.degcCode",
    "criteria.levlCode",
    "criteria.collCode",
    "program",
    "criteria.lockInd",
    "criteria.termCodeInit",
    "criteria.studyPathInd",
    "campCode",
    "lockInd",
    "criteria.currRule",
    "criteria.secdRollInd",
    "primRollInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesBaseCurriculumRules100PutRequest {

    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle")
    private String criteriaProgram;
    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("secdRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_SECD_ROLL_IND")
    private String secdRollInd;
    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("criteria.primRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PRIM_ROLL_IND")
    private String criteriaPrimRollInd;
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
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
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
    @JsonProperty("criteria.degcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaDegcCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
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
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("criteria.lockInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LOCK_IND")
    private String criteriaLockInd;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeInit")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeInit;
    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("criteria.studyPathInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_STUDY_PATH_IND")
    private String criteriaStudyPathInd;
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
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LOCK_IND")
    private String lockInd;
    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("criteria.currRule")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_CURR_RULE")
    private Double criteriaCurrRule;
    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("criteria.secdRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_SECD_ROLL_IND")
    private String criteriaSecdRollInd;
    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("primRollInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_PRIM_ROLL_IND")
    private String primRollInd;
    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOBCURR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

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

    public CurriculumRulesBaseCurriculumRules100PutRequest withSecdRollInd(String secdRollInd) {
        this.secdRollInd = secdRollInd;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("criteria.primRollInd")
    public String getCriteriaPrimRollInd() {
        return criteriaPrimRollInd;
    }

    /**
     * Lineage reference object : SOBCURR_PRIM_ROLL_IND
     * 
     */
    @JsonProperty("criteria.primRollInd")
    public void setCriteriaPrimRollInd(String criteriaPrimRollInd) {
        this.criteriaPrimRollInd = criteriaPrimRollInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaPrimRollInd(String criteriaPrimRollInd) {
        this.criteriaPrimRollInd = criteriaPrimRollInd;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBCURR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public String getCriteriaDegcCode() {
        return criteriaDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBCURR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public void setCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBCURR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBCURR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("criteria.lockInd")
    public String getCriteriaLockInd() {
        return criteriaLockInd;
    }

    /**
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("criteria.lockInd")
    public void setCriteriaLockInd(String criteriaLockInd) {
        this.criteriaLockInd = criteriaLockInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaLockInd(String criteriaLockInd) {
        this.criteriaLockInd = criteriaLockInd;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeInit")
    public String getCriteriaTermCodeInit() {
        return criteriaTermCodeInit;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SOBCURR_TERM_CODE_INIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeInit")
    public void setCriteriaTermCodeInit(String criteriaTermCodeInit) {
        this.criteriaTermCodeInit = criteriaTermCodeInit;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaTermCodeInit(String criteriaTermCodeInit) {
        this.criteriaTermCodeInit = criteriaTermCodeInit;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("criteria.studyPathInd")
    public String getCriteriaStudyPathInd() {
        return criteriaStudyPathInd;
    }

    /**
     * Lineage reference object : SOBCURR_STUDY_PATH_IND
     * 
     */
    @JsonProperty("criteria.studyPathInd")
    public void setCriteriaStudyPathInd(String criteriaStudyPathInd) {
        this.criteriaStudyPathInd = criteriaStudyPathInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaStudyPathInd(String criteriaStudyPathInd) {
        this.criteriaStudyPathInd = criteriaStudyPathInd;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("criteria.currRule")
    public Double getCriteriaCurrRule() {
        return criteriaCurrRule;
    }

    /**
     * Base Rule Number
     * <p>
     * Lineage reference object : SOBCURR_CURR_RULE
     * 
     */
    @JsonProperty("criteria.currRule")
    public void setCriteriaCurrRule(Double criteriaCurrRule) {
        this.criteriaCurrRule = criteriaCurrRule;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaCurrRule(Double criteriaCurrRule) {
        this.criteriaCurrRule = criteriaCurrRule;
        return this;
    }

    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("criteria.secdRollInd")
    public String getCriteriaSecdRollInd() {
        return criteriaSecdRollInd;
    }

    /**
     * Lineage reference object : SOBCURR_SECD_ROLL_IND
     * 
     */
    @JsonProperty("criteria.secdRollInd")
    public void setCriteriaSecdRollInd(String criteriaSecdRollInd) {
        this.criteriaSecdRollInd = criteriaSecdRollInd;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withCriteriaSecdRollInd(String criteriaSecdRollInd) {
        this.criteriaSecdRollInd = criteriaSecdRollInd;
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withPrimRollInd(String primRollInd) {
        this.primRollInd = primRollInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public CurriculumRulesBaseCurriculumRules100PutRequest withTermCode(Object termCode) {
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

    public CurriculumRulesBaseCurriculumRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesBaseCurriculumRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("secdRollInd");
        sb.append('=');
        sb.append(((this.secdRollInd == null)?"<null>":this.secdRollInd));
        sb.append(',');
        sb.append("criteriaPrimRollInd");
        sb.append('=');
        sb.append(((this.criteriaPrimRollInd == null)?"<null>":this.criteriaPrimRollInd));
        sb.append(',');
        sb.append("termCodeInit");
        sb.append('=');
        sb.append(((this.termCodeInit == null)?"<null>":this.termCodeInit));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("studyPathInd");
        sb.append('=');
        sb.append(((this.studyPathInd == null)?"<null>":this.studyPathInd));
        sb.append(',');
        sb.append("criteriaDegcCode");
        sb.append('=');
        sb.append(((this.criteriaDegcCode == null)?"<null>":this.criteriaDegcCode));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("criteriaLockInd");
        sb.append('=');
        sb.append(((this.criteriaLockInd == null)?"<null>":this.criteriaLockInd));
        sb.append(',');
        sb.append("criteriaTermCodeInit");
        sb.append('=');
        sb.append(((this.criteriaTermCodeInit == null)?"<null>":this.criteriaTermCodeInit));
        sb.append(',');
        sb.append("criteriaStudyPathInd");
        sb.append('=');
        sb.append(((this.criteriaStudyPathInd == null)?"<null>":this.criteriaStudyPathInd));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("criteriaCurrRule");
        sb.append('=');
        sb.append(((this.criteriaCurrRule == null)?"<null>":this.criteriaCurrRule));
        sb.append(',');
        sb.append("criteriaSecdRollInd");
        sb.append('=');
        sb.append(((this.criteriaSecdRollInd == null)?"<null>":this.criteriaSecdRollInd));
        sb.append(',');
        sb.append("primRollInd");
        sb.append('=');
        sb.append(((this.primRollInd == null)?"<null>":this.primRollInd));
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
        result = ((result* 31)+((this.criteriaLockInd == null)? 0 :this.criteriaLockInd.hashCode()));
        result = ((result* 31)+((this.criteriaCurrRule == null)? 0 :this.criteriaCurrRule.hashCode()));
        result = ((result* 31)+((this.criteriaDegcCode == null)? 0 :this.criteriaDegcCode.hashCode()));
        result = ((result* 31)+((this.termCodeInit == null)? 0 :this.termCodeInit.hashCode()));
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaSecdRollInd == null)? 0 :this.criteriaSecdRollInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeInit == null)? 0 :this.criteriaTermCodeInit.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.criteriaPrimRollInd == null)? 0 :this.criteriaPrimRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaStudyPathInd == null)? 0 :this.criteriaStudyPathInd.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.primRollInd == null)? 0 :this.primRollInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesBaseCurriculumRules100PutRequest) == false) {
            return false;
        }
        CurriculumRulesBaseCurriculumRules100PutRequest rhs = ((CurriculumRulesBaseCurriculumRules100PutRequest) other);
        return (((((((((((((((((((((this.secdRollInd == rhs.secdRollInd)||((this.secdRollInd!= null)&&this.secdRollInd.equals(rhs.secdRollInd)))&&((this.criteriaLockInd == rhs.criteriaLockInd)||((this.criteriaLockInd!= null)&&this.criteriaLockInd.equals(rhs.criteriaLockInd))))&&((this.criteriaCurrRule == rhs.criteriaCurrRule)||((this.criteriaCurrRule!= null)&&this.criteriaCurrRule.equals(rhs.criteriaCurrRule))))&&((this.criteriaDegcCode == rhs.criteriaDegcCode)||((this.criteriaDegcCode!= null)&&this.criteriaDegcCode.equals(rhs.criteriaDegcCode))))&&((this.termCodeInit == rhs.termCodeInit)||((this.termCodeInit!= null)&&this.termCodeInit.equals(rhs.termCodeInit))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.criteriaSecdRollInd == rhs.criteriaSecdRollInd)||((this.criteriaSecdRollInd!= null)&&this.criteriaSecdRollInd.equals(rhs.criteriaSecdRollInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.criteriaTermCodeInit == rhs.criteriaTermCodeInit)||((this.criteriaTermCodeInit!= null)&&this.criteriaTermCodeInit.equals(rhs.criteriaTermCodeInit))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.criteriaPrimRollInd == rhs.criteriaPrimRollInd)||((this.criteriaPrimRollInd!= null)&&this.criteriaPrimRollInd.equals(rhs.criteriaPrimRollInd))))&&((this.criteriaStudyPathInd == rhs.criteriaStudyPathInd)||((this.criteriaStudyPathInd!= null)&&this.criteriaStudyPathInd.equals(rhs.criteriaStudyPathInd))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.primRollInd == rhs.primRollInd)||((this.primRollInd!= null)&&this.primRollInd.equals(rhs.primRollInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
