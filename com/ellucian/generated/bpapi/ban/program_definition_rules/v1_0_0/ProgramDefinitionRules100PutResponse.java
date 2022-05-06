
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
    "programDesc",
    "levlDesc",
    "levlCodeStu",
    "currInd",
    "webInd",
    "campDesc",
    "fullName",
    "degcCode",
    "lockedInd",
    "program",
    "degcDesc",
    "stuLevlDesc",
    "campCode",
    "collDesc",
    "currRuleInd",
    "id",
    "collCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class ProgramDefinitionRules100PutResponse {

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
    @JsonProperty("levlDesc")
    private String levlDesc;
    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCodeStu")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl")
    private String levlCodeStu;
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
    @JsonProperty("campDesc")
    private String campDesc;
    @JsonProperty("fullName")
    private String fullName;
    /**
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Locked
     * <p>
     * Lineage reference object : SMRPRLE_LOCKED_IND
     * 
     */
    @JsonProperty("lockedInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LOCKED_IND")
    private String lockedInd;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_PROGRAM")
    private String program;
    @JsonProperty("degcDesc")
    private String degcDesc;
    @JsonProperty("stuLevlDesc")
    private String stuLevlDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    @JsonProperty("collDesc")
    private String collDesc;
    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("currRuleInd")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CURR_RULE_IND")
    private String currRuleInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * College
     * <p>
     * Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ProgramDefinitionRules100PutResponse withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    @JsonProperty("levlDesc")
    public String getLevlDesc() {
        return levlDesc;
    }

    @JsonProperty("levlDesc")
    public void setLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
    }

    public ProgramDefinitionRules100PutResponse withLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
        return this;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCodeStu")
    public String getLevlCodeStu() {
        return levlCodeStu;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE_STU, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCodeStu")
    public void setLevlCodeStu(String levlCodeStu) {
        this.levlCodeStu = levlCodeStu;
    }

    public ProgramDefinitionRules100PutResponse withLevlCodeStu(String levlCodeStu) {
        this.levlCodeStu = levlCodeStu;
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

    public ProgramDefinitionRules100PutResponse withCurrInd(String currInd) {
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

    public ProgramDefinitionRules100PutResponse withWebInd(String webInd) {
        this.webInd = webInd;
        return this;
    }

    @JsonProperty("campDesc")
    public String getCampDesc() {
        return campDesc;
    }

    @JsonProperty("campDesc")
    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public ProgramDefinitionRules100PutResponse withCampDesc(String campDesc) {
        this.campDesc = campDesc;
        return this;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ProgramDefinitionRules100PutResponse withFullName(String fullName) {
        this.fullName = fullName;
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

    public ProgramDefinitionRules100PutResponse withDegcCode(String degcCode) {
        this.degcCode = degcCode;
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

    public ProgramDefinitionRules100PutResponse withLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ProgramDefinitionRules100PutResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("degcDesc")
    public String getDegcDesc() {
        return degcDesc;
    }

    @JsonProperty("degcDesc")
    public void setDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
    }

    public ProgramDefinitionRules100PutResponse withDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
        return this;
    }

    @JsonProperty("stuLevlDesc")
    public String getStuLevlDesc() {
        return stuLevlDesc;
    }

    @JsonProperty("stuLevlDesc")
    public void setStuLevlDesc(String stuLevlDesc) {
        this.stuLevlDesc = stuLevlDesc;
    }

    public ProgramDefinitionRules100PutResponse withStuLevlDesc(String stuLevlDesc) {
        this.stuLevlDesc = stuLevlDesc;
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

    public ProgramDefinitionRules100PutResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public ProgramDefinitionRules100PutResponse withCollDesc(String collDesc) {
        this.collDesc = collDesc;
        return this;
    }

    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("currRuleInd")
    public String getCurrRuleInd() {
        return currRuleInd;
    }

    /**
     * Curriculum Rules
     * <p>
     * Lineage reference object : SMRPRLE_CURR_RULE_IND
     * 
     */
    @JsonProperty("currRuleInd")
    public void setCurrRuleInd(String currRuleInd) {
        this.currRuleInd = currRuleInd;
    }

    public ProgramDefinitionRules100PutResponse withCurrRuleInd(String currRuleInd) {
        this.currRuleInd = currRuleInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ProgramDefinitionRules100PutResponse withId(String id) {
        this.id = id;
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

    public ProgramDefinitionRules100PutResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SMRPRLE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public ProgramDefinitionRules100PutResponse withLevlCode(String levlCode) {
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

    public ProgramDefinitionRules100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramDefinitionRules100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("levlDesc");
        sb.append('=');
        sb.append(((this.levlDesc == null)?"<null>":this.levlDesc));
        sb.append(',');
        sb.append("levlCodeStu");
        sb.append('=');
        sb.append(((this.levlCodeStu == null)?"<null>":this.levlCodeStu));
        sb.append(',');
        sb.append("currInd");
        sb.append('=');
        sb.append(((this.currInd == null)?"<null>":this.currInd));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("campDesc");
        sb.append('=');
        sb.append(((this.campDesc == null)?"<null>":this.campDesc));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("lockedInd");
        sb.append('=');
        sb.append(((this.lockedInd == null)?"<null>":this.lockedInd));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("degcDesc");
        sb.append('=');
        sb.append(((this.degcDesc == null)?"<null>":this.degcDesc));
        sb.append(',');
        sb.append("stuLevlDesc");
        sb.append('=');
        sb.append(((this.stuLevlDesc == null)?"<null>":this.stuLevlDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("currRuleInd");
        sb.append('=');
        sb.append(((this.currRuleInd == null)?"<null>":this.currRuleInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
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
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.levlDesc == null)? 0 :this.levlDesc.hashCode()));
        result = ((result* 31)+((this.levlCodeStu == null)? 0 :this.levlCodeStu.hashCode()));
        result = ((result* 31)+((this.currInd == null)? 0 :this.currInd.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.campDesc == null)? 0 :this.campDesc.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.lockedInd == null)? 0 :this.lockedInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcDesc == null)? 0 :this.degcDesc.hashCode()));
        result = ((result* 31)+((this.stuLevlDesc == null)? 0 :this.stuLevlDesc.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.currRuleInd == null)? 0 :this.currRuleInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramDefinitionRules100PutResponse) == false) {
            return false;
        }
        ProgramDefinitionRules100PutResponse rhs = ((ProgramDefinitionRules100PutResponse) other);
        return ((((((((((((((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.levlDesc == rhs.levlDesc)||((this.levlDesc!= null)&&this.levlDesc.equals(rhs.levlDesc))))&&((this.levlCodeStu == rhs.levlCodeStu)||((this.levlCodeStu!= null)&&this.levlCodeStu.equals(rhs.levlCodeStu))))&&((this.currInd == rhs.currInd)||((this.currInd!= null)&&this.currInd.equals(rhs.currInd))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.campDesc == rhs.campDesc)||((this.campDesc!= null)&&this.campDesc.equals(rhs.campDesc))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.lockedInd == rhs.lockedInd)||((this.lockedInd!= null)&&this.lockedInd.equals(rhs.lockedInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcDesc == rhs.degcDesc)||((this.degcDesc!= null)&&this.degcDesc.equals(rhs.degcDesc))))&&((this.stuLevlDesc == rhs.stuLevlDesc)||((this.stuLevlDesc!= null)&&this.stuLevlDesc.equals(rhs.stuLevlDesc))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.currRuleInd == rhs.currRuleInd)||((this.currRuleInd!= null)&&this.currRuleInd.equals(rhs.currRuleInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
