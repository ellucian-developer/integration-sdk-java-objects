
package com.ellucian.generated.bpapi.ban._2021_2022_need_analysis_result_primary_calculations.v1_0_0;

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
    "rorstatCmScLockInd",
    "eligibilityMsg",
    "displayRejReasonPrty2",
    "displayRejReasonPrty3",
    "displayC1TotCtrb",
    "displayRejReasonPrty1",
    "rcrapp1Ins",
    "displayRejReasonPrty6",
    "c1AnlyType",
    "displayRejReasonPrty7",
    "displayRejReasonPrty4",
    "displayRejReasonPrty5",
    "im1Pc",
    "cDependStatus",
    "rcrapp3OfflUnofflInd",
    "rorstatInstScLockInd",
    "rorstatNsldsOvrdInd",
    "pellPgiOfflEst",
    "rcrapp4DodMatchFlag",
    "rcrapp3FathSsnMatch",
    "c1CtrbForStdt",
    "cPar1CtrbForStdt",
    "rcrapp1VerificationMsg",
    "rcresarVerifChangeInd",
    "rorstatVerComplete",
    "rorstatPgiLockInd",
    "im1Sc",
    "rcrapp4SubVerifSelected",
    "rorstatCmPcLockInd",
    "rcrapp4SsRegFlag",
    "rcrapp3SocSec",
    "rcrapp4SsaCitizenInd",
    "rcrapp3MothSsnMatch",
    "displayIm1Tfc",
    "c1CtrbOfflEst",
    "rcrapp4SsMatch",
    "rcrapp4DodParDeathDate",
    "rcrapp4SecInsMatchInd",
    "im1AnlyType",
    "pellPgi",
    "rcrapp4VaMatchFlag",
    "rcrapp3RejReasonPrty1",
    "rcrapp3RejReasonPrty2",
    "rcrapp3RejReasonPrty5",
    "im1ParAnlyType",
    "rcrapp3RejReasonPrty6",
    "rorstatInstPcLockInd",
    "rcrapp3RejReasonPrty3",
    "rcrapp3RejReasonPrty4",
    "rcrapp4CInst1TfcOfflEst",
    "rcrapp3RejReasonPrty7",
    "rcrimp1PcNonCustPar",
    "cPar1AnlyType",
    "rnrovrdPcNonCustPar",
    "rcrlds4MatchInd"
})
@Generated("jsonschema2pojo")
public class _20212022NeedAnalysisResultPrimaryCalculations100PutResponse {

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
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmScLockInd")
    private String rorstatCmScLockInd;
    /**
     * SAR 'C' Flag
     * <p>
     * Lineage reference object : RCRAPP2_ELIGIBILITY_MSG
     * 
     */
    @JsonProperty("eligibilityMsg")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_ELIGIBILITY_MSG")
    private String eligibilityMsg;
    @JsonProperty("displayRejReasonPrty2")
    private String displayRejReasonPrty2;
    @JsonProperty("displayRejReasonPrty3")
    private String displayRejReasonPrty3;
    /**
     * Total Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayC1TotCtrb")
    private Double displayC1TotCtrb;
    /**
     * Rejection Reasons
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRejReasonPrty1")
    private String displayRejReasonPrty1;
    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    private String rcrapp1Ins;
    @JsonProperty("displayRejReasonPrty6")
    private String displayRejReasonPrty6;
    /**
     * FM SC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_1_ANLY_TYPE
     * 
     */
    @JsonProperty("c1AnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_1_ANLY_TYPE")
    private String c1AnlyType;
    @JsonProperty("displayRejReasonPrty7")
    private String displayRejReasonPrty7;
    @JsonProperty("displayRejReasonPrty4")
    private String displayRejReasonPrty4;
    @JsonProperty("displayRejReasonPrty5")
    private String displayRejReasonPrty5;
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
     * Dependency Status
     * <p>
     * Lineage reference object : RCRAPP2_C_DEPEND_STATUS
     * 
     */
    @JsonProperty("cDependStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_DEPEND_STATUS")
    private String cDependStatus;
    /**
     * Official Source Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3OfflUnofflInd")
    private String rcrapp3OfflUnofflInd;
    /**
     * IM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstScLockInd")
    private String rorstatInstScLockInd;
    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    private String rorstatNsldsOvrdInd;
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
     * FM SC Value
     * <p>
     * Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT
     * 
     */
    @JsonProperty("c1CtrbForStdt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_1_CTRB_FOR_STDT")
    private Double c1CtrbForStdt;
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
     * Verification
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    private String rcrapp1VerificationMsg;
    /**
     * Verification Selection Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcresarVerifChangeInd")
    private String rcresarVerifChangeInd;
    /**
     * Verification Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatVerComplete")
    private String rorstatVerComplete;
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
     * Subsequent Record Selected
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SubVerifSelected")
    private String rcrapp4SubVerifSelected;
    /**
     * FM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmPcLockInd")
    private String rorstatCmPcLockInd;
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
     * IM EFC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIm1Tfc")
    private Double displayIm1Tfc;
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
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    private Date rcrapp4DodParDeathDate;
    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    private String rcrapp4SecInsMatchInd;
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
     * Pell EFC Value
     * <p>
     * Lineage reference object : RCRAPP2_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_PELL_PGI")
    private Double pellPgi;
    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    private String rcrapp4VaMatchFlag;
    /**
     * Reject Reason Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejReasonPrty1")
    private String rcrapp3RejReasonPrty1;
    @JsonProperty("rcrapp3RejReasonPrty2")
    private String rcrapp3RejReasonPrty2;
    @JsonProperty("rcrapp3RejReasonPrty5")
    private String rcrapp3RejReasonPrty5;
    /**
     * IM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE
     * 
     */
    @JsonProperty("im1ParAnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_IM_1_PAR_ANLY_TYPE")
    private String im1ParAnlyType;
    @JsonProperty("rcrapp3RejReasonPrty6")
    private String rcrapp3RejReasonPrty6;
    /**
     * IM PC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatInstPcLockInd")
    private String rorstatInstPcLockInd;
    @JsonProperty("rcrapp3RejReasonPrty3")
    private String rcrapp3RejReasonPrty3;
    @JsonProperty("rcrapp3RejReasonPrty4")
    private String rcrapp3RejReasonPrty4;
    /**
     * Total Estimated
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4CInst1TfcOfflEst")
    private String rcrapp4CInst1TfcOfflEst;
    @JsonProperty("rcrapp3RejReasonPrty7")
    private String rcrapp3RejReasonPrty7;
    /**
     * Reported Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrimp1PcNonCustPar")
    private Double rcrimp1PcNonCustPar;
    /**
     * FM PC Methodology Type
     * <p>
     * Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE
     * 
     */
    @JsonProperty("cPar1AnlyType")
    @JsonPropertyDescription("Lineage reference object : RCRAPP2_C_PAR_1_ANLY_TYPE")
    private String cPar1AnlyType;
    /**
     * Calculated Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdPcNonCustPar")
    private Double rnrovrdPcNonCustPar;
    /**
     * NSLDS
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrlds4MatchInd")
    private String rcrlds4MatchInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withcPar1CtrbOfflEst(String cPar1CtrbOfflEst) {
        this.cPar1CtrbOfflEst = cPar1CtrbOfflEst;
        return this;
    }

    /**
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmScLockInd")
    public String getRorstatCmScLockInd() {
        return rorstatCmScLockInd;
    }

    /**
     * FM SC Locks
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatCmScLockInd")
    public void setRorstatCmScLockInd(String rorstatCmScLockInd) {
        this.rorstatCmScLockInd = rorstatCmScLockInd;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatCmScLockInd(String rorstatCmScLockInd) {
        this.rorstatCmScLockInd = rorstatCmScLockInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withEligibilityMsg(String eligibilityMsg) {
        this.eligibilityMsg = eligibilityMsg;
        return this;
    }

    @JsonProperty("displayRejReasonPrty2")
    public String getDisplayRejReasonPrty2() {
        return displayRejReasonPrty2;
    }

    @JsonProperty("displayRejReasonPrty2")
    public void setDisplayRejReasonPrty2(String displayRejReasonPrty2) {
        this.displayRejReasonPrty2 = displayRejReasonPrty2;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty2(String displayRejReasonPrty2) {
        this.displayRejReasonPrty2 = displayRejReasonPrty2;
        return this;
    }

    @JsonProperty("displayRejReasonPrty3")
    public String getDisplayRejReasonPrty3() {
        return displayRejReasonPrty3;
    }

    @JsonProperty("displayRejReasonPrty3")
    public void setDisplayRejReasonPrty3(String displayRejReasonPrty3) {
        this.displayRejReasonPrty3 = displayRejReasonPrty3;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty3(String displayRejReasonPrty3) {
        this.displayRejReasonPrty3 = displayRejReasonPrty3;
        return this;
    }

    /**
     * Total Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayC1TotCtrb")
    public Double getDisplayC1TotCtrb() {
        return displayC1TotCtrb;
    }

    /**
     * Total Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayC1TotCtrb")
    public void setDisplayC1TotCtrb(Double displayC1TotCtrb) {
        this.displayC1TotCtrb = displayC1TotCtrb;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayC1TotCtrb(Double displayC1TotCtrb) {
        this.displayC1TotCtrb = displayC1TotCtrb;
        return this;
    }

    /**
     * Rejection Reasons
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRejReasonPrty1")
    public String getDisplayRejReasonPrty1() {
        return displayRejReasonPrty1;
    }

    /**
     * Rejection Reasons
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRejReasonPrty1")
    public void setDisplayRejReasonPrty1(String displayRejReasonPrty1) {
        this.displayRejReasonPrty1 = displayRejReasonPrty1;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty1(String displayRejReasonPrty1) {
        this.displayRejReasonPrty1 = displayRejReasonPrty1;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp1Ins(String rcrapp1Ins) {
        this.rcrapp1Ins = rcrapp1Ins;
        return this;
    }

    @JsonProperty("displayRejReasonPrty6")
    public String getDisplayRejReasonPrty6() {
        return displayRejReasonPrty6;
    }

    @JsonProperty("displayRejReasonPrty6")
    public void setDisplayRejReasonPrty6(String displayRejReasonPrty6) {
        this.displayRejReasonPrty6 = displayRejReasonPrty6;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty6(String displayRejReasonPrty6) {
        this.displayRejReasonPrty6 = displayRejReasonPrty6;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withC1AnlyType(String c1AnlyType) {
        this.c1AnlyType = c1AnlyType;
        return this;
    }

    @JsonProperty("displayRejReasonPrty7")
    public String getDisplayRejReasonPrty7() {
        return displayRejReasonPrty7;
    }

    @JsonProperty("displayRejReasonPrty7")
    public void setDisplayRejReasonPrty7(String displayRejReasonPrty7) {
        this.displayRejReasonPrty7 = displayRejReasonPrty7;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty7(String displayRejReasonPrty7) {
        this.displayRejReasonPrty7 = displayRejReasonPrty7;
        return this;
    }

    @JsonProperty("displayRejReasonPrty4")
    public String getDisplayRejReasonPrty4() {
        return displayRejReasonPrty4;
    }

    @JsonProperty("displayRejReasonPrty4")
    public void setDisplayRejReasonPrty4(String displayRejReasonPrty4) {
        this.displayRejReasonPrty4 = displayRejReasonPrty4;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty4(String displayRejReasonPrty4) {
        this.displayRejReasonPrty4 = displayRejReasonPrty4;
        return this;
    }

    @JsonProperty("displayRejReasonPrty5")
    public String getDisplayRejReasonPrty5() {
        return displayRejReasonPrty5;
    }

    @JsonProperty("displayRejReasonPrty5")
    public void setDisplayRejReasonPrty5(String displayRejReasonPrty5) {
        this.displayRejReasonPrty5 = displayRejReasonPrty5;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayRejReasonPrty5(String displayRejReasonPrty5) {
        this.displayRejReasonPrty5 = displayRejReasonPrty5;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withIm1Pc(Double im1Pc) {
        this.im1Pc = im1Pc;
        return this;
    }

    /**
     * Dependency Status
     * <p>
     * Lineage reference object : RCRAPP2_C_DEPEND_STATUS
     * 
     */
    @JsonProperty("cDependStatus")
    public String getcDependStatus() {
        return cDependStatus;
    }

    /**
     * Dependency Status
     * <p>
     * Lineage reference object : RCRAPP2_C_DEPEND_STATUS
     * 
     */
    @JsonProperty("cDependStatus")
    public void setcDependStatus(String cDependStatus) {
        this.cDependStatus = cDependStatus;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withcDependStatus(String cDependStatus) {
        this.cDependStatus = cDependStatus;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3OfflUnofflInd(String rcrapp3OfflUnofflInd) {
        this.rcrapp3OfflUnofflInd = rcrapp3OfflUnofflInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatInstScLockInd(String rorstatInstScLockInd) {
        this.rorstatInstScLockInd = rorstatInstScLockInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatNsldsOvrdInd(String rorstatNsldsOvrdInd) {
        this.rorstatNsldsOvrdInd = rorstatNsldsOvrdInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withPellPgiOfflEst(String pellPgiOfflEst) {
        this.pellPgiOfflEst = pellPgiOfflEst;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4DodMatchFlag(String rcrapp4DodMatchFlag) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withC1CtrbForStdt(Double c1CtrbForStdt) {
        this.c1CtrbForStdt = c1CtrbForStdt;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withcPar1CtrbForStdt(Double cPar1CtrbForStdt) {
        this.cPar1CtrbForStdt = cPar1CtrbForStdt;
        return this;
    }

    /**
     * Verification
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public String getRcrapp1VerificationMsg() {
        return rcrapp1VerificationMsg;
    }

    /**
     * Verification
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public void setRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
        return this;
    }

    /**
     * Verification Selection Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcresarVerifChangeInd")
    public String getRcresarVerifChangeInd() {
        return rcresarVerifChangeInd;
    }

    /**
     * Verification Selection Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcresarVerifChangeInd")
    public void setRcresarVerifChangeInd(String rcresarVerifChangeInd) {
        this.rcresarVerifChangeInd = rcresarVerifChangeInd;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcresarVerifChangeInd(String rcresarVerifChangeInd) {
        this.rcresarVerifChangeInd = rcresarVerifChangeInd;
        return this;
    }

    /**
     * Verification Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatVerComplete")
    public String getRorstatVerComplete() {
        return rorstatVerComplete;
    }

    /**
     * Verification Complete
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatVerComplete")
    public void setRorstatVerComplete(String rorstatVerComplete) {
        this.rorstatVerComplete = rorstatVerComplete;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatVerComplete(String rorstatVerComplete) {
        this.rorstatVerComplete = rorstatVerComplete;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatPgiLockInd(String rorstatPgiLockInd) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withIm1Sc(Double im1Sc) {
        this.im1Sc = im1Sc;
        return this;
    }

    /**
     * Subsequent Record Selected
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SubVerifSelected")
    public String getRcrapp4SubVerifSelected() {
        return rcrapp4SubVerifSelected;
    }

    /**
     * Subsequent Record Selected
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SubVerifSelected")
    public void setRcrapp4SubVerifSelected(String rcrapp4SubVerifSelected) {
        this.rcrapp4SubVerifSelected = rcrapp4SubVerifSelected;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4SubVerifSelected(String rcrapp4SubVerifSelected) {
        this.rcrapp4SubVerifSelected = rcrapp4SubVerifSelected;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatCmPcLockInd(String rorstatCmPcLockInd) {
        this.rorstatCmPcLockInd = rorstatCmPcLockInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4SsRegFlag(String rcrapp4SsRegFlag) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3SocSec(String rcrapp3SocSec) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4SsaCitizenInd(String rcrapp4SsaCitizenInd) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
        return this;
    }

    /**
     * IM EFC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIm1Tfc")
    public Double getDisplayIm1Tfc() {
        return displayIm1Tfc;
    }

    /**
     * IM EFC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIm1Tfc")
    public void setDisplayIm1Tfc(Double displayIm1Tfc) {
        this.displayIm1Tfc = displayIm1Tfc;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withDisplayIm1Tfc(Double displayIm1Tfc) {
        this.displayIm1Tfc = displayIm1Tfc;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withC1CtrbOfflEst(String c1CtrbOfflEst) {
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4SsMatch(String rcrapp4SsMatch) {
        this.rcrapp4SsMatch = rcrapp4SsMatch;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4DodParDeathDate(Date rcrapp4DodParDeathDate) {
        this.rcrapp4DodParDeathDate = rcrapp4DodParDeathDate;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4SecInsMatchInd(String rcrapp4SecInsMatchInd) {
        this.rcrapp4SecInsMatchInd = rcrapp4SecInsMatchInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withIm1AnlyType(String im1AnlyType) {
        this.im1AnlyType = im1AnlyType;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withPellPgi(Double pellPgi) {
        this.pellPgi = pellPgi;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4VaMatchFlag(String rcrapp4VaMatchFlag) {
        this.rcrapp4VaMatchFlag = rcrapp4VaMatchFlag;
        return this;
    }

    /**
     * Reject Reason Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejReasonPrty1")
    public String getRcrapp3RejReasonPrty1() {
        return rcrapp3RejReasonPrty1;
    }

    /**
     * Reject Reason Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejReasonPrty1")
    public void setRcrapp3RejReasonPrty1(String rcrapp3RejReasonPrty1) {
        this.rcrapp3RejReasonPrty1 = rcrapp3RejReasonPrty1;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty1(String rcrapp3RejReasonPrty1) {
        this.rcrapp3RejReasonPrty1 = rcrapp3RejReasonPrty1;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty2")
    public String getRcrapp3RejReasonPrty2() {
        return rcrapp3RejReasonPrty2;
    }

    @JsonProperty("rcrapp3RejReasonPrty2")
    public void setRcrapp3RejReasonPrty2(String rcrapp3RejReasonPrty2) {
        this.rcrapp3RejReasonPrty2 = rcrapp3RejReasonPrty2;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty2(String rcrapp3RejReasonPrty2) {
        this.rcrapp3RejReasonPrty2 = rcrapp3RejReasonPrty2;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty5")
    public String getRcrapp3RejReasonPrty5() {
        return rcrapp3RejReasonPrty5;
    }

    @JsonProperty("rcrapp3RejReasonPrty5")
    public void setRcrapp3RejReasonPrty5(String rcrapp3RejReasonPrty5) {
        this.rcrapp3RejReasonPrty5 = rcrapp3RejReasonPrty5;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty5(String rcrapp3RejReasonPrty5) {
        this.rcrapp3RejReasonPrty5 = rcrapp3RejReasonPrty5;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withIm1ParAnlyType(String im1ParAnlyType) {
        this.im1ParAnlyType = im1ParAnlyType;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty6")
    public String getRcrapp3RejReasonPrty6() {
        return rcrapp3RejReasonPrty6;
    }

    @JsonProperty("rcrapp3RejReasonPrty6")
    public void setRcrapp3RejReasonPrty6(String rcrapp3RejReasonPrty6) {
        this.rcrapp3RejReasonPrty6 = rcrapp3RejReasonPrty6;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty6(String rcrapp3RejReasonPrty6) {
        this.rcrapp3RejReasonPrty6 = rcrapp3RejReasonPrty6;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRorstatInstPcLockInd(String rorstatInstPcLockInd) {
        this.rorstatInstPcLockInd = rorstatInstPcLockInd;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty3")
    public String getRcrapp3RejReasonPrty3() {
        return rcrapp3RejReasonPrty3;
    }

    @JsonProperty("rcrapp3RejReasonPrty3")
    public void setRcrapp3RejReasonPrty3(String rcrapp3RejReasonPrty3) {
        this.rcrapp3RejReasonPrty3 = rcrapp3RejReasonPrty3;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty3(String rcrapp3RejReasonPrty3) {
        this.rcrapp3RejReasonPrty3 = rcrapp3RejReasonPrty3;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty4")
    public String getRcrapp3RejReasonPrty4() {
        return rcrapp3RejReasonPrty4;
    }

    @JsonProperty("rcrapp3RejReasonPrty4")
    public void setRcrapp3RejReasonPrty4(String rcrapp3RejReasonPrty4) {
        this.rcrapp3RejReasonPrty4 = rcrapp3RejReasonPrty4;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty4(String rcrapp3RejReasonPrty4) {
        this.rcrapp3RejReasonPrty4 = rcrapp3RejReasonPrty4;
        return this;
    }

    /**
     * Total Estimated
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4CInst1TfcOfflEst")
    public String getRcrapp4CInst1TfcOfflEst() {
        return rcrapp4CInst1TfcOfflEst;
    }

    /**
     * Total Estimated
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4CInst1TfcOfflEst")
    public void setRcrapp4CInst1TfcOfflEst(String rcrapp4CInst1TfcOfflEst) {
        this.rcrapp4CInst1TfcOfflEst = rcrapp4CInst1TfcOfflEst;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp4CInst1TfcOfflEst(String rcrapp4CInst1TfcOfflEst) {
        this.rcrapp4CInst1TfcOfflEst = rcrapp4CInst1TfcOfflEst;
        return this;
    }

    @JsonProperty("rcrapp3RejReasonPrty7")
    public String getRcrapp3RejReasonPrty7() {
        return rcrapp3RejReasonPrty7;
    }

    @JsonProperty("rcrapp3RejReasonPrty7")
    public void setRcrapp3RejReasonPrty7(String rcrapp3RejReasonPrty7) {
        this.rcrapp3RejReasonPrty7 = rcrapp3RejReasonPrty7;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrapp3RejReasonPrty7(String rcrapp3RejReasonPrty7) {
        this.rcrapp3RejReasonPrty7 = rcrapp3RejReasonPrty7;
        return this;
    }

    /**
     * Reported Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrimp1PcNonCustPar")
    public Double getRcrimp1PcNonCustPar() {
        return rcrimp1PcNonCustPar;
    }

    /**
     * Reported Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrimp1PcNonCustPar")
    public void setRcrimp1PcNonCustPar(Double rcrimp1PcNonCustPar) {
        this.rcrimp1PcNonCustPar = rcrimp1PcNonCustPar;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrimp1PcNonCustPar(Double rcrimp1PcNonCustPar) {
        this.rcrimp1PcNonCustPar = rcrimp1PcNonCustPar;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withcPar1AnlyType(String cPar1AnlyType) {
        this.cPar1AnlyType = cPar1AnlyType;
        return this;
    }

    /**
     * Calculated Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdPcNonCustPar")
    public Double getRnrovrdPcNonCustPar() {
        return rnrovrdPcNonCustPar;
    }

    /**
     * Calculated Non-Custodial PC Value
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdPcNonCustPar")
    public void setRnrovrdPcNonCustPar(Double rnrovrdPcNonCustPar) {
        this.rnrovrdPcNonCustPar = rnrovrdPcNonCustPar;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRnrovrdPcNonCustPar(Double rnrovrdPcNonCustPar) {
        this.rnrovrdPcNonCustPar = rnrovrdPcNonCustPar;
        return this;
    }

    /**
     * NSLDS
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrlds4MatchInd")
    public String getRcrlds4MatchInd() {
        return rcrlds4MatchInd;
    }

    /**
     * NSLDS
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrlds4MatchInd")
    public void setRcrlds4MatchInd(String rcrlds4MatchInd) {
        this.rcrlds4MatchInd = rcrlds4MatchInd;
    }

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withRcrlds4MatchInd(String rcrlds4MatchInd) {
        this.rcrlds4MatchInd = rcrlds4MatchInd;
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

    public _20212022NeedAnalysisResultPrimaryCalculations100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20212022NeedAnalysisResultPrimaryCalculations100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cPar1CtrbOfflEst");
        sb.append('=');
        sb.append(((this.cPar1CtrbOfflEst == null)?"<null>":this.cPar1CtrbOfflEst));
        sb.append(',');
        sb.append("rorstatCmScLockInd");
        sb.append('=');
        sb.append(((this.rorstatCmScLockInd == null)?"<null>":this.rorstatCmScLockInd));
        sb.append(',');
        sb.append("eligibilityMsg");
        sb.append('=');
        sb.append(((this.eligibilityMsg == null)?"<null>":this.eligibilityMsg));
        sb.append(',');
        sb.append("displayRejReasonPrty2");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty2 == null)?"<null>":this.displayRejReasonPrty2));
        sb.append(',');
        sb.append("displayRejReasonPrty3");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty3 == null)?"<null>":this.displayRejReasonPrty3));
        sb.append(',');
        sb.append("displayC1TotCtrb");
        sb.append('=');
        sb.append(((this.displayC1TotCtrb == null)?"<null>":this.displayC1TotCtrb));
        sb.append(',');
        sb.append("displayRejReasonPrty1");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty1 == null)?"<null>":this.displayRejReasonPrty1));
        sb.append(',');
        sb.append("rcrapp1Ins");
        sb.append('=');
        sb.append(((this.rcrapp1Ins == null)?"<null>":this.rcrapp1Ins));
        sb.append(',');
        sb.append("displayRejReasonPrty6");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty6 == null)?"<null>":this.displayRejReasonPrty6));
        sb.append(',');
        sb.append("c1AnlyType");
        sb.append('=');
        sb.append(((this.c1AnlyType == null)?"<null>":this.c1AnlyType));
        sb.append(',');
        sb.append("displayRejReasonPrty7");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty7 == null)?"<null>":this.displayRejReasonPrty7));
        sb.append(',');
        sb.append("displayRejReasonPrty4");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty4 == null)?"<null>":this.displayRejReasonPrty4));
        sb.append(',');
        sb.append("displayRejReasonPrty5");
        sb.append('=');
        sb.append(((this.displayRejReasonPrty5 == null)?"<null>":this.displayRejReasonPrty5));
        sb.append(',');
        sb.append("im1Pc");
        sb.append('=');
        sb.append(((this.im1Pc == null)?"<null>":this.im1Pc));
        sb.append(',');
        sb.append("cDependStatus");
        sb.append('=');
        sb.append(((this.cDependStatus == null)?"<null>":this.cDependStatus));
        sb.append(',');
        sb.append("rcrapp3OfflUnofflInd");
        sb.append('=');
        sb.append(((this.rcrapp3OfflUnofflInd == null)?"<null>":this.rcrapp3OfflUnofflInd));
        sb.append(',');
        sb.append("rorstatInstScLockInd");
        sb.append('=');
        sb.append(((this.rorstatInstScLockInd == null)?"<null>":this.rorstatInstScLockInd));
        sb.append(',');
        sb.append("rorstatNsldsOvrdInd");
        sb.append('=');
        sb.append(((this.rorstatNsldsOvrdInd == null)?"<null>":this.rorstatNsldsOvrdInd));
        sb.append(',');
        sb.append("pellPgiOfflEst");
        sb.append('=');
        sb.append(((this.pellPgiOfflEst == null)?"<null>":this.pellPgiOfflEst));
        sb.append(',');
        sb.append("rcrapp4DodMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4DodMatchFlag == null)?"<null>":this.rcrapp4DodMatchFlag));
        sb.append(',');
        sb.append("rcrapp3FathSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3FathSsnMatch == null)?"<null>":this.rcrapp3FathSsnMatch));
        sb.append(',');
        sb.append("c1CtrbForStdt");
        sb.append('=');
        sb.append(((this.c1CtrbForStdt == null)?"<null>":this.c1CtrbForStdt));
        sb.append(',');
        sb.append("cPar1CtrbForStdt");
        sb.append('=');
        sb.append(((this.cPar1CtrbForStdt == null)?"<null>":this.cPar1CtrbForStdt));
        sb.append(',');
        sb.append("rcrapp1VerificationMsg");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationMsg == null)?"<null>":this.rcrapp1VerificationMsg));
        sb.append(',');
        sb.append("rcresarVerifChangeInd");
        sb.append('=');
        sb.append(((this.rcresarVerifChangeInd == null)?"<null>":this.rcresarVerifChangeInd));
        sb.append(',');
        sb.append("rorstatVerComplete");
        sb.append('=');
        sb.append(((this.rorstatVerComplete == null)?"<null>":this.rorstatVerComplete));
        sb.append(',');
        sb.append("rorstatPgiLockInd");
        sb.append('=');
        sb.append(((this.rorstatPgiLockInd == null)?"<null>":this.rorstatPgiLockInd));
        sb.append(',');
        sb.append("im1Sc");
        sb.append('=');
        sb.append(((this.im1Sc == null)?"<null>":this.im1Sc));
        sb.append(',');
        sb.append("rcrapp4SubVerifSelected");
        sb.append('=');
        sb.append(((this.rcrapp4SubVerifSelected == null)?"<null>":this.rcrapp4SubVerifSelected));
        sb.append(',');
        sb.append("rorstatCmPcLockInd");
        sb.append('=');
        sb.append(((this.rorstatCmPcLockInd == null)?"<null>":this.rorstatCmPcLockInd));
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
        sb.append("displayIm1Tfc");
        sb.append('=');
        sb.append(((this.displayIm1Tfc == null)?"<null>":this.displayIm1Tfc));
        sb.append(',');
        sb.append("c1CtrbOfflEst");
        sb.append('=');
        sb.append(((this.c1CtrbOfflEst == null)?"<null>":this.c1CtrbOfflEst));
        sb.append(',');
        sb.append("rcrapp4SsMatch");
        sb.append('=');
        sb.append(((this.rcrapp4SsMatch == null)?"<null>":this.rcrapp4SsMatch));
        sb.append(',');
        sb.append("rcrapp4DodParDeathDate");
        sb.append('=');
        sb.append(((this.rcrapp4DodParDeathDate == null)?"<null>":this.rcrapp4DodParDeathDate));
        sb.append(',');
        sb.append("rcrapp4SecInsMatchInd");
        sb.append('=');
        sb.append(((this.rcrapp4SecInsMatchInd == null)?"<null>":this.rcrapp4SecInsMatchInd));
        sb.append(',');
        sb.append("im1AnlyType");
        sb.append('=');
        sb.append(((this.im1AnlyType == null)?"<null>":this.im1AnlyType));
        sb.append(',');
        sb.append("pellPgi");
        sb.append('=');
        sb.append(((this.pellPgi == null)?"<null>":this.pellPgi));
        sb.append(',');
        sb.append("rcrapp4VaMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4VaMatchFlag == null)?"<null>":this.rcrapp4VaMatchFlag));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty1");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty1 == null)?"<null>":this.rcrapp3RejReasonPrty1));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty2");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty2 == null)?"<null>":this.rcrapp3RejReasonPrty2));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty5");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty5 == null)?"<null>":this.rcrapp3RejReasonPrty5));
        sb.append(',');
        sb.append("im1ParAnlyType");
        sb.append('=');
        sb.append(((this.im1ParAnlyType == null)?"<null>":this.im1ParAnlyType));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty6");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty6 == null)?"<null>":this.rcrapp3RejReasonPrty6));
        sb.append(',');
        sb.append("rorstatInstPcLockInd");
        sb.append('=');
        sb.append(((this.rorstatInstPcLockInd == null)?"<null>":this.rorstatInstPcLockInd));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty3");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty3 == null)?"<null>":this.rcrapp3RejReasonPrty3));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty4");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty4 == null)?"<null>":this.rcrapp3RejReasonPrty4));
        sb.append(',');
        sb.append("rcrapp4CInst1TfcOfflEst");
        sb.append('=');
        sb.append(((this.rcrapp4CInst1TfcOfflEst == null)?"<null>":this.rcrapp4CInst1TfcOfflEst));
        sb.append(',');
        sb.append("rcrapp3RejReasonPrty7");
        sb.append('=');
        sb.append(((this.rcrapp3RejReasonPrty7 == null)?"<null>":this.rcrapp3RejReasonPrty7));
        sb.append(',');
        sb.append("rcrimp1PcNonCustPar");
        sb.append('=');
        sb.append(((this.rcrimp1PcNonCustPar == null)?"<null>":this.rcrimp1PcNonCustPar));
        sb.append(',');
        sb.append("cPar1AnlyType");
        sb.append('=');
        sb.append(((this.cPar1AnlyType == null)?"<null>":this.cPar1AnlyType));
        sb.append(',');
        sb.append("rnrovrdPcNonCustPar");
        sb.append('=');
        sb.append(((this.rnrovrdPcNonCustPar == null)?"<null>":this.rnrovrdPcNonCustPar));
        sb.append(',');
        sb.append("rcrlds4MatchInd");
        sb.append('=');
        sb.append(((this.rcrlds4MatchInd == null)?"<null>":this.rcrlds4MatchInd));
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
        result = ((result* 31)+((this.rorstatCmScLockInd == null)? 0 :this.rorstatCmScLockInd.hashCode()));
        result = ((result* 31)+((this.eligibilityMsg == null)? 0 :this.eligibilityMsg.hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty2 == null)? 0 :this.displayRejReasonPrty2 .hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty3 == null)? 0 :this.displayRejReasonPrty3 .hashCode()));
        result = ((result* 31)+((this.displayC1TotCtrb == null)? 0 :this.displayC1TotCtrb.hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty1 == null)? 0 :this.displayRejReasonPrty1 .hashCode()));
        result = ((result* 31)+((this.rcrapp1Ins == null)? 0 :this.rcrapp1Ins.hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty6 == null)? 0 :this.displayRejReasonPrty6 .hashCode()));
        result = ((result* 31)+((this.c1AnlyType == null)? 0 :this.c1AnlyType.hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty7 == null)? 0 :this.displayRejReasonPrty7 .hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty4 == null)? 0 :this.displayRejReasonPrty4 .hashCode()));
        result = ((result* 31)+((this.displayRejReasonPrty5 == null)? 0 :this.displayRejReasonPrty5 .hashCode()));
        result = ((result* 31)+((this.im1Pc == null)? 0 :this.im1Pc.hashCode()));
        result = ((result* 31)+((this.cDependStatus == null)? 0 :this.cDependStatus.hashCode()));
        result = ((result* 31)+((this.rcrapp3OfflUnofflInd == null)? 0 :this.rcrapp3OfflUnofflInd.hashCode()));
        result = ((result* 31)+((this.rorstatInstScLockInd == null)? 0 :this.rorstatInstScLockInd.hashCode()));
        result = ((result* 31)+((this.rorstatNsldsOvrdInd == null)? 0 :this.rorstatNsldsOvrdInd.hashCode()));
        result = ((result* 31)+((this.pellPgiOfflEst == null)? 0 :this.pellPgiOfflEst.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodMatchFlag == null)? 0 :this.rcrapp4DodMatchFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3FathSsnMatch == null)? 0 :this.rcrapp3FathSsnMatch.hashCode()));
        result = ((result* 31)+((this.c1CtrbForStdt == null)? 0 :this.c1CtrbForStdt.hashCode()));
        result = ((result* 31)+((this.cPar1CtrbForStdt == null)? 0 :this.cPar1CtrbForStdt.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationMsg == null)? 0 :this.rcrapp1VerificationMsg.hashCode()));
        result = ((result* 31)+((this.rcresarVerifChangeInd == null)? 0 :this.rcresarVerifChangeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rorstatVerComplete == null)? 0 :this.rorstatVerComplete.hashCode()));
        result = ((result* 31)+((this.rorstatPgiLockInd == null)? 0 :this.rorstatPgiLockInd.hashCode()));
        result = ((result* 31)+((this.im1Sc == null)? 0 :this.im1Sc.hashCode()));
        result = ((result* 31)+((this.rcrapp4SubVerifSelected == null)? 0 :this.rcrapp4SubVerifSelected.hashCode()));
        result = ((result* 31)+((this.rorstatCmPcLockInd == null)? 0 :this.rorstatCmPcLockInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsRegFlag == null)? 0 :this.rcrapp4SsRegFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3SocSec == null)? 0 :this.rcrapp3SocSec.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsaCitizenInd == null)? 0 :this.rcrapp4SsaCitizenInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3MothSsnMatch == null)? 0 :this.rcrapp3MothSsnMatch.hashCode()));
        result = ((result* 31)+((this.displayIm1Tfc == null)? 0 :this.displayIm1Tfc.hashCode()));
        result = ((result* 31)+((this.c1CtrbOfflEst == null)? 0 :this.c1CtrbOfflEst.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsMatch == null)? 0 :this.rcrapp4SsMatch.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodParDeathDate == null)? 0 :this.rcrapp4DodParDeathDate.hashCode()));
        result = ((result* 31)+((this.rcrapp4SecInsMatchInd == null)? 0 :this.rcrapp4SecInsMatchInd.hashCode()));
        result = ((result* 31)+((this.im1AnlyType == null)? 0 :this.im1AnlyType.hashCode()));
        result = ((result* 31)+((this.pellPgi == null)? 0 :this.pellPgi.hashCode()));
        result = ((result* 31)+((this.rcrapp4VaMatchFlag == null)? 0 :this.rcrapp4VaMatchFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty1 == null)? 0 :this.rcrapp3RejReasonPrty1 .hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty2 == null)? 0 :this.rcrapp3RejReasonPrty2 .hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty5 == null)? 0 :this.rcrapp3RejReasonPrty5 .hashCode()));
        result = ((result* 31)+((this.im1ParAnlyType == null)? 0 :this.im1ParAnlyType.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty6 == null)? 0 :this.rcrapp3RejReasonPrty6 .hashCode()));
        result = ((result* 31)+((this.rorstatInstPcLockInd == null)? 0 :this.rorstatInstPcLockInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty3 == null)? 0 :this.rcrapp3RejReasonPrty3 .hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty4 == null)? 0 :this.rcrapp3RejReasonPrty4 .hashCode()));
        result = ((result* 31)+((this.rcrapp4CInst1TfcOfflEst == null)? 0 :this.rcrapp4CInst1TfcOfflEst.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejReasonPrty7 == null)? 0 :this.rcrapp3RejReasonPrty7 .hashCode()));
        result = ((result* 31)+((this.rcrimp1PcNonCustPar == null)? 0 :this.rcrimp1PcNonCustPar.hashCode()));
        result = ((result* 31)+((this.cPar1AnlyType == null)? 0 :this.cPar1AnlyType.hashCode()));
        result = ((result* 31)+((this.rnrovrdPcNonCustPar == null)? 0 :this.rnrovrdPcNonCustPar.hashCode()));
        result = ((result* 31)+((this.rcrlds4MatchInd == null)? 0 :this.rcrlds4MatchInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20212022NeedAnalysisResultPrimaryCalculations100PutResponse) == false) {
            return false;
        }
        _20212022NeedAnalysisResultPrimaryCalculations100PutResponse rhs = ((_20212022NeedAnalysisResultPrimaryCalculations100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.cPar1CtrbOfflEst == rhs.cPar1CtrbOfflEst)||((this.cPar1CtrbOfflEst!= null)&&this.cPar1CtrbOfflEst.equals(rhs.cPar1CtrbOfflEst)))&&((this.rorstatCmScLockInd == rhs.rorstatCmScLockInd)||((this.rorstatCmScLockInd!= null)&&this.rorstatCmScLockInd.equals(rhs.rorstatCmScLockInd))))&&((this.eligibilityMsg == rhs.eligibilityMsg)||((this.eligibilityMsg!= null)&&this.eligibilityMsg.equals(rhs.eligibilityMsg))))&&((this.displayRejReasonPrty2 == rhs.displayRejReasonPrty2)||((this.displayRejReasonPrty2 != null)&&this.displayRejReasonPrty2 .equals(rhs.displayRejReasonPrty2))))&&((this.displayRejReasonPrty3 == rhs.displayRejReasonPrty3)||((this.displayRejReasonPrty3 != null)&&this.displayRejReasonPrty3 .equals(rhs.displayRejReasonPrty3))))&&((this.displayC1TotCtrb == rhs.displayC1TotCtrb)||((this.displayC1TotCtrb!= null)&&this.displayC1TotCtrb.equals(rhs.displayC1TotCtrb))))&&((this.displayRejReasonPrty1 == rhs.displayRejReasonPrty1)||((this.displayRejReasonPrty1 != null)&&this.displayRejReasonPrty1 .equals(rhs.displayRejReasonPrty1))))&&((this.rcrapp1Ins == rhs.rcrapp1Ins)||((this.rcrapp1Ins!= null)&&this.rcrapp1Ins.equals(rhs.rcrapp1Ins))))&&((this.displayRejReasonPrty6 == rhs.displayRejReasonPrty6)||((this.displayRejReasonPrty6 != null)&&this.displayRejReasonPrty6 .equals(rhs.displayRejReasonPrty6))))&&((this.c1AnlyType == rhs.c1AnlyType)||((this.c1AnlyType!= null)&&this.c1AnlyType.equals(rhs.c1AnlyType))))&&((this.displayRejReasonPrty7 == rhs.displayRejReasonPrty7)||((this.displayRejReasonPrty7 != null)&&this.displayRejReasonPrty7 .equals(rhs.displayRejReasonPrty7))))&&((this.displayRejReasonPrty4 == rhs.displayRejReasonPrty4)||((this.displayRejReasonPrty4 != null)&&this.displayRejReasonPrty4 .equals(rhs.displayRejReasonPrty4))))&&((this.displayRejReasonPrty5 == rhs.displayRejReasonPrty5)||((this.displayRejReasonPrty5 != null)&&this.displayRejReasonPrty5 .equals(rhs.displayRejReasonPrty5))))&&((this.im1Pc == rhs.im1Pc)||((this.im1Pc!= null)&&this.im1Pc.equals(rhs.im1Pc))))&&((this.cDependStatus == rhs.cDependStatus)||((this.cDependStatus!= null)&&this.cDependStatus.equals(rhs.cDependStatus))))&&((this.rcrapp3OfflUnofflInd == rhs.rcrapp3OfflUnofflInd)||((this.rcrapp3OfflUnofflInd!= null)&&this.rcrapp3OfflUnofflInd.equals(rhs.rcrapp3OfflUnofflInd))))&&((this.rorstatInstScLockInd == rhs.rorstatInstScLockInd)||((this.rorstatInstScLockInd!= null)&&this.rorstatInstScLockInd.equals(rhs.rorstatInstScLockInd))))&&((this.rorstatNsldsOvrdInd == rhs.rorstatNsldsOvrdInd)||((this.rorstatNsldsOvrdInd!= null)&&this.rorstatNsldsOvrdInd.equals(rhs.rorstatNsldsOvrdInd))))&&((this.pellPgiOfflEst == rhs.pellPgiOfflEst)||((this.pellPgiOfflEst!= null)&&this.pellPgiOfflEst.equals(rhs.pellPgiOfflEst))))&&((this.rcrapp4DodMatchFlag == rhs.rcrapp4DodMatchFlag)||((this.rcrapp4DodMatchFlag!= null)&&this.rcrapp4DodMatchFlag.equals(rhs.rcrapp4DodMatchFlag))))&&((this.rcrapp3FathSsnMatch == rhs.rcrapp3FathSsnMatch)||((this.rcrapp3FathSsnMatch!= null)&&this.rcrapp3FathSsnMatch.equals(rhs.rcrapp3FathSsnMatch))))&&((this.c1CtrbForStdt == rhs.c1CtrbForStdt)||((this.c1CtrbForStdt!= null)&&this.c1CtrbForStdt.equals(rhs.c1CtrbForStdt))))&&((this.cPar1CtrbForStdt == rhs.cPar1CtrbForStdt)||((this.cPar1CtrbForStdt!= null)&&this.cPar1CtrbForStdt.equals(rhs.cPar1CtrbForStdt))))&&((this.rcrapp1VerificationMsg == rhs.rcrapp1VerificationMsg)||((this.rcrapp1VerificationMsg!= null)&&this.rcrapp1VerificationMsg.equals(rhs.rcrapp1VerificationMsg))))&&((this.rcresarVerifChangeInd == rhs.rcresarVerifChangeInd)||((this.rcresarVerifChangeInd!= null)&&this.rcresarVerifChangeInd.equals(rhs.rcresarVerifChangeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rorstatVerComplete == rhs.rorstatVerComplete)||((this.rorstatVerComplete!= null)&&this.rorstatVerComplete.equals(rhs.rorstatVerComplete))))&&((this.rorstatPgiLockInd == rhs.rorstatPgiLockInd)||((this.rorstatPgiLockInd!= null)&&this.rorstatPgiLockInd.equals(rhs.rorstatPgiLockInd))))&&((this.im1Sc == rhs.im1Sc)||((this.im1Sc!= null)&&this.im1Sc.equals(rhs.im1Sc))))&&((this.rcrapp4SubVerifSelected == rhs.rcrapp4SubVerifSelected)||((this.rcrapp4SubVerifSelected!= null)&&this.rcrapp4SubVerifSelected.equals(rhs.rcrapp4SubVerifSelected))))&&((this.rorstatCmPcLockInd == rhs.rorstatCmPcLockInd)||((this.rorstatCmPcLockInd!= null)&&this.rorstatCmPcLockInd.equals(rhs.rorstatCmPcLockInd))))&&((this.rcrapp4SsRegFlag == rhs.rcrapp4SsRegFlag)||((this.rcrapp4SsRegFlag!= null)&&this.rcrapp4SsRegFlag.equals(rhs.rcrapp4SsRegFlag))))&&((this.rcrapp3SocSec == rhs.rcrapp3SocSec)||((this.rcrapp3SocSec!= null)&&this.rcrapp3SocSec.equals(rhs.rcrapp3SocSec))))&&((this.rcrapp4SsaCitizenInd == rhs.rcrapp4SsaCitizenInd)||((this.rcrapp4SsaCitizenInd!= null)&&this.rcrapp4SsaCitizenInd.equals(rhs.rcrapp4SsaCitizenInd))))&&((this.rcrapp3MothSsnMatch == rhs.rcrapp3MothSsnMatch)||((this.rcrapp3MothSsnMatch!= null)&&this.rcrapp3MothSsnMatch.equals(rhs.rcrapp3MothSsnMatch))))&&((this.displayIm1Tfc == rhs.displayIm1Tfc)||((this.displayIm1Tfc!= null)&&this.displayIm1Tfc.equals(rhs.displayIm1Tfc))))&&((this.c1CtrbOfflEst == rhs.c1CtrbOfflEst)||((this.c1CtrbOfflEst!= null)&&this.c1CtrbOfflEst.equals(rhs.c1CtrbOfflEst))))&&((this.rcrapp4SsMatch == rhs.rcrapp4SsMatch)||((this.rcrapp4SsMatch!= null)&&this.rcrapp4SsMatch.equals(rhs.rcrapp4SsMatch))))&&((this.rcrapp4DodParDeathDate == rhs.rcrapp4DodParDeathDate)||((this.rcrapp4DodParDeathDate!= null)&&this.rcrapp4DodParDeathDate.equals(rhs.rcrapp4DodParDeathDate))))&&((this.rcrapp4SecInsMatchInd == rhs.rcrapp4SecInsMatchInd)||((this.rcrapp4SecInsMatchInd!= null)&&this.rcrapp4SecInsMatchInd.equals(rhs.rcrapp4SecInsMatchInd))))&&((this.im1AnlyType == rhs.im1AnlyType)||((this.im1AnlyType!= null)&&this.im1AnlyType.equals(rhs.im1AnlyType))))&&((this.pellPgi == rhs.pellPgi)||((this.pellPgi!= null)&&this.pellPgi.equals(rhs.pellPgi))))&&((this.rcrapp4VaMatchFlag == rhs.rcrapp4VaMatchFlag)||((this.rcrapp4VaMatchFlag!= null)&&this.rcrapp4VaMatchFlag.equals(rhs.rcrapp4VaMatchFlag))))&&((this.rcrapp3RejReasonPrty1 == rhs.rcrapp3RejReasonPrty1)||((this.rcrapp3RejReasonPrty1 != null)&&this.rcrapp3RejReasonPrty1 .equals(rhs.rcrapp3RejReasonPrty1))))&&((this.rcrapp3RejReasonPrty2 == rhs.rcrapp3RejReasonPrty2)||((this.rcrapp3RejReasonPrty2 != null)&&this.rcrapp3RejReasonPrty2 .equals(rhs.rcrapp3RejReasonPrty2))))&&((this.rcrapp3RejReasonPrty5 == rhs.rcrapp3RejReasonPrty5)||((this.rcrapp3RejReasonPrty5 != null)&&this.rcrapp3RejReasonPrty5 .equals(rhs.rcrapp3RejReasonPrty5))))&&((this.im1ParAnlyType == rhs.im1ParAnlyType)||((this.im1ParAnlyType!= null)&&this.im1ParAnlyType.equals(rhs.im1ParAnlyType))))&&((this.rcrapp3RejReasonPrty6 == rhs.rcrapp3RejReasonPrty6)||((this.rcrapp3RejReasonPrty6 != null)&&this.rcrapp3RejReasonPrty6 .equals(rhs.rcrapp3RejReasonPrty6))))&&((this.rorstatInstPcLockInd == rhs.rorstatInstPcLockInd)||((this.rorstatInstPcLockInd!= null)&&this.rorstatInstPcLockInd.equals(rhs.rorstatInstPcLockInd))))&&((this.rcrapp3RejReasonPrty3 == rhs.rcrapp3RejReasonPrty3)||((this.rcrapp3RejReasonPrty3 != null)&&this.rcrapp3RejReasonPrty3 .equals(rhs.rcrapp3RejReasonPrty3))))&&((this.rcrapp3RejReasonPrty4 == rhs.rcrapp3RejReasonPrty4)||((this.rcrapp3RejReasonPrty4 != null)&&this.rcrapp3RejReasonPrty4 .equals(rhs.rcrapp3RejReasonPrty4))))&&((this.rcrapp4CInst1TfcOfflEst == rhs.rcrapp4CInst1TfcOfflEst)||((this.rcrapp4CInst1TfcOfflEst!= null)&&this.rcrapp4CInst1TfcOfflEst.equals(rhs.rcrapp4CInst1TfcOfflEst))))&&((this.rcrapp3RejReasonPrty7 == rhs.rcrapp3RejReasonPrty7)||((this.rcrapp3RejReasonPrty7 != null)&&this.rcrapp3RejReasonPrty7 .equals(rhs.rcrapp3RejReasonPrty7))))&&((this.rcrimp1PcNonCustPar == rhs.rcrimp1PcNonCustPar)||((this.rcrimp1PcNonCustPar!= null)&&this.rcrimp1PcNonCustPar.equals(rhs.rcrimp1PcNonCustPar))))&&((this.cPar1AnlyType == rhs.cPar1AnlyType)||((this.cPar1AnlyType!= null)&&this.cPar1AnlyType.equals(rhs.cPar1AnlyType))))&&((this.rnrovrdPcNonCustPar == rhs.rnrovrdPcNonCustPar)||((this.rnrovrdPcNonCustPar!= null)&&this.rnrovrdPcNonCustPar.equals(rhs.rnrovrdPcNonCustPar))))&&((this.rcrlds4MatchInd == rhs.rcrlds4MatchInd)||((this.rcrlds4MatchInd!= null)&&this.rcrlds4MatchInd.equals(rhs.rcrlds4MatchInd))));
    }

}
