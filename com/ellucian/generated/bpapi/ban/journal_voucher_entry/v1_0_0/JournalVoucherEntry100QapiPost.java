
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
    "documentNumber",
    "submissionNumber",
    "transDate",
    "nsfOnOffInd",
    "docAmt",
    "editDeferInd",
    "distribAmt",
    "statusInd",
    "seqNum",
    "ruclCode",
    "coasCode",
    "actvCode",
    "acciCode",
    "locnCode",
    "fundCode",
    "prjdCode",
    "orgnCode",
    "acctCode",
    "progCode",
    "distPct",
    "depNum",
    "docRefNum",
    "transAmt",
    "encbNum",
    "budgetPeriod",
    "drCrInd",
    "encdItemNum",
    "accrualInd",
    "abalOverride",
    "encdSeqNum",
    "currCode",
    "transDesc",
    "encbActionInd",
    "giftDate",
    "bankCode",
    "emcUnits"
})
@Generated("jsonschema2pojo")
public class JournalVoucherEntry100QapiPost {

    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("submissionNumber")
    private String submissionNumber;
    @JsonProperty("transDate")
    private String transDate;
    @JsonProperty("nsfOnOffInd")
    private String nsfOnOffInd;
    @JsonProperty("docAmt")
    private String docAmt;
    @JsonProperty("editDeferInd")
    private String editDeferInd;
    @JsonProperty("distribAmt")
    private String distribAmt;
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
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_SEQ_NUM")
    private Double seqNum;
    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String ruclCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
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
     * Index
     * <p>
     * Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
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
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_FUND_CODE")
    private String fundCode;
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
     * Orgn
     * <p>
     * Lineage reference object : FGBJVCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ORGN_CODE")
    private String orgnCode;
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
     * Prog
     * <p>
     * Lineage reference object : FGBJVCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_PROG_CODE")
    private String progCode;
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
     * Deposit
     * <p>
     * Lineage reference object : FGBJVCD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DEP_NUM")
    private String depNum;
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
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_AMT")
    private Double transAmt;
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
     * Budget Period
     * <p>
     * Lineage reference object : FGBJVCD_BUDGET_PERIOD
     * 
     */
    @JsonProperty("budgetPeriod")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_BUDGET_PERIOD")
    private String budgetPeriod;
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
     * Item Number
     * <p>
     * Lineage reference object : FGBJVCD_ENCD_ITEM_NUM
     * 
     */
    @JsonProperty("encdItemNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ENCD_ITEM_NUM")
    private Double encdItemNum;
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
     * NSF Override
     * <p>
     * Lineage reference object : FGBJVCD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ABAL_OVERRIDE")
    private String abalOverride;
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
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_TRANS_DESC")
    private String transDesc;
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
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("giftDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_GIFT_DATE")
    private Date giftDate;
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
     * Number of Units
     * <p>
     * Lineage reference object : FGBJVCD_EMC_UNITS
     * 
     */
    @JsonProperty("emcUnits")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_EMC_UNITS")
    private Double emcUnits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public JournalVoucherEntry100QapiPost withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    @JsonProperty("submissionNumber")
    public String getSubmissionNumber() {
        return submissionNumber;
    }

    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(String submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public JournalVoucherEntry100QapiPost withSubmissionNumber(String submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    @JsonProperty("transDate")
    public String getTransDate() {
        return transDate;
    }

    @JsonProperty("transDate")
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public JournalVoucherEntry100QapiPost withTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public JournalVoucherEntry100QapiPost withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    @JsonProperty("docAmt")
    public String getDocAmt() {
        return docAmt;
    }

    @JsonProperty("docAmt")
    public void setDocAmt(String docAmt) {
        this.docAmt = docAmt;
    }

    public JournalVoucherEntry100QapiPost withDocAmt(String docAmt) {
        this.docAmt = docAmt;
        return this;
    }

    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public JournalVoucherEntry100QapiPost withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    @JsonProperty("distribAmt")
    public String getDistribAmt() {
        return distribAmt;
    }

    @JsonProperty("distribAmt")
    public void setDistribAmt(String distribAmt) {
        this.distribAmt = distribAmt;
    }

    public JournalVoucherEntry100QapiPost withDistribAmt(String distribAmt) {
        this.distribAmt = distribAmt;
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

    public JournalVoucherEntry100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBJVCD_SEQ_NUM
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
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public JournalVoucherEntry100QapiPost withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBJVCD_RUCL_CODE, Lookup lineage reference object : ftvrucl
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
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public JournalVoucherEntry100QapiPost withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBJVCD_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public JournalVoucherEntry100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public JournalVoucherEntry100QapiPost withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public JournalVoucherEntry100QapiPost withAcciCode(String acciCode) {
        this.acciCode = acciCode;
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

    public JournalVoucherEntry100QapiPost withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public JournalVoucherEntry100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public JournalVoucherEntry100QapiPost withPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
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

    public JournalVoucherEntry100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public JournalVoucherEntry100QapiPost withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public JournalVoucherEntry100QapiPost withProgCode(String progCode) {
        this.progCode = progCode;
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

    public JournalVoucherEntry100QapiPost withDistPct(Double distPct) {
        this.distPct = distPct;
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

    public JournalVoucherEntry100QapiPost withDepNum(String depNum) {
        this.depNum = depNum;
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

    public JournalVoucherEntry100QapiPost withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_AMT
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
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public JournalVoucherEntry100QapiPost withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
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

    public JournalVoucherEntry100QapiPost withEncbNum(String encbNum) {
        this.encbNum = encbNum;
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

    public JournalVoucherEntry100QapiPost withBudgetPeriod(String budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
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

    public JournalVoucherEntry100QapiPost withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
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

    public JournalVoucherEntry100QapiPost withEncdItemNum(Double encdItemNum) {
        this.encdItemNum = encdItemNum;
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

    public JournalVoucherEntry100QapiPost withAccrualInd(String accrualInd) {
        this.accrualInd = accrualInd;
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

    public JournalVoucherEntry100QapiPost withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
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

    public JournalVoucherEntry100QapiPost withEncdSeqNum(Double encdSeqNum) {
        this.encdSeqNum = encdSeqNum;
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

    public JournalVoucherEntry100QapiPost withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBJVCD_TRANS_DESC
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
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public JournalVoucherEntry100QapiPost withTransDesc(String transDesc) {
        this.transDesc = transDesc;
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

    public JournalVoucherEntry100QapiPost withEncbActionInd(String encbActionInd) {
        this.encbActionInd = encbActionInd;
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

    public JournalVoucherEntry100QapiPost withGiftDate(Date giftDate) {
        this.giftDate = giftDate;
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

    public JournalVoucherEntry100QapiPost withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public JournalVoucherEntry100QapiPost withEmcUnits(Double emcUnits) {
        this.emcUnits = emcUnits;
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

    public JournalVoucherEntry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherEntry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("distribAmt");
        sb.append('=');
        sb.append(((this.distribAmt == null)?"<null>":this.distribAmt));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("distPct");
        sb.append('=');
        sb.append(((this.distPct == null)?"<null>":this.distPct));
        sb.append(',');
        sb.append("depNum");
        sb.append('=');
        sb.append(((this.depNum == null)?"<null>":this.depNum));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("encbNum");
        sb.append('=');
        sb.append(((this.encbNum == null)?"<null>":this.encbNum));
        sb.append(',');
        sb.append("budgetPeriod");
        sb.append('=');
        sb.append(((this.budgetPeriod == null)?"<null>":this.budgetPeriod));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("encdItemNum");
        sb.append('=');
        sb.append(((this.encdItemNum == null)?"<null>":this.encdItemNum));
        sb.append(',');
        sb.append("accrualInd");
        sb.append('=');
        sb.append(((this.accrualInd == null)?"<null>":this.accrualInd));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("encdSeqNum");
        sb.append('=');
        sb.append(((this.encdSeqNum == null)?"<null>":this.encdSeqNum));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("encbActionInd");
        sb.append('=');
        sb.append(((this.encbActionInd == null)?"<null>":this.encbActionInd));
        sb.append(',');
        sb.append("giftDate");
        sb.append('=');
        sb.append(((this.giftDate == null)?"<null>":this.giftDate));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("emcUnits");
        sb.append('=');
        sb.append(((this.emcUnits == null)?"<null>":this.emcUnits));
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
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.budgetPeriod == null)? 0 :this.budgetPeriod.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.encdItemNum == null)? 0 :this.encdItemNum.hashCode()));
        result = ((result* 31)+((this.distribAmt == null)? 0 :this.distribAmt.hashCode()));
        result = ((result* 31)+((this.encdSeqNum == null)? 0 :this.encdSeqNum.hashCode()));
        result = ((result* 31)+((this.emcUnits == null)? 0 :this.emcUnits.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.accrualInd == null)? 0 :this.accrualInd.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.giftDate == null)? 0 :this.giftDate.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.encbNum == null)? 0 :this.encbNum.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.encbActionInd == null)? 0 :this.encbActionInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JournalVoucherEntry100QapiPost) == false) {
            return false;
        }
        JournalVoucherEntry100QapiPost rhs = ((JournalVoucherEntry100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((((((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.budgetPeriod == rhs.budgetPeriod)||((this.budgetPeriod!= null)&&this.budgetPeriod.equals(rhs.budgetPeriod))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.encdItemNum == rhs.encdItemNum)||((this.encdItemNum!= null)&&this.encdItemNum.equals(rhs.encdItemNum))))&&((this.distribAmt == rhs.distribAmt)||((this.distribAmt!= null)&&this.distribAmt.equals(rhs.distribAmt))))&&((this.encdSeqNum == rhs.encdSeqNum)||((this.encdSeqNum!= null)&&this.encdSeqNum.equals(rhs.encdSeqNum))))&&((this.emcUnits == rhs.emcUnits)||((this.emcUnits!= null)&&this.emcUnits.equals(rhs.emcUnits))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.accrualInd == rhs.accrualInd)||((this.accrualInd!= null)&&this.accrualInd.equals(rhs.accrualInd))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.giftDate == rhs.giftDate)||((this.giftDate!= null)&&this.giftDate.equals(rhs.giftDate))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.encbNum == rhs.encbNum)||((this.encbNum!= null)&&this.encbNum.equals(rhs.encbNum))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.encbActionInd == rhs.encbActionInd)||((this.encbActionInd!= null)&&this.encbActionInd.equals(rhs.encbActionInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))));
    }

}
