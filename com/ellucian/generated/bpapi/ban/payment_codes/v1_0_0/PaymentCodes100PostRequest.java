
package com.ellucian.generated.bpapi.ban.payment_codes.v1_0_0;

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
    "code",
    "payTranInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class PaymentCodes100PostRequest {

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TTVPTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVPTYP_CODE")
    private String code;
    /**
     * Type
     * <p>
     * Lineage reference object : TTVPTYP_PAY_TRAN_IND
     * (Required)
     * 
     */
    @JsonProperty("payTranInd")
    @JsonPropertyDescription("Lineage reference object : TTVPTYP_PAY_TRAN_IND")
    private String payTranInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVPTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVPTYP_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TTVPTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TTVPTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PaymentCodes100PostRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVPTYP_PAY_TRAN_IND
     * (Required)
     * 
     */
    @JsonProperty("payTranInd")
    public String getPayTranInd() {
        return payTranInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVPTYP_PAY_TRAN_IND
     * (Required)
     * 
     */
    @JsonProperty("payTranInd")
    public void setPayTranInd(String payTranInd) {
        this.payTranInd = payTranInd;
    }

    public PaymentCodes100PostRequest withPayTranInd(String payTranInd) {
        this.payTranInd = payTranInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVPTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVPTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PaymentCodes100PostRequest withDesc(String desc) {
        this.desc = desc;
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

    public PaymentCodes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentCodes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("payTranInd");
        sb.append('=');
        sb.append(((this.payTranInd == null)?"<null>":this.payTranInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.payTranInd == null)? 0 :this.payTranInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentCodes100PostRequest) == false) {
            return false;
        }
        PaymentCodes100PostRequest rhs = ((PaymentCodes100PostRequest) other);
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.payTranInd == rhs.payTranInd)||((this.payTranInd!= null)&&this.payTranInd.equals(rhs.payTranInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
