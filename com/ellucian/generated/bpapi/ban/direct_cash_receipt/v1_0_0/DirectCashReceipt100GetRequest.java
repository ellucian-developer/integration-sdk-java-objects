
package com.ellucian.generated.bpapi.ban.direct_cash_receipt.v1_0_0;

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
    "documentNumber",
    "vendor"
})
@Generated("jsonschema2pojo")
public class DirectCashReceipt100GetRequest {

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private Object documentNumber;
    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Lineage reference object : keyBlockVendor")
    private Object vendor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public Object getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
    }

    public DirectCashReceipt100GetRequest withDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public DirectCashReceipt100GetRequest withVendor(Object vendor) {
        this.vendor = vendor;
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

    public DirectCashReceipt100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectCashReceipt100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectCashReceipt100GetRequest) == false) {
            return false;
        }
        DirectCashReceipt100GetRequest rhs = ((DirectCashReceipt100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))));
    }

}
