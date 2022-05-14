
package com.ellucian.generated.eedm.organizations.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Organizations
 * <p>
 * An organized body of people with a particular purpose, especially a business, society, association, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "roles",
    "credentials",
    "addresses",
    "phones",
    "emails",
    "socialMedia"
})
@Generated("jsonschema2pojo")
public class Organizations {

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
     * The global identifier of the organization
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the organization")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the organization
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the organization")
    private String title;
    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the organization")
    private String description;
    /**
     * Roles
     * <p>
     * The roles the organization plays with respect to the home educational institution
     * 
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("The roles the organization plays with respect to the home educational institution")
    private List<Role> roles = new ArrayList<Role>();
    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Information that identifies a user to a system such as a network or computer")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical locations where the organization resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which the organization can be contacted")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which the organization can be contacted")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    @JsonPropertyDescription("The social media account at which the organization can be contacted.")
    private List<SocialMedium> socialMedia = new ArrayList<SocialMedium>();

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

    public Organizations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the organization
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
     * The global identifier of the organization
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Organizations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the organization
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the organization
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Organizations withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Organizations withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Roles
     * <p>
     * The roles the organization plays with respect to the home educational institution
     * 
     */
    @JsonProperty("roles")
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Roles
     * <p>
     * The roles the organization plays with respect to the home educational institution
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Organizations withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public Organizations withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Organizations withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Organizations withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Organizations withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public List<SocialMedium> getSocialMedia() {
        return socialMedia;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public void setSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public Organizations withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Organizations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("roles");
        sb.append('=');
        sb.append(((this.roles == null)?"<null>":this.roles));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("emails");
        sb.append('=');
        sb.append(((this.emails == null)?"<null>":this.emails));
        sb.append(',');
        sb.append("socialMedia");
        sb.append('=');
        sb.append(((this.socialMedia == null)?"<null>":this.socialMedia));
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
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.roles == null)? 0 :this.roles.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Organizations) == false) {
            return false;
        }
        Organizations rhs = ((Organizations) other);
        return (((((((((((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.roles == rhs.roles)||((this.roles!= null)&&this.roles.equals(rhs.roles))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))));
    }

}
