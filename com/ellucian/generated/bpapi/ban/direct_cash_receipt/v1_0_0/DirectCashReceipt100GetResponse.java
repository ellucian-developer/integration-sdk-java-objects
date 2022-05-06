
package com.ellucian.generated.bpapi.ban.direct_cash_receipt.v1_0_0;

import java.util.Date;
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
    "collectTaxDesc",
    "transDate",
    "nsfOnOffInd",
    "displayCollectTax",
    "docAmt"
})
@Generated("jsonschema2pojo")
public class DirectCashReceipt100GetResponse {

    @JsonProperty("collectTaxDesc")
    private String collectTaxDesc;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBCSHH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBCSHH_TRANS_DATE")
    private Date transDate;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBCSHH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBCSHH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCollectTax")
    private String displayCollectTax;
    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBCSHH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBCSHH_DOC_AMT")
    private Double docAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("collectTaxDesc")
    public String getCollectTaxDesc() {
        return collectTaxDesc;
    }

    @JsonProperty("collectTaxDesc")
    public void setCollectTaxDesc(String collectTaxDesc) {
        this.collectTaxDesc = collectTaxDesc;
    }

    public DirectCashReceipt100GetResponse withCollectTaxDesc(String collectTaxDesc) {
        this.collectTaxDesc = collectTaxDesc;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBCSHH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBCSHH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public DirectCashReceipt100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBCSHH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBCSHH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public DirectCashReceipt100GetResponse withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCollectTax")
    public String getDisplayCollectTax() {
        return displayCollectTax;
    }

    /**
     * Collects Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCollectTax")
    public void setDisplayCollectTax(String displayCollectTax) {
        this.displayCollectTax = displayCollectTax;
    }

    public DirectCashReceipt100GetResponse withDisplayCollectTax(String displayCollectTax) {
        this.displayCollectTax = displayCollectTax;
        return this;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBCSHH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBCSHH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public DirectCashReceipt100GetResponse withDocAmt(Double docAmt) {
        this.docAmt = docAmt;
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

    public DirectCashReceipt100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectCashReceipt100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("collectTaxDesc");
        sb.append('=');
        sb.append(((this.collectTaxDesc == null)?"<null>":this.collectTaxDesc));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("displayCollectTax");
        sb.append('=');
        sb.append(((this.displayCollectTax == null)?"<null>":this.displayCollectTax));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
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
        result = ((result* 31)+((this.collectTaxDesc == null)? 0 :this.collectTaxDesc.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.displayCollectTax == null)? 0 :this.displayCollectTax.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectCashReceipt100GetResponse) == false) {
            return false;
        }
        DirectCashReceipt100GetResponse rhs = ((DirectCashReceipt100GetResponse) other);
        return (((((((this.collectTaxDesc == rhs.collectTaxDesc)||((this.collectTaxDesc!= null)&&this.collectTaxDesc.equals(rhs.collectTaxDesc)))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.displayCollectTax == rhs.displayCollectTax)||((this.displayCollectTax!= null)&&this.displayCollectTax.equals(rhs.displayCollectTax))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))));
    }

}
