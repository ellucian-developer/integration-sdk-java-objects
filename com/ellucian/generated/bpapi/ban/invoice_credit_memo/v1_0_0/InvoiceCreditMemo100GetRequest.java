
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
    "pmtDueDate",
    "multipleInvInd",
    "bankCode",
    "headerText",
    "vendInvCode",
    "houseNumber",
    "invoiceDate",
    "userId",
    "achtCode",
    "faainvhVendCheckCode",
    "faainvhDocCode",
    "activityDate",
    "addrLine4",
    "vendor",
    "transDate",
    "singleAcctgInd",
    "1099Ind",
    "matchTempReq",
    "achOverrideInd",
    "invoiceChoice",
    "crMemoInd"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemo100GetRequest {

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
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("multipleInvInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_MULTIPLE_INV_IND")
    private String multipleInvInd;
    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerText")
    private String headerText;
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
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    private String houseNumber;
    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("invoiceDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_INVOICE_DATE")
    private Date invoiceDate;
    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FABINVH_USER_ID")
    private String userId;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("achtCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht")
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
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    @JsonPropertyDescription("Lineage reference object : faainvhDocCode")
    private String faainvhDocCode;
    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    private String addrLine4;
    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Lineage reference object : keyBlockVendor")
    private String vendor;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_TRANS_DATE")
    private Date transDate;
    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_SINGLE_ACCTG_IND")
    private String singleAcctgInd;
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
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchTempReq")
    private String matchTempReq;
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
     * Invoice Type
     * <p>
     * Lineage reference object : invoiceChoice
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    @JsonPropertyDescription("Lineage reference object : invoiceChoice")
    private String invoiceChoice;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String crMemoInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public InvoiceCreditMemo100GetRequest withPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
        return this;
    }

    /**
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("multipleInvInd")
    public String getMultipleInvInd() {
        return multipleInvInd;
    }

    /**
     * Multiple Vendor Ind
     * <p>
     * Lineage reference object : FABINVH_MULTIPLE_INV_IND
     * 
     */
    @JsonProperty("multipleInvInd")
    public void setMultipleInvInd(String multipleInvInd) {
        this.multipleInvInd = multipleInvInd;
    }

    public InvoiceCreditMemo100GetRequest withMultipleInvInd(String multipleInvInd) {
        this.multipleInvInd = multipleInvInd;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FABINVH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public InvoiceCreditMemo100GetRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerText")
    public String getHeaderText() {
        return headerText;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerText")
    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public InvoiceCreditMemo100GetRequest withHeaderText(String headerText) {
        this.headerText = headerText;
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

    public InvoiceCreditMemo100GetRequest withVendInvCode(String vendInvCode) {
        this.vendInvCode = vendInvCode;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public InvoiceCreditMemo100GetRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Invoice Date
     * <p>
     * Lineage reference object : FABINVH_INVOICE_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("invoiceDate")
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public InvoiceCreditMemo100GetRequest withInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InvoiceCreditMemo100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("achtCode")
    public String getAchtCode() {
        return achtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE, Lookup lineage reference object : gtvacht
     * 
     */
    @JsonProperty("achtCode")
    public void setAchtCode(String achtCode) {
        this.achtCode = achtCode;
    }

    public InvoiceCreditMemo100GetRequest withAchtCode(String achtCode) {
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

    public InvoiceCreditMemo100GetRequest withFaainvhVendCheckCode(String faainvhVendCheckCode) {
        this.faainvhVendCheckCode = faainvhVendCheckCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    public String getFaainvhDocCode() {
        return faainvhDocCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    public void setFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
    }

    public InvoiceCreditMemo100GetRequest withFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
        return this;
    }

    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InvoiceCreditMemo100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    public String getAddrLine4() {
        return addrLine4;
    }

    /**
     * Address Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    public void setAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
    }

    public InvoiceCreditMemo100GetRequest withAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public InvoiceCreditMemo100GetRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
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
     * Lineage reference object : FABINVH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public InvoiceCreditMemo100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public String getSingleAcctgInd() {
        return singleAcctgInd;
    }

    /**
     * Document Accounting
     * <p>
     * Lineage reference object : FABINVH_SINGLE_ACCTG_IND
     * 
     */
    @JsonProperty("singleAcctgInd")
    public void setSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
    }

    public InvoiceCreditMemo100GetRequest withSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
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

    public InvoiceCreditMemo100GetRequest with1099Ind(String _1099Ind) {
        this._1099Ind = _1099Ind;
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

    public InvoiceCreditMemo100GetRequest withMatchTempReq(String matchTempReq) {
        this.matchTempReq = matchTempReq;
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

    public InvoiceCreditMemo100GetRequest withAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
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
    public String getInvoiceChoice() {
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
    public void setInvoiceChoice(String invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
    }

    public InvoiceCreditMemo100GetRequest withInvoiceChoice(String invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
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

    public InvoiceCreditMemo100GetRequest withCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
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

    public InvoiceCreditMemo100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemo100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pmtDueDate");
        sb.append('=');
        sb.append(((this.pmtDueDate == null)?"<null>":this.pmtDueDate));
        sb.append(',');
        sb.append("multipleInvInd");
        sb.append('=');
        sb.append(((this.multipleInvInd == null)?"<null>":this.multipleInvInd));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("headerText");
        sb.append('=');
        sb.append(((this.headerText == null)?"<null>":this.headerText));
        sb.append(',');
        sb.append("vendInvCode");
        sb.append('=');
        sb.append(((this.vendInvCode == null)?"<null>":this.vendInvCode));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
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
        sb.append("faainvhDocCode");
        sb.append('=');
        sb.append(((this.faainvhDocCode == null)?"<null>":this.faainvhDocCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrLine4");
        sb.append('=');
        sb.append(((this.addrLine4 == null)?"<null>":this.addrLine4));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("singleAcctgInd");
        sb.append('=');
        sb.append(((this.singleAcctgInd == null)?"<null>":this.singleAcctgInd));
        sb.append(',');
        sb.append("_1099Ind");
        sb.append('=');
        sb.append(((this._1099Ind == null)?"<null>":this._1099Ind));
        sb.append(',');
        sb.append("matchTempReq");
        sb.append('=');
        sb.append(((this.matchTempReq == null)?"<null>":this.matchTempReq));
        sb.append(',');
        sb.append("achOverrideInd");
        sb.append('=');
        sb.append(((this.achOverrideInd == null)?"<null>":this.achOverrideInd));
        sb.append(',');
        sb.append("invoiceChoice");
        sb.append('=');
        sb.append(((this.invoiceChoice == null)?"<null>":this.invoiceChoice));
        sb.append(',');
        sb.append("crMemoInd");
        sb.append('=');
        sb.append(((this.crMemoInd == null)?"<null>":this.crMemoInd));
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
        result = ((result* 31)+((this.pmtDueDate == null)? 0 :this.pmtDueDate.hashCode()));
        result = ((result* 31)+((this.multipleInvInd == null)? 0 :this.multipleInvInd.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.headerText == null)? 0 :this.headerText.hashCode()));
        result = ((result* 31)+((this.vendInvCode == null)? 0 :this.vendInvCode.hashCode()));
        result = ((result* 31)+((this._1099Ind == null)? 0 :this._1099Ind.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.invoiceDate == null)? 0 :this.invoiceDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.achtCode == null)? 0 :this.achtCode.hashCode()));
        result = ((result* 31)+((this.faainvhVendCheckCode == null)? 0 :this.faainvhVendCheckCode.hashCode()));
        result = ((result* 31)+((this.faainvhDocCode == null)? 0 :this.faainvhDocCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrLine4 == null)? 0 :this.addrLine4 .hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.singleAcctgInd == null)? 0 :this.singleAcctgInd.hashCode()));
        result = ((result* 31)+((this.matchTempReq == null)? 0 :this.matchTempReq.hashCode()));
        result = ((result* 31)+((this.achOverrideInd == null)? 0 :this.achOverrideInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.invoiceChoice == null)? 0 :this.invoiceChoice.hashCode()));
        result = ((result* 31)+((this.crMemoInd == null)? 0 :this.crMemoInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemo100GetRequest) == false) {
            return false;
        }
        InvoiceCreditMemo100GetRequest rhs = ((InvoiceCreditMemo100GetRequest) other);
        return (((((((((((((((((((((((this.pmtDueDate == rhs.pmtDueDate)||((this.pmtDueDate!= null)&&this.pmtDueDate.equals(rhs.pmtDueDate)))&&((this.multipleInvInd == rhs.multipleInvInd)||((this.multipleInvInd!= null)&&this.multipleInvInd.equals(rhs.multipleInvInd))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.headerText == rhs.headerText)||((this.headerText!= null)&&this.headerText.equals(rhs.headerText))))&&((this.vendInvCode == rhs.vendInvCode)||((this.vendInvCode!= null)&&this.vendInvCode.equals(rhs.vendInvCode))))&&((this._1099Ind == rhs._1099Ind)||((this._1099Ind!= null)&&this._1099Ind.equals(rhs._1099Ind))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.invoiceDate == rhs.invoiceDate)||((this.invoiceDate!= null)&&this.invoiceDate.equals(rhs.invoiceDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))))&&((this.faainvhVendCheckCode == rhs.faainvhVendCheckCode)||((this.faainvhVendCheckCode!= null)&&this.faainvhVendCheckCode.equals(rhs.faainvhVendCheckCode))))&&((this.faainvhDocCode == rhs.faainvhDocCode)||((this.faainvhDocCode!= null)&&this.faainvhDocCode.equals(rhs.faainvhDocCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrLine4 == rhs.addrLine4)||((this.addrLine4 != null)&&this.addrLine4 .equals(rhs.addrLine4))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.singleAcctgInd == rhs.singleAcctgInd)||((this.singleAcctgInd!= null)&&this.singleAcctgInd.equals(rhs.singleAcctgInd))))&&((this.matchTempReq == rhs.matchTempReq)||((this.matchTempReq!= null)&&this.matchTempReq.equals(rhs.matchTempReq))))&&((this.achOverrideInd == rhs.achOverrideInd)||((this.achOverrideInd!= null)&&this.achOverrideInd.equals(rhs.achOverrideInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.invoiceChoice == rhs.invoiceChoice)||((this.invoiceChoice!= null)&&this.invoiceChoice.equals(rhs.invoiceChoice))))&&((this.crMemoInd == rhs.crMemoInd)||((this.crMemoInd!= null)&&this.crMemoInd.equals(rhs.crMemoInd))));
    }

}
