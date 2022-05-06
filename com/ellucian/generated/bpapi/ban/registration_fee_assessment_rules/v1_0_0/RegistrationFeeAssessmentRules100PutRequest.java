
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
    "criteria.program",
    "vtypCode",
    "criteria.userId",
    "primSecCde",
    "toFlatHrs",
    "toStudHrs",
    "detlCode",
    "campCodeCrse",
    "criteria.levlCode",
    "criteria.collCode",
    "degcCode",
    "program",
    "majrCode",
    "minCharge",
    "schdCode",
    "lfstCode",
    "flatFeeAmount",
    "criteria.crseWaivInd",
    "criteria.maxCharge",
    "campCode",
    "fromCredHrs",
    "criteria.termCodeAdmit",
    "criteria.copyInd",
    "criteria.rateCodeCurric",
    "entryType",
    "maxCharge",
    "criteria.degcCode",
    "resdCode",
    "criteria.stspSessCode",
    "toAddDate",
    "toCredHrs",
    "setCopyIndEnMassInd",
    "criteria.entryType",
    "criteria.perCredCharge",
    "assessByCourseInd",
    "ptrmCode",
    "criteria.campCodeCrse",
    "criteria.seqno",
    "collCode",
    "criteria.lfstPrimSecCde",
    "criteria.primSecCde",
    "levlCode",
    "deptCode",
    "criteria.tbbdetcDcatCode",
    "stypCodeCurric",
    "blockKeyEntryType",
    "criteria.activityDate",
    "criteria.campCode",
    "criteria.attrCodeCrse",
    "fromFlatHrs",
    "criteria.deptCode",
    "rateCode",
    "criteria.lfstCode",
    "criteria.minCharge",
    "chrtCode",
    "rateCodeCurric",
    "ruleType",
    "criteria.detlCode",
    "clasCode",
    "fromStudHrs",
    "criteria.majrCode",
    "crseWaivInd",
    "gmodCode",
    "insmCode",
    "criteria.stypCodeCurric",
    "perCredCharge",
    "criteria.stspResdCode",
    "criteria.levlCodeCrse",
    "attsCode",
    "termCodeAdmit",
    "lfstPrimSecCde",
    "stypCode",
    "fromAddDate",
    "termCode",
    "copyInd",
    "crseOverloadStartHr"
})
@Generated("jsonschema2pojo")
public class RegistrationFeeAssessmentRules100PutRequest {

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle")
    private String criteriaProgram;
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
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_USER_ID")
    private String criteriaUserId;
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
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp")
    private String campCodeCrse;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
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
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
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
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("criteria.crseWaivInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CRSE_WAIV_IND")
    private String criteriaCrseWaivInd;
    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAX_CHARGE")
    private Double criteriaMaxCharge;
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
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeAdmit;
    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("criteria.copyInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COPY_IND")
    private String criteriaCopyInd;
    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate")
    private String criteriaRateCodeCurric;
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
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaDegcCode;
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
     * Session
     * <p>
     * Lineage reference object : SFRRGFE_STSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.stspSessCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STSP_SESS_CODE, Lookup lineage reference object : stvsess")
    private String criteriaStspSessCode;
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
     * Set Copy Indicator
     * <p>
     * Lineage reference object : setCopyIndEnMassInd
     * 
     */
    @JsonProperty("setCopyIndEnMassInd")
    @JsonPropertyDescription("Lineage reference object : setCopyIndEnMassInd")
    private Object setCopyIndEnMassInd;
    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("criteria.entryType")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ENTRY_TYPE")
    private String criteriaEntryType;
    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.perCredCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PER_CRED_CHARGE")
    private Double criteriaPerCredCharge;
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
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCodeCrse;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_SEQNO")
    private Double criteriaSeqno;
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
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.lfstPrimSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE")
    private String criteriaLfstPrimSecCde;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.primSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PRIM_SEC_CDE")
    private String criteriaPrimSecCde;
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
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tbbdetcDcatCode")
    private String criteriaTbbdetcDcatCode;
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
     * Entry Type
     * <p>
     * Lineage reference object : entryType
     * 
     */
    @JsonProperty("blockKeyEntryType")
    @JsonPropertyDescription("Lineage reference object : entryType")
    private Object blockKeyEntryType;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr")
    private String criteriaAttrCodeCrse;
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
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
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
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("criteria.lfstCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String criteriaLfstCode;
    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.minCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MIN_CHARGE")
    private Double criteriaMinCharge;
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
     * Rule Type
     * <p>
     * Lineage reference object : ruleType
     * 
     */
    @JsonProperty("ruleType")
    @JsonPropertyDescription("Lineage reference object : ruleType")
    private Object ruleType;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetlCode;
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
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCode;
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
     * Instructional Method
     * <p>
     * Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp")
    private String criteriaStypCodeCurric;
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
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_STSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.stspResdCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STSP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String criteriaStspResdCode;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCodeCrse;
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
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCode;
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
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

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

    public RegistrationFeeAssessmentRules100PutRequest withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
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

    public RegistrationFeeAssessmentRules100PutRequest withPrimSecCde(String primSecCde) {
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

    public RegistrationFeeAssessmentRules100PutRequest withToFlatHrs(Double toFlatHrs) {
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

    public RegistrationFeeAssessmentRules100PutRequest withToStudHrs(Double toStudHrs) {
        this.toStudHrs = toStudHrs;
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

    public RegistrationFeeAssessmentRules100PutRequest withDetlCode(String detlCode) {
        this.detlCode = detlCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withCampCodeCrse(String campCodeCrse) {
        this.campCodeCrse = campCodeCrse;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withDegcCode(String degcCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withProgram(String program) {
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

    public RegistrationFeeAssessmentRules100PutRequest withMajrCode(String majrCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withMinCharge(Double minCharge) {
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

    public RegistrationFeeAssessmentRules100PutRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withFlatFeeAmount(Double flatFeeAmount) {
        this.flatFeeAmount = flatFeeAmount;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("criteria.crseWaivInd")
    public String getCriteriaCrseWaivInd() {
        return criteriaCrseWaivInd;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("criteria.crseWaivInd")
    public void setCriteriaCrseWaivInd(String criteriaCrseWaivInd) {
        this.criteriaCrseWaivInd = criteriaCrseWaivInd;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaCrseWaivInd(String criteriaCrseWaivInd) {
        this.criteriaCrseWaivInd = criteriaCrseWaivInd;
        return this;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxCharge")
    public Double getCriteriaMaxCharge() {
        return criteriaMaxCharge;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxCharge")
    public void setCriteriaMaxCharge(Double criteriaMaxCharge) {
        this.criteriaMaxCharge = criteriaMaxCharge;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaMaxCharge(Double criteriaMaxCharge) {
        this.criteriaMaxCharge = criteriaMaxCharge;
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

    public RegistrationFeeAssessmentRules100PutRequest withCampCode(String campCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withFromCredHrs(Double fromCredHrs) {
        this.fromCredHrs = fromCredHrs;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeAdmit")
    public String getCriteriaTermCodeAdmit() {
        return criteriaTermCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeAdmit")
    public void setCriteriaTermCodeAdmit(String criteriaTermCodeAdmit) {
        this.criteriaTermCodeAdmit = criteriaTermCodeAdmit;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaTermCodeAdmit(String criteriaTermCodeAdmit) {
        this.criteriaTermCodeAdmit = criteriaTermCodeAdmit;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("criteria.copyInd")
    public String getCriteriaCopyInd() {
        return criteriaCopyInd;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("criteria.copyInd")
    public void setCriteriaCopyInd(String criteriaCopyInd) {
        this.criteriaCopyInd = criteriaCopyInd;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaCopyInd(String criteriaCopyInd) {
        this.criteriaCopyInd = criteriaCopyInd;
        return this;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCodeCurric")
    public String getCriteriaRateCodeCurric() {
        return criteriaRateCodeCurric;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("criteria.rateCodeCurric")
    public void setCriteriaRateCodeCurric(String criteriaRateCodeCurric) {
        this.criteriaRateCodeCurric = criteriaRateCodeCurric;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaRateCodeCurric(String criteriaRateCodeCurric) {
        this.criteriaRateCodeCurric = criteriaRateCodeCurric;
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

    public RegistrationFeeAssessmentRules100PutRequest withEntryType(String entryType) {
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

    public RegistrationFeeAssessmentRules100PutRequest withMaxCharge(Double maxCharge) {
        this.maxCharge = maxCharge;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public String getCriteriaDegcCode() {
        return criteriaDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public void setCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SFRRGFE_STSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.stspSessCode")
    public String getCriteriaStspSessCode() {
        return criteriaStspSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SFRRGFE_STSP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("criteria.stspSessCode")
    public void setCriteriaStspSessCode(String criteriaStspSessCode) {
        this.criteriaStspSessCode = criteriaStspSessCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaStspSessCode(String criteriaStspSessCode) {
        this.criteriaStspSessCode = criteriaStspSessCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withToAddDate(Date toAddDate) {
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

    public RegistrationFeeAssessmentRules100PutRequest withToCredHrs(Double toCredHrs) {
        this.toCredHrs = toCredHrs;
        return this;
    }

    /**
     * Set Copy Indicator
     * <p>
     * Lineage reference object : setCopyIndEnMassInd
     * 
     */
    @JsonProperty("setCopyIndEnMassInd")
    public Object getSetCopyIndEnMassInd() {
        return setCopyIndEnMassInd;
    }

    /**
     * Set Copy Indicator
     * <p>
     * Lineage reference object : setCopyIndEnMassInd
     * 
     */
    @JsonProperty("setCopyIndEnMassInd")
    public void setSetCopyIndEnMassInd(Object setCopyIndEnMassInd) {
        this.setCopyIndEnMassInd = setCopyIndEnMassInd;
    }

    public RegistrationFeeAssessmentRules100PutRequest withSetCopyIndEnMassInd(Object setCopyIndEnMassInd) {
        this.setCopyIndEnMassInd = setCopyIndEnMassInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("criteria.entryType")
    public String getCriteriaEntryType() {
        return criteriaEntryType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("criteria.entryType")
    public void setCriteriaEntryType(String criteriaEntryType) {
        this.criteriaEntryType = criteriaEntryType;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaEntryType(String criteriaEntryType) {
        this.criteriaEntryType = criteriaEntryType;
        return this;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.perCredCharge")
    public Double getCriteriaPerCredCharge() {
        return criteriaPerCredCharge;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.perCredCharge")
    public void setCriteriaPerCredCharge(Double criteriaPerCredCharge) {
        this.criteriaPerCredCharge = criteriaPerCredCharge;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaPerCredCharge(Double criteriaPerCredCharge) {
        this.criteriaPerCredCharge = criteriaPerCredCharge;
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

    public RegistrationFeeAssessmentRules100PutRequest withAssessByCourseInd(String assessByCourseInd) {
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

    public RegistrationFeeAssessmentRules100PutRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCodeCrse")
    public String getCriteriaCampCodeCrse() {
        return criteriaCampCodeCrse;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCodeCrse")
    public void setCriteriaCampCodeCrse(String criteriaCampCodeCrse) {
        this.criteriaCampCodeCrse = criteriaCampCodeCrse;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaCampCodeCrse(String criteriaCampCodeCrse) {
        this.criteriaCampCodeCrse = criteriaCampCodeCrse;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public Double getCriteriaSeqno() {
        return criteriaSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public void setCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
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

    public RegistrationFeeAssessmentRules100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.lfstPrimSecCde")
    public String getCriteriaLfstPrimSecCde() {
        return criteriaLfstPrimSecCde;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.lfstPrimSecCde")
    public void setCriteriaLfstPrimSecCde(String criteriaLfstPrimSecCde) {
        this.criteriaLfstPrimSecCde = criteriaLfstPrimSecCde;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaLfstPrimSecCde(String criteriaLfstPrimSecCde) {
        this.criteriaLfstPrimSecCde = criteriaLfstPrimSecCde;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.primSecCde")
    public String getCriteriaPrimSecCde() {
        return criteriaPrimSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("criteria.primSecCde")
    public void setCriteriaPrimSecCde(String criteriaPrimSecCde) {
        this.criteriaPrimSecCde = criteriaPrimSecCde;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaPrimSecCde(String criteriaPrimSecCde) {
        this.criteriaPrimSecCde = criteriaPrimSecCde;
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

    public RegistrationFeeAssessmentRules100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tbbdetcDcatCode")
    public String getCriteriaTbbdetcDcatCode() {
        return criteriaTbbdetcDcatCode;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tbbdetcDcatCode")
    public void setCriteriaTbbdetcDcatCode(String criteriaTbbdetcDcatCode) {
        this.criteriaTbbdetcDcatCode = criteriaTbbdetcDcatCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaTbbdetcDcatCode(String criteriaTbbdetcDcatCode) {
        this.criteriaTbbdetcDcatCode = criteriaTbbdetcDcatCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
        return this;
    }

    /**
     * Entry Type
     * <p>
     * Lineage reference object : entryType
     * 
     */
    @JsonProperty("blockKeyEntryType")
    public Object getBlockKeyEntryType() {
        return blockKeyEntryType;
    }

    /**
     * Entry Type
     * <p>
     * Lineage reference object : entryType
     * 
     */
    @JsonProperty("blockKeyEntryType")
    public void setBlockKeyEntryType(Object blockKeyEntryType) {
        this.blockKeyEntryType = blockKeyEntryType;
    }

    public RegistrationFeeAssessmentRules100PutRequest withBlockKeyEntryType(Object blockKeyEntryType) {
        this.blockKeyEntryType = blockKeyEntryType;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeCrse")
    public String getCriteriaAttrCodeCrse() {
        return criteriaAttrCodeCrse;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeCrse")
    public void setCriteriaAttrCodeCrse(String criteriaAttrCodeCrse) {
        this.criteriaAttrCodeCrse = criteriaAttrCodeCrse;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaAttrCodeCrse(String criteriaAttrCodeCrse) {
        this.criteriaAttrCodeCrse = criteriaAttrCodeCrse;
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

    public RegistrationFeeAssessmentRules100PutRequest withFromFlatHrs(Double fromFlatHrs) {
        this.fromFlatHrs = fromFlatHrs;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("criteria.lfstCode")
    public String getCriteriaLfstCode() {
        return criteriaLfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("criteria.lfstCode")
    public void setCriteriaLfstCode(String criteriaLfstCode) {
        this.criteriaLfstCode = criteriaLfstCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaLfstCode(String criteriaLfstCode) {
        this.criteriaLfstCode = criteriaLfstCode;
        return this;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.minCharge")
    public Double getCriteriaMinCharge() {
        return criteriaMinCharge;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.minCharge")
    public void setCriteriaMinCharge(Double criteriaMinCharge) {
        this.criteriaMinCharge = criteriaMinCharge;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaMinCharge(Double criteriaMinCharge) {
        this.criteriaMinCharge = criteriaMinCharge;
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

    public RegistrationFeeAssessmentRules100PutRequest withChrtCode(String chrtCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
        return this;
    }

    /**
     * Rule Type
     * <p>
     * Lineage reference object : ruleType
     * 
     */
    @JsonProperty("ruleType")
    public Object getRuleType() {
        return ruleType;
    }

    /**
     * Rule Type
     * <p>
     * Lineage reference object : ruleType
     * 
     */
    @JsonProperty("ruleType")
    public void setRuleType(Object ruleType) {
        this.ruleType = ruleType;
    }

    public RegistrationFeeAssessmentRules100PutRequest withRuleType(Object ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detlCode")
    public String getCriteriaDetlCode() {
        return criteriaDetlCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detlCode")
    public void setCriteriaDetlCode(String criteriaDetlCode) {
        this.criteriaDetlCode = criteriaDetlCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaDetlCode(String criteriaDetlCode) {
        this.criteriaDetlCode = criteriaDetlCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withClasCode(String clasCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withFromStudHrs(Double fromStudHrs) {
        this.fromStudHrs = fromStudHrs;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCode")
    public String getCriteriaMajrCode() {
        return criteriaMajrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCode")
    public void setCriteriaMajrCode(String criteriaMajrCode) {
        this.criteriaMajrCode = criteriaMajrCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaMajrCode(String criteriaMajrCode) {
        this.criteriaMajrCode = criteriaMajrCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withCrseWaivInd(String crseWaivInd) {
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

    public RegistrationFeeAssessmentRules100PutRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCodeCurric")
    public String getCriteriaStypCodeCurric() {
        return criteriaStypCodeCurric;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCodeCurric")
    public void setCriteriaStypCodeCurric(String criteriaStypCodeCurric) {
        this.criteriaStypCodeCurric = criteriaStypCodeCurric;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaStypCodeCurric(String criteriaStypCodeCurric) {
        this.criteriaStypCodeCurric = criteriaStypCodeCurric;
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

    public RegistrationFeeAssessmentRules100PutRequest withPerCredCharge(Double perCredCharge) {
        this.perCredCharge = perCredCharge;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_STSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.stspResdCode")
    public String getCriteriaStspResdCode() {
        return criteriaStspResdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRRGFE_STSP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.stspResdCode")
    public void setCriteriaStspResdCode(String criteriaStspResdCode) {
        this.criteriaStspResdCode = criteriaStspResdCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaStspResdCode(String criteriaStspResdCode) {
        this.criteriaStspResdCode = criteriaStspResdCode;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCodeCrse")
    public String getCriteriaLevlCodeCrse() {
        return criteriaLevlCodeCrse;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levlCodeCrse")
    public void setCriteriaLevlCodeCrse(String criteriaLevlCodeCrse) {
        this.criteriaLevlCodeCrse = criteriaLevlCodeCrse;
    }

    public RegistrationFeeAssessmentRules100PutRequest withCriteriaLevlCodeCrse(String criteriaLevlCodeCrse) {
        this.criteriaLevlCodeCrse = criteriaLevlCodeCrse;
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

    public RegistrationFeeAssessmentRules100PutRequest withAttsCode(String attsCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withTermCodeAdmit(String termCodeAdmit) {
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

    public RegistrationFeeAssessmentRules100PutRequest withLfstPrimSecCde(String lfstPrimSecCde) {
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

    public RegistrationFeeAssessmentRules100PutRequest withStypCode(String stypCode) {
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

    public RegistrationFeeAssessmentRules100PutRequest withFromAddDate(Date fromAddDate) {
        this.fromAddDate = fromAddDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public RegistrationFeeAssessmentRules100PutRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public RegistrationFeeAssessmentRules100PutRequest withCopyInd(String copyInd) {
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

    public RegistrationFeeAssessmentRules100PutRequest withCrseOverloadStartHr(Double crseOverloadStartHr) {
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

    public RegistrationFeeAssessmentRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationFeeAssessmentRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
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
        sb.append("detlCode");
        sb.append('=');
        sb.append(((this.detlCode == null)?"<null>":this.detlCode));
        sb.append(',');
        sb.append("campCodeCrse");
        sb.append('=');
        sb.append(((this.campCodeCrse == null)?"<null>":this.campCodeCrse));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
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
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("flatFeeAmount");
        sb.append('=');
        sb.append(((this.flatFeeAmount == null)?"<null>":this.flatFeeAmount));
        sb.append(',');
        sb.append("criteriaCrseWaivInd");
        sb.append('=');
        sb.append(((this.criteriaCrseWaivInd == null)?"<null>":this.criteriaCrseWaivInd));
        sb.append(',');
        sb.append("criteriaMaxCharge");
        sb.append('=');
        sb.append(((this.criteriaMaxCharge == null)?"<null>":this.criteriaMaxCharge));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("fromCredHrs");
        sb.append('=');
        sb.append(((this.fromCredHrs == null)?"<null>":this.fromCredHrs));
        sb.append(',');
        sb.append("criteriaTermCodeAdmit");
        sb.append('=');
        sb.append(((this.criteriaTermCodeAdmit == null)?"<null>":this.criteriaTermCodeAdmit));
        sb.append(',');
        sb.append("criteriaCopyInd");
        sb.append('=');
        sb.append(((this.criteriaCopyInd == null)?"<null>":this.criteriaCopyInd));
        sb.append(',');
        sb.append("criteriaRateCodeCurric");
        sb.append('=');
        sb.append(((this.criteriaRateCodeCurric == null)?"<null>":this.criteriaRateCodeCurric));
        sb.append(',');
        sb.append("entryType");
        sb.append('=');
        sb.append(((this.entryType == null)?"<null>":this.entryType));
        sb.append(',');
        sb.append("maxCharge");
        sb.append('=');
        sb.append(((this.maxCharge == null)?"<null>":this.maxCharge));
        sb.append(',');
        sb.append("criteriaDegcCode");
        sb.append('=');
        sb.append(((this.criteriaDegcCode == null)?"<null>":this.criteriaDegcCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("criteriaStspSessCode");
        sb.append('=');
        sb.append(((this.criteriaStspSessCode == null)?"<null>":this.criteriaStspSessCode));
        sb.append(',');
        sb.append("toAddDate");
        sb.append('=');
        sb.append(((this.toAddDate == null)?"<null>":this.toAddDate));
        sb.append(',');
        sb.append("toCredHrs");
        sb.append('=');
        sb.append(((this.toCredHrs == null)?"<null>":this.toCredHrs));
        sb.append(',');
        sb.append("setCopyIndEnMassInd");
        sb.append('=');
        sb.append(((this.setCopyIndEnMassInd == null)?"<null>":this.setCopyIndEnMassInd));
        sb.append(',');
        sb.append("criteriaEntryType");
        sb.append('=');
        sb.append(((this.criteriaEntryType == null)?"<null>":this.criteriaEntryType));
        sb.append(',');
        sb.append("criteriaPerCredCharge");
        sb.append('=');
        sb.append(((this.criteriaPerCredCharge == null)?"<null>":this.criteriaPerCredCharge));
        sb.append(',');
        sb.append("assessByCourseInd");
        sb.append('=');
        sb.append(((this.assessByCourseInd == null)?"<null>":this.assessByCourseInd));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("criteriaCampCodeCrse");
        sb.append('=');
        sb.append(((this.criteriaCampCodeCrse == null)?"<null>":this.criteriaCampCodeCrse));
        sb.append(',');
        sb.append("criteriaSeqno");
        sb.append('=');
        sb.append(((this.criteriaSeqno == null)?"<null>":this.criteriaSeqno));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("criteriaLfstPrimSecCde");
        sb.append('=');
        sb.append(((this.criteriaLfstPrimSecCde == null)?"<null>":this.criteriaLfstPrimSecCde));
        sb.append(',');
        sb.append("criteriaPrimSecCde");
        sb.append('=');
        sb.append(((this.criteriaPrimSecCde == null)?"<null>":this.criteriaPrimSecCde));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("criteriaTbbdetcDcatCode");
        sb.append('=');
        sb.append(((this.criteriaTbbdetcDcatCode == null)?"<null>":this.criteriaTbbdetcDcatCode));
        sb.append(',');
        sb.append("stypCodeCurric");
        sb.append('=');
        sb.append(((this.stypCodeCurric == null)?"<null>":this.stypCodeCurric));
        sb.append(',');
        sb.append("blockKeyEntryType");
        sb.append('=');
        sb.append(((this.blockKeyEntryType == null)?"<null>":this.blockKeyEntryType));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("criteriaAttrCodeCrse");
        sb.append('=');
        sb.append(((this.criteriaAttrCodeCrse == null)?"<null>":this.criteriaAttrCodeCrse));
        sb.append(',');
        sb.append("fromFlatHrs");
        sb.append('=');
        sb.append(((this.fromFlatHrs == null)?"<null>":this.fromFlatHrs));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("criteriaLfstCode");
        sb.append('=');
        sb.append(((this.criteriaLfstCode == null)?"<null>":this.criteriaLfstCode));
        sb.append(',');
        sb.append("criteriaMinCharge");
        sb.append('=');
        sb.append(((this.criteriaMinCharge == null)?"<null>":this.criteriaMinCharge));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("rateCodeCurric");
        sb.append('=');
        sb.append(((this.rateCodeCurric == null)?"<null>":this.rateCodeCurric));
        sb.append(',');
        sb.append("ruleType");
        sb.append('=');
        sb.append(((this.ruleType == null)?"<null>":this.ruleType));
        sb.append(',');
        sb.append("criteriaDetlCode");
        sb.append('=');
        sb.append(((this.criteriaDetlCode == null)?"<null>":this.criteriaDetlCode));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("fromStudHrs");
        sb.append('=');
        sb.append(((this.fromStudHrs == null)?"<null>":this.fromStudHrs));
        sb.append(',');
        sb.append("criteriaMajrCode");
        sb.append('=');
        sb.append(((this.criteriaMajrCode == null)?"<null>":this.criteriaMajrCode));
        sb.append(',');
        sb.append("crseWaivInd");
        sb.append('=');
        sb.append(((this.crseWaivInd == null)?"<null>":this.crseWaivInd));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("criteriaStypCodeCurric");
        sb.append('=');
        sb.append(((this.criteriaStypCodeCurric == null)?"<null>":this.criteriaStypCodeCurric));
        sb.append(',');
        sb.append("perCredCharge");
        sb.append('=');
        sb.append(((this.perCredCharge == null)?"<null>":this.perCredCharge));
        sb.append(',');
        sb.append("criteriaStspResdCode");
        sb.append('=');
        sb.append(((this.criteriaStspResdCode == null)?"<null>":this.criteriaStspResdCode));
        sb.append(',');
        sb.append("criteriaLevlCodeCrse");
        sb.append('=');
        sb.append(((this.criteriaLevlCodeCrse == null)?"<null>":this.criteriaLevlCodeCrse));
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
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.detlCode == null)? 0 :this.detlCode.hashCode()));
        result = ((result* 31)+((this.campCodeCrse == null)? 0 :this.campCodeCrse.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.minCharge == null)? 0 :this.minCharge.hashCode()));
        result = ((result* 31)+((this.criteriaStspSessCode == null)? 0 :this.criteriaStspSessCode.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.flatFeeAmount == null)? 0 :this.flatFeeAmount.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.fromCredHrs == null)? 0 :this.fromCredHrs.hashCode()));
        result = ((result* 31)+((this.criteriaSeqno == null)? 0 :this.criteriaSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaTbbdetcDcatCode == null)? 0 :this.criteriaTbbdetcDcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.entryType == null)? 0 :this.entryType.hashCode()));
        result = ((result* 31)+((this.criteriaLfstCode == null)? 0 :this.criteriaLfstCode.hashCode()));
        result = ((result* 31)+((this.maxCharge == null)? 0 :this.maxCharge.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.toAddDate == null)? 0 :this.toAddDate.hashCode()));
        result = ((result* 31)+((this.criteriaAttrCodeCrse == null)? 0 :this.criteriaAttrCodeCrse.hashCode()));
        result = ((result* 31)+((this.criteriaMinCharge == null)? 0 :this.criteriaMinCharge.hashCode()));
        result = ((result* 31)+((this.toCredHrs == null)? 0 :this.toCredHrs.hashCode()));
        result = ((result* 31)+((this.setCopyIndEnMassInd == null)? 0 :this.setCopyIndEnMassInd.hashCode()));
        result = ((result* 31)+((this.criteriaCrseWaivInd == null)? 0 :this.criteriaCrseWaivInd.hashCode()));
        result = ((result* 31)+((this.assessByCourseInd == null)? 0 :this.assessByCourseInd.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaMaxCharge == null)? 0 :this.criteriaMaxCharge.hashCode()));
        result = ((result* 31)+((this.criteriaCampCodeCrse == null)? 0 :this.criteriaCampCodeCrse.hashCode()));
        result = ((result* 31)+((this.criteriaStypCodeCurric == null)? 0 :this.criteriaStypCodeCurric.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.stypCodeCurric == null)? 0 :this.stypCodeCurric.hashCode()));
        result = ((result* 31)+((this.criteriaDegcCode == null)? 0 :this.criteriaDegcCode.hashCode()));
        result = ((result* 31)+((this.blockKeyEntryType == null)? 0 :this.blockKeyEntryType.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeAdmit == null)? 0 :this.criteriaTermCodeAdmit.hashCode()));
        result = ((result* 31)+((this.criteriaPrimSecCde == null)? 0 :this.criteriaPrimSecCde.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCode == null)? 0 :this.criteriaMajrCode.hashCode()));
        result = ((result* 31)+((this.criteriaPerCredCharge == null)? 0 :this.criteriaPerCredCharge.hashCode()));
        result = ((result* 31)+((this.fromFlatHrs == null)? 0 :this.fromFlatHrs.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.rateCodeCurric == null)? 0 :this.rateCodeCurric.hashCode()));
        result = ((result* 31)+((this.ruleType == null)? 0 :this.ruleType.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.fromStudHrs == null)? 0 :this.fromStudHrs.hashCode()));
        result = ((result* 31)+((this.crseWaivInd == null)? 0 :this.crseWaivInd.hashCode()));
        result = ((result* 31)+((this.criteriaEntryType == null)? 0 :this.criteriaEntryType.hashCode()));
        result = ((result* 31)+((this.criteriaDetlCode == null)? 0 :this.criteriaDetlCode.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.perCredCharge == null)? 0 :this.perCredCharge.hashCode()));
        result = ((result* 31)+((this.criteriaLfstPrimSecCde == null)? 0 :this.criteriaLfstPrimSecCde.hashCode()));
        result = ((result* 31)+((this.criteriaRateCodeCurric == null)? 0 :this.criteriaRateCodeCurric.hashCode()));
        result = ((result* 31)+((this.criteriaCopyInd == null)? 0 :this.criteriaCopyInd.hashCode()));
        result = ((result* 31)+((this.criteriaStspResdCode == null)? 0 :this.criteriaStspResdCode.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCodeCrse == null)? 0 :this.criteriaLevlCodeCrse.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.lfstPrimSecCde == null)? 0 :this.lfstPrimSecCde.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.fromAddDate == null)? 0 :this.fromAddDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.copyInd == null)? 0 :this.copyInd.hashCode()));
        result = ((result* 31)+((this.crseOverloadStartHr == null)? 0 :this.crseOverloadStartHr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationFeeAssessmentRules100PutRequest) == false) {
            return false;
        }
        RegistrationFeeAssessmentRules100PutRequest rhs = ((RegistrationFeeAssessmentRules100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde))))&&((this.toFlatHrs == rhs.toFlatHrs)||((this.toFlatHrs!= null)&&this.toFlatHrs.equals(rhs.toFlatHrs))))&&((this.toStudHrs == rhs.toStudHrs)||((this.toStudHrs!= null)&&this.toStudHrs.equals(rhs.toStudHrs))))&&((this.detlCode == rhs.detlCode)||((this.detlCode!= null)&&this.detlCode.equals(rhs.detlCode))))&&((this.campCodeCrse == rhs.campCodeCrse)||((this.campCodeCrse!= null)&&this.campCodeCrse.equals(rhs.campCodeCrse))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.minCharge == rhs.minCharge)||((this.minCharge!= null)&&this.minCharge.equals(rhs.minCharge))))&&((this.criteriaStspSessCode == rhs.criteriaStspSessCode)||((this.criteriaStspSessCode!= null)&&this.criteriaStspSessCode.equals(rhs.criteriaStspSessCode))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.flatFeeAmount == rhs.flatFeeAmount)||((this.flatFeeAmount!= null)&&this.flatFeeAmount.equals(rhs.flatFeeAmount))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.fromCredHrs == rhs.fromCredHrs)||((this.fromCredHrs!= null)&&this.fromCredHrs.equals(rhs.fromCredHrs))))&&((this.criteriaSeqno == rhs.criteriaSeqno)||((this.criteriaSeqno!= null)&&this.criteriaSeqno.equals(rhs.criteriaSeqno))))&&((this.criteriaTbbdetcDcatCode == rhs.criteriaTbbdetcDcatCode)||((this.criteriaTbbdetcDcatCode!= null)&&this.criteriaTbbdetcDcatCode.equals(rhs.criteriaTbbdetcDcatCode))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.entryType == rhs.entryType)||((this.entryType!= null)&&this.entryType.equals(rhs.entryType))))&&((this.criteriaLfstCode == rhs.criteriaLfstCode)||((this.criteriaLfstCode!= null)&&this.criteriaLfstCode.equals(rhs.criteriaLfstCode))))&&((this.maxCharge == rhs.maxCharge)||((this.maxCharge!= null)&&this.maxCharge.equals(rhs.maxCharge))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.toAddDate == rhs.toAddDate)||((this.toAddDate!= null)&&this.toAddDate.equals(rhs.toAddDate))))&&((this.criteriaAttrCodeCrse == rhs.criteriaAttrCodeCrse)||((this.criteriaAttrCodeCrse!= null)&&this.criteriaAttrCodeCrse.equals(rhs.criteriaAttrCodeCrse))))&&((this.criteriaMinCharge == rhs.criteriaMinCharge)||((this.criteriaMinCharge!= null)&&this.criteriaMinCharge.equals(rhs.criteriaMinCharge))))&&((this.toCredHrs == rhs.toCredHrs)||((this.toCredHrs!= null)&&this.toCredHrs.equals(rhs.toCredHrs))))&&((this.setCopyIndEnMassInd == rhs.setCopyIndEnMassInd)||((this.setCopyIndEnMassInd!= null)&&this.setCopyIndEnMassInd.equals(rhs.setCopyIndEnMassInd))))&&((this.criteriaCrseWaivInd == rhs.criteriaCrseWaivInd)||((this.criteriaCrseWaivInd!= null)&&this.criteriaCrseWaivInd.equals(rhs.criteriaCrseWaivInd))))&&((this.assessByCourseInd == rhs.assessByCourseInd)||((this.assessByCourseInd!= null)&&this.assessByCourseInd.equals(rhs.assessByCourseInd))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.criteriaMaxCharge == rhs.criteriaMaxCharge)||((this.criteriaMaxCharge!= null)&&this.criteriaMaxCharge.equals(rhs.criteriaMaxCharge))))&&((this.criteriaCampCodeCrse == rhs.criteriaCampCodeCrse)||((this.criteriaCampCodeCrse!= null)&&this.criteriaCampCodeCrse.equals(rhs.criteriaCampCodeCrse))))&&((this.criteriaStypCodeCurric == rhs.criteriaStypCodeCurric)||((this.criteriaStypCodeCurric!= null)&&this.criteriaStypCodeCurric.equals(rhs.criteriaStypCodeCurric))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.stypCodeCurric == rhs.stypCodeCurric)||((this.stypCodeCurric!= null)&&this.stypCodeCurric.equals(rhs.stypCodeCurric))))&&((this.criteriaDegcCode == rhs.criteriaDegcCode)||((this.criteriaDegcCode!= null)&&this.criteriaDegcCode.equals(rhs.criteriaDegcCode))))&&((this.blockKeyEntryType == rhs.blockKeyEntryType)||((this.blockKeyEntryType!= null)&&this.blockKeyEntryType.equals(rhs.blockKeyEntryType))))&&((this.criteriaTermCodeAdmit == rhs.criteriaTermCodeAdmit)||((this.criteriaTermCodeAdmit!= null)&&this.criteriaTermCodeAdmit.equals(rhs.criteriaTermCodeAdmit))))&&((this.criteriaPrimSecCde == rhs.criteriaPrimSecCde)||((this.criteriaPrimSecCde!= null)&&this.criteriaPrimSecCde.equals(rhs.criteriaPrimSecCde))))&&((this.criteriaMajrCode == rhs.criteriaMajrCode)||((this.criteriaMajrCode!= null)&&this.criteriaMajrCode.equals(rhs.criteriaMajrCode))))&&((this.criteriaPerCredCharge == rhs.criteriaPerCredCharge)||((this.criteriaPerCredCharge!= null)&&this.criteriaPerCredCharge.equals(rhs.criteriaPerCredCharge))))&&((this.fromFlatHrs == rhs.fromFlatHrs)||((this.fromFlatHrs!= null)&&this.fromFlatHrs.equals(rhs.fromFlatHrs))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.rateCodeCurric == rhs.rateCodeCurric)||((this.rateCodeCurric!= null)&&this.rateCodeCurric.equals(rhs.rateCodeCurric))))&&((this.ruleType == rhs.ruleType)||((this.ruleType!= null)&&this.ruleType.equals(rhs.ruleType))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.fromStudHrs == rhs.fromStudHrs)||((this.fromStudHrs!= null)&&this.fromStudHrs.equals(rhs.fromStudHrs))))&&((this.crseWaivInd == rhs.crseWaivInd)||((this.crseWaivInd!= null)&&this.crseWaivInd.equals(rhs.crseWaivInd))))&&((this.criteriaEntryType == rhs.criteriaEntryType)||((this.criteriaEntryType!= null)&&this.criteriaEntryType.equals(rhs.criteriaEntryType))))&&((this.criteriaDetlCode == rhs.criteriaDetlCode)||((this.criteriaDetlCode!= null)&&this.criteriaDetlCode.equals(rhs.criteriaDetlCode))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.perCredCharge == rhs.perCredCharge)||((this.perCredCharge!= null)&&this.perCredCharge.equals(rhs.perCredCharge))))&&((this.criteriaLfstPrimSecCde == rhs.criteriaLfstPrimSecCde)||((this.criteriaLfstPrimSecCde!= null)&&this.criteriaLfstPrimSecCde.equals(rhs.criteriaLfstPrimSecCde))))&&((this.criteriaRateCodeCurric == rhs.criteriaRateCodeCurric)||((this.criteriaRateCodeCurric!= null)&&this.criteriaRateCodeCurric.equals(rhs.criteriaRateCodeCurric))))&&((this.criteriaCopyInd == rhs.criteriaCopyInd)||((this.criteriaCopyInd!= null)&&this.criteriaCopyInd.equals(rhs.criteriaCopyInd))))&&((this.criteriaStspResdCode == rhs.criteriaStspResdCode)||((this.criteriaStspResdCode!= null)&&this.criteriaStspResdCode.equals(rhs.criteriaStspResdCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.criteriaLevlCodeCrse == rhs.criteriaLevlCodeCrse)||((this.criteriaLevlCodeCrse!= null)&&this.criteriaLevlCodeCrse.equals(rhs.criteriaLevlCodeCrse))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.lfstPrimSecCde == rhs.lfstPrimSecCde)||((this.lfstPrimSecCde!= null)&&this.lfstPrimSecCde.equals(rhs.lfstPrimSecCde))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.fromAddDate == rhs.fromAddDate)||((this.fromAddDate!= null)&&this.fromAddDate.equals(rhs.fromAddDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.copyInd == rhs.copyInd)||((this.copyInd!= null)&&this.copyInd.equals(rhs.copyInd))))&&((this.crseOverloadStartHr == rhs.crseOverloadStartHr)||((this.crseOverloadStartHr!= null)&&this.crseOverloadStartHr.equals(rhs.crseOverloadStartHr))));
    }

}
