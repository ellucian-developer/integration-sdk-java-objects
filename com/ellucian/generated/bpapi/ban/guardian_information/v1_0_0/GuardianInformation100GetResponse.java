
package com.ellucian.generated.bpapi.ban.guardian_information.v1_0_0;

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
    "surnamePrefix",
    "spraddrAsrcCode",
    "spraddrToDate",
    "parentLast",
    "addrMsg",
    "stvatypDesc",
    "spraddrHouseNumber",
    "spraddrZip",
    "spraddrCity",
    "parentEmployer",
    "stvreltDesc",
    "parentNamePrefix",
    "stvcntyDesc",
    "phoneExists",
    "spraddrCntyCode",
    "spraddrFromDate",
    "deceasedInd",
    "parentNameSuffix",
    "phoneExt",
    "reltCode",
    "parentDegree",
    "stvstatDesc",
    "parentMi",
    "parentJobTitle",
    "teleCode",
    "phoneNumber",
    "phoneCountryCode",
    "spraddrStreetLine4",
    "spraddrStreetLine3",
    "spraddrSeqno",
    "spraddrStreetLine2",
    "spraddrStreetLine1",
    "phoneArea",
    "spraddrNatnCode",
    "spraddrStatCode",
    "parentFirst",
    "atypCode",
    "stvnatnDesc"
})
@Generated("jsonschema2pojo")
public class GuardianInformation100GetResponse {

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_SURNAME_PREFIX")
    private String surnamePrefix;
    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("spraddrAsrcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvasrc")
    private String spraddrAsrcCode;
    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrToDate")
    private Date spraddrToDate;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_LAST")
    private String parentLast;
    @JsonProperty("addrMsg")
    private String addrMsg;
    @JsonProperty("stvatypDesc")
    private String stvatypDesc;
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrHouseNumber")
    private String spraddrHouseNumber;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrZip")
    private String spraddrZip;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrCity")
    private String spraddrCity;
    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_EMPLOYER")
    private String parentEmployer;
    @JsonProperty("stvreltDesc")
    private String stvreltDesc;
    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_PREFIX")
    private String parentNamePrefix;
    @JsonProperty("stvcntyDesc")
    private String stvcntyDesc;
    @JsonProperty("phoneExists")
    private String phoneExists;
    /**
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("spraddrCntyCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcnty")
    private String spraddrCntyCode;
    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrFromDate")
    private Date spraddrFromDate;
    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_DECEASED_IND")
    private String deceasedInd;
    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX")
    private String parentNameSuffix;
    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    private String phoneExt;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt")
    private String reltCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_DEGREE")
    private String parentDegree;
    @JsonProperty("stvstatDesc")
    private String stvstatDesc;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_MI")
    private String parentMi;
    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_JOB_TITLE")
    private String parentJobTitle;
    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("teleCode")
    private String teleCode;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine4")
    private String spraddrStreetLine4;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine3")
    private String spraddrStreetLine3;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrSeqno")
    private Double spraddrSeqno;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine2")
    private String spraddrStreetLine2;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine1")
    private String spraddrStreetLine1;
    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    private String phoneArea;
    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvnatn")
    private String spraddrNatnCode;
    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("spraddrStatCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvstat")
    private String spraddrStatCode;
    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_FIRST")
    private String parentFirst;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonProperty("stvnatnDesc")
    private String stvnatnDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    public GuardianInformation100GetResponse withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("spraddrAsrcCode")
    public String getSpraddrAsrcCode() {
        return spraddrAsrcCode;
    }

    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("spraddrAsrcCode")
    public void setSpraddrAsrcCode(String spraddrAsrcCode) {
        this.spraddrAsrcCode = spraddrAsrcCode;
    }

    public GuardianInformation100GetResponse withSpraddrAsrcCode(String spraddrAsrcCode) {
        this.spraddrAsrcCode = spraddrAsrcCode;
        return this;
    }

    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrToDate")
    public Date getSpraddrToDate() {
        return spraddrToDate;
    }

    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrToDate")
    public void setSpraddrToDate(Date spraddrToDate) {
        this.spraddrToDate = spraddrToDate;
    }

    public GuardianInformation100GetResponse withSpraddrToDate(Date spraddrToDate) {
        this.spraddrToDate = spraddrToDate;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    public String getParentLast() {
        return parentLast;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    public void setParentLast(String parentLast) {
        this.parentLast = parentLast;
    }

    public GuardianInformation100GetResponse withParentLast(String parentLast) {
        this.parentLast = parentLast;
        return this;
    }

    @JsonProperty("addrMsg")
    public String getAddrMsg() {
        return addrMsg;
    }

    @JsonProperty("addrMsg")
    public void setAddrMsg(String addrMsg) {
        this.addrMsg = addrMsg;
    }

    public GuardianInformation100GetResponse withAddrMsg(String addrMsg) {
        this.addrMsg = addrMsg;
        return this;
    }

    @JsonProperty("stvatypDesc")
    public String getStvatypDesc() {
        return stvatypDesc;
    }

    @JsonProperty("stvatypDesc")
    public void setStvatypDesc(String stvatypDesc) {
        this.stvatypDesc = stvatypDesc;
    }

    public GuardianInformation100GetResponse withStvatypDesc(String stvatypDesc) {
        this.stvatypDesc = stvatypDesc;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrHouseNumber")
    public String getSpraddrHouseNumber() {
        return spraddrHouseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrHouseNumber")
    public void setSpraddrHouseNumber(String spraddrHouseNumber) {
        this.spraddrHouseNumber = spraddrHouseNumber;
    }

    public GuardianInformation100GetResponse withSpraddrHouseNumber(String spraddrHouseNumber) {
        this.spraddrHouseNumber = spraddrHouseNumber;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrZip")
    public String getSpraddrZip() {
        return spraddrZip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrZip")
    public void setSpraddrZip(String spraddrZip) {
        this.spraddrZip = spraddrZip;
    }

    public GuardianInformation100GetResponse withSpraddrZip(String spraddrZip) {
        this.spraddrZip = spraddrZip;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrCity")
    public String getSpraddrCity() {
        return spraddrCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrCity")
    public void setSpraddrCity(String spraddrCity) {
        this.spraddrCity = spraddrCity;
    }

    public GuardianInformation100GetResponse withSpraddrCity(String spraddrCity) {
        this.spraddrCity = spraddrCity;
        return this;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    public String getParentEmployer() {
        return parentEmployer;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    public void setParentEmployer(String parentEmployer) {
        this.parentEmployer = parentEmployer;
    }

    public GuardianInformation100GetResponse withParentEmployer(String parentEmployer) {
        this.parentEmployer = parentEmployer;
        return this;
    }

    @JsonProperty("stvreltDesc")
    public String getStvreltDesc() {
        return stvreltDesc;
    }

    @JsonProperty("stvreltDesc")
    public void setStvreltDesc(String stvreltDesc) {
        this.stvreltDesc = stvreltDesc;
    }

    public GuardianInformation100GetResponse withStvreltDesc(String stvreltDesc) {
        this.stvreltDesc = stvreltDesc;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    public String getParentNamePrefix() {
        return parentNamePrefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    public void setParentNamePrefix(String parentNamePrefix) {
        this.parentNamePrefix = parentNamePrefix;
    }

    public GuardianInformation100GetResponse withParentNamePrefix(String parentNamePrefix) {
        this.parentNamePrefix = parentNamePrefix;
        return this;
    }

    @JsonProperty("stvcntyDesc")
    public String getStvcntyDesc() {
        return stvcntyDesc;
    }

    @JsonProperty("stvcntyDesc")
    public void setStvcntyDesc(String stvcntyDesc) {
        this.stvcntyDesc = stvcntyDesc;
    }

    public GuardianInformation100GetResponse withStvcntyDesc(String stvcntyDesc) {
        this.stvcntyDesc = stvcntyDesc;
        return this;
    }

    @JsonProperty("phoneExists")
    public String getPhoneExists() {
        return phoneExists;
    }

    @JsonProperty("phoneExists")
    public void setPhoneExists(String phoneExists) {
        this.phoneExists = phoneExists;
    }

    public GuardianInformation100GetResponse withPhoneExists(String phoneExists) {
        this.phoneExists = phoneExists;
        return this;
    }

    /**
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("spraddrCntyCode")
    public String getSpraddrCntyCode() {
        return spraddrCntyCode;
    }

    /**
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("spraddrCntyCode")
    public void setSpraddrCntyCode(String spraddrCntyCode) {
        this.spraddrCntyCode = spraddrCntyCode;
    }

    public GuardianInformation100GetResponse withSpraddrCntyCode(String spraddrCntyCode) {
        this.spraddrCntyCode = spraddrCntyCode;
        return this;
    }

    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrFromDate")
    public Date getSpraddrFromDate() {
        return spraddrFromDate;
    }

    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrFromDate")
    public void setSpraddrFromDate(Date spraddrFromDate) {
        this.spraddrFromDate = spraddrFromDate;
    }

    public GuardianInformation100GetResponse withSpraddrFromDate(Date spraddrFromDate) {
        this.spraddrFromDate = spraddrFromDate;
        return this;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    public String getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    public void setDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    public GuardianInformation100GetResponse withDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    public String getParentNameSuffix() {
        return parentNameSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    public void setParentNameSuffix(String parentNameSuffix) {
        this.parentNameSuffix = parentNameSuffix;
    }

    public GuardianInformation100GetResponse withParentNameSuffix(String parentNameSuffix) {
        this.parentNameSuffix = parentNameSuffix;
        return this;
    }

    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public GuardianInformation100GetResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    public String getReltCode() {
        return reltCode;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    public void setReltCode(String reltCode) {
        this.reltCode = reltCode;
    }

    public GuardianInformation100GetResponse withReltCode(String reltCode) {
        this.reltCode = reltCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    public String getParentDegree() {
        return parentDegree;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    public void setParentDegree(String parentDegree) {
        this.parentDegree = parentDegree;
    }

    public GuardianInformation100GetResponse withParentDegree(String parentDegree) {
        this.parentDegree = parentDegree;
        return this;
    }

    @JsonProperty("stvstatDesc")
    public String getStvstatDesc() {
        return stvstatDesc;
    }

    @JsonProperty("stvstatDesc")
    public void setStvstatDesc(String stvstatDesc) {
        this.stvstatDesc = stvstatDesc;
    }

    public GuardianInformation100GetResponse withStvstatDesc(String stvstatDesc) {
        this.stvstatDesc = stvstatDesc;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    public String getParentMi() {
        return parentMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    public void setParentMi(String parentMi) {
        this.parentMi = parentMi;
    }

    public GuardianInformation100GetResponse withParentMi(String parentMi) {
        this.parentMi = parentMi;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    public String getParentJobTitle() {
        return parentJobTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    public void setParentJobTitle(String parentJobTitle) {
        this.parentJobTitle = parentJobTitle;
    }

    public GuardianInformation100GetResponse withParentJobTitle(String parentJobTitle) {
        this.parentJobTitle = parentJobTitle;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public GuardianInformation100GetResponse withTeleCode(String teleCode) {
        this.teleCode = teleCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public GuardianInformation100GetResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCountryCode")
    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCountryCode")
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public GuardianInformation100GetResponse withPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine4")
    public String getSpraddrStreetLine4() {
        return spraddrStreetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine4")
    public void setSpraddrStreetLine4(String spraddrStreetLine4) {
        this.spraddrStreetLine4 = spraddrStreetLine4;
    }

    public GuardianInformation100GetResponse withSpraddrStreetLine4(String spraddrStreetLine4) {
        this.spraddrStreetLine4 = spraddrStreetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine3")
    public String getSpraddrStreetLine3() {
        return spraddrStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine3")
    public void setSpraddrStreetLine3(String spraddrStreetLine3) {
        this.spraddrStreetLine3 = spraddrStreetLine3;
    }

    public GuardianInformation100GetResponse withSpraddrStreetLine3(String spraddrStreetLine3) {
        this.spraddrStreetLine3 = spraddrStreetLine3;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrSeqno")
    public Double getSpraddrSeqno() {
        return spraddrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrSeqno")
    public void setSpraddrSeqno(Double spraddrSeqno) {
        this.spraddrSeqno = spraddrSeqno;
    }

    public GuardianInformation100GetResponse withSpraddrSeqno(Double spraddrSeqno) {
        this.spraddrSeqno = spraddrSeqno;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine2")
    public String getSpraddrStreetLine2() {
        return spraddrStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine2")
    public void setSpraddrStreetLine2(String spraddrStreetLine2) {
        this.spraddrStreetLine2 = spraddrStreetLine2;
    }

    public GuardianInformation100GetResponse withSpraddrStreetLine2(String spraddrStreetLine2) {
        this.spraddrStreetLine2 = spraddrStreetLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine1")
    public String getSpraddrStreetLine1() {
        return spraddrStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("spraddrStreetLine1")
    public void setSpraddrStreetLine1(String spraddrStreetLine1) {
        this.spraddrStreetLine1 = spraddrStreetLine1;
    }

    public GuardianInformation100GetResponse withSpraddrStreetLine1(String spraddrStreetLine1) {
        this.spraddrStreetLine1 = spraddrStreetLine1;
        return this;
    }

    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public GuardianInformation100GetResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    public String getSpraddrNatnCode() {
        return spraddrNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    public void setSpraddrNatnCode(String spraddrNatnCode) {
        this.spraddrNatnCode = spraddrNatnCode;
    }

    public GuardianInformation100GetResponse withSpraddrNatnCode(String spraddrNatnCode) {
        this.spraddrNatnCode = spraddrNatnCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("spraddrStatCode")
    public String getSpraddrStatCode() {
        return spraddrStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("spraddrStatCode")
    public void setSpraddrStatCode(String spraddrStatCode) {
        this.spraddrStatCode = spraddrStatCode;
    }

    public GuardianInformation100GetResponse withSpraddrStatCode(String spraddrStatCode) {
        this.spraddrStatCode = spraddrStatCode;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    public String getParentFirst() {
        return parentFirst;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    public void setParentFirst(String parentFirst) {
        this.parentFirst = parentFirst;
    }

    public GuardianInformation100GetResponse withParentFirst(String parentFirst) {
        this.parentFirst = parentFirst;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public GuardianInformation100GetResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    @JsonProperty("stvnatnDesc")
    public String getStvnatnDesc() {
        return stvnatnDesc;
    }

    @JsonProperty("stvnatnDesc")
    public void setStvnatnDesc(String stvnatnDesc) {
        this.stvnatnDesc = stvnatnDesc;
    }

    public GuardianInformation100GetResponse withStvnatnDesc(String stvnatnDesc) {
        this.stvnatnDesc = stvnatnDesc;
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

    public GuardianInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GuardianInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("spraddrAsrcCode");
        sb.append('=');
        sb.append(((this.spraddrAsrcCode == null)?"<null>":this.spraddrAsrcCode));
        sb.append(',');
        sb.append("spraddrToDate");
        sb.append('=');
        sb.append(((this.spraddrToDate == null)?"<null>":this.spraddrToDate));
        sb.append(',');
        sb.append("parentLast");
        sb.append('=');
        sb.append(((this.parentLast == null)?"<null>":this.parentLast));
        sb.append(',');
        sb.append("addrMsg");
        sb.append('=');
        sb.append(((this.addrMsg == null)?"<null>":this.addrMsg));
        sb.append(',');
        sb.append("stvatypDesc");
        sb.append('=');
        sb.append(((this.stvatypDesc == null)?"<null>":this.stvatypDesc));
        sb.append(',');
        sb.append("spraddrHouseNumber");
        sb.append('=');
        sb.append(((this.spraddrHouseNumber == null)?"<null>":this.spraddrHouseNumber));
        sb.append(',');
        sb.append("spraddrZip");
        sb.append('=');
        sb.append(((this.spraddrZip == null)?"<null>":this.spraddrZip));
        sb.append(',');
        sb.append("spraddrCity");
        sb.append('=');
        sb.append(((this.spraddrCity == null)?"<null>":this.spraddrCity));
        sb.append(',');
        sb.append("parentEmployer");
        sb.append('=');
        sb.append(((this.parentEmployer == null)?"<null>":this.parentEmployer));
        sb.append(',');
        sb.append("stvreltDesc");
        sb.append('=');
        sb.append(((this.stvreltDesc == null)?"<null>":this.stvreltDesc));
        sb.append(',');
        sb.append("parentNamePrefix");
        sb.append('=');
        sb.append(((this.parentNamePrefix == null)?"<null>":this.parentNamePrefix));
        sb.append(',');
        sb.append("stvcntyDesc");
        sb.append('=');
        sb.append(((this.stvcntyDesc == null)?"<null>":this.stvcntyDesc));
        sb.append(',');
        sb.append("phoneExists");
        sb.append('=');
        sb.append(((this.phoneExists == null)?"<null>":this.phoneExists));
        sb.append(',');
        sb.append("spraddrCntyCode");
        sb.append('=');
        sb.append(((this.spraddrCntyCode == null)?"<null>":this.spraddrCntyCode));
        sb.append(',');
        sb.append("spraddrFromDate");
        sb.append('=');
        sb.append(((this.spraddrFromDate == null)?"<null>":this.spraddrFromDate));
        sb.append(',');
        sb.append("deceasedInd");
        sb.append('=');
        sb.append(((this.deceasedInd == null)?"<null>":this.deceasedInd));
        sb.append(',');
        sb.append("parentNameSuffix");
        sb.append('=');
        sb.append(((this.parentNameSuffix == null)?"<null>":this.parentNameSuffix));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("reltCode");
        sb.append('=');
        sb.append(((this.reltCode == null)?"<null>":this.reltCode));
        sb.append(',');
        sb.append("parentDegree");
        sb.append('=');
        sb.append(((this.parentDegree == null)?"<null>":this.parentDegree));
        sb.append(',');
        sb.append("stvstatDesc");
        sb.append('=');
        sb.append(((this.stvstatDesc == null)?"<null>":this.stvstatDesc));
        sb.append(',');
        sb.append("parentMi");
        sb.append('=');
        sb.append(((this.parentMi == null)?"<null>":this.parentMi));
        sb.append(',');
        sb.append("parentJobTitle");
        sb.append('=');
        sb.append(((this.parentJobTitle == null)?"<null>":this.parentJobTitle));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("phoneCountryCode");
        sb.append('=');
        sb.append(((this.phoneCountryCode == null)?"<null>":this.phoneCountryCode));
        sb.append(',');
        sb.append("spraddrStreetLine4");
        sb.append('=');
        sb.append(((this.spraddrStreetLine4 == null)?"<null>":this.spraddrStreetLine4));
        sb.append(',');
        sb.append("spraddrStreetLine3");
        sb.append('=');
        sb.append(((this.spraddrStreetLine3 == null)?"<null>":this.spraddrStreetLine3));
        sb.append(',');
        sb.append("spraddrSeqno");
        sb.append('=');
        sb.append(((this.spraddrSeqno == null)?"<null>":this.spraddrSeqno));
        sb.append(',');
        sb.append("spraddrStreetLine2");
        sb.append('=');
        sb.append(((this.spraddrStreetLine2 == null)?"<null>":this.spraddrStreetLine2));
        sb.append(',');
        sb.append("spraddrStreetLine1");
        sb.append('=');
        sb.append(((this.spraddrStreetLine1 == null)?"<null>":this.spraddrStreetLine1));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("spraddrNatnCode");
        sb.append('=');
        sb.append(((this.spraddrNatnCode == null)?"<null>":this.spraddrNatnCode));
        sb.append(',');
        sb.append("spraddrStatCode");
        sb.append('=');
        sb.append(((this.spraddrStatCode == null)?"<null>":this.spraddrStatCode));
        sb.append(',');
        sb.append("parentFirst");
        sb.append('=');
        sb.append(((this.parentFirst == null)?"<null>":this.parentFirst));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("stvnatnDesc");
        sb.append('=');
        sb.append(((this.stvnatnDesc == null)?"<null>":this.stvnatnDesc));
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
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.spraddrAsrcCode == null)? 0 :this.spraddrAsrcCode.hashCode()));
        result = ((result* 31)+((this.spraddrToDate == null)? 0 :this.spraddrToDate.hashCode()));
        result = ((result* 31)+((this.parentLast == null)? 0 :this.parentLast.hashCode()));
        result = ((result* 31)+((this.addrMsg == null)? 0 :this.addrMsg.hashCode()));
        result = ((result* 31)+((this.stvatypDesc == null)? 0 :this.stvatypDesc.hashCode()));
        result = ((result* 31)+((this.spraddrHouseNumber == null)? 0 :this.spraddrHouseNumber.hashCode()));
        result = ((result* 31)+((this.spraddrZip == null)? 0 :this.spraddrZip.hashCode()));
        result = ((result* 31)+((this.spraddrCity == null)? 0 :this.spraddrCity.hashCode()));
        result = ((result* 31)+((this.parentEmployer == null)? 0 :this.parentEmployer.hashCode()));
        result = ((result* 31)+((this.stvreltDesc == null)? 0 :this.stvreltDesc.hashCode()));
        result = ((result* 31)+((this.parentNamePrefix == null)? 0 :this.parentNamePrefix.hashCode()));
        result = ((result* 31)+((this.stvcntyDesc == null)? 0 :this.stvcntyDesc.hashCode()));
        result = ((result* 31)+((this.phoneExists == null)? 0 :this.phoneExists.hashCode()));
        result = ((result* 31)+((this.spraddrCntyCode == null)? 0 :this.spraddrCntyCode.hashCode()));
        result = ((result* 31)+((this.spraddrFromDate == null)? 0 :this.spraddrFromDate.hashCode()));
        result = ((result* 31)+((this.deceasedInd == null)? 0 :this.deceasedInd.hashCode()));
        result = ((result* 31)+((this.parentNameSuffix == null)? 0 :this.parentNameSuffix.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.reltCode == null)? 0 :this.reltCode.hashCode()));
        result = ((result* 31)+((this.parentDegree == null)? 0 :this.parentDegree.hashCode()));
        result = ((result* 31)+((this.stvstatDesc == null)? 0 :this.stvstatDesc.hashCode()));
        result = ((result* 31)+((this.parentMi == null)? 0 :this.parentMi.hashCode()));
        result = ((result* 31)+((this.parentJobTitle == null)? 0 :this.parentJobTitle.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.phoneCountryCode == null)? 0 :this.phoneCountryCode.hashCode()));
        result = ((result* 31)+((this.spraddrStreetLine4 == null)? 0 :this.spraddrStreetLine4 .hashCode()));
        result = ((result* 31)+((this.spraddrStreetLine3 == null)? 0 :this.spraddrStreetLine3 .hashCode()));
        result = ((result* 31)+((this.spraddrSeqno == null)? 0 :this.spraddrSeqno.hashCode()));
        result = ((result* 31)+((this.spraddrStreetLine2 == null)? 0 :this.spraddrStreetLine2 .hashCode()));
        result = ((result* 31)+((this.spraddrStreetLine1 == null)? 0 :this.spraddrStreetLine1 .hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.spraddrNatnCode == null)? 0 :this.spraddrNatnCode.hashCode()));
        result = ((result* 31)+((this.spraddrStatCode == null)? 0 :this.spraddrStatCode.hashCode()));
        result = ((result* 31)+((this.parentFirst == null)? 0 :this.parentFirst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.stvnatnDesc == null)? 0 :this.stvnatnDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GuardianInformation100GetResponse) == false) {
            return false;
        }
        GuardianInformation100GetResponse rhs = ((GuardianInformation100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix)))&&((this.spraddrAsrcCode == rhs.spraddrAsrcCode)||((this.spraddrAsrcCode!= null)&&this.spraddrAsrcCode.equals(rhs.spraddrAsrcCode))))&&((this.spraddrToDate == rhs.spraddrToDate)||((this.spraddrToDate!= null)&&this.spraddrToDate.equals(rhs.spraddrToDate))))&&((this.parentLast == rhs.parentLast)||((this.parentLast!= null)&&this.parentLast.equals(rhs.parentLast))))&&((this.addrMsg == rhs.addrMsg)||((this.addrMsg!= null)&&this.addrMsg.equals(rhs.addrMsg))))&&((this.stvatypDesc == rhs.stvatypDesc)||((this.stvatypDesc!= null)&&this.stvatypDesc.equals(rhs.stvatypDesc))))&&((this.spraddrHouseNumber == rhs.spraddrHouseNumber)||((this.spraddrHouseNumber!= null)&&this.spraddrHouseNumber.equals(rhs.spraddrHouseNumber))))&&((this.spraddrZip == rhs.spraddrZip)||((this.spraddrZip!= null)&&this.spraddrZip.equals(rhs.spraddrZip))))&&((this.spraddrCity == rhs.spraddrCity)||((this.spraddrCity!= null)&&this.spraddrCity.equals(rhs.spraddrCity))))&&((this.parentEmployer == rhs.parentEmployer)||((this.parentEmployer!= null)&&this.parentEmployer.equals(rhs.parentEmployer))))&&((this.stvreltDesc == rhs.stvreltDesc)||((this.stvreltDesc!= null)&&this.stvreltDesc.equals(rhs.stvreltDesc))))&&((this.parentNamePrefix == rhs.parentNamePrefix)||((this.parentNamePrefix!= null)&&this.parentNamePrefix.equals(rhs.parentNamePrefix))))&&((this.stvcntyDesc == rhs.stvcntyDesc)||((this.stvcntyDesc!= null)&&this.stvcntyDesc.equals(rhs.stvcntyDesc))))&&((this.phoneExists == rhs.phoneExists)||((this.phoneExists!= null)&&this.phoneExists.equals(rhs.phoneExists))))&&((this.spraddrCntyCode == rhs.spraddrCntyCode)||((this.spraddrCntyCode!= null)&&this.spraddrCntyCode.equals(rhs.spraddrCntyCode))))&&((this.spraddrFromDate == rhs.spraddrFromDate)||((this.spraddrFromDate!= null)&&this.spraddrFromDate.equals(rhs.spraddrFromDate))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))))&&((this.parentNameSuffix == rhs.parentNameSuffix)||((this.parentNameSuffix!= null)&&this.parentNameSuffix.equals(rhs.parentNameSuffix))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.reltCode == rhs.reltCode)||((this.reltCode!= null)&&this.reltCode.equals(rhs.reltCode))))&&((this.parentDegree == rhs.parentDegree)||((this.parentDegree!= null)&&this.parentDegree.equals(rhs.parentDegree))))&&((this.stvstatDesc == rhs.stvstatDesc)||((this.stvstatDesc!= null)&&this.stvstatDesc.equals(rhs.stvstatDesc))))&&((this.parentMi == rhs.parentMi)||((this.parentMi!= null)&&this.parentMi.equals(rhs.parentMi))))&&((this.parentJobTitle == rhs.parentJobTitle)||((this.parentJobTitle!= null)&&this.parentJobTitle.equals(rhs.parentJobTitle))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.phoneCountryCode == rhs.phoneCountryCode)||((this.phoneCountryCode!= null)&&this.phoneCountryCode.equals(rhs.phoneCountryCode))))&&((this.spraddrStreetLine4 == rhs.spraddrStreetLine4)||((this.spraddrStreetLine4 != null)&&this.spraddrStreetLine4 .equals(rhs.spraddrStreetLine4))))&&((this.spraddrStreetLine3 == rhs.spraddrStreetLine3)||((this.spraddrStreetLine3 != null)&&this.spraddrStreetLine3 .equals(rhs.spraddrStreetLine3))))&&((this.spraddrSeqno == rhs.spraddrSeqno)||((this.spraddrSeqno!= null)&&this.spraddrSeqno.equals(rhs.spraddrSeqno))))&&((this.spraddrStreetLine2 == rhs.spraddrStreetLine2)||((this.spraddrStreetLine2 != null)&&this.spraddrStreetLine2 .equals(rhs.spraddrStreetLine2))))&&((this.spraddrStreetLine1 == rhs.spraddrStreetLine1)||((this.spraddrStreetLine1 != null)&&this.spraddrStreetLine1 .equals(rhs.spraddrStreetLine1))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.spraddrNatnCode == rhs.spraddrNatnCode)||((this.spraddrNatnCode!= null)&&this.spraddrNatnCode.equals(rhs.spraddrNatnCode))))&&((this.spraddrStatCode == rhs.spraddrStatCode)||((this.spraddrStatCode!= null)&&this.spraddrStatCode.equals(rhs.spraddrStatCode))))&&((this.parentFirst == rhs.parentFirst)||((this.parentFirst!= null)&&this.parentFirst.equals(rhs.parentFirst))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.stvnatnDesc == rhs.stvnatnDesc)||((this.stvnatnDesc!= null)&&this.stvnatnDesc.equals(rhs.stvnatnDesc))));
    }

}
