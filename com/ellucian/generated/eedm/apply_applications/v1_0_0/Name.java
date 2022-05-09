
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

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
    "pedigree",
    "title",
    "alternateNames",
    "preferredName"
})
@Generated("jsonschema2pojo")
public class Name {

    /**
     * First Name
     * <p>
     * The first name of the applicant
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The first name of the applicant")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * The applicant's middle name
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("The applicant's middle name")
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
     * The article or preposition portion of an applicant's last name. For example, \"De la\", \"Van\", or \"Van der Von\".
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("The article or preposition portion of an applicant's last name. For example, \\\"De la\\\", \\\"Van\\\", or \\\"Van der Von\\\".")
    private String lastNamePrefix;
    /**
     * Pedigree
     * <p>
     * The applicant's person's pedigree. For example, \"Jr.\" or \"Sr.\".
     * 
     */
    @JsonProperty("pedigree")
    @JsonPropertyDescription("The applicant's person's pedigree. For example, \\\"Jr.\\\" or \\\"Sr.\\\".")
    private String pedigree;
    /**
     * Title
     * <p>
     * The applicant's title. For example, \"Mr.\", \"Mrs.\", or \"Dr.\".
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The applicant's title. For example, \\\"Mr.\\\", \\\"Mrs.\\\", or \\\"Dr.\\\".")
    private String title;
    /**
     * Alternate Names
     * <p>
     * Alternate names for the applicant.
     * 
     */
    @JsonProperty("alternateNames")
    @JsonPropertyDescription("Alternate names for the applicant.")
    private List<AlternateName> alternateNames = new ArrayList<AlternateName>();
    /**
     * Preferred Name
     * <p>
     * The applicant's preferred name or nickname.
     * 
     */
    @JsonProperty("preferredName")
    @JsonPropertyDescription("The applicant's preferred name or nickname.")
    private String preferredName;

    /**
     * First Name
     * <p>
     * The first name of the applicant
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
     * The first name of the applicant
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
     * The applicant's middle name
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * The applicant's middle name
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
     * The article or preposition portion of an applicant's last name. For example, \"De la\", \"Van\", or \"Van der Von\".
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of an applicant's last name. For example, \"De la\", \"Van\", or \"Van der Von\".
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
     * Pedigree
     * <p>
     * The applicant's person's pedigree. For example, \"Jr.\" or \"Sr.\".
     * 
     */
    @JsonProperty("pedigree")
    public String getPedigree() {
        return pedigree;
    }

    /**
     * Pedigree
     * <p>
     * The applicant's person's pedigree. For example, \"Jr.\" or \"Sr.\".
     * 
     */
    @JsonProperty("pedigree")
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public Name withPedigree(String pedigree) {
        this.pedigree = pedigree;
        return this;
    }

    /**
     * Title
     * <p>
     * The applicant's title. For example, \"Mr.\", \"Mrs.\", or \"Dr.\".
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The applicant's title. For example, \"Mr.\", \"Mrs.\", or \"Dr.\".
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Name withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Alternate Names
     * <p>
     * Alternate names for the applicant.
     * 
     */
    @JsonProperty("alternateNames")
    public List<AlternateName> getAlternateNames() {
        return alternateNames;
    }

    /**
     * Alternate Names
     * <p>
     * Alternate names for the applicant.
     * 
     */
    @JsonProperty("alternateNames")
    public void setAlternateNames(List<AlternateName> alternateNames) {
        this.alternateNames = alternateNames;
    }

    public Name withAlternateNames(List<AlternateName> alternateNames) {
        this.alternateNames = alternateNames;
        return this;
    }

    /**
     * Preferred Name
     * <p>
     * The applicant's preferred name or nickname.
     * 
     */
    @JsonProperty("preferredName")
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Preferred Name
     * <p>
     * The applicant's preferred name or nickname.
     * 
     */
    @JsonProperty("preferredName")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public Name withPreferredName(String preferredName) {
        this.preferredName = preferredName;
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
        sb.append("pedigree");
        sb.append('=');
        sb.append(((this.pedigree == null)?"<null>":this.pedigree));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("alternateNames");
        sb.append('=');
        sb.append(((this.alternateNames == null)?"<null>":this.alternateNames));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null)?"<null>":this.preferredName));
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
        result = ((result* 31)+((this.pedigree == null)? 0 :this.pedigree.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.alternateNames == null)? 0 :this.alternateNames.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
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
        return (((((((((this.pedigree == rhs.pedigree)||((this.pedigree!= null)&&this.pedigree.equals(rhs.pedigree)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.alternateNames == rhs.alternateNames)||((this.alternateNames!= null)&&this.alternateNames.equals(rhs.alternateNames))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
