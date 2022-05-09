
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Name
 * <p>
 * The applicant's name information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "middleName",
    "lastName",
    "lastNamePrefix",
    "suffix",
    "prefix",
    "alternateFirstNames",
    "alternateLastNames",
    "alternateMiddleNames",
    "preferredFirstName",
    "preferredLastName",
    "preferredMiddleName"
})
@Generated("jsonschema2pojo")
public class Name {

    /**
     * First Name
     * <p>
     * The applicant's first name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The applicant's first name.")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * The applicant's middle name.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("The applicant's middle name.")
    private String middleName;
    /**
     * Last Name
     * <p>
     * The applicant's last name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The applicant's last name.")
    private String lastName;
    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of an applicant's last name.
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("The article or preposition portion of an applicant's last name.")
    private String lastNamePrefix;
    /**
     * Suffix
     * <p>
     * The applicant's suffix.
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("The applicant's suffix.")
    private String suffix;
    /**
     * Prefix
     * <p>
     * The applicant's prefix.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("The applicant's prefix.")
    private String prefix;
    /**
     * Alternate First Names
     * <p>
     * Alternate first names for the applicant.
     * 
     */
    @JsonProperty("alternateFirstNames")
    @JsonPropertyDescription("Alternate first names for the applicant.")
    private List<String> alternateFirstNames = new ArrayList<String>();
    /**
     * Alternate Last Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateLastNames")
    @JsonPropertyDescription("Alternate last names for the applicant.")
    private List<String> alternateLastNames = new ArrayList<String>();
    /**
     * Alternate Middle Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateMiddleNames")
    @JsonPropertyDescription("Alternate last names for the applicant.")
    private List<String> alternateMiddleNames = new ArrayList<String>();
    /**
     * Preferred First Name
     * <p>
     * The applicant's preferred first name.
     * 
     */
    @JsonProperty("preferredFirstName")
    @JsonPropertyDescription("The applicant's preferred first name.")
    private String preferredFirstName;
    /**
     * Preferred Last Name
     * <p>
     * The applicant's preferred last name.
     * 
     */
    @JsonProperty("preferredLastName")
    @JsonPropertyDescription("The applicant's preferred last name.")
    private String preferredLastName;
    /**
     * Preferred Middle Name
     * <p>
     * The applicant's preferred middle name.
     * 
     */
    @JsonProperty("preferredMiddleName")
    @JsonPropertyDescription("The applicant's preferred middle name.")
    private String preferredMiddleName;

    /**
     * First Name
     * <p>
     * The applicant's first name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The applicant's first name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Name withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * The applicant's middle name.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * The applicant's middle name.
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Name withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The applicant's last name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The applicant's last name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of an applicant's last name.
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of an applicant's last name.
     * 
     */
    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public Name withLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    /**
     * Suffix
     * <p>
     * The applicant's suffix.
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix
     * <p>
     * The applicant's suffix.
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Name withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Prefix
     * <p>
     * The applicant's prefix.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix
     * <p>
     * The applicant's prefix.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Name withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Alternate First Names
     * <p>
     * Alternate first names for the applicant.
     * 
     */
    @JsonProperty("alternateFirstNames")
    public List<String> getAlternateFirstNames() {
        return alternateFirstNames;
    }

    /**
     * Alternate First Names
     * <p>
     * Alternate first names for the applicant.
     * 
     */
    @JsonProperty("alternateFirstNames")
    public void setAlternateFirstNames(List<String> alternateFirstNames) {
        this.alternateFirstNames = alternateFirstNames;
    }

    public Name withAlternateFirstNames(List<String> alternateFirstNames) {
        this.alternateFirstNames = alternateFirstNames;
        return this;
    }

    /**
     * Alternate Last Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateLastNames")
    public List<String> getAlternateLastNames() {
        return alternateLastNames;
    }

    /**
     * Alternate Last Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateLastNames")
    public void setAlternateLastNames(List<String> alternateLastNames) {
        this.alternateLastNames = alternateLastNames;
    }

    public Name withAlternateLastNames(List<String> alternateLastNames) {
        this.alternateLastNames = alternateLastNames;
        return this;
    }

    /**
     * Alternate Middle Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateMiddleNames")
    public List<String> getAlternateMiddleNames() {
        return alternateMiddleNames;
    }

    /**
     * Alternate Middle Names
     * <p>
     * Alternate last names for the applicant.
     * 
     */
    @JsonProperty("alternateMiddleNames")
    public void setAlternateMiddleNames(List<String> alternateMiddleNames) {
        this.alternateMiddleNames = alternateMiddleNames;
    }

    public Name withAlternateMiddleNames(List<String> alternateMiddleNames) {
        this.alternateMiddleNames = alternateMiddleNames;
        return this;
    }

    /**
     * Preferred First Name
     * <p>
     * The applicant's preferred first name.
     * 
     */
    @JsonProperty("preferredFirstName")
    public String getPreferredFirstName() {
        return preferredFirstName;
    }

    /**
     * Preferred First Name
     * <p>
     * The applicant's preferred first name.
     * 
     */
    @JsonProperty("preferredFirstName")
    public void setPreferredFirstName(String preferredFirstName) {
        this.preferredFirstName = preferredFirstName;
    }

    public Name withPreferredFirstName(String preferredFirstName) {
        this.preferredFirstName = preferredFirstName;
        return this;
    }

    /**
     * Preferred Last Name
     * <p>
     * The applicant's preferred last name.
     * 
     */
    @JsonProperty("preferredLastName")
    public String getPreferredLastName() {
        return preferredLastName;
    }

    /**
     * Preferred Last Name
     * <p>
     * The applicant's preferred last name.
     * 
     */
    @JsonProperty("preferredLastName")
    public void setPreferredLastName(String preferredLastName) {
        this.preferredLastName = preferredLastName;
    }

    public Name withPreferredLastName(String preferredLastName) {
        this.preferredLastName = preferredLastName;
        return this;
    }

    /**
     * Preferred Middle Name
     * <p>
     * The applicant's preferred middle name.
     * 
     */
    @JsonProperty("preferredMiddleName")
    public String getPreferredMiddleName() {
        return preferredMiddleName;
    }

    /**
     * Preferred Middle Name
     * <p>
     * The applicant's preferred middle name.
     * 
     */
    @JsonProperty("preferredMiddleName")
    public void setPreferredMiddleName(String preferredMiddleName) {
        this.preferredMiddleName = preferredMiddleName;
    }

    public Name withPreferredMiddleName(String preferredMiddleName) {
        this.preferredMiddleName = preferredMiddleName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("alternateFirstNames");
        sb.append('=');
        sb.append(((this.alternateFirstNames == null)?"<null>":this.alternateFirstNames));
        sb.append(',');
        sb.append("alternateLastNames");
        sb.append('=');
        sb.append(((this.alternateLastNames == null)?"<null>":this.alternateLastNames));
        sb.append(',');
        sb.append("alternateMiddleNames");
        sb.append('=');
        sb.append(((this.alternateMiddleNames == null)?"<null>":this.alternateMiddleNames));
        sb.append(',');
        sb.append("preferredFirstName");
        sb.append('=');
        sb.append(((this.preferredFirstName == null)?"<null>":this.preferredFirstName));
        sb.append(',');
        sb.append("preferredLastName");
        sb.append('=');
        sb.append(((this.preferredLastName == null)?"<null>":this.preferredLastName));
        sb.append(',');
        sb.append("preferredMiddleName");
        sb.append('=');
        sb.append(((this.preferredMiddleName == null)?"<null>":this.preferredMiddleName));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.alternateMiddleNames == null)? 0 :this.alternateMiddleNames.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.preferredLastName == null)? 0 :this.preferredLastName.hashCode()));
        result = ((result* 31)+((this.preferredMiddleName == null)? 0 :this.preferredMiddleName.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.alternateFirstNames == null)? 0 :this.alternateFirstNames.hashCode()));
        result = ((result* 31)+((this.alternateLastNames == null)? 0 :this.alternateLastNames.hashCode()));
        result = ((result* 31)+((this.preferredFirstName == null)? 0 :this.preferredFirstName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return (((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.alternateMiddleNames == rhs.alternateMiddleNames)||((this.alternateMiddleNames!= null)&&this.alternateMiddleNames.equals(rhs.alternateMiddleNames))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.preferredLastName == rhs.preferredLastName)||((this.preferredLastName!= null)&&this.preferredLastName.equals(rhs.preferredLastName))))&&((this.preferredMiddleName == rhs.preferredMiddleName)||((this.preferredMiddleName!= null)&&this.preferredMiddleName.equals(rhs.preferredMiddleName))))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.alternateFirstNames == rhs.alternateFirstNames)||((this.alternateFirstNames!= null)&&this.alternateFirstNames.equals(rhs.alternateFirstNames))))&&((this.alternateLastNames == rhs.alternateLastNames)||((this.alternateLastNames!= null)&&this.alternateLastNames.equals(rhs.alternateLastNames))))&&((this.preferredFirstName == rhs.preferredFirstName)||((this.preferredFirstName!= null)&&this.preferredFirstName.equals(rhs.preferredFirstName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))));
    }

}
