
package com.ellucian.generated.eedm.instructional_methods.v6_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instructional Methods
 * <p>
 * A method, style, or format in which a course is taught. A 'lecture' method describes a course that is taught in the format of a lecture.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "abbreviation",
    "title",
    "description"
})
@Generated("jsonschema2pojo")
public class InstructionalMethods {

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
     * A global identifier of an instructional method to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of an instructional method to be used in all external references.")
    private String id;
    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name to an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    @JsonPropertyDescription("Human-readable abbreviated name to an instructional method.")
    private String abbreviation;
    /**
     * Title
     * <p>
     * The full name of an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an instructional method.")
    private String title;
    /**
     * Description
     * <p>
     * A description of an instructional method.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of an instructional method.")
    private String description;

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

    public InstructionalMethods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of an instructional method to be used in all external references.
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
     * A global identifier of an instructional method to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InstructionalMethods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name to an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name to an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public InstructionalMethods withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an instructional method.
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
     * The full name of an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public InstructionalMethods withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of an instructional method.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of an instructional method.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public InstructionalMethods withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalMethods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionalMethods) == false) {
            return false;
        }
        InstructionalMethods rhs = ((InstructionalMethods) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
