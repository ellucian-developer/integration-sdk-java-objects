
package com.ellucian.generated.eedm.student_academic_programs_replacements.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * New Program
 * <p>
 * The student's new academic program.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "detail",
    "curriculumObjective",
    "programOwner",
    "site",
    "catalog",
    "academicLevel",
    "credentials",
    "disciplines",
    "startOn",
    "endOn",
    "academicPeriods",
    "enrollmentStatus",
    "expectedGraduationDate",
    "admissionClassification"
})
@Generated("jsonschema2pojo")
public class NewProgram {

    /**
     * Detail
     * <p>
     * The detail of the student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The detail of the student's new academic program.")
    private Detail detail;
    /**
     * Curriculum Objective
     * <p>
     * The curriculum objective associated with the student's academic program.
     * (Required)
     * 
     */
    @JsonProperty("curriculumObjective")
    @JsonPropertyDescription("The curriculum objective associated with the student's academic program.")
    private NewProgram.CurriculumObjective curriculumObjective;
    /**
     * Program Owner
     * <p>
     * The owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    @JsonPropertyDescription("The owner of the academic program.")
    private Object programOwner;
    /**
     * Site
     * <p>
     * The site (campus) at which the student is enrolled in the program.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The site (campus) at which the student is enrolled in the program.")
    private Object site;
    /**
     * Academic Catalog
     * <p>
     * The academic catalog that defines the requirements for a student's enrollment in a program.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    @JsonPropertyDescription("The academic catalog that defines the requirements for a student's enrollment in a program.")
    private Catalog catalog;
    /**
     * Academic Level
     * <p>
     * The academic level associated with the enrollment of the student in the academic program.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the enrollment of the student in the academic program.")
    private Object academicLevel;
    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("The academic credentials that can be awarded for completing an academic program.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Disciplines
     * <p>
     * The academic disciplines offered as part of the academic program.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines offered as part of the academic program.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    /**
     * Start Date
     * <p>
     * The date on which an academic program begins.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which an academic program begins.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date on which an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date on which an academic program ends.")
    private Object endOn;
    /**
     * Academic Periods
     * <p>
     * Various academic periods related to a student's progression in a program.
     * 
     */
    @JsonProperty("academicPeriods")
    @JsonPropertyDescription("Various academic periods related to a student's progression in a program.")
    private AcademicPeriods academicPeriods;
    /**
     * Enrollment Status
     * <p>
     * The current state of a student's academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    @JsonPropertyDescription("The current state of a student's academic program enrollment.")
    private EnrollmentStatus enrollmentStatus;
    /**
     * Expected Graduation Date
     * <p>
     * The date on which the student is expected to graduate from the academic program.
     * 
     */
    @JsonProperty("expectedGraduationDate")
    @JsonPropertyDescription("The date on which the student is expected to graduate from the academic program.")
    private Object expectedGraduationDate;
    /**
     * Admission Classification
     * <p>
     * The admission classification and/or the type typically captured upon admission to the program.
     * 
     */
    @JsonProperty("admissionClassification")
    @JsonPropertyDescription("The admission classification and/or the type typically captured upon admission to the program.")
    private AdmissionClassification admissionClassification;

    /**
     * Detail
     * <p>
     * The detail of the student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The detail of the student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public NewProgram withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Curriculum Objective
     * <p>
     * The curriculum objective associated with the student's academic program.
     * (Required)
     * 
     */
    @JsonProperty("curriculumObjective")
    public NewProgram.CurriculumObjective getCurriculumObjective() {
        return curriculumObjective;
    }

    /**
     * Curriculum Objective
     * <p>
     * The curriculum objective associated with the student's academic program.
     * (Required)
     * 
     */
    @JsonProperty("curriculumObjective")
    public void setCurriculumObjective(NewProgram.CurriculumObjective curriculumObjective) {
        this.curriculumObjective = curriculumObjective;
    }

    public NewProgram withCurriculumObjective(NewProgram.CurriculumObjective curriculumObjective) {
        this.curriculumObjective = curriculumObjective;
        return this;
    }

    /**
     * Program Owner
     * <p>
     * The owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    public Object getProgramOwner() {
        return programOwner;
    }

    /**
     * Program Owner
     * <p>
     * The owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    public void setProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
    }

    public NewProgram withProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
        return this;
    }

    /**
     * Site
     * <p>
     * The site (campus) at which the student is enrolled in the program.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The site (campus) at which the student is enrolled in the program.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public NewProgram withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Academic Catalog
     * <p>
     * The academic catalog that defines the requirements for a student's enrollment in a program.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public Catalog getCatalog() {
        return catalog;
    }

    /**
     * Academic Catalog
     * <p>
     * The academic catalog that defines the requirements for a student's enrollment in a program.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public NewProgram withCatalog(Catalog catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the enrollment of the student in the academic program.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the enrollment of the student in the academic program.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public NewProgram withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public NewProgram withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines offered as part of the academic program.
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines offered as part of the academic program.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public NewProgram withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date on which an academic program begins.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date on which an academic program begins.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public NewProgram withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date on which an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date on which an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public NewProgram withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Academic Periods
     * <p>
     * Various academic periods related to a student's progression in a program.
     * 
     */
    @JsonProperty("academicPeriods")
    public AcademicPeriods getAcademicPeriods() {
        return academicPeriods;
    }

    /**
     * Academic Periods
     * <p>
     * Various academic periods related to a student's progression in a program.
     * 
     */
    @JsonProperty("academicPeriods")
    public void setAcademicPeriods(AcademicPeriods academicPeriods) {
        this.academicPeriods = academicPeriods;
    }

    public NewProgram withAcademicPeriods(AcademicPeriods academicPeriods) {
        this.academicPeriods = academicPeriods;
        return this;
    }

    /**
     * Enrollment Status
     * <p>
     * The current state of a student's academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    public EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Enrollment Status
     * <p>
     * The current state of a student's academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    public void setEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public NewProgram withEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }

    /**
     * Expected Graduation Date
     * <p>
     * The date on which the student is expected to graduate from the academic program.
     * 
     */
    @JsonProperty("expectedGraduationDate")
    public Object getExpectedGraduationDate() {
        return expectedGraduationDate;
    }

    /**
     * Expected Graduation Date
     * <p>
     * The date on which the student is expected to graduate from the academic program.
     * 
     */
    @JsonProperty("expectedGraduationDate")
    public void setExpectedGraduationDate(Object expectedGraduationDate) {
        this.expectedGraduationDate = expectedGraduationDate;
    }

    public NewProgram withExpectedGraduationDate(Object expectedGraduationDate) {
        this.expectedGraduationDate = expectedGraduationDate;
        return this;
    }

    /**
     * Admission Classification
     * <p>
     * The admission classification and/or the type typically captured upon admission to the program.
     * 
     */
    @JsonProperty("admissionClassification")
    public AdmissionClassification getAdmissionClassification() {
        return admissionClassification;
    }

    /**
     * Admission Classification
     * <p>
     * The admission classification and/or the type typically captured upon admission to the program.
     * 
     */
    @JsonProperty("admissionClassification")
    public void setAdmissionClassification(AdmissionClassification admissionClassification) {
        this.admissionClassification = admissionClassification;
    }

    public NewProgram withAdmissionClassification(AdmissionClassification admissionClassification) {
        this.admissionClassification = admissionClassification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NewProgram.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("curriculumObjective");
        sb.append('=');
        sb.append(((this.curriculumObjective == null)?"<null>":this.curriculumObjective));
        sb.append(',');
        sb.append("programOwner");
        sb.append('=');
        sb.append(((this.programOwner == null)?"<null>":this.programOwner));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("academicPeriods");
        sb.append('=');
        sb.append(((this.academicPeriods == null)?"<null>":this.academicPeriods));
        sb.append(',');
        sb.append("enrollmentStatus");
        sb.append('=');
        sb.append(((this.enrollmentStatus == null)?"<null>":this.enrollmentStatus));
        sb.append(',');
        sb.append("expectedGraduationDate");
        sb.append('=');
        sb.append(((this.expectedGraduationDate == null)?"<null>":this.expectedGraduationDate));
        sb.append(',');
        sb.append("admissionClassification");
        sb.append('=');
        sb.append(((this.admissionClassification == null)?"<null>":this.admissionClassification));
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
        result = ((result* 31)+((this.expectedGraduationDate == null)? 0 :this.expectedGraduationDate.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.curriculumObjective == null)? 0 :this.curriculumObjective.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.programOwner == null)? 0 :this.programOwner.hashCode()));
        result = ((result* 31)+((this.academicPeriods == null)? 0 :this.academicPeriods.hashCode()));
        result = ((result* 31)+((this.admissionClassification == null)? 0 :this.admissionClassification.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.enrollmentStatus == null)? 0 :this.enrollmentStatus.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewProgram) == false) {
            return false;
        }
        NewProgram rhs = ((NewProgram) other);
        return (((((((((((((((this.expectedGraduationDate == rhs.expectedGraduationDate)||((this.expectedGraduationDate!= null)&&this.expectedGraduationDate.equals(rhs.expectedGraduationDate)))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.curriculumObjective == rhs.curriculumObjective)||((this.curriculumObjective!= null)&&this.curriculumObjective.equals(rhs.curriculumObjective))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.programOwner == rhs.programOwner)||((this.programOwner!= null)&&this.programOwner.equals(rhs.programOwner))))&&((this.academicPeriods == rhs.academicPeriods)||((this.academicPeriods!= null)&&this.academicPeriods.equals(rhs.academicPeriods))))&&((this.admissionClassification == rhs.admissionClassification)||((this.admissionClassification!= null)&&this.admissionClassification.equals(rhs.admissionClassification))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.enrollmentStatus == rhs.enrollmentStatus)||((this.enrollmentStatus!= null)&&this.enrollmentStatus.equals(rhs.enrollmentStatus))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Curriculum Objective
     * <p>
     * The curriculum objective associated with the student's academic program.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CurriculumObjective {

        MATRICULATED("matriculated");
        private final String value;
        private final static Map<String, NewProgram.CurriculumObjective> CONSTANTS = new HashMap<String, NewProgram.CurriculumObjective>();

        static {
            for (NewProgram.CurriculumObjective c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CurriculumObjective(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static NewProgram.CurriculumObjective fromValue(String value) {
            NewProgram.CurriculumObjective constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
