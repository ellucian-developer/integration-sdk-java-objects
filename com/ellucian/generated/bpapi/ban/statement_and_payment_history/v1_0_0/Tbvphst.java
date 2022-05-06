
package com.ellucian.generated.bpapi.ban.statement_and_payment_history.v1_0_0;

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
    "amount",
    "entryDate",
    "billDate",
    "detailCode",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbvphst {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVPHST_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_AMOUNT")
    private Double amount;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBVPHST_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_ENTRY_DATE")
    private Date entryDate;
    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVPHST_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_BILL_DATE")
    private Date billDate;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVPHST_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_DETAIL_CODE")
    private String detailCode;
    /**
     * Description
     * <p>
     * Lineage reference object : TBVPHST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TBVPHST_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBVPHST_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVPHST_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBVPHST_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Tbvphst withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBVPHST_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBVPHST_ENTRY_DATE
     * 
     */
    @JsonProperty("entryDate")
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Tbvphst withEntryDate(Date entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVPHST_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public Date getBillDate() {
        return billDate;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBVPHST_BILL_DATE
     * 
     */
    @JsonProperty("billDate")
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Tbvphst withBillDate(Date billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVPHST_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVPHST_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbvphst withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBVPHST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBVPHST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbvphst withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVPHST_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVPHST_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbvphst withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Tbvphst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvphst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("billDate");
        sb.append('=');
        sb.append(((this.billDate == null)?"<null>":this.billDate));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.billDate == null)? 0 :this.billDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvphst) == false) {
            return false;
        }
        Tbvphst rhs = ((Tbvphst) other);
        return ((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.billDate == rhs.billDate)||((this.billDate!= null)&&this.billDate.equals(rhs.billDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
