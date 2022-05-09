
package com.ellucian.generated.eedm.academic_catalogs.v6_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Academic Catalogs
 * <p>
 * A catalog listing of the courses offered by an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "startOn",
    "endOn",
    "status",
    "institution",
    "academicPrograms"
})
@Generated("jsonschema2pojo")
public class AcademicCatalogs {

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
     * A global identifier of an academic catalog for use in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of an academic catalog for use in all external references.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of an academic catalog.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an academic catalog.")
    private String title;
    /**
     * Description
     * <p>
     * A full description of an academic catalog.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A full description of an academic catalog.")
    private String description;
    /**
     * Code
     * <p>
     * The code that identifies an academic catalog.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies an academic catalog.")
    private String code;
    /**
     * Start Date
     * <p>
     * The beginning date for when an academic catalog takes effect.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The beginning date for when an academic catalog takes effect.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The ending date for when an academic catalog is no longer in effect.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The ending date for when an academic catalog is no longer in effect.")
    private Object endOn;
    /**
     * Status
     * <p>
     * A status of an academic catalog. Not currently in use.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A status of an academic catalog. Not currently in use.")
    private Object status;
    /**
     * Institution
     * <p>
     * The educational institution that owns the academic catalog
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The educational institution that owns the academic catalog")
    private Object institution;
    /**
     * Academic Programs
     * <p>
     * Academic programs that make up the catalog.
     * 
     */
    @JsonProperty("academicPrograms")
    @JsonPropertyDescription("Academic programs that make up the catalog.")
    private List<AcademicProgram> academicPrograms = new ArrayList<AcademicProgram>();

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

    public AcademicCatalogs withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of an academic catalog for use in all external references.
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
     * A global identifier of an academic catalog for use in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicCatalogs withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an academic catalog.
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
     * The full name of an academic catalog.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicCatalogs withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A full description of an academic catalog.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A full description of an academic catalog.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicCatalogs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies an academic catalog.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies an academic catalog.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicCatalogs withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The beginning date for when an academic catalog takes effect.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The beginning date for when an academic catalog takes effect.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public AcademicCatalogs withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The ending date for when an academic catalog is no longer in effect.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The ending date for when an academic catalog is no longer in effect.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AcademicCatalogs withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * A status of an academic catalog. Not currently in use.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * A status of an academic catalog. Not currently in use.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public AcademicCatalogs withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Institution
     * <p>
     * The educational institution that owns the academic catalog
     * 
     */
    @JsonProperty("institution")
    public Object getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * The educational institution that owns the academic catalog
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Object institution) {
        this.institution = institution;
    }

    public AcademicCatalogs withInstitution(Object institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Academic Programs
     * <p>
     * Academic programs that make up the catalog.
     * 
     */
    @JsonProperty("academicPrograms")
    public List<AcademicProgram> getAcademicPrograms() {
        return academicPrograms;
    }

    /**
     * Academic Programs
     * <p>
     * Academic programs that make up the catalog.
     * 
     */
    @JsonProperty("academicPrograms")
    public void setAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
    }

    public AcademicCatalogs withAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicCatalogs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("academicPrograms");
        sb.append('=');
        sb.append(((this.academicPrograms == null)?"<null>":this.academicPrograms));
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
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.academicPrograms == null)? 0 :this.academicPrograms.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicCatalogs) == false) {
            return false;
        }
        AcademicCatalogs rhs = ((AcademicCatalogs) other);
        return (((((((((((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.academicPrograms == rhs.academicPrograms)||((this.academicPrograms!= null)&&this.academicPrograms.equals(rhs.academicPrograms))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
