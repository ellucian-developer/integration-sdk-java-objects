
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
    "leavCode",
    "endDate",
    "sorlfosTermCodeCtlg",
    "printBill",
    "program",
    "degcCode",
    "viewCurrent",
    "majrCode",
    "lfstCode",
    "holdPassword",
    "campCode",
    "sorlfosTermCode",
    "sorlfosEndDate",
    "id",
    "cstsCode",
    "cactCode",
    "majrCodeAttach",
    "leavFromDate",
    "sorlfosCactCode",
    "currentInd",
    "lmodCode",
    "sovlcurApplKeySeqno",
    "collCode",
    "levlCode",
    "startDate",
    "deptCode",
    "sorlfosStartDate",
    "termCodeMatric",
    "lfosRolledInd",
    "rateCode",
    "termCodeGrad",
    "gappSeqno",
    "admtCode",
    "activityDate",
    "priorityNo",
    "leavToDate",
    "term",
    "expGradDate",
    "termCodeCtlg",
    "siteCode",
    "sorlfosTermCodeEnd",
    "tmstCode",
    "printSchedule",
    "sovlcurCurrentInd",
    "keyStudypath",
    "termCodeEnd",
    "userId",
    "keySeqno",
    "acyrCode",
    "termCodeAdmit",
    "sorlfosPriorityNo",
    "rstsEstsDate",
    "stypCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest {

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
    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String sorlfosTermCodeCtlg;
    /**
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    @JsonPropertyDescription("Lineage reference object : printBill")
    private String printBill;
    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    @JsonPropertyDescription("Lineage reference object : viewCurrent")
    private String viewCurrent;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String majrCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private String holdPassword;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm")
    private String sorlfosTermCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_END_DATE")
    private Date sorlfosEndDate;
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
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
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
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String majrCodeAttach;
    /**
     * Leave From Date
     * <p>
     * Lineage reference object : SOVLCUR_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("leavFromDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEAV_FROM_DATE")
    private Date leavFromDate;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String sorlfosCactCode;
    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CURRENT_IND")
    private String currentInd;
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
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_START_DATE")
    private Date sorlfosStartDate;
    /**
     * Matriculated Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm")
    private String termCodeMatric;
    @JsonProperty("lfosRolledInd")
    private String lfosRolledInd;
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
     * Admission Type
     * <p>
     * Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
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
    /**
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("Lineage reference object : term, Lookup lineage reference object : stvterm")
    private String term;
    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SOVLCUR_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("expGradDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_EXP_GRAD_DATE")
    private Date expGradDate;
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
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String sorlfosTermCodeEnd;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    @JsonPropertyDescription("Lineage reference object : printSchedule")
    private String printSchedule;
    /**
     * Lineage reference object : SOVLCUR_CURRENT_IND
     * 
     */
    @JsonProperty("sovlcurCurrentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CURRENT_IND")
    private String sovlcurCurrentInd;
    /**
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    @JsonPropertyDescription("Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur")
    private Double keyStudypath;
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
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double sorlfosPriorityNo;
    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    @JsonPropertyDescription("Lineage reference object : rstsEstsDate")
    private Date rstsEstsDate;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLeavCode(String leavCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    public String getSorlfosTermCodeCtlg() {
        return sorlfosTermCodeCtlg;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    public void setSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
        return this;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    public String getPrintBill() {
        return printBill;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    public void setPrintBill(String printBill) {
        this.printBill = printBill;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withPrintBill(String printBill) {
        this.printBill = printBill;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withProgram(String program) {
        this.program = program;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public String getViewCurrent() {
        return viewCurrent;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public void setViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    public String getSorlfosTermCode() {
        return sorlfosTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    public void setSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    public Date getSorlfosEndDate() {
        return sorlfosEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    public void setSorlfosEndDate(Date sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosEndDate(Date sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withId(String id) {
        this.id = id;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withCactCode(String cactCode) {
        this.cactCode = cactCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLeavFromDate(Date leavFromDate) {
        this.leavFromDate = leavFromDate;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    public String getSorlfosCactCode() {
        return sorlfosCactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    public void setSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSovlcurApplKeySeqno(Double sovlcurApplKeySeqno) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withCollCode(String collCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLevlCode(String levlCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    public Date getSorlfosStartDate() {
        return sorlfosStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    public void setSorlfosStartDate(Date sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosStartDate(Date sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withRateCode(String rateCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCodeGrad(String termCodeGrad) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withGappSeqno(Double gappSeqno) {
        this.gappSeqno = gappSeqno;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withPriorityNo(Double priorityNo) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withLeavToDate(Date leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTerm(String term) {
        this.term = term;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withExpGradDate(Date expGradDate) {
        this.expGradDate = expGradDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCodeCtlg(String termCodeCtlg) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    public String getSorlfosTermCodeEnd() {
        return sorlfosTermCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    public void setSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
        return this;
    }

    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    public String getPrintSchedule() {
        return printSchedule;
    }

    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    public void setPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSovlcurCurrentInd(String sovlcurCurrentInd) {
        this.sovlcurCurrentInd = sovlcurCurrentInd;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    public Double getKeyStudypath() {
        return keyStudypath;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    public void setKeyStudypath(Double keyStudypath) {
        this.keyStudypath = keyStudypath;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withKeyStudypath(Double keyStudypath) {
        this.keyStudypath = keyStudypath;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCodeEnd(String termCodeEnd) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withUserId(String userId) {
        this.userId = userId;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withKeySeqno(Double keySeqno) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withAcyrCode(String acyrCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public Double getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    public Date getRstsEstsDate() {
        return rstsEstsDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    public void setRstsEstsDate(Date rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
    }

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withRstsEstsDate(Date rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withTermCode(String termCode) {
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

    public StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sorlfosTermCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeCtlg == null)?"<null>":this.sorlfosTermCodeCtlg));
        sb.append(',');
        sb.append("printBill");
        sb.append('=');
        sb.append(((this.printBill == null)?"<null>":this.printBill));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("sorlfosTermCode");
        sb.append('=');
        sb.append(((this.sorlfosTermCode == null)?"<null>":this.sorlfosTermCode));
        sb.append(',');
        sb.append("sorlfosEndDate");
        sb.append('=');
        sb.append(((this.sorlfosEndDate == null)?"<null>":this.sorlfosEndDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("majrCodeAttach");
        sb.append('=');
        sb.append(((this.majrCodeAttach == null)?"<null>":this.majrCodeAttach));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("sorlfosCactCode");
        sb.append('=');
        sb.append(((this.sorlfosCactCode == null)?"<null>":this.sorlfosCactCode));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("lmodCode");
        sb.append('=');
        sb.append(((this.lmodCode == null)?"<null>":this.lmodCode));
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
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("sorlfosStartDate");
        sb.append('=');
        sb.append(((this.sorlfosStartDate == null)?"<null>":this.sorlfosStartDate));
        sb.append(',');
        sb.append("termCodeMatric");
        sb.append('=');
        sb.append(((this.termCodeMatric == null)?"<null>":this.termCodeMatric));
        sb.append(',');
        sb.append("lfosRolledInd");
        sb.append('=');
        sb.append(((this.lfosRolledInd == null)?"<null>":this.lfosRolledInd));
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
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("expGradDate");
        sb.append('=');
        sb.append(((this.expGradDate == null)?"<null>":this.expGradDate));
        sb.append(',');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("sorlfosTermCodeEnd");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeEnd == null)?"<null>":this.sorlfosTermCodeEnd));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
        sb.append(',');
        sb.append("printSchedule");
        sb.append('=');
        sb.append(((this.printSchedule == null)?"<null>":this.printSchedule));
        sb.append(',');
        sb.append("sovlcurCurrentInd");
        sb.append('=');
        sb.append(((this.sovlcurCurrentInd == null)?"<null>":this.sovlcurCurrentInd));
        sb.append(',');
        sb.append("keyStudypath");
        sb.append('=');
        sb.append(((this.keyStudypath == null)?"<null>":this.keyStudypath));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("rstsEstsDate");
        sb.append('=');
        sb.append(((this.rstsEstsDate == null)?"<null>":this.rstsEstsDate));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
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
        if ((other instanceof StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest) == false) {
            return false;
        }
        StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest rhs = ((StudentCourseRegistrationCurriculaFieldOfStudy100GetRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sorlfosTermCodeCtlg == rhs.sorlfosTermCodeCtlg)||((this.sorlfosTermCodeCtlg!= null)&&this.sorlfosTermCodeCtlg.equals(rhs.sorlfosTermCodeCtlg))))&&((this.printBill == rhs.printBill)||((this.printBill!= null)&&this.printBill.equals(rhs.printBill))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sorlfosTermCode == rhs.sorlfosTermCode)||((this.sorlfosTermCode!= null)&&this.sorlfosTermCode.equals(rhs.sorlfosTermCode))))&&((this.sorlfosEndDate == rhs.sorlfosEndDate)||((this.sorlfosEndDate!= null)&&this.sorlfosEndDate.equals(rhs.sorlfosEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.majrCodeAttach == rhs.majrCodeAttach)||((this.majrCodeAttach!= null)&&this.majrCodeAttach.equals(rhs.majrCodeAttach))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.sorlfosCactCode == rhs.sorlfosCactCode)||((this.sorlfosCactCode!= null)&&this.sorlfosCactCode.equals(rhs.sorlfosCactCode))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.lmodCode == rhs.lmodCode)||((this.lmodCode!= null)&&this.lmodCode.equals(rhs.lmodCode))))&&((this.sovlcurApplKeySeqno == rhs.sovlcurApplKeySeqno)||((this.sovlcurApplKeySeqno!= null)&&this.sovlcurApplKeySeqno.equals(rhs.sovlcurApplKeySeqno))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.sorlfosStartDate == rhs.sorlfosStartDate)||((this.sorlfosStartDate!= null)&&this.sorlfosStartDate.equals(rhs.sorlfosStartDate))))&&((this.termCodeMatric == rhs.termCodeMatric)||((this.termCodeMatric!= null)&&this.termCodeMatric.equals(rhs.termCodeMatric))))&&((this.lfosRolledInd == rhs.lfosRolledInd)||((this.lfosRolledInd!= null)&&this.lfosRolledInd.equals(rhs.lfosRolledInd))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.gappSeqno == rhs.gappSeqno)||((this.gappSeqno!= null)&&this.gappSeqno.equals(rhs.gappSeqno))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.expGradDate == rhs.expGradDate)||((this.expGradDate!= null)&&this.expGradDate.equals(rhs.expGradDate))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.sorlfosTermCodeEnd == rhs.sorlfosTermCodeEnd)||((this.sorlfosTermCodeEnd!= null)&&this.sorlfosTermCodeEnd.equals(rhs.sorlfosTermCodeEnd))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.printSchedule == rhs.printSchedule)||((this.printSchedule!= null)&&this.printSchedule.equals(rhs.printSchedule))))&&((this.sovlcurCurrentInd == rhs.sovlcurCurrentInd)||((this.sovlcurCurrentInd!= null)&&this.sovlcurCurrentInd.equals(rhs.sovlcurCurrentInd))))&&((this.keyStudypath == rhs.keyStudypath)||((this.keyStudypath!= null)&&this.keyStudypath.equals(rhs.keyStudypath))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.rstsEstsDate == rhs.rstsEstsDate)||((this.rstsEstsDate!= null)&&this.rstsEstsDate.equals(rhs.rstsEstsDate))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
