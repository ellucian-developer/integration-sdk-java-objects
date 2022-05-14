
package com.ellucian.generated.eedm.anonymity_types.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Anonymity Types
 * <p>
 * The user defined ways in which a constituent's involvement may be kept anonymous.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "level"
})
@Generated("jsonschema2pojo")
public class AnonymityTypes {

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
     * The global identifier of the anonymity type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the anonymity type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the anonymity type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the anonymity type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the anonymity type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the anonymity type.")
    private String description;
    /**
     * Level
     * <p>
     * The level of anonymity (withhold amount, name, or all information) of the type.
     * (Required)
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The level of anonymity (withhold amount, name, or all information) of the type.")
    private AnonymityTypes.Level level;

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

    public AnonymityTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the anonymity type.
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
     * The global identifier of the anonymity type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AnonymityTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the anonymity type.
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
     * The full name of the anonymity type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AnonymityTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the anonymity type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the anonymity type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AnonymityTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Level
     * <p>
     * The level of anonymity (withhold amount, name, or all information) of the type.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public AnonymityTypes.Level getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The level of anonymity (withhold amount, name, or all information) of the type.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public void setLevel(AnonymityTypes.Level level) {
        this.level = level;
    }

    public AnonymityTypes withLevel(AnonymityTypes.Level level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymityTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnonymityTypes) == false) {
            return false;
        }
        AnonymityTypes rhs = ((AnonymityTypes) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))));
    }


    /**
     * Level
     * <p>
     * The level of anonymity (withhold amount, name, or all information) of the type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Level {

        AMOUNT("amount"),
        NAME("name"),
        ALL("all");
        private final String value;
        private final static Map<String, AnonymityTypes.Level> CONSTANTS = new HashMap<String, AnonymityTypes.Level>();

        static {
            for (AnonymityTypes.Level c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Level(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static AnonymityTypes.Level fromValue(String value) {
            AnonymityTypes.Level constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
