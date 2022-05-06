
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
    "cntyCode",
    "city",
    "carrierRoute",
    "squareFootageRate",
    "coasCode",
    "locnCode",
    "title",
    "ctryCodePhone",
    "effDate",
    "activityDate",
    "squareFootage",
    "statusInd",
    "state",
    "statDescription",
    "correctionDigit",
    "zip",
    "deliveryPoint",
    "phoneExt",
    "natnCode",
    "natnDescription",
    "cntyDescription",
    "phoneNumber",
    "displayNchgDate",
    "addrLine3",
    "addrLine2",
    "predTitle",
    "addrLine1",
    "phoneArea",
    "locnCodePred",
    "termDate"
})
@Generated("jsonschema2pojo")
public class LocationCodeMaintenance100PostResponse {

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
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
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CARRIER_ROUTE")
    private String carrierRoute;
    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootageRate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE")
    private Double squareFootageRate;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE")
    private String locnCode;
    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TITLE")
    private String title;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVLOCN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_EFF_DATE")
    private Date effDate;
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
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFootage")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE")
    private Double squareFootage;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_STATUS_IND")
    private String statusInd;
    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_STATE, Lookup lineage reference object : stvstat")
    private String state;
    @JsonProperty("statDescription")
    private String statDescription;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CORRECTION_DIGIT")
    private Double correctionDigit;
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
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_DELIVERY_POINT")
    private Double deliveryPoint;
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
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnDescription")
    @JsonPropertyDescription("Lookup lineage reference object : stvnatn")
    private String natnDescription;
    @JsonProperty("cntyDescription")
    private String cntyDescription;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE3")
    private String addrLine3;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE2")
    private String addrLine2;
    @JsonProperty("predTitle")
    private String predTitle;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ADDR_LINE1")
    private String addrLine1;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_AREA")
    private String phoneArea;
    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("locnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE_PRED")
    private String locnCodePred;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVLOCN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : FTVLOCN_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public LocationCodeMaintenance100PostResponse withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
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

    public LocationCodeMaintenance100PostResponse withCity(String city) {
        this.city = city;
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

    public LocationCodeMaintenance100PostResponse withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
        return this;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootageRate")
    public Double getSquareFootageRate() {
        return squareFootageRate;
    }

    /**
     * Square Footage Rate
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE_RATE
     * 
     */
    @JsonProperty("squareFootageRate")
    public void setSquareFootageRate(Double squareFootageRate) {
        this.squareFootageRate = squareFootageRate;
    }

    public LocationCodeMaintenance100PostResponse withSquareFootageRate(Double squareFootageRate) {
        this.squareFootageRate = squareFootageRate;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVLOCN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public LocationCodeMaintenance100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public LocationCodeMaintenance100PostResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Location Title
     * <p>
     * Lineage reference object : FTVLOCN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public LocationCodeMaintenance100PostResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVLOCN_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public LocationCodeMaintenance100PostResponse withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVLOCN_EFF_DATE
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
     * Lineage reference object : FTVLOCN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public LocationCodeMaintenance100PostResponse withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public LocationCodeMaintenance100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFootage")
    public Double getSquareFootage() {
        return squareFootage;
    }

    /**
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFootage")
    public void setSquareFootage(Double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public LocationCodeMaintenance100PostResponse withSquareFootage(Double squareFootage) {
        this.squareFootage = squareFootage;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVLOCN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public LocationCodeMaintenance100PostResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public LocationCodeMaintenance100PostResponse withState(String state) {
        this.state = state;
        return this;
    }

    @JsonProperty("statDescription")
    public String getStatDescription() {
        return statDescription;
    }

    @JsonProperty("statDescription")
    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    public LocationCodeMaintenance100PostResponse withStatDescription(String statDescription) {
        this.statDescription = statDescription;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public Double getCorrectionDigit() {
        return correctionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVLOCN_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public void setCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
    }

    public LocationCodeMaintenance100PostResponse withCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
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

    public LocationCodeMaintenance100PostResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public Double getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public void setDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public LocationCodeMaintenance100PostResponse withDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
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

    public LocationCodeMaintenance100PostResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVLOCN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public LocationCodeMaintenance100PostResponse withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnDescription")
    public String getNatnDescription() {
        return natnDescription;
    }

    /**
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnDescription")
    public void setNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
    }

    public LocationCodeMaintenance100PostResponse withNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
        return this;
    }

    @JsonProperty("cntyDescription")
    public String getCntyDescription() {
        return cntyDescription;
    }

    @JsonProperty("cntyDescription")
    public void setCntyDescription(String cntyDescription) {
        this.cntyDescription = cntyDescription;
    }

    public LocationCodeMaintenance100PostResponse withCntyDescription(String cntyDescription) {
        this.cntyDescription = cntyDescription;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocationCodeMaintenance100PostResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public LocationCodeMaintenance100PostResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public LocationCodeMaintenance100PostResponse withAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public LocationCodeMaintenance100PostResponse withAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
        return this;
    }

    @JsonProperty("predTitle")
    public String getPredTitle() {
        return predTitle;
    }

    @JsonProperty("predTitle")
    public void setPredTitle(String predTitle) {
        this.predTitle = predTitle;
    }

    public LocationCodeMaintenance100PostResponse withPredTitle(String predTitle) {
        this.predTitle = predTitle;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVLOCN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public LocationCodeMaintenance100PostResponse withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public LocationCodeMaintenance100PostResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("locnCodePred")
    public String getLocnCodePred() {
        return locnCodePred;
    }

    /**
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("locnCodePred")
    public void setLocnCodePred(String locnCodePred) {
        this.locnCodePred = locnCodePred;
    }

    public LocationCodeMaintenance100PostResponse withLocnCodePred(String locnCodePred) {
        this.locnCodePred = locnCodePred;
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

    public LocationCodeMaintenance100PostResponse withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public LocationCodeMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCodeMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("squareFootageRate");
        sb.append('=');
        sb.append(((this.squareFootageRate == null)?"<null>":this.squareFootageRate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("squareFootage");
        sb.append('=');
        sb.append(((this.squareFootage == null)?"<null>":this.squareFootage));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("statDescription");
        sb.append('=');
        sb.append(((this.statDescription == null)?"<null>":this.statDescription));
        sb.append(',');
        sb.append("correctionDigit");
        sb.append('=');
        sb.append(((this.correctionDigit == null)?"<null>":this.correctionDigit));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("deliveryPoint");
        sb.append('=');
        sb.append(((this.deliveryPoint == null)?"<null>":this.deliveryPoint));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("natnDescription");
        sb.append('=');
        sb.append(((this.natnDescription == null)?"<null>":this.natnDescription));
        sb.append(',');
        sb.append("cntyDescription");
        sb.append('=');
        sb.append(((this.cntyDescription == null)?"<null>":this.cntyDescription));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("addrLine3");
        sb.append('=');
        sb.append(((this.addrLine3 == null)?"<null>":this.addrLine3));
        sb.append(',');
        sb.append("addrLine2");
        sb.append('=');
        sb.append(((this.addrLine2 == null)?"<null>":this.addrLine2));
        sb.append(',');
        sb.append("predTitle");
        sb.append('=');
        sb.append(((this.predTitle == null)?"<null>":this.predTitle));
        sb.append(',');
        sb.append("addrLine1");
        sb.append('=');
        sb.append(((this.addrLine1 == null)?"<null>":this.addrLine1));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("locnCodePred");
        sb.append('=');
        sb.append(((this.locnCodePred == null)?"<null>":this.locnCodePred));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.squareFootageRate == null)? 0 :this.squareFootageRate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.squareFootage == null)? 0 :this.squareFootage.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.statDescription == null)? 0 :this.statDescription.hashCode()));
        result = ((result* 31)+((this.correctionDigit == null)? 0 :this.correctionDigit.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.deliveryPoint == null)? 0 :this.deliveryPoint.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.natnDescription == null)? 0 :this.natnDescription.hashCode()));
        result = ((result* 31)+((this.cntyDescription == null)? 0 :this.cntyDescription.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.predTitle == null)? 0 :this.predTitle.hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.locnCodePred == null)? 0 :this.locnCodePred.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCodeMaintenance100PostResponse) == false) {
            return false;
        }
        LocationCodeMaintenance100PostResponse rhs = ((LocationCodeMaintenance100PostResponse) other);
        return ((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.squareFootageRate == rhs.squareFootageRate)||((this.squareFootageRate!= null)&&this.squareFootageRate.equals(rhs.squareFootageRate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.squareFootage == rhs.squareFootage)||((this.squareFootage!= null)&&this.squareFootage.equals(rhs.squareFootage))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.statDescription == rhs.statDescription)||((this.statDescription!= null)&&this.statDescription.equals(rhs.statDescription))))&&((this.correctionDigit == rhs.correctionDigit)||((this.correctionDigit!= null)&&this.correctionDigit.equals(rhs.correctionDigit))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.deliveryPoint == rhs.deliveryPoint)||((this.deliveryPoint!= null)&&this.deliveryPoint.equals(rhs.deliveryPoint))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.natnDescription == rhs.natnDescription)||((this.natnDescription!= null)&&this.natnDescription.equals(rhs.natnDescription))))&&((this.cntyDescription == rhs.cntyDescription)||((this.cntyDescription!= null)&&this.cntyDescription.equals(rhs.cntyDescription))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.locnCodePred == rhs.locnCodePred)||((this.locnCodePred!= null)&&this.locnCodePred.equals(rhs.locnCodePred))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
