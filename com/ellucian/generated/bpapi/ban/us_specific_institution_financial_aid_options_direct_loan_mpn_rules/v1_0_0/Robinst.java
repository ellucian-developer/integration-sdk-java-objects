
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_direct_loan_mpn_rules.v1_0_0;

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
    "trstCodeTeachEntr",
    "dlAdvancePayInd",
    "treqCodeGpEntr",
    "inasNonCust",
    "loanProcessType",
    "pellAuditInd",
    "elBranchCde",
    "turnOffPellInd",
    "elSchoolCde",
    "alternatePellInd",
    "trstCodeGpEntr",
    "displaySourceId",
    "displayPellId",
    "dlApNoDays",
    "applyFyftbRuleInd",
    "treqCodeEnterIntv",
    "servAgentCde",
    "elAuditInd",
    "pellRedEligInd",
    "trstCodeSar",
    "trstCodeEnterIntv",
    "treqCodeExitIntv",
    "treqCodeSar",
    "displayAttendingId",
    "multiYrPerkMpnFlag",
    "pellFormulaType",
    "justInTimeInd",
    "trstCodeExitIntv",
    "pellFundCode",
    "elAuditNoDays",
    "grantApNoDays",
    "displayDlSchoolCode",
    "treqCodeTeachEntr",
    "grantAdvancePayInd",
    "fedSchoolCode",
    "trstCodeTeachExit",
    "displayReportingId",
    "titleIvRetInd",
    "updTranInd",
    "mynEligible",
    "formerHealInd",
    "opeidBranch",
    "entityId",
    "treqCodeTeachExit",
    "destNumber",
    "cashMonitorInd",
    "pellLtHalfInd",
    "opeid",
    "titleIvRoundInd",
    "jitNoDays"
})
@Generated("jsonschema2pojo")
public class Robinst {

    /**
     * Entrance Interview Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachEntr")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_TEACH_ENTR, Lookup lineage reference object : rtvtrst")
    private String trstCodeTeachEntr;
    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_DL_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("dlAdvancePayInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_DL_ADVANCE_PAY_IND")
    private String dlAdvancePayInd;
    /**
     * Grad PLUS Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_GP_ENTR
     * 
     */
    @JsonProperty("treqCodeGpEntr")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_GP_ENTR")
    private String treqCodeGpEntr;
    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : ROBINST_INAS_NON_CUST
     * 
     */
    @JsonProperty("inasNonCust")
    @JsonPropertyDescription("Lineage reference object : ROBINST_INAS_NON_CUST")
    private String inasNonCust;
    /**
     * Loan Process Type
     * <p>
     * Lineage reference object : ROBINST_LOAN_PROCESS_TYPE
     * 
     */
    @JsonProperty("loanProcessType")
    @JsonPropertyDescription("Lineage reference object : ROBINST_LOAN_PROCESS_TYPE")
    private String loanProcessType;
    /**
     * EDE Correction Logging
     * <p>
     * Lineage reference object : ROBINST_PELL_AUDIT_IND
     * 
     */
    @JsonProperty("pellAuditInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_AUDIT_IND")
    private String pellAuditInd;
    /**
     * Electronic Branch ID
     * <p>
     * Lineage reference object : ROBINST_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    @JsonPropertyDescription("Lineage reference object : ROBINST_EL_BRANCH_CDE")
    private String elBranchCde;
    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : ROBINST_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TURN_OFF_PELL_IND")
    private String turnOffPellInd;
    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : ROBINST_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    @JsonPropertyDescription("Lineage reference object : ROBINST_EL_SCHOOL_CDE")
    private String elSchoolCde;
    /**
     * Alternate Pell Schedules Used
     * <p>
     * Lineage reference object : ROBINST_ALTERNATE_PELL_IND
     * 
     */
    @JsonProperty("alternatePellInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ALTERNATE_PELL_IND")
    private String alternatePellInd;
    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_GP_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeGpEntr")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_GP_ENTR, Lookup lineage reference object : rtvtrst")
    private String trstCodeGpEntr;
    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    private String displaySourceId;
    /**
     * Pell ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPellId")
    private String displayPellId;
    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_DL_AP_NO_DAYS
     * 
     */
    @JsonProperty("dlApNoDays")
    @JsonPropertyDescription("Lineage reference object : ROBINST_DL_AP_NO_DAYS")
    private Double dlApNoDays;
    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : ROBINST_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_APPLY_FYFTB_RULE_IND")
    private String applyFyftbRuleInd;
    /**
     * Stafford Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_ENTER_INTV
     * 
     */
    @JsonProperty("treqCodeEnterIntv")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_ENTER_INTV")
    private String treqCodeEnterIntv;
    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    @JsonPropertyDescription("Lineage reference object : ROBINST_SERV_AGENT_CDE")
    private String servAgentCde;
    /**
     * Process Electronic Change Transaction
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_IND
     * 
     */
    @JsonProperty("elAuditInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_EL_AUDIT_IND")
    private String elAuditInd;
    /**
     * Pell Reduced Eligibility
     * <p>
     * Lineage reference object : ROBINST_PELL_RED_ELIG_IND
     * 
     */
    @JsonProperty("pellRedEligInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_RED_ELIG_IND")
    private String pellRedEligInd;
    /**
     * SAR Requirement Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_SAR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeSar")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_SAR, Lookup lineage reference object : rtvtrst")
    private String trstCodeSar;
    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_ENTER_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeEnterIntv")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_ENTER_INTV, Lookup lineage reference object : rtvtrst")
    private String trstCodeEnterIntv;
    /**
     * Stafford Exit Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_EXIT_INTV
     * 
     */
    @JsonProperty("treqCodeExitIntv")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_EXIT_INTV")
    private String treqCodeExitIntv;
    /**
     * SAR Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_SAR
     * 
     */
    @JsonProperty("treqCodeSar")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_SAR")
    private String treqCodeSar;
    /**
     * Attending ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAttendingId")
    private String displayAttendingId;
    /**
     * Use Multi-Award Year Perkins MPN
     * <p>
     * Lineage reference object : ROBINST_MULTI_YR_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("multiYrPerkMpnFlag")
    @JsonPropertyDescription("Lineage reference object : ROBINST_MULTI_YR_PERK_MPN_FLAG")
    private String multiYrPerkMpnFlag;
    /**
     * Pell Formula
     * <p>
     * Lineage reference object : ROBINST_PELL_FORMULA_TYPE
     * 
     */
    @JsonProperty("pellFormulaType")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_FORMULA_TYPE")
    private String pellFormulaType;
    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_JUST_IN_TIME_IND
     * 
     */
    @JsonProperty("justInTimeInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_JUST_IN_TIME_IND")
    private String justInTimeInd;
    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EXIT_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeExitIntv")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_EXIT_INTV, Lookup lineage reference object : rtvtrst")
    private String trstCodeExitIntv;
    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase")
    private String pellFundCode;
    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_NO_DAYS
     * 
     */
    @JsonProperty("elAuditNoDays")
    @JsonPropertyDescription("Lineage reference object : ROBINST_EL_AUDIT_NO_DAYS")
    private Double elAuditNoDays;
    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_GRANT_AP_NO_DAYS
     * 
     */
    @JsonProperty("grantApNoDays")
    @JsonPropertyDescription("Lineage reference object : ROBINST_GRANT_AP_NO_DAYS")
    private Double grantApNoDays;
    /**
     * Direct Loan School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDlSchoolCode")
    private String displayDlSchoolCode;
    /**
     * Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_ENTR
     * 
     */
    @JsonProperty("treqCodeTeachEntr")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_TEACH_ENTR")
    private String treqCodeTeachEntr;
    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_GRANT_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("grantAdvancePayInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_GRANT_ADVANCE_PAY_IND")
    private String grantAdvancePayInd;
    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FED_SCHOOL_CODE")
    private String fedSchoolCode;
    /**
     * Exit Counseling Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_EXIT, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachExit")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_TEACH_EXIT, Lookup lineage reference object : rtvtrst")
    private String trstCodeTeachExit;
    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    private String displayReportingId;
    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TITLE_IV_RET_IND")
    private String titleIvRetInd;
    /**
     * Update Transaction Number, EFC, Auto Zero EFC
     * <p>
     * Lineage reference object : ROBINST_UPD_TRAN_IND
     * 
     */
    @JsonProperty("updTranInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_UPD_TRAN_IND")
    private String updTranInd;
    /**
     * Multi-Year Note Eligibility
     * <p>
     * Lineage reference object : ROBINST_MYN_ELIGIBLE
     * 
     */
    @JsonProperty("mynEligible")
    @JsonPropertyDescription("Lineage reference object : ROBINST_MYN_ELIGIBLE")
    private String mynEligible;
    /**
     * Health Profession Programs Amount (HPPA) Limits
     * <p>
     * Lineage reference object : ROBINST_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FORMER_HEAL_IND")
    private String formerHealInd;
    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : ROBINST_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    @JsonPropertyDescription("Lineage reference object : ROBINST_OPEID_BRANCH")
    private String opeidBranch;
    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENTITY_ID")
    private String entityId;
    /**
     * Exit Counseling Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_EXIT
     * 
     */
    @JsonProperty("treqCodeTeachExit")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_TEACH_EXIT")
    private String treqCodeTeachExit;
    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    @JsonPropertyDescription("Lineage reference object : ROBINST_DEST_NUMBER")
    private String destNumber;
    /**
     * Cash Monitoring or Reimbursement
     * <p>
     * Lineage reference object : ROBINST_CASH_MONITOR_IND
     * 
     */
    @JsonProperty("cashMonitorInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CASH_MONITOR_IND")
    private String cashMonitorInd;
    /**
     * Use Pell Less than Half Time Calculation
     * <p>
     * Lineage reference object : ROBINST_PELL_LT_HALF_IND
     * 
     */
    @JsonProperty("pellLtHalfInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_LT_HALF_IND")
    private String pellLtHalfInd;
    /**
     * OPEID
     * <p>
     * Lineage reference object : ROBINST_OPEID
     * 
     */
    @JsonProperty("opeid")
    @JsonPropertyDescription("Lineage reference object : ROBINST_OPEID")
    private String opeid;
    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TITLE_IV_ROUND_IND")
    private String titleIvRoundInd;
    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_JIT_NO_DAYS
     * 
     */
    @JsonProperty("jitNoDays")
    @JsonPropertyDescription("Lineage reference object : ROBINST_JIT_NO_DAYS")
    private Double jitNoDays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Entrance Interview Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachEntr")
    public String getTrstCodeTeachEntr() {
        return trstCodeTeachEntr;
    }

    /**
     * Entrance Interview Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachEntr")
    public void setTrstCodeTeachEntr(String trstCodeTeachEntr) {
        this.trstCodeTeachEntr = trstCodeTeachEntr;
    }

    public Robinst withTrstCodeTeachEntr(String trstCodeTeachEntr) {
        this.trstCodeTeachEntr = trstCodeTeachEntr;
        return this;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_DL_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("dlAdvancePayInd")
    public String getDlAdvancePayInd() {
        return dlAdvancePayInd;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_DL_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("dlAdvancePayInd")
    public void setDlAdvancePayInd(String dlAdvancePayInd) {
        this.dlAdvancePayInd = dlAdvancePayInd;
    }

    public Robinst withDlAdvancePayInd(String dlAdvancePayInd) {
        this.dlAdvancePayInd = dlAdvancePayInd;
        return this;
    }

    /**
     * Grad PLUS Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_GP_ENTR
     * 
     */
    @JsonProperty("treqCodeGpEntr")
    public String getTreqCodeGpEntr() {
        return treqCodeGpEntr;
    }

    /**
     * Grad PLUS Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_GP_ENTR
     * 
     */
    @JsonProperty("treqCodeGpEntr")
    public void setTreqCodeGpEntr(String treqCodeGpEntr) {
        this.treqCodeGpEntr = treqCodeGpEntr;
    }

    public Robinst withTreqCodeGpEntr(String treqCodeGpEntr) {
        this.treqCodeGpEntr = treqCodeGpEntr;
        return this;
    }

    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : ROBINST_INAS_NON_CUST
     * 
     */
    @JsonProperty("inasNonCust")
    public String getInasNonCust() {
        return inasNonCust;
    }

    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : ROBINST_INAS_NON_CUST
     * 
     */
    @JsonProperty("inasNonCust")
    public void setInasNonCust(String inasNonCust) {
        this.inasNonCust = inasNonCust;
    }

    public Robinst withInasNonCust(String inasNonCust) {
        this.inasNonCust = inasNonCust;
        return this;
    }

    /**
     * Loan Process Type
     * <p>
     * Lineage reference object : ROBINST_LOAN_PROCESS_TYPE
     * 
     */
    @JsonProperty("loanProcessType")
    public String getLoanProcessType() {
        return loanProcessType;
    }

    /**
     * Loan Process Type
     * <p>
     * Lineage reference object : ROBINST_LOAN_PROCESS_TYPE
     * 
     */
    @JsonProperty("loanProcessType")
    public void setLoanProcessType(String loanProcessType) {
        this.loanProcessType = loanProcessType;
    }

    public Robinst withLoanProcessType(String loanProcessType) {
        this.loanProcessType = loanProcessType;
        return this;
    }

    /**
     * EDE Correction Logging
     * <p>
     * Lineage reference object : ROBINST_PELL_AUDIT_IND
     * 
     */
    @JsonProperty("pellAuditInd")
    public String getPellAuditInd() {
        return pellAuditInd;
    }

    /**
     * EDE Correction Logging
     * <p>
     * Lineage reference object : ROBINST_PELL_AUDIT_IND
     * 
     */
    @JsonProperty("pellAuditInd")
    public void setPellAuditInd(String pellAuditInd) {
        this.pellAuditInd = pellAuditInd;
    }

    public Robinst withPellAuditInd(String pellAuditInd) {
        this.pellAuditInd = pellAuditInd;
        return this;
    }

    /**
     * Electronic Branch ID
     * <p>
     * Lineage reference object : ROBINST_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    public String getElBranchCde() {
        return elBranchCde;
    }

    /**
     * Electronic Branch ID
     * <p>
     * Lineage reference object : ROBINST_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    public void setElBranchCde(String elBranchCde) {
        this.elBranchCde = elBranchCde;
    }

    public Robinst withElBranchCde(String elBranchCde) {
        this.elBranchCde = elBranchCde;
        return this;
    }

    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : ROBINST_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    public String getTurnOffPellInd() {
        return turnOffPellInd;
    }

    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : ROBINST_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    public void setTurnOffPellInd(String turnOffPellInd) {
        this.turnOffPellInd = turnOffPellInd;
    }

    public Robinst withTurnOffPellInd(String turnOffPellInd) {
        this.turnOffPellInd = turnOffPellInd;
        return this;
    }

    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : ROBINST_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    public String getElSchoolCde() {
        return elSchoolCde;
    }

    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : ROBINST_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    public void setElSchoolCde(String elSchoolCde) {
        this.elSchoolCde = elSchoolCde;
    }

    public Robinst withElSchoolCde(String elSchoolCde) {
        this.elSchoolCde = elSchoolCde;
        return this;
    }

    /**
     * Alternate Pell Schedules Used
     * <p>
     * Lineage reference object : ROBINST_ALTERNATE_PELL_IND
     * 
     */
    @JsonProperty("alternatePellInd")
    public String getAlternatePellInd() {
        return alternatePellInd;
    }

    /**
     * Alternate Pell Schedules Used
     * <p>
     * Lineage reference object : ROBINST_ALTERNATE_PELL_IND
     * 
     */
    @JsonProperty("alternatePellInd")
    public void setAlternatePellInd(String alternatePellInd) {
        this.alternatePellInd = alternatePellInd;
    }

    public Robinst withAlternatePellInd(String alternatePellInd) {
        this.alternatePellInd = alternatePellInd;
        return this;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_GP_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeGpEntr")
    public String getTrstCodeGpEntr() {
        return trstCodeGpEntr;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_GP_ENTR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeGpEntr")
    public void setTrstCodeGpEntr(String trstCodeGpEntr) {
        this.trstCodeGpEntr = trstCodeGpEntr;
    }

    public Robinst withTrstCodeGpEntr(String trstCodeGpEntr) {
        this.trstCodeGpEntr = trstCodeGpEntr;
        return this;
    }

    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    public String getDisplaySourceId() {
        return displaySourceId;
    }

    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    public void setDisplaySourceId(String displaySourceId) {
        this.displaySourceId = displaySourceId;
    }

    public Robinst withDisplaySourceId(String displaySourceId) {
        this.displaySourceId = displaySourceId;
        return this;
    }

    /**
     * Pell ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPellId")
    public String getDisplayPellId() {
        return displayPellId;
    }

    /**
     * Pell ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPellId")
    public void setDisplayPellId(String displayPellId) {
        this.displayPellId = displayPellId;
    }

    public Robinst withDisplayPellId(String displayPellId) {
        this.displayPellId = displayPellId;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_DL_AP_NO_DAYS
     * 
     */
    @JsonProperty("dlApNoDays")
    public Double getDlApNoDays() {
        return dlApNoDays;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_DL_AP_NO_DAYS
     * 
     */
    @JsonProperty("dlApNoDays")
    public void setDlApNoDays(Double dlApNoDays) {
        this.dlApNoDays = dlApNoDays;
    }

    public Robinst withDlApNoDays(Double dlApNoDays) {
        this.dlApNoDays = dlApNoDays;
        return this;
    }

    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : ROBINST_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    public String getApplyFyftbRuleInd() {
        return applyFyftbRuleInd;
    }

    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : ROBINST_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    public void setApplyFyftbRuleInd(String applyFyftbRuleInd) {
        this.applyFyftbRuleInd = applyFyftbRuleInd;
    }

    public Robinst withApplyFyftbRuleInd(String applyFyftbRuleInd) {
        this.applyFyftbRuleInd = applyFyftbRuleInd;
        return this;
    }

    /**
     * Stafford Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_ENTER_INTV
     * 
     */
    @JsonProperty("treqCodeEnterIntv")
    public String getTreqCodeEnterIntv() {
        return treqCodeEnterIntv;
    }

    /**
     * Stafford Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_ENTER_INTV
     * 
     */
    @JsonProperty("treqCodeEnterIntv")
    public void setTreqCodeEnterIntv(String treqCodeEnterIntv) {
        this.treqCodeEnterIntv = treqCodeEnterIntv;
    }

    public Robinst withTreqCodeEnterIntv(String treqCodeEnterIntv) {
        this.treqCodeEnterIntv = treqCodeEnterIntv;
        return this;
    }

    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    public String getServAgentCde() {
        return servAgentCde;
    }

    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    public void setServAgentCde(String servAgentCde) {
        this.servAgentCde = servAgentCde;
    }

    public Robinst withServAgentCde(String servAgentCde) {
        this.servAgentCde = servAgentCde;
        return this;
    }

    /**
     * Process Electronic Change Transaction
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_IND
     * 
     */
    @JsonProperty("elAuditInd")
    public String getElAuditInd() {
        return elAuditInd;
    }

    /**
     * Process Electronic Change Transaction
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_IND
     * 
     */
    @JsonProperty("elAuditInd")
    public void setElAuditInd(String elAuditInd) {
        this.elAuditInd = elAuditInd;
    }

    public Robinst withElAuditInd(String elAuditInd) {
        this.elAuditInd = elAuditInd;
        return this;
    }

    /**
     * Pell Reduced Eligibility
     * <p>
     * Lineage reference object : ROBINST_PELL_RED_ELIG_IND
     * 
     */
    @JsonProperty("pellRedEligInd")
    public String getPellRedEligInd() {
        return pellRedEligInd;
    }

    /**
     * Pell Reduced Eligibility
     * <p>
     * Lineage reference object : ROBINST_PELL_RED_ELIG_IND
     * 
     */
    @JsonProperty("pellRedEligInd")
    public void setPellRedEligInd(String pellRedEligInd) {
        this.pellRedEligInd = pellRedEligInd;
    }

    public Robinst withPellRedEligInd(String pellRedEligInd) {
        this.pellRedEligInd = pellRedEligInd;
        return this;
    }

    /**
     * SAR Requirement Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_SAR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeSar")
    public String getTrstCodeSar() {
        return trstCodeSar;
    }

    /**
     * SAR Requirement Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_SAR, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeSar")
    public void setTrstCodeSar(String trstCodeSar) {
        this.trstCodeSar = trstCodeSar;
    }

    public Robinst withTrstCodeSar(String trstCodeSar) {
        this.trstCodeSar = trstCodeSar;
        return this;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_ENTER_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeEnterIntv")
    public String getTrstCodeEnterIntv() {
        return trstCodeEnterIntv;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_ENTER_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeEnterIntv")
    public void setTrstCodeEnterIntv(String trstCodeEnterIntv) {
        this.trstCodeEnterIntv = trstCodeEnterIntv;
    }

    public Robinst withTrstCodeEnterIntv(String trstCodeEnterIntv) {
        this.trstCodeEnterIntv = trstCodeEnterIntv;
        return this;
    }

    /**
     * Stafford Exit Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_EXIT_INTV
     * 
     */
    @JsonProperty("treqCodeExitIntv")
    public String getTreqCodeExitIntv() {
        return treqCodeExitIntv;
    }

    /**
     * Stafford Exit Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_EXIT_INTV
     * 
     */
    @JsonProperty("treqCodeExitIntv")
    public void setTreqCodeExitIntv(String treqCodeExitIntv) {
        this.treqCodeExitIntv = treqCodeExitIntv;
    }

    public Robinst withTreqCodeExitIntv(String treqCodeExitIntv) {
        this.treqCodeExitIntv = treqCodeExitIntv;
        return this;
    }

    /**
     * SAR Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_SAR
     * 
     */
    @JsonProperty("treqCodeSar")
    public String getTreqCodeSar() {
        return treqCodeSar;
    }

    /**
     * SAR Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_SAR
     * 
     */
    @JsonProperty("treqCodeSar")
    public void setTreqCodeSar(String treqCodeSar) {
        this.treqCodeSar = treqCodeSar;
    }

    public Robinst withTreqCodeSar(String treqCodeSar) {
        this.treqCodeSar = treqCodeSar;
        return this;
    }

    /**
     * Attending ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAttendingId")
    public String getDisplayAttendingId() {
        return displayAttendingId;
    }

    /**
     * Attending ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAttendingId")
    public void setDisplayAttendingId(String displayAttendingId) {
        this.displayAttendingId = displayAttendingId;
    }

    public Robinst withDisplayAttendingId(String displayAttendingId) {
        this.displayAttendingId = displayAttendingId;
        return this;
    }

    /**
     * Use Multi-Award Year Perkins MPN
     * <p>
     * Lineage reference object : ROBINST_MULTI_YR_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("multiYrPerkMpnFlag")
    public String getMultiYrPerkMpnFlag() {
        return multiYrPerkMpnFlag;
    }

    /**
     * Use Multi-Award Year Perkins MPN
     * <p>
     * Lineage reference object : ROBINST_MULTI_YR_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("multiYrPerkMpnFlag")
    public void setMultiYrPerkMpnFlag(String multiYrPerkMpnFlag) {
        this.multiYrPerkMpnFlag = multiYrPerkMpnFlag;
    }

    public Robinst withMultiYrPerkMpnFlag(String multiYrPerkMpnFlag) {
        this.multiYrPerkMpnFlag = multiYrPerkMpnFlag;
        return this;
    }

    /**
     * Pell Formula
     * <p>
     * Lineage reference object : ROBINST_PELL_FORMULA_TYPE
     * 
     */
    @JsonProperty("pellFormulaType")
    public String getPellFormulaType() {
        return pellFormulaType;
    }

    /**
     * Pell Formula
     * <p>
     * Lineage reference object : ROBINST_PELL_FORMULA_TYPE
     * 
     */
    @JsonProperty("pellFormulaType")
    public void setPellFormulaType(String pellFormulaType) {
        this.pellFormulaType = pellFormulaType;
    }

    public Robinst withPellFormulaType(String pellFormulaType) {
        this.pellFormulaType = pellFormulaType;
        return this;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_JUST_IN_TIME_IND
     * 
     */
    @JsonProperty("justInTimeInd")
    public String getJustInTimeInd() {
        return justInTimeInd;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_JUST_IN_TIME_IND
     * 
     */
    @JsonProperty("justInTimeInd")
    public void setJustInTimeInd(String justInTimeInd) {
        this.justInTimeInd = justInTimeInd;
    }

    public Robinst withJustInTimeInd(String justInTimeInd) {
        this.justInTimeInd = justInTimeInd;
        return this;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EXIT_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeExitIntv")
    public String getTrstCodeExitIntv() {
        return trstCodeExitIntv;
    }

    /**
     * Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EXIT_INTV, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeExitIntv")
    public void setTrstCodeExitIntv(String trstCodeExitIntv) {
        this.trstCodeExitIntv = trstCodeExitIntv;
    }

    public Robinst withTrstCodeExitIntv(String trstCodeExitIntv) {
        this.trstCodeExitIntv = trstCodeExitIntv;
        return this;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public String getPellFundCode() {
        return pellFundCode;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public void setPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
    }

    public Robinst withPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_NO_DAYS
     * 
     */
    @JsonProperty("elAuditNoDays")
    public Double getElAuditNoDays() {
        return elAuditNoDays;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_EL_AUDIT_NO_DAYS
     * 
     */
    @JsonProperty("elAuditNoDays")
    public void setElAuditNoDays(Double elAuditNoDays) {
        this.elAuditNoDays = elAuditNoDays;
    }

    public Robinst withElAuditNoDays(Double elAuditNoDays) {
        this.elAuditNoDays = elAuditNoDays;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_GRANT_AP_NO_DAYS
     * 
     */
    @JsonProperty("grantApNoDays")
    public Double getGrantApNoDays() {
        return grantApNoDays;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_GRANT_AP_NO_DAYS
     * 
     */
    @JsonProperty("grantApNoDays")
    public void setGrantApNoDays(Double grantApNoDays) {
        this.grantApNoDays = grantApNoDays;
    }

    public Robinst withGrantApNoDays(Double grantApNoDays) {
        this.grantApNoDays = grantApNoDays;
        return this;
    }

    /**
     * Direct Loan School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDlSchoolCode")
    public String getDisplayDlSchoolCode() {
        return displayDlSchoolCode;
    }

    /**
     * Direct Loan School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDlSchoolCode")
    public void setDisplayDlSchoolCode(String displayDlSchoolCode) {
        this.displayDlSchoolCode = displayDlSchoolCode;
    }

    public Robinst withDisplayDlSchoolCode(String displayDlSchoolCode) {
        this.displayDlSchoolCode = displayDlSchoolCode;
        return this;
    }

    /**
     * Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_ENTR
     * 
     */
    @JsonProperty("treqCodeTeachEntr")
    public String getTreqCodeTeachEntr() {
        return treqCodeTeachEntr;
    }

    /**
     * Entrance Interview Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_ENTR
     * 
     */
    @JsonProperty("treqCodeTeachEntr")
    public void setTreqCodeTeachEntr(String treqCodeTeachEntr) {
        this.treqCodeTeachEntr = treqCodeTeachEntr;
    }

    public Robinst withTreqCodeTeachEntr(String treqCodeTeachEntr) {
        this.treqCodeTeachEntr = treqCodeTeachEntr;
        return this;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_GRANT_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("grantAdvancePayInd")
    public String getGrantAdvancePayInd() {
        return grantAdvancePayInd;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : ROBINST_GRANT_ADVANCE_PAY_IND
     * 
     */
    @JsonProperty("grantAdvancePayInd")
    public void setGrantAdvancePayInd(String grantAdvancePayInd) {
        this.grantAdvancePayInd = grantAdvancePayInd;
    }

    public Robinst withGrantAdvancePayInd(String grantAdvancePayInd) {
        this.grantAdvancePayInd = grantAdvancePayInd;
        return this;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public String getFedSchoolCode() {
        return fedSchoolCode;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public void setFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
    }

    public Robinst withFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
        return this;
    }

    /**
     * Exit Counseling Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_EXIT, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachExit")
    public String getTrstCodeTeachExit() {
        return trstCodeTeachExit;
    }

    /**
     * Exit Counseling Satisfied Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_TEACH_EXIT, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCodeTeachExit")
    public void setTrstCodeTeachExit(String trstCodeTeachExit) {
        this.trstCodeTeachExit = trstCodeTeachExit;
    }

    public Robinst withTrstCodeTeachExit(String trstCodeTeachExit) {
        this.trstCodeTeachExit = trstCodeTeachExit;
        return this;
    }

    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    public String getDisplayReportingId() {
        return displayReportingId;
    }

    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    public void setDisplayReportingId(String displayReportingId) {
        this.displayReportingId = displayReportingId;
    }

    public Robinst withDisplayReportingId(String displayReportingId) {
        this.displayReportingId = displayReportingId;
        return this;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public String getTitleIvRetInd() {
        return titleIvRetInd;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public void setTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
    }

    public Robinst withTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
        return this;
    }

    /**
     * Update Transaction Number, EFC, Auto Zero EFC
     * <p>
     * Lineage reference object : ROBINST_UPD_TRAN_IND
     * 
     */
    @JsonProperty("updTranInd")
    public String getUpdTranInd() {
        return updTranInd;
    }

    /**
     * Update Transaction Number, EFC, Auto Zero EFC
     * <p>
     * Lineage reference object : ROBINST_UPD_TRAN_IND
     * 
     */
    @JsonProperty("updTranInd")
    public void setUpdTranInd(String updTranInd) {
        this.updTranInd = updTranInd;
    }

    public Robinst withUpdTranInd(String updTranInd) {
        this.updTranInd = updTranInd;
        return this;
    }

    /**
     * Multi-Year Note Eligibility
     * <p>
     * Lineage reference object : ROBINST_MYN_ELIGIBLE
     * 
     */
    @JsonProperty("mynEligible")
    public String getMynEligible() {
        return mynEligible;
    }

    /**
     * Multi-Year Note Eligibility
     * <p>
     * Lineage reference object : ROBINST_MYN_ELIGIBLE
     * 
     */
    @JsonProperty("mynEligible")
    public void setMynEligible(String mynEligible) {
        this.mynEligible = mynEligible;
    }

    public Robinst withMynEligible(String mynEligible) {
        this.mynEligible = mynEligible;
        return this;
    }

    /**
     * Health Profession Programs Amount (HPPA) Limits
     * <p>
     * Lineage reference object : ROBINST_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    public String getFormerHealInd() {
        return formerHealInd;
    }

    /**
     * Health Profession Programs Amount (HPPA) Limits
     * <p>
     * Lineage reference object : ROBINST_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    public void setFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
    }

    public Robinst withFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
        return this;
    }

    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : ROBINST_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    public String getOpeidBranch() {
        return opeidBranch;
    }

    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : ROBINST_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    public void setOpeidBranch(String opeidBranch) {
        this.opeidBranch = opeidBranch;
    }

    public Robinst withOpeidBranch(String opeidBranch) {
        this.opeidBranch = opeidBranch;
        return this;
    }

    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Robinst withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Exit Counseling Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_EXIT
     * 
     */
    @JsonProperty("treqCodeTeachExit")
    public String getTreqCodeTeachExit() {
        return treqCodeTeachExit;
    }

    /**
     * Exit Counseling Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_TEACH_EXIT
     * 
     */
    @JsonProperty("treqCodeTeachExit")
    public void setTreqCodeTeachExit(String treqCodeTeachExit) {
        this.treqCodeTeachExit = treqCodeTeachExit;
    }

    public Robinst withTreqCodeTeachExit(String treqCodeTeachExit) {
        this.treqCodeTeachExit = treqCodeTeachExit;
        return this;
    }

    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    public String getDestNumber() {
        return destNumber;
    }

    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    public void setDestNumber(String destNumber) {
        this.destNumber = destNumber;
    }

    public Robinst withDestNumber(String destNumber) {
        this.destNumber = destNumber;
        return this;
    }

    /**
     * Cash Monitoring or Reimbursement
     * <p>
     * Lineage reference object : ROBINST_CASH_MONITOR_IND
     * 
     */
    @JsonProperty("cashMonitorInd")
    public String getCashMonitorInd() {
        return cashMonitorInd;
    }

    /**
     * Cash Monitoring or Reimbursement
     * <p>
     * Lineage reference object : ROBINST_CASH_MONITOR_IND
     * 
     */
    @JsonProperty("cashMonitorInd")
    public void setCashMonitorInd(String cashMonitorInd) {
        this.cashMonitorInd = cashMonitorInd;
    }

    public Robinst withCashMonitorInd(String cashMonitorInd) {
        this.cashMonitorInd = cashMonitorInd;
        return this;
    }

    /**
     * Use Pell Less than Half Time Calculation
     * <p>
     * Lineage reference object : ROBINST_PELL_LT_HALF_IND
     * 
     */
    @JsonProperty("pellLtHalfInd")
    public String getPellLtHalfInd() {
        return pellLtHalfInd;
    }

    /**
     * Use Pell Less than Half Time Calculation
     * <p>
     * Lineage reference object : ROBINST_PELL_LT_HALF_IND
     * 
     */
    @JsonProperty("pellLtHalfInd")
    public void setPellLtHalfInd(String pellLtHalfInd) {
        this.pellLtHalfInd = pellLtHalfInd;
    }

    public Robinst withPellLtHalfInd(String pellLtHalfInd) {
        this.pellLtHalfInd = pellLtHalfInd;
        return this;
    }

    /**
     * OPEID
     * <p>
     * Lineage reference object : ROBINST_OPEID
     * 
     */
    @JsonProperty("opeid")
    public String getOpeid() {
        return opeid;
    }

    /**
     * OPEID
     * <p>
     * Lineage reference object : ROBINST_OPEID
     * 
     */
    @JsonProperty("opeid")
    public void setOpeid(String opeid) {
        this.opeid = opeid;
    }

    public Robinst withOpeid(String opeid) {
        this.opeid = opeid;
        return this;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public String getTitleIvRoundInd() {
        return titleIvRoundInd;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public void setTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
    }

    public Robinst withTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_JIT_NO_DAYS
     * 
     */
    @JsonProperty("jitNoDays")
    public Double getJitNoDays() {
        return jitNoDays;
    }

    /**
     * Number of Days
     * <p>
     * Lineage reference object : ROBINST_JIT_NO_DAYS
     * 
     */
    @JsonProperty("jitNoDays")
    public void setJitNoDays(Double jitNoDays) {
        this.jitNoDays = jitNoDays;
    }

    public Robinst withJitNoDays(Double jitNoDays) {
        this.jitNoDays = jitNoDays;
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

    public Robinst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Robinst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trstCodeTeachEntr");
        sb.append('=');
        sb.append(((this.trstCodeTeachEntr == null)?"<null>":this.trstCodeTeachEntr));
        sb.append(',');
        sb.append("dlAdvancePayInd");
        sb.append('=');
        sb.append(((this.dlAdvancePayInd == null)?"<null>":this.dlAdvancePayInd));
        sb.append(',');
        sb.append("treqCodeGpEntr");
        sb.append('=');
        sb.append(((this.treqCodeGpEntr == null)?"<null>":this.treqCodeGpEntr));
        sb.append(',');
        sb.append("inasNonCust");
        sb.append('=');
        sb.append(((this.inasNonCust == null)?"<null>":this.inasNonCust));
        sb.append(',');
        sb.append("loanProcessType");
        sb.append('=');
        sb.append(((this.loanProcessType == null)?"<null>":this.loanProcessType));
        sb.append(',');
        sb.append("pellAuditInd");
        sb.append('=');
        sb.append(((this.pellAuditInd == null)?"<null>":this.pellAuditInd));
        sb.append(',');
        sb.append("elBranchCde");
        sb.append('=');
        sb.append(((this.elBranchCde == null)?"<null>":this.elBranchCde));
        sb.append(',');
        sb.append("turnOffPellInd");
        sb.append('=');
        sb.append(((this.turnOffPellInd == null)?"<null>":this.turnOffPellInd));
        sb.append(',');
        sb.append("elSchoolCde");
        sb.append('=');
        sb.append(((this.elSchoolCde == null)?"<null>":this.elSchoolCde));
        sb.append(',');
        sb.append("alternatePellInd");
        sb.append('=');
        sb.append(((this.alternatePellInd == null)?"<null>":this.alternatePellInd));
        sb.append(',');
        sb.append("trstCodeGpEntr");
        sb.append('=');
        sb.append(((this.trstCodeGpEntr == null)?"<null>":this.trstCodeGpEntr));
        sb.append(',');
        sb.append("displaySourceId");
        sb.append('=');
        sb.append(((this.displaySourceId == null)?"<null>":this.displaySourceId));
        sb.append(',');
        sb.append("displayPellId");
        sb.append('=');
        sb.append(((this.displayPellId == null)?"<null>":this.displayPellId));
        sb.append(',');
        sb.append("dlApNoDays");
        sb.append('=');
        sb.append(((this.dlApNoDays == null)?"<null>":this.dlApNoDays));
        sb.append(',');
        sb.append("applyFyftbRuleInd");
        sb.append('=');
        sb.append(((this.applyFyftbRuleInd == null)?"<null>":this.applyFyftbRuleInd));
        sb.append(',');
        sb.append("treqCodeEnterIntv");
        sb.append('=');
        sb.append(((this.treqCodeEnterIntv == null)?"<null>":this.treqCodeEnterIntv));
        sb.append(',');
        sb.append("servAgentCde");
        sb.append('=');
        sb.append(((this.servAgentCde == null)?"<null>":this.servAgentCde));
        sb.append(',');
        sb.append("elAuditInd");
        sb.append('=');
        sb.append(((this.elAuditInd == null)?"<null>":this.elAuditInd));
        sb.append(',');
        sb.append("pellRedEligInd");
        sb.append('=');
        sb.append(((this.pellRedEligInd == null)?"<null>":this.pellRedEligInd));
        sb.append(',');
        sb.append("trstCodeSar");
        sb.append('=');
        sb.append(((this.trstCodeSar == null)?"<null>":this.trstCodeSar));
        sb.append(',');
        sb.append("trstCodeEnterIntv");
        sb.append('=');
        sb.append(((this.trstCodeEnterIntv == null)?"<null>":this.trstCodeEnterIntv));
        sb.append(',');
        sb.append("treqCodeExitIntv");
        sb.append('=');
        sb.append(((this.treqCodeExitIntv == null)?"<null>":this.treqCodeExitIntv));
        sb.append(',');
        sb.append("treqCodeSar");
        sb.append('=');
        sb.append(((this.treqCodeSar == null)?"<null>":this.treqCodeSar));
        sb.append(',');
        sb.append("displayAttendingId");
        sb.append('=');
        sb.append(((this.displayAttendingId == null)?"<null>":this.displayAttendingId));
        sb.append(',');
        sb.append("multiYrPerkMpnFlag");
        sb.append('=');
        sb.append(((this.multiYrPerkMpnFlag == null)?"<null>":this.multiYrPerkMpnFlag));
        sb.append(',');
        sb.append("pellFormulaType");
        sb.append('=');
        sb.append(((this.pellFormulaType == null)?"<null>":this.pellFormulaType));
        sb.append(',');
        sb.append("justInTimeInd");
        sb.append('=');
        sb.append(((this.justInTimeInd == null)?"<null>":this.justInTimeInd));
        sb.append(',');
        sb.append("trstCodeExitIntv");
        sb.append('=');
        sb.append(((this.trstCodeExitIntv == null)?"<null>":this.trstCodeExitIntv));
        sb.append(',');
        sb.append("pellFundCode");
        sb.append('=');
        sb.append(((this.pellFundCode == null)?"<null>":this.pellFundCode));
        sb.append(',');
        sb.append("elAuditNoDays");
        sb.append('=');
        sb.append(((this.elAuditNoDays == null)?"<null>":this.elAuditNoDays));
        sb.append(',');
        sb.append("grantApNoDays");
        sb.append('=');
        sb.append(((this.grantApNoDays == null)?"<null>":this.grantApNoDays));
        sb.append(',');
        sb.append("displayDlSchoolCode");
        sb.append('=');
        sb.append(((this.displayDlSchoolCode == null)?"<null>":this.displayDlSchoolCode));
        sb.append(',');
        sb.append("treqCodeTeachEntr");
        sb.append('=');
        sb.append(((this.treqCodeTeachEntr == null)?"<null>":this.treqCodeTeachEntr));
        sb.append(',');
        sb.append("grantAdvancePayInd");
        sb.append('=');
        sb.append(((this.grantAdvancePayInd == null)?"<null>":this.grantAdvancePayInd));
        sb.append(',');
        sb.append("fedSchoolCode");
        sb.append('=');
        sb.append(((this.fedSchoolCode == null)?"<null>":this.fedSchoolCode));
        sb.append(',');
        sb.append("trstCodeTeachExit");
        sb.append('=');
        sb.append(((this.trstCodeTeachExit == null)?"<null>":this.trstCodeTeachExit));
        sb.append(',');
        sb.append("displayReportingId");
        sb.append('=');
        sb.append(((this.displayReportingId == null)?"<null>":this.displayReportingId));
        sb.append(',');
        sb.append("titleIvRetInd");
        sb.append('=');
        sb.append(((this.titleIvRetInd == null)?"<null>":this.titleIvRetInd));
        sb.append(',');
        sb.append("updTranInd");
        sb.append('=');
        sb.append(((this.updTranInd == null)?"<null>":this.updTranInd));
        sb.append(',');
        sb.append("mynEligible");
        sb.append('=');
        sb.append(((this.mynEligible == null)?"<null>":this.mynEligible));
        sb.append(',');
        sb.append("formerHealInd");
        sb.append('=');
        sb.append(((this.formerHealInd == null)?"<null>":this.formerHealInd));
        sb.append(',');
        sb.append("opeidBranch");
        sb.append('=');
        sb.append(((this.opeidBranch == null)?"<null>":this.opeidBranch));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("treqCodeTeachExit");
        sb.append('=');
        sb.append(((this.treqCodeTeachExit == null)?"<null>":this.treqCodeTeachExit));
        sb.append(',');
        sb.append("destNumber");
        sb.append('=');
        sb.append(((this.destNumber == null)?"<null>":this.destNumber));
        sb.append(',');
        sb.append("cashMonitorInd");
        sb.append('=');
        sb.append(((this.cashMonitorInd == null)?"<null>":this.cashMonitorInd));
        sb.append(',');
        sb.append("pellLtHalfInd");
        sb.append('=');
        sb.append(((this.pellLtHalfInd == null)?"<null>":this.pellLtHalfInd));
        sb.append(',');
        sb.append("opeid");
        sb.append('=');
        sb.append(((this.opeid == null)?"<null>":this.opeid));
        sb.append(',');
        sb.append("titleIvRoundInd");
        sb.append('=');
        sb.append(((this.titleIvRoundInd == null)?"<null>":this.titleIvRoundInd));
        sb.append(',');
        sb.append("jitNoDays");
        sb.append('=');
        sb.append(((this.jitNoDays == null)?"<null>":this.jitNoDays));
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
        result = ((result* 31)+((this.trstCodeTeachEntr == null)? 0 :this.trstCodeTeachEntr.hashCode()));
        result = ((result* 31)+((this.dlAdvancePayInd == null)? 0 :this.dlAdvancePayInd.hashCode()));
        result = ((result* 31)+((this.treqCodeGpEntr == null)? 0 :this.treqCodeGpEntr.hashCode()));
        result = ((result* 31)+((this.inasNonCust == null)? 0 :this.inasNonCust.hashCode()));
        result = ((result* 31)+((this.loanProcessType == null)? 0 :this.loanProcessType.hashCode()));
        result = ((result* 31)+((this.pellAuditInd == null)? 0 :this.pellAuditInd.hashCode()));
        result = ((result* 31)+((this.elBranchCde == null)? 0 :this.elBranchCde.hashCode()));
        result = ((result* 31)+((this.turnOffPellInd == null)? 0 :this.turnOffPellInd.hashCode()));
        result = ((result* 31)+((this.elSchoolCde == null)? 0 :this.elSchoolCde.hashCode()));
        result = ((result* 31)+((this.alternatePellInd == null)? 0 :this.alternatePellInd.hashCode()));
        result = ((result* 31)+((this.trstCodeGpEntr == null)? 0 :this.trstCodeGpEntr.hashCode()));
        result = ((result* 31)+((this.displaySourceId == null)? 0 :this.displaySourceId.hashCode()));
        result = ((result* 31)+((this.displayPellId == null)? 0 :this.displayPellId.hashCode()));
        result = ((result* 31)+((this.dlApNoDays == null)? 0 :this.dlApNoDays.hashCode()));
        result = ((result* 31)+((this.applyFyftbRuleInd == null)? 0 :this.applyFyftbRuleInd.hashCode()));
        result = ((result* 31)+((this.treqCodeEnterIntv == null)? 0 :this.treqCodeEnterIntv.hashCode()));
        result = ((result* 31)+((this.servAgentCde == null)? 0 :this.servAgentCde.hashCode()));
        result = ((result* 31)+((this.elAuditInd == null)? 0 :this.elAuditInd.hashCode()));
        result = ((result* 31)+((this.pellRedEligInd == null)? 0 :this.pellRedEligInd.hashCode()));
        result = ((result* 31)+((this.trstCodeSar == null)? 0 :this.trstCodeSar.hashCode()));
        result = ((result* 31)+((this.trstCodeEnterIntv == null)? 0 :this.trstCodeEnterIntv.hashCode()));
        result = ((result* 31)+((this.treqCodeExitIntv == null)? 0 :this.treqCodeExitIntv.hashCode()));
        result = ((result* 31)+((this.treqCodeSar == null)? 0 :this.treqCodeSar.hashCode()));
        result = ((result* 31)+((this.displayAttendingId == null)? 0 :this.displayAttendingId.hashCode()));
        result = ((result* 31)+((this.multiYrPerkMpnFlag == null)? 0 :this.multiYrPerkMpnFlag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pellFormulaType == null)? 0 :this.pellFormulaType.hashCode()));
        result = ((result* 31)+((this.justInTimeInd == null)? 0 :this.justInTimeInd.hashCode()));
        result = ((result* 31)+((this.trstCodeExitIntv == null)? 0 :this.trstCodeExitIntv.hashCode()));
        result = ((result* 31)+((this.pellFundCode == null)? 0 :this.pellFundCode.hashCode()));
        result = ((result* 31)+((this.elAuditNoDays == null)? 0 :this.elAuditNoDays.hashCode()));
        result = ((result* 31)+((this.grantApNoDays == null)? 0 :this.grantApNoDays.hashCode()));
        result = ((result* 31)+((this.displayDlSchoolCode == null)? 0 :this.displayDlSchoolCode.hashCode()));
        result = ((result* 31)+((this.treqCodeTeachEntr == null)? 0 :this.treqCodeTeachEntr.hashCode()));
        result = ((result* 31)+((this.grantAdvancePayInd == null)? 0 :this.grantAdvancePayInd.hashCode()));
        result = ((result* 31)+((this.fedSchoolCode == null)? 0 :this.fedSchoolCode.hashCode()));
        result = ((result* 31)+((this.trstCodeTeachExit == null)? 0 :this.trstCodeTeachExit.hashCode()));
        result = ((result* 31)+((this.displayReportingId == null)? 0 :this.displayReportingId.hashCode()));
        result = ((result* 31)+((this.titleIvRetInd == null)? 0 :this.titleIvRetInd.hashCode()));
        result = ((result* 31)+((this.updTranInd == null)? 0 :this.updTranInd.hashCode()));
        result = ((result* 31)+((this.mynEligible == null)? 0 :this.mynEligible.hashCode()));
        result = ((result* 31)+((this.formerHealInd == null)? 0 :this.formerHealInd.hashCode()));
        result = ((result* 31)+((this.opeidBranch == null)? 0 :this.opeidBranch.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.treqCodeTeachExit == null)? 0 :this.treqCodeTeachExit.hashCode()));
        result = ((result* 31)+((this.destNumber == null)? 0 :this.destNumber.hashCode()));
        result = ((result* 31)+((this.cashMonitorInd == null)? 0 :this.cashMonitorInd.hashCode()));
        result = ((result* 31)+((this.pellLtHalfInd == null)? 0 :this.pellLtHalfInd.hashCode()));
        result = ((result* 31)+((this.opeid == null)? 0 :this.opeid.hashCode()));
        result = ((result* 31)+((this.titleIvRoundInd == null)? 0 :this.titleIvRoundInd.hashCode()));
        result = ((result* 31)+((this.jitNoDays == null)? 0 :this.jitNoDays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Robinst) == false) {
            return false;
        }
        Robinst rhs = ((Robinst) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.trstCodeTeachEntr == rhs.trstCodeTeachEntr)||((this.trstCodeTeachEntr!= null)&&this.trstCodeTeachEntr.equals(rhs.trstCodeTeachEntr)))&&((this.dlAdvancePayInd == rhs.dlAdvancePayInd)||((this.dlAdvancePayInd!= null)&&this.dlAdvancePayInd.equals(rhs.dlAdvancePayInd))))&&((this.treqCodeGpEntr == rhs.treqCodeGpEntr)||((this.treqCodeGpEntr!= null)&&this.treqCodeGpEntr.equals(rhs.treqCodeGpEntr))))&&((this.inasNonCust == rhs.inasNonCust)||((this.inasNonCust!= null)&&this.inasNonCust.equals(rhs.inasNonCust))))&&((this.loanProcessType == rhs.loanProcessType)||((this.loanProcessType!= null)&&this.loanProcessType.equals(rhs.loanProcessType))))&&((this.pellAuditInd == rhs.pellAuditInd)||((this.pellAuditInd!= null)&&this.pellAuditInd.equals(rhs.pellAuditInd))))&&((this.elBranchCde == rhs.elBranchCde)||((this.elBranchCde!= null)&&this.elBranchCde.equals(rhs.elBranchCde))))&&((this.turnOffPellInd == rhs.turnOffPellInd)||((this.turnOffPellInd!= null)&&this.turnOffPellInd.equals(rhs.turnOffPellInd))))&&((this.elSchoolCde == rhs.elSchoolCde)||((this.elSchoolCde!= null)&&this.elSchoolCde.equals(rhs.elSchoolCde))))&&((this.alternatePellInd == rhs.alternatePellInd)||((this.alternatePellInd!= null)&&this.alternatePellInd.equals(rhs.alternatePellInd))))&&((this.trstCodeGpEntr == rhs.trstCodeGpEntr)||((this.trstCodeGpEntr!= null)&&this.trstCodeGpEntr.equals(rhs.trstCodeGpEntr))))&&((this.displaySourceId == rhs.displaySourceId)||((this.displaySourceId!= null)&&this.displaySourceId.equals(rhs.displaySourceId))))&&((this.displayPellId == rhs.displayPellId)||((this.displayPellId!= null)&&this.displayPellId.equals(rhs.displayPellId))))&&((this.dlApNoDays == rhs.dlApNoDays)||((this.dlApNoDays!= null)&&this.dlApNoDays.equals(rhs.dlApNoDays))))&&((this.applyFyftbRuleInd == rhs.applyFyftbRuleInd)||((this.applyFyftbRuleInd!= null)&&this.applyFyftbRuleInd.equals(rhs.applyFyftbRuleInd))))&&((this.treqCodeEnterIntv == rhs.treqCodeEnterIntv)||((this.treqCodeEnterIntv!= null)&&this.treqCodeEnterIntv.equals(rhs.treqCodeEnterIntv))))&&((this.servAgentCde == rhs.servAgentCde)||((this.servAgentCde!= null)&&this.servAgentCde.equals(rhs.servAgentCde))))&&((this.elAuditInd == rhs.elAuditInd)||((this.elAuditInd!= null)&&this.elAuditInd.equals(rhs.elAuditInd))))&&((this.pellRedEligInd == rhs.pellRedEligInd)||((this.pellRedEligInd!= null)&&this.pellRedEligInd.equals(rhs.pellRedEligInd))))&&((this.trstCodeSar == rhs.trstCodeSar)||((this.trstCodeSar!= null)&&this.trstCodeSar.equals(rhs.trstCodeSar))))&&((this.trstCodeEnterIntv == rhs.trstCodeEnterIntv)||((this.trstCodeEnterIntv!= null)&&this.trstCodeEnterIntv.equals(rhs.trstCodeEnterIntv))))&&((this.treqCodeExitIntv == rhs.treqCodeExitIntv)||((this.treqCodeExitIntv!= null)&&this.treqCodeExitIntv.equals(rhs.treqCodeExitIntv))))&&((this.treqCodeSar == rhs.treqCodeSar)||((this.treqCodeSar!= null)&&this.treqCodeSar.equals(rhs.treqCodeSar))))&&((this.displayAttendingId == rhs.displayAttendingId)||((this.displayAttendingId!= null)&&this.displayAttendingId.equals(rhs.displayAttendingId))))&&((this.multiYrPerkMpnFlag == rhs.multiYrPerkMpnFlag)||((this.multiYrPerkMpnFlag!= null)&&this.multiYrPerkMpnFlag.equals(rhs.multiYrPerkMpnFlag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pellFormulaType == rhs.pellFormulaType)||((this.pellFormulaType!= null)&&this.pellFormulaType.equals(rhs.pellFormulaType))))&&((this.justInTimeInd == rhs.justInTimeInd)||((this.justInTimeInd!= null)&&this.justInTimeInd.equals(rhs.justInTimeInd))))&&((this.trstCodeExitIntv == rhs.trstCodeExitIntv)||((this.trstCodeExitIntv!= null)&&this.trstCodeExitIntv.equals(rhs.trstCodeExitIntv))))&&((this.pellFundCode == rhs.pellFundCode)||((this.pellFundCode!= null)&&this.pellFundCode.equals(rhs.pellFundCode))))&&((this.elAuditNoDays == rhs.elAuditNoDays)||((this.elAuditNoDays!= null)&&this.elAuditNoDays.equals(rhs.elAuditNoDays))))&&((this.grantApNoDays == rhs.grantApNoDays)||((this.grantApNoDays!= null)&&this.grantApNoDays.equals(rhs.grantApNoDays))))&&((this.displayDlSchoolCode == rhs.displayDlSchoolCode)||((this.displayDlSchoolCode!= null)&&this.displayDlSchoolCode.equals(rhs.displayDlSchoolCode))))&&((this.treqCodeTeachEntr == rhs.treqCodeTeachEntr)||((this.treqCodeTeachEntr!= null)&&this.treqCodeTeachEntr.equals(rhs.treqCodeTeachEntr))))&&((this.grantAdvancePayInd == rhs.grantAdvancePayInd)||((this.grantAdvancePayInd!= null)&&this.grantAdvancePayInd.equals(rhs.grantAdvancePayInd))))&&((this.fedSchoolCode == rhs.fedSchoolCode)||((this.fedSchoolCode!= null)&&this.fedSchoolCode.equals(rhs.fedSchoolCode))))&&((this.trstCodeTeachExit == rhs.trstCodeTeachExit)||((this.trstCodeTeachExit!= null)&&this.trstCodeTeachExit.equals(rhs.trstCodeTeachExit))))&&((this.displayReportingId == rhs.displayReportingId)||((this.displayReportingId!= null)&&this.displayReportingId.equals(rhs.displayReportingId))))&&((this.titleIvRetInd == rhs.titleIvRetInd)||((this.titleIvRetInd!= null)&&this.titleIvRetInd.equals(rhs.titleIvRetInd))))&&((this.updTranInd == rhs.updTranInd)||((this.updTranInd!= null)&&this.updTranInd.equals(rhs.updTranInd))))&&((this.mynEligible == rhs.mynEligible)||((this.mynEligible!= null)&&this.mynEligible.equals(rhs.mynEligible))))&&((this.formerHealInd == rhs.formerHealInd)||((this.formerHealInd!= null)&&this.formerHealInd.equals(rhs.formerHealInd))))&&((this.opeidBranch == rhs.opeidBranch)||((this.opeidBranch!= null)&&this.opeidBranch.equals(rhs.opeidBranch))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.treqCodeTeachExit == rhs.treqCodeTeachExit)||((this.treqCodeTeachExit!= null)&&this.treqCodeTeachExit.equals(rhs.treqCodeTeachExit))))&&((this.destNumber == rhs.destNumber)||((this.destNumber!= null)&&this.destNumber.equals(rhs.destNumber))))&&((this.cashMonitorInd == rhs.cashMonitorInd)||((this.cashMonitorInd!= null)&&this.cashMonitorInd.equals(rhs.cashMonitorInd))))&&((this.pellLtHalfInd == rhs.pellLtHalfInd)||((this.pellLtHalfInd!= null)&&this.pellLtHalfInd.equals(rhs.pellLtHalfInd))))&&((this.opeid == rhs.opeid)||((this.opeid!= null)&&this.opeid.equals(rhs.opeid))))&&((this.titleIvRoundInd == rhs.titleIvRoundInd)||((this.titleIvRoundInd!= null)&&this.titleIvRoundInd.equals(rhs.titleIvRoundInd))))&&((this.jitNoDays == rhs.jitNoDays)||((this.jitNoDays!= null)&&this.jitNoDays.equals(rhs.jitNoDays))));
    }

}
