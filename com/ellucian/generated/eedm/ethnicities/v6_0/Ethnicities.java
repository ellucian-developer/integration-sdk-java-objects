
package com.ellucian.generated.eedm.ethnicities.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Ethnicities
 * <p>
 * A person’s association to a social group that shares a common or distinctive cultural, religious, language, or other tradition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "description",
    "reporting"
})
@Generated("jsonschema2pojo")
public class Ethnicities {

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
     * A global identifier of an ethnicity for use in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of an ethnicity for use in all external references.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of an ethnicity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an ethnicity.")
    private String title;
    /**
     * code
     * <p>
     * A human-readable reference code to identify a particular ethnicity.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A human-readable reference code to identify a particular ethnicity.")
    private String code;
    /**
     * Description
     * <p>
     * A description of the substance and nature of an ethnicity.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the substance and nature of an ethnicity.")
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

    public Ethnicities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of an ethnicity for use in all external references.
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
     * A global identifier of an ethnicity for use in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Ethnicities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an ethnicity.
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
     * The full name of an ethnicity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Ethnicities withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * code
     * <p>
     * A human-readable reference code to identify a particular ethnicity.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * code
     * <p>
     * A human-readable reference code to identify a particular ethnicity.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Ethnicities withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of an ethnicity.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of an ethnicity.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Ethnicities withDescription(String description) {
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

    public Ethnicities withReporting(List<Reporting> reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ethnicities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
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
        if ((other instanceof Ethnicities) == false) {
            return false;
        }
        Ethnicities rhs = ((Ethnicities) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))));
    }

}
