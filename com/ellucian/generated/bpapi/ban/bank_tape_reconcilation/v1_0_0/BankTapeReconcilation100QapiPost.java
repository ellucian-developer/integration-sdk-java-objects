
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
    "bankCode",
    "reconInd",
    "bankAcct",
    "cashAcct",
    "checkDepositCode",
    "checkDepositInd",
    "transDate",
    "desc",
    "amt",
    "internalDocCode"
})
@Generated("jsonschema2pojo")
public class BankTapeReconcilation100QapiPost {

    @JsonProperty("bankCode")
    private String bankCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FABBKTP_RECON_IND
     * 
     */
    @JsonProperty("reconInd")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_RECON_IND")
    private String reconInd;
    @JsonProperty("bankAcct")
    private String bankAcct;
    @JsonProperty("cashAcct")
    private String cashAcct;
    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * 
     */
    @JsonProperty("checkDepositCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE")
    private String checkDepositCode;
    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * 
     */
    @JsonProperty("checkDepositInd")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND")
    private String checkDepositInd;
    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_TRANS_DATE")
    private Date transDate;
    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_DESC")
    private String desc;
    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
     * 
     */
    @JsonProperty("amt")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_AMT")
    private Double amt;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public BankTapeReconcilation100QapiPost withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FABBKTP_RECON_IND
     * 
     */
    @JsonProperty("reconInd")
    public String getReconInd() {
        return reconInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FABBKTP_RECON_IND
     * 
     */
    @JsonProperty("reconInd")
    public void setReconInd(String reconInd) {
        this.reconInd = reconInd;
    }

    public BankTapeReconcilation100QapiPost withReconInd(String reconInd) {
        this.reconInd = reconInd;
        return this;
    }

    @JsonProperty("bankAcct")
    public String getBankAcct() {
        return bankAcct;
    }

    @JsonProperty("bankAcct")
    public void setBankAcct(String bankAcct) {
        this.bankAcct = bankAcct;
    }

    public BankTapeReconcilation100QapiPost withBankAcct(String bankAcct) {
        this.bankAcct = bankAcct;
        return this;
    }

    @JsonProperty("cashAcct")
    public String getCashAcct() {
        return cashAcct;
    }

    @JsonProperty("cashAcct")
    public void setCashAcct(String cashAcct) {
        this.cashAcct = cashAcct;
    }

    public BankTapeReconcilation100QapiPost withCashAcct(String cashAcct) {
        this.cashAcct = cashAcct;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
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
     * 
     */
    @JsonProperty("checkDepositCode")
    public void setCheckDepositCode(String checkDepositCode) {
        this.checkDepositCode = checkDepositCode;
    }

    public BankTapeReconcilation100QapiPost withCheckDepositCode(String checkDepositCode) {
        this.checkDepositCode = checkDepositCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
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
     * 
     */
    @JsonProperty("checkDepositInd")
    public void setCheckDepositInd(String checkDepositInd) {
        this.checkDepositInd = checkDepositInd;
    }

    public BankTapeReconcilation100QapiPost withCheckDepositInd(String checkDepositInd) {
        this.checkDepositInd = checkDepositInd;
        return this;
    }

    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
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
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public BankTapeReconcilation100QapiPost withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public BankTapeReconcilation100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
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
     * 
     */
    @JsonProperty("amt")
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public BankTapeReconcilation100QapiPost withAmt(Double amt) {
        this.amt = amt;
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

    public BankTapeReconcilation100QapiPost withInternalDocCode(String internalDocCode) {
        this.internalDocCode = internalDocCode;
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

    public BankTapeReconcilation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankTapeReconcilation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("reconInd");
        sb.append('=');
        sb.append(((this.reconInd == null)?"<null>":this.reconInd));
        sb.append(',');
        sb.append("bankAcct");
        sb.append('=');
        sb.append(((this.bankAcct == null)?"<null>":this.bankAcct));
        sb.append(',');
        sb.append("cashAcct");
        sb.append('=');
        sb.append(((this.cashAcct == null)?"<null>":this.cashAcct));
        sb.append(',');
        sb.append("checkDepositCode");
        sb.append('=');
        sb.append(((this.checkDepositCode == null)?"<null>":this.checkDepositCode));
        sb.append(',');
        sb.append("checkDepositInd");
        sb.append('=');
        sb.append(((this.checkDepositInd == null)?"<null>":this.checkDepositInd));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("amt");
        sb.append('=');
        sb.append(((this.amt == null)?"<null>":this.amt));
        sb.append(',');
        sb.append("internalDocCode");
        sb.append('=');
        sb.append(((this.internalDocCode == null)?"<null>":this.internalDocCode));
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
        result = ((result* 31)+((this.reconInd == null)? 0 :this.reconInd.hashCode()));
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
        if ((other instanceof BankTapeReconcilation100QapiPost) == false) {
            return false;
        }
        BankTapeReconcilation100QapiPost rhs = ((BankTapeReconcilation100QapiPost) other);
        return ((((((((((((this.cashAcct == rhs.cashAcct)||((this.cashAcct!= null)&&this.cashAcct.equals(rhs.cashAcct)))&&((this.internalDocCode == rhs.internalDocCode)||((this.internalDocCode!= null)&&this.internalDocCode.equals(rhs.internalDocCode))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.checkDepositCode == rhs.checkDepositCode)||((this.checkDepositCode!= null)&&this.checkDepositCode.equals(rhs.checkDepositCode))))&&((this.bankAcct == rhs.bankAcct)||((this.bankAcct!= null)&&this.bankAcct.equals(rhs.bankAcct))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.amt == rhs.amt)||((this.amt!= null)&&this.amt.equals(rhs.amt))))&&((this.reconInd == rhs.reconInd)||((this.reconInd!= null)&&this.reconInd.equals(rhs.reconInd))))&&((this.checkDepositInd == rhs.checkDepositInd)||((this.checkDepositInd!= null)&&this.checkDepositInd.equals(rhs.checkDepositInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
