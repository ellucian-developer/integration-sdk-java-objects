
package com.ellucian.generated.bpapi.ban.check_cancellation.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "faachksCheckNum",
    "bankCode"
})
@Generated("jsonschema2pojo")
public class CheckCancellation100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faachksCheckNum")
    private String faachksCheckNum;
    @JsonProperty("bankCode")
    private String bankCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faachksCheckNum")
    public String getFaachksCheckNum() {
        return faachksCheckNum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faachksCheckNum")
    public void setFaachksCheckNum(String faachksCheckNum) {
        this.faachksCheckNum = faachksCheckNum;
    }

    public CheckCancellation100QapiPost withFaachksCheckNum(String faachksCheckNum) {
        this.faachksCheckNum = faachksCheckNum;
        return this;
    }

    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public CheckCancellation100QapiPost withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public CheckCancellation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckCancellation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faachksCheckNum");
        sb.append('=');
        sb.append(((this.faachksCheckNum == null)?"<null>":this.faachksCheckNum));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
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
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faachksCheckNum == null)? 0 :this.faachksCheckNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckCancellation100QapiPost) == false) {
            return false;
        }
        CheckCancellation100QapiPost rhs = ((CheckCancellation100QapiPost) other);
        return ((((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faachksCheckNum == rhs.faachksCheckNum)||((this.faachksCheckNum!= null)&&this.faachksCheckNum.equals(rhs.faachksCheckNum))));
    }

}
