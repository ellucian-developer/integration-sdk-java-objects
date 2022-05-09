
package com.ellucian.generated.eedm.prospect_opportunities_submissions.v1_0_0;

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
public class RecruitAcademicProgram {

    /**
     * Program
     * <p>
     * The academic program the prospect is considering at the institution.
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program the prospect is considering at the institution.")
    private Program program;
    /**
     * Academic Level
     * <p>
     * The academic level of study the prospect is considering at the institution.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level of study the prospect is considering at the institution.")
    private Object academicLevel;
    /**
     * Credentials
     * <p>
     * The academic credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("The academic credentials associated with the academic program.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Program Owner
     * <p>
     * The program owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    @JsonPropertyDescription("The program owner of the academic program.")
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
     * The academic program the prospect is considering at the institution.
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
     * The academic program the prospect is considering at the institution.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(Program program) {
        this.program = program;
    }

    public RecruitAcademicProgram withProgram(Program program) {
        this.program = program;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level of study the prospect is considering at the institution.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level of study the prospect is considering at the institution.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public RecruitAcademicProgram withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials associated with the academic program.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public RecruitAcademicProgram withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Program Owner
     * <p>
     * The program owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    public Object getProgramOwner() {
        return programOwner;
    }

    /**
     * Program Owner
     * <p>
     * The program owner of the academic program.
     * 
     */
    @JsonProperty("programOwner")
    public void setProgramOwner(Object programOwner) {
        this.programOwner = programOwner;
    }

    public RecruitAcademicProgram withProgramOwner(Object programOwner) {
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

    public RecruitAcademicProgram withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitAcademicProgram.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof RecruitAcademicProgram) == false) {
            return false;
        }
        RecruitAcademicProgram rhs = ((RecruitAcademicProgram) other);
        return ((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.programOwner == rhs.programOwner)||((this.programOwner!= null)&&this.programOwner.equals(rhs.programOwner))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))));
    }

}
