
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
    "bankCode",
    "tgrpCode",
    "currCode",
    "documentNumber",
    "seqNum",
    "acciCode",
    "coasCode",
    "locnCode",
    "fgbcshdAbalOverride",
    "orgnCode",
    "acctCode",
    "fundCode",
    "vendor",
    "transDesc",
    "progCode",
    "transAmt",
    "abalOverride",
    "docRefNum",
    "displayTaxDesc",
    "actvCode",
    "distPct",
    "drCrInd",
    "depNum"
})
@Generated("jsonschema2pojo")
public class DirectCashReceipt100PostRequest {

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
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private Object documentNumber;
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
     * Locn
     * <p>
     * Lineage reference object : FGBCSHD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_LOCN_CODE")
    private String locnCode;
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
     * Orgn
     * <p>
     * Lineage reference object : FGBCSHD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ORGN_CODE")
    private String orgnCode;
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
    private Object vendor;
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
     * NSF Override
     * <p>
     * Lineage reference object : FGBCSHD_ABAL_OVERRIDE
     * 
     */
    @JsonProperty("abalOverride")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_ABAL_OVERRIDE")
    private String abalOverride;
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
     * Percent
     * <p>
     * Lineage reference object : FGBCSHD_DIST_PCT
     * 
     */
    @JsonProperty("distPct")
    @JsonPropertyDescription("Lineage reference object : FGBCSHD_DIST_PCT")
    private Double distPct;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public DirectCashReceipt100PostRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public DirectCashReceipt100PostRequest withTgrpCode(String tgrpCode) {
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

    public DirectCashReceipt100PostRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public Object getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
    }

    public DirectCashReceipt100PostRequest withDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
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

    public DirectCashReceipt100PostRequest withSeqNum(Double seqNum) {
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

    public DirectCashReceipt100PostRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
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

    public DirectCashReceipt100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public DirectCashReceipt100PostRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public DirectCashReceipt100PostRequest withFgbcshdAbalOverride(String fgbcshdAbalOverride) {
        this.fgbcshdAbalOverride = fgbcshdAbalOverride;
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

    public DirectCashReceipt100PostRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public DirectCashReceipt100PostRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public DirectCashReceipt100PostRequest withFundCode(String fundCode) {
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
    public Object getVendor() {
        return vendor;
    }

    /**
     * Vendor Code
     * <p>
     * Lineage reference object : keyBlockVendor
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public DirectCashReceipt100PostRequest withVendor(Object vendor) {
        this.vendor = vendor;
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

    public DirectCashReceipt100PostRequest withTransDesc(String transDesc) {
        this.transDesc = transDesc;
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

    public DirectCashReceipt100PostRequest withProgCode(String progCode) {
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

    public DirectCashReceipt100PostRequest withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
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

    public DirectCashReceipt100PostRequest withAbalOverride(String abalOverride) {
        this.abalOverride = abalOverride;
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

    public DirectCashReceipt100PostRequest withDocRefNum(String docRefNum) {
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

    public DirectCashReceipt100PostRequest withDisplayTaxDesc(String displayTaxDesc) {
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

    public DirectCashReceipt100PostRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public DirectCashReceipt100PostRequest withDistPct(Double distPct) {
        this.distPct = distPct;
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

    public DirectCashReceipt100PostRequest withDrCrInd(String drCrInd) {
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

    public DirectCashReceipt100PostRequest withDepNum(String depNum) {
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

    public DirectCashReceipt100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectCashReceipt100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
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
        sb.append("fgbcshdAbalOverride");
        sb.append('=');
        sb.append(((this.fgbcshdAbalOverride == null)?"<null>":this.fgbcshdAbalOverride));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("abalOverride");
        sb.append('=');
        sb.append(((this.abalOverride == null)?"<null>":this.abalOverride));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("displayTaxDesc");
        sb.append('=');
        sb.append(((this.displayTaxDesc == null)?"<null>":this.displayTaxDesc));
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
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.displayTaxDesc == null)? 0 :this.displayTaxDesc.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.depNum == null)? 0 :this.depNum.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.fgbcshdAbalOverride == null)? 0 :this.fgbcshdAbalOverride.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.abalOverride == null)? 0 :this.abalOverride.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distPct == null)? 0 :this.distPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectCashReceipt100PostRequest) == false) {
            return false;
        }
        DirectCashReceipt100PostRequest rhs = ((DirectCashReceipt100PostRequest) other);
        return (((((((((((((((((((((((((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.displayTaxDesc == rhs.displayTaxDesc)||((this.displayTaxDesc!= null)&&this.displayTaxDesc.equals(rhs.displayTaxDesc))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.depNum == rhs.depNum)||((this.depNum!= null)&&this.depNum.equals(rhs.depNum))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.fgbcshdAbalOverride == rhs.fgbcshdAbalOverride)||((this.fgbcshdAbalOverride!= null)&&this.fgbcshdAbalOverride.equals(rhs.fgbcshdAbalOverride))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.abalOverride == rhs.abalOverride)||((this.abalOverride!= null)&&this.abalOverride.equals(rhs.abalOverride))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distPct == rhs.distPct)||((this.distPct!= null)&&this.distPct.equals(rhs.distPct))));
    }

}
