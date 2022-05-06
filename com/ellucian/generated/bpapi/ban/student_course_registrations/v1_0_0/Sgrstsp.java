
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "astdDesc",
    "prevCode",
    "egolDesc",
    "incmCode",
    "edlvCode",
    "caplDesc",
    "stspCode",
    "sessDesc",
    "resdDesc",
    "voedDesc",
    "sessCode",
    "pracCode",
    "incmDesc",
    "emexCode",
    "trcnCode",
    "castCode",
    "aprnDesc",
    "fullPartInd",
    "orsnCode",
    "castDesc",
    "termCodeEff",
    "caplCode",
    "prevDesc",
    "resdCode",
    "edlvDesc",
    "blckDesc",
    "bsklDesc",
    "endStspTerm",
    "stspDesc",
    "keySeqno",
    "pracDesc",
    "bsklCode",
    "trcnDesc",
    "blckCode",
    "egolCode",
    "name",
    "aprnCode",
    "orsnDesc",
    "gainCode",
    "voedCode",
    "astdCode",
    "emexDesc"
})
@Generated("jsonschema2pojo")
public class Sgrstsp {

    @JsonProperty("gainDesc")
    private String gainDesc;
    @JsonProperty("astdDesc")
    private String astdDesc;
    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SGRSTSP_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_PREV_CODE, Lookup lineage reference object : stvprev")
    private String prevCode;
    @JsonProperty("egolDesc")
    private String egolDesc;
    /**
     * Income Range
     * <p>
     * Lineage reference object : SGRSTSP_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_INCM_CODE, Lookup lineage reference object : stvincm")
    private String incmCode;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGRSTSP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    @JsonProperty("caplDesc")
    private String caplDesc;
    /**
     * Study Path Status
     * <p>
     * Lineage reference object : SGRSTSP_STSP_CODE, Lookup lineage reference object : saturn,stvstsp
     * (Required)
     * 
     */
    @JsonProperty("stspCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_STSP_CODE, Lookup lineage reference object : saturn,stvstsp")
    private String stspCode;
    @JsonProperty("sessDesc")
    private String sessDesc;
    @JsonProperty("resdDesc")
    private String resdDesc;
    @JsonProperty("voedDesc")
    private String voedDesc;
    /**
     * Session
     * <p>
     * Lineage reference object : SGRSTSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGRSTSP_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String pracCode;
    @JsonProperty("incmDesc")
    private String incmDesc;
    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGRSTSP_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_EMEX_CODE, Lookup lineage reference object : stvemex")
    private String emexCode;
    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGRSTSP_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_TRCN_CODE, Lookup lineage reference object : stvtrcn")
    private String trcnCode;
    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_CAST_CODE, Lookup lineage reference object : stvcast")
    private String castCode;
    @JsonProperty("aprnDesc")
    private String aprnDesc;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGRSTSP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGRSTSP_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String orsnCode;
    @JsonProperty("castDesc")
    private String castDesc;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGRSTSP_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String termCodeEff;
    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGRSTSP_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String caplCode;
    @JsonProperty("prevDesc")
    private String prevDesc;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGRSTSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    @JsonProperty("edlvDesc")
    private String edlvDesc;
    @JsonProperty("blckDesc")
    private String blckDesc;
    @JsonProperty("bsklDesc")
    private String bsklDesc;
    /**
     * End Term
     * <p>
     * 
     * 
     */
    @JsonProperty("endStspTerm")
    private String endStspTerm;
    @JsonProperty("stspDesc")
    private String stspDesc;
    /**
     * Study Path Sequence
     * <p>
     * Lineage reference object : SGRSTSP_KEY_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("keySeqno")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_KEY_SEQNO")
    private Double keySeqno;
    @JsonProperty("pracDesc")
    private String pracDesc;
    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGRSTSP_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_BSKL_CODE, Lookup lineage reference object : stvbskl")
    private String bsklCode;
    @JsonProperty("trcnDesc")
    private String trcnDesc;
    /**
     * Block
     * <p>
     * Lineage reference object : SGRSTSP_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String blckCode;
    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGRSTSP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    @JsonProperty("name")
    private String name;
    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGRSTSP_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_APRN_CODE, Lookup lineage reference object : stvaprn")
    private String aprnCode;
    @JsonProperty("orsnDesc")
    private String orsnDesc;
    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGRSTSP_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_GAIN_CODE, Lookup lineage reference object : stvgain")
    private String gainCode;
    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGRSTSP_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_VOED_CODE, Lookup lineage reference object : stvvoed")
    private String voedCode;
    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    @JsonPropertyDescription("Lineage reference object : SGRSTSP_ASTD_CODE, Lookup lineage reference object : stvastd")
    private String astdCode;
    @JsonProperty("emexDesc")
    private String emexDesc;
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

    public Sgrstsp withGainDesc(String gainDesc) {
        this.gainDesc = gainDesc;
        return this;
    }

    @JsonProperty("astdDesc")
    public String getAstdDesc() {
        return astdDesc;
    }

    @JsonProperty("astdDesc")
    public void setAstdDesc(String astdDesc) {
        this.astdDesc = astdDesc;
    }

    public Sgrstsp withAstdDesc(String astdDesc) {
        this.astdDesc = astdDesc;
        return this;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SGRSTSP_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public String getPrevCode() {
        return prevCode;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SGRSTSP_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public void setPrevCode(String prevCode) {
        this.prevCode = prevCode;
    }

    public Sgrstsp withPrevCode(String prevCode) {
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

    public Sgrstsp withEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
        return this;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGRSTSP_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    public String getIncmCode() {
        return incmCode;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGRSTSP_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("incmCode")
    public void setIncmCode(String incmCode) {
        this.incmCode = incmCode;
    }

    public Sgrstsp withIncmCode(String incmCode) {
        this.incmCode = incmCode;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGRSTSP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGRSTSP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public Sgrstsp withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    @JsonProperty("caplDesc")
    public String getCaplDesc() {
        return caplDesc;
    }

    @JsonProperty("caplDesc")
    public void setCaplDesc(String caplDesc) {
        this.caplDesc = caplDesc;
    }

    public Sgrstsp withCaplDesc(String caplDesc) {
        this.caplDesc = caplDesc;
        return this;
    }

    /**
     * Study Path Status
     * <p>
     * Lineage reference object : SGRSTSP_STSP_CODE, Lookup lineage reference object : saturn,stvstsp
     * (Required)
     * 
     */
    @JsonProperty("stspCode")
    public String getStspCode() {
        return stspCode;
    }

    /**
     * Study Path Status
     * <p>
     * Lineage reference object : SGRSTSP_STSP_CODE, Lookup lineage reference object : saturn,stvstsp
     * (Required)
     * 
     */
    @JsonProperty("stspCode")
    public void setStspCode(String stspCode) {
        this.stspCode = stspCode;
    }

    public Sgrstsp withStspCode(String stspCode) {
        this.stspCode = stspCode;
        return this;
    }

    @JsonProperty("sessDesc")
    public String getSessDesc() {
        return sessDesc;
    }

    @JsonProperty("sessDesc")
    public void setSessDesc(String sessDesc) {
        this.sessDesc = sessDesc;
    }

    public Sgrstsp withSessDesc(String sessDesc) {
        this.sessDesc = sessDesc;
        return this;
    }

    @JsonProperty("resdDesc")
    public String getResdDesc() {
        return resdDesc;
    }

    @JsonProperty("resdDesc")
    public void setResdDesc(String resdDesc) {
        this.resdDesc = resdDesc;
    }

    public Sgrstsp withResdDesc(String resdDesc) {
        this.resdDesc = resdDesc;
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

    public Sgrstsp withVoedDesc(String voedDesc) {
        this.voedDesc = voedDesc;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGRSTSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGRSTSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public Sgrstsp withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGRSTSP_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    public String getPracCode() {
        return pracCode;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGRSTSP_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("pracCode")
    public void setPracCode(String pracCode) {
        this.pracCode = pracCode;
    }

    public Sgrstsp withPracCode(String pracCode) {
        this.pracCode = pracCode;
        return this;
    }

    @JsonProperty("incmDesc")
    public String getIncmDesc() {
        return incmDesc;
    }

    @JsonProperty("incmDesc")
    public void setIncmDesc(String incmDesc) {
        this.incmDesc = incmDesc;
    }

    public Sgrstsp withIncmDesc(String incmDesc) {
        this.incmDesc = incmDesc;
        return this;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGRSTSP_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    public String getEmexCode() {
        return emexCode;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGRSTSP_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("emexCode")
    public void setEmexCode(String emexCode) {
        this.emexCode = emexCode;
    }

    public Sgrstsp withEmexCode(String emexCode) {
        this.emexCode = emexCode;
        return this;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGRSTSP_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    public String getTrcnCode() {
        return trcnCode;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGRSTSP_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("trcnCode")
    public void setTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
    }

    public Sgrstsp withTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
        return this;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public String getCastCode() {
        return castCode;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public void setCastCode(String castCode) {
        this.castCode = castCode;
    }

    public Sgrstsp withCastCode(String castCode) {
        this.castCode = castCode;
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

    public Sgrstsp withAprnDesc(String aprnDesc) {
        this.aprnDesc = aprnDesc;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGRSTSP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGRSTSP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public Sgrstsp withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGRSTSP_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    public String getOrsnCode() {
        return orsnCode;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGRSTSP_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("orsnCode")
    public void setOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
    }

    public Sgrstsp withOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
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

    public Sgrstsp withCastDesc(String castDesc) {
        this.castDesc = castDesc;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGRSTSP_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGRSTSP_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public Sgrstsp withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGRSTSP_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    public String getCaplCode() {
        return caplCode;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGRSTSP_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("caplCode")
    public void setCaplCode(String caplCode) {
        this.caplCode = caplCode;
    }

    public Sgrstsp withCaplCode(String caplCode) {
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

    public Sgrstsp withPrevDesc(String prevDesc) {
        this.prevDesc = prevDesc;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGRSTSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGRSTSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public Sgrstsp withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("edlvDesc")
    public String getEdlvDesc() {
        return edlvDesc;
    }

    @JsonProperty("edlvDesc")
    public void setEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
    }

    public Sgrstsp withEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
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

    public Sgrstsp withBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
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

    public Sgrstsp withBsklDesc(String bsklDesc) {
        this.bsklDesc = bsklDesc;
        return this;
    }

    /**
     * End Term
     * <p>
     * 
     * 
     */
    @JsonProperty("endStspTerm")
    public String getEndStspTerm() {
        return endStspTerm;
    }

    /**
     * End Term
     * <p>
     * 
     * 
     */
    @JsonProperty("endStspTerm")
    public void setEndStspTerm(String endStspTerm) {
        this.endStspTerm = endStspTerm;
    }

    public Sgrstsp withEndStspTerm(String endStspTerm) {
        this.endStspTerm = endStspTerm;
        return this;
    }

    @JsonProperty("stspDesc")
    public String getStspDesc() {
        return stspDesc;
    }

    @JsonProperty("stspDesc")
    public void setStspDesc(String stspDesc) {
        this.stspDesc = stspDesc;
    }

    public Sgrstsp withStspDesc(String stspDesc) {
        this.stspDesc = stspDesc;
        return this;
    }

    /**
     * Study Path Sequence
     * <p>
     * Lineage reference object : SGRSTSP_KEY_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("keySeqno")
    public Double getKeySeqno() {
        return keySeqno;
    }

    /**
     * Study Path Sequence
     * <p>
     * Lineage reference object : SGRSTSP_KEY_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("keySeqno")
    public void setKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
    }

    public Sgrstsp withKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
        return this;
    }

    @JsonProperty("pracDesc")
    public String getPracDesc() {
        return pracDesc;
    }

    @JsonProperty("pracDesc")
    public void setPracDesc(String pracDesc) {
        this.pracDesc = pracDesc;
    }

    public Sgrstsp withPracDesc(String pracDesc) {
        this.pracDesc = pracDesc;
        return this;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGRSTSP_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    public String getBsklCode() {
        return bsklCode;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGRSTSP_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("bsklCode")
    public void setBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
    }

    public Sgrstsp withBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
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

    public Sgrstsp withTrcnDesc(String trcnDesc) {
        this.trcnDesc = trcnDesc;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGRSTSP_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGRSTSP_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public Sgrstsp withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGRSTSP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGRSTSP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public Sgrstsp withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Sgrstsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGRSTSP_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    public String getAprnCode() {
        return aprnCode;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGRSTSP_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("aprnCode")
    public void setAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
    }

    public Sgrstsp withAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
        return this;
    }

    @JsonProperty("orsnDesc")
    public String getOrsnDesc() {
        return orsnDesc;
    }

    @JsonProperty("orsnDesc")
    public void setOrsnDesc(String orsnDesc) {
        this.orsnDesc = orsnDesc;
    }

    public Sgrstsp withOrsnDesc(String orsnDesc) {
        this.orsnDesc = orsnDesc;
        return this;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGRSTSP_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    public String getGainCode() {
        return gainCode;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGRSTSP_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("gainCode")
    public void setGainCode(String gainCode) {
        this.gainCode = gainCode;
    }

    public Sgrstsp withGainCode(String gainCode) {
        this.gainCode = gainCode;
        return this;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGRSTSP_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    public String getVoedCode() {
        return voedCode;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGRSTSP_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("voedCode")
    public void setVoedCode(String voedCode) {
        this.voedCode = voedCode;
    }

    public Sgrstsp withVoedCode(String voedCode) {
        this.voedCode = voedCode;
        return this;
    }

    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public String getAstdCode() {
        return astdCode;
    }

    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGRSTSP_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public void setAstdCode(String astdCode) {
        this.astdCode = astdCode;
    }

    public Sgrstsp withAstdCode(String astdCode) {
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

    public Sgrstsp withEmexDesc(String emexDesc) {
        this.emexDesc = emexDesc;
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

    public Sgrstsp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgrstsp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gainDesc");
        sb.append('=');
        sb.append(((this.gainDesc == null)?"<null>":this.gainDesc));
        sb.append(',');
        sb.append("astdDesc");
        sb.append('=');
        sb.append(((this.astdDesc == null)?"<null>":this.astdDesc));
        sb.append(',');
        sb.append("prevCode");
        sb.append('=');
        sb.append(((this.prevCode == null)?"<null>":this.prevCode));
        sb.append(',');
        sb.append("egolDesc");
        sb.append('=');
        sb.append(((this.egolDesc == null)?"<null>":this.egolDesc));
        sb.append(',');
        sb.append("incmCode");
        sb.append('=');
        sb.append(((this.incmCode == null)?"<null>":this.incmCode));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("caplDesc");
        sb.append('=');
        sb.append(((this.caplDesc == null)?"<null>":this.caplDesc));
        sb.append(',');
        sb.append("stspCode");
        sb.append('=');
        sb.append(((this.stspCode == null)?"<null>":this.stspCode));
        sb.append(',');
        sb.append("sessDesc");
        sb.append('=');
        sb.append(((this.sessDesc == null)?"<null>":this.sessDesc));
        sb.append(',');
        sb.append("resdDesc");
        sb.append('=');
        sb.append(((this.resdDesc == null)?"<null>":this.resdDesc));
        sb.append(',');
        sb.append("voedDesc");
        sb.append('=');
        sb.append(((this.voedDesc == null)?"<null>":this.voedDesc));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("pracCode");
        sb.append('=');
        sb.append(((this.pracCode == null)?"<null>":this.pracCode));
        sb.append(',');
        sb.append("incmDesc");
        sb.append('=');
        sb.append(((this.incmDesc == null)?"<null>":this.incmDesc));
        sb.append(',');
        sb.append("emexCode");
        sb.append('=');
        sb.append(((this.emexCode == null)?"<null>":this.emexCode));
        sb.append(',');
        sb.append("trcnCode");
        sb.append('=');
        sb.append(((this.trcnCode == null)?"<null>":this.trcnCode));
        sb.append(',');
        sb.append("castCode");
        sb.append('=');
        sb.append(((this.castCode == null)?"<null>":this.castCode));
        sb.append(',');
        sb.append("aprnDesc");
        sb.append('=');
        sb.append(((this.aprnDesc == null)?"<null>":this.aprnDesc));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("orsnCode");
        sb.append('=');
        sb.append(((this.orsnCode == null)?"<null>":this.orsnCode));
        sb.append(',');
        sb.append("castDesc");
        sb.append('=');
        sb.append(((this.castDesc == null)?"<null>":this.castDesc));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("caplCode");
        sb.append('=');
        sb.append(((this.caplCode == null)?"<null>":this.caplCode));
        sb.append(',');
        sb.append("prevDesc");
        sb.append('=');
        sb.append(((this.prevDesc == null)?"<null>":this.prevDesc));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("edlvDesc");
        sb.append('=');
        sb.append(((this.edlvDesc == null)?"<null>":this.edlvDesc));
        sb.append(',');
        sb.append("blckDesc");
        sb.append('=');
        sb.append(((this.blckDesc == null)?"<null>":this.blckDesc));
        sb.append(',');
        sb.append("bsklDesc");
        sb.append('=');
        sb.append(((this.bsklDesc == null)?"<null>":this.bsklDesc));
        sb.append(',');
        sb.append("endStspTerm");
        sb.append('=');
        sb.append(((this.endStspTerm == null)?"<null>":this.endStspTerm));
        sb.append(',');
        sb.append("stspDesc");
        sb.append('=');
        sb.append(((this.stspDesc == null)?"<null>":this.stspDesc));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
        sb.append(',');
        sb.append("pracDesc");
        sb.append('=');
        sb.append(((this.pracDesc == null)?"<null>":this.pracDesc));
        sb.append(',');
        sb.append("bsklCode");
        sb.append('=');
        sb.append(((this.bsklCode == null)?"<null>":this.bsklCode));
        sb.append(',');
        sb.append("trcnDesc");
        sb.append('=');
        sb.append(((this.trcnDesc == null)?"<null>":this.trcnDesc));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("aprnCode");
        sb.append('=');
        sb.append(((this.aprnCode == null)?"<null>":this.aprnCode));
        sb.append(',');
        sb.append("orsnDesc");
        sb.append('=');
        sb.append(((this.orsnDesc == null)?"<null>":this.orsnDesc));
        sb.append(',');
        sb.append("gainCode");
        sb.append('=');
        sb.append(((this.gainCode == null)?"<null>":this.gainCode));
        sb.append(',');
        sb.append("voedCode");
        sb.append('=');
        sb.append(((this.voedCode == null)?"<null>":this.voedCode));
        sb.append(',');
        sb.append("astdCode");
        sb.append('=');
        sb.append(((this.astdCode == null)?"<null>":this.astdCode));
        sb.append(',');
        sb.append("emexDesc");
        sb.append('=');
        sb.append(((this.emexDesc == null)?"<null>":this.emexDesc));
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
        result = ((result* 31)+((this.astdDesc == null)? 0 :this.astdDesc.hashCode()));
        result = ((result* 31)+((this.prevCode == null)? 0 :this.prevCode.hashCode()));
        result = ((result* 31)+((this.egolDesc == null)? 0 :this.egolDesc.hashCode()));
        result = ((result* 31)+((this.incmCode == null)? 0 :this.incmCode.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.caplDesc == null)? 0 :this.caplDesc.hashCode()));
        result = ((result* 31)+((this.stspCode == null)? 0 :this.stspCode.hashCode()));
        result = ((result* 31)+((this.sessDesc == null)? 0 :this.sessDesc.hashCode()));
        result = ((result* 31)+((this.resdDesc == null)? 0 :this.resdDesc.hashCode()));
        result = ((result* 31)+((this.voedDesc == null)? 0 :this.voedDesc.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.pracCode == null)? 0 :this.pracCode.hashCode()));
        result = ((result* 31)+((this.incmDesc == null)? 0 :this.incmDesc.hashCode()));
        result = ((result* 31)+((this.emexCode == null)? 0 :this.emexCode.hashCode()));
        result = ((result* 31)+((this.trcnCode == null)? 0 :this.trcnCode.hashCode()));
        result = ((result* 31)+((this.castCode == null)? 0 :this.castCode.hashCode()));
        result = ((result* 31)+((this.aprnDesc == null)? 0 :this.aprnDesc.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.orsnCode == null)? 0 :this.orsnCode.hashCode()));
        result = ((result* 31)+((this.castDesc == null)? 0 :this.castDesc.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.caplCode == null)? 0 :this.caplCode.hashCode()));
        result = ((result* 31)+((this.prevDesc == null)? 0 :this.prevDesc.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.edlvDesc == null)? 0 :this.edlvDesc.hashCode()));
        result = ((result* 31)+((this.blckDesc == null)? 0 :this.blckDesc.hashCode()));
        result = ((result* 31)+((this.bsklDesc == null)? 0 :this.bsklDesc.hashCode()));
        result = ((result* 31)+((this.endStspTerm == null)? 0 :this.endStspTerm.hashCode()));
        result = ((result* 31)+((this.stspDesc == null)? 0 :this.stspDesc.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        result = ((result* 31)+((this.pracDesc == null)? 0 :this.pracDesc.hashCode()));
        result = ((result* 31)+((this.bsklCode == null)? 0 :this.bsklCode.hashCode()));
        result = ((result* 31)+((this.trcnDesc == null)? 0 :this.trcnDesc.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.aprnCode == null)? 0 :this.aprnCode.hashCode()));
        result = ((result* 31)+((this.orsnDesc == null)? 0 :this.orsnDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gainCode == null)? 0 :this.gainCode.hashCode()));
        result = ((result* 31)+((this.voedCode == null)? 0 :this.voedCode.hashCode()));
        result = ((result* 31)+((this.astdCode == null)? 0 :this.astdCode.hashCode()));
        result = ((result* 31)+((this.emexDesc == null)? 0 :this.emexDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgrstsp) == false) {
            return false;
        }
        Sgrstsp rhs = ((Sgrstsp) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.gainDesc == rhs.gainDesc)||((this.gainDesc!= null)&&this.gainDesc.equals(rhs.gainDesc)))&&((this.astdDesc == rhs.astdDesc)||((this.astdDesc!= null)&&this.astdDesc.equals(rhs.astdDesc))))&&((this.prevCode == rhs.prevCode)||((this.prevCode!= null)&&this.prevCode.equals(rhs.prevCode))))&&((this.egolDesc == rhs.egolDesc)||((this.egolDesc!= null)&&this.egolDesc.equals(rhs.egolDesc))))&&((this.incmCode == rhs.incmCode)||((this.incmCode!= null)&&this.incmCode.equals(rhs.incmCode))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.caplDesc == rhs.caplDesc)||((this.caplDesc!= null)&&this.caplDesc.equals(rhs.caplDesc))))&&((this.stspCode == rhs.stspCode)||((this.stspCode!= null)&&this.stspCode.equals(rhs.stspCode))))&&((this.sessDesc == rhs.sessDesc)||((this.sessDesc!= null)&&this.sessDesc.equals(rhs.sessDesc))))&&((this.resdDesc == rhs.resdDesc)||((this.resdDesc!= null)&&this.resdDesc.equals(rhs.resdDesc))))&&((this.voedDesc == rhs.voedDesc)||((this.voedDesc!= null)&&this.voedDesc.equals(rhs.voedDesc))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.pracCode == rhs.pracCode)||((this.pracCode!= null)&&this.pracCode.equals(rhs.pracCode))))&&((this.incmDesc == rhs.incmDesc)||((this.incmDesc!= null)&&this.incmDesc.equals(rhs.incmDesc))))&&((this.emexCode == rhs.emexCode)||((this.emexCode!= null)&&this.emexCode.equals(rhs.emexCode))))&&((this.trcnCode == rhs.trcnCode)||((this.trcnCode!= null)&&this.trcnCode.equals(rhs.trcnCode))))&&((this.castCode == rhs.castCode)||((this.castCode!= null)&&this.castCode.equals(rhs.castCode))))&&((this.aprnDesc == rhs.aprnDesc)||((this.aprnDesc!= null)&&this.aprnDesc.equals(rhs.aprnDesc))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.orsnCode == rhs.orsnCode)||((this.orsnCode!= null)&&this.orsnCode.equals(rhs.orsnCode))))&&((this.castDesc == rhs.castDesc)||((this.castDesc!= null)&&this.castDesc.equals(rhs.castDesc))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.caplCode == rhs.caplCode)||((this.caplCode!= null)&&this.caplCode.equals(rhs.caplCode))))&&((this.prevDesc == rhs.prevDesc)||((this.prevDesc!= null)&&this.prevDesc.equals(rhs.prevDesc))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.edlvDesc == rhs.edlvDesc)||((this.edlvDesc!= null)&&this.edlvDesc.equals(rhs.edlvDesc))))&&((this.blckDesc == rhs.blckDesc)||((this.blckDesc!= null)&&this.blckDesc.equals(rhs.blckDesc))))&&((this.bsklDesc == rhs.bsklDesc)||((this.bsklDesc!= null)&&this.bsklDesc.equals(rhs.bsklDesc))))&&((this.endStspTerm == rhs.endStspTerm)||((this.endStspTerm!= null)&&this.endStspTerm.equals(rhs.endStspTerm))))&&((this.stspDesc == rhs.stspDesc)||((this.stspDesc!= null)&&this.stspDesc.equals(rhs.stspDesc))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.pracDesc == rhs.pracDesc)||((this.pracDesc!= null)&&this.pracDesc.equals(rhs.pracDesc))))&&((this.bsklCode == rhs.bsklCode)||((this.bsklCode!= null)&&this.bsklCode.equals(rhs.bsklCode))))&&((this.trcnDesc == rhs.trcnDesc)||((this.trcnDesc!= null)&&this.trcnDesc.equals(rhs.trcnDesc))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.aprnCode == rhs.aprnCode)||((this.aprnCode!= null)&&this.aprnCode.equals(rhs.aprnCode))))&&((this.orsnDesc == rhs.orsnDesc)||((this.orsnDesc!= null)&&this.orsnDesc.equals(rhs.orsnDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gainCode == rhs.gainCode)||((this.gainCode!= null)&&this.gainCode.equals(rhs.gainCode))))&&((this.voedCode == rhs.voedCode)||((this.voedCode!= null)&&this.voedCode.equals(rhs.voedCode))))&&((this.astdCode == rhs.astdCode)||((this.astdCode!= null)&&this.astdCode.equals(rhs.astdCode))))&&((this.emexDesc == rhs.emexDesc)||((this.emexDesc!= null)&&this.emexDesc.equals(rhs.emexDesc))));
    }

}
