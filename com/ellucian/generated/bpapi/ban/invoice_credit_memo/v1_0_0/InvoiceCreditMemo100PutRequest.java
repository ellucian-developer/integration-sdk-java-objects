
package com.ellucian.generated.bpapi.ban.invoice_credit_memo.v1_0_0;

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
    "criteria.vendInvCode",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.invoiceDate",
    "criteria.matchTempReq",
    "fabinvhInvoiceDate",
    "fabinvhVendInvCode",
    "criteria.1099Ind",
    "fabinvhSingleAcctgInd",
    "criteria.faainvhVendCheckCode",
    "vendor",
    "criteria.achtCode",
    "criteria.addrLine4",
    "pmtDueDate",
    "criteria.singleAcctgInd",
    "criteria.transDate",
    "criteria.houseNumber",
    "criteria.achOverrideInd",
    "criteria.crMemoInd",
    "fabinvhCrMemoInd",
    "faainvhDocCode",
    "criteria.multipleInvInd",
    "invoiceChoice",
    "criteria.pmtDueDate",
    "criteria.bankCode",
    "criteria.headerText"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemo100PutRequest {

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("criteria.vendInvCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_INV_CODE")
    private String criteriaVendInvCode;
    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : FABINVH_USER_ID")
    private String criteriaUserId;
    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invoiceDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_INVOICE_DATE")
    private Date criteriaInvoiceDate;
    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.matchTempReq")
    private String criteriaMatchTempReq;
    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("fabinvhInvoiceDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_INVOICE_DATE")
    private Date fabinvhInvoiceDate;
    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("fabinvhVendInvCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_INV_CODE")
    private String fabinvhVendInvCode;
    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("criteria.1099Ind")
    @JsonPropertyDescription("Lineage reference object : FABINVH_1099_IND")
    private String criteria1099Ind;
    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("fabinvhSingleAcctgInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_SINGLE_ACCTG_IND")
    private String fabinvhSingleAcctgInd;
    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.faainvhVendCheckCode")
    private String criteriaFaainvhVendCheckCode;
    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Lineage reference object : keyBlockVendor")
    private Object vendor;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("criteria.achtCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht")
    private String criteriaAchtCode;
    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addrLine4")
    private String criteriaAddrLine4;
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
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("criteria.singleAcctgInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_SINGLE_ACCTG_IND")
    private String criteriaSingleAcctgInd;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_TRANS_DATE")
    private Date criteriaTransDate;
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.houseNumber")
    private String criteriaHouseNumber;
    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.achOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACH_OVERRIDE_IND")
    private String criteriaAchOverrideInd;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("criteria.crMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String criteriaCrMemoInd;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("fabinvhCrMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String fabinvhCrMemoInd;
    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    @JsonPropertyDescription("Lineage reference object : faainvhDocCode")
    private Object faainvhDocCode;
    /**
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("criteria.multipleInvInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_MULTIPLE_INV_IND")
    private String criteriaMultipleInvInd;
    /**
     * Invoice Type
     * <p>
     * Lineage reference object : invoiceChoice
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    @JsonPropertyDescription("Lineage reference object : invoiceChoice")
    private Object invoiceChoice;
    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("criteria.pmtDueDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_PMT_DUE_DATE")
    private Date criteriaPmtDueDate;
    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.headerText")
    private String criteriaHeaderText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("criteria.vendInvCode")
    public String getCriteriaVendInvCode() {
        return criteriaVendInvCode;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("criteria.vendInvCode")
    public void setCriteriaVendInvCode(String criteriaVendInvCode) {
        this.criteriaVendInvCode = criteriaVendInvCode;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaVendInvCode(String criteriaVendInvCode) {
        this.criteriaVendInvCode = criteriaVendInvCode;
        return this;
    }

    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invoiceDate")
    public Date getCriteriaInvoiceDate() {
        return criteriaInvoiceDate;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invoiceDate")
    public void setCriteriaInvoiceDate(Date criteriaInvoiceDate) {
        this.criteriaInvoiceDate = criteriaInvoiceDate;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaInvoiceDate(Date criteriaInvoiceDate) {
        this.criteriaInvoiceDate = criteriaInvoiceDate;
        return this;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.matchTempReq")
    public String getCriteriaMatchTempReq() {
        return criteriaMatchTempReq;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.matchTempReq")
    public void setCriteriaMatchTempReq(String criteriaMatchTempReq) {
        this.criteriaMatchTempReq = criteriaMatchTempReq;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaMatchTempReq(String criteriaMatchTempReq) {
        this.criteriaMatchTempReq = criteriaMatchTempReq;
        return this;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("fabinvhInvoiceDate")
    public Date getFabinvhInvoiceDate() {
        return fabinvhInvoiceDate;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("fabinvhInvoiceDate")
    public void setFabinvhInvoiceDate(Date fabinvhInvoiceDate) {
        this.fabinvhInvoiceDate = fabinvhInvoiceDate;
    }

    public InvoiceCreditMemo100PutRequest withFabinvhInvoiceDate(Date fabinvhInvoiceDate) {
        this.fabinvhInvoiceDate = fabinvhInvoiceDate;
        return this;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("fabinvhVendInvCode")
    public String getFabinvhVendInvCode() {
        return fabinvhVendInvCode;
    }

    /**
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("fabinvhVendInvCode")
    public void setFabinvhVendInvCode(String fabinvhVendInvCode) {
        this.fabinvhVendInvCode = fabinvhVendInvCode;
    }

    public InvoiceCreditMemo100PutRequest withFabinvhVendInvCode(String fabinvhVendInvCode) {
        this.fabinvhVendInvCode = fabinvhVendInvCode;
        return this;
    }

    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("criteria.1099Ind")
    public String getCriteria1099Ind() {
        return criteria1099Ind;
    }

    /**
     *  1099 Vendor
     * <p>
     * Lineage reference object : FABINVH_1099_IND
     * 
     */
    @JsonProperty("criteria.1099Ind")
    public void setCriteria1099Ind(String criteria1099Ind) {
        this.criteria1099Ind = criteria1099Ind;
    }

    public InvoiceCreditMemo100PutRequest withCriteria1099Ind(String criteria1099Ind) {
        this.criteria1099Ind = criteria1099Ind;
        return this;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("fabinvhSingleAcctgInd")
    public String getFabinvhSingleAcctgInd() {
        return fabinvhSingleAcctgInd;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("fabinvhSingleAcctgInd")
    public void setFabinvhSingleAcctgInd(String fabinvhSingleAcctgInd) {
        this.fabinvhSingleAcctgInd = fabinvhSingleAcctgInd;
    }

    public InvoiceCreditMemo100PutRequest withFabinvhSingleAcctgInd(String fabinvhSingleAcctgInd) {
        this.fabinvhSingleAcctgInd = fabinvhSingleAcctgInd;
        return this;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.faainvhVendCheckCode")
    public String getCriteriaFaainvhVendCheckCode() {
        return criteriaFaainvhVendCheckCode;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.faainvhVendCheckCode")
    public void setCriteriaFaainvhVendCheckCode(String criteriaFaainvhVendCheckCode) {
        this.criteriaFaainvhVendCheckCode = criteriaFaainvhVendCheckCode;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaFaainvhVendCheckCode(String criteriaFaainvhVendCheckCode) {
        this.criteriaFaainvhVendCheckCode = criteriaFaainvhVendCheckCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public InvoiceCreditMemo100PutRequest withVendor(Object vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("criteria.achtCode")
    public String getCriteriaAchtCode() {
        return criteriaAchtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("criteria.achtCode")
    public void setCriteriaAchtCode(String criteriaAchtCode) {
        this.criteriaAchtCode = criteriaAchtCode;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaAchtCode(String criteriaAchtCode) {
        this.criteriaAchtCode = criteriaAchtCode;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addrLine4")
    public String getCriteriaAddrLine4() {
        return criteriaAddrLine4;
    }

    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addrLine4")
    public void setCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
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

    public InvoiceCreditMemo100PutRequest withPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
        return this;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("criteria.singleAcctgInd")
    public String getCriteriaSingleAcctgInd() {
        return criteriaSingleAcctgInd;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("criteria.singleAcctgInd")
    public void setCriteriaSingleAcctgInd(String criteriaSingleAcctgInd) {
        this.criteriaSingleAcctgInd = criteriaSingleAcctgInd;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaSingleAcctgInd(String criteriaSingleAcctgInd) {
        this.criteriaSingleAcctgInd = criteriaSingleAcctgInd;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public String getCriteriaHouseNumber() {
        return criteriaHouseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.houseNumber")
    public void setCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
        return this;
    }

    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.achOverrideInd")
    public String getCriteriaAchOverrideInd() {
        return criteriaAchOverrideInd;
    }

    /**
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.achOverrideInd")
    public void setCriteriaAchOverrideInd(String criteriaAchOverrideInd) {
        this.criteriaAchOverrideInd = criteriaAchOverrideInd;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaAchOverrideInd(String criteriaAchOverrideInd) {
        this.criteriaAchOverrideInd = criteriaAchOverrideInd;
        return this;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("criteria.crMemoInd")
    public String getCriteriaCrMemoInd() {
        return criteriaCrMemoInd;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("criteria.crMemoInd")
    public void setCriteriaCrMemoInd(String criteriaCrMemoInd) {
        this.criteriaCrMemoInd = criteriaCrMemoInd;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaCrMemoInd(String criteriaCrMemoInd) {
        this.criteriaCrMemoInd = criteriaCrMemoInd;
        return this;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("fabinvhCrMemoInd")
    public String getFabinvhCrMemoInd() {
        return fabinvhCrMemoInd;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("fabinvhCrMemoInd")
    public void setFabinvhCrMemoInd(String fabinvhCrMemoInd) {
        this.fabinvhCrMemoInd = fabinvhCrMemoInd;
    }

    public InvoiceCreditMemo100PutRequest withFabinvhCrMemoInd(String fabinvhCrMemoInd) {
        this.fabinvhCrMemoInd = fabinvhCrMemoInd;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    public Object getFaainvhDocCode() {
        return faainvhDocCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    public void setFaainvhDocCode(Object faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
    }

    public InvoiceCreditMemo100PutRequest withFaainvhDocCode(Object faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
        return this;
    }

    /**
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("criteria.multipleInvInd")
    public String getCriteriaMultipleInvInd() {
        return criteriaMultipleInvInd;
    }

    /**
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("criteria.multipleInvInd")
    public void setCriteriaMultipleInvInd(String criteriaMultipleInvInd) {
        this.criteriaMultipleInvInd = criteriaMultipleInvInd;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaMultipleInvInd(String criteriaMultipleInvInd) {
        this.criteriaMultipleInvInd = criteriaMultipleInvInd;
        return this;
    }

    /**
     * Invoice Type
     * <p>
     * Lineage reference object : invoiceChoice
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    public Object getInvoiceChoice() {
        return invoiceChoice;
    }

    /**
     * Invoice Type
     * <p>
     * Lineage reference object : invoiceChoice
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    public void setInvoiceChoice(Object invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
    }

    public InvoiceCreditMemo100PutRequest withInvoiceChoice(Object invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
        return this;
    }

    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("criteria.pmtDueDate")
    public Date getCriteriaPmtDueDate() {
        return criteriaPmtDueDate;
    }

    /**
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("criteria.pmtDueDate")
    public void setCriteriaPmtDueDate(Date criteriaPmtDueDate) {
        this.criteriaPmtDueDate = criteriaPmtDueDate;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaPmtDueDate(Date criteriaPmtDueDate) {
        this.criteriaPmtDueDate = criteriaPmtDueDate;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.headerText")
    public String getCriteriaHeaderText() {
        return criteriaHeaderText;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.headerText")
    public void setCriteriaHeaderText(String criteriaHeaderText) {
        this.criteriaHeaderText = criteriaHeaderText;
    }

    public InvoiceCreditMemo100PutRequest withCriteriaHeaderText(String criteriaHeaderText) {
        this.criteriaHeaderText = criteriaHeaderText;
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

    public InvoiceCreditMemo100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemo100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaVendInvCode");
        sb.append('=');
        sb.append(((this.criteriaVendInvCode == null)?"<null>":this.criteriaVendInvCode));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaInvoiceDate");
        sb.append('=');
        sb.append(((this.criteriaInvoiceDate == null)?"<null>":this.criteriaInvoiceDate));
        sb.append(',');
        sb.append("criteriaMatchTempReq");
        sb.append('=');
        sb.append(((this.criteriaMatchTempReq == null)?"<null>":this.criteriaMatchTempReq));
        sb.append(',');
        sb.append("fabinvhInvoiceDate");
        sb.append('=');
        sb.append(((this.fabinvhInvoiceDate == null)?"<null>":this.fabinvhInvoiceDate));
        sb.append(',');
        sb.append("fabinvhVendInvCode");
        sb.append('=');
        sb.append(((this.fabinvhVendInvCode == null)?"<null>":this.fabinvhVendInvCode));
        sb.append(',');
        sb.append("criteria1099Ind");
        sb.append('=');
        sb.append(((this.criteria1099Ind == null)?"<null>":this.criteria1099Ind));
        sb.append(',');
        sb.append("fabinvhSingleAcctgInd");
        sb.append('=');
        sb.append(((this.fabinvhSingleAcctgInd == null)?"<null>":this.fabinvhSingleAcctgInd));
        sb.append(',');
        sb.append("criteriaFaainvhVendCheckCode");
        sb.append('=');
        sb.append(((this.criteriaFaainvhVendCheckCode == null)?"<null>":this.criteriaFaainvhVendCheckCode));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("criteriaAchtCode");
        sb.append('=');
        sb.append(((this.criteriaAchtCode == null)?"<null>":this.criteriaAchtCode));
        sb.append(',');
        sb.append("criteriaAddrLine4");
        sb.append('=');
        sb.append(((this.criteriaAddrLine4 == null)?"<null>":this.criteriaAddrLine4));
        sb.append(',');
        sb.append("pmtDueDate");
        sb.append('=');
        sb.append(((this.pmtDueDate == null)?"<null>":this.pmtDueDate));
        sb.append(',');
        sb.append("criteriaSingleAcctgInd");
        sb.append('=');
        sb.append(((this.criteriaSingleAcctgInd == null)?"<null>":this.criteriaSingleAcctgInd));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
        sb.append(',');
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("criteriaAchOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaAchOverrideInd == null)?"<null>":this.criteriaAchOverrideInd));
        sb.append(',');
        sb.append("criteriaCrMemoInd");
        sb.append('=');
        sb.append(((this.criteriaCrMemoInd == null)?"<null>":this.criteriaCrMemoInd));
        sb.append(',');
        sb.append("fabinvhCrMemoInd");
        sb.append('=');
        sb.append(((this.fabinvhCrMemoInd == null)?"<null>":this.fabinvhCrMemoInd));
        sb.append(',');
        sb.append("faainvhDocCode");
        sb.append('=');
        sb.append(((this.faainvhDocCode == null)?"<null>":this.faainvhDocCode));
        sb.append(',');
        sb.append("criteriaMultipleInvInd");
        sb.append('=');
        sb.append(((this.criteriaMultipleInvInd == null)?"<null>":this.criteriaMultipleInvInd));
        sb.append(',');
        sb.append("invoiceChoice");
        sb.append('=');
        sb.append(((this.invoiceChoice == null)?"<null>":this.invoiceChoice));
        sb.append(',');
        sb.append("criteriaPmtDueDate");
        sb.append('=');
        sb.append(((this.criteriaPmtDueDate == null)?"<null>":this.criteriaPmtDueDate));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
        sb.append(',');
        sb.append("criteriaHeaderText");
        sb.append('=');
        sb.append(((this.criteriaHeaderText == null)?"<null>":this.criteriaHeaderText));
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
        result = ((result* 31)+((this.criteria1099Ind == null)? 0 :this.criteria1099Ind.hashCode()));
        result = ((result* 31)+((this.criteriaHeaderText == null)? 0 :this.criteriaHeaderText.hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.fabinvhInvoiceDate == null)? 0 :this.fabinvhInvoiceDate.hashCode()));
        result = ((result* 31)+((this.criteriaFaainvhVendCheckCode == null)? 0 :this.criteriaFaainvhVendCheckCode.hashCode()));
        result = ((result* 31)+((this.fabinvhVendInvCode == null)? 0 :this.fabinvhVendInvCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine4 == null)? 0 :this.criteriaAddrLine4 .hashCode()));
        result = ((result* 31)+((this.fabinvhSingleAcctgInd == null)? 0 :this.fabinvhSingleAcctgInd.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.criteriaAchtCode == null)? 0 :this.criteriaAchtCode.hashCode()));
        result = ((result* 31)+((this.criteriaVendInvCode == null)? 0 :this.criteriaVendInvCode.hashCode()));
        result = ((result* 31)+((this.criteriaAchOverrideInd == null)? 0 :this.criteriaAchOverrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaInvoiceDate == null)? 0 :this.criteriaInvoiceDate.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.pmtDueDate == null)? 0 :this.pmtDueDate.hashCode()));
        result = ((result* 31)+((this.criteriaPmtDueDate == null)? 0 :this.criteriaPmtDueDate.hashCode()));
        result = ((result* 31)+((this.criteriaMultipleInvInd == null)? 0 :this.criteriaMultipleInvInd.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.criteriaMatchTempReq == null)? 0 :this.criteriaMatchTempReq.hashCode()));
        result = ((result* 31)+((this.fabinvhCrMemoInd == null)? 0 :this.fabinvhCrMemoInd.hashCode()));
        result = ((result* 31)+((this.faainvhDocCode == null)? 0 :this.faainvhDocCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaSingleAcctgInd == null)? 0 :this.criteriaSingleAcctgInd.hashCode()));
        result = ((result* 31)+((this.criteriaCrMemoInd == null)? 0 :this.criteriaCrMemoInd.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.invoiceChoice == null)? 0 :this.invoiceChoice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemo100PutRequest) == false) {
            return false;
        }
        InvoiceCreditMemo100PutRequest rhs = ((InvoiceCreditMemo100PutRequest) other);
        return ((((((((((((((((((((((((((((this.criteria1099Ind == rhs.criteria1099Ind)||((this.criteria1099Ind!= null)&&this.criteria1099Ind.equals(rhs.criteria1099Ind)))&&((this.criteriaHeaderText == rhs.criteriaHeaderText)||((this.criteriaHeaderText!= null)&&this.criteriaHeaderText.equals(rhs.criteriaHeaderText))))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.fabinvhInvoiceDate == rhs.fabinvhInvoiceDate)||((this.fabinvhInvoiceDate!= null)&&this.fabinvhInvoiceDate.equals(rhs.fabinvhInvoiceDate))))&&((this.criteriaFaainvhVendCheckCode == rhs.criteriaFaainvhVendCheckCode)||((this.criteriaFaainvhVendCheckCode!= null)&&this.criteriaFaainvhVendCheckCode.equals(rhs.criteriaFaainvhVendCheckCode))))&&((this.fabinvhVendInvCode == rhs.fabinvhVendInvCode)||((this.fabinvhVendInvCode!= null)&&this.fabinvhVendInvCode.equals(rhs.fabinvhVendInvCode))))&&((this.criteriaAddrLine4 == rhs.criteriaAddrLine4)||((this.criteriaAddrLine4 != null)&&this.criteriaAddrLine4 .equals(rhs.criteriaAddrLine4))))&&((this.fabinvhSingleAcctgInd == rhs.fabinvhSingleAcctgInd)||((this.fabinvhSingleAcctgInd!= null)&&this.fabinvhSingleAcctgInd.equals(rhs.fabinvhSingleAcctgInd))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.criteriaAchtCode == rhs.criteriaAchtCode)||((this.criteriaAchtCode!= null)&&this.criteriaAchtCode.equals(rhs.criteriaAchtCode))))&&((this.criteriaVendInvCode == rhs.criteriaVendInvCode)||((this.criteriaVendInvCode!= null)&&this.criteriaVendInvCode.equals(rhs.criteriaVendInvCode))))&&((this.criteriaAchOverrideInd == rhs.criteriaAchOverrideInd)||((this.criteriaAchOverrideInd!= null)&&this.criteriaAchOverrideInd.equals(rhs.criteriaAchOverrideInd))))&&((this.criteriaInvoiceDate == rhs.criteriaInvoiceDate)||((this.criteriaInvoiceDate!= null)&&this.criteriaInvoiceDate.equals(rhs.criteriaInvoiceDate))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.pmtDueDate == rhs.pmtDueDate)||((this.pmtDueDate!= null)&&this.pmtDueDate.equals(rhs.pmtDueDate))))&&((this.criteriaPmtDueDate == rhs.criteriaPmtDueDate)||((this.criteriaPmtDueDate!= null)&&this.criteriaPmtDueDate.equals(rhs.criteriaPmtDueDate))))&&((this.criteriaMultipleInvInd == rhs.criteriaMultipleInvInd)||((this.criteriaMultipleInvInd!= null)&&this.criteriaMultipleInvInd.equals(rhs.criteriaMultipleInvInd))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.criteriaMatchTempReq == rhs.criteriaMatchTempReq)||((this.criteriaMatchTempReq!= null)&&this.criteriaMatchTempReq.equals(rhs.criteriaMatchTempReq))))&&((this.fabinvhCrMemoInd == rhs.fabinvhCrMemoInd)||((this.fabinvhCrMemoInd!= null)&&this.fabinvhCrMemoInd.equals(rhs.fabinvhCrMemoInd))))&&((this.faainvhDocCode == rhs.faainvhDocCode)||((this.faainvhDocCode!= null)&&this.faainvhDocCode.equals(rhs.faainvhDocCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaSingleAcctgInd == rhs.criteriaSingleAcctgInd)||((this.criteriaSingleAcctgInd!= null)&&this.criteriaSingleAcctgInd.equals(rhs.criteriaSingleAcctgInd))))&&((this.criteriaCrMemoInd == rhs.criteriaCrMemoInd)||((this.criteriaCrMemoInd!= null)&&this.criteriaCrMemoInd.equals(rhs.criteriaCrMemoInd))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.invoiceChoice == rhs.invoiceChoice)||((this.invoiceChoice!= null)&&this.invoiceChoice.equals(rhs.invoiceChoice))));
    }

}
