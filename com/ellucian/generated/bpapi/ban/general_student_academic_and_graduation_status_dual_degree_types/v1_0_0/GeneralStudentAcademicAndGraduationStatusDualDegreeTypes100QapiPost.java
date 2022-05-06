
package com.ellucian.generated.bpapi.ban.general_student_academic_and_graduation_status_dual_degree_types.v1_0_0;

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
    "id",
    "stvtermTermCode",
    "termCodeEff",
    "resdCode",
    "scpcCode",
    "ststCode",
    "rateCode",
    "fullPartInd",
    "stypCode",
    "siteCode",
    "blckCode",
    "sessCode",
    "orsnCode",
    "gainCode",
    "caplCode",
    "voedCode",
    "pracCode",
    "trcnCode",
    "edlvCode",
    "egolCode",
    "incmCode",
    "bsklCode",
    "emexCode",
    "gradCreditApprInd",
    "aprnCode",
    "leavFromDate",
    "leavCode",
    "leavToDate",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("stvtermTermCode")
    private String stvtermTermCode;
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
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
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
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
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
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
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
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String blckCode;
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
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String orsnCode;
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
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String caplCode;
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
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String pracCode;
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
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
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
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm")
    private String incmCode;
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
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex")
    private String emexCode;
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
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn")
    private String aprnCode;
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
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav")
    private String leavCode;
    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_TO_DATE")
    private Date leavToDate;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("stvtermTermCode")
    public String getStvtermTermCode() {
        return stvtermTermCode;
    }

    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withScpcCode(String scpcCode) {
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withStstCode(String ststCode) {
        this.ststCode = ststCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withRateCode(String rateCode) {
        this.rateCode = rateCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withSiteCode(String siteCode) {
        this.siteCode = siteCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withBlckCode(String blckCode) {
        this.blckCode = blckCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withGainCode(String gainCode) {
        this.gainCode = gainCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withCaplCode(String caplCode) {
        this.caplCode = caplCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withVoedCode(String voedCode) {
        this.voedCode = voedCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withPracCode(String pracCode) {
        this.pracCode = pracCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withEgolCode(String egolCode) {
        this.egolCode = egolCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withIncmCode(String incmCode) {
        this.incmCode = incmCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withEmexCode(String emexCode) {
        this.emexCode = emexCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withGradCreditApprInd(String gradCreditApprInd) {
        this.gradCreditApprInd = gradCreditApprInd;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withLeavCode(String leavCode) {
        this.leavCode = leavCode;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("orsnCode");
        sb.append('=');
        sb.append(((this.orsnCode == null)?"<null>":this.orsnCode));
        sb.append(',');
        sb.append("gainCode");
        sb.append('=');
        sb.append(((this.gainCode == null)?"<null>":this.gainCode));
        sb.append(',');
        sb.append("caplCode");
        sb.append('=');
        sb.append(((this.caplCode == null)?"<null>":this.caplCode));
        sb.append(',');
        sb.append("voedCode");
        sb.append('=');
        sb.append(((this.voedCode == null)?"<null>":this.voedCode));
        sb.append(',');
        sb.append("pracCode");
        sb.append('=');
        sb.append(((this.pracCode == null)?"<null>":this.pracCode));
        sb.append(',');
        sb.append("trcnCode");
        sb.append('=');
        sb.append(((this.trcnCode == null)?"<null>":this.trcnCode));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("incmCode");
        sb.append('=');
        sb.append(((this.incmCode == null)?"<null>":this.incmCode));
        sb.append(',');
        sb.append("bsklCode");
        sb.append('=');
        sb.append(((this.bsklCode == null)?"<null>":this.bsklCode));
        sb.append(',');
        sb.append("emexCode");
        sb.append('=');
        sb.append(((this.emexCode == null)?"<null>":this.emexCode));
        sb.append(',');
        sb.append("gradCreditApprInd");
        sb.append('=');
        sb.append(((this.gradCreditApprInd == null)?"<null>":this.gradCreditApprInd));
        sb.append(',');
        sb.append("aprnCode");
        sb.append('=');
        sb.append(((this.aprnCode == null)?"<null>":this.aprnCode));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.incmCode == null)? 0 :this.incmCode.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.pracCode == null)? 0 :this.pracCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.trcnCode == null)? 0 :this.trcnCode.hashCode()));
        result = ((result* 31)+((this.emexCode == null)? 0 :this.emexCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.orsnCode == null)? 0 :this.orsnCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.caplCode == null)? 0 :this.caplCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.gradCreditApprInd == null)? 0 :this.gradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.bsklCode == null)? 0 :this.bsklCode.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.aprnCode == null)? 0 :this.aprnCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
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
        if ((other instanceof GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost) == false) {
            return false;
        }
        GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost rhs = ((GeneralStudentAcademicAndGraduationStatusDualDegreeTypes100QapiPost) other);
        return ((((((((((((((((((((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.incmCode == rhs.incmCode)||((this.incmCode!= null)&&this.incmCode.equals(rhs.incmCode))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.pracCode == rhs.pracCode)||((this.pracCode!= null)&&this.pracCode.equals(rhs.pracCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.trcnCode == rhs.trcnCode)||((this.trcnCode!= null)&&this.trcnCode.equals(rhs.trcnCode))))&&((this.emexCode == rhs.emexCode)||((this.emexCode!= null)&&this.emexCode.equals(rhs.emexCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.orsnCode == rhs.orsnCode)||((this.orsnCode!= null)&&this.orsnCode.equals(rhs.orsnCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.caplCode == rhs.caplCode)||((this.caplCode!= null)&&this.caplCode.equals(rhs.caplCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.gradCreditApprInd == rhs.gradCreditApprInd)||((this.gradCreditApprInd!= null)&&this.gradCreditApprInd.equals(rhs.gradCreditApprInd))))&&((this.bsklCode == rhs.bsklCode)||((this.bsklCode!= null)&&this.bsklCode.equals(rhs.bsklCode))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.aprnCode == rhs.aprnCode)||((this.aprnCode!= null)&&this.aprnCode.equals(rhs.aprnCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gainCode == rhs.gainCode)||((this.gainCode!= null)&&this.gainCode.equals(rhs.gainCode))))&&((this.voedCode == rhs.voedCode)||((this.voedCode!= null)&&this.voedCode.equals(rhs.voedCode))));
    }

}
