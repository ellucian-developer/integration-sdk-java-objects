
package com.ellucian.generated.eedm.student_section_waitlists.v10_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Section Waitlists
 * <p>
 * Sections' waitlists for students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "section",
    "priority"
})
@Generated("jsonschema2pojo")
public class StudentSectionWaitlists {

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
     * The global identifier of the student section waitlist.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student section waitlist.")
    private String id;
    /**
     * Person
     * <p>
     * The student associated with the section waitlist.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The student associated with the section waitlist.")
    private Person person;
    /**
     * Section
     * <p>
     * The section associated with the waitlist.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("The section associated with the waitlist.")
    private Section section;
    /**
     * Priority
     * <p>
     * The number that represents the ranking of the waitlisted student for the given section.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("The number that represents the ranking of the waitlisted student for the given section.")
    private Object priority;

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

    public StudentSectionWaitlists withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student section waitlist.
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
     * The global identifier of the student section waitlist.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentSectionWaitlists withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The student associated with the section waitlist.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The student associated with the section waitlist.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentSectionWaitlists withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Section
     * <p>
     * The section associated with the waitlist.
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
     * The section associated with the waitlist.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public StudentSectionWaitlists withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Priority
     * <p>
     * The number that represents the ranking of the waitlisted student for the given section.
     * 
     */
    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * The number that represents the ranking of the waitlisted student for the given section.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public StudentSectionWaitlists withPriority(Object priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSectionWaitlists.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSectionWaitlists) == false) {
            return false;
        }
        StudentSectionWaitlists rhs = ((StudentSectionWaitlists) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
