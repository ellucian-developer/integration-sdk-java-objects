
package com.ellucian.generated.eedm.giving_societies.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Giving Societies
 * <p>
 * Societies associated with providing contributions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "group",
    "startOn",
    "endOn",
    "manager",
    "qualifications",
    "notes"
})
@Generated("jsonschema2pojo")
public class GivingSocieties {

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
     * The global identifier of the giving society.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the giving society.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the giving society.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the giving society.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the giving society.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the giving society.")
    private String description;
    /**
     * Group
     * <p>
     * The group associated with the giving society.
     * (Required)
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("The group associated with the giving society.")
    private Group group;
    /**
     * Start On
     * <p>
     * The date when the society was first available.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the society was first available.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when the society was last available.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the society was last available.")
    private Object endOn;
    /**
     * Manager
     * <p>
     * The person who is managing the society.
     * 
     */
    @JsonProperty("manager")
    @JsonPropertyDescription("The person who is managing the society.")
    private Object manager;
    /**
     * Qualifications
     * <p>
     * The qualifying attributes of the giving society.
     * 
     */
    @JsonProperty("qualifications")
    @JsonPropertyDescription("The qualifying attributes of the giving society.")
    private Qualifications qualifications;
    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the society.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes/comments that have been generated regarding the society.")
    private List<Note> notes = new ArrayList<Note>();

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

    public GivingSocieties withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the giving society.
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
     * The global identifier of the giving society.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GivingSocieties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the giving society.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the giving society.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GivingSocieties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the giving society.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the giving society.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GivingSocieties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Group
     * <p>
     * The group associated with the giving society.
     * (Required)
     * 
     */
    @JsonProperty("group")
    public Group getGroup() {
        return group;
    }

    /**
     * Group
     * <p>
     * The group associated with the giving society.
     * (Required)
     * 
     */
    @JsonProperty("group")
    public void setGroup(Group group) {
        this.group = group;
    }

    public GivingSocieties withGroup(Group group) {
        this.group = group;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the society was first available.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the society was first available.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public GivingSocieties withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the society was last available.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the society was last available.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public GivingSocieties withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Manager
     * <p>
     * The person who is managing the society.
     * 
     */
    @JsonProperty("manager")
    public Object getManager() {
        return manager;
    }

    /**
     * Manager
     * <p>
     * The person who is managing the society.
     * 
     */
    @JsonProperty("manager")
    public void setManager(Object manager) {
        this.manager = manager;
    }

    public GivingSocieties withManager(Object manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Qualifications
     * <p>
     * The qualifying attributes of the giving society.
     * 
     */
    @JsonProperty("qualifications")
    public Qualifications getQualifications() {
        return qualifications;
    }

    /**
     * Qualifications
     * <p>
     * The qualifying attributes of the giving society.
     * 
     */
    @JsonProperty("qualifications")
    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }

    public GivingSocieties withQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the society.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the society.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public GivingSocieties withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingSocieties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("manager");
        sb.append('=');
        sb.append(((this.manager == null)?"<null>":this.manager));
        sb.append(',');
        sb.append("qualifications");
        sb.append('=');
        sb.append(((this.qualifications == null)?"<null>":this.qualifications));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
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
        result = ((result* 31)+((this.qualifications == null)? 0 :this.qualifications.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.manager == null)? 0 :this.manager.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingSocieties) == false) {
            return false;
        }
        GivingSocieties rhs = ((GivingSocieties) other);
        return (((((((((((this.qualifications == rhs.qualifications)||((this.qualifications!= null)&&this.qualifications.equals(rhs.qualifications)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.manager == rhs.manager)||((this.manager!= null)&&this.manager.equals(rhs.manager))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
