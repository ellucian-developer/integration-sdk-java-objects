
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact Details
 * <p>
 * Contact details of the foundation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "phoneNumber",
    "extension",
    "emailAddress",
    "websiteAddress",
    "faxNumber"
})
@Generated("jsonschema2pojo")
public class ContactDetails {

    /**
     * Address
     * <p>
     * Contact address of the foundation.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Contact address of the foundation.")
    private Address address;
    /**
     * Phone Number
     * <p>
     * The phone number of the foundation
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("The phone number of the foundation")
    private String phoneNumber;
    /**
     * Extension
     * <p>
     * The phone extension of the foundation.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("The phone extension of the foundation.")
    private String extension;
    /**
     * Email Address
     * <p>
     * The email address number of the foundation.
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("The email address number of the foundation.")
    private Object emailAddress;
    /**
     * Website Address
     * <p>
     * The website address of the foundation.
     * 
     */
    @JsonProperty("websiteAddress")
    @JsonPropertyDescription("The website address of the foundation.")
    private String websiteAddress;
    /**
     * Fax Number
     * <p>
     * The fax number of the foundation.
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("The fax number of the foundation.")
    private String faxNumber;

    /**
     * Address
     * <p>
     * Contact address of the foundation.
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * Contact address of the foundation.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactDetails withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * The phone number of the foundation
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * The phone number of the foundation
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
     * Extension
     * <p>
     * The phone extension of the foundation.
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Extension
     * <p>
     * The phone extension of the foundation.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public ContactDetails withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The email address number of the foundation.
     * 
     */
    @JsonProperty("emailAddress")
    public Object getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The email address number of the foundation.
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ContactDetails withEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Website Address
     * <p>
     * The website address of the foundation.
     * 
     */
    @JsonProperty("websiteAddress")
    public String getWebsiteAddress() {
        return websiteAddress;
    }

    /**
     * Website Address
     * <p>
     * The website address of the foundation.
     * 
     */
    @JsonProperty("websiteAddress")
    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }

    public ContactDetails withWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
        return this;
    }

    /**
     * Fax Number
     * <p>
     * The fax number of the foundation.
     * 
     */
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Fax Number
     * <p>
     * The fax number of the foundation.
     * 
     */
    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public ContactDetails withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("websiteAddress");
        sb.append('=');
        sb.append(((this.websiteAddress == null)?"<null>":this.websiteAddress));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.websiteAddress == null)? 0 :this.websiteAddress.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
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
        return (((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.websiteAddress == rhs.websiteAddress)||((this.websiteAddress!= null)&&this.websiteAddress.equals(rhs.websiteAddress))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))));
    }

}
