
package com.ellucian.generated.eedm.geographic_areas.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Geographic Areas
 * <p>
 * A geographic area defined for a specific purpose.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "code",
    "includedAreas"
})
@Generated("jsonschema2pojo")
public class GeographicAreas {

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
     * Id
     * <p>
     * The global identifier of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a geographic area.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a geographic area.")
    private String title;
    /**
     * Description
     * <p>
     * The description of a geographic area.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a geographic area.")
    private String description;
    /**
     * Type
     * <p>
     * The type of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of a geographic area.")
    private Type type;
    /**
     * Code
     * <p>
     * The code of the area.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the area.")
    private String code;
    /**
     * Included Areas
     * <p>
     * Areas included in this instance.
     * 
     */
    @JsonProperty("includedAreas")
    @JsonPropertyDescription("Areas included in this instance.")
    private List<IncludedArea> includedAreas = new ArrayList<IncludedArea>();

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

    public GeographicAreas withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Id
     * <p>
     * The global identifier of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * The global identifier of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeographicAreas withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a geographic area.
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
     * The full name of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GeographicAreas withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a geographic area.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a geographic area.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GeographicAreas withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of a geographic area.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public GeographicAreas withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the area.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the area.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GeographicAreas withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Included Areas
     * <p>
     * Areas included in this instance.
     * 
     */
    @JsonProperty("includedAreas")
    public List<IncludedArea> getIncludedAreas() {
        return includedAreas;
    }

    /**
     * Included Areas
     * <p>
     * Areas included in this instance.
     * 
     */
    @JsonProperty("includedAreas")
    public void setIncludedAreas(List<IncludedArea> includedAreas) {
        this.includedAreas = includedAreas;
    }

    public GeographicAreas withIncludedAreas(List<IncludedArea> includedAreas) {
        this.includedAreas = includedAreas;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeographicAreas.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("includedAreas");
        sb.append('=');
        sb.append(((this.includedAreas == null)?"<null>":this.includedAreas));
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
        result = ((result* 31)+((this.includedAreas == null)? 0 :this.includedAreas.hashCode()));
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
        if ((other instanceof GeographicAreas) == false) {
            return false;
        }
        GeographicAreas rhs = ((GeographicAreas) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.includedAreas == rhs.includedAreas)||((this.includedAreas!= null)&&this.includedAreas.equals(rhs.includedAreas))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
