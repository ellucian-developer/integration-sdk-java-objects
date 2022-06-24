
package com.ellucian.generated.bpapi.ban.journal_voucher_entry.v1_0_0;

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
    "progTitle",
    "fundTitle",
    "currCode",
    "prjdCode",
    "coasCode",
    "acctTitle",
    "locnCode",
    "orgnCode",
    "journalTypeDescription",
    "fundCode",
    "actvTitle",
    "budgetPeriod",
    "statusInd",
    "progCode",
    "transAmt",
    "docRefNum",
    "encdItemNum",
    "locnTitle",
    "emcUnits",
    "encdSeqNum",
    "actvCode",
    "drCrInd",
    "depNum",
    "prjdDesc",
    "bankCode",
    "accrualInd",
    "giftDate",
    "seqNum",
    "acciCode",
    "acctCode",
    "orgnTitle",
    "encbNum",
    "cmtType",
    "transDesc",
    "abalOverride",
    "acciTitle",
    "encbActionInd",
    "ruclCode",
    "distPct",
    "coasTitle"
})
@Generated("jsonschema2pojo")
public class Fgbjvcd {

    @JsonProperty("progTitle")
    private String progTitle;
    @JsonProperty("fundTitle")
    private String fundTitle;
    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Project
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_PRJD_CODE")
    private String prjdCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    @JsonProperty("acctTitle")
    private String acctTitle;
    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_LOCN_CODE")
    private String locnCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ORGN_CODE")
    private String orgnCode;
    @JsonProperty("journalTypeDescription")
    private String journalTypeDescription;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_FUND_CODE")
    private String fundCode;
    @JsonProperty("actvTitle")
    private String actvTitle;
    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("budgetPeriod")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BUDGET_PERIOD")
    private String budgetPeriod;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_STATUS_IND")
    private String statusInd;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_PROG_CODE")
    private String progCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_AMT")
    private Double transAmt;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBJVCD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DOC_REF_NUM")
    private String docRefNum;
    /**
     * Item Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_ITEM_NUM
     * 
     */
    @JsonProperty("encdItemNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ENCD_ITEM_NUM")
    private Double encdItemNum;
    @JsonProperty("locnTitle")
    private String locnTitle;
    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("emcUnits")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_EMC_UNITS")
    private Double emcUnits;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_SEQ_NUM
     * 
     */
    @JsonProperty("encdSeqNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ENCD_SEQ_NUM")
    private Double encdSeqNum;
    /**
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACTV_CODE")
    private String actvCode;
    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DR_CR_IND")
    private String drCrInd;
    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DEP_NUM")
    private String depNum;
    @JsonProperty("prjdDesc")
    private String prjdDesc;
    /**
     * Bank Code
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Accrual Indicator
     * <p>
     * Lineage reference object : FGBJVCD_ACCRUAL_IND
     * 
     */
    @JsonProperty("accrualInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCRUAL_IND")
    private String accrualInd;
    /**
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("giftDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_GIFT_DATE")
    private Date giftDate;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_SEQ_NUM")
    private Double seqNum;
    /**
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCT_CODE")
    private String acctCode;
    @JsonProperty("orgnTitle")
    private String orgnTitle;
    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_NUM
     * 
     */
    @JsonProperty("encbNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ENCB_NUM")
    private String encbNum;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : FGBJVCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_CMT_TYPE")
    private String cmtType;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_DESC")
    private String transDesc;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ABAL_OVERRIDE")
    private String abalOverride;
    @JsonProperty("acciTitle")
    private String acciTitle;
    /**
     * Action
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_ACTION_IND
     * 
     */
    @JsonProperty("encbActionInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ENCB_ACTION_IND")
    private String encbActionInd;
    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String ruclCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DIST_PCT")
    private Double distPct;
    @JsonProperty("coasTitle")
    private String coasTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("progTitle")
    public String getProgTitle() {
        return progTitle;
    }

    @JsonProperty("progTitle")
    public void setProgTitle(String progTitle) {
        this.progTitle = progTitle;
    }

    public Fgbjvcd withProgTitle(String progTitle) {
        this.progTitle = progTitle;
        return this;
    }

    @JsonProperty("fundTitle")
    public String getFundTitle() {
        return fundTitle;
    }

    @JsonProperty("fundTitle")
    public void setFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
    }

    public Fgbjvcd withFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Fgbjvcd withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public String getPrjdCode() {
        return prjdCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public void setPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
    }

    public Fgbjvcd withPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Fgbjvcd withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("acctTitle")
    public String getAcctTitle() {
        return acctTitle;
    }

    @JsonProperty("acctTitle")
    public void setAcctTitle(String acctTitle) {
        this.acctTitle = acctTitle;
    }

    public Fgbjvcd withAcctTitle(String acctTitle) {
        this.acctTitle = acctTitle;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public Fgbjvcd withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public Fgbjvcd withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    @JsonProperty("journalTypeDescription")
    public String getJournalTypeDescription() {
        return journalTypeDescription;
    }

    @JsonProperty("journalTypeDescription")
    public void setJournalTypeDescription(String journalTypeDescription) {
        this.journalTypeDescription = journalTypeDescription;
    }

    public Fgbjvcd withJournalTypeDescription(String journalTypeDescription) {
        this.journalTypeDescription = journalTypeDescription;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Fgbjvcd withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("actvTitle")
    public String getActvTitle() {
        return actvTitle;
    }

    @JsonProperty("actvTitle")
    public void setActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
    }

    public Fgbjvcd withActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
        return this;
    }

    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("budgetPeriod")
    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("budgetPeriod")
    public void setBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
    }

    public Fgbjvcd withBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public Fgbjvcd withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public Fgbjvcd withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("transAmt")
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public Fgbjvcd withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBJVCD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public String getDocRefNum() {
        return docRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBJVCD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public void setDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
    }

    public Fgbjvcd withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Item Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_ITEM_NUM
     * 
     */
    @JsonProperty("encdItemNum")
    public Double getEncdItemNum() {
        return encdItemNum;
    }

    /**
     * Item Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_ITEM_NUM
     * 
     */
    @JsonProperty("encdItemNum")
    public void setEncdItemNum(Double encdItemNum) {
        this.encdItemNum = encdItemNum;
    }

    public Fgbjvcd withEncdItemNum(Double encdItemNum) {
        this.encdItemNum = encdItemNum;
        return this;
    }

    @JsonProperty("locnTitle")
    public String getLocnTitle() {
        return locnTitle;
    }

    @JsonProperty("locnTitle")
    public void setLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
    }

    public Fgbjvcd withLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
        return this;
    }

    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("emcUnits")
    public Double getEmcUnits() {
        return emcUnits;
    }

    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("emcUnits")
    public void setEmcUnits(Double emcUnits) {
        this.emcUnits = emcUnits;
    }

    public Fgbjvcd withEmcUnits(Double emcUnits) {
        this.emcUnits = emcUnits;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_SEQ_NUM
     * 
     */
    @JsonProperty("encdSeqNum")
    public Double getEncdSeqNum() {
        return encdSeqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_SEQ_NUM
     * 
     */
    @JsonProperty("encdSeqNum")
    public void setEncdSeqNum(Double encdSeqNum) {
        this.encdSeqNum = encdSeqNum;
    }

    public Fgbjvcd withEncdSeqNum(Double encdSeqNum) {
        this.encdSeqNum = encdSeqNum;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public Fgbjvcd withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public Fgbjvcd withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
        return this;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    public String getDepNum() {
        return depNum;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }

    public Fgbjvcd withDepNum(String depNum) {
        this.depNum = depNum;
        return this;
    }

    @JsonProperty("prjdDesc")
    public String getPrjdDesc() {
        return prjdDesc;
    }

    @JsonProperty("prjdDesc")
    public void setPrjdDesc(String prjdDesc) {
        this.prjdDesc = prjdDesc;
    }

    public Fgbjvcd withPrjdDesc(String prjdDesc) {
        this.prjdDesc = prjdDesc;
        return this;
    }

    /**
     * Bank Code
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank Code
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Fgbjvcd withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Accrual Indicator
     * <p>
     * Lineage reference object : FGBJVCD_ACCRUAL_IND
     * 
     */
    @JsonProperty("accrualInd")
    public String getAccrualInd() {
        return accrualInd;
    }

    /**
     * Accrual Indicator
     * <p>
     * Lineage reference object : FGBJVCD_ACCRUAL_IND
     * 
     */
    @JsonProperty("accrualInd")
    public void setAccrualInd(String accrualInd) {
        this.accrualInd = accrualInd;
    }

    public Fgbjvcd withAccrualInd(String accrualInd) {
        this.accrualInd = accrualInd;
        return this;
    }

    /**
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("giftDate")
    public Date getGiftDate() {
        return giftDate;
    }

    /**
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("giftDate")
    public void setGiftDate(Date giftDate) {
        this.giftDate = giftDate;
    }

    public Fgbjvcd withGiftDate(Date giftDate) {
        this.giftDate = giftDate;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public Fgbjvcd withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public Fgbjvcd withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public Fgbjvcd withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    @JsonProperty("orgnTitle")
    public String getOrgnTitle() {
        return orgnTitle;
    }

    @JsonProperty("orgnTitle")
    public void setOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
    }

    public Fgbjvcd withOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
        return this;
    }

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_NUM
     * 
     */
    @JsonProperty("encbNum")
    public String getEncbNum() {
        return encbNum;
    }

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_NUM
     * 
     */
    @JsonProperty("encbNum")
    public void setEncbNum(String encbNum) {
        this.encbNum = encbNum;
    }

    public Fgbjvcd withEncbNum(String encbNum) {
        this.encbNum = encbNum;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FGBJVCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public String getCmtType() {
        return cmtType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FGBJVCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public void setCmtType(String cmtType) {
        this.cmtType = cmtType;
    }

    public Fgbjvcd withCmtType(String cmtType) {
        this.cmtType = cmtType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("transDesc")
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public Fgbjvcd withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    public String getAbalOverride() {
        return abalOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    public void setAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
    }

    public Fgbjvcd withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
        return this;
    }

    @JsonProperty("acciTitle")
    public String getAcciTitle() {
        return acciTitle;
    }

    @JsonProperty("acciTitle")
    public void setAcciTitle(String acciTitle) {
        this.acciTitle = acciTitle;
    }

    public Fgbjvcd withAcciTitle(String acciTitle) {
        this.acciTitle = acciTitle;
        return this;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_ACTION_IND
     * 
     */
    @JsonProperty("encbActionInd")
    public String getEncbActionInd() {
        return encbActionInd;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : FGBJVCD_ENCB_ACTION_IND
     * 
     */
    @JsonProperty("encbActionInd")
    public void setEncbActionInd(String encbActionInd) {
        this.encbActionInd = encbActionInd;
    }

    public Fgbjvcd withEncbActionInd(String encbActionInd) {
        this.encbActionInd = encbActionInd;
        return this;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public Fgbjvcd withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    public Double getDistPct() {
        return distPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    public void setDistPct(Double distPct) {
        this.distPct = distPct;
    }

    public Fgbjvcd withDistPct(Double distPct) {
        this.distPct = distPct;
        return this;
    }

    @JsonProperty("coasTitle")
    public String getCoasTitle() {
        return coasTitle;
    }

    @JsonProperty("coasTitle")
    public void setCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
    }

    public Fgbjvcd withCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
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

    public Fgbjvcd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbjvcd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("progTitle");
        sb.append('=');
        sb.append(((this.progTitle == null)?"<null>":this.progTitle));
        sb.append(',');
        sb.append("fundTitle");
        sb.append('=');
        sb.append(((this.fundTitle == null)?"<null>":this.fundTitle));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctTitle");
        sb.append('=');
        sb.append(((this.acctTitle == null)?"<null>":this.acctTitle));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("journalTypeDescription");
        sb.append('=');
        sb.append(((this.journalTypeDescription == null)?"<null>":this.journalTypeDescription));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("actvTitle");
        sb.append('=');
        sb.append(((this.actvTitle == null)?"<null>":this.actvTitle));
        sb.append(',');
        sb.append("budgetPeriod");
        sb.append('=');
        sb.append(((this.budgetPeriod == null)?"<null>":this.budgetPeriod));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("encdItemNum");
        sb.append('=');
        sb.append(((this.encdItemNum == null)?"<null>":this.encdItemNum));
        sb.append(',');
        sb.append("locnTitle");
        sb.append('=');
        sb.append(((this.locnTitle == null)?"<null>":this.locnTitle));
        sb.append(',');
        sb.append("emcUnits");
        sb.append('=');
        sb.append(((this.emcUnits == null)?"<null>":this.emcUnits));
        sb.append(',');
        sb.append("encdSeqNum");
        sb.append('=');
        sb.append(((this.encdSeqNum == null)?"<null>":this.encdSeqNum));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("depNum");
        sb.append('=');
        sb.append(((this.depNum == null)?"<null>":this.depNum));
        sb.append(',');
        sb.append("prjdDesc");
        sb.append('=');
        sb.append(((this.prjdDesc == null)?"<null>":this.prjdDesc));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("accrualInd");
        sb.append('=');
        sb.append(((this.accrualInd == null)?"<null>":this.accrualInd));
        sb.append(',');
        sb.append("giftDate");
        sb.append('=');
        sb.append(((this.giftDate == null)?"<null>":this.giftDate));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnTitle");
        sb.append('=');
        sb.append(((this.orgnTitle == null)?"<null>":this.orgnTitle));
        sb.append(',');
        sb.append("encbNum");
        sb.append('=');
        sb.append(((this.encbNum == null)?"<null>":this.encbNum));
        sb.append(',');
        sb.append("cmtType");
        sb.append('=');
        sb.append(((this.cmtType == null)?"<null>":this.cmtType));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("acciTitle");
        sb.append('=');
        sb.append(((this.acciTitle == null)?"<null>":this.acciTitle));
        sb.append(',');
        sb.append("encbActionInd");
        sb.append('=');
        sb.append(((this.encbActionInd == null)?"<null>":this.encbActionInd));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("distPct");
        sb.append('=');
        sb.append(((this.distPct == null)?"<null>":this.distPct));
        sb.append(',');
        sb.append("coasTitle");
        sb.append('=');
        sb.append(((this.coasTitle == null)?"<null>":this.coasTitle));
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
        result = ((result* 31)+((this.progTitle == null)? 0 :this.progTitle.hashCode()));
        result = ((result* 31)+((this.fundTitle == null)? 0 :this.fundTitle.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctTitle == null)? 0 :this.acctTitle.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.journalTypeDescription == null)? 0 :this.journalTypeDescription.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.actvTitle == null)? 0 :this.actvTitle.hashCode()));
        result = ((result* 31)+((this.budgetPeriod == null)? 0 :this.budgetPeriod.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.encdItemNum == null)? 0 :this.encdItemNum.hashCode()));
        result = ((result* 31)+((this.locnTitle == null)? 0 :this.locnTitle.hashCode()));
        result = ((result* 31)+((this.emcUnits == null)? 0 :this.emcUnits.hashCode()));
        result = ((result* 31)+((this.encdSeqNum == null)? 0 :this.encdSeqNum.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.prjdDesc == null)? 0 :this.prjdDesc.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.accrualInd == null)? 0 :this.accrualInd.hashCode()));
        result = ((result* 31)+((this.giftDate == null)? 0 :this.giftDate.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnTitle == null)? 0 :this.orgnTitle.hashCode()));
        result = ((result* 31)+((this.encbNum == null)? 0 :this.encbNum.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.acciTitle == null)? 0 :this.acciTitle.hashCode()));
        result = ((result* 31)+((this.encbActionInd == null)? 0 :this.encbActionInd.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        result = ((result* 31)+((this.coasTitle == null)? 0 :this.coasTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbjvcd) == false) {
            return false;
        }
        Fgbjvcd rhs = ((Fgbjvcd) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.progTitle == rhs.progTitle)||((this.progTitle!= null)&&this.progTitle.equals(rhs.progTitle)))&&((this.fundTitle == rhs.fundTitle)||((this.fundTitle!= null)&&this.fundTitle.equals(rhs.fundTitle))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctTitle == rhs.acctTitle)||((this.acctTitle!= null)&&this.acctTitle.equals(rhs.acctTitle))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.journalTypeDescription == rhs.journalTypeDescription)||((this.journalTypeDescription!= null)&&this.journalTypeDescription.equals(rhs.journalTypeDescription))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.actvTitle == rhs.actvTitle)||((this.actvTitle!= null)&&this.actvTitle.equals(rhs.actvTitle))))&&((this.budgetPeriod == rhs.budgetPeriod)||((this.budgetPeriod!= null)&&this.budgetPeriod.equals(rhs.budgetPeriod))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.encdItemNum == rhs.encdItemNum)||((this.encdItemNum!= null)&&this.encdItemNum.equals(rhs.encdItemNum))))&&((this.locnTitle == rhs.locnTitle)||((this.locnTitle!= null)&&this.locnTitle.equals(rhs.locnTitle))))&&((this.emcUnits == rhs.emcUnits)||((this.emcUnits!= null)&&this.emcUnits.equals(rhs.emcUnits))))&&((this.encdSeqNum == rhs.encdSeqNum)||((this.encdSeqNum!= null)&&this.encdSeqNum.equals(rhs.encdSeqNum))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.prjdDesc == rhs.prjdDesc)||((this.prjdDesc!= null)&&this.prjdDesc.equals(rhs.prjdDesc))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.accrualInd == rhs.accrualInd)||((this.accrualInd!= null)&&this.accrualInd.equals(rhs.accrualInd))))&&((this.giftDate == rhs.giftDate)||((this.giftDate!= null)&&this.giftDate.equals(rhs.giftDate))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnTitle == rhs.orgnTitle)||((this.orgnTitle!= null)&&this.orgnTitle.equals(rhs.orgnTitle))))&&((this.encbNum == rhs.encbNum)||((this.encbNum!= null)&&this.encbNum.equals(rhs.encbNum))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.acciTitle == rhs.acciTitle)||((this.acciTitle!= null)&&this.acciTitle.equals(rhs.acciTitle))))&&((this.encbActionInd == rhs.encbActionInd)||((this.encbActionInd!= null)&&this.encbActionInd.equals(rhs.encbActionInd))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))))&&((this.coasTitle == rhs.coasTitle)||((this.coasTitle!= null)&&this.coasTitle.equals(rhs.coasTitle))));
    }

}
