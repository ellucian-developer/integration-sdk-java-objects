
package com.ellucian.generated.eedm.instructional_events.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructor",
    "instructorRole",
    "workLoad",
    "responsibilityPercentage",
    "workStartOn",
    "workEndOn"
})
@Generated("jsonschema2pojo")
public class InstructorRoster {

    /**
     * Instructor
     * <p>
     * The person assigned to teach an instruction method of a section
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    @JsonPropertyDescription("The person assigned to teach an instruction method of a section")
    private Instructor instructor;
    /**
     * Instructor Role
     * <p>
     * The role of the instructor for the instructional event (e.g. primary).
     * 
     */
    @JsonProperty("instructorRole")
    @JsonPropertyDescription("The role of the instructor for the instructional event (e.g. primary).")
    private Object instructorRole;
    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching the section that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoad")
    @JsonPropertyDescription("The amount of work involved in teaching the section that is attributable to the instructor.")
    private Object workLoad;
    /**
     * Responsibility Percentage
     * <p>
     * The rate or proportion per hundred of the responsibility for managing the instructional method's activities that is attributable to the instructor.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    @JsonPropertyDescription("The rate or proportion per hundred of the responsibility for managing the instructional method's activities that is attributable to the instructor.")
    private Object responsibilityPercentage;
    /**
     * Work Start Date
     * <p>
     * The date when an instructor is assigned to start teaching the scheduled event for a section.
     * 
     */
    @JsonProperty("workStartOn")
    @JsonPropertyDescription("The date when an instructor is assigned to start teaching the scheduled event for a section.")
    private Object workStartOn;
    /**
     * Work End Date
     * <p>
     * The date after which an instructor is no longer assigned to the scheduled event for a section.
     * 
     */
    @JsonProperty("workEndOn")
    @JsonPropertyDescription("The date after which an instructor is no longer assigned to the scheduled event for a section.")
    private Object workEndOn;

    /**
     * Instructor
     * <p>
     * The person assigned to teach an instruction method of a section
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Instructor
     * <p>
     * The person assigned to teach an instruction method of a section
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public InstructorRoster withInstructor(Instructor instructor) {
        this.instructor = instructor;
        return this;
    }

    /**
     * Instructor Role
     * <p>
     * The role of the instructor for the instructional event (e.g. primary).
     * 
     */
    @JsonProperty("instructorRole")
    public Object getInstructorRole() {
        return instructorRole;
    }

    /**
     * Instructor Role
     * <p>
     * The role of the instructor for the instructional event (e.g. primary).
     * 
     */
    @JsonProperty("instructorRole")
    public void setInstructorRole(Object instructorRole) {
        this.instructorRole = instructorRole;
    }

    public InstructorRoster withInstructorRole(Object instructorRole) {
        this.instructorRole = instructorRole;
        return this;
    }

    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching the section that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoad")
    public Object getWorkLoad() {
        return workLoad;
    }

    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching the section that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoad")
    public void setWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
    }

    public InstructorRoster withWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
        return this;
    }

    /**
     * Responsibility Percentage
     * <p>
     * The rate or proportion per hundred of the responsibility for managing the instructional method's activities that is attributable to the instructor.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    public Object getResponsibilityPercentage() {
        return responsibilityPercentage;
    }

    /**
     * Responsibility Percentage
     * <p>
     * The rate or proportion per hundred of the responsibility for managing the instructional method's activities that is attributable to the instructor.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    public void setResponsibilityPercentage(Object responsibilityPercentage) {
        this.responsibilityPercentage = responsibilityPercentage;
    }

    public InstructorRoster withResponsibilityPercentage(Object responsibilityPercentage) {
        this.responsibilityPercentage = responsibilityPercentage;
        return this;
    }

    /**
     * Work Start Date
     * <p>
     * The date when an instructor is assigned to start teaching the scheduled event for a section.
     * 
     */
    @JsonProperty("workStartOn")
    public Object getWorkStartOn() {
        return workStartOn;
    }

    /**
     * Work Start Date
     * <p>
     * The date when an instructor is assigned to start teaching the scheduled event for a section.
     * 
     */
    @JsonProperty("workStartOn")
    public void setWorkStartOn(Object workStartOn) {
        this.workStartOn = workStartOn;
    }

    public InstructorRoster withWorkStartOn(Object workStartOn) {
        this.workStartOn = workStartOn;
        return this;
    }

    /**
     * Work End Date
     * <p>
     * The date after which an instructor is no longer assigned to the scheduled event for a section.
     * 
     */
    @JsonProperty("workEndOn")
    public Object getWorkEndOn() {
        return workEndOn;
    }

    /**
     * Work End Date
     * <p>
     * The date after which an instructor is no longer assigned to the scheduled event for a section.
     * 
     */
    @JsonProperty("workEndOn")
    public void setWorkEndOn(Object workEndOn) {
        this.workEndOn = workEndOn;
    }

    public InstructorRoster withWorkEndOn(Object workEndOn) {
        this.workEndOn = workEndOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructorRoster.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructor");
        sb.append('=');
        sb.append(((this.instructor == null)?"<null>":this.instructor));
        sb.append(',');
        sb.append("instructorRole");
        sb.append('=');
        sb.append(((this.instructorRole == null)?"<null>":this.instructorRole));
        sb.append(',');
        sb.append("workLoad");
        sb.append('=');
        sb.append(((this.workLoad == null)?"<null>":this.workLoad));
        sb.append(',');
        sb.append("responsibilityPercentage");
        sb.append('=');
        sb.append(((this.responsibilityPercentage == null)?"<null>":this.responsibilityPercentage));
        sb.append(',');
        sb.append("workStartOn");
        sb.append('=');
        sb.append(((this.workStartOn == null)?"<null>":this.workStartOn));
        sb.append(',');
        sb.append("workEndOn");
        sb.append('=');
        sb.append(((this.workEndOn == null)?"<null>":this.workEndOn));
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
        result = ((result* 31)+((this.workStartOn == null)? 0 :this.workStartOn.hashCode()));
        result = ((result* 31)+((this.instructor == null)? 0 :this.instructor.hashCode()));
        result = ((result* 31)+((this.workLoad == null)? 0 :this.workLoad.hashCode()));
        result = ((result* 31)+((this.workEndOn == null)? 0 :this.workEndOn.hashCode()));
        result = ((result* 31)+((this.responsibilityPercentage == null)? 0 :this.responsibilityPercentage.hashCode()));
        result = ((result* 31)+((this.instructorRole == null)? 0 :this.instructorRole.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructorRoster) == false) {
            return false;
        }
        InstructorRoster rhs = ((InstructorRoster) other);
        return (((((((this.workStartOn == rhs.workStartOn)||((this.workStartOn!= null)&&this.workStartOn.equals(rhs.workStartOn)))&&((this.instructor == rhs.instructor)||((this.instructor!= null)&&this.instructor.equals(rhs.instructor))))&&((this.workLoad == rhs.workLoad)||((this.workLoad!= null)&&this.workLoad.equals(rhs.workLoad))))&&((this.workEndOn == rhs.workEndOn)||((this.workEndOn!= null)&&this.workEndOn.equals(rhs.workEndOn))))&&((this.responsibilityPercentage == rhs.responsibilityPercentage)||((this.responsibilityPercentage!= null)&&this.responsibilityPercentage.equals(rhs.responsibilityPercentage))))&&((this.instructorRole == rhs.instructorRole)||((this.instructorRole!= null)&&this.instructorRole.equals(rhs.instructorRole))));
    }

}
