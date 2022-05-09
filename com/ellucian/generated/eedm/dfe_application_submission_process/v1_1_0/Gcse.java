
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "qualificationType",
    "nonUkQualificationType",
    "subject",
    "subjectCode",
    "grade",
    "awardYear",
    "institutionDetails",
    "equivalencyDetails",
    "awardingBody",
    "startYear",
    "hesaDegreeType",
    "hesaDegreeSubject",
    "hesaDegreeClass",
    "hesaDegreeEstablishment",
    "hesaDegreeCountry",
    "hesaDegreeStartDate",
    "hesaDegreeEndDate"
})
@Generated("jsonschema2pojo")
public class Gcse {

    /**
     * ID
     * <p>
     * The qualification ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The qualification ID in the Apply system.")
    private Object id;
    /**
     * Qualification Type
     * <p>
     * The qualification awarded.
     * 
     */
    @JsonProperty("qualificationType")
    @JsonPropertyDescription("The qualification awarded.")
    private String qualificationType;
    /**
     * Non UK Qualification Type
     * <p>
     * For a qualification of type non_uk, this field will contain a free-text description of the qualification type.
     * 
     */
    @JsonProperty("nonUkQualificationType")
    @JsonPropertyDescription("For a qualification of type non_uk, this field will contain a free-text description of the qualification type.")
    private String nonUkQualificationType;
    /**
     * Subject
     * <p>
     * The subject studied.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The subject studied.")
    private String subject;
    /**
     * Subject Code
     * <p>
     * The HECoS code for the subject studied, if available.
     * 
     */
    @JsonProperty("subjectCode")
    @JsonPropertyDescription("The HECoS code for the subject studied, if available.")
    private String subjectCode;
    /**
     * Grade
     * <p>
     * The grade awarded.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade awarded.")
    private String grade;
    /**
     * Award Year
     * <p>
     * The year the award was made.
     * 
     */
    @JsonProperty("awardYear")
    @JsonPropertyDescription("The year the award was made.")
    private String awardYear;
    /**
     * Institution Details
     * <p>
     * Details about the institution and awarding body.
     * 
     */
    @JsonProperty("institutionDetails")
    @JsonPropertyDescription("Details about the institution and awarding body.")
    private String institutionDetails;
    /**
     * Equivalency Details
     * <p>
     * Details of equivalency, if this qualification was awarded overseas.
     * 
     */
    @JsonProperty("equivalencyDetails")
    @JsonPropertyDescription("Details of equivalency, if this qualification was awarded overseas.")
    private String equivalencyDetails;
    /**
     * Awarding Body
     * <p>
     * Details about the qualification awarding body.
     * 
     */
    @JsonProperty("awardingBody")
    @JsonPropertyDescription("Details about the qualification awarding body.")
    private String awardingBody;
    /**
     * Start Year
     * <p>
     * The year the candidate started qualification.
     * 
     */
    @JsonProperty("startYear")
    @JsonPropertyDescription("The year the candidate started qualification.")
    private String startYear;
    /**
     * HESA Degree Type
     * <p>
     * HESA code for degree type.
     * 
     */
    @JsonProperty("hesaDegreeType")
    @JsonPropertyDescription("HESA code for degree type.")
    private String hesaDegreeType;
    /**
     * HESA Degree Subject
     * <p>
     * HESA code for degree subject.
     * 
     */
    @JsonProperty("hesaDegreeSubject")
    @JsonPropertyDescription("HESA code for degree subject.")
    private String hesaDegreeSubject;
    /**
     * HESA Degree Class
     * <p>
     * HESA code for degree class.
     * 
     */
    @JsonProperty("hesaDegreeClass")
    @JsonPropertyDescription("HESA code for degree class.")
    private String hesaDegreeClass;
    /**
     * HESA Degree Establishment
     * <p>
     * HESA code for degree establishment.
     * 
     */
    @JsonProperty("hesaDegreeEstablishment")
    @JsonPropertyDescription("HESA code for degree establishment.")
    private String hesaDegreeEstablishment;
    /**
     * HESA Degree Country
     * <p>
     * HESA code for degree country.
     * 
     */
    @JsonProperty("hesaDegreeCountry")
    @JsonPropertyDescription("HESA code for degree country.")
    private String hesaDegreeCountry;
    /**
     * HESA Degree Start Date
     * <p>
     * Degree start date.
     * 
     */
    @JsonProperty("hesaDegreeStartDate")
    @JsonPropertyDescription("Degree start date.")
    private Object hesaDegreeStartDate;
    /**
     * HESA Degree End Date
     * <p>
     * Degree End date.
     * 
     */
    @JsonProperty("hesaDegreeEndDate")
    @JsonPropertyDescription("Degree End date.")
    private Object hesaDegreeEndDate;

    /**
     * ID
     * <p>
     * The qualification ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The qualification ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public Gcse withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Qualification Type
     * <p>
     * The qualification awarded.
     * 
     */
    @JsonProperty("qualificationType")
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * Qualification Type
     * <p>
     * The qualification awarded.
     * 
     */
    @JsonProperty("qualificationType")
    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public Gcse withQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }

    /**
     * Non UK Qualification Type
     * <p>
     * For a qualification of type non_uk, this field will contain a free-text description of the qualification type.
     * 
     */
    @JsonProperty("nonUkQualificationType")
    public String getNonUkQualificationType() {
        return nonUkQualificationType;
    }

    /**
     * Non UK Qualification Type
     * <p>
     * For a qualification of type non_uk, this field will contain a free-text description of the qualification type.
     * 
     */
    @JsonProperty("nonUkQualificationType")
    public void setNonUkQualificationType(String nonUkQualificationType) {
        this.nonUkQualificationType = nonUkQualificationType;
    }

    public Gcse withNonUkQualificationType(String nonUkQualificationType) {
        this.nonUkQualificationType = nonUkQualificationType;
        return this;
    }

    /**
     * Subject
     * <p>
     * The subject studied.
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Subject
     * <p>
     * The subject studied.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Gcse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Subject Code
     * <p>
     * The HECoS code for the subject studied, if available.
     * 
     */
    @JsonProperty("subjectCode")
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Subject Code
     * <p>
     * The HECoS code for the subject studied, if available.
     * 
     */
    @JsonProperty("subjectCode")
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Gcse withSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
        return this;
    }

    /**
     * Grade
     * <p>
     * The grade awarded.
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade awarded.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Gcse withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Award Year
     * <p>
     * The year the award was made.
     * 
     */
    @JsonProperty("awardYear")
    public String getAwardYear() {
        return awardYear;
    }

    /**
     * Award Year
     * <p>
     * The year the award was made.
     * 
     */
    @JsonProperty("awardYear")
    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    public Gcse withAwardYear(String awardYear) {
        this.awardYear = awardYear;
        return this;
    }

    /**
     * Institution Details
     * <p>
     * Details about the institution and awarding body.
     * 
     */
    @JsonProperty("institutionDetails")
    public String getInstitutionDetails() {
        return institutionDetails;
    }

    /**
     * Institution Details
     * <p>
     * Details about the institution and awarding body.
     * 
     */
    @JsonProperty("institutionDetails")
    public void setInstitutionDetails(String institutionDetails) {
        this.institutionDetails = institutionDetails;
    }

    public Gcse withInstitutionDetails(String institutionDetails) {
        this.institutionDetails = institutionDetails;
        return this;
    }

    /**
     * Equivalency Details
     * <p>
     * Details of equivalency, if this qualification was awarded overseas.
     * 
     */
    @JsonProperty("equivalencyDetails")
    public String getEquivalencyDetails() {
        return equivalencyDetails;
    }

    /**
     * Equivalency Details
     * <p>
     * Details of equivalency, if this qualification was awarded overseas.
     * 
     */
    @JsonProperty("equivalencyDetails")
    public void setEquivalencyDetails(String equivalencyDetails) {
        this.equivalencyDetails = equivalencyDetails;
    }

    public Gcse withEquivalencyDetails(String equivalencyDetails) {
        this.equivalencyDetails = equivalencyDetails;
        return this;
    }

    /**
     * Awarding Body
     * <p>
     * Details about the qualification awarding body.
     * 
     */
    @JsonProperty("awardingBody")
    public String getAwardingBody() {
        return awardingBody;
    }

    /**
     * Awarding Body
     * <p>
     * Details about the qualification awarding body.
     * 
     */
    @JsonProperty("awardingBody")
    public void setAwardingBody(String awardingBody) {
        this.awardingBody = awardingBody;
    }

    public Gcse withAwardingBody(String awardingBody) {
        this.awardingBody = awardingBody;
        return this;
    }

    /**
     * Start Year
     * <p>
     * The year the candidate started qualification.
     * 
     */
    @JsonProperty("startYear")
    public String getStartYear() {
        return startYear;
    }

    /**
     * Start Year
     * <p>
     * The year the candidate started qualification.
     * 
     */
    @JsonProperty("startYear")
    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public Gcse withStartYear(String startYear) {
        this.startYear = startYear;
        return this;
    }

    /**
     * HESA Degree Type
     * <p>
     * HESA code for degree type.
     * 
     */
    @JsonProperty("hesaDegreeType")
    public String getHesaDegreeType() {
        return hesaDegreeType;
    }

    /**
     * HESA Degree Type
     * <p>
     * HESA code for degree type.
     * 
     */
    @JsonProperty("hesaDegreeType")
    public void setHesaDegreeType(String hesaDegreeType) {
        this.hesaDegreeType = hesaDegreeType;
    }

    public Gcse withHesaDegreeType(String hesaDegreeType) {
        this.hesaDegreeType = hesaDegreeType;
        return this;
    }

    /**
     * HESA Degree Subject
     * <p>
     * HESA code for degree subject.
     * 
     */
    @JsonProperty("hesaDegreeSubject")
    public String getHesaDegreeSubject() {
        return hesaDegreeSubject;
    }

    /**
     * HESA Degree Subject
     * <p>
     * HESA code for degree subject.
     * 
     */
    @JsonProperty("hesaDegreeSubject")
    public void setHesaDegreeSubject(String hesaDegreeSubject) {
        this.hesaDegreeSubject = hesaDegreeSubject;
    }

    public Gcse withHesaDegreeSubject(String hesaDegreeSubject) {
        this.hesaDegreeSubject = hesaDegreeSubject;
        return this;
    }

    /**
     * HESA Degree Class
     * <p>
     * HESA code for degree class.
     * 
     */
    @JsonProperty("hesaDegreeClass")
    public String getHesaDegreeClass() {
        return hesaDegreeClass;
    }

    /**
     * HESA Degree Class
     * <p>
     * HESA code for degree class.
     * 
     */
    @JsonProperty("hesaDegreeClass")
    public void setHesaDegreeClass(String hesaDegreeClass) {
        this.hesaDegreeClass = hesaDegreeClass;
    }

    public Gcse withHesaDegreeClass(String hesaDegreeClass) {
        this.hesaDegreeClass = hesaDegreeClass;
        return this;
    }

    /**
     * HESA Degree Establishment
     * <p>
     * HESA code for degree establishment.
     * 
     */
    @JsonProperty("hesaDegreeEstablishment")
    public String getHesaDegreeEstablishment() {
        return hesaDegreeEstablishment;
    }

    /**
     * HESA Degree Establishment
     * <p>
     * HESA code for degree establishment.
     * 
     */
    @JsonProperty("hesaDegreeEstablishment")
    public void setHesaDegreeEstablishment(String hesaDegreeEstablishment) {
        this.hesaDegreeEstablishment = hesaDegreeEstablishment;
    }

    public Gcse withHesaDegreeEstablishment(String hesaDegreeEstablishment) {
        this.hesaDegreeEstablishment = hesaDegreeEstablishment;
        return this;
    }

    /**
     * HESA Degree Country
     * <p>
     * HESA code for degree country.
     * 
     */
    @JsonProperty("hesaDegreeCountry")
    public String getHesaDegreeCountry() {
        return hesaDegreeCountry;
    }

    /**
     * HESA Degree Country
     * <p>
     * HESA code for degree country.
     * 
     */
    @JsonProperty("hesaDegreeCountry")
    public void setHesaDegreeCountry(String hesaDegreeCountry) {
        this.hesaDegreeCountry = hesaDegreeCountry;
    }

    public Gcse withHesaDegreeCountry(String hesaDegreeCountry) {
        this.hesaDegreeCountry = hesaDegreeCountry;
        return this;
    }

    /**
     * HESA Degree Start Date
     * <p>
     * Degree start date.
     * 
     */
    @JsonProperty("hesaDegreeStartDate")
    public Object getHesaDegreeStartDate() {
        return hesaDegreeStartDate;
    }

    /**
     * HESA Degree Start Date
     * <p>
     * Degree start date.
     * 
     */
    @JsonProperty("hesaDegreeStartDate")
    public void setHesaDegreeStartDate(Object hesaDegreeStartDate) {
        this.hesaDegreeStartDate = hesaDegreeStartDate;
    }

    public Gcse withHesaDegreeStartDate(Object hesaDegreeStartDate) {
        this.hesaDegreeStartDate = hesaDegreeStartDate;
        return this;
    }

    /**
     * HESA Degree End Date
     * <p>
     * Degree End date.
     * 
     */
    @JsonProperty("hesaDegreeEndDate")
    public Object getHesaDegreeEndDate() {
        return hesaDegreeEndDate;
    }

    /**
     * HESA Degree End Date
     * <p>
     * Degree End date.
     * 
     */
    @JsonProperty("hesaDegreeEndDate")
    public void setHesaDegreeEndDate(Object hesaDegreeEndDate) {
        this.hesaDegreeEndDate = hesaDegreeEndDate;
    }

    public Gcse withHesaDegreeEndDate(Object hesaDegreeEndDate) {
        this.hesaDegreeEndDate = hesaDegreeEndDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gcse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("qualificationType");
        sb.append('=');
        sb.append(((this.qualificationType == null)?"<null>":this.qualificationType));
        sb.append(',');
        sb.append("nonUkQualificationType");
        sb.append('=');
        sb.append(((this.nonUkQualificationType == null)?"<null>":this.nonUkQualificationType));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("subjectCode");
        sb.append('=');
        sb.append(((this.subjectCode == null)?"<null>":this.subjectCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("awardYear");
        sb.append('=');
        sb.append(((this.awardYear == null)?"<null>":this.awardYear));
        sb.append(',');
        sb.append("institutionDetails");
        sb.append('=');
        sb.append(((this.institutionDetails == null)?"<null>":this.institutionDetails));
        sb.append(',');
        sb.append("equivalencyDetails");
        sb.append('=');
        sb.append(((this.equivalencyDetails == null)?"<null>":this.equivalencyDetails));
        sb.append(',');
        sb.append("awardingBody");
        sb.append('=');
        sb.append(((this.awardingBody == null)?"<null>":this.awardingBody));
        sb.append(',');
        sb.append("startYear");
        sb.append('=');
        sb.append(((this.startYear == null)?"<null>":this.startYear));
        sb.append(',');
        sb.append("hesaDegreeType");
        sb.append('=');
        sb.append(((this.hesaDegreeType == null)?"<null>":this.hesaDegreeType));
        sb.append(',');
        sb.append("hesaDegreeSubject");
        sb.append('=');
        sb.append(((this.hesaDegreeSubject == null)?"<null>":this.hesaDegreeSubject));
        sb.append(',');
        sb.append("hesaDegreeClass");
        sb.append('=');
        sb.append(((this.hesaDegreeClass == null)?"<null>":this.hesaDegreeClass));
        sb.append(',');
        sb.append("hesaDegreeEstablishment");
        sb.append('=');
        sb.append(((this.hesaDegreeEstablishment == null)?"<null>":this.hesaDegreeEstablishment));
        sb.append(',');
        sb.append("hesaDegreeCountry");
        sb.append('=');
        sb.append(((this.hesaDegreeCountry == null)?"<null>":this.hesaDegreeCountry));
        sb.append(',');
        sb.append("hesaDegreeStartDate");
        sb.append('=');
        sb.append(((this.hesaDegreeStartDate == null)?"<null>":this.hesaDegreeStartDate));
        sb.append(',');
        sb.append("hesaDegreeEndDate");
        sb.append('=');
        sb.append(((this.hesaDegreeEndDate == null)?"<null>":this.hesaDegreeEndDate));
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
        result = ((result* 31)+((this.hesaDegreeType == null)? 0 :this.hesaDegreeType.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.institutionDetails == null)? 0 :this.institutionDetails.hashCode()));
        result = ((result* 31)+((this.equivalencyDetails == null)? 0 :this.equivalencyDetails.hashCode()));
        result = ((result* 31)+((this.startYear == null)? 0 :this.startYear.hashCode()));
        result = ((result* 31)+((this.hesaDegreeClass == null)? 0 :this.hesaDegreeClass.hashCode()));
        result = ((result* 31)+((this.hesaDegreeSubject == null)? 0 :this.hesaDegreeSubject.hashCode()));
        result = ((result* 31)+((this.awardYear == null)? 0 :this.awardYear.hashCode()));
        result = ((result* 31)+((this.qualificationType == null)? 0 :this.qualificationType.hashCode()));
        result = ((result* 31)+((this.hesaDegreeEndDate == null)? 0 :this.hesaDegreeEndDate.hashCode()));
        result = ((result* 31)+((this.hesaDegreeStartDate == null)? 0 :this.hesaDegreeStartDate.hashCode()));
        result = ((result* 31)+((this.hesaDegreeCountry == null)? 0 :this.hesaDegreeCountry.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.awardingBody == null)? 0 :this.awardingBody.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.hesaDegreeEstablishment == null)? 0 :this.hesaDegreeEstablishment.hashCode()));
        result = ((result* 31)+((this.nonUkQualificationType == null)? 0 :this.nonUkQualificationType.hashCode()));
        result = ((result* 31)+((this.subjectCode == null)? 0 :this.subjectCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gcse) == false) {
            return false;
        }
        Gcse rhs = ((Gcse) other);
        return (((((((((((((((((((this.hesaDegreeType == rhs.hesaDegreeType)||((this.hesaDegreeType!= null)&&this.hesaDegreeType.equals(rhs.hesaDegreeType)))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.institutionDetails == rhs.institutionDetails)||((this.institutionDetails!= null)&&this.institutionDetails.equals(rhs.institutionDetails))))&&((this.equivalencyDetails == rhs.equivalencyDetails)||((this.equivalencyDetails!= null)&&this.equivalencyDetails.equals(rhs.equivalencyDetails))))&&((this.startYear == rhs.startYear)||((this.startYear!= null)&&this.startYear.equals(rhs.startYear))))&&((this.hesaDegreeClass == rhs.hesaDegreeClass)||((this.hesaDegreeClass!= null)&&this.hesaDegreeClass.equals(rhs.hesaDegreeClass))))&&((this.hesaDegreeSubject == rhs.hesaDegreeSubject)||((this.hesaDegreeSubject!= null)&&this.hesaDegreeSubject.equals(rhs.hesaDegreeSubject))))&&((this.awardYear == rhs.awardYear)||((this.awardYear!= null)&&this.awardYear.equals(rhs.awardYear))))&&((this.qualificationType == rhs.qualificationType)||((this.qualificationType!= null)&&this.qualificationType.equals(rhs.qualificationType))))&&((this.hesaDegreeEndDate == rhs.hesaDegreeEndDate)||((this.hesaDegreeEndDate!= null)&&this.hesaDegreeEndDate.equals(rhs.hesaDegreeEndDate))))&&((this.hesaDegreeStartDate == rhs.hesaDegreeStartDate)||((this.hesaDegreeStartDate!= null)&&this.hesaDegreeStartDate.equals(rhs.hesaDegreeStartDate))))&&((this.hesaDegreeCountry == rhs.hesaDegreeCountry)||((this.hesaDegreeCountry!= null)&&this.hesaDegreeCountry.equals(rhs.hesaDegreeCountry))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.awardingBody == rhs.awardingBody)||((this.awardingBody!= null)&&this.awardingBody.equals(rhs.awardingBody))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.hesaDegreeEstablishment == rhs.hesaDegreeEstablishment)||((this.hesaDegreeEstablishment!= null)&&this.hesaDegreeEstablishment.equals(rhs.hesaDegreeEstablishment))))&&((this.nonUkQualificationType == rhs.nonUkQualificationType)||((this.nonUkQualificationType!= null)&&this.nonUkQualificationType.equals(rhs.nonUkQualificationType))))&&((this.subjectCode == rhs.subjectCode)||((this.subjectCode!= null)&&this.subjectCode.equals(rhs.subjectCode))));
    }

}
