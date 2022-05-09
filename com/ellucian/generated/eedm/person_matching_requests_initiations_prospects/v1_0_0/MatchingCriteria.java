
package com.ellucian.generated.eedm.person_matching_requests_initiations_prospects.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Matching Criteria
 * <p>
 * Additional matching criteria - minimum of one is required.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dateOfBirth",
    "credential",
    "alternativeCredentials",
    "address",
    "phone",
    "email"
})
@Generated("jsonschema2pojo")
public class MatchingCriteria {

    /**
     * Date Of Birth
     * <p>
     * The date when a prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The date when a prospect was born.")
    private Object dateOfBirth;
    /**
     * Credential
     * <p>
     * Information that identifies a user to a system.
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("Information that identifies a user to a system.")
    private Object credential;
    /**
     * Alternative Credentials
     * <p>
     * Alternative information that uniquely identifies a user.
     * 
     */
    @JsonProperty("alternativeCredentials")
    @JsonPropertyDescription("Alternative information that uniquely identifies a user.")
    private List<AlternativeCredential> alternativeCredentials = new ArrayList<AlternativeCredential>();
    /**
     * Address
     * <p>
     * The physical address associated with a prospect.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The physical address associated with a prospect.")
    private Object address;
    /**
     * Phone
     * <p>
     * The phone associated with a prospect.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone associated with a prospect.")
    private Object phone;
    /**
     * Email
     * <p>
     * The email address associated with a prospect.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address associated with a prospect.")
    private Object email;

    /**
     * Date Of Birth
     * <p>
     * The date when a prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date Of Birth
     * <p>
     * The date when a prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MatchingCriteria withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Credential
     * <p>
     * Information that identifies a user to a system.
     * 
     */
    @JsonProperty("credential")
    public Object getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * Information that identifies a user to a system.
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Object credential) {
        this.credential = credential;
    }

    public MatchingCriteria withCredential(Object credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Alternative Credentials
     * <p>
     * Alternative information that uniquely identifies a user.
     * 
     */
    @JsonProperty("alternativeCredentials")
    public List<AlternativeCredential> getAlternativeCredentials() {
        return alternativeCredentials;
    }

    /**
     * Alternative Credentials
     * <p>
     * Alternative information that uniquely identifies a user.
     * 
     */
    @JsonProperty("alternativeCredentials")
    public void setAlternativeCredentials(List<AlternativeCredential> alternativeCredentials) {
        this.alternativeCredentials = alternativeCredentials;
    }

    public MatchingCriteria withAlternativeCredentials(List<AlternativeCredential> alternativeCredentials) {
        this.alternativeCredentials = alternativeCredentials;
        return this;
    }

    /**
     * Address
     * <p>
     * The physical address associated with a prospect.
     * 
     */
    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The physical address associated with a prospect.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public MatchingCriteria withAddress(Object address) {
        this.address = address;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone associated with a prospect.
     * 
     */
    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone associated with a prospect.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public MatchingCriteria withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address associated with a prospect.
     * 
     */
    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address associated with a prospect.
     * 
     */
    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    public MatchingCriteria withEmail(Object email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MatchingCriteria.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("alternativeCredentials");
        sb.append('=');
        sb.append(((this.alternativeCredentials == null)?"<null>":this.alternativeCredentials));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.alternativeCredentials == null)? 0 :this.alternativeCredentials.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchingCriteria) == false) {
            return false;
        }
        MatchingCriteria rhs = ((MatchingCriteria) other);
        return (((((((this.alternativeCredentials == rhs.alternativeCredentials)||((this.alternativeCredentials!= null)&&this.alternativeCredentials.equals(rhs.alternativeCredentials)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
