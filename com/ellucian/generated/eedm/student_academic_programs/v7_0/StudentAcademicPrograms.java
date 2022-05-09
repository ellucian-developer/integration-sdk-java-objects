
package com.ellucian.generated.eedm.student_academic_programs.v7_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Academic Programs
 * <p>
 * The academic programs in the home institution in which a student has beed enrolled.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "program",
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
    "performanceMeasure",
    "recognitions",
    "graduatedOn",
    "credentialsDate",
    "thesisTitle",
    "creditsEarned"
})
@Generated("jsonschema2pojo")
public class StudentAcademicPrograms {

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
     * The site (campus) the student enrolls for the program at
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The site (campus) the student enrolls for the program at")
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
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which an academic program begins.")
    private Date startOn;
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
     * Performance Measure
     * <p>
     * A measurement of the student's overall performance in the program (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("A measurement of the student's overall performance in the program (e.g. GPA).")
    private String performanceMeasure;
    /**
     * Recognitions
     * <p>
     * A list of academic recognitions the student has received.
     * 
     */
    @JsonProperty("recognitions")
    @JsonPropertyDescription("A list of academic recognitions the student has received.")
    private List<Recognition> recognitions = new ArrayList<Recognition>();
    /**
     * Graduated On
     * <p>
     * The date the student graduate from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date the student graduate from the program.")
    private Object graduatedOn;
    /**
     * Credentials Date
     * <p>
     * The date when credentials were issued to the student for the program.
     * 
     */
    @JsonProperty("credentialsDate")
    @JsonPropertyDescription("The date when credentials were issued to the student for the program.")
    private Object credentialsDate;
    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    @JsonPropertyDescription("The title of the thesis (dissertation).")
    private String thesisTitle;
    /**
     * Credits Earned
     * <p>
     * The number of credits earned at the home institution during the course of study for the program.
     * 
     */
    @JsonProperty("creditsEarned")
    @JsonPropertyDescription("The number of credits earned at the home institution during the course of study for the program.")
    private Object creditsEarned;

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

    public StudentAcademicPrograms withMetadata(Metadata metadata) {
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

    public StudentAcademicPrograms withId(String id) {
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

    public StudentAcademicPrograms withStudent(Student student) {
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

    public StudentAcademicPrograms withProgram(Program program) {
        this.program = program;
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

    public StudentAcademicPrograms withPreference(Object preference) {
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

    public StudentAcademicPrograms withProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
        return this;
    }

    /**
     * Site
     * <p>
     * The site (campus) the student enrolls for the program at
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The site (campus) the student enrolls for the program at
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public StudentAcademicPrograms withSite(Object site) {
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

    public StudentAcademicPrograms withCatalog(Object catalog) {
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

    public StudentAcademicPrograms withAcademicLevel(Object academicLevel) {
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

    public StudentAcademicPrograms withCredentials(List<Credential> credentials) {
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

    public StudentAcademicPrograms withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date on which an academic program begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date on which an academic program begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public StudentAcademicPrograms withStartOn(Date startOn) {
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

    public StudentAcademicPrograms withEndOn(Object endOn) {
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

    public StudentAcademicPrograms withAcademicPeriods(AcademicPeriods academicPeriods) {
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

    public StudentAcademicPrograms withEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }

    /**
     * Performance Measure
     * <p>
     * A measurement of the student's overall performance in the program (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public String getPerformanceMeasure() {
        return performanceMeasure;
    }

    /**
     * Performance Measure
     * <p>
     * A measurement of the student's overall performance in the program (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public void setPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
    }

    public StudentAcademicPrograms withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Recognitions
     * <p>
     * A list of academic recognitions the student has received.
     * 
     */
    @JsonProperty("recognitions")
    public List<Recognition> getRecognitions() {
        return recognitions;
    }

    /**
     * Recognitions
     * <p>
     * A list of academic recognitions the student has received.
     * 
     */
    @JsonProperty("recognitions")
    public void setRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
    }

    public StudentAcademicPrograms withRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
        return this;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduate from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduate from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public StudentAcademicPrograms withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
        return this;
    }

    /**
     * Credentials Date
     * <p>
     * The date when credentials were issued to the student for the program.
     * 
     */
    @JsonProperty("credentialsDate")
    public Object getCredentialsDate() {
        return credentialsDate;
    }

    /**
     * Credentials Date
     * <p>
     * The date when credentials were issued to the student for the program.
     * 
     */
    @JsonProperty("credentialsDate")
    public void setCredentialsDate(Object credentialsDate) {
        this.credentialsDate = credentialsDate;
    }

    public StudentAcademicPrograms withCredentialsDate(Object credentialsDate) {
        this.credentialsDate = credentialsDate;
        return this;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public StudentAcademicPrograms withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    /**
     * Credits Earned
     * <p>
     * The number of credits earned at the home institution during the course of study for the program.
     * 
     */
    @JsonProperty("creditsEarned")
    public Object getCreditsEarned() {
        return creditsEarned;
    }

    /**
     * Credits Earned
     * <p>
     * The number of credits earned at the home institution during the course of study for the program.
     * 
     */
    @JsonProperty("creditsEarned")
    public void setCreditsEarned(Object creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public StudentAcademicPrograms withCreditsEarned(Object creditsEarned) {
        this.creditsEarned = creditsEarned;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicPrograms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("recognitions");
        sb.append('=');
        sb.append(((this.recognitions == null)?"<null>":this.recognitions));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("credentialsDate");
        sb.append('=');
        sb.append(((this.credentialsDate == null)?"<null>":this.credentialsDate));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("creditsEarned");
        sb.append('=');
        sb.append(((this.creditsEarned == null)?"<null>":this.creditsEarned));
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
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.programOwner == null)? 0 :this.programOwner.hashCode()));
        result = ((result* 31)+((this.recognitions == null)? 0 :this.recognitions.hashCode()));
        result = ((result* 31)+((this.academicPeriods == null)? 0 :this.academicPeriods.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.creditsEarned == null)? 0 :this.creditsEarned.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.enrollmentStatus == null)? 0 :this.enrollmentStatus.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.credentialsDate == null)? 0 :this.credentialsDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicPrograms) == false) {
            return false;
        }
        StudentAcademicPrograms rhs = ((StudentAcademicPrograms) other);
        return ((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.programOwner == rhs.programOwner)||((this.programOwner!= null)&&this.programOwner.equals(rhs.programOwner))))&&((this.recognitions == rhs.recognitions)||((this.recognitions!= null)&&this.recognitions.equals(rhs.recognitions))))&&((this.academicPeriods == rhs.academicPeriods)||((this.academicPeriods!= null)&&this.academicPeriods.equals(rhs.academicPeriods))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.creditsEarned == rhs.creditsEarned)||((this.creditsEarned!= null)&&this.creditsEarned.equals(rhs.creditsEarned))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.enrollmentStatus == rhs.enrollmentStatus)||((this.enrollmentStatus!= null)&&this.enrollmentStatus.equals(rhs.enrollmentStatus))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.credentialsDate == rhs.credentialsDate)||((this.credentialsDate!= null)&&this.credentialsDate.equals(rhs.credentialsDate))));
    }

}
