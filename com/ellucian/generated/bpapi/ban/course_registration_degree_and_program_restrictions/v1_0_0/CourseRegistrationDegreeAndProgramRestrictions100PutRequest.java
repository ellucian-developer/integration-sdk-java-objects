
package com.ellucian.generated.bpapi.ban.course_registration_degree_and_program_restrictions.v1_0_0;

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
    "scacrseCrseNumb",
    "scacrseSubjCode",
    "criteria.criteriaProgram",
    "program",
    "scacrseTermCodeEff",
    "deptCode",
    "criteria.criteriaDeptCode"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationDegreeAndProgramRestrictions100PutRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object scacrseCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private Object scacrseSubjCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.criteriaProgram")
    @JsonPropertyDescription("Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle")
    private String criteriaCriteriaProgram;
    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private Object scacrseTermCodeEff;
    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String deptCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.criteriaDeptCode")
    @JsonPropertyDescription("Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaCriteriaDeptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public Object getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public Object getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.criteriaProgram")
    public String getCriteriaCriteriaProgram() {
        return criteriaCriteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.criteriaProgram")
    public void setCriteriaCriteriaProgram(String criteriaCriteriaProgram) {
        this.criteriaCriteriaProgram = criteriaCriteriaProgram;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withCriteriaCriteriaProgram(String criteriaCriteriaProgram) {
        this.criteriaCriteriaProgram = criteriaCriteriaProgram;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public Object getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(Object scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withScacrseTermCodeEff(Object scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.criteriaDeptCode")
    public String getCriteriaCriteriaDeptCode() {
        return criteriaCriteriaDeptCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.criteriaDeptCode")
    public void setCriteriaCriteriaDeptCode(String criteriaCriteriaDeptCode) {
        this.criteriaCriteriaDeptCode = criteriaCriteriaDeptCode;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withCriteriaCriteriaDeptCode(String criteriaCriteriaDeptCode) {
        this.criteriaCriteriaDeptCode = criteriaCriteriaDeptCode;
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

    public CourseRegistrationDegreeAndProgramRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationDegreeAndProgramRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("criteriaCriteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaCriteriaProgram == null)?"<null>":this.criteriaCriteriaProgram));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("criteriaCriteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaCriteriaDeptCode == null)?"<null>":this.criteriaCriteriaDeptCode));
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
        result = ((result* 31)+((this.criteriaCriteriaDeptCode == null)? 0 :this.criteriaCriteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.criteriaCriteriaProgram == null)? 0 :this.criteriaCriteriaProgram.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationDegreeAndProgramRestrictions100PutRequest) == false) {
            return false;
        }
        CourseRegistrationDegreeAndProgramRestrictions100PutRequest rhs = ((CourseRegistrationDegreeAndProgramRestrictions100PutRequest) other);
        return (((((((((this.criteriaCriteriaDeptCode == rhs.criteriaCriteriaDeptCode)||((this.criteriaCriteriaDeptCode!= null)&&this.criteriaCriteriaDeptCode.equals(rhs.criteriaCriteriaDeptCode)))&&((this.criteriaCriteriaProgram == rhs.criteriaCriteriaProgram)||((this.criteriaCriteriaProgram!= null)&&this.criteriaCriteriaProgram.equals(rhs.criteriaCriteriaProgram))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
