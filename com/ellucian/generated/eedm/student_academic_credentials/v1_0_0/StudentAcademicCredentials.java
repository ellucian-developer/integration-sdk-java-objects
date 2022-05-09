
package com.ellucian.generated.eedm.student_academic_credentials.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Academic Credentials
 * <p>
 * The academic credentials the student has been awarded.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "studentProgram",
    "academicLevel",
    "credentials",
    "disciplines",
    "recognitions",
    "graduatedOn",
    "thesisTitle",
    "graduationAcademicPeriod",
    "graduationYear"
})
@Generated("jsonschema2pojo")
public class StudentAcademicCredentials {

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
     * The global identifier of the student academic credential.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student academic credential.")
    private String id;
    /**
     * Student
     * <p>
     * The student who has been awarded an academic credential.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student who has been awarded an academic credential.")
    private Student student;
    /**
     * Student Program
     * <p>
     * The student academic program associated with the academic credential.
     * 
     */
    @JsonProperty("studentProgram")
    @JsonPropertyDescription("The student academic program associated with the academic credential.")
    private Object studentProgram;
    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic credential.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the academic credential.")
    private Object academicLevel;
    /**
     * Credentials
     * <p>
     * The academic credentials awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("The academic credentials awarded to the student.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Disciplines
     * <p>
     * The disciplines associated with the awarded credentials.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The disciplines associated with the awarded credentials.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
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
     * The date the student graduated from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date the student graduated from the program.")
    private Object graduatedOn;
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
     * Graduation Academic Period
     * <p>
     * The academic period in which the student graduated.
     * 
     */
    @JsonProperty("graduationAcademicPeriod")
    @JsonPropertyDescription("The academic period in which the student graduated.")
    private Object graduationAcademicPeriod;
    /**
     * Graduation Year
     * <p>
     * The year in which the student graduated.
     * 
     */
    @JsonProperty("graduationYear")
    @JsonPropertyDescription("The year in which the student graduated.")
    private String graduationYear;

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

    public StudentAcademicCredentials withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic credential.
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
     * The global identifier of the student academic credential.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAcademicCredentials withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student who has been awarded an academic credential.
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
     * The student who has been awarded an academic credential.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAcademicCredentials withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Student Program
     * <p>
     * The student academic program associated with the academic credential.
     * 
     */
    @JsonProperty("studentProgram")
    public Object getStudentProgram() {
        return studentProgram;
    }

    /**
     * Student Program
     * <p>
     * The student academic program associated with the academic credential.
     * 
     */
    @JsonProperty("studentProgram")
    public void setStudentProgram(Object studentProgram) {
        this.studentProgram = studentProgram;
    }

    public StudentAcademicCredentials withStudentProgram(Object studentProgram) {
        this.studentProgram = studentProgram;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic credential.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic credential.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public StudentAcademicCredentials withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public StudentAcademicCredentials withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The disciplines associated with the awarded credentials.
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The disciplines associated with the awarded credentials.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public StudentAcademicCredentials withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
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

    public StudentAcademicCredentials withRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
        return this;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduated from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduated from the program.
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public StudentAcademicCredentials withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
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

    public StudentAcademicCredentials withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    /**
     * Graduation Academic Period
     * <p>
     * The academic period in which the student graduated.
     * 
     */
    @JsonProperty("graduationAcademicPeriod")
    public Object getGraduationAcademicPeriod() {
        return graduationAcademicPeriod;
    }

    /**
     * Graduation Academic Period
     * <p>
     * The academic period in which the student graduated.
     * 
     */
    @JsonProperty("graduationAcademicPeriod")
    public void setGraduationAcademicPeriod(Object graduationAcademicPeriod) {
        this.graduationAcademicPeriod = graduationAcademicPeriod;
    }

    public StudentAcademicCredentials withGraduationAcademicPeriod(Object graduationAcademicPeriod) {
        this.graduationAcademicPeriod = graduationAcademicPeriod;
        return this;
    }

    /**
     * Graduation Year
     * <p>
     * The year in which the student graduated.
     * 
     */
    @JsonProperty("graduationYear")
    public String getGraduationYear() {
        return graduationYear;
    }

    /**
     * Graduation Year
     * <p>
     * The year in which the student graduated.
     * 
     */
    @JsonProperty("graduationYear")
    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public StudentAcademicCredentials withGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("studentProgram");
        sb.append('=');
        sb.append(((this.studentProgram == null)?"<null>":this.studentProgram));
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
        sb.append("recognitions");
        sb.append('=');
        sb.append(((this.recognitions == null)?"<null>":this.recognitions));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("graduationAcademicPeriod");
        sb.append('=');
        sb.append(((this.graduationAcademicPeriod == null)?"<null>":this.graduationAcademicPeriod));
        sb.append(',');
        sb.append("graduationYear");
        sb.append('=');
        sb.append(((this.graduationYear == null)?"<null>":this.graduationYear));
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
        result = ((result* 31)+((this.recognitions == null)? 0 :this.recognitions.hashCode()));
        result = ((result* 31)+((this.studentProgram == null)? 0 :this.studentProgram.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.graduationAcademicPeriod == null)? 0 :this.graduationAcademicPeriod.hashCode()));
        result = ((result* 31)+((this.graduationYear == null)? 0 :this.graduationYear.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicCredentials) == false) {
            return false;
        }
        StudentAcademicCredentials rhs = ((StudentAcademicCredentials) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.recognitions == rhs.recognitions)||((this.recognitions!= null)&&this.recognitions.equals(rhs.recognitions))))&&((this.studentProgram == rhs.studentProgram)||((this.studentProgram!= null)&&this.studentProgram.equals(rhs.studentProgram))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.graduationAcademicPeriod == rhs.graduationAcademicPeriod)||((this.graduationAcademicPeriod!= null)&&this.graduationAcademicPeriod.equals(rhs.graduationAcademicPeriod))))&&((this.graduationYear == rhs.graduationYear)||((this.graduationYear!= null)&&this.graduationYear.equals(rhs.graduationYear))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
