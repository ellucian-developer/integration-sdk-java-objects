
package com.ellucian.generated.bpapi.ban.student_billing_mass_data_entry_charges_payments.v1_0_0;

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
    "keyblocTermCode",
    "documentNumber",
    "keyblocEffDate",
    "keyblocAmount",
    "detailCode",
    "receiptInd",
    "origChgInd",
    "keyblocDocumentNumber",
    "keyblocDetailCode",
    "id",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentBillingMassDataEntryChargesPayments100PostRequest {

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
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
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
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd")
    private String receiptInd;
    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String origChgInd;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public StudentBillingMassDataEntryChargesPayments100PostRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withDocumentNumber(String documentNumber) {
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withKeyblocEffDate(Date keyblocEffDate) {
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withKeyblocAmount(Double keyblocAmount) {
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd")
    public String getReceiptInd() {
        return receiptInd;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd")
    public void setReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
    }

    public StudentBillingMassDataEntryChargesPayments100PostRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public String getOrigChgInd() {
        return origChgInd;
    }

    /**
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("origChgInd")
    public void setOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
    }

    public StudentBillingMassDataEntryChargesPayments100PostRequest withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withKeyblocDocumentNumber(String keyblocDocumentNumber) {
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withKeyblocDetailCode(String keyblocDetailCode) {
        this.keyblocDetailCode = keyblocDetailCode;
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Description
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
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentBillingMassDataEntryChargesPayments100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentBillingMassDataEntryChargesPayments100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public StudentBillingMassDataEntryChargesPayments100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentBillingMassDataEntryChargesPayments100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
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
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
        sb.append(',');
        sb.append("keyblocDocumentNumber");
        sb.append('=');
        sb.append(((this.keyblocDocumentNumber == null)?"<null>":this.keyblocDocumentNumber));
        sb.append(',');
        sb.append("keyblocDetailCode");
        sb.append('=');
        sb.append(((this.keyblocDetailCode == null)?"<null>":this.keyblocDetailCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.keyblocEffDate == null)? 0 :this.keyblocEffDate.hashCode()));
        result = ((result* 31)+((this.keyblocAmount == null)? 0 :this.keyblocAmount.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.keyblocDocumentNumber == null)? 0 :this.keyblocDocumentNumber.hashCode()));
        result = ((result* 31)+((this.keyblocDetailCode == null)? 0 :this.keyblocDetailCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentBillingMassDataEntryChargesPayments100PostRequest) == false) {
            return false;
        }
        StudentBillingMassDataEntryChargesPayments100PostRequest rhs = ((StudentBillingMassDataEntryChargesPayments100PostRequest) other);
        return (((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.keyblocEffDate == rhs.keyblocEffDate)||((this.keyblocEffDate!= null)&&this.keyblocEffDate.equals(rhs.keyblocEffDate))))&&((this.keyblocAmount == rhs.keyblocAmount)||((this.keyblocAmount!= null)&&this.keyblocAmount.equals(rhs.keyblocAmount))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.keyblocDocumentNumber == rhs.keyblocDocumentNumber)||((this.keyblocDocumentNumber!= null)&&this.keyblocDocumentNumber.equals(rhs.keyblocDocumentNumber))))&&((this.keyblocDetailCode == rhs.keyblocDetailCode)||((this.keyblocDetailCode!= null)&&this.keyblocDetailCode.equals(rhs.keyblocDetailCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
