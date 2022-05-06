
package com.ellucian.generated.bpapi.ban.change_order.v1_0_0;

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
    "displayAcctgTotal",
    "reqdDate",
    "hdrPage1Ind",
    "displayPoTypeInd",
    "ctryCodePhone",
    "displayCommTotal",
    "rushInd",
    "poDate",
    "transDate",
    "hdrDisplayChangeSeqNum",
    "ftvshipPhoneArea",
    "displayChangeSeqNum",
    "changeAcctgOnly",
    "nsfOnOffInd",
    "displayPohdCode",
    "ftvshipPhoneNum",
    "orgnDesc",
    "ftvshipAddrLine4",
    "ctryCodeFax",
    "ftvshipAddrLine3",
    "ftvshipNatnCodeDesc",
    "ftvshipHouseNumber",
    "coasDesc",
    "ftvshipCtryCodePhone",
    "editDeferInd",
    "buyrCode",
    "ftvshipPhoneExt"
})
@Generated("jsonschema2pojo")
public class ChangeOrder100PutRequest {

    /**
     * Accounting Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctgTotal")
    private Double displayAcctgTotal;
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
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrPage1Ind")
    private String hdrPage1Ind;
    /**
     * Purchase Order Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTypeInd")
    private String displayPoTypeInd;
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
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommTotal")
    private Double displayCommTotal;
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
     * Change Seq
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrDisplayChangeSeqNum")
    private String hdrDisplayChangeSeqNum;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    private String ftvshipPhoneArea;
    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    @JsonPropertyDescription("Lineage reference object : displayChangeSeqNum")
    private Object displayChangeSeqNum;
    /**
     * Change Accounting Only
     * <p>
     * 
     * 
     */
    @JsonProperty("changeAcctgOnly")
    private String changeAcctgOnly;
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
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    private String ftvshipPhoneNum;
    @JsonProperty("orgnDesc")
    private String orgnDesc;
    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine4")
    private String ftvshipAddrLine4;
    /**
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_CTRY_CODE_FAX")
    private String ctryCodeFax;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    private String ftvshipAddrLine3;
    /**
     * Nation
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipNatnCodeDesc")
    private String ftvshipNatnCodeDesc;
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipHouseNumber")
    private String ftvshipHouseNumber;
    @JsonProperty("coasDesc")
    private String coasDesc;
    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCtryCodePhone")
    private String ftvshipCtryCodePhone;
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
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * (Required)
     * 
     */
    @JsonProperty("buyrCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr")
    private String buyrCode;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    private String ftvshipPhoneExt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ChangeOrder100PutRequest withDisplayAcctgTotal(Double displayAcctgTotal) {
        this.displayAcctgTotal = displayAcctgTotal;
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

    public ChangeOrder100PutRequest withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrPage1Ind")
    public String getHdrPage1Ind() {
        return hdrPage1Ind;
    }

    /**
     * Document Text
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrPage1Ind")
    public void setHdrPage1Ind(String hdrPage1Ind) {
        this.hdrPage1Ind = hdrPage1Ind;
    }

    public ChangeOrder100PutRequest withHdrPage1Ind(String hdrPage1Ind) {
        this.hdrPage1Ind = hdrPage1Ind;
        return this;
    }

    /**
     * Purchase Order Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTypeInd")
    public String getDisplayPoTypeInd() {
        return displayPoTypeInd;
    }

    /**
     * Purchase Order Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoTypeInd")
    public void setDisplayPoTypeInd(String displayPoTypeInd) {
        this.displayPoTypeInd = displayPoTypeInd;
    }

    public ChangeOrder100PutRequest withDisplayPoTypeInd(String displayPoTypeInd) {
        this.displayPoTypeInd = displayPoTypeInd;
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

    public ChangeOrder100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommTotal")
    public Double getDisplayCommTotal() {
        return displayCommTotal;
    }

    /**
     * Commodity Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommTotal")
    public void setDisplayCommTotal(Double displayCommTotal) {
        this.displayCommTotal = displayCommTotal;
    }

    public ChangeOrder100PutRequest withDisplayCommTotal(Double displayCommTotal) {
        this.displayCommTotal = displayCommTotal;
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

    public ChangeOrder100PutRequest withRushInd(String rushInd) {
        this.rushInd = rushInd;
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

    public ChangeOrder100PutRequest withPoDate(Date poDate) {
        this.poDate = poDate;
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

    public ChangeOrder100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Change Seq
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrDisplayChangeSeqNum")
    public String getHdrDisplayChangeSeqNum() {
        return hdrDisplayChangeSeqNum;
    }

    /**
     * Change Seq
     * <p>
     * 
     * 
     */
    @JsonProperty("hdrDisplayChangeSeqNum")
    public void setHdrDisplayChangeSeqNum(String hdrDisplayChangeSeqNum) {
        this.hdrDisplayChangeSeqNum = hdrDisplayChangeSeqNum;
    }

    public ChangeOrder100PutRequest withHdrDisplayChangeSeqNum(String hdrDisplayChangeSeqNum) {
        this.hdrDisplayChangeSeqNum = hdrDisplayChangeSeqNum;
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

    public ChangeOrder100PutRequest withFtvshipPhoneArea(String ftvshipPhoneArea) {
        this.ftvshipPhoneArea = ftvshipPhoneArea;
        return this;
    }

    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    public Object getDisplayChangeSeqNum() {
        return displayChangeSeqNum;
    }

    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    public void setDisplayChangeSeqNum(Object displayChangeSeqNum) {
        this.displayChangeSeqNum = displayChangeSeqNum;
    }

    public ChangeOrder100PutRequest withDisplayChangeSeqNum(Object displayChangeSeqNum) {
        this.displayChangeSeqNum = displayChangeSeqNum;
        return this;
    }

    /**
     * Change Accounting Only
     * <p>
     * 
     * 
     */
    @JsonProperty("changeAcctgOnly")
    public String getChangeAcctgOnly() {
        return changeAcctgOnly;
    }

    /**
     * Change Accounting Only
     * <p>
     * 
     * 
     */
    @JsonProperty("changeAcctgOnly")
    public void setChangeAcctgOnly(String changeAcctgOnly) {
        this.changeAcctgOnly = changeAcctgOnly;
    }

    public ChangeOrder100PutRequest withChangeAcctgOnly(String changeAcctgOnly) {
        this.changeAcctgOnly = changeAcctgOnly;
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

    public ChangeOrder100PutRequest withNsfOnOffInd(String nsfOnOffInd) {
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

    public ChangeOrder100PutRequest withDisplayPohdCode(Object displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
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

    public ChangeOrder100PutRequest withFtvshipPhoneNum(String ftvshipPhoneNum) {
        this.ftvshipPhoneNum = ftvshipPhoneNum;
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

    public ChangeOrder100PutRequest withOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine4")
    public String getFtvshipAddrLine4() {
        return ftvshipAddrLine4;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine4")
    public void setFtvshipAddrLine4(String ftvshipAddrLine4) {
        this.ftvshipAddrLine4 = ftvshipAddrLine4;
    }

    public ChangeOrder100PutRequest withFtvshipAddrLine4(String ftvshipAddrLine4) {
        this.ftvshipAddrLine4 = ftvshipAddrLine4;
        return this;
    }

    /**
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    public String getCtryCodeFax() {
        return ctryCodeFax;
    }

    /**
     * Lineage reference object : FPBPOHD_CTRY_CODE_FAX
     * 
     */
    @JsonProperty("ctryCodeFax")
    public void setCtryCodeFax(String ctryCodeFax) {
        this.ctryCodeFax = ctryCodeFax;
    }

    public ChangeOrder100PutRequest withCtryCodeFax(String ctryCodeFax) {
        this.ctryCodeFax = ctryCodeFax;
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

    public ChangeOrder100PutRequest withFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
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

    public ChangeOrder100PutRequest withFtvshipNatnCodeDesc(String ftvshipNatnCodeDesc) {
        this.ftvshipNatnCodeDesc = ftvshipNatnCodeDesc;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipHouseNumber")
    public String getFtvshipHouseNumber() {
        return ftvshipHouseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipHouseNumber")
    public void setFtvshipHouseNumber(String ftvshipHouseNumber) {
        this.ftvshipHouseNumber = ftvshipHouseNumber;
    }

    public ChangeOrder100PutRequest withFtvshipHouseNumber(String ftvshipHouseNumber) {
        this.ftvshipHouseNumber = ftvshipHouseNumber;
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

    public ChangeOrder100PutRequest withCoasDesc(String coasDesc) {
        this.coasDesc = coasDesc;
        return this;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCtryCodePhone")
    public String getFtvshipCtryCodePhone() {
        return ftvshipCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipCtryCodePhone")
    public void setFtvshipCtryCodePhone(String ftvshipCtryCodePhone) {
        this.ftvshipCtryCodePhone = ftvshipCtryCodePhone;
    }

    public ChangeOrder100PutRequest withFtvshipCtryCodePhone(String ftvshipCtryCodePhone) {
        this.ftvshipCtryCodePhone = ftvshipCtryCodePhone;
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

    public ChangeOrder100PutRequest withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("buyrCode")
    public void setBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
    }

    public ChangeOrder100PutRequest withBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
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

    public ChangeOrder100PutRequest withFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
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

    public ChangeOrder100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeOrder100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayAcctgTotal");
        sb.append('=');
        sb.append(((this.displayAcctgTotal == null)?"<null>":this.displayAcctgTotal));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("hdrPage1Ind");
        sb.append('=');
        sb.append(((this.hdrPage1Ind == null)?"<null>":this.hdrPage1Ind));
        sb.append(',');
        sb.append("displayPoTypeInd");
        sb.append('=');
        sb.append(((this.displayPoTypeInd == null)?"<null>":this.displayPoTypeInd));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("displayCommTotal");
        sb.append('=');
        sb.append(((this.displayCommTotal == null)?"<null>":this.displayCommTotal));
        sb.append(',');
        sb.append("rushInd");
        sb.append('=');
        sb.append(((this.rushInd == null)?"<null>":this.rushInd));
        sb.append(',');
        sb.append("poDate");
        sb.append('=');
        sb.append(((this.poDate == null)?"<null>":this.poDate));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("hdrDisplayChangeSeqNum");
        sb.append('=');
        sb.append(((this.hdrDisplayChangeSeqNum == null)?"<null>":this.hdrDisplayChangeSeqNum));
        sb.append(',');
        sb.append("ftvshipPhoneArea");
        sb.append('=');
        sb.append(((this.ftvshipPhoneArea == null)?"<null>":this.ftvshipPhoneArea));
        sb.append(',');
        sb.append("displayChangeSeqNum");
        sb.append('=');
        sb.append(((this.displayChangeSeqNum == null)?"<null>":this.displayChangeSeqNum));
        sb.append(',');
        sb.append("changeAcctgOnly");
        sb.append('=');
        sb.append(((this.changeAcctgOnly == null)?"<null>":this.changeAcctgOnly));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("displayPohdCode");
        sb.append('=');
        sb.append(((this.displayPohdCode == null)?"<null>":this.displayPohdCode));
        sb.append(',');
        sb.append("ftvshipPhoneNum");
        sb.append('=');
        sb.append(((this.ftvshipPhoneNum == null)?"<null>":this.ftvshipPhoneNum));
        sb.append(',');
        sb.append("orgnDesc");
        sb.append('=');
        sb.append(((this.orgnDesc == null)?"<null>":this.orgnDesc));
        sb.append(',');
        sb.append("ftvshipAddrLine4");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine4 == null)?"<null>":this.ftvshipAddrLine4));
        sb.append(',');
        sb.append("ctryCodeFax");
        sb.append('=');
        sb.append(((this.ctryCodeFax == null)?"<null>":this.ctryCodeFax));
        sb.append(',');
        sb.append("ftvshipAddrLine3");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine3 == null)?"<null>":this.ftvshipAddrLine3));
        sb.append(',');
        sb.append("ftvshipNatnCodeDesc");
        sb.append('=');
        sb.append(((this.ftvshipNatnCodeDesc == null)?"<null>":this.ftvshipNatnCodeDesc));
        sb.append(',');
        sb.append("ftvshipHouseNumber");
        sb.append('=');
        sb.append(((this.ftvshipHouseNumber == null)?"<null>":this.ftvshipHouseNumber));
        sb.append(',');
        sb.append("coasDesc");
        sb.append('=');
        sb.append(((this.coasDesc == null)?"<null>":this.coasDesc));
        sb.append(',');
        sb.append("ftvshipCtryCodePhone");
        sb.append('=');
        sb.append(((this.ftvshipCtryCodePhone == null)?"<null>":this.ftvshipCtryCodePhone));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("buyrCode");
        sb.append('=');
        sb.append(((this.buyrCode == null)?"<null>":this.buyrCode));
        sb.append(',');
        sb.append("ftvshipPhoneExt");
        sb.append('=');
        sb.append(((this.ftvshipPhoneExt == null)?"<null>":this.ftvshipPhoneExt));
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
        result = ((result* 31)+((this.displayAcctgTotal == null)? 0 :this.displayAcctgTotal.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.hdrPage1Ind == null)? 0 :this.hdrPage1Ind.hashCode()));
        result = ((result* 31)+((this.displayPoTypeInd == null)? 0 :this.displayPoTypeInd.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.displayCommTotal == null)? 0 :this.displayCommTotal.hashCode()));
        result = ((result* 31)+((this.rushInd == null)? 0 :this.rushInd.hashCode()));
        result = ((result* 31)+((this.poDate == null)? 0 :this.poDate.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.hdrDisplayChangeSeqNum == null)? 0 :this.hdrDisplayChangeSeqNum.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneArea == null)? 0 :this.ftvshipPhoneArea.hashCode()));
        result = ((result* 31)+((this.displayChangeSeqNum == null)? 0 :this.displayChangeSeqNum.hashCode()));
        result = ((result* 31)+((this.changeAcctgOnly == null)? 0 :this.changeAcctgOnly.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.displayPohdCode == null)? 0 :this.displayPohdCode.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneNum == null)? 0 :this.ftvshipPhoneNum.hashCode()));
        result = ((result* 31)+((this.orgnDesc == null)? 0 :this.orgnDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine4 == null)? 0 :this.ftvshipAddrLine4 .hashCode()));
        result = ((result* 31)+((this.ctryCodeFax == null)? 0 :this.ctryCodeFax.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine3 == null)? 0 :this.ftvshipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.ftvshipNatnCodeDesc == null)? 0 :this.ftvshipNatnCodeDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipHouseNumber == null)? 0 :this.ftvshipHouseNumber.hashCode()));
        result = ((result* 31)+((this.coasDesc == null)? 0 :this.coasDesc.hashCode()));
        result = ((result* 31)+((this.ftvshipCtryCodePhone == null)? 0 :this.ftvshipCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.buyrCode == null)? 0 :this.buyrCode.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneExt == null)? 0 :this.ftvshipPhoneExt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeOrder100PutRequest) == false) {
            return false;
        }
        ChangeOrder100PutRequest rhs = ((ChangeOrder100PutRequest) other);
        return (((((((((((((((((((((((((((((this.displayAcctgTotal == rhs.displayAcctgTotal)||((this.displayAcctgTotal!= null)&&this.displayAcctgTotal.equals(rhs.displayAcctgTotal)))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.hdrPage1Ind == rhs.hdrPage1Ind)||((this.hdrPage1Ind!= null)&&this.hdrPage1Ind.equals(rhs.hdrPage1Ind))))&&((this.displayPoTypeInd == rhs.displayPoTypeInd)||((this.displayPoTypeInd!= null)&&this.displayPoTypeInd.equals(rhs.displayPoTypeInd))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.displayCommTotal == rhs.displayCommTotal)||((this.displayCommTotal!= null)&&this.displayCommTotal.equals(rhs.displayCommTotal))))&&((this.rushInd == rhs.rushInd)||((this.rushInd!= null)&&this.rushInd.equals(rhs.rushInd))))&&((this.poDate == rhs.poDate)||((this.poDate!= null)&&this.poDate.equals(rhs.poDate))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.hdrDisplayChangeSeqNum == rhs.hdrDisplayChangeSeqNum)||((this.hdrDisplayChangeSeqNum!= null)&&this.hdrDisplayChangeSeqNum.equals(rhs.hdrDisplayChangeSeqNum))))&&((this.ftvshipPhoneArea == rhs.ftvshipPhoneArea)||((this.ftvshipPhoneArea!= null)&&this.ftvshipPhoneArea.equals(rhs.ftvshipPhoneArea))))&&((this.displayChangeSeqNum == rhs.displayChangeSeqNum)||((this.displayChangeSeqNum!= null)&&this.displayChangeSeqNum.equals(rhs.displayChangeSeqNum))))&&((this.changeAcctgOnly == rhs.changeAcctgOnly)||((this.changeAcctgOnly!= null)&&this.changeAcctgOnly.equals(rhs.changeAcctgOnly))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode))))&&((this.ftvshipPhoneNum == rhs.ftvshipPhoneNum)||((this.ftvshipPhoneNum!= null)&&this.ftvshipPhoneNum.equals(rhs.ftvshipPhoneNum))))&&((this.orgnDesc == rhs.orgnDesc)||((this.orgnDesc!= null)&&this.orgnDesc.equals(rhs.orgnDesc))))&&((this.ftvshipAddrLine4 == rhs.ftvshipAddrLine4)||((this.ftvshipAddrLine4 != null)&&this.ftvshipAddrLine4 .equals(rhs.ftvshipAddrLine4))))&&((this.ctryCodeFax == rhs.ctryCodeFax)||((this.ctryCodeFax!= null)&&this.ctryCodeFax.equals(rhs.ctryCodeFax))))&&((this.ftvshipAddrLine3 == rhs.ftvshipAddrLine3)||((this.ftvshipAddrLine3 != null)&&this.ftvshipAddrLine3 .equals(rhs.ftvshipAddrLine3))))&&((this.ftvshipNatnCodeDesc == rhs.ftvshipNatnCodeDesc)||((this.ftvshipNatnCodeDesc!= null)&&this.ftvshipNatnCodeDesc.equals(rhs.ftvshipNatnCodeDesc))))&&((this.ftvshipHouseNumber == rhs.ftvshipHouseNumber)||((this.ftvshipHouseNumber!= null)&&this.ftvshipHouseNumber.equals(rhs.ftvshipHouseNumber))))&&((this.coasDesc == rhs.coasDesc)||((this.coasDesc!= null)&&this.coasDesc.equals(rhs.coasDesc))))&&((this.ftvshipCtryCodePhone == rhs.ftvshipCtryCodePhone)||((this.ftvshipCtryCodePhone!= null)&&this.ftvshipCtryCodePhone.equals(rhs.ftvshipCtryCodePhone))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.buyrCode == rhs.buyrCode)||((this.buyrCode!= null)&&this.buyrCode.equals(rhs.buyrCode))))&&((this.ftvshipPhoneExt == rhs.ftvshipPhoneExt)||((this.ftvshipPhoneExt!= null)&&this.ftvshipPhoneExt.equals(rhs.ftvshipPhoneExt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
