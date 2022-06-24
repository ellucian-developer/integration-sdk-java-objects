
package com.ellucian.generated.bpapi.ban.student_course_maintenance_components.v0_1_0;

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
    "crseTitle",
    "divsDesc",
    "sfrstcrGrdeCode",
    "sessDesc",
    "regCompletionDate",
    "schdCode",
    "sessCode",
    "sfrstcrGrdeCodeMid",
    "campCode",
    "campCodeDesc",
    "collDesc",
    "repeatDesc",
    "deptDesc",
    "numberOfExtensions",
    "courseComment",
    "crn",
    "regStartDate",
    "ptrmStartDate",
    "contHr",
    "stspKeySequence",
    "subjCode",
    "schdCodeDesc",
    "crseNumb",
    "ptrmCode",
    "ShrtcknSubjCodeDesc",
    "repeatCourseInd",
    "seqNumb",
    "ceuInd",
    "longCourseTitle",
    "ptrmEndDate",
    "ptrmCodeDesc",
    "divsCode",
    "collCode",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class Shrtckn {

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
     * Division Description
     * <p>
     * 
     * 
     */
    @JsonProperty("divsDesc")
    private String divsDesc;
    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCode")
    private String sfrstcrGrdeCode;
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
    @JsonProperty("regCompletionDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_COMPLETION_DATE")
    private Date regCompletionDate;
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
     * Mid Term
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCodeMid")
    private String sfrstcrGrdeCodeMid;
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
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    private String deptDesc;
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
     * Comment
     * <p>
     * Lineage reference object : SHRTCKN_COURSE_COMMENT
     * 
     */
    @JsonProperty("courseComment")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_COURSE_COMMENT")
    private String courseComment;
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
     * Start Date
     * <p>
     * Lineage reference object : SHRTCKN_REG_START_DATE
     * 
     */
    @JsonProperty("regStartDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REG_START_DATE")
    private Date regStartDate;
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
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP")
    private Double stspKeySequence;
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
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    private String schdCodeDesc;
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
    @JsonProperty("ShrtcknSubjCodeDesc")
    private String shrtcknSubjCodeDesc;
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
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SEQ_NUMB")
    private String seqNumb;
    /**
     * Continuing Education Units
     * <p>
     * 
     * 
     */
    @JsonProperty("ceuInd")
    private String ceuInd;
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
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_END_DATE")
    private Date ptrmEndDate;
    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCodeDesc")
    private String ptrmCodeDesc;
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
     * Department
     * <p>
     * Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Shrtckn withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
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

    public Shrtckn withDivsDesc(String divsDesc) {
        this.divsDesc = divsDesc;
        return this;
    }

    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCode")
    public String getSfrstcrGrdeCode() {
        return sfrstcrGrdeCode;
    }

    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCode")
    public void setSfrstcrGrdeCode(String sfrstcrGrdeCode) {
        this.sfrstcrGrdeCode = sfrstcrGrdeCode;
    }

    public Shrtckn withSfrstcrGrdeCode(String sfrstcrGrdeCode) {
        this.sfrstcrGrdeCode = sfrstcrGrdeCode;
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

    public Shrtckn withSessDesc(String sessDesc) {
        this.sessDesc = sessDesc;
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

    public Shrtckn withRegCompletionDate(Date regCompletionDate) {
        this.regCompletionDate = regCompletionDate;
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

    public Shrtckn withSchdCode(String schdCode) {
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

    public Shrtckn withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Mid Term
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCodeMid")
    public String getSfrstcrGrdeCodeMid() {
        return sfrstcrGrdeCodeMid;
    }

    /**
     * Mid Term
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrstcrGrdeCodeMid")
    public void setSfrstcrGrdeCodeMid(String sfrstcrGrdeCodeMid) {
        this.sfrstcrGrdeCodeMid = sfrstcrGrdeCodeMid;
    }

    public Shrtckn withSfrstcrGrdeCodeMid(String sfrstcrGrdeCodeMid) {
        this.sfrstcrGrdeCodeMid = sfrstcrGrdeCodeMid;
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

    public Shrtckn withCampCode(String campCode) {
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

    public Shrtckn withCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
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

    public Shrtckn withCollDesc(String collDesc) {
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

    public Shrtckn withRepeatDesc(String repeatDesc) {
        this.repeatDesc = repeatDesc;
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

    public Shrtckn withDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
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

    public Shrtckn withNumberOfExtensions(Double numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
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

    public Shrtckn withCourseComment(String courseComment) {
        this.courseComment = courseComment;
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

    public Shrtckn withCrn(String crn) {
        this.crn = crn;
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

    public Shrtckn withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
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

    public Shrtckn withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
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

    public Shrtckn withContHr(Double contHr) {
        this.contHr = contHr;
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

    public Shrtckn withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
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

    public Shrtckn withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public Shrtckn withSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
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

    public Shrtckn withCrseNumb(String crseNumb) {
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

    public Shrtckn withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ShrtcknSubjCodeDesc")
    public String getShrtcknSubjCodeDesc() {
        return shrtcknSubjCodeDesc;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ShrtcknSubjCodeDesc")
    public void setShrtcknSubjCodeDesc(String shrtcknSubjCodeDesc) {
        this.shrtcknSubjCodeDesc = shrtcknSubjCodeDesc;
    }

    public Shrtckn withShrtcknSubjCodeDesc(String shrtcknSubjCodeDesc) {
        this.shrtcknSubjCodeDesc = shrtcknSubjCodeDesc;
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

    public Shrtckn withRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
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

    public Shrtckn withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
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

    public Shrtckn withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
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

    public Shrtckn withLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
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

    public Shrtckn withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
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

    public Shrtckn withPtrmCodeDesc(String ptrmCodeDesc) {
        this.ptrmCodeDesc = ptrmCodeDesc;
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

    public Shrtckn withDivsCode(String divsCode) {
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

    public Shrtckn withCollCode(String collCode) {
        this.collCode = collCode;
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

    public Shrtckn withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public Shrtckn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtckn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("divsDesc");
        sb.append('=');
        sb.append(((this.divsDesc == null)?"<null>":this.divsDesc));
        sb.append(',');
        sb.append("sfrstcrGrdeCode");
        sb.append('=');
        sb.append(((this.sfrstcrGrdeCode == null)?"<null>":this.sfrstcrGrdeCode));
        sb.append(',');
        sb.append("sessDesc");
        sb.append('=');
        sb.append(((this.sessDesc == null)?"<null>":this.sessDesc));
        sb.append(',');
        sb.append("regCompletionDate");
        sb.append('=');
        sb.append(((this.regCompletionDate == null)?"<null>":this.regCompletionDate));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("sfrstcrGrdeCodeMid");
        sb.append('=');
        sb.append(((this.sfrstcrGrdeCodeMid == null)?"<null>":this.sfrstcrGrdeCodeMid));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("campCodeDesc");
        sb.append('=');
        sb.append(((this.campCodeDesc == null)?"<null>":this.campCodeDesc));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("repeatDesc");
        sb.append('=');
        sb.append(((this.repeatDesc == null)?"<null>":this.repeatDesc));
        sb.append(',');
        sb.append("deptDesc");
        sb.append('=');
        sb.append(((this.deptDesc == null)?"<null>":this.deptDesc));
        sb.append(',');
        sb.append("numberOfExtensions");
        sb.append('=');
        sb.append(((this.numberOfExtensions == null)?"<null>":this.numberOfExtensions));
        sb.append(',');
        sb.append("courseComment");
        sb.append('=');
        sb.append(((this.courseComment == null)?"<null>":this.courseComment));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("schdCodeDesc");
        sb.append('=');
        sb.append(((this.schdCodeDesc == null)?"<null>":this.schdCodeDesc));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("shrtcknSubjCodeDesc");
        sb.append('=');
        sb.append(((this.shrtcknSubjCodeDesc == null)?"<null>":this.shrtcknSubjCodeDesc));
        sb.append(',');
        sb.append("repeatCourseInd");
        sb.append('=');
        sb.append(((this.repeatCourseInd == null)?"<null>":this.repeatCourseInd));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("ceuInd");
        sb.append('=');
        sb.append(((this.ceuInd == null)?"<null>":this.ceuInd));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
        sb.append(',');
        sb.append("ptrmCodeDesc");
        sb.append('=');
        sb.append(((this.ptrmCodeDesc == null)?"<null>":this.ptrmCodeDesc));
        sb.append(',');
        sb.append("divsCode");
        sb.append('=');
        sb.append(((this.divsCode == null)?"<null>":this.divsCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.divsDesc == null)? 0 :this.divsDesc.hashCode()));
        result = ((result* 31)+((this.sfrstcrGrdeCode == null)? 0 :this.sfrstcrGrdeCode.hashCode()));
        result = ((result* 31)+((this.sessDesc == null)? 0 :this.sessDesc.hashCode()));
        result = ((result* 31)+((this.regCompletionDate == null)? 0 :this.regCompletionDate.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.sfrstcrGrdeCodeMid == null)? 0 :this.sfrstcrGrdeCodeMid.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.campCodeDesc == null)? 0 :this.campCodeDesc.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.repeatDesc == null)? 0 :this.repeatDesc.hashCode()));
        result = ((result* 31)+((this.deptDesc == null)? 0 :this.deptDesc.hashCode()));
        result = ((result* 31)+((this.numberOfExtensions == null)? 0 :this.numberOfExtensions.hashCode()));
        result = ((result* 31)+((this.shrtcknSubjCodeDesc == null)? 0 :this.shrtcknSubjCodeDesc.hashCode()));
        result = ((result* 31)+((this.courseComment == null)? 0 :this.courseComment.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.schdCodeDesc == null)? 0 :this.schdCodeDesc.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.repeatCourseInd == null)? 0 :this.repeatCourseInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        result = ((result* 31)+((this.ptrmCodeDesc == null)? 0 :this.ptrmCodeDesc.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtckn) == false) {
            return false;
        }
        Shrtckn rhs = ((Shrtckn) other);
        return ((((((((((((((((((((((((((((((((((((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle)))&&((this.divsDesc == rhs.divsDesc)||((this.divsDesc!= null)&&this.divsDesc.equals(rhs.divsDesc))))&&((this.sfrstcrGrdeCode == rhs.sfrstcrGrdeCode)||((this.sfrstcrGrdeCode!= null)&&this.sfrstcrGrdeCode.equals(rhs.sfrstcrGrdeCode))))&&((this.sessDesc == rhs.sessDesc)||((this.sessDesc!= null)&&this.sessDesc.equals(rhs.sessDesc))))&&((this.regCompletionDate == rhs.regCompletionDate)||((this.regCompletionDate!= null)&&this.regCompletionDate.equals(rhs.regCompletionDate))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.sfrstcrGrdeCodeMid == rhs.sfrstcrGrdeCodeMid)||((this.sfrstcrGrdeCodeMid!= null)&&this.sfrstcrGrdeCodeMid.equals(rhs.sfrstcrGrdeCodeMid))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.repeatDesc == rhs.repeatDesc)||((this.repeatDesc!= null)&&this.repeatDesc.equals(rhs.repeatDesc))))&&((this.deptDesc == rhs.deptDesc)||((this.deptDesc!= null)&&this.deptDesc.equals(rhs.deptDesc))))&&((this.numberOfExtensions == rhs.numberOfExtensions)||((this.numberOfExtensions!= null)&&this.numberOfExtensions.equals(rhs.numberOfExtensions))))&&((this.shrtcknSubjCodeDesc == rhs.shrtcknSubjCodeDesc)||((this.shrtcknSubjCodeDesc!= null)&&this.shrtcknSubjCodeDesc.equals(rhs.shrtcknSubjCodeDesc))))&&((this.courseComment == rhs.courseComment)||((this.courseComment!= null)&&this.courseComment.equals(rhs.courseComment))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.schdCodeDesc == rhs.schdCodeDesc)||((this.schdCodeDesc!= null)&&this.schdCodeDesc.equals(rhs.schdCodeDesc))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.ptrmCodeDesc == rhs.ptrmCodeDesc)||((this.ptrmCodeDesc!= null)&&this.ptrmCodeDesc.equals(rhs.ptrmCodeDesc))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
