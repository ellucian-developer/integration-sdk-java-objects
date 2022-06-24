
package com.ellucian.generated.bpapi.ban.account_detail_deposits.v1_0_0;

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
    "criteria.tbrdepoAmount",
    "relAmount",
    "minAmount",
    "criteria.tbrdepoDetailCodePayment",
    "criteria.tbrdepoReceiptNumber",
    "releaseDate",
    "documentNumber",
    "criteria.tbrdepoAtypSeqno",
    "criteria.tbrdepoDesc",
    "criteria.tbrdepoReleaseDate",
    "criteria.tbrdepoDetailCodeDeposit",
    "criteria.tbrdepoDocumentNumber",
    "criteria.tbrdepoEffectiveDate",
    "criteria.tbrdepoAtypCode",
    "receiptGenInd2",
    "holdPassword",
    "criteria.tbrdepoMinAmount",
    "id",
    "criteria.tbrdepoExpirationDate",
    "criteria.tbrdepoCreateSource",
    "atypCode",
    "atypSeqno",
    "effectiveDate",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class AccountDetailDeposits100PutRequest {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAmount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AMOUNT")
    private Double criteriaTbrdepoAmount;
    /**
     * Release Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("relAmount")
    private Double relAmount;
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
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodePayment")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc")
    private String criteriaTbrdepoDetailCodePayment;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoReceiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RECEIPT_NUMBER")
    private Double criteriaTbrdepoReceiptNumber;
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
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DOCUMENT_NUMBER")
    private String documentNumber;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ATYP_SEQNO")
    private Double criteriaTbrdepoAtypSeqno;
    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDesc")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DESC")
    private String criteriaTbrdepoDesc;
    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoReleaseDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RELEASE_DATE")
    private Date criteriaTbrdepoReleaseDate;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT")
    private String criteriaTbrdepoDetailCodeDeposit;
    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoDocumentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DOCUMENT_NUMBER")
    private String criteriaTbrdepoDocumentNumber;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoEffectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EFFECTIVE_DATE")
    private Date criteriaTbrdepoEffectiveDate;
    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypCode")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ATYP_CODE")
    private String criteriaTbrdepoAtypCode;
    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    @JsonPropertyDescription("Lineage reference object : receiptGenInd2")
    private String receiptGenInd2;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private String holdPassword;
    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrdepoMinAmount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_MIN_AMOUNT")
    private Double criteriaTbrdepoMinAmount;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoExpirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EXPIRATION_DATE")
    private Date criteriaTbrdepoExpirationDate;
    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.tbrdepoCreateSource")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_CREATE_SOURCE")
    private String criteriaTbrdepoCreateSource;
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
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EFFECTIVE_DATE")
    private Date effectiveDate;
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
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAmount")
    public Double getCriteriaTbrdepoAmount() {
        return criteriaTbrdepoAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAmount")
    public void setCriteriaTbrdepoAmount(Double criteriaTbrdepoAmount) {
        this.criteriaTbrdepoAmount = criteriaTbrdepoAmount;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoAmount(Double criteriaTbrdepoAmount) {
        this.criteriaTbrdepoAmount = criteriaTbrdepoAmount;
        return this;
    }

    /**
     * Release Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("relAmount")
    public Double getRelAmount() {
        return relAmount;
    }

    /**
     * Release Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("relAmount")
    public void setRelAmount(Double relAmount) {
        this.relAmount = relAmount;
    }

    public AccountDetailDeposits100PutRequest withRelAmount(Double relAmount) {
        this.relAmount = relAmount;
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

    public AccountDetailDeposits100PutRequest withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodePayment")
    public String getCriteriaTbrdepoDetailCodePayment() {
        return criteriaTbrdepoDetailCodePayment;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodePayment")
    public void setCriteriaTbrdepoDetailCodePayment(String criteriaTbrdepoDetailCodePayment) {
        this.criteriaTbrdepoDetailCodePayment = criteriaTbrdepoDetailCodePayment;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoDetailCodePayment(String criteriaTbrdepoDetailCodePayment) {
        this.criteriaTbrdepoDetailCodePayment = criteriaTbrdepoDetailCodePayment;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoReceiptNumber")
    public Double getCriteriaTbrdepoReceiptNumber() {
        return criteriaTbrdepoReceiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoReceiptNumber")
    public void setCriteriaTbrdepoReceiptNumber(Double criteriaTbrdepoReceiptNumber) {
        this.criteriaTbrdepoReceiptNumber = criteriaTbrdepoReceiptNumber;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoReceiptNumber(Double criteriaTbrdepoReceiptNumber) {
        this.criteriaTbrdepoReceiptNumber = criteriaTbrdepoReceiptNumber;
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

    public AccountDetailDeposits100PutRequest withReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public AccountDetailDeposits100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypSeqno")
    public Double getCriteriaTbrdepoAtypSeqno() {
        return criteriaTbrdepoAtypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypSeqno")
    public void setCriteriaTbrdepoAtypSeqno(Double criteriaTbrdepoAtypSeqno) {
        this.criteriaTbrdepoAtypSeqno = criteriaTbrdepoAtypSeqno;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoAtypSeqno(Double criteriaTbrdepoAtypSeqno) {
        this.criteriaTbrdepoAtypSeqno = criteriaTbrdepoAtypSeqno;
        return this;
    }

    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDesc")
    public String getCriteriaTbrdepoDesc() {
        return criteriaTbrdepoDesc;
    }

    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDesc")
    public void setCriteriaTbrdepoDesc(String criteriaTbrdepoDesc) {
        this.criteriaTbrdepoDesc = criteriaTbrdepoDesc;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoDesc(String criteriaTbrdepoDesc) {
        this.criteriaTbrdepoDesc = criteriaTbrdepoDesc;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoReleaseDate")
    public Date getCriteriaTbrdepoReleaseDate() {
        return criteriaTbrdepoReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoReleaseDate")
    public void setCriteriaTbrdepoReleaseDate(Date criteriaTbrdepoReleaseDate) {
        this.criteriaTbrdepoReleaseDate = criteriaTbrdepoReleaseDate;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoReleaseDate(Date criteriaTbrdepoReleaseDate) {
        this.criteriaTbrdepoReleaseDate = criteriaTbrdepoReleaseDate;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodeDeposit")
    public String getCriteriaTbrdepoDetailCodeDeposit() {
        return criteriaTbrdepoDetailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoDetailCodeDeposit")
    public void setCriteriaTbrdepoDetailCodeDeposit(String criteriaTbrdepoDetailCodeDeposit) {
        this.criteriaTbrdepoDetailCodeDeposit = criteriaTbrdepoDetailCodeDeposit;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoDetailCodeDeposit(String criteriaTbrdepoDetailCodeDeposit) {
        this.criteriaTbrdepoDetailCodeDeposit = criteriaTbrdepoDetailCodeDeposit;
        return this;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoDocumentNumber")
    public String getCriteriaTbrdepoDocumentNumber() {
        return criteriaTbrdepoDocumentNumber;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.tbrdepoDocumentNumber")
    public void setCriteriaTbrdepoDocumentNumber(String criteriaTbrdepoDocumentNumber) {
        this.criteriaTbrdepoDocumentNumber = criteriaTbrdepoDocumentNumber;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoDocumentNumber(String criteriaTbrdepoDocumentNumber) {
        this.criteriaTbrdepoDocumentNumber = criteriaTbrdepoDocumentNumber;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoEffectiveDate")
    public Date getCriteriaTbrdepoEffectiveDate() {
        return criteriaTbrdepoEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoEffectiveDate")
    public void setCriteriaTbrdepoEffectiveDate(Date criteriaTbrdepoEffectiveDate) {
        this.criteriaTbrdepoEffectiveDate = criteriaTbrdepoEffectiveDate;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoEffectiveDate(Date criteriaTbrdepoEffectiveDate) {
        this.criteriaTbrdepoEffectiveDate = criteriaTbrdepoEffectiveDate;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypCode")
    public String getCriteriaTbrdepoAtypCode() {
        return criteriaTbrdepoAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRDEPO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbrdepoAtypCode")
    public void setCriteriaTbrdepoAtypCode(String criteriaTbrdepoAtypCode) {
        this.criteriaTbrdepoAtypCode = criteriaTbrdepoAtypCode;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoAtypCode(String criteriaTbrdepoAtypCode) {
        this.criteriaTbrdepoAtypCode = criteriaTbrdepoAtypCode;
        return this;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    public String getReceiptGenInd2() {
        return receiptGenInd2;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    public void setReceiptGenInd2(String receiptGenInd2) {
        this.receiptGenInd2 = receiptGenInd2;
    }

    public AccountDetailDeposits100PutRequest withReceiptGenInd2(String receiptGenInd2) {
        this.receiptGenInd2 = receiptGenInd2;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public AccountDetailDeposits100PutRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrdepoMinAmount")
    public Double getCriteriaTbrdepoMinAmount() {
        return criteriaTbrdepoMinAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbrdepoMinAmount")
    public void setCriteriaTbrdepoMinAmount(Double criteriaTbrdepoMinAmount) {
        this.criteriaTbrdepoMinAmount = criteriaTbrdepoMinAmount;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoMinAmount(Double criteriaTbrdepoMinAmount) {
        this.criteriaTbrdepoMinAmount = criteriaTbrdepoMinAmount;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountDetailDeposits100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoExpirationDate")
    public Date getCriteriaTbrdepoExpirationDate() {
        return criteriaTbrdepoExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.tbrdepoExpirationDate")
    public void setCriteriaTbrdepoExpirationDate(Date criteriaTbrdepoExpirationDate) {
        this.criteriaTbrdepoExpirationDate = criteriaTbrdepoExpirationDate;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoExpirationDate(Date criteriaTbrdepoExpirationDate) {
        this.criteriaTbrdepoExpirationDate = criteriaTbrdepoExpirationDate;
        return this;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.tbrdepoCreateSource")
    public String getCriteriaTbrdepoCreateSource() {
        return criteriaTbrdepoCreateSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.tbrdepoCreateSource")
    public void setCriteriaTbrdepoCreateSource(String criteriaTbrdepoCreateSource) {
        this.criteriaTbrdepoCreateSource = criteriaTbrdepoCreateSource;
    }

    public AccountDetailDeposits100PutRequest withCriteriaTbrdepoCreateSource(String criteriaTbrdepoCreateSource) {
        this.criteriaTbrdepoCreateSource = criteriaTbrdepoCreateSource;
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

    public AccountDetailDeposits100PutRequest withAtypCode(String atypCode) {
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

    public AccountDetailDeposits100PutRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public AccountDetailDeposits100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public AccountDetailDeposits100PutRequest withExpirationDate(Date expirationDate) {
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

    public AccountDetailDeposits100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailDeposits100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTbrdepoAmount");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoAmount == null)?"<null>":this.criteriaTbrdepoAmount));
        sb.append(',');
        sb.append("relAmount");
        sb.append('=');
        sb.append(((this.relAmount == null)?"<null>":this.relAmount));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("criteriaTbrdepoDetailCodePayment");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoDetailCodePayment == null)?"<null>":this.criteriaTbrdepoDetailCodePayment));
        sb.append(',');
        sb.append("criteriaTbrdepoReceiptNumber");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoReceiptNumber == null)?"<null>":this.criteriaTbrdepoReceiptNumber));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaTbrdepoAtypSeqno");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoAtypSeqno == null)?"<null>":this.criteriaTbrdepoAtypSeqno));
        sb.append(',');
        sb.append("criteriaTbrdepoDesc");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoDesc == null)?"<null>":this.criteriaTbrdepoDesc));
        sb.append(',');
        sb.append("criteriaTbrdepoReleaseDate");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoReleaseDate == null)?"<null>":this.criteriaTbrdepoReleaseDate));
        sb.append(',');
        sb.append("criteriaTbrdepoDetailCodeDeposit");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoDetailCodeDeposit == null)?"<null>":this.criteriaTbrdepoDetailCodeDeposit));
        sb.append(',');
        sb.append("criteriaTbrdepoDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoDocumentNumber == null)?"<null>":this.criteriaTbrdepoDocumentNumber));
        sb.append(',');
        sb.append("criteriaTbrdepoEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoEffectiveDate == null)?"<null>":this.criteriaTbrdepoEffectiveDate));
        sb.append(',');
        sb.append("criteriaTbrdepoAtypCode");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoAtypCode == null)?"<null>":this.criteriaTbrdepoAtypCode));
        sb.append(',');
        sb.append("receiptGenInd2");
        sb.append('=');
        sb.append(((this.receiptGenInd2 == null)?"<null>":this.receiptGenInd2));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("criteriaTbrdepoMinAmount");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoMinAmount == null)?"<null>":this.criteriaTbrdepoMinAmount));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaTbrdepoExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoExpirationDate == null)?"<null>":this.criteriaTbrdepoExpirationDate));
        sb.append(',');
        sb.append("criteriaTbrdepoCreateSource");
        sb.append('=');
        sb.append(((this.criteriaTbrdepoCreateSource == null)?"<null>":this.criteriaTbrdepoCreateSource));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.relAmount == null)? 0 :this.relAmount.hashCode()));
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoAtypCode == null)? 0 :this.criteriaTbrdepoAtypCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoReceiptNumber == null)? 0 :this.criteriaTbrdepoReceiptNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoReleaseDate == null)? 0 :this.criteriaTbrdepoReleaseDate.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoCreateSource == null)? 0 :this.criteriaTbrdepoCreateSource.hashCode()));
        result = ((result* 31)+((this.receiptGenInd2 == null)? 0 :this.receiptGenInd2 .hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoDetailCodePayment == null)? 0 :this.criteriaTbrdepoDetailCodePayment.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoExpirationDate == null)? 0 :this.criteriaTbrdepoExpirationDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoDesc == null)? 0 :this.criteriaTbrdepoDesc.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoMinAmount == null)? 0 :this.criteriaTbrdepoMinAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoEffectiveDate == null)? 0 :this.criteriaTbrdepoEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoAmount == null)? 0 :this.criteriaTbrdepoAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoDocumentNumber == null)? 0 :this.criteriaTbrdepoDocumentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoAtypSeqno == null)? 0 :this.criteriaTbrdepoAtypSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaTbrdepoDetailCodeDeposit == null)? 0 :this.criteriaTbrdepoDetailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailDeposits100PutRequest) == false) {
            return false;
        }
        AccountDetailDeposits100PutRequest rhs = ((AccountDetailDeposits100PutRequest) other);
        return ((((((((((((((((((((((((((this.relAmount == rhs.relAmount)||((this.relAmount!= null)&&this.relAmount.equals(rhs.relAmount)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.criteriaTbrdepoAtypCode == rhs.criteriaTbrdepoAtypCode)||((this.criteriaTbrdepoAtypCode!= null)&&this.criteriaTbrdepoAtypCode.equals(rhs.criteriaTbrdepoAtypCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaTbrdepoReceiptNumber == rhs.criteriaTbrdepoReceiptNumber)||((this.criteriaTbrdepoReceiptNumber!= null)&&this.criteriaTbrdepoReceiptNumber.equals(rhs.criteriaTbrdepoReceiptNumber))))&&((this.criteriaTbrdepoReleaseDate == rhs.criteriaTbrdepoReleaseDate)||((this.criteriaTbrdepoReleaseDate!= null)&&this.criteriaTbrdepoReleaseDate.equals(rhs.criteriaTbrdepoReleaseDate))))&&((this.criteriaTbrdepoCreateSource == rhs.criteriaTbrdepoCreateSource)||((this.criteriaTbrdepoCreateSource!= null)&&this.criteriaTbrdepoCreateSource.equals(rhs.criteriaTbrdepoCreateSource))))&&((this.receiptGenInd2 == rhs.receiptGenInd2)||((this.receiptGenInd2 != null)&&this.receiptGenInd2 .equals(rhs.receiptGenInd2))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaTbrdepoDetailCodePayment == rhs.criteriaTbrdepoDetailCodePayment)||((this.criteriaTbrdepoDetailCodePayment!= null)&&this.criteriaTbrdepoDetailCodePayment.equals(rhs.criteriaTbrdepoDetailCodePayment))))&&((this.criteriaTbrdepoExpirationDate == rhs.criteriaTbrdepoExpirationDate)||((this.criteriaTbrdepoExpirationDate!= null)&&this.criteriaTbrdepoExpirationDate.equals(rhs.criteriaTbrdepoExpirationDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaTbrdepoDesc == rhs.criteriaTbrdepoDesc)||((this.criteriaTbrdepoDesc!= null)&&this.criteriaTbrdepoDesc.equals(rhs.criteriaTbrdepoDesc))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.criteriaTbrdepoMinAmount == rhs.criteriaTbrdepoMinAmount)||((this.criteriaTbrdepoMinAmount!= null)&&this.criteriaTbrdepoMinAmount.equals(rhs.criteriaTbrdepoMinAmount))))&&((this.criteriaTbrdepoEffectiveDate == rhs.criteriaTbrdepoEffectiveDate)||((this.criteriaTbrdepoEffectiveDate!= null)&&this.criteriaTbrdepoEffectiveDate.equals(rhs.criteriaTbrdepoEffectiveDate))))&&((this.criteriaTbrdepoAmount == rhs.criteriaTbrdepoAmount)||((this.criteriaTbrdepoAmount!= null)&&this.criteriaTbrdepoAmount.equals(rhs.criteriaTbrdepoAmount))))&&((this.criteriaTbrdepoDocumentNumber == rhs.criteriaTbrdepoDocumentNumber)||((this.criteriaTbrdepoDocumentNumber!= null)&&this.criteriaTbrdepoDocumentNumber.equals(rhs.criteriaTbrdepoDocumentNumber))))&&((this.criteriaTbrdepoAtypSeqno == rhs.criteriaTbrdepoAtypSeqno)||((this.criteriaTbrdepoAtypSeqno!= null)&&this.criteriaTbrdepoAtypSeqno.equals(rhs.criteriaTbrdepoAtypSeqno))))&&((this.criteriaTbrdepoDetailCodeDeposit == rhs.criteriaTbrdepoDetailCodeDeposit)||((this.criteriaTbrdepoDetailCodeDeposit!= null)&&this.criteriaTbrdepoDetailCodeDeposit.equals(rhs.criteriaTbrdepoDetailCodeDeposit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
