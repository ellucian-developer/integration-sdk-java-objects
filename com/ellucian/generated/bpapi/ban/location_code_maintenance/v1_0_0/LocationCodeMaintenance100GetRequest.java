
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
    "criteria.statusInd",
    "criteria.squareFootageRate",
    "criteria.ctryCodePhone",
    "criteria.correctionDigit",
    "criteria.termDate",
    "criteria.phoneArea",
    "criteria.phoneExt",
    "activityDate",
    "criteria.natnCode",
    "criteria.city",
    "criteria.coasCode",
    "criteria.carrierRoute",
    "criteria.addrLine4",
    "criteria.effDate",
    "criteria.locnCode",
    "criteria.addrLine3",
    "criteria.addrLine2",
    "criteria.addrLine1",
    "criteria.deliveryPoint",
    "criteria.houseNumber",
    "criteria.squareFootage",
    "criteria.locnCodePred",
    "criteria.title",
    "criteria.zip",
    "criteria.state",
    "criteria.cntyCode"
})
@Generated("jsonschema2pojo")
public class LocationCodeMaintenance100GetRequest {

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
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("criteria.squareFootageRate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE")
    private Double criteriaSquareFootageRate;
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
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_AREA")
    private String criteriaPhoneArea;
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
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ACTIVITY_DATE")
    private Date activityDate;
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
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("criteria.carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CARRIER_ROUTE")
    private String criteriaCarrierRoute;
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
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.locnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE_PRED")
    private String criteriaLocnCodePred;
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
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVLOCN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ZIP")
    private String criteriaZip;
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

    public LocationCodeMaintenance100GetRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
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

    public LocationCodeMaintenance100GetRequest withCriteriaSquareFootageRate(Double criteriaSquareFootageRate) {
        this.criteriaSquareFootageRate = criteriaSquareFootageRate;
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

    public LocationCodeMaintenance100GetRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
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

    public LocationCodeMaintenance100GetRequest withCriteriaCorrectionDigit(Double criteriaCorrectionDigit) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
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

    public LocationCodeMaintenance100GetRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
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

    public LocationCodeMaintenance100GetRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LocationCodeMaintenance100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public LocationCodeMaintenance100GetRequest withCriteriaNatnCode(String criteriaNatnCode) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
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

    public LocationCodeMaintenance100GetRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public LocationCodeMaintenance100GetRequest withCriteriaCarrierRoute(String criteriaCarrierRoute) {
        this.criteriaCarrierRoute = criteriaCarrierRoute;
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

    public LocationCodeMaintenance100GetRequest withCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
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

    public LocationCodeMaintenance100GetRequest withCriteriaEffDate(Date criteriaEffDate) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
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

    public LocationCodeMaintenance100GetRequest withCriteriaAddrLine3(String criteriaAddrLine3) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaAddrLine2(String criteriaAddrLine2) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaAddrLine1(String criteriaAddrLine1) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaDeliveryPoint(Double criteriaDeliveryPoint) {
        this.criteriaDeliveryPoint = criteriaDeliveryPoint;
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

    public LocationCodeMaintenance100GetRequest withCriteriaHouseNumber(String criteriaHouseNumber) {
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

    public LocationCodeMaintenance100GetRequest withCriteriaSquareFootage(Double criteriaSquareFootage) {
        this.criteriaSquareFootage = criteriaSquareFootage;
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

    public LocationCodeMaintenance100GetRequest withCriteriaLocnCodePred(String criteriaLocnCodePred) {
        this.criteriaLocnCodePred = criteriaLocnCodePred;
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

    public LocationCodeMaintenance100GetRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
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

    public LocationCodeMaintenance100GetRequest withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
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

    public LocationCodeMaintenance100GetRequest withCriteriaState(String criteriaState) {
        this.criteriaState = criteriaState;
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

    public LocationCodeMaintenance100GetRequest withCriteriaCntyCode(String criteriaCntyCode) {
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

    public LocationCodeMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCodeMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaSquareFootageRate");
        sb.append('=');
        sb.append(((this.criteriaSquareFootageRate == null)?"<null>":this.criteriaSquareFootageRate));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaCorrectionDigit");
        sb.append('=');
        sb.append(((this.criteriaCorrectionDigit == null)?"<null>":this.criteriaCorrectionDigit));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaCarrierRoute");
        sb.append('=');
        sb.append(((this.criteriaCarrierRoute == null)?"<null>":this.criteriaCarrierRoute));
        sb.append(',');
        sb.append("criteriaAddrLine4");
        sb.append('=');
        sb.append(((this.criteriaAddrLine4 == null)?"<null>":this.criteriaAddrLine4));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
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
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("criteriaSquareFootage");
        sb.append('=');
        sb.append(((this.criteriaSquareFootage == null)?"<null>":this.criteriaSquareFootage));
        sb.append(',');
        sb.append("criteriaLocnCodePred");
        sb.append('=');
        sb.append(((this.criteriaLocnCodePred == null)?"<null>":this.criteriaLocnCodePred));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("criteriaState");
        sb.append('=');
        sb.append(((this.criteriaState == null)?"<null>":this.criteriaState));
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
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine4 == null)? 0 :this.criteriaAddrLine4 .hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodePred == null)? 0 :this.criteriaLocnCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine3 == null)? 0 :this.criteriaAddrLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine2 == null)? 0 :this.criteriaAddrLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine1 == null)? 0 :this.criteriaAddrLine1 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCarrierRoute == null)? 0 :this.criteriaCarrierRoute.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCorrectionDigit == null)? 0 :this.criteriaCorrectionDigit.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootage == null)? 0 :this.criteriaSquareFootage.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDeliveryPoint == null)? 0 :this.criteriaDeliveryPoint.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaState == null)? 0 :this.criteriaState.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootageRate == null)? 0 :this.criteriaSquareFootageRate.hashCode()));
        result = ((result* 31)+((this.criteriaCntyCode == null)? 0 :this.criteriaCntyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCodeMaintenance100GetRequest) == false) {
            return false;
        }
        LocationCodeMaintenance100GetRequest rhs = ((LocationCodeMaintenance100GetRequest) other);
        return ((((((((((((((((((((((((((((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode)))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAddrLine4 == rhs.criteriaAddrLine4)||((this.criteriaAddrLine4 != null)&&this.criteriaAddrLine4 .equals(rhs.criteriaAddrLine4))))&&((this.criteriaLocnCodePred == rhs.criteriaLocnCodePred)||((this.criteriaLocnCodePred!= null)&&this.criteriaLocnCodePred.equals(rhs.criteriaLocnCodePred))))&&((this.criteriaAddrLine3 == rhs.criteriaAddrLine3)||((this.criteriaAddrLine3 != null)&&this.criteriaAddrLine3 .equals(rhs.criteriaAddrLine3))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaAddrLine2 == rhs.criteriaAddrLine2)||((this.criteriaAddrLine2 != null)&&this.criteriaAddrLine2 .equals(rhs.criteriaAddrLine2))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAddrLine1 == rhs.criteriaAddrLine1)||((this.criteriaAddrLine1 != null)&&this.criteriaAddrLine1 .equals(rhs.criteriaAddrLine1))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaCarrierRoute == rhs.criteriaCarrierRoute)||((this.criteriaCarrierRoute!= null)&&this.criteriaCarrierRoute.equals(rhs.criteriaCarrierRoute))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaCorrectionDigit == rhs.criteriaCorrectionDigit)||((this.criteriaCorrectionDigit!= null)&&this.criteriaCorrectionDigit.equals(rhs.criteriaCorrectionDigit))))&&((this.criteriaSquareFootage == rhs.criteriaSquareFootage)||((this.criteriaSquareFootage!= null)&&this.criteriaSquareFootage.equals(rhs.criteriaSquareFootage))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDeliveryPoint == rhs.criteriaDeliveryPoint)||((this.criteriaDeliveryPoint!= null)&&this.criteriaDeliveryPoint.equals(rhs.criteriaDeliveryPoint))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaState == rhs.criteriaState)||((this.criteriaState!= null)&&this.criteriaState.equals(rhs.criteriaState))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaSquareFootageRate == rhs.criteriaSquareFootageRate)||((this.criteriaSquareFootageRate!= null)&&this.criteriaSquareFootageRate.equals(rhs.criteriaSquareFootageRate))))&&((this.criteriaCntyCode == rhs.criteriaCntyCode)||((this.criteriaCntyCode!= null)&&this.criteriaCntyCode.equals(rhs.criteriaCntyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
