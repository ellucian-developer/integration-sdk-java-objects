
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
    "criteria.surnamePrefix",
    "criteria.atypCode",
    "criteria.spraddrStatCode",
    "criteria.spraddrNatnCode",
    "parentLast",
    "criteria.spraddrHouseNumber",
    "criteria.stvstatDesc",
    "criteria.spraddrCity",
    "criteria.phoneExt",
    "parentEmployer",
    "criteria.parentEmployer",
    "parentNamePrefix",
    "id",
    "criteria.phoneExists",
    "deceasedInd",
    "parentNameSuffix",
    "criteria.spraddrCntyCode",
    "criteria.parentNamePrefix",
    "criteria.parentLast",
    "criteria.parentJobTitle",
    "criteria.spraddrToDate",
    "criteria.parentNameSuffix",
    "criteria.parentFirst",
    "criteria.phoneNumber",
    "parentFirst",
    "criteria.addrMsg",
    "surnamePrefix",
    "criteria.phoneCountryCode",
    "criteria.phoneArea",
    "criteria.spraddrStreetLine1",
    "criteria.teleCode",
    "criteria.stvreltDesc",
    "criteria.spraddrStreetLine4",
    "criteria.spraddrStreetLine3",
    "criteria.spraddrAsrcCode",
    "criteria.spraddrStreetLine2",
    "criteria.stvcntyDesc",
    "criteria.deceasedInd",
    "reltCode",
    "criteria.spraddrSeqno",
    "criteria.stvatypDesc",
    "parentDegree",
    "parentMi",
    "parentJobTitle",
    "criteria.spraddrZip",
    "criteria.reltCode",
    "criteria.spraddrFromDate",
    "criteria.parentDegree",
    "criteria.parentMi",
    "atypCode",
    "criteria.stvnatnDesc"
})
@Generated("jsonschema2pojo")
public class GuardianInformation100PutRequest {

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_SURNAME_PREFIX")
    private String criteriaSurnamePrefix;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteriaAtypCode;
    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.spraddrStatCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvstat")
    private String criteriaSpraddrStatCode;
    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.spraddrNatnCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvnatn")
    private String criteriaSpraddrNatnCode;
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
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrHouseNumber")
    private String criteriaSpraddrHouseNumber;
    @JsonProperty("criteria.stvstatDesc")
    private String criteriaStvstatDesc;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrCity")
    private String criteriaSpraddrCity;
    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneExt")
    private String criteriaPhoneExt;
    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_EMPLOYER")
    private String parentEmployer;
    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("criteria.parentEmployer")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_EMPLOYER")
    private String criteriaParentEmployer;
    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_PREFIX")
    private String parentNamePrefix;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    @JsonProperty("criteria.phoneExists")
    private String criteriaPhoneExists;
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
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.spraddrCntyCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcnty")
    private String criteriaSpraddrCntyCode;
    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.parentNamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_PREFIX")
    private String criteriaParentNamePrefix;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentLast")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_LAST")
    private String criteriaParentLast;
    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("criteria.parentJobTitle")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_JOB_TITLE")
    private String criteriaParentJobTitle;
    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrToDate")
    private Date criteriaSpraddrToDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.parentNameSuffix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX")
    private String criteriaParentNameSuffix;
    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentFirst")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_FIRST")
    private String criteriaParentFirst;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    private String criteriaPhoneNumber;
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
    @JsonProperty("criteria.addrMsg")
    private String criteriaAddrMsg;
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
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneCountryCode")
    private String criteriaPhoneCountryCode;
    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneArea")
    private String criteriaPhoneArea;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine1")
    private String criteriaSpraddrStreetLine1;
    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.teleCode")
    private String criteriaTeleCode;
    @JsonProperty("criteria.stvreltDesc")
    private String criteriaStvreltDesc;
    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine4")
    private String criteriaSpraddrStreetLine4;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine3")
    private String criteriaSpraddrStreetLine3;
    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.spraddrAsrcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvasrc")
    private String criteriaSpraddrAsrcCode;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine2")
    private String criteriaSpraddrStreetLine2;
    @JsonProperty("criteria.stvcntyDesc")
    private String criteriaStvcntyDesc;
    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("criteria.deceasedInd")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_DECEASED_IND")
    private String criteriaDeceasedInd;
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
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrSeqno")
    private Double criteriaSpraddrSeqno;
    @JsonProperty("criteria.stvatypDesc")
    private String criteriaStvatypDesc;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_DEGREE")
    private String parentDegree;
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
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrZip")
    private String criteriaSpraddrZip;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("criteria.reltCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt")
    private String criteriaReltCode;
    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrFromDate")
    private Date criteriaSpraddrFromDate;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("criteria.parentDegree")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_DEGREE")
    private String criteriaParentDegree;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("criteria.parentMi")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_MI")
    private String criteriaParentMi;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonProperty("criteria.stvnatnDesc")
    private String criteriaStvnatnDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    public String getCriteriaSurnamePrefix() {
        return criteriaSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.surnamePrefix")
    public void setCriteriaSurnamePrefix(String criteriaSurnamePrefix) {
        this.criteriaSurnamePrefix = criteriaSurnamePrefix;
    }

    public GuardianInformation100PutRequest withCriteriaSurnamePrefix(String criteriaSurnamePrefix) {
        this.criteriaSurnamePrefix = criteriaSurnamePrefix;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public GuardianInformation100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.spraddrStatCode")
    public String getCriteriaSpraddrStatCode() {
        return criteriaSpraddrStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.spraddrStatCode")
    public void setCriteriaSpraddrStatCode(String criteriaSpraddrStatCode) {
        this.criteriaSpraddrStatCode = criteriaSpraddrStatCode;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrStatCode(String criteriaSpraddrStatCode) {
        this.criteriaSpraddrStatCode = criteriaSpraddrStatCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.spraddrNatnCode")
    public String getCriteriaSpraddrNatnCode() {
        return criteriaSpraddrNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.spraddrNatnCode")
    public void setCriteriaSpraddrNatnCode(String criteriaSpraddrNatnCode) {
        this.criteriaSpraddrNatnCode = criteriaSpraddrNatnCode;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrNatnCode(String criteriaSpraddrNatnCode) {
        this.criteriaSpraddrNatnCode = criteriaSpraddrNatnCode;
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

    public GuardianInformation100PutRequest withParentLast(String parentLast) {
        this.parentLast = parentLast;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrHouseNumber")
    public String getCriteriaSpraddrHouseNumber() {
        return criteriaSpraddrHouseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrHouseNumber")
    public void setCriteriaSpraddrHouseNumber(String criteriaSpraddrHouseNumber) {
        this.criteriaSpraddrHouseNumber = criteriaSpraddrHouseNumber;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrHouseNumber(String criteriaSpraddrHouseNumber) {
        this.criteriaSpraddrHouseNumber = criteriaSpraddrHouseNumber;
        return this;
    }

    @JsonProperty("criteria.stvstatDesc")
    public String getCriteriaStvstatDesc() {
        return criteriaStvstatDesc;
    }

    @JsonProperty("criteria.stvstatDesc")
    public void setCriteriaStvstatDesc(String criteriaStvstatDesc) {
        this.criteriaStvstatDesc = criteriaStvstatDesc;
    }

    public GuardianInformation100PutRequest withCriteriaStvstatDesc(String criteriaStvstatDesc) {
        this.criteriaStvstatDesc = criteriaStvstatDesc;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrCity")
    public String getCriteriaSpraddrCity() {
        return criteriaSpraddrCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrCity")
    public void setCriteriaSpraddrCity(String criteriaSpraddrCity) {
        this.criteriaSpraddrCity = criteriaSpraddrCity;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrCity(String criteriaSpraddrCity) {
        this.criteriaSpraddrCity = criteriaSpraddrCity;
        return this;
    }

    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Phone EXT
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public GuardianInformation100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
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

    public GuardianInformation100PutRequest withParentEmployer(String parentEmployer) {
        this.parentEmployer = parentEmployer;
        return this;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("criteria.parentEmployer")
    public String getCriteriaParentEmployer() {
        return criteriaParentEmployer;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("criteria.parentEmployer")
    public void setCriteriaParentEmployer(String criteriaParentEmployer) {
        this.criteriaParentEmployer = criteriaParentEmployer;
    }

    public GuardianInformation100PutRequest withCriteriaParentEmployer(String criteriaParentEmployer) {
        this.criteriaParentEmployer = criteriaParentEmployer;
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

    public GuardianInformation100PutRequest withParentNamePrefix(String parentNamePrefix) {
        this.parentNamePrefix = parentNamePrefix;
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

    public GuardianInformation100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("criteria.phoneExists")
    public String getCriteriaPhoneExists() {
        return criteriaPhoneExists;
    }

    @JsonProperty("criteria.phoneExists")
    public void setCriteriaPhoneExists(String criteriaPhoneExists) {
        this.criteriaPhoneExists = criteriaPhoneExists;
    }

    public GuardianInformation100PutRequest withCriteriaPhoneExists(String criteriaPhoneExists) {
        this.criteriaPhoneExists = criteriaPhoneExists;
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

    public GuardianInformation100PutRequest withDeceasedInd(String deceasedInd) {
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

    public GuardianInformation100PutRequest withParentNameSuffix(String parentNameSuffix) {
        this.parentNameSuffix = parentNameSuffix;
        return this;
    }

    /**
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.spraddrCntyCode")
    public String getCriteriaSpraddrCntyCode() {
        return criteriaSpraddrCntyCode;
    }

    /**
     * County
     * <p>
     * Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.spraddrCntyCode")
    public void setCriteriaSpraddrCntyCode(String criteriaSpraddrCntyCode) {
        this.criteriaSpraddrCntyCode = criteriaSpraddrCntyCode;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrCntyCode(String criteriaSpraddrCntyCode) {
        this.criteriaSpraddrCntyCode = criteriaSpraddrCntyCode;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.parentNamePrefix")
    public String getCriteriaParentNamePrefix() {
        return criteriaParentNamePrefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.parentNamePrefix")
    public void setCriteriaParentNamePrefix(String criteriaParentNamePrefix) {
        this.criteriaParentNamePrefix = criteriaParentNamePrefix;
    }

    public GuardianInformation100PutRequest withCriteriaParentNamePrefix(String criteriaParentNamePrefix) {
        this.criteriaParentNamePrefix = criteriaParentNamePrefix;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentLast")
    public String getCriteriaParentLast() {
        return criteriaParentLast;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentLast")
    public void setCriteriaParentLast(String criteriaParentLast) {
        this.criteriaParentLast = criteriaParentLast;
    }

    public GuardianInformation100PutRequest withCriteriaParentLast(String criteriaParentLast) {
        this.criteriaParentLast = criteriaParentLast;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("criteria.parentJobTitle")
    public String getCriteriaParentJobTitle() {
        return criteriaParentJobTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("criteria.parentJobTitle")
    public void setCriteriaParentJobTitle(String criteriaParentJobTitle) {
        this.criteriaParentJobTitle = criteriaParentJobTitle;
    }

    public GuardianInformation100PutRequest withCriteriaParentJobTitle(String criteriaParentJobTitle) {
        this.criteriaParentJobTitle = criteriaParentJobTitle;
        return this;
    }

    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrToDate")
    public Date getCriteriaSpraddrToDate() {
        return criteriaSpraddrToDate;
    }

    /**
     * To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrToDate")
    public void setCriteriaSpraddrToDate(Date criteriaSpraddrToDate) {
        this.criteriaSpraddrToDate = criteriaSpraddrToDate;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrToDate(Date criteriaSpraddrToDate) {
        this.criteriaSpraddrToDate = criteriaSpraddrToDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.parentNameSuffix")
    public String getCriteriaParentNameSuffix() {
        return criteriaParentNameSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.parentNameSuffix")
    public void setCriteriaParentNameSuffix(String criteriaParentNameSuffix) {
        this.criteriaParentNameSuffix = criteriaParentNameSuffix;
    }

    public GuardianInformation100PutRequest withCriteriaParentNameSuffix(String criteriaParentNameSuffix) {
        this.criteriaParentNameSuffix = criteriaParentNameSuffix;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentFirst")
    public String getCriteriaParentFirst() {
        return criteriaParentFirst;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("criteria.parentFirst")
    public void setCriteriaParentFirst(String criteriaParentFirst) {
        this.criteriaParentFirst = criteriaParentFirst;
    }

    public GuardianInformation100PutRequest withCriteriaParentFirst(String criteriaParentFirst) {
        this.criteriaParentFirst = criteriaParentFirst;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public String getCriteriaPhoneNumber() {
        return criteriaPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public void setCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
    }

    public GuardianInformation100PutRequest withCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
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

    public GuardianInformation100PutRequest withParentFirst(String parentFirst) {
        this.parentFirst = parentFirst;
        return this;
    }

    @JsonProperty("criteria.addrMsg")
    public String getCriteriaAddrMsg() {
        return criteriaAddrMsg;
    }

    @JsonProperty("criteria.addrMsg")
    public void setCriteriaAddrMsg(String criteriaAddrMsg) {
        this.criteriaAddrMsg = criteriaAddrMsg;
    }

    public GuardianInformation100PutRequest withCriteriaAddrMsg(String criteriaAddrMsg) {
        this.criteriaAddrMsg = criteriaAddrMsg;
        return this;
    }

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

    public GuardianInformation100PutRequest withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneCountryCode")
    public String getCriteriaPhoneCountryCode() {
        return criteriaPhoneCountryCode;
    }

    /**
     * Phone Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneCountryCode")
    public void setCriteriaPhoneCountryCode(String criteriaPhoneCountryCode) {
        this.criteriaPhoneCountryCode = criteriaPhoneCountryCode;
    }

    public GuardianInformation100PutRequest withCriteriaPhoneCountryCode(String criteriaPhoneCountryCode) {
        this.criteriaPhoneCountryCode = criteriaPhoneCountryCode;
        return this;
    }

    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Phone Area
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public GuardianInformation100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine1")
    public String getCriteriaSpraddrStreetLine1() {
        return criteriaSpraddrStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine1")
    public void setCriteriaSpraddrStreetLine1(String criteriaSpraddrStreetLine1) {
        this.criteriaSpraddrStreetLine1 = criteriaSpraddrStreetLine1;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrStreetLine1(String criteriaSpraddrStreetLine1) {
        this.criteriaSpraddrStreetLine1 = criteriaSpraddrStreetLine1;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.teleCode")
    public String getCriteriaTeleCode() {
        return criteriaTeleCode;
    }

    /**
     * Telephone Type
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.teleCode")
    public void setCriteriaTeleCode(String criteriaTeleCode) {
        this.criteriaTeleCode = criteriaTeleCode;
    }

    public GuardianInformation100PutRequest withCriteriaTeleCode(String criteriaTeleCode) {
        this.criteriaTeleCode = criteriaTeleCode;
        return this;
    }

    @JsonProperty("criteria.stvreltDesc")
    public String getCriteriaStvreltDesc() {
        return criteriaStvreltDesc;
    }

    @JsonProperty("criteria.stvreltDesc")
    public void setCriteriaStvreltDesc(String criteriaStvreltDesc) {
        this.criteriaStvreltDesc = criteriaStvreltDesc;
    }

    public GuardianInformation100PutRequest withCriteriaStvreltDesc(String criteriaStvreltDesc) {
        this.criteriaStvreltDesc = criteriaStvreltDesc;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine4")
    public String getCriteriaSpraddrStreetLine4() {
        return criteriaSpraddrStreetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine4")
    public void setCriteriaSpraddrStreetLine4(String criteriaSpraddrStreetLine4) {
        this.criteriaSpraddrStreetLine4 = criteriaSpraddrStreetLine4;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrStreetLine4(String criteriaSpraddrStreetLine4) {
        this.criteriaSpraddrStreetLine4 = criteriaSpraddrStreetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine3")
    public String getCriteriaSpraddrStreetLine3() {
        return criteriaSpraddrStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine3")
    public void setCriteriaSpraddrStreetLine3(String criteriaSpraddrStreetLine3) {
        this.criteriaSpraddrStreetLine3 = criteriaSpraddrStreetLine3;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrStreetLine3(String criteriaSpraddrStreetLine3) {
        this.criteriaSpraddrStreetLine3 = criteriaSpraddrStreetLine3;
        return this;
    }

    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.spraddrAsrcCode")
    public String getCriteriaSpraddrAsrcCode() {
        return criteriaSpraddrAsrcCode;
    }

    /**
     * Source
     * <p>
     * Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.spraddrAsrcCode")
    public void setCriteriaSpraddrAsrcCode(String criteriaSpraddrAsrcCode) {
        this.criteriaSpraddrAsrcCode = criteriaSpraddrAsrcCode;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrAsrcCode(String criteriaSpraddrAsrcCode) {
        this.criteriaSpraddrAsrcCode = criteriaSpraddrAsrcCode;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine2")
    public String getCriteriaSpraddrStreetLine2() {
        return criteriaSpraddrStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrStreetLine2")
    public void setCriteriaSpraddrStreetLine2(String criteriaSpraddrStreetLine2) {
        this.criteriaSpraddrStreetLine2 = criteriaSpraddrStreetLine2;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrStreetLine2(String criteriaSpraddrStreetLine2) {
        this.criteriaSpraddrStreetLine2 = criteriaSpraddrStreetLine2;
        return this;
    }

    @JsonProperty("criteria.stvcntyDesc")
    public String getCriteriaStvcntyDesc() {
        return criteriaStvcntyDesc;
    }

    @JsonProperty("criteria.stvcntyDesc")
    public void setCriteriaStvcntyDesc(String criteriaStvcntyDesc) {
        this.criteriaStvcntyDesc = criteriaStvcntyDesc;
    }

    public GuardianInformation100PutRequest withCriteriaStvcntyDesc(String criteriaStvcntyDesc) {
        this.criteriaStvcntyDesc = criteriaStvcntyDesc;
        return this;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("criteria.deceasedInd")
    public String getCriteriaDeceasedInd() {
        return criteriaDeceasedInd;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("criteria.deceasedInd")
    public void setCriteriaDeceasedInd(String criteriaDeceasedInd) {
        this.criteriaDeceasedInd = criteriaDeceasedInd;
    }

    public GuardianInformation100PutRequest withCriteriaDeceasedInd(String criteriaDeceasedInd) {
        this.criteriaDeceasedInd = criteriaDeceasedInd;
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

    public GuardianInformation100PutRequest withReltCode(String reltCode) {
        this.reltCode = reltCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrSeqno")
    public Double getCriteriaSpraddrSeqno() {
        return criteriaSpraddrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrSeqno")
    public void setCriteriaSpraddrSeqno(Double criteriaSpraddrSeqno) {
        this.criteriaSpraddrSeqno = criteriaSpraddrSeqno;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrSeqno(Double criteriaSpraddrSeqno) {
        this.criteriaSpraddrSeqno = criteriaSpraddrSeqno;
        return this;
    }

    @JsonProperty("criteria.stvatypDesc")
    public String getCriteriaStvatypDesc() {
        return criteriaStvatypDesc;
    }

    @JsonProperty("criteria.stvatypDesc")
    public void setCriteriaStvatypDesc(String criteriaStvatypDesc) {
        this.criteriaStvatypDesc = criteriaStvatypDesc;
    }

    public GuardianInformation100PutRequest withCriteriaStvatypDesc(String criteriaStvatypDesc) {
        this.criteriaStvatypDesc = criteriaStvatypDesc;
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

    public GuardianInformation100PutRequest withParentDegree(String parentDegree) {
        this.parentDegree = parentDegree;
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

    public GuardianInformation100PutRequest withParentMi(String parentMi) {
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

    public GuardianInformation100PutRequest withParentJobTitle(String parentJobTitle) {
        this.parentJobTitle = parentJobTitle;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrZip")
    public String getCriteriaSpraddrZip() {
        return criteriaSpraddrZip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrZip")
    public void setCriteriaSpraddrZip(String criteriaSpraddrZip) {
        this.criteriaSpraddrZip = criteriaSpraddrZip;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrZip(String criteriaSpraddrZip) {
        this.criteriaSpraddrZip = criteriaSpraddrZip;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("criteria.reltCode")
    public String getCriteriaReltCode() {
        return criteriaReltCode;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("criteria.reltCode")
    public void setCriteriaReltCode(String criteriaReltCode) {
        this.criteriaReltCode = criteriaReltCode;
    }

    public GuardianInformation100PutRequest withCriteriaReltCode(String criteriaReltCode) {
        this.criteriaReltCode = criteriaReltCode;
        return this;
    }

    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrFromDate")
    public Date getCriteriaSpraddrFromDate() {
        return criteriaSpraddrFromDate;
    }

    /**
     * From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spraddrFromDate")
    public void setCriteriaSpraddrFromDate(Date criteriaSpraddrFromDate) {
        this.criteriaSpraddrFromDate = criteriaSpraddrFromDate;
    }

    public GuardianInformation100PutRequest withCriteriaSpraddrFromDate(Date criteriaSpraddrFromDate) {
        this.criteriaSpraddrFromDate = criteriaSpraddrFromDate;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("criteria.parentDegree")
    public String getCriteriaParentDegree() {
        return criteriaParentDegree;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("criteria.parentDegree")
    public void setCriteriaParentDegree(String criteriaParentDegree) {
        this.criteriaParentDegree = criteriaParentDegree;
    }

    public GuardianInformation100PutRequest withCriteriaParentDegree(String criteriaParentDegree) {
        this.criteriaParentDegree = criteriaParentDegree;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("criteria.parentMi")
    public String getCriteriaParentMi() {
        return criteriaParentMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("criteria.parentMi")
    public void setCriteriaParentMi(String criteriaParentMi) {
        this.criteriaParentMi = criteriaParentMi;
    }

    public GuardianInformation100PutRequest withCriteriaParentMi(String criteriaParentMi) {
        this.criteriaParentMi = criteriaParentMi;
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

    public GuardianInformation100PutRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    @JsonProperty("criteria.stvnatnDesc")
    public String getCriteriaStvnatnDesc() {
        return criteriaStvnatnDesc;
    }

    @JsonProperty("criteria.stvnatnDesc")
    public void setCriteriaStvnatnDesc(String criteriaStvnatnDesc) {
        this.criteriaStvnatnDesc = criteriaStvnatnDesc;
    }

    public GuardianInformation100PutRequest withCriteriaStvnatnDesc(String criteriaStvnatnDesc) {
        this.criteriaStvnatnDesc = criteriaStvnatnDesc;
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

    public GuardianInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GuardianInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSurnamePrefix");
        sb.append('=');
        sb.append(((this.criteriaSurnamePrefix == null)?"<null>":this.criteriaSurnamePrefix));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaSpraddrStatCode");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStatCode == null)?"<null>":this.criteriaSpraddrStatCode));
        sb.append(',');
        sb.append("criteriaSpraddrNatnCode");
        sb.append('=');
        sb.append(((this.criteriaSpraddrNatnCode == null)?"<null>":this.criteriaSpraddrNatnCode));
        sb.append(',');
        sb.append("parentLast");
        sb.append('=');
        sb.append(((this.parentLast == null)?"<null>":this.parentLast));
        sb.append(',');
        sb.append("criteriaSpraddrHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaSpraddrHouseNumber == null)?"<null>":this.criteriaSpraddrHouseNumber));
        sb.append(',');
        sb.append("criteriaStvstatDesc");
        sb.append('=');
        sb.append(((this.criteriaStvstatDesc == null)?"<null>":this.criteriaStvstatDesc));
        sb.append(',');
        sb.append("criteriaSpraddrCity");
        sb.append('=');
        sb.append(((this.criteriaSpraddrCity == null)?"<null>":this.criteriaSpraddrCity));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("parentEmployer");
        sb.append('=');
        sb.append(((this.parentEmployer == null)?"<null>":this.parentEmployer));
        sb.append(',');
        sb.append("criteriaParentEmployer");
        sb.append('=');
        sb.append(((this.criteriaParentEmployer == null)?"<null>":this.criteriaParentEmployer));
        sb.append(',');
        sb.append("parentNamePrefix");
        sb.append('=');
        sb.append(((this.parentNamePrefix == null)?"<null>":this.parentNamePrefix));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaPhoneExists");
        sb.append('=');
        sb.append(((this.criteriaPhoneExists == null)?"<null>":this.criteriaPhoneExists));
        sb.append(',');
        sb.append("deceasedInd");
        sb.append('=');
        sb.append(((this.deceasedInd == null)?"<null>":this.deceasedInd));
        sb.append(',');
        sb.append("parentNameSuffix");
        sb.append('=');
        sb.append(((this.parentNameSuffix == null)?"<null>":this.parentNameSuffix));
        sb.append(',');
        sb.append("criteriaSpraddrCntyCode");
        sb.append('=');
        sb.append(((this.criteriaSpraddrCntyCode == null)?"<null>":this.criteriaSpraddrCntyCode));
        sb.append(',');
        sb.append("criteriaParentNamePrefix");
        sb.append('=');
        sb.append(((this.criteriaParentNamePrefix == null)?"<null>":this.criteriaParentNamePrefix));
        sb.append(',');
        sb.append("criteriaParentLast");
        sb.append('=');
        sb.append(((this.criteriaParentLast == null)?"<null>":this.criteriaParentLast));
        sb.append(',');
        sb.append("criteriaParentJobTitle");
        sb.append('=');
        sb.append(((this.criteriaParentJobTitle == null)?"<null>":this.criteriaParentJobTitle));
        sb.append(',');
        sb.append("criteriaSpraddrToDate");
        sb.append('=');
        sb.append(((this.criteriaSpraddrToDate == null)?"<null>":this.criteriaSpraddrToDate));
        sb.append(',');
        sb.append("criteriaParentNameSuffix");
        sb.append('=');
        sb.append(((this.criteriaParentNameSuffix == null)?"<null>":this.criteriaParentNameSuffix));
        sb.append(',');
        sb.append("criteriaParentFirst");
        sb.append('=');
        sb.append(((this.criteriaParentFirst == null)?"<null>":this.criteriaParentFirst));
        sb.append(',');
        sb.append("criteriaPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaPhoneNumber == null)?"<null>":this.criteriaPhoneNumber));
        sb.append(',');
        sb.append("parentFirst");
        sb.append('=');
        sb.append(((this.parentFirst == null)?"<null>":this.parentFirst));
        sb.append(',');
        sb.append("criteriaAddrMsg");
        sb.append('=');
        sb.append(((this.criteriaAddrMsg == null)?"<null>":this.criteriaAddrMsg));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("criteriaPhoneCountryCode");
        sb.append('=');
        sb.append(((this.criteriaPhoneCountryCode == null)?"<null>":this.criteriaPhoneCountryCode));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("criteriaSpraddrStreetLine1");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStreetLine1 == null)?"<null>":this.criteriaSpraddrStreetLine1));
        sb.append(',');
        sb.append("criteriaTeleCode");
        sb.append('=');
        sb.append(((this.criteriaTeleCode == null)?"<null>":this.criteriaTeleCode));
        sb.append(',');
        sb.append("criteriaStvreltDesc");
        sb.append('=');
        sb.append(((this.criteriaStvreltDesc == null)?"<null>":this.criteriaStvreltDesc));
        sb.append(',');
        sb.append("criteriaSpraddrStreetLine4");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStreetLine4 == null)?"<null>":this.criteriaSpraddrStreetLine4));
        sb.append(',');
        sb.append("criteriaSpraddrStreetLine3");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStreetLine3 == null)?"<null>":this.criteriaSpraddrStreetLine3));
        sb.append(',');
        sb.append("criteriaSpraddrAsrcCode");
        sb.append('=');
        sb.append(((this.criteriaSpraddrAsrcCode == null)?"<null>":this.criteriaSpraddrAsrcCode));
        sb.append(',');
        sb.append("criteriaSpraddrStreetLine2");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStreetLine2 == null)?"<null>":this.criteriaSpraddrStreetLine2));
        sb.append(',');
        sb.append("criteriaStvcntyDesc");
        sb.append('=');
        sb.append(((this.criteriaStvcntyDesc == null)?"<null>":this.criteriaStvcntyDesc));
        sb.append(',');
        sb.append("criteriaDeceasedInd");
        sb.append('=');
        sb.append(((this.criteriaDeceasedInd == null)?"<null>":this.criteriaDeceasedInd));
        sb.append(',');
        sb.append("reltCode");
        sb.append('=');
        sb.append(((this.reltCode == null)?"<null>":this.reltCode));
        sb.append(',');
        sb.append("criteriaSpraddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaSpraddrSeqno == null)?"<null>":this.criteriaSpraddrSeqno));
        sb.append(',');
        sb.append("criteriaStvatypDesc");
        sb.append('=');
        sb.append(((this.criteriaStvatypDesc == null)?"<null>":this.criteriaStvatypDesc));
        sb.append(',');
        sb.append("parentDegree");
        sb.append('=');
        sb.append(((this.parentDegree == null)?"<null>":this.parentDegree));
        sb.append(',');
        sb.append("parentMi");
        sb.append('=');
        sb.append(((this.parentMi == null)?"<null>":this.parentMi));
        sb.append(',');
        sb.append("parentJobTitle");
        sb.append('=');
        sb.append(((this.parentJobTitle == null)?"<null>":this.parentJobTitle));
        sb.append(',');
        sb.append("criteriaSpraddrZip");
        sb.append('=');
        sb.append(((this.criteriaSpraddrZip == null)?"<null>":this.criteriaSpraddrZip));
        sb.append(',');
        sb.append("criteriaReltCode");
        sb.append('=');
        sb.append(((this.criteriaReltCode == null)?"<null>":this.criteriaReltCode));
        sb.append(',');
        sb.append("criteriaSpraddrFromDate");
        sb.append('=');
        sb.append(((this.criteriaSpraddrFromDate == null)?"<null>":this.criteriaSpraddrFromDate));
        sb.append(',');
        sb.append("criteriaParentDegree");
        sb.append('=');
        sb.append(((this.criteriaParentDegree == null)?"<null>":this.criteriaParentDegree));
        sb.append(',');
        sb.append("criteriaParentMi");
        sb.append('=');
        sb.append(((this.criteriaParentMi == null)?"<null>":this.criteriaParentMi));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("criteriaStvnatnDesc");
        sb.append('=');
        sb.append(((this.criteriaStvnatnDesc == null)?"<null>":this.criteriaStvnatnDesc));
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
        result = ((result* 31)+((this.criteriaStvcntyDesc == null)? 0 :this.criteriaStvcntyDesc.hashCode()));
        result = ((result* 31)+((this.parentLast == null)? 0 :this.parentLast.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrHouseNumber == null)? 0 :this.criteriaSpraddrHouseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaAddrMsg == null)? 0 :this.criteriaAddrMsg.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrToDate == null)? 0 :this.criteriaSpraddrToDate.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrZip == null)? 0 :this.criteriaSpraddrZip.hashCode()));
        result = ((result* 31)+((this.criteriaTeleCode == null)? 0 :this.criteriaTeleCode.hashCode()));
        result = ((result* 31)+((this.parentEmployer == null)? 0 :this.parentEmployer.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExists == null)? 0 :this.criteriaPhoneExists.hashCode()));
        result = ((result* 31)+((this.parentNamePrefix == null)? 0 :this.parentNamePrefix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.deceasedInd == null)? 0 :this.deceasedInd.hashCode()));
        result = ((result* 31)+((this.parentNameSuffix == null)? 0 :this.parentNameSuffix.hashCode()));
        result = ((result* 31)+((this.criteriaParentNamePrefix == null)? 0 :this.criteriaParentNamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrAsrcCode == null)? 0 :this.criteriaSpraddrAsrcCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvstatDesc == null)? 0 :this.criteriaStvstatDesc.hashCode()));
        result = ((result* 31)+((this.criteriaParentEmployer == null)? 0 :this.criteriaParentEmployer.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStreetLine1 == null)? 0 :this.criteriaSpraddrStreetLine1 .hashCode()));
        result = ((result* 31)+((this.criteriaParentMi == null)? 0 :this.criteriaParentMi.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStreetLine4 == null)? 0 :this.criteriaSpraddrStreetLine4 .hashCode()));
        result = ((result* 31)+((this.criteriaReltCode == null)? 0 :this.criteriaReltCode.hashCode()));
        result = ((result* 31)+((this.criteriaParentNameSuffix == null)? 0 :this.criteriaParentNameSuffix.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStreetLine2 == null)? 0 :this.criteriaSpraddrStreetLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaPhoneNumber == null)? 0 :this.criteriaPhoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStreetLine3 == null)? 0 :this.criteriaSpraddrStreetLine3 .hashCode()));
        result = ((result* 31)+((this.parentFirst == null)? 0 :this.parentFirst.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrFromDate == null)? 0 :this.criteriaSpraddrFromDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneCountryCode == null)? 0 :this.criteriaPhoneCountryCode.hashCode()));
        result = ((result* 31)+((this.criteriaParentJobTitle == null)? 0 :this.criteriaParentJobTitle.hashCode()));
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrSeqno == null)? 0 :this.criteriaSpraddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaParentDegree == null)? 0 :this.criteriaParentDegree.hashCode()));
        result = ((result* 31)+((this.criteriaSurnamePrefix == null)? 0 :this.criteriaSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaParentFirst == null)? 0 :this.criteriaParentFirst.hashCode()));
        result = ((result* 31)+((this.criteriaDeceasedInd == null)? 0 :this.criteriaDeceasedInd.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStatCode == null)? 0 :this.criteriaSpraddrStatCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrNatnCode == null)? 0 :this.criteriaSpraddrNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrCity == null)? 0 :this.criteriaSpraddrCity.hashCode()));
        result = ((result* 31)+((this.criteriaStvreltDesc == null)? 0 :this.criteriaStvreltDesc.hashCode()));
        result = ((result* 31)+((this.reltCode == null)? 0 :this.reltCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvnatnDesc == null)? 0 :this.criteriaStvnatnDesc.hashCode()));
        result = ((result* 31)+((this.parentDegree == null)? 0 :this.parentDegree.hashCode()));
        result = ((result* 31)+((this.parentMi == null)? 0 :this.parentMi.hashCode()));
        result = ((result* 31)+((this.parentJobTitle == null)? 0 :this.parentJobTitle.hashCode()));
        result = ((result* 31)+((this.criteriaStvatypDesc == null)? 0 :this.criteriaStvatypDesc.hashCode()));
        result = ((result* 31)+((this.criteriaParentLast == null)? 0 :this.criteriaParentLast.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrCntyCode == null)? 0 :this.criteriaSpraddrCntyCode.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GuardianInformation100PutRequest) == false) {
            return false;
        }
        GuardianInformation100PutRequest rhs = ((GuardianInformation100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaStvcntyDesc == rhs.criteriaStvcntyDesc)||((this.criteriaStvcntyDesc!= null)&&this.criteriaStvcntyDesc.equals(rhs.criteriaStvcntyDesc)))&&((this.parentLast == rhs.parentLast)||((this.parentLast!= null)&&this.parentLast.equals(rhs.parentLast))))&&((this.criteriaSpraddrHouseNumber == rhs.criteriaSpraddrHouseNumber)||((this.criteriaSpraddrHouseNumber!= null)&&this.criteriaSpraddrHouseNumber.equals(rhs.criteriaSpraddrHouseNumber))))&&((this.criteriaAddrMsg == rhs.criteriaAddrMsg)||((this.criteriaAddrMsg!= null)&&this.criteriaAddrMsg.equals(rhs.criteriaAddrMsg))))&&((this.criteriaSpraddrToDate == rhs.criteriaSpraddrToDate)||((this.criteriaSpraddrToDate!= null)&&this.criteriaSpraddrToDate.equals(rhs.criteriaSpraddrToDate))))&&((this.criteriaSpraddrZip == rhs.criteriaSpraddrZip)||((this.criteriaSpraddrZip!= null)&&this.criteriaSpraddrZip.equals(rhs.criteriaSpraddrZip))))&&((this.criteriaTeleCode == rhs.criteriaTeleCode)||((this.criteriaTeleCode!= null)&&this.criteriaTeleCode.equals(rhs.criteriaTeleCode))))&&((this.parentEmployer == rhs.parentEmployer)||((this.parentEmployer!= null)&&this.parentEmployer.equals(rhs.parentEmployer))))&&((this.criteriaPhoneExists == rhs.criteriaPhoneExists)||((this.criteriaPhoneExists!= null)&&this.criteriaPhoneExists.equals(rhs.criteriaPhoneExists))))&&((this.parentNamePrefix == rhs.parentNamePrefix)||((this.parentNamePrefix!= null)&&this.parentNamePrefix.equals(rhs.parentNamePrefix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))))&&((this.parentNameSuffix == rhs.parentNameSuffix)||((this.parentNameSuffix!= null)&&this.parentNameSuffix.equals(rhs.parentNameSuffix))))&&((this.criteriaParentNamePrefix == rhs.criteriaParentNamePrefix)||((this.criteriaParentNamePrefix!= null)&&this.criteriaParentNamePrefix.equals(rhs.criteriaParentNamePrefix))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.criteriaSpraddrAsrcCode == rhs.criteriaSpraddrAsrcCode)||((this.criteriaSpraddrAsrcCode!= null)&&this.criteriaSpraddrAsrcCode.equals(rhs.criteriaSpraddrAsrcCode))))&&((this.criteriaStvstatDesc == rhs.criteriaStvstatDesc)||((this.criteriaStvstatDesc!= null)&&this.criteriaStvstatDesc.equals(rhs.criteriaStvstatDesc))))&&((this.criteriaParentEmployer == rhs.criteriaParentEmployer)||((this.criteriaParentEmployer!= null)&&this.criteriaParentEmployer.equals(rhs.criteriaParentEmployer))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaSpraddrStreetLine1 == rhs.criteriaSpraddrStreetLine1)||((this.criteriaSpraddrStreetLine1 != null)&&this.criteriaSpraddrStreetLine1 .equals(rhs.criteriaSpraddrStreetLine1))))&&((this.criteriaParentMi == rhs.criteriaParentMi)||((this.criteriaParentMi!= null)&&this.criteriaParentMi.equals(rhs.criteriaParentMi))))&&((this.criteriaSpraddrStreetLine4 == rhs.criteriaSpraddrStreetLine4)||((this.criteriaSpraddrStreetLine4 != null)&&this.criteriaSpraddrStreetLine4 .equals(rhs.criteriaSpraddrStreetLine4))))&&((this.criteriaReltCode == rhs.criteriaReltCode)||((this.criteriaReltCode!= null)&&this.criteriaReltCode.equals(rhs.criteriaReltCode))))&&((this.criteriaParentNameSuffix == rhs.criteriaParentNameSuffix)||((this.criteriaParentNameSuffix!= null)&&this.criteriaParentNameSuffix.equals(rhs.criteriaParentNameSuffix))))&&((this.criteriaSpraddrStreetLine2 == rhs.criteriaSpraddrStreetLine2)||((this.criteriaSpraddrStreetLine2 != null)&&this.criteriaSpraddrStreetLine2 .equals(rhs.criteriaSpraddrStreetLine2))))&&((this.criteriaPhoneNumber == rhs.criteriaPhoneNumber)||((this.criteriaPhoneNumber!= null)&&this.criteriaPhoneNumber.equals(rhs.criteriaPhoneNumber))))&&((this.criteriaSpraddrStreetLine3 == rhs.criteriaSpraddrStreetLine3)||((this.criteriaSpraddrStreetLine3 != null)&&this.criteriaSpraddrStreetLine3 .equals(rhs.criteriaSpraddrStreetLine3))))&&((this.parentFirst == rhs.parentFirst)||((this.parentFirst!= null)&&this.parentFirst.equals(rhs.parentFirst))))&&((this.criteriaSpraddrFromDate == rhs.criteriaSpraddrFromDate)||((this.criteriaSpraddrFromDate!= null)&&this.criteriaSpraddrFromDate.equals(rhs.criteriaSpraddrFromDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPhoneCountryCode == rhs.criteriaPhoneCountryCode)||((this.criteriaPhoneCountryCode!= null)&&this.criteriaPhoneCountryCode.equals(rhs.criteriaPhoneCountryCode))))&&((this.criteriaParentJobTitle == rhs.criteriaParentJobTitle)||((this.criteriaParentJobTitle!= null)&&this.criteriaParentJobTitle.equals(rhs.criteriaParentJobTitle))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.criteriaSpraddrSeqno == rhs.criteriaSpraddrSeqno)||((this.criteriaSpraddrSeqno!= null)&&this.criteriaSpraddrSeqno.equals(rhs.criteriaSpraddrSeqno))))&&((this.criteriaParentDegree == rhs.criteriaParentDegree)||((this.criteriaParentDegree!= null)&&this.criteriaParentDegree.equals(rhs.criteriaParentDegree))))&&((this.criteriaSurnamePrefix == rhs.criteriaSurnamePrefix)||((this.criteriaSurnamePrefix!= null)&&this.criteriaSurnamePrefix.equals(rhs.criteriaSurnamePrefix))))&&((this.criteriaParentFirst == rhs.criteriaParentFirst)||((this.criteriaParentFirst!= null)&&this.criteriaParentFirst.equals(rhs.criteriaParentFirst))))&&((this.criteriaDeceasedInd == rhs.criteriaDeceasedInd)||((this.criteriaDeceasedInd!= null)&&this.criteriaDeceasedInd.equals(rhs.criteriaDeceasedInd))))&&((this.criteriaSpraddrStatCode == rhs.criteriaSpraddrStatCode)||((this.criteriaSpraddrStatCode!= null)&&this.criteriaSpraddrStatCode.equals(rhs.criteriaSpraddrStatCode))))&&((this.criteriaSpraddrNatnCode == rhs.criteriaSpraddrNatnCode)||((this.criteriaSpraddrNatnCode!= null)&&this.criteriaSpraddrNatnCode.equals(rhs.criteriaSpraddrNatnCode))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaSpraddrCity == rhs.criteriaSpraddrCity)||((this.criteriaSpraddrCity!= null)&&this.criteriaSpraddrCity.equals(rhs.criteriaSpraddrCity))))&&((this.criteriaStvreltDesc == rhs.criteriaStvreltDesc)||((this.criteriaStvreltDesc!= null)&&this.criteriaStvreltDesc.equals(rhs.criteriaStvreltDesc))))&&((this.reltCode == rhs.reltCode)||((this.reltCode!= null)&&this.reltCode.equals(rhs.reltCode))))&&((this.criteriaStvnatnDesc == rhs.criteriaStvnatnDesc)||((this.criteriaStvnatnDesc!= null)&&this.criteriaStvnatnDesc.equals(rhs.criteriaStvnatnDesc))))&&((this.parentDegree == rhs.parentDegree)||((this.parentDegree!= null)&&this.parentDegree.equals(rhs.parentDegree))))&&((this.parentMi == rhs.parentMi)||((this.parentMi!= null)&&this.parentMi.equals(rhs.parentMi))))&&((this.parentJobTitle == rhs.parentJobTitle)||((this.parentJobTitle!= null)&&this.parentJobTitle.equals(rhs.parentJobTitle))))&&((this.criteriaStvatypDesc == rhs.criteriaStvatypDesc)||((this.criteriaStvatypDesc!= null)&&this.criteriaStvatypDesc.equals(rhs.criteriaStvatypDesc))))&&((this.criteriaParentLast == rhs.criteriaParentLast)||((this.criteriaParentLast!= null)&&this.criteriaParentLast.equals(rhs.criteriaParentLast))))&&((this.criteriaSpraddrCntyCode == rhs.criteriaSpraddrCntyCode)||((this.criteriaSpraddrCntyCode!= null)&&this.criteriaSpraddrCntyCode.equals(rhs.criteriaSpraddrCntyCode))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
