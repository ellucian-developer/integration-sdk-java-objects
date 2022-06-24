
package com.ellucian.generated.bpapi.ban.block_schedule_control.v1_0_0;

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
    "criteria.ssbsectMaxEnrl",
    "criteria.ssbsectPtrmCode",
    "criteria.ssbsectSchdCode",
    "keyblocTermCode",
    "keyblocBlckCode",
    "criteria.ssbsectGmodCode",
    "criteria.ssbsectEnrl",
    "criteria.ssbsectRegFromDate",
    "criteria.ssbsectCampCode",
    "criteria.ssbsectSstsCode",
    "crn",
    "criteria.ssbsectCreditHrs",
    "ssbsectCreditHrs",
    "criteria.ssbsectInsmCode",
    "criteria.ssbsectRegToDate",
    "criteria.ssbsectSeqNumb",
    "criteria.crn",
    "criteria.xlstGroup",
    "criteria.ssbsectLinkIdent",
    "criteria.ssbsectBillHrs",
    "criteria.multiBlock",
    "ssbsectGmodCode",
    "ssbsectBillHrs",
    "criteria.ssbsectCrseNumb",
    "criteria.ssbsectSubjCode",
    "criteria.apprInd",
    "criteria.ssbsectSeatsAvail"
})
@Generated("jsonschema2pojo")
public class BlockScheduleControl100PutRequest {

    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectMaxEnrl")
    private Object criteriaSsbsectMaxEnrl;
    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ssbsectPtrmCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvptrm")
    private String criteriaSsbsectPtrmCode;
    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssbsectSchdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvschd")
    private String criteriaSsbsectSchdCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    @JsonPropertyDescription("Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck")
    private String keyblocBlckCode;
    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("criteria.ssbsectGmodCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String criteriaSsbsectGmodCode;
    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectEnrl")
    private Object criteriaSsbsectEnrl;
    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegFromDate")
    private Date criteriaSsbsectRegFromDate;
    /**
     * Campus Code
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.ssbsectCampCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcamp")
    private String criteriaSsbsectCampCode;
    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.ssbsectSstsCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvssts")
    private String criteriaSsbsectSstsCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_CRN")
    private String crn;
    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCreditHrs")
    private Double criteriaSsbsectCreditHrs;
    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    private Double ssbsectCreditHrs;
    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectInsmCode")
    private String criteriaSsbsectInsmCode;
    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegToDate")
    private Date criteriaSsbsectRegToDate;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeqNumb")
    private String criteriaSsbsectSeqNumb;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_CRN")
    private String criteriaCrn;
    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.xlstGroup")
    private String criteriaXlstGroup;
    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectLinkIdent")
    private String criteriaSsbsectLinkIdent;
    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectBillHrs")
    private Double criteriaSsbsectBillHrs;
    /**
     * Multiple Block
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.multiBlock")
    private String criteriaMultiBlock;
    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String ssbsectGmodCode;
    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    private Double ssbsectBillHrs;
    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCrseNumb")
    private String criteriaSsbsectCrseNumb;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.ssbsectSubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String criteriaSsbsectSubjCode;
    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("criteria.apprInd")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_APPR_IND")
    private String criteriaApprInd;
    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeatsAvail")
    private Object criteriaSsbsectSeatsAvail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectMaxEnrl")
    public Object getCriteriaSsbsectMaxEnrl() {
        return criteriaSsbsectMaxEnrl;
    }

    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectMaxEnrl")
    public void setCriteriaSsbsectMaxEnrl(Object criteriaSsbsectMaxEnrl) {
        this.criteriaSsbsectMaxEnrl = criteriaSsbsectMaxEnrl;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectMaxEnrl(Object criteriaSsbsectMaxEnrl) {
        this.criteriaSsbsectMaxEnrl = criteriaSsbsectMaxEnrl;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ssbsectPtrmCode")
    public String getCriteriaSsbsectPtrmCode() {
        return criteriaSsbsectPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ssbsectPtrmCode")
    public void setCriteriaSsbsectPtrmCode(String criteriaSsbsectPtrmCode) {
        this.criteriaSsbsectPtrmCode = criteriaSsbsectPtrmCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectPtrmCode(String criteriaSsbsectPtrmCode) {
        this.criteriaSsbsectPtrmCode = criteriaSsbsectPtrmCode;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssbsectSchdCode")
    public String getCriteriaSsbsectSchdCode() {
        return criteriaSsbsectSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssbsectSchdCode")
    public void setCriteriaSsbsectSchdCode(String criteriaSsbsectSchdCode) {
        this.criteriaSsbsectSchdCode = criteriaSsbsectSchdCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectSchdCode(String criteriaSsbsectSchdCode) {
        this.criteriaSsbsectSchdCode = criteriaSsbsectSchdCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public BlockScheduleControl100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public String getKeyblocBlckCode() {
        return keyblocBlckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public void setKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
    }

    public BlockScheduleControl100PutRequest withKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("criteria.ssbsectGmodCode")
    public String getCriteriaSsbsectGmodCode() {
        return criteriaSsbsectGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("criteria.ssbsectGmodCode")
    public void setCriteriaSsbsectGmodCode(String criteriaSsbsectGmodCode) {
        this.criteriaSsbsectGmodCode = criteriaSsbsectGmodCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectGmodCode(String criteriaSsbsectGmodCode) {
        this.criteriaSsbsectGmodCode = criteriaSsbsectGmodCode;
        return this;
    }

    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectEnrl")
    public Object getCriteriaSsbsectEnrl() {
        return criteriaSsbsectEnrl;
    }

    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectEnrl")
    public void setCriteriaSsbsectEnrl(Object criteriaSsbsectEnrl) {
        this.criteriaSsbsectEnrl = criteriaSsbsectEnrl;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectEnrl(Object criteriaSsbsectEnrl) {
        this.criteriaSsbsectEnrl = criteriaSsbsectEnrl;
        return this;
    }

    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegFromDate")
    public Date getCriteriaSsbsectRegFromDate() {
        return criteriaSsbsectRegFromDate;
    }

    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegFromDate")
    public void setCriteriaSsbsectRegFromDate(Date criteriaSsbsectRegFromDate) {
        this.criteriaSsbsectRegFromDate = criteriaSsbsectRegFromDate;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectRegFromDate(Date criteriaSsbsectRegFromDate) {
        this.criteriaSsbsectRegFromDate = criteriaSsbsectRegFromDate;
        return this;
    }

    /**
     * Campus Code
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.ssbsectCampCode")
    public String getCriteriaSsbsectCampCode() {
        return criteriaSsbsectCampCode;
    }

    /**
     * Campus Code
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.ssbsectCampCode")
    public void setCriteriaSsbsectCampCode(String criteriaSsbsectCampCode) {
        this.criteriaSsbsectCampCode = criteriaSsbsectCampCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectCampCode(String criteriaSsbsectCampCode) {
        this.criteriaSsbsectCampCode = criteriaSsbsectCampCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.ssbsectSstsCode")
    public String getCriteriaSsbsectSstsCode() {
        return criteriaSsbsectSstsCode;
    }

    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.ssbsectSstsCode")
    public void setCriteriaSsbsectSstsCode(String criteriaSsbsectSstsCode) {
        this.criteriaSsbsectSstsCode = criteriaSsbsectSstsCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectSstsCode(String criteriaSsbsectSstsCode) {
        this.criteriaSsbsectSstsCode = criteriaSsbsectSstsCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public BlockScheduleControl100PutRequest withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCreditHrs")
    public Double getCriteriaSsbsectCreditHrs() {
        return criteriaSsbsectCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCreditHrs")
    public void setCriteriaSsbsectCreditHrs(Double criteriaSsbsectCreditHrs) {
        this.criteriaSsbsectCreditHrs = criteriaSsbsectCreditHrs;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectCreditHrs(Double criteriaSsbsectCreditHrs) {
        this.criteriaSsbsectCreditHrs = criteriaSsbsectCreditHrs;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public Double getSsbsectCreditHrs() {
        return ssbsectCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public void setSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
    }

    public BlockScheduleControl100PutRequest withSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectInsmCode")
    public String getCriteriaSsbsectInsmCode() {
        return criteriaSsbsectInsmCode;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectInsmCode")
    public void setCriteriaSsbsectInsmCode(String criteriaSsbsectInsmCode) {
        this.criteriaSsbsectInsmCode = criteriaSsbsectInsmCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectInsmCode(String criteriaSsbsectInsmCode) {
        this.criteriaSsbsectInsmCode = criteriaSsbsectInsmCode;
        return this;
    }

    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegToDate")
    public Date getCriteriaSsbsectRegToDate() {
        return criteriaSsbsectRegToDate;
    }

    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectRegToDate")
    public void setCriteriaSsbsectRegToDate(Date criteriaSsbsectRegToDate) {
        this.criteriaSsbsectRegToDate = criteriaSsbsectRegToDate;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectRegToDate(Date criteriaSsbsectRegToDate) {
        this.criteriaSsbsectRegToDate = criteriaSsbsectRegToDate;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeqNumb")
    public String getCriteriaSsbsectSeqNumb() {
        return criteriaSsbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeqNumb")
    public void setCriteriaSsbsectSeqNumb(String criteriaSsbsectSeqNumb) {
        this.criteriaSsbsectSeqNumb = criteriaSsbsectSeqNumb;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectSeqNumb(String criteriaSsbsectSeqNumb) {
        this.criteriaSsbsectSeqNumb = criteriaSsbsectSeqNumb;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public String getCriteriaCrn() {
        return criteriaCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRBLCK_CRN
     * 
     */
    @JsonProperty("criteria.crn")
    public void setCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
    }

    public BlockScheduleControl100PutRequest withCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
        return this;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.xlstGroup")
    public String getCriteriaXlstGroup() {
        return criteriaXlstGroup;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.xlstGroup")
    public void setCriteriaXlstGroup(String criteriaXlstGroup) {
        this.criteriaXlstGroup = criteriaXlstGroup;
    }

    public BlockScheduleControl100PutRequest withCriteriaXlstGroup(String criteriaXlstGroup) {
        this.criteriaXlstGroup = criteriaXlstGroup;
        return this;
    }

    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectLinkIdent")
    public String getCriteriaSsbsectLinkIdent() {
        return criteriaSsbsectLinkIdent;
    }

    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectLinkIdent")
    public void setCriteriaSsbsectLinkIdent(String criteriaSsbsectLinkIdent) {
        this.criteriaSsbsectLinkIdent = criteriaSsbsectLinkIdent;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectLinkIdent(String criteriaSsbsectLinkIdent) {
        this.criteriaSsbsectLinkIdent = criteriaSsbsectLinkIdent;
        return this;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectBillHrs")
    public Double getCriteriaSsbsectBillHrs() {
        return criteriaSsbsectBillHrs;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectBillHrs")
    public void setCriteriaSsbsectBillHrs(Double criteriaSsbsectBillHrs) {
        this.criteriaSsbsectBillHrs = criteriaSsbsectBillHrs;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectBillHrs(Double criteriaSsbsectBillHrs) {
        this.criteriaSsbsectBillHrs = criteriaSsbsectBillHrs;
        return this;
    }

    /**
     * Multiple Block
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.multiBlock")
    public String getCriteriaMultiBlock() {
        return criteriaMultiBlock;
    }

    /**
     * Multiple Block
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.multiBlock")
    public void setCriteriaMultiBlock(String criteriaMultiBlock) {
        this.criteriaMultiBlock = criteriaMultiBlock;
    }

    public BlockScheduleControl100PutRequest withCriteriaMultiBlock(String criteriaMultiBlock) {
        this.criteriaMultiBlock = criteriaMultiBlock;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public String getSsbsectGmodCode() {
        return ssbsectGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public void setSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
    }

    public BlockScheduleControl100PutRequest withSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
        return this;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public Double getSsbsectBillHrs() {
        return ssbsectBillHrs;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public void setSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
    }

    public BlockScheduleControl100PutRequest withSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
        return this;
    }

    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCrseNumb")
    public String getCriteriaSsbsectCrseNumb() {
        return criteriaSsbsectCrseNumb;
    }

    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectCrseNumb")
    public void setCriteriaSsbsectCrseNumb(String criteriaSsbsectCrseNumb) {
        this.criteriaSsbsectCrseNumb = criteriaSsbsectCrseNumb;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectCrseNumb(String criteriaSsbsectCrseNumb) {
        this.criteriaSsbsectCrseNumb = criteriaSsbsectCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.ssbsectSubjCode")
    public String getCriteriaSsbsectSubjCode() {
        return criteriaSsbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.ssbsectSubjCode")
    public void setCriteriaSsbsectSubjCode(String criteriaSsbsectSubjCode) {
        this.criteriaSsbsectSubjCode = criteriaSsbsectSubjCode;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectSubjCode(String criteriaSsbsectSubjCode) {
        this.criteriaSsbsectSubjCode = criteriaSsbsectSubjCode;
        return this;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("criteria.apprInd")
    public String getCriteriaApprInd() {
        return criteriaApprInd;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("criteria.apprInd")
    public void setCriteriaApprInd(String criteriaApprInd) {
        this.criteriaApprInd = criteriaApprInd;
    }

    public BlockScheduleControl100PutRequest withCriteriaApprInd(String criteriaApprInd) {
        this.criteriaApprInd = criteriaApprInd;
        return this;
    }

    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeatsAvail")
    public Object getCriteriaSsbsectSeatsAvail() {
        return criteriaSsbsectSeatsAvail;
    }

    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.ssbsectSeatsAvail")
    public void setCriteriaSsbsectSeatsAvail(Object criteriaSsbsectSeatsAvail) {
        this.criteriaSsbsectSeatsAvail = criteriaSsbsectSeatsAvail;
    }

    public BlockScheduleControl100PutRequest withCriteriaSsbsectSeatsAvail(Object criteriaSsbsectSeatsAvail) {
        this.criteriaSsbsectSeatsAvail = criteriaSsbsectSeatsAvail;
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

    public BlockScheduleControl100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleControl100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSsbsectMaxEnrl");
        sb.append('=');
        sb.append(((this.criteriaSsbsectMaxEnrl == null)?"<null>":this.criteriaSsbsectMaxEnrl));
        sb.append(',');
        sb.append("criteriaSsbsectPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectPtrmCode == null)?"<null>":this.criteriaSsbsectPtrmCode));
        sb.append(',');
        sb.append("criteriaSsbsectSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectSchdCode == null)?"<null>":this.criteriaSsbsectSchdCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocBlckCode");
        sb.append('=');
        sb.append(((this.keyblocBlckCode == null)?"<null>":this.keyblocBlckCode));
        sb.append(',');
        sb.append("criteriaSsbsectGmodCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectGmodCode == null)?"<null>":this.criteriaSsbsectGmodCode));
        sb.append(',');
        sb.append("criteriaSsbsectEnrl");
        sb.append('=');
        sb.append(((this.criteriaSsbsectEnrl == null)?"<null>":this.criteriaSsbsectEnrl));
        sb.append(',');
        sb.append("criteriaSsbsectRegFromDate");
        sb.append('=');
        sb.append(((this.criteriaSsbsectRegFromDate == null)?"<null>":this.criteriaSsbsectRegFromDate));
        sb.append(',');
        sb.append("criteriaSsbsectCampCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectCampCode == null)?"<null>":this.criteriaSsbsectCampCode));
        sb.append(',');
        sb.append("criteriaSsbsectSstsCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectSstsCode == null)?"<null>":this.criteriaSsbsectSstsCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("criteriaSsbsectCreditHrs");
        sb.append('=');
        sb.append(((this.criteriaSsbsectCreditHrs == null)?"<null>":this.criteriaSsbsectCreditHrs));
        sb.append(',');
        sb.append("ssbsectCreditHrs");
        sb.append('=');
        sb.append(((this.ssbsectCreditHrs == null)?"<null>":this.ssbsectCreditHrs));
        sb.append(',');
        sb.append("criteriaSsbsectInsmCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectInsmCode == null)?"<null>":this.criteriaSsbsectInsmCode));
        sb.append(',');
        sb.append("criteriaSsbsectRegToDate");
        sb.append('=');
        sb.append(((this.criteriaSsbsectRegToDate == null)?"<null>":this.criteriaSsbsectRegToDate));
        sb.append(',');
        sb.append("criteriaSsbsectSeqNumb");
        sb.append('=');
        sb.append(((this.criteriaSsbsectSeqNumb == null)?"<null>":this.criteriaSsbsectSeqNumb));
        sb.append(',');
        sb.append("criteriaCrn");
        sb.append('=');
        sb.append(((this.criteriaCrn == null)?"<null>":this.criteriaCrn));
        sb.append(',');
        sb.append("criteriaXlstGroup");
        sb.append('=');
        sb.append(((this.criteriaXlstGroup == null)?"<null>":this.criteriaXlstGroup));
        sb.append(',');
        sb.append("criteriaSsbsectLinkIdent");
        sb.append('=');
        sb.append(((this.criteriaSsbsectLinkIdent == null)?"<null>":this.criteriaSsbsectLinkIdent));
        sb.append(',');
        sb.append("criteriaSsbsectBillHrs");
        sb.append('=');
        sb.append(((this.criteriaSsbsectBillHrs == null)?"<null>":this.criteriaSsbsectBillHrs));
        sb.append(',');
        sb.append("criteriaMultiBlock");
        sb.append('=');
        sb.append(((this.criteriaMultiBlock == null)?"<null>":this.criteriaMultiBlock));
        sb.append(',');
        sb.append("ssbsectGmodCode");
        sb.append('=');
        sb.append(((this.ssbsectGmodCode == null)?"<null>":this.ssbsectGmodCode));
        sb.append(',');
        sb.append("ssbsectBillHrs");
        sb.append('=');
        sb.append(((this.ssbsectBillHrs == null)?"<null>":this.ssbsectBillHrs));
        sb.append(',');
        sb.append("criteriaSsbsectCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaSsbsectCrseNumb == null)?"<null>":this.criteriaSsbsectCrseNumb));
        sb.append(',');
        sb.append("criteriaSsbsectSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSsbsectSubjCode == null)?"<null>":this.criteriaSsbsectSubjCode));
        sb.append(',');
        sb.append("criteriaApprInd");
        sb.append('=');
        sb.append(((this.criteriaApprInd == null)?"<null>":this.criteriaApprInd));
        sb.append(',');
        sb.append("criteriaSsbsectSeatsAvail");
        sb.append('=');
        sb.append(((this.criteriaSsbsectSeatsAvail == null)?"<null>":this.criteriaSsbsectSeatsAvail));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectLinkIdent == null)? 0 :this.criteriaSsbsectLinkIdent.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectSubjCode == null)? 0 :this.criteriaSsbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaMultiBlock == null)? 0 :this.criteriaMultiBlock.hashCode()));
        result = ((result* 31)+((this.keyblocBlckCode == null)? 0 :this.keyblocBlckCode.hashCode()));
        result = ((result* 31)+((this.criteriaApprInd == null)? 0 :this.criteriaApprInd.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectSstsCode == null)? 0 :this.criteriaSsbsectSstsCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectCampCode == null)? 0 :this.criteriaSsbsectCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaXlstGroup == null)? 0 :this.criteriaXlstGroup.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectSeatsAvail == null)? 0 :this.criteriaSsbsectSeatsAvail.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectRegToDate == null)? 0 :this.criteriaSsbsectRegToDate.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectInsmCode == null)? 0 :this.criteriaSsbsectInsmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectGmodCode == null)? 0 :this.criteriaSsbsectGmodCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCreditHrs == null)? 0 :this.ssbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectBillHrs == null)? 0 :this.criteriaSsbsectBillHrs.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectRegFromDate == null)? 0 :this.criteriaSsbsectRegFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectEnrl == null)? 0 :this.criteriaSsbsectEnrl.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectSchdCode == null)? 0 :this.criteriaSsbsectSchdCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectMaxEnrl == null)? 0 :this.criteriaSsbsectMaxEnrl.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectCrseNumb == null)? 0 :this.criteriaSsbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectCreditHrs == null)? 0 :this.criteriaSsbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectPtrmCode == null)? 0 :this.criteriaSsbsectPtrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectGmodCode == null)? 0 :this.ssbsectGmodCode.hashCode()));
        result = ((result* 31)+((this.ssbsectBillHrs == null)? 0 :this.ssbsectBillHrs.hashCode()));
        result = ((result* 31)+((this.criteriaSsbsectSeqNumb == null)? 0 :this.criteriaSsbsectSeqNumb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleControl100PutRequest) == false) {
            return false;
        }
        BlockScheduleControl100PutRequest rhs = ((BlockScheduleControl100PutRequest) other);
        return (((((((((((((((((((((((((((((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode)))&&((this.criteriaSsbsectLinkIdent == rhs.criteriaSsbsectLinkIdent)||((this.criteriaSsbsectLinkIdent!= null)&&this.criteriaSsbsectLinkIdent.equals(rhs.criteriaSsbsectLinkIdent))))&&((this.criteriaSsbsectSubjCode == rhs.criteriaSsbsectSubjCode)||((this.criteriaSsbsectSubjCode!= null)&&this.criteriaSsbsectSubjCode.equals(rhs.criteriaSsbsectSubjCode))))&&((this.criteriaMultiBlock == rhs.criteriaMultiBlock)||((this.criteriaMultiBlock!= null)&&this.criteriaMultiBlock.equals(rhs.criteriaMultiBlock))))&&((this.keyblocBlckCode == rhs.keyblocBlckCode)||((this.keyblocBlckCode!= null)&&this.keyblocBlckCode.equals(rhs.keyblocBlckCode))))&&((this.criteriaApprInd == rhs.criteriaApprInd)||((this.criteriaApprInd!= null)&&this.criteriaApprInd.equals(rhs.criteriaApprInd))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.criteriaSsbsectSstsCode == rhs.criteriaSsbsectSstsCode)||((this.criteriaSsbsectSstsCode!= null)&&this.criteriaSsbsectSstsCode.equals(rhs.criteriaSsbsectSstsCode))))&&((this.criteriaSsbsectCampCode == rhs.criteriaSsbsectCampCode)||((this.criteriaSsbsectCampCode!= null)&&this.criteriaSsbsectCampCode.equals(rhs.criteriaSsbsectCampCode))))&&((this.criteriaXlstGroup == rhs.criteriaXlstGroup)||((this.criteriaXlstGroup!= null)&&this.criteriaXlstGroup.equals(rhs.criteriaXlstGroup))))&&((this.criteriaSsbsectSeatsAvail == rhs.criteriaSsbsectSeatsAvail)||((this.criteriaSsbsectSeatsAvail!= null)&&this.criteriaSsbsectSeatsAvail.equals(rhs.criteriaSsbsectSeatsAvail))))&&((this.criteriaSsbsectRegToDate == rhs.criteriaSsbsectRegToDate)||((this.criteriaSsbsectRegToDate!= null)&&this.criteriaSsbsectRegToDate.equals(rhs.criteriaSsbsectRegToDate))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.criteriaSsbsectInsmCode == rhs.criteriaSsbsectInsmCode)||((this.criteriaSsbsectInsmCode!= null)&&this.criteriaSsbsectInsmCode.equals(rhs.criteriaSsbsectInsmCode))))&&((this.criteriaSsbsectGmodCode == rhs.criteriaSsbsectGmodCode)||((this.criteriaSsbsectGmodCode!= null)&&this.criteriaSsbsectGmodCode.equals(rhs.criteriaSsbsectGmodCode))))&&((this.ssbsectCreditHrs == rhs.ssbsectCreditHrs)||((this.ssbsectCreditHrs!= null)&&this.ssbsectCreditHrs.equals(rhs.ssbsectCreditHrs))))&&((this.criteriaSsbsectBillHrs == rhs.criteriaSsbsectBillHrs)||((this.criteriaSsbsectBillHrs!= null)&&this.criteriaSsbsectBillHrs.equals(rhs.criteriaSsbsectBillHrs))))&&((this.criteriaSsbsectRegFromDate == rhs.criteriaSsbsectRegFromDate)||((this.criteriaSsbsectRegFromDate!= null)&&this.criteriaSsbsectRegFromDate.equals(rhs.criteriaSsbsectRegFromDate))))&&((this.criteriaSsbsectEnrl == rhs.criteriaSsbsectEnrl)||((this.criteriaSsbsectEnrl!= null)&&this.criteriaSsbsectEnrl.equals(rhs.criteriaSsbsectEnrl))))&&((this.criteriaSsbsectSchdCode == rhs.criteriaSsbsectSchdCode)||((this.criteriaSsbsectSchdCode!= null)&&this.criteriaSsbsectSchdCode.equals(rhs.criteriaSsbsectSchdCode))))&&((this.criteriaSsbsectMaxEnrl == rhs.criteriaSsbsectMaxEnrl)||((this.criteriaSsbsectMaxEnrl!= null)&&this.criteriaSsbsectMaxEnrl.equals(rhs.criteriaSsbsectMaxEnrl))))&&((this.criteriaSsbsectCrseNumb == rhs.criteriaSsbsectCrseNumb)||((this.criteriaSsbsectCrseNumb!= null)&&this.criteriaSsbsectCrseNumb.equals(rhs.criteriaSsbsectCrseNumb))))&&((this.criteriaSsbsectCreditHrs == rhs.criteriaSsbsectCreditHrs)||((this.criteriaSsbsectCreditHrs!= null)&&this.criteriaSsbsectCreditHrs.equals(rhs.criteriaSsbsectCreditHrs))))&&((this.criteriaSsbsectPtrmCode == rhs.criteriaSsbsectPtrmCode)||((this.criteriaSsbsectPtrmCode!= null)&&this.criteriaSsbsectPtrmCode.equals(rhs.criteriaSsbsectPtrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectGmodCode == rhs.ssbsectGmodCode)||((this.ssbsectGmodCode!= null)&&this.ssbsectGmodCode.equals(rhs.ssbsectGmodCode))))&&((this.ssbsectBillHrs == rhs.ssbsectBillHrs)||((this.ssbsectBillHrs!= null)&&this.ssbsectBillHrs.equals(rhs.ssbsectBillHrs))))&&((this.criteriaSsbsectSeqNumb == rhs.criteriaSsbsectSeqNumb)||((this.criteriaSsbsectSeqNumb!= null)&&this.criteriaSsbsectSeqNumb.equals(rhs.criteriaSsbsectSeqNumb))));
    }

}
