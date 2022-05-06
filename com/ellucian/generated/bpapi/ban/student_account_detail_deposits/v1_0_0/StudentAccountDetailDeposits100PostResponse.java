
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
    "relAmount",
    "minAmount",
    "amount",
    "entryDate",
    "releaseDate",
    "documentNumber",
    "detailCodePayment",
    "depositBalance",
    "autoReleaseInd",
    "detailCodeDeposit",
    "createSource",
    "acctFeedInd",
    "effectiveDate",
    "receiptNumber",
    "desc",
    "expirationDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailDeposits100PostResponse {

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
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_AMOUNT")
    private Double amount;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRDEPO_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ENTRY_DATE")
    private Date entryDate;
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
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("depositBalance")
    private Double depositBalance;
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
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_CREATE_SOURCE")
    private String createSource;
    /**
     * Feed
     * <p>
     * Lineage reference object : TBRDEPO_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_ACCT_FEED_IND")
    private String acctFeedInd;
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
    @JsonProperty("receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRDEPO_RECEIPT_NUMBER")
    private Double receiptNumber;
    /**
     * Deposit Description
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public StudentAccountDetailDeposits100PostResponse withRelAmount(Double relAmount) {
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

    public StudentAccountDetailDeposits100PostResponse withMinAmount(Double minAmount) {
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

    public StudentAccountDetailDeposits100PostResponse withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRDEPO_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRDEPO_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public StudentAccountDetailDeposits100PostResponse withEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public StudentAccountDetailDeposits100PostResponse withReleaseDate(Date releaseDate) {
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

    public StudentAccountDetailDeposits100PostResponse withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public StudentAccountDetailDeposits100PostResponse withDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
        return this;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("depositBalance")
    public Double getDepositBalance() {
        return depositBalance;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("depositBalance")
    public void setDepositBalance(Double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public StudentAccountDetailDeposits100PostResponse withDepositBalance(Double depositBalance) {
        this.depositBalance = depositBalance;
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

    public StudentAccountDetailDeposits100PostResponse withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
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

    public StudentAccountDetailDeposits100PostResponse withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public String getCreateSource() {
        return createSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBRDEPO_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public StudentAccountDetailDeposits100PostResponse withCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRDEPO_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public String getAcctFeedInd() {
        return acctFeedInd;
    }

    /**
     * Feed
     * <p>
     * Lineage reference object : TBRDEPO_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public StudentAccountDetailDeposits100PostResponse withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
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

    public StudentAccountDetailDeposits100PostResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public Double getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRDEPO_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public void setReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public StudentAccountDetailDeposits100PostResponse withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    /**
     * Deposit Description
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
     * Deposit Description
     * <p>
     * Lineage reference object : TBRDEPO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentAccountDetailDeposits100PostResponse withDesc(String desc) {
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

    public StudentAccountDetailDeposits100PostResponse withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public StudentAccountDetailDeposits100PostResponse withTermCode(String termCode) {
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

    public StudentAccountDetailDeposits100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailDeposits100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("relAmount");
        sb.append('=');
        sb.append(((this.relAmount == null)?"<null>":this.relAmount));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("detailCodePayment");
        sb.append('=');
        sb.append(((this.detailCodePayment == null)?"<null>":this.detailCodePayment));
        sb.append(',');
        sb.append("depositBalance");
        sb.append('=');
        sb.append(((this.depositBalance == null)?"<null>":this.depositBalance));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
        sb.append(',');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("createSource");
        sb.append('=');
        sb.append(((this.createSource == null)?"<null>":this.createSource));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.relAmount == null)? 0 :this.relAmount.hashCode()));
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.detailCodePayment == null)? 0 :this.detailCodePayment.hashCode()));
        result = ((result* 31)+((this.depositBalance == null)? 0 :this.depositBalance.hashCode()));
        result = ((result* 31)+((this.autoReleaseInd == null)? 0 :this.autoReleaseInd.hashCode()));
        result = ((result* 31)+((this.detailCodeDeposit == null)? 0 :this.detailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.createSource == null)? 0 :this.createSource.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailDeposits100PostResponse) == false) {
            return false;
        }
        StudentAccountDetailDeposits100PostResponse rhs = ((StudentAccountDetailDeposits100PostResponse) other);
        return (((((((((((((((((((this.relAmount == rhs.relAmount)||((this.relAmount!= null)&&this.relAmount.equals(rhs.relAmount)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.detailCodePayment == rhs.detailCodePayment)||((this.detailCodePayment!= null)&&this.detailCodePayment.equals(rhs.detailCodePayment))))&&((this.depositBalance == rhs.depositBalance)||((this.depositBalance!= null)&&this.depositBalance.equals(rhs.depositBalance))))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit))))&&((this.createSource == rhs.createSource)||((this.createSource!= null)&&this.createSource.equals(rhs.createSource))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
