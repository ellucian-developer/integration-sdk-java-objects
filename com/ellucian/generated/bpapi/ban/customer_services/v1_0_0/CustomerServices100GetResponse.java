
package com.ellucian.generated.bpapi.ban.customer_services.v1_0_0;

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
    "detailCodeDesc",
    "period",
    "stspKeySequence",
    "aidyCode",
    "balance",
    "chargeAmount",
    "detailCode",
    "paymentAmount",
    "effectiveDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CustomerServices100GetResponse {

    /**
     * Description
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE_DESC
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDesc")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_DETAIL_CODE_DESC")
    private String detailCodeDesc;
    /**
     * Period
     * <p>
     * Lineage reference object : TBVCSRV_PERIOD
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_PERIOD")
    private String period;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBVCSRV_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVCSRV_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_AIDY_CODE")
    private String aidyCode;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCSRV_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_BALANCE")
    private Double balance;
    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCSRV_CHARGE_AMOUNT
     * 
     */
    @JsonProperty("chargeAmount")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_CHARGE_AMOUNT")
    private Double chargeAmount;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCSRV_PAYMENT_AMOUNT
     * 
     */
    @JsonProperty("paymentAmount")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_PAYMENT_AMOUNT")
    private Double paymentAmount;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVCSRV_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Term
     * <p>
     * Lineage reference object : TBVCSRV_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBVCSRV_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE_DESC
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDesc")
    public String getDetailCodeDesc() {
        return detailCodeDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE_DESC
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDesc")
    public void setDetailCodeDesc(String detailCodeDesc) {
        this.detailCodeDesc = detailCodeDesc;
    }

    public CustomerServices100GetResponse withDetailCodeDesc(String detailCodeDesc) {
        this.detailCodeDesc = detailCodeDesc;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBVCSRV_PERIOD
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBVCSRV_PERIOD
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public CustomerServices100GetResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBVCSRV_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBVCSRV_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public CustomerServices100GetResponse withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVCSRV_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public String getAidyCode() {
        return aidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBVCSRV_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public void setAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
    }

    public CustomerServices100GetResponse withAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCSRV_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCSRV_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CustomerServices100GetResponse withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCSRV_CHARGE_AMOUNT
     * 
     */
    @JsonProperty("chargeAmount")
    public Double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCSRV_CHARGE_AMOUNT
     * 
     */
    @JsonProperty("chargeAmount")
    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public CustomerServices100GetResponse withChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCSRV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public CustomerServices100GetResponse withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCSRV_PAYMENT_AMOUNT
     * 
     */
    @JsonProperty("paymentAmount")
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCSRV_PAYMENT_AMOUNT
     * 
     */
    @JsonProperty("paymentAmount")
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public CustomerServices100GetResponse withPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBVCSRV_EFFECTIVE_DATE
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
     * Lineage reference object : TBVCSRV_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public CustomerServices100GetResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVCSRV_TERM_CODE, Lookup lineage reference object : stvterm
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
     * Lineage reference object : TBVCSRV_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CustomerServices100GetResponse withTermCode(String termCode) {
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

    public CustomerServices100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerServices100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailCodeDesc");
        sb.append('=');
        sb.append(((this.detailCodeDesc == null)?"<null>":this.detailCodeDesc));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("aidyCode");
        sb.append('=');
        sb.append(((this.aidyCode == null)?"<null>":this.aidyCode));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("chargeAmount");
        sb.append('=');
        sb.append(((this.chargeAmount == null)?"<null>":this.chargeAmount));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("paymentAmount");
        sb.append('=');
        sb.append(((this.paymentAmount == null)?"<null>":this.paymentAmount));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.detailCodeDesc == null)? 0 :this.detailCodeDesc.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.aidyCode == null)? 0 :this.aidyCode.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.chargeAmount == null)? 0 :this.chargeAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.paymentAmount == null)? 0 :this.paymentAmount.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerServices100GetResponse) == false) {
            return false;
        }
        CustomerServices100GetResponse rhs = ((CustomerServices100GetResponse) other);
        return ((((((((((((this.detailCodeDesc == rhs.detailCodeDesc)||((this.detailCodeDesc!= null)&&this.detailCodeDesc.equals(rhs.detailCodeDesc)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.aidyCode == rhs.aidyCode)||((this.aidyCode!= null)&&this.aidyCode.equals(rhs.aidyCode))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.chargeAmount == rhs.chargeAmount)||((this.chargeAmount!= null)&&this.chargeAmount.equals(rhs.chargeAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.paymentAmount == rhs.paymentAmount)||((this.paymentAmount!= null)&&this.paymentAmount.equals(rhs.paymentAmount))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
