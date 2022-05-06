
package com.ellucian.generated.bpapi.ban.statement_and_payment_history.v1_0_0;

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
    "charge",
    "entryDate",
    "payment",
    "detailCode",
    "effectiveDate",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbraccd {

    @JsonProperty("charge")
    private Double charge;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * (Required)
     * 
     */
    @JsonProperty("entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ENTRY_DATE")
    private Date entryDate;
    @JsonProperty("payment")
    private Double payment;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE")
    private String detailCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("charge")
    public Double getCharge() {
        return charge;
    }

    @JsonProperty("charge")
    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Tbraccd withCharge(Double charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * (Required)
     * 
     */
    @JsonProperty("entryDate")
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * (Required)
     * 
     */
    @JsonProperty("entryDate")
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Tbraccd withEntryDate(Date entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    @JsonProperty("payment")
    public Double getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Tbraccd withPayment(Double payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE
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
     * Lineage reference object : TBRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbraccd withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
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
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Tbraccd withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbraccd withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE
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
     * Lineage reference object : TBRACCD_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbraccd withTermCode(String termCode) {
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

    public Tbraccd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbraccd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.charge == null)? 0 :this.charge.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbraccd) == false) {
            return false;
        }
        Tbraccd rhs = ((Tbraccd) other);
        return (((((((((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge)))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
