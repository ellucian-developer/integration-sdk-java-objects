
package com.ellucian.generated.bpapi.ban.direct_deposit_recipient.v1_0_0;

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
    "criteria.atypCode",
    "criteria.amount",
    "criteria.atypCodeIat",
    "criteria.userId",
    "criteria.activityDate",
    "bankDesc",
    "criteria.scodCodeIso",
    "criteria.bankAcctNum",
    "scodCodeDesc",
    "percent",
    "criteria.apInd",
    "scodCodeIso",
    "addrSeqnoIat",
    "criteria.percent",
    "criteria.achtCode",
    "criteria.bankDesc",
    "id",
    "bankRoutNum",
    "hrInd",
    "criteria.bankRoutNum",
    "criteria.addrSeqno",
    "criteria.addrSeqnoIat",
    "achIatInd",
    "amount",
    "atypCodeIat",
    "bankAcctNum",
    "priority",
    "achtCode",
    "criteria.acctType",
    "criteria.achIatInd",
    "criteria.hrInd",
    "addrSeqno",
    "criteria.priority",
    "criteria.scodCodeDesc",
    "criteria.status",
    "acctType",
    "apInd",
    "atypCode",
    "status"
})
@Generated("jsonschema2pojo")
public class DirectDepositRecipient100PutRequest {

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE")
    private String criteriaAtypCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AMOUNT")
    private Double criteriaAmount;
    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("criteria.atypCodeIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE_IAT")
    private String criteriaAtypCodeIat;
    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    @JsonProperty("bankDesc")
    private String bankDesc;
    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("criteria.scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_SCOD_CODE_ISO")
    private String criteriaScodCodeIso;
    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("criteria.bankAcctNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ACCT_NUM")
    private String criteriaBankAcctNum;
    @JsonProperty("scodCodeDesc")
    private String scodCodeDesc;
    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_PERCENT")
    private Double percent;
    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("criteria.apInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AP_IND")
    private String criteriaApInd;
    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_SCOD_CODE_ISO")
    private String scodCodeIso;
    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT")
    private Double addrSeqnoIat;
    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_PERCENT")
    private Double criteriaPercent;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("criteria.achtCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACHT_CODE")
    private String criteriaAchtCode;
    @JsonProperty("criteria.bankDesc")
    private String criteriaBankDesc;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ROUT_NUM")
    private String bankRoutNum;
    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_HR_IND")
    private String hrInd;
    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ROUT_NUM")
    private String criteriaBankRoutNum;
    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO")
    private Double criteriaAddrSeqno;
    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("criteria.addrSeqnoIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT")
    private Double criteriaAddrSeqnoIat;
    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACH_IAT_IND")
    private String achIatInd;
    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AMOUNT")
    private Double amount;
    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE_IAT")
    private String atypCodeIat;
    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ACCT_NUM")
    private String bankAcctNum;
    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_PRIORITY")
    private Double priority;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACHT_CODE")
    private String achtCode;
    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("criteria.acctType")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACCT_TYPE")
    private String criteriaAcctType;
    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("criteria.achIatInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACH_IAT_IND")
    private String criteriaAchIatInd;
    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("criteria.hrInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_HR_IND")
    private String criteriaHrInd;
    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_PRIORITY")
    private Double criteriaPriority;
    @JsonProperty("criteria.scodCodeDesc")
    private String criteriaScodCodeDesc;
    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_STATUS")
    private String criteriaStatus;
    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACCT_TYPE")
    private String acctType;
    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AP_IND")
    private String apInd;
    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE")
    private String atypCode;
    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("criteria.atypCodeIat")
    public String getCriteriaAtypCodeIat() {
        return criteriaAtypCodeIat;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("criteria.atypCodeIat")
    public void setCriteriaAtypCodeIat(String criteriaAtypCodeIat) {
        this.criteriaAtypCodeIat = criteriaAtypCodeIat;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAtypCodeIat(String criteriaAtypCodeIat) {
        this.criteriaAtypCodeIat = criteriaAtypCodeIat;
        return this;
    }

    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public DirectDepositRecipient100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public DirectDepositRecipient100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    @JsonProperty("bankDesc")
    public String getBankDesc() {
        return bankDesc;
    }

    @JsonProperty("bankDesc")
    public void setBankDesc(String bankDesc) {
        this.bankDesc = bankDesc;
    }

    public DirectDepositRecipient100PutRequest withBankDesc(String bankDesc) {
        this.bankDesc = bankDesc;
        return this;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("criteria.scodCodeIso")
    public String getCriteriaScodCodeIso() {
        return criteriaScodCodeIso;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("criteria.scodCodeIso")
    public void setCriteriaScodCodeIso(String criteriaScodCodeIso) {
        this.criteriaScodCodeIso = criteriaScodCodeIso;
    }

    public DirectDepositRecipient100PutRequest withCriteriaScodCodeIso(String criteriaScodCodeIso) {
        this.criteriaScodCodeIso = criteriaScodCodeIso;
        return this;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("criteria.bankAcctNum")
    public String getCriteriaBankAcctNum() {
        return criteriaBankAcctNum;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("criteria.bankAcctNum")
    public void setCriteriaBankAcctNum(String criteriaBankAcctNum) {
        this.criteriaBankAcctNum = criteriaBankAcctNum;
    }

    public DirectDepositRecipient100PutRequest withCriteriaBankAcctNum(String criteriaBankAcctNum) {
        this.criteriaBankAcctNum = criteriaBankAcctNum;
        return this;
    }

    @JsonProperty("scodCodeDesc")
    public String getScodCodeDesc() {
        return scodCodeDesc;
    }

    @JsonProperty("scodCodeDesc")
    public void setScodCodeDesc(String scodCodeDesc) {
        this.scodCodeDesc = scodCodeDesc;
    }

    public DirectDepositRecipient100PutRequest withScodCodeDesc(String scodCodeDesc) {
        this.scodCodeDesc = scodCodeDesc;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public DirectDepositRecipient100PutRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("criteria.apInd")
    public String getCriteriaApInd() {
        return criteriaApInd;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("criteria.apInd")
    public void setCriteriaApInd(String criteriaApInd) {
        this.criteriaApInd = criteriaApInd;
    }

    public DirectDepositRecipient100PutRequest withCriteriaApInd(String criteriaApInd) {
        this.criteriaApInd = criteriaApInd;
        return this;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public String getScodCodeIso() {
        return scodCodeIso;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public void setScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
    }

    public DirectDepositRecipient100PutRequest withScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
        return this;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    public Double getAddrSeqnoIat() {
        return addrSeqnoIat;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    public void setAddrSeqnoIat(Double addrSeqnoIat) {
        this.addrSeqnoIat = addrSeqnoIat;
    }

    public DirectDepositRecipient100PutRequest withAddrSeqnoIat(Double addrSeqnoIat) {
        this.addrSeqnoIat = addrSeqnoIat;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public Double getCriteriaPercent() {
        return criteriaPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : GXRDIRD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public void setCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
    }

    public DirectDepositRecipient100PutRequest withCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("criteria.achtCode")
    public String getCriteriaAchtCode() {
        return criteriaAchtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("criteria.achtCode")
    public void setCriteriaAchtCode(String criteriaAchtCode) {
        this.criteriaAchtCode = criteriaAchtCode;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAchtCode(String criteriaAchtCode) {
        this.criteriaAchtCode = criteriaAchtCode;
        return this;
    }

    @JsonProperty("criteria.bankDesc")
    public String getCriteriaBankDesc() {
        return criteriaBankDesc;
    }

    @JsonProperty("criteria.bankDesc")
    public void setCriteriaBankDesc(String criteriaBankDesc) {
        this.criteriaBankDesc = criteriaBankDesc;
    }

    public DirectDepositRecipient100PutRequest withCriteriaBankDesc(String criteriaBankDesc) {
        this.criteriaBankDesc = criteriaBankDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public DirectDepositRecipient100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public String getBankRoutNum() {
        return bankRoutNum;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public void setBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
    }

    public DirectDepositRecipient100PutRequest withBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
        return this;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    public String getHrInd() {
        return hrInd;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    public void setHrInd(String hrInd) {
        this.hrInd = hrInd;
    }

    public DirectDepositRecipient100PutRequest withHrInd(String hrInd) {
        this.hrInd = hrInd;
        return this;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    public String getCriteriaBankRoutNum() {
        return criteriaBankRoutNum;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankRoutNum")
    public void setCriteriaBankRoutNum(String criteriaBankRoutNum) {
        this.criteriaBankRoutNum = criteriaBankRoutNum;
    }

    public DirectDepositRecipient100PutRequest withCriteriaBankRoutNum(String criteriaBankRoutNum) {
        this.criteriaBankRoutNum = criteriaBankRoutNum;
        return this;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public Double getCriteriaAddrSeqno() {
        return criteriaAddrSeqno;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public void setCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
        return this;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("criteria.addrSeqnoIat")
    public Double getCriteriaAddrSeqnoIat() {
        return criteriaAddrSeqnoIat;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("criteria.addrSeqnoIat")
    public void setCriteriaAddrSeqnoIat(Double criteriaAddrSeqnoIat) {
        this.criteriaAddrSeqnoIat = criteriaAddrSeqnoIat;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAddrSeqnoIat(Double criteriaAddrSeqnoIat) {
        this.criteriaAddrSeqnoIat = criteriaAddrSeqnoIat;
        return this;
    }

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    public String getAchIatInd() {
        return achIatInd;
    }

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    public void setAchIatInd(String achIatInd) {
        this.achIatInd = achIatInd;
    }

    public DirectDepositRecipient100PutRequest withAchIatInd(String achIatInd) {
        this.achIatInd = achIatInd;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : GXRDIRD_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public DirectDepositRecipient100PutRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    public String getAtypCodeIat() {
        return atypCodeIat;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    public void setAtypCodeIat(String atypCodeIat) {
        this.atypCodeIat = atypCodeIat;
    }

    public DirectDepositRecipient100PutRequest withAtypCodeIat(String atypCodeIat) {
        this.atypCodeIat = atypCodeIat;
        return this;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public String getBankAcctNum() {
        return bankAcctNum;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public void setBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
    }

    public DirectDepositRecipient100PutRequest withBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public DirectDepositRecipient100PutRequest withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public String getAchtCode() {
        return achtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public void setAchtCode(String achtCode) {
        this.achtCode = achtCode;
    }

    public DirectDepositRecipient100PutRequest withAchtCode(String achtCode) {
        this.achtCode = achtCode;
        return this;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("criteria.acctType")
    public String getCriteriaAcctType() {
        return criteriaAcctType;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("criteria.acctType")
    public void setCriteriaAcctType(String criteriaAcctType) {
        this.criteriaAcctType = criteriaAcctType;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAcctType(String criteriaAcctType) {
        this.criteriaAcctType = criteriaAcctType;
        return this;
    }

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("criteria.achIatInd")
    public String getCriteriaAchIatInd() {
        return criteriaAchIatInd;
    }

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("criteria.achIatInd")
    public void setCriteriaAchIatInd(String criteriaAchIatInd) {
        this.criteriaAchIatInd = criteriaAchIatInd;
    }

    public DirectDepositRecipient100PutRequest withCriteriaAchIatInd(String criteriaAchIatInd) {
        this.criteriaAchIatInd = criteriaAchIatInd;
        return this;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("criteria.hrInd")
    public String getCriteriaHrInd() {
        return criteriaHrInd;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("criteria.hrInd")
    public void setCriteriaHrInd(String criteriaHrInd) {
        this.criteriaHrInd = criteriaHrInd;
    }

    public DirectDepositRecipient100PutRequest withCriteriaHrInd(String criteriaHrInd) {
        this.criteriaHrInd = criteriaHrInd;
        return this;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public DirectDepositRecipient100PutRequest withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    public Double getCriteriaPriority() {
        return criteriaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : GXRDIRD_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    public void setCriteriaPriority(Double criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
    }

    public DirectDepositRecipient100PutRequest withCriteriaPriority(Double criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
        return this;
    }

    @JsonProperty("criteria.scodCodeDesc")
    public String getCriteriaScodCodeDesc() {
        return criteriaScodCodeDesc;
    }

    @JsonProperty("criteria.scodCodeDesc")
    public void setCriteriaScodCodeDesc(String criteriaScodCodeDesc) {
        this.criteriaScodCodeDesc = criteriaScodCodeDesc;
    }

    public DirectDepositRecipient100PutRequest withCriteriaScodCodeDesc(String criteriaScodCodeDesc) {
        this.criteriaScodCodeDesc = criteriaScodCodeDesc;
        return this;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    public String getCriteriaStatus() {
        return criteriaStatus;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("criteria.status")
    public void setCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
    }

    public DirectDepositRecipient100PutRequest withCriteriaStatus(String criteriaStatus) {
        this.criteriaStatus = criteriaStatus;
        return this;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    public String getAcctType() {
        return acctType;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public DirectDepositRecipient100PutRequest withAcctType(String acctType) {
        this.acctType = acctType;
        return this;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public String getApInd() {
        return apInd;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public void setApInd(String apInd) {
        this.apInd = apInd;
    }

    public DirectDepositRecipient100PutRequest withApInd(String apInd) {
        this.apInd = apInd;
        return this;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public DirectDepositRecipient100PutRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public DirectDepositRecipient100PutRequest withStatus(String status) {
        this.status = status;
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

    public DirectDepositRecipient100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectDepositRecipient100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("criteriaAtypCodeIat");
        sb.append('=');
        sb.append(((this.criteriaAtypCodeIat == null)?"<null>":this.criteriaAtypCodeIat));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("bankDesc");
        sb.append('=');
        sb.append(((this.bankDesc == null)?"<null>":this.bankDesc));
        sb.append(',');
        sb.append("criteriaScodCodeIso");
        sb.append('=');
        sb.append(((this.criteriaScodCodeIso == null)?"<null>":this.criteriaScodCodeIso));
        sb.append(',');
        sb.append("criteriaBankAcctNum");
        sb.append('=');
        sb.append(((this.criteriaBankAcctNum == null)?"<null>":this.criteriaBankAcctNum));
        sb.append(',');
        sb.append("scodCodeDesc");
        sb.append('=');
        sb.append(((this.scodCodeDesc == null)?"<null>":this.scodCodeDesc));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("criteriaApInd");
        sb.append('=');
        sb.append(((this.criteriaApInd == null)?"<null>":this.criteriaApInd));
        sb.append(',');
        sb.append("scodCodeIso");
        sb.append('=');
        sb.append(((this.scodCodeIso == null)?"<null>":this.scodCodeIso));
        sb.append(',');
        sb.append("addrSeqnoIat");
        sb.append('=');
        sb.append(((this.addrSeqnoIat == null)?"<null>":this.addrSeqnoIat));
        sb.append(',');
        sb.append("criteriaPercent");
        sb.append('=');
        sb.append(((this.criteriaPercent == null)?"<null>":this.criteriaPercent));
        sb.append(',');
        sb.append("criteriaAchtCode");
        sb.append('=');
        sb.append(((this.criteriaAchtCode == null)?"<null>":this.criteriaAchtCode));
        sb.append(',');
        sb.append("criteriaBankDesc");
        sb.append('=');
        sb.append(((this.criteriaBankDesc == null)?"<null>":this.criteriaBankDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bankRoutNum");
        sb.append('=');
        sb.append(((this.bankRoutNum == null)?"<null>":this.bankRoutNum));
        sb.append(',');
        sb.append("hrInd");
        sb.append('=');
        sb.append(((this.hrInd == null)?"<null>":this.hrInd));
        sb.append(',');
        sb.append("criteriaBankRoutNum");
        sb.append('=');
        sb.append(((this.criteriaBankRoutNum == null)?"<null>":this.criteriaBankRoutNum));
        sb.append(',');
        sb.append("criteriaAddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaAddrSeqno == null)?"<null>":this.criteriaAddrSeqno));
        sb.append(',');
        sb.append("criteriaAddrSeqnoIat");
        sb.append('=');
        sb.append(((this.criteriaAddrSeqnoIat == null)?"<null>":this.criteriaAddrSeqnoIat));
        sb.append(',');
        sb.append("achIatInd");
        sb.append('=');
        sb.append(((this.achIatInd == null)?"<null>":this.achIatInd));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("atypCodeIat");
        sb.append('=');
        sb.append(((this.atypCodeIat == null)?"<null>":this.atypCodeIat));
        sb.append(',');
        sb.append("bankAcctNum");
        sb.append('=');
        sb.append(((this.bankAcctNum == null)?"<null>":this.bankAcctNum));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("achtCode");
        sb.append('=');
        sb.append(((this.achtCode == null)?"<null>":this.achtCode));
        sb.append(',');
        sb.append("criteriaAcctType");
        sb.append('=');
        sb.append(((this.criteriaAcctType == null)?"<null>":this.criteriaAcctType));
        sb.append(',');
        sb.append("criteriaAchIatInd");
        sb.append('=');
        sb.append(((this.criteriaAchIatInd == null)?"<null>":this.criteriaAchIatInd));
        sb.append(',');
        sb.append("criteriaHrInd");
        sb.append('=');
        sb.append(((this.criteriaHrInd == null)?"<null>":this.criteriaHrInd));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("criteriaScodCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaScodCodeDesc == null)?"<null>":this.criteriaScodCodeDesc));
        sb.append(',');
        sb.append("criteriaStatus");
        sb.append('=');
        sb.append(((this.criteriaStatus == null)?"<null>":this.criteriaStatus));
        sb.append(',');
        sb.append("acctType");
        sb.append('=');
        sb.append(((this.acctType == null)?"<null>":this.acctType));
        sb.append(',');
        sb.append("apInd");
        sb.append('=');
        sb.append(((this.apInd == null)?"<null>":this.apInd));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.bankDesc == null)? 0 :this.bankDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAddrSeqnoIat == null)? 0 :this.criteriaAddrSeqnoIat.hashCode()));
        result = ((result* 31)+((this.criteriaAchIatInd == null)? 0 :this.criteriaAchIatInd.hashCode()));
        result = ((result* 31)+((this.scodCodeDesc == null)? 0 :this.scodCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPercent == null)? 0 :this.criteriaPercent.hashCode()));
        result = ((result* 31)+((this.criteriaApInd == null)? 0 :this.criteriaApInd.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.scodCodeIso == null)? 0 :this.scodCodeIso.hashCode()));
        result = ((result* 31)+((this.addrSeqnoIat == null)? 0 :this.addrSeqnoIat.hashCode()));
        result = ((result* 31)+((this.criteriaHrInd == null)? 0 :this.criteriaHrInd.hashCode()));
        result = ((result* 31)+((this.criteriaAchtCode == null)? 0 :this.criteriaAchtCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.bankRoutNum == null)? 0 :this.bankRoutNum.hashCode()));
        result = ((result* 31)+((this.hrInd == null)? 0 :this.hrInd.hashCode()));
        result = ((result* 31)+((this.criteriaScodCodeIso == null)? 0 :this.criteriaScodCodeIso.hashCode()));
        result = ((result* 31)+((this.criteriaBankDesc == null)? 0 :this.criteriaBankDesc.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.achIatInd == null)? 0 :this.achIatInd.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.atypCodeIat == null)? 0 :this.atypCodeIat.hashCode()));
        result = ((result* 31)+((this.bankAcctNum == null)? 0 :this.bankAcctNum.hashCode()));
        result = ((result* 31)+((this.criteriaBankAcctNum == null)? 0 :this.criteriaBankAcctNum.hashCode()));
        result = ((result* 31)+((this.criteriaStatus == null)? 0 :this.criteriaStatus.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.achtCode == null)? 0 :this.achtCode.hashCode()));
        result = ((result* 31)+((this.criteriaBankRoutNum == null)? 0 :this.criteriaBankRoutNum.hashCode()));
        result = ((result* 31)+((this.criteriaAddrSeqno == null)? 0 :this.criteriaAddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaAcctType == null)? 0 :this.criteriaAcctType.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaScodCodeDesc == null)? 0 :this.criteriaScodCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCodeIat == null)? 0 :this.criteriaAtypCodeIat.hashCode()));
        result = ((result* 31)+((this.acctType == null)? 0 :this.acctType.hashCode()));
        result = ((result* 31)+((this.apInd == null)? 0 :this.apInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectDepositRecipient100PutRequest) == false) {
            return false;
        }
        DirectDepositRecipient100PutRequest rhs = ((DirectDepositRecipient100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((this.bankDesc == rhs.bankDesc)||((this.bankDesc!= null)&&this.bankDesc.equals(rhs.bankDesc)))&&((this.criteriaAddrSeqnoIat == rhs.criteriaAddrSeqnoIat)||((this.criteriaAddrSeqnoIat!= null)&&this.criteriaAddrSeqnoIat.equals(rhs.criteriaAddrSeqnoIat))))&&((this.criteriaAchIatInd == rhs.criteriaAchIatInd)||((this.criteriaAchIatInd!= null)&&this.criteriaAchIatInd.equals(rhs.criteriaAchIatInd))))&&((this.scodCodeDesc == rhs.scodCodeDesc)||((this.scodCodeDesc!= null)&&this.scodCodeDesc.equals(rhs.scodCodeDesc))))&&((this.criteriaPercent == rhs.criteriaPercent)||((this.criteriaPercent!= null)&&this.criteriaPercent.equals(rhs.criteriaPercent))))&&((this.criteriaApInd == rhs.criteriaApInd)||((this.criteriaApInd!= null)&&this.criteriaApInd.equals(rhs.criteriaApInd))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.scodCodeIso == rhs.scodCodeIso)||((this.scodCodeIso!= null)&&this.scodCodeIso.equals(rhs.scodCodeIso))))&&((this.addrSeqnoIat == rhs.addrSeqnoIat)||((this.addrSeqnoIat!= null)&&this.addrSeqnoIat.equals(rhs.addrSeqnoIat))))&&((this.criteriaHrInd == rhs.criteriaHrInd)||((this.criteriaHrInd!= null)&&this.criteriaHrInd.equals(rhs.criteriaHrInd))))&&((this.criteriaAchtCode == rhs.criteriaAchtCode)||((this.criteriaAchtCode!= null)&&this.criteriaAchtCode.equals(rhs.criteriaAchtCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.bankRoutNum == rhs.bankRoutNum)||((this.bankRoutNum!= null)&&this.bankRoutNum.equals(rhs.bankRoutNum))))&&((this.hrInd == rhs.hrInd)||((this.hrInd!= null)&&this.hrInd.equals(rhs.hrInd))))&&((this.criteriaScodCodeIso == rhs.criteriaScodCodeIso)||((this.criteriaScodCodeIso!= null)&&this.criteriaScodCodeIso.equals(rhs.criteriaScodCodeIso))))&&((this.criteriaBankDesc == rhs.criteriaBankDesc)||((this.criteriaBankDesc!= null)&&this.criteriaBankDesc.equals(rhs.criteriaBankDesc))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.achIatInd == rhs.achIatInd)||((this.achIatInd!= null)&&this.achIatInd.equals(rhs.achIatInd))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.atypCodeIat == rhs.atypCodeIat)||((this.atypCodeIat!= null)&&this.atypCodeIat.equals(rhs.atypCodeIat))))&&((this.bankAcctNum == rhs.bankAcctNum)||((this.bankAcctNum!= null)&&this.bankAcctNum.equals(rhs.bankAcctNum))))&&((this.criteriaBankAcctNum == rhs.criteriaBankAcctNum)||((this.criteriaBankAcctNum!= null)&&this.criteriaBankAcctNum.equals(rhs.criteriaBankAcctNum))))&&((this.criteriaStatus == rhs.criteriaStatus)||((this.criteriaStatus!= null)&&this.criteriaStatus.equals(rhs.criteriaStatus))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))))&&((this.criteriaBankRoutNum == rhs.criteriaBankRoutNum)||((this.criteriaBankRoutNum!= null)&&this.criteriaBankRoutNum.equals(rhs.criteriaBankRoutNum))))&&((this.criteriaAddrSeqno == rhs.criteriaAddrSeqno)||((this.criteriaAddrSeqno!= null)&&this.criteriaAddrSeqno.equals(rhs.criteriaAddrSeqno))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaAcctType == rhs.criteriaAcctType)||((this.criteriaAcctType!= null)&&this.criteriaAcctType.equals(rhs.criteriaAcctType))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.criteriaScodCodeDesc == rhs.criteriaScodCodeDesc)||((this.criteriaScodCodeDesc!= null)&&this.criteriaScodCodeDesc.equals(rhs.criteriaScodCodeDesc))))&&((this.criteriaAtypCodeIat == rhs.criteriaAtypCodeIat)||((this.criteriaAtypCodeIat!= null)&&this.criteriaAtypCodeIat.equals(rhs.criteriaAtypCodeIat))))&&((this.acctType == rhs.acctType)||((this.acctType!= null)&&this.acctType.equals(rhs.acctType))))&&((this.apInd == rhs.apInd)||((this.apInd!= null)&&this.apInd.equals(rhs.apInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
