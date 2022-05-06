
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
    "levlCodeStu",
    "campCode",
    "webInd",
    "program",
    "lockedInd",
    "degcCode",
    "collCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class ProgramDefinitionRules100PostRequest {

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
     * Campus
     * <p>
     * Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
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
     * Program
     * <p>
     * Lineage reference object : SMRPRLE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_PROGRAM")
    private String program;
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
     * Degree
     * <p>
     * Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SMRPRLE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
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

    public ProgramDefinitionRules100PostRequest withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
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

    public ProgramDefinitionRules100PostRequest withLevlCodeStu(String levlCodeStu) {
        this.levlCodeStu = levlCodeStu;
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

    public ProgramDefinitionRules100PostRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public ProgramDefinitionRules100PostRequest withWebInd(String webInd) {
        this.webInd = webInd;
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

    public ProgramDefinitionRules100PostRequest withProgram(String program) {
        this.program = program;
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

    public ProgramDefinitionRules100PostRequest withLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
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

    public ProgramDefinitionRules100PostRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
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

    public ProgramDefinitionRules100PostRequest withCollCode(String collCode) {
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

    public ProgramDefinitionRules100PostRequest withLevlCode(String levlCode) {
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

    public ProgramDefinitionRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramDefinitionRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("levlCodeStu");
        sb.append('=');
        sb.append(((this.levlCodeStu == null)?"<null>":this.levlCodeStu));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("lockedInd");
        sb.append('=');
        sb.append(((this.lockedInd == null)?"<null>":this.lockedInd));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
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
        result = ((result* 31)+((this.levlCodeStu == null)? 0 :this.levlCodeStu.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.lockedInd == null)? 0 :this.lockedInd.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
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
        if ((other instanceof ProgramDefinitionRules100PostRequest) == false) {
            return false;
        }
        ProgramDefinitionRules100PostRequest rhs = ((ProgramDefinitionRules100PostRequest) other);
        return (((((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.levlCodeStu == rhs.levlCodeStu)||((this.levlCodeStu!= null)&&this.levlCodeStu.equals(rhs.levlCodeStu))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.lockedInd == rhs.lockedInd)||((this.lockedInd!= null)&&this.lockedInd.equals(rhs.lockedInd))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
