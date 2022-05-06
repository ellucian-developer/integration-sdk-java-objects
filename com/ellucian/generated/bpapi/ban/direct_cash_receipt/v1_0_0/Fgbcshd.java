
package com.ellucian.generated.bpapi.ban.direct_cash_receipt.v1_0_0;

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
    "tgrpCode",
    "coasCode",
    "acctTitle",
    "locnCode",
    "orgnCode",
    "fundCode",
    "actvTitle",
    "statusInd",
    "progCode",
    "transAmt",
    "docRefNum",
    "displayTaxDesc",
    "locnTitle",
    "actvCode",
    "drCrInd",
    "depNum",
    "bankCode",
    "seqNum",
    "acciCode",
    "acctCode",
    "orgnTitle",
    "fsyrCode",
    "transDesc",
    "abalOverride",
    "acciTitle",
    "distPct",
    "coasTitle"
})
@Generated("jsonschema2pojo")
public class Fgbcshd {

    @JsonProperty("progTitle")
    private String progTitle;
    @JsonProperty("fundTitle")
    private String fundTitle;
    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    @JsonProperty("acctTitle")
    private String acctTitle;
    /**
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_LOCN_CODE")
    private String locnCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ORGN_CODE")
    private String orgnCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_FUND_CODE")
    private String fundCode;
    @JsonProperty("actvTitle")
    private String actvTitle;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_STATUS_IND")
    private String statusInd;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_PROG_CODE")
    private String progCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TRANS_AMT")
    private Double transAmt;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DOC_REF_NUM")
    private String docRefNum;
    @JsonProperty("displayTaxDesc")
    private String displayTaxDesc;
    @JsonProperty("locnTitle")
    private String locnTitle;
    /**
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACTV_CODE")
    private String actvCode;
    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DR_CR_IND")
    private String drCrInd;
    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DEP_NUM")
    private String depNum;
    /**
     * Bank
     * <p>
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBCSHD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_SEQ_NUM")
    private Double seqNum;
    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACCT_CODE")
    private String acctCode;
    @JsonProperty("orgnTitle")
    private String orgnTitle;
    /**
     * Year
     * <p>
     * Lineage reference object : FGBCSHD_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_FSYR_CODE")
    private String fsyrCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TRANS_DESC")
    private String transDesc;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ABAL_OVERRIDE")
    private String abalOverride;
    @JsonProperty("acciTitle")
    private String acciTitle;
    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DIST_PCT")
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

    public Fgbcshd withProgTitle(String progTitle) {
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

    public Fgbcshd withFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Fgbcshd withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public Fgbcshd withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Fgbcshd withCoasCode(String coasCode) {
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

    public Fgbcshd withAcctTitle(String acctTitle) {
        this.acctTitle = acctTitle;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public Fgbcshd withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public Fgbcshd withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Fgbcshd withFundCode(String fundCode) {
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

    public Fgbcshd withActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public Fgbcshd withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public Fgbcshd withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_AMT
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
     * Lineage reference object : FGBCSHD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public Fgbcshd withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public String getDocRefNum() {
        return docRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public void setDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
    }

    public Fgbcshd withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    @JsonProperty("displayTaxDesc")
    public String getDisplayTaxDesc() {
        return displayTaxDesc;
    }

    @JsonProperty("displayTaxDesc")
    public void setDisplayTaxDesc(String displayTaxDesc) {
        this.displayTaxDesc = displayTaxDesc;
    }

    public Fgbcshd withDisplayTaxDesc(String displayTaxDesc) {
        this.displayTaxDesc = displayTaxDesc;
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

    public Fgbcshd withLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public Fgbcshd withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public Fgbcshd withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
        return this;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    public String getDepNum() {
        return depNum;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("depNum")
    public void setDepNum(String depNum) {
        this.depNum = depNum;
    }

    public Fgbcshd withDepNum(String depNum) {
        this.depNum = depNum;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
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
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Fgbcshd withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBCSHD_SEQ_NUM
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
     * Lineage reference object : FGBCSHD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public Fgbcshd withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public Fgbcshd withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public Fgbcshd withAcctCode(String acctCode) {
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

    public Fgbcshd withOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FGBCSHD_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FGBCSHD_FSYR_CODE
     * 
     */
    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public Fgbcshd withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_DESC
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
     * Lineage reference object : FGBCSHD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public Fgbcshd withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    public String getAbalOverride() {
        return abalOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    public void setAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
    }

    public Fgbcshd withAbalOverride(String abalOverride) {
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

    public Fgbcshd withAcciTitle(String acciTitle) {
        this.acciTitle = acciTitle;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    public Double getDistPct() {
        return distPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    public void setDistPct(Double distPct) {
        this.distPct = distPct;
    }

    public Fgbcshd withDistPct(Double distPct) {
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

    public Fgbcshd withCoasTitle(String coasTitle) {
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

    public Fgbcshd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbcshd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
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
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("actvTitle");
        sb.append('=');
        sb.append(((this.actvTitle == null)?"<null>":this.actvTitle));
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
        sb.append("displayTaxDesc");
        sb.append('=');
        sb.append(((this.displayTaxDesc == null)?"<null>":this.displayTaxDesc));
        sb.append(',');
        sb.append("locnTitle");
        sb.append('=');
        sb.append(((this.locnTitle == null)?"<null>":this.locnTitle));
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
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
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
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
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
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctTitle == null)? 0 :this.acctTitle.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.actvTitle == null)? 0 :this.actvTitle.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.displayTaxDesc == null)? 0 :this.displayTaxDesc.hashCode()));
        result = ((result* 31)+((this.locnTitle == null)? 0 :this.locnTitle.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnTitle == null)? 0 :this.orgnTitle.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.acciTitle == null)? 0 :this.acciTitle.hashCode()));
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
        if ((other instanceof Fgbcshd) == false) {
            return false;
        }
        Fgbcshd rhs = ((Fgbcshd) other);
        return ((((((((((((((((((((((((((((((((this.progTitle == rhs.progTitle)||((this.progTitle!= null)&&this.progTitle.equals(rhs.progTitle)))&&((this.fundTitle == rhs.fundTitle)||((this.fundTitle!= null)&&this.fundTitle.equals(rhs.fundTitle))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctTitle == rhs.acctTitle)||((this.acctTitle!= null)&&this.acctTitle.equals(rhs.acctTitle))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.actvTitle == rhs.actvTitle)||((this.actvTitle!= null)&&this.actvTitle.equals(rhs.actvTitle))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.displayTaxDesc == rhs.displayTaxDesc)||((this.displayTaxDesc!= null)&&this.displayTaxDesc.equals(rhs.displayTaxDesc))))&&((this.locnTitle == rhs.locnTitle)||((this.locnTitle!= null)&&this.locnTitle.equals(rhs.locnTitle))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnTitle == rhs.orgnTitle)||((this.orgnTitle!= null)&&this.orgnTitle.equals(rhs.orgnTitle))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.acciTitle == rhs.acciTitle)||((this.acciTitle!= null)&&this.acciTitle.equals(rhs.acciTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))))&&((this.coasTitle == rhs.coasTitle)||((this.coasTitle!= null)&&this.coasTitle.equals(rhs.coasTitle))));
    }

}
