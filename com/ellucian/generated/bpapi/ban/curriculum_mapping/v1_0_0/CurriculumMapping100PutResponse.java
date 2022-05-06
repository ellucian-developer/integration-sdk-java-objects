
package com.ellucian.generated.bpapi.ban.curriculum_mapping.v1_0_0;

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
    "expAcceptPercentage",
    "programDesc",
    "helpTypes",
    "admitCategoryCode",
    "sbgiCode",
    "program",
    "chrtCodeDesc",
    "majrCode",
    "termCodeDesc",
    "rateCode",
    "expiryDate",
    "sessCode",
    "activityDate",
    "admitCourseCode",
    "chrtCode",
    "campCode",
    "activeInd",
    "recruiting",
    "campCodeDesc",
    "cricosCode",
    "stypCodeDesc",
    "enrolled",
    "majrCodeDesc",
    "fullPartInd",
    "offers",
    "quotaLoad",
    "sbgiCodeDesc",
    "resdCodeDesc",
    "quotaCount",
    "resdCode",
    "admissions",
    "sessCodeDesc",
    "userId",
    "cricosCodeDesc",
    "ptrmCode",
    "nationalId",
    "crsCode",
    "ptrmCodeDesc",
    "stypCode",
    "enforceLapseDateInd",
    "admitCategoryCodeDesc",
    "rateCodeDesc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumMapping100PutResponse {

    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("expAcceptPercentage")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE")
    private Double expAcceptPercentage;
    @JsonProperty("programDesc")
    private String programDesc;
    /**
     * Help Types
     * <p>
     * 
     * 
     */
    @JsonProperty("helpTypes")
    private String helpTypes;
    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("admitCategoryCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL")
    private String admitCategoryCode;
    /**
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL")
    private String program;
    @JsonProperty("chrtCodeDesc")
    private String chrtCodeDesc;
    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR")
    private String majrCode;
    @JsonProperty("termCodeDesc")
    private String termCodeDesc;
    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("expiryDate")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_EXPIRY_DATE")
    private Date expiryDate;
    /**
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("admitCourseCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE")
    private String admitCourseCode;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ACTIVE_IND")
    private String activeInd;
    /**
     * Recruiting
     * <p>
     * 
     * 
     */
    @JsonProperty("recruiting")
    private String recruiting;
    @JsonProperty("campCodeDesc")
    private String campCodeDesc;
    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("cricosCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC")
    private String cricosCode;
    @JsonProperty("stypCodeDesc")
    private String stypCodeDesc;
    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("enrolled")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENROLLED")
    private Double enrolled;
    @JsonProperty("majrCodeDesc")
    private String majrCodeDesc;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("offers")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_OFFERS")
    private Double offers;
    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("quotaLoad")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_QUOTA_LOAD")
    private Double quotaLoad;
    @JsonProperty("sbgiCodeDesc")
    private String sbgiCodeDesc;
    @JsonProperty("resdCodeDesc")
    private String resdCodeDesc;
    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("quotaCount")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_QUOTA_COUNT")
    private Double quotaCount;
    /**
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Admissions
     * <p>
     * 
     * 
     */
    @JsonProperty("admissions")
    private String admissions;
    @JsonProperty("sessCodeDesc")
    private String sessCodeDesc;
    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_USER_ID")
    private String userId;
    @JsonProperty("cricosCodeDesc")
    private String cricosCodeDesc;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM")
    private String ptrmCode;
    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("nationalId")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_NATIONAL_ID")
    private String nationalId;
    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("crsCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRS_CODE")
    private String crsCode;
    @JsonProperty("ptrmCodeDesc")
    private String ptrmCodeDesc;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("enforceLapseDateInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND")
    private String enforceLapseDateInd;
    @JsonProperty("admitCategoryCodeDesc")
    private String admitCategoryCodeDesc;
    @JsonProperty("rateCodeDesc")
    private String rateCodeDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("expAcceptPercentage")
    public Double getExpAcceptPercentage() {
        return expAcceptPercentage;
    }

    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("expAcceptPercentage")
    public void setExpAcceptPercentage(Double expAcceptPercentage) {
        this.expAcceptPercentage = expAcceptPercentage;
    }

    public CurriculumMapping100PutResponse withExpAcceptPercentage(Double expAcceptPercentage) {
        this.expAcceptPercentage = expAcceptPercentage;
        return this;
    }

    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public CurriculumMapping100PutResponse withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    /**
     * Help Types
     * <p>
     * 
     * 
     */
    @JsonProperty("helpTypes")
    public String getHelpTypes() {
        return helpTypes;
    }

    /**
     * Help Types
     * <p>
     * 
     * 
     */
    @JsonProperty("helpTypes")
    public void setHelpTypes(String helpTypes) {
        this.helpTypes = helpTypes;
    }

    public CurriculumMapping100PutResponse withHelpTypes(String helpTypes) {
        this.helpTypes = helpTypes;
        return this;
    }

    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("admitCategoryCode")
    public String getAdmitCategoryCode() {
        return admitCategoryCode;
    }

    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("admitCategoryCode")
    public void setAdmitCategoryCode(String admitCategoryCode) {
        this.admitCategoryCode = admitCategoryCode;
    }

    public CurriculumMapping100PutResponse withAdmitCategoryCode(String admitCategoryCode) {
        this.admitCategoryCode = admitCategoryCode;
        return this;
    }

    /**
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public CurriculumMapping100PutResponse withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CurriculumMapping100PutResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("chrtCodeDesc")
    public String getChrtCodeDesc() {
        return chrtCodeDesc;
    }

    @JsonProperty("chrtCodeDesc")
    public void setChrtCodeDesc(String chrtCodeDesc) {
        this.chrtCodeDesc = chrtCodeDesc;
    }

    public CurriculumMapping100PutResponse withChrtCodeDesc(String chrtCodeDesc) {
        this.chrtCodeDesc = chrtCodeDesc;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public CurriculumMapping100PutResponse withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    @JsonProperty("termCodeDesc")
    public String getTermCodeDesc() {
        return termCodeDesc;
    }

    @JsonProperty("termCodeDesc")
    public void setTermCodeDesc(String termCodeDesc) {
        this.termCodeDesc = termCodeDesc;
    }

    public CurriculumMapping100PutResponse withTermCodeDesc(String termCodeDesc) {
        this.termCodeDesc = termCodeDesc;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public CurriculumMapping100PutResponse withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("expiryDate")
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("expiryDate")
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CurriculumMapping100PutResponse withExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public CurriculumMapping100PutResponse withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CurriculumMapping100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("admitCourseCode")
    public String getAdmitCourseCode() {
        return admitCourseCode;
    }

    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("admitCourseCode")
    public void setAdmitCourseCode(String admitCourseCode) {
        this.admitCourseCode = admitCourseCode;
    }

    public CurriculumMapping100PutResponse withAdmitCourseCode(String admitCourseCode) {
        this.admitCourseCode = admitCourseCode;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public CurriculumMapping100PutResponse withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CurriculumMapping100PutResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public CurriculumMapping100PutResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Recruiting
     * <p>
     * 
     * 
     */
    @JsonProperty("recruiting")
    public String getRecruiting() {
        return recruiting;
    }

    /**
     * Recruiting
     * <p>
     * 
     * 
     */
    @JsonProperty("recruiting")
    public void setRecruiting(String recruiting) {
        this.recruiting = recruiting;
    }

    public CurriculumMapping100PutResponse withRecruiting(String recruiting) {
        this.recruiting = recruiting;
        return this;
    }

    @JsonProperty("campCodeDesc")
    public String getCampCodeDesc() {
        return campCodeDesc;
    }

    @JsonProperty("campCodeDesc")
    public void setCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
    }

    public CurriculumMapping100PutResponse withCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
        return this;
    }

    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("cricosCode")
    public String getCricosCode() {
        return cricosCode;
    }

    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("cricosCode")
    public void setCricosCode(String cricosCode) {
        this.cricosCode = cricosCode;
    }

    public CurriculumMapping100PutResponse withCricosCode(String cricosCode) {
        this.cricosCode = cricosCode;
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

    public CurriculumMapping100PutResponse withStypCodeDesc(String stypCodeDesc) {
        this.stypCodeDesc = stypCodeDesc;
        return this;
    }

    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("enrolled")
    public Double getEnrolled() {
        return enrolled;
    }

    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("enrolled")
    public void setEnrolled(Double enrolled) {
        this.enrolled = enrolled;
    }

    public CurriculumMapping100PutResponse withEnrolled(Double enrolled) {
        this.enrolled = enrolled;
        return this;
    }

    @JsonProperty("majrCodeDesc")
    public String getMajrCodeDesc() {
        return majrCodeDesc;
    }

    @JsonProperty("majrCodeDesc")
    public void setMajrCodeDesc(String majrCodeDesc) {
        this.majrCodeDesc = majrCodeDesc;
    }

    public CurriculumMapping100PutResponse withMajrCodeDesc(String majrCodeDesc) {
        this.majrCodeDesc = majrCodeDesc;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public CurriculumMapping100PutResponse withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("offers")
    public Double getOffers() {
        return offers;
    }

    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("offers")
    public void setOffers(Double offers) {
        this.offers = offers;
    }

    public CurriculumMapping100PutResponse withOffers(Double offers) {
        this.offers = offers;
        return this;
    }

    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("quotaLoad")
    public Double getQuotaLoad() {
        return quotaLoad;
    }

    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("quotaLoad")
    public void setQuotaLoad(Double quotaLoad) {
        this.quotaLoad = quotaLoad;
    }

    public CurriculumMapping100PutResponse withQuotaLoad(Double quotaLoad) {
        this.quotaLoad = quotaLoad;
        return this;
    }

    @JsonProperty("sbgiCodeDesc")
    public String getSbgiCodeDesc() {
        return sbgiCodeDesc;
    }

    @JsonProperty("sbgiCodeDesc")
    public void setSbgiCodeDesc(String sbgiCodeDesc) {
        this.sbgiCodeDesc = sbgiCodeDesc;
    }

    public CurriculumMapping100PutResponse withSbgiCodeDesc(String sbgiCodeDesc) {
        this.sbgiCodeDesc = sbgiCodeDesc;
        return this;
    }

    @JsonProperty("resdCodeDesc")
    public String getResdCodeDesc() {
        return resdCodeDesc;
    }

    @JsonProperty("resdCodeDesc")
    public void setResdCodeDesc(String resdCodeDesc) {
        this.resdCodeDesc = resdCodeDesc;
    }

    public CurriculumMapping100PutResponse withResdCodeDesc(String resdCodeDesc) {
        this.resdCodeDesc = resdCodeDesc;
        return this;
    }

    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("quotaCount")
    public Double getQuotaCount() {
        return quotaCount;
    }

    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("quotaCount")
    public void setQuotaCount(Double quotaCount) {
        this.quotaCount = quotaCount;
    }

    public CurriculumMapping100PutResponse withQuotaCount(Double quotaCount) {
        this.quotaCount = quotaCount;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public CurriculumMapping100PutResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Admissions
     * <p>
     * 
     * 
     */
    @JsonProperty("admissions")
    public String getAdmissions() {
        return admissions;
    }

    /**
     * Admissions
     * <p>
     * 
     * 
     */
    @JsonProperty("admissions")
    public void setAdmissions(String admissions) {
        this.admissions = admissions;
    }

    public CurriculumMapping100PutResponse withAdmissions(String admissions) {
        this.admissions = admissions;
        return this;
    }

    @JsonProperty("sessCodeDesc")
    public String getSessCodeDesc() {
        return sessCodeDesc;
    }

    @JsonProperty("sessCodeDesc")
    public void setSessCodeDesc(String sessCodeDesc) {
        this.sessCodeDesc = sessCodeDesc;
    }

    public CurriculumMapping100PutResponse withSessCodeDesc(String sessCodeDesc) {
        this.sessCodeDesc = sessCodeDesc;
        return this;
    }

    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CurriculumMapping100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("cricosCodeDesc")
    public String getCricosCodeDesc() {
        return cricosCodeDesc;
    }

    @JsonProperty("cricosCodeDesc")
    public void setCricosCodeDesc(String cricosCodeDesc) {
        this.cricosCodeDesc = cricosCodeDesc;
    }

    public CurriculumMapping100PutResponse withCricosCodeDesc(String cricosCodeDesc) {
        this.cricosCodeDesc = cricosCodeDesc;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public CurriculumMapping100PutResponse withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("nationalId")
    public String getNationalId() {
        return nationalId;
    }

    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("nationalId")
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public CurriculumMapping100PutResponse withNationalId(String nationalId) {
        this.nationalId = nationalId;
        return this;
    }

    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("crsCode")
    public String getCrsCode() {
        return crsCode;
    }

    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("crsCode")
    public void setCrsCode(String crsCode) {
        this.crsCode = crsCode;
    }

    public CurriculumMapping100PutResponse withCrsCode(String crsCode) {
        this.crsCode = crsCode;
        return this;
    }

    @JsonProperty("ptrmCodeDesc")
    public String getPtrmCodeDesc() {
        return ptrmCodeDesc;
    }

    @JsonProperty("ptrmCodeDesc")
    public void setPtrmCodeDesc(String ptrmCodeDesc) {
        this.ptrmCodeDesc = ptrmCodeDesc;
    }

    public CurriculumMapping100PutResponse withPtrmCodeDesc(String ptrmCodeDesc) {
        this.ptrmCodeDesc = ptrmCodeDesc;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public CurriculumMapping100PutResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("enforceLapseDateInd")
    public String getEnforceLapseDateInd() {
        return enforceLapseDateInd;
    }

    /**
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("enforceLapseDateInd")
    public void setEnforceLapseDateInd(String enforceLapseDateInd) {
        this.enforceLapseDateInd = enforceLapseDateInd;
    }

    public CurriculumMapping100PutResponse withEnforceLapseDateInd(String enforceLapseDateInd) {
        this.enforceLapseDateInd = enforceLapseDateInd;
        return this;
    }

    @JsonProperty("admitCategoryCodeDesc")
    public String getAdmitCategoryCodeDesc() {
        return admitCategoryCodeDesc;
    }

    @JsonProperty("admitCategoryCodeDesc")
    public void setAdmitCategoryCodeDesc(String admitCategoryCodeDesc) {
        this.admitCategoryCodeDesc = admitCategoryCodeDesc;
    }

    public CurriculumMapping100PutResponse withAdmitCategoryCodeDesc(String admitCategoryCodeDesc) {
        this.admitCategoryCodeDesc = admitCategoryCodeDesc;
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

    public CurriculumMapping100PutResponse withRateCodeDesc(String rateCodeDesc) {
        this.rateCodeDesc = rateCodeDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CurriculumMapping100PutResponse withTermCode(String termCode) {
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

    public CurriculumMapping100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumMapping100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expAcceptPercentage");
        sb.append('=');
        sb.append(((this.expAcceptPercentage == null)?"<null>":this.expAcceptPercentage));
        sb.append(',');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("helpTypes");
        sb.append('=');
        sb.append(((this.helpTypes == null)?"<null>":this.helpTypes));
        sb.append(',');
        sb.append("admitCategoryCode");
        sb.append('=');
        sb.append(((this.admitCategoryCode == null)?"<null>":this.admitCategoryCode));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("chrtCodeDesc");
        sb.append('=');
        sb.append(((this.chrtCodeDesc == null)?"<null>":this.chrtCodeDesc));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("termCodeDesc");
        sb.append('=');
        sb.append(((this.termCodeDesc == null)?"<null>":this.termCodeDesc));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("admitCourseCode");
        sb.append('=');
        sb.append(((this.admitCourseCode == null)?"<null>":this.admitCourseCode));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("recruiting");
        sb.append('=');
        sb.append(((this.recruiting == null)?"<null>":this.recruiting));
        sb.append(',');
        sb.append("campCodeDesc");
        sb.append('=');
        sb.append(((this.campCodeDesc == null)?"<null>":this.campCodeDesc));
        sb.append(',');
        sb.append("cricosCode");
        sb.append('=');
        sb.append(((this.cricosCode == null)?"<null>":this.cricosCode));
        sb.append(',');
        sb.append("stypCodeDesc");
        sb.append('=');
        sb.append(((this.stypCodeDesc == null)?"<null>":this.stypCodeDesc));
        sb.append(',');
        sb.append("enrolled");
        sb.append('=');
        sb.append(((this.enrolled == null)?"<null>":this.enrolled));
        sb.append(',');
        sb.append("majrCodeDesc");
        sb.append('=');
        sb.append(((this.majrCodeDesc == null)?"<null>":this.majrCodeDesc));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("offers");
        sb.append('=');
        sb.append(((this.offers == null)?"<null>":this.offers));
        sb.append(',');
        sb.append("quotaLoad");
        sb.append('=');
        sb.append(((this.quotaLoad == null)?"<null>":this.quotaLoad));
        sb.append(',');
        sb.append("sbgiCodeDesc");
        sb.append('=');
        sb.append(((this.sbgiCodeDesc == null)?"<null>":this.sbgiCodeDesc));
        sb.append(',');
        sb.append("resdCodeDesc");
        sb.append('=');
        sb.append(((this.resdCodeDesc == null)?"<null>":this.resdCodeDesc));
        sb.append(',');
        sb.append("quotaCount");
        sb.append('=');
        sb.append(((this.quotaCount == null)?"<null>":this.quotaCount));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("admissions");
        sb.append('=');
        sb.append(((this.admissions == null)?"<null>":this.admissions));
        sb.append(',');
        sb.append("sessCodeDesc");
        sb.append('=');
        sb.append(((this.sessCodeDesc == null)?"<null>":this.sessCodeDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("cricosCodeDesc");
        sb.append('=');
        sb.append(((this.cricosCodeDesc == null)?"<null>":this.cricosCodeDesc));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("nationalId");
        sb.append('=');
        sb.append(((this.nationalId == null)?"<null>":this.nationalId));
        sb.append(',');
        sb.append("crsCode");
        sb.append('=');
        sb.append(((this.crsCode == null)?"<null>":this.crsCode));
        sb.append(',');
        sb.append("ptrmCodeDesc");
        sb.append('=');
        sb.append(((this.ptrmCodeDesc == null)?"<null>":this.ptrmCodeDesc));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("enforceLapseDateInd");
        sb.append('=');
        sb.append(((this.enforceLapseDateInd == null)?"<null>":this.enforceLapseDateInd));
        sb.append(',');
        sb.append("admitCategoryCodeDesc");
        sb.append('=');
        sb.append(((this.admitCategoryCodeDesc == null)?"<null>":this.admitCategoryCodeDesc));
        sb.append(',');
        sb.append("rateCodeDesc");
        sb.append('=');
        sb.append(((this.rateCodeDesc == null)?"<null>":this.rateCodeDesc));
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
        result = ((result* 31)+((this.expAcceptPercentage == null)? 0 :this.expAcceptPercentage.hashCode()));
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.helpTypes == null)? 0 :this.helpTypes.hashCode()));
        result = ((result* 31)+((this.admitCategoryCode == null)? 0 :this.admitCategoryCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.chrtCodeDesc == null)? 0 :this.chrtCodeDesc.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.termCodeDesc == null)? 0 :this.termCodeDesc.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.admitCourseCode == null)? 0 :this.admitCourseCode.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.recruiting == null)? 0 :this.recruiting.hashCode()));
        result = ((result* 31)+((this.campCodeDesc == null)? 0 :this.campCodeDesc.hashCode()));
        result = ((result* 31)+((this.cricosCode == null)? 0 :this.cricosCode.hashCode()));
        result = ((result* 31)+((this.stypCodeDesc == null)? 0 :this.stypCodeDesc.hashCode()));
        result = ((result* 31)+((this.enrolled == null)? 0 :this.enrolled.hashCode()));
        result = ((result* 31)+((this.majrCodeDesc == null)? 0 :this.majrCodeDesc.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.offers == null)? 0 :this.offers.hashCode()));
        result = ((result* 31)+((this.quotaLoad == null)? 0 :this.quotaLoad.hashCode()));
        result = ((result* 31)+((this.sbgiCodeDesc == null)? 0 :this.sbgiCodeDesc.hashCode()));
        result = ((result* 31)+((this.resdCodeDesc == null)? 0 :this.resdCodeDesc.hashCode()));
        result = ((result* 31)+((this.quotaCount == null)? 0 :this.quotaCount.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.admissions == null)? 0 :this.admissions.hashCode()));
        result = ((result* 31)+((this.sessCodeDesc == null)? 0 :this.sessCodeDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.cricosCodeDesc == null)? 0 :this.cricosCodeDesc.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.nationalId == null)? 0 :this.nationalId.hashCode()));
        result = ((result* 31)+((this.crsCode == null)? 0 :this.crsCode.hashCode()));
        result = ((result* 31)+((this.ptrmCodeDesc == null)? 0 :this.ptrmCodeDesc.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enforceLapseDateInd == null)? 0 :this.enforceLapseDateInd.hashCode()));
        result = ((result* 31)+((this.admitCategoryCodeDesc == null)? 0 :this.admitCategoryCodeDesc.hashCode()));
        result = ((result* 31)+((this.rateCodeDesc == null)? 0 :this.rateCodeDesc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumMapping100PutResponse) == false) {
            return false;
        }
        CurriculumMapping100PutResponse rhs = ((CurriculumMapping100PutResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.expAcceptPercentage == rhs.expAcceptPercentage)||((this.expAcceptPercentage!= null)&&this.expAcceptPercentage.equals(rhs.expAcceptPercentage)))&&((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc))))&&((this.helpTypes == rhs.helpTypes)||((this.helpTypes!= null)&&this.helpTypes.equals(rhs.helpTypes))))&&((this.admitCategoryCode == rhs.admitCategoryCode)||((this.admitCategoryCode!= null)&&this.admitCategoryCode.equals(rhs.admitCategoryCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.chrtCodeDesc == rhs.chrtCodeDesc)||((this.chrtCodeDesc!= null)&&this.chrtCodeDesc.equals(rhs.chrtCodeDesc))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.termCodeDesc == rhs.termCodeDesc)||((this.termCodeDesc!= null)&&this.termCodeDesc.equals(rhs.termCodeDesc))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.admitCourseCode == rhs.admitCourseCode)||((this.admitCourseCode!= null)&&this.admitCourseCode.equals(rhs.admitCourseCode))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.recruiting == rhs.recruiting)||((this.recruiting!= null)&&this.recruiting.equals(rhs.recruiting))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.cricosCode == rhs.cricosCode)||((this.cricosCode!= null)&&this.cricosCode.equals(rhs.cricosCode))))&&((this.stypCodeDesc == rhs.stypCodeDesc)||((this.stypCodeDesc!= null)&&this.stypCodeDesc.equals(rhs.stypCodeDesc))))&&((this.enrolled == rhs.enrolled)||((this.enrolled!= null)&&this.enrolled.equals(rhs.enrolled))))&&((this.majrCodeDesc == rhs.majrCodeDesc)||((this.majrCodeDesc!= null)&&this.majrCodeDesc.equals(rhs.majrCodeDesc))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.offers == rhs.offers)||((this.offers!= null)&&this.offers.equals(rhs.offers))))&&((this.quotaLoad == rhs.quotaLoad)||((this.quotaLoad!= null)&&this.quotaLoad.equals(rhs.quotaLoad))))&&((this.sbgiCodeDesc == rhs.sbgiCodeDesc)||((this.sbgiCodeDesc!= null)&&this.sbgiCodeDesc.equals(rhs.sbgiCodeDesc))))&&((this.resdCodeDesc == rhs.resdCodeDesc)||((this.resdCodeDesc!= null)&&this.resdCodeDesc.equals(rhs.resdCodeDesc))))&&((this.quotaCount == rhs.quotaCount)||((this.quotaCount!= null)&&this.quotaCount.equals(rhs.quotaCount))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.admissions == rhs.admissions)||((this.admissions!= null)&&this.admissions.equals(rhs.admissions))))&&((this.sessCodeDesc == rhs.sessCodeDesc)||((this.sessCodeDesc!= null)&&this.sessCodeDesc.equals(rhs.sessCodeDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.cricosCodeDesc == rhs.cricosCodeDesc)||((this.cricosCodeDesc!= null)&&this.cricosCodeDesc.equals(rhs.cricosCodeDesc))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.nationalId == rhs.nationalId)||((this.nationalId!= null)&&this.nationalId.equals(rhs.nationalId))))&&((this.crsCode == rhs.crsCode)||((this.crsCode!= null)&&this.crsCode.equals(rhs.crsCode))))&&((this.ptrmCodeDesc == rhs.ptrmCodeDesc)||((this.ptrmCodeDesc!= null)&&this.ptrmCodeDesc.equals(rhs.ptrmCodeDesc))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enforceLapseDateInd == rhs.enforceLapseDateInd)||((this.enforceLapseDateInd!= null)&&this.enforceLapseDateInd.equals(rhs.enforceLapseDateInd))))&&((this.admitCategoryCodeDesc == rhs.admitCategoryCodeDesc)||((this.admitCategoryCodeDesc!= null)&&this.admitCategoryCodeDesc.equals(rhs.admitCategoryCodeDesc))))&&((this.rateCodeDesc == rhs.rateCodeDesc)||((this.rateCodeDesc!= null)&&this.rateCodeDesc.equals(rhs.rateCodeDesc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
