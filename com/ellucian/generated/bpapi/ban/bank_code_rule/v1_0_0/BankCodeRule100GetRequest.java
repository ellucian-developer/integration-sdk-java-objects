
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
    "achShortOrigName",
    "currCode",
    "achStatus",
    "companyType",
    "acctNum",
    "coasCode",
    "acctCodeInterfund",
    "acctName",
    "userId",
    "achOrigName",
    "achDestNo",
    "effDate",
    "companyId",
    "acctCodeCash",
    "activityDate",
    "fundCode",
    "displayNchgDate",
    "achDestName",
    "statusInd",
    "achOrigNo",
    "bankRoutNum",
    "termDate"
})
@Generated("jsonschema2pojo")
public class BankCodeRule100GetRequest {

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
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("achShortOrigName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME")
    private String achShortOrigName;
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
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("achStatus")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_STATUS")
    private String achStatus;
    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("companyType")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COMPANY_TYPE")
    private String companyType;
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
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_USER_ID")
    private String userId;
    /**
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("achOrigName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_ORIG_NAME")
    private String achOrigName;
    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("achDestNo")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_DEST_NO")
    private String achDestNo;
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
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("companyId")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COMPANY_ID")
    private String companyId;
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
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACTIVITY_DATE")
    private Date activityDate;
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
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("achDestName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_DEST_NAME")
    private String achDestName;
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
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("achOrigNo")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_ORIG_NO")
    private String achOrigNo;
    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_BANK_ROUT_NUM")
    private String bankRoutNum;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_TERM_DATE")
    private Date termDate;
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

    public BankCodeRule100GetRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("achShortOrigName")
    public String getAchShortOrigName() {
        return achShortOrigName;
    }

    /**
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("achShortOrigName")
    public void setAchShortOrigName(String achShortOrigName) {
        this.achShortOrigName = achShortOrigName;
    }

    public BankCodeRule100GetRequest withAchShortOrigName(String achShortOrigName) {
        this.achShortOrigName = achShortOrigName;
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

    public BankCodeRule100GetRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("achStatus")
    public String getAchStatus() {
        return achStatus;
    }

    /**
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("achStatus")
    public void setAchStatus(String achStatus) {
        this.achStatus = achStatus;
    }

    public BankCodeRule100GetRequest withAchStatus(String achStatus) {
        this.achStatus = achStatus;
        return this;
    }

    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("companyType")
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("companyType")
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public BankCodeRule100GetRequest withCompanyType(String companyType) {
        this.companyType = companyType;
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

    public BankCodeRule100GetRequest withAcctNum(String acctNum) {
        this.acctNum = acctNum;
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

    public BankCodeRule100GetRequest withCoasCode(String coasCode) {
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

    public BankCodeRule100GetRequest withAcctCodeInterfund(String acctCodeInterfund) {
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

    public BankCodeRule100GetRequest withAcctName(String acctName) {
        this.acctName = acctName;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BankCodeRule100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("achOrigName")
    public String getAchOrigName() {
        return achOrigName;
    }

    /**
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("achOrigName")
    public void setAchOrigName(String achOrigName) {
        this.achOrigName = achOrigName;
    }

    public BankCodeRule100GetRequest withAchOrigName(String achOrigName) {
        this.achOrigName = achOrigName;
        return this;
    }

    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("achDestNo")
    public String getAchDestNo() {
        return achDestNo;
    }

    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("achDestNo")
    public void setAchDestNo(String achDestNo) {
        this.achDestNo = achDestNo;
    }

    public BankCodeRule100GetRequest withAchDestNo(String achDestNo) {
        this.achDestNo = achDestNo;
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

    public BankCodeRule100GetRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("companyId")
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("companyId")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public BankCodeRule100GetRequest withCompanyId(String companyId) {
        this.companyId = companyId;
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

    public BankCodeRule100GetRequest withAcctCodeCash(String acctCodeCash) {
        this.acctCodeCash = acctCodeCash;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BankCodeRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public BankCodeRule100GetRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public BankCodeRule100GetRequest withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("achDestName")
    public String getAchDestName() {
        return achDestName;
    }

    /**
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("achDestName")
    public void setAchDestName(String achDestName) {
        this.achDestName = achDestName;
    }

    public BankCodeRule100GetRequest withAchDestName(String achDestName) {
        this.achDestName = achDestName;
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

    public BankCodeRule100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("achOrigNo")
    public String getAchOrigNo() {
        return achOrigNo;
    }

    /**
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("achOrigNo")
    public void setAchOrigNo(String achOrigNo) {
        this.achOrigNo = achOrigNo;
    }

    public BankCodeRule100GetRequest withAchOrigNo(String achOrigNo) {
        this.achOrigNo = achOrigNo;
        return this;
    }

    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("bankRoutNum")
    public String getBankRoutNum() {
        return bankRoutNum;
    }

    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("bankRoutNum")
    public void setBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
    }

    public BankCodeRule100GetRequest withBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
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

    public BankCodeRule100GetRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public BankCodeRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankCodeRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("achShortOrigName");
        sb.append('=');
        sb.append(((this.achShortOrigName == null)?"<null>":this.achShortOrigName));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("achStatus");
        sb.append('=');
        sb.append(((this.achStatus == null)?"<null>":this.achStatus));
        sb.append(',');
        sb.append("companyType");
        sb.append('=');
        sb.append(((this.companyType == null)?"<null>":this.companyType));
        sb.append(',');
        sb.append("acctNum");
        sb.append('=');
        sb.append(((this.acctNum == null)?"<null>":this.acctNum));
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
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("achOrigName");
        sb.append('=');
        sb.append(((this.achOrigName == null)?"<null>":this.achOrigName));
        sb.append(',');
        sb.append("achDestNo");
        sb.append('=');
        sb.append(((this.achDestNo == null)?"<null>":this.achDestNo));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("companyId");
        sb.append('=');
        sb.append(((this.companyId == null)?"<null>":this.companyId));
        sb.append(',');
        sb.append("acctCodeCash");
        sb.append('=');
        sb.append(((this.acctCodeCash == null)?"<null>":this.acctCodeCash));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("achDestName");
        sb.append('=');
        sb.append(((this.achDestName == null)?"<null>":this.achDestName));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("achOrigNo");
        sb.append('=');
        sb.append(((this.achOrigNo == null)?"<null>":this.achOrigNo));
        sb.append(',');
        sb.append("bankRoutNum");
        sb.append('=');
        sb.append(((this.bankRoutNum == null)?"<null>":this.bankRoutNum));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctCodeInterfund == null)? 0 :this.acctCodeInterfund.hashCode()));
        result = ((result* 31)+((this.achOrigName == null)? 0 :this.achOrigName.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.achOrigNo == null)? 0 :this.achOrigNo.hashCode()));
        result = ((result* 31)+((this.bankRoutNum == null)? 0 :this.bankRoutNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.achShortOrigName == null)? 0 :this.achShortOrigName.hashCode()));
        result = ((result* 31)+((this.achStatus == null)? 0 :this.achStatus.hashCode()));
        result = ((result* 31)+((this.companyType == null)? 0 :this.companyType.hashCode()));
        result = ((result* 31)+((this.acctNum == null)? 0 :this.acctNum.hashCode()));
        result = ((result* 31)+((this.acctName == null)? 0 :this.acctName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.achDestNo == null)? 0 :this.achDestNo.hashCode()));
        result = ((result* 31)+((this.companyId == null)? 0 :this.companyId.hashCode()));
        result = ((result* 31)+((this.acctCodeCash == null)? 0 :this.acctCodeCash.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.achDestName == null)? 0 :this.achDestName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankCodeRule100GetRequest) == false) {
            return false;
        }
        BankCodeRule100GetRequest rhs = ((BankCodeRule100GetRequest) other);
        return (((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctCodeInterfund == rhs.acctCodeInterfund)||((this.acctCodeInterfund!= null)&&this.acctCodeInterfund.equals(rhs.acctCodeInterfund))))&&((this.achOrigName == rhs.achOrigName)||((this.achOrigName!= null)&&this.achOrigName.equals(rhs.achOrigName))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.achOrigNo == rhs.achOrigNo)||((this.achOrigNo!= null)&&this.achOrigNo.equals(rhs.achOrigNo))))&&((this.bankRoutNum == rhs.bankRoutNum)||((this.bankRoutNum!= null)&&this.bankRoutNum.equals(rhs.bankRoutNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.achShortOrigName == rhs.achShortOrigName)||((this.achShortOrigName!= null)&&this.achShortOrigName.equals(rhs.achShortOrigName))))&&((this.achStatus == rhs.achStatus)||((this.achStatus!= null)&&this.achStatus.equals(rhs.achStatus))))&&((this.companyType == rhs.companyType)||((this.companyType!= null)&&this.companyType.equals(rhs.companyType))))&&((this.acctNum == rhs.acctNum)||((this.acctNum!= null)&&this.acctNum.equals(rhs.acctNum))))&&((this.acctName == rhs.acctName)||((this.acctName!= null)&&this.acctName.equals(rhs.acctName))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achDestNo == rhs.achDestNo)||((this.achDestNo!= null)&&this.achDestNo.equals(rhs.achDestNo))))&&((this.companyId == rhs.companyId)||((this.companyId!= null)&&this.companyId.equals(rhs.companyId))))&&((this.acctCodeCash == rhs.acctCodeCash)||((this.acctCodeCash!= null)&&this.acctCodeCash.equals(rhs.acctCodeCash))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.achDestName == rhs.achDestName)||((this.achDestName!= null)&&this.achDestName.equals(rhs.achDestName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
