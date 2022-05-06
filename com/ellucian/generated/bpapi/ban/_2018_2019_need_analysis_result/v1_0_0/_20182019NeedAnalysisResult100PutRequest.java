
package com.ellucian.generated.bpapi.ban._2018_2019_need_analysis_result.v1_0_0;

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
    "cPar1CtrbOfflEst",
    "rorstatPgiLockInd",
    "im1Sc",
    "keyblckInfcCode",
    "rorstatCmPcLockInd",
    "eligibilityMsg",
    "rcrapp4SsRegFlag",
    "rcrapp3SocSec",
    "rcrapp4SsaCitizenInd",
    "rcrapp3MothSsnMatch",
    "rcrapp1Ins",
    "c1AnlyType",
    "keyblckStudentId",
    "cmScLockInd",
    "im1Pc",
    "rcrapp3OfflUnofflInd",
    "c1CtrbOfflEst",
    "rcrapp4SsMatch",
    "rorstatInstScLockInd",
    "rcrapp4SecInsMatchInd",
    "rorstatNsldsOvrdInd",
    "rcrapp4DodParDeathDate",
    "im1AnlyType",
    "pellPgiOfflEst",
    "pellPgi",
    "rcrapp4DodMatchFlag",
    "rcrapp3FathSsnMatch",
    "keyblckSeqNo",
    "c1CtrbForStdt",
    "rcrapp4VaMatchFlag",
    "cPar1CtrbForStdt",
    "im1ParAnlyType",
    "rorstatInstPcLockInd",
    "cPar1AnlyType"
})
@Generated("jsonschema2pojo")
public class _20182019NeedAnalysisResult100PutRequest {

    /**
     * FM PC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("cPar1CtrbOfflEst")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_PAR_1_CTRB_OFFL_EST")
    private String cPar1CtrbOfflEst;
    /**
     * Pell EFC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatPgiLockInd")
    private String rorstatPgiLockInd;
    /**
     * IM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_SC
     * 
     */
    @JsonProperty("im1Sc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_IM_1_SC")
    private Double im1Sc;
    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    @JsonPropertyDescription("Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc")
    private Object keyblckInfcCode;
    /**
     * FM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmPcLockInd")
    private String rorstatCmPcLockInd;
    /**
     * SAR 'C' Flag
     * <p>
     * Lineage reference object : RCRAPP2_ELIGIBILITY_MSG
     * 
     */
    @JsonProperty("eligibilityMsg")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_ELIGIBILITY_MSG")
    private String eligibilityMsg;
    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    private String rcrapp4SsRegFlag;
    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    private String rcrapp3SocSec;
    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    private String rcrapp4SsaCitizenInd;
    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    private String rcrapp3MothSsnMatch;
    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    private String rcrapp1Ins;
    /**
     * FM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_1_ANLY_TYPE
     * 
     */
    @JsonProperty("c1AnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_1_ANLY_TYPE")
    private String c1AnlyType;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object keyblckStudentId;
    /**
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("cmScLockInd")
    private String cmScLockInd;
    /**
     * IM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PC
     * 
     */
    @JsonProperty("im1Pc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_IM_1_PC")
    private Double im1Pc;
    /**
     * Official Source Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3OfflUnofflInd")
    private String rcrapp3OfflUnofflInd;
    /**
     * FM SC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("c1CtrbOfflEst")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_1_CTRB_OFFL_EST")
    private String c1CtrbOfflEst;
    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    private String rcrapp4SsMatch;
    /**
     * IM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstScLockInd")
    private String rorstatInstScLockInd;
    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    private String rcrapp4SecInsMatchInd;
    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    private String rorstatNsldsOvrdInd;
    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    private Date rcrapp4DodParDeathDate;
    /**
     * IM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_ANLY_TYPE
     * 
     */
    @JsonProperty("im1AnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_IM_1_ANLY_TYPE")
    private String im1AnlyType;
    /**
     * Pell EFC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI_OFFL_EST
     * 
     */
    @JsonProperty("pellPgiOfflEst")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_PELL_PGI_OFFL_EST")
    private String pellPgiOfflEst;
    /**
     * Pell EFC Value
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_PELL_PGI")
    private Double pellPgi;
    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    private String rcrapp4DodMatchFlag;
    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    private String rcrapp3FathSsnMatch;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    @JsonPropertyDescription("Lineage reference object : keyblckSeqNo")
    private Object keyblckSeqNo;
    /**
     * FM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("c1CtrbForStdt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT")
    private Double c1CtrbForStdt;
    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    private String rcrapp4VaMatchFlag;
    /**
     * FM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("cPar1CtrbForStdt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_PAR_1_CTRB_FOR_STDT")
    private Double cPar1CtrbForStdt;
    /**
     * IM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE
     * 
     */
    @JsonProperty("im1ParAnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE")
    private String im1ParAnlyType;
    /**
     * IM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstPcLockInd")
    private String rorstatInstPcLockInd;
    /**
     * FM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE
     * 
     */
    @JsonProperty("cPar1AnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE")
    private String cPar1AnlyType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * FM PC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("cPar1CtrbOfflEst")
    public String getcPar1CtrbOfflEst() {
        return cPar1CtrbOfflEst;
    }

    /**
     * FM PC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("cPar1CtrbOfflEst")
    public void setcPar1CtrbOfflEst(String cPar1CtrbOfflEst) {
        this.cPar1CtrbOfflEst = cPar1CtrbOfflEst;
    }

    public _20182019NeedAnalysisResult100PutRequest withcPar1CtrbOfflEst(String cPar1CtrbOfflEst) {
        this.cPar1CtrbOfflEst = cPar1CtrbOfflEst;
        return this;
    }

    /**
     * Pell EFC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatPgiLockInd")
    public String getRorstatPgiLockInd() {
        return rorstatPgiLockInd;
    }

    /**
     * Pell EFC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatPgiLockInd")
    public void setRorstatPgiLockInd(String rorstatPgiLockInd) {
        this.rorstatPgiLockInd = rorstatPgiLockInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRorstatPgiLockInd(String rorstatPgiLockInd) {
        this.rorstatPgiLockInd = rorstatPgiLockInd;
        return this;
    }

    /**
     * IM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_SC
     * 
     */
    @JsonProperty("im1Sc")
    public Double getIm1Sc() {
        return im1Sc;
    }

    /**
     * IM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_SC
     * 
     */
    @JsonProperty("im1Sc")
    public void setIm1Sc(Double im1Sc) {
        this.im1Sc = im1Sc;
    }

    public _20182019NeedAnalysisResult100PutRequest withIm1Sc(Double im1Sc) {
        this.im1Sc = im1Sc;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public Object getKeyblckInfcCode() {
        return keyblckInfcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public void setKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
    }

    public _20182019NeedAnalysisResult100PutRequest withKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
        return this;
    }

    /**
     * FM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmPcLockInd")
    public String getRorstatCmPcLockInd() {
        return rorstatCmPcLockInd;
    }

    /**
     * FM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmPcLockInd")
    public void setRorstatCmPcLockInd(String rorstatCmPcLockInd) {
        this.rorstatCmPcLockInd = rorstatCmPcLockInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRorstatCmPcLockInd(String rorstatCmPcLockInd) {
        this.rorstatCmPcLockInd = rorstatCmPcLockInd;
        return this;
    }

    /**
     * SAR 'C' Flag
     * <p>
     * Lineage reference object : RCRAPP2_ELIGIBILITY_MSG
     * 
     */
    @JsonProperty("eligibilityMsg")
    public String getEligibilityMsg() {
        return eligibilityMsg;
    }

    /**
     * SAR 'C' Flag
     * <p>
     * Lineage reference object : RCRAPP2_ELIGIBILITY_MSG
     * 
     */
    @JsonProperty("eligibilityMsg")
    public void setEligibilityMsg(String eligibilityMsg) {
        this.eligibilityMsg = eligibilityMsg;
    }

    public _20182019NeedAnalysisResult100PutRequest withEligibilityMsg(String eligibilityMsg) {
        this.eligibilityMsg = eligibilityMsg;
        return this;
    }

    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    public String getRcrapp4SsRegFlag() {
        return rcrapp4SsRegFlag;
    }

    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    public void setRcrapp4SsRegFlag(String rcrapp4SsRegFlag) {
        this.rcrapp4SsRegFlag = rcrapp4SsRegFlag;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4SsRegFlag(String rcrapp4SsRegFlag) {
        this.rcrapp4SsRegFlag = rcrapp4SsRegFlag;
        return this;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    public String getRcrapp3SocSec() {
        return rcrapp3SocSec;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    public void setRcrapp3SocSec(String rcrapp3SocSec) {
        this.rcrapp3SocSec = rcrapp3SocSec;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp3SocSec(String rcrapp3SocSec) {
        this.rcrapp3SocSec = rcrapp3SocSec;
        return this;
    }

    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    public String getRcrapp4SsaCitizenInd() {
        return rcrapp4SsaCitizenInd;
    }

    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    public void setRcrapp4SsaCitizenInd(String rcrapp4SsaCitizenInd) {
        this.rcrapp4SsaCitizenInd = rcrapp4SsaCitizenInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4SsaCitizenInd(String rcrapp4SsaCitizenInd) {
        this.rcrapp4SsaCitizenInd = rcrapp4SsaCitizenInd;
        return this;
    }

    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public String getRcrapp3MothSsnMatch() {
        return rcrapp3MothSsnMatch;
    }

    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public void setRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
        return this;
    }

    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    public String getRcrapp1Ins() {
        return rcrapp1Ins;
    }

    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    public void setRcrapp1Ins(String rcrapp1Ins) {
        this.rcrapp1Ins = rcrapp1Ins;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp1Ins(String rcrapp1Ins) {
        this.rcrapp1Ins = rcrapp1Ins;
        return this;
    }

    /**
     * FM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_1_ANLY_TYPE
     * 
     */
    @JsonProperty("c1AnlyType")
    public String getC1AnlyType() {
        return c1AnlyType;
    }

    /**
     * FM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_1_ANLY_TYPE
     * 
     */
    @JsonProperty("c1AnlyType")
    public void setC1AnlyType(String c1AnlyType) {
        this.c1AnlyType = c1AnlyType;
    }

    public _20182019NeedAnalysisResult100PutRequest withC1AnlyType(String c1AnlyType) {
        this.c1AnlyType = c1AnlyType;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public Object getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20182019NeedAnalysisResult100PutRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("cmScLockInd")
    public String getCmScLockInd() {
        return cmScLockInd;
    }

    /**
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("cmScLockInd")
    public void setCmScLockInd(String cmScLockInd) {
        this.cmScLockInd = cmScLockInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withCmScLockInd(String cmScLockInd) {
        this.cmScLockInd = cmScLockInd;
        return this;
    }

    /**
     * IM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PC
     * 
     */
    @JsonProperty("im1Pc")
    public Double getIm1Pc() {
        return im1Pc;
    }

    /**
     * IM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PC
     * 
     */
    @JsonProperty("im1Pc")
    public void setIm1Pc(Double im1Pc) {
        this.im1Pc = im1Pc;
    }

    public _20182019NeedAnalysisResult100PutRequest withIm1Pc(Double im1Pc) {
        this.im1Pc = im1Pc;
        return this;
    }

    /**
     * Official Source Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3OfflUnofflInd")
    public String getRcrapp3OfflUnofflInd() {
        return rcrapp3OfflUnofflInd;
    }

    /**
     * Official Source Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3OfflUnofflInd")
    public void setRcrapp3OfflUnofflInd(String rcrapp3OfflUnofflInd) {
        this.rcrapp3OfflUnofflInd = rcrapp3OfflUnofflInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp3OfflUnofflInd(String rcrapp3OfflUnofflInd) {
        this.rcrapp3OfflUnofflInd = rcrapp3OfflUnofflInd;
        return this;
    }

    /**
     * FM SC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("c1CtrbOfflEst")
    public String getC1CtrbOfflEst() {
        return c1CtrbOfflEst;
    }

    /**
     * FM SC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_OFFL_EST
     * 
     */
    @JsonProperty("c1CtrbOfflEst")
    public void setC1CtrbOfflEst(String c1CtrbOfflEst) {
        this.c1CtrbOfflEst = c1CtrbOfflEst;
    }

    public _20182019NeedAnalysisResult100PutRequest withC1CtrbOfflEst(String c1CtrbOfflEst) {
        this.c1CtrbOfflEst = c1CtrbOfflEst;
        return this;
    }

    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    public String getRcrapp4SsMatch() {
        return rcrapp4SsMatch;
    }

    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    public void setRcrapp4SsMatch(String rcrapp4SsMatch) {
        this.rcrapp4SsMatch = rcrapp4SsMatch;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4SsMatch(String rcrapp4SsMatch) {
        this.rcrapp4SsMatch = rcrapp4SsMatch;
        return this;
    }

    /**
     * IM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstScLockInd")
    public String getRorstatInstScLockInd() {
        return rorstatInstScLockInd;
    }

    /**
     * IM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstScLockInd")
    public void setRorstatInstScLockInd(String rorstatInstScLockInd) {
        this.rorstatInstScLockInd = rorstatInstScLockInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRorstatInstScLockInd(String rorstatInstScLockInd) {
        this.rorstatInstScLockInd = rorstatInstScLockInd;
        return this;
    }

    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    public String getRcrapp4SecInsMatchInd() {
        return rcrapp4SecInsMatchInd;
    }

    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    public void setRcrapp4SecInsMatchInd(String rcrapp4SecInsMatchInd) {
        this.rcrapp4SecInsMatchInd = rcrapp4SecInsMatchInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4SecInsMatchInd(String rcrapp4SecInsMatchInd) {
        this.rcrapp4SecInsMatchInd = rcrapp4SecInsMatchInd;
        return this;
    }

    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    public String getRorstatNsldsOvrdInd() {
        return rorstatNsldsOvrdInd;
    }

    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    public void setRorstatNsldsOvrdInd(String rorstatNsldsOvrdInd) {
        this.rorstatNsldsOvrdInd = rorstatNsldsOvrdInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRorstatNsldsOvrdInd(String rorstatNsldsOvrdInd) {
        this.rorstatNsldsOvrdInd = rorstatNsldsOvrdInd;
        return this;
    }

    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    public Date getRcrapp4DodParDeathDate() {
        return rcrapp4DodParDeathDate;
    }

    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    public void setRcrapp4DodParDeathDate(Date rcrapp4DodParDeathDate) {
        this.rcrapp4DodParDeathDate = rcrapp4DodParDeathDate;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4DodParDeathDate(Date rcrapp4DodParDeathDate) {
        this.rcrapp4DodParDeathDate = rcrapp4DodParDeathDate;
        return this;
    }

    /**
     * IM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_ANLY_TYPE
     * 
     */
    @JsonProperty("im1AnlyType")
    public String getIm1AnlyType() {
        return im1AnlyType;
    }

    /**
     * IM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_ANLY_TYPE
     * 
     */
    @JsonProperty("im1AnlyType")
    public void setIm1AnlyType(String im1AnlyType) {
        this.im1AnlyType = im1AnlyType;
    }

    public _20182019NeedAnalysisResult100PutRequest withIm1AnlyType(String im1AnlyType) {
        this.im1AnlyType = im1AnlyType;
        return this;
    }

    /**
     * Pell EFC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI_OFFL_EST
     * 
     */
    @JsonProperty("pellPgiOfflEst")
    public String getPellPgiOfflEst() {
        return pellPgiOfflEst;
    }

    /**
     * Pell EFC Estimated
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI_OFFL_EST
     * 
     */
    @JsonProperty("pellPgiOfflEst")
    public void setPellPgiOfflEst(String pellPgiOfflEst) {
        this.pellPgiOfflEst = pellPgiOfflEst;
    }

    public _20182019NeedAnalysisResult100PutRequest withPellPgiOfflEst(String pellPgiOfflEst) {
        this.pellPgiOfflEst = pellPgiOfflEst;
        return this;
    }

    /**
     * Pell EFC Value
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    public Double getPellPgi() {
        return pellPgi;
    }

    /**
     * Pell EFC Value
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    public void setPellPgi(Double pellPgi) {
        this.pellPgi = pellPgi;
    }

    public _20182019NeedAnalysisResult100PutRequest withPellPgi(Double pellPgi) {
        this.pellPgi = pellPgi;
        return this;
    }

    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    public String getRcrapp4DodMatchFlag() {
        return rcrapp4DodMatchFlag;
    }

    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    public void setRcrapp4DodMatchFlag(String rcrapp4DodMatchFlag) {
        this.rcrapp4DodMatchFlag = rcrapp4DodMatchFlag;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4DodMatchFlag(String rcrapp4DodMatchFlag) {
        this.rcrapp4DodMatchFlag = rcrapp4DodMatchFlag;
        return this;
    }

    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public String getRcrapp3FathSsnMatch() {
        return rcrapp3FathSsnMatch;
    }

    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public void setRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public Object getKeyblckSeqNo() {
        return keyblckSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public void setKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
    }

    public _20182019NeedAnalysisResult100PutRequest withKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
        return this;
    }

    /**
     * FM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("c1CtrbForStdt")
    public Double getC1CtrbForStdt() {
        return c1CtrbForStdt;
    }

    /**
     * FM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("c1CtrbForStdt")
    public void setC1CtrbForStdt(Double c1CtrbForStdt) {
        this.c1CtrbForStdt = c1CtrbForStdt;
    }

    public _20182019NeedAnalysisResult100PutRequest withC1CtrbForStdt(Double c1CtrbForStdt) {
        this.c1CtrbForStdt = c1CtrbForStdt;
        return this;
    }

    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    public String getRcrapp4VaMatchFlag() {
        return rcrapp4VaMatchFlag;
    }

    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    public void setRcrapp4VaMatchFlag(String rcrapp4VaMatchFlag) {
        this.rcrapp4VaMatchFlag = rcrapp4VaMatchFlag;
    }

    public _20182019NeedAnalysisResult100PutRequest withRcrapp4VaMatchFlag(String rcrapp4VaMatchFlag) {
        this.rcrapp4VaMatchFlag = rcrapp4VaMatchFlag;
        return this;
    }

    /**
     * FM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("cPar1CtrbForStdt")
    public Double getcPar1CtrbForStdt() {
        return cPar1CtrbForStdt;
    }

    /**
     * FM PC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("cPar1CtrbForStdt")
    public void setcPar1CtrbForStdt(Double cPar1CtrbForStdt) {
        this.cPar1CtrbForStdt = cPar1CtrbForStdt;
    }

    public _20182019NeedAnalysisResult100PutRequest withcPar1CtrbForStdt(Double cPar1CtrbForStdt) {
        this.cPar1CtrbForStdt = cPar1CtrbForStdt;
        return this;
    }

    /**
     * IM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE
     * 
     */
    @JsonProperty("im1ParAnlyType")
    public String getIm1ParAnlyType() {
        return im1ParAnlyType;
    }

    /**
     * IM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE
     * 
     */
    @JsonProperty("im1ParAnlyType")
    public void setIm1ParAnlyType(String im1ParAnlyType) {
        this.im1ParAnlyType = im1ParAnlyType;
    }

    public _20182019NeedAnalysisResult100PutRequest withIm1ParAnlyType(String im1ParAnlyType) {
        this.im1ParAnlyType = im1ParAnlyType;
        return this;
    }

    /**
     * IM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstPcLockInd")
    public String getRorstatInstPcLockInd() {
        return rorstatInstPcLockInd;
    }

    /**
     * IM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstPcLockInd")
    public void setRorstatInstPcLockInd(String rorstatInstPcLockInd) {
        this.rorstatInstPcLockInd = rorstatInstPcLockInd;
    }

    public _20182019NeedAnalysisResult100PutRequest withRorstatInstPcLockInd(String rorstatInstPcLockInd) {
        this.rorstatInstPcLockInd = rorstatInstPcLockInd;
        return this;
    }

    /**
     * FM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE
     * 
     */
    @JsonProperty("cPar1AnlyType")
    public String getcPar1AnlyType() {
        return cPar1AnlyType;
    }

    /**
     * FM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE
     * 
     */
    @JsonProperty("cPar1AnlyType")
    public void setcPar1AnlyType(String cPar1AnlyType) {
        this.cPar1AnlyType = cPar1AnlyType;
    }

    public _20182019NeedAnalysisResult100PutRequest withcPar1AnlyType(String cPar1AnlyType) {
        this.cPar1AnlyType = cPar1AnlyType;
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

    public _20182019NeedAnalysisResult100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20182019NeedAnalysisResult100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cPar1CtrbOfflEst");
        sb.append('=');
        sb.append(((this.cPar1CtrbOfflEst == null)?"<null>":this.cPar1CtrbOfflEst));
        sb.append(',');
        sb.append("rorstatPgiLockInd");
        sb.append('=');
        sb.append(((this.rorstatPgiLockInd == null)?"<null>":this.rorstatPgiLockInd));
        sb.append(',');
        sb.append("im1Sc");
        sb.append('=');
        sb.append(((this.im1Sc == null)?"<null>":this.im1Sc));
        sb.append(',');
        sb.append("keyblckInfcCode");
        sb.append('=');
        sb.append(((this.keyblckInfcCode == null)?"<null>":this.keyblckInfcCode));
        sb.append(',');
        sb.append("rorstatCmPcLockInd");
        sb.append('=');
        sb.append(((this.rorstatCmPcLockInd == null)?"<null>":this.rorstatCmPcLockInd));
        sb.append(',');
        sb.append("eligibilityMsg");
        sb.append('=');
        sb.append(((this.eligibilityMsg == null)?"<null>":this.eligibilityMsg));
        sb.append(',');
        sb.append("rcrapp4SsRegFlag");
        sb.append('=');
        sb.append(((this.rcrapp4SsRegFlag == null)?"<null>":this.rcrapp4SsRegFlag));
        sb.append(',');
        sb.append("rcrapp3SocSec");
        sb.append('=');
        sb.append(((this.rcrapp3SocSec == null)?"<null>":this.rcrapp3SocSec));
        sb.append(',');
        sb.append("rcrapp4SsaCitizenInd");
        sb.append('=');
        sb.append(((this.rcrapp4SsaCitizenInd == null)?"<null>":this.rcrapp4SsaCitizenInd));
        sb.append(',');
        sb.append("rcrapp3MothSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3MothSsnMatch == null)?"<null>":this.rcrapp3MothSsnMatch));
        sb.append(',');
        sb.append("rcrapp1Ins");
        sb.append('=');
        sb.append(((this.rcrapp1Ins == null)?"<null>":this.rcrapp1Ins));
        sb.append(',');
        sb.append("c1AnlyType");
        sb.append('=');
        sb.append(((this.c1AnlyType == null)?"<null>":this.c1AnlyType));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("cmScLockInd");
        sb.append('=');
        sb.append(((this.cmScLockInd == null)?"<null>":this.cmScLockInd));
        sb.append(',');
        sb.append("im1Pc");
        sb.append('=');
        sb.append(((this.im1Pc == null)?"<null>":this.im1Pc));
        sb.append(',');
        sb.append("rcrapp3OfflUnofflInd");
        sb.append('=');
        sb.append(((this.rcrapp3OfflUnofflInd == null)?"<null>":this.rcrapp3OfflUnofflInd));
        sb.append(',');
        sb.append("c1CtrbOfflEst");
        sb.append('=');
        sb.append(((this.c1CtrbOfflEst == null)?"<null>":this.c1CtrbOfflEst));
        sb.append(',');
        sb.append("rcrapp4SsMatch");
        sb.append('=');
        sb.append(((this.rcrapp4SsMatch == null)?"<null>":this.rcrapp4SsMatch));
        sb.append(',');
        sb.append("rorstatInstScLockInd");
        sb.append('=');
        sb.append(((this.rorstatInstScLockInd == null)?"<null>":this.rorstatInstScLockInd));
        sb.append(',');
        sb.append("rcrapp4SecInsMatchInd");
        sb.append('=');
        sb.append(((this.rcrapp4SecInsMatchInd == null)?"<null>":this.rcrapp4SecInsMatchInd));
        sb.append(',');
        sb.append("rorstatNsldsOvrdInd");
        sb.append('=');
        sb.append(((this.rorstatNsldsOvrdInd == null)?"<null>":this.rorstatNsldsOvrdInd));
        sb.append(',');
        sb.append("rcrapp4DodParDeathDate");
        sb.append('=');
        sb.append(((this.rcrapp4DodParDeathDate == null)?"<null>":this.rcrapp4DodParDeathDate));
        sb.append(',');
        sb.append("im1AnlyType");
        sb.append('=');
        sb.append(((this.im1AnlyType == null)?"<null>":this.im1AnlyType));
        sb.append(',');
        sb.append("pellPgiOfflEst");
        sb.append('=');
        sb.append(((this.pellPgiOfflEst == null)?"<null>":this.pellPgiOfflEst));
        sb.append(',');
        sb.append("pellPgi");
        sb.append('=');
        sb.append(((this.pellPgi == null)?"<null>":this.pellPgi));
        sb.append(',');
        sb.append("rcrapp4DodMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4DodMatchFlag == null)?"<null>":this.rcrapp4DodMatchFlag));
        sb.append(',');
        sb.append("rcrapp3FathSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3FathSsnMatch == null)?"<null>":this.rcrapp3FathSsnMatch));
        sb.append(',');
        sb.append("keyblckSeqNo");
        sb.append('=');
        sb.append(((this.keyblckSeqNo == null)?"<null>":this.keyblckSeqNo));
        sb.append(',');
        sb.append("c1CtrbForStdt");
        sb.append('=');
        sb.append(((this.c1CtrbForStdt == null)?"<null>":this.c1CtrbForStdt));
        sb.append(',');
        sb.append("rcrapp4VaMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4VaMatchFlag == null)?"<null>":this.rcrapp4VaMatchFlag));
        sb.append(',');
        sb.append("cPar1CtrbForStdt");
        sb.append('=');
        sb.append(((this.cPar1CtrbForStdt == null)?"<null>":this.cPar1CtrbForStdt));
        sb.append(',');
        sb.append("im1ParAnlyType");
        sb.append('=');
        sb.append(((this.im1ParAnlyType == null)?"<null>":this.im1ParAnlyType));
        sb.append(',');
        sb.append("rorstatInstPcLockInd");
        sb.append('=');
        sb.append(((this.rorstatInstPcLockInd == null)?"<null>":this.rorstatInstPcLockInd));
        sb.append(',');
        sb.append("cPar1AnlyType");
        sb.append('=');
        sb.append(((this.cPar1AnlyType == null)?"<null>":this.cPar1AnlyType));
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
        result = ((result* 31)+((this.cPar1CtrbOfflEst == null)? 0 :this.cPar1CtrbOfflEst.hashCode()));
        result = ((result* 31)+((this.rorstatPgiLockInd == null)? 0 :this.rorstatPgiLockInd.hashCode()));
        result = ((result* 31)+((this.im1Sc == null)? 0 :this.im1Sc.hashCode()));
        result = ((result* 31)+((this.keyblckInfcCode == null)? 0 :this.keyblckInfcCode.hashCode()));
        result = ((result* 31)+((this.rorstatCmPcLockInd == null)? 0 :this.rorstatCmPcLockInd.hashCode()));
        result = ((result* 31)+((this.eligibilityMsg == null)? 0 :this.eligibilityMsg.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsRegFlag == null)? 0 :this.rcrapp4SsRegFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3SocSec == null)? 0 :this.rcrapp3SocSec.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsaCitizenInd == null)? 0 :this.rcrapp4SsaCitizenInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3MothSsnMatch == null)? 0 :this.rcrapp3MothSsnMatch.hashCode()));
        result = ((result* 31)+((this.rcrapp1Ins == null)? 0 :this.rcrapp1Ins.hashCode()));
        result = ((result* 31)+((this.c1AnlyType == null)? 0 :this.c1AnlyType.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.cmScLockInd == null)? 0 :this.cmScLockInd.hashCode()));
        result = ((result* 31)+((this.im1Pc == null)? 0 :this.im1Pc.hashCode()));
        result = ((result* 31)+((this.rcrapp3OfflUnofflInd == null)? 0 :this.rcrapp3OfflUnofflInd.hashCode()));
        result = ((result* 31)+((this.c1CtrbOfflEst == null)? 0 :this.c1CtrbOfflEst.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsMatch == null)? 0 :this.rcrapp4SsMatch.hashCode()));
        result = ((result* 31)+((this.rorstatInstScLockInd == null)? 0 :this.rorstatInstScLockInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4SecInsMatchInd == null)? 0 :this.rcrapp4SecInsMatchInd.hashCode()));
        result = ((result* 31)+((this.rorstatNsldsOvrdInd == null)? 0 :this.rorstatNsldsOvrdInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodParDeathDate == null)? 0 :this.rcrapp4DodParDeathDate.hashCode()));
        result = ((result* 31)+((this.im1AnlyType == null)? 0 :this.im1AnlyType.hashCode()));
        result = ((result* 31)+((this.pellPgiOfflEst == null)? 0 :this.pellPgiOfflEst.hashCode()));
        result = ((result* 31)+((this.pellPgi == null)? 0 :this.pellPgi.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodMatchFlag == null)? 0 :this.rcrapp4DodMatchFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3FathSsnMatch == null)? 0 :this.rcrapp3FathSsnMatch.hashCode()));
        result = ((result* 31)+((this.keyblckSeqNo == null)? 0 :this.keyblckSeqNo.hashCode()));
        result = ((result* 31)+((this.c1CtrbForStdt == null)? 0 :this.c1CtrbForStdt.hashCode()));
        result = ((result* 31)+((this.rcrapp4VaMatchFlag == null)? 0 :this.rcrapp4VaMatchFlag.hashCode()));
        result = ((result* 31)+((this.cPar1CtrbForStdt == null)? 0 :this.cPar1CtrbForStdt.hashCode()));
        result = ((result* 31)+((this.im1ParAnlyType == null)? 0 :this.im1ParAnlyType.hashCode()));
        result = ((result* 31)+((this.rorstatInstPcLockInd == null)? 0 :this.rorstatInstPcLockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cPar1AnlyType == null)? 0 :this.cPar1AnlyType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20182019NeedAnalysisResult100PutRequest) == false) {
            return false;
        }
        _20182019NeedAnalysisResult100PutRequest rhs = ((_20182019NeedAnalysisResult100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((this.cPar1CtrbOfflEst == rhs.cPar1CtrbOfflEst)||((this.cPar1CtrbOfflEst!= null)&&this.cPar1CtrbOfflEst.equals(rhs.cPar1CtrbOfflEst)))&&((this.rorstatPgiLockInd == rhs.rorstatPgiLockInd)||((this.rorstatPgiLockInd!= null)&&this.rorstatPgiLockInd.equals(rhs.rorstatPgiLockInd))))&&((this.im1Sc == rhs.im1Sc)||((this.im1Sc!= null)&&this.im1Sc.equals(rhs.im1Sc))))&&((this.keyblckInfcCode == rhs.keyblckInfcCode)||((this.keyblckInfcCode!= null)&&this.keyblckInfcCode.equals(rhs.keyblckInfcCode))))&&((this.rorstatCmPcLockInd == rhs.rorstatCmPcLockInd)||((this.rorstatCmPcLockInd!= null)&&this.rorstatCmPcLockInd.equals(rhs.rorstatCmPcLockInd))))&&((this.eligibilityMsg == rhs.eligibilityMsg)||((this.eligibilityMsg!= null)&&this.eligibilityMsg.equals(rhs.eligibilityMsg))))&&((this.rcrapp4SsRegFlag == rhs.rcrapp4SsRegFlag)||((this.rcrapp4SsRegFlag!= null)&&this.rcrapp4SsRegFlag.equals(rhs.rcrapp4SsRegFlag))))&&((this.rcrapp3SocSec == rhs.rcrapp3SocSec)||((this.rcrapp3SocSec!= null)&&this.rcrapp3SocSec.equals(rhs.rcrapp3SocSec))))&&((this.rcrapp4SsaCitizenInd == rhs.rcrapp4SsaCitizenInd)||((this.rcrapp4SsaCitizenInd!= null)&&this.rcrapp4SsaCitizenInd.equals(rhs.rcrapp4SsaCitizenInd))))&&((this.rcrapp3MothSsnMatch == rhs.rcrapp3MothSsnMatch)||((this.rcrapp3MothSsnMatch!= null)&&this.rcrapp3MothSsnMatch.equals(rhs.rcrapp3MothSsnMatch))))&&((this.rcrapp1Ins == rhs.rcrapp1Ins)||((this.rcrapp1Ins!= null)&&this.rcrapp1Ins.equals(rhs.rcrapp1Ins))))&&((this.c1AnlyType == rhs.c1AnlyType)||((this.c1AnlyType!= null)&&this.c1AnlyType.equals(rhs.c1AnlyType))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.cmScLockInd == rhs.cmScLockInd)||((this.cmScLockInd!= null)&&this.cmScLockInd.equals(rhs.cmScLockInd))))&&((this.im1Pc == rhs.im1Pc)||((this.im1Pc!= null)&&this.im1Pc.equals(rhs.im1Pc))))&&((this.rcrapp3OfflUnofflInd == rhs.rcrapp3OfflUnofflInd)||((this.rcrapp3OfflUnofflInd!= null)&&this.rcrapp3OfflUnofflInd.equals(rhs.rcrapp3OfflUnofflInd))))&&((this.c1CtrbOfflEst == rhs.c1CtrbOfflEst)||((this.c1CtrbOfflEst!= null)&&this.c1CtrbOfflEst.equals(rhs.c1CtrbOfflEst))))&&((this.rcrapp4SsMatch == rhs.rcrapp4SsMatch)||((this.rcrapp4SsMatch!= null)&&this.rcrapp4SsMatch.equals(rhs.rcrapp4SsMatch))))&&((this.rorstatInstScLockInd == rhs.rorstatInstScLockInd)||((this.rorstatInstScLockInd!= null)&&this.rorstatInstScLockInd.equals(rhs.rorstatInstScLockInd))))&&((this.rcrapp4SecInsMatchInd == rhs.rcrapp4SecInsMatchInd)||((this.rcrapp4SecInsMatchInd!= null)&&this.rcrapp4SecInsMatchInd.equals(rhs.rcrapp4SecInsMatchInd))))&&((this.rorstatNsldsOvrdInd == rhs.rorstatNsldsOvrdInd)||((this.rorstatNsldsOvrdInd!= null)&&this.rorstatNsldsOvrdInd.equals(rhs.rorstatNsldsOvrdInd))))&&((this.rcrapp4DodParDeathDate == rhs.rcrapp4DodParDeathDate)||((this.rcrapp4DodParDeathDate!= null)&&this.rcrapp4DodParDeathDate.equals(rhs.rcrapp4DodParDeathDate))))&&((this.im1AnlyType == rhs.im1AnlyType)||((this.im1AnlyType!= null)&&this.im1AnlyType.equals(rhs.im1AnlyType))))&&((this.pellPgiOfflEst == rhs.pellPgiOfflEst)||((this.pellPgiOfflEst!= null)&&this.pellPgiOfflEst.equals(rhs.pellPgiOfflEst))))&&((this.pellPgi == rhs.pellPgi)||((this.pellPgi!= null)&&this.pellPgi.equals(rhs.pellPgi))))&&((this.rcrapp4DodMatchFlag == rhs.rcrapp4DodMatchFlag)||((this.rcrapp4DodMatchFlag!= null)&&this.rcrapp4DodMatchFlag.equals(rhs.rcrapp4DodMatchFlag))))&&((this.rcrapp3FathSsnMatch == rhs.rcrapp3FathSsnMatch)||((this.rcrapp3FathSsnMatch!= null)&&this.rcrapp3FathSsnMatch.equals(rhs.rcrapp3FathSsnMatch))))&&((this.keyblckSeqNo == rhs.keyblckSeqNo)||((this.keyblckSeqNo!= null)&&this.keyblckSeqNo.equals(rhs.keyblckSeqNo))))&&((this.c1CtrbForStdt == rhs.c1CtrbForStdt)||((this.c1CtrbForStdt!= null)&&this.c1CtrbForStdt.equals(rhs.c1CtrbForStdt))))&&((this.rcrapp4VaMatchFlag == rhs.rcrapp4VaMatchFlag)||((this.rcrapp4VaMatchFlag!= null)&&this.rcrapp4VaMatchFlag.equals(rhs.rcrapp4VaMatchFlag))))&&((this.cPar1CtrbForStdt == rhs.cPar1CtrbForStdt)||((this.cPar1CtrbForStdt!= null)&&this.cPar1CtrbForStdt.equals(rhs.cPar1CtrbForStdt))))&&((this.im1ParAnlyType == rhs.im1ParAnlyType)||((this.im1ParAnlyType!= null)&&this.im1ParAnlyType.equals(rhs.im1ParAnlyType))))&&((this.rorstatInstPcLockInd == rhs.rorstatInstPcLockInd)||((this.rorstatInstPcLockInd!= null)&&this.rorstatInstPcLockInd.equals(rhs.rorstatInstPcLockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cPar1AnlyType == rhs.cPar1AnlyType)||((this.cPar1AnlyType!= null)&&this.cPar1AnlyType.equals(rhs.cPar1AnlyType))));
    }

}
