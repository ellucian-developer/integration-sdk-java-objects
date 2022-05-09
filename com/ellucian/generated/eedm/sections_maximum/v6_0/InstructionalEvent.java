
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "instructionalMethod",
    "recurrence",
    "locations",
    "instructorRoster",
    "detail"
})
@Generated("jsonschema2pojo")
public class InstructionalEvent {

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a Section.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an instructional activity that takes place during a Section.")
    private String title;
    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("")
    private InstructionalMethod instructionalMethod;
    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    @JsonPropertyDescription("")
    private Object recurrence;
    /**
     * Location
     * <p>
     * Locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    @JsonPropertyDescription("Locations where the instructional event will take place.")
    private List<Location> locations = new ArrayList<Location>();
    /**
     * Instructor Roster
     * <p>
     * 
     * 
     */
    @JsonProperty("instructorRoster")
    @JsonPropertyDescription("")
    private List<InstructorRoster> instructorRoster = new ArrayList<InstructorRoster>();
    /**
     * Instructional Event
     * <p>
     * The instructional event associated to this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The instructional event associated to this section.")
    private Detail__11 detail;

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a Section.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a Section.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public InstructionalEvent withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalMethod")
    public InstructionalMethod getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public InstructionalEvent withInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    public Object getRecurrence() {
        return recurrence;
    }

    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    public void setRecurrence(Object recurrence) {
        this.recurrence = recurrence;
    }

    public InstructionalEvent withRecurrence(Object recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Location
     * <p>
     * Locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Location
     * <p>
     * Locations where the instructional event will take place.
     * 
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public InstructionalEvent withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Instructor Roster
     * <p>
     * 
     * 
     */
    @JsonProperty("instructorRoster")
    public List<InstructorRoster> getInstructorRoster() {
        return instructorRoster;
    }

    /**
     * Instructor Roster
     * <p>
     * 
     * 
     */
    @JsonProperty("instructorRoster")
    public void setInstructorRoster(List<InstructorRoster> instructorRoster) {
        this.instructorRoster = instructorRoster;
    }

    public InstructionalEvent withInstructorRoster(List<InstructorRoster> instructorRoster) {
        this.instructorRoster = instructorRoster;
        return this;
    }

    /**
     * Instructional Event
     * <p>
     * The instructional event associated to this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__11 getDetail() {
        return detail;
    }

    /**
     * Instructional Event
     * <p>
     * The instructional event associated to this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__11 detail) {
        this.detail = detail;
    }

    public InstructionalEvent withDetail(Detail__11 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
        sb.append(',');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("instructorRoster");
        sb.append('=');
        sb.append(((this.instructorRoster == null)?"<null>":this.instructorRoster));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.instructorRoster == null)? 0 :this.instructorRoster.hashCode()));
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        result = ((result* 31)+((this.locations == null)? 0 :this.locations.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionalEvent) == false) {
            return false;
        }
        InstructionalEvent rhs = ((InstructionalEvent) other);
        return (((((((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence)))&&((this.instructorRoster == rhs.instructorRoster)||((this.instructorRoster!= null)&&this.instructorRoster.equals(rhs.instructorRoster))))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
