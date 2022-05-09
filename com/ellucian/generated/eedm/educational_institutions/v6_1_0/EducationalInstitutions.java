
package com.ellucian.generated.eedm.educational_institutions.v6_1_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Educational Institutions
 * <p>
 * Institutions that provides instructional or education related services to individuals or other organizations/institutions (e.g. High Schools, Colleges, Continuing Education providers).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "homeInstitution",
    "standardizedCodes",
    "addresses",
    "phones",
    "emails",
    "socialMedia",
    "credentials"
})
@Generated("jsonschema2pojo")
public class EducationalInstitutions {

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
     * The global identifier of the institution
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the institution")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the institution
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the institution")
    private String title;
    /**
     * Description
     * <p>
     * The description of the institution.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the institution.")
    private String description;
    /**
     * Type
     * <p>
     * The type of the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the institution.")
    private EducationalInstitutions.Type type;
    /**
     * Home Institution
     * <p>
     * Indicates if this is a 'home' or 'external' institution.
     * (Required)
     * 
     */
    @JsonProperty("homeInstitution")
    @JsonPropertyDescription("Indicates if this is a 'home' or 'external' institution.")
    private EducationalInstitutions.HomeInstitution homeInstitution;
    /**
     * Standardized Codes
     * <p>
     * Standardized education-specific codes/IDs that are assigned to the institution.
     * 
     */
    @JsonProperty("standardizedCodes")
    @JsonPropertyDescription("Standardized education-specific codes/IDs that are assigned to the institution.")
    private List<StandardizedCode> standardizedCodes = new ArrayList<StandardizedCode>();
    /**
     * Addresses
     * <p>
     * The physical locations where the institution resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical locations where the institution resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the institution can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which the institution can be contacted.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Email
     * <p>
     * The email addresses at which the institution can be contacted
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which the institution can be contacted")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Social Media
     * <p>
     * The social media account at which the institution can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    @JsonPropertyDescription("The social media account at which the institution can be contacted.")
    private List<SocialMedium> socialMedia = new ArrayList<SocialMedium>();
    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Information that identifies a user to a system such as a network or computer.")
    private List<Credential> credentials = new ArrayList<Credential>();

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

    public EducationalInstitutions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the institution
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
     * The global identifier of the institution
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EducationalInstitutions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the institution
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
     * The full name of the institution
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EducationalInstitutions withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the institution.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the institution.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EducationalInstitutions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public EducationalInstitutions.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(EducationalInstitutions.Type type) {
        this.type = type;
    }

    public EducationalInstitutions withType(EducationalInstitutions.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Home Institution
     * <p>
     * Indicates if this is a 'home' or 'external' institution.
     * (Required)
     * 
     */
    @JsonProperty("homeInstitution")
    public EducationalInstitutions.HomeInstitution getHomeInstitution() {
        return homeInstitution;
    }

    /**
     * Home Institution
     * <p>
     * Indicates if this is a 'home' or 'external' institution.
     * (Required)
     * 
     */
    @JsonProperty("homeInstitution")
    public void setHomeInstitution(EducationalInstitutions.HomeInstitution homeInstitution) {
        this.homeInstitution = homeInstitution;
    }

    public EducationalInstitutions withHomeInstitution(EducationalInstitutions.HomeInstitution homeInstitution) {
        this.homeInstitution = homeInstitution;
        return this;
    }

    /**
     * Standardized Codes
     * <p>
     * Standardized education-specific codes/IDs that are assigned to the institution.
     * 
     */
    @JsonProperty("standardizedCodes")
    public List<StandardizedCode> getStandardizedCodes() {
        return standardizedCodes;
    }

    /**
     * Standardized Codes
     * <p>
     * Standardized education-specific codes/IDs that are assigned to the institution.
     * 
     */
    @JsonProperty("standardizedCodes")
    public void setStandardizedCodes(List<StandardizedCode> standardizedCodes) {
        this.standardizedCodes = standardizedCodes;
    }

    public EducationalInstitutions withStandardizedCodes(List<StandardizedCode> standardizedCodes) {
        this.standardizedCodes = standardizedCodes;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the institution resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the institution resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public EducationalInstitutions withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the institution can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the institution can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public EducationalInstitutions withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the institution can be contacted
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the institution can be contacted
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public EducationalInstitutions withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the institution can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public List<SocialMedium> getSocialMedia() {
        return socialMedia;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the institution can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public void setSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public EducationalInstitutions withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public EducationalInstitutions withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EducationalInstitutions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("homeInstitution");
        sb.append('=');
        sb.append(((this.homeInstitution == null)?"<null>":this.homeInstitution));
        sb.append(',');
        sb.append("standardizedCodes");
        sb.append('=');
        sb.append(((this.standardizedCodes == null)?"<null>":this.standardizedCodes));
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
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
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
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.standardizedCodes == null)? 0 :this.standardizedCodes.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.homeInstitution == null)? 0 :this.homeInstitution.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EducationalInstitutions) == false) {
            return false;
        }
        EducationalInstitutions rhs = ((EducationalInstitutions) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.standardizedCodes == rhs.standardizedCodes)||((this.standardizedCodes!= null)&&this.standardizedCodes.equals(rhs.standardizedCodes))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.homeInstitution == rhs.homeInstitution)||((this.homeInstitution!= null)&&this.homeInstitution.equals(rhs.homeInstitution))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }


    /**
     * Home Institution
     * <p>
     * Indicates if this is a 'home' or 'external' institution.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum HomeInstitution {

        HOME("home"),
        EXTERNAL("external");
        private final String value;
        private final static Map<String, EducationalInstitutions.HomeInstitution> CONSTANTS = new HashMap<String, EducationalInstitutions.HomeInstitution>();

        static {
            for (EducationalInstitutions.HomeInstitution c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        HomeInstitution(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EducationalInstitutions.HomeInstitution fromValue(String value) {
            EducationalInstitutions.HomeInstitution constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type
     * <p>
     * The type of the institution.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SECONDARY_SCHOOL("secondarySchool"),
        POST_SECONDARY_SCHOOL("postSecondarySchool");
        private final String value;
        private final static Map<String, EducationalInstitutions.Type> CONSTANTS = new HashMap<String, EducationalInstitutions.Type>();

        static {
            for (EducationalInstitutions.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EducationalInstitutions.Type fromValue(String value) {
            EducationalInstitutions.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
