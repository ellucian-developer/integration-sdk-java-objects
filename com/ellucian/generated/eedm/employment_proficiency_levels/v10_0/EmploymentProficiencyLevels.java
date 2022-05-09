
package com.ellucian.generated.eedm.employment_proficiency_levels.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employment Proficiency Levels
 * <p>
 * The valid list of user defined employment proficiency levels.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "proficiency",
    "rank"
})
@Generated("jsonschema2pojo")
public class EmploymentProficiencyLevels {

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
     * The global identifier of the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employment proficiency level.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the employment proficiency level.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the employment proficiency level.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the employment proficiency level.")
    private String description;
    /**
     * Proficiency
     * <p>
     * The proficiency associated with the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    @JsonPropertyDescription("The proficiency associated with the employment proficiency level.")
    private Proficiency proficiency;
    /**
     * Rank
     * <p>
     * The rank associated with the employment proficiency level.
     * 
     */
    @JsonProperty("rank")
    @JsonPropertyDescription("The rank associated with the employment proficiency level.")
    private Object rank;

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

    public EmploymentProficiencyLevels withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employment proficiency level.
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
     * The global identifier of the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmploymentProficiencyLevels withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the employment proficiency level.
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
     * The full name of the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EmploymentProficiencyLevels withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the employment proficiency level.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the employment proficiency level.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EmploymentProficiencyLevels withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Proficiency
     * <p>
     * The proficiency associated with the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    public Proficiency getProficiency() {
        return proficiency;
    }

    /**
     * Proficiency
     * <p>
     * The proficiency associated with the employment proficiency level.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    public EmploymentProficiencyLevels withProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
        return this;
    }

    /**
     * Rank
     * <p>
     * The rank associated with the employment proficiency level.
     * 
     */
    @JsonProperty("rank")
    public Object getRank() {
        return rank;
    }

    /**
     * Rank
     * <p>
     * The rank associated with the employment proficiency level.
     * 
     */
    @JsonProperty("rank")
    public void setRank(Object rank) {
        this.rank = rank;
    }

    public EmploymentProficiencyLevels withRank(Object rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentProficiencyLevels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("proficiency");
        sb.append('=');
        sb.append(((this.proficiency == null)?"<null>":this.proficiency));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
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
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.proficiency == null)? 0 :this.proficiency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentProficiencyLevels) == false) {
            return false;
        }
        EmploymentProficiencyLevels rhs = ((EmploymentProficiencyLevels) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.proficiency == rhs.proficiency)||((this.proficiency!= null)&&this.proficiency.equals(rhs.proficiency))));
    }

}
