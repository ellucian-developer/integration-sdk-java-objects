
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
    "pidm",
    "pending",
    "rwname",
    "refundInd",
    "id",
    "accountBalance",
    "refund"
})
@Generated("jsonschema2pojo")
public class FinanceRefundReview100PutResponse {

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : PIDM")
    private Double pidm;
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
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("rwname")
    @JsonPropertyDescription("Lineage reference object : NAME")
    private String rwname;
    @JsonProperty("refundInd")
    private String refundInd;
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
     * Account Balance
     * <p>
     * Lineage reference object : ACCOUNT_BALANCE
     * 
     */
    @JsonProperty("accountBalance")
    @JsonPropertyDescription("Lineage reference object : ACCOUNT_BALANCE")
    private Double accountBalance;
    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("refund")
    @JsonPropertyDescription("Lineage reference object : REFUND")
    private Double refund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public FinanceRefundReview100PutResponse withPidm(Double pidm) {
        this.pidm = pidm;
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

    public FinanceRefundReview100PutResponse withPending(Double pending) {
        this.pending = pending;
        return this;
    }

    /**
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("rwname")
    public String getRwname() {
        return rwname;
    }

    /**
     * Lineage reference object : NAME
     * 
     */
    @JsonProperty("rwname")
    public void setRwname(String rwname) {
        this.rwname = rwname;
    }

    public FinanceRefundReview100PutResponse withRwname(String rwname) {
        this.rwname = rwname;
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

    public FinanceRefundReview100PutResponse withRefundInd(String refundInd) {
        this.refundInd = refundInd;
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

    public FinanceRefundReview100PutResponse withId(String id) {
        this.id = id;
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

    public FinanceRefundReview100PutResponse withAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("refund")
    public Double getRefund() {
        return refund;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : REFUND
     * 
     */
    @JsonProperty("refund")
    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public FinanceRefundReview100PutResponse withRefund(Double refund) {
        this.refund = refund;
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

    public FinanceRefundReview100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceRefundReview100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("pending");
        sb.append('=');
        sb.append(((this.pending == null)?"<null>":this.pending));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("accountBalance");
        sb.append('=');
        sb.append(((this.accountBalance == null)?"<null>":this.accountBalance));
        sb.append(',');
        sb.append("refund");
        sb.append('=');
        sb.append(((this.refund == null)?"<null>":this.refund));
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
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.pending == null)? 0 :this.pending.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountBalance == null)? 0 :this.accountBalance.hashCode()));
        result = ((result* 31)+((this.refund == null)? 0 :this.refund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceRefundReview100PutResponse) == false) {
            return false;
        }
        FinanceRefundReview100PutResponse rhs = ((FinanceRefundReview100PutResponse) other);
        return (((((((((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm)))&&((this.pending == rhs.pending)||((this.pending!= null)&&this.pending.equals(rhs.pending))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountBalance == rhs.accountBalance)||((this.accountBalance!= null)&&this.accountBalance.equals(rhs.accountBalance))))&&((this.refund == rhs.refund)||((this.refund!= null)&&this.refund.equals(rhs.refund))));
    }

}
