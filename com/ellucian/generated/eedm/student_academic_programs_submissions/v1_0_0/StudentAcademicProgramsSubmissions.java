
package com.ellucian.generated.eedm.student_academic_programs_submissions.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Student Academic Programs Submissions
 * <p>
 * The academic programs in the home institution in which a student is enrolled.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "program",
    "curriculumObjective",
    "preference",
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
public class StudentAcademicProgramsSubmissions {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the student academic program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student academic program.")
    private String id;
    /**
     * Student
     * <p>
     * The student who is enrolled in an academic program.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student who is enrolled in an academic program.")
    private Student student;
    /**
     * Academic Program
     * <p>
     * The academic program in which a student is enrolled.
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program in which a student is enrolled.")
    private Program program;
    /**
     * Curriculum Objective
     * <p>
     * The curriculum objective associated with the student's academic program.
     * (Required)
     * 
     */
    @JsonProperty("curriculumObjective")
    @JsonPropertyDescription("The curriculum objective associated with the student's academic program.")
    private StudentAcademicProgramsSubmissions.CurriculumObjective curriculumObjective;
    /**
     * Preference
     * <p>
     * Indicates the primary academic program of the student.  Only one academic program should be set to preferred for a student.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the primary academic program of the student.  Only one academic program should be set to preferred for a student.")
    private Object preference;
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
     * 
     */
    @JsonProperty("catalog")
    @JsonPropertyDescription("The academic catalog that defines the requirements for a student's enrollment in a program.")
    private Object catalog;
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
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public StudentAcademicProgramsSubmissions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAcademicProgramsSubmissions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student who is enrolled in an academic program.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * The student who is enrolled in an academic program.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAcademicProgramsSubmissions withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Academic Program
     * <p>
     * The academic program in which a student is enrolled.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public Program getProgram() {
        return program;
    }

    /**
     * Academic Program
     * <p>
     * The academic program in which a student is enrolled.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(Program program) {
        this.program = program;
    }

    public StudentAcademicProgramsSubmissions withProgram(Program program) {
        this.program = program;
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
    public StudentAcademicProgramsSubmissions.CurriculumObjective getCurriculumObjective() {
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
    public void setCurriculumObjective(StudentAcademicProgramsSubmissions.CurriculumObjective curriculumObjective) {
        this.curriculumObjective = curriculumObjective;
    }

    public StudentAcademicProgramsSubmissions withCurriculumObjective(StudentAcademicProgramsSubmissions.CurriculumObjective curriculumObjective) {
        this.curriculumObjective = curriculumObjective;
        return this;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary academic program of the student.  Only one academic program should be set to preferred for a student.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary academic program of the student.  Only one academic program should be set to preferred for a student.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public StudentAcademicProgramsSubmissions withPreference(Object preference) {
        this.preference = preference;
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

    public StudentAcademicProgramsSubmissions withProgramOwner(Object programOwner) {
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

    public StudentAcademicProgramsSubmissions withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Academic Catalog
     * <p>
     * The academic catalog that defines the requirements for a student's enrollment in a program.
     * 
     */
    @JsonProperty("catalog")
    public Object getCatalog() {
        return catalog;
    }

    /**
     * Academic Catalog
     * <p>
     * The academic catalog that defines the requirements for a student's enrollment in a program.
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(Object catalog) {
        this.catalog = catalog;
    }

    public StudentAcademicProgramsSubmissions withCatalog(Object catalog) {
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

    public StudentAcademicProgramsSubmissions withAcademicLevel(Object academicLevel) {
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

    public StudentAcademicProgramsSubmissions withCredentials(List<Credential> credentials) {
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

    public StudentAcademicProgramsSubmissions withDisciplines(List<Discipline> disciplines) {
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

    public StudentAcademicProgramsSubmissions withStartOn(Object startOn) {
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

    public StudentAcademicProgramsSubmissions withEndOn(Object endOn) {
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

    public StudentAcademicProgramsSubmissions withAcademicPeriods(AcademicPeriods academicPeriods) {
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

    public StudentAcademicProgramsSubmissions withEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
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

    public StudentAcademicProgramsSubmissions withExpectedGraduationDate(Object expectedGraduationDate) {
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

    public StudentAcademicProgramsSubmissions withAdmissionClassification(AdmissionClassification admissionClassification) {
        this.admissionClassification = admissionClassification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicProgramsSubmissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("curriculumObjective");
        sb.append('=');
        sb.append(((this.curriculumObjective == null)?"<null>":this.curriculumObjective));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.expectedGraduationDate == null)? 0 :this.expectedGraduationDate.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.curriculumObjective == null)? 0 :this.curriculumObjective.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.programOwner == null)? 0 :this.programOwner.hashCode()));
        result = ((result* 31)+((this.academicPeriods == null)? 0 :this.academicPeriods.hashCode()));
        result = ((result* 31)+((this.admissionClassification == null)? 0 :this.admissionClassification.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.enrollmentStatus == null)? 0 :this.enrollmentStatus.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicProgramsSubmissions) == false) {
            return false;
        }
        StudentAcademicProgramsSubmissions rhs = ((StudentAcademicProgramsSubmissions) other);
        return (((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.expectedGraduationDate == rhs.expectedGraduationDate)||((this.expectedGraduationDate!= null)&&this.expectedGraduationDate.equals(rhs.expectedGraduationDate))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.curriculumObjective == rhs.curriculumObjective)||((this.curriculumObjective!= null)&&this.curriculumObjective.equals(rhs.curriculumObjective))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.programOwner == rhs.programOwner)||((this.programOwner!= null)&&this.programOwner.equals(rhs.programOwner))))&&((this.academicPeriods == rhs.academicPeriods)||((this.academicPeriods!= null)&&this.academicPeriods.equals(rhs.academicPeriods))))&&((this.admissionClassification == rhs.admissionClassification)||((this.admissionClassification!= null)&&this.admissionClassification.equals(rhs.admissionClassification))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.enrollmentStatus == rhs.enrollmentStatus)||((this.enrollmentStatus!= null)&&this.enrollmentStatus.equals(rhs.enrollmentStatus))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
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
        private final static Map<String, StudentAcademicProgramsSubmissions.CurriculumObjective> CONSTANTS = new HashMap<String, StudentAcademicProgramsSubmissions.CurriculumObjective>();

        static {
            for (StudentAcademicProgramsSubmissions.CurriculumObjective c: values()) {
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
        public static StudentAcademicProgramsSubmissions.CurriculumObjective fromValue(String value) {
            StudentAcademicProgramsSubmissions.CurriculumObjective constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
