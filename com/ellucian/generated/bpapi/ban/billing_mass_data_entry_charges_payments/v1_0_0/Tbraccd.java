
package com.ellucian.generated.bpapi.ban.billing_mass_data_entry_charges_payments.v1_0_0;

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
    "currCode",
    "documentNumber",
    "invoiceNumber",
    "name",
    "receiptInd1",
    "id",
    "detailCode",
    "atypCode",
    "atypSeqno",
    "desc"
})
@Generated("jsonschema2pojo")
public class Tbraccd {

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
     * Currency Code
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCode;
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
     * Invoice
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String invoiceNumber;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
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

    public Tbraccd withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency Code
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Tbraccd withCurrCode(String currCode) {
        this.currCode = currCode;
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

    public Tbraccd withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public Tbraccd withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tbraccd withName(String name) {
        this.name = name;
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

    public Tbraccd withReceiptInd1(String receiptInd1) {
        this.receiptInd1 = receiptInd1;
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

    public Tbraccd withId(String id) {
        this.id = id;
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

    public Tbraccd withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public Tbraccd withAtypCode(String atypCode) {
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

    public Tbraccd withAtypSeqno(Double atypSeqno) {
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

    public Tbraccd withDesc(String desc) {
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

    public Tbraccd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbraccd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("receiptInd1");
        sb.append('=');
        sb.append(((this.receiptInd1 == null)?"<null>":this.receiptInd1));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.receiptInd1 == null)? 0 :this.receiptInd1 .hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        if ((other instanceof Tbraccd) == false) {
            return false;
        }
        Tbraccd rhs = ((Tbraccd) other);
        return (((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.receiptInd1 == rhs.receiptInd1)||((this.receiptInd1 != null)&&this.receiptInd1 .equals(rhs.receiptInd1))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
