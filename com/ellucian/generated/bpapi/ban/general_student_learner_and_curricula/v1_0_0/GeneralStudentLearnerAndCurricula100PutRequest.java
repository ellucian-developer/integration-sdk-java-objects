
package com.ellucian.generated.bpapi.ban.general_student_learner_and_curricula.v1_0_0;

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
    "criteria.scpcCode",
    "criteria.termCodeEff",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.emexCode",
    "criteria.aprnCode",
    "criteria.orsnCode",
    "criteria.bsklCode",
    "criteria.caplCode",
    "criteria.blckCode",
    "rateCode",
    "sessCode",
    "criteria.resdCode",
    "criteria.siteCode",
    "criteria.gradCreditApprInd",
    "criteria.leavFromDate",
    "id",
    "stvtermTermCode",
    "criteria.rateCode",
    "criteria.fullPartInd",
    "criteria.leavToDate",
    "fullPartInd",
    "criteria.pracCode",
    "criteria.sessCode",
    "criteria.voedCode",
    "siteCode",
    "criteria.ststCode",
    "criteria.stypCode",
    "resdCode",
    "criteria.egolCode",
    "criteria.edlvCode",
    "criteria.trcnCode",
    "scpcCode",
    "criteria.gainCode",
    "ststCode",
    "blckCode",
    "stypCode",
    "criteria.incmCode",
    "criteria.leavCode"
})
@Generated("jsonschema2pojo")
public class GeneralStudentLearnerAndCurricula100PutRequest {

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("criteria.scpcCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt")
    private String criteriaScpcCode;
    /**
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEff;
    /**
     * Lineage reference object : SGBSTDN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_USER_ID")
    private String criteriaUserId;
    @JsonProperty("criteria.activityDate")
    private Date criteriaActivityDate;
    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("criteria.emexCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex")
    private String criteriaEmexCode;
    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("criteria.aprnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn")
    private String criteriaAprnCode;
    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("criteria.orsnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String criteriaOrsnCode;
    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("criteria.bsklCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl")
    private String criteriaBsklCode;
    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("criteria.caplCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String criteriaCaplCode;
    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("criteria.blckCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String criteriaBlckCode;
    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String criteriaResdCode;
    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite")
    private String criteriaSiteCode;
    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("criteria.gradCreditApprInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND")
    private String criteriaGradCreditApprInd;
    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("criteria.leavFromDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_FROM_DATE")
    private Date criteriaLeavFromDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private Object stvtermTermCode;
    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String criteriaRateCode;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String criteriaFullPartInd;
    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("criteria.leavToDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_TO_DATE")
    private Date criteriaLeavToDate;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("criteria.pracCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String criteriaPracCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String criteriaSessCode;
    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("criteria.voedCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed")
    private String criteriaVoedCode;
    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("criteria.ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String criteriaStstCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String criteriaStypCode;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String criteriaEgolCode;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("criteria.edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String criteriaEdlvCode;
    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("criteria.trcnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn")
    private String criteriaTrcnCode;
    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt")
    private String scpcCode;
    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("criteria.gainCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain")
    private String criteriaGainCode;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String blckCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("criteria.incmCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm")
    private String criteriaIncmCode;
    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("criteria.leavCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav")
    private String criteriaLeavCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("criteria.scpcCode")
    public String getCriteriaScpcCode() {
        return criteriaScpcCode;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("criteria.scpcCode")
    public void setCriteriaScpcCode(String criteriaScpcCode) {
        this.criteriaScpcCode = criteriaScpcCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaScpcCode(String criteriaScpcCode) {
        this.criteriaScpcCode = criteriaScpcCode;
        return this;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public String getCriteriaTermCodeEff() {
        return criteriaTermCodeEff;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public void setCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : SGBSTDN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SGBSTDN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("criteria.emexCode")
    public String getCriteriaEmexCode() {
        return criteriaEmexCode;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("criteria.emexCode")
    public void setCriteriaEmexCode(String criteriaEmexCode) {
        this.criteriaEmexCode = criteriaEmexCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaEmexCode(String criteriaEmexCode) {
        this.criteriaEmexCode = criteriaEmexCode;
        return this;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("criteria.aprnCode")
    public String getCriteriaAprnCode() {
        return criteriaAprnCode;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("criteria.aprnCode")
    public void setCriteriaAprnCode(String criteriaAprnCode) {
        this.criteriaAprnCode = criteriaAprnCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaAprnCode(String criteriaAprnCode) {
        this.criteriaAprnCode = criteriaAprnCode;
        return this;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("criteria.orsnCode")
    public String getCriteriaOrsnCode() {
        return criteriaOrsnCode;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("criteria.orsnCode")
    public void setCriteriaOrsnCode(String criteriaOrsnCode) {
        this.criteriaOrsnCode = criteriaOrsnCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaOrsnCode(String criteriaOrsnCode) {
        this.criteriaOrsnCode = criteriaOrsnCode;
        return this;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("criteria.bsklCode")
    public String getCriteriaBsklCode() {
        return criteriaBsklCode;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("criteria.bsklCode")
    public void setCriteriaBsklCode(String criteriaBsklCode) {
        this.criteriaBsklCode = criteriaBsklCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaBsklCode(String criteriaBsklCode) {
        this.criteriaBsklCode = criteriaBsklCode;
        return this;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("criteria.caplCode")
    public String getCriteriaCaplCode() {
        return criteriaCaplCode;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("criteria.caplCode")
    public void setCriteriaCaplCode(String criteriaCaplCode) {
        this.criteriaCaplCode = criteriaCaplCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaCaplCode(String criteriaCaplCode) {
        this.criteriaCaplCode = criteriaCaplCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("criteria.blckCode")
    public String getCriteriaBlckCode() {
        return criteriaBlckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("criteria.blckCode")
    public void setCriteriaBlckCode(String criteriaBlckCode) {
        this.criteriaBlckCode = criteriaBlckCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaBlckCode(String criteriaBlckCode) {
        this.criteriaBlckCode = criteriaBlckCode;
        return this;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public String getCriteriaResdCode() {
        return criteriaResdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public void setCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    public String getCriteriaSiteCode() {
        return criteriaSiteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    public void setCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
        return this;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("criteria.gradCreditApprInd")
    public String getCriteriaGradCreditApprInd() {
        return criteriaGradCreditApprInd;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("criteria.gradCreditApprInd")
    public void setCriteriaGradCreditApprInd(String criteriaGradCreditApprInd) {
        this.criteriaGradCreditApprInd = criteriaGradCreditApprInd;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaGradCreditApprInd(String criteriaGradCreditApprInd) {
        this.criteriaGradCreditApprInd = criteriaGradCreditApprInd;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("criteria.leavFromDate")
    public Date getCriteriaLeavFromDate() {
        return criteriaLeavFromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("criteria.leavFromDate")
    public void setCriteriaLeavFromDate(Date criteriaLeavFromDate) {
        this.criteriaLeavFromDate = criteriaLeavFromDate;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaLeavFromDate(Date criteriaLeavFromDate) {
        this.criteriaLeavFromDate = criteriaLeavFromDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public Object getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    public String getCriteriaRateCode() {
        return criteriaRateCode;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    public void setCriteriaRateCode(String criteriaRateCode) {
        this.criteriaRateCode = criteriaRateCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaRateCode(String criteriaRateCode) {
        this.criteriaRateCode = criteriaRateCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public String getCriteriaFullPartInd() {
        return criteriaFullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public void setCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("criteria.leavToDate")
    public Date getCriteriaLeavToDate() {
        return criteriaLeavToDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("criteria.leavToDate")
    public void setCriteriaLeavToDate(Date criteriaLeavToDate) {
        this.criteriaLeavToDate = criteriaLeavToDate;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaLeavToDate(Date criteriaLeavToDate) {
        this.criteriaLeavToDate = criteriaLeavToDate;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("criteria.pracCode")
    public String getCriteriaPracCode() {
        return criteriaPracCode;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("criteria.pracCode")
    public void setCriteriaPracCode(String criteriaPracCode) {
        this.criteriaPracCode = criteriaPracCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaPracCode(String criteriaPracCode) {
        this.criteriaPracCode = criteriaPracCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public String getCriteriaSessCode() {
        return criteriaSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public void setCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
        return this;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("criteria.voedCode")
    public String getCriteriaVoedCode() {
        return criteriaVoedCode;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("criteria.voedCode")
    public void setCriteriaVoedCode(String criteriaVoedCode) {
        this.criteriaVoedCode = criteriaVoedCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaVoedCode(String criteriaVoedCode) {
        this.criteriaVoedCode = criteriaVoedCode;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("criteria.ststCode")
    public String getCriteriaStstCode() {
        return criteriaStstCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("criteria.ststCode")
    public void setCriteriaStstCode(String criteriaStstCode) {
        this.criteriaStstCode = criteriaStstCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaStstCode(String criteriaStstCode) {
        this.criteriaStstCode = criteriaStstCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public String getCriteriaStypCode() {
        return criteriaStypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public void setCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    public String getCriteriaEgolCode() {
        return criteriaEgolCode;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    public void setCriteriaEgolCode(String criteriaEgolCode) {
        this.criteriaEgolCode = criteriaEgolCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaEgolCode(String criteriaEgolCode) {
        this.criteriaEgolCode = criteriaEgolCode;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("criteria.edlvCode")
    public String getCriteriaEdlvCode() {
        return criteriaEdlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("criteria.edlvCode")
    public void setCriteriaEdlvCode(String criteriaEdlvCode) {
        this.criteriaEdlvCode = criteriaEdlvCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaEdlvCode(String criteriaEdlvCode) {
        this.criteriaEdlvCode = criteriaEdlvCode;
        return this;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("criteria.trcnCode")
    public String getCriteriaTrcnCode() {
        return criteriaTrcnCode;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("criteria.trcnCode")
    public void setCriteriaTrcnCode(String criteriaTrcnCode) {
        this.criteriaTrcnCode = criteriaTrcnCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaTrcnCode(String criteriaTrcnCode) {
        this.criteriaTrcnCode = criteriaTrcnCode;
        return this;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    public String getScpcCode() {
        return scpcCode;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    public void setScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
        return this;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("criteria.gainCode")
    public String getCriteriaGainCode() {
        return criteriaGainCode;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("criteria.gainCode")
    public void setCriteriaGainCode(String criteriaGainCode) {
        this.criteriaGainCode = criteriaGainCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaGainCode(String criteriaGainCode) {
        this.criteriaGainCode = criteriaGainCode;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public String getStstCode() {
        return ststCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public void setStstCode(String ststCode) {
        this.ststCode = ststCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("criteria.incmCode")
    public String getCriteriaIncmCode() {
        return criteriaIncmCode;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("criteria.incmCode")
    public void setCriteriaIncmCode(String criteriaIncmCode) {
        this.criteriaIncmCode = criteriaIncmCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaIncmCode(String criteriaIncmCode) {
        this.criteriaIncmCode = criteriaIncmCode;
        return this;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("criteria.leavCode")
    public String getCriteriaLeavCode() {
        return criteriaLeavCode;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("criteria.leavCode")
    public void setCriteriaLeavCode(String criteriaLeavCode) {
        this.criteriaLeavCode = criteriaLeavCode;
    }

    public GeneralStudentLearnerAndCurricula100PutRequest withCriteriaLeavCode(String criteriaLeavCode) {
        this.criteriaLeavCode = criteriaLeavCode;
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

    public GeneralStudentLearnerAndCurricula100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralStudentLearnerAndCurricula100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaScpcCode");
        sb.append('=');
        sb.append(((this.criteriaScpcCode == null)?"<null>":this.criteriaScpcCode));
        sb.append(',');
        sb.append("criteriaTermCodeEff");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEff == null)?"<null>":this.criteriaTermCodeEff));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaEmexCode");
        sb.append('=');
        sb.append(((this.criteriaEmexCode == null)?"<null>":this.criteriaEmexCode));
        sb.append(',');
        sb.append("criteriaAprnCode");
        sb.append('=');
        sb.append(((this.criteriaAprnCode == null)?"<null>":this.criteriaAprnCode));
        sb.append(',');
        sb.append("criteriaOrsnCode");
        sb.append('=');
        sb.append(((this.criteriaOrsnCode == null)?"<null>":this.criteriaOrsnCode));
        sb.append(',');
        sb.append("criteriaBsklCode");
        sb.append('=');
        sb.append(((this.criteriaBsklCode == null)?"<null>":this.criteriaBsklCode));
        sb.append(',');
        sb.append("criteriaCaplCode");
        sb.append('=');
        sb.append(((this.criteriaCaplCode == null)?"<null>":this.criteriaCaplCode));
        sb.append(',');
        sb.append("criteriaBlckCode");
        sb.append('=');
        sb.append(((this.criteriaBlckCode == null)?"<null>":this.criteriaBlckCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("criteriaResdCode");
        sb.append('=');
        sb.append(((this.criteriaResdCode == null)?"<null>":this.criteriaResdCode));
        sb.append(',');
        sb.append("criteriaSiteCode");
        sb.append('=');
        sb.append(((this.criteriaSiteCode == null)?"<null>":this.criteriaSiteCode));
        sb.append(',');
        sb.append("criteriaGradCreditApprInd");
        sb.append('=');
        sb.append(((this.criteriaGradCreditApprInd == null)?"<null>":this.criteriaGradCreditApprInd));
        sb.append(',');
        sb.append("criteriaLeavFromDate");
        sb.append('=');
        sb.append(((this.criteriaLeavFromDate == null)?"<null>":this.criteriaLeavFromDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("criteriaRateCode");
        sb.append('=');
        sb.append(((this.criteriaRateCode == null)?"<null>":this.criteriaRateCode));
        sb.append(',');
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("criteriaLeavToDate");
        sb.append('=');
        sb.append(((this.criteriaLeavToDate == null)?"<null>":this.criteriaLeavToDate));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("criteriaPracCode");
        sb.append('=');
        sb.append(((this.criteriaPracCode == null)?"<null>":this.criteriaPracCode));
        sb.append(',');
        sb.append("criteriaSessCode");
        sb.append('=');
        sb.append(((this.criteriaSessCode == null)?"<null>":this.criteriaSessCode));
        sb.append(',');
        sb.append("criteriaVoedCode");
        sb.append('=');
        sb.append(((this.criteriaVoedCode == null)?"<null>":this.criteriaVoedCode));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("criteriaStstCode");
        sb.append('=');
        sb.append(((this.criteriaStstCode == null)?"<null>":this.criteriaStstCode));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("criteriaEgolCode");
        sb.append('=');
        sb.append(((this.criteriaEgolCode == null)?"<null>":this.criteriaEgolCode));
        sb.append(',');
        sb.append("criteriaEdlvCode");
        sb.append('=');
        sb.append(((this.criteriaEdlvCode == null)?"<null>":this.criteriaEdlvCode));
        sb.append(',');
        sb.append("criteriaTrcnCode");
        sb.append('=');
        sb.append(((this.criteriaTrcnCode == null)?"<null>":this.criteriaTrcnCode));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("criteriaGainCode");
        sb.append('=');
        sb.append(((this.criteriaGainCode == null)?"<null>":this.criteriaGainCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("criteriaIncmCode");
        sb.append('=');
        sb.append(((this.criteriaIncmCode == null)?"<null>":this.criteriaIncmCode));
        sb.append(',');
        sb.append("criteriaLeavCode");
        sb.append('=');
        sb.append(((this.criteriaLeavCode == null)?"<null>":this.criteriaLeavCode));
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
        result = ((result* 31)+((this.criteriaRateCode == null)? 0 :this.criteriaRateCode.hashCode()));
        result = ((result* 31)+((this.criteriaTrcnCode == null)? 0 :this.criteriaTrcnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSessCode == null)? 0 :this.criteriaSessCode.hashCode()));
        result = ((result* 31)+((this.criteriaVoedCode == null)? 0 :this.criteriaVoedCode.hashCode()));
        result = ((result* 31)+((this.criteriaStstCode == null)? 0 :this.criteriaStstCode.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.criteriaEdlvCode == null)? 0 :this.criteriaEdlvCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.criteriaSiteCode == null)? 0 :this.criteriaSiteCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrsnCode == null)? 0 :this.criteriaOrsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.criteriaLeavFromDate == null)? 0 :this.criteriaLeavFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaEmexCode == null)? 0 :this.criteriaEmexCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaPracCode == null)? 0 :this.criteriaPracCode.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaScpcCode == null)? 0 :this.criteriaScpcCode.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.criteriaLeavToDate == null)? 0 :this.criteriaLeavToDate.hashCode()));
        result = ((result* 31)+((this.criteriaCaplCode == null)? 0 :this.criteriaCaplCode.hashCode()));
        result = ((result* 31)+((this.criteriaBsklCode == null)? 0 :this.criteriaBsklCode.hashCode()));
        result = ((result* 31)+((this.criteriaBlckCode == null)? 0 :this.criteriaBlckCode.hashCode()));
        result = ((result* 31)+((this.criteriaGradCreditApprInd == null)? 0 :this.criteriaGradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.criteriaGainCode == null)? 0 :this.criteriaGainCode.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaEgolCode == null)? 0 :this.criteriaEgolCode.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEff == null)? 0 :this.criteriaTermCodeEff.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.criteriaIncmCode == null)? 0 :this.criteriaIncmCode.hashCode()));
        result = ((result* 31)+((this.criteriaLeavCode == null)? 0 :this.criteriaLeavCode.hashCode()));
        result = ((result* 31)+((this.criteriaAprnCode == null)? 0 :this.criteriaAprnCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralStudentLearnerAndCurricula100PutRequest) == false) {
            return false;
        }
        GeneralStudentLearnerAndCurricula100PutRequest rhs = ((GeneralStudentLearnerAndCurricula100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((this.criteriaRateCode == rhs.criteriaRateCode)||((this.criteriaRateCode!= null)&&this.criteriaRateCode.equals(rhs.criteriaRateCode)))&&((this.criteriaTrcnCode == rhs.criteriaTrcnCode)||((this.criteriaTrcnCode!= null)&&this.criteriaTrcnCode.equals(rhs.criteriaTrcnCode))))&&((this.criteriaSessCode == rhs.criteriaSessCode)||((this.criteriaSessCode!= null)&&this.criteriaSessCode.equals(rhs.criteriaSessCode))))&&((this.criteriaVoedCode == rhs.criteriaVoedCode)||((this.criteriaVoedCode!= null)&&this.criteriaVoedCode.equals(rhs.criteriaVoedCode))))&&((this.criteriaStstCode == rhs.criteriaStstCode)||((this.criteriaStstCode!= null)&&this.criteriaStstCode.equals(rhs.criteriaStstCode))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.criteriaEdlvCode == rhs.criteriaEdlvCode)||((this.criteriaEdlvCode!= null)&&this.criteriaEdlvCode.equals(rhs.criteriaEdlvCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.criteriaSiteCode == rhs.criteriaSiteCode)||((this.criteriaSiteCode!= null)&&this.criteriaSiteCode.equals(rhs.criteriaSiteCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaOrsnCode == rhs.criteriaOrsnCode)||((this.criteriaOrsnCode!= null)&&this.criteriaOrsnCode.equals(rhs.criteriaOrsnCode))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.criteriaLeavFromDate == rhs.criteriaLeavFromDate)||((this.criteriaLeavFromDate!= null)&&this.criteriaLeavFromDate.equals(rhs.criteriaLeavFromDate))))&&((this.criteriaEmexCode == rhs.criteriaEmexCode)||((this.criteriaEmexCode!= null)&&this.criteriaEmexCode.equals(rhs.criteriaEmexCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.criteriaPracCode == rhs.criteriaPracCode)||((this.criteriaPracCode!= null)&&this.criteriaPracCode.equals(rhs.criteriaPracCode))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaScpcCode == rhs.criteriaScpcCode)||((this.criteriaScpcCode!= null)&&this.criteriaScpcCode.equals(rhs.criteriaScpcCode))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.criteriaLeavToDate == rhs.criteriaLeavToDate)||((this.criteriaLeavToDate!= null)&&this.criteriaLeavToDate.equals(rhs.criteriaLeavToDate))))&&((this.criteriaCaplCode == rhs.criteriaCaplCode)||((this.criteriaCaplCode!= null)&&this.criteriaCaplCode.equals(rhs.criteriaCaplCode))))&&((this.criteriaBsklCode == rhs.criteriaBsklCode)||((this.criteriaBsklCode!= null)&&this.criteriaBsklCode.equals(rhs.criteriaBsklCode))))&&((this.criteriaBlckCode == rhs.criteriaBlckCode)||((this.criteriaBlckCode!= null)&&this.criteriaBlckCode.equals(rhs.criteriaBlckCode))))&&((this.criteriaGradCreditApprInd == rhs.criteriaGradCreditApprInd)||((this.criteriaGradCreditApprInd!= null)&&this.criteriaGradCreditApprInd.equals(rhs.criteriaGradCreditApprInd))))&&((this.criteriaGainCode == rhs.criteriaGainCode)||((this.criteriaGainCode!= null)&&this.criteriaGainCode.equals(rhs.criteriaGainCode))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaEgolCode == rhs.criteriaEgolCode)||((this.criteriaEgolCode!= null)&&this.criteriaEgolCode.equals(rhs.criteriaEgolCode))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.criteriaTermCodeEff == rhs.criteriaTermCodeEff)||((this.criteriaTermCodeEff!= null)&&this.criteriaTermCodeEff.equals(rhs.criteriaTermCodeEff))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.criteriaIncmCode == rhs.criteriaIncmCode)||((this.criteriaIncmCode!= null)&&this.criteriaIncmCode.equals(rhs.criteriaIncmCode))))&&((this.criteriaLeavCode == rhs.criteriaLeavCode)||((this.criteriaLeavCode!= null)&&this.criteriaLeavCode.equals(rhs.criteriaLeavCode))))&&((this.criteriaAprnCode == rhs.criteriaAprnCode)||((this.criteriaAprnCode!= null)&&this.criteriaAprnCode.equals(rhs.criteriaAprnCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
