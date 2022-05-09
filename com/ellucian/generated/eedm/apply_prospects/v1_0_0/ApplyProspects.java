
package com.ellucian.generated.eedm.apply_prospects.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Apply Prospects
 * <p>
 * Prospects applying or looking to apply to an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "firstName",
    "middleName",
    "lastNamePrefix",
    "lastName",
    "emails",
    "phones",
    "addresses",
    "gender",
    "genderIdentity",
    "personalPronoun",
    "dateOfBirth",
    "citizenshipStatus",
    "ethnicity",
    "races",
    "birthCity",
    "countryOfBirth",
    "citizenshipCountry",
    "highSchools",
    "priorColleges",
    "interests",
    "visa"
})
@Generated("jsonschema2pojo")
public class ApplyProspects {

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
     * The global identifier of the apply prospect.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the apply prospect.")
    private String id;
    /**
     * First Name
     * <p>
     * The prospect's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The prospect's first, or given, name.")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * The prospect's middle name.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("The prospect's middle name.")
    private String middleName;
    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a prospect's last name. For example, "De la", "Van", or "Van der Von".
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("The article or preposition portion of a prospect's last name. For example, \"De la\", \"Van\", or \"Van der Von\".")
    private String lastNamePrefix;
    /**
     * Last Name
     * <p>
     * The prospect's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The prospect's last, or family, name.")
    private String lastName;
    /**
     * Email
     * <p>
     * The email addresses at which a prospect can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which a prospect can be contacted.")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a prospect can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which a prospect can be contacted.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Address
     * <p>
     * The physical addresses where a prospect resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical addresses where a prospect resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological masculinity or femininity of the prospect.")
    private Object gender;
    /**
     * Gender Identity
     * <p>
     * The prospect's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    @JsonPropertyDescription("The prospect's self-selected gender identification.")
    private Object genderIdentity;
    /**
     * Personal Pronoun
     * <p>
     * The prospect's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    @JsonPropertyDescription("The prospect's self-selected choice of pronoun.")
    private Object personalPronoun;
    /**
     * Date of Birth
     * <p>
     * The date when the prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The date when the prospect was born.")
    private Object dateOfBirth;
    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the prospect with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    @JsonPropertyDescription("The citizenship status of the prospect with regards to the country where a given institution is located.")
    private Object citizenshipStatus;
    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the prospect.
     * 
     */
    @JsonProperty("ethnicity")
    @JsonPropertyDescription("The ethnicity association of the prospect.")
    private Ethnicity ethnicity;
    /**
     * Races
     * <p>
     * The racial groups to which a prospect belongs.
     * 
     */
    @JsonProperty("races")
    @JsonPropertyDescription("The racial groups to which a prospect belongs.")
    private List<Race> races = new ArrayList<Race>();
    /**
     * Birth City
     * <p>
     * The city which the prospect was born in.
     * 
     */
    @JsonProperty("birthCity")
    @JsonPropertyDescription("The city which the prospect was born in.")
    private String birthCity;
    /**
     * Country of Birth
     * <p>
     * The country which the prospect was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    @JsonPropertyDescription("The country which the prospect was born in.")
    private Object countryOfBirth;
    /**
     * Citizenship Country
     * <p>
     * The country in which the prospect is a citizen
     * 
     */
    @JsonProperty("citizenshipCountry")
    @JsonPropertyDescription("The country in which the prospect is a citizen")
    private Object citizenshipCountry;
    /**
     * High Schools
     * <p>
     * The high schools where the prospect studied.
     * 
     */
    @JsonProperty("highSchools")
    @JsonPropertyDescription("The high schools where the prospect studied.")
    private List<HighSchool> highSchools = new ArrayList<HighSchool>();
    /**
     * Prior Colleges
     * <p>
     * The prior colleges where the prospect studied.
     * 
     */
    @JsonProperty("priorColleges")
    @JsonPropertyDescription("The prior colleges where the prospect studied.")
    private List<PriorCollege> priorColleges = new ArrayList<PriorCollege>();
    /**
     * Interests
     * <p>
     * Interests recorded for this prospect.
     * 
     */
    @JsonProperty("interests")
    @JsonPropertyDescription("Interests recorded for this prospect.")
    private List<Interest> interests = new ArrayList<Interest>();
    /**
     * Visa
     * <p>
     * The Visa details of the prospect.
     * 
     */
    @JsonProperty("visa")
    @JsonPropertyDescription("The Visa details of the prospect.")
    private Visa visa;

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

    public ApplyProspects withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the apply prospect.
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
     * The global identifier of the apply prospect.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplyProspects withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * First Name
     * <p>
     * The prospect's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The prospect's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ApplyProspects withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * The prospect's middle name.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * The prospect's middle name.
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public ApplyProspects withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a prospect's last name. For example, "De la", "Van", or "Van der Von".
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a prospect's last name. For example, "De la", "Van", or "Van der Von".
     * 
     */
    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public ApplyProspects withLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The prospect's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The prospect's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ApplyProspects withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which a prospect can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which a prospect can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public ApplyProspects withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a prospect can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which a prospect can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public ApplyProspects withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Address
     * <p>
     * The physical addresses where a prospect resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Address
     * <p>
     * The physical addresses where a prospect resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ApplyProspects withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    public Object getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public ApplyProspects withGender(Object gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Gender Identity
     * <p>
     * The prospect's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public Object getGenderIdentity() {
        return genderIdentity;
    }

    /**
     * Gender Identity
     * <p>
     * The prospect's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public void setGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public ApplyProspects withGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
        return this;
    }

    /**
     * Personal Pronoun
     * <p>
     * The prospect's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public Object getPersonalPronoun() {
        return personalPronoun;
    }

    /**
     * Personal Pronoun
     * <p>
     * The prospect's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public void setPersonalPronoun(Object personalPronoun) {
        this.personalPronoun = personalPronoun;
    }

    public ApplyProspects withPersonalPronoun(Object personalPronoun) {
        this.personalPronoun = personalPronoun;
        return this;
    }

    /**
     * Date of Birth
     * <p>
     * The date when the prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of Birth
     * <p>
     * The date when the prospect was born.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ApplyProspects withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the prospect with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public Object getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the prospect with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public void setCitizenshipStatus(Object citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }

    public ApplyProspects withCitizenshipStatus(Object citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the prospect.
     * 
     */
    @JsonProperty("ethnicity")
    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    /**
     * Ethnicity
     * <p>
     * The ethnicity association of the prospect.
     * 
     */
    @JsonProperty("ethnicity")
    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    public ApplyProspects withEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * Races
     * <p>
     * The racial groups to which a prospect belongs.
     * 
     */
    @JsonProperty("races")
    public List<Race> getRaces() {
        return races;
    }

    /**
     * Races
     * <p>
     * The racial groups to which a prospect belongs.
     * 
     */
    @JsonProperty("races")
    public void setRaces(List<Race> races) {
        this.races = races;
    }

    public ApplyProspects withRaces(List<Race> races) {
        this.races = races;
        return this;
    }

    /**
     * Birth City
     * <p>
     * The city which the prospect was born in.
     * 
     */
    @JsonProperty("birthCity")
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Birth City
     * <p>
     * The city which the prospect was born in.
     * 
     */
    @JsonProperty("birthCity")
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public ApplyProspects withBirthCity(String birthCity) {
        this.birthCity = birthCity;
        return this;
    }

    /**
     * Country of Birth
     * <p>
     * The country which the prospect was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    public Object getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Country of Birth
     * <p>
     * The country which the prospect was born in.
     * 
     */
    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(Object countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public ApplyProspects withCountryOfBirth(Object countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    /**
     * Citizenship Country
     * <p>
     * The country in which the prospect is a citizen
     * 
     */
    @JsonProperty("citizenshipCountry")
    public Object getCitizenshipCountry() {
        return citizenshipCountry;
    }

    /**
     * Citizenship Country
     * <p>
     * The country in which the prospect is a citizen
     * 
     */
    @JsonProperty("citizenshipCountry")
    public void setCitizenshipCountry(Object citizenshipCountry) {
        this.citizenshipCountry = citizenshipCountry;
    }

    public ApplyProspects withCitizenshipCountry(Object citizenshipCountry) {
        this.citizenshipCountry = citizenshipCountry;
        return this;
    }

    /**
     * High Schools
     * <p>
     * The high schools where the prospect studied.
     * 
     */
    @JsonProperty("highSchools")
    public List<HighSchool> getHighSchools() {
        return highSchools;
    }

    /**
     * High Schools
     * <p>
     * The high schools where the prospect studied.
     * 
     */
    @JsonProperty("highSchools")
    public void setHighSchools(List<HighSchool> highSchools) {
        this.highSchools = highSchools;
    }

    public ApplyProspects withHighSchools(List<HighSchool> highSchools) {
        this.highSchools = highSchools;
        return this;
    }

    /**
     * Prior Colleges
     * <p>
     * The prior colleges where the prospect studied.
     * 
     */
    @JsonProperty("priorColleges")
    public List<PriorCollege> getPriorColleges() {
        return priorColleges;
    }

    /**
     * Prior Colleges
     * <p>
     * The prior colleges where the prospect studied.
     * 
     */
    @JsonProperty("priorColleges")
    public void setPriorColleges(List<PriorCollege> priorColleges) {
        this.priorColleges = priorColleges;
    }

    public ApplyProspects withPriorColleges(List<PriorCollege> priorColleges) {
        this.priorColleges = priorColleges;
        return this;
    }

    /**
     * Interests
     * <p>
     * Interests recorded for this prospect.
     * 
     */
    @JsonProperty("interests")
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * Interests
     * <p>
     * Interests recorded for this prospect.
     * 
     */
    @JsonProperty("interests")
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public ApplyProspects withInterests(List<Interest> interests) {
        this.interests = interests;
        return this;
    }

    /**
     * Visa
     * <p>
     * The Visa details of the prospect.
     * 
     */
    @JsonProperty("visa")
    public Visa getVisa() {
        return visa;
    }

    /**
     * Visa
     * <p>
     * The Visa details of the prospect.
     * 
     */
    @JsonProperty("visa")
    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public ApplyProspects withVisa(Visa visa) {
        this.visa = visa;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplyProspects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("emails");
        sb.append('=');
        sb.append(((this.emails == null)?"<null>":this.emails));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
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
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("citizenshipStatus");
        sb.append('=');
        sb.append(((this.citizenshipStatus == null)?"<null>":this.citizenshipStatus));
        sb.append(',');
        sb.append("ethnicity");
        sb.append('=');
        sb.append(((this.ethnicity == null)?"<null>":this.ethnicity));
        sb.append(',');
        sb.append("races");
        sb.append('=');
        sb.append(((this.races == null)?"<null>":this.races));
        sb.append(',');
        sb.append("birthCity");
        sb.append('=');
        sb.append(((this.birthCity == null)?"<null>":this.birthCity));
        sb.append(',');
        sb.append("countryOfBirth");
        sb.append('=');
        sb.append(((this.countryOfBirth == null)?"<null>":this.countryOfBirth));
        sb.append(',');
        sb.append("citizenshipCountry");
        sb.append('=');
        sb.append(((this.citizenshipCountry == null)?"<null>":this.citizenshipCountry));
        sb.append(',');
        sb.append("highSchools");
        sb.append('=');
        sb.append(((this.highSchools == null)?"<null>":this.highSchools));
        sb.append(',');
        sb.append("priorColleges");
        sb.append('=');
        sb.append(((this.priorColleges == null)?"<null>":this.priorColleges));
        sb.append(',');
        sb.append("interests");
        sb.append('=');
        sb.append(((this.interests == null)?"<null>":this.interests));
        sb.append(',');
        sb.append("visa");
        sb.append('=');
        sb.append(((this.visa == null)?"<null>":this.visa));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.ethnicity == null)? 0 :this.ethnicity.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.birthCity == null)? 0 :this.birthCity.hashCode()));
        result = ((result* 31)+((this.citizenshipCountry == null)? 0 :this.citizenshipCountry.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.highSchools == null)? 0 :this.highSchools.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.genderIdentity == null)? 0 :this.genderIdentity.hashCode()));
        result = ((result* 31)+((this.citizenshipStatus == null)? 0 :this.citizenshipStatus.hashCode()));
        result = ((result* 31)+((this.personalPronoun == null)? 0 :this.personalPronoun.hashCode()));
        result = ((result* 31)+((this.countryOfBirth == null)? 0 :this.countryOfBirth.hashCode()));
        result = ((result* 31)+((this.races == null)? 0 :this.races.hashCode()));
        result = ((result* 31)+((this.visa == null)? 0 :this.visa.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.priorColleges == null)? 0 :this.priorColleges.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.interests == null)? 0 :this.interests.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplyProspects) == false) {
            return false;
        }
        ApplyProspects rhs = ((ApplyProspects) other);
        return ((((((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.ethnicity == rhs.ethnicity)||((this.ethnicity!= null)&&this.ethnicity.equals(rhs.ethnicity))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.birthCity == rhs.birthCity)||((this.birthCity!= null)&&this.birthCity.equals(rhs.birthCity))))&&((this.citizenshipCountry == rhs.citizenshipCountry)||((this.citizenshipCountry!= null)&&this.citizenshipCountry.equals(rhs.citizenshipCountry))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.highSchools == rhs.highSchools)||((this.highSchools!= null)&&this.highSchools.equals(rhs.highSchools))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.genderIdentity == rhs.genderIdentity)||((this.genderIdentity!= null)&&this.genderIdentity.equals(rhs.genderIdentity))))&&((this.citizenshipStatus == rhs.citizenshipStatus)||((this.citizenshipStatus!= null)&&this.citizenshipStatus.equals(rhs.citizenshipStatus))))&&((this.personalPronoun == rhs.personalPronoun)||((this.personalPronoun!= null)&&this.personalPronoun.equals(rhs.personalPronoun))))&&((this.countryOfBirth == rhs.countryOfBirth)||((this.countryOfBirth!= null)&&this.countryOfBirth.equals(rhs.countryOfBirth))))&&((this.races == rhs.races)||((this.races!= null)&&this.races.equals(rhs.races))))&&((this.visa == rhs.visa)||((this.visa!= null)&&this.visa.equals(rhs.visa))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.priorColleges == rhs.priorColleges)||((this.priorColleges!= null)&&this.priorColleges.equals(rhs.priorColleges))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.interests == rhs.interests)||((this.interests!= null)&&this.interests.equals(rhs.interests))));
    }

}
