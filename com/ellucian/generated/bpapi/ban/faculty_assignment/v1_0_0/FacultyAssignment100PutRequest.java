
package com.ellucian.generated.bpapi.ban.faculty_assignment.v1_0_0;

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
    "criteria.seqNumb",
    "criteria.suff",
    "criteria.instCred",
    "criteria.weeklyHrs",
    "criteria.crseNumb",
    "criteria.weeklyContact",
    "criteria.compensationExtractedCbox",
    "nistCode",
    "criteria.subjCode",
    "criteria.generatedCredits",
    "criteria.collCode",
    "criteria.addInst",
    "criteria.compensationAppliedCbox",
    "id",
    "criteria.posn",
    "criteria.calcWorkload",
    "criteria.astyCode",
    "topsCode",
    "criteria.sirnistCompensationAppliedCbox",
    "fcntCode",
    "criteria.workloadAdjust",
    "criteria.fcntCode",
    "posn",
    "criteria.percentSess",
    "sirnistSuff",
    "criteria.topsCode",
    "sirnistPosn",
    "criteria.sirnistPosn",
    "collCode",
    "criteria.sessHrs",
    "percentSess",
    "astyCode",
    "deptCode",
    "percentResponse",
    "workloadAdjust",
    "sirnistAstyCode",
    "criteria.sirnistFcntCode",
    "criteria.deptCode",
    "criteria.category",
    "keyblocTermCodeEff",
    "weeklyHrs",
    "criteria.nistCode",
    "criteria.workload",
    "criteria.sirnistAstyCode",
    "criteria.sirnistCompensationExtractedCbox",
    "overRide",
    "criteria.totalContact",
    "nistWorkload",
    "criteria.fte",
    "criteria.nistDesc",
    "criteria.crn",
    "criteria.assignFte",
    "criteria.percentResponse",
    "criteria.primaryInd",
    "criteria.overRide",
    "criteria.nistWorkload",
    "sirnistFcntCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class FacultyAssignment100PutRequest {

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.seqNumb")
    private String criteriaSeqNumb;
    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("criteria.suff")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_SUFF")
    private String criteriaSuff;
    /**
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.instCred")
    private Double criteriaInstCred;
    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("criteria.weeklyHrs")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_WEEKLY_HRS")
    private Double criteriaWeeklyHrs;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crseNumb")
    private String criteriaCrseNumb;
    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.weeklyContact")
    private Double criteriaWeeklyContact;
    @JsonProperty("criteria.compensationExtractedCbox")
    private String criteriaCompensationExtractedCbox;
    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist")
    private String nistCode;
    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCode")
    private String criteriaSubjCode;
    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.generatedCredits")
    private Double criteriaGeneratedCredits;
    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addInst")
    private String criteriaAddInst;
    @JsonProperty("criteria.compensationAppliedCbox")
    private String criteriaCompensationAppliedCbox;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_POSN")
    private String criteriaPosn;
    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calcWorkload")
    private Double criteriaCalcWorkload;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.astyCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String criteriaAstyCode;
    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    @JsonProperty("criteria.sirnistCompensationAppliedCbox")
    private String criteriaSirnistCompensationAppliedCbox;
    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String fcntCode;
    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("criteria.workloadAdjust")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_WORKLOAD_ADJUST")
    private Double criteriaWorkloadAdjust;
    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.fcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String criteriaFcntCode;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_POSN")
    private String posn;
    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double criteriaPercentSess;
    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("sirnistSuff")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_SUFF")
    private String sirnistSuff;
    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("criteria.topsCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String criteriaTopsCode;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_POSN")
    private String sirnistPosn;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("criteria.sirnistPosn")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_POSN")
    private String criteriaSirnistPosn;
    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessHrs")
    private Double criteriaSessHrs;
    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String astyCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double percentResponse;
    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_WORKLOAD_ADJUST")
    private Double workloadAdjust;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("sirnistAstyCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String sirnistAstyCode;
    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.sirnistFcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String criteriaSirnistFcntCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.category")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CATEGORY")
    private String criteriaCategory;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm")
    private String keyblocTermCodeEff;
    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_WEEKLY_HRS")
    private Double weeklyHrs;
    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("criteria.nistCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist")
    private String criteriaNistCode;
    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.workload")
    private Double criteriaWorkload;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.sirnistAstyCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String criteriaSirnistAstyCode;
    @JsonProperty("criteria.sirnistCompensationExtractedCbox")
    private String criteriaSirnistCompensationExtractedCbox;
    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String overRide;
    /**
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.totalContact")
    private Double criteriaTotalContact;
    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_WORKLOAD")
    private Double nistWorkload;
    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fte")
    private Double criteriaFte;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nistDesc")
    private String criteriaNistDesc;
    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("criteria.crn")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CRN")
    private String criteriaCrn;
    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.assignFte")
    private Double criteriaAssignFte;
    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double criteriaPercentResponse;
    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String criteriaPrimaryInd;
    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String criteriaOverRide;
    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("criteria.nistWorkload")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_WORKLOAD")
    private Double criteriaNistWorkload;
    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("sirnistFcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String sirnistFcntCode;
    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.seqNumb")
    public String getCriteriaSeqNumb() {
        return criteriaSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.seqNumb")
    public void setCriteriaSeqNumb(String criteriaSeqNumb) {
        this.criteriaSeqNumb = criteriaSeqNumb;
    }

    public FacultyAssignment100PutRequest withCriteriaSeqNumb(String criteriaSeqNumb) {
        this.criteriaSeqNumb = criteriaSeqNumb;
        return this;
    }

    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("criteria.suff")
    public String getCriteriaSuff() {
        return criteriaSuff;
    }

    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("criteria.suff")
    public void setCriteriaSuff(String criteriaSuff) {
        this.criteriaSuff = criteriaSuff;
    }

    public FacultyAssignment100PutRequest withCriteriaSuff(String criteriaSuff) {
        this.criteriaSuff = criteriaSuff;
        return this;
    }

    /**
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.instCred")
    public Double getCriteriaInstCred() {
        return criteriaInstCred;
    }

    /**
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.instCred")
    public void setCriteriaInstCred(Double criteriaInstCred) {
        this.criteriaInstCred = criteriaInstCred;
    }

    public FacultyAssignment100PutRequest withCriteriaInstCred(Double criteriaInstCred) {
        this.criteriaInstCred = criteriaInstCred;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("criteria.weeklyHrs")
    public Double getCriteriaWeeklyHrs() {
        return criteriaWeeklyHrs;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("criteria.weeklyHrs")
    public void setCriteriaWeeklyHrs(Double criteriaWeeklyHrs) {
        this.criteriaWeeklyHrs = criteriaWeeklyHrs;
    }

    public FacultyAssignment100PutRequest withCriteriaWeeklyHrs(Double criteriaWeeklyHrs) {
        this.criteriaWeeklyHrs = criteriaWeeklyHrs;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public FacultyAssignment100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.weeklyContact")
    public Double getCriteriaWeeklyContact() {
        return criteriaWeeklyContact;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.weeklyContact")
    public void setCriteriaWeeklyContact(Double criteriaWeeklyContact) {
        this.criteriaWeeklyContact = criteriaWeeklyContact;
    }

    public FacultyAssignment100PutRequest withCriteriaWeeklyContact(Double criteriaWeeklyContact) {
        this.criteriaWeeklyContact = criteriaWeeklyContact;
        return this;
    }

    @JsonProperty("criteria.compensationExtractedCbox")
    public String getCriteriaCompensationExtractedCbox() {
        return criteriaCompensationExtractedCbox;
    }

    @JsonProperty("criteria.compensationExtractedCbox")
    public void setCriteriaCompensationExtractedCbox(String criteriaCompensationExtractedCbox) {
        this.criteriaCompensationExtractedCbox = criteriaCompensationExtractedCbox;
    }

    public FacultyAssignment100PutRequest withCriteriaCompensationExtractedCbox(String criteriaCompensationExtractedCbox) {
        this.criteriaCompensationExtractedCbox = criteriaCompensationExtractedCbox;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public String getNistCode() {
        return nistCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public void setNistCode(String nistCode) {
        this.nistCode = nistCode;
    }

    public FacultyAssignment100PutRequest withNistCode(String nistCode) {
        this.nistCode = nistCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public FacultyAssignment100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.generatedCredits")
    public Double getCriteriaGeneratedCredits() {
        return criteriaGeneratedCredits;
    }

    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.generatedCredits")
    public void setCriteriaGeneratedCredits(Double criteriaGeneratedCredits) {
        this.criteriaGeneratedCredits = criteriaGeneratedCredits;
    }

    public FacultyAssignment100PutRequest withCriteriaGeneratedCredits(Double criteriaGeneratedCredits) {
        this.criteriaGeneratedCredits = criteriaGeneratedCredits;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public FacultyAssignment100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addInst")
    public String getCriteriaAddInst() {
        return criteriaAddInst;
    }

    /**
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.addInst")
    public void setCriteriaAddInst(String criteriaAddInst) {
        this.criteriaAddInst = criteriaAddInst;
    }

    public FacultyAssignment100PutRequest withCriteriaAddInst(String criteriaAddInst) {
        this.criteriaAddInst = criteriaAddInst;
        return this;
    }

    @JsonProperty("criteria.compensationAppliedCbox")
    public String getCriteriaCompensationAppliedCbox() {
        return criteriaCompensationAppliedCbox;
    }

    @JsonProperty("criteria.compensationAppliedCbox")
    public void setCriteriaCompensationAppliedCbox(String criteriaCompensationAppliedCbox) {
        this.criteriaCompensationAppliedCbox = criteriaCompensationAppliedCbox;
    }

    public FacultyAssignment100PutRequest withCriteriaCompensationAppliedCbox(String criteriaCompensationAppliedCbox) {
        this.criteriaCompensationAppliedCbox = criteriaCompensationAppliedCbox;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FacultyAssignment100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    public String getCriteriaPosn() {
        return criteriaPosn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    public void setCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
    }

    public FacultyAssignment100PutRequest withCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
        return this;
    }

    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calcWorkload")
    public Double getCriteriaCalcWorkload() {
        return criteriaCalcWorkload;
    }

    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.calcWorkload")
    public void setCriteriaCalcWorkload(Double criteriaCalcWorkload) {
        this.criteriaCalcWorkload = criteriaCalcWorkload;
    }

    public FacultyAssignment100PutRequest withCriteriaCalcWorkload(Double criteriaCalcWorkload) {
        this.criteriaCalcWorkload = criteriaCalcWorkload;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.astyCode")
    public String getCriteriaAstyCode() {
        return criteriaAstyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.astyCode")
    public void setCriteriaAstyCode(String criteriaAstyCode) {
        this.criteriaAstyCode = criteriaAstyCode;
    }

    public FacultyAssignment100PutRequest withCriteriaAstyCode(String criteriaAstyCode) {
        this.criteriaAstyCode = criteriaAstyCode;
        return this;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public FacultyAssignment100PutRequest withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    @JsonProperty("criteria.sirnistCompensationAppliedCbox")
    public String getCriteriaSirnistCompensationAppliedCbox() {
        return criteriaSirnistCompensationAppliedCbox;
    }

    @JsonProperty("criteria.sirnistCompensationAppliedCbox")
    public void setCriteriaSirnistCompensationAppliedCbox(String criteriaSirnistCompensationAppliedCbox) {
        this.criteriaSirnistCompensationAppliedCbox = criteriaSirnistCompensationAppliedCbox;
    }

    public FacultyAssignment100PutRequest withCriteriaSirnistCompensationAppliedCbox(String criteriaSirnistCompensationAppliedCbox) {
        this.criteriaSirnistCompensationAppliedCbox = criteriaSirnistCompensationAppliedCbox;
        return this;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public String getFcntCode() {
        return fcntCode;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public void setFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
    }

    public FacultyAssignment100PutRequest withFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
        return this;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("criteria.workloadAdjust")
    public Double getCriteriaWorkloadAdjust() {
        return criteriaWorkloadAdjust;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("criteria.workloadAdjust")
    public void setCriteriaWorkloadAdjust(Double criteriaWorkloadAdjust) {
        this.criteriaWorkloadAdjust = criteriaWorkloadAdjust;
    }

    public FacultyAssignment100PutRequest withCriteriaWorkloadAdjust(Double criteriaWorkloadAdjust) {
        this.criteriaWorkloadAdjust = criteriaWorkloadAdjust;
        return this;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.fcntCode")
    public String getCriteriaFcntCode() {
        return criteriaFcntCode;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.fcntCode")
    public void setCriteriaFcntCode(String criteriaFcntCode) {
        this.criteriaFcntCode = criteriaFcntCode;
    }

    public FacultyAssignment100PutRequest withCriteriaFcntCode(String criteriaFcntCode) {
        this.criteriaFcntCode = criteriaFcntCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public FacultyAssignment100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentSess")
    public Double getCriteriaPercentSess() {
        return criteriaPercentSess;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentSess")
    public void setCriteriaPercentSess(Double criteriaPercentSess) {
        this.criteriaPercentSess = criteriaPercentSess;
    }

    public FacultyAssignment100PutRequest withCriteriaPercentSess(Double criteriaPercentSess) {
        this.criteriaPercentSess = criteriaPercentSess;
        return this;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("sirnistSuff")
    public String getSirnistSuff() {
        return sirnistSuff;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("sirnistSuff")
    public void setSirnistSuff(String sirnistSuff) {
        this.sirnistSuff = sirnistSuff;
    }

    public FacultyAssignment100PutRequest withSirnistSuff(String sirnistSuff) {
        this.sirnistSuff = sirnistSuff;
        return this;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("criteria.topsCode")
    public String getCriteriaTopsCode() {
        return criteriaTopsCode;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("criteria.topsCode")
    public void setCriteriaTopsCode(String criteriaTopsCode) {
        this.criteriaTopsCode = criteriaTopsCode;
    }

    public FacultyAssignment100PutRequest withCriteriaTopsCode(String criteriaTopsCode) {
        this.criteriaTopsCode = criteriaTopsCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    public String getSirnistPosn() {
        return sirnistPosn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    public void setSirnistPosn(String sirnistPosn) {
        this.sirnistPosn = sirnistPosn;
    }

    public FacultyAssignment100PutRequest withSirnistPosn(String sirnistPosn) {
        this.sirnistPosn = sirnistPosn;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("criteria.sirnistPosn")
    public String getCriteriaSirnistPosn() {
        return criteriaSirnistPosn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("criteria.sirnistPosn")
    public void setCriteriaSirnistPosn(String criteriaSirnistPosn) {
        this.criteriaSirnistPosn = criteriaSirnistPosn;
    }

    public FacultyAssignment100PutRequest withCriteriaSirnistPosn(String criteriaSirnistPosn) {
        this.criteriaSirnistPosn = criteriaSirnistPosn;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public FacultyAssignment100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessHrs")
    public Double getCriteriaSessHrs() {
        return criteriaSessHrs;
    }

    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sessHrs")
    public void setCriteriaSessHrs(Double criteriaSessHrs) {
        this.criteriaSessHrs = criteriaSessHrs;
    }

    public FacultyAssignment100PutRequest withCriteriaSessHrs(Double criteriaSessHrs) {
        this.criteriaSessHrs = criteriaSessHrs;
        return this;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    public Double getPercentSess() {
        return percentSess;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    public void setPercentSess(Double percentSess) {
        this.percentSess = percentSess;
    }

    public FacultyAssignment100PutRequest withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public String getAstyCode() {
        return astyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public void setAstyCode(String astyCode) {
        this.astyCode = astyCode;
    }

    public FacultyAssignment100PutRequest withAstyCode(String astyCode) {
        this.astyCode = astyCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public FacultyAssignment100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    public Double getPercentResponse() {
        return percentResponse;
    }

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    public void setPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
    }

    public FacultyAssignment100PutRequest withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    public Double getWorkloadAdjust() {
        return workloadAdjust;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    public void setWorkloadAdjust(Double workloadAdjust) {
        this.workloadAdjust = workloadAdjust;
    }

    public FacultyAssignment100PutRequest withWorkloadAdjust(Double workloadAdjust) {
        this.workloadAdjust = workloadAdjust;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("sirnistAstyCode")
    public String getSirnistAstyCode() {
        return sirnistAstyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("sirnistAstyCode")
    public void setSirnistAstyCode(String sirnistAstyCode) {
        this.sirnistAstyCode = sirnistAstyCode;
    }

    public FacultyAssignment100PutRequest withSirnistAstyCode(String sirnistAstyCode) {
        this.sirnistAstyCode = sirnistAstyCode;
        return this;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.sirnistFcntCode")
    public String getCriteriaSirnistFcntCode() {
        return criteriaSirnistFcntCode;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("criteria.sirnistFcntCode")
    public void setCriteriaSirnistFcntCode(String criteriaSirnistFcntCode) {
        this.criteriaSirnistFcntCode = criteriaSirnistFcntCode;
    }

    public FacultyAssignment100PutRequest withCriteriaSirnistFcntCode(String criteriaSirnistFcntCode) {
        this.criteriaSirnistFcntCode = criteriaSirnistFcntCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public FacultyAssignment100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.category")
    public String getCriteriaCategory() {
        return criteriaCategory;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.category")
    public void setCriteriaCategory(String criteriaCategory) {
        this.criteriaCategory = criteriaCategory;
    }

    public FacultyAssignment100PutRequest withCriteriaCategory(String criteriaCategory) {
        this.criteriaCategory = criteriaCategory;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public String getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public FacultyAssignment100PutRequest withKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public Double getWeeklyHrs() {
        return weeklyHrs;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public void setWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
    }

    public FacultyAssignment100PutRequest withWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("criteria.nistCode")
    public String getCriteriaNistCode() {
        return criteriaNistCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("criteria.nistCode")
    public void setCriteriaNistCode(String criteriaNistCode) {
        this.criteriaNistCode = criteriaNistCode;
    }

    public FacultyAssignment100PutRequest withCriteriaNistCode(String criteriaNistCode) {
        this.criteriaNistCode = criteriaNistCode;
        return this;
    }

    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.workload")
    public Double getCriteriaWorkload() {
        return criteriaWorkload;
    }

    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.workload")
    public void setCriteriaWorkload(Double criteriaWorkload) {
        this.criteriaWorkload = criteriaWorkload;
    }

    public FacultyAssignment100PutRequest withCriteriaWorkload(Double criteriaWorkload) {
        this.criteriaWorkload = criteriaWorkload;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.sirnistAstyCode")
    public String getCriteriaSirnistAstyCode() {
        return criteriaSirnistAstyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("criteria.sirnistAstyCode")
    public void setCriteriaSirnistAstyCode(String criteriaSirnistAstyCode) {
        this.criteriaSirnistAstyCode = criteriaSirnistAstyCode;
    }

    public FacultyAssignment100PutRequest withCriteriaSirnistAstyCode(String criteriaSirnistAstyCode) {
        this.criteriaSirnistAstyCode = criteriaSirnistAstyCode;
        return this;
    }

    @JsonProperty("criteria.sirnistCompensationExtractedCbox")
    public String getCriteriaSirnistCompensationExtractedCbox() {
        return criteriaSirnistCompensationExtractedCbox;
    }

    @JsonProperty("criteria.sirnistCompensationExtractedCbox")
    public void setCriteriaSirnistCompensationExtractedCbox(String criteriaSirnistCompensationExtractedCbox) {
        this.criteriaSirnistCompensationExtractedCbox = criteriaSirnistCompensationExtractedCbox;
    }

    public FacultyAssignment100PutRequest withCriteriaSirnistCompensationExtractedCbox(String criteriaSirnistCompensationExtractedCbox) {
        this.criteriaSirnistCompensationExtractedCbox = criteriaSirnistCompensationExtractedCbox;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public String getOverRide() {
        return overRide;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public void setOverRide(String overRide) {
        this.overRide = overRide;
    }

    public FacultyAssignment100PutRequest withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.totalContact")
    public Double getCriteriaTotalContact() {
        return criteriaTotalContact;
    }

    /**
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.totalContact")
    public void setCriteriaTotalContact(Double criteriaTotalContact) {
        this.criteriaTotalContact = criteriaTotalContact;
    }

    public FacultyAssignment100PutRequest withCriteriaTotalContact(Double criteriaTotalContact) {
        this.criteriaTotalContact = criteriaTotalContact;
        return this;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public Double getNistWorkload() {
        return nistWorkload;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public void setNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
    }

    public FacultyAssignment100PutRequest withNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
        return this;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fte")
    public Double getCriteriaFte() {
        return criteriaFte;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fte")
    public void setCriteriaFte(Double criteriaFte) {
        this.criteriaFte = criteriaFte;
    }

    public FacultyAssignment100PutRequest withCriteriaFte(Double criteriaFte) {
        this.criteriaFte = criteriaFte;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nistDesc")
    public String getCriteriaNistDesc() {
        return criteriaNistDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.nistDesc")
    public void setCriteriaNistDesc(String criteriaNistDesc) {
        this.criteriaNistDesc = criteriaNistDesc;
    }

    public FacultyAssignment100PutRequest withCriteriaNistDesc(String criteriaNistDesc) {
        this.criteriaNistDesc = criteriaNistDesc;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("criteria.crn")
    public String getCriteriaCrn() {
        return criteriaCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("criteria.crn")
    public void setCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
    }

    public FacultyAssignment100PutRequest withCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
        return this;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.assignFte")
    public Double getCriteriaAssignFte() {
        return criteriaAssignFte;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.assignFte")
    public void setCriteriaAssignFte(Double criteriaAssignFte) {
        this.criteriaAssignFte = criteriaAssignFte;
    }

    public FacultyAssignment100PutRequest withCriteriaAssignFte(Double criteriaAssignFte) {
        this.criteriaAssignFte = criteriaAssignFte;
        return this;
    }

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentResponse")
    public Double getCriteriaPercentResponse() {
        return criteriaPercentResponse;
    }

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("criteria.percentResponse")
    public void setCriteriaPercentResponse(Double criteriaPercentResponse) {
        this.criteriaPercentResponse = criteriaPercentResponse;
    }

    public FacultyAssignment100PutRequest withCriteriaPercentResponse(Double criteriaPercentResponse) {
        this.criteriaPercentResponse = criteriaPercentResponse;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    public String getCriteriaPrimaryInd() {
        return criteriaPrimaryInd;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    public void setCriteriaPrimaryInd(String criteriaPrimaryInd) {
        this.criteriaPrimaryInd = criteriaPrimaryInd;
    }

    public FacultyAssignment100PutRequest withCriteriaPrimaryInd(String criteriaPrimaryInd) {
        this.criteriaPrimaryInd = criteriaPrimaryInd;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    public String getCriteriaOverRide() {
        return criteriaOverRide;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    public void setCriteriaOverRide(String criteriaOverRide) {
        this.criteriaOverRide = criteriaOverRide;
    }

    public FacultyAssignment100PutRequest withCriteriaOverRide(String criteriaOverRide) {
        this.criteriaOverRide = criteriaOverRide;
        return this;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("criteria.nistWorkload")
    public Double getCriteriaNistWorkload() {
        return criteriaNistWorkload;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("criteria.nistWorkload")
    public void setCriteriaNistWorkload(Double criteriaNistWorkload) {
        this.criteriaNistWorkload = criteriaNistWorkload;
    }

    public FacultyAssignment100PutRequest withCriteriaNistWorkload(Double criteriaNistWorkload) {
        this.criteriaNistWorkload = criteriaNistWorkload;
        return this;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("sirnistFcntCode")
    public String getSirnistFcntCode() {
        return sirnistFcntCode;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("sirnistFcntCode")
    public void setSirnistFcntCode(String sirnistFcntCode) {
        this.sirnistFcntCode = sirnistFcntCode;
    }

    public FacultyAssignment100PutRequest withSirnistFcntCode(String sirnistFcntCode) {
        this.sirnistFcntCode = sirnistFcntCode;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public FacultyAssignment100PutRequest withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public FacultyAssignment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSeqNumb");
        sb.append('=');
        sb.append(((this.criteriaSeqNumb == null)?"<null>":this.criteriaSeqNumb));
        sb.append(',');
        sb.append("criteriaSuff");
        sb.append('=');
        sb.append(((this.criteriaSuff == null)?"<null>":this.criteriaSuff));
        sb.append(',');
        sb.append("criteriaInstCred");
        sb.append('=');
        sb.append(((this.criteriaInstCred == null)?"<null>":this.criteriaInstCred));
        sb.append(',');
        sb.append("criteriaWeeklyHrs");
        sb.append('=');
        sb.append(((this.criteriaWeeklyHrs == null)?"<null>":this.criteriaWeeklyHrs));
        sb.append(',');
        sb.append("criteriaCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaCrseNumb == null)?"<null>":this.criteriaCrseNumb));
        sb.append(',');
        sb.append("criteriaWeeklyContact");
        sb.append('=');
        sb.append(((this.criteriaWeeklyContact == null)?"<null>":this.criteriaWeeklyContact));
        sb.append(',');
        sb.append("criteriaCompensationExtractedCbox");
        sb.append('=');
        sb.append(((this.criteriaCompensationExtractedCbox == null)?"<null>":this.criteriaCompensationExtractedCbox));
        sb.append(',');
        sb.append("nistCode");
        sb.append('=');
        sb.append(((this.nistCode == null)?"<null>":this.nistCode));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("criteriaGeneratedCredits");
        sb.append('=');
        sb.append(((this.criteriaGeneratedCredits == null)?"<null>":this.criteriaGeneratedCredits));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("criteriaAddInst");
        sb.append('=');
        sb.append(((this.criteriaAddInst == null)?"<null>":this.criteriaAddInst));
        sb.append(',');
        sb.append("criteriaCompensationAppliedCbox");
        sb.append('=');
        sb.append(((this.criteriaCompensationAppliedCbox == null)?"<null>":this.criteriaCompensationAppliedCbox));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaPosn");
        sb.append('=');
        sb.append(((this.criteriaPosn == null)?"<null>":this.criteriaPosn));
        sb.append(',');
        sb.append("criteriaCalcWorkload");
        sb.append('=');
        sb.append(((this.criteriaCalcWorkload == null)?"<null>":this.criteriaCalcWorkload));
        sb.append(',');
        sb.append("criteriaAstyCode");
        sb.append('=');
        sb.append(((this.criteriaAstyCode == null)?"<null>":this.criteriaAstyCode));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("criteriaSirnistCompensationAppliedCbox");
        sb.append('=');
        sb.append(((this.criteriaSirnistCompensationAppliedCbox == null)?"<null>":this.criteriaSirnistCompensationAppliedCbox));
        sb.append(',');
        sb.append("fcntCode");
        sb.append('=');
        sb.append(((this.fcntCode == null)?"<null>":this.fcntCode));
        sb.append(',');
        sb.append("criteriaWorkloadAdjust");
        sb.append('=');
        sb.append(((this.criteriaWorkloadAdjust == null)?"<null>":this.criteriaWorkloadAdjust));
        sb.append(',');
        sb.append("criteriaFcntCode");
        sb.append('=');
        sb.append(((this.criteriaFcntCode == null)?"<null>":this.criteriaFcntCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaPercentSess");
        sb.append('=');
        sb.append(((this.criteriaPercentSess == null)?"<null>":this.criteriaPercentSess));
        sb.append(',');
        sb.append("sirnistSuff");
        sb.append('=');
        sb.append(((this.sirnistSuff == null)?"<null>":this.sirnistSuff));
        sb.append(',');
        sb.append("criteriaTopsCode");
        sb.append('=');
        sb.append(((this.criteriaTopsCode == null)?"<null>":this.criteriaTopsCode));
        sb.append(',');
        sb.append("sirnistPosn");
        sb.append('=');
        sb.append(((this.sirnistPosn == null)?"<null>":this.sirnistPosn));
        sb.append(',');
        sb.append("criteriaSirnistPosn");
        sb.append('=');
        sb.append(((this.criteriaSirnistPosn == null)?"<null>":this.criteriaSirnistPosn));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("criteriaSessHrs");
        sb.append('=');
        sb.append(((this.criteriaSessHrs == null)?"<null>":this.criteriaSessHrs));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
        sb.append(',');
        sb.append("astyCode");
        sb.append('=');
        sb.append(((this.astyCode == null)?"<null>":this.astyCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("workloadAdjust");
        sb.append('=');
        sb.append(((this.workloadAdjust == null)?"<null>":this.workloadAdjust));
        sb.append(',');
        sb.append("sirnistAstyCode");
        sb.append('=');
        sb.append(((this.sirnistAstyCode == null)?"<null>":this.sirnistAstyCode));
        sb.append(',');
        sb.append("criteriaSirnistFcntCode");
        sb.append('=');
        sb.append(((this.criteriaSirnistFcntCode == null)?"<null>":this.criteriaSirnistFcntCode));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("criteriaCategory");
        sb.append('=');
        sb.append(((this.criteriaCategory == null)?"<null>":this.criteriaCategory));
        sb.append(',');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("weeklyHrs");
        sb.append('=');
        sb.append(((this.weeklyHrs == null)?"<null>":this.weeklyHrs));
        sb.append(',');
        sb.append("criteriaNistCode");
        sb.append('=');
        sb.append(((this.criteriaNistCode == null)?"<null>":this.criteriaNistCode));
        sb.append(',');
        sb.append("criteriaWorkload");
        sb.append('=');
        sb.append(((this.criteriaWorkload == null)?"<null>":this.criteriaWorkload));
        sb.append(',');
        sb.append("criteriaSirnistAstyCode");
        sb.append('=');
        sb.append(((this.criteriaSirnistAstyCode == null)?"<null>":this.criteriaSirnistAstyCode));
        sb.append(',');
        sb.append("criteriaSirnistCompensationExtractedCbox");
        sb.append('=');
        sb.append(((this.criteriaSirnistCompensationExtractedCbox == null)?"<null>":this.criteriaSirnistCompensationExtractedCbox));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("criteriaTotalContact");
        sb.append('=');
        sb.append(((this.criteriaTotalContact == null)?"<null>":this.criteriaTotalContact));
        sb.append(',');
        sb.append("nistWorkload");
        sb.append('=');
        sb.append(((this.nistWorkload == null)?"<null>":this.nistWorkload));
        sb.append(',');
        sb.append("criteriaFte");
        sb.append('=');
        sb.append(((this.criteriaFte == null)?"<null>":this.criteriaFte));
        sb.append(',');
        sb.append("criteriaNistDesc");
        sb.append('=');
        sb.append(((this.criteriaNistDesc == null)?"<null>":this.criteriaNistDesc));
        sb.append(',');
        sb.append("criteriaCrn");
        sb.append('=');
        sb.append(((this.criteriaCrn == null)?"<null>":this.criteriaCrn));
        sb.append(',');
        sb.append("criteriaAssignFte");
        sb.append('=');
        sb.append(((this.criteriaAssignFte == null)?"<null>":this.criteriaAssignFte));
        sb.append(',');
        sb.append("criteriaPercentResponse");
        sb.append('=');
        sb.append(((this.criteriaPercentResponse == null)?"<null>":this.criteriaPercentResponse));
        sb.append(',');
        sb.append("criteriaPrimaryInd");
        sb.append('=');
        sb.append(((this.criteriaPrimaryInd == null)?"<null>":this.criteriaPrimaryInd));
        sb.append(',');
        sb.append("criteriaOverRide");
        sb.append('=');
        sb.append(((this.criteriaOverRide == null)?"<null>":this.criteriaOverRide));
        sb.append(',');
        sb.append("criteriaNistWorkload");
        sb.append('=');
        sb.append(((this.criteriaNistWorkload == null)?"<null>":this.criteriaNistWorkload));
        sb.append(',');
        sb.append("sirnistFcntCode");
        sb.append('=');
        sb.append(((this.sirnistFcntCode == null)?"<null>":this.sirnistFcntCode));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.criteriaTotalContact == null)? 0 :this.criteriaTotalContact.hashCode()));
        result = ((result* 31)+((this.nistCode == null)? 0 :this.nistCode.hashCode()));
        result = ((result* 31)+((this.criteriaAstyCode == null)? 0 :this.criteriaAstyCode.hashCode()));
        result = ((result* 31)+((this.criteriaCompensationAppliedCbox == null)? 0 :this.criteriaCompensationAppliedCbox.hashCode()));
        result = ((result* 31)+((this.criteriaWeeklyHrs == null)? 0 :this.criteriaWeeklyHrs.hashCode()));
        result = ((result* 31)+((this.criteriaFcntCode == null)? 0 :this.criteriaFcntCode.hashCode()));
        result = ((result* 31)+((this.criteriaSessHrs == null)? 0 :this.criteriaSessHrs.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.criteriaSuff == null)? 0 :this.criteriaSuff.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaSirnistFcntCode == null)? 0 :this.criteriaSirnistFcntCode.hashCode()));
        result = ((result* 31)+((this.criteriaWorkload == null)? 0 :this.criteriaWorkload.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.criteriaSirnistPosn == null)? 0 :this.criteriaSirnistPosn.hashCode()));
        result = ((result* 31)+((this.fcntCode == null)? 0 :this.fcntCode.hashCode()));
        result = ((result* 31)+((this.criteriaPosn == null)? 0 :this.criteriaPosn.hashCode()));
        result = ((result* 31)+((this.criteriaPercentSess == null)? 0 :this.criteriaPercentSess.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaPercentResponse == null)? 0 :this.criteriaPercentResponse.hashCode()));
        result = ((result* 31)+((this.criteriaCategory == null)? 0 :this.criteriaCategory.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNumb == null)? 0 :this.criteriaSeqNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSirnistCompensationExtractedCbox == null)? 0 :this.criteriaSirnistCompensationExtractedCbox.hashCode()));
        result = ((result* 31)+((this.sirnistSuff == null)? 0 :this.sirnistSuff.hashCode()));
        result = ((result* 31)+((this.criteriaNistDesc == null)? 0 :this.criteriaNistDesc.hashCode()));
        result = ((result* 31)+((this.sirnistPosn == null)? 0 :this.sirnistPosn.hashCode()));
        result = ((result* 31)+((this.criteriaOverRide == null)? 0 :this.criteriaOverRide.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaWeeklyContact == null)? 0 :this.criteriaWeeklyContact.hashCode()));
        result = ((result* 31)+((this.criteriaPrimaryInd == null)? 0 :this.criteriaPrimaryInd.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.astyCode == null)? 0 :this.astyCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.percentResponse == null)? 0 :this.percentResponse.hashCode()));
        result = ((result* 31)+((this.criteriaAddInst == null)? 0 :this.criteriaAddInst.hashCode()));
        result = ((result* 31)+((this.criteriaSirnistCompensationAppliedCbox == null)? 0 :this.criteriaSirnistCompensationAppliedCbox.hashCode()));
        result = ((result* 31)+((this.workloadAdjust == null)? 0 :this.workloadAdjust.hashCode()));
        result = ((result* 31)+((this.sirnistAstyCode == null)? 0 :this.sirnistAstyCode.hashCode()));
        result = ((result* 31)+((this.criteriaNistCode == null)? 0 :this.criteriaNistCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.weeklyHrs == null)? 0 :this.weeklyHrs.hashCode()));
        result = ((result* 31)+((this.criteriaAssignFte == null)? 0 :this.criteriaAssignFte.hashCode()));
        result = ((result* 31)+((this.criteriaWorkloadAdjust == null)? 0 :this.criteriaWorkloadAdjust.hashCode()));
        result = ((result* 31)+((this.criteriaGeneratedCredits == null)? 0 :this.criteriaGeneratedCredits.hashCode()));
        result = ((result* 31)+((this.criteriaCompensationExtractedCbox == null)? 0 :this.criteriaCompensationExtractedCbox.hashCode()));
        result = ((result* 31)+((this.criteriaCalcWorkload == null)? 0 :this.criteriaCalcWorkload.hashCode()));
        result = ((result* 31)+((this.criteriaInstCred == null)? 0 :this.criteriaInstCred.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.criteriaSirnistAstyCode == null)? 0 :this.criteriaSirnistAstyCode.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.nistWorkload == null)? 0 :this.nistWorkload.hashCode()));
        result = ((result* 31)+((this.criteriaFte == null)? 0 :this.criteriaFte.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaTopsCode == null)? 0 :this.criteriaTopsCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaNistWorkload == null)? 0 :this.criteriaNistWorkload.hashCode()));
        result = ((result* 31)+((this.sirnistFcntCode == null)? 0 :this.sirnistFcntCode.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAssignment100PutRequest) == false) {
            return false;
        }
        FacultyAssignment100PutRequest rhs = ((FacultyAssignment100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaTotalContact == rhs.criteriaTotalContact)||((this.criteriaTotalContact!= null)&&this.criteriaTotalContact.equals(rhs.criteriaTotalContact)))&&((this.nistCode == rhs.nistCode)||((this.nistCode!= null)&&this.nistCode.equals(rhs.nistCode))))&&((this.criteriaAstyCode == rhs.criteriaAstyCode)||((this.criteriaAstyCode!= null)&&this.criteriaAstyCode.equals(rhs.criteriaAstyCode))))&&((this.criteriaCompensationAppliedCbox == rhs.criteriaCompensationAppliedCbox)||((this.criteriaCompensationAppliedCbox!= null)&&this.criteriaCompensationAppliedCbox.equals(rhs.criteriaCompensationAppliedCbox))))&&((this.criteriaWeeklyHrs == rhs.criteriaWeeklyHrs)||((this.criteriaWeeklyHrs!= null)&&this.criteriaWeeklyHrs.equals(rhs.criteriaWeeklyHrs))))&&((this.criteriaFcntCode == rhs.criteriaFcntCode)||((this.criteriaFcntCode!= null)&&this.criteriaFcntCode.equals(rhs.criteriaFcntCode))))&&((this.criteriaSessHrs == rhs.criteriaSessHrs)||((this.criteriaSessHrs!= null)&&this.criteriaSessHrs.equals(rhs.criteriaSessHrs))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.criteriaSuff == rhs.criteriaSuff)||((this.criteriaSuff!= null)&&this.criteriaSuff.equals(rhs.criteriaSuff))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaSirnistFcntCode == rhs.criteriaSirnistFcntCode)||((this.criteriaSirnistFcntCode!= null)&&this.criteriaSirnistFcntCode.equals(rhs.criteriaSirnistFcntCode))))&&((this.criteriaWorkload == rhs.criteriaWorkload)||((this.criteriaWorkload!= null)&&this.criteriaWorkload.equals(rhs.criteriaWorkload))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.criteriaSirnistPosn == rhs.criteriaSirnistPosn)||((this.criteriaSirnistPosn!= null)&&this.criteriaSirnistPosn.equals(rhs.criteriaSirnistPosn))))&&((this.fcntCode == rhs.fcntCode)||((this.fcntCode!= null)&&this.fcntCode.equals(rhs.fcntCode))))&&((this.criteriaPosn == rhs.criteriaPosn)||((this.criteriaPosn!= null)&&this.criteriaPosn.equals(rhs.criteriaPosn))))&&((this.criteriaPercentSess == rhs.criteriaPercentSess)||((this.criteriaPercentSess!= null)&&this.criteriaPercentSess.equals(rhs.criteriaPercentSess))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaPercentResponse == rhs.criteriaPercentResponse)||((this.criteriaPercentResponse!= null)&&this.criteriaPercentResponse.equals(rhs.criteriaPercentResponse))))&&((this.criteriaCategory == rhs.criteriaCategory)||((this.criteriaCategory!= null)&&this.criteriaCategory.equals(rhs.criteriaCategory))))&&((this.criteriaSeqNumb == rhs.criteriaSeqNumb)||((this.criteriaSeqNumb!= null)&&this.criteriaSeqNumb.equals(rhs.criteriaSeqNumb))))&&((this.criteriaSirnistCompensationExtractedCbox == rhs.criteriaSirnistCompensationExtractedCbox)||((this.criteriaSirnistCompensationExtractedCbox!= null)&&this.criteriaSirnistCompensationExtractedCbox.equals(rhs.criteriaSirnistCompensationExtractedCbox))))&&((this.sirnistSuff == rhs.sirnistSuff)||((this.sirnistSuff!= null)&&this.sirnistSuff.equals(rhs.sirnistSuff))))&&((this.criteriaNistDesc == rhs.criteriaNistDesc)||((this.criteriaNistDesc!= null)&&this.criteriaNistDesc.equals(rhs.criteriaNistDesc))))&&((this.sirnistPosn == rhs.sirnistPosn)||((this.sirnistPosn!= null)&&this.sirnistPosn.equals(rhs.sirnistPosn))))&&((this.criteriaOverRide == rhs.criteriaOverRide)||((this.criteriaOverRide!= null)&&this.criteriaOverRide.equals(rhs.criteriaOverRide))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaWeeklyContact == rhs.criteriaWeeklyContact)||((this.criteriaWeeklyContact!= null)&&this.criteriaWeeklyContact.equals(rhs.criteriaWeeklyContact))))&&((this.criteriaPrimaryInd == rhs.criteriaPrimaryInd)||((this.criteriaPrimaryInd!= null)&&this.criteriaPrimaryInd.equals(rhs.criteriaPrimaryInd))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.astyCode == rhs.astyCode)||((this.astyCode!= null)&&this.astyCode.equals(rhs.astyCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse))))&&((this.criteriaAddInst == rhs.criteriaAddInst)||((this.criteriaAddInst!= null)&&this.criteriaAddInst.equals(rhs.criteriaAddInst))))&&((this.criteriaSirnistCompensationAppliedCbox == rhs.criteriaSirnistCompensationAppliedCbox)||((this.criteriaSirnistCompensationAppliedCbox!= null)&&this.criteriaSirnistCompensationAppliedCbox.equals(rhs.criteriaSirnistCompensationAppliedCbox))))&&((this.workloadAdjust == rhs.workloadAdjust)||((this.workloadAdjust!= null)&&this.workloadAdjust.equals(rhs.workloadAdjust))))&&((this.sirnistAstyCode == rhs.sirnistAstyCode)||((this.sirnistAstyCode!= null)&&this.sirnistAstyCode.equals(rhs.sirnistAstyCode))))&&((this.criteriaNistCode == rhs.criteriaNistCode)||((this.criteriaNistCode!= null)&&this.criteriaNistCode.equals(rhs.criteriaNistCode))))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))))&&((this.weeklyHrs == rhs.weeklyHrs)||((this.weeklyHrs!= null)&&this.weeklyHrs.equals(rhs.weeklyHrs))))&&((this.criteriaAssignFte == rhs.criteriaAssignFte)||((this.criteriaAssignFte!= null)&&this.criteriaAssignFte.equals(rhs.criteriaAssignFte))))&&((this.criteriaWorkloadAdjust == rhs.criteriaWorkloadAdjust)||((this.criteriaWorkloadAdjust!= null)&&this.criteriaWorkloadAdjust.equals(rhs.criteriaWorkloadAdjust))))&&((this.criteriaGeneratedCredits == rhs.criteriaGeneratedCredits)||((this.criteriaGeneratedCredits!= null)&&this.criteriaGeneratedCredits.equals(rhs.criteriaGeneratedCredits))))&&((this.criteriaCompensationExtractedCbox == rhs.criteriaCompensationExtractedCbox)||((this.criteriaCompensationExtractedCbox!= null)&&this.criteriaCompensationExtractedCbox.equals(rhs.criteriaCompensationExtractedCbox))))&&((this.criteriaCalcWorkload == rhs.criteriaCalcWorkload)||((this.criteriaCalcWorkload!= null)&&this.criteriaCalcWorkload.equals(rhs.criteriaCalcWorkload))))&&((this.criteriaInstCred == rhs.criteriaInstCred)||((this.criteriaInstCred!= null)&&this.criteriaInstCred.equals(rhs.criteriaInstCred))))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.criteriaSirnistAstyCode == rhs.criteriaSirnistAstyCode)||((this.criteriaSirnistAstyCode!= null)&&this.criteriaSirnistAstyCode.equals(rhs.criteriaSirnistAstyCode))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.nistWorkload == rhs.nistWorkload)||((this.nistWorkload!= null)&&this.nistWorkload.equals(rhs.nistWorkload))))&&((this.criteriaFte == rhs.criteriaFte)||((this.criteriaFte!= null)&&this.criteriaFte.equals(rhs.criteriaFte))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaTopsCode == rhs.criteriaTopsCode)||((this.criteriaTopsCode!= null)&&this.criteriaTopsCode.equals(rhs.criteriaTopsCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaNistWorkload == rhs.criteriaNistWorkload)||((this.criteriaNistWorkload!= null)&&this.criteriaNistWorkload.equals(rhs.criteriaNistWorkload))))&&((this.sirnistFcntCode == rhs.sirnistFcntCode)||((this.sirnistFcntCode!= null)&&this.sirnistFcntCode.equals(rhs.sirnistFcntCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
