
package com.ellucian.generated.bpapi.ban.journal_voucher_mass_entry.v1_0_0;

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
    "currCode",
    "prjdCode",
    "giftDate",
    "seqNum",
    "acciCode",
    "coasCode",
    "locnCode",
    "acctCode",
    "orgnCode",
    "fundCode",
    "budgetPeriod",
    "statusInd",
    "transDesc",
    "abalOverride",
    "progCode",
    "transAmt",
    "ruclCode",
    "emcUnits",
    "actvCode",
    "distPct",
    "drCrInd",
    "depNum"
})
@Generated("jsonschema2pojo")
public class Fgbjvcd__1 {

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
     * Currency
     * <p>
     * Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
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
     * Gift Date
     * <p>
     * Lineage reference object : FGBJVCD_GIFT_DATE
     * 
     */
    @JsonProperty("giftDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_GIFT_DATE")
    private Date giftDate;
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
     * Acct
     * <p>
     * Lineage reference object : FGBJVCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_ACCT_CODE")
    private String acctCode;
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
     * Fund
     * <p>
     * Lineage reference object : FGBJVCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_FUND_CODE")
    private String fundCode;
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
     * Percent
     * <p>
     * Lineage reference object : FGBJVCD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    @JsonPropertyDescription("Lineage reference object : FGBJVCD_DIST_PCT")
    private Double distPct;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Fgbjvcd__1 withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public Fgbjvcd__1 withCurrCode(String currCode) {
        this.currCode = currCode;
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

    public Fgbjvcd__1 withPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
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

    public Fgbjvcd__1 withGiftDate(Date giftDate) {
        this.giftDate = giftDate;
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

    public Fgbjvcd__1 withSeqNum(Double seqNum) {
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

    public Fgbjvcd__1 withAcciCode(String acciCode) {
        this.acciCode = acciCode;
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

    public Fgbjvcd__1 withCoasCode(String coasCode) {
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

    public Fgbjvcd__1 withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public Fgbjvcd__1 withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public Fgbjvcd__1 withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public Fgbjvcd__1 withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public Fgbjvcd__1 withBudgetPeriod(String budgetPeriod) {
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

    public Fgbjvcd__1 withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public Fgbjvcd__1 withTransDesc(String transDesc) {
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

    public Fgbjvcd__1 withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
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

    public Fgbjvcd__1 withProgCode(String progCode) {
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

    public Fgbjvcd__1 withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
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

    public Fgbjvcd__1 withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
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

    public Fgbjvcd__1 withEmcUnits(Double emcUnits) {
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

    public Fgbjvcd__1 withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public Fgbjvcd__1 withDistPct(Double distPct) {
        this.distPct = distPct;
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

    public Fgbjvcd__1 withDrCrInd(String drCrInd) {
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

    public Fgbjvcd__1 withDepNum(String depNum) {
        this.depNum = depNum;
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

    public Fgbjvcd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbjvcd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
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
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("budgetPeriod");
        sb.append('=');
        sb.append(((this.budgetPeriod == null)?"<null>":this.budgetPeriod));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("emcUnits");
        sb.append('=');
        sb.append(((this.emcUnits == null)?"<null>":this.emcUnits));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("distPct");
        sb.append('=');
        sb.append(((this.distPct == null)?"<null>":this.distPct));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("depNum");
        sb.append('=');
        sb.append(((this.depNum == null)?"<null>":this.depNum));
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
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.budgetPeriod == null)? 0 :this.budgetPeriod.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.emcUnits == null)? 0 :this.emcUnits.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.giftDate == null)? 0 :this.giftDate.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbjvcd__1) == false) {
            return false;
        }
        Fgbjvcd__1 rhs = ((Fgbjvcd__1) other);
        return (((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.budgetPeriod == rhs.budgetPeriod)||((this.budgetPeriod!= null)&&this.budgetPeriod.equals(rhs.budgetPeriod))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.emcUnits == rhs.emcUnits)||((this.emcUnits!= null)&&this.emcUnits.equals(rhs.emcUnits))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.giftDate == rhs.giftDate)||((this.giftDate!= null)&&this.giftDate.equals(rhs.giftDate))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))));
    }

}
