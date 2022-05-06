
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
    "criteria.code",
    "grdeCodeSubstitute",
    "criteria.grdeCodeSubstitute",
    "criteria.stvgrdeAbbrevSubstitute",
    "criteria.abbrev",
    "criteria.gmodCodeStudent",
    "criteria.levlCode",
    "criteria.stvgmodDesc",
    "criteria.termCodeEffective",
    "criteria.grdeStatusInd"
})
@Generated("jsonschema2pojo")
public class GradeCodeSubstitution100PutRequest {

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_CODE")
    private String criteriaCode;
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
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCodeSubstitute")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE")
    private String criteriaGrdeCodeSubstitute;
    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgrdeAbbrevSubstitute")
    private String criteriaStvgrdeAbbrevSubstitute;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("criteria.abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ABBREV")
    private String criteriaAbbrev;
    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCodeStudent")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod")
    private String criteriaGmodCodeStudent;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgmodDesc")
    private String criteriaStvgmodDesc;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEffective;
    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_STATUS_IND")
    private String criteriaGrdeStatusInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

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

    public GradeCodeSubstitution100PutRequest withGrdeCodeSubstitute(String grdeCodeSubstitute) {
        this.grdeCodeSubstitute = grdeCodeSubstitute;
        return this;
    }

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCodeSubstitute")
    public String getCriteriaGrdeCodeSubstitute() {
        return criteriaGrdeCodeSubstitute;
    }

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCodeSubstitute")
    public void setCriteriaGrdeCodeSubstitute(String criteriaGrdeCodeSubstitute) {
        this.criteriaGrdeCodeSubstitute = criteriaGrdeCodeSubstitute;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaGrdeCodeSubstitute(String criteriaGrdeCodeSubstitute) {
        this.criteriaGrdeCodeSubstitute = criteriaGrdeCodeSubstitute;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgrdeAbbrevSubstitute")
    public String getCriteriaStvgrdeAbbrevSubstitute() {
        return criteriaStvgrdeAbbrevSubstitute;
    }

    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgrdeAbbrevSubstitute")
    public void setCriteriaStvgrdeAbbrevSubstitute(String criteriaStvgrdeAbbrevSubstitute) {
        this.criteriaStvgrdeAbbrevSubstitute = criteriaStvgrdeAbbrevSubstitute;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaStvgrdeAbbrevSubstitute(String criteriaStvgrdeAbbrevSubstitute) {
        this.criteriaStvgrdeAbbrevSubstitute = criteriaStvgrdeAbbrevSubstitute;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("criteria.abbrev")
    public String getCriteriaAbbrev() {
        return criteriaAbbrev;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("criteria.abbrev")
    public void setCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
        return this;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCodeStudent")
    public String getCriteriaGmodCodeStudent() {
        return criteriaGmodCodeStudent;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCodeStudent")
    public void setCriteriaGmodCodeStudent(String criteriaGmodCodeStudent) {
        this.criteriaGmodCodeStudent = criteriaGmodCodeStudent;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaGmodCodeStudent(String criteriaGmodCodeStudent) {
        this.criteriaGmodCodeStudent = criteriaGmodCodeStudent;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgmodDesc")
    public String getCriteriaStvgmodDesc() {
        return criteriaStvgmodDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvgmodDesc")
    public void setCriteriaStvgmodDesc(String criteriaStvgmodDesc) {
        this.criteriaStvgmodDesc = criteriaStvgmodDesc;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaStvgmodDesc(String criteriaStvgmodDesc) {
        this.criteriaStvgmodDesc = criteriaStvgmodDesc;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public String getCriteriaTermCodeEffective() {
        return criteriaTermCodeEffective;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public void setCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    public String getCriteriaGrdeStatusInd() {
        return criteriaGrdeStatusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    public void setCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
    }

    public GradeCodeSubstitution100PutRequest withCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
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

    public GradeCodeSubstitution100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCodeSubstitution100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("grdeCodeSubstitute");
        sb.append('=');
        sb.append(((this.grdeCodeSubstitute == null)?"<null>":this.grdeCodeSubstitute));
        sb.append(',');
        sb.append("criteriaGrdeCodeSubstitute");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeSubstitute == null)?"<null>":this.criteriaGrdeCodeSubstitute));
        sb.append(',');
        sb.append("criteriaStvgrdeAbbrevSubstitute");
        sb.append('=');
        sb.append(((this.criteriaStvgrdeAbbrevSubstitute == null)?"<null>":this.criteriaStvgrdeAbbrevSubstitute));
        sb.append(',');
        sb.append("criteriaAbbrev");
        sb.append('=');
        sb.append(((this.criteriaAbbrev == null)?"<null>":this.criteriaAbbrev));
        sb.append(',');
        sb.append("criteriaGmodCodeStudent");
        sb.append('=');
        sb.append(((this.criteriaGmodCodeStudent == null)?"<null>":this.criteriaGmodCodeStudent));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaStvgmodDesc");
        sb.append('=');
        sb.append(((this.criteriaStvgmodDesc == null)?"<null>":this.criteriaStvgmodDesc));
        sb.append(',');
        sb.append("criteriaTermCodeEffective");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEffective == null)?"<null>":this.criteriaTermCodeEffective));
        sb.append(',');
        sb.append("criteriaGrdeStatusInd");
        sb.append('=');
        sb.append(((this.criteriaGrdeStatusInd == null)?"<null>":this.criteriaGrdeStatusInd));
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
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeSubstitute == null)? 0 :this.criteriaGrdeCodeSubstitute.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCodeStudent == null)? 0 :this.criteriaGmodCodeStudent.hashCode()));
        result = ((result* 31)+((this.criteriaStvgrdeAbbrevSubstitute == null)? 0 :this.criteriaStvgrdeAbbrevSubstitute.hashCode()));
        result = ((result* 31)+((this.criteriaAbbrev == null)? 0 :this.criteriaAbbrev.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEffective == null)? 0 :this.criteriaTermCodeEffective.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvgmodDesc == null)? 0 :this.criteriaStvgmodDesc.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeStatusInd == null)? 0 :this.criteriaGrdeStatusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCodeSubstitution100PutRequest) == false) {
            return false;
        }
        GradeCodeSubstitution100PutRequest rhs = ((GradeCodeSubstitution100PutRequest) other);
        return ((((((((((((this.grdeCodeSubstitute == rhs.grdeCodeSubstitute)||((this.grdeCodeSubstitute!= null)&&this.grdeCodeSubstitute.equals(rhs.grdeCodeSubstitute)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaGrdeCodeSubstitute == rhs.criteriaGrdeCodeSubstitute)||((this.criteriaGrdeCodeSubstitute!= null)&&this.criteriaGrdeCodeSubstitute.equals(rhs.criteriaGrdeCodeSubstitute))))&&((this.criteriaGmodCodeStudent == rhs.criteriaGmodCodeStudent)||((this.criteriaGmodCodeStudent!= null)&&this.criteriaGmodCodeStudent.equals(rhs.criteriaGmodCodeStudent))))&&((this.criteriaStvgrdeAbbrevSubstitute == rhs.criteriaStvgrdeAbbrevSubstitute)||((this.criteriaStvgrdeAbbrevSubstitute!= null)&&this.criteriaStvgrdeAbbrevSubstitute.equals(rhs.criteriaStvgrdeAbbrevSubstitute))))&&((this.criteriaAbbrev == rhs.criteriaAbbrev)||((this.criteriaAbbrev!= null)&&this.criteriaAbbrev.equals(rhs.criteriaAbbrev))))&&((this.criteriaTermCodeEffective == rhs.criteriaTermCodeEffective)||((this.criteriaTermCodeEffective!= null)&&this.criteriaTermCodeEffective.equals(rhs.criteriaTermCodeEffective))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaStvgmodDesc == rhs.criteriaStvgmodDesc)||((this.criteriaStvgmodDesc!= null)&&this.criteriaStvgmodDesc.equals(rhs.criteriaStvgmodDesc))))&&((this.criteriaGrdeStatusInd == rhs.criteriaGrdeStatusInd)||((this.criteriaGrdeStatusInd!= null)&&this.criteriaGrdeStatusInd.equals(rhs.criteriaGrdeStatusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
