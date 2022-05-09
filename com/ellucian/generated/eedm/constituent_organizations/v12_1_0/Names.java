
package com.ellucian.generated.eedm.constituent_organizations.v12_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Names
 * <p>
 * The names associated with an organizations, specified by type (for example, "legal" or "birth").
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organizationNames",
    "formattedNames"
})
@Generated("jsonschema2pojo")
public class Names {

    /**
     * Organization Names
     * <p>
     * The names commonly used by the organization.
     * (Required)
     * 
     */
    @JsonProperty("organizationNames")
    @JsonPropertyDescription("The names commonly used by the organization.")
    private List<OrganizationName> organizationNames = new ArrayList<OrganizationName>();
    /**
     * Formatted Names
     * <p>
     * The formatted names associated with the constituent.
     * 
     */
    @JsonProperty("formattedNames")
    @JsonPropertyDescription("The formatted names associated with the constituent.")
    private List<FormattedName> formattedNames = new ArrayList<FormattedName>();

    /**
     * Organization Names
     * <p>
     * The names commonly used by the organization.
     * (Required)
     * 
     */
    @JsonProperty("organizationNames")
    public List<OrganizationName> getOrganizationNames() {
        return organizationNames;
    }

    /**
     * Organization Names
     * <p>
     * The names commonly used by the organization.
     * (Required)
     * 
     */
    @JsonProperty("organizationNames")
    public void setOrganizationNames(List<OrganizationName> organizationNames) {
        this.organizationNames = organizationNames;
    }

    public Names withOrganizationNames(List<OrganizationName> organizationNames) {
        this.organizationNames = organizationNames;
        return this;
    }

    /**
     * Formatted Names
     * <p>
     * The formatted names associated with the constituent.
     * 
     */
    @JsonProperty("formattedNames")
    public List<FormattedName> getFormattedNames() {
        return formattedNames;
    }

    /**
     * Formatted Names
     * <p>
     * The formatted names associated with the constituent.
     * 
     */
    @JsonProperty("formattedNames")
    public void setFormattedNames(List<FormattedName> formattedNames) {
        this.formattedNames = formattedNames;
    }

    public Names withFormattedNames(List<FormattedName> formattedNames) {
        this.formattedNames = formattedNames;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Names.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("organizationNames");
        sb.append('=');
        sb.append(((this.organizationNames == null)?"<null>":this.organizationNames));
        sb.append(',');
        sb.append("formattedNames");
        sb.append('=');
        sb.append(((this.formattedNames == null)?"<null>":this.formattedNames));
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
        result = ((result* 31)+((this.organizationNames == null)? 0 :this.organizationNames.hashCode()));
        result = ((result* 31)+((this.formattedNames == null)? 0 :this.formattedNames.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Names) == false) {
            return false;
        }
        Names rhs = ((Names) other);
        return (((this.organizationNames == rhs.organizationNames)||((this.organizationNames!= null)&&this.organizationNames.equals(rhs.organizationNames)))&&((this.formattedNames == rhs.formattedNames)||((this.formattedNames!= null)&&this.formattedNames.equals(rhs.formattedNames))));
    }

}
