
package com.ellucian.generated.eedm.persons.v12_4_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Persons
 * <p>
 * An individual who interacts independently with the institution in a variety of roles (for example, "student", "constituent", or "vendor").
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "privacyStatus",
    "names",
    "dateOfBirth",
    "dateDeceased",
    "gender",
    "genderIdentity",
    "personalPronoun",
    "religion",
    "ethnicity",
    "races",
    "languages",
    "maritalStatus",
    "veteranStatus",
    "citizenshipStatus",
    "countryOfBirth",
    "citizenshipCountry",
    "roles",
    "identityDocuments",
    "credentials",
    "alternativeCredentials",
    "interests",
    "addresses",
    "phones",
    "emails",
    "socialMedia"
})
@Generated("jsonschema2pojo")
public class Persons {

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
     * A global identifier of a person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a person.")
    private String id;
    /**
     * Privacy Status
     * <p>
     * A privacy status of person's information.
     * 
     */
    @JsonProperty("privacyStatus")
    @JsonPropertyDescription("A privacy status of person's information.")
    private Object privacyStatus;
    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("The names associated with a person, specified by type (for example, \"legal\" or \"birth\").")
    private List<Name> names = new ArrayList<Name>();
    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The date when a person was born.")
    private Object dateOfBirth;
    /**
     * Date Deceased
     * <p>
     * The date when a person died.
     * 
     */
    @JsonProperty("dateDeceased")
    @JsonPropertyDescription("The date when a person died.")
    private Object dateDeceased;
    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological masculinity or femininity of the person.")
    private Object gender;
    /**
     * Gender Identity
     * <p>
     * The person's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    @JsonPropertyDescription("The person's self-selected gender identification.")
    private Object genderIdentity;
    /**
     * Personal Pronoun
     * <p>
     * The person's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    @JsonPropertyDescription("The person's self-selected choice of pronoun.")
    private Object personalPronoun;
    /**
     * Religion
     * <p>
     * The religion of the person.
     * 
     */
    @JsonProperty("religion")
    @JsonPropertyDescription("The religion of the person.")
    private Object religion;
    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the person.
     * 
     */
    @JsonProperty("ethnicity")
    @JsonPropertyDescription("The ethnicity association of the person.")
    private Ethnicity ethnicity;
    /**
     * Races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    @JsonPropertyDescription("The racial groups to which a person belongs.")
    private List<Race> races = new ArrayList<Race>();
    /**
     * Languages
     * <p>
     * The languages the person has certain degree of proficiency in
     * 
     */
    @JsonProperty("languages")
    @JsonPropertyDescription("The languages the person has certain degree of proficiency in")
    private List<Language> languages = new ArrayList<Language>();
    /**
     * Marital Status
     * <p>
     * The current marital state (for example, single, married, or divorced) of the person.
     * 
     */
    @JsonProperty("maritalStatus")
    @JsonPropertyDescription("The current marital state (for example, single, married, or divorced) of the person.")
    private Object maritalStatus;
    /**
     * Veteran Status
     * <p>
     * The current veteran status of the person.
     * 
     */
    @JsonProperty("veteranStatus")
    @JsonPropertyDescription("The current veteran status of the person.")
    private Object veteranStatus;
    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the person with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    @JsonPropertyDescription("The citizenship status of the person with regards to the country where a given institution is located.")
    private Object citizenshipStatus;
    /**
     * Country Of Birth
     * <p>
     * The ISO 3166-1 alpha-3 code of the country which the person was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    @JsonPropertyDescription("The ISO 3166-1 alpha-3 code of the country which the person was born in.")
    private String countryOfBirth;
    /**
     * Citizenship Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country in which the person is a citizen.
     * 
     */
    @JsonProperty("citizenshipCountry")
    @JsonPropertyDescription("The ISO 3166-1 alpha-3 code of the country in which the person is a citizen.")
    private String citizenshipCountry;
    /**
     * Role
     * <p>
     * The roles that a person fills as he/she interacts with the institution.
     * 
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("The roles that a person fills as he/she interacts with the institution.")
    private List<Role> roles = new ArrayList<Role>();
    /**
     * Identity Documents
     * <p>
     * Person's government issued identity documents.
     * 
     */
    @JsonProperty("identityDocuments")
    @JsonPropertyDescription("Person's government issued identity documents.")
    private List<IdentityDocument> identityDocuments = new ArrayList<IdentityDocument>();
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
     * Alternative Credentials
     * <p>
     * Alternative information that uniquely identifies a user.
     * 
     */
    @JsonProperty("alternativeCredentials")
    @JsonPropertyDescription("Alternative information that uniquely identifies a user.")
    private List<AlternativeCredential> alternativeCredentials = new ArrayList<AlternativeCredential>();
    /**
     * Interests
     * <p>
     * Interests recorded for this person.
     * 
     */
    @JsonProperty("interests")
    @JsonPropertyDescription("Interests recorded for this person.")
    private List<Interest> interests = new ArrayList<Interest>();
    /**
     * Address
     * <p>
     * The physical addresses where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical addresses where a person resides or may be contacted by mail.")
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

    public Persons withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a person.
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
     * A global identifier of a person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Persons withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Privacy Status
     * <p>
     * A privacy status of person's information.
     * 
     */
    @JsonProperty("privacyStatus")
    public Object getPrivacyStatus() {
        return privacyStatus;
    }

    /**
     * Privacy Status
     * <p>
     * A privacy status of person's information.
     * 
     */
    @JsonProperty("privacyStatus")
    public void setPrivacyStatus(Object privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    public Persons withPrivacyStatus(Object privacyStatus) {
        this.privacyStatus = privacyStatus;
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
    public List<Name> getNames() {
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
    public void setNames(List<Name> names) {
        this.names = names;
    }

    public Persons withNames(List<Name> names) {
        this.names = names;
        return this;
    }

    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Persons withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Date Deceased
     * <p>
     * The date when a person died.
     * 
     */
    @JsonProperty("dateDeceased")
    public Object getDateDeceased() {
        return dateDeceased;
    }

    /**
     * Date Deceased
     * <p>
     * The date when a person died.
     * 
     */
    @JsonProperty("dateDeceased")
    public void setDateDeceased(Object dateDeceased) {
        this.dateDeceased = dateDeceased;
    }

    public Persons withDateDeceased(Object dateDeceased) {
        this.dateDeceased = dateDeceased;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    public Object getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the person.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Persons withGender(Object gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Gender Identity
     * <p>
     * The person's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public Object getGenderIdentity() {
        return genderIdentity;
    }

    /**
     * Gender Identity
     * <p>
     * The person's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public void setGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public Persons withGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
        return this;
    }

    /**
     * Personal Pronoun
     * <p>
     * The person's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public Object getPersonalPronoun() {
        return personalPronoun;
    }

    /**
     * Personal Pronoun
     * <p>
     * The person's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public void setPersonalPronoun(Object personalPronoun) {
        this.personalPronoun = personalPronoun;
    }

    public Persons withPersonalPronoun(Object personalPronoun) {
        this.personalPronoun = personalPronoun;
        return this;
    }

    /**
     * Religion
     * <p>
     * The religion of the person.
     * 
     */
    @JsonProperty("religion")
    public Object getReligion() {
        return religion;
    }

    /**
     * Religion
     * <p>
     * The religion of the person.
     * 
     */
    @JsonProperty("religion")
    public void setReligion(Object religion) {
        this.religion = religion;
    }

    public Persons withReligion(Object religion) {
        this.religion = religion;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the person.
     * 
     */
    @JsonProperty("ethnicity")
    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the person.
     * 
     */
    @JsonProperty("ethnicity")
    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Persons withEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * Races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    public List<Race> getRaces() {
        return races;
    }

    /**
     * Races
     * <p>
     * The racial groups to which a person belongs.
     * 
     */
    @JsonProperty("races")
    public void setRaces(List<Race> races) {
        this.races = races;
    }

    public Persons withRaces(List<Race> races) {
        this.races = races;
        return this;
    }

    /**
     * Languages
     * <p>
     * The languages the person has certain degree of proficiency in
     * 
     */
    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * Languages
     * <p>
     * The languages the person has certain degree of proficiency in
     * 
     */
    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public Persons withLanguages(List<Language> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * The current marital state (for example, single, married, or divorced) of the person.
     * 
     */
    @JsonProperty("maritalStatus")
    public Object getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Marital Status
     * <p>
     * The current marital state (for example, single, married, or divorced) of the person.
     * 
     */
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Persons withMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * Veteran Status
     * <p>
     * The current veteran status of the person.
     * 
     */
    @JsonProperty("veteranStatus")
    public Object getVeteranStatus() {
        return veteranStatus;
    }

    /**
     * Veteran Status
     * <p>
     * The current veteran status of the person.
     * 
     */
    @JsonProperty("veteranStatus")
    public void setVeteranStatus(Object veteranStatus) {
        this.veteranStatus = veteranStatus;
    }

    public Persons withVeteranStatus(Object veteranStatus) {
        this.veteranStatus = veteranStatus;
        return this;
    }

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the person with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public Object getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the person with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public void setCitizenshipStatus(Object citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }

    public Persons withCitizenshipStatus(Object citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
        return this;
    }

    /**
     * Country Of Birth
     * <p>
     * The ISO 3166-1 alpha-3 code of the country which the person was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Country Of Birth
     * <p>
     * The ISO 3166-1 alpha-3 code of the country which the person was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public Persons withCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    /**
     * Citizenship Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country in which the person is a citizen.
     * 
     */
    @JsonProperty("citizenshipCountry")
    public String getCitizenshipCountry() {
        return citizenshipCountry;
    }

    /**
     * Citizenship Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country in which the person is a citizen.
     * 
     */
    @JsonProperty("citizenshipCountry")
    public void setCitizenshipCountry(String citizenshipCountry) {
        this.citizenshipCountry = citizenshipCountry;
    }

    public Persons withCitizenshipCountry(String citizenshipCountry) {
        this.citizenshipCountry = citizenshipCountry;
        return this;
    }

    /**
     * Role
     * <p>
     * The roles that a person fills as he/she interacts with the institution.
     * 
     */
    @JsonProperty("roles")
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Role
     * <p>
     * The roles that a person fills as he/she interacts with the institution.
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Persons withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Identity Documents
     * <p>
     * Person's government issued identity documents.
     * 
     */
    @JsonProperty("identityDocuments")
    public List<IdentityDocument> getIdentityDocuments() {
        return identityDocuments;
    }

    /**
     * Identity Documents
     * <p>
     * Person's government issued identity documents.
     * 
     */
    @JsonProperty("identityDocuments")
    public void setIdentityDocuments(List<IdentityDocument> identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    public Persons withIdentityDocuments(List<IdentityDocument> identityDocuments) {
        this.identityDocuments = identityDocuments;
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

    public Persons withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
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

    public Persons withAlternativeCredentials(List<AlternativeCredential> alternativeCredentials) {
        this.alternativeCredentials = alternativeCredentials;
        return this;
    }

    /**
     * Interests
     * <p>
     * Interests recorded for this person.
     * 
     */
    @JsonProperty("interests")
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * Interests
     * <p>
     * Interests recorded for this person.
     * 
     */
    @JsonProperty("interests")
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public Persons withInterests(List<Interest> interests) {
        this.interests = interests;
        return this;
    }

    /**
     * Address
     * <p>
     * The physical addresses where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Address
     * <p>
     * The physical addresses where a person resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Persons withAddresses(List<Address> addresses) {
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

    public Persons withPhones(List<Phone> phones) {
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

    public Persons withEmails(List<Email> emails) {
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

    public Persons withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Persons.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("privacyStatus");
        sb.append('=');
        sb.append(((this.privacyStatus == null)?"<null>":this.privacyStatus));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("dateDeceased");
        sb.append('=');
        sb.append(((this.dateDeceased == null)?"<null>":this.dateDeceased));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("genderIdentity");
        sb.append('=');
        sb.append(((this.genderIdentity == null)?"<null>":this.genderIdentity));
        sb.append(',');
        sb.append("personalPronoun");
        sb.append('=');
        sb.append(((this.personalPronoun == null)?"<null>":this.personalPronoun));
        sb.append(',');
        sb.append("religion");
        sb.append('=');
        sb.append(((this.religion == null)?"<null>":this.religion));
        sb.append(',');
        sb.append("ethnicity");
        sb.append('=');
        sb.append(((this.ethnicity == null)?"<null>":this.ethnicity));
        sb.append(',');
        sb.append("races");
        sb.append('=');
        sb.append(((this.races == null)?"<null>":this.races));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("maritalStatus");
        sb.append('=');
        sb.append(((this.maritalStatus == null)?"<null>":this.maritalStatus));
        sb.append(',');
        sb.append("veteranStatus");
        sb.append('=');
        sb.append(((this.veteranStatus == null)?"<null>":this.veteranStatus));
        sb.append(',');
        sb.append("citizenshipStatus");
        sb.append('=');
        sb.append(((this.citizenshipStatus == null)?"<null>":this.citizenshipStatus));
        sb.append(',');
        sb.append("countryOfBirth");
        sb.append('=');
        sb.append(((this.countryOfBirth == null)?"<null>":this.countryOfBirth));
        sb.append(',');
        sb.append("citizenshipCountry");
        sb.append('=');
        sb.append(((this.citizenshipCountry == null)?"<null>":this.citizenshipCountry));
        sb.append(',');
        sb.append("roles");
        sb.append('=');
        sb.append(((this.roles == null)?"<null>":this.roles));
        sb.append(',');
        sb.append("identityDocuments");
        sb.append('=');
        sb.append(((this.identityDocuments == null)?"<null>":this.identityDocuments));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("alternativeCredentials");
        sb.append('=');
        sb.append(((this.alternativeCredentials == null)?"<null>":this.alternativeCredentials));
        sb.append(',');
        sb.append("interests");
        sb.append('=');
        sb.append(((this.interests == null)?"<null>":this.interests));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.ethnicity == null)? 0 :this.ethnicity.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.privacyStatus == null)? 0 :this.privacyStatus.hashCode()));
        result = ((result* 31)+((this.roles == null)? 0 :this.roles.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.citizenshipCountry == null)? 0 :this.citizenshipCountry.hashCode()));
        result = ((result* 31)+((this.veteranStatus == null)? 0 :this.veteranStatus.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.genderIdentity == null)? 0 :this.genderIdentity.hashCode()));
        result = ((result* 31)+((this.countryOfBirth == null)? 0 :this.countryOfBirth.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.identityDocuments == null)? 0 :this.identityDocuments.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.dateDeceased == null)? 0 :this.dateDeceased.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.religion == null)? 0 :this.religion.hashCode()));
        result = ((result* 31)+((this.citizenshipStatus == null)? 0 :this.citizenshipStatus.hashCode()));
        result = ((result* 31)+((this.personalPronoun == null)? 0 :this.personalPronoun.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.alternativeCredentials == null)? 0 :this.alternativeCredentials.hashCode()));
        result = ((result* 31)+((this.races == null)? 0 :this.races.hashCode()));
        result = ((result* 31)+((this.interests == null)? 0 :this.interests.hashCode()));
        result = ((result* 31)+((this.maritalStatus == null)? 0 :this.maritalStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Persons) == false) {
            return false;
        }
        Persons rhs = ((Persons) other);
        return ((((((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.ethnicity == rhs.ethnicity)||((this.ethnicity!= null)&&this.ethnicity.equals(rhs.ethnicity))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.privacyStatus == rhs.privacyStatus)||((this.privacyStatus!= null)&&this.privacyStatus.equals(rhs.privacyStatus))))&&((this.roles == rhs.roles)||((this.roles!= null)&&this.roles.equals(rhs.roles))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.citizenshipCountry == rhs.citizenshipCountry)||((this.citizenshipCountry!= null)&&this.citizenshipCountry.equals(rhs.citizenshipCountry))))&&((this.veteranStatus == rhs.veteranStatus)||((this.veteranStatus!= null)&&this.veteranStatus.equals(rhs.veteranStatus))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.genderIdentity == rhs.genderIdentity)||((this.genderIdentity!= null)&&this.genderIdentity.equals(rhs.genderIdentity))))&&((this.countryOfBirth == rhs.countryOfBirth)||((this.countryOfBirth!= null)&&this.countryOfBirth.equals(rhs.countryOfBirth))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.identityDocuments == rhs.identityDocuments)||((this.identityDocuments!= null)&&this.identityDocuments.equals(rhs.identityDocuments))))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.dateDeceased == rhs.dateDeceased)||((this.dateDeceased!= null)&&this.dateDeceased.equals(rhs.dateDeceased))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.religion == rhs.religion)||((this.religion!= null)&&this.religion.equals(rhs.religion))))&&((this.citizenshipStatus == rhs.citizenshipStatus)||((this.citizenshipStatus!= null)&&this.citizenshipStatus.equals(rhs.citizenshipStatus))))&&((this.personalPronoun == rhs.personalPronoun)||((this.personalPronoun!= null)&&this.personalPronoun.equals(rhs.personalPronoun))))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.alternativeCredentials == rhs.alternativeCredentials)||((this.alternativeCredentials!= null)&&this.alternativeCredentials.equals(rhs.alternativeCredentials))))&&((this.races == rhs.races)||((this.races!= null)&&this.races.equals(rhs.races))))&&((this.interests == rhs.interests)||((this.interests!= null)&&this.interests.equals(rhs.interests))))&&((this.maritalStatus == rhs.maritalStatus)||((this.maritalStatus!= null)&&this.maritalStatus.equals(rhs.maritalStatus))));
    }

}
