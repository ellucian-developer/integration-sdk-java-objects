
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
    "admitCategoryCode",
    "sbgiCode",
    "program",
    "majrCode",
    "rateCode",
    "expiryDate",
    "sessCode",
    "academicYear",
    "admitCourseCode",
    "chrtCode",
    "campCode",
    "activeInd",
    "cricosCode",
    "enrolled",
    "fullPartInd",
    "offers",
    "quotaLoad",
    "quotaCount",
    "resdCode",
    "ptrmCode",
    "nationalId",
    "crsCode",
    "stypCode",
    "enforceLapseDateInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CurriculumMapping100PostRequest {

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
     * CRICOS Code
     * <p>
     * Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC
     * 
     */
    @JsonProperty("cricosCode")
    @JsonPropertyDescription("Lineage reference object : SKRPOFR_CRICOS_CODE, Lookup lineage reference object : SKRCRIC,SKRCRIC")
    private String cricosCode;
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

    public CurriculumMapping100PostRequest withExpAcceptPercentage(Double expAcceptPercentage) {
        this.expAcceptPercentage = expAcceptPercentage;
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

    public CurriculumMapping100PostRequest withAdmitCategoryCode(String admitCategoryCode) {
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

    public CurriculumMapping100PostRequest withSbgiCode(String sbgiCode) {
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

    public CurriculumMapping100PostRequest withProgram(String program) {
        this.program = program;
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

    public CurriculumMapping100PostRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
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

    public CurriculumMapping100PostRequest withRateCode(String rateCode) {
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

    public CurriculumMapping100PostRequest withExpiryDate(Date expiryDate) {
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

    public CurriculumMapping100PostRequest withSessCode(String sessCode) {
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

    public CurriculumMapping100PostRequest withAcademicYear(String academicYear) {
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

    public CurriculumMapping100PostRequest withAdmitCourseCode(String admitCourseCode) {
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

    public CurriculumMapping100PostRequest withChrtCode(String chrtCode) {
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

    public CurriculumMapping100PostRequest withCampCode(String campCode) {
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

    public CurriculumMapping100PostRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
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

    public CurriculumMapping100PostRequest withCricosCode(String cricosCode) {
        this.cricosCode = cricosCode;
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

    public CurriculumMapping100PostRequest withEnrolled(Double enrolled) {
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

    public CurriculumMapping100PostRequest withFullPartInd(String fullPartInd) {
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

    public CurriculumMapping100PostRequest withOffers(Double offers) {
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

    public CurriculumMapping100PostRequest withQuotaLoad(Double quotaLoad) {
        this.quotaLoad = quotaLoad;
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

    public CurriculumMapping100PostRequest withQuotaCount(Double quotaCount) {
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

    public CurriculumMapping100PostRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
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

    public CurriculumMapping100PostRequest withPtrmCode(String ptrmCode) {
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

    public CurriculumMapping100PostRequest withNationalId(String nationalId) {
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

    public CurriculumMapping100PostRequest withCrsCode(String crsCode) {
        this.crsCode = crsCode;
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

    public CurriculumMapping100PostRequest withStypCode(String stypCode) {
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

    public CurriculumMapping100PostRequest withEnforceLapseDateInd(String enforceLapseDateInd) {
        this.enforceLapseDateInd = enforceLapseDateInd;
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

    public CurriculumMapping100PostRequest withTermCode(String termCode) {
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

    public CurriculumMapping100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumMapping100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expAcceptPercentage");
        sb.append('=');
        sb.append(((this.expAcceptPercentage == null)?"<null>":this.expAcceptPercentage));
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
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
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
        sb.append("academicYear");
        sb.append('=');
        sb.append(((this.academicYear == null)?"<null>":this.academicYear));
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
        sb.append("cricosCode");
        sb.append('=');
        sb.append(((this.cricosCode == null)?"<null>":this.cricosCode));
        sb.append(',');
        sb.append("enrolled");
        sb.append('=');
        sb.append(((this.enrolled == null)?"<null>":this.enrolled));
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
        sb.append("quotaCount");
        sb.append('=');
        sb.append(((this.quotaCount == null)?"<null>":this.quotaCount));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
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
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("enforceLapseDateInd");
        sb.append('=');
        sb.append(((this.enforceLapseDateInd == null)?"<null>":this.enforceLapseDateInd));
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
        result = ((result* 31)+((this.admitCategoryCode == null)? 0 :this.admitCategoryCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.academicYear == null)? 0 :this.academicYear.hashCode()));
        result = ((result* 31)+((this.admitCourseCode == null)? 0 :this.admitCourseCode.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.cricosCode == null)? 0 :this.cricosCode.hashCode()));
        result = ((result* 31)+((this.enrolled == null)? 0 :this.enrolled.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.offers == null)? 0 :this.offers.hashCode()));
        result = ((result* 31)+((this.quotaLoad == null)? 0 :this.quotaLoad.hashCode()));
        result = ((result* 31)+((this.quotaCount == null)? 0 :this.quotaCount.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.nationalId == null)? 0 :this.nationalId.hashCode()));
        result = ((result* 31)+((this.crsCode == null)? 0 :this.crsCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enforceLapseDateInd == null)? 0 :this.enforceLapseDateInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumMapping100PostRequest) == false) {
            return false;
        }
        CurriculumMapping100PostRequest rhs = ((CurriculumMapping100PostRequest) other);
        return ((((((((((((((((((((((((((((this.expAcceptPercentage == rhs.expAcceptPercentage)||((this.expAcceptPercentage!= null)&&this.expAcceptPercentage.equals(rhs.expAcceptPercentage)))&&((this.admitCategoryCode == rhs.admitCategoryCode)||((this.admitCategoryCode!= null)&&this.admitCategoryCode.equals(rhs.admitCategoryCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.academicYear == rhs.academicYear)||((this.academicYear!= null)&&this.academicYear.equals(rhs.academicYear))))&&((this.admitCourseCode == rhs.admitCourseCode)||((this.admitCourseCode!= null)&&this.admitCourseCode.equals(rhs.admitCourseCode))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.cricosCode == rhs.cricosCode)||((this.cricosCode!= null)&&this.cricosCode.equals(rhs.cricosCode))))&&((this.enrolled == rhs.enrolled)||((this.enrolled!= null)&&this.enrolled.equals(rhs.enrolled))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.offers == rhs.offers)||((this.offers!= null)&&this.offers.equals(rhs.offers))))&&((this.quotaLoad == rhs.quotaLoad)||((this.quotaLoad!= null)&&this.quotaLoad.equals(rhs.quotaLoad))))&&((this.quotaCount == rhs.quotaCount)||((this.quotaCount!= null)&&this.quotaCount.equals(rhs.quotaCount))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.nationalId == rhs.nationalId)||((this.nationalId!= null)&&this.nationalId.equals(rhs.nationalId))))&&((this.crsCode == rhs.crsCode)||((this.crsCode!= null)&&this.crsCode.equals(rhs.crsCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enforceLapseDateInd == rhs.enforceLapseDateInd)||((this.enforceLapseDateInd!= null)&&this.enforceLapseDateInd.equals(rhs.enforceLapseDateInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
