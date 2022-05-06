
package com.ellucian.generated.bpapi.ban.miscellaneous_transaction.v1_0_0;

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
    "printReceipt",
    "dupReceiptInd",
    "dummyNum3"
})
@Generated("jsonschema2pojo")
public class ReceiptPrintCtl {

    /**
     * Print Receipt
     * <p>
     * Lineage reference object : printReceipt
     * 
     */
    @JsonProperty("printReceipt")
    @JsonPropertyDescription("Lineage reference object : printReceipt")
    private Object printReceipt;
    /**
     * Print Duplicate
     * <p>
     * Lineage reference object : dupReceiptInd
     * 
     */
    @JsonProperty("dupReceiptInd")
    @JsonPropertyDescription("Lineage reference object : dupReceiptInd")
    private Object dupReceiptInd;
    /**
     * Lineage reference object : dummyNum3
     * 
     */
    @JsonProperty("dummyNum3")
    @JsonPropertyDescription("Lineage reference object : dummyNum3")
    private Object dummyNum3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Print Receipt
     * <p>
     * Lineage reference object : printReceipt
     * 
     */
    @JsonProperty("printReceipt")
    public Object getPrintReceipt() {
        return printReceipt;
    }

    /**
     * Print Receipt
     * <p>
     * Lineage reference object : printReceipt
     * 
     */
    @JsonProperty("printReceipt")
    public void setPrintReceipt(Object printReceipt) {
        this.printReceipt = printReceipt;
    }

    public ReceiptPrintCtl withPrintReceipt(Object printReceipt) {
        this.printReceipt = printReceipt;
        return this;
    }

    /**
     * Print Duplicate
     * <p>
     * Lineage reference object : dupReceiptInd
     * 
     */
    @JsonProperty("dupReceiptInd")
    public Object getDupReceiptInd() {
        return dupReceiptInd;
    }

    /**
     * Print Duplicate
     * <p>
     * Lineage reference object : dupReceiptInd
     * 
     */
    @JsonProperty("dupReceiptInd")
    public void setDupReceiptInd(Object dupReceiptInd) {
        this.dupReceiptInd = dupReceiptInd;
    }

    public ReceiptPrintCtl withDupReceiptInd(Object dupReceiptInd) {
        this.dupReceiptInd = dupReceiptInd;
        return this;
    }

    /**
     * Lineage reference object : dummyNum3
     * 
     */
    @JsonProperty("dummyNum3")
    public Object getDummyNum3() {
        return dummyNum3;
    }

    /**
     * Lineage reference object : dummyNum3
     * 
     */
    @JsonProperty("dummyNum3")
    public void setDummyNum3(Object dummyNum3) {
        this.dummyNum3 = dummyNum3;
    }

    public ReceiptPrintCtl withDummyNum3(Object dummyNum3) {
        this.dummyNum3 = dummyNum3;
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

    public ReceiptPrintCtl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptPrintCtl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("printReceipt");
        sb.append('=');
        sb.append(((this.printReceipt == null)?"<null>":this.printReceipt));
        sb.append(',');
        sb.append("dupReceiptInd");
        sb.append('=');
        sb.append(((this.dupReceiptInd == null)?"<null>":this.dupReceiptInd));
        sb.append(',');
        sb.append("dummyNum3");
        sb.append('=');
        sb.append(((this.dummyNum3 == null)?"<null>":this.dummyNum3));
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
        result = ((result* 31)+((this.printReceipt == null)? 0 :this.printReceipt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dupReceiptInd == null)? 0 :this.dupReceiptInd.hashCode()));
        result = ((result* 31)+((this.dummyNum3 == null)? 0 :this.dummyNum3 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptPrintCtl) == false) {
            return false;
        }
        ReceiptPrintCtl rhs = ((ReceiptPrintCtl) other);
        return (((((this.printReceipt == rhs.printReceipt)||((this.printReceipt!= null)&&this.printReceipt.equals(rhs.printReceipt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dupReceiptInd == rhs.dupReceiptInd)||((this.dupReceiptInd!= null)&&this.dupReceiptInd.equals(rhs.dupReceiptInd))))&&((this.dummyNum3 == rhs.dummyNum3)||((this.dummyNum3 != null)&&this.dummyNum3 .equals(rhs.dummyNum3))));
    }

}
