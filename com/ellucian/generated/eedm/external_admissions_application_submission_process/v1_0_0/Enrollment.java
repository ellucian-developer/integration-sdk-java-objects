
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Enrollment
 * <p>
 * The applicant's enrollment information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "term",
    "major",
    "secondaryMajor",
    "minor",
    "concentration",
    "studentType",
    "campusLocation",
    "admissionType",
    "academicLoad",
    "educationalGoals"
})
@Generated("jsonschema2pojo")
public class Enrollment {

    /**
     * Term
     * <p>
     * The term for which the applicant is applying.
     * (Required)
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("The term for which the applicant is applying.")
    private String term;
    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    @JsonPropertyDescription("The applicant's proposed major course of study.")
    private String major;
    /**
     * Secondary Major
     * <p>
     * The applicant's secondary major.
     * 
     */
    @JsonProperty("secondaryMajor")
    @JsonPropertyDescription("The applicant's secondary major.")
    private String secondaryMajor;
    /**
     * Minor
     * <p>
     * The applicant's minor.
     * 
     */
    @JsonProperty("minor")
    @JsonPropertyDescription("The applicant's minor.")
    private String minor;
    /**
     * Concentration
     * <p>
     * The applicant's concentration.
     * 
     */
    @JsonProperty("concentration")
    @JsonPropertyDescription("The applicant's concentration.")
    private String concentration;
    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    @JsonPropertyDescription("The student type.")
    private String studentType;
    /**
     * Campus Location
     * <p>
     * The location of the campus to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocation")
    @JsonPropertyDescription("The location of the campus to which the applicant is applying")
    private String campusLocation;
    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    @JsonPropertyDescription("The type of admission the applicant is requesting.")
    private String admissionType;
    /**
     * Academic Load
     * <p>
     * The applicant's proposed academic load.
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The applicant's proposed academic load.")
    private String academicLoad;
    /**
     * Educational Goals
     * <p>
     * The applicant's educational goals.
     * 
     */
    @JsonProperty("educationalGoals")
    @JsonPropertyDescription("The applicant's educational goals.")
    private List<String> educationalGoals = new ArrayList<String>();

    /**
     * Term
     * <p>
     * The term for which the applicant is applying.
     * (Required)
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * The term for which the applicant is applying.
     * (Required)
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public Enrollment withTerm(String term) {
        this.term = term;
        return this;
    }

    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    public String getMajor() {
        return major;
    }

    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    public void setMajor(String major) {
        this.major = major;
    }

    public Enrollment withMajor(String major) {
        this.major = major;
        return this;
    }

    /**
     * Secondary Major
     * <p>
     * The applicant's secondary major.
     * 
     */
    @JsonProperty("secondaryMajor")
    public String getSecondaryMajor() {
        return secondaryMajor;
    }

    /**
     * Secondary Major
     * <p>
     * The applicant's secondary major.
     * 
     */
    @JsonProperty("secondaryMajor")
    public void setSecondaryMajor(String secondaryMajor) {
        this.secondaryMajor = secondaryMajor;
    }

    public Enrollment withSecondaryMajor(String secondaryMajor) {
        this.secondaryMajor = secondaryMajor;
        return this;
    }

    /**
     * Minor
     * <p>
     * The applicant's minor.
     * 
     */
    @JsonProperty("minor")
    public String getMinor() {
        return minor;
    }

    /**
     * Minor
     * <p>
     * The applicant's minor.
     * 
     */
    @JsonProperty("minor")
    public void setMinor(String minor) {
        this.minor = minor;
    }

    public Enrollment withMinor(String minor) {
        this.minor = minor;
        return this;
    }

    /**
     * Concentration
     * <p>
     * The applicant's concentration.
     * 
     */
    @JsonProperty("concentration")
    public String getConcentration() {
        return concentration;
    }

    /**
     * Concentration
     * <p>
     * The applicant's concentration.
     * 
     */
    @JsonProperty("concentration")
    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public Enrollment withConcentration(String concentration) {
        this.concentration = concentration;
        return this;
    }

    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    public String getStudentType() {
        return studentType;
    }

    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public Enrollment withStudentType(String studentType) {
        this.studentType = studentType;
        return this;
    }

    /**
     * Campus Location
     * <p>
     * The location of the campus to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocation")
    public String getCampusLocation() {
        return campusLocation;
    }

    /**
     * Campus Location
     * <p>
     * The location of the campus to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocation")
    public void setCampusLocation(String campusLocation) {
        this.campusLocation = campusLocation;
    }

    public Enrollment withCampusLocation(String campusLocation) {
        this.campusLocation = campusLocation;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    public String getAdmissionType() {
        return admissionType;
    }

    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public Enrollment withAdmissionType(String admissionType) {
        this.admissionType = admissionType;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The applicant's proposed academic load.
     * 
     */
    @JsonProperty("academicLoad")
    public String getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The applicant's proposed academic load.
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(String academicLoad) {
        this.academicLoad = academicLoad;
    }

    public Enrollment withAcademicLoad(String academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Educational Goals
     * <p>
     * The applicant's educational goals.
     * 
     */
    @JsonProperty("educationalGoals")
    public List<String> getEducationalGoals() {
        return educationalGoals;
    }

    /**
     * Educational Goals
     * <p>
     * The applicant's educational goals.
     * 
     */
    @JsonProperty("educationalGoals")
    public void setEducationalGoals(List<String> educationalGoals) {
        this.educationalGoals = educationalGoals;
    }

    public Enrollment withEducationalGoals(List<String> educationalGoals) {
        this.educationalGoals = educationalGoals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Enrollment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("major");
        sb.append('=');
        sb.append(((this.major == null)?"<null>":this.major));
        sb.append(',');
        sb.append("secondaryMajor");
        sb.append('=');
        sb.append(((this.secondaryMajor == null)?"<null>":this.secondaryMajor));
        sb.append(',');
        sb.append("minor");
        sb.append('=');
        sb.append(((this.minor == null)?"<null>":this.minor));
        sb.append(',');
        sb.append("concentration");
        sb.append('=');
        sb.append(((this.concentration == null)?"<null>":this.concentration));
        sb.append(',');
        sb.append("studentType");
        sb.append('=');
        sb.append(((this.studentType == null)?"<null>":this.studentType));
        sb.append(',');
        sb.append("campusLocation");
        sb.append('=');
        sb.append(((this.campusLocation == null)?"<null>":this.campusLocation));
        sb.append(',');
        sb.append("admissionType");
        sb.append('=');
        sb.append(((this.admissionType == null)?"<null>":this.admissionType));
        sb.append(',');
        sb.append("academicLoad");
        sb.append('=');
        sb.append(((this.academicLoad == null)?"<null>":this.academicLoad));
        sb.append(',');
        sb.append("educationalGoals");
        sb.append('=');
        sb.append(((this.educationalGoals == null)?"<null>":this.educationalGoals));
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
        result = ((result* 31)+((this.campusLocation == null)? 0 :this.campusLocation.hashCode()));
        result = ((result* 31)+((this.studentType == null)? 0 :this.studentType.hashCode()));
        result = ((result* 31)+((this.educationalGoals == null)? 0 :this.educationalGoals.hashCode()));
        result = ((result* 31)+((this.secondaryMajor == null)? 0 :this.secondaryMajor.hashCode()));
        result = ((result* 31)+((this.major == null)? 0 :this.major.hashCode()));
        result = ((result* 31)+((this.minor == null)? 0 :this.minor.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.concentration == null)? 0 :this.concentration.hashCode()));
        result = ((result* 31)+((this.admissionType == null)? 0 :this.admissionType.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Enrollment) == false) {
            return false;
        }
        Enrollment rhs = ((Enrollment) other);
        return (((((((((((this.campusLocation == rhs.campusLocation)||((this.campusLocation!= null)&&this.campusLocation.equals(rhs.campusLocation)))&&((this.studentType == rhs.studentType)||((this.studentType!= null)&&this.studentType.equals(rhs.studentType))))&&((this.educationalGoals == rhs.educationalGoals)||((this.educationalGoals!= null)&&this.educationalGoals.equals(rhs.educationalGoals))))&&((this.secondaryMajor == rhs.secondaryMajor)||((this.secondaryMajor!= null)&&this.secondaryMajor.equals(rhs.secondaryMajor))))&&((this.major == rhs.major)||((this.major!= null)&&this.major.equals(rhs.major))))&&((this.minor == rhs.minor)||((this.minor!= null)&&this.minor.equals(rhs.minor))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.concentration == rhs.concentration)||((this.concentration!= null)&&this.concentration.equals(rhs.concentration))))&&((this.admissionType == rhs.admissionType)||((this.admissionType!= null)&&this.admissionType.equals(rhs.admissionType))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
