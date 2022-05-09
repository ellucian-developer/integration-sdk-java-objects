
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Demographics
 * <p>
 * The applicant's demographic information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dateOfBirth",
    "ethnicities",
    "races",
    "hispanic",
    "gender",
    "genderIdentity",
    "sexualOrientation",
    "personalPronoun",
    "maritalStatus",
    "religiousAffiliation"
})
@Generated("jsonschema2pojo")
public class Demographics {

    /**
     * Date Of Birth
     * <p>
     * The applicant's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The applicant's date of birth.")
    private Object dateOfBirth;
    /**
     * Ethnicities
     * <p>
     * The applicant's ethnicities.
     * 
     */
    @JsonProperty("ethnicities")
    @JsonPropertyDescription("The applicant's ethnicities.")
    private List<String> ethnicities = new ArrayList<String>();
    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    @JsonPropertyDescription("The racial groups to which an applicant belongs.")
    private List<String> races = new ArrayList<String>();
    /**
     * Hispanic/Latino
     * <p>
     * Indicates if the applicant is hispanic.’
     * 
     */
    @JsonProperty("hispanic")
    @JsonPropertyDescription("Indicates if the applicant is hispanic.\u2019")
    private Boolean hispanic;
    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological masculinity or femininity of the applicant.")
    private String gender;
    /**
     * Gender Identity
     * <p>
     * The applicant's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    @JsonPropertyDescription("The applicant's self-selected gender identification.")
    private String genderIdentity;
    /**
     * Sexual Orientation
     * <p>
     * The applicant's identity in relation to the gender or genders to which they are attracted.
     * 
     */
    @JsonProperty("sexualOrientation")
    @JsonPropertyDescription("The applicant's identity in relation to the gender or genders to which they are attracted.")
    private String sexualOrientation;
    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    @JsonPropertyDescription("The applicant's self-selected choice of pronoun.")
    private String personalPronoun;
    /**
     * Marital Status
     * <p>
     * The applicant's marital status
     * 
     */
    @JsonProperty("maritalStatus")
    @JsonPropertyDescription("The applicant's marital status")
    private String maritalStatus;
    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation.
     * 
     */
    @JsonProperty("religiousAffiliation")
    @JsonPropertyDescription("The applicant's religious affiliation.")
    private String religiousAffiliation;

    /**
     * Date Of Birth
     * <p>
     * The applicant's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date Of Birth
     * <p>
     * The applicant's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Demographics withDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Ethnicities
     * <p>
     * The applicant's ethnicities.
     * 
     */
    @JsonProperty("ethnicities")
    public List<String> getEthnicities() {
        return ethnicities;
    }

    /**
     * Ethnicities
     * <p>
     * The applicant's ethnicities.
     * 
     */
    @JsonProperty("ethnicities")
    public void setEthnicities(List<String> ethnicities) {
        this.ethnicities = ethnicities;
    }

    public Demographics withEthnicities(List<String> ethnicities) {
        this.ethnicities = ethnicities;
        return this;
    }

    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    public List<String> getRaces() {
        return races;
    }

    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    public void setRaces(List<String> races) {
        this.races = races;
    }

    public Demographics withRaces(List<String> races) {
        this.races = races;
        return this;
    }

    /**
     * Hispanic/Latino
     * <p>
     * Indicates if the applicant is hispanic.’
     * 
     */
    @JsonProperty("hispanic")
    public Boolean getHispanic() {
        return hispanic;
    }

    /**
     * Hispanic/Latino
     * <p>
     * Indicates if the applicant is hispanic.’
     * 
     */
    @JsonProperty("hispanic")
    public void setHispanic(Boolean hispanic) {
        this.hispanic = hispanic;
    }

    public Demographics withHispanic(Boolean hispanic) {
        this.hispanic = hispanic;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Demographics withGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Gender Identity
     * <p>
     * The applicant's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public String getGenderIdentity() {
        return genderIdentity;
    }

    /**
     * Gender Identity
     * <p>
     * The applicant's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public void setGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public Demographics withGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
        return this;
    }

    /**
     * Sexual Orientation
     * <p>
     * The applicant's identity in relation to the gender or genders to which they are attracted.
     * 
     */
    @JsonProperty("sexualOrientation")
    public String getSexualOrientation() {
        return sexualOrientation;
    }

    /**
     * Sexual Orientation
     * <p>
     * The applicant's identity in relation to the gender or genders to which they are attracted.
     * 
     */
    @JsonProperty("sexualOrientation")
    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public Demographics withSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
        return this;
    }

    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public String getPersonalPronoun() {
        return personalPronoun;
    }

    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public void setPersonalPronoun(String personalPronoun) {
        this.personalPronoun = personalPronoun;
    }

    public Demographics withPersonalPronoun(String personalPronoun) {
        this.personalPronoun = personalPronoun;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * The applicant's marital status
     * 
     */
    @JsonProperty("maritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Marital Status
     * <p>
     * The applicant's marital status
     * 
     */
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Demographics withMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation.
     * 
     */
    @JsonProperty("religiousAffiliation")
    public String getReligiousAffiliation() {
        return religiousAffiliation;
    }

    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation.
     * 
     */
    @JsonProperty("religiousAffiliation")
    public void setReligiousAffiliation(String religiousAffiliation) {
        this.religiousAffiliation = religiousAffiliation;
    }

    public Demographics withReligiousAffiliation(String religiousAffiliation) {
        this.religiousAffiliation = religiousAffiliation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Demographics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("ethnicities");
        sb.append('=');
        sb.append(((this.ethnicities == null)?"<null>":this.ethnicities));
        sb.append(',');
        sb.append("races");
        sb.append('=');
        sb.append(((this.races == null)?"<null>":this.races));
        sb.append(',');
        sb.append("hispanic");
        sb.append('=');
        sb.append(((this.hispanic == null)?"<null>":this.hispanic));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("genderIdentity");
        sb.append('=');
        sb.append(((this.genderIdentity == null)?"<null>":this.genderIdentity));
        sb.append(',');
        sb.append("sexualOrientation");
        sb.append('=');
        sb.append(((this.sexualOrientation == null)?"<null>":this.sexualOrientation));
        sb.append(',');
        sb.append("personalPronoun");
        sb.append('=');
        sb.append(((this.personalPronoun == null)?"<null>":this.personalPronoun));
        sb.append(',');
        sb.append("maritalStatus");
        sb.append('=');
        sb.append(((this.maritalStatus == null)?"<null>":this.maritalStatus));
        sb.append(',');
        sb.append("religiousAffiliation");
        sb.append('=');
        sb.append(((this.religiousAffiliation == null)?"<null>":this.religiousAffiliation));
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
        result = ((result* 31)+((this.sexualOrientation == null)? 0 :this.sexualOrientation.hashCode()));
        result = ((result* 31)+((this.ethnicities == null)? 0 :this.ethnicities.hashCode()));
        result = ((result* 31)+((this.genderIdentity == null)? 0 :this.genderIdentity.hashCode()));
        result = ((result* 31)+((this.personalPronoun == null)? 0 :this.personalPronoun.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.races == null)? 0 :this.races.hashCode()));
        result = ((result* 31)+((this.hispanic == null)? 0 :this.hispanic.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.religiousAffiliation == null)? 0 :this.religiousAffiliation.hashCode()));
        result = ((result* 31)+((this.maritalStatus == null)? 0 :this.maritalStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demographics) == false) {
            return false;
        }
        Demographics rhs = ((Demographics) other);
        return (((((((((((this.sexualOrientation == rhs.sexualOrientation)||((this.sexualOrientation!= null)&&this.sexualOrientation.equals(rhs.sexualOrientation)))&&((this.ethnicities == rhs.ethnicities)||((this.ethnicities!= null)&&this.ethnicities.equals(rhs.ethnicities))))&&((this.genderIdentity == rhs.genderIdentity)||((this.genderIdentity!= null)&&this.genderIdentity.equals(rhs.genderIdentity))))&&((this.personalPronoun == rhs.personalPronoun)||((this.personalPronoun!= null)&&this.personalPronoun.equals(rhs.personalPronoun))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.races == rhs.races)||((this.races!= null)&&this.races.equals(rhs.races))))&&((this.hispanic == rhs.hispanic)||((this.hispanic!= null)&&this.hispanic.equals(rhs.hispanic))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.religiousAffiliation == rhs.religiousAffiliation)||((this.religiousAffiliation!= null)&&this.religiousAffiliation.equals(rhs.religiousAffiliation))))&&((this.maritalStatus == rhs.maritalStatus)||((this.maritalStatus!= null)&&this.maritalStatus.equals(rhs.maritalStatus))));
    }

}
