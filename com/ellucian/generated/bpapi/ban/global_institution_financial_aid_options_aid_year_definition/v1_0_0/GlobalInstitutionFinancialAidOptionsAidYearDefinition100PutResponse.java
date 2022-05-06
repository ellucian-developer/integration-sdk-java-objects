
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_aid_year_definition.v1_0_0;

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
    "reschedDisbDateInd",
    "tgrpCode",
    "displayEnrRulesDefault",
    "enrrRemedDefault",
    "periodEnabled",
    "updLockedAwardInd",
    "dfltMsgExpDays",
    "trstCodeEst",
    "displayXesHeader",
    "enrrRepeatNoDefault",
    "statusInd",
    "xesAlgoCodeAidy",
    "aidyStartYear",
    "applDateInd",
    "infoAccessInd",
    "baninasInstalledInd",
    "remedialAlgoCode",
    "methodInd",
    "saprCode",
    "calcPcFm",
    "xesAidy",
    "aidyDesc",
    "currentTermCode",
    "infcCode",
    "availOfferOnlyInd",
    "remedialLimit",
    "pivotDate",
    "ctryCodePhone",
    "displayYrInCollege",
    "finaidDirName",
    "archiveDate",
    "aprdAlgoCodeDef",
    "enrrRemedNoDefault",
    "saprCodeExcept",
    "treqCodeAppl",
    "pbgpCode",
    "createRobusdfInd",
    "currentPeriod",
    "retentionExpiredInd",
    "aprdCodeDef",
    "aidyEndYear",
    "fmImFlg",
    "enrrInPgrmDefault",
    "finaidDirPhoneNo",
    "termCodeSap",
    "applDateSource",
    "xesPrds",
    "retentionDate",
    "budgDurFm",
    "yrInColAlgoCde",
    "createRobnyudInd",
    "xesAlgoCodePrds",
    "bgrpCode",
    "finaidDirPhoneArea",
    "fmCodeInstalledInd",
    "aidyEndDate",
    "enrrEslDefault",
    "enrrRepeatDefault",
    "periodBudgetEnabled",
    "intlInd",
    "pgrpCode",
    "aidyStartDate"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse {

    /**
     * Rescheduled Disbursement Date
     * <p>
     * Lineage reference object : ROBINST_RESCHED_DISB_DATE_IND
     * 
     */
    @JsonProperty("reschedDisbDateInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_RESCHED_DISB_DATE_IND")
    private String reschedDisbDateInd;
    /**
     * Tracking Group
     * <p>
     * Lineage reference object : ROBINST_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * (Required)
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TGRP_CODE, Lookup lineage reference object : rtvtgrp")
    private String tgrpCode;
    @JsonProperty("displayEnrRulesDefault")
    private String displayEnrRulesDefault;
    /**
     * Remedial Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_DEFAULT
     * 
     */
    @JsonProperty("enrrRemedDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_REMED_DEFAULT")
    private String enrrRemedDefault;
    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PERIOD_ENABLED")
    private String periodEnabled;
    /**
     * Allow Award Status Updates When Locked
     * <p>
     * Lineage reference object : ROBINST_UPD_LOCKED_AWARD_IND
     * 
     */
    @JsonProperty("updLockedAwardInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_UPD_LOCKED_AWARD_IND")
    private String updLockedAwardInd;
    /**
     * Message Expiration Days
     * <p>
     * Lineage reference object : ROBINST_DFLT_MSG_EXP_DAYS
     * 
     */
    @JsonProperty("dfltMsgExpDays")
    @JsonPropertyDescription("Lineage reference object : ROBINST_DFLT_MSG_EXP_DAYS")
    private Double dfltMsgExpDays;
    /**
     * Tracking Established Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EST, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCodeEst")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TRST_CODE_EST, Lookup lineage reference object : rtvtrst")
    private String trstCodeEst;
    @JsonProperty("displayXesHeader")
    private String displayXesHeader;
    /**
     * Repeat No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRepeatNoDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_REPEAT_NO_DEFAULT")
    private Double enrrRepeatNoDefault;
    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_STATUS_IND")
    private String statusInd;
    /**
     * Aid Year Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_AIDY, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodeAidy")
    @JsonPropertyDescription("Lineage reference object : ROBINST_XES_ALGO_CODE_AIDY, Lookup lineage reference object : rtvalgo,roralgo")
    private String xesAlgoCodeAidy;
    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_START_YEAR")
    private Double aidyStartYear;
    /**
     * Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("applDateInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_APPL_DATE_IND")
    private String applDateInd;
    /**
     * Information Access Indicator
     * <p>
     * Lineage reference object : ROBINST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * IM/EFM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_BANINAS_INSTALLED_IND
     * 
     */
    @JsonProperty("baninasInstalledInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_BANINAS_INSTALLED_IND")
    private String baninasInstalledInd;
    /**
     * Remedial Limit Rule Code
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("remedialAlgoCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_REMEDIAL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo")
    private String remedialAlgoCode;
    /**
     * Methodology
     * <p>
     * Lineage reference object : ROBINST_METHOD_IND
     * 
     */
    @JsonProperty("methodInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_METHOD_IND")
    private String methodInd;
    /**
     * Initial SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_SAPR_CODE, Lookup lineage reference object : rtvsapr")
    private String saprCode;
    /**
     * Calculate FM PC for Independent Student
     * <p>
     * Lineage reference object : ROBINST_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CALC_PC_FM")
    private String calcPcFm;
    /**
     * Aid Year Status
     * <p>
     * Lineage reference object : ROBINST_XES_AIDY
     * 
     */
    @JsonProperty("xesAidy")
    @JsonPropertyDescription("Lineage reference object : ROBINST_XES_AIDY")
    private String xesAidy;
    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_DESC")
    private String aidyDesc;
    /**
     * Current Term Code
     * <p>
     * Lineage reference object : ROBINST_CURRENT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("currentTermCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CURRENT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String currentTermCode;
    /**
     * Primary Application Source
     * <p>
     * Lineage reference object : ROBINST_INFC_CODE, Lookup lineage reference object : rtvinfc
     * (Required)
     * 
     */
    @JsonProperty("infcCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_INFC_CODE, Lookup lineage reference object : rtvinfc")
    private String infcCode;
    /**
     * Use Only Offered to Calculate Available to Offer
     * <p>
     * Lineage reference object : ROBINST_AVAIL_OFFER_ONLY_IND
     * 
     */
    @JsonProperty("availOfferOnlyInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AVAIL_OFFER_ONLY_IND")
    private String availOfferOnlyInd;
    /**
     * Remedial Limit
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("remedialLimit")
    @JsonPropertyDescription("Lineage reference object : ROBINST_REMEDIAL_LIMIT")
    private Double remedialLimit;
    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PIVOT_DATE")
    private Date pivotDate;
    /**
     * Country Code
     * <p>
     * Lineage reference object : ROBINST_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    @JsonProperty("displayYrInCollege")
    private String displayYrInCollege;
    /**
     * Financial Aid Director Name
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_NAME
     * 
     */
    @JsonProperty("finaidDirName")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FINAID_DIR_NAME")
    private String finaidDirName;
    /**
     * Archive Date
     * <p>
     * Lineage reference object : ROBINST_ARCHIVE_DATE
     * 
     */
    @JsonProperty("archiveDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ARCHIVE_DATE")
    private Date archiveDate;
    /**
     * Default Aid Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_APRD_ALGO_CODE_DEF, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("aprdAlgoCodeDef")
    @JsonPropertyDescription("Lineage reference object : ROBINST_APRD_ALGO_CODE_DEF, Lookup lineage reference object : rtvalgo,roralgo")
    private String aprdAlgoCodeDef;
    /**
     * Remedial No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRemedNoDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_REMED_NO_DEFAULT")
    private Double enrrRemedNoDefault;
    /**
     * Exception SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE_EXCEPT, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCodeExcept")
    @JsonPropertyDescription("Lineage reference object : ROBINST_SAPR_CODE_EXCEPT, Lookup lineage reference object : rtvsapr")
    private String saprCodeExcept;
    /**
     * Application Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_APPL
     * 
     */
    @JsonProperty("treqCodeAppl")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TREQ_CODE_APPL")
    private String treqCodeAppl;
    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_PBGP_CODE, Lookup lineage reference object : RTVPBGP
     * 
     */
    @JsonProperty("pbgpCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PBGP_CODE, Lookup lineage reference object : RTVPBGP")
    private String pbgpCode;
    /**
     * Create Applicant User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBUSDF_IND
     * 
     */
    @JsonProperty("createRobusdfInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CREATE_ROBUSDF_IND")
    private String createRobusdfInd;
    /**
     * Current Period
     * <p>
     * Lineage reference object : ROBINST_CURRENT_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("currentPeriod")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CURRENT_PERIOD, Lookup lineage reference object : robprds")
    private String currentPeriod;
    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_RETENTION_EXPIRED_IND")
    private String retentionExpiredInd;
    /**
     * Default Aid Period
     * <p>
     * Lineage reference object : ROBINST_APRD_CODE_DEF, Lookup lineage reference object : rtvaprd
     * (Required)
     * 
     */
    @JsonProperty("aprdCodeDef")
    @JsonPropertyDescription("Lineage reference object : ROBINST_APRD_CODE_DEF, Lookup lineage reference object : rtvaprd")
    private String aprdCodeDef;
    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_END_YEAR")
    private Double aidyEndYear;
    /**
     * Need Analysis Calculation Option
     * <p>
     * Lineage reference object : ROBINST_FM_IM_FLG
     * 
     */
    @JsonProperty("fmImFlg")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FM_IM_FLG")
    private String fmImFlg;
    /**
     * Courses in Program
     * <p>
     * Lineage reference object : ROBINST_ENRR_IN_PGRM_DEFAULT
     * 
     */
    @JsonProperty("enrrInPgrmDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_IN_PGRM_DEFAULT")
    private String enrrInPgrmDefault;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_NO
     * 
     */
    @JsonProperty("finaidDirPhoneNo")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FINAID_DIR_PHONE_NO")
    private String finaidDirPhoneNo;
    /**
     * Initial SAP Term Code
     * <p>
     * Lineage reference object : ROBINST_TERM_CODE_SAP, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSap")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TERM_CODE_SAP, Lookup lineage reference object : stvterm")
    private String termCodeSap;
    /**
     * Source for Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_SOURCE
     * 
     */
    @JsonProperty("applDateSource")
    @JsonPropertyDescription("Lineage reference object : ROBINST_APPL_DATE_SOURCE")
    private String applDateSource;
    /**
     * Period Status
     * <p>
     * Lineage reference object : ROBINST_XES_PRDS
     * 
     */
    @JsonProperty("xesPrds")
    @JsonPropertyDescription("Lineage reference object : ROBINST_XES_PRDS")
    private String xesPrds;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : ROBINST_RETENTION_DATE
     * 
     */
    @JsonProperty("retentionDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_RETENTION_DATE")
    private Date retentionDate;
    /**
     * Default FM Budget Duration
     * <p>
     * Lineage reference object : ROBINST_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    @JsonPropertyDescription("Lineage reference object : ROBINST_BUDG_DUR_FM")
    private Double budgDurFm;
    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_YR_IN_COLL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("yrInColAlgoCde")
    @JsonPropertyDescription("Lineage reference object : ROBINST_YR_IN_COLL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo")
    private String yrInColAlgoCde;
    /**
     * Create Applicant Non Year User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBNYUD_IND
     * 
     */
    @JsonProperty("createRobnyudInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_CREATE_ROBNYUD_IND")
    private String createRobnyudInd;
    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_PRDS, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodePrds")
    @JsonPropertyDescription("Lineage reference object : ROBINST_XES_ALGO_CODE_PRDS, Lookup lineage reference object : rtvalgo,roralgo")
    private String xesAlgoCodePrds;
    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_BGRP_CODE, Lookup lineage reference object : rtvbgrp
     * (Required)
     * 
     */
    @JsonProperty("bgrpCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_BGRP_CODE, Lookup lineage reference object : rtvbgrp")
    private String bgrpCode;
    /**
     * Area Code
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_AREA
     * 
     */
    @JsonProperty("finaidDirPhoneArea")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FINAID_DIR_PHONE_AREA")
    private String finaidDirPhoneArea;
    /**
     * Banner FM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_FM_CODE_INSTALLED_IND
     * 
     */
    @JsonProperty("fmCodeInstalledInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FM_CODE_INSTALLED_IND")
    private String fmCodeInstalledInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_END_DATE")
    private Date aidyEndDate;
    /**
     * ESL Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_ESL_DEFAULT
     * 
     */
    @JsonProperty("enrrEslDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_ESL_DEFAULT")
    private String enrrEslDefault;
    /**
     * Repeat Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_DEFAULT
     * 
     */
    @JsonProperty("enrrRepeatDefault")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENRR_REPEAT_DEFAULT")
    private String enrrRepeatDefault;
    /**
     * Period Budgeting Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_BUDGET_ENABLED
     * 
     */
    @JsonProperty("periodBudgetEnabled")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PERIOD_BUDGET_ENABLED")
    private String periodBudgetEnabled;
    /**
     * International
     * <p>
     * Lineage reference object : ROBINST_INTL_IND
     * 
     */
    @JsonProperty("intlInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_INTL_IND")
    private String intlInd;
    /**
     * Packaging Group
     * <p>
     * Lineage reference object : ROBINST_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * (Required)
     * 
     */
    @JsonProperty("pgrpCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PGRP_CODE, Lookup lineage reference object : rtvpgrp")
    private String pgrpCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    @JsonPropertyDescription("Lineage reference object : ROBINST_AIDY_START_DATE")
    private Date aidyStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Rescheduled Disbursement Date
     * <p>
     * Lineage reference object : ROBINST_RESCHED_DISB_DATE_IND
     * 
     */
    @JsonProperty("reschedDisbDateInd")
    public String getReschedDisbDateInd() {
        return reschedDisbDateInd;
    }

    /**
     * Rescheduled Disbursement Date
     * <p>
     * Lineage reference object : ROBINST_RESCHED_DISB_DATE_IND
     * 
     */
    @JsonProperty("reschedDisbDateInd")
    public void setReschedDisbDateInd(String reschedDisbDateInd) {
        this.reschedDisbDateInd = reschedDisbDateInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withReschedDisbDateInd(String reschedDisbDateInd) {
        this.reschedDisbDateInd = reschedDisbDateInd;
        return this;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : ROBINST_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * (Required)
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : ROBINST_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * (Required)
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    @JsonProperty("displayEnrRulesDefault")
    public String getDisplayEnrRulesDefault() {
        return displayEnrRulesDefault;
    }

    @JsonProperty("displayEnrRulesDefault")
    public void setDisplayEnrRulesDefault(String displayEnrRulesDefault) {
        this.displayEnrRulesDefault = displayEnrRulesDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withDisplayEnrRulesDefault(String displayEnrRulesDefault) {
        this.displayEnrRulesDefault = displayEnrRulesDefault;
        return this;
    }

    /**
     * Remedial Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_DEFAULT
     * 
     */
    @JsonProperty("enrrRemedDefault")
    public String getEnrrRemedDefault() {
        return enrrRemedDefault;
    }

    /**
     * Remedial Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_DEFAULT
     * 
     */
    @JsonProperty("enrrRemedDefault")
    public void setEnrrRemedDefault(String enrrRemedDefault) {
        this.enrrRemedDefault = enrrRemedDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrRemedDefault(String enrrRemedDefault) {
        this.enrrRemedDefault = enrrRemedDefault;
        return this;
    }

    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    public String getPeriodEnabled() {
        return periodEnabled;
    }

    /**
     * Periods Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_ENABLED
     * 
     */
    @JsonProperty("periodEnabled")
    public void setPeriodEnabled(String periodEnabled) {
        this.periodEnabled = periodEnabled;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withPeriodEnabled(String periodEnabled) {
        this.periodEnabled = periodEnabled;
        return this;
    }

    /**
     * Allow Award Status Updates When Locked
     * <p>
     * Lineage reference object : ROBINST_UPD_LOCKED_AWARD_IND
     * 
     */
    @JsonProperty("updLockedAwardInd")
    public String getUpdLockedAwardInd() {
        return updLockedAwardInd;
    }

    /**
     * Allow Award Status Updates When Locked
     * <p>
     * Lineage reference object : ROBINST_UPD_LOCKED_AWARD_IND
     * 
     */
    @JsonProperty("updLockedAwardInd")
    public void setUpdLockedAwardInd(String updLockedAwardInd) {
        this.updLockedAwardInd = updLockedAwardInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withUpdLockedAwardInd(String updLockedAwardInd) {
        this.updLockedAwardInd = updLockedAwardInd;
        return this;
    }

    /**
     * Message Expiration Days
     * <p>
     * Lineage reference object : ROBINST_DFLT_MSG_EXP_DAYS
     * 
     */
    @JsonProperty("dfltMsgExpDays")
    public Double getDfltMsgExpDays() {
        return dfltMsgExpDays;
    }

    /**
     * Message Expiration Days
     * <p>
     * Lineage reference object : ROBINST_DFLT_MSG_EXP_DAYS
     * 
     */
    @JsonProperty("dfltMsgExpDays")
    public void setDfltMsgExpDays(Double dfltMsgExpDays) {
        this.dfltMsgExpDays = dfltMsgExpDays;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withDfltMsgExpDays(Double dfltMsgExpDays) {
        this.dfltMsgExpDays = dfltMsgExpDays;
        return this;
    }

    /**
     * Tracking Established Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EST, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCodeEst")
    public String getTrstCodeEst() {
        return trstCodeEst;
    }

    /**
     * Tracking Established Status
     * <p>
     * Lineage reference object : ROBINST_TRST_CODE_EST, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCodeEst")
    public void setTrstCodeEst(String trstCodeEst) {
        this.trstCodeEst = trstCodeEst;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withTrstCodeEst(String trstCodeEst) {
        this.trstCodeEst = trstCodeEst;
        return this;
    }

    @JsonProperty("displayXesHeader")
    public String getDisplayXesHeader() {
        return displayXesHeader;
    }

    @JsonProperty("displayXesHeader")
    public void setDisplayXesHeader(String displayXesHeader) {
        this.displayXesHeader = displayXesHeader;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withDisplayXesHeader(String displayXesHeader) {
        this.displayXesHeader = displayXesHeader;
        return this;
    }

    /**
     * Repeat No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRepeatNoDefault")
    public Double getEnrrRepeatNoDefault() {
        return enrrRepeatNoDefault;
    }

    /**
     * Repeat No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRepeatNoDefault")
    public void setEnrrRepeatNoDefault(Double enrrRepeatNoDefault) {
        this.enrrRepeatNoDefault = enrrRepeatNoDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrRepeatNoDefault(Double enrrRepeatNoDefault) {
        this.enrrRepeatNoDefault = enrrRepeatNoDefault;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : ROBINST_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Aid Year Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_AIDY, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodeAidy")
    public String getXesAlgoCodeAidy() {
        return xesAlgoCodeAidy;
    }

    /**
     * Aid Year Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_AIDY, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodeAidy")
    public void setXesAlgoCodeAidy(String xesAlgoCodeAidy) {
        this.xesAlgoCodeAidy = xesAlgoCodeAidy;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withXesAlgoCodeAidy(String xesAlgoCodeAidy) {
        this.xesAlgoCodeAidy = xesAlgoCodeAidy;
        return this;
    }

    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    public Double getAidyStartYear() {
        return aidyStartYear;
    }

    /**
     * Start Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyStartYear")
    public void setAidyStartYear(Double aidyStartYear) {
        this.aidyStartYear = aidyStartYear;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAidyStartYear(Double aidyStartYear) {
        this.aidyStartYear = aidyStartYear;
        return this;
    }

    /**
     * Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("applDateInd")
    public String getApplDateInd() {
        return applDateInd;
    }

    /**
     * Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("applDateInd")
    public void setApplDateInd(String applDateInd) {
        this.applDateInd = applDateInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withApplDateInd(String applDateInd) {
        this.applDateInd = applDateInd;
        return this;
    }

    /**
     * Information Access Indicator
     * <p>
     * Lineage reference object : ROBINST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Information Access Indicator
     * <p>
     * Lineage reference object : ROBINST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * IM/EFM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_BANINAS_INSTALLED_IND
     * 
     */
    @JsonProperty("baninasInstalledInd")
    public String getBaninasInstalledInd() {
        return baninasInstalledInd;
    }

    /**
     * IM/EFM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_BANINAS_INSTALLED_IND
     * 
     */
    @JsonProperty("baninasInstalledInd")
    public void setBaninasInstalledInd(String baninasInstalledInd) {
        this.baninasInstalledInd = baninasInstalledInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withBaninasInstalledInd(String baninasInstalledInd) {
        this.baninasInstalledInd = baninasInstalledInd;
        return this;
    }

    /**
     * Remedial Limit Rule Code
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("remedialAlgoCode")
    public String getRemedialAlgoCode() {
        return remedialAlgoCode;
    }

    /**
     * Remedial Limit Rule Code
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("remedialAlgoCode")
    public void setRemedialAlgoCode(String remedialAlgoCode) {
        this.remedialAlgoCode = remedialAlgoCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withRemedialAlgoCode(String remedialAlgoCode) {
        this.remedialAlgoCode = remedialAlgoCode;
        return this;
    }

    /**
     * Methodology
     * <p>
     * Lineage reference object : ROBINST_METHOD_IND
     * 
     */
    @JsonProperty("methodInd")
    public String getMethodInd() {
        return methodInd;
    }

    /**
     * Methodology
     * <p>
     * Lineage reference object : ROBINST_METHOD_IND
     * 
     */
    @JsonProperty("methodInd")
    public void setMethodInd(String methodInd) {
        this.methodInd = methodInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withMethodInd(String methodInd) {
        this.methodInd = methodInd;
        return this;
    }

    /**
     * Initial SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCode")
    public String getSaprCode() {
        return saprCode;
    }

    /**
     * Initial SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCode")
    public void setSaprCode(String saprCode) {
        this.saprCode = saprCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withSaprCode(String saprCode) {
        this.saprCode = saprCode;
        return this;
    }

    /**
     * Calculate FM PC for Independent Student
     * <p>
     * Lineage reference object : ROBINST_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    public String getCalcPcFm() {
        return calcPcFm;
    }

    /**
     * Calculate FM PC for Independent Student
     * <p>
     * Lineage reference object : ROBINST_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    public void setCalcPcFm(String calcPcFm) {
        this.calcPcFm = calcPcFm;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCalcPcFm(String calcPcFm) {
        this.calcPcFm = calcPcFm;
        return this;
    }

    /**
     * Aid Year Status
     * <p>
     * Lineage reference object : ROBINST_XES_AIDY
     * 
     */
    @JsonProperty("xesAidy")
    public String getXesAidy() {
        return xesAidy;
    }

    /**
     * Aid Year Status
     * <p>
     * Lineage reference object : ROBINST_XES_AIDY
     * 
     */
    @JsonProperty("xesAidy")
    public void setXesAidy(String xesAidy) {
        this.xesAidy = xesAidy;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withXesAidy(String xesAidy) {
        this.xesAidy = xesAidy;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    public String getAidyDesc() {
        return aidyDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : ROBINST_AIDY_DESC
     * (Required)
     * 
     */
    @JsonProperty("aidyDesc")
    public void setAidyDesc(String aidyDesc) {
        this.aidyDesc = aidyDesc;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAidyDesc(String aidyDesc) {
        this.aidyDesc = aidyDesc;
        return this;
    }

    /**
     * Current Term Code
     * <p>
     * Lineage reference object : ROBINST_CURRENT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("currentTermCode")
    public String getCurrentTermCode() {
        return currentTermCode;
    }

    /**
     * Current Term Code
     * <p>
     * Lineage reference object : ROBINST_CURRENT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("currentTermCode")
    public void setCurrentTermCode(String currentTermCode) {
        this.currentTermCode = currentTermCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCurrentTermCode(String currentTermCode) {
        this.currentTermCode = currentTermCode;
        return this;
    }

    /**
     * Primary Application Source
     * <p>
     * Lineage reference object : ROBINST_INFC_CODE, Lookup lineage reference object : rtvinfc
     * (Required)
     * 
     */
    @JsonProperty("infcCode")
    public String getInfcCode() {
        return infcCode;
    }

    /**
     * Primary Application Source
     * <p>
     * Lineage reference object : ROBINST_INFC_CODE, Lookup lineage reference object : rtvinfc
     * (Required)
     * 
     */
    @JsonProperty("infcCode")
    public void setInfcCode(String infcCode) {
        this.infcCode = infcCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withInfcCode(String infcCode) {
        this.infcCode = infcCode;
        return this;
    }

    /**
     * Use Only Offered to Calculate Available to Offer
     * <p>
     * Lineage reference object : ROBINST_AVAIL_OFFER_ONLY_IND
     * 
     */
    @JsonProperty("availOfferOnlyInd")
    public String getAvailOfferOnlyInd() {
        return availOfferOnlyInd;
    }

    /**
     * Use Only Offered to Calculate Available to Offer
     * <p>
     * Lineage reference object : ROBINST_AVAIL_OFFER_ONLY_IND
     * 
     */
    @JsonProperty("availOfferOnlyInd")
    public void setAvailOfferOnlyInd(String availOfferOnlyInd) {
        this.availOfferOnlyInd = availOfferOnlyInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAvailOfferOnlyInd(String availOfferOnlyInd) {
        this.availOfferOnlyInd = availOfferOnlyInd;
        return this;
    }

    /**
     * Remedial Limit
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("remedialLimit")
    public Double getRemedialLimit() {
        return remedialLimit;
    }

    /**
     * Remedial Limit
     * <p>
     * Lineage reference object : ROBINST_REMEDIAL_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("remedialLimit")
    public void setRemedialLimit(Double remedialLimit) {
        this.remedialLimit = remedialLimit;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withRemedialLimit(Double remedialLimit) {
        this.remedialLimit = remedialLimit;
        return this;
    }

    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    public Date getPivotDate() {
        return pivotDate;
    }

    /**
     * Pivot
     * <p>
     * Lineage reference object : ROBINST_PIVOT_DATE
     * (Required)
     * 
     */
    @JsonProperty("pivotDate")
    public void setPivotDate(Date pivotDate) {
        this.pivotDate = pivotDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withPivotDate(Date pivotDate) {
        this.pivotDate = pivotDate;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : ROBINST_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : ROBINST_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    @JsonProperty("displayYrInCollege")
    public String getDisplayYrInCollege() {
        return displayYrInCollege;
    }

    @JsonProperty("displayYrInCollege")
    public void setDisplayYrInCollege(String displayYrInCollege) {
        this.displayYrInCollege = displayYrInCollege;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withDisplayYrInCollege(String displayYrInCollege) {
        this.displayYrInCollege = displayYrInCollege;
        return this;
    }

    /**
     * Financial Aid Director Name
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_NAME
     * 
     */
    @JsonProperty("finaidDirName")
    public String getFinaidDirName() {
        return finaidDirName;
    }

    /**
     * Financial Aid Director Name
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_NAME
     * 
     */
    @JsonProperty("finaidDirName")
    public void setFinaidDirName(String finaidDirName) {
        this.finaidDirName = finaidDirName;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withFinaidDirName(String finaidDirName) {
        this.finaidDirName = finaidDirName;
        return this;
    }

    /**
     * Archive Date
     * <p>
     * Lineage reference object : ROBINST_ARCHIVE_DATE
     * 
     */
    @JsonProperty("archiveDate")
    public Date getArchiveDate() {
        return archiveDate;
    }

    /**
     * Archive Date
     * <p>
     * Lineage reference object : ROBINST_ARCHIVE_DATE
     * 
     */
    @JsonProperty("archiveDate")
    public void setArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
        return this;
    }

    /**
     * Default Aid Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_APRD_ALGO_CODE_DEF, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("aprdAlgoCodeDef")
    public String getAprdAlgoCodeDef() {
        return aprdAlgoCodeDef;
    }

    /**
     * Default Aid Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_APRD_ALGO_CODE_DEF, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("aprdAlgoCodeDef")
    public void setAprdAlgoCodeDef(String aprdAlgoCodeDef) {
        this.aprdAlgoCodeDef = aprdAlgoCodeDef;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAprdAlgoCodeDef(String aprdAlgoCodeDef) {
        this.aprdAlgoCodeDef = aprdAlgoCodeDef;
        return this;
    }

    /**
     * Remedial No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRemedNoDefault")
    public Double getEnrrRemedNoDefault() {
        return enrrRemedNoDefault;
    }

    /**
     * Remedial No Default
     * <p>
     * Lineage reference object : ROBINST_ENRR_REMED_NO_DEFAULT
     * (Required)
     * 
     */
    @JsonProperty("enrrRemedNoDefault")
    public void setEnrrRemedNoDefault(Double enrrRemedNoDefault) {
        this.enrrRemedNoDefault = enrrRemedNoDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrRemedNoDefault(Double enrrRemedNoDefault) {
        this.enrrRemedNoDefault = enrrRemedNoDefault;
        return this;
    }

    /**
     * Exception SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE_EXCEPT, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCodeExcept")
    public String getSaprCodeExcept() {
        return saprCodeExcept;
    }

    /**
     * Exception SAP Status
     * <p>
     * Lineage reference object : ROBINST_SAPR_CODE_EXCEPT, Lookup lineage reference object : rtvsapr
     * (Required)
     * 
     */
    @JsonProperty("saprCodeExcept")
    public void setSaprCodeExcept(String saprCodeExcept) {
        this.saprCodeExcept = saprCodeExcept;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withSaprCodeExcept(String saprCodeExcept) {
        this.saprCodeExcept = saprCodeExcept;
        return this;
    }

    /**
     * Application Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_APPL
     * 
     */
    @JsonProperty("treqCodeAppl")
    public String getTreqCodeAppl() {
        return treqCodeAppl;
    }

    /**
     * Application Requirement Code
     * <p>
     * Lineage reference object : ROBINST_TREQ_CODE_APPL
     * 
     */
    @JsonProperty("treqCodeAppl")
    public void setTreqCodeAppl(String treqCodeAppl) {
        this.treqCodeAppl = treqCodeAppl;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withTreqCodeAppl(String treqCodeAppl) {
        this.treqCodeAppl = treqCodeAppl;
        return this;
    }

    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_PBGP_CODE, Lookup lineage reference object : RTVPBGP
     * 
     */
    @JsonProperty("pbgpCode")
    public String getPbgpCode() {
        return pbgpCode;
    }

    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_PBGP_CODE, Lookup lineage reference object : RTVPBGP
     * 
     */
    @JsonProperty("pbgpCode")
    public void setPbgpCode(String pbgpCode) {
        this.pbgpCode = pbgpCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withPbgpCode(String pbgpCode) {
        this.pbgpCode = pbgpCode;
        return this;
    }

    /**
     * Create Applicant User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBUSDF_IND
     * 
     */
    @JsonProperty("createRobusdfInd")
    public String getCreateRobusdfInd() {
        return createRobusdfInd;
    }

    /**
     * Create Applicant User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBUSDF_IND
     * 
     */
    @JsonProperty("createRobusdfInd")
    public void setCreateRobusdfInd(String createRobusdfInd) {
        this.createRobusdfInd = createRobusdfInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCreateRobusdfInd(String createRobusdfInd) {
        this.createRobusdfInd = createRobusdfInd;
        return this;
    }

    /**
     * Current Period
     * <p>
     * Lineage reference object : ROBINST_CURRENT_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("currentPeriod")
    public String getCurrentPeriod() {
        return currentPeriod;
    }

    /**
     * Current Period
     * <p>
     * Lineage reference object : ROBINST_CURRENT_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("currentPeriod")
    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
        return this;
    }

    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    public String getRetentionExpiredInd() {
        return retentionExpiredInd;
    }

    /**
     * Retention Expired
     * <p>
     * Lineage reference object : ROBINST_RETENTION_EXPIRED_IND
     * 
     */
    @JsonProperty("retentionExpiredInd")
    public void setRetentionExpiredInd(String retentionExpiredInd) {
        this.retentionExpiredInd = retentionExpiredInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withRetentionExpiredInd(String retentionExpiredInd) {
        this.retentionExpiredInd = retentionExpiredInd;
        return this;
    }

    /**
     * Default Aid Period
     * <p>
     * Lineage reference object : ROBINST_APRD_CODE_DEF, Lookup lineage reference object : rtvaprd
     * (Required)
     * 
     */
    @JsonProperty("aprdCodeDef")
    public String getAprdCodeDef() {
        return aprdCodeDef;
    }

    /**
     * Default Aid Period
     * <p>
     * Lineage reference object : ROBINST_APRD_CODE_DEF, Lookup lineage reference object : rtvaprd
     * (Required)
     * 
     */
    @JsonProperty("aprdCodeDef")
    public void setAprdCodeDef(String aprdCodeDef) {
        this.aprdCodeDef = aprdCodeDef;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAprdCodeDef(String aprdCodeDef) {
        this.aprdCodeDef = aprdCodeDef;
        return this;
    }

    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    public Double getAidyEndYear() {
        return aidyEndYear;
    }

    /**
     * End Year
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_YEAR
     * (Required)
     * 
     */
    @JsonProperty("aidyEndYear")
    public void setAidyEndYear(Double aidyEndYear) {
        this.aidyEndYear = aidyEndYear;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAidyEndYear(Double aidyEndYear) {
        this.aidyEndYear = aidyEndYear;
        return this;
    }

    /**
     * Need Analysis Calculation Option
     * <p>
     * Lineage reference object : ROBINST_FM_IM_FLG
     * 
     */
    @JsonProperty("fmImFlg")
    public String getFmImFlg() {
        return fmImFlg;
    }

    /**
     * Need Analysis Calculation Option
     * <p>
     * Lineage reference object : ROBINST_FM_IM_FLG
     * 
     */
    @JsonProperty("fmImFlg")
    public void setFmImFlg(String fmImFlg) {
        this.fmImFlg = fmImFlg;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withFmImFlg(String fmImFlg) {
        this.fmImFlg = fmImFlg;
        return this;
    }

    /**
     * Courses in Program
     * <p>
     * Lineage reference object : ROBINST_ENRR_IN_PGRM_DEFAULT
     * 
     */
    @JsonProperty("enrrInPgrmDefault")
    public String getEnrrInPgrmDefault() {
        return enrrInPgrmDefault;
    }

    /**
     * Courses in Program
     * <p>
     * Lineage reference object : ROBINST_ENRR_IN_PGRM_DEFAULT
     * 
     */
    @JsonProperty("enrrInPgrmDefault")
    public void setEnrrInPgrmDefault(String enrrInPgrmDefault) {
        this.enrrInPgrmDefault = enrrInPgrmDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrInPgrmDefault(String enrrInPgrmDefault) {
        this.enrrInPgrmDefault = enrrInPgrmDefault;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_NO
     * 
     */
    @JsonProperty("finaidDirPhoneNo")
    public String getFinaidDirPhoneNo() {
        return finaidDirPhoneNo;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_NO
     * 
     */
    @JsonProperty("finaidDirPhoneNo")
    public void setFinaidDirPhoneNo(String finaidDirPhoneNo) {
        this.finaidDirPhoneNo = finaidDirPhoneNo;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withFinaidDirPhoneNo(String finaidDirPhoneNo) {
        this.finaidDirPhoneNo = finaidDirPhoneNo;
        return this;
    }

    /**
     * Initial SAP Term Code
     * <p>
     * Lineage reference object : ROBINST_TERM_CODE_SAP, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSap")
    public String getTermCodeSap() {
        return termCodeSap;
    }

    /**
     * Initial SAP Term Code
     * <p>
     * Lineage reference object : ROBINST_TERM_CODE_SAP, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSap")
    public void setTermCodeSap(String termCodeSap) {
        this.termCodeSap = termCodeSap;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withTermCodeSap(String termCodeSap) {
        this.termCodeSap = termCodeSap;
        return this;
    }

    /**
     * Source for Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_SOURCE
     * 
     */
    @JsonProperty("applDateSource")
    public String getApplDateSource() {
        return applDateSource;
    }

    /**
     * Source for Application Received Date
     * <p>
     * Lineage reference object : ROBINST_APPL_DATE_SOURCE
     * 
     */
    @JsonProperty("applDateSource")
    public void setApplDateSource(String applDateSource) {
        this.applDateSource = applDateSource;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withApplDateSource(String applDateSource) {
        this.applDateSource = applDateSource;
        return this;
    }

    /**
     * Period Status
     * <p>
     * Lineage reference object : ROBINST_XES_PRDS
     * 
     */
    @JsonProperty("xesPrds")
    public String getXesPrds() {
        return xesPrds;
    }

    /**
     * Period Status
     * <p>
     * Lineage reference object : ROBINST_XES_PRDS
     * 
     */
    @JsonProperty("xesPrds")
    public void setXesPrds(String xesPrds) {
        this.xesPrds = xesPrds;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withXesPrds(String xesPrds) {
        this.xesPrds = xesPrds;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : ROBINST_RETENTION_DATE
     * 
     */
    @JsonProperty("retentionDate")
    public Date getRetentionDate() {
        return retentionDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : ROBINST_RETENTION_DATE
     * 
     */
    @JsonProperty("retentionDate")
    public void setRetentionDate(Date retentionDate) {
        this.retentionDate = retentionDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withRetentionDate(Date retentionDate) {
        this.retentionDate = retentionDate;
        return this;
    }

    /**
     * Default FM Budget Duration
     * <p>
     * Lineage reference object : ROBINST_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    public Double getBudgDurFm() {
        return budgDurFm;
    }

    /**
     * Default FM Budget Duration
     * <p>
     * Lineage reference object : ROBINST_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    public void setBudgDurFm(Double budgDurFm) {
        this.budgDurFm = budgDurFm;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withBudgDurFm(Double budgDurFm) {
        this.budgDurFm = budgDurFm;
        return this;
    }

    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_YR_IN_COLL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("yrInColAlgoCde")
    public String getYrInColAlgoCde() {
        return yrInColAlgoCde;
    }

    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_YR_IN_COLL_ALGO_CODE, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("yrInColAlgoCde")
    public void setYrInColAlgoCde(String yrInColAlgoCde) {
        this.yrInColAlgoCde = yrInColAlgoCde;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withYrInColAlgoCde(String yrInColAlgoCde) {
        this.yrInColAlgoCde = yrInColAlgoCde;
        return this;
    }

    /**
     * Create Applicant Non Year User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBNYUD_IND
     * 
     */
    @JsonProperty("createRobnyudInd")
    public String getCreateRobnyudInd() {
        return createRobnyudInd;
    }

    /**
     * Create Applicant Non Year User-Defined Data
     * <p>
     * Lineage reference object : ROBINST_CREATE_ROBNYUD_IND
     * 
     */
    @JsonProperty("createRobnyudInd")
    public void setCreateRobnyudInd(String createRobnyudInd) {
        this.createRobnyudInd = createRobnyudInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withCreateRobnyudInd(String createRobnyudInd) {
        this.createRobnyudInd = createRobnyudInd;
        return this;
    }

    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_PRDS, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodePrds")
    public String getXesAlgoCodePrds() {
        return xesAlgoCodePrds;
    }

    /**
     * Period Rule Code
     * <p>
     * Lineage reference object : ROBINST_XES_ALGO_CODE_PRDS, Lookup lineage reference object : rtvalgo,roralgo
     * 
     */
    @JsonProperty("xesAlgoCodePrds")
    public void setXesAlgoCodePrds(String xesAlgoCodePrds) {
        this.xesAlgoCodePrds = xesAlgoCodePrds;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withXesAlgoCodePrds(String xesAlgoCodePrds) {
        this.xesAlgoCodePrds = xesAlgoCodePrds;
        return this;
    }

    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_BGRP_CODE, Lookup lineage reference object : rtvbgrp
     * (Required)
     * 
     */
    @JsonProperty("bgrpCode")
    public String getBgrpCode() {
        return bgrpCode;
    }

    /**
     * Budgeting Group
     * <p>
     * Lineage reference object : ROBINST_BGRP_CODE, Lookup lineage reference object : rtvbgrp
     * (Required)
     * 
     */
    @JsonProperty("bgrpCode")
    public void setBgrpCode(String bgrpCode) {
        this.bgrpCode = bgrpCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withBgrpCode(String bgrpCode) {
        this.bgrpCode = bgrpCode;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_AREA
     * 
     */
    @JsonProperty("finaidDirPhoneArea")
    public String getFinaidDirPhoneArea() {
        return finaidDirPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : ROBINST_FINAID_DIR_PHONE_AREA
     * 
     */
    @JsonProperty("finaidDirPhoneArea")
    public void setFinaidDirPhoneArea(String finaidDirPhoneArea) {
        this.finaidDirPhoneArea = finaidDirPhoneArea;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withFinaidDirPhoneArea(String finaidDirPhoneArea) {
        this.finaidDirPhoneArea = finaidDirPhoneArea;
        return this;
    }

    /**
     * Banner FM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_FM_CODE_INSTALLED_IND
     * 
     */
    @JsonProperty("fmCodeInstalledInd")
    public String getFmCodeInstalledInd() {
        return fmCodeInstalledInd;
    }

    /**
     * Banner FM Need Calculation Installed
     * <p>
     * Lineage reference object : ROBINST_FM_CODE_INSTALLED_IND
     * 
     */
    @JsonProperty("fmCodeInstalledInd")
    public void setFmCodeInstalledInd(String fmCodeInstalledInd) {
        this.fmCodeInstalledInd = fmCodeInstalledInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withFmCodeInstalledInd(String fmCodeInstalledInd) {
        this.fmCodeInstalledInd = fmCodeInstalledInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    public Date getAidyEndDate() {
        return aidyEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyEndDate")
    public void setAidyEndDate(Date aidyEndDate) {
        this.aidyEndDate = aidyEndDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAidyEndDate(Date aidyEndDate) {
        this.aidyEndDate = aidyEndDate;
        return this;
    }

    /**
     * ESL Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_ESL_DEFAULT
     * 
     */
    @JsonProperty("enrrEslDefault")
    public String getEnrrEslDefault() {
        return enrrEslDefault;
    }

    /**
     * ESL Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_ESL_DEFAULT
     * 
     */
    @JsonProperty("enrrEslDefault")
    public void setEnrrEslDefault(String enrrEslDefault) {
        this.enrrEslDefault = enrrEslDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrEslDefault(String enrrEslDefault) {
        this.enrrEslDefault = enrrEslDefault;
        return this;
    }

    /**
     * Repeat Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_DEFAULT
     * 
     */
    @JsonProperty("enrrRepeatDefault")
    public String getEnrrRepeatDefault() {
        return enrrRepeatDefault;
    }

    /**
     * Repeat Course Checking
     * <p>
     * Lineage reference object : ROBINST_ENRR_REPEAT_DEFAULT
     * 
     */
    @JsonProperty("enrrRepeatDefault")
    public void setEnrrRepeatDefault(String enrrRepeatDefault) {
        this.enrrRepeatDefault = enrrRepeatDefault;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withEnrrRepeatDefault(String enrrRepeatDefault) {
        this.enrrRepeatDefault = enrrRepeatDefault;
        return this;
    }

    /**
     * Period Budgeting Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_BUDGET_ENABLED
     * 
     */
    @JsonProperty("periodBudgetEnabled")
    public String getPeriodBudgetEnabled() {
        return periodBudgetEnabled;
    }

    /**
     * Period Budgeting Enabled
     * <p>
     * Lineage reference object : ROBINST_PERIOD_BUDGET_ENABLED
     * 
     */
    @JsonProperty("periodBudgetEnabled")
    public void setPeriodBudgetEnabled(String periodBudgetEnabled) {
        this.periodBudgetEnabled = periodBudgetEnabled;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withPeriodBudgetEnabled(String periodBudgetEnabled) {
        this.periodBudgetEnabled = periodBudgetEnabled;
        return this;
    }

    /**
     * International
     * <p>
     * Lineage reference object : ROBINST_INTL_IND
     * 
     */
    @JsonProperty("intlInd")
    public String getIntlInd() {
        return intlInd;
    }

    /**
     * International
     * <p>
     * Lineage reference object : ROBINST_INTL_IND
     * 
     */
    @JsonProperty("intlInd")
    public void setIntlInd(String intlInd) {
        this.intlInd = intlInd;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withIntlInd(String intlInd) {
        this.intlInd = intlInd;
        return this;
    }

    /**
     * Packaging Group
     * <p>
     * Lineage reference object : ROBINST_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * (Required)
     * 
     */
    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    /**
     * Packaging Group
     * <p>
     * Lineage reference object : ROBINST_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * (Required)
     * 
     */
    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    public Date getAidyStartDate() {
        return aidyStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : ROBINST_AIDY_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("aidyStartDate")
    public void setAidyStartDate(Date aidyStartDate) {
        this.aidyStartDate = aidyStartDate;
    }

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAidyStartDate(Date aidyStartDate) {
        this.aidyStartDate = aidyStartDate;
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

    public GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reschedDisbDateInd");
        sb.append('=');
        sb.append(((this.reschedDisbDateInd == null)?"<null>":this.reschedDisbDateInd));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("displayEnrRulesDefault");
        sb.append('=');
        sb.append(((this.displayEnrRulesDefault == null)?"<null>":this.displayEnrRulesDefault));
        sb.append(',');
        sb.append("enrrRemedDefault");
        sb.append('=');
        sb.append(((this.enrrRemedDefault == null)?"<null>":this.enrrRemedDefault));
        sb.append(',');
        sb.append("periodEnabled");
        sb.append('=');
        sb.append(((this.periodEnabled == null)?"<null>":this.periodEnabled));
        sb.append(',');
        sb.append("updLockedAwardInd");
        sb.append('=');
        sb.append(((this.updLockedAwardInd == null)?"<null>":this.updLockedAwardInd));
        sb.append(',');
        sb.append("dfltMsgExpDays");
        sb.append('=');
        sb.append(((this.dfltMsgExpDays == null)?"<null>":this.dfltMsgExpDays));
        sb.append(',');
        sb.append("trstCodeEst");
        sb.append('=');
        sb.append(((this.trstCodeEst == null)?"<null>":this.trstCodeEst));
        sb.append(',');
        sb.append("displayXesHeader");
        sb.append('=');
        sb.append(((this.displayXesHeader == null)?"<null>":this.displayXesHeader));
        sb.append(',');
        sb.append("enrrRepeatNoDefault");
        sb.append('=');
        sb.append(((this.enrrRepeatNoDefault == null)?"<null>":this.enrrRepeatNoDefault));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("xesAlgoCodeAidy");
        sb.append('=');
        sb.append(((this.xesAlgoCodeAidy == null)?"<null>":this.xesAlgoCodeAidy));
        sb.append(',');
        sb.append("aidyStartYear");
        sb.append('=');
        sb.append(((this.aidyStartYear == null)?"<null>":this.aidyStartYear));
        sb.append(',');
        sb.append("applDateInd");
        sb.append('=');
        sb.append(((this.applDateInd == null)?"<null>":this.applDateInd));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("baninasInstalledInd");
        sb.append('=');
        sb.append(((this.baninasInstalledInd == null)?"<null>":this.baninasInstalledInd));
        sb.append(',');
        sb.append("remedialAlgoCode");
        sb.append('=');
        sb.append(((this.remedialAlgoCode == null)?"<null>":this.remedialAlgoCode));
        sb.append(',');
        sb.append("methodInd");
        sb.append('=');
        sb.append(((this.methodInd == null)?"<null>":this.methodInd));
        sb.append(',');
        sb.append("saprCode");
        sb.append('=');
        sb.append(((this.saprCode == null)?"<null>":this.saprCode));
        sb.append(',');
        sb.append("calcPcFm");
        sb.append('=');
        sb.append(((this.calcPcFm == null)?"<null>":this.calcPcFm));
        sb.append(',');
        sb.append("xesAidy");
        sb.append('=');
        sb.append(((this.xesAidy == null)?"<null>":this.xesAidy));
        sb.append(',');
        sb.append("aidyDesc");
        sb.append('=');
        sb.append(((this.aidyDesc == null)?"<null>":this.aidyDesc));
        sb.append(',');
        sb.append("currentTermCode");
        sb.append('=');
        sb.append(((this.currentTermCode == null)?"<null>":this.currentTermCode));
        sb.append(',');
        sb.append("infcCode");
        sb.append('=');
        sb.append(((this.infcCode == null)?"<null>":this.infcCode));
        sb.append(',');
        sb.append("availOfferOnlyInd");
        sb.append('=');
        sb.append(((this.availOfferOnlyInd == null)?"<null>":this.availOfferOnlyInd));
        sb.append(',');
        sb.append("remedialLimit");
        sb.append('=');
        sb.append(((this.remedialLimit == null)?"<null>":this.remedialLimit));
        sb.append(',');
        sb.append("pivotDate");
        sb.append('=');
        sb.append(((this.pivotDate == null)?"<null>":this.pivotDate));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("displayYrInCollege");
        sb.append('=');
        sb.append(((this.displayYrInCollege == null)?"<null>":this.displayYrInCollege));
        sb.append(',');
        sb.append("finaidDirName");
        sb.append('=');
        sb.append(((this.finaidDirName == null)?"<null>":this.finaidDirName));
        sb.append(',');
        sb.append("archiveDate");
        sb.append('=');
        sb.append(((this.archiveDate == null)?"<null>":this.archiveDate));
        sb.append(',');
        sb.append("aprdAlgoCodeDef");
        sb.append('=');
        sb.append(((this.aprdAlgoCodeDef == null)?"<null>":this.aprdAlgoCodeDef));
        sb.append(',');
        sb.append("enrrRemedNoDefault");
        sb.append('=');
        sb.append(((this.enrrRemedNoDefault == null)?"<null>":this.enrrRemedNoDefault));
        sb.append(',');
        sb.append("saprCodeExcept");
        sb.append('=');
        sb.append(((this.saprCodeExcept == null)?"<null>":this.saprCodeExcept));
        sb.append(',');
        sb.append("treqCodeAppl");
        sb.append('=');
        sb.append(((this.treqCodeAppl == null)?"<null>":this.treqCodeAppl));
        sb.append(',');
        sb.append("pbgpCode");
        sb.append('=');
        sb.append(((this.pbgpCode == null)?"<null>":this.pbgpCode));
        sb.append(',');
        sb.append("createRobusdfInd");
        sb.append('=');
        sb.append(((this.createRobusdfInd == null)?"<null>":this.createRobusdfInd));
        sb.append(',');
        sb.append("currentPeriod");
        sb.append('=');
        sb.append(((this.currentPeriod == null)?"<null>":this.currentPeriod));
        sb.append(',');
        sb.append("retentionExpiredInd");
        sb.append('=');
        sb.append(((this.retentionExpiredInd == null)?"<null>":this.retentionExpiredInd));
        sb.append(',');
        sb.append("aprdCodeDef");
        sb.append('=');
        sb.append(((this.aprdCodeDef == null)?"<null>":this.aprdCodeDef));
        sb.append(',');
        sb.append("aidyEndYear");
        sb.append('=');
        sb.append(((this.aidyEndYear == null)?"<null>":this.aidyEndYear));
        sb.append(',');
        sb.append("fmImFlg");
        sb.append('=');
        sb.append(((this.fmImFlg == null)?"<null>":this.fmImFlg));
        sb.append(',');
        sb.append("enrrInPgrmDefault");
        sb.append('=');
        sb.append(((this.enrrInPgrmDefault == null)?"<null>":this.enrrInPgrmDefault));
        sb.append(',');
        sb.append("finaidDirPhoneNo");
        sb.append('=');
        sb.append(((this.finaidDirPhoneNo == null)?"<null>":this.finaidDirPhoneNo));
        sb.append(',');
        sb.append("termCodeSap");
        sb.append('=');
        sb.append(((this.termCodeSap == null)?"<null>":this.termCodeSap));
        sb.append(',');
        sb.append("applDateSource");
        sb.append('=');
        sb.append(((this.applDateSource == null)?"<null>":this.applDateSource));
        sb.append(',');
        sb.append("xesPrds");
        sb.append('=');
        sb.append(((this.xesPrds == null)?"<null>":this.xesPrds));
        sb.append(',');
        sb.append("retentionDate");
        sb.append('=');
        sb.append(((this.retentionDate == null)?"<null>":this.retentionDate));
        sb.append(',');
        sb.append("budgDurFm");
        sb.append('=');
        sb.append(((this.budgDurFm == null)?"<null>":this.budgDurFm));
        sb.append(',');
        sb.append("yrInColAlgoCde");
        sb.append('=');
        sb.append(((this.yrInColAlgoCde == null)?"<null>":this.yrInColAlgoCde));
        sb.append(',');
        sb.append("createRobnyudInd");
        sb.append('=');
        sb.append(((this.createRobnyudInd == null)?"<null>":this.createRobnyudInd));
        sb.append(',');
        sb.append("xesAlgoCodePrds");
        sb.append('=');
        sb.append(((this.xesAlgoCodePrds == null)?"<null>":this.xesAlgoCodePrds));
        sb.append(',');
        sb.append("bgrpCode");
        sb.append('=');
        sb.append(((this.bgrpCode == null)?"<null>":this.bgrpCode));
        sb.append(',');
        sb.append("finaidDirPhoneArea");
        sb.append('=');
        sb.append(((this.finaidDirPhoneArea == null)?"<null>":this.finaidDirPhoneArea));
        sb.append(',');
        sb.append("fmCodeInstalledInd");
        sb.append('=');
        sb.append(((this.fmCodeInstalledInd == null)?"<null>":this.fmCodeInstalledInd));
        sb.append(',');
        sb.append("aidyEndDate");
        sb.append('=');
        sb.append(((this.aidyEndDate == null)?"<null>":this.aidyEndDate));
        sb.append(',');
        sb.append("enrrEslDefault");
        sb.append('=');
        sb.append(((this.enrrEslDefault == null)?"<null>":this.enrrEslDefault));
        sb.append(',');
        sb.append("enrrRepeatDefault");
        sb.append('=');
        sb.append(((this.enrrRepeatDefault == null)?"<null>":this.enrrRepeatDefault));
        sb.append(',');
        sb.append("periodBudgetEnabled");
        sb.append('=');
        sb.append(((this.periodBudgetEnabled == null)?"<null>":this.periodBudgetEnabled));
        sb.append(',');
        sb.append("intlInd");
        sb.append('=');
        sb.append(((this.intlInd == null)?"<null>":this.intlInd));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("aidyStartDate");
        sb.append('=');
        sb.append(((this.aidyStartDate == null)?"<null>":this.aidyStartDate));
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
        result = ((result* 31)+((this.reschedDisbDateInd == null)? 0 :this.reschedDisbDateInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.displayEnrRulesDefault == null)? 0 :this.displayEnrRulesDefault.hashCode()));
        result = ((result* 31)+((this.enrrRemedDefault == null)? 0 :this.enrrRemedDefault.hashCode()));
        result = ((result* 31)+((this.periodEnabled == null)? 0 :this.periodEnabled.hashCode()));
        result = ((result* 31)+((this.updLockedAwardInd == null)? 0 :this.updLockedAwardInd.hashCode()));
        result = ((result* 31)+((this.dfltMsgExpDays == null)? 0 :this.dfltMsgExpDays.hashCode()));
        result = ((result* 31)+((this.trstCodeEst == null)? 0 :this.trstCodeEst.hashCode()));
        result = ((result* 31)+((this.displayXesHeader == null)? 0 :this.displayXesHeader.hashCode()));
        result = ((result* 31)+((this.enrrRepeatNoDefault == null)? 0 :this.enrrRepeatNoDefault.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.xesAlgoCodeAidy == null)? 0 :this.xesAlgoCodeAidy.hashCode()));
        result = ((result* 31)+((this.aidyStartYear == null)? 0 :this.aidyStartYear.hashCode()));
        result = ((result* 31)+((this.applDateInd == null)? 0 :this.applDateInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.baninasInstalledInd == null)? 0 :this.baninasInstalledInd.hashCode()));
        result = ((result* 31)+((this.remedialAlgoCode == null)? 0 :this.remedialAlgoCode.hashCode()));
        result = ((result* 31)+((this.methodInd == null)? 0 :this.methodInd.hashCode()));
        result = ((result* 31)+((this.saprCode == null)? 0 :this.saprCode.hashCode()));
        result = ((result* 31)+((this.calcPcFm == null)? 0 :this.calcPcFm.hashCode()));
        result = ((result* 31)+((this.xesAidy == null)? 0 :this.xesAidy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.aidyDesc == null)? 0 :this.aidyDesc.hashCode()));
        result = ((result* 31)+((this.currentTermCode == null)? 0 :this.currentTermCode.hashCode()));
        result = ((result* 31)+((this.infcCode == null)? 0 :this.infcCode.hashCode()));
        result = ((result* 31)+((this.availOfferOnlyInd == null)? 0 :this.availOfferOnlyInd.hashCode()));
        result = ((result* 31)+((this.remedialLimit == null)? 0 :this.remedialLimit.hashCode()));
        result = ((result* 31)+((this.pivotDate == null)? 0 :this.pivotDate.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.displayYrInCollege == null)? 0 :this.displayYrInCollege.hashCode()));
        result = ((result* 31)+((this.finaidDirName == null)? 0 :this.finaidDirName.hashCode()));
        result = ((result* 31)+((this.archiveDate == null)? 0 :this.archiveDate.hashCode()));
        result = ((result* 31)+((this.aprdAlgoCodeDef == null)? 0 :this.aprdAlgoCodeDef.hashCode()));
        result = ((result* 31)+((this.enrrRemedNoDefault == null)? 0 :this.enrrRemedNoDefault.hashCode()));
        result = ((result* 31)+((this.saprCodeExcept == null)? 0 :this.saprCodeExcept.hashCode()));
        result = ((result* 31)+((this.treqCodeAppl == null)? 0 :this.treqCodeAppl.hashCode()));
        result = ((result* 31)+((this.pbgpCode == null)? 0 :this.pbgpCode.hashCode()));
        result = ((result* 31)+((this.createRobusdfInd == null)? 0 :this.createRobusdfInd.hashCode()));
        result = ((result* 31)+((this.currentPeriod == null)? 0 :this.currentPeriod.hashCode()));
        result = ((result* 31)+((this.retentionExpiredInd == null)? 0 :this.retentionExpiredInd.hashCode()));
        result = ((result* 31)+((this.aprdCodeDef == null)? 0 :this.aprdCodeDef.hashCode()));
        result = ((result* 31)+((this.aidyEndYear == null)? 0 :this.aidyEndYear.hashCode()));
        result = ((result* 31)+((this.fmImFlg == null)? 0 :this.fmImFlg.hashCode()));
        result = ((result* 31)+((this.enrrInPgrmDefault == null)? 0 :this.enrrInPgrmDefault.hashCode()));
        result = ((result* 31)+((this.finaidDirPhoneNo == null)? 0 :this.finaidDirPhoneNo.hashCode()));
        result = ((result* 31)+((this.termCodeSap == null)? 0 :this.termCodeSap.hashCode()));
        result = ((result* 31)+((this.applDateSource == null)? 0 :this.applDateSource.hashCode()));
        result = ((result* 31)+((this.xesPrds == null)? 0 :this.xesPrds.hashCode()));
        result = ((result* 31)+((this.retentionDate == null)? 0 :this.retentionDate.hashCode()));
        result = ((result* 31)+((this.budgDurFm == null)? 0 :this.budgDurFm.hashCode()));
        result = ((result* 31)+((this.yrInColAlgoCde == null)? 0 :this.yrInColAlgoCde.hashCode()));
        result = ((result* 31)+((this.createRobnyudInd == null)? 0 :this.createRobnyudInd.hashCode()));
        result = ((result* 31)+((this.xesAlgoCodePrds == null)? 0 :this.xesAlgoCodePrds.hashCode()));
        result = ((result* 31)+((this.bgrpCode == null)? 0 :this.bgrpCode.hashCode()));
        result = ((result* 31)+((this.finaidDirPhoneArea == null)? 0 :this.finaidDirPhoneArea.hashCode()));
        result = ((result* 31)+((this.fmCodeInstalledInd == null)? 0 :this.fmCodeInstalledInd.hashCode()));
        result = ((result* 31)+((this.aidyEndDate == null)? 0 :this.aidyEndDate.hashCode()));
        result = ((result* 31)+((this.enrrEslDefault == null)? 0 :this.enrrEslDefault.hashCode()));
        result = ((result* 31)+((this.enrrRepeatDefault == null)? 0 :this.enrrRepeatDefault.hashCode()));
        result = ((result* 31)+((this.periodBudgetEnabled == null)? 0 :this.periodBudgetEnabled.hashCode()));
        result = ((result* 31)+((this.intlInd == null)? 0 :this.intlInd.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.aidyStartDate == null)? 0 :this.aidyStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse rhs = ((GlobalInstitutionFinancialAidOptionsAidYearDefinition100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.reschedDisbDateInd == rhs.reschedDisbDateInd)||((this.reschedDisbDateInd!= null)&&this.reschedDisbDateInd.equals(rhs.reschedDisbDateInd)))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.displayEnrRulesDefault == rhs.displayEnrRulesDefault)||((this.displayEnrRulesDefault!= null)&&this.displayEnrRulesDefault.equals(rhs.displayEnrRulesDefault))))&&((this.enrrRemedDefault == rhs.enrrRemedDefault)||((this.enrrRemedDefault!= null)&&this.enrrRemedDefault.equals(rhs.enrrRemedDefault))))&&((this.periodEnabled == rhs.periodEnabled)||((this.periodEnabled!= null)&&this.periodEnabled.equals(rhs.periodEnabled))))&&((this.updLockedAwardInd == rhs.updLockedAwardInd)||((this.updLockedAwardInd!= null)&&this.updLockedAwardInd.equals(rhs.updLockedAwardInd))))&&((this.dfltMsgExpDays == rhs.dfltMsgExpDays)||((this.dfltMsgExpDays!= null)&&this.dfltMsgExpDays.equals(rhs.dfltMsgExpDays))))&&((this.trstCodeEst == rhs.trstCodeEst)||((this.trstCodeEst!= null)&&this.trstCodeEst.equals(rhs.trstCodeEst))))&&((this.displayXesHeader == rhs.displayXesHeader)||((this.displayXesHeader!= null)&&this.displayXesHeader.equals(rhs.displayXesHeader))))&&((this.enrrRepeatNoDefault == rhs.enrrRepeatNoDefault)||((this.enrrRepeatNoDefault!= null)&&this.enrrRepeatNoDefault.equals(rhs.enrrRepeatNoDefault))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.xesAlgoCodeAidy == rhs.xesAlgoCodeAidy)||((this.xesAlgoCodeAidy!= null)&&this.xesAlgoCodeAidy.equals(rhs.xesAlgoCodeAidy))))&&((this.aidyStartYear == rhs.aidyStartYear)||((this.aidyStartYear!= null)&&this.aidyStartYear.equals(rhs.aidyStartYear))))&&((this.applDateInd == rhs.applDateInd)||((this.applDateInd!= null)&&this.applDateInd.equals(rhs.applDateInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.baninasInstalledInd == rhs.baninasInstalledInd)||((this.baninasInstalledInd!= null)&&this.baninasInstalledInd.equals(rhs.baninasInstalledInd))))&&((this.remedialAlgoCode == rhs.remedialAlgoCode)||((this.remedialAlgoCode!= null)&&this.remedialAlgoCode.equals(rhs.remedialAlgoCode))))&&((this.methodInd == rhs.methodInd)||((this.methodInd!= null)&&this.methodInd.equals(rhs.methodInd))))&&((this.saprCode == rhs.saprCode)||((this.saprCode!= null)&&this.saprCode.equals(rhs.saprCode))))&&((this.calcPcFm == rhs.calcPcFm)||((this.calcPcFm!= null)&&this.calcPcFm.equals(rhs.calcPcFm))))&&((this.xesAidy == rhs.xesAidy)||((this.xesAidy!= null)&&this.xesAidy.equals(rhs.xesAidy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.aidyDesc == rhs.aidyDesc)||((this.aidyDesc!= null)&&this.aidyDesc.equals(rhs.aidyDesc))))&&((this.currentTermCode == rhs.currentTermCode)||((this.currentTermCode!= null)&&this.currentTermCode.equals(rhs.currentTermCode))))&&((this.infcCode == rhs.infcCode)||((this.infcCode!= null)&&this.infcCode.equals(rhs.infcCode))))&&((this.availOfferOnlyInd == rhs.availOfferOnlyInd)||((this.availOfferOnlyInd!= null)&&this.availOfferOnlyInd.equals(rhs.availOfferOnlyInd))))&&((this.remedialLimit == rhs.remedialLimit)||((this.remedialLimit!= null)&&this.remedialLimit.equals(rhs.remedialLimit))))&&((this.pivotDate == rhs.pivotDate)||((this.pivotDate!= null)&&this.pivotDate.equals(rhs.pivotDate))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.displayYrInCollege == rhs.displayYrInCollege)||((this.displayYrInCollege!= null)&&this.displayYrInCollege.equals(rhs.displayYrInCollege))))&&((this.finaidDirName == rhs.finaidDirName)||((this.finaidDirName!= null)&&this.finaidDirName.equals(rhs.finaidDirName))))&&((this.archiveDate == rhs.archiveDate)||((this.archiveDate!= null)&&this.archiveDate.equals(rhs.archiveDate))))&&((this.aprdAlgoCodeDef == rhs.aprdAlgoCodeDef)||((this.aprdAlgoCodeDef!= null)&&this.aprdAlgoCodeDef.equals(rhs.aprdAlgoCodeDef))))&&((this.enrrRemedNoDefault == rhs.enrrRemedNoDefault)||((this.enrrRemedNoDefault!= null)&&this.enrrRemedNoDefault.equals(rhs.enrrRemedNoDefault))))&&((this.saprCodeExcept == rhs.saprCodeExcept)||((this.saprCodeExcept!= null)&&this.saprCodeExcept.equals(rhs.saprCodeExcept))))&&((this.treqCodeAppl == rhs.treqCodeAppl)||((this.treqCodeAppl!= null)&&this.treqCodeAppl.equals(rhs.treqCodeAppl))))&&((this.pbgpCode == rhs.pbgpCode)||((this.pbgpCode!= null)&&this.pbgpCode.equals(rhs.pbgpCode))))&&((this.createRobusdfInd == rhs.createRobusdfInd)||((this.createRobusdfInd!= null)&&this.createRobusdfInd.equals(rhs.createRobusdfInd))))&&((this.currentPeriod == rhs.currentPeriod)||((this.currentPeriod!= null)&&this.currentPeriod.equals(rhs.currentPeriod))))&&((this.retentionExpiredInd == rhs.retentionExpiredInd)||((this.retentionExpiredInd!= null)&&this.retentionExpiredInd.equals(rhs.retentionExpiredInd))))&&((this.aprdCodeDef == rhs.aprdCodeDef)||((this.aprdCodeDef!= null)&&this.aprdCodeDef.equals(rhs.aprdCodeDef))))&&((this.aidyEndYear == rhs.aidyEndYear)||((this.aidyEndYear!= null)&&this.aidyEndYear.equals(rhs.aidyEndYear))))&&((this.fmImFlg == rhs.fmImFlg)||((this.fmImFlg!= null)&&this.fmImFlg.equals(rhs.fmImFlg))))&&((this.enrrInPgrmDefault == rhs.enrrInPgrmDefault)||((this.enrrInPgrmDefault!= null)&&this.enrrInPgrmDefault.equals(rhs.enrrInPgrmDefault))))&&((this.finaidDirPhoneNo == rhs.finaidDirPhoneNo)||((this.finaidDirPhoneNo!= null)&&this.finaidDirPhoneNo.equals(rhs.finaidDirPhoneNo))))&&((this.termCodeSap == rhs.termCodeSap)||((this.termCodeSap!= null)&&this.termCodeSap.equals(rhs.termCodeSap))))&&((this.applDateSource == rhs.applDateSource)||((this.applDateSource!= null)&&this.applDateSource.equals(rhs.applDateSource))))&&((this.xesPrds == rhs.xesPrds)||((this.xesPrds!= null)&&this.xesPrds.equals(rhs.xesPrds))))&&((this.retentionDate == rhs.retentionDate)||((this.retentionDate!= null)&&this.retentionDate.equals(rhs.retentionDate))))&&((this.budgDurFm == rhs.budgDurFm)||((this.budgDurFm!= null)&&this.budgDurFm.equals(rhs.budgDurFm))))&&((this.yrInColAlgoCde == rhs.yrInColAlgoCde)||((this.yrInColAlgoCde!= null)&&this.yrInColAlgoCde.equals(rhs.yrInColAlgoCde))))&&((this.createRobnyudInd == rhs.createRobnyudInd)||((this.createRobnyudInd!= null)&&this.createRobnyudInd.equals(rhs.createRobnyudInd))))&&((this.xesAlgoCodePrds == rhs.xesAlgoCodePrds)||((this.xesAlgoCodePrds!= null)&&this.xesAlgoCodePrds.equals(rhs.xesAlgoCodePrds))))&&((this.bgrpCode == rhs.bgrpCode)||((this.bgrpCode!= null)&&this.bgrpCode.equals(rhs.bgrpCode))))&&((this.finaidDirPhoneArea == rhs.finaidDirPhoneArea)||((this.finaidDirPhoneArea!= null)&&this.finaidDirPhoneArea.equals(rhs.finaidDirPhoneArea))))&&((this.fmCodeInstalledInd == rhs.fmCodeInstalledInd)||((this.fmCodeInstalledInd!= null)&&this.fmCodeInstalledInd.equals(rhs.fmCodeInstalledInd))))&&((this.aidyEndDate == rhs.aidyEndDate)||((this.aidyEndDate!= null)&&this.aidyEndDate.equals(rhs.aidyEndDate))))&&((this.enrrEslDefault == rhs.enrrEslDefault)||((this.enrrEslDefault!= null)&&this.enrrEslDefault.equals(rhs.enrrEslDefault))))&&((this.enrrRepeatDefault == rhs.enrrRepeatDefault)||((this.enrrRepeatDefault!= null)&&this.enrrRepeatDefault.equals(rhs.enrrRepeatDefault))))&&((this.periodBudgetEnabled == rhs.periodBudgetEnabled)||((this.periodBudgetEnabled!= null)&&this.periodBudgetEnabled.equals(rhs.periodBudgetEnabled))))&&((this.intlInd == rhs.intlInd)||((this.intlInd!= null)&&this.intlInd.equals(rhs.intlInd))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.aidyStartDate == rhs.aidyStartDate)||((this.aidyStartDate!= null)&&this.aidyStartDate.equals(rhs.aidyStartDate))));
    }

}
