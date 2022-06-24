
package com.ellucian.generated.bpapi.ban.direct_cash_receipt.v1_0_0;

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
    "criteria.distPct",
    "tgrpCode",
    "currCode",
    "criteria.statusInd",
    "criteria.transDesc",
    "documentNumber",
    "coasCode",
    "criteria.progCode",
    "locnCode",
    "orgnCode",
    "criteria.docRefNum",
    "criteria.displayTaxDesc",
    "criteria.acciCode",
    "criteria.depNum",
    "fundCode",
    "vendor",
    "transDate",
    "progCode",
    "transAmt",
    "criteria.transAmt",
    "docRefNum",
    "criteria.seqNum",
    "criteria.coasCode",
    "displayTaxDesc",
    "actvCode",
    "drCrInd",
    "depNum",
    "bankCode",
    "criteria.locnCode",
    "criteria.fundCode",
    "criteria.acctCode",
    "criteria.abalOverride",
    "seqNum",
    "acciCode",
    "criteria.actvCode",
    "fgbcshdAbalOverride",
    "acctCode",
    "criteria.drCrInd",
    "criteria.currCode",
    "criteria.tgrpCode",
    "transDesc",
    "abalOverride",
    "distPct",
    "criteria.orgnCode",
    "criteria.bankCode"
})
@Generated("jsonschema2pojo")
public class DirectCashReceipt100PutRequest {

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DIST_PCT")
    private Double criteriaDistPct;
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
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TRANS_DESC")
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
     * COA
     * <p>
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_PROG_CODE")
    private String criteriaProgCode;
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
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DOC_REF_NUM")
    private String criteriaDocRefNum;
    @JsonProperty("criteria.displayTaxDesc")
    private String criteriaDisplayTaxDesc;
    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String criteriaAcciCode;
    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DEP_NUM")
    private String criteriaDepNum;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_FUND_CODE")
    private String fundCode;
    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Lineage reference object : keyBlockVendor")
    private String vendor;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBCSHH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBCSHH_TRANS_DATE")
    private Date transDate;
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
     * Amount
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TRANS_AMT")
    private Double criteriaTransAmt;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DOC_REF_NUM")
    private String docRefNum;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBCSHD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_SEQ_NUM")
    private Double criteriaSeqNum;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    @JsonProperty("displayTaxDesc")
    private String displayTaxDesc;
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
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ABAL_OVERRIDE")
    private String criteriaAbalOverride;
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
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("fgbcshdAbalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ABAL_OVERRIDE")
    private String fgbcshdAbalOverride;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ACCT_CODE")
    private String acctCode;
    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DR_CR_IND")
    private String criteriaDrCrInd;
    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCode;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String criteriaTgrpCode;
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
    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DIST_PCT")
    private Double distPct;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Bank
     * <p>
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    public Double getCriteriaDistPct() {
        return criteriaDistPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("criteria.distPct")
    public void setCriteriaDistPct(Double criteriaDistPct) {
        this.criteriaDistPct = criteriaDistPct;
    }

    public DirectCashReceipt100PutRequest withCriteriaDistPct(Double criteriaDistPct) {
        this.criteriaDistPct = criteriaDistPct;
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

    public DirectCashReceipt100PutRequest withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
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

    public DirectCashReceipt100PutRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBCSHD_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public DirectCashReceipt100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_DESC
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
     * Lineage reference object : FGBCSHD_TRANS_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDesc")
    public void setCriteriaTransDesc(String criteriaTransDesc) {
        this.criteriaTransDesc = criteriaTransDesc;
    }

    public DirectCashReceipt100PutRequest withCriteriaTransDesc(String criteriaTransDesc) {
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

    public DirectCashReceipt100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public DirectCashReceipt100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBCSHD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
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

    public DirectCashReceipt100PutRequest withLocnCode(String locnCode) {
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

    public DirectCashReceipt100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    public String getCriteriaDocRefNum() {
        return criteriaDocRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBCSHD_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    public void setCriteriaDocRefNum(String criteriaDocRefNum) {
        this.criteriaDocRefNum = criteriaDocRefNum;
    }

    public DirectCashReceipt100PutRequest withCriteriaDocRefNum(String criteriaDocRefNum) {
        this.criteriaDocRefNum = criteriaDocRefNum;
        return this;
    }

    @JsonProperty("criteria.displayTaxDesc")
    public String getCriteriaDisplayTaxDesc() {
        return criteriaDisplayTaxDesc;
    }

    @JsonProperty("criteria.displayTaxDesc")
    public void setCriteriaDisplayTaxDesc(String criteriaDisplayTaxDesc) {
        this.criteriaDisplayTaxDesc = criteriaDisplayTaxDesc;
    }

    public DirectCashReceipt100PutRequest withCriteriaDisplayTaxDesc(String criteriaDisplayTaxDesc) {
        this.criteriaDisplayTaxDesc = criteriaDisplayTaxDesc;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBCSHD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    public String getCriteriaDepNum() {
        return criteriaDepNum;
    }

    /**
     * Deposit
     * <p>
     * Lineage reference object : FGBCSHD_DEP_NUM
     * 
     */
    @JsonProperty("criteria.depNum")
    public void setCriteriaDepNum(String criteriaDepNum) {
        this.criteriaDepNum = criteriaDepNum;
    }

    public DirectCashReceipt100PutRequest withCriteriaDepNum(String criteriaDepNum) {
        this.criteriaDepNum = criteriaDepNum;
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

    public DirectCashReceipt100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public DirectCashReceipt100PutRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBCSHH_TRANS_DATE
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
     * Lineage reference object : FGBCSHH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public DirectCashReceipt100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public DirectCashReceipt100PutRequest withProgCode(String progCode) {
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

    public DirectCashReceipt100PutRequest withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBCSHD_TRANS_AMT
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
     * Lineage reference object : FGBCSHD_TRANS_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.transAmt")
    public void setCriteriaTransAmt(Double criteriaTransAmt) {
        this.criteriaTransAmt = criteriaTransAmt;
    }

    public DirectCashReceipt100PutRequest withCriteriaTransAmt(Double criteriaTransAmt) {
        this.criteriaTransAmt = criteriaTransAmt;
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

    public DirectCashReceipt100PutRequest withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBCSHD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    public Double getCriteriaSeqNum() {
        return criteriaSeqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBCSHD_SEQ_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNum")
    public void setCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
    }

    public DirectCashReceipt100PutRequest withCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FGBCSHD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public DirectCashReceipt100PutRequest withDisplayTaxDesc(String displayTaxDesc) {
        this.displayTaxDesc = displayTaxDesc;
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

    public DirectCashReceipt100PutRequest withActvCode(String actvCode) {
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

    public DirectCashReceipt100PutRequest withDrCrInd(String drCrInd) {
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

    public DirectCashReceipt100PutRequest withDepNum(String depNum) {
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

    public DirectCashReceipt100PutRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBCSHD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBCSHD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    public String getCriteriaAbalOverride() {
        return criteriaAbalOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("criteria.abalOverride")
    public void setCriteriaAbalOverride(String criteriaAbalOverride) {
        this.criteriaAbalOverride = criteriaAbalOverride;
    }

    public DirectCashReceipt100PutRequest withCriteriaAbalOverride(String criteriaAbalOverride) {
        this.criteriaAbalOverride = criteriaAbalOverride;
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

    public DirectCashReceipt100PutRequest withSeqNum(Double seqNum) {
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

    public DirectCashReceipt100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBCSHD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("fgbcshdAbalOverride")
    public String getFgbcshdAbalOverride() {
        return fgbcshdAbalOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("fgbcshdAbalOverride")
    public void setFgbcshdAbalOverride(String fgbcshdAbalOverride) {
        this.fgbcshdAbalOverride = fgbcshdAbalOverride;
    }

    public DirectCashReceipt100PutRequest withFgbcshdAbalOverride(String fgbcshdAbalOverride) {
        this.fgbcshdAbalOverride = fgbcshdAbalOverride;
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

    public DirectCashReceipt100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    public String getCriteriaDrCrInd() {
        return criteriaDrCrInd;
    }

    /**
     * Debit/Credit
     * <p>
     * Lineage reference object : FGBCSHD_DR_CR_IND
     * 
     */
    @JsonProperty("criteria.drCrInd")
    public void setCriteriaDrCrInd(String criteriaDrCrInd) {
        this.criteriaDrCrInd = criteriaDrCrInd;
    }

    public DirectCashReceipt100PutRequest withCriteriaDrCrInd(String criteriaDrCrInd) {
        this.criteriaDrCrInd = criteriaDrCrInd;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public String getCriteriaCurrCode() {
        return criteriaCurrCode;
    }

    /**
     * Currency
     * <p>
     * Lineage reference object : FGBCSHD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("criteria.currCode")
    public void setCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaCurrCode(String criteriaCurrCode) {
        this.criteriaCurrCode = criteriaCurrCode;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public String getCriteriaTgrpCode() {
        return criteriaTgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FGBCSHD_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public void setCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
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

    public DirectCashReceipt100PutRequest withTransDesc(String transDesc) {
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

    public DirectCashReceipt100PutRequest withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
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

    public DirectCashReceipt100PutRequest withDistPct(Double distPct) {
        this.distPct = distPct;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
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
     * Lineage reference object : FGBCSHD_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public DirectCashReceipt100PutRequest withCriteriaBankCode(String criteriaBankCode) {
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

    public DirectCashReceipt100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectCashReceipt100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDistPct");
        sb.append('=');
        sb.append(((this.criteriaDistPct == null)?"<null>":this.criteriaDistPct));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaTransDesc");
        sb.append('=');
        sb.append(((this.criteriaTransDesc == null)?"<null>":this.criteriaTransDesc));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("criteriaDocRefNum");
        sb.append('=');
        sb.append(((this.criteriaDocRefNum == null)?"<null>":this.criteriaDocRefNum));
        sb.append(',');
        sb.append("criteriaDisplayTaxDesc");
        sb.append('=');
        sb.append(((this.criteriaDisplayTaxDesc == null)?"<null>":this.criteriaDisplayTaxDesc));
        sb.append(',');
        sb.append("criteriaAcciCode");
        sb.append('=');
        sb.append(((this.criteriaAcciCode == null)?"<null>":this.criteriaAcciCode));
        sb.append(',');
        sb.append("criteriaDepNum");
        sb.append('=');
        sb.append(((this.criteriaDepNum == null)?"<null>":this.criteriaDepNum));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
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
        sb.append("criteriaTransAmt");
        sb.append('=');
        sb.append(((this.criteriaTransAmt == null)?"<null>":this.criteriaTransAmt));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("criteriaSeqNum");
        sb.append('=');
        sb.append(((this.criteriaSeqNum == null)?"<null>":this.criteriaSeqNum));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("displayTaxDesc");
        sb.append('=');
        sb.append(((this.displayTaxDesc == null)?"<null>":this.displayTaxDesc));
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
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
        sb.append(',');
        sb.append("criteriaAbalOverride");
        sb.append('=');
        sb.append(((this.criteriaAbalOverride == null)?"<null>":this.criteriaAbalOverride));
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
        sb.append("fgbcshdAbalOverride");
        sb.append('=');
        sb.append(((this.fgbcshdAbalOverride == null)?"<null>":this.fgbcshdAbalOverride));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("criteriaDrCrInd");
        sb.append('=');
        sb.append(((this.criteriaDrCrInd == null)?"<null>":this.criteriaDrCrInd));
        sb.append(',');
        sb.append("criteriaCurrCode");
        sb.append('=');
        sb.append(((this.criteriaCurrCode == null)?"<null>":this.criteriaCurrCode));
        sb.append(',');
        sb.append("criteriaTgrpCode");
        sb.append('=');
        sb.append(((this.criteriaTgrpCode == null)?"<null>":this.criteriaTgrpCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("distPct");
        sb.append('=');
        sb.append(((this.distPct == null)?"<null>":this.distPct));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
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
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayTaxDesc == null)? 0 :this.criteriaDisplayTaxDesc.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.criteriaDepNum == null)? 0 :this.criteriaDepNum.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaTransDesc == null)? 0 :this.criteriaTransDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.criteriaAbalOverride == null)? 0 :this.criteriaAbalOverride.hashCode()));
        result = ((result* 31)+((this.displayTaxDesc == null)? 0 :this.displayTaxDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTransAmt == null)? 0 :this.criteriaTransAmt.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.criteriaDrCrInd == null)? 0 :this.criteriaDrCrInd.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNum == null)? 0 :this.criteriaSeqNum.hashCode()));
        result = ((result* 31)+((this.fgbcshdAbalOverride == null)? 0 :this.fgbcshdAbalOverride.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaDistPct == null)? 0 :this.criteriaDistPct.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCode == null)? 0 :this.criteriaCurrCode.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.criteriaTgrpCode == null)? 0 :this.criteriaTgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaDocRefNum == null)? 0 :this.criteriaDocRefNum.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectCashReceipt100PutRequest) == false) {
            return false;
        }
        DirectCashReceipt100PutRequest rhs = ((DirectCashReceipt100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.criteriaDisplayTaxDesc == rhs.criteriaDisplayTaxDesc)||((this.criteriaDisplayTaxDesc!= null)&&this.criteriaDisplayTaxDesc.equals(rhs.criteriaDisplayTaxDesc))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.criteriaDepNum == rhs.criteriaDepNum)||((this.criteriaDepNum!= null)&&this.criteriaDepNum.equals(rhs.criteriaDepNum))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaTransDesc == rhs.criteriaTransDesc)||((this.criteriaTransDesc!= null)&&this.criteriaTransDesc.equals(rhs.criteriaTransDesc))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.criteriaAbalOverride == rhs.criteriaAbalOverride)||((this.criteriaAbalOverride!= null)&&this.criteriaAbalOverride.equals(rhs.criteriaAbalOverride))))&&((this.displayTaxDesc == rhs.displayTaxDesc)||((this.displayTaxDesc!= null)&&this.displayTaxDesc.equals(rhs.displayTaxDesc))))&&((this.criteriaTransAmt == rhs.criteriaTransAmt)||((this.criteriaTransAmt!= null)&&this.criteriaTransAmt.equals(rhs.criteriaTransAmt))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.criteriaDrCrInd == rhs.criteriaDrCrInd)||((this.criteriaDrCrInd!= null)&&this.criteriaDrCrInd.equals(rhs.criteriaDrCrInd))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.criteriaSeqNum == rhs.criteriaSeqNum)||((this.criteriaSeqNum!= null)&&this.criteriaSeqNum.equals(rhs.criteriaSeqNum))))&&((this.fgbcshdAbalOverride == rhs.fgbcshdAbalOverride)||((this.fgbcshdAbalOverride!= null)&&this.fgbcshdAbalOverride.equals(rhs.fgbcshdAbalOverride))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaDistPct == rhs.criteriaDistPct)||((this.criteriaDistPct!= null)&&this.criteriaDistPct.equals(rhs.criteriaDistPct))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.criteriaCurrCode == rhs.criteriaCurrCode)||((this.criteriaCurrCode!= null)&&this.criteriaCurrCode.equals(rhs.criteriaCurrCode))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.criteriaTgrpCode == rhs.criteriaTgrpCode)||((this.criteriaTgrpCode!= null)&&this.criteriaTgrpCode.equals(rhs.criteriaTgrpCode))))&&((this.criteriaDocRefNum == rhs.criteriaDocRefNum)||((this.criteriaDocRefNum!= null)&&this.criteriaDocRefNum.equals(rhs.criteriaDocRefNum))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))));
    }

}
