
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
    "faainvhDocCode",
    "fabinvhSingleAcctgInd",
    "vendor",
    "invoiceChoice",
    "fabinvhInvoiceDate",
    "fabinvhVendInvCode",
    "fabinvhCrMemoInd"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemo100PostRequest {

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
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * 
     */
    @JsonProperty("faainvhDocCode")
    @JsonPropertyDescription("Lineage reference object : faainvhDocCode")
    private String faainvhDocCode;
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
     * Vendor
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Lineage reference object : keyBlockVendor")
    private String vendor;
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
     * Credit Memo
     * <p>
     * Lineage reference object : FABINVH_CR_MEMO_IND
     * 
     */
    @JsonProperty("fabinvhCrMemoInd")
    @JsonPropertyDescription("Lineage reference object : FABINVH_CR_MEMO_IND")
    private String fabinvhCrMemoInd;
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

    public InvoiceCreditMemo100PostRequest withPmtDueDate(Date pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
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

    public InvoiceCreditMemo100PostRequest withFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
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

    public InvoiceCreditMemo100PostRequest withFabinvhSingleAcctgInd(String fabinvhSingleAcctgInd) {
        this.fabinvhSingleAcctgInd = fabinvhSingleAcctgInd;
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

    public InvoiceCreditMemo100PostRequest withVendor(String vendor) {
        this.vendor = vendor;
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

    public InvoiceCreditMemo100PostRequest withInvoiceChoice(String invoiceChoice) {
        this.invoiceChoice = invoiceChoice;
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

    public InvoiceCreditMemo100PostRequest withFabinvhInvoiceDate(Date fabinvhInvoiceDate) {
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

    public InvoiceCreditMemo100PostRequest withFabinvhVendInvCode(String fabinvhVendInvCode) {
        this.fabinvhVendInvCode = fabinvhVendInvCode;
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

    public InvoiceCreditMemo100PostRequest withFabinvhCrMemoInd(String fabinvhCrMemoInd) {
        this.fabinvhCrMemoInd = fabinvhCrMemoInd;
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

    public InvoiceCreditMemo100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemo100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pmtDueDate");
        sb.append('=');
        sb.append(((this.pmtDueDate == null)?"<null>":this.pmtDueDate));
        sb.append(',');
        sb.append("faainvhDocCode");
        sb.append('=');
        sb.append(((this.faainvhDocCode == null)?"<null>":this.faainvhDocCode));
        sb.append(',');
        sb.append("fabinvhSingleAcctgInd");
        sb.append('=');
        sb.append(((this.fabinvhSingleAcctgInd == null)?"<null>":this.fabinvhSingleAcctgInd));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("invoiceChoice");
        sb.append('=');
        sb.append(((this.invoiceChoice == null)?"<null>":this.invoiceChoice));
        sb.append(',');
        sb.append("fabinvhInvoiceDate");
        sb.append('=');
        sb.append(((this.fabinvhInvoiceDate == null)?"<null>":this.fabinvhInvoiceDate));
        sb.append(',');
        sb.append("fabinvhVendInvCode");
        sb.append('=');
        sb.append(((this.fabinvhVendInvCode == null)?"<null>":this.fabinvhVendInvCode));
        sb.append(',');
        sb.append("fabinvhCrMemoInd");
        sb.append('=');
        sb.append(((this.fabinvhCrMemoInd == null)?"<null>":this.fabinvhCrMemoInd));
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
        result = ((result* 31)+((this.faainvhDocCode == null)? 0 :this.faainvhDocCode.hashCode()));
        result = ((result* 31)+((this.fabinvhSingleAcctgInd == null)? 0 :this.fabinvhSingleAcctgInd.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.invoiceChoice == null)? 0 :this.invoiceChoice.hashCode()));
        result = ((result* 31)+((this.fabinvhInvoiceDate == null)? 0 :this.fabinvhInvoiceDate.hashCode()));
        result = ((result* 31)+((this.fabinvhVendInvCode == null)? 0 :this.fabinvhVendInvCode.hashCode()));
        result = ((result* 31)+((this.fabinvhCrMemoInd == null)? 0 :this.fabinvhCrMemoInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemo100PostRequest) == false) {
            return false;
        }
        InvoiceCreditMemo100PostRequest rhs = ((InvoiceCreditMemo100PostRequest) other);
        return ((((((((((this.pmtDueDate == rhs.pmtDueDate)||((this.pmtDueDate!= null)&&this.pmtDueDate.equals(rhs.pmtDueDate)))&&((this.faainvhDocCode == rhs.faainvhDocCode)||((this.faainvhDocCode!= null)&&this.faainvhDocCode.equals(rhs.faainvhDocCode))))&&((this.fabinvhSingleAcctgInd == rhs.fabinvhSingleAcctgInd)||((this.fabinvhSingleAcctgInd!= null)&&this.fabinvhSingleAcctgInd.equals(rhs.fabinvhSingleAcctgInd))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.invoiceChoice == rhs.invoiceChoice)||((this.invoiceChoice!= null)&&this.invoiceChoice.equals(rhs.invoiceChoice))))&&((this.fabinvhInvoiceDate == rhs.fabinvhInvoiceDate)||((this.fabinvhInvoiceDate!= null)&&this.fabinvhInvoiceDate.equals(rhs.fabinvhInvoiceDate))))&&((this.fabinvhVendInvCode == rhs.fabinvhVendInvCode)||((this.fabinvhVendInvCode!= null)&&this.fabinvhVendInvCode.equals(rhs.fabinvhVendInvCode))))&&((this.fabinvhCrMemoInd == rhs.fabinvhCrMemoInd)||((this.fabinvhCrMemoInd!= null)&&this.fabinvhCrMemoInd.equals(rhs.fabinvhCrMemoInd))));
    }

}
