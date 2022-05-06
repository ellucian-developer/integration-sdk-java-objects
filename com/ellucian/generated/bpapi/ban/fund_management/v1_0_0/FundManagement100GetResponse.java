
package com.ellucian.generated.bpapi.ban.fund_management.v1_0_0;

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
    "manualLoanInd",
    "enrrCode",
    "roundAwardAmt",
    "pnInstructions",
    "minAwardAmt",
    "rtvawstCancelDesc",
    "enablePeriodAwarding",
    "rtvawstMixAcceptDesc",
    "overrideNeedInd",
    "prorationInd",
    "disbNoDays",
    "directLoanInd",
    "awdChgLtrInd",
    "loanFeePct",
    "promReqInd",
    "webDeclineAwstCode",
    "enrrCodeDescription",
    "acptPartialAmtInd",
    "declineAwstCode",
    "transferAmt",
    "teachReductionPct",
    "inelAftCutDateInd",
    "recoupInd",
    "overrideNeedToCoa",
    "rtvawstWaDeclineDesc",
    "budgAllocAmt",
    "totalAllocAmt",
    "awrdUsingEstEfcInd",
    "autoPackInd",
    "displayPnInd",
    "replaceTfcInd",
    "webAcceptOption",
    "rollInd",
    "disburseInd",
    "3quarterLoadPct",
    "roundSchedInd",
    "rtvawstMixOfferDesc",
    "webAcceptFlag",
    "offerAwstCode",
    "overrideSaprInd",
    "equityInd",
    "priorBalAmt",
    "webAcceptAwstCode",
    "selVerIncInd",
    "reduceNeedInd",
    "cancelAwstCode",
    "mixAcceptAwstCode",
    "smartYear",
    "enableBbay",
    "rebatePercent",
    "availOfferPct",
    "pnUrl",
    "rtvawstAcceptDesc",
    "autoAcceptInd",
    "lessHalfLoadPct",
    "rtvawstDeclineDesc",
    "inelBefCutDateInd",
    "maxAwardAmt",
    "applMemoInd",
    "overrideInd",
    "interestRate",
    "lmsFund",
    "overrideTreqInd",
    "pnDesc",
    "acgYear",
    "availOfferAmt",
    "mixDeclineAwstCode",
    "rtvawstOfferDesc",
    "ncaaInd",
    "attendingHrInd",
    "mixOfferAwstCode",
    "loanProcessInd",
    "rtvawstMixDeclineDesc",
    "selfHelpRedPct",
    "acceptAwstCode",
    "halfLoadPct",
    "altLoanProgTypeCde",
    "teachLevel",
    "rtvawstWaAcceptDesc",
    "elInd",
    "useDisbEnrlMemoInd",
    "changeLoadInd",
    "autoSchedInd",
    "naReqdInd"
})
@Generated("jsonschema2pojo")
public class FundManagement100GetResponse {

    /**
     * Manual Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_MANUAL_LOAN_IND
     * 
     */
    @JsonProperty("manualLoanInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MANUAL_LOAN_IND")
    private String manualLoanInd;
    /**
     * Enrollment Rule
     * <p>
     * Lineage reference object : RFRASPC_ENRR_CODE, Lookup lineage reference object : RORENRR
     * 
     */
    @JsonProperty("enrrCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ENRR_CODE, Lookup lineage reference object : RORENRR")
    private String enrrCode;
    /**
     * Round Award
     * <p>
     * Lineage reference object : RFRASPC_ROUND_AWARD_AMT
     * 
     */
    @JsonProperty("roundAwardAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ROUND_AWARD_AMT")
    private Double roundAwardAmt;
    /**
     * Instructions
     * <p>
     * Lineage reference object : RFRASPC_PN_INSTRUCTIONS
     * 
     */
    @JsonProperty("pnInstructions")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PN_INSTRUCTIONS")
    private String pnInstructions;
    /**
     * Lineage reference object : RFRASPC_MIN_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("minAwardAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MIN_AWARD_AMT")
    private Double minAwardAmt;
    @JsonProperty("rtvawstCancelDesc")
    private String rtvawstCancelDesc;
    /**
     * Allow Processing by Period
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_PERIOD_AWARDING
     * 
     */
    @JsonProperty("enablePeriodAwarding")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ENABLE_PERIOD_AWARDING")
    private String enablePeriodAwarding;
    @JsonProperty("rtvawstMixAcceptDesc")
    private String rtvawstMixAcceptDesc;
    /**
     * Override Need
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_IND
     * 
     */
    @JsonProperty("overrideNeedInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OVERRIDE_NEED_IND")
    private String overrideNeedInd;
    /**
     * If Disbursement Load Code greater than Package Load Code
     * <p>
     * Lineage reference object : RFRASPC_PRORATION_IND
     * (Required)
     * 
     */
    @JsonProperty("prorationInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PRORATION_IND")
    private String prorationInd;
    /**
     * +/- Days for Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_DISB_NO_DAYS
     * 
     */
    @JsonProperty("disbNoDays")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_DISB_NO_DAYS")
    private Double disbNoDays;
    /**
     * Direct Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_DIRECT_LOAN_IND
     * 
     */
    @JsonProperty("directLoanInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_DIRECT_LOAN_IND")
    private String directLoanInd;
    /**
     * Award Letter
     * <p>
     * Lineage reference object : RFRASPC_AWD_CHG_LTR_IND
     * 
     */
    @JsonProperty("awdChgLtrInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AWD_CHG_LTR_IND")
    private String awdChgLtrInd;
    /**
     * Loan Fee Percentage
     * <p>
     * Lineage reference object : RFRASPC_LOAN_FEE_PCT
     * 
     */
    @JsonProperty("loanFeePct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_LOAN_FEE_PCT")
    private Double loanFeePct;
    /**
     * Create Promissory Note Requirements when Accepted
     * <p>
     * Lineage reference object : RFRASPC_PROM_REQ_IND
     * 
     */
    @JsonProperty("promReqInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PROM_REQ_IND")
    private String promReqInd;
    /**
     * Web Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webDeclineAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_WEB_DECLINE_AWST_CODE")
    private String webDeclineAwstCode;
    @JsonProperty("enrrCodeDescription")
    private String enrrCodeDescription;
    /**
     * Allow Partial Amount Acceptance
     * <p>
     * Lineage reference object : RFRASPC_ACPT_PARTIAL_AMT_IND
     * 
     */
    @JsonProperty("acptPartialAmtInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ACPT_PARTIAL_AMT_IND")
    private String acptPartialAmtInd;
    /**
     * Decline
     * <p>
     * Lineage reference object : RFRASPC_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("declineAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_DECLINE_AWST_CODE")
    private String declineAwstCode;
    /**
     * Transferred
     * <p>
     * Lineage reference object : RFRASPC_TRANSFER_AMT
     * (Required)
     * 
     */
    @JsonProperty("transferAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_TRANSFER_AMT")
    private Double transferAmt;
    /**
     * TEACH Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_TEACH_REDUCTION_PCT
     * 
     */
    @JsonProperty("teachReductionPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_TEACH_REDUCTION_PCT")
    private Double teachReductionPct;
    /**
     * If Ineligible After Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_AFT_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelAftCutDateInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_INEL_AFT_CUT_DATE_IND")
    private String inelAftCutDateInd;
    /**
     * Recoup when Award Reduced
     * <p>
     * Lineage reference object : RFRASPC_RECOUP_IND
     * 
     */
    @JsonProperty("recoupInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_RECOUP_IND")
    private String recoupInd;
    /**
     * Override Need to Cost of Attendance
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_TO_COA
     * 
     */
    @JsonProperty("overrideNeedToCoa")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OVERRIDE_NEED_TO_COA")
    private String overrideNeedToCoa;
    @JsonProperty("rtvawstWaDeclineDesc")
    private String rtvawstWaDeclineDesc;
    /**
     * Budget Allocated
     * <p>
     * Lineage reference object : RFRASPC_BUDG_ALLOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgAllocAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_BUDG_ALLOC_AMT")
    private Double budgAllocAmt;
    /**
     * Total Allocated
     * <p>
     * Lineage reference object : RFRASPC_TOTAL_ALLOC_AMT
     * 
     */
    @JsonProperty("totalAllocAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_TOTAL_ALLOC_AMT")
    private Double totalAllocAmt;
    /**
     * Award Using Estimated EFC
     * <p>
     * Lineage reference object : RFRASPC_AWRD_USING_EST_EFC_IND
     * 
     */
    @JsonProperty("awrdUsingEstEfcInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AWRD_USING_EST_EFC_IND")
    private String awrdUsingEstEfcInd;
    /**
     * Automatic Packaging
     * <p>
     * Lineage reference object : RFRASPC_AUTO_PACK_IND
     * 
     */
    @JsonProperty("autoPackInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AUTO_PACK_IND")
    private String autoPackInd;
    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RFRASPC_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_DISPLAY_PN_IND")
    private String displayPnInd;
    /**
     * Replace EFC
     * <p>
     * Lineage reference object : RFRASPC_REPLACE_TFC_IND
     * 
     */
    @JsonProperty("replaceTfcInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_REPLACE_TFC_IND")
    private String replaceTfcInd;
    /**
     * Allow Web Accept/Decline by
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_OPTION
     * (Required)
     * 
     */
    @JsonProperty("webAcceptOption")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_WEB_ACCEPT_OPTION")
    private String webAcceptOption;
    /**
     * Eligible to Roll
     * <p>
     * Lineage reference object : RFRASPC_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ROLL_IND")
    private String rollInd;
    /**
     * Disburse
     * <p>
     * Lineage reference object : RFRASPC_DISBURSE_IND
     * (Required)
     * 
     */
    @JsonProperty("disburseInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_DISBURSE_IND")
    private String disburseInd;
    /**
     * Payment Percent for Three Quarter Load
     * <p>
     * Lineage reference object : RFRASPC_3QUARTER_LOAD_PCT
     * 
     */
    @JsonProperty("3quarterLoadPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_3QUARTER_LOAD_PCT")
    private Double _3quarterLoadPct;
    /**
     * Round Schedule
     * <p>
     * Lineage reference object : RFRASPC_ROUND_SCHED_IND
     * (Required)
     * 
     */
    @JsonProperty("roundSchedInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ROUND_SCHED_IND")
    private String roundSchedInd;
    @JsonProperty("rtvawstMixOfferDesc")
    private String rtvawstMixOfferDesc;
    /**
     * Allow Accept/Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_FLAG
     * 
     */
    @JsonProperty("webAcceptFlag")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_WEB_ACCEPT_FLAG")
    private String webAcceptFlag;
    /**
     * Offer
     * <p>
     * Lineage reference object : RFRASPC_OFFER_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("offerAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OFFER_AWST_CODE")
    private String offerAwstCode;
    /**
     * Override Satisfactory Academic Progress
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_SAPR_IND
     * 
     */
    @JsonProperty("overrideSaprInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OVERRIDE_SAPR_IND")
    private String overrideSaprInd;
    /**
     * Equity Fund
     * <p>
     * Lineage reference object : RFRASPC_EQUITY_IND
     * 
     */
    @JsonProperty("equityInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_EQUITY_IND")
    private String equityInd;
    /**
     * Prior Balance
     * <p>
     * Lineage reference object : RFRASPC_PRIOR_BAL_AMT
     * (Required)
     * 
     */
    @JsonProperty("priorBalAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PRIOR_BAL_AMT")
    private Double priorBalAmt;
    /**
     * Web Accept
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webAcceptAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_WEB_ACCEPT_AWST_CODE")
    private String webAcceptAwstCode;
    /**
     * If Selected for Verification but is Not Complete
     * <p>
     * Lineage reference object : RFRASPC_SEL_VER_INC_IND
     * (Required)
     * 
     */
    @JsonProperty("selVerIncInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_SEL_VER_INC_IND")
    private String selVerIncInd;
    /**
     * Reduce Need
     * <p>
     * Lineage reference object : RFRASPC_REDUCE_NEED_IND
     * 
     */
    @JsonProperty("reduceNeedInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_REDUCE_NEED_IND")
    private String reduceNeedInd;
    /**
     * Cancel
     * <p>
     * Lineage reference object : RFRASPC_CANCEL_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("cancelAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_CANCEL_AWST_CODE")
    private String cancelAwstCode;
    /**
     * Mixed Accept
     * <p>
     * Lineage reference object : RFRASPC_MIX_ACCEPT_AWST_CODE
     * 
     */
    @JsonProperty("mixAcceptAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MIX_ACCEPT_AWST_CODE")
    private String mixAcceptAwstCode;
    /**
     * SMART Grade Level
     * <p>
     * Lineage reference object : RFRASPC_SMART_YEAR
     * 
     */
    @JsonProperty("smartYear")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_SMART_YEAR")
    private String smartYear;
    /**
     * Allow Processing by BBAY
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_BBAY
     * 
     */
    @JsonProperty("enableBbay")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ENABLE_BBAY")
    private String enableBbay;
    /**
     * Graduate Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_REBATE_PERCENT
     * 
     */
    @JsonProperty("rebatePercent")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_REBATE_PERCENT")
    private Double rebatePercent;
    /**
     * Over Commitment Percent
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_PCT
     * 
     */
    @JsonProperty("availOfferPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AVAIL_OFFER_PCT")
    private Double availOfferPct;
    /**
     * PN URL
     * <p>
     * Lineage reference object : RFRASPC_PN_URL
     * 
     */
    @JsonProperty("pnUrl")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PN_URL")
    private String pnUrl;
    @JsonProperty("rtvawstAcceptDesc")
    private String rtvawstAcceptDesc;
    /**
     * Automatic Acceptance
     * <p>
     * Lineage reference object : RFRASPC_AUTO_ACCEPT_IND
     * 
     */
    @JsonProperty("autoAcceptInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AUTO_ACCEPT_IND")
    private String autoAcceptInd;
    /**
     * Payment Percent for less than Half Load
     * <p>
     * Lineage reference object : RFRASPC_LESS_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("lessHalfLoadPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_LESS_HALF_LOAD_PCT")
    private Double lessHalfLoadPct;
    @JsonProperty("rtvawstDeclineDesc")
    private String rtvawstDeclineDesc;
    /**
     * If Ineligible Before Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_BEF_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelBefCutDateInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_INEL_BEF_CUT_DATE_IND")
    private String inelBefCutDateInd;
    /**
     * Award Maximum/Minimum
     * <p>
     * Lineage reference object : RFRASPC_MAX_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("maxAwardAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MAX_AWARD_AMT")
    private Double maxAwardAmt;
    /**
     * Memo Credit
     * <p>
     * Lineage reference object : RFRASPC_APPL_MEMO_IND
     * (Required)
     * 
     */
    @JsonProperty("applMemoInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_APPL_MEMO_IND")
    private String applMemoInd;
    /**
     * Override General Tracking Requirements
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OVERRIDE_IND")
    private String overrideInd;
    /**
     * Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_INTEREST_RATE
     * 
     */
    @JsonProperty("interestRate")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_INTEREST_RATE")
    private Double interestRate;
    /**
     * CRC Loan Fund
     * <p>
     * Lineage reference object : RFRASPC_LMS_FUND
     * 
     */
    @JsonProperty("lmsFund")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_LMS_FUND")
    private String lmsFund;
    /**
     * Override Requirement
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_TREQ_IND
     * 
     */
    @JsonProperty("overrideTreqInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_OVERRIDE_TREQ_IND")
    private String overrideTreqInd;
    /**
     * PN Description
     * <p>
     * Lineage reference object : RFRASPC_PN_DESC
     * 
     */
    @JsonProperty("pnDesc")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_PN_DESC")
    private String pnDesc;
    /**
     * ACG Grade Level
     * <p>
     * Lineage reference object : RFRASPC_ACG_YEAR
     * 
     */
    @JsonProperty("acgYear")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ACG_YEAR")
    private String acgYear;
    /**
     * Available to Offer
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_AMT
     * 
     */
    @JsonProperty("availOfferAmt")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AVAIL_OFFER_AMT")
    private Double availOfferAmt;
    /**
     * Mixed Decline
     * <p>
     * Lineage reference object : RFRASPC_MIX_DECLINE_AWST_CODE
     * 
     */
    @JsonProperty("mixDeclineAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MIX_DECLINE_AWST_CODE")
    private String mixDeclineAwstCode;
    @JsonProperty("rtvawstOfferDesc")
    private String rtvawstOfferDesc;
    /**
     * Count for NCAA
     * <p>
     * Lineage reference object : RFRASPC_NCAA_IND
     * 
     */
    @JsonProperty("ncaaInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_NCAA_IND")
    private String ncaaInd;
    /**
     * Use Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_ATTENDING_HR_IND
     * 
     */
    @JsonProperty("attendingHrInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ATTENDING_HR_IND")
    private String attendingHrInd;
    /**
     * Mixed Offer
     * <p>
     * Lineage reference object : RFRASPC_MIX_OFFER_AWST_CODE
     * 
     */
    @JsonProperty("mixOfferAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_MIX_OFFER_AWST_CODE")
    private String mixOfferAwstCode;
    /**
     * Loan Process
     * <p>
     * Lineage reference object : RFRASPC_LOAN_PROCESS_IND
     * 
     */
    @JsonProperty("loanProcessInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_LOAN_PROCESS_IND")
    private String loanProcessInd;
    @JsonProperty("rtvawstMixDeclineDesc")
    private String rtvawstMixDeclineDesc;
    /**
     * Self Help Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_SELF_HELP_RED_PCT
     * 
     */
    @JsonProperty("selfHelpRedPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_SELF_HELP_RED_PCT")
    private Double selfHelpRedPct;
    /**
     * Accept
     * <p>
     * Lineage reference object : RFRASPC_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("acceptAwstCode")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ACCEPT_AWST_CODE")
    private String acceptAwstCode;
    /**
     * Payment Percent for Half Load
     * <p>
     * Lineage reference object : RFRASPC_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("halfLoadPct")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_HALF_LOAD_PCT")
    private Double halfLoadPct;
    /**
     * Alternative Loan Program Type
     * <p>
     * Lineage reference object : RFRASPC_ALT_LOAN_PROG_TYPE_CDE
     * 
     */
    @JsonProperty("altLoanProgTypeCde")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_ALT_LOAN_PROG_TYPE_CDE")
    private String altLoanProgTypeCde;
    /**
     * TEACH Level
     * <p>
     * Lineage reference object : RFRASPC_TEACH_LEVEL
     * 
     */
    @JsonProperty("teachLevel")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_TEACH_LEVEL")
    private String teachLevel;
    @JsonProperty("rtvawstWaAcceptDesc")
    private String rtvawstWaAcceptDesc;
    /**
     * Electronic Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_EL_IND
     * 
     */
    @JsonProperty("elInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_EL_IND")
    private String elInd;
    /**
     * Use Disbursement Enrollment Edits for Memo
     * <p>
     * Lineage reference object : RFRASPC_USE_DISB_ENRL_MEMO_IND
     * 
     */
    @JsonProperty("useDisbEnrlMemoInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_USE_DISB_ENRL_MEMO_IND")
    private String useDisbEnrlMemoInd;
    /**
     * Change Load During Period
     * <p>
     * Lineage reference object : RFRASPC_CHANGE_LOAD_IND
     * (Required)
     * 
     */
    @JsonProperty("changeLoadInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_CHANGE_LOAD_IND")
    private String changeLoadInd;
    /**
     * Automatic Scheduling
     * <p>
     * Lineage reference object : RFRASPC_AUTO_SCHED_IND
     * 
     */
    @JsonProperty("autoSchedInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_AUTO_SCHED_IND")
    private String autoSchedInd;
    /**
     * Need Analysis
     * <p>
     * Lineage reference object : RFRASPC_NA_REQD_IND
     * 
     */
    @JsonProperty("naReqdInd")
    @JsonPropertyDescription("Lineage reference object : RFRASPC_NA_REQD_IND")
    private String naReqdInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Manual Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_MANUAL_LOAN_IND
     * 
     */
    @JsonProperty("manualLoanInd")
    public String getManualLoanInd() {
        return manualLoanInd;
    }

    /**
     * Manual Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_MANUAL_LOAN_IND
     * 
     */
    @JsonProperty("manualLoanInd")
    public void setManualLoanInd(String manualLoanInd) {
        this.manualLoanInd = manualLoanInd;
    }

    public FundManagement100GetResponse withManualLoanInd(String manualLoanInd) {
        this.manualLoanInd = manualLoanInd;
        return this;
    }

    /**
     * Enrollment Rule
     * <p>
     * Lineage reference object : RFRASPC_ENRR_CODE, Lookup lineage reference object : RORENRR
     * 
     */
    @JsonProperty("enrrCode")
    public String getEnrrCode() {
        return enrrCode;
    }

    /**
     * Enrollment Rule
     * <p>
     * Lineage reference object : RFRASPC_ENRR_CODE, Lookup lineage reference object : RORENRR
     * 
     */
    @JsonProperty("enrrCode")
    public void setEnrrCode(String enrrCode) {
        this.enrrCode = enrrCode;
    }

    public FundManagement100GetResponse withEnrrCode(String enrrCode) {
        this.enrrCode = enrrCode;
        return this;
    }

    /**
     * Round Award
     * <p>
     * Lineage reference object : RFRASPC_ROUND_AWARD_AMT
     * 
     */
    @JsonProperty("roundAwardAmt")
    public Double getRoundAwardAmt() {
        return roundAwardAmt;
    }

    /**
     * Round Award
     * <p>
     * Lineage reference object : RFRASPC_ROUND_AWARD_AMT
     * 
     */
    @JsonProperty("roundAwardAmt")
    public void setRoundAwardAmt(Double roundAwardAmt) {
        this.roundAwardAmt = roundAwardAmt;
    }

    public FundManagement100GetResponse withRoundAwardAmt(Double roundAwardAmt) {
        this.roundAwardAmt = roundAwardAmt;
        return this;
    }

    /**
     * Instructions
     * <p>
     * Lineage reference object : RFRASPC_PN_INSTRUCTIONS
     * 
     */
    @JsonProperty("pnInstructions")
    public String getPnInstructions() {
        return pnInstructions;
    }

    /**
     * Instructions
     * <p>
     * Lineage reference object : RFRASPC_PN_INSTRUCTIONS
     * 
     */
    @JsonProperty("pnInstructions")
    public void setPnInstructions(String pnInstructions) {
        this.pnInstructions = pnInstructions;
    }

    public FundManagement100GetResponse withPnInstructions(String pnInstructions) {
        this.pnInstructions = pnInstructions;
        return this;
    }

    /**
     * Lineage reference object : RFRASPC_MIN_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("minAwardAmt")
    public Double getMinAwardAmt() {
        return minAwardAmt;
    }

    /**
     * Lineage reference object : RFRASPC_MIN_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("minAwardAmt")
    public void setMinAwardAmt(Double minAwardAmt) {
        this.minAwardAmt = minAwardAmt;
    }

    public FundManagement100GetResponse withMinAwardAmt(Double minAwardAmt) {
        this.minAwardAmt = minAwardAmt;
        return this;
    }

    @JsonProperty("rtvawstCancelDesc")
    public String getRtvawstCancelDesc() {
        return rtvawstCancelDesc;
    }

    @JsonProperty("rtvawstCancelDesc")
    public void setRtvawstCancelDesc(String rtvawstCancelDesc) {
        this.rtvawstCancelDesc = rtvawstCancelDesc;
    }

    public FundManagement100GetResponse withRtvawstCancelDesc(String rtvawstCancelDesc) {
        this.rtvawstCancelDesc = rtvawstCancelDesc;
        return this;
    }

    /**
     * Allow Processing by Period
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_PERIOD_AWARDING
     * 
     */
    @JsonProperty("enablePeriodAwarding")
    public String getEnablePeriodAwarding() {
        return enablePeriodAwarding;
    }

    /**
     * Allow Processing by Period
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_PERIOD_AWARDING
     * 
     */
    @JsonProperty("enablePeriodAwarding")
    public void setEnablePeriodAwarding(String enablePeriodAwarding) {
        this.enablePeriodAwarding = enablePeriodAwarding;
    }

    public FundManagement100GetResponse withEnablePeriodAwarding(String enablePeriodAwarding) {
        this.enablePeriodAwarding = enablePeriodAwarding;
        return this;
    }

    @JsonProperty("rtvawstMixAcceptDesc")
    public String getRtvawstMixAcceptDesc() {
        return rtvawstMixAcceptDesc;
    }

    @JsonProperty("rtvawstMixAcceptDesc")
    public void setRtvawstMixAcceptDesc(String rtvawstMixAcceptDesc) {
        this.rtvawstMixAcceptDesc = rtvawstMixAcceptDesc;
    }

    public FundManagement100GetResponse withRtvawstMixAcceptDesc(String rtvawstMixAcceptDesc) {
        this.rtvawstMixAcceptDesc = rtvawstMixAcceptDesc;
        return this;
    }

    /**
     * Override Need
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_IND
     * 
     */
    @JsonProperty("overrideNeedInd")
    public String getOverrideNeedInd() {
        return overrideNeedInd;
    }

    /**
     * Override Need
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_IND
     * 
     */
    @JsonProperty("overrideNeedInd")
    public void setOverrideNeedInd(String overrideNeedInd) {
        this.overrideNeedInd = overrideNeedInd;
    }

    public FundManagement100GetResponse withOverrideNeedInd(String overrideNeedInd) {
        this.overrideNeedInd = overrideNeedInd;
        return this;
    }

    /**
     * If Disbursement Load Code greater than Package Load Code
     * <p>
     * Lineage reference object : RFRASPC_PRORATION_IND
     * (Required)
     * 
     */
    @JsonProperty("prorationInd")
    public String getProrationInd() {
        return prorationInd;
    }

    /**
     * If Disbursement Load Code greater than Package Load Code
     * <p>
     * Lineage reference object : RFRASPC_PRORATION_IND
     * (Required)
     * 
     */
    @JsonProperty("prorationInd")
    public void setProrationInd(String prorationInd) {
        this.prorationInd = prorationInd;
    }

    public FundManagement100GetResponse withProrationInd(String prorationInd) {
        this.prorationInd = prorationInd;
        return this;
    }

    /**
     * +/- Days for Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_DISB_NO_DAYS
     * 
     */
    @JsonProperty("disbNoDays")
    public Double getDisbNoDays() {
        return disbNoDays;
    }

    /**
     * +/- Days for Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_DISB_NO_DAYS
     * 
     */
    @JsonProperty("disbNoDays")
    public void setDisbNoDays(Double disbNoDays) {
        this.disbNoDays = disbNoDays;
    }

    public FundManagement100GetResponse withDisbNoDays(Double disbNoDays) {
        this.disbNoDays = disbNoDays;
        return this;
    }

    /**
     * Direct Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_DIRECT_LOAN_IND
     * 
     */
    @JsonProperty("directLoanInd")
    public String getDirectLoanInd() {
        return directLoanInd;
    }

    /**
     * Direct Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_DIRECT_LOAN_IND
     * 
     */
    @JsonProperty("directLoanInd")
    public void setDirectLoanInd(String directLoanInd) {
        this.directLoanInd = directLoanInd;
    }

    public FundManagement100GetResponse withDirectLoanInd(String directLoanInd) {
        this.directLoanInd = directLoanInd;
        return this;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : RFRASPC_AWD_CHG_LTR_IND
     * 
     */
    @JsonProperty("awdChgLtrInd")
    public String getAwdChgLtrInd() {
        return awdChgLtrInd;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : RFRASPC_AWD_CHG_LTR_IND
     * 
     */
    @JsonProperty("awdChgLtrInd")
    public void setAwdChgLtrInd(String awdChgLtrInd) {
        this.awdChgLtrInd = awdChgLtrInd;
    }

    public FundManagement100GetResponse withAwdChgLtrInd(String awdChgLtrInd) {
        this.awdChgLtrInd = awdChgLtrInd;
        return this;
    }

    /**
     * Loan Fee Percentage
     * <p>
     * Lineage reference object : RFRASPC_LOAN_FEE_PCT
     * 
     */
    @JsonProperty("loanFeePct")
    public Double getLoanFeePct() {
        return loanFeePct;
    }

    /**
     * Loan Fee Percentage
     * <p>
     * Lineage reference object : RFRASPC_LOAN_FEE_PCT
     * 
     */
    @JsonProperty("loanFeePct")
    public void setLoanFeePct(Double loanFeePct) {
        this.loanFeePct = loanFeePct;
    }

    public FundManagement100GetResponse withLoanFeePct(Double loanFeePct) {
        this.loanFeePct = loanFeePct;
        return this;
    }

    /**
     * Create Promissory Note Requirements when Accepted
     * <p>
     * Lineage reference object : RFRASPC_PROM_REQ_IND
     * 
     */
    @JsonProperty("promReqInd")
    public String getPromReqInd() {
        return promReqInd;
    }

    /**
     * Create Promissory Note Requirements when Accepted
     * <p>
     * Lineage reference object : RFRASPC_PROM_REQ_IND
     * 
     */
    @JsonProperty("promReqInd")
    public void setPromReqInd(String promReqInd) {
        this.promReqInd = promReqInd;
    }

    public FundManagement100GetResponse withPromReqInd(String promReqInd) {
        this.promReqInd = promReqInd;
        return this;
    }

    /**
     * Web Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webDeclineAwstCode")
    public String getWebDeclineAwstCode() {
        return webDeclineAwstCode;
    }

    /**
     * Web Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webDeclineAwstCode")
    public void setWebDeclineAwstCode(String webDeclineAwstCode) {
        this.webDeclineAwstCode = webDeclineAwstCode;
    }

    public FundManagement100GetResponse withWebDeclineAwstCode(String webDeclineAwstCode) {
        this.webDeclineAwstCode = webDeclineAwstCode;
        return this;
    }

    @JsonProperty("enrrCodeDescription")
    public String getEnrrCodeDescription() {
        return enrrCodeDescription;
    }

    @JsonProperty("enrrCodeDescription")
    public void setEnrrCodeDescription(String enrrCodeDescription) {
        this.enrrCodeDescription = enrrCodeDescription;
    }

    public FundManagement100GetResponse withEnrrCodeDescription(String enrrCodeDescription) {
        this.enrrCodeDescription = enrrCodeDescription;
        return this;
    }

    /**
     * Allow Partial Amount Acceptance
     * <p>
     * Lineage reference object : RFRASPC_ACPT_PARTIAL_AMT_IND
     * 
     */
    @JsonProperty("acptPartialAmtInd")
    public String getAcptPartialAmtInd() {
        return acptPartialAmtInd;
    }

    /**
     * Allow Partial Amount Acceptance
     * <p>
     * Lineage reference object : RFRASPC_ACPT_PARTIAL_AMT_IND
     * 
     */
    @JsonProperty("acptPartialAmtInd")
    public void setAcptPartialAmtInd(String acptPartialAmtInd) {
        this.acptPartialAmtInd = acptPartialAmtInd;
    }

    public FundManagement100GetResponse withAcptPartialAmtInd(String acptPartialAmtInd) {
        this.acptPartialAmtInd = acptPartialAmtInd;
        return this;
    }

    /**
     * Decline
     * <p>
     * Lineage reference object : RFRASPC_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("declineAwstCode")
    public String getDeclineAwstCode() {
        return declineAwstCode;
    }

    /**
     * Decline
     * <p>
     * Lineage reference object : RFRASPC_DECLINE_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("declineAwstCode")
    public void setDeclineAwstCode(String declineAwstCode) {
        this.declineAwstCode = declineAwstCode;
    }

    public FundManagement100GetResponse withDeclineAwstCode(String declineAwstCode) {
        this.declineAwstCode = declineAwstCode;
        return this;
    }

    /**
     * Transferred
     * <p>
     * Lineage reference object : RFRASPC_TRANSFER_AMT
     * (Required)
     * 
     */
    @JsonProperty("transferAmt")
    public Double getTransferAmt() {
        return transferAmt;
    }

    /**
     * Transferred
     * <p>
     * Lineage reference object : RFRASPC_TRANSFER_AMT
     * (Required)
     * 
     */
    @JsonProperty("transferAmt")
    public void setTransferAmt(Double transferAmt) {
        this.transferAmt = transferAmt;
    }

    public FundManagement100GetResponse withTransferAmt(Double transferAmt) {
        this.transferAmt = transferAmt;
        return this;
    }

    /**
     * TEACH Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_TEACH_REDUCTION_PCT
     * 
     */
    @JsonProperty("teachReductionPct")
    public Double getTeachReductionPct() {
        return teachReductionPct;
    }

    /**
     * TEACH Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_TEACH_REDUCTION_PCT
     * 
     */
    @JsonProperty("teachReductionPct")
    public void setTeachReductionPct(Double teachReductionPct) {
        this.teachReductionPct = teachReductionPct;
    }

    public FundManagement100GetResponse withTeachReductionPct(Double teachReductionPct) {
        this.teachReductionPct = teachReductionPct;
        return this;
    }

    /**
     * If Ineligible After Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_AFT_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelAftCutDateInd")
    public String getInelAftCutDateInd() {
        return inelAftCutDateInd;
    }

    /**
     * If Ineligible After Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_AFT_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelAftCutDateInd")
    public void setInelAftCutDateInd(String inelAftCutDateInd) {
        this.inelAftCutDateInd = inelAftCutDateInd;
    }

    public FundManagement100GetResponse withInelAftCutDateInd(String inelAftCutDateInd) {
        this.inelAftCutDateInd = inelAftCutDateInd;
        return this;
    }

    /**
     * Recoup when Award Reduced
     * <p>
     * Lineage reference object : RFRASPC_RECOUP_IND
     * 
     */
    @JsonProperty("recoupInd")
    public String getRecoupInd() {
        return recoupInd;
    }

    /**
     * Recoup when Award Reduced
     * <p>
     * Lineage reference object : RFRASPC_RECOUP_IND
     * 
     */
    @JsonProperty("recoupInd")
    public void setRecoupInd(String recoupInd) {
        this.recoupInd = recoupInd;
    }

    public FundManagement100GetResponse withRecoupInd(String recoupInd) {
        this.recoupInd = recoupInd;
        return this;
    }

    /**
     * Override Need to Cost of Attendance
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_TO_COA
     * 
     */
    @JsonProperty("overrideNeedToCoa")
    public String getOverrideNeedToCoa() {
        return overrideNeedToCoa;
    }

    /**
     * Override Need to Cost of Attendance
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_NEED_TO_COA
     * 
     */
    @JsonProperty("overrideNeedToCoa")
    public void setOverrideNeedToCoa(String overrideNeedToCoa) {
        this.overrideNeedToCoa = overrideNeedToCoa;
    }

    public FundManagement100GetResponse withOverrideNeedToCoa(String overrideNeedToCoa) {
        this.overrideNeedToCoa = overrideNeedToCoa;
        return this;
    }

    @JsonProperty("rtvawstWaDeclineDesc")
    public String getRtvawstWaDeclineDesc() {
        return rtvawstWaDeclineDesc;
    }

    @JsonProperty("rtvawstWaDeclineDesc")
    public void setRtvawstWaDeclineDesc(String rtvawstWaDeclineDesc) {
        this.rtvawstWaDeclineDesc = rtvawstWaDeclineDesc;
    }

    public FundManagement100GetResponse withRtvawstWaDeclineDesc(String rtvawstWaDeclineDesc) {
        this.rtvawstWaDeclineDesc = rtvawstWaDeclineDesc;
        return this;
    }

    /**
     * Budget Allocated
     * <p>
     * Lineage reference object : RFRASPC_BUDG_ALLOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgAllocAmt")
    public Double getBudgAllocAmt() {
        return budgAllocAmt;
    }

    /**
     * Budget Allocated
     * <p>
     * Lineage reference object : RFRASPC_BUDG_ALLOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgAllocAmt")
    public void setBudgAllocAmt(Double budgAllocAmt) {
        this.budgAllocAmt = budgAllocAmt;
    }

    public FundManagement100GetResponse withBudgAllocAmt(Double budgAllocAmt) {
        this.budgAllocAmt = budgAllocAmt;
        return this;
    }

    /**
     * Total Allocated
     * <p>
     * Lineage reference object : RFRASPC_TOTAL_ALLOC_AMT
     * 
     */
    @JsonProperty("totalAllocAmt")
    public Double getTotalAllocAmt() {
        return totalAllocAmt;
    }

    /**
     * Total Allocated
     * <p>
     * Lineage reference object : RFRASPC_TOTAL_ALLOC_AMT
     * 
     */
    @JsonProperty("totalAllocAmt")
    public void setTotalAllocAmt(Double totalAllocAmt) {
        this.totalAllocAmt = totalAllocAmt;
    }

    public FundManagement100GetResponse withTotalAllocAmt(Double totalAllocAmt) {
        this.totalAllocAmt = totalAllocAmt;
        return this;
    }

    /**
     * Award Using Estimated EFC
     * <p>
     * Lineage reference object : RFRASPC_AWRD_USING_EST_EFC_IND
     * 
     */
    @JsonProperty("awrdUsingEstEfcInd")
    public String getAwrdUsingEstEfcInd() {
        return awrdUsingEstEfcInd;
    }

    /**
     * Award Using Estimated EFC
     * <p>
     * Lineage reference object : RFRASPC_AWRD_USING_EST_EFC_IND
     * 
     */
    @JsonProperty("awrdUsingEstEfcInd")
    public void setAwrdUsingEstEfcInd(String awrdUsingEstEfcInd) {
        this.awrdUsingEstEfcInd = awrdUsingEstEfcInd;
    }

    public FundManagement100GetResponse withAwrdUsingEstEfcInd(String awrdUsingEstEfcInd) {
        this.awrdUsingEstEfcInd = awrdUsingEstEfcInd;
        return this;
    }

    /**
     * Automatic Packaging
     * <p>
     * Lineage reference object : RFRASPC_AUTO_PACK_IND
     * 
     */
    @JsonProperty("autoPackInd")
    public String getAutoPackInd() {
        return autoPackInd;
    }

    /**
     * Automatic Packaging
     * <p>
     * Lineage reference object : RFRASPC_AUTO_PACK_IND
     * 
     */
    @JsonProperty("autoPackInd")
    public void setAutoPackInd(String autoPackInd) {
        this.autoPackInd = autoPackInd;
    }

    public FundManagement100GetResponse withAutoPackInd(String autoPackInd) {
        this.autoPackInd = autoPackInd;
        return this;
    }

    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RFRASPC_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    public String getDisplayPnInd() {
        return displayPnInd;
    }

    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RFRASPC_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    public void setDisplayPnInd(String displayPnInd) {
        this.displayPnInd = displayPnInd;
    }

    public FundManagement100GetResponse withDisplayPnInd(String displayPnInd) {
        this.displayPnInd = displayPnInd;
        return this;
    }

    /**
     * Replace EFC
     * <p>
     * Lineage reference object : RFRASPC_REPLACE_TFC_IND
     * 
     */
    @JsonProperty("replaceTfcInd")
    public String getReplaceTfcInd() {
        return replaceTfcInd;
    }

    /**
     * Replace EFC
     * <p>
     * Lineage reference object : RFRASPC_REPLACE_TFC_IND
     * 
     */
    @JsonProperty("replaceTfcInd")
    public void setReplaceTfcInd(String replaceTfcInd) {
        this.replaceTfcInd = replaceTfcInd;
    }

    public FundManagement100GetResponse withReplaceTfcInd(String replaceTfcInd) {
        this.replaceTfcInd = replaceTfcInd;
        return this;
    }

    /**
     * Allow Web Accept/Decline by
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_OPTION
     * (Required)
     * 
     */
    @JsonProperty("webAcceptOption")
    public String getWebAcceptOption() {
        return webAcceptOption;
    }

    /**
     * Allow Web Accept/Decline by
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_OPTION
     * (Required)
     * 
     */
    @JsonProperty("webAcceptOption")
    public void setWebAcceptOption(String webAcceptOption) {
        this.webAcceptOption = webAcceptOption;
    }

    public FundManagement100GetResponse withWebAcceptOption(String webAcceptOption) {
        this.webAcceptOption = webAcceptOption;
        return this;
    }

    /**
     * Eligible to Roll
     * <p>
     * Lineage reference object : RFRASPC_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public String getRollInd() {
        return rollInd;
    }

    /**
     * Eligible to Roll
     * <p>
     * Lineage reference object : RFRASPC_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public void setRollInd(String rollInd) {
        this.rollInd = rollInd;
    }

    public FundManagement100GetResponse withRollInd(String rollInd) {
        this.rollInd = rollInd;
        return this;
    }

    /**
     * Disburse
     * <p>
     * Lineage reference object : RFRASPC_DISBURSE_IND
     * (Required)
     * 
     */
    @JsonProperty("disburseInd")
    public String getDisburseInd() {
        return disburseInd;
    }

    /**
     * Disburse
     * <p>
     * Lineage reference object : RFRASPC_DISBURSE_IND
     * (Required)
     * 
     */
    @JsonProperty("disburseInd")
    public void setDisburseInd(String disburseInd) {
        this.disburseInd = disburseInd;
    }

    public FundManagement100GetResponse withDisburseInd(String disburseInd) {
        this.disburseInd = disburseInd;
        return this;
    }

    /**
     * Payment Percent for Three Quarter Load
     * <p>
     * Lineage reference object : RFRASPC_3QUARTER_LOAD_PCT
     * 
     */
    @JsonProperty("3quarterLoadPct")
    public Double get3quarterLoadPct() {
        return _3quarterLoadPct;
    }

    /**
     * Payment Percent for Three Quarter Load
     * <p>
     * Lineage reference object : RFRASPC_3QUARTER_LOAD_PCT
     * 
     */
    @JsonProperty("3quarterLoadPct")
    public void set3quarterLoadPct(Double _3quarterLoadPct) {
        this._3quarterLoadPct = _3quarterLoadPct;
    }

    public FundManagement100GetResponse with3quarterLoadPct(Double _3quarterLoadPct) {
        this._3quarterLoadPct = _3quarterLoadPct;
        return this;
    }

    /**
     * Round Schedule
     * <p>
     * Lineage reference object : RFRASPC_ROUND_SCHED_IND
     * (Required)
     * 
     */
    @JsonProperty("roundSchedInd")
    public String getRoundSchedInd() {
        return roundSchedInd;
    }

    /**
     * Round Schedule
     * <p>
     * Lineage reference object : RFRASPC_ROUND_SCHED_IND
     * (Required)
     * 
     */
    @JsonProperty("roundSchedInd")
    public void setRoundSchedInd(String roundSchedInd) {
        this.roundSchedInd = roundSchedInd;
    }

    public FundManagement100GetResponse withRoundSchedInd(String roundSchedInd) {
        this.roundSchedInd = roundSchedInd;
        return this;
    }

    @JsonProperty("rtvawstMixOfferDesc")
    public String getRtvawstMixOfferDesc() {
        return rtvawstMixOfferDesc;
    }

    @JsonProperty("rtvawstMixOfferDesc")
    public void setRtvawstMixOfferDesc(String rtvawstMixOfferDesc) {
        this.rtvawstMixOfferDesc = rtvawstMixOfferDesc;
    }

    public FundManagement100GetResponse withRtvawstMixOfferDesc(String rtvawstMixOfferDesc) {
        this.rtvawstMixOfferDesc = rtvawstMixOfferDesc;
        return this;
    }

    /**
     * Allow Accept/Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_FLAG
     * 
     */
    @JsonProperty("webAcceptFlag")
    public String getWebAcceptFlag() {
        return webAcceptFlag;
    }

    /**
     * Allow Accept/Decline
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_FLAG
     * 
     */
    @JsonProperty("webAcceptFlag")
    public void setWebAcceptFlag(String webAcceptFlag) {
        this.webAcceptFlag = webAcceptFlag;
    }

    public FundManagement100GetResponse withWebAcceptFlag(String webAcceptFlag) {
        this.webAcceptFlag = webAcceptFlag;
        return this;
    }

    /**
     * Offer
     * <p>
     * Lineage reference object : RFRASPC_OFFER_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("offerAwstCode")
    public String getOfferAwstCode() {
        return offerAwstCode;
    }

    /**
     * Offer
     * <p>
     * Lineage reference object : RFRASPC_OFFER_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("offerAwstCode")
    public void setOfferAwstCode(String offerAwstCode) {
        this.offerAwstCode = offerAwstCode;
    }

    public FundManagement100GetResponse withOfferAwstCode(String offerAwstCode) {
        this.offerAwstCode = offerAwstCode;
        return this;
    }

    /**
     * Override Satisfactory Academic Progress
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_SAPR_IND
     * 
     */
    @JsonProperty("overrideSaprInd")
    public String getOverrideSaprInd() {
        return overrideSaprInd;
    }

    /**
     * Override Satisfactory Academic Progress
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_SAPR_IND
     * 
     */
    @JsonProperty("overrideSaprInd")
    public void setOverrideSaprInd(String overrideSaprInd) {
        this.overrideSaprInd = overrideSaprInd;
    }

    public FundManagement100GetResponse withOverrideSaprInd(String overrideSaprInd) {
        this.overrideSaprInd = overrideSaprInd;
        return this;
    }

    /**
     * Equity Fund
     * <p>
     * Lineage reference object : RFRASPC_EQUITY_IND
     * 
     */
    @JsonProperty("equityInd")
    public String getEquityInd() {
        return equityInd;
    }

    /**
     * Equity Fund
     * <p>
     * Lineage reference object : RFRASPC_EQUITY_IND
     * 
     */
    @JsonProperty("equityInd")
    public void setEquityInd(String equityInd) {
        this.equityInd = equityInd;
    }

    public FundManagement100GetResponse withEquityInd(String equityInd) {
        this.equityInd = equityInd;
        return this;
    }

    /**
     * Prior Balance
     * <p>
     * Lineage reference object : RFRASPC_PRIOR_BAL_AMT
     * (Required)
     * 
     */
    @JsonProperty("priorBalAmt")
    public Double getPriorBalAmt() {
        return priorBalAmt;
    }

    /**
     * Prior Balance
     * <p>
     * Lineage reference object : RFRASPC_PRIOR_BAL_AMT
     * (Required)
     * 
     */
    @JsonProperty("priorBalAmt")
    public void setPriorBalAmt(Double priorBalAmt) {
        this.priorBalAmt = priorBalAmt;
    }

    public FundManagement100GetResponse withPriorBalAmt(Double priorBalAmt) {
        this.priorBalAmt = priorBalAmt;
        return this;
    }

    /**
     * Web Accept
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webAcceptAwstCode")
    public String getWebAcceptAwstCode() {
        return webAcceptAwstCode;
    }

    /**
     * Web Accept
     * <p>
     * Lineage reference object : RFRASPC_WEB_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("webAcceptAwstCode")
    public void setWebAcceptAwstCode(String webAcceptAwstCode) {
        this.webAcceptAwstCode = webAcceptAwstCode;
    }

    public FundManagement100GetResponse withWebAcceptAwstCode(String webAcceptAwstCode) {
        this.webAcceptAwstCode = webAcceptAwstCode;
        return this;
    }

    /**
     * If Selected for Verification but is Not Complete
     * <p>
     * Lineage reference object : RFRASPC_SEL_VER_INC_IND
     * (Required)
     * 
     */
    @JsonProperty("selVerIncInd")
    public String getSelVerIncInd() {
        return selVerIncInd;
    }

    /**
     * If Selected for Verification but is Not Complete
     * <p>
     * Lineage reference object : RFRASPC_SEL_VER_INC_IND
     * (Required)
     * 
     */
    @JsonProperty("selVerIncInd")
    public void setSelVerIncInd(String selVerIncInd) {
        this.selVerIncInd = selVerIncInd;
    }

    public FundManagement100GetResponse withSelVerIncInd(String selVerIncInd) {
        this.selVerIncInd = selVerIncInd;
        return this;
    }

    /**
     * Reduce Need
     * <p>
     * Lineage reference object : RFRASPC_REDUCE_NEED_IND
     * 
     */
    @JsonProperty("reduceNeedInd")
    public String getReduceNeedInd() {
        return reduceNeedInd;
    }

    /**
     * Reduce Need
     * <p>
     * Lineage reference object : RFRASPC_REDUCE_NEED_IND
     * 
     */
    @JsonProperty("reduceNeedInd")
    public void setReduceNeedInd(String reduceNeedInd) {
        this.reduceNeedInd = reduceNeedInd;
    }

    public FundManagement100GetResponse withReduceNeedInd(String reduceNeedInd) {
        this.reduceNeedInd = reduceNeedInd;
        return this;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : RFRASPC_CANCEL_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("cancelAwstCode")
    public String getCancelAwstCode() {
        return cancelAwstCode;
    }

    /**
     * Cancel
     * <p>
     * Lineage reference object : RFRASPC_CANCEL_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("cancelAwstCode")
    public void setCancelAwstCode(String cancelAwstCode) {
        this.cancelAwstCode = cancelAwstCode;
    }

    public FundManagement100GetResponse withCancelAwstCode(String cancelAwstCode) {
        this.cancelAwstCode = cancelAwstCode;
        return this;
    }

    /**
     * Mixed Accept
     * <p>
     * Lineage reference object : RFRASPC_MIX_ACCEPT_AWST_CODE
     * 
     */
    @JsonProperty("mixAcceptAwstCode")
    public String getMixAcceptAwstCode() {
        return mixAcceptAwstCode;
    }

    /**
     * Mixed Accept
     * <p>
     * Lineage reference object : RFRASPC_MIX_ACCEPT_AWST_CODE
     * 
     */
    @JsonProperty("mixAcceptAwstCode")
    public void setMixAcceptAwstCode(String mixAcceptAwstCode) {
        this.mixAcceptAwstCode = mixAcceptAwstCode;
    }

    public FundManagement100GetResponse withMixAcceptAwstCode(String mixAcceptAwstCode) {
        this.mixAcceptAwstCode = mixAcceptAwstCode;
        return this;
    }

    /**
     * SMART Grade Level
     * <p>
     * Lineage reference object : RFRASPC_SMART_YEAR
     * 
     */
    @JsonProperty("smartYear")
    public String getSmartYear() {
        return smartYear;
    }

    /**
     * SMART Grade Level
     * <p>
     * Lineage reference object : RFRASPC_SMART_YEAR
     * 
     */
    @JsonProperty("smartYear")
    public void setSmartYear(String smartYear) {
        this.smartYear = smartYear;
    }

    public FundManagement100GetResponse withSmartYear(String smartYear) {
        this.smartYear = smartYear;
        return this;
    }

    /**
     * Allow Processing by BBAY
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_BBAY
     * 
     */
    @JsonProperty("enableBbay")
    public String getEnableBbay() {
        return enableBbay;
    }

    /**
     * Allow Processing by BBAY
     * <p>
     * Lineage reference object : RFRASPC_ENABLE_BBAY
     * 
     */
    @JsonProperty("enableBbay")
    public void setEnableBbay(String enableBbay) {
        this.enableBbay = enableBbay;
    }

    public FundManagement100GetResponse withEnableBbay(String enableBbay) {
        this.enableBbay = enableBbay;
        return this;
    }

    /**
     * Graduate Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_REBATE_PERCENT
     * 
     */
    @JsonProperty("rebatePercent")
    public Double getRebatePercent() {
        return rebatePercent;
    }

    /**
     * Graduate Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_REBATE_PERCENT
     * 
     */
    @JsonProperty("rebatePercent")
    public void setRebatePercent(Double rebatePercent) {
        this.rebatePercent = rebatePercent;
    }

    public FundManagement100GetResponse withRebatePercent(Double rebatePercent) {
        this.rebatePercent = rebatePercent;
        return this;
    }

    /**
     * Over Commitment Percent
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_PCT
     * 
     */
    @JsonProperty("availOfferPct")
    public Double getAvailOfferPct() {
        return availOfferPct;
    }

    /**
     * Over Commitment Percent
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_PCT
     * 
     */
    @JsonProperty("availOfferPct")
    public void setAvailOfferPct(Double availOfferPct) {
        this.availOfferPct = availOfferPct;
    }

    public FundManagement100GetResponse withAvailOfferPct(Double availOfferPct) {
        this.availOfferPct = availOfferPct;
        return this;
    }

    /**
     * PN URL
     * <p>
     * Lineage reference object : RFRASPC_PN_URL
     * 
     */
    @JsonProperty("pnUrl")
    public String getPnUrl() {
        return pnUrl;
    }

    /**
     * PN URL
     * <p>
     * Lineage reference object : RFRASPC_PN_URL
     * 
     */
    @JsonProperty("pnUrl")
    public void setPnUrl(String pnUrl) {
        this.pnUrl = pnUrl;
    }

    public FundManagement100GetResponse withPnUrl(String pnUrl) {
        this.pnUrl = pnUrl;
        return this;
    }

    @JsonProperty("rtvawstAcceptDesc")
    public String getRtvawstAcceptDesc() {
        return rtvawstAcceptDesc;
    }

    @JsonProperty("rtvawstAcceptDesc")
    public void setRtvawstAcceptDesc(String rtvawstAcceptDesc) {
        this.rtvawstAcceptDesc = rtvawstAcceptDesc;
    }

    public FundManagement100GetResponse withRtvawstAcceptDesc(String rtvawstAcceptDesc) {
        this.rtvawstAcceptDesc = rtvawstAcceptDesc;
        return this;
    }

    /**
     * Automatic Acceptance
     * <p>
     * Lineage reference object : RFRASPC_AUTO_ACCEPT_IND
     * 
     */
    @JsonProperty("autoAcceptInd")
    public String getAutoAcceptInd() {
        return autoAcceptInd;
    }

    /**
     * Automatic Acceptance
     * <p>
     * Lineage reference object : RFRASPC_AUTO_ACCEPT_IND
     * 
     */
    @JsonProperty("autoAcceptInd")
    public void setAutoAcceptInd(String autoAcceptInd) {
        this.autoAcceptInd = autoAcceptInd;
    }

    public FundManagement100GetResponse withAutoAcceptInd(String autoAcceptInd) {
        this.autoAcceptInd = autoAcceptInd;
        return this;
    }

    /**
     * Payment Percent for less than Half Load
     * <p>
     * Lineage reference object : RFRASPC_LESS_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("lessHalfLoadPct")
    public Double getLessHalfLoadPct() {
        return lessHalfLoadPct;
    }

    /**
     * Payment Percent for less than Half Load
     * <p>
     * Lineage reference object : RFRASPC_LESS_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("lessHalfLoadPct")
    public void setLessHalfLoadPct(Double lessHalfLoadPct) {
        this.lessHalfLoadPct = lessHalfLoadPct;
    }

    public FundManagement100GetResponse withLessHalfLoadPct(Double lessHalfLoadPct) {
        this.lessHalfLoadPct = lessHalfLoadPct;
        return this;
    }

    @JsonProperty("rtvawstDeclineDesc")
    public String getRtvawstDeclineDesc() {
        return rtvawstDeclineDesc;
    }

    @JsonProperty("rtvawstDeclineDesc")
    public void setRtvawstDeclineDesc(String rtvawstDeclineDesc) {
        this.rtvawstDeclineDesc = rtvawstDeclineDesc;
    }

    public FundManagement100GetResponse withRtvawstDeclineDesc(String rtvawstDeclineDesc) {
        this.rtvawstDeclineDesc = rtvawstDeclineDesc;
        return this;
    }

    /**
     * If Ineligible Before Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_BEF_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelBefCutDateInd")
    public String getInelBefCutDateInd() {
        return inelBefCutDateInd;
    }

    /**
     * If Ineligible Before Cut off Date
     * <p>
     * Lineage reference object : RFRASPC_INEL_BEF_CUT_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("inelBefCutDateInd")
    public void setInelBefCutDateInd(String inelBefCutDateInd) {
        this.inelBefCutDateInd = inelBefCutDateInd;
    }

    public FundManagement100GetResponse withInelBefCutDateInd(String inelBefCutDateInd) {
        this.inelBefCutDateInd = inelBefCutDateInd;
        return this;
    }

    /**
     * Award Maximum/Minimum
     * <p>
     * Lineage reference object : RFRASPC_MAX_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("maxAwardAmt")
    public Double getMaxAwardAmt() {
        return maxAwardAmt;
    }

    /**
     * Award Maximum/Minimum
     * <p>
     * Lineage reference object : RFRASPC_MAX_AWARD_AMT
     * (Required)
     * 
     */
    @JsonProperty("maxAwardAmt")
    public void setMaxAwardAmt(Double maxAwardAmt) {
        this.maxAwardAmt = maxAwardAmt;
    }

    public FundManagement100GetResponse withMaxAwardAmt(Double maxAwardAmt) {
        this.maxAwardAmt = maxAwardAmt;
        return this;
    }

    /**
     * Memo Credit
     * <p>
     * Lineage reference object : RFRASPC_APPL_MEMO_IND
     * (Required)
     * 
     */
    @JsonProperty("applMemoInd")
    public String getApplMemoInd() {
        return applMemoInd;
    }

    /**
     * Memo Credit
     * <p>
     * Lineage reference object : RFRASPC_APPL_MEMO_IND
     * (Required)
     * 
     */
    @JsonProperty("applMemoInd")
    public void setApplMemoInd(String applMemoInd) {
        this.applMemoInd = applMemoInd;
    }

    public FundManagement100GetResponse withApplMemoInd(String applMemoInd) {
        this.applMemoInd = applMemoInd;
        return this;
    }

    /**
     * Override General Tracking Requirements
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Override General Tracking Requirements
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public FundManagement100GetResponse withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
        return this;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_INTEREST_RATE
     * 
     */
    @JsonProperty("interestRate")
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : RFRASPC_INTEREST_RATE
     * 
     */
    @JsonProperty("interestRate")
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public FundManagement100GetResponse withInterestRate(Double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    /**
     * CRC Loan Fund
     * <p>
     * Lineage reference object : RFRASPC_LMS_FUND
     * 
     */
    @JsonProperty("lmsFund")
    public String getLmsFund() {
        return lmsFund;
    }

    /**
     * CRC Loan Fund
     * <p>
     * Lineage reference object : RFRASPC_LMS_FUND
     * 
     */
    @JsonProperty("lmsFund")
    public void setLmsFund(String lmsFund) {
        this.lmsFund = lmsFund;
    }

    public FundManagement100GetResponse withLmsFund(String lmsFund) {
        this.lmsFund = lmsFund;
        return this;
    }

    /**
     * Override Requirement
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_TREQ_IND
     * 
     */
    @JsonProperty("overrideTreqInd")
    public String getOverrideTreqInd() {
        return overrideTreqInd;
    }

    /**
     * Override Requirement
     * <p>
     * Lineage reference object : RFRASPC_OVERRIDE_TREQ_IND
     * 
     */
    @JsonProperty("overrideTreqInd")
    public void setOverrideTreqInd(String overrideTreqInd) {
        this.overrideTreqInd = overrideTreqInd;
    }

    public FundManagement100GetResponse withOverrideTreqInd(String overrideTreqInd) {
        this.overrideTreqInd = overrideTreqInd;
        return this;
    }

    /**
     * PN Description
     * <p>
     * Lineage reference object : RFRASPC_PN_DESC
     * 
     */
    @JsonProperty("pnDesc")
    public String getPnDesc() {
        return pnDesc;
    }

    /**
     * PN Description
     * <p>
     * Lineage reference object : RFRASPC_PN_DESC
     * 
     */
    @JsonProperty("pnDesc")
    public void setPnDesc(String pnDesc) {
        this.pnDesc = pnDesc;
    }

    public FundManagement100GetResponse withPnDesc(String pnDesc) {
        this.pnDesc = pnDesc;
        return this;
    }

    /**
     * ACG Grade Level
     * <p>
     * Lineage reference object : RFRASPC_ACG_YEAR
     * 
     */
    @JsonProperty("acgYear")
    public String getAcgYear() {
        return acgYear;
    }

    /**
     * ACG Grade Level
     * <p>
     * Lineage reference object : RFRASPC_ACG_YEAR
     * 
     */
    @JsonProperty("acgYear")
    public void setAcgYear(String acgYear) {
        this.acgYear = acgYear;
    }

    public FundManagement100GetResponse withAcgYear(String acgYear) {
        this.acgYear = acgYear;
        return this;
    }

    /**
     * Available to Offer
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_AMT
     * 
     */
    @JsonProperty("availOfferAmt")
    public Double getAvailOfferAmt() {
        return availOfferAmt;
    }

    /**
     * Available to Offer
     * <p>
     * Lineage reference object : RFRASPC_AVAIL_OFFER_AMT
     * 
     */
    @JsonProperty("availOfferAmt")
    public void setAvailOfferAmt(Double availOfferAmt) {
        this.availOfferAmt = availOfferAmt;
    }

    public FundManagement100GetResponse withAvailOfferAmt(Double availOfferAmt) {
        this.availOfferAmt = availOfferAmt;
        return this;
    }

    /**
     * Mixed Decline
     * <p>
     * Lineage reference object : RFRASPC_MIX_DECLINE_AWST_CODE
     * 
     */
    @JsonProperty("mixDeclineAwstCode")
    public String getMixDeclineAwstCode() {
        return mixDeclineAwstCode;
    }

    /**
     * Mixed Decline
     * <p>
     * Lineage reference object : RFRASPC_MIX_DECLINE_AWST_CODE
     * 
     */
    @JsonProperty("mixDeclineAwstCode")
    public void setMixDeclineAwstCode(String mixDeclineAwstCode) {
        this.mixDeclineAwstCode = mixDeclineAwstCode;
    }

    public FundManagement100GetResponse withMixDeclineAwstCode(String mixDeclineAwstCode) {
        this.mixDeclineAwstCode = mixDeclineAwstCode;
        return this;
    }

    @JsonProperty("rtvawstOfferDesc")
    public String getRtvawstOfferDesc() {
        return rtvawstOfferDesc;
    }

    @JsonProperty("rtvawstOfferDesc")
    public void setRtvawstOfferDesc(String rtvawstOfferDesc) {
        this.rtvawstOfferDesc = rtvawstOfferDesc;
    }

    public FundManagement100GetResponse withRtvawstOfferDesc(String rtvawstOfferDesc) {
        this.rtvawstOfferDesc = rtvawstOfferDesc;
        return this;
    }

    /**
     * Count for NCAA
     * <p>
     * Lineage reference object : RFRASPC_NCAA_IND
     * 
     */
    @JsonProperty("ncaaInd")
    public String getNcaaInd() {
        return ncaaInd;
    }

    /**
     * Count for NCAA
     * <p>
     * Lineage reference object : RFRASPC_NCAA_IND
     * 
     */
    @JsonProperty("ncaaInd")
    public void setNcaaInd(String ncaaInd) {
        this.ncaaInd = ncaaInd;
    }

    public FundManagement100GetResponse withNcaaInd(String ncaaInd) {
        this.ncaaInd = ncaaInd;
        return this;
    }

    /**
     * Use Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_ATTENDING_HR_IND
     * 
     */
    @JsonProperty("attendingHrInd")
    public String getAttendingHrInd() {
        return attendingHrInd;
    }

    /**
     * Use Attending Hours
     * <p>
     * Lineage reference object : RFRASPC_ATTENDING_HR_IND
     * 
     */
    @JsonProperty("attendingHrInd")
    public void setAttendingHrInd(String attendingHrInd) {
        this.attendingHrInd = attendingHrInd;
    }

    public FundManagement100GetResponse withAttendingHrInd(String attendingHrInd) {
        this.attendingHrInd = attendingHrInd;
        return this;
    }

    /**
     * Mixed Offer
     * <p>
     * Lineage reference object : RFRASPC_MIX_OFFER_AWST_CODE
     * 
     */
    @JsonProperty("mixOfferAwstCode")
    public String getMixOfferAwstCode() {
        return mixOfferAwstCode;
    }

    /**
     * Mixed Offer
     * <p>
     * Lineage reference object : RFRASPC_MIX_OFFER_AWST_CODE
     * 
     */
    @JsonProperty("mixOfferAwstCode")
    public void setMixOfferAwstCode(String mixOfferAwstCode) {
        this.mixOfferAwstCode = mixOfferAwstCode;
    }

    public FundManagement100GetResponse withMixOfferAwstCode(String mixOfferAwstCode) {
        this.mixOfferAwstCode = mixOfferAwstCode;
        return this;
    }

    /**
     * Loan Process
     * <p>
     * Lineage reference object : RFRASPC_LOAN_PROCESS_IND
     * 
     */
    @JsonProperty("loanProcessInd")
    public String getLoanProcessInd() {
        return loanProcessInd;
    }

    /**
     * Loan Process
     * <p>
     * Lineage reference object : RFRASPC_LOAN_PROCESS_IND
     * 
     */
    @JsonProperty("loanProcessInd")
    public void setLoanProcessInd(String loanProcessInd) {
        this.loanProcessInd = loanProcessInd;
    }

    public FundManagement100GetResponse withLoanProcessInd(String loanProcessInd) {
        this.loanProcessInd = loanProcessInd;
        return this;
    }

    @JsonProperty("rtvawstMixDeclineDesc")
    public String getRtvawstMixDeclineDesc() {
        return rtvawstMixDeclineDesc;
    }

    @JsonProperty("rtvawstMixDeclineDesc")
    public void setRtvawstMixDeclineDesc(String rtvawstMixDeclineDesc) {
        this.rtvawstMixDeclineDesc = rtvawstMixDeclineDesc;
    }

    public FundManagement100GetResponse withRtvawstMixDeclineDesc(String rtvawstMixDeclineDesc) {
        this.rtvawstMixDeclineDesc = rtvawstMixDeclineDesc;
        return this;
    }

    /**
     * Self Help Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_SELF_HELP_RED_PCT
     * 
     */
    @JsonProperty("selfHelpRedPct")
    public Double getSelfHelpRedPct() {
        return selfHelpRedPct;
    }

    /**
     * Self Help Reduction Percentage
     * <p>
     * Lineage reference object : RFRASPC_SELF_HELP_RED_PCT
     * 
     */
    @JsonProperty("selfHelpRedPct")
    public void setSelfHelpRedPct(Double selfHelpRedPct) {
        this.selfHelpRedPct = selfHelpRedPct;
    }

    public FundManagement100GetResponse withSelfHelpRedPct(Double selfHelpRedPct) {
        this.selfHelpRedPct = selfHelpRedPct;
        return this;
    }

    /**
     * Accept
     * <p>
     * Lineage reference object : RFRASPC_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("acceptAwstCode")
    public String getAcceptAwstCode() {
        return acceptAwstCode;
    }

    /**
     * Accept
     * <p>
     * Lineage reference object : RFRASPC_ACCEPT_AWST_CODE
     * (Required)
     * 
     */
    @JsonProperty("acceptAwstCode")
    public void setAcceptAwstCode(String acceptAwstCode) {
        this.acceptAwstCode = acceptAwstCode;
    }

    public FundManagement100GetResponse withAcceptAwstCode(String acceptAwstCode) {
        this.acceptAwstCode = acceptAwstCode;
        return this;
    }

    /**
     * Payment Percent for Half Load
     * <p>
     * Lineage reference object : RFRASPC_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("halfLoadPct")
    public Double getHalfLoadPct() {
        return halfLoadPct;
    }

    /**
     * Payment Percent for Half Load
     * <p>
     * Lineage reference object : RFRASPC_HALF_LOAD_PCT
     * 
     */
    @JsonProperty("halfLoadPct")
    public void setHalfLoadPct(Double halfLoadPct) {
        this.halfLoadPct = halfLoadPct;
    }

    public FundManagement100GetResponse withHalfLoadPct(Double halfLoadPct) {
        this.halfLoadPct = halfLoadPct;
        return this;
    }

    /**
     * Alternative Loan Program Type
     * <p>
     * Lineage reference object : RFRASPC_ALT_LOAN_PROG_TYPE_CDE
     * 
     */
    @JsonProperty("altLoanProgTypeCde")
    public String getAltLoanProgTypeCde() {
        return altLoanProgTypeCde;
    }

    /**
     * Alternative Loan Program Type
     * <p>
     * Lineage reference object : RFRASPC_ALT_LOAN_PROG_TYPE_CDE
     * 
     */
    @JsonProperty("altLoanProgTypeCde")
    public void setAltLoanProgTypeCde(String altLoanProgTypeCde) {
        this.altLoanProgTypeCde = altLoanProgTypeCde;
    }

    public FundManagement100GetResponse withAltLoanProgTypeCde(String altLoanProgTypeCde) {
        this.altLoanProgTypeCde = altLoanProgTypeCde;
        return this;
    }

    /**
     * TEACH Level
     * <p>
     * Lineage reference object : RFRASPC_TEACH_LEVEL
     * 
     */
    @JsonProperty("teachLevel")
    public String getTeachLevel() {
        return teachLevel;
    }

    /**
     * TEACH Level
     * <p>
     * Lineage reference object : RFRASPC_TEACH_LEVEL
     * 
     */
    @JsonProperty("teachLevel")
    public void setTeachLevel(String teachLevel) {
        this.teachLevel = teachLevel;
    }

    public FundManagement100GetResponse withTeachLevel(String teachLevel) {
        this.teachLevel = teachLevel;
        return this;
    }

    @JsonProperty("rtvawstWaAcceptDesc")
    public String getRtvawstWaAcceptDesc() {
        return rtvawstWaAcceptDesc;
    }

    @JsonProperty("rtvawstWaAcceptDesc")
    public void setRtvawstWaAcceptDesc(String rtvawstWaAcceptDesc) {
        this.rtvawstWaAcceptDesc = rtvawstWaAcceptDesc;
    }

    public FundManagement100GetResponse withRtvawstWaAcceptDesc(String rtvawstWaAcceptDesc) {
        this.rtvawstWaAcceptDesc = rtvawstWaAcceptDesc;
        return this;
    }

    /**
     * Electronic Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_EL_IND
     * 
     */
    @JsonProperty("elInd")
    public String getElInd() {
        return elInd;
    }

    /**
     * Electronic Loan Indicator
     * <p>
     * Lineage reference object : RFRASPC_EL_IND
     * 
     */
    @JsonProperty("elInd")
    public void setElInd(String elInd) {
        this.elInd = elInd;
    }

    public FundManagement100GetResponse withElInd(String elInd) {
        this.elInd = elInd;
        return this;
    }

    /**
     * Use Disbursement Enrollment Edits for Memo
     * <p>
     * Lineage reference object : RFRASPC_USE_DISB_ENRL_MEMO_IND
     * 
     */
    @JsonProperty("useDisbEnrlMemoInd")
    public String getUseDisbEnrlMemoInd() {
        return useDisbEnrlMemoInd;
    }

    /**
     * Use Disbursement Enrollment Edits for Memo
     * <p>
     * Lineage reference object : RFRASPC_USE_DISB_ENRL_MEMO_IND
     * 
     */
    @JsonProperty("useDisbEnrlMemoInd")
    public void setUseDisbEnrlMemoInd(String useDisbEnrlMemoInd) {
        this.useDisbEnrlMemoInd = useDisbEnrlMemoInd;
    }

    public FundManagement100GetResponse withUseDisbEnrlMemoInd(String useDisbEnrlMemoInd) {
        this.useDisbEnrlMemoInd = useDisbEnrlMemoInd;
        return this;
    }

    /**
     * Change Load During Period
     * <p>
     * Lineage reference object : RFRASPC_CHANGE_LOAD_IND
     * (Required)
     * 
     */
    @JsonProperty("changeLoadInd")
    public String getChangeLoadInd() {
        return changeLoadInd;
    }

    /**
     * Change Load During Period
     * <p>
     * Lineage reference object : RFRASPC_CHANGE_LOAD_IND
     * (Required)
     * 
     */
    @JsonProperty("changeLoadInd")
    public void setChangeLoadInd(String changeLoadInd) {
        this.changeLoadInd = changeLoadInd;
    }

    public FundManagement100GetResponse withChangeLoadInd(String changeLoadInd) {
        this.changeLoadInd = changeLoadInd;
        return this;
    }

    /**
     * Automatic Scheduling
     * <p>
     * Lineage reference object : RFRASPC_AUTO_SCHED_IND
     * 
     */
    @JsonProperty("autoSchedInd")
    public String getAutoSchedInd() {
        return autoSchedInd;
    }

    /**
     * Automatic Scheduling
     * <p>
     * Lineage reference object : RFRASPC_AUTO_SCHED_IND
     * 
     */
    @JsonProperty("autoSchedInd")
    public void setAutoSchedInd(String autoSchedInd) {
        this.autoSchedInd = autoSchedInd;
    }

    public FundManagement100GetResponse withAutoSchedInd(String autoSchedInd) {
        this.autoSchedInd = autoSchedInd;
        return this;
    }

    /**
     * Need Analysis
     * <p>
     * Lineage reference object : RFRASPC_NA_REQD_IND
     * 
     */
    @JsonProperty("naReqdInd")
    public String getNaReqdInd() {
        return naReqdInd;
    }

    /**
     * Need Analysis
     * <p>
     * Lineage reference object : RFRASPC_NA_REQD_IND
     * 
     */
    @JsonProperty("naReqdInd")
    public void setNaReqdInd(String naReqdInd) {
        this.naReqdInd = naReqdInd;
    }

    public FundManagement100GetResponse withNaReqdInd(String naReqdInd) {
        this.naReqdInd = naReqdInd;
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

    public FundManagement100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundManagement100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("manualLoanInd");
        sb.append('=');
        sb.append(((this.manualLoanInd == null)?"<null>":this.manualLoanInd));
        sb.append(',');
        sb.append("enrrCode");
        sb.append('=');
        sb.append(((this.enrrCode == null)?"<null>":this.enrrCode));
        sb.append(',');
        sb.append("roundAwardAmt");
        sb.append('=');
        sb.append(((this.roundAwardAmt == null)?"<null>":this.roundAwardAmt));
        sb.append(',');
        sb.append("pnInstructions");
        sb.append('=');
        sb.append(((this.pnInstructions == null)?"<null>":this.pnInstructions));
        sb.append(',');
        sb.append("minAwardAmt");
        sb.append('=');
        sb.append(((this.minAwardAmt == null)?"<null>":this.minAwardAmt));
        sb.append(',');
        sb.append("rtvawstCancelDesc");
        sb.append('=');
        sb.append(((this.rtvawstCancelDesc == null)?"<null>":this.rtvawstCancelDesc));
        sb.append(',');
        sb.append("enablePeriodAwarding");
        sb.append('=');
        sb.append(((this.enablePeriodAwarding == null)?"<null>":this.enablePeriodAwarding));
        sb.append(',');
        sb.append("rtvawstMixAcceptDesc");
        sb.append('=');
        sb.append(((this.rtvawstMixAcceptDesc == null)?"<null>":this.rtvawstMixAcceptDesc));
        sb.append(',');
        sb.append("overrideNeedInd");
        sb.append('=');
        sb.append(((this.overrideNeedInd == null)?"<null>":this.overrideNeedInd));
        sb.append(',');
        sb.append("prorationInd");
        sb.append('=');
        sb.append(((this.prorationInd == null)?"<null>":this.prorationInd));
        sb.append(',');
        sb.append("disbNoDays");
        sb.append('=');
        sb.append(((this.disbNoDays == null)?"<null>":this.disbNoDays));
        sb.append(',');
        sb.append("directLoanInd");
        sb.append('=');
        sb.append(((this.directLoanInd == null)?"<null>":this.directLoanInd));
        sb.append(',');
        sb.append("awdChgLtrInd");
        sb.append('=');
        sb.append(((this.awdChgLtrInd == null)?"<null>":this.awdChgLtrInd));
        sb.append(',');
        sb.append("loanFeePct");
        sb.append('=');
        sb.append(((this.loanFeePct == null)?"<null>":this.loanFeePct));
        sb.append(',');
        sb.append("promReqInd");
        sb.append('=');
        sb.append(((this.promReqInd == null)?"<null>":this.promReqInd));
        sb.append(',');
        sb.append("webDeclineAwstCode");
        sb.append('=');
        sb.append(((this.webDeclineAwstCode == null)?"<null>":this.webDeclineAwstCode));
        sb.append(',');
        sb.append("enrrCodeDescription");
        sb.append('=');
        sb.append(((this.enrrCodeDescription == null)?"<null>":this.enrrCodeDescription));
        sb.append(',');
        sb.append("acptPartialAmtInd");
        sb.append('=');
        sb.append(((this.acptPartialAmtInd == null)?"<null>":this.acptPartialAmtInd));
        sb.append(',');
        sb.append("declineAwstCode");
        sb.append('=');
        sb.append(((this.declineAwstCode == null)?"<null>":this.declineAwstCode));
        sb.append(',');
        sb.append("transferAmt");
        sb.append('=');
        sb.append(((this.transferAmt == null)?"<null>":this.transferAmt));
        sb.append(',');
        sb.append("teachReductionPct");
        sb.append('=');
        sb.append(((this.teachReductionPct == null)?"<null>":this.teachReductionPct));
        sb.append(',');
        sb.append("inelAftCutDateInd");
        sb.append('=');
        sb.append(((this.inelAftCutDateInd == null)?"<null>":this.inelAftCutDateInd));
        sb.append(',');
        sb.append("recoupInd");
        sb.append('=');
        sb.append(((this.recoupInd == null)?"<null>":this.recoupInd));
        sb.append(',');
        sb.append("overrideNeedToCoa");
        sb.append('=');
        sb.append(((this.overrideNeedToCoa == null)?"<null>":this.overrideNeedToCoa));
        sb.append(',');
        sb.append("rtvawstWaDeclineDesc");
        sb.append('=');
        sb.append(((this.rtvawstWaDeclineDesc == null)?"<null>":this.rtvawstWaDeclineDesc));
        sb.append(',');
        sb.append("budgAllocAmt");
        sb.append('=');
        sb.append(((this.budgAllocAmt == null)?"<null>":this.budgAllocAmt));
        sb.append(',');
        sb.append("totalAllocAmt");
        sb.append('=');
        sb.append(((this.totalAllocAmt == null)?"<null>":this.totalAllocAmt));
        sb.append(',');
        sb.append("awrdUsingEstEfcInd");
        sb.append('=');
        sb.append(((this.awrdUsingEstEfcInd == null)?"<null>":this.awrdUsingEstEfcInd));
        sb.append(',');
        sb.append("autoPackInd");
        sb.append('=');
        sb.append(((this.autoPackInd == null)?"<null>":this.autoPackInd));
        sb.append(',');
        sb.append("displayPnInd");
        sb.append('=');
        sb.append(((this.displayPnInd == null)?"<null>":this.displayPnInd));
        sb.append(',');
        sb.append("replaceTfcInd");
        sb.append('=');
        sb.append(((this.replaceTfcInd == null)?"<null>":this.replaceTfcInd));
        sb.append(',');
        sb.append("webAcceptOption");
        sb.append('=');
        sb.append(((this.webAcceptOption == null)?"<null>":this.webAcceptOption));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("disburseInd");
        sb.append('=');
        sb.append(((this.disburseInd == null)?"<null>":this.disburseInd));
        sb.append(',');
        sb.append("_3quarterLoadPct");
        sb.append('=');
        sb.append(((this._3quarterLoadPct == null)?"<null>":this._3quarterLoadPct));
        sb.append(',');
        sb.append("roundSchedInd");
        sb.append('=');
        sb.append(((this.roundSchedInd == null)?"<null>":this.roundSchedInd));
        sb.append(',');
        sb.append("rtvawstMixOfferDesc");
        sb.append('=');
        sb.append(((this.rtvawstMixOfferDesc == null)?"<null>":this.rtvawstMixOfferDesc));
        sb.append(',');
        sb.append("webAcceptFlag");
        sb.append('=');
        sb.append(((this.webAcceptFlag == null)?"<null>":this.webAcceptFlag));
        sb.append(',');
        sb.append("offerAwstCode");
        sb.append('=');
        sb.append(((this.offerAwstCode == null)?"<null>":this.offerAwstCode));
        sb.append(',');
        sb.append("overrideSaprInd");
        sb.append('=');
        sb.append(((this.overrideSaprInd == null)?"<null>":this.overrideSaprInd));
        sb.append(',');
        sb.append("equityInd");
        sb.append('=');
        sb.append(((this.equityInd == null)?"<null>":this.equityInd));
        sb.append(',');
        sb.append("priorBalAmt");
        sb.append('=');
        sb.append(((this.priorBalAmt == null)?"<null>":this.priorBalAmt));
        sb.append(',');
        sb.append("webAcceptAwstCode");
        sb.append('=');
        sb.append(((this.webAcceptAwstCode == null)?"<null>":this.webAcceptAwstCode));
        sb.append(',');
        sb.append("selVerIncInd");
        sb.append('=');
        sb.append(((this.selVerIncInd == null)?"<null>":this.selVerIncInd));
        sb.append(',');
        sb.append("reduceNeedInd");
        sb.append('=');
        sb.append(((this.reduceNeedInd == null)?"<null>":this.reduceNeedInd));
        sb.append(',');
        sb.append("cancelAwstCode");
        sb.append('=');
        sb.append(((this.cancelAwstCode == null)?"<null>":this.cancelAwstCode));
        sb.append(',');
        sb.append("mixAcceptAwstCode");
        sb.append('=');
        sb.append(((this.mixAcceptAwstCode == null)?"<null>":this.mixAcceptAwstCode));
        sb.append(',');
        sb.append("smartYear");
        sb.append('=');
        sb.append(((this.smartYear == null)?"<null>":this.smartYear));
        sb.append(',');
        sb.append("enableBbay");
        sb.append('=');
        sb.append(((this.enableBbay == null)?"<null>":this.enableBbay));
        sb.append(',');
        sb.append("rebatePercent");
        sb.append('=');
        sb.append(((this.rebatePercent == null)?"<null>":this.rebatePercent));
        sb.append(',');
        sb.append("availOfferPct");
        sb.append('=');
        sb.append(((this.availOfferPct == null)?"<null>":this.availOfferPct));
        sb.append(',');
        sb.append("pnUrl");
        sb.append('=');
        sb.append(((this.pnUrl == null)?"<null>":this.pnUrl));
        sb.append(',');
        sb.append("rtvawstAcceptDesc");
        sb.append('=');
        sb.append(((this.rtvawstAcceptDesc == null)?"<null>":this.rtvawstAcceptDesc));
        sb.append(',');
        sb.append("autoAcceptInd");
        sb.append('=');
        sb.append(((this.autoAcceptInd == null)?"<null>":this.autoAcceptInd));
        sb.append(',');
        sb.append("lessHalfLoadPct");
        sb.append('=');
        sb.append(((this.lessHalfLoadPct == null)?"<null>":this.lessHalfLoadPct));
        sb.append(',');
        sb.append("rtvawstDeclineDesc");
        sb.append('=');
        sb.append(((this.rtvawstDeclineDesc == null)?"<null>":this.rtvawstDeclineDesc));
        sb.append(',');
        sb.append("inelBefCutDateInd");
        sb.append('=');
        sb.append(((this.inelBefCutDateInd == null)?"<null>":this.inelBefCutDateInd));
        sb.append(',');
        sb.append("maxAwardAmt");
        sb.append('=');
        sb.append(((this.maxAwardAmt == null)?"<null>":this.maxAwardAmt));
        sb.append(',');
        sb.append("applMemoInd");
        sb.append('=');
        sb.append(((this.applMemoInd == null)?"<null>":this.applMemoInd));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
        sb.append(',');
        sb.append("interestRate");
        sb.append('=');
        sb.append(((this.interestRate == null)?"<null>":this.interestRate));
        sb.append(',');
        sb.append("lmsFund");
        sb.append('=');
        sb.append(((this.lmsFund == null)?"<null>":this.lmsFund));
        sb.append(',');
        sb.append("overrideTreqInd");
        sb.append('=');
        sb.append(((this.overrideTreqInd == null)?"<null>":this.overrideTreqInd));
        sb.append(',');
        sb.append("pnDesc");
        sb.append('=');
        sb.append(((this.pnDesc == null)?"<null>":this.pnDesc));
        sb.append(',');
        sb.append("acgYear");
        sb.append('=');
        sb.append(((this.acgYear == null)?"<null>":this.acgYear));
        sb.append(',');
        sb.append("availOfferAmt");
        sb.append('=');
        sb.append(((this.availOfferAmt == null)?"<null>":this.availOfferAmt));
        sb.append(',');
        sb.append("mixDeclineAwstCode");
        sb.append('=');
        sb.append(((this.mixDeclineAwstCode == null)?"<null>":this.mixDeclineAwstCode));
        sb.append(',');
        sb.append("rtvawstOfferDesc");
        sb.append('=');
        sb.append(((this.rtvawstOfferDesc == null)?"<null>":this.rtvawstOfferDesc));
        sb.append(',');
        sb.append("ncaaInd");
        sb.append('=');
        sb.append(((this.ncaaInd == null)?"<null>":this.ncaaInd));
        sb.append(',');
        sb.append("attendingHrInd");
        sb.append('=');
        sb.append(((this.attendingHrInd == null)?"<null>":this.attendingHrInd));
        sb.append(',');
        sb.append("mixOfferAwstCode");
        sb.append('=');
        sb.append(((this.mixOfferAwstCode == null)?"<null>":this.mixOfferAwstCode));
        sb.append(',');
        sb.append("loanProcessInd");
        sb.append('=');
        sb.append(((this.loanProcessInd == null)?"<null>":this.loanProcessInd));
        sb.append(',');
        sb.append("rtvawstMixDeclineDesc");
        sb.append('=');
        sb.append(((this.rtvawstMixDeclineDesc == null)?"<null>":this.rtvawstMixDeclineDesc));
        sb.append(',');
        sb.append("selfHelpRedPct");
        sb.append('=');
        sb.append(((this.selfHelpRedPct == null)?"<null>":this.selfHelpRedPct));
        sb.append(',');
        sb.append("acceptAwstCode");
        sb.append('=');
        sb.append(((this.acceptAwstCode == null)?"<null>":this.acceptAwstCode));
        sb.append(',');
        sb.append("halfLoadPct");
        sb.append('=');
        sb.append(((this.halfLoadPct == null)?"<null>":this.halfLoadPct));
        sb.append(',');
        sb.append("altLoanProgTypeCde");
        sb.append('=');
        sb.append(((this.altLoanProgTypeCde == null)?"<null>":this.altLoanProgTypeCde));
        sb.append(',');
        sb.append("teachLevel");
        sb.append('=');
        sb.append(((this.teachLevel == null)?"<null>":this.teachLevel));
        sb.append(',');
        sb.append("rtvawstWaAcceptDesc");
        sb.append('=');
        sb.append(((this.rtvawstWaAcceptDesc == null)?"<null>":this.rtvawstWaAcceptDesc));
        sb.append(',');
        sb.append("elInd");
        sb.append('=');
        sb.append(((this.elInd == null)?"<null>":this.elInd));
        sb.append(',');
        sb.append("useDisbEnrlMemoInd");
        sb.append('=');
        sb.append(((this.useDisbEnrlMemoInd == null)?"<null>":this.useDisbEnrlMemoInd));
        sb.append(',');
        sb.append("changeLoadInd");
        sb.append('=');
        sb.append(((this.changeLoadInd == null)?"<null>":this.changeLoadInd));
        sb.append(',');
        sb.append("autoSchedInd");
        sb.append('=');
        sb.append(((this.autoSchedInd == null)?"<null>":this.autoSchedInd));
        sb.append(',');
        sb.append("naReqdInd");
        sb.append('=');
        sb.append(((this.naReqdInd == null)?"<null>":this.naReqdInd));
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
        result = ((result* 31)+((this.manualLoanInd == null)? 0 :this.manualLoanInd.hashCode()));
        result = ((result* 31)+((this.enrrCode == null)? 0 :this.enrrCode.hashCode()));
        result = ((result* 31)+((this.roundAwardAmt == null)? 0 :this.roundAwardAmt.hashCode()));
        result = ((result* 31)+((this.pnInstructions == null)? 0 :this.pnInstructions.hashCode()));
        result = ((result* 31)+((this.minAwardAmt == null)? 0 :this.minAwardAmt.hashCode()));
        result = ((result* 31)+((this.rtvawstCancelDesc == null)? 0 :this.rtvawstCancelDesc.hashCode()));
        result = ((result* 31)+((this.enablePeriodAwarding == null)? 0 :this.enablePeriodAwarding.hashCode()));
        result = ((result* 31)+((this.rtvawstMixAcceptDesc == null)? 0 :this.rtvawstMixAcceptDesc.hashCode()));
        result = ((result* 31)+((this.overrideNeedInd == null)? 0 :this.overrideNeedInd.hashCode()));
        result = ((result* 31)+((this.prorationInd == null)? 0 :this.prorationInd.hashCode()));
        result = ((result* 31)+((this.disbNoDays == null)? 0 :this.disbNoDays.hashCode()));
        result = ((result* 31)+((this.directLoanInd == null)? 0 :this.directLoanInd.hashCode()));
        result = ((result* 31)+((this.awdChgLtrInd == null)? 0 :this.awdChgLtrInd.hashCode()));
        result = ((result* 31)+((this.loanFeePct == null)? 0 :this.loanFeePct.hashCode()));
        result = ((result* 31)+((this.promReqInd == null)? 0 :this.promReqInd.hashCode()));
        result = ((result* 31)+((this.webDeclineAwstCode == null)? 0 :this.webDeclineAwstCode.hashCode()));
        result = ((result* 31)+((this.enrrCodeDescription == null)? 0 :this.enrrCodeDescription.hashCode()));
        result = ((result* 31)+((this.acptPartialAmtInd == null)? 0 :this.acptPartialAmtInd.hashCode()));
        result = ((result* 31)+((this.declineAwstCode == null)? 0 :this.declineAwstCode.hashCode()));
        result = ((result* 31)+((this.transferAmt == null)? 0 :this.transferAmt.hashCode()));
        result = ((result* 31)+((this._3quarterLoadPct == null)? 0 :this._3quarterLoadPct.hashCode()));
        result = ((result* 31)+((this.teachReductionPct == null)? 0 :this.teachReductionPct.hashCode()));
        result = ((result* 31)+((this.inelAftCutDateInd == null)? 0 :this.inelAftCutDateInd.hashCode()));
        result = ((result* 31)+((this.recoupInd == null)? 0 :this.recoupInd.hashCode()));
        result = ((result* 31)+((this.overrideNeedToCoa == null)? 0 :this.overrideNeedToCoa.hashCode()));
        result = ((result* 31)+((this.rtvawstWaDeclineDesc == null)? 0 :this.rtvawstWaDeclineDesc.hashCode()));
        result = ((result* 31)+((this.budgAllocAmt == null)? 0 :this.budgAllocAmt.hashCode()));
        result = ((result* 31)+((this.totalAllocAmt == null)? 0 :this.totalAllocAmt.hashCode()));
        result = ((result* 31)+((this.awrdUsingEstEfcInd == null)? 0 :this.awrdUsingEstEfcInd.hashCode()));
        result = ((result* 31)+((this.autoPackInd == null)? 0 :this.autoPackInd.hashCode()));
        result = ((result* 31)+((this.displayPnInd == null)? 0 :this.displayPnInd.hashCode()));
        result = ((result* 31)+((this.replaceTfcInd == null)? 0 :this.replaceTfcInd.hashCode()));
        result = ((result* 31)+((this.webAcceptOption == null)? 0 :this.webAcceptOption.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.disburseInd == null)? 0 :this.disburseInd.hashCode()));
        result = ((result* 31)+((this.roundSchedInd == null)? 0 :this.roundSchedInd.hashCode()));
        result = ((result* 31)+((this.rtvawstMixOfferDesc == null)? 0 :this.rtvawstMixOfferDesc.hashCode()));
        result = ((result* 31)+((this.webAcceptFlag == null)? 0 :this.webAcceptFlag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offerAwstCode == null)? 0 :this.offerAwstCode.hashCode()));
        result = ((result* 31)+((this.overrideSaprInd == null)? 0 :this.overrideSaprInd.hashCode()));
        result = ((result* 31)+((this.equityInd == null)? 0 :this.equityInd.hashCode()));
        result = ((result* 31)+((this.priorBalAmt == null)? 0 :this.priorBalAmt.hashCode()));
        result = ((result* 31)+((this.webAcceptAwstCode == null)? 0 :this.webAcceptAwstCode.hashCode()));
        result = ((result* 31)+((this.selVerIncInd == null)? 0 :this.selVerIncInd.hashCode()));
        result = ((result* 31)+((this.reduceNeedInd == null)? 0 :this.reduceNeedInd.hashCode()));
        result = ((result* 31)+((this.cancelAwstCode == null)? 0 :this.cancelAwstCode.hashCode()));
        result = ((result* 31)+((this.mixAcceptAwstCode == null)? 0 :this.mixAcceptAwstCode.hashCode()));
        result = ((result* 31)+((this.smartYear == null)? 0 :this.smartYear.hashCode()));
        result = ((result* 31)+((this.enableBbay == null)? 0 :this.enableBbay.hashCode()));
        result = ((result* 31)+((this.rebatePercent == null)? 0 :this.rebatePercent.hashCode()));
        result = ((result* 31)+((this.availOfferPct == null)? 0 :this.availOfferPct.hashCode()));
        result = ((result* 31)+((this.pnUrl == null)? 0 :this.pnUrl.hashCode()));
        result = ((result* 31)+((this.rtvawstAcceptDesc == null)? 0 :this.rtvawstAcceptDesc.hashCode()));
        result = ((result* 31)+((this.autoAcceptInd == null)? 0 :this.autoAcceptInd.hashCode()));
        result = ((result* 31)+((this.lessHalfLoadPct == null)? 0 :this.lessHalfLoadPct.hashCode()));
        result = ((result* 31)+((this.rtvawstDeclineDesc == null)? 0 :this.rtvawstDeclineDesc.hashCode()));
        result = ((result* 31)+((this.inelBefCutDateInd == null)? 0 :this.inelBefCutDateInd.hashCode()));
        result = ((result* 31)+((this.maxAwardAmt == null)? 0 :this.maxAwardAmt.hashCode()));
        result = ((result* 31)+((this.applMemoInd == null)? 0 :this.applMemoInd.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        result = ((result* 31)+((this.interestRate == null)? 0 :this.interestRate.hashCode()));
        result = ((result* 31)+((this.lmsFund == null)? 0 :this.lmsFund.hashCode()));
        result = ((result* 31)+((this.overrideTreqInd == null)? 0 :this.overrideTreqInd.hashCode()));
        result = ((result* 31)+((this.pnDesc == null)? 0 :this.pnDesc.hashCode()));
        result = ((result* 31)+((this.acgYear == null)? 0 :this.acgYear.hashCode()));
        result = ((result* 31)+((this.availOfferAmt == null)? 0 :this.availOfferAmt.hashCode()));
        result = ((result* 31)+((this.mixDeclineAwstCode == null)? 0 :this.mixDeclineAwstCode.hashCode()));
        result = ((result* 31)+((this.rtvawstOfferDesc == null)? 0 :this.rtvawstOfferDesc.hashCode()));
        result = ((result* 31)+((this.ncaaInd == null)? 0 :this.ncaaInd.hashCode()));
        result = ((result* 31)+((this.attendingHrInd == null)? 0 :this.attendingHrInd.hashCode()));
        result = ((result* 31)+((this.mixOfferAwstCode == null)? 0 :this.mixOfferAwstCode.hashCode()));
        result = ((result* 31)+((this.loanProcessInd == null)? 0 :this.loanProcessInd.hashCode()));
        result = ((result* 31)+((this.rtvawstMixDeclineDesc == null)? 0 :this.rtvawstMixDeclineDesc.hashCode()));
        result = ((result* 31)+((this.selfHelpRedPct == null)? 0 :this.selfHelpRedPct.hashCode()));
        result = ((result* 31)+((this.acceptAwstCode == null)? 0 :this.acceptAwstCode.hashCode()));
        result = ((result* 31)+((this.halfLoadPct == null)? 0 :this.halfLoadPct.hashCode()));
        result = ((result* 31)+((this.altLoanProgTypeCde == null)? 0 :this.altLoanProgTypeCde.hashCode()));
        result = ((result* 31)+((this.teachLevel == null)? 0 :this.teachLevel.hashCode()));
        result = ((result* 31)+((this.rtvawstWaAcceptDesc == null)? 0 :this.rtvawstWaAcceptDesc.hashCode()));
        result = ((result* 31)+((this.elInd == null)? 0 :this.elInd.hashCode()));
        result = ((result* 31)+((this.useDisbEnrlMemoInd == null)? 0 :this.useDisbEnrlMemoInd.hashCode()));
        result = ((result* 31)+((this.changeLoadInd == null)? 0 :this.changeLoadInd.hashCode()));
        result = ((result* 31)+((this.autoSchedInd == null)? 0 :this.autoSchedInd.hashCode()));
        result = ((result* 31)+((this.naReqdInd == null)? 0 :this.naReqdInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundManagement100GetResponse) == false) {
            return false;
        }
        FundManagement100GetResponse rhs = ((FundManagement100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.manualLoanInd == rhs.manualLoanInd)||((this.manualLoanInd!= null)&&this.manualLoanInd.equals(rhs.manualLoanInd)))&&((this.enrrCode == rhs.enrrCode)||((this.enrrCode!= null)&&this.enrrCode.equals(rhs.enrrCode))))&&((this.roundAwardAmt == rhs.roundAwardAmt)||((this.roundAwardAmt!= null)&&this.roundAwardAmt.equals(rhs.roundAwardAmt))))&&((this.pnInstructions == rhs.pnInstructions)||((this.pnInstructions!= null)&&this.pnInstructions.equals(rhs.pnInstructions))))&&((this.minAwardAmt == rhs.minAwardAmt)||((this.minAwardAmt!= null)&&this.minAwardAmt.equals(rhs.minAwardAmt))))&&((this.rtvawstCancelDesc == rhs.rtvawstCancelDesc)||((this.rtvawstCancelDesc!= null)&&this.rtvawstCancelDesc.equals(rhs.rtvawstCancelDesc))))&&((this.enablePeriodAwarding == rhs.enablePeriodAwarding)||((this.enablePeriodAwarding!= null)&&this.enablePeriodAwarding.equals(rhs.enablePeriodAwarding))))&&((this.rtvawstMixAcceptDesc == rhs.rtvawstMixAcceptDesc)||((this.rtvawstMixAcceptDesc!= null)&&this.rtvawstMixAcceptDesc.equals(rhs.rtvawstMixAcceptDesc))))&&((this.overrideNeedInd == rhs.overrideNeedInd)||((this.overrideNeedInd!= null)&&this.overrideNeedInd.equals(rhs.overrideNeedInd))))&&((this.prorationInd == rhs.prorationInd)||((this.prorationInd!= null)&&this.prorationInd.equals(rhs.prorationInd))))&&((this.disbNoDays == rhs.disbNoDays)||((this.disbNoDays!= null)&&this.disbNoDays.equals(rhs.disbNoDays))))&&((this.directLoanInd == rhs.directLoanInd)||((this.directLoanInd!= null)&&this.directLoanInd.equals(rhs.directLoanInd))))&&((this.awdChgLtrInd == rhs.awdChgLtrInd)||((this.awdChgLtrInd!= null)&&this.awdChgLtrInd.equals(rhs.awdChgLtrInd))))&&((this.loanFeePct == rhs.loanFeePct)||((this.loanFeePct!= null)&&this.loanFeePct.equals(rhs.loanFeePct))))&&((this.promReqInd == rhs.promReqInd)||((this.promReqInd!= null)&&this.promReqInd.equals(rhs.promReqInd))))&&((this.webDeclineAwstCode == rhs.webDeclineAwstCode)||((this.webDeclineAwstCode!= null)&&this.webDeclineAwstCode.equals(rhs.webDeclineAwstCode))))&&((this.enrrCodeDescription == rhs.enrrCodeDescription)||((this.enrrCodeDescription!= null)&&this.enrrCodeDescription.equals(rhs.enrrCodeDescription))))&&((this.acptPartialAmtInd == rhs.acptPartialAmtInd)||((this.acptPartialAmtInd!= null)&&this.acptPartialAmtInd.equals(rhs.acptPartialAmtInd))))&&((this.declineAwstCode == rhs.declineAwstCode)||((this.declineAwstCode!= null)&&this.declineAwstCode.equals(rhs.declineAwstCode))))&&((this.transferAmt == rhs.transferAmt)||((this.transferAmt!= null)&&this.transferAmt.equals(rhs.transferAmt))))&&((this._3quarterLoadPct == rhs._3quarterLoadPct)||((this._3quarterLoadPct!= null)&&this._3quarterLoadPct.equals(rhs._3quarterLoadPct))))&&((this.teachReductionPct == rhs.teachReductionPct)||((this.teachReductionPct!= null)&&this.teachReductionPct.equals(rhs.teachReductionPct))))&&((this.inelAftCutDateInd == rhs.inelAftCutDateInd)||((this.inelAftCutDateInd!= null)&&this.inelAftCutDateInd.equals(rhs.inelAftCutDateInd))))&&((this.recoupInd == rhs.recoupInd)||((this.recoupInd!= null)&&this.recoupInd.equals(rhs.recoupInd))))&&((this.overrideNeedToCoa == rhs.overrideNeedToCoa)||((this.overrideNeedToCoa!= null)&&this.overrideNeedToCoa.equals(rhs.overrideNeedToCoa))))&&((this.rtvawstWaDeclineDesc == rhs.rtvawstWaDeclineDesc)||((this.rtvawstWaDeclineDesc!= null)&&this.rtvawstWaDeclineDesc.equals(rhs.rtvawstWaDeclineDesc))))&&((this.budgAllocAmt == rhs.budgAllocAmt)||((this.budgAllocAmt!= null)&&this.budgAllocAmt.equals(rhs.budgAllocAmt))))&&((this.totalAllocAmt == rhs.totalAllocAmt)||((this.totalAllocAmt!= null)&&this.totalAllocAmt.equals(rhs.totalAllocAmt))))&&((this.awrdUsingEstEfcInd == rhs.awrdUsingEstEfcInd)||((this.awrdUsingEstEfcInd!= null)&&this.awrdUsingEstEfcInd.equals(rhs.awrdUsingEstEfcInd))))&&((this.autoPackInd == rhs.autoPackInd)||((this.autoPackInd!= null)&&this.autoPackInd.equals(rhs.autoPackInd))))&&((this.displayPnInd == rhs.displayPnInd)||((this.displayPnInd!= null)&&this.displayPnInd.equals(rhs.displayPnInd))))&&((this.replaceTfcInd == rhs.replaceTfcInd)||((this.replaceTfcInd!= null)&&this.replaceTfcInd.equals(rhs.replaceTfcInd))))&&((this.webAcceptOption == rhs.webAcceptOption)||((this.webAcceptOption!= null)&&this.webAcceptOption.equals(rhs.webAcceptOption))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.disburseInd == rhs.disburseInd)||((this.disburseInd!= null)&&this.disburseInd.equals(rhs.disburseInd))))&&((this.roundSchedInd == rhs.roundSchedInd)||((this.roundSchedInd!= null)&&this.roundSchedInd.equals(rhs.roundSchedInd))))&&((this.rtvawstMixOfferDesc == rhs.rtvawstMixOfferDesc)||((this.rtvawstMixOfferDesc!= null)&&this.rtvawstMixOfferDesc.equals(rhs.rtvawstMixOfferDesc))))&&((this.webAcceptFlag == rhs.webAcceptFlag)||((this.webAcceptFlag!= null)&&this.webAcceptFlag.equals(rhs.webAcceptFlag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offerAwstCode == rhs.offerAwstCode)||((this.offerAwstCode!= null)&&this.offerAwstCode.equals(rhs.offerAwstCode))))&&((this.overrideSaprInd == rhs.overrideSaprInd)||((this.overrideSaprInd!= null)&&this.overrideSaprInd.equals(rhs.overrideSaprInd))))&&((this.equityInd == rhs.equityInd)||((this.equityInd!= null)&&this.equityInd.equals(rhs.equityInd))))&&((this.priorBalAmt == rhs.priorBalAmt)||((this.priorBalAmt!= null)&&this.priorBalAmt.equals(rhs.priorBalAmt))))&&((this.webAcceptAwstCode == rhs.webAcceptAwstCode)||((this.webAcceptAwstCode!= null)&&this.webAcceptAwstCode.equals(rhs.webAcceptAwstCode))))&&((this.selVerIncInd == rhs.selVerIncInd)||((this.selVerIncInd!= null)&&this.selVerIncInd.equals(rhs.selVerIncInd))))&&((this.reduceNeedInd == rhs.reduceNeedInd)||((this.reduceNeedInd!= null)&&this.reduceNeedInd.equals(rhs.reduceNeedInd))))&&((this.cancelAwstCode == rhs.cancelAwstCode)||((this.cancelAwstCode!= null)&&this.cancelAwstCode.equals(rhs.cancelAwstCode))))&&((this.mixAcceptAwstCode == rhs.mixAcceptAwstCode)||((this.mixAcceptAwstCode!= null)&&this.mixAcceptAwstCode.equals(rhs.mixAcceptAwstCode))))&&((this.smartYear == rhs.smartYear)||((this.smartYear!= null)&&this.smartYear.equals(rhs.smartYear))))&&((this.enableBbay == rhs.enableBbay)||((this.enableBbay!= null)&&this.enableBbay.equals(rhs.enableBbay))))&&((this.rebatePercent == rhs.rebatePercent)||((this.rebatePercent!= null)&&this.rebatePercent.equals(rhs.rebatePercent))))&&((this.availOfferPct == rhs.availOfferPct)||((this.availOfferPct!= null)&&this.availOfferPct.equals(rhs.availOfferPct))))&&((this.pnUrl == rhs.pnUrl)||((this.pnUrl!= null)&&this.pnUrl.equals(rhs.pnUrl))))&&((this.rtvawstAcceptDesc == rhs.rtvawstAcceptDesc)||((this.rtvawstAcceptDesc!= null)&&this.rtvawstAcceptDesc.equals(rhs.rtvawstAcceptDesc))))&&((this.autoAcceptInd == rhs.autoAcceptInd)||((this.autoAcceptInd!= null)&&this.autoAcceptInd.equals(rhs.autoAcceptInd))))&&((this.lessHalfLoadPct == rhs.lessHalfLoadPct)||((this.lessHalfLoadPct!= null)&&this.lessHalfLoadPct.equals(rhs.lessHalfLoadPct))))&&((this.rtvawstDeclineDesc == rhs.rtvawstDeclineDesc)||((this.rtvawstDeclineDesc!= null)&&this.rtvawstDeclineDesc.equals(rhs.rtvawstDeclineDesc))))&&((this.inelBefCutDateInd == rhs.inelBefCutDateInd)||((this.inelBefCutDateInd!= null)&&this.inelBefCutDateInd.equals(rhs.inelBefCutDateInd))))&&((this.maxAwardAmt == rhs.maxAwardAmt)||((this.maxAwardAmt!= null)&&this.maxAwardAmt.equals(rhs.maxAwardAmt))))&&((this.applMemoInd == rhs.applMemoInd)||((this.applMemoInd!= null)&&this.applMemoInd.equals(rhs.applMemoInd))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))))&&((this.interestRate == rhs.interestRate)||((this.interestRate!= null)&&this.interestRate.equals(rhs.interestRate))))&&((this.lmsFund == rhs.lmsFund)||((this.lmsFund!= null)&&this.lmsFund.equals(rhs.lmsFund))))&&((this.overrideTreqInd == rhs.overrideTreqInd)||((this.overrideTreqInd!= null)&&this.overrideTreqInd.equals(rhs.overrideTreqInd))))&&((this.pnDesc == rhs.pnDesc)||((this.pnDesc!= null)&&this.pnDesc.equals(rhs.pnDesc))))&&((this.acgYear == rhs.acgYear)||((this.acgYear!= null)&&this.acgYear.equals(rhs.acgYear))))&&((this.availOfferAmt == rhs.availOfferAmt)||((this.availOfferAmt!= null)&&this.availOfferAmt.equals(rhs.availOfferAmt))))&&((this.mixDeclineAwstCode == rhs.mixDeclineAwstCode)||((this.mixDeclineAwstCode!= null)&&this.mixDeclineAwstCode.equals(rhs.mixDeclineAwstCode))))&&((this.rtvawstOfferDesc == rhs.rtvawstOfferDesc)||((this.rtvawstOfferDesc!= null)&&this.rtvawstOfferDesc.equals(rhs.rtvawstOfferDesc))))&&((this.ncaaInd == rhs.ncaaInd)||((this.ncaaInd!= null)&&this.ncaaInd.equals(rhs.ncaaInd))))&&((this.attendingHrInd == rhs.attendingHrInd)||((this.attendingHrInd!= null)&&this.attendingHrInd.equals(rhs.attendingHrInd))))&&((this.mixOfferAwstCode == rhs.mixOfferAwstCode)||((this.mixOfferAwstCode!= null)&&this.mixOfferAwstCode.equals(rhs.mixOfferAwstCode))))&&((this.loanProcessInd == rhs.loanProcessInd)||((this.loanProcessInd!= null)&&this.loanProcessInd.equals(rhs.loanProcessInd))))&&((this.rtvawstMixDeclineDesc == rhs.rtvawstMixDeclineDesc)||((this.rtvawstMixDeclineDesc!= null)&&this.rtvawstMixDeclineDesc.equals(rhs.rtvawstMixDeclineDesc))))&&((this.selfHelpRedPct == rhs.selfHelpRedPct)||((this.selfHelpRedPct!= null)&&this.selfHelpRedPct.equals(rhs.selfHelpRedPct))))&&((this.acceptAwstCode == rhs.acceptAwstCode)||((this.acceptAwstCode!= null)&&this.acceptAwstCode.equals(rhs.acceptAwstCode))))&&((this.halfLoadPct == rhs.halfLoadPct)||((this.halfLoadPct!= null)&&this.halfLoadPct.equals(rhs.halfLoadPct))))&&((this.altLoanProgTypeCde == rhs.altLoanProgTypeCde)||((this.altLoanProgTypeCde!= null)&&this.altLoanProgTypeCde.equals(rhs.altLoanProgTypeCde))))&&((this.teachLevel == rhs.teachLevel)||((this.teachLevel!= null)&&this.teachLevel.equals(rhs.teachLevel))))&&((this.rtvawstWaAcceptDesc == rhs.rtvawstWaAcceptDesc)||((this.rtvawstWaAcceptDesc!= null)&&this.rtvawstWaAcceptDesc.equals(rhs.rtvawstWaAcceptDesc))))&&((this.elInd == rhs.elInd)||((this.elInd!= null)&&this.elInd.equals(rhs.elInd))))&&((this.useDisbEnrlMemoInd == rhs.useDisbEnrlMemoInd)||((this.useDisbEnrlMemoInd!= null)&&this.useDisbEnrlMemoInd.equals(rhs.useDisbEnrlMemoInd))))&&((this.changeLoadInd == rhs.changeLoadInd)||((this.changeLoadInd!= null)&&this.changeLoadInd.equals(rhs.changeLoadInd))))&&((this.autoSchedInd == rhs.autoSchedInd)||((this.autoSchedInd!= null)&&this.autoSchedInd.equals(rhs.autoSchedInd))))&&((this.naReqdInd == rhs.naReqdInd)||((this.naReqdInd!= null)&&this.naReqdInd.equals(rhs.naReqdInd))));
    }

}
