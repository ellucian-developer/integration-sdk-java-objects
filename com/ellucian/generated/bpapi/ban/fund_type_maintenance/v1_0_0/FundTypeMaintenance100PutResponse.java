
package com.ellucian.generated.bpapi.ban.fund_type_maintenance.v1_0_0;

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
    "budgetRollPercent",
    "cfType",
    "locnCodeCapDef",
    "encumbranceTypeTitle",
    "bavlSeverity",
    "controlDescription",
    "organizationDescription",
    "effDate",
    "encMultYrInd",
    "statusInd",
    "orgnCodeCapDef",
    "encBudgetOverrideInd",
    "defOverrideInd",
    "capFundTitle",
    "ftypCodePred",
    "commitType",
    "bavlKeyOrg",
    "ruclCodeRollEnc",
    "acctCodeLoss",
    "severityDescription",
    "internalFtypTitle",
    "budgetDisposition",
    "ruclCodeBudgCf",
    "budgetTypeTitle",
    "deprPostCode",
    "budgetRoll",
    "termDate",
    "ftypCode",
    "accountDescription",
    "internalFtypCode",
    "fundCodeCap",
    "actvCodeCapDef",
    "coasCode",
    "title",
    "bavlKeyFund",
    "budgClassification",
    "activityDate",
    "deprExpEqDefInd",
    "progCodeCapDef",
    "bavlKeyAcct",
    "bavlKeyProg",
    "predFundTypeTitle",
    "bavlPeriod",
    "fundDescription",
    "budgCfPercent",
    "capAccountTitle",
    "programDescription",
    "displayNchgDate",
    "acctCodeCap",
    "acctCodeGain"
})
@Generated("jsonschema2pojo")
public class FundTypeMaintenance100PutResponse {

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL_PERCENT
     * 
     */
    @JsonProperty("budgetRollPercent")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BUDGET_ROLL_PERCENT")
    private Double budgetRollPercent;
    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVFTYP_CF_TYPE
     * 
     */
    @JsonProperty("cfType")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_CF_TYPE")
    private String cfType;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVFTYP_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_LOCN_CODE_CAP_DEF")
    private String locnCodeCapDef;
    @JsonProperty("encumbranceTypeTitle")
    private String encumbranceTypeTitle;
    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_SEVERITY")
    private String bavlSeverity;
    @JsonProperty("controlDescription")
    private String controlDescription;
    @JsonProperty("organizationDescription")
    private String organizationDescription;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_EFF_DATE")
    private Date effDate;
    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ENC_MULT_YR_IND")
    private String encMultYrInd;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_STATUS_IND")
    private String statusInd;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ORGN_CODE_CAP_DEF")
    private String orgnCodeCapDef;
    /**
     * Encumbrance Budget Override
     * <p>
     * 
     * 
     */
    @JsonProperty("encBudgetOverrideInd")
    private String encBudgetOverrideInd;
    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("defOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND")
    private String defOverrideInd;
    @JsonProperty("capFundTitle")
    private String capFundTitle;
    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp")
    private String ftypCodePred;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVFTYP_COMMIT_TYPE
     * 
     */
    @JsonProperty("commitType")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COMMIT_TYPE")
    private String commitType;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("bavlKeyOrg")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_ORG")
    private String bavlKeyOrg;
    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl")
    private String ruclCodeRollEnc;
    /**
     * Loss  Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_LOSS")
    private String acctCodeLoss;
    @JsonProperty("severityDescription")
    private String severityDescription;
    @JsonProperty("internalFtypTitle")
    private String internalFtypTitle;
    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_DISPOSITION
     * 
     */
    @JsonProperty("budgetDisposition")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BUDGET_DISPOSITION")
    private String budgetDisposition;
    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl")
    private String ruclCodeBudgCf;
    @JsonProperty("budgetTypeTitle")
    private String budgetTypeTitle;
    /**
     * Depreciation or Posting Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEPR_POST_CODE")
    private String deprPostCode;
    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL
     * 
     */
    @JsonProperty("budgetRoll")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BUDGET_ROLL")
    private String budgetRoll;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TERM_DATE")
    private Date termDate;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String ftypCode;
    @JsonProperty("accountDescription")
    private String accountDescription;
    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE")
    private String internalFtypCode;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FUND_CODE_CAP")
    private String fundCodeCap;
    /**
     * Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACTV_CODE_CAP_DEF")
    private String actvCodeCapDef;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TITLE")
    private String title;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_FUND")
    private String bavlKeyFund;
    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CLASSIFICATION
     * 
     */
    @JsonProperty("budgClassification")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BUDG_CLASSIFICATION")
    private String budgClassification;
    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEPR_EXP_EQ_DEF_IND")
    private String deprExpEqDefInd;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_PROG_CODE_CAP_DEF")
    private String progCodeCapDef;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_ACCT")
    private String bavlKeyAcct;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_PROG")
    private String bavlKeyProg;
    @JsonProperty("predFundTypeTitle")
    private String predFundTypeTitle;
    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_PERIOD")
    private String bavlPeriod;
    /**
     * Budget Control
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    private String fundDescription;
    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CF_PERCENT
     * 
     */
    @JsonProperty("budgCfPercent")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BUDG_CF_PERCENT")
    private Double budgCfPercent;
    @JsonProperty("capAccountTitle")
    private String capAccountTitle;
    @JsonProperty("programDescription")
    private String programDescription;
    /**
     * Next Change
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_CAP")
    private String acctCodeCap;
    /**
     * Gain Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_GAIN")
    private String acctCodeGain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL_PERCENT
     * 
     */
    @JsonProperty("budgetRollPercent")
    public Double getBudgetRollPercent() {
        return budgetRollPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL_PERCENT
     * 
     */
    @JsonProperty("budgetRollPercent")
    public void setBudgetRollPercent(Double budgetRollPercent) {
        this.budgetRollPercent = budgetRollPercent;
    }

    public FundTypeMaintenance100PutResponse withBudgetRollPercent(Double budgetRollPercent) {
        this.budgetRollPercent = budgetRollPercent;
        return this;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVFTYP_CF_TYPE
     * 
     */
    @JsonProperty("cfType")
    public String getCfType() {
        return cfType;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVFTYP_CF_TYPE
     * 
     */
    @JsonProperty("cfType")
    public void setCfType(String cfType) {
        this.cfType = cfType;
    }

    public FundTypeMaintenance100PutResponse withCfType(String cfType) {
        this.cfType = cfType;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVFTYP_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    public String getLocnCodeCapDef() {
        return locnCodeCapDef;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVFTYP_LOCN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("locnCodeCapDef")
    public void setLocnCodeCapDef(String locnCodeCapDef) {
        this.locnCodeCapDef = locnCodeCapDef;
    }

    public FundTypeMaintenance100PutResponse withLocnCodeCapDef(String locnCodeCapDef) {
        this.locnCodeCapDef = locnCodeCapDef;
        return this;
    }

    @JsonProperty("encumbranceTypeTitle")
    public String getEncumbranceTypeTitle() {
        return encumbranceTypeTitle;
    }

    @JsonProperty("encumbranceTypeTitle")
    public void setEncumbranceTypeTitle(String encumbranceTypeTitle) {
        this.encumbranceTypeTitle = encumbranceTypeTitle;
    }

    public FundTypeMaintenance100PutResponse withEncumbranceTypeTitle(String encumbranceTypeTitle) {
        this.encumbranceTypeTitle = encumbranceTypeTitle;
        return this;
    }

    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public String getBavlSeverity() {
        return bavlSeverity;
    }

    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public void setBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
    }

    public FundTypeMaintenance100PutResponse withBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
        return this;
    }

    @JsonProperty("controlDescription")
    public String getControlDescription() {
        return controlDescription;
    }

    @JsonProperty("controlDescription")
    public void setControlDescription(String controlDescription) {
        this.controlDescription = controlDescription;
    }

    public FundTypeMaintenance100PutResponse withControlDescription(String controlDescription) {
        this.controlDescription = controlDescription;
        return this;
    }

    @JsonProperty("organizationDescription")
    public String getOrganizationDescription() {
        return organizationDescription;
    }

    @JsonProperty("organizationDescription")
    public void setOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
    }

    public FundTypeMaintenance100PutResponse withOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
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
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FundTypeMaintenance100PutResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public String getEncMultYrInd() {
        return encMultYrInd;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public void setEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
    }

    public FundTypeMaintenance100PutResponse withEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FundTypeMaintenance100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    public String getOrgnCodeCapDef() {
        return orgnCodeCapDef;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_ORGN_CODE_CAP_DEF
     * 
     */
    @JsonProperty("orgnCodeCapDef")
    public void setOrgnCodeCapDef(String orgnCodeCapDef) {
        this.orgnCodeCapDef = orgnCodeCapDef;
    }

    public FundTypeMaintenance100PutResponse withOrgnCodeCapDef(String orgnCodeCapDef) {
        this.orgnCodeCapDef = orgnCodeCapDef;
        return this;
    }

    /**
     * Encumbrance Budget Override
     * <p>
     * 
     * 
     */
    @JsonProperty("encBudgetOverrideInd")
    public String getEncBudgetOverrideInd() {
        return encBudgetOverrideInd;
    }

    /**
     * Encumbrance Budget Override
     * <p>
     * 
     * 
     */
    @JsonProperty("encBudgetOverrideInd")
    public void setEncBudgetOverrideInd(String encBudgetOverrideInd) {
        this.encBudgetOverrideInd = encBudgetOverrideInd;
    }

    public FundTypeMaintenance100PutResponse withEncBudgetOverrideInd(String encBudgetOverrideInd) {
        this.encBudgetOverrideInd = encBudgetOverrideInd;
        return this;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("defOverrideInd")
    public String getDefOverrideInd() {
        return defOverrideInd;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("defOverrideInd")
    public void setDefOverrideInd(String defOverrideInd) {
        this.defOverrideInd = defOverrideInd;
    }

    public FundTypeMaintenance100PutResponse withDefOverrideInd(String defOverrideInd) {
        this.defOverrideInd = defOverrideInd;
        return this;
    }

    @JsonProperty("capFundTitle")
    public String getCapFundTitle() {
        return capFundTitle;
    }

    @JsonProperty("capFundTitle")
    public void setCapFundTitle(String capFundTitle) {
        this.capFundTitle = capFundTitle;
    }

    public FundTypeMaintenance100PutResponse withCapFundTitle(String capFundTitle) {
        this.capFundTitle = capFundTitle;
        return this;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    public String getFtypCodePred() {
        return ftypCodePred;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    public void setFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
    }

    public FundTypeMaintenance100PutResponse withFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVFTYP_COMMIT_TYPE
     * 
     */
    @JsonProperty("commitType")
    public String getCommitType() {
        return commitType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVFTYP_COMMIT_TYPE
     * 
     */
    @JsonProperty("commitType")
    public void setCommitType(String commitType) {
        this.commitType = commitType;
    }

    public FundTypeMaintenance100PutResponse withCommitType(String commitType) {
        this.commitType = commitType;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("bavlKeyOrg")
    public String getBavlKeyOrg() {
        return bavlKeyOrg;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("bavlKeyOrg")
    public void setBavlKeyOrg(String bavlKeyOrg) {
        this.bavlKeyOrg = bavlKeyOrg;
    }

    public FundTypeMaintenance100PutResponse withBavlKeyOrg(String bavlKeyOrg) {
        this.bavlKeyOrg = bavlKeyOrg;
        return this;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    public String getRuclCodeRollEnc() {
        return ruclCodeRollEnc;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    public void setRuclCodeRollEnc(String ruclCodeRollEnc) {
        this.ruclCodeRollEnc = ruclCodeRollEnc;
    }

    public FundTypeMaintenance100PutResponse withRuclCodeRollEnc(String ruclCodeRollEnc) {
        this.ruclCodeRollEnc = ruclCodeRollEnc;
        return this;
    }

    /**
     * Loss  Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    public String getAcctCodeLoss() {
        return acctCodeLoss;
    }

    /**
     * Loss  Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_LOSS
     * 
     */
    @JsonProperty("acctCodeLoss")
    public void setAcctCodeLoss(String acctCodeLoss) {
        this.acctCodeLoss = acctCodeLoss;
    }

    public FundTypeMaintenance100PutResponse withAcctCodeLoss(String acctCodeLoss) {
        this.acctCodeLoss = acctCodeLoss;
        return this;
    }

    @JsonProperty("severityDescription")
    public String getSeverityDescription() {
        return severityDescription;
    }

    @JsonProperty("severityDescription")
    public void setSeverityDescription(String severityDescription) {
        this.severityDescription = severityDescription;
    }

    public FundTypeMaintenance100PutResponse withSeverityDescription(String severityDescription) {
        this.severityDescription = severityDescription;
        return this;
    }

    @JsonProperty("internalFtypTitle")
    public String getInternalFtypTitle() {
        return internalFtypTitle;
    }

    @JsonProperty("internalFtypTitle")
    public void setInternalFtypTitle(String internalFtypTitle) {
        this.internalFtypTitle = internalFtypTitle;
    }

    public FundTypeMaintenance100PutResponse withInternalFtypTitle(String internalFtypTitle) {
        this.internalFtypTitle = internalFtypTitle;
        return this;
    }

    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_DISPOSITION
     * 
     */
    @JsonProperty("budgetDisposition")
    public String getBudgetDisposition() {
        return budgetDisposition;
    }

    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_DISPOSITION
     * 
     */
    @JsonProperty("budgetDisposition")
    public void setBudgetDisposition(String budgetDisposition) {
        this.budgetDisposition = budgetDisposition;
    }

    public FundTypeMaintenance100PutResponse withBudgetDisposition(String budgetDisposition) {
        this.budgetDisposition = budgetDisposition;
        return this;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    public String getRuclCodeBudgCf() {
        return ruclCodeBudgCf;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FTVFTYP_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    public void setRuclCodeBudgCf(String ruclCodeBudgCf) {
        this.ruclCodeBudgCf = ruclCodeBudgCf;
    }

    public FundTypeMaintenance100PutResponse withRuclCodeBudgCf(String ruclCodeBudgCf) {
        this.ruclCodeBudgCf = ruclCodeBudgCf;
        return this;
    }

    @JsonProperty("budgetTypeTitle")
    public String getBudgetTypeTitle() {
        return budgetTypeTitle;
    }

    @JsonProperty("budgetTypeTitle")
    public void setBudgetTypeTitle(String budgetTypeTitle) {
        this.budgetTypeTitle = budgetTypeTitle;
    }

    public FundTypeMaintenance100PutResponse withBudgetTypeTitle(String budgetTypeTitle) {
        this.budgetTypeTitle = budgetTypeTitle;
        return this;
    }

    /**
     * Depreciation or Posting Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    public String getDeprPostCode() {
        return deprPostCode;
    }

    /**
     * Depreciation or Posting Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_POST_CODE
     * 
     */
    @JsonProperty("deprPostCode")
    public void setDeprPostCode(String deprPostCode) {
        this.deprPostCode = deprPostCode;
    }

    public FundTypeMaintenance100PutResponse withDeprPostCode(String deprPostCode) {
        this.deprPostCode = deprPostCode;
        return this;
    }

    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL
     * 
     */
    @JsonProperty("budgetRoll")
    public String getBudgetRoll() {
        return budgetRoll;
    }

    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVFTYP_BUDGET_ROLL
     * 
     */
    @JsonProperty("budgetRoll")
    public void setBudgetRoll(String budgetRoll) {
        this.budgetRoll = budgetRoll;
    }

    public FundTypeMaintenance100PutResponse withBudgetRoll(String budgetRoll) {
        this.budgetRoll = budgetRoll;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FundTypeMaintenance100PutResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
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
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public FundTypeMaintenance100PutResponse withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    @JsonProperty("accountDescription")
    public String getAccountDescription() {
        return accountDescription;
    }

    @JsonProperty("accountDescription")
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public FundTypeMaintenance100PutResponse withAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    public String getInternalFtypCode() {
        return internalFtypCode;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    public void setInternalFtypCode(String internalFtypCode) {
        this.internalFtypCode = internalFtypCode;
    }

    public FundTypeMaintenance100PutResponse withInternalFtypCode(String internalFtypCode) {
        this.internalFtypCode = internalFtypCode;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public String getFundCodeCap() {
        return fundCodeCap;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public void setFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
    }

    public FundTypeMaintenance100PutResponse withFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    public String getActvCodeCapDef() {
        return actvCodeCapDef;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTV_CODE_CAP_DEF
     * 
     */
    @JsonProperty("actvCodeCapDef")
    public void setActvCodeCapDef(String actvCodeCapDef) {
        this.actvCodeCapDef = actvCodeCapDef;
    }

    public FundTypeMaintenance100PutResponse withActvCodeCapDef(String actvCodeCapDef) {
        this.actvCodeCapDef = actvCodeCapDef;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FundTypeMaintenance100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
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
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FundTypeMaintenance100PutResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public String getBavlKeyFund() {
        return bavlKeyFund;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public void setBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
    }

    public FundTypeMaintenance100PutResponse withBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
        return this;
    }

    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CLASSIFICATION
     * 
     */
    @JsonProperty("budgClassification")
    public String getBudgClassification() {
        return budgClassification;
    }

    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CLASSIFICATION
     * 
     */
    @JsonProperty("budgClassification")
    public void setBudgClassification(String budgClassification) {
        this.budgClassification = budgClassification;
    }

    public FundTypeMaintenance100PutResponse withBudgClassification(String budgClassification) {
        this.budgClassification = budgClassification;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FundTypeMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    public String getDeprExpEqDefInd() {
        return deprExpEqDefInd;
    }

    /**
     * Expense or Equity Account Default Indicator
     * <p>
     * Lineage reference object : FTVFTYP_DEPR_EXP_EQ_DEF_IND
     * 
     */
    @JsonProperty("deprExpEqDefInd")
    public void setDeprExpEqDefInd(String deprExpEqDefInd) {
        this.deprExpEqDefInd = deprExpEqDefInd;
    }

    public FundTypeMaintenance100PutResponse withDeprExpEqDefInd(String deprExpEqDefInd) {
        this.deprExpEqDefInd = deprExpEqDefInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    public String getProgCodeCapDef() {
        return progCodeCapDef;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_PROG_CODE_CAP_DEF
     * 
     */
    @JsonProperty("progCodeCapDef")
    public void setProgCodeCapDef(String progCodeCapDef) {
        this.progCodeCapDef = progCodeCapDef;
    }

    public FundTypeMaintenance100PutResponse withProgCodeCapDef(String progCodeCapDef) {
        this.progCodeCapDef = progCodeCapDef;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public String getBavlKeyAcct() {
        return bavlKeyAcct;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public void setBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
    }

    public FundTypeMaintenance100PutResponse withBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public String getBavlKeyProg() {
        return bavlKeyProg;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public void setBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
    }

    public FundTypeMaintenance100PutResponse withBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
        return this;
    }

    @JsonProperty("predFundTypeTitle")
    public String getPredFundTypeTitle() {
        return predFundTypeTitle;
    }

    @JsonProperty("predFundTypeTitle")
    public void setPredFundTypeTitle(String predFundTypeTitle) {
        this.predFundTypeTitle = predFundTypeTitle;
    }

    public FundTypeMaintenance100PutResponse withPredFundTypeTitle(String predFundTypeTitle) {
        this.predFundTypeTitle = predFundTypeTitle;
        return this;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public String getBavlPeriod() {
        return bavlPeriod;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public void setBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
    }

    public FundTypeMaintenance100PutResponse withBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
        return this;
    }

    /**
     * Budget Control
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Budget Control
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public FundTypeMaintenance100PutResponse withFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CF_PERCENT
     * 
     */
    @JsonProperty("budgCfPercent")
    public Double getBudgCfPercent() {
        return budgCfPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVFTYP_BUDG_CF_PERCENT
     * 
     */
    @JsonProperty("budgCfPercent")
    public void setBudgCfPercent(Double budgCfPercent) {
        this.budgCfPercent = budgCfPercent;
    }

    public FundTypeMaintenance100PutResponse withBudgCfPercent(Double budgCfPercent) {
        this.budgCfPercent = budgCfPercent;
        return this;
    }

    @JsonProperty("capAccountTitle")
    public String getCapAccountTitle() {
        return capAccountTitle;
    }

    @JsonProperty("capAccountTitle")
    public void setCapAccountTitle(String capAccountTitle) {
        this.capAccountTitle = capAccountTitle;
    }

    public FundTypeMaintenance100PutResponse withCapAccountTitle(String capAccountTitle) {
        this.capAccountTitle = capAccountTitle;
        return this;
    }

    @JsonProperty("programDescription")
    public String getProgramDescription() {
        return programDescription;
    }

    @JsonProperty("programDescription")
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public FundTypeMaintenance100PutResponse withProgramDescription(String programDescription) {
        this.programDescription = programDescription;
        return this;
    }

    /**
     * Next Change
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public FundTypeMaintenance100PutResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public String getAcctCodeCap() {
        return acctCodeCap;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public void setAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
    }

    public FundTypeMaintenance100PutResponse withAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
        return this;
    }

    /**
     * Gain Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    public String getAcctCodeGain() {
        return acctCodeGain;
    }

    /**
     * Gain Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_GAIN
     * 
     */
    @JsonProperty("acctCodeGain")
    public void setAcctCodeGain(String acctCodeGain) {
        this.acctCodeGain = acctCodeGain;
    }

    public FundTypeMaintenance100PutResponse withAcctCodeGain(String acctCodeGain) {
        this.acctCodeGain = acctCodeGain;
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

    public FundTypeMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundTypeMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("budgetRollPercent");
        sb.append('=');
        sb.append(((this.budgetRollPercent == null)?"<null>":this.budgetRollPercent));
        sb.append(',');
        sb.append("cfType");
        sb.append('=');
        sb.append(((this.cfType == null)?"<null>":this.cfType));
        sb.append(',');
        sb.append("locnCodeCapDef");
        sb.append('=');
        sb.append(((this.locnCodeCapDef == null)?"<null>":this.locnCodeCapDef));
        sb.append(',');
        sb.append("encumbranceTypeTitle");
        sb.append('=');
        sb.append(((this.encumbranceTypeTitle == null)?"<null>":this.encumbranceTypeTitle));
        sb.append(',');
        sb.append("bavlSeverity");
        sb.append('=');
        sb.append(((this.bavlSeverity == null)?"<null>":this.bavlSeverity));
        sb.append(',');
        sb.append("controlDescription");
        sb.append('=');
        sb.append(((this.controlDescription == null)?"<null>":this.controlDescription));
        sb.append(',');
        sb.append("organizationDescription");
        sb.append('=');
        sb.append(((this.organizationDescription == null)?"<null>":this.organizationDescription));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("encMultYrInd");
        sb.append('=');
        sb.append(((this.encMultYrInd == null)?"<null>":this.encMultYrInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("orgnCodeCapDef");
        sb.append('=');
        sb.append(((this.orgnCodeCapDef == null)?"<null>":this.orgnCodeCapDef));
        sb.append(',');
        sb.append("encBudgetOverrideInd");
        sb.append('=');
        sb.append(((this.encBudgetOverrideInd == null)?"<null>":this.encBudgetOverrideInd));
        sb.append(',');
        sb.append("defOverrideInd");
        sb.append('=');
        sb.append(((this.defOverrideInd == null)?"<null>":this.defOverrideInd));
        sb.append(',');
        sb.append("capFundTitle");
        sb.append('=');
        sb.append(((this.capFundTitle == null)?"<null>":this.capFundTitle));
        sb.append(',');
        sb.append("ftypCodePred");
        sb.append('=');
        sb.append(((this.ftypCodePred == null)?"<null>":this.ftypCodePred));
        sb.append(',');
        sb.append("commitType");
        sb.append('=');
        sb.append(((this.commitType == null)?"<null>":this.commitType));
        sb.append(',');
        sb.append("bavlKeyOrg");
        sb.append('=');
        sb.append(((this.bavlKeyOrg == null)?"<null>":this.bavlKeyOrg));
        sb.append(',');
        sb.append("ruclCodeRollEnc");
        sb.append('=');
        sb.append(((this.ruclCodeRollEnc == null)?"<null>":this.ruclCodeRollEnc));
        sb.append(',');
        sb.append("acctCodeLoss");
        sb.append('=');
        sb.append(((this.acctCodeLoss == null)?"<null>":this.acctCodeLoss));
        sb.append(',');
        sb.append("severityDescription");
        sb.append('=');
        sb.append(((this.severityDescription == null)?"<null>":this.severityDescription));
        sb.append(',');
        sb.append("internalFtypTitle");
        sb.append('=');
        sb.append(((this.internalFtypTitle == null)?"<null>":this.internalFtypTitle));
        sb.append(',');
        sb.append("budgetDisposition");
        sb.append('=');
        sb.append(((this.budgetDisposition == null)?"<null>":this.budgetDisposition));
        sb.append(',');
        sb.append("ruclCodeBudgCf");
        sb.append('=');
        sb.append(((this.ruclCodeBudgCf == null)?"<null>":this.ruclCodeBudgCf));
        sb.append(',');
        sb.append("budgetTypeTitle");
        sb.append('=');
        sb.append(((this.budgetTypeTitle == null)?"<null>":this.budgetTypeTitle));
        sb.append(',');
        sb.append("deprPostCode");
        sb.append('=');
        sb.append(((this.deprPostCode == null)?"<null>":this.deprPostCode));
        sb.append(',');
        sb.append("budgetRoll");
        sb.append('=');
        sb.append(((this.budgetRoll == null)?"<null>":this.budgetRoll));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("accountDescription");
        sb.append('=');
        sb.append(((this.accountDescription == null)?"<null>":this.accountDescription));
        sb.append(',');
        sb.append("internalFtypCode");
        sb.append('=');
        sb.append(((this.internalFtypCode == null)?"<null>":this.internalFtypCode));
        sb.append(',');
        sb.append("fundCodeCap");
        sb.append('=');
        sb.append(((this.fundCodeCap == null)?"<null>":this.fundCodeCap));
        sb.append(',');
        sb.append("actvCodeCapDef");
        sb.append('=');
        sb.append(((this.actvCodeCapDef == null)?"<null>":this.actvCodeCapDef));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("bavlKeyFund");
        sb.append('=');
        sb.append(((this.bavlKeyFund == null)?"<null>":this.bavlKeyFund));
        sb.append(',');
        sb.append("budgClassification");
        sb.append('=');
        sb.append(((this.budgClassification == null)?"<null>":this.budgClassification));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("deprExpEqDefInd");
        sb.append('=');
        sb.append(((this.deprExpEqDefInd == null)?"<null>":this.deprExpEqDefInd));
        sb.append(',');
        sb.append("progCodeCapDef");
        sb.append('=');
        sb.append(((this.progCodeCapDef == null)?"<null>":this.progCodeCapDef));
        sb.append(',');
        sb.append("bavlKeyAcct");
        sb.append('=');
        sb.append(((this.bavlKeyAcct == null)?"<null>":this.bavlKeyAcct));
        sb.append(',');
        sb.append("bavlKeyProg");
        sb.append('=');
        sb.append(((this.bavlKeyProg == null)?"<null>":this.bavlKeyProg));
        sb.append(',');
        sb.append("predFundTypeTitle");
        sb.append('=');
        sb.append(((this.predFundTypeTitle == null)?"<null>":this.predFundTypeTitle));
        sb.append(',');
        sb.append("bavlPeriod");
        sb.append('=');
        sb.append(((this.bavlPeriod == null)?"<null>":this.bavlPeriod));
        sb.append(',');
        sb.append("fundDescription");
        sb.append('=');
        sb.append(((this.fundDescription == null)?"<null>":this.fundDescription));
        sb.append(',');
        sb.append("budgCfPercent");
        sb.append('=');
        sb.append(((this.budgCfPercent == null)?"<null>":this.budgCfPercent));
        sb.append(',');
        sb.append("capAccountTitle");
        sb.append('=');
        sb.append(((this.capAccountTitle == null)?"<null>":this.capAccountTitle));
        sb.append(',');
        sb.append("programDescription");
        sb.append('=');
        sb.append(((this.programDescription == null)?"<null>":this.programDescription));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("acctCodeCap");
        sb.append('=');
        sb.append(((this.acctCodeCap == null)?"<null>":this.acctCodeCap));
        sb.append(',');
        sb.append("acctCodeGain");
        sb.append('=');
        sb.append(((this.acctCodeGain == null)?"<null>":this.acctCodeGain));
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
        result = ((result* 31)+((this.budgetRollPercent == null)? 0 :this.budgetRollPercent.hashCode()));
        result = ((result* 31)+((this.cfType == null)? 0 :this.cfType.hashCode()));
        result = ((result* 31)+((this.locnCodeCapDef == null)? 0 :this.locnCodeCapDef.hashCode()));
        result = ((result* 31)+((this.encumbranceTypeTitle == null)? 0 :this.encumbranceTypeTitle.hashCode()));
        result = ((result* 31)+((this.bavlSeverity == null)? 0 :this.bavlSeverity.hashCode()));
        result = ((result* 31)+((this.controlDescription == null)? 0 :this.controlDescription.hashCode()));
        result = ((result* 31)+((this.organizationDescription == null)? 0 :this.organizationDescription.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.encMultYrInd == null)? 0 :this.encMultYrInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.orgnCodeCapDef == null)? 0 :this.orgnCodeCapDef.hashCode()));
        result = ((result* 31)+((this.encBudgetOverrideInd == null)? 0 :this.encBudgetOverrideInd.hashCode()));
        result = ((result* 31)+((this.defOverrideInd == null)? 0 :this.defOverrideInd.hashCode()));
        result = ((result* 31)+((this.capFundTitle == null)? 0 :this.capFundTitle.hashCode()));
        result = ((result* 31)+((this.ftypCodePred == null)? 0 :this.ftypCodePred.hashCode()));
        result = ((result* 31)+((this.commitType == null)? 0 :this.commitType.hashCode()));
        result = ((result* 31)+((this.bavlKeyOrg == null)? 0 :this.bavlKeyOrg.hashCode()));
        result = ((result* 31)+((this.ruclCodeRollEnc == null)? 0 :this.ruclCodeRollEnc.hashCode()));
        result = ((result* 31)+((this.acctCodeLoss == null)? 0 :this.acctCodeLoss.hashCode()));
        result = ((result* 31)+((this.severityDescription == null)? 0 :this.severityDescription.hashCode()));
        result = ((result* 31)+((this.internalFtypTitle == null)? 0 :this.internalFtypTitle.hashCode()));
        result = ((result* 31)+((this.budgetDisposition == null)? 0 :this.budgetDisposition.hashCode()));
        result = ((result* 31)+((this.ruclCodeBudgCf == null)? 0 :this.ruclCodeBudgCf.hashCode()));
        result = ((result* 31)+((this.budgetTypeTitle == null)? 0 :this.budgetTypeTitle.hashCode()));
        result = ((result* 31)+((this.deprPostCode == null)? 0 :this.deprPostCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.budgetRoll == null)? 0 :this.budgetRoll.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.accountDescription == null)? 0 :this.accountDescription.hashCode()));
        result = ((result* 31)+((this.internalFtypCode == null)? 0 :this.internalFtypCode.hashCode()));
        result = ((result* 31)+((this.fundCodeCap == null)? 0 :this.fundCodeCap.hashCode()));
        result = ((result* 31)+((this.actvCodeCapDef == null)? 0 :this.actvCodeCapDef.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.bavlKeyFund == null)? 0 :this.bavlKeyFund.hashCode()));
        result = ((result* 31)+((this.budgClassification == null)? 0 :this.budgClassification.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.deprExpEqDefInd == null)? 0 :this.deprExpEqDefInd.hashCode()));
        result = ((result* 31)+((this.progCodeCapDef == null)? 0 :this.progCodeCapDef.hashCode()));
        result = ((result* 31)+((this.bavlKeyAcct == null)? 0 :this.bavlKeyAcct.hashCode()));
        result = ((result* 31)+((this.bavlKeyProg == null)? 0 :this.bavlKeyProg.hashCode()));
        result = ((result* 31)+((this.predFundTypeTitle == null)? 0 :this.predFundTypeTitle.hashCode()));
        result = ((result* 31)+((this.bavlPeriod == null)? 0 :this.bavlPeriod.hashCode()));
        result = ((result* 31)+((this.fundDescription == null)? 0 :this.fundDescription.hashCode()));
        result = ((result* 31)+((this.budgCfPercent == null)? 0 :this.budgCfPercent.hashCode()));
        result = ((result* 31)+((this.capAccountTitle == null)? 0 :this.capAccountTitle.hashCode()));
        result = ((result* 31)+((this.programDescription == null)? 0 :this.programDescription.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.acctCodeCap == null)? 0 :this.acctCodeCap.hashCode()));
        result = ((result* 31)+((this.acctCodeGain == null)? 0 :this.acctCodeGain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundTypeMaintenance100PutResponse) == false) {
            return false;
        }
        FundTypeMaintenance100PutResponse rhs = ((FundTypeMaintenance100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.budgetRollPercent == rhs.budgetRollPercent)||((this.budgetRollPercent!= null)&&this.budgetRollPercent.equals(rhs.budgetRollPercent)))&&((this.cfType == rhs.cfType)||((this.cfType!= null)&&this.cfType.equals(rhs.cfType))))&&((this.locnCodeCapDef == rhs.locnCodeCapDef)||((this.locnCodeCapDef!= null)&&this.locnCodeCapDef.equals(rhs.locnCodeCapDef))))&&((this.encumbranceTypeTitle == rhs.encumbranceTypeTitle)||((this.encumbranceTypeTitle!= null)&&this.encumbranceTypeTitle.equals(rhs.encumbranceTypeTitle))))&&((this.bavlSeverity == rhs.bavlSeverity)||((this.bavlSeverity!= null)&&this.bavlSeverity.equals(rhs.bavlSeverity))))&&((this.controlDescription == rhs.controlDescription)||((this.controlDescription!= null)&&this.controlDescription.equals(rhs.controlDescription))))&&((this.organizationDescription == rhs.organizationDescription)||((this.organizationDescription!= null)&&this.organizationDescription.equals(rhs.organizationDescription))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.encMultYrInd == rhs.encMultYrInd)||((this.encMultYrInd!= null)&&this.encMultYrInd.equals(rhs.encMultYrInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.orgnCodeCapDef == rhs.orgnCodeCapDef)||((this.orgnCodeCapDef!= null)&&this.orgnCodeCapDef.equals(rhs.orgnCodeCapDef))))&&((this.encBudgetOverrideInd == rhs.encBudgetOverrideInd)||((this.encBudgetOverrideInd!= null)&&this.encBudgetOverrideInd.equals(rhs.encBudgetOverrideInd))))&&((this.defOverrideInd == rhs.defOverrideInd)||((this.defOverrideInd!= null)&&this.defOverrideInd.equals(rhs.defOverrideInd))))&&((this.capFundTitle == rhs.capFundTitle)||((this.capFundTitle!= null)&&this.capFundTitle.equals(rhs.capFundTitle))))&&((this.ftypCodePred == rhs.ftypCodePred)||((this.ftypCodePred!= null)&&this.ftypCodePred.equals(rhs.ftypCodePred))))&&((this.commitType == rhs.commitType)||((this.commitType!= null)&&this.commitType.equals(rhs.commitType))))&&((this.bavlKeyOrg == rhs.bavlKeyOrg)||((this.bavlKeyOrg!= null)&&this.bavlKeyOrg.equals(rhs.bavlKeyOrg))))&&((this.ruclCodeRollEnc == rhs.ruclCodeRollEnc)||((this.ruclCodeRollEnc!= null)&&this.ruclCodeRollEnc.equals(rhs.ruclCodeRollEnc))))&&((this.acctCodeLoss == rhs.acctCodeLoss)||((this.acctCodeLoss!= null)&&this.acctCodeLoss.equals(rhs.acctCodeLoss))))&&((this.severityDescription == rhs.severityDescription)||((this.severityDescription!= null)&&this.severityDescription.equals(rhs.severityDescription))))&&((this.internalFtypTitle == rhs.internalFtypTitle)||((this.internalFtypTitle!= null)&&this.internalFtypTitle.equals(rhs.internalFtypTitle))))&&((this.budgetDisposition == rhs.budgetDisposition)||((this.budgetDisposition!= null)&&this.budgetDisposition.equals(rhs.budgetDisposition))))&&((this.ruclCodeBudgCf == rhs.ruclCodeBudgCf)||((this.ruclCodeBudgCf!= null)&&this.ruclCodeBudgCf.equals(rhs.ruclCodeBudgCf))))&&((this.budgetTypeTitle == rhs.budgetTypeTitle)||((this.budgetTypeTitle!= null)&&this.budgetTypeTitle.equals(rhs.budgetTypeTitle))))&&((this.deprPostCode == rhs.deprPostCode)||((this.deprPostCode!= null)&&this.deprPostCode.equals(rhs.deprPostCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.budgetRoll == rhs.budgetRoll)||((this.budgetRoll!= null)&&this.budgetRoll.equals(rhs.budgetRoll))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.accountDescription == rhs.accountDescription)||((this.accountDescription!= null)&&this.accountDescription.equals(rhs.accountDescription))))&&((this.internalFtypCode == rhs.internalFtypCode)||((this.internalFtypCode!= null)&&this.internalFtypCode.equals(rhs.internalFtypCode))))&&((this.fundCodeCap == rhs.fundCodeCap)||((this.fundCodeCap!= null)&&this.fundCodeCap.equals(rhs.fundCodeCap))))&&((this.actvCodeCapDef == rhs.actvCodeCapDef)||((this.actvCodeCapDef!= null)&&this.actvCodeCapDef.equals(rhs.actvCodeCapDef))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.bavlKeyFund == rhs.bavlKeyFund)||((this.bavlKeyFund!= null)&&this.bavlKeyFund.equals(rhs.bavlKeyFund))))&&((this.budgClassification == rhs.budgClassification)||((this.budgClassification!= null)&&this.budgClassification.equals(rhs.budgClassification))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.deprExpEqDefInd == rhs.deprExpEqDefInd)||((this.deprExpEqDefInd!= null)&&this.deprExpEqDefInd.equals(rhs.deprExpEqDefInd))))&&((this.progCodeCapDef == rhs.progCodeCapDef)||((this.progCodeCapDef!= null)&&this.progCodeCapDef.equals(rhs.progCodeCapDef))))&&((this.bavlKeyAcct == rhs.bavlKeyAcct)||((this.bavlKeyAcct!= null)&&this.bavlKeyAcct.equals(rhs.bavlKeyAcct))))&&((this.bavlKeyProg == rhs.bavlKeyProg)||((this.bavlKeyProg!= null)&&this.bavlKeyProg.equals(rhs.bavlKeyProg))))&&((this.predFundTypeTitle == rhs.predFundTypeTitle)||((this.predFundTypeTitle!= null)&&this.predFundTypeTitle.equals(rhs.predFundTypeTitle))))&&((this.bavlPeriod == rhs.bavlPeriod)||((this.bavlPeriod!= null)&&this.bavlPeriod.equals(rhs.bavlPeriod))))&&((this.fundDescription == rhs.fundDescription)||((this.fundDescription!= null)&&this.fundDescription.equals(rhs.fundDescription))))&&((this.budgCfPercent == rhs.budgCfPercent)||((this.budgCfPercent!= null)&&this.budgCfPercent.equals(rhs.budgCfPercent))))&&((this.capAccountTitle == rhs.capAccountTitle)||((this.capAccountTitle!= null)&&this.capAccountTitle.equals(rhs.capAccountTitle))))&&((this.programDescription == rhs.programDescription)||((this.programDescription!= null)&&this.programDescription.equals(rhs.programDescription))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.acctCodeCap == rhs.acctCodeCap)||((this.acctCodeCap!= null)&&this.acctCodeCap.equals(rhs.acctCodeCap))))&&((this.acctCodeGain == rhs.acctCodeGain)||((this.acctCodeGain!= null)&&this.acctCodeGain.equals(rhs.acctCodeGain))));
    }

}
