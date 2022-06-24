
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
    "id",
    "keyblckTermCode",
    "keyblckValidationCheck",
    "crn",
    "subjCode",
    "crseNumb",
    "crseTitle",
    "seqNumb",
    "campCode",
    "repeatCourseInd",
    "repeatSysInd",
    "schdCode",
    "ptrmCode",
    "courseComment",
    "regStartDate",
    "regCompletionDate",
    "longCourseTitle",
    "ceuInd",
    "stspKeySequence",
    "collCode",
    "divsCode",
    "deptCode",
    "sessCode",
    "contHr",
    "ptrmStartDate",
    "ptrmEndDate",
    "grdeCodeFinal",
    "gmodCode",
    "creditHours",
    "hoursAttempted",
    "gchgCode",
    "incompleteExtDate",
    "grdeCodeIncmpFinal",
    "finalGrdeChgDate",
    "gcmtCode"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonProperty("keyblckValidationCheck")
    private String keyblckValidationCheck;
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
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
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
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SEQ_NUMB")
    private String seqNumb;
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
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_COURSE_IND")
    private String repeatCourseInd;
    @JsonProperty("repeatSysInd")
    private String repeatSysInd;
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
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
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
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("regStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_START_DATE")
    private Date regStartDate;
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
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP")
    private Double stspKeySequence;
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
     * Division
     * <p>
     * Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DIVS_CODE, Lookup lineage reference object : stvdivs")
    private String divsCode;
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
     * Session
     * <p>
     * Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
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
     * Part of Term Start Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_START_DATE")
    private Date ptrmStartDate;
    /**
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_END_DATE")
    private Date ptrmEndDate;
    @JsonProperty("grdeCodeFinal")
    private String grdeCodeFinal;
    @JsonProperty("gmodCode")
    private String gmodCode;
    @JsonProperty("creditHours")
    private String creditHours;
    @JsonProperty("hoursAttempted")
    private String hoursAttempted;
    @JsonProperty("gchgCode")
    private String gchgCode;
    @JsonProperty("incompleteExtDate")
    private String incompleteExtDate;
    @JsonProperty("grdeCodeIncmpFinal")
    private String grdeCodeIncmpFinal;
    @JsonProperty("finalGrdeChgDate")
    private String finalGrdeChgDate;
    @JsonProperty("gcmtCode")
    private String gcmtCode;
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

    public CourseMaintenance100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CourseMaintenance100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    @JsonProperty("keyblckValidationCheck")
    public String getKeyblckValidationCheck() {
        return keyblckValidationCheck;
    }

    @JsonProperty("keyblckValidationCheck")
    public void setKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
    }

    public CourseMaintenance100QapiPost withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
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

    public CourseMaintenance100QapiPost withCrn(String crn) {
        this.crn = crn;
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

    public CourseMaintenance100QapiPost withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public CourseMaintenance100QapiPost withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public CourseMaintenance100QapiPost withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
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

    public CourseMaintenance100QapiPost withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
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

    public CourseMaintenance100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
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

    public CourseMaintenance100QapiPost withRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
        return this;
    }

    @JsonProperty("repeatSysInd")
    public String getRepeatSysInd() {
        return repeatSysInd;
    }

    @JsonProperty("repeatSysInd")
    public void setRepeatSysInd(String repeatSysInd) {
        this.repeatSysInd = repeatSysInd;
    }

    public CourseMaintenance100QapiPost withRepeatSysInd(String repeatSysInd) {
        this.repeatSysInd = repeatSysInd;
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

    public CourseMaintenance100QapiPost withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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

    public CourseMaintenance100QapiPost withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
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

    public CourseMaintenance100QapiPost withCourseComment(String courseComment) {
        this.courseComment = courseComment;
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

    public CourseMaintenance100QapiPost withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
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

    public CourseMaintenance100QapiPost withRegCompletionDate(Date regCompletionDate) {
        this.regCompletionDate = regCompletionDate;
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

    public CourseMaintenance100QapiPost withLongCourseTitle(String longCourseTitle) {
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

    public CourseMaintenance100QapiPost withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
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

    public CourseMaintenance100QapiPost withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
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

    public CourseMaintenance100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
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

    public CourseMaintenance100QapiPost withDivsCode(String divsCode) {
        this.divsCode = divsCode;
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

    public CourseMaintenance100QapiPost withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public CourseMaintenance100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public CourseMaintenance100QapiPost withContHr(Double contHr) {
        this.contHr = contHr;
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

    public CourseMaintenance100QapiPost withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
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

    public CourseMaintenance100QapiPost withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
        return this;
    }

    @JsonProperty("grdeCodeFinal")
    public String getGrdeCodeFinal() {
        return grdeCodeFinal;
    }

    @JsonProperty("grdeCodeFinal")
    public void setGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
    }

    public CourseMaintenance100QapiPost withGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
        return this;
    }

    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public CourseMaintenance100QapiPost withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    @JsonProperty("creditHours")
    public String getCreditHours() {
        return creditHours;
    }

    @JsonProperty("creditHours")
    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    public CourseMaintenance100QapiPost withCreditHours(String creditHours) {
        this.creditHours = creditHours;
        return this;
    }

    @JsonProperty("hoursAttempted")
    public String getHoursAttempted() {
        return hoursAttempted;
    }

    @JsonProperty("hoursAttempted")
    public void setHoursAttempted(String hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
    }

    public CourseMaintenance100QapiPost withHoursAttempted(String hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
        return this;
    }

    @JsonProperty("gchgCode")
    public String getGchgCode() {
        return gchgCode;
    }

    @JsonProperty("gchgCode")
    public void setGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
    }

    public CourseMaintenance100QapiPost withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
        return this;
    }

    @JsonProperty("incompleteExtDate")
    public String getIncompleteExtDate() {
        return incompleteExtDate;
    }

    @JsonProperty("incompleteExtDate")
    public void setIncompleteExtDate(String incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
    }

    public CourseMaintenance100QapiPost withIncompleteExtDate(String incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
        return this;
    }

    @JsonProperty("grdeCodeIncmpFinal")
    public String getGrdeCodeIncmpFinal() {
        return grdeCodeIncmpFinal;
    }

    @JsonProperty("grdeCodeIncmpFinal")
    public void setGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
    }

    public CourseMaintenance100QapiPost withGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
        return this;
    }

    @JsonProperty("finalGrdeChgDate")
    public String getFinalGrdeChgDate() {
        return finalGrdeChgDate;
    }

    @JsonProperty("finalGrdeChgDate")
    public void setFinalGrdeChgDate(String finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
    }

    public CourseMaintenance100QapiPost withFinalGrdeChgDate(String finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
        return this;
    }

    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public CourseMaintenance100QapiPost withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
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

    public CourseMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("repeatCourseInd");
        sb.append('=');
        sb.append(((this.repeatCourseInd == null)?"<null>":this.repeatCourseInd));
        sb.append(',');
        sb.append("repeatSysInd");
        sb.append('=');
        sb.append(((this.repeatSysInd == null)?"<null>":this.repeatSysInd));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("courseComment");
        sb.append('=');
        sb.append(((this.courseComment == null)?"<null>":this.courseComment));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("regCompletionDate");
        sb.append('=');
        sb.append(((this.regCompletionDate == null)?"<null>":this.regCompletionDate));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("ceuInd");
        sb.append('=');
        sb.append(((this.ceuInd == null)?"<null>":this.ceuInd));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("divsCode");
        sb.append('=');
        sb.append(((this.divsCode == null)?"<null>":this.divsCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
        sb.append(',');
        sb.append("grdeCodeFinal");
        sb.append('=');
        sb.append(((this.grdeCodeFinal == null)?"<null>":this.grdeCodeFinal));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("creditHours");
        sb.append('=');
        sb.append(((this.creditHours == null)?"<null>":this.creditHours));
        sb.append(',');
        sb.append("hoursAttempted");
        sb.append('=');
        sb.append(((this.hoursAttempted == null)?"<null>":this.hoursAttempted));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("incompleteExtDate");
        sb.append('=');
        sb.append(((this.incompleteExtDate == null)?"<null>":this.incompleteExtDate));
        sb.append(',');
        sb.append("grdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeCodeIncmpFinal == null)?"<null>":this.grdeCodeIncmpFinal));
        sb.append(',');
        sb.append("finalGrdeChgDate");
        sb.append('=');
        sb.append(((this.finalGrdeChgDate == null)?"<null>":this.finalGrdeChgDate));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
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
        result = ((result* 31)+((this.keyblckValidationCheck == null)? 0 :this.keyblckValidationCheck.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.gchgCode == null)? 0 :this.gchgCode.hashCode()));
        result = ((result* 31)+((this.regCompletionDate == null)? 0 :this.regCompletionDate.hashCode()));
        result = ((result* 31)+((this.repeatSysInd == null)? 0 :this.repeatSysInd.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.courseComment == null)? 0 :this.courseComment.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.hoursAttempted == null)? 0 :this.hoursAttempted.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.creditHours == null)? 0 :this.creditHours.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.grdeCodeIncmpFinal == null)? 0 :this.grdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.finalGrdeChgDate == null)? 0 :this.finalGrdeChgDate.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.incompleteExtDate == null)? 0 :this.incompleteExtDate.hashCode()));
        result = ((result* 31)+((this.repeatCourseInd == null)? 0 :this.repeatCourseInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.grdeCodeFinal == null)? 0 :this.grdeCodeFinal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseMaintenance100QapiPost) == false) {
            return false;
        }
        CourseMaintenance100QapiPost rhs = ((CourseMaintenance100QapiPost) other);
        return (((((((((((((((((((((((((((((((((((((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.regCompletionDate == rhs.regCompletionDate)||((this.regCompletionDate!= null)&&this.regCompletionDate.equals(rhs.regCompletionDate))))&&((this.repeatSysInd == rhs.repeatSysInd)||((this.repeatSysInd!= null)&&this.repeatSysInd.equals(rhs.repeatSysInd))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.courseComment == rhs.courseComment)||((this.courseComment!= null)&&this.courseComment.equals(rhs.courseComment))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.hoursAttempted == rhs.hoursAttempted)||((this.hoursAttempted!= null)&&this.hoursAttempted.equals(rhs.hoursAttempted))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.creditHours == rhs.creditHours)||((this.creditHours!= null)&&this.creditHours.equals(rhs.creditHours))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.grdeCodeIncmpFinal == rhs.grdeCodeIncmpFinal)||((this.grdeCodeIncmpFinal!= null)&&this.grdeCodeIncmpFinal.equals(rhs.grdeCodeIncmpFinal))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.finalGrdeChgDate == rhs.finalGrdeChgDate)||((this.finalGrdeChgDate!= null)&&this.finalGrdeChgDate.equals(rhs.finalGrdeChgDate))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.incompleteExtDate == rhs.incompleteExtDate)||((this.incompleteExtDate!= null)&&this.incompleteExtDate.equals(rhs.incompleteExtDate))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.grdeCodeFinal == rhs.grdeCodeFinal)||((this.grdeCodeFinal!= null)&&this.grdeCodeFinal.equals(rhs.grdeCodeFinal))));
    }

}
