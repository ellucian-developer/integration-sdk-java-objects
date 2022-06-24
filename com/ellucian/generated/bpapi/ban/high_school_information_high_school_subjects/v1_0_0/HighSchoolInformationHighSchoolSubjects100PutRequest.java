
package com.ellucian.generated.bpapi.ban.high_school_information_high_school_subjects.v1_0_0;

import java.util.Date;
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
    "criteria.classSize",
    "criteria.admrCode",
    "criteria.collPrepInd",
    "subjGpa",
    "criteria.graduationDate",
    "criteria.gpa",
    "criteria.percentile",
    "criteria.transRecvDate",
    "subjYears",
    "criteria.grade",
    "criteria.subjGpa",
    "criteria.dplmCode",
    "grade",
    "criteria.sbjcCode",
    "sorhsbjSbjcCode",
    "id",
    "criteria.subjYears",
    "criteria.sbgiCode",
    "criteria.classRank"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolSubjects100PutRequest {

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_SIZE")
    private Double criteriaClassSize;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_COLL_PREP_IND")
    private String criteriaCollPrepInd;
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
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date criteriaGraduationDate;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GPA")
    private String criteriaGpa;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_PERCENTILE")
    private Double criteriaPercentile;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_TRANS_RECV_DATE")
    private Date criteriaTransRecvDate;
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
    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String criteriaDplmCode;
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
    private String id;
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
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_SBGI_CODE")
    private String criteriaSbgiCode;
    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_RANK")
    private Double criteriaClassRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    public Double getCriteriaClassSize() {
        return criteriaClassSize;
    }

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    public void setCriteriaClassSize(Double criteriaClassSize) {
        this.criteriaClassSize = criteriaClassSize;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaClassSize(Double criteriaClassSize) {
        this.criteriaClassSize = criteriaClassSize;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    public String getCriteriaCollPrepInd() {
        return criteriaCollPrepInd;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    public void setCriteriaCollPrepInd(String criteriaCollPrepInd) {
        this.criteriaCollPrepInd = criteriaCollPrepInd;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaCollPrepInd(String criteriaCollPrepInd) {
        this.criteriaCollPrepInd = criteriaCollPrepInd;
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
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    public Date getCriteriaGraduationDate() {
        return criteriaGraduationDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    public void setCriteriaGraduationDate(Date criteriaGraduationDate) {
        this.criteriaGraduationDate = criteriaGraduationDate;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaGraduationDate(Date criteriaGraduationDate) {
        this.criteriaGraduationDate = criteriaGraduationDate;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    public String getCriteriaGpa() {
        return criteriaGpa;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    public void setCriteriaGpa(String criteriaGpa) {
        this.criteriaGpa = criteriaGpa;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaGpa(String criteriaGpa) {
        this.criteriaGpa = criteriaGpa;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public Double getCriteriaPercentile() {
        return criteriaPercentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public void setCriteriaPercentile(Double criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaPercentile(Double criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public Date getCriteriaTransRecvDate() {
        return criteriaTransRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public void setCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
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

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    public String getCriteriaDplmCode() {
        return criteriaDplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    public void setCriteriaDplmCode(String criteriaDplmCode) {
        this.criteriaDplmCode = criteriaDplmCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaDplmCode(String criteriaDplmCode) {
        this.criteriaDplmCode = criteriaDplmCode;
        return this;
    }

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
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withId(String id) {
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
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
        return this;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    public Double getCriteriaClassRank() {
        return criteriaClassRank;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    public void setCriteriaClassRank(Double criteriaClassRank) {
        this.criteriaClassRank = criteriaClassRank;
    }

    public HighSchoolInformationHighSchoolSubjects100PutRequest withCriteriaClassRank(Double criteriaClassRank) {
        this.criteriaClassRank = criteriaClassRank;
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
        sb.append("criteriaClassSize");
        sb.append('=');
        sb.append(((this.criteriaClassSize == null)?"<null>":this.criteriaClassSize));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaCollPrepInd");
        sb.append('=');
        sb.append(((this.criteriaCollPrepInd == null)?"<null>":this.criteriaCollPrepInd));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
        sb.append(',');
        sb.append("criteriaGraduationDate");
        sb.append('=');
        sb.append(((this.criteriaGraduationDate == null)?"<null>":this.criteriaGraduationDate));
        sb.append(',');
        sb.append("criteriaGpa");
        sb.append('=');
        sb.append(((this.criteriaGpa == null)?"<null>":this.criteriaGpa));
        sb.append(',');
        sb.append("criteriaPercentile");
        sb.append('=');
        sb.append(((this.criteriaPercentile == null)?"<null>":this.criteriaPercentile));
        sb.append(',');
        sb.append("criteriaTransRecvDate");
        sb.append('=');
        sb.append(((this.criteriaTransRecvDate == null)?"<null>":this.criteriaTransRecvDate));
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
        sb.append("criteriaDplmCode");
        sb.append('=');
        sb.append(((this.criteriaDplmCode == null)?"<null>":this.criteriaDplmCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
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
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
        sb.append(',');
        sb.append("criteriaClassRank");
        sb.append('=');
        sb.append(((this.criteriaClassRank == null)?"<null>":this.criteriaClassRank));
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
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.criteriaSubjYears == null)? 0 :this.criteriaSubjYears.hashCode()));
        result = ((result* 31)+((this.criteriaClassRank == null)? 0 :this.criteriaClassRank.hashCode()));
        result = ((result* 31)+((this.criteriaGpa == null)? 0 :this.criteriaGpa.hashCode()));
        result = ((result* 31)+((this.criteriaGrade == null)? 0 :this.criteriaGrade.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        result = ((result* 31)+((this.criteriaPercentile == null)? 0 :this.criteriaPercentile.hashCode()));
        result = ((result* 31)+((this.criteriaTransRecvDate == null)? 0 :this.criteriaTransRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaClassSize == null)? 0 :this.criteriaClassSize.hashCode()));
        result = ((result* 31)+((this.criteriaCollPrepInd == null)? 0 :this.criteriaCollPrepInd.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.criteriaGraduationDate == null)? 0 :this.criteriaGraduationDate.hashCode()));
        result = ((result* 31)+((this.sorhsbjSbjcCode == null)? 0 :this.sorhsbjSbjcCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDplmCode == null)? 0 :this.criteriaDplmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSbjcCode == null)? 0 :this.criteriaSbjcCode.hashCode()));
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
        return (((((((((((((((((((((this.criteriaSubjGpa == rhs.criteriaSubjGpa)||((this.criteriaSubjGpa!= null)&&this.criteriaSubjGpa.equals(rhs.criteriaSubjGpa)))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.criteriaSubjYears == rhs.criteriaSubjYears)||((this.criteriaSubjYears!= null)&&this.criteriaSubjYears.equals(rhs.criteriaSubjYears))))&&((this.criteriaClassRank == rhs.criteriaClassRank)||((this.criteriaClassRank!= null)&&this.criteriaClassRank.equals(rhs.criteriaClassRank))))&&((this.criteriaGpa == rhs.criteriaGpa)||((this.criteriaGpa!= null)&&this.criteriaGpa.equals(rhs.criteriaGpa))))&&((this.criteriaGrade == rhs.criteriaGrade)||((this.criteriaGrade!= null)&&this.criteriaGrade.equals(rhs.criteriaGrade))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))))&&((this.criteriaPercentile == rhs.criteriaPercentile)||((this.criteriaPercentile!= null)&&this.criteriaPercentile.equals(rhs.criteriaPercentile))))&&((this.criteriaTransRecvDate == rhs.criteriaTransRecvDate)||((this.criteriaTransRecvDate!= null)&&this.criteriaTransRecvDate.equals(rhs.criteriaTransRecvDate))))&&((this.criteriaClassSize == rhs.criteriaClassSize)||((this.criteriaClassSize!= null)&&this.criteriaClassSize.equals(rhs.criteriaClassSize))))&&((this.criteriaCollPrepInd == rhs.criteriaCollPrepInd)||((this.criteriaCollPrepInd!= null)&&this.criteriaCollPrepInd.equals(rhs.criteriaCollPrepInd))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.criteriaGraduationDate == rhs.criteriaGraduationDate)||((this.criteriaGraduationDate!= null)&&this.criteriaGraduationDate.equals(rhs.criteriaGraduationDate))))&&((this.sorhsbjSbjcCode == rhs.sorhsbjSbjcCode)||((this.sorhsbjSbjcCode!= null)&&this.sorhsbjSbjcCode.equals(rhs.sorhsbjSbjcCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDplmCode == rhs.criteriaDplmCode)||((this.criteriaDplmCode!= null)&&this.criteriaDplmCode.equals(rhs.criteriaDplmCode))))&&((this.criteriaSbjcCode == rhs.criteriaSbjcCode)||((this.criteriaSbjcCode!= null)&&this.criteriaSbjcCode.equals(rhs.criteriaSbjcCode))));
    }

}
