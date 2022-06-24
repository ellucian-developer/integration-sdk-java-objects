
package com.ellucian.generated.bpapi.ban.billing_mass_data_entry_charges_payments.v1_0_0;

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
    "amount",
    "documentNumber",
    "keyblocEffDate",
    "keyblocAmount",
    "detailCode",
    "keyblocDocumentNumber",
    "keyblocDetailCode",
    "invoiceNumber",
    "id",
    "receiptInd1",
    "atypCode",
    "atypSeqno",
    "desc"
})
@Generated("jsonschema2pojo")
public class BillingMassDataEntryChargesPayments100PostRequest {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AMOUNT")
    private Double amount;
    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    @JsonPropertyDescription("Lineage reference object : keyblocEffDate")
    private Date keyblocEffDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    @JsonPropertyDescription("Lineage reference object : keyblocAmount")
    private Double keyblocAmount;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    @JsonPropertyDescription("Lineage reference object : keyblocDocumentNumber")
    private String keyblocDocumentNumber;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    @JsonPropertyDescription("Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc")
    private String keyblocDetailCode;
    /**
     * Invoice
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String invoiceNumber;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd1")
    private String receiptInd1;
    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_CODE")
    private String atypCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ATYP_SEQNO")
    private Double atypSeqno;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    public Date getKeyblocEffDate() {
        return keyblocEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keyblocEffDate
     * 
     */
    @JsonProperty("keyblocEffDate")
    public void setKeyblocEffDate(Date keyblocEffDate) {
        this.keyblocEffDate = keyblocEffDate;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withKeyblocEffDate(Date keyblocEffDate) {
        this.keyblocEffDate = keyblocEffDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    public Double getKeyblocAmount() {
        return keyblocAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keyblocAmount
     * 
     */
    @JsonProperty("keyblocAmount")
    public void setKeyblocAmount(Double keyblocAmount) {
        this.keyblocAmount = keyblocAmount;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withKeyblocAmount(Double keyblocAmount) {
        this.keyblocAmount = keyblocAmount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    public String getKeyblocDocumentNumber() {
        return keyblocDocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keyblocDocumentNumber
     * 
     */
    @JsonProperty("keyblocDocumentNumber")
    public void setKeyblocDocumentNumber(String keyblocDocumentNumber) {
        this.keyblocDocumentNumber = keyblocDocumentNumber;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withKeyblocDocumentNumber(String keyblocDocumentNumber) {
        this.keyblocDocumentNumber = keyblocDocumentNumber;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    public String getKeyblocDetailCode() {
        return keyblocDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keyblocDetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keyblocDetailCode")
    public void setKeyblocDetailCode(String keyblocDetailCode) {
        this.keyblocDetailCode = keyblocDetailCode;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withKeyblocDetailCode(String keyblocDetailCode) {
        this.keyblocDetailCode = keyblocDetailCode;
        return this;
    }

    /**
     * Invoice
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Invoice
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd1")
    public String getReceiptInd1() {
        return receiptInd1;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd1")
    public void setReceiptInd1(String receiptInd1) {
        this.receiptInd1 = receiptInd1;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withReceiptInd1(String receiptInd1) {
        this.receiptInd1 = receiptInd1;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRACCD_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRACCD_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BillingMassDataEntryChargesPayments100PostRequest withDesc(String desc) {
        this.desc = desc;
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

    public BillingMassDataEntryChargesPayments100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingMassDataEntryChargesPayments100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("keyblocEffDate");
        sb.append('=');
        sb.append(((this.keyblocEffDate == null)?"<null>":this.keyblocEffDate));
        sb.append(',');
        sb.append("keyblocAmount");
        sb.append('=');
        sb.append(((this.keyblocAmount == null)?"<null>":this.keyblocAmount));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("keyblocDocumentNumber");
        sb.append('=');
        sb.append(((this.keyblocDocumentNumber == null)?"<null>":this.keyblocDocumentNumber));
        sb.append(',');
        sb.append("keyblocDetailCode");
        sb.append('=');
        sb.append(((this.keyblocDetailCode == null)?"<null>":this.keyblocDetailCode));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("receiptInd1");
        sb.append('=');
        sb.append(((this.receiptInd1 == null)?"<null>":this.receiptInd1));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.keyblocEffDate == null)? 0 :this.keyblocEffDate.hashCode()));
        result = ((result* 31)+((this.keyblocAmount == null)? 0 :this.keyblocAmount.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.keyblocDocumentNumber == null)? 0 :this.keyblocDocumentNumber.hashCode()));
        result = ((result* 31)+((this.keyblocDetailCode == null)? 0 :this.keyblocDetailCode.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.receiptInd1 == null)? 0 :this.receiptInd1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingMassDataEntryChargesPayments100PostRequest) == false) {
            return false;
        }
        BillingMassDataEntryChargesPayments100PostRequest rhs = ((BillingMassDataEntryChargesPayments100PostRequest) other);
        return (((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.keyblocEffDate == rhs.keyblocEffDate)||((this.keyblocEffDate!= null)&&this.keyblocEffDate.equals(rhs.keyblocEffDate))))&&((this.keyblocAmount == rhs.keyblocAmount)||((this.keyblocAmount!= null)&&this.keyblocAmount.equals(rhs.keyblocAmount))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.keyblocDocumentNumber == rhs.keyblocDocumentNumber)||((this.keyblocDocumentNumber!= null)&&this.keyblocDocumentNumber.equals(rhs.keyblocDocumentNumber))))&&((this.keyblocDetailCode == rhs.keyblocDetailCode)||((this.keyblocDetailCode!= null)&&this.keyblocDetailCode.equals(rhs.keyblocDetailCode))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.receiptInd1 == rhs.receiptInd1)||((this.receiptInd1 != null)&&this.receiptInd1 .equals(rhs.receiptInd1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
