
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact Details
 * <p>
 * Phone, email and physical addresses where an applicant may be contacted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "country",
    "email",
    "phoneNumber",
    "postcode"
})
@Generated("jsonschema2pojo")
public class ContactDetails {

    /**
     * Address Line1
     * <p>
     * The candidate’s address line 1.
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    @JsonPropertyDescription("The candidate\u2019s address line 1.")
    private String addressLine1;
    /**
     * Address Line2
     * <p>
     * The candidate’s address line 2.
     * 
     */
    @JsonProperty("addressLine2")
    @JsonPropertyDescription("The candidate\u2019s address line 2.")
    private String addressLine2;
    /**
     * Address Line3
     * <p>
     * The candidate’s address line 3.
     * 
     */
    @JsonProperty("addressLine3")
    @JsonPropertyDescription("The candidate\u2019s address line 3.")
    private String addressLine3;
    /**
     * Address Line4
     * <p>
     * The candidate’s address line 4.
     * 
     */
    @JsonProperty("addressLine4")
    @JsonPropertyDescription("The candidate\u2019s address line 4.")
    private String addressLine4;
    /**
     * Country
     * <p>
     * The candidate’s country - ISO 3166 country code.
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The candidate\u2019s country - ISO 3166 country code.")
    private String country;
    /**
     * Email
     * <p>
     * The candidate’s email address.
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The candidate\u2019s email address.")
    private String email;
    /**
     * Phone Number
     * <p>
     * The candidate’s phone number.
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("The candidate\u2019s phone number.")
    private String phoneNumber;
    /**
     * Postcode
     * <p>
     * The candidate’s postcode.
     * 
     */
    @JsonProperty("postcode")
    @JsonPropertyDescription("The candidate\u2019s postcode.")
    private String postcode;

    /**
     * Address Line1
     * <p>
     * The candidate’s address line 1.
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Address Line1
     * <p>
     * The candidate’s address line 1.
     * (Required)
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public ContactDetails withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Address Line2
     * <p>
     * The candidate’s address line 2.
     * 
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Address Line2
     * <p>
     * The candidate’s address line 2.
     * 
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public ContactDetails withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Address Line3
     * <p>
     * The candidate’s address line 3.
     * 
     */
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Address Line3
     * <p>
     * The candidate’s address line 3.
     * 
     */
    @JsonProperty("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public ContactDetails withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Address Line4
     * <p>
     * The candidate’s address line 4.
     * 
     */
    @JsonProperty("addressLine4")
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Address Line4
     * <p>
     * The candidate’s address line 4.
     * 
     */
    @JsonProperty("addressLine4")
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public ContactDetails withAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
        return this;
    }

    /**
     * Country
     * <p>
     * The candidate’s country - ISO 3166 country code.
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The candidate’s country - ISO 3166 country code.
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public ContactDetails withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Email
     * <p>
     * The candidate’s email address.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The candidate’s email address.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public ContactDetails withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * The candidate’s phone number.
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * The candidate’s phone number.
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactDetails withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Postcode
     * <p>
     * The candidate’s postcode.
     * 
     */
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * Postcode
     * <p>
     * The candidate’s postcode.
     * 
     */
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public ContactDetails withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressLine1");
        sb.append('=');
        sb.append(((this.addressLine1 == null)?"<null>":this.addressLine1));
        sb.append(',');
        sb.append("addressLine2");
        sb.append('=');
        sb.append(((this.addressLine2 == null)?"<null>":this.addressLine2));
        sb.append(',');
        sb.append("addressLine3");
        sb.append('=');
        sb.append(((this.addressLine3 == null)?"<null>":this.addressLine3));
        sb.append(',');
        sb.append("addressLine4");
        sb.append('=');
        sb.append(((this.addressLine4 == null)?"<null>":this.addressLine4));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("postcode");
        sb.append('=');
        sb.append(((this.postcode == null)?"<null>":this.postcode));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.postcode == null)? 0 :this.postcode.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.addressLine3 == null)? 0 :this.addressLine3 .hashCode()));
        result = ((result* 31)+((this.addressLine4 == null)? 0 :this.addressLine4 .hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactDetails) == false) {
            return false;
        }
        ContactDetails rhs = ((ContactDetails) other);
        return (((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.postcode == rhs.postcode)||((this.postcode!= null)&&this.postcode.equals(rhs.postcode))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.addressLine3 == rhs.addressLine3)||((this.addressLine3 != null)&&this.addressLine3 .equals(rhs.addressLine3))))&&((this.addressLine4 == rhs.addressLine4)||((this.addressLine4 != null)&&this.addressLine4 .equals(rhs.addressLine4))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
