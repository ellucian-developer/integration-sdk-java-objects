
package com.ellucian.generated.eedm.employment_classifications.v7_0;

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
 * Employment Classifications
 * <p>
 * A list of standard employment classifications that may be specified for an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "code"
})
@Generated("jsonschema2pojo")
public class EmploymentClassifications {

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
     * The global identifier of the Employment Classification
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Employment Classification")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the Employment Classification
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the Employment Classification")
    private String title;
    /**
     * Description
     * <p>
     * The description of the Employment Classification
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the Employment Classification")
    private String description;
    /**
     * Type
     * <p>
     * The type of Employment Classification (e.g. employee or position)
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of Employment Classification (e.g. employee or position)")
    private EmploymentClassifications.Type type;
    /**
     * Code
     * <p>
     * The code that designates the employment classification.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that designates the employment classification.")
    private String code;

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

    public EmploymentClassifications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Employment Classification
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
     * The global identifier of the Employment Classification
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmploymentClassifications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the Employment Classification
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
     * The full name of the Employment Classification
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EmploymentClassifications withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the Employment Classification
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the Employment Classification
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EmploymentClassifications withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of Employment Classification (e.g. employee or position)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public EmploymentClassifications.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of Employment Classification (e.g. employee or position)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(EmploymentClassifications.Type type) {
        this.type = type;
    }

    public EmploymentClassifications withType(EmploymentClassifications.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that designates the employment classification.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that designates the employment classification.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EmploymentClassifications withCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentClassifications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentClassifications) == false) {
            return false;
        }
        EmploymentClassifications rhs = ((EmploymentClassifications) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type of Employment Classification (e.g. employee or position)
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        EMPLOYEE("employee"),
        POSITION("position");
        private final String value;
        private final static Map<String, EmploymentClassifications.Type> CONSTANTS = new HashMap<String, EmploymentClassifications.Type>();

        static {
            for (EmploymentClassifications.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static EmploymentClassifications.Type fromValue(String value) {
            EmploymentClassifications.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
