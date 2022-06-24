
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "criteria.contHr",
    "criteria.longCourseTitle",
    "criteria.repeatCourseInd",
    "crseTitle",
    "criteria.seqNumb",
    "criteria.crseNumb",
    "criteria.subjCode",
    "criteria.collCode",
    "gchgCode",
    "criteria.regStartDate",
    "sessCode",
    "criteria.grdeCodeIncmpFinal",
    "id",
    "courseComment",
    "criteria.grdeCodeFinal",
    "stspKeySequence",
    "criteria.ptrmCode",
    "keyblckTermCode",
    "criteria.divsCode",
    "criteria.schdCode",
    "criteria.creditHours",
    "primaryLevlInd",
    "gcmtCode",
    "incompleteExtDate",
    "repeatCourseInd",
    "criteria.courseComment",
    "longCourseTitle",
    "criteria.crseTitle",
    "criteria.ceuInd",
    "divsCode",
    "collCode",
    "criteria.gcmtCode",
    "deptCode",
    "criteria.ptrmStartDate",
    "keyblckValidationCheck",
    "criteria.campCode",
    "criteria.deptCode",
    "criteria.regCompletionDate",
    "criteria.gchgCode",
    "criteria.incompleteExtDate",
    "criteria.finalGrdeChgDate",
    "ptrmStartDate",
    "criteria.hoursAttempted",
    "criteria.sessCode",
    "contHr",
    "criteria.stspKeySequence",
    "criteria.crn",
    "criteria.ptrmEndDate",
    "ptrmEndDate",
    "criteria.gmodCode"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100PutRequest {

    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("criteria.contHr")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CONT_HR")
    private Double criteriaContHr;
    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("criteria.longCourseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_LONG_COURSE_TITLE")
    private String criteriaLongCourseTitle;
    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("criteria.repeatCourseInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_COURSE_IND")
    private String criteriaRepeatCourseInd;
    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_TITLE")
    private String crseTitle;
    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.seqNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SEQ_NUMB")
    private String criteriaSeqNumb;
    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky")
    private String criteriaCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCode;
    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg")
    private String gchgCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("criteria.regStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_START_DATE")
    private Date criteriaRegStartDate;
    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String criteriaGrdeCodeIncmpFinal;
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
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("courseComment")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_COURSE_COMMENT")
    private String courseComment;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("criteria.grdeCodeFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_FINAL")
    private String criteriaGrdeCodeFinal;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP")
    private Double stspKeySequence;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String criteriaPtrmCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("criteria.divsCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs")
    private String criteriaDivsCode;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd")
    private String criteriaSchdCode;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("criteria.creditHours")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_CREDIT_HOURS")
    private Double criteriaCreditHours;
    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND")
    private String primaryLevlInd;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String gcmtCode;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE")
    private Date incompleteExtDate;
    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_COURSE_IND")
    private String repeatCourseInd;
    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("criteria.courseComment")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_COURSE_COMMENT")
    private String criteriaCourseComment;
    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_LONG_COURSE_TITLE")
    private String longCourseTitle;
    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("criteria.crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_TITLE")
    private String criteriaCrseTitle;
    /**
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ceuInd")
    private String criteriaCeuInd;
    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs")
    private String divsCode;
    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String criteriaGcmtCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_START_DATE")
    private Date criteriaPtrmStartDate;
    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    @JsonPropertyDescription("Lineage reference object : keyblckValidationCheck")
    private String keyblckValidationCheck;
    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("criteria.regCompletionDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_COMPLETION_DATE")
    private Date criteriaRegCompletionDate;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("criteria.gchgCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg")
    private String criteriaGchgCode;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE")
    private Date criteriaIncompleteExtDate;
    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("criteria.finalGrdeChgDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE")
    private Date criteriaFinalGrdeChgDate;
    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_START_DATE")
    private Date ptrmStartDate;
    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("criteria.hoursAttempted")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_HOURS_ATTEMPTED")
    private Double criteriaHoursAttempted;
    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String criteriaSessCode;
    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CONT_HR")
    private Double contHr;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP")
    private Double criteriaStspKeySequence;
    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRN")
    private String criteriaCrn;
    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_END_DATE")
    private Date criteriaPtrmEndDate;
    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_END_DATE")
    private Date ptrmEndDate;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GMOD_CODE")
    private String criteriaGmodCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("criteria.contHr")
    public Double getCriteriaContHr() {
        return criteriaContHr;
    }

    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("criteria.contHr")
    public void setCriteriaContHr(Double criteriaContHr) {
        this.criteriaContHr = criteriaContHr;
    }

    public CourseMaintenance100PutRequest withCriteriaContHr(Double criteriaContHr) {
        this.criteriaContHr = criteriaContHr;
        return this;
    }

    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("criteria.longCourseTitle")
    public String getCriteriaLongCourseTitle() {
        return criteriaLongCourseTitle;
    }

    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("criteria.longCourseTitle")
    public void setCriteriaLongCourseTitle(String criteriaLongCourseTitle) {
        this.criteriaLongCourseTitle = criteriaLongCourseTitle;
    }

    public CourseMaintenance100PutRequest withCriteriaLongCourseTitle(String criteriaLongCourseTitle) {
        this.criteriaLongCourseTitle = criteriaLongCourseTitle;
        return this;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("criteria.repeatCourseInd")
    public String getCriteriaRepeatCourseInd() {
        return criteriaRepeatCourseInd;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("criteria.repeatCourseInd")
    public void setCriteriaRepeatCourseInd(String criteriaRepeatCourseInd) {
        this.criteriaRepeatCourseInd = criteriaRepeatCourseInd;
    }

    public CourseMaintenance100PutRequest withCriteriaRepeatCourseInd(String criteriaRepeatCourseInd) {
        this.criteriaRepeatCourseInd = criteriaRepeatCourseInd;
        return this;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public String getCrseTitle() {
        return crseTitle;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public void setCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
    }

    public CourseMaintenance100PutRequest withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.seqNumb")
    public String getCriteriaSeqNumb() {
        return criteriaSeqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.seqNumb")
    public void setCriteriaSeqNumb(String criteriaSeqNumb) {
        this.criteriaSeqNumb = criteriaSeqNumb;
    }

    public CourseMaintenance100PutRequest withCriteriaSeqNumb(String criteriaSeqNumb) {
        this.criteriaSeqNumb = criteriaSeqNumb;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public CourseMaintenance100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public CourseMaintenance100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public CourseMaintenance100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public String getGchgCode() {
        return gchgCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public void setGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
    }

    public CourseMaintenance100PutRequest withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("criteria.regStartDate")
    public Date getCriteriaRegStartDate() {
        return criteriaRegStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("criteria.regStartDate")
    public void setCriteriaRegStartDate(Date criteriaRegStartDate) {
        this.criteriaRegStartDate = criteriaRegStartDate;
    }

    public CourseMaintenance100PutRequest withCriteriaRegStartDate(Date criteriaRegStartDate) {
        this.criteriaRegStartDate = criteriaRegStartDate;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public CourseMaintenance100PutRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    public String getCriteriaGrdeCodeIncmpFinal() {
        return criteriaGrdeCodeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    public void setCriteriaGrdeCodeIncmpFinal(String criteriaGrdeCodeIncmpFinal) {
        this.criteriaGrdeCodeIncmpFinal = criteriaGrdeCodeIncmpFinal;
    }

    public CourseMaintenance100PutRequest withCriteriaGrdeCodeIncmpFinal(String criteriaGrdeCodeIncmpFinal) {
        this.criteriaGrdeCodeIncmpFinal = criteriaGrdeCodeIncmpFinal;
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

    public CourseMaintenance100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("courseComment")
    public String getCourseComment() {
        return courseComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("courseComment")
    public void setCourseComment(String courseComment) {
        this.courseComment = courseComment;
    }

    public CourseMaintenance100PutRequest withCourseComment(String courseComment) {
        this.courseComment = courseComment;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("criteria.grdeCodeFinal")
    public String getCriteriaGrdeCodeFinal() {
        return criteriaGrdeCodeFinal;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("criteria.grdeCodeFinal")
    public void setCriteriaGrdeCodeFinal(String criteriaGrdeCodeFinal) {
        this.criteriaGrdeCodeFinal = criteriaGrdeCodeFinal;
    }

    public CourseMaintenance100PutRequest withCriteriaGrdeCodeFinal(String criteriaGrdeCodeFinal) {
        this.criteriaGrdeCodeFinal = criteriaGrdeCodeFinal;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public CourseMaintenance100PutRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public String getCriteriaPtrmCode() {
        return criteriaPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public void setCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
    }

    public CourseMaintenance100PutRequest withCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CourseMaintenance100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("criteria.divsCode")
    public String getCriteriaDivsCode() {
        return criteriaDivsCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("criteria.divsCode")
    public void setCriteriaDivsCode(String criteriaDivsCode) {
        this.criteriaDivsCode = criteriaDivsCode;
    }

    public CourseMaintenance100PutRequest withCriteriaDivsCode(String criteriaDivsCode) {
        this.criteriaDivsCode = criteriaDivsCode;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    public String getCriteriaSchdCode() {
        return criteriaSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    public void setCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
    }

    public CourseMaintenance100PutRequest withCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("criteria.creditHours")
    public Double getCriteriaCreditHours() {
        return criteriaCreditHours;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("criteria.creditHours")
    public void setCriteriaCreditHours(Double criteriaCreditHours) {
        this.criteriaCreditHours = criteriaCreditHours;
    }

    public CourseMaintenance100PutRequest withCriteriaCreditHours(Double criteriaCreditHours) {
        this.criteriaCreditHours = criteriaCreditHours;
        return this;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public String getPrimaryLevlInd() {
        return primaryLevlInd;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public void setPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
    }

    public CourseMaintenance100PutRequest withPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public CourseMaintenance100PutRequest withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public Date getIncompleteExtDate() {
        return incompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public void setIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
    }

    public CourseMaintenance100PutRequest withIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
        return this;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    public String getRepeatCourseInd() {
        return repeatCourseInd;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    public void setRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
    }

    public CourseMaintenance100PutRequest withRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("criteria.courseComment")
    public String getCriteriaCourseComment() {
        return criteriaCourseComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("criteria.courseComment")
    public void setCriteriaCourseComment(String criteriaCourseComment) {
        this.criteriaCourseComment = criteriaCourseComment;
    }

    public CourseMaintenance100PutRequest withCriteriaCourseComment(String criteriaCourseComment) {
        this.criteriaCourseComment = criteriaCourseComment;
        return this;
    }

    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public String getLongCourseTitle() {
        return longCourseTitle;
    }

    /**
     * Long Course Title
     * <p>
     * Lineage reference object : SHRTCKN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public void setLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
    }

    public CourseMaintenance100PutRequest withLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
        return this;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("criteria.crseTitle")
    public String getCriteriaCrseTitle() {
        return criteriaCrseTitle;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("criteria.crseTitle")
    public void setCriteriaCrseTitle(String criteriaCrseTitle) {
        this.criteriaCrseTitle = criteriaCrseTitle;
    }

    public CourseMaintenance100PutRequest withCriteriaCrseTitle(String criteriaCrseTitle) {
        this.criteriaCrseTitle = criteriaCrseTitle;
        return this;
    }

    /**
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ceuInd")
    public String getCriteriaCeuInd() {
        return criteriaCeuInd;
    }

    /**
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ceuInd")
    public void setCriteriaCeuInd(String criteriaCeuInd) {
        this.criteriaCeuInd = criteriaCeuInd;
    }

    public CourseMaintenance100PutRequest withCriteriaCeuInd(String criteriaCeuInd) {
        this.criteriaCeuInd = criteriaCeuInd;
        return this;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public String getDivsCode() {
        return divsCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public void setDivsCode(String divsCode) {
        this.divsCode = divsCode;
    }

    public CourseMaintenance100PutRequest withDivsCode(String divsCode) {
        this.divsCode = divsCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRTCKN_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CourseMaintenance100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public String getCriteriaGcmtCode() {
        return criteriaGcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public void setCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
    }

    public CourseMaintenance100PutRequest withCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public CourseMaintenance100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    public Date getCriteriaPtrmStartDate() {
        return criteriaPtrmStartDate;
    }

    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    public void setCriteriaPtrmStartDate(Date criteriaPtrmStartDate) {
        this.criteriaPtrmStartDate = criteriaPtrmStartDate;
    }

    public CourseMaintenance100PutRequest withCriteriaPtrmStartDate(Date criteriaPtrmStartDate) {
        this.criteriaPtrmStartDate = criteriaPtrmStartDate;
        return this;
    }

    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    public String getKeyblckValidationCheck() {
        return keyblckValidationCheck;
    }

    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    public void setKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
    }

    public CourseMaintenance100PutRequest withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public CourseMaintenance100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public CourseMaintenance100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("criteria.regCompletionDate")
    public Date getCriteriaRegCompletionDate() {
        return criteriaRegCompletionDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("criteria.regCompletionDate")
    public void setCriteriaRegCompletionDate(Date criteriaRegCompletionDate) {
        this.criteriaRegCompletionDate = criteriaRegCompletionDate;
    }

    public CourseMaintenance100PutRequest withCriteriaRegCompletionDate(Date criteriaRegCompletionDate) {
        this.criteriaRegCompletionDate = criteriaRegCompletionDate;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("criteria.gchgCode")
    public String getCriteriaGchgCode() {
        return criteriaGchgCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("criteria.gchgCode")
    public void setCriteriaGchgCode(String criteriaGchgCode) {
        this.criteriaGchgCode = criteriaGchgCode;
    }

    public CourseMaintenance100PutRequest withCriteriaGchgCode(String criteriaGchgCode) {
        this.criteriaGchgCode = criteriaGchgCode;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public Date getCriteriaIncompleteExtDate() {
        return criteriaIncompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public void setCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
    }

    public CourseMaintenance100PutRequest withCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
        return this;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("criteria.finalGrdeChgDate")
    public Date getCriteriaFinalGrdeChgDate() {
        return criteriaFinalGrdeChgDate;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("criteria.finalGrdeChgDate")
    public void setCriteriaFinalGrdeChgDate(Date criteriaFinalGrdeChgDate) {
        this.criteriaFinalGrdeChgDate = criteriaFinalGrdeChgDate;
    }

    public CourseMaintenance100PutRequest withCriteriaFinalGrdeChgDate(Date criteriaFinalGrdeChgDate) {
        this.criteriaFinalGrdeChgDate = criteriaFinalGrdeChgDate;
        return this;
    }

    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public Date getPtrmStartDate() {
        return ptrmStartDate;
    }

    /**
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public void setPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
    }

    public CourseMaintenance100PutRequest withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
        return this;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("criteria.hoursAttempted")
    public Double getCriteriaHoursAttempted() {
        return criteriaHoursAttempted;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("criteria.hoursAttempted")
    public void setCriteriaHoursAttempted(Double criteriaHoursAttempted) {
        this.criteriaHoursAttempted = criteriaHoursAttempted;
    }

    public CourseMaintenance100PutRequest withCriteriaHoursAttempted(Double criteriaHoursAttempted) {
        this.criteriaHoursAttempted = criteriaHoursAttempted;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public String getCriteriaSessCode() {
        return criteriaSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public void setCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
    }

    public CourseMaintenance100PutRequest withCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
        return this;
    }

    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public Double getContHr() {
        return contHr;
    }

    /**
     * Contact Hours
     * <p>
     * Lineage reference object : SHRTCKN_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public void setContHr(Double contHr) {
        this.contHr = contHr;
    }

    public CourseMaintenance100PutRequest withContHr(Double contHr) {
        this.contHr = contHr;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public Double getCriteriaStspKeySequence() {
        return criteriaStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public void setCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
    }

    public CourseMaintenance100PutRequest withCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public String getCriteriaCrn() {
        return criteriaCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public void setCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
    }

    public CourseMaintenance100PutRequest withCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
        return this;
    }

    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    public Date getCriteriaPtrmEndDate() {
        return criteriaPtrmEndDate;
    }

    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    public void setCriteriaPtrmEndDate(Date criteriaPtrmEndDate) {
        this.criteriaPtrmEndDate = criteriaPtrmEndDate;
    }

    public CourseMaintenance100PutRequest withCriteriaPtrmEndDate(Date criteriaPtrmEndDate) {
        this.criteriaPtrmEndDate = criteriaPtrmEndDate;
        return this;
    }

    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public Date getPtrmEndDate() {
        return ptrmEndDate;
    }

    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public void setPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
    }

    public CourseMaintenance100PutRequest withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public String getCriteriaGmodCode() {
        return criteriaGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public void setCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
    }

    public CourseMaintenance100PutRequest withCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
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

    public CourseMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaContHr");
        sb.append('=');
        sb.append(((this.criteriaContHr == null)?"<null>":this.criteriaContHr));
        sb.append(',');
        sb.append("criteriaLongCourseTitle");
        sb.append('=');
        sb.append(((this.criteriaLongCourseTitle == null)?"<null>":this.criteriaLongCourseTitle));
        sb.append(',');
        sb.append("criteriaRepeatCourseInd");
        sb.append('=');
        sb.append(((this.criteriaRepeatCourseInd == null)?"<null>":this.criteriaRepeatCourseInd));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("criteriaSeqNumb");
        sb.append('=');
        sb.append(((this.criteriaSeqNumb == null)?"<null>":this.criteriaSeqNumb));
        sb.append(',');
        sb.append("criteriaCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaCrseNumb == null)?"<null>":this.criteriaCrseNumb));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("criteriaRegStartDate");
        sb.append('=');
        sb.append(((this.criteriaRegStartDate == null)?"<null>":this.criteriaRegStartDate));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("criteriaGrdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeIncmpFinal == null)?"<null>":this.criteriaGrdeCodeIncmpFinal));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("courseComment");
        sb.append('=');
        sb.append(((this.courseComment == null)?"<null>":this.courseComment));
        sb.append(',');
        sb.append("criteriaGrdeCodeFinal");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeFinal == null)?"<null>":this.criteriaGrdeCodeFinal));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaDivsCode");
        sb.append('=');
        sb.append(((this.criteriaDivsCode == null)?"<null>":this.criteriaDivsCode));
        sb.append(',');
        sb.append("criteriaSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSchdCode == null)?"<null>":this.criteriaSchdCode));
        sb.append(',');
        sb.append("criteriaCreditHours");
        sb.append('=');
        sb.append(((this.criteriaCreditHours == null)?"<null>":this.criteriaCreditHours));
        sb.append(',');
        sb.append("primaryLevlInd");
        sb.append('=');
        sb.append(((this.primaryLevlInd == null)?"<null>":this.primaryLevlInd));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
        sb.append(',');
        sb.append("incompleteExtDate");
        sb.append('=');
        sb.append(((this.incompleteExtDate == null)?"<null>":this.incompleteExtDate));
        sb.append(',');
        sb.append("repeatCourseInd");
        sb.append('=');
        sb.append(((this.repeatCourseInd == null)?"<null>":this.repeatCourseInd));
        sb.append(',');
        sb.append("criteriaCourseComment");
        sb.append('=');
        sb.append(((this.criteriaCourseComment == null)?"<null>":this.criteriaCourseComment));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("criteriaCrseTitle");
        sb.append('=');
        sb.append(((this.criteriaCrseTitle == null)?"<null>":this.criteriaCrseTitle));
        sb.append(',');
        sb.append("criteriaCeuInd");
        sb.append('=');
        sb.append(((this.criteriaCeuInd == null)?"<null>":this.criteriaCeuInd));
        sb.append(',');
        sb.append("divsCode");
        sb.append('=');
        sb.append(((this.divsCode == null)?"<null>":this.divsCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("criteriaGcmtCode");
        sb.append('=');
        sb.append(((this.criteriaGcmtCode == null)?"<null>":this.criteriaGcmtCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("criteriaPtrmStartDate");
        sb.append('=');
        sb.append(((this.criteriaPtrmStartDate == null)?"<null>":this.criteriaPtrmStartDate));
        sb.append(',');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("criteriaRegCompletionDate");
        sb.append('=');
        sb.append(((this.criteriaRegCompletionDate == null)?"<null>":this.criteriaRegCompletionDate));
        sb.append(',');
        sb.append("criteriaGchgCode");
        sb.append('=');
        sb.append(((this.criteriaGchgCode == null)?"<null>":this.criteriaGchgCode));
        sb.append(',');
        sb.append("criteriaIncompleteExtDate");
        sb.append('=');
        sb.append(((this.criteriaIncompleteExtDate == null)?"<null>":this.criteriaIncompleteExtDate));
        sb.append(',');
        sb.append("criteriaFinalGrdeChgDate");
        sb.append('=');
        sb.append(((this.criteriaFinalGrdeChgDate == null)?"<null>":this.criteriaFinalGrdeChgDate));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("criteriaHoursAttempted");
        sb.append('=');
        sb.append(((this.criteriaHoursAttempted == null)?"<null>":this.criteriaHoursAttempted));
        sb.append(',');
        sb.append("criteriaSessCode");
        sb.append('=');
        sb.append(((this.criteriaSessCode == null)?"<null>":this.criteriaSessCode));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaCrn");
        sb.append('=');
        sb.append(((this.criteriaCrn == null)?"<null>":this.criteriaCrn));
        sb.append(',');
        sb.append("criteriaPtrmEndDate");
        sb.append('=');
        sb.append(((this.criteriaPtrmEndDate == null)?"<null>":this.criteriaPtrmEndDate));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
        sb.append(',');
        sb.append("criteriaGmodCode");
        sb.append('=');
        sb.append(((this.criteriaGmodCode == null)?"<null>":this.criteriaGmodCode));
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
        result = ((result* 31)+((this.criteriaPtrmCode == null)? 0 :this.criteriaPtrmCode.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.criteriaRegCompletionDate == null)? 0 :this.criteriaRegCompletionDate.hashCode()));
        result = ((result* 31)+((this.criteriaHoursAttempted == null)? 0 :this.criteriaHoursAttempted.hashCode()));
        result = ((result* 31)+((this.criteriaCeuInd == null)? 0 :this.criteriaCeuInd.hashCode()));
        result = ((result* 31)+((this.gchgCode == null)? 0 :this.gchgCode.hashCode()));
        result = ((result* 31)+((this.criteriaFinalGrdeChgDate == null)? 0 :this.criteriaFinalGrdeChgDate.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.criteriaCourseComment == null)? 0 :this.criteriaCourseComment.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.courseComment == null)? 0 :this.courseComment.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.criteriaCreditHours == null)? 0 :this.criteriaCreditHours.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaRegStartDate == null)? 0 :this.criteriaRegStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCode == null)? 0 :this.criteriaGmodCode.hashCode()));
        result = ((result* 31)+((this.primaryLevlInd == null)? 0 :this.primaryLevlInd.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNumb == null)? 0 :this.criteriaSeqNumb.hashCode()));
        result = ((result* 31)+((this.incompleteExtDate == null)? 0 :this.incompleteExtDate.hashCode()));
        result = ((result* 31)+((this.repeatCourseInd == null)? 0 :this.repeatCourseInd.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.criteriaIncompleteExtDate == null)? 0 :this.criteriaIncompleteExtDate.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.keyblckValidationCheck == null)? 0 :this.keyblckValidationCheck.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeFinal == null)? 0 :this.criteriaGrdeCodeFinal.hashCode()));
        result = ((result* 31)+((this.criteriaSessCode == null)? 0 :this.criteriaSessCode.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCode == null)? 0 :this.criteriaSchdCode.hashCode()));
        result = ((result* 31)+((this.criteriaContHr == null)? 0 :this.criteriaContHr.hashCode()));
        result = ((result* 31)+((this.criteriaRepeatCourseInd == null)? 0 :this.criteriaRepeatCourseInd.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmStartDate == null)? 0 :this.criteriaPtrmStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaGchgCode == null)? 0 :this.criteriaGchgCode.hashCode()));
        result = ((result* 31)+((this.criteriaLongCourseTitle == null)? 0 :this.criteriaLongCourseTitle.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaCrseTitle == null)? 0 :this.criteriaCrseTitle.hashCode()));
        result = ((result* 31)+((this.criteriaGcmtCode == null)? 0 :this.criteriaGcmtCode.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaDivsCode == null)? 0 :this.criteriaDivsCode.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmEndDate == null)? 0 :this.criteriaPtrmEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeIncmpFinal == null)? 0 :this.criteriaGrdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseMaintenance100PutRequest) == false) {
            return false;
        }
        CourseMaintenance100PutRequest rhs = ((CourseMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.criteriaRegCompletionDate == rhs.criteriaRegCompletionDate)||((this.criteriaRegCompletionDate!= null)&&this.criteriaRegCompletionDate.equals(rhs.criteriaRegCompletionDate))))&&((this.criteriaHoursAttempted == rhs.criteriaHoursAttempted)||((this.criteriaHoursAttempted!= null)&&this.criteriaHoursAttempted.equals(rhs.criteriaHoursAttempted))))&&((this.criteriaCeuInd == rhs.criteriaCeuInd)||((this.criteriaCeuInd!= null)&&this.criteriaCeuInd.equals(rhs.criteriaCeuInd))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.criteriaFinalGrdeChgDate == rhs.criteriaFinalGrdeChgDate)||((this.criteriaFinalGrdeChgDate!= null)&&this.criteriaFinalGrdeChgDate.equals(rhs.criteriaFinalGrdeChgDate))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.criteriaCourseComment == rhs.criteriaCourseComment)||((this.criteriaCourseComment!= null)&&this.criteriaCourseComment.equals(rhs.criteriaCourseComment))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.courseComment == rhs.courseComment)||((this.courseComment!= null)&&this.courseComment.equals(rhs.courseComment))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.criteriaCreditHours == rhs.criteriaCreditHours)||((this.criteriaCreditHours!= null)&&this.criteriaCreditHours.equals(rhs.criteriaCreditHours))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaRegStartDate == rhs.criteriaRegStartDate)||((this.criteriaRegStartDate!= null)&&this.criteriaRegStartDate.equals(rhs.criteriaRegStartDate))))&&((this.criteriaGmodCode == rhs.criteriaGmodCode)||((this.criteriaGmodCode!= null)&&this.criteriaGmodCode.equals(rhs.criteriaGmodCode))))&&((this.primaryLevlInd == rhs.primaryLevlInd)||((this.primaryLevlInd!= null)&&this.primaryLevlInd.equals(rhs.primaryLevlInd))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.criteriaSeqNumb == rhs.criteriaSeqNumb)||((this.criteriaSeqNumb!= null)&&this.criteriaSeqNumb.equals(rhs.criteriaSeqNumb))))&&((this.incompleteExtDate == rhs.incompleteExtDate)||((this.incompleteExtDate!= null)&&this.incompleteExtDate.equals(rhs.incompleteExtDate))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.criteriaIncompleteExtDate == rhs.criteriaIncompleteExtDate)||((this.criteriaIncompleteExtDate!= null)&&this.criteriaIncompleteExtDate.equals(rhs.criteriaIncompleteExtDate))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck))))&&((this.criteriaGrdeCodeFinal == rhs.criteriaGrdeCodeFinal)||((this.criteriaGrdeCodeFinal!= null)&&this.criteriaGrdeCodeFinal.equals(rhs.criteriaGrdeCodeFinal))))&&((this.criteriaSessCode == rhs.criteriaSessCode)||((this.criteriaSessCode!= null)&&this.criteriaSessCode.equals(rhs.criteriaSessCode))))&&((this.criteriaSchdCode == rhs.criteriaSchdCode)||((this.criteriaSchdCode!= null)&&this.criteriaSchdCode.equals(rhs.criteriaSchdCode))))&&((this.criteriaContHr == rhs.criteriaContHr)||((this.criteriaContHr!= null)&&this.criteriaContHr.equals(rhs.criteriaContHr))))&&((this.criteriaRepeatCourseInd == rhs.criteriaRepeatCourseInd)||((this.criteriaRepeatCourseInd!= null)&&this.criteriaRepeatCourseInd.equals(rhs.criteriaRepeatCourseInd))))&&((this.criteriaPtrmStartDate == rhs.criteriaPtrmStartDate)||((this.criteriaPtrmStartDate!= null)&&this.criteriaPtrmStartDate.equals(rhs.criteriaPtrmStartDate))))&&((this.criteriaGchgCode == rhs.criteriaGchgCode)||((this.criteriaGchgCode!= null)&&this.criteriaGchgCode.equals(rhs.criteriaGchgCode))))&&((this.criteriaLongCourseTitle == rhs.criteriaLongCourseTitle)||((this.criteriaLongCourseTitle!= null)&&this.criteriaLongCourseTitle.equals(rhs.criteriaLongCourseTitle))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.criteriaCrseTitle == rhs.criteriaCrseTitle)||((this.criteriaCrseTitle!= null)&&this.criteriaCrseTitle.equals(rhs.criteriaCrseTitle))))&&((this.criteriaGcmtCode == rhs.criteriaGcmtCode)||((this.criteriaGcmtCode!= null)&&this.criteriaGcmtCode.equals(rhs.criteriaGcmtCode))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaDivsCode == rhs.criteriaDivsCode)||((this.criteriaDivsCode!= null)&&this.criteriaDivsCode.equals(rhs.criteriaDivsCode))))&&((this.criteriaPtrmEndDate == rhs.criteriaPtrmEndDate)||((this.criteriaPtrmEndDate!= null)&&this.criteriaPtrmEndDate.equals(rhs.criteriaPtrmEndDate))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaGrdeCodeIncmpFinal == rhs.criteriaGrdeCodeIncmpFinal)||((this.criteriaGrdeCodeIncmpFinal!= null)&&this.criteriaGrdeCodeIncmpFinal.equals(rhs.criteriaGrdeCodeIncmpFinal))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))));
    }

}
