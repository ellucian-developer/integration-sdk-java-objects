
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "phoneNumber",
    "emailAddress",
    "educationLevel",
    "address"
})
@Generated("jsonschema2pojo")
public class ParentsAndLegalGuardian {

    /**
     * First Name
     * <p>
     * The parent or legal guardian's first name.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The parent or legal guardian's first name.")
    private String firstName;
    /**
     * Last Name
     * <p>
     * The parent or legal guardian's last name.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The parent or legal guardian's last name.")
    private String lastName;
    /**
     * Phone Number
     * <p>
     * The parent or legal guardian's phone number
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("The parent or legal guardian's phone number")
    private String phoneNumber;
    /**
     * Email Address
     * <p>
     * The parent or legal guardian's email address.
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("The parent or legal guardian's email address.")
    private Object emailAddress;
    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level
     * 
     */
    @JsonProperty("educationLevel")
    @JsonPropertyDescription("The parent or legal guardian's education level")
    private Object educationLevel;
    /**
     * Address
     * <p>
     * The parent or legal guardian's address
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The parent or legal guardian's address")
    private Address__1 address;

    /**
     * First Name
     * <p>
     * The parent or legal guardian's first name.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The parent or legal guardian's first name.
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ParentsAndLegalGuardian withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The parent or legal guardian's last name.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The parent or legal guardian's last name.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ParentsAndLegalGuardian withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * The parent or legal guardian's phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * The parent or legal guardian's phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ParentsAndLegalGuardian withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The parent or legal guardian's email address.
     * 
     */
    @JsonProperty("emailAddress")
    public Object getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The parent or legal guardian's email address.
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ParentsAndLegalGuardian withEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level
     * 
     */
    @JsonProperty("educationLevel")
    public Object getEducationLevel() {
        return educationLevel;
    }

    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level
     * 
     */
    @JsonProperty("educationLevel")
    public void setEducationLevel(Object educationLevel) {
        this.educationLevel = educationLevel;
    }

    public ParentsAndLegalGuardian withEducationLevel(Object educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Address
     * <p>
     * The parent or legal guardian's address
     * 
     */
    @JsonProperty("address")
    public Address__1 getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The parent or legal guardian's address
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address__1 address) {
        this.address = address;
    }

    public ParentsAndLegalGuardian withAddress(Address__1 address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParentsAndLegalGuardian.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("educationLevel");
        sb.append('=');
        sb.append(((this.educationLevel == null)?"<null>":this.educationLevel));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.educationLevel == null)? 0 :this.educationLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParentsAndLegalGuardian) == false) {
            return false;
        }
        ParentsAndLegalGuardian rhs = ((ParentsAndLegalGuardian) other);
        return (((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.educationLevel == rhs.educationLevel)||((this.educationLevel!= null)&&this.educationLevel.equals(rhs.educationLevel))));
    }

}
