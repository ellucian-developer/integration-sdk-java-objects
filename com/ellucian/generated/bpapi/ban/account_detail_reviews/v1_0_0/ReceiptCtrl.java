
package com.ellucian.generated.bpapi.ban.account_detail_reviews.v1_0_0;

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
    "receiptGenInd"
})
@Generated("jsonschema2pojo")
public class ReceiptCtrl {

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    @JsonPropertyDescription("Lineage reference object : receiptGenInd")
    private String receiptGenInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    public String getReceiptGenInd() {
        return receiptGenInd;
    }

    /**
     * Receipt?
     * <p>
     * Lineage reference object : receiptGenInd
     * 
     */
    @JsonProperty("receiptGenInd")
    public void setReceiptGenInd(String receiptGenInd) {
        this.receiptGenInd = receiptGenInd;
    }

    public ReceiptCtrl withReceiptGenInd(String receiptGenInd) {
        this.receiptGenInd = receiptGenInd;
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

    public ReceiptCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("receiptGenInd");
        sb.append('=');
        sb.append(((this.receiptGenInd == null)?"<null>":this.receiptGenInd));
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
        result = ((result* 31)+((this.receiptGenInd == null)? 0 :this.receiptGenInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptCtrl) == false) {
            return false;
        }
        ReceiptCtrl rhs = ((ReceiptCtrl) other);
        return (((this.receiptGenInd == rhs.receiptGenInd)||((this.receiptGenInd!= null)&&this.receiptGenInd.equals(rhs.receiptGenInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
