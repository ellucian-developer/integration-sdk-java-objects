
package com.ellucian.generated.eedm.campus_organizations.v7_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Campus Organizations
 * <p>
 * Organizations involved in extra curricular activities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "name",
    "parentOrganization",
    "code",
    "type"
})
@Generated("jsonschema2pojo")
public class CampusOrganizations {

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
     * The global identifier of the Campus Organizations.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Campus Organizations.")
    private String id;
    /**
     * Name
     * <p>
     * Name of the Campus Organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Campus Organization.")
    private String name;
    /**
     * Parent Organization
     * <p>
     * Parent organization to which the campus organization comes under.
     * 
     */
    @JsonProperty("parentOrganization")
    @JsonPropertyDescription("Parent organization to which the campus organization comes under.")
    private Object parentOrganization;
    /**
     * Code
     * <p>
     * The generally unique code for a campus organization.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The generally unique code for a campus organization.")
    private String code;
    /**
     * Type
     * <p>
     * Type of the organizations (eg: athletic, culture)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the organizations (eg: athletic, culture)")
    private Object type;

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

    public CampusOrganizations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Campus Organizations.
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
     * The global identifier of the Campus Organizations.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CampusOrganizations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * Name of the Campus Organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Name of the Campus Organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CampusOrganizations withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Parent Organization
     * <p>
     * Parent organization to which the campus organization comes under.
     * 
     */
    @JsonProperty("parentOrganization")
    public Object getParentOrganization() {
        return parentOrganization;
    }

    /**
     * Parent Organization
     * <p>
     * Parent organization to which the campus organization comes under.
     * 
     */
    @JsonProperty("parentOrganization")
    public void setParentOrganization(Object parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public CampusOrganizations withParentOrganization(Object parentOrganization) {
        this.parentOrganization = parentOrganization;
        return this;
    }

    /**
     * Code
     * <p>
     * The generally unique code for a campus organization.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The generally unique code for a campus organization.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CampusOrganizations withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of the organizations (eg: athletic, culture)
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the organizations (eg: athletic, culture)
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public CampusOrganizations withType(Object type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CampusOrganizations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("parentOrganization");
        sb.append('=');
        sb.append(((this.parentOrganization == null)?"<null>":this.parentOrganization));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.parentOrganization == null)? 0 :this.parentOrganization.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampusOrganizations) == false) {
            return false;
        }
        CampusOrganizations rhs = ((CampusOrganizations) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.parentOrganization == rhs.parentOrganization)||((this.parentOrganization!= null)&&this.parentOrganization.equals(rhs.parentOrganization))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
