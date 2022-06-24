
package com.ellucian.generated.bpapi.ban.student_course_registration_curricula_field_of_study.v1_0_0;

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
    "term",
    "id",
    "rstsEstsDate",
    "holdPassword",
    "viewCurrent",
    "printBill",
    "printSchedule",
    "keyStudypath",
    "sovlcurCurrentInd",
    "cactCode",
    "lmodCode",
    "keySeqno",
    "termCode",
    "termCodeEnd",
    "termCodeCtlg",
    "priorityNo",
    "gappSeqno",
    "program",
    "collCode",
    "levlCode",
    "degcCode",
    "campCode",
    "startDate",
    "endDate",
    "admtCode",
    "leavFromDate",
    "termCodeAdmit",
    "stypCode",
    "leavToDate",
    "sovlcurApplKeySeqno",
    "siteCode",
    "expGradDate",
    "termCodeMatric",
    "rateCode",
    "termCodeGrad",
    "leavCode",
    "acyrCode",
    "userId",
    "activityDate",
    "currentInd",
    "sorlfosCactCode",
    "cstsCode",
    "sorlfosTermCode",
    "lfstCode",
    "sorlfosPriorityNo",
    "sorlfosTermCodeCtlg",
    "sorlfosTermCodeEnd",
    "majrCode",
    "sorlfosStartDate",
    "deptCode",
    "sorlfosEndDate",
    "majrCodeAttach",
    "lfosRolledInd",
    "tmstCode"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost {

    @JsonProperty("term")
    private String term;
    @JsonProperty("id")
    private String id;
    @JsonProperty("rstsEstsDate")
    private String rstsEstsDate;
    @JsonProperty("holdPassword")
    private String holdPassword;
    @JsonProperty("viewCurrent")
    private String viewCurrent;
    @JsonProperty("printBill")
    private String printBill;
    @JsonProperty("printSchedule")
    private String printSchedule;
    @JsonProperty("keyStudypath")
    private String keyStudypath;
    @JsonProperty("sovlcurCurrentInd")
    private String sovlcurCurrentInd;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String cactCode;
    @JsonProperty("lmodCode")
    private String lmodCode;
    @JsonProperty("keySeqno")
    private String keySeqno;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String termCodeCtlg;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double priorityNo;
    @JsonProperty("gappSeqno")
    private String gappSeqno;
    @JsonProperty("program")
    private String program;
    @JsonProperty("collCode")
    private String collCode;
    @JsonProperty("levlCode")
    private String levlCode;
    @JsonProperty("degcCode")
    private String degcCode;
    @JsonProperty("campCode")
    private String campCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_START_DATE")
    private Date startDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_END_DATE")
    private Date endDate;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("leavFromDate")
    private String leavFromDate;
    @JsonProperty("termCodeAdmit")
    private String termCodeAdmit;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("leavToDate")
    private String leavToDate;
    @JsonProperty("sovlcurApplKeySeqno")
    private String sovlcurApplKeySeqno;
    @JsonProperty("siteCode")
    private String siteCode;
    @JsonProperty("expGradDate")
    private String expGradDate;
    @JsonProperty("termCodeMatric")
    private String termCodeMatric;
    @JsonProperty("rateCode")
    private String rateCode;
    @JsonProperty("termCodeGrad")
    private String termCodeGrad;
    @JsonProperty("leavCode")
    private String leavCode;
    @JsonProperty("acyrCode")
    private String acyrCode;
    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_USER_ID")
    private String userId;
    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CURRENT_IND")
    private String currentInd;
    @JsonProperty("sorlfosCactCode")
    private String sorlfosCactCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    @JsonProperty("sorlfosTermCode")
    private String sorlfosTermCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    @JsonProperty("sorlfosPriorityNo")
    private String sorlfosPriorityNo;
    @JsonProperty("sorlfosTermCodeCtlg")
    private String sorlfosTermCodeCtlg;
    @JsonProperty("sorlfosTermCodeEnd")
    private String sorlfosTermCodeEnd;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String majrCode;
    @JsonProperty("sorlfosStartDate")
    private String sorlfosStartDate;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonProperty("sorlfosEndDate")
    private String sorlfosEndDate;
    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String majrCodeAttach;
    @JsonProperty("lfosRolledInd")
    private String lfosRolledInd;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTerm(String term) {
        this.term = term;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("rstsEstsDate")
    public String getRstsEstsDate() {
        return rstsEstsDate;
    }

    @JsonProperty("rstsEstsDate")
    public void setRstsEstsDate(String rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withRstsEstsDate(String rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
        return this;
    }

    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    @JsonProperty("viewCurrent")
    public String getViewCurrent() {
        return viewCurrent;
    }

    @JsonProperty("viewCurrent")
    public void setViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
        return this;
    }

    @JsonProperty("printBill")
    public String getPrintBill() {
        return printBill;
    }

    @JsonProperty("printBill")
    public void setPrintBill(String printBill) {
        this.printBill = printBill;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withPrintBill(String printBill) {
        this.printBill = printBill;
        return this;
    }

    @JsonProperty("printSchedule")
    public String getPrintSchedule() {
        return printSchedule;
    }

    @JsonProperty("printSchedule")
    public void setPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
        return this;
    }

    @JsonProperty("keyStudypath")
    public String getKeyStudypath() {
        return keyStudypath;
    }

    @JsonProperty("keyStudypath")
    public void setKeyStudypath(String keyStudypath) {
        this.keyStudypath = keyStudypath;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withKeyStudypath(String keyStudypath) {
        this.keyStudypath = keyStudypath;
        return this;
    }

    @JsonProperty("sovlcurCurrentInd")
    public String getSovlcurCurrentInd() {
        return sovlcurCurrentInd;
    }

    @JsonProperty("sovlcurCurrentInd")
    public void setSovlcurCurrentInd(String sovlcurCurrentInd) {
        this.sovlcurCurrentInd = sovlcurCurrentInd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSovlcurCurrentInd(String sovlcurCurrentInd) {
        this.sovlcurCurrentInd = sovlcurCurrentInd;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    @JsonProperty("lmodCode")
    public String getLmodCode() {
        return lmodCode;
    }

    @JsonProperty("lmodCode")
    public void setLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
        return this;
    }

    @JsonProperty("keySeqno")
    public String getKeySeqno() {
        return keySeqno;
    }

    @JsonProperty("keySeqno")
    public void setKeySeqno(String keySeqno) {
        this.keySeqno = keySeqno;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withKeySeqno(String keySeqno) {
        this.keySeqno = keySeqno;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public String getTermCodeCtlg() {
        return termCodeCtlg;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public void setTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    @JsonProperty("gappSeqno")
    public String getGappSeqno() {
        return gappSeqno;
    }

    @JsonProperty("gappSeqno")
    public void setGappSeqno(String gappSeqno) {
        this.gappSeqno = gappSeqno;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withGappSeqno(String gappSeqno) {
        this.gappSeqno = gappSeqno;
        return this;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("leavFromDate")
    public String getLeavFromDate() {
        return leavFromDate;
    }

    @JsonProperty("leavFromDate")
    public void setLeavFromDate(String leavFromDate) {
        this.leavFromDate = leavFromDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLeavFromDate(String leavFromDate) {
        this.leavFromDate = leavFromDate;
        return this;
    }

    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("leavToDate")
    public String getLeavToDate() {
        return leavToDate;
    }

    @JsonProperty("leavToDate")
    public void setLeavToDate(String leavToDate) {
        this.leavToDate = leavToDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLeavToDate(String leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    @JsonProperty("sovlcurApplKeySeqno")
    public String getSovlcurApplKeySeqno() {
        return sovlcurApplKeySeqno;
    }

    @JsonProperty("sovlcurApplKeySeqno")
    public void setSovlcurApplKeySeqno(String sovlcurApplKeySeqno) {
        this.sovlcurApplKeySeqno = sovlcurApplKeySeqno;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSovlcurApplKeySeqno(String sovlcurApplKeySeqno) {
        this.sovlcurApplKeySeqno = sovlcurApplKeySeqno;
        return this;
    }

    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    @JsonProperty("expGradDate")
    public String getExpGradDate() {
        return expGradDate;
    }

    @JsonProperty("expGradDate")
    public void setExpGradDate(String expGradDate) {
        this.expGradDate = expGradDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withExpGradDate(String expGradDate) {
        this.expGradDate = expGradDate;
        return this;
    }

    @JsonProperty("termCodeMatric")
    public String getTermCodeMatric() {
        return termCodeMatric;
    }

    @JsonProperty("termCodeMatric")
    public void setTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
        return this;
    }

    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    @JsonProperty("leavCode")
    public String getLeavCode() {
        return leavCode;
    }

    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    @JsonProperty("acyrCode")
    public String getAcyrCode() {
        return acyrCode;
    }

    @JsonProperty("acyrCode")
    public void setAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public String getCurrentInd() {
        return currentInd;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public void setCurrentInd(String currentInd) {
        this.currentInd = currentInd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    @JsonProperty("sorlfosCactCode")
    public String getSorlfosCactCode() {
        return sorlfosCactCode;
    }

    @JsonProperty("sorlfosCactCode")
    public void setSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    @JsonProperty("sorlfosTermCode")
    public String getSorlfosTermCode() {
        return sorlfosTermCode;
    }

    @JsonProperty("sorlfosTermCode")
    public void setSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    @JsonProperty("sorlfosPriorityNo")
    public String getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(String sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosPriorityNo(String sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
        return this;
    }

    @JsonProperty("sorlfosTermCodeCtlg")
    public String getSorlfosTermCodeCtlg() {
        return sorlfosTermCodeCtlg;
    }

    @JsonProperty("sorlfosTermCodeCtlg")
    public void setSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
        return this;
    }

    @JsonProperty("sorlfosTermCodeEnd")
    public String getSorlfosTermCodeEnd() {
        return sorlfosTermCodeEnd;
    }

    @JsonProperty("sorlfosTermCodeEnd")
    public void setSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    @JsonProperty("sorlfosStartDate")
    public String getSorlfosStartDate() {
        return sorlfosStartDate;
    }

    @JsonProperty("sorlfosStartDate")
    public void setSorlfosStartDate(String sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosStartDate(String sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    @JsonProperty("sorlfosEndDate")
    public String getSorlfosEndDate() {
        return sorlfosEndDate;
    }

    @JsonProperty("sorlfosEndDate")
    public void setSorlfosEndDate(String sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withSorlfosEndDate(String sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
        return this;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public String getMajrCodeAttach() {
        return majrCodeAttach;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public void setMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
        return this;
    }

    @JsonProperty("lfosRolledInd")
    public String getLfosRolledInd() {
        return lfosRolledInd;
    }

    @JsonProperty("lfosRolledInd")
    public void setLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public String getTmstCode() {
        return tmstCode;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public void setTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("rstsEstsDate");
        sb.append('=');
        sb.append(((this.rstsEstsDate == null)?"<null>":this.rstsEstsDate));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("printBill");
        sb.append('=');
        sb.append(((this.printBill == null)?"<null>":this.printBill));
        sb.append(',');
        sb.append("printSchedule");
        sb.append('=');
        sb.append(((this.printSchedule == null)?"<null>":this.printSchedule));
        sb.append(',');
        sb.append("keyStudypath");
        sb.append('=');
        sb.append(((this.keyStudypath == null)?"<null>":this.keyStudypath));
        sb.append(',');
        sb.append("sovlcurCurrentInd");
        sb.append('=');
        sb.append(((this.sovlcurCurrentInd == null)?"<null>":this.sovlcurCurrentInd));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("lmodCode");
        sb.append('=');
        sb.append(((this.lmodCode == null)?"<null>":this.lmodCode));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("gappSeqno");
        sb.append('=');
        sb.append(((this.gappSeqno == null)?"<null>":this.gappSeqno));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("sovlcurApplKeySeqno");
        sb.append('=');
        sb.append(((this.sovlcurApplKeySeqno == null)?"<null>":this.sovlcurApplKeySeqno));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("expGradDate");
        sb.append('=');
        sb.append(((this.expGradDate == null)?"<null>":this.expGradDate));
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
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("acyrCode");
        sb.append('=');
        sb.append(((this.acyrCode == null)?"<null>":this.acyrCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("sorlfosCactCode");
        sb.append('=');
        sb.append(((this.sorlfosCactCode == null)?"<null>":this.sorlfosCactCode));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("sorlfosTermCode");
        sb.append('=');
        sb.append(((this.sorlfosTermCode == null)?"<null>":this.sorlfosTermCode));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("sorlfosTermCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeCtlg == null)?"<null>":this.sorlfosTermCodeCtlg));
        sb.append(',');
        sb.append("sorlfosTermCodeEnd");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeEnd == null)?"<null>":this.sorlfosTermCodeEnd));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("sorlfosStartDate");
        sb.append('=');
        sb.append(((this.sorlfosStartDate == null)?"<null>":this.sorlfosStartDate));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("sorlfosEndDate");
        sb.append('=');
        sb.append(((this.sorlfosEndDate == null)?"<null>":this.sorlfosEndDate));
        sb.append(',');
        sb.append("majrCodeAttach");
        sb.append('=');
        sb.append(((this.majrCodeAttach == null)?"<null>":this.majrCodeAttach));
        sb.append(',');
        sb.append("lfosRolledInd");
        sb.append('=');
        sb.append(((this.lfosRolledInd == null)?"<null>":this.lfosRolledInd));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeCtlg == null)? 0 :this.sorlfosTermCodeCtlg.hashCode()));
        result = ((result* 31)+((this.printBill == null)? 0 :this.printBill.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCode == null)? 0 :this.sorlfosTermCode.hashCode()));
        result = ((result* 31)+((this.sorlfosEndDate == null)? 0 :this.sorlfosEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.majrCodeAttach == null)? 0 :this.majrCodeAttach.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.sorlfosCactCode == null)? 0 :this.sorlfosCactCode.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.lmodCode == null)? 0 :this.lmodCode.hashCode()));
        result = ((result* 31)+((this.sovlcurApplKeySeqno == null)? 0 :this.sovlcurApplKeySeqno.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.sorlfosStartDate == null)? 0 :this.sorlfosStartDate.hashCode()));
        result = ((result* 31)+((this.termCodeMatric == null)? 0 :this.termCodeMatric.hashCode()));
        result = ((result* 31)+((this.lfosRolledInd == null)? 0 :this.lfosRolledInd.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.gappSeqno == null)? 0 :this.gappSeqno.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.expGradDate == null)? 0 :this.expGradDate.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeEnd == null)? 0 :this.sorlfosTermCodeEnd.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.printSchedule == null)? 0 :this.printSchedule.hashCode()));
        result = ((result* 31)+((this.sovlcurCurrentInd == null)? 0 :this.sovlcurCurrentInd.hashCode()));
        result = ((result* 31)+((this.keyStudypath == null)? 0 :this.keyStudypath.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        result = ((result* 31)+((this.acyrCode == null)? 0 :this.acyrCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.sorlfosPriorityNo == null)? 0 :this.sorlfosPriorityNo.hashCode()));
        result = ((result* 31)+((this.rstsEstsDate == null)? 0 :this.rstsEstsDate.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost) == false) {
            return false;
        }
        StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost rhs = ((StudentCourseRegistrationCurriculaFieldOfStudy100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sorlfosTermCodeCtlg == rhs.sorlfosTermCodeCtlg)||((this.sorlfosTermCodeCtlg!= null)&&this.sorlfosTermCodeCtlg.equals(rhs.sorlfosTermCodeCtlg))))&&((this.printBill == rhs.printBill)||((this.printBill!= null)&&this.printBill.equals(rhs.printBill))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sorlfosTermCode == rhs.sorlfosTermCode)||((this.sorlfosTermCode!= null)&&this.sorlfosTermCode.equals(rhs.sorlfosTermCode))))&&((this.sorlfosEndDate == rhs.sorlfosEndDate)||((this.sorlfosEndDate!= null)&&this.sorlfosEndDate.equals(rhs.sorlfosEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.majrCodeAttach == rhs.majrCodeAttach)||((this.majrCodeAttach!= null)&&this.majrCodeAttach.equals(rhs.majrCodeAttach))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.sorlfosCactCode == rhs.sorlfosCactCode)||((this.sorlfosCactCode!= null)&&this.sorlfosCactCode.equals(rhs.sorlfosCactCode))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.lmodCode == rhs.lmodCode)||((this.lmodCode!= null)&&this.lmodCode.equals(rhs.lmodCode))))&&((this.sovlcurApplKeySeqno == rhs.sovlcurApplKeySeqno)||((this.sovlcurApplKeySeqno!= null)&&this.sovlcurApplKeySeqno.equals(rhs.sovlcurApplKeySeqno))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.sorlfosStartDate == rhs.sorlfosStartDate)||((this.sorlfosStartDate!= null)&&this.sorlfosStartDate.equals(rhs.sorlfosStartDate))))&&((this.termCodeMatric == rhs.termCodeMatric)||((this.termCodeMatric!= null)&&this.termCodeMatric.equals(rhs.termCodeMatric))))&&((this.lfosRolledInd == rhs.lfosRolledInd)||((this.lfosRolledInd!= null)&&this.lfosRolledInd.equals(rhs.lfosRolledInd))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.gappSeqno == rhs.gappSeqno)||((this.gappSeqno!= null)&&this.gappSeqno.equals(rhs.gappSeqno))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.expGradDate == rhs.expGradDate)||((this.expGradDate!= null)&&this.expGradDate.equals(rhs.expGradDate))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.sorlfosTermCodeEnd == rhs.sorlfosTermCodeEnd)||((this.sorlfosTermCodeEnd!= null)&&this.sorlfosTermCodeEnd.equals(rhs.sorlfosTermCodeEnd))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.printSchedule == rhs.printSchedule)||((this.printSchedule!= null)&&this.printSchedule.equals(rhs.printSchedule))))&&((this.sovlcurCurrentInd == rhs.sovlcurCurrentInd)||((this.sovlcurCurrentInd!= null)&&this.sovlcurCurrentInd.equals(rhs.sovlcurCurrentInd))))&&((this.keyStudypath == rhs.keyStudypath)||((this.keyStudypath!= null)&&this.keyStudypath.equals(rhs.keyStudypath))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.rstsEstsDate == rhs.rstsEstsDate)||((this.rstsEstsDate!= null)&&this.rstsEstsDate.equals(rhs.rstsEstsDate))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
