
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
    "criteria.program",
    "expAcceptPercentage",
    "criteria.userId",
    "criteria.admitCourseCode",
    "sbgiCode",
    "program",
    "criteria.enrolled",
    "majrCode",
    "criteria.crsCode",
    "criteria.quotaLoad",
    "sessCode",
    "academicYear",
    "admitCourseCode",
    "campCode",
    "criteria.expiryDate",
    "criteria.rateCode",
    "offers",
    "quotaLoad",
    "criteria.activeInd",
    "criteria.ptrmCode",
    "criteria.chrtCode",
    "resdCode",
    "criteria.enforceLapseDateInd",
    "ptrmCode",
    "enforceLapseDateInd",
    "criteria.activityDate",
    "criteria.campCode",
    "criteria.offers",
    "criteria.admitCategoryCode",
    "admitCategoryCode",
    "criteria.termCode",
    "criteria.quotaCount",
    "rateCode",
    "expiryDate",
    "chrtCode",
    "criteria.cricosCode",
    "activeInd",
    "criteria.resdCode",
    "cricosCode",
    "criteria.majrCode",
    "enrolled",
    "criteria.fullPartInd",
    "fullPartInd",
    "criteria.sessCode",
    "quotaCount",
    "criteria.stypCode",
    "criteria.nationalId",
    "nationalId",
    "crsCode",
    "criteria.expAcceptPercentage",
    "stypCode",
    "criteria.sbgiCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumMapping100PutRequest {

    /**
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL")
    private String criteriaProgram;
    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("expAcceptPercentage")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE")
    private Double expAcceptPercentage;
    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_USER_ID")
    private String criteriaUserId;
    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCourseCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE")
    private String criteriaAdmitCourseCode;
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
    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("criteria.enrolled")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENROLLED")
    private Double criteriaEnrolled;
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
    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("criteria.crsCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRS_CODE")
    private String criteriaCrsCode;
    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("criteria.quotaLoad")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_QUOTA_LOAD")
    private Double criteriaQuotaLoad;
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
     * Academic Year
     * <p>
     * Lineage reference object : academicYear, Lookup lineage reference object : STVACYR
     * 
     */
    @JsonProperty("academicYear")
    @JsonPropertyDescription("Lineage reference object : academicYear, Lookup lineage reference object : STVACYR")
    private String academicYear;
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
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("criteria.expiryDate")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_EXPIRY_DATE")
    private Date criteriaExpiryDate;
    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate")
    private String criteriaRateCode;
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
    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM")
    private String criteriaPtrmCode;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.chrtCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String criteriaChrtCode;
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
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.enforceLapseDateInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND")
    private String criteriaEnforceLapseDateInd;
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
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("enforceLapseDateInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND")
    private String enforceLapseDateInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("criteria.offers")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_OFFERS")
    private Double criteriaOffers;
    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCategoryCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL")
    private String criteriaAdmitCategoryCode;
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
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM")
    private String criteriaTermCode;
    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("criteria.quotaCount")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_QUOTA_COUNT")
    private Double criteriaQuotaCount;
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
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("criteria.cricosCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC")
    private String criteriaCricosCode;
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
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd")
    private String criteriaResdCode;
    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("cricosCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC")
    private String cricosCode;
    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR")
    private String criteriaMajrCode;
    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("enrolled")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_ENROLLED")
    private Double enrolled;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_FULL_PART_IND")
    private String criteriaFullPartInd;
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
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess")
    private String criteriaSessCode;
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
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String criteriaStypCode;
    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("criteria.nationalId")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_NATIONAL_ID")
    private String criteriaNationalId;
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
    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("criteria.expAcceptPercentage")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE")
    private Double criteriaExpAcceptPercentage;
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
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String criteriaSbgiCode;
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
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SKRPOFR_PROGRAM, Lookup lineage reference object : SOBCURR,SORMCRL,SORMCRL
     * (Required)
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public CurriculumMapping100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

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

    public CurriculumMapping100PutRequest withExpAcceptPercentage(Double expAcceptPercentage) {
        this.expAcceptPercentage = expAcceptPercentage;
        return this;
    }

    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SKRPOFR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public CurriculumMapping100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCourseCode")
    public String getCriteriaAdmitCourseCode() {
        return criteriaAdmitCourseCode;
    }

    /**
     * Admit Curriculum
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_COURSE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCourseCode")
    public void setCriteriaAdmitCourseCode(String criteriaAdmitCourseCode) {
        this.criteriaAdmitCourseCode = criteriaAdmitCourseCode;
    }

    public CurriculumMapping100PutRequest withCriteriaAdmitCourseCode(String criteriaAdmitCourseCode) {
        this.criteriaAdmitCourseCode = criteriaAdmitCourseCode;
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

    public CurriculumMapping100PutRequest withSbgiCode(String sbgiCode) {
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

    public CurriculumMapping100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("criteria.enrolled")
    public Double getCriteriaEnrolled() {
        return criteriaEnrolled;
    }

    /**
     * Enrolled
     * <p>
     * Lineage reference object : SKRPOFR_ENROLLED
     * 
     */
    @JsonProperty("criteria.enrolled")
    public void setCriteriaEnrolled(Double criteriaEnrolled) {
        this.criteriaEnrolled = criteriaEnrolled;
    }

    public CurriculumMapping100PutRequest withCriteriaEnrolled(Double criteriaEnrolled) {
        this.criteriaEnrolled = criteriaEnrolled;
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

    public CurriculumMapping100PutRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("criteria.crsCode")
    public String getCriteriaCrsCode() {
        return criteriaCrsCode;
    }

    /**
     * TCSI Code
     * <p>
     * Lineage reference object : SKRPOFR_CRS_CODE
     * 
     */
    @JsonProperty("criteria.crsCode")
    public void setCriteriaCrsCode(String criteriaCrsCode) {
        this.criteriaCrsCode = criteriaCrsCode;
    }

    public CurriculumMapping100PutRequest withCriteriaCrsCode(String criteriaCrsCode) {
        this.criteriaCrsCode = criteriaCrsCode;
        return this;
    }

    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("criteria.quotaLoad")
    public Double getCriteriaQuotaLoad() {
        return criteriaQuotaLoad;
    }

    /**
     * Quota Load
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_LOAD
     * 
     */
    @JsonProperty("criteria.quotaLoad")
    public void setCriteriaQuotaLoad(Double criteriaQuotaLoad) {
        this.criteriaQuotaLoad = criteriaQuotaLoad;
    }

    public CurriculumMapping100PutRequest withCriteriaQuotaLoad(Double criteriaQuotaLoad) {
        this.criteriaQuotaLoad = criteriaQuotaLoad;
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

    public CurriculumMapping100PutRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Academic Year
     * <p>
     * Lineage reference object : academicYear, Lookup lineage reference object : STVACYR
     * 
     */
    @JsonProperty("academicYear")
    public String getAcademicYear() {
        return academicYear;
    }

    /**
     * Academic Year
     * <p>
     * Lineage reference object : academicYear, Lookup lineage reference object : STVACYR
     * 
     */
    @JsonProperty("academicYear")
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public CurriculumMapping100PutRequest withAcademicYear(String academicYear) {
        this.academicYear = academicYear;
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

    public CurriculumMapping100PutRequest withAdmitCourseCode(String admitCourseCode) {
        this.admitCourseCode = admitCourseCode;
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

    public CurriculumMapping100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("criteria.expiryDate")
    public Date getCriteriaExpiryDate() {
        return criteriaExpiryDate;
    }

    /**
     * Expiry Date
     * <p>
     * Lineage reference object : SKRPOFR_EXPIRY_DATE
     * 
     */
    @JsonProperty("criteria.expiryDate")
    public void setCriteriaExpiryDate(Date criteriaExpiryDate) {
        this.criteriaExpiryDate = criteriaExpiryDate;
    }

    public CurriculumMapping100PutRequest withCriteriaExpiryDate(Date criteriaExpiryDate) {
        this.criteriaExpiryDate = criteriaExpiryDate;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    public String getCriteriaRateCode() {
        return criteriaRateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SKRPOFR_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCode")
    public void setCriteriaRateCode(String criteriaRateCode) {
        this.criteriaRateCode = criteriaRateCode;
    }

    public CurriculumMapping100PutRequest withCriteriaRateCode(String criteriaRateCode) {
        this.criteriaRateCode = criteriaRateCode;
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

    public CurriculumMapping100PutRequest withOffers(Double offers) {
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

    public CurriculumMapping100PutRequest withQuotaLoad(Double quotaLoad) {
        this.quotaLoad = quotaLoad;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public CurriculumMapping100PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public String getCriteriaPtrmCode() {
        return criteriaPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SKRPOFR_PTRM_CODE, Lookup lineage reference object : STVPTRM,SOBPTRM
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public void setCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
    }

    public CurriculumMapping100PutRequest withCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.chrtCode")
    public String getCriteriaChrtCode() {
        return criteriaChrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SKRPOFR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.chrtCode")
    public void setCriteriaChrtCode(String criteriaChrtCode) {
        this.criteriaChrtCode = criteriaChrtCode;
    }

    public CurriculumMapping100PutRequest withCriteriaChrtCode(String criteriaChrtCode) {
        this.criteriaChrtCode = criteriaChrtCode;
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

    public CurriculumMapping100PutRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.enforceLapseDateInd")
    public String getCriteriaEnforceLapseDateInd() {
        return criteriaEnforceLapseDateInd;
    }

    /**
     * Enforce Lapse Date
     * <p>
     * Lineage reference object : SKRPOFR_ENFORCE_LAPSE_DATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.enforceLapseDateInd")
    public void setCriteriaEnforceLapseDateInd(String criteriaEnforceLapseDateInd) {
        this.criteriaEnforceLapseDateInd = criteriaEnforceLapseDateInd;
    }

    public CurriculumMapping100PutRequest withCriteriaEnforceLapseDateInd(String criteriaEnforceLapseDateInd) {
        this.criteriaEnforceLapseDateInd = criteriaEnforceLapseDateInd;
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

    public CurriculumMapping100PutRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
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

    public CurriculumMapping100PutRequest withEnforceLapseDateInd(String enforceLapseDateInd) {
        this.enforceLapseDateInd = enforceLapseDateInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SKRPOFR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CurriculumMapping100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SKRPOFR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public CurriculumMapping100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("criteria.offers")
    public Double getCriteriaOffers() {
        return criteriaOffers;
    }

    /**
     * Offers
     * <p>
     * Lineage reference object : SKRPOFR_OFFERS
     * 
     */
    @JsonProperty("criteria.offers")
    public void setCriteriaOffers(Double criteriaOffers) {
        this.criteriaOffers = criteriaOffers;
    }

    public CurriculumMapping100PutRequest withCriteriaOffers(Double criteriaOffers) {
        this.criteriaOffers = criteriaOffers;
        return this;
    }

    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCategoryCode")
    public String getCriteriaAdmitCategoryCode() {
        return criteriaAdmitCategoryCode;
    }

    /**
     * Admit Category
     * <p>
     * Lineage reference object : SKRPOFR_ADMIT_CATEGORY_CODE, Lookup lineage reference object : SKRRVAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.admitCategoryCode")
    public void setCriteriaAdmitCategoryCode(String criteriaAdmitCategoryCode) {
        this.criteriaAdmitCategoryCode = criteriaAdmitCategoryCode;
    }

    public CurriculumMapping100PutRequest withCriteriaAdmitCategoryCode(String criteriaAdmitCategoryCode) {
        this.criteriaAdmitCategoryCode = criteriaAdmitCategoryCode;
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

    public CurriculumMapping100PutRequest withAdmitCategoryCode(String admitCategoryCode) {
        this.admitCategoryCode = admitCategoryCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SKRPOFR_TERM_CODE, Lookup lineage reference object : STVTERM,SOBTERM
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public CurriculumMapping100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("criteria.quotaCount")
    public Double getCriteriaQuotaCount() {
        return criteriaQuotaCount;
    }

    /**
     * Quota Count
     * <p>
     * Lineage reference object : SKRPOFR_QUOTA_COUNT
     * 
     */
    @JsonProperty("criteria.quotaCount")
    public void setCriteriaQuotaCount(Double criteriaQuotaCount) {
        this.criteriaQuotaCount = criteriaQuotaCount;
    }

    public CurriculumMapping100PutRequest withCriteriaQuotaCount(Double criteriaQuotaCount) {
        this.criteriaQuotaCount = criteriaQuotaCount;
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

    public CurriculumMapping100PutRequest withRateCode(String rateCode) {
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

    public CurriculumMapping100PutRequest withExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
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

    public CurriculumMapping100PutRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("criteria.cricosCode")
    public String getCriteriaCricosCode() {
        return criteriaCricosCode;
    }

    /**
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("criteria.cricosCode")
    public void setCriteriaCricosCode(String criteriaCricosCode) {
        this.criteriaCricosCode = criteriaCricosCode;
    }

    public CurriculumMapping100PutRequest withCriteriaCricosCode(String criteriaCricosCode) {
        this.criteriaCricosCode = criteriaCricosCode;
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

    public CurriculumMapping100PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public String getCriteriaResdCode() {
        return criteriaResdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SKRPOFR_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public void setCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
    }

    public CurriculumMapping100PutRequest withCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
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

    public CurriculumMapping100PutRequest withCricosCode(String cricosCode) {
        this.cricosCode = cricosCode;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCode")
    public String getCriteriaMajrCode() {
        return criteriaMajrCode;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SKRPOFR_MAJR_CODE, Lookup lineage reference object : STVMAJR,JOIN,X,SORCMJR_MAJR_CODE,STVMAJR_CODE,SORCMJR
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCode")
    public void setCriteriaMajrCode(String criteriaMajrCode) {
        this.criteriaMajrCode = criteriaMajrCode;
    }

    public CurriculumMapping100PutRequest withCriteriaMajrCode(String criteriaMajrCode) {
        this.criteriaMajrCode = criteriaMajrCode;
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

    public CurriculumMapping100PutRequest withEnrolled(Double enrolled) {
        this.enrolled = enrolled;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public String getCriteriaFullPartInd() {
        return criteriaFullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SKRPOFR_FULL_PART_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public void setCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
    }

    public CurriculumMapping100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
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

    public CurriculumMapping100PutRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public String getCriteriaSessCode() {
        return criteriaSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SKRPOFR_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.sessCode")
    public void setCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
    }

    public CurriculumMapping100PutRequest withCriteriaSessCode(String criteriaSessCode) {
        this.criteriaSessCode = criteriaSessCode;
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

    public CurriculumMapping100PutRequest withQuotaCount(Double quotaCount) {
        this.quotaCount = quotaCount;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public String getCriteriaStypCode() {
        return criteriaStypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SKRPOFR_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public void setCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
    }

    public CurriculumMapping100PutRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
        return this;
    }

    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("criteria.nationalId")
    public String getCriteriaNationalId() {
        return criteriaNationalId;
    }

    /**
     * National ID
     * <p>
     * Lineage reference object : SKRPOFR_NATIONAL_ID
     * 
     */
    @JsonProperty("criteria.nationalId")
    public void setCriteriaNationalId(String criteriaNationalId) {
        this.criteriaNationalId = criteriaNationalId;
    }

    public CurriculumMapping100PutRequest withCriteriaNationalId(String criteriaNationalId) {
        this.criteriaNationalId = criteriaNationalId;
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

    public CurriculumMapping100PutRequest withNationalId(String nationalId) {
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

    public CurriculumMapping100PutRequest withCrsCode(String crsCode) {
        this.crsCode = crsCode;
        return this;
    }

    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("criteria.expAcceptPercentage")
    public Double getCriteriaExpAcceptPercentage() {
        return criteriaExpAcceptPercentage;
    }

    /**
     * Expected Acceptance Percentage
     * <p>
     * Lineage reference object : SKRPOFR_EXP_ACCEPT_PERCENTAGE
     * 
     */
    @JsonProperty("criteria.expAcceptPercentage")
    public void setCriteriaExpAcceptPercentage(Double criteriaExpAcceptPercentage) {
        this.criteriaExpAcceptPercentage = criteriaExpAcceptPercentage;
    }

    public CurriculumMapping100PutRequest withCriteriaExpAcceptPercentage(Double criteriaExpAcceptPercentage) {
        this.criteriaExpAcceptPercentage = criteriaExpAcceptPercentage;
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

    public CurriculumMapping100PutRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * Source/Background Institution
     * <p>
     * Lineage reference object : SKRPOFR_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public CurriculumMapping100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
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

    public CurriculumMapping100PutRequest withTermCode(String termCode) {
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

    public CurriculumMapping100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumMapping100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("expAcceptPercentage");
        sb.append('=');
        sb.append(((this.expAcceptPercentage == null)?"<null>":this.expAcceptPercentage));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaAdmitCourseCode");
        sb.append('=');
        sb.append(((this.criteriaAdmitCourseCode == null)?"<null>":this.criteriaAdmitCourseCode));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("criteriaEnrolled");
        sb.append('=');
        sb.append(((this.criteriaEnrolled == null)?"<null>":this.criteriaEnrolled));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("criteriaCrsCode");
        sb.append('=');
        sb.append(((this.criteriaCrsCode == null)?"<null>":this.criteriaCrsCode));
        sb.append(',');
        sb.append("criteriaQuotaLoad");
        sb.append('=');
        sb.append(((this.criteriaQuotaLoad == null)?"<null>":this.criteriaQuotaLoad));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("academicYear");
        sb.append('=');
        sb.append(((this.academicYear == null)?"<null>":this.academicYear));
        sb.append(',');
        sb.append("admitCourseCode");
        sb.append('=');
        sb.append(((this.admitCourseCode == null)?"<null>":this.admitCourseCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("criteriaExpiryDate");
        sb.append('=');
        sb.append(((this.criteriaExpiryDate == null)?"<null>":this.criteriaExpiryDate));
        sb.append(',');
        sb.append("criteriaRateCode");
        sb.append('=');
        sb.append(((this.criteriaRateCode == null)?"<null>":this.criteriaRateCode));
        sb.append(',');
        sb.append("offers");
        sb.append('=');
        sb.append(((this.offers == null)?"<null>":this.offers));
        sb.append(',');
        sb.append("quotaLoad");
        sb.append('=');
        sb.append(((this.quotaLoad == null)?"<null>":this.quotaLoad));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("criteriaChrtCode");
        sb.append('=');
        sb.append(((this.criteriaChrtCode == null)?"<null>":this.criteriaChrtCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("criteriaEnforceLapseDateInd");
        sb.append('=');
        sb.append(((this.criteriaEnforceLapseDateInd == null)?"<null>":this.criteriaEnforceLapseDateInd));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("enforceLapseDateInd");
        sb.append('=');
        sb.append(((this.enforceLapseDateInd == null)?"<null>":this.enforceLapseDateInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("criteriaOffers");
        sb.append('=');
        sb.append(((this.criteriaOffers == null)?"<null>":this.criteriaOffers));
        sb.append(',');
        sb.append("criteriaAdmitCategoryCode");
        sb.append('=');
        sb.append(((this.criteriaAdmitCategoryCode == null)?"<null>":this.criteriaAdmitCategoryCode));
        sb.append(',');
        sb.append("admitCategoryCode");
        sb.append('=');
        sb.append(((this.admitCategoryCode == null)?"<null>":this.admitCategoryCode));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaQuotaCount");
        sb.append('=');
        sb.append(((this.criteriaQuotaCount == null)?"<null>":this.criteriaQuotaCount));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("criteriaCricosCode");
        sb.append('=');
        sb.append(((this.criteriaCricosCode == null)?"<null>":this.criteriaCricosCode));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("criteriaResdCode");
        sb.append('=');
        sb.append(((this.criteriaResdCode == null)?"<null>":this.criteriaResdCode));
        sb.append(',');
        sb.append("cricosCode");
        sb.append('=');
        sb.append(((this.cricosCode == null)?"<null>":this.cricosCode));
        sb.append(',');
        sb.append("criteriaMajrCode");
        sb.append('=');
        sb.append(((this.criteriaMajrCode == null)?"<null>":this.criteriaMajrCode));
        sb.append(',');
        sb.append("enrolled");
        sb.append('=');
        sb.append(((this.enrolled == null)?"<null>":this.enrolled));
        sb.append(',');
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("criteriaSessCode");
        sb.append('=');
        sb.append(((this.criteriaSessCode == null)?"<null>":this.criteriaSessCode));
        sb.append(',');
        sb.append("quotaCount");
        sb.append('=');
        sb.append(((this.quotaCount == null)?"<null>":this.quotaCount));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("criteriaNationalId");
        sb.append('=');
        sb.append(((this.criteriaNationalId == null)?"<null>":this.criteriaNationalId));
        sb.append(',');
        sb.append("nationalId");
        sb.append('=');
        sb.append(((this.nationalId == null)?"<null>":this.nationalId));
        sb.append(',');
        sb.append("crsCode");
        sb.append('=');
        sb.append(((this.crsCode == null)?"<null>":this.crsCode));
        sb.append(',');
        sb.append("criteriaExpAcceptPercentage");
        sb.append('=');
        sb.append(((this.criteriaExpAcceptPercentage == null)?"<null>":this.criteriaExpAcceptPercentage));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
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
        result = ((result* 31)+((this.criteriaChrtCode == null)? 0 :this.criteriaChrtCode.hashCode()));
        result = ((result* 31)+((this.criteriaRateCode == null)? 0 :this.criteriaRateCode.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmCode == null)? 0 :this.criteriaPtrmCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.criteriaAdmitCategoryCode == null)? 0 :this.criteriaAdmitCategoryCode.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.criteriaExpiryDate == null)? 0 :this.criteriaExpiryDate.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.academicYear == null)? 0 :this.academicYear.hashCode()));
        result = ((result* 31)+((this.admitCourseCode == null)? 0 :this.admitCourseCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaOffers == null)? 0 :this.criteriaOffers.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.criteriaCricosCode == null)? 0 :this.criteriaCricosCode.hashCode()));
        result = ((result* 31)+((this.offers == null)? 0 :this.offers.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.quotaLoad == null)? 0 :this.quotaLoad.hashCode()));
        result = ((result* 31)+((this.criteriaEnrolled == null)? 0 :this.criteriaEnrolled.hashCode()));
        result = ((result* 31)+((this.criteriaExpAcceptPercentage == null)? 0 :this.criteriaExpAcceptPercentage.hashCode()));
        result = ((result* 31)+((this.criteriaQuotaCount == null)? 0 :this.criteriaQuotaCount.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmitCourseCode == null)? 0 :this.criteriaAdmitCourseCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaNationalId == null)? 0 :this.criteriaNationalId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaQuotaLoad == null)? 0 :this.criteriaQuotaLoad.hashCode()));
        result = ((result* 31)+((this.enforceLapseDateInd == null)? 0 :this.enforceLapseDateInd.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.admitCategoryCode == null)? 0 :this.admitCategoryCode.hashCode()));
        result = ((result* 31)+((this.criteriaSessCode == null)? 0 :this.criteriaSessCode.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCode == null)? 0 :this.criteriaMajrCode.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.cricosCode == null)? 0 :this.cricosCode.hashCode()));
        result = ((result* 31)+((this.enrolled == null)? 0 :this.enrolled.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaEnforceLapseDateInd == null)? 0 :this.criteriaEnforceLapseDateInd.hashCode()));
        result = ((result* 31)+((this.quotaCount == null)? 0 :this.quotaCount.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        result = ((result* 31)+((this.nationalId == null)? 0 :this.nationalId.hashCode()));
        result = ((result* 31)+((this.crsCode == null)? 0 :this.crsCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrsCode == null)? 0 :this.criteriaCrsCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumMapping100PutRequest) == false) {
            return false;
        }
        CurriculumMapping100PutRequest rhs = ((CurriculumMapping100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.expAcceptPercentage == rhs.expAcceptPercentage)||((this.expAcceptPercentage!= null)&&this.expAcceptPercentage.equals(rhs.expAcceptPercentage)))&&((this.criteriaChrtCode == rhs.criteriaChrtCode)||((this.criteriaChrtCode!= null)&&this.criteriaChrtCode.equals(rhs.criteriaChrtCode))))&&((this.criteriaRateCode == rhs.criteriaRateCode)||((this.criteriaRateCode!= null)&&this.criteriaRateCode.equals(rhs.criteriaRateCode))))&&((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.criteriaAdmitCategoryCode == rhs.criteriaAdmitCategoryCode)||((this.criteriaAdmitCategoryCode!= null)&&this.criteriaAdmitCategoryCode.equals(rhs.criteriaAdmitCategoryCode))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.criteriaExpiryDate == rhs.criteriaExpiryDate)||((this.criteriaExpiryDate!= null)&&this.criteriaExpiryDate.equals(rhs.criteriaExpiryDate))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.academicYear == rhs.academicYear)||((this.academicYear!= null)&&this.academicYear.equals(rhs.academicYear))))&&((this.admitCourseCode == rhs.admitCourseCode)||((this.admitCourseCode!= null)&&this.admitCourseCode.equals(rhs.admitCourseCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaOffers == rhs.criteriaOffers)||((this.criteriaOffers!= null)&&this.criteriaOffers.equals(rhs.criteriaOffers))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.criteriaCricosCode == rhs.criteriaCricosCode)||((this.criteriaCricosCode!= null)&&this.criteriaCricosCode.equals(rhs.criteriaCricosCode))))&&((this.offers == rhs.offers)||((this.offers!= null)&&this.offers.equals(rhs.offers))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.quotaLoad == rhs.quotaLoad)||((this.quotaLoad!= null)&&this.quotaLoad.equals(rhs.quotaLoad))))&&((this.criteriaEnrolled == rhs.criteriaEnrolled)||((this.criteriaEnrolled!= null)&&this.criteriaEnrolled.equals(rhs.criteriaEnrolled))))&&((this.criteriaExpAcceptPercentage == rhs.criteriaExpAcceptPercentage)||((this.criteriaExpAcceptPercentage!= null)&&this.criteriaExpAcceptPercentage.equals(rhs.criteriaExpAcceptPercentage))))&&((this.criteriaQuotaCount == rhs.criteriaQuotaCount)||((this.criteriaQuotaCount!= null)&&this.criteriaQuotaCount.equals(rhs.criteriaQuotaCount))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.criteriaAdmitCourseCode == rhs.criteriaAdmitCourseCode)||((this.criteriaAdmitCourseCode!= null)&&this.criteriaAdmitCourseCode.equals(rhs.criteriaAdmitCourseCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.criteriaNationalId == rhs.criteriaNationalId)||((this.criteriaNationalId!= null)&&this.criteriaNationalId.equals(rhs.criteriaNationalId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaQuotaLoad == rhs.criteriaQuotaLoad)||((this.criteriaQuotaLoad!= null)&&this.criteriaQuotaLoad.equals(rhs.criteriaQuotaLoad))))&&((this.enforceLapseDateInd == rhs.enforceLapseDateInd)||((this.enforceLapseDateInd!= null)&&this.enforceLapseDateInd.equals(rhs.enforceLapseDateInd))))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.admitCategoryCode == rhs.admitCategoryCode)||((this.admitCategoryCode!= null)&&this.admitCategoryCode.equals(rhs.admitCategoryCode))))&&((this.criteriaSessCode == rhs.criteriaSessCode)||((this.criteriaSessCode!= null)&&this.criteriaSessCode.equals(rhs.criteriaSessCode))))&&((this.criteriaMajrCode == rhs.criteriaMajrCode)||((this.criteriaMajrCode!= null)&&this.criteriaMajrCode.equals(rhs.criteriaMajrCode))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.cricosCode == rhs.cricosCode)||((this.cricosCode!= null)&&this.cricosCode.equals(rhs.cricosCode))))&&((this.enrolled == rhs.enrolled)||((this.enrolled!= null)&&this.enrolled.equals(rhs.enrolled))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.criteriaEnforceLapseDateInd == rhs.criteriaEnforceLapseDateInd)||((this.criteriaEnforceLapseDateInd!= null)&&this.criteriaEnforceLapseDateInd.equals(rhs.criteriaEnforceLapseDateInd))))&&((this.quotaCount == rhs.quotaCount)||((this.quotaCount!= null)&&this.quotaCount.equals(rhs.quotaCount))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))))&&((this.nationalId == rhs.nationalId)||((this.nationalId!= null)&&this.nationalId.equals(rhs.nationalId))))&&((this.crsCode == rhs.crsCode)||((this.crsCode!= null)&&this.crsCode.equals(rhs.crsCode))))&&((this.criteriaCrsCode == rhs.criteriaCrsCode)||((this.criteriaCrsCode!= null)&&this.criteriaCrsCode.equals(rhs.criteriaCrsCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
