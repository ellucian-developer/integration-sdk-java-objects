
package com.ellucian.generated.eedm.employment_proficiencies.v10_0;

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
 * Employment Proficiencies
 * <p>
 * Information about proficiencies (skills, certifications, and examinations) associated with employment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "type",
    "licensing",
    "licensingAuthority"
})
@Generated("jsonschema2pojo")
public class EmploymentProficiencies {

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
     * The global identifier of the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employment proficiency.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the employment proficiency.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the employment proficiency.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the employment proficiency.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the employment proficiency.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the employment proficiency.")
    private String code;
    /**
     * Type
     * <p>
     * The type of employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of employment proficiency.")
    private EmploymentProficiencies.Type type;
    /**
     * Licensing
     * <p>
     * An indication if a license is required for the employment proficiency.
     * 
     */
    @JsonProperty("licensing")
    @JsonPropertyDescription("An indication if a license is required for the employment proficiency.")
    private Object licensing;
    /**
     * Licensing Authority
     * <p>
     * The authority that licenses the employment proficiency.
     * 
     */
    @JsonProperty("licensingAuthority")
    @JsonPropertyDescription("The authority that licenses the employment proficiency.")
    private Object licensingAuthority;

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

    public EmploymentProficiencies withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employment proficiency.
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
     * The global identifier of the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmploymentProficiencies withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the employment proficiency.
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
     * The full name of the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EmploymentProficiencies withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the employment proficiency.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the employment proficiency.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EmploymentProficiencies withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the employment proficiency.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the employment proficiency.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EmploymentProficiencies withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public EmploymentProficiencies.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(EmploymentProficiencies.Type type) {
        this.type = type;
    }

    public EmploymentProficiencies withType(EmploymentProficiencies.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Licensing
     * <p>
     * An indication if a license is required for the employment proficiency.
     * 
     */
    @JsonProperty("licensing")
    public Object getLicensing() {
        return licensing;
    }

    /**
     * Licensing
     * <p>
     * An indication if a license is required for the employment proficiency.
     * 
     */
    @JsonProperty("licensing")
    public void setLicensing(Object licensing) {
        this.licensing = licensing;
    }

    public EmploymentProficiencies withLicensing(Object licensing) {
        this.licensing = licensing;
        return this;
    }

    /**
     * Licensing Authority
     * <p>
     * The authority that licenses the employment proficiency.
     * 
     */
    @JsonProperty("licensingAuthority")
    public Object getLicensingAuthority() {
        return licensingAuthority;
    }

    /**
     * Licensing Authority
     * <p>
     * The authority that licenses the employment proficiency.
     * 
     */
    @JsonProperty("licensingAuthority")
    public void setLicensingAuthority(Object licensingAuthority) {
        this.licensingAuthority = licensingAuthority;
    }

    public EmploymentProficiencies withLicensingAuthority(Object licensingAuthority) {
        this.licensingAuthority = licensingAuthority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentProficiencies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("licensing");
        sb.append('=');
        sb.append(((this.licensing == null)?"<null>":this.licensing));
        sb.append(',');
        sb.append("licensingAuthority");
        sb.append('=');
        sb.append(((this.licensingAuthority == null)?"<null>":this.licensingAuthority));
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
        result = ((result* 31)+((this.licensingAuthority == null)? 0 :this.licensingAuthority.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.licensing == null)? 0 :this.licensing.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentProficiencies) == false) {
            return false;
        }
        EmploymentProficiencies rhs = ((EmploymentProficiencies) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.licensingAuthority == rhs.licensingAuthority)||((this.licensingAuthority!= null)&&this.licensingAuthority.equals(rhs.licensingAuthority))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.licensing == rhs.licensing)||((this.licensing!= null)&&this.licensing.equals(rhs.licensing))));
    }


    /**
     * Type
     * <p>
     * The type of employment proficiency.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SKILL("skill"),
        CERTIFICATION("certification"),
        EXAMINATION("examination");
        private final String value;
        private final static Map<String, EmploymentProficiencies.Type> CONSTANTS = new HashMap<String, EmploymentProficiencies.Type>();

        static {
            for (EmploymentProficiencies.Type c: values()) {
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
        public static EmploymentProficiencies.Type fromValue(String value) {
            EmploymentProficiencies.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
