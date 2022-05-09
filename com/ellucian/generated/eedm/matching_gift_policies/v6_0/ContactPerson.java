
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * contact Person
 * <p>
 * Name of the person to be contacted with regard to this foundation.11
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "title",
    "administrativeTitle"
})
@Generated("jsonschema2pojo")
public class ContactPerson {

    /**
     * First Name
     * <p>
     * First name of the program administrator
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("First name of the program administrator")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * Middle initial of the program administrator
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Middle initial of the program administrator")
    private String middleName;
    /**
     * Last Name
     * <p>
     * Last name of the program administrator.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Last name of the program administrator.")
    private String lastName;
    /**
     * Suffix
     * <p>
     * Suffix of the program administrator.
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("Suffix of the program administrator.")
    private String suffix;
    /**
     * Title
     * <p>
     * Title of the contact person.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Title of the contact person.")
    private String title;
    /**
     * Administrative Title
     * <p>
     * Administrative title of the contact person.
     * 
     */
    @JsonProperty("administrativeTitle")
    @JsonPropertyDescription("Administrative title of the contact person.")
    private String administrativeTitle;

    /**
     * First Name
     * <p>
     * First name of the program administrator
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * First name of the program administrator
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ContactPerson withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Middle initial of the program administrator
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * Middle initial of the program administrator
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public ContactPerson withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Last name of the program administrator.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Last name of the program administrator.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactPerson withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Suffix of the program administrator.
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix
     * <p>
     * Suffix of the program administrator.
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public ContactPerson withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Title
     * <p>
     * Title of the contact person.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Title of the contact person.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ContactPerson withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Administrative Title
     * <p>
     * Administrative title of the contact person.
     * 
     */
    @JsonProperty("administrativeTitle")
    public String getAdministrativeTitle() {
        return administrativeTitle;
    }

    /**
     * Administrative Title
     * <p>
     * Administrative title of the contact person.
     * 
     */
    @JsonProperty("administrativeTitle")
    public void setAdministrativeTitle(String administrativeTitle) {
        this.administrativeTitle = administrativeTitle;
    }

    public ContactPerson withAdministrativeTitle(String administrativeTitle) {
        this.administrativeTitle = administrativeTitle;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactPerson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("administrativeTitle");
        sb.append('=');
        sb.append(((this.administrativeTitle == null)?"<null>":this.administrativeTitle));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.administrativeTitle == null)? 0 :this.administrativeTitle.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactPerson) == false) {
            return false;
        }
        ContactPerson rhs = ((ContactPerson) other);
        return (((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.administrativeTitle == rhs.administrativeTitle)||((this.administrativeTitle!= null)&&this.administrativeTitle.equals(rhs.administrativeTitle))))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
