
package com.ellucian.generated.bpapi.ban.test_score_administration_type_academic_and_graduation_status_dual_degree.v1_0_0;

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
    "gainDesc",
    "leavCode",
    "shrttrmAstdCodeEndOfTerm",
    "shrttrmCastCode",
    "incmCode",
    "shrttrmClasCode",
    "termEffBegin",
    "shrttrmPrevCode",
    "sessCode",
    "stvdegcDescDual",
    "pracCode",
    "incmDescription",
    "emexCode",
    "termCodeAstd",
    "aprnDesc",
    "orsnCode",
    "stvlevlDescDual",
    "stvststDesc",
    "stvresdDesc",
    "shrttrmPrevDesc",
    "stvastdDescHistory",
    "stvsessDesc",
    "edlvDescription",
    "leavFromDate",
    "resdCode",
    "blckDesc",
    "stvastdDescOverride",
    "scpcCode",
    "ststCode",
    "gradCreditApprInd",
    "bsklCode",
    "deptCodeDual",
    "trcnDesc",
    "stvpracDesc",
    "gainCode",
    "voedCode",
    "majrCodeDual",
    "prevCode",
    "egolDesc",
    "termEffDesc",
    "edlvCode",
    "stvmajrDescDual",
    "stvorsnDesc",
    "shrttrmTermCode",
    "stvcollDescDual",
    "rateCode",
    "termCodeGrad",
    "stvcaplDesc",
    "voedDesc",
    "stvstypDesc",
    "leavToDate",
    "stvscpcDesc",
    "trcnCode",
    "collCodeDual",
    "castCode",
    "stvleavDesc",
    "termEffEnd",
    "fullPartInd",
    "expGradDate",
    "castDesc",
    "termCodePrev",
    "siteCode",
    "termCodeEff",
    "levlCodeDual",
    "caplCode",
    "prevDesc",
    "stvdeptDescDual",
    "bsklDesc",
    "stvsiteDesc",
    "shrttrmCastDesc",
    "acyrCode",
    "stvrateDesc",
    "blckCode",
    "egolCode",
    "aprnCode",
    "stypCode",
    "astdCode",
    "emexDesc",
    "stvclasDesc",
    "degcCodeDual",
    "termCodeCast"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse {

    @JsonProperty("gainDesc")
    private String gainDesc;
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
     * Academic Status
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("shrttrmAstdCodeEndOfTerm")
    @JsonPropertyDescription("Lookup lineage reference object : stvastd")
    private String shrttrmAstdCodeEndOfTerm;
    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("shrttrmCastCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcast")
    private String shrttrmCastCode;
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
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("shrttrmClasCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvclas")
    private String shrttrmClasCode;
    /**
     * From Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffBegin")
    private String termEffBegin;
    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("shrttrmPrevCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvprev")
    private String shrttrmPrevCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    @JsonProperty("stvdegcDescDual")
    private String stvdegcDescDual;
    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String pracCode;
    @JsonProperty("incmDescription")
    private String incmDescription;
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
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAstd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm")
    private String termCodeAstd;
    @JsonProperty("aprnDesc")
    private String aprnDesc;
    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String orsnCode;
    @JsonProperty("stvlevlDescDual")
    private String stvlevlDescDual;
    @JsonProperty("stvststDesc")
    private String stvststDesc;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
    @JsonProperty("shrttrmPrevDesc")
    private String shrttrmPrevDesc;
    @JsonProperty("stvastdDescHistory")
    private String stvastdDescHistory;
    @JsonProperty("stvsessDesc")
    private String stvsessDesc;
    @JsonProperty("edlvDescription")
    private String edlvDescription;
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
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    @JsonProperty("blckDesc")
    private String blckDesc;
    @JsonProperty("stvastdDescOverride")
    private String stvastdDescOverride;
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
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
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
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept")
    private String deptCodeDual;
    @JsonProperty("trcnDesc")
    private String trcnDesc;
    @JsonProperty("stvpracDesc")
    private String stvpracDesc;
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
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr")
    private String majrCodeDual;
    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev")
    private String prevCode;
    @JsonProperty("egolDesc")
    private String egolDesc;
    @JsonProperty("termEffDesc")
    private String termEffDesc;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    @JsonProperty("stvmajrDescDual")
    private String stvmajrDescDual;
    @JsonProperty("stvorsnDesc")
    private String stvorsnDesc;
    /**
     * Academic Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("shrttrmTermCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvterm")
    private String shrttrmTermCode;
    @JsonProperty("stvcollDescDual")
    private String stvcollDescDual;
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
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
    @JsonProperty("stvcaplDesc")
    private String stvcaplDesc;
    @JsonProperty("voedDesc")
    private String voedDesc;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_TO_DATE")
    private Date leavToDate;
    @JsonProperty("stvscpcDesc")
    private String stvscpcDesc;
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
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll")
    private String collCodeDual;
    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast")
    private String castCode;
    @JsonProperty("stvleavDesc")
    private String stvleavDesc;
    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffEnd")
    private String termEffEnd;
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
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EXP_GRAD_DATE")
    private Date expGradDate;
    @JsonProperty("castDesc")
    private String castDesc;
    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodePrev")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm")
    private String termCodePrev;
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
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String termCodeEff;
    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl")
    private String levlCodeDual;
    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String caplCode;
    @JsonProperty("prevDesc")
    private String prevDesc;
    @JsonProperty("stvdeptDescDual")
    private String stvdeptDescDual;
    @JsonProperty("bsklDesc")
    private String bsklDesc;
    @JsonProperty("stvsiteDesc")
    private String stvsiteDesc;
    @JsonProperty("shrttrmCastDesc")
    private String shrttrmCastDesc;
    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SGBSTDN_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ACYR_CODE, Lookup lineage reference object : stvacyr")
    private String acyrCode;
    @JsonProperty("stvrateDesc")
    private String stvrateDesc;
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
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd")
    private String astdCode;
    @JsonProperty("emexDesc")
    private String emexDesc;
    @JsonProperty("stvclasDesc")
    private String stvclasDesc;
    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc")
    private String degcCodeDual;
    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCast")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm")
    private String termCodeCast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gainDesc")
    public String getGainDesc() {
        return gainDesc;
    }

    @JsonProperty("gainDesc")
    public void setGainDesc(String gainDesc) {
        this.gainDesc = gainDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withGainDesc(String gainDesc) {
        this.gainDesc = gainDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    /**
     * Academic Status
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("shrttrmAstdCodeEndOfTerm")
    public String getShrttrmAstdCodeEndOfTerm() {
        return shrttrmAstdCodeEndOfTerm;
    }

    /**
     * Academic Status
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("shrttrmAstdCodeEndOfTerm")
    public void setShrttrmAstdCodeEndOfTerm(String shrttrmAstdCodeEndOfTerm) {
        this.shrttrmAstdCodeEndOfTerm = shrttrmAstdCodeEndOfTerm;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmAstdCodeEndOfTerm(String shrttrmAstdCodeEndOfTerm) {
        this.shrttrmAstdCodeEndOfTerm = shrttrmAstdCodeEndOfTerm;
        return this;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("shrttrmCastCode")
    public String getShrttrmCastCode() {
        return shrttrmCastCode;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("shrttrmCastCode")
    public void setShrttrmCastCode(String shrttrmCastCode) {
        this.shrttrmCastCode = shrttrmCastCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmCastCode(String shrttrmCastCode) {
        this.shrttrmCastCode = shrttrmCastCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withIncmCode(String incmCode) {
        this.incmCode = incmCode;
        return this;
    }

    /**
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("shrttrmClasCode")
    public String getShrttrmClasCode() {
        return shrttrmClasCode;
    }

    /**
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("shrttrmClasCode")
    public void setShrttrmClasCode(String shrttrmClasCode) {
        this.shrttrmClasCode = shrttrmClasCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmClasCode(String shrttrmClasCode) {
        this.shrttrmClasCode = shrttrmClasCode;
        return this;
    }

    /**
     * From Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffBegin")
    public String getTermEffBegin() {
        return termEffBegin;
    }

    /**
     * From Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffBegin")
    public void setTermEffBegin(String termEffBegin) {
        this.termEffBegin = termEffBegin;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermEffBegin(String termEffBegin) {
        this.termEffBegin = termEffBegin;
        return this;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("shrttrmPrevCode")
    public String getShrttrmPrevCode() {
        return shrttrmPrevCode;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("shrttrmPrevCode")
    public void setShrttrmPrevCode(String shrttrmPrevCode) {
        this.shrttrmPrevCode = shrttrmPrevCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmPrevCode(String shrttrmPrevCode) {
        this.shrttrmPrevCode = shrttrmPrevCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("stvdegcDescDual")
    public String getStvdegcDescDual() {
        return stvdegcDescDual;
    }

    @JsonProperty("stvdegcDescDual")
    public void setStvdegcDescDual(String stvdegcDescDual) {
        this.stvdegcDescDual = stvdegcDescDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvdegcDescDual(String stvdegcDescDual) {
        this.stvdegcDescDual = stvdegcDescDual;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withPracCode(String pracCode) {
        this.pracCode = pracCode;
        return this;
    }

    @JsonProperty("incmDescription")
    public String getIncmDescription() {
        return incmDescription;
    }

    @JsonProperty("incmDescription")
    public void setIncmDescription(String incmDescription) {
        this.incmDescription = incmDescription;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withIncmDescription(String incmDescription) {
        this.incmDescription = incmDescription;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEmexCode(String emexCode) {
        this.emexCode = emexCode;
        return this;
    }

    /**
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAstd")
    public String getTermCodeAstd() {
        return termCodeAstd;
    }

    /**
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAstd")
    public void setTermCodeAstd(String termCodeAstd) {
        this.termCodeAstd = termCodeAstd;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermCodeAstd(String termCodeAstd) {
        this.termCodeAstd = termCodeAstd;
        return this;
    }

    @JsonProperty("aprnDesc")
    public String getAprnDesc() {
        return aprnDesc;
    }

    @JsonProperty("aprnDesc")
    public void setAprnDesc(String aprnDesc) {
        this.aprnDesc = aprnDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withAprnDesc(String aprnDesc) {
        this.aprnDesc = aprnDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
        return this;
    }

    @JsonProperty("stvlevlDescDual")
    public String getStvlevlDescDual() {
        return stvlevlDescDual;
    }

    @JsonProperty("stvlevlDescDual")
    public void setStvlevlDescDual(String stvlevlDescDual) {
        this.stvlevlDescDual = stvlevlDescDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvlevlDescDual(String stvlevlDescDual) {
        this.stvlevlDescDual = stvlevlDescDual;
        return this;
    }

    @JsonProperty("stvststDesc")
    public String getStvststDesc() {
        return stvststDesc;
    }

    @JsonProperty("stvststDesc")
    public void setStvststDesc(String stvststDesc) {
        this.stvststDesc = stvststDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvststDesc(String stvststDesc) {
        this.stvststDesc = stvststDesc;
        return this;
    }

    @JsonProperty("stvresdDesc")
    public String getStvresdDesc() {
        return stvresdDesc;
    }

    @JsonProperty("stvresdDesc")
    public void setStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
        return this;
    }

    @JsonProperty("shrttrmPrevDesc")
    public String getShrttrmPrevDesc() {
        return shrttrmPrevDesc;
    }

    @JsonProperty("shrttrmPrevDesc")
    public void setShrttrmPrevDesc(String shrttrmPrevDesc) {
        this.shrttrmPrevDesc = shrttrmPrevDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmPrevDesc(String shrttrmPrevDesc) {
        this.shrttrmPrevDesc = shrttrmPrevDesc;
        return this;
    }

    @JsonProperty("stvastdDescHistory")
    public String getStvastdDescHistory() {
        return stvastdDescHistory;
    }

    @JsonProperty("stvastdDescHistory")
    public void setStvastdDescHistory(String stvastdDescHistory) {
        this.stvastdDescHistory = stvastdDescHistory;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvastdDescHistory(String stvastdDescHistory) {
        this.stvastdDescHistory = stvastdDescHistory;
        return this;
    }

    @JsonProperty("stvsessDesc")
    public String getStvsessDesc() {
        return stvsessDesc;
    }

    @JsonProperty("stvsessDesc")
    public void setStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
        return this;
    }

    @JsonProperty("edlvDescription")
    public String getEdlvDescription() {
        return edlvDescription;
    }

    @JsonProperty("edlvDescription")
    public void setEdlvDescription(String edlvDescription) {
        this.edlvDescription = edlvDescription;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEdlvDescription(String edlvDescription) {
        this.edlvDescription = edlvDescription;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("blckDesc")
    public String getBlckDesc() {
        return blckDesc;
    }

    @JsonProperty("blckDesc")
    public void setBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
        return this;
    }

    @JsonProperty("stvastdDescOverride")
    public String getStvastdDescOverride() {
        return stvastdDescOverride;
    }

    @JsonProperty("stvastdDescOverride")
    public void setStvastdDescOverride(String stvastdDescOverride) {
        this.stvastdDescOverride = stvastdDescOverride;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvastdDescOverride(String stvastdDescOverride) {
        this.stvastdDescOverride = stvastdDescOverride;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStstCode(String ststCode) {
        this.ststCode = ststCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withGradCreditApprInd(String gradCreditApprInd) {
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    public String getDeptCodeDual() {
        return deptCodeDual;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    public void setDeptCodeDual(String deptCodeDual) {
        this.deptCodeDual = deptCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withDeptCodeDual(String deptCodeDual) {
        this.deptCodeDual = deptCodeDual;
        return this;
    }

    @JsonProperty("trcnDesc")
    public String getTrcnDesc() {
        return trcnDesc;
    }

    @JsonProperty("trcnDesc")
    public void setTrcnDesc(String trcnDesc) {
        this.trcnDesc = trcnDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTrcnDesc(String trcnDesc) {
        this.trcnDesc = trcnDesc;
        return this;
    }

    @JsonProperty("stvpracDesc")
    public String getStvpracDesc() {
        return stvpracDesc;
    }

    @JsonProperty("stvpracDesc")
    public void setStvpracDesc(String stvpracDesc) {
        this.stvpracDesc = stvpracDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvpracDesc(String stvpracDesc) {
        this.stvpracDesc = stvpracDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withGainCode(String gainCode) {
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withVoedCode(String voedCode) {
        this.voedCode = voedCode;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    public String getMajrCodeDual() {
        return majrCodeDual;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    public void setMajrCodeDual(String majrCodeDual) {
        this.majrCodeDual = majrCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withMajrCodeDual(String majrCodeDual) {
        this.majrCodeDual = majrCodeDual;
        return this;
    }

    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public String getPrevCode() {
        return prevCode;
    }

    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public void setPrevCode(String prevCode) {
        this.prevCode = prevCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withPrevCode(String prevCode) {
        this.prevCode = prevCode;
        return this;
    }

    @JsonProperty("egolDesc")
    public String getEgolDesc() {
        return egolDesc;
    }

    @JsonProperty("egolDesc")
    public void setEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
        return this;
    }

    @JsonProperty("termEffDesc")
    public String getTermEffDesc() {
        return termEffDesc;
    }

    @JsonProperty("termEffDesc")
    public void setTermEffDesc(String termEffDesc) {
        this.termEffDesc = termEffDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermEffDesc(String termEffDesc) {
        this.termEffDesc = termEffDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    @JsonProperty("stvmajrDescDual")
    public String getStvmajrDescDual() {
        return stvmajrDescDual;
    }

    @JsonProperty("stvmajrDescDual")
    public void setStvmajrDescDual(String stvmajrDescDual) {
        this.stvmajrDescDual = stvmajrDescDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvmajrDescDual(String stvmajrDescDual) {
        this.stvmajrDescDual = stvmajrDescDual;
        return this;
    }

    @JsonProperty("stvorsnDesc")
    public String getStvorsnDesc() {
        return stvorsnDesc;
    }

    @JsonProperty("stvorsnDesc")
    public void setStvorsnDesc(String stvorsnDesc) {
        this.stvorsnDesc = stvorsnDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvorsnDesc(String stvorsnDesc) {
        this.stvorsnDesc = stvorsnDesc;
        return this;
    }

    /**
     * Academic Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("shrttrmTermCode")
    public String getShrttrmTermCode() {
        return shrttrmTermCode;
    }

    /**
     * Academic Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("shrttrmTermCode")
    public void setShrttrmTermCode(String shrttrmTermCode) {
        this.shrttrmTermCode = shrttrmTermCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmTermCode(String shrttrmTermCode) {
        this.shrttrmTermCode = shrttrmTermCode;
        return this;
    }

    @JsonProperty("stvcollDescDual")
    public String getStvcollDescDual() {
        return stvcollDescDual;
    }

    @JsonProperty("stvcollDescDual")
    public void setStvcollDescDual(String stvcollDescDual) {
        this.stvcollDescDual = stvcollDescDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvcollDescDual(String stvcollDescDual) {
        this.stvcollDescDual = stvcollDescDual;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    @JsonProperty("stvcaplDesc")
    public String getStvcaplDesc() {
        return stvcaplDesc;
    }

    @JsonProperty("stvcaplDesc")
    public void setStvcaplDesc(String stvcaplDesc) {
        this.stvcaplDesc = stvcaplDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvcaplDesc(String stvcaplDesc) {
        this.stvcaplDesc = stvcaplDesc;
        return this;
    }

    @JsonProperty("voedDesc")
    public String getVoedDesc() {
        return voedDesc;
    }

    @JsonProperty("voedDesc")
    public void setVoedDesc(String voedDesc) {
        this.voedDesc = voedDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withVoedDesc(String voedDesc) {
        this.voedDesc = voedDesc;
        return this;
    }

    @JsonProperty("stvstypDesc")
    public String getStvstypDesc() {
        return stvstypDesc;
    }

    @JsonProperty("stvstypDesc")
    public void setStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    @JsonProperty("stvscpcDesc")
    public String getStvscpcDesc() {
        return stvscpcDesc;
    }

    @JsonProperty("stvscpcDesc")
    public void setStvscpcDesc(String stvscpcDesc) {
        this.stvscpcDesc = stvscpcDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvscpcDesc(String stvscpcDesc) {
        this.stvscpcDesc = stvscpcDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    public String getCollCodeDual() {
        return collCodeDual;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    public void setCollCodeDual(String collCodeDual) {
        this.collCodeDual = collCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withCollCodeDual(String collCodeDual) {
        this.collCodeDual = collCodeDual;
        return this;
    }

    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public String getCastCode() {
        return castCode;
    }

    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public void setCastCode(String castCode) {
        this.castCode = castCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withCastCode(String castCode) {
        this.castCode = castCode;
        return this;
    }

    @JsonProperty("stvleavDesc")
    public String getStvleavDesc() {
        return stvleavDesc;
    }

    @JsonProperty("stvleavDesc")
    public void setStvleavDesc(String stvleavDesc) {
        this.stvleavDesc = stvleavDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvleavDesc(String stvleavDesc) {
        this.stvleavDesc = stvleavDesc;
        return this;
    }

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffEnd")
    public String getTermEffEnd() {
        return termEffEnd;
    }

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termEffEnd")
    public void setTermEffEnd(String termEffEnd) {
        this.termEffEnd = termEffEnd;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermEffEnd(String termEffEnd) {
        this.termEffEnd = termEffEnd;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    public Date getExpGradDate() {
        return expGradDate;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    public void setExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
        return this;
    }

    @JsonProperty("castDesc")
    public String getCastDesc() {
        return castDesc;
    }

    @JsonProperty("castDesc")
    public void setCastDesc(String castDesc) {
        this.castDesc = castDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withCastDesc(String castDesc) {
        this.castDesc = castDesc;
        return this;
    }

    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodePrev")
    public String getTermCodePrev() {
        return termCodePrev;
    }

    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodePrev")
    public void setTermCodePrev(String termCodePrev) {
        this.termCodePrev = termCodePrev;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermCodePrev(String termCodePrev) {
        this.termCodePrev = termCodePrev;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    public String getLevlCodeDual() {
        return levlCodeDual;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    public void setLevlCodeDual(String levlCodeDual) {
        this.levlCodeDual = levlCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withLevlCodeDual(String levlCodeDual) {
        this.levlCodeDual = levlCodeDual;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withCaplCode(String caplCode) {
        this.caplCode = caplCode;
        return this;
    }

    @JsonProperty("prevDesc")
    public String getPrevDesc() {
        return prevDesc;
    }

    @JsonProperty("prevDesc")
    public void setPrevDesc(String prevDesc) {
        this.prevDesc = prevDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withPrevDesc(String prevDesc) {
        this.prevDesc = prevDesc;
        return this;
    }

    @JsonProperty("stvdeptDescDual")
    public String getStvdeptDescDual() {
        return stvdeptDescDual;
    }

    @JsonProperty("stvdeptDescDual")
    public void setStvdeptDescDual(String stvdeptDescDual) {
        this.stvdeptDescDual = stvdeptDescDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvdeptDescDual(String stvdeptDescDual) {
        this.stvdeptDescDual = stvdeptDescDual;
        return this;
    }

    @JsonProperty("bsklDesc")
    public String getBsklDesc() {
        return bsklDesc;
    }

    @JsonProperty("bsklDesc")
    public void setBsklDesc(String bsklDesc) {
        this.bsklDesc = bsklDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withBsklDesc(String bsklDesc) {
        this.bsklDesc = bsklDesc;
        return this;
    }

    @JsonProperty("stvsiteDesc")
    public String getStvsiteDesc() {
        return stvsiteDesc;
    }

    @JsonProperty("stvsiteDesc")
    public void setStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
        return this;
    }

    @JsonProperty("shrttrmCastDesc")
    public String getShrttrmCastDesc() {
        return shrttrmCastDesc;
    }

    @JsonProperty("shrttrmCastDesc")
    public void setShrttrmCastDesc(String shrttrmCastDesc) {
        this.shrttrmCastDesc = shrttrmCastDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withShrttrmCastDesc(String shrttrmCastDesc) {
        this.shrttrmCastDesc = shrttrmCastDesc;
        return this;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SGBSTDN_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public String getAcyrCode() {
        return acyrCode;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SGBSTDN_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public void setAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
        return this;
    }

    @JsonProperty("stvrateDesc")
    public String getStvrateDesc() {
        return stvrateDesc;
    }

    @JsonProperty("stvrateDesc")
    public void setStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withBlckCode(String blckCode) {
        this.blckCode = blckCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEgolCode(String egolCode) {
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public String getAstdCode() {
        return astdCode;
    }

    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public void setAstdCode(String astdCode) {
        this.astdCode = astdCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withAstdCode(String astdCode) {
        this.astdCode = astdCode;
        return this;
    }

    @JsonProperty("emexDesc")
    public String getEmexDesc() {
        return emexDesc;
    }

    @JsonProperty("emexDesc")
    public void setEmexDesc(String emexDesc) {
        this.emexDesc = emexDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withEmexDesc(String emexDesc) {
        this.emexDesc = emexDesc;
        return this;
    }

    @JsonProperty("stvclasDesc")
    public String getStvclasDesc() {
        return stvclasDesc;
    }

    @JsonProperty("stvclasDesc")
    public void setStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    public String getDegcCodeDual() {
        return degcCodeDual;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    public void setDegcCodeDual(String degcCodeDual) {
        this.degcCodeDual = degcCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withDegcCodeDual(String degcCodeDual) {
        this.degcCodeDual = degcCodeDual;
        return this;
    }

    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCast")
    public String getTermCodeCast() {
        return termCodeCast;
    }

    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCast")
    public void setTermCodeCast(String termCodeCast) {
        this.termCodeCast = termCodeCast;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withTermCodeCast(String termCodeCast) {
        this.termCodeCast = termCodeCast;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gainDesc");
        sb.append('=');
        sb.append(((this.gainDesc == null)?"<null>":this.gainDesc));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("shrttrmAstdCodeEndOfTerm");
        sb.append('=');
        sb.append(((this.shrttrmAstdCodeEndOfTerm == null)?"<null>":this.shrttrmAstdCodeEndOfTerm));
        sb.append(',');
        sb.append("shrttrmCastCode");
        sb.append('=');
        sb.append(((this.shrttrmCastCode == null)?"<null>":this.shrttrmCastCode));
        sb.append(',');
        sb.append("incmCode");
        sb.append('=');
        sb.append(((this.incmCode == null)?"<null>":this.incmCode));
        sb.append(',');
        sb.append("shrttrmClasCode");
        sb.append('=');
        sb.append(((this.shrttrmClasCode == null)?"<null>":this.shrttrmClasCode));
        sb.append(',');
        sb.append("termEffBegin");
        sb.append('=');
        sb.append(((this.termEffBegin == null)?"<null>":this.termEffBegin));
        sb.append(',');
        sb.append("shrttrmPrevCode");
        sb.append('=');
        sb.append(((this.shrttrmPrevCode == null)?"<null>":this.shrttrmPrevCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("stvdegcDescDual");
        sb.append('=');
        sb.append(((this.stvdegcDescDual == null)?"<null>":this.stvdegcDescDual));
        sb.append(',');
        sb.append("pracCode");
        sb.append('=');
        sb.append(((this.pracCode == null)?"<null>":this.pracCode));
        sb.append(',');
        sb.append("incmDescription");
        sb.append('=');
        sb.append(((this.incmDescription == null)?"<null>":this.incmDescription));
        sb.append(',');
        sb.append("emexCode");
        sb.append('=');
        sb.append(((this.emexCode == null)?"<null>":this.emexCode));
        sb.append(',');
        sb.append("termCodeAstd");
        sb.append('=');
        sb.append(((this.termCodeAstd == null)?"<null>":this.termCodeAstd));
        sb.append(',');
        sb.append("aprnDesc");
        sb.append('=');
        sb.append(((this.aprnDesc == null)?"<null>":this.aprnDesc));
        sb.append(',');
        sb.append("orsnCode");
        sb.append('=');
        sb.append(((this.orsnCode == null)?"<null>":this.orsnCode));
        sb.append(',');
        sb.append("stvlevlDescDual");
        sb.append('=');
        sb.append(((this.stvlevlDescDual == null)?"<null>":this.stvlevlDescDual));
        sb.append(',');
        sb.append("stvststDesc");
        sb.append('=');
        sb.append(((this.stvststDesc == null)?"<null>":this.stvststDesc));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("shrttrmPrevDesc");
        sb.append('=');
        sb.append(((this.shrttrmPrevDesc == null)?"<null>":this.shrttrmPrevDesc));
        sb.append(',');
        sb.append("stvastdDescHistory");
        sb.append('=');
        sb.append(((this.stvastdDescHistory == null)?"<null>":this.stvastdDescHistory));
        sb.append(',');
        sb.append("stvsessDesc");
        sb.append('=');
        sb.append(((this.stvsessDesc == null)?"<null>":this.stvsessDesc));
        sb.append(',');
        sb.append("edlvDescription");
        sb.append('=');
        sb.append(((this.edlvDescription == null)?"<null>":this.edlvDescription));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("blckDesc");
        sb.append('=');
        sb.append(((this.blckDesc == null)?"<null>":this.blckDesc));
        sb.append(',');
        sb.append("stvastdDescOverride");
        sb.append('=');
        sb.append(((this.stvastdDescOverride == null)?"<null>":this.stvastdDescOverride));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("gradCreditApprInd");
        sb.append('=');
        sb.append(((this.gradCreditApprInd == null)?"<null>":this.gradCreditApprInd));
        sb.append(',');
        sb.append("bsklCode");
        sb.append('=');
        sb.append(((this.bsklCode == null)?"<null>":this.bsklCode));
        sb.append(',');
        sb.append("deptCodeDual");
        sb.append('=');
        sb.append(((this.deptCodeDual == null)?"<null>":this.deptCodeDual));
        sb.append(',');
        sb.append("trcnDesc");
        sb.append('=');
        sb.append(((this.trcnDesc == null)?"<null>":this.trcnDesc));
        sb.append(',');
        sb.append("stvpracDesc");
        sb.append('=');
        sb.append(((this.stvpracDesc == null)?"<null>":this.stvpracDesc));
        sb.append(',');
        sb.append("gainCode");
        sb.append('=');
        sb.append(((this.gainCode == null)?"<null>":this.gainCode));
        sb.append(',');
        sb.append("voedCode");
        sb.append('=');
        sb.append(((this.voedCode == null)?"<null>":this.voedCode));
        sb.append(',');
        sb.append("majrCodeDual");
        sb.append('=');
        sb.append(((this.majrCodeDual == null)?"<null>":this.majrCodeDual));
        sb.append(',');
        sb.append("prevCode");
        sb.append('=');
        sb.append(((this.prevCode == null)?"<null>":this.prevCode));
        sb.append(',');
        sb.append("egolDesc");
        sb.append('=');
        sb.append(((this.egolDesc == null)?"<null>":this.egolDesc));
        sb.append(',');
        sb.append("termEffDesc");
        sb.append('=');
        sb.append(((this.termEffDesc == null)?"<null>":this.termEffDesc));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("stvmajrDescDual");
        sb.append('=');
        sb.append(((this.stvmajrDescDual == null)?"<null>":this.stvmajrDescDual));
        sb.append(',');
        sb.append("stvorsnDesc");
        sb.append('=');
        sb.append(((this.stvorsnDesc == null)?"<null>":this.stvorsnDesc));
        sb.append(',');
        sb.append("shrttrmTermCode");
        sb.append('=');
        sb.append(((this.shrttrmTermCode == null)?"<null>":this.shrttrmTermCode));
        sb.append(',');
        sb.append("stvcollDescDual");
        sb.append('=');
        sb.append(((this.stvcollDescDual == null)?"<null>":this.stvcollDescDual));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("stvcaplDesc");
        sb.append('=');
        sb.append(((this.stvcaplDesc == null)?"<null>":this.stvcaplDesc));
        sb.append(',');
        sb.append("voedDesc");
        sb.append('=');
        sb.append(((this.voedDesc == null)?"<null>":this.voedDesc));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("stvscpcDesc");
        sb.append('=');
        sb.append(((this.stvscpcDesc == null)?"<null>":this.stvscpcDesc));
        sb.append(',');
        sb.append("trcnCode");
        sb.append('=');
        sb.append(((this.trcnCode == null)?"<null>":this.trcnCode));
        sb.append(',');
        sb.append("collCodeDual");
        sb.append('=');
        sb.append(((this.collCodeDual == null)?"<null>":this.collCodeDual));
        sb.append(',');
        sb.append("castCode");
        sb.append('=');
        sb.append(((this.castCode == null)?"<null>":this.castCode));
        sb.append(',');
        sb.append("stvleavDesc");
        sb.append('=');
        sb.append(((this.stvleavDesc == null)?"<null>":this.stvleavDesc));
        sb.append(',');
        sb.append("termEffEnd");
        sb.append('=');
        sb.append(((this.termEffEnd == null)?"<null>":this.termEffEnd));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("expGradDate");
        sb.append('=');
        sb.append(((this.expGradDate == null)?"<null>":this.expGradDate));
        sb.append(',');
        sb.append("castDesc");
        sb.append('=');
        sb.append(((this.castDesc == null)?"<null>":this.castDesc));
        sb.append(',');
        sb.append("termCodePrev");
        sb.append('=');
        sb.append(((this.termCodePrev == null)?"<null>":this.termCodePrev));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("levlCodeDual");
        sb.append('=');
        sb.append(((this.levlCodeDual == null)?"<null>":this.levlCodeDual));
        sb.append(',');
        sb.append("caplCode");
        sb.append('=');
        sb.append(((this.caplCode == null)?"<null>":this.caplCode));
        sb.append(',');
        sb.append("prevDesc");
        sb.append('=');
        sb.append(((this.prevDesc == null)?"<null>":this.prevDesc));
        sb.append(',');
        sb.append("stvdeptDescDual");
        sb.append('=');
        sb.append(((this.stvdeptDescDual == null)?"<null>":this.stvdeptDescDual));
        sb.append(',');
        sb.append("bsklDesc");
        sb.append('=');
        sb.append(((this.bsklDesc == null)?"<null>":this.bsklDesc));
        sb.append(',');
        sb.append("stvsiteDesc");
        sb.append('=');
        sb.append(((this.stvsiteDesc == null)?"<null>":this.stvsiteDesc));
        sb.append(',');
        sb.append("shrttrmCastDesc");
        sb.append('=');
        sb.append(((this.shrttrmCastDesc == null)?"<null>":this.shrttrmCastDesc));
        sb.append(',');
        sb.append("acyrCode");
        sb.append('=');
        sb.append(((this.acyrCode == null)?"<null>":this.acyrCode));
        sb.append(',');
        sb.append("stvrateDesc");
        sb.append('=');
        sb.append(((this.stvrateDesc == null)?"<null>":this.stvrateDesc));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("aprnCode");
        sb.append('=');
        sb.append(((this.aprnCode == null)?"<null>":this.aprnCode));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("astdCode");
        sb.append('=');
        sb.append(((this.astdCode == null)?"<null>":this.astdCode));
        sb.append(',');
        sb.append("emexDesc");
        sb.append('=');
        sb.append(((this.emexDesc == null)?"<null>":this.emexDesc));
        sb.append(',');
        sb.append("stvclasDesc");
        sb.append('=');
        sb.append(((this.stvclasDesc == null)?"<null>":this.stvclasDesc));
        sb.append(',');
        sb.append("degcCodeDual");
        sb.append('=');
        sb.append(((this.degcCodeDual == null)?"<null>":this.degcCodeDual));
        sb.append(',');
        sb.append("termCodeCast");
        sb.append('=');
        sb.append(((this.termCodeCast == null)?"<null>":this.termCodeCast));
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
        result = ((result* 31)+((this.gainDesc == null)? 0 :this.gainDesc.hashCode()));
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.shrttrmAstdCodeEndOfTerm == null)? 0 :this.shrttrmAstdCodeEndOfTerm.hashCode()));
        result = ((result* 31)+((this.shrttrmCastCode == null)? 0 :this.shrttrmCastCode.hashCode()));
        result = ((result* 31)+((this.incmCode == null)? 0 :this.incmCode.hashCode()));
        result = ((result* 31)+((this.shrttrmClasCode == null)? 0 :this.shrttrmClasCode.hashCode()));
        result = ((result* 31)+((this.termEffBegin == null)? 0 :this.termEffBegin.hashCode()));
        result = ((result* 31)+((this.shrttrmPrevCode == null)? 0 :this.shrttrmPrevCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.stvdegcDescDual == null)? 0 :this.stvdegcDescDual.hashCode()));
        result = ((result* 31)+((this.pracCode == null)? 0 :this.pracCode.hashCode()));
        result = ((result* 31)+((this.incmDescription == null)? 0 :this.incmDescription.hashCode()));
        result = ((result* 31)+((this.emexCode == null)? 0 :this.emexCode.hashCode()));
        result = ((result* 31)+((this.termCodeAstd == null)? 0 :this.termCodeAstd.hashCode()));
        result = ((result* 31)+((this.aprnDesc == null)? 0 :this.aprnDesc.hashCode()));
        result = ((result* 31)+((this.orsnCode == null)? 0 :this.orsnCode.hashCode()));
        result = ((result* 31)+((this.stvlevlDescDual == null)? 0 :this.stvlevlDescDual.hashCode()));
        result = ((result* 31)+((this.stvststDesc == null)? 0 :this.stvststDesc.hashCode()));
        result = ((result* 31)+((this.stvresdDesc == null)? 0 :this.stvresdDesc.hashCode()));
        result = ((result* 31)+((this.shrttrmPrevDesc == null)? 0 :this.shrttrmPrevDesc.hashCode()));
        result = ((result* 31)+((this.stvastdDescHistory == null)? 0 :this.stvastdDescHistory.hashCode()));
        result = ((result* 31)+((this.stvsessDesc == null)? 0 :this.stvsessDesc.hashCode()));
        result = ((result* 31)+((this.edlvDescription == null)? 0 :this.edlvDescription.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.blckDesc == null)? 0 :this.blckDesc.hashCode()));
        result = ((result* 31)+((this.stvastdDescOverride == null)? 0 :this.stvastdDescOverride.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.gradCreditApprInd == null)? 0 :this.gradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.bsklCode == null)? 0 :this.bsklCode.hashCode()));
        result = ((result* 31)+((this.deptCodeDual == null)? 0 :this.deptCodeDual.hashCode()));
        result = ((result* 31)+((this.trcnDesc == null)? 0 :this.trcnDesc.hashCode()));
        result = ((result* 31)+((this.stvpracDesc == null)? 0 :this.stvpracDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gainCode == null)? 0 :this.gainCode.hashCode()));
        result = ((result* 31)+((this.voedCode == null)? 0 :this.voedCode.hashCode()));
        result = ((result* 31)+((this.majrCodeDual == null)? 0 :this.majrCodeDual.hashCode()));
        result = ((result* 31)+((this.prevCode == null)? 0 :this.prevCode.hashCode()));
        result = ((result* 31)+((this.egolDesc == null)? 0 :this.egolDesc.hashCode()));
        result = ((result* 31)+((this.termEffDesc == null)? 0 :this.termEffDesc.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.stvmajrDescDual == null)? 0 :this.stvmajrDescDual.hashCode()));
        result = ((result* 31)+((this.stvorsnDesc == null)? 0 :this.stvorsnDesc.hashCode()));
        result = ((result* 31)+((this.shrttrmTermCode == null)? 0 :this.shrttrmTermCode.hashCode()));
        result = ((result* 31)+((this.stvcollDescDual == null)? 0 :this.stvcollDescDual.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.stvcaplDesc == null)? 0 :this.stvcaplDesc.hashCode()));
        result = ((result* 31)+((this.voedDesc == null)? 0 :this.voedDesc.hashCode()));
        result = ((result* 31)+((this.stvstypDesc == null)? 0 :this.stvstypDesc.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.stvscpcDesc == null)? 0 :this.stvscpcDesc.hashCode()));
        result = ((result* 31)+((this.trcnCode == null)? 0 :this.trcnCode.hashCode()));
        result = ((result* 31)+((this.collCodeDual == null)? 0 :this.collCodeDual.hashCode()));
        result = ((result* 31)+((this.castCode == null)? 0 :this.castCode.hashCode()));
        result = ((result* 31)+((this.stvleavDesc == null)? 0 :this.stvleavDesc.hashCode()));
        result = ((result* 31)+((this.termEffEnd == null)? 0 :this.termEffEnd.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.expGradDate == null)? 0 :this.expGradDate.hashCode()));
        result = ((result* 31)+((this.castDesc == null)? 0 :this.castDesc.hashCode()));
        result = ((result* 31)+((this.termCodePrev == null)? 0 :this.termCodePrev.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.levlCodeDual == null)? 0 :this.levlCodeDual.hashCode()));
        result = ((result* 31)+((this.caplCode == null)? 0 :this.caplCode.hashCode()));
        result = ((result* 31)+((this.prevDesc == null)? 0 :this.prevDesc.hashCode()));
        result = ((result* 31)+((this.stvdeptDescDual == null)? 0 :this.stvdeptDescDual.hashCode()));
        result = ((result* 31)+((this.bsklDesc == null)? 0 :this.bsklDesc.hashCode()));
        result = ((result* 31)+((this.stvsiteDesc == null)? 0 :this.stvsiteDesc.hashCode()));
        result = ((result* 31)+((this.shrttrmCastDesc == null)? 0 :this.shrttrmCastDesc.hashCode()));
        result = ((result* 31)+((this.acyrCode == null)? 0 :this.acyrCode.hashCode()));
        result = ((result* 31)+((this.stvrateDesc == null)? 0 :this.stvrateDesc.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.aprnCode == null)? 0 :this.aprnCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.astdCode == null)? 0 :this.astdCode.hashCode()));
        result = ((result* 31)+((this.emexDesc == null)? 0 :this.emexDesc.hashCode()));
        result = ((result* 31)+((this.stvclasDesc == null)? 0 :this.stvclasDesc.hashCode()));
        result = ((result* 31)+((this.degcCodeDual == null)? 0 :this.degcCodeDual.hashCode()));
        result = ((result* 31)+((this.termCodeCast == null)? 0 :this.termCodeCast.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse) == false) {
            return false;
        }
        TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse rhs = ((TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.gainDesc == rhs.gainDesc)||((this.gainDesc!= null)&&this.gainDesc.equals(rhs.gainDesc)))&&((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode))))&&((this.shrttrmAstdCodeEndOfTerm == rhs.shrttrmAstdCodeEndOfTerm)||((this.shrttrmAstdCodeEndOfTerm!= null)&&this.shrttrmAstdCodeEndOfTerm.equals(rhs.shrttrmAstdCodeEndOfTerm))))&&((this.shrttrmCastCode == rhs.shrttrmCastCode)||((this.shrttrmCastCode!= null)&&this.shrttrmCastCode.equals(rhs.shrttrmCastCode))))&&((this.incmCode == rhs.incmCode)||((this.incmCode!= null)&&this.incmCode.equals(rhs.incmCode))))&&((this.shrttrmClasCode == rhs.shrttrmClasCode)||((this.shrttrmClasCode!= null)&&this.shrttrmClasCode.equals(rhs.shrttrmClasCode))))&&((this.termEffBegin == rhs.termEffBegin)||((this.termEffBegin!= null)&&this.termEffBegin.equals(rhs.termEffBegin))))&&((this.shrttrmPrevCode == rhs.shrttrmPrevCode)||((this.shrttrmPrevCode!= null)&&this.shrttrmPrevCode.equals(rhs.shrttrmPrevCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.stvdegcDescDual == rhs.stvdegcDescDual)||((this.stvdegcDescDual!= null)&&this.stvdegcDescDual.equals(rhs.stvdegcDescDual))))&&((this.pracCode == rhs.pracCode)||((this.pracCode!= null)&&this.pracCode.equals(rhs.pracCode))))&&((this.incmDescription == rhs.incmDescription)||((this.incmDescription!= null)&&this.incmDescription.equals(rhs.incmDescription))))&&((this.emexCode == rhs.emexCode)||((this.emexCode!= null)&&this.emexCode.equals(rhs.emexCode))))&&((this.termCodeAstd == rhs.termCodeAstd)||((this.termCodeAstd!= null)&&this.termCodeAstd.equals(rhs.termCodeAstd))))&&((this.aprnDesc == rhs.aprnDesc)||((this.aprnDesc!= null)&&this.aprnDesc.equals(rhs.aprnDesc))))&&((this.orsnCode == rhs.orsnCode)||((this.orsnCode!= null)&&this.orsnCode.equals(rhs.orsnCode))))&&((this.stvlevlDescDual == rhs.stvlevlDescDual)||((this.stvlevlDescDual!= null)&&this.stvlevlDescDual.equals(rhs.stvlevlDescDual))))&&((this.stvststDesc == rhs.stvststDesc)||((this.stvststDesc!= null)&&this.stvststDesc.equals(rhs.stvststDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.shrttrmPrevDesc == rhs.shrttrmPrevDesc)||((this.shrttrmPrevDesc!= null)&&this.shrttrmPrevDesc.equals(rhs.shrttrmPrevDesc))))&&((this.stvastdDescHistory == rhs.stvastdDescHistory)||((this.stvastdDescHistory!= null)&&this.stvastdDescHistory.equals(rhs.stvastdDescHistory))))&&((this.stvsessDesc == rhs.stvsessDesc)||((this.stvsessDesc!= null)&&this.stvsessDesc.equals(rhs.stvsessDesc))))&&((this.edlvDescription == rhs.edlvDescription)||((this.edlvDescription!= null)&&this.edlvDescription.equals(rhs.edlvDescription))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.blckDesc == rhs.blckDesc)||((this.blckDesc!= null)&&this.blckDesc.equals(rhs.blckDesc))))&&((this.stvastdDescOverride == rhs.stvastdDescOverride)||((this.stvastdDescOverride!= null)&&this.stvastdDescOverride.equals(rhs.stvastdDescOverride))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.gradCreditApprInd == rhs.gradCreditApprInd)||((this.gradCreditApprInd!= null)&&this.gradCreditApprInd.equals(rhs.gradCreditApprInd))))&&((this.bsklCode == rhs.bsklCode)||((this.bsklCode!= null)&&this.bsklCode.equals(rhs.bsklCode))))&&((this.deptCodeDual == rhs.deptCodeDual)||((this.deptCodeDual!= null)&&this.deptCodeDual.equals(rhs.deptCodeDual))))&&((this.trcnDesc == rhs.trcnDesc)||((this.trcnDesc!= null)&&this.trcnDesc.equals(rhs.trcnDesc))))&&((this.stvpracDesc == rhs.stvpracDesc)||((this.stvpracDesc!= null)&&this.stvpracDesc.equals(rhs.stvpracDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gainCode == rhs.gainCode)||((this.gainCode!= null)&&this.gainCode.equals(rhs.gainCode))))&&((this.voedCode == rhs.voedCode)||((this.voedCode!= null)&&this.voedCode.equals(rhs.voedCode))))&&((this.majrCodeDual == rhs.majrCodeDual)||((this.majrCodeDual!= null)&&this.majrCodeDual.equals(rhs.majrCodeDual))))&&((this.prevCode == rhs.prevCode)||((this.prevCode!= null)&&this.prevCode.equals(rhs.prevCode))))&&((this.egolDesc == rhs.egolDesc)||((this.egolDesc!= null)&&this.egolDesc.equals(rhs.egolDesc))))&&((this.termEffDesc == rhs.termEffDesc)||((this.termEffDesc!= null)&&this.termEffDesc.equals(rhs.termEffDesc))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.stvmajrDescDual == rhs.stvmajrDescDual)||((this.stvmajrDescDual!= null)&&this.stvmajrDescDual.equals(rhs.stvmajrDescDual))))&&((this.stvorsnDesc == rhs.stvorsnDesc)||((this.stvorsnDesc!= null)&&this.stvorsnDesc.equals(rhs.stvorsnDesc))))&&((this.shrttrmTermCode == rhs.shrttrmTermCode)||((this.shrttrmTermCode!= null)&&this.shrttrmTermCode.equals(rhs.shrttrmTermCode))))&&((this.stvcollDescDual == rhs.stvcollDescDual)||((this.stvcollDescDual!= null)&&this.stvcollDescDual.equals(rhs.stvcollDescDual))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.stvcaplDesc == rhs.stvcaplDesc)||((this.stvcaplDesc!= null)&&this.stvcaplDesc.equals(rhs.stvcaplDesc))))&&((this.voedDesc == rhs.voedDesc)||((this.voedDesc!= null)&&this.voedDesc.equals(rhs.voedDesc))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.stvscpcDesc == rhs.stvscpcDesc)||((this.stvscpcDesc!= null)&&this.stvscpcDesc.equals(rhs.stvscpcDesc))))&&((this.trcnCode == rhs.trcnCode)||((this.trcnCode!= null)&&this.trcnCode.equals(rhs.trcnCode))))&&((this.collCodeDual == rhs.collCodeDual)||((this.collCodeDual!= null)&&this.collCodeDual.equals(rhs.collCodeDual))))&&((this.castCode == rhs.castCode)||((this.castCode!= null)&&this.castCode.equals(rhs.castCode))))&&((this.stvleavDesc == rhs.stvleavDesc)||((this.stvleavDesc!= null)&&this.stvleavDesc.equals(rhs.stvleavDesc))))&&((this.termEffEnd == rhs.termEffEnd)||((this.termEffEnd!= null)&&this.termEffEnd.equals(rhs.termEffEnd))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.expGradDate == rhs.expGradDate)||((this.expGradDate!= null)&&this.expGradDate.equals(rhs.expGradDate))))&&((this.castDesc == rhs.castDesc)||((this.castDesc!= null)&&this.castDesc.equals(rhs.castDesc))))&&((this.termCodePrev == rhs.termCodePrev)||((this.termCodePrev!= null)&&this.termCodePrev.equals(rhs.termCodePrev))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.levlCodeDual == rhs.levlCodeDual)||((this.levlCodeDual!= null)&&this.levlCodeDual.equals(rhs.levlCodeDual))))&&((this.caplCode == rhs.caplCode)||((this.caplCode!= null)&&this.caplCode.equals(rhs.caplCode))))&&((this.prevDesc == rhs.prevDesc)||((this.prevDesc!= null)&&this.prevDesc.equals(rhs.prevDesc))))&&((this.stvdeptDescDual == rhs.stvdeptDescDual)||((this.stvdeptDescDual!= null)&&this.stvdeptDescDual.equals(rhs.stvdeptDescDual))))&&((this.bsklDesc == rhs.bsklDesc)||((this.bsklDesc!= null)&&this.bsklDesc.equals(rhs.bsklDesc))))&&((this.stvsiteDesc == rhs.stvsiteDesc)||((this.stvsiteDesc!= null)&&this.stvsiteDesc.equals(rhs.stvsiteDesc))))&&((this.shrttrmCastDesc == rhs.shrttrmCastDesc)||((this.shrttrmCastDesc!= null)&&this.shrttrmCastDesc.equals(rhs.shrttrmCastDesc))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.stvrateDesc == rhs.stvrateDesc)||((this.stvrateDesc!= null)&&this.stvrateDesc.equals(rhs.stvrateDesc))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.aprnCode == rhs.aprnCode)||((this.aprnCode!= null)&&this.aprnCode.equals(rhs.aprnCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.astdCode == rhs.astdCode)||((this.astdCode!= null)&&this.astdCode.equals(rhs.astdCode))))&&((this.emexDesc == rhs.emexDesc)||((this.emexDesc!= null)&&this.emexDesc.equals(rhs.emexDesc))))&&((this.stvclasDesc == rhs.stvclasDesc)||((this.stvclasDesc!= null)&&this.stvclasDesc.equals(rhs.stvclasDesc))))&&((this.degcCodeDual == rhs.degcCodeDual)||((this.degcCodeDual!= null)&&this.degcCodeDual.equals(rhs.degcCodeDual))))&&((this.termCodeCast == rhs.termCodeCast)||((this.termCodeCast!= null)&&this.termCodeCast.equals(rhs.termCodeCast))));
    }

}
