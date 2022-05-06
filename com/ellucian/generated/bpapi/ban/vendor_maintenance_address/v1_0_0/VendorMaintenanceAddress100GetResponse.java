
package com.ellucian.generated.bpapi.ban.vendor_maintenance_address.v1_0_0;

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
    "streetLine2",
    "streetLine1",
    "city",
    "streetLine4",
    "streetLine3",
    "carrierRoute",
    "houseNumber",
    "activityDate",
    "statusInd",
    "faxExt",
    "teleDescription",
    "statDescription",
    "correctionDigit",
    "zip",
    "phoneExt",
    "deliveryPoint",
    "statCode",
    "natnCode",
    "seqno",
    "phoneCtry",
    "morePhoneMsg",
    "toDate",
    "asrcCode",
    "natnDescription",
    "teleCode",
    "cntyDescription",
    "fromDate",
    "faxArea",
    "phoneNumber",
    "faxNumber",
    "phoneArea",
    "atypDescription",
    "gstTaxId",
    "user",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceAddress100GetResponse {

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
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE2")
    private String streetLine2;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE1")
    private String streetLine1;
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
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE4")
    private String streetLine4;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE3")
    private String streetLine3;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CARRIER_ROUTE")
    private String carrierRoute;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRADDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STATUS_IND")
    private String statusInd;
    /**
     * Fax Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("faxExt")
    private String faxExt;
    @JsonProperty("teleDescription")
    private String teleDescription;
    @JsonProperty("statDescription")
    private String statDescription;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CORRECTION_DIGIT")
    private Double correctionDigit;
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
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    private String phoneExt;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_DELIVERY_POINT")
    private Double deliveryPoint;
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
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_SEQNO")
    private Double seqno;
    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneCtry")
    private String phoneCtry;
    /**
     * Phone Message
     * <p>
     * 
     * 
     */
    @JsonProperty("morePhoneMsg")
    private String morePhoneMsg;
    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_TO_DATE")
    private Date toDate;
    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc")
    private String asrcCode;
    @JsonProperty("natnDescription")
    private String natnDescription;
    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvtele")
    private String teleCode;
    @JsonProperty("cntyDescription")
    private String cntyDescription;
    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_FROM_DATE")
    private Date fromDate;
    /**
     * Fax Number
     * <p>
     * 
     * 
     */
    @JsonProperty("faxArea")
    private String faxArea;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("faxNumber")
    private String faxNumber;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    private String phoneArea;
    @JsonProperty("atypDescription")
    private String atypDescription;
    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_GST_TAX_ID")
    private String gstTaxId;
    /**
     * User
     * <p>
     * Lineage reference object : SPRADDR_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_USER")
    private String user;
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

    public VendorMaintenanceAddress100GetResponse withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public VendorMaintenanceAddress100GetResponse withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public VendorMaintenanceAddress100GetResponse withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
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

    public VendorMaintenanceAddress100GetResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public String getStreetLine4() {
        return streetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public void setStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
    }

    public VendorMaintenanceAddress100GetResponse withStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public VendorMaintenanceAddress100GetResponse withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public VendorMaintenanceAddress100GetResponse withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public VendorMaintenanceAddress100GetResponse withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRADDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRADDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VendorMaintenanceAddress100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public VendorMaintenanceAddress100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Fax Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("faxExt")
    public String getFaxExt() {
        return faxExt;
    }

    /**
     * Fax Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("faxExt")
    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    public VendorMaintenanceAddress100GetResponse withFaxExt(String faxExt) {
        this.faxExt = faxExt;
        return this;
    }

    @JsonProperty("teleDescription")
    public String getTeleDescription() {
        return teleDescription;
    }

    @JsonProperty("teleDescription")
    public void setTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
    }

    public VendorMaintenanceAddress100GetResponse withTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
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

    public VendorMaintenanceAddress100GetResponse withStatDescription(String statDescription) {
        this.statDescription = statDescription;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public Double getCorrectionDigit() {
        return correctionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public void setCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
    }

    public VendorMaintenanceAddress100GetResponse withCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
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

    public VendorMaintenanceAddress100GetResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public VendorMaintenanceAddress100GetResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public Double getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public void setDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public VendorMaintenanceAddress100GetResponse withDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
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

    public VendorMaintenanceAddress100GetResponse withStatCode(String statCode) {
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

    public VendorMaintenanceAddress100GetResponse withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public VendorMaintenanceAddress100GetResponse withSeqno(Double seqno) {
        this.seqno = seqno;
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

    public VendorMaintenanceAddress100GetResponse withPhoneCtry(String phoneCtry) {
        this.phoneCtry = phoneCtry;
        return this;
    }

    /**
     * Phone Message
     * <p>
     * 
     * 
     */
    @JsonProperty("morePhoneMsg")
    public String getMorePhoneMsg() {
        return morePhoneMsg;
    }

    /**
     * Phone Message
     * <p>
     * 
     * 
     */
    @JsonProperty("morePhoneMsg")
    public void setMorePhoneMsg(String morePhoneMsg) {
        this.morePhoneMsg = morePhoneMsg;
    }

    public VendorMaintenanceAddress100GetResponse withMorePhoneMsg(String morePhoneMsg) {
        this.morePhoneMsg = morePhoneMsg;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public VendorMaintenanceAddress100GetResponse withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public VendorMaintenanceAddress100GetResponse withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    @JsonProperty("natnDescription")
    public String getNatnDescription() {
        return natnDescription;
    }

    @JsonProperty("natnDescription")
    public void setNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
    }

    public VendorMaintenanceAddress100GetResponse withNatnDescription(String natnDescription) {
        this.natnDescription = natnDescription;
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

    public VendorMaintenanceAddress100GetResponse withTeleCode(String teleCode) {
        this.teleCode = teleCode;
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

    public VendorMaintenanceAddress100GetResponse withCntyDescription(String cntyDescription) {
        this.cntyDescription = cntyDescription;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public VendorMaintenanceAddress100GetResponse withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Fax Number
     * <p>
     * 
     * 
     */
    @JsonProperty("faxArea")
    public String getFaxArea() {
        return faxArea;
    }

    /**
     * Fax Number
     * <p>
     * 
     * 
     */
    @JsonProperty("faxArea")
    public void setFaxArea(String faxArea) {
        this.faxArea = faxArea;
    }

    public VendorMaintenanceAddress100GetResponse withFaxArea(String faxArea) {
        this.faxArea = faxArea;
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

    public VendorMaintenanceAddress100GetResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public VendorMaintenanceAddress100GetResponse withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public VendorMaintenanceAddress100GetResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    @JsonProperty("atypDescription")
    public String getAtypDescription() {
        return atypDescription;
    }

    @JsonProperty("atypDescription")
    public void setAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
    }

    public VendorMaintenanceAddress100GetResponse withAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
        return this;
    }

    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    public String getGstTaxId() {
        return gstTaxId;
    }

    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    public void setGstTaxId(String gstTaxId) {
        this.gstTaxId = gstTaxId;
    }

    public VendorMaintenanceAddress100GetResponse withGstTaxId(String gstTaxId) {
        this.gstTaxId = gstTaxId;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRADDR_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRADDR_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public VendorMaintenanceAddress100GetResponse withUser(String user) {
        this.user = user;
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

    public VendorMaintenanceAddress100GetResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public VendorMaintenanceAddress100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceAddress100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
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
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("faxExt");
        sb.append('=');
        sb.append(((this.faxExt == null)?"<null>":this.faxExt));
        sb.append(',');
        sb.append("teleDescription");
        sb.append('=');
        sb.append(((this.teleDescription == null)?"<null>":this.teleDescription));
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
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("deliveryPoint");
        sb.append('=');
        sb.append(((this.deliveryPoint == null)?"<null>":this.deliveryPoint));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("phoneCtry");
        sb.append('=');
        sb.append(((this.phoneCtry == null)?"<null>":this.phoneCtry));
        sb.append(',');
        sb.append("morePhoneMsg");
        sb.append('=');
        sb.append(((this.morePhoneMsg == null)?"<null>":this.morePhoneMsg));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("natnDescription");
        sb.append('=');
        sb.append(((this.natnDescription == null)?"<null>":this.natnDescription));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("cntyDescription");
        sb.append('=');
        sb.append(((this.cntyDescription == null)?"<null>":this.cntyDescription));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("faxArea");
        sb.append('=');
        sb.append(((this.faxArea == null)?"<null>":this.faxArea));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("atypDescription");
        sb.append('=');
        sb.append(((this.atypDescription == null)?"<null>":this.atypDescription));
        sb.append(',');
        sb.append("gstTaxId");
        sb.append('=');
        sb.append(((this.gstTaxId == null)?"<null>":this.gstTaxId));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
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
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine4 == null)? 0 :this.streetLine4 .hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.faxExt == null)? 0 :this.faxExt.hashCode()));
        result = ((result* 31)+((this.teleDescription == null)? 0 :this.teleDescription.hashCode()));
        result = ((result* 31)+((this.statDescription == null)? 0 :this.statDescription.hashCode()));
        result = ((result* 31)+((this.correctionDigit == null)? 0 :this.correctionDigit.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.deliveryPoint == null)? 0 :this.deliveryPoint.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.phoneCtry == null)? 0 :this.phoneCtry.hashCode()));
        result = ((result* 31)+((this.morePhoneMsg == null)? 0 :this.morePhoneMsg.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.natnDescription == null)? 0 :this.natnDescription.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.cntyDescription == null)? 0 :this.cntyDescription.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.faxArea == null)? 0 :this.faxArea.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.atypDescription == null)? 0 :this.atypDescription.hashCode()));
        result = ((result* 31)+((this.gstTaxId == null)? 0 :this.gstTaxId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceAddress100GetResponse) == false) {
            return false;
        }
        VendorMaintenanceAddress100GetResponse rhs = ((VendorMaintenanceAddress100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine4 == rhs.streetLine4)||((this.streetLine4 != null)&&this.streetLine4 .equals(rhs.streetLine4))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.faxExt == rhs.faxExt)||((this.faxExt!= null)&&this.faxExt.equals(rhs.faxExt))))&&((this.teleDescription == rhs.teleDescription)||((this.teleDescription!= null)&&this.teleDescription.equals(rhs.teleDescription))))&&((this.statDescription == rhs.statDescription)||((this.statDescription!= null)&&this.statDescription.equals(rhs.statDescription))))&&((this.correctionDigit == rhs.correctionDigit)||((this.correctionDigit!= null)&&this.correctionDigit.equals(rhs.correctionDigit))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.deliveryPoint == rhs.deliveryPoint)||((this.deliveryPoint!= null)&&this.deliveryPoint.equals(rhs.deliveryPoint))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.phoneCtry == rhs.phoneCtry)||((this.phoneCtry!= null)&&this.phoneCtry.equals(rhs.phoneCtry))))&&((this.morePhoneMsg == rhs.morePhoneMsg)||((this.morePhoneMsg!= null)&&this.morePhoneMsg.equals(rhs.morePhoneMsg))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.natnDescription == rhs.natnDescription)||((this.natnDescription!= null)&&this.natnDescription.equals(rhs.natnDescription))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.cntyDescription == rhs.cntyDescription)||((this.cntyDescription!= null)&&this.cntyDescription.equals(rhs.cntyDescription))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.faxArea == rhs.faxArea)||((this.faxArea!= null)&&this.faxArea.equals(rhs.faxArea))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.atypDescription == rhs.atypDescription)||((this.atypDescription!= null)&&this.atypDescription.equals(rhs.atypDescription))))&&((this.gstTaxId == rhs.gstTaxId)||((this.gstTaxId!= null)&&this.gstTaxId.equals(rhs.gstTaxId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
