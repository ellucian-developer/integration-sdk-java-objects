
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
    "criteria.acctCodeAccr",
    "restInd",
    "criteria.propCode",
    "srcCapSameInd",
    "dataEntryInd",
    "fbalInd",
    "acctCodeRev",
    "criteria.fbalInd",
    "criteria.restInd",
    "criteria.ftypCode",
    "criteria.termDate",
    "criteria.dataEntryInd",
    "statusInd",
    "criteria.grntCode",
    "criteria.coasCode",
    "criteria.cashReceiptBankCode",
    "fundCodePred",
    "criteria.effDate",
    "actvCodeDef",
    "criteria.fundCode",
    "grntCode",
    "criteria.acctCodeRev",
    "locnCodeDef",
    "criteria.title",
    "criteria.acctCodePlant",
    "criteria.netAssetClass",
    "criteria.dummyEffCertRequiredInd",
    "criteria.fundCodePred",
    "ftvfmgrFmgrCode",
    "termDate",
    "ftypCode",
    "criteria.actvCodeDef",
    "criteria.activityDate",
    "criteria.statusInd",
    "criteria.srcCapSameInd",
    "coasCode",
    "title",
    "criteria.orgnCodeDef",
    "criteria.locnCodeDef",
    "criteria.effCertAllocInd",
    "acctCodePlant",
    "cashReceiptBankCode",
    "criteria.effCertRequiredInd",
    "criteria.fundCodePlant",
    "netAssetClass",
    "bankCode",
    "expendEndDate",
    "orgnCodeDef",
    "acctCodeAccr",
    "fmgrNm",
    "fundCodePlant",
    "criteria.expendEndDate",
    "effCertRequiredInd",
    "progCodeDef",
    "criteria.bankCode",
    "criteria.progCodeDef"
})
@Generated("jsonschema2pojo")
public class FundCodeMaintenance100PutRequest {

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_ACCR")
    private String criteriaAcctCodeAccr;
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
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROP_CODE")
    private String criteriaPropCode;
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
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("acctCodeRev")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_REV")
    private String acctCodeRev;
    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FBAL_IND")
    private String criteriaFbalInd;
    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_REST_IND")
    private String criteriaRestInd;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String criteriaFtypCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_DATA_ENTRY_IND")
    private String criteriaDataEntryInd;
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
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_GRNT_CODE")
    private String criteriaGrntCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaCashReceiptBankCode;
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
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_DATE")
    private Date criteriaEffDate;
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
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE")
    private String criteriaFundCode;
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
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_REV")
    private String criteriaAcctCodeRev;
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
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TITLE")
    private String criteriaTitle;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_PLANT")
    private String criteriaAcctCodePlant;
    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_NET_ASSET_CLASS")
    private String criteriaNetAssetClass;
    /**
     * Grant Requires Effort Certification
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dummyEffCertRequiredInd")
    private String criteriaDummyEffCertRequiredInd;
    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PRED")
    private String criteriaFundCodePred;
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
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTV_CODE_DEF")
    private String criteriaActvCodeDef;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    private String criteriaSrcCapSameInd;
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
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ORGN_CODE_DEF")
    private String criteriaOrgnCodeDef;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_LOCN_CODE_DEF")
    private String criteriaLocnCodeDef;
    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND")
    private String criteriaEffCertAllocInd;
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
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String cashReceiptBankCode;
    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND")
    private String criteriaEffCertRequiredInd;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PLANT")
    private String criteriaFundCodePlant;
    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClass")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_NET_ASSET_CLASS")
    private String netAssetClass;
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
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EXPEND_END_DATE")
    private Date criteriaExpendEndDate;
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
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_DEF")
    private String progCodeDef;
    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_DEF")
    private String criteriaProgCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    public String getCriteriaAcctCodeAccr() {
        return criteriaAcctCodeAccr;
    }

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    public void setCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
    }

    public FundCodeMaintenance100PutRequest withCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
        return this;
    }

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

    public FundCodeMaintenance100PutRequest withRestInd(String restInd) {
        this.restInd = restInd;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public String getCriteriaPropCode() {
        return criteriaPropCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public void setCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
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

    public FundCodeMaintenance100PutRequest withSrcCapSameInd(String srcCapSameInd) {
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

    public FundCodeMaintenance100PutRequest withDataEntryInd(String dataEntryInd) {
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

    public FundCodeMaintenance100PutRequest withFbalInd(String fbalInd) {
        this.fbalInd = fbalInd;
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

    public FundCodeMaintenance100PutRequest withAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
        return this;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    public String getCriteriaFbalInd() {
        return criteriaFbalInd;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    public void setCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
        return this;
    }

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    public String getCriteriaRestInd() {
        return criteriaRestInd;
    }

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    public void setCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    public String getCriteriaFtypCode() {
        return criteriaFtypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    public void setCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public FundCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
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

    public FundCodeMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    public String getCriteriaGrntCode() {
        return criteriaGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    public void setCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    public String getCriteriaCashReceiptBankCode() {
        return criteriaCashReceiptBankCode;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    public void setCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
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

    public FundCodeMaintenance100PutRequest withFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public FundCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
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

    public FundCodeMaintenance100PutRequest withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
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

    public FundCodeMaintenance100PutRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    public String getCriteriaAcctCodeRev() {
        return criteriaAcctCodeRev;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    public void setCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
    }

    public FundCodeMaintenance100PutRequest withCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
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

    public FundCodeMaintenance100PutRequest withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public FundCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    public String getCriteriaAcctCodePlant() {
        return criteriaAcctCodePlant;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    public void setCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
    }

    public FundCodeMaintenance100PutRequest withCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
        return this;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    public String getCriteriaNetAssetClass() {
        return criteriaNetAssetClass;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    public void setCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
    }

    public FundCodeMaintenance100PutRequest withCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
        return this;
    }

    /**
     * Grant Requires Effort Certification
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dummyEffCertRequiredInd")
    public String getCriteriaDummyEffCertRequiredInd() {
        return criteriaDummyEffCertRequiredInd;
    }

    /**
     * Grant Requires Effort Certification
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dummyEffCertRequiredInd")
    public void setCriteriaDummyEffCertRequiredInd(String criteriaDummyEffCertRequiredInd) {
        this.criteriaDummyEffCertRequiredInd = criteriaDummyEffCertRequiredInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaDummyEffCertRequiredInd(String criteriaDummyEffCertRequiredInd) {
        this.criteriaDummyEffCertRequiredInd = criteriaDummyEffCertRequiredInd;
        return this;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    public String getCriteriaFundCodePred() {
        return criteriaFundCodePred;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    public void setCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
    }

    public FundCodeMaintenance100PutRequest withCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
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

    public FundCodeMaintenance100PutRequest withFtvfmgrFmgrCode(String ftvfmgrFmgrCode) {
        this.ftvfmgrFmgrCode = ftvfmgrFmgrCode;
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

    public FundCodeMaintenance100PutRequest withTermDate(Date termDate) {
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

    public FundCodeMaintenance100PutRequest withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public String getCriteriaActvCodeDef() {
        return criteriaActvCodeDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public void setCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
    }

    public FundCodeMaintenance100PutRequest withCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public FundCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    public String getCriteriaSrcCapSameInd() {
        return criteriaSrcCapSameInd;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    public void setCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
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

    public FundCodeMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public FundCodeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    public String getCriteriaOrgnCodeDef() {
        return criteriaOrgnCodeDef;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    public void setCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
    }

    public FundCodeMaintenance100PutRequest withCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public String getCriteriaLocnCodeDef() {
        return criteriaLocnCodeDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public void setCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
    }

    public FundCodeMaintenance100PutRequest withCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
        return this;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    public String getCriteriaEffCertAllocInd() {
        return criteriaEffCertAllocInd;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    public void setCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
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

    public FundCodeMaintenance100PutRequest withAcctCodePlant(String acctCodePlant) {
        this.acctCodePlant = acctCodePlant;
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

    public FundCodeMaintenance100PutRequest withCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
        return this;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public String getCriteriaEffCertRequiredInd() {
        return criteriaEffCertRequiredInd;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public void setCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
    }

    public FundCodeMaintenance100PutRequest withCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    public String getCriteriaFundCodePlant() {
        return criteriaFundCodePlant;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    public void setCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
    }

    public FundCodeMaintenance100PutRequest withCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
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

    public FundCodeMaintenance100PutRequest withNetAssetClass(String netAssetClass) {
        this.netAssetClass = netAssetClass;
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

    public FundCodeMaintenance100PutRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public FundCodeMaintenance100PutRequest withExpendEndDate(Date expendEndDate) {
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

    public FundCodeMaintenance100PutRequest withOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
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

    public FundCodeMaintenance100PutRequest withAcctCodeAccr(String acctCodeAccr) {
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

    public FundCodeMaintenance100PutRequest withFmgrNm(String fmgrNm) {
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

    public FundCodeMaintenance100PutRequest withFundCodePlant(String fundCodePlant) {
        this.fundCodePlant = fundCodePlant;
        return this;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public Date getCriteriaExpendEndDate() {
        return criteriaExpendEndDate;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public void setCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
    }

    public FundCodeMaintenance100PutRequest withCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
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

    public FundCodeMaintenance100PutRequest withEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
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

    public FundCodeMaintenance100PutRequest withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public FundCodeMaintenance100PutRequest withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public String getCriteriaProgCodeDef() {
        return criteriaProgCodeDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public void setCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
    }

    public FundCodeMaintenance100PutRequest withCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
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

    public FundCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAcctCodeAccr");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeAccr == null)?"<null>":this.criteriaAcctCodeAccr));
        sb.append(',');
        sb.append("restInd");
        sb.append('=');
        sb.append(((this.restInd == null)?"<null>":this.restInd));
        sb.append(',');
        sb.append("criteriaPropCode");
        sb.append('=');
        sb.append(((this.criteriaPropCode == null)?"<null>":this.criteriaPropCode));
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
        sb.append("acctCodeRev");
        sb.append('=');
        sb.append(((this.acctCodeRev == null)?"<null>":this.acctCodeRev));
        sb.append(',');
        sb.append("criteriaFbalInd");
        sb.append('=');
        sb.append(((this.criteriaFbalInd == null)?"<null>":this.criteriaFbalInd));
        sb.append(',');
        sb.append("criteriaRestInd");
        sb.append('=');
        sb.append(((this.criteriaRestInd == null)?"<null>":this.criteriaRestInd));
        sb.append(',');
        sb.append("criteriaFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtypCode == null)?"<null>":this.criteriaFtypCode));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaGrntCode");
        sb.append('=');
        sb.append(((this.criteriaGrntCode == null)?"<null>":this.criteriaGrntCode));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaCashReceiptBankCode");
        sb.append('=');
        sb.append(((this.criteriaCashReceiptBankCode == null)?"<null>":this.criteriaCashReceiptBankCode));
        sb.append(',');
        sb.append("fundCodePred");
        sb.append('=');
        sb.append(((this.fundCodePred == null)?"<null>":this.fundCodePred));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("criteriaAcctCodeRev");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeRev == null)?"<null>":this.criteriaAcctCodeRev));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaAcctCodePlant");
        sb.append('=');
        sb.append(((this.criteriaAcctCodePlant == null)?"<null>":this.criteriaAcctCodePlant));
        sb.append(',');
        sb.append("criteriaNetAssetClass");
        sb.append('=');
        sb.append(((this.criteriaNetAssetClass == null)?"<null>":this.criteriaNetAssetClass));
        sb.append(',');
        sb.append("criteriaDummyEffCertRequiredInd");
        sb.append('=');
        sb.append(((this.criteriaDummyEffCertRequiredInd == null)?"<null>":this.criteriaDummyEffCertRequiredInd));
        sb.append(',');
        sb.append("criteriaFundCodePred");
        sb.append('=');
        sb.append(((this.criteriaFundCodePred == null)?"<null>":this.criteriaFundCodePred));
        sb.append(',');
        sb.append("ftvfmgrFmgrCode");
        sb.append('=');
        sb.append(((this.ftvfmgrFmgrCode == null)?"<null>":this.ftvfmgrFmgrCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("criteriaActvCodeDef");
        sb.append('=');
        sb.append(((this.criteriaActvCodeDef == null)?"<null>":this.criteriaActvCodeDef));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaSrcCapSameInd");
        sb.append('=');
        sb.append(((this.criteriaSrcCapSameInd == null)?"<null>":this.criteriaSrcCapSameInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaOrgnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeDef == null)?"<null>":this.criteriaOrgnCodeDef));
        sb.append(',');
        sb.append("criteriaLocnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaLocnCodeDef == null)?"<null>":this.criteriaLocnCodeDef));
        sb.append(',');
        sb.append("criteriaEffCertAllocInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertAllocInd == null)?"<null>":this.criteriaEffCertAllocInd));
        sb.append(',');
        sb.append("acctCodePlant");
        sb.append('=');
        sb.append(((this.acctCodePlant == null)?"<null>":this.acctCodePlant));
        sb.append(',');
        sb.append("cashReceiptBankCode");
        sb.append('=');
        sb.append(((this.cashReceiptBankCode == null)?"<null>":this.cashReceiptBankCode));
        sb.append(',');
        sb.append("criteriaEffCertRequiredInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertRequiredInd == null)?"<null>":this.criteriaEffCertRequiredInd));
        sb.append(',');
        sb.append("criteriaFundCodePlant");
        sb.append('=');
        sb.append(((this.criteriaFundCodePlant == null)?"<null>":this.criteriaFundCodePlant));
        sb.append(',');
        sb.append("netAssetClass");
        sb.append('=');
        sb.append(((this.netAssetClass == null)?"<null>":this.netAssetClass));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("orgnCodeDef");
        sb.append('=');
        sb.append(((this.orgnCodeDef == null)?"<null>":this.orgnCodeDef));
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
        sb.append("criteriaExpendEndDate");
        sb.append('=');
        sb.append(((this.criteriaExpendEndDate == null)?"<null>":this.criteriaExpendEndDate));
        sb.append(',');
        sb.append("effCertRequiredInd");
        sb.append('=');
        sb.append(((this.effCertRequiredInd == null)?"<null>":this.effCertRequiredInd));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
        sb.append(',');
        sb.append("criteriaProgCodeDef");
        sb.append('=');
        sb.append(((this.criteriaProgCodeDef == null)?"<null>":this.criteriaProgCodeDef));
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
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePlant == null)? 0 :this.criteriaFundCodePlant.hashCode()));
        result = ((result* 31)+((this.acctCodeRev == null)? 0 :this.acctCodeRev.hashCode()));
        result = ((result* 31)+((this.criteriaSrcCapSameInd == null)? 0 :this.criteriaSrcCapSameInd.hashCode()));
        result = ((result* 31)+((this.criteriaActvCodeDef == null)? 0 :this.criteriaActvCodeDef.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.criteriaExpendEndDate == null)? 0 :this.criteriaExpendEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaDummyEffCertRequiredInd == null)? 0 :this.criteriaDummyEffCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.fundCodePred == null)? 0 :this.fundCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertAllocInd == null)? 0 :this.criteriaEffCertAllocInd.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaCashReceiptBankCode == null)? 0 :this.criteriaCashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePred == null)? 0 :this.criteriaFundCodePred.hashCode()));
        result = ((result* 31)+((this.ftvfmgrFmgrCode == null)? 0 :this.ftvfmgrFmgrCode.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodeDef == null)? 0 :this.criteriaLocnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.criteriaRestInd == null)? 0 :this.criteriaRestInd.hashCode()));
        result = ((result* 31)+((this.criteriaNetAssetClass == null)? 0 :this.criteriaNetAssetClass.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeRev == null)? 0 :this.criteriaAcctCodeRev.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.acctCodePlant == null)? 0 :this.acctCodePlant.hashCode()));
        result = ((result* 31)+((this.cashReceiptBankCode == null)? 0 :this.cashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodePlant == null)? 0 :this.criteriaAcctCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaGrntCode == null)? 0 :this.criteriaGrntCode.hashCode()));
        result = ((result* 31)+((this.netAssetClass == null)? 0 :this.netAssetClass.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeDef == null)? 0 :this.criteriaOrgnCodeDef.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.criteriaPropCode == null)? 0 :this.criteriaPropCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtypCode == null)? 0 :this.criteriaFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.orgnCodeDef == null)? 0 :this.orgnCodeDef.hashCode()));
        result = ((result* 31)+((this.acctCodeAccr == null)? 0 :this.acctCodeAccr.hashCode()));
        result = ((result* 31)+((this.fmgrNm == null)? 0 :this.fmgrNm.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.fundCodePlant == null)? 0 :this.fundCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaProgCodeDef == null)? 0 :this.criteriaProgCodeDef.hashCode()));
        result = ((result* 31)+((this.effCertRequiredInd == null)? 0 :this.effCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertRequiredInd == null)? 0 :this.criteriaEffCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaFbalInd == null)? 0 :this.criteriaFbalInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeAccr == null)? 0 :this.criteriaAcctCodeAccr.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundCodeMaintenance100PutRequest) == false) {
            return false;
        }
        FundCodeMaintenance100PutRequest rhs = ((FundCodeMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.restInd == rhs.restInd)||((this.restInd!= null)&&this.restInd.equals(rhs.restInd)))&&((this.srcCapSameInd == rhs.srcCapSameInd)||((this.srcCapSameInd!= null)&&this.srcCapSameInd.equals(rhs.srcCapSameInd))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.fbalInd == rhs.fbalInd)||((this.fbalInd!= null)&&this.fbalInd.equals(rhs.fbalInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaFundCodePlant == rhs.criteriaFundCodePlant)||((this.criteriaFundCodePlant!= null)&&this.criteriaFundCodePlant.equals(rhs.criteriaFundCodePlant))))&&((this.acctCodeRev == rhs.acctCodeRev)||((this.acctCodeRev!= null)&&this.acctCodeRev.equals(rhs.acctCodeRev))))&&((this.criteriaSrcCapSameInd == rhs.criteriaSrcCapSameInd)||((this.criteriaSrcCapSameInd!= null)&&this.criteriaSrcCapSameInd.equals(rhs.criteriaSrcCapSameInd))))&&((this.criteriaActvCodeDef == rhs.criteriaActvCodeDef)||((this.criteriaActvCodeDef!= null)&&this.criteriaActvCodeDef.equals(rhs.criteriaActvCodeDef))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaExpendEndDate == rhs.criteriaExpendEndDate)||((this.criteriaExpendEndDate!= null)&&this.criteriaExpendEndDate.equals(rhs.criteriaExpendEndDate))))&&((this.criteriaDummyEffCertRequiredInd == rhs.criteriaDummyEffCertRequiredInd)||((this.criteriaDummyEffCertRequiredInd!= null)&&this.criteriaDummyEffCertRequiredInd.equals(rhs.criteriaDummyEffCertRequiredInd))))&&((this.fundCodePred == rhs.fundCodePred)||((this.fundCodePred!= null)&&this.fundCodePred.equals(rhs.fundCodePred))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaEffCertAllocInd == rhs.criteriaEffCertAllocInd)||((this.criteriaEffCertAllocInd!= null)&&this.criteriaEffCertAllocInd.equals(rhs.criteriaEffCertAllocInd))))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.criteriaCashReceiptBankCode == rhs.criteriaCashReceiptBankCode)||((this.criteriaCashReceiptBankCode!= null)&&this.criteriaCashReceiptBankCode.equals(rhs.criteriaCashReceiptBankCode))))&&((this.criteriaFundCodePred == rhs.criteriaFundCodePred)||((this.criteriaFundCodePred!= null)&&this.criteriaFundCodePred.equals(rhs.criteriaFundCodePred))))&&((this.ftvfmgrFmgrCode == rhs.ftvfmgrFmgrCode)||((this.ftvfmgrFmgrCode!= null)&&this.ftvfmgrFmgrCode.equals(rhs.ftvfmgrFmgrCode))))&&((this.criteriaLocnCodeDef == rhs.criteriaLocnCodeDef)||((this.criteriaLocnCodeDef!= null)&&this.criteriaLocnCodeDef.equals(rhs.criteriaLocnCodeDef))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode))))&&((this.criteriaRestInd == rhs.criteriaRestInd)||((this.criteriaRestInd!= null)&&this.criteriaRestInd.equals(rhs.criteriaRestInd))))&&((this.criteriaNetAssetClass == rhs.criteriaNetAssetClass)||((this.criteriaNetAssetClass!= null)&&this.criteriaNetAssetClass.equals(rhs.criteriaNetAssetClass))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.criteriaAcctCodeRev == rhs.criteriaAcctCodeRev)||((this.criteriaAcctCodeRev!= null)&&this.criteriaAcctCodeRev.equals(rhs.criteriaAcctCodeRev))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.acctCodePlant == rhs.acctCodePlant)||((this.acctCodePlant!= null)&&this.acctCodePlant.equals(rhs.acctCodePlant))))&&((this.cashReceiptBankCode == rhs.cashReceiptBankCode)||((this.cashReceiptBankCode!= null)&&this.cashReceiptBankCode.equals(rhs.cashReceiptBankCode))))&&((this.criteriaAcctCodePlant == rhs.criteriaAcctCodePlant)||((this.criteriaAcctCodePlant!= null)&&this.criteriaAcctCodePlant.equals(rhs.criteriaAcctCodePlant))))&&((this.criteriaGrntCode == rhs.criteriaGrntCode)||((this.criteriaGrntCode!= null)&&this.criteriaGrntCode.equals(rhs.criteriaGrntCode))))&&((this.netAssetClass == rhs.netAssetClass)||((this.netAssetClass!= null)&&this.netAssetClass.equals(rhs.netAssetClass))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaOrgnCodeDef == rhs.criteriaOrgnCodeDef)||((this.criteriaOrgnCodeDef!= null)&&this.criteriaOrgnCodeDef.equals(rhs.criteriaOrgnCodeDef))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.criteriaPropCode == rhs.criteriaPropCode)||((this.criteriaPropCode!= null)&&this.criteriaPropCode.equals(rhs.criteriaPropCode))))&&((this.criteriaFtypCode == rhs.criteriaFtypCode)||((this.criteriaFtypCode!= null)&&this.criteriaFtypCode.equals(rhs.criteriaFtypCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.orgnCodeDef == rhs.orgnCodeDef)||((this.orgnCodeDef!= null)&&this.orgnCodeDef.equals(rhs.orgnCodeDef))))&&((this.acctCodeAccr == rhs.acctCodeAccr)||((this.acctCodeAccr!= null)&&this.acctCodeAccr.equals(rhs.acctCodeAccr))))&&((this.fmgrNm == rhs.fmgrNm)||((this.fmgrNm!= null)&&this.fmgrNm.equals(rhs.fmgrNm))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.fundCodePlant == rhs.fundCodePlant)||((this.fundCodePlant!= null)&&this.fundCodePlant.equals(rhs.fundCodePlant))))&&((this.criteriaProgCodeDef == rhs.criteriaProgCodeDef)||((this.criteriaProgCodeDef!= null)&&this.criteriaProgCodeDef.equals(rhs.criteriaProgCodeDef))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.criteriaEffCertRequiredInd == rhs.criteriaEffCertRequiredInd)||((this.criteriaEffCertRequiredInd!= null)&&this.criteriaEffCertRequiredInd.equals(rhs.criteriaEffCertRequiredInd))))&&((this.criteriaFbalInd == rhs.criteriaFbalInd)||((this.criteriaFbalInd!= null)&&this.criteriaFbalInd.equals(rhs.criteriaFbalInd))))&&((this.criteriaAcctCodeAccr == rhs.criteriaAcctCodeAccr)||((this.criteriaAcctCodeAccr!= null)&&this.criteriaAcctCodeAccr.equals(rhs.criteriaAcctCodeAccr))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))));
    }

}
