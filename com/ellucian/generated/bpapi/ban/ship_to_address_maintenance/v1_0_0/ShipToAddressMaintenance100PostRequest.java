
package com.ellucian.generated.bpapi.ban.ship_to_address_maintenance.v1_0_0;

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
    "displayShipCode",
    "zipCode",
    "ftvshipProfitCenterInd",
    "tgrpCode",
    "city",
    "orgnCodeWare",
    "houseNumber",
    "carrierRoute",
    "phoneNum",
    "ctryCodePhone",
    "building",
    "effDate",
    "progCodeWare",
    "contact",
    "state",
    "floor",
    "correctionDigit",
    "routeCode",
    "phoneExt",
    "deliveryPoint",
    "natnCode",
    "acctCodeInvtry",
    "fundCodeInvtry",
    "addrLine4",
    "profitCenterInd",
    "addrLine3",
    "addrLine2",
    "addrLine1",
    "phoneArea",
    "locnTypeCode",
    "termDate"
})
@Generated("jsonschema2pojo")
public class ShipToAddressMaintenance100PostRequest {

    /**
     * Ship To Code
     * <p>
     * Lineage reference object : displayShipCode, Lookup lineage reference object : ftvship
     * (Required)
     * 
     */
    @JsonProperty("displayShipCode")
    @JsonPropertyDescription("Lineage reference object : displayShipCode, Lookup lineage reference object : ftvship")
    private String displayShipCode;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVSHIP_ZIP_CODE
     * 
     */
    @JsonProperty("zipCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ZIP_CODE")
    private String zipCode;
    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("ftvshipProfitCenterInd")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PROFIT_CENTER_IND")
    private String ftvshipProfitCenterInd;
    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVSHIP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * City
     * <p>
     * Lineage reference object : FTVSHIP_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CITY")
    private String city;
    /**
     * Warehouse Organization
     * <p>
     * Lineage reference object : FTVSHIP_ORGN_CODE_WARE
     * 
     */
    @JsonProperty("orgnCodeWare")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ORGN_CODE_WARE")
    private String orgnCodeWare;
    /**
     * House Number
     * <p>
     * Lineage reference object : FTVSHIP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVSHIP_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CARRIER_ROUTE")
    private String carrierRoute;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_NUM")
    private String phoneNum;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVSHIP_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_BUILDING")
    private String building;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSHIP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_EFF_DATE")
    private Date effDate;
    /**
     * Warehouse Program
     * <p>
     * Lineage reference object : FTVSHIP_PROG_CODE_WARE
     * 
     */
    @JsonProperty("progCodeWare")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PROG_CODE_WARE")
    private String progCodeWare;
    /**
     * Contact
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CONTACT")
    private String contact;
    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVSHIP_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_STATE, Lookup lineage reference object : stvstat")
    private String state;
    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("floor")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_FLOOR")
    private String floor;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVSHIP_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CORRECTION_DIGIT")
    private Double correctionDigit;
    /**
     * Route
     * <p>
     * Lineage reference object : FTVSHIP_ROUTE_CODE
     * 
     */
    @JsonProperty("routeCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ROUTE_CODE")
    private String routeCode;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_EXT")
    private String phoneExt;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVSHIP_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_DELIVERY_POINT")
    private Double deliveryPoint;
    /**
     * Nation
     * <p>
     * Lineage reference object : FTVSHIP_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Inventory Account
     * <p>
     * Lineage reference object : FTVSHIP_ACCT_CODE_INVTRY
     * 
     */
    @JsonProperty("acctCodeInvtry")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ACCT_CODE_INVTRY")
    private String acctCodeInvtry;
    /**
     * Inventory Fund
     * <p>
     * Lineage reference object : FTVSHIP_FUND_CODE_INVTRY
     * 
     */
    @JsonProperty("fundCodeInvtry")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_FUND_CODE_INVTRY")
    private String fundCodeInvtry;
    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE4
     * 
     */
    @JsonProperty("addrLine4")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ADDR_LINE4")
    private String addrLine4;
    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("profitCenterInd")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PROFIT_CENTER_IND")
    private String profitCenterInd;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ADDR_LINE3")
    private String addrLine3;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ADDR_LINE2")
    private String addrLine2;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE1
     * (Required)
     * 
     */
    @JsonProperty("addrLine1")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_ADDR_LINE1")
    private String addrLine1;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_AREA")
    private String phoneArea;
    /**
     * Location Type
     * <p>
     * Lineage reference object : FTVSHIP_LOCN_TYPE_CODE
     * 
     */
    @JsonProperty("locnTypeCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_LOCN_TYPE_CODE")
    private String locnTypeCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ship To Code
     * <p>
     * Lineage reference object : displayShipCode, Lookup lineage reference object : ftvship
     * (Required)
     * 
     */
    @JsonProperty("displayShipCode")
    public String getDisplayShipCode() {
        return displayShipCode;
    }

    /**
     * Ship To Code
     * <p>
     * Lineage reference object : displayShipCode, Lookup lineage reference object : ftvship
     * (Required)
     * 
     */
    @JsonProperty("displayShipCode")
    public void setDisplayShipCode(String displayShipCode) {
        this.displayShipCode = displayShipCode;
    }

    public ShipToAddressMaintenance100PostRequest withDisplayShipCode(String displayShipCode) {
        this.displayShipCode = displayShipCode;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVSHIP_ZIP_CODE
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : FTVSHIP_ZIP_CODE
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ShipToAddressMaintenance100PostRequest withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("ftvshipProfitCenterInd")
    public String getFtvshipProfitCenterInd() {
        return ftvshipProfitCenterInd;
    }

    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("ftvshipProfitCenterInd")
    public void setFtvshipProfitCenterInd(String ftvshipProfitCenterInd) {
        this.ftvshipProfitCenterInd = ftvshipProfitCenterInd;
    }

    public ShipToAddressMaintenance100PostRequest withFtvshipProfitCenterInd(String ftvshipProfitCenterInd) {
        this.ftvshipProfitCenterInd = ftvshipProfitCenterInd;
        return this;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVSHIP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVSHIP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public ShipToAddressMaintenance100PostRequest withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVSHIP_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : FTVSHIP_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public ShipToAddressMaintenance100PostRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Warehouse Organization
     * <p>
     * Lineage reference object : FTVSHIP_ORGN_CODE_WARE
     * 
     */
    @JsonProperty("orgnCodeWare")
    public String getOrgnCodeWare() {
        return orgnCodeWare;
    }

    /**
     * Warehouse Organization
     * <p>
     * Lineage reference object : FTVSHIP_ORGN_CODE_WARE
     * 
     */
    @JsonProperty("orgnCodeWare")
    public void setOrgnCodeWare(String orgnCodeWare) {
        this.orgnCodeWare = orgnCodeWare;
    }

    public ShipToAddressMaintenance100PostRequest withOrgnCodeWare(String orgnCodeWare) {
        this.orgnCodeWare = orgnCodeWare;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVSHIP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : FTVSHIP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public ShipToAddressMaintenance100PostRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVSHIP_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FTVSHIP_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public ShipToAddressMaintenance100PostRequest withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public ShipToAddressMaintenance100PostRequest withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVSHIP_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVSHIP_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public ShipToAddressMaintenance100PostRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public ShipToAddressMaintenance100PostRequest withBuilding(String building) {
        this.building = building;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSHIP_EFF_DATE
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
     * Lineage reference object : FTVSHIP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ShipToAddressMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Warehouse Program
     * <p>
     * Lineage reference object : FTVSHIP_PROG_CODE_WARE
     * 
     */
    @JsonProperty("progCodeWare")
    public String getProgCodeWare() {
        return progCodeWare;
    }

    /**
     * Warehouse Program
     * <p>
     * Lineage reference object : FTVSHIP_PROG_CODE_WARE
     * 
     */
    @JsonProperty("progCodeWare")
    public void setProgCodeWare(String progCodeWare) {
        this.progCodeWare = progCodeWare;
    }

    public ShipToAddressMaintenance100PostRequest withProgCodeWare(String progCodeWare) {
        this.progCodeWare = progCodeWare;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    public ShipToAddressMaintenance100PostRequest withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVSHIP_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : FTVSHIP_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public ShipToAddressMaintenance100PostRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("floor")
    public String getFloor() {
        return floor;
    }

    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public ShipToAddressMaintenance100PostRequest withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVSHIP_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public Double getCorrectionDigit() {
        return correctionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FTVSHIP_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public void setCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
    }

    public ShipToAddressMaintenance100PostRequest withCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
        return this;
    }

    /**
     * Route
     * <p>
     * Lineage reference object : FTVSHIP_ROUTE_CODE
     * 
     */
    @JsonProperty("routeCode")
    public String getRouteCode() {
        return routeCode;
    }

    /**
     * Route
     * <p>
     * Lineage reference object : FTVSHIP_ROUTE_CODE
     * 
     */
    @JsonProperty("routeCode")
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public ShipToAddressMaintenance100PostRequest withRouteCode(String routeCode) {
        this.routeCode = routeCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public ShipToAddressMaintenance100PostRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVSHIP_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public Double getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FTVSHIP_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public void setDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public ShipToAddressMaintenance100PostRequest withDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVSHIP_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : FTVSHIP_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public ShipToAddressMaintenance100PostRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Inventory Account
     * <p>
     * Lineage reference object : FTVSHIP_ACCT_CODE_INVTRY
     * 
     */
    @JsonProperty("acctCodeInvtry")
    public String getAcctCodeInvtry() {
        return acctCodeInvtry;
    }

    /**
     * Inventory Account
     * <p>
     * Lineage reference object : FTVSHIP_ACCT_CODE_INVTRY
     * 
     */
    @JsonProperty("acctCodeInvtry")
    public void setAcctCodeInvtry(String acctCodeInvtry) {
        this.acctCodeInvtry = acctCodeInvtry;
    }

    public ShipToAddressMaintenance100PostRequest withAcctCodeInvtry(String acctCodeInvtry) {
        this.acctCodeInvtry = acctCodeInvtry;
        return this;
    }

    /**
     * Inventory Fund
     * <p>
     * Lineage reference object : FTVSHIP_FUND_CODE_INVTRY
     * 
     */
    @JsonProperty("fundCodeInvtry")
    public String getFundCodeInvtry() {
        return fundCodeInvtry;
    }

    /**
     * Inventory Fund
     * <p>
     * Lineage reference object : FTVSHIP_FUND_CODE_INVTRY
     * 
     */
    @JsonProperty("fundCodeInvtry")
    public void setFundCodeInvtry(String fundCodeInvtry) {
        this.fundCodeInvtry = fundCodeInvtry;
    }

    public ShipToAddressMaintenance100PostRequest withFundCodeInvtry(String fundCodeInvtry) {
        this.fundCodeInvtry = fundCodeInvtry;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE4
     * 
     */
    @JsonProperty("addrLine4")
    public String getAddrLine4() {
        return addrLine4;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE4
     * 
     */
    @JsonProperty("addrLine4")
    public void setAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
    }

    public ShipToAddressMaintenance100PostRequest withAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
        return this;
    }

    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("profitCenterInd")
    public String getProfitCenterInd() {
        return profitCenterInd;
    }

    /**
     * Lineage reference object : FTVSHIP_PROFIT_CENTER_IND
     * 
     */
    @JsonProperty("profitCenterInd")
    public void setProfitCenterInd(String profitCenterInd) {
        this.profitCenterInd = profitCenterInd;
    }

    public ShipToAddressMaintenance100PostRequest withProfitCenterInd(String profitCenterInd) {
        this.profitCenterInd = profitCenterInd;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public ShipToAddressMaintenance100PostRequest withAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public ShipToAddressMaintenance100PostRequest withAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE1
     * (Required)
     * 
     */
    @JsonProperty("addrLine1")
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : FTVSHIP_ADDR_LINE1
     * (Required)
     * 
     */
    @JsonProperty("addrLine1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public ShipToAddressMaintenance100PostRequest withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public ShipToAddressMaintenance100PostRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Location Type
     * <p>
     * Lineage reference object : FTVSHIP_LOCN_TYPE_CODE
     * 
     */
    @JsonProperty("locnTypeCode")
    public String getLocnTypeCode() {
        return locnTypeCode;
    }

    /**
     * Location Type
     * <p>
     * Lineage reference object : FTVSHIP_LOCN_TYPE_CODE
     * 
     */
    @JsonProperty("locnTypeCode")
    public void setLocnTypeCode(String locnTypeCode) {
        this.locnTypeCode = locnTypeCode;
    }

    public ShipToAddressMaintenance100PostRequest withLocnTypeCode(String locnTypeCode) {
        this.locnTypeCode = locnTypeCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ShipToAddressMaintenance100PostRequest withTermDate(Date termDate) {
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

    public ShipToAddressMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToAddressMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayShipCode");
        sb.append('=');
        sb.append(((this.displayShipCode == null)?"<null>":this.displayShipCode));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("ftvshipProfitCenterInd");
        sb.append('=');
        sb.append(((this.ftvshipProfitCenterInd == null)?"<null>":this.ftvshipProfitCenterInd));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("orgnCodeWare");
        sb.append('=');
        sb.append(((this.orgnCodeWare == null)?"<null>":this.orgnCodeWare));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("progCodeWare");
        sb.append('=');
        sb.append(((this.progCodeWare == null)?"<null>":this.progCodeWare));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("correctionDigit");
        sb.append('=');
        sb.append(((this.correctionDigit == null)?"<null>":this.correctionDigit));
        sb.append(',');
        sb.append("routeCode");
        sb.append('=');
        sb.append(((this.routeCode == null)?"<null>":this.routeCode));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("deliveryPoint");
        sb.append('=');
        sb.append(((this.deliveryPoint == null)?"<null>":this.deliveryPoint));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("acctCodeInvtry");
        sb.append('=');
        sb.append(((this.acctCodeInvtry == null)?"<null>":this.acctCodeInvtry));
        sb.append(',');
        sb.append("fundCodeInvtry");
        sb.append('=');
        sb.append(((this.fundCodeInvtry == null)?"<null>":this.fundCodeInvtry));
        sb.append(',');
        sb.append("addrLine4");
        sb.append('=');
        sb.append(((this.addrLine4 == null)?"<null>":this.addrLine4));
        sb.append(',');
        sb.append("profitCenterInd");
        sb.append('=');
        sb.append(((this.profitCenterInd == null)?"<null>":this.profitCenterInd));
        sb.append(',');
        sb.append("addrLine3");
        sb.append('=');
        sb.append(((this.addrLine3 == null)?"<null>":this.addrLine3));
        sb.append(',');
        sb.append("addrLine2");
        sb.append('=');
        sb.append(((this.addrLine2 == null)?"<null>":this.addrLine2));
        sb.append(',');
        sb.append("addrLine1");
        sb.append('=');
        sb.append(((this.addrLine1 == null)?"<null>":this.addrLine1));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("locnTypeCode");
        sb.append('=');
        sb.append(((this.locnTypeCode == null)?"<null>":this.locnTypeCode));
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
        result = ((result* 31)+((this.displayShipCode == null)? 0 :this.displayShipCode.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.ftvshipProfitCenterInd == null)? 0 :this.ftvshipProfitCenterInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.orgnCodeWare == null)? 0 :this.orgnCodeWare.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.progCodeWare == null)? 0 :this.progCodeWare.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        result = ((result* 31)+((this.correctionDigit == null)? 0 :this.correctionDigit.hashCode()));
        result = ((result* 31)+((this.routeCode == null)? 0 :this.routeCode.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.deliveryPoint == null)? 0 :this.deliveryPoint.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.acctCodeInvtry == null)? 0 :this.acctCodeInvtry.hashCode()));
        result = ((result* 31)+((this.fundCodeInvtry == null)? 0 :this.fundCodeInvtry.hashCode()));
        result = ((result* 31)+((this.addrLine4 == null)? 0 :this.addrLine4 .hashCode()));
        result = ((result* 31)+((this.profitCenterInd == null)? 0 :this.profitCenterInd.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.locnTypeCode == null)? 0 :this.locnTypeCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipToAddressMaintenance100PostRequest) == false) {
            return false;
        }
        ShipToAddressMaintenance100PostRequest rhs = ((ShipToAddressMaintenance100PostRequest) other);
        return (((((((((((((((((((((((((((((((((this.displayShipCode == rhs.displayShipCode)||((this.displayShipCode!= null)&&this.displayShipCode.equals(rhs.displayShipCode)))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.ftvshipProfitCenterInd == rhs.ftvshipProfitCenterInd)||((this.ftvshipProfitCenterInd!= null)&&this.ftvshipProfitCenterInd.equals(rhs.ftvshipProfitCenterInd))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.orgnCodeWare == rhs.orgnCodeWare)||((this.orgnCodeWare!= null)&&this.orgnCodeWare.equals(rhs.orgnCodeWare))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.progCodeWare == rhs.progCodeWare)||((this.progCodeWare!= null)&&this.progCodeWare.equals(rhs.progCodeWare))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))))&&((this.correctionDigit == rhs.correctionDigit)||((this.correctionDigit!= null)&&this.correctionDigit.equals(rhs.correctionDigit))))&&((this.routeCode == rhs.routeCode)||((this.routeCode!= null)&&this.routeCode.equals(rhs.routeCode))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.deliveryPoint == rhs.deliveryPoint)||((this.deliveryPoint!= null)&&this.deliveryPoint.equals(rhs.deliveryPoint))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.acctCodeInvtry == rhs.acctCodeInvtry)||((this.acctCodeInvtry!= null)&&this.acctCodeInvtry.equals(rhs.acctCodeInvtry))))&&((this.fundCodeInvtry == rhs.fundCodeInvtry)||((this.fundCodeInvtry!= null)&&this.fundCodeInvtry.equals(rhs.fundCodeInvtry))))&&((this.addrLine4 == rhs.addrLine4)||((this.addrLine4 != null)&&this.addrLine4 .equals(rhs.addrLine4))))&&((this.profitCenterInd == rhs.profitCenterInd)||((this.profitCenterInd!= null)&&this.profitCenterInd.equals(rhs.profitCenterInd))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.locnTypeCode == rhs.locnTypeCode)||((this.locnTypeCode!= null)&&this.locnTypeCode.equals(rhs.locnTypeCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
