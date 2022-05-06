
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
    "criteria.companyId",
    "criteria.userId",
    "criteria.activityDate",
    "currCode",
    "criteria.statusInd",
    "criteria.achOrigNo",
    "criteria.companyType",
    "coasCode",
    "acctCodeInterfund",
    "criteria.acctCodeInterfund",
    "criteria.termDate",
    "displayBankId",
    "criteria.achStatus",
    "fundCode",
    "statusInd",
    "criteria.displayNchgDate",
    "criteria.coasCode",
    "criteria.bankRoutNum",
    "criteria.acctName",
    "criteria.acctNum",
    "criteria.effDate",
    "criteria.acctCodeCash",
    "criteria.achDestNo",
    "criteria.fundCode",
    "acctNum",
    "criteria.achOrigName",
    "acctName",
    "criteria.achDestName",
    "acctCodeCash",
    "criteria.currCode",
    "criteria.achShortOrigName",
    "termDate",
    "criteria.bankCode"
})
@Generated("jsonschema2pojo")
public class BankCodeRule100PutRequest {

    /**
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("criteria.companyId")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COMPANY_ID")
    private String criteriaCompanyId;
    /**
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_USER_ID")
    private String criteriaUserId;
    /**
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("criteria.achOrigNo")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_ORIG_NO")
    private String criteriaAchOrigNo;
    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("criteria.companyType")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COMPANY_TYPE")
    private String criteriaCompanyType;
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
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("criteria.acctCodeInterfund")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND")
    private String criteriaAcctCodeInterfund;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Bank ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBankId")
    private String displayBankId;
    /**
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("criteria.achStatus")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_STATUS")
    private String criteriaAchStatus;
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
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_STATUS_IND")
    private String statusInd;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayNchgDate")
    private Date criteriaDisplayNchgDate;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_BANK_ROUT_NUM")
    private String criteriaBankRoutNum;
    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_NAME")
    private String criteriaAcctName;
    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctNum")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_NUM")
    private String criteriaAcctNum;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("criteria.acctCodeCash")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACCT_CODE_CASH")
    private String criteriaAcctCodeCash;
    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("criteria.achDestNo")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_DEST_NO")
    private String criteriaAchDestNo;
    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_FUND_CODE")
    private String criteriaFundCode;
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
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achOrigName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_ORIG_NAME")
    private String criteriaAchOrigName;
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
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("criteria.achDestName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_DEST_NAME")
    private String criteriaAchDestName;
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
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
    /**
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achShortOrigName")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME")
    private String criteriaAchShortOrigName;
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
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("criteria.companyId")
    public String getCriteriaCompanyId() {
        return criteriaCompanyId;
    }

    /**
     * Organization ID Number
     * <p>
     * Lineage reference object : GXVBANK_COMPANY_ID
     * 
     */
    @JsonProperty("criteria.companyId")
    public void setCriteriaCompanyId(String criteriaCompanyId) {
        this.criteriaCompanyId = criteriaCompanyId;
    }

    public BankCodeRule100PutRequest withCriteriaCompanyId(String criteriaCompanyId) {
        this.criteriaCompanyId = criteriaCompanyId;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GXVBANK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public BankCodeRule100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : GXVBANK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public BankCodeRule100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public BankCodeRule100PutRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : GXVBANK_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public BankCodeRule100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("criteria.achOrigNo")
    public String getCriteriaAchOrigNo() {
        return criteriaAchOrigNo;
    }

    /**
     * Origin ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NO
     * 
     */
    @JsonProperty("criteria.achOrigNo")
    public void setCriteriaAchOrigNo(String criteriaAchOrigNo) {
        this.criteriaAchOrigNo = criteriaAchOrigNo;
    }

    public BankCodeRule100PutRequest withCriteriaAchOrigNo(String criteriaAchOrigNo) {
        this.criteriaAchOrigNo = criteriaAchOrigNo;
        return this;
    }

    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("criteria.companyType")
    public String getCriteriaCompanyType() {
        return criteriaCompanyType;
    }

    /**
     * Lineage reference object : GXVBANK_COMPANY_TYPE
     * 
     */
    @JsonProperty("criteria.companyType")
    public void setCriteriaCompanyType(String criteriaCompanyType) {
        this.criteriaCompanyType = criteriaCompanyType;
    }

    public BankCodeRule100PutRequest withCriteriaCompanyType(String criteriaCompanyType) {
        this.criteriaCompanyType = criteriaCompanyType;
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

    public BankCodeRule100PutRequest withCoasCode(String coasCode) {
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

    public BankCodeRule100PutRequest withAcctCodeInterfund(String acctCodeInterfund) {
        this.acctCodeInterfund = acctCodeInterfund;
        return this;
    }

    /**
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("criteria.acctCodeInterfund")
    public String getCriteriaAcctCodeInterfund() {
        return criteriaAcctCodeInterfund;
    }

    /**
     * Interfund Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_INTERFUND
     * 
     */
    @JsonProperty("criteria.acctCodeInterfund")
    public void setCriteriaAcctCodeInterfund(String criteriaAcctCodeInterfund) {
        this.criteriaAcctCodeInterfund = criteriaAcctCodeInterfund;
    }

    public BankCodeRule100PutRequest withCriteriaAcctCodeInterfund(String criteriaAcctCodeInterfund) {
        this.criteriaAcctCodeInterfund = criteriaAcctCodeInterfund;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : GXVBANK_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public BankCodeRule100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
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

    public BankCodeRule100PutRequest withDisplayBankId(String displayBankId) {
        this.displayBankId = displayBankId;
        return this;
    }

    /**
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("criteria.achStatus")
    public String getCriteriaAchStatus() {
        return criteriaAchStatus;
    }

    /**
     * ACH Status
     * <p>
     * Lineage reference object : GXVBANK_ACH_STATUS
     * 
     */
    @JsonProperty("criteria.achStatus")
    public void setCriteriaAchStatus(String criteriaAchStatus) {
        this.criteriaAchStatus = criteriaAchStatus;
    }

    public BankCodeRule100PutRequest withCriteriaAchStatus(String criteriaAchStatus) {
        this.criteriaAchStatus = criteriaAchStatus;
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

    public BankCodeRule100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public BankCodeRule100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayNchgDate")
    public Date getCriteriaDisplayNchgDate() {
        return criteriaDisplayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayNchgDate")
    public void setCriteriaDisplayNchgDate(Date criteriaDisplayNchgDate) {
        this.criteriaDisplayNchgDate = criteriaDisplayNchgDate;
    }

    public BankCodeRule100PutRequest withCriteriaDisplayNchgDate(Date criteriaDisplayNchgDate) {
        this.criteriaDisplayNchgDate = criteriaDisplayNchgDate;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : GXVBANK_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public BankCodeRule100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    public String getCriteriaBankRoutNum() {
        return criteriaBankRoutNum;
    }

    /**
     * Originating Bank Routing Number
     * <p>
     * Lineage reference object : GXVBANK_BANK_ROUT_NUM
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    public void setCriteriaBankRoutNum(String criteriaBankRoutNum) {
        this.criteriaBankRoutNum = criteriaBankRoutNum;
    }

    public BankCodeRule100PutRequest withCriteriaBankRoutNum(String criteriaBankRoutNum) {
        this.criteriaBankRoutNum = criteriaBankRoutNum;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctName")
    public String getCriteriaAcctName() {
        return criteriaAcctName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctName")
    public void setCriteriaAcctName(String criteriaAcctName) {
        this.criteriaAcctName = criteriaAcctName;
    }

    public BankCodeRule100PutRequest withCriteriaAcctName(String criteriaAcctName) {
        this.criteriaAcctName = criteriaAcctName;
        return this;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctNum")
    public String getCriteriaAcctNum() {
        return criteriaAcctNum;
    }

    /**
     * Bank Account Number
     * <p>
     * Lineage reference object : GXVBANK_ACCT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctNum")
    public void setCriteriaAcctNum(String criteriaAcctNum) {
        this.criteriaAcctNum = criteriaAcctNum;
    }

    public BankCodeRule100PutRequest withCriteriaAcctNum(String criteriaAcctNum) {
        this.criteriaAcctNum = criteriaAcctNum;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : GXVBANK_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public BankCodeRule100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("criteria.acctCodeCash")
    public String getCriteriaAcctCodeCash() {
        return criteriaAcctCodeCash;
    }

    /**
     * Cash Account
     * <p>
     * Lineage reference object : GXVBANK_ACCT_CODE_CASH
     * 
     */
    @JsonProperty("criteria.acctCodeCash")
    public void setCriteriaAcctCodeCash(String criteriaAcctCodeCash) {
        this.criteriaAcctCodeCash = criteriaAcctCodeCash;
    }

    public BankCodeRule100PutRequest withCriteriaAcctCodeCash(String criteriaAcctCodeCash) {
        this.criteriaAcctCodeCash = criteriaAcctCodeCash;
        return this;
    }

    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("criteria.achDestNo")
    public String getCriteriaAchDestNo() {
        return criteriaAchDestNo;
    }

    /**
     * Destination ID
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NO
     * 
     */
    @JsonProperty("criteria.achDestNo")
    public void setCriteriaAchDestNo(String criteriaAchDestNo) {
        this.criteriaAchDestNo = criteriaAchDestNo;
    }

    public BankCodeRule100PutRequest withCriteriaAchDestNo(String criteriaAchDestNo) {
        this.criteriaAchDestNo = criteriaAchDestNo;
        return this;
    }

    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Bank Fund
     * <p>
     * Lineage reference object : GXVBANK_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public BankCodeRule100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
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

    public BankCodeRule100PutRequest withAcctNum(String acctNum) {
        this.acctNum = acctNum;
        return this;
    }

    /**
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achOrigName")
    public String getCriteriaAchOrigName() {
        return criteriaAchOrigName;
    }

    /**
     * Origin Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achOrigName")
    public void setCriteriaAchOrigName(String criteriaAchOrigName) {
        this.criteriaAchOrigName = criteriaAchOrigName;
    }

    public BankCodeRule100PutRequest withCriteriaAchOrigName(String criteriaAchOrigName) {
        this.criteriaAchOrigName = criteriaAchOrigName;
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

    public BankCodeRule100PutRequest withAcctName(String acctName) {
        this.acctName = acctName;
        return this;
    }

    /**
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("criteria.achDestName")
    public String getCriteriaAchDestName() {
        return criteriaAchDestName;
    }

    /**
     * Destination Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_DEST_NAME
     * 
     */
    @JsonProperty("criteria.achDestName")
    public void setCriteriaAchDestName(String criteriaAchDestName) {
        this.criteriaAchDestName = criteriaAchDestName;
    }

    public BankCodeRule100PutRequest withCriteriaAchDestName(String criteriaAchDestName) {
        this.criteriaAchDestName = criteriaAchDestName;
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

    public BankCodeRule100PutRequest withAcctCodeCash(String acctCodeCash) {
        this.acctCodeCash = acctCodeCash;
        return this;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Base Currency
     * <p>
     * Lineage reference object : GXVBANK_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public BankCodeRule100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
        return this;
    }

    /**
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achShortOrigName")
    public String getCriteriaAchShortOrigName() {
        return criteriaAchShortOrigName;
    }

    /**
     * Short Name
     * <p>
     * Lineage reference object : GXVBANK_ACH_SHORT_ORIG_NAME
     * 
     */
    @JsonProperty("criteria.achShortOrigName")
    public void setCriteriaAchShortOrigName(String criteriaAchShortOrigName) {
        this.criteriaAchShortOrigName = criteriaAchShortOrigName;
    }

    public BankCodeRule100PutRequest withCriteriaAchShortOrigName(String criteriaAchShortOrigName) {
        this.criteriaAchShortOrigName = criteriaAchShortOrigName;
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

    public BankCodeRule100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : GXVBANK_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public BankCodeRule100PutRequest withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
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

    public BankCodeRule100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankCodeRule100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCompanyId");
        sb.append('=');
        sb.append(((this.criteriaCompanyId == null)?"<null>":this.criteriaCompanyId));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaAchOrigNo");
        sb.append('=');
        sb.append(((this.criteriaAchOrigNo == null)?"<null>":this.criteriaAchOrigNo));
        sb.append(',');
        sb.append("criteriaCompanyType");
        sb.append('=');
        sb.append(((this.criteriaCompanyType == null)?"<null>":this.criteriaCompanyType));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctCodeInterfund");
        sb.append('=');
        sb.append(((this.acctCodeInterfund == null)?"<null>":this.acctCodeInterfund));
        sb.append(',');
        sb.append("criteriaAcctCodeInterfund");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeInterfund == null)?"<null>":this.criteriaAcctCodeInterfund));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("displayBankId");
        sb.append('=');
        sb.append(((this.displayBankId == null)?"<null>":this.displayBankId));
        sb.append(',');
        sb.append("criteriaAchStatus");
        sb.append('=');
        sb.append(((this.criteriaAchStatus == null)?"<null>":this.criteriaAchStatus));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaDisplayNchgDate");
        sb.append('=');
        sb.append(((this.criteriaDisplayNchgDate == null)?"<null>":this.criteriaDisplayNchgDate));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaBankRoutNum");
        sb.append('=');
        sb.append(((this.criteriaBankRoutNum == null)?"<null>":this.criteriaBankRoutNum));
        sb.append(',');
        sb.append("criteriaAcctName");
        sb.append('=');
        sb.append(((this.criteriaAcctName == null)?"<null>":this.criteriaAcctName));
        sb.append(',');
        sb.append("criteriaAcctNum");
        sb.append('=');
        sb.append(((this.criteriaAcctNum == null)?"<null>":this.criteriaAcctNum));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaAcctCodeCash");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeCash == null)?"<null>":this.criteriaAcctCodeCash));
        sb.append(',');
        sb.append("criteriaAchDestNo");
        sb.append('=');
        sb.append(((this.criteriaAchDestNo == null)?"<null>":this.criteriaAchDestNo));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("acctNum");
        sb.append('=');
        sb.append(((this.acctNum == null)?"<null>":this.acctNum));
        sb.append(',');
        sb.append("criteriaAchOrigName");
        sb.append('=');
        sb.append(((this.criteriaAchOrigName == null)?"<null>":this.criteriaAchOrigName));
        sb.append(',');
        sb.append("acctName");
        sb.append('=');
        sb.append(((this.acctName == null)?"<null>":this.acctName));
        sb.append(',');
        sb.append("criteriaAchDestName");
        sb.append('=');
        sb.append(((this.criteriaAchDestName == null)?"<null>":this.criteriaAchDestName));
        sb.append(',');
        sb.append("acctCodeCash");
        sb.append('=');
        sb.append(((this.acctCodeCash == null)?"<null>":this.acctCodeCash));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("criteriaAchShortOrigName");
        sb.append('=');
        sb.append(((this.criteriaAchShortOrigName == null)?"<null>":this.criteriaAchShortOrigName));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
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
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctCodeInterfund == null)? 0 :this.acctCodeInterfund.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeInterfund == null)? 0 :this.criteriaAcctCodeInterfund.hashCode()));
        result = ((result* 31)+((this.displayBankId == null)? 0 :this.displayBankId.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayNchgDate == null)? 0 :this.criteriaDisplayNchgDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.criteriaCompanyId == null)? 0 :this.criteriaCompanyId.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.criteriaAchDestNo == null)? 0 :this.criteriaAchDestNo.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeCash == null)? 0 :this.criteriaAcctCodeCash.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcctName == null)? 0 :this.criteriaAcctName.hashCode()));
        result = ((result* 31)+((this.criteriaAchDestName == null)? 0 :this.criteriaAchDestName.hashCode()));
        result = ((result* 31)+((this.criteriaCompanyType == null)? 0 :this.criteriaCompanyType.hashCode()));
        result = ((result* 31)+((this.acctNum == null)? 0 :this.acctNum.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaAchShortOrigName == null)? 0 :this.criteriaAchShortOrigName.hashCode()));
        result = ((result* 31)+((this.acctName == null)? 0 :this.acctName.hashCode()));
        result = ((result* 31)+((this.criteriaAcctNum == null)? 0 :this.criteriaAcctNum.hashCode()));
        result = ((result* 31)+((this.criteriaBankRoutNum == null)? 0 :this.criteriaBankRoutNum.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.acctCodeCash == null)? 0 :this.acctCodeCash.hashCode()));
        result = ((result* 31)+((this.criteriaAchOrigName == null)? 0 :this.criteriaAchOrigName.hashCode()));
        result = ((result* 31)+((this.criteriaAchStatus == null)? 0 :this.criteriaAchStatus.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAchOrigNo == null)? 0 :this.criteriaAchOrigNo.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankCodeRule100PutRequest) == false) {
            return false;
        }
        BankCodeRule100PutRequest rhs = ((BankCodeRule100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctCodeInterfund == rhs.acctCodeInterfund)||((this.acctCodeInterfund!= null)&&this.acctCodeInterfund.equals(rhs.acctCodeInterfund))))&&((this.criteriaAcctCodeInterfund == rhs.criteriaAcctCodeInterfund)||((this.criteriaAcctCodeInterfund!= null)&&this.criteriaAcctCodeInterfund.equals(rhs.criteriaAcctCodeInterfund))))&&((this.displayBankId == rhs.displayBankId)||((this.displayBankId!= null)&&this.displayBankId.equals(rhs.displayBankId))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaDisplayNchgDate == rhs.criteriaDisplayNchgDate)||((this.criteriaDisplayNchgDate!= null)&&this.criteriaDisplayNchgDate.equals(rhs.criteriaDisplayNchgDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.criteriaCompanyId == rhs.criteriaCompanyId)||((this.criteriaCompanyId!= null)&&this.criteriaCompanyId.equals(rhs.criteriaCompanyId))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaAchDestNo == rhs.criteriaAchDestNo)||((this.criteriaAchDestNo!= null)&&this.criteriaAchDestNo.equals(rhs.criteriaAchDestNo))))&&((this.criteriaAcctCodeCash == rhs.criteriaAcctCodeCash)||((this.criteriaAcctCodeCash!= null)&&this.criteriaAcctCodeCash.equals(rhs.criteriaAcctCodeCash))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaAcctName == rhs.criteriaAcctName)||((this.criteriaAcctName!= null)&&this.criteriaAcctName.equals(rhs.criteriaAcctName))))&&((this.criteriaAchDestName == rhs.criteriaAchDestName)||((this.criteriaAchDestName!= null)&&this.criteriaAchDestName.equals(rhs.criteriaAchDestName))))&&((this.criteriaCompanyType == rhs.criteriaCompanyType)||((this.criteriaCompanyType!= null)&&this.criteriaCompanyType.equals(rhs.criteriaCompanyType))))&&((this.acctNum == rhs.acctNum)||((this.acctNum!= null)&&this.acctNum.equals(rhs.acctNum))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaAchShortOrigName == rhs.criteriaAchShortOrigName)||((this.criteriaAchShortOrigName!= null)&&this.criteriaAchShortOrigName.equals(rhs.criteriaAchShortOrigName))))&&((this.acctName == rhs.acctName)||((this.acctName!= null)&&this.acctName.equals(rhs.acctName))))&&((this.criteriaAcctNum == rhs.criteriaAcctNum)||((this.criteriaAcctNum!= null)&&this.criteriaAcctNum.equals(rhs.criteriaAcctNum))))&&((this.criteriaBankRoutNum == rhs.criteriaBankRoutNum)||((this.criteriaBankRoutNum!= null)&&this.criteriaBankRoutNum.equals(rhs.criteriaBankRoutNum))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.acctCodeCash == rhs.acctCodeCash)||((this.acctCodeCash!= null)&&this.acctCodeCash.equals(rhs.acctCodeCash))))&&((this.criteriaAchOrigName == rhs.criteriaAchOrigName)||((this.criteriaAchOrigName!= null)&&this.criteriaAchOrigName.equals(rhs.criteriaAchOrigName))))&&((this.criteriaAchStatus == rhs.criteriaAchStatus)||((this.criteriaAchStatus!= null)&&this.criteriaAchStatus.equals(rhs.criteriaAchStatus))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAchOrigNo == rhs.criteriaAchOrigNo)||((this.criteriaAchOrigNo!= null)&&this.criteriaAchOrigNo.equals(rhs.criteriaAchOrigNo))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
