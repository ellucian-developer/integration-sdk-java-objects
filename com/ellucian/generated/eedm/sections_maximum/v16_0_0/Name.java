
package com.ellucian.generated.eedm.sections_maximum.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "preference",
    "fullName",
    "title",
    "firstName",
    "middleName",
    "lastNamePrefix",
    "lastName",
    "pedigree",
    "professionalAbbreviations"
})
@Generated("jsonschema2pojo")
public class Name {

    /**
     * Name Type
     * <p>
     * The type of a person's name being defined. For example, a "Primary" name.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of a person's name being defined. For example, a \"Primary\" name.")
    private Object type;
    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the person. Only one name should be set to preferred for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the preferred name for the person. Only one name should be set to preferred for a person.")
    private Object preference;
    /**
     * Full Name
     * <p>
     * The person's full name.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("The person's full name.")
    private String fullName;
    /**
     * Title
     * <p>
     * The person's title. For example, "Mr.", "Mrs.", or "Dr.".
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The person's title. For example, \"Mr.\", \"Mrs.\", or \"Dr.\".")
    private String title;
    /**
     * First Name
     * <p>
     * The person's first, or given, name.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The person's first, or given, name.")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * The person's middle name.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("The person's middle name.")
    private String middleName;
    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", or "Van der Von".
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("The article or preposition portion of a person's last name. For example, \"De la\", \"Van\", or \"Van der Von\".")
    private String lastNamePrefix;
    /**
     * Last Name
     * <p>
     * The person's last, or family, name.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The person's last, or family, name.")
    private String lastName;
    /**
     * Pedigree/Suffix
     * <p>
     * The person's pedigree. For example, "Jr." or "Sr.".
     * 
     */
    @JsonProperty("pedigree")
    @JsonPropertyDescription("The person's pedigree. For example, \"Jr.\" or \"Sr.\".")
    private String pedigree;
    /**
     * Professional Abbreviation
     * <p>
     * A post-nominal professional abbreviation, reflecting an earned degree or honor. For example, "M.D." or "Ph.D.".
     * 
     */
    @JsonProperty("professionalAbbreviations")
    @JsonPropertyDescription("A post-nominal professional abbreviation, reflecting an earned degree or honor. For example, \"M.D.\" or \"Ph.D.\".")
    private List<String> professionalAbbreviations = new ArrayList<String>();

    /**
     * Name Type
     * <p>
     * The type of a person's name being defined. For example, a "Primary" name.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Name Type
     * <p>
     * The type of a person's name being defined. For example, a "Primary" name.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Name withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the person. Only one name should be set to preferred for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Name Preference
     * <p>
     * Indicates the preferred name for the person. Only one name should be set to preferred for a person.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Name withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Full Name
     * <p>
     * The person's full name.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full Name
     * <p>
     * The person's full name.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Name withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Title
     * <p>
     * The person's title. For example, "Mr.", "Mrs.", or "Dr.".
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The person's title. For example, "Mr.", "Mrs.", or "Dr.".
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
     * First Name
     * <p>
     * The person's first, or given, name.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The person's first, or given, name.
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
     * The person's middle name.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * The person's middle name.
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
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", or "Van der Von".
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", or "Van der Von".
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
     * Last Name
     * <p>
     * The person's last, or family, name.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The person's last, or family, name.
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
     * Pedigree/Suffix
     * <p>
     * The person's pedigree. For example, "Jr." or "Sr.".
     * 
     */
    @JsonProperty("pedigree")
    public String getPedigree() {
        return pedigree;
    }

    /**
     * Pedigree/Suffix
     * <p>
     * The person's pedigree. For example, "Jr." or "Sr.".
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
     * Professional Abbreviation
     * <p>
     * A post-nominal professional abbreviation, reflecting an earned degree or honor. For example, "M.D." or "Ph.D.".
     * 
     */
    @JsonProperty("professionalAbbreviations")
    public List<String> getProfessionalAbbreviations() {
        return professionalAbbreviations;
    }

    /**
     * Professional Abbreviation
     * <p>
     * A post-nominal professional abbreviation, reflecting an earned degree or honor. For example, "M.D." or "Ph.D.".
     * 
     */
    @JsonProperty("professionalAbbreviations")
    public void setProfessionalAbbreviations(List<String> professionalAbbreviations) {
        this.professionalAbbreviations = professionalAbbreviations;
    }

    public Name withProfessionalAbbreviations(List<String> professionalAbbreviations) {
        this.professionalAbbreviations = professionalAbbreviations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("pedigree");
        sb.append('=');
        sb.append(((this.pedigree == null)?"<null>":this.pedigree));
        sb.append(',');
        sb.append("professionalAbbreviations");
        sb.append('=');
        sb.append(((this.professionalAbbreviations == null)?"<null>":this.professionalAbbreviations));
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
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.professionalAbbreviations == null)? 0 :this.professionalAbbreviations.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
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
        return (((((((((((this.pedigree == rhs.pedigree)||((this.pedigree!= null)&&this.pedigree.equals(rhs.pedigree)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.professionalAbbreviations == rhs.professionalAbbreviations)||((this.professionalAbbreviations!= null)&&this.professionalAbbreviations.equals(rhs.professionalAbbreviations))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
