
package com.ellucian.generated.bpapi.ban.system_control_maintenance.v1_0_0;

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
    "apprOverrideIndInv",
    "poRcvdAmount",
    "ruclSecurityInd",
    "acctDueToTitle",
    "effDate",
    "docLvlMatchInd",
    "ftvtgrpTgrpTitle",
    "fundOrgSecurityInd",
    "statusInd",
    "acctCodeCoasDueFrm",
    "apprOverrideIndFa",
    "dfrGrntHistInd",
    "encNsfOnOffInd",
    "feedCode",
    "minAssetCapAmt",
    "invoiceRcvdAmt",
    "apprOverrideIndJv",
    "tgrpCodeDefault",
    "reqRcvdAmount",
    "deferGrantInd",
    "faNsfOnOffInd",
    "taxProcessingInd",
    "multipleFbAcctInd",
    "taxOverrideAmt",
    "editDeferInd",
    "wbudInd",
    "termDate",
    "apprOverrideIndReq",
    "jvNsfOnOffInd",
    "poNsfOnOffInd",
    "invNsfOnOffInd",
    "dcsrDtagFeedInd",
    "reqNsfOnOffInd",
    "apprOverrideIndCo",
    "taxOverridePct",
    "icCsOrderInd",
    "nchgDate",
    "wbudTrackInd",
    "issNsfOnOffInd",
    "activityDate",
    "federalEmployerId",
    "autoBuyrInd",
    "issuDtagFeedInd",
    "dcrNsfOnOffInd",
    "jvDtagFeedInd",
    "apprOverrideIndPo",
    "acctCodeCoasDueTo",
    "apprOverrideIndDcr",
    "statusDescription",
    "acctDueFrmTitle",
    "consolPostInd",
    "apprOverrideIndEnc"
})
@Generated("jsonschema2pojo")
public class SystemControlMaintenance100PutResponse {

    /**
     * Invoices
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_INV
     * 
     */
    @JsonProperty("apprOverrideIndInv")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_INV")
    private String apprOverrideIndInv;
    /**
     * Purchase Order Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_PO_RCVD_AMOUNT
     * 
     */
    @JsonProperty("poRcvdAmount")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_PO_RCVD_AMOUNT")
    private Double poRcvdAmount;
    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_RUCL_SECURITY_IND")
    private String ruclSecurityInd;
    @JsonProperty("acctDueToTitle")
    private String acctDueToTitle;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EFF_DATE")
    private Date effDate;
    /**
     * Document Level Matching
     * <p>
     * Lineage reference object : FOBSYSC_DOC_LVL_MATCH_IND
     * (Required)
     * 
     */
    @JsonProperty("docLvlMatchInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_DOC_LVL_MATCH_IND")
    private String docLvlMatchInd;
    @JsonProperty("ftvtgrpTgrpTitle")
    private String ftvtgrpTgrpTitle;
    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND")
    private String fundOrgSecurityInd;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_STATUS_IND")
    private String statusInd;
    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM")
    private String acctCodeCoasDueFrm;
    /**
     * Fixed Assets
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_FA
     * 
     */
    @JsonProperty("apprOverrideIndFa")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_FA")
    private String apprOverrideIndFa;
    /**
     * Retain Deferred Calculations
     * <p>
     * Lineage reference object : FOBSYSC_DFR_GRNT_HIST_IND
     * 
     */
    @JsonProperty("dfrGrntHistInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_DFR_GRNT_HIST_IND")
    private String dfrGrntHistInd;
    /**
     * Encumbrance NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ENC_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("encNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ENC_NSF_ON_OFF_IND")
    private String encNsfOnOffInd;
    /**
     * Fixed Asset Feed from
     * <p>
     * Lineage reference object : FOBSYSC_FEED_CODE
     * 
     */
    @JsonProperty("feedCode")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FEED_CODE")
    private String feedCode;
    /**
     * Minimum Asset Capitalization Amount
     * <p>
     * Lineage reference object : FOBSYSC_MIN_ASSET_CAP_AMT
     * 
     */
    @JsonProperty("minAssetCapAmt")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_MIN_ASSET_CAP_AMT")
    private Double minAssetCapAmt;
    /**
     * Invoice Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_INVOICE_RCVD_AMT
     * 
     */
    @JsonProperty("invoiceRcvdAmt")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_INVOICE_RCVD_AMT")
    private Double invoiceRcvdAmt;
    /**
     * Journal Vouchers
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_JV
     * 
     */
    @JsonProperty("apprOverrideIndJv")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_JV")
    private String apprOverrideIndJv;
    /**
     * Default Tax Group Code
     * <p>
     * Lineage reference object : FOBSYSC_TGRP_CODE_DEFAULT, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCodeDefault")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TGRP_CODE_DEFAULT, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCodeDefault;
    /**
     * Requisition Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_REQ_RCVD_AMOUNT
     * 
     */
    @JsonProperty("reqRcvdAmount")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_REQ_RCVD_AMOUNT")
    private Double reqRcvdAmount;
    /**
     * Defer Calculations of Indirect Cost and Cost Share
     * <p>
     * Lineage reference object : FOBSYSC_DEFER_GRANT_IND
     * 
     */
    @JsonProperty("deferGrantInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_DEFER_GRANT_IND")
    private String deferGrantInd;
    /**
     * Fixed Assets NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_FA_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("faNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FA_NSF_ON_OFF_IND")
    private String faNsfOnOffInd;
    /**
     * Tax Processing On
     * <p>
     * Lineage reference object : FOBSYSC_TAX_PROCESSING_IND
     * 
     */
    @JsonProperty("taxProcessingInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TAX_PROCESSING_IND")
    private String taxProcessingInd;
    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND")
    private String multipleFbAcctInd;
    /**
     * Tax Override Amount
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_AMT
     * 
     */
    @JsonProperty("taxOverrideAmt")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TAX_OVERRIDE_AMT")
    private Double taxOverrideAmt;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_IND")
    private String wbudInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TERM_DATE")
    private Date termDate;
    /**
     * Requisitions
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_REQ
     * 
     */
    @JsonProperty("apprOverrideIndReq")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_REQ")
    private String apprOverrideIndReq;
    /**
     * Journal Voucher NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_JV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("jvNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_JV_NSF_ON_OFF_IND")
    private String jvNsfOnOffInd;
    /**
     * Purchase Order NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_PO_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("poNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_PO_NSF_ON_OFF_IND")
    private String poNsfOnOffInd;
    /**
     * Invoice NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_INV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("invNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_INV_NSF_ON_OFF_IND")
    private String invNsfOnOffInd;
    /**
     * Direct Cash Receipt
     * <p>
     * Lineage reference object : FOBSYSC_DCSR_DTAG_FEED_IND
     * 
     */
    @JsonProperty("dcsrDtagFeedInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_DCSR_DTAG_FEED_IND")
    private String dcsrDtagFeedInd;
    /**
     * Requisition NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_REQ_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("reqNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_REQ_NSF_ON_OFF_IND")
    private String reqNsfOnOffInd;
    /**
     * Change Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_CO
     * 
     */
    @JsonProperty("apprOverrideIndCo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_CO")
    private String apprOverrideIndCo;
    /**
     * Tax Override Percentage
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_PCT
     * 
     */
    @JsonProperty("taxOverridePct")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TAX_OVERRIDE_PCT")
    private Double taxOverridePct;
    /**
     * Indirect Cost and Cost Share Calculation Order
     * <p>
     * Lineage reference object : FOBSYSC_IC_CS_ORDER_IND
     * 
     */
    @JsonProperty("icCsOrderInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_IC_CS_ORDER_IND")
    private String icCsOrderInd;
    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_NCHG_DATE")
    private Date nchgDate;
    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_TRACK_IND")
    private String wbudTrackInd;
    /**
     * Issue NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ISS_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("issNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ISS_NSF_ON_OFF_IND")
    private String issNsfOnOffInd;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID")
    private String federalEmployerId;
    /**
     * Automatic Buyer Assignment
     * <p>
     * Lineage reference object : FOBSYSC_AUTO_BUYR_IND
     * 
     */
    @JsonProperty("autoBuyrInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_AUTO_BUYR_IND")
    private String autoBuyrInd;
    /**
     * Stores Issues
     * <p>
     * Lineage reference object : FOBSYSC_ISSU_DTAG_FEED_IND
     * 
     */
    @JsonProperty("issuDtagFeedInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ISSU_DTAG_FEED_IND")
    private String issuDtagFeedInd;
    /**
     * Cash Receipts NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_DCR_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("dcrNsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_DCR_NSF_ON_OFF_IND")
    private String dcrNsfOnOffInd;
    /**
     * Journal Voucher
     * <p>
     * Lineage reference object : FOBSYSC_JV_DTAG_FEED_IND
     * 
     */
    @JsonProperty("jvDtagFeedInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_JV_DTAG_FEED_IND")
    private String jvDtagFeedInd;
    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_PO
     * 
     */
    @JsonProperty("apprOverrideIndPo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_PO")
    private String apprOverrideIndPo;
    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO")
    private String acctCodeCoasDueTo;
    /**
     * Cash Receipts
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_DCR
     * 
     */
    @JsonProperty("apprOverrideIndDcr")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_DCR")
    private String apprOverrideIndDcr;
    @JsonProperty("statusDescription")
    private String statusDescription;
    @JsonProperty("acctDueFrmTitle")
    private String acctDueFrmTitle;
    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_CONSOL_POST_IND")
    private String consolPostInd;
    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_ENC
     * 
     */
    @JsonProperty("apprOverrideIndEnc")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_ENC")
    private String apprOverrideIndEnc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Invoices
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_INV
     * 
     */
    @JsonProperty("apprOverrideIndInv")
    public String getApprOverrideIndInv() {
        return apprOverrideIndInv;
    }

    /**
     * Invoices
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_INV
     * 
     */
    @JsonProperty("apprOverrideIndInv")
    public void setApprOverrideIndInv(String apprOverrideIndInv) {
        this.apprOverrideIndInv = apprOverrideIndInv;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndInv(String apprOverrideIndInv) {
        this.apprOverrideIndInv = apprOverrideIndInv;
        return this;
    }

    /**
     * Purchase Order Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_PO_RCVD_AMOUNT
     * 
     */
    @JsonProperty("poRcvdAmount")
    public Double getPoRcvdAmount() {
        return poRcvdAmount;
    }

    /**
     * Purchase Order Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_PO_RCVD_AMOUNT
     * 
     */
    @JsonProperty("poRcvdAmount")
    public void setPoRcvdAmount(Double poRcvdAmount) {
        this.poRcvdAmount = poRcvdAmount;
    }

    public SystemControlMaintenance100PutResponse withPoRcvdAmount(Double poRcvdAmount) {
        this.poRcvdAmount = poRcvdAmount;
        return this;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public String getRuclSecurityInd() {
        return ruclSecurityInd;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public void setRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
    }

    public SystemControlMaintenance100PutResponse withRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
        return this;
    }

    @JsonProperty("acctDueToTitle")
    public String getAcctDueToTitle() {
        return acctDueToTitle;
    }

    @JsonProperty("acctDueToTitle")
    public void setAcctDueToTitle(String acctDueToTitle) {
        this.acctDueToTitle = acctDueToTitle;
    }

    public SystemControlMaintenance100PutResponse withAcctDueToTitle(String acctDueToTitle) {
        this.acctDueToTitle = acctDueToTitle;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SystemControlMaintenance100PutResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Document Level Matching
     * <p>
     * Lineage reference object : FOBSYSC_DOC_LVL_MATCH_IND
     * (Required)
     * 
     */
    @JsonProperty("docLvlMatchInd")
    public String getDocLvlMatchInd() {
        return docLvlMatchInd;
    }

    /**
     * Document Level Matching
     * <p>
     * Lineage reference object : FOBSYSC_DOC_LVL_MATCH_IND
     * (Required)
     * 
     */
    @JsonProperty("docLvlMatchInd")
    public void setDocLvlMatchInd(String docLvlMatchInd) {
        this.docLvlMatchInd = docLvlMatchInd;
    }

    public SystemControlMaintenance100PutResponse withDocLvlMatchInd(String docLvlMatchInd) {
        this.docLvlMatchInd = docLvlMatchInd;
        return this;
    }

    @JsonProperty("ftvtgrpTgrpTitle")
    public String getFtvtgrpTgrpTitle() {
        return ftvtgrpTgrpTitle;
    }

    @JsonProperty("ftvtgrpTgrpTitle")
    public void setFtvtgrpTgrpTitle(String ftvtgrpTgrpTitle) {
        this.ftvtgrpTgrpTitle = ftvtgrpTgrpTitle;
    }

    public SystemControlMaintenance100PutResponse withFtvtgrpTgrpTitle(String ftvtgrpTgrpTitle) {
        this.ftvtgrpTgrpTitle = ftvtgrpTgrpTitle;
        return this;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public String getFundOrgSecurityInd() {
        return fundOrgSecurityInd;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public void setFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
    }

    public SystemControlMaintenance100PutResponse withFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public SystemControlMaintenance100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public String getAcctCodeCoasDueFrm() {
        return acctCodeCoasDueFrm;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public void setAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
    }

    public SystemControlMaintenance100PutResponse withAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
        return this;
    }

    /**
     * Fixed Assets
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_FA
     * 
     */
    @JsonProperty("apprOverrideIndFa")
    public String getApprOverrideIndFa() {
        return apprOverrideIndFa;
    }

    /**
     * Fixed Assets
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_FA
     * 
     */
    @JsonProperty("apprOverrideIndFa")
    public void setApprOverrideIndFa(String apprOverrideIndFa) {
        this.apprOverrideIndFa = apprOverrideIndFa;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndFa(String apprOverrideIndFa) {
        this.apprOverrideIndFa = apprOverrideIndFa;
        return this;
    }

    /**
     * Retain Deferred Calculations
     * <p>
     * Lineage reference object : FOBSYSC_DFR_GRNT_HIST_IND
     * 
     */
    @JsonProperty("dfrGrntHistInd")
    public String getDfrGrntHistInd() {
        return dfrGrntHistInd;
    }

    /**
     * Retain Deferred Calculations
     * <p>
     * Lineage reference object : FOBSYSC_DFR_GRNT_HIST_IND
     * 
     */
    @JsonProperty("dfrGrntHistInd")
    public void setDfrGrntHistInd(String dfrGrntHistInd) {
        this.dfrGrntHistInd = dfrGrntHistInd;
    }

    public SystemControlMaintenance100PutResponse withDfrGrntHistInd(String dfrGrntHistInd) {
        this.dfrGrntHistInd = dfrGrntHistInd;
        return this;
    }

    /**
     * Encumbrance NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ENC_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("encNsfOnOffInd")
    public String getEncNsfOnOffInd() {
        return encNsfOnOffInd;
    }

    /**
     * Encumbrance NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ENC_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("encNsfOnOffInd")
    public void setEncNsfOnOffInd(String encNsfOnOffInd) {
        this.encNsfOnOffInd = encNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withEncNsfOnOffInd(String encNsfOnOffInd) {
        this.encNsfOnOffInd = encNsfOnOffInd;
        return this;
    }

    /**
     * Fixed Asset Feed from
     * <p>
     * Lineage reference object : FOBSYSC_FEED_CODE
     * 
     */
    @JsonProperty("feedCode")
    public String getFeedCode() {
        return feedCode;
    }

    /**
     * Fixed Asset Feed from
     * <p>
     * Lineage reference object : FOBSYSC_FEED_CODE
     * 
     */
    @JsonProperty("feedCode")
    public void setFeedCode(String feedCode) {
        this.feedCode = feedCode;
    }

    public SystemControlMaintenance100PutResponse withFeedCode(String feedCode) {
        this.feedCode = feedCode;
        return this;
    }

    /**
     * Minimum Asset Capitalization Amount
     * <p>
     * Lineage reference object : FOBSYSC_MIN_ASSET_CAP_AMT
     * 
     */
    @JsonProperty("minAssetCapAmt")
    public Double getMinAssetCapAmt() {
        return minAssetCapAmt;
    }

    /**
     * Minimum Asset Capitalization Amount
     * <p>
     * Lineage reference object : FOBSYSC_MIN_ASSET_CAP_AMT
     * 
     */
    @JsonProperty("minAssetCapAmt")
    public void setMinAssetCapAmt(Double minAssetCapAmt) {
        this.minAssetCapAmt = minAssetCapAmt;
    }

    public SystemControlMaintenance100PutResponse withMinAssetCapAmt(Double minAssetCapAmt) {
        this.minAssetCapAmt = minAssetCapAmt;
        return this;
    }

    /**
     * Invoice Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_INVOICE_RCVD_AMT
     * 
     */
    @JsonProperty("invoiceRcvdAmt")
    public Double getInvoiceRcvdAmt() {
        return invoiceRcvdAmt;
    }

    /**
     * Invoice Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_INVOICE_RCVD_AMT
     * 
     */
    @JsonProperty("invoiceRcvdAmt")
    public void setInvoiceRcvdAmt(Double invoiceRcvdAmt) {
        this.invoiceRcvdAmt = invoiceRcvdAmt;
    }

    public SystemControlMaintenance100PutResponse withInvoiceRcvdAmt(Double invoiceRcvdAmt) {
        this.invoiceRcvdAmt = invoiceRcvdAmt;
        return this;
    }

    /**
     * Journal Vouchers
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_JV
     * 
     */
    @JsonProperty("apprOverrideIndJv")
    public String getApprOverrideIndJv() {
        return apprOverrideIndJv;
    }

    /**
     * Journal Vouchers
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_JV
     * 
     */
    @JsonProperty("apprOverrideIndJv")
    public void setApprOverrideIndJv(String apprOverrideIndJv) {
        this.apprOverrideIndJv = apprOverrideIndJv;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndJv(String apprOverrideIndJv) {
        this.apprOverrideIndJv = apprOverrideIndJv;
        return this;
    }

    /**
     * Default Tax Group Code
     * <p>
     * Lineage reference object : FOBSYSC_TGRP_CODE_DEFAULT, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCodeDefault")
    public String getTgrpCodeDefault() {
        return tgrpCodeDefault;
    }

    /**
     * Default Tax Group Code
     * <p>
     * Lineage reference object : FOBSYSC_TGRP_CODE_DEFAULT, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCodeDefault")
    public void setTgrpCodeDefault(String tgrpCodeDefault) {
        this.tgrpCodeDefault = tgrpCodeDefault;
    }

    public SystemControlMaintenance100PutResponse withTgrpCodeDefault(String tgrpCodeDefault) {
        this.tgrpCodeDefault = tgrpCodeDefault;
        return this;
    }

    /**
     * Requisition Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_REQ_RCVD_AMOUNT
     * 
     */
    @JsonProperty("reqRcvdAmount")
    public Double getReqRcvdAmount() {
        return reqRcvdAmount;
    }

    /**
     * Requisition Amount Requiring Receipt
     * <p>
     * Lineage reference object : FOBSYSC_REQ_RCVD_AMOUNT
     * 
     */
    @JsonProperty("reqRcvdAmount")
    public void setReqRcvdAmount(Double reqRcvdAmount) {
        this.reqRcvdAmount = reqRcvdAmount;
    }

    public SystemControlMaintenance100PutResponse withReqRcvdAmount(Double reqRcvdAmount) {
        this.reqRcvdAmount = reqRcvdAmount;
        return this;
    }

    /**
     * Defer Calculations of Indirect Cost and Cost Share
     * <p>
     * Lineage reference object : FOBSYSC_DEFER_GRANT_IND
     * 
     */
    @JsonProperty("deferGrantInd")
    public String getDeferGrantInd() {
        return deferGrantInd;
    }

    /**
     * Defer Calculations of Indirect Cost and Cost Share
     * <p>
     * Lineage reference object : FOBSYSC_DEFER_GRANT_IND
     * 
     */
    @JsonProperty("deferGrantInd")
    public void setDeferGrantInd(String deferGrantInd) {
        this.deferGrantInd = deferGrantInd;
    }

    public SystemControlMaintenance100PutResponse withDeferGrantInd(String deferGrantInd) {
        this.deferGrantInd = deferGrantInd;
        return this;
    }

    /**
     * Fixed Assets NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_FA_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("faNsfOnOffInd")
    public String getFaNsfOnOffInd() {
        return faNsfOnOffInd;
    }

    /**
     * Fixed Assets NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_FA_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("faNsfOnOffInd")
    public void setFaNsfOnOffInd(String faNsfOnOffInd) {
        this.faNsfOnOffInd = faNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withFaNsfOnOffInd(String faNsfOnOffInd) {
        this.faNsfOnOffInd = faNsfOnOffInd;
        return this;
    }

    /**
     * Tax Processing On
     * <p>
     * Lineage reference object : FOBSYSC_TAX_PROCESSING_IND
     * 
     */
    @JsonProperty("taxProcessingInd")
    public String getTaxProcessingInd() {
        return taxProcessingInd;
    }

    /**
     * Tax Processing On
     * <p>
     * Lineage reference object : FOBSYSC_TAX_PROCESSING_IND
     * 
     */
    @JsonProperty("taxProcessingInd")
    public void setTaxProcessingInd(String taxProcessingInd) {
        this.taxProcessingInd = taxProcessingInd;
    }

    public SystemControlMaintenance100PutResponse withTaxProcessingInd(String taxProcessingInd) {
        this.taxProcessingInd = taxProcessingInd;
        return this;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public String getMultipleFbAcctInd() {
        return multipleFbAcctInd;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public void setMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
    }

    public SystemControlMaintenance100PutResponse withMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
        return this;
    }

    /**
     * Tax Override Amount
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_AMT
     * 
     */
    @JsonProperty("taxOverrideAmt")
    public Double getTaxOverrideAmt() {
        return taxOverrideAmt;
    }

    /**
     * Tax Override Amount
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_AMT
     * 
     */
    @JsonProperty("taxOverrideAmt")
    public void setTaxOverrideAmt(Double taxOverrideAmt) {
        this.taxOverrideAmt = taxOverrideAmt;
    }

    public SystemControlMaintenance100PutResponse withTaxOverrideAmt(Double taxOverrideAmt) {
        this.taxOverrideAmt = taxOverrideAmt;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public SystemControlMaintenance100PutResponse withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public String getWbudInd() {
        return wbudInd;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public void setWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
    }

    public SystemControlMaintenance100PutResponse withWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SystemControlMaintenance100PutResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Requisitions
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_REQ
     * 
     */
    @JsonProperty("apprOverrideIndReq")
    public String getApprOverrideIndReq() {
        return apprOverrideIndReq;
    }

    /**
     * Requisitions
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_REQ
     * 
     */
    @JsonProperty("apprOverrideIndReq")
    public void setApprOverrideIndReq(String apprOverrideIndReq) {
        this.apprOverrideIndReq = apprOverrideIndReq;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndReq(String apprOverrideIndReq) {
        this.apprOverrideIndReq = apprOverrideIndReq;
        return this;
    }

    /**
     * Journal Voucher NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_JV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("jvNsfOnOffInd")
    public String getJvNsfOnOffInd() {
        return jvNsfOnOffInd;
    }

    /**
     * Journal Voucher NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_JV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("jvNsfOnOffInd")
    public void setJvNsfOnOffInd(String jvNsfOnOffInd) {
        this.jvNsfOnOffInd = jvNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withJvNsfOnOffInd(String jvNsfOnOffInd) {
        this.jvNsfOnOffInd = jvNsfOnOffInd;
        return this;
    }

    /**
     * Purchase Order NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_PO_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("poNsfOnOffInd")
    public String getPoNsfOnOffInd() {
        return poNsfOnOffInd;
    }

    /**
     * Purchase Order NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_PO_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("poNsfOnOffInd")
    public void setPoNsfOnOffInd(String poNsfOnOffInd) {
        this.poNsfOnOffInd = poNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withPoNsfOnOffInd(String poNsfOnOffInd) {
        this.poNsfOnOffInd = poNsfOnOffInd;
        return this;
    }

    /**
     * Invoice NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_INV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("invNsfOnOffInd")
    public String getInvNsfOnOffInd() {
        return invNsfOnOffInd;
    }

    /**
     * Invoice NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_INV_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("invNsfOnOffInd")
    public void setInvNsfOnOffInd(String invNsfOnOffInd) {
        this.invNsfOnOffInd = invNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withInvNsfOnOffInd(String invNsfOnOffInd) {
        this.invNsfOnOffInd = invNsfOnOffInd;
        return this;
    }

    /**
     * Direct Cash Receipt
     * <p>
     * Lineage reference object : FOBSYSC_DCSR_DTAG_FEED_IND
     * 
     */
    @JsonProperty("dcsrDtagFeedInd")
    public String getDcsrDtagFeedInd() {
        return dcsrDtagFeedInd;
    }

    /**
     * Direct Cash Receipt
     * <p>
     * Lineage reference object : FOBSYSC_DCSR_DTAG_FEED_IND
     * 
     */
    @JsonProperty("dcsrDtagFeedInd")
    public void setDcsrDtagFeedInd(String dcsrDtagFeedInd) {
        this.dcsrDtagFeedInd = dcsrDtagFeedInd;
    }

    public SystemControlMaintenance100PutResponse withDcsrDtagFeedInd(String dcsrDtagFeedInd) {
        this.dcsrDtagFeedInd = dcsrDtagFeedInd;
        return this;
    }

    /**
     * Requisition NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_REQ_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("reqNsfOnOffInd")
    public String getReqNsfOnOffInd() {
        return reqNsfOnOffInd;
    }

    /**
     * Requisition NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_REQ_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("reqNsfOnOffInd")
    public void setReqNsfOnOffInd(String reqNsfOnOffInd) {
        this.reqNsfOnOffInd = reqNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withReqNsfOnOffInd(String reqNsfOnOffInd) {
        this.reqNsfOnOffInd = reqNsfOnOffInd;
        return this;
    }

    /**
     * Change Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_CO
     * 
     */
    @JsonProperty("apprOverrideIndCo")
    public String getApprOverrideIndCo() {
        return apprOverrideIndCo;
    }

    /**
     * Change Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_CO
     * 
     */
    @JsonProperty("apprOverrideIndCo")
    public void setApprOverrideIndCo(String apprOverrideIndCo) {
        this.apprOverrideIndCo = apprOverrideIndCo;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndCo(String apprOverrideIndCo) {
        this.apprOverrideIndCo = apprOverrideIndCo;
        return this;
    }

    /**
     * Tax Override Percentage
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_PCT
     * 
     */
    @JsonProperty("taxOverridePct")
    public Double getTaxOverridePct() {
        return taxOverridePct;
    }

    /**
     * Tax Override Percentage
     * <p>
     * Lineage reference object : FOBSYSC_TAX_OVERRIDE_PCT
     * 
     */
    @JsonProperty("taxOverridePct")
    public void setTaxOverridePct(Double taxOverridePct) {
        this.taxOverridePct = taxOverridePct;
    }

    public SystemControlMaintenance100PutResponse withTaxOverridePct(Double taxOverridePct) {
        this.taxOverridePct = taxOverridePct;
        return this;
    }

    /**
     * Indirect Cost and Cost Share Calculation Order
     * <p>
     * Lineage reference object : FOBSYSC_IC_CS_ORDER_IND
     * 
     */
    @JsonProperty("icCsOrderInd")
    public String getIcCsOrderInd() {
        return icCsOrderInd;
    }

    /**
     * Indirect Cost and Cost Share Calculation Order
     * <p>
     * Lineage reference object : FOBSYSC_IC_CS_ORDER_IND
     * 
     */
    @JsonProperty("icCsOrderInd")
    public void setIcCsOrderInd(String icCsOrderInd) {
        this.icCsOrderInd = icCsOrderInd;
    }

    public SystemControlMaintenance100PutResponse withIcCsOrderInd(String icCsOrderInd) {
        this.icCsOrderInd = icCsOrderInd;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public Date getNchgDate() {
        return nchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public void setNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
    }

    public SystemControlMaintenance100PutResponse withNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
        return this;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public String getWbudTrackInd() {
        return wbudTrackInd;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public void setWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
    }

    public SystemControlMaintenance100PutResponse withWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
        return this;
    }

    /**
     * Issue NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ISS_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("issNsfOnOffInd")
    public String getIssNsfOnOffInd() {
        return issNsfOnOffInd;
    }

    /**
     * Issue NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_ISS_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("issNsfOnOffInd")
    public void setIssNsfOnOffInd(String issNsfOnOffInd) {
        this.issNsfOnOffInd = issNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withIssNsfOnOffInd(String issNsfOnOffInd) {
        this.issNsfOnOffInd = issNsfOnOffInd;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SystemControlMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public String getFederalEmployerId() {
        return federalEmployerId;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public void setFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
    }

    public SystemControlMaintenance100PutResponse withFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
        return this;
    }

    /**
     * Automatic Buyer Assignment
     * <p>
     * Lineage reference object : FOBSYSC_AUTO_BUYR_IND
     * 
     */
    @JsonProperty("autoBuyrInd")
    public String getAutoBuyrInd() {
        return autoBuyrInd;
    }

    /**
     * Automatic Buyer Assignment
     * <p>
     * Lineage reference object : FOBSYSC_AUTO_BUYR_IND
     * 
     */
    @JsonProperty("autoBuyrInd")
    public void setAutoBuyrInd(String autoBuyrInd) {
        this.autoBuyrInd = autoBuyrInd;
    }

    public SystemControlMaintenance100PutResponse withAutoBuyrInd(String autoBuyrInd) {
        this.autoBuyrInd = autoBuyrInd;
        return this;
    }

    /**
     * Stores Issues
     * <p>
     * Lineage reference object : FOBSYSC_ISSU_DTAG_FEED_IND
     * 
     */
    @JsonProperty("issuDtagFeedInd")
    public String getIssuDtagFeedInd() {
        return issuDtagFeedInd;
    }

    /**
     * Stores Issues
     * <p>
     * Lineage reference object : FOBSYSC_ISSU_DTAG_FEED_IND
     * 
     */
    @JsonProperty("issuDtagFeedInd")
    public void setIssuDtagFeedInd(String issuDtagFeedInd) {
        this.issuDtagFeedInd = issuDtagFeedInd;
    }

    public SystemControlMaintenance100PutResponse withIssuDtagFeedInd(String issuDtagFeedInd) {
        this.issuDtagFeedInd = issuDtagFeedInd;
        return this;
    }

    /**
     * Cash Receipts NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_DCR_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("dcrNsfOnOffInd")
    public String getDcrNsfOnOffInd() {
        return dcrNsfOnOffInd;
    }

    /**
     * Cash Receipts NSF Checking
     * <p>
     * Lineage reference object : FOBSYSC_DCR_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("dcrNsfOnOffInd")
    public void setDcrNsfOnOffInd(String dcrNsfOnOffInd) {
        this.dcrNsfOnOffInd = dcrNsfOnOffInd;
    }

    public SystemControlMaintenance100PutResponse withDcrNsfOnOffInd(String dcrNsfOnOffInd) {
        this.dcrNsfOnOffInd = dcrNsfOnOffInd;
        return this;
    }

    /**
     * Journal Voucher
     * <p>
     * Lineage reference object : FOBSYSC_JV_DTAG_FEED_IND
     * 
     */
    @JsonProperty("jvDtagFeedInd")
    public String getJvDtagFeedInd() {
        return jvDtagFeedInd;
    }

    /**
     * Journal Voucher
     * <p>
     * Lineage reference object : FOBSYSC_JV_DTAG_FEED_IND
     * 
     */
    @JsonProperty("jvDtagFeedInd")
    public void setJvDtagFeedInd(String jvDtagFeedInd) {
        this.jvDtagFeedInd = jvDtagFeedInd;
    }

    public SystemControlMaintenance100PutResponse withJvDtagFeedInd(String jvDtagFeedInd) {
        this.jvDtagFeedInd = jvDtagFeedInd;
        return this;
    }

    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_PO
     * 
     */
    @JsonProperty("apprOverrideIndPo")
    public String getApprOverrideIndPo() {
        return apprOverrideIndPo;
    }

    /**
     * Purchase Orders
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_PO
     * 
     */
    @JsonProperty("apprOverrideIndPo")
    public void setApprOverrideIndPo(String apprOverrideIndPo) {
        this.apprOverrideIndPo = apprOverrideIndPo;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndPo(String apprOverrideIndPo) {
        this.apprOverrideIndPo = apprOverrideIndPo;
        return this;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public String getAcctCodeCoasDueTo() {
        return acctCodeCoasDueTo;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public void setAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
    }

    public SystemControlMaintenance100PutResponse withAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
        return this;
    }

    /**
     * Cash Receipts
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_DCR
     * 
     */
    @JsonProperty("apprOverrideIndDcr")
    public String getApprOverrideIndDcr() {
        return apprOverrideIndDcr;
    }

    /**
     * Cash Receipts
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_DCR
     * 
     */
    @JsonProperty("apprOverrideIndDcr")
    public void setApprOverrideIndDcr(String apprOverrideIndDcr) {
        this.apprOverrideIndDcr = apprOverrideIndDcr;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndDcr(String apprOverrideIndDcr) {
        this.apprOverrideIndDcr = apprOverrideIndDcr;
        return this;
    }

    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public SystemControlMaintenance100PutResponse withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    @JsonProperty("acctDueFrmTitle")
    public String getAcctDueFrmTitle() {
        return acctDueFrmTitle;
    }

    @JsonProperty("acctDueFrmTitle")
    public void setAcctDueFrmTitle(String acctDueFrmTitle) {
        this.acctDueFrmTitle = acctDueFrmTitle;
    }

    public SystemControlMaintenance100PutResponse withAcctDueFrmTitle(String acctDueFrmTitle) {
        this.acctDueFrmTitle = acctDueFrmTitle;
        return this;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public String getConsolPostInd() {
        return consolPostInd;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public void setConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
    }

    public SystemControlMaintenance100PutResponse withConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
        return this;
    }

    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_ENC
     * 
     */
    @JsonProperty("apprOverrideIndEnc")
    public String getApprOverrideIndEnc() {
        return apprOverrideIndEnc;
    }

    /**
     * Encumbrances
     * <p>
     * Lineage reference object : FOBSYSC_APPR_OVERRIDE_IND_ENC
     * 
     */
    @JsonProperty("apprOverrideIndEnc")
    public void setApprOverrideIndEnc(String apprOverrideIndEnc) {
        this.apprOverrideIndEnc = apprOverrideIndEnc;
    }

    public SystemControlMaintenance100PutResponse withApprOverrideIndEnc(String apprOverrideIndEnc) {
        this.apprOverrideIndEnc = apprOverrideIndEnc;
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

    public SystemControlMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemControlMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apprOverrideIndInv");
        sb.append('=');
        sb.append(((this.apprOverrideIndInv == null)?"<null>":this.apprOverrideIndInv));
        sb.append(',');
        sb.append("poRcvdAmount");
        sb.append('=');
        sb.append(((this.poRcvdAmount == null)?"<null>":this.poRcvdAmount));
        sb.append(',');
        sb.append("ruclSecurityInd");
        sb.append('=');
        sb.append(((this.ruclSecurityInd == null)?"<null>":this.ruclSecurityInd));
        sb.append(',');
        sb.append("acctDueToTitle");
        sb.append('=');
        sb.append(((this.acctDueToTitle == null)?"<null>":this.acctDueToTitle));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("docLvlMatchInd");
        sb.append('=');
        sb.append(((this.docLvlMatchInd == null)?"<null>":this.docLvlMatchInd));
        sb.append(',');
        sb.append("ftvtgrpTgrpTitle");
        sb.append('=');
        sb.append(((this.ftvtgrpTgrpTitle == null)?"<null>":this.ftvtgrpTgrpTitle));
        sb.append(',');
        sb.append("fundOrgSecurityInd");
        sb.append('=');
        sb.append(((this.fundOrgSecurityInd == null)?"<null>":this.fundOrgSecurityInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("acctCodeCoasDueFrm");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueFrm == null)?"<null>":this.acctCodeCoasDueFrm));
        sb.append(',');
        sb.append("apprOverrideIndFa");
        sb.append('=');
        sb.append(((this.apprOverrideIndFa == null)?"<null>":this.apprOverrideIndFa));
        sb.append(',');
        sb.append("dfrGrntHistInd");
        sb.append('=');
        sb.append(((this.dfrGrntHistInd == null)?"<null>":this.dfrGrntHistInd));
        sb.append(',');
        sb.append("encNsfOnOffInd");
        sb.append('=');
        sb.append(((this.encNsfOnOffInd == null)?"<null>":this.encNsfOnOffInd));
        sb.append(',');
        sb.append("feedCode");
        sb.append('=');
        sb.append(((this.feedCode == null)?"<null>":this.feedCode));
        sb.append(',');
        sb.append("minAssetCapAmt");
        sb.append('=');
        sb.append(((this.minAssetCapAmt == null)?"<null>":this.minAssetCapAmt));
        sb.append(',');
        sb.append("invoiceRcvdAmt");
        sb.append('=');
        sb.append(((this.invoiceRcvdAmt == null)?"<null>":this.invoiceRcvdAmt));
        sb.append(',');
        sb.append("apprOverrideIndJv");
        sb.append('=');
        sb.append(((this.apprOverrideIndJv == null)?"<null>":this.apprOverrideIndJv));
        sb.append(',');
        sb.append("tgrpCodeDefault");
        sb.append('=');
        sb.append(((this.tgrpCodeDefault == null)?"<null>":this.tgrpCodeDefault));
        sb.append(',');
        sb.append("reqRcvdAmount");
        sb.append('=');
        sb.append(((this.reqRcvdAmount == null)?"<null>":this.reqRcvdAmount));
        sb.append(',');
        sb.append("deferGrantInd");
        sb.append('=');
        sb.append(((this.deferGrantInd == null)?"<null>":this.deferGrantInd));
        sb.append(',');
        sb.append("faNsfOnOffInd");
        sb.append('=');
        sb.append(((this.faNsfOnOffInd == null)?"<null>":this.faNsfOnOffInd));
        sb.append(',');
        sb.append("taxProcessingInd");
        sb.append('=');
        sb.append(((this.taxProcessingInd == null)?"<null>":this.taxProcessingInd));
        sb.append(',');
        sb.append("multipleFbAcctInd");
        sb.append('=');
        sb.append(((this.multipleFbAcctInd == null)?"<null>":this.multipleFbAcctInd));
        sb.append(',');
        sb.append("taxOverrideAmt");
        sb.append('=');
        sb.append(((this.taxOverrideAmt == null)?"<null>":this.taxOverrideAmt));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("wbudInd");
        sb.append('=');
        sb.append(((this.wbudInd == null)?"<null>":this.wbudInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("apprOverrideIndReq");
        sb.append('=');
        sb.append(((this.apprOverrideIndReq == null)?"<null>":this.apprOverrideIndReq));
        sb.append(',');
        sb.append("jvNsfOnOffInd");
        sb.append('=');
        sb.append(((this.jvNsfOnOffInd == null)?"<null>":this.jvNsfOnOffInd));
        sb.append(',');
        sb.append("poNsfOnOffInd");
        sb.append('=');
        sb.append(((this.poNsfOnOffInd == null)?"<null>":this.poNsfOnOffInd));
        sb.append(',');
        sb.append("invNsfOnOffInd");
        sb.append('=');
        sb.append(((this.invNsfOnOffInd == null)?"<null>":this.invNsfOnOffInd));
        sb.append(',');
        sb.append("dcsrDtagFeedInd");
        sb.append('=');
        sb.append(((this.dcsrDtagFeedInd == null)?"<null>":this.dcsrDtagFeedInd));
        sb.append(',');
        sb.append("reqNsfOnOffInd");
        sb.append('=');
        sb.append(((this.reqNsfOnOffInd == null)?"<null>":this.reqNsfOnOffInd));
        sb.append(',');
        sb.append("apprOverrideIndCo");
        sb.append('=');
        sb.append(((this.apprOverrideIndCo == null)?"<null>":this.apprOverrideIndCo));
        sb.append(',');
        sb.append("taxOverridePct");
        sb.append('=');
        sb.append(((this.taxOverridePct == null)?"<null>":this.taxOverridePct));
        sb.append(',');
        sb.append("icCsOrderInd");
        sb.append('=');
        sb.append(((this.icCsOrderInd == null)?"<null>":this.icCsOrderInd));
        sb.append(',');
        sb.append("nchgDate");
        sb.append('=');
        sb.append(((this.nchgDate == null)?"<null>":this.nchgDate));
        sb.append(',');
        sb.append("wbudTrackInd");
        sb.append('=');
        sb.append(((this.wbudTrackInd == null)?"<null>":this.wbudTrackInd));
        sb.append(',');
        sb.append("issNsfOnOffInd");
        sb.append('=');
        sb.append(((this.issNsfOnOffInd == null)?"<null>":this.issNsfOnOffInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("federalEmployerId");
        sb.append('=');
        sb.append(((this.federalEmployerId == null)?"<null>":this.federalEmployerId));
        sb.append(',');
        sb.append("autoBuyrInd");
        sb.append('=');
        sb.append(((this.autoBuyrInd == null)?"<null>":this.autoBuyrInd));
        sb.append(',');
        sb.append("issuDtagFeedInd");
        sb.append('=');
        sb.append(((this.issuDtagFeedInd == null)?"<null>":this.issuDtagFeedInd));
        sb.append(',');
        sb.append("dcrNsfOnOffInd");
        sb.append('=');
        sb.append(((this.dcrNsfOnOffInd == null)?"<null>":this.dcrNsfOnOffInd));
        sb.append(',');
        sb.append("jvDtagFeedInd");
        sb.append('=');
        sb.append(((this.jvDtagFeedInd == null)?"<null>":this.jvDtagFeedInd));
        sb.append(',');
        sb.append("apprOverrideIndPo");
        sb.append('=');
        sb.append(((this.apprOverrideIndPo == null)?"<null>":this.apprOverrideIndPo));
        sb.append(',');
        sb.append("acctCodeCoasDueTo");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueTo == null)?"<null>":this.acctCodeCoasDueTo));
        sb.append(',');
        sb.append("apprOverrideIndDcr");
        sb.append('=');
        sb.append(((this.apprOverrideIndDcr == null)?"<null>":this.apprOverrideIndDcr));
        sb.append(',');
        sb.append("statusDescription");
        sb.append('=');
        sb.append(((this.statusDescription == null)?"<null>":this.statusDescription));
        sb.append(',');
        sb.append("acctDueFrmTitle");
        sb.append('=');
        sb.append(((this.acctDueFrmTitle == null)?"<null>":this.acctDueFrmTitle));
        sb.append(',');
        sb.append("consolPostInd");
        sb.append('=');
        sb.append(((this.consolPostInd == null)?"<null>":this.consolPostInd));
        sb.append(',');
        sb.append("apprOverrideIndEnc");
        sb.append('=');
        sb.append(((this.apprOverrideIndEnc == null)?"<null>":this.apprOverrideIndEnc));
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
        result = ((result* 31)+((this.apprOverrideIndInv == null)? 0 :this.apprOverrideIndInv.hashCode()));
        result = ((result* 31)+((this.poRcvdAmount == null)? 0 :this.poRcvdAmount.hashCode()));
        result = ((result* 31)+((this.ruclSecurityInd == null)? 0 :this.ruclSecurityInd.hashCode()));
        result = ((result* 31)+((this.acctDueToTitle == null)? 0 :this.acctDueToTitle.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.docLvlMatchInd == null)? 0 :this.docLvlMatchInd.hashCode()));
        result = ((result* 31)+((this.ftvtgrpTgrpTitle == null)? 0 :this.ftvtgrpTgrpTitle.hashCode()));
        result = ((result* 31)+((this.fundOrgSecurityInd == null)? 0 :this.fundOrgSecurityInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.acctCodeCoasDueFrm == null)? 0 :this.acctCodeCoasDueFrm.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndFa == null)? 0 :this.apprOverrideIndFa.hashCode()));
        result = ((result* 31)+((this.dfrGrntHistInd == null)? 0 :this.dfrGrntHistInd.hashCode()));
        result = ((result* 31)+((this.encNsfOnOffInd == null)? 0 :this.encNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.feedCode == null)? 0 :this.feedCode.hashCode()));
        result = ((result* 31)+((this.minAssetCapAmt == null)? 0 :this.minAssetCapAmt.hashCode()));
        result = ((result* 31)+((this.invoiceRcvdAmt == null)? 0 :this.invoiceRcvdAmt.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndJv == null)? 0 :this.apprOverrideIndJv.hashCode()));
        result = ((result* 31)+((this.tgrpCodeDefault == null)? 0 :this.tgrpCodeDefault.hashCode()));
        result = ((result* 31)+((this.reqRcvdAmount == null)? 0 :this.reqRcvdAmount.hashCode()));
        result = ((result* 31)+((this.deferGrantInd == null)? 0 :this.deferGrantInd.hashCode()));
        result = ((result* 31)+((this.faNsfOnOffInd == null)? 0 :this.faNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.taxProcessingInd == null)? 0 :this.taxProcessingInd.hashCode()));
        result = ((result* 31)+((this.multipleFbAcctInd == null)? 0 :this.multipleFbAcctInd.hashCode()));
        result = ((result* 31)+((this.taxOverrideAmt == null)? 0 :this.taxOverrideAmt.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.wbudInd == null)? 0 :this.wbudInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndReq == null)? 0 :this.apprOverrideIndReq.hashCode()));
        result = ((result* 31)+((this.jvNsfOnOffInd == null)? 0 :this.jvNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.poNsfOnOffInd == null)? 0 :this.poNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.invNsfOnOffInd == null)? 0 :this.invNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.dcsrDtagFeedInd == null)? 0 :this.dcsrDtagFeedInd.hashCode()));
        result = ((result* 31)+((this.reqNsfOnOffInd == null)? 0 :this.reqNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndCo == null)? 0 :this.apprOverrideIndCo.hashCode()));
        result = ((result* 31)+((this.taxOverridePct == null)? 0 :this.taxOverridePct.hashCode()));
        result = ((result* 31)+((this.icCsOrderInd == null)? 0 :this.icCsOrderInd.hashCode()));
        result = ((result* 31)+((this.nchgDate == null)? 0 :this.nchgDate.hashCode()));
        result = ((result* 31)+((this.wbudTrackInd == null)? 0 :this.wbudTrackInd.hashCode()));
        result = ((result* 31)+((this.issNsfOnOffInd == null)? 0 :this.issNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.federalEmployerId == null)? 0 :this.federalEmployerId.hashCode()));
        result = ((result* 31)+((this.autoBuyrInd == null)? 0 :this.autoBuyrInd.hashCode()));
        result = ((result* 31)+((this.issuDtagFeedInd == null)? 0 :this.issuDtagFeedInd.hashCode()));
        result = ((result* 31)+((this.dcrNsfOnOffInd == null)? 0 :this.dcrNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.jvDtagFeedInd == null)? 0 :this.jvDtagFeedInd.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndPo == null)? 0 :this.apprOverrideIndPo.hashCode()));
        result = ((result* 31)+((this.acctCodeCoasDueTo == null)? 0 :this.acctCodeCoasDueTo.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndDcr == null)? 0 :this.apprOverrideIndDcr.hashCode()));
        result = ((result* 31)+((this.statusDescription == null)? 0 :this.statusDescription.hashCode()));
        result = ((result* 31)+((this.acctDueFrmTitle == null)? 0 :this.acctDueFrmTitle.hashCode()));
        result = ((result* 31)+((this.consolPostInd == null)? 0 :this.consolPostInd.hashCode()));
        result = ((result* 31)+((this.apprOverrideIndEnc == null)? 0 :this.apprOverrideIndEnc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemControlMaintenance100PutResponse) == false) {
            return false;
        }
        SystemControlMaintenance100PutResponse rhs = ((SystemControlMaintenance100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.apprOverrideIndInv == rhs.apprOverrideIndInv)||((this.apprOverrideIndInv!= null)&&this.apprOverrideIndInv.equals(rhs.apprOverrideIndInv)))&&((this.poRcvdAmount == rhs.poRcvdAmount)||((this.poRcvdAmount!= null)&&this.poRcvdAmount.equals(rhs.poRcvdAmount))))&&((this.ruclSecurityInd == rhs.ruclSecurityInd)||((this.ruclSecurityInd!= null)&&this.ruclSecurityInd.equals(rhs.ruclSecurityInd))))&&((this.acctDueToTitle == rhs.acctDueToTitle)||((this.acctDueToTitle!= null)&&this.acctDueToTitle.equals(rhs.acctDueToTitle))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.docLvlMatchInd == rhs.docLvlMatchInd)||((this.docLvlMatchInd!= null)&&this.docLvlMatchInd.equals(rhs.docLvlMatchInd))))&&((this.ftvtgrpTgrpTitle == rhs.ftvtgrpTgrpTitle)||((this.ftvtgrpTgrpTitle!= null)&&this.ftvtgrpTgrpTitle.equals(rhs.ftvtgrpTgrpTitle))))&&((this.fundOrgSecurityInd == rhs.fundOrgSecurityInd)||((this.fundOrgSecurityInd!= null)&&this.fundOrgSecurityInd.equals(rhs.fundOrgSecurityInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.acctCodeCoasDueFrm == rhs.acctCodeCoasDueFrm)||((this.acctCodeCoasDueFrm!= null)&&this.acctCodeCoasDueFrm.equals(rhs.acctCodeCoasDueFrm))))&&((this.apprOverrideIndFa == rhs.apprOverrideIndFa)||((this.apprOverrideIndFa!= null)&&this.apprOverrideIndFa.equals(rhs.apprOverrideIndFa))))&&((this.dfrGrntHistInd == rhs.dfrGrntHistInd)||((this.dfrGrntHistInd!= null)&&this.dfrGrntHistInd.equals(rhs.dfrGrntHistInd))))&&((this.encNsfOnOffInd == rhs.encNsfOnOffInd)||((this.encNsfOnOffInd!= null)&&this.encNsfOnOffInd.equals(rhs.encNsfOnOffInd))))&&((this.feedCode == rhs.feedCode)||((this.feedCode!= null)&&this.feedCode.equals(rhs.feedCode))))&&((this.minAssetCapAmt == rhs.minAssetCapAmt)||((this.minAssetCapAmt!= null)&&this.minAssetCapAmt.equals(rhs.minAssetCapAmt))))&&((this.invoiceRcvdAmt == rhs.invoiceRcvdAmt)||((this.invoiceRcvdAmt!= null)&&this.invoiceRcvdAmt.equals(rhs.invoiceRcvdAmt))))&&((this.apprOverrideIndJv == rhs.apprOverrideIndJv)||((this.apprOverrideIndJv!= null)&&this.apprOverrideIndJv.equals(rhs.apprOverrideIndJv))))&&((this.tgrpCodeDefault == rhs.tgrpCodeDefault)||((this.tgrpCodeDefault!= null)&&this.tgrpCodeDefault.equals(rhs.tgrpCodeDefault))))&&((this.reqRcvdAmount == rhs.reqRcvdAmount)||((this.reqRcvdAmount!= null)&&this.reqRcvdAmount.equals(rhs.reqRcvdAmount))))&&((this.deferGrantInd == rhs.deferGrantInd)||((this.deferGrantInd!= null)&&this.deferGrantInd.equals(rhs.deferGrantInd))))&&((this.faNsfOnOffInd == rhs.faNsfOnOffInd)||((this.faNsfOnOffInd!= null)&&this.faNsfOnOffInd.equals(rhs.faNsfOnOffInd))))&&((this.taxProcessingInd == rhs.taxProcessingInd)||((this.taxProcessingInd!= null)&&this.taxProcessingInd.equals(rhs.taxProcessingInd))))&&((this.multipleFbAcctInd == rhs.multipleFbAcctInd)||((this.multipleFbAcctInd!= null)&&this.multipleFbAcctInd.equals(rhs.multipleFbAcctInd))))&&((this.taxOverrideAmt == rhs.taxOverrideAmt)||((this.taxOverrideAmt!= null)&&this.taxOverrideAmt.equals(rhs.taxOverrideAmt))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.wbudInd == rhs.wbudInd)||((this.wbudInd!= null)&&this.wbudInd.equals(rhs.wbudInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.apprOverrideIndReq == rhs.apprOverrideIndReq)||((this.apprOverrideIndReq!= null)&&this.apprOverrideIndReq.equals(rhs.apprOverrideIndReq))))&&((this.jvNsfOnOffInd == rhs.jvNsfOnOffInd)||((this.jvNsfOnOffInd!= null)&&this.jvNsfOnOffInd.equals(rhs.jvNsfOnOffInd))))&&((this.poNsfOnOffInd == rhs.poNsfOnOffInd)||((this.poNsfOnOffInd!= null)&&this.poNsfOnOffInd.equals(rhs.poNsfOnOffInd))))&&((this.invNsfOnOffInd == rhs.invNsfOnOffInd)||((this.invNsfOnOffInd!= null)&&this.invNsfOnOffInd.equals(rhs.invNsfOnOffInd))))&&((this.dcsrDtagFeedInd == rhs.dcsrDtagFeedInd)||((this.dcsrDtagFeedInd!= null)&&this.dcsrDtagFeedInd.equals(rhs.dcsrDtagFeedInd))))&&((this.reqNsfOnOffInd == rhs.reqNsfOnOffInd)||((this.reqNsfOnOffInd!= null)&&this.reqNsfOnOffInd.equals(rhs.reqNsfOnOffInd))))&&((this.apprOverrideIndCo == rhs.apprOverrideIndCo)||((this.apprOverrideIndCo!= null)&&this.apprOverrideIndCo.equals(rhs.apprOverrideIndCo))))&&((this.taxOverridePct == rhs.taxOverridePct)||((this.taxOverridePct!= null)&&this.taxOverridePct.equals(rhs.taxOverridePct))))&&((this.icCsOrderInd == rhs.icCsOrderInd)||((this.icCsOrderInd!= null)&&this.icCsOrderInd.equals(rhs.icCsOrderInd))))&&((this.nchgDate == rhs.nchgDate)||((this.nchgDate!= null)&&this.nchgDate.equals(rhs.nchgDate))))&&((this.wbudTrackInd == rhs.wbudTrackInd)||((this.wbudTrackInd!= null)&&this.wbudTrackInd.equals(rhs.wbudTrackInd))))&&((this.issNsfOnOffInd == rhs.issNsfOnOffInd)||((this.issNsfOnOffInd!= null)&&this.issNsfOnOffInd.equals(rhs.issNsfOnOffInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.federalEmployerId == rhs.federalEmployerId)||((this.federalEmployerId!= null)&&this.federalEmployerId.equals(rhs.federalEmployerId))))&&((this.autoBuyrInd == rhs.autoBuyrInd)||((this.autoBuyrInd!= null)&&this.autoBuyrInd.equals(rhs.autoBuyrInd))))&&((this.issuDtagFeedInd == rhs.issuDtagFeedInd)||((this.issuDtagFeedInd!= null)&&this.issuDtagFeedInd.equals(rhs.issuDtagFeedInd))))&&((this.dcrNsfOnOffInd == rhs.dcrNsfOnOffInd)||((this.dcrNsfOnOffInd!= null)&&this.dcrNsfOnOffInd.equals(rhs.dcrNsfOnOffInd))))&&((this.jvDtagFeedInd == rhs.jvDtagFeedInd)||((this.jvDtagFeedInd!= null)&&this.jvDtagFeedInd.equals(rhs.jvDtagFeedInd))))&&((this.apprOverrideIndPo == rhs.apprOverrideIndPo)||((this.apprOverrideIndPo!= null)&&this.apprOverrideIndPo.equals(rhs.apprOverrideIndPo))))&&((this.acctCodeCoasDueTo == rhs.acctCodeCoasDueTo)||((this.acctCodeCoasDueTo!= null)&&this.acctCodeCoasDueTo.equals(rhs.acctCodeCoasDueTo))))&&((this.apprOverrideIndDcr == rhs.apprOverrideIndDcr)||((this.apprOverrideIndDcr!= null)&&this.apprOverrideIndDcr.equals(rhs.apprOverrideIndDcr))))&&((this.statusDescription == rhs.statusDescription)||((this.statusDescription!= null)&&this.statusDescription.equals(rhs.statusDescription))))&&((this.acctDueFrmTitle == rhs.acctDueFrmTitle)||((this.acctDueFrmTitle!= null)&&this.acctDueFrmTitle.equals(rhs.acctDueFrmTitle))))&&((this.consolPostInd == rhs.consolPostInd)||((this.consolPostInd!= null)&&this.consolPostInd.equals(rhs.consolPostInd))))&&((this.apprOverrideIndEnc == rhs.apprOverrideIndEnc)||((this.apprOverrideIndEnc!= null)&&this.apprOverrideIndEnc.equals(rhs.apprOverrideIndEnc))));
    }

}
