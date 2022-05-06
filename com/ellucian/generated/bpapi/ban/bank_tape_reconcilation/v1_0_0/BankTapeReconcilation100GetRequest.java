
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
    "internalDocCode",
    "bankCode",
    "checkDepositCode",
    "bankAcct",
    "transDate",
    "amt",
    "checkDepositInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class BankTapeReconcilation100GetRequest {

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
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("internalDocCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_INTERNAL_DOC_CODE")
    private String internalDocCode;
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
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("checkDepositCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE")
    private String checkDepositCode;
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
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("checkDepositInd")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND")
    private String checkDepositInd;
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

    public BankTapeReconcilation100GetRequest withCashAcct(Object cashAcct) {
        this.cashAcct = cashAcct;
        return this;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("internalDocCode")
    public String getInternalDocCode() {
        return internalDocCode;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("internalDocCode")
    public void setInternalDocCode(String internalDocCode) {
        this.internalDocCode = internalDocCode;
    }

    public BankTapeReconcilation100GetRequest withInternalDocCode(String internalDocCode) {
        this.internalDocCode = internalDocCode;
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

    public BankTapeReconcilation100GetRequest withBankCode(Object bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("checkDepositCode")
    public String getCheckDepositCode() {
        return checkDepositCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("checkDepositCode")
    public void setCheckDepositCode(String checkDepositCode) {
        this.checkDepositCode = checkDepositCode;
    }

    public BankTapeReconcilation100GetRequest withCheckDepositCode(String checkDepositCode) {
        this.checkDepositCode = checkDepositCode;
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

    public BankTapeReconcilation100GetRequest withBankAcct(Object bankAcct) {
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

    public BankTapeReconcilation100GetRequest withTransDate(Date transDate) {
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

    public BankTapeReconcilation100GetRequest withAmt(Double amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("checkDepositInd")
    public String getCheckDepositInd() {
        return checkDepositInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("checkDepositInd")
    public void setCheckDepositInd(String checkDepositInd) {
        this.checkDepositInd = checkDepositInd;
    }

    public BankTapeReconcilation100GetRequest withCheckDepositInd(String checkDepositInd) {
        this.checkDepositInd = checkDepositInd;
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

    public BankTapeReconcilation100GetRequest withDesc(String desc) {
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

    public BankTapeReconcilation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankTapeReconcilation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cashAcct");
        sb.append('=');
        sb.append(((this.cashAcct == null)?"<null>":this.cashAcct));
        sb.append(',');
        sb.append("internalDocCode");
        sb.append('=');
        sb.append(((this.internalDocCode == null)?"<null>":this.internalDocCode));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("checkDepositCode");
        sb.append('=');
        sb.append(((this.checkDepositCode == null)?"<null>":this.checkDepositCode));
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
        sb.append("checkDepositInd");
        sb.append('=');
        sb.append(((this.checkDepositInd == null)?"<null>":this.checkDepositInd));
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
        result = ((result* 31)+((this.internalDocCode == null)? 0 :this.internalDocCode.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.checkDepositCode == null)? 0 :this.checkDepositCode.hashCode()));
        result = ((result* 31)+((this.bankAcct == null)? 0 :this.bankAcct.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.amt == null)? 0 :this.amt.hashCode()));
        result = ((result* 31)+((this.checkDepositInd == null)? 0 :this.checkDepositInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankTapeReconcilation100GetRequest) == false) {
            return false;
        }
        BankTapeReconcilation100GetRequest rhs = ((BankTapeReconcilation100GetRequest) other);
        return (((((((((((this.cashAcct == rhs.cashAcct)||((this.cashAcct!= null)&&this.cashAcct.equals(rhs.cashAcct)))&&((this.internalDocCode == rhs.internalDocCode)||((this.internalDocCode!= null)&&this.internalDocCode.equals(rhs.internalDocCode))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.checkDepositCode == rhs.checkDepositCode)||((this.checkDepositCode!= null)&&this.checkDepositCode.equals(rhs.checkDepositCode))))&&((this.bankAcct == rhs.bankAcct)||((this.bankAcct!= null)&&this.bankAcct.equals(rhs.bankAcct))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.amt == rhs.amt)||((this.amt!= null)&&this.amt.equals(rhs.amt))))&&((this.checkDepositInd == rhs.checkDepositInd)||((this.checkDepositInd!= null)&&this.checkDepositInd.equals(rhs.checkDepositInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
