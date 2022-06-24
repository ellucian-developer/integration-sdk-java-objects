
package com.ellucian.generated.bpapi.ban.general_person_identification_emergency_contact.v1_0_0;

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
    "criteria.surnamePrefix",
    "streetLine2",
    "criteria.atypCode",
    "lastName",
    "streetLine1",
    "surnamePrefix",
    "city",
    "criteria.firstName",
    "streetLine4",
    "streetLine3",
    "houseNumber",
    "criteria.ctryCodePhone",
    "criteria.phoneArea",
    "ctryCodePhone",
    "criteria.phoneExt",
    "criteria.natnCode",
    "criteria.city",
    "criteria.mi",
    "id",
    "mi",
    "zip",
    "criteria.streetLine1",
    "reltCode",
    "phoneExt",
    "statCode",
    "criteria.streetLine4",
    "natnCode",
    "criteria.streetLine2",
    "criteria.streetLine3",
    "criteria.houseNumber",
    "priority",
    "criteria.lastName",
    "criteria.reltCode",
    "criteria.statCode",
    "criteria.zip",
    "firstName",
    "phoneNumber",
    "criteria.priority",
    "phoneArea",
    "criteria.phoneNumber",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationEmergencyContact100PutRequest {

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_SURNAME_PREFIX")
    private String criteriaSurnamePrefix;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE2")
    private String streetLine2;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteriaAtypCode;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPREMRG_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_LAST_NAME")
    private String lastName;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE1")
    private String streetLine1;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_SURNAME_PREFIX")
    private String surnamePrefix;
    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_CITY")
    private String city;
    /**
     * First Name
     * <p>
     * Lineage reference object : SPREMRG_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_FIRST_NAME")
    private String criteriaFirstName;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE4")
    private String streetLine4;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE3")
    private String streetLine3;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_AREA")
    private String criteriaPhoneArea;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_EXT")
    private String criteriaPhoneExt;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("criteria.city")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_CITY")
    private String criteriaCity;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("criteria.mi")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_MI")
    private String criteriaMi;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_MI")
    private String mi;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc")
    private String zip;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE1")
    private String criteriaStreetLine1;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("reltCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt")
    private String reltCode;
    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_EXT")
    private String phoneExt;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE4")
    private String criteriaStreetLine4;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE2")
    private String criteriaStreetLine2;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STREET_LINE3")
    private String criteriaStreetLine3;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_HOUSE_NUMBER")
    private String criteriaHouseNumber;
    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PRIORITY")
    private String priority;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPREMRG_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_LAST_NAME")
    private String criteriaLastName;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("criteria.reltCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt")
    private String criteriaReltCode;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat")
    private String criteriaStatCode;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.zip")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc")
    private String criteriaZip;
    /**
     * First Name
     * <p>
     * Lineage reference object : SPREMRG_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_FIRST_NAME")
    private String firstName;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PRIORITY")
    private String criteriaPriority;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_AREA")
    private String phoneArea;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_NUMBER")
    private String criteriaPhoneNumber;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    public String getCriteriaSurnamePrefix() {
        return criteriaSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    public void setCriteriaSurnamePrefix(String criteriaSurnamePrefix) {
        this.criteriaSurnamePrefix = criteriaSurnamePrefix;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaSurnamePrefix(String criteriaSurnamePrefix) {
        this.criteriaSurnamePrefix = criteriaSurnamePrefix;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPREMRG_LAST_NAME
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
     * Lineage reference object : SPREMRG_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPREMRG_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPREMRG_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    public String getCriteriaFirstName() {
        return criteriaFirstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPREMRG_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    public void setCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public String getStreetLine4() {
        return streetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public void setStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPREMRG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public String getCriteriaCity() {
        return criteriaCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPREMRG_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public void setCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("criteria.mi")
    public String getCriteriaMi() {
        return criteriaMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("criteria.mi")
    public void setCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPREMRG_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    public String getCriteriaStreetLine1() {
        return criteriaStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    public void setCriteriaStreetLine1(String criteriaStreetLine1) {
        this.criteriaStreetLine1 = criteriaStreetLine1;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaStreetLine1(String criteriaStreetLine1) {
        this.criteriaStreetLine1 = criteriaStreetLine1;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("reltCode")
    public String getReltCode() {
        return reltCode;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("reltCode")
    public void setReltCode(String reltCode) {
        this.reltCode = reltCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withReltCode(String reltCode) {
        this.reltCode = reltCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    public String getCriteriaStreetLine4() {
        return criteriaStreetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    public void setCriteriaStreetLine4(String criteriaStreetLine4) {
        this.criteriaStreetLine4 = criteriaStreetLine4;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaStreetLine4(String criteriaStreetLine4) {
        this.criteriaStreetLine4 = criteriaStreetLine4;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    public String getCriteriaStreetLine2() {
        return criteriaStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    public void setCriteriaStreetLine2(String criteriaStreetLine2) {
        this.criteriaStreetLine2 = criteriaStreetLine2;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaStreetLine2(String criteriaStreetLine2) {
        this.criteriaStreetLine2 = criteriaStreetLine2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    public String getCriteriaStreetLine3() {
        return criteriaStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPREMRG_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    public void setCriteriaStreetLine3(String criteriaStreetLine3) {
        this.criteriaStreetLine3 = criteriaStreetLine3;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaStreetLine3(String criteriaStreetLine3) {
        this.criteriaStreetLine3 = criteriaStreetLine3;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public String getCriteriaHouseNumber() {
        return criteriaHouseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPREMRG_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public void setCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPREMRG_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    public String getCriteriaLastName() {
        return criteriaLastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPREMRG_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    public void setCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("criteria.reltCode")
    public String getCriteriaReltCode() {
        return criteriaReltCode;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SPREMRG_RELT_CODE, Lookup lineage reference object : stvrelt
     * 
     */
    @JsonProperty("criteria.reltCode")
    public void setCriteriaReltCode(String criteriaReltCode) {
        this.criteriaReltCode = criteriaReltCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaReltCode(String criteriaReltCode) {
        this.criteriaReltCode = criteriaReltCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public String getCriteriaStatCode() {
        return criteriaStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public void setCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.zip")
    public String getCriteriaZip() {
        return criteriaZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPREMRG_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.zip")
    public void setCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPREMRG_FIRST_NAME
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
     * Lineage reference object : SPREMRG_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public String getCriteriaPriority() {
        return criteriaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SPREMRG_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public void setCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public String getCriteriaPhoneNumber() {
        return criteriaPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPREMRG_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public void setCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPREMRG_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public GeneralPersonIdentificationEmergencyContact100PutRequest withAtypCode(String atypCode) {
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

    public GeneralPersonIdentificationEmergencyContact100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationEmergencyContact100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSurnamePrefix");
        sb.append('=');
        sb.append(((this.criteriaSurnamePrefix == null)?"<null>":this.criteriaSurnamePrefix));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("criteriaFirstName");
        sb.append('=');
        sb.append(((this.criteriaFirstName == null)?"<null>":this.criteriaFirstName));
        sb.append(',');
        sb.append("streetLine4");
        sb.append('=');
        sb.append(((this.streetLine4 == null)?"<null>":this.streetLine4));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("criteriaMi");
        sb.append('=');
        sb.append(((this.criteriaMi == null)?"<null>":this.criteriaMi));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("criteriaStreetLine1");
        sb.append('=');
        sb.append(((this.criteriaStreetLine1 == null)?"<null>":this.criteriaStreetLine1));
        sb.append(',');
        sb.append("reltCode");
        sb.append('=');
        sb.append(((this.reltCode == null)?"<null>":this.reltCode));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("criteriaStreetLine4");
        sb.append('=');
        sb.append(((this.criteriaStreetLine4 == null)?"<null>":this.criteriaStreetLine4));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("criteriaStreetLine2");
        sb.append('=');
        sb.append(((this.criteriaStreetLine2 == null)?"<null>":this.criteriaStreetLine2));
        sb.append(',');
        sb.append("criteriaStreetLine3");
        sb.append('=');
        sb.append(((this.criteriaStreetLine3 == null)?"<null>":this.criteriaStreetLine3));
        sb.append(',');
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("criteriaLastName");
        sb.append('=');
        sb.append(((this.criteriaLastName == null)?"<null>":this.criteriaLastName));
        sb.append(',');
        sb.append("criteriaReltCode");
        sb.append('=');
        sb.append(((this.criteriaReltCode == null)?"<null>":this.criteriaReltCode));
        sb.append(',');
        sb.append("criteriaStatCode");
        sb.append('=');
        sb.append(((this.criteriaStatCode == null)?"<null>":this.criteriaStatCode));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("criteriaPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaPhoneNumber == null)?"<null>":this.criteriaPhoneNumber));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaMi == null)? 0 :this.criteriaMi.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine4 == null)? 0 :this.streetLine4 .hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaLastName == null)? 0 :this.criteriaLastName.hashCode()));
        result = ((result* 31)+((this.criteriaSurnamePrefix == null)? 0 :this.criteriaSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaFirstName == null)? 0 :this.criteriaFirstName.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.reltCode == null)? 0 :this.reltCode.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.criteriaStatCode == null)? 0 :this.criteriaStatCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaReltCode == null)? 0 :this.criteriaReltCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneNumber == null)? 0 :this.criteriaPhoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine4 == null)? 0 :this.criteriaStreetLine4 .hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine2 == null)? 0 :this.criteriaStreetLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine3 == null)? 0 :this.criteriaStreetLine3 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine1 == null)? 0 :this.criteriaStreetLine1 .hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationEmergencyContact100PutRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationEmergencyContact100PutRequest rhs = ((GeneralPersonIdentificationEmergencyContact100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.criteriaMi == rhs.criteriaMi)||((this.criteriaMi!= null)&&this.criteriaMi.equals(rhs.criteriaMi))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine4 == rhs.streetLine4)||((this.streetLine4 != null)&&this.streetLine4 .equals(rhs.streetLine4))))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.criteriaLastName == rhs.criteriaLastName)||((this.criteriaLastName!= null)&&this.criteriaLastName.equals(rhs.criteriaLastName))))&&((this.criteriaSurnamePrefix == rhs.criteriaSurnamePrefix)||((this.criteriaSurnamePrefix!= null)&&this.criteriaSurnamePrefix.equals(rhs.criteriaSurnamePrefix))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaFirstName == rhs.criteriaFirstName)||((this.criteriaFirstName!= null)&&this.criteriaFirstName.equals(rhs.criteriaFirstName))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.reltCode == rhs.reltCode)||((this.reltCode!= null)&&this.reltCode.equals(rhs.reltCode))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.criteriaStatCode == rhs.criteriaStatCode)||((this.criteriaStatCode!= null)&&this.criteriaStatCode.equals(rhs.criteriaStatCode))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.criteriaReltCode == rhs.criteriaReltCode)||((this.criteriaReltCode!= null)&&this.criteriaReltCode.equals(rhs.criteriaReltCode))))&&((this.criteriaPhoneNumber == rhs.criteriaPhoneNumber)||((this.criteriaPhoneNumber!= null)&&this.criteriaPhoneNumber.equals(rhs.criteriaPhoneNumber))))&&((this.criteriaStreetLine4 == rhs.criteriaStreetLine4)||((this.criteriaStreetLine4 != null)&&this.criteriaStreetLine4 .equals(rhs.criteriaStreetLine4))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.criteriaStreetLine2 == rhs.criteriaStreetLine2)||((this.criteriaStreetLine2 != null)&&this.criteriaStreetLine2 .equals(rhs.criteriaStreetLine2))))&&((this.criteriaStreetLine3 == rhs.criteriaStreetLine3)||((this.criteriaStreetLine3 != null)&&this.criteriaStreetLine3 .equals(rhs.criteriaStreetLine3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaStreetLine1 == rhs.criteriaStreetLine1)||((this.criteriaStreetLine1 != null)&&this.criteriaStreetLine1 .equals(rhs.criteriaStreetLine1))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
