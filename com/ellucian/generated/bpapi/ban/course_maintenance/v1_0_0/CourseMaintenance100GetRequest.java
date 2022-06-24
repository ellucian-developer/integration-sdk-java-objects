
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
    "keyblckValidationCheck",
    "crseTitle",
    "gchgCode",
    "regCompletionDate",
    "repeatSysInd",
    "schdCode",
    "sessCode",
    "campCode",
    "id",
    "courseComment",
    "crn",
    "regStartDate",
    "ptrmStartDate",
    "stspKeySequence",
    "contHr",
    "gmodCode",
    "hoursAttempted",
    "subjCode",
    "keyblckTermCode",
    "creditHours",
    "crseNumb",
    "grdeCodeIncmpFinal",
    "ptrmCode",
    "finalGrdeChgDate",
    "gcmtCode",
    "incompleteExtDate",
    "repeatCourseInd",
    "seqNumb",
    "longCourseTitle",
    "ceuInd",
    "ptrmEndDate",
    "divsCode",
    "collCode",
    "deptCode",
    "grdeCodeFinal"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100GetRequest {

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
     * Course Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_TITLE")
    private String crseTitle;
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
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
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
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE, Lookup lineage reference object : SGVSTSP,SGRSTSP")
    private Double stspKeySequence;
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
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GMOD_CODE")
    private String gmodCode;
    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_HOURS_ATTEMPTED")
    private Double hoursAttempted;
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
    private String keyblckTermCode;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_CREDIT_HOURS")
    private Double creditHours;
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
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String grdeCodeIncmpFinal;
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
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE")
    private Date finalGrdeChgDate;
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
     * Part of Term End Date
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_END_DATE")
    private Date ptrmEndDate;
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
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_FINAL")
    private String grdeCodeFinal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public CourseMaintenance100GetRequest withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
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

    public CourseMaintenance100GetRequest withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
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

    public CourseMaintenance100GetRequest withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
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

    public CourseMaintenance100GetRequest withRegCompletionDate(Date regCompletionDate) {
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

    public CourseMaintenance100GetRequest withRepeatSysInd(String repeatSysInd) {
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

    public CourseMaintenance100GetRequest withSchdCode(String schdCode) {
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

    public CourseMaintenance100GetRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public CourseMaintenance100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public CourseMaintenance100GetRequest withId(String id) {
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

    public CourseMaintenance100GetRequest withCourseComment(String courseComment) {
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

    public CourseMaintenance100GetRequest withCrn(String crn) {
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

    public CourseMaintenance100GetRequest withRegStartDate(Date regStartDate) {
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

    public CourseMaintenance100GetRequest withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
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

    public CourseMaintenance100GetRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
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

    public CourseMaintenance100GetRequest withContHr(Double contHr) {
        this.contHr = contHr;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public CourseMaintenance100GetRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public Double getHoursAttempted() {
        return hoursAttempted;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public void setHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
    }

    public CourseMaintenance100GetRequest withHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
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

    public CourseMaintenance100GetRequest withSubjCode(String subjCode) {
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

    public CourseMaintenance100GetRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public Double getCreditHours() {
        return creditHours;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public void setCreditHours(Double creditHours) {
        this.creditHours = creditHours;
    }

    public CourseMaintenance100GetRequest withCreditHours(Double creditHours) {
        this.creditHours = creditHours;
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

    public CourseMaintenance100GetRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public String getGrdeCodeIncmpFinal() {
        return grdeCodeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public void setGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
    }

    public CourseMaintenance100GetRequest withGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
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

    public CourseMaintenance100GetRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    public Date getFinalGrdeChgDate() {
        return finalGrdeChgDate;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    public void setFinalGrdeChgDate(Date finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
    }

    public CourseMaintenance100GetRequest withFinalGrdeChgDate(Date finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
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

    public CourseMaintenance100GetRequest withGcmtCode(String gcmtCode) {
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

    public CourseMaintenance100GetRequest withIncompleteExtDate(Date incompleteExtDate) {
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

    public CourseMaintenance100GetRequest withRepeatCourseInd(String repeatCourseInd) {
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

    public CourseMaintenance100GetRequest withSeqNumb(String seqNumb) {
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

    public CourseMaintenance100GetRequest withLongCourseTitle(String longCourseTitle) {
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

    public CourseMaintenance100GetRequest withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
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

    public CourseMaintenance100GetRequest withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
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

    public CourseMaintenance100GetRequest withDivsCode(String divsCode) {
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

    public CourseMaintenance100GetRequest withCollCode(String collCode) {
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

    public CourseMaintenance100GetRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    public String getGrdeCodeFinal() {
        return grdeCodeFinal;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    public void setGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
    }

    public CourseMaintenance100GetRequest withGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
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

    public CourseMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("regCompletionDate");
        sb.append('=');
        sb.append(((this.regCompletionDate == null)?"<null>":this.regCompletionDate));
        sb.append(',');
        sb.append("repeatSysInd");
        sb.append('=');
        sb.append(((this.repeatSysInd == null)?"<null>":this.repeatSysInd));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("hoursAttempted");
        sb.append('=');
        sb.append(((this.hoursAttempted == null)?"<null>":this.hoursAttempted));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("creditHours");
        sb.append('=');
        sb.append(((this.creditHours == null)?"<null>":this.creditHours));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("grdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeCodeIncmpFinal == null)?"<null>":this.grdeCodeIncmpFinal));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("finalGrdeChgDate");
        sb.append('=');
        sb.append(((this.finalGrdeChgDate == null)?"<null>":this.finalGrdeChgDate));
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
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
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
        sb.append("grdeCodeFinal");
        sb.append('=');
        sb.append(((this.grdeCodeFinal == null)?"<null>":this.grdeCodeFinal));
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
        if ((other instanceof CourseMaintenance100GetRequest) == false) {
            return false;
        }
        CourseMaintenance100GetRequest rhs = ((CourseMaintenance100GetRequest) other);
        return (((((((((((((((((((((((((((((((((((((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.regCompletionDate == rhs.regCompletionDate)||((this.regCompletionDate!= null)&&this.regCompletionDate.equals(rhs.regCompletionDate))))&&((this.repeatSysInd == rhs.repeatSysInd)||((this.repeatSysInd!= null)&&this.repeatSysInd.equals(rhs.repeatSysInd))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.courseComment == rhs.courseComment)||((this.courseComment!= null)&&this.courseComment.equals(rhs.courseComment))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.hoursAttempted == rhs.hoursAttempted)||((this.hoursAttempted!= null)&&this.hoursAttempted.equals(rhs.hoursAttempted))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.creditHours == rhs.creditHours)||((this.creditHours!= null)&&this.creditHours.equals(rhs.creditHours))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.grdeCodeIncmpFinal == rhs.grdeCodeIncmpFinal)||((this.grdeCodeIncmpFinal!= null)&&this.grdeCodeIncmpFinal.equals(rhs.grdeCodeIncmpFinal))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.finalGrdeChgDate == rhs.finalGrdeChgDate)||((this.finalGrdeChgDate!= null)&&this.finalGrdeChgDate.equals(rhs.finalGrdeChgDate))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.incompleteExtDate == rhs.incompleteExtDate)||((this.incompleteExtDate!= null)&&this.incompleteExtDate.equals(rhs.incompleteExtDate))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.grdeCodeFinal == rhs.grdeCodeFinal)||((this.grdeCodeFinal!= null)&&this.grdeCodeFinal.equals(rhs.grdeCodeFinal))));
    }

}
