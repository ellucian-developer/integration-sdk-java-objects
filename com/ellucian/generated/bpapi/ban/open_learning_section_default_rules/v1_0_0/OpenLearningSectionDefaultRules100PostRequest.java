
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
    "tuitionRefundPct",
    "censusDateOne",
    "usageCutoffPctFrom",
    "regEndDate",
    "keyblckTermCode",
    "censusDateTwo",
    "insmCode",
    "usageCutoffPctTo",
    "refundPctComplete",
    "schdCode",
    "sorrfndOverrideInd",
    "keyblocTermCodeDef",
    "rstsCode",
    "campCode",
    "effByStuStatInd",
    "collCode",
    "extensionRefundPct",
    "deptCode",
    "regStartDate",
    "feeRefundPct",
    "overrideInd"
})
@Generated("jsonschema2pojo")
public class OpenLearningSectionDefaultRules100PostRequest {

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
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM")
    private Double usageCutoffPctFrom;
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
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
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
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO")
    private Double usageCutoffPctTo;
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
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("sorrfndOverrideInd")
    @JsonPropertyDescription("Lineage reference object : SORRFND_OVERRIDE_IND")
    private String sorrfndOverrideInd;
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
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND")
    private String effByStuStatInd;
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
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_FEE_REFUND_PCT")
    private Double feeRefundPct;
    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_OVERRIDE_IND")
    private String overrideInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public OpenLearningSectionDefaultRules100PostRequest withTuitionRefundPct(Double tuitionRefundPct) {
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

    public OpenLearningSectionDefaultRules100PostRequest withCensusDateOne(Date censusDateOne) {
        this.censusDateOne = censusDateOne;
        return this;
    }

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

    public OpenLearningSectionDefaultRules100PostRequest withUsageCutoffPctFrom(Double usageCutoffPctFrom) {
        this.usageCutoffPctFrom = usageCutoffPctFrom;
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

    public OpenLearningSectionDefaultRules100PostRequest withRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
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

    public OpenLearningSectionDefaultRules100PostRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public OpenLearningSectionDefaultRules100PostRequest withCensusDateTwo(Date censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
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

    public OpenLearningSectionDefaultRules100PostRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
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

    public OpenLearningSectionDefaultRules100PostRequest withUsageCutoffPctTo(Double usageCutoffPctTo) {
        this.usageCutoffPctTo = usageCutoffPctTo;
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

    public OpenLearningSectionDefaultRules100PostRequest withRefundPctComplete(Double refundPctComplete) {
        this.refundPctComplete = refundPctComplete;
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

    public OpenLearningSectionDefaultRules100PostRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("sorrfndOverrideInd")
    public String getSorrfndOverrideInd() {
        return sorrfndOverrideInd;
    }

    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("sorrfndOverrideInd")
    public void setSorrfndOverrideInd(String sorrfndOverrideInd) {
        this.sorrfndOverrideInd = sorrfndOverrideInd;
    }

    public OpenLearningSectionDefaultRules100PostRequest withSorrfndOverrideInd(String sorrfndOverrideInd) {
        this.sorrfndOverrideInd = sorrfndOverrideInd;
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

    public OpenLearningSectionDefaultRules100PostRequest withKeyblocTermCodeDef(String keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
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

    public OpenLearningSectionDefaultRules100PostRequest withRstsCode(String rstsCode) {
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

    public OpenLearningSectionDefaultRules100PostRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    public String getEffByStuStatInd() {
        return effByStuStatInd;
    }

    /**
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    public void setEffByStuStatInd(String effByStuStatInd) {
        this.effByStuStatInd = effByStuStatInd;
    }

    public OpenLearningSectionDefaultRules100PostRequest withEffByStuStatInd(String effByStuStatInd) {
        this.effByStuStatInd = effByStuStatInd;
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

    public OpenLearningSectionDefaultRules100PostRequest withCollCode(String collCode) {
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

    public OpenLearningSectionDefaultRules100PostRequest withExtensionRefundPct(Double extensionRefundPct) {
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

    public OpenLearningSectionDefaultRules100PostRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public OpenLearningSectionDefaultRules100PostRequest withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
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

    public OpenLearningSectionDefaultRules100PostRequest withFeeRefundPct(Double feeRefundPct) {
        this.feeRefundPct = feeRefundPct;
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

    public OpenLearningSectionDefaultRules100PostRequest withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
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

    public OpenLearningSectionDefaultRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tuitionRefundPct");
        sb.append('=');
        sb.append(((this.tuitionRefundPct == null)?"<null>":this.tuitionRefundPct));
        sb.append(',');
        sb.append("censusDateOne");
        sb.append('=');
        sb.append(((this.censusDateOne == null)?"<null>":this.censusDateOne));
        sb.append(',');
        sb.append("usageCutoffPctFrom");
        sb.append('=');
        sb.append(((this.usageCutoffPctFrom == null)?"<null>":this.usageCutoffPctFrom));
        sb.append(',');
        sb.append("regEndDate");
        sb.append('=');
        sb.append(((this.regEndDate == null)?"<null>":this.regEndDate));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("censusDateTwo");
        sb.append('=');
        sb.append(((this.censusDateTwo == null)?"<null>":this.censusDateTwo));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("usageCutoffPctTo");
        sb.append('=');
        sb.append(((this.usageCutoffPctTo == null)?"<null>":this.usageCutoffPctTo));
        sb.append(',');
        sb.append("refundPctComplete");
        sb.append('=');
        sb.append(((this.refundPctComplete == null)?"<null>":this.refundPctComplete));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sorrfndOverrideInd");
        sb.append('=');
        sb.append(((this.sorrfndOverrideInd == null)?"<null>":this.sorrfndOverrideInd));
        sb.append(',');
        sb.append("keyblocTermCodeDef");
        sb.append('=');
        sb.append(((this.keyblocTermCodeDef == null)?"<null>":this.keyblocTermCodeDef));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("effByStuStatInd");
        sb.append('=');
        sb.append(((this.effByStuStatInd == null)?"<null>":this.effByStuStatInd));
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
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("feeRefundPct");
        sb.append('=');
        sb.append(((this.feeRefundPct == null)?"<null>":this.feeRefundPct));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
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
        result = ((result* 31)+((this.tuitionRefundPct == null)? 0 :this.tuitionRefundPct.hashCode()));
        result = ((result* 31)+((this.censusDateOne == null)? 0 :this.censusDateOne.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctFrom == null)? 0 :this.usageCutoffPctFrom.hashCode()));
        result = ((result* 31)+((this.regEndDate == null)? 0 :this.regEndDate.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.censusDateTwo == null)? 0 :this.censusDateTwo.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctTo == null)? 0 :this.usageCutoffPctTo.hashCode()));
        result = ((result* 31)+((this.refundPctComplete == null)? 0 :this.refundPctComplete.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sorrfndOverrideInd == null)? 0 :this.sorrfndOverrideInd.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeDef == null)? 0 :this.keyblocTermCodeDef.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.effByStuStatInd == null)? 0 :this.effByStuStatInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.extensionRefundPct == null)? 0 :this.extensionRefundPct.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.feeRefundPct == null)? 0 :this.feeRefundPct.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenLearningSectionDefaultRules100PostRequest) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100PostRequest rhs = ((OpenLearningSectionDefaultRules100PostRequest) other);
        return (((((((((((((((((((((((this.tuitionRefundPct == rhs.tuitionRefundPct)||((this.tuitionRefundPct!= null)&&this.tuitionRefundPct.equals(rhs.tuitionRefundPct)))&&((this.censusDateOne == rhs.censusDateOne)||((this.censusDateOne!= null)&&this.censusDateOne.equals(rhs.censusDateOne))))&&((this.usageCutoffPctFrom == rhs.usageCutoffPctFrom)||((this.usageCutoffPctFrom!= null)&&this.usageCutoffPctFrom.equals(rhs.usageCutoffPctFrom))))&&((this.regEndDate == rhs.regEndDate)||((this.regEndDate!= null)&&this.regEndDate.equals(rhs.regEndDate))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.censusDateTwo == rhs.censusDateTwo)||((this.censusDateTwo!= null)&&this.censusDateTwo.equals(rhs.censusDateTwo))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.usageCutoffPctTo == rhs.usageCutoffPctTo)||((this.usageCutoffPctTo!= null)&&this.usageCutoffPctTo.equals(rhs.usageCutoffPctTo))))&&((this.refundPctComplete == rhs.refundPctComplete)||((this.refundPctComplete!= null)&&this.refundPctComplete.equals(rhs.refundPctComplete))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sorrfndOverrideInd == rhs.sorrfndOverrideInd)||((this.sorrfndOverrideInd!= null)&&this.sorrfndOverrideInd.equals(rhs.sorrfndOverrideInd))))&&((this.keyblocTermCodeDef == rhs.keyblocTermCodeDef)||((this.keyblocTermCodeDef!= null)&&this.keyblocTermCodeDef.equals(rhs.keyblocTermCodeDef))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.effByStuStatInd == rhs.effByStuStatInd)||((this.effByStuStatInd!= null)&&this.effByStuStatInd.equals(rhs.effByStuStatInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.extensionRefundPct == rhs.extensionRefundPct)||((this.extensionRefundPct!= null)&&this.extensionRefundPct.equals(rhs.extensionRefundPct))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.feeRefundPct == rhs.feeRefundPct)||((this.feeRefundPct!= null)&&this.feeRefundPct.equals(rhs.feeRefundPct))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
