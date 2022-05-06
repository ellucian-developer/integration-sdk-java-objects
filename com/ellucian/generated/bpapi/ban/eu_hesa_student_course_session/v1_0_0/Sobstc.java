
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

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
    "stuCourseSessionId",
    "sessionYearId",
    "ssdtCodePgrlangidSt",
    "ssdtCodeStudyabroadSt",
    "scsEndDate",
    "ssdtCodeScsmode",
    "studentLoad",
    "ssdtCodeRsnscsendSt",
    "invoiceFeeAmnt",
    "ssdtCodeFeemethodSt",
    "activityDate",
    "expectedEndDate",
    "ssdtCodeIntercltn",
    "ssdtCodePlacement",
    "ssdtCodePrepflagSt",
    "ssdtCodePlacementSt",
    "intendedThesisTitle",
    "courseId",
    "ssdtCodeIntercltnSt",
    "yearPrg",
    "ssdtCodeInvoiceid",
    "ssdtCodePgrlangid",
    "pgrlangpcnt",
    "scsFeeAmnt",
    "ssdtCodeScsmodeSt",
    "userId",
    "ssdtCodeStudyabroad",
    "scsStartDate",
    "phdSub",
    "ssdtCodeEmpfees",
    "predictedStuload",
    "ssdtCodeFeemethod",
    "ssdtCodeRsnscsend",
    "ssdtCodeEmpfeesSt",
    "ssdtCodeInvoiceidSt",
    "ssdtCodePrepflag"
})
@Generated("jsonschema2pojo")
public class Sobstc {

    /**
     * Student Course Session ID
     * <p>
     * Lineage reference object : SOBSTCS_STU_COURSE_SESSION_ID
     * (Required)
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SESSION_YEAR_ID
     * 
     */
    @JsonProperty("sessionYearId")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SESSION_YEAR_ID")
    private String sessionYearId;
    @JsonProperty("ssdtCodePgrlangidSt")
    private String ssdtCodePgrlangidSt;
    @JsonProperty("ssdtCodeStudyabroadSt")
    private String ssdtCodeStudyabroadSt;
    /**
     * Student Course Session End Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_END_DATE
     * 
     */
    @JsonProperty("scsEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SCS_END_DATE")
    private Date scsEndDate;
    /**
     * Student Course Session Mode
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_SCSMODE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeScsmode")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_SCSMODE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeScsmode;
    /**
     * Student Load
     * <p>
     * Lineage reference object : SOBSTCS_STUDENT_LOAD
     * 
     */
    @JsonProperty("studentLoad")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_STUDENT_LOAD")
    private Double studentLoad;
    @JsonProperty("ssdtCodeRsnscsendSt")
    private String ssdtCodeRsnscsendSt;
    /**
     * Invoice Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_INVOICE_FEE_AMNT
     * 
     */
    @JsonProperty("invoiceFeeAmnt")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_INVOICE_FEE_AMNT")
    private Double invoiceFeeAmnt;
    @JsonProperty("ssdtCodeFeemethodSt")
    private String ssdtCodeFeemethodSt;
    /**
     * Lineage reference object : SOBSTCS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBSTCS_EXPECTED_END_DATE
     * 
     */
    @JsonProperty("expectedEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_EXPECTED_END_DATE")
    private Date expectedEndDate;
    /**
     * Intercalation
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INTERCLTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIntercltn")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_INTERCLTN, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeIntercltn;
    /**
     * Placement
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PLACEMENT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePlacement")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_PLACEMENT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePlacement;
    @JsonProperty("ssdtCodePrepflagSt")
    private String ssdtCodePrepflagSt;
    @JsonProperty("ssdtCodePlacementSt")
    private String ssdtCodePlacementSt;
    /**
     * Intended Thesis Title
     * <p>
     * Lineage reference object : SOBSTCS_INTENDED_THESIS_TITLE
     * 
     */
    @JsonProperty("intendedThesisTitle")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_INTENDED_THESIS_TITLE")
    private String intendedThesisTitle;
    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SOBSTCS_COURSE_ID
     * (Required)
     * 
     */
    @JsonProperty("courseId")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_COURSE_ID")
    private String courseId;
    @JsonProperty("ssdtCodeIntercltnSt")
    private String ssdtCodeIntercltnSt;
    /**
     * Programme Year
     * <p>
     * Lineage reference object : SOBSTCS_YEAR_PRG
     * 
     */
    @JsonProperty("yearPrg")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_YEAR_PRG")
    private Double yearPrg;
    /**
     * Invoice HESA Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INVOICEID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeInvoiceid")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_INVOICEID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeInvoiceid;
    /**
     * PGR Language Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PGRLANGID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePgrlangid")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_PGRLANGID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePgrlangid;
    /**
     * PGR Language Percentage
     * <p>
     * Lineage reference object : SOBSTCS_PGRLANGPCNT
     * 
     */
    @JsonProperty("pgrlangpcnt")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_PGRLANGPCNT")
    private Double pgrlangpcnt;
    /**
     * Student Course Session Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_SCS_FEE_AMNT
     * 
     */
    @JsonProperty("scsFeeAmnt")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SCS_FEE_AMNT")
    private Double scsFeeAmnt;
    @JsonProperty("ssdtCodeScsmodeSt")
    private String ssdtCodeScsmodeSt;
    /**
     * Lineage reference object : SOBSTCS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_USER_ID")
    private String userId;
    /**
     * Study Abroad
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_STUDYABROAD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStudyabroad")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_STUDYABROAD, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeStudyabroad;
    /**
     * Student Course Session Start Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_START_DATE
     * 
     */
    @JsonProperty("scsStartDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SCS_START_DATE")
    private Date scsStartDate;
    /**
     * PhD Submission Date
     * <p>
     * Lineage reference object : SOBSTCS_PHD_SUB
     * 
     */
    @JsonProperty("phdSub")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_PHD_SUB")
    private Date phdSub;
    /**
     * Employer Fees
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_EMPFEES, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpfees")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_EMPFEES, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeEmpfees;
    /**
     * Predicted Student Load
     * <p>
     * Lineage reference object : SOBSTCS_PREDICTED_STULOAD
     * 
     */
    @JsonProperty("predictedStuload")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_PREDICTED_STULOAD")
    private Double predictedStuload;
    /**
     * Fee Method
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_FEEMETHOD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeemethod")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_FEEMETHOD, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFeemethod;
    /**
     * Reason for Student Course Session Ending
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_RSNSCSEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRsnscsend")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_RSNSCSEND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRsnscsend;
    @JsonProperty("ssdtCodeEmpfeesSt")
    private String ssdtCodeEmpfeesSt;
    @JsonProperty("ssdtCodeInvoiceidSt")
    private String ssdtCodeInvoiceidSt;
    /**
     * Preparatory Student Course Session Flag
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PREPFLAG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrepflag")
    @JsonPropertyDescription("Lineage reference object : SOBSTCS_SSDT_CODE_PREPFLAG, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePrepflag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student Course Session ID
     * <p>
     * Lineage reference object : SOBSTCS_STU_COURSE_SESSION_ID
     * (Required)
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Student Course Session ID
     * <p>
     * Lineage reference object : SOBSTCS_STU_COURSE_SESSION_ID
     * (Required)
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobstc withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SESSION_YEAR_ID
     * 
     */
    @JsonProperty("sessionYearId")
    public String getSessionYearId() {
        return sessionYearId;
    }

    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SESSION_YEAR_ID
     * 
     */
    @JsonProperty("sessionYearId")
    public void setSessionYearId(String sessionYearId) {
        this.sessionYearId = sessionYearId;
    }

    public Sobstc withSessionYearId(String sessionYearId) {
        this.sessionYearId = sessionYearId;
        return this;
    }

    @JsonProperty("ssdtCodePgrlangidSt")
    public String getSsdtCodePgrlangidSt() {
        return ssdtCodePgrlangidSt;
    }

    @JsonProperty("ssdtCodePgrlangidSt")
    public void setSsdtCodePgrlangidSt(String ssdtCodePgrlangidSt) {
        this.ssdtCodePgrlangidSt = ssdtCodePgrlangidSt;
    }

    public Sobstc withSsdtCodePgrlangidSt(String ssdtCodePgrlangidSt) {
        this.ssdtCodePgrlangidSt = ssdtCodePgrlangidSt;
        return this;
    }

    @JsonProperty("ssdtCodeStudyabroadSt")
    public String getSsdtCodeStudyabroadSt() {
        return ssdtCodeStudyabroadSt;
    }

    @JsonProperty("ssdtCodeStudyabroadSt")
    public void setSsdtCodeStudyabroadSt(String ssdtCodeStudyabroadSt) {
        this.ssdtCodeStudyabroadSt = ssdtCodeStudyabroadSt;
    }

    public Sobstc withSsdtCodeStudyabroadSt(String ssdtCodeStudyabroadSt) {
        this.ssdtCodeStudyabroadSt = ssdtCodeStudyabroadSt;
        return this;
    }

    /**
     * Student Course Session End Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_END_DATE
     * 
     */
    @JsonProperty("scsEndDate")
    public Date getScsEndDate() {
        return scsEndDate;
    }

    /**
     * Student Course Session End Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_END_DATE
     * 
     */
    @JsonProperty("scsEndDate")
    public void setScsEndDate(Date scsEndDate) {
        this.scsEndDate = scsEndDate;
    }

    public Sobstc withScsEndDate(Date scsEndDate) {
        this.scsEndDate = scsEndDate;
        return this;
    }

    /**
     * Student Course Session Mode
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_SCSMODE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeScsmode")
    public String getSsdtCodeScsmode() {
        return ssdtCodeScsmode;
    }

    /**
     * Student Course Session Mode
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_SCSMODE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeScsmode")
    public void setSsdtCodeScsmode(String ssdtCodeScsmode) {
        this.ssdtCodeScsmode = ssdtCodeScsmode;
    }

    public Sobstc withSsdtCodeScsmode(String ssdtCodeScsmode) {
        this.ssdtCodeScsmode = ssdtCodeScsmode;
        return this;
    }

    /**
     * Student Load
     * <p>
     * Lineage reference object : SOBSTCS_STUDENT_LOAD
     * 
     */
    @JsonProperty("studentLoad")
    public Double getStudentLoad() {
        return studentLoad;
    }

    /**
     * Student Load
     * <p>
     * Lineage reference object : SOBSTCS_STUDENT_LOAD
     * 
     */
    @JsonProperty("studentLoad")
    public void setStudentLoad(Double studentLoad) {
        this.studentLoad = studentLoad;
    }

    public Sobstc withStudentLoad(Double studentLoad) {
        this.studentLoad = studentLoad;
        return this;
    }

    @JsonProperty("ssdtCodeRsnscsendSt")
    public String getSsdtCodeRsnscsendSt() {
        return ssdtCodeRsnscsendSt;
    }

    @JsonProperty("ssdtCodeRsnscsendSt")
    public void setSsdtCodeRsnscsendSt(String ssdtCodeRsnscsendSt) {
        this.ssdtCodeRsnscsendSt = ssdtCodeRsnscsendSt;
    }

    public Sobstc withSsdtCodeRsnscsendSt(String ssdtCodeRsnscsendSt) {
        this.ssdtCodeRsnscsendSt = ssdtCodeRsnscsendSt;
        return this;
    }

    /**
     * Invoice Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_INVOICE_FEE_AMNT
     * 
     */
    @JsonProperty("invoiceFeeAmnt")
    public Double getInvoiceFeeAmnt() {
        return invoiceFeeAmnt;
    }

    /**
     * Invoice Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_INVOICE_FEE_AMNT
     * 
     */
    @JsonProperty("invoiceFeeAmnt")
    public void setInvoiceFeeAmnt(Double invoiceFeeAmnt) {
        this.invoiceFeeAmnt = invoiceFeeAmnt;
    }

    public Sobstc withInvoiceFeeAmnt(Double invoiceFeeAmnt) {
        this.invoiceFeeAmnt = invoiceFeeAmnt;
        return this;
    }

    @JsonProperty("ssdtCodeFeemethodSt")
    public String getSsdtCodeFeemethodSt() {
        return ssdtCodeFeemethodSt;
    }

    @JsonProperty("ssdtCodeFeemethodSt")
    public void setSsdtCodeFeemethodSt(String ssdtCodeFeemethodSt) {
        this.ssdtCodeFeemethodSt = ssdtCodeFeemethodSt;
    }

    public Sobstc withSsdtCodeFeemethodSt(String ssdtCodeFeemethodSt) {
        this.ssdtCodeFeemethodSt = ssdtCodeFeemethodSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSTCS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSTCS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobstc withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBSTCS_EXPECTED_END_DATE
     * 
     */
    @JsonProperty("expectedEndDate")
    public Date getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBSTCS_EXPECTED_END_DATE
     * 
     */
    @JsonProperty("expectedEndDate")
    public void setExpectedEndDate(Date expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    public Sobstc withExpectedEndDate(Date expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
        return this;
    }

    /**
     * Intercalation
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INTERCLTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIntercltn")
    public String getSsdtCodeIntercltn() {
        return ssdtCodeIntercltn;
    }

    /**
     * Intercalation
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INTERCLTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIntercltn")
    public void setSsdtCodeIntercltn(String ssdtCodeIntercltn) {
        this.ssdtCodeIntercltn = ssdtCodeIntercltn;
    }

    public Sobstc withSsdtCodeIntercltn(String ssdtCodeIntercltn) {
        this.ssdtCodeIntercltn = ssdtCodeIntercltn;
        return this;
    }

    /**
     * Placement
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PLACEMENT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePlacement")
    public String getSsdtCodePlacement() {
        return ssdtCodePlacement;
    }

    /**
     * Placement
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PLACEMENT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePlacement")
    public void setSsdtCodePlacement(String ssdtCodePlacement) {
        this.ssdtCodePlacement = ssdtCodePlacement;
    }

    public Sobstc withSsdtCodePlacement(String ssdtCodePlacement) {
        this.ssdtCodePlacement = ssdtCodePlacement;
        return this;
    }

    @JsonProperty("ssdtCodePrepflagSt")
    public String getSsdtCodePrepflagSt() {
        return ssdtCodePrepflagSt;
    }

    @JsonProperty("ssdtCodePrepflagSt")
    public void setSsdtCodePrepflagSt(String ssdtCodePrepflagSt) {
        this.ssdtCodePrepflagSt = ssdtCodePrepflagSt;
    }

    public Sobstc withSsdtCodePrepflagSt(String ssdtCodePrepflagSt) {
        this.ssdtCodePrepflagSt = ssdtCodePrepflagSt;
        return this;
    }

    @JsonProperty("ssdtCodePlacementSt")
    public String getSsdtCodePlacementSt() {
        return ssdtCodePlacementSt;
    }

    @JsonProperty("ssdtCodePlacementSt")
    public void setSsdtCodePlacementSt(String ssdtCodePlacementSt) {
        this.ssdtCodePlacementSt = ssdtCodePlacementSt;
    }

    public Sobstc withSsdtCodePlacementSt(String ssdtCodePlacementSt) {
        this.ssdtCodePlacementSt = ssdtCodePlacementSt;
        return this;
    }

    /**
     * Intended Thesis Title
     * <p>
     * Lineage reference object : SOBSTCS_INTENDED_THESIS_TITLE
     * 
     */
    @JsonProperty("intendedThesisTitle")
    public String getIntendedThesisTitle() {
        return intendedThesisTitle;
    }

    /**
     * Intended Thesis Title
     * <p>
     * Lineage reference object : SOBSTCS_INTENDED_THESIS_TITLE
     * 
     */
    @JsonProperty("intendedThesisTitle")
    public void setIntendedThesisTitle(String intendedThesisTitle) {
        this.intendedThesisTitle = intendedThesisTitle;
    }

    public Sobstc withIntendedThesisTitle(String intendedThesisTitle) {
        this.intendedThesisTitle = intendedThesisTitle;
        return this;
    }

    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SOBSTCS_COURSE_ID
     * (Required)
     * 
     */
    @JsonProperty("courseId")
    public String getCourseId() {
        return courseId;
    }

    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SOBSTCS_COURSE_ID
     * (Required)
     * 
     */
    @JsonProperty("courseId")
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Sobstc withCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    @JsonProperty("ssdtCodeIntercltnSt")
    public String getSsdtCodeIntercltnSt() {
        return ssdtCodeIntercltnSt;
    }

    @JsonProperty("ssdtCodeIntercltnSt")
    public void setSsdtCodeIntercltnSt(String ssdtCodeIntercltnSt) {
        this.ssdtCodeIntercltnSt = ssdtCodeIntercltnSt;
    }

    public Sobstc withSsdtCodeIntercltnSt(String ssdtCodeIntercltnSt) {
        this.ssdtCodeIntercltnSt = ssdtCodeIntercltnSt;
        return this;
    }

    /**
     * Programme Year
     * <p>
     * Lineage reference object : SOBSTCS_YEAR_PRG
     * 
     */
    @JsonProperty("yearPrg")
    public Double getYearPrg() {
        return yearPrg;
    }

    /**
     * Programme Year
     * <p>
     * Lineage reference object : SOBSTCS_YEAR_PRG
     * 
     */
    @JsonProperty("yearPrg")
    public void setYearPrg(Double yearPrg) {
        this.yearPrg = yearPrg;
    }

    public Sobstc withYearPrg(Double yearPrg) {
        this.yearPrg = yearPrg;
        return this;
    }

    /**
     * Invoice HESA Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INVOICEID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeInvoiceid")
    public String getSsdtCodeInvoiceid() {
        return ssdtCodeInvoiceid;
    }

    /**
     * Invoice HESA Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_INVOICEID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeInvoiceid")
    public void setSsdtCodeInvoiceid(String ssdtCodeInvoiceid) {
        this.ssdtCodeInvoiceid = ssdtCodeInvoiceid;
    }

    public Sobstc withSsdtCodeInvoiceid(String ssdtCodeInvoiceid) {
        this.ssdtCodeInvoiceid = ssdtCodeInvoiceid;
        return this;
    }

    /**
     * PGR Language Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PGRLANGID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePgrlangid")
    public String getSsdtCodePgrlangid() {
        return ssdtCodePgrlangid;
    }

    /**
     * PGR Language Identifier
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PGRLANGID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePgrlangid")
    public void setSsdtCodePgrlangid(String ssdtCodePgrlangid) {
        this.ssdtCodePgrlangid = ssdtCodePgrlangid;
    }

    public Sobstc withSsdtCodePgrlangid(String ssdtCodePgrlangid) {
        this.ssdtCodePgrlangid = ssdtCodePgrlangid;
        return this;
    }

    /**
     * PGR Language Percentage
     * <p>
     * Lineage reference object : SOBSTCS_PGRLANGPCNT
     * 
     */
    @JsonProperty("pgrlangpcnt")
    public Double getPgrlangpcnt() {
        return pgrlangpcnt;
    }

    /**
     * PGR Language Percentage
     * <p>
     * Lineage reference object : SOBSTCS_PGRLANGPCNT
     * 
     */
    @JsonProperty("pgrlangpcnt")
    public void setPgrlangpcnt(Double pgrlangpcnt) {
        this.pgrlangpcnt = pgrlangpcnt;
    }

    public Sobstc withPgrlangpcnt(Double pgrlangpcnt) {
        this.pgrlangpcnt = pgrlangpcnt;
        return this;
    }

    /**
     * Student Course Session Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_SCS_FEE_AMNT
     * 
     */
    @JsonProperty("scsFeeAmnt")
    public Double getScsFeeAmnt() {
        return scsFeeAmnt;
    }

    /**
     * Student Course Session Fee Amount
     * <p>
     * Lineage reference object : SOBSTCS_SCS_FEE_AMNT
     * 
     */
    @JsonProperty("scsFeeAmnt")
    public void setScsFeeAmnt(Double scsFeeAmnt) {
        this.scsFeeAmnt = scsFeeAmnt;
    }

    public Sobstc withScsFeeAmnt(Double scsFeeAmnt) {
        this.scsFeeAmnt = scsFeeAmnt;
        return this;
    }

    @JsonProperty("ssdtCodeScsmodeSt")
    public String getSsdtCodeScsmodeSt() {
        return ssdtCodeScsmodeSt;
    }

    @JsonProperty("ssdtCodeScsmodeSt")
    public void setSsdtCodeScsmodeSt(String ssdtCodeScsmodeSt) {
        this.ssdtCodeScsmodeSt = ssdtCodeScsmodeSt;
    }

    public Sobstc withSsdtCodeScsmodeSt(String ssdtCodeScsmodeSt) {
        this.ssdtCodeScsmodeSt = ssdtCodeScsmodeSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSTCS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSTCS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobstc withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Study Abroad
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_STUDYABROAD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStudyabroad")
    public String getSsdtCodeStudyabroad() {
        return ssdtCodeStudyabroad;
    }

    /**
     * Study Abroad
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_STUDYABROAD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStudyabroad")
    public void setSsdtCodeStudyabroad(String ssdtCodeStudyabroad) {
        this.ssdtCodeStudyabroad = ssdtCodeStudyabroad;
    }

    public Sobstc withSsdtCodeStudyabroad(String ssdtCodeStudyabroad) {
        this.ssdtCodeStudyabroad = ssdtCodeStudyabroad;
        return this;
    }

    /**
     * Student Course Session Start Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_START_DATE
     * 
     */
    @JsonProperty("scsStartDate")
    public Date getScsStartDate() {
        return scsStartDate;
    }

    /**
     * Student Course Session Start Date
     * <p>
     * Lineage reference object : SOBSTCS_SCS_START_DATE
     * 
     */
    @JsonProperty("scsStartDate")
    public void setScsStartDate(Date scsStartDate) {
        this.scsStartDate = scsStartDate;
    }

    public Sobstc withScsStartDate(Date scsStartDate) {
        this.scsStartDate = scsStartDate;
        return this;
    }

    /**
     * PhD Submission Date
     * <p>
     * Lineage reference object : SOBSTCS_PHD_SUB
     * 
     */
    @JsonProperty("phdSub")
    public Date getPhdSub() {
        return phdSub;
    }

    /**
     * PhD Submission Date
     * <p>
     * Lineage reference object : SOBSTCS_PHD_SUB
     * 
     */
    @JsonProperty("phdSub")
    public void setPhdSub(Date phdSub) {
        this.phdSub = phdSub;
    }

    public Sobstc withPhdSub(Date phdSub) {
        this.phdSub = phdSub;
        return this;
    }

    /**
     * Employer Fees
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_EMPFEES, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpfees")
    public String getSsdtCodeEmpfees() {
        return ssdtCodeEmpfees;
    }

    /**
     * Employer Fees
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_EMPFEES, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpfees")
    public void setSsdtCodeEmpfees(String ssdtCodeEmpfees) {
        this.ssdtCodeEmpfees = ssdtCodeEmpfees;
    }

    public Sobstc withSsdtCodeEmpfees(String ssdtCodeEmpfees) {
        this.ssdtCodeEmpfees = ssdtCodeEmpfees;
        return this;
    }

    /**
     * Predicted Student Load
     * <p>
     * Lineage reference object : SOBSTCS_PREDICTED_STULOAD
     * 
     */
    @JsonProperty("predictedStuload")
    public Double getPredictedStuload() {
        return predictedStuload;
    }

    /**
     * Predicted Student Load
     * <p>
     * Lineage reference object : SOBSTCS_PREDICTED_STULOAD
     * 
     */
    @JsonProperty("predictedStuload")
    public void setPredictedStuload(Double predictedStuload) {
        this.predictedStuload = predictedStuload;
    }

    public Sobstc withPredictedStuload(Double predictedStuload) {
        this.predictedStuload = predictedStuload;
        return this;
    }

    /**
     * Fee Method
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_FEEMETHOD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeemethod")
    public String getSsdtCodeFeemethod() {
        return ssdtCodeFeemethod;
    }

    /**
     * Fee Method
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_FEEMETHOD, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeemethod")
    public void setSsdtCodeFeemethod(String ssdtCodeFeemethod) {
        this.ssdtCodeFeemethod = ssdtCodeFeemethod;
    }

    public Sobstc withSsdtCodeFeemethod(String ssdtCodeFeemethod) {
        this.ssdtCodeFeemethod = ssdtCodeFeemethod;
        return this;
    }

    /**
     * Reason for Student Course Session Ending
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_RSNSCSEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRsnscsend")
    public String getSsdtCodeRsnscsend() {
        return ssdtCodeRsnscsend;
    }

    /**
     * Reason for Student Course Session Ending
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_RSNSCSEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRsnscsend")
    public void setSsdtCodeRsnscsend(String ssdtCodeRsnscsend) {
        this.ssdtCodeRsnscsend = ssdtCodeRsnscsend;
    }

    public Sobstc withSsdtCodeRsnscsend(String ssdtCodeRsnscsend) {
        this.ssdtCodeRsnscsend = ssdtCodeRsnscsend;
        return this;
    }

    @JsonProperty("ssdtCodeEmpfeesSt")
    public String getSsdtCodeEmpfeesSt() {
        return ssdtCodeEmpfeesSt;
    }

    @JsonProperty("ssdtCodeEmpfeesSt")
    public void setSsdtCodeEmpfeesSt(String ssdtCodeEmpfeesSt) {
        this.ssdtCodeEmpfeesSt = ssdtCodeEmpfeesSt;
    }

    public Sobstc withSsdtCodeEmpfeesSt(String ssdtCodeEmpfeesSt) {
        this.ssdtCodeEmpfeesSt = ssdtCodeEmpfeesSt;
        return this;
    }

    @JsonProperty("ssdtCodeInvoiceidSt")
    public String getSsdtCodeInvoiceidSt() {
        return ssdtCodeInvoiceidSt;
    }

    @JsonProperty("ssdtCodeInvoiceidSt")
    public void setSsdtCodeInvoiceidSt(String ssdtCodeInvoiceidSt) {
        this.ssdtCodeInvoiceidSt = ssdtCodeInvoiceidSt;
    }

    public Sobstc withSsdtCodeInvoiceidSt(String ssdtCodeInvoiceidSt) {
        this.ssdtCodeInvoiceidSt = ssdtCodeInvoiceidSt;
        return this;
    }

    /**
     * Preparatory Student Course Session Flag
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PREPFLAG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrepflag")
    public String getSsdtCodePrepflag() {
        return ssdtCodePrepflag;
    }

    /**
     * Preparatory Student Course Session Flag
     * <p>
     * Lineage reference object : SOBSTCS_SSDT_CODE_PREPFLAG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrepflag")
    public void setSsdtCodePrepflag(String ssdtCodePrepflag) {
        this.ssdtCodePrepflag = ssdtCodePrepflag;
    }

    public Sobstc withSsdtCodePrepflag(String ssdtCodePrepflag) {
        this.ssdtCodePrepflag = ssdtCodePrepflag;
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

    public Sobstc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobstc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("sessionYearId");
        sb.append('=');
        sb.append(((this.sessionYearId == null)?"<null>":this.sessionYearId));
        sb.append(',');
        sb.append("ssdtCodePgrlangidSt");
        sb.append('=');
        sb.append(((this.ssdtCodePgrlangidSt == null)?"<null>":this.ssdtCodePgrlangidSt));
        sb.append(',');
        sb.append("ssdtCodeStudyabroadSt");
        sb.append('=');
        sb.append(((this.ssdtCodeStudyabroadSt == null)?"<null>":this.ssdtCodeStudyabroadSt));
        sb.append(',');
        sb.append("scsEndDate");
        sb.append('=');
        sb.append(((this.scsEndDate == null)?"<null>":this.scsEndDate));
        sb.append(',');
        sb.append("ssdtCodeScsmode");
        sb.append('=');
        sb.append(((this.ssdtCodeScsmode == null)?"<null>":this.ssdtCodeScsmode));
        sb.append(',');
        sb.append("studentLoad");
        sb.append('=');
        sb.append(((this.studentLoad == null)?"<null>":this.studentLoad));
        sb.append(',');
        sb.append("ssdtCodeRsnscsendSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRsnscsendSt == null)?"<null>":this.ssdtCodeRsnscsendSt));
        sb.append(',');
        sb.append("invoiceFeeAmnt");
        sb.append('=');
        sb.append(((this.invoiceFeeAmnt == null)?"<null>":this.invoiceFeeAmnt));
        sb.append(',');
        sb.append("ssdtCodeFeemethodSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFeemethodSt == null)?"<null>":this.ssdtCodeFeemethodSt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("expectedEndDate");
        sb.append('=');
        sb.append(((this.expectedEndDate == null)?"<null>":this.expectedEndDate));
        sb.append(',');
        sb.append("ssdtCodeIntercltn");
        sb.append('=');
        sb.append(((this.ssdtCodeIntercltn == null)?"<null>":this.ssdtCodeIntercltn));
        sb.append(',');
        sb.append("ssdtCodePlacement");
        sb.append('=');
        sb.append(((this.ssdtCodePlacement == null)?"<null>":this.ssdtCodePlacement));
        sb.append(',');
        sb.append("ssdtCodePrepflagSt");
        sb.append('=');
        sb.append(((this.ssdtCodePrepflagSt == null)?"<null>":this.ssdtCodePrepflagSt));
        sb.append(',');
        sb.append("ssdtCodePlacementSt");
        sb.append('=');
        sb.append(((this.ssdtCodePlacementSt == null)?"<null>":this.ssdtCodePlacementSt));
        sb.append(',');
        sb.append("intendedThesisTitle");
        sb.append('=');
        sb.append(((this.intendedThesisTitle == null)?"<null>":this.intendedThesisTitle));
        sb.append(',');
        sb.append("courseId");
        sb.append('=');
        sb.append(((this.courseId == null)?"<null>":this.courseId));
        sb.append(',');
        sb.append("ssdtCodeIntercltnSt");
        sb.append('=');
        sb.append(((this.ssdtCodeIntercltnSt == null)?"<null>":this.ssdtCodeIntercltnSt));
        sb.append(',');
        sb.append("yearPrg");
        sb.append('=');
        sb.append(((this.yearPrg == null)?"<null>":this.yearPrg));
        sb.append(',');
        sb.append("ssdtCodeInvoiceid");
        sb.append('=');
        sb.append(((this.ssdtCodeInvoiceid == null)?"<null>":this.ssdtCodeInvoiceid));
        sb.append(',');
        sb.append("ssdtCodePgrlangid");
        sb.append('=');
        sb.append(((this.ssdtCodePgrlangid == null)?"<null>":this.ssdtCodePgrlangid));
        sb.append(',');
        sb.append("pgrlangpcnt");
        sb.append('=');
        sb.append(((this.pgrlangpcnt == null)?"<null>":this.pgrlangpcnt));
        sb.append(',');
        sb.append("scsFeeAmnt");
        sb.append('=');
        sb.append(((this.scsFeeAmnt == null)?"<null>":this.scsFeeAmnt));
        sb.append(',');
        sb.append("ssdtCodeScsmodeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeScsmodeSt == null)?"<null>":this.ssdtCodeScsmodeSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeStudyabroad");
        sb.append('=');
        sb.append(((this.ssdtCodeStudyabroad == null)?"<null>":this.ssdtCodeStudyabroad));
        sb.append(',');
        sb.append("scsStartDate");
        sb.append('=');
        sb.append(((this.scsStartDate == null)?"<null>":this.scsStartDate));
        sb.append(',');
        sb.append("phdSub");
        sb.append('=');
        sb.append(((this.phdSub == null)?"<null>":this.phdSub));
        sb.append(',');
        sb.append("ssdtCodeEmpfees");
        sb.append('=');
        sb.append(((this.ssdtCodeEmpfees == null)?"<null>":this.ssdtCodeEmpfees));
        sb.append(',');
        sb.append("predictedStuload");
        sb.append('=');
        sb.append(((this.predictedStuload == null)?"<null>":this.predictedStuload));
        sb.append(',');
        sb.append("ssdtCodeFeemethod");
        sb.append('=');
        sb.append(((this.ssdtCodeFeemethod == null)?"<null>":this.ssdtCodeFeemethod));
        sb.append(',');
        sb.append("ssdtCodeRsnscsend");
        sb.append('=');
        sb.append(((this.ssdtCodeRsnscsend == null)?"<null>":this.ssdtCodeRsnscsend));
        sb.append(',');
        sb.append("ssdtCodeEmpfeesSt");
        sb.append('=');
        sb.append(((this.ssdtCodeEmpfeesSt == null)?"<null>":this.ssdtCodeEmpfeesSt));
        sb.append(',');
        sb.append("ssdtCodeInvoiceidSt");
        sb.append('=');
        sb.append(((this.ssdtCodeInvoiceidSt == null)?"<null>":this.ssdtCodeInvoiceidSt));
        sb.append(',');
        sb.append("ssdtCodePrepflag");
        sb.append('=');
        sb.append(((this.ssdtCodePrepflag == null)?"<null>":this.ssdtCodePrepflag));
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
        result = ((result* 31)+((this.stuCourseSessionId == null)? 0 :this.stuCourseSessionId.hashCode()));
        result = ((result* 31)+((this.sessionYearId == null)? 0 :this.sessionYearId.hashCode()));
        result = ((result* 31)+((this.ssdtCodePgrlangidSt == null)? 0 :this.ssdtCodePgrlangidSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeStudyabroadSt == null)? 0 :this.ssdtCodeStudyabroadSt.hashCode()));
        result = ((result* 31)+((this.scsEndDate == null)? 0 :this.scsEndDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeScsmode == null)? 0 :this.ssdtCodeScsmode.hashCode()));
        result = ((result* 31)+((this.studentLoad == null)? 0 :this.studentLoad.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRsnscsendSt == null)? 0 :this.ssdtCodeRsnscsendSt.hashCode()));
        result = ((result* 31)+((this.invoiceFeeAmnt == null)? 0 :this.invoiceFeeAmnt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeemethodSt == null)? 0 :this.ssdtCodeFeemethodSt.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.expectedEndDate == null)? 0 :this.expectedEndDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeIntercltn == null)? 0 :this.ssdtCodeIntercltn.hashCode()));
        result = ((result* 31)+((this.ssdtCodePlacement == null)? 0 :this.ssdtCodePlacement.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrepflagSt == null)? 0 :this.ssdtCodePrepflagSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodePlacementSt == null)? 0 :this.ssdtCodePlacementSt.hashCode()));
        result = ((result* 31)+((this.intendedThesisTitle == null)? 0 :this.intendedThesisTitle.hashCode()));
        result = ((result* 31)+((this.courseId == null)? 0 :this.courseId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeIntercltnSt == null)? 0 :this.ssdtCodeIntercltnSt.hashCode()));
        result = ((result* 31)+((this.yearPrg == null)? 0 :this.yearPrg.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInvoiceid == null)? 0 :this.ssdtCodeInvoiceid.hashCode()));
        result = ((result* 31)+((this.ssdtCodePgrlangid == null)? 0 :this.ssdtCodePgrlangid.hashCode()));
        result = ((result* 31)+((this.pgrlangpcnt == null)? 0 :this.pgrlangpcnt.hashCode()));
        result = ((result* 31)+((this.scsFeeAmnt == null)? 0 :this.scsFeeAmnt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeScsmodeSt == null)? 0 :this.ssdtCodeScsmodeSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeStudyabroad == null)? 0 :this.ssdtCodeStudyabroad.hashCode()));
        result = ((result* 31)+((this.scsStartDate == null)? 0 :this.scsStartDate.hashCode()));
        result = ((result* 31)+((this.phdSub == null)? 0 :this.phdSub.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEmpfees == null)? 0 :this.ssdtCodeEmpfees.hashCode()));
        result = ((result* 31)+((this.predictedStuload == null)? 0 :this.predictedStuload.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeemethod == null)? 0 :this.ssdtCodeFeemethod.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRsnscsend == null)? 0 :this.ssdtCodeRsnscsend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEmpfeesSt == null)? 0 :this.ssdtCodeEmpfeesSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInvoiceidSt == null)? 0 :this.ssdtCodeInvoiceidSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrepflag == null)? 0 :this.ssdtCodePrepflag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobstc) == false) {
            return false;
        }
        Sobstc rhs = ((Sobstc) other);
        return ((((((((((((((((((((((((((((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.sessionYearId == rhs.sessionYearId)||((this.sessionYearId!= null)&&this.sessionYearId.equals(rhs.sessionYearId))))&&((this.ssdtCodePgrlangidSt == rhs.ssdtCodePgrlangidSt)||((this.ssdtCodePgrlangidSt!= null)&&this.ssdtCodePgrlangidSt.equals(rhs.ssdtCodePgrlangidSt))))&&((this.ssdtCodeStudyabroadSt == rhs.ssdtCodeStudyabroadSt)||((this.ssdtCodeStudyabroadSt!= null)&&this.ssdtCodeStudyabroadSt.equals(rhs.ssdtCodeStudyabroadSt))))&&((this.scsEndDate == rhs.scsEndDate)||((this.scsEndDate!= null)&&this.scsEndDate.equals(rhs.scsEndDate))))&&((this.ssdtCodeScsmode == rhs.ssdtCodeScsmode)||((this.ssdtCodeScsmode!= null)&&this.ssdtCodeScsmode.equals(rhs.ssdtCodeScsmode))))&&((this.studentLoad == rhs.studentLoad)||((this.studentLoad!= null)&&this.studentLoad.equals(rhs.studentLoad))))&&((this.ssdtCodeRsnscsendSt == rhs.ssdtCodeRsnscsendSt)||((this.ssdtCodeRsnscsendSt!= null)&&this.ssdtCodeRsnscsendSt.equals(rhs.ssdtCodeRsnscsendSt))))&&((this.invoiceFeeAmnt == rhs.invoiceFeeAmnt)||((this.invoiceFeeAmnt!= null)&&this.invoiceFeeAmnt.equals(rhs.invoiceFeeAmnt))))&&((this.ssdtCodeFeemethodSt == rhs.ssdtCodeFeemethodSt)||((this.ssdtCodeFeemethodSt!= null)&&this.ssdtCodeFeemethodSt.equals(rhs.ssdtCodeFeemethodSt))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.expectedEndDate == rhs.expectedEndDate)||((this.expectedEndDate!= null)&&this.expectedEndDate.equals(rhs.expectedEndDate))))&&((this.ssdtCodeIntercltn == rhs.ssdtCodeIntercltn)||((this.ssdtCodeIntercltn!= null)&&this.ssdtCodeIntercltn.equals(rhs.ssdtCodeIntercltn))))&&((this.ssdtCodePlacement == rhs.ssdtCodePlacement)||((this.ssdtCodePlacement!= null)&&this.ssdtCodePlacement.equals(rhs.ssdtCodePlacement))))&&((this.ssdtCodePrepflagSt == rhs.ssdtCodePrepflagSt)||((this.ssdtCodePrepflagSt!= null)&&this.ssdtCodePrepflagSt.equals(rhs.ssdtCodePrepflagSt))))&&((this.ssdtCodePlacementSt == rhs.ssdtCodePlacementSt)||((this.ssdtCodePlacementSt!= null)&&this.ssdtCodePlacementSt.equals(rhs.ssdtCodePlacementSt))))&&((this.intendedThesisTitle == rhs.intendedThesisTitle)||((this.intendedThesisTitle!= null)&&this.intendedThesisTitle.equals(rhs.intendedThesisTitle))))&&((this.courseId == rhs.courseId)||((this.courseId!= null)&&this.courseId.equals(rhs.courseId))))&&((this.ssdtCodeIntercltnSt == rhs.ssdtCodeIntercltnSt)||((this.ssdtCodeIntercltnSt!= null)&&this.ssdtCodeIntercltnSt.equals(rhs.ssdtCodeIntercltnSt))))&&((this.yearPrg == rhs.yearPrg)||((this.yearPrg!= null)&&this.yearPrg.equals(rhs.yearPrg))))&&((this.ssdtCodeInvoiceid == rhs.ssdtCodeInvoiceid)||((this.ssdtCodeInvoiceid!= null)&&this.ssdtCodeInvoiceid.equals(rhs.ssdtCodeInvoiceid))))&&((this.ssdtCodePgrlangid == rhs.ssdtCodePgrlangid)||((this.ssdtCodePgrlangid!= null)&&this.ssdtCodePgrlangid.equals(rhs.ssdtCodePgrlangid))))&&((this.pgrlangpcnt == rhs.pgrlangpcnt)||((this.pgrlangpcnt!= null)&&this.pgrlangpcnt.equals(rhs.pgrlangpcnt))))&&((this.scsFeeAmnt == rhs.scsFeeAmnt)||((this.scsFeeAmnt!= null)&&this.scsFeeAmnt.equals(rhs.scsFeeAmnt))))&&((this.ssdtCodeScsmodeSt == rhs.ssdtCodeScsmodeSt)||((this.ssdtCodeScsmodeSt!= null)&&this.ssdtCodeScsmodeSt.equals(rhs.ssdtCodeScsmodeSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeStudyabroad == rhs.ssdtCodeStudyabroad)||((this.ssdtCodeStudyabroad!= null)&&this.ssdtCodeStudyabroad.equals(rhs.ssdtCodeStudyabroad))))&&((this.scsStartDate == rhs.scsStartDate)||((this.scsStartDate!= null)&&this.scsStartDate.equals(rhs.scsStartDate))))&&((this.phdSub == rhs.phdSub)||((this.phdSub!= null)&&this.phdSub.equals(rhs.phdSub))))&&((this.ssdtCodeEmpfees == rhs.ssdtCodeEmpfees)||((this.ssdtCodeEmpfees!= null)&&this.ssdtCodeEmpfees.equals(rhs.ssdtCodeEmpfees))))&&((this.predictedStuload == rhs.predictedStuload)||((this.predictedStuload!= null)&&this.predictedStuload.equals(rhs.predictedStuload))))&&((this.ssdtCodeFeemethod == rhs.ssdtCodeFeemethod)||((this.ssdtCodeFeemethod!= null)&&this.ssdtCodeFeemethod.equals(rhs.ssdtCodeFeemethod))))&&((this.ssdtCodeRsnscsend == rhs.ssdtCodeRsnscsend)||((this.ssdtCodeRsnscsend!= null)&&this.ssdtCodeRsnscsend.equals(rhs.ssdtCodeRsnscsend))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeEmpfeesSt == rhs.ssdtCodeEmpfeesSt)||((this.ssdtCodeEmpfeesSt!= null)&&this.ssdtCodeEmpfeesSt.equals(rhs.ssdtCodeEmpfeesSt))))&&((this.ssdtCodeInvoiceidSt == rhs.ssdtCodeInvoiceidSt)||((this.ssdtCodeInvoiceidSt!= null)&&this.ssdtCodeInvoiceidSt.equals(rhs.ssdtCodeInvoiceidSt))))&&((this.ssdtCodePrepflag == rhs.ssdtCodePrepflag)||((this.ssdtCodePrepflag!= null)&&this.ssdtCodePrepflag.equals(rhs.ssdtCodePrepflag))));
    }

}
