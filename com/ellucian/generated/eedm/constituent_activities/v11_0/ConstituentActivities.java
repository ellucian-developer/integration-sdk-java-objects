
package com.ellucian.generated.eedm.constituent_activities.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Activities
 * <p>
 * Activity in which a constituent may be involved.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "category",
    "institutionUnits",
    "campus"
})
@Generated("jsonschema2pojo")
public class ConstituentActivities {

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
     * The global identifier of the constituent activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent activity.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the constituent activity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the constituent activity.")
    private String title;
    /**
     * Description
     * <p>
     * The full description of the constituent activity.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The full description of the constituent activity.")
    private String description;
    /**
     * Activity Category
     * <p>
     * The category (e.g. sports, civics, arts, etc.) of the constituent activity.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category (e.g. sports, civics, arts, etc.) of the constituent activity.")
    private Object category;
    /**
     * Institution Units
     * <p>
     * A list of educational institution units associated with the activity.
     * 
     */
    @JsonProperty("institutionUnits")
    @JsonPropertyDescription("A list of educational institution units associated with the activity.")
    private List<InstitutionUnit> institutionUnits = new ArrayList<InstitutionUnit>();
    /**
     * Campus
     * <p>
     * The campus where the activity occurs.
     * 
     */
    @JsonProperty("campus")
    @JsonPropertyDescription("The campus where the activity occurs.")
    private Object campus;

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

    public ConstituentActivities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent activity.
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
     * The global identifier of the constituent activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentActivities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the constituent activity.
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
     * The full name of the constituent activity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ConstituentActivities withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent activity.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent activity.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentActivities withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Activity Category
     * <p>
     * The category (e.g. sports, civics, arts, etc.) of the constituent activity.
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Activity Category
     * <p>
     * The category (e.g. sports, civics, arts, etc.) of the constituent activity.
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public ConstituentActivities withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Institution Units
     * <p>
     * A list of educational institution units associated with the activity.
     * 
     */
    @JsonProperty("institutionUnits")
    public List<InstitutionUnit> getInstitutionUnits() {
        return institutionUnits;
    }

    /**
     * Institution Units
     * <p>
     * A list of educational institution units associated with the activity.
     * 
     */
    @JsonProperty("institutionUnits")
    public void setInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
    }

    public ConstituentActivities withInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
        return this;
    }

    /**
     * Campus
     * <p>
     * The campus where the activity occurs.
     * 
     */
    @JsonProperty("campus")
    public Object getCampus() {
        return campus;
    }

    /**
     * Campus
     * <p>
     * The campus where the activity occurs.
     * 
     */
    @JsonProperty("campus")
    public void setCampus(Object campus) {
        this.campus = campus;
    }

    public ConstituentActivities withCampus(Object campus) {
        this.campus = campus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentActivities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("institutionUnits");
        sb.append('=');
        sb.append(((this.institutionUnits == null)?"<null>":this.institutionUnits));
        sb.append(',');
        sb.append("campus");
        sb.append('=');
        sb.append(((this.campus == null)?"<null>":this.campus));
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
        result = ((result* 31)+((this.institutionUnits == null)? 0 :this.institutionUnits.hashCode()));
        result = ((result* 31)+((this.campus == null)? 0 :this.campus.hashCode()));
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
        if ((other instanceof ConstituentActivities) == false) {
            return false;
        }
        ConstituentActivities rhs = ((ConstituentActivities) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.institutionUnits == rhs.institutionUnits)||((this.institutionUnits!= null)&&this.institutionUnits.equals(rhs.institutionUnits))))&&((this.campus == rhs.campus)||((this.campus!= null)&&this.campus.equals(rhs.campus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
