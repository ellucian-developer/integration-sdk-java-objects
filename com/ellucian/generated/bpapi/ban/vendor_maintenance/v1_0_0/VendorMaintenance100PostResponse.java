
package com.ellucian.generated.bpapi.ban.vendor_maintenance.v1_0_0;

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
    "ftmvendVendCheckCode",
    "ftmvendDiscDesc",
    "taxFormStatus",
    "currCode",
    "nameOwner",
    "displayCurrDesc",
    "1099AddrSeqno",
    "eprocInd",
    "textExistInd",
    "taxFormDate",
    "vendOwner",
    "1099AtypCode",
    "currentNtypDesc",
    "pmtHoldCodeDesc",
    "ftmvendFormStatusDesc",
    "effDate",
    "activityDate",
    "collectTax",
    "stWholdPct",
    "carrierInd",
    "discCode",
    "contact",
    "poHoldCodeDesc",
    "fedWholdPct",
    "poHoldRsnCode",
    "phoneExt",
    "vendCheckAtypCode",
    "1099RptId",
    "groupingInd",
    "vendCheckName",
    "addrSeqno",
    "inStInd",
    "phoneNumber",
    "persSsn",
    "vendCheckAddrSeqno",
    "phoneArea",
    "spridenNtypCode",
    "itypCode",
    "termDate",
    "ftmvendItypDesc",
    "atypCode",
    "pmtHoldRsnCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenance100PostResponse {

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftmvendVendCheckCode")
    private String ftmvendVendCheckCode;
    @JsonProperty("ftmvendDiscDesc")
    private String ftmvendDiscDesc;
    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("taxFormStatus")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_STATUS")
    private String taxFormStatus;
    /**
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    @JsonProperty("nameOwner")
    private String nameOwner;
    @JsonProperty("displayCurrDesc")
    private String displayCurrDesc;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("1099AddrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_ADDR_SEQNO")
    private Double _1099AddrSeqno;
    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("eprocInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_EPROC_IND")
    private String eprocInd;
    @JsonProperty("textExistInd")
    private String textExistInd;
    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("taxFormDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_DATE")
    private Date taxFormDate;
    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("vendOwner")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String vendOwner;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("1099AtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String _1099AtypCode;
    @JsonProperty("currentNtypDesc")
    private String currentNtypDesc;
    @JsonProperty("pmtHoldCodeDesc")
    private String pmtHoldCodeDesc;
    @JsonProperty("ftmvendFormStatusDesc")
    private String ftmvendFormStatusDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("collectTax")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_COLLECT_TAX")
    private String collectTax;
    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("stWholdPct")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ST_WHOLD_PCT")
    private Double stWholdPct;
    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("carrierInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CARRIER_IND")
    private String carrierInd;
    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc")
    private String discCode;
    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CONTACT")
    private String contact;
    @JsonProperty("poHoldCodeDesc")
    private String poHoldCodeDesc;
    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("fedWholdPct")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_FED_WHOLD_PCT")
    private Double fedWholdPct;
    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("poHoldRsnCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn")
    private String poHoldRsnCode;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_EXT")
    private String phoneExt;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("vendCheckAtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String vendCheckAtypCode;
    /**
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("1099RptId")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_RPT_ID")
    private String _1099RptId;
    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_GROUPING_IND")
    private String groupingInd;
    @JsonProperty("vendCheckName")
    private String vendCheckName;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("inStInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_IN_ST_IND")
    private String inStInd;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    private String persSsn;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("vendCheckAddrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO")
    private Double vendCheckAddrSeqno;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_AREA")
    private String phoneArea;
    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("itypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String itypCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TERM_DATE")
    private Date termDate;
    @JsonProperty("ftmvendItypDesc")
    private String ftmvendItypDesc;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("pmtHoldRsnCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn")
    private String pmtHoldRsnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftmvendVendCheckCode")
    public String getFtmvendVendCheckCode() {
        return ftmvendVendCheckCode;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftmvendVendCheckCode")
    public void setFtmvendVendCheckCode(String ftmvendVendCheckCode) {
        this.ftmvendVendCheckCode = ftmvendVendCheckCode;
    }

    public VendorMaintenance100PostResponse withFtmvendVendCheckCode(String ftmvendVendCheckCode) {
        this.ftmvendVendCheckCode = ftmvendVendCheckCode;
        return this;
    }

    @JsonProperty("ftmvendDiscDesc")
    public String getFtmvendDiscDesc() {
        return ftmvendDiscDesc;
    }

    @JsonProperty("ftmvendDiscDesc")
    public void setFtmvendDiscDesc(String ftmvendDiscDesc) {
        this.ftmvendDiscDesc = ftmvendDiscDesc;
    }

    public VendorMaintenance100PostResponse withFtmvendDiscDesc(String ftmvendDiscDesc) {
        this.ftmvendDiscDesc = ftmvendDiscDesc;
        return this;
    }

    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("taxFormStatus")
    public String getTaxFormStatus() {
        return taxFormStatus;
    }

    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("taxFormStatus")
    public void setTaxFormStatus(String taxFormStatus) {
        this.taxFormStatus = taxFormStatus;
    }

    public VendorMaintenance100PostResponse withTaxFormStatus(String taxFormStatus) {
        this.taxFormStatus = taxFormStatus;
        return this;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public VendorMaintenance100PostResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    @JsonProperty("nameOwner")
    public String getNameOwner() {
        return nameOwner;
    }

    @JsonProperty("nameOwner")
    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public VendorMaintenance100PostResponse withNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
        return this;
    }

    @JsonProperty("displayCurrDesc")
    public String getDisplayCurrDesc() {
        return displayCurrDesc;
    }

    @JsonProperty("displayCurrDesc")
    public void setDisplayCurrDesc(String displayCurrDesc) {
        this.displayCurrDesc = displayCurrDesc;
    }

    public VendorMaintenance100PostResponse withDisplayCurrDesc(String displayCurrDesc) {
        this.displayCurrDesc = displayCurrDesc;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("1099AddrSeqno")
    public Double get1099AddrSeqno() {
        return _1099AddrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("1099AddrSeqno")
    public void set1099AddrSeqno(Double _1099AddrSeqno) {
        this._1099AddrSeqno = _1099AddrSeqno;
    }

    public VendorMaintenance100PostResponse with1099AddrSeqno(Double _1099AddrSeqno) {
        this._1099AddrSeqno = _1099AddrSeqno;
        return this;
    }

    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("eprocInd")
    public String getEprocInd() {
        return eprocInd;
    }

    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("eprocInd")
    public void setEprocInd(String eprocInd) {
        this.eprocInd = eprocInd;
    }

    public VendorMaintenance100PostResponse withEprocInd(String eprocInd) {
        this.eprocInd = eprocInd;
        return this;
    }

    @JsonProperty("textExistInd")
    public String getTextExistInd() {
        return textExistInd;
    }

    @JsonProperty("textExistInd")
    public void setTextExistInd(String textExistInd) {
        this.textExistInd = textExistInd;
    }

    public VendorMaintenance100PostResponse withTextExistInd(String textExistInd) {
        this.textExistInd = textExistInd;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("taxFormDate")
    public Date getTaxFormDate() {
        return taxFormDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("taxFormDate")
    public void setTaxFormDate(Date taxFormDate) {
        this.taxFormDate = taxFormDate;
    }

    public VendorMaintenance100PostResponse withTaxFormDate(Date taxFormDate) {
        this.taxFormDate = taxFormDate;
        return this;
    }

    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("vendOwner")
    public String getVendOwner() {
        return vendOwner;
    }

    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("vendOwner")
    public void setVendOwner(String vendOwner) {
        this.vendOwner = vendOwner;
    }

    public VendorMaintenance100PostResponse withVendOwner(String vendOwner) {
        this.vendOwner = vendOwner;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("1099AtypCode")
    public String get1099AtypCode() {
        return _1099AtypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("1099AtypCode")
    public void set1099AtypCode(String _1099AtypCode) {
        this._1099AtypCode = _1099AtypCode;
    }

    public VendorMaintenance100PostResponse with1099AtypCode(String _1099AtypCode) {
        this._1099AtypCode = _1099AtypCode;
        return this;
    }

    @JsonProperty("currentNtypDesc")
    public String getCurrentNtypDesc() {
        return currentNtypDesc;
    }

    @JsonProperty("currentNtypDesc")
    public void setCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
    }

    public VendorMaintenance100PostResponse withCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
        return this;
    }

    @JsonProperty("pmtHoldCodeDesc")
    public String getPmtHoldCodeDesc() {
        return pmtHoldCodeDesc;
    }

    @JsonProperty("pmtHoldCodeDesc")
    public void setPmtHoldCodeDesc(String pmtHoldCodeDesc) {
        this.pmtHoldCodeDesc = pmtHoldCodeDesc;
    }

    public VendorMaintenance100PostResponse withPmtHoldCodeDesc(String pmtHoldCodeDesc) {
        this.pmtHoldCodeDesc = pmtHoldCodeDesc;
        return this;
    }

    @JsonProperty("ftmvendFormStatusDesc")
    public String getFtmvendFormStatusDesc() {
        return ftmvendFormStatusDesc;
    }

    @JsonProperty("ftmvendFormStatusDesc")
    public void setFtmvendFormStatusDesc(String ftmvendFormStatusDesc) {
        this.ftmvendFormStatusDesc = ftmvendFormStatusDesc;
    }

    public VendorMaintenance100PostResponse withFtmvendFormStatusDesc(String ftmvendFormStatusDesc) {
        this.ftmvendFormStatusDesc = ftmvendFormStatusDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public VendorMaintenance100PostResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VendorMaintenance100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("collectTax")
    public String getCollectTax() {
        return collectTax;
    }

    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("collectTax")
    public void setCollectTax(String collectTax) {
        this.collectTax = collectTax;
    }

    public VendorMaintenance100PostResponse withCollectTax(String collectTax) {
        this.collectTax = collectTax;
        return this;
    }

    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("stWholdPct")
    public Double getStWholdPct() {
        return stWholdPct;
    }

    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("stWholdPct")
    public void setStWholdPct(Double stWholdPct) {
        this.stWholdPct = stWholdPct;
    }

    public VendorMaintenance100PostResponse withStWholdPct(Double stWholdPct) {
        this.stWholdPct = stWholdPct;
        return this;
    }

    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("carrierInd")
    public String getCarrierInd() {
        return carrierInd;
    }

    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("carrierInd")
    public void setCarrierInd(String carrierInd) {
        this.carrierInd = carrierInd;
    }

    public VendorMaintenance100PostResponse withCarrierInd(String carrierInd) {
        this.carrierInd = carrierInd;
        return this;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public String getDiscCode() {
        return discCode;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("discCode")
    public void setDiscCode(String discCode) {
        this.discCode = discCode;
    }

    public VendorMaintenance100PostResponse withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    public VendorMaintenance100PostResponse withContact(String contact) {
        this.contact = contact;
        return this;
    }

    @JsonProperty("poHoldCodeDesc")
    public String getPoHoldCodeDesc() {
        return poHoldCodeDesc;
    }

    @JsonProperty("poHoldCodeDesc")
    public void setPoHoldCodeDesc(String poHoldCodeDesc) {
        this.poHoldCodeDesc = poHoldCodeDesc;
    }

    public VendorMaintenance100PostResponse withPoHoldCodeDesc(String poHoldCodeDesc) {
        this.poHoldCodeDesc = poHoldCodeDesc;
        return this;
    }

    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("fedWholdPct")
    public Double getFedWholdPct() {
        return fedWholdPct;
    }

    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("fedWholdPct")
    public void setFedWholdPct(Double fedWholdPct) {
        this.fedWholdPct = fedWholdPct;
    }

    public VendorMaintenance100PostResponse withFedWholdPct(Double fedWholdPct) {
        this.fedWholdPct = fedWholdPct;
        return this;
    }

    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("poHoldRsnCode")
    public String getPoHoldRsnCode() {
        return poHoldRsnCode;
    }

    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("poHoldRsnCode")
    public void setPoHoldRsnCode(String poHoldRsnCode) {
        this.poHoldRsnCode = poHoldRsnCode;
    }

    public VendorMaintenance100PostResponse withPoHoldRsnCode(String poHoldRsnCode) {
        this.poHoldRsnCode = poHoldRsnCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public VendorMaintenance100PostResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("vendCheckAtypCode")
    public String getVendCheckAtypCode() {
        return vendCheckAtypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("vendCheckAtypCode")
    public void setVendCheckAtypCode(String vendCheckAtypCode) {
        this.vendCheckAtypCode = vendCheckAtypCode;
    }

    public VendorMaintenance100PostResponse withVendCheckAtypCode(String vendCheckAtypCode) {
        this.vendCheckAtypCode = vendCheckAtypCode;
        return this;
    }

    /**
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("1099RptId")
    public String get1099RptId() {
        return _1099RptId;
    }

    /**
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("1099RptId")
    public void set1099RptId(String _1099RptId) {
        this._1099RptId = _1099RptId;
    }

    public VendorMaintenance100PostResponse with1099RptId(String _1099RptId) {
        this._1099RptId = _1099RptId;
        return this;
    }

    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    public String getGroupingInd() {
        return groupingInd;
    }

    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    public void setGroupingInd(String groupingInd) {
        this.groupingInd = groupingInd;
    }

    public VendorMaintenance100PostResponse withGroupingInd(String groupingInd) {
        this.groupingInd = groupingInd;
        return this;
    }

    @JsonProperty("vendCheckName")
    public String getVendCheckName() {
        return vendCheckName;
    }

    @JsonProperty("vendCheckName")
    public void setVendCheckName(String vendCheckName) {
        this.vendCheckName = vendCheckName;
    }

    public VendorMaintenance100PostResponse withVendCheckName(String vendCheckName) {
        this.vendCheckName = vendCheckName;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public VendorMaintenance100PostResponse withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("inStInd")
    public String getInStInd() {
        return inStInd;
    }

    /**
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("inStInd")
    public void setInStInd(String inStInd) {
        this.inStInd = inStInd;
    }

    public VendorMaintenance100PostResponse withInStInd(String inStInd) {
        this.inStInd = inStInd;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VendorMaintenance100PostResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    public String getPersSsn() {
        return persSsn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    public void setPersSsn(String persSsn) {
        this.persSsn = persSsn;
    }

    public VendorMaintenance100PostResponse withPersSsn(String persSsn) {
        this.persSsn = persSsn;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("vendCheckAddrSeqno")
    public Double getVendCheckAddrSeqno() {
        return vendCheckAddrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("vendCheckAddrSeqno")
    public void setVendCheckAddrSeqno(Double vendCheckAddrSeqno) {
        this.vendCheckAddrSeqno = vendCheckAddrSeqno;
    }

    public VendorMaintenance100PostResponse withVendCheckAddrSeqno(Double vendCheckAddrSeqno) {
        this.vendCheckAddrSeqno = vendCheckAddrSeqno;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public VendorMaintenance100PostResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public String getSpridenNtypCode() {
        return spridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public void setSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
    }

    public VendorMaintenance100PostResponse withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("itypCode")
    public String getItypCode() {
        return itypCode;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("itypCode")
    public void setItypCode(String itypCode) {
        this.itypCode = itypCode;
    }

    public VendorMaintenance100PostResponse withItypCode(String itypCode) {
        this.itypCode = itypCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public VendorMaintenance100PostResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    @JsonProperty("ftmvendItypDesc")
    public String getFtmvendItypDesc() {
        return ftmvendItypDesc;
    }

    @JsonProperty("ftmvendItypDesc")
    public void setFtmvendItypDesc(String ftmvendItypDesc) {
        this.ftmvendItypDesc = ftmvendItypDesc;
    }

    public VendorMaintenance100PostResponse withFtmvendItypDesc(String ftmvendItypDesc) {
        this.ftmvendItypDesc = ftmvendItypDesc;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public VendorMaintenance100PostResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("pmtHoldRsnCode")
    public String getPmtHoldRsnCode() {
        return pmtHoldRsnCode;
    }

    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("pmtHoldRsnCode")
    public void setPmtHoldRsnCode(String pmtHoldRsnCode) {
        this.pmtHoldRsnCode = pmtHoldRsnCode;
    }

    public VendorMaintenance100PostResponse withPmtHoldRsnCode(String pmtHoldRsnCode) {
        this.pmtHoldRsnCode = pmtHoldRsnCode;
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

    public VendorMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftmvendVendCheckCode");
        sb.append('=');
        sb.append(((this.ftmvendVendCheckCode == null)?"<null>":this.ftmvendVendCheckCode));
        sb.append(',');
        sb.append("ftmvendDiscDesc");
        sb.append('=');
        sb.append(((this.ftmvendDiscDesc == null)?"<null>":this.ftmvendDiscDesc));
        sb.append(',');
        sb.append("taxFormStatus");
        sb.append('=');
        sb.append(((this.taxFormStatus == null)?"<null>":this.taxFormStatus));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("nameOwner");
        sb.append('=');
        sb.append(((this.nameOwner == null)?"<null>":this.nameOwner));
        sb.append(',');
        sb.append("displayCurrDesc");
        sb.append('=');
        sb.append(((this.displayCurrDesc == null)?"<null>":this.displayCurrDesc));
        sb.append(',');
        sb.append("_1099AddrSeqno");
        sb.append('=');
        sb.append(((this._1099AddrSeqno == null)?"<null>":this._1099AddrSeqno));
        sb.append(',');
        sb.append("eprocInd");
        sb.append('=');
        sb.append(((this.eprocInd == null)?"<null>":this.eprocInd));
        sb.append(',');
        sb.append("textExistInd");
        sb.append('=');
        sb.append(((this.textExistInd == null)?"<null>":this.textExistInd));
        sb.append(',');
        sb.append("taxFormDate");
        sb.append('=');
        sb.append(((this.taxFormDate == null)?"<null>":this.taxFormDate));
        sb.append(',');
        sb.append("vendOwner");
        sb.append('=');
        sb.append(((this.vendOwner == null)?"<null>":this.vendOwner));
        sb.append(',');
        sb.append("_1099AtypCode");
        sb.append('=');
        sb.append(((this._1099AtypCode == null)?"<null>":this._1099AtypCode));
        sb.append(',');
        sb.append("currentNtypDesc");
        sb.append('=');
        sb.append(((this.currentNtypDesc == null)?"<null>":this.currentNtypDesc));
        sb.append(',');
        sb.append("pmtHoldCodeDesc");
        sb.append('=');
        sb.append(((this.pmtHoldCodeDesc == null)?"<null>":this.pmtHoldCodeDesc));
        sb.append(',');
        sb.append("ftmvendFormStatusDesc");
        sb.append('=');
        sb.append(((this.ftmvendFormStatusDesc == null)?"<null>":this.ftmvendFormStatusDesc));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("collectTax");
        sb.append('=');
        sb.append(((this.collectTax == null)?"<null>":this.collectTax));
        sb.append(',');
        sb.append("stWholdPct");
        sb.append('=');
        sb.append(((this.stWholdPct == null)?"<null>":this.stWholdPct));
        sb.append(',');
        sb.append("carrierInd");
        sb.append('=');
        sb.append(((this.carrierInd == null)?"<null>":this.carrierInd));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("poHoldCodeDesc");
        sb.append('=');
        sb.append(((this.poHoldCodeDesc == null)?"<null>":this.poHoldCodeDesc));
        sb.append(',');
        sb.append("fedWholdPct");
        sb.append('=');
        sb.append(((this.fedWholdPct == null)?"<null>":this.fedWholdPct));
        sb.append(',');
        sb.append("poHoldRsnCode");
        sb.append('=');
        sb.append(((this.poHoldRsnCode == null)?"<null>":this.poHoldRsnCode));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("vendCheckAtypCode");
        sb.append('=');
        sb.append(((this.vendCheckAtypCode == null)?"<null>":this.vendCheckAtypCode));
        sb.append(',');
        sb.append("_1099RptId");
        sb.append('=');
        sb.append(((this._1099RptId == null)?"<null>":this._1099RptId));
        sb.append(',');
        sb.append("groupingInd");
        sb.append('=');
        sb.append(((this.groupingInd == null)?"<null>":this.groupingInd));
        sb.append(',');
        sb.append("vendCheckName");
        sb.append('=');
        sb.append(((this.vendCheckName == null)?"<null>":this.vendCheckName));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("inStInd");
        sb.append('=');
        sb.append(((this.inStInd == null)?"<null>":this.inStInd));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("persSsn");
        sb.append('=');
        sb.append(((this.persSsn == null)?"<null>":this.persSsn));
        sb.append(',');
        sb.append("vendCheckAddrSeqno");
        sb.append('=');
        sb.append(((this.vendCheckAddrSeqno == null)?"<null>":this.vendCheckAddrSeqno));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("itypCode");
        sb.append('=');
        sb.append(((this.itypCode == null)?"<null>":this.itypCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftmvendItypDesc");
        sb.append('=');
        sb.append(((this.ftmvendItypDesc == null)?"<null>":this.ftmvendItypDesc));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("pmtHoldRsnCode");
        sb.append('=');
        sb.append(((this.pmtHoldRsnCode == null)?"<null>":this.pmtHoldRsnCode));
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
        result = ((result* 31)+((this.ftmvendVendCheckCode == null)? 0 :this.ftmvendVendCheckCode.hashCode()));
        result = ((result* 31)+((this.ftmvendDiscDesc == null)? 0 :this.ftmvendDiscDesc.hashCode()));
        result = ((result* 31)+((this.taxFormStatus == null)? 0 :this.taxFormStatus.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.nameOwner == null)? 0 :this.nameOwner.hashCode()));
        result = ((result* 31)+((this.displayCurrDesc == null)? 0 :this.displayCurrDesc.hashCode()));
        result = ((result* 31)+((this.eprocInd == null)? 0 :this.eprocInd.hashCode()));
        result = ((result* 31)+((this.textExistInd == null)? 0 :this.textExistInd.hashCode()));
        result = ((result* 31)+((this._1099AtypCode == null)? 0 :this._1099AtypCode.hashCode()));
        result = ((result* 31)+((this.taxFormDate == null)? 0 :this.taxFormDate.hashCode()));
        result = ((result* 31)+((this.vendOwner == null)? 0 :this.vendOwner.hashCode()));
        result = ((result* 31)+((this.currentNtypDesc == null)? 0 :this.currentNtypDesc.hashCode()));
        result = ((result* 31)+((this.pmtHoldCodeDesc == null)? 0 :this.pmtHoldCodeDesc.hashCode()));
        result = ((result* 31)+((this.ftmvendFormStatusDesc == null)? 0 :this.ftmvendFormStatusDesc.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.collectTax == null)? 0 :this.collectTax.hashCode()));
        result = ((result* 31)+((this.stWholdPct == null)? 0 :this.stWholdPct.hashCode()));
        result = ((result* 31)+((this.carrierInd == null)? 0 :this.carrierInd.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.poHoldCodeDesc == null)? 0 :this.poHoldCodeDesc.hashCode()));
        result = ((result* 31)+((this.fedWholdPct == null)? 0 :this.fedWholdPct.hashCode()));
        result = ((result* 31)+((this.poHoldRsnCode == null)? 0 :this.poHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this._1099RptId == null)? 0 :this._1099RptId.hashCode()));
        result = ((result* 31)+((this.vendCheckAtypCode == null)? 0 :this.vendCheckAtypCode.hashCode()));
        result = ((result* 31)+((this.groupingInd == null)? 0 :this.groupingInd.hashCode()));
        result = ((result* 31)+((this.vendCheckName == null)? 0 :this.vendCheckName.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.inStInd == null)? 0 :this.inStInd.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this._1099AddrSeqno == null)? 0 :this._1099AddrSeqno.hashCode()));
        result = ((result* 31)+((this.persSsn == null)? 0 :this.persSsn.hashCode()));
        result = ((result* 31)+((this.vendCheckAddrSeqno == null)? 0 :this.vendCheckAddrSeqno.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.itypCode == null)? 0 :this.itypCode.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftmvendItypDesc == null)? 0 :this.ftmvendItypDesc.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.pmtHoldRsnCode == null)? 0 :this.pmtHoldRsnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenance100PostResponse) == false) {
            return false;
        }
        VendorMaintenance100PostResponse rhs = ((VendorMaintenance100PostResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.ftmvendVendCheckCode == rhs.ftmvendVendCheckCode)||((this.ftmvendVendCheckCode!= null)&&this.ftmvendVendCheckCode.equals(rhs.ftmvendVendCheckCode)))&&((this.ftmvendDiscDesc == rhs.ftmvendDiscDesc)||((this.ftmvendDiscDesc!= null)&&this.ftmvendDiscDesc.equals(rhs.ftmvendDiscDesc))))&&((this.taxFormStatus == rhs.taxFormStatus)||((this.taxFormStatus!= null)&&this.taxFormStatus.equals(rhs.taxFormStatus))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.nameOwner == rhs.nameOwner)||((this.nameOwner!= null)&&this.nameOwner.equals(rhs.nameOwner))))&&((this.displayCurrDesc == rhs.displayCurrDesc)||((this.displayCurrDesc!= null)&&this.displayCurrDesc.equals(rhs.displayCurrDesc))))&&((this.eprocInd == rhs.eprocInd)||((this.eprocInd!= null)&&this.eprocInd.equals(rhs.eprocInd))))&&((this.textExistInd == rhs.textExistInd)||((this.textExistInd!= null)&&this.textExistInd.equals(rhs.textExistInd))))&&((this._1099AtypCode == rhs._1099AtypCode)||((this._1099AtypCode!= null)&&this._1099AtypCode.equals(rhs._1099AtypCode))))&&((this.taxFormDate == rhs.taxFormDate)||((this.taxFormDate!= null)&&this.taxFormDate.equals(rhs.taxFormDate))))&&((this.vendOwner == rhs.vendOwner)||((this.vendOwner!= null)&&this.vendOwner.equals(rhs.vendOwner))))&&((this.currentNtypDesc == rhs.currentNtypDesc)||((this.currentNtypDesc!= null)&&this.currentNtypDesc.equals(rhs.currentNtypDesc))))&&((this.pmtHoldCodeDesc == rhs.pmtHoldCodeDesc)||((this.pmtHoldCodeDesc!= null)&&this.pmtHoldCodeDesc.equals(rhs.pmtHoldCodeDesc))))&&((this.ftmvendFormStatusDesc == rhs.ftmvendFormStatusDesc)||((this.ftmvendFormStatusDesc!= null)&&this.ftmvendFormStatusDesc.equals(rhs.ftmvendFormStatusDesc))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.collectTax == rhs.collectTax)||((this.collectTax!= null)&&this.collectTax.equals(rhs.collectTax))))&&((this.stWholdPct == rhs.stWholdPct)||((this.stWholdPct!= null)&&this.stWholdPct.equals(rhs.stWholdPct))))&&((this.carrierInd == rhs.carrierInd)||((this.carrierInd!= null)&&this.carrierInd.equals(rhs.carrierInd))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.poHoldCodeDesc == rhs.poHoldCodeDesc)||((this.poHoldCodeDesc!= null)&&this.poHoldCodeDesc.equals(rhs.poHoldCodeDesc))))&&((this.fedWholdPct == rhs.fedWholdPct)||((this.fedWholdPct!= null)&&this.fedWholdPct.equals(rhs.fedWholdPct))))&&((this.poHoldRsnCode == rhs.poHoldRsnCode)||((this.poHoldRsnCode!= null)&&this.poHoldRsnCode.equals(rhs.poHoldRsnCode))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this._1099RptId == rhs._1099RptId)||((this._1099RptId!= null)&&this._1099RptId.equals(rhs._1099RptId))))&&((this.vendCheckAtypCode == rhs.vendCheckAtypCode)||((this.vendCheckAtypCode!= null)&&this.vendCheckAtypCode.equals(rhs.vendCheckAtypCode))))&&((this.groupingInd == rhs.groupingInd)||((this.groupingInd!= null)&&this.groupingInd.equals(rhs.groupingInd))))&&((this.vendCheckName == rhs.vendCheckName)||((this.vendCheckName!= null)&&this.vendCheckName.equals(rhs.vendCheckName))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.inStInd == rhs.inStInd)||((this.inStInd!= null)&&this.inStInd.equals(rhs.inStInd))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this._1099AddrSeqno == rhs._1099AddrSeqno)||((this._1099AddrSeqno!= null)&&this._1099AddrSeqno.equals(rhs._1099AddrSeqno))))&&((this.persSsn == rhs.persSsn)||((this.persSsn!= null)&&this.persSsn.equals(rhs.persSsn))))&&((this.vendCheckAddrSeqno == rhs.vendCheckAddrSeqno)||((this.vendCheckAddrSeqno!= null)&&this.vendCheckAddrSeqno.equals(rhs.vendCheckAddrSeqno))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.itypCode == rhs.itypCode)||((this.itypCode!= null)&&this.itypCode.equals(rhs.itypCode))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftmvendItypDesc == rhs.ftmvendItypDesc)||((this.ftmvendItypDesc!= null)&&this.ftmvendItypDesc.equals(rhs.ftmvendItypDesc))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.pmtHoldRsnCode == rhs.pmtHoldRsnCode)||((this.pmtHoldRsnCode!= null)&&this.pmtHoldRsnCode.equals(rhs.pmtHoldRsnCode))));
    }

}
