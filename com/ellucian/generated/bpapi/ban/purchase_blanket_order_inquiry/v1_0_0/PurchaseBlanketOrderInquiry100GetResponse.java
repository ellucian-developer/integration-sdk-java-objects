
package com.ellucian.generated.bpapi.ban.purchase_blanket_order_inquiry.v1_0_0;

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
    "currCode",
    "disbAgentInd",
    "tgrpCode",
    "rtextInd",
    "vendZip",
    "phoneNum",
    "pclsCode",
    "orgnCode",
    "docRefCode",
    "vendPhoneNum",
    "copiedFrom",
    "hdrNote",
    "vendFaxArea",
    "carrierName",
    "apprInd",
    "discCode",
    "ftvshipPhoneArea",
    "attentionTo",
    "completeInd",
    "originCode",
    "nsfOnOffInd",
    "ftvshipState",
    "blanketTermDate",
    "vendFaxNum",
    "vendName",
    "displayBuyrName",
    "displayVendCode",
    "fobsDesc",
    "faxArea",
    "editDeferInd",
    "vendEmailAddr",
    "ftvshipPhoneExt",
    "vendAddrLine3",
    "atypSeqNum",
    "vendAddrLine2",
    "carrierCode",
    "ftvshipCity",
    "name",
    "phoneArea",
    "vendAddrLine1",
    "vendNatnDesc",
    "coasTitle",
    "displayPoCode",
    "cancelDate",
    "matchDescription",
    "ftvshipZipCode",
    "vendFaxExt",
    "vendCity",
    "deliveryComment",
    "coasCode",
    "activityDate",
    "ftvshipBuilding",
    "rushInd",
    "stvnatnNation",
    "faxExt",
    "ftvcrsnDesc",
    "optionNote",
    "ftvshipFloor",
    "currDesc",
    "ftvshipPhoneNum",
    "ftvshipAddrLine2",
    "phoneExt",
    "ftvshipAddrLine1",
    "ftvshipAddrLine3",
    "classCodeTitle",
    "orgTitle",
    "vendorContact",
    "ftvshipContact",
    "vendPhoneExt",
    "fobCode",
    "userId",
    "shipCode",
    "discDesc",
    "vendPhoneArea",
    "buyrCode",
    "closedDate",
    "tgrpTitle",
    "emailAddr",
    "faxNumber",
    "displayBlanketCode",
    "poPrintedDate",
    "atypCode",
    "vendStateCode"
})
@Generated("jsonschema2pojo")
public class PurchaseBlanketOrderInquiry100GetResponse {

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
     * Purchase Order Created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("rtextInd")
    private String rtextInd;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendZip")
    private String vendZip;
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
     * Reference Number
     * <p>
     * Lineage reference object : FPBPOHD_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DOC_REF_CODE")
    private String docRefCode;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneNum")
    private String vendPhoneNum;
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
     * Approved
     * <p>
     * Lineage reference object : FPBPOHD_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_APPR_IND")
    private String apprInd;
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
     * Complete
     * <p>
     * Lineage reference object : FPBPOHD_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_COMPLETE_IND")
    private String completeInd;
    /**
     * Origin
     * <p>
     * Lineage reference object : FPBPOHD_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ORIGIN_CODE")
    private String originCode;
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
     * Blanket Order Termination Date
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_TERM_DATE
     * 
     */
    @JsonProperty("blanketTermDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BLANKET_TERM_DATE")
    private Date blanketTermDate;
    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxNum")
    private String vendFaxNum;
    @JsonProperty("vendName")
    private String vendName;
    @JsonProperty("displayBuyrName")
    private String displayBuyrName;
    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String displayVendCode;
    @JsonProperty("fobsDesc")
    private String fobsDesc;
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
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine3")
    private String vendAddrLine3;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ATYP_SEQ_NUM")
    private Double atypSeqNum;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine2")
    private String vendAddrLine2;
    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierCode")
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
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_NAME")
    private String name;
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
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine1")
    private String vendAddrLine1;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendNatnDesc")
    private String vendNatnDesc;
    @JsonProperty("coasTitle")
    private String coasTitle;
    /**
     * Purchase Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoCode")
    private String displayPoCode;
    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBPOHD_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CANCEL_DATE")
    private Date cancelDate;
    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    private String matchDescription;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    private String ftvshipZipCode;
    @JsonProperty("vendFaxExt")
    private String vendFaxExt;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendCity")
    private String vendCity;
    /**
     * Comments
     * <p>
     * Lineage reference object : FPBPOHD_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DELIVERY_COMMENT")
    private String deliveryComment;
    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_COAS_CODE")
    private String coasCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBPOHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ACTIVITY_DATE")
    private Date activityDate;
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
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvnatnNation")
    private String stvnatnNation;
    /**
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FAX_EXT")
    private String faxExt;
    @JsonProperty("ftvcrsnDesc")
    private String ftvcrsnDesc;
    /**
     * Requisition Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("optionNote")
    private String optionNote;
    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    private String ftvshipFloor;
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
    @JsonProperty("classCodeTitle")
    private String classCodeTitle;
    @JsonProperty("orgTitle")
    private String orgTitle;
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
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneExt")
    private String vendPhoneExt;
    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE
     * 
     */
    @JsonProperty("fobCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FOB_CODE")
    private String fobCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : FPBPOHD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_USER_ID")
    private String userId;
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
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneArea")
    private String vendPhoneArea;
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
     * Closed Date
     * <p>
     * Lineage reference object : FPBPOHD_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CLOSED_DATE")
    private Date closedDate;
    @JsonProperty("tgrpTitle")
    private String tgrpTitle;
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
     * Blanket Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBlanketCode")
    private String displayBlanketCode;
    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_PRINTED_DATE
     * 
     */
    @JsonProperty("poPrintedDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_PO_PRINTED_DATE")
    private Date poPrintedDate;
    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String atypCode;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendStateCode")
    private String vendStateCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public PurchaseBlanketOrderInquiry100GetResponse withCurrCode(String currCode) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withDisbAgentInd(String disbAgentInd) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Purchase Order Created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("rtextInd")
    public String getRtextInd() {
        return rtextInd;
    }

    /**
     * Purchase Order Created from Requisition
     * <p>
     * 
     * 
     */
    @JsonProperty("rtextInd")
    public void setRtextInd(String rtextInd) {
        this.rtextInd = rtextInd;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withRtextInd(String rtextInd) {
        this.rtextInd = rtextInd;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendZip")
    public String getVendZip() {
        return vendZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendZip")
    public void setVendZip(String vendZip) {
        this.vendZip = vendZip;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendZip(String vendZip) {
        this.vendZip = vendZip;
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

    public PurchaseBlanketOrderInquiry100GetResponse withPhoneNum(String phoneNum) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withPclsCode(String pclsCode) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : FPBPOHD_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    public String getDocRefCode() {
        return docRefCode;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : FPBPOHD_DOC_REF_CODE
     * 
     */
    @JsonProperty("docRefCode")
    public void setDocRefCode(String docRefCode) {
        this.docRefCode = docRefCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withDocRefCode(String docRefCode) {
        this.docRefCode = docRefCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneNum")
    public String getVendPhoneNum() {
        return vendPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneNum")
    public void setVendPhoneNum(String vendPhoneNum) {
        this.vendPhoneNum = vendPhoneNum;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendPhoneNum(String vendPhoneNum) {
        this.vendPhoneNum = vendPhoneNum;
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

    public PurchaseBlanketOrderInquiry100GetResponse withCopiedFrom(String copiedFrom) {
        this.copiedFrom = copiedFrom;
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

    public PurchaseBlanketOrderInquiry100GetResponse withHdrNote(String hdrNote) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withVendFaxArea(String vendFaxArea) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FPBPOHD_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FPBPOHD_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withApprInd(String apprInd) {
        this.apprInd = apprInd;
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

    public PurchaseBlanketOrderInquiry100GetResponse withDiscCode(String discCode) {
        this.discCode = discCode;
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipPhoneArea(String ftvshipPhoneArea) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withAttentionTo(String attentionTo) {
        this.attentionTo = attentionTo;
        return this;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FPBPOHD_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public String getCompleteInd() {
        return completeInd;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FPBPOHD_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public void setCompleteInd(String completeInd) {
        this.completeInd = completeInd;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withCompleteInd(String completeInd) {
        this.completeInd = completeInd;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBPOHD_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBPOHD_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withOriginCode(String originCode) {
        this.originCode = originCode;
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

    public PurchaseBlanketOrderInquiry100GetResponse withNsfOnOffInd(String nsfOnOffInd) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipState(String ftvshipState) {
        this.ftvshipState = ftvshipState;
        return this;
    }

    /**
     * Blanket Order Termination Date
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_TERM_DATE
     * 
     */
    @JsonProperty("blanketTermDate")
    public Date getBlanketTermDate() {
        return blanketTermDate;
    }

    /**
     * Blanket Order Termination Date
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_TERM_DATE
     * 
     */
    @JsonProperty("blanketTermDate")
    public void setBlanketTermDate(Date blanketTermDate) {
        this.blanketTermDate = blanketTermDate;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withBlanketTermDate(Date blanketTermDate) {
        this.blanketTermDate = blanketTermDate;
        return this;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxNum")
    public String getVendFaxNum() {
        return vendFaxNum;
    }

    /**
     * Phone
     * <p>
     * 
     * 
     */
    @JsonProperty("vendFaxNum")
    public void setVendFaxNum(String vendFaxNum) {
        this.vendFaxNum = vendFaxNum;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendFaxNum(String vendFaxNum) {
        this.vendFaxNum = vendFaxNum;
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

    public PurchaseBlanketOrderInquiry100GetResponse withVendName(String vendName) {
        this.vendName = vendName;
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

    public PurchaseBlanketOrderInquiry100GetResponse withDisplayBuyrName(String displayBuyrName) {
        this.displayBuyrName = displayBuyrName;
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

    public PurchaseBlanketOrderInquiry100GetResponse withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
        return this;
    }

    @JsonProperty("fobsDesc")
    public String getFobsDesc() {
        return fobsDesc;
    }

    @JsonProperty("fobsDesc")
    public void setFobsDesc(String fobsDesc) {
        this.fobsDesc = fobsDesc;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withFobsDesc(String fobsDesc) {
        this.fobsDesc = fobsDesc;
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

    public PurchaseBlanketOrderInquiry100GetResponse withFaxArea(String faxArea) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
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

    public PurchaseBlanketOrderInquiry100GetResponse withVendEmailAddr(String vendEmailAddr) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine3")
    public String getVendAddrLine3() {
        return vendAddrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine3")
    public void setVendAddrLine3(String vendAddrLine3) {
        this.vendAddrLine3 = vendAddrLine3;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendAddrLine3(String vendAddrLine3) {
        this.vendAddrLine3 = vendAddrLine3;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public Double getAtypSeqNum() {
        return atypSeqNum;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public void setAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine2")
    public String getVendAddrLine2() {
        return vendAddrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine2")
    public void setVendAddrLine2(String vendAddrLine2) {
        this.vendAddrLine2 = vendAddrLine2;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendAddrLine2(String vendAddrLine2) {
        this.vendAddrLine2 = vendAddrLine2;
        return this;
    }

    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withCarrierCode(String carrierCode) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipCity(String ftvshipCity) {
        this.ftvshipCity = ftvshipCity;
        return this;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
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
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withName(String name) {
        this.name = name;
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

    public PurchaseBlanketOrderInquiry100GetResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine1")
    public String getVendAddrLine1() {
        return vendAddrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("vendAddrLine1")
    public void setVendAddrLine1(String vendAddrLine1) {
        this.vendAddrLine1 = vendAddrLine1;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendAddrLine1(String vendAddrLine1) {
        this.vendAddrLine1 = vendAddrLine1;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendNatnDesc")
    public String getVendNatnDesc() {
        return vendNatnDesc;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("vendNatnDesc")
    public void setVendNatnDesc(String vendNatnDesc) {
        this.vendNatnDesc = vendNatnDesc;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendNatnDesc(String vendNatnDesc) {
        this.vendNatnDesc = vendNatnDesc;
        return this;
    }

    @JsonProperty("coasTitle")
    public String getCoasTitle() {
        return coasTitle;
    }

    @JsonProperty("coasTitle")
    public void setCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoCode")
    public String getDisplayPoCode() {
        return displayPoCode;
    }

    /**
     * Purchase Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoCode")
    public void setDisplayPoCode(String displayPoCode) {
        this.displayPoCode = displayPoCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withDisplayPoCode(String displayPoCode) {
        this.displayPoCode = displayPoCode;
        return this;
    }

    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBPOHD_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * Cancel Date
     * <p>
     * Lineage reference object : FPBPOHD_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
        return this;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public String getMatchDescription() {
        return matchDescription;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    public String getFtvshipZipCode() {
        return ftvshipZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipZipCode")
    public void setFtvshipZipCode(String ftvshipZipCode) {
        this.ftvshipZipCode = ftvshipZipCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipZipCode(String ftvshipZipCode) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withVendFaxExt(String vendFaxExt) {
        this.vendFaxExt = vendFaxExt;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendCity")
    public String getVendCity() {
        return vendCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("vendCity")
    public void setVendCity(String vendCity) {
        this.vendCity = vendCity;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendCity(String vendCity) {
        this.vendCity = vendCity;
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

    public PurchaseBlanketOrderInquiry100GetResponse withDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPBPOHD_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBPOHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FPBPOHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipBuilding(String ftvshipBuilding) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withRushInd(String rushInd) {
        this.rushInd = rushInd;
        return this;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvnatnNation")
    public String getStvnatnNation() {
        return stvnatnNation;
    }

    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvnatnNation")
    public void setStvnatnNation(String stvnatnNation) {
        this.stvnatnNation = stvnatnNation;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withStvnatnNation(String stvnatnNation) {
        this.stvnatnNation = stvnatnNation;
        return this;
    }

    /**
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public String getFaxExt() {
        return faxExt;
    }

    /**
     * Lineage reference object : FPBPOHD_FAX_EXT
     * 
     */
    @JsonProperty("faxExt")
    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withFaxExt(String faxExt) {
        this.faxExt = faxExt;
        return this;
    }

    @JsonProperty("ftvcrsnDesc")
    public String getFtvcrsnDesc() {
        return ftvcrsnDesc;
    }

    @JsonProperty("ftvcrsnDesc")
    public void setFtvcrsnDesc(String ftvcrsnDesc) {
        this.ftvcrsnDesc = ftvcrsnDesc;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withFtvcrsnDesc(String ftvcrsnDesc) {
        this.ftvcrsnDesc = ftvcrsnDesc;
        return this;
    }

    /**
     * Requisition Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("optionNote")
    public String getOptionNote() {
        return optionNote;
    }

    /**
     * Requisition Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("optionNote")
    public void setOptionNote(String optionNote) {
        this.optionNote = optionNote;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withOptionNote(String optionNote) {
        this.optionNote = optionNote;
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
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

    public PurchaseBlanketOrderInquiry100GetResponse withCurrDesc(String currDesc) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipPhoneNum(String ftvshipPhoneNum) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipAddrLine2(String ftvshipAddrLine2) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withPhoneExt(String phoneExt) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipAddrLine1(String ftvshipAddrLine1) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
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

    public PurchaseBlanketOrderInquiry100GetResponse withClassCodeTitle(String classCodeTitle) {
        this.classCodeTitle = classCodeTitle;
        return this;
    }

    @JsonProperty("orgTitle")
    public String getOrgTitle() {
        return orgTitle;
    }

    @JsonProperty("orgTitle")
    public void setOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
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

    public PurchaseBlanketOrderInquiry100GetResponse withVendorContact(String vendorContact) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneExt")
    public String getVendPhoneExt() {
        return vendPhoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneExt")
    public void setVendPhoneExt(String vendPhoneExt) {
        this.vendPhoneExt = vendPhoneExt;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendPhoneExt(String vendPhoneExt) {
        this.vendPhoneExt = vendPhoneExt;
        return this;
    }

    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE
     * 
     */
    @JsonProperty("fobCode")
    public String getFobCode() {
        return fobCode;
    }

    /**
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE
     * 
     */
    @JsonProperty("fobCode")
    public void setFobCode(String fobCode) {
        this.fobCode = fobCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withFobCode(String fobCode) {
        this.fobCode = fobCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FPBPOHD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FPBPOHD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withUserId(String userId) {
        this.userId = userId;
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

    public PurchaseBlanketOrderInquiry100GetResponse withShipCode(String shipCode) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withDiscDesc(String discDesc) {
        this.discDesc = discDesc;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneArea")
    public String getVendPhoneArea() {
        return vendPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("vendPhoneArea")
    public void setVendPhoneArea(String vendPhoneArea) {
        this.vendPhoneArea = vendPhoneArea;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendPhoneArea(String vendPhoneArea) {
        this.vendPhoneArea = vendPhoneArea;
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

    public PurchaseBlanketOrderInquiry100GetResponse withBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
        return this;
    }

    /**
     * Closed Date
     * <p>
     * Lineage reference object : FPBPOHD_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    public Date getClosedDate() {
        return closedDate;
    }

    /**
     * Closed Date
     * <p>
     * Lineage reference object : FPBPOHD_CLOSED_DATE
     * 
     */
    @JsonProperty("closedDate")
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withClosedDate(Date closedDate) {
        this.closedDate = closedDate;
        return this;
    }

    @JsonProperty("tgrpTitle")
    public String getTgrpTitle() {
        return tgrpTitle;
    }

    @JsonProperty("tgrpTitle")
    public void setTgrpTitle(String tgrpTitle) {
        this.tgrpTitle = tgrpTitle;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withTgrpTitle(String tgrpTitle) {
        this.tgrpTitle = tgrpTitle;
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

    public PurchaseBlanketOrderInquiry100GetResponse withEmailAddr(String emailAddr) {
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

    public PurchaseBlanketOrderInquiry100GetResponse withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    /**
     * Blanket Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBlanketCode")
    public String getDisplayBlanketCode() {
        return displayBlanketCode;
    }

    /**
     * Blanket Order
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBlanketCode")
    public void setDisplayBlanketCode(String displayBlanketCode) {
        this.displayBlanketCode = displayBlanketCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withDisplayBlanketCode(String displayBlanketCode) {
        this.displayBlanketCode = displayBlanketCode;
        return this;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_PRINTED_DATE
     * 
     */
    @JsonProperty("poPrintedDate")
    public Date getPoPrintedDate() {
        return poPrintedDate;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : FPBPOHD_PO_PRINTED_DATE
     * 
     */
    @JsonProperty("poPrintedDate")
    public void setPoPrintedDate(Date poPrintedDate) {
        this.poPrintedDate = poPrintedDate;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withPoPrintedDate(Date poPrintedDate) {
        this.poPrintedDate = poPrintedDate;
        return this;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FPBPOHD_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendStateCode")
    public String getVendStateCode() {
        return vendStateCode;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("vendStateCode")
    public void setVendStateCode(String vendStateCode) {
        this.vendStateCode = vendStateCode;
    }

    public PurchaseBlanketOrderInquiry100GetResponse withVendStateCode(String vendStateCode) {
        this.vendStateCode = vendStateCode;
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

    public PurchaseBlanketOrderInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseBlanketOrderInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("rtextInd");
        sb.append('=');
        sb.append(((this.rtextInd == null)?"<null>":this.rtextInd));
        sb.append(',');
        sb.append("vendZip");
        sb.append('=');
        sb.append(((this.vendZip == null)?"<null>":this.vendZip));
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
        sb.append("docRefCode");
        sb.append('=');
        sb.append(((this.docRefCode == null)?"<null>":this.docRefCode));
        sb.append(',');
        sb.append("vendPhoneNum");
        sb.append('=');
        sb.append(((this.vendPhoneNum == null)?"<null>":this.vendPhoneNum));
        sb.append(',');
        sb.append("copiedFrom");
        sb.append('=');
        sb.append(((this.copiedFrom == null)?"<null>":this.copiedFrom));
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
        sb.append("apprInd");
        sb.append('=');
        sb.append(((this.apprInd == null)?"<null>":this.apprInd));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("ftvshipPhoneArea");
        sb.append('=');
        sb.append(((this.ftvshipPhoneArea == null)?"<null>":this.ftvshipPhoneArea));
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
        sb.append("ftvshipState");
        sb.append('=');
        sb.append(((this.ftvshipState == null)?"<null>":this.ftvshipState));
        sb.append(',');
        sb.append("blanketTermDate");
        sb.append('=');
        sb.append(((this.blanketTermDate == null)?"<null>":this.blanketTermDate));
        sb.append(',');
        sb.append("vendFaxNum");
        sb.append('=');
        sb.append(((this.vendFaxNum == null)?"<null>":this.vendFaxNum));
        sb.append(',');
        sb.append("vendName");
        sb.append('=');
        sb.append(((this.vendName == null)?"<null>":this.vendName));
        sb.append(',');
        sb.append("displayBuyrName");
        sb.append('=');
        sb.append(((this.displayBuyrName == null)?"<null>":this.displayBuyrName));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("fobsDesc");
        sb.append('=');
        sb.append(((this.fobsDesc == null)?"<null>":this.fobsDesc));
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
        sb.append("ftvshipPhoneExt");
        sb.append('=');
        sb.append(((this.ftvshipPhoneExt == null)?"<null>":this.ftvshipPhoneExt));
        sb.append(',');
        sb.append("vendAddrLine3");
        sb.append('=');
        sb.append(((this.vendAddrLine3 == null)?"<null>":this.vendAddrLine3));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("vendAddrLine2");
        sb.append('=');
        sb.append(((this.vendAddrLine2 == null)?"<null>":this.vendAddrLine2));
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
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("vendAddrLine1");
        sb.append('=');
        sb.append(((this.vendAddrLine1 == null)?"<null>":this.vendAddrLine1));
        sb.append(',');
        sb.append("vendNatnDesc");
        sb.append('=');
        sb.append(((this.vendNatnDesc == null)?"<null>":this.vendNatnDesc));
        sb.append(',');
        sb.append("coasTitle");
        sb.append('=');
        sb.append(((this.coasTitle == null)?"<null>":this.coasTitle));
        sb.append(',');
        sb.append("displayPoCode");
        sb.append('=');
        sb.append(((this.displayPoCode == null)?"<null>":this.displayPoCode));
        sb.append(',');
        sb.append("cancelDate");
        sb.append('=');
        sb.append(((this.cancelDate == null)?"<null>":this.cancelDate));
        sb.append(',');
        sb.append("matchDescription");
        sb.append('=');
        sb.append(((this.matchDescription == null)?"<null>":this.matchDescription));
        sb.append(',');
        sb.append("ftvshipZipCode");
        sb.append('=');
        sb.append(((this.ftvshipZipCode == null)?"<null>":this.ftvshipZipCode));
        sb.append(',');
        sb.append("vendFaxExt");
        sb.append('=');
        sb.append(((this.vendFaxExt == null)?"<null>":this.vendFaxExt));
        sb.append(',');
        sb.append("vendCity");
        sb.append('=');
        sb.append(((this.vendCity == null)?"<null>":this.vendCity));
        sb.append(',');
        sb.append("deliveryComment");
        sb.append('=');
        sb.append(((this.deliveryComment == null)?"<null>":this.deliveryComment));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ftvshipBuilding");
        sb.append('=');
        sb.append(((this.ftvshipBuilding == null)?"<null>":this.ftvshipBuilding));
        sb.append(',');
        sb.append("rushInd");
        sb.append('=');
        sb.append(((this.rushInd == null)?"<null>":this.rushInd));
        sb.append(',');
        sb.append("stvnatnNation");
        sb.append('=');
        sb.append(((this.stvnatnNation == null)?"<null>":this.stvnatnNation));
        sb.append(',');
        sb.append("faxExt");
        sb.append('=');
        sb.append(((this.faxExt == null)?"<null>":this.faxExt));
        sb.append(',');
        sb.append("ftvcrsnDesc");
        sb.append('=');
        sb.append(((this.ftvcrsnDesc == null)?"<null>":this.ftvcrsnDesc));
        sb.append(',');
        sb.append("optionNote");
        sb.append('=');
        sb.append(((this.optionNote == null)?"<null>":this.optionNote));
        sb.append(',');
        sb.append("ftvshipFloor");
        sb.append('=');
        sb.append(((this.ftvshipFloor == null)?"<null>":this.ftvshipFloor));
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
        sb.append("classCodeTitle");
        sb.append('=');
        sb.append(((this.classCodeTitle == null)?"<null>":this.classCodeTitle));
        sb.append(',');
        sb.append("orgTitle");
        sb.append('=');
        sb.append(((this.orgTitle == null)?"<null>":this.orgTitle));
        sb.append(',');
        sb.append("vendorContact");
        sb.append('=');
        sb.append(((this.vendorContact == null)?"<null>":this.vendorContact));
        sb.append(',');
        sb.append("ftvshipContact");
        sb.append('=');
        sb.append(((this.ftvshipContact == null)?"<null>":this.ftvshipContact));
        sb.append(',');
        sb.append("vendPhoneExt");
        sb.append('=');
        sb.append(((this.vendPhoneExt == null)?"<null>":this.vendPhoneExt));
        sb.append(',');
        sb.append("fobCode");
        sb.append('=');
        sb.append(((this.fobCode == null)?"<null>":this.fobCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("discDesc");
        sb.append('=');
        sb.append(((this.discDesc == null)?"<null>":this.discDesc));
        sb.append(',');
        sb.append("vendPhoneArea");
        sb.append('=');
        sb.append(((this.vendPhoneArea == null)?"<null>":this.vendPhoneArea));
        sb.append(',');
        sb.append("buyrCode");
        sb.append('=');
        sb.append(((this.buyrCode == null)?"<null>":this.buyrCode));
        sb.append(',');
        sb.append("closedDate");
        sb.append('=');
        sb.append(((this.closedDate == null)?"<null>":this.closedDate));
        sb.append(',');
        sb.append("tgrpTitle");
        sb.append('=');
        sb.append(((this.tgrpTitle == null)?"<null>":this.tgrpTitle));
        sb.append(',');
        sb.append("emailAddr");
        sb.append('=');
        sb.append(((this.emailAddr == null)?"<null>":this.emailAddr));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("displayBlanketCode");
        sb.append('=');
        sb.append(((this.displayBlanketCode == null)?"<null>":this.displayBlanketCode));
        sb.append(',');
        sb.append("poPrintedDate");
        sb.append('=');
        sb.append(((this.poPrintedDate == null)?"<null>":this.poPrintedDate));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("vendStateCode");
        sb.append('=');
        sb.append(((this.vendStateCode == null)?"<null>":this.vendStateCode));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.disbAgentInd == null)? 0 :this.disbAgentInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.rtextInd == null)? 0 :this.rtextInd.hashCode()));
        result = ((result* 31)+((this.vendZip == null)? 0 :this.vendZip.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.docRefCode == null)? 0 :this.docRefCode.hashCode()));
        result = ((result* 31)+((this.vendPhoneNum == null)? 0 :this.vendPhoneNum.hashCode()));
        result = ((result* 31)+((this.copiedFrom == null)? 0 :this.copiedFrom.hashCode()));
        result = ((result* 31)+((this.hdrNote == null)? 0 :this.hdrNote.hashCode()));
        result = ((result* 31)+((this.vendFaxArea == null)? 0 :this.vendFaxArea.hashCode()));
        result = ((result* 31)+((this.carrierName == null)? 0 :this.carrierName.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneArea == null)? 0 :this.ftvshipPhoneArea.hashCode()));
        result = ((result* 31)+((this.attentionTo == null)? 0 :this.attentionTo.hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.originCode == null)? 0 :this.originCode.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.ftvshipState == null)? 0 :this.ftvshipState.hashCode()));
        result = ((result* 31)+((this.blanketTermDate == null)? 0 :this.blanketTermDate.hashCode()));
        result = ((result* 31)+((this.vendFaxNum == null)? 0 :this.vendFaxNum.hashCode()));
        result = ((result* 31)+((this.vendName == null)? 0 :this.vendName.hashCode()));
        result = ((result* 31)+((this.displayBuyrName == null)? 0 :this.displayBuyrName.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.fobsDesc == null)? 0 :this.fobsDesc.hashCode()));
        result = ((result* 31)+((this.faxArea == null)? 0 :this.faxArea.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.vendEmailAddr == null)? 0 :this.vendEmailAddr.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneExt == null)? 0 :this.ftvshipPhoneExt.hashCode()));
        result = ((result* 31)+((this.vendAddrLine3 == null)? 0 :this.vendAddrLine3 .hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.vendAddrLine2 == null)? 0 :this.vendAddrLine2 .hashCode()));
        result = ((result* 31)+((this.carrierCode == null)? 0 :this.carrierCode.hashCode()));
        result = ((result* 31)+((this.ftvshipCity == null)? 0 :this.ftvshipCity.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.vendAddrLine1 == null)? 0 :this.vendAddrLine1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vendNatnDesc == null)? 0 :this.vendNatnDesc.hashCode()));
        result = ((result* 31)+((this.coasTitle == null)? 0 :this.coasTitle.hashCode()));
        result = ((result* 31)+((this.displayPoCode == null)? 0 :this.displayPoCode.hashCode()));
        result = ((result* 31)+((this.cancelDate == null)? 0 :this.cancelDate.hashCode()));
        result = ((result* 31)+((this.matchDescription == null)? 0 :this.matchDescription.hashCode()));
        result = ((result* 31)+((this.ftvshipZipCode == null)? 0 :this.ftvshipZipCode.hashCode()));
        result = ((result* 31)+((this.vendFaxExt == null)? 0 :this.vendFaxExt.hashCode()));
        result = ((result* 31)+((this.vendCity == null)? 0 :this.vendCity.hashCode()));
        result = ((result* 31)+((this.deliveryComment == null)? 0 :this.deliveryComment.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ftvshipBuilding == null)? 0 :this.ftvshipBuilding.hashCode()));
        result = ((result* 31)+((this.rushInd == null)? 0 :this.rushInd.hashCode()));
        result = ((result* 31)+((this.stvnatnNation == null)? 0 :this.stvnatnNation.hashCode()));
        result = ((result* 31)+((this.faxExt == null)? 0 :this.faxExt.hashCode()));
        result = ((result* 31)+((this.ftvcrsnDesc == null)? 0 :this.ftvcrsnDesc.hashCode()));
        result = ((result* 31)+((this.optionNote == null)? 0 :this.optionNote.hashCode()));
        result = ((result* 31)+((this.ftvshipFloor == null)? 0 :this.ftvshipFloor.hashCode()));
        result = ((result* 31)+((this.currDesc == null)? 0 :this.currDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneNum == null)? 0 :this.ftvshipPhoneNum.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine2 == null)? 0 :this.ftvshipAddrLine2 .hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine1 == null)? 0 :this.ftvshipAddrLine1 .hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine3 == null)? 0 :this.ftvshipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.classCodeTitle == null)? 0 :this.classCodeTitle.hashCode()));
        result = ((result* 31)+((this.orgTitle == null)? 0 :this.orgTitle.hashCode()));
        result = ((result* 31)+((this.vendorContact == null)? 0 :this.vendorContact.hashCode()));
        result = ((result* 31)+((this.ftvshipContact == null)? 0 :this.ftvshipContact.hashCode()));
        result = ((result* 31)+((this.vendPhoneExt == null)? 0 :this.vendPhoneExt.hashCode()));
        result = ((result* 31)+((this.fobCode == null)? 0 :this.fobCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.discDesc == null)? 0 :this.discDesc.hashCode()));
        result = ((result* 31)+((this.vendPhoneArea == null)? 0 :this.vendPhoneArea.hashCode()));
        result = ((result* 31)+((this.buyrCode == null)? 0 :this.buyrCode.hashCode()));
        result = ((result* 31)+((this.closedDate == null)? 0 :this.closedDate.hashCode()));
        result = ((result* 31)+((this.tgrpTitle == null)? 0 :this.tgrpTitle.hashCode()));
        result = ((result* 31)+((this.emailAddr == null)? 0 :this.emailAddr.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.displayBlanketCode == null)? 0 :this.displayBlanketCode.hashCode()));
        result = ((result* 31)+((this.poPrintedDate == null)? 0 :this.poPrintedDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.vendStateCode == null)? 0 :this.vendStateCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseBlanketOrderInquiry100GetResponse) == false) {
            return false;
        }
        PurchaseBlanketOrderInquiry100GetResponse rhs = ((PurchaseBlanketOrderInquiry100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.disbAgentInd == rhs.disbAgentInd)||((this.disbAgentInd!= null)&&this.disbAgentInd.equals(rhs.disbAgentInd))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.rtextInd == rhs.rtextInd)||((this.rtextInd!= null)&&this.rtextInd.equals(rhs.rtextInd))))&&((this.vendZip == rhs.vendZip)||((this.vendZip!= null)&&this.vendZip.equals(rhs.vendZip))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.docRefCode == rhs.docRefCode)||((this.docRefCode!= null)&&this.docRefCode.equals(rhs.docRefCode))))&&((this.vendPhoneNum == rhs.vendPhoneNum)||((this.vendPhoneNum!= null)&&this.vendPhoneNum.equals(rhs.vendPhoneNum))))&&((this.copiedFrom == rhs.copiedFrom)||((this.copiedFrom!= null)&&this.copiedFrom.equals(rhs.copiedFrom))))&&((this.hdrNote == rhs.hdrNote)||((this.hdrNote!= null)&&this.hdrNote.equals(rhs.hdrNote))))&&((this.vendFaxArea == rhs.vendFaxArea)||((this.vendFaxArea!= null)&&this.vendFaxArea.equals(rhs.vendFaxArea))))&&((this.carrierName == rhs.carrierName)||((this.carrierName!= null)&&this.carrierName.equals(rhs.carrierName))))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.ftvshipPhoneArea == rhs.ftvshipPhoneArea)||((this.ftvshipPhoneArea!= null)&&this.ftvshipPhoneArea.equals(rhs.ftvshipPhoneArea))))&&((this.attentionTo == rhs.attentionTo)||((this.attentionTo!= null)&&this.attentionTo.equals(rhs.attentionTo))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.originCode == rhs.originCode)||((this.originCode!= null)&&this.originCode.equals(rhs.originCode))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.ftvshipState == rhs.ftvshipState)||((this.ftvshipState!= null)&&this.ftvshipState.equals(rhs.ftvshipState))))&&((this.blanketTermDate == rhs.blanketTermDate)||((this.blanketTermDate!= null)&&this.blanketTermDate.equals(rhs.blanketTermDate))))&&((this.vendFaxNum == rhs.vendFaxNum)||((this.vendFaxNum!= null)&&this.vendFaxNum.equals(rhs.vendFaxNum))))&&((this.vendName == rhs.vendName)||((this.vendName!= null)&&this.vendName.equals(rhs.vendName))))&&((this.displayBuyrName == rhs.displayBuyrName)||((this.displayBuyrName!= null)&&this.displayBuyrName.equals(rhs.displayBuyrName))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.fobsDesc == rhs.fobsDesc)||((this.fobsDesc!= null)&&this.fobsDesc.equals(rhs.fobsDesc))))&&((this.faxArea == rhs.faxArea)||((this.faxArea!= null)&&this.faxArea.equals(rhs.faxArea))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.vendEmailAddr == rhs.vendEmailAddr)||((this.vendEmailAddr!= null)&&this.vendEmailAddr.equals(rhs.vendEmailAddr))))&&((this.ftvshipPhoneExt == rhs.ftvshipPhoneExt)||((this.ftvshipPhoneExt!= null)&&this.ftvshipPhoneExt.equals(rhs.ftvshipPhoneExt))))&&((this.vendAddrLine3 == rhs.vendAddrLine3)||((this.vendAddrLine3 != null)&&this.vendAddrLine3 .equals(rhs.vendAddrLine3))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.vendAddrLine2 == rhs.vendAddrLine2)||((this.vendAddrLine2 != null)&&this.vendAddrLine2 .equals(rhs.vendAddrLine2))))&&((this.carrierCode == rhs.carrierCode)||((this.carrierCode!= null)&&this.carrierCode.equals(rhs.carrierCode))))&&((this.ftvshipCity == rhs.ftvshipCity)||((this.ftvshipCity!= null)&&this.ftvshipCity.equals(rhs.ftvshipCity))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.vendAddrLine1 == rhs.vendAddrLine1)||((this.vendAddrLine1 != null)&&this.vendAddrLine1 .equals(rhs.vendAddrLine1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vendNatnDesc == rhs.vendNatnDesc)||((this.vendNatnDesc!= null)&&this.vendNatnDesc.equals(rhs.vendNatnDesc))))&&((this.coasTitle == rhs.coasTitle)||((this.coasTitle!= null)&&this.coasTitle.equals(rhs.coasTitle))))&&((this.displayPoCode == rhs.displayPoCode)||((this.displayPoCode!= null)&&this.displayPoCode.equals(rhs.displayPoCode))))&&((this.cancelDate == rhs.cancelDate)||((this.cancelDate!= null)&&this.cancelDate.equals(rhs.cancelDate))))&&((this.matchDescription == rhs.matchDescription)||((this.matchDescription!= null)&&this.matchDescription.equals(rhs.matchDescription))))&&((this.ftvshipZipCode == rhs.ftvshipZipCode)||((this.ftvshipZipCode!= null)&&this.ftvshipZipCode.equals(rhs.ftvshipZipCode))))&&((this.vendFaxExt == rhs.vendFaxExt)||((this.vendFaxExt!= null)&&this.vendFaxExt.equals(rhs.vendFaxExt))))&&((this.vendCity == rhs.vendCity)||((this.vendCity!= null)&&this.vendCity.equals(rhs.vendCity))))&&((this.deliveryComment == rhs.deliveryComment)||((this.deliveryComment!= null)&&this.deliveryComment.equals(rhs.deliveryComment))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ftvshipBuilding == rhs.ftvshipBuilding)||((this.ftvshipBuilding!= null)&&this.ftvshipBuilding.equals(rhs.ftvshipBuilding))))&&((this.rushInd == rhs.rushInd)||((this.rushInd!= null)&&this.rushInd.equals(rhs.rushInd))))&&((this.stvnatnNation == rhs.stvnatnNation)||((this.stvnatnNation!= null)&&this.stvnatnNation.equals(rhs.stvnatnNation))))&&((this.faxExt == rhs.faxExt)||((this.faxExt!= null)&&this.faxExt.equals(rhs.faxExt))))&&((this.ftvcrsnDesc == rhs.ftvcrsnDesc)||((this.ftvcrsnDesc!= null)&&this.ftvcrsnDesc.equals(rhs.ftvcrsnDesc))))&&((this.optionNote == rhs.optionNote)||((this.optionNote!= null)&&this.optionNote.equals(rhs.optionNote))))&&((this.ftvshipFloor == rhs.ftvshipFloor)||((this.ftvshipFloor!= null)&&this.ftvshipFloor.equals(rhs.ftvshipFloor))))&&((this.currDesc == rhs.currDesc)||((this.currDesc!= null)&&this.currDesc.equals(rhs.currDesc))))&&((this.ftvshipPhoneNum == rhs.ftvshipPhoneNum)||((this.ftvshipPhoneNum!= null)&&this.ftvshipPhoneNum.equals(rhs.ftvshipPhoneNum))))&&((this.ftvshipAddrLine2 == rhs.ftvshipAddrLine2)||((this.ftvshipAddrLine2 != null)&&this.ftvshipAddrLine2 .equals(rhs.ftvshipAddrLine2))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.ftvshipAddrLine1 == rhs.ftvshipAddrLine1)||((this.ftvshipAddrLine1 != null)&&this.ftvshipAddrLine1 .equals(rhs.ftvshipAddrLine1))))&&((this.ftvshipAddrLine3 == rhs.ftvshipAddrLine3)||((this.ftvshipAddrLine3 != null)&&this.ftvshipAddrLine3 .equals(rhs.ftvshipAddrLine3))))&&((this.classCodeTitle == rhs.classCodeTitle)||((this.classCodeTitle!= null)&&this.classCodeTitle.equals(rhs.classCodeTitle))))&&((this.orgTitle == rhs.orgTitle)||((this.orgTitle!= null)&&this.orgTitle.equals(rhs.orgTitle))))&&((this.vendorContact == rhs.vendorContact)||((this.vendorContact!= null)&&this.vendorContact.equals(rhs.vendorContact))))&&((this.ftvshipContact == rhs.ftvshipContact)||((this.ftvshipContact!= null)&&this.ftvshipContact.equals(rhs.ftvshipContact))))&&((this.vendPhoneExt == rhs.vendPhoneExt)||((this.vendPhoneExt!= null)&&this.vendPhoneExt.equals(rhs.vendPhoneExt))))&&((this.fobCode == rhs.fobCode)||((this.fobCode!= null)&&this.fobCode.equals(rhs.fobCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.discDesc == rhs.discDesc)||((this.discDesc!= null)&&this.discDesc.equals(rhs.discDesc))))&&((this.vendPhoneArea == rhs.vendPhoneArea)||((this.vendPhoneArea!= null)&&this.vendPhoneArea.equals(rhs.vendPhoneArea))))&&((this.buyrCode == rhs.buyrCode)||((this.buyrCode!= null)&&this.buyrCode.equals(rhs.buyrCode))))&&((this.closedDate == rhs.closedDate)||((this.closedDate!= null)&&this.closedDate.equals(rhs.closedDate))))&&((this.tgrpTitle == rhs.tgrpTitle)||((this.tgrpTitle!= null)&&this.tgrpTitle.equals(rhs.tgrpTitle))))&&((this.emailAddr == rhs.emailAddr)||((this.emailAddr!= null)&&this.emailAddr.equals(rhs.emailAddr))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.displayBlanketCode == rhs.displayBlanketCode)||((this.displayBlanketCode!= null)&&this.displayBlanketCode.equals(rhs.displayBlanketCode))))&&((this.poPrintedDate == rhs.poPrintedDate)||((this.poPrintedDate!= null)&&this.poPrintedDate.equals(rhs.poPrintedDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.vendStateCode == rhs.vendStateCode)||((this.vendStateCode!= null)&&this.vendStateCode.equals(rhs.vendStateCode))));
    }

}
