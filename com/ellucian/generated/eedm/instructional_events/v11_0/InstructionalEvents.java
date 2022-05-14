
package com.ellucian.generated.eedm.instructional_events.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instructional Events
 * <p>
 * An instructional activity that takes place during a section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "section",
    "instructionalMethod",
    "workLoad",
    "recurrence",
    "locations",
    "approvals"
})
@Generated("jsonschema2pojo")
public class InstructionalEvents {

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
     * The global identifier of the instructional event.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the instructional event.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the instructional event.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the instructional event.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the instructional event.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the instructional event.")
    private String description;
    /**
     * Section
     * <p>
     * An instance of a course.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("An instance of a course.")
    private Section section;
    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').")
    private InstructionalMethod instructionalMethod;
    /**
     * Work Load
     * <p>
     * The total amount of work associated with the instructional event.
     * 
     */
    @JsonProperty("workLoad")
    @JsonPropertyDescription("The total amount of work associated with the instructional event.")
    private Object workLoad;
    /**
     * Recurrence
     * <p>
     * The recurring meeting time pattern associated with the instructional event.
     * 
     */
    @JsonProperty("recurrence")
    @JsonPropertyDescription("The recurring meeting time pattern associated with the instructional event.")
    private Object recurrence;
    /**
     * Locations
     * <p>
     * The locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    @JsonPropertyDescription("The locations where the instructional event will take place.")
    private List<Location> locations = new ArrayList<Location>();
    /**
     * Approvals
     * <p>
     * The type and source of approvals applied to the instructional event.
     * 
     */
    @JsonProperty("approvals")
    @JsonPropertyDescription("The type and source of approvals applied to the instructional event.")
    private List<Approval> approvals = new ArrayList<Approval>();

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

    public InstructionalEvents withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the instructional event.
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
     * The global identifier of the instructional event.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InstructionalEvents withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the instructional event.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the instructional event.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public InstructionalEvents withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the instructional event.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the instructional event.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public InstructionalEvents withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Section
     * <p>
     * An instance of a course.
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
     * An instance of a course.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public InstructionalEvents withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    public InstructionalMethod getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public InstructionalEvents withInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    /**
     * Work Load
     * <p>
     * The total amount of work associated with the instructional event.
     * 
     */
    @JsonProperty("workLoad")
    public Object getWorkLoad() {
        return workLoad;
    }

    /**
     * Work Load
     * <p>
     * The total amount of work associated with the instructional event.
     * 
     */
    @JsonProperty("workLoad")
    public void setWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
    }

    public InstructionalEvents withWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
        return this;
    }

    /**
     * Recurrence
     * <p>
     * The recurring meeting time pattern associated with the instructional event.
     * 
     */
    @JsonProperty("recurrence")
    public Object getRecurrence() {
        return recurrence;
    }

    /**
     * Recurrence
     * <p>
     * The recurring meeting time pattern associated with the instructional event.
     * 
     */
    @JsonProperty("recurrence")
    public void setRecurrence(Object recurrence) {
        this.recurrence = recurrence;
    }

    public InstructionalEvents withRecurrence(Object recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Locations
     * <p>
     * The locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Locations
     * <p>
     * The locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public InstructionalEvents withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Approvals
     * <p>
     * The type and source of approvals applied to the instructional event.
     * 
     */
    @JsonProperty("approvals")
    public List<Approval> getApprovals() {
        return approvals;
    }

    /**
     * Approvals
     * <p>
     * The type and source of approvals applied to the instructional event.
     * 
     */
    @JsonProperty("approvals")
    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    public InstructionalEvents withApprovals(List<Approval> approvals) {
        this.approvals = approvals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalEvents.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
        sb.append(',');
        sb.append("workLoad");
        sb.append('=');
        sb.append(((this.workLoad == null)?"<null>":this.workLoad));
        sb.append(',');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("approvals");
        sb.append('=');
        sb.append(((this.approvals == null)?"<null>":this.approvals));
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
        result = ((result* 31)+((this.recurrence == null)? 0 :this.recurrence.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.workLoad == null)? 0 :this.workLoad.hashCode()));
        result = ((result* 31)+((this.approvals == null)? 0 :this.approvals.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        result = ((result* 31)+((this.locations == null)? 0 :this.locations.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionalEvents) == false) {
            return false;
        }
        InstructionalEvents rhs = ((InstructionalEvents) other);
        return (((((((((((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.workLoad == rhs.workLoad)||((this.workLoad!= null)&&this.workLoad.equals(rhs.workLoad))))&&((this.approvals == rhs.approvals)||((this.approvals!= null)&&this.approvals.equals(rhs.approvals))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
