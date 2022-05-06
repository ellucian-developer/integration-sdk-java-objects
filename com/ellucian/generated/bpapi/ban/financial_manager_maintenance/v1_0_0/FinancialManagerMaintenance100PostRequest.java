
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
    "cntyCode",
    "phnExt",
    "lastName",
    "seqNo",
    "carrRoute",
    "city",
    "phnNumber",
    "locnCode",
    "title",
    "nameType",
    "effDate",
    "orgCode",
    "line3",
    "line2",
    "line1",
    "zip",
    "line4",
    "statCode",
    "natnCode",
    "phoneCtry",
    "addressType",
    "teleCode",
    "coas",
    "firstName",
    "areaCode",
    "delPoint",
    "corrDigit",
    "srcCode",
    "middleName",
    "termDate",
    "SPRADDR.seqNo",
    "atypCode",
    "houseNum"
})
@Generated("jsonschema2pojo")
public class FinancialManagerMaintenance100PostRequest {

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
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_SEQNO")
    private Double seqNo;
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
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("nameType")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String nameType;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_EFF_DATE")
    private Date effDate;
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
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
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
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvtele")
    private String teleCode;
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
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    private String areaCode;
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
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_HOUSE_NUMBER")
    private String houseNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public FinancialManagerMaintenance100PostRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
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

    public FinancialManagerMaintenance100PostRequest withPhnExt(String phnExt) {
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

    public FinancialManagerMaintenance100PostRequest withLastName(Object lastName) {
        this.lastName = lastName;
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

    public FinancialManagerMaintenance100PostRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public FinancialManagerMaintenance100PostRequest withCarrRoute(String carrRoute) {
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

    public FinancialManagerMaintenance100PostRequest withCity(String city) {
        this.city = city;
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

    public FinancialManagerMaintenance100PostRequest withPhnNumber(String phnNumber) {
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

    public FinancialManagerMaintenance100PostRequest withLocnCode(String locnCode) {
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

    public FinancialManagerMaintenance100PostRequest withTitle(String title) {
        this.title = title;
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

    public FinancialManagerMaintenance100PostRequest withNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FinancialManagerMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public FinancialManagerMaintenance100PostRequest withOrgCode(String orgCode) {
        this.orgCode = orgCode;
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

    public FinancialManagerMaintenance100PostRequest withLine3(String line3) {
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

    public FinancialManagerMaintenance100PostRequest withLine2(String line2) {
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

    public FinancialManagerMaintenance100PostRequest withLine1(String line1) {
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

    public FinancialManagerMaintenance100PostRequest withZip(String zip) {
        this.zip = zip;
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

    public FinancialManagerMaintenance100PostRequest withLine4(String line4) {
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

    public FinancialManagerMaintenance100PostRequest withStatCode(String statCode) {
        this.statCode = statCode;
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

    public FinancialManagerMaintenance100PostRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
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

    public FinancialManagerMaintenance100PostRequest withPhoneCtry(String phoneCtry) {
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

    public FinancialManagerMaintenance100PostRequest withAddressType(String addressType) {
        this.addressType = addressType;
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

    public FinancialManagerMaintenance100PostRequest withTeleCode(String teleCode) {
        this.teleCode = teleCode;
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

    public FinancialManagerMaintenance100PostRequest withCoas(String coas) {
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

    public FinancialManagerMaintenance100PostRequest withFirstName(Object firstName) {
        this.firstName = firstName;
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

    public FinancialManagerMaintenance100PostRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public FinancialManagerMaintenance100PostRequest withDelPoint(Double delPoint) {
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

    public FinancialManagerMaintenance100PostRequest withCorrDigit(Double corrDigit) {
        this.corrDigit = corrDigit;
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

    public FinancialManagerMaintenance100PostRequest withSrcCode(String srcCode) {
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

    public FinancialManagerMaintenance100PostRequest withMiddleName(Object middleName) {
        this.middleName = middleName;
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

    public FinancialManagerMaintenance100PostRequest withTermDate(Date termDate) {
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

    public FinancialManagerMaintenance100PostRequest withSPRADDRSeqNo(Double sPRADDRSeqNo) {
        this.sPRADDRSeqNo = sPRADDRSeqNo;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public FinancialManagerMaintenance100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public FinancialManagerMaintenance100PostRequest withHouseNum(String houseNum) {
        this.houseNum = houseNum;
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

    public FinancialManagerMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("phnExt");
        sb.append('=');
        sb.append(((this.phnExt == null)?"<null>":this.phnExt));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("carrRoute");
        sb.append('=');
        sb.append(((this.carrRoute == null)?"<null>":this.carrRoute));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
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
        sb.append("nameType");
        sb.append('=');
        sb.append(((this.nameType == null)?"<null>":this.nameType));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("orgCode");
        sb.append('=');
        sb.append(((this.orgCode == null)?"<null>":this.orgCode));
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
        sb.append("line4");
        sb.append('=');
        sb.append(((this.line4 == null)?"<null>":this.line4));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("phoneCtry");
        sb.append('=');
        sb.append(((this.phoneCtry == null)?"<null>":this.phoneCtry));
        sb.append(',');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("areaCode");
        sb.append('=');
        sb.append(((this.areaCode == null)?"<null>":this.areaCode));
        sb.append(',');
        sb.append("delPoint");
        sb.append('=');
        sb.append(((this.delPoint == null)?"<null>":this.delPoint));
        sb.append(',');
        sb.append("corrDigit");
        sb.append('=');
        sb.append(((this.corrDigit == null)?"<null>":this.corrDigit));
        sb.append(',');
        sb.append("srcCode");
        sb.append('=');
        sb.append(((this.srcCode == null)?"<null>":this.srcCode));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("sPRADDRSeqNo");
        sb.append('=');
        sb.append(((this.sPRADDRSeqNo == null)?"<null>":this.sPRADDRSeqNo));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("houseNum");
        sb.append('=');
        sb.append(((this.houseNum == null)?"<null>":this.houseNum));
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
        result = ((result* 31)+((this.phnExt == null)? 0 :this.phnExt.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.carrRoute == null)? 0 :this.carrRoute.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.phnNumber == null)? 0 :this.phnNumber.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.nameType == null)? 0 :this.nameType.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.orgCode == null)? 0 :this.orgCode.hashCode()));
        result = ((result* 31)+((this.line3 == null)? 0 :this.line3 .hashCode()));
        result = ((result* 31)+((this.line2 == null)? 0 :this.line2 .hashCode()));
        result = ((result* 31)+((this.line1 == null)? 0 :this.line1 .hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.line4 == null)? 0 :this.line4 .hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.phoneCtry == null)? 0 :this.phoneCtry.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.sPRADDRSeqNo == null)? 0 :this.sPRADDRSeqNo.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.areaCode == null)? 0 :this.areaCode.hashCode()));
        result = ((result* 31)+((this.delPoint == null)? 0 :this.delPoint.hashCode()));
        result = ((result* 31)+((this.corrDigit == null)? 0 :this.corrDigit.hashCode()));
        result = ((result* 31)+((this.srcCode == null)? 0 :this.srcCode.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.houseNum == null)? 0 :this.houseNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialManagerMaintenance100PostRequest) == false) {
            return false;
        }
        FinancialManagerMaintenance100PostRequest rhs = ((FinancialManagerMaintenance100PostRequest) other);
        return (((((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.phnExt == rhs.phnExt)||((this.phnExt!= null)&&this.phnExt.equals(rhs.phnExt))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.carrRoute == rhs.carrRoute)||((this.carrRoute!= null)&&this.carrRoute.equals(rhs.carrRoute))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.phnNumber == rhs.phnNumber)||((this.phnNumber!= null)&&this.phnNumber.equals(rhs.phnNumber))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.orgCode == rhs.orgCode)||((this.orgCode!= null)&&this.orgCode.equals(rhs.orgCode))))&&((this.line3 == rhs.line3)||((this.line3 != null)&&this.line3 .equals(rhs.line3))))&&((this.line2 == rhs.line2)||((this.line2 != null)&&this.line2 .equals(rhs.line2))))&&((this.line1 == rhs.line1)||((this.line1 != null)&&this.line1 .equals(rhs.line1))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.line4 == rhs.line4)||((this.line4 != null)&&this.line4 .equals(rhs.line4))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.phoneCtry == rhs.phoneCtry)||((this.phoneCtry!= null)&&this.phoneCtry.equals(rhs.phoneCtry))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.sPRADDRSeqNo == rhs.sPRADDRSeqNo)||((this.sPRADDRSeqNo!= null)&&this.sPRADDRSeqNo.equals(rhs.sPRADDRSeqNo))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.areaCode == rhs.areaCode)||((this.areaCode!= null)&&this.areaCode.equals(rhs.areaCode))))&&((this.delPoint == rhs.delPoint)||((this.delPoint!= null)&&this.delPoint.equals(rhs.delPoint))))&&((this.corrDigit == rhs.corrDigit)||((this.corrDigit!= null)&&this.corrDigit.equals(rhs.corrDigit))))&&((this.srcCode == rhs.srcCode)||((this.srcCode!= null)&&this.srcCode.equals(rhs.srcCode))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.houseNum == rhs.houseNum)||((this.houseNum!= null)&&this.houseNum.equals(rhs.houseNum))));
    }

}
