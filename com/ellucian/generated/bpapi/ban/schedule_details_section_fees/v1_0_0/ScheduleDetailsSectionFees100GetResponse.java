
package com.ellucian.generated.bpapi.ban.schedule_details_section_fees.v1_0_0;

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
    "vtypCode",
    "stypCodeCurric",
    "duntCode",
    "levlCodeStdn",
    "primSecCde",
    "detlCode",
    "degcCode",
    "program",
    "majrCode",
    "rateCode",
    "lfstCode",
    "feeDescription",
    "activityDate",
    "chrtCode",
    "rateCodeCurric",
    "campCode",
    "clasCode",
    "amount",
    "resdCode",
    "userId",
    "attsCode",
    "termCodeAdmit",
    "stypCode",
    "collCode",
    "ftypCode",
    "deptCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class ScheduleDetailsSectionFees100GetResponse {

    /**
     * Visa Type
     * <p>
     * Lineage reference object : SSRFEES_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String vtypCode;
    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp")
    private String stypCodeCurric;
    /**
     * Duration Unit
     * <p>
     * 
     * 
     */
    @JsonProperty("duntCode")
    private String duntCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE_STDN, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeStdn")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_LEVL_CODE_STDN, Lookup lineage reference object : stvlevl")
    private String levlCodeStdn;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRFEES_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_PRIM_SEC_CDE")
    private String primSecCde;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SSRFEES_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_DETL_CODE")
    private String detlCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SSRFEES_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SSRFEES_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRFEES_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * Student Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRFEES_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("feeDescription")
    private String feeDescription;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRFEES_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRFEES_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate")
    private String rateCodeCurric;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSRFEES_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Class
     * <p>
     * Lineage reference object : SSRFEES_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : SSRFEES_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_AMOUNT")
    private Double amount;
    /**
     * Residency
     * <p>
     * Lineage reference object : SSRFEES_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : SSRFEES_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_USER_ID")
    private String userId;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SSRFEES_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRFEES_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String termCodeAdmit;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * College
     * <p>
     * Lineage reference object : SSRFEES_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Fee Type
     * <p>
     * Lineage reference object : SSRFEES_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_FTYP_CODE, Lookup lineage reference object : stvftyp")
    private String ftypCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SSRFEES_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SSRFEES_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Visa Type
     * <p>
     * Lineage reference object : SSRFEES_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : SSRFEES_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public String getStypCodeCurric() {
        return stypCodeCurric;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public void setStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
    }

    public ScheduleDetailsSectionFees100GetResponse withStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
        return this;
    }

    /**
     * Duration Unit
     * <p>
     * 
     * 
     */
    @JsonProperty("duntCode")
    public String getDuntCode() {
        return duntCode;
    }

    /**
     * Duration Unit
     * <p>
     * 
     * 
     */
    @JsonProperty("duntCode")
    public void setDuntCode(String duntCode) {
        this.duntCode = duntCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withDuntCode(String duntCode) {
        this.duntCode = duntCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE_STDN, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeStdn")
    public String getLevlCodeStdn() {
        return levlCodeStdn;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE_STDN, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeStdn")
    public void setLevlCodeStdn(String levlCodeStdn) {
        this.levlCodeStdn = levlCodeStdn;
    }

    public ScheduleDetailsSectionFees100GetResponse withLevlCodeStdn(String levlCodeStdn) {
        this.levlCodeStdn = levlCodeStdn;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRFEES_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public String getPrimSecCde() {
        return primSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRFEES_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public void setPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
    }

    public ScheduleDetailsSectionFees100GetResponse withPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SSRFEES_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    public String getDetlCode() {
        return detlCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SSRFEES_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    public void setDetlCode(String detlCode) {
        this.detlCode = detlCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withDetlCode(String detlCode) {
        this.detlCode = detlCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SSRFEES_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SSRFEES_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRFEES_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRFEES_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ScheduleDetailsSectionFees100GetResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRFEES_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRFEES_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * Student Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Student Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRFEES_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRFEES_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("feeDescription")
    public String getFeeDescription() {
        return feeDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("feeDescription")
    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    public ScheduleDetailsSectionFees100GetResponse withFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRFEES_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRFEES_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ScheduleDetailsSectionFees100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRFEES_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRFEES_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public String getRateCodeCurric() {
        return rateCodeCurric;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SSRFEES_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public void setRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
    }

    public ScheduleDetailsSectionFees100GetResponse withRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSRFEES_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSRFEES_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SSRFEES_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SSRFEES_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SSRFEES_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SSRFEES_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ScheduleDetailsSectionFees100GetResponse withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Residency
     * <p>
     * Lineage reference object : SSRFEES_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residency
     * <p>
     * Lineage reference object : SSRFEES_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SSRFEES_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SSRFEES_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ScheduleDetailsSectionFees100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SSRFEES_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SSRFEES_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRFEES_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRFEES_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public ScheduleDetailsSectionFees100GetResponse withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SSRFEES_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSRFEES_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSRFEES_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Fee Type
     * <p>
     * Lineage reference object : SSRFEES_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fee Type
     * <p>
     * Lineage reference object : SSRFEES_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRFEES_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRFEES_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRFEES_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public ScheduleDetailsSectionFees100GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public ScheduleDetailsSectionFees100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleDetailsSectionFees100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("stypCodeCurric");
        sb.append('=');
        sb.append(((this.stypCodeCurric == null)?"<null>":this.stypCodeCurric));
        sb.append(',');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("levlCodeStdn");
        sb.append('=');
        sb.append(((this.levlCodeStdn == null)?"<null>":this.levlCodeStdn));
        sb.append(',');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("detlCode");
        sb.append('=');
        sb.append(((this.detlCode == null)?"<null>":this.detlCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
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
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("feeDescription");
        sb.append('=');
        sb.append(((this.feeDescription == null)?"<null>":this.feeDescription));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("rateCodeCurric");
        sb.append('=');
        sb.append(((this.rateCodeCurric == null)?"<null>":this.rateCodeCurric));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.vtypCode == null)? 0 :this.vtypCode.hashCode()));
        result = ((result* 31)+((this.stypCodeCurric == null)? 0 :this.stypCodeCurric.hashCode()));
        result = ((result* 31)+((this.duntCode == null)? 0 :this.duntCode.hashCode()));
        result = ((result* 31)+((this.levlCodeStdn == null)? 0 :this.levlCodeStdn.hashCode()));
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.detlCode == null)? 0 :this.detlCode.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.feeDescription == null)? 0 :this.feeDescription.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.rateCodeCurric == null)? 0 :this.rateCodeCurric.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleDetailsSectionFees100GetResponse) == false) {
            return false;
        }
        ScheduleDetailsSectionFees100GetResponse rhs = ((ScheduleDetailsSectionFees100GetResponse) other);
        return (((((((((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.stypCodeCurric == rhs.stypCodeCurric)||((this.stypCodeCurric!= null)&&this.stypCodeCurric.equals(rhs.stypCodeCurric))))&&((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode))))&&((this.levlCodeStdn == rhs.levlCodeStdn)||((this.levlCodeStdn!= null)&&this.levlCodeStdn.equals(rhs.levlCodeStdn))))&&((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde))))&&((this.detlCode == rhs.detlCode)||((this.detlCode!= null)&&this.detlCode.equals(rhs.detlCode))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.feeDescription == rhs.feeDescription)||((this.feeDescription!= null)&&this.feeDescription.equals(rhs.feeDescription))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.rateCodeCurric == rhs.rateCodeCurric)||((this.rateCodeCurric!= null)&&this.rateCodeCurric.equals(rhs.rateCodeCurric))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
