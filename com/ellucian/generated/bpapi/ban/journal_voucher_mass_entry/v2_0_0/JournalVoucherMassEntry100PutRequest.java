
package com.ellucian.generated.bpapi.ban.journal_voucher_mass_entry.v2_0_0;

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
    "currCode",
    "criteria.transDesc",
    "documentNumber",
    "criteria.progCode",
    "orgnCode",
    "criteria.fgbjvchTransDate",
    "criteria.prjdCode",
    "criteria.depNum",
    "fundCode",
    "statusInd",
    "criteria.transAmt",
    "criteria.nsfOnOffInd",
    "criteria.seqNum",
    "criteria.coasCode",
    "nsfOnOffInd",
    "docAmt",
    "depNum",
    "criteria.editDeferInd",
    "criteria.fundCode",
    "criteria.locnCode",
    "criteria.docAmt",
    "seqNum",
    "acciCode",
    "criteria.actvCode",
    "criteria.emcUnits",
    "criteria.drCrInd",
    "editDeferInd",
    "criteria.orgnCode",
    "criteria.distPct",
    "criteria.statusInd",
    "prjdCode",
    "coasCode",
    "locnCode",
    "criteria.acciCode",
    "budgetPeriod",
    "transDate",
    "progCode",
    "transAmt",
    "criteria.giftDate",
    "emcUnits",
    "actvCode",
    "drCrInd",
    "bankCode",
    "criteria.acctCode",
    "criteria.abalOverride",
    "criteria.budgetPeriod",
    "giftDate",
    "acctCode",
    "criteria.currCode",
    "criteria.ruclCode",
    "transDesc",
    "abalOverride",
    "ruclCode",
    "distPct",
    "criteria.bankCode"
})
@Generated("jsonschema2pojo")
public class JournalVoucherMassEntry100PutRequest {

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
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_DESC")
    private String criteriaTransDesc;
    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private String documentNumber;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_PROG_CODE")
    private String criteriaProgCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ORGN_CODE")
    private String orgnCode;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fgbjvchTransDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_TRANS_DATE")
    private Date criteriaFgbjvchTransDate;
    /**
     * Proj
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("criteria.prjdCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_PRJD_CODE")
    private String criteriaPrjdCode;
    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DEP_NUM")
    private String criteriaDepNum;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_FUND_CODE")
    private String fundCode;
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
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_AMT")
    private Double criteriaTransAmt;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_NSF_ON_OFF_IND")
    private String criteriaNsfOnOffInd;
    /**
     * Seq
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_SEQ_NUM")
    private Double criteriaSeqNum;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_DOC_AMT")
    private Double docAmt;
    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DEP_NUM")
    private String depNum;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_EDIT_DEFER_IND")
    private String criteriaEditDeferInd;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("criteria.docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_DOC_AMT")
    private Double criteriaDocAmt;
    /**
     * Seq
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
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("criteria.emcUnits")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_EMC_UNITS")
    private Double criteriaEmcUnits;
    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DR_CR_IND")
    private String criteriaDrCrInd;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DIST_PCT")
    private Double criteriaDistPct;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Proj
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
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String criteriaAcciCode;
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
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_TRANS_DATE")
    private Date transDate;
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
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("criteria.giftDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_GIFT_DATE")
    private Date criteriaGiftDate;
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
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ABAL_OVERRIDE")
    private String criteriaAbalOverride;
    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("criteria.budgetPeriod")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BUDGET_PERIOD")
    private String criteriaBudgetPeriod;
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
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCT_CODE")
    private String acctCode;
    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
    /**
     * Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String criteriaRuclCode;
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
    /**
     * Type
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
    /**
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public JournalVoucherMassEntry100PutRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDesc")
    public String getCriteriaTransDesc() {
        return criteriaTransDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDesc")
    public void setCriteriaTransDesc(String criteriaTransDesc) {
        this.criteriaTransDesc = criteriaTransDesc;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaTransDesc(String criteriaTransDesc) {
        this.criteriaTransDesc = criteriaTransDesc;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public JournalVoucherMassEntry100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
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

    public JournalVoucherMassEntry100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fgbjvchTransDate")
    public Date getCriteriaFgbjvchTransDate() {
        return criteriaFgbjvchTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fgbjvchTransDate")
    public void setCriteriaFgbjvchTransDate(Date criteriaFgbjvchTransDate) {
        this.criteriaFgbjvchTransDate = criteriaFgbjvchTransDate;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaFgbjvchTransDate(Date criteriaFgbjvchTransDate) {
        this.criteriaFgbjvchTransDate = criteriaFgbjvchTransDate;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("criteria.prjdCode")
    public String getCriteriaPrjdCode() {
        return criteriaPrjdCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("criteria.prjdCode")
    public void setCriteriaPrjdCode(String criteriaPrjdCode) {
        this.criteriaPrjdCode = criteriaPrjdCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaPrjdCode(String criteriaPrjdCode) {
        this.criteriaPrjdCode = criteriaPrjdCode;
        return this;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    public String getCriteriaDepNum() {
        return criteriaDepNum;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    public void setCriteriaDepNum(String criteriaDepNum) {
        this.criteriaDepNum = criteriaDepNum;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaDepNum(String criteriaDepNum) {
        this.criteriaDepNum = criteriaDepNum;
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

    public JournalVoucherMassEntry100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public JournalVoucherMassEntry100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.transAmt")
    public Double getCriteriaTransAmt() {
        return criteriaTransAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.transAmt")
    public void setCriteriaTransAmt(Double criteriaTransAmt) {
        this.criteriaTransAmt = criteriaTransAmt;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaTransAmt(Double criteriaTransAmt) {
        this.criteriaTransAmt = criteriaTransAmt;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    public String getCriteriaNsfOnOffInd() {
        return criteriaNsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    public void setCriteriaNsfOnOffInd(String criteriaNsfOnOffInd) {
        this.criteriaNsfOnOffInd = criteriaNsfOnOffInd;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaNsfOnOffInd(String criteriaNsfOnOffInd) {
        this.criteriaNsfOnOffInd = criteriaNsfOnOffInd;
        return this;
    }

    /**
     * Seq
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    public Double getCriteriaSeqNum() {
        return criteriaSeqNum;
    }

    /**
     * Seq
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    public void setCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public JournalVoucherMassEntry100PutRequest withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public JournalVoucherMassEntry100PutRequest withDocAmt(Double docAmt) {
        this.docAmt = docAmt;
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

    public JournalVoucherMassEntry100PutRequest withDepNum(String depNum) {
        this.depNum = depNum;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    public String getCriteriaEditDeferInd() {
        return criteriaEditDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    public void setCriteriaEditDeferInd(String criteriaEditDeferInd) {
        this.criteriaEditDeferInd = criteriaEditDeferInd;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaEditDeferInd(String criteriaEditDeferInd) {
        this.criteriaEditDeferInd = criteriaEditDeferInd;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBJVCD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("criteria.docAmt")
    public Double getCriteriaDocAmt() {
        return criteriaDocAmt;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("criteria.docAmt")
    public void setCriteriaDocAmt(Double criteriaDocAmt) {
        this.criteriaDocAmt = criteriaDocAmt;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaDocAmt(Double criteriaDocAmt) {
        this.criteriaDocAmt = criteriaDocAmt;
        return this;
    }

    /**
     * Seq
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
     * Seq
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public JournalVoucherMassEntry100PutRequest withSeqNum(Double seqNum) {
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

    public JournalVoucherMassEntry100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBJVCD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("criteria.emcUnits")
    public Double getCriteriaEmcUnits() {
        return criteriaEmcUnits;
    }

    /**
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("criteria.emcUnits")
    public void setCriteriaEmcUnits(Double criteriaEmcUnits) {
        this.criteriaEmcUnits = criteriaEmcUnits;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaEmcUnits(Double criteriaEmcUnits) {
        this.criteriaEmcUnits = criteriaEmcUnits;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    public String getCriteriaDrCrInd() {
        return criteriaDrCrInd;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBJVCD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    public void setCriteriaDrCrInd(String criteriaDrCrInd) {
        this.criteriaDrCrInd = criteriaDrCrInd;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaDrCrInd(String criteriaDrCrInd) {
        this.criteriaDrCrInd = criteriaDrCrInd;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public JournalVoucherMassEntry100PutRequest withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    public Double getCriteriaDistPct() {
        return criteriaDistPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    public void setCriteriaDistPct(Double criteriaDistPct) {
        this.criteriaDistPct = criteriaDistPct;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaDistPct(Double criteriaDistPct) {
        this.criteriaDistPct = criteriaDistPct;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public String getPrjdCode() {
        return prjdCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBJVCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public void setPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
    }

    public JournalVoucherMassEntry100PutRequest withPrjdCode(String prjdCode) {
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

    public JournalVoucherMassEntry100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public JournalVoucherMassEntry100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
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

    public JournalVoucherMassEntry100PutRequest withBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public JournalVoucherMassEntry100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public JournalVoucherMassEntry100PutRequest withProgCode(String progCode) {
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

    public JournalVoucherMassEntry100PutRequest withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("criteria.giftDate")
    public Date getCriteriaGiftDate() {
        return criteriaGiftDate;
    }

    /**
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("criteria.giftDate")
    public void setCriteriaGiftDate(Date criteriaGiftDate) {
        this.criteriaGiftDate = criteriaGiftDate;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaGiftDate(Date criteriaGiftDate) {
        this.criteriaGiftDate = criteriaGiftDate;
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

    public JournalVoucherMassEntry100PutRequest withEmcUnits(Double emcUnits) {
        this.emcUnits = emcUnits;
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

    public JournalVoucherMassEntry100PutRequest withActvCode(String actvCode) {
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

    public JournalVoucherMassEntry100PutRequest withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public JournalVoucherMassEntry100PutRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    public String getCriteriaAbalOverride() {
        return criteriaAbalOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    public void setCriteriaAbalOverride(String criteriaAbalOverride) {
        this.criteriaAbalOverride = criteriaAbalOverride;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaAbalOverride(String criteriaAbalOverride) {
        this.criteriaAbalOverride = criteriaAbalOverride;
        return this;
    }

    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("criteria.budgetPeriod")
    public String getCriteriaBudgetPeriod() {
        return criteriaBudgetPeriod;
    }

    /**
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("criteria.budgetPeriod")
    public void setCriteriaBudgetPeriod(String criteriaBudgetPeriod) {
        this.criteriaBudgetPeriod = criteriaBudgetPeriod;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaBudgetPeriod(String criteriaBudgetPeriod) {
        this.criteriaBudgetPeriod = criteriaBudgetPeriod;
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

    public JournalVoucherMassEntry100PutRequest withGiftDate(Date giftDate) {
        this.giftDate = giftDate;
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

    public JournalVoucherMassEntry100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    public String getCriteriaRuclCode() {
        return criteriaRuclCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    public void setCriteriaRuclCode(String criteriaRuclCode) {
        this.criteriaRuclCode = criteriaRuclCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaRuclCode(String criteriaRuclCode) {
        this.criteriaRuclCode = criteriaRuclCode;
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

    public JournalVoucherMassEntry100PutRequest withTransDesc(String transDesc) {
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

    public JournalVoucherMassEntry100PutRequest withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
        return this;
    }

    /**
     * Type
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
     * Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public JournalVoucherMassEntry100PutRequest withRuclCode(String ruclCode) {
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

    public JournalVoucherMassEntry100PutRequest withDistPct(Double distPct) {
        this.distPct = distPct;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBJVCD_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public JournalVoucherMassEntry100PutRequest withCriteriaBankCode(String criteriaBankCode) {
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

    public JournalVoucherMassEntry100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherMassEntry100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("criteriaTransDesc");
        sb.append('=');
        sb.append(((this.criteriaTransDesc == null)?"<null>":this.criteriaTransDesc));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("criteriaFgbjvchTransDate");
        sb.append('=');
        sb.append(((this.criteriaFgbjvchTransDate == null)?"<null>":this.criteriaFgbjvchTransDate));
        sb.append(',');
        sb.append("criteriaPrjdCode");
        sb.append('=');
        sb.append(((this.criteriaPrjdCode == null)?"<null>":this.criteriaPrjdCode));
        sb.append(',');
        sb.append("criteriaDepNum");
        sb.append('=');
        sb.append(((this.criteriaDepNum == null)?"<null>":this.criteriaDepNum));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaTransAmt");
        sb.append('=');
        sb.append(((this.criteriaTransAmt == null)?"<null>":this.criteriaTransAmt));
        sb.append(',');
        sb.append("criteriaNsfOnOffInd");
        sb.append('=');
        sb.append(((this.criteriaNsfOnOffInd == null)?"<null>":this.criteriaNsfOnOffInd));
        sb.append(',');
        sb.append("criteriaSeqNum");
        sb.append('=');
        sb.append(((this.criteriaSeqNum == null)?"<null>":this.criteriaSeqNum));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
        sb.append(',');
        sb.append("depNum");
        sb.append('=');
        sb.append(((this.depNum == null)?"<null>":this.depNum));
        sb.append(',');
        sb.append("criteriaEditDeferInd");
        sb.append('=');
        sb.append(((this.criteriaEditDeferInd == null)?"<null>":this.criteriaEditDeferInd));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("criteriaDocAmt");
        sb.append('=');
        sb.append(((this.criteriaDocAmt == null)?"<null>":this.criteriaDocAmt));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("criteriaActvCode");
        sb.append('=');
        sb.append(((this.criteriaActvCode == null)?"<null>":this.criteriaActvCode));
        sb.append(',');
        sb.append("criteriaEmcUnits");
        sb.append('=');
        sb.append(((this.criteriaEmcUnits == null)?"<null>":this.criteriaEmcUnits));
        sb.append(',');
        sb.append("criteriaDrCrInd");
        sb.append('=');
        sb.append(((this.criteriaDrCrInd == null)?"<null>":this.criteriaDrCrInd));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("criteriaDistPct");
        sb.append('=');
        sb.append(((this.criteriaDistPct == null)?"<null>":this.criteriaDistPct));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("criteriaAcciCode");
        sb.append('=');
        sb.append(((this.criteriaAcciCode == null)?"<null>":this.criteriaAcciCode));
        sb.append(',');
        sb.append("budgetPeriod");
        sb.append('=');
        sb.append(((this.budgetPeriod == null)?"<null>":this.budgetPeriod));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("criteriaGiftDate");
        sb.append('=');
        sb.append(((this.criteriaGiftDate == null)?"<null>":this.criteriaGiftDate));
        sb.append(',');
        sb.append("emcUnits");
        sb.append('=');
        sb.append(((this.emcUnits == null)?"<null>":this.emcUnits));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
        sb.append(',');
        sb.append("criteriaAbalOverride");
        sb.append('=');
        sb.append(((this.criteriaAbalOverride == null)?"<null>":this.criteriaAbalOverride));
        sb.append(',');
        sb.append("criteriaBudgetPeriod");
        sb.append('=');
        sb.append(((this.criteriaBudgetPeriod == null)?"<null>":this.criteriaBudgetPeriod));
        sb.append(',');
        sb.append("giftDate");
        sb.append('=');
        sb.append(((this.giftDate == null)?"<null>":this.giftDate));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("criteriaRuclCode");
        sb.append('=');
        sb.append(((this.criteriaRuclCode == null)?"<null>":this.criteriaRuclCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("distPct");
        sb.append('=');
        sb.append(((this.distPct == null)?"<null>":this.distPct));
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
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaTransDesc == null)? 0 :this.criteriaTransDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.criteriaEmcUnits == null)? 0 :this.criteriaEmcUnits.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.criteriaAbalOverride == null)? 0 :this.criteriaAbalOverride.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        result = ((result* 31)+((this.criteriaGiftDate == null)? 0 :this.criteriaGiftDate.hashCode()));
        result = ((result* 31)+((this.criteriaPrjdCode == null)? 0 :this.criteriaPrjdCode.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaRuclCode == null)? 0 :this.criteriaRuclCode.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.criteriaFgbjvchTransDate == null)? 0 :this.criteriaFgbjvchTransDate.hashCode()));
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.criteriaDepNum == null)? 0 :this.criteriaDepNum.hashCode()));
        result = ((result* 31)+((this.criteriaEditDeferInd == null)? 0 :this.criteriaEditDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaNsfOnOffInd == null)? 0 :this.criteriaNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.criteriaDocAmt == null)? 0 :this.criteriaDocAmt.hashCode()));
        result = ((result* 31)+((this.budgetPeriod == null)? 0 :this.budgetPeriod.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.emcUnits == null)? 0 :this.emcUnits.hashCode()));
        result = ((result* 31)+((this.criteriaTransAmt == null)? 0 :this.criteriaTransAmt.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.criteriaDrCrInd == null)? 0 :this.criteriaDrCrInd.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.giftDate == null)? 0 :this.giftDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNum == null)? 0 :this.criteriaSeqNum.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaDistPct == null)? 0 :this.criteriaDistPct.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.criteriaBudgetPeriod == null)? 0 :this.criteriaBudgetPeriod.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JournalVoucherMassEntry100PutRequest) == false) {
            return false;
        }
        JournalVoucherMassEntry100PutRequest rhs = ((JournalVoucherMassEntry100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaTransDesc == rhs.criteriaTransDesc)||((this.criteriaTransDesc!= null)&&this.criteriaTransDesc.equals(rhs.criteriaTransDesc))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.criteriaEmcUnits == rhs.criteriaEmcUnits)||((this.criteriaEmcUnits!= null)&&this.criteriaEmcUnits.equals(rhs.criteriaEmcUnits))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaAbalOverride == rhs.criteriaAbalOverride)||((this.criteriaAbalOverride!= null)&&this.criteriaAbalOverride.equals(rhs.criteriaAbalOverride))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))))&&((this.criteriaGiftDate == rhs.criteriaGiftDate)||((this.criteriaGiftDate!= null)&&this.criteriaGiftDate.equals(rhs.criteriaGiftDate))))&&((this.criteriaPrjdCode == rhs.criteriaPrjdCode)||((this.criteriaPrjdCode!= null)&&this.criteriaPrjdCode.equals(rhs.criteriaPrjdCode))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.criteriaRuclCode == rhs.criteriaRuclCode)||((this.criteriaRuclCode!= null)&&this.criteriaRuclCode.equals(rhs.criteriaRuclCode))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode))))&&((this.criteriaFgbjvchTransDate == rhs.criteriaFgbjvchTransDate)||((this.criteriaFgbjvchTransDate!= null)&&this.criteriaFgbjvchTransDate.equals(rhs.criteriaFgbjvchTransDate))))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.criteriaDepNum == rhs.criteriaDepNum)||((this.criteriaDepNum!= null)&&this.criteriaDepNum.equals(rhs.criteriaDepNum))))&&((this.criteriaEditDeferInd == rhs.criteriaEditDeferInd)||((this.criteriaEditDeferInd!= null)&&this.criteriaEditDeferInd.equals(rhs.criteriaEditDeferInd))))&&((this.criteriaNsfOnOffInd == rhs.criteriaNsfOnOffInd)||((this.criteriaNsfOnOffInd!= null)&&this.criteriaNsfOnOffInd.equals(rhs.criteriaNsfOnOffInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.criteriaDocAmt == rhs.criteriaDocAmt)||((this.criteriaDocAmt!= null)&&this.criteriaDocAmt.equals(rhs.criteriaDocAmt))))&&((this.budgetPeriod == rhs.budgetPeriod)||((this.budgetPeriod!= null)&&this.budgetPeriod.equals(rhs.budgetPeriod))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.emcUnits == rhs.emcUnits)||((this.emcUnits!= null)&&this.emcUnits.equals(rhs.emcUnits))))&&((this.criteriaTransAmt == rhs.criteriaTransAmt)||((this.criteriaTransAmt!= null)&&this.criteriaTransAmt.equals(rhs.criteriaTransAmt))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.criteriaDrCrInd == rhs.criteriaDrCrInd)||((this.criteriaDrCrInd!= null)&&this.criteriaDrCrInd.equals(rhs.criteriaDrCrInd))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.giftDate == rhs.giftDate)||((this.giftDate!= null)&&this.giftDate.equals(rhs.giftDate))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.criteriaSeqNum == rhs.criteriaSeqNum)||((this.criteriaSeqNum!= null)&&this.criteriaSeqNum.equals(rhs.criteriaSeqNum))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaDistPct == rhs.criteriaDistPct)||((this.criteriaDistPct!= null)&&this.criteriaDistPct.equals(rhs.criteriaDistPct))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.criteriaBudgetPeriod == rhs.criteriaBudgetPeriod)||((this.criteriaBudgetPeriod!= null)&&this.criteriaBudgetPeriod.equals(rhs.criteriaBudgetPeriod))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))));
    }

}
