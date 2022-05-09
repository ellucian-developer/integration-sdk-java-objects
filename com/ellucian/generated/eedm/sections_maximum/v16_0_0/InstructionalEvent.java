
package com.ellucian.generated.eedm.sections_maximum.v16_0_0;

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
    "workLoad",
    "locations",
    "detail"
})
@Generated("jsonschema2pojo")
public class InstructionalEvent {

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a section.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an instructional activity that takes place during a section.")
    private String title;
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
     * Recurrence
     * <p>
     * The recurring meeting time pattern associated with the instructional event.
     * 
     */
    @JsonProperty("recurrence")
    @JsonPropertyDescription("The recurring meeting time pattern associated with the instructional event.")
    private Object recurrence;
    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching a section.
     * 
     */
    @JsonProperty("workLoad")
    @JsonPropertyDescription("The amount of work involved in teaching a section.")
    private Object workLoad;
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
     * Instructional Event
     * <p>
     * The instructional event associated to this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The instructional event associated to this section.")
    private Detail__7 detail;

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a section.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of an instructional activity that takes place during a section.
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

    public InstructionalEvent withInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
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

    public InstructionalEvent withRecurrence(Object recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching a section.
     * 
     */
    @JsonProperty("workLoad")
    public Object getWorkLoad() {
        return workLoad;
    }

    /**
     * Work Load
     * <p>
     * The amount of work involved in teaching a section.
     * 
     */
    @JsonProperty("workLoad")
    public void setWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
    }

    public InstructionalEvent withWorkLoad(Object workLoad) {
        this.workLoad = workLoad;
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
     * Instructional Event
     * <p>
     * The instructional event associated to this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__7 getDetail() {
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
    public void setDetail(Detail__7 detail) {
        this.detail = detail;
    }

    public InstructionalEvent withDetail(Detail__7 detail) {
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
        sb.append("workLoad");
        sb.append('=');
        sb.append(((this.workLoad == null)?"<null>":this.workLoad));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
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
        result = ((result* 31)+((this.workLoad == null)? 0 :this.workLoad.hashCode()));
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
        return (((((((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence)))&&((this.workLoad == rhs.workLoad)||((this.workLoad!= null)&&this.workLoad.equals(rhs.workLoad))))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
