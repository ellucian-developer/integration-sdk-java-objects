
package com.ellucian.generated.bpapi.ban.program_definition_rules.v1_0_0;

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
    "programDesc",
    "criteria.degcDesc",
    "criteria.webInd",
    "criteria.campCode",
    "criteria.levlCode",
    "criteria.collCode",
    "degcCode",
    "criteria.stuLevlDesc",
    "campCode",
    "criteria.campDesc",
    "criteria.lockedInd",
    "criteria.fullName",
    "criteria.id",
    "criteria.levlCodeStu",
    "criteria.programDesc",
    "criteria.degcCode",
    "currInd",
    "webInd",
    "lockedInd",
    "criteria.levlDesc",
    "criteria.collDesc",
    "criteria.currInd",
    "criteria.currRuleInd",
    "collCode"
})
@Generated("jsonschema2pojo")
public class ProgramDefinitionRules100PutRequest {

    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_PROGRAM")
    private String criteriaProgram;
    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("programDesc")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_PROGRAM_DESC")
    private String programDesc;
    @JsonProperty("criteria.degcDesc")
    private String criteriaDegcDesc;
    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_WEB_IND")
    private String criteriaWebInd;
    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    @JsonProperty("criteria.stuLevlDesc")
    private String criteriaStuLevlDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    @JsonProperty("criteria.campDesc")
    private String criteriaCampDesc;
    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("criteria.lockedInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LOCKED_IND")
    private String criteriaLockedInd;
    @JsonProperty("criteria.fullName")
    private String criteriaFullName;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    private String criteriaId;
    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCodeStu")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCodeStu;
    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.programDesc")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_PROGRAM_DESC")
    private String criteriaProgramDesc;
    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaDegcCode;
    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("currInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CURR_IND")
    private String currInd;
    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_WEB_IND")
    private String webInd;
    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("lockedInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LOCKED_IND")
    private String lockedInd;
    @JsonProperty("criteria.levlDesc")
    private String criteriaLevlDesc;
    @JsonProperty("criteria.collDesc")
    private String criteriaCollDesc;
    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("criteria.currInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CURR_IND")
    private String criteriaCurrInd;
    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("criteria.currRuleInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CURR_RULE_IND")
    private String criteriaCurrRuleInd;
    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public ProgramDefinitionRules100PutRequest withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    @JsonProperty("criteria.degcDesc")
    public String getCriteriaDegcDesc() {
        return criteriaDegcDesc;
    }

    @JsonProperty("criteria.degcDesc")
    public void setCriteriaDegcDesc(String criteriaDegcDesc) {
        this.criteriaDegcDesc = criteriaDegcDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaDegcDesc(String criteriaDegcDesc) {
        this.criteriaDegcDesc = criteriaDegcDesc;
        return this;
    }

    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    public String getCriteriaWebInd() {
        return criteriaWebInd;
    }

    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    public void setCriteriaWebInd(String criteriaWebInd) {
        this.criteriaWebInd = criteriaWebInd;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaWebInd(String criteriaWebInd) {
        this.criteriaWebInd = criteriaWebInd;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public ProgramDefinitionRules100PutRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("criteria.stuLevlDesc")
    public String getCriteriaStuLevlDesc() {
        return criteriaStuLevlDesc;
    }

    @JsonProperty("criteria.stuLevlDesc")
    public void setCriteriaStuLevlDesc(String criteriaStuLevlDesc) {
        this.criteriaStuLevlDesc = criteriaStuLevlDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaStuLevlDesc(String criteriaStuLevlDesc) {
        this.criteriaStuLevlDesc = criteriaStuLevlDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public ProgramDefinitionRules100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("criteria.campDesc")
    public String getCriteriaCampDesc() {
        return criteriaCampDesc;
    }

    @JsonProperty("criteria.campDesc")
    public void setCriteriaCampDesc(String criteriaCampDesc) {
        this.criteriaCampDesc = criteriaCampDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCampDesc(String criteriaCampDesc) {
        this.criteriaCampDesc = criteriaCampDesc;
        return this;
    }

    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("criteria.lockedInd")
    public String getCriteriaLockedInd() {
        return criteriaLockedInd;
    }

    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("criteria.lockedInd")
    public void setCriteriaLockedInd(String criteriaLockedInd) {
        this.criteriaLockedInd = criteriaLockedInd;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaLockedInd(String criteriaLockedInd) {
        this.criteriaLockedInd = criteriaLockedInd;
        return this;
    }

    @JsonProperty("criteria.fullName")
    public String getCriteriaFullName() {
        return criteriaFullName;
    }

    @JsonProperty("criteria.fullName")
    public void setCriteriaFullName(String criteriaFullName) {
        this.criteriaFullName = criteriaFullName;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaFullName(String criteriaFullName) {
        this.criteriaFullName = criteriaFullName;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCodeStu")
    public String getCriteriaLevlCodeStu() {
        return criteriaLevlCodeStu;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCodeStu")
    public void setCriteriaLevlCodeStu(String criteriaLevlCodeStu) {
        this.criteriaLevlCodeStu = criteriaLevlCodeStu;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaLevlCodeStu(String criteriaLevlCodeStu) {
        this.criteriaLevlCodeStu = criteriaLevlCodeStu;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.programDesc")
    public String getCriteriaProgramDesc() {
        return criteriaProgramDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.programDesc")
    public void setCriteriaProgramDesc(String criteriaProgramDesc) {
        this.criteriaProgramDesc = criteriaProgramDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaProgramDesc(String criteriaProgramDesc) {
        this.criteriaProgramDesc = criteriaProgramDesc;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public String getCriteriaDegcCode() {
        return criteriaDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public void setCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
        return this;
    }

    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("currInd")
    public String getCurrInd() {
        return currInd;
    }

    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("currInd")
    public void setCurrInd(String currInd) {
        this.currInd = currInd;
    }

    public ProgramDefinitionRules100PutRequest withCurrInd(String currInd) {
        this.currInd = currInd;
        return this;
    }

    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public String getWebInd() {
        return webInd;
    }

    /**
     * Web
     * <p>
     * Lineage reference object : SMRPRLE_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public void setWebInd(String webInd) {
        this.webInd = webInd;
    }

    public ProgramDefinitionRules100PutRequest withWebInd(String webInd) {
        this.webInd = webInd;
        return this;
    }

    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("lockedInd")
    public String getLockedInd() {
        return lockedInd;
    }

    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("lockedInd")
    public void setLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
    }

    public ProgramDefinitionRules100PutRequest withLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
        return this;
    }

    @JsonProperty("criteria.levlDesc")
    public String getCriteriaLevlDesc() {
        return criteriaLevlDesc;
    }

    @JsonProperty("criteria.levlDesc")
    public void setCriteriaLevlDesc(String criteriaLevlDesc) {
        this.criteriaLevlDesc = criteriaLevlDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaLevlDesc(String criteriaLevlDesc) {
        this.criteriaLevlDesc = criteriaLevlDesc;
        return this;
    }

    @JsonProperty("criteria.collDesc")
    public String getCriteriaCollDesc() {
        return criteriaCollDesc;
    }

    @JsonProperty("criteria.collDesc")
    public void setCriteriaCollDesc(String criteriaCollDesc) {
        this.criteriaCollDesc = criteriaCollDesc;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCollDesc(String criteriaCollDesc) {
        this.criteriaCollDesc = criteriaCollDesc;
        return this;
    }

    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("criteria.currInd")
    public String getCriteriaCurrInd() {
        return criteriaCurrInd;
    }

    /**
     * Curriculum Dependent
     * <p>
     * Lineage reference object : SMRPRLE_CURR_IND
     * 
     */
    @JsonProperty("criteria.currInd")
    public void setCriteriaCurrInd(String criteriaCurrInd) {
        this.criteriaCurrInd = criteriaCurrInd;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCurrInd(String criteriaCurrInd) {
        this.criteriaCurrInd = criteriaCurrInd;
        return this;
    }

    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("criteria.currRuleInd")
    public String getCriteriaCurrRuleInd() {
        return criteriaCurrRuleInd;
    }

    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("criteria.currRuleInd")
    public void setCriteriaCurrRuleInd(String criteriaCurrRuleInd) {
        this.criteriaCurrRuleInd = criteriaCurrRuleInd;
    }

    public ProgramDefinitionRules100PutRequest withCriteriaCurrRuleInd(String criteriaCurrRuleInd) {
        this.criteriaCurrRuleInd = criteriaCurrRuleInd;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public ProgramDefinitionRules100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
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

    public ProgramDefinitionRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramDefinitionRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("criteriaDegcDesc");
        sb.append('=');
        sb.append(((this.criteriaDegcDesc == null)?"<null>":this.criteriaDegcDesc));
        sb.append(',');
        sb.append("criteriaWebInd");
        sb.append('=');
        sb.append(((this.criteriaWebInd == null)?"<null>":this.criteriaWebInd));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("criteriaStuLevlDesc");
        sb.append('=');
        sb.append(((this.criteriaStuLevlDesc == null)?"<null>":this.criteriaStuLevlDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("criteriaCampDesc");
        sb.append('=');
        sb.append(((this.criteriaCampDesc == null)?"<null>":this.criteriaCampDesc));
        sb.append(',');
        sb.append("criteriaLockedInd");
        sb.append('=');
        sb.append(((this.criteriaLockedInd == null)?"<null>":this.criteriaLockedInd));
        sb.append(',');
        sb.append("criteriaFullName");
        sb.append('=');
        sb.append(((this.criteriaFullName == null)?"<null>":this.criteriaFullName));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("criteriaLevlCodeStu");
        sb.append('=');
        sb.append(((this.criteriaLevlCodeStu == null)?"<null>":this.criteriaLevlCodeStu));
        sb.append(',');
        sb.append("criteriaProgramDesc");
        sb.append('=');
        sb.append(((this.criteriaProgramDesc == null)?"<null>":this.criteriaProgramDesc));
        sb.append(',');
        sb.append("criteriaDegcCode");
        sb.append('=');
        sb.append(((this.criteriaDegcCode == null)?"<null>":this.criteriaDegcCode));
        sb.append(',');
        sb.append("currInd");
        sb.append('=');
        sb.append(((this.currInd == null)?"<null>":this.currInd));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("lockedInd");
        sb.append('=');
        sb.append(((this.lockedInd == null)?"<null>":this.lockedInd));
        sb.append(',');
        sb.append("criteriaLevlDesc");
        sb.append('=');
        sb.append(((this.criteriaLevlDesc == null)?"<null>":this.criteriaLevlDesc));
        sb.append(',');
        sb.append("criteriaCollDesc");
        sb.append('=');
        sb.append(((this.criteriaCollDesc == null)?"<null>":this.criteriaCollDesc));
        sb.append(',');
        sb.append("criteriaCurrInd");
        sb.append('=');
        sb.append(((this.criteriaCurrInd == null)?"<null>":this.criteriaCurrInd));
        sb.append(',');
        sb.append("criteriaCurrRuleInd");
        sb.append('=');
        sb.append(((this.criteriaCurrRuleInd == null)?"<null>":this.criteriaCurrRuleInd));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
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
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDegcCode == null)? 0 :this.criteriaDegcCode.hashCode()));
        result = ((result* 31)+((this.criteriaStuLevlDesc == null)? 0 :this.criteriaStuLevlDesc.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.criteriaProgramDesc == null)? 0 :this.criteriaProgramDesc.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollDesc == null)? 0 :this.criteriaCollDesc.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.criteriaLevlDesc == null)? 0 :this.criteriaLevlDesc.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampDesc == null)? 0 :this.criteriaCampDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCurrRuleInd == null)? 0 :this.criteriaCurrRuleInd.hashCode()));
        result = ((result* 31)+((this.criteriaDegcDesc == null)? 0 :this.criteriaDegcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaFullName == null)? 0 :this.criteriaFullName.hashCode()));
        result = ((result* 31)+((this.currInd == null)? 0 :this.currInd.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.lockedInd == null)? 0 :this.lockedInd.hashCode()));
        result = ((result* 31)+((this.criteriaWebInd == null)? 0 :this.criteriaWebInd.hashCode()));
        result = ((result* 31)+((this.criteriaLockedInd == null)? 0 :this.criteriaLockedInd.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCodeStu == null)? 0 :this.criteriaLevlCodeStu.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaCurrInd == null)? 0 :this.criteriaCurrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramDefinitionRules100PutRequest) == false) {
            return false;
        }
        ProgramDefinitionRules100PutRequest rhs = ((ProgramDefinitionRules100PutRequest) other);
        return (((((((((((((((((((((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.criteriaDegcCode == rhs.criteriaDegcCode)||((this.criteriaDegcCode!= null)&&this.criteriaDegcCode.equals(rhs.criteriaDegcCode))))&&((this.criteriaStuLevlDesc == rhs.criteriaStuLevlDesc)||((this.criteriaStuLevlDesc!= null)&&this.criteriaStuLevlDesc.equals(rhs.criteriaStuLevlDesc))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.criteriaProgramDesc == rhs.criteriaProgramDesc)||((this.criteriaProgramDesc!= null)&&this.criteriaProgramDesc.equals(rhs.criteriaProgramDesc))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.criteriaCollDesc == rhs.criteriaCollDesc)||((this.criteriaCollDesc!= null)&&this.criteriaCollDesc.equals(rhs.criteriaCollDesc))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.criteriaLevlDesc == rhs.criteriaLevlDesc)||((this.criteriaLevlDesc!= null)&&this.criteriaLevlDesc.equals(rhs.criteriaLevlDesc))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.criteriaCampDesc == rhs.criteriaCampDesc)||((this.criteriaCampDesc!= null)&&this.criteriaCampDesc.equals(rhs.criteriaCampDesc))))&&((this.criteriaCurrRuleInd == rhs.criteriaCurrRuleInd)||((this.criteriaCurrRuleInd!= null)&&this.criteriaCurrRuleInd.equals(rhs.criteriaCurrRuleInd))))&&((this.criteriaDegcDesc == rhs.criteriaDegcDesc)||((this.criteriaDegcDesc!= null)&&this.criteriaDegcDesc.equals(rhs.criteriaDegcDesc))))&&((this.criteriaFullName == rhs.criteriaFullName)||((this.criteriaFullName!= null)&&this.criteriaFullName.equals(rhs.criteriaFullName))))&&((this.currInd == rhs.currInd)||((this.currInd!= null)&&this.currInd.equals(rhs.currInd))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.lockedInd == rhs.lockedInd)||((this.lockedInd!= null)&&this.lockedInd.equals(rhs.lockedInd))))&&((this.criteriaWebInd == rhs.criteriaWebInd)||((this.criteriaWebInd!= null)&&this.criteriaWebInd.equals(rhs.criteriaWebInd))))&&((this.criteriaLockedInd == rhs.criteriaLockedInd)||((this.criteriaLockedInd!= null)&&this.criteriaLockedInd.equals(rhs.criteriaLockedInd))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaLevlCodeStu == rhs.criteriaLevlCodeStu)||((this.criteriaLevlCodeStu!= null)&&this.criteriaLevlCodeStu.equals(rhs.criteriaLevlCodeStu))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaCurrInd == rhs.criteriaCurrInd)||((this.criteriaCurrInd!= null)&&this.criteriaCurrInd.equals(rhs.criteriaCurrInd))));
    }

}
