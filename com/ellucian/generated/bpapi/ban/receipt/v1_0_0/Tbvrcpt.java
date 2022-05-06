
package com.ellucian.generated.bpapi.ban.receipt.v1_0_0;

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
    "detailDesc",
    "charge",
    "payment",
    "detailCode"
})
@Generated("jsonschema2pojo")
public class Tbvrcpt {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    private String detailDesc;
    /**
     * Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("charge")
    private Double charge;
    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment")
    private Double payment;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVRCPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCPT_DETAIL_CODE")
    private String detailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Tbvrcpt withDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
        return this;
    }

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

    public Tbvrcpt withCharge(Double charge) {
        this.charge = charge;
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

    public Tbvrcpt withPayment(Double payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVRCPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVRCPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbvrcpt withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public Tbvrcpt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvrcpt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailDesc");
        sb.append('=');
        sb.append(((this.detailDesc == null)?"<null>":this.detailDesc));
        sb.append(',');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.detailDesc == null)? 0 :this.detailDesc.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.charge == null)? 0 :this.charge.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvrcpt) == false) {
            return false;
        }
        Tbvrcpt rhs = ((Tbvrcpt) other);
        return ((((((this.detailDesc == rhs.detailDesc)||((this.detailDesc!= null)&&this.detailDesc.equals(rhs.detailDesc)))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))));
    }

}
