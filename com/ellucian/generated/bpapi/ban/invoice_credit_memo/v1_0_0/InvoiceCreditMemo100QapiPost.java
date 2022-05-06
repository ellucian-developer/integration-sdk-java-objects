
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
    "faainvhDocCode",
    "invoiceChoice",
    "vendor",
    "invoiceDate",
    "faainvhVendCheckCode",
    "transDate",
    "singleAcctgInd",
    "pmtDueDate",
    "matchTempReq",
    "houseNumber",
    "bankCode",
    "vendInvCode",
    "addrLine4",
    "achtCode",
    "crMemoInd",
    "1099Ind",
    "achOverrideInd",
    "headerText",
    "multipleInvInd",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemo100QapiPost {

    @JsonProperty("faainvhDocCode")
    private String faainvhDocCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    private String invoiceChoice;
    @JsonProperty("vendor")
    private String vendor;
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
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faainvhVendCheckCode")
    private String faainvhVendCheckCode;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
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
     * Payment Due
     * <p>
     * Lineage reference object : FABINVH_PMT_DUE_DATE
     * 
     */
    @JsonProperty("pmtDueDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_PMT_DUE_DATE")
    private Date pmtDueDate;
    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchTempReq")
    private String matchTempReq;
    @JsonProperty("houseNumber")
    private String houseNumber;
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
     * Vendor Invoice
     * <p>
     * Lineage reference object : FABINVH_VEND_INV_CODE
     * 
     */
    @JsonProperty("vendInvCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_VEND_INV_CODE")
    private String vendInvCode;
    @JsonProperty("addrLine4")
    private String addrLine4;
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
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String crMemoInd;
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
     * Direct Deposit Override
     * <p>
     * Lineage reference object : FABINVH_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACH_OVERRIDE_IND")
    private String achOverrideInd;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerText")
    private String headerText;
    @JsonProperty("multipleInvInd")
    private String multipleInvInd;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faainvhDocCode")
    public String getFaainvhDocCode() {
        return faainvhDocCode;
    }

    @JsonProperty("faainvhDocCode")
    public void setFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
    }

    public InvoiceCreditMemo100QapiPost withFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    public String getInvoiceChoice() {
        return invoiceChoice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("invoiceChoice")
    public void setInvoiceChoice(String invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
    }

    public InvoiceCreditMemo100QapiPost withInvoiceChoice(String invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
        return this;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public InvoiceCreditMemo100QapiPost withVendor(String vendor) {
        this.vendor = vendor;
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

    public InvoiceCreditMemo100QapiPost withInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
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

    public InvoiceCreditMemo100QapiPost withFaainvhVendCheckCode(String faainvhVendCheckCode) {
        this.faainvhVendCheckCode = faainvhVendCheckCode;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FABINVH_TRANS_DATE
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
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public InvoiceCreditMemo100QapiPost withTransDate(Date transDate) {
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

    public InvoiceCreditMemo100QapiPost withSingleAcctgInd(String singleAcctgInd) {
        this.singleAcctgInd = singleAcctgInd;
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

    public InvoiceCreditMemo100QapiPost withPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
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

    public InvoiceCreditMemo100QapiPost withMatchTempReq(String matchTempReq) {
        this.matchTempReq = matchTempReq;
        return this;
    }

    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public InvoiceCreditMemo100QapiPost withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public InvoiceCreditMemo100QapiPost withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public InvoiceCreditMemo100QapiPost withVendInvCode(String vendInvCode) {
        this.vendInvCode = vendInvCode;
        return this;
    }

    @JsonProperty("addrLine4")
    public String getAddrLine4() {
        return addrLine4;
    }

    @JsonProperty("addrLine4")
    public void setAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
    }

    public InvoiceCreditMemo100QapiPost withAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
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

    public InvoiceCreditMemo100QapiPost withAchtCode(String achtCode) {
        this.achtCode = achtCode;
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

    public InvoiceCreditMemo100QapiPost withCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
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

    public InvoiceCreditMemo100QapiPost with1099Ind(String _1099Ind) {
        this._1099Ind = _1099Ind;
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

    public InvoiceCreditMemo100QapiPost withAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
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

    public InvoiceCreditMemo100QapiPost withHeaderText(String headerText) {
        this.headerText = headerText;
        return this;
    }

    @JsonProperty("multipleInvInd")
    public String getMultipleInvInd() {
        return multipleInvInd;
    }

    @JsonProperty("multipleInvInd")
    public void setMultipleInvInd(String multipleInvInd) {
        this.multipleInvInd = multipleInvInd;
    }

    public InvoiceCreditMemo100QapiPost withMultipleInvInd(String multipleInvInd) {
        this.multipleInvInd = multipleInvInd;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InvoiceCreditMemo100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public InvoiceCreditMemo100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public InvoiceCreditMemo100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemo100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faainvhDocCode");
        sb.append('=');
        sb.append(((this.faainvhDocCode == null)?"<null>":this.faainvhDocCode));
        sb.append(',');
        sb.append("invoiceChoice");
        sb.append('=');
        sb.append(((this.invoiceChoice == null)?"<null>":this.invoiceChoice));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("invoiceDate");
        sb.append('=');
        sb.append(((this.invoiceDate == null)?"<null>":this.invoiceDate));
        sb.append(',');
        sb.append("faainvhVendCheckCode");
        sb.append('=');
        sb.append(((this.faainvhVendCheckCode == null)?"<null>":this.faainvhVendCheckCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("singleAcctgInd");
        sb.append('=');
        sb.append(((this.singleAcctgInd == null)?"<null>":this.singleAcctgInd));
        sb.append(',');
        sb.append("pmtDueDate");
        sb.append('=');
        sb.append(((this.pmtDueDate == null)?"<null>":this.pmtDueDate));
        sb.append(',');
        sb.append("matchTempReq");
        sb.append('=');
        sb.append(((this.matchTempReq == null)?"<null>":this.matchTempReq));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("vendInvCode");
        sb.append('=');
        sb.append(((this.vendInvCode == null)?"<null>":this.vendInvCode));
        sb.append(',');
        sb.append("addrLine4");
        sb.append('=');
        sb.append(((this.addrLine4 == null)?"<null>":this.addrLine4));
        sb.append(',');
        sb.append("achtCode");
        sb.append('=');
        sb.append(((this.achtCode == null)?"<null>":this.achtCode));
        sb.append(',');
        sb.append("crMemoInd");
        sb.append('=');
        sb.append(((this.crMemoInd == null)?"<null>":this.crMemoInd));
        sb.append(',');
        sb.append("_1099Ind");
        sb.append('=');
        sb.append(((this._1099Ind == null)?"<null>":this._1099Ind));
        sb.append(',');
        sb.append("achOverrideInd");
        sb.append('=');
        sb.append(((this.achOverrideInd == null)?"<null>":this.achOverrideInd));
        sb.append(',');
        sb.append("headerText");
        sb.append('=');
        sb.append(((this.headerText == null)?"<null>":this.headerText));
        sb.append(',');
        sb.append("multipleInvInd");
        sb.append('=');
        sb.append(((this.multipleInvInd == null)?"<null>":this.multipleInvInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        if ((other instanceof InvoiceCreditMemo100QapiPost) == false) {
            return false;
        }
        InvoiceCreditMemo100QapiPost rhs = ((InvoiceCreditMemo100QapiPost) other);
        return (((((((((((((((((((((((this.pmtDueDate == rhs.pmtDueDate)||((this.pmtDueDate!= null)&&this.pmtDueDate.equals(rhs.pmtDueDate)))&&((this.multipleInvInd == rhs.multipleInvInd)||((this.multipleInvInd!= null)&&this.multipleInvInd.equals(rhs.multipleInvInd))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.headerText == rhs.headerText)||((this.headerText!= null)&&this.headerText.equals(rhs.headerText))))&&((this.vendInvCode == rhs.vendInvCode)||((this.vendInvCode!= null)&&this.vendInvCode.equals(rhs.vendInvCode))))&&((this._1099Ind == rhs._1099Ind)||((this._1099Ind!= null)&&this._1099Ind.equals(rhs._1099Ind))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.invoiceDate == rhs.invoiceDate)||((this.invoiceDate!= null)&&this.invoiceDate.equals(rhs.invoiceDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))))&&((this.faainvhVendCheckCode == rhs.faainvhVendCheckCode)||((this.faainvhVendCheckCode!= null)&&this.faainvhVendCheckCode.equals(rhs.faainvhVendCheckCode))))&&((this.faainvhDocCode == rhs.faainvhDocCode)||((this.faainvhDocCode!= null)&&this.faainvhDocCode.equals(rhs.faainvhDocCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrLine4 == rhs.addrLine4)||((this.addrLine4 != null)&&this.addrLine4 .equals(rhs.addrLine4))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.singleAcctgInd == rhs.singleAcctgInd)||((this.singleAcctgInd!= null)&&this.singleAcctgInd.equals(rhs.singleAcctgInd))))&&((this.matchTempReq == rhs.matchTempReq)||((this.matchTempReq!= null)&&this.matchTempReq.equals(rhs.matchTempReq))))&&((this.achOverrideInd == rhs.achOverrideInd)||((this.achOverrideInd!= null)&&this.achOverrideInd.equals(rhs.achOverrideInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.invoiceChoice == rhs.invoiceChoice)||((this.invoiceChoice!= null)&&this.invoiceChoice.equals(rhs.invoiceChoice))))&&((this.crMemoInd == rhs.crMemoInd)||((this.crMemoInd!= null)&&this.crMemoInd.equals(rhs.crMemoInd))));
    }

}
