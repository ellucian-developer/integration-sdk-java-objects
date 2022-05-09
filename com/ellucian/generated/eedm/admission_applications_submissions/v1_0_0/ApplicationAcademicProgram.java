
package com.ellucian.generated.eedm.admission_applications_submissions.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "program",
    "academicLevel",
    "credentials",
    "programOwner",
    "disciplines"
})
@Generated("jsonschema2pojo")
public class ApplicationAcademicProgram {

    /**
     * Program
     * <p>
     * The academic program applied to.
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program applied to.")
    private Program program;
    /**
     * Academic Level
     * <p>
     * The level of instruction for this course or program of study.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The level of instruction for this course or program of study.")
    private Object academicLevel;
    /**
     * Credentials
     * <p>
     * Credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Credentials associated with the academic program.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Program Owner
     * <p>
     * The operational unit which is the program owner.
     * 
     */
    @JsonProperty("programOwner")
    @JsonPropertyDescription("The operational unit which is the program owner.")
    private Object programOwner;
    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the academic program.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines associated with the academic program.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();

    /**
     * Program
     * <p>
     * The academic program applied to.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public Program getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The academic program applied to.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(Program program) {
        this.program = program;
    }

    public ApplicationAcademicProgram withProgram(Program program) {
        this.program = program;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The level of instruction for this course or program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The level of instruction for this course or program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public ApplicationAcademicProgram withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credentials
     * <p>
     * Credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * Credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public ApplicationAcademicProgram withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Program Owner
     * <p>
     * The operational unit which is the program owner.
     * 
     */
    @JsonProperty("programOwner")
    public Object getProgramOwner() {
        return programOwner;
    }

    /**
     * Program Owner
     * <p>
     * The operational unit which is the program owner.
     * 
     */
    @JsonProperty("programOwner")
    public void setProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
    }

    public ApplicationAcademicProgram withProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the academic program.
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the academic program.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public ApplicationAcademicProgram withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationAcademicProgram.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("programOwner");
        sb.append('=');
        sb.append(((this.programOwner == null)?"<null>":this.programOwner));
        sb.append(',');
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
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
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.programOwner == null)? 0 :this.programOwner.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationAcademicProgram) == false) {
            return false;
        }
        ApplicationAcademicProgram rhs = ((ApplicationAcademicProgram) other);
        return ((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.programOwner == rhs.programOwner)||((this.programOwner!= null)&&this.programOwner.equals(rhs.programOwner))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))));
    }

}
