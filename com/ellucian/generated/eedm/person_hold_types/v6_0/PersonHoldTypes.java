
package com.ellucian.generated.eedm.person_hold_types.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Person Hold Types
 * <p>
 * Types of holds on persons records.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "category"
})
@Generated("jsonschema2pojo")
public class PersonHoldTypes {

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
     * The global identifier of a student hold type
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a student hold type")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a student hold type
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a student hold type")
    private String title;
    /**
     * Description
     * <p>
     * The description of a student hold type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a student hold type")
    private String description;
    /**
     * Code
     * <p>
     * The code of a student hold type
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of a student hold type")
    private String code;
    /**
     * Category
     * <p>
     * A global category of student hold types
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A global category of student hold types")
    private PersonHoldTypes.Category category;

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

    public PersonHoldTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a student hold type
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
     * The global identifier of a student hold type
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonHoldTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a student hold type
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
     * The full name of a student hold type
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PersonHoldTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a student hold type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a student hold type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PersonHoldTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of a student hold type
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of a student hold type
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PersonHoldTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Category
     * <p>
     * A global category of student hold types
     * (Required)
     * 
     */
    @JsonProperty("category")
    public PersonHoldTypes.Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * A global category of student hold types
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(PersonHoldTypes.Category category) {
        this.category = category;
    }

    public PersonHoldTypes withCategory(PersonHoldTypes.Category category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonHoldTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonHoldTypes) == false) {
            return false;
        }
        PersonHoldTypes rhs = ((PersonHoldTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }


    /**
     * Category
     * <p>
     * A global category of student hold types
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        ACADEMIC("academic"),
        ADMINISTRATIVE("administrative"),
        DISCIPLINARY("disciplinary"),
        FINANCIAL("financial"),
        HEALTH("health");
        private final String value;
        private final static Map<String, PersonHoldTypes.Category> CONSTANTS = new HashMap<String, PersonHoldTypes.Category>();

        static {
            for (PersonHoldTypes.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Category(String value) {
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
        public static PersonHoldTypes.Category fromValue(String value) {
            PersonHoldTypes.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
