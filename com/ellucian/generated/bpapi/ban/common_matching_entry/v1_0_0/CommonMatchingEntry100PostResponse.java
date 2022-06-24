
package com.ellucian.generated.bpapi.ban.common_matching_entry.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cntyCode",
    "streetLine2",
    "streetLine1",
    "lastName",
    "adidCode",
    "nonpersonName",
    "city",
    "streetLine3",
    "sourceComment",
    "ssn",
    "greenDataBar1",
    "emailAddress",
    "emalCode",
    "teleDescription",
    "statDescription",
    "mi",
    "emalDescription",
    "adidDesc",
    "zip",
    "additionalId",
    "birthDay",
    "phoneExt",
    "statCode",
    "natnCode",
    "sex",
    "natnDescription",
    "teleCode",
    "cntyDescription",
    "birthMon",
    "firstName",
    "phoneNumber",
    "birthYear",
    "phoneArea",
    "atypDescription",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class CommonMatchingEntry100PostResponse {

    /**
     * County
     * <p>
     * Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_STREET_LINE2")
    private String streetLine2;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_STREET_LINE1")
    private String streetLine1;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    private String lastName;
    /**
     * Additional ID Type
     * <p>
     * Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String adidCode;
    /**
     * Non-Person Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonpersonName")
    private String nonpersonName;
    /**
     * City
     * <p>
     * Lineage reference object : GOTCMME_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_CITY")
    private String city;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_STREET_LINE3")
    private String streetLine3;
    @JsonProperty("sourceComment")
    private String sourceComment;
    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GOTCMME_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_SSN")
    private String ssn;
    @JsonProperty("greenDataBar1")
    private String greenDataBar1;
    /**
     * E-mail
     * <p>
     * Lineage reference object : GOTCMME_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_EMAIL_ADDRESS")
    private String emailAddress;
    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOTCMME_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_EMAL_CODE, Lookup lineage reference object : gtvemal")
    private String emalCode;
    @JsonProperty("teleDescription")
    private String teleDescription;
    @JsonProperty("statDescription")
    private String statDescription;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : GOTCMME_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_MI")
    private String mi;
    @JsonProperty("emalDescription")
    private String emalDescription;
    @JsonProperty("adidDesc")
    private String adidDesc;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GOTCMME_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_ZIP")
    private String zip;
    /**
     * Additional ID
     * <p>
     * Lineage reference object : GOTCMME_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_ADDITIONAL_ID")
    private String additionalId;
    /**
     * Day
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_DAY
     * 
     */
    @JsonProperty("birthDay")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_BIRTH_DAY")
    private String birthDay;
    /**
     * Lineage reference object : GOTCMME_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_PHONE_EXT")
    private String phoneExt;
    /**
     * State or Province
     * <p>
     * Lineage reference object : GOTCMME_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : GOTCMME_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Gender
     * <p>
     * Lineage reference object : GOTCMME_SEX
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_SEX")
    private String sex;
    @JsonProperty("natnDescription")
    private String natnDescription;
    /**
     * Telephone Type
     * <p>
     * Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele")
    private String teleCode;
    @JsonProperty("cntyDescription")
    private String cntyDescription;
    /**
     * Month
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_MON
     * 
     */
    @JsonProperty("birthMon")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_BIRTH_MON")
    private String birthMon;
    /**
     * First Name
     * <p>
     * Lineage reference object : GOTCMME_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_FIRST_NAME")
    private String firstName;
    /**
     * Lineage reference object : GOTCMME_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Year
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_YEAR
     * 
     */
    @JsonProperty("birthYear")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_BIRTH_YEAR")
    private String birthYear;
    /**
     * Telephone
     * <p>
     * Lineage reference object : GOTCMME_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_PHONE_AREA")
    private String phoneArea;
    @JsonProperty("atypDescription")
    private String atypDescription;
    /**
     * Address Type
     * <p>
     * Lineage reference object : GOTCMME_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * County
     * <p>
     * Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public CommonMatchingEntry100PostResponse withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public CommonMatchingEntry100PostResponse withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public CommonMatchingEntry100PostResponse withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CommonMatchingEntry100PostResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Additional ID Type
     * <p>
     * Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public String getAdidCode() {
        return adidCode;
    }

    /**
     * Additional ID Type
     * <p>
     * Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public void setAdidCode(String adidCode) {
        this.adidCode = adidCode;
    }

    public CommonMatchingEntry100PostResponse withAdidCode(String adidCode) {
        this.adidCode = adidCode;
        return this;
    }

    /**
     * Non-Person Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonpersonName")
    public String getNonpersonName() {
        return nonpersonName;
    }

    /**
     * Non-Person Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonpersonName")
    public void setNonpersonName(String nonpersonName) {
        this.nonpersonName = nonpersonName;
    }

    public CommonMatchingEntry100PostResponse withNonpersonName(String nonpersonName) {
        this.nonpersonName = nonpersonName;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : GOTCMME_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : GOTCMME_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public CommonMatchingEntry100PostResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : GOTCMME_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public CommonMatchingEntry100PostResponse withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    @JsonProperty("sourceComment")
    public String getSourceComment() {
        return sourceComment;
    }

    @JsonProperty("sourceComment")
    public void setSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
    }

    public CommonMatchingEntry100PostResponse withSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GOTCMME_SSN
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GOTCMME_SSN
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public CommonMatchingEntry100PostResponse withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    @JsonProperty("greenDataBar1")
    public String getGreenDataBar1() {
        return greenDataBar1;
    }

    @JsonProperty("greenDataBar1")
    public void setGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
    }

    public CommonMatchingEntry100PostResponse withGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
        return this;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : GOTCMME_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : GOTCMME_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public CommonMatchingEntry100PostResponse withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOTCMME_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public String getEmalCode() {
        return emalCode;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOTCMME_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public void setEmalCode(String emalCode) {
        this.emalCode = emalCode;
    }

    public CommonMatchingEntry100PostResponse withEmalCode(String emalCode) {
        this.emalCode = emalCode;
        return this;
    }

    @JsonProperty("teleDescription")
    public String getTeleDescription() {
        return teleDescription;
    }

    @JsonProperty("teleDescription")
    public void setTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
    }

    public CommonMatchingEntry100PostResponse withTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
        return this;
    }

    @JsonProperty("statDescription")
    public String getStatDescription() {
        return statDescription;
    }

    @JsonProperty("statDescription")
    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    public CommonMatchingEntry100PostResponse withStatDescription(String statDescription) {
        this.statDescription = statDescription;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GOTCMME_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GOTCMME_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public CommonMatchingEntry100PostResponse withMi(String mi) {
        this.mi = mi;
        return this;
    }

    @JsonProperty("emalDescription")
    public String getEmalDescription() {
        return emalDescription;
    }

    @JsonProperty("emalDescription")
    public void setEmalDescription(String emalDescription) {
        this.emalDescription = emalDescription;
    }

    public CommonMatchingEntry100PostResponse withEmalDescription(String emalDescription) {
        this.emalDescription = emalDescription;
        return this;
    }

    @JsonProperty("adidDesc")
    public String getAdidDesc() {
        return adidDesc;
    }

    @JsonProperty("adidDesc")
    public void setAdidDesc(String adidDesc) {
        this.adidDesc = adidDesc;
    }

    public CommonMatchingEntry100PostResponse withAdidDesc(String adidDesc) {
        this.adidDesc = adidDesc;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GOTCMME_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GOTCMME_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public CommonMatchingEntry100PostResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Additional ID
     * <p>
     * Lineage reference object : GOTCMME_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public String getAdditionalId() {
        return additionalId;
    }

    /**
     * Additional ID
     * <p>
     * Lineage reference object : GOTCMME_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public void setAdditionalId(String additionalId) {
        this.additionalId = additionalId;
    }

    public CommonMatchingEntry100PostResponse withAdditionalId(String additionalId) {
        this.additionalId = additionalId;
        return this;
    }

    /**
     * Day
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_DAY
     * 
     */
    @JsonProperty("birthDay")
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * Day
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_DAY
     * 
     */
    @JsonProperty("birthDay")
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public CommonMatchingEntry100PostResponse withBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    /**
     * Lineage reference object : GOTCMME_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Lineage reference object : GOTCMME_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public CommonMatchingEntry100PostResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : GOTCMME_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : GOTCMME_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public CommonMatchingEntry100PostResponse withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : GOTCMME_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : GOTCMME_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public CommonMatchingEntry100PostResponse withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : GOTCMME_SEX
     * 
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : GOTCMME_SEX
     * 
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public CommonMatchingEntry100PostResponse withSex(String sex) {
        this.sex = sex;
        return this;
    }

    @JsonProperty("natnDescription")
    public String getNatnDescription() {
        return natnDescription;
    }

    @JsonProperty("natnDescription")
    public void setNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
    }

    public CommonMatchingEntry100PostResponse withNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public CommonMatchingEntry100PostResponse withTeleCode(String teleCode) {
        this.teleCode = teleCode;
        return this;
    }

    @JsonProperty("cntyDescription")
    public String getCntyDescription() {
        return cntyDescription;
    }

    @JsonProperty("cntyDescription")
    public void setCntyDescription(String cntyDescription) {
        this.cntyDescription = cntyDescription;
    }

    public CommonMatchingEntry100PostResponse withCntyDescription(String cntyDescription) {
        this.cntyDescription = cntyDescription;
        return this;
    }

    /**
     * Month
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_MON
     * 
     */
    @JsonProperty("birthMon")
    public String getBirthMon() {
        return birthMon;
    }

    /**
     * Month
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_MON
     * 
     */
    @JsonProperty("birthMon")
    public void setBirthMon(String birthMon) {
        this.birthMon = birthMon;
    }

    public CommonMatchingEntry100PostResponse withBirthMon(String birthMon) {
        this.birthMon = birthMon;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : GOTCMME_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : GOTCMME_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CommonMatchingEntry100PostResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Lineage reference object : GOTCMME_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Lineage reference object : GOTCMME_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CommonMatchingEntry100PostResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_YEAR
     * 
     */
    @JsonProperty("birthYear")
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : GOTCMME_BIRTH_YEAR
     * 
     */
    @JsonProperty("birthYear")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public CommonMatchingEntry100PostResponse withBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    /**
     * Telephone
     * <p>
     * Lineage reference object : GOTCMME_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Telephone
     * <p>
     * Lineage reference object : GOTCMME_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public CommonMatchingEntry100PostResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    @JsonProperty("atypDescription")
    public String getAtypDescription() {
        return atypDescription;
    }

    @JsonProperty("atypDescription")
    public void setAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
    }

    public CommonMatchingEntry100PostResponse withAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : GOTCMME_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : GOTCMME_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public CommonMatchingEntry100PostResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CommonMatchingEntry100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonMatchingEntry100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
        sb.append(',');
        sb.append("nonpersonName");
        sb.append('=');
        sb.append(((this.nonpersonName == null)?"<null>":this.nonpersonName));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("sourceComment");
        sb.append('=');
        sb.append(((this.sourceComment == null)?"<null>":this.sourceComment));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("greenDataBar1");
        sb.append('=');
        sb.append(((this.greenDataBar1 == null)?"<null>":this.greenDataBar1));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("emalCode");
        sb.append('=');
        sb.append(((this.emalCode == null)?"<null>":this.emalCode));
        sb.append(',');
        sb.append("teleDescription");
        sb.append('=');
        sb.append(((this.teleDescription == null)?"<null>":this.teleDescription));
        sb.append(',');
        sb.append("statDescription");
        sb.append('=');
        sb.append(((this.statDescription == null)?"<null>":this.statDescription));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("emalDescription");
        sb.append('=');
        sb.append(((this.emalDescription == null)?"<null>":this.emalDescription));
        sb.append(',');
        sb.append("adidDesc");
        sb.append('=');
        sb.append(((this.adidDesc == null)?"<null>":this.adidDesc));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("additionalId");
        sb.append('=');
        sb.append(((this.additionalId == null)?"<null>":this.additionalId));
        sb.append(',');
        sb.append("birthDay");
        sb.append('=');
        sb.append(((this.birthDay == null)?"<null>":this.birthDay));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("natnDescription");
        sb.append('=');
        sb.append(((this.natnDescription == null)?"<null>":this.natnDescription));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("cntyDescription");
        sb.append('=');
        sb.append(((this.cntyDescription == null)?"<null>":this.cntyDescription));
        sb.append(',');
        sb.append("birthMon");
        sb.append('=');
        sb.append(((this.birthMon == null)?"<null>":this.birthMon));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("birthYear");
        sb.append('=');
        sb.append(((this.birthYear == null)?"<null>":this.birthYear));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("atypDescription");
        sb.append('=');
        sb.append(((this.atypDescription == null)?"<null>":this.atypDescription));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.cntyCode == null)? 0 :this.cntyCode.hashCode()));
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        result = ((result* 31)+((this.nonpersonName == null)? 0 :this.nonpersonName.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.sourceComment == null)? 0 :this.sourceComment.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.greenDataBar1 == null)? 0 :this.greenDataBar1 .hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.teleDescription == null)? 0 :this.teleDescription.hashCode()));
        result = ((result* 31)+((this.statDescription == null)? 0 :this.statDescription.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.emalDescription == null)? 0 :this.emalDescription.hashCode()));
        result = ((result* 31)+((this.adidDesc == null)? 0 :this.adidDesc.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.additionalId == null)? 0 :this.additionalId.hashCode()));
        result = ((result* 31)+((this.birthDay == null)? 0 :this.birthDay.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.natnDescription == null)? 0 :this.natnDescription.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.cntyDescription == null)? 0 :this.cntyDescription.hashCode()));
        result = ((result* 31)+((this.birthMon == null)? 0 :this.birthMon.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.birthYear == null)? 0 :this.birthYear.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.atypDescription == null)? 0 :this.atypDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonMatchingEntry100PostResponse) == false) {
            return false;
        }
        CommonMatchingEntry100PostResponse rhs = ((CommonMatchingEntry100PostResponse) other);
        return (((((((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))))&&((this.nonpersonName == rhs.nonpersonName)||((this.nonpersonName!= null)&&this.nonpersonName.equals(rhs.nonpersonName))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.sourceComment == rhs.sourceComment)||((this.sourceComment!= null)&&this.sourceComment.equals(rhs.sourceComment))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.greenDataBar1 == rhs.greenDataBar1)||((this.greenDataBar1 != null)&&this.greenDataBar1 .equals(rhs.greenDataBar1))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.teleDescription == rhs.teleDescription)||((this.teleDescription!= null)&&this.teleDescription.equals(rhs.teleDescription))))&&((this.statDescription == rhs.statDescription)||((this.statDescription!= null)&&this.statDescription.equals(rhs.statDescription))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.emalDescription == rhs.emalDescription)||((this.emalDescription!= null)&&this.emalDescription.equals(rhs.emalDescription))))&&((this.adidDesc == rhs.adidDesc)||((this.adidDesc!= null)&&this.adidDesc.equals(rhs.adidDesc))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.additionalId == rhs.additionalId)||((this.additionalId!= null)&&this.additionalId.equals(rhs.additionalId))))&&((this.birthDay == rhs.birthDay)||((this.birthDay!= null)&&this.birthDay.equals(rhs.birthDay))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.natnDescription == rhs.natnDescription)||((this.natnDescription!= null)&&this.natnDescription.equals(rhs.natnDescription))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.cntyDescription == rhs.cntyDescription)||((this.cntyDescription!= null)&&this.cntyDescription.equals(rhs.cntyDescription))))&&((this.birthMon == rhs.birthMon)||((this.birthMon!= null)&&this.birthMon.equals(rhs.birthMon))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.birthYear == rhs.birthYear)||((this.birthYear!= null)&&this.birthYear.equals(rhs.birthYear))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.atypDescription == rhs.atypDescription)||((this.atypDescription!= null)&&this.atypDescription.equals(rhs.atypDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
