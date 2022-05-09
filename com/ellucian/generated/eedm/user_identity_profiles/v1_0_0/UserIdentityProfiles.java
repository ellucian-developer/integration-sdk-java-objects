
package com.ellucian.generated.eedm.user_identity_profiles.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * User Identity Profiles
 * <p>
 * Identity profile details for users to be integrated with Ethos Identity for provisioning service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "udcIdentifier",
    "dateOfBirth",
    "bannerId",
    "personIdentity",
    "emailAddress",
    "primaryAddress",
    "mobilePhone",
    "institutionRoles",
    "principal",
    "credential"
})
@Generated("jsonschema2pojo")
public class UserIdentityProfiles {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the user-identity-profiles.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the user-identity-profiles.")
    private String id;
    /**
     * udcIdentifier
     * <p>
     * the UDCIdentifier value for person
     * (Required)
     * 
     */
    @JsonProperty("udcIdentifier")
    @JsonPropertyDescription("the UDCIdentifier value for person")
    private String udcIdentifier;
    /**
     * Date Of Birth
     * <p>
     * The date of birth of the person
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The date of birth of the person")
    private Object dateOfBirth;
    /**
     * bannerId
     * <p>
     * The spriden ID for the person
     * 
     */
    @JsonProperty("bannerId")
    @JsonPropertyDescription("The spriden ID for the person")
    private String bannerId;
    /**
     * Person Identity
     * <p>
     * person details
     * (Required)
     * 
     */
    @JsonProperty("personIdentity")
    @JsonPropertyDescription("person details")
    private PersonIdentity personIdentity;
    /**
     * Email Address
     * <p>
     * Email address of the person
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("Email address of the person")
    private String emailAddress;
    /**
     * Primary Address
     * <p>
     * Address of the person
     * 
     */
    @JsonProperty("primaryAddress")
    @JsonPropertyDescription("Address of the person")
    private PrimaryAddress primaryAddress;
    /**
     * Mobile Phone
     * <p>
     * Contact number of the person
     * 
     */
    @JsonProperty("mobilePhone")
    @JsonPropertyDescription("Contact number of the person")
    private MobilePhone mobilePhone;
    /**
     * Institution Roles
     * <p>
     * Roles assigned to the person.
     * 
     */
    @JsonProperty("institutionRoles")
    @JsonPropertyDescription("Roles assigned to the person.")
    private List<String> institutionRoles = new ArrayList<String>();
    /**
     * Principal
     * <p>
     * Principal name of the person
     * 
     */
    @JsonProperty("principal")
    @JsonPropertyDescription("Principal name of the person")
    private String principal;
    /**
     * Credential
     * <p>
     * Credential of the person
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("Credential of the person")
    private String credential;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public UserIdentityProfiles withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the user-identity-profiles.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the user-identity-profiles.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public UserIdentityProfiles withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * udcIdentifier
     * <p>
     * the UDCIdentifier value for person
     * (Required)
     * 
     */
    @JsonProperty("udcIdentifier")
    public String getUdcIdentifier() {
        return udcIdentifier;
    }

    /**
     * udcIdentifier
     * <p>
     * the UDCIdentifier value for person
     * (Required)
     * 
     */
    @JsonProperty("udcIdentifier")
    public void setUdcIdentifier(String udcIdentifier) {
        this.udcIdentifier = udcIdentifier;
    }

    public UserIdentityProfiles withUdcIdentifier(String udcIdentifier) {
        this.udcIdentifier = udcIdentifier;
        return this;
    }

    /**
     * Date Of Birth
     * <p>
     * The date of birth of the person
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date Of Birth
     * <p>
     * The date of birth of the person
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserIdentityProfiles withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * bannerId
     * <p>
     * The spriden ID for the person
     * 
     */
    @JsonProperty("bannerId")
    public String getBannerId() {
        return bannerId;
    }

    /**
     * bannerId
     * <p>
     * The spriden ID for the person
     * 
     */
    @JsonProperty("bannerId")
    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public UserIdentityProfiles withBannerId(String bannerId) {
        this.bannerId = bannerId;
        return this;
    }

    /**
     * Person Identity
     * <p>
     * person details
     * (Required)
     * 
     */
    @JsonProperty("personIdentity")
    public PersonIdentity getPersonIdentity() {
        return personIdentity;
    }

    /**
     * Person Identity
     * <p>
     * person details
     * (Required)
     * 
     */
    @JsonProperty("personIdentity")
    public void setPersonIdentity(PersonIdentity personIdentity) {
        this.personIdentity = personIdentity;
    }

    public UserIdentityProfiles withPersonIdentity(PersonIdentity personIdentity) {
        this.personIdentity = personIdentity;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Email address of the person
     * 
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * Email address of the person
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UserIdentityProfiles withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Primary Address
     * <p>
     * Address of the person
     * 
     */
    @JsonProperty("primaryAddress")
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Primary Address
     * <p>
     * Address of the person
     * 
     */
    @JsonProperty("primaryAddress")
    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public UserIdentityProfiles withPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
        return this;
    }

    /**
     * Mobile Phone
     * <p>
     * Contact number of the person
     * 
     */
    @JsonProperty("mobilePhone")
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Mobile Phone
     * <p>
     * Contact number of the person
     * 
     */
    @JsonProperty("mobilePhone")
    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public UserIdentityProfiles withMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Institution Roles
     * <p>
     * Roles assigned to the person.
     * 
     */
    @JsonProperty("institutionRoles")
    public List<String> getInstitutionRoles() {
        return institutionRoles;
    }

    /**
     * Institution Roles
     * <p>
     * Roles assigned to the person.
     * 
     */
    @JsonProperty("institutionRoles")
    public void setInstitutionRoles(List<String> institutionRoles) {
        this.institutionRoles = institutionRoles;
    }

    public UserIdentityProfiles withInstitutionRoles(List<String> institutionRoles) {
        this.institutionRoles = institutionRoles;
        return this;
    }

    /**
     * Principal
     * <p>
     * Principal name of the person
     * 
     */
    @JsonProperty("principal")
    public String getPrincipal() {
        return principal;
    }

    /**
     * Principal
     * <p>
     * Principal name of the person
     * 
     */
    @JsonProperty("principal")
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public UserIdentityProfiles withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Credential
     * <p>
     * Credential of the person
     * 
     */
    @JsonProperty("credential")
    public String getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * Credential of the person
     * 
     */
    @JsonProperty("credential")
    public void setCredential(String credential) {
        this.credential = credential;
    }

    public UserIdentityProfiles withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserIdentityProfiles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("udcIdentifier");
        sb.append('=');
        sb.append(((this.udcIdentifier == null)?"<null>":this.udcIdentifier));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("bannerId");
        sb.append('=');
        sb.append(((this.bannerId == null)?"<null>":this.bannerId));
        sb.append(',');
        sb.append("personIdentity");
        sb.append('=');
        sb.append(((this.personIdentity == null)?"<null>":this.personIdentity));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("primaryAddress");
        sb.append('=');
        sb.append(((this.primaryAddress == null)?"<null>":this.primaryAddress));
        sb.append(',');
        sb.append("mobilePhone");
        sb.append('=');
        sb.append(((this.mobilePhone == null)?"<null>":this.mobilePhone));
        sb.append(',');
        sb.append("institutionRoles");
        sb.append('=');
        sb.append(((this.institutionRoles == null)?"<null>":this.institutionRoles));
        sb.append(',');
        sb.append("principal");
        sb.append('=');
        sb.append(((this.principal == null)?"<null>":this.principal));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.bannerId == null)? 0 :this.bannerId.hashCode()));
        result = ((result* 31)+((this.personIdentity == null)? 0 :this.personIdentity.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.institutionRoles == null)? 0 :this.institutionRoles.hashCode()));
        result = ((result* 31)+((this.udcIdentifier == null)? 0 :this.udcIdentifier.hashCode()));
        result = ((result* 31)+((this.principal == null)? 0 :this.principal.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.mobilePhone == null)? 0 :this.mobilePhone.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.primaryAddress == null)? 0 :this.primaryAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserIdentityProfiles) == false) {
            return false;
        }
        UserIdentityProfiles rhs = ((UserIdentityProfiles) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.bannerId == rhs.bannerId)||((this.bannerId!= null)&&this.bannerId.equals(rhs.bannerId))))&&((this.personIdentity == rhs.personIdentity)||((this.personIdentity!= null)&&this.personIdentity.equals(rhs.personIdentity))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.institutionRoles == rhs.institutionRoles)||((this.institutionRoles!= null)&&this.institutionRoles.equals(rhs.institutionRoles))))&&((this.udcIdentifier == rhs.udcIdentifier)||((this.udcIdentifier!= null)&&this.udcIdentifier.equals(rhs.udcIdentifier))))&&((this.principal == rhs.principal)||((this.principal!= null)&&this.principal.equals(rhs.principal))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.mobilePhone == rhs.mobilePhone)||((this.mobilePhone!= null)&&this.mobilePhone.equals(rhs.mobilePhone))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.primaryAddress == rhs.primaryAddress)||((this.primaryAddress!= null)&&this.primaryAddress.equals(rhs.primaryAddress))));
    }

}
