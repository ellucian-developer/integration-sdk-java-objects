
package com.ellucian.generated.bpapi.ban.student_course_registration_curricula_update.v1_0_0;

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
    "programDesc",
    "leavCode",
    "endDate",
    "admtTermDesc",
    "degcCode",
    "matricTermDesc",
    "program",
    "leavCodeDesc",
    "catlgTermDesc",
    "lcurRolledKeySeqno",
    "campCode",
    "termDesc",
    "cactCode",
    "leavFromDate",
    "lmodCodeDesc",
    "termCodeGradDesc",
    "campDesc",
    "lmodCode",
    "rollInd",
    "sovlcurApplKeySeqno",
    "collCode",
    "levlCode",
    "startDate",
    "rateCodeDesc",
    "termCodeMatric",
    "rateCode",
    "termCodeGrad",
    "gappSeqno",
    "activityDate",
    "admtCode",
    "priorityNo",
    "leavToDate",
    "collDesc",
    "stypCodeDesc",
    "expGradDate",
    "levlDesc",
    "termCodeCtlg",
    "siteCode",
    "seqno",
    "sovlcurCurrentInd",
    "termCodeEnd",
    "userId",
    "degcDesc",
    "keySeqno",
    "acyrCode",
    "termCodeAdmit",
    "stypCode",
    "endTermDesc",
    "siteCodeDesc",
    "acyrCodeDesc",
    "admtDesc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Sorlcur {

    @JsonProperty("programDesc")
    private String programDesc;
    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEAV_CODE, Lookup lineage reference object : stvleav")
    private String leavCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_END_DATE")
    private Date endDate;
    @JsonProperty("admtTermDesc")
    private String admtTermDesc;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    @JsonProperty("matricTermDesc")
    private String matricTermDesc;
    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    @JsonProperty("leavCodeDesc")
    private String leavCodeDesc;
    @JsonProperty("catlgTermDesc")
    private String catlgTermDesc;
    /**
     * Rolled to Outcome
     * <p>
     * 
     * 
     */
    @JsonProperty("lcurRolledKeySeqno")
    private Double lcurRolledKeySeqno;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    @JsonProperty("termDesc")
    private String termDesc;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String cactCode;
    /**
     * Leave From Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEAV_FROM_DATE")
    private Date leavFromDate;
    @JsonProperty("lmodCodeDesc")
    private String lmodCodeDesc;
    @JsonProperty("termCodeGradDesc")
    private String termCodeGradDesc;
    @JsonProperty("campDesc")
    private String campDesc;
    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod")
    private String lmodCode;
    /**
     * Roll Learner
     * <p>
     * Lineage reference object : SOVLCUR_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ROLL_IND")
    private String rollInd;
    /**
     * Application
     * <p>
     * Lineage reference object : SOVLCUR_APPL_KEY_SEQNO
     * 
     */
    @JsonProperty("sovlcurApplKeySeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_APPL_KEY_SEQNO")
    private Double sovlcurApplKeySeqno;
    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_START_DATE")
    private Date startDate;
    @JsonProperty("rateCodeDesc")
    private String rateCodeDesc;
    /**
     * Matriculated Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm")
    private String termCodeMatric;
    /**
     * Rate
     * <p>
     * Lineage reference object : SOVLCUR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_GAPP_SEQNO")
    private Double gappSeqno;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PRIORITY_NO")
    private Double priorityNo;
    /**
     * Leave To Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEAV_TO_DATE")
    private Date leavToDate;
    @JsonProperty("collDesc")
    private String collDesc;
    @JsonProperty("stypCodeDesc")
    private String stypCodeDesc;
    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SOVLCUR_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_EXP_GRAD_DATE")
    private Date expGradDate;
    @JsonProperty("levlDesc")
    private String levlDesc;
    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String termCodeCtlg;
    /**
     * Site
     * <p>
     * Lineage reference object : SOVLCUR_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLCUR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_SEQNO")
    private Double seqno;
    /**
     * Lineage reference object : SOVLCUR_CURRENT_IND
     * 
     */
    @JsonProperty("sovlcurCurrentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CURRENT_IND")
    private String sovlcurCurrentInd;
    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_USER_ID")
    private String userId;
    @JsonProperty("degcDesc")
    private String degcDesc;
    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double keySeqno;
    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SOVLCUR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ACYR_CODE, Lookup lineage reference object : stvacyr")
    private String acyrCode;
    /**
     * Admission Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String termCodeAdmit;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    @JsonProperty("endTermDesc")
    private String endTermDesc;
    @JsonProperty("siteCodeDesc")
    private String siteCodeDesc;
    @JsonProperty("acyrCodeDesc")
    private String acyrCodeDesc;
    @JsonProperty("admtDesc")
    private String admtDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public Sorlcur withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    public String getLeavCode() {
        return leavCode;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public Sorlcur withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Sorlcur withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("admtTermDesc")
    public String getAdmtTermDesc() {
        return admtTermDesc;
    }

    @JsonProperty("admtTermDesc")
    public void setAdmtTermDesc(String admtTermDesc) {
        this.admtTermDesc = admtTermDesc;
    }

    public Sorlcur withAdmtTermDesc(String admtTermDesc) {
        this.admtTermDesc = admtTermDesc;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public Sorlcur withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("matricTermDesc")
    public String getMatricTermDesc() {
        return matricTermDesc;
    }

    @JsonProperty("matricTermDesc")
    public void setMatricTermDesc(String matricTermDesc) {
        this.matricTermDesc = matricTermDesc;
    }

    public Sorlcur withMatricTermDesc(String matricTermDesc) {
        this.matricTermDesc = matricTermDesc;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public Sorlcur withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("leavCodeDesc")
    public String getLeavCodeDesc() {
        return leavCodeDesc;
    }

    @JsonProperty("leavCodeDesc")
    public void setLeavCodeDesc(String leavCodeDesc) {
        this.leavCodeDesc = leavCodeDesc;
    }

    public Sorlcur withLeavCodeDesc(String leavCodeDesc) {
        this.leavCodeDesc = leavCodeDesc;
        return this;
    }

    @JsonProperty("catlgTermDesc")
    public String getCatlgTermDesc() {
        return catlgTermDesc;
    }

    @JsonProperty("catlgTermDesc")
    public void setCatlgTermDesc(String catlgTermDesc) {
        this.catlgTermDesc = catlgTermDesc;
    }

    public Sorlcur withCatlgTermDesc(String catlgTermDesc) {
        this.catlgTermDesc = catlgTermDesc;
        return this;
    }

    /**
     * Rolled to Outcome
     * <p>
     * 
     * 
     */
    @JsonProperty("lcurRolledKeySeqno")
    public Double getLcurRolledKeySeqno() {
        return lcurRolledKeySeqno;
    }

    /**
     * Rolled to Outcome
     * <p>
     * 
     * 
     */
    @JsonProperty("lcurRolledKeySeqno")
    public void setLcurRolledKeySeqno(Double lcurRolledKeySeqno) {
        this.lcurRolledKeySeqno = lcurRolledKeySeqno;
    }

    public Sorlcur withLcurRolledKeySeqno(Double lcurRolledKeySeqno) {
        this.lcurRolledKeySeqno = lcurRolledKeySeqno;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Sorlcur withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("termDesc")
    public String getTermDesc() {
        return termDesc;
    }

    @JsonProperty("termDesc")
    public void setTermDesc(String termDesc) {
        this.termDesc = termDesc;
    }

    public Sorlcur withTermDesc(String termDesc) {
        this.termDesc = termDesc;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public Sorlcur withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    /**
     * Leave From Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    public Date getLeavFromDate() {
        return leavFromDate;
    }

    /**
     * Leave From Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    public void setLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
    }

    public Sorlcur withLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
        return this;
    }

    @JsonProperty("lmodCodeDesc")
    public String getLmodCodeDesc() {
        return lmodCodeDesc;
    }

    @JsonProperty("lmodCodeDesc")
    public void setLmodCodeDesc(String lmodCodeDesc) {
        this.lmodCodeDesc = lmodCodeDesc;
    }

    public Sorlcur withLmodCodeDesc(String lmodCodeDesc) {
        this.lmodCodeDesc = lmodCodeDesc;
        return this;
    }

    @JsonProperty("termCodeGradDesc")
    public String getTermCodeGradDesc() {
        return termCodeGradDesc;
    }

    @JsonProperty("termCodeGradDesc")
    public void setTermCodeGradDesc(String termCodeGradDesc) {
        this.termCodeGradDesc = termCodeGradDesc;
    }

    public Sorlcur withTermCodeGradDesc(String termCodeGradDesc) {
        this.termCodeGradDesc = termCodeGradDesc;
        return this;
    }

    @JsonProperty("campDesc")
    public String getCampDesc() {
        return campDesc;
    }

    @JsonProperty("campDesc")
    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public Sorlcur withCampDesc(String campDesc) {
        this.campDesc = campDesc;
        return this;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    public String getLmodCode() {
        return lmodCode;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    public void setLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
    }

    public Sorlcur withLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
        return this;
    }

    /**
     * Roll Learner
     * <p>
     * Lineage reference object : SOVLCUR_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public String getRollInd() {
        return rollInd;
    }

    /**
     * Roll Learner
     * <p>
     * Lineage reference object : SOVLCUR_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public void setRollInd(String rollInd) {
        this.rollInd = rollInd;
    }

    public Sorlcur withRollInd(String rollInd) {
        this.rollInd = rollInd;
        return this;
    }

    /**
     * Application
     * <p>
     * Lineage reference object : SOVLCUR_APPL_KEY_SEQNO
     * 
     */
    @JsonProperty("sovlcurApplKeySeqno")
    public Double getSovlcurApplKeySeqno() {
        return sovlcurApplKeySeqno;
    }

    /**
     * Application
     * <p>
     * Lineage reference object : SOVLCUR_APPL_KEY_SEQNO
     * 
     */
    @JsonProperty("sovlcurApplKeySeqno")
    public void setSovlcurApplKeySeqno(Double sovlcurApplKeySeqno) {
        this.sovlcurApplKeySeqno = sovlcurApplKeySeqno;
    }

    public Sorlcur withSovlcurApplKeySeqno(Double sovlcurApplKeySeqno) {
        this.sovlcurApplKeySeqno = sovlcurApplKeySeqno;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public Sorlcur withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Sorlcur withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Sorlcur withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("rateCodeDesc")
    public String getRateCodeDesc() {
        return rateCodeDesc;
    }

    @JsonProperty("rateCodeDesc")
    public void setRateCodeDesc(String rateCodeDesc) {
        this.rateCodeDesc = rateCodeDesc;
    }

    public Sorlcur withRateCodeDesc(String rateCodeDesc) {
        this.rateCodeDesc = rateCodeDesc;
        return this;
    }

    /**
     * Matriculated Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    public String getTermCodeMatric() {
        return termCodeMatric;
    }

    /**
     * Matriculated Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    public void setTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
    }

    public Sorlcur withTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SOVLCUR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SOVLCUR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public Sorlcur withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public Sorlcur withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    public Double getGappSeqno() {
        return gappSeqno;
    }

    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    public void setGappSeqno(Double gappSeqno) {
        this.gappSeqno = gappSeqno;
    }

    public Sorlcur withGappSeqno(Double gappSeqno) {
        this.gappSeqno = gappSeqno;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorlcur withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public Sorlcur withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public Sorlcur withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    /**
     * Leave To Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    public Date getLeavToDate() {
        return leavToDate;
    }

    /**
     * Leave To Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_TO_DATE
     * 
     */
    @JsonProperty("leavToDate")
    public void setLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
    }

    public Sorlcur withLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public Sorlcur withCollDesc(String collDesc) {
        this.collDesc = collDesc;
        return this;
    }

    @JsonProperty("stypCodeDesc")
    public String getStypCodeDesc() {
        return stypCodeDesc;
    }

    @JsonProperty("stypCodeDesc")
    public void setStypCodeDesc(String stypCodeDesc) {
        this.stypCodeDesc = stypCodeDesc;
    }

    public Sorlcur withStypCodeDesc(String stypCodeDesc) {
        this.stypCodeDesc = stypCodeDesc;
        return this;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SOVLCUR_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    public Date getExpGradDate() {
        return expGradDate;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SOVLCUR_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    public void setExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
    }

    public Sorlcur withExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
        return this;
    }

    @JsonProperty("levlDesc")
    public String getLevlDesc() {
        return levlDesc;
    }

    @JsonProperty("levlDesc")
    public void setLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
    }

    public Sorlcur withLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
        return this;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public String getTermCodeCtlg() {
        return termCodeCtlg;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public void setTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
    }

    public Sorlcur withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SOVLCUR_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SOVLCUR_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public Sorlcur withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLCUR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLCUR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public Sorlcur withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Lineage reference object : SOVLCUR_CURRENT_IND
     * 
     */
    @JsonProperty("sovlcurCurrentInd")
    public String getSovlcurCurrentInd() {
        return sovlcurCurrentInd;
    }

    /**
     * Lineage reference object : SOVLCUR_CURRENT_IND
     * 
     */
    @JsonProperty("sovlcurCurrentInd")
    public void setSovlcurCurrentInd(String sovlcurCurrentInd) {
        this.sovlcurCurrentInd = sovlcurCurrentInd;
    }

    public Sorlcur withSovlcurCurrentInd(String sovlcurCurrentInd) {
        this.sovlcurCurrentInd = sovlcurCurrentInd;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public Sorlcur withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorlcur withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("degcDesc")
    public String getDegcDesc() {
        return degcDesc;
    }

    @JsonProperty("degcDesc")
    public void setDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
    }

    public Sorlcur withDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
        return this;
    }

    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    public Double getKeySeqno() {
        return keySeqno;
    }

    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    public void setKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
    }

    public Sorlcur withKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
        return this;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SOVLCUR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public String getAcyrCode() {
        return acyrCode;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SOVLCUR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public void setAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
    }

    public Sorlcur withAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public Sorlcur withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public Sorlcur withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("endTermDesc")
    public String getEndTermDesc() {
        return endTermDesc;
    }

    @JsonProperty("endTermDesc")
    public void setEndTermDesc(String endTermDesc) {
        this.endTermDesc = endTermDesc;
    }

    public Sorlcur withEndTermDesc(String endTermDesc) {
        this.endTermDesc = endTermDesc;
        return this;
    }

    @JsonProperty("siteCodeDesc")
    public String getSiteCodeDesc() {
        return siteCodeDesc;
    }

    @JsonProperty("siteCodeDesc")
    public void setSiteCodeDesc(String siteCodeDesc) {
        this.siteCodeDesc = siteCodeDesc;
    }

    public Sorlcur withSiteCodeDesc(String siteCodeDesc) {
        this.siteCodeDesc = siteCodeDesc;
        return this;
    }

    @JsonProperty("acyrCodeDesc")
    public String getAcyrCodeDesc() {
        return acyrCodeDesc;
    }

    @JsonProperty("acyrCodeDesc")
    public void setAcyrCodeDesc(String acyrCodeDesc) {
        this.acyrCodeDesc = acyrCodeDesc;
    }

    public Sorlcur withAcyrCodeDesc(String acyrCodeDesc) {
        this.acyrCodeDesc = acyrCodeDesc;
        return this;
    }

    @JsonProperty("admtDesc")
    public String getAdmtDesc() {
        return admtDesc;
    }

    @JsonProperty("admtDesc")
    public void setAdmtDesc(String admtDesc) {
        this.admtDesc = admtDesc;
    }

    public Sorlcur withAdmtDesc(String admtDesc) {
        this.admtDesc = admtDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Sorlcur withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Sorlcur withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorlcur.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("admtTermDesc");
        sb.append('=');
        sb.append(((this.admtTermDesc == null)?"<null>":this.admtTermDesc));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("matricTermDesc");
        sb.append('=');
        sb.append(((this.matricTermDesc == null)?"<null>":this.matricTermDesc));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("leavCodeDesc");
        sb.append('=');
        sb.append(((this.leavCodeDesc == null)?"<null>":this.leavCodeDesc));
        sb.append(',');
        sb.append("catlgTermDesc");
        sb.append('=');
        sb.append(((this.catlgTermDesc == null)?"<null>":this.catlgTermDesc));
        sb.append(',');
        sb.append("lcurRolledKeySeqno");
        sb.append('=');
        sb.append(((this.lcurRolledKeySeqno == null)?"<null>":this.lcurRolledKeySeqno));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("termDesc");
        sb.append('=');
        sb.append(((this.termDesc == null)?"<null>":this.termDesc));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("lmodCodeDesc");
        sb.append('=');
        sb.append(((this.lmodCodeDesc == null)?"<null>":this.lmodCodeDesc));
        sb.append(',');
        sb.append("termCodeGradDesc");
        sb.append('=');
        sb.append(((this.termCodeGradDesc == null)?"<null>":this.termCodeGradDesc));
        sb.append(',');
        sb.append("campDesc");
        sb.append('=');
        sb.append(((this.campDesc == null)?"<null>":this.campDesc));
        sb.append(',');
        sb.append("lmodCode");
        sb.append('=');
        sb.append(((this.lmodCode == null)?"<null>":this.lmodCode));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("sovlcurApplKeySeqno");
        sb.append('=');
        sb.append(((this.sovlcurApplKeySeqno == null)?"<null>":this.sovlcurApplKeySeqno));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("rateCodeDesc");
        sb.append('=');
        sb.append(((this.rateCodeDesc == null)?"<null>":this.rateCodeDesc));
        sb.append(',');
        sb.append("termCodeMatric");
        sb.append('=');
        sb.append(((this.termCodeMatric == null)?"<null>":this.termCodeMatric));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("gappSeqno");
        sb.append('=');
        sb.append(((this.gappSeqno == null)?"<null>":this.gappSeqno));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("stypCodeDesc");
        sb.append('=');
        sb.append(((this.stypCodeDesc == null)?"<null>":this.stypCodeDesc));
        sb.append(',');
        sb.append("expGradDate");
        sb.append('=');
        sb.append(((this.expGradDate == null)?"<null>":this.expGradDate));
        sb.append(',');
        sb.append("levlDesc");
        sb.append('=');
        sb.append(((this.levlDesc == null)?"<null>":this.levlDesc));
        sb.append(',');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("sovlcurCurrentInd");
        sb.append('=');
        sb.append(((this.sovlcurCurrentInd == null)?"<null>":this.sovlcurCurrentInd));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("degcDesc");
        sb.append('=');
        sb.append(((this.degcDesc == null)?"<null>":this.degcDesc));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
        sb.append(',');
        sb.append("acyrCode");
        sb.append('=');
        sb.append(((this.acyrCode == null)?"<null>":this.acyrCode));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("endTermDesc");
        sb.append('=');
        sb.append(((this.endTermDesc == null)?"<null>":this.endTermDesc));
        sb.append(',');
        sb.append("siteCodeDesc");
        sb.append('=');
        sb.append(((this.siteCodeDesc == null)?"<null>":this.siteCodeDesc));
        sb.append(',');
        sb.append("acyrCodeDesc");
        sb.append('=');
        sb.append(((this.acyrCodeDesc == null)?"<null>":this.acyrCodeDesc));
        sb.append(',');
        sb.append("admtDesc");
        sb.append('=');
        sb.append(((this.admtDesc == null)?"<null>":this.admtDesc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.admtTermDesc == null)? 0 :this.admtTermDesc.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.matricTermDesc == null)? 0 :this.matricTermDesc.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.leavCodeDesc == null)? 0 :this.leavCodeDesc.hashCode()));
        result = ((result* 31)+((this.catlgTermDesc == null)? 0 :this.catlgTermDesc.hashCode()));
        result = ((result* 31)+((this.lcurRolledKeySeqno == null)? 0 :this.lcurRolledKeySeqno.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.termDesc == null)? 0 :this.termDesc.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.lmodCodeDesc == null)? 0 :this.lmodCodeDesc.hashCode()));
        result = ((result* 31)+((this.termCodeGradDesc == null)? 0 :this.termCodeGradDesc.hashCode()));
        result = ((result* 31)+((this.campDesc == null)? 0 :this.campDesc.hashCode()));
        result = ((result* 31)+((this.lmodCode == null)? 0 :this.lmodCode.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.sovlcurApplKeySeqno == null)? 0 :this.sovlcurApplKeySeqno.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.rateCodeDesc == null)? 0 :this.rateCodeDesc.hashCode()));
        result = ((result* 31)+((this.termCodeMatric == null)? 0 :this.termCodeMatric.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.gappSeqno == null)? 0 :this.gappSeqno.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.stypCodeDesc == null)? 0 :this.stypCodeDesc.hashCode()));
        result = ((result* 31)+((this.expGradDate == null)? 0 :this.expGradDate.hashCode()));
        result = ((result* 31)+((this.levlDesc == null)? 0 :this.levlDesc.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.sovlcurCurrentInd == null)? 0 :this.sovlcurCurrentInd.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.degcDesc == null)? 0 :this.degcDesc.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        result = ((result* 31)+((this.acyrCode == null)? 0 :this.acyrCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.endTermDesc == null)? 0 :this.endTermDesc.hashCode()));
        result = ((result* 31)+((this.siteCodeDesc == null)? 0 :this.siteCodeDesc.hashCode()));
        result = ((result* 31)+((this.acyrCodeDesc == null)? 0 :this.acyrCodeDesc.hashCode()));
        result = ((result* 31)+((this.admtDesc == null)? 0 :this.admtDesc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorlcur) == false) {
            return false;
        }
        Sorlcur rhs = ((Sorlcur) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.admtTermDesc == rhs.admtTermDesc)||((this.admtTermDesc!= null)&&this.admtTermDesc.equals(rhs.admtTermDesc))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.matricTermDesc == rhs.matricTermDesc)||((this.matricTermDesc!= null)&&this.matricTermDesc.equals(rhs.matricTermDesc))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.leavCodeDesc == rhs.leavCodeDesc)||((this.leavCodeDesc!= null)&&this.leavCodeDesc.equals(rhs.leavCodeDesc))))&&((this.catlgTermDesc == rhs.catlgTermDesc)||((this.catlgTermDesc!= null)&&this.catlgTermDesc.equals(rhs.catlgTermDesc))))&&((this.lcurRolledKeySeqno == rhs.lcurRolledKeySeqno)||((this.lcurRolledKeySeqno!= null)&&this.lcurRolledKeySeqno.equals(rhs.lcurRolledKeySeqno))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.termDesc == rhs.termDesc)||((this.termDesc!= null)&&this.termDesc.equals(rhs.termDesc))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.lmodCodeDesc == rhs.lmodCodeDesc)||((this.lmodCodeDesc!= null)&&this.lmodCodeDesc.equals(rhs.lmodCodeDesc))))&&((this.termCodeGradDesc == rhs.termCodeGradDesc)||((this.termCodeGradDesc!= null)&&this.termCodeGradDesc.equals(rhs.termCodeGradDesc))))&&((this.campDesc == rhs.campDesc)||((this.campDesc!= null)&&this.campDesc.equals(rhs.campDesc))))&&((this.lmodCode == rhs.lmodCode)||((this.lmodCode!= null)&&this.lmodCode.equals(rhs.lmodCode))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.sovlcurApplKeySeqno == rhs.sovlcurApplKeySeqno)||((this.sovlcurApplKeySeqno!= null)&&this.sovlcurApplKeySeqno.equals(rhs.sovlcurApplKeySeqno))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.rateCodeDesc == rhs.rateCodeDesc)||((this.rateCodeDesc!= null)&&this.rateCodeDesc.equals(rhs.rateCodeDesc))))&&((this.termCodeMatric == rhs.termCodeMatric)||((this.termCodeMatric!= null)&&this.termCodeMatric.equals(rhs.termCodeMatric))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.gappSeqno == rhs.gappSeqno)||((this.gappSeqno!= null)&&this.gappSeqno.equals(rhs.gappSeqno))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.stypCodeDesc == rhs.stypCodeDesc)||((this.stypCodeDesc!= null)&&this.stypCodeDesc.equals(rhs.stypCodeDesc))))&&((this.expGradDate == rhs.expGradDate)||((this.expGradDate!= null)&&this.expGradDate.equals(rhs.expGradDate))))&&((this.levlDesc == rhs.levlDesc)||((this.levlDesc!= null)&&this.levlDesc.equals(rhs.levlDesc))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.sovlcurCurrentInd == rhs.sovlcurCurrentInd)||((this.sovlcurCurrentInd!= null)&&this.sovlcurCurrentInd.equals(rhs.sovlcurCurrentInd))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.degcDesc == rhs.degcDesc)||((this.degcDesc!= null)&&this.degcDesc.equals(rhs.degcDesc))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.endTermDesc == rhs.endTermDesc)||((this.endTermDesc!= null)&&this.endTermDesc.equals(rhs.endTermDesc))))&&((this.siteCodeDesc == rhs.siteCodeDesc)||((this.siteCodeDesc!= null)&&this.siteCodeDesc.equals(rhs.siteCodeDesc))))&&((this.acyrCodeDesc == rhs.acyrCodeDesc)||((this.acyrCodeDesc!= null)&&this.acyrCodeDesc.equals(rhs.acyrCodeDesc))))&&((this.admtDesc == rhs.admtDesc)||((this.admtDesc!= null)&&this.admtDesc.equals(rhs.admtDesc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
