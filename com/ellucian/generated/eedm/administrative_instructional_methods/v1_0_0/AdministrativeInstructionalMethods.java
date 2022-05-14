
package com.ellucian.generated.eedm.administrative_instructional_methods.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Administrative Instructional Methods
 * <p>
 * The methods, styles, or formats for which hours are established.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "instructionalMethod"
})
@Generated("jsonschema2pojo")
public class AdministrativeInstructionalMethods {

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
     * The global identifier of the administrative instructional method.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the administrative instructional method.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the administrative instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the administrative instructional method.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the administrative instructional method.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the administrative instructional method.")
    private String description;
    /**
     * Code
     * <p>
     * The code used to identify the administrative instructional method.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the administrative instructional method.")
    private String code;
    /**
     * Instructional Method
     * <p>
     * The instructional method associated with the administrative instructional method.
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("The instructional method associated with the administrative instructional method.")
    private Object instructionalMethod;

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

    public AdministrativeInstructionalMethods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the administrative instructional method.
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
     * The global identifier of the administrative instructional method.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdministrativeInstructionalMethods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the administrative instructional method.
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
     * The full name of the administrative instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdministrativeInstructionalMethods withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the administrative instructional method.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the administrative instructional method.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdministrativeInstructionalMethods withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the administrative instructional method.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the administrative instructional method.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdministrativeInstructionalMethods withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * The instructional method associated with the administrative instructional method.
     * 
     */
    @JsonProperty("instructionalMethod")
    public Object getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * The instructional method associated with the administrative instructional method.
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public AdministrativeInstructionalMethods withInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdministrativeInstructionalMethods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
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
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministrativeInstructionalMethods) == false) {
            return false;
        }
        AdministrativeInstructionalMethods rhs = ((AdministrativeInstructionalMethods) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
