
package com.ellucian.generated.bpapi.ban.finance_refund_review.v1_0_0;

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
    "criteria.pidm",
    "criteria.accountBalance",
    "criteria.refund",
    "criteria.refundInd",
    "refundInd",
    "criteria.id",
    "criteria.name",
    "id",
    "criteria.pending"
})
@Generated("jsonschema2pojo")
public class FinanceRefundReview100PutRequest {

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("criteria.pidm")
    @JsonPropertyDescription("Lineage reference object : PIDM")
    private Double criteriaPidm;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("criteria.accountBalance")
    @JsonPropertyDescription("Lineage reference object : ACCOUNT_BALANCE")
    private Double criteriaAccountBalance;
    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("criteria.refund")
    @JsonPropertyDescription("Lineage reference object : REFUND")
    private Double criteriaRefund;
    @JsonProperty("criteria.refundInd")
    private String criteriaRefundInd;
    @JsonProperty("refundInd")
    private String refundInd;
    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("criteria.id")
    @JsonPropertyDescription("Lineage reference object : ID")
    private String criteriaId;
    /**
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("criteria.name")
    @JsonPropertyDescription("Lineage reference object : NAME")
    private String criteriaName;
    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : ID")
    private String id;
    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("criteria.pending")
    @JsonPropertyDescription("Lineage reference object : PENDING")
    private Double criteriaPending;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("criteria.pidm")
    public Double getCriteriaPidm() {
        return criteriaPidm;
    }

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("criteria.pidm")
    public void setCriteriaPidm(Double criteriaPidm) {
        this.criteriaPidm = criteriaPidm;
    }

    public FinanceRefundReview100PutRequest withCriteriaPidm(Double criteriaPidm) {
        this.criteriaPidm = criteriaPidm;
        return this;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("criteria.accountBalance")
    public Double getCriteriaAccountBalance() {
        return criteriaAccountBalance;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("criteria.accountBalance")
    public void setCriteriaAccountBalance(Double criteriaAccountBalance) {
        this.criteriaAccountBalance = criteriaAccountBalance;
    }

    public FinanceRefundReview100PutRequest withCriteriaAccountBalance(Double criteriaAccountBalance) {
        this.criteriaAccountBalance = criteriaAccountBalance;
        return this;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("criteria.refund")
    public Double getCriteriaRefund() {
        return criteriaRefund;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("criteria.refund")
    public void setCriteriaRefund(Double criteriaRefund) {
        this.criteriaRefund = criteriaRefund;
    }

    public FinanceRefundReview100PutRequest withCriteriaRefund(Double criteriaRefund) {
        this.criteriaRefund = criteriaRefund;
        return this;
    }

    @JsonProperty("criteria.refundInd")
    public String getCriteriaRefundInd() {
        return criteriaRefundInd;
    }

    @JsonProperty("criteria.refundInd")
    public void setCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
    }

    public FinanceRefundReview100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
        return this;
    }

    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public FinanceRefundReview100PutRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public FinanceRefundReview100PutRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public FinanceRefundReview100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinanceRefundReview100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("criteria.pending")
    public Double getCriteriaPending() {
        return criteriaPending;
    }

    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("criteria.pending")
    public void setCriteriaPending(Double criteriaPending) {
        this.criteriaPending = criteriaPending;
    }

    public FinanceRefundReview100PutRequest withCriteriaPending(Double criteriaPending) {
        this.criteriaPending = criteriaPending;
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

    public FinanceRefundReview100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceRefundReview100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaPidm");
        sb.append('=');
        sb.append(((this.criteriaPidm == null)?"<null>":this.criteriaPidm));
        sb.append(',');
        sb.append("criteriaAccountBalance");
        sb.append('=');
        sb.append(((this.criteriaAccountBalance == null)?"<null>":this.criteriaAccountBalance));
        sb.append(',');
        sb.append("criteriaRefund");
        sb.append('=');
        sb.append(((this.criteriaRefund == null)?"<null>":this.criteriaRefund));
        sb.append(',');
        sb.append("criteriaRefundInd");
        sb.append('=');
        sb.append(((this.criteriaRefundInd == null)?"<null>":this.criteriaRefundInd));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaPending");
        sb.append('=');
        sb.append(((this.criteriaPending == null)?"<null>":this.criteriaPending));
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
        result = ((result* 31)+((this.criteriaPidm == null)? 0 :this.criteriaPidm.hashCode()));
        result = ((result* 31)+((this.criteriaAccountBalance == null)? 0 :this.criteriaAccountBalance.hashCode()));
        result = ((result* 31)+((this.criteriaRefund == null)? 0 :this.criteriaRefund.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPending == null)? 0 :this.criteriaPending.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceRefundReview100PutRequest) == false) {
            return false;
        }
        FinanceRefundReview100PutRequest rhs = ((FinanceRefundReview100PutRequest) other);
        return (((((((((((this.criteriaPidm == rhs.criteriaPidm)||((this.criteriaPidm!= null)&&this.criteriaPidm.equals(rhs.criteriaPidm)))&&((this.criteriaAccountBalance == rhs.criteriaAccountBalance)||((this.criteriaAccountBalance!= null)&&this.criteriaAccountBalance.equals(rhs.criteriaAccountBalance))))&&((this.criteriaRefund == rhs.criteriaRefund)||((this.criteriaRefund!= null)&&this.criteriaRefund.equals(rhs.criteriaRefund))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPending == rhs.criteriaPending)||((this.criteriaPending!= null)&&this.criteriaPending.equals(rhs.criteriaPending))));
    }

}
