
package com.ellucian.generated.eedm.student_academic_programs_replacements.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Academic Programs Replacements
 * <p>
 * Replacement of an academic program in the home institution in which a student is enrolled.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "student",
    "programToReplace",
    "newProgram",
    "metadata"
})
@Generated("jsonschema2pojo")
public class StudentAcademicProgramsReplacements {

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
     * The student who is replacing their academic program.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student who is replacing their academic program.")
    private Student student;
    /**
     * Program To Replace
     * <p>
     * The academic program the student is replacing.
     * (Required)
     * 
     */
    @JsonProperty("programToReplace")
    @JsonPropertyDescription("The academic program the student is replacing.")
    private ProgramToReplace programToReplace;
    /**
     * New Program
     * <p>
     * The student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("newProgram")
    @JsonPropertyDescription("The student's new academic program.")
    private NewProgram newProgram;
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

    public StudentAcademicProgramsReplacements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student who is replacing their academic program.
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
     * The student who is replacing their academic program.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAcademicProgramsReplacements withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Program To Replace
     * <p>
     * The academic program the student is replacing.
     * (Required)
     * 
     */
    @JsonProperty("programToReplace")
    public ProgramToReplace getProgramToReplace() {
        return programToReplace;
    }

    /**
     * Program To Replace
     * <p>
     * The academic program the student is replacing.
     * (Required)
     * 
     */
    @JsonProperty("programToReplace")
    public void setProgramToReplace(ProgramToReplace programToReplace) {
        this.programToReplace = programToReplace;
    }

    public StudentAcademicProgramsReplacements withProgramToReplace(ProgramToReplace programToReplace) {
        this.programToReplace = programToReplace;
        return this;
    }

    /**
     * New Program
     * <p>
     * The student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("newProgram")
    public NewProgram getNewProgram() {
        return newProgram;
    }

    /**
     * New Program
     * <p>
     * The student's new academic program.
     * (Required)
     * 
     */
    @JsonProperty("newProgram")
    public void setNewProgram(NewProgram newProgram) {
        this.newProgram = newProgram;
    }

    public StudentAcademicProgramsReplacements withNewProgram(NewProgram newProgram) {
        this.newProgram = newProgram;
        return this;
    }

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

    public StudentAcademicProgramsReplacements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicProgramsReplacements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("programToReplace");
        sb.append('=');
        sb.append(((this.programToReplace == null)?"<null>":this.programToReplace));
        sb.append(',');
        sb.append("newProgram");
        sb.append('=');
        sb.append(((this.newProgram == null)?"<null>":this.newProgram));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
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
        result = ((result* 31)+((this.programToReplace == null)? 0 :this.programToReplace.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.newProgram == null)? 0 :this.newProgram.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicProgramsReplacements) == false) {
            return false;
        }
        StudentAcademicProgramsReplacements rhs = ((StudentAcademicProgramsReplacements) other);
        return ((((((this.programToReplace == rhs.programToReplace)||((this.programToReplace!= null)&&this.programToReplace.equals(rhs.programToReplace)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.newProgram == rhs.newProgram)||((this.newProgram!= null)&&this.newProgram.equals(rhs.newProgram))));
    }

}
