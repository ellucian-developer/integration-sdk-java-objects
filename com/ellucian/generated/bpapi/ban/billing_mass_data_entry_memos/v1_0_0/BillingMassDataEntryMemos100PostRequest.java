
package com.ellucian.generated.bpapi.ban.billing_mass_data_entry_memos.v1_0_0;

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
    "keybloc3DetailCode",
    "keybloc3BillingInd",
    "id",
    "keybloc3ExpDate",
    "detailCode",
    "atypCode",
    "atypSeqno",
    "keybloc3Amount",
    "desc",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class BillingMassDataEntryMemos100PostRequest {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_AMOUNT")
    private Double amount;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    @JsonPropertyDescription("Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc")
    private Object keybloc3DetailCode;
    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    @JsonPropertyDescription("Lineage reference object : keybloc3BillingInd")
    private Object keybloc3BillingInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    @JsonPropertyDescription("Lineage reference object : keybloc3ExpDate")
    private Object keybloc3ExpDate;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_CODE")
    private String atypCode;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_SEQNO")
    private Double atypSeqno;
    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    @JsonPropertyDescription("Lineage reference object : keybloc3Amount")
    private Object keybloc3Amount;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DESC")
    private String desc;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BillingMassDataEntryMemos100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    public Object getKeybloc3DetailCode() {
        return keybloc3DetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : keybloc3DetailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("keybloc3DetailCode")
    public void setKeybloc3DetailCode(Object keybloc3DetailCode) {
        this.keybloc3DetailCode = keybloc3DetailCode;
    }

    public BillingMassDataEntryMemos100PostRequest withKeybloc3DetailCode(Object keybloc3DetailCode) {
        this.keybloc3DetailCode = keybloc3DetailCode;
        return this;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    public Object getKeybloc3BillingInd() {
        return keybloc3BillingInd;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : keybloc3BillingInd
     * 
     */
    @JsonProperty("keybloc3BillingInd")
    public void setKeybloc3BillingInd(Object keybloc3BillingInd) {
        this.keybloc3BillingInd = keybloc3BillingInd;
    }

    public BillingMassDataEntryMemos100PostRequest withKeybloc3BillingInd(Object keybloc3BillingInd) {
        this.keybloc3BillingInd = keybloc3BillingInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BillingMassDataEntryMemos100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    public Object getKeybloc3ExpDate() {
        return keybloc3ExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : keybloc3ExpDate
     * 
     */
    @JsonProperty("keybloc3ExpDate")
    public void setKeybloc3ExpDate(Object keybloc3ExpDate) {
        this.keybloc3ExpDate = keybloc3ExpDate;
    }

    public BillingMassDataEntryMemos100PostRequest withKeybloc3ExpDate(Object keybloc3ExpDate) {
        this.keybloc3ExpDate = keybloc3ExpDate;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
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
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public BillingMassDataEntryMemos100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public BillingMassDataEntryMemos100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public BillingMassDataEntryMemos100PostRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    public Object getKeybloc3Amount() {
        return keybloc3Amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : keybloc3Amount
     * 
     */
    @JsonProperty("keybloc3Amount")
    public void setKeybloc3Amount(Object keybloc3Amount) {
        this.keybloc3Amount = keybloc3Amount;
    }

    public BillingMassDataEntryMemos100PostRequest withKeybloc3Amount(Object keybloc3Amount) {
        this.keybloc3Amount = keybloc3Amount;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BillingMassDataEntryMemos100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BillingMassDataEntryMemos100PostRequest withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public BillingMassDataEntryMemos100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingMassDataEntryMemos100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("keybloc3DetailCode");
        sb.append('=');
        sb.append(((this.keybloc3DetailCode == null)?"<null>":this.keybloc3DetailCode));
        sb.append(',');
        sb.append("keybloc3BillingInd");
        sb.append('=');
        sb.append(((this.keybloc3BillingInd == null)?"<null>":this.keybloc3BillingInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keybloc3ExpDate");
        sb.append('=');
        sb.append(((this.keybloc3ExpDate == null)?"<null>":this.keybloc3ExpDate));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("keybloc3Amount");
        sb.append('=');
        sb.append(((this.keybloc3Amount == null)?"<null>":this.keybloc3Amount));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.keybloc3DetailCode == null)? 0 :this.keybloc3DetailCode.hashCode()));
        result = ((result* 31)+((this.keybloc3BillingInd == null)? 0 :this.keybloc3BillingInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.keybloc3Amount == null)? 0 :this.keybloc3Amount.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keybloc3ExpDate == null)? 0 :this.keybloc3ExpDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingMassDataEntryMemos100PostRequest) == false) {
            return false;
        }
        BillingMassDataEntryMemos100PostRequest rhs = ((BillingMassDataEntryMemos100PostRequest) other);
        return (((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.keybloc3DetailCode == rhs.keybloc3DetailCode)||((this.keybloc3DetailCode!= null)&&this.keybloc3DetailCode.equals(rhs.keybloc3DetailCode))))&&((this.keybloc3BillingInd == rhs.keybloc3BillingInd)||((this.keybloc3BillingInd!= null)&&this.keybloc3BillingInd.equals(rhs.keybloc3BillingInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.keybloc3Amount == rhs.keybloc3Amount)||((this.keybloc3Amount!= null)&&this.keybloc3Amount.equals(rhs.keybloc3Amount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keybloc3ExpDate == rhs.keybloc3ExpDate)||((this.keybloc3ExpDate!= null)&&this.keybloc3ExpDate.equals(rhs.keybloc3ExpDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
