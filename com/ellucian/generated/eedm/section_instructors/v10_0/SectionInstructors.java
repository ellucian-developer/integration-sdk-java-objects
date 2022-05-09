
package com.ellucian.generated.eedm.section_instructors.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Section Instructors
 * <p>
 * Information about instructors assigned to sections in academic capacities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "instructor",
    "section",
    "instructionalEvents",
    "instructionalMethod",
    "instructorRole",
    "workLoad",
    "responsibilityPercentage",
    "workStartOn",
    "workEndOn"
})
@Generated("jsonschema2pojo")
public class SectionInstructors {

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
     * The global identifier of the section instructor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the section instructor.")
    private String id;
    /**
     * Instructor
     * <p>
     * The person assigned as an instructor to the section.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    @JsonPropertyDescription("The person assigned as an instructor to the section.")
    private Instructor instructor;
    /**
     * Section
     * <p>
     * The section to which the instructor is assigned.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("The section to which the instructor is assigned.")
    private Section section;
    /**
     * Instructional Events
     * <p>
     * The instructional events associated with the assignment of the instructor to the section, if applicable.
     * 
     */
    @JsonProperty("instructionalEvents")
    @JsonPropertyDescription("The instructional events associated with the assignment of the instructor to the section, if applicable.")
    private List<InstructionalEvent> instructionalEvents = new ArrayList<InstructionalEvent>();
    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').")
    private Object instructionalMethod;
    /**
     * Instructor Role
     * <p>
     * An indication whether the instructor is identified as the primary instructor for the section.
     * 
     */
    @JsonProperty("instructorRole")
    @JsonPropertyDescription("An indication whether the instructor is identified as the primary instructor for the section.")
    private Object instructorRole;
    /**
     * Work Load
     * <p>
     * The amount of work attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("workLoad")
    @JsonPropertyDescription("The amount of work attributed to the instructor for the assignment.")
    private Object workLoad;
    /**
     * Responsibility Percentage
     * <p>
     * The percentage of the total responsibility for managing the instructional method's activities attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    @JsonPropertyDescription("The percentage of the total responsibility for managing the instructional method's activities attributed to the instructor for the assignment.")
    private Object responsibilityPercentage;
    /**
     * Work Start On
     * <p>
     * The first date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workStartOn")
    @JsonPropertyDescription("The first date associated with the instructor's assignment.")
    private Object workStartOn;
    /**
     * Work End On
     * <p>
     * The last date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workEndOn")
    @JsonPropertyDescription("The last date associated with the instructor's assignment.")
    private Object workEndOn;

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

    public SectionInstructors withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the section instructor.
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
     * The global identifier of the section instructor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionInstructors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Instructor
     * <p>
     * The person assigned as an instructor to the section.
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
     * The person assigned as an instructor to the section.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public SectionInstructors withInstructor(Instructor instructor) {
        this.instructor = instructor;
        return this;
    }

    /**
     * Section
     * <p>
     * The section to which the instructor is assigned.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public Section getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * The section to which the instructor is assigned.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public SectionInstructors withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Instructional Events
     * <p>
     * The instructional events associated with the assignment of the instructor to the section, if applicable.
     * 
     */
    @JsonProperty("instructionalEvents")
    public List<InstructionalEvent> getInstructionalEvents() {
        return instructionalEvents;
    }

    /**
     * Instructional Events
     * <p>
     * The instructional events associated with the assignment of the instructor to the section, if applicable.
     * 
     */
    @JsonProperty("instructionalEvents")
    public void setInstructionalEvents(List<InstructionalEvent> instructionalEvents) {
        this.instructionalEvents = instructionalEvents;
    }

    public SectionInstructors withInstructionalEvents(List<InstructionalEvent> instructionalEvents) {
        this.instructionalEvents = instructionalEvents;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    public Object getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public SectionInstructors withInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    /**
     * Instructor Role
     * <p>
     * An indication whether the instructor is identified as the primary instructor for the section.
     * 
     */
    @JsonProperty("instructorRole")
    public Object getInstructorRole() {
        return instructorRole;
    }

    /**
     * Instructor Role
     * <p>
     * An indication whether the instructor is identified as the primary instructor for the section.
     * 
     */
    @JsonProperty("instructorRole")
    public void setInstructorRole(Object instructorRole) {
        this.instructorRole = instructorRole;
    }

    public SectionInstructors withInstructorRole(Object instructorRole) {
        this.instructorRole = instructorRole;
        return this;
    }

    /**
     * Work Load
     * <p>
     * The amount of work attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("workLoad")
    public Object getWorkLoad() {
        return workLoad;
    }

    /**
     * Work Load
     * <p>
     * The amount of work attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("workLoad")
    public void setWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
    }

    public SectionInstructors withWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
        return this;
    }

    /**
     * Responsibility Percentage
     * <p>
     * The percentage of the total responsibility for managing the instructional method's activities attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    public Object getResponsibilityPercentage() {
        return responsibilityPercentage;
    }

    /**
     * Responsibility Percentage
     * <p>
     * The percentage of the total responsibility for managing the instructional method's activities attributed to the instructor for the assignment.
     * 
     */
    @JsonProperty("responsibilityPercentage")
    public void setResponsibilityPercentage(Object responsibilityPercentage) {
        this.responsibilityPercentage = responsibilityPercentage;
    }

    public SectionInstructors withResponsibilityPercentage(Object responsibilityPercentage) {
        this.responsibilityPercentage = responsibilityPercentage;
        return this;
    }

    /**
     * Work Start On
     * <p>
     * The first date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workStartOn")
    public Object getWorkStartOn() {
        return workStartOn;
    }

    /**
     * Work Start On
     * <p>
     * The first date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workStartOn")
    public void setWorkStartOn(Object workStartOn) {
        this.workStartOn = workStartOn;
    }

    public SectionInstructors withWorkStartOn(Object workStartOn) {
        this.workStartOn = workStartOn;
        return this;
    }

    /**
     * Work End On
     * <p>
     * The last date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workEndOn")
    public Object getWorkEndOn() {
        return workEndOn;
    }

    /**
     * Work End On
     * <p>
     * The last date associated with the instructor's assignment.
     * 
     */
    @JsonProperty("workEndOn")
    public void setWorkEndOn(Object workEndOn) {
        this.workEndOn = workEndOn;
    }

    public SectionInstructors withWorkEndOn(Object workEndOn) {
        this.workEndOn = workEndOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionInstructors.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("instructor");
        sb.append('=');
        sb.append(((this.instructor == null)?"<null>":this.instructor));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("instructionalEvents");
        sb.append('=');
        sb.append(((this.instructionalEvents == null)?"<null>":this.instructionalEvents));
        sb.append(',');
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
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
        result = ((result* 31)+((this.instructionalEvents == null)? 0 :this.instructionalEvents.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.workStartOn == null)? 0 :this.workStartOn.hashCode()));
        result = ((result* 31)+((this.instructor == null)? 0 :this.instructor.hashCode()));
        result = ((result* 31)+((this.workLoad == null)? 0 :this.workLoad.hashCode()));
        result = ((result* 31)+((this.workEndOn == null)? 0 :this.workEndOn.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.responsibilityPercentage == null)? 0 :this.responsibilityPercentage.hashCode()));
        result = ((result* 31)+((this.instructorRole == null)? 0 :this.instructorRole.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionInstructors) == false) {
            return false;
        }
        SectionInstructors rhs = ((SectionInstructors) other);
        return ((((((((((((this.instructionalEvents == rhs.instructionalEvents)||((this.instructionalEvents!= null)&&this.instructionalEvents.equals(rhs.instructionalEvents)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.workStartOn == rhs.workStartOn)||((this.workStartOn!= null)&&this.workStartOn.equals(rhs.workStartOn))))&&((this.instructor == rhs.instructor)||((this.instructor!= null)&&this.instructor.equals(rhs.instructor))))&&((this.workLoad == rhs.workLoad)||((this.workLoad!= null)&&this.workLoad.equals(rhs.workLoad))))&&((this.workEndOn == rhs.workEndOn)||((this.workEndOn!= null)&&this.workEndOn.equals(rhs.workEndOn))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.responsibilityPercentage == rhs.responsibilityPercentage)||((this.responsibilityPercentage!= null)&&this.responsibilityPercentage.equals(rhs.responsibilityPercentage))))&&((this.instructorRole == rhs.instructorRole)||((this.instructorRole!= null)&&this.instructorRole.equals(rhs.instructorRole))));
    }

}
