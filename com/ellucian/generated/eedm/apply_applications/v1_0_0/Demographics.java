
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

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
 * The applicant's demographic information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dateOfBirth",
    "ethnicity",
    "races",
    "gender",
    "genderIdentity",
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
     * Ethnicity
     * <p>
     * The applicant's ethnicity
     * 
     */
    @JsonProperty("ethnicity")
    @JsonPropertyDescription("The applicant's ethnicity")
    private Object ethnicity;
    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    @JsonPropertyDescription("The racial groups to which an applicant belongs.")
    private List<Race> races = new ArrayList<Race>();
    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological masculinity or femininity of the applicant.")
    private Object gender;
    /**
     * Gender Identity
     * <p>
     * The applicant's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    @JsonPropertyDescription("The applicant's self-selected gender identification.")
    private Object genderIdentity;
    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    @JsonPropertyDescription("The applicant's self-selected choice of pronoun.")
    private Object personalPronoun;
    /**
     * Marital Status
     * <p>
     * The applicant's marital status
     * 
     */
    @JsonProperty("maritalStatus")
    @JsonPropertyDescription("The applicant's marital status")
    private Object maritalStatus;
    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation
     * 
     */
    @JsonProperty("religiousAffiliation")
    @JsonPropertyDescription("The applicant's religious affiliation")
    private Object religiousAffiliation;

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
     * Ethnicity
     * <p>
     * The applicant's ethnicity
     * 
     */
    @JsonProperty("ethnicity")
    public Object getEthnicity() {
        return ethnicity;
    }

    /**
     * Ethnicity
     * <p>
     * The applicant's ethnicity
     * 
     */
    @JsonProperty("ethnicity")
    public void setEthnicity(Object ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Demographics withEthnicity(Object ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    public List<Race> getRaces() {
        return races;
    }

    /**
     * Races
     * <p>
     * The racial groups to which an applicant belongs.
     * 
     */
    @JsonProperty("races")
    public void setRaces(List<Race> races) {
        this.races = races;
    }

    public Demographics withRaces(List<Race> races) {
        this.races = races;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    public Object getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the applicant.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Demographics withGender(Object gender) {
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
    public Object getGenderIdentity() {
        return genderIdentity;
    }

    /**
     * Gender Identity
     * <p>
     * The applicant's self-selected gender identification.
     * 
     */
    @JsonProperty("genderIdentity")
    public void setGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public Demographics withGenderIdentity(Object genderIdentity) {
        this.genderIdentity = genderIdentity;
        return this;
    }

    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public Object getPersonalPronoun() {
        return personalPronoun;
    }

    /**
     * Personal Pronoun
     * <p>
     * The applicant's self-selected choice of pronoun.
     * 
     */
    @JsonProperty("personalPronoun")
    public void setPersonalPronoun(Object personalPronoun) {
        this.personalPronoun = personalPronoun;
    }

    public Demographics withPersonalPronoun(Object personalPronoun) {
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
    public Object getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Marital Status
     * <p>
     * The applicant's marital status
     * 
     */
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Demographics withMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation
     * 
     */
    @JsonProperty("religiousAffiliation")
    public Object getReligiousAffiliation() {
        return religiousAffiliation;
    }

    /**
     * Religious Affiliation
     * <p>
     * The applicant's religious affiliation
     * 
     */
    @JsonProperty("religiousAffiliation")
    public void setReligiousAffiliation(Object religiousAffiliation) {
        this.religiousAffiliation = religiousAffiliation;
    }

    public Demographics withReligiousAffiliation(Object religiousAffiliation) {
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
        sb.append("ethnicity");
        sb.append('=');
        sb.append(((this.ethnicity == null)?"<null>":this.ethnicity));
        sb.append(',');
        sb.append("races");
        sb.append('=');
        sb.append(((this.races == null)?"<null>":this.races));
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
        result = ((result* 31)+((this.genderIdentity == null)? 0 :this.genderIdentity.hashCode()));
        result = ((result* 31)+((this.personalPronoun == null)? 0 :this.personalPronoun.hashCode()));
        result = ((result* 31)+((this.ethnicity == null)? 0 :this.ethnicity.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.races == null)? 0 :this.races.hashCode()));
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
        return (((((((((this.genderIdentity == rhs.genderIdentity)||((this.genderIdentity!= null)&&this.genderIdentity.equals(rhs.genderIdentity)))&&((this.personalPronoun == rhs.personalPronoun)||((this.personalPronoun!= null)&&this.personalPronoun.equals(rhs.personalPronoun))))&&((this.ethnicity == rhs.ethnicity)||((this.ethnicity!= null)&&this.ethnicity.equals(rhs.ethnicity))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.races == rhs.races)||((this.races!= null)&&this.races.equals(rhs.races))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.religiousAffiliation == rhs.religiousAffiliation)||((this.religiousAffiliation!= null)&&this.religiousAffiliation.equals(rhs.religiousAffiliation))))&&((this.maritalStatus == rhs.maritalStatus)||((this.maritalStatus!= null)&&this.maritalStatus.equals(rhs.maritalStatus))));
    }

}
