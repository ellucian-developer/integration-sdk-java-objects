
package com.ellucian.generated.bpapi.ban.purchase_order_information.v1_0_0;

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
    "displayPohdCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderInformation100GetRequest {

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    @JsonPropertyDescription("Lineage reference object : displayPohdCode")
    private Object displayPohdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public Object getDisplayPohdCode() {
        return displayPohdCode;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public void setDisplayPohdCode(Object displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
    }

    public PurchaseOrderInformation100GetRequest withDisplayPohdCode(Object displayPohdCode) {
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

    public PurchaseOrderInformation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderInformation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof PurchaseOrderInformation100GetRequest) == false) {
            return false;
        }
        PurchaseOrderInformation100GetRequest rhs = ((PurchaseOrderInformation100GetRequest) other);
        return (((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
