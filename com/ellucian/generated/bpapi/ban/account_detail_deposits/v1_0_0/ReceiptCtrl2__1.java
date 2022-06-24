
package com.ellucian.generated.bpapi.ban.account_detail_deposits.v1_0_0;

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
    "receiptGenInd2"
})
@Generated("jsonschema2pojo")
public class ReceiptCtrl2__1 {

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    @JsonPropertyDescription("Lineage reference object : receiptGenInd2")
    private String receiptGenInd2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    public String getReceiptGenInd2() {
        return receiptGenInd2;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd2
     * 
     */
    @JsonProperty("receiptGenInd2")
    public void setReceiptGenInd2(String receiptGenInd2) {
        this.receiptGenInd2 = receiptGenInd2;
    }

    public ReceiptCtrl2__1 withReceiptGenInd2(String receiptGenInd2) {
        this.receiptGenInd2 = receiptGenInd2;
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

    public ReceiptCtrl2__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptCtrl2__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("receiptGenInd2");
        sb.append('=');
        sb.append(((this.receiptGenInd2 == null)?"<null>":this.receiptGenInd2));
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
        result = ((result* 31)+((this.receiptGenInd2 == null)? 0 :this.receiptGenInd2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptCtrl2__1) == false) {
            return false;
        }
        ReceiptCtrl2__1 rhs = ((ReceiptCtrl2__1) other);
        return (((this.receiptGenInd2 == rhs.receiptGenInd2)||((this.receiptGenInd2 != null)&&this.receiptGenInd2 .equals(rhs.receiptGenInd2)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
