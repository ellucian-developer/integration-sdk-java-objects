
package com.ellucian.generated.bpapi.ban.requisition.v1_0_0;

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
    "vendorFaxNum",
    "vendorStreetLine2",
    "vendorStreetLine1",
    "displayShipPhoneArea",
    "currCode",
    "tgrpCode",
    "vendorNatnCode",
    "displayOrgnTitle",
    "displaySingleAcctgInd",
    "vendorSpridenId",
    "vendorStreetLine3",
    "vendorCity",
    "phoneNum",
    "displayShipFloor",
    "orgnCode",
    "displayReqhSuspInd",
    "textInd",
    "vendorStatCode",
    "reqhDate",
    "discCode",
    "attentionTo",
    "displayCoasTitle",
    "displayShipState",
    "faxArea",
    "vendEmailAddr",
    "atypSeqNum",
    "displayAccountingTotal",
    "name",
    "phoneArea",
    "vendorSpridenName",
    "displayShipPhoneExt",
    "vendorFaxExt",
    "displayShipBuilding",
    "displayShipCity",
    "code",
    "reqdDate",
    "deliveryComment",
    "coasCode",
    "displayShipNation",
    "vendorTgrpDesc",
    "vendorCurrDesc",
    "vendorPhoneExt",
    "vendorPhoneNum",
    "faxExt",
    "transDate",
    "vendorDiscDesc",
    "displayShipPhoneNum",
    "phoneExt",
    "displayShipZipCode",
    "displayShipAddrLine3",
    "displayCommodityTotal",
    "vendorContact",
    "shipCode",
    "vendorFaxArea",
    "vendorPhoneArea",
    "emailAddr",
    "displayShipAddrLine2",
    "displayShipAddrLine1",
    "faxNumber",
    "vendorHold",
    "vendorZip",
    "displayShipContact",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class Requisition100GetResponse {

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxNum")
    private String vendorFaxNum;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine2")
    private String vendorStreetLine2;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine1")
    private String vendorStreetLine1;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneArea")
    private String displayShipPhoneArea;
    /**
     * Currency
     * <p>
     * Lineage reference object : FPBREQH_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBREQH_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorNatnCode")
    private String vendorNatnCode;
    @JsonProperty("displayOrgnTitle")
    private String displayOrgnTitle;
    /**
     * Document Level Accounting
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySingleAcctgInd")
    private String displaySingleAcctgInd;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorSpridenId")
    private String vendorSpridenId;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine3")
    private String vendorStreetLine3;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCity")
    private String vendorCity;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBREQH_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_PHONE_NUM")
    private String phoneNum;
    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipFloor")
    private String displayShipFloor;
    /**
     * Organization
     * <p>
     * Lineage reference object : FPBREQH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ORGN_CODE")
    private String orgnCode;
    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqhSuspInd")
    private String displayReqhSuspInd;
    /**
     * Document Text
     * <p>
     * Lineage reference object : FPBREQH_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TEXT_IND")
    private String textInd;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStatCode")
    private String vendorStatCode;
    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqhDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQH_DATE")
    private Date reqhDate;
    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_DISC_CODE, Lookup lineage reference object : ftvdisc")
    private String discCode;
    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBREQH_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATTENTION_TO")
    private String attentionTo;
    @JsonProperty("displayCoasTitle")
    private String displayCoasTitle;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipState")
    private String displayShipState;
    /**
     * Fax
     * <p>
     * Lineage reference object : FPBREQH_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_FAX_AREA")
    private String faxArea;
    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_VEND_EMAIL_ADDR")
    private String vendEmailAddr;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATYP_SEQ_NUM")
    private Double atypSeqNum;
    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAccountingTotal")
    private Double displayAccountingTotal;
    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBREQH_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_NAME")
    private String name;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBREQH_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_PHONE_AREA")
    private String phoneArea;
    @JsonProperty("vendorSpridenName")
    private String vendorSpridenName;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneExt")
    private String displayShipPhoneExt;
    @JsonProperty("vendorFaxExt")
    private String vendorFaxExt;
    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBuilding")
    private String displayShipBuilding;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipCity")
    private String displayShipCity;
    /**
     * Requisition
     * <p>
     * Lineage reference object : FPBREQH_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_CODE")
    private String code;
    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQD_DATE")
    private Date reqdDate;
    /**
     * Comments
     * <p>
     * Lineage reference object : FPBREQH_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_DELIVERY_COMMENT")
    private String deliveryComment;
    /**
     * COA
     * <p>
     * Lineage reference object : FPBREQH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipNation")
    private String displayShipNation;
    @JsonProperty("vendorTgrpDesc")
    private String vendorTgrpDesc;
    @JsonProperty("vendorCurrDesc")
    private String vendorCurrDesc;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneExt")
    private String vendorPhoneExt;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneNum")
    private String vendorPhoneNum;
    /**
     * Lineage reference object : FPBREQH_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_FAX_EXT")
    private String faxExt;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TRANS_DATE")
    private Date transDate;
    @JsonProperty("vendorDiscDesc")
    private String vendorDiscDesc;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneNum")
    private String displayShipPhoneNum;
    /**
     * Extension
     * <p>
     * Lineage reference object : FPBREQH_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_PHONE_EXT")
    private String phoneExt;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    private String displayShipZipCode;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine3")
    private String displayShipAddrLine3;
    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommodityTotal")
    private Double displayCommodityTotal;
    /**
     * Contact
     * <p>
     * Lineage reference object : FPBREQH_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_VENDOR_CONTACT")
    private String vendorContact;
    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_SHIP_CODE, Lookup lineage reference object : ftvship")
    private String shipCode;
    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxArea")
    private String vendorFaxArea;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneArea")
    private String vendorPhoneArea;
    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_EMAIL_ADDR")
    private String emailAddr;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine2")
    private String displayShipAddrLine2;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine1")
    private String displayShipAddrLine1;
    /**
     * Phone
     * <p>
     * Lineage reference object : FPBREQH_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_FAX_NUMBER")
    private String faxNumber;
    /**
     * Vendor Hold
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorHold")
    private String vendorHold;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorZip")
    private String vendorZip;
    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipContact")
    private String displayShipContact;
    /**
     * Address Type
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATYP_CODE")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxNum")
    public String getVendorFaxNum() {
        return vendorFaxNum;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxNum")
    public void setVendorFaxNum(String vendorFaxNum) {
        this.vendorFaxNum = vendorFaxNum;
    }

    public Requisition100GetResponse withVendorFaxNum(String vendorFaxNum) {
        this.vendorFaxNum = vendorFaxNum;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine2")
    public String getVendorStreetLine2() {
        return vendorStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine2")
    public void setVendorStreetLine2(String vendorStreetLine2) {
        this.vendorStreetLine2 = vendorStreetLine2;
    }

    public Requisition100GetResponse withVendorStreetLine2(String vendorStreetLine2) {
        this.vendorStreetLine2 = vendorStreetLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine1")
    public String getVendorStreetLine1() {
        return vendorStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine1")
    public void setVendorStreetLine1(String vendorStreetLine1) {
        this.vendorStreetLine1 = vendorStreetLine1;
    }

    public Requisition100GetResponse withVendorStreetLine1(String vendorStreetLine1) {
        this.vendorStreetLine1 = vendorStreetLine1;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneArea")
    public String getDisplayShipPhoneArea() {
        return displayShipPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneArea")
    public void setDisplayShipPhoneArea(String displayShipPhoneArea) {
        this.displayShipPhoneArea = displayShipPhoneArea;
    }

    public Requisition100GetResponse withDisplayShipPhoneArea(String displayShipPhoneArea) {
        this.displayShipPhoneArea = displayShipPhoneArea;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FPBREQH_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FPBREQH_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Requisition100GetResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBREQH_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBREQH_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public Requisition100GetResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorNatnCode")
    public String getVendorNatnCode() {
        return vendorNatnCode;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorNatnCode")
    public void setVendorNatnCode(String vendorNatnCode) {
        this.vendorNatnCode = vendorNatnCode;
    }

    public Requisition100GetResponse withVendorNatnCode(String vendorNatnCode) {
        this.vendorNatnCode = vendorNatnCode;
        return this;
    }

    @JsonProperty("displayOrgnTitle")
    public String getDisplayOrgnTitle() {
        return displayOrgnTitle;
    }

    @JsonProperty("displayOrgnTitle")
    public void setDisplayOrgnTitle(String displayOrgnTitle) {
        this.displayOrgnTitle = displayOrgnTitle;
    }

    public Requisition100GetResponse withDisplayOrgnTitle(String displayOrgnTitle) {
        this.displayOrgnTitle = displayOrgnTitle;
        return this;
    }

    /**
     * Document Level Accounting
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySingleAcctgInd")
    public String getDisplaySingleAcctgInd() {
        return displaySingleAcctgInd;
    }

    /**
     * Document Level Accounting
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySingleAcctgInd")
    public void setDisplaySingleAcctgInd(String displaySingleAcctgInd) {
        this.displaySingleAcctgInd = displaySingleAcctgInd;
    }

    public Requisition100GetResponse withDisplaySingleAcctgInd(String displaySingleAcctgInd) {
        this.displaySingleAcctgInd = displaySingleAcctgInd;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorSpridenId")
    public String getVendorSpridenId() {
        return vendorSpridenId;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorSpridenId")
    public void setVendorSpridenId(String vendorSpridenId) {
        this.vendorSpridenId = vendorSpridenId;
    }

    public Requisition100GetResponse withVendorSpridenId(String vendorSpridenId) {
        this.vendorSpridenId = vendorSpridenId;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine3")
    public String getVendorStreetLine3() {
        return vendorStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStreetLine3")
    public void setVendorStreetLine3(String vendorStreetLine3) {
        this.vendorStreetLine3 = vendorStreetLine3;
    }

    public Requisition100GetResponse withVendorStreetLine3(String vendorStreetLine3) {
        this.vendorStreetLine3 = vendorStreetLine3;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCity")
    public String getVendorCity() {
        return vendorCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCity")
    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public Requisition100GetResponse withVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBREQH_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBREQH_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Requisition100GetResponse withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipFloor")
    public String getDisplayShipFloor() {
        return displayShipFloor;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipFloor")
    public void setDisplayShipFloor(String displayShipFloor) {
        this.displayShipFloor = displayShipFloor;
    }

    public Requisition100GetResponse withDisplayShipFloor(String displayShipFloor) {
        this.displayShipFloor = displayShipFloor;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FPBREQH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FPBREQH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public Requisition100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqhSuspInd")
    public String getDisplayReqhSuspInd() {
        return displayReqhSuspInd;
    }

    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqhSuspInd")
    public void setDisplayReqhSuspInd(String displayReqhSuspInd) {
        this.displayReqhSuspInd = displayReqhSuspInd;
    }

    public Requisition100GetResponse withDisplayReqhSuspInd(String displayReqhSuspInd) {
        this.displayReqhSuspInd = displayReqhSuspInd;
        return this;
    }

    /**
     * Document Text
     * <p>
     * Lineage reference object : FPBREQH_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    public String getTextInd() {
        return textInd;
    }

    /**
     * Document Text
     * <p>
     * Lineage reference object : FPBREQH_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    public void setTextInd(String textInd) {
        this.textInd = textInd;
    }

    public Requisition100GetResponse withTextInd(String textInd) {
        this.textInd = textInd;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStatCode")
    public String getVendorStatCode() {
        return vendorStatCode;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorStatCode")
    public void setVendorStatCode(String vendorStatCode) {
        this.vendorStatCode = vendorStatCode;
    }

    public Requisition100GetResponse withVendorStatCode(String vendorStatCode) {
        this.vendorStatCode = vendorStatCode;
        return this;
    }

    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqhDate")
    public Date getReqhDate() {
        return reqhDate;
    }

    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqhDate")
    public void setReqhDate(Date reqhDate) {
        this.reqhDate = reqhDate;
    }

    public Requisition100GetResponse withReqhDate(Date reqhDate) {
        this.reqhDate = reqhDate;
        return this;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public String getDiscCode() {
        return discCode;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public void setDiscCode(String discCode) {
        this.discCode = discCode;
    }

    public Requisition100GetResponse withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBREQH_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    public String getAttentionTo() {
        return attentionTo;
    }

    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBREQH_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    public void setAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
    }

    public Requisition100GetResponse withAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
        return this;
    }

    @JsonProperty("displayCoasTitle")
    public String getDisplayCoasTitle() {
        return displayCoasTitle;
    }

    @JsonProperty("displayCoasTitle")
    public void setDisplayCoasTitle(String displayCoasTitle) {
        this.displayCoasTitle = displayCoasTitle;
    }

    public Requisition100GetResponse withDisplayCoasTitle(String displayCoasTitle) {
        this.displayCoasTitle = displayCoasTitle;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipState")
    public String getDisplayShipState() {
        return displayShipState;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipState")
    public void setDisplayShipState(String displayShipState) {
        this.displayShipState = displayShipState;
    }

    public Requisition100GetResponse withDisplayShipState(String displayShipState) {
        this.displayShipState = displayShipState;
        return this;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FPBREQH_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    public String getFaxArea() {
        return faxArea;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FPBREQH_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    public void setFaxArea(String faxArea) {
        this.faxArea = faxArea;
    }

    public Requisition100GetResponse withFaxArea(String faxArea) {
        this.faxArea = faxArea;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    public String getVendEmailAddr() {
        return vendEmailAddr;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    public void setVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
    }

    public Requisition100GetResponse withVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public Double getAtypSeqNum() {
        return atypSeqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public void setAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
    }

    public Requisition100GetResponse withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
        return this;
    }

    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAccountingTotal")
    public Double getDisplayAccountingTotal() {
        return displayAccountingTotal;
    }

    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAccountingTotal")
    public void setDisplayAccountingTotal(Double displayAccountingTotal) {
        this.displayAccountingTotal = displayAccountingTotal;
    }

    public Requisition100GetResponse withDisplayAccountingTotal(Double displayAccountingTotal) {
        this.displayAccountingTotal = displayAccountingTotal;
        return this;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBREQH_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBREQH_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Requisition100GetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBREQH_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBREQH_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public Requisition100GetResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    @JsonProperty("vendorSpridenName")
    public String getVendorSpridenName() {
        return vendorSpridenName;
    }

    @JsonProperty("vendorSpridenName")
    public void setVendorSpridenName(String vendorSpridenName) {
        this.vendorSpridenName = vendorSpridenName;
    }

    public Requisition100GetResponse withVendorSpridenName(String vendorSpridenName) {
        this.vendorSpridenName = vendorSpridenName;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneExt")
    public String getDisplayShipPhoneExt() {
        return displayShipPhoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneExt")
    public void setDisplayShipPhoneExt(String displayShipPhoneExt) {
        this.displayShipPhoneExt = displayShipPhoneExt;
    }

    public Requisition100GetResponse withDisplayShipPhoneExt(String displayShipPhoneExt) {
        this.displayShipPhoneExt = displayShipPhoneExt;
        return this;
    }

    @JsonProperty("vendorFaxExt")
    public String getVendorFaxExt() {
        return vendorFaxExt;
    }

    @JsonProperty("vendorFaxExt")
    public void setVendorFaxExt(String vendorFaxExt) {
        this.vendorFaxExt = vendorFaxExt;
    }

    public Requisition100GetResponse withVendorFaxExt(String vendorFaxExt) {
        this.vendorFaxExt = vendorFaxExt;
        return this;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBuilding")
    public String getDisplayShipBuilding() {
        return displayShipBuilding;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBuilding")
    public void setDisplayShipBuilding(String displayShipBuilding) {
        this.displayShipBuilding = displayShipBuilding;
    }

    public Requisition100GetResponse withDisplayShipBuilding(String displayShipBuilding) {
        this.displayShipBuilding = displayShipBuilding;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipCity")
    public String getDisplayShipCity() {
        return displayShipCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipCity")
    public void setDisplayShipCity(String displayShipCity) {
        this.displayShipCity = displayShipCity;
    }

    public Requisition100GetResponse withDisplayShipCity(String displayShipCity) {
        this.displayShipCity = displayShipCity;
        return this;
    }

    /**
     * Requisition
     * <p>
     * Lineage reference object : FPBREQH_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Requisition
     * <p>
     * Lineage reference object : FPBREQH_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Requisition100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    public Date getReqdDate() {
        return reqdDate;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    public void setReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
    }

    public Requisition100GetResponse withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : FPBREQH_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    public String getDeliveryComment() {
        return deliveryComment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : FPBREQH_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }

    public Requisition100GetResponse withDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBREQH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBREQH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Requisition100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipNation")
    public String getDisplayShipNation() {
        return displayShipNation;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipNation")
    public void setDisplayShipNation(String displayShipNation) {
        this.displayShipNation = displayShipNation;
    }

    public Requisition100GetResponse withDisplayShipNation(String displayShipNation) {
        this.displayShipNation = displayShipNation;
        return this;
    }

    @JsonProperty("vendorTgrpDesc")
    public String getVendorTgrpDesc() {
        return vendorTgrpDesc;
    }

    @JsonProperty("vendorTgrpDesc")
    public void setVendorTgrpDesc(String vendorTgrpDesc) {
        this.vendorTgrpDesc = vendorTgrpDesc;
    }

    public Requisition100GetResponse withVendorTgrpDesc(String vendorTgrpDesc) {
        this.vendorTgrpDesc = vendorTgrpDesc;
        return this;
    }

    @JsonProperty("vendorCurrDesc")
    public String getVendorCurrDesc() {
        return vendorCurrDesc;
    }

    @JsonProperty("vendorCurrDesc")
    public void setVendorCurrDesc(String vendorCurrDesc) {
        this.vendorCurrDesc = vendorCurrDesc;
    }

    public Requisition100GetResponse withVendorCurrDesc(String vendorCurrDesc) {
        this.vendorCurrDesc = vendorCurrDesc;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneExt")
    public String getVendorPhoneExt() {
        return vendorPhoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneExt")
    public void setVendorPhoneExt(String vendorPhoneExt) {
        this.vendorPhoneExt = vendorPhoneExt;
    }

    public Requisition100GetResponse withVendorPhoneExt(String vendorPhoneExt) {
        this.vendorPhoneExt = vendorPhoneExt;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneNum")
    public String getVendorPhoneNum() {
        return vendorPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneNum")
    public void setVendorPhoneNum(String vendorPhoneNum) {
        this.vendorPhoneNum = vendorPhoneNum;
    }

    public Requisition100GetResponse withVendorPhoneNum(String vendorPhoneNum) {
        this.vendorPhoneNum = vendorPhoneNum;
        return this;
    }

    /**
     * Lineage reference object : FPBREQH_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public String getFaxExt() {
        return faxExt;
    }

    /**
     * Lineage reference object : FPBREQH_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    public Requisition100GetResponse withFaxExt(String faxExt) {
        this.faxExt = faxExt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Requisition100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("vendorDiscDesc")
    public String getVendorDiscDesc() {
        return vendorDiscDesc;
    }

    @JsonProperty("vendorDiscDesc")
    public void setVendorDiscDesc(String vendorDiscDesc) {
        this.vendorDiscDesc = vendorDiscDesc;
    }

    public Requisition100GetResponse withVendorDiscDesc(String vendorDiscDesc) {
        this.vendorDiscDesc = vendorDiscDesc;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneNum")
    public String getDisplayShipPhoneNum() {
        return displayShipPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneNum")
    public void setDisplayShipPhoneNum(String displayShipPhoneNum) {
        this.displayShipPhoneNum = displayShipPhoneNum;
    }

    public Requisition100GetResponse withDisplayShipPhoneNum(String displayShipPhoneNum) {
        this.displayShipPhoneNum = displayShipPhoneNum;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FPBREQH_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FPBREQH_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public Requisition100GetResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    public String getDisplayShipZipCode() {
        return displayShipZipCode;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    public void setDisplayShipZipCode(String displayShipZipCode) {
        this.displayShipZipCode = displayShipZipCode;
    }

    public Requisition100GetResponse withDisplayShipZipCode(String displayShipZipCode) {
        this.displayShipZipCode = displayShipZipCode;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine3")
    public String getDisplayShipAddrLine3() {
        return displayShipAddrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine3")
    public void setDisplayShipAddrLine3(String displayShipAddrLine3) {
        this.displayShipAddrLine3 = displayShipAddrLine3;
    }

    public Requisition100GetResponse withDisplayShipAddrLine3(String displayShipAddrLine3) {
        this.displayShipAddrLine3 = displayShipAddrLine3;
        return this;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommodityTotal")
    public Double getDisplayCommodityTotal() {
        return displayCommodityTotal;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommodityTotal")
    public void setDisplayCommodityTotal(Double displayCommodityTotal) {
        this.displayCommodityTotal = displayCommodityTotal;
    }

    public Requisition100GetResponse withDisplayCommodityTotal(Double displayCommodityTotal) {
        this.displayCommodityTotal = displayCommodityTotal;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FPBREQH_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    public String getVendorContact() {
        return vendorContact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FPBREQH_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    public void setVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
    }

    public Requisition100GetResponse withVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
        return this;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public Requisition100GetResponse withShipCode(String shipCode) {
        this.shipCode = shipCode;
        return this;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxArea")
    public String getVendorFaxArea() {
        return vendorFaxArea;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorFaxArea")
    public void setVendorFaxArea(String vendorFaxArea) {
        this.vendorFaxArea = vendorFaxArea;
    }

    public Requisition100GetResponse withVendorFaxArea(String vendorFaxArea) {
        this.vendorFaxArea = vendorFaxArea;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneArea")
    public String getVendorPhoneArea() {
        return vendorPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorPhoneArea")
    public void setVendorPhoneArea(String vendorPhoneArea) {
        this.vendorPhoneArea = vendorPhoneArea;
    }

    public Requisition100GetResponse withVendorPhoneArea(String vendorPhoneArea) {
        this.vendorPhoneArea = vendorPhoneArea;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBREQH_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public Requisition100GetResponse withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine2")
    public String getDisplayShipAddrLine2() {
        return displayShipAddrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine2")
    public void setDisplayShipAddrLine2(String displayShipAddrLine2) {
        this.displayShipAddrLine2 = displayShipAddrLine2;
    }

    public Requisition100GetResponse withDisplayShipAddrLine2(String displayShipAddrLine2) {
        this.displayShipAddrLine2 = displayShipAddrLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine1")
    public String getDisplayShipAddrLine1() {
        return displayShipAddrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddrLine1")
    public void setDisplayShipAddrLine1(String displayShipAddrLine1) {
        this.displayShipAddrLine1 = displayShipAddrLine1;
    }

    public Requisition100GetResponse withDisplayShipAddrLine1(String displayShipAddrLine1) {
        this.displayShipAddrLine1 = displayShipAddrLine1;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FPBREQH_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FPBREQH_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Requisition100GetResponse withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    /**
     * Vendor Hold
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorHold")
    public String getVendorHold() {
        return vendorHold;
    }

    /**
     * Vendor Hold
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorHold")
    public void setVendorHold(String vendorHold) {
        this.vendorHold = vendorHold;
    }

    public Requisition100GetResponse withVendorHold(String vendorHold) {
        this.vendorHold = vendorHold;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorZip")
    public String getVendorZip() {
        return vendorZip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorZip")
    public void setVendorZip(String vendorZip) {
        this.vendorZip = vendorZip;
    }

    public Requisition100GetResponse withVendorZip(String vendorZip) {
        this.vendorZip = vendorZip;
        return this;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipContact")
    public String getDisplayShipContact() {
        return displayShipContact;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipContact")
    public void setDisplayShipContact(String displayShipContact) {
        this.displayShipContact = displayShipContact;
    }

    public Requisition100GetResponse withDisplayShipContact(String displayShipContact) {
        this.displayShipContact = displayShipContact;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public Requisition100GetResponse withAtypCode(String atypCode) {
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

    public Requisition100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Requisition100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendorFaxNum");
        sb.append('=');
        sb.append(((this.vendorFaxNum == null)?"<null>":this.vendorFaxNum));
        sb.append(',');
        sb.append("vendorStreetLine2");
        sb.append('=');
        sb.append(((this.vendorStreetLine2 == null)?"<null>":this.vendorStreetLine2));
        sb.append(',');
        sb.append("vendorStreetLine1");
        sb.append('=');
        sb.append(((this.vendorStreetLine1 == null)?"<null>":this.vendorStreetLine1));
        sb.append(',');
        sb.append("displayShipPhoneArea");
        sb.append('=');
        sb.append(((this.displayShipPhoneArea == null)?"<null>":this.displayShipPhoneArea));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("vendorNatnCode");
        sb.append('=');
        sb.append(((this.vendorNatnCode == null)?"<null>":this.vendorNatnCode));
        sb.append(',');
        sb.append("displayOrgnTitle");
        sb.append('=');
        sb.append(((this.displayOrgnTitle == null)?"<null>":this.displayOrgnTitle));
        sb.append(',');
        sb.append("displaySingleAcctgInd");
        sb.append('=');
        sb.append(((this.displaySingleAcctgInd == null)?"<null>":this.displaySingleAcctgInd));
        sb.append(',');
        sb.append("vendorSpridenId");
        sb.append('=');
        sb.append(((this.vendorSpridenId == null)?"<null>":this.vendorSpridenId));
        sb.append(',');
        sb.append("vendorStreetLine3");
        sb.append('=');
        sb.append(((this.vendorStreetLine3 == null)?"<null>":this.vendorStreetLine3));
        sb.append(',');
        sb.append("vendorCity");
        sb.append('=');
        sb.append(((this.vendorCity == null)?"<null>":this.vendorCity));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("displayShipFloor");
        sb.append('=');
        sb.append(((this.displayShipFloor == null)?"<null>":this.displayShipFloor));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("displayReqhSuspInd");
        sb.append('=');
        sb.append(((this.displayReqhSuspInd == null)?"<null>":this.displayReqhSuspInd));
        sb.append(',');
        sb.append("textInd");
        sb.append('=');
        sb.append(((this.textInd == null)?"<null>":this.textInd));
        sb.append(',');
        sb.append("vendorStatCode");
        sb.append('=');
        sb.append(((this.vendorStatCode == null)?"<null>":this.vendorStatCode));
        sb.append(',');
        sb.append("reqhDate");
        sb.append('=');
        sb.append(((this.reqhDate == null)?"<null>":this.reqhDate));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("attentionTo");
        sb.append('=');
        sb.append(((this.attentionTo == null)?"<null>":this.attentionTo));
        sb.append(',');
        sb.append("displayCoasTitle");
        sb.append('=');
        sb.append(((this.displayCoasTitle == null)?"<null>":this.displayCoasTitle));
        sb.append(',');
        sb.append("displayShipState");
        sb.append('=');
        sb.append(((this.displayShipState == null)?"<null>":this.displayShipState));
        sb.append(',');
        sb.append("faxArea");
        sb.append('=');
        sb.append(((this.faxArea == null)?"<null>":this.faxArea));
        sb.append(',');
        sb.append("vendEmailAddr");
        sb.append('=');
        sb.append(((this.vendEmailAddr == null)?"<null>":this.vendEmailAddr));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("displayAccountingTotal");
        sb.append('=');
        sb.append(((this.displayAccountingTotal == null)?"<null>":this.displayAccountingTotal));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("vendorSpridenName");
        sb.append('=');
        sb.append(((this.vendorSpridenName == null)?"<null>":this.vendorSpridenName));
        sb.append(',');
        sb.append("displayShipPhoneExt");
        sb.append('=');
        sb.append(((this.displayShipPhoneExt == null)?"<null>":this.displayShipPhoneExt));
        sb.append(',');
        sb.append("vendorFaxExt");
        sb.append('=');
        sb.append(((this.vendorFaxExt == null)?"<null>":this.vendorFaxExt));
        sb.append(',');
        sb.append("displayShipBuilding");
        sb.append('=');
        sb.append(((this.displayShipBuilding == null)?"<null>":this.displayShipBuilding));
        sb.append(',');
        sb.append("displayShipCity");
        sb.append('=');
        sb.append(((this.displayShipCity == null)?"<null>":this.displayShipCity));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("deliveryComment");
        sb.append('=');
        sb.append(((this.deliveryComment == null)?"<null>":this.deliveryComment));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("displayShipNation");
        sb.append('=');
        sb.append(((this.displayShipNation == null)?"<null>":this.displayShipNation));
        sb.append(',');
        sb.append("vendorTgrpDesc");
        sb.append('=');
        sb.append(((this.vendorTgrpDesc == null)?"<null>":this.vendorTgrpDesc));
        sb.append(',');
        sb.append("vendorCurrDesc");
        sb.append('=');
        sb.append(((this.vendorCurrDesc == null)?"<null>":this.vendorCurrDesc));
        sb.append(',');
        sb.append("vendorPhoneExt");
        sb.append('=');
        sb.append(((this.vendorPhoneExt == null)?"<null>":this.vendorPhoneExt));
        sb.append(',');
        sb.append("vendorPhoneNum");
        sb.append('=');
        sb.append(((this.vendorPhoneNum == null)?"<null>":this.vendorPhoneNum));
        sb.append(',');
        sb.append("faxExt");
        sb.append('=');
        sb.append(((this.faxExt == null)?"<null>":this.faxExt));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("vendorDiscDesc");
        sb.append('=');
        sb.append(((this.vendorDiscDesc == null)?"<null>":this.vendorDiscDesc));
        sb.append(',');
        sb.append("displayShipPhoneNum");
        sb.append('=');
        sb.append(((this.displayShipPhoneNum == null)?"<null>":this.displayShipPhoneNum));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("displayShipZipCode");
        sb.append('=');
        sb.append(((this.displayShipZipCode == null)?"<null>":this.displayShipZipCode));
        sb.append(',');
        sb.append("displayShipAddrLine3");
        sb.append('=');
        sb.append(((this.displayShipAddrLine3 == null)?"<null>":this.displayShipAddrLine3));
        sb.append(',');
        sb.append("displayCommodityTotal");
        sb.append('=');
        sb.append(((this.displayCommodityTotal == null)?"<null>":this.displayCommodityTotal));
        sb.append(',');
        sb.append("vendorContact");
        sb.append('=');
        sb.append(((this.vendorContact == null)?"<null>":this.vendorContact));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("vendorFaxArea");
        sb.append('=');
        sb.append(((this.vendorFaxArea == null)?"<null>":this.vendorFaxArea));
        sb.append(',');
        sb.append("vendorPhoneArea");
        sb.append('=');
        sb.append(((this.vendorPhoneArea == null)?"<null>":this.vendorPhoneArea));
        sb.append(',');
        sb.append("emailAddr");
        sb.append('=');
        sb.append(((this.emailAddr == null)?"<null>":this.emailAddr));
        sb.append(',');
        sb.append("displayShipAddrLine2");
        sb.append('=');
        sb.append(((this.displayShipAddrLine2 == null)?"<null>":this.displayShipAddrLine2));
        sb.append(',');
        sb.append("displayShipAddrLine1");
        sb.append('=');
        sb.append(((this.displayShipAddrLine1 == null)?"<null>":this.displayShipAddrLine1));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("vendorHold");
        sb.append('=');
        sb.append(((this.vendorHold == null)?"<null>":this.vendorHold));
        sb.append(',');
        sb.append("vendorZip");
        sb.append('=');
        sb.append(((this.vendorZip == null)?"<null>":this.vendorZip));
        sb.append(',');
        sb.append("displayShipContact");
        sb.append('=');
        sb.append(((this.displayShipContact == null)?"<null>":this.displayShipContact));
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
        result = ((result* 31)+((this.vendorFaxNum == null)? 0 :this.vendorFaxNum.hashCode()));
        result = ((result* 31)+((this.vendorStreetLine2 == null)? 0 :this.vendorStreetLine2 .hashCode()));
        result = ((result* 31)+((this.vendorStreetLine1 == null)? 0 :this.vendorStreetLine1 .hashCode()));
        result = ((result* 31)+((this.displayShipPhoneArea == null)? 0 :this.displayShipPhoneArea.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.vendorNatnCode == null)? 0 :this.vendorNatnCode.hashCode()));
        result = ((result* 31)+((this.displayOrgnTitle == null)? 0 :this.displayOrgnTitle.hashCode()));
        result = ((result* 31)+((this.displaySingleAcctgInd == null)? 0 :this.displaySingleAcctgInd.hashCode()));
        result = ((result* 31)+((this.vendorSpridenId == null)? 0 :this.vendorSpridenId.hashCode()));
        result = ((result* 31)+((this.vendorStreetLine3 == null)? 0 :this.vendorStreetLine3 .hashCode()));
        result = ((result* 31)+((this.vendorCity == null)? 0 :this.vendorCity.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.displayShipFloor == null)? 0 :this.displayShipFloor.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.displayReqhSuspInd == null)? 0 :this.displayReqhSuspInd.hashCode()));
        result = ((result* 31)+((this.textInd == null)? 0 :this.textInd.hashCode()));
        result = ((result* 31)+((this.vendorStatCode == null)? 0 :this.vendorStatCode.hashCode()));
        result = ((result* 31)+((this.reqhDate == null)? 0 :this.reqhDate.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.attentionTo == null)? 0 :this.attentionTo.hashCode()));
        result = ((result* 31)+((this.displayCoasTitle == null)? 0 :this.displayCoasTitle.hashCode()));
        result = ((result* 31)+((this.displayShipState == null)? 0 :this.displayShipState.hashCode()));
        result = ((result* 31)+((this.faxArea == null)? 0 :this.faxArea.hashCode()));
        result = ((result* 31)+((this.vendEmailAddr == null)? 0 :this.vendEmailAddr.hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.displayAccountingTotal == null)? 0 :this.displayAccountingTotal.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.vendorSpridenName == null)? 0 :this.vendorSpridenName.hashCode()));
        result = ((result* 31)+((this.displayShipPhoneExt == null)? 0 :this.displayShipPhoneExt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vendorFaxExt == null)? 0 :this.vendorFaxExt.hashCode()));
        result = ((result* 31)+((this.displayShipBuilding == null)? 0 :this.displayShipBuilding.hashCode()));
        result = ((result* 31)+((this.displayShipCity == null)? 0 :this.displayShipCity.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.deliveryComment == null)? 0 :this.deliveryComment.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.displayShipNation == null)? 0 :this.displayShipNation.hashCode()));
        result = ((result* 31)+((this.vendorTgrpDesc == null)? 0 :this.vendorTgrpDesc.hashCode()));
        result = ((result* 31)+((this.vendorCurrDesc == null)? 0 :this.vendorCurrDesc.hashCode()));
        result = ((result* 31)+((this.vendorPhoneExt == null)? 0 :this.vendorPhoneExt.hashCode()));
        result = ((result* 31)+((this.vendorPhoneNum == null)? 0 :this.vendorPhoneNum.hashCode()));
        result = ((result* 31)+((this.faxExt == null)? 0 :this.faxExt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.vendorDiscDesc == null)? 0 :this.vendorDiscDesc.hashCode()));
        result = ((result* 31)+((this.displayShipPhoneNum == null)? 0 :this.displayShipPhoneNum.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.displayShipZipCode == null)? 0 :this.displayShipZipCode.hashCode()));
        result = ((result* 31)+((this.displayShipAddrLine3 == null)? 0 :this.displayShipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.displayCommodityTotal == null)? 0 :this.displayCommodityTotal.hashCode()));
        result = ((result* 31)+((this.vendorContact == null)? 0 :this.vendorContact.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.vendorFaxArea == null)? 0 :this.vendorFaxArea.hashCode()));
        result = ((result* 31)+((this.vendorPhoneArea == null)? 0 :this.vendorPhoneArea.hashCode()));
        result = ((result* 31)+((this.emailAddr == null)? 0 :this.emailAddr.hashCode()));
        result = ((result* 31)+((this.displayShipAddrLine2 == null)? 0 :this.displayShipAddrLine2 .hashCode()));
        result = ((result* 31)+((this.displayShipAddrLine1 == null)? 0 :this.displayShipAddrLine1 .hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.vendorHold == null)? 0 :this.vendorHold.hashCode()));
        result = ((result* 31)+((this.vendorZip == null)? 0 :this.vendorZip.hashCode()));
        result = ((result* 31)+((this.displayShipContact == null)? 0 :this.displayShipContact.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Requisition100GetResponse) == false) {
            return false;
        }
        Requisition100GetResponse rhs = ((Requisition100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.vendorFaxNum == rhs.vendorFaxNum)||((this.vendorFaxNum!= null)&&this.vendorFaxNum.equals(rhs.vendorFaxNum)))&&((this.vendorStreetLine2 == rhs.vendorStreetLine2)||((this.vendorStreetLine2 != null)&&this.vendorStreetLine2 .equals(rhs.vendorStreetLine2))))&&((this.vendorStreetLine1 == rhs.vendorStreetLine1)||((this.vendorStreetLine1 != null)&&this.vendorStreetLine1 .equals(rhs.vendorStreetLine1))))&&((this.displayShipPhoneArea == rhs.displayShipPhoneArea)||((this.displayShipPhoneArea!= null)&&this.displayShipPhoneArea.equals(rhs.displayShipPhoneArea))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.vendorNatnCode == rhs.vendorNatnCode)||((this.vendorNatnCode!= null)&&this.vendorNatnCode.equals(rhs.vendorNatnCode))))&&((this.displayOrgnTitle == rhs.displayOrgnTitle)||((this.displayOrgnTitle!= null)&&this.displayOrgnTitle.equals(rhs.displayOrgnTitle))))&&((this.displaySingleAcctgInd == rhs.displaySingleAcctgInd)||((this.displaySingleAcctgInd!= null)&&this.displaySingleAcctgInd.equals(rhs.displaySingleAcctgInd))))&&((this.vendorSpridenId == rhs.vendorSpridenId)||((this.vendorSpridenId!= null)&&this.vendorSpridenId.equals(rhs.vendorSpridenId))))&&((this.vendorStreetLine3 == rhs.vendorStreetLine3)||((this.vendorStreetLine3 != null)&&this.vendorStreetLine3 .equals(rhs.vendorStreetLine3))))&&((this.vendorCity == rhs.vendorCity)||((this.vendorCity!= null)&&this.vendorCity.equals(rhs.vendorCity))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.displayShipFloor == rhs.displayShipFloor)||((this.displayShipFloor!= null)&&this.displayShipFloor.equals(rhs.displayShipFloor))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.displayReqhSuspInd == rhs.displayReqhSuspInd)||((this.displayReqhSuspInd!= null)&&this.displayReqhSuspInd.equals(rhs.displayReqhSuspInd))))&&((this.textInd == rhs.textInd)||((this.textInd!= null)&&this.textInd.equals(rhs.textInd))))&&((this.vendorStatCode == rhs.vendorStatCode)||((this.vendorStatCode!= null)&&this.vendorStatCode.equals(rhs.vendorStatCode))))&&((this.reqhDate == rhs.reqhDate)||((this.reqhDate!= null)&&this.reqhDate.equals(rhs.reqhDate))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.attentionTo == rhs.attentionTo)||((this.attentionTo!= null)&&this.attentionTo.equals(rhs.attentionTo))))&&((this.displayCoasTitle == rhs.displayCoasTitle)||((this.displayCoasTitle!= null)&&this.displayCoasTitle.equals(rhs.displayCoasTitle))))&&((this.displayShipState == rhs.displayShipState)||((this.displayShipState!= null)&&this.displayShipState.equals(rhs.displayShipState))))&&((this.faxArea == rhs.faxArea)||((this.faxArea!= null)&&this.faxArea.equals(rhs.faxArea))))&&((this.vendEmailAddr == rhs.vendEmailAddr)||((this.vendEmailAddr!= null)&&this.vendEmailAddr.equals(rhs.vendEmailAddr))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.displayAccountingTotal == rhs.displayAccountingTotal)||((this.displayAccountingTotal!= null)&&this.displayAccountingTotal.equals(rhs.displayAccountingTotal))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.vendorSpridenName == rhs.vendorSpridenName)||((this.vendorSpridenName!= null)&&this.vendorSpridenName.equals(rhs.vendorSpridenName))))&&((this.displayShipPhoneExt == rhs.displayShipPhoneExt)||((this.displayShipPhoneExt!= null)&&this.displayShipPhoneExt.equals(rhs.displayShipPhoneExt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vendorFaxExt == rhs.vendorFaxExt)||((this.vendorFaxExt!= null)&&this.vendorFaxExt.equals(rhs.vendorFaxExt))))&&((this.displayShipBuilding == rhs.displayShipBuilding)||((this.displayShipBuilding!= null)&&this.displayShipBuilding.equals(rhs.displayShipBuilding))))&&((this.displayShipCity == rhs.displayShipCity)||((this.displayShipCity!= null)&&this.displayShipCity.equals(rhs.displayShipCity))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.deliveryComment == rhs.deliveryComment)||((this.deliveryComment!= null)&&this.deliveryComment.equals(rhs.deliveryComment))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.displayShipNation == rhs.displayShipNation)||((this.displayShipNation!= null)&&this.displayShipNation.equals(rhs.displayShipNation))))&&((this.vendorTgrpDesc == rhs.vendorTgrpDesc)||((this.vendorTgrpDesc!= null)&&this.vendorTgrpDesc.equals(rhs.vendorTgrpDesc))))&&((this.vendorCurrDesc == rhs.vendorCurrDesc)||((this.vendorCurrDesc!= null)&&this.vendorCurrDesc.equals(rhs.vendorCurrDesc))))&&((this.vendorPhoneExt == rhs.vendorPhoneExt)||((this.vendorPhoneExt!= null)&&this.vendorPhoneExt.equals(rhs.vendorPhoneExt))))&&((this.vendorPhoneNum == rhs.vendorPhoneNum)||((this.vendorPhoneNum!= null)&&this.vendorPhoneNum.equals(rhs.vendorPhoneNum))))&&((this.faxExt == rhs.faxExt)||((this.faxExt!= null)&&this.faxExt.equals(rhs.faxExt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.vendorDiscDesc == rhs.vendorDiscDesc)||((this.vendorDiscDesc!= null)&&this.vendorDiscDesc.equals(rhs.vendorDiscDesc))))&&((this.displayShipPhoneNum == rhs.displayShipPhoneNum)||((this.displayShipPhoneNum!= null)&&this.displayShipPhoneNum.equals(rhs.displayShipPhoneNum))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.displayShipZipCode == rhs.displayShipZipCode)||((this.displayShipZipCode!= null)&&this.displayShipZipCode.equals(rhs.displayShipZipCode))))&&((this.displayShipAddrLine3 == rhs.displayShipAddrLine3)||((this.displayShipAddrLine3 != null)&&this.displayShipAddrLine3 .equals(rhs.displayShipAddrLine3))))&&((this.displayCommodityTotal == rhs.displayCommodityTotal)||((this.displayCommodityTotal!= null)&&this.displayCommodityTotal.equals(rhs.displayCommodityTotal))))&&((this.vendorContact == rhs.vendorContact)||((this.vendorContact!= null)&&this.vendorContact.equals(rhs.vendorContact))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.vendorFaxArea == rhs.vendorFaxArea)||((this.vendorFaxArea!= null)&&this.vendorFaxArea.equals(rhs.vendorFaxArea))))&&((this.vendorPhoneArea == rhs.vendorPhoneArea)||((this.vendorPhoneArea!= null)&&this.vendorPhoneArea.equals(rhs.vendorPhoneArea))))&&((this.emailAddr == rhs.emailAddr)||((this.emailAddr!= null)&&this.emailAddr.equals(rhs.emailAddr))))&&((this.displayShipAddrLine2 == rhs.displayShipAddrLine2)||((this.displayShipAddrLine2 != null)&&this.displayShipAddrLine2 .equals(rhs.displayShipAddrLine2))))&&((this.displayShipAddrLine1 == rhs.displayShipAddrLine1)||((this.displayShipAddrLine1 != null)&&this.displayShipAddrLine1 .equals(rhs.displayShipAddrLine1))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.vendorHold == rhs.vendorHold)||((this.vendorHold!= null)&&this.vendorHold.equals(rhs.vendorHold))))&&((this.vendorZip == rhs.vendorZip)||((this.vendorZip!= null)&&this.vendorZip.equals(rhs.vendorZip))))&&((this.displayShipContact == rhs.displayShipContact)||((this.displayShipContact!= null)&&this.displayShipContact.equals(rhs.displayShipContact))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
