
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
    "ctryCodeFax",
    "reqdDate",
    "deliveryComment",
    "phoneNum",
    "pclsCode",
    "fobCode",
    "orgnCode",
    "ctryCodePhone",
    "displayVendCode",
    "shipCode",
    "vendEmailAddr",
    "carrierName",
    "atypSeqNum",
    "poDate",
    "fpbpohdName",
    "name",
    "faxNumber",
    "nsfOnOffInd",
    "displayPohdCode",
    "blanketCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderInformation100PutRequest {

    /**
     * Fax Country Code.
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CTRY_CODE_FAX")
    private String ctryCodeFax;
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
     * Comments
     * <p>
     * Lineage reference object : FPBPOHD_DELIVERY_COMMENT
     * 
     */
    @JsonProperty("deliveryComment")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_DELIVERY_COMMENT")
    private String deliveryComment;
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
     * FOB Code
     * <p>
     * Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs
     * 
     */
    @JsonProperty("fobCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FOB_CODE, Lookup lineage reference object : ftvfobs")
    private String fobCode;
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
     * Country Code
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    private String displayVendCode;
    /**
     * Ship To
     * <p>
     * Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_SHIP_CODE, Lookup lineage reference object : ftvship")
    private String shipCode;
    /**
     * Email
     * <p>
     * Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR
     * 
     */
    @JsonProperty("vendEmailAddr")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_VEND_EMAIL_ADDR")
    private String vendEmailAddr;
    @JsonProperty("carrierName")
    private String carrierName;
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
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdName")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_NAME")
    private String fpbpohdName;
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
     * Phone
     * <p>
     * Lineage reference object : FPBPOHD_FAX_NUMBER
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_FAX_NUMBER")
    private String faxNumber;
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
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    @JsonPropertyDescription("Lineage reference object : displayPohdCode")
    private Object displayPohdCode;
    /**
     * Blanket Order
     * <p>
     * Lineage reference object : FPBPOHD_BLANKET_CODE
     * 
     */
    @JsonProperty("blanketCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BLANKET_CODE")
    private String blanketCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fax Country Code.
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    public String getCtryCodeFax() {
        return ctryCodeFax;
    }

    /**
     * Fax Country Code.
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    public void setCtryCodeFax(String ctryCodeFax) {
        this.ctryCodeFax = ctryCodeFax;
    }

    public PurchaseOrderInformation100PutRequest withCtryCodeFax(String ctryCodeFax) {
        this.ctryCodeFax = ctryCodeFax;
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

    public PurchaseOrderInformation100PutRequest withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
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

    public PurchaseOrderInformation100PutRequest withDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
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

    public PurchaseOrderInformation100PutRequest withPhoneNum(String phoneNum) {
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

    public PurchaseOrderInformation100PutRequest withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
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

    public PurchaseOrderInformation100PutRequest withFobCode(String fobCode) {
        this.fobCode = fobCode;
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

    public PurchaseOrderInformation100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FPBPOHD_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public PurchaseOrderInformation100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public PurchaseOrderInformation100PutRequest withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
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

    public PurchaseOrderInformation100PutRequest withShipCode(String shipCode) {
        this.shipCode = shipCode;
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

    public PurchaseOrderInformation100PutRequest withVendEmailAddr(String vendEmailAddr) {
        this.vendEmailAddr = vendEmailAddr;
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

    public PurchaseOrderInformation100PutRequest withCarrierName(String carrierName) {
        this.carrierName = carrierName;
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

    public PurchaseOrderInformation100PutRequest withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
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

    public PurchaseOrderInformation100PutRequest withPoDate(Date poDate) {
        this.poDate = poDate;
        return this;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdName")
    public String getFpbpohdName() {
        return fpbpohdName;
    }

    /**
     * Requestor
     * <p>
     * Lineage reference object : FPBPOHD_NAME
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdName")
    public void setFpbpohdName(String fpbpohdName) {
        this.fpbpohdName = fpbpohdName;
    }

    public PurchaseOrderInformation100PutRequest withFpbpohdName(String fpbpohdName) {
        this.fpbpohdName = fpbpohdName;
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

    public PurchaseOrderInformation100PutRequest withName(String name) {
        this.name = name;
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

    public PurchaseOrderInformation100PutRequest withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
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

    public PurchaseOrderInformation100PutRequest withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public Object getDisplayPohdCode() {
        return displayPohdCode;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public void setDisplayPohdCode(Object displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
    }

    public PurchaseOrderInformation100PutRequest withDisplayPohdCode(Object displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
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

    public PurchaseOrderInformation100PutRequest withBlanketCode(String blanketCode) {
        this.blanketCode = blanketCode;
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

    public PurchaseOrderInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ctryCodeFax");
        sb.append('=');
        sb.append(((this.ctryCodeFax == null)?"<null>":this.ctryCodeFax));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("deliveryComment");
        sb.append('=');
        sb.append(((this.deliveryComment == null)?"<null>":this.deliveryComment));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("fobCode");
        sb.append('=');
        sb.append(((this.fobCode == null)?"<null>":this.fobCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("vendEmailAddr");
        sb.append('=');
        sb.append(((this.vendEmailAddr == null)?"<null>":this.vendEmailAddr));
        sb.append(',');
        sb.append("carrierName");
        sb.append('=');
        sb.append(((this.carrierName == null)?"<null>":this.carrierName));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("poDate");
        sb.append('=');
        sb.append(((this.poDate == null)?"<null>":this.poDate));
        sb.append(',');
        sb.append("fpbpohdName");
        sb.append('=');
        sb.append(((this.fpbpohdName == null)?"<null>":this.fpbpohdName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("displayPohdCode");
        sb.append('=');
        sb.append(((this.displayPohdCode == null)?"<null>":this.displayPohdCode));
        sb.append(',');
        sb.append("blanketCode");
        sb.append('=');
        sb.append(((this.blanketCode == null)?"<null>":this.blanketCode));
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
        result = ((result* 31)+((this.ctryCodeFax == null)? 0 :this.ctryCodeFax.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.deliveryComment == null)? 0 :this.deliveryComment.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.fobCode == null)? 0 :this.fobCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.vendEmailAddr == null)? 0 :this.vendEmailAddr.hashCode()));
        result = ((result* 31)+((this.carrierName == null)? 0 :this.carrierName.hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.poDate == null)? 0 :this.poDate.hashCode()));
        result = ((result* 31)+((this.fpbpohdName == null)? 0 :this.fpbpohdName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.displayPohdCode == null)? 0 :this.displayPohdCode.hashCode()));
        result = ((result* 31)+((this.blanketCode == null)? 0 :this.blanketCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderInformation100PutRequest) == false) {
            return false;
        }
        PurchaseOrderInformation100PutRequest rhs = ((PurchaseOrderInformation100PutRequest) other);
        return ((((((((((((((((((((((this.ctryCodeFax == rhs.ctryCodeFax)||((this.ctryCodeFax!= null)&&this.ctryCodeFax.equals(rhs.ctryCodeFax)))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.deliveryComment == rhs.deliveryComment)||((this.deliveryComment!= null)&&this.deliveryComment.equals(rhs.deliveryComment))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.fobCode == rhs.fobCode)||((this.fobCode!= null)&&this.fobCode.equals(rhs.fobCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.vendEmailAddr == rhs.vendEmailAddr)||((this.vendEmailAddr!= null)&&this.vendEmailAddr.equals(rhs.vendEmailAddr))))&&((this.carrierName == rhs.carrierName)||((this.carrierName!= null)&&this.carrierName.equals(rhs.carrierName))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.poDate == rhs.poDate)||((this.poDate!= null)&&this.poDate.equals(rhs.poDate))))&&((this.fpbpohdName == rhs.fpbpohdName)||((this.fpbpohdName!= null)&&this.fpbpohdName.equals(rhs.fpbpohdName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode))))&&((this.blanketCode == rhs.blanketCode)||((this.blanketCode!= null)&&this.blanketCode.equals(rhs.blanketCode))));
    }

}
