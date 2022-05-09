
package com.ellucian.generated.eedm.wealth_screening_requests.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact Details
 * <p>
 * Contact information of the person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryAddress",
    "primaryEmail",
    "primaryPhone"
})
@Generated("jsonschema2pojo")
public class ContactDetails {

    /**
     * Primary Address
     * <p>
     * The primary mail or residential address
     * 
     */
    @JsonProperty("primaryAddress")
    @JsonPropertyDescription("The primary mail or residential address")
    private PrimaryAddress primaryAddress;
    /**
     * Primary Email
     * <p>
     * The primary email address of the person
     * 
     */
    @JsonProperty("primaryEmail")
    @JsonPropertyDescription("The primary email address of the person")
    private String primaryEmail;
    /**
     * Primary Phone
     * <p>
     * The primary phone number of the person
     * 
     */
    @JsonProperty("primaryPhone")
    @JsonPropertyDescription("The primary phone number of the person")
    private String primaryPhone;

    /**
     * Primary Address
     * <p>
     * The primary mail or residential address
     * 
     */
    @JsonProperty("primaryAddress")
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Primary Address
     * <p>
     * The primary mail or residential address
     * 
     */
    @JsonProperty("primaryAddress")
    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public ContactDetails withPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
        return this;
    }

    /**
     * Primary Email
     * <p>
     * The primary email address of the person
     * 
     */
    @JsonProperty("primaryEmail")
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * Primary Email
     * <p>
     * The primary email address of the person
     * 
     */
    @JsonProperty("primaryEmail")
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public ContactDetails withPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    /**
     * Primary Phone
     * <p>
     * The primary phone number of the person
     * 
     */
    @JsonProperty("primaryPhone")
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Primary Phone
     * <p>
     * The primary phone number of the person
     * 
     */
    @JsonProperty("primaryPhone")
    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public ContactDetails withPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryAddress");
        sb.append('=');
        sb.append(((this.primaryAddress == null)?"<null>":this.primaryAddress));
        sb.append(',');
        sb.append("primaryEmail");
        sb.append('=');
        sb.append(((this.primaryEmail == null)?"<null>":this.primaryEmail));
        sb.append(',');
        sb.append("primaryPhone");
        sb.append('=');
        sb.append(((this.primaryPhone == null)?"<null>":this.primaryPhone));
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
        result = ((result* 31)+((this.primaryPhone == null)? 0 :this.primaryPhone.hashCode()));
        result = ((result* 31)+((this.primaryAddress == null)? 0 :this.primaryAddress.hashCode()));
        result = ((result* 31)+((this.primaryEmail == null)? 0 :this.primaryEmail.hashCode()));
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
        return ((((this.primaryPhone == rhs.primaryPhone)||((this.primaryPhone!= null)&&this.primaryPhone.equals(rhs.primaryPhone)))&&((this.primaryAddress == rhs.primaryAddress)||((this.primaryAddress!= null)&&this.primaryAddress.equals(rhs.primaryAddress))))&&((this.primaryEmail == rhs.primaryEmail)||((this.primaryEmail!= null)&&this.primaryEmail.equals(rhs.primaryEmail))));
    }

}
