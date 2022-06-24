
package com.ellucian.generated.bpapi.ban.fund_code_maintenance.v1_0_0;

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
    "restInd",
    "srcCapSameInd",
    "dataEntryInd",
    "fbalInd",
    "coasCode",
    "acctCodeRev",
    "title",
    "effDate",
    "fundCode",
    "acctCodePlant",
    "statusInd",
    "cashReceiptBankCode",
    "netAssetClass",
    "fundCodePred",
    "bankCode",
    "actvCodeDef",
    "grntCode",
    "expendEndDate",
    "orgnCodeDef",
    "locnCodeDef",
    "acctCodeAccr",
    "fmgrNm",
    "fundCodePlant",
    "ftvfmgrFmgrCode",
    "effCertRequiredInd",
    "termDate",
    "ftypCode",
    "progCodeDef"
})
@Generated("jsonschema2pojo")
public class FundCodeMaintenance100PostRequest {

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("restInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_REST_IND")
    private String restInd;
    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("srcCapSameInd")
    private String srcCapSameInd;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("fbalInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FBAL_IND")
    private String fbalInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("acctCodeRev")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_REV")
    private String acctCodeRev;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TITLE")
    private String title;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_DATE")
    private Date effDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE")
    private String fundCode;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("acctCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_PLANT")
    private String acctCodePlant;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_STATUS_IND")
    private String statusInd;
    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String cashReceiptBankCode;
    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClass")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_NET_ASSET_CLASS")
    private String netAssetClass;
    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("fundCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PRED")
    private String fundCodePred;
    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTV_CODE_DEF")
    private String actvCodeDef;
    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_GRNT_CODE")
    private String grntCode;
    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EXPEND_END_DATE")
    private Date expendEndDate;
    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ORGN_CODE_DEF")
    private String orgnCodeDef;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_LOCN_CODE_DEF")
    private String locnCodeDef;
    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("acctCodeAccr")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_ACCR")
    private String acctCodeAccr;
    @JsonProperty("fmgrNm")
    private String fmgrNm;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("fundCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PLANT")
    private String fundCodePlant;
    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCode")
    @JsonPropertyDescription("Lookup lineage reference object : spriden,ftvfmgr")
    private String ftvfmgrFmgrCode;
    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND")
    private String effCertRequiredInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TERM_DATE")
    private Date termDate;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String ftypCode;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_DEF")
    private String progCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("restInd")
    public String getRestInd() {
        return restInd;
    }

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("restInd")
    public void setRestInd(String restInd) {
        this.restInd = restInd;
    }

    public FundCodeMaintenance100PostRequest withRestInd(String restInd) {
        this.restInd = restInd;
        return this;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("srcCapSameInd")
    public String getSrcCapSameInd() {
        return srcCapSameInd;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("srcCapSameInd")
    public void setSrcCapSameInd(String srcCapSameInd) {
        this.srcCapSameInd = srcCapSameInd;
    }

    public FundCodeMaintenance100PostRequest withSrcCapSameInd(String srcCapSameInd) {
        this.srcCapSameInd = srcCapSameInd;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public FundCodeMaintenance100PostRequest withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("fbalInd")
    public String getFbalInd() {
        return fbalInd;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("fbalInd")
    public void setFbalInd(String fbalInd) {
        this.fbalInd = fbalInd;
    }

    public FundCodeMaintenance100PostRequest withFbalInd(String fbalInd) {
        this.fbalInd = fbalInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FundCodeMaintenance100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("acctCodeRev")
    public String getAcctCodeRev() {
        return acctCodeRev;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("acctCodeRev")
    public void setAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
    }

    public FundCodeMaintenance100PostRequest withAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FundCodeMaintenance100PostRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FundCodeMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public FundCodeMaintenance100PostRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("acctCodePlant")
    public String getAcctCodePlant() {
        return acctCodePlant;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("acctCodePlant")
    public void setAcctCodePlant(String acctCodePlant) {
        this.acctCodePlant = acctCodePlant;
    }

    public FundCodeMaintenance100PostRequest withAcctCodePlant(String acctCodePlant) {
        this.acctCodePlant = acctCodePlant;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FundCodeMaintenance100PostRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    public String getCashReceiptBankCode() {
        return cashReceiptBankCode;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    public void setCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
    }

    public FundCodeMaintenance100PostRequest withCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
        return this;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClass")
    public String getNetAssetClass() {
        return netAssetClass;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClass")
    public void setNetAssetClass(String netAssetClass) {
        this.netAssetClass = netAssetClass;
    }

    public FundCodeMaintenance100PostRequest withNetAssetClass(String netAssetClass) {
        this.netAssetClass = netAssetClass;
        return this;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("fundCodePred")
    public String getFundCodePred() {
        return fundCodePred;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("fundCodePred")
    public void setFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
    }

    public FundCodeMaintenance100PostRequest withFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public FundCodeMaintenance100PostRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public String getActvCodeDef() {
        return actvCodeDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public void setActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
    }

    public FundCodeMaintenance100PostRequest withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public String getGrntCode() {
        return grntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public void setGrntCode(String grntCode) {
        this.grntCode = grntCode;
    }

    public FundCodeMaintenance100PostRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    public Date getExpendEndDate() {
        return expendEndDate;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    public void setExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
    }

    public FundCodeMaintenance100PostRequest withExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
        return this;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public String getOrgnCodeDef() {
        return orgnCodeDef;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public void setOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
    }

    public FundCodeMaintenance100PostRequest withOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public String getLocnCodeDef() {
        return locnCodeDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public void setLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
    }

    public FundCodeMaintenance100PostRequest withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
        return this;
    }

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("acctCodeAccr")
    public String getAcctCodeAccr() {
        return acctCodeAccr;
    }

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("acctCodeAccr")
    public void setAcctCodeAccr(String acctCodeAccr) {
        this.acctCodeAccr = acctCodeAccr;
    }

    public FundCodeMaintenance100PostRequest withAcctCodeAccr(String acctCodeAccr) {
        this.acctCodeAccr = acctCodeAccr;
        return this;
    }

    @JsonProperty("fmgrNm")
    public String getFmgrNm() {
        return fmgrNm;
    }

    @JsonProperty("fmgrNm")
    public void setFmgrNm(String fmgrNm) {
        this.fmgrNm = fmgrNm;
    }

    public FundCodeMaintenance100PostRequest withFmgrNm(String fmgrNm) {
        this.fmgrNm = fmgrNm;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("fundCodePlant")
    public String getFundCodePlant() {
        return fundCodePlant;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("fundCodePlant")
    public void setFundCodePlant(String fundCodePlant) {
        this.fundCodePlant = fundCodePlant;
    }

    public FundCodeMaintenance100PostRequest withFundCodePlant(String fundCodePlant) {
        this.fundCodePlant = fundCodePlant;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCode")
    public String getFtvfmgrFmgrCode() {
        return ftvfmgrFmgrCode;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCode")
    public void setFtvfmgrFmgrCode(String ftvfmgrFmgrCode) {
        this.ftvfmgrFmgrCode = ftvfmgrFmgrCode;
    }

    public FundCodeMaintenance100PostRequest withFtvfmgrFmgrCode(String ftvfmgrFmgrCode) {
        this.ftvfmgrFmgrCode = ftvfmgrFmgrCode;
        return this;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    public String getEffCertRequiredInd() {
        return effCertRequiredInd;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    public void setEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
    }

    public FundCodeMaintenance100PostRequest withEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FundCodeMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public FundCodeMaintenance100PostRequest withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public String getProgCodeDef() {
        return progCodeDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public void setProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
    }

    public FundCodeMaintenance100PostRequest withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
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

    public FundCodeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundCodeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("restInd");
        sb.append('=');
        sb.append(((this.restInd == null)?"<null>":this.restInd));
        sb.append(',');
        sb.append("srcCapSameInd");
        sb.append('=');
        sb.append(((this.srcCapSameInd == null)?"<null>":this.srcCapSameInd));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("fbalInd");
        sb.append('=');
        sb.append(((this.fbalInd == null)?"<null>":this.fbalInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctCodeRev");
        sb.append('=');
        sb.append(((this.acctCodeRev == null)?"<null>":this.acctCodeRev));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("acctCodePlant");
        sb.append('=');
        sb.append(((this.acctCodePlant == null)?"<null>":this.acctCodePlant));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("cashReceiptBankCode");
        sb.append('=');
        sb.append(((this.cashReceiptBankCode == null)?"<null>":this.cashReceiptBankCode));
        sb.append(',');
        sb.append("netAssetClass");
        sb.append('=');
        sb.append(((this.netAssetClass == null)?"<null>":this.netAssetClass));
        sb.append(',');
        sb.append("fundCodePred");
        sb.append('=');
        sb.append(((this.fundCodePred == null)?"<null>":this.fundCodePred));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("orgnCodeDef");
        sb.append('=');
        sb.append(((this.orgnCodeDef == null)?"<null>":this.orgnCodeDef));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("acctCodeAccr");
        sb.append('=');
        sb.append(((this.acctCodeAccr == null)?"<null>":this.acctCodeAccr));
        sb.append(',');
        sb.append("fmgrNm");
        sb.append('=');
        sb.append(((this.fmgrNm == null)?"<null>":this.fmgrNm));
        sb.append(',');
        sb.append("fundCodePlant");
        sb.append('=');
        sb.append(((this.fundCodePlant == null)?"<null>":this.fundCodePlant));
        sb.append(',');
        sb.append("ftvfmgrFmgrCode");
        sb.append('=');
        sb.append(((this.ftvfmgrFmgrCode == null)?"<null>":this.ftvfmgrFmgrCode));
        sb.append(',');
        sb.append("effCertRequiredInd");
        sb.append('=');
        sb.append(((this.effCertRequiredInd == null)?"<null>":this.effCertRequiredInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
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
        result = ((result* 31)+((this.restInd == null)? 0 :this.restInd.hashCode()));
        result = ((result* 31)+((this.srcCapSameInd == null)? 0 :this.srcCapSameInd.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.fbalInd == null)? 0 :this.fbalInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctCodeRev == null)? 0 :this.acctCodeRev.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.acctCodePlant == null)? 0 :this.acctCodePlant.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.cashReceiptBankCode == null)? 0 :this.cashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.netAssetClass == null)? 0 :this.netAssetClass.hashCode()));
        result = ((result* 31)+((this.fundCodePred == null)? 0 :this.fundCodePred.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.orgnCodeDef == null)? 0 :this.orgnCodeDef.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.acctCodeAccr == null)? 0 :this.acctCodeAccr.hashCode()));
        result = ((result* 31)+((this.fmgrNm == null)? 0 :this.fmgrNm.hashCode()));
        result = ((result* 31)+((this.fundCodePlant == null)? 0 :this.fundCodePlant.hashCode()));
        result = ((result* 31)+((this.ftvfmgrFmgrCode == null)? 0 :this.ftvfmgrFmgrCode.hashCode()));
        result = ((result* 31)+((this.effCertRequiredInd == null)? 0 :this.effCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundCodeMaintenance100PostRequest) == false) {
            return false;
        }
        FundCodeMaintenance100PostRequest rhs = ((FundCodeMaintenance100PostRequest) other);
        return ((((((((((((((((((((((((((((((this.restInd == rhs.restInd)||((this.restInd!= null)&&this.restInd.equals(rhs.restInd)))&&((this.srcCapSameInd == rhs.srcCapSameInd)||((this.srcCapSameInd!= null)&&this.srcCapSameInd.equals(rhs.srcCapSameInd))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.fbalInd == rhs.fbalInd)||((this.fbalInd!= null)&&this.fbalInd.equals(rhs.fbalInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctCodeRev == rhs.acctCodeRev)||((this.acctCodeRev!= null)&&this.acctCodeRev.equals(rhs.acctCodeRev))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.acctCodePlant == rhs.acctCodePlant)||((this.acctCodePlant!= null)&&this.acctCodePlant.equals(rhs.acctCodePlant))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.cashReceiptBankCode == rhs.cashReceiptBankCode)||((this.cashReceiptBankCode!= null)&&this.cashReceiptBankCode.equals(rhs.cashReceiptBankCode))))&&((this.netAssetClass == rhs.netAssetClass)||((this.netAssetClass!= null)&&this.netAssetClass.equals(rhs.netAssetClass))))&&((this.fundCodePred == rhs.fundCodePred)||((this.fundCodePred!= null)&&this.fundCodePred.equals(rhs.fundCodePred))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.orgnCodeDef == rhs.orgnCodeDef)||((this.orgnCodeDef!= null)&&this.orgnCodeDef.equals(rhs.orgnCodeDef))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.acctCodeAccr == rhs.acctCodeAccr)||((this.acctCodeAccr!= null)&&this.acctCodeAccr.equals(rhs.acctCodeAccr))))&&((this.fmgrNm == rhs.fmgrNm)||((this.fmgrNm!= null)&&this.fmgrNm.equals(rhs.fmgrNm))))&&((this.fundCodePlant == rhs.fundCodePlant)||((this.fundCodePlant!= null)&&this.fundCodePlant.equals(rhs.fundCodePlant))))&&((this.ftvfmgrFmgrCode == rhs.ftvfmgrFmgrCode)||((this.ftvfmgrFmgrCode!= null)&&this.ftvfmgrFmgrCode.equals(rhs.ftvfmgrFmgrCode))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))));
    }

}
