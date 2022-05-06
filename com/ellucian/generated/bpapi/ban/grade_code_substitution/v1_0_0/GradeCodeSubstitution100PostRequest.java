
package com.ellucian.generated.bpapi.ban.grade_code_substitution.v1_0_0;

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
    "grdeCodeSubstitute",
    "code",
    "gmodCodeStudent",
    "abbrev",
    "termCodeEffective",
    "levlCode",
    "grdeStatusInd"
})
@Generated("jsonschema2pojo")
public class GradeCodeSubstitution100PostRequest {

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE")
    private String grdeCodeSubstitute;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_CODE")
    private String code;
    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod")
    private String gmodCodeStudent;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ABBREV")
    private String abbrev;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String termCodeEffective;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_STATUS_IND")
    private String grdeStatusInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    public String getGrdeCodeSubstitute() {
        return grdeCodeSubstitute;
    }

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    public void setGrdeCodeSubstitute(String grdeCodeSubstitute) {
        this.grdeCodeSubstitute = grdeCodeSubstitute;
    }

    public GradeCodeSubstitution100PostRequest withGrdeCodeSubstitute(String grdeCodeSubstitute) {
        this.grdeCodeSubstitute = grdeCodeSubstitute;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeCodeSubstitution100PostRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    public String getGmodCodeStudent() {
        return gmodCodeStudent;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    public void setGmodCodeStudent(String gmodCodeStudent) {
        this.gmodCodeStudent = gmodCodeStudent;
    }

    public GradeCodeSubstitution100PostRequest withGmodCodeStudent(String gmodCodeStudent) {
        this.gmodCodeStudent = gmodCodeStudent;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public GradeCodeSubstitution100PostRequest withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffective")
    public String getTermCodeEffective() {
        return termCodeEffective;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffective")
    public void setTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
    }

    public GradeCodeSubstitution100PostRequest withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public GradeCodeSubstitution100PostRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("grdeStatusInd")
    public String getGrdeStatusInd() {
        return grdeStatusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("grdeStatusInd")
    public void setGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
    }

    public GradeCodeSubstitution100PostRequest withGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
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

    public GradeCodeSubstitution100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCodeSubstitution100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grdeCodeSubstitute");
        sb.append('=');
        sb.append(((this.grdeCodeSubstitute == null)?"<null>":this.grdeCodeSubstitute));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("gmodCodeStudent");
        sb.append('=');
        sb.append(((this.gmodCodeStudent == null)?"<null>":this.gmodCodeStudent));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("grdeStatusInd");
        sb.append('=');
        sb.append(((this.grdeStatusInd == null)?"<null>":this.grdeStatusInd));
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
        result = ((result* 31)+((this.grdeCodeSubstitute == null)? 0 :this.grdeCodeSubstitute.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.gmodCodeStudent == null)? 0 :this.gmodCodeStudent.hashCode()));
        result = ((result* 31)+((this.abbrev == null)? 0 :this.abbrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEffective == null)? 0 :this.termCodeEffective.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.grdeStatusInd == null)? 0 :this.grdeStatusInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCodeSubstitution100PostRequest) == false) {
            return false;
        }
        GradeCodeSubstitution100PostRequest rhs = ((GradeCodeSubstitution100PostRequest) other);
        return (((((((((this.grdeCodeSubstitute == rhs.grdeCodeSubstitute)||((this.grdeCodeSubstitute!= null)&&this.grdeCodeSubstitute.equals(rhs.grdeCodeSubstitute)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.gmodCodeStudent == rhs.gmodCodeStudent)||((this.gmodCodeStudent!= null)&&this.gmodCodeStudent.equals(rhs.gmodCodeStudent))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.grdeStatusInd == rhs.grdeStatusInd)||((this.grdeStatusInd!= null)&&this.grdeStatusInd.equals(rhs.grdeStatusInd))));
    }

}
