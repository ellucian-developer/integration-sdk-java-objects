
package com.ellucian.generated.bpapi.ban.location_code_maintenance.v1_0_0;

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
    "country",
    "nation",
    "county",
    "criteria.ctryCodePhone",
    "phoneNum",
    "criteria.correctionDigit",
    "criteria.termDate",
    "criteria.phoneExt",
    "predLocation",
    "criteria.coasCode",
    "criteria.addrLine4",
    "state",
    "line3",
    "line2",
    "line1",
    "digit",
    "zip",
    "criteria.effDate",
    "criteria.locnCode",
    "criteria.houseNumber",
    "criteria.squareFootage",
    "delvPoint",
    "criteria.title",
    "coas",
    "criteria.zip",
    "areaCode",
    "squareFoot",
    "termDate",
    "houseNum",
    "criteria.activityDate",
    "criteria.statusInd",
    "city",
    "criteria.squareFootageRate",
    "carrierRoute",
    "criteria.phoneArea",
    "criteria.natnCode",
    "criteria.city",
    "criteria.carrierRoute",
    "phoneExt",
    "line4",
    "criteria.addrLine3",
    "criteria.addrLine2",
    "criteria.addrLine1",
    "criteria.deliveryPoint",
    "locationTitle",
    "criteria.locnCodePred",
    "criteria.state",
    "squareFootRate",
    "criteria.cntyCode"
})
@Generated("jsonschema2pojo")
public class LocationCodeMaintenance100PutRequest {

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CTRY_CODE_PHONE")
    private String country;
    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("nation")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String nation;
    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("county")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String county;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_NUMBER")
    private String phoneNum;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("criteria.correctionDigit")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CORRECTION_DIGIT")
    private Double criteriaCorrectionDigit;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_EXT")
    private String criteriaPhoneExt;
    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("predLocation")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE_PRED")
    private String predLocation;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("criteria.addrLine4")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE4")
    private String criteriaAddrLine4;
    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat")
    private String state;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("line3")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE3")
    private String line3;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE2")
    private String line2;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE1")
    private String line1;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("digit")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CORRECTION_DIGIT")
    private Double digit;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ZIP")
    private String zip;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVLOCN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_HOUSE_NUMBER")
    private String criteriaHouseNumber;
    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("criteria.squareFootage")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE")
    private Double criteriaSquareFootage;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("delvPoint")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_DELIVERY_POINT")
    private Double delvPoint;
    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TITLE")
    private String criteriaTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coas;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ZIP")
    private String criteriaZip;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("areaCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_AREA")
    private String areaCode;
    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFoot")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE")
    private Double squareFoot;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TERM_DATE")
    private Date termDate;
    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_HOUSE_NUMBER")
    private String houseNum;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CITY")
    private String city;
    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("criteria.squareFootageRate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE")
    private Double criteriaSquareFootageRate;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CARRIER_ROUTE")
    private String carrierRoute;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_AREA")
    private String criteriaPhoneArea;
    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CITY")
    private String criteriaCity;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("criteria.carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CARRIER_ROUTE")
    private String criteriaCarrierRoute;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_EXT")
    private String phoneExt;
    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("line4")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE4")
    private String line4;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE3")
    private String criteriaAddrLine3;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE2")
    private String criteriaAddrLine2;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE1")
    private String criteriaAddrLine1;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("criteria.deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_DELIVERY_POINT")
    private Double criteriaDeliveryPoint;
    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("locationTitle")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TITLE")
    private String locationTitle;
    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.locnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE_PRED")
    private String criteriaLocnCodePred;
    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.state")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat")
    private String criteriaState;
    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootRate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE")
    private Double squareFootRate;
    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String criteriaCntyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public LocationCodeMaintenance100PutRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("nation")
    public String getNation() {
        return nation;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("nation")
    public void setNation(String nation) {
        this.nation = nation;
    }

    public LocationCodeMaintenance100PutRequest withNation(String nation) {
        this.nation = nation;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    public LocationCodeMaintenance100PutRequest withCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocationCodeMaintenance100PutRequest withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("criteria.correctionDigit")
    public Double getCriteriaCorrectionDigit() {
        return criteriaCorrectionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("criteria.correctionDigit")
    public void setCriteriaCorrectionDigit(Double criteriaCorrectionDigit) {
        this.criteriaCorrectionDigit = criteriaCorrectionDigit;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCorrectionDigit(Double criteriaCorrectionDigit) {
        this.criteriaCorrectionDigit = criteriaCorrectionDigit;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("predLocation")
    public String getPredLocation() {
        return predLocation;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("predLocation")
    public void setPredLocation(String predLocation) {
        this.predLocation = predLocation;
    }

    public LocationCodeMaintenance100PutRequest withPredLocation(String predLocation) {
        this.predLocation = predLocation;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("criteria.addrLine4")
    public String getCriteriaAddrLine4() {
        return criteriaAddrLine4;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("criteria.addrLine4")
    public void setCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public LocationCodeMaintenance100PutRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("line3")
    public String getLine3() {
        return line3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("line3")
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public LocationCodeMaintenance100PutRequest withLine3(String line3) {
        this.line3 = line3;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public LocationCodeMaintenance100PutRequest withLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public LocationCodeMaintenance100PutRequest withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("digit")
    public Double getDigit() {
        return digit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("digit")
    public void setDigit(Double digit) {
        this.digit = digit;
    }

    public LocationCodeMaintenance100PutRequest withDigit(Double digit) {
        this.digit = digit;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public LocationCodeMaintenance100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVLOCN_EFF_DATE
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
     * Lineage reference object : FTVLOCN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public String getCriteriaHouseNumber() {
        return criteriaHouseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public void setCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
        return this;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("criteria.squareFootage")
    public Double getCriteriaSquareFootage() {
        return criteriaSquareFootage;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("criteria.squareFootage")
    public void setCriteriaSquareFootage(Double criteriaSquareFootage) {
        this.criteriaSquareFootage = criteriaSquareFootage;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaSquareFootage(Double criteriaSquareFootage) {
        this.criteriaSquareFootage = criteriaSquareFootage;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("delvPoint")
    public Double getDelvPoint() {
        return delvPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("delvPoint")
    public void setDelvPoint(Double delvPoint) {
        this.delvPoint = delvPoint;
    }

    public LocationCodeMaintenance100PutRequest withDelvPoint(Double delvPoint) {
        this.delvPoint = delvPoint;
        return this;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public LocationCodeMaintenance100PutRequest withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public String getCriteriaZip() {
        return criteriaZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public void setCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("areaCode")
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("areaCode")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public LocationCodeMaintenance100PutRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFoot")
    public Double getSquareFoot() {
        return squareFoot;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFoot")
    public void setSquareFoot(Double squareFoot) {
        this.squareFoot = squareFoot;
    }

    public LocationCodeMaintenance100PutRequest withSquareFoot(Double squareFoot) {
        this.squareFoot = squareFoot;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public LocationCodeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    public String getHouseNum() {
        return houseNum;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVLOCN_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNum")
    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public LocationCodeMaintenance100PutRequest withHouseNum(String houseNum) {
        this.houseNum = houseNum;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public LocationCodeMaintenance100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("criteria.squareFootageRate")
    public Double getCriteriaSquareFootageRate() {
        return criteriaSquareFootageRate;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("criteria.squareFootageRate")
    public void setCriteriaSquareFootageRate(Double criteriaSquareFootageRate) {
        this.criteriaSquareFootageRate = criteriaSquareFootageRate;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaSquareFootageRate(Double criteriaSquareFootageRate) {
        this.criteriaSquareFootageRate = criteriaSquareFootageRate;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public LocationCodeMaintenance100PutRequest withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public String getCriteriaCity() {
        return criteriaCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public void setCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("criteria.carrierRoute")
    public String getCriteriaCarrierRoute() {
        return criteriaCarrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("criteria.carrierRoute")
    public void setCriteriaCarrierRoute(String criteriaCarrierRoute) {
        this.criteriaCarrierRoute = criteriaCarrierRoute;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCarrierRoute(String criteriaCarrierRoute) {
        this.criteriaCarrierRoute = criteriaCarrierRoute;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public LocationCodeMaintenance100PutRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("line4")
    public String getLine4() {
        return line4;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE4
     * 
     */
    @JsonProperty("line4")
    public void setLine4(String line4) {
        this.line4 = line4;
    }

    public LocationCodeMaintenance100PutRequest withLine4(String line4) {
        this.line4 = line4;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    public String getCriteriaAddrLine3() {
        return criteriaAddrLine3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    public void setCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    public String getCriteriaAddrLine2() {
        return criteriaAddrLine2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    public void setCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    public String getCriteriaAddrLine1() {
        return criteriaAddrLine1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    public void setCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("criteria.deliveryPoint")
    public Double getCriteriaDeliveryPoint() {
        return criteriaDeliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("criteria.deliveryPoint")
    public void setCriteriaDeliveryPoint(Double criteriaDeliveryPoint) {
        this.criteriaDeliveryPoint = criteriaDeliveryPoint;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaDeliveryPoint(Double criteriaDeliveryPoint) {
        this.criteriaDeliveryPoint = criteriaDeliveryPoint;
        return this;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("locationTitle")
    public String getLocationTitle() {
        return locationTitle;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("locationTitle")
    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    public LocationCodeMaintenance100PutRequest withLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
        return this;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.locnCodePred")
    public String getCriteriaLocnCodePred() {
        return criteriaLocnCodePred;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.locnCodePred")
    public void setCriteriaLocnCodePred(String criteriaLocnCodePred) {
        this.criteriaLocnCodePred = criteriaLocnCodePred;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaLocnCodePred(String criteriaLocnCodePred) {
        this.criteriaLocnCodePred = criteriaLocnCodePred;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.state")
    public String getCriteriaState() {
        return criteriaState;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.state")
    public void setCriteriaState(String criteriaState) {
        this.criteriaState = criteriaState;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaState(String criteriaState) {
        this.criteriaState = criteriaState;
        return this;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootRate")
    public Double getSquareFootRate() {
        return squareFootRate;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootRate")
    public void setSquareFootRate(Double squareFootRate) {
        this.squareFootRate = squareFootRate;
    }

    public LocationCodeMaintenance100PutRequest withSquareFootRate(Double squareFootRate) {
        this.squareFootRate = squareFootRate;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    public String getCriteriaCntyCode() {
        return criteriaCntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("criteria.cntyCode")
    public void setCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
    }

    public LocationCodeMaintenance100PutRequest withCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
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

    public LocationCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("nation");
        sb.append('=');
        sb.append(((this.nation == null)?"<null>":this.nation));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("criteriaCorrectionDigit");
        sb.append('=');
        sb.append(((this.criteriaCorrectionDigit == null)?"<null>":this.criteriaCorrectionDigit));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("predLocation");
        sb.append('=');
        sb.append(((this.predLocation == null)?"<null>":this.predLocation));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaAddrLine4");
        sb.append('=');
        sb.append(((this.criteriaAddrLine4 == null)?"<null>":this.criteriaAddrLine4));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
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
        sb.append("digit");
        sb.append('=');
        sb.append(((this.digit == null)?"<null>":this.digit));
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
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("criteriaSquareFootage");
        sb.append('=');
        sb.append(((this.criteriaSquareFootage == null)?"<null>":this.criteriaSquareFootage));
        sb.append(',');
        sb.append("delvPoint");
        sb.append('=');
        sb.append(((this.delvPoint == null)?"<null>":this.delvPoint));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("areaCode");
        sb.append('=');
        sb.append(((this.areaCode == null)?"<null>":this.areaCode));
        sb.append(',');
        sb.append("squareFoot");
        sb.append('=');
        sb.append(((this.squareFoot == null)?"<null>":this.squareFoot));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("houseNum");
        sb.append('=');
        sb.append(((this.houseNum == null)?"<null>":this.houseNum));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("criteriaSquareFootageRate");
        sb.append('=');
        sb.append(((this.criteriaSquareFootageRate == null)?"<null>":this.criteriaSquareFootageRate));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("criteriaCarrierRoute");
        sb.append('=');
        sb.append(((this.criteriaCarrierRoute == null)?"<null>":this.criteriaCarrierRoute));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("line4");
        sb.append('=');
        sb.append(((this.line4 == null)?"<null>":this.line4));
        sb.append(',');
        sb.append("criteriaAddrLine3");
        sb.append('=');
        sb.append(((this.criteriaAddrLine3 == null)?"<null>":this.criteriaAddrLine3));
        sb.append(',');
        sb.append("criteriaAddrLine2");
        sb.append('=');
        sb.append(((this.criteriaAddrLine2 == null)?"<null>":this.criteriaAddrLine2));
        sb.append(',');
        sb.append("criteriaAddrLine1");
        sb.append('=');
        sb.append(((this.criteriaAddrLine1 == null)?"<null>":this.criteriaAddrLine1));
        sb.append(',');
        sb.append("criteriaDeliveryPoint");
        sb.append('=');
        sb.append(((this.criteriaDeliveryPoint == null)?"<null>":this.criteriaDeliveryPoint));
        sb.append(',');
        sb.append("locationTitle");
        sb.append('=');
        sb.append(((this.locationTitle == null)?"<null>":this.locationTitle));
        sb.append(',');
        sb.append("criteriaLocnCodePred");
        sb.append('=');
        sb.append(((this.criteriaLocnCodePred == null)?"<null>":this.criteriaLocnCodePred));
        sb.append(',');
        sb.append("criteriaState");
        sb.append('=');
        sb.append(((this.criteriaState == null)?"<null>":this.criteriaState));
        sb.append(',');
        sb.append("squareFootRate");
        sb.append('=');
        sb.append(((this.squareFootRate == null)?"<null>":this.squareFootRate));
        sb.append(',');
        sb.append("criteriaCntyCode");
        sb.append('=');
        sb.append(((this.criteriaCntyCode == null)?"<null>":this.criteriaCntyCode));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.nation == null)? 0 :this.nation.hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine4 == null)? 0 :this.criteriaAddrLine4 .hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodePred == null)? 0 :this.criteriaLocnCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine3 == null)? 0 :this.criteriaAddrLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine2 == null)? 0 :this.criteriaAddrLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine1 == null)? 0 :this.criteriaAddrLine1 .hashCode()));
        result = ((result* 31)+((this.predLocation == null)? 0 :this.predLocation.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.line3 == null)? 0 :this.line3 .hashCode()));
        result = ((result* 31)+((this.line2 == null)? 0 :this.line2 .hashCode()));
        result = ((result* 31)+((this.line1 == null)? 0 :this.line1 .hashCode()));
        result = ((result* 31)+((this.digit == null)? 0 :this.digit.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootage == null)? 0 :this.criteriaSquareFootage.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.delvPoint == null)? 0 :this.delvPoint.hashCode()));
        result = ((result* 31)+((this.criteriaState == null)? 0 :this.criteriaState.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.areaCode == null)? 0 :this.areaCode.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootageRate == null)? 0 :this.criteriaSquareFootageRate.hashCode()));
        result = ((result* 31)+((this.squareFoot == null)? 0 :this.squareFoot.hashCode()));
        result = ((result* 31)+((this.criteriaCntyCode == null)? 0 :this.criteriaCntyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.houseNum == null)? 0 :this.houseNum.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaCarrierRoute == null)? 0 :this.criteriaCarrierRoute.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCorrectionDigit == null)? 0 :this.criteriaCorrectionDigit.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.line4 == null)? 0 :this.line4 .hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.locationTitle == null)? 0 :this.locationTitle.hashCode()));
        result = ((result* 31)+((this.criteriaDeliveryPoint == null)? 0 :this.criteriaDeliveryPoint.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.squareFootRate == null)? 0 :this.squareFootRate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCodeMaintenance100PutRequest) == false) {
            return false;
        }
        LocationCodeMaintenance100PutRequest rhs = ((LocationCodeMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.nation == rhs.nation)||((this.nation!= null)&&this.nation.equals(rhs.nation))))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.criteriaAddrLine4 == rhs.criteriaAddrLine4)||((this.criteriaAddrLine4 != null)&&this.criteriaAddrLine4 .equals(rhs.criteriaAddrLine4))))&&((this.criteriaLocnCodePred == rhs.criteriaLocnCodePred)||((this.criteriaLocnCodePred!= null)&&this.criteriaLocnCodePred.equals(rhs.criteriaLocnCodePred))))&&((this.criteriaAddrLine3 == rhs.criteriaAddrLine3)||((this.criteriaAddrLine3 != null)&&this.criteriaAddrLine3 .equals(rhs.criteriaAddrLine3))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaAddrLine2 == rhs.criteriaAddrLine2)||((this.criteriaAddrLine2 != null)&&this.criteriaAddrLine2 .equals(rhs.criteriaAddrLine2))))&&((this.criteriaAddrLine1 == rhs.criteriaAddrLine1)||((this.criteriaAddrLine1 != null)&&this.criteriaAddrLine1 .equals(rhs.criteriaAddrLine1))))&&((this.predLocation == rhs.predLocation)||((this.predLocation!= null)&&this.predLocation.equals(rhs.predLocation))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.line3 == rhs.line3)||((this.line3 != null)&&this.line3 .equals(rhs.line3))))&&((this.line2 == rhs.line2)||((this.line2 != null)&&this.line2 .equals(rhs.line2))))&&((this.line1 == rhs.line1)||((this.line1 != null)&&this.line1 .equals(rhs.line1))))&&((this.digit == rhs.digit)||((this.digit!= null)&&this.digit.equals(rhs.digit))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.criteriaSquareFootage == rhs.criteriaSquareFootage)||((this.criteriaSquareFootage!= null)&&this.criteriaSquareFootage.equals(rhs.criteriaSquareFootage))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.delvPoint == rhs.delvPoint)||((this.delvPoint!= null)&&this.delvPoint.equals(rhs.delvPoint))))&&((this.criteriaState == rhs.criteriaState)||((this.criteriaState!= null)&&this.criteriaState.equals(rhs.criteriaState))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.areaCode == rhs.areaCode)||((this.areaCode!= null)&&this.areaCode.equals(rhs.areaCode))))&&((this.criteriaSquareFootageRate == rhs.criteriaSquareFootageRate)||((this.criteriaSquareFootageRate!= null)&&this.criteriaSquareFootageRate.equals(rhs.criteriaSquareFootageRate))))&&((this.squareFoot == rhs.squareFoot)||((this.squareFoot!= null)&&this.squareFoot.equals(rhs.squareFoot))))&&((this.criteriaCntyCode == rhs.criteriaCntyCode)||((this.criteriaCntyCode!= null)&&this.criteriaCntyCode.equals(rhs.criteriaCntyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.houseNum == rhs.houseNum)||((this.houseNum!= null)&&this.houseNum.equals(rhs.houseNum))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaCarrierRoute == rhs.criteriaCarrierRoute)||((this.criteriaCarrierRoute!= null)&&this.criteriaCarrierRoute.equals(rhs.criteriaCarrierRoute))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaCorrectionDigit == rhs.criteriaCorrectionDigit)||((this.criteriaCorrectionDigit!= null)&&this.criteriaCorrectionDigit.equals(rhs.criteriaCorrectionDigit))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.line4 == rhs.line4)||((this.line4 != null)&&this.line4 .equals(rhs.line4))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.locationTitle == rhs.locationTitle)||((this.locationTitle!= null)&&this.locationTitle.equals(rhs.locationTitle))))&&((this.criteriaDeliveryPoint == rhs.criteriaDeliveryPoint)||((this.criteriaDeliveryPoint!= null)&&this.criteriaDeliveryPoint.equals(rhs.criteriaDeliveryPoint))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.squareFootRate == rhs.squareFootRate)||((this.squareFootRate!= null)&&this.squareFootRate.equals(rhs.squareFootRate))));
    }

}
