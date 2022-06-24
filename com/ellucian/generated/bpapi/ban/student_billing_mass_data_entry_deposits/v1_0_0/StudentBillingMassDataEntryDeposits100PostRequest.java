
package com.ellucian.generated.bpapi.ban.student_billing_mass_data_entry_deposits.v1_0_0;

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
    "documentNumber",
    "keybloc2ExpirationDate",
    "keybloc2MinAmount",
    "keybloc2TermCode",
    "keybloc2DocumentNumber",
    "detailCodePayment",
    "receiptInd",
    "detailCodeDeposit",
    "autoReleaseInd",
    "keybloc2Amount",
    "keybloc2AutoReleaseInd",
    "keybloc2DetailCodePay",
    "keybloc2ReleaseDate",
    "keybloc2EffDate",
    "id",
    "desc",
    "termCode",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class StudentBillingMassDataEntryDeposits100PostRequest {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCode")
    private String keybloc2DetailCode;
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
     * Document
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ExpirationDate")
    private Date keybloc2ExpirationDate;
    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    @JsonPropertyDescription("Lineage reference object : keybloc2MinAmount")
    private Double keybloc2MinAmount;
    /**
     * Term
     * <p>
     * Lineage reference object : keybloc2TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc2TermCode")
    @JsonPropertyDescription("Lineage reference object : keybloc2TermCode, Lookup lineage reference object : stvterm")
    private String keybloc2TermCode;
    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    @JsonPropertyDescription("Lineage reference object : keybloc2DocumentNumber")
    private String keybloc2DocumentNumber;
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
     * Receipt
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiptInd")
    private String receiptInd;
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
     * Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AUTO_RELEASE_IND")
    private String autoReleaseInd;
    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    @JsonPropertyDescription("Lineage reference object : keybloc2Amount")
    private Double keybloc2Amount;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : keybloc2AutoReleaseInd
     * 
     */
    @JsonProperty("keybloc2AutoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : keybloc2AutoReleaseInd")
    private String keybloc2AutoReleaseInd;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    @JsonPropertyDescription("Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc")
    private String keybloc2DetailCodePay;
    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2ReleaseDate")
    private Date keybloc2ReleaseDate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    @JsonPropertyDescription("Lineage reference object : keybloc2EffDate")
    private Date keybloc2EffDate;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
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
     * Term
     * <p>
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
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
    public String getKeybloc2DetailCode() {
        return keybloc2DetailCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : keybloc2DetailCode
     * 
     */
    @JsonProperty("keybloc2DetailCode")
    public void setKeybloc2DetailCode(String keybloc2DetailCode) {
        this.keybloc2DetailCode = keybloc2DetailCode;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2DetailCode(String keybloc2DetailCode) {
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

    public StudentBillingMassDataEntryDeposits100PostRequest withMinAmount(Double minAmount) {
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

    public StudentBillingMassDataEntryDeposits100PostRequest withAmount(Double amount) {
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

    public StudentBillingMassDataEntryDeposits100PostRequest withReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public Date getKeybloc2ExpirationDate() {
        return keybloc2ExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc2ExpirationDate
     * 
     */
    @JsonProperty("keybloc2ExpirationDate")
    public void setKeybloc2ExpirationDate(Date keybloc2ExpirationDate) {
        this.keybloc2ExpirationDate = keybloc2ExpirationDate;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2ExpirationDate(Date keybloc2ExpirationDate) {
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
    public Double getKeybloc2MinAmount() {
        return keybloc2MinAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : keybloc2MinAmount
     * 
     */
    @JsonProperty("keybloc2MinAmount")
    public void setKeybloc2MinAmount(Double keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2MinAmount(Double keybloc2MinAmount) {
        this.keybloc2MinAmount = keybloc2MinAmount;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keybloc2TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc2TermCode")
    public String getKeybloc2TermCode() {
        return keybloc2TermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keybloc2TermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keybloc2TermCode")
    public void setKeybloc2TermCode(String keybloc2TermCode) {
        this.keybloc2TermCode = keybloc2TermCode;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2TermCode(String keybloc2TermCode) {
        this.keybloc2TermCode = keybloc2TermCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public String getKeybloc2DocumentNumber() {
        return keybloc2DocumentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keybloc2DocumentNumber
     * 
     */
    @JsonProperty("keybloc2DocumentNumber")
    public void setKeybloc2DocumentNumber(String keybloc2DocumentNumber) {
        this.keybloc2DocumentNumber = keybloc2DocumentNumber;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2DocumentNumber(String keybloc2DocumentNumber) {
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

    public StudentBillingMassDataEntryDeposits100PostRequest withDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
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

    public StudentBillingMassDataEntryDeposits100PostRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
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

    public StudentBillingMassDataEntryDeposits100PostRequest withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public String getAutoReleaseInd() {
        return autoReleaseInd;
    }

    /**
     * Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public void setAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public Double getKeybloc2Amount() {
        return keybloc2Amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc2Amount
     * 
     */
    @JsonProperty("keybloc2Amount")
    public void setKeybloc2Amount(Double keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2Amount(Double keybloc2Amount) {
        this.keybloc2Amount = keybloc2Amount;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : keybloc2AutoReleaseInd
     * 
     */
    @JsonProperty("keybloc2AutoReleaseInd")
    public String getKeybloc2AutoReleaseInd() {
        return keybloc2AutoReleaseInd;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : keybloc2AutoReleaseInd
     * 
     */
    @JsonProperty("keybloc2AutoReleaseInd")
    public void setKeybloc2AutoReleaseInd(String keybloc2AutoReleaseInd) {
        this.keybloc2AutoReleaseInd = keybloc2AutoReleaseInd;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2AutoReleaseInd(String keybloc2AutoReleaseInd) {
        this.keybloc2AutoReleaseInd = keybloc2AutoReleaseInd;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public String getKeybloc2DetailCodePay() {
        return keybloc2DetailCodePay;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : keybloc2DetailCodePay, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc2DetailCodePay")
    public void setKeybloc2DetailCodePay(String keybloc2DetailCodePay) {
        this.keybloc2DetailCodePay = keybloc2DetailCodePay;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2DetailCodePay(String keybloc2DetailCodePay) {
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
    public Date getKeybloc2ReleaseDate() {
        return keybloc2ReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : keybloc2ReleaseDate
     * 
     */
    @JsonProperty("keybloc2ReleaseDate")
    public void setKeybloc2ReleaseDate(Date keybloc2ReleaseDate) {
        this.keybloc2ReleaseDate = keybloc2ReleaseDate;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2ReleaseDate(Date keybloc2ReleaseDate) {
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
    public Date getKeybloc2EffDate() {
        return keybloc2EffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : keybloc2EffDate
     * 
     */
    @JsonProperty("keybloc2EffDate")
    public void setKeybloc2EffDate(Date keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withKeybloc2EffDate(Date keybloc2EffDate) {
        this.keybloc2EffDate = keybloc2EffDate;
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

    public StudentBillingMassDataEntryDeposits100PostRequest withId(String id) {
        this.id = id;
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

    public StudentBillingMassDataEntryDeposits100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
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
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentBillingMassDataEntryDeposits100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public StudentBillingMassDataEntryDeposits100PostRequest withExpirationDate(Date expirationDate) {
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

    public StudentBillingMassDataEntryDeposits100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentBillingMassDataEntryDeposits100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("keybloc2ExpirationDate");
        sb.append('=');
        sb.append(((this.keybloc2ExpirationDate == null)?"<null>":this.keybloc2ExpirationDate));
        sb.append(',');
        sb.append("keybloc2MinAmount");
        sb.append('=');
        sb.append(((this.keybloc2MinAmount == null)?"<null>":this.keybloc2MinAmount));
        sb.append(',');
        sb.append("keybloc2TermCode");
        sb.append('=');
        sb.append(((this.keybloc2TermCode == null)?"<null>":this.keybloc2TermCode));
        sb.append(',');
        sb.append("keybloc2DocumentNumber");
        sb.append('=');
        sb.append(((this.keybloc2DocumentNumber == null)?"<null>":this.keybloc2DocumentNumber));
        sb.append(',');
        sb.append("detailCodePayment");
        sb.append('=');
        sb.append(((this.detailCodePayment == null)?"<null>":this.detailCodePayment));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
        sb.append(',');
        sb.append("keybloc2Amount");
        sb.append('=');
        sb.append(((this.keybloc2Amount == null)?"<null>":this.keybloc2Amount));
        sb.append(',');
        sb.append("keybloc2AutoReleaseInd");
        sb.append('=');
        sb.append(((this.keybloc2AutoReleaseInd == null)?"<null>":this.keybloc2AutoReleaseInd));
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
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.keybloc2ExpirationDate == null)? 0 :this.keybloc2ExpirationDate.hashCode()));
        result = ((result* 31)+((this.keybloc2MinAmount == null)? 0 :this.keybloc2MinAmount.hashCode()));
        result = ((result* 31)+((this.keybloc2TermCode == null)? 0 :this.keybloc2TermCode.hashCode()));
        result = ((result* 31)+((this.keybloc2DocumentNumber == null)? 0 :this.keybloc2DocumentNumber.hashCode()));
        result = ((result* 31)+((this.detailCodePayment == null)? 0 :this.detailCodePayment.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.detailCodeDeposit == null)? 0 :this.detailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.autoReleaseInd == null)? 0 :this.autoReleaseInd.hashCode()));
        result = ((result* 31)+((this.keybloc2Amount == null)? 0 :this.keybloc2Amount.hashCode()));
        result = ((result* 31)+((this.keybloc2AutoReleaseInd == null)? 0 :this.keybloc2AutoReleaseInd.hashCode()));
        result = ((result* 31)+((this.keybloc2DetailCodePay == null)? 0 :this.keybloc2DetailCodePay.hashCode()));
        result = ((result* 31)+((this.keybloc2ReleaseDate == null)? 0 :this.keybloc2ReleaseDate.hashCode()));
        result = ((result* 31)+((this.keybloc2EffDate == null)? 0 :this.keybloc2EffDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentBillingMassDataEntryDeposits100PostRequest) == false) {
            return false;
        }
        StudentBillingMassDataEntryDeposits100PostRequest rhs = ((StudentBillingMassDataEntryDeposits100PostRequest) other);
        return ((((((((((((((((((((((((this.keybloc2DetailCode == rhs.keybloc2DetailCode)||((this.keybloc2DetailCode!= null)&&this.keybloc2DetailCode.equals(rhs.keybloc2DetailCode)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.keybloc2ExpirationDate == rhs.keybloc2ExpirationDate)||((this.keybloc2ExpirationDate!= null)&&this.keybloc2ExpirationDate.equals(rhs.keybloc2ExpirationDate))))&&((this.keybloc2MinAmount == rhs.keybloc2MinAmount)||((this.keybloc2MinAmount!= null)&&this.keybloc2MinAmount.equals(rhs.keybloc2MinAmount))))&&((this.keybloc2TermCode == rhs.keybloc2TermCode)||((this.keybloc2TermCode!= null)&&this.keybloc2TermCode.equals(rhs.keybloc2TermCode))))&&((this.keybloc2DocumentNumber == rhs.keybloc2DocumentNumber)||((this.keybloc2DocumentNumber!= null)&&this.keybloc2DocumentNumber.equals(rhs.keybloc2DocumentNumber))))&&((this.detailCodePayment == rhs.detailCodePayment)||((this.detailCodePayment!= null)&&this.detailCodePayment.equals(rhs.detailCodePayment))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit))))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.keybloc2Amount == rhs.keybloc2Amount)||((this.keybloc2Amount!= null)&&this.keybloc2Amount.equals(rhs.keybloc2Amount))))&&((this.keybloc2AutoReleaseInd == rhs.keybloc2AutoReleaseInd)||((this.keybloc2AutoReleaseInd!= null)&&this.keybloc2AutoReleaseInd.equals(rhs.keybloc2AutoReleaseInd))))&&((this.keybloc2DetailCodePay == rhs.keybloc2DetailCodePay)||((this.keybloc2DetailCodePay!= null)&&this.keybloc2DetailCodePay.equals(rhs.keybloc2DetailCodePay))))&&((this.keybloc2ReleaseDate == rhs.keybloc2ReleaseDate)||((this.keybloc2ReleaseDate!= null)&&this.keybloc2ReleaseDate.equals(rhs.keybloc2ReleaseDate))))&&((this.keybloc2EffDate == rhs.keybloc2EffDate)||((this.keybloc2EffDate!= null)&&this.keybloc2EffDate.equals(rhs.keybloc2EffDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
