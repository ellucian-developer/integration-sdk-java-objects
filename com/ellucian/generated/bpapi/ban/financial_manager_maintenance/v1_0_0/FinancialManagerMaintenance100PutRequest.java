
package com.ellucian.generated.bpapi.ban.financial_manager_maintenance.v1_0_0;

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
    "criteria.spridenNtypCode",
    "cntyCode",
    "criteria.atypCode",
    "criteria.fromDate",
    "criteria.toDate",
    "criteria.userId",
    "seqNo",
    "criteria.termDate",
    "lastNamePrefix",
    "criteria.coasCode",
    "line3",
    "line2",
    "line1",
    "zip",
    "criteria.effDate",
    "criteria.locnCode",
    "phoneCtry",
    "addressType",
    "criteria.asrcCode",
    "criteria.houseNumber",
    "criteria.title",
    "coas",
    "firstName",
    "criteria.zip",
    "areaCode",
    "criteria.seqno",
    "termDate",
    "SPRADDR.seqNo",
    "criteria.orgnCode",
    "houseNum",
    "phnExt",
    "lastName",
    "criteria.activityDate",
    "criteria.statusInd",
    "carrRoute",
    "city",
    "criteria.addrType",
    "phnNumber",
    "locnCode",
    "title",
    "displayFmgrCode",
    "nameType",
    "criteria.natnCode",
    "orgCode",
    "criteria.city",
    "criteria.addrSeqno",
    "criteria.streetLine1",
    "line4",
    "statCode",
    "criteria.streetLine4",
    "natnCode",
    "criteria.spraddrStatusInd",
    "criteria.streetLine2",
    "criteria.streetLine3",
    "teleCode",
    "criteria.statCode",
    "delPoint",
    "corrDigit",
    "criteria.cntyCode",
    "srcCode",
    "middleName"
})
@Generated("jsonschema2pojo")
public class FinancialManagerMaintenance100PutRequest {

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String criteriaSpridenNtypCode;
    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteriaAtypCode;
    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("criteria.fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_FROM_DATE")
    private Date criteriaFromDate;
    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("criteria.toDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_TO_DATE")
    private Date criteriaToDate;
    /**
     * Lineage reference object : FTVFMGR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_USER_ID")
    private String criteriaUserId;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_SEQNO")
    private Double seqNo;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("Lineage reference object : finMgrSurnamePrefix")
    private Object lastNamePrefix;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("line3")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE3")
    private String line3;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE2")
    private String line2;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE1")
    private String line1;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ZIP")
    private String zip;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCtry")
    private String phoneCtry;
    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addressType;
    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.asrcCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc")
    private String criteriaAsrcCode;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_HOUSE_NUMBER")
    private String criteriaHouseNumber;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TITLE")
    private String criteriaTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coas;
    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : finMgrFirstName")
    private Object firstName;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ZIP")
    private String criteriaZip;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    private String areaCode;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_SEQNO")
    private Double criteriaSeqno;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TERM_DATE")
    private Date termDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("SPRADDR.seqNo")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_SEQNO")
    private Double sPRADDRSeqNo;
    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_HOUSE_NUMBER")
    private String houseNum;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phnExt")
    private String phnExt;
    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : finMgrName")
    private Object lastName;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrRoute")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CARRIER_ROUTE")
    private String carrRoute;
    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CITY")
    private String city;
    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String criteriaAddrType;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phnNumber")
    private String phnNumber;
    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_LOCN_CODE")
    private String locnCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TITLE")
    private String title;
    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    @JsonPropertyDescription("Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr")
    private Object displayFmgrCode;
    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("nameType")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String nameType;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ORGN_CODE")
    private String orgCode;
    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("criteria.city")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CITY")
    private String criteriaCity;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_SEQNO")
    private Double criteriaAddrSeqno;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE1")
    private String criteriaStreetLine1;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("line4")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE4")
    private String line4;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE4")
    private String criteriaStreetLine4;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.spraddrStatusInd")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STATUS_IND")
    private String criteriaSpraddrStatusInd;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE2")
    private String criteriaStreetLine2;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE3")
    private String criteriaStreetLine3;
    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvtele")
    private String teleCode;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat")
    private String criteriaStatCode;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("delPoint")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_DELIVERY_POINT")
    private Double delPoint;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("corrDigit")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CORRECTION_DIGIT")
    private Double corrDigit;
    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String criteriaCntyCode;
    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("srcCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc")
    private String srcCode;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Lineage reference object : finMgrMi")
    private Object middleName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public String getCriteriaSpridenNtypCode() {
        return criteriaSpridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public void setCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public FinancialManagerMaintenance100PutRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("criteria.fromDate")
    public Date getCriteriaFromDate() {
        return criteriaFromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("criteria.fromDate")
    public void setCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("criteria.toDate")
    public Date getCriteriaToDate() {
        return criteriaToDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("criteria.toDate")
    public void setCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
        return this;
    }

    /**
     * Lineage reference object : FTVFMGR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : FTVFMGR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public FinancialManagerMaintenance100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    public Object getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(Object lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public FinancialManagerMaintenance100PutRequest withLastNamePrefix(Object lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("line3")
    public String getLine3() {
        return line3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("line3")
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public FinancialManagerMaintenance100PutRequest withLine3(String line3) {
        this.line3 = line3;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public FinancialManagerMaintenance100PutRequest withLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public FinancialManagerMaintenance100PutRequest withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public FinancialManagerMaintenance100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCtry")
    public String getPhoneCtry() {
        return phoneCtry;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCtry")
    public void setPhoneCtry(String phoneCtry) {
        this.phoneCtry = phoneCtry;
    }

    public FinancialManagerMaintenance100PutRequest withPhoneCtry(String phoneCtry) {
        this.phoneCtry = phoneCtry;
        return this;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public FinancialManagerMaintenance100PutRequest withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.asrcCode")
    public String getCriteriaAsrcCode() {
        return criteriaAsrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("criteria.asrcCode")
    public void setCriteriaAsrcCode(String criteriaAsrcCode) {
        this.criteriaAsrcCode = criteriaAsrcCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaAsrcCode(String criteriaAsrcCode) {
        this.criteriaAsrcCode = criteriaAsrcCode;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public String getCriteriaHouseNumber() {
        return criteriaHouseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public void setCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public FinancialManagerMaintenance100PutRequest withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    public Object getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public FinancialManagerMaintenance100PutRequest withFirstName(Object firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public String getCriteriaZip() {
        return criteriaZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public void setCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public FinancialManagerMaintenance100PutRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public Double getCriteriaSeqno() {
        return criteriaSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public void setCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FinancialManagerMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("SPRADDR.seqNo")
    public Double getSPRADDRSeqNo() {
        return sPRADDRSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("SPRADDR.seqNo")
    public void setSPRADDRSeqNo(Double sPRADDRSeqNo) {
        this.sPRADDRSeqNo = sPRADDRSeqNo;
    }

    public FinancialManagerMaintenance100PutRequest withSPRADDRSeqNo(Double sPRADDRSeqNo) {
        this.sPRADDRSeqNo = sPRADDRSeqNo;
        return this;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    public String getHouseNum() {
        return houseNum;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public FinancialManagerMaintenance100PutRequest withHouseNum(String houseNum) {
        this.houseNum = houseNum;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phnExt")
    public String getPhnExt() {
        return phnExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phnExt")
    public void setPhnExt(String phnExt) {
        this.phnExt = phnExt;
    }

    public FinancialManagerMaintenance100PutRequest withPhnExt(String phnExt) {
        this.phnExt = phnExt;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    public Object getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public FinancialManagerMaintenance100PutRequest withLastName(Object lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrRoute")
    public String getCarrRoute() {
        return carrRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrRoute")
    public void setCarrRoute(String carrRoute) {
        this.carrRoute = carrRoute;
    }

    public FinancialManagerMaintenance100PutRequest withCarrRoute(String carrRoute) {
        this.carrRoute = carrRoute;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public FinancialManagerMaintenance100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    public String getCriteriaAddrType() {
        return criteriaAddrType;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    public void setCriteriaAddrType(String criteriaAddrType) {
        this.criteriaAddrType = criteriaAddrType;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaAddrType(String criteriaAddrType) {
        this.criteriaAddrType = criteriaAddrType;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phnNumber")
    public String getPhnNumber() {
        return phnNumber;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phnNumber")
    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }

    public FinancialManagerMaintenance100PutRequest withPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
        return this;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public FinancialManagerMaintenance100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FinancialManagerMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public Object getDisplayFmgrCode() {
        return displayFmgrCode;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public void setDisplayFmgrCode(Object displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
    }

    public FinancialManagerMaintenance100PutRequest withDisplayFmgrCode(Object displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("nameType")
    public String getNameType() {
        return nameType;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("nameType")
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public FinancialManagerMaintenance100PutRequest withNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgCode")
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgCode")
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public FinancialManagerMaintenance100PutRequest withOrgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public String getCriteriaCity() {
        return criteriaCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public void setCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public Double getCriteriaAddrSeqno() {
        return criteriaAddrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public void setCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    public String getCriteriaStreetLine1() {
        return criteriaStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("criteria.streetLine1")
    public void setCriteriaStreetLine1(String criteriaStreetLine1) {
        this.criteriaStreetLine1 = criteriaStreetLine1;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStreetLine1(String criteriaStreetLine1) {
        this.criteriaStreetLine1 = criteriaStreetLine1;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("line4")
    public String getLine4() {
        return line4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("line4")
    public void setLine4(String line4) {
        this.line4 = line4;
    }

    public FinancialManagerMaintenance100PutRequest withLine4(String line4) {
        this.line4 = line4;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public FinancialManagerMaintenance100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    public String getCriteriaStreetLine4() {
        return criteriaStreetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("criteria.streetLine4")
    public void setCriteriaStreetLine4(String criteriaStreetLine4) {
        this.criteriaStreetLine4 = criteriaStreetLine4;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStreetLine4(String criteriaStreetLine4) {
        this.criteriaStreetLine4 = criteriaStreetLine4;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public FinancialManagerMaintenance100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.spraddrStatusInd")
    public String getCriteriaSpraddrStatusInd() {
        return criteriaSpraddrStatusInd;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("criteria.spraddrStatusInd")
    public void setCriteriaSpraddrStatusInd(String criteriaSpraddrStatusInd) {
        this.criteriaSpraddrStatusInd = criteriaSpraddrStatusInd;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaSpraddrStatusInd(String criteriaSpraddrStatusInd) {
        this.criteriaSpraddrStatusInd = criteriaSpraddrStatusInd;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    public String getCriteriaStreetLine2() {
        return criteriaStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("criteria.streetLine2")
    public void setCriteriaStreetLine2(String criteriaStreetLine2) {
        this.criteriaStreetLine2 = criteriaStreetLine2;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStreetLine2(String criteriaStreetLine2) {
        this.criteriaStreetLine2 = criteriaStreetLine2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    public String getCriteriaStreetLine3() {
        return criteriaStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("criteria.streetLine3")
    public void setCriteriaStreetLine3(String criteriaStreetLine3) {
        this.criteriaStreetLine3 = criteriaStreetLine3;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStreetLine3(String criteriaStreetLine3) {
        this.criteriaStreetLine3 = criteriaStreetLine3;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public FinancialManagerMaintenance100PutRequest withTeleCode(String teleCode) {
        this.teleCode = teleCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public String getCriteriaStatCode() {
        return criteriaStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public void setCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("delPoint")
    public Double getDelPoint() {
        return delPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("delPoint")
    public void setDelPoint(Double delPoint) {
        this.delPoint = delPoint;
    }

    public FinancialManagerMaintenance100PutRequest withDelPoint(Double delPoint) {
        this.delPoint = delPoint;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("corrDigit")
    public Double getCorrDigit() {
        return corrDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("corrDigit")
    public void setCorrDigit(Double corrDigit) {
        this.corrDigit = corrDigit;
    }

    public FinancialManagerMaintenance100PutRequest withCorrDigit(Double corrDigit) {
        this.corrDigit = corrDigit;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    public String getCriteriaCntyCode() {
        return criteriaCntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    public void setCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
    }

    public FinancialManagerMaintenance100PutRequest withCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("srcCode")
    public String getSrcCode() {
        return srcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("srcCode")
    public void setSrcCode(String srcCode) {
        this.srcCode = srcCode;
    }

    public FinancialManagerMaintenance100PutRequest withSrcCode(String srcCode) {
        this.srcCode = srcCode;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    public Object getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public FinancialManagerMaintenance100PutRequest withMiddleName(Object middleName) {
        this.middleName = middleName;
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

    public FinancialManagerMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenNtypCode");
        sb.append('=');
        sb.append(((this.criteriaSpridenNtypCode == null)?"<null>":this.criteriaSpridenNtypCode));
        sb.append(',');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaFromDate");
        sb.append('=');
        sb.append(((this.criteriaFromDate == null)?"<null>":this.criteriaFromDate));
        sb.append(',');
        sb.append("criteriaToDate");
        sb.append('=');
        sb.append(((this.criteriaToDate == null)?"<null>":this.criteriaToDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("line3");
        sb.append('=');
        sb.append(((this.line3 == null)?"<null>":this.line3));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("phoneCtry");
        sb.append('=');
        sb.append(((this.phoneCtry == null)?"<null>":this.phoneCtry));
        sb.append(',');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("criteriaAsrcCode");
        sb.append('=');
        sb.append(((this.criteriaAsrcCode == null)?"<null>":this.criteriaAsrcCode));
        sb.append(',');
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("areaCode");
        sb.append('=');
        sb.append(((this.areaCode == null)?"<null>":this.areaCode));
        sb.append(',');
        sb.append("criteriaSeqno");
        sb.append('=');
        sb.append(((this.criteriaSeqno == null)?"<null>":this.criteriaSeqno));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("sPRADDRSeqNo");
        sb.append('=');
        sb.append(((this.sPRADDRSeqNo == null)?"<null>":this.sPRADDRSeqNo));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("houseNum");
        sb.append('=');
        sb.append(((this.houseNum == null)?"<null>":this.houseNum));
        sb.append(',');
        sb.append("phnExt");
        sb.append('=');
        sb.append(((this.phnExt == null)?"<null>":this.phnExt));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("carrRoute");
        sb.append('=');
        sb.append(((this.carrRoute == null)?"<null>":this.carrRoute));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("criteriaAddrType");
        sb.append('=');
        sb.append(((this.criteriaAddrType == null)?"<null>":this.criteriaAddrType));
        sb.append(',');
        sb.append("phnNumber");
        sb.append('=');
        sb.append(((this.phnNumber == null)?"<null>":this.phnNumber));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("displayFmgrCode");
        sb.append('=');
        sb.append(((this.displayFmgrCode == null)?"<null>":this.displayFmgrCode));
        sb.append(',');
        sb.append("nameType");
        sb.append('=');
        sb.append(((this.nameType == null)?"<null>":this.nameType));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("orgCode");
        sb.append('=');
        sb.append(((this.orgCode == null)?"<null>":this.orgCode));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("criteriaAddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaAddrSeqno == null)?"<null>":this.criteriaAddrSeqno));
        sb.append(',');
        sb.append("criteriaStreetLine1");
        sb.append('=');
        sb.append(((this.criteriaStreetLine1 == null)?"<null>":this.criteriaStreetLine1));
        sb.append(',');
        sb.append("line4");
        sb.append('=');
        sb.append(((this.line4 == null)?"<null>":this.line4));
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
        sb.append("criteriaSpraddrStatusInd");
        sb.append('=');
        sb.append(((this.criteriaSpraddrStatusInd == null)?"<null>":this.criteriaSpraddrStatusInd));
        sb.append(',');
        sb.append("criteriaStreetLine2");
        sb.append('=');
        sb.append(((this.criteriaStreetLine2 == null)?"<null>":this.criteriaStreetLine2));
        sb.append(',');
        sb.append("criteriaStreetLine3");
        sb.append('=');
        sb.append(((this.criteriaStreetLine3 == null)?"<null>":this.criteriaStreetLine3));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("criteriaStatCode");
        sb.append('=');
        sb.append(((this.criteriaStatCode == null)?"<null>":this.criteriaStatCode));
        sb.append(',');
        sb.append("delPoint");
        sb.append('=');
        sb.append(((this.delPoint == null)?"<null>":this.delPoint));
        sb.append(',');
        sb.append("corrDigit");
        sb.append('=');
        sb.append(((this.corrDigit == null)?"<null>":this.corrDigit));
        sb.append(',');
        sb.append("criteriaCntyCode");
        sb.append('=');
        sb.append(((this.criteriaCntyCode == null)?"<null>":this.criteriaCntyCode));
        sb.append(',');
        sb.append("srcCode");
        sb.append('=');
        sb.append(((this.srcCode == null)?"<null>":this.srcCode));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
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
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqno == null)? 0 :this.criteriaSeqno.hashCode()));
        result = ((result* 31)+((this.line3 == null)? 0 :this.line3 .hashCode()));
        result = ((result* 31)+((this.line2 == null)? 0 :this.line2 .hashCode()));
        result = ((result* 31)+((this.line1 == null)? 0 :this.line1 .hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.phoneCtry == null)? 0 :this.phoneCtry.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.sPRADDRSeqNo == null)? 0 :this.sPRADDRSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaStatCode == null)? 0 :this.criteriaStatCode.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.criteriaToDate == null)? 0 :this.criteriaToDate.hashCode()));
        result = ((result* 31)+((this.areaCode == null)? 0 :this.areaCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaCntyCode == null)? 0 :this.criteriaCntyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.houseNum == null)? 0 :this.houseNum.hashCode()));
        result = ((result* 31)+((this.phnExt == null)? 0 :this.phnExt.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.carrRoute == null)? 0 :this.carrRoute.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.phnNumber == null)? 0 :this.phnNumber.hashCode()));
        result = ((result* 31)+((this.criteriaAsrcCode == null)? 0 :this.criteriaAsrcCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.displayFmgrCode == null)? 0 :this.displayFmgrCode.hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.nameType == null)? 0 :this.nameType.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAddrType == null)? 0 :this.criteriaAddrType.hashCode()));
        result = ((result* 31)+((this.orgCode == null)? 0 :this.orgCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenNtypCode == null)? 0 :this.criteriaSpridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.line4 == null)? 0 :this.line4 .hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.criteriaFromDate == null)? 0 :this.criteriaFromDate.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrSeqno == null)? 0 :this.criteriaAddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.delPoint == null)? 0 :this.delPoint.hashCode()));
        result = ((result* 31)+((this.criteriaSpraddrStatusInd == null)? 0 :this.criteriaSpraddrStatusInd.hashCode()));
        result = ((result* 31)+((this.corrDigit == null)? 0 :this.corrDigit.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine4 == null)? 0 :this.criteriaStreetLine4 .hashCode()));
        result = ((result* 31)+((this.srcCode == null)? 0 :this.srcCode.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine2 == null)? 0 :this.criteriaStreetLine2 .hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine3 == null)? 0 :this.criteriaStreetLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaStreetLine1 == null)? 0 :this.criteriaStreetLine1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialManagerMaintenance100PutRequest) == false) {
            return false;
        }
        FinancialManagerMaintenance100PutRequest rhs = ((FinancialManagerMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaSeqno == rhs.criteriaSeqno)||((this.criteriaSeqno!= null)&&this.criteriaSeqno.equals(rhs.criteriaSeqno))))&&((this.line3 == rhs.line3)||((this.line3 != null)&&this.line3 .equals(rhs.line3))))&&((this.line2 == rhs.line2)||((this.line2 != null)&&this.line2 .equals(rhs.line2))))&&((this.line1 == rhs.line1)||((this.line1 != null)&&this.line1 .equals(rhs.line1))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.phoneCtry == rhs.phoneCtry)||((this.phoneCtry!= null)&&this.phoneCtry.equals(rhs.phoneCtry))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.sPRADDRSeqNo == rhs.sPRADDRSeqNo)||((this.sPRADDRSeqNo!= null)&&this.sPRADDRSeqNo.equals(rhs.sPRADDRSeqNo))))&&((this.criteriaStatCode == rhs.criteriaStatCode)||((this.criteriaStatCode!= null)&&this.criteriaStatCode.equals(rhs.criteriaStatCode))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.criteriaToDate == rhs.criteriaToDate)||((this.criteriaToDate!= null)&&this.criteriaToDate.equals(rhs.criteriaToDate))))&&((this.areaCode == rhs.areaCode)||((this.areaCode!= null)&&this.areaCode.equals(rhs.areaCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaCntyCode == rhs.criteriaCntyCode)||((this.criteriaCntyCode!= null)&&this.criteriaCntyCode.equals(rhs.criteriaCntyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.houseNum == rhs.houseNum)||((this.houseNum!= null)&&this.houseNum.equals(rhs.houseNum))))&&((this.phnExt == rhs.phnExt)||((this.phnExt!= null)&&this.phnExt.equals(rhs.phnExt))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.carrRoute == rhs.carrRoute)||((this.carrRoute!= null)&&this.carrRoute.equals(rhs.carrRoute))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.phnNumber == rhs.phnNumber)||((this.phnNumber!= null)&&this.phnNumber.equals(rhs.phnNumber))))&&((this.criteriaAsrcCode == rhs.criteriaAsrcCode)||((this.criteriaAsrcCode!= null)&&this.criteriaAsrcCode.equals(rhs.criteriaAsrcCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.displayFmgrCode == rhs.displayFmgrCode)||((this.displayFmgrCode!= null)&&this.displayFmgrCode.equals(rhs.displayFmgrCode))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAddrType == rhs.criteriaAddrType)||((this.criteriaAddrType!= null)&&this.criteriaAddrType.equals(rhs.criteriaAddrType))))&&((this.orgCode == rhs.orgCode)||((this.orgCode!= null)&&this.orgCode.equals(rhs.orgCode))))&&((this.criteriaSpridenNtypCode == rhs.criteriaSpridenNtypCode)||((this.criteriaSpridenNtypCode!= null)&&this.criteriaSpridenNtypCode.equals(rhs.criteriaSpridenNtypCode))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.line4 == rhs.line4)||((this.line4 != null)&&this.line4 .equals(rhs.line4))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.criteriaFromDate == rhs.criteriaFromDate)||((this.criteriaFromDate!= null)&&this.criteriaFromDate.equals(rhs.criteriaFromDate))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.criteriaAddrSeqno == rhs.criteriaAddrSeqno)||((this.criteriaAddrSeqno!= null)&&this.criteriaAddrSeqno.equals(rhs.criteriaAddrSeqno))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.delPoint == rhs.delPoint)||((this.delPoint!= null)&&this.delPoint.equals(rhs.delPoint))))&&((this.criteriaSpraddrStatusInd == rhs.criteriaSpraddrStatusInd)||((this.criteriaSpraddrStatusInd!= null)&&this.criteriaSpraddrStatusInd.equals(rhs.criteriaSpraddrStatusInd))))&&((this.corrDigit == rhs.corrDigit)||((this.corrDigit!= null)&&this.corrDigit.equals(rhs.corrDigit))))&&((this.criteriaStreetLine4 == rhs.criteriaStreetLine4)||((this.criteriaStreetLine4 != null)&&this.criteriaStreetLine4 .equals(rhs.criteriaStreetLine4))))&&((this.srcCode == rhs.srcCode)||((this.srcCode!= null)&&this.srcCode.equals(rhs.srcCode))))&&((this.criteriaStreetLine2 == rhs.criteriaStreetLine2)||((this.criteriaStreetLine2 != null)&&this.criteriaStreetLine2 .equals(rhs.criteriaStreetLine2))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.criteriaStreetLine3 == rhs.criteriaStreetLine3)||((this.criteriaStreetLine3 != null)&&this.criteriaStreetLine3 .equals(rhs.criteriaStreetLine3))))&&((this.criteriaStreetLine1 == rhs.criteriaStreetLine1)||((this.criteriaStreetLine1 != null)&&this.criteriaStreetLine1 .equals(rhs.criteriaStreetLine1))));
    }

}
