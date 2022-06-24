
package com.ellucian.generated.bpapi.ban.area_usage_by_program_inquiry.v0_1_0;

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
    "currInd",
    "currRuleInd",
    "lockedInd",
    "smrauseProgram",
    "levlCode",
    "stuLevel"
})
@Generated("jsonschema2pojo")
public class Smrause2 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    private String programDesc;
    @JsonProperty("currInd")
    private String currInd;
    @JsonProperty("currRuleInd")
    private String currRuleInd;
    @JsonProperty("lockedInd")
    private String lockedInd;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    @JsonPropertyDescription("Lineage reference object : SMRAUSE_PROGRAM")
    private String smrauseProgram;
    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    private String levlCode;
    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    private String stuLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public Smrause2 withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    @JsonProperty("currInd")
    public String getCurrInd() {
        return currInd;
    }

    @JsonProperty("currInd")
    public void setCurrInd(String currInd) {
        this.currInd = currInd;
    }

    public Smrause2 withCurrInd(String currInd) {
        this.currInd = currInd;
        return this;
    }

    @JsonProperty("currRuleInd")
    public String getCurrRuleInd() {
        return currRuleInd;
    }

    @JsonProperty("currRuleInd")
    public void setCurrRuleInd(String currRuleInd) {
        this.currRuleInd = currRuleInd;
    }

    public Smrause2 withCurrRuleInd(String currRuleInd) {
        this.currRuleInd = currRuleInd;
        return this;
    }

    @JsonProperty("lockedInd")
    public String getLockedInd() {
        return lockedInd;
    }

    @JsonProperty("lockedInd")
    public void setLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
    }

    public Smrause2 withLockedInd(String lockedInd) {
        this.lockedInd = lockedInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    public String getSmrauseProgram() {
        return smrauseProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    public void setSmrauseProgram(String smrauseProgram) {
        this.smrauseProgram = smrauseProgram;
    }

    public Smrause2 withSmrauseProgram(String smrauseProgram) {
        this.smrauseProgram = smrauseProgram;
        return this;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Smrause2 withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    public String getStuLevel() {
        return stuLevel;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    public void setStuLevel(String stuLevel) {
        this.stuLevel = stuLevel;
    }

    public Smrause2 withStuLevel(String stuLevel) {
        this.stuLevel = stuLevel;
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

    public Smrause2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrause2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("currInd");
        sb.append('=');
        sb.append(((this.currInd == null)?"<null>":this.currInd));
        sb.append(',');
        sb.append("currRuleInd");
        sb.append('=');
        sb.append(((this.currRuleInd == null)?"<null>":this.currRuleInd));
        sb.append(',');
        sb.append("lockedInd");
        sb.append('=');
        sb.append(((this.lockedInd == null)?"<null>":this.lockedInd));
        sb.append(',');
        sb.append("smrauseProgram");
        sb.append('=');
        sb.append(((this.smrauseProgram == null)?"<null>":this.smrauseProgram));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("stuLevel");
        sb.append('=');
        sb.append(((this.stuLevel == null)?"<null>":this.stuLevel));
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
        result = ((result* 31)+((this.currInd == null)? 0 :this.currInd.hashCode()));
        result = ((result* 31)+((this.currRuleInd == null)? 0 :this.currRuleInd.hashCode()));
        result = ((result* 31)+((this.lockedInd == null)? 0 :this.lockedInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smrauseProgram == null)? 0 :this.smrauseProgram.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.stuLevel == null)? 0 :this.stuLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrause2) == false) {
            return false;
        }
        Smrause2 rhs = ((Smrause2) other);
        return (((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.currInd == rhs.currInd)||((this.currInd!= null)&&this.currInd.equals(rhs.currInd))))&&((this.currRuleInd == rhs.currRuleInd)||((this.currRuleInd!= null)&&this.currRuleInd.equals(rhs.currRuleInd))))&&((this.lockedInd == rhs.lockedInd)||((this.lockedInd!= null)&&this.lockedInd.equals(rhs.lockedInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smrauseProgram == rhs.smrauseProgram)||((this.smrauseProgram!= null)&&this.smrauseProgram.equals(rhs.smrauseProgram))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.stuLevel == rhs.stuLevel)||((this.stuLevel!= null)&&this.stuLevel.equals(rhs.stuLevel))));
    }

}
