
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
    "campCode",
    "studyPathInd",
    "program",
    "lockInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesBaseCurriculumRules100PostRequest {

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
     * Lineage reference object : SOBCURR_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : SOBCURR_LOCK_IND")
    private String lockInd;
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withSecdRollInd(String secdRollInd) {
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withTermCodeInit(String termCodeInit) {
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withCampCode(String campCode) {
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withStudyPathInd(String studyPathInd) {
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withProgram(String program) {
        this.program = program;
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withLockInd(String lockInd) {
        this.lockInd = lockInd;
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withTermCode(String termCode) {
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

    public CurriculumRulesBaseCurriculumRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesBaseCurriculumRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
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
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesBaseCurriculumRules100PostRequest) == false) {
            return false;
        }
        CurriculumRulesBaseCurriculumRules100PostRequest rhs = ((CurriculumRulesBaseCurriculumRules100PostRequest) other);
        return (((((((((this.secdRollInd == rhs.secdRollInd)||((this.secdRollInd!= null)&&this.secdRollInd.equals(rhs.secdRollInd)))&&((this.termCodeInit == rhs.termCodeInit)||((this.termCodeInit!= null)&&this.termCodeInit.equals(rhs.termCodeInit))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
