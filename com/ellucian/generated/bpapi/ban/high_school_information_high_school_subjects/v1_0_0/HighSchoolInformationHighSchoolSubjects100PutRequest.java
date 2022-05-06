
package com.ellucian.generated.bpapi.ban.high_school_information_high_school_subjects.v1_0_0;

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
    "grade",
    "subjGpa",
    "criteria.sbjcCode",
    "sorhsbjSbjcCode",
    "id",
    "criteria.subjYears",
    "subjYears",
    "criteria.grade",
    "criteria.subjGpa"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolSubjects100PutRequest {

    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_GRADE")
    private String grade;
    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_GPA")
    private String subjGpa;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String criteriaSbjcCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("sorhsbjSbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String sorhsbjSbjcCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("criteria.subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double criteriaSubjYears;
    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double subjYears;
    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_GRADE")
    private String criteriaGrade;
    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("criteria.subjGpa")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_GPA")
    private String criteriaSubjGpa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public String getSubjGpa() {
        return subjGpa;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public void setSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbjcCode")
    public String getCriteriaSbjcCode() {
        return criteriaSbjcCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbjcCode")
    public void setCriteriaSbjcCode(String criteriaSbjcCode) {
        this.criteriaSbjcCode = criteriaSbjcCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaSbjcCode(String criteriaSbjcCode) {
        this.criteriaSbjcCode = criteriaSbjcCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("sorhsbjSbjcCode")
    public String getSorhsbjSbjcCode() {
        return sorhsbjSbjcCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("sorhsbjSbjcCode")
    public void setSorhsbjSbjcCode(String sorhsbjSbjcCode) {
        this.sorhsbjSbjcCode = sorhsbjSbjcCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withSorhsbjSbjcCode(String sorhsbjSbjcCode) {
        this.sorhsbjSbjcCode = sorhsbjSbjcCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("criteria.subjYears")
    public Double getCriteriaSubjYears() {
        return criteriaSubjYears;
    }

    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("criteria.subjYears")
    public void setCriteriaSubjYears(Double criteriaSubjYears) {
        this.criteriaSubjYears = criteriaSubjYears;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaSubjYears(Double criteriaSubjYears) {
        this.criteriaSubjYears = criteriaSubjYears;
        return this;
    }

    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public Double getSubjYears() {
        return subjYears;
    }

    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public void setSubjYears(Double subjYears) {
        this.subjYears = subjYears;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withSubjYears(Double subjYears) {
        this.subjYears = subjYears;
        return this;
    }

    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    public String getCriteriaGrade() {
        return criteriaGrade;
    }

    /**
     * Subject Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    public void setCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
        return this;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("criteria.subjGpa")
    public String getCriteriaSubjGpa() {
        return criteriaSubjGpa;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("criteria.subjGpa")
    public void setCriteriaSubjGpa(String criteriaSubjGpa) {
        this.criteriaSubjGpa = criteriaSubjGpa;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaSubjGpa(String criteriaSubjGpa) {
        this.criteriaSubjGpa = criteriaSubjGpa;
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

    public HighSchoolInformationHighSchoolSubjects100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolSubjects100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
        sb.append(',');
        sb.append("criteriaSbjcCode");
        sb.append('=');
        sb.append(((this.criteriaSbjcCode == null)?"<null>":this.criteriaSbjcCode));
        sb.append(',');
        sb.append("sorhsbjSbjcCode");
        sb.append('=');
        sb.append(((this.sorhsbjSbjcCode == null)?"<null>":this.sorhsbjSbjcCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSubjYears");
        sb.append('=');
        sb.append(((this.criteriaSubjYears == null)?"<null>":this.criteriaSubjYears));
        sb.append(',');
        sb.append("subjYears");
        sb.append('=');
        sb.append(((this.subjYears == null)?"<null>":this.subjYears));
        sb.append(',');
        sb.append("criteriaGrade");
        sb.append('=');
        sb.append(((this.criteriaGrade == null)?"<null>":this.criteriaGrade));
        sb.append(',');
        sb.append("criteriaSubjGpa");
        sb.append('=');
        sb.append(((this.criteriaSubjGpa == null)?"<null>":this.criteriaSubjGpa));
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
        result = ((result* 31)+((this.criteriaSubjGpa == null)? 0 :this.criteriaSubjGpa.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.criteriaSubjYears == null)? 0 :this.criteriaSubjYears.hashCode()));
        result = ((result* 31)+((this.sorhsbjSbjcCode == null)? 0 :this.sorhsbjSbjcCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaGrade == null)? 0 :this.criteriaGrade.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSbjcCode == null)? 0 :this.criteriaSbjcCode.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolSubjects100PutRequest) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolSubjects100PutRequest rhs = ((HighSchoolInformationHighSchoolSubjects100PutRequest) other);
        return (((((((((((this.criteriaSubjGpa == rhs.criteriaSubjGpa)||((this.criteriaSubjGpa!= null)&&this.criteriaSubjGpa.equals(rhs.criteriaSubjGpa)))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.criteriaSubjYears == rhs.criteriaSubjYears)||((this.criteriaSubjYears!= null)&&this.criteriaSubjYears.equals(rhs.criteriaSubjYears))))&&((this.sorhsbjSbjcCode == rhs.sorhsbjSbjcCode)||((this.sorhsbjSbjcCode!= null)&&this.sorhsbjSbjcCode.equals(rhs.sorhsbjSbjcCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaGrade == rhs.criteriaGrade)||((this.criteriaGrade!= null)&&this.criteriaGrade.equals(rhs.criteriaGrade))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSbjcCode == rhs.criteriaSbjcCode)||((this.criteriaSbjcCode!= null)&&this.criteriaSbjcCode.equals(rhs.criteriaSbjcCode))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))));
    }

}
