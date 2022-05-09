
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "relationship",
    "phoneNumber"
})
@Generated("jsonschema2pojo")
public class EmergencyContact {

    /**
     * First Name
     * <p>
     * First name of the emergency contact.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("First name of the emergency contact.")
    private String firstName;
    /**
     * Last Name
     * <p>
     * Last name of the emergency contact.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Last name of the emergency contact.")
    private String lastName;
    /**
     * Relationship
     * <p>
     * Relationship of the emergency contact to the applicant.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("Relationship of the emergency contact to the applicant.")
    private String relationship;
    /**
     * Phone Number
     * <p>
     * Phone number of the emergency contact.
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Phone number of the emergency contact.")
    private String phoneNumber;

    /**
     * First Name
     * <p>
     * First name of the emergency contact.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * First name of the emergency contact.
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public EmergencyContact withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Last name of the emergency contact.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Last name of the emergency contact.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmergencyContact withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Relationship of the emergency contact to the applicant.
     * 
     */
    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    /**
     * Relationship
     * <p>
     * Relationship of the emergency contact to the applicant.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public EmergencyContact withRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Phone number of the emergency contact.
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Phone number of the emergency contact.
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EmergencyContact withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmergencyContact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
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
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmergencyContact) == false) {
            return false;
        }
        EmergencyContact rhs = ((EmergencyContact) other);
        return (((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))));
    }

}
