
package com.ellucian.generated.bpapi.ban.general_person_identification_emergency_contact.v1_0_0;

import java.util.Date;
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
    "lastName",
    "streetLine1",
    "surnamePrefix",
    "city",
    "streetLine4",
    "streetLine3",
    "houseNumber",
    "ctryCodePhone",
    "activityDate",
    "reltDescription",
    "mi",
    "zip",
    "phoneExt",
    "reltCode",
    "statCode",
    "natnCode",
    "natnDescription",
    "priority",
    "userId",
    "firstName",
    "phoneNumber",
    "phoneArea",
    "atypDescription",
    "stateDescription",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class Spremrg {

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
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPREMRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("reltDescription")
    private String reltDescription;
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
     * Extension
     * <p>
     * Lineage reference object : SPREMRG_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_EXT")
    private String phoneExt;
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
     * State or Province
     * <p>
     * Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    @JsonProperty("natnDescription")
    private String natnDescription;
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
     * User
     * <p>
     * Lineage reference object : SPREMRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_USER_ID")
    private String userId;
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
     * Area Code
     * <p>
     * Lineage reference object : SPREMRG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SPREMRG_PHONE_AREA")
    private String phoneArea;
    @JsonProperty("atypDescription")
    private String atypDescription;
    @JsonProperty("stateDescription")
    private String stateDescription;
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

    public Spremrg withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
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

    public Spremrg withLastName(String lastName) {
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

    public Spremrg withStreetLine1(String streetLine1) {
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

    public Spremrg withSurnamePrefix(String surnamePrefix) {
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

    public Spremrg withCity(String city) {
        this.city = city;
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

    public Spremrg withStreetLine4(String streetLine4) {
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

    public Spremrg withStreetLine3(String streetLine3) {
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

    public Spremrg withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public Spremrg withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPREMRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPREMRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Spremrg withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("reltDescription")
    public String getReltDescription() {
        return reltDescription;
    }

    @JsonProperty("reltDescription")
    public void setReltDescription(String reltDescription) {
        this.reltDescription = reltDescription;
    }

    public Spremrg withReltDescription(String reltDescription) {
        this.reltDescription = reltDescription;
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

    public Spremrg withMi(String mi) {
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

    public Spremrg withZip(String zip) {
        this.zip = zip;
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

    public Spremrg withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
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

    public Spremrg withReltCode(String reltCode) {
        this.reltCode = reltCode;
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

    public Spremrg withStatCode(String statCode) {
        this.statCode = statCode;
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

    public Spremrg withNatnCode(String natnCode) {
        this.natnCode = natnCode;
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

    public Spremrg withNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
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

    public Spremrg withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPREMRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPREMRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Spremrg withUserId(String userId) {
        this.userId = userId;
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

    public Spremrg withFirstName(String firstName) {
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

    public Spremrg withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Spremrg withPhoneArea(String phoneArea) {
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

    public Spremrg withAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
        return this;
    }

    @JsonProperty("stateDescription")
    public String getStateDescription() {
        return stateDescription;
    }

    @JsonProperty("stateDescription")
    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public Spremrg withStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
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

    public Spremrg withAtypCode(String atypCode) {
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

    public Spremrg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spremrg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
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
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("reltDescription");
        sb.append('=');
        sb.append(((this.reltDescription == null)?"<null>":this.reltDescription));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("reltCode");
        sb.append('=');
        sb.append(((this.reltCode == null)?"<null>":this.reltCode));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("natnDescription");
        sb.append('=');
        sb.append(((this.natnDescription == null)?"<null>":this.natnDescription));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("atypDescription");
        sb.append('=');
        sb.append(((this.atypDescription == null)?"<null>":this.atypDescription));
        sb.append(',');
        sb.append("stateDescription");
        sb.append('=');
        sb.append(((this.stateDescription == null)?"<null>":this.stateDescription));
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine4 == null)? 0 :this.streetLine4 .hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.reltDescription == null)? 0 :this.reltDescription.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.reltCode == null)? 0 :this.reltCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.natnDescription == null)? 0 :this.natnDescription.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.atypDescription == null)? 0 :this.atypDescription.hashCode()));
        result = ((result* 31)+((this.stateDescription == null)? 0 :this.stateDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spremrg) == false) {
            return false;
        }
        Spremrg rhs = ((Spremrg) other);
        return ((((((((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine4 == rhs.streetLine4)||((this.streetLine4 != null)&&this.streetLine4 .equals(rhs.streetLine4))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.reltDescription == rhs.reltDescription)||((this.reltDescription!= null)&&this.reltDescription.equals(rhs.reltDescription))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.reltCode == rhs.reltCode)||((this.reltCode!= null)&&this.reltCode.equals(rhs.reltCode))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.natnDescription == rhs.natnDescription)||((this.natnDescription!= null)&&this.natnDescription.equals(rhs.natnDescription))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.atypDescription == rhs.atypDescription)||((this.atypDescription!= null)&&this.atypDescription.equals(rhs.atypDescription))))&&((this.stateDescription == rhs.stateDescription)||((this.stateDescription!= null)&&this.stateDescription.equals(rhs.stateDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
