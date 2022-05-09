
package com.ellucian.generated.eedm.constituent_persons.v7_0;

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
 * The names associated with a person, specified by type (for example, "legal" or "birth").
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personalNames",
    "surnames",
    "formattedNames",
    "institutionalSuffixes"
})
@Generated("jsonschema2pojo")
public class Names {

    /**
     * Personal Names
     * <p>
     * The names commonly used by the constituent.
     * (Required)
     * 
     */
    @JsonProperty("personalNames")
    @JsonPropertyDescription("The names commonly used by the constituent.")
    private List<PersonalName> personalNames = new ArrayList<PersonalName>();
    /**
     * Surnames
     * <p>
     * The surnames/family names of the constituent.
     * 
     */
    @JsonProperty("surnames")
    @JsonPropertyDescription("The surnames/family names of the constituent.")
    private List<Surname> surnames = new ArrayList<Surname>();
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
     * Institutional Suffixes
     * <p>
     * The suffixes that institutions may use when addressing a constituent.
     * 
     */
    @JsonProperty("institutionalSuffixes")
    @JsonPropertyDescription("The suffixes that institutions may use when addressing a constituent.")
    private List<InstitutionalSuffix> institutionalSuffixes = new ArrayList<InstitutionalSuffix>();

    /**
     * Personal Names
     * <p>
     * The names commonly used by the constituent.
     * (Required)
     * 
     */
    @JsonProperty("personalNames")
    public List<PersonalName> getPersonalNames() {
        return personalNames;
    }

    /**
     * Personal Names
     * <p>
     * The names commonly used by the constituent.
     * (Required)
     * 
     */
    @JsonProperty("personalNames")
    public void setPersonalNames(List<PersonalName> personalNames) {
        this.personalNames = personalNames;
    }

    public Names withPersonalNames(List<PersonalName> personalNames) {
        this.personalNames = personalNames;
        return this;
    }

    /**
     * Surnames
     * <p>
     * The surnames/family names of the constituent.
     * 
     */
    @JsonProperty("surnames")
    public List<Surname> getSurnames() {
        return surnames;
    }

    /**
     * Surnames
     * <p>
     * The surnames/family names of the constituent.
     * 
     */
    @JsonProperty("surnames")
    public void setSurnames(List<Surname> surnames) {
        this.surnames = surnames;
    }

    public Names withSurnames(List<Surname> surnames) {
        this.surnames = surnames;
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

    /**
     * Institutional Suffixes
     * <p>
     * The suffixes that institutions may use when addressing a constituent.
     * 
     */
    @JsonProperty("institutionalSuffixes")
    public List<InstitutionalSuffix> getInstitutionalSuffixes() {
        return institutionalSuffixes;
    }

    /**
     * Institutional Suffixes
     * <p>
     * The suffixes that institutions may use when addressing a constituent.
     * 
     */
    @JsonProperty("institutionalSuffixes")
    public void setInstitutionalSuffixes(List<InstitutionalSuffix> institutionalSuffixes) {
        this.institutionalSuffixes = institutionalSuffixes;
    }

    public Names withInstitutionalSuffixes(List<InstitutionalSuffix> institutionalSuffixes) {
        this.institutionalSuffixes = institutionalSuffixes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Names.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personalNames");
        sb.append('=');
        sb.append(((this.personalNames == null)?"<null>":this.personalNames));
        sb.append(',');
        sb.append("surnames");
        sb.append('=');
        sb.append(((this.surnames == null)?"<null>":this.surnames));
        sb.append(',');
        sb.append("formattedNames");
        sb.append('=');
        sb.append(((this.formattedNames == null)?"<null>":this.formattedNames));
        sb.append(',');
        sb.append("institutionalSuffixes");
        sb.append('=');
        sb.append(((this.institutionalSuffixes == null)?"<null>":this.institutionalSuffixes));
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
        result = ((result* 31)+((this.institutionalSuffixes == null)? 0 :this.institutionalSuffixes.hashCode()));
        result = ((result* 31)+((this.personalNames == null)? 0 :this.personalNames.hashCode()));
        result = ((result* 31)+((this.surnames == null)? 0 :this.surnames.hashCode()));
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
        return (((((this.institutionalSuffixes == rhs.institutionalSuffixes)||((this.institutionalSuffixes!= null)&&this.institutionalSuffixes.equals(rhs.institutionalSuffixes)))&&((this.personalNames == rhs.personalNames)||((this.personalNames!= null)&&this.personalNames.equals(rhs.personalNames))))&&((this.surnames == rhs.surnames)||((this.surnames!= null)&&this.surnames.equals(rhs.surnames))))&&((this.formattedNames == rhs.formattedNames)||((this.formattedNames!= null)&&this.formattedNames.equals(rhs.formattedNames))));
    }

}
