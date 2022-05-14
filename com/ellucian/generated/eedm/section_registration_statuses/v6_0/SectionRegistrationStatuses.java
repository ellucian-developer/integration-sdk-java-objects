
package com.ellucian.generated.eedm.section_registration_statuses.v6_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Registration Statuses
 * <p>
 * A person's status with regard to registering for an activity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "status"
})
@Generated("jsonschema2pojo")
public class SectionRegistrationStatuses {

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
     * A global identifier of the status
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of the status")
    private String id;
    /**
     * Code
     * <p>
     * The code for the status. This is generally unique within all registration statuses.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code for the status. This is generally unique within all registration statuses.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of the status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the status.")
    private String title;
    /**
     * Description
     * <p>
     * A description of the status.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the status.")
    private String description;
    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Object status;

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

    public SectionRegistrationStatuses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of the status
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
     * A global identifier of the status
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionRegistrationStatuses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * The code for the status. This is generally unique within all registration statuses.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code for the status. This is generally unique within all registration statuses.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SectionRegistrationStatuses withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the status.
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
     * The full name of the status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SectionRegistrationStatuses withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of the status.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the status.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SectionRegistrationStatuses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public SectionRegistrationStatuses withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRegistrationStatuses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRegistrationStatuses) == false) {
            return false;
        }
        SectionRegistrationStatuses rhs = ((SectionRegistrationStatuses) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
