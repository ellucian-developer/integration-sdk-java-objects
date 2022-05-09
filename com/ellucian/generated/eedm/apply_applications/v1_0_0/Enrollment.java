
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

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
 * The applicant's enrollment information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "academicPrograms",
    "major",
    "secondaryMajor",
    "minor",
    "concentration",
    "academicPeriod",
    "studentType",
    "campusLocations",
    "applicationType",
    "admissionType",
    "academicLoad",
    "educationalGoals"
})
@Generated("jsonschema2pojo")
public class Enrollment {

    /**
     * Academic Programs
     * <p>
     * The academic programs to which the applicant is applying
     * 
     */
    @JsonProperty("academicPrograms")
    @JsonPropertyDescription("The academic programs to which the applicant is applying")
    private List<AcademicProgram> academicPrograms = new ArrayList<AcademicProgram>();
    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    @JsonPropertyDescription("The applicant's proposed major course of study.")
    private Object major;
    /**
     * Secondary Major
     * <p>
     * The applicant's secondary major.
     * 
     */
    @JsonProperty("secondaryMajor")
    @JsonPropertyDescription("The applicant's secondary major.")
    private Object secondaryMajor;
    /**
     * Minor
     * <p>
     * The applicant's minor.
     * 
     */
    @JsonProperty("minor")
    @JsonPropertyDescription("The applicant's minor.")
    private Object minor;
    /**
     * Concentration
     * <p>
     * The applicant's concentration.
     * 
     */
    @JsonProperty("concentration")
    @JsonPropertyDescription("The applicant's concentration.")
    private Object concentration;
    /**
     * Academic Period
     * <p>
     * The academic period for the which the applicant is applying.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for the which the applicant is applying.")
    private Object academicPeriod;
    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    @JsonPropertyDescription("The student type.")
    private Object studentType;
    /**
     * Campus Locations
     * <p>
     * The locations of the campuses to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocations")
    @JsonPropertyDescription("The locations of the campuses to which the applicant is applying")
    private List<CampusLocation> campusLocations = new ArrayList<CampusLocation>();
    /**
     * Application Type
     * <p>
     * The type code for this application
     * 
     */
    @JsonProperty("applicationType")
    @JsonPropertyDescription("The type code for this application")
    private String applicationType;
    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    @JsonPropertyDescription("The type of admission the applicant is requesting.")
    private Object admissionType;
    /**
     * Academic Load
     * <p>
     * The applicant's proposed academic load.
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The applicant's proposed academic load.")
    private Object academicLoad;
    /**
     * Educational Goals
     * <p>
     * The applicant's educational goals.
     * 
     */
    @JsonProperty("educationalGoals")
    @JsonPropertyDescription("The applicant's educational goals.")
    private List<EducationalGoal> educationalGoals = new ArrayList<EducationalGoal>();

    /**
     * Academic Programs
     * <p>
     * The academic programs to which the applicant is applying
     * 
     */
    @JsonProperty("academicPrograms")
    public List<AcademicProgram> getAcademicPrograms() {
        return academicPrograms;
    }

    /**
     * Academic Programs
     * <p>
     * The academic programs to which the applicant is applying
     * 
     */
    @JsonProperty("academicPrograms")
    public void setAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
    }

    public Enrollment withAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
        return this;
    }

    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    public Object getMajor() {
        return major;
    }

    /**
     * Major
     * <p>
     * The applicant's proposed major course of study.
     * 
     */
    @JsonProperty("major")
    public void setMajor(Object major) {
        this.major = major;
    }

    public Enrollment withMajor(Object major) {
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
    public Object getSecondaryMajor() {
        return secondaryMajor;
    }

    /**
     * Secondary Major
     * <p>
     * The applicant's secondary major.
     * 
     */
    @JsonProperty("secondaryMajor")
    public void setSecondaryMajor(Object secondaryMajor) {
        this.secondaryMajor = secondaryMajor;
    }

    public Enrollment withSecondaryMajor(Object secondaryMajor) {
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
    public Object getMinor() {
        return minor;
    }

    /**
     * Minor
     * <p>
     * The applicant's minor.
     * 
     */
    @JsonProperty("minor")
    public void setMinor(Object minor) {
        this.minor = minor;
    }

    public Enrollment withMinor(Object minor) {
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
    public Object getConcentration() {
        return concentration;
    }

    /**
     * Concentration
     * <p>
     * The applicant's concentration.
     * 
     */
    @JsonProperty("concentration")
    public void setConcentration(Object concentration) {
        this.concentration = concentration;
    }

    public Enrollment withConcentration(Object concentration) {
        this.concentration = concentration;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for the which the applicant is applying.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for the which the applicant is applying.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public Enrollment withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    public Object getStudentType() {
        return studentType;
    }

    /**
     * Student Type
     * <p>
     * The student type.
     * 
     */
    @JsonProperty("studentType")
    public void setStudentType(Object studentType) {
        this.studentType = studentType;
    }

    public Enrollment withStudentType(Object studentType) {
        this.studentType = studentType;
        return this;
    }

    /**
     * Campus Locations
     * <p>
     * The locations of the campuses to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocations")
    public List<CampusLocation> getCampusLocations() {
        return campusLocations;
    }

    /**
     * Campus Locations
     * <p>
     * The locations of the campuses to which the applicant is applying
     * 
     */
    @JsonProperty("campusLocations")
    public void setCampusLocations(List<CampusLocation> campusLocations) {
        this.campusLocations = campusLocations;
    }

    public Enrollment withCampusLocations(List<CampusLocation> campusLocations) {
        this.campusLocations = campusLocations;
        return this;
    }

    /**
     * Application Type
     * <p>
     * The type code for this application
     * 
     */
    @JsonProperty("applicationType")
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Application Type
     * <p>
     * The type code for this application
     * 
     */
    @JsonProperty("applicationType")
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public Enrollment withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    public Object getAdmissionType() {
        return admissionType;
    }

    /**
     * Admission Type
     * <p>
     * The type of admission the applicant is requesting.
     * 
     */
    @JsonProperty("admissionType")
    public void setAdmissionType(Object admissionType) {
        this.admissionType = admissionType;
    }

    public Enrollment withAdmissionType(Object admissionType) {
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
    public Object getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The applicant's proposed academic load.
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
    }

    public Enrollment withAcademicLoad(Object academicLoad) {
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
    public List<EducationalGoal> getEducationalGoals() {
        return educationalGoals;
    }

    /**
     * Educational Goals
     * <p>
     * The applicant's educational goals.
     * 
     */
    @JsonProperty("educationalGoals")
    public void setEducationalGoals(List<EducationalGoal> educationalGoals) {
        this.educationalGoals = educationalGoals;
    }

    public Enrollment withEducationalGoals(List<EducationalGoal> educationalGoals) {
        this.educationalGoals = educationalGoals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Enrollment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicPrograms");
        sb.append('=');
        sb.append(((this.academicPrograms == null)?"<null>":this.academicPrograms));
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
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("studentType");
        sb.append('=');
        sb.append(((this.studentType == null)?"<null>":this.studentType));
        sb.append(',');
        sb.append("campusLocations");
        sb.append('=');
        sb.append(((this.campusLocations == null)?"<null>":this.campusLocations));
        sb.append(',');
        sb.append("applicationType");
        sb.append('=');
        sb.append(((this.applicationType == null)?"<null>":this.applicationType));
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
        result = ((result* 31)+((this.campusLocations == null)? 0 :this.campusLocations.hashCode()));
        result = ((result* 31)+((this.studentType == null)? 0 :this.studentType.hashCode()));
        result = ((result* 31)+((this.educationalGoals == null)? 0 :this.educationalGoals.hashCode()));
        result = ((result* 31)+((this.applicationType == null)? 0 :this.applicationType.hashCode()));
        result = ((result* 31)+((this.academicPrograms == null)? 0 :this.academicPrograms.hashCode()));
        result = ((result* 31)+((this.minor == null)? 0 :this.minor.hashCode()));
        result = ((result* 31)+((this.concentration == null)? 0 :this.concentration.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.secondaryMajor == null)? 0 :this.secondaryMajor.hashCode()));
        result = ((result* 31)+((this.major == null)? 0 :this.major.hashCode()));
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
        return (((((((((((((this.campusLocations == rhs.campusLocations)||((this.campusLocations!= null)&&this.campusLocations.equals(rhs.campusLocations)))&&((this.studentType == rhs.studentType)||((this.studentType!= null)&&this.studentType.equals(rhs.studentType))))&&((this.educationalGoals == rhs.educationalGoals)||((this.educationalGoals!= null)&&this.educationalGoals.equals(rhs.educationalGoals))))&&((this.applicationType == rhs.applicationType)||((this.applicationType!= null)&&this.applicationType.equals(rhs.applicationType))))&&((this.academicPrograms == rhs.academicPrograms)||((this.academicPrograms!= null)&&this.academicPrograms.equals(rhs.academicPrograms))))&&((this.minor == rhs.minor)||((this.minor!= null)&&this.minor.equals(rhs.minor))))&&((this.concentration == rhs.concentration)||((this.concentration!= null)&&this.concentration.equals(rhs.concentration))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.secondaryMajor == rhs.secondaryMajor)||((this.secondaryMajor!= null)&&this.secondaryMajor.equals(rhs.secondaryMajor))))&&((this.major == rhs.major)||((this.major!= null)&&this.major.equals(rhs.major))))&&((this.admissionType == rhs.admissionType)||((this.admissionType!= null)&&this.admissionType.equals(rhs.admissionType))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
