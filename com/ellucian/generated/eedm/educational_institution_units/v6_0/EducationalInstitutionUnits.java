
package com.ellucian.generated.eedm.educational_institution_units.v6_0;

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
 * Educational Institution Units
 * <p>
 * Operational units of an educational institution, such as a department
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "parents",
    "addresses",
    "phones",
    "emails",
    "socialMedia"
})
@Generated("jsonschema2pojo")
public class EducationalInstitutionUnits {

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
     * The global identifier of the educational institution unit
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the educational institution unit")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the unit
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the unit")
    private String title;
    /**
     * Description
     * <p>
     * The description of the unit
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the unit")
    private String description;
    /**
     * Type
     * <p>
     * The type of the unit (e.g., school, division, department, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the unit (e.g., school, division, department, etc.)")
    private EducationalInstitutionUnits.Type type;
    /**
     * Parents
     * <p>
     * The parent institution and upper-level unit of the institution
     * (Required)
     * 
     */
    @JsonProperty("parents")
    @JsonPropertyDescription("The parent institution and upper-level unit of the institution")
    private Parents parents;
    /**
     * Addresses
     * <p>
     * The physical locations where the unit resides or may be contacted by mail
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical locations where the unit resides or may be contacted by mail")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the unit can be contacted
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which the unit can be contacted")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Email
     * <p>
     * The email addresses at which the unit can be contacted
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which the unit can be contacted")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Social Media
     * <p>
     * The social media account at which the unit can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    @JsonPropertyDescription("The social media account at which the unit can be contacted.")
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

    public EducationalInstitutionUnits withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the educational institution unit
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
     * The global identifier of the educational institution unit
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EducationalInstitutionUnits withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the unit
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
     * The full name of the unit
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EducationalInstitutionUnits withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the unit
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the unit
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EducationalInstitutionUnits withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the unit (e.g., school, division, department, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public EducationalInstitutionUnits.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the unit (e.g., school, division, department, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(EducationalInstitutionUnits.Type type) {
        this.type = type;
    }

    public EducationalInstitutionUnits withType(EducationalInstitutionUnits.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Parents
     * <p>
     * The parent institution and upper-level unit of the institution
     * (Required)
     * 
     */
    @JsonProperty("parents")
    public Parents getParents() {
        return parents;
    }

    /**
     * Parents
     * <p>
     * The parent institution and upper-level unit of the institution
     * (Required)
     * 
     */
    @JsonProperty("parents")
    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public EducationalInstitutionUnits withParents(Parents parents) {
        this.parents = parents;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the unit resides or may be contacted by mail
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the unit resides or may be contacted by mail
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public EducationalInstitutionUnits withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the unit can be contacted
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the unit can be contacted
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public EducationalInstitutionUnits withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the unit can be contacted
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the unit can be contacted
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public EducationalInstitutionUnits withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the unit can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public List<SocialMedium> getSocialMedia() {
        return socialMedia;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the unit can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public void setSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public EducationalInstitutionUnits withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EducationalInstitutionUnits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("parents");
        sb.append('=');
        sb.append(((this.parents == null)?"<null>":this.parents));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.parents == null)? 0 :this.parents.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EducationalInstitutionUnits) == false) {
            return false;
        }
        EducationalInstitutionUnits rhs = ((EducationalInstitutionUnits) other);
        return (((((((((((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.parents == rhs.parents)||((this.parents!= null)&&this.parents.equals(rhs.parents))));
    }


    /**
     * Type
     * <p>
     * The type of the unit (e.g., school, division, department, etc.)
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        COLLEGE("college"),
        SCHOOL("school"),
        DIVISION("division"),
        DEPARTMENT("department"),
        INSTITUTE("institute"),
        FACILITY("facility"),
        OFFICE("office");
        private final String value;
        private final static Map<String, EducationalInstitutionUnits.Type> CONSTANTS = new HashMap<String, EducationalInstitutionUnits.Type>();

        static {
            for (EducationalInstitutionUnits.Type c: values()) {
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
        public static EducationalInstitutionUnits.Type fromValue(String value) {
            EducationalInstitutionUnits.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
