
package com.ellucian.generated.bpapi.ban.purchase_order_information.v1_0_0;

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
    "displayVendAreaCode",
    "natnDesc",
    "currCode",
    "disbAgentInd",
    "tgrpCode",
    "vendFaxPhone",
    "fobTitle",
    "ftrmDesc",
    "phoneNum",
    "pclsCode",
    "orgnCode",
    "copiedFrom",
    "textInd",
    "hdrNote",
    "vendFaxArea",
    "carrierName",
    "discCode",
    "poDate",
    "ftvshipPhoneArea",
    "attentionTo",
    "nsfOnOffInd",
    "ftvshipState",
    "blanketTermDate",
    "zip",
    "orgnDesc",
    "ftvshipNatnCodeDesc",
    "ftrmCode",
    "displayPoTotal",
    "vendName",
    "coasDesc",
    "displayBuyrName",
    "displayVendCode",
    "displayExtension",
    "faxArea",
    "editDeferInd",
    "poTypeInd",
    "vendEmailAddr",
    "ftvshipPhoneExt",
    "atypSeqNum",
    "carrierCode",
    "ftvshipCity",
    "name",
    "matchTempReq",
    "phoneArea",
    "stateCode",
    "displayAcctgTotal",
    "code",
    "reqdDate",
    "city",
    "ftvshipZipCode",
    "vendFaxExt",
    "deliveryComment",
    "taxDesc",
    "coasCode",
    "ftvshipBuilding",
    "rushInd",
    "faxExt",
    "transDate",
    "ftvshipFloor",
    "blanketCode",
    "ediInd",
    "currDesc",
    "ftvshipPhoneNum",
    "ftvshipAddrLine2",
    "phoneExt",
    "ftvshipAddrLine1",
    "ftvshipAddrLine3",
    "page1SuspInd",
    "reqExistsInd",
    "classCodeTitle",
    "vendorContact",
    "ftvshipContact",
    "fobCode",
    "shipCode",
    "discDesc",
    "displayVendTele1",
    "buyrCode",
    "addrLine3",
    "addrLine2",
    "addrLine1",
    "emailAddr",
    "faxNumber",
    "vendorHold",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderInformation100PutResponse {

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendAreaCode")
    private String displayVendAreaCode;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    private String natnDesc;
    /**
     * Currency
     * <p>
     * Lineage reference object : FPBPOHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FPBPOHD_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DISB_AGENT_IND")
    private String disbAgentInd;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBPOHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxPhone")
    private String vendFaxPhone;
    @JsonProperty("fobTitle")
    private String fobTitle;
    @JsonProperty("ftrmDesc")
    private String ftrmDesc;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PHONE_NUM")
    private String phoneNum;
    /**
     * Class Code
     * <p>
     * Lineage reference object : FPBPOHD_PCLS_CODE, Lookup lineage reference object : ftvpcls
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PCLS_CODE, Lookup lineage reference object : ftvpcls")
    private String pclsCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : FPBPOHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ORGN_CODE")
    private String orgnCode;
    /**
     * Purchase Order Copied From
     * <p>
     * Lineage reference object : FPBPOHD_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_COPIED_FROM")
    private String copiedFrom;
    /**
     * Requisition Document Text
     * <p>
     * Lineage reference object : FPBPOHD_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_TEXT_IND")
    private String textInd;
    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrNote")
    private String hdrNote;
    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxArea")
    private String vendFaxArea;
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * Discount
     * <p>
     * Lineage reference object : FPBPOHD_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DISC_CODE, Lookup lineage reference object : ftvdisc")
    private String discCode;
    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_DATE
     * (Required)
     * 
     */
    @JsonProperty("poDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PO_DATE")
    private Date poDate;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    private String ftvshipPhoneArea;
    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBPOHD_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ATTENTION_TO")
    private String attentionTo;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBPOHD_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipState")
    private String ftvshipState;
    /**
     * BO Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("blanketTermDate")
    private Date blanketTermDate;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("orgnDesc")
    private String orgnDesc;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipNatnCodeDesc")
    private String ftvshipNatnCodeDesc;
    /**
     * Freight Terms
     * <p>
     * Lineage reference object : FPBPOHD_FTRM_CODE
     * 
     */
    @JsonProperty("ftrmCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FTRM_CODE")
    private String ftrmCode;
    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTotal")
    private Double displayPoTotal;
    @JsonProperty("vendName")
    private String vendName;
    @JsonProperty("coasDesc")
    private String coasDesc;
    @JsonProperty("displayBuyrName")
    private String displayBuyrName;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    private String displayVendCode;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtension")
    private String displayExtension;
    /**
     * Fax
     * <p>
     * Lineage reference object : FPBPOHD_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FAX_AREA")
    private String faxArea;
    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBPOHD_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Order Type
     * <p>
     * Lineage reference object : FPBPOHD_PO_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("poTypeInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PO_TYPE_IND")
    private String poTypeInd;
    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR")
    private String vendEmailAddr;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    private String ftvshipPhoneExt;
    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ATYP_SEQ_NUM")
    private Double atypSeqNum;
    /**
     * Carrier
     * <p>
     * Lookup lineage reference object : favcarr
     * 
     */
    @JsonProperty("carrierCode")
    @JsonPropertyDescription("Lookup lineage reference object : favcarr")
    private String carrierCode;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCity")
    private String ftvshipCity;
    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_NAME")
    private String name;
    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchTempReq")
    private String matchTempReq;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PHONE_AREA")
    private String phoneArea;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("stateCode")
    private String stateCode;
    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctgTotal")
    private Double displayAcctgTotal;
    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBPOHD_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CODE")
    private String code;
    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBPOHD_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_REQD_DATE")
    private Date reqdDate;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    private String ftvshipZipCode;
    @JsonProperty("vendFaxExt")
    private String vendFaxExt;
    /**
     * Comments
     * <p>
     * Lineage reference object : FPBPOHD_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DELIVERY_COMMENT")
    private String deliveryComment;
    @JsonProperty("taxDesc")
    private String taxDesc;
    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    private String ftvshipBuilding;
    /**
     * Rush Order
     * <p>
     * Lineage reference object : FPBPOHD_RUSH_IND
     * 
     */
    @JsonProperty("rushInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_RUSH_IND")
    private String rushInd;
    /**
     * Fax Extension.
     * <p>
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FAX_EXT")
    private String faxExt;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBPOHD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_TRANS_DATE")
    private Date transDate;
    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    private String ftvshipFloor;
    /**
     * Blanket Order
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_CODE
     * 
     */
    @JsonProperty("blanketCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BLANKET_CODE")
    private String blanketCode;
    /**
     * Send via EDI
     * <p>
     * Lineage reference object : FPBPOHD_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_EDI_IND")
    private String ediInd;
    @JsonProperty("currDesc")
    private String currDesc;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    private String ftvshipPhoneNum;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    private String ftvshipAddrLine2;
    /**
     * Extension
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PHONE_EXT")
    private String phoneExt;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    private String ftvshipAddrLine1;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    private String ftvshipAddrLine3;
    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page1SuspInd")
    private String page1SuspInd;
    /**
     * PO created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("reqExistsInd")
    private String reqExistsInd;
    @JsonProperty("classCodeTitle")
    private String classCodeTitle;
    /**
     * Contact
     * <p>
     * Lineage reference object : FPBPOHD_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_VENDOR_CONTACT")
    private String vendorContact;
    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    private String ftvshipContact;
    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs
     * 
     */
    @JsonProperty("fobCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs")
    private String fobCode;
    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship")
    private String shipCode;
    @JsonProperty("discDesc")
    private String discDesc;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendTele1")
    private String displayVendTele1;
    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr")
    private String buyrCode;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine3")
    private String addrLine3;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine2")
    private String addrLine2;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine1")
    private String addrLine1;
    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_EMAIL_ADDR")
    private String emailAddr;
    /**
     * Phone
     * <p>
     * Lineage reference object : FPBPOHD_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FAX_NUMBER")
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
     * Address Type
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendAreaCode")
    public String getDisplayVendAreaCode() {
        return displayVendAreaCode;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendAreaCode")
    public void setDisplayVendAreaCode(String displayVendAreaCode) {
        this.displayVendAreaCode = displayVendAreaCode;
    }

    public PurchaseOrderInformation100PutResponse withDisplayVendAreaCode(String displayVendAreaCode) {
        this.displayVendAreaCode = displayVendAreaCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    public String getNatnDesc() {
        return natnDesc;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    public void setNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
    }

    public PurchaseOrderInformation100PutResponse withNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FPBPOHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FPBPOHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public PurchaseOrderInformation100PutResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FPBPOHD_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    public String getDisbAgentInd() {
        return disbAgentInd;
    }

    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FPBPOHD_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    public void setDisbAgentInd(String disbAgentInd) {
        this.disbAgentInd = disbAgentInd;
    }

    public PurchaseOrderInformation100PutResponse withDisbAgentInd(String disbAgentInd) {
        this.disbAgentInd = disbAgentInd;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBPOHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPBPOHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public PurchaseOrderInformation100PutResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxPhone")
    public String getVendFaxPhone() {
        return vendFaxPhone;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxPhone")
    public void setVendFaxPhone(String vendFaxPhone) {
        this.vendFaxPhone = vendFaxPhone;
    }

    public PurchaseOrderInformation100PutResponse withVendFaxPhone(String vendFaxPhone) {
        this.vendFaxPhone = vendFaxPhone;
        return this;
    }

    @JsonProperty("fobTitle")
    public String getFobTitle() {
        return fobTitle;
    }

    @JsonProperty("fobTitle")
    public void setFobTitle(String fobTitle) {
        this.fobTitle = fobTitle;
    }

    public PurchaseOrderInformation100PutResponse withFobTitle(String fobTitle) {
        this.fobTitle = fobTitle;
        return this;
    }

    @JsonProperty("ftrmDesc")
    public String getFtrmDesc() {
        return ftrmDesc;
    }

    @JsonProperty("ftrmDesc")
    public void setFtrmDesc(String ftrmDesc) {
        this.ftrmDesc = ftrmDesc;
    }

    public PurchaseOrderInformation100PutResponse withFtrmDesc(String ftrmDesc) {
        this.ftrmDesc = ftrmDesc;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_NUM
     * 
     */
    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PurchaseOrderInformation100PutResponse withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : FPBPOHD_PCLS_CODE, Lookup lineage reference object : ftvpcls
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : FPBPOHD_PCLS_CODE, Lookup lineage reference object : ftvpcls
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public PurchaseOrderInformation100PutResponse withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FPBPOHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FPBPOHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PurchaseOrderInformation100PutResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Purchase Order Copied From
     * <p>
     * Lineage reference object : FPBPOHD_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    public String getCopiedFrom() {
        return copiedFrom;
    }

    /**
     * Purchase Order Copied From
     * <p>
     * Lineage reference object : FPBPOHD_COPIED_FROM
     * 
     */
    @JsonProperty("copiedFrom")
    public void setCopiedFrom(String copiedFrom) {
        this.copiedFrom = copiedFrom;
    }

    public PurchaseOrderInformation100PutResponse withCopiedFrom(String copiedFrom) {
        this.copiedFrom = copiedFrom;
        return this;
    }

    /**
     * Requisition Document Text
     * <p>
     * Lineage reference object : FPBPOHD_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    public String getTextInd() {
        return textInd;
    }

    /**
     * Requisition Document Text
     * <p>
     * Lineage reference object : FPBPOHD_TEXT_IND
     * 
     */
    @JsonProperty("textInd")
    public void setTextInd(String textInd) {
        this.textInd = textInd;
    }

    public PurchaseOrderInformation100PutResponse withTextInd(String textInd) {
        this.textInd = textInd;
        return this;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrNote")
    public String getHdrNote() {
        return hdrNote;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrNote")
    public void setHdrNote(String hdrNote) {
        this.hdrNote = hdrNote;
    }

    public PurchaseOrderInformation100PutResponse withHdrNote(String hdrNote) {
        this.hdrNote = hdrNote;
        return this;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxArea")
    public String getVendFaxArea() {
        return vendFaxArea;
    }

    /**
     * Fax
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxArea")
    public void setVendFaxArea(String vendFaxArea) {
        this.vendFaxArea = vendFaxArea;
    }

    public PurchaseOrderInformation100PutResponse withVendFaxArea(String vendFaxArea) {
        this.vendFaxArea = vendFaxArea;
        return this;
    }

    @JsonProperty("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    @JsonProperty("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public PurchaseOrderInformation100PutResponse withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBPOHD_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public String getDiscCode() {
        return discCode;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPBPOHD_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public void setDiscCode(String discCode) {
        this.discCode = discCode;
    }

    public PurchaseOrderInformation100PutResponse withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_DATE
     * (Required)
     * 
     */
    @JsonProperty("poDate")
    public Date getPoDate() {
        return poDate;
    }

    /**
     * Order Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_DATE
     * (Required)
     * 
     */
    @JsonProperty("poDate")
    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public PurchaseOrderInformation100PutResponse withPoDate(Date poDate) {
        this.poDate = poDate;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    public String getFtvshipPhoneArea() {
        return ftvshipPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    public void setFtvshipPhoneArea(String ftvshipPhoneArea) {
        this.ftvshipPhoneArea = ftvshipPhoneArea;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipPhoneArea(String ftvshipPhoneArea) {
        this.ftvshipPhoneArea = ftvshipPhoneArea;
        return this;
    }

    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBPOHD_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    public String getAttentionTo() {
        return attentionTo;
    }

    /**
     * Attention To
     * <p>
     * Lineage reference object : FPBPOHD_ATTENTION_TO
     * 
     */
    @JsonProperty("attentionTo")
    public void setAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
    }

    public PurchaseOrderInformation100PutResponse withAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBPOHD_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FPBPOHD_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public PurchaseOrderInformation100PutResponse withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipState")
    public String getFtvshipState() {
        return ftvshipState;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipState")
    public void setFtvshipState(String ftvshipState) {
        this.ftvshipState = ftvshipState;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipState(String ftvshipState) {
        this.ftvshipState = ftvshipState;
        return this;
    }

    /**
     * BO Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("blanketTermDate")
    public Date getBlanketTermDate() {
        return blanketTermDate;
    }

    /**
     * BO Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("blanketTermDate")
    public void setBlanketTermDate(Date blanketTermDate) {
        this.blanketTermDate = blanketTermDate;
    }

    public PurchaseOrderInformation100PutResponse withBlanketTermDate(Date blanketTermDate) {
        this.blanketTermDate = blanketTermDate;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public PurchaseOrderInformation100PutResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @JsonProperty("orgnDesc")
    public String getOrgnDesc() {
        return orgnDesc;
    }

    @JsonProperty("orgnDesc")
    public void setOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
    }

    public PurchaseOrderInformation100PutResponse withOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipNatnCodeDesc")
    public String getFtvshipNatnCodeDesc() {
        return ftvshipNatnCodeDesc;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipNatnCodeDesc")
    public void setFtvshipNatnCodeDesc(String ftvshipNatnCodeDesc) {
        this.ftvshipNatnCodeDesc = ftvshipNatnCodeDesc;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipNatnCodeDesc(String ftvshipNatnCodeDesc) {
        this.ftvshipNatnCodeDesc = ftvshipNatnCodeDesc;
        return this;
    }

    /**
     * Freight Terms
     * <p>
     * Lineage reference object : FPBPOHD_FTRM_CODE
     * 
     */
    @JsonProperty("ftrmCode")
    public String getFtrmCode() {
        return ftrmCode;
    }

    /**
     * Freight Terms
     * <p>
     * Lineage reference object : FPBPOHD_FTRM_CODE
     * 
     */
    @JsonProperty("ftrmCode")
    public void setFtrmCode(String ftrmCode) {
        this.ftrmCode = ftrmCode;
    }

    public PurchaseOrderInformation100PutResponse withFtrmCode(String ftrmCode) {
        this.ftrmCode = ftrmCode;
        return this;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTotal")
    public Double getDisplayPoTotal() {
        return displayPoTotal;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTotal")
    public void setDisplayPoTotal(Double displayPoTotal) {
        this.displayPoTotal = displayPoTotal;
    }

    public PurchaseOrderInformation100PutResponse withDisplayPoTotal(Double displayPoTotal) {
        this.displayPoTotal = displayPoTotal;
        return this;
    }

    @JsonProperty("vendName")
    public String getVendName() {
        return vendName;
    }

    @JsonProperty("vendName")
    public void setVendName(String vendName) {
        this.vendName = vendName;
    }

    public PurchaseOrderInformation100PutResponse withVendName(String vendName) {
        this.vendName = vendName;
        return this;
    }

    @JsonProperty("coasDesc")
    public String getCoasDesc() {
        return coasDesc;
    }

    @JsonProperty("coasDesc")
    public void setCoasDesc(String coasDesc) {
        this.coasDesc = coasDesc;
    }

    public PurchaseOrderInformation100PutResponse withCoasDesc(String coasDesc) {
        this.coasDesc = coasDesc;
        return this;
    }

    @JsonProperty("displayBuyrName")
    public String getDisplayBuyrName() {
        return displayBuyrName;
    }

    @JsonProperty("displayBuyrName")
    public void setDisplayBuyrName(String displayBuyrName) {
        this.displayBuyrName = displayBuyrName;
    }

    public PurchaseOrderInformation100PutResponse withDisplayBuyrName(String displayBuyrName) {
        this.displayBuyrName = displayBuyrName;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    public String getDisplayVendCode() {
        return displayVendCode;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    public void setDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
    }

    public PurchaseOrderInformation100PutResponse withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtension")
    public String getDisplayExtension() {
        return displayExtension;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtension")
    public void setDisplayExtension(String displayExtension) {
        this.displayExtension = displayExtension;
    }

    public PurchaseOrderInformation100PutResponse withDisplayExtension(String displayExtension) {
        this.displayExtension = displayExtension;
        return this;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FPBPOHD_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    public String getFaxArea() {
        return faxArea;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FPBPOHD_FAX_AREA
     * 
     */
    @JsonProperty("faxArea")
    public void setFaxArea(String faxArea) {
        this.faxArea = faxArea;
    }

    public PurchaseOrderInformation100PutResponse withFaxArea(String faxArea) {
        this.faxArea = faxArea;
        return this;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBPOHD_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FPBPOHD_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public PurchaseOrderInformation100PutResponse withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Order Type
     * <p>
     * Lineage reference object : FPBPOHD_PO_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("poTypeInd")
    public String getPoTypeInd() {
        return poTypeInd;
    }

    /**
     * Order Type
     * <p>
     * Lineage reference object : FPBPOHD_PO_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("poTypeInd")
    public void setPoTypeInd(String poTypeInd) {
        this.poTypeInd = poTypeInd;
    }

    public PurchaseOrderInformation100PutResponse withPoTypeInd(String poTypeInd) {
        this.poTypeInd = poTypeInd;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    public String getVendEmailAddr() {
        return vendEmailAddr;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    public void setVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
    }

    public PurchaseOrderInformation100PutResponse withVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    public String getFtvshipPhoneExt() {
        return ftvshipPhoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    public void setFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
        return this;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public Double getAtypSeqNum() {
        return atypSeqNum;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public void setAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
    }

    public PurchaseOrderInformation100PutResponse withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
        return this;
    }

    /**
     * Carrier
     * <p>
     * Lookup lineage reference object : favcarr
     * 
     */
    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Carrier
     * <p>
     * Lookup lineage reference object : favcarr
     * 
     */
    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public PurchaseOrderInformation100PutResponse withCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCity")
    public String getFtvshipCity() {
        return ftvshipCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCity")
    public void setFtvshipCity(String ftvshipCity) {
        this.ftvshipCity = ftvshipCity;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipCity(String ftvshipCity) {
        this.ftvshipCity = ftvshipCity;
        return this;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
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
     * Lineage reference object : FPBPOHD_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PurchaseOrderInformation100PutResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchTempReq")
    public String getMatchTempReq() {
        return matchTempReq;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchTempReq")
    public void setMatchTempReq(String matchTempReq) {
        this.matchTempReq = matchTempReq;
    }

    public PurchaseOrderInformation100PutResponse withMatchTempReq(String matchTempReq) {
        this.matchTempReq = matchTempReq;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public PurchaseOrderInformation100PutResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public PurchaseOrderInformation100PutResponse withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctgTotal")
    public Double getDisplayAcctgTotal() {
        return displayAcctgTotal;
    }

    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctgTotal")
    public void setDisplayAcctgTotal(Double displayAcctgTotal) {
        this.displayAcctgTotal = displayAcctgTotal;
    }

    public PurchaseOrderInformation100PutResponse withDisplayAcctgTotal(Double displayAcctgTotal) {
        this.displayAcctgTotal = displayAcctgTotal;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBPOHD_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBPOHD_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PurchaseOrderInformation100PutResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBPOHD_REQD_DATE
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
     * Lineage reference object : FPBPOHD_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    public void setReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
    }

    public PurchaseOrderInformation100PutResponse withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public PurchaseOrderInformation100PutResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    public String getFtvshipZipCode() {
        return ftvshipZipCode;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    public void setFtvshipZipCode(String ftvshipZipCode) {
        this.ftvshipZipCode = ftvshipZipCode;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipZipCode(String ftvshipZipCode) {
        this.ftvshipZipCode = ftvshipZipCode;
        return this;
    }

    @JsonProperty("vendFaxExt")
    public String getVendFaxExt() {
        return vendFaxExt;
    }

    @JsonProperty("vendFaxExt")
    public void setVendFaxExt(String vendFaxExt) {
        this.vendFaxExt = vendFaxExt;
    }

    public PurchaseOrderInformation100PutResponse withVendFaxExt(String vendFaxExt) {
        this.vendFaxExt = vendFaxExt;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : FPBPOHD_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    public String getDeliveryComment() {
        return deliveryComment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : FPBPOHD_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }

    public PurchaseOrderInformation100PutResponse withDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
        return this;
    }

    @JsonProperty("taxDesc")
    public String getTaxDesc() {
        return taxDesc;
    }

    @JsonProperty("taxDesc")
    public void setTaxDesc(String taxDesc) {
        this.taxDesc = taxDesc;
    }

    public PurchaseOrderInformation100PutResponse withTaxDesc(String taxDesc) {
        this.taxDesc = taxDesc;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PurchaseOrderInformation100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public String getFtvshipBuilding() {
        return ftvshipBuilding;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public void setFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
        return this;
    }

    /**
     * Rush Order
     * <p>
     * Lineage reference object : FPBPOHD_RUSH_IND
     * 
     */
    @JsonProperty("rushInd")
    public String getRushInd() {
        return rushInd;
    }

    /**
     * Rush Order
     * <p>
     * Lineage reference object : FPBPOHD_RUSH_IND
     * 
     */
    @JsonProperty("rushInd")
    public void setRushInd(String rushInd) {
        this.rushInd = rushInd;
    }

    public PurchaseOrderInformation100PutResponse withRushInd(String rushInd) {
        this.rushInd = rushInd;
        return this;
    }

    /**
     * Fax Extension.
     * <p>
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public String getFaxExt() {
        return faxExt;
    }

    /**
     * Fax Extension.
     * <p>
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    public PurchaseOrderInformation100PutResponse withFaxExt(String faxExt) {
        this.faxExt = faxExt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBPOHD_TRANS_DATE
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
     * Lineage reference object : FPBPOHD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public PurchaseOrderInformation100PutResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    public String getFtvshipFloor() {
        return ftvshipFloor;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    public void setFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
        return this;
    }

    /**
     * Blanket Order
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_CODE
     * 
     */
    @JsonProperty("blanketCode")
    public String getBlanketCode() {
        return blanketCode;
    }

    /**
     * Blanket Order
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_CODE
     * 
     */
    @JsonProperty("blanketCode")
    public void setBlanketCode(String blanketCode) {
        this.blanketCode = blanketCode;
    }

    public PurchaseOrderInformation100PutResponse withBlanketCode(String blanketCode) {
        this.blanketCode = blanketCode;
        return this;
    }

    /**
     * Send via EDI
     * <p>
     * Lineage reference object : FPBPOHD_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    public String getEdiInd() {
        return ediInd;
    }

    /**
     * Send via EDI
     * <p>
     * Lineage reference object : FPBPOHD_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    public void setEdiInd(String ediInd) {
        this.ediInd = ediInd;
    }

    public PurchaseOrderInformation100PutResponse withEdiInd(String ediInd) {
        this.ediInd = ediInd;
        return this;
    }

    @JsonProperty("currDesc")
    public String getCurrDesc() {
        return currDesc;
    }

    @JsonProperty("currDesc")
    public void setCurrDesc(String currDesc) {
        this.currDesc = currDesc;
    }

    public PurchaseOrderInformation100PutResponse withCurrDesc(String currDesc) {
        this.currDesc = currDesc;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    public String getFtvshipPhoneNum() {
        return ftvshipPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    public void setFtvshipPhoneNum(String ftvshipPhoneNum) {
        this.ftvshipPhoneNum = ftvshipPhoneNum;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipPhoneNum(String ftvshipPhoneNum) {
        this.ftvshipPhoneNum = ftvshipPhoneNum;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    public String getFtvshipAddrLine2() {
        return ftvshipAddrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    public void setFtvshipAddrLine2(String ftvshipAddrLine2) {
        this.ftvshipAddrLine2 = ftvshipAddrLine2;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipAddrLine2(String ftvshipAddrLine2) {
        this.ftvshipAddrLine2 = ftvshipAddrLine2;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FPBPOHD_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public PurchaseOrderInformation100PutResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    public String getFtvshipAddrLine1() {
        return ftvshipAddrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    public void setFtvshipAddrLine1(String ftvshipAddrLine1) {
        this.ftvshipAddrLine1 = ftvshipAddrLine1;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipAddrLine1(String ftvshipAddrLine1) {
        this.ftvshipAddrLine1 = ftvshipAddrLine1;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    public String getFtvshipAddrLine3() {
        return ftvshipAddrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    public void setFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
        return this;
    }

    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page1SuspInd")
    public String getPage1SuspInd() {
        return page1SuspInd;
    }

    /**
     * In Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page1SuspInd")
    public void setPage1SuspInd(String page1SuspInd) {
        this.page1SuspInd = page1SuspInd;
    }

    public PurchaseOrderInformation100PutResponse withPage1SuspInd(String page1SuspInd) {
        this.page1SuspInd = page1SuspInd;
        return this;
    }

    /**
     * PO created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("reqExistsInd")
    public String getReqExistsInd() {
        return reqExistsInd;
    }

    /**
     * PO created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("reqExistsInd")
    public void setReqExistsInd(String reqExistsInd) {
        this.reqExistsInd = reqExistsInd;
    }

    public PurchaseOrderInformation100PutResponse withReqExistsInd(String reqExistsInd) {
        this.reqExistsInd = reqExistsInd;
        return this;
    }

    @JsonProperty("classCodeTitle")
    public String getClassCodeTitle() {
        return classCodeTitle;
    }

    @JsonProperty("classCodeTitle")
    public void setClassCodeTitle(String classCodeTitle) {
        this.classCodeTitle = classCodeTitle;
    }

    public PurchaseOrderInformation100PutResponse withClassCodeTitle(String classCodeTitle) {
        this.classCodeTitle = classCodeTitle;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FPBPOHD_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    public String getVendorContact() {
        return vendorContact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FPBPOHD_VENDOR_CONTACT
     * 
     */
    @JsonProperty("vendorContact")
    public void setVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
    }

    public PurchaseOrderInformation100PutResponse withVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
        return this;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    public String getFtvshipContact() {
        return ftvshipContact;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    public void setFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
    }

    public PurchaseOrderInformation100PutResponse withFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
        return this;
    }

    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs
     * 
     */
    @JsonProperty("fobCode")
    public String getFobCode() {
        return fobCode;
    }

    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs
     * 
     */
    @JsonProperty("fobCode")
    public void setFobCode(String fobCode) {
        this.fobCode = fobCode;
    }

    public PurchaseOrderInformation100PutResponse withFobCode(String fobCode) {
        this.fobCode = fobCode;
        return this;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public PurchaseOrderInformation100PutResponse withShipCode(String shipCode) {
        this.shipCode = shipCode;
        return this;
    }

    @JsonProperty("discDesc")
    public String getDiscDesc() {
        return discDesc;
    }

    @JsonProperty("discDesc")
    public void setDiscDesc(String discDesc) {
        this.discDesc = discDesc;
    }

    public PurchaseOrderInformation100PutResponse withDiscDesc(String discDesc) {
        this.discDesc = discDesc;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendTele1")
    public String getDisplayVendTele1() {
        return displayVendTele1;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendTele1")
    public void setDisplayVendTele1(String displayVendTele1) {
        this.displayVendTele1 = displayVendTele1;
    }

    public PurchaseOrderInformation100PutResponse withDisplayVendTele1(String displayVendTele1) {
        this.displayVendTele1 = displayVendTele1;
        return this;
    }

    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    public String getBuyrCode() {
        return buyrCode;
    }

    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    public void setBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
    }

    public PurchaseOrderInformation100PutResponse withBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine3")
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine3")
    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public PurchaseOrderInformation100PutResponse withAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine2")
    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public PurchaseOrderInformation100PutResponse withAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine1")
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public PurchaseOrderInformation100PutResponse withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public PurchaseOrderInformation100PutResponse withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FPBPOHD_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FPBPOHD_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public PurchaseOrderInformation100PutResponse withFaxNumber(String faxNumber) {
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

    public PurchaseOrderInformation100PutResponse withVendorHold(String vendorHold) {
        this.vendorHold = vendorHold;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public PurchaseOrderInformation100PutResponse withAtypCode(String atypCode) {
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

    public PurchaseOrderInformation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderInformation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayVendAreaCode");
        sb.append('=');
        sb.append(((this.displayVendAreaCode == null)?"<null>":this.displayVendAreaCode));
        sb.append(',');
        sb.append("natnDesc");
        sb.append('=');
        sb.append(((this.natnDesc == null)?"<null>":this.natnDesc));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("disbAgentInd");
        sb.append('=');
        sb.append(((this.disbAgentInd == null)?"<null>":this.disbAgentInd));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("vendFaxPhone");
        sb.append('=');
        sb.append(((this.vendFaxPhone == null)?"<null>":this.vendFaxPhone));
        sb.append(',');
        sb.append("fobTitle");
        sb.append('=');
        sb.append(((this.fobTitle == null)?"<null>":this.fobTitle));
        sb.append(',');
        sb.append("ftrmDesc");
        sb.append('=');
        sb.append(((this.ftrmDesc == null)?"<null>":this.ftrmDesc));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("copiedFrom");
        sb.append('=');
        sb.append(((this.copiedFrom == null)?"<null>":this.copiedFrom));
        sb.append(',');
        sb.append("textInd");
        sb.append('=');
        sb.append(((this.textInd == null)?"<null>":this.textInd));
        sb.append(',');
        sb.append("hdrNote");
        sb.append('=');
        sb.append(((this.hdrNote == null)?"<null>":this.hdrNote));
        sb.append(',');
        sb.append("vendFaxArea");
        sb.append('=');
        sb.append(((this.vendFaxArea == null)?"<null>":this.vendFaxArea));
        sb.append(',');
        sb.append("carrierName");
        sb.append('=');
        sb.append(((this.carrierName == null)?"<null>":this.carrierName));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("poDate");
        sb.append('=');
        sb.append(((this.poDate == null)?"<null>":this.poDate));
        sb.append(',');
        sb.append("ftvshipPhoneArea");
        sb.append('=');
        sb.append(((this.ftvshipPhoneArea == null)?"<null>":this.ftvshipPhoneArea));
        sb.append(',');
        sb.append("attentionTo");
        sb.append('=');
        sb.append(((this.attentionTo == null)?"<null>":this.attentionTo));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("ftvshipState");
        sb.append('=');
        sb.append(((this.ftvshipState == null)?"<null>":this.ftvshipState));
        sb.append(',');
        sb.append("blanketTermDate");
        sb.append('=');
        sb.append(((this.blanketTermDate == null)?"<null>":this.blanketTermDate));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("orgnDesc");
        sb.append('=');
        sb.append(((this.orgnDesc == null)?"<null>":this.orgnDesc));
        sb.append(',');
        sb.append("ftvshipNatnCodeDesc");
        sb.append('=');
        sb.append(((this.ftvshipNatnCodeDesc == null)?"<null>":this.ftvshipNatnCodeDesc));
        sb.append(',');
        sb.append("ftrmCode");
        sb.append('=');
        sb.append(((this.ftrmCode == null)?"<null>":this.ftrmCode));
        sb.append(',');
        sb.append("displayPoTotal");
        sb.append('=');
        sb.append(((this.displayPoTotal == null)?"<null>":this.displayPoTotal));
        sb.append(',');
        sb.append("vendName");
        sb.append('=');
        sb.append(((this.vendName == null)?"<null>":this.vendName));
        sb.append(',');
        sb.append("coasDesc");
        sb.append('=');
        sb.append(((this.coasDesc == null)?"<null>":this.coasDesc));
        sb.append(',');
        sb.append("displayBuyrName");
        sb.append('=');
        sb.append(((this.displayBuyrName == null)?"<null>":this.displayBuyrName));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("displayExtension");
        sb.append('=');
        sb.append(((this.displayExtension == null)?"<null>":this.displayExtension));
        sb.append(',');
        sb.append("faxArea");
        sb.append('=');
        sb.append(((this.faxArea == null)?"<null>":this.faxArea));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("poTypeInd");
        sb.append('=');
        sb.append(((this.poTypeInd == null)?"<null>":this.poTypeInd));
        sb.append(',');
        sb.append("vendEmailAddr");
        sb.append('=');
        sb.append(((this.vendEmailAddr == null)?"<null>":this.vendEmailAddr));
        sb.append(',');
        sb.append("ftvshipPhoneExt");
        sb.append('=');
        sb.append(((this.ftvshipPhoneExt == null)?"<null>":this.ftvshipPhoneExt));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("carrierCode");
        sb.append('=');
        sb.append(((this.carrierCode == null)?"<null>":this.carrierCode));
        sb.append(',');
        sb.append("ftvshipCity");
        sb.append('=');
        sb.append(((this.ftvshipCity == null)?"<null>":this.ftvshipCity));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("matchTempReq");
        sb.append('=');
        sb.append(((this.matchTempReq == null)?"<null>":this.matchTempReq));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("displayAcctgTotal");
        sb.append('=');
        sb.append(((this.displayAcctgTotal == null)?"<null>":this.displayAcctgTotal));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("ftvshipZipCode");
        sb.append('=');
        sb.append(((this.ftvshipZipCode == null)?"<null>":this.ftvshipZipCode));
        sb.append(',');
        sb.append("vendFaxExt");
        sb.append('=');
        sb.append(((this.vendFaxExt == null)?"<null>":this.vendFaxExt));
        sb.append(',');
        sb.append("deliveryComment");
        sb.append('=');
        sb.append(((this.deliveryComment == null)?"<null>":this.deliveryComment));
        sb.append(',');
        sb.append("taxDesc");
        sb.append('=');
        sb.append(((this.taxDesc == null)?"<null>":this.taxDesc));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("ftvshipBuilding");
        sb.append('=');
        sb.append(((this.ftvshipBuilding == null)?"<null>":this.ftvshipBuilding));
        sb.append(',');
        sb.append("rushInd");
        sb.append('=');
        sb.append(((this.rushInd == null)?"<null>":this.rushInd));
        sb.append(',');
        sb.append("faxExt");
        sb.append('=');
        sb.append(((this.faxExt == null)?"<null>":this.faxExt));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("ftvshipFloor");
        sb.append('=');
        sb.append(((this.ftvshipFloor == null)?"<null>":this.ftvshipFloor));
        sb.append(',');
        sb.append("blanketCode");
        sb.append('=');
        sb.append(((this.blanketCode == null)?"<null>":this.blanketCode));
        sb.append(',');
        sb.append("ediInd");
        sb.append('=');
        sb.append(((this.ediInd == null)?"<null>":this.ediInd));
        sb.append(',');
        sb.append("currDesc");
        sb.append('=');
        sb.append(((this.currDesc == null)?"<null>":this.currDesc));
        sb.append(',');
        sb.append("ftvshipPhoneNum");
        sb.append('=');
        sb.append(((this.ftvshipPhoneNum == null)?"<null>":this.ftvshipPhoneNum));
        sb.append(',');
        sb.append("ftvshipAddrLine2");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine2 == null)?"<null>":this.ftvshipAddrLine2));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("ftvshipAddrLine1");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine1 == null)?"<null>":this.ftvshipAddrLine1));
        sb.append(',');
        sb.append("ftvshipAddrLine3");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine3 == null)?"<null>":this.ftvshipAddrLine3));
        sb.append(',');
        sb.append("page1SuspInd");
        sb.append('=');
        sb.append(((this.page1SuspInd == null)?"<null>":this.page1SuspInd));
        sb.append(',');
        sb.append("reqExistsInd");
        sb.append('=');
        sb.append(((this.reqExistsInd == null)?"<null>":this.reqExistsInd));
        sb.append(',');
        sb.append("classCodeTitle");
        sb.append('=');
        sb.append(((this.classCodeTitle == null)?"<null>":this.classCodeTitle));
        sb.append(',');
        sb.append("vendorContact");
        sb.append('=');
        sb.append(((this.vendorContact == null)?"<null>":this.vendorContact));
        sb.append(',');
        sb.append("ftvshipContact");
        sb.append('=');
        sb.append(((this.ftvshipContact == null)?"<null>":this.ftvshipContact));
        sb.append(',');
        sb.append("fobCode");
        sb.append('=');
        sb.append(((this.fobCode == null)?"<null>":this.fobCode));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("discDesc");
        sb.append('=');
        sb.append(((this.discDesc == null)?"<null>":this.discDesc));
        sb.append(',');
        sb.append("displayVendTele1");
        sb.append('=');
        sb.append(((this.displayVendTele1 == null)?"<null>":this.displayVendTele1));
        sb.append(',');
        sb.append("buyrCode");
        sb.append('=');
        sb.append(((this.buyrCode == null)?"<null>":this.buyrCode));
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
        sb.append("emailAddr");
        sb.append('=');
        sb.append(((this.emailAddr == null)?"<null>":this.emailAddr));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("vendorHold");
        sb.append('=');
        sb.append(((this.vendorHold == null)?"<null>":this.vendorHold));
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
        result = ((result* 31)+((this.displayVendAreaCode == null)? 0 :this.displayVendAreaCode.hashCode()));
        result = ((result* 31)+((this.natnDesc == null)? 0 :this.natnDesc.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.disbAgentInd == null)? 0 :this.disbAgentInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.vendFaxPhone == null)? 0 :this.vendFaxPhone.hashCode()));
        result = ((result* 31)+((this.fobTitle == null)? 0 :this.fobTitle.hashCode()));
        result = ((result* 31)+((this.ftrmDesc == null)? 0 :this.ftrmDesc.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.copiedFrom == null)? 0 :this.copiedFrom.hashCode()));
        result = ((result* 31)+((this.textInd == null)? 0 :this.textInd.hashCode()));
        result = ((result* 31)+((this.hdrNote == null)? 0 :this.hdrNote.hashCode()));
        result = ((result* 31)+((this.vendFaxArea == null)? 0 :this.vendFaxArea.hashCode()));
        result = ((result* 31)+((this.carrierName == null)? 0 :this.carrierName.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.poDate == null)? 0 :this.poDate.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneArea == null)? 0 :this.ftvshipPhoneArea.hashCode()));
        result = ((result* 31)+((this.attentionTo == null)? 0 :this.attentionTo.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.ftvshipState == null)? 0 :this.ftvshipState.hashCode()));
        result = ((result* 31)+((this.blanketTermDate == null)? 0 :this.blanketTermDate.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.orgnDesc == null)? 0 :this.orgnDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipNatnCodeDesc == null)? 0 :this.ftvshipNatnCodeDesc.hashCode()));
        result = ((result* 31)+((this.ftrmCode == null)? 0 :this.ftrmCode.hashCode()));
        result = ((result* 31)+((this.displayPoTotal == null)? 0 :this.displayPoTotal.hashCode()));
        result = ((result* 31)+((this.vendName == null)? 0 :this.vendName.hashCode()));
        result = ((result* 31)+((this.coasDesc == null)? 0 :this.coasDesc.hashCode()));
        result = ((result* 31)+((this.displayBuyrName == null)? 0 :this.displayBuyrName.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.displayExtension == null)? 0 :this.displayExtension.hashCode()));
        result = ((result* 31)+((this.faxArea == null)? 0 :this.faxArea.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.poTypeInd == null)? 0 :this.poTypeInd.hashCode()));
        result = ((result* 31)+((this.vendEmailAddr == null)? 0 :this.vendEmailAddr.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneExt == null)? 0 :this.ftvshipPhoneExt.hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.carrierCode == null)? 0 :this.carrierCode.hashCode()));
        result = ((result* 31)+((this.ftvshipCity == null)? 0 :this.ftvshipCity.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.matchTempReq == null)? 0 :this.matchTempReq.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayAcctgTotal == null)? 0 :this.displayAcctgTotal.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.ftvshipZipCode == null)? 0 :this.ftvshipZipCode.hashCode()));
        result = ((result* 31)+((this.vendFaxExt == null)? 0 :this.vendFaxExt.hashCode()));
        result = ((result* 31)+((this.deliveryComment == null)? 0 :this.deliveryComment.hashCode()));
        result = ((result* 31)+((this.taxDesc == null)? 0 :this.taxDesc.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.ftvshipBuilding == null)? 0 :this.ftvshipBuilding.hashCode()));
        result = ((result* 31)+((this.rushInd == null)? 0 :this.rushInd.hashCode()));
        result = ((result* 31)+((this.faxExt == null)? 0 :this.faxExt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.ftvshipFloor == null)? 0 :this.ftvshipFloor.hashCode()));
        result = ((result* 31)+((this.blanketCode == null)? 0 :this.blanketCode.hashCode()));
        result = ((result* 31)+((this.ediInd == null)? 0 :this.ediInd.hashCode()));
        result = ((result* 31)+((this.currDesc == null)? 0 :this.currDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneNum == null)? 0 :this.ftvshipPhoneNum.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine2 == null)? 0 :this.ftvshipAddrLine2 .hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine1 == null)? 0 :this.ftvshipAddrLine1 .hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine3 == null)? 0 :this.ftvshipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.page1SuspInd == null)? 0 :this.page1SuspInd.hashCode()));
        result = ((result* 31)+((this.reqExistsInd == null)? 0 :this.reqExistsInd.hashCode()));
        result = ((result* 31)+((this.classCodeTitle == null)? 0 :this.classCodeTitle.hashCode()));
        result = ((result* 31)+((this.vendorContact == null)? 0 :this.vendorContact.hashCode()));
        result = ((result* 31)+((this.ftvshipContact == null)? 0 :this.ftvshipContact.hashCode()));
        result = ((result* 31)+((this.fobCode == null)? 0 :this.fobCode.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.discDesc == null)? 0 :this.discDesc.hashCode()));
        result = ((result* 31)+((this.displayVendTele1 == null)? 0 :this.displayVendTele1 .hashCode()));
        result = ((result* 31)+((this.buyrCode == null)? 0 :this.buyrCode.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.emailAddr == null)? 0 :this.emailAddr.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.vendorHold == null)? 0 :this.vendorHold.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderInformation100PutResponse) == false) {
            return false;
        }
        PurchaseOrderInformation100PutResponse rhs = ((PurchaseOrderInformation100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.displayVendAreaCode == rhs.displayVendAreaCode)||((this.displayVendAreaCode!= null)&&this.displayVendAreaCode.equals(rhs.displayVendAreaCode)))&&((this.natnDesc == rhs.natnDesc)||((this.natnDesc!= null)&&this.natnDesc.equals(rhs.natnDesc))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.disbAgentInd == rhs.disbAgentInd)||((this.disbAgentInd!= null)&&this.disbAgentInd.equals(rhs.disbAgentInd))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.vendFaxPhone == rhs.vendFaxPhone)||((this.vendFaxPhone!= null)&&this.vendFaxPhone.equals(rhs.vendFaxPhone))))&&((this.fobTitle == rhs.fobTitle)||((this.fobTitle!= null)&&this.fobTitle.equals(rhs.fobTitle))))&&((this.ftrmDesc == rhs.ftrmDesc)||((this.ftrmDesc!= null)&&this.ftrmDesc.equals(rhs.ftrmDesc))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.copiedFrom == rhs.copiedFrom)||((this.copiedFrom!= null)&&this.copiedFrom.equals(rhs.copiedFrom))))&&((this.textInd == rhs.textInd)||((this.textInd!= null)&&this.textInd.equals(rhs.textInd))))&&((this.hdrNote == rhs.hdrNote)||((this.hdrNote!= null)&&this.hdrNote.equals(rhs.hdrNote))))&&((this.vendFaxArea == rhs.vendFaxArea)||((this.vendFaxArea!= null)&&this.vendFaxArea.equals(rhs.vendFaxArea))))&&((this.carrierName == rhs.carrierName)||((this.carrierName!= null)&&this.carrierName.equals(rhs.carrierName))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.poDate == rhs.poDate)||((this.poDate!= null)&&this.poDate.equals(rhs.poDate))))&&((this.ftvshipPhoneArea == rhs.ftvshipPhoneArea)||((this.ftvshipPhoneArea!= null)&&this.ftvshipPhoneArea.equals(rhs.ftvshipPhoneArea))))&&((this.attentionTo == rhs.attentionTo)||((this.attentionTo!= null)&&this.attentionTo.equals(rhs.attentionTo))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.ftvshipState == rhs.ftvshipState)||((this.ftvshipState!= null)&&this.ftvshipState.equals(rhs.ftvshipState))))&&((this.blanketTermDate == rhs.blanketTermDate)||((this.blanketTermDate!= null)&&this.blanketTermDate.equals(rhs.blanketTermDate))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.orgnDesc == rhs.orgnDesc)||((this.orgnDesc!= null)&&this.orgnDesc.equals(rhs.orgnDesc))))&&((this.ftvshipNatnCodeDesc == rhs.ftvshipNatnCodeDesc)||((this.ftvshipNatnCodeDesc!= null)&&this.ftvshipNatnCodeDesc.equals(rhs.ftvshipNatnCodeDesc))))&&((this.ftrmCode == rhs.ftrmCode)||((this.ftrmCode!= null)&&this.ftrmCode.equals(rhs.ftrmCode))))&&((this.displayPoTotal == rhs.displayPoTotal)||((this.displayPoTotal!= null)&&this.displayPoTotal.equals(rhs.displayPoTotal))))&&((this.vendName == rhs.vendName)||((this.vendName!= null)&&this.vendName.equals(rhs.vendName))))&&((this.coasDesc == rhs.coasDesc)||((this.coasDesc!= null)&&this.coasDesc.equals(rhs.coasDesc))))&&((this.displayBuyrName == rhs.displayBuyrName)||((this.displayBuyrName!= null)&&this.displayBuyrName.equals(rhs.displayBuyrName))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.displayExtension == rhs.displayExtension)||((this.displayExtension!= null)&&this.displayExtension.equals(rhs.displayExtension))))&&((this.faxArea == rhs.faxArea)||((this.faxArea!= null)&&this.faxArea.equals(rhs.faxArea))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.poTypeInd == rhs.poTypeInd)||((this.poTypeInd!= null)&&this.poTypeInd.equals(rhs.poTypeInd))))&&((this.vendEmailAddr == rhs.vendEmailAddr)||((this.vendEmailAddr!= null)&&this.vendEmailAddr.equals(rhs.vendEmailAddr))))&&((this.ftvshipPhoneExt == rhs.ftvshipPhoneExt)||((this.ftvshipPhoneExt!= null)&&this.ftvshipPhoneExt.equals(rhs.ftvshipPhoneExt))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.carrierCode == rhs.carrierCode)||((this.carrierCode!= null)&&this.carrierCode.equals(rhs.carrierCode))))&&((this.ftvshipCity == rhs.ftvshipCity)||((this.ftvshipCity!= null)&&this.ftvshipCity.equals(rhs.ftvshipCity))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.matchTempReq == rhs.matchTempReq)||((this.matchTempReq!= null)&&this.matchTempReq.equals(rhs.matchTempReq))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayAcctgTotal == rhs.displayAcctgTotal)||((this.displayAcctgTotal!= null)&&this.displayAcctgTotal.equals(rhs.displayAcctgTotal))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.ftvshipZipCode == rhs.ftvshipZipCode)||((this.ftvshipZipCode!= null)&&this.ftvshipZipCode.equals(rhs.ftvshipZipCode))))&&((this.vendFaxExt == rhs.vendFaxExt)||((this.vendFaxExt!= null)&&this.vendFaxExt.equals(rhs.vendFaxExt))))&&((this.deliveryComment == rhs.deliveryComment)||((this.deliveryComment!= null)&&this.deliveryComment.equals(rhs.deliveryComment))))&&((this.taxDesc == rhs.taxDesc)||((this.taxDesc!= null)&&this.taxDesc.equals(rhs.taxDesc))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.ftvshipBuilding == rhs.ftvshipBuilding)||((this.ftvshipBuilding!= null)&&this.ftvshipBuilding.equals(rhs.ftvshipBuilding))))&&((this.rushInd == rhs.rushInd)||((this.rushInd!= null)&&this.rushInd.equals(rhs.rushInd))))&&((this.faxExt == rhs.faxExt)||((this.faxExt!= null)&&this.faxExt.equals(rhs.faxExt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.ftvshipFloor == rhs.ftvshipFloor)||((this.ftvshipFloor!= null)&&this.ftvshipFloor.equals(rhs.ftvshipFloor))))&&((this.blanketCode == rhs.blanketCode)||((this.blanketCode!= null)&&this.blanketCode.equals(rhs.blanketCode))))&&((this.ediInd == rhs.ediInd)||((this.ediInd!= null)&&this.ediInd.equals(rhs.ediInd))))&&((this.currDesc == rhs.currDesc)||((this.currDesc!= null)&&this.currDesc.equals(rhs.currDesc))))&&((this.ftvshipPhoneNum == rhs.ftvshipPhoneNum)||((this.ftvshipPhoneNum!= null)&&this.ftvshipPhoneNum.equals(rhs.ftvshipPhoneNum))))&&((this.ftvshipAddrLine2 == rhs.ftvshipAddrLine2)||((this.ftvshipAddrLine2 != null)&&this.ftvshipAddrLine2 .equals(rhs.ftvshipAddrLine2))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.ftvshipAddrLine1 == rhs.ftvshipAddrLine1)||((this.ftvshipAddrLine1 != null)&&this.ftvshipAddrLine1 .equals(rhs.ftvshipAddrLine1))))&&((this.ftvshipAddrLine3 == rhs.ftvshipAddrLine3)||((this.ftvshipAddrLine3 != null)&&this.ftvshipAddrLine3 .equals(rhs.ftvshipAddrLine3))))&&((this.page1SuspInd == rhs.page1SuspInd)||((this.page1SuspInd!= null)&&this.page1SuspInd.equals(rhs.page1SuspInd))))&&((this.reqExistsInd == rhs.reqExistsInd)||((this.reqExistsInd!= null)&&this.reqExistsInd.equals(rhs.reqExistsInd))))&&((this.classCodeTitle == rhs.classCodeTitle)||((this.classCodeTitle!= null)&&this.classCodeTitle.equals(rhs.classCodeTitle))))&&((this.vendorContact == rhs.vendorContact)||((this.vendorContact!= null)&&this.vendorContact.equals(rhs.vendorContact))))&&((this.ftvshipContact == rhs.ftvshipContact)||((this.ftvshipContact!= null)&&this.ftvshipContact.equals(rhs.ftvshipContact))))&&((this.fobCode == rhs.fobCode)||((this.fobCode!= null)&&this.fobCode.equals(rhs.fobCode))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.discDesc == rhs.discDesc)||((this.discDesc!= null)&&this.discDesc.equals(rhs.discDesc))))&&((this.displayVendTele1 == rhs.displayVendTele1)||((this.displayVendTele1 != null)&&this.displayVendTele1 .equals(rhs.displayVendTele1))))&&((this.buyrCode == rhs.buyrCode)||((this.buyrCode!= null)&&this.buyrCode.equals(rhs.buyrCode))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.emailAddr == rhs.emailAddr)||((this.emailAddr!= null)&&this.emailAddr.equals(rhs.emailAddr))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.vendorHold == rhs.vendorHold)||((this.vendorHold!= null)&&this.vendorHold.equals(rhs.vendorHold))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
