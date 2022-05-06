
package com.ellucian.generated.bpapi.ban.registration_fee_assessment_rules.v1_0_0;

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
    "primSecCde",
    "toFlatHrs",
    "toStudHrs",
    "campCodeCrse",
    "detlCode",
    "degcCode",
    "program",
    "majrCode",
    "minCharge",
    "schdCode",
    "flatFeeAmount",
    "lfstCode",
    "campCode",
    "fromCredHrs",
    "entryType",
    "maxCharge",
    "resdCode",
    "toAddDate",
    "toCredHrs",
    "assessByCourseInd",
    "ptrmCode",
    "tbbdetcDcatCode",
    "collCode",
    "deptCode",
    "levlCode",
    "stypCodeCurric",
    "fromFlatHrs",
    "rateCode",
    "activityDate",
    "chrtCode",
    "rateCodeCurric",
    "attrCodeCrse",
    "clasCode",
    "fromStudHrs",
    "crseWaivInd",
    "gmodCode",
    "seqno",
    "levlCodeCrse",
    "insmCode",
    "perCredCharge",
    "userId",
    "attsCode",
    "termCodeAdmit",
    "lfstPrimSecCde",
    "stypCode",
    "fromAddDate",
    "copyInd",
    "crseOverloadStartHr"
})
@Generated("jsonschema2pojo")
public class RegistrationFeeAssessmentRules100GetResponse {

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRRGFE_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String vtypCode;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PRIM_SEC_CDE")
    private String primSecCde;
    /**
     * Flat Charge Hours Range To
     * <p>
     * Lineage reference object : SFRRGFE_TO_FLAT_HRS
     * 
     */
    @JsonProperty("toFlatHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TO_FLAT_HRS")
    private Double toFlatHrs;
    /**
     * Total Student Liable Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_STUD_HRS
     * 
     */
    @JsonProperty("toStudHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TO_STUD_HRS")
    private Double toStudHrs;
    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp")
    private String campCodeCrse;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc")
    private String detlCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("minCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MIN_CHARGE")
    private Double minCharge;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SFRRGFE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
    /**
     * Flat Charge Amount
     * <p>
     * Lineage reference object : SFRRGFE_FLAT_FEE_AMOUNT
     * 
     */
    @JsonProperty("flatFeeAmount")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_FLAT_FEE_AMOUNT")
    private Double flatFeeAmount;
    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Liable Billing Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_CRED_HRS
     * 
     */
    @JsonProperty("fromCredHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_FROM_CRED_HRS")
    private Double fromCredHrs;
    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ENTRY_TYPE")
    private String entryType;
    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("maxCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAX_CHARGE")
    private Double maxCharge;
    /**
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Registration Dates To
     * <p>
     * Lineage reference object : SFRRGFE_TO_ADD_DATE
     * 
     */
    @JsonProperty("toAddDate")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TO_ADD_DATE")
    private Date toAddDate;
    /**
     * Liable Billing Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_CRED_HRS
     * 
     */
    @JsonProperty("toCredHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TO_CRED_HRS")
    private Double toCredHrs;
    /**
     * Lineage reference object : SFRRGFE_ASSESS_BY_COURSE_IND
     * 
     */
    @JsonProperty("assessByCourseInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ASSESS_BY_COURSE_IND")
    private String assessByCourseInd;
    /**
     * POT
     * <p>
     * Lineage reference object : SFRRGFE_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    private String tbbdetcDcatCode;
    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp")
    private String stypCodeCurric;
    /**
     * Flat Charge Hours Range From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_FLAT_HRS
     * 
     */
    @JsonProperty("fromFlatHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_FROM_FLAT_HRS")
    private Double fromFlatHrs;
    /**
     * Student Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRRGFE_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate")
    private String rateCodeCurric;
    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr")
    private String attrCodeCrse;
    /**
     * Class
     * <p>
     * Lineage reference object : SFRRGFE_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * Total Student Liable Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_STUD_HRS
     * 
     */
    @JsonProperty("fromStudHrs")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_FROM_STUD_HRS")
    private Double fromStudHrs;
    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CRSE_WAIV_IND")
    private String crseWaivInd;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRRGFE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String gmodCode;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_SEQNO")
    private Double seqno;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl")
    private String levlCodeCrse;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("perCredCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PER_CRED_CHARGE")
    private Double perCredCharge;
    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_USER_ID")
    private String userId;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String termCodeAdmit;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE")
    private String lfstPrimSecCde;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Registration Dates From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_ADD_DATE
     * 
     */
    @JsonProperty("fromAddDate")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_FROM_ADD_DATE")
    private Date fromAddDate;
    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COPY_IND")
    private String copyInd;
    /**
     * Course Overload Start Hours
     * <p>
     * Lineage reference object : SFRRGFE_CRSE_OVERLOAD_START_HR
     * 
     */
    @JsonProperty("crseOverloadStartHr")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CRSE_OVERLOAD_START_HR")
    private Double crseOverloadStartHr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRRGFE_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRRGFE_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public String getPrimSecCde() {
        return primSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public void setPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
    }

    public RegistrationFeeAssessmentRules100GetResponse withPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
        return this;
    }

    /**
     * Flat Charge Hours Range To
     * <p>
     * Lineage reference object : SFRRGFE_TO_FLAT_HRS
     * 
     */
    @JsonProperty("toFlatHrs")
    public Double getToFlatHrs() {
        return toFlatHrs;
    }

    /**
     * Flat Charge Hours Range To
     * <p>
     * Lineage reference object : SFRRGFE_TO_FLAT_HRS
     * 
     */
    @JsonProperty("toFlatHrs")
    public void setToFlatHrs(Double toFlatHrs) {
        this.toFlatHrs = toFlatHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withToFlatHrs(Double toFlatHrs) {
        this.toFlatHrs = toFlatHrs;
        return this;
    }

    /**
     * Total Student Liable Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_STUD_HRS
     * 
     */
    @JsonProperty("toStudHrs")
    public Double getToStudHrs() {
        return toStudHrs;
    }

    /**
     * Total Student Liable Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_STUD_HRS
     * 
     */
    @JsonProperty("toStudHrs")
    public void setToStudHrs(Double toStudHrs) {
        this.toStudHrs = toStudHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withToStudHrs(Double toStudHrs) {
        this.toStudHrs = toStudHrs;
        return this;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    public String getCampCodeCrse() {
        return campCodeCrse;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    public void setCampCodeCrse(String campCodeCrse) {
        this.campCodeCrse = campCodeCrse;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCampCodeCrse(String campCodeCrse) {
        this.campCodeCrse = campCodeCrse;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
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
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    public void setDetlCode(String detlCode) {
        this.detlCode = detlCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withDetlCode(String detlCode) {
        this.detlCode = detlCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public RegistrationFeeAssessmentRules100GetResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("minCharge")
    public Double getMinCharge() {
        return minCharge;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("minCharge")
    public void setMinCharge(Double minCharge) {
        this.minCharge = minCharge;
    }

    public RegistrationFeeAssessmentRules100GetResponse withMinCharge(Double minCharge) {
        this.minCharge = minCharge;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SFRRGFE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SFRRGFE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Flat Charge Amount
     * <p>
     * Lineage reference object : SFRRGFE_FLAT_FEE_AMOUNT
     * 
     */
    @JsonProperty("flatFeeAmount")
    public Double getFlatFeeAmount() {
        return flatFeeAmount;
    }

    /**
     * Flat Charge Amount
     * <p>
     * Lineage reference object : SFRRGFE_FLAT_FEE_AMOUNT
     * 
     */
    @JsonProperty("flatFeeAmount")
    public void setFlatFeeAmount(Double flatFeeAmount) {
        this.flatFeeAmount = flatFeeAmount;
    }

    public RegistrationFeeAssessmentRules100GetResponse withFlatFeeAmount(Double flatFeeAmount) {
        this.flatFeeAmount = flatFeeAmount;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Liable Billing Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_CRED_HRS
     * 
     */
    @JsonProperty("fromCredHrs")
    public Double getFromCredHrs() {
        return fromCredHrs;
    }

    /**
     * Liable Billing Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_CRED_HRS
     * 
     */
    @JsonProperty("fromCredHrs")
    public void setFromCredHrs(Double fromCredHrs) {
        this.fromCredHrs = fromCredHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withFromCredHrs(Double fromCredHrs) {
        this.fromCredHrs = fromCredHrs;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    public String getEntryType() {
        return entryType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public RegistrationFeeAssessmentRules100GetResponse withEntryType(String entryType) {
        this.entryType = entryType;
        return this;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("maxCharge")
    public Double getMaxCharge() {
        return maxCharge;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("maxCharge")
    public void setMaxCharge(Double maxCharge) {
        this.maxCharge = maxCharge;
    }

    public RegistrationFeeAssessmentRules100GetResponse withMaxCharge(Double maxCharge) {
        this.maxCharge = maxCharge;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Registration Dates To
     * <p>
     * Lineage reference object : SFRRGFE_TO_ADD_DATE
     * 
     */
    @JsonProperty("toAddDate")
    public Date getToAddDate() {
        return toAddDate;
    }

    /**
     * Registration Dates To
     * <p>
     * Lineage reference object : SFRRGFE_TO_ADD_DATE
     * 
     */
    @JsonProperty("toAddDate")
    public void setToAddDate(Date toAddDate) {
        this.toAddDate = toAddDate;
    }

    public RegistrationFeeAssessmentRules100GetResponse withToAddDate(Date toAddDate) {
        this.toAddDate = toAddDate;
        return this;
    }

    /**
     * Liable Billing Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_CRED_HRS
     * 
     */
    @JsonProperty("toCredHrs")
    public Double getToCredHrs() {
        return toCredHrs;
    }

    /**
     * Liable Billing Hours To
     * <p>
     * Lineage reference object : SFRRGFE_TO_CRED_HRS
     * 
     */
    @JsonProperty("toCredHrs")
    public void setToCredHrs(Double toCredHrs) {
        this.toCredHrs = toCredHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withToCredHrs(Double toCredHrs) {
        this.toCredHrs = toCredHrs;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_ASSESS_BY_COURSE_IND
     * 
     */
    @JsonProperty("assessByCourseInd")
    public String getAssessByCourseInd() {
        return assessByCourseInd;
    }

    /**
     * Lineage reference object : SFRRGFE_ASSESS_BY_COURSE_IND
     * 
     */
    @JsonProperty("assessByCourseInd")
    public void setAssessByCourseInd(String assessByCourseInd) {
        this.assessByCourseInd = assessByCourseInd;
    }

    public RegistrationFeeAssessmentRules100GetResponse withAssessByCourseInd(String assessByCourseInd) {
        this.assessByCourseInd = assessByCourseInd;
        return this;
    }

    /**
     * POT
     * <p>
     * Lineage reference object : SFRRGFE_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * POT
     * <p>
     * Lineage reference object : SFRRGFE_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public String getTbbdetcDcatCode() {
        return tbbdetcDcatCode;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public void setTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public String getStypCodeCurric() {
        return stypCodeCurric;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public void setStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
    }

    public RegistrationFeeAssessmentRules100GetResponse withStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
        return this;
    }

    /**
     * Flat Charge Hours Range From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_FLAT_HRS
     * 
     */
    @JsonProperty("fromFlatHrs")
    public Double getFromFlatHrs() {
        return fromFlatHrs;
    }

    /**
     * Flat Charge Hours Range From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_FLAT_HRS
     * 
     */
    @JsonProperty("fromFlatHrs")
    public void setFromFlatHrs(Double fromFlatHrs) {
        this.fromFlatHrs = fromFlatHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withFromFlatHrs(Double fromFlatHrs) {
        this.fromFlatHrs = fromFlatHrs;
        return this;
    }

    /**
     * Student Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Student Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationFeeAssessmentRules100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRRGFE_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRRGFE_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public String getRateCodeCurric() {
        return rateCodeCurric;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public void setRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
    }

    public RegistrationFeeAssessmentRules100GetResponse withRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
        return this;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    public String getAttrCodeCrse() {
        return attrCodeCrse;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    public void setAttrCodeCrse(String attrCodeCrse) {
        this.attrCodeCrse = attrCodeCrse;
    }

    public RegistrationFeeAssessmentRules100GetResponse withAttrCodeCrse(String attrCodeCrse) {
        this.attrCodeCrse = attrCodeCrse;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRRGFE_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRRGFE_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Total Student Liable Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_STUD_HRS
     * 
     */
    @JsonProperty("fromStudHrs")
    public Double getFromStudHrs() {
        return fromStudHrs;
    }

    /**
     * Total Student Liable Hours From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_STUD_HRS
     * 
     */
    @JsonProperty("fromStudHrs")
    public void setFromStudHrs(Double fromStudHrs) {
        this.fromStudHrs = fromStudHrs;
    }

    public RegistrationFeeAssessmentRules100GetResponse withFromStudHrs(Double fromStudHrs) {
        this.fromStudHrs = fromStudHrs;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    public String getCrseWaivInd() {
        return crseWaivInd;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    public void setCrseWaivInd(String crseWaivInd) {
        this.crseWaivInd = crseWaivInd;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCrseWaivInd(String crseWaivInd) {
        this.crseWaivInd = crseWaivInd;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRRGFE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRRGFE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public RegistrationFeeAssessmentRules100GetResponse withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    public String getLevlCodeCrse() {
        return levlCodeCrse;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    public void setLevlCodeCrse(String levlCodeCrse) {
        this.levlCodeCrse = levlCodeCrse;
    }

    public RegistrationFeeAssessmentRules100GetResponse withLevlCodeCrse(String levlCodeCrse) {
        this.levlCodeCrse = levlCodeCrse;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("perCredCharge")
    public Double getPerCredCharge() {
        return perCredCharge;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("perCredCharge")
    public void setPerCredCharge(Double perCredCharge) {
        this.perCredCharge = perCredCharge;
    }

    public RegistrationFeeAssessmentRules100GetResponse withPerCredCharge(Double perCredCharge) {
        this.perCredCharge = perCredCharge;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RegistrationFeeAssessmentRules100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public RegistrationFeeAssessmentRules100GetResponse withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    public String getLfstPrimSecCde() {
        return lfstPrimSecCde;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    public void setLfstPrimSecCde(String lfstPrimSecCde) {
        this.lfstPrimSecCde = lfstPrimSecCde;
    }

    public RegistrationFeeAssessmentRules100GetResponse withLfstPrimSecCde(String lfstPrimSecCde) {
        this.lfstPrimSecCde = lfstPrimSecCde;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public RegistrationFeeAssessmentRules100GetResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Registration Dates From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_ADD_DATE
     * 
     */
    @JsonProperty("fromAddDate")
    public Date getFromAddDate() {
        return fromAddDate;
    }

    /**
     * Registration Dates From
     * <p>
     * Lineage reference object : SFRRGFE_FROM_ADD_DATE
     * 
     */
    @JsonProperty("fromAddDate")
    public void setFromAddDate(Date fromAddDate) {
        this.fromAddDate = fromAddDate;
    }

    public RegistrationFeeAssessmentRules100GetResponse withFromAddDate(Date fromAddDate) {
        this.fromAddDate = fromAddDate;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    public String getCopyInd() {
        return copyInd;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    public void setCopyInd(String copyInd) {
        this.copyInd = copyInd;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCopyInd(String copyInd) {
        this.copyInd = copyInd;
        return this;
    }

    /**
     * Course Overload Start Hours
     * <p>
     * Lineage reference object : SFRRGFE_CRSE_OVERLOAD_START_HR
     * 
     */
    @JsonProperty("crseOverloadStartHr")
    public Double getCrseOverloadStartHr() {
        return crseOverloadStartHr;
    }

    /**
     * Course Overload Start Hours
     * <p>
     * Lineage reference object : SFRRGFE_CRSE_OVERLOAD_START_HR
     * 
     */
    @JsonProperty("crseOverloadStartHr")
    public void setCrseOverloadStartHr(Double crseOverloadStartHr) {
        this.crseOverloadStartHr = crseOverloadStartHr;
    }

    public RegistrationFeeAssessmentRules100GetResponse withCrseOverloadStartHr(Double crseOverloadStartHr) {
        this.crseOverloadStartHr = crseOverloadStartHr;
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

    public RegistrationFeeAssessmentRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationFeeAssessmentRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("toFlatHrs");
        sb.append('=');
        sb.append(((this.toFlatHrs == null)?"<null>":this.toFlatHrs));
        sb.append(',');
        sb.append("toStudHrs");
        sb.append('=');
        sb.append(((this.toStudHrs == null)?"<null>":this.toStudHrs));
        sb.append(',');
        sb.append("campCodeCrse");
        sb.append('=');
        sb.append(((this.campCodeCrse == null)?"<null>":this.campCodeCrse));
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
        sb.append("minCharge");
        sb.append('=');
        sb.append(((this.minCharge == null)?"<null>":this.minCharge));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("flatFeeAmount");
        sb.append('=');
        sb.append(((this.flatFeeAmount == null)?"<null>":this.flatFeeAmount));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("fromCredHrs");
        sb.append('=');
        sb.append(((this.fromCredHrs == null)?"<null>":this.fromCredHrs));
        sb.append(',');
        sb.append("entryType");
        sb.append('=');
        sb.append(((this.entryType == null)?"<null>":this.entryType));
        sb.append(',');
        sb.append("maxCharge");
        sb.append('=');
        sb.append(((this.maxCharge == null)?"<null>":this.maxCharge));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("toAddDate");
        sb.append('=');
        sb.append(((this.toAddDate == null)?"<null>":this.toAddDate));
        sb.append(',');
        sb.append("toCredHrs");
        sb.append('=');
        sb.append(((this.toCredHrs == null)?"<null>":this.toCredHrs));
        sb.append(',');
        sb.append("assessByCourseInd");
        sb.append('=');
        sb.append(((this.assessByCourseInd == null)?"<null>":this.assessByCourseInd));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("tbbdetcDcatCode");
        sb.append('=');
        sb.append(((this.tbbdetcDcatCode == null)?"<null>":this.tbbdetcDcatCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("stypCodeCurric");
        sb.append('=');
        sb.append(((this.stypCodeCurric == null)?"<null>":this.stypCodeCurric));
        sb.append(',');
        sb.append("fromFlatHrs");
        sb.append('=');
        sb.append(((this.fromFlatHrs == null)?"<null>":this.fromFlatHrs));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
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
        sb.append("attrCodeCrse");
        sb.append('=');
        sb.append(((this.attrCodeCrse == null)?"<null>":this.attrCodeCrse));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("fromStudHrs");
        sb.append('=');
        sb.append(((this.fromStudHrs == null)?"<null>":this.fromStudHrs));
        sb.append(',');
        sb.append("crseWaivInd");
        sb.append('=');
        sb.append(((this.crseWaivInd == null)?"<null>":this.crseWaivInd));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("levlCodeCrse");
        sb.append('=');
        sb.append(((this.levlCodeCrse == null)?"<null>":this.levlCodeCrse));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("perCredCharge");
        sb.append('=');
        sb.append(((this.perCredCharge == null)?"<null>":this.perCredCharge));
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
        sb.append("lfstPrimSecCde");
        sb.append('=');
        sb.append(((this.lfstPrimSecCde == null)?"<null>":this.lfstPrimSecCde));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("fromAddDate");
        sb.append('=');
        sb.append(((this.fromAddDate == null)?"<null>":this.fromAddDate));
        sb.append(',');
        sb.append("copyInd");
        sb.append('=');
        sb.append(((this.copyInd == null)?"<null>":this.copyInd));
        sb.append(',');
        sb.append("crseOverloadStartHr");
        sb.append('=');
        sb.append(((this.crseOverloadStartHr == null)?"<null>":this.crseOverloadStartHr));
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
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.toFlatHrs == null)? 0 :this.toFlatHrs.hashCode()));
        result = ((result* 31)+((this.toStudHrs == null)? 0 :this.toStudHrs.hashCode()));
        result = ((result* 31)+((this.campCodeCrse == null)? 0 :this.campCodeCrse.hashCode()));
        result = ((result* 31)+((this.detlCode == null)? 0 :this.detlCode.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.minCharge == null)? 0 :this.minCharge.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.flatFeeAmount == null)? 0 :this.flatFeeAmount.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.fromCredHrs == null)? 0 :this.fromCredHrs.hashCode()));
        result = ((result* 31)+((this.entryType == null)? 0 :this.entryType.hashCode()));
        result = ((result* 31)+((this.maxCharge == null)? 0 :this.maxCharge.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.toAddDate == null)? 0 :this.toAddDate.hashCode()));
        result = ((result* 31)+((this.toCredHrs == null)? 0 :this.toCredHrs.hashCode()));
        result = ((result* 31)+((this.assessByCourseInd == null)? 0 :this.assessByCourseInd.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.tbbdetcDcatCode == null)? 0 :this.tbbdetcDcatCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.stypCodeCurric == null)? 0 :this.stypCodeCurric.hashCode()));
        result = ((result* 31)+((this.fromFlatHrs == null)? 0 :this.fromFlatHrs.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.rateCodeCurric == null)? 0 :this.rateCodeCurric.hashCode()));
        result = ((result* 31)+((this.attrCodeCrse == null)? 0 :this.attrCodeCrse.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.fromStudHrs == null)? 0 :this.fromStudHrs.hashCode()));
        result = ((result* 31)+((this.crseWaivInd == null)? 0 :this.crseWaivInd.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.levlCodeCrse == null)? 0 :this.levlCodeCrse.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.perCredCharge == null)? 0 :this.perCredCharge.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.lfstPrimSecCde == null)? 0 :this.lfstPrimSecCde.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.fromAddDate == null)? 0 :this.fromAddDate.hashCode()));
        result = ((result* 31)+((this.copyInd == null)? 0 :this.copyInd.hashCode()));
        result = ((result* 31)+((this.crseOverloadStartHr == null)? 0 :this.crseOverloadStartHr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationFeeAssessmentRules100GetResponse) == false) {
            return false;
        }
        RegistrationFeeAssessmentRules100GetResponse rhs = ((RegistrationFeeAssessmentRules100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde))))&&((this.toFlatHrs == rhs.toFlatHrs)||((this.toFlatHrs!= null)&&this.toFlatHrs.equals(rhs.toFlatHrs))))&&((this.toStudHrs == rhs.toStudHrs)||((this.toStudHrs!= null)&&this.toStudHrs.equals(rhs.toStudHrs))))&&((this.campCodeCrse == rhs.campCodeCrse)||((this.campCodeCrse!= null)&&this.campCodeCrse.equals(rhs.campCodeCrse))))&&((this.detlCode == rhs.detlCode)||((this.detlCode!= null)&&this.detlCode.equals(rhs.detlCode))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.minCharge == rhs.minCharge)||((this.minCharge!= null)&&this.minCharge.equals(rhs.minCharge))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.flatFeeAmount == rhs.flatFeeAmount)||((this.flatFeeAmount!= null)&&this.flatFeeAmount.equals(rhs.flatFeeAmount))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.fromCredHrs == rhs.fromCredHrs)||((this.fromCredHrs!= null)&&this.fromCredHrs.equals(rhs.fromCredHrs))))&&((this.entryType == rhs.entryType)||((this.entryType!= null)&&this.entryType.equals(rhs.entryType))))&&((this.maxCharge == rhs.maxCharge)||((this.maxCharge!= null)&&this.maxCharge.equals(rhs.maxCharge))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.toAddDate == rhs.toAddDate)||((this.toAddDate!= null)&&this.toAddDate.equals(rhs.toAddDate))))&&((this.toCredHrs == rhs.toCredHrs)||((this.toCredHrs!= null)&&this.toCredHrs.equals(rhs.toCredHrs))))&&((this.assessByCourseInd == rhs.assessByCourseInd)||((this.assessByCourseInd!= null)&&this.assessByCourseInd.equals(rhs.assessByCourseInd))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.tbbdetcDcatCode == rhs.tbbdetcDcatCode)||((this.tbbdetcDcatCode!= null)&&this.tbbdetcDcatCode.equals(rhs.tbbdetcDcatCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.stypCodeCurric == rhs.stypCodeCurric)||((this.stypCodeCurric!= null)&&this.stypCodeCurric.equals(rhs.stypCodeCurric))))&&((this.fromFlatHrs == rhs.fromFlatHrs)||((this.fromFlatHrs!= null)&&this.fromFlatHrs.equals(rhs.fromFlatHrs))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.rateCodeCurric == rhs.rateCodeCurric)||((this.rateCodeCurric!= null)&&this.rateCodeCurric.equals(rhs.rateCodeCurric))))&&((this.attrCodeCrse == rhs.attrCodeCrse)||((this.attrCodeCrse!= null)&&this.attrCodeCrse.equals(rhs.attrCodeCrse))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.fromStudHrs == rhs.fromStudHrs)||((this.fromStudHrs!= null)&&this.fromStudHrs.equals(rhs.fromStudHrs))))&&((this.crseWaivInd == rhs.crseWaivInd)||((this.crseWaivInd!= null)&&this.crseWaivInd.equals(rhs.crseWaivInd))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.levlCodeCrse == rhs.levlCodeCrse)||((this.levlCodeCrse!= null)&&this.levlCodeCrse.equals(rhs.levlCodeCrse))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.perCredCharge == rhs.perCredCharge)||((this.perCredCharge!= null)&&this.perCredCharge.equals(rhs.perCredCharge))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.lfstPrimSecCde == rhs.lfstPrimSecCde)||((this.lfstPrimSecCde!= null)&&this.lfstPrimSecCde.equals(rhs.lfstPrimSecCde))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.fromAddDate == rhs.fromAddDate)||((this.fromAddDate!= null)&&this.fromAddDate.equals(rhs.fromAddDate))))&&((this.copyInd == rhs.copyInd)||((this.copyInd!= null)&&this.copyInd.equals(rhs.copyInd))))&&((this.crseOverloadStartHr == rhs.crseOverloadStartHr)||((this.crseOverloadStartHr!= null)&&this.crseOverloadStartHr.equals(rhs.crseOverloadStartHr))));
    }

}
