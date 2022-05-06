
package com.ellucian.generated.bpapi.ban.purchase_order_balancing_completion.v1_0_0;

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
    "displayPohdCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderBalancingCompletion100QapiPost {

    @JsonProperty("displayPohdCode")
    private String displayPohdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayPohdCode")
    public String getDisplayPohdCode() {
        return displayPohdCode;
    }

    @JsonProperty("displayPohdCode")
    public void setDisplayPohdCode(String displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
    }

    public PurchaseOrderBalancingCompletion100QapiPost withDisplayPohdCode(String displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
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

    public PurchaseOrderBalancingCompletion100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderBalancingCompletion100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayPohdCode");
        sb.append('=');
        sb.append(((this.displayPohdCode == null)?"<null>":this.displayPohdCode));
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
        result = ((result* 31)+((this.displayPohdCode == null)? 0 :this.displayPohdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderBalancingCompletion100QapiPost) == false) {
            return false;
        }
        PurchaseOrderBalancingCompletion100QapiPost rhs = ((PurchaseOrderBalancingCompletion100QapiPost) other);
        return (((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
