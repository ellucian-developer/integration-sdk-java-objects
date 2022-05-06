
package com.ellucian.generated.bpapi.ban.refund_review_students.v1_0_0;

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
    "criteria.t4Refund",
    "criteria.allRefund",
    "criteria.accountBalance",
    "criteria.refundInd",
    "refundInd",
    "criteria.id",
    "criteria.name",
    "criteria.pending"
})
@Generated("jsonschema2pojo")
public class RefundReviewStudents100PutRequest {

    /**
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("criteria.t4Refund")
    @JsonPropertyDescription("Lineage reference object : T4_REFUND")
    private Double criteriaT4Refund;
    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("criteria.allRefund")
    @JsonPropertyDescription("Lineage reference object : ALL_REFUND")
    private Double criteriaAllRefund;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("criteria.accountBalance")
    @JsonPropertyDescription("Lineage reference object : ACCOUNT_BALANCE")
    private Double criteriaAccountBalance;
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
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("criteria.t4Refund")
    public Double getCriteriaT4Refund() {
        return criteriaT4Refund;
    }

    /**
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("criteria.t4Refund")
    public void setCriteriaT4Refund(Double criteriaT4Refund) {
        this.criteriaT4Refund = criteriaT4Refund;
    }

    public RefundReviewStudents100PutRequest withCriteriaT4Refund(Double criteriaT4Refund) {
        this.criteriaT4Refund = criteriaT4Refund;
        return this;
    }

    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("criteria.allRefund")
    public Double getCriteriaAllRefund() {
        return criteriaAllRefund;
    }

    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("criteria.allRefund")
    public void setCriteriaAllRefund(Double criteriaAllRefund) {
        this.criteriaAllRefund = criteriaAllRefund;
    }

    public RefundReviewStudents100PutRequest withCriteriaAllRefund(Double criteriaAllRefund) {
        this.criteriaAllRefund = criteriaAllRefund;
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

    public RefundReviewStudents100PutRequest withCriteriaAccountBalance(Double criteriaAccountBalance) {
        this.criteriaAccountBalance = criteriaAccountBalance;
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

    public RefundReviewStudents100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
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

    public RefundReviewStudents100PutRequest withRefundInd(String refundInd) {
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

    public RefundReviewStudents100PutRequest withCriteriaId(String criteriaId) {
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

    public RefundReviewStudents100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
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

    public RefundReviewStudents100PutRequest withCriteriaPending(Double criteriaPending) {
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

    public RefundReviewStudents100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RefundReviewStudents100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaT4Refund");
        sb.append('=');
        sb.append(((this.criteriaT4Refund == null)?"<null>":this.criteriaT4Refund));
        sb.append(',');
        sb.append("criteriaAllRefund");
        sb.append('=');
        sb.append(((this.criteriaAllRefund == null)?"<null>":this.criteriaAllRefund));
        sb.append(',');
        sb.append("criteriaAccountBalance");
        sb.append('=');
        sb.append(((this.criteriaAccountBalance == null)?"<null>":this.criteriaAccountBalance));
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
        result = ((result* 31)+((this.criteriaAccountBalance == null)? 0 :this.criteriaAccountBalance.hashCode()));
        result = ((result* 31)+((this.criteriaT4Refund == null)? 0 :this.criteriaT4Refund.hashCode()));
        result = ((result* 31)+((this.criteriaAllRefund == null)? 0 :this.criteriaAllRefund.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPending == null)? 0 :this.criteriaPending.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefundReviewStudents100PutRequest) == false) {
            return false;
        }
        RefundReviewStudents100PutRequest rhs = ((RefundReviewStudents100PutRequest) other);
        return ((((((((((this.criteriaAccountBalance == rhs.criteriaAccountBalance)||((this.criteriaAccountBalance!= null)&&this.criteriaAccountBalance.equals(rhs.criteriaAccountBalance)))&&((this.criteriaT4Refund == rhs.criteriaT4Refund)||((this.criteriaT4Refund!= null)&&this.criteriaT4Refund.equals(rhs.criteriaT4Refund))))&&((this.criteriaAllRefund == rhs.criteriaAllRefund)||((this.criteriaAllRefund!= null)&&this.criteriaAllRefund.equals(rhs.criteriaAllRefund))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPending == rhs.criteriaPending)||((this.criteriaPending!= null)&&this.criteriaPending.equals(rhs.criteriaPending))));
    }

}
