
package com.ellucian.generated.bpapi.ban.registration_permit_overrides_control.v1_0_0;

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
    "criteria.chrtOver",
    "criteria.activityDate",
    "criteria.degcOver",
    "keyblocTermCode",
    "criteria.preqOver",
    "criteria.rovrCode",
    "criteria.capcOver",
    "criteria.linkOver",
    "criteria.mexcOver",
    "criteria.campOver",
    "criteria.progOver",
    "criteria.apprOver",
    "criteria.corqOver",
    "criteria.rovrDesc",
    "preqOver",
    "criteria.collOver",
    "criteria.deptOver",
    "xxxxxxxTermCodeDef",
    "criteria.clasOver",
    "criteria.duplOver",
    "criteria.levlOver",
    "criteria.majrOver",
    "criteria.timeOver",
    "criteria.rpthOver",
    "criteria.reptOver",
    "criteria.attsOver"
})
@Generated("jsonschema2pojo")
public class RegistrationPermitOverridesControl100PutRequest {

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRROVR_CHRT_OVER
     * 
     */
    @JsonProperty("criteria.chrtOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_CHRT_OVER")
    private String criteriaChrtOver;
    /**
     * Lineage reference object : SFRROVR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Degree
     * <p>
     * Lineage reference object : SFRROVR_DEGC_OVER
     * 
     */
    @JsonProperty("criteria.degcOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_DEGC_OVER")
    private String criteriaDegcOver;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("criteria.preqOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_PREQ_OVER")
    private String criteriaPreqOver;
    /**
     * Permit Code
     * <p>
     * Lineage reference object : SFRROVR_ROVR_CODE, Lookup lineage reference object : stvrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.rovrCode")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_ROVR_CODE, Lookup lineage reference object : stvrovr")
    private String criteriaRovrCode;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRROVR_CAPC_OVER
     * 
     */
    @JsonProperty("criteria.capcOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_CAPC_OVER")
    private String criteriaCapcOver;
    /**
     * Links
     * <p>
     * Lineage reference object : SFRROVR_LINK_OVER
     * 
     */
    @JsonProperty("criteria.linkOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_LINK_OVER")
    private String criteriaLinkOver;
    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SFRROVR_MEXC_OVER
     * 
     */
    @JsonProperty("criteria.mexcOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_MEXC_OVER")
    private String criteriaMexcOver;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRROVR_CAMP_OVER
     * 
     */
    @JsonProperty("criteria.campOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_CAMP_OVER")
    private String criteriaCampOver;
    /**
     * Program
     * <p>
     * Lineage reference object : SFRROVR_PROG_OVER
     * 
     */
    @JsonProperty("criteria.progOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_PROG_OVER")
    private String criteriaProgOver;
    /**
     * Special Approval
     * <p>
     * Lineage reference object : SFRROVR_APPR_OVER
     * 
     */
    @JsonProperty("criteria.apprOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_APPR_OVER")
    private String criteriaApprOver;
    /**
     * Co-requisite
     * <p>
     * Lineage reference object : SFRROVR_CORQ_OVER
     * 
     */
    @JsonProperty("criteria.corqOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_CORQ_OVER")
    private String criteriaCorqOver;
    /**
     * Permit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.rovrDesc")
    private String criteriaRovrDesc;
    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_PREQ_OVER")
    private String preqOver;
    /**
     * College
     * <p>
     * Lineage reference object : SFRROVR_COLL_OVER
     * 
     */
    @JsonProperty("criteria.collOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_COLL_OVER")
    private String criteriaCollOver;
    /**
     * Department
     * <p>
     * Lineage reference object : SFRROVR_DEPT_OVER
     * 
     */
    @JsonProperty("criteria.deptOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_DEPT_OVER")
    private String criteriaDeptOver;
    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCodedef, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCodeDef;
    /**
     * Class
     * <p>
     * Lineage reference object : SFRROVR_CLAS_OVER
     * 
     */
    @JsonProperty("criteria.clasOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_CLAS_OVER")
    private String criteriaClasOver;
    /**
     * Duplicates
     * <p>
     * Lineage reference object : SFRROVR_DUPL_OVER
     * 
     */
    @JsonProperty("criteria.duplOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_DUPL_OVER")
    private String criteriaDuplOver;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRROVR_LEVL_OVER
     * 
     */
    @JsonProperty("criteria.levlOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_LEVL_OVER")
    private String criteriaLevlOver;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRROVR_MAJR_OVER
     * 
     */
    @JsonProperty("criteria.majrOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_MAJR_OVER")
    private String criteriaMajrOver;
    /**
     * Time
     * <p>
     * Lineage reference object : SFRROVR_TIME_OVER
     * 
     */
    @JsonProperty("criteria.timeOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_TIME_OVER")
    private String criteriaTimeOver;
    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRROVR_RPTH_OVER
     * 
     */
    @JsonProperty("criteria.rpthOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_RPTH_OVER")
    private String criteriaRpthOver;
    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRROVR_REPT_OVER
     * 
     */
    @JsonProperty("criteria.reptOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_REPT_OVER")
    private String criteriaReptOver;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRROVR_ATTS_OVER
     * 
     */
    @JsonProperty("criteria.attsOver")
    @JsonPropertyDescription("Lineage reference object : SFRROVR_ATTS_OVER")
    private String criteriaAttsOver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRROVR_CHRT_OVER
     * 
     */
    @JsonProperty("criteria.chrtOver")
    public String getCriteriaChrtOver() {
        return criteriaChrtOver;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRROVR_CHRT_OVER
     * 
     */
    @JsonProperty("criteria.chrtOver")
    public void setCriteriaChrtOver(String criteriaChrtOver) {
        this.criteriaChrtOver = criteriaChrtOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaChrtOver(String criteriaChrtOver) {
        this.criteriaChrtOver = criteriaChrtOver;
        return this;
    }

    /**
     * Lineage reference object : SFRROVR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SFRROVR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRROVR_DEGC_OVER
     * 
     */
    @JsonProperty("criteria.degcOver")
    public String getCriteriaDegcOver() {
        return criteriaDegcOver;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRROVR_DEGC_OVER
     * 
     */
    @JsonProperty("criteria.degcOver")
    public void setCriteriaDegcOver(String criteriaDegcOver) {
        this.criteriaDegcOver = criteriaDegcOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaDegcOver(String criteriaDegcOver) {
        this.criteriaDegcOver = criteriaDegcOver;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public RegistrationPermitOverridesControl100PutRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("criteria.preqOver")
    public String getCriteriaPreqOver() {
        return criteriaPreqOver;
    }

    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("criteria.preqOver")
    public void setCriteriaPreqOver(String criteriaPreqOver) {
        this.criteriaPreqOver = criteriaPreqOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaPreqOver(String criteriaPreqOver) {
        this.criteriaPreqOver = criteriaPreqOver;
        return this;
    }

    /**
     * Permit Code
     * <p>
     * Lineage reference object : SFRROVR_ROVR_CODE, Lookup lineage reference object : stvrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.rovrCode")
    public String getCriteriaRovrCode() {
        return criteriaRovrCode;
    }

    /**
     * Permit Code
     * <p>
     * Lineage reference object : SFRROVR_ROVR_CODE, Lookup lineage reference object : stvrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.rovrCode")
    public void setCriteriaRovrCode(String criteriaRovrCode) {
        this.criteriaRovrCode = criteriaRovrCode;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaRovrCode(String criteriaRovrCode) {
        this.criteriaRovrCode = criteriaRovrCode;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRROVR_CAPC_OVER
     * 
     */
    @JsonProperty("criteria.capcOver")
    public String getCriteriaCapcOver() {
        return criteriaCapcOver;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRROVR_CAPC_OVER
     * 
     */
    @JsonProperty("criteria.capcOver")
    public void setCriteriaCapcOver(String criteriaCapcOver) {
        this.criteriaCapcOver = criteriaCapcOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaCapcOver(String criteriaCapcOver) {
        this.criteriaCapcOver = criteriaCapcOver;
        return this;
    }

    /**
     * Links
     * <p>
     * Lineage reference object : SFRROVR_LINK_OVER
     * 
     */
    @JsonProperty("criteria.linkOver")
    public String getCriteriaLinkOver() {
        return criteriaLinkOver;
    }

    /**
     * Links
     * <p>
     * Lineage reference object : SFRROVR_LINK_OVER
     * 
     */
    @JsonProperty("criteria.linkOver")
    public void setCriteriaLinkOver(String criteriaLinkOver) {
        this.criteriaLinkOver = criteriaLinkOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaLinkOver(String criteriaLinkOver) {
        this.criteriaLinkOver = criteriaLinkOver;
        return this;
    }

    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SFRROVR_MEXC_OVER
     * 
     */
    @JsonProperty("criteria.mexcOver")
    public String getCriteriaMexcOver() {
        return criteriaMexcOver;
    }

    /**
     * Mutual Exclusion
     * <p>
     * Lineage reference object : SFRROVR_MEXC_OVER
     * 
     */
    @JsonProperty("criteria.mexcOver")
    public void setCriteriaMexcOver(String criteriaMexcOver) {
        this.criteriaMexcOver = criteriaMexcOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaMexcOver(String criteriaMexcOver) {
        this.criteriaMexcOver = criteriaMexcOver;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRROVR_CAMP_OVER
     * 
     */
    @JsonProperty("criteria.campOver")
    public String getCriteriaCampOver() {
        return criteriaCampOver;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRROVR_CAMP_OVER
     * 
     */
    @JsonProperty("criteria.campOver")
    public void setCriteriaCampOver(String criteriaCampOver) {
        this.criteriaCampOver = criteriaCampOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaCampOver(String criteriaCampOver) {
        this.criteriaCampOver = criteriaCampOver;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRROVR_PROG_OVER
     * 
     */
    @JsonProperty("criteria.progOver")
    public String getCriteriaProgOver() {
        return criteriaProgOver;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRROVR_PROG_OVER
     * 
     */
    @JsonProperty("criteria.progOver")
    public void setCriteriaProgOver(String criteriaProgOver) {
        this.criteriaProgOver = criteriaProgOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaProgOver(String criteriaProgOver) {
        this.criteriaProgOver = criteriaProgOver;
        return this;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SFRROVR_APPR_OVER
     * 
     */
    @JsonProperty("criteria.apprOver")
    public String getCriteriaApprOver() {
        return criteriaApprOver;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SFRROVR_APPR_OVER
     * 
     */
    @JsonProperty("criteria.apprOver")
    public void setCriteriaApprOver(String criteriaApprOver) {
        this.criteriaApprOver = criteriaApprOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaApprOver(String criteriaApprOver) {
        this.criteriaApprOver = criteriaApprOver;
        return this;
    }

    /**
     * Co-requisite
     * <p>
     * Lineage reference object : SFRROVR_CORQ_OVER
     * 
     */
    @JsonProperty("criteria.corqOver")
    public String getCriteriaCorqOver() {
        return criteriaCorqOver;
    }

    /**
     * Co-requisite
     * <p>
     * Lineage reference object : SFRROVR_CORQ_OVER
     * 
     */
    @JsonProperty("criteria.corqOver")
    public void setCriteriaCorqOver(String criteriaCorqOver) {
        this.criteriaCorqOver = criteriaCorqOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaCorqOver(String criteriaCorqOver) {
        this.criteriaCorqOver = criteriaCorqOver;
        return this;
    }

    /**
     * Permit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.rovrDesc")
    public String getCriteriaRovrDesc() {
        return criteriaRovrDesc;
    }

    /**
     * Permit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.rovrDesc")
    public void setCriteriaRovrDesc(String criteriaRovrDesc) {
        this.criteriaRovrDesc = criteriaRovrDesc;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaRovrDesc(String criteriaRovrDesc) {
        this.criteriaRovrDesc = criteriaRovrDesc;
        return this;
    }

    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    public String getPreqOver() {
        return preqOver;
    }

    /**
     * Pre-requisite
     * <p>
     * Lineage reference object : SFRROVR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    public void setPreqOver(String preqOver) {
        this.preqOver = preqOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withPreqOver(String preqOver) {
        this.preqOver = preqOver;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRROVR_COLL_OVER
     * 
     */
    @JsonProperty("criteria.collOver")
    public String getCriteriaCollOver() {
        return criteriaCollOver;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRROVR_COLL_OVER
     * 
     */
    @JsonProperty("criteria.collOver")
    public void setCriteriaCollOver(String criteriaCollOver) {
        this.criteriaCollOver = criteriaCollOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaCollOver(String criteriaCollOver) {
        this.criteriaCollOver = criteriaCollOver;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRROVR_DEPT_OVER
     * 
     */
    @JsonProperty("criteria.deptOver")
    public String getCriteriaDeptOver() {
        return criteriaDeptOver;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRROVR_DEPT_OVER
     * 
     */
    @JsonProperty("criteria.deptOver")
    public void setCriteriaDeptOver(String criteriaDeptOver) {
        this.criteriaDeptOver = criteriaDeptOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaDeptOver(String criteriaDeptOver) {
        this.criteriaDeptOver = criteriaDeptOver;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public Object getXxxxxxxTermCodeDef() {
        return xxxxxxxTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public void setXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
    }

    public RegistrationPermitOverridesControl100PutRequest withXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRROVR_CLAS_OVER
     * 
     */
    @JsonProperty("criteria.clasOver")
    public String getCriteriaClasOver() {
        return criteriaClasOver;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRROVR_CLAS_OVER
     * 
     */
    @JsonProperty("criteria.clasOver")
    public void setCriteriaClasOver(String criteriaClasOver) {
        this.criteriaClasOver = criteriaClasOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaClasOver(String criteriaClasOver) {
        this.criteriaClasOver = criteriaClasOver;
        return this;
    }

    /**
     * Duplicates
     * <p>
     * Lineage reference object : SFRROVR_DUPL_OVER
     * 
     */
    @JsonProperty("criteria.duplOver")
    public String getCriteriaDuplOver() {
        return criteriaDuplOver;
    }

    /**
     * Duplicates
     * <p>
     * Lineage reference object : SFRROVR_DUPL_OVER
     * 
     */
    @JsonProperty("criteria.duplOver")
    public void setCriteriaDuplOver(String criteriaDuplOver) {
        this.criteriaDuplOver = criteriaDuplOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaDuplOver(String criteriaDuplOver) {
        this.criteriaDuplOver = criteriaDuplOver;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRROVR_LEVL_OVER
     * 
     */
    @JsonProperty("criteria.levlOver")
    public String getCriteriaLevlOver() {
        return criteriaLevlOver;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRROVR_LEVL_OVER
     * 
     */
    @JsonProperty("criteria.levlOver")
    public void setCriteriaLevlOver(String criteriaLevlOver) {
        this.criteriaLevlOver = criteriaLevlOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaLevlOver(String criteriaLevlOver) {
        this.criteriaLevlOver = criteriaLevlOver;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRROVR_MAJR_OVER
     * 
     */
    @JsonProperty("criteria.majrOver")
    public String getCriteriaMajrOver() {
        return criteriaMajrOver;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRROVR_MAJR_OVER
     * 
     */
    @JsonProperty("criteria.majrOver")
    public void setCriteriaMajrOver(String criteriaMajrOver) {
        this.criteriaMajrOver = criteriaMajrOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaMajrOver(String criteriaMajrOver) {
        this.criteriaMajrOver = criteriaMajrOver;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SFRROVR_TIME_OVER
     * 
     */
    @JsonProperty("criteria.timeOver")
    public String getCriteriaTimeOver() {
        return criteriaTimeOver;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SFRROVR_TIME_OVER
     * 
     */
    @JsonProperty("criteria.timeOver")
    public void setCriteriaTimeOver(String criteriaTimeOver) {
        this.criteriaTimeOver = criteriaTimeOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaTimeOver(String criteriaTimeOver) {
        this.criteriaTimeOver = criteriaTimeOver;
        return this;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRROVR_RPTH_OVER
     * 
     */
    @JsonProperty("criteria.rpthOver")
    public String getCriteriaRpthOver() {
        return criteriaRpthOver;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRROVR_RPTH_OVER
     * 
     */
    @JsonProperty("criteria.rpthOver")
    public void setCriteriaRpthOver(String criteriaRpthOver) {
        this.criteriaRpthOver = criteriaRpthOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaRpthOver(String criteriaRpthOver) {
        this.criteriaRpthOver = criteriaRpthOver;
        return this;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRROVR_REPT_OVER
     * 
     */
    @JsonProperty("criteria.reptOver")
    public String getCriteriaReptOver() {
        return criteriaReptOver;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRROVR_REPT_OVER
     * 
     */
    @JsonProperty("criteria.reptOver")
    public void setCriteriaReptOver(String criteriaReptOver) {
        this.criteriaReptOver = criteriaReptOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaReptOver(String criteriaReptOver) {
        this.criteriaReptOver = criteriaReptOver;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRROVR_ATTS_OVER
     * 
     */
    @JsonProperty("criteria.attsOver")
    public String getCriteriaAttsOver() {
        return criteriaAttsOver;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRROVR_ATTS_OVER
     * 
     */
    @JsonProperty("criteria.attsOver")
    public void setCriteriaAttsOver(String criteriaAttsOver) {
        this.criteriaAttsOver = criteriaAttsOver;
    }

    public RegistrationPermitOverridesControl100PutRequest withCriteriaAttsOver(String criteriaAttsOver) {
        this.criteriaAttsOver = criteriaAttsOver;
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

    public RegistrationPermitOverridesControl100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationPermitOverridesControl100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaChrtOver");
        sb.append('=');
        sb.append(((this.criteriaChrtOver == null)?"<null>":this.criteriaChrtOver));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaDegcOver");
        sb.append('=');
        sb.append(((this.criteriaDegcOver == null)?"<null>":this.criteriaDegcOver));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaPreqOver");
        sb.append('=');
        sb.append(((this.criteriaPreqOver == null)?"<null>":this.criteriaPreqOver));
        sb.append(',');
        sb.append("criteriaRovrCode");
        sb.append('=');
        sb.append(((this.criteriaRovrCode == null)?"<null>":this.criteriaRovrCode));
        sb.append(',');
        sb.append("criteriaCapcOver");
        sb.append('=');
        sb.append(((this.criteriaCapcOver == null)?"<null>":this.criteriaCapcOver));
        sb.append(',');
        sb.append("criteriaLinkOver");
        sb.append('=');
        sb.append(((this.criteriaLinkOver == null)?"<null>":this.criteriaLinkOver));
        sb.append(',');
        sb.append("criteriaMexcOver");
        sb.append('=');
        sb.append(((this.criteriaMexcOver == null)?"<null>":this.criteriaMexcOver));
        sb.append(',');
        sb.append("criteriaCampOver");
        sb.append('=');
        sb.append(((this.criteriaCampOver == null)?"<null>":this.criteriaCampOver));
        sb.append(',');
        sb.append("criteriaProgOver");
        sb.append('=');
        sb.append(((this.criteriaProgOver == null)?"<null>":this.criteriaProgOver));
        sb.append(',');
        sb.append("criteriaApprOver");
        sb.append('=');
        sb.append(((this.criteriaApprOver == null)?"<null>":this.criteriaApprOver));
        sb.append(',');
        sb.append("criteriaCorqOver");
        sb.append('=');
        sb.append(((this.criteriaCorqOver == null)?"<null>":this.criteriaCorqOver));
        sb.append(',');
        sb.append("criteriaRovrDesc");
        sb.append('=');
        sb.append(((this.criteriaRovrDesc == null)?"<null>":this.criteriaRovrDesc));
        sb.append(',');
        sb.append("preqOver");
        sb.append('=');
        sb.append(((this.preqOver == null)?"<null>":this.preqOver));
        sb.append(',');
        sb.append("criteriaCollOver");
        sb.append('=');
        sb.append(((this.criteriaCollOver == null)?"<null>":this.criteriaCollOver));
        sb.append(',');
        sb.append("criteriaDeptOver");
        sb.append('=');
        sb.append(((this.criteriaDeptOver == null)?"<null>":this.criteriaDeptOver));
        sb.append(',');
        sb.append("xxxxxxxTermCodeDef");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeDef == null)?"<null>":this.xxxxxxxTermCodeDef));
        sb.append(',');
        sb.append("criteriaClasOver");
        sb.append('=');
        sb.append(((this.criteriaClasOver == null)?"<null>":this.criteriaClasOver));
        sb.append(',');
        sb.append("criteriaDuplOver");
        sb.append('=');
        sb.append(((this.criteriaDuplOver == null)?"<null>":this.criteriaDuplOver));
        sb.append(',');
        sb.append("criteriaLevlOver");
        sb.append('=');
        sb.append(((this.criteriaLevlOver == null)?"<null>":this.criteriaLevlOver));
        sb.append(',');
        sb.append("criteriaMajrOver");
        sb.append('=');
        sb.append(((this.criteriaMajrOver == null)?"<null>":this.criteriaMajrOver));
        sb.append(',');
        sb.append("criteriaTimeOver");
        sb.append('=');
        sb.append(((this.criteriaTimeOver == null)?"<null>":this.criteriaTimeOver));
        sb.append(',');
        sb.append("criteriaRpthOver");
        sb.append('=');
        sb.append(((this.criteriaRpthOver == null)?"<null>":this.criteriaRpthOver));
        sb.append(',');
        sb.append("criteriaReptOver");
        sb.append('=');
        sb.append(((this.criteriaReptOver == null)?"<null>":this.criteriaReptOver));
        sb.append(',');
        sb.append("criteriaAttsOver");
        sb.append('=');
        sb.append(((this.criteriaAttsOver == null)?"<null>":this.criteriaAttsOver));
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
        result = ((result* 31)+((this.criteriaProgOver == null)? 0 :this.criteriaProgOver.hashCode()));
        result = ((result* 31)+((this.criteriaDeptOver == null)? 0 :this.criteriaDeptOver.hashCode()));
        result = ((result* 31)+((this.criteriaApprOver == null)? 0 :this.criteriaApprOver.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaCorqOver == null)? 0 :this.criteriaCorqOver.hashCode()));
        result = ((result* 31)+((this.criteriaCollOver == null)? 0 :this.criteriaCollOver.hashCode()));
        result = ((result* 31)+((this.criteriaClasOver == null)? 0 :this.criteriaClasOver.hashCode()));
        result = ((result* 31)+((this.criteriaRovrDesc == null)? 0 :this.criteriaRovrDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCapcOver == null)? 0 :this.criteriaCapcOver.hashCode()));
        result = ((result* 31)+((this.criteriaLinkOver == null)? 0 :this.criteriaLinkOver.hashCode()));
        result = ((result* 31)+((this.criteriaCampOver == null)? 0 :this.criteriaCampOver.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaDegcOver == null)? 0 :this.criteriaDegcOver.hashCode()));
        result = ((result* 31)+((this.criteriaRovrCode == null)? 0 :this.criteriaRovrCode.hashCode()));
        result = ((result* 31)+((this.preqOver == null)? 0 :this.preqOver.hashCode()));
        result = ((result* 31)+((this.criteriaReptOver == null)? 0 :this.criteriaReptOver.hashCode()));
        result = ((result* 31)+((this.criteriaMexcOver == null)? 0 :this.criteriaMexcOver.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeDef == null)? 0 :this.xxxxxxxTermCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaChrtOver == null)? 0 :this.criteriaChrtOver.hashCode()));
        result = ((result* 31)+((this.criteriaPreqOver == null)? 0 :this.criteriaPreqOver.hashCode()));
        result = ((result* 31)+((this.criteriaDuplOver == null)? 0 :this.criteriaDuplOver.hashCode()));
        result = ((result* 31)+((this.criteriaLevlOver == null)? 0 :this.criteriaLevlOver.hashCode()));
        result = ((result* 31)+((this.criteriaTimeOver == null)? 0 :this.criteriaTimeOver.hashCode()));
        result = ((result* 31)+((this.criteriaMajrOver == null)? 0 :this.criteriaMajrOver.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaRpthOver == null)? 0 :this.criteriaRpthOver.hashCode()));
        result = ((result* 31)+((this.criteriaAttsOver == null)? 0 :this.criteriaAttsOver.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationPermitOverridesControl100PutRequest) == false) {
            return false;
        }
        RegistrationPermitOverridesControl100PutRequest rhs = ((RegistrationPermitOverridesControl100PutRequest) other);
        return ((((((((((((((((((((((((((((this.criteriaProgOver == rhs.criteriaProgOver)||((this.criteriaProgOver!= null)&&this.criteriaProgOver.equals(rhs.criteriaProgOver)))&&((this.criteriaDeptOver == rhs.criteriaDeptOver)||((this.criteriaDeptOver!= null)&&this.criteriaDeptOver.equals(rhs.criteriaDeptOver))))&&((this.criteriaApprOver == rhs.criteriaApprOver)||((this.criteriaApprOver!= null)&&this.criteriaApprOver.equals(rhs.criteriaApprOver))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaCorqOver == rhs.criteriaCorqOver)||((this.criteriaCorqOver!= null)&&this.criteriaCorqOver.equals(rhs.criteriaCorqOver))))&&((this.criteriaCollOver == rhs.criteriaCollOver)||((this.criteriaCollOver!= null)&&this.criteriaCollOver.equals(rhs.criteriaCollOver))))&&((this.criteriaClasOver == rhs.criteriaClasOver)||((this.criteriaClasOver!= null)&&this.criteriaClasOver.equals(rhs.criteriaClasOver))))&&((this.criteriaRovrDesc == rhs.criteriaRovrDesc)||((this.criteriaRovrDesc!= null)&&this.criteriaRovrDesc.equals(rhs.criteriaRovrDesc))))&&((this.criteriaCapcOver == rhs.criteriaCapcOver)||((this.criteriaCapcOver!= null)&&this.criteriaCapcOver.equals(rhs.criteriaCapcOver))))&&((this.criteriaLinkOver == rhs.criteriaLinkOver)||((this.criteriaLinkOver!= null)&&this.criteriaLinkOver.equals(rhs.criteriaLinkOver))))&&((this.criteriaCampOver == rhs.criteriaCampOver)||((this.criteriaCampOver!= null)&&this.criteriaCampOver.equals(rhs.criteriaCampOver))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaDegcOver == rhs.criteriaDegcOver)||((this.criteriaDegcOver!= null)&&this.criteriaDegcOver.equals(rhs.criteriaDegcOver))))&&((this.criteriaRovrCode == rhs.criteriaRovrCode)||((this.criteriaRovrCode!= null)&&this.criteriaRovrCode.equals(rhs.criteriaRovrCode))))&&((this.preqOver == rhs.preqOver)||((this.preqOver!= null)&&this.preqOver.equals(rhs.preqOver))))&&((this.criteriaReptOver == rhs.criteriaReptOver)||((this.criteriaReptOver!= null)&&this.criteriaReptOver.equals(rhs.criteriaReptOver))))&&((this.criteriaMexcOver == rhs.criteriaMexcOver)||((this.criteriaMexcOver!= null)&&this.criteriaMexcOver.equals(rhs.criteriaMexcOver))))&&((this.xxxxxxxTermCodeDef == rhs.xxxxxxxTermCodeDef)||((this.xxxxxxxTermCodeDef!= null)&&this.xxxxxxxTermCodeDef.equals(rhs.xxxxxxxTermCodeDef))))&&((this.criteriaChrtOver == rhs.criteriaChrtOver)||((this.criteriaChrtOver!= null)&&this.criteriaChrtOver.equals(rhs.criteriaChrtOver))))&&((this.criteriaPreqOver == rhs.criteriaPreqOver)||((this.criteriaPreqOver!= null)&&this.criteriaPreqOver.equals(rhs.criteriaPreqOver))))&&((this.criteriaDuplOver == rhs.criteriaDuplOver)||((this.criteriaDuplOver!= null)&&this.criteriaDuplOver.equals(rhs.criteriaDuplOver))))&&((this.criteriaLevlOver == rhs.criteriaLevlOver)||((this.criteriaLevlOver!= null)&&this.criteriaLevlOver.equals(rhs.criteriaLevlOver))))&&((this.criteriaTimeOver == rhs.criteriaTimeOver)||((this.criteriaTimeOver!= null)&&this.criteriaTimeOver.equals(rhs.criteriaTimeOver))))&&((this.criteriaMajrOver == rhs.criteriaMajrOver)||((this.criteriaMajrOver!= null)&&this.criteriaMajrOver.equals(rhs.criteriaMajrOver))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaRpthOver == rhs.criteriaRpthOver)||((this.criteriaRpthOver!= null)&&this.criteriaRpthOver.equals(rhs.criteriaRpthOver))))&&((this.criteriaAttsOver == rhs.criteriaAttsOver)||((this.criteriaAttsOver!= null)&&this.criteriaAttsOver.equals(rhs.criteriaAttsOver))));
    }

}
