
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Citizenship
 * <p>
 * The applicant's citizenship information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "citizenshipStatus",
    "primaryCitizenship",
    "visa",
    "countryOfBirth",
    "birthCity",
    "nativeLanguage",
    "primaryLanguage",
    "secondaryLanguages",
    "countryEntryDate",
    "passportNumber",
    "passportNationOfIssue",
    "passportExpirationDate",
    "sponsor",
    "foreignTaxId",
    "nationalitySpouse",
    "numberOfChildren"
})
@Generated("jsonschema2pojo")
public class Citizenship {

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the applicant with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    @JsonPropertyDescription("The citizenship status of the applicant with regards to the country where a given institution is located.")
    private String citizenshipStatus;
    /**
     * Primary Citizenship
     * <p>
     * The applicant's first citizenship.
     * 
     */
    @JsonProperty("primaryCitizenship")
    @JsonPropertyDescription("The applicant's first citizenship.")
    private String primaryCitizenship;
    /**
     * Visa
     * <p>
     * The Visa details of the applicant.
     * 
     */
    @JsonProperty("visa")
    @JsonPropertyDescription("The Visa details of the applicant.")
    private Visa visa;
    /**
     * Country of Birth
     * <p>
     * The country in which the applicant was born.
     * 
     */
    @JsonProperty("countryOfBirth")
    @JsonPropertyDescription("The country in which the applicant was born.")
    private String countryOfBirth;
    /**
     * Birth City
     * <p>
     * The city in which the applicant was born.
     * 
     */
    @JsonProperty("birthCity")
    @JsonPropertyDescription("The city in which the applicant was born.")
    private String birthCity;
    /**
     * Native Language
     * <p>
     * The applicant's native language
     * 
     */
    @JsonProperty("nativeLanguage")
    @JsonPropertyDescription("The applicant's native language")
    private String nativeLanguage;
    /**
     * Primary Language
     * <p>
     * The applicant's primary language
     * 
     */
    @JsonProperty("primaryLanguage")
    @JsonPropertyDescription("The applicant's primary language")
    private String primaryLanguage;
    /**
     * Secondary Languages
     * <p>
     * Other languages that the applicant understands.
     * 
     */
    @JsonProperty("secondaryLanguages")
    @JsonPropertyDescription("Other languages that the applicant understands.")
    private List<String> secondaryLanguages = new ArrayList<String>();
    /**
     * Country Entry Date
     * <p>
     * The date the applicant entered the country where the institution is located.
     * 
     */
    @JsonProperty("countryEntryDate")
    @JsonPropertyDescription("The date the applicant entered the country where the institution is located.")
    private Object countryEntryDate;
    /**
     * Passport Number
     * <p>
     * The applicant's passport number
     * 
     */
    @JsonProperty("passportNumber")
    @JsonPropertyDescription("The applicant's passport number")
    private String passportNumber;
    /**
     * Passport Nation Of Issue
     * <p>
     * The nation that issued the applicant's passport
     * 
     */
    @JsonProperty("passportNationOfIssue")
    @JsonPropertyDescription("The nation that issued the applicant's passport")
    private String passportNationOfIssue;
    /**
     * Passport Expiration Date
     * <p>
     * The expiration date of the applicant's passport
     * 
     */
    @JsonProperty("passportExpirationDate")
    @JsonPropertyDescription("The expiration date of the applicant's passport")
    private Object passportExpirationDate;
    /**
     * Sponsor
     * <p>
     * The applicant's sponsor
     * 
     */
    @JsonProperty("sponsor")
    @JsonPropertyDescription("The applicant's sponsor")
    private String sponsor;
    /**
     * Foreign Tax Id
     * <p>
     * The applicant's foreign tax id
     * 
     */
    @JsonProperty("foreignTaxId")
    @JsonPropertyDescription("The applicant's foreign tax id")
    private String foreignTaxId;
    /**
     * Nationality Spouse
     * <p>
     * The applicant's spouse's nationality
     * 
     */
    @JsonProperty("nationalitySpouse")
    @JsonPropertyDescription("The applicant's spouse's nationality")
    private String nationalitySpouse;
    /**
     * Number Of Children
     * <p>
     * The applicant's number of children.
     * 
     */
    @JsonProperty("numberOfChildren")
    @JsonPropertyDescription("The applicant's number of children.")
    private Integer numberOfChildren;

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the applicant with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Citizenship Status
     * <p>
     * The citizenship status of the applicant with regards to the country where a given institution is located.
     * 
     */
    @JsonProperty("citizenshipStatus")
    public void setCitizenshipStatus(String citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }

    public Citizenship withCitizenshipStatus(String citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
        return this;
    }

    /**
     * Primary Citizenship
     * <p>
     * The applicant's first citizenship.
     * 
     */
    @JsonProperty("primaryCitizenship")
    public String getPrimaryCitizenship() {
        return primaryCitizenship;
    }

    /**
     * Primary Citizenship
     * <p>
     * The applicant's first citizenship.
     * 
     */
    @JsonProperty("primaryCitizenship")
    public void setPrimaryCitizenship(String primaryCitizenship) {
        this.primaryCitizenship = primaryCitizenship;
    }

    public Citizenship withPrimaryCitizenship(String primaryCitizenship) {
        this.primaryCitizenship = primaryCitizenship;
        return this;
    }

    /**
     * Visa
     * <p>
     * The Visa details of the applicant.
     * 
     */
    @JsonProperty("visa")
    public Visa getVisa() {
        return visa;
    }

    /**
     * Visa
     * <p>
     * The Visa details of the applicant.
     * 
     */
    @JsonProperty("visa")
    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public Citizenship withVisa(Visa visa) {
        this.visa = visa;
        return this;
    }

    /**
     * Country of Birth
     * <p>
     * The country in which the applicant was born.
     * 
     */
    @JsonProperty("countryOfBirth")
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Country of Birth
     * <p>
     * The country in which the applicant was born.
     * 
     */
    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public Citizenship withCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    /**
     * Birth City
     * <p>
     * The city in which the applicant was born.
     * 
     */
    @JsonProperty("birthCity")
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Birth City
     * <p>
     * The city in which the applicant was born.
     * 
     */
    @JsonProperty("birthCity")
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Citizenship withBirthCity(String birthCity) {
        this.birthCity = birthCity;
        return this;
    }

    /**
     * Native Language
     * <p>
     * The applicant's native language
     * 
     */
    @JsonProperty("nativeLanguage")
    public String getNativeLanguage() {
        return nativeLanguage;
    }

    /**
     * Native Language
     * <p>
     * The applicant's native language
     * 
     */
    @JsonProperty("nativeLanguage")
    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public Citizenship withNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
        return this;
    }

    /**
     * Primary Language
     * <p>
     * The applicant's primary language
     * 
     */
    @JsonProperty("primaryLanguage")
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Primary Language
     * <p>
     * The applicant's primary language
     * 
     */
    @JsonProperty("primaryLanguage")
    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public Citizenship withPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
        return this;
    }

    /**
     * Secondary Languages
     * <p>
     * Other languages that the applicant understands.
     * 
     */
    @JsonProperty("secondaryLanguages")
    public List<String> getSecondaryLanguages() {
        return secondaryLanguages;
    }

    /**
     * Secondary Languages
     * <p>
     * Other languages that the applicant understands.
     * 
     */
    @JsonProperty("secondaryLanguages")
    public void setSecondaryLanguages(List<String> secondaryLanguages) {
        this.secondaryLanguages = secondaryLanguages;
    }

    public Citizenship withSecondaryLanguages(List<String> secondaryLanguages) {
        this.secondaryLanguages = secondaryLanguages;
        return this;
    }

    /**
     * Country Entry Date
     * <p>
     * The date the applicant entered the country where the institution is located.
     * 
     */
    @JsonProperty("countryEntryDate")
    public Object getCountryEntryDate() {
        return countryEntryDate;
    }

    /**
     * Country Entry Date
     * <p>
     * The date the applicant entered the country where the institution is located.
     * 
     */
    @JsonProperty("countryEntryDate")
    public void setCountryEntryDate(Object countryEntryDate) {
        this.countryEntryDate = countryEntryDate;
    }

    public Citizenship withCountryEntryDate(Object countryEntryDate) {
        this.countryEntryDate = countryEntryDate;
        return this;
    }

    /**
     * Passport Number
     * <p>
     * The applicant's passport number
     * 
     */
    @JsonProperty("passportNumber")
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Passport Number
     * <p>
     * The applicant's passport number
     * 
     */
    @JsonProperty("passportNumber")
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Citizenship withPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }

    /**
     * Passport Nation Of Issue
     * <p>
     * The nation that issued the applicant's passport
     * 
     */
    @JsonProperty("passportNationOfIssue")
    public String getPassportNationOfIssue() {
        return passportNationOfIssue;
    }

    /**
     * Passport Nation Of Issue
     * <p>
     * The nation that issued the applicant's passport
     * 
     */
    @JsonProperty("passportNationOfIssue")
    public void setPassportNationOfIssue(String passportNationOfIssue) {
        this.passportNationOfIssue = passportNationOfIssue;
    }

    public Citizenship withPassportNationOfIssue(String passportNationOfIssue) {
        this.passportNationOfIssue = passportNationOfIssue;
        return this;
    }

    /**
     * Passport Expiration Date
     * <p>
     * The expiration date of the applicant's passport
     * 
     */
    @JsonProperty("passportExpirationDate")
    public Object getPassportExpirationDate() {
        return passportExpirationDate;
    }

    /**
     * Passport Expiration Date
     * <p>
     * The expiration date of the applicant's passport
     * 
     */
    @JsonProperty("passportExpirationDate")
    public void setPassportExpirationDate(Object passportExpirationDate) {
        this.passportExpirationDate = passportExpirationDate;
    }

    public Citizenship withPassportExpirationDate(Object passportExpirationDate) {
        this.passportExpirationDate = passportExpirationDate;
        return this;
    }

    /**
     * Sponsor
     * <p>
     * The applicant's sponsor
     * 
     */
    @JsonProperty("sponsor")
    public String getSponsor() {
        return sponsor;
    }

    /**
     * Sponsor
     * <p>
     * The applicant's sponsor
     * 
     */
    @JsonProperty("sponsor")
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public Citizenship withSponsor(String sponsor) {
        this.sponsor = sponsor;
        return this;
    }

    /**
     * Foreign Tax Id
     * <p>
     * The applicant's foreign tax id
     * 
     */
    @JsonProperty("foreignTaxId")
    public String getForeignTaxId() {
        return foreignTaxId;
    }

    /**
     * Foreign Tax Id
     * <p>
     * The applicant's foreign tax id
     * 
     */
    @JsonProperty("foreignTaxId")
    public void setForeignTaxId(String foreignTaxId) {
        this.foreignTaxId = foreignTaxId;
    }

    public Citizenship withForeignTaxId(String foreignTaxId) {
        this.foreignTaxId = foreignTaxId;
        return this;
    }

    /**
     * Nationality Spouse
     * <p>
     * The applicant's spouse's nationality
     * 
     */
    @JsonProperty("nationalitySpouse")
    public String getNationalitySpouse() {
        return nationalitySpouse;
    }

    /**
     * Nationality Spouse
     * <p>
     * The applicant's spouse's nationality
     * 
     */
    @JsonProperty("nationalitySpouse")
    public void setNationalitySpouse(String nationalitySpouse) {
        this.nationalitySpouse = nationalitySpouse;
    }

    public Citizenship withNationalitySpouse(String nationalitySpouse) {
        this.nationalitySpouse = nationalitySpouse;
        return this;
    }

    /**
     * Number Of Children
     * <p>
     * The applicant's number of children.
     * 
     */
    @JsonProperty("numberOfChildren")
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Number Of Children
     * <p>
     * The applicant's number of children.
     * 
     */
    @JsonProperty("numberOfChildren")
    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Citizenship withNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Citizenship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("citizenshipStatus");
        sb.append('=');
        sb.append(((this.citizenshipStatus == null)?"<null>":this.citizenshipStatus));
        sb.append(',');
        sb.append("primaryCitizenship");
        sb.append('=');
        sb.append(((this.primaryCitizenship == null)?"<null>":this.primaryCitizenship));
        sb.append(',');
        sb.append("visa");
        sb.append('=');
        sb.append(((this.visa == null)?"<null>":this.visa));
        sb.append(',');
        sb.append("countryOfBirth");
        sb.append('=');
        sb.append(((this.countryOfBirth == null)?"<null>":this.countryOfBirth));
        sb.append(',');
        sb.append("birthCity");
        sb.append('=');
        sb.append(((this.birthCity == null)?"<null>":this.birthCity));
        sb.append(',');
        sb.append("nativeLanguage");
        sb.append('=');
        sb.append(((this.nativeLanguage == null)?"<null>":this.nativeLanguage));
        sb.append(',');
        sb.append("primaryLanguage");
        sb.append('=');
        sb.append(((this.primaryLanguage == null)?"<null>":this.primaryLanguage));
        sb.append(',');
        sb.append("secondaryLanguages");
        sb.append('=');
        sb.append(((this.secondaryLanguages == null)?"<null>":this.secondaryLanguages));
        sb.append(',');
        sb.append("countryEntryDate");
        sb.append('=');
        sb.append(((this.countryEntryDate == null)?"<null>":this.countryEntryDate));
        sb.append(',');
        sb.append("passportNumber");
        sb.append('=');
        sb.append(((this.passportNumber == null)?"<null>":this.passportNumber));
        sb.append(',');
        sb.append("passportNationOfIssue");
        sb.append('=');
        sb.append(((this.passportNationOfIssue == null)?"<null>":this.passportNationOfIssue));
        sb.append(',');
        sb.append("passportExpirationDate");
        sb.append('=');
        sb.append(((this.passportExpirationDate == null)?"<null>":this.passportExpirationDate));
        sb.append(',');
        sb.append("sponsor");
        sb.append('=');
        sb.append(((this.sponsor == null)?"<null>":this.sponsor));
        sb.append(',');
        sb.append("foreignTaxId");
        sb.append('=');
        sb.append(((this.foreignTaxId == null)?"<null>":this.foreignTaxId));
        sb.append(',');
        sb.append("nationalitySpouse");
        sb.append('=');
        sb.append(((this.nationalitySpouse == null)?"<null>":this.nationalitySpouse));
        sb.append(',');
        sb.append("numberOfChildren");
        sb.append('=');
        sb.append(((this.numberOfChildren == null)?"<null>":this.numberOfChildren));
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
        result = ((result* 31)+((this.passportNumber == null)? 0 :this.passportNumber.hashCode()));
        result = ((result* 31)+((this.sponsor == null)? 0 :this.sponsor.hashCode()));
        result = ((result* 31)+((this.secondaryLanguages == null)? 0 :this.secondaryLanguages.hashCode()));
        result = ((result* 31)+((this.birthCity == null)? 0 :this.birthCity.hashCode()));
        result = ((result* 31)+((this.nativeLanguage == null)? 0 :this.nativeLanguage.hashCode()));
        result = ((result* 31)+((this.nationalitySpouse == null)? 0 :this.nationalitySpouse.hashCode()));
        result = ((result* 31)+((this.countryEntryDate == null)? 0 :this.countryEntryDate.hashCode()));
        result = ((result* 31)+((this.citizenshipStatus == null)? 0 :this.citizenshipStatus.hashCode()));
        result = ((result* 31)+((this.numberOfChildren == null)? 0 :this.numberOfChildren.hashCode()));
        result = ((result* 31)+((this.countryOfBirth == null)? 0 :this.countryOfBirth.hashCode()));
        result = ((result* 31)+((this.visa == null)? 0 :this.visa.hashCode()));
        result = ((result* 31)+((this.passportExpirationDate == null)? 0 :this.passportExpirationDate.hashCode()));
        result = ((result* 31)+((this.foreignTaxId == null)? 0 :this.foreignTaxId.hashCode()));
        result = ((result* 31)+((this.passportNationOfIssue == null)? 0 :this.passportNationOfIssue.hashCode()));
        result = ((result* 31)+((this.primaryCitizenship == null)? 0 :this.primaryCitizenship.hashCode()));
        result = ((result* 31)+((this.primaryLanguage == null)? 0 :this.primaryLanguage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Citizenship) == false) {
            return false;
        }
        Citizenship rhs = ((Citizenship) other);
        return (((((((((((((((((this.passportNumber == rhs.passportNumber)||((this.passportNumber!= null)&&this.passportNumber.equals(rhs.passportNumber)))&&((this.sponsor == rhs.sponsor)||((this.sponsor!= null)&&this.sponsor.equals(rhs.sponsor))))&&((this.secondaryLanguages == rhs.secondaryLanguages)||((this.secondaryLanguages!= null)&&this.secondaryLanguages.equals(rhs.secondaryLanguages))))&&((this.birthCity == rhs.birthCity)||((this.birthCity!= null)&&this.birthCity.equals(rhs.birthCity))))&&((this.nativeLanguage == rhs.nativeLanguage)||((this.nativeLanguage!= null)&&this.nativeLanguage.equals(rhs.nativeLanguage))))&&((this.nationalitySpouse == rhs.nationalitySpouse)||((this.nationalitySpouse!= null)&&this.nationalitySpouse.equals(rhs.nationalitySpouse))))&&((this.countryEntryDate == rhs.countryEntryDate)||((this.countryEntryDate!= null)&&this.countryEntryDate.equals(rhs.countryEntryDate))))&&((this.citizenshipStatus == rhs.citizenshipStatus)||((this.citizenshipStatus!= null)&&this.citizenshipStatus.equals(rhs.citizenshipStatus))))&&((this.numberOfChildren == rhs.numberOfChildren)||((this.numberOfChildren!= null)&&this.numberOfChildren.equals(rhs.numberOfChildren))))&&((this.countryOfBirth == rhs.countryOfBirth)||((this.countryOfBirth!= null)&&this.countryOfBirth.equals(rhs.countryOfBirth))))&&((this.visa == rhs.visa)||((this.visa!= null)&&this.visa.equals(rhs.visa))))&&((this.passportExpirationDate == rhs.passportExpirationDate)||((this.passportExpirationDate!= null)&&this.passportExpirationDate.equals(rhs.passportExpirationDate))))&&((this.foreignTaxId == rhs.foreignTaxId)||((this.foreignTaxId!= null)&&this.foreignTaxId.equals(rhs.foreignTaxId))))&&((this.passportNationOfIssue == rhs.passportNationOfIssue)||((this.passportNationOfIssue!= null)&&this.passportNationOfIssue.equals(rhs.passportNationOfIssue))))&&((this.primaryCitizenship == rhs.primaryCitizenship)||((this.primaryCitizenship!= null)&&this.primaryCitizenship.equals(rhs.primaryCitizenship))))&&((this.primaryLanguage == rhs.primaryLanguage)||((this.primaryLanguage!= null)&&this.primaryLanguage.equals(rhs.primaryLanguage))));
    }

}
