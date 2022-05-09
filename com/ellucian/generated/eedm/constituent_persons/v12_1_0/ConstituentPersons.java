
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Persons
 * <p>
 * An individual who is of interest to an advancement system, may or may not be part of the standard persons entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "referenceId",
    "names",
    "status",
    "birth",
    "death",
    "affiliation",
    "gender",
    "religion",
    "vocation",
    "ethnicCategory",
    "races",
    "preferredLanguage",
    "nationalities",
    "credentials",
    "addresses",
    "phones",
    "emails",
    "socialMedia",
    "source"
})
@Generated("jsonschema2pojo")
public class ConstituentPersons {

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
     * A global identifier of a constituent person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a constituent person.")
    private String id;
    /**
     * Person
     * <p>
     * An optional reference to link a constituent person to the common persons entity.
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("An optional reference to link a constituent person to the common persons entity.")
    private Object person;
    /**
     * Reference Id
     * <p>
     * The authoritative system's reference identifier of the person.
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("The authoritative system's reference identifier of the person.")
    private String referenceId;
    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("The names associated with a person, specified by type (for example, \"legal\" or \"birth\").")
    private Names names;
    /**
     * Status
     * <p>
     * The status of the person.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the person.")
    private Object status;
    /**
     * Birth
     * <p>
     * Information about the constituent's birth
     * 
     */
    @JsonProperty("birth")
    @JsonPropertyDescription("Information about the constituent's birth")
    private Birth birth;
    /**
     * Death
     * <p>
     * Information about the constituent's death.
     * 
     */
    @JsonProperty("death")
    @JsonPropertyDescription("Information about the constituent's death.")
    private Death death;
    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    @JsonPropertyDescription("The constituents relationship to the institution.")
    private List<Affiliation> affiliation = new ArrayList<Affiliation>();
    /**
     * Gender
     * <p>
     * The biological or social cultural masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological or social cultural masculinity or femininity of the person.")
    private Object gender;
    /**
     * Religion
     * <p>
     * The religion of the constituent.
     * 
     */
    @JsonProperty("religion")
    @JsonPropertyDescription("The religion of the constituent.")
    private Object religion;
    /**
     * Vocation
     * <p>
     * The vocation of the constituent.
     * 
     */
    @JsonProperty("vocation")
    @JsonPropertyDescription("The vocation of the constituent.")
    private Object vocation;
    /**
     * Ethnic Category
     * <p>
     * The category of ethnic origin to which the person belongs.
     * 
     */
    @JsonProperty("ethnicCategory")
    @JsonPropertyDescription("The category of ethnic origin to which the person belongs.")
    private Object ethnicCategory;
    /**
     * races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    @JsonPropertyDescription("The racial groups to which a person belongs.")
    private List<Race> races = new ArrayList<Race>();
    /**
     * Preferred Language
     * <p>
     * The preferred language of the person.
     * 
     */
    @JsonProperty("preferredLanguage")
    @JsonPropertyDescription("The preferred language of the person.")
    private Object preferredLanguage;
    /**
     * Nationalities
     * <p>
     * The citizenships of the person.
     * 
     */
    @JsonProperty("nationalities")
    @JsonPropertyDescription("The citizenships of the person.")
    private List<Nationality> nationalities = new ArrayList<Nationality>();
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
     * Addresses
     * <p>
     * The physical locations where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical locations where a person resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a person can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which a person can be contacted.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Email
     * <p>
     * The email addresses at which a person can be contacted.
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which a person can be contacted.")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Social Media
     * <p>
     * The social media account at which a person can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    @JsonPropertyDescription("The social media account at which a person can be contacted.")
    private List<SocialMedium> socialMedia = new ArrayList<SocialMedium>();
    /**
     * Source
     * <p>
     * The source of the person.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the person.")
    private Object source;

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

    public ConstituentPersons withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a constituent person.
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
     * A global identifier of a constituent person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentPersons withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * An optional reference to link a constituent person to the common persons entity.
     * 
     */
    @JsonProperty("person")
    public Object getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * An optional reference to link a constituent person to the common persons entity.
     * 
     */
    @JsonProperty("person")
    public void setPerson(Object person) {
        this.person = person;
    }

    public ConstituentPersons withPerson(Object person) {
        this.person = person;
        return this;
    }

    /**
     * Reference Id
     * <p>
     * The authoritative system's reference identifier of the person.
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Reference Id
     * <p>
     * The authoritative system's reference identifier of the person.
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public ConstituentPersons withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    public ConstituentPersons withNames(Names names) {
        this.names = names;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the person.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the person.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ConstituentPersons withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Birth
     * <p>
     * Information about the constituent's birth
     * 
     */
    @JsonProperty("birth")
    public Birth getBirth() {
        return birth;
    }

    /**
     * Birth
     * <p>
     * Information about the constituent's birth
     * 
     */
    @JsonProperty("birth")
    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public ConstituentPersons withBirth(Birth birth) {
        this.birth = birth;
        return this;
    }

    /**
     * Death
     * <p>
     * Information about the constituent's death.
     * 
     */
    @JsonProperty("death")
    public Death getDeath() {
        return death;
    }

    /**
     * Death
     * <p>
     * Information about the constituent's death.
     * 
     */
    @JsonProperty("death")
    public void setDeath(Death death) {
        this.death = death;
    }

    public ConstituentPersons withDeath(Death death) {
        this.death = death;
        return this;
    }

    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    public List<Affiliation> getAffiliation() {
        return affiliation;
    }

    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    public void setAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
    }

    public ConstituentPersons withAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological or social cultural masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    public Object getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological or social cultural masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public ConstituentPersons withGender(Object gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Religion
     * <p>
     * The religion of the constituent.
     * 
     */
    @JsonProperty("religion")
    public Object getReligion() {
        return religion;
    }

    /**
     * Religion
     * <p>
     * The religion of the constituent.
     * 
     */
    @JsonProperty("religion")
    public void setReligion(Object religion) {
        this.religion = religion;
    }

    public ConstituentPersons withReligion(Object religion) {
        this.religion = religion;
        return this;
    }

    /**
     * Vocation
     * <p>
     * The vocation of the constituent.
     * 
     */
    @JsonProperty("vocation")
    public Object getVocation() {
        return vocation;
    }

    /**
     * Vocation
     * <p>
     * The vocation of the constituent.
     * 
     */
    @JsonProperty("vocation")
    public void setVocation(Object vocation) {
        this.vocation = vocation;
    }

    public ConstituentPersons withVocation(Object vocation) {
        this.vocation = vocation;
        return this;
    }

    /**
     * Ethnic Category
     * <p>
     * The category of ethnic origin to which the person belongs.
     * 
     */
    @JsonProperty("ethnicCategory")
    public Object getEthnicCategory() {
        return ethnicCategory;
    }

    /**
     * Ethnic Category
     * <p>
     * The category of ethnic origin to which the person belongs.
     * 
     */
    @JsonProperty("ethnicCategory")
    public void setEthnicCategory(Object ethnicCategory) {
        this.ethnicCategory = ethnicCategory;
    }

    public ConstituentPersons withEthnicCategory(Object ethnicCategory) {
        this.ethnicCategory = ethnicCategory;
        return this;
    }

    /**
     * races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    public List<Race> getRaces() {
        return races;
    }

    /**
     * races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    public void setRaces(List<Race> races) {
        this.races = races;
    }

    public ConstituentPersons withRaces(List<Race> races) {
        this.races = races;
        return this;
    }

    /**
     * Preferred Language
     * <p>
     * The preferred language of the person.
     * 
     */
    @JsonProperty("preferredLanguage")
    public Object getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Preferred Language
     * <p>
     * The preferred language of the person.
     * 
     */
    @JsonProperty("preferredLanguage")
    public void setPreferredLanguage(Object preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public ConstituentPersons withPreferredLanguage(Object preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * Nationalities
     * <p>
     * The citizenships of the person.
     * 
     */
    @JsonProperty("nationalities")
    public List<Nationality> getNationalities() {
        return nationalities;
    }

    /**
     * Nationalities
     * <p>
     * The citizenships of the person.
     * 
     */
    @JsonProperty("nationalities")
    public void setNationalities(List<Nationality> nationalities) {
        this.nationalities = nationalities;
    }

    public ConstituentPersons withNationalities(List<Nationality> nationalities) {
        this.nationalities = nationalities;
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

    public ConstituentPersons withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ConstituentPersons withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a person can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a person can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public ConstituentPersons withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which a person can be contacted.
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which a person can be contacted.
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public ConstituentPersons withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which a person can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public List<SocialMedium> getSocialMedia() {
        return socialMedia;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which a person can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public void setSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public ConstituentPersons withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the person.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the person.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentPersons withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentPersons.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("birth");
        sb.append('=');
        sb.append(((this.birth == null)?"<null>":this.birth));
        sb.append(',');
        sb.append("death");
        sb.append('=');
        sb.append(((this.death == null)?"<null>":this.death));
        sb.append(',');
        sb.append("affiliation");
        sb.append('=');
        sb.append(((this.affiliation == null)?"<null>":this.affiliation));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("religion");
        sb.append('=');
        sb.append(((this.religion == null)?"<null>":this.religion));
        sb.append(',');
        sb.append("vocation");
        sb.append('=');
        sb.append(((this.vocation == null)?"<null>":this.vocation));
        sb.append(',');
        sb.append("ethnicCategory");
        sb.append('=');
        sb.append(((this.ethnicCategory == null)?"<null>":this.ethnicCategory));
        sb.append(',');
        sb.append("races");
        sb.append('=');
        sb.append(((this.races == null)?"<null>":this.races));
        sb.append(',');
        sb.append("preferredLanguage");
        sb.append('=');
        sb.append(((this.preferredLanguage == null)?"<null>":this.preferredLanguage));
        sb.append(',');
        sb.append("nationalities");
        sb.append('=');
        sb.append(((this.nationalities == null)?"<null>":this.nationalities));
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.preferredLanguage == null)? 0 :this.preferredLanguage.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.death == null)? 0 :this.death.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.birth == null)? 0 :this.birth.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.nationalities == null)? 0 :this.nationalities.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.religion == null)? 0 :this.religion.hashCode()));
        result = ((result* 31)+((this.ethnicCategory == null)? 0 :this.ethnicCategory.hashCode()));
        result = ((result* 31)+((this.vocation == null)? 0 :this.vocation.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.affiliation == null)? 0 :this.affiliation.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.races == null)? 0 :this.races.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentPersons) == false) {
            return false;
        }
        ConstituentPersons rhs = ((ConstituentPersons) other);
        return (((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.preferredLanguage == rhs.preferredLanguage)||((this.preferredLanguage!= null)&&this.preferredLanguage.equals(rhs.preferredLanguage))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.death == rhs.death)||((this.death!= null)&&this.death.equals(rhs.death))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.birth == rhs.birth)||((this.birth!= null)&&this.birth.equals(rhs.birth))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.nationalities == rhs.nationalities)||((this.nationalities!= null)&&this.nationalities.equals(rhs.nationalities))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.religion == rhs.religion)||((this.religion!= null)&&this.religion.equals(rhs.religion))))&&((this.ethnicCategory == rhs.ethnicCategory)||((this.ethnicCategory!= null)&&this.ethnicCategory.equals(rhs.ethnicCategory))))&&((this.vocation == rhs.vocation)||((this.vocation!= null)&&this.vocation.equals(rhs.vocation))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.affiliation == rhs.affiliation)||((this.affiliation!= null)&&this.affiliation.equals(rhs.affiliation))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.races == rhs.races)||((this.races!= null)&&this.races.equals(rhs.races))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
