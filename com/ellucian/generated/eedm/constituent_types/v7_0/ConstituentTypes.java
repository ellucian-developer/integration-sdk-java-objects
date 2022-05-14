
package com.ellucian.generated.eedm.constituent_types.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Types
 * <p>
 * A categorization of a constituent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "reporting",
    "institutionalPriorityRank"
})
@Generated("jsonschema2pojo")
public class ConstituentTypes {

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
     * The global identifier of a constituent type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a constituent type.")
    private String id;
    /**
     * Title
     * <p>
     * The title of the constituent type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the constituent type.")
    private String title;
    /**
     * Description
     * <p>
     * The full description of the constituent type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The full description of the constituent type.")
    private String description;
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
     * Institutional Priority Rank
     * <p>
     * The number that represents the institutional priority rank assigned to the constituent type.
     * 
     */
    @JsonProperty("institutionalPriorityRank")
    @JsonPropertyDescription("The number that represents the institutional priority rank assigned to the constituent type.")
    private Object institutionalPriorityRank;

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

    public ConstituentTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a constituent type.
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
     * The global identifier of a constituent type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of the constituent type.
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
     * The title of the constituent type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ConstituentTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The full description of the constituent type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentTypes withDescription(String description) {
        this.description = description;
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

    public ConstituentTypes withReporting(List<Reporting> reporting) {
        this.reporting = reporting;
        return this;
    }

    /**
     * Institutional Priority Rank
     * <p>
     * The number that represents the institutional priority rank assigned to the constituent type.
     * 
     */
    @JsonProperty("institutionalPriorityRank")
    public Object getInstitutionalPriorityRank() {
        return institutionalPriorityRank;
    }

    /**
     * Institutional Priority Rank
     * <p>
     * The number that represents the institutional priority rank assigned to the constituent type.
     * 
     */
    @JsonProperty("institutionalPriorityRank")
    public void setInstitutionalPriorityRank(Object institutionalPriorityRank) {
        this.institutionalPriorityRank = institutionalPriorityRank;
    }

    public ConstituentTypes withInstitutionalPriorityRank(Object institutionalPriorityRank) {
        this.institutionalPriorityRank = institutionalPriorityRank;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("reporting");
        sb.append('=');
        sb.append(((this.reporting == null)?"<null>":this.reporting));
        sb.append(',');
        sb.append("institutionalPriorityRank");
        sb.append('=');
        sb.append(((this.institutionalPriorityRank == null)?"<null>":this.institutionalPriorityRank));
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
        result = ((result* 31)+((this.institutionalPriorityRank == null)? 0 :this.institutionalPriorityRank.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentTypes) == false) {
            return false;
        }
        ConstituentTypes rhs = ((ConstituentTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.institutionalPriorityRank == rhs.institutionalPriorityRank)||((this.institutionalPriorityRank!= null)&&this.institutionalPriorityRank.equals(rhs.institutionalPriorityRank))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))));
    }

}
