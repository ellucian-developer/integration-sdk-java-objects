
package com.ellucian.generated.bpapi.ban.receipt_queries.v1_0_0;

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
    "tranNumber",
    "payment",
    "detailCode",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbvrcp2 {

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("charge")
    private Double charge;
    /**
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment")
    private Double payment;
    /**
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_DETAIL_CODE")
    private String detailCode;
    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_DESC")
    private String desc;
    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("charge")
    public Double getCharge() {
        return charge;
    }

    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("charge")
    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Tbvrcp2 withCharge(Double charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public Tbvrcp2 withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment")
    public Double getPayment() {
        return payment;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Tbvrcp2 withPayment(Double payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbvrcp2 withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbvrcp2 withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbvrcp2 withTermCode(String termCode) {
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

    public Tbvrcp2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvrcp2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvrcp2) == false) {
            return false;
        }
        Tbvrcp2 rhs = ((Tbvrcp2) other);
        return ((((((((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge)))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
