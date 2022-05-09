
package com.ellucian.generated.eedm.user_identity_profiles.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Name
 * <p>
 * Person name details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "formattedName",
    "givenName",
    "familyName",
    "middleName",
    "preferredGivenName",
    "affix"
})
@Generated("jsonschema2pojo")
public class PersonName {

    /**
     * Formatted Name
     * <p>
     * Combination of first ,middle and last name
     * 
     */
    @JsonProperty("formattedName")
    @JsonPropertyDescription("Combination of first ,middle and last name")
    private String formattedName;
    /**
     * Given Name
     * <p>
     * First name of the person
     * (Required)
     * 
     */
    @JsonProperty("givenName")
    @JsonPropertyDescription("First name of the person")
    private String givenName;
    /**
     * Family Name
     * <p>
     * Last name of the person
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    @JsonPropertyDescription("Last name of the person")
    private String familyName;
    /**
     * Middle Name
     * <p>
     * Middle name of the person
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Middle name of the person")
    private String middleName;
    /**
     * Preferred Given Name
     * <p>
     * Preferred first name of the person
     * 
     */
    @JsonProperty("preferredGivenName")
    @JsonPropertyDescription("Preferred first name of the person")
    private String preferredGivenName;
    /**
     * Affix
     * <p>
     * Form of address for the person.
     * 
     */
    @JsonProperty("affix")
    @JsonPropertyDescription("Form of address for the person.")
    private List<Affix> affix = new ArrayList<Affix>();

    /**
     * Formatted Name
     * <p>
     * Combination of first ,middle and last name
     * 
     */
    @JsonProperty("formattedName")
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Formatted Name
     * <p>
     * Combination of first ,middle and last name
     * 
     */
    @JsonProperty("formattedName")
    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    public PersonName withFormattedName(String formattedName) {
        this.formattedName = formattedName;
        return this;
    }

    /**
     * Given Name
     * <p>
     * First name of the person
     * (Required)
     * 
     */
    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    /**
     * Given Name
     * <p>
     * First name of the person
     * (Required)
     * 
     */
    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public PersonName withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Family Name
     * <p>
     * Last name of the person
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Family Name
     * <p>
     * Last name of the person
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public PersonName withFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Middle name of the person
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * Middle name of the person
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public PersonName withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Preferred Given Name
     * <p>
     * Preferred first name of the person
     * 
     */
    @JsonProperty("preferredGivenName")
    public String getPreferredGivenName() {
        return preferredGivenName;
    }

    /**
     * Preferred Given Name
     * <p>
     * Preferred first name of the person
     * 
     */
    @JsonProperty("preferredGivenName")
    public void setPreferredGivenName(String preferredGivenName) {
        this.preferredGivenName = preferredGivenName;
    }

    public PersonName withPreferredGivenName(String preferredGivenName) {
        this.preferredGivenName = preferredGivenName;
        return this;
    }

    /**
     * Affix
     * <p>
     * Form of address for the person.
     * 
     */
    @JsonProperty("affix")
    public List<Affix> getAffix() {
        return affix;
    }

    /**
     * Affix
     * <p>
     * Form of address for the person.
     * 
     */
    @JsonProperty("affix")
    public void setAffix(List<Affix> affix) {
        this.affix = affix;
    }

    public PersonName withAffix(List<Affix> affix) {
        this.affix = affix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formattedName");
        sb.append('=');
        sb.append(((this.formattedName == null)?"<null>":this.formattedName));
        sb.append(',');
        sb.append("givenName");
        sb.append('=');
        sb.append(((this.givenName == null)?"<null>":this.givenName));
        sb.append(',');
        sb.append("familyName");
        sb.append('=');
        sb.append(((this.familyName == null)?"<null>":this.familyName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("preferredGivenName");
        sb.append('=');
        sb.append(((this.preferredGivenName == null)?"<null>":this.preferredGivenName));
        sb.append(',');
        sb.append("affix");
        sb.append('=');
        sb.append(((this.affix == null)?"<null>":this.affix));
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
        result = ((result* 31)+((this.preferredGivenName == null)? 0 :this.preferredGivenName.hashCode()));
        result = ((result* 31)+((this.affix == null)? 0 :this.affix.hashCode()));
        result = ((result* 31)+((this.formattedName == null)? 0 :this.formattedName.hashCode()));
        result = ((result* 31)+((this.givenName == null)? 0 :this.givenName.hashCode()));
        result = ((result* 31)+((this.familyName == null)? 0 :this.familyName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonName) == false) {
            return false;
        }
        PersonName rhs = ((PersonName) other);
        return (((((((this.preferredGivenName == rhs.preferredGivenName)||((this.preferredGivenName!= null)&&this.preferredGivenName.equals(rhs.preferredGivenName)))&&((this.affix == rhs.affix)||((this.affix!= null)&&this.affix.equals(rhs.affix))))&&((this.formattedName == rhs.formattedName)||((this.formattedName!= null)&&this.formattedName.equals(rhs.formattedName))))&&((this.givenName == rhs.givenName)||((this.givenName!= null)&&this.givenName.equals(rhs.givenName))))&&((this.familyName == rhs.familyName)||((this.familyName!= null)&&this.familyName.equals(rhs.familyName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))));
    }

}
