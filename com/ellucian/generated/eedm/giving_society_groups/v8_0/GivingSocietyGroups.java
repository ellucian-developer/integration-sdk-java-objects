
package com.ellucian.generated.eedm.giving_society_groups.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Giving Society Groups
 * <p>
 * A user defined categorization used for giving societies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "repeatCycle",
    "defaultRecognitionLevels"
})
@Generated("jsonschema2pojo")
public class GivingSocietyGroups {

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
     * The global identifier of the giving society group.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the giving society group.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the giving society group.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the giving society group.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the giving society group.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the giving society group.")
    private String description;
    /**
     * Type
     * <p>
     * Type of the giving society.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the giving society.")
    private Object type;
    /**
     * Repeat Cycle
     * <p>
     * Repeat cycle used for donation.
     * 
     */
    @JsonProperty("repeatCycle")
    @JsonPropertyDescription("Repeat cycle used for donation.")
    private Object repeatCycle;
    /**
     * Default Recognition Levels
     * <p>
     * The default recognition levels for all giving societies associated with the group.
     * 
     */
    @JsonProperty("defaultRecognitionLevels")
    @JsonPropertyDescription("The default recognition levels for all giving societies associated with the group.")
    private List<DefaultRecognitionLevel> defaultRecognitionLevels = new ArrayList<DefaultRecognitionLevel>();

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

    public GivingSocietyGroups withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the giving society group.
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
     * The global identifier of the giving society group.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GivingSocietyGroups withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the giving society group.
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
     * The full name of the giving society group.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GivingSocietyGroups withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the giving society group.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the giving society group.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GivingSocietyGroups withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of the giving society.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the giving society.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public GivingSocietyGroups withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Repeat Cycle
     * <p>
     * Repeat cycle used for donation.
     * 
     */
    @JsonProperty("repeatCycle")
    public Object getRepeatCycle() {
        return repeatCycle;
    }

    /**
     * Repeat Cycle
     * <p>
     * Repeat cycle used for donation.
     * 
     */
    @JsonProperty("repeatCycle")
    public void setRepeatCycle(Object repeatCycle) {
        this.repeatCycle = repeatCycle;
    }

    public GivingSocietyGroups withRepeatCycle(Object repeatCycle) {
        this.repeatCycle = repeatCycle;
        return this;
    }

    /**
     * Default Recognition Levels
     * <p>
     * The default recognition levels for all giving societies associated with the group.
     * 
     */
    @JsonProperty("defaultRecognitionLevels")
    public List<DefaultRecognitionLevel> getDefaultRecognitionLevels() {
        return defaultRecognitionLevels;
    }

    /**
     * Default Recognition Levels
     * <p>
     * The default recognition levels for all giving societies associated with the group.
     * 
     */
    @JsonProperty("defaultRecognitionLevels")
    public void setDefaultRecognitionLevels(List<DefaultRecognitionLevel> defaultRecognitionLevels) {
        this.defaultRecognitionLevels = defaultRecognitionLevels;
    }

    public GivingSocietyGroups withDefaultRecognitionLevels(List<DefaultRecognitionLevel> defaultRecognitionLevels) {
        this.defaultRecognitionLevels = defaultRecognitionLevels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingSocietyGroups.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("repeatCycle");
        sb.append('=');
        sb.append(((this.repeatCycle == null)?"<null>":this.repeatCycle));
        sb.append(',');
        sb.append("defaultRecognitionLevels");
        sb.append('=');
        sb.append(((this.defaultRecognitionLevels == null)?"<null>":this.defaultRecognitionLevels));
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
        result = ((result* 31)+((this.repeatCycle == null)? 0 :this.repeatCycle.hashCode()));
        result = ((result* 31)+((this.defaultRecognitionLevels == null)? 0 :this.defaultRecognitionLevels.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingSocietyGroups) == false) {
            return false;
        }
        GivingSocietyGroups rhs = ((GivingSocietyGroups) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.repeatCycle == rhs.repeatCycle)||((this.repeatCycle!= null)&&this.repeatCycle.equals(rhs.repeatCycle))))&&((this.defaultRecognitionLevels == rhs.defaultRecognitionLevels)||((this.defaultRecognitionLevels!= null)&&this.defaultRecognitionLevels.equals(rhs.defaultRecognitionLevels))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
