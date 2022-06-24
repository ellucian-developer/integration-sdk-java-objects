
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
    "id",
    "sbgiCode",
    "percentile",
    "gpa",
    "graduationDate",
    "dplmCode",
    "transRecvDate",
    "collPrepInd",
    "classRank",
    "classSize",
    "admrCode",
    "sbjcCode",
    "grade",
    "subjYears",
    "subjGpa"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolSubjects100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("sbgiCode")
    private String sbgiCode;
    @JsonProperty("percentile")
    private String percentile;
    @JsonProperty("gpa")
    private String gpa;
    @JsonProperty("graduationDate")
    private String graduationDate;
    @JsonProperty("dplmCode")
    private String dplmCode;
    @JsonProperty("transRecvDate")
    private String transRecvDate;
    @JsonProperty("collPrepInd")
    private String collPrepInd;
    @JsonProperty("classRank")
    private String classRank;
    @JsonProperty("classSize")
    private String classSize;
    @JsonProperty("admrCode")
    private String admrCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String sbjcCode;
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
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double subjYears;
    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_GPA")
    private String subjGpa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withPercentile(String percentile) {
        this.percentile = percentile;
        return this;
    }

    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    @JsonProperty("graduationDate")
    public String getGraduationDate() {
        return graduationDate;
    }

    @JsonProperty("graduationDate")
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }

    @JsonProperty("dplmCode")
    public String getDplmCode() {
        return dplmCode;
    }

    @JsonProperty("dplmCode")
    public void setDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
        return this;
    }

    @JsonProperty("transRecvDate")
    public String getTransRecvDate() {
        return transRecvDate;
    }

    @JsonProperty("transRecvDate")
    public void setTransRecvDate(String transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withTransRecvDate(String transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    @JsonProperty("collPrepInd")
    public String getCollPrepInd() {
        return collPrepInd;
    }

    @JsonProperty("collPrepInd")
    public void setCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    @JsonProperty("classRank")
    public String getClassRank() {
        return classRank;
    }

    @JsonProperty("classRank")
    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withClassRank(String classRank) {
        this.classRank = classRank;
        return this;
    }

    @JsonProperty("classSize")
    public String getClassSize() {
        return classSize;
    }

    @JsonProperty("classSize")
    public void setClassSize(String classSize) {
        this.classSize = classSize;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withClassSize(String classSize) {
        this.classSize = classSize;
        return this;
    }

    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public String getSbjcCode() {
        return sbjcCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public void setSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
    }

    public HighSchoolInformationHighSchoolSubjects100QapiPost withSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
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

    public HighSchoolInformationHighSchoolSubjects100QapiPost withGrade(String grade) {
        this.grade = grade;
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

    public HighSchoolInformationHighSchoolSubjects100QapiPost withSubjYears(Double subjYears) {
        this.subjYears = subjYears;
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

    public HighSchoolInformationHighSchoolSubjects100QapiPost withSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
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

    public HighSchoolInformationHighSchoolSubjects100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolSubjects100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("classRank");
        sb.append('=');
        sb.append(((this.classRank == null)?"<null>":this.classRank));
        sb.append(',');
        sb.append("classSize");
        sb.append('=');
        sb.append(((this.classSize == null)?"<null>":this.classSize));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("sbjcCode");
        sb.append('=');
        sb.append(((this.sbjcCode == null)?"<null>":this.sbjcCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("subjYears");
        sb.append('=');
        sb.append(((this.subjYears == null)?"<null>":this.subjYears));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
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
        result = ((result* 31)+((this.dplmCode == null)? 0 :this.dplmCode.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.sbjcCode == null)? 0 :this.sbjcCode.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolSubjects100QapiPost) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolSubjects100QapiPost rhs = ((HighSchoolInformationHighSchoolSubjects100QapiPost) other);
        return (((((((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.sbjcCode == rhs.sbjcCode)||((this.sbjcCode!= null)&&this.sbjcCode.equals(rhs.sbjcCode))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
