
package com.ellucian.generated.bpapi.ban.receiving_goods_query.v1_0_0;

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
    "keyblokRchdCode"
})
@Generated("jsonschema2pojo")
public class ReceivingGoodsQuery100QapiPost {

    @JsonProperty("keyblokRchdCode")
    private String keyblokRchdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblokRchdCode")
    public String getKeyblokRchdCode() {
        return keyblokRchdCode;
    }

    @JsonProperty("keyblokRchdCode")
    public void setKeyblokRchdCode(String keyblokRchdCode) {
        this.keyblokRchdCode = keyblokRchdCode;
    }

    public ReceivingGoodsQuery100QapiPost withKeyblokRchdCode(String keyblokRchdCode) {
        this.keyblokRchdCode = keyblokRchdCode;
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

    public ReceivingGoodsQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceivingGoodsQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblokRchdCode");
        sb.append('=');
        sb.append(((this.keyblokRchdCode == null)?"<null>":this.keyblokRchdCode));
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
        result = ((result* 31)+((this.keyblokRchdCode == null)? 0 :this.keyblokRchdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceivingGoodsQuery100QapiPost) == false) {
            return false;
        }
        ReceivingGoodsQuery100QapiPost rhs = ((ReceivingGoodsQuery100QapiPost) other);
        return (((this.keyblokRchdCode == rhs.keyblokRchdCode)||((this.keyblokRchdCode!= null)&&this.keyblokRchdCode.equals(rhs.keyblokRchdCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
