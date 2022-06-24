
package com.ellucian.generated.bpapi.ban.general_student_miscellaneous_types.v1_0_0;

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
    "leavCode",
    "criteria.termCodeEff",
    "criteria.userId",
    "criteria.activityDate",
    "incmCode",
    "edlvCode",
    "criteria.emexCode",
    "criteria.aprnCode",
    "criteria.orsnCode",
    "criteria.bsklCode",
    "criteria.caplCode",
    "criteria.blckCode",
    "pracCode",
    "criteria.resdCode",
    "criteria.siteCode",
    "leavToDate",
    "criteria.gradCreditApprInd",
    "criteria.leavFromDate",
    "emexCode",
    "trcnCode",
    "id",
    "stvtermTermCode",
    "criteria.rateCode",
    "criteria.fullPartInd",
    "criteria.leavToDate",
    "orsnCode",
    "criteria.pracCode",
    "criteria.sessCode",
    "criteria.voedCode",
    "criteria.ststCode",
    "caplCode",
    "criteria.stypCode",
    "leavFromDate",
    "criteria.egolCode",
    "criteria.edlvCode",
    "criteria.trcnCode",
    "criteria.gainCode",
    "gradCreditApprInd",
    "bsklCode",
    "egolCode",
    "aprnCode",
    "gainCode",
    "voedCode",
    "criteria.incmCode",
    "criteria.leavCode"
})
@Generated("jsonschema2pojo")
public class GeneralStudentMiscellaneousTypes100PutRequest {

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
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav")
    private String leavCode;
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
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm")
    private String incmCode;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
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
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String pracCode;
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
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_TO_DATE")
    private Date leavToDate;
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
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex")
    private String emexCode;
    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn")
    private String trcnCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private String stvtermTermCode;
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
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String orsnCode;
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
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("criteria.ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String criteriaStstCode;
    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String caplCode;
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
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_FROM_DATE")
    private Date leavFromDate;
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
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("criteria.gainCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain")
    private String criteriaGainCode;
    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("gradCreditApprInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND")
    private String gradCreditApprInd;
    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl")
    private String bsklCode;
    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn")
    private String aprnCode;
    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain")
    private String gainCode;
    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed")
    private String voedCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaScpcCode(String criteriaScpcCode) {
        this.criteriaScpcCode = criteriaScpcCode;
        return this;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    public String getLeavCode() {
        return leavCode;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withLeavCode(String leavCode) {
        this.leavCode = leavCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaTermCodeEff(String criteriaTermCodeEff) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaUserId(String criteriaUserId) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    public String getIncmCode() {
        return incmCode;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    public void setIncmCode(String incmCode) {
        this.incmCode = incmCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withIncmCode(String incmCode) {
        this.incmCode = incmCode;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaEmexCode(String criteriaEmexCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaAprnCode(String criteriaAprnCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaOrsnCode(String criteriaOrsnCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaBsklCode(String criteriaBsklCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaCaplCode(String criteriaCaplCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaBlckCode(String criteriaBlckCode) {
        this.criteriaBlckCode = criteriaBlckCode;
        return this;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    public String getPracCode() {
        return pracCode;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    public void setPracCode(String pracCode) {
        this.pracCode = pracCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withPracCode(String pracCode) {
        this.pracCode = pracCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaResdCode(String criteriaResdCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    public Date getLeavToDate() {
        return leavToDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    public void setLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaGradCreditApprInd(String criteriaGradCreditApprInd) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaLeavFromDate(Date criteriaLeavFromDate) {
        this.criteriaLeavFromDate = criteriaLeavFromDate;
        return this;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    public String getEmexCode() {
        return emexCode;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    public void setEmexCode(String emexCode) {
        this.emexCode = emexCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withEmexCode(String emexCode) {
        this.emexCode = emexCode;
        return this;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    public String getTrcnCode() {
        return trcnCode;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    public void setTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withId(String id) {
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
    public String getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withStvtermTermCode(String stvtermTermCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaRateCode(String criteriaRateCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaLeavToDate(Date criteriaLeavToDate) {
        this.criteriaLeavToDate = criteriaLeavToDate;
        return this;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    public String getOrsnCode() {
        return orsnCode;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    public void setOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaPracCode(String criteriaPracCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaSessCode(String criteriaSessCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaVoedCode(String criteriaVoedCode) {
        this.criteriaVoedCode = criteriaVoedCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaStstCode(String criteriaStstCode) {
        this.criteriaStstCode = criteriaStstCode;
        return this;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    public String getCaplCode() {
        return caplCode;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    public void setCaplCode(String caplCode) {
        this.caplCode = caplCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withCaplCode(String caplCode) {
        this.caplCode = caplCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    public Date getLeavFromDate() {
        return leavFromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    public void setLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaEgolCode(String criteriaEgolCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaEdlvCode(String criteriaEdlvCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaTrcnCode(String criteriaTrcnCode) {
        this.criteriaTrcnCode = criteriaTrcnCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaGainCode(String criteriaGainCode) {
        this.criteriaGainCode = criteriaGainCode;
        return this;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("gradCreditApprInd")
    public String getGradCreditApprInd() {
        return gradCreditApprInd;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("gradCreditApprInd")
    public void setGradCreditApprInd(String gradCreditApprInd) {
        this.gradCreditApprInd = gradCreditApprInd;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withGradCreditApprInd(String gradCreditApprInd) {
        this.gradCreditApprInd = gradCreditApprInd;
        return this;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    public String getBsklCode() {
        return bsklCode;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    public void setBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    public String getAprnCode() {
        return aprnCode;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    public void setAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
        return this;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    public String getGainCode() {
        return gainCode;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    public void setGainCode(String gainCode) {
        this.gainCode = gainCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withGainCode(String gainCode) {
        this.gainCode = gainCode;
        return this;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    public String getVoedCode() {
        return voedCode;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    public void setVoedCode(String voedCode) {
        this.voedCode = voedCode;
    }

    public GeneralStudentMiscellaneousTypes100PutRequest withVoedCode(String voedCode) {
        this.voedCode = voedCode;
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaIncmCode(String criteriaIncmCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withCriteriaLeavCode(String criteriaLeavCode) {
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

    public GeneralStudentMiscellaneousTypes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralStudentMiscellaneousTypes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaScpcCode");
        sb.append('=');
        sb.append(((this.criteriaScpcCode == null)?"<null>":this.criteriaScpcCode));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
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
        sb.append("incmCode");
        sb.append('=');
        sb.append(((this.incmCode == null)?"<null>":this.incmCode));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
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
        sb.append("pracCode");
        sb.append('=');
        sb.append(((this.pracCode == null)?"<null>":this.pracCode));
        sb.append(',');
        sb.append("criteriaResdCode");
        sb.append('=');
        sb.append(((this.criteriaResdCode == null)?"<null>":this.criteriaResdCode));
        sb.append(',');
        sb.append("criteriaSiteCode");
        sb.append('=');
        sb.append(((this.criteriaSiteCode == null)?"<null>":this.criteriaSiteCode));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("criteriaGradCreditApprInd");
        sb.append('=');
        sb.append(((this.criteriaGradCreditApprInd == null)?"<null>":this.criteriaGradCreditApprInd));
        sb.append(',');
        sb.append("criteriaLeavFromDate");
        sb.append('=');
        sb.append(((this.criteriaLeavFromDate == null)?"<null>":this.criteriaLeavFromDate));
        sb.append(',');
        sb.append("emexCode");
        sb.append('=');
        sb.append(((this.emexCode == null)?"<null>":this.emexCode));
        sb.append(',');
        sb.append("trcnCode");
        sb.append('=');
        sb.append(((this.trcnCode == null)?"<null>":this.trcnCode));
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
        sb.append("orsnCode");
        sb.append('=');
        sb.append(((this.orsnCode == null)?"<null>":this.orsnCode));
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
        sb.append("criteriaStstCode");
        sb.append('=');
        sb.append(((this.criteriaStstCode == null)?"<null>":this.criteriaStstCode));
        sb.append(',');
        sb.append("caplCode");
        sb.append('=');
        sb.append(((this.caplCode == null)?"<null>":this.caplCode));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
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
        sb.append("criteriaGainCode");
        sb.append('=');
        sb.append(((this.criteriaGainCode == null)?"<null>":this.criteriaGainCode));
        sb.append(',');
        sb.append("gradCreditApprInd");
        sb.append('=');
        sb.append(((this.gradCreditApprInd == null)?"<null>":this.gradCreditApprInd));
        sb.append(',');
        sb.append("bsklCode");
        sb.append('=');
        sb.append(((this.bsklCode == null)?"<null>":this.bsklCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("aprnCode");
        sb.append('=');
        sb.append(((this.aprnCode == null)?"<null>":this.aprnCode));
        sb.append(',');
        sb.append("gainCode");
        sb.append('=');
        sb.append(((this.gainCode == null)?"<null>":this.gainCode));
        sb.append(',');
        sb.append("voedCode");
        sb.append('=');
        sb.append(((this.voedCode == null)?"<null>":this.voedCode));
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
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.criteriaRateCode == null)? 0 :this.criteriaRateCode.hashCode()));
        result = ((result* 31)+((this.criteriaTrcnCode == null)? 0 :this.criteriaTrcnCode.hashCode()));
        result = ((result* 31)+((this.incmCode == null)? 0 :this.incmCode.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.criteriaSessCode == null)? 0 :this.criteriaSessCode.hashCode()));
        result = ((result* 31)+((this.criteriaVoedCode == null)? 0 :this.criteriaVoedCode.hashCode()));
        result = ((result* 31)+((this.criteriaStstCode == null)? 0 :this.criteriaStstCode.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.criteriaEdlvCode == null)? 0 :this.criteriaEdlvCode.hashCode()));
        result = ((result* 31)+((this.pracCode == null)? 0 :this.pracCode.hashCode()));
        result = ((result* 31)+((this.criteriaSiteCode == null)? 0 :this.criteriaSiteCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrsnCode == null)? 0 :this.criteriaOrsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.criteriaLeavFromDate == null)? 0 :this.criteriaLeavFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaEmexCode == null)? 0 :this.criteriaEmexCode.hashCode()));
        result = ((result* 31)+((this.emexCode == null)? 0 :this.emexCode.hashCode()));
        result = ((result* 31)+((this.trcnCode == null)? 0 :this.trcnCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaPracCode == null)? 0 :this.criteriaPracCode.hashCode()));
        result = ((result* 31)+((this.orsnCode == null)? 0 :this.orsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaScpcCode == null)? 0 :this.criteriaScpcCode.hashCode()));
        result = ((result* 31)+((this.caplCode == null)? 0 :this.caplCode.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaLeavToDate == null)? 0 :this.criteriaLeavToDate.hashCode()));
        result = ((result* 31)+((this.criteriaCaplCode == null)? 0 :this.criteriaCaplCode.hashCode()));
        result = ((result* 31)+((this.criteriaBsklCode == null)? 0 :this.criteriaBsklCode.hashCode()));
        result = ((result* 31)+((this.criteriaBlckCode == null)? 0 :this.criteriaBlckCode.hashCode()));
        result = ((result* 31)+((this.criteriaGradCreditApprInd == null)? 0 :this.criteriaGradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.criteriaGainCode == null)? 0 :this.criteriaGainCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaEgolCode == null)? 0 :this.criteriaEgolCode.hashCode()));
        result = ((result* 31)+((this.gradCreditApprInd == null)? 0 :this.gradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEff == null)? 0 :this.criteriaTermCodeEff.hashCode()));
        result = ((result* 31)+((this.bsklCode == null)? 0 :this.bsklCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.criteriaIncmCode == null)? 0 :this.criteriaIncmCode.hashCode()));
        result = ((result* 31)+((this.criteriaLeavCode == null)? 0 :this.criteriaLeavCode.hashCode()));
        result = ((result* 31)+((this.criteriaAprnCode == null)? 0 :this.criteriaAprnCode.hashCode()));
        result = ((result* 31)+((this.aprnCode == null)? 0 :this.aprnCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gainCode == null)? 0 :this.gainCode.hashCode()));
        result = ((result* 31)+((this.voedCode == null)? 0 :this.voedCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralStudentMiscellaneousTypes100PutRequest) == false) {
            return false;
        }
        GeneralStudentMiscellaneousTypes100PutRequest rhs = ((GeneralStudentMiscellaneousTypes100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.criteriaRateCode == rhs.criteriaRateCode)||((this.criteriaRateCode!= null)&&this.criteriaRateCode.equals(rhs.criteriaRateCode))))&&((this.criteriaTrcnCode == rhs.criteriaTrcnCode)||((this.criteriaTrcnCode!= null)&&this.criteriaTrcnCode.equals(rhs.criteriaTrcnCode))))&&((this.incmCode == rhs.incmCode)||((this.incmCode!= null)&&this.incmCode.equals(rhs.incmCode))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.criteriaSessCode == rhs.criteriaSessCode)||((this.criteriaSessCode!= null)&&this.criteriaSessCode.equals(rhs.criteriaSessCode))))&&((this.criteriaVoedCode == rhs.criteriaVoedCode)||((this.criteriaVoedCode!= null)&&this.criteriaVoedCode.equals(rhs.criteriaVoedCode))))&&((this.criteriaStstCode == rhs.criteriaStstCode)||((this.criteriaStstCode!= null)&&this.criteriaStstCode.equals(rhs.criteriaStstCode))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.criteriaEdlvCode == rhs.criteriaEdlvCode)||((this.criteriaEdlvCode!= null)&&this.criteriaEdlvCode.equals(rhs.criteriaEdlvCode))))&&((this.pracCode == rhs.pracCode)||((this.pracCode!= null)&&this.pracCode.equals(rhs.pracCode))))&&((this.criteriaSiteCode == rhs.criteriaSiteCode)||((this.criteriaSiteCode!= null)&&this.criteriaSiteCode.equals(rhs.criteriaSiteCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaOrsnCode == rhs.criteriaOrsnCode)||((this.criteriaOrsnCode!= null)&&this.criteriaOrsnCode.equals(rhs.criteriaOrsnCode))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.criteriaLeavFromDate == rhs.criteriaLeavFromDate)||((this.criteriaLeavFromDate!= null)&&this.criteriaLeavFromDate.equals(rhs.criteriaLeavFromDate))))&&((this.criteriaEmexCode == rhs.criteriaEmexCode)||((this.criteriaEmexCode!= null)&&this.criteriaEmexCode.equals(rhs.criteriaEmexCode))))&&((this.emexCode == rhs.emexCode)||((this.emexCode!= null)&&this.emexCode.equals(rhs.emexCode))))&&((this.trcnCode == rhs.trcnCode)||((this.trcnCode!= null)&&this.trcnCode.equals(rhs.trcnCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.criteriaPracCode == rhs.criteriaPracCode)||((this.criteriaPracCode!= null)&&this.criteriaPracCode.equals(rhs.criteriaPracCode))))&&((this.orsnCode == rhs.orsnCode)||((this.orsnCode!= null)&&this.orsnCode.equals(rhs.orsnCode))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaScpcCode == rhs.criteriaScpcCode)||((this.criteriaScpcCode!= null)&&this.criteriaScpcCode.equals(rhs.criteriaScpcCode))))&&((this.caplCode == rhs.caplCode)||((this.caplCode!= null)&&this.caplCode.equals(rhs.caplCode))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.criteriaLeavToDate == rhs.criteriaLeavToDate)||((this.criteriaLeavToDate!= null)&&this.criteriaLeavToDate.equals(rhs.criteriaLeavToDate))))&&((this.criteriaCaplCode == rhs.criteriaCaplCode)||((this.criteriaCaplCode!= null)&&this.criteriaCaplCode.equals(rhs.criteriaCaplCode))))&&((this.criteriaBsklCode == rhs.criteriaBsklCode)||((this.criteriaBsklCode!= null)&&this.criteriaBsklCode.equals(rhs.criteriaBsklCode))))&&((this.criteriaBlckCode == rhs.criteriaBlckCode)||((this.criteriaBlckCode!= null)&&this.criteriaBlckCode.equals(rhs.criteriaBlckCode))))&&((this.criteriaGradCreditApprInd == rhs.criteriaGradCreditApprInd)||((this.criteriaGradCreditApprInd!= null)&&this.criteriaGradCreditApprInd.equals(rhs.criteriaGradCreditApprInd))))&&((this.criteriaGainCode == rhs.criteriaGainCode)||((this.criteriaGainCode!= null)&&this.criteriaGainCode.equals(rhs.criteriaGainCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaEgolCode == rhs.criteriaEgolCode)||((this.criteriaEgolCode!= null)&&this.criteriaEgolCode.equals(rhs.criteriaEgolCode))))&&((this.gradCreditApprInd == rhs.gradCreditApprInd)||((this.gradCreditApprInd!= null)&&this.gradCreditApprInd.equals(rhs.gradCreditApprInd))))&&((this.criteriaTermCodeEff == rhs.criteriaTermCodeEff)||((this.criteriaTermCodeEff!= null)&&this.criteriaTermCodeEff.equals(rhs.criteriaTermCodeEff))))&&((this.bsklCode == rhs.bsklCode)||((this.bsklCode!= null)&&this.bsklCode.equals(rhs.bsklCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.criteriaIncmCode == rhs.criteriaIncmCode)||((this.criteriaIncmCode!= null)&&this.criteriaIncmCode.equals(rhs.criteriaIncmCode))))&&((this.criteriaLeavCode == rhs.criteriaLeavCode)||((this.criteriaLeavCode!= null)&&this.criteriaLeavCode.equals(rhs.criteriaLeavCode))))&&((this.criteriaAprnCode == rhs.criteriaAprnCode)||((this.criteriaAprnCode!= null)&&this.criteriaAprnCode.equals(rhs.criteriaAprnCode))))&&((this.aprnCode == rhs.aprnCode)||((this.aprnCode!= null)&&this.aprnCode.equals(rhs.aprnCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gainCode == rhs.gainCode)||((this.gainCode!= null)&&this.gainCode.equals(rhs.gainCode))))&&((this.voedCode == rhs.voedCode)||((this.voedCode!= null)&&this.voedCode.equals(rhs.voedCode))));
    }

}
