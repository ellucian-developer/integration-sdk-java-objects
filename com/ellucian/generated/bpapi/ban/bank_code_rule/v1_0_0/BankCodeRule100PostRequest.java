
package com.ellucian.generated.bpapi.ban.bank_code_rule.v1_0_0;

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
    "effDate",
    "currCode",
    "acctCodeCash",
    "fundCode",
    "acctNum",
    "statusInd",
    "coasCode",
    "acctCodeInterfund",
    "acctName",
    "termDate",
    "displayBankId"
})
@Generated("jsonschema2pojo")
public class BankCodeRule100PostRequest {

    /**
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_EFF_DATE")
    private Date effDate;
    /**
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("acctCodeCash")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_CODE_CASH")
    private String acctCodeCash;
    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_FUND_CODE")
    private String fundCode;
    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("acctNum")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_NUM")
    private String acctNum;
    /**
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_STATUS_IND")
    private String statusInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COAS_CODE")
    private String coasCode;
    /**
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("acctCodeInterfund")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND")
    private String acctCodeInterfund;
    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("acctName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_NAME")
    private String acctName;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_TERM_DATE")
    private Date termDate;
    /**
     * Bank ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBankId")
    private String displayBankId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public BankCodeRule100PostRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public BankCodeRule100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public BankCodeRule100PostRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("acctCodeCash")
    public String getAcctCodeCash() {
        return acctCodeCash;
    }

    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("acctCodeCash")
    public void setAcctCodeCash(String acctCodeCash) {
        this.acctCodeCash = acctCodeCash;
    }

    public BankCodeRule100PostRequest withAcctCodeCash(String acctCodeCash) {
        this.acctCodeCash = acctCodeCash;
        return this;
    }

    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public BankCodeRule100PostRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("acctNum")
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("acctNum")
    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public BankCodeRule100PostRequest withAcctNum(String acctNum) {
        this.acctNum = acctNum;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public BankCodeRule100PostRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public BankCodeRule100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("acctCodeInterfund")
    public String getAcctCodeInterfund() {
        return acctCodeInterfund;
    }

    /**
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("acctCodeInterfund")
    public void setAcctCodeInterfund(String acctCodeInterfund) {
        this.acctCodeInterfund = acctCodeInterfund;
    }

    public BankCodeRule100PostRequest withAcctCodeInterfund(String acctCodeInterfund) {
        this.acctCodeInterfund = acctCodeInterfund;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("acctName")
    public String getAcctName() {
        return acctName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("acctName")
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public BankCodeRule100PostRequest withAcctName(String acctName) {
        this.acctName = acctName;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public BankCodeRule100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Bank ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBankId")
    public String getDisplayBankId() {
        return displayBankId;
    }

    /**
     * Bank ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBankId")
    public void setDisplayBankId(String displayBankId) {
        this.displayBankId = displayBankId;
    }

    public BankCodeRule100PostRequest withDisplayBankId(String displayBankId) {
        this.displayBankId = displayBankId;
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

    public BankCodeRule100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankCodeRule100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("acctCodeCash");
        sb.append('=');
        sb.append(((this.acctCodeCash == null)?"<null>":this.acctCodeCash));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("acctNum");
        sb.append('=');
        sb.append(((this.acctNum == null)?"<null>":this.acctNum));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctCodeInterfund");
        sb.append('=');
        sb.append(((this.acctCodeInterfund == null)?"<null>":this.acctCodeInterfund));
        sb.append(',');
        sb.append("acctName");
        sb.append('=');
        sb.append(((this.acctName == null)?"<null>":this.acctName));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("displayBankId");
        sb.append('=');
        sb.append(((this.displayBankId == null)?"<null>":this.displayBankId));
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
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.acctNum == null)? 0 :this.acctNum.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctCodeInterfund == null)? 0 :this.acctCodeInterfund.hashCode()));
        result = ((result* 31)+((this.acctName == null)? 0 :this.acctName.hashCode()));
        result = ((result* 31)+((this.displayBankId == null)? 0 :this.displayBankId.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.acctCodeCash == null)? 0 :this.acctCodeCash.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankCodeRule100PostRequest) == false) {
            return false;
        }
        BankCodeRule100PostRequest rhs = ((BankCodeRule100PostRequest) other);
        return ((((((((((((((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.acctNum == rhs.acctNum)||((this.acctNum!= null)&&this.acctNum.equals(rhs.acctNum))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctCodeInterfund == rhs.acctCodeInterfund)||((this.acctCodeInterfund!= null)&&this.acctCodeInterfund.equals(rhs.acctCodeInterfund))))&&((this.acctName == rhs.acctName)||((this.acctName!= null)&&this.acctName.equals(rhs.acctName))))&&((this.displayBankId == rhs.displayBankId)||((this.displayBankId!= null)&&this.displayBankId.equals(rhs.displayBankId))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.acctCodeCash == rhs.acctCodeCash)||((this.acctCodeCash!= null)&&this.acctCodeCash.equals(rhs.acctCodeCash))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
