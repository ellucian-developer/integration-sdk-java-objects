
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
    "id",
    "sbjcCode",
    "subjYears"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolSubjects100PostRequest {

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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
     * 
     */
    @JsonProperty("sbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String sbjcCode;
    /**
     * Years Taken
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double subjYears;
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

    public HighSchoolInformationHighSchoolSubjects100PostRequest withGrade(String grade) {
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

    public HighSchoolInformationHighSchoolSubjects100PostRequest withSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
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

    public HighSchoolInformationHighSchoolSubjects100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("sbjcCode")
    public void setSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
    }

    public HighSchoolInformationHighSchoolSubjects100PostRequest withSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
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

    public HighSchoolInformationHighSchoolSubjects100PostRequest withSubjYears(Double subjYears) {
        this.subjYears = subjYears;
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

    public HighSchoolInformationHighSchoolSubjects100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolSubjects100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sbjcCode");
        sb.append('=');
        sb.append(((this.sbjcCode == null)?"<null>":this.sbjcCode));
        sb.append(',');
        sb.append("subjYears");
        sb.append('=');
        sb.append(((this.subjYears == null)?"<null>":this.subjYears));
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
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sbjcCode == null)? 0 :this.sbjcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolSubjects100PostRequest) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolSubjects100PostRequest rhs = ((HighSchoolInformationHighSchoolSubjects100PostRequest) other);
        return (((((((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade)))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sbjcCode == rhs.sbjcCode)||((this.sbjcCode!= null)&&this.sbjcCode.equals(rhs.sbjcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))));
    }

}
