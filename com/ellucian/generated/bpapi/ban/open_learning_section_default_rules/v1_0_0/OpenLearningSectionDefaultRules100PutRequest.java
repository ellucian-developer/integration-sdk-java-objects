
package com.ellucian.generated.bpapi.ban.open_learning_section_default_rules.v1_0_0;

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
    "usageCutoffPctFrom",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.usageCutoffPctFrom",
    "criteria.campCode",
    "regEndDate",
    "criteria.campCodeDesc",
    "censusDateTwo",
    "criteria.censusDateTwo",
    "criteria.collCode",
    "criteria.deptCode",
    "criteria.rstsCode",
    "criteria.feeRefundPct",
    "criteria.refundPctComplete",
    "refundPctComplete",
    "criteria.regStartDate",
    "schdCode",
    "rstsCode",
    "campCode",
    "criteria.collCodeDesc",
    "criteria.schdCodeDesc",
    "regStartDate",
    "criteria.overrideInd",
    "overrideInd",
    "criteria.sorrfndActivityDate",
    "criteria.extensionRefundPct",
    "tuitionRefundPct",
    "censusDateOne",
    "criteria.censusDateOne",
    "keyblckTermCode",
    "insmCode",
    "criteria.tuitionRefundPct",
    "usageCutoffPctTo",
    "criteria.schdCode",
    "criteria.regEndDate",
    "criteria.sorrstsUserId",
    "criteria.sorrstsActivityDate",
    "keyblocTermCodeDef",
    "criteria.insmCodeDesc",
    "criteria.usageCutoffPctTo",
    "criteria.sorrfndUserId",
    "collCode",
    "extensionRefundPct",
    "deptCode",
    "feeRefundPct",
    "criteria.insmCode"
})
@Generated("jsonschema2pojo")
public class OpenLearningSectionDefaultRules100PutRequest {

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM")
    private Double usageCutoffPctFrom;
    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_USER_ID")
    private String criteriaUserId;
    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("criteria.usageCutoffPctFrom")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM")
    private Double criteriaUsageCutoffPctFrom;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_END_DATE")
    private Date regEndDate;
    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    private String criteriaCampCodeDesc;
    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_TWO")
    private Date censusDateTwo;
    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("criteria.censusDateTwo")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_TWO")
    private Date criteriaCensusDateTwo;
    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String criteriaRstsCode;
    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.feeRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_FEE_REFUND_PCT")
    private Double criteriaFeeRefundPct;
    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("criteria.refundPctComplete")
    @JsonPropertyDescription("Lineage reference object : SORRFND_REFUND_PCT_COMPLETE")
    private Double criteriaRefundPctComplete;
    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    @JsonPropertyDescription("Lineage reference object : SORRFND_REFUND_PCT_COMPLETE")
    private Double refundPctComplete;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regStartDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_START_DATE")
    private Date criteriaRegStartDate;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collCodeDesc")
    private String criteriaCollCodeDesc;
    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    private String criteriaSchdCodeDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_START_DATE")
    private Date regStartDate;
    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.overrideInd")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_OVERRIDE_IND")
    private String criteriaOverrideInd;
    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_OVERRIDE_IND")
    private String overrideInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrfndActivityDate")
    @JsonPropertyDescription("Lineage reference object : SORRFND_ACTIVITY_DATE")
    private Date criteriaSorrfndActivityDate;
    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.extensionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_EXTENSION_REFUND_PCT")
    private Double criteriaExtensionRefundPct;
    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_TUITION_REFUND_PCT")
    private Double tuitionRefundPct;
    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_ONE")
    private Date censusDateOne;
    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusDateOne")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_ONE")
    private Date criteriaCensusDateOne;
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
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.tuitionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_TUITION_REFUND_PCT")
    private Double criteriaTuitionRefundPct;
    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO")
    private Double usageCutoffPctTo;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String criteriaSchdCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_END_DATE")
    private Date criteriaRegEndDate;
    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrstsUserId")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USER_ID")
    private String criteriaSorrstsUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrstsActivityDate")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_ACTIVITY_DATE")
    private Date criteriaSorrstsActivityDate;
    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm")
    private String keyblocTermCodeDef;
    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.insmCodeDesc")
    private String criteriaInsmCodeDesc;
    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("criteria.usageCutoffPctTo")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO")
    private Double criteriaUsageCutoffPctTo;
    /**
     * Lineage reference object : SORRFND_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrfndUserId")
    @JsonPropertyDescription("Lineage reference object : SORRFND_USER_ID")
    private String criteriaSorrfndUserId;
    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_EXTENSION_REFUND_PCT")
    private Double extensionRefundPct;
    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_FEE_REFUND_PCT")
    private Double feeRefundPct;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("criteria.insmCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String criteriaInsmCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    public Double getUsageCutoffPctFrom() {
        return usageCutoffPctFrom;
    }

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    public void setUsageCutoffPctFrom(Double usageCutoffPctFrom) {
        this.usageCutoffPctFrom = usageCutoffPctFrom;
    }

    public OpenLearningSectionDefaultRules100PutRequest withUsageCutoffPctFrom(Double usageCutoffPctFrom) {
        this.usageCutoffPctFrom = usageCutoffPctFrom;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("criteria.usageCutoffPctFrom")
    public Double getCriteriaUsageCutoffPctFrom() {
        return criteriaUsageCutoffPctFrom;
    }

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("criteria.usageCutoffPctFrom")
    public void setCriteriaUsageCutoffPctFrom(Double criteriaUsageCutoffPctFrom) {
        this.criteriaUsageCutoffPctFrom = criteriaUsageCutoffPctFrom;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaUsageCutoffPctFrom(Double criteriaUsageCutoffPctFrom) {
        this.criteriaUsageCutoffPctFrom = criteriaUsageCutoffPctFrom;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    public Date getRegEndDate() {
        return regEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    public void setRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
        return this;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    public String getCriteriaCampCodeDesc() {
        return criteriaCampCodeDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campCodeDesc")
    public void setCriteriaCampCodeDesc(String criteriaCampCodeDesc) {
        this.criteriaCampCodeDesc = criteriaCampCodeDesc;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCampCodeDesc(String criteriaCampCodeDesc) {
        this.criteriaCampCodeDesc = criteriaCampCodeDesc;
        return this;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    public Date getCensusDateTwo() {
        return censusDateTwo;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    public void setCensusDateTwo(Date censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCensusDateTwo(Date censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
        return this;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("criteria.censusDateTwo")
    public Date getCriteriaCensusDateTwo() {
        return criteriaCensusDateTwo;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("criteria.censusDateTwo")
    public void setCriteriaCensusDateTwo(Date criteriaCensusDateTwo) {
        this.criteriaCensusDateTwo = criteriaCensusDateTwo;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCensusDateTwo(Date criteriaCensusDateTwo) {
        this.criteriaCensusDateTwo = criteriaCensusDateTwo;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public String getCriteriaRstsCode() {
        return criteriaRstsCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public void setCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
        return this;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.feeRefundPct")
    public Double getCriteriaFeeRefundPct() {
        return criteriaFeeRefundPct;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.feeRefundPct")
    public void setCriteriaFeeRefundPct(Double criteriaFeeRefundPct) {
        this.criteriaFeeRefundPct = criteriaFeeRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaFeeRefundPct(Double criteriaFeeRefundPct) {
        this.criteriaFeeRefundPct = criteriaFeeRefundPct;
        return this;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("criteria.refundPctComplete")
    public Double getCriteriaRefundPctComplete() {
        return criteriaRefundPctComplete;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("criteria.refundPctComplete")
    public void setCriteriaRefundPctComplete(Double criteriaRefundPctComplete) {
        this.criteriaRefundPctComplete = criteriaRefundPctComplete;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaRefundPctComplete(Double criteriaRefundPctComplete) {
        this.criteriaRefundPctComplete = criteriaRefundPctComplete;
        return this;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    public Double getRefundPctComplete() {
        return refundPctComplete;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    public void setRefundPctComplete(Double refundPctComplete) {
        this.refundPctComplete = refundPctComplete;
    }

    public OpenLearningSectionDefaultRules100PutRequest withRefundPctComplete(Double refundPctComplete) {
        this.refundPctComplete = refundPctComplete;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regStartDate")
    public Date getCriteriaRegStartDate() {
        return criteriaRegStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regStartDate")
    public void setCriteriaRegStartDate(Date criteriaRegStartDate) {
        this.criteriaRegStartDate = criteriaRegStartDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaRegStartDate(Date criteriaRegStartDate) {
        this.criteriaRegStartDate = criteriaRegStartDate;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collCodeDesc")
    public String getCriteriaCollCodeDesc() {
        return criteriaCollCodeDesc;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collCodeDesc")
    public void setCriteriaCollCodeDesc(String criteriaCollCodeDesc) {
        this.criteriaCollCodeDesc = criteriaCollCodeDesc;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCollCodeDesc(String criteriaCollCodeDesc) {
        this.criteriaCollCodeDesc = criteriaCollCodeDesc;
        return this;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    public String getCriteriaSchdCodeDesc() {
        return criteriaSchdCodeDesc;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.schdCodeDesc")
    public void setCriteriaSchdCodeDesc(String criteriaSchdCodeDesc) {
        this.criteriaSchdCodeDesc = criteriaSchdCodeDesc;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSchdCodeDesc(String criteriaSchdCodeDesc) {
        this.criteriaSchdCodeDesc = criteriaSchdCodeDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    public Date getRegStartDate() {
        return regStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    public void setRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.overrideInd")
    public String getCriteriaOverrideInd() {
        return criteriaOverrideInd;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.overrideInd")
    public void setCriteriaOverrideInd(String criteriaOverrideInd) {
        this.criteriaOverrideInd = criteriaOverrideInd;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaOverrideInd(String criteriaOverrideInd) {
        this.criteriaOverrideInd = criteriaOverrideInd;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public OpenLearningSectionDefaultRules100PutRequest withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrfndActivityDate")
    public Date getCriteriaSorrfndActivityDate() {
        return criteriaSorrfndActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrfndActivityDate")
    public void setCriteriaSorrfndActivityDate(Date criteriaSorrfndActivityDate) {
        this.criteriaSorrfndActivityDate = criteriaSorrfndActivityDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSorrfndActivityDate(Date criteriaSorrfndActivityDate) {
        this.criteriaSorrfndActivityDate = criteriaSorrfndActivityDate;
        return this;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.extensionRefundPct")
    public Double getCriteriaExtensionRefundPct() {
        return criteriaExtensionRefundPct;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.extensionRefundPct")
    public void setCriteriaExtensionRefundPct(Double criteriaExtensionRefundPct) {
        this.criteriaExtensionRefundPct = criteriaExtensionRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaExtensionRefundPct(Double criteriaExtensionRefundPct) {
        this.criteriaExtensionRefundPct = criteriaExtensionRefundPct;
        return this;
    }

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    public Double getTuitionRefundPct() {
        return tuitionRefundPct;
    }

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    public void setTuitionRefundPct(Double tuitionRefundPct) {
        this.tuitionRefundPct = tuitionRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withTuitionRefundPct(Double tuitionRefundPct) {
        this.tuitionRefundPct = tuitionRefundPct;
        return this;
    }

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    public Date getCensusDateOne() {
        return censusDateOne;
    }

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    public void setCensusDateOne(Date censusDateOne) {
        this.censusDateOne = censusDateOne;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCensusDateOne(Date censusDateOne) {
        this.censusDateOne = censusDateOne;
        return this;
    }

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusDateOne")
    public Date getCriteriaCensusDateOne() {
        return criteriaCensusDateOne;
    }

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusDateOne")
    public void setCriteriaCensusDateOne(Date criteriaCensusDateOne) {
        this.criteriaCensusDateOne = criteriaCensusDateOne;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaCensusDateOne(Date criteriaCensusDateOne) {
        this.criteriaCensusDateOne = criteriaCensusDateOne;
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

    public OpenLearningSectionDefaultRules100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.tuitionRefundPct")
    public Double getCriteriaTuitionRefundPct() {
        return criteriaTuitionRefundPct;
    }

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("criteria.tuitionRefundPct")
    public void setCriteriaTuitionRefundPct(Double criteriaTuitionRefundPct) {
        this.criteriaTuitionRefundPct = criteriaTuitionRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaTuitionRefundPct(Double criteriaTuitionRefundPct) {
        this.criteriaTuitionRefundPct = criteriaTuitionRefundPct;
        return this;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    public Double getUsageCutoffPctTo() {
        return usageCutoffPctTo;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    public void setUsageCutoffPctTo(Double usageCutoffPctTo) {
        this.usageCutoffPctTo = usageCutoffPctTo;
    }

    public OpenLearningSectionDefaultRules100PutRequest withUsageCutoffPctTo(Double usageCutoffPctTo) {
        this.usageCutoffPctTo = usageCutoffPctTo;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    public String getCriteriaSchdCode() {
        return criteriaSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.schdCode")
    public void setCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regEndDate")
    public Date getCriteriaRegEndDate() {
        return criteriaRegEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.regEndDate")
    public void setCriteriaRegEndDate(Date criteriaRegEndDate) {
        this.criteriaRegEndDate = criteriaRegEndDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaRegEndDate(Date criteriaRegEndDate) {
        this.criteriaRegEndDate = criteriaRegEndDate;
        return this;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrstsUserId")
    public String getCriteriaSorrstsUserId() {
        return criteriaSorrstsUserId;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrstsUserId")
    public void setCriteriaSorrstsUserId(String criteriaSorrstsUserId) {
        this.criteriaSorrstsUserId = criteriaSorrstsUserId;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSorrstsUserId(String criteriaSorrstsUserId) {
        this.criteriaSorrstsUserId = criteriaSorrstsUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrstsActivityDate")
    public Date getCriteriaSorrstsActivityDate() {
        return criteriaSorrstsActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.sorrstsActivityDate")
    public void setCriteriaSorrstsActivityDate(Date criteriaSorrstsActivityDate) {
        this.criteriaSorrstsActivityDate = criteriaSorrstsActivityDate;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSorrstsActivityDate(Date criteriaSorrstsActivityDate) {
        this.criteriaSorrstsActivityDate = criteriaSorrstsActivityDate;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    public String getKeyblocTermCodeDef() {
        return keyblocTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    public void setKeyblocTermCodeDef(String keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
    }

    public OpenLearningSectionDefaultRules100PutRequest withKeyblocTermCodeDef(String keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
        return this;
    }

    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.insmCodeDesc")
    public String getCriteriaInsmCodeDesc() {
        return criteriaInsmCodeDesc;
    }

    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.insmCodeDesc")
    public void setCriteriaInsmCodeDesc(String criteriaInsmCodeDesc) {
        this.criteriaInsmCodeDesc = criteriaInsmCodeDesc;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaInsmCodeDesc(String criteriaInsmCodeDesc) {
        this.criteriaInsmCodeDesc = criteriaInsmCodeDesc;
        return this;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("criteria.usageCutoffPctTo")
    public Double getCriteriaUsageCutoffPctTo() {
        return criteriaUsageCutoffPctTo;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("criteria.usageCutoffPctTo")
    public void setCriteriaUsageCutoffPctTo(Double criteriaUsageCutoffPctTo) {
        this.criteriaUsageCutoffPctTo = criteriaUsageCutoffPctTo;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaUsageCutoffPctTo(Double criteriaUsageCutoffPctTo) {
        this.criteriaUsageCutoffPctTo = criteriaUsageCutoffPctTo;
        return this;
    }

    /**
     * Lineage reference object : SORRFND_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrfndUserId")
    public String getCriteriaSorrfndUserId() {
        return criteriaSorrfndUserId;
    }

    /**
     * Lineage reference object : SORRFND_USER_ID
     * 
     */
    @JsonProperty("criteria.sorrfndUserId")
    public void setCriteriaSorrfndUserId(String criteriaSorrfndUserId) {
        this.criteriaSorrfndUserId = criteriaSorrfndUserId;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaSorrfndUserId(String criteriaSorrfndUserId) {
        this.criteriaSorrfndUserId = criteriaSorrfndUserId;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    public Double getExtensionRefundPct() {
        return extensionRefundPct;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    public void setExtensionRefundPct(Double extensionRefundPct) {
        this.extensionRefundPct = extensionRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withExtensionRefundPct(Double extensionRefundPct) {
        this.extensionRefundPct = extensionRefundPct;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    public Double getFeeRefundPct() {
        return feeRefundPct;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    public void setFeeRefundPct(Double feeRefundPct) {
        this.feeRefundPct = feeRefundPct;
    }

    public OpenLearningSectionDefaultRules100PutRequest withFeeRefundPct(Double feeRefundPct) {
        this.feeRefundPct = feeRefundPct;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("criteria.insmCode")
    public String getCriteriaInsmCode() {
        return criteriaInsmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("criteria.insmCode")
    public void setCriteriaInsmCode(String criteriaInsmCode) {
        this.criteriaInsmCode = criteriaInsmCode;
    }

    public OpenLearningSectionDefaultRules100PutRequest withCriteriaInsmCode(String criteriaInsmCode) {
        this.criteriaInsmCode = criteriaInsmCode;
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

    public OpenLearningSectionDefaultRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("usageCutoffPctFrom");
        sb.append('=');
        sb.append(((this.usageCutoffPctFrom == null)?"<null>":this.usageCutoffPctFrom));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaUsageCutoffPctFrom");
        sb.append('=');
        sb.append(((this.criteriaUsageCutoffPctFrom == null)?"<null>":this.criteriaUsageCutoffPctFrom));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("regEndDate");
        sb.append('=');
        sb.append(((this.regEndDate == null)?"<null>":this.regEndDate));
        sb.append(',');
        sb.append("criteriaCampCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaCampCodeDesc == null)?"<null>":this.criteriaCampCodeDesc));
        sb.append(',');
        sb.append("censusDateTwo");
        sb.append('=');
        sb.append(((this.censusDateTwo == null)?"<null>":this.censusDateTwo));
        sb.append(',');
        sb.append("criteriaCensusDateTwo");
        sb.append('=');
        sb.append(((this.criteriaCensusDateTwo == null)?"<null>":this.criteriaCensusDateTwo));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("criteriaRstsCode");
        sb.append('=');
        sb.append(((this.criteriaRstsCode == null)?"<null>":this.criteriaRstsCode));
        sb.append(',');
        sb.append("criteriaFeeRefundPct");
        sb.append('=');
        sb.append(((this.criteriaFeeRefundPct == null)?"<null>":this.criteriaFeeRefundPct));
        sb.append(',');
        sb.append("criteriaRefundPctComplete");
        sb.append('=');
        sb.append(((this.criteriaRefundPctComplete == null)?"<null>":this.criteriaRefundPctComplete));
        sb.append(',');
        sb.append("refundPctComplete");
        sb.append('=');
        sb.append(((this.refundPctComplete == null)?"<null>":this.refundPctComplete));
        sb.append(',');
        sb.append("criteriaRegStartDate");
        sb.append('=');
        sb.append(((this.criteriaRegStartDate == null)?"<null>":this.criteriaRegStartDate));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("criteriaCollCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaCollCodeDesc == null)?"<null>":this.criteriaCollCodeDesc));
        sb.append(',');
        sb.append("criteriaSchdCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaSchdCodeDesc == null)?"<null>":this.criteriaSchdCodeDesc));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("criteriaOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaOverrideInd == null)?"<null>":this.criteriaOverrideInd));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
        sb.append(',');
        sb.append("criteriaSorrfndActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSorrfndActivityDate == null)?"<null>":this.criteriaSorrfndActivityDate));
        sb.append(',');
        sb.append("criteriaExtensionRefundPct");
        sb.append('=');
        sb.append(((this.criteriaExtensionRefundPct == null)?"<null>":this.criteriaExtensionRefundPct));
        sb.append(',');
        sb.append("tuitionRefundPct");
        sb.append('=');
        sb.append(((this.tuitionRefundPct == null)?"<null>":this.tuitionRefundPct));
        sb.append(',');
        sb.append("censusDateOne");
        sb.append('=');
        sb.append(((this.censusDateOne == null)?"<null>":this.censusDateOne));
        sb.append(',');
        sb.append("criteriaCensusDateOne");
        sb.append('=');
        sb.append(((this.criteriaCensusDateOne == null)?"<null>":this.criteriaCensusDateOne));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("criteriaTuitionRefundPct");
        sb.append('=');
        sb.append(((this.criteriaTuitionRefundPct == null)?"<null>":this.criteriaTuitionRefundPct));
        sb.append(',');
        sb.append("usageCutoffPctTo");
        sb.append('=');
        sb.append(((this.usageCutoffPctTo == null)?"<null>":this.usageCutoffPctTo));
        sb.append(',');
        sb.append("criteriaSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSchdCode == null)?"<null>":this.criteriaSchdCode));
        sb.append(',');
        sb.append("criteriaRegEndDate");
        sb.append('=');
        sb.append(((this.criteriaRegEndDate == null)?"<null>":this.criteriaRegEndDate));
        sb.append(',');
        sb.append("criteriaSorrstsUserId");
        sb.append('=');
        sb.append(((this.criteriaSorrstsUserId == null)?"<null>":this.criteriaSorrstsUserId));
        sb.append(',');
        sb.append("criteriaSorrstsActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSorrstsActivityDate == null)?"<null>":this.criteriaSorrstsActivityDate));
        sb.append(',');
        sb.append("keyblocTermCodeDef");
        sb.append('=');
        sb.append(((this.keyblocTermCodeDef == null)?"<null>":this.keyblocTermCodeDef));
        sb.append(',');
        sb.append("criteriaInsmCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaInsmCodeDesc == null)?"<null>":this.criteriaInsmCodeDesc));
        sb.append(',');
        sb.append("criteriaUsageCutoffPctTo");
        sb.append('=');
        sb.append(((this.criteriaUsageCutoffPctTo == null)?"<null>":this.criteriaUsageCutoffPctTo));
        sb.append(',');
        sb.append("criteriaSorrfndUserId");
        sb.append('=');
        sb.append(((this.criteriaSorrfndUserId == null)?"<null>":this.criteriaSorrfndUserId));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("extensionRefundPct");
        sb.append('=');
        sb.append(((this.extensionRefundPct == null)?"<null>":this.extensionRefundPct));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("feeRefundPct");
        sb.append('=');
        sb.append(((this.feeRefundPct == null)?"<null>":this.feeRefundPct));
        sb.append(',');
        sb.append("criteriaInsmCode");
        sb.append('=');
        sb.append(((this.criteriaInsmCode == null)?"<null>":this.criteriaInsmCode));
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
        result = ((result* 31)+((this.criteriaUsageCutoffPctFrom == null)? 0 :this.criteriaUsageCutoffPctFrom.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctFrom == null)? 0 :this.usageCutoffPctFrom.hashCode()));
        result = ((result* 31)+((this.criteriaOverrideInd == null)? 0 :this.criteriaOverrideInd.hashCode()));
        result = ((result* 31)+((this.regEndDate == null)? 0 :this.regEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaSorrstsActivityDate == null)? 0 :this.criteriaSorrstsActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaRegEndDate == null)? 0 :this.criteriaRegEndDate.hashCode()));
        result = ((result* 31)+((this.censusDateTwo == null)? 0 :this.censusDateTwo.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCode == null)? 0 :this.criteriaSchdCode.hashCode()));
        result = ((result* 31)+((this.refundPctComplete == null)? 0 :this.refundPctComplete.hashCode()));
        result = ((result* 31)+((this.criteriaSorrfndUserId == null)? 0 :this.criteriaSorrfndUserId.hashCode()));
        result = ((result* 31)+((this.criteriaRefundPctComplete == null)? 0 :this.criteriaRefundPctComplete.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCodeDesc == null)? 0 :this.criteriaCollCodeDesc.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.criteriaSorrstsUserId == null)? 0 :this.criteriaSorrstsUserId.hashCode()));
        result = ((result* 31)+((this.criteriaCensusDateTwo == null)? 0 :this.criteriaCensusDateTwo.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCodeDesc == null)? 0 :this.criteriaSchdCodeDesc.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.tuitionRefundPct == null)? 0 :this.tuitionRefundPct.hashCode()));
        result = ((result* 31)+((this.criteriaUsageCutoffPctTo == null)? 0 :this.criteriaUsageCutoffPctTo.hashCode()));
        result = ((result* 31)+((this.censusDateOne == null)? 0 :this.censusDateOne.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaFeeRefundPct == null)? 0 :this.criteriaFeeRefundPct.hashCode()));
        result = ((result* 31)+((this.criteriaRegStartDate == null)? 0 :this.criteriaRegStartDate.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCodeDesc == null)? 0 :this.criteriaCampCodeDesc.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctTo == null)? 0 :this.usageCutoffPctTo.hashCode()));
        result = ((result* 31)+((this.criteriaRstsCode == null)? 0 :this.criteriaRstsCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaCensusDateOne == null)? 0 :this.criteriaCensusDateOne.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeDef == null)? 0 :this.keyblocTermCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaSorrfndActivityDate == null)? 0 :this.criteriaSorrfndActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaTuitionRefundPct == null)? 0 :this.criteriaTuitionRefundPct.hashCode()));
        result = ((result* 31)+((this.criteriaInsmCodeDesc == null)? 0 :this.criteriaInsmCodeDesc.hashCode()));
        result = ((result* 31)+((this.criteriaInsmCode == null)? 0 :this.criteriaInsmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaExtensionRefundPct == null)? 0 :this.criteriaExtensionRefundPct.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.extensionRefundPct == null)? 0 :this.extensionRefundPct.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.feeRefundPct == null)? 0 :this.feeRefundPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenLearningSectionDefaultRules100PutRequest) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100PutRequest rhs = ((OpenLearningSectionDefaultRules100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaUsageCutoffPctFrom == rhs.criteriaUsageCutoffPctFrom)||((this.criteriaUsageCutoffPctFrom!= null)&&this.criteriaUsageCutoffPctFrom.equals(rhs.criteriaUsageCutoffPctFrom)))&&((this.usageCutoffPctFrom == rhs.usageCutoffPctFrom)||((this.usageCutoffPctFrom!= null)&&this.usageCutoffPctFrom.equals(rhs.usageCutoffPctFrom))))&&((this.criteriaOverrideInd == rhs.criteriaOverrideInd)||((this.criteriaOverrideInd!= null)&&this.criteriaOverrideInd.equals(rhs.criteriaOverrideInd))))&&((this.regEndDate == rhs.regEndDate)||((this.regEndDate!= null)&&this.regEndDate.equals(rhs.regEndDate))))&&((this.criteriaSorrstsActivityDate == rhs.criteriaSorrstsActivityDate)||((this.criteriaSorrstsActivityDate!= null)&&this.criteriaSorrstsActivityDate.equals(rhs.criteriaSorrstsActivityDate))))&&((this.criteriaRegEndDate == rhs.criteriaRegEndDate)||((this.criteriaRegEndDate!= null)&&this.criteriaRegEndDate.equals(rhs.criteriaRegEndDate))))&&((this.censusDateTwo == rhs.censusDateTwo)||((this.censusDateTwo!= null)&&this.censusDateTwo.equals(rhs.censusDateTwo))))&&((this.criteriaSchdCode == rhs.criteriaSchdCode)||((this.criteriaSchdCode!= null)&&this.criteriaSchdCode.equals(rhs.criteriaSchdCode))))&&((this.refundPctComplete == rhs.refundPctComplete)||((this.refundPctComplete!= null)&&this.refundPctComplete.equals(rhs.refundPctComplete))))&&((this.criteriaSorrfndUserId == rhs.criteriaSorrfndUserId)||((this.criteriaSorrfndUserId!= null)&&this.criteriaSorrfndUserId.equals(rhs.criteriaSorrfndUserId))))&&((this.criteriaRefundPctComplete == rhs.criteriaRefundPctComplete)||((this.criteriaRefundPctComplete!= null)&&this.criteriaRefundPctComplete.equals(rhs.criteriaRefundPctComplete))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.criteriaCollCodeDesc == rhs.criteriaCollCodeDesc)||((this.criteriaCollCodeDesc!= null)&&this.criteriaCollCodeDesc.equals(rhs.criteriaCollCodeDesc))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.criteriaSorrstsUserId == rhs.criteriaSorrstsUserId)||((this.criteriaSorrstsUserId!= null)&&this.criteriaSorrstsUserId.equals(rhs.criteriaSorrstsUserId))))&&((this.criteriaCensusDateTwo == rhs.criteriaCensusDateTwo)||((this.criteriaCensusDateTwo!= null)&&this.criteriaCensusDateTwo.equals(rhs.criteriaCensusDateTwo))))&&((this.criteriaSchdCodeDesc == rhs.criteriaSchdCodeDesc)||((this.criteriaSchdCodeDesc!= null)&&this.criteriaSchdCodeDesc.equals(rhs.criteriaSchdCodeDesc))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.tuitionRefundPct == rhs.tuitionRefundPct)||((this.tuitionRefundPct!= null)&&this.tuitionRefundPct.equals(rhs.tuitionRefundPct))))&&((this.criteriaUsageCutoffPctTo == rhs.criteriaUsageCutoffPctTo)||((this.criteriaUsageCutoffPctTo!= null)&&this.criteriaUsageCutoffPctTo.equals(rhs.criteriaUsageCutoffPctTo))))&&((this.censusDateOne == rhs.censusDateOne)||((this.censusDateOne!= null)&&this.censusDateOne.equals(rhs.censusDateOne))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaFeeRefundPct == rhs.criteriaFeeRefundPct)||((this.criteriaFeeRefundPct!= null)&&this.criteriaFeeRefundPct.equals(rhs.criteriaFeeRefundPct))))&&((this.criteriaRegStartDate == rhs.criteriaRegStartDate)||((this.criteriaRegStartDate!= null)&&this.criteriaRegStartDate.equals(rhs.criteriaRegStartDate))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.criteriaCampCodeDesc == rhs.criteriaCampCodeDesc)||((this.criteriaCampCodeDesc!= null)&&this.criteriaCampCodeDesc.equals(rhs.criteriaCampCodeDesc))))&&((this.usageCutoffPctTo == rhs.usageCutoffPctTo)||((this.usageCutoffPctTo!= null)&&this.usageCutoffPctTo.equals(rhs.usageCutoffPctTo))))&&((this.criteriaRstsCode == rhs.criteriaRstsCode)||((this.criteriaRstsCode!= null)&&this.criteriaRstsCode.equals(rhs.criteriaRstsCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaCensusDateOne == rhs.criteriaCensusDateOne)||((this.criteriaCensusDateOne!= null)&&this.criteriaCensusDateOne.equals(rhs.criteriaCensusDateOne))))&&((this.keyblocTermCodeDef == rhs.keyblocTermCodeDef)||((this.keyblocTermCodeDef!= null)&&this.keyblocTermCodeDef.equals(rhs.keyblocTermCodeDef))))&&((this.criteriaSorrfndActivityDate == rhs.criteriaSorrfndActivityDate)||((this.criteriaSorrfndActivityDate!= null)&&this.criteriaSorrfndActivityDate.equals(rhs.criteriaSorrfndActivityDate))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaTuitionRefundPct == rhs.criteriaTuitionRefundPct)||((this.criteriaTuitionRefundPct!= null)&&this.criteriaTuitionRefundPct.equals(rhs.criteriaTuitionRefundPct))))&&((this.criteriaInsmCodeDesc == rhs.criteriaInsmCodeDesc)||((this.criteriaInsmCodeDesc!= null)&&this.criteriaInsmCodeDesc.equals(rhs.criteriaInsmCodeDesc))))&&((this.criteriaInsmCode == rhs.criteriaInsmCode)||((this.criteriaInsmCode!= null)&&this.criteriaInsmCode.equals(rhs.criteriaInsmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaExtensionRefundPct == rhs.criteriaExtensionRefundPct)||((this.criteriaExtensionRefundPct!= null)&&this.criteriaExtensionRefundPct.equals(rhs.criteriaExtensionRefundPct))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.extensionRefundPct == rhs.extensionRefundPct)||((this.extensionRefundPct!= null)&&this.extensionRefundPct.equals(rhs.extensionRefundPct))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.feeRefundPct == rhs.feeRefundPct)||((this.feeRefundPct!= null)&&this.feeRefundPct.equals(rhs.feeRefundPct))));
    }

}
