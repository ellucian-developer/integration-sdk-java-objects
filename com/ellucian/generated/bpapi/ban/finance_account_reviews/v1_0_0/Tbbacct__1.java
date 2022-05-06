
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "deliDesc",
    "deliCode",
    "refundInd",
    "billCodeDesc",
    "billCode"
})
@Generated("jsonschema2pojo")
public class Tbbacct__1 {

    @JsonProperty("deliDesc")
    private String deliDesc;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli")
    private String deliCode;
    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_REFUND_IND")
    private String refundInd;
    @JsonProperty("billCodeDesc")
    private String billCodeDesc;
    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String billCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deliDesc")
    public String getDeliDesc() {
        return deliDesc;
    }

    @JsonProperty("deliDesc")
    public void setDeliDesc(String deliDesc) {
        this.deliDesc = deliDesc;
    }

    public Tbbacct__1 withDeliDesc(String deliDesc) {
        this.deliDesc = deliDesc;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public String getDeliCode() {
        return deliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public void setDeliCode(String deliCode) {
        this.deliCode = deliCode;
    }

    public Tbbacct__1 withDeliCode(String deliCode) {
        this.deliCode = deliCode;
        return this;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public Tbbacct__1 withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    @JsonProperty("billCodeDesc")
    public String getBillCodeDesc() {
        return billCodeDesc;
    }

    @JsonProperty("billCodeDesc")
    public void setBillCodeDesc(String billCodeDesc) {
        this.billCodeDesc = billCodeDesc;
    }

    public Tbbacct__1 withBillCodeDesc(String billCodeDesc) {
        this.billCodeDesc = billCodeDesc;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public String getBillCode() {
        return billCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Tbbacct__1 withBillCode(String billCode) {
        this.billCode = billCode;
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

    public Tbbacct__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbacct__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deliDesc");
        sb.append('=');
        sb.append(((this.deliDesc == null)?"<null>":this.deliDesc));
        sb.append(',');
        sb.append("deliCode");
        sb.append('=');
        sb.append(((this.deliCode == null)?"<null>":this.deliCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("billCodeDesc");
        sb.append('=');
        sb.append(((this.billCodeDesc == null)?"<null>":this.billCodeDesc));
        sb.append(',');
        sb.append("billCode");
        sb.append('=');
        sb.append(((this.billCode == null)?"<null>":this.billCode));
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
        result = ((result* 31)+((this.deliDesc == null)? 0 :this.deliDesc.hashCode()));
        result = ((result* 31)+((this.deliCode == null)? 0 :this.deliCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.billCodeDesc == null)? 0 :this.billCodeDesc.hashCode()));
        result = ((result* 31)+((this.billCode == null)? 0 :this.billCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbacct__1) == false) {
            return false;
        }
        Tbbacct__1 rhs = ((Tbbacct__1) other);
        return (((((((this.deliDesc == rhs.deliDesc)||((this.deliDesc!= null)&&this.deliDesc.equals(rhs.deliDesc)))&&((this.deliCode == rhs.deliCode)||((this.deliCode!= null)&&this.deliCode.equals(rhs.deliCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.billCodeDesc == rhs.billCodeDesc)||((this.billCodeDesc!= null)&&this.billCodeDesc.equals(rhs.billCodeDesc))))&&((this.billCode == rhs.billCode)||((this.billCode!= null)&&this.billCode.equals(rhs.billCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
