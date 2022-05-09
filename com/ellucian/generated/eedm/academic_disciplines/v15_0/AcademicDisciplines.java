
package com.ellucian.generated.eedm.academic_disciplines.v15_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Academic Disciplines
 * <p>
 * A range of academic disciplines offered by an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "abbreviation",
    "title",
    "description",
    "type",
    "reporting"
})
@Generated("jsonschema2pojo")
public class AcademicDisciplines {

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
     * A global identifier for an academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier for an academic discipline.")
    private String id;
    /**
     * Abbreviation
     * <p>
     * An abbreviation that identifies an academic discipline.
     * 
     */
    @JsonProperty("abbreviation")
    @JsonPropertyDescription("An abbreviation that identifies an academic discipline.")
    private String abbreviation;
    /**
     * Title
     * <p>
     * The full name of an academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an academic discipline.")
    private String title;
    /**
     * Description
     * <p>
     * A full description of an academic discipline.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A full description of an academic discipline.")
    private String description;
    /**
     * Type
     * <p>
     * A type of academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of academic discipline.")
    private AcademicDisciplines.Type type;
    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    @JsonPropertyDescription("Properties required for governmental or other reporting.")
    private List<Reporting> reporting = new ArrayList<Reporting>();

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

    public AcademicDisciplines withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier for an academic discipline.
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
     * A global identifier for an academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicDisciplines withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * An abbreviation that identifies an academic discipline.
     * 
     */
    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Abbreviation
     * <p>
     * An abbreviation that identifies an academic discipline.
     * 
     */
    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public AcademicDisciplines withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an academic discipline.
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
     * The full name of an academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicDisciplines withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A full description of an academic discipline.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A full description of an academic discipline.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicDisciplines withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * A type of academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AcademicDisciplines.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of academic discipline.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AcademicDisciplines.Type type) {
        this.type = type;
    }

    public AcademicDisciplines withType(AcademicDisciplines.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public List<Reporting> getReporting() {
        return reporting;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public void setReporting(List<Reporting> reporting) {
        this.reporting = reporting;
    }

    public AcademicDisciplines withReporting(List<Reporting> reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicDisciplines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("abbreviation");
        sb.append('=');
        sb.append(((this.abbreviation == null)?"<null>":this.abbreviation));
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
        sb.append("reporting");
        sb.append('=');
        sb.append(((this.reporting == null)?"<null>":this.reporting));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicDisciplines) == false) {
            return false;
        }
        AcademicDisciplines rhs = ((AcademicDisciplines) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))));
    }


    /**
     * Type
     * <p>
     * A type of academic discipline.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        MINOR("minor"),
        MAJOR("major"),
        CONCENTRATION("concentration");
        private final String value;
        private final static Map<String, AcademicDisciplines.Type> CONSTANTS = new HashMap<String, AcademicDisciplines.Type>();

        static {
            for (AcademicDisciplines.Type c: values()) {
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
        public static AcademicDisciplines.Type fromValue(String value) {
            AcademicDisciplines.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
