
package com.ellucian.generated.bpapi.ban.applicant_pell_grant.v1_0_0;

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
    "pellSchedAwd",
    "aprdSeqNo",
    "sarSsn",
    "pellLtHalfCoa",
    "priSarPgi",
    "displayVerificationPrtyDesc",
    "aprdAlgoCodePell",
    "displaySarInit",
    "pellBudget",
    "displayVerComplete",
    "aprdCode",
    "rcrapp1VerificationPrty",
    "aprdSeqNoPell",
    "pellPaid",
    "acgDisbLockInd",
    "pellAttendCost",
    "verPayInd",
    "displayAprdCodePell",
    "pellDisbLockInd",
    "displayRtvaprdAprdPellDesc",
    "secSysPgi",
    "displayAprdCode",
    "priSysPgi",
    "aprdCodePell",
    "sarDate",
    "sarTranNo",
    "rcrapp1VerificationMsg",
    "expDisb",
    "secSarPgi",
    "displayRtvaprdAprdDesc",
    "aprdAlgoCode",
    "smartDisbLockInd",
    "addlPellEligInd",
    "autoZeroEfcInd"
})
@Generated("jsonschema2pojo")
public class ApplicantPellGrant100GetResponse {

    /**
     * Scheduled Award
     * <p>
     * Lineage reference object : RORSTAT_PELL_SCHED_AWD
     * 
     */
    @JsonProperty("pellSchedAwd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_SCHED_AWD")
    private Double pellSchedAwd;
    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO
     * 
     */
    @JsonProperty("aprdSeqNo")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_SEQ_NO")
    private Double aprdSeqNo;
    @JsonProperty("sarSsn")
    private String sarSsn;
    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_LT_HALF_COA")
    private Double pellLtHalfCoa;
    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PRI_SAR_PGI")
    private Double priSarPgi;
    @JsonProperty("displayVerificationPrtyDesc")
    private String displayVerificationPrtyDesc;
    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE_PELL
     * 
     */
    @JsonProperty("aprdAlgoCodePell")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_ALGO_CODE_PELL")
    private String aprdAlgoCodePell;
    @JsonProperty("displaySarInit")
    private String displaySarInit;
    /**
     * Pell Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("pellBudget")
    private Double pellBudget;
    /**
     * Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVerComplete")
    private String displayVerComplete;
    /**
     * Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE
     * 
     */
    @JsonProperty("aprdCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_CODE")
    private String aprdCode;
    /**
     * Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    private String rcrapp1VerificationPrty;
    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO_PELL
     * 
     */
    @JsonProperty("aprdSeqNoPell")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_SEQ_NO_PELL")
    private Double aprdSeqNoPell;
    /**
     * Amount Paid to Date
     * <p>
     * 
     * 
     */
    @JsonProperty("pellPaid")
    private Double pellPaid;
    /**
     * Lock ACG Disbursement
     * <p>
     * Lineage reference object : RORSTAT_ACG_DISB_LOCK_IND
     * 
     */
    @JsonProperty("acgDisbLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_ACG_DISB_LOCK_IND")
    private String acgDisbLockInd;
    /**
     * Pell FTFY Cost of Attendance
     * <p>
     * Lineage reference object : RORSTAT_PELL_ATTEND_COST
     * 
     */
    @JsonProperty("pellAttendCost")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_ATTEND_COST")
    private Double pellAttendCost;
    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_VER_PAY_IND")
    private String verPayInd;
    /**
     * Pell Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCodePell")
    private String displayAprdCodePell;
    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND")
    private String pellDisbLockInd;
    @JsonProperty("displayRtvaprdAprdPellDesc")
    private String displayRtvaprdAprdPellDesc;
    /**
     * Secondary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("secSysPgi")
    private Double secSysPgi;
    /**
     * Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCode")
    private String displayAprdCode;
    /**
     * Primary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("priSysPgi")
    private Double priSysPgi;
    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd")
    private String aprdCodePell;
    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SAR_DATE")
    private Date sarDate;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SAR_TRAN_NO")
    private String sarTranNo;
    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    private String rcrapp1VerificationMsg;
    /**
     * Expected Disbursement
     * <p>
     * 
     * 
     */
    @JsonProperty("expDisb")
    private Double expDisb;
    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SEC_SAR_PGI")
    private Double secSarPgi;
    @JsonProperty("displayRtvaprdAprdDesc")
    private String displayRtvaprdAprdDesc;
    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE
     * 
     */
    @JsonProperty("aprdAlgoCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_ALGO_CODE")
    private String aprdAlgoCode;
    /**
     * Lock SMART Disbursement
     * <p>
     * Lineage reference object : RORSTAT_SMART_DISB_LOCK_IND
     * 
     */
    @JsonProperty("smartDisbLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SMART_DISB_LOCK_IND")
    private String smartDisbLockInd;
    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND")
    private String addlPellEligInd;
    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND")
    private String autoZeroEfcInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Scheduled Award
     * <p>
     * Lineage reference object : RORSTAT_PELL_SCHED_AWD
     * 
     */
    @JsonProperty("pellSchedAwd")
    public Double getPellSchedAwd() {
        return pellSchedAwd;
    }

    /**
     * Scheduled Award
     * <p>
     * Lineage reference object : RORSTAT_PELL_SCHED_AWD
     * 
     */
    @JsonProperty("pellSchedAwd")
    public void setPellSchedAwd(Double pellSchedAwd) {
        this.pellSchedAwd = pellSchedAwd;
    }

    public ApplicantPellGrant100GetResponse withPellSchedAwd(Double pellSchedAwd) {
        this.pellSchedAwd = pellSchedAwd;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO
     * 
     */
    @JsonProperty("aprdSeqNo")
    public Double getAprdSeqNo() {
        return aprdSeqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO
     * 
     */
    @JsonProperty("aprdSeqNo")
    public void setAprdSeqNo(Double aprdSeqNo) {
        this.aprdSeqNo = aprdSeqNo;
    }

    public ApplicantPellGrant100GetResponse withAprdSeqNo(Double aprdSeqNo) {
        this.aprdSeqNo = aprdSeqNo;
        return this;
    }

    @JsonProperty("sarSsn")
    public String getSarSsn() {
        return sarSsn;
    }

    @JsonProperty("sarSsn")
    public void setSarSsn(String sarSsn) {
        this.sarSsn = sarSsn;
    }

    public ApplicantPellGrant100GetResponse withSarSsn(String sarSsn) {
        this.sarSsn = sarSsn;
        return this;
    }

    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    public Double getPellLtHalfCoa() {
        return pellLtHalfCoa;
    }

    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    public void setPellLtHalfCoa(Double pellLtHalfCoa) {
        this.pellLtHalfCoa = pellLtHalfCoa;
    }

    public ApplicantPellGrant100GetResponse withPellLtHalfCoa(Double pellLtHalfCoa) {
        this.pellLtHalfCoa = pellLtHalfCoa;
        return this;
    }

    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    public Double getPriSarPgi() {
        return priSarPgi;
    }

    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    public void setPriSarPgi(Double priSarPgi) {
        this.priSarPgi = priSarPgi;
    }

    public ApplicantPellGrant100GetResponse withPriSarPgi(Double priSarPgi) {
        this.priSarPgi = priSarPgi;
        return this;
    }

    @JsonProperty("displayVerificationPrtyDesc")
    public String getDisplayVerificationPrtyDesc() {
        return displayVerificationPrtyDesc;
    }

    @JsonProperty("displayVerificationPrtyDesc")
    public void setDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
    }

    public ApplicantPellGrant100GetResponse withDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
        return this;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE_PELL
     * 
     */
    @JsonProperty("aprdAlgoCodePell")
    public String getAprdAlgoCodePell() {
        return aprdAlgoCodePell;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE_PELL
     * 
     */
    @JsonProperty("aprdAlgoCodePell")
    public void setAprdAlgoCodePell(String aprdAlgoCodePell) {
        this.aprdAlgoCodePell = aprdAlgoCodePell;
    }

    public ApplicantPellGrant100GetResponse withAprdAlgoCodePell(String aprdAlgoCodePell) {
        this.aprdAlgoCodePell = aprdAlgoCodePell;
        return this;
    }

    @JsonProperty("displaySarInit")
    public String getDisplaySarInit() {
        return displaySarInit;
    }

    @JsonProperty("displaySarInit")
    public void setDisplaySarInit(String displaySarInit) {
        this.displaySarInit = displaySarInit;
    }

    public ApplicantPellGrant100GetResponse withDisplaySarInit(String displaySarInit) {
        this.displaySarInit = displaySarInit;
        return this;
    }

    /**
     * Pell Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("pellBudget")
    public Double getPellBudget() {
        return pellBudget;
    }

    /**
     * Pell Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("pellBudget")
    public void setPellBudget(Double pellBudget) {
        this.pellBudget = pellBudget;
    }

    public ApplicantPellGrant100GetResponse withPellBudget(Double pellBudget) {
        this.pellBudget = pellBudget;
        return this;
    }

    /**
     * Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVerComplete")
    public String getDisplayVerComplete() {
        return displayVerComplete;
    }

    /**
     * Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVerComplete")
    public void setDisplayVerComplete(String displayVerComplete) {
        this.displayVerComplete = displayVerComplete;
    }

    public ApplicantPellGrant100GetResponse withDisplayVerComplete(String displayVerComplete) {
        this.displayVerComplete = displayVerComplete;
        return this;
    }

    /**
     * Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE
     * 
     */
    @JsonProperty("aprdCode")
    public String getAprdCode() {
        return aprdCode;
    }

    /**
     * Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE
     * 
     */
    @JsonProperty("aprdCode")
    public void setAprdCode(String aprdCode) {
        this.aprdCode = aprdCode;
    }

    public ApplicantPellGrant100GetResponse withAprdCode(String aprdCode) {
        this.aprdCode = aprdCode;
        return this;
    }

    /**
     * Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    public String getRcrapp1VerificationPrty() {
        return rcrapp1VerificationPrty;
    }

    /**
     * Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    public void setRcrapp1VerificationPrty(String rcrapp1VerificationPrty) {
        this.rcrapp1VerificationPrty = rcrapp1VerificationPrty;
    }

    public ApplicantPellGrant100GetResponse withRcrapp1VerificationPrty(String rcrapp1VerificationPrty) {
        this.rcrapp1VerificationPrty = rcrapp1VerificationPrty;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO_PELL
     * 
     */
    @JsonProperty("aprdSeqNoPell")
    public Double getAprdSeqNoPell() {
        return aprdSeqNoPell;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_APRD_SEQ_NO_PELL
     * 
     */
    @JsonProperty("aprdSeqNoPell")
    public void setAprdSeqNoPell(Double aprdSeqNoPell) {
        this.aprdSeqNoPell = aprdSeqNoPell;
    }

    public ApplicantPellGrant100GetResponse withAprdSeqNoPell(Double aprdSeqNoPell) {
        this.aprdSeqNoPell = aprdSeqNoPell;
        return this;
    }

    /**
     * Amount Paid to Date
     * <p>
     * 
     * 
     */
    @JsonProperty("pellPaid")
    public Double getPellPaid() {
        return pellPaid;
    }

    /**
     * Amount Paid to Date
     * <p>
     * 
     * 
     */
    @JsonProperty("pellPaid")
    public void setPellPaid(Double pellPaid) {
        this.pellPaid = pellPaid;
    }

    public ApplicantPellGrant100GetResponse withPellPaid(Double pellPaid) {
        this.pellPaid = pellPaid;
        return this;
    }

    /**
     * Lock ACG Disbursement
     * <p>
     * Lineage reference object : RORSTAT_ACG_DISB_LOCK_IND
     * 
     */
    @JsonProperty("acgDisbLockInd")
    public String getAcgDisbLockInd() {
        return acgDisbLockInd;
    }

    /**
     * Lock ACG Disbursement
     * <p>
     * Lineage reference object : RORSTAT_ACG_DISB_LOCK_IND
     * 
     */
    @JsonProperty("acgDisbLockInd")
    public void setAcgDisbLockInd(String acgDisbLockInd) {
        this.acgDisbLockInd = acgDisbLockInd;
    }

    public ApplicantPellGrant100GetResponse withAcgDisbLockInd(String acgDisbLockInd) {
        this.acgDisbLockInd = acgDisbLockInd;
        return this;
    }

    /**
     * Pell FTFY Cost of Attendance
     * <p>
     * Lineage reference object : RORSTAT_PELL_ATTEND_COST
     * 
     */
    @JsonProperty("pellAttendCost")
    public Double getPellAttendCost() {
        return pellAttendCost;
    }

    /**
     * Pell FTFY Cost of Attendance
     * <p>
     * Lineage reference object : RORSTAT_PELL_ATTEND_COST
     * 
     */
    @JsonProperty("pellAttendCost")
    public void setPellAttendCost(Double pellAttendCost) {
        this.pellAttendCost = pellAttendCost;
    }

    public ApplicantPellGrant100GetResponse withPellAttendCost(Double pellAttendCost) {
        this.pellAttendCost = pellAttendCost;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    public String getVerPayInd() {
        return verPayInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    public void setVerPayInd(String verPayInd) {
        this.verPayInd = verPayInd;
    }

    public ApplicantPellGrant100GetResponse withVerPayInd(String verPayInd) {
        this.verPayInd = verPayInd;
        return this;
    }

    /**
     * Pell Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCodePell")
    public String getDisplayAprdCodePell() {
        return displayAprdCodePell;
    }

    /**
     * Pell Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCodePell")
    public void setDisplayAprdCodePell(String displayAprdCodePell) {
        this.displayAprdCodePell = displayAprdCodePell;
    }

    public ApplicantPellGrant100GetResponse withDisplayAprdCodePell(String displayAprdCodePell) {
        this.displayAprdCodePell = displayAprdCodePell;
        return this;
    }

    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    public String getPellDisbLockInd() {
        return pellDisbLockInd;
    }

    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    public void setPellDisbLockInd(String pellDisbLockInd) {
        this.pellDisbLockInd = pellDisbLockInd;
    }

    public ApplicantPellGrant100GetResponse withPellDisbLockInd(String pellDisbLockInd) {
        this.pellDisbLockInd = pellDisbLockInd;
        return this;
    }

    @JsonProperty("displayRtvaprdAprdPellDesc")
    public String getDisplayRtvaprdAprdPellDesc() {
        return displayRtvaprdAprdPellDesc;
    }

    @JsonProperty("displayRtvaprdAprdPellDesc")
    public void setDisplayRtvaprdAprdPellDesc(String displayRtvaprdAprdPellDesc) {
        this.displayRtvaprdAprdPellDesc = displayRtvaprdAprdPellDesc;
    }

    public ApplicantPellGrant100GetResponse withDisplayRtvaprdAprdPellDesc(String displayRtvaprdAprdPellDesc) {
        this.displayRtvaprdAprdPellDesc = displayRtvaprdAprdPellDesc;
        return this;
    }

    /**
     * Secondary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("secSysPgi")
    public Double getSecSysPgi() {
        return secSysPgi;
    }

    /**
     * Secondary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("secSysPgi")
    public void setSecSysPgi(Double secSysPgi) {
        this.secSysPgi = secSysPgi;
    }

    public ApplicantPellGrant100GetResponse withSecSysPgi(Double secSysPgi) {
        this.secSysPgi = secSysPgi;
        return this;
    }

    /**
     * Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCode")
    public String getDisplayAprdCode() {
        return displayAprdCode;
    }

    /**
     * Aid Period
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAprdCode")
    public void setDisplayAprdCode(String displayAprdCode) {
        this.displayAprdCode = displayAprdCode;
    }

    public ApplicantPellGrant100GetResponse withDisplayAprdCode(String displayAprdCode) {
        this.displayAprdCode = displayAprdCode;
        return this;
    }

    /**
     * Primary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("priSysPgi")
    public Double getPriSysPgi() {
        return priSysPgi;
    }

    /**
     * Primary Pell EFC
     * <p>
     * 
     * 
     */
    @JsonProperty("priSysPgi")
    public void setPriSysPgi(Double priSysPgi) {
        this.priSysPgi = priSysPgi;
    }

    public ApplicantPellGrant100GetResponse withPriSysPgi(Double priSysPgi) {
        this.priSysPgi = priSysPgi;
        return this;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    public String getAprdCodePell() {
        return aprdCodePell;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    public void setAprdCodePell(String aprdCodePell) {
        this.aprdCodePell = aprdCodePell;
    }

    public ApplicantPellGrant100GetResponse withAprdCodePell(String aprdCodePell) {
        this.aprdCodePell = aprdCodePell;
        return this;
    }

    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    public Date getSarDate() {
        return sarDate;
    }

    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    public void setSarDate(Date sarDate) {
        this.sarDate = sarDate;
    }

    public ApplicantPellGrant100GetResponse withSarDate(Date sarDate) {
        this.sarDate = sarDate;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    public String getSarTranNo() {
        return sarTranNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    public void setSarTranNo(String sarTranNo) {
        this.sarTranNo = sarTranNo;
    }

    public ApplicantPellGrant100GetResponse withSarTranNo(String sarTranNo) {
        this.sarTranNo = sarTranNo;
        return this;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public String getRcrapp1VerificationMsg() {
        return rcrapp1VerificationMsg;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public void setRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
    }

    public ApplicantPellGrant100GetResponse withRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
        return this;
    }

    /**
     * Expected Disbursement
     * <p>
     * 
     * 
     */
    @JsonProperty("expDisb")
    public Double getExpDisb() {
        return expDisb;
    }

    /**
     * Expected Disbursement
     * <p>
     * 
     * 
     */
    @JsonProperty("expDisb")
    public void setExpDisb(Double expDisb) {
        this.expDisb = expDisb;
    }

    public ApplicantPellGrant100GetResponse withExpDisb(Double expDisb) {
        this.expDisb = expDisb;
        return this;
    }

    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    public Double getSecSarPgi() {
        return secSarPgi;
    }

    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    public void setSecSarPgi(Double secSarPgi) {
        this.secSarPgi = secSarPgi;
    }

    public ApplicantPellGrant100GetResponse withSecSarPgi(Double secSarPgi) {
        this.secSarPgi = secSarPgi;
        return this;
    }

    @JsonProperty("displayRtvaprdAprdDesc")
    public String getDisplayRtvaprdAprdDesc() {
        return displayRtvaprdAprdDesc;
    }

    @JsonProperty("displayRtvaprdAprdDesc")
    public void setDisplayRtvaprdAprdDesc(String displayRtvaprdAprdDesc) {
        this.displayRtvaprdAprdDesc = displayRtvaprdAprdDesc;
    }

    public ApplicantPellGrant100GetResponse withDisplayRtvaprdAprdDesc(String displayRtvaprdAprdDesc) {
        this.displayRtvaprdAprdDesc = displayRtvaprdAprdDesc;
        return this;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE
     * 
     */
    @JsonProperty("aprdAlgoCode")
    public String getAprdAlgoCode() {
        return aprdAlgoCode;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_APRD_ALGO_CODE
     * 
     */
    @JsonProperty("aprdAlgoCode")
    public void setAprdAlgoCode(String aprdAlgoCode) {
        this.aprdAlgoCode = aprdAlgoCode;
    }

    public ApplicantPellGrant100GetResponse withAprdAlgoCode(String aprdAlgoCode) {
        this.aprdAlgoCode = aprdAlgoCode;
        return this;
    }

    /**
     * Lock SMART Disbursement
     * <p>
     * Lineage reference object : RORSTAT_SMART_DISB_LOCK_IND
     * 
     */
    @JsonProperty("smartDisbLockInd")
    public String getSmartDisbLockInd() {
        return smartDisbLockInd;
    }

    /**
     * Lock SMART Disbursement
     * <p>
     * Lineage reference object : RORSTAT_SMART_DISB_LOCK_IND
     * 
     */
    @JsonProperty("smartDisbLockInd")
    public void setSmartDisbLockInd(String smartDisbLockInd) {
        this.smartDisbLockInd = smartDisbLockInd;
    }

    public ApplicantPellGrant100GetResponse withSmartDisbLockInd(String smartDisbLockInd) {
        this.smartDisbLockInd = smartDisbLockInd;
        return this;
    }

    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    public String getAddlPellEligInd() {
        return addlPellEligInd;
    }

    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    public void setAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
    }

    public ApplicantPellGrant100GetResponse withAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
        return this;
    }

    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    public String getAutoZeroEfcInd() {
        return autoZeroEfcInd;
    }

    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    public void setAutoZeroEfcInd(String autoZeroEfcInd) {
        this.autoZeroEfcInd = autoZeroEfcInd;
    }

    public ApplicantPellGrant100GetResponse withAutoZeroEfcInd(String autoZeroEfcInd) {
        this.autoZeroEfcInd = autoZeroEfcInd;
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

    public ApplicantPellGrant100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantPellGrant100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pellSchedAwd");
        sb.append('=');
        sb.append(((this.pellSchedAwd == null)?"<null>":this.pellSchedAwd));
        sb.append(',');
        sb.append("aprdSeqNo");
        sb.append('=');
        sb.append(((this.aprdSeqNo == null)?"<null>":this.aprdSeqNo));
        sb.append(',');
        sb.append("sarSsn");
        sb.append('=');
        sb.append(((this.sarSsn == null)?"<null>":this.sarSsn));
        sb.append(',');
        sb.append("pellLtHalfCoa");
        sb.append('=');
        sb.append(((this.pellLtHalfCoa == null)?"<null>":this.pellLtHalfCoa));
        sb.append(',');
        sb.append("priSarPgi");
        sb.append('=');
        sb.append(((this.priSarPgi == null)?"<null>":this.priSarPgi));
        sb.append(',');
        sb.append("displayVerificationPrtyDesc");
        sb.append('=');
        sb.append(((this.displayVerificationPrtyDesc == null)?"<null>":this.displayVerificationPrtyDesc));
        sb.append(',');
        sb.append("aprdAlgoCodePell");
        sb.append('=');
        sb.append(((this.aprdAlgoCodePell == null)?"<null>":this.aprdAlgoCodePell));
        sb.append(',');
        sb.append("displaySarInit");
        sb.append('=');
        sb.append(((this.displaySarInit == null)?"<null>":this.displaySarInit));
        sb.append(',');
        sb.append("pellBudget");
        sb.append('=');
        sb.append(((this.pellBudget == null)?"<null>":this.pellBudget));
        sb.append(',');
        sb.append("displayVerComplete");
        sb.append('=');
        sb.append(((this.displayVerComplete == null)?"<null>":this.displayVerComplete));
        sb.append(',');
        sb.append("aprdCode");
        sb.append('=');
        sb.append(((this.aprdCode == null)?"<null>":this.aprdCode));
        sb.append(',');
        sb.append("rcrapp1VerificationPrty");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationPrty == null)?"<null>":this.rcrapp1VerificationPrty));
        sb.append(',');
        sb.append("aprdSeqNoPell");
        sb.append('=');
        sb.append(((this.aprdSeqNoPell == null)?"<null>":this.aprdSeqNoPell));
        sb.append(',');
        sb.append("pellPaid");
        sb.append('=');
        sb.append(((this.pellPaid == null)?"<null>":this.pellPaid));
        sb.append(',');
        sb.append("acgDisbLockInd");
        sb.append('=');
        sb.append(((this.acgDisbLockInd == null)?"<null>":this.acgDisbLockInd));
        sb.append(',');
        sb.append("pellAttendCost");
        sb.append('=');
        sb.append(((this.pellAttendCost == null)?"<null>":this.pellAttendCost));
        sb.append(',');
        sb.append("verPayInd");
        sb.append('=');
        sb.append(((this.verPayInd == null)?"<null>":this.verPayInd));
        sb.append(',');
        sb.append("displayAprdCodePell");
        sb.append('=');
        sb.append(((this.displayAprdCodePell == null)?"<null>":this.displayAprdCodePell));
        sb.append(',');
        sb.append("pellDisbLockInd");
        sb.append('=');
        sb.append(((this.pellDisbLockInd == null)?"<null>":this.pellDisbLockInd));
        sb.append(',');
        sb.append("displayRtvaprdAprdPellDesc");
        sb.append('=');
        sb.append(((this.displayRtvaprdAprdPellDesc == null)?"<null>":this.displayRtvaprdAprdPellDesc));
        sb.append(',');
        sb.append("secSysPgi");
        sb.append('=');
        sb.append(((this.secSysPgi == null)?"<null>":this.secSysPgi));
        sb.append(',');
        sb.append("displayAprdCode");
        sb.append('=');
        sb.append(((this.displayAprdCode == null)?"<null>":this.displayAprdCode));
        sb.append(',');
        sb.append("priSysPgi");
        sb.append('=');
        sb.append(((this.priSysPgi == null)?"<null>":this.priSysPgi));
        sb.append(',');
        sb.append("aprdCodePell");
        sb.append('=');
        sb.append(((this.aprdCodePell == null)?"<null>":this.aprdCodePell));
        sb.append(',');
        sb.append("sarDate");
        sb.append('=');
        sb.append(((this.sarDate == null)?"<null>":this.sarDate));
        sb.append(',');
        sb.append("sarTranNo");
        sb.append('=');
        sb.append(((this.sarTranNo == null)?"<null>":this.sarTranNo));
        sb.append(',');
        sb.append("rcrapp1VerificationMsg");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationMsg == null)?"<null>":this.rcrapp1VerificationMsg));
        sb.append(',');
        sb.append("expDisb");
        sb.append('=');
        sb.append(((this.expDisb == null)?"<null>":this.expDisb));
        sb.append(',');
        sb.append("secSarPgi");
        sb.append('=');
        sb.append(((this.secSarPgi == null)?"<null>":this.secSarPgi));
        sb.append(',');
        sb.append("displayRtvaprdAprdDesc");
        sb.append('=');
        sb.append(((this.displayRtvaprdAprdDesc == null)?"<null>":this.displayRtvaprdAprdDesc));
        sb.append(',');
        sb.append("aprdAlgoCode");
        sb.append('=');
        sb.append(((this.aprdAlgoCode == null)?"<null>":this.aprdAlgoCode));
        sb.append(',');
        sb.append("smartDisbLockInd");
        sb.append('=');
        sb.append(((this.smartDisbLockInd == null)?"<null>":this.smartDisbLockInd));
        sb.append(',');
        sb.append("addlPellEligInd");
        sb.append('=');
        sb.append(((this.addlPellEligInd == null)?"<null>":this.addlPellEligInd));
        sb.append(',');
        sb.append("autoZeroEfcInd");
        sb.append('=');
        sb.append(((this.autoZeroEfcInd == null)?"<null>":this.autoZeroEfcInd));
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
        result = ((result* 31)+((this.pellSchedAwd == null)? 0 :this.pellSchedAwd.hashCode()));
        result = ((result* 31)+((this.aprdSeqNo == null)? 0 :this.aprdSeqNo.hashCode()));
        result = ((result* 31)+((this.sarSsn == null)? 0 :this.sarSsn.hashCode()));
        result = ((result* 31)+((this.pellLtHalfCoa == null)? 0 :this.pellLtHalfCoa.hashCode()));
        result = ((result* 31)+((this.priSarPgi == null)? 0 :this.priSarPgi.hashCode()));
        result = ((result* 31)+((this.displayVerificationPrtyDesc == null)? 0 :this.displayVerificationPrtyDesc.hashCode()));
        result = ((result* 31)+((this.aprdAlgoCodePell == null)? 0 :this.aprdAlgoCodePell.hashCode()));
        result = ((result* 31)+((this.displaySarInit == null)? 0 :this.displaySarInit.hashCode()));
        result = ((result* 31)+((this.pellBudget == null)? 0 :this.pellBudget.hashCode()));
        result = ((result* 31)+((this.displayVerComplete == null)? 0 :this.displayVerComplete.hashCode()));
        result = ((result* 31)+((this.aprdCode == null)? 0 :this.aprdCode.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationPrty == null)? 0 :this.rcrapp1VerificationPrty.hashCode()));
        result = ((result* 31)+((this.aprdSeqNoPell == null)? 0 :this.aprdSeqNoPell.hashCode()));
        result = ((result* 31)+((this.pellPaid == null)? 0 :this.pellPaid.hashCode()));
        result = ((result* 31)+((this.acgDisbLockInd == null)? 0 :this.acgDisbLockInd.hashCode()));
        result = ((result* 31)+((this.pellAttendCost == null)? 0 :this.pellAttendCost.hashCode()));
        result = ((result* 31)+((this.verPayInd == null)? 0 :this.verPayInd.hashCode()));
        result = ((result* 31)+((this.displayAprdCodePell == null)? 0 :this.displayAprdCodePell.hashCode()));
        result = ((result* 31)+((this.pellDisbLockInd == null)? 0 :this.pellDisbLockInd.hashCode()));
        result = ((result* 31)+((this.displayRtvaprdAprdPellDesc == null)? 0 :this.displayRtvaprdAprdPellDesc.hashCode()));
        result = ((result* 31)+((this.secSysPgi == null)? 0 :this.secSysPgi.hashCode()));
        result = ((result* 31)+((this.displayAprdCode == null)? 0 :this.displayAprdCode.hashCode()));
        result = ((result* 31)+((this.priSysPgi == null)? 0 :this.priSysPgi.hashCode()));
        result = ((result* 31)+((this.aprdCodePell == null)? 0 :this.aprdCodePell.hashCode()));
        result = ((result* 31)+((this.sarDate == null)? 0 :this.sarDate.hashCode()));
        result = ((result* 31)+((this.sarTranNo == null)? 0 :this.sarTranNo.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationMsg == null)? 0 :this.rcrapp1VerificationMsg.hashCode()));
        result = ((result* 31)+((this.expDisb == null)? 0 :this.expDisb.hashCode()));
        result = ((result* 31)+((this.secSarPgi == null)? 0 :this.secSarPgi.hashCode()));
        result = ((result* 31)+((this.displayRtvaprdAprdDesc == null)? 0 :this.displayRtvaprdAprdDesc.hashCode()));
        result = ((result* 31)+((this.aprdAlgoCode == null)? 0 :this.aprdAlgoCode.hashCode()));
        result = ((result* 31)+((this.smartDisbLockInd == null)? 0 :this.smartDisbLockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addlPellEligInd == null)? 0 :this.addlPellEligInd.hashCode()));
        result = ((result* 31)+((this.autoZeroEfcInd == null)? 0 :this.autoZeroEfcInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantPellGrant100GetResponse) == false) {
            return false;
        }
        ApplicantPellGrant100GetResponse rhs = ((ApplicantPellGrant100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((this.pellSchedAwd == rhs.pellSchedAwd)||((this.pellSchedAwd!= null)&&this.pellSchedAwd.equals(rhs.pellSchedAwd)))&&((this.aprdSeqNo == rhs.aprdSeqNo)||((this.aprdSeqNo!= null)&&this.aprdSeqNo.equals(rhs.aprdSeqNo))))&&((this.sarSsn == rhs.sarSsn)||((this.sarSsn!= null)&&this.sarSsn.equals(rhs.sarSsn))))&&((this.pellLtHalfCoa == rhs.pellLtHalfCoa)||((this.pellLtHalfCoa!= null)&&this.pellLtHalfCoa.equals(rhs.pellLtHalfCoa))))&&((this.priSarPgi == rhs.priSarPgi)||((this.priSarPgi!= null)&&this.priSarPgi.equals(rhs.priSarPgi))))&&((this.displayVerificationPrtyDesc == rhs.displayVerificationPrtyDesc)||((this.displayVerificationPrtyDesc!= null)&&this.displayVerificationPrtyDesc.equals(rhs.displayVerificationPrtyDesc))))&&((this.aprdAlgoCodePell == rhs.aprdAlgoCodePell)||((this.aprdAlgoCodePell!= null)&&this.aprdAlgoCodePell.equals(rhs.aprdAlgoCodePell))))&&((this.displaySarInit == rhs.displaySarInit)||((this.displaySarInit!= null)&&this.displaySarInit.equals(rhs.displaySarInit))))&&((this.pellBudget == rhs.pellBudget)||((this.pellBudget!= null)&&this.pellBudget.equals(rhs.pellBudget))))&&((this.displayVerComplete == rhs.displayVerComplete)||((this.displayVerComplete!= null)&&this.displayVerComplete.equals(rhs.displayVerComplete))))&&((this.aprdCode == rhs.aprdCode)||((this.aprdCode!= null)&&this.aprdCode.equals(rhs.aprdCode))))&&((this.rcrapp1VerificationPrty == rhs.rcrapp1VerificationPrty)||((this.rcrapp1VerificationPrty!= null)&&this.rcrapp1VerificationPrty.equals(rhs.rcrapp1VerificationPrty))))&&((this.aprdSeqNoPell == rhs.aprdSeqNoPell)||((this.aprdSeqNoPell!= null)&&this.aprdSeqNoPell.equals(rhs.aprdSeqNoPell))))&&((this.pellPaid == rhs.pellPaid)||((this.pellPaid!= null)&&this.pellPaid.equals(rhs.pellPaid))))&&((this.acgDisbLockInd == rhs.acgDisbLockInd)||((this.acgDisbLockInd!= null)&&this.acgDisbLockInd.equals(rhs.acgDisbLockInd))))&&((this.pellAttendCost == rhs.pellAttendCost)||((this.pellAttendCost!= null)&&this.pellAttendCost.equals(rhs.pellAttendCost))))&&((this.verPayInd == rhs.verPayInd)||((this.verPayInd!= null)&&this.verPayInd.equals(rhs.verPayInd))))&&((this.displayAprdCodePell == rhs.displayAprdCodePell)||((this.displayAprdCodePell!= null)&&this.displayAprdCodePell.equals(rhs.displayAprdCodePell))))&&((this.pellDisbLockInd == rhs.pellDisbLockInd)||((this.pellDisbLockInd!= null)&&this.pellDisbLockInd.equals(rhs.pellDisbLockInd))))&&((this.displayRtvaprdAprdPellDesc == rhs.displayRtvaprdAprdPellDesc)||((this.displayRtvaprdAprdPellDesc!= null)&&this.displayRtvaprdAprdPellDesc.equals(rhs.displayRtvaprdAprdPellDesc))))&&((this.secSysPgi == rhs.secSysPgi)||((this.secSysPgi!= null)&&this.secSysPgi.equals(rhs.secSysPgi))))&&((this.displayAprdCode == rhs.displayAprdCode)||((this.displayAprdCode!= null)&&this.displayAprdCode.equals(rhs.displayAprdCode))))&&((this.priSysPgi == rhs.priSysPgi)||((this.priSysPgi!= null)&&this.priSysPgi.equals(rhs.priSysPgi))))&&((this.aprdCodePell == rhs.aprdCodePell)||((this.aprdCodePell!= null)&&this.aprdCodePell.equals(rhs.aprdCodePell))))&&((this.sarDate == rhs.sarDate)||((this.sarDate!= null)&&this.sarDate.equals(rhs.sarDate))))&&((this.sarTranNo == rhs.sarTranNo)||((this.sarTranNo!= null)&&this.sarTranNo.equals(rhs.sarTranNo))))&&((this.rcrapp1VerificationMsg == rhs.rcrapp1VerificationMsg)||((this.rcrapp1VerificationMsg!= null)&&this.rcrapp1VerificationMsg.equals(rhs.rcrapp1VerificationMsg))))&&((this.expDisb == rhs.expDisb)||((this.expDisb!= null)&&this.expDisb.equals(rhs.expDisb))))&&((this.secSarPgi == rhs.secSarPgi)||((this.secSarPgi!= null)&&this.secSarPgi.equals(rhs.secSarPgi))))&&((this.displayRtvaprdAprdDesc == rhs.displayRtvaprdAprdDesc)||((this.displayRtvaprdAprdDesc!= null)&&this.displayRtvaprdAprdDesc.equals(rhs.displayRtvaprdAprdDesc))))&&((this.aprdAlgoCode == rhs.aprdAlgoCode)||((this.aprdAlgoCode!= null)&&this.aprdAlgoCode.equals(rhs.aprdAlgoCode))))&&((this.smartDisbLockInd == rhs.smartDisbLockInd)||((this.smartDisbLockInd!= null)&&this.smartDisbLockInd.equals(rhs.smartDisbLockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addlPellEligInd == rhs.addlPellEligInd)||((this.addlPellEligInd!= null)&&this.addlPellEligInd.equals(rhs.addlPellEligInd))))&&((this.autoZeroEfcInd == rhs.autoZeroEfcInd)||((this.autoZeroEfcInd!= null)&&this.autoZeroEfcInd.equals(rhs.autoZeroEfcInd))));
    }

}
