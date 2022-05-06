
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
    "id",
    "name",
    "accountBalance",
    "pending",
    "t4Refund",
    "allRefund",
    "refundInd"
})
@Generated("jsonschema2pojo")
public class RefundReviewStudents100QapiPost {

    /**
     * ID
     * <p>
     * Lineage reference object : ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : ID")
    private String id;
    @JsonProperty("name")
    private String name;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("accountBalance")
    @JsonPropertyDescription("Lineage reference object : ACCOUNT_BALANCE")
    private Double accountBalance;
    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("pending")
    @JsonPropertyDescription("Lineage reference object : PENDING")
    private Double pending;
    /**
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("t4Refund")
    @JsonPropertyDescription("Lineage reference object : T4_REFUND")
    private Double t4Refund;
    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("allRefund")
    @JsonPropertyDescription("Lineage reference object : ALL_REFUND")
    private Double allRefund;
    @JsonProperty("refundInd")
    private String refundInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RefundReviewStudents100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RefundReviewStudents100QapiPost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("accountBalance")
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("accountBalance")
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public RefundReviewStudents100QapiPost withAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("pending")
    public Double getPending() {
        return pending;
    }

    /**
     * Pending
     * <p>
     * Lineage reference object : PENDING
     * 
     */
    @JsonProperty("pending")
    public void setPending(Double pending) {
        this.pending = pending;
    }

    public RefundReviewStudents100QapiPost withPending(Double pending) {
        this.pending = pending;
        return this;
    }

    /**
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("t4Refund")
    public Double getT4Refund() {
        return t4Refund;
    }

    /**
     * Refundable Title IV
     * <p>
     * Lineage reference object : T4_REFUND
     * 
     */
    @JsonProperty("t4Refund")
    public void setT4Refund(Double t4Refund) {
        this.t4Refund = t4Refund;
    }

    public RefundReviewStudents100QapiPost withT4Refund(Double t4Refund) {
        this.t4Refund = t4Refund;
        return this;
    }

    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("allRefund")
    public Double getAllRefund() {
        return allRefund;
    }

    /**
     * All Refunds
     * <p>
     * Lineage reference object : ALL_REFUND
     * 
     */
    @JsonProperty("allRefund")
    public void setAllRefund(Double allRefund) {
        this.allRefund = allRefund;
    }

    public RefundReviewStudents100QapiPost withAllRefund(Double allRefund) {
        this.allRefund = allRefund;
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

    public RefundReviewStudents100QapiPost withRefundInd(String refundInd) {
        this.refundInd = refundInd;
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

    public RefundReviewStudents100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RefundReviewStudents100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("accountBalance");
        sb.append('=');
        sb.append(((this.accountBalance == null)?"<null>":this.accountBalance));
        sb.append(',');
        sb.append("pending");
        sb.append('=');
        sb.append(((this.pending == null)?"<null>":this.pending));
        sb.append(',');
        sb.append("t4Refund");
        sb.append('=');
        sb.append(((this.t4Refund == null)?"<null>":this.t4Refund));
        sb.append(',');
        sb.append("allRefund");
        sb.append('=');
        sb.append(((this.allRefund == null)?"<null>":this.allRefund));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
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
        result = ((result* 31)+((this.t4Refund == null)? 0 :this.t4Refund.hashCode()));
        result = ((result* 31)+((this.allRefund == null)? 0 :this.allRefund.hashCode()));
        result = ((result* 31)+((this.pending == null)? 0 :this.pending.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountBalance == null)? 0 :this.accountBalance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefundReviewStudents100QapiPost) == false) {
            return false;
        }
        RefundReviewStudents100QapiPost rhs = ((RefundReviewStudents100QapiPost) other);
        return (((((((((this.t4Refund == rhs.t4Refund)||((this.t4Refund!= null)&&this.t4Refund.equals(rhs.t4Refund)))&&((this.allRefund == rhs.allRefund)||((this.allRefund!= null)&&this.allRefund.equals(rhs.allRefund))))&&((this.pending == rhs.pending)||((this.pending!= null)&&this.pending.equals(rhs.pending))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountBalance == rhs.accountBalance)||((this.accountBalance!= null)&&this.accountBalance.equals(rhs.accountBalance))));
    }

}
