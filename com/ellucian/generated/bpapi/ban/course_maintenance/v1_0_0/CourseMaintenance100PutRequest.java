
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
    "criteria.campCodeDesc",
    "divsDesc",
    "criteria.subjCode",
    "criteria.subjCodeDesc",
    "criteria.collCode",
    "criteria.regStartDate",
    "schdCode",
    "sessCode",
    "criteria.repeatDesc",
    "campCode",
    "campCodeDesc",
    "numberOfExtensions",
    "deptDesc",
    "id",
    "courseComment",
    "criteria.schdCodeDesc",
    "criteria.sessDesc",
    "regStartDate",
    "criteria.repeatSysInd",
    "stspKeySequence",
    "criteria.ptrmCodeDesc",
    "criteria.ptrmCode",
    "subjCode",
    "keyblckTermCode",
    "criteria.divsCode",
    "criteria.schdCode",
    "crseNumb",
    "ptrmCode",
    "subjCodeDesc",
    "repeatCourseInd",
    "criteria.courseComment",
    "seqNumb",
    "longCourseTitle",
    "ceuInd",
    "ptrmCodeDesc",
    "criteria.crseTitle",
    "criteria.ceuInd",
    "divsCode",
    "collCode",
    "criteria.numberOfExtensions",
    "deptCode",
    "criteria.ptrmStartDate",
    "criteria.campCode",
    "criteria.deptCode",
    "sessDesc",
    "criteria.regCompletionDate",
    "regCompletionDate",
    "repeatSysInd",
    "collDesc",
    "repeatDesc",
    "crn",
    "ptrmStartDate",
    "criteria.sessCode",
    "contHr",
    "schdCodeDesc",
    "criteria.stspKeySequence",
    "criteria.collDesc",
    "criteria.deptDesc",
    "criteria.divsDesc",
    "criteria.crn",
    "criteria.ptrmEndDate",
    "ptrmEndDate"
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
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    private String criteriaCampCodeDesc;
    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("divsDesc")
    private String divsDesc;
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
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCodeDesc")
    private String criteriaSubjCodeDesc;
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
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("criteria.regStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_START_DATE")
    private Date criteriaRegStartDate;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd")
    private String schdCode;
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
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.repeatDesc")
    private String criteriaRepeatDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    private String campCodeDesc;
    /**
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS")
    private Double numberOfExtensions;
    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    private String deptDesc;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    private String criteriaSchdCodeDesc;
    /**
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessDesc")
    private String criteriaSessDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("regStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_START_DATE")
    private Date regStartDate;
    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("criteria.repeatSysInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_SYS_IND")
    private String criteriaRepeatSysInd;
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
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ptrmCodeDesc")
    private String criteriaPtrmCodeDesc;
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
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
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
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky")
    private String crseNumb;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCodeDesc")
    private String subjCodeDesc;
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
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SEQ_NUMB")
    private String seqNumb;
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
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("ceuInd")
    private String ceuInd;
    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCodeDesc")
    private String ptrmCodeDesc;
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
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("criteria.numberOfExtensions")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS")
    private Double criteriaNumberOfExtensions;
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
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sessDesc")
    private String sessDesc;
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
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("regCompletionDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_COMPLETION_DATE")
    private Date regCompletionDate;
    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("repeatSysInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_SYS_IND")
    private String repeatSysInd;
    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    private String collDesc;
    /**
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("repeatDesc")
    private String repeatDesc;
    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRN")
    private String crn;
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
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    private String schdCodeDesc;
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
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDesc")
    private String criteriaCollDesc;
    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.deptDesc")
    private String criteriaDeptDesc;
    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.divsDesc")
    private String criteriaDivsDesc;
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
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    public String getCriteriaCampCodeDesc() {
        return criteriaCampCodeDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    public void setCriteriaCampCodeDesc(String criteriaCampCodeDesc) {
        this.criteriaCampCodeDesc = criteriaCampCodeDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaCampCodeDesc(String criteriaCampCodeDesc) {
        this.criteriaCampCodeDesc = criteriaCampCodeDesc;
        return this;
    }

    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("divsDesc")
    public String getDivsDesc() {
        return divsDesc;
    }

    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("divsDesc")
    public void setDivsDesc(String divsDesc) {
        this.divsDesc = divsDesc;
    }

    public CourseMaintenance100PutRequest withDivsDesc(String divsDesc) {
        this.divsDesc = divsDesc;
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
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCodeDesc")
    public String getCriteriaSubjCodeDesc() {
        return criteriaSubjCodeDesc;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCodeDesc")
    public void setCriteriaSubjCodeDesc(String criteriaSubjCodeDesc) {
        this.criteriaSubjCodeDesc = criteriaSubjCodeDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaSubjCodeDesc(String criteriaSubjCodeDesc) {
        this.criteriaSubjCodeDesc = criteriaSubjCodeDesc;
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
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SHRTCKN_SCHD_CODE, Lookup lineage reference object : stvschd,SELECT,stvschd_desc,NULL,scrschd_activity_date,FROM,stvschd,scrschd
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public CourseMaintenance100PutRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.repeatDesc")
    public String getCriteriaRepeatDesc() {
        return criteriaRepeatDesc;
    }

    /**
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.repeatDesc")
    public void setCriteriaRepeatDesc(String criteriaRepeatDesc) {
        this.criteriaRepeatDesc = criteriaRepeatDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaRepeatDesc(String criteriaRepeatDesc) {
        this.criteriaRepeatDesc = criteriaRepeatDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CourseMaintenance100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    public String getCampCodeDesc() {
        return campCodeDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    public void setCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
    }

    public CourseMaintenance100PutRequest withCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    public Double getNumberOfExtensions() {
        return numberOfExtensions;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    public void setNumberOfExtensions(Double numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
    }

    public CourseMaintenance100PutRequest withNumberOfExtensions(Double numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
        return this;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public CourseMaintenance100PutRequest withDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CourseMaintenance100PutRequest withId(Object id) {
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
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    public String getCriteriaSchdCodeDesc() {
        return criteriaSchdCodeDesc;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    public void setCriteriaSchdCodeDesc(String criteriaSchdCodeDesc) {
        this.criteriaSchdCodeDesc = criteriaSchdCodeDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaSchdCodeDesc(String criteriaSchdCodeDesc) {
        this.criteriaSchdCodeDesc = criteriaSchdCodeDesc;
        return this;
    }

    /**
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessDesc")
    public String getCriteriaSessDesc() {
        return criteriaSessDesc;
    }

    /**
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessDesc")
    public void setCriteriaSessDesc(String criteriaSessDesc) {
        this.criteriaSessDesc = criteriaSessDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaSessDesc(String criteriaSessDesc) {
        this.criteriaSessDesc = criteriaSessDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("regStartDate")
    public Date getRegStartDate() {
        return regStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("regStartDate")
    public void setRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
    }

    public CourseMaintenance100PutRequest withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("criteria.repeatSysInd")
    public String getCriteriaRepeatSysInd() {
        return criteriaRepeatSysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("criteria.repeatSysInd")
    public void setCriteriaRepeatSysInd(String criteriaRepeatSysInd) {
        this.criteriaRepeatSysInd = criteriaRepeatSysInd;
    }

    public CourseMaintenance100PutRequest withCriteriaRepeatSysInd(String criteriaRepeatSysInd) {
        this.criteriaRepeatSysInd = criteriaRepeatSysInd;
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
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ptrmCodeDesc")
    public String getCriteriaPtrmCodeDesc() {
        return criteriaPtrmCodeDesc;
    }

    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ptrmCodeDesc")
    public void setCriteriaPtrmCodeDesc(String criteriaPtrmCodeDesc) {
        this.criteriaPtrmCodeDesc = criteriaPtrmCodeDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaPtrmCodeDesc(String criteriaPtrmCodeDesc) {
        this.criteriaPtrmCodeDesc = criteriaPtrmCodeDesc;
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
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CourseMaintenance100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CourseMaintenance100PutRequest withKeyblckTermCode(Object keyblckTermCode) {
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
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB, Lookup lineage reference object : scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CourseMaintenance100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public CourseMaintenance100PutRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCodeDesc")
    public String getSubjCodeDesc() {
        return subjCodeDesc;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCodeDesc")
    public void setSubjCodeDesc(String subjCodeDesc) {
        this.subjCodeDesc = subjCodeDesc;
    }

    public CourseMaintenance100PutRequest withSubjCodeDesc(String subjCodeDesc) {
        this.subjCodeDesc = subjCodeDesc;
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
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public CourseMaintenance100PutRequest withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
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
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("ceuInd")
    public String getCeuInd() {
        return ceuInd;
    }

    /**
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("ceuInd")
    public void setCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
    }

    public CourseMaintenance100PutRequest withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
        return this;
    }

    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCodeDesc")
    public String getPtrmCodeDesc() {
        return ptrmCodeDesc;
    }

    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCodeDesc")
    public void setPtrmCodeDesc(String ptrmCodeDesc) {
        this.ptrmCodeDesc = ptrmCodeDesc;
    }

    public CourseMaintenance100PutRequest withPtrmCodeDesc(String ptrmCodeDesc) {
        this.ptrmCodeDesc = ptrmCodeDesc;
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
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("criteria.numberOfExtensions")
    public Double getCriteriaNumberOfExtensions() {
        return criteriaNumberOfExtensions;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SHRTCKN_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("criteria.numberOfExtensions")
    public void setCriteriaNumberOfExtensions(Double criteriaNumberOfExtensions) {
        this.criteriaNumberOfExtensions = criteriaNumberOfExtensions;
    }

    public CourseMaintenance100PutRequest withCriteriaNumberOfExtensions(Double criteriaNumberOfExtensions) {
        this.criteriaNumberOfExtensions = criteriaNumberOfExtensions;
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
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sessDesc")
    public String getSessDesc() {
        return sessDesc;
    }

    /**
     * Session Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sessDesc")
    public void setSessDesc(String sessDesc) {
        this.sessDesc = sessDesc;
    }

    public CourseMaintenance100PutRequest withSessDesc(String sessDesc) {
        this.sessDesc = sessDesc;
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
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("regCompletionDate")
    public Date getRegCompletionDate() {
        return regCompletionDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_COMPLETION_DATE
     * 
     */
    @JsonProperty("regCompletionDate")
    public void setRegCompletionDate(Date regCompletionDate) {
        this.regCompletionDate = regCompletionDate;
    }

    public CourseMaintenance100PutRequest withRegCompletionDate(Date regCompletionDate) {
        this.regCompletionDate = regCompletionDate;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("repeatSysInd")
    public String getRepeatSysInd() {
        return repeatSysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_SYS_IND
     * 
     */
    @JsonProperty("repeatSysInd")
    public void setRepeatSysInd(String repeatSysInd) {
        this.repeatSysInd = repeatSysInd;
    }

    public CourseMaintenance100PutRequest withRepeatSysInd(String repeatSysInd) {
        this.repeatSysInd = repeatSysInd;
        return this;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public CourseMaintenance100PutRequest withCollDesc(String collDesc) {
        this.collDesc = collDesc;
        return this;
    }

    /**
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("repeatDesc")
    public String getRepeatDesc() {
        return repeatDesc;
    }

    /**
     * System
     * <p>
     * 
     * 
     */
    @JsonProperty("repeatDesc")
    public void setRepeatDesc(String repeatDesc) {
        this.repeatDesc = repeatDesc;
    }

    public CourseMaintenance100PutRequest withRepeatDesc(String repeatDesc) {
        this.repeatDesc = repeatDesc;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public CourseMaintenance100PutRequest withCrn(String crn) {
        this.crn = crn;
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
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    public String getSchdCodeDesc() {
        return schdCodeDesc;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    public void setSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
    }

    public CourseMaintenance100PutRequest withSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
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
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDesc")
    public String getCriteriaCollDesc() {
        return criteriaCollDesc;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDesc")
    public void setCriteriaCollDesc(String criteriaCollDesc) {
        this.criteriaCollDesc = criteriaCollDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaCollDesc(String criteriaCollDesc) {
        this.criteriaCollDesc = criteriaCollDesc;
        return this;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.deptDesc")
    public String getCriteriaDeptDesc() {
        return criteriaDeptDesc;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.deptDesc")
    public void setCriteriaDeptDesc(String criteriaDeptDesc) {
        this.criteriaDeptDesc = criteriaDeptDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaDeptDesc(String criteriaDeptDesc) {
        this.criteriaDeptDesc = criteriaDeptDesc;
        return this;
    }

    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.divsDesc")
    public String getCriteriaDivsDesc() {
        return criteriaDivsDesc;
    }

    /**
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.divsDesc")
    public void setCriteriaDivsDesc(String criteriaDivsDesc) {
        this.criteriaDivsDesc = criteriaDivsDesc;
    }

    public CourseMaintenance100PutRequest withCriteriaDivsDesc(String criteriaDivsDesc) {
        this.criteriaDivsDesc = criteriaDivsDesc;
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
        sb.append("criteriaCampCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaCampCodeDesc == null)?"<null>":this.criteriaCampCodeDesc));
        sb.append(',');
        sb.append("divsDesc");
        sb.append('=');
        sb.append(((this.divsDesc == null)?"<null>":this.divsDesc));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("criteriaSubjCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaSubjCodeDesc == null)?"<null>":this.criteriaSubjCodeDesc));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("criteriaRegStartDate");
        sb.append('=');
        sb.append(((this.criteriaRegStartDate == null)?"<null>":this.criteriaRegStartDate));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("criteriaRepeatDesc");
        sb.append('=');
        sb.append(((this.criteriaRepeatDesc == null)?"<null>":this.criteriaRepeatDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("campCodeDesc");
        sb.append('=');
        sb.append(((this.campCodeDesc == null)?"<null>":this.campCodeDesc));
        sb.append(',');
        sb.append("numberOfExtensions");
        sb.append('=');
        sb.append(((this.numberOfExtensions == null)?"<null>":this.numberOfExtensions));
        sb.append(',');
        sb.append("deptDesc");
        sb.append('=');
        sb.append(((this.deptDesc == null)?"<null>":this.deptDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("courseComment");
        sb.append('=');
        sb.append(((this.courseComment == null)?"<null>":this.courseComment));
        sb.append(',');
        sb.append("criteriaSchdCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaSchdCodeDesc == null)?"<null>":this.criteriaSchdCodeDesc));
        sb.append(',');
        sb.append("criteriaSessDesc");
        sb.append('=');
        sb.append(((this.criteriaSessDesc == null)?"<null>":this.criteriaSessDesc));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("criteriaRepeatSysInd");
        sb.append('=');
        sb.append(((this.criteriaRepeatSysInd == null)?"<null>":this.criteriaRepeatSysInd));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("criteriaPtrmCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaPtrmCodeDesc == null)?"<null>":this.criteriaPtrmCodeDesc));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
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
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("subjCodeDesc");
        sb.append('=');
        sb.append(((this.subjCodeDesc == null)?"<null>":this.subjCodeDesc));
        sb.append(',');
        sb.append("repeatCourseInd");
        sb.append('=');
        sb.append(((this.repeatCourseInd == null)?"<null>":this.repeatCourseInd));
        sb.append(',');
        sb.append("criteriaCourseComment");
        sb.append('=');
        sb.append(((this.criteriaCourseComment == null)?"<null>":this.criteriaCourseComment));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("ceuInd");
        sb.append('=');
        sb.append(((this.ceuInd == null)?"<null>":this.ceuInd));
        sb.append(',');
        sb.append("ptrmCodeDesc");
        sb.append('=');
        sb.append(((this.ptrmCodeDesc == null)?"<null>":this.ptrmCodeDesc));
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
        sb.append("criteriaNumberOfExtensions");
        sb.append('=');
        sb.append(((this.criteriaNumberOfExtensions == null)?"<null>":this.criteriaNumberOfExtensions));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("criteriaPtrmStartDate");
        sb.append('=');
        sb.append(((this.criteriaPtrmStartDate == null)?"<null>":this.criteriaPtrmStartDate));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("sessDesc");
        sb.append('=');
        sb.append(((this.sessDesc == null)?"<null>":this.sessDesc));
        sb.append(',');
        sb.append("criteriaRegCompletionDate");
        sb.append('=');
        sb.append(((this.criteriaRegCompletionDate == null)?"<null>":this.criteriaRegCompletionDate));
        sb.append(',');
        sb.append("regCompletionDate");
        sb.append('=');
        sb.append(((this.regCompletionDate == null)?"<null>":this.regCompletionDate));
        sb.append(',');
        sb.append("repeatSysInd");
        sb.append('=');
        sb.append(((this.repeatSysInd == null)?"<null>":this.repeatSysInd));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("repeatDesc");
        sb.append('=');
        sb.append(((this.repeatDesc == null)?"<null>":this.repeatDesc));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("criteriaSessCode");
        sb.append('=');
        sb.append(((this.criteriaSessCode == null)?"<null>":this.criteriaSessCode));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("schdCodeDesc");
        sb.append('=');
        sb.append(((this.schdCodeDesc == null)?"<null>":this.schdCodeDesc));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaCollDesc");
        sb.append('=');
        sb.append(((this.criteriaCollDesc == null)?"<null>":this.criteriaCollDesc));
        sb.append(',');
        sb.append("criteriaDeptDesc");
        sb.append('=');
        sb.append(((this.criteriaDeptDesc == null)?"<null>":this.criteriaDeptDesc));
        sb.append(',');
        sb.append("criteriaDivsDesc");
        sb.append('=');
        sb.append(((this.criteriaDivsDesc == null)?"<null>":this.criteriaDivsDesc));
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
        result = ((result* 31)+((this.divsDesc == null)? 0 :this.divsDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRegCompletionDate == null)? 0 :this.criteriaRegCompletionDate.hashCode()));
        result = ((result* 31)+((this.criteriaCeuInd == null)? 0 :this.criteriaCeuInd.hashCode()));
        result = ((result* 31)+((this.criteriaCollDesc == null)? 0 :this.criteriaCollDesc.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.criteriaCourseComment == null)? 0 :this.criteriaCourseComment.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.campCodeDesc == null)? 0 :this.campCodeDesc.hashCode()));
        result = ((result* 31)+((this.numberOfExtensions == null)? 0 :this.numberOfExtensions.hashCode()));
        result = ((result* 31)+((this.deptDesc == null)? 0 :this.deptDesc.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.courseComment == null)? 0 :this.courseComment.hashCode()));
        result = ((result* 31)+((this.criteriaSessDesc == null)? 0 :this.criteriaSessDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRepeatDesc == null)? 0 :this.criteriaRepeatDesc.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaNumberOfExtensions == null)? 0 :this.criteriaNumberOfExtensions.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaRegStartDate == null)? 0 :this.criteriaRegStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaCampCodeDesc == null)? 0 :this.criteriaCampCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodeDesc == null)? 0 :this.criteriaSubjCodeDesc.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNumb == null)? 0 :this.criteriaSeqNumb.hashCode()));
        result = ((result* 31)+((this.subjCodeDesc == null)? 0 :this.subjCodeDesc.hashCode()));
        result = ((result* 31)+((this.repeatCourseInd == null)? 0 :this.repeatCourseInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.ptrmCodeDesc == null)? 0 :this.ptrmCodeDesc.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.criteriaDeptDesc == null)? 0 :this.criteriaDeptDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSessCode == null)? 0 :this.criteriaSessCode.hashCode()));
        result = ((result* 31)+((this.criteriaRepeatSysInd == null)? 0 :this.criteriaRepeatSysInd.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmCodeDesc == null)? 0 :this.criteriaPtrmCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCode == null)? 0 :this.criteriaSchdCode.hashCode()));
        result = ((result* 31)+((this.sessDesc == null)? 0 :this.sessDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDivsDesc == null)? 0 :this.criteriaDivsDesc.hashCode()));
        result = ((result* 31)+((this.regCompletionDate == null)? 0 :this.regCompletionDate.hashCode()));
        result = ((result* 31)+((this.criteriaContHr == null)? 0 :this.criteriaContHr.hashCode()));
        result = ((result* 31)+((this.repeatSysInd == null)? 0 :this.repeatSysInd.hashCode()));
        result = ((result* 31)+((this.criteriaRepeatCourseInd == null)? 0 :this.criteriaRepeatCourseInd.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmStartDate == null)? 0 :this.criteriaPtrmStartDate.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.criteriaLongCourseTitle == null)? 0 :this.criteriaLongCourseTitle.hashCode()));
        result = ((result* 31)+((this.repeatDesc == null)? 0 :this.repeatDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCodeDesc == null)? 0 :this.criteriaSchdCodeDesc.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaCrseTitle == null)? 0 :this.criteriaCrseTitle.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.schdCodeDesc == null)? 0 :this.schdCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaDivsCode == null)? 0 :this.criteriaDivsCode.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmEndDate == null)? 0 :this.criteriaPtrmEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
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
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.divsDesc == rhs.divsDesc)||((this.divsDesc!= null)&&this.divsDesc.equals(rhs.divsDesc))))&&((this.criteriaRegCompletionDate == rhs.criteriaRegCompletionDate)||((this.criteriaRegCompletionDate!= null)&&this.criteriaRegCompletionDate.equals(rhs.criteriaRegCompletionDate))))&&((this.criteriaCeuInd == rhs.criteriaCeuInd)||((this.criteriaCeuInd!= null)&&this.criteriaCeuInd.equals(rhs.criteriaCeuInd))))&&((this.criteriaCollDesc == rhs.criteriaCollDesc)||((this.criteriaCollDesc!= null)&&this.criteriaCollDesc.equals(rhs.criteriaCollDesc))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.criteriaCourseComment == rhs.criteriaCourseComment)||((this.criteriaCourseComment!= null)&&this.criteriaCourseComment.equals(rhs.criteriaCourseComment))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.numberOfExtensions == rhs.numberOfExtensions)||((this.numberOfExtensions!= null)&&this.numberOfExtensions.equals(rhs.numberOfExtensions))))&&((this.deptDesc == rhs.deptDesc)||((this.deptDesc!= null)&&this.deptDesc.equals(rhs.deptDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.courseComment == rhs.courseComment)||((this.courseComment!= null)&&this.courseComment.equals(rhs.courseComment))))&&((this.criteriaSessDesc == rhs.criteriaSessDesc)||((this.criteriaSessDesc!= null)&&this.criteriaSessDesc.equals(rhs.criteriaSessDesc))))&&((this.criteriaRepeatDesc == rhs.criteriaRepeatDesc)||((this.criteriaRepeatDesc!= null)&&this.criteriaRepeatDesc.equals(rhs.criteriaRepeatDesc))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.criteriaNumberOfExtensions == rhs.criteriaNumberOfExtensions)||((this.criteriaNumberOfExtensions!= null)&&this.criteriaNumberOfExtensions.equals(rhs.criteriaNumberOfExtensions))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaRegStartDate == rhs.criteriaRegStartDate)||((this.criteriaRegStartDate!= null)&&this.criteriaRegStartDate.equals(rhs.criteriaRegStartDate))))&&((this.criteriaCampCodeDesc == rhs.criteriaCampCodeDesc)||((this.criteriaCampCodeDesc!= null)&&this.criteriaCampCodeDesc.equals(rhs.criteriaCampCodeDesc))))&&((this.criteriaSubjCodeDesc == rhs.criteriaSubjCodeDesc)||((this.criteriaSubjCodeDesc!= null)&&this.criteriaSubjCodeDesc.equals(rhs.criteriaSubjCodeDesc))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.criteriaSeqNumb == rhs.criteriaSeqNumb)||((this.criteriaSeqNumb!= null)&&this.criteriaSeqNumb.equals(rhs.criteriaSeqNumb))))&&((this.subjCodeDesc == rhs.subjCodeDesc)||((this.subjCodeDesc!= null)&&this.subjCodeDesc.equals(rhs.subjCodeDesc))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.ptrmCodeDesc == rhs.ptrmCodeDesc)||((this.ptrmCodeDesc!= null)&&this.ptrmCodeDesc.equals(rhs.ptrmCodeDesc))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.criteriaDeptDesc == rhs.criteriaDeptDesc)||((this.criteriaDeptDesc!= null)&&this.criteriaDeptDesc.equals(rhs.criteriaDeptDesc))))&&((this.criteriaSessCode == rhs.criteriaSessCode)||((this.criteriaSessCode!= null)&&this.criteriaSessCode.equals(rhs.criteriaSessCode))))&&((this.criteriaRepeatSysInd == rhs.criteriaRepeatSysInd)||((this.criteriaRepeatSysInd!= null)&&this.criteriaRepeatSysInd.equals(rhs.criteriaRepeatSysInd))))&&((this.criteriaPtrmCodeDesc == rhs.criteriaPtrmCodeDesc)||((this.criteriaPtrmCodeDesc!= null)&&this.criteriaPtrmCodeDesc.equals(rhs.criteriaPtrmCodeDesc))))&&((this.criteriaSchdCode == rhs.criteriaSchdCode)||((this.criteriaSchdCode!= null)&&this.criteriaSchdCode.equals(rhs.criteriaSchdCode))))&&((this.sessDesc == rhs.sessDesc)||((this.sessDesc!= null)&&this.sessDesc.equals(rhs.sessDesc))))&&((this.criteriaDivsDesc == rhs.criteriaDivsDesc)||((this.criteriaDivsDesc!= null)&&this.criteriaDivsDesc.equals(rhs.criteriaDivsDesc))))&&((this.regCompletionDate == rhs.regCompletionDate)||((this.regCompletionDate!= null)&&this.regCompletionDate.equals(rhs.regCompletionDate))))&&((this.criteriaContHr == rhs.criteriaContHr)||((this.criteriaContHr!= null)&&this.criteriaContHr.equals(rhs.criteriaContHr))))&&((this.repeatSysInd == rhs.repeatSysInd)||((this.repeatSysInd!= null)&&this.repeatSysInd.equals(rhs.repeatSysInd))))&&((this.criteriaRepeatCourseInd == rhs.criteriaRepeatCourseInd)||((this.criteriaRepeatCourseInd!= null)&&this.criteriaRepeatCourseInd.equals(rhs.criteriaRepeatCourseInd))))&&((this.criteriaPtrmStartDate == rhs.criteriaPtrmStartDate)||((this.criteriaPtrmStartDate!= null)&&this.criteriaPtrmStartDate.equals(rhs.criteriaPtrmStartDate))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.criteriaLongCourseTitle == rhs.criteriaLongCourseTitle)||((this.criteriaLongCourseTitle!= null)&&this.criteriaLongCourseTitle.equals(rhs.criteriaLongCourseTitle))))&&((this.repeatDesc == rhs.repeatDesc)||((this.repeatDesc!= null)&&this.repeatDesc.equals(rhs.repeatDesc))))&&((this.criteriaSchdCodeDesc == rhs.criteriaSchdCodeDesc)||((this.criteriaSchdCodeDesc!= null)&&this.criteriaSchdCodeDesc.equals(rhs.criteriaSchdCodeDesc))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.criteriaCrseTitle == rhs.criteriaCrseTitle)||((this.criteriaCrseTitle!= null)&&this.criteriaCrseTitle.equals(rhs.criteriaCrseTitle))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.schdCodeDesc == rhs.schdCodeDesc)||((this.schdCodeDesc!= null)&&this.schdCodeDesc.equals(rhs.schdCodeDesc))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaDivsCode == rhs.criteriaDivsCode)||((this.criteriaDivsCode!= null)&&this.criteriaDivsCode.equals(rhs.criteriaDivsCode))))&&((this.criteriaPtrmEndDate == rhs.criteriaPtrmEndDate)||((this.criteriaPtrmEndDate!= null)&&this.criteriaPtrmEndDate.equals(rhs.criteriaPtrmEndDate))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))));
    }

}
