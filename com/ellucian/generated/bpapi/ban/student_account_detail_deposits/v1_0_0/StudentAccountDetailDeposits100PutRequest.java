
package com.ellucian.generated.bpapi.ban.student_account_detail_deposits.v1_0_0;

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
    "criteria.createSource",
    "relAmount",
    "minAmount",
    "criteria.amount",
    "criteria.autoReleaseInd",
    "releaseDate",
    "documentNumber",
    "criteria.termCode",
    "criteria.desc",
    "criteria.detailCodePayment",
    "criteria.documentNumber",
    "criteria.detailCodeDeposit",
    "criteria.minAmount",
    "autoReleaseInd",
    "criteria.expirationDate",
    "receiptGenInd2",
    "holdPassword",
    "criteria.releaseDate",
    "id",
    "effectiveDate",
    "criteria.receiptNumber",
    "criteria.effectiveDate",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailDeposits100PutRequest {

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_CREATE_SOURCE")
    private String criteriaCreateSource;
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
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AMOUNT")
    private Double criteriaAmount;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AUTO_RELEASE_IND")
    private String criteriaAutoReleaseInd;
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
     * Term
     * <p>
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DESC")
    private String criteriaDesc;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCodePayment;
    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DOCUMENT_NUMBER")
    private String criteriaDocumentNumber;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT")
    private String criteriaDetailCodeDeposit;
    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_MIN_AMOUNT")
    private Double criteriaMinAmount;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AUTO_RELEASE_IND")
    private String autoReleaseInd;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EXPIRATION_DATE")
    private Date criteriaExpirationDate;
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
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RELEASE_DATE")
    private Date criteriaReleaseDate;
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
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RECEIPT_NUMBER")
    private Double criteriaReceiptNumber;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
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
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    public String getCriteriaCreateSource() {
        return criteriaCreateSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("criteria.createSource")
    public void setCriteriaCreateSource(String criteriaCreateSource) {
        this.criteriaCreateSource = criteriaCreateSource;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaCreateSource(String criteriaCreateSource) {
        this.criteriaCreateSource = criteriaCreateSource;
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

    public StudentAccountDetailDeposits100PutRequest withRelAmount(Double relAmount) {
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

    public StudentAccountDetailDeposits100PutRequest withMinAmount(Double minAmount) {
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
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRDEPO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    public String getCriteriaAutoReleaseInd() {
        return criteriaAutoReleaseInd;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    public void setCriteriaAutoReleaseInd(String criteriaAutoReleaseInd) {
        this.criteriaAutoReleaseInd = criteriaAutoReleaseInd;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaAutoReleaseInd(String criteriaAutoReleaseInd) {
        this.criteriaAutoReleaseInd = criteriaAutoReleaseInd;
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

    public StudentAccountDetailDeposits100PutRequest withReleaseDate(Date releaseDate) {
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

    public StudentAccountDetailDeposits100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRDEPO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    public String getCriteriaDetailCodePayment() {
        return criteriaDetailCodePayment;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    public void setCriteriaDetailCodePayment(String criteriaDetailCodePayment) {
        this.criteriaDetailCodePayment = criteriaDetailCodePayment;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaDetailCodePayment(String criteriaDetailCodePayment) {
        this.criteriaDetailCodePayment = criteriaDetailCodePayment;
        return this;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public String getCriteriaDocumentNumber() {
        return criteriaDocumentNumber;
    }

    /**
     * Document Num
     * <p>
     * Lineage reference object : TBRDEPO_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public void setCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    public String getCriteriaDetailCodeDeposit() {
        return criteriaDetailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBRDEPO_DETAIL_CODE_DEPOSIT
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    public void setCriteriaDetailCodeDeposit(String criteriaDetailCodeDeposit) {
        this.criteriaDetailCodeDeposit = criteriaDetailCodeDeposit;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaDetailCodeDeposit(String criteriaDetailCodeDeposit) {
        this.criteriaDetailCodeDeposit = criteriaDetailCodeDeposit;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    public Double getCriteriaMinAmount() {
        return criteriaMinAmount;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : TBRDEPO_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    public void setCriteriaMinAmount(Double criteriaMinAmount) {
        this.criteriaMinAmount = criteriaMinAmount;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaMinAmount(Double criteriaMinAmount) {
        this.criteriaMinAmount = criteriaMinAmount;
        return this;
    }

    /**
     * Auto Release
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
     * Auto Release
     * <p>
     * Lineage reference object : TBRDEPO_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public void setAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
    }

    public StudentAccountDetailDeposits100PutRequest withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public Date getCriteriaExpirationDate() {
        return criteriaExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRDEPO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public void setCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
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

    public StudentAccountDetailDeposits100PutRequest withReceiptGenInd2(String receiptGenInd2) {
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

    public StudentAccountDetailDeposits100PutRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    public Date getCriteriaReleaseDate() {
        return criteriaReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBRDEPO_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    public void setCriteriaReleaseDate(Date criteriaReleaseDate) {
        this.criteriaReleaseDate = criteriaReleaseDate;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaReleaseDate(Date criteriaReleaseDate) {
        this.criteriaReleaseDate = criteriaReleaseDate;
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

    public StudentAccountDetailDeposits100PutRequest withId(String id) {
        this.id = id;
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

    public StudentAccountDetailDeposits100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public Double getCriteriaReceiptNumber() {
        return criteriaReceiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public void setCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRDEPO_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public StudentAccountDetailDeposits100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
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

    public StudentAccountDetailDeposits100PutRequest withExpirationDate(Date expirationDate) {
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

    public StudentAccountDetailDeposits100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailDeposits100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCreateSource");
        sb.append('=');
        sb.append(((this.criteriaCreateSource == null)?"<null>":this.criteriaCreateSource));
        sb.append(',');
        sb.append("relAmount");
        sb.append('=');
        sb.append(((this.relAmount == null)?"<null>":this.relAmount));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("criteriaAutoReleaseInd");
        sb.append('=');
        sb.append(((this.criteriaAutoReleaseInd == null)?"<null>":this.criteriaAutoReleaseInd));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaDetailCodePayment");
        sb.append('=');
        sb.append(((this.criteriaDetailCodePayment == null)?"<null>":this.criteriaDetailCodePayment));
        sb.append(',');
        sb.append("criteriaDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaDocumentNumber == null)?"<null>":this.criteriaDocumentNumber));
        sb.append(',');
        sb.append("criteriaDetailCodeDeposit");
        sb.append('=');
        sb.append(((this.criteriaDetailCodeDeposit == null)?"<null>":this.criteriaDetailCodeDeposit));
        sb.append(',');
        sb.append("criteriaMinAmount");
        sb.append('=');
        sb.append(((this.criteriaMinAmount == null)?"<null>":this.criteriaMinAmount));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
        sb.append(',');
        sb.append("criteriaExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaExpirationDate == null)?"<null>":this.criteriaExpirationDate));
        sb.append(',');
        sb.append("receiptGenInd2");
        sb.append('=');
        sb.append(((this.receiptGenInd2 == null)?"<null>":this.receiptGenInd2));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("criteriaReleaseDate");
        sb.append('=');
        sb.append(((this.criteriaReleaseDate == null)?"<null>":this.criteriaReleaseDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("criteriaReceiptNumber");
        sb.append('=');
        sb.append(((this.criteriaReceiptNumber == null)?"<null>":this.criteriaReceiptNumber));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
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
        result = ((result* 31)+((this.criteriaExpirationDate == null)? 0 :this.criteriaExpirationDate.hashCode()));
        result = ((result* 31)+((this.criteriaCreateSource == null)? 0 :this.criteriaCreateSource.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.autoReleaseInd == null)? 0 :this.autoReleaseInd.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.receiptGenInd2 == null)? 0 :this.receiptGenInd2 .hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodeDeposit == null)? 0 :this.criteriaDetailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptNumber == null)? 0 :this.criteriaReceiptNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaDocumentNumber == null)? 0 :this.criteriaDocumentNumber.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodePayment == null)? 0 :this.criteriaDetailCodePayment.hashCode()));
        result = ((result* 31)+((this.criteriaMinAmount == null)? 0 :this.criteriaMinAmount.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaReleaseDate == null)? 0 :this.criteriaReleaseDate.hashCode()));
        result = ((result* 31)+((this.criteriaAutoReleaseInd == null)? 0 :this.criteriaAutoReleaseInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailDeposits100PutRequest) == false) {
            return false;
        }
        StudentAccountDetailDeposits100PutRequest rhs = ((StudentAccountDetailDeposits100PutRequest) other);
        return (((((((((((((((((((((((((this.relAmount == rhs.relAmount)||((this.relAmount!= null)&&this.relAmount.equals(rhs.relAmount)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.criteriaExpirationDate == rhs.criteriaExpirationDate)||((this.criteriaExpirationDate!= null)&&this.criteriaExpirationDate.equals(rhs.criteriaExpirationDate))))&&((this.criteriaCreateSource == rhs.criteriaCreateSource)||((this.criteriaCreateSource!= null)&&this.criteriaCreateSource.equals(rhs.criteriaCreateSource))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.receiptGenInd2 == rhs.receiptGenInd2)||((this.receiptGenInd2 != null)&&this.receiptGenInd2 .equals(rhs.receiptGenInd2))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaDetailCodeDeposit == rhs.criteriaDetailCodeDeposit)||((this.criteriaDetailCodeDeposit!= null)&&this.criteriaDetailCodeDeposit.equals(rhs.criteriaDetailCodeDeposit))))&&((this.criteriaReceiptNumber == rhs.criteriaReceiptNumber)||((this.criteriaReceiptNumber!= null)&&this.criteriaReceiptNumber.equals(rhs.criteriaReceiptNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaDocumentNumber == rhs.criteriaDocumentNumber)||((this.criteriaDocumentNumber!= null)&&this.criteriaDocumentNumber.equals(rhs.criteriaDocumentNumber))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.criteriaDetailCodePayment == rhs.criteriaDetailCodePayment)||((this.criteriaDetailCodePayment!= null)&&this.criteriaDetailCodePayment.equals(rhs.criteriaDetailCodePayment))))&&((this.criteriaMinAmount == rhs.criteriaMinAmount)||((this.criteriaMinAmount!= null)&&this.criteriaMinAmount.equals(rhs.criteriaMinAmount))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.criteriaReleaseDate == rhs.criteriaReleaseDate)||((this.criteriaReleaseDate!= null)&&this.criteriaReleaseDate.equals(rhs.criteriaReleaseDate))))&&((this.criteriaAutoReleaseInd == rhs.criteriaAutoReleaseInd)||((this.criteriaAutoReleaseInd!= null)&&this.criteriaAutoReleaseInd.equals(rhs.criteriaAutoReleaseInd))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
