
package com.ellucian.generated.eedm.student_advisor_relationships.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Advisor Relationships
 * <p>
 * Information about the relationship between a student and an advisor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "advisor",
    "student",
    "advisorType",
    "program",
    "startOn",
    "endOn",
    "assignedPriority",
    "startAcademicPeriod"
})
@Generated("jsonschema2pojo")
public class StudentAdvisorRelationships {

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
     * The global identifier of the student advisor relationship.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student advisor relationship.")
    private String id;
    /**
     * Advisor
     * <p>
     * The person who provides guidance to the student.
     * (Required)
     * 
     */
    @JsonProperty("advisor")
    @JsonPropertyDescription("The person who provides guidance to the student.")
    private Advisor advisor;
    /**
     * Student
     * <p>
     * The student receiving guidance from the advisor.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student receiving guidance from the advisor.")
    private Student student;
    /**
     * Advisor Type
     * <p>
     * The type of advisor. (E.g. concentration, major, peer, thesis, etc.)
     * 
     */
    @JsonProperty("advisorType")
    @JsonPropertyDescription("The type of advisor. (E.g. concentration, major, peer, thesis, etc.)")
    private Object advisorType;
    /**
     * Program
     * <p>
     * The program for which the student is receiving guidance for from the advisor.
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The program for which the student is receiving guidance for from the advisor.")
    private Object program;
    /**
     * Start On
     * <p>
     * The date when the student was first assigned to the advisor.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the student was first assigned to the advisor.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last date when the student was associated with the advisor.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the student was associated with the advisor.")
    private Object endOn;
    /**
     * Assigned Priority
     * <p>
     * The prioritization (e.g. primary) of the advisor as the source of guidance for the student.
     * 
     */
    @JsonProperty("assignedPriority")
    @JsonPropertyDescription("The prioritization (e.g. primary) of the advisor as the source of guidance for the student.")
    private Object assignedPriority;
    /**
     * Start Academic Period
     * <p>
     * The academic period when the advisor first provided guidance to the student.
     * 
     */
    @JsonProperty("startAcademicPeriod")
    @JsonPropertyDescription("The academic period when the advisor first provided guidance to the student.")
    private Object startAcademicPeriod;

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

    public StudentAdvisorRelationships withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student advisor relationship.
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
     * The global identifier of the student advisor relationship.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAdvisorRelationships withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Advisor
     * <p>
     * The person who provides guidance to the student.
     * (Required)
     * 
     */
    @JsonProperty("advisor")
    public Advisor getAdvisor() {
        return advisor;
    }

    /**
     * Advisor
     * <p>
     * The person who provides guidance to the student.
     * (Required)
     * 
     */
    @JsonProperty("advisor")
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public StudentAdvisorRelationships withAdvisor(Advisor advisor) {
        this.advisor = advisor;
        return this;
    }

    /**
     * Student
     * <p>
     * The student receiving guidance from the advisor.
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
     * The student receiving guidance from the advisor.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAdvisorRelationships withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Advisor Type
     * <p>
     * The type of advisor. (E.g. concentration, major, peer, thesis, etc.)
     * 
     */
    @JsonProperty("advisorType")
    public Object getAdvisorType() {
        return advisorType;
    }

    /**
     * Advisor Type
     * <p>
     * The type of advisor. (E.g. concentration, major, peer, thesis, etc.)
     * 
     */
    @JsonProperty("advisorType")
    public void setAdvisorType(Object advisorType) {
        this.advisorType = advisorType;
    }

    public StudentAdvisorRelationships withAdvisorType(Object advisorType) {
        this.advisorType = advisorType;
        return this;
    }

    /**
     * Program
     * <p>
     * The program for which the student is receiving guidance for from the advisor.
     * 
     */
    @JsonProperty("program")
    public Object getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The program for which the student is receiving guidance for from the advisor.
     * 
     */
    @JsonProperty("program")
    public void setProgram(Object program) {
        this.program = program;
    }

    public StudentAdvisorRelationships withProgram(Object program) {
        this.program = program;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the student was first assigned to the advisor.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the student was first assigned to the advisor.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public StudentAdvisorRelationships withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the student was associated with the advisor.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the student was associated with the advisor.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public StudentAdvisorRelationships withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Assigned Priority
     * <p>
     * The prioritization (e.g. primary) of the advisor as the source of guidance for the student.
     * 
     */
    @JsonProperty("assignedPriority")
    public Object getAssignedPriority() {
        return assignedPriority;
    }

    /**
     * Assigned Priority
     * <p>
     * The prioritization (e.g. primary) of the advisor as the source of guidance for the student.
     * 
     */
    @JsonProperty("assignedPriority")
    public void setAssignedPriority(Object assignedPriority) {
        this.assignedPriority = assignedPriority;
    }

    public StudentAdvisorRelationships withAssignedPriority(Object assignedPriority) {
        this.assignedPriority = assignedPriority;
        return this;
    }

    /**
     * Start Academic Period
     * <p>
     * The academic period when the advisor first provided guidance to the student.
     * 
     */
    @JsonProperty("startAcademicPeriod")
    public Object getStartAcademicPeriod() {
        return startAcademicPeriod;
    }

    /**
     * Start Academic Period
     * <p>
     * The academic period when the advisor first provided guidance to the student.
     * 
     */
    @JsonProperty("startAcademicPeriod")
    public void setStartAcademicPeriod(Object startAcademicPeriod) {
        this.startAcademicPeriod = startAcademicPeriod;
    }

    public StudentAdvisorRelationships withStartAcademicPeriod(Object startAcademicPeriod) {
        this.startAcademicPeriod = startAcademicPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdvisorRelationships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("advisor");
        sb.append('=');
        sb.append(((this.advisor == null)?"<null>":this.advisor));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("advisorType");
        sb.append('=');
        sb.append(((this.advisorType == null)?"<null>":this.advisorType));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("assignedPriority");
        sb.append('=');
        sb.append(((this.assignedPriority == null)?"<null>":this.assignedPriority));
        sb.append(',');
        sb.append("startAcademicPeriod");
        sb.append('=');
        sb.append(((this.startAcademicPeriod == null)?"<null>":this.startAcademicPeriod));
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
        result = ((result* 31)+((this.advisor == null)? 0 :this.advisor.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.startAcademicPeriod == null)? 0 :this.startAcademicPeriod.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.advisorType == null)? 0 :this.advisorType.hashCode()));
        result = ((result* 31)+((this.assignedPriority == null)? 0 :this.assignedPriority.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdvisorRelationships) == false) {
            return false;
        }
        StudentAdvisorRelationships rhs = ((StudentAdvisorRelationships) other);
        return (((((((((((this.advisor == rhs.advisor)||((this.advisor!= null)&&this.advisor.equals(rhs.advisor)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.startAcademicPeriod == rhs.startAcademicPeriod)||((this.startAcademicPeriod!= null)&&this.startAcademicPeriod.equals(rhs.startAcademicPeriod))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.advisorType == rhs.advisorType)||((this.advisorType!= null)&&this.advisorType.equals(rhs.advisorType))))&&((this.assignedPriority == rhs.assignedPriority)||((this.assignedPriority!= null)&&this.assignedPriority.equals(rhs.assignedPriority))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))));
    }

}
