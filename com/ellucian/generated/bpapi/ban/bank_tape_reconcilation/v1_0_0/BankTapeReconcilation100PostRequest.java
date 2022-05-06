
package com.ellucian.generated.bpapi.ban.bank_tape_reconcilation.v1_0_0;

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
    "cashAcct",
    "bankCode",
    "fabbktpInternalDocCode",
    "bankAcct",
    "transDate",
    "amt",
    "depCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class BankTapeReconcilation100PostRequest {

    /**
     * Cash Account Number
     * <p>
     * Lineage reference object : cashAcct
     * 
     */
    @JsonProperty("cashAcct")
    @JsonPropertyDescription("Lineage reference object : cashAcct")
    private Object cashAcct;
    /**
     * Bank
     * <p>
     * Lineage reference object : faabrecBankCode, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : faabrecBankCode, Lookup lineage reference object : gxvbank")
    private Object bankCode;
    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("fabbktpInternalDocCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_INTERNAL_DOC_CODE")
    private String fabbktpInternalDocCode;
    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : bankAcct
     * 
     */
    @JsonProperty("bankAcct")
    @JsonPropertyDescription("Lineage reference object : bankAcct")
    private Object bankAcct;
    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_TRANS_DATE")
    private Date transDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
     * (Required)
     * 
     */
    @JsonProperty("amt")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_AMT")
    private Double amt;
    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("depCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE")
    private String depCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cash Account Number
     * <p>
     * Lineage reference object : cashAcct
     * 
     */
    @JsonProperty("cashAcct")
    public Object getCashAcct() {
        return cashAcct;
    }

    /**
     * Cash Account Number
     * <p>
     * Lineage reference object : cashAcct
     * 
     */
    @JsonProperty("cashAcct")
    public void setCashAcct(Object cashAcct) {
        this.cashAcct = cashAcct;
    }

    public BankTapeReconcilation100PostRequest withCashAcct(Object cashAcct) {
        this.cashAcct = cashAcct;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : faabrecBankCode, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public Object getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : faabrecBankCode, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(Object bankCode) {
        this.bankCode = bankCode;
    }

    public BankTapeReconcilation100PostRequest withBankCode(Object bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("fabbktpInternalDocCode")
    public String getFabbktpInternalDocCode() {
        return fabbktpInternalDocCode;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("fabbktpInternalDocCode")
    public void setFabbktpInternalDocCode(String fabbktpInternalDocCode) {
        this.fabbktpInternalDocCode = fabbktpInternalDocCode;
    }

    public BankTapeReconcilation100PostRequest withFabbktpInternalDocCode(String fabbktpInternalDocCode) {
        this.fabbktpInternalDocCode = fabbktpInternalDocCode;
        return this;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : bankAcct
     * 
     */
    @JsonProperty("bankAcct")
    public Object getBankAcct() {
        return bankAcct;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : bankAcct
     * 
     */
    @JsonProperty("bankAcct")
    public void setBankAcct(Object bankAcct) {
        this.bankAcct = bankAcct;
    }

    public BankTapeReconcilation100PostRequest withBankAcct(Object bankAcct) {
        this.bankAcct = bankAcct;
        return this;
    }

    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public BankTapeReconcilation100PostRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
     * (Required)
     * 
     */
    @JsonProperty("amt")
    public Double getAmt() {
        return amt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
     * (Required)
     * 
     */
    @JsonProperty("amt")
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public BankTapeReconcilation100PostRequest withAmt(Double amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("depCode")
    public String getDepCode() {
        return depCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("depCode")
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public BankTapeReconcilation100PostRequest withDepCode(String depCode) {
        this.depCode = depCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BankTapeReconcilation100PostRequest withDesc(String desc) {
        this.desc = desc;
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

    public BankTapeReconcilation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankTapeReconcilation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cashAcct");
        sb.append('=');
        sb.append(((this.cashAcct == null)?"<null>":this.cashAcct));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("fabbktpInternalDocCode");
        sb.append('=');
        sb.append(((this.fabbktpInternalDocCode == null)?"<null>":this.fabbktpInternalDocCode));
        sb.append(',');
        sb.append("bankAcct");
        sb.append('=');
        sb.append(((this.bankAcct == null)?"<null>":this.bankAcct));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("amt");
        sb.append('=');
        sb.append(((this.amt == null)?"<null>":this.amt));
        sb.append(',');
        sb.append("depCode");
        sb.append('=');
        sb.append(((this.depCode == null)?"<null>":this.depCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.cashAcct == null)? 0 :this.cashAcct.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.fabbktpInternalDocCode == null)? 0 :this.fabbktpInternalDocCode.hashCode()));
        result = ((result* 31)+((this.bankAcct == null)? 0 :this.bankAcct.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.amt == null)? 0 :this.amt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.depCode == null)? 0 :this.depCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankTapeReconcilation100PostRequest) == false) {
            return false;
        }
        BankTapeReconcilation100PostRequest rhs = ((BankTapeReconcilation100PostRequest) other);
        return ((((((((((this.cashAcct == rhs.cashAcct)||((this.cashAcct!= null)&&this.cashAcct.equals(rhs.cashAcct)))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.fabbktpInternalDocCode == rhs.fabbktpInternalDocCode)||((this.fabbktpInternalDocCode!= null)&&this.fabbktpInternalDocCode.equals(rhs.fabbktpInternalDocCode))))&&((this.bankAcct == rhs.bankAcct)||((this.bankAcct!= null)&&this.bankAcct.equals(rhs.bankAcct))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.amt == rhs.amt)||((this.amt!= null)&&this.amt.equals(rhs.amt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.depCode == rhs.depCode)||((this.depCode!= null)&&this.depCode.equals(rhs.depCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
