
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
    "city",
    "nation",
    "county",
    "carrierRoute",
    "phoneNum",
    "effDate",
    "predLocation",
    "state",
    "line3",
    "line2",
    "line1",
    "digit",
    "zip",
    "phoneExt",
    "line4",
    "locationTitle",
    "delvPoint",
    "coas",
    "areaCode",
    "squareFootRate",
    "squareFoot",
    "location",
    "termDate",
    "houseNum"
})
@Generated("jsonschema2pojo")
public class LocationCodeMaintenance100PostRequest {

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
     * City
     * <p>
     * Lineage reference object : FTVLOCN_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CITY")
    private String city;
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
     * Carrier Route
     * <p>
     * Lineage reference object : FTVLOCN_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_CARRIER_ROUTE")
    private String carrierRoute;
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
     * Predecessor Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE_PRED
     * 
     */
    @JsonProperty("predLocation")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE_PRED")
    private String predLocation;
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
     * Delivery Point
     * <p>
     * Lineage reference object : FTVLOCN_DELIVERY_POINT
     * 
     */
    @JsonProperty("delvPoint")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_DELIVERY_POINT")
    private Double delvPoint;
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
     * Area Code
     * <p>
     * Lineage reference object : FTVLOCN_PHONE_AREA
     * 
     */
    @JsonProperty("areaCode")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_PHONE_AREA")
    private String areaCode;
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
     * Square Footage
     * <p>
     * Lineage reference object : FTVLOCN_SQUARE_FOOTAGE
     * 
     */
    @JsonProperty("squareFoot")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_SQUARE_FOOTAGE")
    private Double squareFoot;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_LOCN_CODE")
    private String location;
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

    public LocationCodeMaintenance100PostRequest withCountry(String country) {
        this.country = country;
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

    public LocationCodeMaintenance100PostRequest withCity(String city) {
        this.city = city;
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

    public LocationCodeMaintenance100PostRequest withNation(String nation) {
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

    public LocationCodeMaintenance100PostRequest withCounty(String county) {
        this.county = county;
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

    public LocationCodeMaintenance100PostRequest withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
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

    public LocationCodeMaintenance100PostRequest withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public LocationCodeMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public LocationCodeMaintenance100PostRequest withPredLocation(String predLocation) {
        this.predLocation = predLocation;
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

    public LocationCodeMaintenance100PostRequest withState(String state) {
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

    public LocationCodeMaintenance100PostRequest withLine3(String line3) {
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

    public LocationCodeMaintenance100PostRequest withLine2(String line2) {
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

    public LocationCodeMaintenance100PostRequest withLine1(String line1) {
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

    public LocationCodeMaintenance100PostRequest withDigit(Double digit) {
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

    public LocationCodeMaintenance100PostRequest withZip(String zip) {
        this.zip = zip;
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

    public LocationCodeMaintenance100PostRequest withPhoneExt(String phoneExt) {
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

    public LocationCodeMaintenance100PostRequest withLine4(String line4) {
        this.line4 = line4;
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

    public LocationCodeMaintenance100PostRequest withLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
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

    public LocationCodeMaintenance100PostRequest withDelvPoint(Double delvPoint) {
        this.delvPoint = delvPoint;
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

    public LocationCodeMaintenance100PostRequest withCoas(String coas) {
        this.coas = coas;
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

    public LocationCodeMaintenance100PostRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public LocationCodeMaintenance100PostRequest withSquareFootRate(Double squareFootRate) {
        this.squareFootRate = squareFootRate;
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

    public LocationCodeMaintenance100PostRequest withSquareFoot(Double squareFoot) {
        this.squareFoot = squareFoot;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVLOCN_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public LocationCodeMaintenance100PostRequest withLocation(String location) {
        this.location = location;
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

    public LocationCodeMaintenance100PostRequest withTermDate(Date termDate) {
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

    public LocationCodeMaintenance100PostRequest withHouseNum(String houseNum) {
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

    public LocationCodeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCodeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("nation");
        sb.append('=');
        sb.append(((this.nation == null)?"<null>":this.nation));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("predLocation");
        sb.append('=');
        sb.append(((this.predLocation == null)?"<null>":this.predLocation));
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
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("line4");
        sb.append('=');
        sb.append(((this.line4 == null)?"<null>":this.line4));
        sb.append(',');
        sb.append("locationTitle");
        sb.append('=');
        sb.append(((this.locationTitle == null)?"<null>":this.locationTitle));
        sb.append(',');
        sb.append("delvPoint");
        sb.append('=');
        sb.append(((this.delvPoint == null)?"<null>":this.delvPoint));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("areaCode");
        sb.append('=');
        sb.append(((this.areaCode == null)?"<null>":this.areaCode));
        sb.append(',');
        sb.append("squareFootRate");
        sb.append('=');
        sb.append(((this.squareFootRate == null)?"<null>":this.squareFootRate));
        sb.append(',');
        sb.append("squareFoot");
        sb.append('=');
        sb.append(((this.squareFoot == null)?"<null>":this.squareFoot));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.nation == null)? 0 :this.nation.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.predLocation == null)? 0 :this.predLocation.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.line3 == null)? 0 :this.line3 .hashCode()));
        result = ((result* 31)+((this.line2 == null)? 0 :this.line2 .hashCode()));
        result = ((result* 31)+((this.line1 == null)? 0 :this.line1 .hashCode()));
        result = ((result* 31)+((this.digit == null)? 0 :this.digit.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.line4 == null)? 0 :this.line4 .hashCode()));
        result = ((result* 31)+((this.locationTitle == null)? 0 :this.locationTitle.hashCode()));
        result = ((result* 31)+((this.delvPoint == null)? 0 :this.delvPoint.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.areaCode == null)? 0 :this.areaCode.hashCode()));
        result = ((result* 31)+((this.squareFootRate == null)? 0 :this.squareFootRate.hashCode()));
        result = ((result* 31)+((this.squareFoot == null)? 0 :this.squareFoot.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.houseNum == null)? 0 :this.houseNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCodeMaintenance100PostRequest) == false) {
            return false;
        }
        LocationCodeMaintenance100PostRequest rhs = ((LocationCodeMaintenance100PostRequest) other);
        return (((((((((((((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.nation == rhs.nation)||((this.nation!= null)&&this.nation.equals(rhs.nation))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.predLocation == rhs.predLocation)||((this.predLocation!= null)&&this.predLocation.equals(rhs.predLocation))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.line3 == rhs.line3)||((this.line3 != null)&&this.line3 .equals(rhs.line3))))&&((this.line2 == rhs.line2)||((this.line2 != null)&&this.line2 .equals(rhs.line2))))&&((this.line1 == rhs.line1)||((this.line1 != null)&&this.line1 .equals(rhs.line1))))&&((this.digit == rhs.digit)||((this.digit!= null)&&this.digit.equals(rhs.digit))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.line4 == rhs.line4)||((this.line4 != null)&&this.line4 .equals(rhs.line4))))&&((this.locationTitle == rhs.locationTitle)||((this.locationTitle!= null)&&this.locationTitle.equals(rhs.locationTitle))))&&((this.delvPoint == rhs.delvPoint)||((this.delvPoint!= null)&&this.delvPoint.equals(rhs.delvPoint))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.areaCode == rhs.areaCode)||((this.areaCode!= null)&&this.areaCode.equals(rhs.areaCode))))&&((this.squareFootRate == rhs.squareFootRate)||((this.squareFootRate!= null)&&this.squareFootRate.equals(rhs.squareFootRate))))&&((this.squareFoot == rhs.squareFoot)||((this.squareFoot!= null)&&this.squareFoot.equals(rhs.squareFoot))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.houseNum == rhs.houseNum)||((this.houseNum!= null)&&this.houseNum.equals(rhs.houseNum))));
    }

}
