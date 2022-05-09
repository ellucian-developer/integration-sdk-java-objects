
package com.ellucian.generated.eedm.section_crosslists.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Section Crosslists
 * <p>
 * Lists of sections of different courses that meet together, cover the same course material, and have an instructor or set of instructors.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "sections",
    "waitlist",
    "maxEnrollment",
    "maxWaitlist"
})
@Generated("jsonschema2pojo")
public class SectionCrosslists {

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
     * The global identifier of the Section Crosslists.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Section Crosslists.")
    private String id;
    /**
     * Code
     * <p>
     * The code that identifies the list of cross-listed sections.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the list of cross-listed sections.")
    private String code;
    /**
     * Sections
     * <p>
     * The list of cross-listed sections.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    @JsonPropertyDescription("The list of cross-listed sections.")
    private List<Section> sections = new ArrayList<Section>();
    /**
     * Waitlist
     * <p>
     * An indicator specifying if all students are placed on the wait-list when any of the cross-listed sections has reached its maximum enrollment or only when the combined registration has reached the specified maximum enrollment of the cross-list.
     * 
     */
    @JsonProperty("waitlist")
    @JsonPropertyDescription("An indicator specifying if all students are placed on the wait-list when any of the cross-listed sections has reached its maximum enrollment or only when the combined registration has reached the specified maximum enrollment of the cross-list.")
    private Object waitlist;
    /**
     * Maximum Enrollment
     * <p>
     * The maximum enrollment of the cross-listed section over all included sections.
     * 
     */
    @JsonProperty("maxEnrollment")
    @JsonPropertyDescription("The maximum enrollment of the cross-listed section over all included sections.")
    private Object maxEnrollment;
    /**
     * Maximum Waitlist
     * <p>
     * The maximum number of students allowed in the combined wait-list for the cross-listed section.
     * 
     */
    @JsonProperty("maxWaitlist")
    @JsonPropertyDescription("The maximum number of students allowed in the combined wait-list for the cross-listed section.")
    private Object maxWaitlist;

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

    public SectionCrosslists withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Section Crosslists.
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
     * The global identifier of the Section Crosslists.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionCrosslists withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies the list of cross-listed sections.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the list of cross-listed sections.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SectionCrosslists withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Sections
     * <p>
     * The list of cross-listed sections.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public List<Section> getSections() {
        return sections;
    }

    /**
     * Sections
     * <p>
     * The list of cross-listed sections.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public SectionCrosslists withSections(List<Section> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Waitlist
     * <p>
     * An indicator specifying if all students are placed on the wait-list when any of the cross-listed sections has reached its maximum enrollment or only when the combined registration has reached the specified maximum enrollment of the cross-list.
     * 
     */
    @JsonProperty("waitlist")
    public Object getWaitlist() {
        return waitlist;
    }

    /**
     * Waitlist
     * <p>
     * An indicator specifying if all students are placed on the wait-list when any of the cross-listed sections has reached its maximum enrollment or only when the combined registration has reached the specified maximum enrollment of the cross-list.
     * 
     */
    @JsonProperty("waitlist")
    public void setWaitlist(Object waitlist) {
        this.waitlist = waitlist;
    }

    public SectionCrosslists withWaitlist(Object waitlist) {
        this.waitlist = waitlist;
        return this;
    }

    /**
     * Maximum Enrollment
     * <p>
     * The maximum enrollment of the cross-listed section over all included sections.
     * 
     */
    @JsonProperty("maxEnrollment")
    public Object getMaxEnrollment() {
        return maxEnrollment;
    }

    /**
     * Maximum Enrollment
     * <p>
     * The maximum enrollment of the cross-listed section over all included sections.
     * 
     */
    @JsonProperty("maxEnrollment")
    public void setMaxEnrollment(Object maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public SectionCrosslists withMaxEnrollment(Object maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
        return this;
    }

    /**
     * Maximum Waitlist
     * <p>
     * The maximum number of students allowed in the combined wait-list for the cross-listed section.
     * 
     */
    @JsonProperty("maxWaitlist")
    public Object getMaxWaitlist() {
        return maxWaitlist;
    }

    /**
     * Maximum Waitlist
     * <p>
     * The maximum number of students allowed in the combined wait-list for the cross-listed section.
     * 
     */
    @JsonProperty("maxWaitlist")
    public void setMaxWaitlist(Object maxWaitlist) {
        this.maxWaitlist = maxWaitlist;
    }

    public SectionCrosslists withMaxWaitlist(Object maxWaitlist) {
        this.maxWaitlist = maxWaitlist;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionCrosslists.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("sections");
        sb.append('=');
        sb.append(((this.sections == null)?"<null>":this.sections));
        sb.append(',');
        sb.append("waitlist");
        sb.append('=');
        sb.append(((this.waitlist == null)?"<null>":this.waitlist));
        sb.append(',');
        sb.append("maxEnrollment");
        sb.append('=');
        sb.append(((this.maxEnrollment == null)?"<null>":this.maxEnrollment));
        sb.append(',');
        sb.append("maxWaitlist");
        sb.append('=');
        sb.append(((this.maxWaitlist == null)?"<null>":this.maxWaitlist));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.maxEnrollment == null)? 0 :this.maxEnrollment.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.waitlist == null)? 0 :this.waitlist.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.maxWaitlist == null)? 0 :this.maxWaitlist.hashCode()));
        result = ((result* 31)+((this.sections == null)? 0 :this.sections.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionCrosslists) == false) {
            return false;
        }
        SectionCrosslists rhs = ((SectionCrosslists) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.maxEnrollment == rhs.maxEnrollment)||((this.maxEnrollment!= null)&&this.maxEnrollment.equals(rhs.maxEnrollment))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.waitlist == rhs.waitlist)||((this.waitlist!= null)&&this.waitlist.equals(rhs.waitlist))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.maxWaitlist == rhs.maxWaitlist)||((this.maxWaitlist!= null)&&this.maxWaitlist.equals(rhs.maxWaitlist))))&&((this.sections == rhs.sections)||((this.sections!= null)&&this.sections.equals(rhs.sections))));
    }

}
