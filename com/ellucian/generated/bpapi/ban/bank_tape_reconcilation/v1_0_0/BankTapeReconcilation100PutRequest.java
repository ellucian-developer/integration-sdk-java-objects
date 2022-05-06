
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
    "checkDepositCode",
    "criteria.checkDepositInd",
    "bankAcct",
    "criteria.transDate",
    "amt",
    "reconInd",
    "criteria.internalDocCode",
    "criteria.desc",
    "internalDocCode",
    "transDate",
    "criteria.amt",
    "criteria.checkDepositCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class BankTapeReconcilation100PutRequest {

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
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositInd")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND")
    private String criteriaCheckDepositInd;
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
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_TRANS_DATE")
    private Date criteriaTransDate;
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
     * Status Selection
     * <p>
     * Lineage reference object : reconInd
     * 
     */
    @JsonProperty("reconInd")
    @JsonPropertyDescription("Lineage reference object : reconInd")
    private Object reconInd;
    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("criteria.internalDocCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_INTERNAL_DOC_CODE")
    private String criteriaInternalDocCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_DESC")
    private String criteriaDesc;
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
    @JsonProperty("criteria.amt")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_AMT")
    private Double criteriaAmt;
    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositCode")
    @JsonPropertyDescription("Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE")
    private String criteriaCheckDepositCode;
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

    public BankTapeReconcilation100PutRequest withCashAcct(Object cashAcct) {
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

    public BankTapeReconcilation100PutRequest withBankCode(Object bankCode) {
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

    public BankTapeReconcilation100PutRequest withCheckDepositCode(String checkDepositCode) {
        this.checkDepositCode = checkDepositCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositInd")
    public String getCriteriaCheckDepositInd() {
        return criteriaCheckDepositInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositInd")
    public void setCriteriaCheckDepositInd(String criteriaCheckDepositInd) {
        this.criteriaCheckDepositInd = criteriaCheckDepositInd;
    }

    public BankTapeReconcilation100PutRequest withCriteriaCheckDepositInd(String criteriaCheckDepositInd) {
        this.criteriaCheckDepositInd = criteriaCheckDepositInd;
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

    public BankTapeReconcilation100PutRequest withBankAcct(Object bankAcct) {
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
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction
     *  Date
     * <p>
     * Lineage reference object : FABBKTP_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public BankTapeReconcilation100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
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

    public BankTapeReconcilation100PutRequest withAmt(Double amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Status Selection
     * <p>
     * Lineage reference object : reconInd
     * 
     */
    @JsonProperty("reconInd")
    public Object getReconInd() {
        return reconInd;
    }

    /**
     * Status Selection
     * <p>
     * Lineage reference object : reconInd
     * 
     */
    @JsonProperty("reconInd")
    public void setReconInd(Object reconInd) {
        this.reconInd = reconInd;
    }

    public BankTapeReconcilation100PutRequest withReconInd(Object reconInd) {
        this.reconInd = reconInd;
        return this;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("criteria.internalDocCode")
    public String getCriteriaInternalDocCode() {
        return criteriaInternalDocCode;
    }

    /**
     * Internal 
     * Document Code
     * <p>
     * Lineage reference object : FABBKTP_INTERNAL_DOC_CODE
     * 
     */
    @JsonProperty("criteria.internalDocCode")
    public void setCriteriaInternalDocCode(String criteriaInternalDocCode) {
        this.criteriaInternalDocCode = criteriaInternalDocCode;
    }

    public BankTapeReconcilation100PutRequest withCriteriaInternalDocCode(String criteriaInternalDocCode) {
        this.criteriaInternalDocCode = criteriaInternalDocCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FABBKTP_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public BankTapeReconcilation100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
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

    public BankTapeReconcilation100PutRequest withInternalDocCode(String internalDocCode) {
        this.internalDocCode = internalDocCode;
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

    public BankTapeReconcilation100PutRequest withTransDate(Date transDate) {
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
    @JsonProperty("criteria.amt")
    public Double getCriteriaAmt() {
        return criteriaAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FABBKTP_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amt")
    public void setCriteriaAmt(Double criteriaAmt) {
        this.criteriaAmt = criteriaAmt;
    }

    public BankTapeReconcilation100PutRequest withCriteriaAmt(Double criteriaAmt) {
        this.criteriaAmt = criteriaAmt;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositCode")
    public String getCriteriaCheckDepositCode() {
        return criteriaCheckDepositCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FABBKTP_CHECK_DEPOSIT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDepositCode")
    public void setCriteriaCheckDepositCode(String criteriaCheckDepositCode) {
        this.criteriaCheckDepositCode = criteriaCheckDepositCode;
    }

    public BankTapeReconcilation100PutRequest withCriteriaCheckDepositCode(String criteriaCheckDepositCode) {
        this.criteriaCheckDepositCode = criteriaCheckDepositCode;
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

    public BankTapeReconcilation100PutRequest withDesc(String desc) {
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

    public BankTapeReconcilation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankTapeReconcilation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cashAcct");
        sb.append('=');
        sb.append(((this.cashAcct == null)?"<null>":this.cashAcct));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("checkDepositCode");
        sb.append('=');
        sb.append(((this.checkDepositCode == null)?"<null>":this.checkDepositCode));
        sb.append(',');
        sb.append("criteriaCheckDepositInd");
        sb.append('=');
        sb.append(((this.criteriaCheckDepositInd == null)?"<null>":this.criteriaCheckDepositInd));
        sb.append(',');
        sb.append("bankAcct");
        sb.append('=');
        sb.append(((this.bankAcct == null)?"<null>":this.bankAcct));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
        sb.append(',');
        sb.append("amt");
        sb.append('=');
        sb.append(((this.amt == null)?"<null>":this.amt));
        sb.append(',');
        sb.append("reconInd");
        sb.append('=');
        sb.append(((this.reconInd == null)?"<null>":this.reconInd));
        sb.append(',');
        sb.append("criteriaInternalDocCode");
        sb.append('=');
        sb.append(((this.criteriaInternalDocCode == null)?"<null>":this.criteriaInternalDocCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("internalDocCode");
        sb.append('=');
        sb.append(((this.internalDocCode == null)?"<null>":this.internalDocCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("criteriaAmt");
        sb.append('=');
        sb.append(((this.criteriaAmt == null)?"<null>":this.criteriaAmt));
        sb.append(',');
        sb.append("criteriaCheckDepositCode");
        sb.append('=');
        sb.append(((this.criteriaCheckDepositCode == null)?"<null>":this.criteriaCheckDepositCode));
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
        result = ((result* 31)+((this.checkDepositCode == null)? 0 :this.checkDepositCode.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.bankAcct == null)? 0 :this.bankAcct.hashCode()));
        result = ((result* 31)+((this.criteriaCheckDepositCode == null)? 0 :this.criteriaCheckDepositCode.hashCode()));
        result = ((result* 31)+((this.criteriaCheckDepositInd == null)? 0 :this.criteriaCheckDepositInd.hashCode()));
        result = ((result* 31)+((this.amt == null)? 0 :this.amt.hashCode()));
        result = ((result* 31)+((this.reconInd == null)? 0 :this.reconInd.hashCode()));
        result = ((result* 31)+((this.internalDocCode == null)? 0 :this.internalDocCode.hashCode()));
        result = ((result* 31)+((this.criteriaInternalDocCode == null)? 0 :this.criteriaInternalDocCode.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.criteriaAmt == null)? 0 :this.criteriaAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankTapeReconcilation100PutRequest) == false) {
            return false;
        }
        BankTapeReconcilation100PutRequest rhs = ((BankTapeReconcilation100PutRequest) other);
        return (((((((((((((((((this.cashAcct == rhs.cashAcct)||((this.cashAcct!= null)&&this.cashAcct.equals(rhs.cashAcct)))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.checkDepositCode == rhs.checkDepositCode)||((this.checkDepositCode!= null)&&this.checkDepositCode.equals(rhs.checkDepositCode))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.bankAcct == rhs.bankAcct)||((this.bankAcct!= null)&&this.bankAcct.equals(rhs.bankAcct))))&&((this.criteriaCheckDepositCode == rhs.criteriaCheckDepositCode)||((this.criteriaCheckDepositCode!= null)&&this.criteriaCheckDepositCode.equals(rhs.criteriaCheckDepositCode))))&&((this.criteriaCheckDepositInd == rhs.criteriaCheckDepositInd)||((this.criteriaCheckDepositInd!= null)&&this.criteriaCheckDepositInd.equals(rhs.criteriaCheckDepositInd))))&&((this.amt == rhs.amt)||((this.amt!= null)&&this.amt.equals(rhs.amt))))&&((this.reconInd == rhs.reconInd)||((this.reconInd!= null)&&this.reconInd.equals(rhs.reconInd))))&&((this.internalDocCode == rhs.internalDocCode)||((this.internalDocCode!= null)&&this.internalDocCode.equals(rhs.internalDocCode))))&&((this.criteriaInternalDocCode == rhs.criteriaInternalDocCode)||((this.criteriaInternalDocCode!= null)&&this.criteriaInternalDocCode.equals(rhs.criteriaInternalDocCode))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.criteriaAmt == rhs.criteriaAmt)||((this.criteriaAmt!= null)&&this.criteriaAmt.equals(rhs.criteriaAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
