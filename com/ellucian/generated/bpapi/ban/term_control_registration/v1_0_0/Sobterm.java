
package com.ellucian.generated.bpapi.ban.term_control_registration.v1_0_0;

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
    "condAddDropCde",
    "gradeDetailWebInd",
    "tivDateSource",
    "capcSeverity",
    "assessSwapInd",
    "sectionfeeInd",
    "duplSeverity",
    "inclAttmptHrsInd",
    "calcDropActCde",
    "hold",
    "levlWebCatlSrchInd",
    "addDrpWebUpdInd",
    "planRegCde",
    "lsTitleWebsDispInd",
    "lsDescWebsDispInd",
    "campSeverity",
    "mexcSeverity",
    "maxPlans",
    "attrWebSearchInd",
    "claslstWebDispInd",
    "collWebCatlSrchInd",
    "assessAdmCreditInd",
    "degAuditPlanCde",
    "collSeverity",
    "lcTitleWebcDispInd",
    "refundInd",
    "inprogressUsageInd",
    "insmWebSearchInd",
    "minhSeverity",
    "feeAssessmntEffDate",
    "printBillVr",
    "progAttWebcSrchInd",
    "campWebSearchInd",
    "closectWebDispInd",
    "gmodWebUpdInd",
    "assessRevNrfInd",
    "crnOneup",
    "planDaRegCde",
    "schdWebSearchInd",
    "feeAssessment",
    "durationWebSrchInd",
    "tmstCalcInd",
    "studyPathInd",
    "lcDescWebcDispInd",
    "instrWebSearchInd",
    "overappWebUpdInd",
    "regAllowed",
    "linkSeverity",
    "assessSsCreditInd",
    "processGradeBook",
    "chrtSeverity",
    "futureRepeatInd",
    "sessWebSearchInd",
    "clasSeverity",
    "levlSeverity",
    "planTermOpenCde",
    "feeAssessVr",
    "readmReq",
    "activityDate",
    "deptSeverity",
    "levlWebUpdInd",
    "adminDropCde",
    "autoDropCde",
    "majrSeverity",
    "maxhSeverity",
    "webCappCatlgInd",
    "holdSeverity",
    "dropLastClassCde",
    "attsSeverity",
    "timeSeverity",
    "projectedModelInd",
    "reptSeverity",
    "deptWebCatlSrchInd",
    "divWebCatlSrchInd",
    "regularModelInd",
    "secAllowedPlanCde",
    "credWebUpdInd",
    "stypWebCatlSrchInd",
    "webCappTermInd",
    "cutoffDate",
    "levlWebSearchInd",
    "programSeverity",
    "spWebUpdInd",
    "corqSeverity",
    "structuredModelInd",
    "mailerWebInd",
    "bycrnInd",
    "rpthSeverity",
    "dynamicSchedTermInd",
    "facschdWebDispInd",
    "midtermWebInd",
    "preqSeverity",
    "apprSeverity",
    "degreeSeverity"
})
@Generated("jsonschema2pojo")
public class Sobterm {

    /**
     * Allow Student to Select Conditional Add Drop
     * <p>
     * Lineage reference object : SOBTERM_COND_ADD_DROP_CDE
     * 
     */
    @JsonProperty("condAddDropCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_COND_ADD_DROP_CDE")
    private String condAddDropCde;
    /**
     * Display Grade Detail
     * <p>
     * Lineage reference object : SOBTERM_GRADE_DETAIL_WEB_IND
     * 
     */
    @JsonProperty("gradeDetailWebInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_GRADE_DETAIL_WEB_IND")
    private String gradeDetailWebInd;
    /**
     * Lineage reference object : SOBTERM_TIV_DATE_SOURCE
     * 
     */
    @JsonProperty("tivDateSource")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_TIV_DATE_SOURCE")
    private String tivDateSource;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SOBTERM_CAPC_SEVERITY
     * 
     */
    @JsonProperty("capcSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CAPC_SEVERITY")
    private String capcSeverity;
    /**
     * Allow Swapping
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SWAP_IND
     * 
     */
    @JsonProperty("assessSwapInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ASSESS_SWAP_IND")
    private String assessSwapInd;
    /**
     * Section Fees by Study Path
     * <p>
     * Lineage reference object : SOBTERM_SECTIONFEE_IND
     * 
     */
    @JsonProperty("sectionfeeInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_SECTIONFEE_IND")
    private String sectionfeeInd;
    /**
     * Duplicates
     * <p>
     * Lineage reference object : SOBTERM_DUPL_SEVERITY
     * 
     */
    @JsonProperty("duplSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DUPL_SEVERITY")
    private String duplSeverity;
    /**
     * Include Attempted Hours
     * <p>
     * Lineage reference object : SOBTERM_INCL_ATTMPT_HRS_IND
     * 
     */
    @JsonProperty("inclAttmptHrsInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_INCL_ATTMPT_HRS_IND")
    private String inclAttmptHrsInd;
    /**
     * Calculated Drop
     * <p>
     * Lineage reference object : SOBTERM_CALC_DROP_ACT_CDE
     * 
     */
    @JsonProperty("calcDropActCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CALC_DROP_ACT_CDE")
    private String calcDropActCde;
    /**
     * Hold Password
     * <p>
     * Lineage reference object : SOBTERM_HOLD
     * 
     */
    @JsonProperty("hold")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_HOLD")
    private String hold;
    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("levlWebCatlSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LEVL_WEB_CATL_SRCH_IND")
    private String levlWebCatlSrchInd;
    /**
     * Allow Add/Drop
     * <p>
     * Lineage reference object : SOBTERM_ADD_DRP_WEB_UPD_IND
     * 
     */
    @JsonProperty("addDrpWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ADD_DRP_WEB_UPD_IND")
    private String addDrpWebUpdInd;
    /**
     * Display Self-Service plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_REG_CDE
     * 
     */
    @JsonProperty("planRegCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PLAN_REG_CDE")
    private String planRegCde;
    /**
     * Display Long Section Title
     * <p>
     * Lineage reference object : SOBTERM_LS_TITLE_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsTitleWebsDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LS_TITLE_WEBS_DISP_IND")
    private String lsTitleWebsDispInd;
    /**
     * Display Long Section Description
     * <p>
     * Lineage reference object : SOBTERM_LS_DESC_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsDescWebsDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LS_DESC_WEBS_DISP_IND")
    private String lsDescWebsDispInd;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_SEVERITY
     * 
     */
    @JsonProperty("campSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CAMP_SEVERITY")
    private String campSeverity;
    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SOBTERM_MEXC_SEVERITY
     * 
     */
    @JsonProperty("mexcSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MEXC_SEVERITY")
    private String mexcSeverity;
    /**
     * Lineage reference object : SOBTERM_MAX_PLANS
     * 
     */
    @JsonProperty("maxPlans")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MAX_PLANS")
    private Double maxPlans;
    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("attrWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ATTR_WEB_SEARCH_IND")
    private String attrWebSearchInd;
    /**
     * Display Class List
     * <p>
     * Lineage reference object : SOBTERM_CLASLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("claslstWebDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CLASLST_WEB_DISP_IND")
    private String claslstWebDispInd;
    /**
     * Search by College
     * <p>
     * Lineage reference object : SOBTERM_COLL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("collWebCatlSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_COLL_WEB_CATL_SRCH_IND")
    private String collWebCatlSrchInd;
    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_ADM_CREDIT_IND
     * 
     */
    @JsonProperty("assessAdmCreditInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ASSESS_ADM_CREDIT_IND")
    private String assessAdmCreditInd;
    /**
     * Check third party degree audit system plans
     * <p>
     * Lineage reference object : SOBTERM_DEG_AUDIT_PLAN_CDE
     * 
     */
    @JsonProperty("degAuditPlanCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DEG_AUDIT_PLAN_CDE")
    private String degAuditPlanCde;
    /**
     * College
     * <p>
     * Lineage reference object : SOBTERM_COLL_SEVERITY
     * 
     */
    @JsonProperty("collSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_COLL_SEVERITY")
    private String collSeverity;
    /**
     * Display Long Course Title
     * <p>
     * Lineage reference object : SOBTERM_LC_TITLE_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcTitleWebcDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LC_TITLE_WEBC_DISP_IND")
    private String lcTitleWebcDispInd;
    /**
     * Refund by Total
     * <p>
     * Lineage reference object : SOBTERM_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REFUND_IND")
    private String refundInd;
    /**
     * In Progress
     * <p>
     * Lineage reference object : SOBTERM_INPROGRESS_USAGE_IND
     * 
     */
    @JsonProperty("inprogressUsageInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_INPROGRESS_USAGE_IND")
    private String inprogressUsageInd;
    /**
     * Search by Instructional Method
     * <p>
     * Lineage reference object : SOBTERM_INSM_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("insmWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_INSM_WEB_SEARCH_IND")
    private String insmWebSearchInd;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBTERM_MINH_SEVERITY
     * 
     */
    @JsonProperty("minhSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MINH_SEVERITY")
    private String minhSeverity;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeAssessmntEffDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FEE_ASSESSMNT_EFF_DATE")
    private Date feeAssessmntEffDate;
    /**
     * Print Bill
     * <p>
     * Lineage reference object : SOBTERM_PRINT_BILL_VR
     * 
     */
    @JsonProperty("printBillVr")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PRINT_BILL_VR")
    private String printBillVr;
    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_PROG_ATT_WEBC_SRCH_IND
     * 
     */
    @JsonProperty("progAttWebcSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PROG_ATT_WEBC_SRCH_IND")
    private String progAttWebcSrchInd;
    /**
     * Search by Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("campWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CAMP_WEB_SEARCH_IND")
    private String campWebSearchInd;
    /**
     * Display Closed Section
     * <p>
     * Lineage reference object : SOBTERM_CLOSECT_WEB_DISP_IND
     * 
     */
    @JsonProperty("closectWebDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CLOSECT_WEB_DISP_IND")
    private String closectWebDispInd;
    /**
     * Change Grade Mode
     * <p>
     * Lineage reference object : SOBTERM_GMOD_WEB_UPD_IND
     * 
     */
    @JsonProperty("gmodWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_GMOD_WEB_UPD_IND")
    private String gmodWebUpdInd;
    /**
     * Reverse Non Tuition/Fee Charges
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_REV_NRF_IND
     * 
     */
    @JsonProperty("assessRevNrfInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ASSESS_REV_NRF_IND")
    private String assessRevNrfInd;
    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CRN_ONEUP")
    private Double crnOneup;
    /**
     * Display third party degree audit system plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_DA_REG_CDE
     * 
     */
    @JsonProperty("planDaRegCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PLAN_DA_REG_CDE")
    private String planDaRegCde;
    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_SCHD_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("schdWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_SCHD_WEB_SEARCH_IND")
    private String schdWebSearchInd;
    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FEE_ASSESSMENT")
    private String feeAssessment;
    /**
     * Search by Duration (Open Learning Only)
     * <p>
     * Lineage reference object : SOBTERM_DURATION_WEB_SRCH_IND
     * 
     */
    @JsonProperty("durationWebSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DURATION_WEB_SRCH_IND")
    private String durationWebSrchInd;
    /**
     * Calculate Time Status
     * <p>
     * Lineage reference object : SOBTERM_TMST_CALC_IND
     * 
     */
    @JsonProperty("tmstCalcInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_TMST_CALC_IND")
    private String tmstCalcInd;
    /**
     * Study Path Required
     * <p>
     * Lineage reference object : SOBTERM_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_STUDY_PATH_IND")
    private String studyPathInd;
    /**
     * Display Long Course Description
     * <p>
     * Lineage reference object : SOBTERM_LC_DESC_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcDescWebcDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LC_DESC_WEBC_DISP_IND")
    private String lcDescWebcDispInd;
    /**
     * Search by Instructor
     * <p>
     * Lineage reference object : SOBTERM_INSTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("instrWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_INSTR_WEB_SEARCH_IND")
    private String instrWebSearchInd;
    /**
     * Allow Approval/Overrides
     * <p>
     * Lineage reference object : SOBTERM_OVERAPP_WEB_UPD_IND
     * 
     */
    @JsonProperty("overappWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_OVERAPP_WEB_UPD_IND")
    private String overappWebUpdInd;
    /**
     * Permit
     * <p>
     * Lineage reference object : SOBTERM_REG_ALLOWED
     * 
     */
    @JsonProperty("regAllowed")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REG_ALLOWED")
    private String regAllowed;
    /**
     * Links
     * <p>
     * Lineage reference object : SOBTERM_LINK_SEVERITY
     * 
     */
    @JsonProperty("linkSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LINK_SEVERITY")
    private String linkSeverity;
    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SS_CREDIT_IND
     * 
     */
    @JsonProperty("assessSsCreditInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ASSESS_SS_CREDIT_IND")
    private String assessSsCreditInd;
    /**
     * Process Gradebook Controls
     * <p>
     * 
     * 
     */
    @JsonProperty("processGradeBook")
    private String processGradeBook;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SOBTERM_CHRT_SEVERITY
     * 
     */
    @JsonProperty("chrtSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CHRT_SEVERITY")
    private String chrtSeverity;
    /**
     * Future Terms for Repeats
     * <p>
     * Lineage reference object : SOBTERM_FUTURE_REPEAT_IND
     * 
     */
    @JsonProperty("futureRepeatInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FUTURE_REPEAT_IND")
    private String futureRepeatInd;
    /**
     * Search by Session
     * <p>
     * Lineage reference object : SOBTERM_SESS_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("sessWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_SESS_WEB_SEARCH_IND")
    private String sessWebSearchInd;
    /**
     * Class
     * <p>
     * Lineage reference object : SOBTERM_CLAS_SEVERITY
     * 
     */
    @JsonProperty("clasSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CLAS_SEVERITY")
    private String clasSeverity;
    /**
     * Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_SEVERITY
     * 
     */
    @JsonProperty("levlSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LEVL_SEVERITY")
    private String levlSeverity;
    /**
     * Term open for Self-Service planning
     * <p>
     * Lineage reference object : SOBTERM_PLAN_TERM_OPEN_CDE
     * 
     */
    @JsonProperty("planTermOpenCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PLAN_TERM_OPEN_CDE")
    private String planTermOpenCde;
    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESS_VR
     * 
     */
    @JsonProperty("feeAssessVr")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FEE_ASSESS_VR")
    private String feeAssessVr;
    /**
     * Re-Admit
     * <p>
     * Lineage reference object : SOBTERM_READM_REQ
     * 
     */
    @JsonProperty("readmReq")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_READM_REQ")
    private String readmReq;
    /**
     * Lineage reference object : SOBTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_SEVERITY
     * 
     */
    @JsonProperty("deptSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DEPT_SEVERITY")
    private String deptSeverity;
    /**
     * Change Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_UPD_IND
     * 
     */
    @JsonProperty("levlWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LEVL_WEB_UPD_IND")
    private String levlWebUpdInd;
    /**
     * Administration Drop Connected Course Errors
     * <p>
     * Lineage reference object : SOBTERM_ADMIN_DROP_CDE
     * 
     */
    @JsonProperty("adminDropCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ADMIN_DROP_CDE")
    private String adminDropCde;
    /**
     * Lineage reference object : SOBTERM_AUTO_DROP_CDE
     * 
     */
    @JsonProperty("autoDropCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_AUTO_DROP_CDE")
    private String autoDropCde;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOBTERM_MAJR_SEVERITY
     * 
     */
    @JsonProperty("majrSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MAJR_SEVERITY")
    private String majrSeverity;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBTERM_MAXH_SEVERITY
     * 
     */
    @JsonProperty("maxhSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MAXH_SEVERITY")
    private String maxhSeverity;
    /**
     * Web Catalog Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_CATLG_IND
     * 
     */
    @JsonProperty("webCappCatlgInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_WEB_CAPP_CATLG_IND")
    private String webCappCatlgInd;
    /**
     * Holds
     * <p>
     * Lineage reference object : SOBTERM_HOLD_SEVERITY
     * 
     */
    @JsonProperty("holdSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_HOLD_SEVERITY")
    private String holdSeverity;
    /**
     * Allow Student to Drop their Last Class
     * <p>
     * Lineage reference object : SOBTERM_DROP_LAST_CLASS_CDE
     * 
     */
    @JsonProperty("dropLastClassCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DROP_LAST_CLASS_CDE")
    private String dropLastClassCde;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTS_SEVERITY
     * 
     */
    @JsonProperty("attsSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_ATTS_SEVERITY")
    private String attsSeverity;
    /**
     * Time
     * <p>
     * Lineage reference object : SOBTERM_TIME_SEVERITY
     * 
     */
    @JsonProperty("timeSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_TIME_SEVERITY")
    private String timeSeverity;
    /**
     * Projected
     * <p>
     * Lineage reference object : SOBTERM_PROJECTED_MODEL_IND
     * 
     */
    @JsonProperty("projectedModelInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PROJECTED_MODEL_IND")
    private String projectedModelInd;
    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SOBTERM_REPT_SEVERITY
     * 
     */
    @JsonProperty("reptSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REPT_SEVERITY")
    private String reptSeverity;
    /**
     * Search by Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("deptWebCatlSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DEPT_WEB_CATL_SRCH_IND")
    private String deptWebCatlSrchInd;
    /**
     * Search by Division
     * <p>
     * Lineage reference object : SOBTERM_DIV_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("divWebCatlSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DIV_WEB_CATL_SRCH_IND")
    private String divWebCatlSrchInd;
    /**
     * Basic
     * <p>
     * Lineage reference object : SOBTERM_REGULAR_MODEL_IND
     * 
     */
    @JsonProperty("regularModelInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_REGULAR_MODEL_IND")
    private String regularModelInd;
    /**
     * Allow adding course sections to plan
     * <p>
     * Lineage reference object : SOBTERM_SEC_ALLOWED_PLAN_CDE
     * 
     */
    @JsonProperty("secAllowedPlanCde")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_SEC_ALLOWED_PLAN_CDE")
    private String secAllowedPlanCde;
    /**
     * Change Credit Hours
     * <p>
     * Lineage reference object : SOBTERM_CRED_WEB_UPD_IND
     * 
     */
    @JsonProperty("credWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CRED_WEB_UPD_IND")
    private String credWebUpdInd;
    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_STYP_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("stypWebCatlSrchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_STYP_WEB_CATL_SRCH_IND")
    private String stypWebCatlSrchInd;
    /**
     * Web Evaluation Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_TERM_IND
     * 
     */
    @JsonProperty("webCappTermInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_WEB_CAPP_TERM_IND")
    private String webCappTermInd;
    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SOBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CUTOFF_DATE")
    private Date cutoffDate;
    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("levlWebSearchInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_LEVL_WEB_SEARCH_IND")
    private String levlWebSearchInd;
    /**
     * Program
     * <p>
     * Lineage reference object : SOBTERM_PROGRAM_SEVERITY
     * 
     */
    @JsonProperty("programSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PROGRAM_SEVERITY")
    private String programSeverity;
    /**
     * Change Study Path
     * <p>
     * Lineage reference object : SOBTERM_SP_WEB_UPD_IND
     * 
     */
    @JsonProperty("spWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_SP_WEB_UPD_IND")
    private String spWebUpdInd;
    /**
     * Corequisites
     * <p>
     * Lineage reference object : SOBTERM_CORQ_SEVERITY
     * 
     */
    @JsonProperty("corqSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CORQ_SEVERITY")
    private String corqSeverity;
    /**
     * Structured
     * <p>
     * Lineage reference object : SOBTERM_STRUCTURED_MODEL_IND
     * 
     */
    @JsonProperty("structuredModelInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_STRUCTURED_MODEL_IND")
    private String structuredModelInd;
    /**
     * Display Final Grades
     * <p>
     * Lineage reference object : SOBTERM_MAILER_WEB_IND
     * 
     */
    @JsonProperty("mailerWebInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MAILER_WEB_IND")
    private String mailerWebInd;
    /**
     * Track by CRN
     * <p>
     * Lineage reference object : SOBTERM_BYCRN_IND
     * 
     */
    @JsonProperty("bycrnInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_BYCRN_IND")
    private String bycrnInd;
    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SOBTERM_RPTH_SEVERITY
     * 
     */
    @JsonProperty("rpthSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_RPTH_SEVERITY")
    private String rpthSeverity;
    /**
     * Master Web Term Control
     * <p>
     * Lineage reference object : SOBTERM_DYNAMIC_SCHED_TERM_IND
     * 
     */
    @JsonProperty("dynamicSchedTermInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DYNAMIC_SCHED_TERM_IND")
    private String dynamicSchedTermInd;
    /**
     * Display Schedule
     * <p>
     * Lineage reference object : SOBTERM_FACSCHD_WEB_DISP_IND
     * 
     */
    @JsonProperty("facschdWebDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_FACSCHD_WEB_DISP_IND")
    private String facschdWebDispInd;
    /**
     * Display Midterm Grades
     * <p>
     * Lineage reference object : SOBTERM_MIDTERM_WEB_IND
     * 
     */
    @JsonProperty("midtermWebInd")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_MIDTERM_WEB_IND")
    private String midtermWebInd;
    /**
     * Prerequisites
     * <p>
     * Lineage reference object : SOBTERM_PREQ_SEVERITY
     * 
     */
    @JsonProperty("preqSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_PREQ_SEVERITY")
    private String preqSeverity;
    /**
     * Approval
     * <p>
     * Lineage reference object : SOBTERM_APPR_SEVERITY
     * 
     */
    @JsonProperty("apprSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_APPR_SEVERITY")
    private String apprSeverity;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOBTERM_DEGREE_SEVERITY
     * 
     */
    @JsonProperty("degreeSeverity")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_DEGREE_SEVERITY")
    private String degreeSeverity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Allow Student to Select Conditional Add Drop
     * <p>
     * Lineage reference object : SOBTERM_COND_ADD_DROP_CDE
     * 
     */
    @JsonProperty("condAddDropCde")
    public String getCondAddDropCde() {
        return condAddDropCde;
    }

    /**
     * Allow Student to Select Conditional Add Drop
     * <p>
     * Lineage reference object : SOBTERM_COND_ADD_DROP_CDE
     * 
     */
    @JsonProperty("condAddDropCde")
    public void setCondAddDropCde(String condAddDropCde) {
        this.condAddDropCde = condAddDropCde;
    }

    public Sobterm withCondAddDropCde(String condAddDropCde) {
        this.condAddDropCde = condAddDropCde;
        return this;
    }

    /**
     * Display Grade Detail
     * <p>
     * Lineage reference object : SOBTERM_GRADE_DETAIL_WEB_IND
     * 
     */
    @JsonProperty("gradeDetailWebInd")
    public String getGradeDetailWebInd() {
        return gradeDetailWebInd;
    }

    /**
     * Display Grade Detail
     * <p>
     * Lineage reference object : SOBTERM_GRADE_DETAIL_WEB_IND
     * 
     */
    @JsonProperty("gradeDetailWebInd")
    public void setGradeDetailWebInd(String gradeDetailWebInd) {
        this.gradeDetailWebInd = gradeDetailWebInd;
    }

    public Sobterm withGradeDetailWebInd(String gradeDetailWebInd) {
        this.gradeDetailWebInd = gradeDetailWebInd;
        return this;
    }

    /**
     * Lineage reference object : SOBTERM_TIV_DATE_SOURCE
     * 
     */
    @JsonProperty("tivDateSource")
    public String getTivDateSource() {
        return tivDateSource;
    }

    /**
     * Lineage reference object : SOBTERM_TIV_DATE_SOURCE
     * 
     */
    @JsonProperty("tivDateSource")
    public void setTivDateSource(String tivDateSource) {
        this.tivDateSource = tivDateSource;
    }

    public Sobterm withTivDateSource(String tivDateSource) {
        this.tivDateSource = tivDateSource;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SOBTERM_CAPC_SEVERITY
     * 
     */
    @JsonProperty("capcSeverity")
    public String getCapcSeverity() {
        return capcSeverity;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SOBTERM_CAPC_SEVERITY
     * 
     */
    @JsonProperty("capcSeverity")
    public void setCapcSeverity(String capcSeverity) {
        this.capcSeverity = capcSeverity;
    }

    public Sobterm withCapcSeverity(String capcSeverity) {
        this.capcSeverity = capcSeverity;
        return this;
    }

    /**
     * Allow Swapping
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SWAP_IND
     * 
     */
    @JsonProperty("assessSwapInd")
    public String getAssessSwapInd() {
        return assessSwapInd;
    }

    /**
     * Allow Swapping
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SWAP_IND
     * 
     */
    @JsonProperty("assessSwapInd")
    public void setAssessSwapInd(String assessSwapInd) {
        this.assessSwapInd = assessSwapInd;
    }

    public Sobterm withAssessSwapInd(String assessSwapInd) {
        this.assessSwapInd = assessSwapInd;
        return this;
    }

    /**
     * Section Fees by Study Path
     * <p>
     * Lineage reference object : SOBTERM_SECTIONFEE_IND
     * 
     */
    @JsonProperty("sectionfeeInd")
    public String getSectionfeeInd() {
        return sectionfeeInd;
    }

    /**
     * Section Fees by Study Path
     * <p>
     * Lineage reference object : SOBTERM_SECTIONFEE_IND
     * 
     */
    @JsonProperty("sectionfeeInd")
    public void setSectionfeeInd(String sectionfeeInd) {
        this.sectionfeeInd = sectionfeeInd;
    }

    public Sobterm withSectionfeeInd(String sectionfeeInd) {
        this.sectionfeeInd = sectionfeeInd;
        return this;
    }

    /**
     * Duplicates
     * <p>
     * Lineage reference object : SOBTERM_DUPL_SEVERITY
     * 
     */
    @JsonProperty("duplSeverity")
    public String getDuplSeverity() {
        return duplSeverity;
    }

    /**
     * Duplicates
     * <p>
     * Lineage reference object : SOBTERM_DUPL_SEVERITY
     * 
     */
    @JsonProperty("duplSeverity")
    public void setDuplSeverity(String duplSeverity) {
        this.duplSeverity = duplSeverity;
    }

    public Sobterm withDuplSeverity(String duplSeverity) {
        this.duplSeverity = duplSeverity;
        return this;
    }

    /**
     * Include Attempted Hours
     * <p>
     * Lineage reference object : SOBTERM_INCL_ATTMPT_HRS_IND
     * 
     */
    @JsonProperty("inclAttmptHrsInd")
    public String getInclAttmptHrsInd() {
        return inclAttmptHrsInd;
    }

    /**
     * Include Attempted Hours
     * <p>
     * Lineage reference object : SOBTERM_INCL_ATTMPT_HRS_IND
     * 
     */
    @JsonProperty("inclAttmptHrsInd")
    public void setInclAttmptHrsInd(String inclAttmptHrsInd) {
        this.inclAttmptHrsInd = inclAttmptHrsInd;
    }

    public Sobterm withInclAttmptHrsInd(String inclAttmptHrsInd) {
        this.inclAttmptHrsInd = inclAttmptHrsInd;
        return this;
    }

    /**
     * Calculated Drop
     * <p>
     * Lineage reference object : SOBTERM_CALC_DROP_ACT_CDE
     * 
     */
    @JsonProperty("calcDropActCde")
    public String getCalcDropActCde() {
        return calcDropActCde;
    }

    /**
     * Calculated Drop
     * <p>
     * Lineage reference object : SOBTERM_CALC_DROP_ACT_CDE
     * 
     */
    @JsonProperty("calcDropActCde")
    public void setCalcDropActCde(String calcDropActCde) {
        this.calcDropActCde = calcDropActCde;
    }

    public Sobterm withCalcDropActCde(String calcDropActCde) {
        this.calcDropActCde = calcDropActCde;
        return this;
    }

    /**
     * Hold Password
     * <p>
     * Lineage reference object : SOBTERM_HOLD
     * 
     */
    @JsonProperty("hold")
    public String getHold() {
        return hold;
    }

    /**
     * Hold Password
     * <p>
     * Lineage reference object : SOBTERM_HOLD
     * 
     */
    @JsonProperty("hold")
    public void setHold(String hold) {
        this.hold = hold;
    }

    public Sobterm withHold(String hold) {
        this.hold = hold;
        return this;
    }

    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("levlWebCatlSrchInd")
    public String getLevlWebCatlSrchInd() {
        return levlWebCatlSrchInd;
    }

    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("levlWebCatlSrchInd")
    public void setLevlWebCatlSrchInd(String levlWebCatlSrchInd) {
        this.levlWebCatlSrchInd = levlWebCatlSrchInd;
    }

    public Sobterm withLevlWebCatlSrchInd(String levlWebCatlSrchInd) {
        this.levlWebCatlSrchInd = levlWebCatlSrchInd;
        return this;
    }

    /**
     * Allow Add/Drop
     * <p>
     * Lineage reference object : SOBTERM_ADD_DRP_WEB_UPD_IND
     * 
     */
    @JsonProperty("addDrpWebUpdInd")
    public String getAddDrpWebUpdInd() {
        return addDrpWebUpdInd;
    }

    /**
     * Allow Add/Drop
     * <p>
     * Lineage reference object : SOBTERM_ADD_DRP_WEB_UPD_IND
     * 
     */
    @JsonProperty("addDrpWebUpdInd")
    public void setAddDrpWebUpdInd(String addDrpWebUpdInd) {
        this.addDrpWebUpdInd = addDrpWebUpdInd;
    }

    public Sobterm withAddDrpWebUpdInd(String addDrpWebUpdInd) {
        this.addDrpWebUpdInd = addDrpWebUpdInd;
        return this;
    }

    /**
     * Display Self-Service plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_REG_CDE
     * 
     */
    @JsonProperty("planRegCde")
    public String getPlanRegCde() {
        return planRegCde;
    }

    /**
     * Display Self-Service plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_REG_CDE
     * 
     */
    @JsonProperty("planRegCde")
    public void setPlanRegCde(String planRegCde) {
        this.planRegCde = planRegCde;
    }

    public Sobterm withPlanRegCde(String planRegCde) {
        this.planRegCde = planRegCde;
        return this;
    }

    /**
     * Display Long Section Title
     * <p>
     * Lineage reference object : SOBTERM_LS_TITLE_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsTitleWebsDispInd")
    public String getLsTitleWebsDispInd() {
        return lsTitleWebsDispInd;
    }

    /**
     * Display Long Section Title
     * <p>
     * Lineage reference object : SOBTERM_LS_TITLE_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsTitleWebsDispInd")
    public void setLsTitleWebsDispInd(String lsTitleWebsDispInd) {
        this.lsTitleWebsDispInd = lsTitleWebsDispInd;
    }

    public Sobterm withLsTitleWebsDispInd(String lsTitleWebsDispInd) {
        this.lsTitleWebsDispInd = lsTitleWebsDispInd;
        return this;
    }

    /**
     * Display Long Section Description
     * <p>
     * Lineage reference object : SOBTERM_LS_DESC_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsDescWebsDispInd")
    public String getLsDescWebsDispInd() {
        return lsDescWebsDispInd;
    }

    /**
     * Display Long Section Description
     * <p>
     * Lineage reference object : SOBTERM_LS_DESC_WEBS_DISP_IND
     * 
     */
    @JsonProperty("lsDescWebsDispInd")
    public void setLsDescWebsDispInd(String lsDescWebsDispInd) {
        this.lsDescWebsDispInd = lsDescWebsDispInd;
    }

    public Sobterm withLsDescWebsDispInd(String lsDescWebsDispInd) {
        this.lsDescWebsDispInd = lsDescWebsDispInd;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_SEVERITY
     * 
     */
    @JsonProperty("campSeverity")
    public String getCampSeverity() {
        return campSeverity;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_SEVERITY
     * 
     */
    @JsonProperty("campSeverity")
    public void setCampSeverity(String campSeverity) {
        this.campSeverity = campSeverity;
    }

    public Sobterm withCampSeverity(String campSeverity) {
        this.campSeverity = campSeverity;
        return this;
    }

    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SOBTERM_MEXC_SEVERITY
     * 
     */
    @JsonProperty("mexcSeverity")
    public String getMexcSeverity() {
        return mexcSeverity;
    }

    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SOBTERM_MEXC_SEVERITY
     * 
     */
    @JsonProperty("mexcSeverity")
    public void setMexcSeverity(String mexcSeverity) {
        this.mexcSeverity = mexcSeverity;
    }

    public Sobterm withMexcSeverity(String mexcSeverity) {
        this.mexcSeverity = mexcSeverity;
        return this;
    }

    /**
     * Lineage reference object : SOBTERM_MAX_PLANS
     * 
     */
    @JsonProperty("maxPlans")
    public Double getMaxPlans() {
        return maxPlans;
    }

    /**
     * Lineage reference object : SOBTERM_MAX_PLANS
     * 
     */
    @JsonProperty("maxPlans")
    public void setMaxPlans(Double maxPlans) {
        this.maxPlans = maxPlans;
    }

    public Sobterm withMaxPlans(Double maxPlans) {
        this.maxPlans = maxPlans;
        return this;
    }

    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("attrWebSearchInd")
    public String getAttrWebSearchInd() {
        return attrWebSearchInd;
    }

    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("attrWebSearchInd")
    public void setAttrWebSearchInd(String attrWebSearchInd) {
        this.attrWebSearchInd = attrWebSearchInd;
    }

    public Sobterm withAttrWebSearchInd(String attrWebSearchInd) {
        this.attrWebSearchInd = attrWebSearchInd;
        return this;
    }

    /**
     * Display Class List
     * <p>
     * Lineage reference object : SOBTERM_CLASLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("claslstWebDispInd")
    public String getClaslstWebDispInd() {
        return claslstWebDispInd;
    }

    /**
     * Display Class List
     * <p>
     * Lineage reference object : SOBTERM_CLASLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("claslstWebDispInd")
    public void setClaslstWebDispInd(String claslstWebDispInd) {
        this.claslstWebDispInd = claslstWebDispInd;
    }

    public Sobterm withClaslstWebDispInd(String claslstWebDispInd) {
        this.claslstWebDispInd = claslstWebDispInd;
        return this;
    }

    /**
     * Search by College
     * <p>
     * Lineage reference object : SOBTERM_COLL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("collWebCatlSrchInd")
    public String getCollWebCatlSrchInd() {
        return collWebCatlSrchInd;
    }

    /**
     * Search by College
     * <p>
     * Lineage reference object : SOBTERM_COLL_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("collWebCatlSrchInd")
    public void setCollWebCatlSrchInd(String collWebCatlSrchInd) {
        this.collWebCatlSrchInd = collWebCatlSrchInd;
    }

    public Sobterm withCollWebCatlSrchInd(String collWebCatlSrchInd) {
        this.collWebCatlSrchInd = collWebCatlSrchInd;
        return this;
    }

    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_ADM_CREDIT_IND
     * 
     */
    @JsonProperty("assessAdmCreditInd")
    public String getAssessAdmCreditInd() {
        return assessAdmCreditInd;
    }

    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_ADM_CREDIT_IND
     * 
     */
    @JsonProperty("assessAdmCreditInd")
    public void setAssessAdmCreditInd(String assessAdmCreditInd) {
        this.assessAdmCreditInd = assessAdmCreditInd;
    }

    public Sobterm withAssessAdmCreditInd(String assessAdmCreditInd) {
        this.assessAdmCreditInd = assessAdmCreditInd;
        return this;
    }

    /**
     * Check third party degree audit system plans
     * <p>
     * Lineage reference object : SOBTERM_DEG_AUDIT_PLAN_CDE
     * 
     */
    @JsonProperty("degAuditPlanCde")
    public String getDegAuditPlanCde() {
        return degAuditPlanCde;
    }

    /**
     * Check third party degree audit system plans
     * <p>
     * Lineage reference object : SOBTERM_DEG_AUDIT_PLAN_CDE
     * 
     */
    @JsonProperty("degAuditPlanCde")
    public void setDegAuditPlanCde(String degAuditPlanCde) {
        this.degAuditPlanCde = degAuditPlanCde;
    }

    public Sobterm withDegAuditPlanCde(String degAuditPlanCde) {
        this.degAuditPlanCde = degAuditPlanCde;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBTERM_COLL_SEVERITY
     * 
     */
    @JsonProperty("collSeverity")
    public String getCollSeverity() {
        return collSeverity;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBTERM_COLL_SEVERITY
     * 
     */
    @JsonProperty("collSeverity")
    public void setCollSeverity(String collSeverity) {
        this.collSeverity = collSeverity;
    }

    public Sobterm withCollSeverity(String collSeverity) {
        this.collSeverity = collSeverity;
        return this;
    }

    /**
     * Display Long Course Title
     * <p>
     * Lineage reference object : SOBTERM_LC_TITLE_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcTitleWebcDispInd")
    public String getLcTitleWebcDispInd() {
        return lcTitleWebcDispInd;
    }

    /**
     * Display Long Course Title
     * <p>
     * Lineage reference object : SOBTERM_LC_TITLE_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcTitleWebcDispInd")
    public void setLcTitleWebcDispInd(String lcTitleWebcDispInd) {
        this.lcTitleWebcDispInd = lcTitleWebcDispInd;
    }

    public Sobterm withLcTitleWebcDispInd(String lcTitleWebcDispInd) {
        this.lcTitleWebcDispInd = lcTitleWebcDispInd;
        return this;
    }

    /**
     * Refund by Total
     * <p>
     * Lineage reference object : SOBTERM_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund by Total
     * <p>
     * Lineage reference object : SOBTERM_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public Sobterm withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * In Progress
     * <p>
     * Lineage reference object : SOBTERM_INPROGRESS_USAGE_IND
     * 
     */
    @JsonProperty("inprogressUsageInd")
    public String getInprogressUsageInd() {
        return inprogressUsageInd;
    }

    /**
     * In Progress
     * <p>
     * Lineage reference object : SOBTERM_INPROGRESS_USAGE_IND
     * 
     */
    @JsonProperty("inprogressUsageInd")
    public void setInprogressUsageInd(String inprogressUsageInd) {
        this.inprogressUsageInd = inprogressUsageInd;
    }

    public Sobterm withInprogressUsageInd(String inprogressUsageInd) {
        this.inprogressUsageInd = inprogressUsageInd;
        return this;
    }

    /**
     * Search by Instructional Method
     * <p>
     * Lineage reference object : SOBTERM_INSM_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("insmWebSearchInd")
    public String getInsmWebSearchInd() {
        return insmWebSearchInd;
    }

    /**
     * Search by Instructional Method
     * <p>
     * Lineage reference object : SOBTERM_INSM_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("insmWebSearchInd")
    public void setInsmWebSearchInd(String insmWebSearchInd) {
        this.insmWebSearchInd = insmWebSearchInd;
    }

    public Sobterm withInsmWebSearchInd(String insmWebSearchInd) {
        this.insmWebSearchInd = insmWebSearchInd;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBTERM_MINH_SEVERITY
     * 
     */
    @JsonProperty("minhSeverity")
    public String getMinhSeverity() {
        return minhSeverity;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBTERM_MINH_SEVERITY
     * 
     */
    @JsonProperty("minhSeverity")
    public void setMinhSeverity(String minhSeverity) {
        this.minhSeverity = minhSeverity;
    }

    public Sobterm withMinhSeverity(String minhSeverity) {
        this.minhSeverity = minhSeverity;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeAssessmntEffDate")
    public Date getFeeAssessmntEffDate() {
        return feeAssessmntEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeAssessmntEffDate")
    public void setFeeAssessmntEffDate(Date feeAssessmntEffDate) {
        this.feeAssessmntEffDate = feeAssessmntEffDate;
    }

    public Sobterm withFeeAssessmntEffDate(Date feeAssessmntEffDate) {
        this.feeAssessmntEffDate = feeAssessmntEffDate;
        return this;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : SOBTERM_PRINT_BILL_VR
     * 
     */
    @JsonProperty("printBillVr")
    public String getPrintBillVr() {
        return printBillVr;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : SOBTERM_PRINT_BILL_VR
     * 
     */
    @JsonProperty("printBillVr")
    public void setPrintBillVr(String printBillVr) {
        this.printBillVr = printBillVr;
    }

    public Sobterm withPrintBillVr(String printBillVr) {
        this.printBillVr = printBillVr;
        return this;
    }

    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_PROG_ATT_WEBC_SRCH_IND
     * 
     */
    @JsonProperty("progAttWebcSrchInd")
    public String getProgAttWebcSrchInd() {
        return progAttWebcSrchInd;
    }

    /**
     * Search by Course Attribute
     * <p>
     * Lineage reference object : SOBTERM_PROG_ATT_WEBC_SRCH_IND
     * 
     */
    @JsonProperty("progAttWebcSrchInd")
    public void setProgAttWebcSrchInd(String progAttWebcSrchInd) {
        this.progAttWebcSrchInd = progAttWebcSrchInd;
    }

    public Sobterm withProgAttWebcSrchInd(String progAttWebcSrchInd) {
        this.progAttWebcSrchInd = progAttWebcSrchInd;
        return this;
    }

    /**
     * Search by Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("campWebSearchInd")
    public String getCampWebSearchInd() {
        return campWebSearchInd;
    }

    /**
     * Search by Campus
     * <p>
     * Lineage reference object : SOBTERM_CAMP_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("campWebSearchInd")
    public void setCampWebSearchInd(String campWebSearchInd) {
        this.campWebSearchInd = campWebSearchInd;
    }

    public Sobterm withCampWebSearchInd(String campWebSearchInd) {
        this.campWebSearchInd = campWebSearchInd;
        return this;
    }

    /**
     * Display Closed Section
     * <p>
     * Lineage reference object : SOBTERM_CLOSECT_WEB_DISP_IND
     * 
     */
    @JsonProperty("closectWebDispInd")
    public String getClosectWebDispInd() {
        return closectWebDispInd;
    }

    /**
     * Display Closed Section
     * <p>
     * Lineage reference object : SOBTERM_CLOSECT_WEB_DISP_IND
     * 
     */
    @JsonProperty("closectWebDispInd")
    public void setClosectWebDispInd(String closectWebDispInd) {
        this.closectWebDispInd = closectWebDispInd;
    }

    public Sobterm withClosectWebDispInd(String closectWebDispInd) {
        this.closectWebDispInd = closectWebDispInd;
        return this;
    }

    /**
     * Change Grade Mode
     * <p>
     * Lineage reference object : SOBTERM_GMOD_WEB_UPD_IND
     * 
     */
    @JsonProperty("gmodWebUpdInd")
    public String getGmodWebUpdInd() {
        return gmodWebUpdInd;
    }

    /**
     * Change Grade Mode
     * <p>
     * Lineage reference object : SOBTERM_GMOD_WEB_UPD_IND
     * 
     */
    @JsonProperty("gmodWebUpdInd")
    public void setGmodWebUpdInd(String gmodWebUpdInd) {
        this.gmodWebUpdInd = gmodWebUpdInd;
    }

    public Sobterm withGmodWebUpdInd(String gmodWebUpdInd) {
        this.gmodWebUpdInd = gmodWebUpdInd;
        return this;
    }

    /**
     * Reverse Non Tuition/Fee Charges
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_REV_NRF_IND
     * 
     */
    @JsonProperty("assessRevNrfInd")
    public String getAssessRevNrfInd() {
        return assessRevNrfInd;
    }

    /**
     * Reverse Non Tuition/Fee Charges
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_REV_NRF_IND
     * 
     */
    @JsonProperty("assessRevNrfInd")
    public void setAssessRevNrfInd(String assessRevNrfInd) {
        this.assessRevNrfInd = assessRevNrfInd;
    }

    public Sobterm withAssessRevNrfInd(String assessRevNrfInd) {
        this.assessRevNrfInd = assessRevNrfInd;
        return this;
    }

    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    public Double getCrnOneup() {
        return crnOneup;
    }

    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    public void setCrnOneup(Double crnOneup) {
        this.crnOneup = crnOneup;
    }

    public Sobterm withCrnOneup(Double crnOneup) {
        this.crnOneup = crnOneup;
        return this;
    }

    /**
     * Display third party degree audit system plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_DA_REG_CDE
     * 
     */
    @JsonProperty("planDaRegCde")
    public String getPlanDaRegCde() {
        return planDaRegCde;
    }

    /**
     * Display third party degree audit system plans in registration
     * <p>
     * Lineage reference object : SOBTERM_PLAN_DA_REG_CDE
     * 
     */
    @JsonProperty("planDaRegCde")
    public void setPlanDaRegCde(String planDaRegCde) {
        this.planDaRegCde = planDaRegCde;
    }

    public Sobterm withPlanDaRegCde(String planDaRegCde) {
        this.planDaRegCde = planDaRegCde;
        return this;
    }

    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_SCHD_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("schdWebSearchInd")
    public String getSchdWebSearchInd() {
        return schdWebSearchInd;
    }

    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_SCHD_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("schdWebSearchInd")
    public void setSchdWebSearchInd(String schdWebSearchInd) {
        this.schdWebSearchInd = schdWebSearchInd;
    }

    public Sobterm withSchdWebSearchInd(String schdWebSearchInd) {
        this.schdWebSearchInd = schdWebSearchInd;
        return this;
    }

    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    public String getFeeAssessment() {
        return feeAssessment;
    }

    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    public void setFeeAssessment(String feeAssessment) {
        this.feeAssessment = feeAssessment;
    }

    public Sobterm withFeeAssessment(String feeAssessment) {
        this.feeAssessment = feeAssessment;
        return this;
    }

    /**
     * Search by Duration (Open Learning Only)
     * <p>
     * Lineage reference object : SOBTERM_DURATION_WEB_SRCH_IND
     * 
     */
    @JsonProperty("durationWebSrchInd")
    public String getDurationWebSrchInd() {
        return durationWebSrchInd;
    }

    /**
     * Search by Duration (Open Learning Only)
     * <p>
     * Lineage reference object : SOBTERM_DURATION_WEB_SRCH_IND
     * 
     */
    @JsonProperty("durationWebSrchInd")
    public void setDurationWebSrchInd(String durationWebSrchInd) {
        this.durationWebSrchInd = durationWebSrchInd;
    }

    public Sobterm withDurationWebSrchInd(String durationWebSrchInd) {
        this.durationWebSrchInd = durationWebSrchInd;
        return this;
    }

    /**
     * Calculate Time Status
     * <p>
     * Lineage reference object : SOBTERM_TMST_CALC_IND
     * 
     */
    @JsonProperty("tmstCalcInd")
    public String getTmstCalcInd() {
        return tmstCalcInd;
    }

    /**
     * Calculate Time Status
     * <p>
     * Lineage reference object : SOBTERM_TMST_CALC_IND
     * 
     */
    @JsonProperty("tmstCalcInd")
    public void setTmstCalcInd(String tmstCalcInd) {
        this.tmstCalcInd = tmstCalcInd;
    }

    public Sobterm withTmstCalcInd(String tmstCalcInd) {
        this.tmstCalcInd = tmstCalcInd;
        return this;
    }

    /**
     * Study Path Required
     * <p>
     * Lineage reference object : SOBTERM_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    public String getStudyPathInd() {
        return studyPathInd;
    }

    /**
     * Study Path Required
     * <p>
     * Lineage reference object : SOBTERM_STUDY_PATH_IND
     * 
     */
    @JsonProperty("studyPathInd")
    public void setStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
    }

    public Sobterm withStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
        return this;
    }

    /**
     * Display Long Course Description
     * <p>
     * Lineage reference object : SOBTERM_LC_DESC_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcDescWebcDispInd")
    public String getLcDescWebcDispInd() {
        return lcDescWebcDispInd;
    }

    /**
     * Display Long Course Description
     * <p>
     * Lineage reference object : SOBTERM_LC_DESC_WEBC_DISP_IND
     * 
     */
    @JsonProperty("lcDescWebcDispInd")
    public void setLcDescWebcDispInd(String lcDescWebcDispInd) {
        this.lcDescWebcDispInd = lcDescWebcDispInd;
    }

    public Sobterm withLcDescWebcDispInd(String lcDescWebcDispInd) {
        this.lcDescWebcDispInd = lcDescWebcDispInd;
        return this;
    }

    /**
     * Search by Instructor
     * <p>
     * Lineage reference object : SOBTERM_INSTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("instrWebSearchInd")
    public String getInstrWebSearchInd() {
        return instrWebSearchInd;
    }

    /**
     * Search by Instructor
     * <p>
     * Lineage reference object : SOBTERM_INSTR_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("instrWebSearchInd")
    public void setInstrWebSearchInd(String instrWebSearchInd) {
        this.instrWebSearchInd = instrWebSearchInd;
    }

    public Sobterm withInstrWebSearchInd(String instrWebSearchInd) {
        this.instrWebSearchInd = instrWebSearchInd;
        return this;
    }

    /**
     * Allow Approval/Overrides
     * <p>
     * Lineage reference object : SOBTERM_OVERAPP_WEB_UPD_IND
     * 
     */
    @JsonProperty("overappWebUpdInd")
    public String getOverappWebUpdInd() {
        return overappWebUpdInd;
    }

    /**
     * Allow Approval/Overrides
     * <p>
     * Lineage reference object : SOBTERM_OVERAPP_WEB_UPD_IND
     * 
     */
    @JsonProperty("overappWebUpdInd")
    public void setOverappWebUpdInd(String overappWebUpdInd) {
        this.overappWebUpdInd = overappWebUpdInd;
    }

    public Sobterm withOverappWebUpdInd(String overappWebUpdInd) {
        this.overappWebUpdInd = overappWebUpdInd;
        return this;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SOBTERM_REG_ALLOWED
     * 
     */
    @JsonProperty("regAllowed")
    public String getRegAllowed() {
        return regAllowed;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SOBTERM_REG_ALLOWED
     * 
     */
    @JsonProperty("regAllowed")
    public void setRegAllowed(String regAllowed) {
        this.regAllowed = regAllowed;
    }

    public Sobterm withRegAllowed(String regAllowed) {
        this.regAllowed = regAllowed;
        return this;
    }

    /**
     * Links
     * <p>
     * Lineage reference object : SOBTERM_LINK_SEVERITY
     * 
     */
    @JsonProperty("linkSeverity")
    public String getLinkSeverity() {
        return linkSeverity;
    }

    /**
     * Links
     * <p>
     * Lineage reference object : SOBTERM_LINK_SEVERITY
     * 
     */
    @JsonProperty("linkSeverity")
    public void setLinkSeverity(String linkSeverity) {
        this.linkSeverity = linkSeverity;
    }

    public Sobterm withLinkSeverity(String linkSeverity) {
        this.linkSeverity = linkSeverity;
        return this;
    }

    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SS_CREDIT_IND
     * 
     */
    @JsonProperty("assessSsCreditInd")
    public String getAssessSsCreditInd() {
        return assessSsCreditInd;
    }

    /**
     * Process Credits Online
     * <p>
     * Lineage reference object : SOBTERM_ASSESS_SS_CREDIT_IND
     * 
     */
    @JsonProperty("assessSsCreditInd")
    public void setAssessSsCreditInd(String assessSsCreditInd) {
        this.assessSsCreditInd = assessSsCreditInd;
    }

    public Sobterm withAssessSsCreditInd(String assessSsCreditInd) {
        this.assessSsCreditInd = assessSsCreditInd;
        return this;
    }

    /**
     * Process Gradebook Controls
     * <p>
     * 
     * 
     */
    @JsonProperty("processGradeBook")
    public String getProcessGradeBook() {
        return processGradeBook;
    }

    /**
     * Process Gradebook Controls
     * <p>
     * 
     * 
     */
    @JsonProperty("processGradeBook")
    public void setProcessGradeBook(String processGradeBook) {
        this.processGradeBook = processGradeBook;
    }

    public Sobterm withProcessGradeBook(String processGradeBook) {
        this.processGradeBook = processGradeBook;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SOBTERM_CHRT_SEVERITY
     * 
     */
    @JsonProperty("chrtSeverity")
    public String getChrtSeverity() {
        return chrtSeverity;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SOBTERM_CHRT_SEVERITY
     * 
     */
    @JsonProperty("chrtSeverity")
    public void setChrtSeverity(String chrtSeverity) {
        this.chrtSeverity = chrtSeverity;
    }

    public Sobterm withChrtSeverity(String chrtSeverity) {
        this.chrtSeverity = chrtSeverity;
        return this;
    }

    /**
     * Future Terms for Repeats
     * <p>
     * Lineage reference object : SOBTERM_FUTURE_REPEAT_IND
     * 
     */
    @JsonProperty("futureRepeatInd")
    public String getFutureRepeatInd() {
        return futureRepeatInd;
    }

    /**
     * Future Terms for Repeats
     * <p>
     * Lineage reference object : SOBTERM_FUTURE_REPEAT_IND
     * 
     */
    @JsonProperty("futureRepeatInd")
    public void setFutureRepeatInd(String futureRepeatInd) {
        this.futureRepeatInd = futureRepeatInd;
    }

    public Sobterm withFutureRepeatInd(String futureRepeatInd) {
        this.futureRepeatInd = futureRepeatInd;
        return this;
    }

    /**
     * Search by Session
     * <p>
     * Lineage reference object : SOBTERM_SESS_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("sessWebSearchInd")
    public String getSessWebSearchInd() {
        return sessWebSearchInd;
    }

    /**
     * Search by Session
     * <p>
     * Lineage reference object : SOBTERM_SESS_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("sessWebSearchInd")
    public void setSessWebSearchInd(String sessWebSearchInd) {
        this.sessWebSearchInd = sessWebSearchInd;
    }

    public Sobterm withSessWebSearchInd(String sessWebSearchInd) {
        this.sessWebSearchInd = sessWebSearchInd;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SOBTERM_CLAS_SEVERITY
     * 
     */
    @JsonProperty("clasSeverity")
    public String getClasSeverity() {
        return clasSeverity;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SOBTERM_CLAS_SEVERITY
     * 
     */
    @JsonProperty("clasSeverity")
    public void setClasSeverity(String clasSeverity) {
        this.clasSeverity = clasSeverity;
    }

    public Sobterm withClasSeverity(String clasSeverity) {
        this.clasSeverity = clasSeverity;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_SEVERITY
     * 
     */
    @JsonProperty("levlSeverity")
    public String getLevlSeverity() {
        return levlSeverity;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_SEVERITY
     * 
     */
    @JsonProperty("levlSeverity")
    public void setLevlSeverity(String levlSeverity) {
        this.levlSeverity = levlSeverity;
    }

    public Sobterm withLevlSeverity(String levlSeverity) {
        this.levlSeverity = levlSeverity;
        return this;
    }

    /**
     * Term open for Self-Service planning
     * <p>
     * Lineage reference object : SOBTERM_PLAN_TERM_OPEN_CDE
     * 
     */
    @JsonProperty("planTermOpenCde")
    public String getPlanTermOpenCde() {
        return planTermOpenCde;
    }

    /**
     * Term open for Self-Service planning
     * <p>
     * Lineage reference object : SOBTERM_PLAN_TERM_OPEN_CDE
     * 
     */
    @JsonProperty("planTermOpenCde")
    public void setPlanTermOpenCde(String planTermOpenCde) {
        this.planTermOpenCde = planTermOpenCde;
    }

    public Sobterm withPlanTermOpenCde(String planTermOpenCde) {
        this.planTermOpenCde = planTermOpenCde;
        return this;
    }

    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESS_VR
     * 
     */
    @JsonProperty("feeAssessVr")
    public String getFeeAssessVr() {
        return feeAssessVr;
    }

    /**
     * On-line Assessment
     * <p>
     * Lineage reference object : SOBTERM_FEE_ASSESS_VR
     * 
     */
    @JsonProperty("feeAssessVr")
    public void setFeeAssessVr(String feeAssessVr) {
        this.feeAssessVr = feeAssessVr;
    }

    public Sobterm withFeeAssessVr(String feeAssessVr) {
        this.feeAssessVr = feeAssessVr;
        return this;
    }

    /**
     * Re-Admit
     * <p>
     * Lineage reference object : SOBTERM_READM_REQ
     * 
     */
    @JsonProperty("readmReq")
    public String getReadmReq() {
        return readmReq;
    }

    /**
     * Re-Admit
     * <p>
     * Lineage reference object : SOBTERM_READM_REQ
     * 
     */
    @JsonProperty("readmReq")
    public void setReadmReq(String readmReq) {
        this.readmReq = readmReq;
    }

    public Sobterm withReadmReq(String readmReq) {
        this.readmReq = readmReq;
        return this;
    }

    /**
     * Lineage reference object : SOBTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobterm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_SEVERITY
     * 
     */
    @JsonProperty("deptSeverity")
    public String getDeptSeverity() {
        return deptSeverity;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_SEVERITY
     * 
     */
    @JsonProperty("deptSeverity")
    public void setDeptSeverity(String deptSeverity) {
        this.deptSeverity = deptSeverity;
    }

    public Sobterm withDeptSeverity(String deptSeverity) {
        this.deptSeverity = deptSeverity;
        return this;
    }

    /**
     * Change Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_UPD_IND
     * 
     */
    @JsonProperty("levlWebUpdInd")
    public String getLevlWebUpdInd() {
        return levlWebUpdInd;
    }

    /**
     * Change Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_UPD_IND
     * 
     */
    @JsonProperty("levlWebUpdInd")
    public void setLevlWebUpdInd(String levlWebUpdInd) {
        this.levlWebUpdInd = levlWebUpdInd;
    }

    public Sobterm withLevlWebUpdInd(String levlWebUpdInd) {
        this.levlWebUpdInd = levlWebUpdInd;
        return this;
    }

    /**
     * Administration Drop Connected Course Errors
     * <p>
     * Lineage reference object : SOBTERM_ADMIN_DROP_CDE
     * 
     */
    @JsonProperty("adminDropCde")
    public String getAdminDropCde() {
        return adminDropCde;
    }

    /**
     * Administration Drop Connected Course Errors
     * <p>
     * Lineage reference object : SOBTERM_ADMIN_DROP_CDE
     * 
     */
    @JsonProperty("adminDropCde")
    public void setAdminDropCde(String adminDropCde) {
        this.adminDropCde = adminDropCde;
    }

    public Sobterm withAdminDropCde(String adminDropCde) {
        this.adminDropCde = adminDropCde;
        return this;
    }

    /**
     * Lineage reference object : SOBTERM_AUTO_DROP_CDE
     * 
     */
    @JsonProperty("autoDropCde")
    public String getAutoDropCde() {
        return autoDropCde;
    }

    /**
     * Lineage reference object : SOBTERM_AUTO_DROP_CDE
     * 
     */
    @JsonProperty("autoDropCde")
    public void setAutoDropCde(String autoDropCde) {
        this.autoDropCde = autoDropCde;
    }

    public Sobterm withAutoDropCde(String autoDropCde) {
        this.autoDropCde = autoDropCde;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOBTERM_MAJR_SEVERITY
     * 
     */
    @JsonProperty("majrSeverity")
    public String getMajrSeverity() {
        return majrSeverity;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOBTERM_MAJR_SEVERITY
     * 
     */
    @JsonProperty("majrSeverity")
    public void setMajrSeverity(String majrSeverity) {
        this.majrSeverity = majrSeverity;
    }

    public Sobterm withMajrSeverity(String majrSeverity) {
        this.majrSeverity = majrSeverity;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBTERM_MAXH_SEVERITY
     * 
     */
    @JsonProperty("maxhSeverity")
    public String getMaxhSeverity() {
        return maxhSeverity;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBTERM_MAXH_SEVERITY
     * 
     */
    @JsonProperty("maxhSeverity")
    public void setMaxhSeverity(String maxhSeverity) {
        this.maxhSeverity = maxhSeverity;
    }

    public Sobterm withMaxhSeverity(String maxhSeverity) {
        this.maxhSeverity = maxhSeverity;
        return this;
    }

    /**
     * Web Catalog Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_CATLG_IND
     * 
     */
    @JsonProperty("webCappCatlgInd")
    public String getWebCappCatlgInd() {
        return webCappCatlgInd;
    }

    /**
     * Web Catalog Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_CATLG_IND
     * 
     */
    @JsonProperty("webCappCatlgInd")
    public void setWebCappCatlgInd(String webCappCatlgInd) {
        this.webCappCatlgInd = webCappCatlgInd;
    }

    public Sobterm withWebCappCatlgInd(String webCappCatlgInd) {
        this.webCappCatlgInd = webCappCatlgInd;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : SOBTERM_HOLD_SEVERITY
     * 
     */
    @JsonProperty("holdSeverity")
    public String getHoldSeverity() {
        return holdSeverity;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : SOBTERM_HOLD_SEVERITY
     * 
     */
    @JsonProperty("holdSeverity")
    public void setHoldSeverity(String holdSeverity) {
        this.holdSeverity = holdSeverity;
    }

    public Sobterm withHoldSeverity(String holdSeverity) {
        this.holdSeverity = holdSeverity;
        return this;
    }

    /**
     * Allow Student to Drop their Last Class
     * <p>
     * Lineage reference object : SOBTERM_DROP_LAST_CLASS_CDE
     * 
     */
    @JsonProperty("dropLastClassCde")
    public String getDropLastClassCde() {
        return dropLastClassCde;
    }

    /**
     * Allow Student to Drop their Last Class
     * <p>
     * Lineage reference object : SOBTERM_DROP_LAST_CLASS_CDE
     * 
     */
    @JsonProperty("dropLastClassCde")
    public void setDropLastClassCde(String dropLastClassCde) {
        this.dropLastClassCde = dropLastClassCde;
    }

    public Sobterm withDropLastClassCde(String dropLastClassCde) {
        this.dropLastClassCde = dropLastClassCde;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTS_SEVERITY
     * 
     */
    @JsonProperty("attsSeverity")
    public String getAttsSeverity() {
        return attsSeverity;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SOBTERM_ATTS_SEVERITY
     * 
     */
    @JsonProperty("attsSeverity")
    public void setAttsSeverity(String attsSeverity) {
        this.attsSeverity = attsSeverity;
    }

    public Sobterm withAttsSeverity(String attsSeverity) {
        this.attsSeverity = attsSeverity;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SOBTERM_TIME_SEVERITY
     * 
     */
    @JsonProperty("timeSeverity")
    public String getTimeSeverity() {
        return timeSeverity;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SOBTERM_TIME_SEVERITY
     * 
     */
    @JsonProperty("timeSeverity")
    public void setTimeSeverity(String timeSeverity) {
        this.timeSeverity = timeSeverity;
    }

    public Sobterm withTimeSeverity(String timeSeverity) {
        this.timeSeverity = timeSeverity;
        return this;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SOBTERM_PROJECTED_MODEL_IND
     * 
     */
    @JsonProperty("projectedModelInd")
    public String getProjectedModelInd() {
        return projectedModelInd;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SOBTERM_PROJECTED_MODEL_IND
     * 
     */
    @JsonProperty("projectedModelInd")
    public void setProjectedModelInd(String projectedModelInd) {
        this.projectedModelInd = projectedModelInd;
    }

    public Sobterm withProjectedModelInd(String projectedModelInd) {
        this.projectedModelInd = projectedModelInd;
        return this;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SOBTERM_REPT_SEVERITY
     * 
     */
    @JsonProperty("reptSeverity")
    public String getReptSeverity() {
        return reptSeverity;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SOBTERM_REPT_SEVERITY
     * 
     */
    @JsonProperty("reptSeverity")
    public void setReptSeverity(String reptSeverity) {
        this.reptSeverity = reptSeverity;
    }

    public Sobterm withReptSeverity(String reptSeverity) {
        this.reptSeverity = reptSeverity;
        return this;
    }

    /**
     * Search by Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("deptWebCatlSrchInd")
    public String getDeptWebCatlSrchInd() {
        return deptWebCatlSrchInd;
    }

    /**
     * Search by Department
     * <p>
     * Lineage reference object : SOBTERM_DEPT_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("deptWebCatlSrchInd")
    public void setDeptWebCatlSrchInd(String deptWebCatlSrchInd) {
        this.deptWebCatlSrchInd = deptWebCatlSrchInd;
    }

    public Sobterm withDeptWebCatlSrchInd(String deptWebCatlSrchInd) {
        this.deptWebCatlSrchInd = deptWebCatlSrchInd;
        return this;
    }

    /**
     * Search by Division
     * <p>
     * Lineage reference object : SOBTERM_DIV_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("divWebCatlSrchInd")
    public String getDivWebCatlSrchInd() {
        return divWebCatlSrchInd;
    }

    /**
     * Search by Division
     * <p>
     * Lineage reference object : SOBTERM_DIV_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("divWebCatlSrchInd")
    public void setDivWebCatlSrchInd(String divWebCatlSrchInd) {
        this.divWebCatlSrchInd = divWebCatlSrchInd;
    }

    public Sobterm withDivWebCatlSrchInd(String divWebCatlSrchInd) {
        this.divWebCatlSrchInd = divWebCatlSrchInd;
        return this;
    }

    /**
     * Basic
     * <p>
     * Lineage reference object : SOBTERM_REGULAR_MODEL_IND
     * 
     */
    @JsonProperty("regularModelInd")
    public String getRegularModelInd() {
        return regularModelInd;
    }

    /**
     * Basic
     * <p>
     * Lineage reference object : SOBTERM_REGULAR_MODEL_IND
     * 
     */
    @JsonProperty("regularModelInd")
    public void setRegularModelInd(String regularModelInd) {
        this.regularModelInd = regularModelInd;
    }

    public Sobterm withRegularModelInd(String regularModelInd) {
        this.regularModelInd = regularModelInd;
        return this;
    }

    /**
     * Allow adding course sections to plan
     * <p>
     * Lineage reference object : SOBTERM_SEC_ALLOWED_PLAN_CDE
     * 
     */
    @JsonProperty("secAllowedPlanCde")
    public String getSecAllowedPlanCde() {
        return secAllowedPlanCde;
    }

    /**
     * Allow adding course sections to plan
     * <p>
     * Lineage reference object : SOBTERM_SEC_ALLOWED_PLAN_CDE
     * 
     */
    @JsonProperty("secAllowedPlanCde")
    public void setSecAllowedPlanCde(String secAllowedPlanCde) {
        this.secAllowedPlanCde = secAllowedPlanCde;
    }

    public Sobterm withSecAllowedPlanCde(String secAllowedPlanCde) {
        this.secAllowedPlanCde = secAllowedPlanCde;
        return this;
    }

    /**
     * Change Credit Hours
     * <p>
     * Lineage reference object : SOBTERM_CRED_WEB_UPD_IND
     * 
     */
    @JsonProperty("credWebUpdInd")
    public String getCredWebUpdInd() {
        return credWebUpdInd;
    }

    /**
     * Change Credit Hours
     * <p>
     * Lineage reference object : SOBTERM_CRED_WEB_UPD_IND
     * 
     */
    @JsonProperty("credWebUpdInd")
    public void setCredWebUpdInd(String credWebUpdInd) {
        this.credWebUpdInd = credWebUpdInd;
    }

    public Sobterm withCredWebUpdInd(String credWebUpdInd) {
        this.credWebUpdInd = credWebUpdInd;
        return this;
    }

    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_STYP_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("stypWebCatlSrchInd")
    public String getStypWebCatlSrchInd() {
        return stypWebCatlSrchInd;
    }

    /**
     * Search by Schedule Type
     * <p>
     * Lineage reference object : SOBTERM_STYP_WEB_CATL_SRCH_IND
     * 
     */
    @JsonProperty("stypWebCatlSrchInd")
    public void setStypWebCatlSrchInd(String stypWebCatlSrchInd) {
        this.stypWebCatlSrchInd = stypWebCatlSrchInd;
    }

    public Sobterm withStypWebCatlSrchInd(String stypWebCatlSrchInd) {
        this.stypWebCatlSrchInd = stypWebCatlSrchInd;
        return this;
    }

    /**
     * Web Evaluation Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_TERM_IND
     * 
     */
    @JsonProperty("webCappTermInd")
    public String getWebCappTermInd() {
        return webCappTermInd;
    }

    /**
     * Web Evaluation Term
     * <p>
     * Lineage reference object : SOBTERM_WEB_CAPP_TERM_IND
     * 
     */
    @JsonProperty("webCappTermInd")
    public void setWebCappTermInd(String webCappTermInd) {
        this.webCappTermInd = webCappTermInd;
    }

    public Sobterm withWebCappTermInd(String webCappTermInd) {
        this.webCappTermInd = webCappTermInd;
        return this;
    }

    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SOBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    public Date getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SOBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    public void setCutoffDate(Date cutoffDate) {
        this.cutoffDate = cutoffDate;
    }

    public Sobterm withCutoffDate(Date cutoffDate) {
        this.cutoffDate = cutoffDate;
        return this;
    }

    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("levlWebSearchInd")
    public String getLevlWebSearchInd() {
        return levlWebSearchInd;
    }

    /**
     * Search by Level
     * <p>
     * Lineage reference object : SOBTERM_LEVL_WEB_SEARCH_IND
     * 
     */
    @JsonProperty("levlWebSearchInd")
    public void setLevlWebSearchInd(String levlWebSearchInd) {
        this.levlWebSearchInd = levlWebSearchInd;
    }

    public Sobterm withLevlWebSearchInd(String levlWebSearchInd) {
        this.levlWebSearchInd = levlWebSearchInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOBTERM_PROGRAM_SEVERITY
     * 
     */
    @JsonProperty("programSeverity")
    public String getProgramSeverity() {
        return programSeverity;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOBTERM_PROGRAM_SEVERITY
     * 
     */
    @JsonProperty("programSeverity")
    public void setProgramSeverity(String programSeverity) {
        this.programSeverity = programSeverity;
    }

    public Sobterm withProgramSeverity(String programSeverity) {
        this.programSeverity = programSeverity;
        return this;
    }

    /**
     * Change Study Path
     * <p>
     * Lineage reference object : SOBTERM_SP_WEB_UPD_IND
     * 
     */
    @JsonProperty("spWebUpdInd")
    public String getSpWebUpdInd() {
        return spWebUpdInd;
    }

    /**
     * Change Study Path
     * <p>
     * Lineage reference object : SOBTERM_SP_WEB_UPD_IND
     * 
     */
    @JsonProperty("spWebUpdInd")
    public void setSpWebUpdInd(String spWebUpdInd) {
        this.spWebUpdInd = spWebUpdInd;
    }

    public Sobterm withSpWebUpdInd(String spWebUpdInd) {
        this.spWebUpdInd = spWebUpdInd;
        return this;
    }

    /**
     * Corequisites
     * <p>
     * Lineage reference object : SOBTERM_CORQ_SEVERITY
     * 
     */
    @JsonProperty("corqSeverity")
    public String getCorqSeverity() {
        return corqSeverity;
    }

    /**
     * Corequisites
     * <p>
     * Lineage reference object : SOBTERM_CORQ_SEVERITY
     * 
     */
    @JsonProperty("corqSeverity")
    public void setCorqSeverity(String corqSeverity) {
        this.corqSeverity = corqSeverity;
    }

    public Sobterm withCorqSeverity(String corqSeverity) {
        this.corqSeverity = corqSeverity;
        return this;
    }

    /**
     * Structured
     * <p>
     * Lineage reference object : SOBTERM_STRUCTURED_MODEL_IND
     * 
     */
    @JsonProperty("structuredModelInd")
    public String getStructuredModelInd() {
        return structuredModelInd;
    }

    /**
     * Structured
     * <p>
     * Lineage reference object : SOBTERM_STRUCTURED_MODEL_IND
     * 
     */
    @JsonProperty("structuredModelInd")
    public void setStructuredModelInd(String structuredModelInd) {
        this.structuredModelInd = structuredModelInd;
    }

    public Sobterm withStructuredModelInd(String structuredModelInd) {
        this.structuredModelInd = structuredModelInd;
        return this;
    }

    /**
     * Display Final Grades
     * <p>
     * Lineage reference object : SOBTERM_MAILER_WEB_IND
     * 
     */
    @JsonProperty("mailerWebInd")
    public String getMailerWebInd() {
        return mailerWebInd;
    }

    /**
     * Display Final Grades
     * <p>
     * Lineage reference object : SOBTERM_MAILER_WEB_IND
     * 
     */
    @JsonProperty("mailerWebInd")
    public void setMailerWebInd(String mailerWebInd) {
        this.mailerWebInd = mailerWebInd;
    }

    public Sobterm withMailerWebInd(String mailerWebInd) {
        this.mailerWebInd = mailerWebInd;
        return this;
    }

    /**
     * Track by CRN
     * <p>
     * Lineage reference object : SOBTERM_BYCRN_IND
     * 
     */
    @JsonProperty("bycrnInd")
    public String getBycrnInd() {
        return bycrnInd;
    }

    /**
     * Track by CRN
     * <p>
     * Lineage reference object : SOBTERM_BYCRN_IND
     * 
     */
    @JsonProperty("bycrnInd")
    public void setBycrnInd(String bycrnInd) {
        this.bycrnInd = bycrnInd;
    }

    public Sobterm withBycrnInd(String bycrnInd) {
        this.bycrnInd = bycrnInd;
        return this;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SOBTERM_RPTH_SEVERITY
     * 
     */
    @JsonProperty("rpthSeverity")
    public String getRpthSeverity() {
        return rpthSeverity;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SOBTERM_RPTH_SEVERITY
     * 
     */
    @JsonProperty("rpthSeverity")
    public void setRpthSeverity(String rpthSeverity) {
        this.rpthSeverity = rpthSeverity;
    }

    public Sobterm withRpthSeverity(String rpthSeverity) {
        this.rpthSeverity = rpthSeverity;
        return this;
    }

    /**
     * Master Web Term Control
     * <p>
     * Lineage reference object : SOBTERM_DYNAMIC_SCHED_TERM_IND
     * 
     */
    @JsonProperty("dynamicSchedTermInd")
    public String getDynamicSchedTermInd() {
        return dynamicSchedTermInd;
    }

    /**
     * Master Web Term Control
     * <p>
     * Lineage reference object : SOBTERM_DYNAMIC_SCHED_TERM_IND
     * 
     */
    @JsonProperty("dynamicSchedTermInd")
    public void setDynamicSchedTermInd(String dynamicSchedTermInd) {
        this.dynamicSchedTermInd = dynamicSchedTermInd;
    }

    public Sobterm withDynamicSchedTermInd(String dynamicSchedTermInd) {
        this.dynamicSchedTermInd = dynamicSchedTermInd;
        return this;
    }

    /**
     * Display Schedule
     * <p>
     * Lineage reference object : SOBTERM_FACSCHD_WEB_DISP_IND
     * 
     */
    @JsonProperty("facschdWebDispInd")
    public String getFacschdWebDispInd() {
        return facschdWebDispInd;
    }

    /**
     * Display Schedule
     * <p>
     * Lineage reference object : SOBTERM_FACSCHD_WEB_DISP_IND
     * 
     */
    @JsonProperty("facschdWebDispInd")
    public void setFacschdWebDispInd(String facschdWebDispInd) {
        this.facschdWebDispInd = facschdWebDispInd;
    }

    public Sobterm withFacschdWebDispInd(String facschdWebDispInd) {
        this.facschdWebDispInd = facschdWebDispInd;
        return this;
    }

    /**
     * Display Midterm Grades
     * <p>
     * Lineage reference object : SOBTERM_MIDTERM_WEB_IND
     * 
     */
    @JsonProperty("midtermWebInd")
    public String getMidtermWebInd() {
        return midtermWebInd;
    }

    /**
     * Display Midterm Grades
     * <p>
     * Lineage reference object : SOBTERM_MIDTERM_WEB_IND
     * 
     */
    @JsonProperty("midtermWebInd")
    public void setMidtermWebInd(String midtermWebInd) {
        this.midtermWebInd = midtermWebInd;
    }

    public Sobterm withMidtermWebInd(String midtermWebInd) {
        this.midtermWebInd = midtermWebInd;
        return this;
    }

    /**
     * Prerequisites
     * <p>
     * Lineage reference object : SOBTERM_PREQ_SEVERITY
     * 
     */
    @JsonProperty("preqSeverity")
    public String getPreqSeverity() {
        return preqSeverity;
    }

    /**
     * Prerequisites
     * <p>
     * Lineage reference object : SOBTERM_PREQ_SEVERITY
     * 
     */
    @JsonProperty("preqSeverity")
    public void setPreqSeverity(String preqSeverity) {
        this.preqSeverity = preqSeverity;
    }

    public Sobterm withPreqSeverity(String preqSeverity) {
        this.preqSeverity = preqSeverity;
        return this;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SOBTERM_APPR_SEVERITY
     * 
     */
    @JsonProperty("apprSeverity")
    public String getApprSeverity() {
        return apprSeverity;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SOBTERM_APPR_SEVERITY
     * 
     */
    @JsonProperty("apprSeverity")
    public void setApprSeverity(String apprSeverity) {
        this.apprSeverity = apprSeverity;
    }

    public Sobterm withApprSeverity(String apprSeverity) {
        this.apprSeverity = apprSeverity;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBTERM_DEGREE_SEVERITY
     * 
     */
    @JsonProperty("degreeSeverity")
    public String getDegreeSeverity() {
        return degreeSeverity;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOBTERM_DEGREE_SEVERITY
     * 
     */
    @JsonProperty("degreeSeverity")
    public void setDegreeSeverity(String degreeSeverity) {
        this.degreeSeverity = degreeSeverity;
    }

    public Sobterm withDegreeSeverity(String degreeSeverity) {
        this.degreeSeverity = degreeSeverity;
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

    public Sobterm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobterm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("condAddDropCde");
        sb.append('=');
        sb.append(((this.condAddDropCde == null)?"<null>":this.condAddDropCde));
        sb.append(',');
        sb.append("gradeDetailWebInd");
        sb.append('=');
        sb.append(((this.gradeDetailWebInd == null)?"<null>":this.gradeDetailWebInd));
        sb.append(',');
        sb.append("tivDateSource");
        sb.append('=');
        sb.append(((this.tivDateSource == null)?"<null>":this.tivDateSource));
        sb.append(',');
        sb.append("capcSeverity");
        sb.append('=');
        sb.append(((this.capcSeverity == null)?"<null>":this.capcSeverity));
        sb.append(',');
        sb.append("assessSwapInd");
        sb.append('=');
        sb.append(((this.assessSwapInd == null)?"<null>":this.assessSwapInd));
        sb.append(',');
        sb.append("sectionfeeInd");
        sb.append('=');
        sb.append(((this.sectionfeeInd == null)?"<null>":this.sectionfeeInd));
        sb.append(',');
        sb.append("duplSeverity");
        sb.append('=');
        sb.append(((this.duplSeverity == null)?"<null>":this.duplSeverity));
        sb.append(',');
        sb.append("inclAttmptHrsInd");
        sb.append('=');
        sb.append(((this.inclAttmptHrsInd == null)?"<null>":this.inclAttmptHrsInd));
        sb.append(',');
        sb.append("calcDropActCde");
        sb.append('=');
        sb.append(((this.calcDropActCde == null)?"<null>":this.calcDropActCde));
        sb.append(',');
        sb.append("hold");
        sb.append('=');
        sb.append(((this.hold == null)?"<null>":this.hold));
        sb.append(',');
        sb.append("levlWebCatlSrchInd");
        sb.append('=');
        sb.append(((this.levlWebCatlSrchInd == null)?"<null>":this.levlWebCatlSrchInd));
        sb.append(',');
        sb.append("addDrpWebUpdInd");
        sb.append('=');
        sb.append(((this.addDrpWebUpdInd == null)?"<null>":this.addDrpWebUpdInd));
        sb.append(',');
        sb.append("planRegCde");
        sb.append('=');
        sb.append(((this.planRegCde == null)?"<null>":this.planRegCde));
        sb.append(',');
        sb.append("lsTitleWebsDispInd");
        sb.append('=');
        sb.append(((this.lsTitleWebsDispInd == null)?"<null>":this.lsTitleWebsDispInd));
        sb.append(',');
        sb.append("lsDescWebsDispInd");
        sb.append('=');
        sb.append(((this.lsDescWebsDispInd == null)?"<null>":this.lsDescWebsDispInd));
        sb.append(',');
        sb.append("campSeverity");
        sb.append('=');
        sb.append(((this.campSeverity == null)?"<null>":this.campSeverity));
        sb.append(',');
        sb.append("mexcSeverity");
        sb.append('=');
        sb.append(((this.mexcSeverity == null)?"<null>":this.mexcSeverity));
        sb.append(',');
        sb.append("maxPlans");
        sb.append('=');
        sb.append(((this.maxPlans == null)?"<null>":this.maxPlans));
        sb.append(',');
        sb.append("attrWebSearchInd");
        sb.append('=');
        sb.append(((this.attrWebSearchInd == null)?"<null>":this.attrWebSearchInd));
        sb.append(',');
        sb.append("claslstWebDispInd");
        sb.append('=');
        sb.append(((this.claslstWebDispInd == null)?"<null>":this.claslstWebDispInd));
        sb.append(',');
        sb.append("collWebCatlSrchInd");
        sb.append('=');
        sb.append(((this.collWebCatlSrchInd == null)?"<null>":this.collWebCatlSrchInd));
        sb.append(',');
        sb.append("assessAdmCreditInd");
        sb.append('=');
        sb.append(((this.assessAdmCreditInd == null)?"<null>":this.assessAdmCreditInd));
        sb.append(',');
        sb.append("degAuditPlanCde");
        sb.append('=');
        sb.append(((this.degAuditPlanCde == null)?"<null>":this.degAuditPlanCde));
        sb.append(',');
        sb.append("collSeverity");
        sb.append('=');
        sb.append(((this.collSeverity == null)?"<null>":this.collSeverity));
        sb.append(',');
        sb.append("lcTitleWebcDispInd");
        sb.append('=');
        sb.append(((this.lcTitleWebcDispInd == null)?"<null>":this.lcTitleWebcDispInd));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("inprogressUsageInd");
        sb.append('=');
        sb.append(((this.inprogressUsageInd == null)?"<null>":this.inprogressUsageInd));
        sb.append(',');
        sb.append("insmWebSearchInd");
        sb.append('=');
        sb.append(((this.insmWebSearchInd == null)?"<null>":this.insmWebSearchInd));
        sb.append(',');
        sb.append("minhSeverity");
        sb.append('=');
        sb.append(((this.minhSeverity == null)?"<null>":this.minhSeverity));
        sb.append(',');
        sb.append("feeAssessmntEffDate");
        sb.append('=');
        sb.append(((this.feeAssessmntEffDate == null)?"<null>":this.feeAssessmntEffDate));
        sb.append(',');
        sb.append("printBillVr");
        sb.append('=');
        sb.append(((this.printBillVr == null)?"<null>":this.printBillVr));
        sb.append(',');
        sb.append("progAttWebcSrchInd");
        sb.append('=');
        sb.append(((this.progAttWebcSrchInd == null)?"<null>":this.progAttWebcSrchInd));
        sb.append(',');
        sb.append("campWebSearchInd");
        sb.append('=');
        sb.append(((this.campWebSearchInd == null)?"<null>":this.campWebSearchInd));
        sb.append(',');
        sb.append("closectWebDispInd");
        sb.append('=');
        sb.append(((this.closectWebDispInd == null)?"<null>":this.closectWebDispInd));
        sb.append(',');
        sb.append("gmodWebUpdInd");
        sb.append('=');
        sb.append(((this.gmodWebUpdInd == null)?"<null>":this.gmodWebUpdInd));
        sb.append(',');
        sb.append("assessRevNrfInd");
        sb.append('=');
        sb.append(((this.assessRevNrfInd == null)?"<null>":this.assessRevNrfInd));
        sb.append(',');
        sb.append("crnOneup");
        sb.append('=');
        sb.append(((this.crnOneup == null)?"<null>":this.crnOneup));
        sb.append(',');
        sb.append("planDaRegCde");
        sb.append('=');
        sb.append(((this.planDaRegCde == null)?"<null>":this.planDaRegCde));
        sb.append(',');
        sb.append("schdWebSearchInd");
        sb.append('=');
        sb.append(((this.schdWebSearchInd == null)?"<null>":this.schdWebSearchInd));
        sb.append(',');
        sb.append("feeAssessment");
        sb.append('=');
        sb.append(((this.feeAssessment == null)?"<null>":this.feeAssessment));
        sb.append(',');
        sb.append("durationWebSrchInd");
        sb.append('=');
        sb.append(((this.durationWebSrchInd == null)?"<null>":this.durationWebSrchInd));
        sb.append(',');
        sb.append("tmstCalcInd");
        sb.append('=');
        sb.append(((this.tmstCalcInd == null)?"<null>":this.tmstCalcInd));
        sb.append(',');
        sb.append("studyPathInd");
        sb.append('=');
        sb.append(((this.studyPathInd == null)?"<null>":this.studyPathInd));
        sb.append(',');
        sb.append("lcDescWebcDispInd");
        sb.append('=');
        sb.append(((this.lcDescWebcDispInd == null)?"<null>":this.lcDescWebcDispInd));
        sb.append(',');
        sb.append("instrWebSearchInd");
        sb.append('=');
        sb.append(((this.instrWebSearchInd == null)?"<null>":this.instrWebSearchInd));
        sb.append(',');
        sb.append("overappWebUpdInd");
        sb.append('=');
        sb.append(((this.overappWebUpdInd == null)?"<null>":this.overappWebUpdInd));
        sb.append(',');
        sb.append("regAllowed");
        sb.append('=');
        sb.append(((this.regAllowed == null)?"<null>":this.regAllowed));
        sb.append(',');
        sb.append("linkSeverity");
        sb.append('=');
        sb.append(((this.linkSeverity == null)?"<null>":this.linkSeverity));
        sb.append(',');
        sb.append("assessSsCreditInd");
        sb.append('=');
        sb.append(((this.assessSsCreditInd == null)?"<null>":this.assessSsCreditInd));
        sb.append(',');
        sb.append("processGradeBook");
        sb.append('=');
        sb.append(((this.processGradeBook == null)?"<null>":this.processGradeBook));
        sb.append(',');
        sb.append("chrtSeverity");
        sb.append('=');
        sb.append(((this.chrtSeverity == null)?"<null>":this.chrtSeverity));
        sb.append(',');
        sb.append("futureRepeatInd");
        sb.append('=');
        sb.append(((this.futureRepeatInd == null)?"<null>":this.futureRepeatInd));
        sb.append(',');
        sb.append("sessWebSearchInd");
        sb.append('=');
        sb.append(((this.sessWebSearchInd == null)?"<null>":this.sessWebSearchInd));
        sb.append(',');
        sb.append("clasSeverity");
        sb.append('=');
        sb.append(((this.clasSeverity == null)?"<null>":this.clasSeverity));
        sb.append(',');
        sb.append("levlSeverity");
        sb.append('=');
        sb.append(((this.levlSeverity == null)?"<null>":this.levlSeverity));
        sb.append(',');
        sb.append("planTermOpenCde");
        sb.append('=');
        sb.append(((this.planTermOpenCde == null)?"<null>":this.planTermOpenCde));
        sb.append(',');
        sb.append("feeAssessVr");
        sb.append('=');
        sb.append(((this.feeAssessVr == null)?"<null>":this.feeAssessVr));
        sb.append(',');
        sb.append("readmReq");
        sb.append('=');
        sb.append(((this.readmReq == null)?"<null>":this.readmReq));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("deptSeverity");
        sb.append('=');
        sb.append(((this.deptSeverity == null)?"<null>":this.deptSeverity));
        sb.append(',');
        sb.append("levlWebUpdInd");
        sb.append('=');
        sb.append(((this.levlWebUpdInd == null)?"<null>":this.levlWebUpdInd));
        sb.append(',');
        sb.append("adminDropCde");
        sb.append('=');
        sb.append(((this.adminDropCde == null)?"<null>":this.adminDropCde));
        sb.append(',');
        sb.append("autoDropCde");
        sb.append('=');
        sb.append(((this.autoDropCde == null)?"<null>":this.autoDropCde));
        sb.append(',');
        sb.append("majrSeverity");
        sb.append('=');
        sb.append(((this.majrSeverity == null)?"<null>":this.majrSeverity));
        sb.append(',');
        sb.append("maxhSeverity");
        sb.append('=');
        sb.append(((this.maxhSeverity == null)?"<null>":this.maxhSeverity));
        sb.append(',');
        sb.append("webCappCatlgInd");
        sb.append('=');
        sb.append(((this.webCappCatlgInd == null)?"<null>":this.webCappCatlgInd));
        sb.append(',');
        sb.append("holdSeverity");
        sb.append('=');
        sb.append(((this.holdSeverity == null)?"<null>":this.holdSeverity));
        sb.append(',');
        sb.append("dropLastClassCde");
        sb.append('=');
        sb.append(((this.dropLastClassCde == null)?"<null>":this.dropLastClassCde));
        sb.append(',');
        sb.append("attsSeverity");
        sb.append('=');
        sb.append(((this.attsSeverity == null)?"<null>":this.attsSeverity));
        sb.append(',');
        sb.append("timeSeverity");
        sb.append('=');
        sb.append(((this.timeSeverity == null)?"<null>":this.timeSeverity));
        sb.append(',');
        sb.append("projectedModelInd");
        sb.append('=');
        sb.append(((this.projectedModelInd == null)?"<null>":this.projectedModelInd));
        sb.append(',');
        sb.append("reptSeverity");
        sb.append('=');
        sb.append(((this.reptSeverity == null)?"<null>":this.reptSeverity));
        sb.append(',');
        sb.append("deptWebCatlSrchInd");
        sb.append('=');
        sb.append(((this.deptWebCatlSrchInd == null)?"<null>":this.deptWebCatlSrchInd));
        sb.append(',');
        sb.append("divWebCatlSrchInd");
        sb.append('=');
        sb.append(((this.divWebCatlSrchInd == null)?"<null>":this.divWebCatlSrchInd));
        sb.append(',');
        sb.append("regularModelInd");
        sb.append('=');
        sb.append(((this.regularModelInd == null)?"<null>":this.regularModelInd));
        sb.append(',');
        sb.append("secAllowedPlanCde");
        sb.append('=');
        sb.append(((this.secAllowedPlanCde == null)?"<null>":this.secAllowedPlanCde));
        sb.append(',');
        sb.append("credWebUpdInd");
        sb.append('=');
        sb.append(((this.credWebUpdInd == null)?"<null>":this.credWebUpdInd));
        sb.append(',');
        sb.append("stypWebCatlSrchInd");
        sb.append('=');
        sb.append(((this.stypWebCatlSrchInd == null)?"<null>":this.stypWebCatlSrchInd));
        sb.append(',');
        sb.append("webCappTermInd");
        sb.append('=');
        sb.append(((this.webCappTermInd == null)?"<null>":this.webCappTermInd));
        sb.append(',');
        sb.append("cutoffDate");
        sb.append('=');
        sb.append(((this.cutoffDate == null)?"<null>":this.cutoffDate));
        sb.append(',');
        sb.append("levlWebSearchInd");
        sb.append('=');
        sb.append(((this.levlWebSearchInd == null)?"<null>":this.levlWebSearchInd));
        sb.append(',');
        sb.append("programSeverity");
        sb.append('=');
        sb.append(((this.programSeverity == null)?"<null>":this.programSeverity));
        sb.append(',');
        sb.append("spWebUpdInd");
        sb.append('=');
        sb.append(((this.spWebUpdInd == null)?"<null>":this.spWebUpdInd));
        sb.append(',');
        sb.append("corqSeverity");
        sb.append('=');
        sb.append(((this.corqSeverity == null)?"<null>":this.corqSeverity));
        sb.append(',');
        sb.append("structuredModelInd");
        sb.append('=');
        sb.append(((this.structuredModelInd == null)?"<null>":this.structuredModelInd));
        sb.append(',');
        sb.append("mailerWebInd");
        sb.append('=');
        sb.append(((this.mailerWebInd == null)?"<null>":this.mailerWebInd));
        sb.append(',');
        sb.append("bycrnInd");
        sb.append('=');
        sb.append(((this.bycrnInd == null)?"<null>":this.bycrnInd));
        sb.append(',');
        sb.append("rpthSeverity");
        sb.append('=');
        sb.append(((this.rpthSeverity == null)?"<null>":this.rpthSeverity));
        sb.append(',');
        sb.append("dynamicSchedTermInd");
        sb.append('=');
        sb.append(((this.dynamicSchedTermInd == null)?"<null>":this.dynamicSchedTermInd));
        sb.append(',');
        sb.append("facschdWebDispInd");
        sb.append('=');
        sb.append(((this.facschdWebDispInd == null)?"<null>":this.facschdWebDispInd));
        sb.append(',');
        sb.append("midtermWebInd");
        sb.append('=');
        sb.append(((this.midtermWebInd == null)?"<null>":this.midtermWebInd));
        sb.append(',');
        sb.append("preqSeverity");
        sb.append('=');
        sb.append(((this.preqSeverity == null)?"<null>":this.preqSeverity));
        sb.append(',');
        sb.append("apprSeverity");
        sb.append('=');
        sb.append(((this.apprSeverity == null)?"<null>":this.apprSeverity));
        sb.append(',');
        sb.append("degreeSeverity");
        sb.append('=');
        sb.append(((this.degreeSeverity == null)?"<null>":this.degreeSeverity));
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
        result = ((result* 31)+((this.condAddDropCde == null)? 0 :this.condAddDropCde.hashCode()));
        result = ((result* 31)+((this.gradeDetailWebInd == null)? 0 :this.gradeDetailWebInd.hashCode()));
        result = ((result* 31)+((this.tivDateSource == null)? 0 :this.tivDateSource.hashCode()));
        result = ((result* 31)+((this.capcSeverity == null)? 0 :this.capcSeverity.hashCode()));
        result = ((result* 31)+((this.assessSwapInd == null)? 0 :this.assessSwapInd.hashCode()));
        result = ((result* 31)+((this.sectionfeeInd == null)? 0 :this.sectionfeeInd.hashCode()));
        result = ((result* 31)+((this.duplSeverity == null)? 0 :this.duplSeverity.hashCode()));
        result = ((result* 31)+((this.inclAttmptHrsInd == null)? 0 :this.inclAttmptHrsInd.hashCode()));
        result = ((result* 31)+((this.calcDropActCde == null)? 0 :this.calcDropActCde.hashCode()));
        result = ((result* 31)+((this.hold == null)? 0 :this.hold.hashCode()));
        result = ((result* 31)+((this.levlWebCatlSrchInd == null)? 0 :this.levlWebCatlSrchInd.hashCode()));
        result = ((result* 31)+((this.addDrpWebUpdInd == null)? 0 :this.addDrpWebUpdInd.hashCode()));
        result = ((result* 31)+((this.planRegCde == null)? 0 :this.planRegCde.hashCode()));
        result = ((result* 31)+((this.lsTitleWebsDispInd == null)? 0 :this.lsTitleWebsDispInd.hashCode()));
        result = ((result* 31)+((this.lsDescWebsDispInd == null)? 0 :this.lsDescWebsDispInd.hashCode()));
        result = ((result* 31)+((this.campSeverity == null)? 0 :this.campSeverity.hashCode()));
        result = ((result* 31)+((this.mexcSeverity == null)? 0 :this.mexcSeverity.hashCode()));
        result = ((result* 31)+((this.maxPlans == null)? 0 :this.maxPlans.hashCode()));
        result = ((result* 31)+((this.attrWebSearchInd == null)? 0 :this.attrWebSearchInd.hashCode()));
        result = ((result* 31)+((this.claslstWebDispInd == null)? 0 :this.claslstWebDispInd.hashCode()));
        result = ((result* 31)+((this.collWebCatlSrchInd == null)? 0 :this.collWebCatlSrchInd.hashCode()));
        result = ((result* 31)+((this.assessAdmCreditInd == null)? 0 :this.assessAdmCreditInd.hashCode()));
        result = ((result* 31)+((this.degAuditPlanCde == null)? 0 :this.degAuditPlanCde.hashCode()));
        result = ((result* 31)+((this.collSeverity == null)? 0 :this.collSeverity.hashCode()));
        result = ((result* 31)+((this.lcTitleWebcDispInd == null)? 0 :this.lcTitleWebcDispInd.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.inprogressUsageInd == null)? 0 :this.inprogressUsageInd.hashCode()));
        result = ((result* 31)+((this.insmWebSearchInd == null)? 0 :this.insmWebSearchInd.hashCode()));
        result = ((result* 31)+((this.minhSeverity == null)? 0 :this.minhSeverity.hashCode()));
        result = ((result* 31)+((this.feeAssessmntEffDate == null)? 0 :this.feeAssessmntEffDate.hashCode()));
        result = ((result* 31)+((this.printBillVr == null)? 0 :this.printBillVr.hashCode()));
        result = ((result* 31)+((this.progAttWebcSrchInd == null)? 0 :this.progAttWebcSrchInd.hashCode()));
        result = ((result* 31)+((this.campWebSearchInd == null)? 0 :this.campWebSearchInd.hashCode()));
        result = ((result* 31)+((this.closectWebDispInd == null)? 0 :this.closectWebDispInd.hashCode()));
        result = ((result* 31)+((this.gmodWebUpdInd == null)? 0 :this.gmodWebUpdInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.assessRevNrfInd == null)? 0 :this.assessRevNrfInd.hashCode()));
        result = ((result* 31)+((this.crnOneup == null)? 0 :this.crnOneup.hashCode()));
        result = ((result* 31)+((this.planDaRegCde == null)? 0 :this.planDaRegCde.hashCode()));
        result = ((result* 31)+((this.schdWebSearchInd == null)? 0 :this.schdWebSearchInd.hashCode()));
        result = ((result* 31)+((this.feeAssessment == null)? 0 :this.feeAssessment.hashCode()));
        result = ((result* 31)+((this.durationWebSrchInd == null)? 0 :this.durationWebSrchInd.hashCode()));
        result = ((result* 31)+((this.tmstCalcInd == null)? 0 :this.tmstCalcInd.hashCode()));
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.lcDescWebcDispInd == null)? 0 :this.lcDescWebcDispInd.hashCode()));
        result = ((result* 31)+((this.instrWebSearchInd == null)? 0 :this.instrWebSearchInd.hashCode()));
        result = ((result* 31)+((this.overappWebUpdInd == null)? 0 :this.overappWebUpdInd.hashCode()));
        result = ((result* 31)+((this.regAllowed == null)? 0 :this.regAllowed.hashCode()));
        result = ((result* 31)+((this.linkSeverity == null)? 0 :this.linkSeverity.hashCode()));
        result = ((result* 31)+((this.assessSsCreditInd == null)? 0 :this.assessSsCreditInd.hashCode()));
        result = ((result* 31)+((this.processGradeBook == null)? 0 :this.processGradeBook.hashCode()));
        result = ((result* 31)+((this.chrtSeverity == null)? 0 :this.chrtSeverity.hashCode()));
        result = ((result* 31)+((this.futureRepeatInd == null)? 0 :this.futureRepeatInd.hashCode()));
        result = ((result* 31)+((this.sessWebSearchInd == null)? 0 :this.sessWebSearchInd.hashCode()));
        result = ((result* 31)+((this.clasSeverity == null)? 0 :this.clasSeverity.hashCode()));
        result = ((result* 31)+((this.levlSeverity == null)? 0 :this.levlSeverity.hashCode()));
        result = ((result* 31)+((this.planTermOpenCde == null)? 0 :this.planTermOpenCde.hashCode()));
        result = ((result* 31)+((this.feeAssessVr == null)? 0 :this.feeAssessVr.hashCode()));
        result = ((result* 31)+((this.readmReq == null)? 0 :this.readmReq.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.deptSeverity == null)? 0 :this.deptSeverity.hashCode()));
        result = ((result* 31)+((this.levlWebUpdInd == null)? 0 :this.levlWebUpdInd.hashCode()));
        result = ((result* 31)+((this.adminDropCde == null)? 0 :this.adminDropCde.hashCode()));
        result = ((result* 31)+((this.autoDropCde == null)? 0 :this.autoDropCde.hashCode()));
        result = ((result* 31)+((this.majrSeverity == null)? 0 :this.majrSeverity.hashCode()));
        result = ((result* 31)+((this.maxhSeverity == null)? 0 :this.maxhSeverity.hashCode()));
        result = ((result* 31)+((this.webCappCatlgInd == null)? 0 :this.webCappCatlgInd.hashCode()));
        result = ((result* 31)+((this.holdSeverity == null)? 0 :this.holdSeverity.hashCode()));
        result = ((result* 31)+((this.dropLastClassCde == null)? 0 :this.dropLastClassCde.hashCode()));
        result = ((result* 31)+((this.attsSeverity == null)? 0 :this.attsSeverity.hashCode()));
        result = ((result* 31)+((this.timeSeverity == null)? 0 :this.timeSeverity.hashCode()));
        result = ((result* 31)+((this.projectedModelInd == null)? 0 :this.projectedModelInd.hashCode()));
        result = ((result* 31)+((this.reptSeverity == null)? 0 :this.reptSeverity.hashCode()));
        result = ((result* 31)+((this.deptWebCatlSrchInd == null)? 0 :this.deptWebCatlSrchInd.hashCode()));
        result = ((result* 31)+((this.divWebCatlSrchInd == null)? 0 :this.divWebCatlSrchInd.hashCode()));
        result = ((result* 31)+((this.regularModelInd == null)? 0 :this.regularModelInd.hashCode()));
        result = ((result* 31)+((this.secAllowedPlanCde == null)? 0 :this.secAllowedPlanCde.hashCode()));
        result = ((result* 31)+((this.credWebUpdInd == null)? 0 :this.credWebUpdInd.hashCode()));
        result = ((result* 31)+((this.stypWebCatlSrchInd == null)? 0 :this.stypWebCatlSrchInd.hashCode()));
        result = ((result* 31)+((this.webCappTermInd == null)? 0 :this.webCappTermInd.hashCode()));
        result = ((result* 31)+((this.cutoffDate == null)? 0 :this.cutoffDate.hashCode()));
        result = ((result* 31)+((this.levlWebSearchInd == null)? 0 :this.levlWebSearchInd.hashCode()));
        result = ((result* 31)+((this.programSeverity == null)? 0 :this.programSeverity.hashCode()));
        result = ((result* 31)+((this.spWebUpdInd == null)? 0 :this.spWebUpdInd.hashCode()));
        result = ((result* 31)+((this.corqSeverity == null)? 0 :this.corqSeverity.hashCode()));
        result = ((result* 31)+((this.structuredModelInd == null)? 0 :this.structuredModelInd.hashCode()));
        result = ((result* 31)+((this.mailerWebInd == null)? 0 :this.mailerWebInd.hashCode()));
        result = ((result* 31)+((this.bycrnInd == null)? 0 :this.bycrnInd.hashCode()));
        result = ((result* 31)+((this.rpthSeverity == null)? 0 :this.rpthSeverity.hashCode()));
        result = ((result* 31)+((this.dynamicSchedTermInd == null)? 0 :this.dynamicSchedTermInd.hashCode()));
        result = ((result* 31)+((this.facschdWebDispInd == null)? 0 :this.facschdWebDispInd.hashCode()));
        result = ((result* 31)+((this.midtermWebInd == null)? 0 :this.midtermWebInd.hashCode()));
        result = ((result* 31)+((this.preqSeverity == null)? 0 :this.preqSeverity.hashCode()));
        result = ((result* 31)+((this.apprSeverity == null)? 0 :this.apprSeverity.hashCode()));
        result = ((result* 31)+((this.degreeSeverity == null)? 0 :this.degreeSeverity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobterm) == false) {
            return false;
        }
        Sobterm rhs = ((Sobterm) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.condAddDropCde == rhs.condAddDropCde)||((this.condAddDropCde!= null)&&this.condAddDropCde.equals(rhs.condAddDropCde)))&&((this.gradeDetailWebInd == rhs.gradeDetailWebInd)||((this.gradeDetailWebInd!= null)&&this.gradeDetailWebInd.equals(rhs.gradeDetailWebInd))))&&((this.tivDateSource == rhs.tivDateSource)||((this.tivDateSource!= null)&&this.tivDateSource.equals(rhs.tivDateSource))))&&((this.capcSeverity == rhs.capcSeverity)||((this.capcSeverity!= null)&&this.capcSeverity.equals(rhs.capcSeverity))))&&((this.assessSwapInd == rhs.assessSwapInd)||((this.assessSwapInd!= null)&&this.assessSwapInd.equals(rhs.assessSwapInd))))&&((this.sectionfeeInd == rhs.sectionfeeInd)||((this.sectionfeeInd!= null)&&this.sectionfeeInd.equals(rhs.sectionfeeInd))))&&((this.duplSeverity == rhs.duplSeverity)||((this.duplSeverity!= null)&&this.duplSeverity.equals(rhs.duplSeverity))))&&((this.inclAttmptHrsInd == rhs.inclAttmptHrsInd)||((this.inclAttmptHrsInd!= null)&&this.inclAttmptHrsInd.equals(rhs.inclAttmptHrsInd))))&&((this.calcDropActCde == rhs.calcDropActCde)||((this.calcDropActCde!= null)&&this.calcDropActCde.equals(rhs.calcDropActCde))))&&((this.hold == rhs.hold)||((this.hold!= null)&&this.hold.equals(rhs.hold))))&&((this.levlWebCatlSrchInd == rhs.levlWebCatlSrchInd)||((this.levlWebCatlSrchInd!= null)&&this.levlWebCatlSrchInd.equals(rhs.levlWebCatlSrchInd))))&&((this.addDrpWebUpdInd == rhs.addDrpWebUpdInd)||((this.addDrpWebUpdInd!= null)&&this.addDrpWebUpdInd.equals(rhs.addDrpWebUpdInd))))&&((this.planRegCde == rhs.planRegCde)||((this.planRegCde!= null)&&this.planRegCde.equals(rhs.planRegCde))))&&((this.lsTitleWebsDispInd == rhs.lsTitleWebsDispInd)||((this.lsTitleWebsDispInd!= null)&&this.lsTitleWebsDispInd.equals(rhs.lsTitleWebsDispInd))))&&((this.lsDescWebsDispInd == rhs.lsDescWebsDispInd)||((this.lsDescWebsDispInd!= null)&&this.lsDescWebsDispInd.equals(rhs.lsDescWebsDispInd))))&&((this.campSeverity == rhs.campSeverity)||((this.campSeverity!= null)&&this.campSeverity.equals(rhs.campSeverity))))&&((this.mexcSeverity == rhs.mexcSeverity)||((this.mexcSeverity!= null)&&this.mexcSeverity.equals(rhs.mexcSeverity))))&&((this.maxPlans == rhs.maxPlans)||((this.maxPlans!= null)&&this.maxPlans.equals(rhs.maxPlans))))&&((this.attrWebSearchInd == rhs.attrWebSearchInd)||((this.attrWebSearchInd!= null)&&this.attrWebSearchInd.equals(rhs.attrWebSearchInd))))&&((this.claslstWebDispInd == rhs.claslstWebDispInd)||((this.claslstWebDispInd!= null)&&this.claslstWebDispInd.equals(rhs.claslstWebDispInd))))&&((this.collWebCatlSrchInd == rhs.collWebCatlSrchInd)||((this.collWebCatlSrchInd!= null)&&this.collWebCatlSrchInd.equals(rhs.collWebCatlSrchInd))))&&((this.assessAdmCreditInd == rhs.assessAdmCreditInd)||((this.assessAdmCreditInd!= null)&&this.assessAdmCreditInd.equals(rhs.assessAdmCreditInd))))&&((this.degAuditPlanCde == rhs.degAuditPlanCde)||((this.degAuditPlanCde!= null)&&this.degAuditPlanCde.equals(rhs.degAuditPlanCde))))&&((this.collSeverity == rhs.collSeverity)||((this.collSeverity!= null)&&this.collSeverity.equals(rhs.collSeverity))))&&((this.lcTitleWebcDispInd == rhs.lcTitleWebcDispInd)||((this.lcTitleWebcDispInd!= null)&&this.lcTitleWebcDispInd.equals(rhs.lcTitleWebcDispInd))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.inprogressUsageInd == rhs.inprogressUsageInd)||((this.inprogressUsageInd!= null)&&this.inprogressUsageInd.equals(rhs.inprogressUsageInd))))&&((this.insmWebSearchInd == rhs.insmWebSearchInd)||((this.insmWebSearchInd!= null)&&this.insmWebSearchInd.equals(rhs.insmWebSearchInd))))&&((this.minhSeverity == rhs.minhSeverity)||((this.minhSeverity!= null)&&this.minhSeverity.equals(rhs.minhSeverity))))&&((this.feeAssessmntEffDate == rhs.feeAssessmntEffDate)||((this.feeAssessmntEffDate!= null)&&this.feeAssessmntEffDate.equals(rhs.feeAssessmntEffDate))))&&((this.printBillVr == rhs.printBillVr)||((this.printBillVr!= null)&&this.printBillVr.equals(rhs.printBillVr))))&&((this.progAttWebcSrchInd == rhs.progAttWebcSrchInd)||((this.progAttWebcSrchInd!= null)&&this.progAttWebcSrchInd.equals(rhs.progAttWebcSrchInd))))&&((this.campWebSearchInd == rhs.campWebSearchInd)||((this.campWebSearchInd!= null)&&this.campWebSearchInd.equals(rhs.campWebSearchInd))))&&((this.closectWebDispInd == rhs.closectWebDispInd)||((this.closectWebDispInd!= null)&&this.closectWebDispInd.equals(rhs.closectWebDispInd))))&&((this.gmodWebUpdInd == rhs.gmodWebUpdInd)||((this.gmodWebUpdInd!= null)&&this.gmodWebUpdInd.equals(rhs.gmodWebUpdInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.assessRevNrfInd == rhs.assessRevNrfInd)||((this.assessRevNrfInd!= null)&&this.assessRevNrfInd.equals(rhs.assessRevNrfInd))))&&((this.crnOneup == rhs.crnOneup)||((this.crnOneup!= null)&&this.crnOneup.equals(rhs.crnOneup))))&&((this.planDaRegCde == rhs.planDaRegCde)||((this.planDaRegCde!= null)&&this.planDaRegCde.equals(rhs.planDaRegCde))))&&((this.schdWebSearchInd == rhs.schdWebSearchInd)||((this.schdWebSearchInd!= null)&&this.schdWebSearchInd.equals(rhs.schdWebSearchInd))))&&((this.feeAssessment == rhs.feeAssessment)||((this.feeAssessment!= null)&&this.feeAssessment.equals(rhs.feeAssessment))))&&((this.durationWebSrchInd == rhs.durationWebSrchInd)||((this.durationWebSrchInd!= null)&&this.durationWebSrchInd.equals(rhs.durationWebSrchInd))))&&((this.tmstCalcInd == rhs.tmstCalcInd)||((this.tmstCalcInd!= null)&&this.tmstCalcInd.equals(rhs.tmstCalcInd))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.lcDescWebcDispInd == rhs.lcDescWebcDispInd)||((this.lcDescWebcDispInd!= null)&&this.lcDescWebcDispInd.equals(rhs.lcDescWebcDispInd))))&&((this.instrWebSearchInd == rhs.instrWebSearchInd)||((this.instrWebSearchInd!= null)&&this.instrWebSearchInd.equals(rhs.instrWebSearchInd))))&&((this.overappWebUpdInd == rhs.overappWebUpdInd)||((this.overappWebUpdInd!= null)&&this.overappWebUpdInd.equals(rhs.overappWebUpdInd))))&&((this.regAllowed == rhs.regAllowed)||((this.regAllowed!= null)&&this.regAllowed.equals(rhs.regAllowed))))&&((this.linkSeverity == rhs.linkSeverity)||((this.linkSeverity!= null)&&this.linkSeverity.equals(rhs.linkSeverity))))&&((this.assessSsCreditInd == rhs.assessSsCreditInd)||((this.assessSsCreditInd!= null)&&this.assessSsCreditInd.equals(rhs.assessSsCreditInd))))&&((this.processGradeBook == rhs.processGradeBook)||((this.processGradeBook!= null)&&this.processGradeBook.equals(rhs.processGradeBook))))&&((this.chrtSeverity == rhs.chrtSeverity)||((this.chrtSeverity!= null)&&this.chrtSeverity.equals(rhs.chrtSeverity))))&&((this.futureRepeatInd == rhs.futureRepeatInd)||((this.futureRepeatInd!= null)&&this.futureRepeatInd.equals(rhs.futureRepeatInd))))&&((this.sessWebSearchInd == rhs.sessWebSearchInd)||((this.sessWebSearchInd!= null)&&this.sessWebSearchInd.equals(rhs.sessWebSearchInd))))&&((this.clasSeverity == rhs.clasSeverity)||((this.clasSeverity!= null)&&this.clasSeverity.equals(rhs.clasSeverity))))&&((this.levlSeverity == rhs.levlSeverity)||((this.levlSeverity!= null)&&this.levlSeverity.equals(rhs.levlSeverity))))&&((this.planTermOpenCde == rhs.planTermOpenCde)||((this.planTermOpenCde!= null)&&this.planTermOpenCde.equals(rhs.planTermOpenCde))))&&((this.feeAssessVr == rhs.feeAssessVr)||((this.feeAssessVr!= null)&&this.feeAssessVr.equals(rhs.feeAssessVr))))&&((this.readmReq == rhs.readmReq)||((this.readmReq!= null)&&this.readmReq.equals(rhs.readmReq))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.deptSeverity == rhs.deptSeverity)||((this.deptSeverity!= null)&&this.deptSeverity.equals(rhs.deptSeverity))))&&((this.levlWebUpdInd == rhs.levlWebUpdInd)||((this.levlWebUpdInd!= null)&&this.levlWebUpdInd.equals(rhs.levlWebUpdInd))))&&((this.adminDropCde == rhs.adminDropCde)||((this.adminDropCde!= null)&&this.adminDropCde.equals(rhs.adminDropCde))))&&((this.autoDropCde == rhs.autoDropCde)||((this.autoDropCde!= null)&&this.autoDropCde.equals(rhs.autoDropCde))))&&((this.majrSeverity == rhs.majrSeverity)||((this.majrSeverity!= null)&&this.majrSeverity.equals(rhs.majrSeverity))))&&((this.maxhSeverity == rhs.maxhSeverity)||((this.maxhSeverity!= null)&&this.maxhSeverity.equals(rhs.maxhSeverity))))&&((this.webCappCatlgInd == rhs.webCappCatlgInd)||((this.webCappCatlgInd!= null)&&this.webCappCatlgInd.equals(rhs.webCappCatlgInd))))&&((this.holdSeverity == rhs.holdSeverity)||((this.holdSeverity!= null)&&this.holdSeverity.equals(rhs.holdSeverity))))&&((this.dropLastClassCde == rhs.dropLastClassCde)||((this.dropLastClassCde!= null)&&this.dropLastClassCde.equals(rhs.dropLastClassCde))))&&((this.attsSeverity == rhs.attsSeverity)||((this.attsSeverity!= null)&&this.attsSeverity.equals(rhs.attsSeverity))))&&((this.timeSeverity == rhs.timeSeverity)||((this.timeSeverity!= null)&&this.timeSeverity.equals(rhs.timeSeverity))))&&((this.projectedModelInd == rhs.projectedModelInd)||((this.projectedModelInd!= null)&&this.projectedModelInd.equals(rhs.projectedModelInd))))&&((this.reptSeverity == rhs.reptSeverity)||((this.reptSeverity!= null)&&this.reptSeverity.equals(rhs.reptSeverity))))&&((this.deptWebCatlSrchInd == rhs.deptWebCatlSrchInd)||((this.deptWebCatlSrchInd!= null)&&this.deptWebCatlSrchInd.equals(rhs.deptWebCatlSrchInd))))&&((this.divWebCatlSrchInd == rhs.divWebCatlSrchInd)||((this.divWebCatlSrchInd!= null)&&this.divWebCatlSrchInd.equals(rhs.divWebCatlSrchInd))))&&((this.regularModelInd == rhs.regularModelInd)||((this.regularModelInd!= null)&&this.regularModelInd.equals(rhs.regularModelInd))))&&((this.secAllowedPlanCde == rhs.secAllowedPlanCde)||((this.secAllowedPlanCde!= null)&&this.secAllowedPlanCde.equals(rhs.secAllowedPlanCde))))&&((this.credWebUpdInd == rhs.credWebUpdInd)||((this.credWebUpdInd!= null)&&this.credWebUpdInd.equals(rhs.credWebUpdInd))))&&((this.stypWebCatlSrchInd == rhs.stypWebCatlSrchInd)||((this.stypWebCatlSrchInd!= null)&&this.stypWebCatlSrchInd.equals(rhs.stypWebCatlSrchInd))))&&((this.webCappTermInd == rhs.webCappTermInd)||((this.webCappTermInd!= null)&&this.webCappTermInd.equals(rhs.webCappTermInd))))&&((this.cutoffDate == rhs.cutoffDate)||((this.cutoffDate!= null)&&this.cutoffDate.equals(rhs.cutoffDate))))&&((this.levlWebSearchInd == rhs.levlWebSearchInd)||((this.levlWebSearchInd!= null)&&this.levlWebSearchInd.equals(rhs.levlWebSearchInd))))&&((this.programSeverity == rhs.programSeverity)||((this.programSeverity!= null)&&this.programSeverity.equals(rhs.programSeverity))))&&((this.spWebUpdInd == rhs.spWebUpdInd)||((this.spWebUpdInd!= null)&&this.spWebUpdInd.equals(rhs.spWebUpdInd))))&&((this.corqSeverity == rhs.corqSeverity)||((this.corqSeverity!= null)&&this.corqSeverity.equals(rhs.corqSeverity))))&&((this.structuredModelInd == rhs.structuredModelInd)||((this.structuredModelInd!= null)&&this.structuredModelInd.equals(rhs.structuredModelInd))))&&((this.mailerWebInd == rhs.mailerWebInd)||((this.mailerWebInd!= null)&&this.mailerWebInd.equals(rhs.mailerWebInd))))&&((this.bycrnInd == rhs.bycrnInd)||((this.bycrnInd!= null)&&this.bycrnInd.equals(rhs.bycrnInd))))&&((this.rpthSeverity == rhs.rpthSeverity)||((this.rpthSeverity!= null)&&this.rpthSeverity.equals(rhs.rpthSeverity))))&&((this.dynamicSchedTermInd == rhs.dynamicSchedTermInd)||((this.dynamicSchedTermInd!= null)&&this.dynamicSchedTermInd.equals(rhs.dynamicSchedTermInd))))&&((this.facschdWebDispInd == rhs.facschdWebDispInd)||((this.facschdWebDispInd!= null)&&this.facschdWebDispInd.equals(rhs.facschdWebDispInd))))&&((this.midtermWebInd == rhs.midtermWebInd)||((this.midtermWebInd!= null)&&this.midtermWebInd.equals(rhs.midtermWebInd))))&&((this.preqSeverity == rhs.preqSeverity)||((this.preqSeverity!= null)&&this.preqSeverity.equals(rhs.preqSeverity))))&&((this.apprSeverity == rhs.apprSeverity)||((this.apprSeverity!= null)&&this.apprSeverity.equals(rhs.apprSeverity))))&&((this.degreeSeverity == rhs.degreeSeverity)||((this.degreeSeverity!= null)&&this.degreeSeverity.equals(rhs.degreeSeverity))));
    }

}
