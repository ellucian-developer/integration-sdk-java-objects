
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "middleName",
    "lastName",
    "relationship",
    "phoneNumber",
    "email",
    "educationLevel",
    "educationLevelMis",
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
     * Middle Name
     * <p>
     * The parent or legal guardian's middle name.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("The parent or legal guardian's middle name.")
    private String middleName;
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
     * Relationship
     * <p>
     * The parent or legal guardian's Relationship to the applicant.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The parent or legal guardian's Relationship to the applicant.")
    private String relationship;
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
    @JsonProperty("email")
    @JsonPropertyDescription("The parent or legal guardian's email address.")
    private Object email;
    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level.
     * 
     */
    @JsonProperty("educationLevel")
    @JsonPropertyDescription("The parent or legal guardian's education level.")
    private String educationLevel;
    /**
     * Parent/guardians Education Level: MIS
     * <p>
     * Concatenation of parent/guardians Education Level: MIS.
     * 
     */
    @JsonProperty("educationLevelMis")
    @JsonPropertyDescription("Concatenation of parent/guardians Education Level: MIS.")
    private String educationLevelMis;
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
     * Middle Name
     * <p>
     * The parent or legal guardian's middle name.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * The parent or legal guardian's middle name.
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public ParentsAndLegalGuardian withMiddleName(String middleName) {
        this.middleName = middleName;
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
     * Relationship
     * <p>
     * The parent or legal guardian's Relationship to the applicant.
     * 
     */
    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    /**
     * Relationship
     * <p>
     * The parent or legal guardian's Relationship to the applicant.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public ParentsAndLegalGuardian withRelationship(String relationship) {
        this.relationship = relationship;
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
    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    /**
     * Email Address
     * <p>
     * The parent or legal guardian's email address.
     * 
     */
    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    public ParentsAndLegalGuardian withEmail(Object email) {
        this.email = email;
        return this;
    }

    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level.
     * 
     */
    @JsonProperty("educationLevel")
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Education Level
     * <p>
     * The parent or legal guardian's education level.
     * 
     */
    @JsonProperty("educationLevel")
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public ParentsAndLegalGuardian withEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Parent/guardians Education Level: MIS
     * <p>
     * Concatenation of parent/guardians Education Level: MIS.
     * 
     */
    @JsonProperty("educationLevelMis")
    public String getEducationLevelMis() {
        return educationLevelMis;
    }

    /**
     * Parent/guardians Education Level: MIS
     * <p>
     * Concatenation of parent/guardians Education Level: MIS.
     * 
     */
    @JsonProperty("educationLevelMis")
    public void setEducationLevelMis(String educationLevelMis) {
        this.educationLevelMis = educationLevelMis;
    }

    public ParentsAndLegalGuardian withEducationLevelMis(String educationLevelMis) {
        this.educationLevelMis = educationLevelMis;
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
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("educationLevel");
        sb.append('=');
        sb.append(((this.educationLevel == null)?"<null>":this.educationLevel));
        sb.append(',');
        sb.append("educationLevelMis");
        sb.append('=');
        sb.append(((this.educationLevelMis == null)?"<null>":this.educationLevelMis));
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
        result = ((result* 31)+((this.educationLevelMis == null)? 0 :this.educationLevelMis.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.educationLevel == null)? 0 :this.educationLevel.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
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
        return ((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.educationLevelMis == rhs.educationLevelMis)||((this.educationLevelMis!= null)&&this.educationLevelMis.equals(rhs.educationLevelMis))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.educationLevel == rhs.educationLevel)||((this.educationLevel!= null)&&this.educationLevel.equals(rhs.educationLevel))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
