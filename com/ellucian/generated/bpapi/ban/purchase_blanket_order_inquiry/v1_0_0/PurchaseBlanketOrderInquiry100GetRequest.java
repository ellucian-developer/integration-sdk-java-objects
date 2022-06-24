
package com.ellucian.generated.bpapi.ban.purchase_blanket_order_inquiry.v1_0_0;

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
    "displayBordCode",
    "displayChangeSeqNum",
    "displayPohdCode"
})
@Generated("jsonschema2pojo")
public class PurchaseBlanketOrderInquiry100GetRequest {

    /**
     * Blanket Order
     * <p>
     * Lineage reference object : displayBordCode
     * 
     */
    @JsonProperty("displayBordCode")
    @JsonPropertyDescription("Lineage reference object : displayBordCode")
    private String displayBordCode;
    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    @JsonPropertyDescription("Lineage reference object : displayChangeSeqNum")
    private Double displayChangeSeqNum;
    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    @JsonPropertyDescription("Lineage reference object : displayPohdCode")
    private String displayPohdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Blanket Order
     * <p>
     * Lineage reference object : displayBordCode
     * 
     */
    @JsonProperty("displayBordCode")
    public String getDisplayBordCode() {
        return displayBordCode;
    }

    /**
     * Blanket Order
     * <p>
     * Lineage reference object : displayBordCode
     * 
     */
    @JsonProperty("displayBordCode")
    public void setDisplayBordCode(String displayBordCode) {
        this.displayBordCode = displayBordCode;
    }

    public PurchaseBlanketOrderInquiry100GetRequest withDisplayBordCode(String displayBordCode) {
        this.displayBordCode = displayBordCode;
        return this;
    }

    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    public Double getDisplayChangeSeqNum() {
        return displayChangeSeqNum;
    }

    /**
     * Change Sequence Number
     * <p>
     * Lineage reference object : displayChangeSeqNum
     * 
     */
    @JsonProperty("displayChangeSeqNum")
    public void setDisplayChangeSeqNum(Double displayChangeSeqNum) {
        this.displayChangeSeqNum = displayChangeSeqNum;
    }

    public PurchaseBlanketOrderInquiry100GetRequest withDisplayChangeSeqNum(Double displayChangeSeqNum) {
        this.displayChangeSeqNum = displayChangeSeqNum;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public String getDisplayPohdCode() {
        return displayPohdCode;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : displayPohdCode
     * 
     */
    @JsonProperty("displayPohdCode")
    public void setDisplayPohdCode(String displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
    }

    public PurchaseBlanketOrderInquiry100GetRequest withDisplayPohdCode(String displayPohdCode) {
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

    public PurchaseBlanketOrderInquiry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseBlanketOrderInquiry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayBordCode");
        sb.append('=');
        sb.append(((this.displayBordCode == null)?"<null>":this.displayBordCode));
        sb.append(',');
        sb.append("displayChangeSeqNum");
        sb.append('=');
        sb.append(((this.displayChangeSeqNum == null)?"<null>":this.displayChangeSeqNum));
        sb.append(',');
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
        result = ((result* 31)+((this.displayBordCode == null)? 0 :this.displayBordCode.hashCode()));
        result = ((result* 31)+((this.displayChangeSeqNum == null)? 0 :this.displayChangeSeqNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayPohdCode == null)? 0 :this.displayPohdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseBlanketOrderInquiry100GetRequest) == false) {
            return false;
        }
        PurchaseBlanketOrderInquiry100GetRequest rhs = ((PurchaseBlanketOrderInquiry100GetRequest) other);
        return (((((this.displayBordCode == rhs.displayBordCode)||((this.displayBordCode!= null)&&this.displayBordCode.equals(rhs.displayBordCode)))&&((this.displayChangeSeqNum == rhs.displayChangeSeqNum)||((this.displayChangeSeqNum!= null)&&this.displayChangeSeqNum.equals(rhs.displayChangeSeqNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode))));
    }

}
