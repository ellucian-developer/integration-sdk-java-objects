
package com.ellucian.generated.bpapi.ban.requisition_inquiry.v1_0_0;

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
    "displayCoasName",
    "displayZip",
    "displayShipPhoneArea",
    "currCode",
    "tgrpCode",
    "displayStatCode",
    "phoneNum",
    "displayShipFloor",
    "displayVendName",
    "orgnCode",
    "docRefCode",
    "copiedFrom",
    "reqhDate",
    "crsnCode",
    "apprInd",
    "discCode",
    "singleAcctgInd",
    "displayTextInd",
    "attentionTo",
    "completeInd",
    "originCode",
    "nsfOnOffInd",
    "rqstTypeInd",
    "displayRqstTypeDesc",
    "displayPhoneArea",
    "displayLine2",
    "displayLine3",
    "displayLine1",
    "displayVendCode",
    "displayShipState",
    "faxArea",
    "editDeferInd",
    "vendEmailAddr",
    "atypSeqNum",
    "name",
    "phoneArea",
    "displayNation",
    "displayShipPhoneExt",
    "suspInd",
    "displayCounty",
    "cancelDate",
    "displayPhoneExt",
    "displayShipCity",
    "code",
    "displayTgrpDesc",
    "reqdDate",
    "matchDescription",
    "displayShipAddr",
    "deliveryComment",
    "coasCode",
    "displayFaxExt",
    "displayDiscDesc",
    "displayShipAddr3",
    "activityDate",
    "displayCurrTitle",
    "displayShipAddr2",
    "displayCrsnDesc",
    "faxExt",
    "transDate",
    "displayShipPhoneNum",
    "displayFaxArea",
    "phoneExt",
    "displayShipBldg",
    "displayShipZipCode",
    "displayFaxNum",
    "vendorContact",
    "displayCity",
    "displayPhoneNum",
    "reqPrintDate",
    "userId",
    "shipCode",
    "displayOrgnName",
    "closedDate",
    "emailAddr",
    "faxNumber",
    "displayShipContact",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class RequisitionInquiry100GetResponse {

    @JsonProperty("displayCoasName")
    private String displayCoasName;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayZip")
    private String displayZip;
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
     * Lineage reference object : FPBREQH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TGRP_CODE")
    private String tgrpCode;
    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("displayStatCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvstat")
    private String displayStatCode;
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
    @JsonProperty("displayVendName")
    private String displayVendName;
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
     * Reference Number
     * <p>
     * Lineage reference object : FPBREQH_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_DOC_REF_CODE")
    private String docRefCode;
    /**
     * Requisition Copied From
     * <p>
     * Lineage reference object : FPBREQH_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_COPIED_FROM")
    private String copiedFrom;
    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * 
     */
    @JsonProperty("reqhDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQH_DATE")
    private Date reqhDate;
    /**
     * Cancel Reason
     * <p>
     * Lineage reference object : FPBREQH_CRSN_CODE
     * 
     */
    @JsonProperty("crsnCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_CRSN_CODE")
    private String crsnCode;
    /**
     * Approved
     * <p>
     * Lineage reference object : FPBREQH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_APPR_IND")
    private String apprInd;
    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_DISC_CODE")
    private String discCode;
    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FPBREQH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_SINGLE_ACCTG_IND")
    private String singleAcctgInd;
    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    private String displayTextInd;
    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBREQH_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATTENTION_TO")
    private String attentionTo;
    /**
     * Complete
     * <p>
     * Lineage reference object : FPBREQH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_COMPLETE_IND")
    private String completeInd;
    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ORIGIN_CODE")
    private String originCode;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBREQH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Document Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("rqstTypeInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_RQST_TYPE_IND")
    private String rqstTypeInd;
    @JsonProperty("displayRqstTypeDesc")
    private String displayRqstTypeDesc;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneArea")
    private String displayPhoneArea;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine2")
    private String displayLine2;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine3")
    private String displayLine3;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine1")
    private String displayLine1;
    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String displayVendCode;
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
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBREQH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_EDIT_DEFER_IND")
    private String editDeferInd;
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
     * Sequence Number
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATYP_SEQ_NUM")
    private Double atypSeqNum;
    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBREQH_NAME
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
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNation")
    private String displayNation;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneExt")
    private String displayShipPhoneExt;
    /**
     * In Suspense
     * <p>
     * Lineage reference object : FPBREQH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_SUSP_IND")
    private String suspInd;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCounty")
    private String displayCounty;
    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBREQH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_CANCEL_DATE")
    private Date cancelDate;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneExt")
    private String displayPhoneExt;
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
    @JsonProperty("displayTgrpDesc")
    private String displayTgrpDesc;
    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * 
     */
    @JsonProperty("reqdDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQD_DATE")
    private Date reqdDate;
    /**
     * Receipt  Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    private String matchDescription;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr")
    private String displayShipAddr;
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
    @JsonProperty("displayFaxExt")
    private String displayFaxExt;
    @JsonProperty("displayDiscDesc")
    private String displayDiscDesc;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr3")
    private String displayShipAddr3;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBREQH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("displayCurrTitle")
    private String displayCurrTitle;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr2")
    private String displayShipAddr2;
    @JsonProperty("displayCrsnDesc")
    private String displayCrsnDesc;
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
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TRANS_DATE")
    private Date transDate;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipPhoneNum")
    private String displayShipPhoneNum;
    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxArea")
    private String displayFaxArea;
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
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBldg")
    private String displayShipBldg;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    private String displayShipZipCode;
    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxNum")
    private String displayFaxNum;
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
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCity")
    private String displayCity;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneNum")
    private String displayPhoneNum;
    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBREQH_REQ_PRINT_DATE
     * 
     */
    @JsonProperty("reqPrintDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQ_PRINT_DATE")
    private Date reqPrintDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : FPBREQH_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_USER_ID")
    private String userId;
    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE
     * 
     */
    @JsonProperty("shipCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_SHIP_CODE")
    private String shipCode;
    @JsonProperty("displayOrgnName")
    private String displayOrgnName;
    /**
     * Closed Date
     * <p>
     * Lineage reference object : FPBREQH_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_CLOSED_DATE")
    private Date closedDate;
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
     * Phone
     * <p>
     * Lineage reference object : FPBREQH_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_FAX_NUMBER")
    private String faxNumber;
    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipContact")
    private String displayShipContact;
    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayCoasName")
    public String getDisplayCoasName() {
        return displayCoasName;
    }

    @JsonProperty("displayCoasName")
    public void setDisplayCoasName(String displayCoasName) {
        this.displayCoasName = displayCoasName;
    }

    public RequisitionInquiry100GetResponse withDisplayCoasName(String displayCoasName) {
        this.displayCoasName = displayCoasName;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayZip")
    public String getDisplayZip() {
        return displayZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayZip")
    public void setDisplayZip(String displayZip) {
        this.displayZip = displayZip;
    }

    public RequisitionInquiry100GetResponse withDisplayZip(String displayZip) {
        this.displayZip = displayZip;
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

    public RequisitionInquiry100GetResponse withDisplayShipPhoneArea(String displayShipPhoneArea) {
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

    public RequisitionInquiry100GetResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBREQH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBREQH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public RequisitionInquiry100GetResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("displayStatCode")
    public String getDisplayStatCode() {
        return displayStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("displayStatCode")
    public void setDisplayStatCode(String displayStatCode) {
        this.displayStatCode = displayStatCode;
    }

    public RequisitionInquiry100GetResponse withDisplayStatCode(String displayStatCode) {
        this.displayStatCode = displayStatCode;
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

    public RequisitionInquiry100GetResponse withPhoneNum(String phoneNum) {
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

    public RequisitionInquiry100GetResponse withDisplayShipFloor(String displayShipFloor) {
        this.displayShipFloor = displayShipFloor;
        return this;
    }

    @JsonProperty("displayVendName")
    public String getDisplayVendName() {
        return displayVendName;
    }

    @JsonProperty("displayVendName")
    public void setDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
    }

    public RequisitionInquiry100GetResponse withDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
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

    public RequisitionInquiry100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : FPBREQH_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    public String getDocRefCode() {
        return docRefCode;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : FPBREQH_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    public void setDocRefCode(String docRefCode) {
        this.docRefCode = docRefCode;
    }

    public RequisitionInquiry100GetResponse withDocRefCode(String docRefCode) {
        this.docRefCode = docRefCode;
        return this;
    }

    /**
     * Requisition Copied From
     * <p>
     * Lineage reference object : FPBREQH_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    public String getCopiedFrom() {
        return copiedFrom;
    }

    /**
     * Requisition Copied From
     * <p>
     * Lineage reference object : FPBREQH_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    public void setCopiedFrom(String copiedFrom) {
        this.copiedFrom = copiedFrom;
    }

    public RequisitionInquiry100GetResponse withCopiedFrom(String copiedFrom) {
        this.copiedFrom = copiedFrom;
        return this;
    }

    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
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
     * 
     */
    @JsonProperty("reqhDate")
    public void setReqhDate(Date reqhDate) {
        this.reqhDate = reqhDate;
    }

    public RequisitionInquiry100GetResponse withReqhDate(Date reqhDate) {
        this.reqhDate = reqhDate;
        return this;
    }

    /**
     * Cancel Reason
     * <p>
     * Lineage reference object : FPBREQH_CRSN_CODE
     * 
     */
    @JsonProperty("crsnCode")
    public String getCrsnCode() {
        return crsnCode;
    }

    /**
     * Cancel Reason
     * <p>
     * Lineage reference object : FPBREQH_CRSN_CODE
     * 
     */
    @JsonProperty("crsnCode")
    public void setCrsnCode(String crsnCode) {
        this.crsnCode = crsnCode;
    }

    public RequisitionInquiry100GetResponse withCrsnCode(String crsnCode) {
        this.crsnCode = crsnCode;
        return this;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FPBREQH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FPBREQH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public RequisitionInquiry100GetResponse withApprInd(String apprInd) {
        this.apprInd = apprInd;
        return this;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    public String getDiscCode() {
        return discCode;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBREQH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    public void setDiscCode(String discCode) {
        this.discCode = discCode;
    }

    public RequisitionInquiry100GetResponse withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FPBREQH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public String getSingleAcctgInd() {
        return singleAcctgInd;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FPBREQH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public void setSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
    }

    public RequisitionInquiry100GetResponse withSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
        return this;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public String getDisplayTextInd() {
        return displayTextInd;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public void setDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
    }

    public RequisitionInquiry100GetResponse withDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
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

    public RequisitionInquiry100GetResponse withAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
        return this;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FPBREQH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public String getCompleteInd() {
        return completeInd;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FPBREQH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public void setCompleteInd(String completeInd) {
        this.completeInd = completeInd;
    }

    public RequisitionInquiry100GetResponse withCompleteInd(String completeInd) {
        this.completeInd = completeInd;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public RequisitionInquiry100GetResponse withOriginCode(String originCode) {
        this.originCode = originCode;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBREQH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBREQH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public RequisitionInquiry100GetResponse withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("rqstTypeInd")
    public String getRqstTypeInd() {
        return rqstTypeInd;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("rqstTypeInd")
    public void setRqstTypeInd(String rqstTypeInd) {
        this.rqstTypeInd = rqstTypeInd;
    }

    public RequisitionInquiry100GetResponse withRqstTypeInd(String rqstTypeInd) {
        this.rqstTypeInd = rqstTypeInd;
        return this;
    }

    @JsonProperty("displayRqstTypeDesc")
    public String getDisplayRqstTypeDesc() {
        return displayRqstTypeDesc;
    }

    @JsonProperty("displayRqstTypeDesc")
    public void setDisplayRqstTypeDesc(String displayRqstTypeDesc) {
        this.displayRqstTypeDesc = displayRqstTypeDesc;
    }

    public RequisitionInquiry100GetResponse withDisplayRqstTypeDesc(String displayRqstTypeDesc) {
        this.displayRqstTypeDesc = displayRqstTypeDesc;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneArea")
    public String getDisplayPhoneArea() {
        return displayPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneArea")
    public void setDisplayPhoneArea(String displayPhoneArea) {
        this.displayPhoneArea = displayPhoneArea;
    }

    public RequisitionInquiry100GetResponse withDisplayPhoneArea(String displayPhoneArea) {
        this.displayPhoneArea = displayPhoneArea;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine2")
    public String getDisplayLine2() {
        return displayLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine2")
    public void setDisplayLine2(String displayLine2) {
        this.displayLine2 = displayLine2;
    }

    public RequisitionInquiry100GetResponse withDisplayLine2(String displayLine2) {
        this.displayLine2 = displayLine2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine3")
    public String getDisplayLine3() {
        return displayLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine3")
    public void setDisplayLine3(String displayLine3) {
        this.displayLine3 = displayLine3;
    }

    public RequisitionInquiry100GetResponse withDisplayLine3(String displayLine3) {
        this.displayLine3 = displayLine3;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine1")
    public String getDisplayLine1() {
        return displayLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLine1")
    public void setDisplayLine1(String displayLine1) {
        this.displayLine1 = displayLine1;
    }

    public RequisitionInquiry100GetResponse withDisplayLine1(String displayLine1) {
        this.displayLine1 = displayLine1;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    public String getDisplayVendCode() {
        return displayVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    public void setDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
    }

    public RequisitionInquiry100GetResponse withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
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

    public RequisitionInquiry100GetResponse withDisplayShipState(String displayShipState) {
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

    public RequisitionInquiry100GetResponse withFaxArea(String faxArea) {
        this.faxArea = faxArea;
        return this;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBREQH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBREQH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public RequisitionInquiry100GetResponse withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
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

    public RequisitionInquiry100GetResponse withVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public Double getAtypSeqNum() {
        return atypSeqNum;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FPBREQH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public void setAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
    }

    public RequisitionInquiry100GetResponse withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
        return this;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBREQH_NAME
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
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RequisitionInquiry100GetResponse withName(String name) {
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

    public RequisitionInquiry100GetResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNation")
    public String getDisplayNation() {
        return displayNation;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNation")
    public void setDisplayNation(String displayNation) {
        this.displayNation = displayNation;
    }

    public RequisitionInquiry100GetResponse withDisplayNation(String displayNation) {
        this.displayNation = displayNation;
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

    public RequisitionInquiry100GetResponse withDisplayShipPhoneExt(String displayShipPhoneExt) {
        this.displayShipPhoneExt = displayShipPhoneExt;
        return this;
    }

    /**
     * In Suspense
     * <p>
     * Lineage reference object : FPBREQH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    public String getSuspInd() {
        return suspInd;
    }

    /**
     * In Suspense
     * <p>
     * Lineage reference object : FPBREQH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    public void setSuspInd(String suspInd) {
        this.suspInd = suspInd;
    }

    public RequisitionInquiry100GetResponse withSuspInd(String suspInd) {
        this.suspInd = suspInd;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCounty")
    public String getDisplayCounty() {
        return displayCounty;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCounty")
    public void setDisplayCounty(String displayCounty) {
        this.displayCounty = displayCounty;
    }

    public RequisitionInquiry100GetResponse withDisplayCounty(String displayCounty) {
        this.displayCounty = displayCounty;
        return this;
    }

    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBREQH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBREQH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public RequisitionInquiry100GetResponse withCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneExt")
    public String getDisplayPhoneExt() {
        return displayPhoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneExt")
    public void setDisplayPhoneExt(String displayPhoneExt) {
        this.displayPhoneExt = displayPhoneExt;
    }

    public RequisitionInquiry100GetResponse withDisplayPhoneExt(String displayPhoneExt) {
        this.displayPhoneExt = displayPhoneExt;
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

    public RequisitionInquiry100GetResponse withDisplayShipCity(String displayShipCity) {
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

    public RequisitionInquiry100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("displayTgrpDesc")
    public String getDisplayTgrpDesc() {
        return displayTgrpDesc;
    }

    @JsonProperty("displayTgrpDesc")
    public void setDisplayTgrpDesc(String displayTgrpDesc) {
        this.displayTgrpDesc = displayTgrpDesc;
    }

    public RequisitionInquiry100GetResponse withDisplayTgrpDesc(String displayTgrpDesc) {
        this.displayTgrpDesc = displayTgrpDesc;
        return this;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
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
     * 
     */
    @JsonProperty("reqdDate")
    public void setReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
    }

    public RequisitionInquiry100GetResponse withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    /**
     * Receipt  Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public String getMatchDescription() {
        return matchDescription;
    }

    /**
     * Receipt  Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public RequisitionInquiry100GetResponse withMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr")
    public String getDisplayShipAddr() {
        return displayShipAddr;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr")
    public void setDisplayShipAddr(String displayShipAddr) {
        this.displayShipAddr = displayShipAddr;
    }

    public RequisitionInquiry100GetResponse withDisplayShipAddr(String displayShipAddr) {
        this.displayShipAddr = displayShipAddr;
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

    public RequisitionInquiry100GetResponse withDeliveryComment(String deliveryComment) {
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

    public RequisitionInquiry100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("displayFaxExt")
    public String getDisplayFaxExt() {
        return displayFaxExt;
    }

    @JsonProperty("displayFaxExt")
    public void setDisplayFaxExt(String displayFaxExt) {
        this.displayFaxExt = displayFaxExt;
    }

    public RequisitionInquiry100GetResponse withDisplayFaxExt(String displayFaxExt) {
        this.displayFaxExt = displayFaxExt;
        return this;
    }

    @JsonProperty("displayDiscDesc")
    public String getDisplayDiscDesc() {
        return displayDiscDesc;
    }

    @JsonProperty("displayDiscDesc")
    public void setDisplayDiscDesc(String displayDiscDesc) {
        this.displayDiscDesc = displayDiscDesc;
    }

    public RequisitionInquiry100GetResponse withDisplayDiscDesc(String displayDiscDesc) {
        this.displayDiscDesc = displayDiscDesc;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr3")
    public String getDisplayShipAddr3() {
        return displayShipAddr3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr3")
    public void setDisplayShipAddr3(String displayShipAddr3) {
        this.displayShipAddr3 = displayShipAddr3;
    }

    public RequisitionInquiry100GetResponse withDisplayShipAddr3(String displayShipAddr3) {
        this.displayShipAddr3 = displayShipAddr3;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBREQH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBREQH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RequisitionInquiry100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("displayCurrTitle")
    public String getDisplayCurrTitle() {
        return displayCurrTitle;
    }

    @JsonProperty("displayCurrTitle")
    public void setDisplayCurrTitle(String displayCurrTitle) {
        this.displayCurrTitle = displayCurrTitle;
    }

    public RequisitionInquiry100GetResponse withDisplayCurrTitle(String displayCurrTitle) {
        this.displayCurrTitle = displayCurrTitle;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr2")
    public String getDisplayShipAddr2() {
        return displayShipAddr2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipAddr2")
    public void setDisplayShipAddr2(String displayShipAddr2) {
        this.displayShipAddr2 = displayShipAddr2;
    }

    public RequisitionInquiry100GetResponse withDisplayShipAddr2(String displayShipAddr2) {
        this.displayShipAddr2 = displayShipAddr2;
        return this;
    }

    @JsonProperty("displayCrsnDesc")
    public String getDisplayCrsnDesc() {
        return displayCrsnDesc;
    }

    @JsonProperty("displayCrsnDesc")
    public void setDisplayCrsnDesc(String displayCrsnDesc) {
        this.displayCrsnDesc = displayCrsnDesc;
    }

    public RequisitionInquiry100GetResponse withDisplayCrsnDesc(String displayCrsnDesc) {
        this.displayCrsnDesc = displayCrsnDesc;
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

    public RequisitionInquiry100GetResponse withFaxExt(String faxExt) {
        this.faxExt = faxExt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
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
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public RequisitionInquiry100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public RequisitionInquiry100GetResponse withDisplayShipPhoneNum(String displayShipPhoneNum) {
        this.displayShipPhoneNum = displayShipPhoneNum;
        return this;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxArea")
    public String getDisplayFaxArea() {
        return displayFaxArea;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxArea")
    public void setDisplayFaxArea(String displayFaxArea) {
        this.displayFaxArea = displayFaxArea;
    }

    public RequisitionInquiry100GetResponse withDisplayFaxArea(String displayFaxArea) {
        this.displayFaxArea = displayFaxArea;
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

    public RequisitionInquiry100GetResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBldg")
    public String getDisplayShipBldg() {
        return displayShipBldg;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipBldg")
    public void setDisplayShipBldg(String displayShipBldg) {
        this.displayShipBldg = displayShipBldg;
    }

    public RequisitionInquiry100GetResponse withDisplayShipBldg(String displayShipBldg) {
        this.displayShipBldg = displayShipBldg;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    public String getDisplayShipZipCode() {
        return displayShipZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShipZipCode")
    public void setDisplayShipZipCode(String displayShipZipCode) {
        this.displayShipZipCode = displayShipZipCode;
    }

    public RequisitionInquiry100GetResponse withDisplayShipZipCode(String displayShipZipCode) {
        this.displayShipZipCode = displayShipZipCode;
        return this;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxNum")
    public String getDisplayFaxNum() {
        return displayFaxNum;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaxNum")
    public void setDisplayFaxNum(String displayFaxNum) {
        this.displayFaxNum = displayFaxNum;
    }

    public RequisitionInquiry100GetResponse withDisplayFaxNum(String displayFaxNum) {
        this.displayFaxNum = displayFaxNum;
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

    public RequisitionInquiry100GetResponse withVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCity")
    public String getDisplayCity() {
        return displayCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCity")
    public void setDisplayCity(String displayCity) {
        this.displayCity = displayCity;
    }

    public RequisitionInquiry100GetResponse withDisplayCity(String displayCity) {
        this.displayCity = displayCity;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneNum")
    public String getDisplayPhoneNum() {
        return displayPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPhoneNum")
    public void setDisplayPhoneNum(String displayPhoneNum) {
        this.displayPhoneNum = displayPhoneNum;
    }

    public RequisitionInquiry100GetResponse withDisplayPhoneNum(String displayPhoneNum) {
        this.displayPhoneNum = displayPhoneNum;
        return this;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBREQH_REQ_PRINT_DATE
     * 
     */
    @JsonProperty("reqPrintDate")
    public Date getReqPrintDate() {
        return reqPrintDate;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBREQH_REQ_PRINT_DATE
     * 
     */
    @JsonProperty("reqPrintDate")
    public void setReqPrintDate(Date reqPrintDate) {
        this.reqPrintDate = reqPrintDate;
    }

    public RequisitionInquiry100GetResponse withReqPrintDate(Date reqPrintDate) {
        this.reqPrintDate = reqPrintDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FPBREQH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FPBREQH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RequisitionInquiry100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE
     * 
     */
    @JsonProperty("shipCode")
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBREQH_SHIP_CODE
     * 
     */
    @JsonProperty("shipCode")
    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public RequisitionInquiry100GetResponse withShipCode(String shipCode) {
        this.shipCode = shipCode;
        return this;
    }

    @JsonProperty("displayOrgnName")
    public String getDisplayOrgnName() {
        return displayOrgnName;
    }

    @JsonProperty("displayOrgnName")
    public void setDisplayOrgnName(String displayOrgnName) {
        this.displayOrgnName = displayOrgnName;
    }

    public RequisitionInquiry100GetResponse withDisplayOrgnName(String displayOrgnName) {
        this.displayOrgnName = displayOrgnName;
        return this;
    }

    /**
     * Closed Date
     * <p>
     * Lineage reference object : FPBREQH_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    public Date getClosedDate() {
        return closedDate;
    }

    /**
     * Closed Date
     * <p>
     * Lineage reference object : FPBREQH_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public RequisitionInquiry100GetResponse withClosedDate(Date closedDate) {
        this.closedDate = closedDate;
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

    public RequisitionInquiry100GetResponse withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
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

    public RequisitionInquiry100GetResponse withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
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

    public RequisitionInquiry100GetResponse withDisplayShipContact(String displayShipContact) {
        this.displayShipContact = displayShipContact;
        return this;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBREQH_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public RequisitionInquiry100GetResponse withAtypCode(String atypCode) {
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

    public RequisitionInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequisitionInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayCoasName");
        sb.append('=');
        sb.append(((this.displayCoasName == null)?"<null>":this.displayCoasName));
        sb.append(',');
        sb.append("displayZip");
        sb.append('=');
        sb.append(((this.displayZip == null)?"<null>":this.displayZip));
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
        sb.append("displayStatCode");
        sb.append('=');
        sb.append(((this.displayStatCode == null)?"<null>":this.displayStatCode));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("displayShipFloor");
        sb.append('=');
        sb.append(((this.displayShipFloor == null)?"<null>":this.displayShipFloor));
        sb.append(',');
        sb.append("displayVendName");
        sb.append('=');
        sb.append(((this.displayVendName == null)?"<null>":this.displayVendName));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("docRefCode");
        sb.append('=');
        sb.append(((this.docRefCode == null)?"<null>":this.docRefCode));
        sb.append(',');
        sb.append("copiedFrom");
        sb.append('=');
        sb.append(((this.copiedFrom == null)?"<null>":this.copiedFrom));
        sb.append(',');
        sb.append("reqhDate");
        sb.append('=');
        sb.append(((this.reqhDate == null)?"<null>":this.reqhDate));
        sb.append(',');
        sb.append("crsnCode");
        sb.append('=');
        sb.append(((this.crsnCode == null)?"<null>":this.crsnCode));
        sb.append(',');
        sb.append("apprInd");
        sb.append('=');
        sb.append(((this.apprInd == null)?"<null>":this.apprInd));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("singleAcctgInd");
        sb.append('=');
        sb.append(((this.singleAcctgInd == null)?"<null>":this.singleAcctgInd));
        sb.append(',');
        sb.append("displayTextInd");
        sb.append('=');
        sb.append(((this.displayTextInd == null)?"<null>":this.displayTextInd));
        sb.append(',');
        sb.append("attentionTo");
        sb.append('=');
        sb.append(((this.attentionTo == null)?"<null>":this.attentionTo));
        sb.append(',');
        sb.append("completeInd");
        sb.append('=');
        sb.append(((this.completeInd == null)?"<null>":this.completeInd));
        sb.append(',');
        sb.append("originCode");
        sb.append('=');
        sb.append(((this.originCode == null)?"<null>":this.originCode));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("rqstTypeInd");
        sb.append('=');
        sb.append(((this.rqstTypeInd == null)?"<null>":this.rqstTypeInd));
        sb.append(',');
        sb.append("displayRqstTypeDesc");
        sb.append('=');
        sb.append(((this.displayRqstTypeDesc == null)?"<null>":this.displayRqstTypeDesc));
        sb.append(',');
        sb.append("displayPhoneArea");
        sb.append('=');
        sb.append(((this.displayPhoneArea == null)?"<null>":this.displayPhoneArea));
        sb.append(',');
        sb.append("displayLine2");
        sb.append('=');
        sb.append(((this.displayLine2 == null)?"<null>":this.displayLine2));
        sb.append(',');
        sb.append("displayLine3");
        sb.append('=');
        sb.append(((this.displayLine3 == null)?"<null>":this.displayLine3));
        sb.append(',');
        sb.append("displayLine1");
        sb.append('=');
        sb.append(((this.displayLine1 == null)?"<null>":this.displayLine1));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("displayShipState");
        sb.append('=');
        sb.append(((this.displayShipState == null)?"<null>":this.displayShipState));
        sb.append(',');
        sb.append("faxArea");
        sb.append('=');
        sb.append(((this.faxArea == null)?"<null>":this.faxArea));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("vendEmailAddr");
        sb.append('=');
        sb.append(((this.vendEmailAddr == null)?"<null>":this.vendEmailAddr));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("displayNation");
        sb.append('=');
        sb.append(((this.displayNation == null)?"<null>":this.displayNation));
        sb.append(',');
        sb.append("displayShipPhoneExt");
        sb.append('=');
        sb.append(((this.displayShipPhoneExt == null)?"<null>":this.displayShipPhoneExt));
        sb.append(',');
        sb.append("suspInd");
        sb.append('=');
        sb.append(((this.suspInd == null)?"<null>":this.suspInd));
        sb.append(',');
        sb.append("displayCounty");
        sb.append('=');
        sb.append(((this.displayCounty == null)?"<null>":this.displayCounty));
        sb.append(',');
        sb.append("cancelDate");
        sb.append('=');
        sb.append(((this.cancelDate == null)?"<null>":this.cancelDate));
        sb.append(',');
        sb.append("displayPhoneExt");
        sb.append('=');
        sb.append(((this.displayPhoneExt == null)?"<null>":this.displayPhoneExt));
        sb.append(',');
        sb.append("displayShipCity");
        sb.append('=');
        sb.append(((this.displayShipCity == null)?"<null>":this.displayShipCity));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("displayTgrpDesc");
        sb.append('=');
        sb.append(((this.displayTgrpDesc == null)?"<null>":this.displayTgrpDesc));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("matchDescription");
        sb.append('=');
        sb.append(((this.matchDescription == null)?"<null>":this.matchDescription));
        sb.append(',');
        sb.append("displayShipAddr");
        sb.append('=');
        sb.append(((this.displayShipAddr == null)?"<null>":this.displayShipAddr));
        sb.append(',');
        sb.append("deliveryComment");
        sb.append('=');
        sb.append(((this.deliveryComment == null)?"<null>":this.deliveryComment));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("displayFaxExt");
        sb.append('=');
        sb.append(((this.displayFaxExt == null)?"<null>":this.displayFaxExt));
        sb.append(',');
        sb.append("displayDiscDesc");
        sb.append('=');
        sb.append(((this.displayDiscDesc == null)?"<null>":this.displayDiscDesc));
        sb.append(',');
        sb.append("displayShipAddr3");
        sb.append('=');
        sb.append(((this.displayShipAddr3 == null)?"<null>":this.displayShipAddr3));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("displayCurrTitle");
        sb.append('=');
        sb.append(((this.displayCurrTitle == null)?"<null>":this.displayCurrTitle));
        sb.append(',');
        sb.append("displayShipAddr2");
        sb.append('=');
        sb.append(((this.displayShipAddr2 == null)?"<null>":this.displayShipAddr2));
        sb.append(',');
        sb.append("displayCrsnDesc");
        sb.append('=');
        sb.append(((this.displayCrsnDesc == null)?"<null>":this.displayCrsnDesc));
        sb.append(',');
        sb.append("faxExt");
        sb.append('=');
        sb.append(((this.faxExt == null)?"<null>":this.faxExt));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("displayShipPhoneNum");
        sb.append('=');
        sb.append(((this.displayShipPhoneNum == null)?"<null>":this.displayShipPhoneNum));
        sb.append(',');
        sb.append("displayFaxArea");
        sb.append('=');
        sb.append(((this.displayFaxArea == null)?"<null>":this.displayFaxArea));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("displayShipBldg");
        sb.append('=');
        sb.append(((this.displayShipBldg == null)?"<null>":this.displayShipBldg));
        sb.append(',');
        sb.append("displayShipZipCode");
        sb.append('=');
        sb.append(((this.displayShipZipCode == null)?"<null>":this.displayShipZipCode));
        sb.append(',');
        sb.append("displayFaxNum");
        sb.append('=');
        sb.append(((this.displayFaxNum == null)?"<null>":this.displayFaxNum));
        sb.append(',');
        sb.append("vendorContact");
        sb.append('=');
        sb.append(((this.vendorContact == null)?"<null>":this.vendorContact));
        sb.append(',');
        sb.append("displayCity");
        sb.append('=');
        sb.append(((this.displayCity == null)?"<null>":this.displayCity));
        sb.append(',');
        sb.append("displayPhoneNum");
        sb.append('=');
        sb.append(((this.displayPhoneNum == null)?"<null>":this.displayPhoneNum));
        sb.append(',');
        sb.append("reqPrintDate");
        sb.append('=');
        sb.append(((this.reqPrintDate == null)?"<null>":this.reqPrintDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("displayOrgnName");
        sb.append('=');
        sb.append(((this.displayOrgnName == null)?"<null>":this.displayOrgnName));
        sb.append(',');
        sb.append("closedDate");
        sb.append('=');
        sb.append(((this.closedDate == null)?"<null>":this.closedDate));
        sb.append(',');
        sb.append("emailAddr");
        sb.append('=');
        sb.append(((this.emailAddr == null)?"<null>":this.emailAddr));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
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
        result = ((result* 31)+((this.displayCoasName == null)? 0 :this.displayCoasName.hashCode()));
        result = ((result* 31)+((this.displayZip == null)? 0 :this.displayZip.hashCode()));
        result = ((result* 31)+((this.displayShipPhoneArea == null)? 0 :this.displayShipPhoneArea.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.displayStatCode == null)? 0 :this.displayStatCode.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.displayShipFloor == null)? 0 :this.displayShipFloor.hashCode()));
        result = ((result* 31)+((this.displayVendName == null)? 0 :this.displayVendName.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.docRefCode == null)? 0 :this.docRefCode.hashCode()));
        result = ((result* 31)+((this.copiedFrom == null)? 0 :this.copiedFrom.hashCode()));
        result = ((result* 31)+((this.reqhDate == null)? 0 :this.reqhDate.hashCode()));
        result = ((result* 31)+((this.crsnCode == null)? 0 :this.crsnCode.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.singleAcctgInd == null)? 0 :this.singleAcctgInd.hashCode()));
        result = ((result* 31)+((this.displayTextInd == null)? 0 :this.displayTextInd.hashCode()));
        result = ((result* 31)+((this.attentionTo == null)? 0 :this.attentionTo.hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.originCode == null)? 0 :this.originCode.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.rqstTypeInd == null)? 0 :this.rqstTypeInd.hashCode()));
        result = ((result* 31)+((this.displayRqstTypeDesc == null)? 0 :this.displayRqstTypeDesc.hashCode()));
        result = ((result* 31)+((this.displayPhoneArea == null)? 0 :this.displayPhoneArea.hashCode()));
        result = ((result* 31)+((this.displayLine2 == null)? 0 :this.displayLine2 .hashCode()));
        result = ((result* 31)+((this.displayLine3 == null)? 0 :this.displayLine3 .hashCode()));
        result = ((result* 31)+((this.displayLine1 == null)? 0 :this.displayLine1 .hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.displayShipState == null)? 0 :this.displayShipState.hashCode()));
        result = ((result* 31)+((this.faxArea == null)? 0 :this.faxArea.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.vendEmailAddr == null)? 0 :this.vendEmailAddr.hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.displayNation == null)? 0 :this.displayNation.hashCode()));
        result = ((result* 31)+((this.displayShipPhoneExt == null)? 0 :this.displayShipPhoneExt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.suspInd == null)? 0 :this.suspInd.hashCode()));
        result = ((result* 31)+((this.displayCounty == null)? 0 :this.displayCounty.hashCode()));
        result = ((result* 31)+((this.cancelDate == null)? 0 :this.cancelDate.hashCode()));
        result = ((result* 31)+((this.displayPhoneExt == null)? 0 :this.displayPhoneExt.hashCode()));
        result = ((result* 31)+((this.displayShipCity == null)? 0 :this.displayShipCity.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.displayTgrpDesc == null)? 0 :this.displayTgrpDesc.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.matchDescription == null)? 0 :this.matchDescription.hashCode()));
        result = ((result* 31)+((this.displayShipAddr == null)? 0 :this.displayShipAddr.hashCode()));
        result = ((result* 31)+((this.deliveryComment == null)? 0 :this.deliveryComment.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.displayFaxExt == null)? 0 :this.displayFaxExt.hashCode()));
        result = ((result* 31)+((this.displayDiscDesc == null)? 0 :this.displayDiscDesc.hashCode()));
        result = ((result* 31)+((this.displayShipAddr3 == null)? 0 :this.displayShipAddr3 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.displayCurrTitle == null)? 0 :this.displayCurrTitle.hashCode()));
        result = ((result* 31)+((this.displayShipAddr2 == null)? 0 :this.displayShipAddr2 .hashCode()));
        result = ((result* 31)+((this.displayCrsnDesc == null)? 0 :this.displayCrsnDesc.hashCode()));
        result = ((result* 31)+((this.faxExt == null)? 0 :this.faxExt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.displayShipPhoneNum == null)? 0 :this.displayShipPhoneNum.hashCode()));
        result = ((result* 31)+((this.displayFaxArea == null)? 0 :this.displayFaxArea.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.displayShipBldg == null)? 0 :this.displayShipBldg.hashCode()));
        result = ((result* 31)+((this.displayShipZipCode == null)? 0 :this.displayShipZipCode.hashCode()));
        result = ((result* 31)+((this.displayFaxNum == null)? 0 :this.displayFaxNum.hashCode()));
        result = ((result* 31)+((this.vendorContact == null)? 0 :this.vendorContact.hashCode()));
        result = ((result* 31)+((this.displayCity == null)? 0 :this.displayCity.hashCode()));
        result = ((result* 31)+((this.displayPhoneNum == null)? 0 :this.displayPhoneNum.hashCode()));
        result = ((result* 31)+((this.reqPrintDate == null)? 0 :this.reqPrintDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.displayOrgnName == null)? 0 :this.displayOrgnName.hashCode()));
        result = ((result* 31)+((this.closedDate == null)? 0 :this.closedDate.hashCode()));
        result = ((result* 31)+((this.emailAddr == null)? 0 :this.emailAddr.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.displayShipContact == null)? 0 :this.displayShipContact.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequisitionInquiry100GetResponse) == false) {
            return false;
        }
        RequisitionInquiry100GetResponse rhs = ((RequisitionInquiry100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.displayCoasName == rhs.displayCoasName)||((this.displayCoasName!= null)&&this.displayCoasName.equals(rhs.displayCoasName)))&&((this.displayZip == rhs.displayZip)||((this.displayZip!= null)&&this.displayZip.equals(rhs.displayZip))))&&((this.displayShipPhoneArea == rhs.displayShipPhoneArea)||((this.displayShipPhoneArea!= null)&&this.displayShipPhoneArea.equals(rhs.displayShipPhoneArea))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.displayStatCode == rhs.displayStatCode)||((this.displayStatCode!= null)&&this.displayStatCode.equals(rhs.displayStatCode))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.displayShipFloor == rhs.displayShipFloor)||((this.displayShipFloor!= null)&&this.displayShipFloor.equals(rhs.displayShipFloor))))&&((this.displayVendName == rhs.displayVendName)||((this.displayVendName!= null)&&this.displayVendName.equals(rhs.displayVendName))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.docRefCode == rhs.docRefCode)||((this.docRefCode!= null)&&this.docRefCode.equals(rhs.docRefCode))))&&((this.copiedFrom == rhs.copiedFrom)||((this.copiedFrom!= null)&&this.copiedFrom.equals(rhs.copiedFrom))))&&((this.reqhDate == rhs.reqhDate)||((this.reqhDate!= null)&&this.reqhDate.equals(rhs.reqhDate))))&&((this.crsnCode == rhs.crsnCode)||((this.crsnCode!= null)&&this.crsnCode.equals(rhs.crsnCode))))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.singleAcctgInd == rhs.singleAcctgInd)||((this.singleAcctgInd!= null)&&this.singleAcctgInd.equals(rhs.singleAcctgInd))))&&((this.displayTextInd == rhs.displayTextInd)||((this.displayTextInd!= null)&&this.displayTextInd.equals(rhs.displayTextInd))))&&((this.attentionTo == rhs.attentionTo)||((this.attentionTo!= null)&&this.attentionTo.equals(rhs.attentionTo))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.originCode == rhs.originCode)||((this.originCode!= null)&&this.originCode.equals(rhs.originCode))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.rqstTypeInd == rhs.rqstTypeInd)||((this.rqstTypeInd!= null)&&this.rqstTypeInd.equals(rhs.rqstTypeInd))))&&((this.displayRqstTypeDesc == rhs.displayRqstTypeDesc)||((this.displayRqstTypeDesc!= null)&&this.displayRqstTypeDesc.equals(rhs.displayRqstTypeDesc))))&&((this.displayPhoneArea == rhs.displayPhoneArea)||((this.displayPhoneArea!= null)&&this.displayPhoneArea.equals(rhs.displayPhoneArea))))&&((this.displayLine2 == rhs.displayLine2)||((this.displayLine2 != null)&&this.displayLine2 .equals(rhs.displayLine2))))&&((this.displayLine3 == rhs.displayLine3)||((this.displayLine3 != null)&&this.displayLine3 .equals(rhs.displayLine3))))&&((this.displayLine1 == rhs.displayLine1)||((this.displayLine1 != null)&&this.displayLine1 .equals(rhs.displayLine1))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.displayShipState == rhs.displayShipState)||((this.displayShipState!= null)&&this.displayShipState.equals(rhs.displayShipState))))&&((this.faxArea == rhs.faxArea)||((this.faxArea!= null)&&this.faxArea.equals(rhs.faxArea))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.vendEmailAddr == rhs.vendEmailAddr)||((this.vendEmailAddr!= null)&&this.vendEmailAddr.equals(rhs.vendEmailAddr))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.displayNation == rhs.displayNation)||((this.displayNation!= null)&&this.displayNation.equals(rhs.displayNation))))&&((this.displayShipPhoneExt == rhs.displayShipPhoneExt)||((this.displayShipPhoneExt!= null)&&this.displayShipPhoneExt.equals(rhs.displayShipPhoneExt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.suspInd == rhs.suspInd)||((this.suspInd!= null)&&this.suspInd.equals(rhs.suspInd))))&&((this.displayCounty == rhs.displayCounty)||((this.displayCounty!= null)&&this.displayCounty.equals(rhs.displayCounty))))&&((this.cancelDate == rhs.cancelDate)||((this.cancelDate!= null)&&this.cancelDate.equals(rhs.cancelDate))))&&((this.displayPhoneExt == rhs.displayPhoneExt)||((this.displayPhoneExt!= null)&&this.displayPhoneExt.equals(rhs.displayPhoneExt))))&&((this.displayShipCity == rhs.displayShipCity)||((this.displayShipCity!= null)&&this.displayShipCity.equals(rhs.displayShipCity))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.displayTgrpDesc == rhs.displayTgrpDesc)||((this.displayTgrpDesc!= null)&&this.displayTgrpDesc.equals(rhs.displayTgrpDesc))))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.matchDescription == rhs.matchDescription)||((this.matchDescription!= null)&&this.matchDescription.equals(rhs.matchDescription))))&&((this.displayShipAddr == rhs.displayShipAddr)||((this.displayShipAddr!= null)&&this.displayShipAddr.equals(rhs.displayShipAddr))))&&((this.deliveryComment == rhs.deliveryComment)||((this.deliveryComment!= null)&&this.deliveryComment.equals(rhs.deliveryComment))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.displayFaxExt == rhs.displayFaxExt)||((this.displayFaxExt!= null)&&this.displayFaxExt.equals(rhs.displayFaxExt))))&&((this.displayDiscDesc == rhs.displayDiscDesc)||((this.displayDiscDesc!= null)&&this.displayDiscDesc.equals(rhs.displayDiscDesc))))&&((this.displayShipAddr3 == rhs.displayShipAddr3)||((this.displayShipAddr3 != null)&&this.displayShipAddr3 .equals(rhs.displayShipAddr3))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.displayCurrTitle == rhs.displayCurrTitle)||((this.displayCurrTitle!= null)&&this.displayCurrTitle.equals(rhs.displayCurrTitle))))&&((this.displayShipAddr2 == rhs.displayShipAddr2)||((this.displayShipAddr2 != null)&&this.displayShipAddr2 .equals(rhs.displayShipAddr2))))&&((this.displayCrsnDesc == rhs.displayCrsnDesc)||((this.displayCrsnDesc!= null)&&this.displayCrsnDesc.equals(rhs.displayCrsnDesc))))&&((this.faxExt == rhs.faxExt)||((this.faxExt!= null)&&this.faxExt.equals(rhs.faxExt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.displayShipPhoneNum == rhs.displayShipPhoneNum)||((this.displayShipPhoneNum!= null)&&this.displayShipPhoneNum.equals(rhs.displayShipPhoneNum))))&&((this.displayFaxArea == rhs.displayFaxArea)||((this.displayFaxArea!= null)&&this.displayFaxArea.equals(rhs.displayFaxArea))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.displayShipBldg == rhs.displayShipBldg)||((this.displayShipBldg!= null)&&this.displayShipBldg.equals(rhs.displayShipBldg))))&&((this.displayShipZipCode == rhs.displayShipZipCode)||((this.displayShipZipCode!= null)&&this.displayShipZipCode.equals(rhs.displayShipZipCode))))&&((this.displayFaxNum == rhs.displayFaxNum)||((this.displayFaxNum!= null)&&this.displayFaxNum.equals(rhs.displayFaxNum))))&&((this.vendorContact == rhs.vendorContact)||((this.vendorContact!= null)&&this.vendorContact.equals(rhs.vendorContact))))&&((this.displayCity == rhs.displayCity)||((this.displayCity!= null)&&this.displayCity.equals(rhs.displayCity))))&&((this.displayPhoneNum == rhs.displayPhoneNum)||((this.displayPhoneNum!= null)&&this.displayPhoneNum.equals(rhs.displayPhoneNum))))&&((this.reqPrintDate == rhs.reqPrintDate)||((this.reqPrintDate!= null)&&this.reqPrintDate.equals(rhs.reqPrintDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.displayOrgnName == rhs.displayOrgnName)||((this.displayOrgnName!= null)&&this.displayOrgnName.equals(rhs.displayOrgnName))))&&((this.closedDate == rhs.closedDate)||((this.closedDate!= null)&&this.closedDate.equals(rhs.closedDate))))&&((this.emailAddr == rhs.emailAddr)||((this.emailAddr!= null)&&this.emailAddr.equals(rhs.emailAddr))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.displayShipContact == rhs.displayShipContact)||((this.displayShipContact!= null)&&this.displayShipContact.equals(rhs.displayShipContact))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
