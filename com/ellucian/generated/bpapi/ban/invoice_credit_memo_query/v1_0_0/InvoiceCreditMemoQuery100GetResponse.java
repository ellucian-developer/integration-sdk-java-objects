
package com.ellucian.generated.bpapi.ban.invoice_credit_memo_query.v1_0_0;

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
    "atypSeqNumVend",
    "headerTextInd",
    "currCode",
    "disbAgentInd",
    "tgrpCode",
    "vendorNatnCode",
    "vendHoldOvrdUser",
    "collectsTaxes",
    "currCodeDesc",
    "directDepositStatus",
    "page2City",
    "vendHoldOvrdInd",
    "apprInd",
    "discCode",
    "singleAcctgInd",
    "page2VendAddr3",
    "completeInd",
    "originCode",
    "page2VendAddr1",
    "page2VendAddr2",
    "nsfOnOffInd",
    "correctionDigit",
    "zip",
    "deliveryPoint",
    "collectsTaxesTitle",
    "ruivInd",
    "vendInvCode",
    "1099Id",
    "ruivInstallmentInd",
    "page2NsfSuspInd",
    "groupingInd",
    "vendCheckName",
    "editDeferInd",
    "holdInd",
    "openPaidInd",
    "atypSeqNum",
    "page3CurrCode",
    "suspInd",
    "itypDesc",
    "page6CurrCode",
    "cancelDate",
    "matchDescription",
    "city",
    "carrierRoute",
    "taxDesc",
    "activityDate",
    "page2State",
    "1099Ind",
    "transDate",
    "collectTaxes",
    "iatInd",
    "faainvhStatCode",
    "crMemoInd",
    "pmtDueDate",
    "bankCode",
    "cancelInd",
    "nationName",
    "page2ZipCode",
    "vendorNatnName",
    "atypCodeVend",
    "invoiceDate",
    "userId",
    "achtCode",
    "faainvhVendCheckCode",
    "addrLine3",
    "addrLine2",
    "addrLine1",
    "page4CurrCode",
    "spraddrNatnCode",
    "overrideTaxAmt",
    "achOverrideInd",
    "itypCode",
    "atypCode",
    "headerBankName"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemoQuery100GetResponse {

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM_VEND
     * 
     */
    @JsonProperty("atypSeqNumVend")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ATYP_SEQ_NUM_VEND")
    private Double atypSeqNumVend;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    private String headerTextInd;
    /**
     * Currency
     * <p>
     * Lineage reference object : FABINVH_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CURR_CODE")
    private String currCode;
    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FABINVH_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_DISB_AGENT_IND")
    private String disbAgentInd;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FABINVH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_TGRP_CODE")
    private String tgrpCode;
    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("vendorNatnCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvnatn")
    private String vendorNatnCode;
    /**
     * Vendor Hold Override User ID
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_USER
     * 
     */
    @JsonProperty("vendHoldOvrdUser")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_HOLD_OVRD_USER")
    private String vendHoldOvrdUser;
    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("collectsTaxes")
    private String collectsTaxes;
    @JsonProperty("currCodeDesc")
    private String currCodeDesc;
    /**
     * Direct Deposit Status
     * <p>
     * 
     * 
     */
    @JsonProperty("directDepositStatus")
    private String directDepositStatus;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("page2City")
    private String page2City;
    /**
     * Vendor Hold Override
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("vendHoldOvrdInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_HOLD_OVRD_IND")
    private String vendHoldOvrdInd;
    /**
     * Approved
     * <p>
     * Lineage reference object : FABINVH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_APPR_IND")
    private String apprInd;
    /**
     * Discount Code
     * <p>
     * Lineage reference object : FABINVH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_DISC_CODE")
    private String discCode;
    /**
     * Document  Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_SINGLE_ACCTG_IND")
    private String singleAcctgInd;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr3")
    private String page2VendAddr3;
    /**
     * Complete
     * <p>
     * Lineage reference object : FABINVH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_COMPLETE_IND")
    private String completeInd;
    /**
     * Origin Code
     * <p>
     * Lineage reference object : FABINVH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ORIGIN_CODE")
    private String originCode;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr1")
    private String page2VendAddr1;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr2")
    private String page2VendAddr2;
    /**
     * NSF On/Off
     * <p>
     * Lineage reference object : FABINVH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FABINVH_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CORRECTION_DIGIT")
    private Double correctionDigit;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    private String zip;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FABINVH_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : FABINVH_DELIVERY_POINT")
    private Double deliveryPoint;
    @JsonProperty("collectsTaxesTitle")
    private String collectsTaxesTitle;
    /**
     * Recurring
     * <p>
     * Lineage reference object : FABINVH_RUIV_IND
     * 
     */
    @JsonProperty("ruivInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_RUIV_IND")
    private String ruivInd;
    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("vendInvCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_INV_CODE")
    private String vendInvCode;
    /**
     *  1099 Tax ID
     * <p>
     * Lineage reference object : FABINVH_1099_ID
     * 
     */
    @JsonProperty("1099Id")
    @JsonPropertyDescription("Lineage reference object : FABINVH_1099_ID")
    private String _1099Id;
    /**
     * Installment
     * <p>
     * Lineage reference object : FABINVH_RUIV_INSTALLMENT_IND
     * 
     */
    @JsonProperty("ruivInstallmentInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_RUIV_INSTALLMENT_IND")
    private String ruivInstallmentInd;
    /**
     * NSF Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page2NsfSuspInd")
    private String page2NsfSuspInd;
    /**
     * Grouping
     * <p>
     * Lineage reference object : FABINVH_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_GROUPING_IND")
    private String groupingInd;
    @JsonProperty("vendCheckName")
    private String vendCheckName;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FABINVH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Invoice Hold
     * <p>
     * Lineage reference object : FABINVH_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_HOLD_IND")
    private String holdInd;
    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FABINVH_OPEN_PAID_IND
     * 
     */
    @JsonProperty("openPaidInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_OPEN_PAID_IND")
    private String openPaidInd;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ATYP_SEQ_NUM")
    private Double atypSeqNum;
    @JsonProperty("page3CurrCode")
    private String page3CurrCode;
    /**
     * Suspense
     * <p>
     * Lineage reference object : FABINVH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_SUSP_IND")
    private String suspInd;
    @JsonProperty("itypDesc")
    private String itypDesc;
    @JsonProperty("page6CurrCode")
    private String page6CurrCode;
    /**
     * Cancel
     * <p>
     * Lineage reference object : FABINVH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CANCEL_DATE")
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
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FABINVH_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CARRIER_ROUTE")
    private String carrierRoute;
    @JsonProperty("taxDesc")
    private String taxDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("page2State")
    private String page2State;
    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("1099Ind")
    @JsonPropertyDescription("Lineage reference object : FABINVH_1099_IND")
    private String _1099Ind;
    /**
     * Transaction
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_TRANS_DATE")
    private Date transDate;
    /**
     * Collects Taxes
     * <p>
     * 
     * 
     */
    @JsonProperty("collectTaxes")
    private String collectTaxes;
    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    private String iatInd;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhStatCode")
    private String faainvhStatCode;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String crMemoInd;
    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("pmtDueDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_PMT_DUE_DATE")
    private Date pmtDueDate;
    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_BANK_CODE")
    private String bankCode;
    /**
     * Cancelled
     * <p>
     * Lineage reference object : FABINVH_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CANCEL_IND")
    private String cancelInd;
    @JsonProperty("nationName")
    private String nationName;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("page2ZipCode")
    private String page2ZipCode;
    @JsonProperty("vendorNatnName")
    private String vendorNatnName;
    /**
     * Type
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE_VEND
     * 
     */
    @JsonProperty("atypCodeVend")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ATYP_CODE_VEND")
    private String atypCodeVend;
    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * 
     */
    @JsonProperty("invoiceDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_INVOICE_DATE")
    private Date invoiceDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FABINVH_USER_ID")
    private String userId;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACHT_CODE")
    private String achtCode;
    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhVendCheckCode")
    private String faainvhVendCheckCode;
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
    @JsonProperty("page4CurrCode")
    private String page4CurrCode;
    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvnatn")
    private String spraddrNatnCode;
    /**
     * Override Tax Amount
     * <p>
     * Lineage reference object : FABINVH_OVERRIDE_TAX_AMT
     * 
     */
    @JsonProperty("overrideTaxAmt")
    @JsonPropertyDescription("Lineage reference object : FABINVH_OVERRIDE_TAX_AMT")
    private Double overrideTaxAmt;
    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACH_OVERRIDE_IND")
    private String achOverrideInd;
    /**
     * Income Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypCode")
    private String itypCode;
    /**
     * Address Code
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonProperty("headerBankName")
    private String headerBankName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM_VEND
     * 
     */
    @JsonProperty("atypSeqNumVend")
    public Double getAtypSeqNumVend() {
        return atypSeqNumVend;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM_VEND
     * 
     */
    @JsonProperty("atypSeqNumVend")
    public void setAtypSeqNumVend(Double atypSeqNumVend) {
        this.atypSeqNumVend = atypSeqNumVend;
    }

    public InvoiceCreditMemoQuery100GetResponse withAtypSeqNumVend(Double atypSeqNumVend) {
        this.atypSeqNumVend = atypSeqNumVend;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    public String getHeaderTextInd() {
        return headerTextInd;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    public void setHeaderTextInd(String headerTextInd) {
        this.headerTextInd = headerTextInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withHeaderTextInd(String headerTextInd) {
        this.headerTextInd = headerTextInd;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FABINVH_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FABINVH_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FABINVH_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    public String getDisbAgentInd() {
        return disbAgentInd;
    }

    /**
     * Disbursing Agent
     * <p>
     * Lineage reference object : FABINVH_DISB_AGENT_IND
     * 
     */
    @JsonProperty("disbAgentInd")
    public void setDisbAgentInd(String disbAgentInd) {
        this.disbAgentInd = disbAgentInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withDisbAgentInd(String disbAgentInd) {
        this.disbAgentInd = disbAgentInd;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FABINVH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FABINVH_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("vendorNatnCode")
    public String getVendorNatnCode() {
        return vendorNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("vendorNatnCode")
    public void setVendorNatnCode(String vendorNatnCode) {
        this.vendorNatnCode = vendorNatnCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withVendorNatnCode(String vendorNatnCode) {
        this.vendorNatnCode = vendorNatnCode;
        return this;
    }

    /**
     * Vendor Hold Override User ID
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_USER
     * 
     */
    @JsonProperty("vendHoldOvrdUser")
    public String getVendHoldOvrdUser() {
        return vendHoldOvrdUser;
    }

    /**
     * Vendor Hold Override User ID
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_USER
     * 
     */
    @JsonProperty("vendHoldOvrdUser")
    public void setVendHoldOvrdUser(String vendHoldOvrdUser) {
        this.vendHoldOvrdUser = vendHoldOvrdUser;
    }

    public InvoiceCreditMemoQuery100GetResponse withVendHoldOvrdUser(String vendHoldOvrdUser) {
        this.vendHoldOvrdUser = vendHoldOvrdUser;
        return this;
    }

    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("collectsTaxes")
    public String getCollectsTaxes() {
        return collectsTaxes;
    }

    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("collectsTaxes")
    public void setCollectsTaxes(String collectsTaxes) {
        this.collectsTaxes = collectsTaxes;
    }

    public InvoiceCreditMemoQuery100GetResponse withCollectsTaxes(String collectsTaxes) {
        this.collectsTaxes = collectsTaxes;
        return this;
    }

    @JsonProperty("currCodeDesc")
    public String getCurrCodeDesc() {
        return currCodeDesc;
    }

    @JsonProperty("currCodeDesc")
    public void setCurrCodeDesc(String currCodeDesc) {
        this.currCodeDesc = currCodeDesc;
    }

    public InvoiceCreditMemoQuery100GetResponse withCurrCodeDesc(String currCodeDesc) {
        this.currCodeDesc = currCodeDesc;
        return this;
    }

    /**
     * Direct Deposit Status
     * <p>
     * 
     * 
     */
    @JsonProperty("directDepositStatus")
    public String getDirectDepositStatus() {
        return directDepositStatus;
    }

    /**
     * Direct Deposit Status
     * <p>
     * 
     * 
     */
    @JsonProperty("directDepositStatus")
    public void setDirectDepositStatus(String directDepositStatus) {
        this.directDepositStatus = directDepositStatus;
    }

    public InvoiceCreditMemoQuery100GetResponse withDirectDepositStatus(String directDepositStatus) {
        this.directDepositStatus = directDepositStatus;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("page2City")
    public String getPage2City() {
        return page2City;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("page2City")
    public void setPage2City(String page2City) {
        this.page2City = page2City;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2City(String page2City) {
        this.page2City = page2City;
        return this;
    }

    /**
     * Vendor Hold Override
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("vendHoldOvrdInd")
    public String getVendHoldOvrdInd() {
        return vendHoldOvrdInd;
    }

    /**
     * Vendor Hold Override
     * <p>
     * Lineage reference object : FABINVH_VEND_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("vendHoldOvrdInd")
    public void setVendHoldOvrdInd(String vendHoldOvrdInd) {
        this.vendHoldOvrdInd = vendHoldOvrdInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withVendHoldOvrdInd(String vendHoldOvrdInd) {
        this.vendHoldOvrdInd = vendHoldOvrdInd;
        return this;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FABINVH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FABINVH_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withApprInd(String apprInd) {
        this.apprInd = apprInd;
        return this;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FABINVH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    public String getDiscCode() {
        return discCode;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FABINVH_DISC_CODE
     * 
     */
    @JsonProperty("discCode")
    public void setDiscCode(String discCode) {
        this.discCode = discCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withDiscCode(String discCode) {
        this.discCode = discCode;
        return this;
    }

    /**
     * Document  Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public String getSingleAcctgInd() {
        return singleAcctgInd;
    }

    /**
     * Document  Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public void setSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr3")
    public String getPage2VendAddr3() {
        return page2VendAddr3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr3")
    public void setPage2VendAddr3(String page2VendAddr3) {
        this.page2VendAddr3 = page2VendAddr3;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2VendAddr3(String page2VendAddr3) {
        this.page2VendAddr3 = page2VendAddr3;
        return this;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FABINVH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public String getCompleteInd() {
        return completeInd;
    }

    /**
     * Complete
     * <p>
     * Lineage reference object : FABINVH_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public void setCompleteInd(String completeInd) {
        this.completeInd = completeInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withCompleteInd(String completeInd) {
        this.completeInd = completeInd;
        return this;
    }

    /**
     * Origin Code
     * <p>
     * Lineage reference object : FABINVH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Origin Code
     * <p>
     * Lineage reference object : FABINVH_ORIGIN_CODE
     * 
     */
    @JsonProperty("originCode")
    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withOriginCode(String originCode) {
        this.originCode = originCode;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr1")
    public String getPage2VendAddr1() {
        return page2VendAddr1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr1")
    public void setPage2VendAddr1(String page2VendAddr1) {
        this.page2VendAddr1 = page2VendAddr1;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2VendAddr1(String page2VendAddr1) {
        this.page2VendAddr1 = page2VendAddr1;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr2")
    public String getPage2VendAddr2() {
        return page2VendAddr2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("page2VendAddr2")
    public void setPage2VendAddr2(String page2VendAddr2) {
        this.page2VendAddr2 = page2VendAddr2;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2VendAddr2(String page2VendAddr2) {
        this.page2VendAddr2 = page2VendAddr2;
        return this;
    }

    /**
     * NSF On/Off
     * <p>
     * Lineage reference object : FABINVH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF On/Off
     * <p>
     * Lineage reference object : FABINVH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FABINVH_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public Double getCorrectionDigit() {
        return correctionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : FABINVH_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("correctionDigit")
    public void setCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
    }

    public InvoiceCreditMemoQuery100GetResponse withCorrectionDigit(Double correctionDigit) {
        this.correctionDigit = correctionDigit;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public InvoiceCreditMemoQuery100GetResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FABINVH_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public Double getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : FABINVH_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public void setDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public InvoiceCreditMemoQuery100GetResponse withDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
        return this;
    }

    @JsonProperty("collectsTaxesTitle")
    public String getCollectsTaxesTitle() {
        return collectsTaxesTitle;
    }

    @JsonProperty("collectsTaxesTitle")
    public void setCollectsTaxesTitle(String collectsTaxesTitle) {
        this.collectsTaxesTitle = collectsTaxesTitle;
    }

    public InvoiceCreditMemoQuery100GetResponse withCollectsTaxesTitle(String collectsTaxesTitle) {
        this.collectsTaxesTitle = collectsTaxesTitle;
        return this;
    }

    /**
     * Recurring
     * <p>
     * Lineage reference object : FABINVH_RUIV_IND
     * 
     */
    @JsonProperty("ruivInd")
    public String getRuivInd() {
        return ruivInd;
    }

    /**
     * Recurring
     * <p>
     * Lineage reference object : FABINVH_RUIV_IND
     * 
     */
    @JsonProperty("ruivInd")
    public void setRuivInd(String ruivInd) {
        this.ruivInd = ruivInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withRuivInd(String ruivInd) {
        this.ruivInd = ruivInd;
        return this;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("vendInvCode")
    public String getVendInvCode() {
        return vendInvCode;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("vendInvCode")
    public void setVendInvCode(String vendInvCode) {
        this.vendInvCode = vendInvCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withVendInvCode(String vendInvCode) {
        this.vendInvCode = vendInvCode;
        return this;
    }

    /**
     *  1099 Tax ID
     * <p>
     * Lineage reference object : FABINVH_1099_ID
     * 
     */
    @JsonProperty("1099Id")
    public String get1099Id() {
        return _1099Id;
    }

    /**
     *  1099 Tax ID
     * <p>
     * Lineage reference object : FABINVH_1099_ID
     * 
     */
    @JsonProperty("1099Id")
    public void set1099Id(String _1099Id) {
        this._1099Id = _1099Id;
    }

    public InvoiceCreditMemoQuery100GetResponse with1099Id(String _1099Id) {
        this._1099Id = _1099Id;
        return this;
    }

    /**
     * Installment
     * <p>
     * Lineage reference object : FABINVH_RUIV_INSTALLMENT_IND
     * 
     */
    @JsonProperty("ruivInstallmentInd")
    public String getRuivInstallmentInd() {
        return ruivInstallmentInd;
    }

    /**
     * Installment
     * <p>
     * Lineage reference object : FABINVH_RUIV_INSTALLMENT_IND
     * 
     */
    @JsonProperty("ruivInstallmentInd")
    public void setRuivInstallmentInd(String ruivInstallmentInd) {
        this.ruivInstallmentInd = ruivInstallmentInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withRuivInstallmentInd(String ruivInstallmentInd) {
        this.ruivInstallmentInd = ruivInstallmentInd;
        return this;
    }

    /**
     * NSF Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page2NsfSuspInd")
    public String getPage2NsfSuspInd() {
        return page2NsfSuspInd;
    }

    /**
     * NSF Suspense
     * <p>
     * 
     * 
     */
    @JsonProperty("page2NsfSuspInd")
    public void setPage2NsfSuspInd(String page2NsfSuspInd) {
        this.page2NsfSuspInd = page2NsfSuspInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2NsfSuspInd(String page2NsfSuspInd) {
        this.page2NsfSuspInd = page2NsfSuspInd;
        return this;
    }

    /**
     * Grouping
     * <p>
     * Lineage reference object : FABINVH_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    public String getGroupingInd() {
        return groupingInd;
    }

    /**
     * Grouping
     * <p>
     * Lineage reference object : FABINVH_GROUPING_IND
     * (Required)
     * 
     */
    @JsonProperty("groupingInd")
    public void setGroupingInd(String groupingInd) {
        this.groupingInd = groupingInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withGroupingInd(String groupingInd) {
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

    public InvoiceCreditMemoQuery100GetResponse withVendCheckName(String vendCheckName) {
        this.vendCheckName = vendCheckName;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FABINVH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FABINVH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Invoice Hold
     * <p>
     * Lineage reference object : FABINVH_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    public String getHoldInd() {
        return holdInd;
    }

    /**
     * Invoice Hold
     * <p>
     * Lineage reference object : FABINVH_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    public void setHoldInd(String holdInd) {
        this.holdInd = holdInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withHoldInd(String holdInd) {
        this.holdInd = holdInd;
        return this;
    }

    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FABINVH_OPEN_PAID_IND
     * 
     */
    @JsonProperty("openPaidInd")
    public String getOpenPaidInd() {
        return openPaidInd;
    }

    /**
     * Open/Paid
     * <p>
     * Lineage reference object : FABINVH_OPEN_PAID_IND
     * 
     */
    @JsonProperty("openPaidInd")
    public void setOpenPaidInd(String openPaidInd) {
        this.openPaidInd = openPaidInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withOpenPaidInd(String openPaidInd) {
        this.openPaidInd = openPaidInd;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public Double getAtypSeqNum() {
        return atypSeqNum;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FABINVH_ATYP_SEQ_NUM
     * 
     */
    @JsonProperty("atypSeqNum")
    public void setAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
    }

    public InvoiceCreditMemoQuery100GetResponse withAtypSeqNum(Double atypSeqNum) {
        this.atypSeqNum = atypSeqNum;
        return this;
    }

    @JsonProperty("page3CurrCode")
    public String getPage3CurrCode() {
        return page3CurrCode;
    }

    @JsonProperty("page3CurrCode")
    public void setPage3CurrCode(String page3CurrCode) {
        this.page3CurrCode = page3CurrCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage3CurrCode(String page3CurrCode) {
        this.page3CurrCode = page3CurrCode;
        return this;
    }

    /**
     * Suspense
     * <p>
     * Lineage reference object : FABINVH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    public String getSuspInd() {
        return suspInd;
    }

    /**
     * Suspense
     * <p>
     * Lineage reference object : FABINVH_SUSP_IND
     * 
     */
    @JsonProperty("suspInd")
    public void setSuspInd(String suspInd) {
        this.suspInd = suspInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withSuspInd(String suspInd) {
        this.suspInd = suspInd;
        return this;
    }

    @JsonProperty("itypDesc")
    public String getItypDesc() {
        return itypDesc;
    }

    @JsonProperty("itypDesc")
    public void setItypDesc(String itypDesc) {
        this.itypDesc = itypDesc;
    }

    public InvoiceCreditMemoQuery100GetResponse withItypDesc(String itypDesc) {
        this.itypDesc = itypDesc;
        return this;
    }

    @JsonProperty("page6CurrCode")
    public String getPage6CurrCode() {
        return page6CurrCode;
    }

    @JsonProperty("page6CurrCode")
    public void setPage6CurrCode(String page6CurrCode) {
        this.page6CurrCode = page6CurrCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage6CurrCode(String page6CurrCode) {
        this.page6CurrCode = page6CurrCode;
        return this;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : FABINVH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : FABINVH_CANCEL_DATE
     * 
     */
    @JsonProperty("cancelDate")
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public InvoiceCreditMemoQuery100GetResponse withCancelDate(Date cancelDate) {
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

    public InvoiceCreditMemoQuery100GetResponse withMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
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

    public InvoiceCreditMemoQuery100GetResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FABINVH_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : FABINVH_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public InvoiceCreditMemoQuery100GetResponse withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
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

    public InvoiceCreditMemoQuery100GetResponse withTaxDesc(String taxDesc) {
        this.taxDesc = taxDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InvoiceCreditMemoQuery100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("page2State")
    public String getPage2State() {
        return page2State;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("page2State")
    public void setPage2State(String page2State) {
        this.page2State = page2State;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2State(String page2State) {
        this.page2State = page2State;
        return this;
    }

    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("1099Ind")
    public String get1099Ind() {
        return _1099Ind;
    }

    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("1099Ind")
    public void set1099Ind(String _1099Ind) {
        this._1099Ind = _1099Ind;
    }

    public InvoiceCreditMemoQuery100GetResponse with1099Ind(String _1099Ind) {
        this._1099Ind = _1099Ind;
        return this;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public InvoiceCreditMemoQuery100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Collects Taxes
     * <p>
     * 
     * 
     */
    @JsonProperty("collectTaxes")
    public String getCollectTaxes() {
        return collectTaxes;
    }

    /**
     * Collects Taxes
     * <p>
     * 
     * 
     */
    @JsonProperty("collectTaxes")
    public void setCollectTaxes(String collectTaxes) {
        this.collectTaxes = collectTaxes;
    }

    public InvoiceCreditMemoQuery100GetResponse withCollectTaxes(String collectTaxes) {
        this.collectTaxes = collectTaxes;
        return this;
    }

    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    public String getIatInd() {
        return iatInd;
    }

    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    public void setIatInd(String iatInd) {
        this.iatInd = iatInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withIatInd(String iatInd) {
        this.iatInd = iatInd;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhStatCode")
    public String getFaainvhStatCode() {
        return faainvhStatCode;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhStatCode")
    public void setFaainvhStatCode(String faainvhStatCode) {
        this.faainvhStatCode = faainvhStatCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withFaainvhStatCode(String faainvhStatCode) {
        this.faainvhStatCode = faainvhStatCode;
        return this;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    public String getCrMemoInd() {
        return crMemoInd;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    public void setCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
        return this;
    }

    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("pmtDueDate")
    public Date getPmtDueDate() {
        return pmtDueDate;
    }

    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("pmtDueDate")
    public void setPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
    }

    public InvoiceCreditMemoQuery100GetResponse withPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Cancelled
     * <p>
     * Lineage reference object : FABINVH_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public String getCancelInd() {
        return cancelInd;
    }

    /**
     * Cancelled
     * <p>
     * Lineage reference object : FABINVH_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public void setCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
        return this;
    }

    @JsonProperty("nationName")
    public String getNationName() {
        return nationName;
    }

    @JsonProperty("nationName")
    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public InvoiceCreditMemoQuery100GetResponse withNationName(String nationName) {
        this.nationName = nationName;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("page2ZipCode")
    public String getPage2ZipCode() {
        return page2ZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("page2ZipCode")
    public void setPage2ZipCode(String page2ZipCode) {
        this.page2ZipCode = page2ZipCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage2ZipCode(String page2ZipCode) {
        this.page2ZipCode = page2ZipCode;
        return this;
    }

    @JsonProperty("vendorNatnName")
    public String getVendorNatnName() {
        return vendorNatnName;
    }

    @JsonProperty("vendorNatnName")
    public void setVendorNatnName(String vendorNatnName) {
        this.vendorNatnName = vendorNatnName;
    }

    public InvoiceCreditMemoQuery100GetResponse withVendorNatnName(String vendorNatnName) {
        this.vendorNatnName = vendorNatnName;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE_VEND
     * 
     */
    @JsonProperty("atypCodeVend")
    public String getAtypCodeVend() {
        return atypCodeVend;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE_VEND
     * 
     */
    @JsonProperty("atypCodeVend")
    public void setAtypCodeVend(String atypCodeVend) {
        this.atypCodeVend = atypCodeVend;
    }

    public InvoiceCreditMemoQuery100GetResponse withAtypCodeVend(String atypCodeVend) {
        this.atypCodeVend = atypCodeVend;
        return this;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * 
     */
    @JsonProperty("invoiceDate")
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * 
     */
    @JsonProperty("invoiceDate")
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public InvoiceCreditMemoQuery100GetResponse withInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InvoiceCreditMemoQuery100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public String getAchtCode() {
        return achtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public void setAchtCode(String achtCode) {
        this.achtCode = achtCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withAchtCode(String achtCode) {
        this.achtCode = achtCode;
        return this;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhVendCheckCode")
    public String getFaainvhVendCheckCode() {
        return faainvhVendCheckCode;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhVendCheckCode")
    public void setFaainvhVendCheckCode(String faainvhVendCheckCode) {
        this.faainvhVendCheckCode = faainvhVendCheckCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withFaainvhVendCheckCode(String faainvhVendCheckCode) {
        this.faainvhVendCheckCode = faainvhVendCheckCode;
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

    public InvoiceCreditMemoQuery100GetResponse withAddrLine3(String addrLine3) {
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

    public InvoiceCreditMemoQuery100GetResponse withAddrLine2(String addrLine2) {
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

    public InvoiceCreditMemoQuery100GetResponse withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
        return this;
    }

    @JsonProperty("page4CurrCode")
    public String getPage4CurrCode() {
        return page4CurrCode;
    }

    @JsonProperty("page4CurrCode")
    public void setPage4CurrCode(String page4CurrCode) {
        this.page4CurrCode = page4CurrCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withPage4CurrCode(String page4CurrCode) {
        this.page4CurrCode = page4CurrCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    public String getSpraddrNatnCode() {
        return spraddrNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("spraddrNatnCode")
    public void setSpraddrNatnCode(String spraddrNatnCode) {
        this.spraddrNatnCode = spraddrNatnCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withSpraddrNatnCode(String spraddrNatnCode) {
        this.spraddrNatnCode = spraddrNatnCode;
        return this;
    }

    /**
     * Override Tax Amount
     * <p>
     * Lineage reference object : FABINVH_OVERRIDE_TAX_AMT
     * 
     */
    @JsonProperty("overrideTaxAmt")
    public Double getOverrideTaxAmt() {
        return overrideTaxAmt;
    }

    /**
     * Override Tax Amount
     * <p>
     * Lineage reference object : FABINVH_OVERRIDE_TAX_AMT
     * 
     */
    @JsonProperty("overrideTaxAmt")
    public void setOverrideTaxAmt(Double overrideTaxAmt) {
        this.overrideTaxAmt = overrideTaxAmt;
    }

    public InvoiceCreditMemoQuery100GetResponse withOverrideTaxAmt(Double overrideTaxAmt) {
        this.overrideTaxAmt = overrideTaxAmt;
        return this;
    }

    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    public String getAchOverrideInd() {
        return achOverrideInd;
    }

    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    public void setAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
    }

    public InvoiceCreditMemoQuery100GetResponse withAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
        return this;
    }

    /**
     * Income Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypCode")
    public String getItypCode() {
        return itypCode;
    }

    /**
     * Income Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypCode")
    public void setItypCode(String itypCode) {
        this.itypCode = itypCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withItypCode(String itypCode) {
        this.itypCode = itypCode;
        return this;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Code
     * <p>
     * Lineage reference object : FABINVH_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public InvoiceCreditMemoQuery100GetResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    @JsonProperty("headerBankName")
    public String getHeaderBankName() {
        return headerBankName;
    }

    @JsonProperty("headerBankName")
    public void setHeaderBankName(String headerBankName) {
        this.headerBankName = headerBankName;
    }

    public InvoiceCreditMemoQuery100GetResponse withHeaderBankName(String headerBankName) {
        this.headerBankName = headerBankName;
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

    public InvoiceCreditMemoQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemoQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("atypSeqNumVend");
        sb.append('=');
        sb.append(((this.atypSeqNumVend == null)?"<null>":this.atypSeqNumVend));
        sb.append(',');
        sb.append("headerTextInd");
        sb.append('=');
        sb.append(((this.headerTextInd == null)?"<null>":this.headerTextInd));
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
        sb.append("vendorNatnCode");
        sb.append('=');
        sb.append(((this.vendorNatnCode == null)?"<null>":this.vendorNatnCode));
        sb.append(',');
        sb.append("vendHoldOvrdUser");
        sb.append('=');
        sb.append(((this.vendHoldOvrdUser == null)?"<null>":this.vendHoldOvrdUser));
        sb.append(',');
        sb.append("collectsTaxes");
        sb.append('=');
        sb.append(((this.collectsTaxes == null)?"<null>":this.collectsTaxes));
        sb.append(',');
        sb.append("currCodeDesc");
        sb.append('=');
        sb.append(((this.currCodeDesc == null)?"<null>":this.currCodeDesc));
        sb.append(',');
        sb.append("directDepositStatus");
        sb.append('=');
        sb.append(((this.directDepositStatus == null)?"<null>":this.directDepositStatus));
        sb.append(',');
        sb.append("page2City");
        sb.append('=');
        sb.append(((this.page2City == null)?"<null>":this.page2City));
        sb.append(',');
        sb.append("vendHoldOvrdInd");
        sb.append('=');
        sb.append(((this.vendHoldOvrdInd == null)?"<null>":this.vendHoldOvrdInd));
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
        sb.append("page2VendAddr3");
        sb.append('=');
        sb.append(((this.page2VendAddr3 == null)?"<null>":this.page2VendAddr3));
        sb.append(',');
        sb.append("completeInd");
        sb.append('=');
        sb.append(((this.completeInd == null)?"<null>":this.completeInd));
        sb.append(',');
        sb.append("originCode");
        sb.append('=');
        sb.append(((this.originCode == null)?"<null>":this.originCode));
        sb.append(',');
        sb.append("page2VendAddr1");
        sb.append('=');
        sb.append(((this.page2VendAddr1 == null)?"<null>":this.page2VendAddr1));
        sb.append(',');
        sb.append("page2VendAddr2");
        sb.append('=');
        sb.append(((this.page2VendAddr2 == null)?"<null>":this.page2VendAddr2));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("correctionDigit");
        sb.append('=');
        sb.append(((this.correctionDigit == null)?"<null>":this.correctionDigit));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("deliveryPoint");
        sb.append('=');
        sb.append(((this.deliveryPoint == null)?"<null>":this.deliveryPoint));
        sb.append(',');
        sb.append("collectsTaxesTitle");
        sb.append('=');
        sb.append(((this.collectsTaxesTitle == null)?"<null>":this.collectsTaxesTitle));
        sb.append(',');
        sb.append("ruivInd");
        sb.append('=');
        sb.append(((this.ruivInd == null)?"<null>":this.ruivInd));
        sb.append(',');
        sb.append("vendInvCode");
        sb.append('=');
        sb.append(((this.vendInvCode == null)?"<null>":this.vendInvCode));
        sb.append(',');
        sb.append("_1099Id");
        sb.append('=');
        sb.append(((this._1099Id == null)?"<null>":this._1099Id));
        sb.append(',');
        sb.append("ruivInstallmentInd");
        sb.append('=');
        sb.append(((this.ruivInstallmentInd == null)?"<null>":this.ruivInstallmentInd));
        sb.append(',');
        sb.append("page2NsfSuspInd");
        sb.append('=');
        sb.append(((this.page2NsfSuspInd == null)?"<null>":this.page2NsfSuspInd));
        sb.append(',');
        sb.append("groupingInd");
        sb.append('=');
        sb.append(((this.groupingInd == null)?"<null>":this.groupingInd));
        sb.append(',');
        sb.append("vendCheckName");
        sb.append('=');
        sb.append(((this.vendCheckName == null)?"<null>":this.vendCheckName));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("holdInd");
        sb.append('=');
        sb.append(((this.holdInd == null)?"<null>":this.holdInd));
        sb.append(',');
        sb.append("openPaidInd");
        sb.append('=');
        sb.append(((this.openPaidInd == null)?"<null>":this.openPaidInd));
        sb.append(',');
        sb.append("atypSeqNum");
        sb.append('=');
        sb.append(((this.atypSeqNum == null)?"<null>":this.atypSeqNum));
        sb.append(',');
        sb.append("page3CurrCode");
        sb.append('=');
        sb.append(((this.page3CurrCode == null)?"<null>":this.page3CurrCode));
        sb.append(',');
        sb.append("suspInd");
        sb.append('=');
        sb.append(((this.suspInd == null)?"<null>":this.suspInd));
        sb.append(',');
        sb.append("itypDesc");
        sb.append('=');
        sb.append(((this.itypDesc == null)?"<null>":this.itypDesc));
        sb.append(',');
        sb.append("page6CurrCode");
        sb.append('=');
        sb.append(((this.page6CurrCode == null)?"<null>":this.page6CurrCode));
        sb.append(',');
        sb.append("cancelDate");
        sb.append('=');
        sb.append(((this.cancelDate == null)?"<null>":this.cancelDate));
        sb.append(',');
        sb.append("matchDescription");
        sb.append('=');
        sb.append(((this.matchDescription == null)?"<null>":this.matchDescription));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("taxDesc");
        sb.append('=');
        sb.append(((this.taxDesc == null)?"<null>":this.taxDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("page2State");
        sb.append('=');
        sb.append(((this.page2State == null)?"<null>":this.page2State));
        sb.append(',');
        sb.append("_1099Ind");
        sb.append('=');
        sb.append(((this._1099Ind == null)?"<null>":this._1099Ind));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("collectTaxes");
        sb.append('=');
        sb.append(((this.collectTaxes == null)?"<null>":this.collectTaxes));
        sb.append(',');
        sb.append("iatInd");
        sb.append('=');
        sb.append(((this.iatInd == null)?"<null>":this.iatInd));
        sb.append(',');
        sb.append("faainvhStatCode");
        sb.append('=');
        sb.append(((this.faainvhStatCode == null)?"<null>":this.faainvhStatCode));
        sb.append(',');
        sb.append("crMemoInd");
        sb.append('=');
        sb.append(((this.crMemoInd == null)?"<null>":this.crMemoInd));
        sb.append(',');
        sb.append("pmtDueDate");
        sb.append('=');
        sb.append(((this.pmtDueDate == null)?"<null>":this.pmtDueDate));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("cancelInd");
        sb.append('=');
        sb.append(((this.cancelInd == null)?"<null>":this.cancelInd));
        sb.append(',');
        sb.append("nationName");
        sb.append('=');
        sb.append(((this.nationName == null)?"<null>":this.nationName));
        sb.append(',');
        sb.append("page2ZipCode");
        sb.append('=');
        sb.append(((this.page2ZipCode == null)?"<null>":this.page2ZipCode));
        sb.append(',');
        sb.append("vendorNatnName");
        sb.append('=');
        sb.append(((this.vendorNatnName == null)?"<null>":this.vendorNatnName));
        sb.append(',');
        sb.append("atypCodeVend");
        sb.append('=');
        sb.append(((this.atypCodeVend == null)?"<null>":this.atypCodeVend));
        sb.append(',');
        sb.append("invoiceDate");
        sb.append('=');
        sb.append(((this.invoiceDate == null)?"<null>":this.invoiceDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("achtCode");
        sb.append('=');
        sb.append(((this.achtCode == null)?"<null>":this.achtCode));
        sb.append(',');
        sb.append("faainvhVendCheckCode");
        sb.append('=');
        sb.append(((this.faainvhVendCheckCode == null)?"<null>":this.faainvhVendCheckCode));
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
        sb.append("page4CurrCode");
        sb.append('=');
        sb.append(((this.page4CurrCode == null)?"<null>":this.page4CurrCode));
        sb.append(',');
        sb.append("spraddrNatnCode");
        sb.append('=');
        sb.append(((this.spraddrNatnCode == null)?"<null>":this.spraddrNatnCode));
        sb.append(',');
        sb.append("overrideTaxAmt");
        sb.append('=');
        sb.append(((this.overrideTaxAmt == null)?"<null>":this.overrideTaxAmt));
        sb.append(',');
        sb.append("achOverrideInd");
        sb.append('=');
        sb.append(((this.achOverrideInd == null)?"<null>":this.achOverrideInd));
        sb.append(',');
        sb.append("itypCode");
        sb.append('=');
        sb.append(((this.itypCode == null)?"<null>":this.itypCode));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("headerBankName");
        sb.append('=');
        sb.append(((this.headerBankName == null)?"<null>":this.headerBankName));
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
        result = ((result* 31)+((this.atypSeqNumVend == null)? 0 :this.atypSeqNumVend.hashCode()));
        result = ((result* 31)+((this.headerTextInd == null)? 0 :this.headerTextInd.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.disbAgentInd == null)? 0 :this.disbAgentInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.vendorNatnCode == null)? 0 :this.vendorNatnCode.hashCode()));
        result = ((result* 31)+((this.vendHoldOvrdUser == null)? 0 :this.vendHoldOvrdUser.hashCode()));
        result = ((result* 31)+((this.collectsTaxes == null)? 0 :this.collectsTaxes.hashCode()));
        result = ((result* 31)+((this.currCodeDesc == null)? 0 :this.currCodeDesc.hashCode()));
        result = ((result* 31)+((this.directDepositStatus == null)? 0 :this.directDepositStatus.hashCode()));
        result = ((result* 31)+((this.page2City == null)? 0 :this.page2City.hashCode()));
        result = ((result* 31)+((this.vendHoldOvrdInd == null)? 0 :this.vendHoldOvrdInd.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        result = ((result* 31)+((this.discCode == null)? 0 :this.discCode.hashCode()));
        result = ((result* 31)+((this.singleAcctgInd == null)? 0 :this.singleAcctgInd.hashCode()));
        result = ((result* 31)+((this.page2VendAddr3 == null)? 0 :this.page2VendAddr3 .hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.originCode == null)? 0 :this.originCode.hashCode()));
        result = ((result* 31)+((this.page2VendAddr1 == null)? 0 :this.page2VendAddr1 .hashCode()));
        result = ((result* 31)+((this.page2VendAddr2 == null)? 0 :this.page2VendAddr2 .hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.correctionDigit == null)? 0 :this.correctionDigit.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.deliveryPoint == null)? 0 :this.deliveryPoint.hashCode()));
        result = ((result* 31)+((this.collectsTaxesTitle == null)? 0 :this.collectsTaxesTitle.hashCode()));
        result = ((result* 31)+((this.ruivInd == null)? 0 :this.ruivInd.hashCode()));
        result = ((result* 31)+((this.vendInvCode == null)? 0 :this.vendInvCode.hashCode()));
        result = ((result* 31)+((this.ruivInstallmentInd == null)? 0 :this.ruivInstallmentInd.hashCode()));
        result = ((result* 31)+((this.page2NsfSuspInd == null)? 0 :this.page2NsfSuspInd.hashCode()));
        result = ((result* 31)+((this.groupingInd == null)? 0 :this.groupingInd.hashCode()));
        result = ((result* 31)+((this.vendCheckName == null)? 0 :this.vendCheckName.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.holdInd == null)? 0 :this.holdInd.hashCode()));
        result = ((result* 31)+((this.openPaidInd == null)? 0 :this.openPaidInd.hashCode()));
        result = ((result* 31)+((this.atypSeqNum == null)? 0 :this.atypSeqNum.hashCode()));
        result = ((result* 31)+((this.page3CurrCode == null)? 0 :this.page3CurrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.suspInd == null)? 0 :this.suspInd.hashCode()));
        result = ((result* 31)+((this.itypDesc == null)? 0 :this.itypDesc.hashCode()));
        result = ((result* 31)+((this.page6CurrCode == null)? 0 :this.page6CurrCode.hashCode()));
        result = ((result* 31)+((this.cancelDate == null)? 0 :this.cancelDate.hashCode()));
        result = ((result* 31)+((this.matchDescription == null)? 0 :this.matchDescription.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.taxDesc == null)? 0 :this.taxDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this._1099Id == null)? 0 :this._1099Id.hashCode()));
        result = ((result* 31)+((this.page2State == null)? 0 :this.page2State.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.collectTaxes == null)? 0 :this.collectTaxes.hashCode()));
        result = ((result* 31)+((this.iatInd == null)? 0 :this.iatInd.hashCode()));
        result = ((result* 31)+((this.faainvhStatCode == null)? 0 :this.faainvhStatCode.hashCode()));
        result = ((result* 31)+((this.crMemoInd == null)? 0 :this.crMemoInd.hashCode()));
        result = ((result* 31)+((this.pmtDueDate == null)? 0 :this.pmtDueDate.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.cancelInd == null)? 0 :this.cancelInd.hashCode()));
        result = ((result* 31)+((this.nationName == null)? 0 :this.nationName.hashCode()));
        result = ((result* 31)+((this.page2ZipCode == null)? 0 :this.page2ZipCode.hashCode()));
        result = ((result* 31)+((this._1099Ind == null)? 0 :this._1099Ind.hashCode()));
        result = ((result* 31)+((this.vendorNatnName == null)? 0 :this.vendorNatnName.hashCode()));
        result = ((result* 31)+((this.atypCodeVend == null)? 0 :this.atypCodeVend.hashCode()));
        result = ((result* 31)+((this.invoiceDate == null)? 0 :this.invoiceDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.achtCode == null)? 0 :this.achtCode.hashCode()));
        result = ((result* 31)+((this.faainvhVendCheckCode == null)? 0 :this.faainvhVendCheckCode.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.page4CurrCode == null)? 0 :this.page4CurrCode.hashCode()));
        result = ((result* 31)+((this.spraddrNatnCode == null)? 0 :this.spraddrNatnCode.hashCode()));
        result = ((result* 31)+((this.overrideTaxAmt == null)? 0 :this.overrideTaxAmt.hashCode()));
        result = ((result* 31)+((this.achOverrideInd == null)? 0 :this.achOverrideInd.hashCode()));
        result = ((result* 31)+((this.itypCode == null)? 0 :this.itypCode.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.headerBankName == null)? 0 :this.headerBankName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemoQuery100GetResponse) == false) {
            return false;
        }
        InvoiceCreditMemoQuery100GetResponse rhs = ((InvoiceCreditMemoQuery100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.atypSeqNumVend == rhs.atypSeqNumVend)||((this.atypSeqNumVend!= null)&&this.atypSeqNumVend.equals(rhs.atypSeqNumVend)))&&((this.headerTextInd == rhs.headerTextInd)||((this.headerTextInd!= null)&&this.headerTextInd.equals(rhs.headerTextInd))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.disbAgentInd == rhs.disbAgentInd)||((this.disbAgentInd!= null)&&this.disbAgentInd.equals(rhs.disbAgentInd))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.vendorNatnCode == rhs.vendorNatnCode)||((this.vendorNatnCode!= null)&&this.vendorNatnCode.equals(rhs.vendorNatnCode))))&&((this.vendHoldOvrdUser == rhs.vendHoldOvrdUser)||((this.vendHoldOvrdUser!= null)&&this.vendHoldOvrdUser.equals(rhs.vendHoldOvrdUser))))&&((this.collectsTaxes == rhs.collectsTaxes)||((this.collectsTaxes!= null)&&this.collectsTaxes.equals(rhs.collectsTaxes))))&&((this.currCodeDesc == rhs.currCodeDesc)||((this.currCodeDesc!= null)&&this.currCodeDesc.equals(rhs.currCodeDesc))))&&((this.directDepositStatus == rhs.directDepositStatus)||((this.directDepositStatus!= null)&&this.directDepositStatus.equals(rhs.directDepositStatus))))&&((this.page2City == rhs.page2City)||((this.page2City!= null)&&this.page2City.equals(rhs.page2City))))&&((this.vendHoldOvrdInd == rhs.vendHoldOvrdInd)||((this.vendHoldOvrdInd!= null)&&this.vendHoldOvrdInd.equals(rhs.vendHoldOvrdInd))))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))))&&((this.discCode == rhs.discCode)||((this.discCode!= null)&&this.discCode.equals(rhs.discCode))))&&((this.singleAcctgInd == rhs.singleAcctgInd)||((this.singleAcctgInd!= null)&&this.singleAcctgInd.equals(rhs.singleAcctgInd))))&&((this.page2VendAddr3 == rhs.page2VendAddr3)||((this.page2VendAddr3 != null)&&this.page2VendAddr3 .equals(rhs.page2VendAddr3))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.originCode == rhs.originCode)||((this.originCode!= null)&&this.originCode.equals(rhs.originCode))))&&((this.page2VendAddr1 == rhs.page2VendAddr1)||((this.page2VendAddr1 != null)&&this.page2VendAddr1 .equals(rhs.page2VendAddr1))))&&((this.page2VendAddr2 == rhs.page2VendAddr2)||((this.page2VendAddr2 != null)&&this.page2VendAddr2 .equals(rhs.page2VendAddr2))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.correctionDigit == rhs.correctionDigit)||((this.correctionDigit!= null)&&this.correctionDigit.equals(rhs.correctionDigit))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.deliveryPoint == rhs.deliveryPoint)||((this.deliveryPoint!= null)&&this.deliveryPoint.equals(rhs.deliveryPoint))))&&((this.collectsTaxesTitle == rhs.collectsTaxesTitle)||((this.collectsTaxesTitle!= null)&&this.collectsTaxesTitle.equals(rhs.collectsTaxesTitle))))&&((this.ruivInd == rhs.ruivInd)||((this.ruivInd!= null)&&this.ruivInd.equals(rhs.ruivInd))))&&((this.vendInvCode == rhs.vendInvCode)||((this.vendInvCode!= null)&&this.vendInvCode.equals(rhs.vendInvCode))))&&((this.ruivInstallmentInd == rhs.ruivInstallmentInd)||((this.ruivInstallmentInd!= null)&&this.ruivInstallmentInd.equals(rhs.ruivInstallmentInd))))&&((this.page2NsfSuspInd == rhs.page2NsfSuspInd)||((this.page2NsfSuspInd!= null)&&this.page2NsfSuspInd.equals(rhs.page2NsfSuspInd))))&&((this.groupingInd == rhs.groupingInd)||((this.groupingInd!= null)&&this.groupingInd.equals(rhs.groupingInd))))&&((this.vendCheckName == rhs.vendCheckName)||((this.vendCheckName!= null)&&this.vendCheckName.equals(rhs.vendCheckName))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.holdInd == rhs.holdInd)||((this.holdInd!= null)&&this.holdInd.equals(rhs.holdInd))))&&((this.openPaidInd == rhs.openPaidInd)||((this.openPaidInd!= null)&&this.openPaidInd.equals(rhs.openPaidInd))))&&((this.atypSeqNum == rhs.atypSeqNum)||((this.atypSeqNum!= null)&&this.atypSeqNum.equals(rhs.atypSeqNum))))&&((this.page3CurrCode == rhs.page3CurrCode)||((this.page3CurrCode!= null)&&this.page3CurrCode.equals(rhs.page3CurrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.suspInd == rhs.suspInd)||((this.suspInd!= null)&&this.suspInd.equals(rhs.suspInd))))&&((this.itypDesc == rhs.itypDesc)||((this.itypDesc!= null)&&this.itypDesc.equals(rhs.itypDesc))))&&((this.page6CurrCode == rhs.page6CurrCode)||((this.page6CurrCode!= null)&&this.page6CurrCode.equals(rhs.page6CurrCode))))&&((this.cancelDate == rhs.cancelDate)||((this.cancelDate!= null)&&this.cancelDate.equals(rhs.cancelDate))))&&((this.matchDescription == rhs.matchDescription)||((this.matchDescription!= null)&&this.matchDescription.equals(rhs.matchDescription))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.taxDesc == rhs.taxDesc)||((this.taxDesc!= null)&&this.taxDesc.equals(rhs.taxDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this._1099Id == rhs._1099Id)||((this._1099Id!= null)&&this._1099Id.equals(rhs._1099Id))))&&((this.page2State == rhs.page2State)||((this.page2State!= null)&&this.page2State.equals(rhs.page2State))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.collectTaxes == rhs.collectTaxes)||((this.collectTaxes!= null)&&this.collectTaxes.equals(rhs.collectTaxes))))&&((this.iatInd == rhs.iatInd)||((this.iatInd!= null)&&this.iatInd.equals(rhs.iatInd))))&&((this.faainvhStatCode == rhs.faainvhStatCode)||((this.faainvhStatCode!= null)&&this.faainvhStatCode.equals(rhs.faainvhStatCode))))&&((this.crMemoInd == rhs.crMemoInd)||((this.crMemoInd!= null)&&this.crMemoInd.equals(rhs.crMemoInd))))&&((this.pmtDueDate == rhs.pmtDueDate)||((this.pmtDueDate!= null)&&this.pmtDueDate.equals(rhs.pmtDueDate))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.cancelInd == rhs.cancelInd)||((this.cancelInd!= null)&&this.cancelInd.equals(rhs.cancelInd))))&&((this.nationName == rhs.nationName)||((this.nationName!= null)&&this.nationName.equals(rhs.nationName))))&&((this.page2ZipCode == rhs.page2ZipCode)||((this.page2ZipCode!= null)&&this.page2ZipCode.equals(rhs.page2ZipCode))))&&((this._1099Ind == rhs._1099Ind)||((this._1099Ind!= null)&&this._1099Ind.equals(rhs._1099Ind))))&&((this.vendorNatnName == rhs.vendorNatnName)||((this.vendorNatnName!= null)&&this.vendorNatnName.equals(rhs.vendorNatnName))))&&((this.atypCodeVend == rhs.atypCodeVend)||((this.atypCodeVend!= null)&&this.atypCodeVend.equals(rhs.atypCodeVend))))&&((this.invoiceDate == rhs.invoiceDate)||((this.invoiceDate!= null)&&this.invoiceDate.equals(rhs.invoiceDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))))&&((this.faainvhVendCheckCode == rhs.faainvhVendCheckCode)||((this.faainvhVendCheckCode!= null)&&this.faainvhVendCheckCode.equals(rhs.faainvhVendCheckCode))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.page4CurrCode == rhs.page4CurrCode)||((this.page4CurrCode!= null)&&this.page4CurrCode.equals(rhs.page4CurrCode))))&&((this.spraddrNatnCode == rhs.spraddrNatnCode)||((this.spraddrNatnCode!= null)&&this.spraddrNatnCode.equals(rhs.spraddrNatnCode))))&&((this.overrideTaxAmt == rhs.overrideTaxAmt)||((this.overrideTaxAmt!= null)&&this.overrideTaxAmt.equals(rhs.overrideTaxAmt))))&&((this.achOverrideInd == rhs.achOverrideInd)||((this.achOverrideInd!= null)&&this.achOverrideInd.equals(rhs.achOverrideInd))))&&((this.itypCode == rhs.itypCode)||((this.itypCode!= null)&&this.itypCode.equals(rhs.itypCode))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.headerBankName == rhs.headerBankName)||((this.headerBankName!= null)&&this.headerBankName.equals(rhs.headerBankName))));
    }

}
