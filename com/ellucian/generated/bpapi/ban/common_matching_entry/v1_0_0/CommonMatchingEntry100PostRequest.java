
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
    "streetLine2",
    "cntyCode",
    "lastName",
    "streetLine1",
    "adidCode",
    "city",
    "streetLine3",
    "ssn",
    "emailAddress",
    "emalCode",
    "mi",
    "zip",
    "birthDay",
    "phoneExt",
    "statCode",
    "natnCode",
    "sex",
    "teleCode",
    "birthMon",
    "firstName",
    "keyblockSourceCode",
    "phoneNumber",
    "birthYear",
    "phoneArea",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class CommonMatchingEntry100PostRequest {

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
     * County
     * <p>
     * Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    private String lastName;
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
     * Additional ID Type
     * <p>
     * Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String adidCode;
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
    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GOTCMME_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_SSN")
    private String ssn;
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
    /**
     * Middle Name
     * <p>
     * Lineage reference object : GOTCMME_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_MI")
    private String mi;
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
    /**
     * Telephone Type
     * <p>
     * Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lineage reference object : GOTCMME_TELE_CODE, Lookup lineage reference object : stvtele")
    private String teleCode;
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
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    @JsonPropertyDescription("Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc")
    private Object keyblockSourceCode;
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

    public CommonMatchingEntry100PostRequest withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

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

    public CommonMatchingEntry100PostRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
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

    public CommonMatchingEntry100PostRequest withLastName(String lastName) {
        this.lastName = lastName;
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

    public CommonMatchingEntry100PostRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
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

    public CommonMatchingEntry100PostRequest withAdidCode(String adidCode) {
        this.adidCode = adidCode;
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

    public CommonMatchingEntry100PostRequest withCity(String city) {
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

    public CommonMatchingEntry100PostRequest withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
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

    public CommonMatchingEntry100PostRequest withSsn(String ssn) {
        this.ssn = ssn;
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

    public CommonMatchingEntry100PostRequest withEmailAddress(String emailAddress) {
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

    public CommonMatchingEntry100PostRequest withEmalCode(String emalCode) {
        this.emalCode = emalCode;
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

    public CommonMatchingEntry100PostRequest withMi(String mi) {
        this.mi = mi;
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

    public CommonMatchingEntry100PostRequest withZip(String zip) {
        this.zip = zip;
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

    public CommonMatchingEntry100PostRequest withBirthDay(String birthDay) {
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

    public CommonMatchingEntry100PostRequest withPhoneExt(String phoneExt) {
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

    public CommonMatchingEntry100PostRequest withStatCode(String statCode) {
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

    public CommonMatchingEntry100PostRequest withNatnCode(String natnCode) {
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

    public CommonMatchingEntry100PostRequest withSex(String sex) {
        this.sex = sex;
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

    public CommonMatchingEntry100PostRequest withTeleCode(String teleCode) {
        this.teleCode = teleCode;
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

    public CommonMatchingEntry100PostRequest withBirthMon(String birthMon) {
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

    public CommonMatchingEntry100PostRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    public Object getKeyblockSourceCode() {
        return keyblockSourceCode;
    }

    /**
     * Matching Source
     * <p>
     * Lineage reference object : keyblockSourceCode, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("keyblockSourceCode")
    public void setKeyblockSourceCode(Object keyblockSourceCode) {
        this.keyblockSourceCode = keyblockSourceCode;
    }

    public CommonMatchingEntry100PostRequest withKeyblockSourceCode(Object keyblockSourceCode) {
        this.keyblockSourceCode = keyblockSourceCode;
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

    public CommonMatchingEntry100PostRequest withPhoneNumber(String phoneNumber) {
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

    public CommonMatchingEntry100PostRequest withBirthYear(String birthYear) {
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

    public CommonMatchingEntry100PostRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
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

    public CommonMatchingEntry100PostRequest withAtypCode(String atypCode) {
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

    public CommonMatchingEntry100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonMatchingEntry100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("emalCode");
        sb.append('=');
        sb.append(((this.emalCode == null)?"<null>":this.emalCode));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
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
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("birthMon");
        sb.append('=');
        sb.append(((this.birthMon == null)?"<null>":this.birthMon));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("keyblockSourceCode");
        sb.append('=');
        sb.append(((this.keyblockSourceCode == null)?"<null>":this.keyblockSourceCode));
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
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.cntyCode == null)? 0 :this.cntyCode.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.birthDay == null)? 0 :this.birthDay.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.birthMon == null)? 0 :this.birthMon.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.keyblockSourceCode == null)? 0 :this.keyblockSourceCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.birthYear == null)? 0 :this.birthYear.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonMatchingEntry100PostRequest) == false) {
            return false;
        }
        CommonMatchingEntry100PostRequest rhs = ((CommonMatchingEntry100PostRequest) other);
        return (((((((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.birthDay == rhs.birthDay)||((this.birthDay!= null)&&this.birthDay.equals(rhs.birthDay))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.birthMon == rhs.birthMon)||((this.birthMon!= null)&&this.birthMon.equals(rhs.birthMon))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.keyblockSourceCode == rhs.keyblockSourceCode)||((this.keyblockSourceCode!= null)&&this.keyblockSourceCode.equals(rhs.keyblockSourceCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.birthYear == rhs.birthYear)||((this.birthYear!= null)&&this.birthYear.equals(rhs.birthYear))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
