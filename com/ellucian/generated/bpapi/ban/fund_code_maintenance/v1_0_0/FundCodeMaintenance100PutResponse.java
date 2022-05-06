
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
    "progTitle",
    "restInd",
    "srcCapSameInd",
    "dataEntryInd",
    "fbalInd",
    "bankCodeDescr",
    "locnCodeCapDef",
    "acctCodeRev",
    "fundCodeBavl",
    "bavlSeverity",
    "fmgrNmC",
    "displayTitle",
    "bavlKeyOrgn",
    "effDate",
    "fundCode",
    "statusInd",
    "orgnCodeCapDef",
    "fundCodeSource",
    "acctCodeAsset",
    "fundCodePred",
    "actvCodeDef",
    "netAssetClassDescr",
    "conpProjNum",
    "acctCodeLoss",
    "grntCode",
    "ttlFtyp",
    "propDesc",
    "orgnCodeAllocContra",
    "locnCodeDef",
    "revenueAcctDesc",
    "netAssetClassCode",
    "ftvfmgrFmgrCode",
    "deprPostCode",
    "accrAcctDesc",
    "termDate",
    "ftypCode",
    "fundCodePlantConp",
    "ctextInd",
    "ftvfmgrFmgrCodeConp",
    "projCompleteDate",
    "fundCodeAllocTgt",
    "cumCostAmt",
    "effCertAllocInd",
    "crbcDesc",
    "actvCodeCapDef",
    "closeProjInd",
    "coasCode",
    "acctTitle",
    "title",
    "bavlKeyFund",
    "propCode",
    "maxConstrAmt",
    "activityDate",
    "acctCodePlant",
    "cashReceiptBankCode",
    "hierTableInd",
    "costCodeConp",
    "deprExpEqDefInd",
    "ttlSrc",
    "progCodeCapDef",
    "bankCode",
    "bavlKeyAcct",
    "bavlKeyProg",
    "acctCodeCip",
    "acctCodeEquity",
    "allocPct",
    "projDesc",
    "projStartDateConp",
    "projEndDateConp",
    "bavlPeriod",
    "expendEndDate",
    "acctCodeAllocContra",
    "orgnCodeDef",
    "acctCodeAccr",
    "fmgrNm",
    "ttlPred",
    "fundCodePlant",
    "orgnTitle",
    "displayNchgDate",
    "grntDesc",
    "effCertRequiredInd",
    "progCodeDef",
    "acctCodeGain",
    "progCodeAllocContra"
})
@Generated("jsonschema2pojo")
public class FundCodeMaintenance100PutResponse {

    @JsonProperty("progTitle")
    private String progTitle;
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
    @JsonProperty("bankCodeDescr")
    private String bankCodeDescr;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_LOCN_CODE_CAP_DEF")
    private String locnCodeCapDef;
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
     * Control Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_BAVL")
    private String fundCodeBavl;
    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVFUND_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_SEVERITY")
    private String bavlSeverity;
    @JsonProperty("fmgrNmC")
    private String fmgrNmC;
    @JsonProperty("displayTitle")
    private String displayTitle;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_KEY_ORGN")
    private String bavlKeyOrgn;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_STATUS_IND")
    private String statusInd;
    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ORGN_CODE_CAP_DEF")
    private String orgnCodeCapDef;
    /**
     * Source Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_SOURCE
     * 
     */
    @JsonProperty("fundCodeSource")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_SOURCE")
    private String fundCodeSource;
    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_ASSET")
    private String acctCodeAsset;
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
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTV_CODE_DEF")
    private String actvCodeDef;
    @JsonProperty("netAssetClassDescr")
    private String netAssetClassDescr;
    /**
     * Number
     * <p>
     * Lineage reference object : FTVFUND_CONP_PROJ_NUM
     * 
     */
    @JsonProperty("conpProjNum")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CONP_PROJ_NUM")
    private String conpProjNum;
    /**
     * Loss Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_LOSS")
    private String acctCodeLoss;
    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_GRNT_CODE")
    private String grntCode;
    @JsonProperty("ttlFtyp")
    private String ttlFtyp;
    @JsonProperty("propDesc")
    private String propDesc;
    /**
     * Contra-Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("orgnCodeAllocContra")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ORGN_CODE_ALLOC_CONTRA")
    private String orgnCodeAllocContra;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_LOCN_CODE_DEF")
    private String locnCodeDef;
    @JsonProperty("revenueAcctDesc")
    private String revenueAcctDesc;
    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClassCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_NET_ASSET_CLASS")
    private String netAssetClassCode;
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
     * Depreciation and Posting Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_DEPR_POST_CODE")
    private String deprPostCode;
    @JsonProperty("accrAcctDesc")
    private String accrAcctDesc;
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
     * Plant Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT_CONP
     * 
     */
    @JsonProperty("fundCodePlantConp")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PLANT_CONP")
    private String fundCodePlantConp;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("ctextInd")
    private String ctextInd;
    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCodeConp")
    @JsonPropertyDescription("Lookup lineage reference object : spriden,ftvfmgr")
    private String ftvfmgrFmgrCodeConp;
    /**
     * Date Completed
     * <p>
     * Lineage reference object : FTVFUND_PROJ_COMPLETE_DATE
     * 
     */
    @JsonProperty("projCompleteDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROJ_COMPLETE_DATE")
    private Date projCompleteDate;
    /**
     * Target Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_ALLOC_TGT
     * 
     */
    @JsonProperty("fundCodeAllocTgt")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_ALLOC_TGT")
    private String fundCodeAllocTgt;
    /**
     * Cumulative Authorized Amount
     * <p>
     * Lineage reference object : FTVFUND_CUM_COST_AMT
     * 
     */
    @JsonProperty("cumCostAmt")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CUM_COST_AMT")
    private Double cumCostAmt;
    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("effCertAllocInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND")
    private String effCertAllocInd;
    @JsonProperty("crbcDesc")
    private String crbcDesc;
    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTV_CODE_CAP_DEF")
    private String actvCodeCapDef;
    /**
     * Closed
     * <p>
     * Lineage reference object : FTVFUND_CLOSE_PROJ_IND
     * 
     */
    @JsonProperty("closeProjInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CLOSE_PROJ_IND")
    private String closeProjInd;
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
    @JsonProperty("acctTitle")
    private String acctTitle;
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
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_KEY_FUND")
    private String bavlKeyFund;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROP_CODE")
    private String propCode;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FTVFUND_MAX_CONSTR_AMT
     * 
     */
    @JsonProperty("maxConstrAmt")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_MAX_CONSTR_AMT")
    private Double maxConstrAmt;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTIVITY_DATE")
    private Date activityDate;
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
     * Combination Control
     * <p>
     * Lineage reference object : FTVFUND_HIER_TABLE_IND
     * 
     */
    @JsonProperty("hierTableInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_HIER_TABLE_IND")
    private String hierTableInd;
    /**
     * Cost Share
     * <p>
     * Lineage reference object : FTVFUND_COST_CODE_CONP
     * 
     */
    @JsonProperty("costCodeConp")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_COST_CODE_CONP")
    private String costCodeConp;
    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_DEPR_EXP_EQ_DEF_IND")
    private String deprExpEqDefInd;
    @JsonProperty("ttlSrc")
    private String ttlSrc;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_CAP_DEF")
    private String progCodeCapDef;
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
     * Account
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_KEY_ACCT")
    private String bavlKeyAcct;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_KEY_PROG")
    private String bavlKeyProg;
    /**
     * Construction in Process
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_CIP
     * 
     */
    @JsonProperty("acctCodeCip")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_CIP")
    private String acctCodeCip;
    /**
     * Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_EQUITY
     * 
     */
    @JsonProperty("acctCodeEquity")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_EQUITY")
    private String acctCodeEquity;
    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFUND_ALLOC_PCT
     * 
     */
    @JsonProperty("allocPct")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ALLOC_PCT")
    private Double allocPct;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVFUND_PROJ_DESC
     * 
     */
    @JsonProperty("projDesc")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROJ_DESC")
    private String projDesc;
    /**
     * Period From
     * <p>
     * Lineage reference object : FTVFUND_PROJ_START_DATE_CONP
     * 
     */
    @JsonProperty("projStartDateConp")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROJ_START_DATE_CONP")
    private Date projStartDateConp;
    /**
     * Period To
     * <p>
     * Lineage reference object : FTVFUND_PROJ_END_DATE_CONP
     * 
     */
    @JsonProperty("projEndDateConp")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROJ_END_DATE_CONP")
    private Date projEndDateConp;
    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFUND_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BAVL_PERIOD")
    private String bavlPeriod;
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
     * Contra-Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("acctCodeAllocContra")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_ALLOC_CONTRA")
    private String acctCodeAllocContra;
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
    @JsonProperty("ttlPred")
    private String ttlPred;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("fundCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PLANT")
    private String fundCodePlant;
    @JsonProperty("orgnTitle")
    private String orgnTitle;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    @JsonProperty("grntDesc")
    private String grntDesc;
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
     * Gain Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_GAIN")
    private String acctCodeGain;
    /**
     * Contra-Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("progCodeAllocContra")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_ALLOC_CONTRA")
    private String progCodeAllocContra;
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

    public FundCodeMaintenance100PutResponse withProgTitle(String progTitle) {
        this.progTitle = progTitle;
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

    public FundCodeMaintenance100PutResponse withRestInd(String restInd) {
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

    public FundCodeMaintenance100PutResponse withSrcCapSameInd(String srcCapSameInd) {
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

    public FundCodeMaintenance100PutResponse withDataEntryInd(String dataEntryInd) {
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

    public FundCodeMaintenance100PutResponse withFbalInd(String fbalInd) {
        this.fbalInd = fbalInd;
        return this;
    }

    @JsonProperty("bankCodeDescr")
    public String getBankCodeDescr() {
        return bankCodeDescr;
    }

    @JsonProperty("bankCodeDescr")
    public void setBankCodeDescr(String bankCodeDescr) {
        this.bankCodeDescr = bankCodeDescr;
    }

    public FundCodeMaintenance100PutResponse withBankCodeDescr(String bankCodeDescr) {
        this.bankCodeDescr = bankCodeDescr;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    public String getLocnCodeCapDef() {
        return locnCodeCapDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    public void setLocnCodeCapDef(String locnCodeCapDef) {
        this.locnCodeCapDef = locnCodeCapDef;
    }

    public FundCodeMaintenance100PutResponse withLocnCodeCapDef(String locnCodeCapDef) {
        this.locnCodeCapDef = locnCodeCapDef;
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

    public FundCodeMaintenance100PutResponse withAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
        return this;
    }

    /**
     * Control Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    public String getFundCodeBavl() {
        return fundCodeBavl;
    }

    /**
     * Control Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    public void setFundCodeBavl(String fundCodeBavl) {
        this.fundCodeBavl = fundCodeBavl;
    }

    public FundCodeMaintenance100PutResponse withFundCodeBavl(String fundCodeBavl) {
        this.fundCodeBavl = fundCodeBavl;
        return this;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVFUND_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public String getBavlSeverity() {
        return bavlSeverity;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVFUND_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public void setBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
    }

    public FundCodeMaintenance100PutResponse withBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
        return this;
    }

    @JsonProperty("fmgrNmC")
    public String getFmgrNmC() {
        return fmgrNmC;
    }

    @JsonProperty("fmgrNmC")
    public void setFmgrNmC(String fmgrNmC) {
        this.fmgrNmC = fmgrNmC;
    }

    public FundCodeMaintenance100PutResponse withFmgrNmC(String fmgrNmC) {
        this.fmgrNmC = fmgrNmC;
        return this;
    }

    @JsonProperty("displayTitle")
    public String getDisplayTitle() {
        return displayTitle;
    }

    @JsonProperty("displayTitle")
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public FundCodeMaintenance100PutResponse withDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    public String getBavlKeyOrgn() {
        return bavlKeyOrgn;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    public void setBavlKeyOrgn(String bavlKeyOrgn) {
        this.bavlKeyOrgn = bavlKeyOrgn;
    }

    public FundCodeMaintenance100PutResponse withBavlKeyOrgn(String bavlKeyOrgn) {
        this.bavlKeyOrgn = bavlKeyOrgn;
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

    public FundCodeMaintenance100PutResponse withEffDate(Date effDate) {
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

    public FundCodeMaintenance100PutResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public FundCodeMaintenance100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    public String getOrgnCodeCapDef() {
        return orgnCodeCapDef;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    public void setOrgnCodeCapDef(String orgnCodeCapDef) {
        this.orgnCodeCapDef = orgnCodeCapDef;
    }

    public FundCodeMaintenance100PutResponse withOrgnCodeCapDef(String orgnCodeCapDef) {
        this.orgnCodeCapDef = orgnCodeCapDef;
        return this;
    }

    /**
     * Source Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_SOURCE
     * 
     */
    @JsonProperty("fundCodeSource")
    public String getFundCodeSource() {
        return fundCodeSource;
    }

    /**
     * Source Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_SOURCE
     * 
     */
    @JsonProperty("fundCodeSource")
    public void setFundCodeSource(String fundCodeSource) {
        this.fundCodeSource = fundCodeSource;
    }

    public FundCodeMaintenance100PutResponse withFundCodeSource(String fundCodeSource) {
        this.fundCodeSource = fundCodeSource;
        return this;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    public String getAcctCodeAsset() {
        return acctCodeAsset;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    public void setAcctCodeAsset(String acctCodeAsset) {
        this.acctCodeAsset = acctCodeAsset;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeAsset(String acctCodeAsset) {
        this.acctCodeAsset = acctCodeAsset;
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

    public FundCodeMaintenance100PutResponse withFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
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

    public FundCodeMaintenance100PutResponse withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
        return this;
    }

    @JsonProperty("netAssetClassDescr")
    public String getNetAssetClassDescr() {
        return netAssetClassDescr;
    }

    @JsonProperty("netAssetClassDescr")
    public void setNetAssetClassDescr(String netAssetClassDescr) {
        this.netAssetClassDescr = netAssetClassDescr;
    }

    public FundCodeMaintenance100PutResponse withNetAssetClassDescr(String netAssetClassDescr) {
        this.netAssetClassDescr = netAssetClassDescr;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : FTVFUND_CONP_PROJ_NUM
     * 
     */
    @JsonProperty("conpProjNum")
    public String getConpProjNum() {
        return conpProjNum;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : FTVFUND_CONP_PROJ_NUM
     * 
     */
    @JsonProperty("conpProjNum")
    public void setConpProjNum(String conpProjNum) {
        this.conpProjNum = conpProjNum;
    }

    public FundCodeMaintenance100PutResponse withConpProjNum(String conpProjNum) {
        this.conpProjNum = conpProjNum;
        return this;
    }

    /**
     * Loss Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    public String getAcctCodeLoss() {
        return acctCodeLoss;
    }

    /**
     * Loss Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    public void setAcctCodeLoss(String acctCodeLoss) {
        this.acctCodeLoss = acctCodeLoss;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeLoss(String acctCodeLoss) {
        this.acctCodeLoss = acctCodeLoss;
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

    public FundCodeMaintenance100PutResponse withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    @JsonProperty("ttlFtyp")
    public String getTtlFtyp() {
        return ttlFtyp;
    }

    @JsonProperty("ttlFtyp")
    public void setTtlFtyp(String ttlFtyp) {
        this.ttlFtyp = ttlFtyp;
    }

    public FundCodeMaintenance100PutResponse withTtlFtyp(String ttlFtyp) {
        this.ttlFtyp = ttlFtyp;
        return this;
    }

    @JsonProperty("propDesc")
    public String getPropDesc() {
        return propDesc;
    }

    @JsonProperty("propDesc")
    public void setPropDesc(String propDesc) {
        this.propDesc = propDesc;
    }

    public FundCodeMaintenance100PutResponse withPropDesc(String propDesc) {
        this.propDesc = propDesc;
        return this;
    }

    /**
     * Contra-Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("orgnCodeAllocContra")
    public String getOrgnCodeAllocContra() {
        return orgnCodeAllocContra;
    }

    /**
     * Contra-Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("orgnCodeAllocContra")
    public void setOrgnCodeAllocContra(String orgnCodeAllocContra) {
        this.orgnCodeAllocContra = orgnCodeAllocContra;
    }

    public FundCodeMaintenance100PutResponse withOrgnCodeAllocContra(String orgnCodeAllocContra) {
        this.orgnCodeAllocContra = orgnCodeAllocContra;
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

    public FundCodeMaintenance100PutResponse withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
        return this;
    }

    @JsonProperty("revenueAcctDesc")
    public String getRevenueAcctDesc() {
        return revenueAcctDesc;
    }

    @JsonProperty("revenueAcctDesc")
    public void setRevenueAcctDesc(String revenueAcctDesc) {
        this.revenueAcctDesc = revenueAcctDesc;
    }

    public FundCodeMaintenance100PutResponse withRevenueAcctDesc(String revenueAcctDesc) {
        this.revenueAcctDesc = revenueAcctDesc;
        return this;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClassCode")
    public String getNetAssetClassCode() {
        return netAssetClassCode;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("netAssetClassCode")
    public void setNetAssetClassCode(String netAssetClassCode) {
        this.netAssetClassCode = netAssetClassCode;
    }

    public FundCodeMaintenance100PutResponse withNetAssetClassCode(String netAssetClassCode) {
        this.netAssetClassCode = netAssetClassCode;
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

    public FundCodeMaintenance100PutResponse withFtvfmgrFmgrCode(String ftvfmgrFmgrCode) {
        this.ftvfmgrFmgrCode = ftvfmgrFmgrCode;
        return this;
    }

    /**
     * Depreciation and Posting Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    public String getDeprPostCode() {
        return deprPostCode;
    }

    /**
     * Depreciation and Posting Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    public void setDeprPostCode(String deprPostCode) {
        this.deprPostCode = deprPostCode;
    }

    public FundCodeMaintenance100PutResponse withDeprPostCode(String deprPostCode) {
        this.deprPostCode = deprPostCode;
        return this;
    }

    @JsonProperty("accrAcctDesc")
    public String getAccrAcctDesc() {
        return accrAcctDesc;
    }

    @JsonProperty("accrAcctDesc")
    public void setAccrAcctDesc(String accrAcctDesc) {
        this.accrAcctDesc = accrAcctDesc;
    }

    public FundCodeMaintenance100PutResponse withAccrAcctDesc(String accrAcctDesc) {
        this.accrAcctDesc = accrAcctDesc;
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

    public FundCodeMaintenance100PutResponse withTermDate(Date termDate) {
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

    public FundCodeMaintenance100PutResponse withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Plant Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT_CONP
     * 
     */
    @JsonProperty("fundCodePlantConp")
    public String getFundCodePlantConp() {
        return fundCodePlantConp;
    }

    /**
     * Plant Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT_CONP
     * 
     */
    @JsonProperty("fundCodePlantConp")
    public void setFundCodePlantConp(String fundCodePlantConp) {
        this.fundCodePlantConp = fundCodePlantConp;
    }

    public FundCodeMaintenance100PutResponse withFundCodePlantConp(String fundCodePlantConp) {
        this.fundCodePlantConp = fundCodePlantConp;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("ctextInd")
    public String getCtextInd() {
        return ctextInd;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("ctextInd")
    public void setCtextInd(String ctextInd) {
        this.ctextInd = ctextInd;
    }

    public FundCodeMaintenance100PutResponse withCtextInd(String ctextInd) {
        this.ctextInd = ctextInd;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCodeConp")
    public String getFtvfmgrFmgrCodeConp() {
        return ftvfmgrFmgrCodeConp;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("ftvfmgrFmgrCodeConp")
    public void setFtvfmgrFmgrCodeConp(String ftvfmgrFmgrCodeConp) {
        this.ftvfmgrFmgrCodeConp = ftvfmgrFmgrCodeConp;
    }

    public FundCodeMaintenance100PutResponse withFtvfmgrFmgrCodeConp(String ftvfmgrFmgrCodeConp) {
        this.ftvfmgrFmgrCodeConp = ftvfmgrFmgrCodeConp;
        return this;
    }

    /**
     * Date Completed
     * <p>
     * Lineage reference object : FTVFUND_PROJ_COMPLETE_DATE
     * 
     */
    @JsonProperty("projCompleteDate")
    public Date getProjCompleteDate() {
        return projCompleteDate;
    }

    /**
     * Date Completed
     * <p>
     * Lineage reference object : FTVFUND_PROJ_COMPLETE_DATE
     * 
     */
    @JsonProperty("projCompleteDate")
    public void setProjCompleteDate(Date projCompleteDate) {
        this.projCompleteDate = projCompleteDate;
    }

    public FundCodeMaintenance100PutResponse withProjCompleteDate(Date projCompleteDate) {
        this.projCompleteDate = projCompleteDate;
        return this;
    }

    /**
     * Target Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_ALLOC_TGT
     * 
     */
    @JsonProperty("fundCodeAllocTgt")
    public String getFundCodeAllocTgt() {
        return fundCodeAllocTgt;
    }

    /**
     * Target Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_ALLOC_TGT
     * 
     */
    @JsonProperty("fundCodeAllocTgt")
    public void setFundCodeAllocTgt(String fundCodeAllocTgt) {
        this.fundCodeAllocTgt = fundCodeAllocTgt;
    }

    public FundCodeMaintenance100PutResponse withFundCodeAllocTgt(String fundCodeAllocTgt) {
        this.fundCodeAllocTgt = fundCodeAllocTgt;
        return this;
    }

    /**
     * Cumulative Authorized Amount
     * <p>
     * Lineage reference object : FTVFUND_CUM_COST_AMT
     * 
     */
    @JsonProperty("cumCostAmt")
    public Double getCumCostAmt() {
        return cumCostAmt;
    }

    /**
     * Cumulative Authorized Amount
     * <p>
     * Lineage reference object : FTVFUND_CUM_COST_AMT
     * 
     */
    @JsonProperty("cumCostAmt")
    public void setCumCostAmt(Double cumCostAmt) {
        this.cumCostAmt = cumCostAmt;
    }

    public FundCodeMaintenance100PutResponse withCumCostAmt(Double cumCostAmt) {
        this.cumCostAmt = cumCostAmt;
        return this;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("effCertAllocInd")
    public String getEffCertAllocInd() {
        return effCertAllocInd;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("effCertAllocInd")
    public void setEffCertAllocInd(String effCertAllocInd) {
        this.effCertAllocInd = effCertAllocInd;
    }

    public FundCodeMaintenance100PutResponse withEffCertAllocInd(String effCertAllocInd) {
        this.effCertAllocInd = effCertAllocInd;
        return this;
    }

    @JsonProperty("crbcDesc")
    public String getCrbcDesc() {
        return crbcDesc;
    }

    @JsonProperty("crbcDesc")
    public void setCrbcDesc(String crbcDesc) {
        this.crbcDesc = crbcDesc;
    }

    public FundCodeMaintenance100PutResponse withCrbcDesc(String crbcDesc) {
        this.crbcDesc = crbcDesc;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    public String getActvCodeCapDef() {
        return actvCodeCapDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    public void setActvCodeCapDef(String actvCodeCapDef) {
        this.actvCodeCapDef = actvCodeCapDef;
    }

    public FundCodeMaintenance100PutResponse withActvCodeCapDef(String actvCodeCapDef) {
        this.actvCodeCapDef = actvCodeCapDef;
        return this;
    }

    /**
     * Closed
     * <p>
     * Lineage reference object : FTVFUND_CLOSE_PROJ_IND
     * 
     */
    @JsonProperty("closeProjInd")
    public String getCloseProjInd() {
        return closeProjInd;
    }

    /**
     * Closed
     * <p>
     * Lineage reference object : FTVFUND_CLOSE_PROJ_IND
     * 
     */
    @JsonProperty("closeProjInd")
    public void setCloseProjInd(String closeProjInd) {
        this.closeProjInd = closeProjInd;
    }

    public FundCodeMaintenance100PutResponse withCloseProjInd(String closeProjInd) {
        this.closeProjInd = closeProjInd;
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

    public FundCodeMaintenance100PutResponse withCoasCode(String coasCode) {
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

    public FundCodeMaintenance100PutResponse withAcctTitle(String acctTitle) {
        this.acctTitle = acctTitle;
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

    public FundCodeMaintenance100PutResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public String getBavlKeyFund() {
        return bavlKeyFund;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public void setBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
    }

    public FundCodeMaintenance100PutResponse withBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public String getPropCode() {
        return propCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public void setPropCode(String propCode) {
        this.propCode = propCode;
    }

    public FundCodeMaintenance100PutResponse withPropCode(String propCode) {
        this.propCode = propCode;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FTVFUND_MAX_CONSTR_AMT
     * 
     */
    @JsonProperty("maxConstrAmt")
    public Double getMaxConstrAmt() {
        return maxConstrAmt;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FTVFUND_MAX_CONSTR_AMT
     * 
     */
    @JsonProperty("maxConstrAmt")
    public void setMaxConstrAmt(Double maxConstrAmt) {
        this.maxConstrAmt = maxConstrAmt;
    }

    public FundCodeMaintenance100PutResponse withMaxConstrAmt(Double maxConstrAmt) {
        this.maxConstrAmt = maxConstrAmt;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FundCodeMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public FundCodeMaintenance100PutResponse withAcctCodePlant(String acctCodePlant) {
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

    public FundCodeMaintenance100PutResponse withCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
        return this;
    }

    /**
     * Combination Control
     * <p>
     * Lineage reference object : FTVFUND_HIER_TABLE_IND
     * 
     */
    @JsonProperty("hierTableInd")
    public String getHierTableInd() {
        return hierTableInd;
    }

    /**
     * Combination Control
     * <p>
     * Lineage reference object : FTVFUND_HIER_TABLE_IND
     * 
     */
    @JsonProperty("hierTableInd")
    public void setHierTableInd(String hierTableInd) {
        this.hierTableInd = hierTableInd;
    }

    public FundCodeMaintenance100PutResponse withHierTableInd(String hierTableInd) {
        this.hierTableInd = hierTableInd;
        return this;
    }

    /**
     * Cost Share
     * <p>
     * Lineage reference object : FTVFUND_COST_CODE_CONP
     * 
     */
    @JsonProperty("costCodeConp")
    public String getCostCodeConp() {
        return costCodeConp;
    }

    /**
     * Cost Share
     * <p>
     * Lineage reference object : FTVFUND_COST_CODE_CONP
     * 
     */
    @JsonProperty("costCodeConp")
    public void setCostCodeConp(String costCodeConp) {
        this.costCodeConp = costCodeConp;
    }

    public FundCodeMaintenance100PutResponse withCostCodeConp(String costCodeConp) {
        this.costCodeConp = costCodeConp;
        return this;
    }

    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    public String getDeprExpEqDefInd() {
        return deprExpEqDefInd;
    }

    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFUND_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    public void setDeprExpEqDefInd(String deprExpEqDefInd) {
        this.deprExpEqDefInd = deprExpEqDefInd;
    }

    public FundCodeMaintenance100PutResponse withDeprExpEqDefInd(String deprExpEqDefInd) {
        this.deprExpEqDefInd = deprExpEqDefInd;
        return this;
    }

    @JsonProperty("ttlSrc")
    public String getTtlSrc() {
        return ttlSrc;
    }

    @JsonProperty("ttlSrc")
    public void setTtlSrc(String ttlSrc) {
        this.ttlSrc = ttlSrc;
    }

    public FundCodeMaintenance100PutResponse withTtlSrc(String ttlSrc) {
        this.ttlSrc = ttlSrc;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    public String getProgCodeCapDef() {
        return progCodeCapDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    public void setProgCodeCapDef(String progCodeCapDef) {
        this.progCodeCapDef = progCodeCapDef;
    }

    public FundCodeMaintenance100PutResponse withProgCodeCapDef(String progCodeCapDef) {
        this.progCodeCapDef = progCodeCapDef;
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

    public FundCodeMaintenance100PutResponse withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public String getBavlKeyAcct() {
        return bavlKeyAcct;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public void setBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
    }

    public FundCodeMaintenance100PutResponse withBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public String getBavlKeyProg() {
        return bavlKeyProg;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFUND_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public void setBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
    }

    public FundCodeMaintenance100PutResponse withBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
        return this;
    }

    /**
     * Construction in Process
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_CIP
     * 
     */
    @JsonProperty("acctCodeCip")
    public String getAcctCodeCip() {
        return acctCodeCip;
    }

    /**
     * Construction in Process
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_CIP
     * 
     */
    @JsonProperty("acctCodeCip")
    public void setAcctCodeCip(String acctCodeCip) {
        this.acctCodeCip = acctCodeCip;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeCip(String acctCodeCip) {
        this.acctCodeCip = acctCodeCip;
        return this;
    }

    /**
     * Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_EQUITY
     * 
     */
    @JsonProperty("acctCodeEquity")
    public String getAcctCodeEquity() {
        return acctCodeEquity;
    }

    /**
     * Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_EQUITY
     * 
     */
    @JsonProperty("acctCodeEquity")
    public void setAcctCodeEquity(String acctCodeEquity) {
        this.acctCodeEquity = acctCodeEquity;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeEquity(String acctCodeEquity) {
        this.acctCodeEquity = acctCodeEquity;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFUND_ALLOC_PCT
     * 
     */
    @JsonProperty("allocPct")
    public Double getAllocPct() {
        return allocPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFUND_ALLOC_PCT
     * 
     */
    @JsonProperty("allocPct")
    public void setAllocPct(Double allocPct) {
        this.allocPct = allocPct;
    }

    public FundCodeMaintenance100PutResponse withAllocPct(Double allocPct) {
        this.allocPct = allocPct;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVFUND_PROJ_DESC
     * 
     */
    @JsonProperty("projDesc")
    public String getProjDesc() {
        return projDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVFUND_PROJ_DESC
     * 
     */
    @JsonProperty("projDesc")
    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public FundCodeMaintenance100PutResponse withProjDesc(String projDesc) {
        this.projDesc = projDesc;
        return this;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FTVFUND_PROJ_START_DATE_CONP
     * 
     */
    @JsonProperty("projStartDateConp")
    public Date getProjStartDateConp() {
        return projStartDateConp;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FTVFUND_PROJ_START_DATE_CONP
     * 
     */
    @JsonProperty("projStartDateConp")
    public void setProjStartDateConp(Date projStartDateConp) {
        this.projStartDateConp = projStartDateConp;
    }

    public FundCodeMaintenance100PutResponse withProjStartDateConp(Date projStartDateConp) {
        this.projStartDateConp = projStartDateConp;
        return this;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FTVFUND_PROJ_END_DATE_CONP
     * 
     */
    @JsonProperty("projEndDateConp")
    public Date getProjEndDateConp() {
        return projEndDateConp;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FTVFUND_PROJ_END_DATE_CONP
     * 
     */
    @JsonProperty("projEndDateConp")
    public void setProjEndDateConp(Date projEndDateConp) {
        this.projEndDateConp = projEndDateConp;
    }

    public FundCodeMaintenance100PutResponse withProjEndDateConp(Date projEndDateConp) {
        this.projEndDateConp = projEndDateConp;
        return this;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFUND_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public String getBavlPeriod() {
        return bavlPeriod;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFUND_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public void setBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
    }

    public FundCodeMaintenance100PutResponse withBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
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

    public FundCodeMaintenance100PutResponse withExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
        return this;
    }

    /**
     * Contra-Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("acctCodeAllocContra")
    public String getAcctCodeAllocContra() {
        return acctCodeAllocContra;
    }

    /**
     * Contra-Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("acctCodeAllocContra")
    public void setAcctCodeAllocContra(String acctCodeAllocContra) {
        this.acctCodeAllocContra = acctCodeAllocContra;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeAllocContra(String acctCodeAllocContra) {
        this.acctCodeAllocContra = acctCodeAllocContra;
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

    public FundCodeMaintenance100PutResponse withOrgnCodeDef(String orgnCodeDef) {
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

    public FundCodeMaintenance100PutResponse withAcctCodeAccr(String acctCodeAccr) {
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

    public FundCodeMaintenance100PutResponse withFmgrNm(String fmgrNm) {
        this.fmgrNm = fmgrNm;
        return this;
    }

    @JsonProperty("ttlPred")
    public String getTtlPred() {
        return ttlPred;
    }

    @JsonProperty("ttlPred")
    public void setTtlPred(String ttlPred) {
        this.ttlPred = ttlPred;
    }

    public FundCodeMaintenance100PutResponse withTtlPred(String ttlPred) {
        this.ttlPred = ttlPred;
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

    public FundCodeMaintenance100PutResponse withFundCodePlant(String fundCodePlant) {
        this.fundCodePlant = fundCodePlant;
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

    public FundCodeMaintenance100PutResponse withOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public FundCodeMaintenance100PutResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    @JsonProperty("grntDesc")
    public String getGrntDesc() {
        return grntDesc;
    }

    @JsonProperty("grntDesc")
    public void setGrntDesc(String grntDesc) {
        this.grntDesc = grntDesc;
    }

    public FundCodeMaintenance100PutResponse withGrntDesc(String grntDesc) {
        this.grntDesc = grntDesc;
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

    public FundCodeMaintenance100PutResponse withEffCertRequiredInd(String effCertRequiredInd) {
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

    public FundCodeMaintenance100PutResponse withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
        return this;
    }

    /**
     * Gain Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    public String getAcctCodeGain() {
        return acctCodeGain;
    }

    /**
     * Gain Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    public void setAcctCodeGain(String acctCodeGain) {
        this.acctCodeGain = acctCodeGain;
    }

    public FundCodeMaintenance100PutResponse withAcctCodeGain(String acctCodeGain) {
        this.acctCodeGain = acctCodeGain;
        return this;
    }

    /**
     * Contra-Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("progCodeAllocContra")
    public String getProgCodeAllocContra() {
        return progCodeAllocContra;
    }

    /**
     * Contra-Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_ALLOC_CONTRA
     * 
     */
    @JsonProperty("progCodeAllocContra")
    public void setProgCodeAllocContra(String progCodeAllocContra) {
        this.progCodeAllocContra = progCodeAllocContra;
    }

    public FundCodeMaintenance100PutResponse withProgCodeAllocContra(String progCodeAllocContra) {
        this.progCodeAllocContra = progCodeAllocContra;
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

    public FundCodeMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundCodeMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("progTitle");
        sb.append('=');
        sb.append(((this.progTitle == null)?"<null>":this.progTitle));
        sb.append(',');
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
        sb.append("bankCodeDescr");
        sb.append('=');
        sb.append(((this.bankCodeDescr == null)?"<null>":this.bankCodeDescr));
        sb.append(',');
        sb.append("locnCodeCapDef");
        sb.append('=');
        sb.append(((this.locnCodeCapDef == null)?"<null>":this.locnCodeCapDef));
        sb.append(',');
        sb.append("acctCodeRev");
        sb.append('=');
        sb.append(((this.acctCodeRev == null)?"<null>":this.acctCodeRev));
        sb.append(',');
        sb.append("fundCodeBavl");
        sb.append('=');
        sb.append(((this.fundCodeBavl == null)?"<null>":this.fundCodeBavl));
        sb.append(',');
        sb.append("bavlSeverity");
        sb.append('=');
        sb.append(((this.bavlSeverity == null)?"<null>":this.bavlSeverity));
        sb.append(',');
        sb.append("fmgrNmC");
        sb.append('=');
        sb.append(((this.fmgrNmC == null)?"<null>":this.fmgrNmC));
        sb.append(',');
        sb.append("displayTitle");
        sb.append('=');
        sb.append(((this.displayTitle == null)?"<null>":this.displayTitle));
        sb.append(',');
        sb.append("bavlKeyOrgn");
        sb.append('=');
        sb.append(((this.bavlKeyOrgn == null)?"<null>":this.bavlKeyOrgn));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("orgnCodeCapDef");
        sb.append('=');
        sb.append(((this.orgnCodeCapDef == null)?"<null>":this.orgnCodeCapDef));
        sb.append(',');
        sb.append("fundCodeSource");
        sb.append('=');
        sb.append(((this.fundCodeSource == null)?"<null>":this.fundCodeSource));
        sb.append(',');
        sb.append("acctCodeAsset");
        sb.append('=');
        sb.append(((this.acctCodeAsset == null)?"<null>":this.acctCodeAsset));
        sb.append(',');
        sb.append("fundCodePred");
        sb.append('=');
        sb.append(((this.fundCodePred == null)?"<null>":this.fundCodePred));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("netAssetClassDescr");
        sb.append('=');
        sb.append(((this.netAssetClassDescr == null)?"<null>":this.netAssetClassDescr));
        sb.append(',');
        sb.append("conpProjNum");
        sb.append('=');
        sb.append(((this.conpProjNum == null)?"<null>":this.conpProjNum));
        sb.append(',');
        sb.append("acctCodeLoss");
        sb.append('=');
        sb.append(((this.acctCodeLoss == null)?"<null>":this.acctCodeLoss));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("ttlFtyp");
        sb.append('=');
        sb.append(((this.ttlFtyp == null)?"<null>":this.ttlFtyp));
        sb.append(',');
        sb.append("propDesc");
        sb.append('=');
        sb.append(((this.propDesc == null)?"<null>":this.propDesc));
        sb.append(',');
        sb.append("orgnCodeAllocContra");
        sb.append('=');
        sb.append(((this.orgnCodeAllocContra == null)?"<null>":this.orgnCodeAllocContra));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("revenueAcctDesc");
        sb.append('=');
        sb.append(((this.revenueAcctDesc == null)?"<null>":this.revenueAcctDesc));
        sb.append(',');
        sb.append("netAssetClassCode");
        sb.append('=');
        sb.append(((this.netAssetClassCode == null)?"<null>":this.netAssetClassCode));
        sb.append(',');
        sb.append("ftvfmgrFmgrCode");
        sb.append('=');
        sb.append(((this.ftvfmgrFmgrCode == null)?"<null>":this.ftvfmgrFmgrCode));
        sb.append(',');
        sb.append("deprPostCode");
        sb.append('=');
        sb.append(((this.deprPostCode == null)?"<null>":this.deprPostCode));
        sb.append(',');
        sb.append("accrAcctDesc");
        sb.append('=');
        sb.append(((this.accrAcctDesc == null)?"<null>":this.accrAcctDesc));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("fundCodePlantConp");
        sb.append('=');
        sb.append(((this.fundCodePlantConp == null)?"<null>":this.fundCodePlantConp));
        sb.append(',');
        sb.append("ctextInd");
        sb.append('=');
        sb.append(((this.ctextInd == null)?"<null>":this.ctextInd));
        sb.append(',');
        sb.append("ftvfmgrFmgrCodeConp");
        sb.append('=');
        sb.append(((this.ftvfmgrFmgrCodeConp == null)?"<null>":this.ftvfmgrFmgrCodeConp));
        sb.append(',');
        sb.append("projCompleteDate");
        sb.append('=');
        sb.append(((this.projCompleteDate == null)?"<null>":this.projCompleteDate));
        sb.append(',');
        sb.append("fundCodeAllocTgt");
        sb.append('=');
        sb.append(((this.fundCodeAllocTgt == null)?"<null>":this.fundCodeAllocTgt));
        sb.append(',');
        sb.append("cumCostAmt");
        sb.append('=');
        sb.append(((this.cumCostAmt == null)?"<null>":this.cumCostAmt));
        sb.append(',');
        sb.append("effCertAllocInd");
        sb.append('=');
        sb.append(((this.effCertAllocInd == null)?"<null>":this.effCertAllocInd));
        sb.append(',');
        sb.append("crbcDesc");
        sb.append('=');
        sb.append(((this.crbcDesc == null)?"<null>":this.crbcDesc));
        sb.append(',');
        sb.append("actvCodeCapDef");
        sb.append('=');
        sb.append(((this.actvCodeCapDef == null)?"<null>":this.actvCodeCapDef));
        sb.append(',');
        sb.append("closeProjInd");
        sb.append('=');
        sb.append(((this.closeProjInd == null)?"<null>":this.closeProjInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctTitle");
        sb.append('=');
        sb.append(((this.acctTitle == null)?"<null>":this.acctTitle));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("bavlKeyFund");
        sb.append('=');
        sb.append(((this.bavlKeyFund == null)?"<null>":this.bavlKeyFund));
        sb.append(',');
        sb.append("propCode");
        sb.append('=');
        sb.append(((this.propCode == null)?"<null>":this.propCode));
        sb.append(',');
        sb.append("maxConstrAmt");
        sb.append('=');
        sb.append(((this.maxConstrAmt == null)?"<null>":this.maxConstrAmt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acctCodePlant");
        sb.append('=');
        sb.append(((this.acctCodePlant == null)?"<null>":this.acctCodePlant));
        sb.append(',');
        sb.append("cashReceiptBankCode");
        sb.append('=');
        sb.append(((this.cashReceiptBankCode == null)?"<null>":this.cashReceiptBankCode));
        sb.append(',');
        sb.append("hierTableInd");
        sb.append('=');
        sb.append(((this.hierTableInd == null)?"<null>":this.hierTableInd));
        sb.append(',');
        sb.append("costCodeConp");
        sb.append('=');
        sb.append(((this.costCodeConp == null)?"<null>":this.costCodeConp));
        sb.append(',');
        sb.append("deprExpEqDefInd");
        sb.append('=');
        sb.append(((this.deprExpEqDefInd == null)?"<null>":this.deprExpEqDefInd));
        sb.append(',');
        sb.append("ttlSrc");
        sb.append('=');
        sb.append(((this.ttlSrc == null)?"<null>":this.ttlSrc));
        sb.append(',');
        sb.append("progCodeCapDef");
        sb.append('=');
        sb.append(((this.progCodeCapDef == null)?"<null>":this.progCodeCapDef));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("bavlKeyAcct");
        sb.append('=');
        sb.append(((this.bavlKeyAcct == null)?"<null>":this.bavlKeyAcct));
        sb.append(',');
        sb.append("bavlKeyProg");
        sb.append('=');
        sb.append(((this.bavlKeyProg == null)?"<null>":this.bavlKeyProg));
        sb.append(',');
        sb.append("acctCodeCip");
        sb.append('=');
        sb.append(((this.acctCodeCip == null)?"<null>":this.acctCodeCip));
        sb.append(',');
        sb.append("acctCodeEquity");
        sb.append('=');
        sb.append(((this.acctCodeEquity == null)?"<null>":this.acctCodeEquity));
        sb.append(',');
        sb.append("allocPct");
        sb.append('=');
        sb.append(((this.allocPct == null)?"<null>":this.allocPct));
        sb.append(',');
        sb.append("projDesc");
        sb.append('=');
        sb.append(((this.projDesc == null)?"<null>":this.projDesc));
        sb.append(',');
        sb.append("projStartDateConp");
        sb.append('=');
        sb.append(((this.projStartDateConp == null)?"<null>":this.projStartDateConp));
        sb.append(',');
        sb.append("projEndDateConp");
        sb.append('=');
        sb.append(((this.projEndDateConp == null)?"<null>":this.projEndDateConp));
        sb.append(',');
        sb.append("bavlPeriod");
        sb.append('=');
        sb.append(((this.bavlPeriod == null)?"<null>":this.bavlPeriod));
        sb.append(',');
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("acctCodeAllocContra");
        sb.append('=');
        sb.append(((this.acctCodeAllocContra == null)?"<null>":this.acctCodeAllocContra));
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
        sb.append("ttlPred");
        sb.append('=');
        sb.append(((this.ttlPred == null)?"<null>":this.ttlPred));
        sb.append(',');
        sb.append("fundCodePlant");
        sb.append('=');
        sb.append(((this.fundCodePlant == null)?"<null>":this.fundCodePlant));
        sb.append(',');
        sb.append("orgnTitle");
        sb.append('=');
        sb.append(((this.orgnTitle == null)?"<null>":this.orgnTitle));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("grntDesc");
        sb.append('=');
        sb.append(((this.grntDesc == null)?"<null>":this.grntDesc));
        sb.append(',');
        sb.append("effCertRequiredInd");
        sb.append('=');
        sb.append(((this.effCertRequiredInd == null)?"<null>":this.effCertRequiredInd));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
        sb.append(',');
        sb.append("acctCodeGain");
        sb.append('=');
        sb.append(((this.acctCodeGain == null)?"<null>":this.acctCodeGain));
        sb.append(',');
        sb.append("progCodeAllocContra");
        sb.append('=');
        sb.append(((this.progCodeAllocContra == null)?"<null>":this.progCodeAllocContra));
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
        result = ((result* 31)+((this.restInd == null)? 0 :this.restInd.hashCode()));
        result = ((result* 31)+((this.srcCapSameInd == null)? 0 :this.srcCapSameInd.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.fbalInd == null)? 0 :this.fbalInd.hashCode()));
        result = ((result* 31)+((this.bankCodeDescr == null)? 0 :this.bankCodeDescr.hashCode()));
        result = ((result* 31)+((this.locnCodeCapDef == null)? 0 :this.locnCodeCapDef.hashCode()));
        result = ((result* 31)+((this.acctCodeRev == null)? 0 :this.acctCodeRev.hashCode()));
        result = ((result* 31)+((this.fundCodeBavl == null)? 0 :this.fundCodeBavl.hashCode()));
        result = ((result* 31)+((this.bavlSeverity == null)? 0 :this.bavlSeverity.hashCode()));
        result = ((result* 31)+((this.fmgrNmC == null)? 0 :this.fmgrNmC.hashCode()));
        result = ((result* 31)+((this.displayTitle == null)? 0 :this.displayTitle.hashCode()));
        result = ((result* 31)+((this.bavlKeyOrgn == null)? 0 :this.bavlKeyOrgn.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.orgnCodeCapDef == null)? 0 :this.orgnCodeCapDef.hashCode()));
        result = ((result* 31)+((this.fundCodeSource == null)? 0 :this.fundCodeSource.hashCode()));
        result = ((result* 31)+((this.acctCodeAsset == null)? 0 :this.acctCodeAsset.hashCode()));
        result = ((result* 31)+((this.fundCodePred == null)? 0 :this.fundCodePred.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.netAssetClassDescr == null)? 0 :this.netAssetClassDescr.hashCode()));
        result = ((result* 31)+((this.conpProjNum == null)? 0 :this.conpProjNum.hashCode()));
        result = ((result* 31)+((this.acctCodeLoss == null)? 0 :this.acctCodeLoss.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.ttlFtyp == null)? 0 :this.ttlFtyp.hashCode()));
        result = ((result* 31)+((this.propDesc == null)? 0 :this.propDesc.hashCode()));
        result = ((result* 31)+((this.orgnCodeAllocContra == null)? 0 :this.orgnCodeAllocContra.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.revenueAcctDesc == null)? 0 :this.revenueAcctDesc.hashCode()));
        result = ((result* 31)+((this.netAssetClassCode == null)? 0 :this.netAssetClassCode.hashCode()));
        result = ((result* 31)+((this.ftvfmgrFmgrCode == null)? 0 :this.ftvfmgrFmgrCode.hashCode()));
        result = ((result* 31)+((this.deprPostCode == null)? 0 :this.deprPostCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accrAcctDesc == null)? 0 :this.accrAcctDesc.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.fundCodePlantConp == null)? 0 :this.fundCodePlantConp.hashCode()));
        result = ((result* 31)+((this.ctextInd == null)? 0 :this.ctextInd.hashCode()));
        result = ((result* 31)+((this.ftvfmgrFmgrCodeConp == null)? 0 :this.ftvfmgrFmgrCodeConp.hashCode()));
        result = ((result* 31)+((this.projCompleteDate == null)? 0 :this.projCompleteDate.hashCode()));
        result = ((result* 31)+((this.fundCodeAllocTgt == null)? 0 :this.fundCodeAllocTgt.hashCode()));
        result = ((result* 31)+((this.cumCostAmt == null)? 0 :this.cumCostAmt.hashCode()));
        result = ((result* 31)+((this.effCertAllocInd == null)? 0 :this.effCertAllocInd.hashCode()));
        result = ((result* 31)+((this.crbcDesc == null)? 0 :this.crbcDesc.hashCode()));
        result = ((result* 31)+((this.actvCodeCapDef == null)? 0 :this.actvCodeCapDef.hashCode()));
        result = ((result* 31)+((this.closeProjInd == null)? 0 :this.closeProjInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctTitle == null)? 0 :this.acctTitle.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.bavlKeyFund == null)? 0 :this.bavlKeyFund.hashCode()));
        result = ((result* 31)+((this.propCode == null)? 0 :this.propCode.hashCode()));
        result = ((result* 31)+((this.maxConstrAmt == null)? 0 :this.maxConstrAmt.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acctCodePlant == null)? 0 :this.acctCodePlant.hashCode()));
        result = ((result* 31)+((this.cashReceiptBankCode == null)? 0 :this.cashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.hierTableInd == null)? 0 :this.hierTableInd.hashCode()));
        result = ((result* 31)+((this.costCodeConp == null)? 0 :this.costCodeConp.hashCode()));
        result = ((result* 31)+((this.deprExpEqDefInd == null)? 0 :this.deprExpEqDefInd.hashCode()));
        result = ((result* 31)+((this.ttlSrc == null)? 0 :this.ttlSrc.hashCode()));
        result = ((result* 31)+((this.progCodeCapDef == null)? 0 :this.progCodeCapDef.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.bavlKeyAcct == null)? 0 :this.bavlKeyAcct.hashCode()));
        result = ((result* 31)+((this.bavlKeyProg == null)? 0 :this.bavlKeyProg.hashCode()));
        result = ((result* 31)+((this.acctCodeCip == null)? 0 :this.acctCodeCip.hashCode()));
        result = ((result* 31)+((this.acctCodeEquity == null)? 0 :this.acctCodeEquity.hashCode()));
        result = ((result* 31)+((this.allocPct == null)? 0 :this.allocPct.hashCode()));
        result = ((result* 31)+((this.projDesc == null)? 0 :this.projDesc.hashCode()));
        result = ((result* 31)+((this.projStartDateConp == null)? 0 :this.projStartDateConp.hashCode()));
        result = ((result* 31)+((this.projEndDateConp == null)? 0 :this.projEndDateConp.hashCode()));
        result = ((result* 31)+((this.bavlPeriod == null)? 0 :this.bavlPeriod.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.acctCodeAllocContra == null)? 0 :this.acctCodeAllocContra.hashCode()));
        result = ((result* 31)+((this.orgnCodeDef == null)? 0 :this.orgnCodeDef.hashCode()));
        result = ((result* 31)+((this.acctCodeAccr == null)? 0 :this.acctCodeAccr.hashCode()));
        result = ((result* 31)+((this.fmgrNm == null)? 0 :this.fmgrNm.hashCode()));
        result = ((result* 31)+((this.ttlPred == null)? 0 :this.ttlPred.hashCode()));
        result = ((result* 31)+((this.fundCodePlant == null)? 0 :this.fundCodePlant.hashCode()));
        result = ((result* 31)+((this.orgnTitle == null)? 0 :this.orgnTitle.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.grntDesc == null)? 0 :this.grntDesc.hashCode()));
        result = ((result* 31)+((this.effCertRequiredInd == null)? 0 :this.effCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        result = ((result* 31)+((this.acctCodeGain == null)? 0 :this.acctCodeGain.hashCode()));
        result = ((result* 31)+((this.progCodeAllocContra == null)? 0 :this.progCodeAllocContra.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundCodeMaintenance100PutResponse) == false) {
            return false;
        }
        FundCodeMaintenance100PutResponse rhs = ((FundCodeMaintenance100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.progTitle == rhs.progTitle)||((this.progTitle!= null)&&this.progTitle.equals(rhs.progTitle)))&&((this.restInd == rhs.restInd)||((this.restInd!= null)&&this.restInd.equals(rhs.restInd))))&&((this.srcCapSameInd == rhs.srcCapSameInd)||((this.srcCapSameInd!= null)&&this.srcCapSameInd.equals(rhs.srcCapSameInd))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.fbalInd == rhs.fbalInd)||((this.fbalInd!= null)&&this.fbalInd.equals(rhs.fbalInd))))&&((this.bankCodeDescr == rhs.bankCodeDescr)||((this.bankCodeDescr!= null)&&this.bankCodeDescr.equals(rhs.bankCodeDescr))))&&((this.locnCodeCapDef == rhs.locnCodeCapDef)||((this.locnCodeCapDef!= null)&&this.locnCodeCapDef.equals(rhs.locnCodeCapDef))))&&((this.acctCodeRev == rhs.acctCodeRev)||((this.acctCodeRev!= null)&&this.acctCodeRev.equals(rhs.acctCodeRev))))&&((this.fundCodeBavl == rhs.fundCodeBavl)||((this.fundCodeBavl!= null)&&this.fundCodeBavl.equals(rhs.fundCodeBavl))))&&((this.bavlSeverity == rhs.bavlSeverity)||((this.bavlSeverity!= null)&&this.bavlSeverity.equals(rhs.bavlSeverity))))&&((this.fmgrNmC == rhs.fmgrNmC)||((this.fmgrNmC!= null)&&this.fmgrNmC.equals(rhs.fmgrNmC))))&&((this.displayTitle == rhs.displayTitle)||((this.displayTitle!= null)&&this.displayTitle.equals(rhs.displayTitle))))&&((this.bavlKeyOrgn == rhs.bavlKeyOrgn)||((this.bavlKeyOrgn!= null)&&this.bavlKeyOrgn.equals(rhs.bavlKeyOrgn))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.orgnCodeCapDef == rhs.orgnCodeCapDef)||((this.orgnCodeCapDef!= null)&&this.orgnCodeCapDef.equals(rhs.orgnCodeCapDef))))&&((this.fundCodeSource == rhs.fundCodeSource)||((this.fundCodeSource!= null)&&this.fundCodeSource.equals(rhs.fundCodeSource))))&&((this.acctCodeAsset == rhs.acctCodeAsset)||((this.acctCodeAsset!= null)&&this.acctCodeAsset.equals(rhs.acctCodeAsset))))&&((this.fundCodePred == rhs.fundCodePred)||((this.fundCodePred!= null)&&this.fundCodePred.equals(rhs.fundCodePred))))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.netAssetClassDescr == rhs.netAssetClassDescr)||((this.netAssetClassDescr!= null)&&this.netAssetClassDescr.equals(rhs.netAssetClassDescr))))&&((this.conpProjNum == rhs.conpProjNum)||((this.conpProjNum!= null)&&this.conpProjNum.equals(rhs.conpProjNum))))&&((this.acctCodeLoss == rhs.acctCodeLoss)||((this.acctCodeLoss!= null)&&this.acctCodeLoss.equals(rhs.acctCodeLoss))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.ttlFtyp == rhs.ttlFtyp)||((this.ttlFtyp!= null)&&this.ttlFtyp.equals(rhs.ttlFtyp))))&&((this.propDesc == rhs.propDesc)||((this.propDesc!= null)&&this.propDesc.equals(rhs.propDesc))))&&((this.orgnCodeAllocContra == rhs.orgnCodeAllocContra)||((this.orgnCodeAllocContra!= null)&&this.orgnCodeAllocContra.equals(rhs.orgnCodeAllocContra))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.revenueAcctDesc == rhs.revenueAcctDesc)||((this.revenueAcctDesc!= null)&&this.revenueAcctDesc.equals(rhs.revenueAcctDesc))))&&((this.netAssetClassCode == rhs.netAssetClassCode)||((this.netAssetClassCode!= null)&&this.netAssetClassCode.equals(rhs.netAssetClassCode))))&&((this.ftvfmgrFmgrCode == rhs.ftvfmgrFmgrCode)||((this.ftvfmgrFmgrCode!= null)&&this.ftvfmgrFmgrCode.equals(rhs.ftvfmgrFmgrCode))))&&((this.deprPostCode == rhs.deprPostCode)||((this.deprPostCode!= null)&&this.deprPostCode.equals(rhs.deprPostCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accrAcctDesc == rhs.accrAcctDesc)||((this.accrAcctDesc!= null)&&this.accrAcctDesc.equals(rhs.accrAcctDesc))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.fundCodePlantConp == rhs.fundCodePlantConp)||((this.fundCodePlantConp!= null)&&this.fundCodePlantConp.equals(rhs.fundCodePlantConp))))&&((this.ctextInd == rhs.ctextInd)||((this.ctextInd!= null)&&this.ctextInd.equals(rhs.ctextInd))))&&((this.ftvfmgrFmgrCodeConp == rhs.ftvfmgrFmgrCodeConp)||((this.ftvfmgrFmgrCodeConp!= null)&&this.ftvfmgrFmgrCodeConp.equals(rhs.ftvfmgrFmgrCodeConp))))&&((this.projCompleteDate == rhs.projCompleteDate)||((this.projCompleteDate!= null)&&this.projCompleteDate.equals(rhs.projCompleteDate))))&&((this.fundCodeAllocTgt == rhs.fundCodeAllocTgt)||((this.fundCodeAllocTgt!= null)&&this.fundCodeAllocTgt.equals(rhs.fundCodeAllocTgt))))&&((this.cumCostAmt == rhs.cumCostAmt)||((this.cumCostAmt!= null)&&this.cumCostAmt.equals(rhs.cumCostAmt))))&&((this.effCertAllocInd == rhs.effCertAllocInd)||((this.effCertAllocInd!= null)&&this.effCertAllocInd.equals(rhs.effCertAllocInd))))&&((this.crbcDesc == rhs.crbcDesc)||((this.crbcDesc!= null)&&this.crbcDesc.equals(rhs.crbcDesc))))&&((this.actvCodeCapDef == rhs.actvCodeCapDef)||((this.actvCodeCapDef!= null)&&this.actvCodeCapDef.equals(rhs.actvCodeCapDef))))&&((this.closeProjInd == rhs.closeProjInd)||((this.closeProjInd!= null)&&this.closeProjInd.equals(rhs.closeProjInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctTitle == rhs.acctTitle)||((this.acctTitle!= null)&&this.acctTitle.equals(rhs.acctTitle))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.bavlKeyFund == rhs.bavlKeyFund)||((this.bavlKeyFund!= null)&&this.bavlKeyFund.equals(rhs.bavlKeyFund))))&&((this.propCode == rhs.propCode)||((this.propCode!= null)&&this.propCode.equals(rhs.propCode))))&&((this.maxConstrAmt == rhs.maxConstrAmt)||((this.maxConstrAmt!= null)&&this.maxConstrAmt.equals(rhs.maxConstrAmt))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acctCodePlant == rhs.acctCodePlant)||((this.acctCodePlant!= null)&&this.acctCodePlant.equals(rhs.acctCodePlant))))&&((this.cashReceiptBankCode == rhs.cashReceiptBankCode)||((this.cashReceiptBankCode!= null)&&this.cashReceiptBankCode.equals(rhs.cashReceiptBankCode))))&&((this.hierTableInd == rhs.hierTableInd)||((this.hierTableInd!= null)&&this.hierTableInd.equals(rhs.hierTableInd))))&&((this.costCodeConp == rhs.costCodeConp)||((this.costCodeConp!= null)&&this.costCodeConp.equals(rhs.costCodeConp))))&&((this.deprExpEqDefInd == rhs.deprExpEqDefInd)||((this.deprExpEqDefInd!= null)&&this.deprExpEqDefInd.equals(rhs.deprExpEqDefInd))))&&((this.ttlSrc == rhs.ttlSrc)||((this.ttlSrc!= null)&&this.ttlSrc.equals(rhs.ttlSrc))))&&((this.progCodeCapDef == rhs.progCodeCapDef)||((this.progCodeCapDef!= null)&&this.progCodeCapDef.equals(rhs.progCodeCapDef))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.bavlKeyAcct == rhs.bavlKeyAcct)||((this.bavlKeyAcct!= null)&&this.bavlKeyAcct.equals(rhs.bavlKeyAcct))))&&((this.bavlKeyProg == rhs.bavlKeyProg)||((this.bavlKeyProg!= null)&&this.bavlKeyProg.equals(rhs.bavlKeyProg))))&&((this.acctCodeCip == rhs.acctCodeCip)||((this.acctCodeCip!= null)&&this.acctCodeCip.equals(rhs.acctCodeCip))))&&((this.acctCodeEquity == rhs.acctCodeEquity)||((this.acctCodeEquity!= null)&&this.acctCodeEquity.equals(rhs.acctCodeEquity))))&&((this.allocPct == rhs.allocPct)||((this.allocPct!= null)&&this.allocPct.equals(rhs.allocPct))))&&((this.projDesc == rhs.projDesc)||((this.projDesc!= null)&&this.projDesc.equals(rhs.projDesc))))&&((this.projStartDateConp == rhs.projStartDateConp)||((this.projStartDateConp!= null)&&this.projStartDateConp.equals(rhs.projStartDateConp))))&&((this.projEndDateConp == rhs.projEndDateConp)||((this.projEndDateConp!= null)&&this.projEndDateConp.equals(rhs.projEndDateConp))))&&((this.bavlPeriod == rhs.bavlPeriod)||((this.bavlPeriod!= null)&&this.bavlPeriod.equals(rhs.bavlPeriod))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.acctCodeAllocContra == rhs.acctCodeAllocContra)||((this.acctCodeAllocContra!= null)&&this.acctCodeAllocContra.equals(rhs.acctCodeAllocContra))))&&((this.orgnCodeDef == rhs.orgnCodeDef)||((this.orgnCodeDef!= null)&&this.orgnCodeDef.equals(rhs.orgnCodeDef))))&&((this.acctCodeAccr == rhs.acctCodeAccr)||((this.acctCodeAccr!= null)&&this.acctCodeAccr.equals(rhs.acctCodeAccr))))&&((this.fmgrNm == rhs.fmgrNm)||((this.fmgrNm!= null)&&this.fmgrNm.equals(rhs.fmgrNm))))&&((this.ttlPred == rhs.ttlPred)||((this.ttlPred!= null)&&this.ttlPred.equals(rhs.ttlPred))))&&((this.fundCodePlant == rhs.fundCodePlant)||((this.fundCodePlant!= null)&&this.fundCodePlant.equals(rhs.fundCodePlant))))&&((this.orgnTitle == rhs.orgnTitle)||((this.orgnTitle!= null)&&this.orgnTitle.equals(rhs.orgnTitle))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.grntDesc == rhs.grntDesc)||((this.grntDesc!= null)&&this.grntDesc.equals(rhs.grntDesc))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))))&&((this.acctCodeGain == rhs.acctCodeGain)||((this.acctCodeGain!= null)&&this.acctCodeGain.equals(rhs.acctCodeGain))))&&((this.progCodeAllocContra == rhs.progCodeAllocContra)||((this.progCodeAllocContra!= null)&&this.progCodeAllocContra.equals(rhs.progCodeAllocContra))));
    }

}
