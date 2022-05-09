
package com.ellucian.generated.eedm.constituent_organizations.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "name",
    "preference"
})
@Generated("jsonschema2pojo")
public class OrganizationName {

    /**
     * type
     * <p>
     * The type of a organization's name being defined. For example, a 'Primary' name.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of a organization's name being defined. For example, a 'Primary' name.")
    private Object type;
    /**
     * Name
     * <p>
     * The organization's name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The organization's name.")
    private String name;
    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the organization. Only one name should be preferred per organization.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the preferred name for the organization. Only one name should be preferred per organization.")
    private Object preference;

    /**
     * type
     * <p>
     * The type of a organization's name being defined. For example, a 'Primary' name.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * type
     * <p>
     * The type of a organization's name being defined. For example, a 'Primary' name.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public OrganizationName withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Name
     * <p>
     * The organization's name.
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
     * The organization's name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public OrganizationName withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the organization. Only one name should be preferred per organization.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the organization. Only one name should be preferred per organization.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public OrganizationName withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationName) == false) {
            return false;
        }
        OrganizationName rhs = ((OrganizationName) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
