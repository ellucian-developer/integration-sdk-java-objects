
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Candidate
 * <p>
 * Personal Details of an applicant.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "firstName",
    "lastName",
    "dateOfBirth",
    "nationality",
    "domicile",
    "ukResidencyStatus",
    "ukResidencyStatusCode",
    "feePayer",
    "englishMainLanguage",
    "englishLanguageQualification",
    "otherLanguage",
    "disabilityDisclosure"
})
@Generated("jsonschema2pojo")
public class Candidate {

    /**
     * ID
     * <p>
     * The candidate’s ID in the Apply system.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The candidate\u2019s ID in the Apply system.")
    private String id;
    /**
     * First Name
     * <p>
     * The candidate’s first name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The candidate\u2019s first name.")
    private String firstName;
    /**
     * Last Name
     * <p>
     * The candidate’s last name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The candidate\u2019s last name.")
    private String lastName;
    /**
     * Date Of Birth
     * <p>
     * The candidate’s date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The candidate\u2019s date of birth.")
    private Object dateOfBirth;
    /**
     * Nationality
     * <p>
     * One or more ISO 3166 country codes.
     * 
     */
    @JsonProperty("nationality")
    @JsonPropertyDescription("One or more ISO 3166 country codes.")
    private List<String> nationality = new ArrayList<String>();
    /**
     * Domicile
     * <p>
     * The candidate’s domicile, extracted from their address.
     * 
     */
    @JsonProperty("domicile")
    @JsonPropertyDescription("The candidate\u2019s domicile, extracted from their address.")
    private String domicile;
    /**
     * UK Residency Status
     * <p>
     * The candidate’s UK residency status, e.g. Citizen.
     * 
     */
    @JsonProperty("ukResidencyStatus")
    @JsonPropertyDescription("The candidate\u2019s UK residency status, e.g. Citizen.")
    private String ukResidencyStatus;
    /**
     * UK Residency Status Code
     * <p>
     * The candidate’s UK residency status code.
     * 
     */
    @JsonProperty("ukResidencyStatusCode")
    @JsonPropertyDescription("The candidate\u2019s UK residency status code.")
    private String ukResidencyStatusCode;
    /**
     * Fee Payer
     * <p>
     * Provisional fee payer status based on a candidate's nationality, residency status and domicile.
     * 
     */
    @JsonProperty("feePayer")
    @JsonPropertyDescription("Provisional fee payer status based on a candidate's nationality, residency status and domicile.")
    private String feePayer;
    /**
     * English Main Language
     * <p>
     * Does this candidate have English as a main language?
     * 
     */
    @JsonProperty("englishMainLanguage")
    @JsonPropertyDescription("Does this candidate have English as a main language?")
    private Object englishMainLanguage;
    /**
     * English Language Qualification
     * <p>
     * About this candidate's English language qualifications, if English is not their main language.
     * 
     */
    @JsonProperty("englishLanguageQualification")
    @JsonPropertyDescription("About this candidate's English language qualifications, if English is not their main language.")
    private String englishLanguageQualification;
    /**
     * Other Language
     * <p>
     * Details of the candidate's fluency in other languages.
     * 
     */
    @JsonProperty("otherLanguage")
    @JsonPropertyDescription("Details of the candidate's fluency in other languages.")
    private String otherLanguage;
    /**
     * Disability Disclosure
     * <p>
     * Voluntary disclosure of disabliity or SEN so providers can provide appropriate support.
     * 
     */
    @JsonProperty("disabilityDisclosure")
    @JsonPropertyDescription("Voluntary disclosure of disabliity or SEN so providers can provide appropriate support.")
    private String disabilityDisclosure;

    /**
     * ID
     * <p>
     * The candidate’s ID in the Apply system.
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
     * The candidate’s ID in the Apply system.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Candidate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * First Name
     * <p>
     * The candidate’s first name.
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
     * The candidate’s first name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Candidate withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The candidate’s last name.
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
     * The candidate’s last name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Candidate withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Date Of Birth
     * <p>
     * The candidate’s date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date Of Birth
     * <p>
     * The candidate’s date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Candidate withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Nationality
     * <p>
     * One or more ISO 3166 country codes.
     * 
     */
    @JsonProperty("nationality")
    public List<String> getNationality() {
        return nationality;
    }

    /**
     * Nationality
     * <p>
     * One or more ISO 3166 country codes.
     * 
     */
    @JsonProperty("nationality")
    public void setNationality(List<String> nationality) {
        this.nationality = nationality;
    }

    public Candidate withNationality(List<String> nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * Domicile
     * <p>
     * The candidate’s domicile, extracted from their address.
     * 
     */
    @JsonProperty("domicile")
    public String getDomicile() {
        return domicile;
    }

    /**
     * Domicile
     * <p>
     * The candidate’s domicile, extracted from their address.
     * 
     */
    @JsonProperty("domicile")
    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public Candidate withDomicile(String domicile) {
        this.domicile = domicile;
        return this;
    }

    /**
     * UK Residency Status
     * <p>
     * The candidate’s UK residency status, e.g. Citizen.
     * 
     */
    @JsonProperty("ukResidencyStatus")
    public String getUkResidencyStatus() {
        return ukResidencyStatus;
    }

    /**
     * UK Residency Status
     * <p>
     * The candidate’s UK residency status, e.g. Citizen.
     * 
     */
    @JsonProperty("ukResidencyStatus")
    public void setUkResidencyStatus(String ukResidencyStatus) {
        this.ukResidencyStatus = ukResidencyStatus;
    }

    public Candidate withUkResidencyStatus(String ukResidencyStatus) {
        this.ukResidencyStatus = ukResidencyStatus;
        return this;
    }

    /**
     * UK Residency Status Code
     * <p>
     * The candidate’s UK residency status code.
     * 
     */
    @JsonProperty("ukResidencyStatusCode")
    public String getUkResidencyStatusCode() {
        return ukResidencyStatusCode;
    }

    /**
     * UK Residency Status Code
     * <p>
     * The candidate’s UK residency status code.
     * 
     */
    @JsonProperty("ukResidencyStatusCode")
    public void setUkResidencyStatusCode(String ukResidencyStatusCode) {
        this.ukResidencyStatusCode = ukResidencyStatusCode;
    }

    public Candidate withUkResidencyStatusCode(String ukResidencyStatusCode) {
        this.ukResidencyStatusCode = ukResidencyStatusCode;
        return this;
    }

    /**
     * Fee Payer
     * <p>
     * Provisional fee payer status based on a candidate's nationality, residency status and domicile.
     * 
     */
    @JsonProperty("feePayer")
    public String getFeePayer() {
        return feePayer;
    }

    /**
     * Fee Payer
     * <p>
     * Provisional fee payer status based on a candidate's nationality, residency status and domicile.
     * 
     */
    @JsonProperty("feePayer")
    public void setFeePayer(String feePayer) {
        this.feePayer = feePayer;
    }

    public Candidate withFeePayer(String feePayer) {
        this.feePayer = feePayer;
        return this;
    }

    /**
     * English Main Language
     * <p>
     * Does this candidate have English as a main language?
     * 
     */
    @JsonProperty("englishMainLanguage")
    public Object getEnglishMainLanguage() {
        return englishMainLanguage;
    }

    /**
     * English Main Language
     * <p>
     * Does this candidate have English as a main language?
     * 
     */
    @JsonProperty("englishMainLanguage")
    public void setEnglishMainLanguage(Object englishMainLanguage) {
        this.englishMainLanguage = englishMainLanguage;
    }

    public Candidate withEnglishMainLanguage(Object englishMainLanguage) {
        this.englishMainLanguage = englishMainLanguage;
        return this;
    }

    /**
     * English Language Qualification
     * <p>
     * About this candidate's English language qualifications, if English is not their main language.
     * 
     */
    @JsonProperty("englishLanguageQualification")
    public String getEnglishLanguageQualification() {
        return englishLanguageQualification;
    }

    /**
     * English Language Qualification
     * <p>
     * About this candidate's English language qualifications, if English is not their main language.
     * 
     */
    @JsonProperty("englishLanguageQualification")
    public void setEnglishLanguageQualification(String englishLanguageQualification) {
        this.englishLanguageQualification = englishLanguageQualification;
    }

    public Candidate withEnglishLanguageQualification(String englishLanguageQualification) {
        this.englishLanguageQualification = englishLanguageQualification;
        return this;
    }

    /**
     * Other Language
     * <p>
     * Details of the candidate's fluency in other languages.
     * 
     */
    @JsonProperty("otherLanguage")
    public String getOtherLanguage() {
        return otherLanguage;
    }

    /**
     * Other Language
     * <p>
     * Details of the candidate's fluency in other languages.
     * 
     */
    @JsonProperty("otherLanguage")
    public void setOtherLanguage(String otherLanguage) {
        this.otherLanguage = otherLanguage;
    }

    public Candidate withOtherLanguage(String otherLanguage) {
        this.otherLanguage = otherLanguage;
        return this;
    }

    /**
     * Disability Disclosure
     * <p>
     * Voluntary disclosure of disabliity or SEN so providers can provide appropriate support.
     * 
     */
    @JsonProperty("disabilityDisclosure")
    public String getDisabilityDisclosure() {
        return disabilityDisclosure;
    }

    /**
     * Disability Disclosure
     * <p>
     * Voluntary disclosure of disabliity or SEN so providers can provide appropriate support.
     * 
     */
    @JsonProperty("disabilityDisclosure")
    public void setDisabilityDisclosure(String disabilityDisclosure) {
        this.disabilityDisclosure = disabilityDisclosure;
    }

    public Candidate withDisabilityDisclosure(String disabilityDisclosure) {
        this.disabilityDisclosure = disabilityDisclosure;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Candidate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("nationality");
        sb.append('=');
        sb.append(((this.nationality == null)?"<null>":this.nationality));
        sb.append(',');
        sb.append("domicile");
        sb.append('=');
        sb.append(((this.domicile == null)?"<null>":this.domicile));
        sb.append(',');
        sb.append("ukResidencyStatus");
        sb.append('=');
        sb.append(((this.ukResidencyStatus == null)?"<null>":this.ukResidencyStatus));
        sb.append(',');
        sb.append("ukResidencyStatusCode");
        sb.append('=');
        sb.append(((this.ukResidencyStatusCode == null)?"<null>":this.ukResidencyStatusCode));
        sb.append(',');
        sb.append("feePayer");
        sb.append('=');
        sb.append(((this.feePayer == null)?"<null>":this.feePayer));
        sb.append(',');
        sb.append("englishMainLanguage");
        sb.append('=');
        sb.append(((this.englishMainLanguage == null)?"<null>":this.englishMainLanguage));
        sb.append(',');
        sb.append("englishLanguageQualification");
        sb.append('=');
        sb.append(((this.englishLanguageQualification == null)?"<null>":this.englishLanguageQualification));
        sb.append(',');
        sb.append("otherLanguage");
        sb.append('=');
        sb.append(((this.otherLanguage == null)?"<null>":this.otherLanguage));
        sb.append(',');
        sb.append("disabilityDisclosure");
        sb.append('=');
        sb.append(((this.disabilityDisclosure == null)?"<null>":this.disabilityDisclosure));
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
        result = ((result* 31)+((this.englishLanguageQualification == null)? 0 :this.englishLanguageQualification.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.englishMainLanguage == null)? 0 :this.englishMainLanguage.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.ukResidencyStatusCode == null)? 0 :this.ukResidencyStatusCode.hashCode()));
        result = ((result* 31)+((this.nationality == null)? 0 :this.nationality.hashCode()));
        result = ((result* 31)+((this.feePayer == null)? 0 :this.feePayer.hashCode()));
        result = ((result* 31)+((this.disabilityDisclosure == null)? 0 :this.disabilityDisclosure.hashCode()));
        result = ((result* 31)+((this.domicile == null)? 0 :this.domicile.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ukResidencyStatus == null)? 0 :this.ukResidencyStatus.hashCode()));
        result = ((result* 31)+((this.otherLanguage == null)? 0 :this.otherLanguage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Candidate) == false) {
            return false;
        }
        Candidate rhs = ((Candidate) other);
        return ((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.englishLanguageQualification == rhs.englishLanguageQualification)||((this.englishLanguageQualification!= null)&&this.englishLanguageQualification.equals(rhs.englishLanguageQualification))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.englishMainLanguage == rhs.englishMainLanguage)||((this.englishMainLanguage!= null)&&this.englishMainLanguage.equals(rhs.englishMainLanguage))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.ukResidencyStatusCode == rhs.ukResidencyStatusCode)||((this.ukResidencyStatusCode!= null)&&this.ukResidencyStatusCode.equals(rhs.ukResidencyStatusCode))))&&((this.nationality == rhs.nationality)||((this.nationality!= null)&&this.nationality.equals(rhs.nationality))))&&((this.feePayer == rhs.feePayer)||((this.feePayer!= null)&&this.feePayer.equals(rhs.feePayer))))&&((this.disabilityDisclosure == rhs.disabilityDisclosure)||((this.disabilityDisclosure!= null)&&this.disabilityDisclosure.equals(rhs.disabilityDisclosure))))&&((this.domicile == rhs.domicile)||((this.domicile!= null)&&this.domicile.equals(rhs.domicile))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ukResidencyStatus == rhs.ukResidencyStatus)||((this.ukResidencyStatus!= null)&&this.ukResidencyStatus.equals(rhs.ukResidencyStatus))))&&((this.otherLanguage == rhs.otherLanguage)||((this.otherLanguage!= null)&&this.otherLanguage.equals(rhs.otherLanguage))));
    }

}
