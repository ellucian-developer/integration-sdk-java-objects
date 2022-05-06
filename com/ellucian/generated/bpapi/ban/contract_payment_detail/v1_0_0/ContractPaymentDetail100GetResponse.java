
package com.ellucian.generated.bpapi.ban.contract_payment_detail.v1_0_0;

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
    "stuId",
    "balance",
    "summaryBalance",
    "refundInd",
    "summaryAmount",
    "contractNumber",
    "tranNumber",
    "stuName",
    "finalInd"
})
@Generated("jsonschema2pojo")
public class ContractPaymentDetail100GetResponse {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRCPDT_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_AMOUNT")
    private Double amount;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    private String stuId;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBRCPDT_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_BALANCE")
    private Double balance;
    @JsonProperty("summaryBalance")
    private Double summaryBalance;
    /**
     * Lineage reference object : TBRCPDT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_REFUND_IND")
    private String refundInd;
    /**
     * Total
     * <p>
     * 
     * 
     */
    @JsonProperty("summaryAmount")
    private Double summaryAmount;
    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBRCPDT_CONTRACT_NUMBER
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_CONTRACT_NUMBER")
    private Double contractNumber;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRCPDT_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    private String stuName;
    /**
     * Lineage reference object : TBRCPDT_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    @JsonPropertyDescription("Lineage reference object : TBRCPDT_FINAL_IND")
    private String finalInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRCPDT_AMOUNT
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
     * Lineage reference object : TBRCPDT_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ContractPaymentDetail100GetResponse withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    public String getStuId() {
        return stuId;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public ContractPaymentDetail100GetResponse withStuId(String stuId) {
        this.stuId = stuId;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRCPDT_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRCPDT_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public ContractPaymentDetail100GetResponse withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    @JsonProperty("summaryBalance")
    public Double getSummaryBalance() {
        return summaryBalance;
    }

    @JsonProperty("summaryBalance")
    public void setSummaryBalance(Double summaryBalance) {
        this.summaryBalance = summaryBalance;
    }

    public ContractPaymentDetail100GetResponse withSummaryBalance(Double summaryBalance) {
        this.summaryBalance = summaryBalance;
        return this;
    }

    /**
     * Lineage reference object : TBRCPDT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Lineage reference object : TBRCPDT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public ContractPaymentDetail100GetResponse withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Total
     * <p>
     * 
     * 
     */
    @JsonProperty("summaryAmount")
    public Double getSummaryAmount() {
        return summaryAmount;
    }

    /**
     * Total
     * <p>
     * 
     * 
     */
    @JsonProperty("summaryAmount")
    public void setSummaryAmount(Double summaryAmount) {
        this.summaryAmount = summaryAmount;
    }

    public ContractPaymentDetail100GetResponse withSummaryAmount(Double summaryAmount) {
        this.summaryAmount = summaryAmount;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBRCPDT_CONTRACT_NUMBER
     * 
     */
    @JsonProperty("contractNumber")
    public Double getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBRCPDT_CONTRACT_NUMBER
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractPaymentDetail100GetResponse withContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRCPDT_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : TBRCPDT_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public ContractPaymentDetail100GetResponse withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    public String getStuName() {
        return stuName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public ContractPaymentDetail100GetResponse withStuName(String stuName) {
        this.stuName = stuName;
        return this;
    }

    /**
     * Lineage reference object : TBRCPDT_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    /**
     * Lineage reference object : TBRCPDT_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public ContractPaymentDetail100GetResponse withFinalInd(String finalInd) {
        this.finalInd = finalInd;
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

    public ContractPaymentDetail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractPaymentDetail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("stuId");
        sb.append('=');
        sb.append(((this.stuId == null)?"<null>":this.stuId));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("summaryBalance");
        sb.append('=');
        sb.append(((this.summaryBalance == null)?"<null>":this.summaryBalance));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("summaryAmount");
        sb.append('=');
        sb.append(((this.summaryAmount == null)?"<null>":this.summaryAmount));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("stuName");
        sb.append('=');
        sb.append(((this.stuName == null)?"<null>":this.stuName));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
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
        result = ((result* 31)+((this.stuId == null)? 0 :this.stuId.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.summaryBalance == null)? 0 :this.summaryBalance.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.summaryAmount == null)? 0 :this.summaryAmount.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.stuName == null)? 0 :this.stuName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractPaymentDetail100GetResponse) == false) {
            return false;
        }
        ContractPaymentDetail100GetResponse rhs = ((ContractPaymentDetail100GetResponse) other);
        return ((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.stuId == rhs.stuId)||((this.stuId!= null)&&this.stuId.equals(rhs.stuId))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.summaryBalance == rhs.summaryBalance)||((this.summaryBalance!= null)&&this.summaryBalance.equals(rhs.summaryBalance))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.summaryAmount == rhs.summaryAmount)||((this.summaryAmount!= null)&&this.summaryAmount.equals(rhs.summaryAmount))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.stuName == rhs.stuName)||((this.stuName!= null)&&this.stuName.equals(rhs.stuName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))));
    }

}
