
package com.ellucian.generated.bpapi.ban.existing_programs.v1_0_0;

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
    "levelCode",
    "termCodeEff",
    "activeInd",
    "description",
    "program",
    "levelCodeStudent"
})
@Generated("jsonschema2pojo")
public class ExistingPrograms100GetRequest {

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCode")
    private String levelCode;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBPGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_TERM_CODE_EFF")
    private String termCodeEff;
    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_ACTIVE_IND")
    private String activeInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * Program
     * <p>
     * Lineage reference object : SMBPGEN_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_PROGRAM")
    private String program;
    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCodeStudent")
    private String levelCodeStudent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCode")
    public String getLevelCode() {
        return levelCode;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCode")
    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public ExistingPrograms100GetRequest withLevelCode(String levelCode) {
        this.levelCode = levelCode;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBPGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBPGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public ExistingPrograms100GetRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public ExistingPrograms100GetRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ExistingPrograms100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMBPGEN_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMBPGEN_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ExistingPrograms100GetRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCodeStudent")
    public String getLevelCodeStudent() {
        return levelCodeStudent;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levelCodeStudent")
    public void setLevelCodeStudent(String levelCodeStudent) {
        this.levelCodeStudent = levelCodeStudent;
    }

    public ExistingPrograms100GetRequest withLevelCodeStudent(String levelCodeStudent) {
        this.levelCodeStudent = levelCodeStudent;
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

    public ExistingPrograms100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExistingPrograms100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levelCode");
        sb.append('=');
        sb.append(((this.levelCode == null)?"<null>":this.levelCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("levelCodeStudent");
        sb.append('=');
        sb.append(((this.levelCodeStudent == null)?"<null>":this.levelCodeStudent));
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
        result = ((result* 31)+((this.levelCode == null)? 0 :this.levelCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levelCodeStudent == null)? 0 :this.levelCodeStudent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExistingPrograms100GetRequest) == false) {
            return false;
        }
        ExistingPrograms100GetRequest rhs = ((ExistingPrograms100GetRequest) other);
        return ((((((((this.levelCode == rhs.levelCode)||((this.levelCode!= null)&&this.levelCode.equals(rhs.levelCode)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levelCodeStudent == rhs.levelCodeStudent)||((this.levelCodeStudent!= null)&&this.levelCodeStudent.equals(rhs.levelCodeStudent))));
    }

}
