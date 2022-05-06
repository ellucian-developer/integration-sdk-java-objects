
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
    "t4Refund",
    "allRefund",
    "pidm",
    "pending",
    "rwname",
    "refundInd",
    "id",
    "accountBalance"
})
@Generated("jsonschema2pojo")
public class RefundReviewStudents100PutResponse {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RefundReviewStudents100PutResponse withT4Refund(Double t4Refund) {
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

    public RefundReviewStudents100PutResponse withAllRefund(Double allRefund) {
        this.allRefund = allRefund;
        return this;
    }

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

    public RefundReviewStudents100PutResponse withPidm(Double pidm) {
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

    public RefundReviewStudents100PutResponse withPending(Double pending) {
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

    public RefundReviewStudents100PutResponse withRwname(String rwname) {
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

    public RefundReviewStudents100PutResponse withRefundInd(String refundInd) {
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

    public RefundReviewStudents100PutResponse withId(String id) {
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

    public RefundReviewStudents100PutResponse withAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
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

    public RefundReviewStudents100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RefundReviewStudents100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("t4Refund");
        sb.append('=');
        sb.append(((this.t4Refund == null)?"<null>":this.t4Refund));
        sb.append(',');
        sb.append("allRefund");
        sb.append('=');
        sb.append(((this.allRefund == null)?"<null>":this.allRefund));
        sb.append(',');
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
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.pending == null)? 0 :this.pending.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
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
        if ((other instanceof RefundReviewStudents100PutResponse) == false) {
            return false;
        }
        RefundReviewStudents100PutResponse rhs = ((RefundReviewStudents100PutResponse) other);
        return ((((((((((this.t4Refund == rhs.t4Refund)||((this.t4Refund!= null)&&this.t4Refund.equals(rhs.t4Refund)))&&((this.allRefund == rhs.allRefund)||((this.allRefund!= null)&&this.allRefund.equals(rhs.allRefund))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.pending == rhs.pending)||((this.pending!= null)&&this.pending.equals(rhs.pending))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountBalance == rhs.accountBalance)||((this.accountBalance!= null)&&this.accountBalance.equals(rhs.accountBalance))));
    }

}
