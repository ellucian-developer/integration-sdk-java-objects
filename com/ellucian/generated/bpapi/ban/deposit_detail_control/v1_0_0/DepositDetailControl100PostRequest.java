
package com.ellucian.generated.bpapi.ban.deposit_detail_control.v1_0_0;

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
    "detailCodeDeposit",
    "autoReleaseInd"
})
@Generated("jsonschema2pojo")
public class DepositDetailControl100PostRequest {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc")
    private String detailCodeDeposit;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_AUTO_RELEASE_IND")
    private String autoReleaseInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public String getDetailCodeDeposit() {
        return detailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public void setDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
    }

    public DepositDetailControl100PostRequest withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public String getAutoReleaseInd() {
        return autoReleaseInd;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public void setAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
    }

    public DepositDetailControl100PostRequest withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
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

    public DepositDetailControl100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositDetailControl100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
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
        result = ((result* 31)+((this.detailCodeDeposit == null)? 0 :this.detailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.autoReleaseInd == null)? 0 :this.autoReleaseInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositDetailControl100PostRequest) == false) {
            return false;
        }
        DepositDetailControl100PostRequest rhs = ((DepositDetailControl100PostRequest) other);
        return ((((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit)))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
