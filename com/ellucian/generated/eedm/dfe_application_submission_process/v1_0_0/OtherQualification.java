
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "qualificationType",
    "subject",
    "grade",
    "awardYear",
    "institutionDetails",
    "equivalencyDetails",
    "awardingBody",
    "startYear"
})
@Generated("jsonschema2pojo")
public class OtherQualification {

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
     * Subject
     * <p>
     * The subject studied.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The subject studied.")
    private String subject;
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

    public OtherQualification withId(Object id) {
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

    public OtherQualification withQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
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

    public OtherQualification withSubject(String subject) {
        this.subject = subject;
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

    public OtherQualification withGrade(String grade) {
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

    public OtherQualification withAwardYear(String awardYear) {
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

    public OtherQualification withInstitutionDetails(String institutionDetails) {
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

    public OtherQualification withEquivalencyDetails(String equivalencyDetails) {
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

    public OtherQualification withAwardingBody(String awardingBody) {
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

    public OtherQualification withStartYear(String startYear) {
        this.startYear = startYear;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OtherQualification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("qualificationType");
        sb.append('=');
        sb.append(((this.qualificationType == null)?"<null>":this.qualificationType));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
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
        result = ((result* 31)+((this.awardYear == null)? 0 :this.awardYear.hashCode()));
        result = ((result* 31)+((this.qualificationType == null)? 0 :this.qualificationType.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.institutionDetails == null)? 0 :this.institutionDetails.hashCode()));
        result = ((result* 31)+((this.equivalencyDetails == null)? 0 :this.equivalencyDetails.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.awardingBody == null)? 0 :this.awardingBody.hashCode()));
        result = ((result* 31)+((this.startYear == null)? 0 :this.startYear.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherQualification) == false) {
            return false;
        }
        OtherQualification rhs = ((OtherQualification) other);
        return ((((((((((this.awardYear == rhs.awardYear)||((this.awardYear!= null)&&this.awardYear.equals(rhs.awardYear)))&&((this.qualificationType == rhs.qualificationType)||((this.qualificationType!= null)&&this.qualificationType.equals(rhs.qualificationType))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.institutionDetails == rhs.institutionDetails)||((this.institutionDetails!= null)&&this.institutionDetails.equals(rhs.institutionDetails))))&&((this.equivalencyDetails == rhs.equivalencyDetails)||((this.equivalencyDetails!= null)&&this.equivalencyDetails.equals(rhs.equivalencyDetails))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.awardingBody == rhs.awardingBody)||((this.awardingBody!= null)&&this.awardingBody.equals(rhs.awardingBody))))&&((this.startYear == rhs.startYear)||((this.startYear!= null)&&this.startYear.equals(rhs.startYear))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
