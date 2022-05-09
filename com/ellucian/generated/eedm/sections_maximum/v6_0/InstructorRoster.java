
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructor",
    "workLoadPercentage",
    "responsibilityPercentage",
    "workStartOn",
    "workEndOn"
})
@Generated("jsonschema2pojo")
public class InstructorRoster {

    /**
     * Instructor
     * <p>
     * A person assigned to teach an instruction method of a section.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    @JsonPropertyDescription("A person assigned to teach an instruction method of a section.")
    private Instructor instructor;
    /**
     * Load Percentage
     * <p>
     * The rate or proportion per hundred of the instructional method's work load that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoadPercentage")
    @JsonPropertyDescription("The rate or proportion per hundred of the instructional method's work load that is attributable to the instructor.")
    private Object workLoadPercentage;
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
     * The date when an instructor is assigned to start teaching the scheduled event for a Section.
     * 
     */
    @JsonProperty("workStartOn")
    @JsonPropertyDescription("The date when an instructor is assigned to start teaching the scheduled event for a Section.")
    private Object workStartOn;
    /**
     * Work End Date
     * <p>
     * The date after which an instructor is no longer assigned to the scheduled event for a Section.
     * 
     */
    @JsonProperty("workEndOn")
    @JsonPropertyDescription("The date after which an instructor is no longer assigned to the scheduled event for a Section.")
    private Object workEndOn;

    /**
     * Instructor
     * <p>
     * A person assigned to teach an instruction method of a section.
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
     * A person assigned to teach an instruction method of a section.
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
     * Load Percentage
     * <p>
     * The rate or proportion per hundred of the instructional method's work load that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoadPercentage")
    public Object getWorkLoadPercentage() {
        return workLoadPercentage;
    }

    /**
     * Load Percentage
     * <p>
     * The rate or proportion per hundred of the instructional method's work load that is attributable to the instructor.
     * 
     */
    @JsonProperty("workLoadPercentage")
    public void setWorkLoadPercentage(Object workLoadPercentage) {
        this.workLoadPercentage = workLoadPercentage;
    }

    public InstructorRoster withWorkLoadPercentage(Object workLoadPercentage) {
        this.workLoadPercentage = workLoadPercentage;
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
     * The date when an instructor is assigned to start teaching the scheduled event for a Section.
     * 
     */
    @JsonProperty("workStartOn")
    public Object getWorkStartOn() {
        return workStartOn;
    }

    /**
     * Work Start Date
     * <p>
     * The date when an instructor is assigned to start teaching the scheduled event for a Section.
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
     * The date after which an instructor is no longer assigned to the scheduled event for a Section.
     * 
     */
    @JsonProperty("workEndOn")
    public Object getWorkEndOn() {
        return workEndOn;
    }

    /**
     * Work End Date
     * <p>
     * The date after which an instructor is no longer assigned to the scheduled event for a Section.
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
        sb.append("workLoadPercentage");
        sb.append('=');
        sb.append(((this.workLoadPercentage == null)?"<null>":this.workLoadPercentage));
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
        result = ((result* 31)+((this.responsibilityPercentage == null)? 0 :this.responsibilityPercentage.hashCode()));
        result = ((result* 31)+((this.instructor == null)? 0 :this.instructor.hashCode()));
        result = ((result* 31)+((this.workLoadPercentage == null)? 0 :this.workLoadPercentage.hashCode()));
        result = ((result* 31)+((this.workEndOn == null)? 0 :this.workEndOn.hashCode()));
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
        return ((((((this.workStartOn == rhs.workStartOn)||((this.workStartOn!= null)&&this.workStartOn.equals(rhs.workStartOn)))&&((this.responsibilityPercentage == rhs.responsibilityPercentage)||((this.responsibilityPercentage!= null)&&this.responsibilityPercentage.equals(rhs.responsibilityPercentage))))&&((this.instructor == rhs.instructor)||((this.instructor!= null)&&this.instructor.equals(rhs.instructor))))&&((this.workLoadPercentage == rhs.workLoadPercentage)||((this.workLoadPercentage!= null)&&this.workLoadPercentage.equals(rhs.workLoadPercentage))))&&((this.workEndOn == rhs.workEndOn)||((this.workEndOn!= null)&&this.workEndOn.equals(rhs.workEndOn))));
    }

}
