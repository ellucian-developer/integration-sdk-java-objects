
package com.ellucian.generated.bpapi.ban.chart_of_accounts_code_maintenance.v1_0_0;

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
    "locnAttributeInd",
    "progAttributeInd",
    "budgetRollPercent",
    "bavlSeverity",
    "calEndMonth",
    "acctCodeFundDueFrm",
    "rollReqInd",
    "bavlKeyOrgn",
    "effDate",
    "ruclCodeCloseOp",
    "statusInd",
    "viewEncBudInd",
    "acctCodeAccrualAp",
    "fundAttributeInd",
    "dueToTitle",
    "rollLaborEncInd",
    "acctAttributeInd",
    "commitType",
    "ruclCodeRollEnc",
    "calStartMonth",
    "acctAccrApTitle",
    "rollMemoResInd",
    "budgCfTitle",
    "budgetDisposition",
    "ruclCodeBudgCf",
    "calStartDay",
    "budgetRoll",
    "termDate",
    "dueFromTitle",
    "bavlPeriodDescr",
    "rollPoInd",
    "methOfAcctg",
    "rollEncTitle",
    "closeOpTitle",
    "coasCode",
    "bavlSeverityDescr",
    "calEndDay",
    "title",
    "bavlKeyFund",
    "fundBalTitle",
    "actvAttributeInd",
    "budgClassification",
    "activityDate",
    "acctAccrArTitle",
    "bavlKeyAcct",
    "bavlKeyProg",
    "acctCodeAccrualAr",
    "budgCfType",
    "acctCodeFundBal",
    "bavlPeriod",
    "acctCodeFundDueTo",
    "rollWoInd",
    "budgCfPercent",
    "displayNchgDate",
    "rollEncInd",
    "orgnAttributeInd"
})
@Generated("jsonschema2pojo")
public class ChartOfAccountsCodeMaintenance100GetResponse {

    /**
     * Lineage reference object : FTVCOAS_LOCN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("locnAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_LOCN_ATTRIBUTE_IND")
    private String locnAttributeInd;
    /**
     * Lineage reference object : FTVCOAS_PROG_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("progAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_PROG_ATTRIBUTE_IND")
    private String progAttributeInd;
    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgetRollPercent")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDGET_ROLL_PERCENT")
    private Double budgetRollPercent;
    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * (Required)
     * 
     */
    @JsonProperty("bavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_SEVERITY")
    private String bavlSeverity;
    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calEndMonth")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_END_MONTH")
    private String calEndMonth;
    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM")
    private String acctCodeFundDueFrm;
    /**
     * Requisitions
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_REQ_IND
     * 
     */
    @JsonProperty("rollReqInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_REQ_IND")
    private String rollReqInd;
    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_KEY_ORGN")
    private String bavlKeyOrgn;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_EFF_DATE")
    private Date effDate;
    /**
     * Close OP Ledger Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_CLOSE_OP, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeCloseOp")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_RUCL_CODE_CLOSE_OP, Lookup lineage reference object : ftvrucl")
    private String ruclCodeCloseOp;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_STATUS_IND")
    private String statusInd;
    /**
     * Encumbrance or Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("viewEncBudInd")
    private String viewEncBudInd;
    /**
     * Accounts Payable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AP
     * 
     */
    @JsonProperty("acctCodeAccrualAp")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AP")
    private String acctCodeAccrualAp;
    /**
     * Lineage reference object : FTVCOAS_FUND_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("fundAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_FUND_ATTRIBUTE_IND")
    private String fundAttributeInd;
    @JsonProperty("dueToTitle")
    private String dueToTitle;
    /**
     * Labor Encumbrance
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_LABOR_ENC_IND
     * 
     */
    @JsonProperty("rollLaborEncInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_LABOR_ENC_IND")
    private String rollLaborEncInd;
    /**
     * Lineage reference object : FTVCOAS_ACCT_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("acctAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_ATTRIBUTE_IND")
    private String acctAttributeInd;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVCOAS_COMMIT_TYPE
     * (Required)
     * 
     */
    @JsonProperty("commitType")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_COMMIT_TYPE")
    private String commitType;
    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl")
    private String ruclCodeRollEnc;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calStartMonth")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_START_MONTH")
    private String calStartMonth;
    @JsonProperty("acctAccrApTitle")
    private String acctAccrApTitle;
    /**
     * Memo Reservations
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_MEMO_RES_IND
     * 
     */
    @JsonProperty("rollMemoResInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_MEMO_RES_IND")
    private String rollMemoResInd;
    @JsonProperty("budgCfTitle")
    private String budgCfTitle;
    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("budgetDisposition")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDGET_DISPOSITION")
    private String budgetDisposition;
    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl")
    private String ruclCodeBudgCf;
    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * (Required)
     * 
     */
    @JsonProperty("calStartDay")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_START_DAY")
    private String calStartDay;
    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL
     * (Required)
     * 
     */
    @JsonProperty("budgetRoll")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDGET_ROLL")
    private String budgetRoll;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_TERM_DATE")
    private Date termDate;
    @JsonProperty("dueFromTitle")
    private String dueFromTitle;
    @JsonProperty("bavlPeriodDescr")
    private String bavlPeriodDescr;
    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_PO_IND
     * 
     */
    @JsonProperty("rollPoInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_PO_IND")
    private String rollPoInd;
    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * (Required)
     * 
     */
    @JsonProperty("methOfAcctg")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_METH_OF_ACCTG")
    private String methOfAcctg;
    @JsonProperty("rollEncTitle")
    private String rollEncTitle;
    @JsonProperty("closeOpTitle")
    private String closeOpTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    @JsonProperty("bavlSeverityDescr")
    private String bavlSeverityDescr;
    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * (Required)
     * 
     */
    @JsonProperty("calEndDay")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_END_DAY")
    private String calEndDay;
    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_TITLE")
    private String title;
    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_KEY_FUND")
    private String bavlKeyFund;
    @JsonProperty("fundBalTitle")
    private String fundBalTitle;
    /**
     * Lineage reference object : FTVCOAS_ACTV_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("actvAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACTV_ATTRIBUTE_IND")
    private String actvAttributeInd;
    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CLASSIFICATION
     * (Required)
     * 
     */
    @JsonProperty("budgClassification")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDG_CLASSIFICATION")
    private String budgClassification;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("acctAccrArTitle")
    private String acctAccrArTitle;
    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_KEY_ACCT")
    private String bavlKeyAcct;
    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_KEY_PROG")
    private String bavlKeyProg;
    /**
     * Accounts Receivable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AR
     * 
     */
    @JsonProperty("acctCodeAccrualAr")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AR")
    private String acctCodeAccrualAr;
    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgCfType")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDG_CF_TYPE")
    private String budgCfType;
    /**
     * Fund Balance Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_BAL
     * 
     */
    @JsonProperty("acctCodeFundBal")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_FUND_BAL")
    private String acctCodeFundBal;
    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("bavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_PERIOD")
    private String bavlPeriod;
    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO")
    private String acctCodeFundDueTo;
    /**
     * Work Order
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_WO_IND
     * 
     */
    @JsonProperty("rollWoInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_WO_IND")
    private String rollWoInd;
    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgCfPercent")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BUDG_CF_PERCENT")
    private Double budgCfPercent;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_ENC_IND
     * 
     */
    @JsonProperty("rollEncInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ROLL_ENC_IND")
    private String rollEncInd;
    /**
     * Lineage reference object : FTVCOAS_ORGN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("orgnAttributeInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ORGN_ATTRIBUTE_IND")
    private String orgnAttributeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : FTVCOAS_LOCN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("locnAttributeInd")
    public String getLocnAttributeInd() {
        return locnAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_LOCN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("locnAttributeInd")
    public void setLocnAttributeInd(String locnAttributeInd) {
        this.locnAttributeInd = locnAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withLocnAttributeInd(String locnAttributeInd) {
        this.locnAttributeInd = locnAttributeInd;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_PROG_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("progAttributeInd")
    public String getProgAttributeInd() {
        return progAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_PROG_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("progAttributeInd")
    public void setProgAttributeInd(String progAttributeInd) {
        this.progAttributeInd = progAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withProgAttributeInd(String progAttributeInd) {
        this.progAttributeInd = progAttributeInd;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgetRollPercent")
    public Double getBudgetRollPercent() {
        return budgetRollPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgetRollPercent")
    public void setBudgetRollPercent(Double budgetRollPercent) {
        this.budgetRollPercent = budgetRollPercent;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgetRollPercent(Double budgetRollPercent) {
        this.budgetRollPercent = budgetRollPercent;
        return this;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * (Required)
     * 
     */
    @JsonProperty("bavlSeverity")
    public String getBavlSeverity() {
        return bavlSeverity;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * (Required)
     * 
     */
    @JsonProperty("bavlSeverity")
    public void setBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
        return this;
    }

    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calEndMonth")
    public String getCalEndMonth() {
        return calEndMonth;
    }

    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calEndMonth")
    public void setCalEndMonth(String calEndMonth) {
        this.calEndMonth = calEndMonth;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCalEndMonth(String calEndMonth) {
        this.calEndMonth = calEndMonth;
        return this;
    }

    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    public String getAcctCodeFundDueFrm() {
        return acctCodeFundDueFrm;
    }

    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    public void setAcctCodeFundDueFrm(String acctCodeFundDueFrm) {
        this.acctCodeFundDueFrm = acctCodeFundDueFrm;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctCodeFundDueFrm(String acctCodeFundDueFrm) {
        this.acctCodeFundDueFrm = acctCodeFundDueFrm;
        return this;
    }

    /**
     * Requisitions
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_REQ_IND
     * 
     */
    @JsonProperty("rollReqInd")
    public String getRollReqInd() {
        return rollReqInd;
    }

    /**
     * Requisitions
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_REQ_IND
     * 
     */
    @JsonProperty("rollReqInd")
    public void setRollReqInd(String rollReqInd) {
        this.rollReqInd = rollReqInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollReqInd(String rollReqInd) {
        this.rollReqInd = rollReqInd;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    public String getBavlKeyOrgn() {
        return bavlKeyOrgn;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ORGN
     * 
     */
    @JsonProperty("bavlKeyOrgn")
    public void setBavlKeyOrgn(String bavlKeyOrgn) {
        this.bavlKeyOrgn = bavlKeyOrgn;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlKeyOrgn(String bavlKeyOrgn) {
        this.bavlKeyOrgn = bavlKeyOrgn;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Close OP Ledger Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_CLOSE_OP, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeCloseOp")
    public String getRuclCodeCloseOp() {
        return ruclCodeCloseOp;
    }

    /**
     * Close OP Ledger Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_CLOSE_OP, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeCloseOp")
    public void setRuclCodeCloseOp(String ruclCodeCloseOp) {
        this.ruclCodeCloseOp = ruclCodeCloseOp;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRuclCodeCloseOp(String ruclCodeCloseOp) {
        this.ruclCodeCloseOp = ruclCodeCloseOp;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Encumbrance or Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("viewEncBudInd")
    public String getViewEncBudInd() {
        return viewEncBudInd;
    }

    /**
     * Encumbrance or Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("viewEncBudInd")
    public void setViewEncBudInd(String viewEncBudInd) {
        this.viewEncBudInd = viewEncBudInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withViewEncBudInd(String viewEncBudInd) {
        this.viewEncBudInd = viewEncBudInd;
        return this;
    }

    /**
     * Accounts Payable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AP
     * 
     */
    @JsonProperty("acctCodeAccrualAp")
    public String getAcctCodeAccrualAp() {
        return acctCodeAccrualAp;
    }

    /**
     * Accounts Payable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AP
     * 
     */
    @JsonProperty("acctCodeAccrualAp")
    public void setAcctCodeAccrualAp(String acctCodeAccrualAp) {
        this.acctCodeAccrualAp = acctCodeAccrualAp;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctCodeAccrualAp(String acctCodeAccrualAp) {
        this.acctCodeAccrualAp = acctCodeAccrualAp;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_FUND_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("fundAttributeInd")
    public String getFundAttributeInd() {
        return fundAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_FUND_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("fundAttributeInd")
    public void setFundAttributeInd(String fundAttributeInd) {
        this.fundAttributeInd = fundAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withFundAttributeInd(String fundAttributeInd) {
        this.fundAttributeInd = fundAttributeInd;
        return this;
    }

    @JsonProperty("dueToTitle")
    public String getDueToTitle() {
        return dueToTitle;
    }

    @JsonProperty("dueToTitle")
    public void setDueToTitle(String dueToTitle) {
        this.dueToTitle = dueToTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withDueToTitle(String dueToTitle) {
        this.dueToTitle = dueToTitle;
        return this;
    }

    /**
     * Labor Encumbrance
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_LABOR_ENC_IND
     * 
     */
    @JsonProperty("rollLaborEncInd")
    public String getRollLaborEncInd() {
        return rollLaborEncInd;
    }

    /**
     * Labor Encumbrance
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_LABOR_ENC_IND
     * 
     */
    @JsonProperty("rollLaborEncInd")
    public void setRollLaborEncInd(String rollLaborEncInd) {
        this.rollLaborEncInd = rollLaborEncInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollLaborEncInd(String rollLaborEncInd) {
        this.rollLaborEncInd = rollLaborEncInd;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_ACCT_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("acctAttributeInd")
    public String getAcctAttributeInd() {
        return acctAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_ACCT_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("acctAttributeInd")
    public void setAcctAttributeInd(String acctAttributeInd) {
        this.acctAttributeInd = acctAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctAttributeInd(String acctAttributeInd) {
        this.acctAttributeInd = acctAttributeInd;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVCOAS_COMMIT_TYPE
     * (Required)
     * 
     */
    @JsonProperty("commitType")
    public String getCommitType() {
        return commitType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : FTVCOAS_COMMIT_TYPE
     * (Required)
     * 
     */
    @JsonProperty("commitType")
    public void setCommitType(String commitType) {
        this.commitType = commitType;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCommitType(String commitType) {
        this.commitType = commitType;
        return this;
    }

    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    public String getRuclCodeRollEnc() {
        return ruclCodeRollEnc;
    }

    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_ROLL_ENC, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeRollEnc")
    public void setRuclCodeRollEnc(String ruclCodeRollEnc) {
        this.ruclCodeRollEnc = ruclCodeRollEnc;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRuclCodeRollEnc(String ruclCodeRollEnc) {
        this.ruclCodeRollEnc = ruclCodeRollEnc;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calStartMonth")
    public String getCalStartMonth() {
        return calStartMonth;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * (Required)
     * 
     */
    @JsonProperty("calStartMonth")
    public void setCalStartMonth(String calStartMonth) {
        this.calStartMonth = calStartMonth;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCalStartMonth(String calStartMonth) {
        this.calStartMonth = calStartMonth;
        return this;
    }

    @JsonProperty("acctAccrApTitle")
    public String getAcctAccrApTitle() {
        return acctAccrApTitle;
    }

    @JsonProperty("acctAccrApTitle")
    public void setAcctAccrApTitle(String acctAccrApTitle) {
        this.acctAccrApTitle = acctAccrApTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctAccrApTitle(String acctAccrApTitle) {
        this.acctAccrApTitle = acctAccrApTitle;
        return this;
    }

    /**
     * Memo Reservations
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_MEMO_RES_IND
     * 
     */
    @JsonProperty("rollMemoResInd")
    public String getRollMemoResInd() {
        return rollMemoResInd;
    }

    /**
     * Memo Reservations
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_MEMO_RES_IND
     * 
     */
    @JsonProperty("rollMemoResInd")
    public void setRollMemoResInd(String rollMemoResInd) {
        this.rollMemoResInd = rollMemoResInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollMemoResInd(String rollMemoResInd) {
        this.rollMemoResInd = rollMemoResInd;
        return this;
    }

    @JsonProperty("budgCfTitle")
    public String getBudgCfTitle() {
        return budgCfTitle;
    }

    @JsonProperty("budgCfTitle")
    public void setBudgCfTitle(String budgCfTitle) {
        this.budgCfTitle = budgCfTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgCfTitle(String budgCfTitle) {
        this.budgCfTitle = budgCfTitle;
        return this;
    }

    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("budgetDisposition")
    public String getBudgetDisposition() {
        return budgetDisposition;
    }

    /**
     * Budget Disposition
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("budgetDisposition")
    public void setBudgetDisposition(String budgetDisposition) {
        this.budgetDisposition = budgetDisposition;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgetDisposition(String budgetDisposition) {
        this.budgetDisposition = budgetDisposition;
        return this;
    }

    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    public String getRuclCodeBudgCf() {
        return ruclCodeBudgCf;
    }

    /**
     * Rule Class Code
     * <p>
     * Lineage reference object : FTVCOAS_RUCL_CODE_BUDG_CF, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCodeBudgCf")
    public void setRuclCodeBudgCf(String ruclCodeBudgCf) {
        this.ruclCodeBudgCf = ruclCodeBudgCf;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRuclCodeBudgCf(String ruclCodeBudgCf) {
        this.ruclCodeBudgCf = ruclCodeBudgCf;
        return this;
    }

    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * (Required)
     * 
     */
    @JsonProperty("calStartDay")
    public String getCalStartDay() {
        return calStartDay;
    }

    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * (Required)
     * 
     */
    @JsonProperty("calStartDay")
    public void setCalStartDay(String calStartDay) {
        this.calStartDay = calStartDay;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCalStartDay(String calStartDay) {
        this.calStartDay = calStartDay;
        return this;
    }

    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL
     * (Required)
     * 
     */
    @JsonProperty("budgetRoll")
    public String getBudgetRoll() {
        return budgetRoll;
    }

    /**
     * Budget Roll
     * <p>
     * Lineage reference object : FTVCOAS_BUDGET_ROLL
     * (Required)
     * 
     */
    @JsonProperty("budgetRoll")
    public void setBudgetRoll(String budgetRoll) {
        this.budgetRoll = budgetRoll;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgetRoll(String budgetRoll) {
        this.budgetRoll = budgetRoll;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    @JsonProperty("dueFromTitle")
    public String getDueFromTitle() {
        return dueFromTitle;
    }

    @JsonProperty("dueFromTitle")
    public void setDueFromTitle(String dueFromTitle) {
        this.dueFromTitle = dueFromTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withDueFromTitle(String dueFromTitle) {
        this.dueFromTitle = dueFromTitle;
        return this;
    }

    @JsonProperty("bavlPeriodDescr")
    public String getBavlPeriodDescr() {
        return bavlPeriodDescr;
    }

    @JsonProperty("bavlPeriodDescr")
    public void setBavlPeriodDescr(String bavlPeriodDescr) {
        this.bavlPeriodDescr = bavlPeriodDescr;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlPeriodDescr(String bavlPeriodDescr) {
        this.bavlPeriodDescr = bavlPeriodDescr;
        return this;
    }

    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_PO_IND
     * 
     */
    @JsonProperty("rollPoInd")
    public String getRollPoInd() {
        return rollPoInd;
    }

    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_PO_IND
     * 
     */
    @JsonProperty("rollPoInd")
    public void setRollPoInd(String rollPoInd) {
        this.rollPoInd = rollPoInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollPoInd(String rollPoInd) {
        this.rollPoInd = rollPoInd;
        return this;
    }

    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * (Required)
     * 
     */
    @JsonProperty("methOfAcctg")
    public String getMethOfAcctg() {
        return methOfAcctg;
    }

    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * (Required)
     * 
     */
    @JsonProperty("methOfAcctg")
    public void setMethOfAcctg(String methOfAcctg) {
        this.methOfAcctg = methOfAcctg;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withMethOfAcctg(String methOfAcctg) {
        this.methOfAcctg = methOfAcctg;
        return this;
    }

    @JsonProperty("rollEncTitle")
    public String getRollEncTitle() {
        return rollEncTitle;
    }

    @JsonProperty("rollEncTitle")
    public void setRollEncTitle(String rollEncTitle) {
        this.rollEncTitle = rollEncTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollEncTitle(String rollEncTitle) {
        this.rollEncTitle = rollEncTitle;
        return this;
    }

    @JsonProperty("closeOpTitle")
    public String getCloseOpTitle() {
        return closeOpTitle;
    }

    @JsonProperty("closeOpTitle")
    public void setCloseOpTitle(String closeOpTitle) {
        this.closeOpTitle = closeOpTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCloseOpTitle(String closeOpTitle) {
        this.closeOpTitle = closeOpTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("bavlSeverityDescr")
    public String getBavlSeverityDescr() {
        return bavlSeverityDescr;
    }

    @JsonProperty("bavlSeverityDescr")
    public void setBavlSeverityDescr(String bavlSeverityDescr) {
        this.bavlSeverityDescr = bavlSeverityDescr;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlSeverityDescr(String bavlSeverityDescr) {
        this.bavlSeverityDescr = bavlSeverityDescr;
        return this;
    }

    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * (Required)
     * 
     */
    @JsonProperty("calEndDay")
    public String getCalEndDay() {
        return calEndDay;
    }

    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * (Required)
     * 
     */
    @JsonProperty("calEndDay")
    public void setCalEndDay(String calEndDay) {
        this.calEndDay = calEndDay;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withCalEndDay(String calEndDay) {
        this.calEndDay = calEndDay;
        return this;
    }

    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public String getBavlKeyFund() {
        return bavlKeyFund;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("bavlKeyFund")
    public void setBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlKeyFund(String bavlKeyFund) {
        this.bavlKeyFund = bavlKeyFund;
        return this;
    }

    @JsonProperty("fundBalTitle")
    public String getFundBalTitle() {
        return fundBalTitle;
    }

    @JsonProperty("fundBalTitle")
    public void setFundBalTitle(String fundBalTitle) {
        this.fundBalTitle = fundBalTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withFundBalTitle(String fundBalTitle) {
        this.fundBalTitle = fundBalTitle;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_ACTV_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("actvAttributeInd")
    public String getActvAttributeInd() {
        return actvAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_ACTV_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("actvAttributeInd")
    public void setActvAttributeInd(String actvAttributeInd) {
        this.actvAttributeInd = actvAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withActvAttributeInd(String actvAttributeInd) {
        this.actvAttributeInd = actvAttributeInd;
        return this;
    }

    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CLASSIFICATION
     * (Required)
     * 
     */
    @JsonProperty("budgClassification")
    public String getBudgClassification() {
        return budgClassification;
    }

    /**
     * Budget Class
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CLASSIFICATION
     * (Required)
     * 
     */
    @JsonProperty("budgClassification")
    public void setBudgClassification(String budgClassification) {
        this.budgClassification = budgClassification;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgClassification(String budgClassification) {
        this.budgClassification = budgClassification;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("acctAccrArTitle")
    public String getAcctAccrArTitle() {
        return acctAccrArTitle;
    }

    @JsonProperty("acctAccrArTitle")
    public void setAcctAccrArTitle(String acctAccrArTitle) {
        this.acctAccrArTitle = acctAccrArTitle;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctAccrArTitle(String acctAccrArTitle) {
        this.acctAccrArTitle = acctAccrArTitle;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public String getBavlKeyAcct() {
        return bavlKeyAcct;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("bavlKeyAcct")
    public void setBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlKeyAcct(String bavlKeyAcct) {
        this.bavlKeyAcct = bavlKeyAcct;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public String getBavlKeyProg() {
        return bavlKeyProg;
    }

    /**
     * Lineage reference object : FTVCOAS_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("bavlKeyProg")
    public void setBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlKeyProg(String bavlKeyProg) {
        this.bavlKeyProg = bavlKeyProg;
        return this;
    }

    /**
     * Accounts Receivable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AR
     * 
     */
    @JsonProperty("acctCodeAccrualAr")
    public String getAcctCodeAccrualAr() {
        return acctCodeAccrualAr;
    }

    /**
     * Accounts Receivable Accrual Account:
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_ACCRUAL_AR
     * 
     */
    @JsonProperty("acctCodeAccrualAr")
    public void setAcctCodeAccrualAr(String acctCodeAccrualAr) {
        this.acctCodeAccrualAr = acctCodeAccrualAr;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctCodeAccrualAr(String acctCodeAccrualAr) {
        this.acctCodeAccrualAr = acctCodeAccrualAr;
        return this;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgCfType")
    public String getBudgCfType() {
        return budgCfType;
    }

    /**
     * Budget Type
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_TYPE
     * (Required)
     * 
     */
    @JsonProperty("budgCfType")
    public void setBudgCfType(String budgCfType) {
        this.budgCfType = budgCfType;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgCfType(String budgCfType) {
        this.budgCfType = budgCfType;
        return this;
    }

    /**
     * Fund Balance Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_BAL
     * 
     */
    @JsonProperty("acctCodeFundBal")
    public String getAcctCodeFundBal() {
        return acctCodeFundBal;
    }

    /**
     * Fund Balance Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_BAL
     * 
     */
    @JsonProperty("acctCodeFundBal")
    public void setAcctCodeFundBal(String acctCodeFundBal) {
        this.acctCodeFundBal = acctCodeFundBal;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctCodeFundBal(String acctCodeFundBal) {
        this.acctCodeFundBal = acctCodeFundBal;
        return this;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("bavlPeriod")
    public String getBavlPeriod() {
        return bavlPeriod;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("bavlPeriod")
    public void setBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
        return this;
    }

    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    public String getAcctCodeFundDueTo() {
        return acctCodeFundDueTo;
    }

    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    public void setAcctCodeFundDueTo(String acctCodeFundDueTo) {
        this.acctCodeFundDueTo = acctCodeFundDueTo;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withAcctCodeFundDueTo(String acctCodeFundDueTo) {
        this.acctCodeFundDueTo = acctCodeFundDueTo;
        return this;
    }

    /**
     * Work Order
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_WO_IND
     * 
     */
    @JsonProperty("rollWoInd")
    public String getRollWoInd() {
        return rollWoInd;
    }

    /**
     * Work Order
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_WO_IND
     * 
     */
    @JsonProperty("rollWoInd")
    public void setRollWoInd(String rollWoInd) {
        this.rollWoInd = rollWoInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollWoInd(String rollWoInd) {
        this.rollWoInd = rollWoInd;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgCfPercent")
    public Double getBudgCfPercent() {
        return budgCfPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVCOAS_BUDG_CF_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("budgCfPercent")
    public void setBudgCfPercent(Double budgCfPercent) {
        this.budgCfPercent = budgCfPercent;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withBudgCfPercent(Double budgCfPercent) {
        this.budgCfPercent = budgCfPercent;
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

    public ChartOfAccountsCodeMaintenance100GetResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_ENC_IND
     * 
     */
    @JsonProperty("rollEncInd")
    public String getRollEncInd() {
        return rollEncInd;
    }

    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FTVCOAS_ROLL_ENC_IND
     * 
     */
    @JsonProperty("rollEncInd")
    public void setRollEncInd(String rollEncInd) {
        this.rollEncInd = rollEncInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withRollEncInd(String rollEncInd) {
        this.rollEncInd = rollEncInd;
        return this;
    }

    /**
     * Lineage reference object : FTVCOAS_ORGN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("orgnAttributeInd")
    public String getOrgnAttributeInd() {
        return orgnAttributeInd;
    }

    /**
     * Lineage reference object : FTVCOAS_ORGN_ATTRIBUTE_IND
     * 
     */
    @JsonProperty("orgnAttributeInd")
    public void setOrgnAttributeInd(String orgnAttributeInd) {
        this.orgnAttributeInd = orgnAttributeInd;
    }

    public ChartOfAccountsCodeMaintenance100GetResponse withOrgnAttributeInd(String orgnAttributeInd) {
        this.orgnAttributeInd = orgnAttributeInd;
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

    public ChartOfAccountsCodeMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChartOfAccountsCodeMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locnAttributeInd");
        sb.append('=');
        sb.append(((this.locnAttributeInd == null)?"<null>":this.locnAttributeInd));
        sb.append(',');
        sb.append("progAttributeInd");
        sb.append('=');
        sb.append(((this.progAttributeInd == null)?"<null>":this.progAttributeInd));
        sb.append(',');
        sb.append("budgetRollPercent");
        sb.append('=');
        sb.append(((this.budgetRollPercent == null)?"<null>":this.budgetRollPercent));
        sb.append(',');
        sb.append("bavlSeverity");
        sb.append('=');
        sb.append(((this.bavlSeverity == null)?"<null>":this.bavlSeverity));
        sb.append(',');
        sb.append("calEndMonth");
        sb.append('=');
        sb.append(((this.calEndMonth == null)?"<null>":this.calEndMonth));
        sb.append(',');
        sb.append("acctCodeFundDueFrm");
        sb.append('=');
        sb.append(((this.acctCodeFundDueFrm == null)?"<null>":this.acctCodeFundDueFrm));
        sb.append(',');
        sb.append("rollReqInd");
        sb.append('=');
        sb.append(((this.rollReqInd == null)?"<null>":this.rollReqInd));
        sb.append(',');
        sb.append("bavlKeyOrgn");
        sb.append('=');
        sb.append(((this.bavlKeyOrgn == null)?"<null>":this.bavlKeyOrgn));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("ruclCodeCloseOp");
        sb.append('=');
        sb.append(((this.ruclCodeCloseOp == null)?"<null>":this.ruclCodeCloseOp));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("viewEncBudInd");
        sb.append('=');
        sb.append(((this.viewEncBudInd == null)?"<null>":this.viewEncBudInd));
        sb.append(',');
        sb.append("acctCodeAccrualAp");
        sb.append('=');
        sb.append(((this.acctCodeAccrualAp == null)?"<null>":this.acctCodeAccrualAp));
        sb.append(',');
        sb.append("fundAttributeInd");
        sb.append('=');
        sb.append(((this.fundAttributeInd == null)?"<null>":this.fundAttributeInd));
        sb.append(',');
        sb.append("dueToTitle");
        sb.append('=');
        sb.append(((this.dueToTitle == null)?"<null>":this.dueToTitle));
        sb.append(',');
        sb.append("rollLaborEncInd");
        sb.append('=');
        sb.append(((this.rollLaborEncInd == null)?"<null>":this.rollLaborEncInd));
        sb.append(',');
        sb.append("acctAttributeInd");
        sb.append('=');
        sb.append(((this.acctAttributeInd == null)?"<null>":this.acctAttributeInd));
        sb.append(',');
        sb.append("commitType");
        sb.append('=');
        sb.append(((this.commitType == null)?"<null>":this.commitType));
        sb.append(',');
        sb.append("ruclCodeRollEnc");
        sb.append('=');
        sb.append(((this.ruclCodeRollEnc == null)?"<null>":this.ruclCodeRollEnc));
        sb.append(',');
        sb.append("calStartMonth");
        sb.append('=');
        sb.append(((this.calStartMonth == null)?"<null>":this.calStartMonth));
        sb.append(',');
        sb.append("acctAccrApTitle");
        sb.append('=');
        sb.append(((this.acctAccrApTitle == null)?"<null>":this.acctAccrApTitle));
        sb.append(',');
        sb.append("rollMemoResInd");
        sb.append('=');
        sb.append(((this.rollMemoResInd == null)?"<null>":this.rollMemoResInd));
        sb.append(',');
        sb.append("budgCfTitle");
        sb.append('=');
        sb.append(((this.budgCfTitle == null)?"<null>":this.budgCfTitle));
        sb.append(',');
        sb.append("budgetDisposition");
        sb.append('=');
        sb.append(((this.budgetDisposition == null)?"<null>":this.budgetDisposition));
        sb.append(',');
        sb.append("ruclCodeBudgCf");
        sb.append('=');
        sb.append(((this.ruclCodeBudgCf == null)?"<null>":this.ruclCodeBudgCf));
        sb.append(',');
        sb.append("calStartDay");
        sb.append('=');
        sb.append(((this.calStartDay == null)?"<null>":this.calStartDay));
        sb.append(',');
        sb.append("budgetRoll");
        sb.append('=');
        sb.append(((this.budgetRoll == null)?"<null>":this.budgetRoll));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("dueFromTitle");
        sb.append('=');
        sb.append(((this.dueFromTitle == null)?"<null>":this.dueFromTitle));
        sb.append(',');
        sb.append("bavlPeriodDescr");
        sb.append('=');
        sb.append(((this.bavlPeriodDescr == null)?"<null>":this.bavlPeriodDescr));
        sb.append(',');
        sb.append("rollPoInd");
        sb.append('=');
        sb.append(((this.rollPoInd == null)?"<null>":this.rollPoInd));
        sb.append(',');
        sb.append("methOfAcctg");
        sb.append('=');
        sb.append(((this.methOfAcctg == null)?"<null>":this.methOfAcctg));
        sb.append(',');
        sb.append("rollEncTitle");
        sb.append('=');
        sb.append(((this.rollEncTitle == null)?"<null>":this.rollEncTitle));
        sb.append(',');
        sb.append("closeOpTitle");
        sb.append('=');
        sb.append(((this.closeOpTitle == null)?"<null>":this.closeOpTitle));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("bavlSeverityDescr");
        sb.append('=');
        sb.append(((this.bavlSeverityDescr == null)?"<null>":this.bavlSeverityDescr));
        sb.append(',');
        sb.append("calEndDay");
        sb.append('=');
        sb.append(((this.calEndDay == null)?"<null>":this.calEndDay));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("bavlKeyFund");
        sb.append('=');
        sb.append(((this.bavlKeyFund == null)?"<null>":this.bavlKeyFund));
        sb.append(',');
        sb.append("fundBalTitle");
        sb.append('=');
        sb.append(((this.fundBalTitle == null)?"<null>":this.fundBalTitle));
        sb.append(',');
        sb.append("actvAttributeInd");
        sb.append('=');
        sb.append(((this.actvAttributeInd == null)?"<null>":this.actvAttributeInd));
        sb.append(',');
        sb.append("budgClassification");
        sb.append('=');
        sb.append(((this.budgClassification == null)?"<null>":this.budgClassification));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acctAccrArTitle");
        sb.append('=');
        sb.append(((this.acctAccrArTitle == null)?"<null>":this.acctAccrArTitle));
        sb.append(',');
        sb.append("bavlKeyAcct");
        sb.append('=');
        sb.append(((this.bavlKeyAcct == null)?"<null>":this.bavlKeyAcct));
        sb.append(',');
        sb.append("bavlKeyProg");
        sb.append('=');
        sb.append(((this.bavlKeyProg == null)?"<null>":this.bavlKeyProg));
        sb.append(',');
        sb.append("acctCodeAccrualAr");
        sb.append('=');
        sb.append(((this.acctCodeAccrualAr == null)?"<null>":this.acctCodeAccrualAr));
        sb.append(',');
        sb.append("budgCfType");
        sb.append('=');
        sb.append(((this.budgCfType == null)?"<null>":this.budgCfType));
        sb.append(',');
        sb.append("acctCodeFundBal");
        sb.append('=');
        sb.append(((this.acctCodeFundBal == null)?"<null>":this.acctCodeFundBal));
        sb.append(',');
        sb.append("bavlPeriod");
        sb.append('=');
        sb.append(((this.bavlPeriod == null)?"<null>":this.bavlPeriod));
        sb.append(',');
        sb.append("acctCodeFundDueTo");
        sb.append('=');
        sb.append(((this.acctCodeFundDueTo == null)?"<null>":this.acctCodeFundDueTo));
        sb.append(',');
        sb.append("rollWoInd");
        sb.append('=');
        sb.append(((this.rollWoInd == null)?"<null>":this.rollWoInd));
        sb.append(',');
        sb.append("budgCfPercent");
        sb.append('=');
        sb.append(((this.budgCfPercent == null)?"<null>":this.budgCfPercent));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("rollEncInd");
        sb.append('=');
        sb.append(((this.rollEncInd == null)?"<null>":this.rollEncInd));
        sb.append(',');
        sb.append("orgnAttributeInd");
        sb.append('=');
        sb.append(((this.orgnAttributeInd == null)?"<null>":this.orgnAttributeInd));
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
        result = ((result* 31)+((this.locnAttributeInd == null)? 0 :this.locnAttributeInd.hashCode()));
        result = ((result* 31)+((this.progAttributeInd == null)? 0 :this.progAttributeInd.hashCode()));
        result = ((result* 31)+((this.budgetRollPercent == null)? 0 :this.budgetRollPercent.hashCode()));
        result = ((result* 31)+((this.bavlSeverity == null)? 0 :this.bavlSeverity.hashCode()));
        result = ((result* 31)+((this.calEndMonth == null)? 0 :this.calEndMonth.hashCode()));
        result = ((result* 31)+((this.acctCodeFundDueFrm == null)? 0 :this.acctCodeFundDueFrm.hashCode()));
        result = ((result* 31)+((this.rollReqInd == null)? 0 :this.rollReqInd.hashCode()));
        result = ((result* 31)+((this.bavlKeyOrgn == null)? 0 :this.bavlKeyOrgn.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.ruclCodeCloseOp == null)? 0 :this.ruclCodeCloseOp.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.viewEncBudInd == null)? 0 :this.viewEncBudInd.hashCode()));
        result = ((result* 31)+((this.acctCodeAccrualAp == null)? 0 :this.acctCodeAccrualAp.hashCode()));
        result = ((result* 31)+((this.fundAttributeInd == null)? 0 :this.fundAttributeInd.hashCode()));
        result = ((result* 31)+((this.dueToTitle == null)? 0 :this.dueToTitle.hashCode()));
        result = ((result* 31)+((this.rollLaborEncInd == null)? 0 :this.rollLaborEncInd.hashCode()));
        result = ((result* 31)+((this.acctAttributeInd == null)? 0 :this.acctAttributeInd.hashCode()));
        result = ((result* 31)+((this.commitType == null)? 0 :this.commitType.hashCode()));
        result = ((result* 31)+((this.ruclCodeRollEnc == null)? 0 :this.ruclCodeRollEnc.hashCode()));
        result = ((result* 31)+((this.calStartMonth == null)? 0 :this.calStartMonth.hashCode()));
        result = ((result* 31)+((this.acctAccrApTitle == null)? 0 :this.acctAccrApTitle.hashCode()));
        result = ((result* 31)+((this.rollMemoResInd == null)? 0 :this.rollMemoResInd.hashCode()));
        result = ((result* 31)+((this.budgCfTitle == null)? 0 :this.budgCfTitle.hashCode()));
        result = ((result* 31)+((this.budgetDisposition == null)? 0 :this.budgetDisposition.hashCode()));
        result = ((result* 31)+((this.ruclCodeBudgCf == null)? 0 :this.ruclCodeBudgCf.hashCode()));
        result = ((result* 31)+((this.calStartDay == null)? 0 :this.calStartDay.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.budgetRoll == null)? 0 :this.budgetRoll.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.dueFromTitle == null)? 0 :this.dueFromTitle.hashCode()));
        result = ((result* 31)+((this.bavlPeriodDescr == null)? 0 :this.bavlPeriodDescr.hashCode()));
        result = ((result* 31)+((this.rollPoInd == null)? 0 :this.rollPoInd.hashCode()));
        result = ((result* 31)+((this.methOfAcctg == null)? 0 :this.methOfAcctg.hashCode()));
        result = ((result* 31)+((this.rollEncTitle == null)? 0 :this.rollEncTitle.hashCode()));
        result = ((result* 31)+((this.closeOpTitle == null)? 0 :this.closeOpTitle.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.bavlSeverityDescr == null)? 0 :this.bavlSeverityDescr.hashCode()));
        result = ((result* 31)+((this.calEndDay == null)? 0 :this.calEndDay.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.bavlKeyFund == null)? 0 :this.bavlKeyFund.hashCode()));
        result = ((result* 31)+((this.fundBalTitle == null)? 0 :this.fundBalTitle.hashCode()));
        result = ((result* 31)+((this.actvAttributeInd == null)? 0 :this.actvAttributeInd.hashCode()));
        result = ((result* 31)+((this.budgClassification == null)? 0 :this.budgClassification.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acctAccrArTitle == null)? 0 :this.acctAccrArTitle.hashCode()));
        result = ((result* 31)+((this.bavlKeyAcct == null)? 0 :this.bavlKeyAcct.hashCode()));
        result = ((result* 31)+((this.bavlKeyProg == null)? 0 :this.bavlKeyProg.hashCode()));
        result = ((result* 31)+((this.acctCodeAccrualAr == null)? 0 :this.acctCodeAccrualAr.hashCode()));
        result = ((result* 31)+((this.budgCfType == null)? 0 :this.budgCfType.hashCode()));
        result = ((result* 31)+((this.acctCodeFundBal == null)? 0 :this.acctCodeFundBal.hashCode()));
        result = ((result* 31)+((this.bavlPeriod == null)? 0 :this.bavlPeriod.hashCode()));
        result = ((result* 31)+((this.acctCodeFundDueTo == null)? 0 :this.acctCodeFundDueTo.hashCode()));
        result = ((result* 31)+((this.rollWoInd == null)? 0 :this.rollWoInd.hashCode()));
        result = ((result* 31)+((this.budgCfPercent == null)? 0 :this.budgCfPercent.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.rollEncInd == null)? 0 :this.rollEncInd.hashCode()));
        result = ((result* 31)+((this.orgnAttributeInd == null)? 0 :this.orgnAttributeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChartOfAccountsCodeMaintenance100GetResponse) == false) {
            return false;
        }
        ChartOfAccountsCodeMaintenance100GetResponse rhs = ((ChartOfAccountsCodeMaintenance100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.locnAttributeInd == rhs.locnAttributeInd)||((this.locnAttributeInd!= null)&&this.locnAttributeInd.equals(rhs.locnAttributeInd)))&&((this.progAttributeInd == rhs.progAttributeInd)||((this.progAttributeInd!= null)&&this.progAttributeInd.equals(rhs.progAttributeInd))))&&((this.budgetRollPercent == rhs.budgetRollPercent)||((this.budgetRollPercent!= null)&&this.budgetRollPercent.equals(rhs.budgetRollPercent))))&&((this.bavlSeverity == rhs.bavlSeverity)||((this.bavlSeverity!= null)&&this.bavlSeverity.equals(rhs.bavlSeverity))))&&((this.calEndMonth == rhs.calEndMonth)||((this.calEndMonth!= null)&&this.calEndMonth.equals(rhs.calEndMonth))))&&((this.acctCodeFundDueFrm == rhs.acctCodeFundDueFrm)||((this.acctCodeFundDueFrm!= null)&&this.acctCodeFundDueFrm.equals(rhs.acctCodeFundDueFrm))))&&((this.rollReqInd == rhs.rollReqInd)||((this.rollReqInd!= null)&&this.rollReqInd.equals(rhs.rollReqInd))))&&((this.bavlKeyOrgn == rhs.bavlKeyOrgn)||((this.bavlKeyOrgn!= null)&&this.bavlKeyOrgn.equals(rhs.bavlKeyOrgn))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.ruclCodeCloseOp == rhs.ruclCodeCloseOp)||((this.ruclCodeCloseOp!= null)&&this.ruclCodeCloseOp.equals(rhs.ruclCodeCloseOp))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.viewEncBudInd == rhs.viewEncBudInd)||((this.viewEncBudInd!= null)&&this.viewEncBudInd.equals(rhs.viewEncBudInd))))&&((this.acctCodeAccrualAp == rhs.acctCodeAccrualAp)||((this.acctCodeAccrualAp!= null)&&this.acctCodeAccrualAp.equals(rhs.acctCodeAccrualAp))))&&((this.fundAttributeInd == rhs.fundAttributeInd)||((this.fundAttributeInd!= null)&&this.fundAttributeInd.equals(rhs.fundAttributeInd))))&&((this.dueToTitle == rhs.dueToTitle)||((this.dueToTitle!= null)&&this.dueToTitle.equals(rhs.dueToTitle))))&&((this.rollLaborEncInd == rhs.rollLaborEncInd)||((this.rollLaborEncInd!= null)&&this.rollLaborEncInd.equals(rhs.rollLaborEncInd))))&&((this.acctAttributeInd == rhs.acctAttributeInd)||((this.acctAttributeInd!= null)&&this.acctAttributeInd.equals(rhs.acctAttributeInd))))&&((this.commitType == rhs.commitType)||((this.commitType!= null)&&this.commitType.equals(rhs.commitType))))&&((this.ruclCodeRollEnc == rhs.ruclCodeRollEnc)||((this.ruclCodeRollEnc!= null)&&this.ruclCodeRollEnc.equals(rhs.ruclCodeRollEnc))))&&((this.calStartMonth == rhs.calStartMonth)||((this.calStartMonth!= null)&&this.calStartMonth.equals(rhs.calStartMonth))))&&((this.acctAccrApTitle == rhs.acctAccrApTitle)||((this.acctAccrApTitle!= null)&&this.acctAccrApTitle.equals(rhs.acctAccrApTitle))))&&((this.rollMemoResInd == rhs.rollMemoResInd)||((this.rollMemoResInd!= null)&&this.rollMemoResInd.equals(rhs.rollMemoResInd))))&&((this.budgCfTitle == rhs.budgCfTitle)||((this.budgCfTitle!= null)&&this.budgCfTitle.equals(rhs.budgCfTitle))))&&((this.budgetDisposition == rhs.budgetDisposition)||((this.budgetDisposition!= null)&&this.budgetDisposition.equals(rhs.budgetDisposition))))&&((this.ruclCodeBudgCf == rhs.ruclCodeBudgCf)||((this.ruclCodeBudgCf!= null)&&this.ruclCodeBudgCf.equals(rhs.ruclCodeBudgCf))))&&((this.calStartDay == rhs.calStartDay)||((this.calStartDay!= null)&&this.calStartDay.equals(rhs.calStartDay))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.budgetRoll == rhs.budgetRoll)||((this.budgetRoll!= null)&&this.budgetRoll.equals(rhs.budgetRoll))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.dueFromTitle == rhs.dueFromTitle)||((this.dueFromTitle!= null)&&this.dueFromTitle.equals(rhs.dueFromTitle))))&&((this.bavlPeriodDescr == rhs.bavlPeriodDescr)||((this.bavlPeriodDescr!= null)&&this.bavlPeriodDescr.equals(rhs.bavlPeriodDescr))))&&((this.rollPoInd == rhs.rollPoInd)||((this.rollPoInd!= null)&&this.rollPoInd.equals(rhs.rollPoInd))))&&((this.methOfAcctg == rhs.methOfAcctg)||((this.methOfAcctg!= null)&&this.methOfAcctg.equals(rhs.methOfAcctg))))&&((this.rollEncTitle == rhs.rollEncTitle)||((this.rollEncTitle!= null)&&this.rollEncTitle.equals(rhs.rollEncTitle))))&&((this.closeOpTitle == rhs.closeOpTitle)||((this.closeOpTitle!= null)&&this.closeOpTitle.equals(rhs.closeOpTitle))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.bavlSeverityDescr == rhs.bavlSeverityDescr)||((this.bavlSeverityDescr!= null)&&this.bavlSeverityDescr.equals(rhs.bavlSeverityDescr))))&&((this.calEndDay == rhs.calEndDay)||((this.calEndDay!= null)&&this.calEndDay.equals(rhs.calEndDay))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.bavlKeyFund == rhs.bavlKeyFund)||((this.bavlKeyFund!= null)&&this.bavlKeyFund.equals(rhs.bavlKeyFund))))&&((this.fundBalTitle == rhs.fundBalTitle)||((this.fundBalTitle!= null)&&this.fundBalTitle.equals(rhs.fundBalTitle))))&&((this.actvAttributeInd == rhs.actvAttributeInd)||((this.actvAttributeInd!= null)&&this.actvAttributeInd.equals(rhs.actvAttributeInd))))&&((this.budgClassification == rhs.budgClassification)||((this.budgClassification!= null)&&this.budgClassification.equals(rhs.budgClassification))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acctAccrArTitle == rhs.acctAccrArTitle)||((this.acctAccrArTitle!= null)&&this.acctAccrArTitle.equals(rhs.acctAccrArTitle))))&&((this.bavlKeyAcct == rhs.bavlKeyAcct)||((this.bavlKeyAcct!= null)&&this.bavlKeyAcct.equals(rhs.bavlKeyAcct))))&&((this.bavlKeyProg == rhs.bavlKeyProg)||((this.bavlKeyProg!= null)&&this.bavlKeyProg.equals(rhs.bavlKeyProg))))&&((this.acctCodeAccrualAr == rhs.acctCodeAccrualAr)||((this.acctCodeAccrualAr!= null)&&this.acctCodeAccrualAr.equals(rhs.acctCodeAccrualAr))))&&((this.budgCfType == rhs.budgCfType)||((this.budgCfType!= null)&&this.budgCfType.equals(rhs.budgCfType))))&&((this.acctCodeFundBal == rhs.acctCodeFundBal)||((this.acctCodeFundBal!= null)&&this.acctCodeFundBal.equals(rhs.acctCodeFundBal))))&&((this.bavlPeriod == rhs.bavlPeriod)||((this.bavlPeriod!= null)&&this.bavlPeriod.equals(rhs.bavlPeriod))))&&((this.acctCodeFundDueTo == rhs.acctCodeFundDueTo)||((this.acctCodeFundDueTo!= null)&&this.acctCodeFundDueTo.equals(rhs.acctCodeFundDueTo))))&&((this.rollWoInd == rhs.rollWoInd)||((this.rollWoInd!= null)&&this.rollWoInd.equals(rhs.rollWoInd))))&&((this.budgCfPercent == rhs.budgCfPercent)||((this.budgCfPercent!= null)&&this.budgCfPercent.equals(rhs.budgCfPercent))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.rollEncInd == rhs.rollEncInd)||((this.rollEncInd!= null)&&this.rollEncInd.equals(rhs.rollEncInd))))&&((this.orgnAttributeInd == rhs.orgnAttributeInd)||((this.orgnAttributeInd!= null)&&this.orgnAttributeInd.equals(rhs.orgnAttributeInd))));
    }

}
