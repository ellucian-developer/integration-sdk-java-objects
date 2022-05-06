
package com.ellucian.generated.bpapi.ban.biling_mass_data_entry_deposits.v1_0_0;

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
    "keybloc2DetailCode",
    "minAmount",
    "amount",
    "releaseDate",
    "keybloc2ExpirationDate",
    "keybloc2MinAmount",
    "keybloc2DocumentNumber",
    "detailCodePayment",
    "detailCodeDeposit",
    "keybloc2Amount",
    "keybloc2DetailCodePay",
    "keybloc2ReleaseDate",
    "keybloc2EffDate",
    "receiptInd2",
    "id",
    "atypCode",
    "atypSeqno",
    "desc",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class BilingMassDataEntryDeposits100PostRequest {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCode")
    private Object keybloc2DetailCode;
    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_MIN_AMOUNT")
    private Double minAmount;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AMOUNT")
    private Double amount;
    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RELEASE_DATE")
    private Date releaseDate;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ExpirationDate")
    private Object keybloc2ExpirationDate;
    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    @JsonPropertyDescription("Lineage reference object : keybloc2MinAmount")
    private Object keybloc2MinAmount;
    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    @JsonPropertyDescription("Lineage reference object : keybloc2DocumentNumber")
    private Object keybloc2DocumentNumber;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodePayment")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc")
    private String detailCodePayment;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT")
    private String detailCodeDeposit;
    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    @JsonPropertyDescription("Lineage reference object : keybloc2Amount")
    private Object keybloc2Amount;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc")
    private Object keybloc2DetailCodePay;
    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ReleaseDate")
    private Object keybloc2ReleaseDate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2EffDate")
    private Object keybloc2EffDate;
    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd2")
    private String receiptInd2;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ATYP_CODE")
    private String atypCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ATYP_SEQNO")
    private Double atypSeqno;
    /**
     * Deposit Code Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DESC")
    private String desc;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    public Object getKeybloc2DetailCode() {
        return keybloc2DetailCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    public void setKeybloc2DetailCode(Object keybloc2DetailCode) {
        this.keybloc2DetailCode = keybloc2DetailCode;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2DetailCode(Object keybloc2DetailCode) {
        this.keybloc2DetailCode = keybloc2DetailCode;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public BilingMassDataEntryDeposits100PostRequest withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
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
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BilingMassDataEntryDeposits100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BilingMassDataEntryDeposits100PostRequest withReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public Object getKeybloc2ExpirationDate() {
        return keybloc2ExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public void setKeybloc2ExpirationDate(Object keybloc2ExpirationDate) {
        this.keybloc2ExpirationDate = keybloc2ExpirationDate;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2ExpirationDate(Object keybloc2ExpirationDate) {
        this.keybloc2ExpirationDate = keybloc2ExpirationDate;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    public Object getKeybloc2MinAmount() {
        return keybloc2MinAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    public void setKeybloc2MinAmount(Object keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2MinAmount(Object keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public Object getKeybloc2DocumentNumber() {
        return keybloc2DocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public void setKeybloc2DocumentNumber(Object keybloc2DocumentNumber) {
        this.keybloc2DocumentNumber = keybloc2DocumentNumber;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2DocumentNumber(Object keybloc2DocumentNumber) {
        this.keybloc2DocumentNumber = keybloc2DocumentNumber;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodePayment")
    public String getDetailCodePayment() {
        return detailCodePayment;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodePayment")
    public void setDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
    }

    public BilingMassDataEntryDeposits100PostRequest withDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public String getDetailCodeDeposit() {
        return detailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public void setDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
    }

    public BilingMassDataEntryDeposits100PostRequest withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public Object getKeybloc2Amount() {
        return keybloc2Amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public void setKeybloc2Amount(Object keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2Amount(Object keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public Object getKeybloc2DetailCodePay() {
        return keybloc2DetailCodePay;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public void setKeybloc2DetailCodePay(Object keybloc2DetailCodePay) {
        this.keybloc2DetailCodePay = keybloc2DetailCodePay;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2DetailCodePay(Object keybloc2DetailCodePay) {
        this.keybloc2DetailCodePay = keybloc2DetailCodePay;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    public Object getKeybloc2ReleaseDate() {
        return keybloc2ReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    public void setKeybloc2ReleaseDate(Object keybloc2ReleaseDate) {
        this.keybloc2ReleaseDate = keybloc2ReleaseDate;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2ReleaseDate(Object keybloc2ReleaseDate) {
        this.keybloc2ReleaseDate = keybloc2ReleaseDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    public Object getKeybloc2EffDate() {
        return keybloc2EffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    public void setKeybloc2EffDate(Object keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
    }

    public BilingMassDataEntryDeposits100PostRequest withKeybloc2EffDate(Object keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
        return this;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd2")
    public String getReceiptInd2() {
        return receiptInd2;
    }

    /**
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd2")
    public void setReceiptInd2(String receiptInd2) {
        this.receiptInd2 = receiptInd2;
    }

    public BilingMassDataEntryDeposits100PostRequest withReceiptInd2(String receiptInd2) {
        this.receiptInd2 = receiptInd2;
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

    public BilingMassDataEntryDeposits100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_CODE
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
     * Lineage reference object : TBRDEPO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public BilingMassDataEntryDeposits100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
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
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public BilingMassDataEntryDeposits100PostRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    /**
     * Deposit Code Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Deposit Code Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BilingMassDataEntryDeposits100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BilingMassDataEntryDeposits100PostRequest withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public BilingMassDataEntryDeposits100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BilingMassDataEntryDeposits100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keybloc2DetailCode");
        sb.append('=');
        sb.append(((this.keybloc2DetailCode == null)?"<null>":this.keybloc2DetailCode));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("keybloc2ExpirationDate");
        sb.append('=');
        sb.append(((this.keybloc2ExpirationDate == null)?"<null>":this.keybloc2ExpirationDate));
        sb.append(',');
        sb.append("keybloc2MinAmount");
        sb.append('=');
        sb.append(((this.keybloc2MinAmount == null)?"<null>":this.keybloc2MinAmount));
        sb.append(',');
        sb.append("keybloc2DocumentNumber");
        sb.append('=');
        sb.append(((this.keybloc2DocumentNumber == null)?"<null>":this.keybloc2DocumentNumber));
        sb.append(',');
        sb.append("detailCodePayment");
        sb.append('=');
        sb.append(((this.detailCodePayment == null)?"<null>":this.detailCodePayment));
        sb.append(',');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("keybloc2Amount");
        sb.append('=');
        sb.append(((this.keybloc2Amount == null)?"<null>":this.keybloc2Amount));
        sb.append(',');
        sb.append("keybloc2DetailCodePay");
        sb.append('=');
        sb.append(((this.keybloc2DetailCodePay == null)?"<null>":this.keybloc2DetailCodePay));
        sb.append(',');
        sb.append("keybloc2ReleaseDate");
        sb.append('=');
        sb.append(((this.keybloc2ReleaseDate == null)?"<null>":this.keybloc2ReleaseDate));
        sb.append(',');
        sb.append("keybloc2EffDate");
        sb.append('=');
        sb.append(((this.keybloc2EffDate == null)?"<null>":this.keybloc2EffDate));
        sb.append(',');
        sb.append("receiptInd2");
        sb.append('=');
        sb.append(((this.receiptInd2 == null)?"<null>":this.receiptInd2));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.keybloc2DetailCode == null)? 0 :this.keybloc2DetailCode.hashCode()));
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.keybloc2ExpirationDate == null)? 0 :this.keybloc2ExpirationDate.hashCode()));
        result = ((result* 31)+((this.keybloc2MinAmount == null)? 0 :this.keybloc2MinAmount.hashCode()));
        result = ((result* 31)+((this.keybloc2DocumentNumber == null)? 0 :this.keybloc2DocumentNumber.hashCode()));
        result = ((result* 31)+((this.detailCodePayment == null)? 0 :this.detailCodePayment.hashCode()));
        result = ((result* 31)+((this.detailCodeDeposit == null)? 0 :this.detailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.keybloc2Amount == null)? 0 :this.keybloc2Amount.hashCode()));
        result = ((result* 31)+((this.keybloc2DetailCodePay == null)? 0 :this.keybloc2DetailCodePay.hashCode()));
        result = ((result* 31)+((this.keybloc2ReleaseDate == null)? 0 :this.keybloc2ReleaseDate.hashCode()));
        result = ((result* 31)+((this.keybloc2EffDate == null)? 0 :this.keybloc2EffDate.hashCode()));
        result = ((result* 31)+((this.receiptInd2 == null)? 0 :this.receiptInd2 .hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BilingMassDataEntryDeposits100PostRequest) == false) {
            return false;
        }
        BilingMassDataEntryDeposits100PostRequest rhs = ((BilingMassDataEntryDeposits100PostRequest) other);
        return (((((((((((((((((((((this.keybloc2DetailCode == rhs.keybloc2DetailCode)||((this.keybloc2DetailCode!= null)&&this.keybloc2DetailCode.equals(rhs.keybloc2DetailCode)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.keybloc2ExpirationDate == rhs.keybloc2ExpirationDate)||((this.keybloc2ExpirationDate!= null)&&this.keybloc2ExpirationDate.equals(rhs.keybloc2ExpirationDate))))&&((this.keybloc2MinAmount == rhs.keybloc2MinAmount)||((this.keybloc2MinAmount!= null)&&this.keybloc2MinAmount.equals(rhs.keybloc2MinAmount))))&&((this.keybloc2DocumentNumber == rhs.keybloc2DocumentNumber)||((this.keybloc2DocumentNumber!= null)&&this.keybloc2DocumentNumber.equals(rhs.keybloc2DocumentNumber))))&&((this.detailCodePayment == rhs.detailCodePayment)||((this.detailCodePayment!= null)&&this.detailCodePayment.equals(rhs.detailCodePayment))))&&((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit))))&&((this.keybloc2Amount == rhs.keybloc2Amount)||((this.keybloc2Amount!= null)&&this.keybloc2Amount.equals(rhs.keybloc2Amount))))&&((this.keybloc2DetailCodePay == rhs.keybloc2DetailCodePay)||((this.keybloc2DetailCodePay!= null)&&this.keybloc2DetailCodePay.equals(rhs.keybloc2DetailCodePay))))&&((this.keybloc2ReleaseDate == rhs.keybloc2ReleaseDate)||((this.keybloc2ReleaseDate!= null)&&this.keybloc2ReleaseDate.equals(rhs.keybloc2ReleaseDate))))&&((this.keybloc2EffDate == rhs.keybloc2EffDate)||((this.keybloc2EffDate!= null)&&this.keybloc2EffDate.equals(rhs.keybloc2EffDate))))&&((this.receiptInd2 == rhs.receiptInd2)||((this.receiptInd2 != null)&&this.receiptInd2 .equals(rhs.receiptInd2))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
