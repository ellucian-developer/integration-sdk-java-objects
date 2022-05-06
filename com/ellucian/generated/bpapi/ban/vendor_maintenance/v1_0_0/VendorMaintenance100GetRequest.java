
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
    "taxFormStatus",
    "currCode",
    "1099AddrSeqno",
    "eprocInd",
    "vendOwner",
    "taxFormDate",
    "1099AtypCode",
    "ctryCodePhone",
    "effDate",
    "activityDate",
    "collectTax",
    "stWholdPct",
    "carrierInd",
    "discCode",
    "ftvvendVendCode",
    "contact",
    "fedWholdPct",
    "poHoldRsnCode",
    "phoneExt",
    "vendCheckAtypCode",
    "1099RptId",
    "groupingInd",
    "addrSeqno",
    "inStInd",
    "vendCheckAddrSeqno",
    "phoneArea",
    "spridenNtypCode",
    "termDate",
    "itypCode",
    "atypCode",
    "pmtHoldRsnCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenance100GetRequest {

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftmvendVendCheckCode")
    private String ftmvendVendCheckCode;
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
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("taxFormDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_DATE")
    private Date taxFormDate;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("1099AtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String _1099AtypCode;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CTRY_CODE_PHONE")
    private String ctryCodePhone;
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
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    @JsonPropertyDescription("Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend")
    private Object ftvvendVendCode;
    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CONTACT")
    private String contact;
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
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TERM_DATE")
    private Date termDate;
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

    public VendorMaintenance100GetRequest withFtmvendVendCheckCode(String ftmvendVendCheckCode) {
        this.ftmvendVendCheckCode = ftmvendVendCheckCode;
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

    public VendorMaintenance100GetRequest withTaxFormStatus(String taxFormStatus) {
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

    public VendorMaintenance100GetRequest withCurrCode(String currCode) {
        this.currCode = currCode;
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

    public VendorMaintenance100GetRequest with1099AddrSeqno(Double _1099AddrSeqno) {
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

    public VendorMaintenance100GetRequest withEprocInd(String eprocInd) {
        this.eprocInd = eprocInd;
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

    public VendorMaintenance100GetRequest withVendOwner(String vendOwner) {
        this.vendOwner = vendOwner;
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

    public VendorMaintenance100GetRequest withTaxFormDate(Date taxFormDate) {
        this.taxFormDate = taxFormDate;
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

    public VendorMaintenance100GetRequest with1099AtypCode(String _1099AtypCode) {
        this._1099AtypCode = _1099AtypCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public VendorMaintenance100GetRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public VendorMaintenance100GetRequest withEffDate(Date effDate) {
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

    public VendorMaintenance100GetRequest withActivityDate(Date activityDate) {
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

    public VendorMaintenance100GetRequest withCollectTax(String collectTax) {
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

    public VendorMaintenance100GetRequest withStWholdPct(Double stWholdPct) {
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

    public VendorMaintenance100GetRequest withCarrierInd(String carrierInd) {
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

    public VendorMaintenance100GetRequest withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public Object getFtvvendVendCode() {
        return ftvvendVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public void setFtvvendVendCode(Object ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
    }

    public VendorMaintenance100GetRequest withFtvvendVendCode(Object ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
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

    public VendorMaintenance100GetRequest withContact(String contact) {
        this.contact = contact;
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

    public VendorMaintenance100GetRequest withFedWholdPct(Double fedWholdPct) {
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

    public VendorMaintenance100GetRequest withPoHoldRsnCode(String poHoldRsnCode) {
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

    public VendorMaintenance100GetRequest withPhoneExt(String phoneExt) {
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

    public VendorMaintenance100GetRequest withVendCheckAtypCode(String vendCheckAtypCode) {
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

    public VendorMaintenance100GetRequest with1099RptId(String _1099RptId) {
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

    public VendorMaintenance100GetRequest withGroupingInd(String groupingInd) {
        this.groupingInd = groupingInd;
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

    public VendorMaintenance100GetRequest withAddrSeqno(Double addrSeqno) {
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

    public VendorMaintenance100GetRequest withInStInd(String inStInd) {
        this.inStInd = inStInd;
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

    public VendorMaintenance100GetRequest withVendCheckAddrSeqno(Double vendCheckAddrSeqno) {
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

    public VendorMaintenance100GetRequest withPhoneArea(String phoneArea) {
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

    public VendorMaintenance100GetRequest withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
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

    public VendorMaintenance100GetRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public VendorMaintenance100GetRequest withItypCode(String itypCode) {
        this.itypCode = itypCode;
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

    public VendorMaintenance100GetRequest withAtypCode(String atypCode) {
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

    public VendorMaintenance100GetRequest withPmtHoldRsnCode(String pmtHoldRsnCode) {
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

    public VendorMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftmvendVendCheckCode");
        sb.append('=');
        sb.append(((this.ftmvendVendCheckCode == null)?"<null>":this.ftmvendVendCheckCode));
        sb.append(',');
        sb.append("taxFormStatus");
        sb.append('=');
        sb.append(((this.taxFormStatus == null)?"<null>":this.taxFormStatus));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("_1099AddrSeqno");
        sb.append('=');
        sb.append(((this._1099AddrSeqno == null)?"<null>":this._1099AddrSeqno));
        sb.append(',');
        sb.append("eprocInd");
        sb.append('=');
        sb.append(((this.eprocInd == null)?"<null>":this.eprocInd));
        sb.append(',');
        sb.append("vendOwner");
        sb.append('=');
        sb.append(((this.vendOwner == null)?"<null>":this.vendOwner));
        sb.append(',');
        sb.append("taxFormDate");
        sb.append('=');
        sb.append(((this.taxFormDate == null)?"<null>":this.taxFormDate));
        sb.append(',');
        sb.append("_1099AtypCode");
        sb.append('=');
        sb.append(((this._1099AtypCode == null)?"<null>":this._1099AtypCode));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
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
        sb.append("ftvvendVendCode");
        sb.append('=');
        sb.append(((this.ftvvendVendCode == null)?"<null>":this.ftvvendVendCode));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("inStInd");
        sb.append('=');
        sb.append(((this.inStInd == null)?"<null>":this.inStInd));
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
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("itypCode");
        sb.append('=');
        sb.append(((this.itypCode == null)?"<null>":this.itypCode));
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
        result = ((result* 31)+((this.taxFormStatus == null)? 0 :this.taxFormStatus.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.eprocInd == null)? 0 :this.eprocInd.hashCode()));
        result = ((result* 31)+((this._1099AtypCode == null)? 0 :this._1099AtypCode.hashCode()));
        result = ((result* 31)+((this.vendOwner == null)? 0 :this.vendOwner.hashCode()));
        result = ((result* 31)+((this.taxFormDate == null)? 0 :this.taxFormDate.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.collectTax == null)? 0 :this.collectTax.hashCode()));
        result = ((result* 31)+((this.stWholdPct == null)? 0 :this.stWholdPct.hashCode()));
        result = ((result* 31)+((this.carrierInd == null)? 0 :this.carrierInd.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.ftvvendVendCode == null)? 0 :this.ftvvendVendCode.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.fedWholdPct == null)? 0 :this.fedWholdPct.hashCode()));
        result = ((result* 31)+((this.poHoldRsnCode == null)? 0 :this.poHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this._1099RptId == null)? 0 :this._1099RptId.hashCode()));
        result = ((result* 31)+((this.vendCheckAtypCode == null)? 0 :this.vendCheckAtypCode.hashCode()));
        result = ((result* 31)+((this.groupingInd == null)? 0 :this.groupingInd.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.inStInd == null)? 0 :this.inStInd.hashCode()));
        result = ((result* 31)+((this._1099AddrSeqno == null)? 0 :this._1099AddrSeqno.hashCode()));
        result = ((result* 31)+((this.vendCheckAddrSeqno == null)? 0 :this.vendCheckAddrSeqno.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.itypCode == null)? 0 :this.itypCode.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.pmtHoldRsnCode == null)? 0 :this.pmtHoldRsnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenance100GetRequest) == false) {
            return false;
        }
        VendorMaintenance100GetRequest rhs = ((VendorMaintenance100GetRequest) other);
        return ((((((((((((((((((((((((((((((((((this.ftmvendVendCheckCode == rhs.ftmvendVendCheckCode)||((this.ftmvendVendCheckCode!= null)&&this.ftmvendVendCheckCode.equals(rhs.ftmvendVendCheckCode)))&&((this.taxFormStatus == rhs.taxFormStatus)||((this.taxFormStatus!= null)&&this.taxFormStatus.equals(rhs.taxFormStatus))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.eprocInd == rhs.eprocInd)||((this.eprocInd!= null)&&this.eprocInd.equals(rhs.eprocInd))))&&((this._1099AtypCode == rhs._1099AtypCode)||((this._1099AtypCode!= null)&&this._1099AtypCode.equals(rhs._1099AtypCode))))&&((this.vendOwner == rhs.vendOwner)||((this.vendOwner!= null)&&this.vendOwner.equals(rhs.vendOwner))))&&((this.taxFormDate == rhs.taxFormDate)||((this.taxFormDate!= null)&&this.taxFormDate.equals(rhs.taxFormDate))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.collectTax == rhs.collectTax)||((this.collectTax!= null)&&this.collectTax.equals(rhs.collectTax))))&&((this.stWholdPct == rhs.stWholdPct)||((this.stWholdPct!= null)&&this.stWholdPct.equals(rhs.stWholdPct))))&&((this.carrierInd == rhs.carrierInd)||((this.carrierInd!= null)&&this.carrierInd.equals(rhs.carrierInd))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.ftvvendVendCode == rhs.ftvvendVendCode)||((this.ftvvendVendCode!= null)&&this.ftvvendVendCode.equals(rhs.ftvvendVendCode))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.fedWholdPct == rhs.fedWholdPct)||((this.fedWholdPct!= null)&&this.fedWholdPct.equals(rhs.fedWholdPct))))&&((this.poHoldRsnCode == rhs.poHoldRsnCode)||((this.poHoldRsnCode!= null)&&this.poHoldRsnCode.equals(rhs.poHoldRsnCode))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this._1099RptId == rhs._1099RptId)||((this._1099RptId!= null)&&this._1099RptId.equals(rhs._1099RptId))))&&((this.vendCheckAtypCode == rhs.vendCheckAtypCode)||((this.vendCheckAtypCode!= null)&&this.vendCheckAtypCode.equals(rhs.vendCheckAtypCode))))&&((this.groupingInd == rhs.groupingInd)||((this.groupingInd!= null)&&this.groupingInd.equals(rhs.groupingInd))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.inStInd == rhs.inStInd)||((this.inStInd!= null)&&this.inStInd.equals(rhs.inStInd))))&&((this._1099AddrSeqno == rhs._1099AddrSeqno)||((this._1099AddrSeqno!= null)&&this._1099AddrSeqno.equals(rhs._1099AddrSeqno))))&&((this.vendCheckAddrSeqno == rhs.vendCheckAddrSeqno)||((this.vendCheckAddrSeqno!= null)&&this.vendCheckAddrSeqno.equals(rhs.vendCheckAddrSeqno))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.itypCode == rhs.itypCode)||((this.itypCode!= null)&&this.itypCode.equals(rhs.itypCode))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.pmtHoldRsnCode == rhs.pmtHoldRsnCode)||((this.pmtHoldRsnCode!= null)&&this.pmtHoldRsnCode.equals(rhs.pmtHoldRsnCode))));
    }

}
