
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
    "criteria.spridenNtypCode",
    "ftmvendVendCheckCode",
    "criteria.atypCode",
    "criteria.taxFormStatus",
    "currCode",
    "1099AddrSeqno",
    "criteria.ctryCodePhone",
    "criteria.stWholdPct",
    "vendOwner",
    "phoneNum",
    "1099AtypCode",
    "criteria.contact",
    "criteria.termDate",
    "criteria.phoneExt",
    "criteria.eprocInd",
    "effDate",
    "collectTax",
    "discCode",
    "contact",
    "criteria.fedWholdPct",
    "criteria.1099AtypCode",
    "criteria.carrierInd",
    "fedWholdPct",
    "poHoldRsnCode",
    "criteria.vendCheckAddrSeqno",
    "criteria.vendCheckAtypCode",
    "vendCheckAtypCode",
    "criteria.effDate",
    "criteria.pmtHoldRsnCode",
    "groupingInd",
    "phoneArea",
    "criteria.poHoldRsnCode",
    "termDate",
    "taxFormStatus",
    "criteria.discCode",
    "criteria.activityDate",
    "criteria.ftmvendVendCheckCode",
    "criteria.1099AddrSeqno",
    "eprocInd",
    "taxFormDate",
    "criteria.groupingInd",
    "criteria.phoneArea",
    "ctryCodePhone",
    "criteria.1099RptId",
    "stWholdPct",
    "carrierInd",
    "ftvvendVendCode",
    "criteria.inStInd",
    "criteria.vendOwner",
    "criteria.addrSeqno",
    "criteria.collectTax",
    "phoneExt",
    "1099RptId",
    "criteria.taxFormDate",
    "criteria.itypCode",
    "addrSeqno",
    "inStInd",
    "criteria.currCode",
    "vendCheckAddrSeqno",
    "spridenNtypCode",
    "itypCode",
    "atypCode",
    "pmtHoldRsnCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenance100PutRequest {

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String criteriaSpridenNtypCode;
    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftmvendVendCheckCode")
    private String ftmvendVendCheckCode;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteriaAtypCode;
    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("criteria.taxFormStatus")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_STATUS")
    private String criteriaTaxFormStatus;
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
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.stWholdPct")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ST_WHOLD_PCT")
    private Double criteriaStWholdPct;
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
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_NUMBER")
    private String phoneNum;
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
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CONTACT")
    private String criteriaContact;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_EXT")
    private String criteriaPhoneExt;
    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eprocInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_EPROC_IND")
    private String criteriaEprocInd;
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
    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.fedWholdPct")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_FED_WHOLD_PCT")
    private Double criteriaFedWholdPct;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.1099AtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteria1099AtypCode;
    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("criteria.carrierInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CARRIER_IND")
    private String criteriaCarrierInd;
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
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.vendCheckAddrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO")
    private Double criteriaVendCheckAddrSeqno;
    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.vendCheckAtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String criteriaVendCheckAtypCode;
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
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.pmtHoldRsnCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn")
    private String criteriaPmtHoldRsnCode;
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
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_AREA")
    private String phoneArea;
    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.poHoldRsnCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn")
    private String criteriaPoHoldRsnCode;
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
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("taxFormStatus")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_STATUS")
    private String taxFormStatus;
    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("criteria.discCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc")
    private String criteriaDiscCode;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ftmvendVendCheckCode")
    private String criteriaFtmvendVendCheckCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.1099AddrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_ADDR_SEQNO")
    private Double criteria1099AddrSeqno;
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
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("taxFormDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_DATE")
    private Date taxFormDate;
    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupingInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_GROUPING_IND")
    private String criteriaGroupingInd;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_PHONE_AREA")
    private String criteriaPhoneArea;
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
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.1099RptId")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_RPT_ID")
    private String criteria1099RptId;
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
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("criteria.inStInd")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_IN_ST_IND")
    private String criteriaInStInd;
    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("criteria.vendOwner")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String criteriaVendOwner;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_ADDR_SEQNO")
    private Double criteriaAddrSeqno;
    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("criteria.collectTax")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_COLLECT_TAX")
    private String criteriaCollectTax;
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
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("1099RptId")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_1099_RPT_ID")
    private String _1099RptId;
    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("criteria.taxFormDate")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_TAX_FORM_DATE")
    private Date criteriaTaxFormDate;
    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.itypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String criteriaItypCode;
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
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
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
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public String getCriteriaSpridenNtypCode() {
        return criteriaSpridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public void setCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
    }

    public VendorMaintenance100PutRequest withCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
        return this;
    }

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

    public VendorMaintenance100PutRequest withFtmvendVendCheckCode(String ftmvendVendCheckCode) {
        this.ftmvendVendCheckCode = ftmvendVendCheckCode;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public VendorMaintenance100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("criteria.taxFormStatus")
    public String getCriteriaTaxFormStatus() {
        return criteriaTaxFormStatus;
    }

    /**
     * Tax Form Status
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_STATUS
     * 
     */
    @JsonProperty("criteria.taxFormStatus")
    public void setCriteriaTaxFormStatus(String criteriaTaxFormStatus) {
        this.criteriaTaxFormStatus = criteriaTaxFormStatus;
    }

    public VendorMaintenance100PutRequest withCriteriaTaxFormStatus(String criteriaTaxFormStatus) {
        this.criteriaTaxFormStatus = criteriaTaxFormStatus;
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

    public VendorMaintenance100PutRequest withCurrCode(String currCode) {
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

    public VendorMaintenance100PutRequest with1099AddrSeqno(Double _1099AddrSeqno) {
        this._1099AddrSeqno = _1099AddrSeqno;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVVEND_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public VendorMaintenance100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.stWholdPct")
    public Double getCriteriaStWholdPct() {
        return criteriaStWholdPct;
    }

    /**
     * State Withholding
     * <p>
     * Lineage reference object : FTVVEND_ST_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.stWholdPct")
    public void setCriteriaStWholdPct(Double criteriaStWholdPct) {
        this.criteriaStWholdPct = criteriaStWholdPct;
    }

    public VendorMaintenance100PutRequest withCriteriaStWholdPct(Double criteriaStWholdPct) {
        this.criteriaStWholdPct = criteriaStWholdPct;
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

    public VendorMaintenance100PutRequest withVendOwner(String vendOwner) {
        this.vendOwner = vendOwner;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVVEND_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public VendorMaintenance100PutRequest withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public VendorMaintenance100PutRequest with1099AtypCode(String _1099AtypCode) {
        this._1099AtypCode = _1099AtypCode;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    public String getCriteriaContact() {
        return criteriaContact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVVEND_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    public void setCriteriaContact(String criteriaContact) {
        this.criteriaContact = criteriaContact;
    }

    public VendorMaintenance100PutRequest withCriteriaContact(String criteriaContact) {
        this.criteriaContact = criteriaContact;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVVEND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public VendorMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVVEND_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public VendorMaintenance100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eprocInd")
    public String getCriteriaEprocInd() {
        return criteriaEprocInd;
    }

    /**
     * E-Procurement Vendor
     * <p>
     * Lineage reference object : FTVVEND_EPROC_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.eprocInd")
    public void setCriteriaEprocInd(String criteriaEprocInd) {
        this.criteriaEprocInd = criteriaEprocInd;
    }

    public VendorMaintenance100PutRequest withCriteriaEprocInd(String criteriaEprocInd) {
        this.criteriaEprocInd = criteriaEprocInd;
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

    public VendorMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public VendorMaintenance100PutRequest withCollectTax(String collectTax) {
        this.collectTax = collectTax;
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

    public VendorMaintenance100PutRequest withDiscCode(String discCode) {
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

    public VendorMaintenance100PutRequest withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.fedWholdPct")
    public Double getCriteriaFedWholdPct() {
        return criteriaFedWholdPct;
    }

    /**
     * Federal Withholding
     * <p>
     * Lineage reference object : FTVVEND_FED_WHOLD_PCT
     * 
     */
    @JsonProperty("criteria.fedWholdPct")
    public void setCriteriaFedWholdPct(Double criteriaFedWholdPct) {
        this.criteriaFedWholdPct = criteriaFedWholdPct;
    }

    public VendorMaintenance100PutRequest withCriteriaFedWholdPct(Double criteriaFedWholdPct) {
        this.criteriaFedWholdPct = criteriaFedWholdPct;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.1099AtypCode")
    public String getCriteria1099AtypCode() {
        return criteria1099AtypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_1099_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.1099AtypCode")
    public void setCriteria1099AtypCode(String criteria1099AtypCode) {
        this.criteria1099AtypCode = criteria1099AtypCode;
    }

    public VendorMaintenance100PutRequest withCriteria1099AtypCode(String criteria1099AtypCode) {
        this.criteria1099AtypCode = criteria1099AtypCode;
        return this;
    }

    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("criteria.carrierInd")
    public String getCriteriaCarrierInd() {
        return criteriaCarrierInd;
    }

    /**
     * Carrier Type
     * <p>
     * Lineage reference object : FTVVEND_CARRIER_IND
     * 
     */
    @JsonProperty("criteria.carrierInd")
    public void setCriteriaCarrierInd(String criteriaCarrierInd) {
        this.criteriaCarrierInd = criteriaCarrierInd;
    }

    public VendorMaintenance100PutRequest withCriteriaCarrierInd(String criteriaCarrierInd) {
        this.criteriaCarrierInd = criteriaCarrierInd;
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

    public VendorMaintenance100PutRequest withFedWholdPct(Double fedWholdPct) {
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

    public VendorMaintenance100PutRequest withPoHoldRsnCode(String poHoldRsnCode) {
        this.poHoldRsnCode = poHoldRsnCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.vendCheckAddrSeqno")
    public Double getCriteriaVendCheckAddrSeqno() {
        return criteriaVendCheckAddrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.vendCheckAddrSeqno")
    public void setCriteriaVendCheckAddrSeqno(Double criteriaVendCheckAddrSeqno) {
        this.criteriaVendCheckAddrSeqno = criteriaVendCheckAddrSeqno;
    }

    public VendorMaintenance100PutRequest withCriteriaVendCheckAddrSeqno(Double criteriaVendCheckAddrSeqno) {
        this.criteriaVendCheckAddrSeqno = criteriaVendCheckAddrSeqno;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.vendCheckAtypCode")
    public String getCriteriaVendCheckAtypCode() {
        return criteriaVendCheckAtypCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : FTVVEND_VEND_CHECK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.vendCheckAtypCode")
    public void setCriteriaVendCheckAtypCode(String criteriaVendCheckAtypCode) {
        this.criteriaVendCheckAtypCode = criteriaVendCheckAtypCode;
    }

    public VendorMaintenance100PutRequest withCriteriaVendCheckAtypCode(String criteriaVendCheckAtypCode) {
        this.criteriaVendCheckAtypCode = criteriaVendCheckAtypCode;
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

    public VendorMaintenance100PutRequest withVendCheckAtypCode(String vendCheckAtypCode) {
        this.vendCheckAtypCode = vendCheckAtypCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVVEND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public VendorMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.pmtHoldRsnCode")
    public String getCriteriaPmtHoldRsnCode() {
        return criteriaPmtHoldRsnCode;
    }

    /**
     * Payment Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PMT_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.pmtHoldRsnCode")
    public void setCriteriaPmtHoldRsnCode(String criteriaPmtHoldRsnCode) {
        this.criteriaPmtHoldRsnCode = criteriaPmtHoldRsnCode;
    }

    public VendorMaintenance100PutRequest withCriteriaPmtHoldRsnCode(String criteriaPmtHoldRsnCode) {
        this.criteriaPmtHoldRsnCode = criteriaPmtHoldRsnCode;
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

    public VendorMaintenance100PutRequest withGroupingInd(String groupingInd) {
        this.groupingInd = groupingInd;
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

    public VendorMaintenance100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.poHoldRsnCode")
    public String getCriteriaPoHoldRsnCode() {
        return criteriaPoHoldRsnCode;
    }

    /**
     * Order Hold Code
     * <p>
     * Lineage reference object : FTVVEND_PO_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("criteria.poHoldRsnCode")
    public void setCriteriaPoHoldRsnCode(String criteriaPoHoldRsnCode) {
        this.criteriaPoHoldRsnCode = criteriaPoHoldRsnCode;
    }

    public VendorMaintenance100PutRequest withCriteriaPoHoldRsnCode(String criteriaPoHoldRsnCode) {
        this.criteriaPoHoldRsnCode = criteriaPoHoldRsnCode;
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

    public VendorMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public VendorMaintenance100PutRequest withTaxFormStatus(String taxFormStatus) {
        this.taxFormStatus = taxFormStatus;
        return this;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("criteria.discCode")
    public String getCriteriaDiscCode() {
        return criteriaDiscCode;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVVEND_DISC_CODE, Lookup lineage reference object : ftvdisc
     * 
     */
    @JsonProperty("criteria.discCode")
    public void setCriteriaDiscCode(String criteriaDiscCode) {
        this.criteriaDiscCode = criteriaDiscCode;
    }

    public VendorMaintenance100PutRequest withCriteriaDiscCode(String criteriaDiscCode) {
        this.criteriaDiscCode = criteriaDiscCode;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVVEND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public VendorMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ftmvendVendCheckCode")
    public String getCriteriaFtmvendVendCheckCode() {
        return criteriaFtmvendVendCheckCode;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ftmvendVendCheckCode")
    public void setCriteriaFtmvendVendCheckCode(String criteriaFtmvendVendCheckCode) {
        this.criteriaFtmvendVendCheckCode = criteriaFtmvendVendCheckCode;
    }

    public VendorMaintenance100PutRequest withCriteriaFtmvendVendCheckCode(String criteriaFtmvendVendCheckCode) {
        this.criteriaFtmvendVendCheckCode = criteriaFtmvendVendCheckCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.1099AddrSeqno")
    public Double getCriteria1099AddrSeqno() {
        return criteria1099AddrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_1099_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.1099AddrSeqno")
    public void setCriteria1099AddrSeqno(Double criteria1099AddrSeqno) {
        this.criteria1099AddrSeqno = criteria1099AddrSeqno;
    }

    public VendorMaintenance100PutRequest withCriteria1099AddrSeqno(Double criteria1099AddrSeqno) {
        this.criteria1099AddrSeqno = criteria1099AddrSeqno;
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

    public VendorMaintenance100PutRequest withEprocInd(String eprocInd) {
        this.eprocInd = eprocInd;
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

    public VendorMaintenance100PutRequest withTaxFormDate(Date taxFormDate) {
        this.taxFormDate = taxFormDate;
        return this;
    }

    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupingInd")
    public String getCriteriaGroupingInd() {
        return criteriaGroupingInd;
    }

    /**
     * Invoice Grouping
     * <p>
     * Lineage reference object : FTVVEND_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupingInd")
    public void setCriteriaGroupingInd(String criteriaGroupingInd) {
        this.criteriaGroupingInd = criteriaGroupingInd;
    }

    public VendorMaintenance100PutRequest withCriteriaGroupingInd(String criteriaGroupingInd) {
        this.criteriaGroupingInd = criteriaGroupingInd;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVVEND_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public VendorMaintenance100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
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

    public VendorMaintenance100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.1099RptId")
    public String getCriteria1099RptId() {
        return criteria1099RptId;
    }

    /**
     * Tax ID
     * <p>
     * Lineage reference object : FTVVEND_1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.1099RptId")
    public void setCriteria1099RptId(String criteria1099RptId) {
        this.criteria1099RptId = criteria1099RptId;
    }

    public VendorMaintenance100PutRequest withCriteria1099RptId(String criteria1099RptId) {
        this.criteria1099RptId = criteria1099RptId;
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

    public VendorMaintenance100PutRequest withStWholdPct(Double stWholdPct) {
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

    public VendorMaintenance100PutRequest withCarrierInd(String carrierInd) {
        this.carrierInd = carrierInd;
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

    public VendorMaintenance100PutRequest withFtvvendVendCode(Object ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
        return this;
    }

    /**
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("criteria.inStInd")
    public String getCriteriaInStInd() {
        return criteriaInStInd;
    }

    /**
     * State Indicator
     * <p>
     * Lineage reference object : FTVVEND_IN_ST_IND
     * 
     */
    @JsonProperty("criteria.inStInd")
    public void setCriteriaInStInd(String criteriaInStInd) {
        this.criteriaInStInd = criteriaInStInd;
    }

    public VendorMaintenance100PutRequest withCriteriaInStInd(String criteriaInStInd) {
        this.criteriaInStInd = criteriaInStInd;
        return this;
    }

    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("criteria.vendOwner")
    public String getCriteriaVendOwner() {
        return criteriaVendOwner;
    }

    /**
     * Owner ID
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("criteria.vendOwner")
    public void setCriteriaVendOwner(String criteriaVendOwner) {
        this.criteriaVendOwner = criteriaVendOwner;
    }

    public VendorMaintenance100PutRequest withCriteriaVendOwner(String criteriaVendOwner) {
        this.criteriaVendOwner = criteriaVendOwner;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public Double getCriteriaAddrSeqno() {
        return criteriaAddrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FTVVEND_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public void setCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
    }

    public VendorMaintenance100PutRequest withCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
        return this;
    }

    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("criteria.collectTax")
    public String getCriteriaCollectTax() {
        return criteriaCollectTax;
    }

    /**
     * Collects Taxes
     * <p>
     * Lineage reference object : FTVVEND_COLLECT_TAX
     * (Required)
     * 
     */
    @JsonProperty("criteria.collectTax")
    public void setCriteriaCollectTax(String criteriaCollectTax) {
        this.criteriaCollectTax = criteriaCollectTax;
    }

    public VendorMaintenance100PutRequest withCriteriaCollectTax(String criteriaCollectTax) {
        this.criteriaCollectTax = criteriaCollectTax;
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

    public VendorMaintenance100PutRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
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

    public VendorMaintenance100PutRequest with1099RptId(String _1099RptId) {
        this._1099RptId = _1099RptId;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("criteria.taxFormDate")
    public Date getCriteriaTaxFormDate() {
        return criteriaTaxFormDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FTVVEND_TAX_FORM_DATE
     * 
     */
    @JsonProperty("criteria.taxFormDate")
    public void setCriteriaTaxFormDate(Date criteriaTaxFormDate) {
        this.criteriaTaxFormDate = criteriaTaxFormDate;
    }

    public VendorMaintenance100PutRequest withCriteriaTaxFormDate(Date criteriaTaxFormDate) {
        this.criteriaTaxFormDate = criteriaTaxFormDate;
        return this;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.itypCode")
    public String getCriteriaItypCode() {
        return criteriaItypCode;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.itypCode")
    public void setCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
    }

    public VendorMaintenance100PutRequest withCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
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

    public VendorMaintenance100PutRequest withAddrSeqno(Double addrSeqno) {
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

    public VendorMaintenance100PutRequest withInStInd(String inStInd) {
        this.inStInd = inStInd;
        return this;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : FTVVEND_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public VendorMaintenance100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
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

    public VendorMaintenance100PutRequest withVendCheckAddrSeqno(Double vendCheckAddrSeqno) {
        this.vendCheckAddrSeqno = vendCheckAddrSeqno;
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

    public VendorMaintenance100PutRequest withSpridenNtypCode(String spridenNtypCode) {
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

    public VendorMaintenance100PutRequest withItypCode(String itypCode) {
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

    public VendorMaintenance100PutRequest withAtypCode(String atypCode) {
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

    public VendorMaintenance100PutRequest withPmtHoldRsnCode(String pmtHoldRsnCode) {
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

    public VendorMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenNtypCode");
        sb.append('=');
        sb.append(((this.criteriaSpridenNtypCode == null)?"<null>":this.criteriaSpridenNtypCode));
        sb.append(',');
        sb.append("ftmvendVendCheckCode");
        sb.append('=');
        sb.append(((this.ftmvendVendCheckCode == null)?"<null>":this.ftmvendVendCheckCode));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaTaxFormStatus");
        sb.append('=');
        sb.append(((this.criteriaTaxFormStatus == null)?"<null>":this.criteriaTaxFormStatus));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("_1099AddrSeqno");
        sb.append('=');
        sb.append(((this._1099AddrSeqno == null)?"<null>":this._1099AddrSeqno));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaStWholdPct");
        sb.append('=');
        sb.append(((this.criteriaStWholdPct == null)?"<null>":this.criteriaStWholdPct));
        sb.append(',');
        sb.append("vendOwner");
        sb.append('=');
        sb.append(((this.vendOwner == null)?"<null>":this.vendOwner));
        sb.append(',');
        sb.append("phoneNum");
        sb.append('=');
        sb.append(((this.phoneNum == null)?"<null>":this.phoneNum));
        sb.append(',');
        sb.append("_1099AtypCode");
        sb.append('=');
        sb.append(((this._1099AtypCode == null)?"<null>":this._1099AtypCode));
        sb.append(',');
        sb.append("criteriaContact");
        sb.append('=');
        sb.append(((this.criteriaContact == null)?"<null>":this.criteriaContact));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("criteriaEprocInd");
        sb.append('=');
        sb.append(((this.criteriaEprocInd == null)?"<null>":this.criteriaEprocInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("collectTax");
        sb.append('=');
        sb.append(((this.collectTax == null)?"<null>":this.collectTax));
        sb.append(',');
        sb.append("discCode");
        sb.append('=');
        sb.append(((this.discCode == null)?"<null>":this.discCode));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("criteriaFedWholdPct");
        sb.append('=');
        sb.append(((this.criteriaFedWholdPct == null)?"<null>":this.criteriaFedWholdPct));
        sb.append(',');
        sb.append("criteria1099AtypCode");
        sb.append('=');
        sb.append(((this.criteria1099AtypCode == null)?"<null>":this.criteria1099AtypCode));
        sb.append(',');
        sb.append("criteriaCarrierInd");
        sb.append('=');
        sb.append(((this.criteriaCarrierInd == null)?"<null>":this.criteriaCarrierInd));
        sb.append(',');
        sb.append("fedWholdPct");
        sb.append('=');
        sb.append(((this.fedWholdPct == null)?"<null>":this.fedWholdPct));
        sb.append(',');
        sb.append("poHoldRsnCode");
        sb.append('=');
        sb.append(((this.poHoldRsnCode == null)?"<null>":this.poHoldRsnCode));
        sb.append(',');
        sb.append("criteriaVendCheckAddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaVendCheckAddrSeqno == null)?"<null>":this.criteriaVendCheckAddrSeqno));
        sb.append(',');
        sb.append("criteriaVendCheckAtypCode");
        sb.append('=');
        sb.append(((this.criteriaVendCheckAtypCode == null)?"<null>":this.criteriaVendCheckAtypCode));
        sb.append(',');
        sb.append("vendCheckAtypCode");
        sb.append('=');
        sb.append(((this.vendCheckAtypCode == null)?"<null>":this.vendCheckAtypCode));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaPmtHoldRsnCode");
        sb.append('=');
        sb.append(((this.criteriaPmtHoldRsnCode == null)?"<null>":this.criteriaPmtHoldRsnCode));
        sb.append(',');
        sb.append("groupingInd");
        sb.append('=');
        sb.append(((this.groupingInd == null)?"<null>":this.groupingInd));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("criteriaPoHoldRsnCode");
        sb.append('=');
        sb.append(((this.criteriaPoHoldRsnCode == null)?"<null>":this.criteriaPoHoldRsnCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("taxFormStatus");
        sb.append('=');
        sb.append(((this.taxFormStatus == null)?"<null>":this.taxFormStatus));
        sb.append(',');
        sb.append("criteriaDiscCode");
        sb.append('=');
        sb.append(((this.criteriaDiscCode == null)?"<null>":this.criteriaDiscCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaFtmvendVendCheckCode");
        sb.append('=');
        sb.append(((this.criteriaFtmvendVendCheckCode == null)?"<null>":this.criteriaFtmvendVendCheckCode));
        sb.append(',');
        sb.append("criteria1099AddrSeqno");
        sb.append('=');
        sb.append(((this.criteria1099AddrSeqno == null)?"<null>":this.criteria1099AddrSeqno));
        sb.append(',');
        sb.append("eprocInd");
        sb.append('=');
        sb.append(((this.eprocInd == null)?"<null>":this.eprocInd));
        sb.append(',');
        sb.append("taxFormDate");
        sb.append('=');
        sb.append(((this.taxFormDate == null)?"<null>":this.taxFormDate));
        sb.append(',');
        sb.append("criteriaGroupingInd");
        sb.append('=');
        sb.append(((this.criteriaGroupingInd == null)?"<null>":this.criteriaGroupingInd));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("criteria1099RptId");
        sb.append('=');
        sb.append(((this.criteria1099RptId == null)?"<null>":this.criteria1099RptId));
        sb.append(',');
        sb.append("stWholdPct");
        sb.append('=');
        sb.append(((this.stWholdPct == null)?"<null>":this.stWholdPct));
        sb.append(',');
        sb.append("carrierInd");
        sb.append('=');
        sb.append(((this.carrierInd == null)?"<null>":this.carrierInd));
        sb.append(',');
        sb.append("ftvvendVendCode");
        sb.append('=');
        sb.append(((this.ftvvendVendCode == null)?"<null>":this.ftvvendVendCode));
        sb.append(',');
        sb.append("criteriaInStInd");
        sb.append('=');
        sb.append(((this.criteriaInStInd == null)?"<null>":this.criteriaInStInd));
        sb.append(',');
        sb.append("criteriaVendOwner");
        sb.append('=');
        sb.append(((this.criteriaVendOwner == null)?"<null>":this.criteriaVendOwner));
        sb.append(',');
        sb.append("criteriaAddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaAddrSeqno == null)?"<null>":this.criteriaAddrSeqno));
        sb.append(',');
        sb.append("criteriaCollectTax");
        sb.append('=');
        sb.append(((this.criteriaCollectTax == null)?"<null>":this.criteriaCollectTax));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("_1099RptId");
        sb.append('=');
        sb.append(((this._1099RptId == null)?"<null>":this._1099RptId));
        sb.append(',');
        sb.append("criteriaTaxFormDate");
        sb.append('=');
        sb.append(((this.criteriaTaxFormDate == null)?"<null>":this.criteriaTaxFormDate));
        sb.append(',');
        sb.append("criteriaItypCode");
        sb.append('=');
        sb.append(((this.criteriaItypCode == null)?"<null>":this.criteriaItypCode));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("inStInd");
        sb.append('=');
        sb.append(((this.inStInd == null)?"<null>":this.inStInd));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("vendCheckAddrSeqno");
        sb.append('=');
        sb.append(((this.vendCheckAddrSeqno == null)?"<null>":this.vendCheckAddrSeqno));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.vendOwner == null)? 0 :this.vendOwner.hashCode()));
        result = ((result* 31)+((this.phoneNum == null)? 0 :this.phoneNum.hashCode()));
        result = ((result* 31)+((this.criteriaEprocInd == null)? 0 :this.criteriaEprocInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaStWholdPct == null)? 0 :this.criteriaStWholdPct.hashCode()));
        result = ((result* 31)+((this.collectTax == null)? 0 :this.collectTax.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.criteriaCarrierInd == null)? 0 :this.criteriaCarrierInd.hashCode()));
        result = ((result* 31)+((this.criteriaPmtHoldRsnCode == null)? 0 :this.criteriaPmtHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaVendCheckAtypCode == null)? 0 :this.criteriaVendCheckAtypCode.hashCode()));
        result = ((result* 31)+((this.fedWholdPct == null)? 0 :this.fedWholdPct.hashCode()));
        result = ((result* 31)+((this.poHoldRsnCode == null)? 0 :this.poHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaGroupingInd == null)? 0 :this.criteriaGroupingInd.hashCode()));
        result = ((result* 31)+((this._1099RptId == null)? 0 :this._1099RptId.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.vendCheckAtypCode == null)? 0 :this.vendCheckAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaPoHoldRsnCode == null)? 0 :this.criteriaPoHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.groupingInd == null)? 0 :this.groupingInd.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaItypCode == null)? 0 :this.criteriaItypCode.hashCode()));
        result = ((result* 31)+((this._1099AddrSeqno == null)? 0 :this._1099AddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaTaxFormStatus == null)? 0 :this.criteriaTaxFormStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.taxFormStatus == null)? 0 :this.taxFormStatus.hashCode()));
        result = ((result* 31)+((this.criteriaFtmvendVendCheckCode == null)? 0 :this.criteriaFtmvendVendCheckCode.hashCode()));
        result = ((result* 31)+((this.criteriaFedWholdPct == null)? 0 :this.criteriaFedWholdPct.hashCode()));
        result = ((result* 31)+((this.eprocInd == null)? 0 :this.eprocInd.hashCode()));
        result = ((result* 31)+((this._1099AtypCode == null)? 0 :this._1099AtypCode.hashCode()));
        result = ((result* 31)+((this.criteria1099AtypCode == null)? 0 :this.criteria1099AtypCode.hashCode()));
        result = ((result* 31)+((this.taxFormDate == null)? 0 :this.taxFormDate.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteria1099RptId == null)? 0 :this.criteria1099RptId.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.stWholdPct == null)? 0 :this.stWholdPct.hashCode()));
        result = ((result* 31)+((this.criteriaCollectTax == null)? 0 :this.criteriaCollectTax.hashCode()));
        result = ((result* 31)+((this.carrierInd == null)? 0 :this.carrierInd.hashCode()));
        result = ((result* 31)+((this.ftvvendVendCode == null)? 0 :this.ftvvendVendCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenNtypCode == null)? 0 :this.criteriaSpridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaContact == null)? 0 :this.criteriaContact.hashCode()));
        result = ((result* 31)+((this.criteriaDiscCode == null)? 0 :this.criteriaDiscCode.hashCode()));
        result = ((result* 31)+((this.criteria1099AddrSeqno == null)? 0 :this.criteria1099AddrSeqno.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaVendOwner == null)? 0 :this.criteriaVendOwner.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaInStInd == null)? 0 :this.criteriaInStInd.hashCode()));
        result = ((result* 31)+((this.criteriaAddrSeqno == null)? 0 :this.criteriaAddrSeqno.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.inStInd == null)? 0 :this.inStInd.hashCode()));
        result = ((result* 31)+((this.vendCheckAddrSeqno == null)? 0 :this.vendCheckAddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaVendCheckAddrSeqno == null)? 0 :this.criteriaVendCheckAddrSeqno.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTaxFormDate == null)? 0 :this.criteriaTaxFormDate.hashCode()));
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
        if ((other instanceof VendorMaintenance100PutRequest) == false) {
            return false;
        }
        VendorMaintenance100PutRequest rhs = ((VendorMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.ftmvendVendCheckCode == rhs.ftmvendVendCheckCode)||((this.ftmvendVendCheckCode!= null)&&this.ftmvendVendCheckCode.equals(rhs.ftmvendVendCheckCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.vendOwner == rhs.vendOwner)||((this.vendOwner!= null)&&this.vendOwner.equals(rhs.vendOwner))))&&((this.phoneNum == rhs.phoneNum)||((this.phoneNum!= null)&&this.phoneNum.equals(rhs.phoneNum))))&&((this.criteriaEprocInd == rhs.criteriaEprocInd)||((this.criteriaEprocInd!= null)&&this.criteriaEprocInd.equals(rhs.criteriaEprocInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaStWholdPct == rhs.criteriaStWholdPct)||((this.criteriaStWholdPct!= null)&&this.criteriaStWholdPct.equals(rhs.criteriaStWholdPct))))&&((this.collectTax == rhs.collectTax)||((this.collectTax!= null)&&this.collectTax.equals(rhs.collectTax))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.criteriaCarrierInd == rhs.criteriaCarrierInd)||((this.criteriaCarrierInd!= null)&&this.criteriaCarrierInd.equals(rhs.criteriaCarrierInd))))&&((this.criteriaPmtHoldRsnCode == rhs.criteriaPmtHoldRsnCode)||((this.criteriaPmtHoldRsnCode!= null)&&this.criteriaPmtHoldRsnCode.equals(rhs.criteriaPmtHoldRsnCode))))&&((this.criteriaVendCheckAtypCode == rhs.criteriaVendCheckAtypCode)||((this.criteriaVendCheckAtypCode!= null)&&this.criteriaVendCheckAtypCode.equals(rhs.criteriaVendCheckAtypCode))))&&((this.fedWholdPct == rhs.fedWholdPct)||((this.fedWholdPct!= null)&&this.fedWholdPct.equals(rhs.fedWholdPct))))&&((this.poHoldRsnCode == rhs.poHoldRsnCode)||((this.poHoldRsnCode!= null)&&this.poHoldRsnCode.equals(rhs.poHoldRsnCode))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaGroupingInd == rhs.criteriaGroupingInd)||((this.criteriaGroupingInd!= null)&&this.criteriaGroupingInd.equals(rhs.criteriaGroupingInd))))&&((this._1099RptId == rhs._1099RptId)||((this._1099RptId!= null)&&this._1099RptId.equals(rhs._1099RptId))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.vendCheckAtypCode == rhs.vendCheckAtypCode)||((this.vendCheckAtypCode!= null)&&this.vendCheckAtypCode.equals(rhs.vendCheckAtypCode))))&&((this.criteriaPoHoldRsnCode == rhs.criteriaPoHoldRsnCode)||((this.criteriaPoHoldRsnCode!= null)&&this.criteriaPoHoldRsnCode.equals(rhs.criteriaPoHoldRsnCode))))&&((this.groupingInd == rhs.groupingInd)||((this.groupingInd!= null)&&this.groupingInd.equals(rhs.groupingInd))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.criteriaItypCode == rhs.criteriaItypCode)||((this.criteriaItypCode!= null)&&this.criteriaItypCode.equals(rhs.criteriaItypCode))))&&((this._1099AddrSeqno == rhs._1099AddrSeqno)||((this._1099AddrSeqno!= null)&&this._1099AddrSeqno.equals(rhs._1099AddrSeqno))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.criteriaTaxFormStatus == rhs.criteriaTaxFormStatus)||((this.criteriaTaxFormStatus!= null)&&this.criteriaTaxFormStatus.equals(rhs.criteriaTaxFormStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.taxFormStatus == rhs.taxFormStatus)||((this.taxFormStatus!= null)&&this.taxFormStatus.equals(rhs.taxFormStatus))))&&((this.criteriaFtmvendVendCheckCode == rhs.criteriaFtmvendVendCheckCode)||((this.criteriaFtmvendVendCheckCode!= null)&&this.criteriaFtmvendVendCheckCode.equals(rhs.criteriaFtmvendVendCheckCode))))&&((this.criteriaFedWholdPct == rhs.criteriaFedWholdPct)||((this.criteriaFedWholdPct!= null)&&this.criteriaFedWholdPct.equals(rhs.criteriaFedWholdPct))))&&((this.eprocInd == rhs.eprocInd)||((this.eprocInd!= null)&&this.eprocInd.equals(rhs.eprocInd))))&&((this._1099AtypCode == rhs._1099AtypCode)||((this._1099AtypCode!= null)&&this._1099AtypCode.equals(rhs._1099AtypCode))))&&((this.criteria1099AtypCode == rhs.criteria1099AtypCode)||((this.criteria1099AtypCode!= null)&&this.criteria1099AtypCode.equals(rhs.criteria1099AtypCode))))&&((this.taxFormDate == rhs.taxFormDate)||((this.taxFormDate!= null)&&this.taxFormDate.equals(rhs.taxFormDate))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteria1099RptId == rhs.criteria1099RptId)||((this.criteria1099RptId!= null)&&this.criteria1099RptId.equals(rhs.criteria1099RptId))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.stWholdPct == rhs.stWholdPct)||((this.stWholdPct!= null)&&this.stWholdPct.equals(rhs.stWholdPct))))&&((this.criteriaCollectTax == rhs.criteriaCollectTax)||((this.criteriaCollectTax!= null)&&this.criteriaCollectTax.equals(rhs.criteriaCollectTax))))&&((this.carrierInd == rhs.carrierInd)||((this.carrierInd!= null)&&this.carrierInd.equals(rhs.carrierInd))))&&((this.ftvvendVendCode == rhs.ftvvendVendCode)||((this.ftvvendVendCode!= null)&&this.ftvvendVendCode.equals(rhs.ftvvendVendCode))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaSpridenNtypCode == rhs.criteriaSpridenNtypCode)||((this.criteriaSpridenNtypCode!= null)&&this.criteriaSpridenNtypCode.equals(rhs.criteriaSpridenNtypCode))))&&((this.criteriaContact == rhs.criteriaContact)||((this.criteriaContact!= null)&&this.criteriaContact.equals(rhs.criteriaContact))))&&((this.criteriaDiscCode == rhs.criteriaDiscCode)||((this.criteriaDiscCode!= null)&&this.criteriaDiscCode.equals(rhs.criteriaDiscCode))))&&((this.criteria1099AddrSeqno == rhs.criteria1099AddrSeqno)||((this.criteria1099AddrSeqno!= null)&&this.criteria1099AddrSeqno.equals(rhs.criteria1099AddrSeqno))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.criteriaVendOwner == rhs.criteriaVendOwner)||((this.criteriaVendOwner!= null)&&this.criteriaVendOwner.equals(rhs.criteriaVendOwner))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaInStInd == rhs.criteriaInStInd)||((this.criteriaInStInd!= null)&&this.criteriaInStInd.equals(rhs.criteriaInStInd))))&&((this.criteriaAddrSeqno == rhs.criteriaAddrSeqno)||((this.criteriaAddrSeqno!= null)&&this.criteriaAddrSeqno.equals(rhs.criteriaAddrSeqno))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.inStInd == rhs.inStInd)||((this.inStInd!= null)&&this.inStInd.equals(rhs.inStInd))))&&((this.vendCheckAddrSeqno == rhs.vendCheckAddrSeqno)||((this.vendCheckAddrSeqno!= null)&&this.vendCheckAddrSeqno.equals(rhs.vendCheckAddrSeqno))))&&((this.criteriaVendCheckAddrSeqno == rhs.criteriaVendCheckAddrSeqno)||((this.criteriaVendCheckAddrSeqno!= null)&&this.criteriaVendCheckAddrSeqno.equals(rhs.criteriaVendCheckAddrSeqno))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.criteriaTaxFormDate == rhs.criteriaTaxFormDate)||((this.criteriaTaxFormDate!= null)&&this.criteriaTaxFormDate.equals(rhs.criteriaTaxFormDate))))&&((this.itypCode == rhs.itypCode)||((this.itypCode!= null)&&this.itypCode.equals(rhs.itypCode))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.pmtHoldRsnCode == rhs.pmtHoldRsnCode)||((this.pmtHoldRsnCode!= null)&&this.pmtHoldRsnCode.equals(rhs.pmtHoldRsnCode))));
    }

}
