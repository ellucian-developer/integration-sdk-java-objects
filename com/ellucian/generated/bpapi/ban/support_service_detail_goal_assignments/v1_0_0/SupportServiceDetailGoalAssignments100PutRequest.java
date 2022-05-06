
package com.ellucian.generated.bpapi.ban.support_service_detail_goal_assignments.v1_0_0;

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
    "criteria.origCode",
    "serdtglSsrsCode",
    "seadetlSsgpCode",
    "criteria.goalCode",
    "criteria.estimateDate",
    "serdtglGoalCode",
    "origCode",
    "criteria.ssrsCode",
    "seadetlTermCodeEff",
    "criteria.actualDate",
    "ssgpCode",
    "treqCode",
    "seadetlId",
    "criteria.priorityNbr",
    "criteria.treqCode",
    "actualDate",
    "criteria.ssgpCode",
    "priorityNbr",
    "ssrsCode",
    "estimateDate"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailGoalAssignments100PutRequest {

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("serdtglSsrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String serdtglSsrsCode;
    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    @JsonPropertyDescription("Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp")
    private Object seadetlSsgpCode;
    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("criteria.goalCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal")
    private String criteriaGoalCode;
    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("criteria.estimateDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ESTIMATE_DATE")
    private Date criteriaEstimateDate;
    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("serdtglGoalCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal")
    private String serdtglGoalCode;
    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String criteriaSsrsCode;
    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm")
    private Object seadetlTermCodeEff;
    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("criteria.actualDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ACTUAL_DATE")
    private Date criteriaActualDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq")
    private String treqCode;
    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    @JsonPropertyDescription("Lineage reference object : seadetlId")
    private Object seadetlId;
    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("criteria.priorityNbr")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_PRIORITY_NBR")
    private Double criteriaPriorityNbr;
    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("criteria.treqCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq")
    private String criteriaTreqCode;
    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ACTUAL_DATE")
    private Date actualDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String criteriaSsgpCode;
    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_PRIORITY_NBR")
    private Double priorityNbr;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String ssrsCode;
    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ESTIMATE_DATE")
    private Date estimateDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("serdtglSsrsCode")
    public String getSerdtglSsrsCode() {
        return serdtglSsrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("serdtglSsrsCode")
    public void setSerdtglSsrsCode(String serdtglSsrsCode) {
        this.serdtglSsrsCode = serdtglSsrsCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSerdtglSsrsCode(String serdtglSsrsCode) {
        this.serdtglSsrsCode = serdtglSsrsCode;
        return this;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public Object getSeadetlSsgpCode() {
        return seadetlSsgpCode;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public void setSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("criteria.goalCode")
    public String getCriteriaGoalCode() {
        return criteriaGoalCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("criteria.goalCode")
    public void setCriteriaGoalCode(String criteriaGoalCode) {
        this.criteriaGoalCode = criteriaGoalCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaGoalCode(String criteriaGoalCode) {
        this.criteriaGoalCode = criteriaGoalCode;
        return this;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("criteria.estimateDate")
    public Date getCriteriaEstimateDate() {
        return criteriaEstimateDate;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("criteria.estimateDate")
    public void setCriteriaEstimateDate(Date criteriaEstimateDate) {
        this.criteriaEstimateDate = criteriaEstimateDate;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaEstimateDate(Date criteriaEstimateDate) {
        this.criteriaEstimateDate = criteriaEstimateDate;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("serdtglGoalCode")
    public String getSerdtglGoalCode() {
        return serdtglGoalCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * (Required)
     * 
     */
    @JsonProperty("serdtglGoalCode")
    public void setSerdtglGoalCode(String serdtglGoalCode) {
        this.serdtglGoalCode = serdtglGoalCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSerdtglGoalCode(String serdtglGoalCode) {
        this.serdtglGoalCode = serdtglGoalCode;
        return this;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    public String getCriteriaSsrsCode() {
        return criteriaSsrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    public void setCriteriaSsrsCode(String criteriaSsrsCode) {
        this.criteriaSsrsCode = criteriaSsrsCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaSsrsCode(String criteriaSsrsCode) {
        this.criteriaSsrsCode = criteriaSsrsCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public Object getSeadetlTermCodeEff() {
        return seadetlTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public void setSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
        return this;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("criteria.actualDate")
    public Date getCriteriaActualDate() {
        return criteriaActualDate;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("criteria.actualDate")
    public void setCriteriaActualDate(Date criteriaActualDate) {
        this.criteriaActualDate = criteriaActualDate;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaActualDate(Date criteriaActualDate) {
        this.criteriaActualDate = criteriaActualDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public Object getSeadetlId() {
        return seadetlId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public void setSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("criteria.priorityNbr")
    public Double getCriteriaPriorityNbr() {
        return criteriaPriorityNbr;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("criteria.priorityNbr")
    public void setCriteriaPriorityNbr(Double criteriaPriorityNbr) {
        this.criteriaPriorityNbr = criteriaPriorityNbr;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaPriorityNbr(Double criteriaPriorityNbr) {
        this.criteriaPriorityNbr = criteriaPriorityNbr;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("criteria.treqCode")
    public String getCriteriaTreqCode() {
        return criteriaTreqCode;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("criteria.treqCode")
    public void setCriteriaTreqCode(String criteriaTreqCode) {
        this.criteriaTreqCode = criteriaTreqCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaTreqCode(String criteriaTreqCode) {
        this.criteriaTreqCode = criteriaTreqCode;
        return this;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    public Date getActualDate() {
        return actualDate;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withActualDate(Date actualDate) {
        this.actualDate = actualDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public String getCriteriaSsgpCode() {
        return criteriaSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public void setCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    public Double getPriorityNbr() {
        return priorityNbr;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    public void setPriorityNbr(Double priorityNbr) {
        this.priorityNbr = priorityNbr;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withPriorityNbr(Double priorityNbr) {
        this.priorityNbr = priorityNbr;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public String getSsrsCode() {
        return ssrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public void setSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
        return this;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    public Date getEstimateDate() {
        return estimateDate;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public SupportServiceDetailGoalAssignments100PutRequest withEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
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

    public SupportServiceDetailGoalAssignments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailGoalAssignments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("serdtglSsrsCode");
        sb.append('=');
        sb.append(((this.serdtglSsrsCode == null)?"<null>":this.serdtglSsrsCode));
        sb.append(',');
        sb.append("seadetlSsgpCode");
        sb.append('=');
        sb.append(((this.seadetlSsgpCode == null)?"<null>":this.seadetlSsgpCode));
        sb.append(',');
        sb.append("criteriaGoalCode");
        sb.append('=');
        sb.append(((this.criteriaGoalCode == null)?"<null>":this.criteriaGoalCode));
        sb.append(',');
        sb.append("criteriaEstimateDate");
        sb.append('=');
        sb.append(((this.criteriaEstimateDate == null)?"<null>":this.criteriaEstimateDate));
        sb.append(',');
        sb.append("serdtglGoalCode");
        sb.append('=');
        sb.append(((this.serdtglGoalCode == null)?"<null>":this.serdtglGoalCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("criteriaSsrsCode");
        sb.append('=');
        sb.append(((this.criteriaSsrsCode == null)?"<null>":this.criteriaSsrsCode));
        sb.append(',');
        sb.append("seadetlTermCodeEff");
        sb.append('=');
        sb.append(((this.seadetlTermCodeEff == null)?"<null>":this.seadetlTermCodeEff));
        sb.append(',');
        sb.append("criteriaActualDate");
        sb.append('=');
        sb.append(((this.criteriaActualDate == null)?"<null>":this.criteriaActualDate));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("seadetlId");
        sb.append('=');
        sb.append(((this.seadetlId == null)?"<null>":this.seadetlId));
        sb.append(',');
        sb.append("criteriaPriorityNbr");
        sb.append('=');
        sb.append(((this.criteriaPriorityNbr == null)?"<null>":this.criteriaPriorityNbr));
        sb.append(',');
        sb.append("criteriaTreqCode");
        sb.append('=');
        sb.append(((this.criteriaTreqCode == null)?"<null>":this.criteriaTreqCode));
        sb.append(',');
        sb.append("actualDate");
        sb.append('=');
        sb.append(((this.actualDate == null)?"<null>":this.actualDate));
        sb.append(',');
        sb.append("criteriaSsgpCode");
        sb.append('=');
        sb.append(((this.criteriaSsgpCode == null)?"<null>":this.criteriaSsgpCode));
        sb.append(',');
        sb.append("priorityNbr");
        sb.append('=');
        sb.append(((this.priorityNbr == null)?"<null>":this.priorityNbr));
        sb.append(',');
        sb.append("ssrsCode");
        sb.append('=');
        sb.append(((this.ssrsCode == null)?"<null>":this.ssrsCode));
        sb.append(',');
        sb.append("estimateDate");
        sb.append('=');
        sb.append(((this.estimateDate == null)?"<null>":this.estimateDate));
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
        result = ((result* 31)+((this.criteriaEstimateDate == null)? 0 :this.criteriaEstimateDate.hashCode()));
        result = ((result* 31)+((this.serdtglSsrsCode == null)? 0 :this.serdtglSsrsCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.seadetlSsgpCode == null)? 0 :this.seadetlSsgpCode.hashCode()));
        result = ((result* 31)+((this.serdtglGoalCode == null)? 0 :this.serdtglGoalCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.criteriaGoalCode == null)? 0 :this.criteriaGoalCode.hashCode()));
        result = ((result* 31)+((this.criteriaPriorityNbr == null)? 0 :this.criteriaPriorityNbr.hashCode()));
        result = ((result* 31)+((this.criteriaSsrsCode == null)? 0 :this.criteriaSsrsCode.hashCode()));
        result = ((result* 31)+((this.seadetlTermCodeEff == null)? 0 :this.seadetlTermCodeEff.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.criteriaActualDate == null)? 0 :this.criteriaActualDate.hashCode()));
        result = ((result* 31)+((this.seadetlId == null)? 0 :this.seadetlId.hashCode()));
        result = ((result* 31)+((this.actualDate == null)? 0 :this.actualDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTreqCode == null)? 0 :this.criteriaTreqCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsgpCode == null)? 0 :this.criteriaSsgpCode.hashCode()));
        result = ((result* 31)+((this.priorityNbr == null)? 0 :this.priorityNbr.hashCode()));
        result = ((result* 31)+((this.ssrsCode == null)? 0 :this.ssrsCode.hashCode()));
        result = ((result* 31)+((this.estimateDate == null)? 0 :this.estimateDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailGoalAssignments100PutRequest) == false) {
            return false;
        }
        SupportServiceDetailGoalAssignments100PutRequest rhs = ((SupportServiceDetailGoalAssignments100PutRequest) other);
        return ((((((((((((((((((((((this.criteriaEstimateDate == rhs.criteriaEstimateDate)||((this.criteriaEstimateDate!= null)&&this.criteriaEstimateDate.equals(rhs.criteriaEstimateDate)))&&((this.serdtglSsrsCode == rhs.serdtglSsrsCode)||((this.serdtglSsrsCode!= null)&&this.serdtglSsrsCode.equals(rhs.serdtglSsrsCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.seadetlSsgpCode == rhs.seadetlSsgpCode)||((this.seadetlSsgpCode!= null)&&this.seadetlSsgpCode.equals(rhs.seadetlSsgpCode))))&&((this.serdtglGoalCode == rhs.serdtglGoalCode)||((this.serdtglGoalCode!= null)&&this.serdtglGoalCode.equals(rhs.serdtglGoalCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.criteriaGoalCode == rhs.criteriaGoalCode)||((this.criteriaGoalCode!= null)&&this.criteriaGoalCode.equals(rhs.criteriaGoalCode))))&&((this.criteriaPriorityNbr == rhs.criteriaPriorityNbr)||((this.criteriaPriorityNbr!= null)&&this.criteriaPriorityNbr.equals(rhs.criteriaPriorityNbr))))&&((this.criteriaSsrsCode == rhs.criteriaSsrsCode)||((this.criteriaSsrsCode!= null)&&this.criteriaSsrsCode.equals(rhs.criteriaSsrsCode))))&&((this.seadetlTermCodeEff == rhs.seadetlTermCodeEff)||((this.seadetlTermCodeEff!= null)&&this.seadetlTermCodeEff.equals(rhs.seadetlTermCodeEff))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.criteriaActualDate == rhs.criteriaActualDate)||((this.criteriaActualDate!= null)&&this.criteriaActualDate.equals(rhs.criteriaActualDate))))&&((this.seadetlId == rhs.seadetlId)||((this.seadetlId!= null)&&this.seadetlId.equals(rhs.seadetlId))))&&((this.actualDate == rhs.actualDate)||((this.actualDate!= null)&&this.actualDate.equals(rhs.actualDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTreqCode == rhs.criteriaTreqCode)||((this.criteriaTreqCode!= null)&&this.criteriaTreqCode.equals(rhs.criteriaTreqCode))))&&((this.criteriaSsgpCode == rhs.criteriaSsgpCode)||((this.criteriaSsgpCode!= null)&&this.criteriaSsgpCode.equals(rhs.criteriaSsgpCode))))&&((this.priorityNbr == rhs.priorityNbr)||((this.priorityNbr!= null)&&this.priorityNbr.equals(rhs.priorityNbr))))&&((this.ssrsCode == rhs.ssrsCode)||((this.ssrsCode!= null)&&this.ssrsCode.equals(rhs.ssrsCode))))&&((this.estimateDate == rhs.estimateDate)||((this.estimateDate!= null)&&this.estimateDate.equals(rhs.estimateDate))));
    }

}
