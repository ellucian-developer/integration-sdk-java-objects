
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substituitions_substitutions.v1_0_0;

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
    "area",
    "criteria.program",
    "criteria.actnCode",
    "keyblckTermCode",
    "program",
    "criteria.attrCodeReq",
    "subjCodeReq",
    "criteria.crseNumbReq",
    "attrCodeSub",
    "criteria.attrCodeSub",
    "actnCode",
    "attrCodeReq",
    "crseNumbReq",
    "credits",
    "criteria.group",
    "criteria.crseNumbSub",
    "criteria.area",
    "crseNumbSub",
    "id",
    "criteria.subjCodeSub",
    "criteria.subjCodeReq",
    "criteria.credits",
    "subjCodeSub",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest {

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_AREA")
    private String area;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SMRSSPV_PROGRAM")
    private String criteriaProgram;
    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String criteriaActnCode;
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
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSSPV_PROGRAM")
    private String program;
    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr")
    private String criteriaAttrCodeReq;
    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj")
    private String subjCodeReq;
    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_REQ")
    private String criteriaCrseNumbReq;
    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr")
    private String attrCodeSub;
    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr")
    private String criteriaAttrCodeSub;
    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String actnCode;
    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr")
    private String attrCodeReq;
    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_REQ")
    private String crseNumbReq;
    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CREDITS")
    private Double credits;
    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_GROUP")
    private String criteriaGroup;
    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_SUB")
    private String criteriaCrseNumbSub;
    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_AREA")
    private String criteriaArea;
    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_SUB")
    private String crseNumbSub;
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
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCodeSub;
    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCodeReq;
    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CREDITS")
    private Double criteriaCredits;
    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj")
    private String subjCodeSub;
    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_GROUP")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    public String getCriteriaActnCode() {
        return criteriaActnCode;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    public void setCriteriaActnCode(String criteriaActnCode) {
        this.criteriaActnCode = criteriaActnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaActnCode(String criteriaActnCode) {
        this.criteriaActnCode = criteriaActnCode;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeReq")
    public String getCriteriaAttrCodeReq() {
        return criteriaAttrCodeReq;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeReq")
    public void setCriteriaAttrCodeReq(String criteriaAttrCodeReq) {
        this.criteriaAttrCodeReq = criteriaAttrCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaAttrCodeReq(String criteriaAttrCodeReq) {
        this.criteriaAttrCodeReq = criteriaAttrCodeReq;
        return this;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    public String getSubjCodeReq() {
        return subjCodeReq;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    public void setSubjCodeReq(String subjCodeReq) {
        this.subjCodeReq = subjCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withSubjCodeReq(String subjCodeReq) {
        this.subjCodeReq = subjCodeReq;
        return this;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbReq")
    public String getCriteriaCrseNumbReq() {
        return criteriaCrseNumbReq;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbReq")
    public void setCriteriaCrseNumbReq(String criteriaCrseNumbReq) {
        this.criteriaCrseNumbReq = criteriaCrseNumbReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaCrseNumbReq(String criteriaCrseNumbReq) {
        this.criteriaCrseNumbReq = criteriaCrseNumbReq;
        return this;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    public String getAttrCodeSub() {
        return attrCodeSub;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    public void setAttrCodeSub(String attrCodeSub) {
        this.attrCodeSub = attrCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withAttrCodeSub(String attrCodeSub) {
        this.attrCodeSub = attrCodeSub;
        return this;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeSub")
    public String getCriteriaAttrCodeSub() {
        return criteriaAttrCodeSub;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCodeSub")
    public void setCriteriaAttrCodeSub(String criteriaAttrCodeSub) {
        this.criteriaAttrCodeSub = criteriaAttrCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaAttrCodeSub(String criteriaAttrCodeSub) {
        this.criteriaAttrCodeSub = criteriaAttrCodeSub;
        return this;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public String getActnCode() {
        return actnCode;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public void setActnCode(String actnCode) {
        this.actnCode = actnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withActnCode(String actnCode) {
        this.actnCode = actnCode;
        return this;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    public String getAttrCodeReq() {
        return attrCodeReq;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    public void setAttrCodeReq(String attrCodeReq) {
        this.attrCodeReq = attrCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withAttrCodeReq(String attrCodeReq) {
        this.attrCodeReq = attrCodeReq;
        return this;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    public String getCrseNumbReq() {
        return crseNumbReq;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    public void setCrseNumbReq(String crseNumbReq) {
        this.crseNumbReq = crseNumbReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCrseNumbReq(String crseNumbReq) {
        this.crseNumbReq = crseNumbReq;
        return this;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    public Double getCredits() {
        return credits;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCredits(Double credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public String getCriteriaGroup() {
        return criteriaGroup;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public void setCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
        return this;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbSub")
    public String getCriteriaCrseNumbSub() {
        return criteriaCrseNumbSub;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbSub")
    public void setCriteriaCrseNumbSub(String criteriaCrseNumbSub) {
        this.criteriaCrseNumbSub = criteriaCrseNumbSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaCrseNumbSub(String criteriaCrseNumbSub) {
        this.criteriaCrseNumbSub = criteriaCrseNumbSub;
        return this;
    }

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public String getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
        return this;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    public String getCrseNumbSub() {
        return crseNumbSub;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    public void setCrseNumbSub(String crseNumbSub) {
        this.crseNumbSub = crseNumbSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCrseNumbSub(String crseNumbSub) {
        this.crseNumbSub = crseNumbSub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeSub")
    public String getCriteriaSubjCodeSub() {
        return criteriaSubjCodeSub;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeSub")
    public void setCriteriaSubjCodeSub(String criteriaSubjCodeSub) {
        this.criteriaSubjCodeSub = criteriaSubjCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaSubjCodeSub(String criteriaSubjCodeSub) {
        this.criteriaSubjCodeSub = criteriaSubjCodeSub;
        return this;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeReq")
    public String getCriteriaSubjCodeReq() {
        return criteriaSubjCodeReq;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeReq")
    public void setCriteriaSubjCodeReq(String criteriaSubjCodeReq) {
        this.criteriaSubjCodeReq = criteriaSubjCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaSubjCodeReq(String criteriaSubjCodeReq) {
        this.criteriaSubjCodeReq = criteriaSubjCodeReq;
        return this;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    public Double getCriteriaCredits() {
        return criteriaCredits;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    public void setCriteriaCredits(Double criteriaCredits) {
        this.criteriaCredits = criteriaCredits;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withCriteriaCredits(Double criteriaCredits) {
        this.criteriaCredits = criteriaCredits;
        return this;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    public String getSubjCodeSub() {
        return subjCodeSub;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    public void setSubjCodeSub(String subjCodeSub) {
        this.subjCodeSub = subjCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withSubjCodeSub(String subjCodeSub) {
        this.subjCodeSub = subjCodeSub;
        return this;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withGroup(String group) {
        this.group = group;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("criteriaActnCode");
        sb.append('=');
        sb.append(((this.criteriaActnCode == null)?"<null>":this.criteriaActnCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("criteriaAttrCodeReq");
        sb.append('=');
        sb.append(((this.criteriaAttrCodeReq == null)?"<null>":this.criteriaAttrCodeReq));
        sb.append(',');
        sb.append("subjCodeReq");
        sb.append('=');
        sb.append(((this.subjCodeReq == null)?"<null>":this.subjCodeReq));
        sb.append(',');
        sb.append("criteriaCrseNumbReq");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbReq == null)?"<null>":this.criteriaCrseNumbReq));
        sb.append(',');
        sb.append("attrCodeSub");
        sb.append('=');
        sb.append(((this.attrCodeSub == null)?"<null>":this.attrCodeSub));
        sb.append(',');
        sb.append("criteriaAttrCodeSub");
        sb.append('=');
        sb.append(((this.criteriaAttrCodeSub == null)?"<null>":this.criteriaAttrCodeSub));
        sb.append(',');
        sb.append("actnCode");
        sb.append('=');
        sb.append(((this.actnCode == null)?"<null>":this.actnCode));
        sb.append(',');
        sb.append("attrCodeReq");
        sb.append('=');
        sb.append(((this.attrCodeReq == null)?"<null>":this.attrCodeReq));
        sb.append(',');
        sb.append("crseNumbReq");
        sb.append('=');
        sb.append(((this.crseNumbReq == null)?"<null>":this.crseNumbReq));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("criteriaGroup");
        sb.append('=');
        sb.append(((this.criteriaGroup == null)?"<null>":this.criteriaGroup));
        sb.append(',');
        sb.append("criteriaCrseNumbSub");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbSub == null)?"<null>":this.criteriaCrseNumbSub));
        sb.append(',');
        sb.append("criteriaArea");
        sb.append('=');
        sb.append(((this.criteriaArea == null)?"<null>":this.criteriaArea));
        sb.append(',');
        sb.append("crseNumbSub");
        sb.append('=');
        sb.append(((this.crseNumbSub == null)?"<null>":this.crseNumbSub));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSubjCodeSub");
        sb.append('=');
        sb.append(((this.criteriaSubjCodeSub == null)?"<null>":this.criteriaSubjCodeSub));
        sb.append(',');
        sb.append("criteriaSubjCodeReq");
        sb.append('=');
        sb.append(((this.criteriaSubjCodeReq == null)?"<null>":this.criteriaSubjCodeReq));
        sb.append(',');
        sb.append("criteriaCredits");
        sb.append('=');
        sb.append(((this.criteriaCredits == null)?"<null>":this.criteriaCredits));
        sb.append(',');
        sb.append("subjCodeSub");
        sb.append('=');
        sb.append(((this.subjCodeSub == null)?"<null>":this.subjCodeSub));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.criteriaSubjCodeReq == null)? 0 :this.criteriaSubjCodeReq.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.criteriaCredits == null)? 0 :this.criteriaCredits.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.attrCodeReq == null)? 0 :this.attrCodeReq.hashCode()));
        result = ((result* 31)+((this.criteriaGroup == null)? 0 :this.criteriaGroup.hashCode()));
        result = ((result* 31)+((this.crseNumbReq == null)? 0 :this.crseNumbReq.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaAttrCodeReq == null)? 0 :this.criteriaAttrCodeReq.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbReq == null)? 0 :this.criteriaCrseNumbReq.hashCode()));
        result = ((result* 31)+((this.subjCodeSub == null)? 0 :this.subjCodeSub.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.criteriaArea == null)? 0 :this.criteriaArea.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodeSub == null)? 0 :this.criteriaSubjCodeSub.hashCode()));
        result = ((result* 31)+((this.criteriaActnCode == null)? 0 :this.criteriaActnCode.hashCode()));
        result = ((result* 31)+((this.subjCodeReq == null)? 0 :this.subjCodeReq.hashCode()));
        result = ((result* 31)+((this.attrCodeSub == null)? 0 :this.attrCodeSub.hashCode()));
        result = ((result* 31)+((this.crseNumbSub == null)? 0 :this.crseNumbSub.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbSub == null)? 0 :this.criteriaCrseNumbSub.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAttrCodeSub == null)? 0 :this.criteriaAttrCodeSub.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest rhs = ((StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PutRequest) other);
        return ((((((((((((((((((((((((((this.criteriaSubjCodeReq == rhs.criteriaSubjCodeReq)||((this.criteriaSubjCodeReq!= null)&&this.criteriaSubjCodeReq.equals(rhs.criteriaSubjCodeReq)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.criteriaCredits == rhs.criteriaCredits)||((this.criteriaCredits!= null)&&this.criteriaCredits.equals(rhs.criteriaCredits))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.attrCodeReq == rhs.attrCodeReq)||((this.attrCodeReq!= null)&&this.attrCodeReq.equals(rhs.attrCodeReq))))&&((this.criteriaGroup == rhs.criteriaGroup)||((this.criteriaGroup!= null)&&this.criteriaGroup.equals(rhs.criteriaGroup))))&&((this.crseNumbReq == rhs.crseNumbReq)||((this.crseNumbReq!= null)&&this.crseNumbReq.equals(rhs.crseNumbReq))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaAttrCodeReq == rhs.criteriaAttrCodeReq)||((this.criteriaAttrCodeReq!= null)&&this.criteriaAttrCodeReq.equals(rhs.criteriaAttrCodeReq))))&&((this.criteriaCrseNumbReq == rhs.criteriaCrseNumbReq)||((this.criteriaCrseNumbReq!= null)&&this.criteriaCrseNumbReq.equals(rhs.criteriaCrseNumbReq))))&&((this.subjCodeSub == rhs.subjCodeSub)||((this.subjCodeSub!= null)&&this.subjCodeSub.equals(rhs.subjCodeSub))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaSubjCodeSub == rhs.criteriaSubjCodeSub)||((this.criteriaSubjCodeSub!= null)&&this.criteriaSubjCodeSub.equals(rhs.criteriaSubjCodeSub))))&&((this.criteriaActnCode == rhs.criteriaActnCode)||((this.criteriaActnCode!= null)&&this.criteriaActnCode.equals(rhs.criteriaActnCode))))&&((this.subjCodeReq == rhs.subjCodeReq)||((this.subjCodeReq!= null)&&this.subjCodeReq.equals(rhs.subjCodeReq))))&&((this.attrCodeSub == rhs.attrCodeSub)||((this.attrCodeSub!= null)&&this.attrCodeSub.equals(rhs.attrCodeSub))))&&((this.crseNumbSub == rhs.crseNumbSub)||((this.crseNumbSub!= null)&&this.crseNumbSub.equals(rhs.crseNumbSub))))&&((this.criteriaCrseNumbSub == rhs.criteriaCrseNumbSub)||((this.criteriaCrseNumbSub!= null)&&this.criteriaCrseNumbSub.equals(rhs.criteriaCrseNumbSub))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAttrCodeSub == rhs.criteriaAttrCodeSub)||((this.criteriaAttrCodeSub!= null)&&this.criteriaAttrCodeSub.equals(rhs.criteriaAttrCodeSub))));
    }

}
