
package com.ellucian.generated.bpapi.ban.source_or_background_institution.v1_0_0;

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
    "streetLine1",
    "city",
    "streetLine4",
    "streetLine3",
    "houseNumber",
    "criteria.ctryCodePhone",
    "criteria.phoneArea",
    "ctryCodePhone",
    "criteria.phoneExt",
    "zip",
    "phoneExt",
    "statCode",
    "natnCode",
    "keyblocSbgiCode",
    "criteria.name",
    "criteria.ptypDescription",
    "criteria.ptypCode",
    "ptypCode",
    "phoneNumber",
    "name",
    "phoneArea",
    "comment",
    "criteria.phoneNumber"
})
@Generated("jsonschema2pojo")
public class SourceOrBackgroundInstitution100PutRequest {

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_STREET_LINE2")
    private String streetLine2;
    /**
     * County
     * <p>
     * Lineage reference object : SOBSBGI_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_STREET_LINE1")
    private String streetLine1;
    /**
     * City
     * <p>
     * Lineage reference object : SOBSBGI_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_CITY")
    private String city;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_STREET_LINE4")
    private String streetLine4;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_STREET_LINE3")
    private String streetLine3;
    /**
     * House Number
     * <p>
     * Lineage reference object : SOBSBGI_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_AREA")
    private String criteriaPhoneArea;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_EXT")
    private String criteriaPhoneExt;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SOBSBGI_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_ZIP")
    private String zip;
    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_EXT")
    private String phoneExt;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SOBSBGI_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : SOBSBGI_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SOBSBGI_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    @JsonPropertyDescription("Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi")
    private Object keyblocSbgiCode;
    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_NAME")
    private String criteriaName;
    @JsonProperty("criteria.ptypDescription")
    private String criteriaPtypDescription;
    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("criteria.ptypCode")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp")
    private String criteriaPtypCode;
    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp")
    private String ptypCode;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_NAME")
    private String name;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_AREA")
    private String phoneArea;
    /**
     * Comments
     * <p>
     * Lineage reference object : SORBCMT_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SORBCMT_COMMENT")
    private String comment;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_NUMBER")
    private String criteriaPhoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public SourceOrBackgroundInstitution100PutRequest withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SOBSBGI_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SOBSBGI_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public SourceOrBackgroundInstitution100PutRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SOBSBGI_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SOBSBGI_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public SourceOrBackgroundInstitution100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public String getStreetLine4() {
        return streetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public void setStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
    }

    public SourceOrBackgroundInstitution100PutRequest withStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SOBSBGI_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public SourceOrBackgroundInstitution100PutRequest withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SOBSBGI_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SOBSBGI_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public SourceOrBackgroundInstitution100PutRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public SourceOrBackgroundInstitution100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SOBSBGI_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SOBSBGI_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public SourceOrBackgroundInstitution100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public SourceOrBackgroundInstitution100PutRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SOBSBGI_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SOBSBGI_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SOBSBGI_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SOBSBGI_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public Object getKeyblocSbgiCode() {
        return keyblocSbgiCode;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public void setKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
        return this;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    @JsonProperty("criteria.ptypDescription")
    public String getCriteriaPtypDescription() {
        return criteriaPtypDescription;
    }

    @JsonProperty("criteria.ptypDescription")
    public void setCriteriaPtypDescription(String criteriaPtypDescription) {
        this.criteriaPtypDescription = criteriaPtypDescription;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaPtypDescription(String criteriaPtypDescription) {
        this.criteriaPtypDescription = criteriaPtypDescription;
        return this;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("criteria.ptypCode")
    public String getCriteriaPtypCode() {
        return criteriaPtypCode;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("criteria.ptypCode")
    public void setCriteriaPtypCode(String criteriaPtypCode) {
        this.criteriaPtypCode = criteriaPtypCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaPtypCode(String criteriaPtypCode) {
        this.criteriaPtypCode = criteriaPtypCode;
        return this;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    public String getPtypCode() {
        return ptypCode;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    public void setPtypCode(String ptypCode) {
        this.ptypCode = ptypCode;
    }

    public SourceOrBackgroundInstitution100PutRequest withPtypCode(String ptypCode) {
        this.ptypCode = ptypCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SourceOrBackgroundInstitution100PutRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SourceOrBackgroundInstitution100PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public SourceOrBackgroundInstitution100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SORBCMT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SORBCMT_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public SourceOrBackgroundInstitution100PutRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public String getCriteriaPhoneNumber() {
        return criteriaPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public void setCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
    }

    public SourceOrBackgroundInstitution100PutRequest withCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
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

    public SourceOrBackgroundInstitution100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceOrBackgroundInstitution100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
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
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
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
        sb.append("keyblocSbgiCode");
        sb.append('=');
        sb.append(((this.keyblocSbgiCode == null)?"<null>":this.keyblocSbgiCode));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("criteriaPtypDescription");
        sb.append('=');
        sb.append(((this.criteriaPtypDescription == null)?"<null>":this.criteriaPtypDescription));
        sb.append(',');
        sb.append("criteriaPtypCode");
        sb.append('=');
        sb.append(((this.criteriaPtypCode == null)?"<null>":this.criteriaPtypCode));
        sb.append(',');
        sb.append("ptypCode");
        sb.append('=');
        sb.append(((this.ptypCode == null)?"<null>":this.ptypCode));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("criteriaPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaPhoneNumber == null)?"<null>":this.criteriaPhoneNumber));
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
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.criteriaPtypDescription == null)? 0 :this.criteriaPtypDescription.hashCode()));
        result = ((result* 31)+((this.criteriaPtypCode == null)? 0 :this.criteriaPtypCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine4 == null)? 0 :this.streetLine4 .hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.keyblocSbgiCode == null)? 0 :this.keyblocSbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.ptypCode == null)? 0 :this.ptypCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneNumber == null)? 0 :this.criteriaPhoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceOrBackgroundInstitution100PutRequest) == false) {
            return false;
        }
        SourceOrBackgroundInstitution100PutRequest rhs = ((SourceOrBackgroundInstitution100PutRequest) other);
        return (((((((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.criteriaPtypDescription == rhs.criteriaPtypDescription)||((this.criteriaPtypDescription!= null)&&this.criteriaPtypDescription.equals(rhs.criteriaPtypDescription))))&&((this.criteriaPtypCode == rhs.criteriaPtypCode)||((this.criteriaPtypCode!= null)&&this.criteriaPtypCode.equals(rhs.criteriaPtypCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine4 == rhs.streetLine4)||((this.streetLine4 != null)&&this.streetLine4 .equals(rhs.streetLine4))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.keyblocSbgiCode == rhs.keyblocSbgiCode)||((this.keyblocSbgiCode!= null)&&this.keyblocSbgiCode.equals(rhs.keyblocSbgiCode))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.ptypCode == rhs.ptypCode)||((this.ptypCode!= null)&&this.ptypCode.equals(rhs.ptypCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.criteriaPhoneNumber == rhs.criteriaPhoneNumber)||((this.criteriaPhoneNumber!= null)&&this.criteriaPhoneNumber.equals(rhs.criteriaPhoneNumber))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
